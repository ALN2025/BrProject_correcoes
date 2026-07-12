// Bytecode for: ext.mods.commons.gui.InterfaceLSInfo
// File: ext\mods\commons\gui\InterfaceLSInfo.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/commons/gui/InterfaceLSInfo.class
  Last modified 9 de jul de 2026; size 4539 bytes
  MD5 checksum 6b96be9d72b003dbb852755bcda3077d
  Compiled from "InterfaceLSInfo.java"
public class ext.mods.commons.gui.InterfaceLSInfo extends ext.mods.commons.gui.ModernUI$SectionPanel
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #15                         // ext/mods/commons/gui/InterfaceLSInfo
  super_class: #4                         // ext/mods/commons/gui/ModernUI$SectionPanel
  interfaces: 0, fields: 9, methods: 6, attributes: 4
Constant pool:
    #1 = String             #2            // Login Status
    #2 = Utf8               Login Status
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
   #14 = Methodref          #15.#16       // ext/mods/commons/gui/InterfaceLSInfo.setLayout:(Ljava/awt/LayoutManager;)V
   #15 = Class              #17           // ext/mods/commons/gui/InterfaceLSInfo
   #16 = NameAndType        #18:#19       // setLayout:(Ljava/awt/LayoutManager;)V
   #17 = Utf8               ext/mods/commons/gui/InterfaceLSInfo
   #18 = Utf8               setLayout
   #19 = Utf8               (Ljava/awt/LayoutManager;)V
   #20 = Methodref          #21.#22       // javax/swing/Box.createVerticalStrut:(I)Ljava/awt/Component;
   #21 = Class              #23           // javax/swing/Box
   #22 = NameAndType        #24:#25       // createVerticalStrut:(I)Ljava/awt/Component;
   #23 = Utf8               javax/swing/Box
   #24 = Utf8               createVerticalStrut
   #25 = Utf8               (I)Ljava/awt/Component;
   #26 = Methodref          #15.#27       // ext/mods/commons/gui/InterfaceLSInfo.add:(Ljava/awt/Component;)Ljava/awt/Component;
   #27 = NameAndType        #28:#29       // add:(Ljava/awt/Component;)Ljava/awt/Component;
   #28 = Utf8               add
   #29 = Utf8               (Ljava/awt/Component;)Ljava/awt/Component;
   #30 = String             #31           // GS Link
   #31 = Utf8               GS Link
   #32 = String             #33           // Searching...
   #33 = Utf8               Searching...
   #34 = Methodref          #15.#35       // ext/mods/commons/gui/InterfaceLSInfo.addInfoRow:(Ljava/lang/String;Ljava/lang/String;)Lext/mods/commons/gui/InterfaceLSInfo$InfoRow;
   #35 = NameAndType        #36:#37       // addInfoRow:(Ljava/lang/String;Ljava/lang/String;)Lext/mods/commons/gui/InterfaceLSInfo$InfoRow;
   #36 = Utf8               addInfoRow
   #37 = Utf8               (Ljava/lang/String;Ljava/lang/String;)Lext/mods/commons/gui/InterfaceLSInfo$InfoRow;
   #38 = Fieldref           #15.#39       // ext/mods/commons/gui/InterfaceLSInfo.rowGSLink:Lext/mods/commons/gui/InterfaceLSInfo$InfoRow;
   #39 = NameAndType        #40:#41       // rowGSLink:Lext/mods/commons/gui/InterfaceLSInfo$InfoRow;
   #40 = Utf8               rowGSLink
   #41 = Utf8               Lext/mods/commons/gui/InterfaceLSInfo$InfoRow;
   #42 = String             #43           // Auth Sessions
   #43 = Utf8               Auth Sessions
   #44 = String             #45           // 0
   #45 = Utf8               0
   #46 = Fieldref           #15.#47       // ext/mods/commons/gui/InterfaceLSInfo.rowSessions:Lext/mods/commons/gui/InterfaceLSInfo$InfoRow;
   #47 = NameAndType        #48:#41       // rowSessions:Lext/mods/commons/gui/InterfaceLSInfo$InfoRow;
   #48 = Utf8               rowSessions
   #49 = String             #50           // Total Accs
   #50 = Utf8               Total Accs
   #51 = String             #52           // Loading...
   #52 = Utf8               Loading...
   #53 = Fieldref           #15.#54       // ext/mods/commons/gui/InterfaceLSInfo.rowAccounts:Lext/mods/commons/gui/InterfaceLSInfo$InfoRow;
   #54 = NameAndType        #55:#41       // rowAccounts:Lext/mods/commons/gui/InterfaceLSInfo$InfoRow;
   #55 = Utf8               rowAccounts
   #56 = String             #57           // Banned IPs
   #57 = Utf8               Banned IPs
   #58 = Fieldref           #15.#59       // ext/mods/commons/gui/InterfaceLSInfo.rowBannedIPs:Lext/mods/commons/gui/InterfaceLSInfo$InfoRow;
   #59 = NameAndType        #60:#41       // rowBannedIPs:Lext/mods/commons/gui/InterfaceLSInfo$InfoRow;
   #60 = Utf8               rowBannedIPs
   #61 = String             #62           // Elapsed
   #62 = Utf8               Elapsed
   #63 = String             #64           // 00:00:00
   #64 = Utf8               00:00:00
   #65 = Fieldref           #15.#66       // ext/mods/commons/gui/InterfaceLSInfo.rowUptime:Lext/mods/commons/gui/InterfaceLSInfo$InfoRow;
   #66 = NameAndType        #67:#41       // rowUptime:Lext/mods/commons/gui/InterfaceLSInfo$InfoRow;
   #67 = Utf8               rowUptime
   #68 = Class              #69           // ext/mods/commons/gui/InterfaceLSInfo$MetricBar
   #69 = Utf8               ext/mods/commons/gui/InterfaceLSInfo$MetricBar
   #70 = Fieldref           #71.#72       // ext/mods/commons/gui/ModernUI.NEON_PURPLE:Ljava/awt/Color;
   #71 = Class              #73           // ext/mods/commons/gui/ModernUI
   #72 = NameAndType        #74:#75       // NEON_PURPLE:Ljava/awt/Color;
   #73 = Utf8               ext/mods/commons/gui/ModernUI
   #74 = Utf8               NEON_PURPLE
   #75 = Utf8               Ljava/awt/Color;
   #76 = Methodref          #68.#77       // ext/mods/commons/gui/InterfaceLSInfo$MetricBar."<init>":(Ljava/awt/Color;Ljava/awt/Color;)V
   #77 = NameAndType        #7:#78        // "<init>":(Ljava/awt/Color;Ljava/awt/Color;)V
   #78 = Utf8               (Ljava/awt/Color;Ljava/awt/Color;)V
   #79 = Fieldref           #15.#80       // ext/mods/commons/gui/InterfaceLSInfo.barMemory:Lext/mods/commons/gui/InterfaceLSInfo$MetricBar;
   #80 = NameAndType        #81:#82       // barMemory:Lext/mods/commons/gui/InterfaceLSInfo$MetricBar;
   #81 = Utf8               barMemory
   #82 = Utf8               Lext/mods/commons/gui/InterfaceLSInfo$MetricBar;
   #83 = Methodref          #21.#84       // javax/swing/Box.createVerticalGlue:()Ljava/awt/Component;
   #84 = NameAndType        #85:#86       // createVerticalGlue:()Ljava/awt/Component;
   #85 = Utf8               createVerticalGlue
   #86 = Utf8               ()Ljava/awt/Component;
   #87 = Methodref          #15.#88       // ext/mods/commons/gui/InterfaceLSInfo.startUpdateTask:()V
   #88 = NameAndType        #89:#90       // startUpdateTask:()V
   #89 = Utf8               startUpdateTask
   #90 = Utf8               ()V
   #91 = Class              #92           // ext/mods/commons/gui/InterfaceLSInfo$InfoRow
   #92 = Utf8               ext/mods/commons/gui/InterfaceLSInfo$InfoRow
   #93 = Methodref          #91.#94       // ext/mods/commons/gui/InterfaceLSInfo$InfoRow."<init>":(Ljava/lang/String;Ljava/lang/String;)V
   #94 = NameAndType        #7:#95        // "<init>":(Ljava/lang/String;Ljava/lang/String;)V
   #95 = Utf8               (Ljava/lang/String;Ljava/lang/String;)V
   #96 = Class              #97           // java/util/Timer
   #97 = Utf8               java/util/Timer
   #98 = String             #99           // LSInfo-Updater
   #99 = Utf8               LSInfo-Updater
  #100 = Methodref          #96.#101      // java/util/Timer."<init>":(Ljava/lang/String;Z)V
  #101 = NameAndType        #7:#102       // "<init>":(Ljava/lang/String;Z)V
  #102 = Utf8               (Ljava/lang/String;Z)V
  #103 = Class              #104          // ext/mods/commons/gui/InterfaceLSInfo$1
  #104 = Utf8               ext/mods/commons/gui/InterfaceLSInfo$1
  #105 = Methodref          #103.#106     // ext/mods/commons/gui/InterfaceLSInfo$1."<init>":(Lext/mods/commons/gui/InterfaceLSInfo;)V
  #106 = NameAndType        #7:#107       // "<init>":(Lext/mods/commons/gui/InterfaceLSInfo;)V
  #107 = Utf8               (Lext/mods/commons/gui/InterfaceLSInfo;)V
  #108 = Long               1000l
  #110 = Methodref          #96.#111      // java/util/Timer.scheduleAtFixedRate:(Ljava/util/TimerTask;JJ)V
  #111 = NameAndType        #112:#113     // scheduleAtFixedRate:(Ljava/util/TimerTask;JJ)V
  #112 = Utf8               scheduleAtFixedRate
  #113 = Utf8               (Ljava/util/TimerTask;JJ)V
  #114 = Long               1024l
  #116 = InvokeDynamic      #0:#117       // #0:makeConcatWithConstants:(J)Ljava/lang/String;
  #117 = NameAndType        #118:#119     // makeConcatWithConstants:(J)Ljava/lang/String;
  #118 = Utf8               makeConcatWithConstants
  #119 = Utf8               (J)Ljava/lang/String;
  #120 = Methodref          #121.#122     // java/lang/Math.log:(D)D
  #121 = Class              #123          // java/lang/Math
  #122 = NameAndType        #124:#125     // log:(D)D
  #123 = Utf8               java/lang/Math
  #124 = Utf8               log
  #125 = Utf8               (D)D
  #126 = Double             1024.0d
  #128 = String             #129          // KMGTPE
  #129 = Utf8               KMGTPE
  #130 = Methodref          #131.#132     // java/lang/String.charAt:(I)C
  #131 = Class              #133          // java/lang/String
  #132 = NameAndType        #134:#135     // charAt:(I)C
  #133 = Utf8               java/lang/String
  #134 = Utf8               charAt
  #135 = Utf8               (I)C
  #136 = Methodref          #121.#137     // java/lang/Math.pow:(DD)D
  #137 = NameAndType        #138:#139     // pow:(DD)D
  #138 = Utf8               pow
  #139 = Utf8               (DD)D
  #140 = String             #141          // %.0f %sB
  #141 = Utf8               %.0f %sB
  #142 = String             #143          // %.2f %sB
  #143 = Utf8               %.2f %sB
  #144 = Class              #145          // java/lang/Object
  #145 = Utf8               java/lang/Object
  #146 = Methodref          #147.#148     // java/lang/Double.valueOf:(D)Ljava/lang/Double;
  #147 = Class              #149          // java/lang/Double
  #148 = NameAndType        #150:#151     // valueOf:(D)Ljava/lang/Double;
  #149 = Utf8               java/lang/Double
  #150 = Utf8               valueOf
  #151 = Utf8               (D)Ljava/lang/Double;
  #152 = Methodref          #153.#154     // java/lang/Character.valueOf:(C)Ljava/lang/Character;
  #153 = Class              #155          // java/lang/Character
  #154 = NameAndType        #150:#156     // valueOf:(C)Ljava/lang/Character;
  #155 = Utf8               java/lang/Character
  #156 = Utf8               (C)Ljava/lang/Character;
  #157 = Methodref          #131.#158     // java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
  #158 = NameAndType        #159:#160     // format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
  #159 = Utf8               format
  #160 = Utf8               (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
  #161 = Fieldref           #162.#163     // java/util/concurrent/TimeUnit.MILLISECONDS:Ljava/util/concurrent/TimeUnit;
  #162 = Class              #164          // java/util/concurrent/TimeUnit
  #163 = NameAndType        #165:#166     // MILLISECONDS:Ljava/util/concurrent/TimeUnit;
  #164 = Utf8               java/util/concurrent/TimeUnit
  #165 = Utf8               MILLISECONDS
  #166 = Utf8               Ljava/util/concurrent/TimeUnit;
  #167 = Methodref          #162.#168     // java/util/concurrent/TimeUnit.toDays:(J)J
  #168 = NameAndType        #169:#170     // toDays:(J)J
  #169 = Utf8               toDays
  #170 = Utf8               (J)J
  #171 = Fieldref           #162.#172     // java/util/concurrent/TimeUnit.DAYS:Ljava/util/concurrent/TimeUnit;
  #172 = NameAndType        #173:#166     // DAYS:Ljava/util/concurrent/TimeUnit;
  #173 = Utf8               DAYS
  #174 = Methodref          #162.#175     // java/util/concurrent/TimeUnit.toMillis:(J)J
  #175 = NameAndType        #176:#170     // toMillis:(J)J
  #176 = Utf8               toMillis
  #177 = Methodref          #162.#178     // java/util/concurrent/TimeUnit.toHours:(J)J
  #178 = NameAndType        #179:#170     // toHours:(J)J
  #179 = Utf8               toHours
  #180 = Fieldref           #162.#181     // java/util/concurrent/TimeUnit.HOURS:Ljava/util/concurrent/TimeUnit;
  #181 = NameAndType        #182:#166     // HOURS:Ljava/util/concurrent/TimeUnit;
  #182 = Utf8               HOURS
  #183 = Methodref          #162.#184     // java/util/concurrent/TimeUnit.toMinutes:(J)J
  #184 = NameAndType        #185:#170     // toMinutes:(J)J
  #185 = Utf8               toMinutes
  #186 = Fieldref           #162.#187     // java/util/concurrent/TimeUnit.MINUTES:Ljava/util/concurrent/TimeUnit;
  #187 = NameAndType        #188:#166     // MINUTES:Ljava/util/concurrent/TimeUnit;
  #188 = Utf8               MINUTES
  #189 = Methodref          #162.#190     // java/util/concurrent/TimeUnit.toSeconds:(J)J
  #190 = NameAndType        #191:#170     // toSeconds:(J)J
  #191 = Utf8               toSeconds
  #192 = String             #193          // %dd %02dh %02dm %02ds
  #193 = Utf8               %dd %02dh %02dm %02ds
  #194 = Methodref          #195.#196     // java/lang/Long.valueOf:(J)Ljava/lang/Long;
  #195 = Class              #197          // java/lang/Long
  #196 = NameAndType        #150:#198     // valueOf:(J)Ljava/lang/Long;
  #197 = Utf8               java/lang/Long
  #198 = Utf8               (J)Ljava/lang/Long;
  #199 = Methodref          #200.#201     // java/lang/Class.getName:()Ljava/lang/String;
  #200 = Class              #202          // java/lang/Class
  #201 = NameAndType        #203:#204     // getName:()Ljava/lang/String;
  #202 = Utf8               java/lang/Class
  #203 = Utf8               getName
  #204 = Utf8               ()Ljava/lang/String;
  #205 = Methodref          #206.#207     // java/util/logging/Logger.getLogger:(Ljava/lang/String;)Ljava/util/logging/Logger;
  #206 = Class              #208          // java/util/logging/Logger
  #207 = NameAndType        #209:#210     // getLogger:(Ljava/lang/String;)Ljava/util/logging/Logger;
  #208 = Utf8               java/util/logging/Logger
  #209 = Utf8               getLogger
  #210 = Utf8               (Ljava/lang/String;)Ljava/util/logging/Logger;
  #211 = Fieldref           #15.#212      // ext/mods/commons/gui/InterfaceLSInfo.LOGGER:Ljava/util/logging/Logger;
  #212 = NameAndType        #213:#214     // LOGGER:Ljava/util/logging/Logger;
  #213 = Utf8               LOGGER
  #214 = Utf8               Ljava/util/logging/Logger;
  #215 = Methodref          #216.#217     // java/lang/System.currentTimeMillis:()J
  #216 = Class              #218          // java/lang/System
  #217 = NameAndType        #219:#220     // currentTimeMillis:()J
  #218 = Utf8               java/lang/System
  #219 = Utf8               currentTimeMillis
  #220 = Utf8               ()J
  #221 = Fieldref           #15.#222      // ext/mods/commons/gui/InterfaceLSInfo.START_TIME:J
  #222 = NameAndType        #223:#224     // START_TIME:J
  #223 = Utf8               START_TIME
  #224 = Utf8               J
  #225 = Utf8               serialVersionUID
  #226 = Utf8               ConstantValue
  #227 = Long               1l
  #229 = Utf8               Code
  #230 = Utf8               LineNumberTable
  #231 = Utf8               LocalVariableTable
  #232 = Utf8               this
  #233 = Utf8               Lext/mods/commons/gui/InterfaceLSInfo;
  #234 = Utf8               label
  #235 = Utf8               Ljava/lang/String;
  #236 = Utf8               value
  #237 = Utf8               row
  #238 = Utf8               formatMemorySize
  #239 = Utf8               bytes
  #240 = Utf8               exp
  #241 = Utf8               I
  #242 = Utf8               pre
  #243 = Utf8               C
  #244 = Utf8               size
  #245 = Utf8               D
  #246 = Utf8               StackMapTable
  #247 = Utf8               getDurationBreakdown
  #248 = Utf8               millis
  #249 = Utf8               remaining
  #250 = Utf8               days
  #251 = Utf8               hours
  #252 = Utf8               minutes
  #253 = Utf8               seconds
  #254 = Utf8               <clinit>
  #255 = Utf8               SourceFile
  #256 = Utf8               InterfaceLSInfo.java
  #257 = Utf8               NestMembers
  #258 = Utf8               BootstrapMethods
  #259 = String             #260          // \u0001 B
  #260 = Utf8               \u0001 B
  #261 = MethodHandle       6:#262        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #262 = Methodref          #263.#264     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #263 = Class              #265          // java/lang/invoke/StringConcatFactory
  #264 = NameAndType        #118:#266     // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #265 = Utf8               java/lang/invoke/StringConcatFactory
  #266 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #267 = Utf8               InnerClasses
  #268 = Utf8               SectionPanel
  #269 = Utf8               InfoRow
  #270 = Utf8               MetricBar
  #271 = Class              #272          // java/lang/invoke/MethodHandles$Lookup
  #272 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #273 = Class              #274          // java/lang/invoke/MethodHandles
  #274 = Utf8               java/lang/invoke/MethodHandles
  #275 = Utf8               Lookup
{
  protected static final java.util.logging.Logger LOGGER;
    descriptor: Ljava/util/logging/Logger;
    flags: (0x001c) ACC_PROTECTED, ACC_STATIC, ACC_FINAL

  protected static final long START_TIME;
    descriptor: J
    flags: (0x001c) ACC_PROTECTED, ACC_STATIC, ACC_FINAL

  public ext.mods.commons.gui.InterfaceLSInfo();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=1, args_size=1
         0: aload_0
         1: ldc           #1                  // String Login Status
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
        30: ldc           #30                 // String GS Link
        32: ldc           #32                 // String Searching...
        34: invokevirtual #34                 // Method addInfoRow:(Ljava/lang/String;Ljava/lang/String;)Lext/mods/commons/gui/InterfaceLSInfo$InfoRow;
        37: putfield      #38                 // Field rowGSLink:Lext/mods/commons/gui/InterfaceLSInfo$InfoRow;
        40: aload_0
        41: aload_0
        42: ldc           #42                 // String Auth Sessions
        44: ldc           #44                 // String 0
        46: invokevirtual #34                 // Method addInfoRow:(Ljava/lang/String;Ljava/lang/String;)Lext/mods/commons/gui/InterfaceLSInfo$InfoRow;
        49: putfield      #46                 // Field rowSessions:Lext/mods/commons/gui/InterfaceLSInfo$InfoRow;
        52: aload_0
        53: aload_0
        54: ldc           #49                 // String Total Accs
        56: ldc           #51                 // String Loading...
        58: invokevirtual #34                 // Method addInfoRow:(Ljava/lang/String;Ljava/lang/String;)Lext/mods/commons/gui/InterfaceLSInfo$InfoRow;
        61: putfield      #53                 // Field rowAccounts:Lext/mods/commons/gui/InterfaceLSInfo$InfoRow;
        64: aload_0
        65: aload_0
        66: ldc           #56                 // String Banned IPs
        68: ldc           #44                 // String 0
        70: invokevirtual #34                 // Method addInfoRow:(Ljava/lang/String;Ljava/lang/String;)Lext/mods/commons/gui/InterfaceLSInfo$InfoRow;
        73: putfield      #58                 // Field rowBannedIPs:Lext/mods/commons/gui/InterfaceLSInfo$InfoRow;
        76: aload_0
        77: aload_0
        78: ldc           #61                 // String Elapsed
        80: ldc           #63                 // String 00:00:00
        82: invokevirtual #34                 // Method addInfoRow:(Ljava/lang/String;Ljava/lang/String;)Lext/mods/commons/gui/InterfaceLSInfo$InfoRow;
        85: putfield      #65                 // Field rowUptime:Lext/mods/commons/gui/InterfaceLSInfo$InfoRow;
        88: aload_0
        89: bipush        12
        91: invokestatic  #20                 // Method javax/swing/Box.createVerticalStrut:(I)Ljava/awt/Component;
        94: invokevirtual #26                 // Method add:(Ljava/awt/Component;)Ljava/awt/Component;
        97: pop
        98: aload_0
        99: new           #68                 // class ext/mods/commons/gui/InterfaceLSInfo$MetricBar
       102: dup
       103: getstatic     #70                 // Field ext/mods/commons/gui/ModernUI.NEON_PURPLE:Ljava/awt/Color;
       106: getstatic     #70                 // Field ext/mods/commons/gui/ModernUI.NEON_PURPLE:Ljava/awt/Color;
       109: invokespecial #76                 // Method ext/mods/commons/gui/InterfaceLSInfo$MetricBar."<init>":(Ljava/awt/Color;Ljava/awt/Color;)V
       112: putfield      #79                 // Field barMemory:Lext/mods/commons/gui/InterfaceLSInfo$MetricBar;
       115: aload_0
       116: aload_0
       117: getfield      #79                 // Field barMemory:Lext/mods/commons/gui/InterfaceLSInfo$MetricBar;
       120: invokevirtual #26                 // Method add:(Ljava/awt/Component;)Ljava/awt/Component;
       123: pop
       124: aload_0
       125: invokestatic  #83                 // Method javax/swing/Box.createVerticalGlue:()Ljava/awt/Component;
       128: invokevirtual #26                 // Method add:(Ljava/awt/Component;)Ljava/awt/Component;
       131: pop
       132: aload_0
       133: invokevirtual #87                 // Method startUpdateTask:()V
       136: return
      LineNumberTable:
        line 55: 0
        line 56: 6
        line 58: 19
        line 60: 28
        line 61: 40
        line 62: 52
        line 63: 64
        line 64: 76
        line 66: 88
        line 68: 98
        line 69: 115
        line 71: 124
        line 73: 132
        line 74: 136
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     137     0  this   Lext/mods/commons/gui/InterfaceLSInfo;

  static java.lang.String formatMemorySize(long);
    descriptor: (J)Ljava/lang/String;
    flags: (0x0008) ACC_STATIC
    Code:
      stack=6, locals=6, args_size=1
         0: lload_0
         1: ldc2_w        #114                // long 1024l
         4: lcmp
         5: ifge          15
         8: lload_0
         9: invokedynamic #116,  0            // InvokeDynamic #0:makeConcatWithConstants:(J)Ljava/lang/String;
        14: areturn
        15: lload_0
        16: l2d
        17: invokestatic  #120                // Method java/lang/Math.log:(D)D
        20: ldc2_w        #126                // double 1024.0d
        23: invokestatic  #120                // Method java/lang/Math.log:(D)D
        26: ddiv
        27: d2i
        28: istore_2
        29: ldc           #128                // String KMGTPE
        31: iload_2
        32: iconst_1
        33: isub
        34: invokevirtual #130                // Method java/lang/String.charAt:(I)C
        37: istore_3
        38: lload_0
        39: l2d
        40: ldc2_w        #126                // double 1024.0d
        43: iload_2
        44: i2d
        45: invokestatic  #136                // Method java/lang/Math.pow:(DD)D
        48: ddiv
        49: dstore        4
        51: iload_2
        52: iconst_1
        53: if_icmpne     61
        56: ldc           #140                // String %.0f %sB
        58: goto          63
        61: ldc           #142                // String %.2f %sB
        63: iconst_2
        64: anewarray     #144                // class java/lang/Object
        67: dup
        68: iconst_0
        69: dload         4
        71: invokestatic  #146                // Method java/lang/Double.valueOf:(D)Ljava/lang/Double;
        74: aastore
        75: dup
        76: iconst_1
        77: iload_3
        78: invokestatic  #152                // Method java/lang/Character.valueOf:(C)Ljava/lang/Character;
        81: aastore
        82: invokestatic  #157                // Method java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        85: areturn
      LineNumberTable:
        line 140: 0
        line 141: 15
        line 142: 29
        line 143: 38
        line 144: 51
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
         2: getstatic     #161                // Field java/util/concurrent/TimeUnit.MILLISECONDS:Ljava/util/concurrent/TimeUnit;
         5: lload_2
         6: invokevirtual #167                // Method java/util/concurrent/TimeUnit.toDays:(J)J
         9: lstore        4
        11: lload_2
        12: getstatic     #171                // Field java/util/concurrent/TimeUnit.DAYS:Ljava/util/concurrent/TimeUnit;
        15: lload         4
        17: invokevirtual #174                // Method java/util/concurrent/TimeUnit.toMillis:(J)J
        20: lsub
        21: lstore_2
        22: getstatic     #161                // Field java/util/concurrent/TimeUnit.MILLISECONDS:Ljava/util/concurrent/TimeUnit;
        25: lload_2
        26: invokevirtual #177                // Method java/util/concurrent/TimeUnit.toHours:(J)J
        29: lstore        6
        31: lload_2
        32: getstatic     #180                // Field java/util/concurrent/TimeUnit.HOURS:Ljava/util/concurrent/TimeUnit;
        35: lload         6
        37: invokevirtual #174                // Method java/util/concurrent/TimeUnit.toMillis:(J)J
        40: lsub
        41: lstore_2
        42: getstatic     #161                // Field java/util/concurrent/TimeUnit.MILLISECONDS:Ljava/util/concurrent/TimeUnit;
        45: lload_2
        46: invokevirtual #183                // Method java/util/concurrent/TimeUnit.toMinutes:(J)J
        49: lstore        8
        51: lload_2
        52: getstatic     #186                // Field java/util/concurrent/TimeUnit.MINUTES:Ljava/util/concurrent/TimeUnit;
        55: lload         8
        57: invokevirtual #174                // Method java/util/concurrent/TimeUnit.toMillis:(J)J
        60: lsub
        61: lstore_2
        62: getstatic     #161                // Field java/util/concurrent/TimeUnit.MILLISECONDS:Ljava/util/concurrent/TimeUnit;
        65: lload_2
        66: invokevirtual #189                // Method java/util/concurrent/TimeUnit.toSeconds:(J)J
        69: lstore        10
        71: ldc           #192                // String %dd %02dh %02dm %02ds
        73: iconst_4
        74: anewarray     #144                // class java/lang/Object
        77: dup
        78: iconst_0
        79: lload         4
        81: invokestatic  #194                // Method java/lang/Long.valueOf:(J)Ljava/lang/Long;
        84: aastore
        85: dup
        86: iconst_1
        87: lload         6
        89: invokestatic  #194                // Method java/lang/Long.valueOf:(J)Ljava/lang/Long;
        92: aastore
        93: dup
        94: iconst_2
        95: lload         8
        97: invokestatic  #194                // Method java/lang/Long.valueOf:(J)Ljava/lang/Long;
       100: aastore
       101: dup
       102: iconst_3
       103: lload         10
       105: invokestatic  #194                // Method java/lang/Long.valueOf:(J)Ljava/lang/Long;
       108: aastore
       109: invokestatic  #157                // Method java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
       112: areturn
      LineNumberTable:
        line 148: 0
        line 149: 2
        line 150: 11
        line 151: 22
        line 152: 31
        line 153: 42
        line 154: 51
        line 155: 62
        line 156: 71
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
         0: ldc           #15                 // class ext/mods/commons/gui/InterfaceLSInfo
         2: invokevirtual #199                // Method java/lang/Class.getName:()Ljava/lang/String;
         5: invokestatic  #205                // Method java/util/logging/Logger.getLogger:(Ljava/lang/String;)Ljava/util/logging/Logger;
         8: putstatic     #211                // Field LOGGER:Ljava/util/logging/Logger;
        11: invokestatic  #215                // Method java/lang/System.currentTimeMillis:()J
        14: putstatic     #221                // Field START_TIME:J
        17: return
      LineNumberTable:
        line 48: 0
        line 49: 11
}
SourceFile: "InterfaceLSInfo.java"
NestMembers:
  ext/mods/commons/gui/InterfaceLSInfo$MetricBar
  ext/mods/commons/gui/InterfaceLSInfo$InfoRow
  ext/mods/commons/gui/InterfaceLSInfo$1
BootstrapMethods:
  0: #261 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #259 \u0001 B
InnerClasses:
  public static #268= #4 of #71;          // SectionPanel=class ext/mods/commons/gui/ModernUI$SectionPanel of class ext/mods/commons/gui/ModernUI
  #103;                                   // class ext/mods/commons/gui/InterfaceLSInfo$1
  public static final #275= #271 of #273; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
