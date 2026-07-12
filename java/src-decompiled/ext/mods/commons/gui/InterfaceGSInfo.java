// Bytecode for: ext.mods.commons.gui.InterfaceGSInfo
// File: ext\mods\commons\gui\InterfaceGSInfo.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/commons/gui/InterfaceGSInfo.class
  Last modified 9 de jul de 2026; size 4871 bytes
  MD5 checksum 8cccfd55010b2691f3f4e3762e2f06b6
  Compiled from "InterfaceGSInfo.java"
public class ext.mods.commons.gui.InterfaceGSInfo extends ext.mods.commons.gui.ModernUI$SectionPanel
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #15                         // ext/mods/commons/gui/InterfaceGSInfo
  super_class: #4                         // ext/mods/commons/gui/ModernUI$SectionPanel
  interfaces: 0, fields: 10, methods: 6, attributes: 4
Constant pool:
    #1 = String             #2            // General Status
    #2 = Utf8               General Status
    #3 = Methodref          #4.#5         // ext/mods/commons/gui/ModernUI$SectionPanel."<init>":(Ljava/lang/String;)V
    #4 = Class              #6            // ext/mods/commons/gui/ModernUI$SectionPanel
    #5 = NameAndType        #7:#8         // "<init>":(Ljava/lang/String;)V
    #6 = Utf8               ext/mods/commons/gui/ModernUI$SectionPanel
    #7 = Utf8               <init>
    #8 = Utf8               (Ljava/lang/String;)V
    #9 = Class              #10           // javax/swing/BoxLayout
   #10 = Utf8               javax/swing/BoxLayout
   #11 = Methodref          #9.#12        // javax/swing/BoxLayout."<init>":(Ljava/awt/Container;I)V
   #12 = NameAndType        #7:#13        // "<init>":(Ljava/awt/Container;I)V
   #13 = Utf8               (Ljava/awt/Container;I)V
   #14 = Methodref          #15.#16       // ext/mods/commons/gui/InterfaceGSInfo.setLayout:(Ljava/awt/LayoutManager;)V
   #15 = Class              #17           // ext/mods/commons/gui/InterfaceGSInfo
   #16 = NameAndType        #18:#19       // setLayout:(Ljava/awt/LayoutManager;)V
   #17 = Utf8               ext/mods/commons/gui/InterfaceGSInfo
   #18 = Utf8               setLayout
   #19 = Utf8               (Ljava/awt/LayoutManager;)V
   #20 = Methodref          #21.#22       // javax/swing/Box.createVerticalStrut:(I)Ljava/awt/Component;
   #21 = Class              #23           // javax/swing/Box
   #22 = NameAndType        #24:#25       // createVerticalStrut:(I)Ljava/awt/Component;
   #23 = Utf8               javax/swing/Box
   #24 = Utf8               createVerticalStrut
   #25 = Utf8               (I)Ljava/awt/Component;
   #26 = Methodref          #15.#27       // ext/mods/commons/gui/InterfaceGSInfo.add:(Ljava/awt/Component;)Ljava/awt/Component;
   #27 = NameAndType        #28:#29       // add:(Ljava/awt/Component;)Ljava/awt/Component;
   #28 = Utf8               add
   #29 = Utf8               (Ljava/awt/Component;)Ljava/awt/Component;
   #30 = String             #31           // Version
   #31 = Utf8               Version
   #32 = String             #33           // 2.9.7
   #33 = Utf8               2.9.7
   #34 = Methodref          #15.#35       // ext/mods/commons/gui/InterfaceGSInfo.addInfoRow:(Ljava/lang/String;Ljava/lang/String;)Lext/mods/commons/gui/InterfaceGSInfo$InfoRow;
   #35 = NameAndType        #36:#37       // addInfoRow:(Ljava/lang/String;Ljava/lang/String;)Lext/mods/commons/gui/InterfaceGSInfo$InfoRow;
   #36 = Utf8               addInfoRow
   #37 = Utf8               (Ljava/lang/String;Ljava/lang/String;)Lext/mods/commons/gui/InterfaceGSInfo$InfoRow;
   #38 = Fieldref           #15.#39       // ext/mods/commons/gui/InterfaceGSInfo.rowVersion:Lext/mods/commons/gui/InterfaceGSInfo$InfoRow;
   #39 = NameAndType        #40:#41       // rowVersion:Lext/mods/commons/gui/InterfaceGSInfo$InfoRow;
   #40 = Utf8               rowVersion
   #41 = Utf8               Lext/mods/commons/gui/InterfaceGSInfo$InfoRow;
   #42 = String             #43           // Build JDK
   #43 = Utf8               Build JDK
   #44 = String             #45           // java.version
   #45 = Utf8               java.version
   #46 = Methodref          #47.#48       // java/lang/System.getProperty:(Ljava/lang/String;)Ljava/lang/String;
   #47 = Class              #49           // java/lang/System
   #48 = NameAndType        #50:#51       // getProperty:(Ljava/lang/String;)Ljava/lang/String;
   #49 = Utf8               java/lang/System
   #50 = Utf8               getProperty
   #51 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
   #52 = Fieldref           #15.#53       // ext/mods/commons/gui/InterfaceGSInfo.rowJava:Lext/mods/commons/gui/InterfaceGSInfo$InfoRow;
   #53 = NameAndType        #54:#41       // rowJava:Lext/mods/commons/gui/InterfaceGSInfo$InfoRow;
   #54 = Utf8               rowJava
   #55 = String             #56           // Hwid Protocol
   #56 = Utf8               Hwid Protocol
   #57 = String             #58           // Loading...
   #58 = Utf8               Loading...
   #59 = Fieldref           #15.#60       // ext/mods/commons/gui/InterfaceGSInfo.rowProtocol:Lext/mods/commons/gui/InterfaceGSInfo$InfoRow;
   #60 = NameAndType        #61:#41       // rowProtocol:Lext/mods/commons/gui/InterfaceGSInfo$InfoRow;
   #61 = Utf8               rowProtocol
   #62 = String             #63           // Online Players
   #63 = Utf8               Online Players
   #64 = String             #65           // 0
   #65 = Utf8               0
   #66 = Fieldref           #15.#67       // ext/mods/commons/gui/InterfaceGSInfo.rowPlayers:Lext/mods/commons/gui/InterfaceGSInfo$InfoRow;
   #67 = NameAndType        #68:#41       // rowPlayers:Lext/mods/commons/gui/InterfaceGSInfo$InfoRow;
   #68 = Utf8               rowPlayers
   #69 = String             #70           // Elapsed
   #70 = Utf8               Elapsed
   #71 = String             #72           // 00:00:00
   #72 = Utf8               00:00:00
   #73 = Fieldref           #15.#74       // ext/mods/commons/gui/InterfaceGSInfo.rowUptime:Lext/mods/commons/gui/InterfaceGSInfo$InfoRow;
   #74 = NameAndType        #75:#41       // rowUptime:Lext/mods/commons/gui/InterfaceGSInfo$InfoRow;
   #75 = Utf8               rowUptime
   #76 = String             #77           // Offline Trade
   #77 = Utf8               Offline Trade
   #78 = Fieldref           #15.#79       // ext/mods/commons/gui/InterfaceGSInfo.rowOffline:Lext/mods/commons/gui/InterfaceGSInfo$InfoRow;
   #79 = NameAndType        #80:#41       // rowOffline:Lext/mods/commons/gui/InterfaceGSInfo$InfoRow;
   #80 = Utf8               rowOffline
   #81 = Class              #82           // ext/mods/commons/gui/InterfaceGSInfo$MetricBar
   #82 = Utf8               ext/mods/commons/gui/InterfaceGSInfo$MetricBar
   #83 = Fieldref           #84.#85       // ext/mods/commons/gui/ModernUI.NEON_GREEN:Ljava/awt/Color;
   #84 = Class              #86           // ext/mods/commons/gui/ModernUI
   #85 = NameAndType        #87:#88       // NEON_GREEN:Ljava/awt/Color;
   #86 = Utf8               ext/mods/commons/gui/ModernUI
   #87 = Utf8               NEON_GREEN
   #88 = Utf8               Ljava/awt/Color;
   #89 = Fieldref           #84.#90       // ext/mods/commons/gui/ModernUI.NEON_CYAN:Ljava/awt/Color;
   #90 = NameAndType        #91:#88       // NEON_CYAN:Ljava/awt/Color;
   #91 = Utf8               NEON_CYAN
   #92 = Methodref          #81.#93       // ext/mods/commons/gui/InterfaceGSInfo$MetricBar."<init>":(Ljava/awt/Color;Ljava/awt/Color;)V
   #93 = NameAndType        #7:#94        // "<init>":(Ljava/awt/Color;Ljava/awt/Color;)V
   #94 = Utf8               (Ljava/awt/Color;Ljava/awt/Color;)V
   #95 = Fieldref           #15.#96       // ext/mods/commons/gui/InterfaceGSInfo.barMemory:Lext/mods/commons/gui/InterfaceGSInfo$MetricBar;
   #96 = NameAndType        #97:#98       // barMemory:Lext/mods/commons/gui/InterfaceGSInfo$MetricBar;
   #97 = Utf8               barMemory
   #98 = Utf8               Lext/mods/commons/gui/InterfaceGSInfo$MetricBar;
   #99 = Methodref          #21.#100      // javax/swing/Box.createVerticalGlue:()Ljava/awt/Component;
  #100 = NameAndType        #101:#102     // createVerticalGlue:()Ljava/awt/Component;
  #101 = Utf8               createVerticalGlue
  #102 = Utf8               ()Ljava/awt/Component;
  #103 = Methodref          #15.#104      // ext/mods/commons/gui/InterfaceGSInfo.startUpdateTask:()V
  #104 = NameAndType        #105:#106     // startUpdateTask:()V
  #105 = Utf8               startUpdateTask
  #106 = Utf8               ()V
  #107 = Class              #108          // ext/mods/commons/gui/InterfaceGSInfo$InfoRow
  #108 = Utf8               ext/mods/commons/gui/InterfaceGSInfo$InfoRow
  #109 = Methodref          #107.#110     // ext/mods/commons/gui/InterfaceGSInfo$InfoRow."<init>":(Ljava/lang/String;Ljava/lang/String;)V
  #110 = NameAndType        #7:#111       // "<init>":(Ljava/lang/String;Ljava/lang/String;)V
  #111 = Utf8               (Ljava/lang/String;Ljava/lang/String;)V
  #112 = Class              #113          // java/util/Timer
  #113 = Utf8               java/util/Timer
  #114 = String             #115          // GSInfo-Protocol
  #115 = Utf8               GSInfo-Protocol
  #116 = Methodref          #112.#117     // java/util/Timer."<init>":(Ljava/lang/String;Z)V
  #117 = NameAndType        #7:#118       // "<init>":(Ljava/lang/String;Z)V
  #118 = Utf8               (Ljava/lang/String;Z)V
  #119 = Class              #120          // ext/mods/commons/gui/InterfaceGSInfo$1
  #120 = Utf8               ext/mods/commons/gui/InterfaceGSInfo$1
  #121 = Methodref          #119.#122     // ext/mods/commons/gui/InterfaceGSInfo$1."<init>":(Lext/mods/commons/gui/InterfaceGSInfo;)V
  #122 = NameAndType        #7:#123       // "<init>":(Lext/mods/commons/gui/InterfaceGSInfo;)V
  #123 = Utf8               (Lext/mods/commons/gui/InterfaceGSInfo;)V
  #124 = Long               4500l
  #126 = Methodref          #112.#127     // java/util/Timer.schedule:(Ljava/util/TimerTask;J)V
  #127 = NameAndType        #128:#129     // schedule:(Ljava/util/TimerTask;J)V
  #128 = Utf8               schedule
  #129 = Utf8               (Ljava/util/TimerTask;J)V
  #130 = String             #131          // GSInfo-Updater
  #131 = Utf8               GSInfo-Updater
  #132 = Class              #133          // ext/mods/commons/gui/InterfaceGSInfo$2
  #133 = Utf8               ext/mods/commons/gui/InterfaceGSInfo$2
  #134 = Methodref          #132.#122     // ext/mods/commons/gui/InterfaceGSInfo$2."<init>":(Lext/mods/commons/gui/InterfaceGSInfo;)V
  #135 = Long               1000l
  #137 = Methodref          #112.#138     // java/util/Timer.scheduleAtFixedRate:(Ljava/util/TimerTask;JJ)V
  #138 = NameAndType        #139:#140     // scheduleAtFixedRate:(Ljava/util/TimerTask;JJ)V
  #139 = Utf8               scheduleAtFixedRate
  #140 = Utf8               (Ljava/util/TimerTask;JJ)V
  #141 = Long               1024l
  #143 = InvokeDynamic      #0:#144       // #0:makeConcatWithConstants:(J)Ljava/lang/String;
  #144 = NameAndType        #145:#146     // makeConcatWithConstants:(J)Ljava/lang/String;
  #145 = Utf8               makeConcatWithConstants
  #146 = Utf8               (J)Ljava/lang/String;
  #147 = Methodref          #148.#149     // java/lang/Math.log:(D)D
  #148 = Class              #150          // java/lang/Math
  #149 = NameAndType        #151:#152     // log:(D)D
  #150 = Utf8               java/lang/Math
  #151 = Utf8               log
  #152 = Utf8               (D)D
  #153 = Double             1024.0d
  #155 = String             #156          // KMGTPE
  #156 = Utf8               KMGTPE
  #157 = Methodref          #158.#159     // java/lang/String.charAt:(I)C
  #158 = Class              #160          // java/lang/String
  #159 = NameAndType        #161:#162     // charAt:(I)C
  #160 = Utf8               java/lang/String
  #161 = Utf8               charAt
  #162 = Utf8               (I)C
  #163 = Methodref          #148.#164     // java/lang/Math.pow:(DD)D
  #164 = NameAndType        #165:#166     // pow:(DD)D
  #165 = Utf8               pow
  #166 = Utf8               (DD)D
  #167 = String             #168          // %.0f %sB
  #168 = Utf8               %.0f %sB
  #169 = String             #170          // %.2f %sB
  #170 = Utf8               %.2f %sB
  #171 = Class              #172          // java/lang/Object
  #172 = Utf8               java/lang/Object
  #173 = Methodref          #174.#175     // java/lang/Double.valueOf:(D)Ljava/lang/Double;
  #174 = Class              #176          // java/lang/Double
  #175 = NameAndType        #177:#178     // valueOf:(D)Ljava/lang/Double;
  #176 = Utf8               java/lang/Double
  #177 = Utf8               valueOf
  #178 = Utf8               (D)Ljava/lang/Double;
  #179 = Methodref          #180.#181     // java/lang/Character.valueOf:(C)Ljava/lang/Character;
  #180 = Class              #182          // java/lang/Character
  #181 = NameAndType        #177:#183     // valueOf:(C)Ljava/lang/Character;
  #182 = Utf8               java/lang/Character
  #183 = Utf8               (C)Ljava/lang/Character;
  #184 = Methodref          #158.#185     // java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
  #185 = NameAndType        #186:#187     // format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
  #186 = Utf8               format
  #187 = Utf8               (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
  #188 = Fieldref           #189.#190     // java/util/concurrent/TimeUnit.MILLISECONDS:Ljava/util/concurrent/TimeUnit;
  #189 = Class              #191          // java/util/concurrent/TimeUnit
  #190 = NameAndType        #192:#193     // MILLISECONDS:Ljava/util/concurrent/TimeUnit;
  #191 = Utf8               java/util/concurrent/TimeUnit
  #192 = Utf8               MILLISECONDS
  #193 = Utf8               Ljava/util/concurrent/TimeUnit;
  #194 = Methodref          #189.#195     // java/util/concurrent/TimeUnit.toDays:(J)J
  #195 = NameAndType        #196:#197     // toDays:(J)J
  #196 = Utf8               toDays
  #197 = Utf8               (J)J
  #198 = Fieldref           #189.#199     // java/util/concurrent/TimeUnit.DAYS:Ljava/util/concurrent/TimeUnit;
  #199 = NameAndType        #200:#193     // DAYS:Ljava/util/concurrent/TimeUnit;
  #200 = Utf8               DAYS
  #201 = Methodref          #189.#202     // java/util/concurrent/TimeUnit.toMillis:(J)J
  #202 = NameAndType        #203:#197     // toMillis:(J)J
  #203 = Utf8               toMillis
  #204 = Methodref          #189.#205     // java/util/concurrent/TimeUnit.toHours:(J)J
  #205 = NameAndType        #206:#197     // toHours:(J)J
  #206 = Utf8               toHours
  #207 = Fieldref           #189.#208     // java/util/concurrent/TimeUnit.HOURS:Ljava/util/concurrent/TimeUnit;
  #208 = NameAndType        #209:#193     // HOURS:Ljava/util/concurrent/TimeUnit;
  #209 = Utf8               HOURS
  #210 = Methodref          #189.#211     // java/util/concurrent/TimeUnit.toMinutes:(J)J
  #211 = NameAndType        #212:#197     // toMinutes:(J)J
  #212 = Utf8               toMinutes
  #213 = Fieldref           #189.#214     // java/util/concurrent/TimeUnit.MINUTES:Ljava/util/concurrent/TimeUnit;
  #214 = NameAndType        #215:#193     // MINUTES:Ljava/util/concurrent/TimeUnit;
  #215 = Utf8               MINUTES
  #216 = Methodref          #189.#217     // java/util/concurrent/TimeUnit.toSeconds:(J)J
  #217 = NameAndType        #218:#197     // toSeconds:(J)J
  #218 = Utf8               toSeconds
  #219 = String             #220          // %dd %02dh %02dm %02ds
  #220 = Utf8               %dd %02dh %02dm %02ds
  #221 = Methodref          #222.#223     // java/lang/Long.valueOf:(J)Ljava/lang/Long;
  #222 = Class              #224          // java/lang/Long
  #223 = NameAndType        #177:#225     // valueOf:(J)Ljava/lang/Long;
  #224 = Utf8               java/lang/Long
  #225 = Utf8               (J)Ljava/lang/Long;
  #226 = Methodref          #227.#228     // java/lang/Class.getName:()Ljava/lang/String;
  #227 = Class              #229          // java/lang/Class
  #228 = NameAndType        #230:#231     // getName:()Ljava/lang/String;
  #229 = Utf8               java/lang/Class
  #230 = Utf8               getName
  #231 = Utf8               ()Ljava/lang/String;
  #232 = Methodref          #233.#234     // java/util/logging/Logger.getLogger:(Ljava/lang/String;)Ljava/util/logging/Logger;
  #233 = Class              #235          // java/util/logging/Logger
  #234 = NameAndType        #236:#237     // getLogger:(Ljava/lang/String;)Ljava/util/logging/Logger;
  #235 = Utf8               java/util/logging/Logger
  #236 = Utf8               getLogger
  #237 = Utf8               (Ljava/lang/String;)Ljava/util/logging/Logger;
  #238 = Fieldref           #15.#239      // ext/mods/commons/gui/InterfaceGSInfo.LOGGER:Ljava/util/logging/Logger;
  #239 = NameAndType        #240:#241     // LOGGER:Ljava/util/logging/Logger;
  #240 = Utf8               LOGGER
  #241 = Utf8               Ljava/util/logging/Logger;
  #242 = Methodref          #47.#243      // java/lang/System.currentTimeMillis:()J
  #243 = NameAndType        #244:#245     // currentTimeMillis:()J
  #244 = Utf8               currentTimeMillis
  #245 = Utf8               ()J
  #246 = Fieldref           #15.#247      // ext/mods/commons/gui/InterfaceGSInfo.START_TIME:J
  #247 = NameAndType        #248:#249     // START_TIME:J
  #248 = Utf8               START_TIME
  #249 = Utf8               J
  #250 = Utf8               serialVersionUID
  #251 = Utf8               ConstantValue
  #252 = Long               1l
  #254 = Utf8               Code
  #255 = Utf8               LineNumberTable
  #256 = Utf8               LocalVariableTable
  #257 = Utf8               this
  #258 = Utf8               Lext/mods/commons/gui/InterfaceGSInfo;
  #259 = Utf8               label
  #260 = Utf8               Ljava/lang/String;
  #261 = Utf8               value
  #262 = Utf8               row
  #263 = Utf8               formatMemorySize
  #264 = Utf8               bytes
  #265 = Utf8               exp
  #266 = Utf8               I
  #267 = Utf8               pre
  #268 = Utf8               C
  #269 = Utf8               size
  #270 = Utf8               D
  #271 = Utf8               StackMapTable
  #272 = Utf8               getDurationBreakdown
  #273 = Utf8               millis
  #274 = Utf8               remaining
  #275 = Utf8               days
  #276 = Utf8               hours
  #277 = Utf8               minutes
  #278 = Utf8               seconds
  #279 = Utf8               <clinit>
  #280 = Utf8               SourceFile
  #281 = Utf8               InterfaceGSInfo.java
  #282 = Utf8               NestMembers
  #283 = Utf8               BootstrapMethods
  #284 = String             #285          // \u0001 B
  #285 = Utf8               \u0001 B
  #286 = MethodHandle       6:#287        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #287 = Methodref          #288.#289     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #288 = Class              #290          // java/lang/invoke/StringConcatFactory
  #289 = NameAndType        #145:#291     // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #290 = Utf8               java/lang/invoke/StringConcatFactory
  #291 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #292 = Utf8               InnerClasses
  #293 = Utf8               SectionPanel
  #294 = Utf8               InfoRow
  #295 = Utf8               MetricBar
  #296 = Class              #297          // java/lang/invoke/MethodHandles$Lookup
  #297 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #298 = Class              #299          // java/lang/invoke/MethodHandles
  #299 = Utf8               java/lang/invoke/MethodHandles
  #300 = Utf8               Lookup
{
  protected static final java.util.logging.Logger LOGGER;
    descriptor: Ljava/util/logging/Logger;
    flags: (0x001c) ACC_PROTECTED, ACC_STATIC, ACC_FINAL

  protected static final long START_TIME;
    descriptor: J
    flags: (0x001c) ACC_PROTECTED, ACC_STATIC, ACC_FINAL

  public ext.mods.commons.gui.InterfaceGSInfo();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=1, args_size=1
         0: aload_0
         1: ldc           #1                  // String General Status
         3: invokespecial #3                  // Method ext/mods/commons/gui/ModernUI$SectionPanel."<init>":(Ljava/lang/String;)V
         6: aload_0
         7: new           #9                  // class javax/swing/BoxLayout
        10: dup
        11: aload_0
        12: iconst_1
        13: invokespecial #11                 // Method javax/swing/BoxLayout."<init>":(Ljava/awt/Container;I)V
        16: invokevirtual #14                 // Method setLayout:(Ljava/awt/LayoutManager;)V
        19: aload_0
        20: iconst_5
        21: invokestatic  #20                 // Method javax/swing/Box.createVerticalStrut:(I)Ljava/awt/Component;
        24: invokevirtual #26                 // Method add:(Ljava/awt/Component;)Ljava/awt/Component;
        27: pop
        28: aload_0
        29: aload_0
        30: ldc           #30                 // String Version
        32: ldc           #32                 // String 2.9.7
        34: invokevirtual #34                 // Method addInfoRow:(Ljava/lang/String;Ljava/lang/String;)Lext/mods/commons/gui/InterfaceGSInfo$InfoRow;
        37: putfield      #38                 // Field rowVersion:Lext/mods/commons/gui/InterfaceGSInfo$InfoRow;
        40: aload_0
        41: aload_0
        42: ldc           #42                 // String Build JDK
        44: ldc           #44                 // String java.version
        46: invokestatic  #46                 // Method java/lang/System.getProperty:(Ljava/lang/String;)Ljava/lang/String;
        49: invokevirtual #34                 // Method addInfoRow:(Ljava/lang/String;Ljava/lang/String;)Lext/mods/commons/gui/InterfaceGSInfo$InfoRow;
        52: putfield      #52                 // Field rowJava:Lext/mods/commons/gui/InterfaceGSInfo$InfoRow;
        55: aload_0
        56: aload_0
        57: ldc           #55                 // String Hwid Protocol
        59: ldc           #57                 // String Loading...
        61: invokevirtual #34                 // Method addInfoRow:(Ljava/lang/String;Ljava/lang/String;)Lext/mods/commons/gui/InterfaceGSInfo$InfoRow;
        64: putfield      #59                 // Field rowProtocol:Lext/mods/commons/gui/InterfaceGSInfo$InfoRow;
        67: aload_0
        68: aload_0
        69: ldc           #62                 // String Online Players
        71: ldc           #64                 // String 0
        73: invokevirtual #34                 // Method addInfoRow:(Ljava/lang/String;Ljava/lang/String;)Lext/mods/commons/gui/InterfaceGSInfo$InfoRow;
        76: putfield      #66                 // Field rowPlayers:Lext/mods/commons/gui/InterfaceGSInfo$InfoRow;
        79: aload_0
        80: aload_0
        81: ldc           #69                 // String Elapsed
        83: ldc           #71                 // String 00:00:00
        85: invokevirtual #34                 // Method addInfoRow:(Ljava/lang/String;Ljava/lang/String;)Lext/mods/commons/gui/InterfaceGSInfo$InfoRow;
        88: putfield      #73                 // Field rowUptime:Lext/mods/commons/gui/InterfaceGSInfo$InfoRow;
        91: aload_0
        92: aload_0
        93: ldc           #76                 // String Offline Trade
        95: ldc           #64                 // String 0
        97: invokevirtual #34                 // Method addInfoRow:(Ljava/lang/String;Ljava/lang/String;)Lext/mods/commons/gui/InterfaceGSInfo$InfoRow;
       100: putfield      #78                 // Field rowOffline:Lext/mods/commons/gui/InterfaceGSInfo$InfoRow;
       103: aload_0
       104: bipush        12
       106: invokestatic  #20                 // Method javax/swing/Box.createVerticalStrut:(I)Ljava/awt/Component;
       109: invokevirtual #26                 // Method add:(Ljava/awt/Component;)Ljava/awt/Component;
       112: pop
       113: aload_0
       114: new           #81                 // class ext/mods/commons/gui/InterfaceGSInfo$MetricBar
       117: dup
       118: getstatic     #83                 // Field ext/mods/commons/gui/ModernUI.NEON_GREEN:Ljava/awt/Color;
       121: getstatic     #89                 // Field ext/mods/commons/gui/ModernUI.NEON_CYAN:Ljava/awt/Color;
       124: invokespecial #92                 // Method ext/mods/commons/gui/InterfaceGSInfo$MetricBar."<init>":(Ljava/awt/Color;Ljava/awt/Color;)V
       127: putfield      #95                 // Field barMemory:Lext/mods/commons/gui/InterfaceGSInfo$MetricBar;
       130: aload_0
       131: aload_0
       132: getfield      #95                 // Field barMemory:Lext/mods/commons/gui/InterfaceGSInfo$MetricBar;
       135: invokevirtual #26                 // Method add:(Ljava/awt/Component;)Ljava/awt/Component;
       138: pop
       139: aload_0
       140: invokestatic  #99                 // Method javax/swing/Box.createVerticalGlue:()Ljava/awt/Component;
       143: invokevirtual #26                 // Method add:(Ljava/awt/Component;)Ljava/awt/Component;
       146: pop
       147: aload_0
       148: invokevirtual #103                // Method startUpdateTask:()V
       151: return
      LineNumberTable:
        line 56: 0
        line 57: 6
        line 59: 19
        line 61: 28
        line 62: 40
        line 63: 55
        line 64: 67
        line 65: 79
        line 66: 91
        line 68: 103
        line 70: 113
        line 71: 130
        line 73: 139
        line 75: 147
        line 76: 151
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     152     0  this   Lext/mods/commons/gui/InterfaceGSInfo;

  static java.lang.String formatMemorySize(long);
    descriptor: (J)Ljava/lang/String;
    flags: (0x0008) ACC_STATIC
    Code:
      stack=6, locals=6, args_size=1
         0: lload_0
         1: ldc2_w        #141                // long 1024l
         4: lcmp
         5: ifge          15
         8: lload_0
         9: invokedynamic #143,  0            // InvokeDynamic #0:makeConcatWithConstants:(J)Ljava/lang/String;
        14: areturn
        15: lload_0
        16: l2d
        17: invokestatic  #147                // Method java/lang/Math.log:(D)D
        20: ldc2_w        #153                // double 1024.0d
        23: invokestatic  #147                // Method java/lang/Math.log:(D)D
        26: ddiv
        27: d2i
        28: istore_2
        29: ldc           #155                // String KMGTPE
        31: iload_2
        32: iconst_1
        33: isub
        34: invokevirtual #157                // Method java/lang/String.charAt:(I)C
        37: istore_3
        38: lload_0
        39: l2d
        40: ldc2_w        #153                // double 1024.0d
        43: iload_2
        44: i2d
        45: invokestatic  #163                // Method java/lang/Math.pow:(DD)D
        48: ddiv
        49: dstore        4
        51: iload_2
        52: iconst_1
        53: if_icmpne     61
        56: ldc           #167                // String %.0f %sB
        58: goto          63
        61: ldc           #169                // String %.2f %sB
        63: iconst_2
        64: anewarray     #171                // class java/lang/Object
        67: dup
        68: iconst_0
        69: dload         4
        71: invokestatic  #173                // Method java/lang/Double.valueOf:(D)Ljava/lang/Double;
        74: aastore
        75: dup
        76: iconst_1
        77: iload_3
        78: invokestatic  #179                // Method java/lang/Character.valueOf:(C)Ljava/lang/Character;
        81: aastore
        82: invokestatic  #184                // Method java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        85: areturn
      LineNumberTable:
        line 129: 0
        line 130: 15
        line 131: 29
        line 132: 38
        line 133: 51
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      86     0 bytes   J
           29      57     2   exp   I
           38      48     3   pre   C
           51      35     4  size   D
      StackMapTable: number_of_entries = 3
        frame_type = 15 /* same */
        frame_type = 254 /* append */
          offset_delta = 45
          locals = [ int, int, double ]
        frame_type = 65 /* same_locals_1_stack_item */
          stack = [ class java/lang/String ]

  static java.lang.String getDurationBreakdown(long);
    descriptor: (J)Ljava/lang/String;
    flags: (0x0008) ACC_STATIC
    Code:
      stack=6, locals=12, args_size=1
         0: lload_0
         1: lstore_2
         2: getstatic     #188                // Field java/util/concurrent/TimeUnit.MILLISECONDS:Ljava/util/concurrent/TimeUnit;
         5: lload_2
         6: invokevirtual #194                // Method java/util/concurrent/TimeUnit.toDays:(J)J
         9: lstore        4
        11: lload_2
        12: getstatic     #198                // Field java/util/concurrent/TimeUnit.DAYS:Ljava/util/concurrent/TimeUnit;
        15: lload         4
        17: invokevirtual #201                // Method java/util/concurrent/TimeUnit.toMillis:(J)J
        20: lsub
        21: lstore_2
        22: getstatic     #188                // Field java/util/concurrent/TimeUnit.MILLISECONDS:Ljava/util/concurrent/TimeUnit;
        25: lload_2
        26: invokevirtual #204                // Method java/util/concurrent/TimeUnit.toHours:(J)J
        29: lstore        6
        31: lload_2
        32: getstatic     #207                // Field java/util/concurrent/TimeUnit.HOURS:Ljava/util/concurrent/TimeUnit;
        35: lload         6
        37: invokevirtual #201                // Method java/util/concurrent/TimeUnit.toMillis:(J)J
        40: lsub
        41: lstore_2
        42: getstatic     #188                // Field java/util/concurrent/TimeUnit.MILLISECONDS:Ljava/util/concurrent/TimeUnit;
        45: lload_2
        46: invokevirtual #210                // Method java/util/concurrent/TimeUnit.toMinutes:(J)J
        49: lstore        8
        51: lload_2
        52: getstatic     #213                // Field java/util/concurrent/TimeUnit.MINUTES:Ljava/util/concurrent/TimeUnit;
        55: lload         8
        57: invokevirtual #201                // Method java/util/concurrent/TimeUnit.toMillis:(J)J
        60: lsub
        61: lstore_2
        62: getstatic     #188                // Field java/util/concurrent/TimeUnit.MILLISECONDS:Ljava/util/concurrent/TimeUnit;
        65: lload_2
        66: invokevirtual #216                // Method java/util/concurrent/TimeUnit.toSeconds:(J)J
        69: lstore        10
        71: ldc           #219                // String %dd %02dh %02dm %02ds
        73: iconst_4
        74: anewarray     #171                // class java/lang/Object
        77: dup
        78: iconst_0
        79: lload         4
        81: invokestatic  #221                // Method java/lang/Long.valueOf:(J)Ljava/lang/Long;
        84: aastore
        85: dup
        86: iconst_1
        87: lload         6
        89: invokestatic  #221                // Method java/lang/Long.valueOf:(J)Ljava/lang/Long;
        92: aastore
        93: dup
        94: iconst_2
        95: lload         8
        97: invokestatic  #221                // Method java/lang/Long.valueOf:(J)Ljava/lang/Long;
       100: aastore
       101: dup
       102: iconst_3
       103: lload         10
       105: invokestatic  #221                // Method java/lang/Long.valueOf:(J)Ljava/lang/Long;
       108: aastore
       109: invokestatic  #184                // Method java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
       112: areturn
      LineNumberTable:
        line 137: 0
        line 138: 2
        line 139: 11
        line 140: 22
        line 141: 31
        line 142: 42
        line 143: 51
        line 144: 62
        line 145: 71
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     113     0 millis   J
            2     111     2 remaining   J
           11     102     4  days   J
           31      82     6 hours   J
           51      62     8 minutes   J
           71      42    10 seconds   J

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=2, locals=0, args_size=0
         0: ldc           #15                 // class ext/mods/commons/gui/InterfaceGSInfo
         2: invokevirtual #226                // Method java/lang/Class.getName:()Ljava/lang/String;
         5: invokestatic  #232                // Method java/util/logging/Logger.getLogger:(Ljava/lang/String;)Ljava/util/logging/Logger;
         8: putstatic     #238                // Field LOGGER:Ljava/util/logging/Logger;
        11: invokestatic  #242                // Method java/lang/System.currentTimeMillis:()J
        14: putstatic     #246                // Field START_TIME:J
        17: return
      LineNumberTable:
        line 44: 0
        line 45: 11
}
SourceFile: "InterfaceGSInfo.java"
NestMembers:
  ext/mods/commons/gui/InterfaceGSInfo$MetricBar
  ext/mods/commons/gui/InterfaceGSInfo$InfoRow
  ext/mods/commons/gui/InterfaceGSInfo$2
  ext/mods/commons/gui/InterfaceGSInfo$1
BootstrapMethods:
  0: #286 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #284 \u0001 B
InnerClasses:
  public static #293= #4 of #84;          // SectionPanel=class ext/mods/commons/gui/ModernUI$SectionPanel of class ext/mods/commons/gui/ModernUI
  #119;                                   // class ext/mods/commons/gui/InterfaceGSInfo$1
  #132;                                   // class ext/mods/commons/gui/InterfaceGSInfo$2
  public static final #300= #296 of #298; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
