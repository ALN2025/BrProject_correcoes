// Bytecode for: ext.mods.commons.gui.RadarPanel
// File: ext\mods\commons\gui\RadarPanel.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/commons/gui/RadarPanel.class
  Last modified 9 de jul de 2026; size 4518 bytes
  MD5 checksum ff130a175d37e72199b5896a34f8793f
  Compiled from "RadarPanel.java"
public class ext.mods.commons.gui.RadarPanel extends ext.mods.commons.gui.ModernUI$SectionPanel
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #15                         // ext/mods/commons/gui/RadarPanel
  super_class: #4                         // ext/mods/commons/gui/ModernUI$SectionPanel
  interfaces: 0, fields: 2, methods: 3, attributes: 3
Constant pool:
    #1 = String             #2            // Real-time Radar
    #2 = Utf8               Real-time Radar
    #3 = Methodref          #4.#5         // ext/mods/commons/gui/ModernUI$SectionPanel."<init>":(Ljava/lang/String;)V
    #4 = Class              #6            // ext/mods/commons/gui/ModernUI$SectionPanel
    #5 = NameAndType        #7:#8         // "<init>":(Ljava/lang/String;)V
    #6 = Utf8               ext/mods/commons/gui/ModernUI$SectionPanel
    #7 = Utf8               <init>
    #8 = Utf8               (Ljava/lang/String;)V
    #9 = Class              #10           // java/awt/Dimension
   #10 = Utf8               java/awt/Dimension
   #11 = Methodref          #9.#12        // java/awt/Dimension."<init>":(II)V
   #12 = NameAndType        #7:#13        // "<init>":(II)V
   #13 = Utf8               (II)V
   #14 = Methodref          #15.#16       // ext/mods/commons/gui/RadarPanel.setPreferredSize:(Ljava/awt/Dimension;)V
   #15 = Class              #17           // ext/mods/commons/gui/RadarPanel
   #16 = NameAndType        #18:#19       // setPreferredSize:(Ljava/awt/Dimension;)V
   #17 = Utf8               ext/mods/commons/gui/RadarPanel
   #18 = Utf8               setPreferredSize
   #19 = Utf8               (Ljava/awt/Dimension;)V
   #20 = Fieldref           #21.#22       // ext/mods/commons/gui/ModernUI.BG_CONSOLE:Ljava/awt/Color;
   #21 = Class              #23           // ext/mods/commons/gui/ModernUI
   #22 = NameAndType        #24:#25       // BG_CONSOLE:Ljava/awt/Color;
   #23 = Utf8               ext/mods/commons/gui/ModernUI
   #24 = Utf8               BG_CONSOLE
   #25 = Utf8               Ljava/awt/Color;
   #26 = Methodref          #15.#27       // ext/mods/commons/gui/RadarPanel.setBackground:(Ljava/awt/Color;)V
   #27 = NameAndType        #28:#29       // setBackground:(Ljava/awt/Color;)V
   #28 = Utf8               setBackground
   #29 = Utf8               (Ljava/awt/Color;)V
   #30 = Class              #31           // java/util/Timer
   #31 = Utf8               java/util/Timer
   #32 = String             #33           // Radar-Updater
   #33 = Utf8               Radar-Updater
   #34 = Methodref          #30.#35       // java/util/Timer."<init>":(Ljava/lang/String;Z)V
   #35 = NameAndType        #7:#36        // "<init>":(Ljava/lang/String;Z)V
   #36 = Utf8               (Ljava/lang/String;Z)V
   #37 = Class              #38           // ext/mods/commons/gui/RadarPanel$1
   #38 = Utf8               ext/mods/commons/gui/RadarPanel$1
   #39 = Methodref          #37.#40       // ext/mods/commons/gui/RadarPanel$1."<init>":(Lext/mods/commons/gui/RadarPanel;)V
   #40 = NameAndType        #7:#41        // "<init>":(Lext/mods/commons/gui/RadarPanel;)V
   #41 = Utf8               (Lext/mods/commons/gui/RadarPanel;)V
   #42 = Long               200l
   #44 = Methodref          #30.#45       // java/util/Timer.scheduleAtFixedRate:(Ljava/util/TimerTask;JJ)V
   #45 = NameAndType        #46:#47       // scheduleAtFixedRate:(Ljava/util/TimerTask;JJ)V
   #46 = Utf8               scheduleAtFixedRate
   #47 = Utf8               (Ljava/util/TimerTask;JJ)V
   #48 = Methodref          #4.#49        // ext/mods/commons/gui/ModernUI$SectionPanel.paintComponent:(Ljava/awt/Graphics;)V
   #49 = NameAndType        #50:#51       // paintComponent:(Ljava/awt/Graphics;)V
   #50 = Utf8               paintComponent
   #51 = Utf8               (Ljava/awt/Graphics;)V
   #52 = Class              #53           // java/awt/Graphics2D
   #53 = Utf8               java/awt/Graphics2D
   #54 = Fieldref           #55.#56       // java/awt/RenderingHints.KEY_ANTIALIASING:Ljava/awt/RenderingHints$Key;
   #55 = Class              #57           // java/awt/RenderingHints
   #56 = NameAndType        #58:#59       // KEY_ANTIALIASING:Ljava/awt/RenderingHints$Key;
   #57 = Utf8               java/awt/RenderingHints
   #58 = Utf8               KEY_ANTIALIASING
   #59 = Utf8               Ljava/awt/RenderingHints$Key;
   #60 = Fieldref           #55.#61       // java/awt/RenderingHints.VALUE_ANTIALIAS_ON:Ljava/lang/Object;
   #61 = NameAndType        #62:#63       // VALUE_ANTIALIAS_ON:Ljava/lang/Object;
   #62 = Utf8               VALUE_ANTIALIAS_ON
   #63 = Utf8               Ljava/lang/Object;
   #64 = Methodref          #52.#65       // java/awt/Graphics2D.setRenderingHint:(Ljava/awt/RenderingHints$Key;Ljava/lang/Object;)V
   #65 = NameAndType        #66:#67       // setRenderingHint:(Ljava/awt/RenderingHints$Key;Ljava/lang/Object;)V
   #66 = Utf8               setRenderingHint
   #67 = Utf8               (Ljava/awt/RenderingHints$Key;Ljava/lang/Object;)V
   #68 = Methodref          #15.#69       // ext/mods/commons/gui/RadarPanel.getWidth:()I
   #69 = NameAndType        #70:#71       // getWidth:()I
   #70 = Utf8               getWidth
   #71 = Utf8               ()I
   #72 = Methodref          #15.#73       // ext/mods/commons/gui/RadarPanel.getHeight:()I
   #73 = NameAndType        #74:#71       // getHeight:()I
   #74 = Utf8               getHeight
   #75 = Methodref          #15.#76       // ext/mods/commons/gui/RadarPanel.findActiveGM:()Lext/mods/gameserver/model/actor/Player;
   #76 = NameAndType        #77:#78       // findActiveGM:()Lext/mods/gameserver/model/actor/Player;
   #77 = Utf8               findActiveGM
   #78 = Utf8               ()Lext/mods/gameserver/model/actor/Player;
   #79 = Fieldref           #21.#80       // ext/mods/commons/gui/ModernUI.TEXT_GRAY:Ljava/awt/Color;
   #80 = NameAndType        #81:#25       // TEXT_GRAY:Ljava/awt/Color;
   #81 = Utf8               TEXT_GRAY
   #82 = Methodref          #52.#83       // java/awt/Graphics2D.setColor:(Ljava/awt/Color;)V
   #83 = NameAndType        #84:#29       // setColor:(Ljava/awt/Color;)V
   #84 = Utf8               setColor
   #85 = String             #86           // No GM Online
   #86 = Utf8               No GM Online
   #87 = Methodref          #52.#88       // java/awt/Graphics2D.drawString:(Ljava/lang/String;II)V
   #88 = NameAndType        #89:#90       // drawString:(Ljava/lang/String;II)V
   #89 = Utf8               drawString
   #90 = Utf8               (Ljava/lang/String;II)V
   #91 = Class              #92           // java/awt/Color
   #92 = Utf8               java/awt/Color
   #93 = Methodref          #91.#94       // java/awt/Color."<init>":(III)V
   #94 = NameAndType        #7:#95        // "<init>":(III)V
   #95 = Utf8               (III)V
   #96 = Methodref          #97.#98       // ext/mods/gameserver/model/actor/Player.getX:()I
   #97 = Class              #99           // ext/mods/gameserver/model/actor/Player
   #98 = NameAndType        #100:#71      // getX:()I
   #99 = Utf8               ext/mods/gameserver/model/actor/Player
  #100 = Utf8               getX
  #101 = Methodref          #97.#102      // ext/mods/gameserver/model/actor/Player.getY:()I
  #102 = NameAndType        #103:#71      // getY:()I
  #103 = Utf8               getY
  #104 = Methodref          #105.#106     // ext/mods/gameserver/geoengine/GeoEngine.getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
  #105 = Class              #107          // ext/mods/gameserver/geoengine/GeoEngine
  #106 = NameAndType        #108:#109     // getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
  #107 = Utf8               ext/mods/gameserver/geoengine/GeoEngine
  #108 = Utf8               getInstance
  #109 = Utf8               ()Lext/mods/gameserver/geoengine/GeoEngine;
  #110 = Methodref          #97.#111      // ext/mods/gameserver/model/actor/Player.getZ:()I
  #111 = NameAndType        #112:#71      // getZ:()I
  #112 = Utf8               getZ
  #113 = Methodref          #105.#114     // ext/mods/gameserver/geoengine/GeoEngine.canMoveToTarget:(IIIIII)Z
  #114 = NameAndType        #115:#116     // canMoveToTarget:(IIIIII)Z
  #115 = Utf8               canMoveToTarget
  #116 = Utf8               (IIIIII)Z
  #117 = Methodref          #52.#118      // java/awt/Graphics2D.fillRect:(IIII)V
  #118 = NameAndType        #119:#120     // fillRect:(IIII)V
  #119 = Utf8               fillRect
  #120 = Utf8               (IIII)V
  #121 = Methodref          #52.#122      // java/awt/Graphics2D.drawLine:(IIII)V
  #122 = NameAndType        #123:#120     // drawLine:(IIII)V
  #123 = Utf8               drawLine
  #124 = Methodref          #52.#125      // java/awt/Graphics2D.drawOval:(IIII)V
  #125 = NameAndType        #126:#120     // drawOval:(IIII)V
  #126 = Utf8               drawOval
  #127 = Fieldref           #91.#128      // java/awt/Color.GREEN:Ljava/awt/Color;
  #128 = NameAndType        #129:#25      // GREEN:Ljava/awt/Color;
  #129 = Utf8               GREEN
  #130 = Methodref          #52.#131      // java/awt/Graphics2D.fillOval:(IIII)V
  #131 = NameAndType        #132:#120     // fillOval:(IIII)V
  #132 = Utf8               fillOval
  #133 = String             #134          // You
  #134 = Utf8               You
  #135 = Class              #136          // ext/mods/gameserver/model/actor/Npc
  #136 = Utf8               ext/mods/gameserver/model/actor/Npc
  #137 = Methodref          #97.#138      // ext/mods/gameserver/model/actor/Player.getKnownTypeInRadius:(Ljava/lang/Class;I)Ljava/util/List;
  #138 = NameAndType        #139:#140     // getKnownTypeInRadius:(Ljava/lang/Class;I)Ljava/util/List;
  #139 = Utf8               getKnownTypeInRadius
  #140 = Utf8               (Ljava/lang/Class;I)Ljava/util/List;
  #141 = InterfaceMethodref #142.#143     // java/util/List.iterator:()Ljava/util/Iterator;
  #142 = Class              #144          // java/util/List
  #143 = NameAndType        #145:#146     // iterator:()Ljava/util/Iterator;
  #144 = Utf8               java/util/List
  #145 = Utf8               iterator
  #146 = Utf8               ()Ljava/util/Iterator;
  #147 = InterfaceMethodref #148.#149     // java/util/Iterator.hasNext:()Z
  #148 = Class              #150          // java/util/Iterator
  #149 = NameAndType        #151:#152     // hasNext:()Z
  #150 = Utf8               java/util/Iterator
  #151 = Utf8               hasNext
  #152 = Utf8               ()Z
  #153 = InterfaceMethodref #148.#154     // java/util/Iterator.next:()Ljava/lang/Object;
  #154 = NameAndType        #155:#156     // next:()Ljava/lang/Object;
  #155 = Utf8               next
  #156 = Utf8               ()Ljava/lang/Object;
  #157 = Class              #158          // ext/mods/gameserver/model/actor/Creature
  #158 = Utf8               ext/mods/gameserver/model/actor/Creature
  #159 = Methodref          #135.#98      // ext/mods/gameserver/model/actor/Npc.getX:()I
  #160 = Methodref          #135.#102     // ext/mods/gameserver/model/actor/Npc.getY:()I
  #161 = Methodref          #135.#162     // ext/mods/gameserver/model/actor/Npc.getTarget:()Lext/mods/gameserver/model/WorldObject;
  #162 = NameAndType        #163:#164     // getTarget:()Lext/mods/gameserver/model/WorldObject;
  #163 = Utf8               getTarget
  #164 = Utf8               ()Lext/mods/gameserver/model/WorldObject;
  #165 = Fieldref           #21.#166      // ext/mods/commons/gui/ModernUI.NEON_PURPLE:Ljava/awt/Color;
  #166 = NameAndType        #167:#25      // NEON_PURPLE:Ljava/awt/Color;
  #167 = Utf8               NEON_PURPLE
  #168 = Methodref          #135.#169     // ext/mods/gameserver/model/actor/Npc.isMoving:()Z
  #169 = NameAndType        #170:#152     // isMoving:()Z
  #170 = Utf8               isMoving
  #171 = Fieldref           #91.#172      // java/awt/Color.ORANGE:Ljava/awt/Color;
  #172 = NameAndType        #173:#25      // ORANGE:Ljava/awt/Color;
  #173 = Utf8               ORANGE
  #174 = Fieldref           #91.#175      // java/awt/Color.RED:Ljava/awt/Color;
  #175 = NameAndType        #176:#25      // RED:Ljava/awt/Color;
  #176 = Utf8               RED
  #177 = Methodref          #135.#178     // ext/mods/gameserver/model/actor/Npc.getCollisionRadius:()D
  #178 = NameAndType        #179:#180     // getCollisionRadius:()D
  #179 = Utf8               getCollisionRadius
  #180 = Utf8               ()D
  #181 = Double             5.0d
  #183 = Methodref          #91.#184      // java/awt/Color."<init>":(IIII)V
  #184 = NameAndType        #7:#120       // "<init>":(IIII)V
  #185 = Methodref          #186.#187     // ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
  #186 = Class              #188          // ext/mods/gameserver/model/World
  #187 = NameAndType        #108:#189     // getInstance:()Lext/mods/gameserver/model/World;
  #188 = Utf8               ext/mods/gameserver/model/World
  #189 = Utf8               ()Lext/mods/gameserver/model/World;
  #190 = Methodref          #186.#191     // ext/mods/gameserver/model/World.getPlayers:()Ljava/util/Collection;
  #191 = NameAndType        #192:#193     // getPlayers:()Ljava/util/Collection;
  #192 = Utf8               getPlayers
  #193 = Utf8               ()Ljava/util/Collection;
  #194 = InterfaceMethodref #195.#143     // java/util/Collection.iterator:()Ljava/util/Iterator;
  #195 = Class              #196          // java/util/Collection
  #196 = Utf8               java/util/Collection
  #197 = Methodref          #97.#198      // ext/mods/gameserver/model/actor/Player.isOnline:()Z
  #198 = NameAndType        #199:#152     // isOnline:()Z
  #199 = Utf8               isOnline
  #200 = Methodref          #97.#201      // ext/mods/gameserver/model/actor/Player.getAccessLevel:()Lext/mods/gameserver/model/AccessLevel;
  #201 = NameAndType        #202:#203     // getAccessLevel:()Lext/mods/gameserver/model/AccessLevel;
  #202 = Utf8               getAccessLevel
  #203 = Utf8               ()Lext/mods/gameserver/model/AccessLevel;
  #204 = Methodref          #205.#206     // ext/mods/gameserver/model/AccessLevel.isGm:()Z
  #205 = Class              #207          // ext/mods/gameserver/model/AccessLevel
  #206 = NameAndType        #208:#152     // isGm:()Z
  #207 = Utf8               ext/mods/gameserver/model/AccessLevel
  #208 = Utf8               isGm
  #209 = Utf8               SCALE
  #210 = Utf8               I
  #211 = Utf8               ConstantValue
  #212 = Integer            5
  #213 = Utf8               REFRESH_RATE
  #214 = Integer            200
  #215 = Utf8               ()V
  #216 = Utf8               Code
  #217 = Utf8               LineNumberTable
  #218 = Utf8               LocalVariableTable
  #219 = Utf8               this
  #220 = Utf8               Lext/mods/commons/gui/RadarPanel;
  #221 = Utf8               drawX
  #222 = Utf8               drawY
  #223 = Utf8               worldX
  #224 = Utf8               worldY
  #225 = Utf8               y
  #226 = Utf8               x
  #227 = Utf8               npc
  #228 = Utf8               Lext/mods/gameserver/model/actor/Npc;
  #229 = Utf8               relX
  #230 = Utf8               relY
  #231 = Utf8               visRad
  #232 = Utf8               obj
  #233 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #234 = Utf8               g
  #235 = Utf8               Ljava/awt/Graphics;
  #236 = Utf8               g2
  #237 = Utf8               Ljava/awt/Graphics2D;
  #238 = Utf8               w
  #239 = Utf8               h
  #240 = Utf8               cx
  #241 = Utf8               cy
  #242 = Utf8               gm
  #243 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #244 = Utf8               scanRange
  #245 = Utf8               step
  #246 = Utf8               StackMapTable
  #247 = Class              #248          // java/awt/Graphics
  #248 = Utf8               java/awt/Graphics
  #249 = Utf8               player
  #250 = Utf8               SourceFile
  #251 = Utf8               RadarPanel.java
  #252 = Utf8               NestMembers
  #253 = Utf8               InnerClasses
  #254 = Utf8               SectionPanel
  #255 = Class              #256          // java/awt/RenderingHints$Key
  #256 = Utf8               java/awt/RenderingHints$Key
  #257 = Utf8               Key
{
  public ext.mods.commons.gui.RadarPanel();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=1, args_size=1
         0: aload_0
         1: ldc           #1                  // String Real-time Radar
         3: invokespecial #3                  // Method ext/mods/commons/gui/ModernUI$SectionPanel."<init>":(Ljava/lang/String;)V
         6: aload_0
         7: new           #9                  // class java/awt/Dimension
        10: dup
        11: sipush        300
        14: sipush        300
        17: invokespecial #11                 // Method java/awt/Dimension."<init>":(II)V
        20: invokevirtual #14                 // Method setPreferredSize:(Ljava/awt/Dimension;)V
        23: aload_0
        24: getstatic     #20                 // Field ext/mods/commons/gui/ModernUI.BG_CONSOLE:Ljava/awt/Color;
        27: invokevirtual #26                 // Method setBackground:(Ljava/awt/Color;)V
        30: new           #30                 // class java/util/Timer
        33: dup
        34: ldc           #32                 // String Radar-Updater
        36: iconst_1
        37: invokespecial #34                 // Method java/util/Timer."<init>":(Ljava/lang/String;Z)V
        40: new           #37                 // class ext/mods/commons/gui/RadarPanel$1
        43: dup
        44: aload_0
        45: invokespecial #39                 // Method ext/mods/commons/gui/RadarPanel$1."<init>":(Lext/mods/commons/gui/RadarPanel;)V
        48: lconst_0
        49: ldc2_w        #42                 // long 200l
        52: invokevirtual #44                 // Method java/util/Timer.scheduleAtFixedRate:(Ljava/util/TimerTask;JJ)V
        55: return
      LineNumberTable:
        line 37: 0
        line 38: 6
        line 39: 23
        line 41: 30
        line 47: 55
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      56     0  this   Lext/mods/commons/gui/RadarPanel;

  protected void paintComponent(java.awt.Graphics);
    descriptor: (Ljava/awt/Graphics;)V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=7, locals=18, args_size=2
         0: aload_0
         1: aload_1
         2: invokespecial #48                 // Method ext/mods/commons/gui/ModernUI$SectionPanel.paintComponent:(Ljava/awt/Graphics;)V
         5: aload_1
         6: checkcast     #52                 // class java/awt/Graphics2D
         9: astore_2
        10: aload_2
        11: getstatic     #54                 // Field java/awt/RenderingHints.KEY_ANTIALIASING:Ljava/awt/RenderingHints$Key;
        14: getstatic     #60                 // Field java/awt/RenderingHints.VALUE_ANTIALIAS_ON:Ljava/lang/Object;
        17: invokevirtual #64                 // Method java/awt/Graphics2D.setRenderingHint:(Ljava/awt/RenderingHints$Key;Ljava/lang/Object;)V
        20: aload_0
        21: invokevirtual #68                 // Method getWidth:()I
        24: istore_3
        25: aload_0
        26: invokevirtual #72                 // Method getHeight:()I
        29: istore        4
        31: iload_3
        32: iconst_2
        33: idiv
        34: istore        5
        36: iload         4
        38: iconst_2
        39: idiv
        40: istore        6
        42: aload_0
        43: invokevirtual #75                 // Method findActiveGM:()Lext/mods/gameserver/model/actor/Player;
        46: astore        7
        48: aload         7
        50: ifnonnull     74
        53: aload_2
        54: getstatic     #79                 // Field ext/mods/commons/gui/ModernUI.TEXT_GRAY:Ljava/awt/Color;
        57: invokevirtual #82                 // Method java/awt/Graphics2D.setColor:(Ljava/awt/Color;)V
        60: aload_2
        61: ldc           #85                 // String No GM Online
        63: iload         5
        65: bipush        40
        67: isub
        68: iload         6
        70: invokevirtual #87                 // Method java/awt/Graphics2D.drawString:(Ljava/lang/String;II)V
        73: return
        74: aload_2
        75: new           #91                 // class java/awt/Color
        78: dup
        79: bipush        40
        81: bipush        40
        83: bipush        50
        85: invokespecial #93                 // Method java/awt/Color."<init>":(III)V
        88: invokevirtual #82                 // Method java/awt/Graphics2D.setColor:(Ljava/awt/Color;)V
        91: sipush        600
        94: istore        8
        96: bipush        16
        98: istore        9
       100: iload         8
       102: ineg
       103: istore        10
       105: iload         10
       107: iload         8
       109: if_icmpgt     223
       112: iload         8
       114: ineg
       115: istore        11
       117: iload         11
       119: iload         8
       121: if_icmpgt     213
       124: aload         7
       126: invokevirtual #96                 // Method ext/mods/gameserver/model/actor/Player.getX:()I
       129: iload         10
       131: iadd
       132: istore        12
       134: aload         7
       136: invokevirtual #101                // Method ext/mods/gameserver/model/actor/Player.getY:()I
       139: iload         11
       141: iadd
       142: istore        13
       144: invokestatic  #104                // Method ext/mods/gameserver/geoengine/GeoEngine.getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
       147: iload         12
       149: iload         13
       151: aload         7
       153: invokevirtual #110                // Method ext/mods/gameserver/model/actor/Player.getZ:()I
       156: iload         12
       158: iconst_1
       159: iadd
       160: iload         13
       162: iconst_1
       163: iadd
       164: aload         7
       166: invokevirtual #110                // Method ext/mods/gameserver/model/actor/Player.getZ:()I
       169: invokevirtual #113                // Method ext/mods/gameserver/geoengine/GeoEngine.canMoveToTarget:(IIIIII)Z
       172: ifne          203
       175: iload         5
       177: iload         10
       179: iconst_5
       180: idiv
       181: iadd
       182: istore        14
       184: iload         6
       186: iload         11
       188: iconst_5
       189: idiv
       190: iadd
       191: istore        15
       193: aload_2
       194: iload         14
       196: iload         15
       198: iconst_2
       199: iconst_2
       200: invokevirtual #117                // Method java/awt/Graphics2D.fillRect:(IIII)V
       203: iload         11
       205: iload         9
       207: iadd
       208: istore        11
       210: goto          117
       213: iload         10
       215: iload         9
       217: iadd
       218: istore        10
       220: goto          105
       223: aload_2
       224: new           #91                 // class java/awt/Color
       227: dup
       228: bipush        60
       230: bipush        60
       232: bipush        70
       234: invokespecial #93                 // Method java/awt/Color."<init>":(III)V
       237: invokevirtual #82                 // Method java/awt/Graphics2D.setColor:(Ljava/awt/Color;)V
       240: aload_2
       241: iload         5
       243: iconst_0
       244: iload         5
       246: iload         4
       248: invokevirtual #121                // Method java/awt/Graphics2D.drawLine:(IIII)V
       251: aload_2
       252: iconst_0
       253: iload         6
       255: iload_3
       256: iload         6
       258: invokevirtual #121                // Method java/awt/Graphics2D.drawLine:(IIII)V
       261: aload_2
       262: iload         5
       264: bipush        50
       266: isub
       267: iload         6
       269: bipush        50
       271: isub
       272: bipush        100
       274: bipush        100
       276: invokevirtual #124                // Method java/awt/Graphics2D.drawOval:(IIII)V
       279: aload_2
       280: getstatic     #127                // Field java/awt/Color.GREEN:Ljava/awt/Color;
       283: invokevirtual #82                 // Method java/awt/Graphics2D.setColor:(Ljava/awt/Color;)V
       286: aload_2
       287: iload         5
       289: iconst_3
       290: isub
       291: iload         6
       293: iconst_3
       294: isub
       295: bipush        6
       297: bipush        6
       299: invokevirtual #130                // Method java/awt/Graphics2D.fillOval:(IIII)V
       302: aload_2
       303: ldc           #133                // String You
       305: iload         5
       307: iconst_5
       308: iadd
       309: iload         6
       311: iconst_5
       312: isub
       313: invokevirtual #87                 // Method java/awt/Graphics2D.drawString:(Ljava/lang/String;II)V
       316: aload         7
       318: ldc           #135                // class ext/mods/gameserver/model/actor/Npc
       320: sipush        1500
       323: invokevirtual #137                // Method ext/mods/gameserver/model/actor/Player.getKnownTypeInRadius:(Ljava/lang/Class;I)Ljava/util/List;
       326: invokeinterface #141,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
       331: astore        10
       333: aload         10
       335: invokeinterface #147,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       340: ifeq          528
       343: aload         10
       345: invokeinterface #153,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       350: checkcast     #157                // class ext/mods/gameserver/model/actor/Creature
       353: astore        11
       355: aload         11
       357: instanceof    #135                // class ext/mods/gameserver/model/actor/Npc
       360: ifeq          525
       363: aload         11
       365: checkcast     #135                // class ext/mods/gameserver/model/actor/Npc
       368: astore        12
       370: aload         12
       372: invokevirtual #159                // Method ext/mods/gameserver/model/actor/Npc.getX:()I
       375: aload         7
       377: invokevirtual #96                 // Method ext/mods/gameserver/model/actor/Player.getX:()I
       380: isub
       381: iconst_5
       382: idiv
       383: istore        13
       385: aload         12
       387: invokevirtual #160                // Method ext/mods/gameserver/model/actor/Npc.getY:()I
       390: aload         7
       392: invokevirtual #101                // Method ext/mods/gameserver/model/actor/Player.getY:()I
       395: isub
       396: iconst_5
       397: idiv
       398: istore        14
       400: iload         5
       402: iload         13
       404: iadd
       405: istore        15
       407: iload         6
       409: iload         14
       411: iadd
       412: istore        16
       414: aload         12
       416: invokevirtual #161                // Method ext/mods/gameserver/model/actor/Npc.getTarget:()Lext/mods/gameserver/model/WorldObject;
       419: ifnull        432
       422: aload_2
       423: getstatic     #165                // Field ext/mods/commons/gui/ModernUI.NEON_PURPLE:Ljava/awt/Color;
       426: invokevirtual #82                 // Method java/awt/Graphics2D.setColor:(Ljava/awt/Color;)V
       429: goto          457
       432: aload         12
       434: invokevirtual #168                // Method ext/mods/gameserver/model/actor/Npc.isMoving:()Z
       437: ifeq          450
       440: aload_2
       441: getstatic     #171                // Field java/awt/Color.ORANGE:Ljava/awt/Color;
       444: invokevirtual #82                 // Method java/awt/Graphics2D.setColor:(Ljava/awt/Color;)V
       447: goto          457
       450: aload_2
       451: getstatic     #174                // Field java/awt/Color.RED:Ljava/awt/Color;
       454: invokevirtual #82                 // Method java/awt/Graphics2D.setColor:(Ljava/awt/Color;)V
       457: aload_2
       458: iload         15
       460: iconst_2
       461: isub
       462: iload         16
       464: iconst_2
       465: isub
       466: iconst_4
       467: iconst_4
       468: invokevirtual #130                // Method java/awt/Graphics2D.fillOval:(IIII)V
       471: aload         12
       473: invokevirtual #177                // Method ext/mods/gameserver/model/actor/Npc.getCollisionRadius:()D
       476: ldc2_w        #181                // double 5.0d
       479: ddiv
       480: d2i
       481: istore        17
       483: aload_2
       484: new           #91                 // class java/awt/Color
       487: dup
       488: sipush        255
       491: bipush        50
       493: bipush        50
       495: bipush        40
       497: invokespecial #183                // Method java/awt/Color."<init>":(IIII)V
       500: invokevirtual #82                 // Method java/awt/Graphics2D.setColor:(Ljava/awt/Color;)V
       503: aload_2
       504: iload         15
       506: iload         17
       508: isub
       509: iload         16
       511: iload         17
       513: isub
       514: iload         17
       516: iconst_2
       517: imul
       518: iload         17
       520: iconst_2
       521: imul
       522: invokevirtual #130                // Method java/awt/Graphics2D.fillOval:(IIII)V
       525: goto          333
       528: return
      LineNumberTable:
        line 51: 0
        line 52: 5
        line 53: 10
        line 55: 20
        line 56: 25
        line 57: 31
        line 58: 36
        line 60: 42
        line 62: 48
        line 63: 53
        line 64: 60
        line 65: 73
        line 68: 74
        line 69: 91
        line 70: 96
        line 72: 100
        line 73: 112
        line 74: 124
        line 75: 134
        line 77: 144
        line 78: 175
        line 79: 184
        line 80: 193
        line 73: 203
        line 72: 213
        line 85: 223
        line 86: 240
        line 87: 251
        line 88: 261
        line 90: 279
        line 91: 286
        line 92: 302
        line 94: 316
        line 95: 355
        line 96: 363
        line 98: 370
        line 99: 385
        line 100: 400
        line 101: 407
        line 103: 414
        line 104: 422
        line 105: 432
        line 106: 440
        line 108: 450
        line 111: 457
        line 113: 471
        line 114: 483
        line 115: 503
        line 117: 525
        line 118: 528
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          184      19    14 drawX   I
          193      10    15 drawY   I
          134      69    12 worldX   I
          144      59    13 worldY   I
          117      96    11     y   I
          105     118    10     x   I
          370     155    12   npc   Lext/mods/gameserver/model/actor/Npc;
          385     140    13  relX   I
          400     125    14  relY   I
          407     118    15 drawX   I
          414     111    16 drawY   I
          483      42    17 visRad   I
          355     170    11   obj   Lext/mods/gameserver/model/actor/Creature;
            0     529     0  this   Lext/mods/commons/gui/RadarPanel;
            0     529     1     g   Ljava/awt/Graphics;
           10     519     2    g2   Ljava/awt/Graphics2D;
           25     504     3     w   I
           31     498     4     h   I
           36     493     5    cx   I
           42     487     6    cy   I
           48     481     7    gm   Lext/mods/gameserver/model/actor/Player;
           96     433     8 scanRange   I
          100     429     9  step   I
      StackMapTable: number_of_entries = 12
        frame_type = 255 /* full_frame */
          offset_delta = 74
          locals = [ class ext/mods/commons/gui/RadarPanel, class java/awt/Graphics, class java/awt/Graphics2D, int, int, int, int, class ext/mods/gameserver/model/actor/Player ]
          stack = []
        frame_type = 254 /* append */
          offset_delta = 30
          locals = [ int, int, int ]
        frame_type = 252 /* append */
          offset_delta = 11
          locals = [ int ]
        frame_type = 251 /* same_frame_extended */
          offset_delta = 85
        frame_type = 250 /* chop */
          offset_delta = 9
        frame_type = 250 /* chop */
          offset_delta = 9
        frame_type = 252 /* append */
          offset_delta = 109
          locals = [ class java/util/Iterator ]
        frame_type = 255 /* full_frame */
          offset_delta = 98
          locals = [ class ext/mods/commons/gui/RadarPanel, class java/awt/Graphics, class java/awt/Graphics2D, int, int, int, int, class ext/mods/gameserver/model/actor/Player, int, int, class java/util/Iterator, class ext/mods/gameserver/model/actor/Creature, class ext/mods/gameserver/model/actor/Npc, int, int, int, int ]
          stack = []
        frame_type = 17 /* same */
        frame_type = 6 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 67
          locals = [ class ext/mods/commons/gui/RadarPanel, class java/awt/Graphics, class java/awt/Graphics2D, int, int, int, int, class ext/mods/gameserver/model/actor/Player, int, int, class java/util/Iterator ]
          stack = []
        frame_type = 250 /* chop */
          offset_delta = 2
}
SourceFile: "RadarPanel.java"
NestMembers:
  ext/mods/commons/gui/RadarPanel$1
InnerClasses:
  public static #254= #4 of #21;          // SectionPanel=class ext/mods/commons/gui/ModernUI$SectionPanel of class ext/mods/commons/gui/ModernUI
  #37;                                    // class ext/mods/commons/gui/RadarPanel$1
  public static abstract #257= #255 of #55; // Key=class java/awt/RenderingHints$Key of class java/awt/RenderingHints
