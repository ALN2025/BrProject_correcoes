// Bytecode for: ext.mods.commons.gui.InterfaceMovementTuner
// File: ext\mods\commons\gui\InterfaceMovementTuner.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/commons/gui/InterfaceMovementTuner.class
  Last modified 9 de jul de 2026; size 10438 bytes
  MD5 checksum 2a9778f1992619c4f6a5fc945119c80b
  Compiled from "InterfaceMovementTuner.java"
public class ext.mods.commons.gui.InterfaceMovementTuner extends javax.swing.JFrame
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #38                         // ext/mods/commons/gui/InterfaceMovementTuner
  super_class: #32                        // javax/swing/JFrame
  interfaces: 0, fields: 3, methods: 11, attributes: 4
Constant pool:
    #1 = Methodref          #2.#3         // java/awt/GraphicsEnvironment.isHeadless:()Z
    #2 = Class              #4            // java/awt/GraphicsEnvironment
    #3 = NameAndType        #5:#6         // isHeadless:()Z
    #4 = Utf8               java/awt/GraphicsEnvironment
    #5 = Utf8               isHeadless
    #6 = Utf8               ()Z
    #7 = Fieldref           #8.#9         // java/lang/System.out:Ljava/io/PrintStream;
    #8 = Class              #10           // java/lang/System
    #9 = NameAndType        #11:#12       // out:Ljava/io/PrintStream;
   #10 = Utf8               java/lang/System
   #11 = Utf8               out
   #12 = Utf8               Ljava/io/PrintStream;
   #13 = String             #14           // [MovementTuner] Cannot open GUI in Headless environment (No Graphics).
   #14 = Utf8               [MovementTuner] Cannot open GUI in Headless environment (No Graphics).
   #15 = Methodref          #16.#17       // java/io/PrintStream.println:(Ljava/lang/String;)V
   #16 = Class              #18           // java/io/PrintStream
   #17 = NameAndType        #19:#20       // println:(Ljava/lang/String;)V
   #18 = Utf8               java/io/PrintStream
   #19 = Utf8               println
   #20 = Utf8               (Ljava/lang/String;)V
   #21 = InvokeDynamic      #0:#22        // #0:run:()Ljava/lang/Runnable;
   #22 = NameAndType        #23:#24       // run:()Ljava/lang/Runnable;
   #23 = Utf8               run
   #24 = Utf8               ()Ljava/lang/Runnable;
   #25 = Methodref          #26.#27       // javax/swing/SwingUtilities.invokeLater:(Ljava/lang/Runnable;)V
   #26 = Class              #28           // javax/swing/SwingUtilities
   #27 = NameAndType        #29:#30       // invokeLater:(Ljava/lang/Runnable;)V
   #28 = Utf8               javax/swing/SwingUtilities
   #29 = Utf8               invokeLater
   #30 = Utf8               (Ljava/lang/Runnable;)V
   #31 = Methodref          #32.#33       // javax/swing/JFrame."<init>":()V
   #32 = Class              #34           // javax/swing/JFrame
   #33 = NameAndType        #35:#36       // "<init>":()V
   #34 = Utf8               javax/swing/JFrame
   #35 = Utf8               <init>
   #36 = Utf8               ()V
   #37 = Methodref          #38.#39       // ext/mods/commons/gui/InterfaceMovementTuner.setUndecorated:(Z)V
   #38 = Class              #40           // ext/mods/commons/gui/InterfaceMovementTuner
   #39 = NameAndType        #41:#42       // setUndecorated:(Z)V
   #40 = Utf8               ext/mods/commons/gui/InterfaceMovementTuner
   #41 = Utf8               setUndecorated
   #42 = Utf8               (Z)V
   #43 = String             #44           // Monsters Movement Tuner v2.1 (Zero GC Optimized)
   #44 = Utf8               Monsters Movement Tuner v2.1 (Zero GC Optimized)
   #45 = Methodref          #38.#46       // ext/mods/commons/gui/InterfaceMovementTuner.setTitle:(Ljava/lang/String;)V
   #46 = NameAndType        #47:#20       // setTitle:(Ljava/lang/String;)V
   #47 = Utf8               setTitle
   #48 = Methodref          #38.#49       // ext/mods/commons/gui/InterfaceMovementTuner.setSize:(II)V
   #49 = NameAndType        #50:#51       // setSize:(II)V
   #50 = Utf8               setSize
   #51 = Utf8               (II)V
   #52 = Methodref          #38.#53       // ext/mods/commons/gui/InterfaceMovementTuner.setLocationRelativeTo:(Ljava/awt/Component;)V
   #53 = NameAndType        #54:#55       // setLocationRelativeTo:(Ljava/awt/Component;)V
   #54 = Utf8               setLocationRelativeTo
   #55 = Utf8               (Ljava/awt/Component;)V
   #56 = Fieldref           #57.#58       // ext/mods/commons/gui/ModernUI.BG_DARK:Ljava/awt/Color;
   #57 = Class              #59           // ext/mods/commons/gui/ModernUI
   #58 = NameAndType        #60:#61       // BG_DARK:Ljava/awt/Color;
   #59 = Utf8               ext/mods/commons/gui/ModernUI
   #60 = Utf8               BG_DARK
   #61 = Utf8               Ljava/awt/Color;
   #62 = Methodref          #38.#63       // ext/mods/commons/gui/InterfaceMovementTuner.setBackground:(Ljava/awt/Color;)V
   #63 = NameAndType        #64:#65       // setBackground:(Ljava/awt/Color;)V
   #64 = Utf8               setBackground
   #65 = Utf8               (Ljava/awt/Color;)V
   #66 = InvokeDynamic      #1:#67        // #1:run:(Lext/mods/commons/gui/InterfaceMovementTuner;)Ljava/lang/Runnable;
   #67 = NameAndType        #23:#68       // run:(Lext/mods/commons/gui/InterfaceMovementTuner;)Ljava/lang/Runnable;
   #68 = Utf8               (Lext/mods/commons/gui/InterfaceMovementTuner;)Ljava/lang/Runnable;
   #69 = Class              #70           // ext/mods/commons/gui/CustomTopPanel
   #70 = Utf8               ext/mods/commons/gui/CustomTopPanel
   #71 = String             #72           // images/16x16.png
   #72 = Utf8               images/16x16.png
   #73 = Methodref          #69.#74       // ext/mods/commons/gui/CustomTopPanel."<init>":(Ljavax/swing/JFrame;Ljavax/swing/JMenuBar;Ljava/lang/Runnable;ZLjava/lang/String;)V
   #74 = NameAndType        #35:#75       // "<init>":(Ljavax/swing/JFrame;Ljavax/swing/JMenuBar;Ljava/lang/Runnable;ZLjava/lang/String;)V
   #75 = Utf8               (Ljavax/swing/JFrame;Ljavax/swing/JMenuBar;Ljava/lang/Runnable;ZLjava/lang/String;)V
   #76 = Fieldref           #38.#77       // ext/mods/commons/gui/InterfaceMovementTuner.topPanel:Lext/mods/commons/gui/CustomTopPanel;
   #77 = NameAndType        #78:#79       // topPanel:Lext/mods/commons/gui/CustomTopPanel;
   #78 = Utf8               topPanel
   #79 = Utf8               Lext/mods/commons/gui/CustomTopPanel;
   #80 = Class              #81           // java/awt/BorderLayout
   #81 = Utf8               java/awt/BorderLayout
   #82 = String             #83           // North
   #83 = Utf8               North
   #84 = Methodref          #38.#85       // ext/mods/commons/gui/InterfaceMovementTuner.add:(Ljava/awt/Component;Ljava/lang/Object;)V
   #85 = NameAndType        #86:#87       // add:(Ljava/awt/Component;Ljava/lang/Object;)V
   #86 = Utf8               add
   #87 = Utf8               (Ljava/awt/Component;Ljava/lang/Object;)V
   #88 = Class              #89           // javax/swing/JPanel
   #89 = Utf8               javax/swing/JPanel
   #90 = Class              #91           // java/awt/GridLayout
   #91 = Utf8               java/awt/GridLayout
   #92 = Methodref          #90.#93       // java/awt/GridLayout."<init>":(IIII)V
   #93 = NameAndType        #35:#94       // "<init>":(IIII)V
   #94 = Utf8               (IIII)V
   #95 = Methodref          #88.#96       // javax/swing/JPanel."<init>":(Ljava/awt/LayoutManager;)V
   #96 = NameAndType        #35:#97       // "<init>":(Ljava/awt/LayoutManager;)V
   #97 = Utf8               (Ljava/awt/LayoutManager;)V
   #98 = Methodref          #88.#63       // javax/swing/JPanel.setBackground:(Ljava/awt/Color;)V
   #99 = Class              #100          // javax/swing/border/EmptyBorder
  #100 = Utf8               javax/swing/border/EmptyBorder
  #101 = Methodref          #99.#93       // javax/swing/border/EmptyBorder."<init>":(IIII)V
  #102 = Methodref          #88.#103      // javax/swing/JPanel.setBorder:(Ljavax/swing/border/Border;)V
  #103 = NameAndType        #104:#105     // setBorder:(Ljavax/swing/border/Border;)V
  #104 = Utf8               setBorder
  #105 = Utf8               (Ljavax/swing/border/Border;)V
  #106 = Methodref          #88.#33       // javax/swing/JPanel."<init>":()V
  #107 = Class              #108          // javax/swing/BoxLayout
  #108 = Utf8               javax/swing/BoxLayout
  #109 = Methodref          #107.#110     // javax/swing/BoxLayout."<init>":(Ljava/awt/Container;I)V
  #110 = NameAndType        #35:#111      // "<init>":(Ljava/awt/Container;I)V
  #111 = Utf8               (Ljava/awt/Container;I)V
  #112 = Methodref          #88.#113      // javax/swing/JPanel.setLayout:(Ljava/awt/LayoutManager;)V
  #113 = NameAndType        #114:#97      // setLayout:(Ljava/awt/LayoutManager;)V
  #114 = Utf8               setLayout
  #115 = Methodref          #88.#116      // javax/swing/JPanel.setOpaque:(Z)V
  #116 = NameAndType        #117:#42      // setOpaque:(Z)V
  #117 = Utf8               setOpaque
  #118 = Class              #119          // ext/mods/commons/gui/ModernUI$SectionPanel
  #119 = Utf8               ext/mods/commons/gui/ModernUI$SectionPanel
  #120 = String             #121          // AI & Reaction Time
  #121 = Utf8               AI & Reaction Time
  #122 = Methodref          #118.#123     // ext/mods/commons/gui/ModernUI$SectionPanel."<init>":(Ljava/lang/String;)V
  #123 = NameAndType        #35:#20       // "<init>":(Ljava/lang/String;)V
  #124 = Methodref          #118.#113     // ext/mods/commons/gui/ModernUI$SectionPanel.setLayout:(Ljava/awt/LayoutManager;)V
  #125 = String             #126          // Reaction Delay (ms)
  #126 = Utf8               Reaction Delay (ms)
  #127 = Fieldref           #128.#129     // ext/mods/gameserver/model/actor/move/MovementConfig.ATTACK_FOLLOW_INTERVAL:J
  #128 = Class              #130          // ext/mods/gameserver/model/actor/move/MovementConfig
  #129 = NameAndType        #131:#132     // ATTACK_FOLLOW_INTERVAL:J
  #130 = Utf8               ext/mods/gameserver/model/actor/move/MovementConfig
  #131 = Utf8               ATTACK_FOLLOW_INTERVAL
  #132 = Utf8               J
  #133 = Double             250.0d
  #135 = InvokeDynamic      #2:#136       // #2:accept:()Ljava/util/function/Consumer;
  #136 = NameAndType        #137:#138     // accept:()Ljava/util/function/Consumer;
  #137 = Utf8               accept
  #138 = Utf8               ()Ljava/util/function/Consumer;
  #139 = Methodref          #38.#140      // ext/mods/commons/gui/InterfaceMovementTuner.createSlider:(Ljava/lang/String;IIIDLjava/util/function/Consumer;)Ljavax/swing/JPanel;
  #140 = NameAndType        #141:#142     // createSlider:(Ljava/lang/String;IIIDLjava/util/function/Consumer;)Ljavax/swing/JPanel;
  #141 = Utf8               createSlider
  #142 = Utf8               (Ljava/lang/String;IIIDLjava/util/function/Consumer;)Ljavax/swing/JPanel;
  #143 = Methodref          #118.#144     // ext/mods/commons/gui/ModernUI$SectionPanel.add:(Ljava/awt/Component;)Ljava/awt/Component;
  #144 = NameAndType        #86:#145      // add:(Ljava/awt/Component;)Ljava/awt/Component;
  #145 = Utf8               (Ljava/awt/Component;)Ljava/awt/Component;
  #146 = Methodref          #147.#148     // javax/swing/Box.createVerticalStrut:(I)Ljava/awt/Component;
  #147 = Class              #149          // javax/swing/Box
  #148 = NameAndType        #150:#151     // createVerticalStrut:(I)Ljava/awt/Component;
  #149 = Utf8               javax/swing/Box
  #150 = Utf8               createVerticalStrut
  #151 = Utf8               (I)Ljava/awt/Component;
  #152 = String             #153          // Speed Variation (%)
  #153 = Utf8               Speed Variation (%)
  #154 = Fieldref           #128.#155     // ext/mods/gameserver/model/actor/move/MovementConfig.RANDOM_SPEED_VARIATION:D
  #155 = NameAndType        #156:#157     // RANDOM_SPEED_VARIATION:D
  #156 = Utf8               RANDOM_SPEED_VARIATION
  #157 = Utf8               D
  #158 = Double             100.0d
  #160 = Double             0.1d
  #162 = InvokeDynamic      #3:#136       // #3:accept:()Ljava/util/function/Consumer;
  #163 = Methodref          #88.#144      // javax/swing/JPanel.add:(Ljava/awt/Component;)Ljava/awt/Component;
  #164 = String             #165          // Zig-Zag Geometry
  #165 = Utf8               Zig-Zag Geometry
  #166 = String             #167          // Layer Offset (Dist)
  #167 = Utf8               Layer Offset (Dist)
  #168 = Fieldref           #128.#169     // ext/mods/gameserver/model/actor/move/MovementConfig.ZIGZAG_LAYER_OFFSET:I
  #169 = NameAndType        #170:#171     // ZIGZAG_LAYER_OFFSET:I
  #170 = Utf8               ZIGZAG_LAYER_OFFSET
  #171 = Utf8               I
  #172 = Double             50.0d
  #174 = InvokeDynamic      #4:#136       // #4:accept:()Ljava/util/function/Consumer;
  #175 = String             #176          // Physics & Collision
  #176 = Utf8               Physics & Collision
  #177 = String             #178          // Separation Weight
  #178 = Utf8               Separation Weight
  #179 = Fieldref           #128.#180     // ext/mods/gameserver/model/actor/move/MovementConfig.SEPARATION_WEIGHT:D
  #180 = NameAndType        #181:#157     // SEPARATION_WEIGHT:D
  #181 = Utf8               SEPARATION_WEIGHT
  #182 = Double             8.0d
  #184 = InvokeDynamic      #5:#136       // #5:accept:()Ljava/util/function/Consumer;
  #185 = Class              #186          // javax/swing/JCheckBox
  #186 = Utf8               javax/swing/JCheckBox
  #187 = String             #188          // Enable Telemetry Logs
  #188 = Utf8               Enable Telemetry Logs
  #189 = Methodref          #185.#123     // javax/swing/JCheckBox."<init>":(Ljava/lang/String;)V
  #190 = Fieldref           #57.#191      // ext/mods/commons/gui/ModernUI.TEXT_WHITE:Ljava/awt/Color;
  #191 = NameAndType        #192:#61      // TEXT_WHITE:Ljava/awt/Color;
  #192 = Utf8               TEXT_WHITE
  #193 = Methodref          #185.#194     // javax/swing/JCheckBox.setForeground:(Ljava/awt/Color;)V
  #194 = NameAndType        #195:#65      // setForeground:(Ljava/awt/Color;)V
  #195 = Utf8               setForeground
  #196 = Methodref          #185.#116     // javax/swing/JCheckBox.setOpaque:(Z)V
  #197 = Fieldref           #128.#198     // ext/mods/gameserver/model/actor/move/MovementConfig.DEBUG_ENABLED:Z
  #198 = NameAndType        #199:#200     // DEBUG_ENABLED:Z
  #199 = Utf8               DEBUG_ENABLED
  #200 = Utf8               Z
  #201 = Methodref          #185.#202     // javax/swing/JCheckBox.setSelected:(Z)V
  #202 = NameAndType        #203:#42      // setSelected:(Z)V
  #203 = Utf8               setSelected
  #204 = InvokeDynamic      #6:#205       // #6:actionPerformed:(Ljavax/swing/JCheckBox;)Ljava/awt/event/ActionListener;
  #205 = NameAndType        #206:#207     // actionPerformed:(Ljavax/swing/JCheckBox;)Ljava/awt/event/ActionListener;
  #206 = Utf8               actionPerformed
  #207 = Utf8               (Ljavax/swing/JCheckBox;)Ljava/awt/event/ActionListener;
  #208 = Methodref          #185.#209     // javax/swing/JCheckBox.addActionListener:(Ljava/awt/event/ActionListener;)V
  #209 = NameAndType        #210:#211     // addActionListener:(Ljava/awt/event/ActionListener;)V
  #210 = Utf8               addActionListener
  #211 = Utf8               (Ljava/awt/event/ActionListener;)V
  #212 = Class              #213          // ext/mods/commons/gui/RadarPanel
  #213 = Utf8               ext/mods/commons/gui/RadarPanel
  #214 = Methodref          #212.#33      // ext/mods/commons/gui/RadarPanel."<init>":()V
  #215 = Class              #216          // java/lang/NoClassDefFoundError
  #216 = Utf8               java/lang/NoClassDefFoundError
  #217 = Class              #218          // java/lang/Exception
  #218 = Utf8               java/lang/Exception
  #219 = String             #220          // Radar (Not Found)
  #220 = Utf8               Radar (Not Found)
  #221 = Methodref          #222.#223     // javax/swing/BorderFactory.createTitledBorder:(Ljava/lang/String;)Ljavax/swing/border/TitledBorder;
  #222 = Class              #224          // javax/swing/BorderFactory
  #223 = NameAndType        #225:#226     // createTitledBorder:(Ljava/lang/String;)Ljavax/swing/border/TitledBorder;
  #224 = Utf8               javax/swing/BorderFactory
  #225 = Utf8               createTitledBorder
  #226 = Utf8               (Ljava/lang/String;)Ljavax/swing/border/TitledBorder;
  #227 = String             #228          // Center
  #228 = Utf8               Center
  #229 = Class              #230          // javax/swing/JTextArea
  #230 = Utf8               javax/swing/JTextArea
  #231 = Methodref          #229.#33      // javax/swing/JTextArea."<init>":()V
  #232 = Fieldref           #38.#233      // ext/mods/commons/gui/InterfaceMovementTuner.logArea:Ljavax/swing/JTextArea;
  #233 = NameAndType        #234:#235     // logArea:Ljavax/swing/JTextArea;
  #234 = Utf8               logArea
  #235 = Utf8               Ljavax/swing/JTextArea;
  #236 = Methodref          #229.#237     // javax/swing/JTextArea.setEditable:(Z)V
  #237 = NameAndType        #238:#42      // setEditable:(Z)V
  #238 = Utf8               setEditable
  #239 = Class              #240          // java/awt/Font
  #240 = Utf8               java/awt/Font
  #241 = String             #242          // Consolas
  #242 = Utf8               Consolas
  #243 = Methodref          #239.#244     // java/awt/Font."<init>":(Ljava/lang/String;II)V
  #244 = NameAndType        #35:#245      // "<init>":(Ljava/lang/String;II)V
  #245 = Utf8               (Ljava/lang/String;II)V
  #246 = Methodref          #229.#247     // javax/swing/JTextArea.setFont:(Ljava/awt/Font;)V
  #247 = NameAndType        #248:#249     // setFont:(Ljava/awt/Font;)V
  #248 = Utf8               setFont
  #249 = Utf8               (Ljava/awt/Font;)V
  #250 = Class              #251          // java/awt/Color
  #251 = Utf8               java/awt/Color
  #252 = Methodref          #250.#253     // java/awt/Color."<init>":(III)V
  #253 = NameAndType        #35:#254      // "<init>":(III)V
  #254 = Utf8               (III)V
  #255 = Methodref          #229.#63      // javax/swing/JTextArea.setBackground:(Ljava/awt/Color;)V
  #256 = Fieldref           #57.#257      // ext/mods/commons/gui/ModernUI.NEON_PURPLE:Ljava/awt/Color;
  #257 = NameAndType        #258:#61      // NEON_PURPLE:Ljava/awt/Color;
  #258 = Utf8               NEON_PURPLE
  #259 = Methodref          #229.#194     // javax/swing/JTextArea.setForeground:(Ljava/awt/Color;)V
  #260 = Class              #261          // javax/swing/JScrollPane
  #261 = Utf8               javax/swing/JScrollPane
  #262 = Methodref          #260.#263     // javax/swing/JScrollPane."<init>":(Ljava/awt/Component;)V
  #263 = NameAndType        #35:#55       // "<init>":(Ljava/awt/Component;)V
  #264 = Class              #265          // java/awt/Dimension
  #265 = Utf8               java/awt/Dimension
  #266 = Methodref          #264.#267     // java/awt/Dimension."<init>":(II)V
  #267 = NameAndType        #35:#51       // "<init>":(II)V
  #268 = Methodref          #260.#269     // javax/swing/JScrollPane.setPreferredSize:(Ljava/awt/Dimension;)V
  #269 = NameAndType        #270:#271     // setPreferredSize:(Ljava/awt/Dimension;)V
  #270 = Utf8               setPreferredSize
  #271 = Utf8               (Ljava/awt/Dimension;)V
  #272 = Methodref          #222.#273     // javax/swing/BorderFactory.createMatteBorder:(IIIILjava/awt/Color;)Ljavax/swing/border/MatteBorder;
  #273 = NameAndType        #274:#275     // createMatteBorder:(IIIILjava/awt/Color;)Ljavax/swing/border/MatteBorder;
  #274 = Utf8               createMatteBorder
  #275 = Utf8               (IIIILjava/awt/Color;)Ljavax/swing/border/MatteBorder;
  #276 = Methodref          #260.#103     // javax/swing/JScrollPane.setBorder:(Ljavax/swing/border/Border;)V
  #277 = Methodref          #229.#278     // javax/swing/JTextArea.getCaret:()Ljavax/swing/text/Caret;
  #278 = NameAndType        #279:#280     // getCaret:()Ljavax/swing/text/Caret;
  #279 = Utf8               getCaret
  #280 = Utf8               ()Ljavax/swing/text/Caret;
  #281 = Class              #282          // javax/swing/text/DefaultCaret
  #282 = Utf8               javax/swing/text/DefaultCaret
  #283 = Methodref          #281.#284     // javax/swing/text/DefaultCaret.setUpdatePolicy:(I)V
  #284 = NameAndType        #285:#286     // setUpdatePolicy:(I)V
  #285 = Utf8               setUpdatePolicy
  #286 = Utf8               (I)V
  #287 = String             #288          // South
  #288 = Utf8               South
  #289 = Class              #290          // java/util/Timer
  #290 = Utf8               java/util/Timer
  #291 = String             #292          // Telemetry-Reader
  #292 = Utf8               Telemetry-Reader
  #293 = Methodref          #289.#294     // java/util/Timer."<init>":(Ljava/lang/String;Z)V
  #294 = NameAndType        #35:#295      // "<init>":(Ljava/lang/String;Z)V
  #295 = Utf8               (Ljava/lang/String;Z)V
  #296 = Fieldref           #38.#297      // ext/mods/commons/gui/InterfaceMovementTuner.logTimer:Ljava/util/Timer;
  #297 = NameAndType        #298:#299     // logTimer:Ljava/util/Timer;
  #298 = Utf8               logTimer
  #299 = Utf8               Ljava/util/Timer;
  #300 = Class              #301          // ext/mods/commons/gui/InterfaceMovementTuner$1
  #301 = Utf8               ext/mods/commons/gui/InterfaceMovementTuner$1
  #302 = Methodref          #300.#303     // ext/mods/commons/gui/InterfaceMovementTuner$1."<init>":(Lext/mods/commons/gui/InterfaceMovementTuner;Ljavax/swing/JCheckBox;)V
  #303 = NameAndType        #35:#304      // "<init>":(Lext/mods/commons/gui/InterfaceMovementTuner;Ljavax/swing/JCheckBox;)V
  #304 = Utf8               (Lext/mods/commons/gui/InterfaceMovementTuner;Ljavax/swing/JCheckBox;)V
  #305 = Long               100l
  #307 = Methodref          #289.#308     // java/util/Timer.scheduleAtFixedRate:(Ljava/util/TimerTask;JJ)V
  #308 = NameAndType        #309:#310     // scheduleAtFixedRate:(Ljava/util/TimerTask;JJ)V
  #309 = Utf8               scheduleAtFixedRate
  #310 = Utf8               (Ljava/util/TimerTask;JJ)V
  #311 = Methodref          #80.#33       // java/awt/BorderLayout."<init>":()V
  #312 = String             #313          // Weight
  #313 = Utf8               Weight
  #314 = Methodref          #315.#316     // java/lang/String.contains:(Ljava/lang/CharSequence;)Z
  #315 = Class              #317          // java/lang/String
  #316 = NameAndType        #318:#319     // contains:(Ljava/lang/CharSequence;)Z
  #317 = Utf8               java/lang/String
  #318 = Utf8               contains
  #319 = Utf8               (Ljava/lang/CharSequence;)Z
  #320 = String             #321          // Variation
  #321 = Utf8               Variation
  #322 = String             #323          // Factor
  #323 = Utf8               Factor
  #324 = String             #325          // %.2f
  #325 = Utf8               %.2f
  #326 = Class              #327          // java/lang/Object
  #327 = Utf8               java/lang/Object
  #328 = Methodref          #329.#330     // java/lang/Double.valueOf:(D)Ljava/lang/Double;
  #329 = Class              #331          // java/lang/Double
  #330 = NameAndType        #332:#333     // valueOf:(D)Ljava/lang/Double;
  #331 = Utf8               java/lang/Double
  #332 = Utf8               valueOf
  #333 = Utf8               (D)Ljava/lang/Double;
  #334 = Methodref          #315.#335     // java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
  #335 = NameAndType        #336:#337     // format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
  #336 = Utf8               format
  #337 = Utf8               (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
  #338 = Methodref          #315.#339     // java/lang/String.valueOf:(I)Ljava/lang/String;
  #339 = NameAndType        #332:#340     // valueOf:(I)Ljava/lang/String;
  #340 = Utf8               (I)Ljava/lang/String;
  #341 = Class              #342          // javax/swing/JLabel
  #342 = Utf8               javax/swing/JLabel
  #343 = Methodref          #341.#123     // javax/swing/JLabel."<init>":(Ljava/lang/String;)V
  #344 = Fieldref           #57.#345      // ext/mods/commons/gui/ModernUI.TEXT_GRAY:Ljava/awt/Color;
  #345 = NameAndType        #346:#61      // TEXT_GRAY:Ljava/awt/Color;
  #346 = Utf8               TEXT_GRAY
  #347 = Methodref          #341.#194     // javax/swing/JLabel.setForeground:(Ljava/awt/Color;)V
  #348 = String             #349          // Segoe UI
  #349 = Utf8               Segoe UI
  #350 = Methodref          #341.#247     // javax/swing/JLabel.setFont:(Ljava/awt/Font;)V
  #351 = Methodref          #341.#33      // javax/swing/JLabel."<init>":()V
  #352 = Fieldref           #57.#353      // ext/mods/commons/gui/ModernUI.NEON_CYAN:Ljava/awt/Color;
  #353 = NameAndType        #354:#61      // NEON_CYAN:Ljava/awt/Color;
  #354 = Utf8               NEON_CYAN
  #355 = Methodref          #341.#269     // javax/swing/JLabel.setPreferredSize:(Ljava/awt/Dimension;)V
  #356 = Class              #357          // javax/swing/SwingConstants
  #357 = Utf8               javax/swing/SwingConstants
  #358 = Methodref          #341.#359     // javax/swing/JLabel.setHorizontalAlignment:(I)V
  #359 = NameAndType        #360:#286     // setHorizontalAlignment:(I)V
  #360 = Utf8               setHorizontalAlignment
  #361 = String             #362          // West
  #362 = Utf8               West
  #363 = Methodref          #88.#85       // javax/swing/JPanel.add:(Ljava/awt/Component;Ljava/lang/Object;)V
  #364 = String             #365          // East
  #365 = Utf8               East
  #366 = Class              #367          // javax/swing/JSlider
  #367 = Utf8               javax/swing/JSlider
  #368 = Methodref          #366.#253     // javax/swing/JSlider."<init>":(III)V
  #369 = Methodref          #366.#116     // javax/swing/JSlider.setOpaque:(Z)V
  #370 = Class              #371          // ext/mods/commons/gui/ModernUI$NeonSliderUI
  #371 = Utf8               ext/mods/commons/gui/ModernUI$NeonSliderUI
  #372 = Methodref          #370.#373     // ext/mods/commons/gui/ModernUI$NeonSliderUI."<init>":(Ljavax/swing/JSlider;)V
  #373 = NameAndType        #35:#374      // "<init>":(Ljavax/swing/JSlider;)V
  #374 = Utf8               (Ljavax/swing/JSlider;)V
  #375 = Methodref          #366.#376     // javax/swing/JSlider.setUI:(Ljavax/swing/plaf/SliderUI;)V
  #376 = NameAndType        #377:#378     // setUI:(Ljavax/swing/plaf/SliderUI;)V
  #377 = Utf8               setUI
  #378 = Utf8               (Ljavax/swing/plaf/SliderUI;)V
  #379 = InvokeDynamic      #7:#380       // #7:stateChanged:(Ljavax/swing/JSlider;Ljava/lang/String;Ljavax/swing/JLabel;Ljava/lang/String;Ljava/util/function/Consumer;)Ljavax/swing/event/ChangeListener;
  #380 = NameAndType        #381:#382     // stateChanged:(Ljavax/swing/JSlider;Ljava/lang/String;Ljavax/swing/JLabel;Ljava/lang/String;Ljava/util/function/Consumer;)Ljavax/swing/event/ChangeListener;
  #381 = Utf8               stateChanged
  #382 = Utf8               (Ljavax/swing/JSlider;Ljava/lang/String;Ljavax/swing/JLabel;Ljava/lang/String;Ljava/util/function/Consumer;)Ljavax/swing/event/ChangeListener;
  #383 = Methodref          #366.#384     // javax/swing/JSlider.addChangeListener:(Ljavax/swing/event/ChangeListener;)V
  #384 = NameAndType        #385:#386     // addChangeListener:(Ljavax/swing/event/ChangeListener;)V
  #385 = Utf8               addChangeListener
  #386 = Utf8               (Ljavax/swing/event/ChangeListener;)V
  #387 = Methodref          #366.#388     // javax/swing/JSlider.getChangeListeners:()[Ljavax/swing/event/ChangeListener;
  #388 = NameAndType        #389:#390     // getChangeListeners:()[Ljavax/swing/event/ChangeListener;
  #389 = Utf8               getChangeListeners
  #390 = Utf8               ()[Ljavax/swing/event/ChangeListener;
  #391 = InterfaceMethodref #392.#393     // javax/swing/event/ChangeListener.stateChanged:(Ljavax/swing/event/ChangeEvent;)V
  #392 = Class              #394          // javax/swing/event/ChangeListener
  #393 = NameAndType        #381:#395     // stateChanged:(Ljavax/swing/event/ChangeEvent;)V
  #394 = Utf8               javax/swing/event/ChangeListener
  #395 = Utf8               (Ljavax/swing/event/ChangeEvent;)V
  #396 = Methodref          #366.#397     // javax/swing/JSlider.getValue:()I
  #397 = NameAndType        #398:#399     // getValue:()I
  #398 = Utf8               getValue
  #399 = Utf8               ()I
  #400 = InvokeDynamic      #8:#401       // #8:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #401 = NameAndType        #402:#403     // makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #402 = Utf8               makeConcatWithConstants
  #403 = Utf8               (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #404 = Methodref          #341.#405     // javax/swing/JLabel.setText:(Ljava/lang/String;)V
  #405 = NameAndType        #406:#20      // setText:(Ljava/lang/String;)V
  #406 = Utf8               setText
  #407 = Methodref          #408.#409     // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
  #408 = Class              #410          // java/lang/Integer
  #409 = NameAndType        #332:#411     // valueOf:(I)Ljava/lang/Integer;
  #410 = Utf8               java/lang/Integer
  #411 = Utf8               (I)Ljava/lang/Integer;
  #412 = InterfaceMethodref #413.#414     // java/util/function/Consumer.accept:(Ljava/lang/Object;)V
  #413 = Class              #415          // java/util/function/Consumer
  #414 = NameAndType        #137:#416     // accept:(Ljava/lang/Object;)V
  #415 = Utf8               java/util/function/Consumer
  #416 = Utf8               (Ljava/lang/Object;)V
  #417 = Methodref          #185.#418     // javax/swing/JCheckBox.isSelected:()Z
  #418 = NameAndType        #419:#6       // isSelected:()Z
  #419 = Utf8               isSelected
  #420 = Methodref          #408.#421     // java/lang/Integer.intValue:()I
  #421 = NameAndType        #422:#399     // intValue:()I
  #422 = Utf8               intValue
  #423 = Methodref          #289.#424     // java/util/Timer.cancel:()V
  #424 = NameAndType        #425:#36      // cancel:()V
  #425 = Utf8               cancel
  #426 = Methodref          #38.#427      // ext/mods/commons/gui/InterfaceMovementTuner.dispose:()V
  #427 = NameAndType        #428:#36      // dispose:()V
  #428 = Utf8               dispose
  #429 = Methodref          #38.#33       // ext/mods/commons/gui/InterfaceMovementTuner."<init>":()V
  #430 = Methodref          #38.#431      // ext/mods/commons/gui/InterfaceMovementTuner.setVisible:(Z)V
  #431 = NameAndType        #432:#42      // setVisible:(Z)V
  #432 = Utf8               setVisible
  #433 = Utf8               open
  #434 = Utf8               Code
  #435 = Utf8               LineNumberTable
  #436 = Utf8               StackMapTable
  #437 = Utf8               LocalVariableTable
  #438 = Utf8               placeholder
  #439 = Utf8               Ljavax/swing/JPanel;
  #440 = Utf8               e
  #441 = Utf8               Ljava/lang/Throwable;
  #442 = Utf8               this
  #443 = Utf8               Lext/mods/commons/gui/InterfaceMovementTuner;
  #444 = Utf8               closeAction
  #445 = Utf8               Ljava/lang/Runnable;
  #446 = Utf8               centerPanel
  #447 = Utf8               controlsPanel
  #448 = Utf8               pnlAI
  #449 = Utf8               Lext/mods/commons/gui/ModernUI$SectionPanel;
  #450 = Utf8               pnlZigZag
  #451 = Utf8               pnlPhysics
  #452 = Utf8               chkDebug
  #453 = Utf8               Ljavax/swing/JCheckBox;
  #454 = Utf8               scrollLog
  #455 = Utf8               Ljavax/swing/JScrollPane;
  #456 = Utf8               caret
  #457 = Utf8               Ljavax/swing/text/DefaultCaret;
  #458 = Class              #459          // java/lang/Runnable
  #459 = Utf8               java/lang/Runnable
  #460 = Class              #461          // java/lang/Throwable
  #461 = Utf8               java/lang/Throwable
  #462 = Utf8               title
  #463 = Utf8               Ljava/lang/String;
  #464 = Utf8               min
  #465 = Utf8               max
  #466 = Utf8               initial
  #467 = Utf8               defaultValue
  #468 = Utf8               onChange
  #469 = Utf8               Ljava/util/function/Consumer;
  #470 = Utf8               panel
  #471 = Utf8               defStr
  #472 = Utf8               lblTitle
  #473 = Utf8               Ljavax/swing/JLabel;
  #474 = Utf8               lblValue
  #475 = Utf8               top
  #476 = Utf8               slider
  #477 = Utf8               Ljavax/swing/JSlider;
  #478 = Utf8               LocalVariableTypeTable
  #479 = Utf8               Ljava/util/function/Consumer<Ljava/lang/Integer;>;
  #480 = Utf8               Signature
  #481 = Utf8               (Ljava/lang/String;IIIDLjava/util/function/Consumer<Ljava/lang/Integer;>;)Ljavax/swing/JPanel;
  #482 = Utf8               lambda$createSlider$0
  #483 = Utf8               (Ljavax/swing/JSlider;Ljava/lang/String;Ljavax/swing/JLabel;Ljava/lang/String;Ljava/util/function/Consumer;Ljavax/swing/event/ChangeEvent;)V
  #484 = Utf8               currentStr
  #485 = Utf8               Ljavax/swing/event/ChangeEvent;
  #486 = Utf8               val
  #487 = Utf8               lambda$new$5
  #488 = Utf8               (Ljavax/swing/JCheckBox;Ljava/awt/event/ActionEvent;)V
  #489 = Utf8               Ljava/awt/event/ActionEvent;
  #490 = Utf8               lambda$new$4
  #491 = Utf8               (Ljava/lang/Integer;)V
  #492 = Utf8               Ljava/lang/Integer;
  #493 = Utf8               lambda$new$3
  #494 = Utf8               lambda$new$2
  #495 = Utf8               lambda$new$1
  #496 = Utf8               lambda$new$0
  #497 = Utf8               lambda$open$0
  #498 = Utf8               SourceFile
  #499 = Utf8               InterfaceMovementTuner.java
  #500 = Utf8               NestMembers
  #501 = Utf8               BootstrapMethods
  #502 = MethodType         #36           //  ()V
  #503 = MethodHandle       6:#504        // REF_invokeStatic ext/mods/commons/gui/InterfaceMovementTuner.lambda$open$0:()V
  #504 = Methodref          #38.#505      // ext/mods/commons/gui/InterfaceMovementTuner.lambda$open$0:()V
  #505 = NameAndType        #497:#36      // lambda$open$0:()V
  #506 = MethodHandle       5:#507        // REF_invokeVirtual ext/mods/commons/gui/InterfaceMovementTuner.lambda$new$0:()V
  #507 = Methodref          #38.#508      // ext/mods/commons/gui/InterfaceMovementTuner.lambda$new$0:()V
  #508 = NameAndType        #496:#36      // lambda$new$0:()V
  #509 = MethodType         #416          //  (Ljava/lang/Object;)V
  #510 = MethodHandle       6:#511        // REF_invokeStatic ext/mods/commons/gui/InterfaceMovementTuner.lambda$new$1:(Ljava/lang/Integer;)V
  #511 = Methodref          #38.#512      // ext/mods/commons/gui/InterfaceMovementTuner.lambda$new$1:(Ljava/lang/Integer;)V
  #512 = NameAndType        #495:#491     // lambda$new$1:(Ljava/lang/Integer;)V
  #513 = MethodType         #491          //  (Ljava/lang/Integer;)V
  #514 = MethodHandle       6:#515        // REF_invokeStatic ext/mods/commons/gui/InterfaceMovementTuner.lambda$new$2:(Ljava/lang/Integer;)V
  #515 = Methodref          #38.#516      // ext/mods/commons/gui/InterfaceMovementTuner.lambda$new$2:(Ljava/lang/Integer;)V
  #516 = NameAndType        #494:#491     // lambda$new$2:(Ljava/lang/Integer;)V
  #517 = MethodHandle       6:#518        // REF_invokeStatic ext/mods/commons/gui/InterfaceMovementTuner.lambda$new$3:(Ljava/lang/Integer;)V
  #518 = Methodref          #38.#519      // ext/mods/commons/gui/InterfaceMovementTuner.lambda$new$3:(Ljava/lang/Integer;)V
  #519 = NameAndType        #493:#491     // lambda$new$3:(Ljava/lang/Integer;)V
  #520 = MethodHandle       6:#521        // REF_invokeStatic ext/mods/commons/gui/InterfaceMovementTuner.lambda$new$4:(Ljava/lang/Integer;)V
  #521 = Methodref          #38.#522      // ext/mods/commons/gui/InterfaceMovementTuner.lambda$new$4:(Ljava/lang/Integer;)V
  #522 = NameAndType        #490:#491     // lambda$new$4:(Ljava/lang/Integer;)V
  #523 = MethodType         #524          //  (Ljava/awt/event/ActionEvent;)V
  #524 = Utf8               (Ljava/awt/event/ActionEvent;)V
  #525 = MethodHandle       6:#526        // REF_invokeStatic ext/mods/commons/gui/InterfaceMovementTuner.lambda$new$5:(Ljavax/swing/JCheckBox;Ljava/awt/event/ActionEvent;)V
  #526 = Methodref          #38.#527      // ext/mods/commons/gui/InterfaceMovementTuner.lambda$new$5:(Ljavax/swing/JCheckBox;Ljava/awt/event/ActionEvent;)V
  #527 = NameAndType        #487:#488     // lambda$new$5:(Ljavax/swing/JCheckBox;Ljava/awt/event/ActionEvent;)V
  #528 = MethodType         #395          //  (Ljavax/swing/event/ChangeEvent;)V
  #529 = MethodHandle       6:#530        // REF_invokeStatic ext/mods/commons/gui/InterfaceMovementTuner.lambda$createSlider$0:(Ljavax/swing/JSlider;Ljava/lang/String;Ljavax/swing/JLabel;Ljava/lang/String;Ljava/util/function/Consumer;Ljavax/swing/event/ChangeEvent;)V
  #530 = Methodref          #38.#531      // ext/mods/commons/gui/InterfaceMovementTuner.lambda$createSlider$0:(Ljavax/swing/JSlider;Ljava/lang/String;Ljavax/swing/JLabel;Ljava/lang/String;Ljava/util/function/Consumer;Ljavax/swing/event/ChangeEvent;)V
  #531 = NameAndType        #482:#483     // lambda$createSlider$0:(Ljavax/swing/JSlider;Ljava/lang/String;Ljavax/swing/JLabel;Ljava/lang/String;Ljava/util/function/Consumer;Ljavax/swing/event/ChangeEvent;)V
  #532 = String             #533          // \u0001 (Def: \u0001)
  #533 = Utf8               \u0001 (Def: \u0001)
  #534 = MethodHandle       6:#535        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #535 = Methodref          #536.#537     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #536 = Class              #538          // java/lang/invoke/LambdaMetafactory
  #537 = NameAndType        #539:#540     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #538 = Utf8               java/lang/invoke/LambdaMetafactory
  #539 = Utf8               metafactory
  #540 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #541 = MethodHandle       6:#542        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #542 = Methodref          #543.#544     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #543 = Class              #545          // java/lang/invoke/StringConcatFactory
  #544 = NameAndType        #402:#546     // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #545 = Utf8               java/lang/invoke/StringConcatFactory
  #546 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #547 = Utf8               InnerClasses
  #548 = Utf8               SectionPanel
  #549 = Utf8               NeonSliderUI
  #550 = Class              #551          // java/lang/invoke/MethodHandles$Lookup
  #551 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #552 = Class              #553          // java/lang/invoke/MethodHandles
  #553 = Utf8               java/lang/invoke/MethodHandles
  #554 = Utf8               Lookup
{
  public static void open();
    descriptor: ()V
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=0, args_size=0
         0: invokestatic  #1                  // Method java/awt/GraphicsEnvironment.isHeadless:()Z
         3: ifeq          15
         6: getstatic     #7                  // Field java/lang/System.out:Ljava/io/PrintStream;
         9: ldc           #13                 // String [MovementTuner] Cannot open GUI in Headless environment (No Graphics).
        11: invokevirtual #15                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
        14: return
        15: invokedynamic #21,  0             // InvokeDynamic #0:run:()Ljava/lang/Runnable;
        20: invokestatic  #25                 // Method javax/swing/SwingUtilities.invokeLater:(Ljava/lang/Runnable;)V
        23: return
      LineNumberTable:
        line 36: 0
        line 37: 6
        line 38: 14
        line 40: 15
        line 41: 23
      StackMapTable: number_of_entries = 1
        frame_type = 15 /* same */

  public ext.mods.commons.gui.InterfaceMovementTuner();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=9, locals=10, args_size=1
         0: aload_0
         1: invokespecial #31                 // Method javax/swing/JFrame."<init>":()V
         4: aload_0
         5: iconst_1
         6: invokevirtual #37                 // Method setUndecorated:(Z)V
         9: aload_0
        10: ldc           #43                 // String Monsters Movement Tuner v2.1 (Zero GC Optimized)
        12: invokevirtual #45                 // Method setTitle:(Ljava/lang/String;)V
        15: aload_0
        16: sipush        950
        19: sipush        650
        22: invokevirtual #48                 // Method setSize:(II)V
        25: aload_0
        26: aconst_null
        27: invokevirtual #52                 // Method setLocationRelativeTo:(Ljava/awt/Component;)V
        30: aload_0
        31: getstatic     #56                 // Field ext/mods/commons/gui/ModernUI.BG_DARK:Ljava/awt/Color;
        34: invokevirtual #62                 // Method setBackground:(Ljava/awt/Color;)V
        37: aload_0
        38: invokedynamic #66,  0             // InvokeDynamic #1:run:(Lext/mods/commons/gui/InterfaceMovementTuner;)Ljava/lang/Runnable;
        43: astore_1
        44: aload_0
        45: new           #69                 // class ext/mods/commons/gui/CustomTopPanel
        48: dup
        49: aload_0
        50: aconst_null
        51: aload_1
        52: iconst_0
        53: ldc           #71                 // String images/16x16.png
        55: invokespecial #73                 // Method ext/mods/commons/gui/CustomTopPanel."<init>":(Ljavax/swing/JFrame;Ljavax/swing/JMenuBar;Ljava/lang/Runnable;ZLjava/lang/String;)V
        58: putfield      #76                 // Field topPanel:Lext/mods/commons/gui/CustomTopPanel;
        61: aload_0
        62: aload_0
        63: getfield      #76                 // Field topPanel:Lext/mods/commons/gui/CustomTopPanel;
        66: ldc           #82                 // String North
        68: invokevirtual #84                 // Method add:(Ljava/awt/Component;Ljava/lang/Object;)V
        71: new           #88                 // class javax/swing/JPanel
        74: dup
        75: new           #90                 // class java/awt/GridLayout
        78: dup
        79: iconst_1
        80: iconst_2
        81: bipush        10
        83: iconst_0
        84: invokespecial #92                 // Method java/awt/GridLayout."<init>":(IIII)V
        87: invokespecial #95                 // Method javax/swing/JPanel."<init>":(Ljava/awt/LayoutManager;)V
        90: astore_2
        91: aload_2
        92: getstatic     #56                 // Field ext/mods/commons/gui/ModernUI.BG_DARK:Ljava/awt/Color;
        95: invokevirtual #98                 // Method javax/swing/JPanel.setBackground:(Ljava/awt/Color;)V
        98: aload_2
        99: new           #99                 // class javax/swing/border/EmptyBorder
       102: dup
       103: bipush        10
       105: bipush        10
       107: bipush        10
       109: bipush        10
       111: invokespecial #101                // Method javax/swing/border/EmptyBorder."<init>":(IIII)V
       114: invokevirtual #102                // Method javax/swing/JPanel.setBorder:(Ljavax/swing/border/Border;)V
       117: new           #88                 // class javax/swing/JPanel
       120: dup
       121: invokespecial #106                // Method javax/swing/JPanel."<init>":()V
       124: astore_3
       125: aload_3
       126: new           #107                // class javax/swing/BoxLayout
       129: dup
       130: aload_3
       131: iconst_1
       132: invokespecial #109                // Method javax/swing/BoxLayout."<init>":(Ljava/awt/Container;I)V
       135: invokevirtual #112                // Method javax/swing/JPanel.setLayout:(Ljava/awt/LayoutManager;)V
       138: aload_3
       139: iconst_0
       140: invokevirtual #115                // Method javax/swing/JPanel.setOpaque:(Z)V
       143: new           #118                // class ext/mods/commons/gui/ModernUI$SectionPanel
       146: dup
       147: ldc           #120                // String AI & Reaction Time
       149: invokespecial #122                // Method ext/mods/commons/gui/ModernUI$SectionPanel."<init>":(Ljava/lang/String;)V
       152: astore        4
       154: aload         4
       156: new           #107                // class javax/swing/BoxLayout
       159: dup
       160: aload         4
       162: iconst_1
       163: invokespecial #109                // Method javax/swing/BoxLayout."<init>":(Ljava/awt/Container;I)V
       166: invokevirtual #124                // Method ext/mods/commons/gui/ModernUI$SectionPanel.setLayout:(Ljava/awt/LayoutManager;)V
       169: aload         4
       171: aload_0
       172: ldc           #125                // String Reaction Delay (ms)
       174: bipush        100
       176: sipush        1000
       179: getstatic     #127                // Field ext/mods/gameserver/model/actor/move/MovementConfig.ATTACK_FOLLOW_INTERVAL:J
       182: l2i
       183: ldc2_w        #133                // double 250.0d
       186: invokedynamic #135,  0            // InvokeDynamic #2:accept:()Ljava/util/function/Consumer;
       191: invokevirtual #139                // Method createSlider:(Ljava/lang/String;IIIDLjava/util/function/Consumer;)Ljavax/swing/JPanel;
       194: invokevirtual #143                // Method ext/mods/commons/gui/ModernUI$SectionPanel.add:(Ljava/awt/Component;)Ljava/awt/Component;
       197: pop
       198: aload         4
       200: iconst_5
       201: invokestatic  #146                // Method javax/swing/Box.createVerticalStrut:(I)Ljava/awt/Component;
       204: invokevirtual #143                // Method ext/mods/commons/gui/ModernUI$SectionPanel.add:(Ljava/awt/Component;)Ljava/awt/Component;
       207: pop
       208: aload         4
       210: aload_0
       211: ldc           #152                // String Speed Variation (%)
       213: iconst_0
       214: bipush        50
       216: getstatic     #154                // Field ext/mods/gameserver/model/actor/move/MovementConfig.RANDOM_SPEED_VARIATION:D
       219: ldc2_w        #158                // double 100.0d
       222: dmul
       223: d2i
       224: ldc2_w        #160                // double 0.1d
       227: invokedynamic #162,  0            // InvokeDynamic #3:accept:()Ljava/util/function/Consumer;
       232: invokevirtual #139                // Method createSlider:(Ljava/lang/String;IIIDLjava/util/function/Consumer;)Ljavax/swing/JPanel;
       235: invokevirtual #143                // Method ext/mods/commons/gui/ModernUI$SectionPanel.add:(Ljava/awt/Component;)Ljava/awt/Component;
       238: pop
       239: aload_3
       240: aload         4
       242: invokevirtual #163                // Method javax/swing/JPanel.add:(Ljava/awt/Component;)Ljava/awt/Component;
       245: pop
       246: aload_3
       247: bipush        10
       249: invokestatic  #146                // Method javax/swing/Box.createVerticalStrut:(I)Ljava/awt/Component;
       252: invokevirtual #163                // Method javax/swing/JPanel.add:(Ljava/awt/Component;)Ljava/awt/Component;
       255: pop
       256: new           #118                // class ext/mods/commons/gui/ModernUI$SectionPanel
       259: dup
       260: ldc           #164                // String Zig-Zag Geometry
       262: invokespecial #122                // Method ext/mods/commons/gui/ModernUI$SectionPanel."<init>":(Ljava/lang/String;)V
       265: astore        5
       267: aload         5
       269: new           #107                // class javax/swing/BoxLayout
       272: dup
       273: aload         5
       275: iconst_1
       276: invokespecial #109                // Method javax/swing/BoxLayout."<init>":(Ljava/awt/Container;I)V
       279: invokevirtual #124                // Method ext/mods/commons/gui/ModernUI$SectionPanel.setLayout:(Ljava/awt/LayoutManager;)V
       282: aload         5
       284: aload_0
       285: ldc           #166                // String Layer Offset (Dist)
       287: iconst_0
       288: sipush        150
       291: getstatic     #168                // Field ext/mods/gameserver/model/actor/move/MovementConfig.ZIGZAG_LAYER_OFFSET:I
       294: ldc2_w        #172                // double 50.0d
       297: invokedynamic #174,  0            // InvokeDynamic #4:accept:()Ljava/util/function/Consumer;
       302: invokevirtual #139                // Method createSlider:(Ljava/lang/String;IIIDLjava/util/function/Consumer;)Ljavax/swing/JPanel;
       305: invokevirtual #143                // Method ext/mods/commons/gui/ModernUI$SectionPanel.add:(Ljava/awt/Component;)Ljava/awt/Component;
       308: pop
       309: aload_3
       310: aload         5
       312: invokevirtual #163                // Method javax/swing/JPanel.add:(Ljava/awt/Component;)Ljava/awt/Component;
       315: pop
       316: aload_3
       317: bipush        10
       319: invokestatic  #146                // Method javax/swing/Box.createVerticalStrut:(I)Ljava/awt/Component;
       322: invokevirtual #163                // Method javax/swing/JPanel.add:(Ljava/awt/Component;)Ljava/awt/Component;
       325: pop
       326: new           #118                // class ext/mods/commons/gui/ModernUI$SectionPanel
       329: dup
       330: ldc           #175                // String Physics & Collision
       332: invokespecial #122                // Method ext/mods/commons/gui/ModernUI$SectionPanel."<init>":(Ljava/lang/String;)V
       335: astore        6
       337: aload         6
       339: new           #107                // class javax/swing/BoxLayout
       342: dup
       343: aload         6
       345: iconst_1
       346: invokespecial #109                // Method javax/swing/BoxLayout."<init>":(Ljava/awt/Container;I)V
       349: invokevirtual #124                // Method ext/mods/commons/gui/ModernUI$SectionPanel.setLayout:(Ljava/awt/LayoutManager;)V
       352: aload         6
       354: aload_0
       355: ldc           #177                // String Separation Weight
       357: iconst_0
       358: sipush        500
       361: getstatic     #179                // Field ext/mods/gameserver/model/actor/move/MovementConfig.SEPARATION_WEIGHT:D
       364: ldc2_w        #158                // double 100.0d
       367: dmul
       368: d2i
       369: ldc2_w        #182                // double 8.0d
       372: invokedynamic #184,  0            // InvokeDynamic #5:accept:()Ljava/util/function/Consumer;
       377: invokevirtual #139                // Method createSlider:(Ljava/lang/String;IIIDLjava/util/function/Consumer;)Ljavax/swing/JPanel;
       380: invokevirtual #143                // Method ext/mods/commons/gui/ModernUI$SectionPanel.add:(Ljava/awt/Component;)Ljava/awt/Component;
       383: pop
       384: aload_3
       385: aload         6
       387: invokevirtual #163                // Method javax/swing/JPanel.add:(Ljava/awt/Component;)Ljava/awt/Component;
       390: pop
       391: new           #185                // class javax/swing/JCheckBox
       394: dup
       395: ldc           #187                // String Enable Telemetry Logs
       397: invokespecial #189                // Method javax/swing/JCheckBox."<init>":(Ljava/lang/String;)V
       400: astore        7
       402: aload         7
       404: getstatic     #190                // Field ext/mods/commons/gui/ModernUI.TEXT_WHITE:Ljava/awt/Color;
       407: invokevirtual #193                // Method javax/swing/JCheckBox.setForeground:(Ljava/awt/Color;)V
       410: aload         7
       412: iconst_0
       413: invokevirtual #196                // Method javax/swing/JCheckBox.setOpaque:(Z)V
       416: aload         7
       418: getstatic     #197                // Field ext/mods/gameserver/model/actor/move/MovementConfig.DEBUG_ENABLED:Z
       421: invokevirtual #201                // Method javax/swing/JCheckBox.setSelected:(Z)V
       424: aload         7
       426: aload         7
       428: invokedynamic #204,  0            // InvokeDynamic #6:actionPerformed:(Ljavax/swing/JCheckBox;)Ljava/awt/event/ActionListener;
       433: invokevirtual #208                // Method javax/swing/JCheckBox.addActionListener:(Ljava/awt/event/ActionListener;)V
       436: aload_3
       437: bipush        10
       439: invokestatic  #146                // Method javax/swing/Box.createVerticalStrut:(I)Ljava/awt/Component;
       442: invokevirtual #163                // Method javax/swing/JPanel.add:(Ljava/awt/Component;)Ljava/awt/Component;
       445: pop
       446: aload_3
       447: aload         7
       449: invokevirtual #163                // Method javax/swing/JPanel.add:(Ljava/awt/Component;)Ljava/awt/Component;
       452: pop
       453: aload_2
       454: aload_3
       455: invokevirtual #163                // Method javax/swing/JPanel.add:(Ljava/awt/Component;)Ljava/awt/Component;
       458: pop
       459: aload_2
       460: new           #212                // class ext/mods/commons/gui/RadarPanel
       463: dup
       464: invokespecial #214                // Method ext/mods/commons/gui/RadarPanel."<init>":()V
       467: invokevirtual #163                // Method javax/swing/JPanel.add:(Ljava/awt/Component;)Ljava/awt/Component;
       470: pop
       471: goto          508
       474: astore        8
       476: new           #88                 // class javax/swing/JPanel
       479: dup
       480: invokespecial #106                // Method javax/swing/JPanel."<init>":()V
       483: astore        9
       485: aload         9
       487: iconst_0
       488: invokevirtual #115                // Method javax/swing/JPanel.setOpaque:(Z)V
       491: aload         9
       493: ldc           #219                // String Radar (Not Found)
       495: invokestatic  #221                // Method javax/swing/BorderFactory.createTitledBorder:(Ljava/lang/String;)Ljavax/swing/border/TitledBorder;
       498: invokevirtual #102                // Method javax/swing/JPanel.setBorder:(Ljavax/swing/border/Border;)V
       501: aload_2
       502: aload         9
       504: invokevirtual #163                // Method javax/swing/JPanel.add:(Ljava/awt/Component;)Ljava/awt/Component;
       507: pop
       508: aload_0
       509: aload_2
       510: ldc           #227                // String Center
       512: invokevirtual #84                 // Method add:(Ljava/awt/Component;Ljava/lang/Object;)V
       515: aload_0
       516: new           #229                // class javax/swing/JTextArea
       519: dup
       520: invokespecial #231                // Method javax/swing/JTextArea."<init>":()V
       523: putfield      #232                // Field logArea:Ljavax/swing/JTextArea;
       526: aload_0
       527: getfield      #232                // Field logArea:Ljavax/swing/JTextArea;
       530: iconst_0
       531: invokevirtual #236                // Method javax/swing/JTextArea.setEditable:(Z)V
       534: aload_0
       535: getfield      #232                // Field logArea:Ljavax/swing/JTextArea;
       538: new           #239                // class java/awt/Font
       541: dup
       542: ldc           #241                // String Consolas
       544: iconst_0
       545: bipush        11
       547: invokespecial #243                // Method java/awt/Font."<init>":(Ljava/lang/String;II)V
       550: invokevirtual #246                // Method javax/swing/JTextArea.setFont:(Ljava/awt/Font;)V
       553: aload_0
       554: getfield      #232                // Field logArea:Ljavax/swing/JTextArea;
       557: new           #250                // class java/awt/Color
       560: dup
       561: bipush        10
       563: bipush        10
       565: bipush        15
       567: invokespecial #252                // Method java/awt/Color."<init>":(III)V
       570: invokevirtual #255                // Method javax/swing/JTextArea.setBackground:(Ljava/awt/Color;)V
       573: aload_0
       574: getfield      #232                // Field logArea:Ljavax/swing/JTextArea;
       577: getstatic     #256                // Field ext/mods/commons/gui/ModernUI.NEON_PURPLE:Ljava/awt/Color;
       580: invokevirtual #259                // Method javax/swing/JTextArea.setForeground:(Ljava/awt/Color;)V
       583: new           #260                // class javax/swing/JScrollPane
       586: dup
       587: aload_0
       588: getfield      #232                // Field logArea:Ljavax/swing/JTextArea;
       591: invokespecial #262                // Method javax/swing/JScrollPane."<init>":(Ljava/awt/Component;)V
       594: astore        8
       596: aload         8
       598: new           #264                // class java/awt/Dimension
       601: dup
       602: iconst_0
       603: bipush        120
       605: invokespecial #266                // Method java/awt/Dimension."<init>":(II)V
       608: invokevirtual #268                // Method javax/swing/JScrollPane.setPreferredSize:(Ljava/awt/Dimension;)V
       611: aload         8
       613: iconst_1
       614: iconst_0
       615: iconst_0
       616: iconst_0
       617: getstatic     #256                // Field ext/mods/commons/gui/ModernUI.NEON_PURPLE:Ljava/awt/Color;
       620: invokestatic  #272                // Method javax/swing/BorderFactory.createMatteBorder:(IIIILjava/awt/Color;)Ljavax/swing/border/MatteBorder;
       623: invokevirtual #276                // Method javax/swing/JScrollPane.setBorder:(Ljavax/swing/border/Border;)V
       626: aload_0
       627: getfield      #232                // Field logArea:Ljavax/swing/JTextArea;
       630: invokevirtual #277                // Method javax/swing/JTextArea.getCaret:()Ljavax/swing/text/Caret;
       633: checkcast     #281                // class javax/swing/text/DefaultCaret
       636: astore        9
       638: aload         9
       640: iconst_2
       641: invokevirtual #283                // Method javax/swing/text/DefaultCaret.setUpdatePolicy:(I)V
       644: aload_0
       645: aload         8
       647: ldc_w         #287                // String South
       650: invokevirtual #84                 // Method add:(Ljava/awt/Component;Ljava/lang/Object;)V
       653: aload_0
       654: new           #289                // class java/util/Timer
       657: dup
       658: ldc_w         #291                // String Telemetry-Reader
       661: iconst_1
       662: invokespecial #293                // Method java/util/Timer."<init>":(Ljava/lang/String;Z)V
       665: putfield      #296                // Field logTimer:Ljava/util/Timer;
       668: aload_0
       669: getfield      #296                // Field logTimer:Ljava/util/Timer;
       672: new           #300                // class ext/mods/commons/gui/InterfaceMovementTuner$1
       675: dup
       676: aload_0
       677: aload         7
       679: invokespecial #302                // Method ext/mods/commons/gui/InterfaceMovementTuner$1."<init>":(Lext/mods/commons/gui/InterfaceMovementTuner;Ljavax/swing/JCheckBox;)V
       682: lconst_0
       683: ldc2_w        #305                // long 100l
       686: invokevirtual #307                // Method java/util/Timer.scheduleAtFixedRate:(Ljava/util/TimerTask;JJ)V
       689: return
      Exception table:
         from    to  target type
           459   471   474   Class java/lang/NoClassDefFoundError
           459   471   474   Class java/lang/Exception
      LineNumberTable:
        line 43: 0
        line 44: 4
        line 45: 9
        line 46: 15
        line 47: 25
        line 48: 30
        line 50: 37
        line 55: 44
        line 56: 61
        line 58: 71
        line 59: 91
        line 60: 98
        line 62: 117
        line 63: 125
        line 64: 138
        line 66: 143
        line 67: 154
        line 69: 169
        line 70: 198
        line 71: 208
        line 73: 239
        line 74: 246
        line 76: 256
        line 77: 267
        line 79: 282
        line 81: 309
        line 82: 316
        line 84: 326
        line 85: 337
        line 87: 352
        line 89: 384
        line 91: 391
        line 92: 402
        line 93: 410
        line 94: 416
        line 95: 424
        line 97: 436
        line 98: 446
        line 100: 453
        line 103: 459
        line 109: 471
        line 104: 474
        line 105: 476
        line 106: 485
        line 107: 491
        line 108: 501
        line 111: 508
        line 113: 515
        line 114: 526
        line 115: 534
        line 116: 553
        line 117: 573
        line 119: 583
        line 120: 596
        line 121: 611
        line 123: 626
        line 124: 638
        line 126: 644
        line 128: 653
        line 129: 668
        line 145: 689
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          485      23     9 placeholder   Ljavax/swing/JPanel;
          476      32     8     e   Ljava/lang/Throwable;
            0     690     0  this   Lext/mods/commons/gui/InterfaceMovementTuner;
           44     646     1 closeAction   Ljava/lang/Runnable;
           91     599     2 centerPanel   Ljavax/swing/JPanel;
          125     565     3 controlsPanel   Ljavax/swing/JPanel;
          154     536     4 pnlAI   Lext/mods/commons/gui/ModernUI$SectionPanel;
          267     423     5 pnlZigZag   Lext/mods/commons/gui/ModernUI$SectionPanel;
          337     353     6 pnlPhysics   Lext/mods/commons/gui/ModernUI$SectionPanel;
          402     288     7 chkDebug   Ljavax/swing/JCheckBox;
          596      94     8 scrollLog   Ljavax/swing/JScrollPane;
          638      52     9 caret   Ljavax/swing/text/DefaultCaret;
      StackMapTable: number_of_entries = 2
        frame_type = 255 /* full_frame */
          offset_delta = 474
          locals = [ class ext/mods/commons/gui/InterfaceMovementTuner, class java/lang/Runnable, class javax/swing/JPanel, class javax/swing/JPanel, class ext/mods/commons/gui/ModernUI$SectionPanel, class ext/mods/commons/gui/ModernUI$SectionPanel, class ext/mods/commons/gui/ModernUI$SectionPanel, class javax/swing/JCheckBox ]
          stack = [ class java/lang/Throwable ]
        frame_type = 33 /* same */
}
SourceFile: "InterfaceMovementTuner.java"
NestMembers:
  ext/mods/commons/gui/InterfaceMovementTuner$1
