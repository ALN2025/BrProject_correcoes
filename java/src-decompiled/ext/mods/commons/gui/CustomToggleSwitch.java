// Bytecode for: ext.mods.commons.gui.CustomToggleSwitch
// File: ext\mods\commons\gui\CustomToggleSwitch.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/commons/gui/CustomToggleSwitch.class
  Last modified 9 de jul de 2026; size 6908 bytes
  MD5 checksum 8ea727063f17eeac49ee2665279d1923
  Compiled from "CustomToggleSwitch.java"
public class ext.mods.commons.gui.CustomToggleSwitch extends javax.swing.JComponent
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #11                         // ext/mods/commons/gui/CustomToggleSwitch
  super_class: #2                         // javax/swing/JComponent
  interfaces: 0, fields: 13, methods: 11, attributes: 4
Constant pool:
    #1 = Methodref          #2.#3         // javax/swing/JComponent."<init>":()V
    #2 = Class              #4            // javax/swing/JComponent
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               javax/swing/JComponent
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Class              #8            // java/util/ArrayList
    #8 = Utf8               java/util/ArrayList
    #9 = Methodref          #7.#3         // java/util/ArrayList."<init>":()V
   #10 = Fieldref           #11.#12       // ext/mods/commons/gui/CustomToggleSwitch.listeners:Ljava/util/List;
   #11 = Class              #13           // ext/mods/commons/gui/CustomToggleSwitch
   #12 = NameAndType        #14:#15       // listeners:Ljava/util/List;
   #13 = Utf8               ext/mods/commons/gui/CustomToggleSwitch
   #14 = Utf8               listeners
   #15 = Utf8               Ljava/util/List;
   #16 = Fieldref           #17.#18       // ext/mods/commons/gui/ThemeManager.BORDER_COLOR:Ljava/awt/Color;
   #17 = Class              #19           // ext/mods/commons/gui/ThemeManager
   #18 = NameAndType        #20:#21       // BORDER_COLOR:Ljava/awt/Color;
   #19 = Utf8               ext/mods/commons/gui/ThemeManager
   #20 = Utf8               BORDER_COLOR
   #21 = Utf8               Ljava/awt/Color;
   #22 = Methodref          #23.#24       // java/awt/Color.darker:()Ljava/awt/Color;
   #23 = Class              #25           // java/awt/Color
   #24 = NameAndType        #26:#27       // darker:()Ljava/awt/Color;
   #25 = Utf8               java/awt/Color
   #26 = Utf8               darker
   #27 = Utf8               ()Ljava/awt/Color;
   #28 = Fieldref           #11.#29       // ext/mods/commons/gui/CustomToggleSwitch.trackColorOff:Ljava/awt/Color;
   #29 = NameAndType        #30:#21       // trackColorOff:Ljava/awt/Color;
   #30 = Utf8               trackColorOff
   #31 = Fieldref           #17.#32       // ext/mods/commons/gui/ThemeManager.BASE_PURPLE:Ljava/awt/Color;
   #32 = NameAndType        #33:#21       // BASE_PURPLE:Ljava/awt/Color;
   #33 = Utf8               BASE_PURPLE
   #34 = Fieldref           #11.#35       // ext/mods/commons/gui/CustomToggleSwitch.trackColorOn:Ljava/awt/Color;
   #35 = NameAndType        #36:#21       // trackColorOn:Ljava/awt/Color;
   #36 = Utf8               trackColorOn
   #37 = Fieldref           #11.#38       // ext/mods/commons/gui/CustomToggleSwitch.trackBorderColorOff:Ljava/awt/Color;
   #38 = NameAndType        #39:#21       // trackBorderColorOff:Ljava/awt/Color;
   #39 = Utf8               trackBorderColorOff
   #40 = Methodref          #23.#41       // java/awt/Color.brighter:()Ljava/awt/Color;
   #41 = NameAndType        #42:#27       // brighter:()Ljava/awt/Color;
   #42 = Utf8               brighter
   #43 = Fieldref           #11.#44       // ext/mods/commons/gui/CustomToggleSwitch.trackBorderColorOn:Ljava/awt/Color;
   #44 = NameAndType        #45:#21       // trackBorderColorOn:Ljava/awt/Color;
   #45 = Utf8               trackBorderColorOn
   #46 = Methodref          #23.#47       // java/awt/Color."<init>":(III)V
   #47 = NameAndType        #5:#48        // "<init>":(III)V
   #48 = Utf8               (III)V
   #49 = Fieldref           #11.#50       // ext/mods/commons/gui/CustomToggleSwitch.knobColor:Ljava/awt/Color;
   #50 = NameAndType        #51:#21       // knobColor:Ljava/awt/Color;
   #51 = Utf8               knobColor
   #52 = Class              #53           // java/awt/Dimension
   #53 = Utf8               java/awt/Dimension
   #54 = Methodref          #52.#55       // java/awt/Dimension."<init>":(II)V
   #55 = NameAndType        #5:#56        // "<init>":(II)V
   #56 = Utf8               (II)V
   #57 = Fieldref           #11.#58       // ext/mods/commons/gui/CustomToggleSwitch.preferredSize:Ljava/awt/Dimension;
   #58 = NameAndType        #59:#60       // preferredSize:Ljava/awt/Dimension;
   #59 = Utf8               preferredSize
   #60 = Utf8               Ljava/awt/Dimension;
   #61 = Fieldref           #11.#62       // ext/mods/commons/gui/CustomToggleSwitch.trackArc:I
   #62 = NameAndType        #63:#64       // trackArc:I
   #63 = Utf8               trackArc
   #64 = Utf8               I
   #65 = Fieldref           #11.#66       // ext/mods/commons/gui/CustomToggleSwitch.knobArc:I
   #66 = NameAndType        #67:#64       // knobArc:I
   #67 = Utf8               knobArc
   #68 = Fieldref           #11.#69       // ext/mods/commons/gui/CustomToggleSwitch.padding:I
   #69 = NameAndType        #70:#64       // padding:I
   #70 = Utf8               padding
   #71 = Methodref          #11.#72       // ext/mods/commons/gui/CustomToggleSwitch.setPreferredSize:(Ljava/awt/Dimension;)V
   #72 = NameAndType        #73:#74       // setPreferredSize:(Ljava/awt/Dimension;)V
   #73 = Utf8               setPreferredSize
   #74 = Utf8               (Ljava/awt/Dimension;)V
   #75 = Methodref          #11.#76       // ext/mods/commons/gui/CustomToggleSwitch.setMinimumSize:(Ljava/awt/Dimension;)V
   #76 = NameAndType        #77:#74       // setMinimumSize:(Ljava/awt/Dimension;)V
   #77 = Utf8               setMinimumSize
   #78 = Methodref          #11.#79       // ext/mods/commons/gui/CustomToggleSwitch.setMaximumSize:(Ljava/awt/Dimension;)V
   #79 = NameAndType        #80:#74       // setMaximumSize:(Ljava/awt/Dimension;)V
   #80 = Utf8               setMaximumSize
   #81 = Class              #82           // java/awt/Cursor
   #82 = Utf8               java/awt/Cursor
   #83 = Methodref          #81.#84       // java/awt/Cursor.getPredefinedCursor:(I)Ljava/awt/Cursor;
   #84 = NameAndType        #85:#86       // getPredefinedCursor:(I)Ljava/awt/Cursor;
   #85 = Utf8               getPredefinedCursor
   #86 = Utf8               (I)Ljava/awt/Cursor;
   #87 = Methodref          #11.#88       // ext/mods/commons/gui/CustomToggleSwitch.setCursor:(Ljava/awt/Cursor;)V
   #88 = NameAndType        #89:#90       // setCursor:(Ljava/awt/Cursor;)V
   #89 = Utf8               setCursor
   #90 = Utf8               (Ljava/awt/Cursor;)V
   #91 = Methodref          #11.#92       // ext/mods/commons/gui/CustomToggleSwitch.setOpaque:(Z)V
   #92 = NameAndType        #93:#94       // setOpaque:(Z)V
   #93 = Utf8               setOpaque
   #94 = Utf8               (Z)V
   #95 = Fieldref           #11.#96       // ext/mods/commons/gui/CustomToggleSwitch.isOn:Z
   #96 = NameAndType        #97:#98       // isOn:Z
   #97 = Utf8               isOn
   #98 = Utf8               Z
   #99 = Fieldref           #52.#100      // java/awt/Dimension.height:I
  #100 = NameAndType        #101:#64      // height:I
  #101 = Utf8               height
  #102 = Fieldref           #52.#103      // java/awt/Dimension.width:I
  #103 = NameAndType        #104:#64      // width:I
  #104 = Utf8               width
  #105 = Fieldref           #11.#106      // ext/mods/commons/gui/CustomToggleSwitch.knobPosition:F
  #106 = NameAndType        #107:#108     // knobPosition:F
  #107 = Utf8               knobPosition
  #108 = Utf8               F
  #109 = Class              #110          // ext/mods/commons/gui/CustomToggleSwitch$1
  #110 = Utf8               ext/mods/commons/gui/CustomToggleSwitch$1
  #111 = Methodref          #109.#112     // ext/mods/commons/gui/CustomToggleSwitch$1."<init>":(Lext/mods/commons/gui/CustomToggleSwitch;)V
  #112 = NameAndType        #5:#113       // "<init>":(Lext/mods/commons/gui/CustomToggleSwitch;)V
  #113 = Utf8               (Lext/mods/commons/gui/CustomToggleSwitch;)V
  #114 = Methodref          #11.#115      // ext/mods/commons/gui/CustomToggleSwitch.addMouseListener:(Ljava/awt/event/MouseListener;)V
  #115 = NameAndType        #116:#117     // addMouseListener:(Ljava/awt/event/MouseListener;)V
  #116 = Utf8               addMouseListener
  #117 = Utf8               (Ljava/awt/event/MouseListener;)V
  #118 = Methodref          #11.#119      // ext/mods/commons/gui/CustomToggleSwitch.setOn:(ZZ)V
  #119 = NameAndType        #120:#121     // setOn:(ZZ)V
  #120 = Utf8               setOn
  #121 = Utf8               (ZZ)V
  #122 = Fieldref           #11.#123      // ext/mods/commons/gui/CustomToggleSwitch.animator:Ljavax/swing/Timer;
  #123 = NameAndType        #124:#125     // animator:Ljavax/swing/Timer;
  #124 = Utf8               animator
  #125 = Utf8               Ljavax/swing/Timer;
  #126 = Methodref          #127.#128     // javax/swing/Timer.isRunning:()Z
  #127 = Class              #129          // javax/swing/Timer
  #128 = NameAndType        #130:#131     // isRunning:()Z
  #129 = Utf8               javax/swing/Timer
  #130 = Utf8               isRunning
  #131 = Utf8               ()Z
  #132 = Methodref          #127.#133     // javax/swing/Timer.stop:()V
  #133 = NameAndType        #134:#6       // stop:()V
  #134 = Utf8               stop
  #135 = Methodref          #11.#136      // ext/mods/commons/gui/CustomToggleSwitch.getHeight:()I
  #136 = NameAndType        #137:#138     // getHeight:()I
  #137 = Utf8               getHeight
  #138 = Utf8               ()I
  #139 = Methodref          #11.#140      // ext/mods/commons/gui/CustomToggleSwitch.getWidth:()I
  #140 = NameAndType        #141:#138     // getWidth:()I
  #141 = Utf8               getWidth
  #142 = Methodref          #11.#143      // ext/mods/commons/gui/CustomToggleSwitch.repaint:()V
  #143 = NameAndType        #144:#6       // repaint:()V
  #144 = Utf8               repaint
  #145 = InvokeDynamic      #0:#146       // #0:actionPerformed:(Lext/mods/commons/gui/CustomToggleSwitch;F)Ljava/awt/event/ActionListener;
  #146 = NameAndType        #147:#148     // actionPerformed:(Lext/mods/commons/gui/CustomToggleSwitch;F)Ljava/awt/event/ActionListener;
  #147 = Utf8               actionPerformed
  #148 = Utf8               (Lext/mods/commons/gui/CustomToggleSwitch;F)Ljava/awt/event/ActionListener;
  #149 = Methodref          #127.#150     // javax/swing/Timer."<init>":(ILjava/awt/event/ActionListener;)V
  #150 = NameAndType        #5:#151       // "<init>":(ILjava/awt/event/ActionListener;)V
  #151 = Utf8               (ILjava/awt/event/ActionListener;)V
  #152 = Methodref          #127.#153     // javax/swing/Timer.start:()V
  #153 = NameAndType        #154:#6       // start:()V
  #154 = Utf8               start
  #155 = Methodref          #11.#156      // ext/mods/commons/gui/CustomToggleSwitch.fireActionEvent:()V
  #156 = NameAndType        #157:#6       // fireActionEvent:()V
  #157 = Utf8               fireActionEvent
  #158 = String             #159          // state
  #159 = Utf8               state
  #160 = Methodref          #11.#161      // ext/mods/commons/gui/CustomToggleSwitch.firePropertyChange:(Ljava/lang/String;ZZ)V
  #161 = NameAndType        #162:#163     // firePropertyChange:(Ljava/lang/String;ZZ)V
  #162 = Utf8               firePropertyChange
  #163 = Utf8               (Ljava/lang/String;ZZ)V
  #164 = InterfaceMethodref #165.#166     // java/util/List.add:(Ljava/lang/Object;)Z
  #165 = Class              #167          // java/util/List
  #166 = NameAndType        #168:#169     // add:(Ljava/lang/Object;)Z
  #167 = Utf8               java/util/List
  #168 = Utf8               add
  #169 = Utf8               (Ljava/lang/Object;)Z
  #170 = InterfaceMethodref #165.#171     // java/util/List.remove:(Ljava/lang/Object;)Z
  #171 = NameAndType        #172:#169     // remove:(Ljava/lang/Object;)Z
  #172 = Utf8               remove
  #173 = Class              #174          // java/awt/event/ActionEvent
  #174 = Utf8               java/awt/event/ActionEvent
  #175 = String             #176          // ON
  #176 = Utf8               ON
  #177 = String             #178          // OFF
  #178 = Utf8               OFF
  #179 = Methodref          #180.#181     // java/lang/System.currentTimeMillis:()J
  #180 = Class              #182          // java/lang/System
  #181 = NameAndType        #183:#184     // currentTimeMillis:()J
  #182 = Utf8               java/lang/System
  #183 = Utf8               currentTimeMillis
  #184 = Utf8               ()J
  #185 = Methodref          #173.#186     // java/awt/event/ActionEvent."<init>":(Ljava/lang/Object;ILjava/lang/String;JI)V
  #186 = NameAndType        #5:#187       // "<init>":(Ljava/lang/Object;ILjava/lang/String;JI)V
  #187 = Utf8               (Ljava/lang/Object;ILjava/lang/String;JI)V
  #188 = InterfaceMethodref #165.#189     // java/util/List.iterator:()Ljava/util/Iterator;
  #189 = NameAndType        #190:#191     // iterator:()Ljava/util/Iterator;
  #190 = Utf8               iterator
  #191 = Utf8               ()Ljava/util/Iterator;
  #192 = InterfaceMethodref #193.#194     // java/util/Iterator.hasNext:()Z
  #193 = Class              #195          // java/util/Iterator
  #194 = NameAndType        #196:#131     // hasNext:()Z
  #195 = Utf8               java/util/Iterator
  #196 = Utf8               hasNext
  #197 = InterfaceMethodref #193.#198     // java/util/Iterator.next:()Ljava/lang/Object;
  #198 = NameAndType        #199:#200     // next:()Ljava/lang/Object;
  #199 = Utf8               next
  #200 = Utf8               ()Ljava/lang/Object;
  #201 = Class              #202          // java/awt/event/ActionListener
  #202 = Utf8               java/awt/event/ActionListener
  #203 = InterfaceMethodref #201.#204     // java/awt/event/ActionListener.actionPerformed:(Ljava/awt/event/ActionEvent;)V
  #204 = NameAndType        #147:#205     // actionPerformed:(Ljava/awt/event/ActionEvent;)V
  #205 = Utf8               (Ljava/awt/event/ActionEvent;)V
  #206 = Methodref          #2.#207       // javax/swing/JComponent.setEnabled:(Z)V
  #207 = NameAndType        #208:#94      // setEnabled:(Z)V
  #208 = Utf8               setEnabled
  #209 = Methodref          #81.#210      // java/awt/Cursor.getDefaultCursor:()Ljava/awt/Cursor;
  #210 = NameAndType        #211:#212     // getDefaultCursor:()Ljava/awt/Cursor;
  #211 = Utf8               getDefaultCursor
  #212 = Utf8               ()Ljava/awt/Cursor;
  #213 = Methodref          #2.#214       // javax/swing/JComponent.paintComponent:(Ljava/awt/Graphics;)V
  #214 = NameAndType        #215:#216     // paintComponent:(Ljava/awt/Graphics;)V
  #215 = Utf8               paintComponent
  #216 = Utf8               (Ljava/awt/Graphics;)V
  #217 = Methodref          #218.#219     // java/awt/Graphics.create:()Ljava/awt/Graphics;
  #218 = Class              #220          // java/awt/Graphics
  #219 = NameAndType        #221:#222     // create:()Ljava/awt/Graphics;
  #220 = Utf8               java/awt/Graphics
  #221 = Utf8               create
  #222 = Utf8               ()Ljava/awt/Graphics;
  #223 = Class              #224          // java/awt/Graphics2D
  #224 = Utf8               java/awt/Graphics2D
  #225 = Fieldref           #226.#227     // java/awt/RenderingHints.KEY_ANTIALIASING:Ljava/awt/RenderingHints$Key;
  #226 = Class              #228          // java/awt/RenderingHints
  #227 = NameAndType        #229:#230     // KEY_ANTIALIASING:Ljava/awt/RenderingHints$Key;
  #228 = Utf8               java/awt/RenderingHints
  #229 = Utf8               KEY_ANTIALIASING
  #230 = Utf8               Ljava/awt/RenderingHints$Key;
  #231 = Fieldref           #226.#232     // java/awt/RenderingHints.VALUE_ANTIALIAS_ON:Ljava/lang/Object;
  #232 = NameAndType        #233:#234     // VALUE_ANTIALIAS_ON:Ljava/lang/Object;
  #233 = Utf8               VALUE_ANTIALIAS_ON
  #234 = Utf8               Ljava/lang/Object;
  #235 = Methodref          #223.#236     // java/awt/Graphics2D.setRenderingHint:(Ljava/awt/RenderingHints$Key;Ljava/lang/Object;)V
  #236 = NameAndType        #237:#238     // setRenderingHint:(Ljava/awt/RenderingHints$Key;Ljava/lang/Object;)V
  #237 = Utf8               setRenderingHint
  #238 = Utf8               (Ljava/awt/RenderingHints$Key;Ljava/lang/Object;)V
  #239 = Methodref          #11.#240      // ext/mods/commons/gui/CustomToggleSwitch.isEnabled:()Z
  #240 = NameAndType        #241:#131     // isEnabled:()Z
  #241 = Utf8               isEnabled
  #242 = Class              #243          // java/awt/AlphaComposite
  #243 = Utf8               java/awt/AlphaComposite
  #244 = Float              0.5f
  #245 = Methodref          #242.#246     // java/awt/AlphaComposite.getInstance:(IF)Ljava/awt/AlphaComposite;
  #246 = NameAndType        #247:#248     // getInstance:(IF)Ljava/awt/AlphaComposite;
  #247 = Utf8               getInstance
  #248 = Utf8               (IF)Ljava/awt/AlphaComposite;
  #249 = Methodref          #223.#250     // java/awt/Graphics2D.setComposite:(Ljava/awt/Composite;)V
  #250 = NameAndType        #251:#252     // setComposite:(Ljava/awt/Composite;)V
  #251 = Utf8               setComposite
  #252 = Utf8               (Ljava/awt/Composite;)V
  #253 = Class              #254          // java/awt/geom/RoundRectangle2D$Double
  #254 = Utf8               java/awt/geom/RoundRectangle2D$Double
  #255 = Double             8.0d
  #257 = Methodref          #253.#258     // java/awt/geom/RoundRectangle2D$Double."<init>":(DDDDDD)V
  #258 = NameAndType        #5:#259       // "<init>":(DDDDDD)V
  #259 = Utf8               (DDDDDD)V
  #260 = Methodref          #223.#261     // java/awt/Graphics2D.setColor:(Ljava/awt/Color;)V
  #261 = NameAndType        #262:#263     // setColor:(Ljava/awt/Color;)V
  #262 = Utf8               setColor
  #263 = Utf8               (Ljava/awt/Color;)V
  #264 = Methodref          #223.#265     // java/awt/Graphics2D.fill:(Ljava/awt/Shape;)V
  #265 = NameAndType        #266:#267     // fill:(Ljava/awt/Shape;)V
  #266 = Utf8               fill
  #267 = Utf8               (Ljava/awt/Shape;)V
  #268 = Class              #269          // java/awt/BasicStroke
  #269 = Utf8               java/awt/BasicStroke
  #270 = Methodref          #268.#271     // java/awt/BasicStroke."<init>":(F)V
  #271 = NameAndType        #5:#272       // "<init>":(F)V
  #272 = Utf8               (F)V
  #273 = Methodref          #223.#274     // java/awt/Graphics2D.setStroke:(Ljava/awt/Stroke;)V
  #274 = NameAndType        #275:#276     // setStroke:(Ljava/awt/Stroke;)V
  #275 = Utf8               setStroke
  #276 = Utf8               (Ljava/awt/Stroke;)V
  #277 = Methodref          #223.#278     // java/awt/Graphics2D.draw:(Ljava/awt/Shape;)V
  #278 = NameAndType        #279:#267     // draw:(Ljava/awt/Shape;)V
  #279 = Utf8               draw
  #280 = Methodref          #281.#282     // java/lang/Math.min:(FF)F
  #281 = Class              #283          // java/lang/Math
  #282 = NameAndType        #284:#285     // min:(FF)F
  #283 = Utf8               java/lang/Math
  #284 = Utf8               min
  #285 = Utf8               (FF)F
  #286 = Methodref          #281.#287     // java/lang/Math.max:(FF)F
  #287 = NameAndType        #288:#285     // max:(FF)F
  #288 = Utf8               max
  #289 = Double             2.0d
  #291 = Double             6.0d
  #293 = Methodref          #223.#294     // java/awt/Graphics2D.dispose:()V
  #294 = NameAndType        #295:#6       // dispose:()V
  #295 = Utf8               dispose
  #296 = Methodref          #281.#297     // java/lang/Math.abs:(F)F
  #297 = NameAndType        #298:#299     // abs:(F)F
  #298 = Utf8               abs
  #299 = Utf8               (F)F
  #300 = Methodref          #173.#301     // java/awt/event/ActionEvent.getSource:()Ljava/lang/Object;
  #301 = NameAndType        #302:#200     // getSource:()Ljava/lang/Object;
  #302 = Utf8               getSource
  #303 = Float              0.3f
  #304 = Utf8               Signature
  #305 = Utf8               Ljava/util/List<Ljava/awt/event/ActionListener;>;
  #306 = Utf8               ConstantValue
  #307 = Integer            8
  #308 = Integer            6
  #309 = Integer            2
  #310 = Utf8               Code
  #311 = Utf8               LineNumberTable
  #312 = Utf8               LocalVariableTable
  #313 = Utf8               this
  #314 = Utf8               Lext/mods/commons/gui/CustomToggleSwitch;
  #315 = Utf8               initialState
  #316 = Utf8               knobSize
  #317 = Utf8               StackMapTable
  #318 = Utf8               toggleState
  #319 = Utf8               on
  #320 = Utf8               fireEvent
  #321 = Utf8               oldState
  #322 = Utf8               targetPosition
  #323 = Utf8               addActionListener
  #324 = Utf8               (Ljava/awt/event/ActionListener;)V
  #325 = Utf8               listener
  #326 = Utf8               Ljava/awt/event/ActionListener;
  #327 = Utf8               removeActionListener
  #328 = Utf8               event
  #329 = Utf8               Ljava/awt/event/ActionEvent;
  #330 = Class              #331          // java/lang/String
  #331 = Utf8               java/lang/String
  #332 = Utf8               enabled
  #333 = Utf8               g
  #334 = Utf8               Ljava/awt/Graphics;
  #335 = Utf8               g2d
  #336 = Utf8               Ljava/awt/Graphics2D;
  #337 = Utf8               track
  #338 = Utf8               Ljava/awt/geom/RoundRectangle2D;
  #339 = Utf8               currentKnobX
  #340 = Utf8               knob
  #341 = Class              #342          // java/awt/geom/RoundRectangle2D
  #342 = Utf8               java/awt/geom/RoundRectangle2D
  #343 = Utf8               lambda$setOn$0
  #344 = Utf8               (FLjava/awt/event/ActionEvent;)V
  #345 = Utf8               e
  #346 = Utf8               diff
  #347 = Utf8               SourceFile
  #348 = Utf8               CustomToggleSwitch.java
  #349 = Utf8               NestMembers
  #350 = Utf8               BootstrapMethods
  #351 = MethodType         #205          //  (Ljava/awt/event/ActionEvent;)V
  #352 = MethodHandle       5:#353        // REF_invokeVirtual ext/mods/commons/gui/CustomToggleSwitch.lambda$setOn$0:(FLjava/awt/event/ActionEvent;)V
  #353 = Methodref          #11.#354      // ext/mods/commons/gui/CustomToggleSwitch.lambda$setOn$0:(FLjava/awt/event/ActionEvent;)V
  #354 = NameAndType        #343:#344     // lambda$setOn$0:(FLjava/awt/event/ActionEvent;)V
  #355 = MethodHandle       6:#356        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #356 = Methodref          #357.#358     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #357 = Class              #359          // java/lang/invoke/LambdaMetafactory
  #358 = NameAndType        #360:#361     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #359 = Utf8               java/lang/invoke/LambdaMetafactory
  #360 = Utf8               metafactory
  #361 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #362 = Utf8               InnerClasses
  #363 = Class              #364          // java/awt/RenderingHints$Key
  #364 = Utf8               java/awt/RenderingHints$Key
  #365 = Utf8               Key
  #366 = Utf8               Double
  #367 = Class              #368          // java/lang/invoke/MethodHandles$Lookup
  #368 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #369 = Class              #370          // java/lang/invoke/MethodHandles
  #370 = Utf8               java/lang/invoke/MethodHandles
  #371 = Utf8               Lookup
{
  public ext.mods.commons.gui.CustomToggleSwitch(boolean);
    descriptor: (Z)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=3, args_size=2
         0: aload_0
         1: invokespecial #1                  // Method javax/swing/JComponent."<init>":()V
         4: aload_0
         5: new           #7                  // class java/util/ArrayList
         8: dup
         9: invokespecial #9                  // Method java/util/ArrayList."<init>":()V
        12: putfield      #10                 // Field listeners:Ljava/util/List;
        15: aload_0
        16: getstatic     #16                 // Field ext/mods/commons/gui/ThemeManager.BORDER_COLOR:Ljava/awt/Color;
        19: invokevirtual #22                 // Method java/awt/Color.darker:()Ljava/awt/Color;
        22: putfield      #28                 // Field trackColorOff:Ljava/awt/Color;
        25: aload_0
        26: getstatic     #31                 // Field ext/mods/commons/gui/ThemeManager.BASE_PURPLE:Ljava/awt/Color;
        29: putfield      #34                 // Field trackColorOn:Ljava/awt/Color;
        32: aload_0
        33: getstatic     #16                 // Field ext/mods/commons/gui/ThemeManager.BORDER_COLOR:Ljava/awt/Color;
        36: putfield      #37                 // Field trackBorderColorOff:Ljava/awt/Color;
        39: aload_0
        40: getstatic     #31                 // Field ext/mods/commons/gui/ThemeManager.BASE_PURPLE:Ljava/awt/Color;
        43: invokevirtual #40                 // Method java/awt/Color.brighter:()Ljava/awt/Color;
        46: putfield      #43                 // Field trackBorderColorOn:Ljava/awt/Color;
        49: aload_0
        50: new           #23                 // class java/awt/Color
        53: dup
        54: sipush        220
        57: sipush        220
        60: sipush        220
        63: invokespecial #46                 // Method java/awt/Color."<init>":(III)V
        66: putfield      #49                 // Field knobColor:Ljava/awt/Color;
        69: aload_0
        70: new           #52                 // class java/awt/Dimension
        73: dup
        74: bipush        32
        76: bipush        18
        78: invokespecial #54                 // Method java/awt/Dimension."<init>":(II)V
        81: putfield      #57                 // Field preferredSize:Ljava/awt/Dimension;
        84: aload_0
        85: bipush        8
        87: putfield      #61                 // Field trackArc:I
        90: aload_0
        91: bipush        6
        93: putfield      #65                 // Field knobArc:I
        96: aload_0
        97: iconst_2
        98: putfield      #68                 // Field padding:I
       101: aload_0
       102: aload_0
       103: getfield      #57                 // Field preferredSize:Ljava/awt/Dimension;
       106: invokevirtual #71                 // Method setPreferredSize:(Ljava/awt/Dimension;)V
       109: aload_0
       110: aload_0
       111: getfield      #57                 // Field preferredSize:Ljava/awt/Dimension;
       114: invokevirtual #75                 // Method setMinimumSize:(Ljava/awt/Dimension;)V
       117: aload_0
       118: aload_0
       119: getfield      #57                 // Field preferredSize:Ljava/awt/Dimension;
       122: invokevirtual #78                 // Method setMaximumSize:(Ljava/awt/Dimension;)V
       125: aload_0
       126: bipush        12
       128: invokestatic  #83                 // Method java/awt/Cursor.getPredefinedCursor:(I)Ljava/awt/Cursor;
       131: invokevirtual #87                 // Method setCursor:(Ljava/awt/Cursor;)V
       134: aload_0
       135: iconst_0
       136: invokevirtual #91                 // Method setOpaque:(Z)V
       139: aload_0
       140: iload_1
       141: putfield      #95                 // Field isOn:Z
       144: aload_0
       145: getfield      #57                 // Field preferredSize:Ljava/awt/Dimension;
       148: getfield      #99                 // Field java/awt/Dimension.height:I
       151: iconst_4
       152: isub
       153: istore_2
       154: aload_0
       155: iload_1
       156: ifeq          174
       159: aload_0
       160: getfield      #57                 // Field preferredSize:Ljava/awt/Dimension;
       163: getfield      #102                // Field java/awt/Dimension.width:I
       166: iload_2
       167: isub
       168: iconst_2
       169: isub
       170: i2f
       171: goto          175
       174: fconst_2
       175: putfield      #105                // Field knobPosition:F
       178: aload_0
       179: new           #109                // class ext/mods/commons/gui/CustomToggleSwitch$1
       182: dup
       183: aload_0
       184: invokespecial #111                // Method ext/mods/commons/gui/CustomToggleSwitch$1."<init>":(Lext/mods/commons/gui/CustomToggleSwitch;)V
       187: invokevirtual #114                // Method addMouseListener:(Ljava/awt/event/MouseListener;)V
       190: return
      LineNumberTable:
        line 52: 0
        line 39: 4
        line 41: 15
        line 42: 25
        line 43: 32
        line 44: 39
        line 45: 49
        line 47: 69
        line 48: 84
        line 49: 90
        line 50: 96
        line 53: 101
        line 54: 109
        line 55: 117
        line 56: 125
        line 57: 134
        line 58: 139
        line 59: 144
        line 60: 154
        line 62: 178
        line 70: 190
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     191     0  this   Lext/mods/commons/gui/CustomToggleSwitch;
            0     191     1 initialState   Z
          154      37     2 knobSize   I
      StackMapTable: number_of_entries = 2
        frame_type = 255 /* full_frame */
          offset_delta = 174
          locals = [ class ext/mods/commons/gui/CustomToggleSwitch, int, int ]
          stack = [ class ext/mods/commons/gui/CustomToggleSwitch ]
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/commons/gui/CustomToggleSwitch, int, int ]
          stack = [ class ext/mods/commons/gui/CustomToggleSwitch, float ]

  public void toggleState();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=1, args_size=1
         0: aload_0
         1: aload_0
         2: getfield      #95                 // Field isOn:Z
         5: ifne          12
         8: iconst_1
         9: goto          13
        12: iconst_0
        13: iconst_1
        14: invokevirtual #118                // Method setOn:(ZZ)V
        17: return
      LineNumberTable:
        line 73: 0
        line 74: 17
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      18     0  this   Lext/mods/commons/gui/CustomToggleSwitch;
      StackMapTable: number_of_entries = 2
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class ext/mods/commons/gui/CustomToggleSwitch ]
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/commons/gui/CustomToggleSwitch ]
          stack = [ class ext/mods/commons/gui/CustomToggleSwitch, int ]

  public boolean isOn();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #95                 // Field isOn:Z
         4: ireturn
      LineNumberTable:
        line 77: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/commons/gui/CustomToggleSwitch;

  public void setOn(boolean);
    descriptor: (Z)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: iconst_0
         3: invokevirtual #118                // Method setOn:(ZZ)V
         6: return
      LineNumberTable:
        line 81: 0
        line 82: 6
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/commons/gui/CustomToggleSwitch;
            0       7     1    on   Z

  public void setOn(boolean, boolean);
    descriptor: (ZZ)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=6, args_size=3
         0: aload_0
         1: getfield      #95                 // Field isOn:Z
         4: iload_1
         5: if_icmpne     9
         8: return
         9: aload_0
        10: getfield      #95                 // Field isOn:Z
        13: istore_3
        14: aload_0
        15: iload_1
        16: putfield      #95                 // Field isOn:Z
        19: aload_0
        20: getfield      #122                // Field animator:Ljavax/swing/Timer;
        23: ifnull        43
        26: aload_0
        27: getfield      #122                // Field animator:Ljavax/swing/Timer;
        30: invokevirtual #126                // Method javax/swing/Timer.isRunning:()Z
        33: ifeq          43
        36: aload_0
        37: getfield      #122                // Field animator:Ljavax/swing/Timer;
        40: invokevirtual #132                // Method javax/swing/Timer.stop:()V
        43: aload_0
        44: invokevirtual #135                // Method getHeight:()I
        47: iconst_4
        48: isub
        49: istore        4
        51: iload         4
        53: ifgt          67
        56: aload_0
        57: getfield      #57                 // Field preferredSize:Ljava/awt/Dimension;
        60: getfield      #99                 // Field java/awt/Dimension.height:I
        63: iconst_4
        64: isub
        65: istore        4
        67: aload_0
        68: getfield      #95                 // Field isOn:Z
        71: ifeq          87
        74: aload_0
        75: invokevirtual #139                // Method getWidth:()I
        78: iload         4
        80: isub
        81: iconst_2
        82: isub
        83: i2f
        84: goto          88
        87: fconst_2
        88: fstore        5
        90: aload_0
        91: invokevirtual #139                // Method getWidth:()I
        94: ifgt          132
        97: aload_0
        98: aload_0
        99: getfield      #95                 // Field isOn:Z
       102: ifeq          121
       105: aload_0
       106: getfield      #57                 // Field preferredSize:Ljava/awt/Dimension;
       109: getfield      #102                // Field java/awt/Dimension.width:I
       112: iload         4
       114: isub
       115: iconst_2
       116: isub
       117: i2f
       118: goto          122
       121: fconst_2
       122: putfield      #105                // Field knobPosition:F
       125: aload_0
       126: invokevirtual #142                // Method repaint:()V
       129: goto          160
       132: aload_0
       133: new           #127                // class javax/swing/Timer
       136: dup
       137: bipush        8
       139: aload_0
       140: fload         5
       142: invokedynamic #145,  0            // InvokeDynamic #0:actionPerformed:(Lext/mods/commons/gui/CustomToggleSwitch;F)Ljava/awt/event/ActionListener;
       147: invokespecial #149                // Method javax/swing/Timer."<init>":(ILjava/awt/event/ActionListener;)V
       150: putfield      #122                // Field animator:Ljavax/swing/Timer;
       153: aload_0
       154: getfield      #122                // Field animator:Ljavax/swing/Timer;
       157: invokevirtual #152                // Method javax/swing/Timer.start:()V
       160: iload_2
       161: ifeq          168
       164: aload_0
       165: invokevirtual #155                // Method fireActionEvent:()V
       168: aload_0
       169: ldc           #158                // String state
       171: iload_3
       172: aload_0
       173: getfield      #95                 // Field isOn:Z
       176: invokevirtual #160                // Method firePropertyChange:(Ljava/lang/String;ZZ)V
       179: return
      LineNumberTable:
        line 85: 0
        line 86: 9
        line 87: 14
        line 89: 19
        line 90: 36
        line 93: 43
        line 94: 51
        line 96: 67
        line 97: 90
        line 98: 97
        line 99: 125
        line 101: 132
        line 111: 153
        line 115: 160
        line 116: 164
        line 118: 168
        line 119: 179
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     180     0  this   Lext/mods/commons/gui/CustomToggleSwitch;
            0     180     1    on   Z
            0     180     2 fireEvent   Z
           14     166     3 oldState   Z
           51     129     4 knobSize   I
           90      90     5 targetPosition   F
      StackMapTable: number_of_entries = 10
        frame_type = 9 /* same */
        frame_type = 252 /* append */
          offset_delta = 33
          locals = [ int ]
        frame_type = 252 /* append */
          offset_delta = 23
          locals = [ int ]
        frame_type = 19 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ float ]
        frame_type = 255 /* full_frame */
          offset_delta = 32
          locals = [ class ext/mods/commons/gui/CustomToggleSwitch, int, int, int, int, float ]
          stack = [ class ext/mods/commons/gui/CustomToggleSwitch ]
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/commons/gui/CustomToggleSwitch, int, int, int, int, float ]
          stack = [ class ext/mods/commons/gui/CustomToggleSwitch, float ]
        frame_type = 9 /* same */
        frame_type = 27 /* same */
        frame_type = 7 /* same */

  public void addActionListener(java.awt.event.ActionListener);
    descriptor: (Ljava/awt/event/ActionListener;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_1
         1: ifnull        15
         4: aload_0
         5: getfield      #10                 // Field listeners:Ljava/util/List;
         8: aload_1
         9: invokeinterface #164,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        14: pop
        15: return
      LineNumberTable:
        line 122: 0
        line 123: 4
        line 125: 15
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      16     0  this   Lext/mods/commons/gui/CustomToggleSwitch;
            0      16     1 listener   Ljava/awt/event/ActionListener;
      StackMapTable: number_of_entries = 1
        frame_type = 15 /* same */

  public void removeActionListener(java.awt.event.ActionListener);
    descriptor: (Ljava/awt/event/ActionListener;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_1
         1: ifnull        15
         4: aload_0
         5: getfield      #10                 // Field listeners:Ljava/util/List;
         8: aload_1
         9: invokeinterface #170,  2          // InterfaceMethod java/util/List.remove:(Ljava/lang/Object;)Z
        14: pop
        15: return
      LineNumberTable:
        line 128: 0
        line 129: 4
        line 131: 15
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      16     0  this   Lext/mods/commons/gui/CustomToggleSwitch;
            0      16     1 listener   Ljava/awt/event/ActionListener;
      StackMapTable: number_of_entries = 1
        frame_type = 15 /* same */

  public void setEnabled(boolean);
    descriptor: (Z)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: invokespecial #206                // Method javax/swing/JComponent.setEnabled:(Z)V
         5: aload_0
         6: iload_1
         7: ifeq          18
        10: bipush        12
        12: invokestatic  #83                 // Method java/awt/Cursor.getPredefinedCursor:(I)Ljava/awt/Cursor;
        15: goto          21
        18: invokestatic  #209                // Method java/awt/Cursor.getDefaultCursor:()Ljava/awt/Cursor;
        21: invokevirtual #87                 // Method setCursor:(Ljava/awt/Cursor;)V
        24: aload_0
        25: invokevirtual #142                // Method repaint:()V
        28: return
      LineNumberTable:
        line 142: 0
        line 143: 5
        line 144: 24
        line 145: 28
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      29     0  this   Lext/mods/commons/gui/CustomToggleSwitch;
            0      29     1 enabled   Z
      StackMapTable: number_of_entries = 2
        frame_type = 82 /* same_locals_1_stack_item */
          stack = [ class ext/mods/commons/gui/CustomToggleSwitch ]
        frame_type = 255 /* full_frame */
          offset_delta = 2
          locals = [ class ext/mods/commons/gui/CustomToggleSwitch, int ]
          stack = [ class ext/mods/commons/gui/CustomToggleSwitch, class java/awt/Cursor ]

  protected void paintComponent(java.awt.Graphics);
    descriptor: (Ljava/awt/Graphics;)V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=14, locals=9, args_size=2
         0: aload_0
         1: aload_1
         2: invokespecial #213                // Method javax/swing/JComponent.paintComponent:(Ljava/awt/Graphics;)V
         5: aload_1
         6: invokevirtual #217                // Method java/awt/Graphics.create:()Ljava/awt/Graphics;
         9: checkcast     #223                // class java/awt/Graphics2D
        12: astore_2
        13: aload_2
        14: getstatic     #225                // Field java/awt/RenderingHints.KEY_ANTIALIASING:Ljava/awt/RenderingHints$Key;
        17: getstatic     #231                // Field java/awt/RenderingHints.VALUE_ANTIALIAS_ON:Ljava/lang/Object;
        20: invokevirtual #235                // Method java/awt/Graphics2D.setRenderingHint:(Ljava/awt/RenderingHints$Key;Ljava/lang/Object;)V
        23: aload_0
        24: invokevirtual #139                // Method getWidth:()I
        27: istore_3
        28: aload_0
        29: invokevirtual #135                // Method getHeight:()I
        32: istore        4
        34: iload         4
        36: aload_0
        37: getfield      #57                 // Field preferredSize:Ljava/awt/Dimension;
        40: getfield      #99                 // Field java/awt/Dimension.height:I
        43: if_icmpge     55
        46: aload_0
        47: getfield      #57                 // Field preferredSize:Ljava/awt/Dimension;
        50: getfield      #99                 // Field java/awt/Dimension.height:I
        53: istore        4
        55: iload         4
        57: iconst_4
        58: isub
        59: istore        5
        61: aload_0
        62: invokevirtual #239                // Method isEnabled:()Z
        65: ifne          78
        68: aload_2
        69: iconst_3
        70: ldc           #244                // float 0.5f
        72: invokestatic  #245                // Method java/awt/AlphaComposite.getInstance:(IF)Ljava/awt/AlphaComposite;
        75: invokevirtual #249                // Method java/awt/Graphics2D.setComposite:(Ljava/awt/Composite;)V
        78: new           #253                // class java/awt/geom/RoundRectangle2D$Double
        81: dup
        82: dconst_0
        83: dconst_0
        84: iload_3
        85: i2d
        86: iload         4
        88: i2d
        89: ldc2_w        #255                // double 8.0d
        92: ldc2_w        #255                // double 8.0d
        95: invokespecial #257                // Method java/awt/geom/RoundRectangle2D$Double."<init>":(DDDDDD)V
        98: astore        6
       100: aload_2
       101: aload_0
       102: getfield      #95                 // Field isOn:Z
       105: ifeq          115
       108: aload_0
       109: getfield      #34                 // Field trackColorOn:Ljava/awt/Color;
       112: goto          119
       115: aload_0
       116: getfield      #28                 // Field trackColorOff:Ljava/awt/Color;
       119: invokevirtual #260                // Method java/awt/Graphics2D.setColor:(Ljava/awt/Color;)V
       122: aload_2
       123: aload         6
       125: invokevirtual #264                // Method java/awt/Graphics2D.fill:(Ljava/awt/Shape;)V
       128: aload_2
       129: new           #268                // class java/awt/BasicStroke
       132: dup
       133: fconst_1
       134: invokespecial #270                // Method java/awt/BasicStroke."<init>":(F)V
       137: invokevirtual #273                // Method java/awt/Graphics2D.setStroke:(Ljava/awt/Stroke;)V
       140: aload_2
       141: aload_0
       142: getfield      #95                 // Field isOn:Z
       145: ifeq          155
       148: aload_0
       149: getfield      #43                 // Field trackBorderColorOn:Ljava/awt/Color;
       152: goto          159
       155: aload_0
       156: getfield      #37                 // Field trackBorderColorOff:Ljava/awt/Color;
       159: invokevirtual #260                // Method java/awt/Graphics2D.setColor:(Ljava/awt/Color;)V
       162: aload_2
       163: aload         6
       165: invokevirtual #277                // Method java/awt/Graphics2D.draw:(Ljava/awt/Shape;)V
       168: fconst_2
       169: aload_0
       170: getfield      #105                // Field knobPosition:F
       173: iload_3
       174: iload         5
       176: isub
       177: iconst_2
       178: isub
       179: i2f
       180: invokestatic  #280                // Method java/lang/Math.min:(FF)F
       183: invokestatic  #286                // Method java/lang/Math.max:(FF)F
       186: fstore        7
       188: new           #253                // class java/awt/geom/RoundRectangle2D$Double
       191: dup
       192: fload         7
       194: f2d
       195: ldc2_w        #289                // double 2.0d
       198: iload         5
       200: i2d
       201: iload         5
       203: i2d
       204: ldc2_w        #291                // double 6.0d
       207: ldc2_w        #291                // double 6.0d
       210: invokespecial #257                // Method java/awt/geom/RoundRectangle2D$Double."<init>":(DDDDDD)V
       213: astore        8
       215: aload_2
       216: aload_0
       217: getfield      #49                 // Field knobColor:Ljava/awt/Color;
       220: invokevirtual #260                // Method java/awt/Graphics2D.setColor:(Ljava/awt/Color;)V
       223: aload_2
       224: aload         8
       226: invokevirtual #264                // Method java/awt/Graphics2D.fill:(Ljava/awt/Shape;)V
       229: aload_2
       230: invokevirtual #293                // Method java/awt/Graphics2D.dispose:()V
       233: return
      LineNumberTable:
        line 150: 0
        line 151: 5
        line 152: 13
        line 154: 23
        line 155: 28
        line 156: 34
        line 157: 55
        line 159: 61
        line 160: 68
        line 163: 78
        line 164: 100
        line 165: 122
        line 167: 128
        line 168: 140
        line 169: 162
        line 171: 168
        line 173: 188
        line 174: 215
        line 175: 223
        line 177: 229
        line 178: 233
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     234     0  this   Lext/mods/commons/gui/CustomToggleSwitch;
            0     234     1     g   Ljava/awt/Graphics;
           13     221     2   g2d   Ljava/awt/Graphics2D;
           28     206     3 width   I
           34     200     4 height   I
           61     173     5 knobSize   I
          100     134     6 track   Ljava/awt/geom/RoundRectangle2D;
          188      46     7 currentKnobX   F
          215      19     8  knob   Ljava/awt/geom/RoundRectangle2D;
      StackMapTable: number_of_entries = 6
        frame_type = 254 /* append */
          offset_delta = 55
          locals = [ class java/awt/Graphics2D, int, int ]
        frame_type = 252 /* append */
          offset_delta = 22
          locals = [ int ]
        frame_type = 255 /* full_frame */
          offset_delta = 36
          locals = [ class ext/mods/commons/gui/CustomToggleSwitch, class java/awt/Graphics, class java/awt/Graphics2D, int, int, int, class java/awt/geom/RoundRectangle2D ]
          stack = [ class java/awt/Graphics2D ]
        frame_type = 255 /* full_frame */
          offset_delta = 3
          locals = [ class ext/mods/commons/gui/CustomToggleSwitch, class java/awt/Graphics, class java/awt/Graphics2D, int, int, int, class java/awt/geom/RoundRectangle2D ]
          stack = [ class java/awt/Graphics2D, class java/awt/Color ]
        frame_type = 99 /* same_locals_1_stack_item */
          stack = [ class java/awt/Graphics2D ]
        frame_type = 255 /* full_frame */
          offset_delta = 3
          locals = [ class ext/mods/commons/gui/CustomToggleSwitch, class java/awt/Graphics, class java/awt/Graphics2D, int, int, int, class java/awt/geom/RoundRectangle2D ]
          stack = [ class java/awt/Graphics2D, class java/awt/Color ]
}
SourceFile: "CustomToggleSwitch.java"
NestMembers:
  ext/mods/commons/gui/CustomToggleSwitch$1
BootstrapMethods:
  0: #355 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #351 (Ljava/awt/event/ActionEvent;)V
      #352 REF_invokeVirtual ext/mods/commons/gui/CustomToggleSwitch.lambda$setOn$0:(FLjava/awt/event/ActionEvent;)V
      #351 (Ljava/awt/event/ActionEvent;)V
InnerClasses:
  #109;                                   // class ext/mods/commons/gui/CustomToggleSwitch$1
  public static abstract #365= #363 of #226; // Key=class java/awt/RenderingHints$Key of class java/awt/RenderingHints
  public static #366= #253 of #341;       // Double=class java/awt/geom/RoundRectangle2D$Double of class java/awt/geom/RoundRectangle2D
  public static final #371= #367 of #369; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
