// Bytecode for: ext.mods.commons.gui.ConfigGS
// File: ext\mods\commons\gui\ConfigGS.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/commons/gui/ConfigGS.class
  Last modified 9 de jul de 2026; size 31662 bytes
  MD5 checksum a9c3cded9bbf912e913a96458be8eb06
  Compiled from "ConfigGS.java"
public class ext.mods.commons.gui.ConfigGS
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #11                         // ext/mods/commons/gui/ConfigGS
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 18, methods: 35, attributes: 4
Constant pool:
     #1 = Methodref          #2.#3        // java/lang/Object."<init>":()V
     #2 = Class              #4           // java/lang/Object
     #3 = NameAndType        #5:#6        // "<init>":()V
     #4 = Utf8               java/lang/Object
     #5 = Utf8               <init>
     #6 = Utf8               ()V
     #7 = Class              #8           // java/util/LinkedHashMap
     #8 = Utf8               java/util/LinkedHashMap
     #9 = Methodref          #7.#3        // java/util/LinkedHashMap."<init>":()V
    #10 = Fieldref           #11.#12      // ext/mods/commons/gui/ConfigGS.spawnEventTogglesMap:Ljava/util/Map;
    #11 = Class              #13          // ext/mods/commons/gui/ConfigGS
    #12 = NameAndType        #14:#15      // spawnEventTogglesMap:Ljava/util/Map;
    #13 = Utf8               ext/mods/commons/gui/ConfigGS
    #14 = Utf8               spawnEventTogglesMap
    #15 = Utf8               Ljava/util/Map;
    #16 = Fieldref           #11.#17      // ext/mods/commons/gui/ConfigGS.modTogglesMap:Ljava/util/Map;
    #17 = NameAndType        #18:#15      // modTogglesMap:Ljava/util/Map;
    #18 = Utf8               modTogglesMap
    #19 = Fieldref           #11.#20      // ext/mods/commons/gui/ConfigGS.parentFrame:Ljava/awt/Frame;
    #20 = NameAndType        #21:#22      // parentFrame:Ljava/awt/Frame;
    #21 = Utf8               parentFrame
    #22 = Utf8               Ljava/awt/Frame;
    #23 = Methodref          #11.#24      // ext/mods/commons/gui/ConfigGS.initialize:()V
    #24 = NameAndType        #25:#6       // initialize:()V
    #25 = Utf8               initialize
    #26 = Methodref          #27.#28      // ext/mods/commons/gui/ThemeManager.applyTheme:()V
    #27 = Class              #29          // ext/mods/commons/gui/ThemeManager
    #28 = NameAndType        #30:#6       // applyTheme:()V
    #29 = Utf8               ext/mods/commons/gui/ThemeManager
    #30 = Utf8               applyTheme
    #31 = InvokeDynamic      #0:#32       // #0:run:()Ljava/lang/Runnable;
    #32 = NameAndType        #33:#34      // run:()Ljava/lang/Runnable;
    #33 = Utf8               run
    #34 = Utf8               ()Ljava/lang/Runnable;
    #35 = Methodref          #36.#37      // javax/swing/SwingUtilities.invokeLater:(Ljava/lang/Runnable;)V
    #36 = Class              #38          // javax/swing/SwingUtilities
    #37 = NameAndType        #39:#40      // invokeLater:(Ljava/lang/Runnable;)V
    #38 = Utf8               javax/swing/SwingUtilities
    #39 = Utf8               invokeLater
    #40 = Utf8               (Ljava/lang/Runnable;)V
    #41 = Class              #42          // javax/swing/JFrame
    #42 = Utf8               javax/swing/JFrame
    #43 = String             #44          // Configurações do GameServer
    #44 = Utf8               Configurações do GameServer
    #45 = Methodref          #41.#46      // javax/swing/JFrame."<init>":(Ljava/lang/String;)V
    #46 = NameAndType        #5:#47       // "<init>":(Ljava/lang/String;)V
    #47 = Utf8               (Ljava/lang/String;)V
    #48 = Fieldref           #11.#49      // ext/mods/commons/gui/ConfigGS.configFrame:Ljavax/swing/JFrame;
    #49 = NameAndType        #50:#51      // configFrame:Ljavax/swing/JFrame;
    #50 = Utf8               configFrame
    #51 = Utf8               Ljavax/swing/JFrame;
    #52 = Methodref          #41.#53      // javax/swing/JFrame.setUndecorated:(Z)V
    #53 = NameAndType        #54:#55      // setUndecorated:(Z)V
    #54 = Utf8               setUndecorated
    #55 = Utf8               (Z)V
    #56 = Class              #57          // javax/swing/WindowConstants
    #57 = Utf8               javax/swing/WindowConstants
    #58 = Methodref          #41.#59      // javax/swing/JFrame.setDefaultCloseOperation:(I)V
    #59 = NameAndType        #60:#61      // setDefaultCloseOperation:(I)V
    #60 = Utf8               setDefaultCloseOperation
    #61 = Utf8               (I)V
    #62 = Methodref          #41.#63      // javax/swing/JFrame.setSize:(II)V
    #63 = NameAndType        #64:#65      // setSize:(II)V
    #64 = Utf8               setSize
    #65 = Utf8               (II)V
    #66 = Methodref          #41.#67      // javax/swing/JFrame.setResizable:(Z)V
    #67 = NameAndType        #68:#55      // setResizable:(Z)V
    #68 = Utf8               setResizable
    #69 = InvokeDynamic      #1:#70       // #1:run:(Lext/mods/commons/gui/ConfigGS;)Ljava/lang/Runnable;
    #70 = NameAndType        #33:#71      // run:(Lext/mods/commons/gui/ConfigGS;)Ljava/lang/Runnable;
    #71 = Utf8               (Lext/mods/commons/gui/ConfigGS;)Ljava/lang/Runnable;
    #72 = String             #73          // ./images/16x16.png
    #73 = Utf8               ./images/16x16.png
    #74 = Fieldref           #75.#76      // java/io/File.separator:Ljava/lang/String;
    #75 = Class              #77          // java/io/File
    #76 = NameAndType        #78:#79      // separator:Ljava/lang/String;
    #77 = Utf8               java/io/File
    #78 = Utf8               separator
    #79 = Utf8               Ljava/lang/String;
    #80 = InvokeDynamic      #2:#81       // #2:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    #81 = NameAndType        #82:#83      // makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    #82 = Utf8               makeConcatWithConstants
    #83 = Utf8               (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    #84 = Class              #85          // ext/mods/commons/gui/CustomTopPanel
    #85 = Utf8               ext/mods/commons/gui/CustomTopPanel
    #86 = Methodref          #84.#87      // ext/mods/commons/gui/CustomTopPanel."<init>":(Ljavax/swing/JFrame;Ljavax/swing/JMenuBar;Ljava/lang/Runnable;ZLjava/lang/String;)V
    #87 = NameAndType        #5:#88       // "<init>":(Ljavax/swing/JFrame;Ljavax/swing/JMenuBar;Ljava/lang/Runnable;ZLjava/lang/String;)V
    #88 = Utf8               (Ljavax/swing/JFrame;Ljavax/swing/JMenuBar;Ljava/lang/Runnable;ZLjava/lang/String;)V
    #89 = Fieldref           #11.#90      // ext/mods/commons/gui/ConfigGS.topPanel:Lext/mods/commons/gui/CustomTopPanel;
    #90 = NameAndType        #91:#92      // topPanel:Lext/mods/commons/gui/CustomTopPanel;
    #91 = Utf8               topPanel
    #92 = Utf8               Lext/mods/commons/gui/CustomTopPanel;
    #93 = Class              #94          // java/awt/BorderLayout
    #94 = Utf8               java/awt/BorderLayout
    #95 = String             #96          // North
    #96 = Utf8               North
    #97 = Methodref          #41.#98      // javax/swing/JFrame.add:(Ljava/awt/Component;Ljava/lang/Object;)V
    #98 = NameAndType        #99:#100     // add:(Ljava/awt/Component;Ljava/lang/Object;)V
    #99 = Utf8               add
   #100 = Utf8               (Ljava/awt/Component;Ljava/lang/Object;)V
   #101 = Class              #102         // javax/swing/JPanel
   #102 = Utf8               javax/swing/JPanel
   #103 = Class              #104         // java/awt/GridBagLayout
   #104 = Utf8               java/awt/GridBagLayout
   #105 = Methodref          #103.#3      // java/awt/GridBagLayout."<init>":()V
   #106 = Methodref          #101.#107    // javax/swing/JPanel."<init>":(Ljava/awt/LayoutManager;)V
   #107 = NameAndType        #5:#108      // "<init>":(Ljava/awt/LayoutManager;)V
   #108 = Utf8               (Ljava/awt/LayoutManager;)V
   #109 = Fieldref           #27.#110     // ext/mods/commons/gui/ThemeManager.COMPONENT_BACKGROUND:Ljava/awt/Color;
   #110 = NameAndType        #111:#112    // COMPONENT_BACKGROUND:Ljava/awt/Color;
   #111 = Utf8               COMPONENT_BACKGROUND
   #112 = Utf8               Ljava/awt/Color;
   #113 = Methodref          #101.#114    // javax/swing/JPanel.setBackground:(Ljava/awt/Color;)V
   #114 = NameAndType        #115:#116    // setBackground:(Ljava/awt/Color;)V
   #115 = Utf8               setBackground
   #116 = Utf8               (Ljava/awt/Color;)V
   #117 = Methodref          #118.#119    // javax/swing/BorderFactory.createEmptyBorder:(IIII)Ljavax/swing/border/Border;
   #118 = Class              #120         // javax/swing/BorderFactory
   #119 = NameAndType        #121:#122    // createEmptyBorder:(IIII)Ljavax/swing/border/Border;
   #120 = Utf8               javax/swing/BorderFactory
   #121 = Utf8               createEmptyBorder
   #122 = Utf8               (IIII)Ljavax/swing/border/Border;
   #123 = Methodref          #101.#124    // javax/swing/JPanel.setBorder:(Ljavax/swing/border/Border;)V
   #124 = NameAndType        #125:#126    // setBorder:(Ljavax/swing/border/Border;)V
   #125 = Utf8               setBorder
   #126 = Utf8               (Ljavax/swing/border/Border;)V
   #127 = Fieldref           #27.#128     // ext/mods/commons/gui/ThemeManager.BORDER_COLOR:Ljava/awt/Color;
   #128 = NameAndType        #129:#112    // BORDER_COLOR:Ljava/awt/Color;
   #129 = Utf8               BORDER_COLOR
   #130 = Methodref          #118.#131    // javax/swing/BorderFactory.createLineBorder:(Ljava/awt/Color;)Ljavax/swing/border/Border;
   #131 = NameAndType        #132:#133    // createLineBorder:(Ljava/awt/Color;)Ljavax/swing/border/Border;
   #132 = Utf8               createLineBorder
   #133 = Utf8               (Ljava/awt/Color;)Ljavax/swing/border/Border;
   #134 = Class              #135         // java/awt/Font
   #135 = Utf8               java/awt/Font
   #136 = String             #137         // Segoe UI
   #137 = Utf8               Segoe UI
   #138 = Methodref          #134.#139    // java/awt/Font."<init>":(Ljava/lang/String;II)V
   #139 = NameAndType        #5:#140      // "<init>":(Ljava/lang/String;II)V
   #140 = Utf8               (Ljava/lang/String;II)V
   #141 = Methodref          #11.#142     // ext/mods/commons/gui/ConfigGS.createModsPanel:(Ljavax/swing/border/Border;Ljava/awt/Font;)Ljavax/swing/JPanel;
   #142 = NameAndType        #143:#144    // createModsPanel:(Ljavax/swing/border/Border;Ljava/awt/Font;)Ljavax/swing/JPanel;
   #143 = Utf8               createModsPanel
   #144 = Utf8               (Ljavax/swing/border/Border;Ljava/awt/Font;)Ljavax/swing/JPanel;
   #145 = Class              #146         // java/awt/GridBagConstraints
   #146 = Utf8               java/awt/GridBagConstraints
   #147 = Methodref          #145.#3      // java/awt/GridBagConstraints."<init>":()V
   #148 = Fieldref           #145.#149    // java/awt/GridBagConstraints.gridx:I
   #149 = NameAndType        #150:#151    // gridx:I
   #150 = Utf8               gridx
   #151 = Utf8               I
   #152 = Fieldref           #145.#153    // java/awt/GridBagConstraints.gridy:I
   #153 = NameAndType        #154:#151    // gridy:I
   #154 = Utf8               gridy
   #155 = Fieldref           #145.#156    // java/awt/GridBagConstraints.weightx:D
   #156 = NameAndType        #157:#158    // weightx:D
   #157 = Utf8               weightx
   #158 = Utf8               D
   #159 = Fieldref           #145.#160    // java/awt/GridBagConstraints.weighty:D
   #160 = NameAndType        #161:#158    // weighty:D
   #161 = Utf8               weighty
   #162 = Fieldref           #145.#163    // java/awt/GridBagConstraints.fill:I
   #163 = NameAndType        #164:#151    // fill:I
   #164 = Utf8               fill
   #165 = Class              #166         // java/awt/Insets
   #166 = Utf8               java/awt/Insets
   #167 = Methodref          #165.#168    // java/awt/Insets."<init>":(IIII)V
   #168 = NameAndType        #5:#169      // "<init>":(IIII)V
   #169 = Utf8               (IIII)V
   #170 = Fieldref           #145.#171    // java/awt/GridBagConstraints.insets:Ljava/awt/Insets;
   #171 = NameAndType        #172:#173    // insets:Ljava/awt/Insets;
   #172 = Utf8               insets
   #173 = Utf8               Ljava/awt/Insets;
   #174 = Methodref          #101.#98     // javax/swing/JPanel.add:(Ljava/awt/Component;Ljava/lang/Object;)V
   #175 = Methodref          #11.#176     // ext/mods/commons/gui/ConfigGS.createSpawnsPanel:(Ljavax/swing/border/Border;Ljava/awt/Font;)Ljavax/swing/JPanel;
   #176 = NameAndType        #177:#144    // createSpawnsPanel:(Ljavax/swing/border/Border;Ljava/awt/Font;)Ljavax/swing/JPanel;
   #177 = Utf8               createSpawnsPanel
   #178 = Fieldref           #145.#179    // java/awt/GridBagConstraints.anchor:I
   #179 = NameAndType        #180:#151    // anchor:I
   #180 = Utf8               anchor
   #181 = String             #182         // Center
   #182 = Utf8               Center
   #183 = Methodref          #11.#184     // ext/mods/commons/gui/ConfigGS.loadCurrentConfigStates:()V
   #184 = NameAndType        #185:#6      // loadCurrentConfigStates:()V
   #185 = Utf8               loadCurrentConfigStates
   #186 = Methodref          #11.#187     // ext/mods/commons/gui/ConfigGS.addToggleSwitchListeners:()V
   #187 = NameAndType        #188:#6      // addToggleSwitchListeners:()V
   #188 = Utf8               addToggleSwitchListeners
   #189 = Methodref          #11.#190     // ext/mods/commons/gui/ConfigGS.loadIcons:()V
   #190 = NameAndType        #191:#6      // loadIcons:()V
   #191 = Utf8               loadIcons
   #192 = Methodref          #41.#193     // javax/swing/JFrame.setLocationRelativeTo:(Ljava/awt/Component;)V
   #193 = NameAndType        #194:#195    // setLocationRelativeTo:(Ljava/awt/Component;)V
   #194 = Utf8               setLocationRelativeTo
   #195 = Utf8               (Ljava/awt/Component;)V
   #196 = Methodref          #101.#197    // javax/swing/JPanel.setOpaque:(Z)V
   #197 = NameAndType        #198:#55     // setOpaque:(Z)V
   #198 = Utf8               setOpaque
   #199 = String             #200         //  Custom Mods
   #200 = Utf8                Custom Mods
   #201 = Class              #202         // javax/swing/border/TitledBorder
   #202 = Utf8               javax/swing/border/TitledBorder
   #203 = Fieldref           #27.#204     // ext/mods/commons/gui/ThemeManager.TEXT_COLOR:Ljava/awt/Color;
   #204 = NameAndType        #205:#112    // TEXT_COLOR:Ljava/awt/Color;
   #205 = Utf8               TEXT_COLOR
   #206 = Methodref          #207.#208    // java/awt/Color.brighter:()Ljava/awt/Color;
   #207 = Class              #209         // java/awt/Color
   #208 = NameAndType        #210:#211    // brighter:()Ljava/awt/Color;
   #209 = Utf8               java/awt/Color
   #210 = Utf8               brighter
   #211 = Utf8               ()Ljava/awt/Color;
   #212 = Methodref          #118.#213    // javax/swing/BorderFactory.createTitledBorder:(Ljavax/swing/border/Border;Ljava/lang/String;IILjava/awt/Font;Ljava/awt/Color;)Ljavax/swing/border/TitledBorder;
   #213 = NameAndType        #214:#215    // createTitledBorder:(Ljavax/swing/border/Border;Ljava/lang/String;IILjava/awt/Font;Ljava/awt/Color;)Ljavax/swing/border/TitledBorder;
   #214 = Utf8               createTitledBorder
   #215 = Utf8               (Ljavax/swing/border/Border;Ljava/lang/String;IILjava/awt/Font;Ljava/awt/Color;)Ljavax/swing/border/TitledBorder;
   #216 = Methodref          #118.#217    // javax/swing/BorderFactory.createCompoundBorder:(Ljavax/swing/border/Border;Ljavax/swing/border/Border;)Ljavax/swing/border/CompoundBorder;
   #217 = NameAndType        #218:#219    // createCompoundBorder:(Ljavax/swing/border/Border;Ljavax/swing/border/Border;)Ljavax/swing/border/CompoundBorder;
   #218 = Utf8               createCompoundBorder
   #219 = Utf8               (Ljavax/swing/border/Border;Ljavax/swing/border/Border;)Ljavax/swing/border/CompoundBorder;
   #220 = Class              #221         // java/awt/GridLayout
   #221 = Utf8               java/awt/GridLayout
   #222 = Methodref          #220.#168    // java/awt/GridLayout."<init>":(IIII)V
   #223 = Fieldref           #11.#224     // ext/mods/commons/gui/ConfigGS.MODS_CONFIG_MAP:Ljava/util/List;
   #224 = NameAndType        #225:#226    // MODS_CONFIG_MAP:Ljava/util/List;
   #225 = Utf8               MODS_CONFIG_MAP
   #226 = Utf8               Ljava/util/List;
   #227 = InterfaceMethodref #228.#229    // java/util/List.size:()I
   #228 = Class              #230         // java/util/List
   #229 = NameAndType        #231:#232    // size:()I
   #230 = Utf8               java/util/List
   #231 = Utf8               size
   #232 = Utf8               ()I
   #233 = Double             2.0d
   #235 = Methodref          #236.#237    // java/lang/Math.ceil:(D)D
   #236 = Class              #238         // java/lang/Math
   #237 = NameAndType        #239:#240    // ceil:(D)D
   #238 = Utf8               java/lang/Math
   #239 = Utf8               ceil
   #240 = Utf8               (D)D
   #241 = InterfaceMethodref #228.#242    // java/util/List.get:(I)Ljava/lang/Object;
   #242 = NameAndType        #243:#244    // get:(I)Ljava/lang/Object;
   #243 = Utf8               get
   #244 = Utf8               (I)Ljava/lang/Object;
   #245 = Class              #246         // ext/mods/commons/gui/ConfigGS$ModFileConfig
   #246 = Utf8               ext/mods/commons/gui/ConfigGS$ModFileConfig
   #247 = Methodref          #245.#248    // ext/mods/commons/gui/ConfigGS$ModFileConfig.label:()Ljava/lang/String;
   #248 = NameAndType        #249:#250    // label:()Ljava/lang/String;
   #249 = Utf8               label
   #250 = Utf8               ()Ljava/lang/String;
   #251 = Methodref          #11.#252     // ext/mods/commons/gui/ConfigGS.createLabel:(Ljava/lang/String;)Ljavax/swing/JLabel;
   #252 = NameAndType        #253:#254    // createLabel:(Ljava/lang/String;)Ljavax/swing/JLabel;
   #253 = Utf8               createLabel
   #254 = Utf8               (Ljava/lang/String;)Ljavax/swing/JLabel;
   #255 = Class              #256         // ext/mods/commons/gui/CustomToggleSwitch
   #256 = Utf8               ext/mods/commons/gui/CustomToggleSwitch
   #257 = Methodref          #255.#258    // ext/mods/commons/gui/CustomToggleSwitch."<init>":(Z)V
   #258 = NameAndType        #5:#55       // "<init>":(Z)V
   #259 = InterfaceMethodref #260.#261    // java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #260 = Class              #262         // java/util/Map
   #261 = NameAndType        #263:#264    // put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #262 = Utf8               java/util/Map
   #263 = Utf8               put
   #264 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #265 = Methodref          #93.#3       // java/awt/BorderLayout."<init>":()V
   #266 = String             #267         // West
   #267 = Utf8               West
   #268 = String             #269         // East
   #269 = Utf8               East
   #270 = Methodref          #101.#271    // javax/swing/JPanel.add:(Ljava/awt/Component;)Ljava/awt/Component;
   #271 = NameAndType        #99:#272     // add:(Ljava/awt/Component;)Ljava/awt/Component;
   #272 = Utf8               (Ljava/awt/Component;)Ljava/awt/Component;
   #273 = Double             0.5d
   #275 = Class              #276         // javax/swing/JSeparator
   #276 = Utf8               javax/swing/JSeparator
   #277 = Methodref          #275.#278    // javax/swing/JSeparator."<init>":(I)V
   #278 = NameAndType        #5:#61       // "<init>":(I)V
   #279 = Methodref          #207.#280    // java/awt/Color.darker:()Ljava/awt/Color;
   #280 = NameAndType        #281:#211    // darker:()Ljava/awt/Color;
   #281 = Utf8               darker
   #282 = Methodref          #275.#283    // javax/swing/JSeparator.setForeground:(Ljava/awt/Color;)V
   #283 = NameAndType        #284:#116    // setForeground:(Ljava/awt/Color;)V
   #284 = Utf8               setForeground
   #285 = Fieldref           #145.#286    // java/awt/GridBagConstraints.gridwidth:I
   #286 = NameAndType        #287:#151    // gridwidth:I
   #287 = Utf8               gridwidth
   #288 = Methodref          #289.#290    // javax/swing/Box.createVerticalGlue:()Ljava/awt/Component;
   #289 = Class              #291         // javax/swing/Box
   #290 = NameAndType        #292:#293    // createVerticalGlue:()Ljava/awt/Component;
   #291 = Utf8               javax/swing/Box
   #292 = Utf8               createVerticalGlue
   #293 = Utf8               ()Ljava/awt/Component;
   #294 = String             #295         //  Custom Spawns
   #295 = Utf8                Custom Spawns
   #296 = Fieldref           #11.#297     // ext/mods/commons/gui/ConfigGS.tglNoLoadSpawns:Lext/mods/commons/gui/CustomToggleSwitch;
   #297 = NameAndType        #298:#299    // tglNoLoadSpawns:Lext/mods/commons/gui/CustomToggleSwitch;
   #298 = Utf8               tglNoLoadSpawns
   #299 = Utf8               Lext/mods/commons/gui/CustomToggleSwitch;
   #300 = String             #301         // No Load Spawns
   #301 = Utf8               No Load Spawns
   #302 = Fieldref           #11.#303     // ext/mods/commons/gui/ConfigGS.SPAWN_EVENTS_CONFIG:Ljava/util/List;
   #303 = NameAndType        #304:#226    // SPAWN_EVENTS_CONFIG:Ljava/util/List;
   #304 = Utf8               SPAWN_EVENTS_CONFIG
   #305 = InterfaceMethodref #228.#306    // java/util/List.iterator:()Ljava/util/Iterator;
   #306 = NameAndType        #307:#308    // iterator:()Ljava/util/Iterator;
   #307 = Utf8               iterator
   #308 = Utf8               ()Ljava/util/Iterator;
   #309 = InterfaceMethodref #310.#311    // java/util/Iterator.hasNext:()Z
   #310 = Class              #312         // java/util/Iterator
   #311 = NameAndType        #313:#314    // hasNext:()Z
   #312 = Utf8               java/util/Iterator
   #313 = Utf8               hasNext
   #314 = Utf8               ()Z
   #315 = InterfaceMethodref #310.#316    // java/util/Iterator.next:()Ljava/lang/Object;
   #316 = NameAndType        #317:#318    // next:()Ljava/lang/Object;
   #317 = Utf8               next
   #318 = Utf8               ()Ljava/lang/Object;
   #319 = Class              #320         // ext/mods/commons/gui/ConfigGS$SpawnEventConfig
   #320 = Utf8               ext/mods/commons/gui/ConfigGS$SpawnEventConfig
   #321 = Fieldref           #319.#322    // ext/mods/commons/gui/ConfigGS$SpawnEventConfig.label:Ljava/lang/String;
   #322 = NameAndType        #249:#79     // label:Ljava/lang/String;
   #323 = Class              #324         // javax/swing/JLabel
   #324 = Utf8               javax/swing/JLabel
   #325 = Methodref          #323.#46     // javax/swing/JLabel."<init>":(Ljava/lang/String;)V
   #326 = Methodref          #323.#327    // javax/swing/JLabel.setFont:(Ljava/awt/Font;)V
   #327 = NameAndType        #328:#329    // setFont:(Ljava/awt/Font;)V
   #328 = Utf8               setFont
   #329 = Utf8               (Ljava/awt/Font;)V
   #330 = Methodref          #323.#283    // javax/swing/JLabel.setForeground:(Ljava/awt/Color;)V
   #331 = InvokeDynamic      #3:#70       // #3:run:(Lext/mods/commons/gui/ConfigGS;)Ljava/lang/Runnable;
   #332 = Methodref          #11.#333     // ext/mods/commons/gui/ConfigGS.readNoSpawnsProperty:()Z
   #333 = NameAndType        #334:#314    // readNoSpawnsProperty:()Z
   #334 = Utf8               readNoSpawnsProperty
   #335 = Methodref          #255.#336    // ext/mods/commons/gui/CustomToggleSwitch.setOn:(ZZ)V
   #336 = NameAndType        #337:#338    // setOn:(ZZ)V
   #337 = Utf8               setOn
   #338 = Utf8               (ZZ)V
   #339 = Methodref          #11.#340     // ext/mods/commons/gui/ConfigGS.readSpawnEvents:()Ljava/util/Set;
   #340 = NameAndType        #341:#342    // readSpawnEvents:()Ljava/util/Set;
   #341 = Utf8               readSpawnEvents
   #342 = Utf8               ()Ljava/util/Set;
   #343 = InterfaceMethodref #260.#344    // java/util/Map.entrySet:()Ljava/util/Set;
   #344 = NameAndType        #345:#342    // entrySet:()Ljava/util/Set;
   #345 = Utf8               entrySet
   #346 = InterfaceMethodref #347.#306    // java/util/Set.iterator:()Ljava/util/Iterator;
   #347 = Class              #348         // java/util/Set
   #348 = Utf8               java/util/Set
   #349 = Class              #350         // java/util/Map$Entry
   #350 = Utf8               java/util/Map$Entry
   #351 = InterfaceMethodref #349.#352    // java/util/Map$Entry.getKey:()Ljava/lang/Object;
   #352 = NameAndType        #353:#318    // getKey:()Ljava/lang/Object;
   #353 = Utf8               getKey
   #354 = Fieldref           #319.#355    // ext/mods/commons/gui/ConfigGS$SpawnEventConfig.eventName:Ljava/lang/String;
   #355 = NameAndType        #356:#79     // eventName:Ljava/lang/String;
   #356 = Utf8               eventName
   #357 = InterfaceMethodref #347.#358    // java/util/Set.contains:(Ljava/lang/Object;)Z
   #358 = NameAndType        #359:#360    // contains:(Ljava/lang/Object;)Z
   #359 = Utf8               contains
   #360 = Utf8               (Ljava/lang/Object;)Z
   #361 = InterfaceMethodref #349.#362    // java/util/Map$Entry.getValue:()Ljava/lang/Object;
   #362 = NameAndType        #363:#318    // getValue:()Ljava/lang/Object;
   #363 = Utf8               getValue
   #364 = Methodref          #11.#365     // ext/mods/commons/gui/ConfigGS.updateDependentTogglesState:(Z)V
   #365 = NameAndType        #366:#55     // updateDependentTogglesState:(Z)V
   #366 = Utf8               updateDependentTogglesState
   #367 = Fieldref           #245.#368    // ext/mods/commons/gui/ConfigGS$ModFileConfig.path:Ljava/nio/file/Path;
   #368 = NameAndType        #369:#370    // path:Ljava/nio/file/Path;
   #369 = Utf8               path
   #370 = Utf8               Ljava/nio/file/Path;
   #371 = InterfaceMethodref #372.#373    // java/nio/file/Path.toString:()Ljava/lang/String;
   #372 = Class              #374         // java/nio/file/Path
   #373 = NameAndType        #375:#250    // toString:()Ljava/lang/String;
   #374 = Utf8               java/nio/file/Path
   #375 = Utf8               toString
   #376 = String             #377         // .properties
   #377 = Utf8               .properties
   #378 = Methodref          #379.#380    // java/lang/String.endsWith:(Ljava/lang/String;)Z
   #379 = Class              #381         // java/lang/String
   #380 = NameAndType        #382:#383    // endsWith:(Ljava/lang/String;)Z
   #381 = Utf8               java/lang/String
   #382 = Utf8               endsWith
   #383 = Utf8               (Ljava/lang/String;)Z
   #384 = Fieldref           #245.#385    // ext/mods/commons/gui/ConfigGS$ModFileConfig.key:Ljava/lang/String;
   #385 = NameAndType        #386:#79     // key:Ljava/lang/String;
   #386 = Utf8               key
   #387 = Methodref          #11.#388     // ext/mods/commons/gui/ConfigGS.readConfigValueFromText:(Ljava/nio/file/Path;Ljava/lang/String;Z)Ljava/lang/String;
   #388 = NameAndType        #389:#390    // readConfigValueFromText:(Ljava/nio/file/Path;Ljava/lang/String;Z)Ljava/lang/String;
   #389 = Utf8               readConfigValueFromText
   #390 = Utf8               (Ljava/nio/file/Path;Ljava/lang/String;Z)Ljava/lang/String;
   #391 = String             #392         // false
   #392 = Utf8               false
   #393 = Methodref          #394.#395    // java/util/Objects.toString:(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;
   #394 = Class              #396         // java/util/Objects
   #395 = NameAndType        #375:#397    // toString:(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;
   #396 = Utf8               java/util/Objects
   #397 = Utf8               (Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;
   #398 = String             #399         // true
   #399 = Utf8               true
   #400 = Methodref          #379.#401    // java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
   #401 = NameAndType        #402:#383    // equalsIgnoreCase:(Ljava/lang/String;)Z
   #402 = Utf8               equalsIgnoreCase
   #403 = InvokeDynamic      #4:#404      // #4:actionPerformed:(Lext/mods/commons/gui/ConfigGS;)Ljava/awt/event/ActionListener;
   #404 = NameAndType        #405:#406    // actionPerformed:(Lext/mods/commons/gui/ConfigGS;)Ljava/awt/event/ActionListener;
   #405 = Utf8               actionPerformed
   #406 = Utf8               (Lext/mods/commons/gui/ConfigGS;)Ljava/awt/event/ActionListener;
   #407 = Methodref          #255.#408    // ext/mods/commons/gui/CustomToggleSwitch.addActionListener:(Ljava/awt/event/ActionListener;)V
   #408 = NameAndType        #409:#410    // addActionListener:(Ljava/awt/event/ActionListener;)V
   #409 = Utf8               addActionListener
   #410 = Utf8               (Ljava/awt/event/ActionListener;)V
   #411 = InvokeDynamic      #5:#412      // #5:actionPerformed:(Lext/mods/commons/gui/ConfigGS;Ljava/util/Map$Entry;)Ljava/awt/event/ActionListener;
   #412 = NameAndType        #405:#413    // actionPerformed:(Lext/mods/commons/gui/ConfigGS;Ljava/util/Map$Entry;)Ljava/awt/event/ActionListener;
   #413 = Utf8               (Lext/mods/commons/gui/ConfigGS;Ljava/util/Map$Entry;)Ljava/awt/event/ActionListener;
   #414 = InvokeDynamic      #6:#415      // #6:actionPerformed:(Lext/mods/commons/gui/ConfigGS;Lext/mods/commons/gui/CustomToggleSwitch;Lext/mods/commons/gui/ConfigGS$ModFileConfig;)Ljava/awt/event/ActionListener;
   #415 = NameAndType        #405:#416    // actionPerformed:(Lext/mods/commons/gui/ConfigGS;Lext/mods/commons/gui/CustomToggleSwitch;Lext/mods/commons/gui/ConfigGS$ModFileConfig;)Ljava/awt/event/ActionListener;
   #416 = Utf8               (Lext/mods/commons/gui/ConfigGS;Lext/mods/commons/gui/CustomToggleSwitch;Lext/mods/commons/gui/ConfigGS$ModFileConfig;)Ljava/awt/event/ActionListener;
   #417 = Class              #418         // java/nio/file/LinkOption
   #418 = Utf8               java/nio/file/LinkOption
   #419 = Methodref          #420.#421    // java/nio/file/Files.exists:(Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Z
   #420 = Class              #422         // java/nio/file/Files
   #421 = NameAndType        #423:#424    // exists:(Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Z
   #422 = Utf8               java/nio/file/Files
   #423 = Utf8               exists
   #424 = Utf8               (Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Z
   #425 = Fieldref           #426.#427    // java/lang/System.err:Ljava/io/PrintStream;
   #426 = Class              #428         // java/lang/System
   #427 = NameAndType        #429:#430    // err:Ljava/io/PrintStream;
   #428 = Utf8               java/lang/System
   #429 = Utf8               err
   #430 = Utf8               Ljava/io/PrintStream;
   #431 = Methodref          #379.#432    // java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
   #432 = NameAndType        #433:#434    // valueOf:(Ljava/lang/Object;)Ljava/lang/String;
   #433 = Utf8               valueOf
   #434 = Utf8               (Ljava/lang/Object;)Ljava/lang/String;
   #435 = InvokeDynamic      #7:#436      // #7:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #436 = NameAndType        #82:#437     // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #437 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
   #438 = Methodref          #439.#440    // java/io/PrintStream.println:(Ljava/lang/String;)V
   #439 = Class              #441         // java/io/PrintStream
   #440 = NameAndType        #442:#47     // println:(Ljava/lang/String;)V
   #441 = Utf8               java/io/PrintStream
   #442 = Utf8               println
   #443 = Methodref          #444.#445    // java/util/regex/Pattern.quote:(Ljava/lang/String;)Ljava/lang/String;
   #444 = Class              #446         // java/util/regex/Pattern
   #445 = NameAndType        #447:#437    // quote:(Ljava/lang/String;)Ljava/lang/String;
   #446 = Utf8               java/util/regex/Pattern
   #447 = Utf8               quote
   #448 = InvokeDynamic      #8:#436      // #8:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #449 = InvokeDynamic      #9:#436      // #9:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #450 = Methodref          #444.#451    // java/util/regex/Pattern.compile:(Ljava/lang/String;I)Ljava/util/regex/Pattern;
   #451 = NameAndType        #452:#453    // compile:(Ljava/lang/String;I)Ljava/util/regex/Pattern;
   #452 = Utf8               compile
   #453 = Utf8               (Ljava/lang/String;I)Ljava/util/regex/Pattern;
   #454 = Fieldref           #455.#456    // java/nio/charset/StandardCharsets.UTF_8:Ljava/nio/charset/Charset;
   #455 = Class              #457         // java/nio/charset/StandardCharsets
   #456 = NameAndType        #458:#459    // UTF_8:Ljava/nio/charset/Charset;
   #457 = Utf8               java/nio/charset/StandardCharsets
   #458 = Utf8               UTF_8
   #459 = Utf8               Ljava/nio/charset/Charset;
   #460 = Methodref          #420.#461    // java/nio/file/Files.readString:(Ljava/nio/file/Path;Ljava/nio/charset/Charset;)Ljava/lang/String;
   #461 = NameAndType        #462:#463    // readString:(Ljava/nio/file/Path;Ljava/nio/charset/Charset;)Ljava/lang/String;
   #462 = Utf8               readString
   #463 = Utf8               (Ljava/nio/file/Path;Ljava/nio/charset/Charset;)Ljava/lang/String;
   #464 = Methodref          #444.#465    // java/util/regex/Pattern.matcher:(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
   #465 = NameAndType        #466:#467    // matcher:(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
   #466 = Utf8               matcher
   #467 = Utf8               (Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
   #468 = Methodref          #469.#470    // java/util/regex/Matcher.find:()Z
   #469 = Class              #471         // java/util/regex/Matcher
   #470 = NameAndType        #472:#314    // find:()Z
   #471 = Utf8               java/util/regex/Matcher
   #472 = Utf8               find
   #473 = Methodref          #469.#474    // java/util/regex/Matcher.group:(I)Ljava/lang/String;
   #474 = NameAndType        #475:#476    // group:(I)Ljava/lang/String;
   #475 = Utf8               group
   #476 = Utf8               (I)Ljava/lang/String;
   #477 = Methodref          #379.#478    // java/lang/String.trim:()Ljava/lang/String;
   #478 = NameAndType        #479:#250    // trim:()Ljava/lang/String;
   #479 = Utf8               trim
   #480 = InvokeDynamic      #10:#81      // #10:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #481 = Class              #482         // java/lang/Exception
   #482 = Utf8               java/lang/Exception
   #483 = InterfaceMethodref #372.#484    // java/nio/file/Path.getFileName:()Ljava/nio/file/Path;
   #484 = NameAndType        #485:#486    // getFileName:()Ljava/nio/file/Path;
   #485 = Utf8               getFileName
   #486 = Utf8               ()Ljava/nio/file/Path;
   #487 = Methodref          #481.#488    // java/lang/Exception.getMessage:()Ljava/lang/String;
   #488 = NameAndType        #489:#250    // getMessage:()Ljava/lang/String;
   #489 = Utf8               getMessage
   #490 = InvokeDynamic      #11:#81      // #11:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #491 = InvokeDynamic      #12:#436     // #12:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #492 = Class              #493         // java/util/ArrayList
   #493 = Utf8               java/util/ArrayList
   #494 = Methodref          #492.#3      // java/util/ArrayList."<init>":()V
   #495 = InvokeDynamic      #13:#436     // #13:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #496 = InvokeDynamic      #14:#436     // #14:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #497 = Methodref          #420.#498    // java/nio/file/Files.readAllLines:(Ljava/nio/file/Path;Ljava/nio/charset/Charset;)Ljava/util/List;
   #498 = NameAndType        #499:#500    // readAllLines:(Ljava/nio/file/Path;Ljava/nio/charset/Charset;)Ljava/util/List;
   #499 = Utf8               readAllLines
   #500 = Utf8               (Ljava/nio/file/Path;Ljava/nio/charset/Charset;)Ljava/util/List;
   #501 = InvokeDynamic      #15:#502     // #15:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #502 = NameAndType        #82:#503     // makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #503 = Utf8               (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #504 = Methodref          #379.#505    // java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
   #505 = NameAndType        #506:#507    // replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
   #506 = Utf8               replace
   #507 = Utf8               (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
   #508 = InvokeDynamic      #16:#81      // #16:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #509 = InterfaceMethodref #228.#510    // java/util/List.add:(Ljava/lang/Object;)Z
   #510 = NameAndType        #99:#360     // add:(Ljava/lang/Object;)Z
   #511 = InterfaceMethodref #228.#512    // java/util/List.isEmpty:()Z
   #512 = NameAndType        #513:#314    // isEmpty:()Z
   #513 = Utf8               isEmpty
   #514 = Methodref          #379.#512    // java/lang/String.isEmpty:()Z
   #515 = String             #516         //
   #516 = Utf8
   #517 = InvokeDynamic      #17:#81      // #17:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #518 = InvokeDynamic      #18:#81      // #18:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #519 = Methodref          #469.#520    // java/util/regex/Matcher.quoteReplacement:(Ljava/lang/String;)Ljava/lang/String;
   #520 = NameAndType        #521:#437    // quoteReplacement:(Ljava/lang/String;)Ljava/lang/String;
   #521 = Utf8               quoteReplacement
   #522 = InvokeDynamic      #19:#436     // #19:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #523 = Methodref          #469.#524    // java/util/regex/Matcher.replaceAll:(Ljava/lang/String;)Ljava/lang/String;
   #524 = NameAndType        #525:#437    // replaceAll:(Ljava/lang/String;)Ljava/lang/String;
   #525 = Utf8               replaceAll
   #526 = Class              #527         // java/nio/file/OpenOption
   #527 = Utf8               java/nio/file/OpenOption
   #528 = Fieldref           #529.#530    // java/nio/file/StandardOpenOption.CREATE:Ljava/nio/file/StandardOpenOption;
   #529 = Class              #531         // java/nio/file/StandardOpenOption
   #530 = NameAndType        #532:#533    // CREATE:Ljava/nio/file/StandardOpenOption;
   #531 = Utf8               java/nio/file/StandardOpenOption
   #532 = Utf8               CREATE
   #533 = Utf8               Ljava/nio/file/StandardOpenOption;
   #534 = Fieldref           #529.#535    // java/nio/file/StandardOpenOption.TRUNCATE_EXISTING:Ljava/nio/file/StandardOpenOption;
   #535 = NameAndType        #536:#533    // TRUNCATE_EXISTING:Ljava/nio/file/StandardOpenOption;
   #536 = Utf8               TRUNCATE_EXISTING
   #537 = Methodref          #420.#538    // java/nio/file/Files.writeString:(Ljava/nio/file/Path;Ljava/lang/CharSequence;Ljava/nio/charset/Charset;[Ljava/nio/file/OpenOption;)Ljava/nio/file/Path;
   #538 = NameAndType        #539:#540    // writeString:(Ljava/nio/file/Path;Ljava/lang/CharSequence;Ljava/nio/charset/Charset;[Ljava/nio/file/OpenOption;)Ljava/nio/file/Path;
   #539 = Utf8               writeString
   #540 = Utf8               (Ljava/nio/file/Path;Ljava/lang/CharSequence;Ljava/nio/charset/Charset;[Ljava/nio/file/OpenOption;)Ljava/nio/file/Path;
   #541 = Fieldref           #426.#542    // java/lang/System.out:Ljava/io/PrintStream;
   #542 = NameAndType        #543:#430    // out:Ljava/io/PrintStream;
   #543 = Utf8               out
   #544 = InvokeDynamic      #20:#81      // #20:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #545 = Methodref          #420.#546    // java/nio/file/Files.write:(Ljava/nio/file/Path;Ljava/lang/Iterable;Ljava/nio/charset/Charset;[Ljava/nio/file/OpenOption;)Ljava/nio/file/Path;
   #546 = NameAndType        #547:#548    // write:(Ljava/nio/file/Path;Ljava/lang/Iterable;Ljava/nio/charset/Charset;[Ljava/nio/file/OpenOption;)Ljava/nio/file/Path;
   #547 = Utf8               write
   #548 = Utf8               (Ljava/nio/file/Path;Ljava/lang/Iterable;Ljava/nio/charset/Charset;[Ljava/nio/file/OpenOption;)Ljava/nio/file/Path;
   #549 = InvokeDynamic      #21:#436     // #21:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #550 = InvokeDynamic      #22:#81      // #22:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #551 = InvokeDynamic      #23:#81      // #23:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #552 = Methodref          #481.#553    // java/lang/Exception.printStackTrace:()V
   #553 = NameAndType        #554:#6      // printStackTrace:()V
   #554 = Utf8               printStackTrace
   #555 = Fieldref           #11.#556     // ext/mods/commons/gui/ConfigGS.SERVER_PROPERTIES_PATH:Ljava/nio/file/Path;
   #556 = NameAndType        #557:#370    // SERVER_PROPERTIES_PATH:Ljava/nio/file/Path;
   #557 = Utf8               SERVER_PROPERTIES_PATH
   #558 = String             #559         // NoSpawns
   #559 = Utf8               NoSpawns
   #560 = Methodref          #11.#561     // ext/mods/commons/gui/ConfigGS.readProperty:(Ljava/nio/file/Path;Ljava/lang/String;)Ljava/lang/String;
   #561 = NameAndType        #562:#563    // readProperty:(Ljava/nio/file/Path;Ljava/lang/String;)Ljava/lang/String;
   #562 = Utf8               readProperty
   #563 = Utf8               (Ljava/nio/file/Path;Ljava/lang/String;)Ljava/lang/String;
   #564 = Fieldref           #11.#565     // ext/mods/commons/gui/ConfigGS.NPCS_PROPERTIES_PATH:Ljava/nio/file/Path;
   #565 = NameAndType        #566:#370    // NPCS_PROPERTIES_PATH:Ljava/nio/file/Path;
   #566 = Utf8               NPCS_PROPERTIES_PATH
   #567 = String             #568         // SpawnEvents
   #568 = Utf8               SpawnEvents
   #569 = Class              #570         // java/util/HashSet
   #570 = Utf8               java/util/HashSet
   #571 = Methodref          #569.#3      // java/util/HashSet."<init>":()V
   #572 = String             #573         // \\s*;\\s*
   #573 = Utf8               \\s*;\\s*
   #574 = Methodref          #379.#575    // java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
   #575 = NameAndType        #576:#577    // split:(Ljava/lang/String;)[Ljava/lang/String;
   #576 = Utf8               split
   #577 = Utf8               (Ljava/lang/String;)[Ljava/lang/String;
   #578 = Methodref          #579.#580    // java/util/Arrays.stream:([Ljava/lang/Object;)Ljava/util/stream/Stream;
   #579 = Class              #581         // java/util/Arrays
   #580 = NameAndType        #582:#583    // stream:([Ljava/lang/Object;)Ljava/util/stream/Stream;
   #581 = Utf8               java/util/Arrays
   #582 = Utf8               stream
   #583 = Utf8               ([Ljava/lang/Object;)Ljava/util/stream/Stream;
   #584 = InvokeDynamic      #24:#585     // #24:apply:()Ljava/util/function/Function;
   #585 = NameAndType        #586:#587    // apply:()Ljava/util/function/Function;
   #586 = Utf8               apply
   #587 = Utf8               ()Ljava/util/function/Function;
   #588 = InterfaceMethodref #589.#590    // java/util/stream/Stream.map:(Ljava/util/function/Function;)Ljava/util/stream/Stream;
   #589 = Class              #591         // java/util/stream/Stream
   #590 = NameAndType        #592:#593    // map:(Ljava/util/function/Function;)Ljava/util/stream/Stream;
   #591 = Utf8               java/util/stream/Stream
   #592 = Utf8               map
   #593 = Utf8               (Ljava/util/function/Function;)Ljava/util/stream/Stream;
   #594 = InvokeDynamic      #25:#595     // #25:test:()Ljava/util/function/Predicate;
   #595 = NameAndType        #596:#597    // test:()Ljava/util/function/Predicate;
   #596 = Utf8               test
   #597 = Utf8               ()Ljava/util/function/Predicate;
   #598 = InterfaceMethodref #589.#599    // java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
   #599 = NameAndType        #600:#601    // filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
   #600 = Utf8               filter
   #601 = Utf8               (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
   #602 = InvokeDynamic      #26:#585     // #26:apply:()Ljava/util/function/Function;
   #603 = Methodref          #604.#605    // java/util/stream/Collectors.toSet:()Ljava/util/stream/Collector;
   #604 = Class              #606         // java/util/stream/Collectors
   #605 = NameAndType        #607:#608    // toSet:()Ljava/util/stream/Collector;
   #606 = Utf8               java/util/stream/Collectors
   #607 = Utf8               toSet
   #608 = Utf8               ()Ljava/util/stream/Collector;
   #609 = InterfaceMethodref #589.#610    // java/util/stream/Stream.collect:(Ljava/util/stream/Collector;)Ljava/lang/Object;
   #610 = NameAndType        #611:#612    // collect:(Ljava/util/stream/Collector;)Ljava/lang/Object;
   #611 = Utf8               collect
   #612 = Utf8               (Ljava/util/stream/Collector;)Ljava/lang/Object;
   #613 = Class              #614         // java/util/Properties
   #614 = Utf8               java/util/Properties
   #615 = Methodref          #613.#3      // java/util/Properties."<init>":()V
   #616 = Methodref          #420.#617    // java/nio/file/Files.newInputStream:(Ljava/nio/file/Path;[Ljava/nio/file/OpenOption;)Ljava/io/InputStream;
   #617 = NameAndType        #618:#619    // newInputStream:(Ljava/nio/file/Path;[Ljava/nio/file/OpenOption;)Ljava/io/InputStream;
   #618 = Utf8               newInputStream
   #619 = Utf8               (Ljava/nio/file/Path;[Ljava/nio/file/OpenOption;)Ljava/io/InputStream;
   #620 = Methodref          #613.#621    // java/util/Properties.load:(Ljava/io/InputStream;)V
   #621 = NameAndType        #622:#623    // load:(Ljava/io/InputStream;)V
   #622 = Utf8               load
   #623 = Utf8               (Ljava/io/InputStream;)V
   #624 = Methodref          #613.#625    // java/util/Properties.getProperty:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #625 = NameAndType        #626:#83     // getProperty:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #626 = Utf8               getProperty
   #627 = Methodref          #628.#629    // java/io/InputStream.close:()V
   #628 = Class              #630         // java/io/InputStream
   #629 = NameAndType        #631:#6      // close:()V
   #630 = Utf8               java/io/InputStream
   #631 = Utf8               close
   #632 = Class              #633         // java/lang/Throwable
   #633 = Utf8               java/lang/Throwable
   #634 = Methodref          #632.#635    // java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
   #635 = NameAndType        #636:#637    // addSuppressed:(Ljava/lang/Throwable;)V
   #636 = Utf8               addSuppressed
   #637 = Utf8               (Ljava/lang/Throwable;)V
   #638 = InvokeDynamic      #27:#502     // #27:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #639 = InterfaceMethodref #260.#512    // java/util/Map.isEmpty:()Z
   #640 = InterfaceMethodref #260.#641    // java/util/Map.values:()Ljava/util/Collection;
   #641 = NameAndType        #642:#643    // values:()Ljava/util/Collection;
   #642 = Utf8               values
   #643 = Utf8               ()Ljava/util/Collection;
   #644 = InterfaceMethodref #645.#306    // java/util/Collection.iterator:()Ljava/util/Iterator;
   #645 = Class              #646         // java/util/Collection
   #646 = Utf8               java/util/Collection
   #647 = Methodref          #255.#648    // ext/mods/commons/gui/CustomToggleSwitch.isEnabled:()Z
   #648 = NameAndType        #649:#314    // isEnabled:()Z
   #649 = Utf8               isEnabled
   #650 = Methodref          #255.#651    // ext/mods/commons/gui/CustomToggleSwitch.setEnabled:(Z)V
   #651 = NameAndType        #652:#55     // setEnabled:(Z)V
   #652 = Utf8               setEnabled
   #653 = Methodref          #379.#654    // java/lang/String.equals:(Ljava/lang/Object;)Z
   #654 = NameAndType        #655:#360    // equals:(Ljava/lang/Object;)Z
   #655 = Utf8               equals
   #656 = Methodref          #11.#657     // ext/mods/commons/gui/ConfigGS.saveNoSpawnsState:(Z)V
   #657 = NameAndType        #658:#55     // saveNoSpawnsState:(Z)V
   #658 = Utf8               saveNoSpawnsState
   #659 = Methodref          #11.#660     // ext/mods/commons/gui/ConfigGS.saveSpawnEventsState:()V
   #660 = NameAndType        #661:#6      // saveSpawnEventsState:()V
   #661 = Utf8               saveSpawnEventsState
   #662 = String             #663         // True
   #663 = Utf8               True
   #664 = String             #665         // False
   #665 = Utf8               False
   #666 = InvokeDynamic      #28:#436     // #28:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #667 = Methodref          #11.#668     // ext/mods/commons/gui/ConfigGS.writeProperty:(Ljava/nio/file/Path;Ljava/lang/String;Ljava/lang/String;)Z
   #668 = NameAndType        #669:#670    // writeProperty:(Ljava/nio/file/Path;Ljava/lang/String;Ljava/lang/String;)Z
   #669 = Utf8               writeProperty
   #670 = Utf8               (Ljava/nio/file/Path;Ljava/lang/String;Ljava/lang/String;)Z
   #671 = InvokeDynamic      #29:#436     // #29:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #672 = String             #673         // Erro de Gravação
   #673 = Utf8               Erro de Gravação
   #674 = Class              #675         // javax/swing/JOptionPane
   #675 = Utf8               javax/swing/JOptionPane
   #676 = Methodref          #674.#677    // javax/swing/JOptionPane.showMessageDialog:(Ljava/awt/Component;Ljava/lang/Object;Ljava/lang/String;I)V
   #677 = NameAndType        #678:#679    // showMessageDialog:(Ljava/awt/Component;Ljava/lang/Object;Ljava/lang/String;I)V
   #678 = Utf8               showMessageDialog
   #679 = Utf8               (Ljava/awt/Component;Ljava/lang/Object;Ljava/lang/String;I)V
   #680 = InterfaceMethodref #372.#681    // java/nio/file/Path.getParent:()Ljava/nio/file/Path;
   #681 = NameAndType        #682:#486    // getParent:()Ljava/nio/file/Path;
   #682 = Utf8               getParent
   #683 = Class              #684         // java/nio/file/attribute/FileAttribute
   #684 = Utf8               java/nio/file/attribute/FileAttribute
   #685 = Methodref          #420.#686    // java/nio/file/Files.createDirectories:(Ljava/nio/file/Path;[Ljava/nio/file/attribute/FileAttribute;)Ljava/nio/file/Path;
   #686 = NameAndType        #687:#688    // createDirectories:(Ljava/nio/file/Path;[Ljava/nio/file/attribute/FileAttribute;)Ljava/nio/file/Path;
   #687 = Utf8               createDirectories
   #688 = Utf8               (Ljava/nio/file/Path;[Ljava/nio/file/attribute/FileAttribute;)Ljava/nio/file/Path;
   #689 = InvokeDynamic      #30:#436     // #30:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #690 = InvokeDynamic      #31:#436     // #31:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #691 = Methodref          #469.#692    // java/util/regex/Matcher.matches:()Z
   #692 = NameAndType        #693:#314    // matches:()Z
   #693 = Utf8               matches
   #694 = String             #695         // =
   #695 = Utf8               =
   #696 = InvokeDynamic      #32:#502     // #32:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #697 = InvokeDynamic      #33:#81      // #33:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #698 = InvokeDynamic      #34:#81      // #34:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #699 = InterfaceMethodref #228.#700    // java/util/List.stream:()Ljava/util/stream/Stream;
   #700 = NameAndType        #582:#701    // stream:()Ljava/util/stream/Stream;
   #701 = Utf8               ()Ljava/util/stream/Stream;
   #702 = InvokeDynamic      #35:#585     // #35:apply:()Ljava/util/function/Function;
   #703 = Fieldref           #11.#704     // ext/mods/commons/gui/ConfigGS.FIXED_EVENTS_ORDERED:Ljava/util/List;
   #704 = NameAndType        #705:#226    // FIXED_EVENTS_ORDERED:Ljava/util/List;
   #705 = Utf8               FIXED_EVENTS_ORDERED
   #706 = InterfaceMethodref #347.#700    // java/util/Set.stream:()Ljava/util/stream/Stream;
   #707 = InvokeDynamic      #36:#595     // #36:test:()Ljava/util/function/Predicate;
   #708 = InvokeDynamic      #37:#585     // #37:apply:()Ljava/util/function/Function;
   #709 = InterfaceMethodref #710.#711    // java/util/Comparator.naturalOrder:()Ljava/util/Comparator;
   #710 = Class              #712         // java/util/Comparator
   #711 = NameAndType        #713:#714    // naturalOrder:()Ljava/util/Comparator;
   #712 = Utf8               java/util/Comparator
   #713 = Utf8               naturalOrder
   #714 = Utf8               ()Ljava/util/Comparator;
   #715 = InterfaceMethodref #589.#716    // java/util/stream/Stream.sorted:(Ljava/util/Comparator;)Ljava/util/stream/Stream;
   #716 = NameAndType        #717:#718    // sorted:(Ljava/util/Comparator;)Ljava/util/stream/Stream;
   #717 = Utf8               sorted
   #718 = Utf8               (Ljava/util/Comparator;)Ljava/util/stream/Stream;
   #719 = Methodref          #604.#720    // java/util/stream/Collectors.toList:()Ljava/util/stream/Collector;
   #720 = NameAndType        #721:#608    // toList:()Ljava/util/stream/Collector;
   #721 = Utf8               toList
   #722 = InvokeDynamic      #38:#595     // #38:test:()Ljava/util/function/Predicate;
   #723 = InvokeDynamic      #39:#724     // #39:test:(Ljava/util/Set;)Ljava/util/function/Predicate;
   #724 = NameAndType        #596:#725    // test:(Ljava/util/Set;)Ljava/util/function/Predicate;
   #725 = Utf8               (Ljava/util/Set;)Ljava/util/function/Predicate;
   #726 = InterfaceMethodref #228.#727    // java/util/List.addAll:(Ljava/util/Collection;)Z
   #727 = NameAndType        #728:#729    // addAll:(Ljava/util/Collection;)Z
   #728 = Utf8               addAll
   #729 = Utf8               (Ljava/util/Collection;)Z
   #730 = Methodref          #394.#731    // java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
   #731 = NameAndType        #732:#733    // requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
   #732 = Utf8               requireNonNull
   #733 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
   #734 = InvokeDynamic      #40:#735     // #40:accept:(Ljava/util/List;)Ljava/util/function/Consumer;
   #735 = NameAndType        #736:#737    // accept:(Ljava/util/List;)Ljava/util/function/Consumer;
   #736 = Utf8               accept
   #737 = Utf8               (Ljava/util/List;)Ljava/util/function/Consumer;
   #738 = InterfaceMethodref #589.#739    // java/util/stream/Stream.forEach:(Ljava/util/function/Consumer;)V
   #739 = NameAndType        #740:#741    // forEach:(Ljava/util/function/Consumer;)V
   #740 = Utf8               forEach
   #741 = Utf8               (Ljava/util/function/Consumer;)V
   #742 = InvokeDynamic      #41:#595     // #41:test:()Ljava/util/function/Predicate;
   #743 = String             #744         // ;
   #744 = Utf8               ;
   #745 = Methodref          #604.#746    // java/util/stream/Collectors.joining:(Ljava/lang/CharSequence;)Ljava/util/stream/Collector;
   #746 = NameAndType        #747:#748    // joining:(Ljava/lang/CharSequence;)Ljava/util/stream/Collector;
   #747 = Utf8               joining
   #748 = Utf8               (Ljava/lang/CharSequence;)Ljava/util/stream/Collector;
   #749 = InvokeDynamic      #42:#436     // #42:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #750 = InvokeDynamic      #43:#436     // #43:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #751 = Methodref          #752.#753    // ext/mods/commons/gui/GuiUtils.loadIcons:()Ljava/util/List;
   #752 = Class              #754         // ext/mods/commons/gui/GuiUtils
   #753 = NameAndType        #191:#755    // loadIcons:()Ljava/util/List;
   #754 = Utf8               ext/mods/commons/gui/GuiUtils
   #755 = Utf8               ()Ljava/util/List;
   #756 = Methodref          #41.#757     // javax/swing/JFrame.setIconImages:(Ljava/util/List;)V
   #757 = NameAndType        #758:#759    // setIconImages:(Ljava/util/List;)V
   #758 = Utf8               setIconImages
   #759 = Utf8               (Ljava/util/List;)V
   #760 = InvokeDynamic      #44:#436     // #44:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #761 = Class              #762         // javax/swing/ImageIcon
   #762 = Utf8               javax/swing/ImageIcon
   #763 = Methodref          #761.#46     // javax/swing/ImageIcon."<init>":(Ljava/lang/String;)V
   #764 = Methodref          #761.#765    // javax/swing/ImageIcon.getImage:()Ljava/awt/Image;
   #765 = NameAndType        #766:#767    // getImage:()Ljava/awt/Image;
   #766 = Utf8               getImage
   #767 = Utf8               ()Ljava/awt/Image;
   #768 = InvokeDynamic      #45:#81      // #45:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #769 = InvokeDynamic      #46:#436     // #46:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #770 = String             #771         // ./images/32x32.png
   #771 = Utf8               ./images/32x32.png
   #772 = InvokeDynamic      #47:#436     // #47:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #773 = Methodref          #75.#46      // java/io/File."<init>":(Ljava/lang/String;)V
   #774 = Methodref          #75.#775     // java/io/File.exists:()Z
   #775 = NameAndType        #423:#314    // exists:()Z
   #776 = InvokeDynamic      #48:#436     // #48:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #777 = Methodref          #778.#779    // javax/xml/parsers/DocumentBuilderFactory.newInstance:()Ljavax/xml/parsers/DocumentBuilderFactory;
   #778 = Class              #780         // javax/xml/parsers/DocumentBuilderFactory
   #779 = NameAndType        #781:#782    // newInstance:()Ljavax/xml/parsers/DocumentBuilderFactory;
   #780 = Utf8               javax/xml/parsers/DocumentBuilderFactory
   #781 = Utf8               newInstance
   #782 = Utf8               ()Ljavax/xml/parsers/DocumentBuilderFactory;
   #783 = Methodref          #778.#784    // javax/xml/parsers/DocumentBuilderFactory.setIgnoringComments:(Z)V
   #784 = NameAndType        #785:#55     // setIgnoringComments:(Z)V
   #785 = Utf8               setIgnoringComments
   #786 = Methodref          #778.#787    // javax/xml/parsers/DocumentBuilderFactory.setNamespaceAware:(Z)V
   #787 = NameAndType        #788:#55     // setNamespaceAware:(Z)V
   #788 = Utf8               setNamespaceAware
   #789 = Methodref          #778.#790    // javax/xml/parsers/DocumentBuilderFactory.newDocumentBuilder:()Ljavax/xml/parsers/DocumentBuilder;
   #790 = NameAndType        #791:#792    // newDocumentBuilder:()Ljavax/xml/parsers/DocumentBuilder;
   #791 = Utf8               newDocumentBuilder
   #792 = Utf8               ()Ljavax/xml/parsers/DocumentBuilder;
   #793 = Methodref          #794.#795    // javax/xml/parsers/DocumentBuilder.parse:(Ljava/io/File;)Lorg/w3c/dom/Document;
   #794 = Class              #796         // javax/xml/parsers/DocumentBuilder
   #795 = NameAndType        #797:#798    // parse:(Ljava/io/File;)Lorg/w3c/dom/Document;
   #796 = Utf8               javax/xml/parsers/DocumentBuilder
   #797 = Utf8               parse
   #798 = Utf8               (Ljava/io/File;)Lorg/w3c/dom/Document;
   #799 = InterfaceMethodref #800.#801    // org/w3c/dom/Document.getDocumentElement:()Lorg/w3c/dom/Element;
   #800 = Class              #802         // org/w3c/dom/Document
   #801 = NameAndType        #803:#804    // getDocumentElement:()Lorg/w3c/dom/Element;
   #802 = Utf8               org/w3c/dom/Document
   #803 = Utf8               getDocumentElement
   #804 = Utf8               ()Lorg/w3c/dom/Element;
   #805 = String             #806         // Arquivo XML sem nó raiz válido.
   #806 = Utf8               Arquivo XML sem nó raiz válido.
   #807 = String             #808         // enabled
   #808 = Utf8               enabled
   #809 = InterfaceMethodref #810.#811    // org/w3c/dom/Element.setAttribute:(Ljava/lang/String;Ljava/lang/String;)V
   #810 = Class              #812         // org/w3c/dom/Element
   #811 = NameAndType        #813:#814    // setAttribute:(Ljava/lang/String;Ljava/lang/String;)V
   #812 = Utf8               org/w3c/dom/Element
   #813 = Utf8               setAttribute
   #814 = Utf8               (Ljava/lang/String;Ljava/lang/String;)V
   #815 = Methodref          #816.#817    // javax/xml/transform/TransformerFactory.newInstance:()Ljavax/xml/transform/TransformerFactory;
   #816 = Class              #818         // javax/xml/transform/TransformerFactory
   #817 = NameAndType        #781:#819    // newInstance:()Ljavax/xml/transform/TransformerFactory;
   #818 = Utf8               javax/xml/transform/TransformerFactory
   #819 = Utf8               ()Ljavax/xml/transform/TransformerFactory;
   #820 = Methodref          #816.#821    // javax/xml/transform/TransformerFactory.newTransformer:()Ljavax/xml/transform/Transformer;
   #821 = NameAndType        #822:#823    // newTransformer:()Ljavax/xml/transform/Transformer;
   #822 = Utf8               newTransformer
   #823 = Utf8               ()Ljavax/xml/transform/Transformer;
   #824 = Class              #825         // javax/xml/transform/OutputKeys
   #825 = Utf8               javax/xml/transform/OutputKeys
   #826 = String             #827         // indent
   #827 = Utf8               indent
   #828 = String             #829         // yes
   #829 = Utf8               yes
   #830 = Methodref          #831.#832    // javax/xml/transform/Transformer.setOutputProperty:(Ljava/lang/String;Ljava/lang/String;)V
   #831 = Class              #833         // javax/xml/transform/Transformer
   #832 = NameAndType        #834:#814    // setOutputProperty:(Ljava/lang/String;Ljava/lang/String;)V
   #833 = Utf8               javax/xml/transform/Transformer
   #834 = Utf8               setOutputProperty
   #835 = String             #836         // {http://xml.apache.org/xslt}indent-amount
   #836 = Utf8               {http://xml.apache.org/xslt}indent-amount
   #837 = String             #838         // 4
   #838 = Utf8               4
   #839 = Class              #840         // javax/xml/transform/dom/DOMSource
   #840 = Utf8               javax/xml/transform/dom/DOMSource
   #841 = Methodref          #839.#842    // javax/xml/transform/dom/DOMSource."<init>":(Lorg/w3c/dom/Node;)V
   #842 = NameAndType        #5:#843      // "<init>":(Lorg/w3c/dom/Node;)V
   #843 = Utf8               (Lorg/w3c/dom/Node;)V
   #844 = Class              #845         // javax/xml/transform/stream/StreamResult
   #845 = Utf8               javax/xml/transform/stream/StreamResult
   #846 = Methodref          #844.#847    // javax/xml/transform/stream/StreamResult."<init>":(Ljava/io/File;)V
   #847 = NameAndType        #5:#848      // "<init>":(Ljava/io/File;)V
   #848 = Utf8               (Ljava/io/File;)V
   #849 = Methodref          #831.#850    // javax/xml/transform/Transformer.transform:(Ljavax/xml/transform/Source;Ljavax/xml/transform/Result;)V
   #850 = NameAndType        #851:#852    // transform:(Ljavax/xml/transform/Source;Ljavax/xml/transform/Result;)V
   #851 = Utf8               transform
   #852 = Utf8               (Ljavax/xml/transform/Source;Ljavax/xml/transform/Result;)V
   #853 = InvokeDynamic      #49:#81      // #49:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #854 = InvokeDynamic      #50:#436     // #50:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #855 = InterfaceMethodref #228.#358    // java/util/List.contains:(Ljava/lang/Object;)Z
   #856 = Methodref          #255.#857    // ext/mods/commons/gui/CustomToggleSwitch.isOn:()Z
   #857 = NameAndType        #858:#314    // isOn:()Z
   #858 = Utf8               isOn
   #859 = Methodref          #379.#860    // java/lang/String.toLowerCase:()Ljava/lang/String;
   #860 = NameAndType        #861:#250    // toLowerCase:()Ljava/lang/String;
   #861 = Utf8               toLowerCase
   #862 = String             #863         // ON
   #863 = Utf8               ON
   #864 = String             #865         // OFF
   #865 = Utf8               OFF
   #866 = InvokeDynamic      #51:#81      // #51:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #867 = String             #868         // Capsule Box
   #868 = Utf8               Capsule Box
   #869 = Methodref          #11.#870     // ext/mods/commons/gui/ConfigGS.updateCapsuleBoxEnabledAttribute:(Ljava/lang/String;Ljava/lang/String;)Z
   #870 = NameAndType        #871:#872    // updateCapsuleBoxEnabledAttribute:(Ljava/lang/String;Ljava/lang/String;)Z
   #871 = Utf8               updateCapsuleBoxEnabledAttribute
   #872 = Utf8               (Ljava/lang/String;Ljava/lang/String;)Z
   #873 = Methodref          #11.#874     // ext/mods/commons/gui/ConfigGS.writeConfigValueByText:(Ljava/nio/file/Path;Ljava/lang/String;Ljava/lang/String;)Z
   #874 = NameAndType        #875:#670    // writeConfigValueByText:(Ljava/nio/file/Path;Ljava/lang/String;Ljava/lang/String;)Z
   #875 = Utf8               writeConfigValueByText
   #876 = InvokeDynamic      #52:#436     // #52:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #877 = Methodref          #11.#878     // ext/mods/commons/gui/ConfigGS.saveConfigState:(Ljava/lang/String;Z)V
   #878 = NameAndType        #879:#880    // saveConfigState:(Ljava/lang/String;Z)V
   #879 = Utf8               saveConfigState
   #880 = Utf8               (Ljava/lang/String;Z)V
   #881 = Methodref          #41.#882     // javax/swing/JFrame.setVisible:(Z)V
   #882 = NameAndType        #883:#55     // setVisible:(Z)V
   #883 = Utf8               setVisible
   #884 = Methodref          #41.#885     // javax/swing/JFrame.dispose:()V
   #885 = NameAndType        #886:#6      // dispose:()V
   #886 = Utf8               dispose
   #887 = Methodref          #11.#888     // ext/mods/commons/gui/ConfigGS."<init>":(Ljava/awt/Frame;)V
   #888 = NameAndType        #5:#889      // "<init>":(Ljava/awt/Frame;)V
   #889 = Utf8               (Ljava/awt/Frame;)V
   #890 = Methodref          #11.#891     // ext/mods/commons/gui/ConfigGS.showWindow:()V
   #891 = NameAndType        #892:#6      // showWindow:()V
   #892 = Utf8               showWindow
   #893 = Class              #894         // ext/mods/commons/gui/ConfigGS$1
   #894 = Utf8               ext/mods/commons/gui/ConfigGS$1
   #895 = Methodref          #893.#3      // ext/mods/commons/gui/ConfigGS$1."<init>":()V
   #896 = Methodref          #41.#897     // javax/swing/JFrame.addWindowListener:(Ljava/awt/event/WindowListener;)V
   #897 = NameAndType        #898:#899    // addWindowListener:(Ljava/awt/event/WindowListener;)V
   #898 = Utf8               addWindowListener
   #899 = Utf8               (Ljava/awt/event/WindowListener;)V
   #900 = String             #901         // Announce Boss HP %
   #901 = Utf8               Announce Boss HP %
   #902 = String             #903         // game
   #903 = Utf8               game
   #904 = String             #905         // data
   #905 = Utf8               data
   #906 = String             #907         // custom
   #907 = Utf8               custom
   #908 = String             #909         // mods
   #909 = Utf8               mods
   #910 = String             #911         // bossHpAnnounce.xml
   #911 = Utf8               bossHpAnnounce.xml
   #912 = Methodref          #913.#914    // java/nio/file/Paths.get:(Ljava/lang/String;[Ljava/lang/String;)Ljava/nio/file/Path;
   #913 = Class              #915         // java/nio/file/Paths
   #914 = NameAndType        #243:#916    // get:(Ljava/lang/String;[Ljava/lang/String;)Ljava/nio/file/Path;
   #915 = Utf8               java/nio/file/Paths
   #916 = Utf8               (Ljava/lang/String;[Ljava/lang/String;)Ljava/nio/file/Path;
   #917 = Methodref          #245.#918    // ext/mods/commons/gui/ConfigGS$ModFileConfig."<init>":(Ljava/lang/String;Ljava/nio/file/Path;Ljava/lang/String;)V
   #918 = NameAndType        #5:#919      // "<init>":(Ljava/lang/String;Ljava/nio/file/Path;Ljava/lang/String;)V
   #919 = Utf8               (Ljava/lang/String;Ljava/nio/file/Path;Ljava/lang/String;)V
   #920 = String             #921         // Announce Raid Drop
   #921 = Utf8               Announce Raid Drop
   #922 = String             #923         // raid_drop_announce.xml
   #923 = Utf8               raid_drop_announce.xml
   #924 = String             #925         // Battle Boss Event
   #925 = Utf8               Battle Boss Event
   #926 = String             #927         // battleboss.xml
   #927 = Utf8               battleboss.xml
   #928 = String             #929         // xml
   #929 = Utf8               xml
   #930 = String             #931         // CapsuleBox.xml
   #931 = Utf8               CapsuleBox.xml
   #932 = String             #933         // Equips Grade Restrictions
   #933 = Utf8               Equips Grade Restrictions
   #934 = String             #935         // equip_grade_restrictions.xml
   #935 = Utf8               equip_grade_restrictions.xml
   #936 = String             #937         // Global Drop
   #937 = Utf8               Global Drop
   #938 = String             #939         // global_drop.xml
   #939 = Utf8               global_drop.xml
   #940 = String             #941         // enable
   #941 = Utf8               enable
   #942 = String             #943         // Olly Restrictions Mode
   #943 = Utf8               Olly Restrictions Mode
   #944 = String             #945         // olympiad_enchant_config.xml
   #945 = Utf8               olympiad_enchant_config.xml
   #946 = String             #947         // Player God Mode
   #947 = Utf8               Player God Mode
   #948 = String             #949         // PlayerGOD.xml
   #949 = Utf8               PlayerGOD.xml
   #950 = String             #951         // PVP Colors Sistem
   #951 = Utf8               PVP Colors Sistem
   #952 = String             #953         // pvpSystem.xml
   #953 = Utf8               pvpSystem.xml
   #954 = String             #955         // Random Farm Zone
   #955 = Utf8               Random Farm Zone
   #956 = String             #957         // random_event.xml
   #957 = Utf8               random_event.xml
   #958 = String             #959         // Sell Buff Mode
   #959 = Utf8               Sell Buff Mode
   #960 = String             #961         // config
   #961 = Utf8               config
   #962 = String             #963         // mods.properties
   #963 = Utf8               mods.properties
   #964 = String             #965         // BuffShopEnabled
   #965 = Utf8               BuffShopEnabled
   #966 = String             #967         // Summon Mob Item
   #967 = Utf8               Summon Mob Item
   #968 = String             #969         // SummonMobItem.xml
   #969 = Utf8               SummonMobItem.xml
   #970 = String             #971         // Tournament Event Mode
   #971 = Utf8               Tournament Event Mode
   #972 = String             #973         // tourBattle.xml
   #973 = Utf8               tourBattle.xml
   #974 = InterfaceMethodref #228.#975    // java/util/List.of:([Ljava/lang/Object;)Ljava/util/List;
   #975 = NameAndType        #976:#977    // of:([Ljava/lang/Object;)Ljava/util/List;
   #976 = Utf8               of
   #977 = Utf8               ([Ljava/lang/Object;)Ljava/util/List;
   #978 = String             #979         // server.properties
   #979 = Utf8               server.properties
   #980 = String             #981         // npcs.properties
   #981 = Utf8               npcs.properties
   #982 = String             #983         // 18age
   #983 = Utf8               18age
   #984 = String             #985         // extra_mob
   #985 = Utf8               extra_mob
   #986 = String             #987         // start_weapon
   #987 = Utf8               start_weapon
   #988 = InterfaceMethodref #228.#989    // java/util/List.of:(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/List;
   #989 = NameAndType        #976:#990    // of:(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/List;
   #990 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/List;
   #991 = String             #992         // Spawn GM Shop
   #992 = Utf8               Spawn GM Shop
   #993 = String             #994         // gm_shop
   #994 = Utf8               gm_shop
   #995 = Methodref          #319.#996    // ext/mods/commons/gui/ConfigGS$SpawnEventConfig."<init>":(Ljava/lang/String;Ljava/lang/String;)V
   #996 = NameAndType        #5:#814      // "<init>":(Ljava/lang/String;Ljava/lang/String;)V
   #997 = String             #998         // Spawn NPC Buffer
   #998 = Utf8               Spawn NPC Buffer
   #999 = String             #1000        // npc_buffer
  #1000 = Utf8               npc_buffer
  #1001 = String             #1002        // Spawn Global GK
  #1002 = Utf8               Spawn Global GK
  #1003 = String             #1004        // global_gatekeeper
  #1004 = Utf8               global_gatekeeper
  #1005 = String             #1006        // Spawn Global Services
  #1006 = Utf8               Spawn Global Services
  #1007 = String             #1008        // global_services
  #1008 = Utf8               global_services
  #1009 = String             #1010        // Spawn Class Manager
  #1010 = Utf8               Spawn Class Manager
  #1011 = String             #1012        // class_manager
  #1012 = Utf8               class_manager
  #1013 = Methodref          #579.#1014   // java/util/Arrays.asList:([Ljava/lang/Object;)Ljava/util/List;
  #1014 = NameAndType        #1015:#977   // asList:([Ljava/lang/Object;)Ljava/util/List;
  #1015 = Utf8               asList
  #1016 = Utf8               Signature
  #1017 = Utf8               Ljava/util/List<Lext/mods/commons/gui/ConfigGS$ModFileConfig;>;
  #1018 = Utf8               NO_SPAWNS_KEY
  #1019 = Utf8               ConstantValue
  #1020 = Utf8               SPAWN_EVENTS_KEY
  #1021 = Utf8               GM_SHOP_EVENT
  #1022 = Utf8               NPC_BUFFER_EVENT
  #1023 = Utf8               GLOBAL_GK_EVENT
  #1024 = Utf8               GLOBAL_SERVICES_EVENT
  #1025 = Utf8               CLASS_MANAGER_EVENT
  #1026 = Utf8               Ljava/util/List<Ljava/lang/String;>;
  #1027 = Utf8               Ljava/util/List<Lext/mods/commons/gui/ConfigGS$SpawnEventConfig;>;
  #1028 = Utf8               Ljava/util/Map<Lext/mods/commons/gui/ConfigGS$SpawnEventConfig;Lext/mods/commons/gui/CustomToggleSwitch;>;
  #1029 = Utf8               Ljava/util/Map<Lext/mods/commons/gui/ConfigGS$ModFileConfig;Lext/mods/commons/gui/CustomToggleSwitch;>;
  #1030 = Utf8               Code
  #1031 = Utf8               LineNumberTable
  #1032 = Utf8               LocalVariableTable
  #1033 = Utf8               this
  #1034 = Utf8               Lext/mods/commons/gui/ConfigGS;
  #1035 = Utf8               parent
  #1036 = Utf8               main
  #1037 = Utf8               ([Ljava/lang/String;)V
  #1038 = Utf8               args
  #1039 = Utf8               [Ljava/lang/String;
  #1040 = Utf8               closeAction
  #1041 = Utf8               Ljava/lang/Runnable;
  #1042 = Utf8               menuBar
  #1043 = Utf8               Ljavax/swing/JMenuBar;
  #1044 = Utf8               iconPath
  #1045 = Utf8               contentPanel
  #1046 = Utf8               Ljavax/swing/JPanel;
  #1047 = Utf8               lineBorder
  #1048 = Utf8               Ljavax/swing/border/Border;
  #1049 = Utf8               titleFont
  #1050 = Utf8               Ljava/awt/Font;
  #1051 = Utf8               leftPanel
  #1052 = Utf8               gbcLeft
  #1053 = Utf8               Ljava/awt/GridBagConstraints;
  #1054 = Utf8               rightPanel
  #1055 = Utf8               gbcRight
  #1056 = Utf8               StackMapTable
  #1057 = Class              #1058        // java/lang/Runnable
  #1058 = Utf8               java/lang/Runnable
  #1059 = Class              #1060        // javax/swing/JMenuBar
  #1060 = Utf8               javax/swing/JMenuBar
  #1061 = Utf8               modConfig
  #1062 = Utf8               Lext/mods/commons/gui/ConfigGS$ModFileConfig;
  #1063 = Utf8               Ljavax/swing/JLabel;
  #1064 = Utf8               toggle
  #1065 = Utf8               container
  #1066 = Utf8               i
  #1067 = Utf8               titledBorderMods
  #1068 = Utf8               modsCol1
  #1069 = Utf8               modsCol2
  #1070 = Utf8               half
  #1071 = Utf8               gbc
  #1072 = Utf8               Ljavax/swing/JSeparator;
  #1073 = Class              #1074        // javax/swing/border/Border
  #1074 = Utf8               javax/swing/border/Border
  #1075 = Utf8               Lext/mods/commons/gui/ConfigGS$SpawnEventConfig;
  #1076 = Utf8               titledBorderSpawns
  #1077 = Utf8               optionsWrapperPanel
  #1078 = Utf8               gbcOptions
  #1079 = Utf8               bottomSpacing
  #1080 = Utf8               rightLabelSpacing
  #1081 = Utf8               row
  #1082 = Utf8               gbcRightWrapper
  #1083 = Utf8               text
  #1084 = Utf8               Z
  #1085 = Utf8               entry
  #1086 = Utf8               Ljava/util/Map$Entry;
  #1087 = Utf8               isXml
  #1088 = Utf8               value
  #1089 = Utf8               noLoadSpawnsEnabled
  #1090 = Utf8               activeEvents
  #1091 = Utf8               Ljava/util/Set;
  #1092 = Utf8               LocalVariableTypeTable
  #1093 = Utf8               Ljava/util/Map$Entry<Lext/mods/commons/gui/ConfigGS$SpawnEventConfig;Lext/mods/commons/gui/CustomToggleSwitch;>;
  #1094 = Utf8               Ljava/util/Map$Entry<Lext/mods/commons/gui/ConfigGS$ModFileConfig;Lext/mods/commons/gui/CustomToggleSwitch;>;
  #1095 = Utf8               Ljava/util/Set<Ljava/lang/String;>;
  #1096 = Utf8               elementPattern
  #1097 = Utf8               Ljava/util/regex/Pattern;
  #1098 = Utf8               elementMatcher
  #1099 = Utf8               Ljava/util/regex/Matcher;
  #1100 = Utf8               regex
  #1101 = Utf8               pattern
  #1102 = Utf8               content
  #1103 = Utf8               e
  #1104 = Utf8               Ljava/lang/Exception;
  #1105 = Utf8               configFile
  #1106 = Utf8               line
  #1107 = Utf8               updated
  #1108 = Utf8               lines
  #1109 = Utf8               newValue
  #1110 = Utf8               newLines
  #1111 = Utf8               valueReplaced
  #1112 = Utf8               spawnEventsString
  #1113 = Utf8               events
  #1114 = Utf8               ()Ljava/util/Set<Ljava/lang/String;>;
  #1115 = Utf8               is
  #1116 = Utf8               Ljava/io/InputStream;
  #1117 = Utf8               propertyFile
  #1118 = Utf8               props
  #1119 = Utf8               Ljava/util/Properties;
  #1120 = Utf8               noLoadSpawnsIsOn
  #1121 = Utf8               enableOthers
  #1122 = Utf8               configKey
  #1123 = Utf8               keyPattern
  #1124 = Utf8               alreadyReplaced
  #1125 = Utf8               keyFound
  #1126 = Utf8               fixedEvent
  #1127 = Utf8               allExistingEvents
  #1128 = Utf8               uiControlledEvents
  #1129 = Utf8               finalEvents
  #1130 = Utf8               activeUiEvents
  #1131 = Utf8               otherEvents
  #1132 = Utf8               newSpawnEventsValue
  #1133 = Utf8               ex
  #1134 = Utf8               icons
  #1135 = Utf8               Ljava/util/List<Ljava/awt/Image;>;
  #1136 = Utf8               xmlFile
  #1137 = Utf8               Ljava/io/File;
  #1138 = Utf8               factory
  #1139 = Utf8               Ljavax/xml/parsers/DocumentBuilderFactory;
  #1140 = Utf8               builder
  #1141 = Utf8               Ljavax/xml/parsers/DocumentBuilder;
  #1142 = Utf8               doc
  #1143 = Utf8               Lorg/w3c/dom/Document;
  #1144 = Utf8               root
  #1145 = Utf8               Lorg/w3c/dom/Element;
  #1146 = Utf8               transformerFactory
  #1147 = Utf8               Ljavax/xml/transform/TransformerFactory;
  #1148 = Utf8               transformer
  #1149 = Utf8               Ljavax/xml/transform/Transformer;
  #1150 = Utf8               source
  #1151 = Utf8               Ljavax/xml/transform/dom/DOMSource;
  #1152 = Utf8               result
  #1153 = Utf8               Ljavax/xml/transform/stream/StreamResult;
  #1154 = Utf8               filePath
  #1155 = Utf8               lambda$saveSpawnEventsState$5
  #1156 = Utf8               s
  #1157 = Utf8               lambda$saveSpawnEventsState$4
  #1158 = Utf8               (Ljava/util/Set;Ljava/lang/String;)Z
  #1159 = Utf8               event
  #1160 = Utf8               lambda$saveSpawnEventsState$3
  #1161 = Utf8               lambda$saveSpawnEventsState$2
  #1162 = Utf8               (Ljava/util/Map$Entry;)Ljava/lang/String;
  #1163 = Utf8               lambda$saveSpawnEventsState$1
  #1164 = Utf8               (Ljava/util/Map$Entry;)Z
  #1165 = Utf8               lambda$saveSpawnEventsState$0
  #1166 = Utf8               (Lext/mods/commons/gui/ConfigGS$SpawnEventConfig;)Ljava/lang/String;
  #1167 = Utf8               c
  #1168 = Utf8               lambda$readSpawnEvents$0
  #1169 = Utf8               lambda$addToggleSwitchListeners$2
  #1170 = Utf8               (Lext/mods/commons/gui/CustomToggleSwitch;Lext/mods/commons/gui/ConfigGS$ModFileConfig;Ljava/awt/event/ActionEvent;)V
  #1171 = Utf8               Ljava/awt/event/ActionEvent;
  #1172 = Utf8               success
  #1173 = Class              #1174        // java/awt/event/ActionEvent
  #1174 = Utf8               java/awt/event/ActionEvent
  #1175 = Utf8               lambda$addToggleSwitchListeners$1
  #1176 = Utf8               (Ljava/util/Map$Entry;Ljava/awt/event/ActionEvent;)V
  #1177 = Utf8               lambda$addToggleSwitchListeners$0
  #1178 = Utf8               (Ljava/awt/event/ActionEvent;)V
  #1179 = Utf8               isNoLoadOn
  #1180 = Utf8               lambda$showWindow$0
  #1181 = Utf8               lambda$initialize$0
  #1182 = Utf8               lambda$main$0
  #1183 = Utf8               configWindow
  #1184 = Utf8               <clinit>
  #1185 = Utf8               SourceFile
  #1186 = Utf8               ConfigGS.java
  #1187 = Utf8               NestMembers
  #1188 = Utf8               BootstrapMethods
  #1189 = MethodType         #6           //  ()V
  #1190 = MethodHandle       6:#1191      // REF_invokeStatic ext/mods/commons/gui/ConfigGS.lambda$main$0:()V
  #1191 = Methodref          #11.#1192    // ext/mods/commons/gui/ConfigGS.lambda$main$0:()V
  #1192 = NameAndType        #1182:#6     // lambda$main$0:()V
  #1193 = MethodHandle       5:#1194      // REF_invokeVirtual ext/mods/commons/gui/ConfigGS.lambda$initialize$0:()V
  #1194 = Methodref          #11.#1195    // ext/mods/commons/gui/ConfigGS.lambda$initialize$0:()V
  #1195 = NameAndType        #1181:#6     // lambda$initialize$0:()V
  #1196 = String             #1197        // ..\u0001images\u000116x16.png
  #1197 = Utf8               ..\u0001images\u000116x16.png
  #1198 = MethodHandle       5:#1199      // REF_invokeVirtual ext/mods/commons/gui/ConfigGS.lambda$showWindow$0:()V
  #1199 = Methodref          #11.#1200    // ext/mods/commons/gui/ConfigGS.lambda$showWindow$0:()V
  #1200 = NameAndType        #1180:#6     // lambda$showWindow$0:()V
  #1201 = MethodType         #1178        //  (Ljava/awt/event/ActionEvent;)V
  #1202 = MethodHandle       5:#1203      // REF_invokeVirtual ext/mods/commons/gui/ConfigGS.lambda$addToggleSwitchListeners$0:(Ljava/awt/event/ActionEvent;)V
  #1203 = Methodref          #11.#1204    // ext/mods/commons/gui/ConfigGS.lambda$addToggleSwitchListeners$0:(Ljava/awt/event/ActionEvent;)V
  #1204 = NameAndType        #1177:#1178  // lambda$addToggleSwitchListeners$0:(Ljava/awt/event/ActionEvent;)V
  #1205 = MethodHandle       5:#1206      // REF_invokeVirtual ext/mods/commons/gui/ConfigGS.lambda$addToggleSwitchListeners$1:(Ljava/util/Map$Entry;Ljava/awt/event/ActionEvent;)V
  #1206 = Methodref          #11.#1207    // ext/mods/commons/gui/ConfigGS.lambda$addToggleSwitchListeners$1:(Ljava/util/Map$Entry;Ljava/awt/event/ActionEvent;)V
  #1207 = NameAndType        #1175:#1176  // lambda$addToggleSwitchListeners$1:(Ljava/util/Map$Entry;Ljava/awt/event/ActionEvent;)V
  #1208 = MethodHandle       5:#1209      // REF_invokeVirtual ext/mods/commons/gui/ConfigGS.lambda$addToggleSwitchListeners$2:(Lext/mods/commons/gui/CustomToggleSwitch;Lext/mods/commons/gui/ConfigGS$ModFileConfig;Ljava/awt/event/ActionEvent;)V
  #1209 = Methodref          #11.#1210    // ext/mods/commons/gui/ConfigGS.lambda$addToggleSwitchListeners$2:(Lext/mods/commons/gui/CustomToggleSwitch;Lext/mods/commons/gui/ConfigGS$ModFileConfig;Ljava/awt/event/ActionEvent;)V
  #1210 = NameAndType        #1169:#1170  // lambda$addToggleSwitchListeners$2:(Lext/mods/commons/gui/CustomToggleSwitch;Lext/mods/commons/gui/ConfigGS$ModFileConfig;Ljava/awt/event/ActionEvent;)V
  #1211 = String             #1212        // Arquivo de configuração não encontrado para leitura: \u0001
  #1212 = Utf8               Arquivo de configuração não encontrado para leitura: \u0001
  #1213 = String             #1214        // <[^>]*?\\s*\u0001\\s*=\\s*\"(.*?)\"
  #1214 = Utf8               <[^>]*?\\s*\u0001\\s*=\\s*\"(.*?)\"
  #1215 = String             #1216        // ^\\s*\u0001\\s*[=:]\\s*(.*?)\\s*$
  #1216 = Utf8               ^\\s*\u0001\\s*[=:]\\s*(.*?)\\s*$
  #1217 = String             #1218        // <\\s*\u0001\\s*>\\s*([^<]+?)\\s*<\\s*/\\s*\u0001\\s*>
  #1218 = Utf8               <\\s*\u0001\\s*>\\s*([^<]+?)\\s*<\\s*/\\s*\u0001\\s*>
  #1219 = String             #1220        // Erro ao ler arquivo \u0001: \u0001
  #1220 = Utf8               Erro ao ler arquivo \u0001: \u0001
  #1221 = String             #1222        // Arquivo de configuração não encontrado para escrita: \u0001
  #1222 = Utf8               Arquivo de configuração não encontrado para escrita: \u0001
  #1223 = String             #1224        // (\u0001\\s*=\\s*\")([^\"]*)(\")
  #1224 = Utf8               (\u0001\\s*=\\s*\")([^\"]*)(\")
  #1225 = String             #1226        // ^\\s*(\u0001\\s*[=:])\\s*(.*?)\\s*$
  #1226 = Utf8               ^\\s*(\u0001\\s*[=:])\\s*(.*?)\\s*$
  #1227 = String             #1228        // \u0001\u0001\u0001
  #1228 = Utf8               \u0001\u0001\u0001
  #1229 = String             #1230        // \u0001 \u0001
  #1230 = Utf8               \u0001 \u0001
  #1231 = String             #1232        // \u0001 = \u0001
  #1232 = Utf8               \u0001 = \u0001
  #1233 = String             #1234        // (<\\s*\u0001\\s*>\\s*)([^<]*?)(<\\s*/\\s*\u0001\\s*>)
  #1234 = Utf8               (<\\s*\u0001\\s*>\\s*)([^<]*?)(<\\s*/\\s*\u0001\\s*>)
  #1235 = String             #1236        // $1\u0001$3
  #1236 = Utf8               $1\u0001$3
  #1237 = String             #1238        // Arquivo \u0001 salvo com sucesso (\u0001 elemento XML).
  #1238 = Utf8               Arquivo \u0001 salvo com sucesso (\u0001 elemento XML).
  #1239 = String             #1240        // Arquivo \u0001 salvo com sucesso.
  #1240 = Utf8               Arquivo \u0001 salvo com sucesso.
  #1241 = String             #1242        // Chave/Atributo \'\u0001\' não encontrado para escrita no arquivo \u0001. Nenhuma alteração feita.
  #1242 = Utf8               Chave/Atributo \'\u0001\' não encontrado para escrita no arquivo \u0001. Nenhuma alteração feita.
  #1243 = String             #1244        // Erro de IO ao escrever em \u0001: \u0001
  #1244 = Utf8               Erro de IO ao escrever em \u0001: \u0001
  #1245 = MethodType         #733         //  (Ljava/lang/Object;)Ljava/lang/Object;
  #1246 = MethodHandle       5:#477       // REF_invokeVirtual java/lang/String.trim:()Ljava/lang/String;
  #1247 = MethodType         #437         //  (Ljava/lang/String;)Ljava/lang/String;
  #1248 = MethodType         #360         //  (Ljava/lang/Object;)Z
  #1249 = MethodHandle       6:#1250      // REF_invokeStatic ext/mods/commons/gui/ConfigGS.lambda$readSpawnEvents$0:(Ljava/lang/String;)Z
  #1250 = Methodref          #11.#1251    // ext/mods/commons/gui/ConfigGS.lambda$readSpawnEvents$0:(Ljava/lang/String;)Z
  #1251 = NameAndType        #1168:#383   // lambda$readSpawnEvents$0:(Ljava/lang/String;)Z
  #1252 = MethodType         #383         //  (Ljava/lang/String;)Z
  #1253 = MethodHandle       5:#859       // REF_invokeVirtual java/lang/String.toLowerCase:()Ljava/lang/String;
  #1254 = String             #1255        // Erro ao ler a propriedade \'\u0001\' de \u0001: \u0001
  #1255 = Utf8               Erro ao ler a propriedade \'\u0001\' de \u0001: \u0001
  #1256 = String             #1257        // Salvando Configuração \'NoSpawns\' como: \u0001
  #1257 = Utf8               Salvando Configuração \'NoSpawns\' como: \u0001
  #1258 = String             #1259        // Erro ao salvar configuração \'NoSpawns\' no arquivo:\n\u0001
  #1259 = Utf8               Erro ao salvar configuração \'NoSpawns\' no arquivo:\n\u0001
  #1260 = String             #1261        // Arquivo \u0001 não encontrado, será criado.
  #1261 = Utf8               Arquivo \u0001 não encontrado, será criado.
  #1262 = String             #1263        // ^\\s*\u0001\\s*([=:]).*
  #1263 = Utf8               ^\\s*\u0001\\s*([=:]).*
  #1264 = String             #1265        // \u0001 \u0001 \u0001
  #1265 = Utf8               \u0001 \u0001 \u0001
  #1266 = String             #1267        // Chave \'\u0001\' não encontrada em \u0001, adicionando ao final.
  #1267 = Utf8               Chave \'\u0001\' não encontrada em \u0001, adicionando ao final.
  #1268 = String             #1269        // Erro ao escrever no arquivo \u0001: \u0001
  #1269 = Utf8               Erro ao escrever no arquivo \u0001: \u0001
  #1270 = MethodHandle       6:#1271      // REF_invokeStatic ext/mods/commons/gui/ConfigGS.lambda$saveSpawnEventsState$0:(Lext/mods/commons/gui/ConfigGS$SpawnEventConfig;)Ljava/lang/String;
  #1271 = Methodref          #11.#1272    // ext/mods/commons/gui/ConfigGS.lambda$saveSpawnEventsState$0:(Lext/mods/commons/gui/ConfigGS$SpawnEventConfig;)Ljava/lang/String;
  #1272 = NameAndType        #1165:#1166  // lambda$saveSpawnEventsState$0:(Lext/mods/commons/gui/ConfigGS$SpawnEventConfig;)Ljava/lang/String;
  #1273 = MethodType         #1166        //  (Lext/mods/commons/gui/ConfigGS$SpawnEventConfig;)Ljava/lang/String;
  #1274 = MethodHandle       6:#1275      // REF_invokeStatic ext/mods/commons/gui/ConfigGS.lambda$saveSpawnEventsState$1:(Ljava/util/Map$Entry;)Z
  #1275 = Methodref          #11.#1276    // ext/mods/commons/gui/ConfigGS.lambda$saveSpawnEventsState$1:(Ljava/util/Map$Entry;)Z
  #1276 = NameAndType        #1163:#1164  // lambda$saveSpawnEventsState$1:(Ljava/util/Map$Entry;)Z
  #1277 = MethodType         #1164        //  (Ljava/util/Map$Entry;)Z
  #1278 = MethodHandle       6:#1279      // REF_invokeStatic ext/mods/commons/gui/ConfigGS.lambda$saveSpawnEventsState$2:(Ljava/util/Map$Entry;)Ljava/lang/String;
  #1279 = Methodref          #11.#1280    // ext/mods/commons/gui/ConfigGS.lambda$saveSpawnEventsState$2:(Ljava/util/Map$Entry;)Ljava/lang/String;
  #1280 = NameAndType        #1161:#1162  // lambda$saveSpawnEventsState$2:(Ljava/util/Map$Entry;)Ljava/lang/String;
  #1281 = MethodType         #1162        //  (Ljava/util/Map$Entry;)Ljava/lang/String;
  #1282 = MethodHandle       6:#1283      // REF_invokeStatic ext/mods/commons/gui/ConfigGS.lambda$saveSpawnEventsState$3:(Ljava/lang/String;)Z
  #1283 = Methodref          #11.#1284    // ext/mods/commons/gui/ConfigGS.lambda$saveSpawnEventsState$3:(Ljava/lang/String;)Z
  #1284 = NameAndType        #1160:#383   // lambda$saveSpawnEventsState$3:(Ljava/lang/String;)Z
  #1285 = MethodHandle       6:#1286      // REF_invokeStatic ext/mods/commons/gui/ConfigGS.lambda$saveSpawnEventsState$4:(Ljava/util/Set;Ljava/lang/String;)Z
  #1286 = Methodref          #11.#1287    // ext/mods/commons/gui/ConfigGS.lambda$saveSpawnEventsState$4:(Ljava/util/Set;Ljava/lang/String;)Z
  #1287 = NameAndType        #1157:#1158  // lambda$saveSpawnEventsState$4:(Ljava/util/Set;Ljava/lang/String;)Z
  #1288 = MethodType         #1289        //  (Ljava/lang/Object;)V
  #1289 = Utf8               (Ljava/lang/Object;)V
  #1290 = MethodHandle       9:#509       // REF_invokeInterface java/util/List.add:(Ljava/lang/Object;)Z
  #1291 = MethodType         #47          //  (Ljava/lang/String;)V
  #1292 = MethodHandle       6:#1293      // REF_invokeStatic ext/mods/commons/gui/ConfigGS.lambda$saveSpawnEventsState$5:(Ljava/lang/String;)Z
  #1293 = Methodref          #11.#1294    // ext/mods/commons/gui/ConfigGS.lambda$saveSpawnEventsState$5:(Ljava/lang/String;)Z
  #1294 = NameAndType        #1155:#383   // lambda$saveSpawnEventsState$5:(Ljava/lang/String;)Z
  #1295 = String             #1296        // Salvando Configuração \'SpawnEvents\' como: \u0001
  #1296 = Utf8               Salvando Configuração \'SpawnEvents\' como: \u0001
  #1297 = String             #1298        // Erro ao salvar a configuração \'SpawnEvents\' no arquivo:\n\u0001
  #1298 = Utf8               Erro ao salvar a configuração \'SpawnEvents\' no arquivo:\n\u0001
  #1299 = String             #1300        // Erro ao carregar ícones via GuiUtils em ConfigGS (chamado por pai), tentando fallback: \u0001
  #1300 = Utf8               Erro ao carregar ícones via GuiUtils em ConfigGS (chamado por pai), tentando fallback: \u0001
  #1301 = String             #1302        // ..\u0001images\u000132x32.png
  #1302 = Utf8               ..\u0001images\u000132x32.png
  #1303 = String             #1304        // Erro no fallback de carregar ícones em ConfigGS: \u0001
  #1304 = Utf8               Erro no fallback de carregar ícones em ConfigGS: \u0001
  #1305 = String             #1306        // Erro ao carregar ícones diretamente em ConfigGS (main): \u0001
  #1306 = Utf8               Erro ao carregar ícones diretamente em ConfigGS (main): \u0001
  #1307 = String             #1308        // Arquivo não encontrado: \u0001
  #1308 = Utf8               Arquivo não encontrado: \u0001
  #1309 = String             #1310        // Atributo \'enabled\' atualizado para \'\u0001\' em \u0001
  #1310 = Utf8               Atributo \'enabled\' atualizado para \'\u0001\' em \u0001
  #1311 = String             #1312        // Erro ao atualizar atributo \'enabled\': \u0001
  #1312 = Utf8               Erro ao atualizar atributo \'enabled\': \u0001
  #1313 = String             #1314        // [Custom Mods] \u0001 mudou para: \u0001
  #1314 = Utf8               [Custom Mods] \u0001 mudou para: \u0001
  #1315 = String             #1316        // Erro ao salvar o estado do mod \'\u0001\'. Verifique o console.
  #1316 = Utf8               Erro ao salvar o estado do mod \'\u0001\'. Verifique o console.
  #1317 = MethodHandle       6:#1318      // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #1318 = Methodref          #1319.#1320  // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #1319 = Class              #1321        // java/lang/invoke/LambdaMetafactory
  #1320 = NameAndType        #1322:#1323  // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #1321 = Utf8               java/lang/invoke/LambdaMetafactory
  #1322 = Utf8               metafactory
  #1323 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #1324 = MethodHandle       6:#1325      // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #1325 = Methodref          #1326.#1327  // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #1326 = Class              #1328        // java/lang/invoke/StringConcatFactory
  #1327 = NameAndType        #82:#1329    // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #1328 = Utf8               java/lang/invoke/StringConcatFactory
  #1329 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #1330 = Utf8               InnerClasses
  #1331 = Utf8               ModFileConfig
  #1332 = Utf8               SpawnEventConfig
  #1333 = Utf8               Entry
  #1334 = Class              #1335        // java/lang/invoke/MethodHandles$Lookup
  #1335 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #1336 = Class              #1337        // java/lang/invoke/MethodHandles
  #1337 = Utf8               java/lang/invoke/MethodHandles
  #1338 = Utf8               Lookup
{
  public ext.mods.commons.gui.ConfigGS(java.awt.Frame);
    descriptor: (Ljava/awt/Frame;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: new           #7                  // class java/util/LinkedHashMap
         8: dup
         9: invokespecial #9                  // Method java/util/LinkedHashMap."<init>":()V
        12: putfield      #10                 // Field spawnEventTogglesMap:Ljava/util/Map;
        15: aload_0
        16: new           #7                  // class java/util/LinkedHashMap
        19: dup
        20: invokespecial #9                  // Method java/util/LinkedHashMap."<init>":()V
        23: putfield      #16                 // Field modTogglesMap:Ljava/util/Map;
        26: aload_0
        27: aload_1
        28: putfield      #19                 // Field parentFrame:Ljava/awt/Frame;
        31: aload_0
        32: invokevirtual #23                 // Method initialize:()V
        35: return
      LineNumberTable:
        line 143: 0
        line 140: 4
        line 141: 15
        line 144: 26
        line 145: 31
        line 146: 35
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      36     0  this   Lext/mods/commons/gui/ConfigGS;
            0      36     1 parent   Ljava/awt/Frame;

  public static void main(java.lang.String[]);
    descriptor: ([Ljava/lang/String;)V
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=1, args_size=1
         0: invokestatic  #26                 // Method ext/mods/commons/gui/ThemeManager.applyTheme:()V
         3: invokedynamic #31,  0             // InvokeDynamic #0:run:()Ljava/lang/Runnable;
         8: invokestatic  #35                 // Method javax/swing/SwingUtilities.invokeLater:(Ljava/lang/Runnable;)V
        11: return
      LineNumberTable:
        line 149: 0
        line 150: 3
        line 162: 11
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0  args   [Ljava/lang/String;

  public void showWindow();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #48                 // Field configFrame:Ljavax/swing/JFrame;
         4: ifnull        16
         7: aload_0
         8: invokedynamic #331,  0            // InvokeDynamic #3:run:(Lext/mods/commons/gui/ConfigGS;)Ljava/lang/Runnable;
        13: invokestatic  #35                 // Method javax/swing/SwingUtilities.invokeLater:(Ljava/lang/Runnable;)V
        16: return
      LineNumberTable:
        line 361: 0
        line 362: 7
        line 364: 16
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      17     0  this   Lext/mods/commons/gui/ConfigGS;
      StackMapTable: number_of_entries = 1
        frame_type = 16 /* same */

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=11, locals=0, args_size=0
         0: bipush        13
         2: anewarray     #245                // class ext/mods/commons/gui/ConfigGS$ModFileConfig
         5: dup
         6: iconst_0
         7: new           #245                // class ext/mods/commons/gui/ConfigGS$ModFileConfig
        10: dup
        11: ldc_w         #900                // String Announce Boss HP %
        14: ldc_w         #902                // String game
        17: iconst_4
        18: anewarray     #379                // class java/lang/String
        21: dup
        22: iconst_0
        23: ldc_w         #904                // String data
        26: aastore
        27: dup
        28: iconst_1
        29: ldc_w         #906                // String custom
        32: aastore
        33: dup
        34: iconst_2
        35: ldc_w         #908                // String mods
        38: aastore
        39: dup
        40: iconst_3
        41: ldc_w         #910                // String bossHpAnnounce.xml
        44: aastore
        45: invokestatic  #912                // Method java/nio/file/Paths.get:(Ljava/lang/String;[Ljava/lang/String;)Ljava/nio/file/Path;
        48: ldc_w         #807                // String enabled
        51: invokespecial #917                // Method ext/mods/commons/gui/ConfigGS$ModFileConfig."<init>":(Ljava/lang/String;Ljava/nio/file/Path;Ljava/lang/String;)V
        54: aastore
        55: dup
        56: iconst_1
        57: new           #245                // class ext/mods/commons/gui/ConfigGS$ModFileConfig
        60: dup
        61: ldc_w         #920                // String Announce Raid Drop
        64: ldc_w         #902                // String game
        67: iconst_4
        68: anewarray     #379                // class java/lang/String
        71: dup
        72: iconst_0
        73: ldc_w         #904                // String data
        76: aastore
        77: dup
        78: iconst_1
        79: ldc_w         #906                // String custom
        82: aastore
        83: dup
        84: iconst_2
        85: ldc_w         #908                // String mods
        88: aastore
        89: dup
        90: iconst_3
        91: ldc_w         #922                // String raid_drop_announce.xml
        94: aastore
        95: invokestatic  #912                // Method java/nio/file/Paths.get:(Ljava/lang/String;[Ljava/lang/String;)Ljava/nio/file/Path;
        98: ldc_w         #807                // String enabled
       101: invokespecial #917                // Method ext/mods/commons/gui/ConfigGS$ModFileConfig."<init>":(Ljava/lang/String;Ljava/nio/file/Path;Ljava/lang/String;)V
       104: aastore
       105: dup
       106: iconst_2
       107: new           #245                // class ext/mods/commons/gui/ConfigGS$ModFileConfig
       110: dup
       111: ldc_w         #924                // String Battle Boss Event
       114: ldc_w         #902                // String game
       117: iconst_4
       118: anewarray     #379                // class java/lang/String
       121: dup
       122: iconst_0
       123: ldc_w         #904                // String data
       126: aastore
       127: dup
       128: iconst_1
       129: ldc_w         #906                // String custom
       132: aastore
       133: dup
       134: iconst_2
       135: ldc_w         #908                // String mods
       138: aastore
       139: dup
       140: iconst_3
       141: ldc_w         #926                // String battleboss.xml
       144: aastore
       145: invokestatic  #912                // Method java/nio/file/Paths.get:(Ljava/lang/String;[Ljava/lang/String;)Ljava/nio/file/Path;
       148: ldc_w         #807                // String enabled
       151: invokespecial #917                // Method ext/mods/commons/gui/ConfigGS$ModFileConfig."<init>":(Ljava/lang/String;Ljava/nio/file/Path;Ljava/lang/String;)V
       154: aastore
       155: dup
       156: iconst_3
       157: new           #245                // class ext/mods/commons/gui/ConfigGS$ModFileConfig
       160: dup
       161: ldc_w         #867                // String Capsule Box
       164: ldc_w         #902                // String game
       167: iconst_3
       168: anewarray     #379                // class java/lang/String
       171: dup
       172: iconst_0
       173: ldc_w         #904                // String data
       176: aastore
       177: dup
       178: iconst_1
       179: ldc_w         #928                // String xml
       182: aastore
       183: dup
       184: iconst_2
       185: ldc_w         #930                // String CapsuleBox.xml
       188: aastore
       189: invokestatic  #912                // Method java/nio/file/Paths.get:(Ljava/lang/String;[Ljava/lang/String;)Ljava/nio/file/Path;
       192: ldc_w         #807                // String enabled
       195: invokespecial #917                // Method ext/mods/commons/gui/ConfigGS$ModFileConfig."<init>":(Ljava/lang/String;Ljava/nio/file/Path;Ljava/lang/String;)V
       198: aastore
       199: dup
       200: iconst_4
       201: new           #245                // class ext/mods/commons/gui/ConfigGS$ModFileConfig
       204: dup
       205: ldc_w         #932                // String Equips Grade Restrictions
       208: ldc_w         #902                // String game
       211: iconst_4
       212: anewarray     #379                // class java/lang/String
       215: dup
       216: iconst_0
       217: ldc_w         #904                // String data
       220: aastore
       221: dup
       222: iconst_1
       223: ldc_w         #906                // String custom
       226: aastore
       227: dup
       228: iconst_2
       229: ldc_w         #908                // String mods
       232: aastore
       233: dup
       234: iconst_3
       235: ldc_w         #934                // String equip_grade_restrictions.xml
       238: aastore
       239: invokestatic  #912                // Method java/nio/file/Paths.get:(Ljava/lang/String;[Ljava/lang/String;)Ljava/nio/file/Path;
       242: ldc_w         #807                // String enabled
       245: invokespecial #917                // Method ext/mods/commons/gui/ConfigGS$ModFileConfig."<init>":(Ljava/lang/String;Ljava/nio/file/Path;Ljava/lang/String;)V
       248: aastore
       249: dup
       250: iconst_5
       251: new           #245                // class ext/mods/commons/gui/ConfigGS$ModFileConfig
       254: dup
       255: ldc_w         #936                // String Global Drop
       258: ldc_w         #902                // String game
       261: iconst_4
       262: anewarray     #379                // class java/lang/String
       265: dup
       266: iconst_0
       267: ldc_w         #904                // String data
       270: aastore
       271: dup
       272: iconst_1
       273: ldc_w         #906                // String custom
       276: aastore
       277: dup
       278: iconst_2
       279: ldc_w         #908                // String mods
       282: aastore
       283: dup
       284: iconst_3
       285: ldc_w         #938                // String global_drop.xml
       288: aastore
       289: invokestatic  #912                // Method java/nio/file/Paths.get:(Ljava/lang/String;[Ljava/lang/String;)Ljava/nio/file/Path;
       292: ldc_w         #940                // String enable
       295: invokespecial #917                // Method ext/mods/commons/gui/ConfigGS$ModFileConfig."<init>":(Ljava/lang/String;Ljava/nio/file/Path;Ljava/lang/String;)V
       298: aastore
       299: dup
       300: bipush        6
       302: new           #245                // class ext/mods/commons/gui/ConfigGS$ModFileConfig
       305: dup
       306: ldc_w         #942                // String Olly Restrictions Mode
       309: ldc_w         #902                // String game
       312: iconst_4
       313: anewarray     #379                // class java/lang/String
       316: dup
       317: iconst_0
       318: ldc_w         #904                // String data
       321: aastore
       322: dup
       323: iconst_1
       324: ldc_w         #906                // String custom
       327: aastore
       328: dup
       329: iconst_2
       330: ldc_w         #908                // String mods
       333: aastore
       334: dup
       335: iconst_3
       336: ldc_w         #944                // String olympiad_enchant_config.xml
       339: aastore
       340: invokestatic  #912                // Method java/nio/file/Paths.get:(Ljava/lang/String;[Ljava/lang/String;)Ljava/nio/file/Path;
       343: ldc_w         #807                // String enabled
       346: invokespecial #917                // Method ext/mods/commons/gui/ConfigGS$ModFileConfig."<init>":(Ljava/lang/String;Ljava/nio/file/Path;Ljava/lang/String;)V
       349: aastore
       350: dup
       351: bipush        7
       353: new           #245                // class ext/mods/commons/gui/ConfigGS$ModFileConfig
       356: dup
       357: ldc_w         #946                // String Player God Mode
       360: ldc_w         #902                // String game
       363: iconst_4
       364: anewarray     #379                // class java/lang/String
       367: dup
       368: iconst_0
       369: ldc_w         #904                // String data
       372: aastore
       373: dup
       374: iconst_1
       375: ldc_w         #906                // String custom
       378: aastore
       379: dup
       380: iconst_2
       381: ldc_w         #908                // String mods
       384: aastore
       385: dup
       386: iconst_3
       387: ldc_w         #948                // String PlayerGOD.xml
       390: aastore
       391: invokestatic  #912                // Method java/nio/file/Paths.get:(Ljava/lang/String;[Ljava/lang/String;)Ljava/nio/file/Path;
       394: ldc_w         #807                // String enabled
       397: invokespecial #917                // Method ext/mods/commons/gui/ConfigGS$ModFileConfig."<init>":(Ljava/lang/String;Ljava/nio/file/Path;Ljava/lang/String;)V
       400: aastore
       401: dup
       402: bipush        8
       404: new           #245                // class ext/mods/commons/gui/ConfigGS$ModFileConfig
       407: dup
       408: ldc_w         #950                // String PVP Colors Sistem
       411: ldc_w         #902                // String game
       414: iconst_4
       415: anewarray     #379                // class java/lang/String
       418: dup
       419: iconst_0
       420: ldc_w         #904                // String data
       423: aastore
       424: dup
       425: iconst_1
       426: ldc_w         #906                // String custom
       429: aastore
       430: dup
       431: iconst_2
       432: ldc_w         #908                // String mods
       435: aastore
       436: dup
       437: iconst_3
       438: ldc_w         #952                // String pvpSystem.xml
       441: aastore
       442: invokestatic  #912                // Method java/nio/file/Paths.get:(Ljava/lang/String;[Ljava/lang/String;)Ljava/nio/file/Path;
       445: ldc_w         #807                // String enabled
       448: invokespecial #917                // Method ext/mods/commons/gui/ConfigGS$ModFileConfig."<init>":(Ljava/lang/String;Ljava/nio/file/Path;Ljava/lang/String;)V
       451: aastore
       452: dup
       453: bipush        9
       455: new           #245                // class ext/mods/commons/gui/ConfigGS$ModFileConfig
       458: dup
       459: ldc_w         #954                // String Random Farm Zone
       462: ldc_w         #902                // String game
       465: iconst_4
       466: anewarray     #379                // class java/lang/String
       469: dup
       470: iconst_0
       471: ldc_w         #904                // String data
       474: aastore
       475: dup
       476: iconst_1
       477: ldc_w         #906                // String custom
       480: aastore
       481: dup
       482: iconst_2
       483: ldc_w         #908                // String mods
       486: aastore
       487: dup
       488: iconst_3
       489: ldc_w         #956                // String random_event.xml
       492: aastore
       493: invokestatic  #912                // Method java/nio/file/Paths.get:(Ljava/lang/String;[Ljava/lang/String;)Ljava/nio/file/Path;
       496: ldc_w         #940                // String enable
       499: invokespecial #917                // Method ext/mods/commons/gui/ConfigGS$ModFileConfig."<init>":(Ljava/lang/String;Ljava/nio/file/Path;Ljava/lang/String;)V
       502: aastore
       503: dup
       504: bipush        10
       506: new           #245                // class ext/mods/commons/gui/ConfigGS$ModFileConfig
       509: dup
       510: ldc_w         #958                // String Sell Buff Mode
       513: ldc_w         #902                // String game
       516: iconst_2
       517: anewarray     #379                // class java/lang/String
       520: dup
       521: iconst_0
       522: ldc_w         #960                // String config
       525: aastore
       526: dup
       527: iconst_1
       528: ldc_w         #962                // String mods.properties
       531: aastore
       532: invokestatic  #912                // Method java/nio/file/Paths.get:(Ljava/lang/String;[Ljava/lang/String;)Ljava/nio/file/Path;
       535: ldc_w         #964                // String BuffShopEnabled
       538: invokespecial #917                // Method ext/mods/commons/gui/ConfigGS$ModFileConfig."<init>":(Ljava/lang/String;Ljava/nio/file/Path;Ljava/lang/String;)V
       541: aastore
       542: dup
       543: bipush        11
       545: new           #245                // class ext/mods/commons/gui/ConfigGS$ModFileConfig
       548: dup
       549: ldc_w         #966                // String Summon Mob Item
       552: ldc_w         #902                // String game
       555: iconst_4
       556: anewarray     #379                // class java/lang/String
       559: dup
       560: iconst_0
       561: ldc_w         #904                // String data
       564: aastore
       565: dup
       566: iconst_1
       567: ldc_w         #906                // String custom
       570: aastore
       571: dup
       572: iconst_2
       573: ldc_w         #908                // String mods
       576: aastore
       577: dup
       578: iconst_3
       579: ldc_w         #968                // String SummonMobItem.xml
       582: aastore
       583: invokestatic  #912                // Method java/nio/file/Paths.get:(Ljava/lang/String;[Ljava/lang/String;)Ljava/nio/file/Path;
       586: ldc_w         #807                // String enabled
       589: invokespecial #917                // Method ext/mods/commons/gui/ConfigGS$ModFileConfig."<init>":(Ljava/lang/String;Ljava/nio/file/Path;Ljava/lang/String;)V
       592: aastore
       593: dup
       594: bipush        12
       596: new           #245                // class ext/mods/commons/gui/ConfigGS$ModFileConfig
       599: dup
       600: ldc_w         #970                // String Tournament Event Mode
       603: ldc_w         #902                // String game
       606: iconst_4
       607: anewarray     #379                // class java/lang/String
       610: dup
       611: iconst_0
       612: ldc_w         #904                // String data
       615: aastore
       616: dup
       617: iconst_1
       618: ldc_w         #906                // String custom
       621: aastore
       622: dup
       623: iconst_2
       624: ldc_w         #908                // String mods
       627: aastore
       628: dup
       629: iconst_3
       630: ldc_w         #972                // String tourBattle.xml
       633: aastore
       634: invokestatic  #912                // Method java/nio/file/Paths.get:(Ljava/lang/String;[Ljava/lang/String;)Ljava/nio/file/Path;
       637: ldc_w         #807                // String enabled
       640: invokespecial #917                // Method ext/mods/commons/gui/ConfigGS$ModFileConfig."<init>":(Ljava/lang/String;Ljava/nio/file/Path;Ljava/lang/String;)V
       643: aastore
       644: invokestatic  #974                // InterfaceMethod java/util/List.of:([Ljava/lang/Object;)Ljava/util/List;
       647: putstatic     #223                // Field MODS_CONFIG_MAP:Ljava/util/List;
       650: ldc_w         #902                // String game
       653: iconst_2
       654: anewarray     #379                // class java/lang/String
       657: dup
       658: iconst_0
       659: ldc_w         #960                // String config
       662: aastore
       663: dup
       664: iconst_1
       665: ldc_w         #978                // String server.properties
       668: aastore
       669: invokestatic  #912                // Method java/nio/file/Paths.get:(Ljava/lang/String;[Ljava/lang/String;)Ljava/nio/file/Path;
       672: putstatic     #555                // Field SERVER_PROPERTIES_PATH:Ljava/nio/file/Path;
       675: ldc_w         #902                // String game
       678: iconst_2
       679: anewarray     #379                // class java/lang/String
       682: dup
       683: iconst_0
       684: ldc_w         #960                // String config
       687: aastore
       688: dup
       689: iconst_1
       690: ldc_w         #980                // String npcs.properties
       693: aastore
       694: invokestatic  #912                // Method java/nio/file/Paths.get:(Ljava/lang/String;[Ljava/lang/String;)Ljava/nio/file/Path;
       697: putstatic     #564                // Field NPCS_PROPERTIES_PATH:Ljava/nio/file/Path;
       700: ldc_w         #982                // String 18age
       703: ldc_w         #984                // String extra_mob
       706: ldc_w         #986                // String start_weapon
       709: invokestatic  #988                // InterfaceMethod java/util/List.of:(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/List;
       712: putstatic     #703                // Field FIXED_EVENTS_ORDERED:Ljava/util/List;
       715: iconst_5
       716: anewarray     #319                // class ext/mods/commons/gui/ConfigGS$SpawnEventConfig
       719: dup
       720: iconst_0
       721: new           #319                // class ext/mods/commons/gui/ConfigGS$SpawnEventConfig
       724: dup
       725: ldc_w         #991                // String Spawn GM Shop
       728: ldc_w         #993                // String gm_shop
       731: invokespecial #995                // Method ext/mods/commons/gui/ConfigGS$SpawnEventConfig."<init>":(Ljava/lang/String;Ljava/lang/String;)V
       734: aastore
       735: dup
       736: iconst_1
       737: new           #319                // class ext/mods/commons/gui/ConfigGS$SpawnEventConfig
       740: dup
       741: ldc_w         #997                // String Spawn NPC Buffer
       744: ldc_w         #999                // String npc_buffer
       747: invokespecial #995                // Method ext/mods/commons/gui/ConfigGS$SpawnEventConfig."<init>":(Ljava/lang/String;Ljava/lang/String;)V
       750: aastore
       751: dup
       752: iconst_2
       753: new           #319                // class ext/mods/commons/gui/ConfigGS$SpawnEventConfig
       756: dup
       757: ldc_w         #1001               // String Spawn Global GK
       760: ldc_w         #1003               // String global_gatekeeper
       763: invokespecial #995                // Method ext/mods/commons/gui/ConfigGS$SpawnEventConfig."<init>":(Ljava/lang/String;Ljava/lang/String;)V
       766: aastore
       767: dup
       768: iconst_3
       769: new           #319                // class ext/mods/commons/gui/ConfigGS$SpawnEventConfig
       772: dup
       773: ldc_w         #1005               // String Spawn Global Services
       776: ldc_w         #1007               // String global_services
       779: invokespecial #995                // Method ext/mods/commons/gui/ConfigGS$SpawnEventConfig."<init>":(Ljava/lang/String;Ljava/lang/String;)V
       782: aastore
       783: dup
       784: iconst_4
       785: new           #319                // class ext/mods/commons/gui/ConfigGS$SpawnEventConfig
       788: dup
       789: ldc_w         #1009               // String Spawn Class Manager
       792: ldc_w         #1011               // String class_manager
       795: invokespecial #995                // Method ext/mods/commons/gui/ConfigGS$SpawnEventConfig."<init>":(Ljava/lang/String;Ljava/lang/String;)V
       798: aastore
       799: invokestatic  #1013               // Method java/util/Arrays.asList:([Ljava/lang/Object;)Ljava/util/List;
       802: putstatic     #302                // Field SPAWN_EVENTS_CONFIG:Ljava/util/List;
       805: return
      LineNumberTable:
        line 84: 0
        line 85: 45
        line 86: 95
        line 87: 145
        line 88: 189
        line 89: 239
        line 90: 289
        line 91: 340
        line 92: 391
        line 93: 442
        line 94: 493
        line 95: 532
        line 96: 583
        line 97: 634
        line 84: 644
        line 100: 650
        line 102: 675
        line 111: 700
        line 126: 715
}
SourceFile: "ConfigGS.java"
NestMembers:
  ext/mods/commons/gui/ConfigGS$SpawnEventConfig
  ext/mods/commons/gui/ConfigGS$ModFileConfig
  ext/mods/commons/gui/ConfigGS$1
BootstrapMethods:
  0: #1317 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1189 ()V
      #1190 REF_invokeStatic ext/mods/commons/gui/ConfigGS.lambda$main$0:()V
      #1189 ()V
  1: #1317 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1189 ()V
      #1193 REF_invokeVirtual ext/mods/commons/gui/ConfigGS.lambda$initialize$0:()V
      #1189 ()V
  2: #1324 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1196 ..\u0001images\u000116x16.png
  3: #1317 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1189 ()V
      #1198 REF_invokeVirtual ext/mods/commons/gui/ConfigGS.lambda$showWindow$0:()V
      #1189 ()V
  4: #1317 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1201 (Ljava/awt/event/ActionEvent;)V
      #1202 REF_invokeVirtual ext/mods/commons/gui/ConfigGS.lambda$addToggleSwitchListeners$0:(Ljava/awt/event/ActionEvent;)V
      #1201 (Ljava/awt/event/ActionEvent;)V
  5: #1317 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1201 (Ljava/awt/event/ActionEvent;)V
      #1205 REF_invokeVirtual ext/mods/commons/gui/ConfigGS.lambda$addToggleSwitchListeners$1:(Ljava/util/Map$Entry;Ljava/awt/event/ActionEvent;)V
      #1201 (Ljava/awt/event/ActionEvent;)V
  6: #1317 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1201 (Ljava/awt/event/ActionEvent;)V
      #1208 REF_invokeVirtual ext/mods/commons/gui/ConfigGS.lambda$addToggleSwitchListeners$2:(Lext/mods/commons/gui/CustomToggleSwitch;Lext/mods/commons/gui/ConfigGS$ModFileConfig;Ljava/awt/event/ActionEvent;)V
      #1201 (Ljava/awt/event/ActionEvent;)V
  7: #1324 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1211 Arquivo de configuração não encontrado para leitura: \u0001
  8: #1324 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1213 <[^>]*?\\s*\u0001\\s*=\\s*\"(.*?)\"
  9: #1324 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1215 ^\\s*\u0001\\s*[=:]\\s*(.*?)\\s*$
  10: #1324 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1217 <\\s*\u0001\\s*>\\s*([^<]+?)\\s*<\\s*/\\s*\u0001\\s*>
  11: #1324 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1219 Erro ao ler arquivo \u0001: \u0001
  12: #1324 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1221 Arquivo de configuração não encontrado para escrita: \u0001
  13: #1324 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1223 (\u0001\\s*=\\s*\")([^\"]*)(\")
  14: #1324 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1225 ^\\s*(\u0001\\s*[=:])\\s*(.*?)\\s*$
  15: #1324 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1227 \u0001\u0001\u0001
  16: #1324 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1229 \u0001 \u0001
  17: #1324 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1231 \u0001 = \u0001
  18: #1324 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1233 (<\\s*\u0001\\s*>\\s*)([^<]*?)(<\\s*/\\s*\u0001\\s*>)
  19: #1324 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1235 $1\u0001$3
  20: #1324 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1237 Arquivo \u0001 salvo com sucesso (\u0001 elemento XML).
  21: #1324 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1239 Arquivo \u0001 salvo com sucesso.
  22: #1324 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1241 Chave/Atributo \'\u0001\' não encontrado para escrita no arquivo \u0001. Nenhuma alteração feita.
  23: #1324 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1243 Erro de IO ao escrever em \u0001: \u0001
  24: #1317 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1245 (Ljava/lang/Object;)Ljava/lang/Object;
      #1246 REF_invokeVirtual java/lang/String.trim:()Ljava/lang/String;
      #1247 (Ljava/lang/String;)Ljava/lang/String;
  25: #1317 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1248 (Ljava/lang/Object;)Z
      #1249 REF_invokeStatic ext/mods/commons/gui/ConfigGS.lambda$readSpawnEvents$0:(Ljava/lang/String;)Z
      #1252 (Ljava/lang/String;)Z
  26: #1317 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1245 (Ljava/lang/Object;)Ljava/lang/Object;
      #1253 REF_invokeVirtual java/lang/String.toLowerCase:()Ljava/lang/String;
      #1247 (Ljava/lang/String;)Ljava/lang/String;
  27: #1324 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1254 Erro ao ler a propriedade \'\u0001\' de \u0001: \u0001
  28: #1324 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1256 Salvando Configuração \'NoSpawns\' como: \u0001
  29: #1324 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1258 Erro ao salvar configuração \'NoSpawns\' no arquivo:\n\u0001
  30: #1324 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1260 Arquivo \u0001 não encontrado, será criado.
  31: #1324 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1262 ^\\s*\u0001\\s*([=:]).*
  32: #1324 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1264 \u0001 \u0001 \u0001
  33: #1324 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1266 Chave \'\u0001\' não encontrada em \u0001, adicionando ao final.
  34: #1324 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1268 Erro ao escrever no arquivo \u0001: \u0001
  35: #1317 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1245 (Ljava/lang/Object;)Ljava/lang/Object;
      #1270 REF_invokeStatic ext/mods/commons/gui/ConfigGS.lambda$saveSpawnEventsState$0:(Lext/mods/commons/gui/ConfigGS$SpawnEventConfig;)Ljava/lang/String;
      #1273 (Lext/mods/commons/gui/ConfigGS$SpawnEventConfig;)Ljava/lang/String;
  36: #1317 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1248 (Ljava/lang/Object;)Z
      #1274 REF_invokeStatic ext/mods/commons/gui/ConfigGS.lambda$saveSpawnEventsState$1:(Ljava/util/Map$Entry;)Z
      #1277 (Ljava/util/Map$Entry;)Z
  37: #1317 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1245 (Ljava/lang/Object;)Ljava/lang/Object;
      #1278 REF_invokeStatic ext/mods/commons/gui/ConfigGS.lambda$saveSpawnEventsState$2:(Ljava/util/Map$Entry;)Ljava/lang/String;
      #1281 (Ljava/util/Map$Entry;)Ljava/lang/String;
  38: #1317 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1248 (Ljava/lang/Object;)Z
      #1282 REF_invokeStatic ext/mods/commons/gui/ConfigGS.lambda$saveSpawnEventsState$3:(Ljava/lang/String;)Z
      #1252 (Ljava/lang/String;)Z
  39: #1317 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1248 (Ljava/lang/Object;)Z
      #1285 REF_invokeStatic ext/mods/commons/gui/ConfigGS.lambda$saveSpawnEventsState$4:(Ljava/util/Set;Ljava/lang/String;)Z
      #1252 (Ljava/lang/String;)Z
  40: #1317 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1288 (Ljava/lang/Object;)V
      #1290 REF_invokeInterface java/util/List.add:(Ljava/lang/Object;)Z
      #1291 (Ljava/lang/String;)V
  41: #1317 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1248 (Ljava/lang/Object;)Z
      #1292 REF_invokeStatic ext/mods/commons/gui/ConfigGS.lambda$saveSpawnEventsState$5:(Ljava/lang/String;)Z
      #1252 (Ljava/lang/String;)Z
  42: #1324 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1295 Salvando Configuração \'SpawnEvents\' como: \u0001
  43: #1324 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1297 Erro ao salvar a configuração \'SpawnEvents\' no arquivo:\n\u0001
  44: #1324 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1299 Erro ao carregar ícones via GuiUtils em ConfigGS (chamado por pai), tentando fallback: \u0001
  45: #1324 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1301 ..\u0001images\u000132x32.png
  46: #1324 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1303 Erro no fallback de carregar ícones em ConfigGS: \u0001
  47: #1324 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1305 Erro ao carregar ícones diretamente em ConfigGS (main): \u0001
  48: #1324 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1307 Arquivo não encontrado: \u0001
  49: #1324 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1309 Atributo \'enabled\' atualizado para \'\u0001\' em \u0001
  50: #1324 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1311 Erro ao atualizar atributo \'enabled\': \u0001
  51: #1324 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1313 [Custom Mods] \u0001 mudou para: \u0001
  52: #1324 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1315 Erro ao salvar o estado do mod \'\u0001\'. Verifique o console.
InnerClasses:
  public static #1333= #349 of #260;      // Entry=class java/util/Map$Entry of class java/util/Map
  #893;                                   // class ext/mods/commons/gui/ConfigGS$1
  public static final #1338= #1334 of #1336; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