BootstrapMethods:
  0: #534 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #502 ()V
      #503 REF_invokeStatic ext/mods/commons/gui/InterfaceMovementTuner.lambda$open$0:()V
      #502 ()V
  1: #534 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #502 ()V
      #506 REF_invokeVirtual ext/mods/commons/gui/InterfaceMovementTuner.lambda$new$0:()V
      #502 ()V
  2: #534 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #509 (Ljava/lang/Object;)V
      #510 REF_invokeStatic ext/mods/commons/gui/InterfaceMovementTuner.lambda$new$1:(Ljava/lang/Integer;)V
      #513 (Ljava/lang/Integer;)V
  3: #534 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #509 (Ljava/lang/Object;)V
      #514 REF_invokeStatic ext/mods/commons/gui/InterfaceMovementTuner.lambda$new$2:(Ljava/lang/Integer;)V
      #513 (Ljava/lang/Integer;)V
  4: #534 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #509 (Ljava/lang/Object;)V
      #517 REF_invokeStatic ext/mods/commons/gui/InterfaceMovementTuner.lambda$new$3:(Ljava/lang/Integer;)V
      #513 (Ljava/lang/Integer;)V
  5: #534 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #509 (Ljava/lang/Object;)V
      #520 REF_invokeStatic ext/mods/commons/gui/InterfaceMovementTuner.lambda$new$4:(Ljava/lang/Integer;)V
      #513 (Ljava/lang/Integer;)V
  6: #534 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #523 (Ljava/awt/event/ActionEvent;)V
      #525 REF_invokeStatic ext/mods/commons/gui/InterfaceMovementTuner.lambda$new$5:(Ljavax/swing/JCheckBox;Ljava/awt/event/ActionEvent;)V
      #523 (Ljava/awt/event/ActionEvent;)V
  7: #534 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #528 (Ljavax/swing/event/ChangeEvent;)V
      #529 REF_invokeStatic ext/mods/commons/gui/InterfaceMovementTuner.lambda$createSlider$0:(Ljavax/swing/JSlider;Ljava/lang/String;Ljavax/swing/JLabel;Ljava/lang/String;Ljava/util/function/Consumer;Ljavax/swing/event/ChangeEvent;)V
      #528 (Ljavax/swing/event/ChangeEvent;)V
  8: #541 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #532 \u0001 (Def: \u0001)
InnerClasses:
  public static #548= #118 of #57;        // SectionPanel=class ext/mods/commons/gui/ModernUI$SectionPanel of class ext/mods/commons/gui/ModernUI
  #300;                                   // class ext/mods/commons/gui/InterfaceMovementTuner$1
  public static #549= #370 of #57;        // NeonSliderUI=class ext/mods/commons/gui/ModernUI$NeonSliderUI of class ext/mods/commons/gui/ModernUI
  public static final #554= #550 of #552; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
