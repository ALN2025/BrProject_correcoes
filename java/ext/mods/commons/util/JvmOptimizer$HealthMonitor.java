// Bytecode for: ext.mods.commons.util.JvmOptimizer$HealthMonitor
// File: ext\mods\commons\util\JvmOptimizer$HealthMonitor.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/commons/util/JvmOptimizer$HealthMonitor.class
  Last modified 9 de jul de 2026; size 9071 bytes
  MD5 checksum 613e01aae016ec4c250fb124ed2b7b18
  Compiled from "JvmOptimizer.java"
class ext.mods.commons.util.JvmOptimizer$HealthMonitor extends java.lang.Thread
  minor version: 0
  major version: 69
  flags: (0x0020) ACC_SUPER
  this_class: #12                         // ext/mods/commons/util/JvmOptimizer$HealthMonitor
  super_class: #6                         // java/lang/Thread
  interfaces: 0, fields: 1, methods: 7, attributes: 3
Constant pool:
    #1 = Class              #2            // ext/mods/commons/util/JvmOptimizer
    #2 = Utf8               ext/mods/commons/util/JvmOptimizer
    #3 = String             #4            // JvmOptimizer-HealthMonitor
    #4 = Utf8               JvmOptimizer-HealthMonitor
    #5 = Methodref          #6.#7         // java/lang/Thread."<init>":(Ljava/lang/String;)V
    #6 = Class              #8            // java/lang/Thread
    #7 = NameAndType        #9:#10        // "<init>":(Ljava/lang/String;)V
    #8 = Utf8               java/lang/Thread
    #9 = Utf8               <init>
   #10 = Utf8               (Ljava/lang/String;)V
   #11 = Fieldref           #12.#13       // ext/mods/commons/util/JvmOptimizer$HealthMonitor._running:Z
   #12 = Class              #14           // ext/mods/commons/util/JvmOptimizer$HealthMonitor
   #13 = NameAndType        #15:#16       // _running:Z
   #14 = Utf8               ext/mods/commons/util/JvmOptimizer$HealthMonitor
   #15 = Utf8               _running
   #16 = Utf8               Z
   #17 = Methodref          #12.#18       // ext/mods/commons/util/JvmOptimizer$HealthMonitor.setDaemon:(Z)V
   #18 = NameAndType        #19:#20       // setDaemon:(Z)V
   #19 = Utf8               setDaemon
   #20 = Utf8               (Z)V
   #21 = Fieldref           #1.#22        // ext/mods/commons/util/JvmOptimizer._normalShutdown:Z
   #22 = NameAndType        #23:#16       // _normalShutdown:Z
   #23 = Utf8               _normalShutdown
   #24 = Long               70000l
   #26 = Methodref          #6.#27        // java/lang/Thread.sleep:(J)V
   #27 = NameAndType        #28:#29       // sleep:(J)V
   #28 = Utf8               sleep
   #29 = Utf8               (J)V
   #30 = Methodref          #12.#31       // ext/mods/commons/util/JvmOptimizer$HealthMonitor.checkServerHealth:()Z
   #31 = NameAndType        #32:#33       // checkServerHealth:()Z
   #32 = Utf8               checkServerHealth
   #33 = Utf8               ()Z
   #34 = Fieldref           #1.#35        // ext/mods/commons/util/JvmOptimizer._consecutiveFailures:Ljava/util/concurrent/atomic/AtomicInteger;
   #35 = NameAndType        #36:#37       // _consecutiveFailures:Ljava/util/concurrent/atomic/AtomicInteger;
   #36 = Utf8               _consecutiveFailures
   #37 = Utf8               Ljava/util/concurrent/atomic/AtomicInteger;
   #38 = Methodref          #39.#40       // java/util/concurrent/atomic/AtomicInteger.incrementAndGet:()I
   #39 = Class              #41           // java/util/concurrent/atomic/AtomicInteger
   #40 = NameAndType        #42:#43       // incrementAndGet:()I
   #41 = Utf8               java/util/concurrent/atomic/AtomicInteger
   #42 = Utf8               incrementAndGet
   #43 = Utf8               ()I
   #44 = Methodref          #39.#45       // java/util/concurrent/atomic/AtomicInteger.get:()I
   #45 = NameAndType        #46:#43       // get:()I
   #46 = Utf8               get
   #47 = Fieldref           #1.#48        // ext/mods/commons/util/JvmOptimizer.LOGGER:Lext/mods/commons/logging/CLogger;
   #48 = NameAndType        #49:#50       // LOGGER:Lext/mods/commons/logging/CLogger;
   #49 = Utf8               LOGGER
   #50 = Utf8               Lext/mods/commons/logging/CLogger;
   #51 = String             #52           // Multiplas falhas consecutivas detectadas ({}) - Reiniciando servidor...
   #52 = Utf8               Multiplas falhas consecutivas detectadas ({}) - Reiniciando servidor...
   #53 = Class              #54           // java/lang/Object
   #54 = Utf8               java/lang/Object
   #55 = Methodref          #56.#57       // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
   #56 = Class              #58           // java/lang/Integer
   #57 = NameAndType        #59:#60       // valueOf:(I)Ljava/lang/Integer;
   #58 = Utf8               java/lang/Integer
   #59 = Utf8               valueOf
   #60 = Utf8               (I)Ljava/lang/Integer;
   #61 = Methodref          #62.#63       // ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;[Ljava/lang/Object;)V
   #62 = Class              #64           // ext/mods/commons/logging/CLogger
   #63 = NameAndType        #65:#66       // error:(Ljava/lang/Object;[Ljava/lang/Object;)V
   #64 = Utf8               ext/mods/commons/logging/CLogger
   #65 = Utf8               error
   #66 = Utf8               (Ljava/lang/Object;[Ljava/lang/Object;)V
   #67 = Methodref          #12.#68       // ext/mods/commons/util/JvmOptimizer$HealthMonitor.restartServer:()V
   #68 = NameAndType        #69:#70       // restartServer:()V
   #69 = Utf8               restartServer
   #70 = Utf8               ()V
   #71 = Methodref          #39.#72       // java/util/concurrent/atomic/AtomicInteger.set:(I)V
   #72 = NameAndType        #73:#74       // set:(I)V
   #73 = Utf8               set
   #74 = Utf8               (I)V
   #75 = Class              #76           // java/lang/InterruptedException
   #76 = Utf8               java/lang/InterruptedException
   #77 = String             #78           //   [AVISO] HealthMonitor interrompido - Encerrando monitoramento
   #78 = Utf8                 [AVISO] HealthMonitor interrompido - Encerrando monitoramento
   #79 = Methodref          #62.#80       // ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;)V
   #80 = NameAndType        #81:#82       // warn:(Ljava/lang/Object;)V
   #81 = Utf8               warn
   #82 = Utf8               (Ljava/lang/Object;)V
   #83 = Class              #84           // java/lang/Exception
   #84 = Utf8               java/lang/Exception
   #85 = String             #86           //   [ERRO] Erro no HealthMonitor: {}
   #86 = Utf8                 [ERRO] Erro no HealthMonitor: {}
   #87 = Methodref          #83.#88       // java/lang/Exception.getMessage:()Ljava/lang/String;
   #88 = NameAndType        #89:#90       // getMessage:()Ljava/lang/String;
   #89 = Utf8               getMessage
   #90 = Utf8               ()Ljava/lang/String;
   #91 = String             #92           //      Tipo: {}
   #92 = Utf8                    Tipo: {}
   #93 = Methodref          #53.#94       // java/lang/Object.getClass:()Ljava/lang/Class;
   #94 = NameAndType        #95:#96       // getClass:()Ljava/lang/Class;
   #95 = Utf8               getClass
   #96 = Utf8               ()Ljava/lang/Class;
   #97 = Methodref          #98.#99       // java/lang/Class.getSimpleName:()Ljava/lang/String;
   #98 = Class              #100          // java/lang/Class
   #99 = NameAndType        #101:#90      // getSimpleName:()Ljava/lang/String;
  #100 = Utf8               java/lang/Class
  #101 = Utf8               getSimpleName
  #102 = Methodref          #103.#104     // java/lang/management/ManagementFactory.getMemoryMXBean:()Ljava/lang/management/MemoryMXBean;
  #103 = Class              #105          // java/lang/management/ManagementFactory
  #104 = NameAndType        #106:#107     // getMemoryMXBean:()Ljava/lang/management/MemoryMXBean;
  #105 = Utf8               java/lang/management/ManagementFactory
  #106 = Utf8               getMemoryMXBean
  #107 = Utf8               ()Ljava/lang/management/MemoryMXBean;
  #108 = InterfaceMethodref #109.#110     // java/lang/management/MemoryMXBean.getHeapMemoryUsage:()Ljava/lang/management/MemoryUsage;
  #109 = Class              #111          // java/lang/management/MemoryMXBean
  #110 = NameAndType        #112:#113     // getHeapMemoryUsage:()Ljava/lang/management/MemoryUsage;
  #111 = Utf8               java/lang/management/MemoryMXBean
  #112 = Utf8               getHeapMemoryUsage
  #113 = Utf8               ()Ljava/lang/management/MemoryUsage;
  #114 = Methodref          #115.#116     // java/lang/management/MemoryUsage.getUsed:()J
  #115 = Class              #117          // java/lang/management/MemoryUsage
  #116 = NameAndType        #118:#119     // getUsed:()J
  #117 = Utf8               java/lang/management/MemoryUsage
  #118 = Utf8               getUsed
  #119 = Utf8               ()J
  #120 = Methodref          #115.#121     // java/lang/management/MemoryUsage.getMax:()J
  #121 = NameAndType        #122:#119     // getMax:()J
  #122 = Utf8               getMax
  #123 = Methodref          #12.#124      // ext/mods/commons/util/JvmOptimizer$HealthMonitor.performG1PeriodicReclaim:(Ljava/lang/management/MemoryMXBean;Ljava/lang/management/MemoryUsage;)V
  #124 = NameAndType        #125:#126     // performG1PeriodicReclaim:(Ljava/lang/management/MemoryMXBean;Ljava/lang/management/MemoryUsage;)V
  #125 = Utf8               performG1PeriodicReclaim
  #126 = Utf8               (Ljava/lang/management/MemoryMXBean;Ljava/lang/management/MemoryUsage;)V
  #127 = Double             0.95d
  #129 = String             #130          //   [ALERTA] Uso de memoria critico: atual = {:.2f}%, limite = {:.2f}%
  #130 = Utf8                 [ALERTA] Uso de memoria critico: atual = {:.2f}%, limite = {:.2f}%
  #131 = Double             100.0d
  #133 = Methodref          #134.#135     // java/lang/Double.valueOf:(D)Ljava/lang/Double;
  #134 = Class              #136          // java/lang/Double
  #135 = NameAndType        #59:#137      // valueOf:(D)Ljava/lang/Double;
  #136 = Utf8               java/lang/Double
  #137 = Utf8               (D)Ljava/lang/Double;
  #138 = Double             95.0d
  #140 = Methodref          #62.#141      // ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;[Ljava/lang/Object;)V
  #141 = NameAndType        #81:#66       // warn:(Ljava/lang/Object;[Ljava/lang/Object;)V
  #142 = String             #143          //      -> Forcando Garbage Collection...
  #143 = Utf8                    -> Forcando Garbage Collection...
  #144 = Methodref          #145.#146     // java/lang/System.gc:()V
  #145 = Class              #147          // java/lang/System
  #146 = NameAndType        #148:#70      // gc:()V
  #147 = Utf8               java/lang/System
  #148 = Utf8               gc
  #149 = Long               1000l
  #151 = String             #152          //   [CRITICO] Memoria ainda alta apos GC: {:.2f}% - reinicio necessario
  #152 = Utf8                 [CRITICO] Memoria ainda alta apos GC: {:.2f}% - reinicio necessario
  #153 = String             #154          //      [OK] Memoria liberada apos GC: {:.2f}%
  #154 = Utf8                    [OK] Memoria liberada apos GC: {:.2f}%
  #155 = Methodref          #62.#156      // ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
  #156 = NameAndType        #157:#66      // info:(Ljava/lang/Object;[Ljava/lang/Object;)V
  #157 = Utf8               info
  #158 = Methodref          #103.#159     // java/lang/management/ManagementFactory.getThreadMXBean:()Ljava/lang/management/ThreadMXBean;
  #159 = NameAndType        #160:#161     // getThreadMXBean:()Ljava/lang/management/ThreadMXBean;
  #160 = Utf8               getThreadMXBean
  #161 = Utf8               ()Ljava/lang/management/ThreadMXBean;
  #162 = InterfaceMethodref #163.#164     // java/lang/management/ThreadMXBean.findDeadlockedThreads:()[J
  #163 = Class              #165          // java/lang/management/ThreadMXBean
  #164 = NameAndType        #166:#167     // findDeadlockedThreads:()[J
  #165 = Utf8               java/lang/management/ThreadMXBean
  #166 = Utf8               findDeadlockedThreads
  #167 = Utf8               ()[J
  #168 = String             #169          //
  #169 = Utf8
  #170 = Methodref          #62.#171      // ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;)V
  #171 = NameAndType        #65:#82       // error:(Ljava/lang/Object;)V
  #172 = String             #173          //   [CRITICO] Deadlock Detectado
  #173 = Utf8                 [CRITICO] Deadlock Detectado
  #174 = String             #175          //      +---------------------------------------------------------+
  #175 = Utf8                    +---------------------------------------------------------+
  #176 = String             #177          //      | Threads em Deadlock: {}                              |
  #177 = Utf8                    | Threads em Deadlock: {}                              |
  #178 = String             #179          //      | Acao:        REINICIO NECESSARIO                    |
  #179 = Utf8                    | Acao:        REINICIO NECESSARIO                    |
  #180 = InterfaceMethodref #163.#181     // java/lang/management/ThreadMXBean.getThreadCount:()I
  #181 = NameAndType        #182:#43      // getThreadCount:()I
  #182 = Utf8               getThreadCount
  #183 = InterfaceMethodref #163.#184     // java/lang/management/ThreadMXBean.getPeakThreadCount:()I
  #184 = NameAndType        #185:#43      // getPeakThreadCount:()I
  #185 = Utf8               getPeakThreadCount
  #186 = Methodref          #12.#187      // ext/mods/commons/util/JvmOptimizer$HealthMonitor.shouldWarnHighThreads:(II)Z
  #187 = NameAndType        #188:#189     // shouldWarnHighThreads:(II)Z
  #188 = Utf8               shouldWarnHighThreads
  #189 = Utf8               (II)Z
  #190 = String             #191          //   [AVISO] Numero alto de threads detectado:
  #191 = Utf8                 [AVISO] Numero alto de threads detectado:
  #192 = String             #193          //      -> Atuais: {} | Pico: {}
  #193 = Utf8                    -> Atuais: {} | Pico: {}
  #194 = String             #195          //      -> Possivel vazamento de threads (monitorando...)
  #195 = Utf8                    -> Possivel vazamento de threads (monitorando...)
  #196 = String             #197          //   [ERRO] Erro ao verificar saude do servidor: {}
  #197 = Utf8                 [ERRO] Erro ao verificar saude do servidor: {}
  #198 = Methodref          #1.#199       // ext/mods/commons/util/JvmOptimizer.isG1GcActive:()Z
  #199 = NameAndType        #200:#33      // isG1GcActive:()Z
  #200 = Utf8               isG1GcActive
  #201 = Methodref          #115.#202     // java/lang/management/MemoryUsage.getCommitted:()J
  #202 = NameAndType        #203:#119     // getCommitted:()J
  #203 = Utf8               getCommitted
  #204 = Long               268435456l
  #206 = Long               33554432l
  #208 = Long               4l
  #210 = Methodref          #211.#212     // java/lang/Math.max:(JJ)J
  #211 = Class              #213          // java/lang/Math
  #212 = NameAndType        #214:#215     // max:(JJ)J
  #213 = Utf8               java/lang/Math
  #214 = Utf8               max
  #215 = Utf8               (JJ)J
  #216 = Double             0.25d
  #218 = InterfaceMethodref #109.#146     // java/lang/management/MemoryMXBean.gc:()V
  #219 = Methodref          #220.#221     // java/lang/Runtime.getRuntime:()Ljava/lang/Runtime;
  #220 = Class              #222          // java/lang/Runtime
  #221 = NameAndType        #223:#224     // getRuntime:()Ljava/lang/Runtime;
  #222 = Utf8               java/lang/Runtime
  #223 = Utf8               getRuntime
  #224 = Utf8               ()Ljava/lang/Runtime;
  #225 = Methodref          #220.#226     // java/lang/Runtime.availableProcessors:()I
  #226 = NameAndType        #227:#43      // availableProcessors:()I
  #227 = Utf8               availableProcessors
  #228 = Methodref          #211.#229     // java/lang/Math.max:(II)I
  #229 = NameAndType        #214:#230     // max:(II)I
  #230 = Utf8               (II)I
  #231 = Methodref          #145.#232     // java/lang/System.currentTimeMillis:()J
  #232 = NameAndType        #233:#119     // currentTimeMillis:()J
  #233 = Utf8               currentTimeMillis
  #234 = Fieldref           #1.#235       // ext/mods/commons/util/JvmOptimizer._lastThreadWarnTime:J
  #235 = NameAndType        #236:#237     // _lastThreadWarnTime:J
  #236 = Utf8               _lastThreadWarnTime
  #237 = Utf8               J
  #238 = Long               300000l
  #240 = Fieldref           #1.#241       // ext/mods/commons/util/JvmOptimizer._lastThreadWarnCount:I
  #241 = NameAndType        #242:#243     // _lastThreadWarnCount:I
  #242 = Utf8               _lastThreadWarnCount
  #243 = Utf8               I
  #244 = Methodref          #62.#245      // ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;)V
  #245 = NameAndType        #157:#82      // info:(Ljava/lang/Object;)V
  #246 = String             #247          //   Desligamento normal detectado - Cancelando restart automatico
  #247 = Utf8                 Desligamento normal detectado - Cancelando restart automatico
  #248 = Fieldref           #1.#249       // ext/mods/commons/util/JvmOptimizer._restartCount:Ljava/util/concurrent/atomic/AtomicInteger;
  #249 = NameAndType        #250:#37      // _restartCount:Ljava/util/concurrent/atomic/AtomicInteger;
  #250 = Utf8               _restartCount
  #251 = String             #252          //   ================================================================
  #252 = Utf8                 ================================================================
  #253 = String             #254          //      REINICIO AUTOMATICO DO SERVIDOR - Tentativa #{}
  #254 = Utf8                    REINICIO AUTOMATICO DO SERVIDOR - Tentativa #{}
  #255 = String             #256          //      Motivo: Multiplas falhas consecutivas detectadas ({})
  #256 = Utf8                    Motivo: Multiplas falhas consecutivas detectadas ({})
  #257 = String             #258          //      Acao:   Reiniciando servidor para restaurar estabilidade
  #258 = Utf8                    Acao:   Reiniciando servidor para restaurar estabilidade
  #259 = Double             2.0d
  #261 = Methodref          #211.#262     // java/lang/Math.pow:(DD)D
  #262 = NameAndType        #263:#264     // pow:(DD)D
  #263 = Utf8               pow
  #264 = Utf8               (DD)D
  #265 = Long               60000l
  #267 = Methodref          #211.#268     // java/lang/Math.min:(JJ)J
  #268 = NameAndType        #269:#215     // min:(JJ)J
  #269 = Utf8               min
  #270 = String             #271          //      Aguardando {} segundo(s) antes de reiniciar...
  #271 = Utf8                    Aguardando {} segundo(s) antes de reiniciar...
  #272 = Methodref          #273.#274     // java/lang/Long.valueOf:(J)Ljava/lang/Long;
  #273 = Class              #275          // java/lang/Long
  #274 = NameAndType        #59:#276      // valueOf:(J)Ljava/lang/Long;
  #275 = Utf8               java/lang/Long
  #276 = Utf8               (J)Ljava/lang/Long;
  #277 = String             #278          //      -> Delay exponencial aplicado para evitar loops de restart
  #278 = Utf8                    -> Delay exponencial aplicado para evitar loops de restart
  #279 = String             #280          //      [OK] Desligamento normal detectado durante delay
  #280 = Utf8                    [OK] Desligamento normal detectado durante delay
  #281 = String             #282          //      -> Cancelando restart automatico
  #282 = Utf8                    -> Cancelando restart automatico
  #283 = Class              #284          // java/lang/String
  #284 = Utf8               java/lang/String
  #285 = String             #286          // StartBrproject.bat
  #286 = Utf8               StartBrproject.bat
  #287 = String             #288          // start.vbs
  #288 = Utf8               start.vbs
  #289 = String             #290          // start.sh
  #290 = Utf8               start.sh
  #291 = String             #292          // entrypoint.sh
  #292 = Utf8               entrypoint.sh
  #293 = Class              #294          // java/io/File
  #294 = Utf8               java/io/File
  #295 = Methodref          #293.#7       // java/io/File."<init>":(Ljava/lang/String;)V
  #296 = Methodref          #293.#297     // java/io/File.exists:()Z
  #297 = NameAndType        #298:#33      // exists:()Z
  #298 = Utf8               exists
  #299 = Methodref          #293.#300     // java/io/File.canExecute:()Z
  #300 = NameAndType        #301:#33      // canExecute:()Z
  #301 = Utf8               canExecute
  #302 = String             #303          //      Script de restart encontrado: {}
  #303 = Utf8                    Script de restart encontrado: {}
  #304 = Methodref          #293.#305     // java/io/File.getName:()Ljava/lang/String;
  #305 = NameAndType        #306:#90      // getName:()Ljava/lang/String;
  #306 = Utf8               getName
  #307 = String             #308          //      -> Executando: {}
  #308 = Utf8                    -> Executando: {}
  #309 = Methodref          #293.#310     // java/io/File.getAbsolutePath:()Ljava/lang/String;
  #310 = NameAndType        #311:#90      // getAbsolutePath:()Ljava/lang/String;
  #311 = Utf8               getAbsolutePath
  #312 = String             #313          // os.name
  #313 = Utf8               os.name
  #314 = Methodref          #145.#315     // java/lang/System.getProperty:(Ljava/lang/String;)Ljava/lang/String;
  #315 = NameAndType        #316:#317     // getProperty:(Ljava/lang/String;)Ljava/lang/String;
  #316 = Utf8               getProperty
  #317 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
  #318 = Methodref          #283.#319     // java/lang/String.toLowerCase:()Ljava/lang/String;
  #319 = NameAndType        #320:#90      // toLowerCase:()Ljava/lang/String;
  #320 = Utf8               toLowerCase
  #321 = String             #322          // win
  #322 = Utf8               win
  #323 = Methodref          #283.#324     // java/lang/String.contains:(Ljava/lang/CharSequence;)Z
  #324 = NameAndType        #325:#326     // contains:(Ljava/lang/CharSequence;)Z
  #325 = Utf8               contains
  #326 = Utf8               (Ljava/lang/CharSequence;)Z
  #327 = Class              #328          // java/lang/ProcessBuilder
  #328 = Utf8               java/lang/ProcessBuilder
  #329 = String             #330          // cmd.exe
  #330 = Utf8               cmd.exe
  #331 = String             #332          // /c
  #332 = Utf8               /c
  #333 = Methodref          #327.#334     // java/lang/ProcessBuilder."<init>":([Ljava/lang/String;)V
  #334 = NameAndType        #9:#335       // "<init>":([Ljava/lang/String;)V
  #335 = Utf8               ([Ljava/lang/String;)V
  #336 = String             #337          // bash
  #337 = Utf8               bash
  #338 = String             #339          // .
  #339 = Utf8               .
  #340 = Methodref          #327.#341     // java/lang/ProcessBuilder.directory:(Ljava/io/File;)Ljava/lang/ProcessBuilder;
  #341 = NameAndType        #342:#343     // directory:(Ljava/io/File;)Ljava/lang/ProcessBuilder;
  #342 = Utf8               directory
  #343 = Utf8               (Ljava/io/File;)Ljava/lang/ProcessBuilder;
  #344 = Methodref          #327.#345     // java/lang/ProcessBuilder.start:()Ljava/lang/Process;
  #345 = NameAndType        #346:#347     // start:()Ljava/lang/Process;
  #346 = Utf8               start
  #347 = Utf8               ()Ljava/lang/Process;
  #348 = String             #349          //      [OK] Script de restart executado com sucesso
  #349 = Utf8                    [OK] Script de restart executado com sucesso
  #350 = String             #351          //      -> Aguardando 2 segundos antes de encerrar...
  #351 = Utf8                    -> Aguardando 2 segundos antes de encerrar...
  #352 = Long               2000l
  #354 = String             #355          //      [AVISO] Script de restart nao encontrado
  #355 = Utf8                    [AVISO] Script de restart nao encontrado
  #356 = String             #357          //      -> Usando System.exit(2) para restart automatico
  #357 = Utf8                    -> Usando System.exit(2) para restart automatico
  #358 = String             #359          //      -> Certifique-se de que o script de inicializacao detecta exit code 2
  #359 = Utf8                    -> Certifique-se de que o script de inicializacao detecta exit code 2
  #360 = String             #361          //      Encerrando processo atual (exit code: 2 = restart)...
  #361 = Utf8                    Encerrando processo atual (exit code: 2 = restart)...
  #362 = Methodref          #145.#363     // java/lang/System.exit:(I)V
  #363 = NameAndType        #364:#74      // exit:(I)V
  #364 = Utf8               exit
  #365 = String             #366          //      [ERRO] Erro ao reiniciar servidor: {}
  #366 = Utf8                    [ERRO] Erro ao reiniciar servidor: {}
  #367 = String             #368          //      -> Tipo: {}
  #368 = Utf8                    -> Tipo: {}
  #369 = String             #370          //      -> Tentando encerrar com exit code 2 mesmo assim...
  #370 = Utf8                    -> Tentando encerrar com exit code 2 mesmo assim...
  #371 = Methodref          #12.#372      // ext/mods/commons/util/JvmOptimizer$HealthMonitor.interrupt:()V
  #372 = NameAndType        #373:#70      // interrupt:()V
  #373 = Utf8               interrupt
  #374 = Utf8               Code
  #375 = Utf8               LineNumberTable
  #376 = Utf8               LocalVariableTable
  #377 = Utf8               this
  #378 = Utf8               Lext/mods/commons/util/JvmOptimizer$HealthMonitor;
  #379 = Utf8               run
  #380 = Utf8               e
  #381 = Utf8               Ljava/lang/InterruptedException;
  #382 = Utf8               Ljava/lang/Exception;
  #383 = Utf8               StackMapTable
  #384 = Utf8               heapUsageAfter
  #385 = Utf8               Ljava/lang/management/MemoryUsage;
  #386 = Utf8               memoryUsageAfterPercent
  #387 = Utf8               D
  #388 = Utf8               memoryUsagePercent
  #389 = Utf8               memoryBean
  #390 = Utf8               Ljava/lang/management/MemoryMXBean;
  #391 = Utf8               heapUsage
  #392 = Utf8               usedMemory
  #393 = Utf8               maxMemory
  #394 = Utf8               threadBean
  #395 = Utf8               Ljava/lang/management/ThreadMXBean;
  #396 = Utf8               deadlockedThreads
  #397 = Utf8               [J
  #398 = Utf8               threadCount
  #399 = Utf8               peakThreadCount
  #400 = Class              #397          // "[J"
  #401 = Utf8               used
  #402 = Utf8               committed
  #403 = Utf8               minWaste
  #404 = Utf8               waste
  #405 = Utf8               cores
  #406 = Utf8               warnThreshold
  #407 = Utf8               warnPeakThreshold
  #408 = Utf8               now
  #409 = Utf8               f
  #410 = Utf8               Ljava/io/File;
  #411 = Utf8               script
  #412 = Utf8               Ljava/lang/String;
  #413 = Utf8               pb
  #414 = Utf8               Ljava/lang/ProcessBuilder;
  #415 = Utf8               os
  #416 = Utf8               delay
  #417 = Utf8               delaySeconds
  #418 = Utf8               restartScripts
  #419 = Utf8               [Ljava/lang/String;
  #420 = Utf8               restartScript
  #421 = Utf8               restartCount
  #422 = Class              #419          // "[Ljava/lang/String;"
  #423 = Utf8               stopMonitoring
  #424 = Utf8               SourceFile
  #425 = Utf8               JvmOptimizer.java
  #426 = Utf8               NestHost
  #427 = Utf8               InnerClasses
  #428 = Utf8               HealthMonitor
{
  public ext.mods.commons.util.JvmOptimizer$HealthMonitor();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: ldc           #3                  // String JvmOptimizer-HealthMonitor
         3: invokespecial #5                  // Method java/lang/Thread."<init>":(Ljava/lang/String;)V
         6: aload_0
         7: iconst_1
         8: putfield      #11                 // Field _running:Z
        11: aload_0
        12: iconst_1
        13: invokevirtual #17                 // Method setDaemon:(Z)V
        16: return
      LineNumberTable:
        line 876: 0
        line 872: 6
        line 877: 11
        line 878: 16
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      17     0  this   Lext/mods/commons/util/JvmOptimizer$HealthMonitor;

  public void run();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=2, args_size=1
         0: aload_0
         1: getfield      #11                 // Field _running:Z
         4: ifeq          148
         7: getstatic     #21                 // Field ext/mods/commons/util/JvmOptimizer._normalShutdown:Z
        10: ifne          148
        13: ldc2_w        #24                 // long 70000l
        16: invokestatic  #26                 // Method java/lang/Thread.sleep:(J)V
        19: getstatic     #21                 // Field ext/mods/commons/util/JvmOptimizer._normalShutdown:Z
        22: ifeq          28
        25: goto          148
        28: aload_0
        29: invokevirtual #30                 // Method checkServerHealth:()Z
        32: ifne          81
        35: getstatic     #34                 // Field ext/mods/commons/util/JvmOptimizer._consecutiveFailures:Ljava/util/concurrent/atomic/AtomicInteger;
        38: invokevirtual #38                 // Method java/util/concurrent/atomic/AtomicInteger.incrementAndGet:()I
        41: pop
        42: getstatic     #34                 // Field ext/mods/commons/util/JvmOptimizer._consecutiveFailures:Ljava/util/concurrent/atomic/AtomicInteger;
        45: invokevirtual #44                 // Method java/util/concurrent/atomic/AtomicInteger.get:()I
        48: iconst_5
        49: if_icmplt     88
        52: getstatic     #47                 // Field ext/mods/commons/util/JvmOptimizer.LOGGER:Lext/mods/commons/logging/CLogger;
        55: ldc           #51                 // String Multiplas falhas consecutivas detectadas ({}) - Reiniciando servidor...
        57: iconst_1
        58: anewarray     #53                 // class java/lang/Object
        61: dup
        62: iconst_0
        63: getstatic     #34                 // Field ext/mods/commons/util/JvmOptimizer._consecutiveFailures:Ljava/util/concurrent/atomic/AtomicInteger;
        66: invokevirtual #44                 // Method java/util/concurrent/atomic/AtomicInteger.get:()I
        69: invokestatic  #55                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        72: aastore
        73: invokevirtual #61                 // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;[Ljava/lang/Object;)V
        76: aload_0
        77: invokevirtual #67                 // Method restartServer:()V
        80: return
        81: getstatic     #34                 // Field ext/mods/commons/util/JvmOptimizer._consecutiveFailures:Ljava/util/concurrent/atomic/AtomicInteger;
        84: iconst_0
        85: invokevirtual #71                 // Method java/util/concurrent/atomic/AtomicInteger.set:(I)V
        88: goto          0
        91: astore_1
        92: getstatic     #47                 // Field ext/mods/commons/util/JvmOptimizer.LOGGER:Lext/mods/commons/logging/CLogger;
        95: ldc           #77                 // String   [AVISO] HealthMonitor interrompido - Encerrando monitoramento
        97: invokevirtual #79                 // Method ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;)V
       100: goto          148
       103: astore_1
       104: getstatic     #47                 // Field ext/mods/commons/util/JvmOptimizer.LOGGER:Lext/mods/commons/logging/CLogger;
       107: ldc           #85                 // String   [ERRO] Erro no HealthMonitor: {}
       109: iconst_1
       110: anewarray     #53                 // class java/lang/Object
       113: dup
       114: iconst_0
       115: aload_1
       116: invokevirtual #87                 // Method java/lang/Exception.getMessage:()Ljava/lang/String;
       119: aastore
       120: invokevirtual #61                 // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;[Ljava/lang/Object;)V
       123: getstatic     #47                 // Field ext/mods/commons/util/JvmOptimizer.LOGGER:Lext/mods/commons/logging/CLogger;
       126: ldc           #91                 // String      Tipo: {}
       128: iconst_1
       129: anewarray     #53                 // class java/lang/Object
       132: dup
       133: iconst_0
       134: aload_1
       135: invokevirtual #93                 // Method java/lang/Object.getClass:()Ljava/lang/Class;
       138: invokevirtual #97                 // Method java/lang/Class.getSimpleName:()Ljava/lang/String;
       141: aastore
       142: invokevirtual #61                 // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;[Ljava/lang/Object;)V
       145: goto          0
       148: return
      Exception table:
         from    to  target type
            13    25    91   Class java/lang/InterruptedException
            28    80    91   Class java/lang/InterruptedException
            81    88    91   Class java/lang/InterruptedException
            13    25   103   Class java/lang/Exception
            28    80   103   Class java/lang/Exception
            81    88   103   Class java/lang/Exception
      LineNumberTable:
        line 883: 0
        line 887: 13
        line 889: 19
        line 890: 25
        line 892: 28
        line 894: 35
        line 896: 42
        line 898: 52
        line 899: 66
        line 898: 73
        line 900: 76
        line 901: 80
        line 906: 81
        line 918: 88
        line 909: 91
        line 911: 92
        line 912: 100
        line 914: 103
        line 916: 104
        line 917: 123
        line 918: 145
        line 920: 148
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           92      11     1     e   Ljava/lang/InterruptedException;
          104      41     1     e   Ljava/lang/Exception;
            0     149     0  this   Lext/mods/commons/util/JvmOptimizer$HealthMonitor;
      StackMapTable: number_of_entries = 7
        frame_type = 0 /* same */
        frame_type = 27 /* same */
        frame_type = 52 /* same */
        frame_type = 6 /* same */
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/InterruptedException ]
        frame_type = 75 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 44 /* same */

  public void stopMonitoring();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: iconst_0
         2: putfield      #11                 // Field _running:Z
         5: aload_0
         6: invokevirtual #371                // Method interrupt:()V
         9: return
      LineNumberTable:
        line 1160: 0
        line 1161: 5
        line 1162: 9
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/commons/util/JvmOptimizer$HealthMonitor;
}
SourceFile: "JvmOptimizer.java"
NestHost: class ext/mods/commons/util/JvmOptimizer
