// Bytecode for: ext.mods.commons.gui.DBMonitorConsole
// File: ext\mods\commons\gui\DBMonitorConsole.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/commons/gui/DBMonitorConsole.class
  Last modified 9 de jul de 2026; size 12369 bytes
  MD5 checksum 95f54a8e9248cabd378fd523cd08c1d2
  Compiled from "DBMonitorConsole.java"
public class ext.mods.commons.gui.DBMonitorConsole
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #2                          // ext/mods/commons/gui/DBMonitorConsole
  super_class: #27                        // java/lang/Object
  interfaces: 0, fields: 8, methods: 15, attributes: 4
Constant pool:
    #1 = Fieldref           #2.#3         // ext/mods/commons/gui/DBMonitorConsole.INSTANCE:Lext/mods/commons/gui/DBMonitorConsole;
    #2 = Class              #4            // ext/mods/commons/gui/DBMonitorConsole
    #3 = NameAndType        #5:#6         // INSTANCE:Lext/mods/commons/gui/DBMonitorConsole;
    #4 = Utf8               ext/mods/commons/gui/DBMonitorConsole
    #5 = Utf8               INSTANCE
    #6 = Utf8               Lext/mods/commons/gui/DBMonitorConsole;
    #7 = Methodref          #2.#8         // ext/mods/commons/gui/DBMonitorConsole."<init>":()V
    #8 = NameAndType        #9:#10        // "<init>":()V
    #9 = Utf8               <init>
   #10 = Utf8               ()V
   #11 = Methodref          #12.#13       // ext/mods/commons/gui/ThemeManager.applyTheme:()V
   #12 = Class              #14           // ext/mods/commons/gui/ThemeManager
   #13 = NameAndType        #15:#10       // applyTheme:()V
   #14 = Utf8               ext/mods/commons/gui/ThemeManager
   #15 = Utf8               applyTheme
   #16 = InvokeDynamic      #0:#17        // #0:run:()Ljava/lang/Runnable;
   #17 = NameAndType        #18:#19       // run:()Ljava/lang/Runnable;
   #18 = Utf8               run
   #19 = Utf8               ()Ljava/lang/Runnable;
   #20 = Methodref          #21.#22       // javax/swing/SwingUtilities.invokeLater:(Ljava/lang/Runnable;)V
   #21 = Class              #23           // javax/swing/SwingUtilities
   #22 = NameAndType        #24:#25       // invokeLater:(Ljava/lang/Runnable;)V
   #23 = Utf8               javax/swing/SwingUtilities
   #24 = Utf8               invokeLater
   #25 = Utf8               (Ljava/lang/Runnable;)V
   #26 = Methodref          #27.#8        // java/lang/Object."<init>":()V
   #27 = Class              #28           // java/lang/Object
   #28 = Utf8               java/lang/Object
   #29 = Class              #30           // java/lang/Exception
   #30 = Utf8               java/lang/Exception
   #31 = Fieldref           #2.#32        // ext/mods/commons/gui/DBMonitorConsole.LOG:Ljava/util/logging/Logger;
   #32 = NameAndType        #33:#34       // LOG:Ljava/util/logging/Logger;
   #33 = Utf8               LOG
   #34 = Utf8               Ljava/util/logging/Logger;
   #35 = Fieldref           #36.#37       // java/util/logging/Level.SEVERE:Ljava/util/logging/Level;
   #36 = Class              #38           // java/util/logging/Level
   #37 = NameAndType        #39:#40       // SEVERE:Ljava/util/logging/Level;
   #38 = Utf8               java/util/logging/Level
   #39 = Utf8               SEVERE
   #40 = Utf8               Ljava/util/logging/Level;
   #41 = String             #42           // Falha ao aplicar o tema do ThemeManager.
   #42 = Utf8               Falha ao aplicar o tema do ThemeManager.
   #43 = Methodref          #44.#45       // java/util/logging/Logger.log:(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V
   #44 = Class              #46           // java/util/logging/Logger
   #45 = NameAndType        #47:#48       // log:(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V
   #46 = Utf8               java/util/logging/Logger
   #47 = Utf8               log
   #48 = Utf8               (Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V
   #49 = Class              #50           // javax/swing/JFrame
   #50 = Utf8               javax/swing/JFrame
   #51 = String             #52           // SQL Query Monitor
   #52 = Utf8               SQL Query Monitor
   #53 = Methodref          #49.#54       // javax/swing/JFrame."<init>":(Ljava/lang/String;)V
   #54 = NameAndType        #9:#55        // "<init>":(Ljava/lang/String;)V
   #55 = Utf8               (Ljava/lang/String;)V
   #56 = Fieldref           #2.#57        // ext/mods/commons/gui/DBMonitorConsole.frame:Ljavax/swing/JFrame;
   #57 = NameAndType        #58:#59       // frame:Ljavax/swing/JFrame;
   #58 = Utf8               frame
   #59 = Utf8               Ljavax/swing/JFrame;
   #60 = Methodref          #49.#61       // javax/swing/JFrame.setUndecorated:(Z)V
   #61 = NameAndType        #62:#63       // setUndecorated:(Z)V
   #62 = Utf8               setUndecorated
   #63 = Utf8               (Z)V
   #64 = Methodref          #49.#65       // javax/swing/JFrame.setSize:(II)V
   #65 = NameAndType        #66:#67       // setSize:(II)V
   #66 = Utf8               setSize
   #67 = Utf8               (II)V
   #68 = Methodref          #49.#69       // javax/swing/JFrame.setLocationRelativeTo:(Ljava/awt/Component;)V
   #69 = NameAndType        #70:#71       // setLocationRelativeTo:(Ljava/awt/Component;)V
   #70 = Utf8               setLocationRelativeTo
   #71 = Utf8               (Ljava/awt/Component;)V
   #72 = Class              #73           // javax/swing/JTextArea
   #73 = Utf8               javax/swing/JTextArea
   #74 = Methodref          #72.#8        // javax/swing/JTextArea."<init>":()V
   #75 = Fieldref           #2.#76        // ext/mods/commons/gui/DBMonitorConsole.console:Ljavax/swing/JTextArea;
   #76 = NameAndType        #77:#78       // console:Ljavax/swing/JTextArea;
   #77 = Utf8               console
   #78 = Utf8               Ljavax/swing/JTextArea;
   #79 = Methodref          #72.#80       // javax/swing/JTextArea.setEditable:(Z)V
   #80 = NameAndType        #81:#63       // setEditable:(Z)V
   #81 = Utf8               setEditable
   #82 = Methodref          #72.#83       // javax/swing/JTextArea.setLineWrap:(Z)V
   #83 = NameAndType        #84:#63       // setLineWrap:(Z)V
   #84 = Utf8               setLineWrap
   #85 = Methodref          #72.#86       // javax/swing/JTextArea.setWrapStyleWord:(Z)V
   #86 = NameAndType        #87:#63       // setWrapStyleWord:(Z)V
   #87 = Utf8               setWrapStyleWord
   #88 = Class              #89           // java/awt/Font
   #89 = Utf8               java/awt/Font
   #90 = String             #91           // Monospaced
   #91 = Utf8               Monospaced
   #92 = Methodref          #88.#93       // java/awt/Font."<init>":(Ljava/lang/String;II)V
   #93 = NameAndType        #9:#94        // "<init>":(Ljava/lang/String;II)V
   #94 = Utf8               (Ljava/lang/String;II)V
   #95 = Methodref          #72.#96       // javax/swing/JTextArea.setFont:(Ljava/awt/Font;)V
   #96 = NameAndType        #97:#98       // setFont:(Ljava/awt/Font;)V
   #97 = Utf8               setFont
   #98 = Utf8               (Ljava/awt/Font;)V
   #99 = Fieldref           #12.#100      // ext/mods/commons/gui/ThemeManager.COMPONENT_BACKGROUND:Ljava/awt/Color;
  #100 = NameAndType        #101:#102     // COMPONENT_BACKGROUND:Ljava/awt/Color;
  #101 = Utf8               COMPONENT_BACKGROUND
  #102 = Utf8               Ljava/awt/Color;
  #103 = Methodref          #72.#104      // javax/swing/JTextArea.setBackground:(Ljava/awt/Color;)V
  #104 = NameAndType        #105:#106     // setBackground:(Ljava/awt/Color;)V
  #105 = Utf8               setBackground
  #106 = Utf8               (Ljava/awt/Color;)V
  #107 = Fieldref           #12.#108      // ext/mods/commons/gui/ThemeManager.TEXT_COLOR:Ljava/awt/Color;
  #108 = NameAndType        #109:#102     // TEXT_COLOR:Ljava/awt/Color;
  #109 = Utf8               TEXT_COLOR
  #110 = Methodref          #72.#111      // javax/swing/JTextArea.setForeground:(Ljava/awt/Color;)V
  #111 = NameAndType        #112:#106     // setForeground:(Ljava/awt/Color;)V
  #112 = Utf8               setForeground
  #113 = Class              #114          // javax/swing/JScrollPane
  #114 = Utf8               javax/swing/JScrollPane
  #115 = Methodref          #113.#116     // javax/swing/JScrollPane."<init>":(Ljava/awt/Component;)V
  #116 = NameAndType        #9:#71        // "<init>":(Ljava/awt/Component;)V
  #117 = Fieldref           #12.#118      // ext/mods/commons/gui/ThemeManager.BORDER_COLOR:Ljava/awt/Color;
  #118 = NameAndType        #119:#102     // BORDER_COLOR:Ljava/awt/Color;
  #119 = Utf8               BORDER_COLOR
  #120 = Methodref          #121.#122     // javax/swing/BorderFactory.createLineBorder:(Ljava/awt/Color;I)Ljavax/swing/border/Border;
  #121 = Class              #123          // javax/swing/BorderFactory
  #122 = NameAndType        #124:#125     // createLineBorder:(Ljava/awt/Color;I)Ljavax/swing/border/Border;
  #123 = Utf8               javax/swing/BorderFactory
  #124 = Utf8               createLineBorder
  #125 = Utf8               (Ljava/awt/Color;I)Ljavax/swing/border/Border;
  #126 = Methodref          #113.#127     // javax/swing/JScrollPane.setBorder:(Ljavax/swing/border/Border;)V
  #127 = NameAndType        #128:#129     // setBorder:(Ljavax/swing/border/Border;)V
  #128 = Utf8               setBorder
  #129 = Utf8               (Ljavax/swing/border/Border;)V
  #130 = Methodref          #113.#131     // javax/swing/JScrollPane.getViewport:()Ljavax/swing/JViewport;
  #131 = NameAndType        #132:#133     // getViewport:()Ljavax/swing/JViewport;
  #132 = Utf8               getViewport
  #133 = Utf8               ()Ljavax/swing/JViewport;
  #134 = Methodref          #135.#104     // javax/swing/JViewport.setBackground:(Ljava/awt/Color;)V
  #135 = Class              #136          // javax/swing/JViewport
  #136 = Utf8               javax/swing/JViewport
  #137 = InvokeDynamic      #1:#138       // #1:run:(Lext/mods/commons/gui/DBMonitorConsole;)Ljava/lang/Runnable;
  #138 = NameAndType        #18:#139      // run:(Lext/mods/commons/gui/DBMonitorConsole;)Ljava/lang/Runnable;
  #139 = Utf8               (Lext/mods/commons/gui/DBMonitorConsole;)Ljava/lang/Runnable;
  #140 = String             #141          // ./images/16x16.png
  #141 = Utf8               ./images/16x16.png
  #142 = Methodref          #143.#144     // ext/mods/commons/gui/GuiUtils.loadIcons:()Ljava/util/List;
  #143 = Class              #145          // ext/mods/commons/gui/GuiUtils
  #144 = NameAndType        #146:#147     // loadIcons:()Ljava/util/List;
  #145 = Utf8               ext/mods/commons/gui/GuiUtils
  #146 = Utf8               loadIcons
  #147 = Utf8               ()Ljava/util/List;
  #148 = Methodref          #49.#149      // javax/swing/JFrame.setIconImages:(Ljava/util/List;)V
  #149 = NameAndType        #150:#151     // setIconImages:(Ljava/util/List;)V
  #150 = Utf8               setIconImages
  #151 = Utf8               (Ljava/util/List;)V
  #152 = String             #153          // Falha ao carregar ícones via GuiUtils.
  #153 = Utf8               Falha ao carregar ícones via GuiUtils.
  #154 = Methodref          #44.#155      // java/util/logging/Logger.warning:(Ljava/lang/String;)V
  #155 = NameAndType        #156:#55      // warning:(Ljava/lang/String;)V
  #156 = Utf8               warning
  #157 = Class              #158          // ext/mods/commons/gui/CustomTopPanel
  #158 = Utf8               ext/mods/commons/gui/CustomTopPanel
  #159 = Class              #160          // javax/swing/JMenuBar
  #160 = Utf8               javax/swing/JMenuBar
  #161 = Methodref          #159.#8       // javax/swing/JMenuBar."<init>":()V
  #162 = Methodref          #157.#163     // ext/mods/commons/gui/CustomTopPanel."<init>":(Ljavax/swing/JFrame;Ljavax/swing/JMenuBar;Ljava/lang/Runnable;ZLjava/lang/String;)V
  #163 = NameAndType        #9:#164       // "<init>":(Ljavax/swing/JFrame;Ljavax/swing/JMenuBar;Ljava/lang/Runnable;ZLjava/lang/String;)V
  #164 = Utf8               (Ljavax/swing/JFrame;Ljavax/swing/JMenuBar;Ljava/lang/Runnable;ZLjava/lang/String;)V
  #165 = Fieldref           #2.#166       // ext/mods/commons/gui/DBMonitorConsole.topPanel:Lext/mods/commons/gui/CustomTopPanel;
  #166 = NameAndType        #167:#168     // topPanel:Lext/mods/commons/gui/CustomTopPanel;
  #167 = Utf8               topPanel
  #168 = Utf8               Lext/mods/commons/gui/CustomTopPanel;
  #169 = Class              #170          // java/awt/BorderLayout
  #170 = Utf8               java/awt/BorderLayout
  #171 = String             #172          // North
  #172 = Utf8               North
  #173 = Methodref          #49.#174      // javax/swing/JFrame.add:(Ljava/awt/Component;Ljava/lang/Object;)V
  #174 = NameAndType        #175:#176     // add:(Ljava/awt/Component;Ljava/lang/Object;)V
  #175 = Utf8               add
  #176 = Utf8               (Ljava/awt/Component;Ljava/lang/Object;)V
  #177 = String             #178          // Center
  #178 = Utf8               Center
  #179 = Class              #180          // javax/swing/WindowConstants
  #180 = Utf8               javax/swing/WindowConstants
  #181 = Methodref          #49.#182      // javax/swing/JFrame.setDefaultCloseOperation:(I)V
  #182 = NameAndType        #183:#184     // setDefaultCloseOperation:(I)V
  #183 = Utf8               setDefaultCloseOperation
  #184 = Utf8               (I)V
  #185 = Class              #186          // java/util/Properties
  #186 = Utf8               java/util/Properties
  #187 = Methodref          #185.#8       // java/util/Properties."<init>":()V
  #188 = String             #189          // host
  #189 = Utf8               host
  #190 = String             #191          // localhost
  #191 = Utf8               localhost
  #192 = Methodref          #185.#193     // java/util/Properties.setProperty:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;
  #193 = NameAndType        #194:#195     // setProperty:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;
  #194 = Utf8               setProperty
  #195 = Utf8               (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;
  #196 = String             #197          // dbName
  #197 = Utf8               dbName
  #198 = String             #199          // l2jdb
  #199 = Utf8               l2jdb
  #200 = String             #201          // user
  #201 = Utf8               user
  #202 = String             #203          // root
  #203 = Utf8               root
  #204 = String             #205          // pass
  #205 = Utf8               pass
  #206 = String             #207          //
  #207 = Utf8
  #208 = String             #209          // driver
  #209 = Utf8               driver
  #210 = String             #211          // org.mariadb.jdbc.Driver
  #211 = Utf8               org.mariadb.jdbc.Driver
  #212 = Class              #213          // java/io/File
  #213 = Utf8               java/io/File
  #214 = String             #215          // ./game/config/server.properties
  #215 = Utf8               ./game/config/server.properties
  #216 = Methodref          #212.#54      // java/io/File."<init>":(Ljava/lang/String;)V
  #217 = Methodref          #212.#218     // java/io/File.exists:()Z
  #218 = NameAndType        #219:#220     // exists:()Z
  #219 = Utf8               exists
  #220 = Utf8               ()Z
  #221 = Class              #222          // java/io/FileInputStream
  #222 = Utf8               java/io/FileInputStream
  #223 = Methodref          #221.#224     // java/io/FileInputStream."<init>":(Ljava/io/File;)V
  #224 = NameAndType        #9:#225       // "<init>":(Ljava/io/File;)V
  #225 = Utf8               (Ljava/io/File;)V
  #226 = Methodref          #185.#227     // java/util/Properties.load:(Ljava/io/InputStream;)V
  #227 = NameAndType        #228:#229     // load:(Ljava/io/InputStream;)V
  #228 = Utf8               load
  #229 = Utf8               (Ljava/io/InputStream;)V
  #230 = String             #231          // Login
  #231 = Utf8               Login
  #232 = String             #233          // sql.login
  #233 = Utf8               sql.login
  #234 = Methodref          #185.#235     // java/util/Properties.getProperty:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #235 = NameAndType        #236:#237     // getProperty:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #236 = Utf8               getProperty
  #237 = Utf8               (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #238 = String             #239          // Password
  #239 = Utf8               Password
  #240 = String             #241          // sql.password
  #241 = Utf8               sql.password
  #242 = String             #243          // URL
  #243 = Utf8               URL
  #244 = String             #245          // sql.url
  #245 = Utf8               sql.url
  #246 = String             #247          // url
  #247 = Utf8               url
  #248 = String             #249          // jdbc:(?:mariadb|mysql)://([^:/]+)(?::\\d+)?/([^?]+)
  #249 = Utf8               jdbc:(?:mariadb|mysql)://([^:/]+)(?::\\d+)?/([^?]+)
  #250 = Methodref          #251.#252     // java/util/regex/Pattern.compile:(Ljava/lang/String;)Ljava/util/regex/Pattern;
  #251 = Class              #253          // java/util/regex/Pattern
  #252 = NameAndType        #254:#255     // compile:(Ljava/lang/String;)Ljava/util/regex/Pattern;
  #253 = Utf8               java/util/regex/Pattern
  #254 = Utf8               compile
  #255 = Utf8               (Ljava/lang/String;)Ljava/util/regex/Pattern;
  #256 = Methodref          #251.#257     // java/util/regex/Pattern.matcher:(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
  #257 = NameAndType        #258:#259     // matcher:(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
  #258 = Utf8               matcher
  #259 = Utf8               (Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
  #260 = Methodref          #261.#262     // java/util/regex/Matcher.find:()Z
  #261 = Class              #263          // java/util/regex/Matcher
  #262 = NameAndType        #264:#220     // find:()Z
  #263 = Utf8               java/util/regex/Matcher
  #264 = Utf8               find
  #265 = Methodref          #261.#266     // java/util/regex/Matcher.group:(I)Ljava/lang/String;
  #266 = NameAndType        #267:#268     // group:(I)Ljava/lang/String;
  #267 = Utf8               group
  #268 = Utf8               (I)Ljava/lang/String;
  #269 = Methodref          #221.#270     // java/io/FileInputStream.close:()V
  #270 = NameAndType        #271:#10      // close:()V
  #271 = Utf8               close
  #272 = Class              #273          // java/lang/Throwable
  #273 = Utf8               java/lang/Throwable
  #274 = Methodref          #272.#275     // java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
  #275 = NameAndType        #276:#277     // addSuppressed:(Ljava/lang/Throwable;)V
  #276 = Utf8               addSuppressed
  #277 = Utf8               (Ljava/lang/Throwable;)V
  #278 = Class              #279          // java/io/IOException
  #279 = Utf8               java/io/IOException
  #280 = String             #281          // Erro ao carregar configurações do DB de server.properties.
  #281 = Utf8               Erro ao carregar configurações do DB de server.properties.
  #282 = String             #283          // Arquivo de configuração DB não encontrado em: ./game/config/server.properties
  #283 = Utf8               Arquivo de configuração DB não encontrado em: ./game/config/server.properties
  #284 = Methodref          #185.#285     // java/util/Properties.getProperty:(Ljava/lang/String;)Ljava/lang/String;
  #285 = NameAndType        #236:#286     // getProperty:(Ljava/lang/String;)Ljava/lang/String;
  #286 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
  #287 = String             #288          // ERRO: Configuração DB ausente. Não é possível iniciar o monitoramento ativo.
  #288 = Utf8               ERRO: Configuração DB ausente. Não é possível iniciar o monitoramento ativo.
  #289 = Methodref          #2.#290       // ext/mods/commons/gui/DBMonitorConsole.logQuery:(Ljava/lang/String;J)V
  #290 = NameAndType        #291:#292     // logQuery:(Ljava/lang/String;J)V
  #291 = Utf8               logQuery
  #292 = Utf8               (Ljava/lang/String;J)V
  #293 = Fieldref           #2.#294       // ext/mods/commons/gui/DBMonitorConsole.monitoringTimer:Ljava/util/Timer;
  #294 = NameAndType        #295:#296     // monitoringTimer:Ljava/util/Timer;
  #295 = Utf8               monitoringTimer
  #296 = Utf8               Ljava/util/Timer;
  #297 = Methodref          #298.#299     // java/util/Timer.cancel:()V
  #298 = Class              #300          // java/util/Timer
  #299 = NameAndType        #301:#10      // cancel:()V
  #300 = Utf8               java/util/Timer
  #301 = Utf8               cancel
  #302 = Methodref          #303.#304     // java/lang/Class.forName:(Ljava/lang/String;)Ljava/lang/Class;
  #303 = Class              #305          // java/lang/Class
  #304 = NameAndType        #306:#307     // forName:(Ljava/lang/String;)Ljava/lang/Class;
  #305 = Utf8               java/lang/Class
  #306 = Utf8               forName
  #307 = Utf8               (Ljava/lang/String;)Ljava/lang/Class;
  #308 = Class              #309          // java/lang/ClassNotFoundException
  #309 = Utf8               java/lang/ClassNotFoundException
  #310 = InvokeDynamic      #2:#311       // #2:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #311 = NameAndType        #312:#286     // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #312 = Utf8               makeConcatWithConstants
  #313 = InvokeDynamic      #3:#311       // #3:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #314 = Methodref          #298.#315     // java/util/Timer."<init>":(Z)V
  #315 = NameAndType        #9:#63        // "<init>":(Z)V
  #316 = Class              #317          // ext/mods/commons/gui/DBMonitorConsole$1
  #317 = Utf8               ext/mods/commons/gui/DBMonitorConsole$1
  #318 = Methodref          #316.#319     // ext/mods/commons/gui/DBMonitorConsole$1."<init>":(Lext/mods/commons/gui/DBMonitorConsole;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
  #319 = NameAndType        #9:#320       // "<init>":(Lext/mods/commons/gui/DBMonitorConsole;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
  #320 = Utf8               (Lext/mods/commons/gui/DBMonitorConsole;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
  #321 = Long               5000l
  #323 = Methodref          #298.#324     // java/util/Timer.scheduleAtFixedRate:(Ljava/util/TimerTask;JJ)V
  #324 = NameAndType        #325:#326     // scheduleAtFixedRate:(Ljava/util/TimerTask;JJ)V
  #325 = Utf8               scheduleAtFixedRate
  #326 = Utf8               (Ljava/util/TimerTask;JJ)V
  #327 = String             #328          // \n--- MONITORAMENTO ATIVO INICIADO ---
  #328 = Utf8               \n--- MONITORAMENTO ATIVO INICIADO ---
  #329 = String             #330          // Checando queries globalmente a cada 5 segundos.
  #330 = Utf8               Checando queries globalmente a cada 5 segundos.
  #331 = Methodref          #298.#332     // java/util/Timer.purge:()I
  #332 = NameAndType        #333:#334     // purge:()I
  #333 = Utf8               purge
  #334 = Utf8               ()I
  #335 = String             #336          // \n--- MONITORAMENTO ATIVO INTERROMPIDO ---
  #336 = Utf8               \n--- MONITORAMENTO ATIVO INTERROMPIDO ---
  #337 = String             #338          // SELECT ID, USER, HOST, DB, COMMAND, TIME, STATE, INFO FROM information_schema.processlist WHERE COMMAND != \'Sleep\' AND TIME > 0
  #338 = Utf8               SELECT ID, USER, HOST, DB, COMMAND, TIME, STATE, INFO FROM information_schema.processlist WHERE COMMAND != \'Sleep\' AND TIME > 0
  #339 = InterfaceMethodref #340.#341     // java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
  #340 = Class              #342          // java/sql/Connection
  #341 = NameAndType        #343:#344     // prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
  #342 = Utf8               java/sql/Connection
  #343 = Utf8               prepareStatement
  #344 = Utf8               (Ljava/lang/String;)Ljava/sql/PreparedStatement;
  #345 = InterfaceMethodref #346.#347     // java/sql/PreparedStatement.executeQuery:()Ljava/sql/ResultSet;
  #346 = Class              #348          // java/sql/PreparedStatement
  #347 = NameAndType        #349:#350     // executeQuery:()Ljava/sql/ResultSet;
  #348 = Utf8               java/sql/PreparedStatement
  #349 = Utf8               executeQuery
  #350 = Utf8               ()Ljava/sql/ResultSet;
  #351 = Methodref          #352.#353     // java/lang/System.currentTimeMillis:()J
  #352 = Class              #354          // java/lang/System
  #353 = NameAndType        #355:#356     // currentTimeMillis:()J
  #354 = Utf8               java/lang/System
  #355 = Utf8               currentTimeMillis
  #356 = Utf8               ()J
  #357 = Class              #358          // java/lang/StringBuilder
  #358 = Utf8               java/lang/StringBuilder
  #359 = Methodref          #357.#8       // java/lang/StringBuilder."<init>":()V
  #360 = InterfaceMethodref #361.#362     // java/sql/ResultSet.next:()Z
  #361 = Class              #363          // java/sql/ResultSet
  #362 = NameAndType        #364:#220     // next:()Z
  #363 = Utf8               java/sql/ResultSet
  #364 = Utf8               next
  #365 = String             #366          // ID
  #366 = Utf8               ID
  #367 = InterfaceMethodref #361.#368     // java/sql/ResultSet.getLong:(Ljava/lang/String;)J
  #368 = NameAndType        #369:#370     // getLong:(Ljava/lang/String;)J
  #369 = Utf8               getLong
  #370 = Utf8               (Ljava/lang/String;)J
  #371 = String             #372          // TIME
  #372 = Utf8               TIME
  #373 = InterfaceMethodref #361.#374     // java/sql/ResultSet.getInt:(Ljava/lang/String;)I
  #374 = NameAndType        #375:#376     // getInt:(Ljava/lang/String;)I
  #375 = Utf8               getInt
  #376 = Utf8               (Ljava/lang/String;)I
  #377 = String             #378          // USER
  #378 = Utf8               USER
  #379 = InterfaceMethodref #361.#380     // java/sql/ResultSet.getString:(Ljava/lang/String;)Ljava/lang/String;
  #380 = NameAndType        #381:#286     // getString:(Ljava/lang/String;)Ljava/lang/String;
  #381 = Utf8               getString
  #382 = String             #383          // DB
  #383 = Utf8               DB
  #384 = String             #385          // N/A
  #385 = Utf8               N/A
  #386 = Methodref          #387.#388     // java/util/Objects.toString:(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;
  #387 = Class              #389          // java/util/Objects
  #388 = NameAndType        #390:#391     // toString:(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;
  #389 = Utf8               java/util/Objects
  #390 = Utf8               toString
  #391 = Utf8               (Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;
  #392 = String             #393          // COMMAND
  #393 = Utf8               COMMAND
  #394 = String             #395          // INFO
  #395 = Utf8               INFO
  #396 = Methodref          #397.#398     // java/lang/String.toUpperCase:()Ljava/lang/String;
  #397 = Class              #399          // java/lang/String
  #398 = NameAndType        #400:#401     // toUpperCase:()Ljava/lang/String;
  #399 = Utf8               java/lang/String
  #400 = Utf8               toUpperCase
  #401 = Utf8               ()Ljava/lang/String;
  #402 = String             #403          // INFORMATION_SCHEMA.PROCESSLIST
  #403 = Utf8               INFORMATION_SCHEMA.PROCESSLIST
  #404 = Methodref          #397.#405     // java/lang/String.contains:(Ljava/lang/CharSequence;)Z
  #405 = NameAndType        #406:#407     // contains:(Ljava/lang/CharSequence;)Z
  #406 = Utf8               contains
  #407 = Utf8               (Ljava/lang/CharSequence;)Z
  #408 = String             #409          // --------------------------------------------------------------------------------\n
  #409 = Utf8               --------------------------------------------------------------------------------\n
  #410 = Methodref          #357.#411     // java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
  #411 = NameAndType        #412:#413     // append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
  #412 = Utf8               append
  #413 = Utf8               (Ljava/lang/String;)Ljava/lang/StringBuilder;
  #414 = String             #415          // ALERTA: Query em Gargalo (
  #415 = Utf8               ALERTA: Query em Gargalo (
  #416 = Methodref          #357.#417     // java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
  #417 = NameAndType        #412:#418     // append:(I)Ljava/lang/StringBuilder;
  #418 = Utf8               (I)Ljava/lang/StringBuilder;
  #419 = String             #420          // s)\n
  #420 = Utf8               s)\n
  #421 = String             #422          // ID:
  #422 = Utf8               ID:
  #423 = Methodref          #357.#424     // java/lang/StringBuilder.append:(J)Ljava/lang/StringBuilder;
  #424 = NameAndType        #412:#425     // append:(J)Ljava/lang/StringBuilder;
  #425 = Utf8               (J)Ljava/lang/StringBuilder;
  #426 = String             #427          //  | DB:
  #427 = Utf8                | DB:
  #428 = String             #429          //  | User:
  #429 = Utf8                | User:
  #430 = String             #431          // \n
  #431 = Utf8               \n
  #432 = String             #433          // COMANDO:
  #433 = Utf8               COMANDO:
  #434 = String             #435          // SQL:
  #435 = Utf8               SQL:
  #436 = Methodref          #357.#437     // java/lang/StringBuilder.toString:()Ljava/lang/String;
  #437 = NameAndType        #390:#401     // toString:()Ljava/lang/String;
  #438 = Long               100l
  #440 = InvokeDynamic      #4:#441       // #4:makeConcatWithConstants:(J)Ljava/lang/String;
  #441 = NameAndType        #312:#442     // makeConcatWithConstants:(J)Ljava/lang/String;
  #442 = Utf8               (J)Ljava/lang/String;
  #443 = InterfaceMethodref #361.#270     // java/sql/ResultSet.close:()V
  #444 = InterfaceMethodref #346.#270     // java/sql/PreparedStatement.close:()V
  #445 = InvokeDynamic      #5:#441       // #5:makeConcatWithConstants:(J)Ljava/lang/String;
  #446 = String             #447          // MONITOR OK
  #447 = Utf8               MONITOR OK
  #448 = String             #449          // [%s] %s\n%s\n\n
  #449 = Utf8               [%s] %s\n%s\n\n
  #450 = Class              #451          // java/util/Date
  #451 = Utf8               java/util/Date
  #452 = Methodref          #450.#8       // java/util/Date."<init>":()V
  #453 = Methodref          #450.#437     // java/util/Date.toString:()Ljava/lang/String;
  #454 = Methodref          #397.#455     // java/lang/String.trim:()Ljava/lang/String;
  #455 = NameAndType        #456:#401     // trim:()Ljava/lang/String;
  #456 = Utf8               trim
  #457 = Methodref          #397.#458     // java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
  #458 = NameAndType        #459:#460     // format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
  #459 = Utf8               format
  #460 = Utf8               (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
  #461 = InvokeDynamic      #6:#462       // #6:run:(Lext/mods/commons/gui/DBMonitorConsole;Ljava/lang/String;)Ljava/lang/Runnable;
  #462 = NameAndType        #18:#463      // run:(Lext/mods/commons/gui/DBMonitorConsole;Ljava/lang/String;)Ljava/lang/Runnable;
  #463 = Utf8               (Lext/mods/commons/gui/DBMonitorConsole;Ljava/lang/String;)Ljava/lang/Runnable;
  #464 = Methodref          #49.#465      // javax/swing/JFrame.setVisible:(Z)V
  #465 = NameAndType        #466:#63      // setVisible:(Z)V
  #466 = Utf8               setVisible
  #467 = Methodref          #2.#468       // ext/mods/commons/gui/DBMonitorConsole.getInstance:()Lext/mods/commons/gui/DBMonitorConsole;
  #468 = NameAndType        #469:#470     // getInstance:()Lext/mods/commons/gui/DBMonitorConsole;
  #469 = Utf8               getInstance
  #470 = Utf8               ()Lext/mods/commons/gui/DBMonitorConsole;
  #471 = Methodref          #72.#472      // javax/swing/JTextArea.getText:()Ljava/lang/String;
  #472 = NameAndType        #473:#401     // getText:()Ljava/lang/String;
  #473 = Utf8               getText
  #474 = Methodref          #397.#475     // java/lang/String.length:()I
  #475 = NameAndType        #476:#334     // length:()I
  #476 = Utf8               length
  #477 = Integer            50000
  #478 = Integer            40000
  #479 = Methodref          #397.#480     // java/lang/String.substring:(I)Ljava/lang/String;
  #480 = NameAndType        #481:#268     // substring:(I)Ljava/lang/String;
  #481 = Utf8               substring
  #482 = Methodref          #72.#483      // javax/swing/JTextArea.setText:(Ljava/lang/String;)V
  #483 = NameAndType        #484:#55      // setText:(Ljava/lang/String;)V
  #484 = Utf8               setText
  #485 = Methodref          #72.#486      // javax/swing/JTextArea.append:(Ljava/lang/String;)V
  #486 = NameAndType        #412:#55      // append:(Ljava/lang/String;)V
  #487 = Methodref          #72.#488      // javax/swing/JTextArea.getDocument:()Ljavax/swing/text/Document;
  #488 = NameAndType        #489:#490     // getDocument:()Ljavax/swing/text/Document;
  #489 = Utf8               getDocument
  #490 = Utf8               ()Ljavax/swing/text/Document;
  #491 = InterfaceMethodref #492.#493     // javax/swing/text/Document.getLength:()I
  #492 = Class              #494          // javax/swing/text/Document
  #493 = NameAndType        #495:#334     // getLength:()I
  #494 = Utf8               javax/swing/text/Document
  #495 = Utf8               getLength
  #496 = Methodref          #72.#497      // javax/swing/JTextArea.setCaretPosition:(I)V
  #497 = NameAndType        #498:#184     // setCaretPosition:(I)V
  #498 = Utf8               setCaretPosition
  #499 = Methodref          #2.#500       // ext/mods/commons/gui/DBMonitorConsole.stopMonitoring:()V
  #500 = NameAndType        #501:#10      // stopMonitoring:()V
  #501 = Utf8               stopMonitoring
  #502 = Methodref          #49.#503      // javax/swing/JFrame.dispose:()V
  #503 = NameAndType        #504:#10      // dispose:()V
  #504 = Utf8               dispose
  #505 = Methodref          #2.#506       // ext/mods/commons/gui/DBMonitorConsole.initialize:()V
  #506 = NameAndType        #507:#10      // initialize:()V
  #507 = Utf8               initialize
  #508 = Methodref          #2.#509       // ext/mods/commons/gui/DBMonitorConsole.showWindow:()V
  #509 = NameAndType        #510:#10      // showWindow:()V
  #510 = Utf8               showWindow
  #511 = Methodref          #2.#512       // ext/mods/commons/gui/DBMonitorConsole.loadDatabaseConfig:()Ljava/util/Properties;
  #512 = NameAndType        #513:#514     // loadDatabaseConfig:()Ljava/util/Properties;
  #513 = Utf8               loadDatabaseConfig
  #514 = Utf8               ()Ljava/util/Properties;
  #515 = Methodref          #2.#516       // ext/mods/commons/gui/DBMonitorConsole.startActiveMonitoring:(Ljava/util/Properties;)V
  #516 = NameAndType        #517:#518     // startActiveMonitoring:(Ljava/util/Properties;)V
  #517 = Utf8               startActiveMonitoring
  #518 = Utf8               (Ljava/util/Properties;)V
  #519 = Methodref          #303.#520     // java/lang/Class.getName:()Ljava/lang/String;
  #520 = NameAndType        #521:#401     // getName:()Ljava/lang/String;
  #521 = Utf8               getName
  #522 = Methodref          #44.#523      // java/util/logging/Logger.getLogger:(Ljava/lang/String;)Ljava/util/logging/Logger;
  #523 = NameAndType        #524:#525     // getLogger:(Ljava/lang/String;)Ljava/util/logging/Logger;
  #524 = Utf8               getLogger
  #525 = Utf8               (Ljava/lang/String;)Ljava/util/logging/Logger;
  #526 = Utf8               SERVER_PROPERTIES_PATH
  #527 = Utf8               Ljava/lang/String;
  #528 = Utf8               ConstantValue
  #529 = Utf8               MONITOR_INTERVAL_MS
  #530 = Utf8               J
  #531 = Utf8               Code
  #532 = Utf8               LineNumberTable
  #533 = Utf8               StackMapTable
  #534 = Utf8               main
  #535 = Utf8               ([Ljava/lang/String;)V
  #536 = Utf8               LocalVariableTable
  #537 = Utf8               args
  #538 = Utf8               [Ljava/lang/String;
  #539 = Utf8               this
  #540 = Utf8               e
  #541 = Utf8               Ljava/lang/Exception;
  #542 = Utf8               scroll
  #543 = Utf8               Ljavax/swing/JScrollPane;
  #544 = Utf8               closeAction
  #545 = Utf8               Ljava/lang/Runnable;
  #546 = Utf8               iconPath
  #547 = Class              #548          // java/lang/Runnable
  #548 = Utf8               java/lang/Runnable
  #549 = Utf8               serverProps
  #550 = Utf8               Ljava/util/Properties;
  #551 = Utf8               patternMariadb
  #552 = Utf8               Ljava/util/regex/Pattern;
  #553 = Utf8               Ljava/util/regex/Matcher;
  #554 = Utf8               fis
  #555 = Utf8               Ljava/io/FileInputStream;
  #556 = Utf8               Ljava/io/IOException;
  #557 = Utf8               dbProps
  #558 = Utf8               propsFile
  #559 = Utf8               Ljava/io/File;
  #560 = Utf8               Ljava/lang/ClassNotFoundException;
  #561 = Utf8               dbConfig
  #562 = Utf8               checkLongRunningQueries
  #563 = Utf8               (Ljava/sql/Connection;)V
  #564 = Utf8               id
  #565 = Utf8               timeSeconds
  #566 = Utf8               I
  #567 = Utf8               db
  #568 = Utf8               command
  #569 = Utf8               info
  #570 = Utf8               startTime
  #571 = Utf8               count
  #572 = Utf8               sb
  #573 = Utf8               Ljava/lang/StringBuilder;
  #574 = Utf8               duration
  #575 = Utf8               rs
  #576 = Utf8               Ljava/sql/ResultSet;
  #577 = Utf8               ps
  #578 = Utf8               Ljava/sql/PreparedStatement;
  #579 = Utf8               conn
  #580 = Utf8               Ljava/sql/Connection;
  #581 = Utf8               SQL_PROCESSLIST
  #582 = Utf8               Exceptions
  #583 = Class              #584          // java/sql/SQLException
  #584 = Utf8               java/sql/SQLException
  #585 = Utf8               timeStatus
  #586 = Utf8               sql
  #587 = Utf8               executionTimeMs
  #588 = Utf8               logEntry
  #589 = Utf8               lambda$logQuery$0
  #590 = Utf8               lambda$initialize$0
  #591 = Utf8               lambda$main$0
  #592 = Utf8               monitor
  #593 = Utf8               <clinit>
  #594 = Utf8               SourceFile
  #595 = Utf8               DBMonitorConsole.java
  #596 = Utf8               NestMembers
  #597 = Utf8               BootstrapMethods
  #598 = MethodType         #10           //  ()V
  #599 = MethodHandle       6:#600        // REF_invokeStatic ext/mods/commons/gui/DBMonitorConsole.lambda$main$0:()V
  #600 = Methodref          #2.#601       // ext/mods/commons/gui/DBMonitorConsole.lambda$main$0:()V
  #601 = NameAndType        #591:#10      // lambda$main$0:()V
  #602 = MethodHandle       5:#603        // REF_invokeVirtual ext/mods/commons/gui/DBMonitorConsole.lambda$initialize$0:()V
  #603 = Methodref          #2.#604       // ext/mods/commons/gui/DBMonitorConsole.lambda$initialize$0:()V
  #604 = NameAndType        #590:#10      // lambda$initialize$0:()V
  #605 = String             #606          // ERRO: Driver JDBC (\u0001) não encontrado. O monitoramento ativo falhará.
  #606 = Utf8               ERRO: Driver JDBC (\u0001) não encontrado. O monitoramento ativo falhará.
  #607 = String             #608          // Monitoramento ativo configurado para DB: \u0001
  #608 = Utf8               Monitoramento ativo configurado para DB: \u0001
  #609 = String             #610          // Monitor OK, mas a consulta levou \u0001ms para ser executada.
  #610 = Utf8               Monitor OK, mas a consulta levou \u0001ms para ser executada.
  #611 = String             #612          // MONITOR LENTO (\u0001ms)
  #612 = Utf8               MONITOR LENTO (\u0001ms)
  #613 = MethodHandle       5:#614        // REF_invokeVirtual ext/mods/commons/gui/DBMonitorConsole.lambda$logQuery$0:(Ljava/lang/String;)V
  #614 = Methodref          #2.#615       // ext/mods/commons/gui/DBMonitorConsole.lambda$logQuery$0:(Ljava/lang/String;)V
  #615 = NameAndType        #589:#55      // lambda$logQuery$0:(Ljava/lang/String;)V
  #616 = MethodHandle       6:#617        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #617 = Methodref          #618.#619     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #618 = Class              #620          // java/lang/invoke/LambdaMetafactory
  #619 = NameAndType        #621:#622     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #620 = Utf8               java/lang/invoke/LambdaMetafactory
  #621 = Utf8               metafactory
  #622 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #623 = MethodHandle       6:#624        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #624 = Methodref          #625.#626     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #625 = Class              #627          // java/lang/invoke/StringConcatFactory
  #626 = NameAndType        #312:#628     // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #627 = Utf8               java/lang/invoke/StringConcatFactory
  #628 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #629 = Utf8               InnerClasses
  #630 = Class              #631          // java/lang/invoke/MethodHandles$Lookup
  #631 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #632 = Class              #633          // java/lang/invoke/MethodHandles
  #633 = Utf8               java/lang/invoke/MethodHandles
  #634 = Utf8               Lookup
{
  public static ext.mods.commons.gui.DBMonitorConsole getInstance();
    descriptor: ()Lext/mods/commons/gui/DBMonitorConsole;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=0, args_size=0
         0: getstatic     #1                  // Field INSTANCE:Lext/mods/commons/gui/DBMonitorConsole;
         3: ifnonnull     16
         6: new           #2                  // class ext/mods/commons/gui/DBMonitorConsole
         9: dup
        10: invokespecial #7                  // Method "<init>":()V
        13: putstatic     #1                  // Field INSTANCE:Lext/mods/commons/gui/DBMonitorConsole;
        16: getstatic     #1                  // Field INSTANCE:Lext/mods/commons/gui/DBMonitorConsole;
        19: areturn
      LineNumberTable:
        line 74: 0
        line 75: 6
        line 77: 16
      StackMapTable: number_of_entries = 1
        frame_type = 16 /* same */

  public static void main(java.lang.String[]);
    descriptor: ([Ljava/lang/String;)V
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=1, args_size=1
         0: invokestatic  #11                 // Method ext/mods/commons/gui/ThemeManager.applyTheme:()V
         3: invokedynamic #16,  0             // InvokeDynamic #0:run:()Ljava/lang/Runnable;
         8: invokestatic  #20                 // Method javax/swing/SwingUtilities.invokeLater:(Ljava/lang/Runnable;)V
        11: return
      LineNumberTable:
        line 81: 0
        line 83: 3
        line 95: 11
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0  args   [Ljava/lang/String;

  public void initialize();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=8, locals=5, args_size=1
         0: invokestatic  #11                 // Method ext/mods/commons/gui/ThemeManager.applyTheme:()V
         3: goto          19
         6: astore_1
         7: getstatic     #31                 // Field LOG:Ljava/util/logging/Logger;
        10: getstatic     #35                 // Field java/util/logging/Level.SEVERE:Ljava/util/logging/Level;
        13: ldc           #41                 // String Falha ao aplicar o tema do ThemeManager.
        15: aload_1
        16: invokevirtual #43                 // Method java/util/logging/Logger.log:(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V
        19: aload_0
        20: new           #49                 // class javax/swing/JFrame
        23: dup
        24: ldc           #51                 // String SQL Query Monitor
        26: invokespecial #53                 // Method javax/swing/JFrame."<init>":(Ljava/lang/String;)V
        29: putfield      #56                 // Field frame:Ljavax/swing/JFrame;
        32: aload_0
        33: getfield      #56                 // Field frame:Ljavax/swing/JFrame;
        36: iconst_1
        37: invokevirtual #60                 // Method javax/swing/JFrame.setUndecorated:(Z)V
        40: aload_0
        41: getfield      #56                 // Field frame:Ljavax/swing/JFrame;
        44: sipush        1000
        47: sipush        600
        50: invokevirtual #64                 // Method javax/swing/JFrame.setSize:(II)V
        53: aload_0
        54: getfield      #56                 // Field frame:Ljavax/swing/JFrame;
        57: aconst_null
        58: invokevirtual #68                 // Method javax/swing/JFrame.setLocationRelativeTo:(Ljava/awt/Component;)V
        61: aload_0
        62: new           #72                 // class javax/swing/JTextArea
        65: dup
        66: invokespecial #74                 // Method javax/swing/JTextArea."<init>":()V
        69: putfield      #75                 // Field console:Ljavax/swing/JTextArea;
        72: aload_0
        73: getfield      #75                 // Field console:Ljavax/swing/JTextArea;
        76: iconst_0
        77: invokevirtual #79                 // Method javax/swing/JTextArea.setEditable:(Z)V
        80: aload_0
        81: getfield      #75                 // Field console:Ljavax/swing/JTextArea;
        84: iconst_1
        85: invokevirtual #82                 // Method javax/swing/JTextArea.setLineWrap:(Z)V
        88: aload_0
        89: getfield      #75                 // Field console:Ljavax/swing/JTextArea;
        92: iconst_1
        93: invokevirtual #85                 // Method javax/swing/JTextArea.setWrapStyleWord:(Z)V
        96: aload_0
        97: getfield      #75                 // Field console:Ljavax/swing/JTextArea;
       100: new           #88                 // class java/awt/Font
       103: dup
       104: ldc           #90                 // String Monospaced
       106: iconst_0
       107: bipush        12
       109: invokespecial #92                 // Method java/awt/Font."<init>":(Ljava/lang/String;II)V
       112: invokevirtual #95                 // Method javax/swing/JTextArea.setFont:(Ljava/awt/Font;)V
       115: aload_0
       116: getfield      #75                 // Field console:Ljavax/swing/JTextArea;
       119: getstatic     #99                 // Field ext/mods/commons/gui/ThemeManager.COMPONENT_BACKGROUND:Ljava/awt/Color;
       122: invokevirtual #103                // Method javax/swing/JTextArea.setBackground:(Ljava/awt/Color;)V
       125: aload_0
       126: getfield      #75                 // Field console:Ljavax/swing/JTextArea;
       129: getstatic     #107                // Field ext/mods/commons/gui/ThemeManager.TEXT_COLOR:Ljava/awt/Color;
       132: invokevirtual #110                // Method javax/swing/JTextArea.setForeground:(Ljava/awt/Color;)V
       135: new           #113                // class javax/swing/JScrollPane
       138: dup
       139: aload_0
       140: getfield      #75                 // Field console:Ljavax/swing/JTextArea;
       143: invokespecial #115                // Method javax/swing/JScrollPane."<init>":(Ljava/awt/Component;)V
       146: astore_1
       147: aload_1
       148: getstatic     #117                // Field ext/mods/commons/gui/ThemeManager.BORDER_COLOR:Ljava/awt/Color;
       151: iconst_1
       152: invokestatic  #120                // Method javax/swing/BorderFactory.createLineBorder:(Ljava/awt/Color;I)Ljavax/swing/border/Border;
       155: invokevirtual #126                // Method javax/swing/JScrollPane.setBorder:(Ljavax/swing/border/Border;)V
       158: aload_1
       159: invokevirtual #130                // Method javax/swing/JScrollPane.getViewport:()Ljavax/swing/JViewport;
       162: getstatic     #99                 // Field ext/mods/commons/gui/ThemeManager.COMPONENT_BACKGROUND:Ljava/awt/Color;
       165: invokevirtual #134                // Method javax/swing/JViewport.setBackground:(Ljava/awt/Color;)V
       168: aload_0
       169: invokedynamic #137,  0            // InvokeDynamic #1:run:(Lext/mods/commons/gui/DBMonitorConsole;)Ljava/lang/Runnable;
       174: astore_2
       175: ldc           #140                // String ./images/16x16.png
       177: astore_3
       178: aload_0
       179: getfield      #56                 // Field frame:Ljavax/swing/JFrame;
       182: invokestatic  #142                // Method ext/mods/commons/gui/GuiUtils.loadIcons:()Ljava/util/List;
       185: invokevirtual #148                // Method javax/swing/JFrame.setIconImages:(Ljava/util/List;)V
       188: goto          201
       191: astore        4
       193: getstatic     #31                 // Field LOG:Ljava/util/logging/Logger;
       196: ldc           #152                // String Falha ao carregar ícones via GuiUtils.
       198: invokevirtual #154                // Method java/util/logging/Logger.warning:(Ljava/lang/String;)V
       201: aload_0
       202: new           #157                // class ext/mods/commons/gui/CustomTopPanel
       205: dup
       206: aload_0
       207: getfield      #56                 // Field frame:Ljavax/swing/JFrame;
       210: new           #159                // class javax/swing/JMenuBar
       213: dup
       214: invokespecial #161                // Method javax/swing/JMenuBar."<init>":()V
       217: aload_2
       218: iconst_1
       219: aload_3
       220: invokespecial #162                // Method ext/mods/commons/gui/CustomTopPanel."<init>":(Ljavax/swing/JFrame;Ljavax/swing/JMenuBar;Ljava/lang/Runnable;ZLjava/lang/String;)V
       223: putfield      #165                // Field topPanel:Lext/mods/commons/gui/CustomTopPanel;
       226: aload_0
       227: getfield      #56                 // Field frame:Ljavax/swing/JFrame;
       230: aload_0
       231: getfield      #165                // Field topPanel:Lext/mods/commons/gui/CustomTopPanel;
       234: ldc           #171                // String North
       236: invokevirtual #173                // Method javax/swing/JFrame.add:(Ljava/awt/Component;Ljava/lang/Object;)V
       239: aload_0
       240: getfield      #56                 // Field frame:Ljavax/swing/JFrame;
       243: aload_1
       244: ldc           #177                // String Center
       246: invokevirtual #173                // Method javax/swing/JFrame.add:(Ljava/awt/Component;Ljava/lang/Object;)V
       249: aload_0
       250: getfield      #56                 // Field frame:Ljavax/swing/JFrame;
       253: iconst_2
       254: invokevirtual #181                // Method javax/swing/JFrame.setDefaultCloseOperation:(I)V
       257: return
      Exception table:
         from    to  target type
             0     3     6   Class java/lang/Exception
           178   188   191   Class java/lang/Exception
      LineNumberTable:
        line 102: 0
        line 105: 3
        line 103: 6
        line 104: 7
        line 107: 19
        line 108: 32
        line 109: 40
        line 110: 53
        line 112: 61
        line 113: 72
        line 114: 80
        line 115: 88
        line 116: 96
        line 118: 115
        line 119: 125
        line 121: 135
        line 122: 147
        line 123: 158
        line 125: 168
        line 130: 175
        line 133: 178
        line 136: 188
        line 134: 191
        line 135: 193
        line 138: 201
        line 140: 226
        line 141: 239
        line 143: 249
        line 144: 257
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            7      12     1     e   Ljava/lang/Exception;
          193       8     4     e   Ljava/lang/Exception;
            0     258     0  this   Lext/mods/commons/gui/DBMonitorConsole;
          147     111     1 scroll   Ljavax/swing/JScrollPane;
          175      83     2 closeAction   Ljava/lang/Runnable;
          178      80     3 iconPath   Ljava/lang/String;
      StackMapTable: number_of_entries = 4
        frame_type = 70 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 12 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 171
          locals = [ class ext/mods/commons/gui/DBMonitorConsole, class javax/swing/JScrollPane, class java/lang/Runnable, class java/lang/String ]
          stack = [ class java/lang/Exception ]
        frame_type = 9 /* same */

  public void showWindow();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #56                 // Field frame:Ljavax/swing/JFrame;
         4: ifnull        15
         7: aload_0
         8: getfield      #56                 // Field frame:Ljavax/swing/JFrame;
        11: iconst_1
        12: invokevirtual #464                // Method javax/swing/JFrame.setVisible:(Z)V
        15: return
      LineNumberTable:
        line 320: 0
        line 321: 7
        line 323: 15
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      16     0  this   Lext/mods/commons/gui/DBMonitorConsole;
      StackMapTable: number_of_entries = 1
        frame_type = 15 /* same */

  public static void log(java.lang.String, long);
    descriptor: (Ljava/lang/String;J)V
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=4, locals=3, args_size=2
         0: invokestatic  #467                // Method getInstance:()Lext/mods/commons/gui/DBMonitorConsole;
         3: aload_0
         4: lload_1
         5: invokevirtual #289                // Method logQuery:(Ljava/lang/String;J)V
         8: return
      LineNumberTable:
        line 329: 0
        line 330: 8
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       9     0   sql   Ljava/lang/String;
            0       9     1 executionTimeMs   J

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: ldc           #2                  // class ext/mods/commons/gui/DBMonitorConsole
         2: invokevirtual #519                // Method java/lang/Class.getName:()Ljava/lang/String;
         5: invokestatic  #522                // Method java/util/logging/Logger.getLogger:(Ljava/lang/String;)Ljava/util/logging/Logger;
         8: putstatic     #31                 // Field LOG:Ljava/util/logging/Logger;
        11: return
      LineNumberTable:
        line 61: 0
}
SourceFile: "DBMonitorConsole.java"
NestMembers:
  ext/mods/commons/gui/DBMonitorConsole$1
BootstrapMethods:
  0: #616 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #598 ()V
      #599 REF_invokeStatic ext/mods/commons/gui/DBMonitorConsole.lambda$main$0:()V
      #598 ()V
  1: #616 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #598 ()V
      #602 REF_invokeVirtual ext/mods/commons/gui/DBMonitorConsole.lambda$initialize$0:()V
      #598 ()V
  2: #623 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #605 ERRO: Driver JDBC (\u0001) não encontrado. O monitoramento ativo falhará.
  3: #623 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #607 Monitoramento ativo configurado para DB: \u0001
  4: #623 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #609 Monitor OK, mas a consulta levou \u0001ms para ser executada.
  5: #623 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #611 MONITOR LENTO (\u0001ms)
  6: #616 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #598 ()V
      #613 REF_invokeVirtual ext/mods/commons/gui/DBMonitorConsole.lambda$logQuery$0:(Ljava/lang/String;)V
      #598 ()V
InnerClasses:
  #316;                                   // class ext/mods/commons/gui/DBMonitorConsole$1
  public static final #634= #630 of #632; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
