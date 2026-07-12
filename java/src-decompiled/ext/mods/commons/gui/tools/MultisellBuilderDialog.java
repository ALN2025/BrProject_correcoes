// Bytecode for: ext.mods.commons.gui.tools.MultisellBuilderDialog
// File: ext\mods\commons\gui\tools\MultisellBuilderDialog.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/commons/gui/tools/MultisellBuilderDialog.class
  Last modified 9 de jul de 2026; size 13782 bytes
  MD5 checksum e27a214275791c7ae7caae53aa99c4e3
  Compiled from "MultisellBuilderDialog.java"
public class ext.mods.commons.gui.tools.MultisellBuilderDialog extends javax.swing.JDialog
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #16                         // ext/mods/commons/gui/tools/MultisellBuilderDialog
  super_class: #4                         // javax/swing/JDialog
  interfaces: 0, fields: 1, methods: 7, attributes: 3
Constant pool:
    #1 = String             #2            // Multisell Creator
    #2 = Utf8               Multisell Creator
    #3 = Methodref          #4.#5         // javax/swing/JDialog."<init>":(Ljava/awt/Frame;Ljava/lang/String;Z)V
    #4 = Class              #6            // javax/swing/JDialog
    #5 = NameAndType        #7:#8         // "<init>":(Ljava/awt/Frame;Ljava/lang/String;Z)V
    #6 = Utf8               javax/swing/JDialog
    #7 = Utf8               <init>
    #8 = Utf8               (Ljava/awt/Frame;Ljava/lang/String;Z)V
    #9 = Methodref          #10.#11       // ext/mods/commons/gui/GuiUtils.loadIcons:()Ljava/util/List;
   #10 = Class              #12           // ext/mods/commons/gui/GuiUtils
   #11 = NameAndType        #13:#14       // loadIcons:()Ljava/util/List;
   #12 = Utf8               ext/mods/commons/gui/GuiUtils
   #13 = Utf8               loadIcons
   #14 = Utf8               ()Ljava/util/List;
   #15 = Methodref          #16.#17       // ext/mods/commons/gui/tools/MultisellBuilderDialog.setIconImages:(Ljava/util/List;)V
   #16 = Class              #18           // ext/mods/commons/gui/tools/MultisellBuilderDialog
   #17 = NameAndType        #19:#20       // setIconImages:(Ljava/util/List;)V
   #18 = Utf8               ext/mods/commons/gui/tools/MultisellBuilderDialog
   #19 = Utf8               setIconImages
   #20 = Utf8               (Ljava/util/List;)V
   #21 = Methodref          #16.#22       // ext/mods/commons/gui/tools/MultisellBuilderDialog.setSize:(II)V
   #22 = NameAndType        #23:#24       // setSize:(II)V
   #23 = Utf8               setSize
   #24 = Utf8               (II)V
   #25 = Methodref          #16.#26       // ext/mods/commons/gui/tools/MultisellBuilderDialog.setLocationRelativeTo:(Ljava/awt/Component;)V
   #26 = NameAndType        #27:#28       // setLocationRelativeTo:(Ljava/awt/Component;)V
   #27 = Utf8               setLocationRelativeTo
   #28 = Utf8               (Ljava/awt/Component;)V
   #29 = Class              #30           // java/awt/BorderLayout
   #30 = Utf8               java/awt/BorderLayout
   #31 = Methodref          #29.#32       // java/awt/BorderLayout."<init>":(II)V
   #32 = NameAndType        #7:#24        // "<init>":(II)V
   #33 = Methodref          #16.#34       // ext/mods/commons/gui/tools/MultisellBuilderDialog.setLayout:(Ljava/awt/LayoutManager;)V
   #34 = NameAndType        #35:#36       // setLayout:(Ljava/awt/LayoutManager;)V
   #35 = Utf8               setLayout
   #36 = Utf8               (Ljava/awt/LayoutManager;)V
   #37 = Class              #38           // java/awt/Color
   #38 = Utf8               java/awt/Color
   #39 = Methodref          #37.#40       // java/awt/Color."<init>":(III)V
   #40 = NameAndType        #7:#41        // "<init>":(III)V
   #41 = Utf8               (III)V
   #42 = Methodref          #16.#43       // ext/mods/commons/gui/tools/MultisellBuilderDialog.getContentPane:()Ljava/awt/Container;
   #43 = NameAndType        #44:#45       // getContentPane:()Ljava/awt/Container;
   #44 = Utf8               getContentPane
   #45 = Utf8               ()Ljava/awt/Container;
   #46 = Methodref          #47.#48       // java/awt/Container.setBackground:(Ljava/awt/Color;)V
   #47 = Class              #49           // java/awt/Container
   #48 = NameAndType        #50:#51       // setBackground:(Ljava/awt/Color;)V
   #49 = Utf8               java/awt/Container
   #50 = Utf8               setBackground
   #51 = Utf8               (Ljava/awt/Color;)V
   #52 = Class              #53           // javax/swing/JPanel
   #53 = Utf8               javax/swing/JPanel
   #54 = Class              #55           // java/awt/FlowLayout
   #55 = Utf8               java/awt/FlowLayout
   #56 = Methodref          #54.#40       // java/awt/FlowLayout."<init>":(III)V
   #57 = Methodref          #52.#58       // javax/swing/JPanel."<init>":(Ljava/awt/LayoutManager;)V
   #58 = NameAndType        #7:#36        // "<init>":(Ljava/awt/LayoutManager;)V
   #59 = Methodref          #52.#48       // javax/swing/JPanel.setBackground:(Ljava/awt/Color;)V
   #60 = Class              #61           // javax/swing/JLabel
   #61 = Utf8               javax/swing/JLabel
   #62 = String             #63           // NPC ID:
   #63 = Utf8               NPC ID:
   #64 = Methodref          #60.#65       // javax/swing/JLabel."<init>":(Ljava/lang/String;)V
   #65 = NameAndType        #7:#66        // "<init>":(Ljava/lang/String;)V
   #66 = Utf8               (Ljava/lang/String;)V
   #67 = Methodref          #60.#68       // javax/swing/JLabel.setForeground:(Ljava/awt/Color;)V
   #68 = NameAndType        #69:#51       // setForeground:(Ljava/awt/Color;)V
   #69 = Utf8               setForeground
   #70 = Class              #71           // javax/swing/JTextField
   #71 = Utf8               javax/swing/JTextField
   #72 = Methodref          #70.#73       // javax/swing/JTextField."<init>":(I)V
   #73 = NameAndType        #7:#74        // "<init>":(I)V
   #74 = Utf8               (I)V
   #75 = String             #76           // Start ID:
   #76 = Utf8               Start ID:
   #77 = String             #78           // End ID:
   #78 = Utf8               End ID:
   #79 = Class              #80           // javax/swing/JCheckBox
   #80 = Utf8               javax/swing/JCheckBox
   #81 = String             #82           // Same ID
   #82 = Utf8               Same ID
   #83 = Methodref          #79.#65       // javax/swing/JCheckBox."<init>":(Ljava/lang/String;)V
   #84 = Methodref          #79.#68       // javax/swing/JCheckBox.setForeground:(Ljava/awt/Color;)V
   #85 = Methodref          #79.#48       // javax/swing/JCheckBox.setBackground:(Ljava/awt/Color;)V
   #86 = Methodref          #52.#87       // javax/swing/JPanel.add:(Ljava/awt/Component;)Ljava/awt/Component;
   #87 = NameAndType        #88:#89       // add:(Ljava/awt/Component;)Ljava/awt/Component;
   #88 = Utf8               add
   #89 = Utf8               (Ljava/awt/Component;)Ljava/awt/Component;
   #90 = Fieldref           #37.#91       // java/awt/Color.GRAY:Ljava/awt/Color;
   #91 = NameAndType        #92:#93       // GRAY:Ljava/awt/Color;
   #92 = Utf8               GRAY
   #93 = Utf8               Ljava/awt/Color;
   #94 = Methodref          #95.#96       // javax/swing/BorderFactory.createLineBorder:(Ljava/awt/Color;)Ljavax/swing/border/Border;
   #95 = Class              #97           // javax/swing/BorderFactory
   #96 = NameAndType        #98:#99       // createLineBorder:(Ljava/awt/Color;)Ljavax/swing/border/Border;
   #97 = Utf8               javax/swing/BorderFactory
   #98 = Utf8               createLineBorder
   #99 = Utf8               (Ljava/awt/Color;)Ljavax/swing/border/Border;
  #100 = String             #101          // Ingredients
  #101 = Utf8               Ingredients
  #102 = Class              #103          // java/awt/Font
  #103 = Utf8               java/awt/Font
  #104 = String             #105          // Arial
  #105 = Utf8               Arial
  #106 = Methodref          #102.#107     // java/awt/Font."<init>":(Ljava/lang/String;II)V
  #107 = NameAndType        #7:#108       // "<init>":(Ljava/lang/String;II)V
  #108 = Utf8               (Ljava/lang/String;II)V
  #109 = Methodref          #95.#110      // javax/swing/BorderFactory.createTitledBorder:(Ljavax/swing/border/Border;Ljava/lang/String;IILjava/awt/Font;Ljava/awt/Color;)Ljavax/swing/border/TitledBorder;
  #110 = NameAndType        #111:#112     // createTitledBorder:(Ljavax/swing/border/Border;Ljava/lang/String;IILjava/awt/Font;Ljava/awt/Color;)Ljavax/swing/border/TitledBorder;
  #111 = Utf8               createTitledBorder
  #112 = Utf8               (Ljavax/swing/border/Border;Ljava/lang/String;IILjava/awt/Font;Ljava/awt/Color;)Ljavax/swing/border/TitledBorder;
  #113 = Methodref          #52.#114      // javax/swing/JPanel.setBorder:(Ljavax/swing/border/Border;)V
  #114 = NameAndType        #115:#116     // setBorder:(Ljavax/swing/border/Border;)V
  #115 = Utf8               setBorder
  #116 = Utf8               (Ljavax/swing/border/Border;)V
  #117 = Class              #118          // javax/swing/JButton
  #118 = Utf8               javax/swing/JButton
  #119 = String             #120          // +
  #120 = Utf8               +
  #121 = Methodref          #117.#65      // javax/swing/JButton."<init>":(Ljava/lang/String;)V
  #122 = Methodref          #117.#48      // javax/swing/JButton.setBackground:(Ljava/awt/Color;)V
  #123 = Fieldref           #37.#124      // java/awt/Color.WHITE:Ljava/awt/Color;
  #124 = NameAndType        #125:#93      // WHITE:Ljava/awt/Color;
  #125 = Utf8               WHITE
  #126 = Methodref          #117.#68      // javax/swing/JButton.setForeground:(Ljava/awt/Color;)V
  #127 = String             #128          // -
  #128 = Utf8               -
  #129 = String             #130          // Item ID:
  #130 = Utf8               Item ID:
  #131 = String             #132          // Qty:
  #132 = Utf8               Qty:
  #133 = Class              #134          // javax/swing/DefaultListModel
  #134 = Utf8               javax/swing/DefaultListModel
  #135 = Methodref          #133.#136     // javax/swing/DefaultListModel."<init>":()V
  #136 = NameAndType        #7:#137       // "<init>":()V
  #137 = Utf8               ()V
  #138 = Class              #139          // javax/swing/JList
  #139 = Utf8               javax/swing/JList
  #140 = Methodref          #138.#141     // javax/swing/JList."<init>":(Ljavax/swing/ListModel;)V
  #141 = NameAndType        #7:#142       // "<init>":(Ljavax/swing/ListModel;)V
  #142 = Utf8               (Ljavax/swing/ListModel;)V
  #143 = Methodref          #138.#48      // javax/swing/JList.setBackground:(Ljava/awt/Color;)V
  #144 = Methodref          #138.#68      // javax/swing/JList.setForeground:(Ljava/awt/Color;)V
  #145 = String             #146          // Monospaced
  #146 = Utf8               Monospaced
  #147 = Methodref          #138.#148     // javax/swing/JList.setFont:(Ljava/awt/Font;)V
  #148 = NameAndType        #149:#150     // setFont:(Ljava/awt/Font;)V
  #149 = Utf8               setFont
  #150 = Utf8               (Ljava/awt/Font;)V
  #151 = Class              #152          // javax/swing/JScrollPane
  #152 = Utf8               javax/swing/JScrollPane
  #153 = Methodref          #151.#154     // javax/swing/JScrollPane."<init>":(Ljava/awt/Component;)V
  #154 = NameAndType        #7:#28        // "<init>":(Ljava/awt/Component;)V
  #155 = InvokeDynamic      #0:#156       // #0:actionPerformed:(Ljavax/swing/JTextField;Ljavax/swing/JTextField;Ljavax/swing/DefaultListModel;)Ljava/awt/event/ActionListener;
  #156 = NameAndType        #157:#158     // actionPerformed:(Ljavax/swing/JTextField;Ljavax/swing/JTextField;Ljavax/swing/DefaultListModel;)Ljava/awt/event/ActionListener;
  #157 = Utf8               actionPerformed
  #158 = Utf8               (Ljavax/swing/JTextField;Ljavax/swing/JTextField;Ljavax/swing/DefaultListModel;)Ljava/awt/event/ActionListener;
  #159 = Methodref          #117.#160     // javax/swing/JButton.addActionListener:(Ljava/awt/event/ActionListener;)V
  #160 = NameAndType        #161:#162     // addActionListener:(Ljava/awt/event/ActionListener;)V
  #161 = Utf8               addActionListener
  #162 = Utf8               (Ljava/awt/event/ActionListener;)V
  #163 = InvokeDynamic      #1:#164       // #1:actionPerformed:(Ljavax/swing/JList;Ljavax/swing/DefaultListModel;)Ljava/awt/event/ActionListener;
  #164 = NameAndType        #157:#165     // actionPerformed:(Ljavax/swing/JList;Ljavax/swing/DefaultListModel;)Ljava/awt/event/ActionListener;
  #165 = Utf8               (Ljavax/swing/JList;Ljavax/swing/DefaultListModel;)Ljava/awt/event/ActionListener;
  #166 = String             #167          // North
  #167 = Utf8               North
  #168 = Methodref          #52.#169      // javax/swing/JPanel.add:(Ljava/awt/Component;Ljava/lang/Object;)V
  #169 = NameAndType        #88:#170      // add:(Ljava/awt/Component;Ljava/lang/Object;)V
  #170 = Utf8               (Ljava/awt/Component;Ljava/lang/Object;)V
  #171 = String             #172          // Center
  #172 = Utf8               Center
  #173 = Class              #174          // java/awt/GridLayout
  #174 = Utf8               java/awt/GridLayout
  #175 = Methodref          #173.#176     // java/awt/GridLayout."<init>":(IIII)V
  #176 = NameAndType        #7:#177       // "<init>":(IIII)V
  #177 = Utf8               (IIII)V
  #178 = String             #179          // Multisell with Enchant
  #179 = Utf8               Multisell with Enchant
  #180 = String             #181          // Value:
  #181 = Utf8               Value:
  #182 = Methodref          #70.#183      // javax/swing/JTextField.setEnabled:(Z)V
  #183 = NameAndType        #184:#185     // setEnabled:(Z)V
  #184 = Utf8               setEnabled
  #185 = Utf8               (Z)V
  #186 = InvokeDynamic      #2:#187       // #2:actionPerformed:(Ljavax/swing/JTextField;Ljavax/swing/JCheckBox;)Ljava/awt/event/ActionListener;
  #187 = NameAndType        #157:#188     // actionPerformed:(Ljavax/swing/JTextField;Ljavax/swing/JCheckBox;)Ljava/awt/event/ActionListener;
  #188 = Utf8               (Ljavax/swing/JTextField;Ljavax/swing/JCheckBox;)Ljava/awt/event/ActionListener;
  #189 = Methodref          #79.#160      // javax/swing/JCheckBox.addActionListener:(Ljava/awt/event/ActionListener;)V
  #190 = Class              #191          // javax/swing/JTextArea
  #191 = Utf8               javax/swing/JTextArea
  #192 = Methodref          #190.#32      // javax/swing/JTextArea."<init>":(II)V
  #193 = Methodref          #190.#194     // javax/swing/JTextArea.setEditable:(Z)V
  #194 = NameAndType        #195:#185     // setEditable:(Z)V
  #195 = Utf8               setEditable
  #196 = Methodref          #190.#48      // javax/swing/JTextArea.setBackground:(Ljava/awt/Color;)V
  #197 = Methodref          #190.#68      // javax/swing/JTextArea.setForeground:(Ljava/awt/Color;)V
  #198 = Methodref          #190.#148     // javax/swing/JTextArea.setFont:(Ljava/awt/Font;)V
  #199 = String             #200          // XML Preview
  #200 = Utf8               XML Preview
  #201 = Methodref          #151.#114     // javax/swing/JScrollPane.setBorder:(Ljavax/swing/border/Border;)V
  #202 = String             #203          // Generate XML
  #203 = Utf8               Generate XML
  #204 = String             #205          // Save XML
  #205 = Utf8               Save XML
  #206 = InvokeDynamic      #3:#207       // #3:actionPerformed:(Ljavax/swing/JTextField;Ljavax/swing/JTextField;Ljavax/swing/JTextField;Ljavax/swing/JCheckBox;Ljavax/swing/JCheckBox;Ljavax/swing/JTextField;Ljavax/swing/DefaultListModel;Ljavax/swing/JTextArea;Ljavax/swing/JDialog;)Ljava/awt/event/ActionListener;
  #207 = NameAndType        #157:#208     // actionPerformed:(Ljavax/swing/JTextField;Ljavax/swing/JTextField;Ljavax/swing/JTextField;Ljavax/swing/JCheckBox;Ljavax/swing/JCheckBox;Ljavax/swing/JTextField;Ljavax/swing/DefaultListModel;Ljavax/swing/JTextArea;Ljavax/swing/JDialog;)Ljava/awt/event/ActionListener;
  #208 = Utf8               (Ljavax/swing/JTextField;Ljavax/swing/JTextField;Ljavax/swing/JTextField;Ljavax/swing/JCheckBox;Ljavax/swing/JCheckBox;Ljavax/swing/JTextField;Ljavax/swing/DefaultListModel;Ljavax/swing/JTextArea;Ljavax/swing/JDialog;)Ljava/awt/event/ActionListener;
  #209 = String             #210          // Clear
  #210 = Utf8               Clear
  #211 = InvokeDynamic      #4:#212       // #4:actionPerformed:(Ljavax/swing/JTextField;Ljavax/swing/JTextField;Ljavax/swing/JTextField;Ljavax/swing/JCheckBox;Ljavax/swing/JCheckBox;Ljavax/swing/JTextField;Ljavax/swing/DefaultListModel;Ljavax/swing/JTextArea;)Ljava/awt/event/ActionListener;
  #212 = NameAndType        #157:#213     // actionPerformed:(Ljavax/swing/JTextField;Ljavax/swing/JTextField;Ljavax/swing/JTextField;Ljavax/swing/JCheckBox;Ljavax/swing/JCheckBox;Ljavax/swing/JTextField;Ljavax/swing/DefaultListModel;Ljavax/swing/JTextArea;)Ljava/awt/event/ActionListener;
  #213 = Utf8               (Ljavax/swing/JTextField;Ljavax/swing/JTextField;Ljavax/swing/JTextField;Ljavax/swing/JCheckBox;Ljavax/swing/JCheckBox;Ljavax/swing/JTextField;Ljavax/swing/DefaultListModel;Ljavax/swing/JTextArea;)Ljava/awt/event/ActionListener;
  #214 = InvokeDynamic      #5:#215       // #5:actionPerformed:(Ljavax/swing/JDialog;Ljavax/swing/JTextArea;)Ljava/awt/event/ActionListener;
  #215 = NameAndType        #157:#216     // actionPerformed:(Ljavax/swing/JDialog;Ljavax/swing/JTextArea;)Ljava/awt/event/ActionListener;
  #216 = Utf8               (Ljavax/swing/JDialog;Ljavax/swing/JTextArea;)Ljava/awt/event/ActionListener;
  #217 = Methodref          #52.#136      // javax/swing/JPanel."<init>":()V
  #218 = Methodref          #52.#34       // javax/swing/JPanel.setLayout:(Ljava/awt/LayoutManager;)V
  #219 = Methodref          #16.#169      // ext/mods/commons/gui/tools/MultisellBuilderDialog.add:(Ljava/awt/Component;Ljava/lang/Object;)V
  #220 = String             #221          // South
  #221 = Utf8               South
  #222 = Methodref          #223.#224     // java/util/UUID.randomUUID:()Ljava/util/UUID;
  #223 = Class              #225          // java/util/UUID
  #224 = NameAndType        #226:#227     // randomUUID:()Ljava/util/UUID;
  #225 = Utf8               java/util/UUID
  #226 = Utf8               randomUUID
  #227 = Utf8               ()Ljava/util/UUID;
  #228 = Methodref          #223.#229     // java/util/UUID.toString:()Ljava/lang/String;
  #229 = NameAndType        #230:#231     // toString:()Ljava/lang/String;
  #230 = Utf8               toString
  #231 = Utf8               ()Ljava/lang/String;
  #232 = Methodref          #233.#234     // java/lang/String.substring:(II)Ljava/lang/String;
  #233 = Class              #235          // java/lang/String
  #234 = NameAndType        #236:#237     // substring:(II)Ljava/lang/String;
  #235 = Utf8               java/lang/String
  #236 = Utf8               substring
  #237 = Utf8               (II)Ljava/lang/String;
  #238 = InvokeDynamic      #6:#239       // #6:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #239 = NameAndType        #240:#241     // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #240 = Utf8               makeConcatWithConstants
  #241 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
  #242 = Class              #243          // javax/swing/JFileChooser
  #243 = Utf8               javax/swing/JFileChooser
  #244 = Methodref          #242.#136     // javax/swing/JFileChooser."<init>":()V
  #245 = String             #246          // Save Multisell XML
  #246 = Utf8               Save Multisell XML
  #247 = Methodref          #242.#248     // javax/swing/JFileChooser.setDialogTitle:(Ljava/lang/String;)V
  #248 = NameAndType        #249:#66      // setDialogTitle:(Ljava/lang/String;)V
  #249 = Utf8               setDialogTitle
  #250 = Class              #251          // java/io/File
  #251 = Utf8               java/io/File
  #252 = Methodref          #250.#65      // java/io/File."<init>":(Ljava/lang/String;)V
  #253 = Methodref          #242.#254     // javax/swing/JFileChooser.setSelectedFile:(Ljava/io/File;)V
  #254 = NameAndType        #255:#256     // setSelectedFile:(Ljava/io/File;)V
  #255 = Utf8               setSelectedFile
  #256 = Utf8               (Ljava/io/File;)V
  #257 = Methodref          #242.#258     // javax/swing/JFileChooser.showSaveDialog:(Ljava/awt/Component;)I
  #258 = NameAndType        #259:#260     // showSaveDialog:(Ljava/awt/Component;)I
  #259 = Utf8               showSaveDialog
  #260 = Utf8               (Ljava/awt/Component;)I
  #261 = Methodref          #242.#262     // javax/swing/JFileChooser.getSelectedFile:()Ljava/io/File;
  #262 = NameAndType        #263:#264     // getSelectedFile:()Ljava/io/File;
  #263 = Utf8               getSelectedFile
  #264 = Utf8               ()Ljava/io/File;
  #265 = Methodref          #250.#266     // java/io/File.getName:()Ljava/lang/String;
  #266 = NameAndType        #267:#231     // getName:()Ljava/lang/String;
  #267 = Utf8               getName
  #268 = Methodref          #233.#269     // java/lang/String.toLowerCase:()Ljava/lang/String;
  #269 = NameAndType        #270:#231     // toLowerCase:()Ljava/lang/String;
  #270 = Utf8               toLowerCase
  #271 = String             #272          // .xml
  #272 = Utf8               .xml
  #273 = Methodref          #233.#274     // java/lang/String.endsWith:(Ljava/lang/String;)Z
  #274 = NameAndType        #275:#276     // endsWith:(Ljava/lang/String;)Z
  #275 = Utf8               endsWith
  #276 = Utf8               (Ljava/lang/String;)Z
  #277 = Methodref          #250.#278     // java/io/File.getAbsolutePath:()Ljava/lang/String;
  #278 = NameAndType        #279:#231     // getAbsolutePath:()Ljava/lang/String;
  #279 = Utf8               getAbsolutePath
  #280 = Class              #281          // java/io/FileWriter
  #281 = Utf8               java/io/FileWriter
  #282 = Methodref          #280.#283     // java/io/FileWriter."<init>":(Ljava/io/File;)V
  #283 = NameAndType        #7:#256       // "<init>":(Ljava/io/File;)V
  #284 = Methodref          #190.#285     // javax/swing/JTextArea.getText:()Ljava/lang/String;
  #285 = NameAndType        #286:#231     // getText:()Ljava/lang/String;
  #286 = Utf8               getText
  #287 = Methodref          #280.#288     // java/io/FileWriter.write:(Ljava/lang/String;)V
  #288 = NameAndType        #289:#66      // write:(Ljava/lang/String;)V
  #289 = Utf8               write
  #290 = String             #291          // XML saved successfully!
  #291 = Utf8               XML saved successfully!
  #292 = Methodref          #293.#294     // javax/swing/JOptionPane.showMessageDialog:(Ljava/awt/Component;Ljava/lang/Object;)V
  #293 = Class              #295          // javax/swing/JOptionPane
  #294 = NameAndType        #296:#170     // showMessageDialog:(Ljava/awt/Component;Ljava/lang/Object;)V
  #295 = Utf8               javax/swing/JOptionPane
  #296 = Utf8               showMessageDialog
  #297 = Methodref          #280.#298     // java/io/FileWriter.close:()V
  #298 = NameAndType        #299:#137     // close:()V
  #299 = Utf8               close
  #300 = Class              #301          // java/lang/Throwable
  #301 = Utf8               java/lang/Throwable
  #302 = Methodref          #300.#303     // java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
  #303 = NameAndType        #304:#305     // addSuppressed:(Ljava/lang/Throwable;)V
  #304 = Utf8               addSuppressed
  #305 = Utf8               (Ljava/lang/Throwable;)V
  #306 = Class              #307          // java/io/IOException
  #307 = Utf8               java/io/IOException
  #308 = String             #309          // Error saving XML!
  #309 = Utf8               Error saving XML!
  #310 = String             #311          //
  #311 = Utf8
  #312 = Methodref          #70.#313      // javax/swing/JTextField.setText:(Ljava/lang/String;)V
  #313 = NameAndType        #314:#66      // setText:(Ljava/lang/String;)V
  #314 = Utf8               setText
  #315 = Methodref          #79.#316      // javax/swing/JCheckBox.setSelected:(Z)V
  #316 = NameAndType        #317:#185     // setSelected:(Z)V
  #317 = Utf8               setSelected
  #318 = Methodref          #133.#319     // javax/swing/DefaultListModel.clear:()V
  #319 = NameAndType        #320:#137     // clear:()V
  #320 = Utf8               clear
  #321 = Methodref          #190.#313     // javax/swing/JTextArea.setText:(Ljava/lang/String;)V
  #322 = Class              #323          // java/lang/StringBuilder
  #323 = Utf8               java/lang/StringBuilder
  #324 = Methodref          #322.#136     // java/lang/StringBuilder."<init>":()V
  #325 = Methodref          #70.#285      // javax/swing/JTextField.getText:()Ljava/lang/String;
  #326 = Methodref          #233.#327     // java/lang/String.trim:()Ljava/lang/String;
  #327 = NameAndType        #328:#231     // trim:()Ljava/lang/String;
  #328 = Utf8               trim
  #329 = Methodref          #330.#331     // java/lang/Integer.parseInt:(Ljava/lang/String;)I
  #330 = Class              #332          // java/lang/Integer
  #331 = NameAndType        #333:#334     // parseInt:(Ljava/lang/String;)I
  #332 = Utf8               java/lang/Integer
  #333 = Utf8               parseInt
  #334 = Utf8               (Ljava/lang/String;)I
  #335 = Methodref          #79.#336      // javax/swing/JCheckBox.isSelected:()Z
  #336 = NameAndType        #337:#338     // isSelected:()Z
  #337 = Utf8               isSelected
  #338 = Utf8               ()Z
  #339 = Methodref          #233.#340     // java/lang/String.isEmpty:()Z
  #340 = NameAndType        #341:#338     // isEmpty:()Z
  #341 = Utf8               isEmpty
  #342 = String             #343          // <?xml version=\'1.0\' encoding=\'utf-8\'?>\n
  #343 = Utf8               <?xml version=\'1.0\' encoding=\'utf-8\'?>\n
  #344 = Methodref          #322.#345     // java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
  #345 = NameAndType        #346:#347     // append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
  #346 = Utf8               append
  #347 = Utf8               (Ljava/lang/String;)Ljava/lang/StringBuilder;
  #348 = String             #349          // <list
  #349 = Utf8               <list
  #350 = String             #351          //  maintainEnchantment=\"true\"
  #351 = Utf8                maintainEnchantment=\"true\"
  #352 = String             #353          // >\n
  #353 = Utf8               >\n
  #354 = String             #355          //     <npcs>\n
  #355 = Utf8                   <npcs>\n
  #356 = String             #357          //         <npc>
  #357 = Utf8                       <npc>
  #358 = Methodref          #322.#359     // java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
  #359 = NameAndType        #346:#360     // append:(I)Ljava/lang/StringBuilder;
  #360 = Utf8               (I)Ljava/lang/StringBuilder;
  #361 = String             #362          // </npc>\n
  #362 = Utf8               </npc>\n
  #363 = String             #364          //     </npcs>\n\n
  #364 = Utf8                   </npcs>\n\n
  #365 = Class              #366          // java/util/ArrayList
  #366 = Utf8               java/util/ArrayList
  #367 = Methodref          #365.#136     // java/util/ArrayList."<init>":()V
  #368 = Methodref          #133.#369     // javax/swing/DefaultListModel.size:()I
  #369 = NameAndType        #370:#371     // size:()I
  #370 = Utf8               size
  #371 = Utf8               ()I
  #372 = Methodref          #133.#373     // javax/swing/DefaultListModel.get:(I)Ljava/lang/Object;
  #373 = NameAndType        #374:#375     // get:(I)Ljava/lang/Object;
  #374 = Utf8               get
  #375 = Utf8               (I)Ljava/lang/Object;
  #376 = String             #377          // ItemID:
  #377 = Utf8               ItemID:
  #378 = Methodref          #233.#379     // java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
  #379 = NameAndType        #380:#381     // replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
  #380 = Utf8               replace
  #381 = Utf8               (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
  #382 = String             #383          // \\| Qty:
  #383 = Utf8               \\| Qty:
  #384 = Methodref          #233.#385     // java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
  #385 = NameAndType        #386:#387     // split:(Ljava/lang/String;)[Ljava/lang/String;
  #386 = Utf8               split
  #387 = Utf8               (Ljava/lang/String;)[Ljava/lang/String;
  #388 = InvokeDynamic      #7:#389       // #7:makeConcatWithConstants:(II)Ljava/lang/String;
  #389 = NameAndType        #240:#237     // makeConcatWithConstants:(II)Ljava/lang/String;
  #390 = InterfaceMethodref #391.#392     // java/util/List.add:(Ljava/lang/Object;)Z
  #391 = Class              #393          // java/util/List
  #392 = NameAndType        #88:#394      // add:(Ljava/lang/Object;)Z
  #393 = Utf8               java/util/List
  #394 = Utf8               (Ljava/lang/Object;)Z
  #395 = String             #396          //     <item>\n
  #396 = Utf8                   <item>\n
  #397 = InterfaceMethodref #391.#398     // java/util/List.iterator:()Ljava/util/Iterator;
  #398 = NameAndType        #399:#400     // iterator:()Ljava/util/Iterator;
  #399 = Utf8               iterator
  #400 = Utf8               ()Ljava/util/Iterator;
  #401 = InterfaceMethodref #402.#403     // java/util/Iterator.hasNext:()Z
  #402 = Class              #404          // java/util/Iterator
  #403 = NameAndType        #405:#338     // hasNext:()Z
  #404 = Utf8               java/util/Iterator
  #405 = Utf8               hasNext
  #406 = InterfaceMethodref #402.#407     // java/util/Iterator.next:()Ljava/lang/Object;
  #407 = NameAndType        #408:#409     // next:()Ljava/lang/Object;
  #408 = Utf8               next
  #409 = Utf8               ()Ljava/lang/Object;
  #410 = String             #411          // \n
  #411 = Utf8               \n
  #412 = String             #413          //         <production id=\"
  #413 = Utf8                       <production id=\"
  #414 = String             #415          // \" count=\"1\"
  #415 = Utf8               \" count=\"1\"
  #416 = String             #417          //  enchant=\"
  #417 = Utf8                enchant=\"
  #418 = String             #419          // \"
  #419 = Utf8               \"
  #420 = String             #421          // />\n
  #421 = Utf8               />\n
  #422 = String             #423          //     </item>\n
  #423 = Utf8                   </item>\n
  #424 = String             #425          // </list>
  #425 = Utf8               </list>
  #426 = Methodref          #322.#229     // java/lang/StringBuilder.toString:()Ljava/lang/String;
  #427 = Class              #428          // java/lang/Exception
  #428 = Utf8               java/lang/Exception
  #429 = Methodref          #427.#430     // java/lang/Exception.getMessage:()Ljava/lang/String;
  #430 = NameAndType        #431:#231     // getMessage:()Ljava/lang/String;
  #431 = Utf8               getMessage
  #432 = InvokeDynamic      #8:#239       // #8:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #433 = Methodref          #138.#434     // javax/swing/JList.getSelectedIndex:()I
  #434 = NameAndType        #435:#371     // getSelectedIndex:()I
  #435 = Utf8               getSelectedIndex
  #436 = Methodref          #133.#437     // javax/swing/DefaultListModel.remove:(I)Ljava/lang/Object;
  #437 = NameAndType        #438:#375     // remove:(I)Ljava/lang/Object;
  #438 = Utf8               remove
  #439 = InvokeDynamic      #9:#440       // #9:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #440 = NameAndType        #240:#441     // makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #441 = Utf8               (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #442 = Methodref          #133.#443     // javax/swing/DefaultListModel.addElement:(Ljava/lang/Object;)V
  #443 = NameAndType        #444:#445     // addElement:(Ljava/lang/Object;)V
  #444 = Utf8               addElement
  #445 = Utf8               (Ljava/lang/Object;)V
  #446 = Utf8               serialVersionUID
  #447 = Utf8               J
  #448 = Utf8               ConstantValue
  #449 = Long               1l
  #451 = Utf8               (Ljavax/swing/JFrame;)V
  #452 = Utf8               Code
  #453 = Utf8               LineNumberTable
  #454 = Utf8               LocalVariableTable
  #455 = Utf8               this
  #456 = Utf8               Lext/mods/commons/gui/tools/MultisellBuilderDialog;
  #457 = Utf8               parent
  #458 = Utf8               Ljavax/swing/JFrame;
  #459 = Utf8               fundoDialogo
  #460 = Utf8               fundoLista
  #461 = Utf8               corTexto
  #462 = Utf8               corAcento
  #463 = Utf8               corBotaoVerde
  #464 = Utf8               corBotaoVermelho
  #465 = Utf8               corBotaoCinza
  #466 = Utf8               topPanel
  #467 = Utf8               Ljavax/swing/JPanel;
  #468 = Utf8               lblNpcId
  #469 = Utf8               Ljavax/swing/JLabel;
  #470 = Utf8               txtNpcId
  #471 = Utf8               Ljavax/swing/JTextField;
  #472 = Utf8               lblIdInicio
  #473 = Utf8               txtIdInicio
  #474 = Utf8               lblIdFinal
  #475 = Utf8               txtIdFinal
  #476 = Utf8               cbMesmoId
  #477 = Utf8               Ljavax/swing/JCheckBox;
  #478 = Utf8               ingredientPanel
  #479 = Utf8               addPanel
  #480 = Utf8               txtItemId
  #481 = Utf8               txtQuantidade
  #482 = Utf8               btnAdd
  #483 = Utf8               Ljavax/swing/JButton;
  #484 = Utf8               btnRemove
  #485 = Utf8               lblItemId
  #486 = Utf8               lblItemQtd
  #487 = Utf8               listModel
  #488 = Utf8               Ljavax/swing/DefaultListModel;
  #489 = Utf8               ingredientList
  #490 = Utf8               Ljavax/swing/JList;
  #491 = Utf8               scrollIngredients
  #492 = Utf8               Ljavax/swing/JScrollPane;
  #493 = Utf8               optionsPanel
  #494 = Utf8               enchantPanel
  #495 = Utf8               cbEnchant
  #496 = Utf8               lblValorEnchant
  #497 = Utf8               txtEnchant
  #498 = Utf8               xmlPreview
  #499 = Utf8               Ljavax/swing/JTextArea;
  #500 = Utf8               xmlScroll
  #501 = Utf8               bottomPanel
  #502 = Utf8               btnGerarLinhas
  #503 = Utf8               btnSalvarXML
  #504 = Utf8               thisDialog
  #505 = Utf8               Ljavax/swing/JDialog;
  #506 = Utf8               btnLimpar
  #507 = Utf8               centerPanel
  #508 = Utf8               enchantAndPreviewPanel
  #509 = Utf8               LocalVariableTypeTable
  #510 = Utf8               Ljavax/swing/DefaultListModel<Ljava/lang/String;>;
  #511 = Utf8               Ljavax/swing/JList<Ljava/lang/String;>;
  #512 = Utf8               lambda$new$5
  #513 = Utf8               (Ljavax/swing/JDialog;Ljavax/swing/JTextArea;Ljava/awt/event/ActionEvent;)V
  #514 = Utf8               x2
  #515 = Utf8               Ljava/lang/Throwable;
  #516 = Utf8               t$
  #517 = Utf8               fw
  #518 = Utf8               Ljava/io/FileWriter;
  #519 = Utf8               ex
  #520 = Utf8               Ljava/io/IOException;
  #521 = Utf8               fileToSave
  #522 = Utf8               Ljava/io/File;
  #523 = Utf8               e
  #524 = Utf8               Ljava/awt/event/ActionEvent;
  #525 = Utf8               defaultFileName
  #526 = Utf8               Ljava/lang/String;
  #527 = Utf8               fileChooser
  #528 = Utf8               Ljavax/swing/JFileChooser;
  #529 = Utf8               userSelection
  #530 = Utf8               I
  #531 = Utf8               StackMapTable
  #532 = Class              #533          // java/awt/event/ActionEvent
  #533 = Utf8               java/awt/event/ActionEvent
  #534 = Utf8               lambda$new$4
  #535 = Utf8               (Ljavax/swing/JTextField;Ljavax/swing/JTextField;Ljavax/swing/JTextField;Ljavax/swing/JCheckBox;Ljavax/swing/JCheckBox;Ljavax/swing/JTextField;Ljavax/swing/DefaultListModel;Ljavax/swing/JTextArea;Ljava/awt/event/ActionEvent;)V
  #536 = Utf8               lambda$new$3
  #537 = Utf8               (Ljavax/swing/JTextField;Ljavax/swing/JTextField;Ljavax/swing/JTextField;Ljavax/swing/JCheckBox;Ljavax/swing/JCheckBox;Ljavax/swing/JTextField;Ljavax/swing/DefaultListModel;Ljavax/swing/JTextArea;Ljavax/swing/JDialog;Ljava/awt/event/ActionEvent;)V
  #538 = Utf8               line
  #539 = Utf8               parts
  #540 = Utf8               [Ljava/lang/String;
  #541 = Utf8               itemId
  #542 = Utf8               qtd
  #543 = Utf8               i
  #544 = Utf8               ing
  #545 = Utf8               i$
  #546 = Utf8               Ljava/util/Iterator;
  #547 = Utf8               id
  #548 = Utf8               xml
  #549 = Utf8               Ljava/lang/StringBuilder;
  #550 = Utf8               npcId
  #551 = Utf8               idInicial
  #552 = Utf8               idFinal
  #553 = Utf8               mesmoId
  #554 = Utf8               Z
  #555 = Utf8               enchantValue
  #556 = Utf8               ingredientesXml
  #557 = Utf8               Ljava/util/List;
  #558 = Utf8               Ljava/lang/Exception;
  #559 = Utf8               Ljava/util/List<Ljava/lang/String;>;
  #560 = Utf8               lambda$new$2
  #561 = Utf8               (Ljavax/swing/JTextField;Ljavax/swing/JCheckBox;Ljava/awt/event/ActionEvent;)V
  #562 = Utf8               lambda$new$1
  #563 = Utf8               (Ljavax/swing/JList;Ljavax/swing/DefaultListModel;Ljava/awt/event/ActionEvent;)V
  #564 = Utf8               selectedIndex
  #565 = Utf8               lambda$new$0
  #566 = Utf8               (Ljavax/swing/JTextField;Ljavax/swing/JTextField;Ljavax/swing/DefaultListModel;Ljava/awt/event/ActionEvent;)V
  #567 = Utf8               SourceFile
  #568 = Utf8               MultisellBuilderDialog.java
  #569 = Utf8               BootstrapMethods
  #570 = MethodType         #571          //  (Ljava/awt/event/ActionEvent;)V
  #571 = Utf8               (Ljava/awt/event/ActionEvent;)V
  #572 = MethodHandle       6:#573        // REF_invokeStatic ext/mods/commons/gui/tools/MultisellBuilderDialog.lambda$new$0:(Ljavax/swing/JTextField;Ljavax/swing/JTextField;Ljavax/swing/DefaultListModel;Ljava/awt/event/ActionEvent;)V
  #573 = Methodref          #16.#574      // ext/mods/commons/gui/tools/MultisellBuilderDialog.lambda$new$0:(Ljavax/swing/JTextField;Ljavax/swing/JTextField;Ljavax/swing/DefaultListModel;Ljava/awt/event/ActionEvent;)V
  #574 = NameAndType        #565:#566     // lambda$new$0:(Ljavax/swing/JTextField;Ljavax/swing/JTextField;Ljavax/swing/DefaultListModel;Ljava/awt/event/ActionEvent;)V
  #575 = MethodHandle       6:#576        // REF_invokeStatic ext/mods/commons/gui/tools/MultisellBuilderDialog.lambda$new$1:(Ljavax/swing/JList;Ljavax/swing/DefaultListModel;Ljava/awt/event/ActionEvent;)V
  #576 = Methodref          #16.#577      // ext/mods/commons/gui/tools/MultisellBuilderDialog.lambda$new$1:(Ljavax/swing/JList;Ljavax/swing/DefaultListModel;Ljava/awt/event/ActionEvent;)V
  #577 = NameAndType        #562:#563     // lambda$new$1:(Ljavax/swing/JList;Ljavax/swing/DefaultListModel;Ljava/awt/event/ActionEvent;)V
  #578 = MethodHandle       6:#579        // REF_invokeStatic ext/mods/commons/gui/tools/MultisellBuilderDialog.lambda$new$2:(Ljavax/swing/JTextField;Ljavax/swing/JCheckBox;Ljava/awt/event/ActionEvent;)V
  #579 = Methodref          #16.#580      // ext/mods/commons/gui/tools/MultisellBuilderDialog.lambda$new$2:(Ljavax/swing/JTextField;Ljavax/swing/JCheckBox;Ljava/awt/event/ActionEvent;)V
  #580 = NameAndType        #560:#561     // lambda$new$2:(Ljavax/swing/JTextField;Ljavax/swing/JCheckBox;Ljava/awt/event/ActionEvent;)V
  #581 = MethodHandle       6:#582        // REF_invokeStatic ext/mods/commons/gui/tools/MultisellBuilderDialog.lambda$new$3:(Ljavax/swing/JTextField;Ljavax/swing/JTextField;Ljavax/swing/JTextField;Ljavax/swing/JCheckBox;Ljavax/swing/JCheckBox;Ljavax/swing/JTextField;Ljavax/swing/DefaultListModel;Ljavax/swing/JTextArea;Ljavax/swing/JDialog;Ljava/awt/event/ActionEvent;)V
  #582 = Methodref          #16.#583      // ext/mods/commons/gui/tools/MultisellBuilderDialog.lambda$new$3:(Ljavax/swing/JTextField;Ljavax/swing/JTextField;Ljavax/swing/JTextField;Ljavax/swing/JCheckBox;Ljavax/swing/JCheckBox;Ljavax/swing/JTextField;Ljavax/swing/DefaultListModel;Ljavax/swing/JTextArea;Ljavax/swing/JDialog;Ljava/awt/event/ActionEvent;)V
  #583 = NameAndType        #536:#537     // lambda$new$3:(Ljavax/swing/JTextField;Ljavax/swing/JTextField;Ljavax/swing/JTextField;Ljavax/swing/JCheckBox;Ljavax/swing/JCheckBox;Ljavax/swing/JTextField;Ljavax/swing/DefaultListModel;Ljavax/swing/JTextArea;Ljavax/swing/JDialog;Ljava/awt/event/ActionEvent;)V
  #584 = MethodHandle       6:#585        // REF_invokeStatic ext/mods/commons/gui/tools/MultisellBuilderDialog.lambda$new$4:(Ljavax/swing/JTextField;Ljavax/swing/JTextField;Ljavax/swing/JTextField;Ljavax/swing/JCheckBox;Ljavax/swing/JCheckBox;Ljavax/swing/JTextField;Ljavax/swing/DefaultListModel;Ljavax/swing/JTextArea;Ljava/awt/event/ActionEvent;)V
  #585 = Methodref          #16.#586      // ext/mods/commons/gui/tools/MultisellBuilderDialog.lambda$new$4:(Ljavax/swing/JTextField;Ljavax/swing/JTextField;Ljavax/swing/JTextField;Ljavax/swing/JCheckBox;Ljavax/swing/JCheckBox;Ljavax/swing/JTextField;Ljavax/swing/DefaultListModel;Ljavax/swing/JTextArea;Ljava/awt/event/ActionEvent;)V
  #586 = NameAndType        #534:#535     // lambda$new$4:(Ljavax/swing/JTextField;Ljavax/swing/JTextField;Ljavax/swing/JTextField;Ljavax/swing/JCheckBox;Ljavax/swing/JCheckBox;Ljavax/swing/JTextField;Ljavax/swing/DefaultListModel;Ljavax/swing/JTextArea;Ljava/awt/event/ActionEvent;)V
  #587 = MethodHandle       6:#588        // REF_invokeStatic ext/mods/commons/gui/tools/MultisellBuilderDialog.lambda$new$5:(Ljavax/swing/JDialog;Ljavax/swing/JTextArea;Ljava/awt/event/ActionEvent;)V
  #588 = Methodref          #16.#589      // ext/mods/commons/gui/tools/MultisellBuilderDialog.lambda$new$5:(Ljavax/swing/JDialog;Ljavax/swing/JTextArea;Ljava/awt/event/ActionEvent;)V
  #589 = NameAndType        #512:#513     // lambda$new$5:(Ljavax/swing/JDialog;Ljavax/swing/JTextArea;Ljava/awt/event/ActionEvent;)V
  #590 = String             #591          // \u0001.xml
  #591 = Utf8               \u0001.xml
  #592 = String             #593          //       <ingredient id=\"\u0001\" count=\"\u0001\"/>
  #593 = Utf8                     <ingredient id=\"\u0001\" count=\"\u0001\"/>
  #594 = String             #595          // Error generating XML: \u0001
  #595 = Utf8               Error generating XML: \u0001
  #596 = String             #597          // ItemID: \u0001 | Qty: \u0001
  #597 = Utf8               ItemID: \u0001 | Qty: \u0001
  #598 = MethodHandle       6:#599        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #599 = Methodref          #600.#601     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #600 = Class              #602          // java/lang/invoke/LambdaMetafactory
  #601 = NameAndType        #603:#604     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #602 = Utf8               java/lang/invoke/LambdaMetafactory
  #603 = Utf8               metafactory
  #604 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #605 = MethodHandle       6:#606        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #606 = Methodref          #607.#608     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #607 = Class              #609          // java/lang/invoke/StringConcatFactory
  #608 = NameAndType        #240:#610     // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #609 = Utf8               java/lang/invoke/StringConcatFactory
  #610 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #611 = Utf8               InnerClasses
  #612 = Class              #613          // java/lang/invoke/MethodHandles$Lookup
  #613 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #614 = Class              #615          // java/lang/invoke/MethodHandles
  #615 = Utf8               java/lang/invoke/MethodHandles
  #616 = Utf8               Lookup
{
  public ext.mods.commons.gui.tools.MultisellBuilderDialog(javax.swing.JFrame);
    descriptor: (Ljavax/swing/JFrame;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=10, locals=42, args_size=2
         0: aload_0
         1: aload_1
         2: ldc           #1                  // String Multisell Creator
         4: iconst_1
         5: invokespecial #3                  // Method javax/swing/JDialog."<init>":(Ljava/awt/Frame;Ljava/lang/String;Z)V
         8: aload_0
         9: invokestatic  #9                  // Method ext/mods/commons/gui/GuiUtils.loadIcons:()Ljava/util/List;
        12: invokevirtual #15                 // Method setIconImages:(Ljava/util/List;)V
        15: aload_0
        16: sipush        800
        19: sipush        600
        22: invokevirtual #21                 // Method setSize:(II)V
        25: aload_0
        26: aload_1
        27: invokevirtual #25                 // Method setLocationRelativeTo:(Ljava/awt/Component;)V
        30: aload_0
        31: new           #29                 // class java/awt/BorderLayout
        34: dup
        35: bipush        10
        37: bipush        10
        39: invokespecial #31                 // Method java/awt/BorderLayout."<init>":(II)V
        42: invokevirtual #33                 // Method setLayout:(Ljava/awt/LayoutManager;)V
        45: new           #37                 // class java/awt/Color
        48: dup
        49: bipush        25
        51: bipush        25
        53: bipush        25
        55: invokespecial #39                 // Method java/awt/Color."<init>":(III)V
        58: astore_2
        59: new           #37                 // class java/awt/Color
        62: dup
        63: iconst_1
        64: iconst_1
        65: iconst_1
        66: invokespecial #39                 // Method java/awt/Color."<init>":(III)V
        69: astore_3
        70: new           #37                 // class java/awt/Color
        73: dup
        74: sipush        204
        77: sipush        204
        80: sipush        204
        83: invokespecial #39                 // Method java/awt/Color."<init>":(III)V
        86: astore        4
        88: new           #37                 // class java/awt/Color
        91: dup
        92: iconst_0
        93: bipush        122
        95: sipush        204
        98: invokespecial #39                 // Method java/awt/Color."<init>":(III)V
       101: astore        5
       103: new           #37                 // class java/awt/Color
       106: dup
       107: bipush        70
       109: sipush        150
       112: bipush        70
       114: invokespecial #39                 // Method java/awt/Color."<init>":(III)V
       117: astore        6
       119: new           #37                 // class java/awt/Color
       122: dup
       123: sipush        180
       126: bipush        70
       128: bipush        70
       130: invokespecial #39                 // Method java/awt/Color."<init>":(III)V
       133: astore        7
       135: new           #37                 // class java/awt/Color
       138: dup
       139: bipush        120
       141: bipush        120
       143: bipush        120
       145: invokespecial #39                 // Method java/awt/Color."<init>":(III)V
       148: astore        8
       150: aload_0
       151: invokevirtual #42                 // Method getContentPane:()Ljava/awt/Container;
       154: aload_2
       155: invokevirtual #46                 // Method java/awt/Container.setBackground:(Ljava/awt/Color;)V
       158: new           #52                 // class javax/swing/JPanel
       161: dup
       162: new           #54                 // class java/awt/FlowLayout
       165: dup
       166: iconst_0
       167: bipush        15
       169: bipush        10
       171: invokespecial #56                 // Method java/awt/FlowLayout."<init>":(III)V
       174: invokespecial #57                 // Method javax/swing/JPanel."<init>":(Ljava/awt/LayoutManager;)V
       177: astore        9
       179: aload         9
       181: aload_2
       182: invokevirtual #59                 // Method javax/swing/JPanel.setBackground:(Ljava/awt/Color;)V
       185: new           #60                 // class javax/swing/JLabel
       188: dup
       189: ldc           #62                 // String NPC ID:
       191: invokespecial #64                 // Method javax/swing/JLabel."<init>":(Ljava/lang/String;)V
       194: astore        10
       196: aload         10
       198: aload         4
       200: invokevirtual #67                 // Method javax/swing/JLabel.setForeground:(Ljava/awt/Color;)V
       203: new           #70                 // class javax/swing/JTextField
       206: dup
       207: bipush        6
       209: invokespecial #72                 // Method javax/swing/JTextField."<init>":(I)V
       212: astore        11
       214: new           #60                 // class javax/swing/JLabel
       217: dup
       218: ldc           #75                 // String Start ID:
       220: invokespecial #64                 // Method javax/swing/JLabel."<init>":(Ljava/lang/String;)V
       223: astore        12
       225: aload         12
       227: aload         4
       229: invokevirtual #67                 // Method javax/swing/JLabel.setForeground:(Ljava/awt/Color;)V
       232: new           #70                 // class javax/swing/JTextField
       235: dup
       236: bipush        8
       238: invokespecial #72                 // Method javax/swing/JTextField."<init>":(I)V
       241: astore        13
       243: new           #60                 // class javax/swing/JLabel
       246: dup
       247: ldc           #77                 // String End ID:
       249: invokespecial #64                 // Method javax/swing/JLabel."<init>":(Ljava/lang/String;)V
       252: astore        14
       254: aload         14
       256: aload         4
       258: invokevirtual #67                 // Method javax/swing/JLabel.setForeground:(Ljava/awt/Color;)V
       261: new           #70                 // class javax/swing/JTextField
       264: dup
       265: bipush        8
       267: invokespecial #72                 // Method javax/swing/JTextField."<init>":(I)V
       270: astore        15
       272: new           #79                 // class javax/swing/JCheckBox
       275: dup
       276: ldc           #81                 // String Same ID
       278: invokespecial #83                 // Method javax/swing/JCheckBox."<init>":(Ljava/lang/String;)V
       281: astore        16
       283: aload         16
       285: aload         4
       287: invokevirtual #84                 // Method javax/swing/JCheckBox.setForeground:(Ljava/awt/Color;)V
       290: aload         16
       292: aload_2
       293: invokevirtual #85                 // Method javax/swing/JCheckBox.setBackground:(Ljava/awt/Color;)V
       296: aload         9
       298: aload         10
       300: invokevirtual #86                 // Method javax/swing/JPanel.add:(Ljava/awt/Component;)Ljava/awt/Component;
       303: pop
       304: aload         9
       306: aload         11
       308: invokevirtual #86                 // Method javax/swing/JPanel.add:(Ljava/awt/Component;)Ljava/awt/Component;
       311: pop
       312: aload         9
       314: aload         12
       316: invokevirtual #86                 // Method javax/swing/JPanel.add:(Ljava/awt/Component;)Ljava/awt/Component;
       319: pop
       320: aload         9
       322: aload         13
       324: invokevirtual #86                 // Method javax/swing/JPanel.add:(Ljava/awt/Component;)Ljava/awt/Component;
       327: pop
       328: aload         9
       330: aload         14
       332: invokevirtual #86                 // Method javax/swing/JPanel.add:(Ljava/awt/Component;)Ljava/awt/Component;
       335: pop
       336: aload         9
       338: aload         15
       340: invokevirtual #86                 // Method javax/swing/JPanel.add:(Ljava/awt/Component;)Ljava/awt/Component;
       343: pop
       344: aload         9
       346: aload         16
       348: invokevirtual #86                 // Method javax/swing/JPanel.add:(Ljava/awt/Component;)Ljava/awt/Component;
       351: pop
       352: new           #52                 // class javax/swing/JPanel
       355: dup
       356: new           #29                 // class java/awt/BorderLayout
       359: dup
       360: iconst_5
       361: iconst_5
       362: invokespecial #31                 // Method java/awt/BorderLayout."<init>":(II)V
       365: invokespecial #57                 // Method javax/swing/JPanel."<init>":(Ljava/awt/LayoutManager;)V
       368: astore        17
       370: aload         17
       372: aload_2
       373: invokevirtual #59                 // Method javax/swing/JPanel.setBackground:(Ljava/awt/Color;)V
       376: aload         17
       378: getstatic     #90                 // Field java/awt/Color.GRAY:Ljava/awt/Color;
       381: invokestatic  #94                 // Method javax/swing/BorderFactory.createLineBorder:(Ljava/awt/Color;)Ljavax/swing/border/Border;
       384: ldc           #100                // String Ingredients
       386: iconst_0
       387: iconst_0
       388: new           #102                // class java/awt/Font
       391: dup
       392: ldc           #104                // String Arial
       394: iconst_1
       395: bipush        14
       397: invokespecial #106                // Method java/awt/Font."<init>":(Ljava/lang/String;II)V
       400: aload         4
       402: invokestatic  #109                // Method javax/swing/BorderFactory.createTitledBorder:(Ljavax/swing/border/Border;Ljava/lang/String;IILjava/awt/Font;Ljava/awt/Color;)Ljavax/swing/border/TitledBorder;
       405: invokevirtual #113                // Method javax/swing/JPanel.setBorder:(Ljavax/swing/border/Border;)V
       408: new           #52                 // class javax/swing/JPanel
       411: dup
       412: new           #54                 // class java/awt/FlowLayout
       415: dup
       416: iconst_0
       417: bipush        10
       419: bipush        10
       421: invokespecial #56                 // Method java/awt/FlowLayout."<init>":(III)V
       424: invokespecial #57                 // Method javax/swing/JPanel."<init>":(Ljava/awt/LayoutManager;)V
       427: astore        18
       429: aload         18
       431: aload_2
       432: invokevirtual #59                 // Method javax/swing/JPanel.setBackground:(Ljava/awt/Color;)V
       435: new           #70                 // class javax/swing/JTextField
       438: dup
       439: bipush        6
       441: invokespecial #72                 // Method javax/swing/JTextField."<init>":(I)V
       444: astore        19
       446: new           #70                 // class javax/swing/JTextField
       449: dup
       450: iconst_4
       451: invokespecial #72                 // Method javax/swing/JTextField."<init>":(I)V
       454: astore        20
       456: new           #117                // class javax/swing/JButton
       459: dup
       460: ldc           #119                // String +
       462: invokespecial #121                // Method javax/swing/JButton."<init>":(Ljava/lang/String;)V
       465: astore        21
       467: aload         21
       469: aload         6
       471: invokevirtual #122                // Method javax/swing/JButton.setBackground:(Ljava/awt/Color;)V
       474: aload         21
       476: getstatic     #123                // Field java/awt/Color.WHITE:Ljava/awt/Color;
       479: invokevirtual #126                // Method javax/swing/JButton.setForeground:(Ljava/awt/Color;)V
       482: new           #117                // class javax/swing/JButton
       485: dup
       486: ldc           #127                // String -
       488: invokespecial #121                // Method javax/swing/JButton."<init>":(Ljava/lang/String;)V
       491: astore        22
       493: aload         22
       495: aload         7
       497: invokevirtual #122                // Method javax/swing/JButton.setBackground:(Ljava/awt/Color;)V
       500: aload         22
       502: getstatic     #123                // Field java/awt/Color.WHITE:Ljava/awt/Color;
       505: invokevirtual #126                // Method javax/swing/JButton.setForeground:(Ljava/awt/Color;)V
       508: new           #60                 // class javax/swing/JLabel
       511: dup
       512: ldc           #129                // String Item ID:
       514: invokespecial #64                 // Method javax/swing/JLabel."<init>":(Ljava/lang/String;)V
       517: astore        23
       519: aload         23
       521: aload         4
       523: invokevirtual #67                 // Method javax/swing/JLabel.setForeground:(Ljava/awt/Color;)V
       526: aload         18
       528: aload         23
       530: invokevirtual #86                 // Method javax/swing/JPanel.add:(Ljava/awt/Component;)Ljava/awt/Component;
       533: pop
       534: aload         18
       536: aload         19
       538: invokevirtual #86                 // Method javax/swing/JPanel.add:(Ljava/awt/Component;)Ljava/awt/Component;
       541: pop
       542: new           #60                 // class javax/swing/JLabel
       545: dup
       546: ldc           #131                // String Qty:
       548: invokespecial #64                 // Method javax/swing/JLabel."<init>":(Ljava/lang/String;)V
       551: astore        24
       553: aload         24
       555: aload         4
       557: invokevirtual #67                 // Method javax/swing/JLabel.setForeground:(Ljava/awt/Color;)V
       560: aload         18
       562: aload         24
       564: invokevirtual #86                 // Method javax/swing/JPanel.add:(Ljava/awt/Component;)Ljava/awt/Component;
       567: pop
       568: aload         18
       570: aload         20
       572: invokevirtual #86                 // Method javax/swing/JPanel.add:(Ljava/awt/Component;)Ljava/awt/Component;
       575: pop
       576: aload         18
       578: aload         21
       580: invokevirtual #86                 // Method javax/swing/JPanel.add:(Ljava/awt/Component;)Ljava/awt/Component;
       583: pop
       584: aload         18
       586: aload         22
       588: invokevirtual #86                 // Method javax/swing/JPanel.add:(Ljava/awt/Component;)Ljava/awt/Component;
       591: pop
       592: new           #133                // class javax/swing/DefaultListModel
       595: dup
       596: invokespecial #135                // Method javax/swing/DefaultListModel."<init>":()V
       599: astore        25
       601: new           #138                // class javax/swing/JList
       604: dup
       605: aload         25
       607: invokespecial #140                // Method javax/swing/JList."<init>":(Ljavax/swing/ListModel;)V
       610: astore        26
       612: aload         26
       614: aload_3
       615: invokevirtual #143                // Method javax/swing/JList.setBackground:(Ljava/awt/Color;)V
       618: aload         26
       620: aload         4
       622: invokevirtual #144                // Method javax/swing/JList.setForeground:(Ljava/awt/Color;)V
       625: aload         26
       627: new           #102                // class java/awt/Font
       630: dup
       631: ldc           #145                // String Monospaced
       633: iconst_0
       634: bipush        13
       636: invokespecial #106                // Method java/awt/Font."<init>":(Ljava/lang/String;II)V
       639: invokevirtual #147                // Method javax/swing/JList.setFont:(Ljava/awt/Font;)V
       642: new           #151                // class javax/swing/JScrollPane
       645: dup
       646: aload         26
       648: invokespecial #153                // Method javax/swing/JScrollPane."<init>":(Ljava/awt/Component;)V
       651: astore        27
       653: aload         21
       655: aload         19
       657: aload         20
       659: aload         25
       661: invokedynamic #155,  0            // InvokeDynamic #0:actionPerformed:(Ljavax/swing/JTextField;Ljavax/swing/JTextField;Ljavax/swing/DefaultListModel;)Ljava/awt/event/ActionListener;
       666: invokevirtual #159                // Method javax/swing/JButton.addActionListener:(Ljava/awt/event/ActionListener;)V
       669: aload         22
       671: aload         26
       673: aload         25
       675: invokedynamic #163,  0            // InvokeDynamic #1:actionPerformed:(Ljavax/swing/JList;Ljavax/swing/DefaultListModel;)Ljava/awt/event/ActionListener;
       680: invokevirtual #159                // Method javax/swing/JButton.addActionListener:(Ljava/awt/event/ActionListener;)V
       683: aload         17
       685: aload         18
       687: ldc           #166                // String North
       689: invokevirtual #168                // Method javax/swing/JPanel.add:(Ljava/awt/Component;Ljava/lang/Object;)V
       692: aload         17
       694: aload         27
       696: ldc           #171                // String Center
       698: invokevirtual #168                // Method javax/swing/JPanel.add:(Ljava/awt/Component;Ljava/lang/Object;)V
       701: new           #52                 // class javax/swing/JPanel
       704: dup
       705: new           #173                // class java/awt/GridLayout
       708: dup
       709: iconst_2
       710: iconst_1
       711: iconst_5
       712: iconst_5
       713: invokespecial #175                // Method java/awt/GridLayout."<init>":(IIII)V
       716: invokespecial #57                 // Method javax/swing/JPanel."<init>":(Ljava/awt/LayoutManager;)V
       719: astore        28
       721: aload         28
       723: aload_2
       724: invokevirtual #59                 // Method javax/swing/JPanel.setBackground:(Ljava/awt/Color;)V
       727: new           #52                 // class javax/swing/JPanel
       730: dup
       731: new           #54                 // class java/awt/FlowLayout
       734: dup
       735: iconst_0
       736: bipush        10
       738: bipush        10
       740: invokespecial #56                 // Method java/awt/FlowLayout."<init>":(III)V
       743: invokespecial #57                 // Method javax/swing/JPanel."<init>":(Ljava/awt/LayoutManager;)V
       746: astore        29
       748: aload         29
       750: aload_2
       751: invokevirtual #59                 // Method javax/swing/JPanel.setBackground:(Ljava/awt/Color;)V
       754: new           #79                 // class javax/swing/JCheckBox
       757: dup
       758: ldc           #178                // String Multisell with Enchant
       760: invokespecial #83                 // Method javax/swing/JCheckBox."<init>":(Ljava/lang/String;)V
       763: astore        30
       765: aload         30
       767: aload         4
       769: invokevirtual #84                 // Method javax/swing/JCheckBox.setForeground:(Ljava/awt/Color;)V
       772: aload         30
       774: aload_2
       775: invokevirtual #85                 // Method javax/swing/JCheckBox.setBackground:(Ljava/awt/Color;)V
       778: new           #60                 // class javax/swing/JLabel
       781: dup
       782: ldc           #180                // String Value:
       784: invokespecial #64                 // Method javax/swing/JLabel."<init>":(Ljava/lang/String;)V
       787: astore        31
       789: aload         31
       791: aload         4
       793: invokevirtual #67                 // Method javax/swing/JLabel.setForeground:(Ljava/awt/Color;)V
       796: new           #70                 // class javax/swing/JTextField
       799: dup
       800: iconst_4
       801: invokespecial #72                 // Method javax/swing/JTextField."<init>":(I)V
       804: astore        32
       806: aload         32
       808: iconst_0
       809: invokevirtual #182                // Method javax/swing/JTextField.setEnabled:(Z)V
       812: aload         30
       814: aload         32
       816: aload         30
       818: invokedynamic #186,  0            // InvokeDynamic #2:actionPerformed:(Ljavax/swing/JTextField;Ljavax/swing/JCheckBox;)Ljava/awt/event/ActionListener;
       823: invokevirtual #189                // Method javax/swing/JCheckBox.addActionListener:(Ljava/awt/event/ActionListener;)V
       826: aload         29
       828: aload         30
       830: invokevirtual #86                 // Method javax/swing/JPanel.add:(Ljava/awt/Component;)Ljava/awt/Component;
       833: pop
       834: aload         29
       836: aload         31
       838: invokevirtual #86                 // Method javax/swing/JPanel.add:(Ljava/awt/Component;)Ljava/awt/Component;
       841: pop
       842: aload         29
       844: aload         32
       846: invokevirtual #86                 // Method javax/swing/JPanel.add:(Ljava/awt/Component;)Ljava/awt/Component;
       849: pop
       850: aload         28
       852: aload         29
       854: invokevirtual #86                 // Method javax/swing/JPanel.add:(Ljava/awt/Component;)Ljava/awt/Component;
       857: pop
       858: new           #190                // class javax/swing/JTextArea
       861: dup
       862: bipush        12
       864: bipush        50
       866: invokespecial #192                // Method javax/swing/JTextArea."<init>":(II)V
       869: astore        33
       871: aload         33
       873: iconst_0
       874: invokevirtual #193                // Method javax/swing/JTextArea.setEditable:(Z)V
       877: aload         33
       879: aload_3
       880: invokevirtual #196                // Method javax/swing/JTextArea.setBackground:(Ljava/awt/Color;)V
       883: aload         33
       885: new           #37                 // class java/awt/Color
       888: dup
       889: iconst_0
       890: sipush        255
       893: bipush        100
       895: invokespecial #39                 // Method java/awt/Color."<init>":(III)V
       898: invokevirtual #197                // Method javax/swing/JTextArea.setForeground:(Ljava/awt/Color;)V
       901: aload         33
       903: new           #102                // class java/awt/Font
       906: dup
       907: ldc           #145                // String Monospaced
       909: iconst_0
       910: bipush        12
       912: invokespecial #106                // Method java/awt/Font."<init>":(Ljava/lang/String;II)V
       915: invokevirtual #198                // Method javax/swing/JTextArea.setFont:(Ljava/awt/Font;)V
       918: new           #151                // class javax/swing/JScrollPane
       921: dup
       922: aload         33
       924: invokespecial #153                // Method javax/swing/JScrollPane."<init>":(Ljava/awt/Component;)V
       927: astore        34
       929: aload         34
       931: getstatic     #90                 // Field java/awt/Color.GRAY:Ljava/awt/Color;
       934: invokestatic  #94                 // Method javax/swing/BorderFactory.createLineBorder:(Ljava/awt/Color;)Ljavax/swing/border/Border;
       937: ldc           #199                // String XML Preview
       939: iconst_0
       940: iconst_0
       941: new           #102                // class java/awt/Font
       944: dup
       945: ldc           #104                // String Arial
       947: iconst_1
       948: bipush        14
       950: invokespecial #106                // Method java/awt/Font."<init>":(Ljava/lang/String;II)V
       953: aload         4
       955: invokestatic  #109                // Method javax/swing/BorderFactory.createTitledBorder:(Ljavax/swing/border/Border;Ljava/lang/String;IILjava/awt/Font;Ljava/awt/Color;)Ljavax/swing/border/TitledBorder;
       958: invokevirtual #201                // Method javax/swing/JScrollPane.setBorder:(Ljavax/swing/border/Border;)V
       961: new           #52                 // class javax/swing/JPanel
       964: dup
       965: new           #54                 // class java/awt/FlowLayout
       968: dup
       969: iconst_1
       970: bipush        15
       972: bipush        15
       974: invokespecial #56                 // Method java/awt/FlowLayout."<init>":(III)V
       977: invokespecial #57                 // Method javax/swing/JPanel."<init>":(Ljava/awt/LayoutManager;)V
       980: astore        35
       982: aload         35
       984: aload_2
       985: invokevirtual #59                 // Method javax/swing/JPanel.setBackground:(Ljava/awt/Color;)V
       988: new           #117                // class javax/swing/JButton
       991: dup
       992: ldc           #202                // String Generate XML
       994: invokespecial #121                // Method javax/swing/JButton."<init>":(Ljava/lang/String;)V
       997: astore        36
       999: aload         36
      1001: aload         5
      1003: invokevirtual #122                // Method javax/swing/JButton.setBackground:(Ljava/awt/Color;)V
      1006: aload         36
      1008: getstatic     #123                // Field java/awt/Color.WHITE:Ljava/awt/Color;
      1011: invokevirtual #126                // Method javax/swing/JButton.setForeground:(Ljava/awt/Color;)V
      1014: new           #117                // class javax/swing/JButton
      1017: dup
      1018: ldc           #204                // String Save XML
      1020: invokespecial #121                // Method javax/swing/JButton."<init>":(Ljava/lang/String;)V
      1023: astore        37
      1025: aload         37
      1027: aload         5
      1029: invokevirtual #122                // Method javax/swing/JButton.setBackground:(Ljava/awt/Color;)V
      1032: aload         37
      1034: getstatic     #123                // Field java/awt/Color.WHITE:Ljava/awt/Color;
      1037: invokevirtual #126                // Method javax/swing/JButton.setForeground:(Ljava/awt/Color;)V
      1040: aload_0
      1041: astore        38
      1043: aload         36
      1045: aload         11
      1047: aload         13
      1049: aload         15
      1051: aload         16
      1053: aload         30
      1055: aload         32
      1057: aload         25
      1059: aload         33
      1061: aload         38
      1063: invokedynamic #206,  0            // InvokeDynamic #3:actionPerformed:(Ljavax/swing/JTextField;Ljavax/swing/JTextField;Ljavax/swing/JTextField;Ljavax/swing/JCheckBox;Ljavax/swing/JCheckBox;Ljavax/swing/JTextField;Ljavax/swing/DefaultListModel;Ljavax/swing/JTextArea;Ljavax/swing/JDialog;)Ljava/awt/event/ActionListener;
      1068: invokevirtual #159                // Method javax/swing/JButton.addActionListener:(Ljava/awt/event/ActionListener;)V
      1071: new           #117                // class javax/swing/JButton
      1074: dup
      1075: ldc           #209                // String Clear
      1077: invokespecial #121                // Method javax/swing/JButton."<init>":(Ljava/lang/String;)V
      1080: astore        39
      1082: aload         39
      1084: aload         8
      1086: invokevirtual #122                // Method javax/swing/JButton.setBackground:(Ljava/awt/Color;)V
      1089: aload         39
      1091: getstatic     #123                // Field java/awt/Color.WHITE:Ljava/awt/Color;
      1094: invokevirtual #126                // Method javax/swing/JButton.setForeground:(Ljava/awt/Color;)V
      1097: aload         39
      1099: aload         11
      1101: aload         13
      1103: aload         15
      1105: aload         16
      1107: aload         30
      1109: aload         32
      1111: aload         25
      1113: aload         33
      1115: invokedynamic #211,  0            // InvokeDynamic #4:actionPerformed:(Ljavax/swing/JTextField;Ljavax/swing/JTextField;Ljavax/swing/JTextField;Ljavax/swing/JCheckBox;Ljavax/swing/JCheckBox;Ljavax/swing/JTextField;Ljavax/swing/DefaultListModel;Ljavax/swing/JTextArea;)Ljava/awt/event/ActionListener;
      1120: invokevirtual #159                // Method javax/swing/JButton.addActionListener:(Ljava/awt/event/ActionListener;)V
      1123: aload         37
      1125: aload         38
      1127: aload         33
      1129: invokedynamic #214,  0            // InvokeDynamic #5:actionPerformed:(Ljavax/swing/JDialog;Ljavax/swing/JTextArea;)Ljava/awt/event/ActionListener;
      1134: invokevirtual #159                // Method javax/swing/JButton.addActionListener:(Ljava/awt/event/ActionListener;)V
      1137: aload         35
      1139: aload         36
      1141: invokevirtual #86                 // Method javax/swing/JPanel.add:(Ljava/awt/Component;)Ljava/awt/Component;
      1144: pop
      1145: aload         35
      1147: aload         37
      1149: invokevirtual #86                 // Method javax/swing/JPanel.add:(Ljava/awt/Component;)Ljava/awt/Component;
      1152: pop
      1153: aload         35
      1155: aload         39
      1157: invokevirtual #86                 // Method javax/swing/JPanel.add:(Ljava/awt/Component;)Ljava/awt/Component;
      1160: pop
      1161: new           #52                 // class javax/swing/JPanel
      1164: dup
      1165: invokespecial #217                // Method javax/swing/JPanel."<init>":()V
      1168: astore        40
      1170: aload         40
      1172: new           #29                 // class java/awt/BorderLayout
      1175: dup
      1176: bipush        10
      1178: bipush        10
      1180: invokespecial #31                 // Method java/awt/BorderLayout."<init>":(II)V
      1183: invokevirtual #218                // Method javax/swing/JPanel.setLayout:(Ljava/awt/LayoutManager;)V
      1186: aload         40
      1188: aload_2
      1189: invokevirtual #59                 // Method javax/swing/JPanel.setBackground:(Ljava/awt/Color;)V
      1192: aload         40
      1194: aload         17
      1196: ldc           #166                // String North
      1198: invokevirtual #168                // Method javax/swing/JPanel.add:(Ljava/awt/Component;Ljava/lang/Object;)V
      1201: new           #52                 // class javax/swing/JPanel
      1204: dup
      1205: new           #29                 // class java/awt/BorderLayout
      1208: dup
      1209: bipush        10
      1211: bipush        10
      1213: invokespecial #31                 // Method java/awt/BorderLayout."<init>":(II)V
      1216: invokespecial #57                 // Method javax/swing/JPanel."<init>":(Ljava/awt/LayoutManager;)V
      1219: astore        41
      1221: aload         41
      1223: aload_2
      1224: invokevirtual #59                 // Method javax/swing/JPanel.setBackground:(Ljava/awt/Color;)V
      1227: aload         41
      1229: aload         29
      1231: ldc           #166                // String North
      1233: invokevirtual #168                // Method javax/swing/JPanel.add:(Ljava/awt/Component;Ljava/lang/Object;)V
      1236: aload         41
      1238: aload         34
      1240: ldc           #171                // String Center
      1242: invokevirtual #168                // Method javax/swing/JPanel.add:(Ljava/awt/Component;Ljava/lang/Object;)V
      1245: aload         40
      1247: aload         41
      1249: ldc           #171                // String Center
      1251: invokevirtual #168                // Method javax/swing/JPanel.add:(Ljava/awt/Component;Ljava/lang/Object;)V
      1254: aload_0
      1255: aload         9
      1257: ldc           #166                // String North
      1259: invokevirtual #219                // Method add:(Ljava/awt/Component;Ljava/lang/Object;)V
      1262: aload_0
      1263: aload         40
      1265: ldc           #171                // String Center
      1267: invokevirtual #219                // Method add:(Ljava/awt/Component;Ljava/lang/Object;)V
      1270: aload_0
      1271: aload         35
      1273: ldc           #220                // String South
      1275: invokevirtual #219                // Method add:(Ljava/awt/Component;Ljava/lang/Object;)V
      1278: return
      LineNumberTable:
        line 52: 0
        line 53: 8
        line 54: 15
        line 55: 25
        line 56: 30
        line 58: 45
        line 59: 59
        line 60: 70
        line 61: 88
        line 62: 103
        line 63: 119
        line 64: 135
        line 66: 150
        line 68: 158
        line 69: 179
        line 71: 185
        line 72: 196
        line 73: 203
        line 75: 214
        line 76: 225
        line 77: 232
        line 79: 243
        line 80: 254
        line 81: 261
        line 83: 272
        line 84: 283
        line 85: 290
        line 87: 296
        line 88: 304
        line 89: 312
        line 90: 320
        line 91: 328
        line 92: 336
        line 93: 344
        line 95: 352
        line 96: 370
        line 97: 376
        line 99: 408
        line 100: 429
        line 102: 435
        line 103: 446
        line 105: 456
        line 106: 467
        line 107: 474
        line 109: 482
        line 110: 493
        line 111: 500
        line 113: 508
        line 114: 519
        line 115: 526
        line 116: 534
        line 117: 542
        line 118: 553
        line 119: 560
        line 120: 568
        line 121: 576
        line 122: 584
        line 124: 592
        line 125: 601
        line 126: 612
        line 127: 618
        line 128: 625
        line 130: 642
        line 132: 653
        line 142: 669
        line 149: 683
        line 150: 692
        line 152: 701
        line 153: 721
        line 155: 727
        line 156: 748
        line 158: 754
        line 159: 765
        line 160: 772
        line 162: 778
        line 163: 789
        line 165: 796
        line 166: 806
        line 168: 812
        line 170: 826
        line 171: 834
        line 172: 842
        line 174: 850
        line 176: 858
        line 177: 871
        line 178: 877
        line 179: 883
        line 180: 901
        line 182: 918
        line 183: 929
        line 185: 961
        line 186: 982
        line 188: 988
        line 189: 999
        line 190: 1006
        line 192: 1014
        line 193: 1025
        line 194: 1032
        line 196: 1040
        line 198: 1043
        line 266: 1071
        line 267: 1082
        line 268: 1089
        line 270: 1097
        line 282: 1123
        line 307: 1137
        line 308: 1145
        line 309: 1153
        line 311: 1161
        line 312: 1170
        line 313: 1186
        line 315: 1192
        line 317: 1201
        line 318: 1221
        line 320: 1227
        line 321: 1236
        line 323: 1245
        line 325: 1254
        line 326: 1262
        line 327: 1270
        line 328: 1278
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0    1279     0  this   Lext/mods/commons/gui/tools/MultisellBuilderDialog;
            0    1279     1 parent   Ljavax/swing/JFrame;
           59    1220     2 fundoDialogo   Ljava/awt/Color;
           70    1209     3 fundoLista   Ljava/awt/Color;
           88    1191     4 corTexto   Ljava/awt/Color;
          103    1176     5 corAcento   Ljava/awt/Color;
          119    1160     6 corBotaoVerde   Ljava/awt/Color;
          135    1144     7 corBotaoVermelho   Ljava/awt/Color;
          150    1129     8 corBotaoCinza   Ljava/awt/Color;
          179    1100     9 topPanel   Ljavax/swing/JPanel;
          196    1083    10 lblNpcId   Ljavax/swing/JLabel;
          214    1065    11 txtNpcId   Ljavax/swing/JTextField;
          225    1054    12 lblIdInicio   Ljavax/swing/JLabel;
          243    1036    13 txtIdInicio   Ljavax/swing/JTextField;
          254    1025    14 lblIdFinal   Ljavax/swing/JLabel;
          272    1007    15 txtIdFinal   Ljavax/swing/JTextField;
          283     996    16 cbMesmoId   Ljavax/swing/JCheckBox;
          370     909    17 ingredientPanel   Ljavax/swing/JPanel;
          429     850    18 addPanel   Ljavax/swing/JPanel;
          446     833    19 txtItemId   Ljavax/swing/JTextField;
          456     823    20 txtQuantidade   Ljavax/swing/JTextField;
          467     812    21 btnAdd   Ljavax/swing/JButton;
          493     786    22 btnRemove   Ljavax/swing/JButton;
          519     760    23 lblItemId   Ljavax/swing/JLabel;
          553     726    24 lblItemQtd   Ljavax/swing/JLabel;
          601     678    25 listModel   Ljavax/swing/DefaultListModel;
          612     667    26 ingredientList   Ljavax/swing/JList;
          653     626    27 scrollIngredients   Ljavax/swing/JScrollPane;
          721     558    28 optionsPanel   Ljavax/swing/JPanel;
          748     531    29 enchantPanel   Ljavax/swing/JPanel;
          765     514    30 cbEnchant   Ljavax/swing/JCheckBox;
          789     490    31 lblValorEnchant   Ljavax/swing/JLabel;
          806     473    32 txtEnchant   Ljavax/swing/JTextField;
          871     408    33 xmlPreview   Ljavax/swing/JTextArea;
          929     350    34 xmlScroll   Ljavax/swing/JScrollPane;
          982     297    35 bottomPanel   Ljavax/swing/JPanel;
          999     280    36 btnGerarLinhas   Ljavax/swing/JButton;
         1025     254    37 btnSalvarXML   Ljavax/swing/JButton;
         1043     236    38 thisDialog   Ljavax/swing/JDialog;
         1082     197    39 btnLimpar   Ljavax/swing/JButton;
         1170     109    40 centerPanel   Ljavax/swing/JPanel;
         1221      58    41 enchantAndPreviewPanel   Ljavax/swing/JPanel;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
          601     678    25 listModel   Ljavax/swing/DefaultListModel<Ljava/lang/String;>;
          612     667    26 ingredientList   Ljavax/swing/JList<Ljava/lang/String;>;
}
SourceFile: "MultisellBuilderDialog.java"
BootstrapMethods:
  0: #598 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #570 (Ljava/awt/event/ActionEvent;)V
      #572 REF_invokeStatic ext/mods/commons/gui/tools/MultisellBuilderDialog.lambda$new$0:(Ljavax/swing/JTextField;Ljavax/swing/JTextField;Ljavax/swing/DefaultListModel;Ljava/awt/event/ActionEvent;)V
      #570 (Ljava/awt/event/ActionEvent;)V
  1: #598 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #570 (Ljava/awt/event/ActionEvent;)V
      #575 REF_invokeStatic ext/mods/commons/gui/tools/MultisellBuilderDialog.lambda$new$1:(Ljavax/swing/JList;Ljavax/swing/DefaultListModel;Ljava/awt/event/ActionEvent;)V
      #570 (Ljava/awt/event/ActionEvent;)V
  2: #598 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #570 (Ljava/awt/event/ActionEvent;)V
      #578 REF_invokeStatic ext/mods/commons/gui/tools/MultisellBuilderDialog.lambda$new$2:(Ljavax/swing/JTextField;Ljavax/swing/JCheckBox;Ljava/awt/event/ActionEvent;)V
      #570 (Ljava/awt/event/ActionEvent;)V
  3: #598 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #570 (Ljava/awt/event/ActionEvent;)V
      #581 REF_invokeStatic ext/mods/commons/gui/tools/MultisellBuilderDialog.lambda$new$3:(Ljavax/swing/JTextField;Ljavax/swing/JTextField;Ljavax/swing/JTextField;Ljavax/swing/JCheckBox;Ljavax/swing/JCheckBox;Ljavax/swing/JTextField;Ljavax/swing/DefaultListModel;Ljavax/swing/JTextArea;Ljavax/swing/JDialog;Ljava/awt/event/ActionEvent;)V
      #570 (Ljava/awt/event/ActionEvent;)V
  4: #598 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #570 (Ljava/awt/event/ActionEvent;)V
      #584 REF_invokeStatic ext/mods/commons/gui/tools/MultisellBuilderDialog.lambda$new$4:(Ljavax/swing/JTextField;Ljavax/swing/JTextField;Ljavax/swing/JTextField;Ljavax/swing/JCheckBox;Ljavax/swing/JCheckBox;Ljavax/swing/JTextField;Ljavax/swing/DefaultListModel;Ljavax/swing/JTextArea;Ljava/awt/event/ActionEvent;)V
      #570 (Ljava/awt/event/ActionEvent;)V
  5: #598 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #570 (Ljava/awt/event/ActionEvent;)V
      #587 REF_invokeStatic ext/mods/commons/gui/tools/MultisellBuilderDialog.lambda$new$5:(Ljavax/swing/JDialog;Ljavax/swing/JTextArea;Ljava/awt/event/ActionEvent;)V
      #570 (Ljava/awt/event/ActionEvent;)V
  6: #605 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #590 \u0001.xml
  7: #605 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #592       <ingredient id=\"\u0001\" count=\"\u0001\"/>
  8: #605 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #594 Error generating XML: \u0001
  9: #605 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #596 ItemID: \u0001 | Qty: \u0001
InnerClasses:
  public static final #616= #612 of #614; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
