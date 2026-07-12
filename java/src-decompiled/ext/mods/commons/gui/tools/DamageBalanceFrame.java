// Bytecode for: ext.mods.commons.gui.tools.DamageBalanceFrame
// File: ext\mods\commons\gui\tools\DamageBalanceFrame.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/commons/gui/tools/DamageBalanceFrame.class
  Last modified 9 de jul de 2026; size 4664 bytes
  MD5 checksum 5ed446b8c55bcdb8b5a838b123b85a7d
  Compiled from "DamageBalanceFrame.java"
public class ext.mods.commons.gui.tools.DamageBalanceFrame extends javax.swing.JFrame
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #113                        // ext/mods/commons/gui/tools/DamageBalanceFrame
  super_class: #4                         // javax/swing/JFrame
  interfaces: 0, fields: 1, methods: 2, attributes: 4
Constant pool:
    #1 = String             #2            // Information Balance
    #2 = Utf8               Information Balance
    #3 = Methodref          #4.#5         // javax/swing/JFrame."<init>":(Ljava/lang/String;)V
    #4 = Class              #6            // javax/swing/JFrame
    #5 = NameAndType        #7:#8         // "<init>":(Ljava/lang/String;)V
    #6 = Utf8               javax/swing/JFrame
    #7 = Utf8               <init>
    #8 = Utf8               (Ljava/lang/String;)V
    #9 = Class              #10           // ext/mods/commons/gui/damage
   #10 = Utf8               ext/mods/commons/gui/damage
   #11 = Methodref          #9.#12        // ext/mods/commons/gui/damage."<init>":()V
   #12 = NameAndType        #7:#13        // "<init>":()V
   #13 = Utf8               ()V
   #14 = Class              #15           // javax/swing/JTable
   #15 = Utf8               javax/swing/JTable
   #16 = Methodref          #14.#17       // javax/swing/JTable."<init>":(Ljavax/swing/table/TableModel;)V
   #17 = NameAndType        #7:#18        // "<init>":(Ljavax/swing/table/TableModel;)V
   #18 = Utf8               (Ljavax/swing/table/TableModel;)V
   #19 = Class              #20           // javax/swing/JScrollPane
   #20 = Utf8               javax/swing/JScrollPane
   #21 = Methodref          #19.#22       // javax/swing/JScrollPane."<init>":(Ljava/awt/Component;)V
   #22 = NameAndType        #7:#23        // "<init>":(Ljava/awt/Component;)V
   #23 = Utf8               (Ljava/awt/Component;)V
   #24 = Class              #25           // ext/mods/commons/gui/tools/DamageBalanceFrame$1
   #25 = Utf8               ext/mods/commons/gui/tools/DamageBalanceFrame$1
   #26 = Methodref          #24.#27       // ext/mods/commons/gui/tools/DamageBalanceFrame$1."<init>":(Lext/mods/commons/gui/tools/DamageBalanceFrame;)V
   #27 = NameAndType        #7:#28        // "<init>":(Lext/mods/commons/gui/tools/DamageBalanceFrame;)V
   #28 = Utf8               (Lext/mods/commons/gui/tools/DamageBalanceFrame;)V
   #29 = Methodref          #14.#30       // javax/swing/JTable.getColumnModel:()Ljavax/swing/table/TableColumnModel;
   #30 = NameAndType        #31:#32       // getColumnModel:()Ljavax/swing/table/TableColumnModel;
   #31 = Utf8               getColumnModel
   #32 = Utf8               ()Ljavax/swing/table/TableColumnModel;
   #33 = InterfaceMethodref #34.#35       // javax/swing/table/TableColumnModel.getColumn:(I)Ljavax/swing/table/TableColumn;
   #34 = Class              #36           // javax/swing/table/TableColumnModel
   #35 = NameAndType        #37:#38       // getColumn:(I)Ljavax/swing/table/TableColumn;
   #36 = Utf8               javax/swing/table/TableColumnModel
   #37 = Utf8               getColumn
   #38 = Utf8               (I)Ljavax/swing/table/TableColumn;
   #39 = Methodref          #40.#41       // javax/swing/table/TableColumn.setCellRenderer:(Ljavax/swing/table/TableCellRenderer;)V
   #40 = Class              #42           // javax/swing/table/TableColumn
   #41 = NameAndType        #43:#44       // setCellRenderer:(Ljavax/swing/table/TableCellRenderer;)V
   #42 = Utf8               javax/swing/table/TableColumn
   #43 = Utf8               setCellRenderer
   #44 = Utf8               (Ljavax/swing/table/TableCellRenderer;)V
   #45 = Class              #46           // javax/swing/JPanel
   #46 = Utf8               javax/swing/JPanel
   #47 = Class              #48           // java/awt/BorderLayout
   #48 = Utf8               java/awt/BorderLayout
   #49 = Methodref          #47.#12       // java/awt/BorderLayout."<init>":()V
   #50 = Methodref          #45.#51       // javax/swing/JPanel."<init>":(Ljava/awt/LayoutManager;)V
   #51 = NameAndType        #7:#52        // "<init>":(Ljava/awt/LayoutManager;)V
   #52 = Utf8               (Ljava/awt/LayoutManager;)V
   #53 = Class              #54           // javax/swing/JLabel
   #54 = Utf8               javax/swing/JLabel
   #55 = String             #56           // Search class:
   #56 = Utf8               Search class:
   #57 = Methodref          #53.#5        // javax/swing/JLabel."<init>":(Ljava/lang/String;)V
   #58 = Class              #59           // javax/swing/JTextField
   #59 = Utf8               javax/swing/JTextField
   #60 = Methodref          #58.#12       // javax/swing/JTextField."<init>":()V
   #61 = String             #62           // West
   #62 = Utf8               West
   #63 = Methodref          #45.#64       // javax/swing/JPanel.add:(Ljava/awt/Component;Ljava/lang/Object;)V
   #64 = NameAndType        #65:#66       // add:(Ljava/awt/Component;Ljava/lang/Object;)V
   #65 = Utf8               add
   #66 = Utf8               (Ljava/awt/Component;Ljava/lang/Object;)V
   #67 = String             #68           // Center
   #68 = Utf8               Center
   #69 = Methodref          #58.#70       // javax/swing/JTextField.getDocument:()Ljavax/swing/text/Document;
   #70 = NameAndType        #71:#72       // getDocument:()Ljavax/swing/text/Document;
   #71 = Utf8               getDocument
   #72 = Utf8               ()Ljavax/swing/text/Document;
   #73 = Class              #74           // ext/mods/commons/gui/tools/DamageBalanceFrame$2
   #74 = Utf8               ext/mods/commons/gui/tools/DamageBalanceFrame$2
   #75 = Methodref          #73.#76       // ext/mods/commons/gui/tools/DamageBalanceFrame$2."<init>":(Lext/mods/commons/gui/tools/DamageBalanceFrame;Lext/mods/commons/gui/damage;Ljavax/swing/JTextField;)V
   #76 = NameAndType        #7:#77        // "<init>":(Lext/mods/commons/gui/tools/DamageBalanceFrame;Lext/mods/commons/gui/damage;Ljavax/swing/JTextField;)V
   #77 = Utf8               (Lext/mods/commons/gui/tools/DamageBalanceFrame;Lext/mods/commons/gui/damage;Ljavax/swing/JTextField;)V
   #78 = InterfaceMethodref #79.#80       // javax/swing/text/Document.addDocumentListener:(Ljavax/swing/event/DocumentListener;)V
   #79 = Class              #81           // javax/swing/text/Document
   #80 = NameAndType        #82:#83       // addDocumentListener:(Ljavax/swing/event/DocumentListener;)V
   #81 = Utf8               javax/swing/text/Document
   #82 = Utf8               addDocumentListener
   #83 = Utf8               (Ljavax/swing/event/DocumentListener;)V
   #84 = Class              #85           // javax/swing/JButton
   #85 = Utf8               javax/swing/JButton
   #86 = String             #87           // ?
   #87 = Utf8               ?
   #88 = Methodref          #84.#5        // javax/swing/JButton."<init>":(Ljava/lang/String;)V
   #89 = String             #90           // Click to understand the balance system
   #90 = Utf8               Click to understand the balance system
   #91 = Methodref          #84.#92       // javax/swing/JButton.setToolTipText:(Ljava/lang/String;)V
   #92 = NameAndType        #93:#8        // setToolTipText:(Ljava/lang/String;)V
   #93 = Utf8               setToolTipText
   #94 = InvokeDynamic      #0:#95        // #0:actionPerformed:(Ljavax/swing/JFrame;)Ljava/awt/event/ActionListener;
   #95 = NameAndType        #96:#97       // actionPerformed:(Ljavax/swing/JFrame;)Ljava/awt/event/ActionListener;
   #96 = Utf8               actionPerformed
   #97 = Utf8               (Ljavax/swing/JFrame;)Ljava/awt/event/ActionListener;
   #98 = Methodref          #84.#99       // javax/swing/JButton.addActionListener:(Ljava/awt/event/ActionListener;)V
   #99 = NameAndType        #100:#101     // addActionListener:(Ljava/awt/event/ActionListener;)V
  #100 = Utf8               addActionListener
  #101 = Utf8               (Ljava/awt/event/ActionListener;)V
  #102 = String             #103          // North
  #103 = Utf8               North
  #104 = String             #105          // East
  #105 = Utf8               East
  #106 = Methodref          #107.#108     // ext/mods/commons/gui/GuiUtils.loadIcons:()Ljava/util/List;
  #107 = Class              #109          // ext/mods/commons/gui/GuiUtils
  #108 = NameAndType        #110:#111     // loadIcons:()Ljava/util/List;
  #109 = Utf8               ext/mods/commons/gui/GuiUtils
  #110 = Utf8               loadIcons
  #111 = Utf8               ()Ljava/util/List;
  #112 = Methodref          #113.#114     // ext/mods/commons/gui/tools/DamageBalanceFrame.setIconImages:(Ljava/util/List;)V
  #113 = Class              #115          // ext/mods/commons/gui/tools/DamageBalanceFrame
  #114 = NameAndType        #116:#117     // setIconImages:(Ljava/util/List;)V
  #115 = Utf8               ext/mods/commons/gui/tools/DamageBalanceFrame
  #116 = Utf8               setIconImages
  #117 = Utf8               (Ljava/util/List;)V
  #118 = Methodref          #113.#119     // ext/mods/commons/gui/tools/DamageBalanceFrame.setContentPane:(Ljava/awt/Container;)V
  #119 = NameAndType        #120:#121     // setContentPane:(Ljava/awt/Container;)V
  #120 = Utf8               setContentPane
  #121 = Utf8               (Ljava/awt/Container;)V
  #122 = Methodref          #113.#123     // ext/mods/commons/gui/tools/DamageBalanceFrame.setSize:(II)V
  #123 = NameAndType        #124:#125     // setSize:(II)V
  #124 = Utf8               setSize
  #125 = Utf8               (II)V
  #126 = Methodref          #113.#127     // ext/mods/commons/gui/tools/DamageBalanceFrame.setLocationRelativeTo:(Ljava/awt/Component;)V
  #127 = NameAndType        #128:#23      // setLocationRelativeTo:(Ljava/awt/Component;)V
  #128 = Utf8               setLocationRelativeTo
  #129 = String             #130          // ? DAMAGE BALANCE PANEL (PVP)\n\n? This panel controls Physical (P.Atk) and Magical (M.Atk) damage between classes in PvP.\n? Each row represents the damage modifier from one class (Attacker) against another (Target).\n\n? P.Atk ? Controls physical damage dealt.\n? M.Atk ? Controls magical damage dealt.\n\n? Value 1.0: Normal damage, no change.\n? Value > 1.0: Increases damage (e.g., 1.2 = 20% more).\n? Value < 1.0: Reduces damage (e.g., 0.8 = 20% less).\n\n? Values directly modify the final damage calculation.\n? Colored values indicate modifications:\n - Green: damage increase.\n - Red: damage reduction.\n\n? Use the filter above to find a specific class and edit its modifiers.
  #130 = Utf8               ? DAMAGE BALANCE PANEL (PVP)\n\n? This panel controls Physical (P.Atk) and Magical (M.Atk) damage between classes in PvP.\n? Each row represents the damage modifier from one class (Attacker) against another (Target).\n\n? P.Atk ? Controls physical damage dealt.\n? M.Atk ? Controls magical damage dealt.\n\n? Value 1.0: Normal damage, no change.\n? Value > 1.0: Increases damage (e.g., 1.2 = 20% more).\n? Value < 1.0: Reduces damage (e.g., 0.8 = 20% less).\n\n? Values directly modify the final damage calculation.\n? Colored values indicate modifications:\n - Green: damage increase.\n - Red: damage reduction.\n\n? Use the filter above to find a specific class and edit its modifiers.
  #131 = String             #132          // Help - Balance System
  #132 = Utf8               Help - Balance System
  #133 = Class              #134          // javax/swing/JOptionPane
  #134 = Utf8               javax/swing/JOptionPane
  #135 = Methodref          #133.#136     // javax/swing/JOptionPane.showMessageDialog:(Ljava/awt/Component;Ljava/lang/Object;Ljava/lang/String;I)V
  #136 = NameAndType        #137:#138     // showMessageDialog:(Ljava/awt/Component;Ljava/lang/Object;Ljava/lang/String;I)V
  #137 = Utf8               showMessageDialog
  #138 = Utf8               (Ljava/awt/Component;Ljava/lang/Object;Ljava/lang/String;I)V
  #139 = Utf8               serialVersionUID
  #140 = Utf8               J
  #141 = Utf8               ConstantValue
  #142 = Long               1l
  #144 = Utf8               Code
  #145 = Utf8               LineNumberTable
  #146 = Utf8               LocalVariableTable
  #147 = Utf8               i
  #148 = Utf8               I
  #149 = Utf8               this
  #150 = Utf8               Lext/mods/commons/gui/tools/DamageBalanceFrame;
  #151 = Utf8               model
  #152 = Utf8               Lext/mods/commons/gui/damage;
  #153 = Utf8               table
  #154 = Utf8               Ljavax/swing/JTable;
  #155 = Utf8               scroll
  #156 = Utf8               Ljavax/swing/JScrollPane;
  #157 = Utf8               customRenderer
  #158 = Utf8               Ljavax/swing/table/DefaultTableCellRenderer;
  #159 = Utf8               topPanel
  #160 = Utf8               Ljavax/swing/JPanel;
  #161 = Utf8               label
  #162 = Utf8               Ljavax/swing/JLabel;
  #163 = Utf8               filterField
  #164 = Utf8               Ljavax/swing/JTextField;
  #165 = Utf8               helpButton
  #166 = Utf8               Ljavax/swing/JButton;
  #167 = Utf8               thisFrame
  #168 = Utf8               Ljavax/swing/JFrame;
  #169 = Utf8               mainPanel
  #170 = Utf8               StackMapTable
  #171 = Class              #172          // javax/swing/table/DefaultTableCellRenderer
  #172 = Utf8               javax/swing/table/DefaultTableCellRenderer
  #173 = Utf8               lambda$new$0
  #174 = Utf8               (Ljavax/swing/JFrame;Ljava/awt/event/ActionEvent;)V
  #175 = Utf8               e2
  #176 = Utf8               Ljava/awt/event/ActionEvent;
  #177 = Utf8               message
  #178 = Utf8               Ljava/lang/String;
  #179 = Utf8               SourceFile
  #180 = Utf8               DamageBalanceFrame.java
  #181 = Utf8               NestMembers
  #182 = Utf8               BootstrapMethods
  #183 = MethodType         #184          //  (Ljava/awt/event/ActionEvent;)V
  #184 = Utf8               (Ljava/awt/event/ActionEvent;)V
  #185 = MethodHandle       6:#186        // REF_invokeStatic ext/mods/commons/gui/tools/DamageBalanceFrame.lambda$new$0:(Ljavax/swing/JFrame;Ljava/awt/event/ActionEvent;)V
  #186 = Methodref          #113.#187     // ext/mods/commons/gui/tools/DamageBalanceFrame.lambda$new$0:(Ljavax/swing/JFrame;Ljava/awt/event/ActionEvent;)V
  #187 = NameAndType        #173:#174     // lambda$new$0:(Ljavax/swing/JFrame;Ljava/awt/event/ActionEvent;)V
  #188 = MethodHandle       6:#189        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #189 = Methodref          #190.#191     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #190 = Class              #192          // java/lang/invoke/LambdaMetafactory
  #191 = NameAndType        #193:#194     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #192 = Utf8               java/lang/invoke/LambdaMetafactory
  #193 = Utf8               metafactory
  #194 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #195 = Utf8               InnerClasses
  #196 = Class              #197          // java/lang/invoke/MethodHandles$Lookup
  #197 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #198 = Class              #199          // java/lang/invoke/MethodHandles
  #199 = Utf8               java/lang/invoke/MethodHandles
  #200 = Utf8               Lookup
{
  public ext.mods.commons.gui.tools.DamageBalanceFrame();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=11, args_size=1
         0: aload_0
         1: ldc           #1                  // String Information Balance
         3: invokespecial #3                  // Method javax/swing/JFrame."<init>":(Ljava/lang/String;)V
         6: new           #9                  // class ext/mods/commons/gui/damage
         9: dup
        10: invokespecial #11                 // Method ext/mods/commons/gui/damage."<init>":()V
        13: astore_1
        14: new           #14                 // class javax/swing/JTable
        17: dup
        18: aload_1
        19: invokespecial #16                 // Method javax/swing/JTable."<init>":(Ljavax/swing/table/TableModel;)V
        22: astore_2
        23: new           #19                 // class javax/swing/JScrollPane
        26: dup
        27: aload_2
        28: invokespecial #21                 // Method javax/swing/JScrollPane."<init>":(Ljava/awt/Component;)V
        31: astore_3
        32: new           #24                 // class ext/mods/commons/gui/tools/DamageBalanceFrame$1
        35: dup
        36: aload_0
        37: invokespecial #26                 // Method ext/mods/commons/gui/tools/DamageBalanceFrame$1."<init>":(Lext/mods/commons/gui/tools/DamageBalanceFrame;)V
        40: astore        4
        42: iconst_2
        43: istore        5
        45: iload         5
        47: iconst_3
        48: if_icmpgt     73
        51: aload_2
        52: invokevirtual #29                 // Method javax/swing/JTable.getColumnModel:()Ljavax/swing/table/TableColumnModel;
        55: iload         5
        57: invokeinterface #33,  2           // InterfaceMethod javax/swing/table/TableColumnModel.getColumn:(I)Ljavax/swing/table/TableColumn;
        62: aload         4
        64: invokevirtual #39                 // Method javax/swing/table/TableColumn.setCellRenderer:(Ljavax/swing/table/TableCellRenderer;)V
        67: iinc          5, 1
        70: goto          45
        73: new           #45                 // class javax/swing/JPanel
        76: dup
        77: new           #47                 // class java/awt/BorderLayout
        80: dup
        81: invokespecial #49                 // Method java/awt/BorderLayout."<init>":()V
        84: invokespecial #50                 // Method javax/swing/JPanel."<init>":(Ljava/awt/LayoutManager;)V
        87: astore        5
        89: new           #53                 // class javax/swing/JLabel
        92: dup
        93: ldc           #55                 // String Search class:
        95: invokespecial #57                 // Method javax/swing/JLabel."<init>":(Ljava/lang/String;)V
        98: astore        6
       100: new           #58                 // class javax/swing/JTextField
       103: dup
       104: invokespecial #60                 // Method javax/swing/JTextField."<init>":()V
       107: astore        7
       109: aload         5
       111: aload         6
       113: ldc           #61                 // String West
       115: invokevirtual #63                 // Method javax/swing/JPanel.add:(Ljava/awt/Component;Ljava/lang/Object;)V
       118: aload         5
       120: aload         7
       122: ldc           #67                 // String Center
       124: invokevirtual #63                 // Method javax/swing/JPanel.add:(Ljava/awt/Component;Ljava/lang/Object;)V
       127: aload         7
       129: invokevirtual #69                 // Method javax/swing/JTextField.getDocument:()Ljavax/swing/text/Document;
       132: new           #73                 // class ext/mods/commons/gui/tools/DamageBalanceFrame$2
       135: dup
       136: aload_0
       137: aload_1
       138: aload         7
       140: invokespecial #75                 // Method ext/mods/commons/gui/tools/DamageBalanceFrame$2."<init>":(Lext/mods/commons/gui/tools/DamageBalanceFrame;Lext/mods/commons/gui/damage;Ljavax/swing/JTextField;)V
       143: invokeinterface #78,  2           // InterfaceMethod javax/swing/text/Document.addDocumentListener:(Ljavax/swing/event/DocumentListener;)V
       148: new           #84                 // class javax/swing/JButton
       151: dup
       152: ldc           #86                 // String ?
       154: invokespecial #88                 // Method javax/swing/JButton."<init>":(Ljava/lang/String;)V
       157: astore        8
       159: aload         8
       161: ldc           #89                 // String Click to understand the balance system
       163: invokevirtual #91                 // Method javax/swing/JButton.setToolTipText:(Ljava/lang/String;)V
       166: aload_0
       167: astore        9
       169: aload         8
       171: aload         9
       173: invokedynamic #94,  0             // InvokeDynamic #0:actionPerformed:(Ljavax/swing/JFrame;)Ljava/awt/event/ActionListener;
       178: invokevirtual #98                 // Method javax/swing/JButton.addActionListener:(Ljava/awt/event/ActionListener;)V
       181: new           #45                 // class javax/swing/JPanel
       184: dup
       185: new           #47                 // class java/awt/BorderLayout
       188: dup
       189: invokespecial #49                 // Method java/awt/BorderLayout."<init>":()V
       192: invokespecial #50                 // Method javax/swing/JPanel."<init>":(Ljava/awt/LayoutManager;)V
       195: astore        10
       197: aload         10
       199: aload         5
       201: ldc           #102                // String North
       203: invokevirtual #63                 // Method javax/swing/JPanel.add:(Ljava/awt/Component;Ljava/lang/Object;)V
       206: aload         10
       208: aload_3
       209: ldc           #67                 // String Center
       211: invokevirtual #63                 // Method javax/swing/JPanel.add:(Ljava/awt/Component;Ljava/lang/Object;)V
       214: aload         5
       216: aload         8
       218: ldc           #104                // String East
       220: invokevirtual #63                 // Method javax/swing/JPanel.add:(Ljava/awt/Component;Ljava/lang/Object;)V
       223: aload_0
       224: invokestatic  #106                // Method ext/mods/commons/gui/GuiUtils.loadIcons:()Ljava/util/List;
       227: invokevirtual #112                // Method setIconImages:(Ljava/util/List;)V
       230: aload_0
       231: aload         10
       233: invokevirtual #118                // Method setContentPane:(Ljava/awt/Container;)V
       236: aload_0
       237: sipush        600
       240: sipush        400
       243: invokevirtual #122                // Method setSize:(II)V
       246: aload_0
       247: aconst_null
       248: invokevirtual #126                // Method setLocationRelativeTo:(Ljava/awt/Component;)V
       251: return
      LineNumberTable:
        line 46: 0
        line 48: 6
        line 49: 14
        line 50: 23
        line 52: 32
        line 79: 42
        line 80: 51
        line 79: 67
        line 83: 73
        line 84: 89
        line 85: 100
        line 86: 109
        line 87: 118
        line 89: 127
        line 106: 148
        line 107: 159
        line 109: 166
        line 110: 169
        line 115: 181
        line 116: 197
        line 117: 206
        line 118: 214
        line 120: 223
        line 121: 230
        line 122: 236
        line 123: 246
        line 124: 251
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           45      28     5     i   I
            0     252     0  this   Lext/mods/commons/gui/tools/DamageBalanceFrame;
           14     238     1 model   Lext/mods/commons/gui/damage;
           23     229     2 table   Ljavax/swing/JTable;
           32     220     3 scroll   Ljavax/swing/JScrollPane;
           42     210     4 customRenderer   Ljavax/swing/table/DefaultTableCellRenderer;
           89     163     5 topPanel   Ljavax/swing/JPanel;
          100     152     6 label   Ljavax/swing/JLabel;
          109     143     7 filterField   Ljavax/swing/JTextField;
          159      93     8 helpButton   Ljavax/swing/JButton;
          169      83     9 thisFrame   Ljavax/swing/JFrame;
          197      55    10 mainPanel   Ljavax/swing/JPanel;
      StackMapTable: number_of_entries = 2
        frame_type = 255 /* full_frame */
          offset_delta = 45
          locals = [ class ext/mods/commons/gui/tools/DamageBalanceFrame, class ext/mods/commons/gui/damage, class javax/swing/JTable, class javax/swing/JScrollPane, class javax/swing/table/DefaultTableCellRenderer, int ]
          stack = []
        frame_type = 250 /* chop */
          offset_delta = 27
}
SourceFile: "DamageBalanceFrame.java"
NestMembers:
  ext/mods/commons/gui/tools/DamageBalanceFrame$2
  ext/mods/commons/gui/tools/DamageBalanceFrame$1
BootstrapMethods:
  0: #188 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #183 (Ljava/awt/event/ActionEvent;)V
      #185 REF_invokeStatic ext/mods/commons/gui/tools/DamageBalanceFrame.lambda$new$0:(Ljavax/swing/JFrame;Ljava/awt/event/ActionEvent;)V
      #183 (Ljava/awt/event/ActionEvent;)V
InnerClasses:
  #24;                                    // class ext/mods/commons/gui/tools/DamageBalanceFrame$1
  #73;                                    // class ext/mods/commons/gui/tools/DamageBalanceFrame$2
  public static final #200= #196 of #198; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
