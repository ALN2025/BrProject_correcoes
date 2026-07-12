// Bytecode for: ext.mods.commons.gui.InterfaceCoroutinePoolMetrics
// File: ext\mods\commons\gui\InterfaceCoroutinePoolMetrics.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/commons/gui/InterfaceCoroutinePoolMetrics.class
  Last modified 9 de jul de 2026; size 6853 bytes
  MD5 checksum 55ecff52a1ceed4d33fcde873aecc0b9
  Compiled from "InterfaceCoroutinePoolMetrics.java"
public class ext.mods.commons.gui.InterfaceCoroutinePoolMetrics extends ext.mods.commons.gui.ModernUI$SectionPanel
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #12                         // ext/mods/commons/gui/InterfaceCoroutinePoolMetrics
  super_class: #4                         // ext/mods/commons/gui/ModernUI$SectionPanel
  interfaces: 0, fields: 11, methods: 8, attributes: 4
Constant pool:
    #1 = String             #2            // Thread Pool Metrics
    #2 = Utf8               Thread Pool Metrics
    #3 = Methodref          #4.#5         // ext/mods/commons/gui/ModernUI$SectionPanel."<init>":(Ljava/lang/String;)V
    #4 = Class              #6            // ext/mods/commons/gui/ModernUI$SectionPanel
    #5 = NameAndType        #7:#8         // "<init>":(Ljava/lang/String;)V
    #6 = Utf8               ext/mods/commons/gui/ModernUI$SectionPanel
    #7 = Utf8               <init>
    #8 = Utf8               (Ljava/lang/String;)V
    #9 = Long               -1l
   #11 = Fieldref           #12.#13       // ext/mods/commons/gui/InterfaceCoroutinePoolMetrics.lastTotalTasks:J
   #12 = Class              #14           // ext/mods/commons/gui/InterfaceCoroutinePoolMetrics
   #13 = NameAndType        #15:#16       // lastTotalTasks:J
   #14 = Utf8               ext/mods/commons/gui/InterfaceCoroutinePoolMetrics
   #15 = Utf8               lastTotalTasks
   #16 = Utf8               J
   #17 = Class              #18           // javax/swing/BoxLayout
   #18 = Utf8               javax/swing/BoxLayout
   #19 = Methodref          #17.#20       // javax/swing/BoxLayout."<init>":(Ljava/awt/Container;I)V
   #20 = NameAndType        #7:#21        // "<init>":(Ljava/awt/Container;I)V
   #21 = Utf8               (Ljava/awt/Container;I)V
   #22 = Methodref          #12.#23       // ext/mods/commons/gui/InterfaceCoroutinePoolMetrics.setLayout:(Ljava/awt/LayoutManager;)V
   #23 = NameAndType        #24:#25       // setLayout:(Ljava/awt/LayoutManager;)V
   #24 = Utf8               setLayout
   #25 = Utf8               (Ljava/awt/LayoutManager;)V
   #26 = Methodref          #27.#28       // javax/swing/Box.createVerticalStrut:(I)Ljava/awt/Component;
   #27 = Class              #29           // javax/swing/Box
   #28 = NameAndType        #30:#31       // createVerticalStrut:(I)Ljava/awt/Component;
   #29 = Utf8               javax/swing/Box
   #30 = Utf8               createVerticalStrut
   #31 = Utf8               (I)Ljava/awt/Component;
   #32 = Methodref          #12.#33       // ext/mods/commons/gui/InterfaceCoroutinePoolMetrics.add:(Ljava/awt/Component;)Ljava/awt/Component;
   #33 = NameAndType        #34:#35       // add:(Ljava/awt/Component;)Ljava/awt/Component;
   #34 = Utf8               add
   #35 = Utf8               (Ljava/awt/Component;)Ljava/awt/Component;
   #36 = Fieldref           #37.#38       // ext/mods/commons/gui/ModernUI.NEON_PURPLE:Ljava/awt/Color;
   #37 = Class              #39           // ext/mods/commons/gui/ModernUI
   #38 = NameAndType        #40:#41       // NEON_PURPLE:Ljava/awt/Color;
   #39 = Utf8               ext/mods/commons/gui/ModernUI
   #40 = Utf8               NEON_PURPLE
   #41 = Utf8               Ljava/awt/Color;
   #42 = Class              #43           // java/awt/Color
   #43 = Utf8               java/awt/Color
   #44 = Methodref          #42.#45       // java/awt/Color."<init>":(III)V
   #45 = NameAndType        #7:#46        // "<init>":(III)V
   #46 = Utf8               (III)V
   #47 = Methodref          #12.#48       // ext/mods/commons/gui/InterfaceCoroutinePoolMetrics.addMetric:(Ljava/awt/Color;Ljava/awt/Color;)Lext/mods/commons/gui/InterfaceCoroutinePoolMetrics$MetricBar;
   #48 = NameAndType        #49:#50       // addMetric:(Ljava/awt/Color;Ljava/awt/Color;)Lext/mods/commons/gui/InterfaceCoroutinePoolMetrics$MetricBar;
   #49 = Utf8               addMetric
   #50 = Utf8               (Ljava/awt/Color;Ljava/awt/Color;)Lext/mods/commons/gui/InterfaceCoroutinePoolMetrics$MetricBar;
   #51 = Fieldref           #12.#52       // ext/mods/commons/gui/InterfaceCoroutinePoolMetrics.barTask:Lext/mods/commons/gui/InterfaceCoroutinePoolMetrics$MetricBar;
   #52 = NameAndType        #53:#54       // barTask:Lext/mods/commons/gui/InterfaceCoroutinePoolMetrics$MetricBar;
   #53 = Utf8               barTask
   #54 = Utf8               Lext/mods/commons/gui/InterfaceCoroutinePoolMetrics$MetricBar;
   #55 = Fieldref           #12.#56       // ext/mods/commons/gui/InterfaceCoroutinePoolMetrics.barLatency:Lext/mods/commons/gui/InterfaceCoroutinePoolMetrics$MetricBar;
   #56 = NameAndType        #57:#54       // barLatency:Lext/mods/commons/gui/InterfaceCoroutinePoolMetrics$MetricBar;
   #57 = Utf8               barLatency
   #58 = Fieldref           #37.#59       // ext/mods/commons/gui/ModernUI.NEON_BLUE:Ljava/awt/Color;
   #59 = NameAndType        #60:#41       // NEON_BLUE:Ljava/awt/Color;
   #60 = Utf8               NEON_BLUE
   #61 = Fieldref           #37.#62       // ext/mods/commons/gui/ModernUI.NEON_CYAN:Ljava/awt/Color;
   #62 = NameAndType        #63:#41       // NEON_CYAN:Ljava/awt/Color;
   #63 = Utf8               NEON_CYAN
   #64 = Fieldref           #12.#65       // ext/mods/commons/gui/InterfaceCoroutinePoolMetrics.barSched:Lext/mods/commons/gui/InterfaceCoroutinePoolMetrics$MetricBar;
   #65 = NameAndType        #66:#54       // barSched:Lext/mods/commons/gui/InterfaceCoroutinePoolMetrics$MetricBar;
   #66 = Utf8               barSched
   #67 = Fieldref           #12.#68       // ext/mods/commons/gui/InterfaceCoroutinePoolMetrics.barInst:Lext/mods/commons/gui/InterfaceCoroutinePoolMetrics$MetricBar;
   #68 = NameAndType        #69:#54       // barInst:Lext/mods/commons/gui/InterfaceCoroutinePoolMetrics$MetricBar;
   #69 = Utf8               barInst
   #70 = Fieldref           #12.#71       // ext/mods/commons/gui/InterfaceCoroutinePoolMetrics.barPath:Lext/mods/commons/gui/InterfaceCoroutinePoolMetrics$MetricBar;
   #71 = NameAndType        #72:#54       // barPath:Lext/mods/commons/gui/InterfaceCoroutinePoolMetrics$MetricBar;
   #72 = Utf8               barPath
   #73 = Fieldref           #12.#74       // ext/mods/commons/gui/InterfaceCoroutinePoolMetrics.barPathTasks:Lext/mods/commons/gui/InterfaceCoroutinePoolMetrics$MetricBar;
   #74 = NameAndType        #75:#54       // barPathTasks:Lext/mods/commons/gui/InterfaceCoroutinePoolMetrics$MetricBar;
   #75 = Utf8               barPathTasks
   #76 = Fieldref           #12.#77       // ext/mods/commons/gui/InterfaceCoroutinePoolMetrics.barHikari:Lext/mods/commons/gui/InterfaceCoroutinePoolMetrics$MetricBar;
   #77 = NameAndType        #78:#54       // barHikari:Lext/mods/commons/gui/InterfaceCoroutinePoolMetrics$MetricBar;
   #78 = Utf8               barHikari
   #79 = Class              #80           // java/util/Timer
   #80 = Utf8               java/util/Timer
   #81 = String             #82           // ThreadPoolMetrics-Updater
   #82 = Utf8               ThreadPoolMetrics-Updater
   #83 = Methodref          #79.#84       // java/util/Timer."<init>":(Ljava/lang/String;Z)V
   #84 = NameAndType        #7:#85        // "<init>":(Ljava/lang/String;Z)V
   #85 = Utf8               (Ljava/lang/String;Z)V
   #86 = Fieldref           #12.#87       // ext/mods/commons/gui/InterfaceCoroutinePoolMetrics.updateTimer:Ljava/util/Timer;
   #87 = NameAndType        #88:#89       // updateTimer:Ljava/util/Timer;
   #88 = Utf8               updateTimer
   #89 = Utf8               Ljava/util/Timer;
   #90 = Class              #91           // ext/mods/commons/gui/InterfaceCoroutinePoolMetrics$1
   #91 = Utf8               ext/mods/commons/gui/InterfaceCoroutinePoolMetrics$1
   #92 = Methodref          #90.#93       // ext/mods/commons/gui/InterfaceCoroutinePoolMetrics$1."<init>":(Lext/mods/commons/gui/InterfaceCoroutinePoolMetrics;)V
   #93 = NameAndType        #7:#94        // "<init>":(Lext/mods/commons/gui/InterfaceCoroutinePoolMetrics;)V
   #94 = Utf8               (Lext/mods/commons/gui/InterfaceCoroutinePoolMetrics;)V
   #95 = Long               1000l
   #97 = Methodref          #79.#98       // java/util/Timer.scheduleAtFixedRate:(Ljava/util/TimerTask;JJ)V
   #98 = NameAndType        #99:#100      // scheduleAtFixedRate:(Ljava/util/TimerTask;JJ)V
   #99 = Utf8               scheduleAtFixedRate
  #100 = Utf8               (Ljava/util/TimerTask;JJ)V
  #101 = Class              #102          // ext/mods/commons/gui/InterfaceCoroutinePoolMetrics$MetricBar
  #102 = Utf8               ext/mods/commons/gui/InterfaceCoroutinePoolMetrics$MetricBar
  #103 = Methodref          #101.#104     // ext/mods/commons/gui/InterfaceCoroutinePoolMetrics$MetricBar."<init>":(Ljava/awt/Color;Ljava/awt/Color;)V
  #104 = NameAndType        #7:#105       // "<init>":(Ljava/awt/Color;Ljava/awt/Color;)V
  #105 = Utf8               (Ljava/awt/Color;Ljava/awt/Color;)V
  #106 = InvokeDynamic      #0:#107       // #0:run:(Lext/mods/commons/gui/InterfaceCoroutinePoolMetrics;)Ljava/lang/Runnable;
  #107 = NameAndType        #108:#109     // run:(Lext/mods/commons/gui/InterfaceCoroutinePoolMetrics;)Ljava/lang/Runnable;
  #108 = Utf8               run
  #109 = Utf8               (Lext/mods/commons/gui/InterfaceCoroutinePoolMetrics;)Ljava/lang/Runnable;
  #110 = Methodref          #111.#112     // javax/swing/SwingUtilities.invokeLater:(Ljava/lang/Runnable;)V
  #111 = Class              #113          // javax/swing/SwingUtilities
  #112 = NameAndType        #114:#115     // invokeLater:(Ljava/lang/Runnable;)V
  #113 = Utf8               javax/swing/SwingUtilities
  #114 = Utf8               invokeLater
  #115 = Utf8               (Ljava/lang/Runnable;)V
  #116 = InterfaceMethodref #117.#118     // java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
  #117 = Class              #119          // java/util/Map
  #118 = NameAndType        #120:#121     // get:(Ljava/lang/Object;)Ljava/lang/Object;
  #119 = Utf8               java/util/Map
  #120 = Utf8               get
  #121 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
  #122 = Class              #123          // java/lang/Number
  #123 = Utf8               java/lang/Number
  #124 = Methodref          #122.#125     // java/lang/Number.intValue:()I
  #125 = NameAndType        #126:#127     // intValue:()I
  #126 = Utf8               intValue
  #127 = Utf8               ()I
  #128 = Methodref          #122.#129     // java/lang/Number.longValue:()J
  #129 = NameAndType        #130:#131     // longValue:()J
  #130 = Utf8               longValue
  #131 = Utf8               ()J
  #132 = Methodref          #122.#133     // java/lang/Number.doubleValue:()D
  #133 = NameAndType        #134:#135     // doubleValue:()D
  #134 = Utf8               doubleValue
  #135 = Utf8               ()D
  #136 = Methodref          #137.#138     // ext/mods/commons/pool/CoroutinePool.getMetrics:()Ljava/util/Map;
  #137 = Class              #139          // ext/mods/commons/pool/CoroutinePool
  #138 = NameAndType        #140:#141     // getMetrics:()Ljava/util/Map;
  #139 = Utf8               ext/mods/commons/pool/CoroutinePool
  #140 = Utf8               getMetrics
  #141 = Utf8               ()Ljava/util/Map;
  #142 = InterfaceMethodref #117.#143     // java/util/Map.isEmpty:()Z
  #143 = NameAndType        #144:#145     // isEmpty:()Z
  #144 = Utf8               isEmpty
  #145 = Utf8               ()Z
  #146 = String             #147          // tasksSubmitted
  #147 = Utf8               tasksSubmitted
  #148 = Methodref          #12.#149      // ext/mods/commons/gui/InterfaceCoroutinePoolMetrics.getLong:(Ljava/util/Map;Ljava/lang/String;)J
  #149 = NameAndType        #150:#151     // getLong:(Ljava/util/Map;Ljava/lang/String;)J
  #150 = Utf8               getLong
  #151 = Utf8               (Ljava/util/Map;Ljava/lang/String;)J
  #152 = String             #153          // Tasks:
  #153 = Utf8               Tasks:
  #154 = Fieldref           #12.#155      // ext/mods/commons/gui/InterfaceCoroutinePoolMetrics.DEC:Ljava/text/DecimalFormat;
  #155 = NameAndType        #156:#157     // DEC:Ljava/text/DecimalFormat;
  #156 = Utf8               DEC
  #157 = Utf8               Ljava/text/DecimalFormat;
  #158 = Methodref          #159.#160     // java/text/DecimalFormat.format:(J)Ljava/lang/String;
  #159 = Class              #161          // java/text/DecimalFormat
  #160 = NameAndType        #162:#163     // format:(J)Ljava/lang/String;
  #161 = Utf8               java/text/DecimalFormat
  #162 = Utf8               format
  #163 = Utf8               (J)Ljava/lang/String;
  #164 = InvokeDynamic      #1:#165       // #1:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #165 = NameAndType        #166:#167     // makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #166 = Utf8               makeConcatWithConstants
  #167 = Utf8               (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #168 = Methodref          #101.#169     // ext/mods/commons/gui/InterfaceCoroutinePoolMetrics$MetricBar.set:(Ljava/lang/String;Ljava/lang/String;II)V
  #169 = NameAndType        #170:#171     // set:(Ljava/lang/String;Ljava/lang/String;II)V
  #170 = Utf8               set
  #171 = Utf8               (Ljava/lang/String;Ljava/lang/String;II)V
  #172 = String             #173          // averageLatency
  #173 = Utf8               averageLatency
  #174 = Methodref          #12.#175      // ext/mods/commons/gui/InterfaceCoroutinePoolMetrics.getDouble:(Ljava/util/Map;Ljava/lang/String;)D
  #175 = NameAndType        #176:#177     // getDouble:(Ljava/util/Map;Ljava/lang/String;)D
  #176 = Utf8               getDouble
  #177 = Utf8               (Ljava/util/Map;Ljava/lang/String;)D
  #178 = String             #179          // Latency:
  #179 = Utf8               Latency:
  #180 = String             #181          // %.2fms
  #181 = Utf8               %.2fms
  #182 = Class              #183          // java/lang/Object
  #183 = Utf8               java/lang/Object
  #184 = Methodref          #185.#186     // java/lang/Double.valueOf:(D)Ljava/lang/Double;
  #185 = Class              #187          // java/lang/Double
  #186 = NameAndType        #188:#189     // valueOf:(D)Ljava/lang/Double;
  #187 = Utf8               java/lang/Double
  #188 = Utf8               valueOf
  #189 = Utf8               (D)Ljava/lang/Double;
  #190 = Methodref          #191.#192     // java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
  #191 = Class              #193          // java/lang/String
  #192 = NameAndType        #162:#194     // format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
  #193 = Utf8               java/lang/String
  #194 = Utf8               (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
  #195 = String             #196          // scheduledPools
  #196 = Utf8               scheduledPools
  #197 = Methodref          #12.#198      // ext/mods/commons/gui/InterfaceCoroutinePoolMetrics.getInt:(Ljava/util/Map;Ljava/lang/String;)I
  #198 = NameAndType        #199:#200     // getInt:(Ljava/util/Map;Ljava/lang/String;)I
  #199 = Utf8               getInt
  #200 = Utf8               (Ljava/util/Map;Ljava/lang/String;)I
  #201 = String             #202          // scheduledQueueSize
  #202 = Utf8               scheduledQueueSize
  #203 = String             #204          // Scheduled:
  #204 = Utf8               Scheduled:
  #205 = InvokeDynamic      #2:#206       // #2:makeConcatWithConstants:(II)Ljava/lang/String;
  #206 = NameAndType        #166:#207     // makeConcatWithConstants:(II)Ljava/lang/String;
  #207 = Utf8               (II)Ljava/lang/String;
  #208 = Methodref          #209.#210     // java/lang/Math.max:(II)I
  #209 = Class              #211          // java/lang/Math
  #210 = NameAndType        #212:#213     // max:(II)I
  #211 = Utf8               java/lang/Math
  #212 = Utf8               max
  #213 = Utf8               (II)I
  #214 = String             #215          // instantPoolsSize
  #215 = Utf8               instantPoolsSize
  #216 = String             #217          // instantPoolsActive
  #217 = Utf8               instantPoolsActive
  #218 = String             #219          // Instant:
  #219 = Utf8               Instant:
  #220 = InvokeDynamic      #3:#206       // #3:makeConcatWithConstants:(II)Ljava/lang/String;
  #221 = String             #222          // pathfindingActive
  #222 = Utf8               pathfindingActive
  #223 = String             #224          // pathfindingSize
  #224 = Utf8               pathfindingSize
  #225 = String             #226          // Pathfinding:
  #226 = Utf8               Pathfinding:
  #227 = String             #228          // pathfindingTasksSubmitted
  #228 = Utf8               pathfindingTasksSubmitted
  #229 = String             #230          // pathfindingTasksCompleted
  #230 = Utf8               pathfindingTasksCompleted
  #231 = String             #232          // Pathfinder:
  #232 = Utf8               Pathfinder:
  #233 = InvokeDynamic      #4:#234       // #4:makeConcatWithConstants:(JJ)Ljava/lang/String;
  #234 = NameAndType        #166:#235     // makeConcatWithConstants:(JJ)Ljava/lang/String;
  #235 = Utf8               (JJ)Ljava/lang/String;
  #236 = Methodref          #209.#237     // java/lang/Math.max:(JJ)J
  #237 = NameAndType        #212:#238     // max:(JJ)J
  #238 = Utf8               (JJ)J
  #239 = Class              #240          // java/lang/Integer
  #240 = Utf8               java/lang/Integer
  #241 = Long               2147483647l
  #243 = Methodref          #209.#244     // java/lang/Math.min:(JJ)J
  #244 = NameAndType        #245:#238     // min:(JJ)J
  #245 = Utf8               min
  #246 = Methodref          #247.#248     // ext/mods/commons/pool/ConnectionPool.getTotalQueries:()J
  #247 = Class              #249          // ext/mods/commons/pool/ConnectionPool
  #248 = NameAndType        #250:#131     // getTotalQueries:()J
  #249 = Utf8               ext/mods/commons/pool/ConnectionPool
  #250 = Utf8               getTotalQueries
  #251 = Integer            50000
  #252 = String             #253          // HikariCP:
  #253 = Utf8               HikariCP:
  #254 = InvokeDynamic      #5:#255       // #5:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #255 = NameAndType        #166:#256     // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #256 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
  #257 = Class              #258          // java/lang/Exception
  #258 = Utf8               java/lang/Exception
  #259 = String             #260          // #,##0
  #260 = Utf8               #,##0
  #261 = Methodref          #159.#5       // java/text/DecimalFormat."<init>":(Ljava/lang/String;)V
  #262 = Utf8               serialVersionUID
  #263 = Utf8               ConstantValue
  #264 = Long               1l
  #266 = Utf8               ()V
  #267 = Utf8               Code
  #268 = Utf8               LineNumberTable
  #269 = Utf8               LocalVariableTable
  #270 = Utf8               this
  #271 = Utf8               Lext/mods/commons/gui/InterfaceCoroutinePoolMetrics;
  #272 = Utf8               c1
  #273 = Utf8               c2
  #274 = Utf8               bar
  #275 = Utf8               update
  #276 = Utf8               m
  #277 = Utf8               Ljava/util/Map;
  #278 = Utf8               k
  #279 = Utf8               Ljava/lang/String;
  #280 = Utf8               o
  #281 = Utf8               Ljava/lang/Object;
  #282 = Utf8               LocalVariableTypeTable
  #283 = Utf8               Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;
  #284 = Utf8               StackMapTable
  #285 = Utf8               Signature
  #286 = Utf8               (Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;Ljava/lang/String;)I
  #287 = Utf8               (Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;Ljava/lang/String;)J
  #288 = Utf8               (Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;Ljava/lang/String;)D
  #289 = Utf8               lambda$update$0
  #290 = Utf8               currentTotalTasks
  #291 = Utf8               tps
  #292 = Utf8               lat
  #293 = Utf8               D
  #294 = Utf8               schedPools
  #295 = Utf8               I
  #296 = Utf8               schedTasks
  #297 = Utf8               instP
  #298 = Utf8               instA
  #299 = Utf8               pathA
  #300 = Utf8               pathS
  #301 = Utf8               pfSubmitted
  #302 = Utf8               pfCompleted
  #303 = Utf8               hikariQueries
  #304 = Utf8               barMax
  #305 = Utf8               <clinit>
  #306 = Utf8               SourceFile
  #307 = Utf8               InterfaceCoroutinePoolMetrics.java
  #308 = Utf8               NestMembers
  #309 = Utf8               BootstrapMethods
  #310 = MethodType         #266          //  ()V
  #311 = MethodHandle       5:#312        // REF_invokeVirtual ext/mods/commons/gui/InterfaceCoroutinePoolMetrics.lambda$update$0:()V
  #312 = Methodref          #12.#313      // ext/mods/commons/gui/InterfaceCoroutinePoolMetrics.lambda$update$0:()V
  #313 = NameAndType        #289:#266     // lambda$update$0:()V
  #314 = String             #315          // \u0001 (TPS: \u0001)
  #315 = Utf8               \u0001 (TPS: \u0001)
  #316 = String             #317          // \u0001 waiting (\u0001 pools)
  #317 = Utf8               \u0001 waiting (\u0001 pools)
  #318 = String             #319          // \u0001 / \u0001 active
  #319 = Utf8               \u0001 / \u0001 active
  #320 = String             #321          // \u0001 / \u0001 completed
  #321 = Utf8               \u0001 / \u0001 completed
  #322 = String             #323          // \u0001 processadas
  #323 = Utf8               \u0001 processadas
  #324 = MethodHandle       6:#325        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #325 = Methodref          #326.#327     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #326 = Class              #328          // java/lang/invoke/LambdaMetafactory
  #327 = NameAndType        #329:#330     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #328 = Utf8               java/lang/invoke/LambdaMetafactory
  #329 = Utf8               metafactory
  #330 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #331 = MethodHandle       6:#332        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #332 = Methodref          #333.#334     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #333 = Class              #335          // java/lang/invoke/StringConcatFactory
  #334 = NameAndType        #166:#336     // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #335 = Utf8               java/lang/invoke/StringConcatFactory
  #336 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #337 = Utf8               InnerClasses
  #338 = Utf8               SectionPanel
  #339 = Utf8               MetricBar
  #340 = Class              #341          // java/lang/invoke/MethodHandles$Lookup
  #341 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #342 = Class              #343          // java/lang/invoke/MethodHandles
  #343 = Utf8               java/lang/invoke/MethodHandles
  #344 = Utf8               Lookup
{
  public ext.mods.commons.gui.InterfaceCoroutinePoolMetrics();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=8, locals=1, args_size=1
         0: aload_0
         1: ldc           #1                  // String Thread Pool Metrics
         3: invokespecial #3                  // Method ext/mods/commons/gui/ModernUI$SectionPanel."<init>":(Ljava/lang/String;)V
         6: aload_0
         7: ldc2_w        #9                  // long -1l
        10: putfield      #11                 // Field lastTotalTasks:J
        13: aload_0
        14: new           #17                 // class javax/swing/BoxLayout
        17: dup
        18: aload_0
        19: iconst_1
        20: invokespecial #19                 // Method javax/swing/BoxLayout."<init>":(Ljava/awt/Container;I)V
        23: invokevirtual #22                 // Method setLayout:(Ljava/awt/LayoutManager;)V
        26: aload_0
        27: iconst_5
        28: invokestatic  #26                 // Method javax/swing/Box.createVerticalStrut:(I)Ljava/awt/Component;
        31: invokevirtual #32                 // Method add:(Ljava/awt/Component;)Ljava/awt/Component;
        34: pop
        35: aload_0
        36: aload_0
        37: getstatic     #36                 // Field ext/mods/commons/gui/ModernUI.NEON_PURPLE:Ljava/awt/Color;
        40: new           #42                 // class java/awt/Color
        43: dup
        44: sipush        255
        47: bipush        100
        49: sipush        200
        52: invokespecial #44                 // Method java/awt/Color."<init>":(III)V
        55: invokevirtual #47                 // Method addMetric:(Ljava/awt/Color;Ljava/awt/Color;)Lext/mods/commons/gui/InterfaceCoroutinePoolMetrics$MetricBar;
        58: putfield      #51                 // Field barTask:Lext/mods/commons/gui/InterfaceCoroutinePoolMetrics$MetricBar;
        61: aload_0
        62: aload_0
        63: getstatic     #36                 // Field ext/mods/commons/gui/ModernUI.NEON_PURPLE:Ljava/awt/Color;
        66: new           #42                 // class java/awt/Color
        69: dup
        70: sipush        255
        73: bipush        100
        75: sipush        200
        78: invokespecial #44                 // Method java/awt/Color."<init>":(III)V
        81: invokevirtual #47                 // Method addMetric:(Ljava/awt/Color;Ljava/awt/Color;)Lext/mods/commons/gui/InterfaceCoroutinePoolMetrics$MetricBar;
        84: putfield      #55                 // Field barLatency:Lext/mods/commons/gui/InterfaceCoroutinePoolMetrics$MetricBar;
        87: aload_0
        88: aload_0
        89: getstatic     #58                 // Field ext/mods/commons/gui/ModernUI.NEON_BLUE:Ljava/awt/Color;
        92: getstatic     #61                 // Field ext/mods/commons/gui/ModernUI.NEON_CYAN:Ljava/awt/Color;
        95: invokevirtual #47                 // Method addMetric:(Ljava/awt/Color;Ljava/awt/Color;)Lext/mods/commons/gui/InterfaceCoroutinePoolMetrics$MetricBar;
        98: putfield      #64                 // Field barSched:Lext/mods/commons/gui/InterfaceCoroutinePoolMetrics$MetricBar;
       101: aload_0
       102: aload_0
       103: getstatic     #58                 // Field ext/mods/commons/gui/ModernUI.NEON_BLUE:Ljava/awt/Color;
       106: getstatic     #61                 // Field ext/mods/commons/gui/ModernUI.NEON_CYAN:Ljava/awt/Color;
       109: invokevirtual #47                 // Method addMetric:(Ljava/awt/Color;Ljava/awt/Color;)Lext/mods/commons/gui/InterfaceCoroutinePoolMetrics$MetricBar;
       112: putfield      #67                 // Field barInst:Lext/mods/commons/gui/InterfaceCoroutinePoolMetrics$MetricBar;
       115: aload_0
       116: aload_0
       117: new           #42                 // class java/awt/Color
       120: dup
       121: bipush        80
       123: bipush        80
       125: sipush        255
       128: invokespecial #44                 // Method java/awt/Color."<init>":(III)V
       131: new           #42                 // class java/awt/Color
       134: dup
       135: bipush        120
       137: bipush        120
       139: sipush        255
       142: invokespecial #44                 // Method java/awt/Color."<init>":(III)V
       145: invokevirtual #47                 // Method addMetric:(Ljava/awt/Color;Ljava/awt/Color;)Lext/mods/commons/gui/InterfaceCoroutinePoolMetrics$MetricBar;
       148: putfield      #70                 // Field barPath:Lext/mods/commons/gui/InterfaceCoroutinePoolMetrics$MetricBar;
       151: aload_0
       152: aload_0
       153: new           #42                 // class java/awt/Color
       156: dup
       157: bipush        60
       159: bipush        120
       161: sipush        180
       164: invokespecial #44                 // Method java/awt/Color."<init>":(III)V
       167: new           #42                 // class java/awt/Color
       170: dup
       171: bipush        100
       173: sipush        160
       176: sipush        220
       179: invokespecial #44                 // Method java/awt/Color."<init>":(III)V
       182: invokevirtual #47                 // Method addMetric:(Ljava/awt/Color;Ljava/awt/Color;)Lext/mods/commons/gui/InterfaceCoroutinePoolMetrics$MetricBar;
       185: putfield      #73                 // Field barPathTasks:Lext/mods/commons/gui/InterfaceCoroutinePoolMetrics$MetricBar;
       188: aload_0
       189: aload_0
       190: new           #42                 // class java/awt/Color
       193: dup
       194: iconst_0
       195: sipush        150
       198: bipush        100
       200: invokespecial #44                 // Method java/awt/Color."<init>":(III)V
       203: new           #42                 // class java/awt/Color
       206: dup
       207: bipush        50
       209: sipush        200
       212: sipush        150
       215: invokespecial #44                 // Method java/awt/Color."<init>":(III)V
       218: invokevirtual #47                 // Method addMetric:(Ljava/awt/Color;Ljava/awt/Color;)Lext/mods/commons/gui/InterfaceCoroutinePoolMetrics$MetricBar;
       221: putfield      #76                 // Field barHikari:Lext/mods/commons/gui/InterfaceCoroutinePoolMetrics$MetricBar;
       224: aload_0
       225: new           #79                 // class java/util/Timer
       228: dup
       229: ldc           #81                 // String ThreadPoolMetrics-Updater
       231: iconst_1
       232: invokespecial #83                 // Method java/util/Timer."<init>":(Ljava/lang/String;Z)V
       235: putfield      #86                 // Field updateTimer:Ljava/util/Timer;
       238: aload_0
       239: getfield      #86                 // Field updateTimer:Ljava/util/Timer;
       242: new           #90                 // class ext/mods/commons/gui/InterfaceCoroutinePoolMetrics$1
       245: dup
       246: aload_0
       247: invokespecial #92                 // Method ext/mods/commons/gui/InterfaceCoroutinePoolMetrics$1."<init>":(Lext/mods/commons/gui/InterfaceCoroutinePoolMetrics;)V
       250: ldc2_w        #95                 // long 1000l
       253: ldc2_w        #95                 // long 1000l
       256: invokevirtual #97                 // Method java/util/Timer.scheduleAtFixedRate:(Ljava/util/TimerTask;JJ)V
       259: return
      LineNumberTable:
        line 52: 0
        line 49: 6
        line 53: 13
        line 55: 26
        line 57: 35
        line 58: 61
        line 60: 87
        line 61: 101
        line 62: 115
        line 63: 151
        line 64: 188
        line 66: 224
        line 67: 238
        line 71: 259
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     260     0  this   Lext/mods/commons/gui/InterfaceCoroutinePoolMetrics;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=3, locals=0, args_size=0
         0: new           #159                // class java/text/DecimalFormat
         3: dup
         4: ldc_w         #259                // String #,##0
         7: invokespecial #261                // Method java/text/DecimalFormat."<init>":(Ljava/lang/String;)V
        10: putstatic     #154                // Field DEC:Ljava/text/DecimalFormat;
        13: return
      LineNumberTable:
        line 45: 0
}
SourceFile: "InterfaceCoroutinePoolMetrics.java"
NestMembers:
  ext/mods/commons/gui/InterfaceCoroutinePoolMetrics$MetricBar
  ext/mods/commons/gui/InterfaceCoroutinePoolMetrics$1
BootstrapMethods:
  0: #324 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #310 ()V
      #311 REF_invokeVirtual ext/mods/commons/gui/InterfaceCoroutinePoolMetrics.lambda$update$0:()V
      #310 ()V
  1: #331 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #314 \u0001 (TPS: \u0001)
  2: #331 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #316 \u0001 waiting (\u0001 pools)
  3: #331 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #318 \u0001 / \u0001 active
  4: #331 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #320 \u0001 / \u0001 completed
  5: #331 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #322 \u0001 processadas
InnerClasses:
  public static #338= #4 of #37;          // SectionPanel=class ext/mods/commons/gui/ModernUI$SectionPanel of class ext/mods/commons/gui/ModernUI
  #90;                                    // class ext/mods/commons/gui/InterfaceCoroutinePoolMetrics$1
  public static final #344= #340 of #342; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
