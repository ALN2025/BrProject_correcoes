// Bytecode for: ext.mods.commons.util.JvmOptimizer
// File: ext\mods\commons\util\JvmOptimizer.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/commons/util/JvmOptimizer.class
  Last modified 9 de jul de 2026; size 29410 bytes
  MD5 checksum 1fb00de7f092ef43a82e395c013dcbf4
  Compiled from "JvmOptimizer.java"
public final class ext.mods.commons.util.JvmOptimizer
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #8                          // ext/mods/commons/util/JvmOptimizer
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 24, methods: 36, attributes: 4
Constant pool:
     #1 = Methodref          #2.#3        // java/lang/Object."<init>":()V
     #2 = Class              #4           // java/lang/Object
     #3 = NameAndType        #5:#6        // "<init>":()V
     #4 = Utf8               java/lang/Object
     #5 = Utf8               <init>
     #6 = Utf8               ()V
     #7 = Fieldref           #8.#9        // ext/mods/commons/util/JvmOptimizer._initialized:Z
     #8 = Class              #10          // ext/mods/commons/util/JvmOptimizer
     #9 = NameAndType        #11:#12      // _initialized:Z
    #10 = Utf8               ext/mods/commons/util/JvmOptimizer
    #11 = Utf8               _initialized
    #12 = Utf8               Z
    #13 = String             #14          // launcher
    #14 = Utf8               launcher
    #15 = String             #16          // brproject.role
    #16 = Utf8               brproject.role
    #17 = Methodref          #18.#19      // java/lang/System.getProperty:(Ljava/lang/String;)Ljava/lang/String;
    #18 = Class              #20          // java/lang/System
    #19 = NameAndType        #21:#22      // getProperty:(Ljava/lang/String;)Ljava/lang/String;
    #20 = Utf8               java/lang/System
    #21 = Utf8               getProperty
    #22 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
    #23 = Methodref          #24.#25      // java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
    #24 = Class              #26          // java/lang/String
    #25 = NameAndType        #27:#28      // equalsIgnoreCase:(Ljava/lang/String;)Z
    #26 = Utf8               java/lang/String
    #27 = Utf8               equalsIgnoreCase
    #28 = Utf8               (Ljava/lang/String;)Z
    #29 = String             #30          // java.version
    #30 = Utf8               java.version
    #31 = Methodref          #8.#32       // ext/mods/commons/util/JvmOptimizer.getMajorVersion:(Ljava/lang/String;)I
    #32 = NameAndType        #33:#34      // getMajorVersion:(Ljava/lang/String;)I
    #33 = Utf8               getMajorVersion
    #34 = Utf8               (Ljava/lang/String;)I
    #35 = Methodref          #8.#36       // ext/mods/commons/util/JvmOptimizer.isVerboseStartup:()Z
    #36 = NameAndType        #37:#38      // isVerboseStartup:()Z
    #37 = Utf8               isVerboseStartup
    #38 = Utf8               ()Z
    #39 = Methodref          #8.#40       // ext/mods/commons/util/JvmOptimizer.configureSilentLogger:()V
    #40 = NameAndType        #41:#6       // configureSilentLogger:()V
    #41 = Utf8               configureSilentLogger
    #42 = Methodref          #8.#43       // ext/mods/commons/util/JvmOptimizer.applyJdk25Optimizations:()V
    #43 = NameAndType        #44:#6       // applyJdk25Optimizations:()V
    #44 = Utf8               applyJdk25Optimizations
    #45 = Methodref          #8.#46       // ext/mods/commons/util/JvmOptimizer.applyStandardOptimizations:()V
    #46 = NameAndType        #47:#6       // applyStandardOptimizations:()V
    #47 = Utf8               applyStandardOptimizations
    #48 = Methodref          #8.#49       // ext/mods/commons/util/JvmOptimizer.checkAndOptimizeAppCDS:()V
    #49 = NameAndType        #50:#6       // checkAndOptimizeAppCDS:()V
    #50 = Utf8               checkAndOptimizeAppCDS
    #51 = Methodref          #8.#52       // ext/mods/commons/util/JvmOptimizer.suggestGcSettings:(I)V
    #52 = NameAndType        #53:#54      // suggestGcSettings:(I)V
    #53 = Utf8               suggestGcSettings
    #54 = Utf8               (I)V
    #55 = Methodref          #8.#56       // ext/mods/commons/util/JvmOptimizer.initializeHealthMonitoring:()V
    #56 = NameAndType        #57:#6       // initializeHealthMonitoring:()V
    #57 = Utf8               initializeHealthMonitoring
    #58 = Methodref          #8.#59       // ext/mods/commons/util/JvmOptimizer.configureJvmOptimizerLogger:()V
    #59 = NameAndType        #60:#6       // configureJvmOptimizerLogger:()V
    #60 = Utf8               configureJvmOptimizerLogger
    #61 = String             #62          // java.vendor
    #62 = Utf8               java.vendor
    #63 = Fieldref           #8.#64       // ext/mods/commons/util/JvmOptimizer.LOGGER:Lext/mods/commons/logging/CLogger;
    #64 = NameAndType        #65:#66      // LOGGER:Lext/mods/commons/logging/CLogger;
    #65 = Utf8               LOGGER
    #66 = Utf8               Lext/mods/commons/logging/CLogger;
    #67 = String             #68          //
    #68 = Utf8
    #69 = Methodref          #70.#71      // ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;)V
    #70 = Class              #72          // ext/mods/commons/logging/CLogger
    #71 = NameAndType        #73:#74      // info:(Ljava/lang/Object;)V
    #72 = Utf8               ext/mods/commons/logging/CLogger
    #73 = Utf8               info
    #74 = Utf8               (Ljava/lang/Object;)V
    #75 = String             #76          // ================================================================
    #76 = Utf8               ================================================================
    #77 = String             #78          //            JVM OPTIMIZER - Inicializando Sistema
    #78 = Utf8                          JVM OPTIMIZER - Inicializando Sistema
    #79 = String             #80          //   Informacoes do Ambiente Java:
    #80 = Utf8                 Informacoes do Ambiente Java:
    #81 = String             #82          //      - Versao: {} ({})
    #82 = Utf8                    - Versao: {} ({})
    #83 = Methodref          #70.#84      // ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
    #84 = NameAndType        #73:#85      // info:(Ljava/lang/Object;[Ljava/lang/Object;)V
    #85 = Utf8               (Ljava/lang/Object;[Ljava/lang/Object;)V
    #86 = String             #87          //      - Status: JDK 25+ detectado - Aplicando otimizacoes avancadas
    #87 = Utf8                    - Status: JDK 25+ detectado - Aplicando otimizacoes avancadas
    #88 = String             #89          //      - Status: JDK {} detectado - Aplicando otimizacoes padrao
    #89 = Utf8                    - Status: JDK {} detectado - Aplicando otimizacoes padrao
    #90 = Methodref          #91.#92      // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
    #91 = Class              #93          // java/lang/Integer
    #92 = NameAndType        #94:#95      // valueOf:(I)Ljava/lang/Integer;
    #93 = Utf8               java/lang/Integer
    #94 = Utf8               valueOf
    #95 = Utf8               (I)Ljava/lang/Integer;
    #96 = String             #97          //   [AppCDS] Verificando subsistema de Class Data Sharing...
    #97 = Utf8                 [AppCDS] Verificando subsistema de Class Data Sharing...
    #98 = Class              #99          // java/io/File
    #99 = Utf8               java/io/File
   #100 = String             #101         // cache
   #101 = Utf8               cache
   #102 = Methodref          #98.#103     // java/io/File."<init>":(Ljava/lang/String;)V
   #103 = NameAndType        #5:#104      // "<init>":(Ljava/lang/String;)V
   #104 = Utf8               (Ljava/lang/String;)V
   #105 = Methodref          #98.#106     // java/io/File.exists:()Z
   #106 = NameAndType        #107:#38     // exists:()Z
   #107 = Utf8               exists
   #108 = Methodref          #98.#109     // java/io/File.mkdirs:()Z
   #109 = NameAndType        #110:#38     // mkdirs:()Z
   #110 = Utf8               mkdirs
   #111 = String             #112         // cache/brproject_cds.jsa
   #112 = Utf8               cache/brproject_cds.jsa
   #113 = Methodref          #114.#115    // java/lang/management/ManagementFactory.getRuntimeMXBean:()Ljava/lang/management/RuntimeMXBean;
   #114 = Class              #116         // java/lang/management/ManagementFactory
   #115 = NameAndType        #117:#118    // getRuntimeMXBean:()Ljava/lang/management/RuntimeMXBean;
   #116 = Utf8               java/lang/management/ManagementFactory
   #117 = Utf8               getRuntimeMXBean
   #118 = Utf8               ()Ljava/lang/management/RuntimeMXBean;
   #119 = String             #120         //
   #120 = Utf8
   #121 = InterfaceMethodref #122.#123    // java/lang/management/RuntimeMXBean.getInputArguments:()Ljava/util/List;
   #122 = Class              #124         // java/lang/management/RuntimeMXBean
   #123 = NameAndType        #125:#126    // getInputArguments:()Ljava/util/List;
   #124 = Utf8               java/lang/management/RuntimeMXBean
   #125 = Utf8               getInputArguments
   #126 = Utf8               ()Ljava/util/List;
   #127 = Methodref          #24.#128     // java/lang/String.join:(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;
   #128 = NameAndType        #129:#130    // join:(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;
   #129 = Utf8               join
   #130 = Utf8               (Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;
   #131 = String             #132         // -XX:+AutoCreateSharedArchive
   #132 = Utf8               -XX:+AutoCreateSharedArchive
   #133 = Methodref          #24.#134     // java/lang/String.contains:(Ljava/lang/CharSequence;)Z
   #134 = NameAndType        #135:#136    // contains:(Ljava/lang/CharSequence;)Z
   #135 = Utf8               contains
   #136 = Utf8               (Ljava/lang/CharSequence;)Z
   #137 = String             #138         // -XX:SharedArchiveFile
   #138 = Utf8               -XX:SharedArchiveFile
   #139 = String             #140         // -XX:+UseZGC
   #140 = Utf8               -XX:+UseZGC
   #141 = String             #142         //      [AVISO] ZGC + AppCDS: heap CDS incompativel (compressed oops desligado).
   #142 = Utf8                    [AVISO] ZGC + AppCDS: heap CDS incompativel (compressed oops desligado).
   #143 = Methodref          #70.#144     // ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;)V
   #144 = NameAndType        #145:#74     // warn:(Ljava/lang/Object;)V
   #145 = Utf8               warn
   #146 = String             #147         //         -> Remova -XX:+AutoCreateSharedArchive ou use G1GC nos scripts .bat.
   #147 = Utf8                       -> Remova -XX:+AutoCreateSharedArchive ou use G1GC nos scripts .bat.
   #148 = String             #149         //         -> Apague {} antes de iniciar.
   #149 = Utf8                       -> Apague {} antes de iniciar.
   #150 = Methodref          #70.#151     // ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;[Ljava/lang/Object;)V
   #151 = NameAndType        #145:#85     // warn:(Ljava/lang/Object;[Ljava/lang/Object;)V
   #152 = String             #153         //      [OK] AppCDS ativo e funcional!
   #153 = Utf8                    [OK] AppCDS ativo e funcional!
   #154 = String             #155         //         -> Snapshot carregado de: {}
   #155 = Utf8                       -> Snapshot carregado de: {}
   #156 = String             #157         //         -> Boot do servidor acelerado (classes pre-compiladas em cache).
   #157 = Utf8                       -> Boot do servidor acelerado (classes pre-compiladas em cache).
   #158 = String             #159         //      [Treinamento] AppCDS em modo de criacao.
   #159 = Utf8                    [Treinamento] AppCDS em modo de criacao.
   #160 = String             #161         //         -> O arquivo {} ainda nao existe ou as classes foram atualizadas.
   #161 = Utf8                       -> O arquivo {} ainda nao existe ou as classes foram atualizadas.
   #162 = String             #163         //         -> A JVM criara o snapshot automaticamente ao encerrar o servidor.
   #163 = Utf8                       -> A JVM criara o snapshot automaticamente ao encerrar o servidor.
   #164 = String             #165         //         -> O proximo boot ja sera mais rapido.
   #165 = Utf8                       -> O proximo boot ja sera mais rapido.
   #166 = String             #167         //         -> No shutdown, avisos [cds] sobre JFR/proxy sao normais (classes nao arquivaveis).
   #167 = Utf8                       -> No shutdown, avisos [cds] sobre JFR/proxy sao normais (classes nao arquivaveis).
   #168 = String             #169         //         -> Use classpath fixo (cache/brproject-classpath.inc.bat); evite libs/* no Windows.
   #169 = Utf8                       -> Use classpath fixo (cache/brproject-classpath.inc.bat); evite libs/* no Windows.
   #170 = String             #171         //      [OFF] AppCDS desativado na linha de comando (.bat / .sh)!
   #171 = Utf8                    [OFF] AppCDS desativado na linha de comando (.bat / .sh)!
   #172 = String             #173         //         Para ativar boot ultra-rapido, adicione as flags no executor:
   #173 = Utf8                       Para ativar boot ultra-rapido, adicione as flags no executor:
   #174 = String             #175         //         -XX:+AutoCreateSharedArchive -XX:SharedArchiveFile={}
   #175 = Utf8                       -XX:+AutoCreateSharedArchive -XX:SharedArchiveFile={}
   #176 = String             #177         //   Iniciando aplicacao de otimizacoes JDK 25...
   #177 = Utf8                 Iniciando aplicacao de otimizacoes JDK 25...
   #178 = Methodref          #8.#179      // ext/mods/commons/util/JvmOptimizer.optimizeCompactObjectHeaders:()V
   #179 = NameAndType        #180:#6      // optimizeCompactObjectHeaders:()V
   #180 = Utf8               optimizeCompactObjectHeaders
   #181 = Methodref          #8.#182      // ext/mods/commons/util/JvmOptimizer.optimizeAheadOfTimeErgonomics:()V
   #182 = NameAndType        #183:#6      // optimizeAheadOfTimeErgonomics:()V
   #183 = Utf8               optimizeAheadOfTimeErgonomics
   #184 = Methodref          #8.#185      // ext/mods/commons/util/JvmOptimizer.optimizeAheadOfTimeProfiling:()V
   #185 = NameAndType        #186:#6      // optimizeAheadOfTimeProfiling:()V
   #186 = Utf8               optimizeAheadOfTimeProfiling
   #187 = Methodref          #8.#188      // ext/mods/commons/util/JvmOptimizer.optimizeJfrMethodTiming:()V
   #188 = NameAndType        #189:#6      // optimizeJfrMethodTiming:()V
   #189 = Utf8               optimizeJfrMethodTiming
   #190 = Methodref          #8.#191      // ext/mods/commons/util/JvmOptimizer.optimizeMemorySettings:()V
   #191 = NameAndType        #192:#6      // optimizeMemorySettings:()V
   #192 = Utf8               optimizeMemorySettings
   #193 = Methodref          #8.#194      // ext/mods/commons/util/JvmOptimizer.optimizeGcSettings:()V
   #194 = NameAndType        #195:#6      // optimizeGcSettings:()V
   #195 = Utf8               optimizeGcSettings
   #196 = Methodref          #8.#197      // ext/mods/commons/util/JvmOptimizer.optimizeJitSettings:()V
   #197 = NameAndType        #198:#6      // optimizeJitSettings:()V
   #198 = Utf8               optimizeJitSettings
   #199 = String             #200         //   [OK] Todas as otimizacoes JDK 25 foram aplicadas com sucesso!
   #200 = Utf8                 [OK] Todas as otimizacoes JDK 25 foram aplicadas com sucesso!
   #201 = Class              #202         // java/lang/Exception
   #202 = Utf8               java/lang/Exception
   #203 = String             #204         //   [AVISO] Erro ao aplicar otimizacoes JDK 25: {}
   #204 = Utf8                 [AVISO] Erro ao aplicar otimizacoes JDK 25: {}
   #205 = Methodref          #201.#206    // java/lang/Exception.getMessage:()Ljava/lang/String;
   #206 = NameAndType        #207:#208    // getMessage:()Ljava/lang/String;
   #207 = Utf8               getMessage
   #208 = Utf8               ()Ljava/lang/String;
   #209 = String             #210         //      Detalhes: {}
   #210 = Utf8                    Detalhes: {}
   #211 = Methodref          #2.#212      // java/lang/Object.getClass:()Ljava/lang/Class;
   #212 = NameAndType        #213:#214    // getClass:()Ljava/lang/Class;
   #213 = Utf8               getClass
   #214 = Utf8               ()Ljava/lang/Class;
   #215 = Methodref          #216.#217    // java/lang/Class.getSimpleName:()Ljava/lang/String;
   #216 = Class              #218         // java/lang/Class
   #217 = NameAndType        #219:#208    // getSimpleName:()Ljava/lang/String;
   #218 = Utf8               java/lang/Class
   #219 = Utf8               getSimpleName
   #220 = String             #221         //   Aplicando otimizacoes padrao para JDK {}...
   #221 = Utf8                 Aplicando otimizacoes padrao para JDK {}...
   #222 = String             #223         //   [OK] Otimizacoes padrao aplicadas com sucesso.
   #223 = Utf8                 [OK] Otimizacoes padrao aplicadas com sucesso.
   #224 = String             #225         //   [AVISO] Erro ao aplicar otimizacoes padrao: {}
   #225 = Utf8                 [AVISO] Erro ao aplicar otimizacoes padrao: {}
   #226 = String             #227         // jdk.objectAlignment
   #227 = Utf8               jdk.objectAlignment
   #228 = String             #229         // 8
   #229 = Utf8               8
   #230 = Methodref          #18.#231     // java/lang/System.setProperty:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #231 = NameAndType        #232:#233    // setProperty:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #232 = Utf8               setProperty
   #233 = Utf8               (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #234 = String             #235         // jdk.compactObjectHeaders
   #235 = Utf8               jdk.compactObjectHeaders
   #236 = String             #237         // true
   #237 = Utf8               true
   #238 = String             #239         // jdk.enableObjectAlignment
   #239 = Utf8               jdk.enableObjectAlignment
   #240 = String             #241         //      [OK] JEP 519: Cabecalhos de Objetos Compactos
   #241 = Utf8                    [OK] JEP 519: Cabecalhos de Objetos Compactos
   #242 = String             #243         //         -> Reduz overhead de memoria por objeto em arquiteturas 64-bit
   #243 = Utf8                       -> Reduz overhead de memoria por objeto em arquiteturas 64-bit
   #244 = String             #245         //         -> Melhora densidade de implementacao e eficiencia de memoria
   #245 = Utf8                       -> Melhora densidade de implementacao e eficiencia de memoria
   #246 = String             #247         //      [AVISO] Erro ao configurar cabecalhos compactos: {}
   #247 = Utf8                    [AVISO] Erro ao configurar cabecalhos compactos: {}
   #248 = String             #249         // jdk.aot.enable
   #249 = Utf8               jdk.aot.enable
   #250 = String             #251         // jdk.aot.mode
   #251 = Utf8               jdk.aot.mode
   #252 = String             #253         // normal
   #253 = Utf8               normal
   #254 = String             #255         // jdk.aot.cacheDirectory
   #255 = Utf8               jdk.aot.cacheDirectory
   #256 = String             #257         // ./cache/aot
   #257 = Utf8               ./cache/aot
   #258 = String             #259         // jdk.aot.verbose
   #259 = Utf8               jdk.aot.verbose
   #260 = String             #261         // false
   #261 = Utf8               false
   #262 = String             #263         // jdk.cmdline.ergonomics
   #263 = Utf8               jdk.cmdline.ergonomics
   #264 = String             #265         // jdk.cmdline.optimize
   #265 = Utf8               jdk.cmdline.optimize
   #266 = String             #267         //      [OK] JEP 514: Ergonomia de Linha de Comando Antecipada
   #267 = Utf8                    [OK] JEP 514: Ergonomia de Linha de Comando Antecipada
   #268 = String             #269         //         -> Criacao de caches antecipados habilitada
   #269 = Utf8                       -> Criacao de caches antecipados habilitada
   #270 = String             #271         //         -> Acelera inicializacao de aplicacoes Java
   #271 = Utf8                       -> Acelera inicializacao de aplicacoes Java
   #272 = String             #273         //         -> Cache AOT configurado em: ./cache/aot
   #273 = Utf8                       -> Cache AOT configurado em: ./cache/aot
   #274 = String             #275         //      [AVISO] Erro ao configurar ergonomia antecipada: {}
   #275 = Utf8                    [AVISO] Erro ao configurar ergonomia antecipada: {}
   #276 = String             #277         // jdk.aot.profiling.enable
   #277 = Utf8               jdk.aot.profiling.enable
   #278 = String             #279         // jdk.aot.profiling.mode
   #279 = Utf8               jdk.aot.profiling.mode
   #280 = String             #281         // training
   #281 = Utf8               training
   #282 = String             #283         // jdk.aot.profiling.directory
   #283 = Utf8               jdk.aot.profiling.directory
   #284 = String             #285         // ./cache/profiles
   #285 = Utf8               ./cache/profiles
   #286 = String             #287         // jdk.aot.profiling.interval
   #287 = Utf8               jdk.aot.profiling.interval
   #288 = String             #289         // 1000
   #289 = Utf8               1000
   #290 = String             #291         // jdk.jit.warmup.enable
   #291 = Utf8               jdk.jit.warmup.enable
   #292 = String             #293         // jdk.jit.warmup.threshold
   #293 = Utf8               jdk.jit.warmup.threshold
   #294 = String             #295         // 10000
   #295 = Utf8               10000
   #296 = String             #297         // jdk.jit.warmup.profile
   #297 = Utf8               jdk.jit.warmup.profile
   #298 = String             #299         // jdk.aot.training.enable
   #299 = Utf8               jdk.aot.training.enable
   #300 = String             #301         // jdk.aot.training.iterations
   #301 = Utf8               jdk.aot.training.iterations
   #302 = String             #303         // 3
   #303 = Utf8               3
   #304 = String             #305         //      [OK] JEP 515: Criacao de Perfil de Metodo Antecipado
   #305 = Utf8                    [OK] JEP 515: Criacao de Perfil de Metodo Antecipado
   #306 = String             #307         //         -> Coleta de perfis deslocada para execucoes de treinamento
   #307 = Utf8                       -> Coleta de perfis deslocada para execucoes de treinamento
   #308 = String             #309         //         -> Melhora tempo de aquecimento (warm-up) das aplicacoes
   #309 = Utf8                       -> Melhora tempo de aquecimento (warm-up) das aplicacoes
   #310 = String             #311         //         -> Perfis salvos em: ./cache/profiles
   #311 = Utf8                       -> Perfis salvos em: ./cache/profiles
   #312 = String             #313         //      [AVISO] Erro ao configurar perfil antecipado: {}
   #313 = Utf8                    [AVISO] Erro ao configurar perfil antecipado: {}
   #314 = String             #315         // -XX:+FlightRecorder
   #315 = Utf8               -XX:+FlightRecorder
   #316 = String             #317         // -XX:StartFlightRecording
   #317 = Utf8               -XX:StartFlightRecording
   #318 = String             #319         // jdk.jfr.methodTiming.enable
   #319 = Utf8               jdk.jfr.methodTiming.enable
   #320 = String             #321         // jdk.jfr.methodTiming.threshold
   #321 = Utf8               jdk.jfr.methodTiming.threshold
   #322 = String             #323         // jdk.jfr.methodTracing.enable
   #323 = Utf8               jdk.jfr.methodTracing.enable
   #324 = String             #325         // jdk.jfr.methodTracing.samples
   #325 = Utf8               jdk.jfr.methodTracing.samples
   #326 = String             #327         // 100
   #327 = Utf8               100
   #328 = String             #329         // jdk.jfr.profiling.enable
   #329 = Utf8               jdk.jfr.profiling.enable
   #330 = String             #331         // jdk.jfr.profiling.interval
   #331 = Utf8               jdk.jfr.profiling.interval
   #332 = String             #333         // 10
   #333 = Utf8               10
   #334 = String             #335         //      [OK] JEP 520: Temporizacao e Rastreamento de Metodos com JFR
   #335 = Utf8                    [OK] JEP 520: Temporizacao e Rastreamento de Metodos com JFR
   #336 = String             #337         //         -> Temporizacao de metodos habilitada (threshold: 1ms)
   #337 = Utf8                       -> Temporizacao de metodos habilitada (threshold: 1ms)
   #338 = String             #339         //         -> Rastreamento de metodos ativo (samples: 100)
   #339 = Utf8                       -> Rastreamento de metodos ativo (samples: 100)
   #340 = String             #341         //         -> Profiling habilitado (interval: 10ms)
   #341 = Utf8                       -> Profiling habilitado (interval: 10ms)
   #342 = String             #343         //         [INFO] Dica: Adicione -XX:+FlightRecorder para JFR completo
   #343 = Utf8                       [INFO] Dica: Adicione -XX:+FlightRecorder para JFR completo
   #344 = String             #345         //      [OK] JEP 520: JFR ja detectado - Temporizacao de metodos habilitada
   #345 = Utf8                    [OK] JEP 520: JFR ja detectado - Temporizacao de metodos habilitada
   #346 = String             #347         //         -> Integracao com Java Flight Recorder ativa
   #347 = Utf8                       -> Integracao com Java Flight Recorder ativa
   #348 = String             #349         //      [AVISO] Erro ao configurar JFR method timing: {}
   #349 = Utf8                    [AVISO] Erro ao configurar JFR method timing: {}
   #350 = String             #351         // java.lang.ref.SoftReference.clearInterval
   #351 = Utf8               java.lang.ref.SoftReference.clearInterval
   #352 = String             #353         // jdk.internal.arraycopy.optimize
   #353 = Utf8               jdk.internal.arraycopy.optimize
   #354 = String             #355         // jdk.memory.optimize
   #355 = Utf8               jdk.memory.optimize
   #356 = String             #357         // jdk.memory.compact
   #357 = Utf8               jdk.memory.compact
   #358 = String             #359         // jdk.zgc.enableLargePages
   #359 = Utf8               jdk.zgc.enableLargePages
   #360 = String             #361         // jdk.zgc.threadStackSize
   #361 = Utf8               jdk.zgc.threadStackSize
   #362 = String             #363         // 256k
   #363 = Utf8               256k
   #364 = String             #365         // jdk.zgc.parallelGCThreads
   #365 = Utf8               jdk.zgc.parallelGCThreads
   #366 = Methodref          #367.#368    // java/lang/Runtime.getRuntime:()Ljava/lang/Runtime;
   #367 = Class              #369         // java/lang/Runtime
   #368 = NameAndType        #370:#371    // getRuntime:()Ljava/lang/Runtime;
   #369 = Utf8               java/lang/Runtime
   #370 = Utf8               getRuntime
   #371 = Utf8               ()Ljava/lang/Runtime;
   #372 = Methodref          #367.#373    // java/lang/Runtime.availableProcessors:()I
   #373 = NameAndType        #374:#375    // availableProcessors:()I
   #374 = Utf8               availableProcessors
   #375 = Utf8               ()I
   #376 = Methodref          #377.#378    // java/lang/Math.max:(II)I
   #377 = Class              #379         // java/lang/Math
   #378 = NameAndType        #380:#381    // max:(II)I
   #379 = Utf8               java/lang/Math
   #380 = Utf8               max
   #381 = Utf8               (II)I
   #382 = Methodref          #24.#383     // java/lang/String.valueOf:(I)Ljava/lang/String;
   #383 = NameAndType        #94:#384     // valueOf:(I)Ljava/lang/String;
   #384 = Utf8               (I)Ljava/lang/String;
   #385 = String             #386         // jdk.zgc.concurrentGCThreads
   #386 = Utf8               jdk.zgc.concurrentGCThreads
   #387 = String             #388         // jdk.zgc.optimize
   #388 = Utf8               jdk.zgc.optimize
   #389 = String             #390         // jdk.zgc.compact
   #390 = Utf8               jdk.zgc.compact
   #391 = String             #392         // jdk.zgc.fastPath
   #392 = Utf8               jdk.zgc.fastPath
   #393 = String             #394         // jdk.g1.enableStringDeduplication
   #394 = Utf8               jdk.g1.enableStringDeduplication
   #395 = String             #396         // jdk.g1.optimize
   #396 = Utf8               jdk.g1.optimize
   #397 = String             #398         // jdk.g1.adaptiveIHOP
   #398 = Utf8               jdk.g1.adaptiveIHOP
   #399 = String             #400         // jdk.g1.parallelGCThreads
   #400 = Utf8               jdk.g1.parallelGCThreads
   #401 = String             #402         // jdk.g1.compact
   #402 = Utf8               jdk.g1.compact
   #403 = String             #404         // jdk.g1.fastPath
   #404 = Utf8               jdk.g1.fastPath
   #405 = String             #406         // jdk.g1.incrementalCompaction
   #406 = Utf8               jdk.g1.incrementalCompaction
   #407 = String             #408         // jdk.gc.optimize
   #408 = Utf8               jdk.gc.optimize
   #409 = String             #410         // jdk.gc.compact
   #410 = Utf8               jdk.gc.compact
   #411 = String             #412         //      [OK] Garbage Collector (GC) Otimizado
   #412 = Utf8                    [OK] Garbage Collector (GC) Otimizado
   #413 = String             #414         //         -> ZGC: Large Pages, Fast Path, Compact habilitados
   #414 = Utf8                       -> ZGC: Large Pages, Fast Path, Compact habilitados
   #415 = String             #416         //         -> G1GC: Periodic GC {}ms, shrink heap, String Dedup, Adaptive IHOP
   #416 = Utf8                       -> G1GC: Periodic GC {}ms, shrink heap, String Dedup, Adaptive IHOP
   #417 = Long               70000l
   #419 = Methodref          #420.#421    // java/lang/Long.valueOf:(J)Ljava/lang/Long;
   #420 = Class              #422         // java/lang/Long
   #421 = NameAndType        #94:#423     // valueOf:(J)Ljava/lang/Long;
   #422 = Utf8               java/lang/Long
   #423 = Utf8               (J)Ljava/lang/Long;
   #424 = String             #425         //         -> Threads configuradas automaticamente baseado em {} processadores
   #425 = Utf8                       -> Threads configuradas automaticamente baseado em {} processadores
   #426 = String             #427         // jdk.jit.enableIncrementalCompilation
   #427 = Utf8               jdk.jit.enableIncrementalCompilation
   #428 = String             #429         // jdk.jit.compilationThreshold
   #429 = Utf8               jdk.jit.compilationThreshold
   #430 = String             #431         // jdk.jit.optimize
   #431 = Utf8               jdk.jit.optimize
   #432 = String             #433         // jdk.jit.aggressive
   #433 = Utf8               jdk.jit.aggressive
   #434 = String             #435         // jdk.jit.inline
   #435 = Utf8               jdk.jit.inline
   #436 = String             #437         // jdk.jit.inlineThreshold
   #437 = Utf8               jdk.jit.inlineThreshold
   #438 = String             #439         // 35
   #439 = Utf8               35
   #440 = String             #441         // jdk.jit.codeCache
   #441 = Utf8               jdk.jit.codeCache
   #442 = String             #443         // jdk.jit.codeCacheSize
   #443 = Utf8               jdk.jit.codeCacheSize
   #444 = String             #445         // 240m
   #445 = Utf8               240m
   #446 = String             #447         // jdk.jit.codeCacheReservedSize
   #447 = Utf8               jdk.jit.codeCacheReservedSize
   #448 = String             #449         // 48m
   #449 = Utf8               48m
   #450 = String             #451         // jdk.jit.loopOptimization
   #451 = Utf8               jdk.jit.loopOptimization
   #452 = String             #453         // jdk.jit.loopUnrolling
   #453 = Utf8               jdk.jit.loopUnrolling
   #454 = String             #455         // jdk.jit.loopUnrollingLimit
   #455 = Utf8               jdk.jit.loopUnrollingLimit
   #456 = String             #457         // 60
   #457 = Utf8               60
   #458 = String             #459         // jdk.jit.escapeAnalysis
   #459 = Utf8               jdk.jit.escapeAnalysis
   #460 = String             #461         // jdk.jit.eliminateAllocations
   #461 = Utf8               jdk.jit.eliminateAllocations
   #462 = String             #463         // jdk.jit.inlineFrequency
   #463 = Utf8               jdk.jit.inlineFrequency
   #464 = String             #465         // jdk.jit.inlineHotMethods
   #465 = Utf8               jdk.jit.inlineHotMethods
   #466 = String             #467         //      [OK] Compilador JIT Otimizado
   #467 = Utf8                    [OK] Compilador JIT Otimizado
   #468 = String             #469         //         -> Compilacao incremental habilitada
   #469 = Utf8                       -> Compilacao incremental habilitada
   #470 = String             #471         //         -> Loop unrolling, Escape Analysis, Inlining otimizado
   #471 = Utf8                       -> Loop unrolling, Escape Analysis, Inlining otimizado
   #472 = String             #473         //         -> Code Cache: 240MB (Reservado: 48MB)
   #473 = Utf8                       -> Code Cache: 240MB (Reservado: 48MB)
   #474 = String             #475         // -XX:+Use
   #475 = Utf8               -XX:+Use
   #476 = String             #477         // GC
   #477 = Utf8               GC
   #478 = String             #479         // ZGC
   #479 = Utf8               ZGC
   #480 = String             #481         // G1GC
   #481 = Utf8               G1GC
   #482 = String             #483         //   [OK] Configuracoes de GC detectadas nos argumentos da JVM
   #483 = Utf8                 [OK] Configuracoes de GC detectadas nos argumentos da JVM
   #484 = String             #485         //      -> Sistema ja esta otimizado para Garbage Collection
   #485 = Utf8                    -> Sistema ja esta otimizado para Garbage Collection
   #486 = String             #487         //   SUGESTOES DE CONFIGURACOES JVM PARA JDK 25+
   #487 = Utf8                 SUGESTOES DE CONFIGURACOES JVM PARA JDK 25+
   #488 = String             #489         //      Para melhor performance, adicione estas flags JVM ao iniciar o servidor:
   #489 = Utf8                    Para melhor performance, adicione estas flags JVM ao iniciar o servidor:
   #490 = String             #491         //      +--- GARBAGE COLLECTOR -------------------------------------------------+
   #491 = Utf8                    +--- GARBAGE COLLECTOR -------------------------------------------------+
   #492 = String             #493         //      |                                                                      |
   #493 = Utf8                    |                                                                      |
   #494 = String             #495         //      | ZGC (Recomendado para servidores com muita memoria):                |
   #495 = Utf8                    | ZGC (Recomendado para servidores com muita memoria):                |
   #496 = String             #497         //      |   -XX:+UseZGC -XX:+UnlockExperimentalVMOptions                      |
   #497 = Utf8                    |   -XX:+UseZGC -XX:+UnlockExperimentalVMOptions                      |
   #498 = String             #499         //      |   -XX:+UseLargePages -XX:ZCollectionInterval=5                        |
   #499 = Utf8                    |   -XX:+UseLargePages -XX:ZCollectionInterval=5                        |
   #500 = String             #501         //      |   -XX:ZUncommitDelay=300 -XX:ZUncommit=1                             |
   #501 = Utf8                    |   -XX:ZUncommitDelay=300 -XX:ZUncommit=1                             |
   #502 = String             #503         //      | G1GC (Recomendado para uso geral):                                  |
   #503 = Utf8                    | G1GC (Recomendado para uso geral):                                  |
   #504 = String             #505         //      |   -XX:+UseG1GC -XX:MaxGCPauseMillis=200                             |
   #505 = Utf8                    |   -XX:+UseG1GC -XX:MaxGCPauseMillis=200                             |
   #506 = String             #507         //      |   -XX:G1HeapRegionSize=16m -XX:+G1UseAdaptiveIHOP                     |
   #507 = Utf8                    |   -XX:G1HeapRegionSize=16m -XX:+G1UseAdaptiveIHOP                     |
   #508 = String             #509         //      |   -XX:G1ReservePercent=20 -XX:InitiatingHeapOccupancyPercent=45       |
   #509 = Utf8                    |   -XX:G1ReservePercent=20 -XX:InitiatingHeapOccupancyPercent=45       |
   #510 = String             #511         //      +----------------------------------------------------------------------+
   #511 = Utf8                    +----------------------------------------------------------------------+
   #512 = String             #513         //      +--- JEP 519: CABECALHOS COMPACTOS ------------------------------------+
   #513 = Utf8                    +--- JEP 519: CABECALHOS COMPACTOS ------------------------------------+
   #514 = String             #515         //      |   -XX:+UseCompactObjectHeaders                                       |
   #515 = Utf8                    |   -XX:+UseCompactObjectHeaders                                       |
   #516 = String             #517         //      |   -> Reduz overhead de memoria por objeto                           |
   #517 = Utf8                    |   -> Reduz overhead de memoria por objeto                           |
   #518 = String             #519         //      +--- JEP 514/515: AHEAD-OF-TIME ----------------------------------------+
   #519 = Utf8                    +--- JEP 514/515: AHEAD-OF-TIME ----------------------------------------+
   #520 = String             #521         //      |   -XX:+AOT                                                           |
   #521 = Utf8                    |   -XX:+AOT                                                           |
   #522 = String             #523         //      |   -XX:AOTLibrary=./cache/aot/libjava.so                             |
   #523 = Utf8                    |   -XX:AOTLibrary=./cache/aot/libjava.so                             |
   #524 = String             #525         //      |   -> Acelera inicializacao e warm-up                                 |
   #525 = Utf8                    |   -> Acelera inicializacao e warm-up                                 |
   #526 = String             #527         //      +--- JEP 520: JFR METHOD TIMING ---------------------------------------+
   #527 = Utf8                    +--- JEP 520: JFR METHOD TIMING ---------------------------------------+
   #528 = String             #529         //      |   -XX:+FlightRecorder                                                |
   #529 = Utf8                    |   -XX:+FlightRecorder                                                |
   #530 = String             #531         //      |   -XX:StartFlightRecording=duration=60s,filename=./logs/recording.jfr |
   #531 = Utf8                    |   -XX:StartFlightRecording=duration=60s,filename=./logs/recording.jfr |
   #532 = String             #533         //      |   -XX:+UnlockDiagnosticVMOptions -XX:+DebugNonSafepoints            |
   #533 = Utf8                    |   -XX:+UnlockDiagnosticVMOptions -XX:+DebugNonSafepoints            |
   #534 = String             #535         //      |   -> Permite analise detalhada de performance                       |
   #535 = Utf8                    |   -> Permite analise detalhada de performance                       |
   #536 = String             #537         //      +--- OTIMIZACOES GERAIS ------------------------------------------------+
   #537 = Utf8                    +--- OTIMIZACOES GERAIS ------------------------------------------------+
   #538 = String             #539         //      |   -XX:+UseStringDeduplication (G1GC)                                |
   #539 = Utf8                    |   -XX:+UseStringDeduplication (G1GC)                                |
   #540 = String             #541         //      |   -XX:+UseCompressedOops                                            |
   #541 = Utf8                    |   -XX:+UseCompressedOops                                            |
   #542 = String             #543         //      |   -XX:+TieredCompilation -XX:TieredStopAtLevel=4                    |
   #543 = Utf8                    |   -XX:+TieredCompilation -XX:TieredStopAtLevel=4                    |
   #544 = String             #545         //      |   -XX:+UseTransparentHugePages (Linux)                               |
   #545 = Utf8                    |   -XX:+UseTransparentHugePages (Linux)                               |
   #546 = String             #547         //      +--- AppCDS: BOOT ULTRA-RAPIDO -----------------------------------------+
   #547 = Utf8                    +--- AppCDS: BOOT ULTRA-RAPIDO -----------------------------------------+
   #548 = String             #549         //      |   -XX:+AutoCreateSharedArchive                                       |
   #549 = Utf8                    |   -XX:+AutoCreateSharedArchive                                       |
   #550 = String             #551         //      |   -XX:SharedArchiveFile={}                              |
   #551 = Utf8                    |   -XX:SharedArchiveFile={}                              |
   #552 = String             #553         //      |   -> 1o boot: cria cache ao desligar | 2o boot: startup acelerado   |
   #553 = Utf8                    |   -> 1o boot: cria cache ao desligar | 2o boot: startup acelerado   |
   #554 = String             #555         //   [INFO] Sugestao para JDK {}:
   #555 = Utf8                 [INFO] Sugestao para JDK {}:
   #556 = String             #557         //      -> Use -XX:+UseG1GC para melhor performance
   #557 = Utf8                    -> Use -XX:+UseG1GC para melhor performance
   #558 = Methodref          #24.#559     // java/lang/String.isEmpty:()Z
   #559 = NameAndType        #560:#38     // isEmpty:()Z
   #560 = Utf8               isEmpty
   #561 = String             #562         // 1.
   #562 = Utf8               1.
   #563 = Methodref          #24.#564     // java/lang/String.startsWith:(Ljava/lang/String;)Z
   #564 = NameAndType        #565:#28     // startsWith:(Ljava/lang/String;)Z
   #565 = Utf8               startsWith
   #566 = Methodref          #24.#567     // java/lang/String.indexOf:(II)I
   #567 = NameAndType        #568:#381    // indexOf:(II)I
   #568 = Utf8               indexOf
   #569 = Methodref          #24.#570     // java/lang/String.substring:(II)Ljava/lang/String;
   #570 = NameAndType        #571:#572    // substring:(II)Ljava/lang/String;
   #571 = Utf8               substring
   #572 = Utf8               (II)Ljava/lang/String;
   #573 = Methodref          #91.#574     // java/lang/Integer.parseInt:(Ljava/lang/String;)I
   #574 = NameAndType        #575:#34     // parseInt:(Ljava/lang/String;)I
   #575 = Utf8               parseInt
   #576 = Methodref          #24.#577     // java/lang/String.indexOf:(I)I
   #577 = NameAndType        #568:#578    // indexOf:(I)I
   #578 = Utf8               (I)I
   #579 = Class              #580         // java/lang/NumberFormatException
   #580 = Utf8               java/lang/NumberFormatException
   #581 = String             #582         //   [AVISO] Nao foi possivel determinar a versao do Java: {}
   #582 = Utf8                 [AVISO] Nao foi possivel determinar a versao do Java: {}
   #583 = Class              #584         // java/util/ArrayList
   #584 = Utf8               java/util/ArrayList
   #585 = Methodref          #583.#3      // java/util/ArrayList."<init>":()V
   #586 = String             #587         // brproject.safe.graphics
   #587 = Utf8               brproject.safe.graphics
   #588 = String             #589         // -Dsun.java2d.opengl=false
   #589 = Utf8               -Dsun.java2d.opengl=false
   #590 = InterfaceMethodref #591.#592    // java/util/List.add:(Ljava/lang/Object;)Z
   #591 = Class              #593         // java/util/List
   #592 = NameAndType        #594:#595    // add:(Ljava/lang/Object;)Z
   #593 = Utf8               java/util/List
   #594 = Utf8               add
   #595 = Utf8               (Ljava/lang/Object;)Z
   #596 = String             #597         // -Dsun.java2d.d3d=false
   #597 = Utf8               -Dsun.java2d.d3d=false
   #598 = String             #599         // -Dsun.java2d.pmoffscreen=false
   #599 = Utf8               -Dsun.java2d.pmoffscreen=false
   #600 = String             #601         // -Dbrproject.safe.graphics=true
   #601 = Utf8               -Dbrproject.safe.graphics=true
   #602 = String             #603         // -XX:+UnlockExperimentalVMOptions
   #603 = Utf8               -XX:+UnlockExperimentalVMOptions
   #604 = String             #605         // os.name
   #605 = Utf8               os.name
   #606 = Methodref          #24.#607     // java/lang/String.toLowerCase:()Ljava/lang/String;
   #607 = NameAndType        #608:#208    // toLowerCase:()Ljava/lang/String;
   #608 = Utf8               toLowerCase
   #609 = String             #610         // linux
   #610 = Utf8               linux
   #611 = String             #612         // -XX:+UseLargePages
   #612 = Utf8               -XX:+UseLargePages
   #613 = String             #614         // -XX:ZCollectionInterval=5
   #614 = Utf8               -XX:ZCollectionInterval=5
   #615 = String             #616         // -XX:ZUncommitDelay=300
   #616 = Utf8               -XX:ZUncommitDelay=300
   #617 = String             #618         // -XX:+ZUncommit
   #618 = Utf8               -XX:+ZUncommit
   #619 = String             #620         // -XX:+UseG1GC
   #620 = Utf8               -XX:+UseG1GC
   #621 = String             #622         // -XX:MaxGCPauseMillis=200
   #622 = Utf8               -XX:MaxGCPauseMillis=200
   #623 = String             #624         // -XX:G1HeapRegionSize=16m
   #624 = Utf8               -XX:G1HeapRegionSize=16m
   #625 = String             #626         // -XX:+G1UseAdaptiveIHOP
   #626 = Utf8               -XX:+G1UseAdaptiveIHOP
   #627 = String             #628         // -XX:G1ReservePercent=20
   #628 = Utf8               -XX:G1ReservePercent=20
   #629 = String             #630         // -XX:InitiatingHeapOccupancyPercent=45
   #630 = Utf8               -XX:InitiatingHeapOccupancyPercent=45
   #631 = String             #632         // -XX:+UseStringDeduplication
   #632 = Utf8               -XX:+UseStringDeduplication
   #633 = Methodref          #8.#634      // ext/mods/commons/util/JvmOptimizer.getG1MemoryReclaimFlags:()Ljava/util/List;
   #634 = NameAndType        #635:#126    // getG1MemoryReclaimFlags:()Ljava/util/List;
   #635 = Utf8               getG1MemoryReclaimFlags
   #636 = InterfaceMethodref #591.#637    // java/util/List.addAll:(Ljava/util/Collection;)Z
   #637 = NameAndType        #638:#639    // addAll:(Ljava/util/Collection;)Z
   #638 = Utf8               addAll
   #639 = Utf8               (Ljava/util/Collection;)Z
   #640 = String             #641         // -XX:+UseCompactObjectHeaders
   #641 = Utf8               -XX:+UseCompactObjectHeaders
   #642 = String             #643         // -XX:SharedArchiveFile=cache/brproject_cds.jsa
   #643 = Utf8               -XX:SharedArchiveFile=cache/brproject_cds.jsa
   #644 = String             #645         // -Xlog:cds=error
   #645 = Utf8               -Xlog:cds=error
   #646 = String             #647         // -XX:StartFlightRecording=duration=60s,filename=./logs/recording.jfr
   #647 = Utf8               -XX:StartFlightRecording=duration=60s,filename=./logs/recording.jfr
   #648 = String             #649         // -XX:+UnlockDiagnosticVMOptions
   #649 = Utf8               -XX:+UnlockDiagnosticVMOptions
   #650 = String             #651         // -XX:+DebugNonSafepoints
   #651 = Utf8               -XX:+DebugNonSafepoints
   #652 = String             #653         // -XX:+UseCompressedOops
   #653 = Utf8               -XX:+UseCompressedOops
   #654 = String             #655         // -XX:+UseCompressedClassPointers
   #655 = Utf8               -XX:+UseCompressedClassPointers
   #656 = String             #657         // -XX:+TieredCompilation
   #657 = Utf8               -XX:+TieredCompilation
   #658 = String             #659         // -XX:TieredStopAtLevel=4
   #659 = Utf8               -XX:TieredStopAtLevel=4
   #660 = String             #661         // -XX:+UseTransparentHugePages
   #661 = Utf8               -XX:+UseTransparentHugePages
   #662 = Methodref          #8.#663      // ext/mods/commons/util/JvmOptimizer.getRecommendedJvmFlags:(ZZ)Ljava/util/List;
   #663 = NameAndType        #664:#665    // getRecommendedJvmFlags:(ZZ)Ljava/util/List;
   #664 = Utf8               getRecommendedJvmFlags
   #665 = Utf8               (ZZ)Ljava/util/List;
   #666 = Methodref          #98.#667     // java/io/File.isDirectory:()Z
   #667 = NameAndType        #668:#38     // isDirectory:()Z
   #668 = Utf8               isDirectory
   #669 = Class              #670         // java/lang/IllegalArgumentException
   #670 = Utf8               java/lang/IllegalArgumentException
   #671 = Methodref          #24.#672     // java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
   #672 = NameAndType        #94:#673     // valueOf:(Ljava/lang/Object;)Ljava/lang/String;
   #673 = Utf8               (Ljava/lang/Object;)Ljava/lang/String;
   #674 = InvokeDynamic      #0:#675      // #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #675 = NameAndType        #676:#22     // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #676 = Utf8               makeConcatWithConstants
   #677 = Methodref          #669.#103    // java/lang/IllegalArgumentException."<init>":(Ljava/lang/String;)V
   #678 = String             #679         // server.jar
   #679 = Utf8               server.jar
   #680 = Methodref          #98.#681     // java/io/File."<init>":(Ljava/io/File;Ljava/lang/String;)V
   #681 = NameAndType        #5:#682      // "<init>":(Ljava/io/File;Ljava/lang/String;)V
   #682 = Utf8               (Ljava/io/File;Ljava/lang/String;)V
   #683 = Methodref          #98.#684     // java/io/File.isFile:()Z
   #684 = NameAndType        #685:#38     // isFile:()Z
   #685 = Utf8               isFile
   #686 = Methodref          #98.#687     // java/io/File.getAbsolutePath:()Ljava/lang/String;
   #687 = NameAndType        #688:#208    // getAbsolutePath:()Ljava/lang/String;
   #688 = Utf8               getAbsolutePath
   #689 = InvokeDynamic      #1:#690      // #1:accept:()Ljava/io/FilenameFilter;
   #690 = NameAndType        #691:#692    // accept:()Ljava/io/FilenameFilter;
   #691 = Utf8               accept
   #692 = Utf8               ()Ljava/io/FilenameFilter;
   #693 = Methodref          #98.#694     // java/io/File.listFiles:(Ljava/io/FilenameFilter;)[Ljava/io/File;
   #694 = NameAndType        #695:#696    // listFiles:(Ljava/io/FilenameFilter;)[Ljava/io/File;
   #695 = Utf8               listFiles
   #696 = Utf8               (Ljava/io/FilenameFilter;)[Ljava/io/File;
   #697 = InvokeDynamic      #2:#698      // #2:apply:()Ljava/util/function/Function;
   #698 = NameAndType        #699:#700    // apply:()Ljava/util/function/Function;
   #699 = Utf8               apply
   #700 = Utf8               ()Ljava/util/function/Function;
   #701 = InterfaceMethodref #702.#703    // java/util/Comparator.comparing:(Ljava/util/function/Function;)Ljava/util/Comparator;
   #702 = Class              #704         // java/util/Comparator
   #703 = NameAndType        #705:#706    // comparing:(Ljava/util/function/Function;)Ljava/util/Comparator;
   #704 = Utf8               java/util/Comparator
   #705 = Utf8               comparing
   #706 = Utf8               (Ljava/util/function/Function;)Ljava/util/Comparator;
   #707 = Methodref          #708.#709    // java/util/Arrays.sort:([Ljava/lang/Object;Ljava/util/Comparator;)V
   #708 = Class              #710         // java/util/Arrays
   #709 = NameAndType        #711:#712    // sort:([Ljava/lang/Object;Ljava/util/Comparator;)V
   #710 = Utf8               java/util/Arrays
   #711 = Utf8               sort
   #712 = Utf8               ([Ljava/lang/Object;Ljava/util/Comparator;)V
   #713 = Methodref          #98.#714     // java/io/File.getName:()Ljava/lang/String;
   #714 = NameAndType        #715:#208    // getName:()Ljava/lang/String;
   #715 = Utf8               getName
   #716 = Methodref          #8.#717      // ext/mods/commons/util/JvmOptimizer.shouldExcludeRuntimeJar:(Ljava/lang/String;)Z
   #717 = NameAndType        #718:#28     // shouldExcludeRuntimeJar:(Ljava/lang/String;)Z
   #718 = Utf8               shouldExcludeRuntimeJar
   #719 = Fieldref           #98.#720     // java/io/File.pathSeparator:Ljava/lang/String;
   #720 = NameAndType        #721:#722    // pathSeparator:Ljava/lang/String;
   #721 = Utf8               pathSeparator
   #722 = Utf8               Ljava/lang/String;
   #723 = String             #724         // .encrypted
   #724 = Utf8               .encrypted
   #725 = Methodref          #24.#726     // java/lang/String.endsWith:(Ljava/lang/String;)Z
   #726 = NameAndType        #727:#28     // endsWith:(Ljava/lang/String;)Z
   #727 = Utf8               endsWith
   #728 = String             #729         // kotlin-stdlib-2.0.0.jar
   #729 = Utf8               kotlin-stdlib-2.0.0.jar
   #730 = String             #731         // kotlin-reflect-2.0.0.jar
   #731 = Utf8               kotlin-reflect-2.0.0.jar
   #732 = String             #733         // kotlinx-coroutines-core-jvm-1.8.1.jar
   #733 = Utf8               kotlinx-coroutines-core-jvm-1.8.1.jar
   #734 = Methodref          #583.#735    // java/util/ArrayList."<init>":(I)V
   #735 = NameAndType        #5:#54       // "<init>":(I)V
   #736 = String             #737         // -XX:G1PeriodicGCInterval=70000
   #737 = Utf8               -XX:G1PeriodicGCInterval=70000
   #738 = String             #739         // -XX:+G1PeriodicGCInvokesConcurrent
   #739 = Utf8               -XX:+G1PeriodicGCInvokesConcurrent
   #740 = String             #741         // -XX:MinHeapFreeRatio=10
   #741 = Utf8               -XX:MinHeapFreeRatio=10
   #742 = String             #743         // -XX:MaxHeapFreeRatio=30
   #743 = Utf8               -XX:MaxHeapFreeRatio=30
   #744 = Fieldref           #8.#745      // ext/mods/commons/util/JvmOptimizer._g1GcActive:Ljava/lang/Boolean;
   #745 = NameAndType        #746:#747    // _g1GcActive:Ljava/lang/Boolean;
   #746 = Utf8               _g1GcActive
   #747 = Utf8               Ljava/lang/Boolean;
   #748 = Methodref          #749.#750    // java/lang/Boolean.booleanValue:()Z
   #749 = Class              #751         // java/lang/Boolean
   #750 = NameAndType        #752:#38     // booleanValue:()Z
   #751 = Utf8               java/lang/Boolean
   #752 = Utf8               booleanValue
   #753 = Methodref          #114.#754    // java/lang/management/ManagementFactory.getGarbageCollectorMXBeans:()Ljava/util/List;
   #754 = NameAndType        #755:#126    // getGarbageCollectorMXBeans:()Ljava/util/List;
   #755 = Utf8               getGarbageCollectorMXBeans
   #756 = InterfaceMethodref #591.#757    // java/util/List.iterator:()Ljava/util/Iterator;
   #757 = NameAndType        #758:#759    // iterator:()Ljava/util/Iterator;
   #758 = Utf8               iterator
   #759 = Utf8               ()Ljava/util/Iterator;
   #760 = InterfaceMethodref #761.#762    // java/util/Iterator.hasNext:()Z
   #761 = Class              #763         // java/util/Iterator
   #762 = NameAndType        #764:#38     // hasNext:()Z
   #763 = Utf8               java/util/Iterator
   #764 = Utf8               hasNext
   #765 = InterfaceMethodref #761.#766    // java/util/Iterator.next:()Ljava/lang/Object;
   #766 = NameAndType        #767:#768    // next:()Ljava/lang/Object;
   #767 = Utf8               next
   #768 = Utf8               ()Ljava/lang/Object;
   #769 = Class              #770         // java/lang/management/GarbageCollectorMXBean
   #770 = Utf8               java/lang/management/GarbageCollectorMXBean
   #771 = InterfaceMethodref #769.#714    // java/lang/management/GarbageCollectorMXBean.getName:()Ljava/lang/String;
   #772 = String             #773         // g1
   #773 = Utf8               g1
   #774 = Methodref          #749.#775    // java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
   #775 = NameAndType        #94:#776     // valueOf:(Z)Ljava/lang/Boolean;
   #776 = Utf8               (Z)Ljava/lang/Boolean;
   #777 = Class              #778         // java/lang/Thread
   #778 = Utf8               java/lang/Thread
   #779 = InvokeDynamic      #3:#780      // #3:run:()Ljava/lang/Runnable;
   #780 = NameAndType        #781:#782    // run:()Ljava/lang/Runnable;
   #781 = Utf8               run
   #782 = Utf8               ()Ljava/lang/Runnable;
   #783 = String             #784         // JvmOptimizer-ShutdownHook
   #784 = Utf8               JvmOptimizer-ShutdownHook
   #785 = Methodref          #777.#786    // java/lang/Thread."<init>":(Ljava/lang/Runnable;Ljava/lang/String;)V
   #786 = NameAndType        #5:#787      // "<init>":(Ljava/lang/Runnable;Ljava/lang/String;)V
   #787 = Utf8               (Ljava/lang/Runnable;Ljava/lang/String;)V
   #788 = Methodref          #367.#789    // java/lang/Runtime.addShutdownHook:(Ljava/lang/Thread;)V
   #789 = NameAndType        #790:#791    // addShutdownHook:(Ljava/lang/Thread;)V
   #790 = Utf8               addShutdownHook
   #791 = Utf8               (Ljava/lang/Thread;)V
   #792 = Class              #793         // ext/mods/commons/util/JvmOptimizer$HealthMonitor
   #793 = Utf8               ext/mods/commons/util/JvmOptimizer$HealthMonitor
   #794 = Methodref          #792.#3      // ext/mods/commons/util/JvmOptimizer$HealthMonitor."<init>":()V
   #795 = Fieldref           #8.#796      // ext/mods/commons/util/JvmOptimizer._healthMonitor:Lext/mods/commons/util/JvmOptimizer$HealthMonitor;
   #796 = NameAndType        #797:#798    // _healthMonitor:Lext/mods/commons/util/JvmOptimizer$HealthMonitor;
   #797 = Utf8               _healthMonitor
   #798 = Utf8               Lext/mods/commons/util/JvmOptimizer$HealthMonitor;
   #799 = Methodref          #792.#800    // ext/mods/commons/util/JvmOptimizer$HealthMonitor.start:()V
   #800 = NameAndType        #801:#6      // start:()V
   #801 = Utf8               start
   #802 = String             #803         //   Sistema de Monitoramento de Saude Inicializado
   #803 = Utf8                 Sistema de Monitoramento de Saude Inicializado
   #804 = String             #805         //      +--- Funcionalidades Ativas ------------------------------------+
   #805 = Utf8                    +--- Funcionalidades Ativas ------------------------------------+
   #806 = String             #807         //      | [OK] Monitoramento continuo de memoria e threads            |
   #807 = Utf8                    | [OK] Monitoramento continuo de memoria e threads            |
   #808 = String             #809         //      | [OK] Deteccao automatica de deadlocks e problemas criticos  |
   #809 = Utf8                    | [OK] Deteccao automatica de deadlocks e problemas criticos  |
   #810 = String             #811         //      | [OK] Restart automatico em caso de erro ou falta de recursos  |
   #811 = Utf8                    | [OK] Restart automatico em caso de erro ou falta de recursos  |
   #812 = String             #813         //      | [OK] Respeita desligamentos normais (nao reinicia)          |
   #813 = Utf8                    | [OK] Respeita desligamentos normais (nao reinicia)          |
   #814 = String             #815         //      | [OK] Verificacao a cada {} segundos                        |
   #815 = Utf8                    | [OK] Verificacao a cada {} segundos                        |
   #816 = Long               70l
   #818 = Methodref          #8.#819      // ext/mods/commons/util/JvmOptimizer.isG1GcActive:()Z
   #819 = NameAndType        #820:#38     // isG1GcActive:()Z
   #820 = Utf8               isG1GcActive
   #821 = String             #822         //      | [OK] G1 reclaim periodico a cada {}s (heap + OS)           |
   #822 = Utf8                    | [OK] G1 reclaim periodico a cada {}s (heap + OS)           |
   #823 = String             #824         //      +---------------------------------------------------------------+
   #824 = Utf8                    +---------------------------------------------------------------+
   #825 = Fieldref           #8.#826      // ext/mods/commons/util/JvmOptimizer._normalShutdown:Z
   #826 = NameAndType        #827:#12     // _normalShutdown:Z
   #827 = Utf8               _normalShutdown
   #828 = String             #829         //   Desligamento Normal Detectado
   #829 = Utf8                 Desligamento Normal Detectado
   #830 = String             #831         //      -> Restart automatico desabilitado
   #831 = Utf8                    -> Restart automatico desabilitado
   #832 = String             #833         //      -> Servidor sera desligado sem reiniciar
   #833 = Utf8                    -> Servidor sera desligado sem reiniciar
   #834 = String             #835         // brproject.jvm.verbose
   #835 = Utf8               brproject.jvm.verbose
   #836 = Fieldref           #8.#837      // ext/mods/commons/util/JvmOptimizer._loggerConfigured:Z
   #837 = NameAndType        #838:#12     // _loggerConfigured:Z
   #838 = Utf8               _loggerConfigured
   #839 = Methodref          #216.#714    // java/lang/Class.getName:()Ljava/lang/String;
   #840 = Methodref          #841.#842    // java/util/logging/Logger.getLogger:(Ljava/lang/String;)Ljava/util/logging/Logger;
   #841 = Class              #843         // java/util/logging/Logger
   #842 = NameAndType        #844:#845    // getLogger:(Ljava/lang/String;)Ljava/util/logging/Logger;
   #843 = Utf8               java/util/logging/Logger
   #844 = Utf8               getLogger
   #845 = Utf8               (Ljava/lang/String;)Ljava/util/logging/Logger;
   #846 = Methodref          #841.#847    // java/util/logging/Logger.setUseParentHandlers:(Z)V
   #847 = NameAndType        #848:#849    // setUseParentHandlers:(Z)V
   #848 = Utf8               setUseParentHandlers
   #849 = Utf8               (Z)V
   #850 = Methodref          #841.#851    // java/util/logging/Logger.getHandlers:()[Ljava/util/logging/Handler;
   #851 = NameAndType        #852:#853    // getHandlers:()[Ljava/util/logging/Handler;
   #852 = Utf8               getHandlers
   #853 = Utf8               ()[Ljava/util/logging/Handler;
   #854 = Methodref          #841.#855    // java/util/logging/Logger.removeHandler:(Ljava/util/logging/Handler;)V
   #855 = NameAndType        #856:#857    // removeHandler:(Ljava/util/logging/Handler;)V
   #856 = Utf8               removeHandler
   #857 = Utf8               (Ljava/util/logging/Handler;)V
   #858 = Fieldref           #859.#860    // java/util/logging/Level.OFF:Ljava/util/logging/Level;
   #859 = Class              #861         // java/util/logging/Level
   #860 = NameAndType        #862:#863    // OFF:Ljava/util/logging/Level;
   #861 = Utf8               java/util/logging/Level
   #862 = Utf8               OFF
   #863 = Utf8               Ljava/util/logging/Level;
   #864 = Methodref          #841.#865    // java/util/logging/Logger.setLevel:(Ljava/util/logging/Level;)V
   #865 = NameAndType        #866:#867    // setLevel:(Ljava/util/logging/Level;)V
   #866 = Utf8               setLevel
   #867 = Utf8               (Ljava/util/logging/Level;)V
   #868 = Class              #869         // java/util/logging/ConsoleHandler
   #869 = Utf8               java/util/logging/ConsoleHandler
   #870 = Methodref          #868.#3      // java/util/logging/ConsoleHandler."<init>":()V
   #871 = Fieldref           #859.#872    // java/util/logging/Level.ALL:Ljava/util/logging/Level;
   #872 = NameAndType        #873:#863    // ALL:Ljava/util/logging/Level;
   #873 = Utf8               ALL
   #874 = Fieldref           #859.#875    // java/util/logging/Level.SEVERE:Ljava/util/logging/Level;
   #875 = NameAndType        #876:#863    // SEVERE:Ljava/util/logging/Level;
   #876 = Utf8               SEVERE
   #877 = Methodref          #868.#865    // java/util/logging/ConsoleHandler.setLevel:(Ljava/util/logging/Level;)V
   #878 = Class              #879         // ext/mods/commons/logging/formatter/NoTimestampConsoleFormatter
   #879 = Utf8               ext/mods/commons/logging/formatter/NoTimestampConsoleFormatter
   #880 = Methodref          #878.#3      // ext/mods/commons/logging/formatter/NoTimestampConsoleFormatter."<init>":()V
   #881 = Methodref          #868.#882    // java/util/logging/ConsoleHandler.setFormatter:(Ljava/util/logging/Formatter;)V
   #882 = NameAndType        #883:#884    // setFormatter:(Ljava/util/logging/Formatter;)V
   #883 = Utf8               setFormatter
   #884 = Utf8               (Ljava/util/logging/Formatter;)V
   #885 = Methodref          #841.#886    // java/util/logging/Logger.addHandler:(Ljava/util/logging/Handler;)V
   #886 = NameAndType        #887:#857    // addHandler:(Ljava/util/logging/Handler;)V
   #887 = Utf8               addHandler
   #888 = Methodref          #889.#206    // java/lang/Throwable.getMessage:()Ljava/lang/String;
   #889 = Class              #890         // java/lang/Throwable
   #890 = Utf8               java/lang/Throwable
   #891 = String             #892         // outofmemoryerror
   #892 = Utf8               outofmemoryerror
   #893 = String             #894         // stackoverflowerror
   #894 = Utf8               stackoverflowerror
   #895 = String             #896         // unable to create new native thread
   #896 = Utf8               unable to create new native thread
   #897 = String             #898         // too many open files
   #898 = Utf8               too many open files
   #899 = String             #900         // database connection
   #900 = Utf8               database connection
   #901 = String             #902         // connection pool exhausted
   #902 = Utf8               connection pool exhausted
   #903 = Methodref          #70.#904     // ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;)V
   #904 = NameAndType        #905:#74     // error:(Ljava/lang/Object;)V
   #905 = Utf8               error
   #906 = String             #907         //   [ERRO] Excecao Nao Tratada Detectada
   #907 = Utf8                 [ERRO] Excecao Nao Tratada Detectada
   #908 = String             #909         //      +---------------------------------------------------------+
   #909 = Utf8                    +---------------------------------------------------------+
   #910 = String             #911         //      | Thread:    {}                                        |
   #911 = Utf8                    | Thread:    {}                                        |
   #912 = Methodref          #777.#714    // java/lang/Thread.getName:()Ljava/lang/String;
   #913 = Methodref          #70.#914     // ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;[Ljava/lang/Object;)V
   #914 = NameAndType        #905:#85     // error:(Ljava/lang/Object;[Ljava/lang/Object;)V
   #915 = String             #916         //      | Tipo:      {}                                        |
   #916 = Utf8                    | Tipo:      {}                                        |
   #917 = String             #918         //      | Mensagem:  {}                                        |
   #918 = Utf8                    | Mensagem:  {}                                        |
   #919 = String             #920         // N/A
   #920 = Utf8               N/A
   #921 = Methodref          #8.#922      // ext/mods/commons/util/JvmOptimizer.isCriticalError:(Ljava/lang/Throwable;)Z
   #922 = NameAndType        #923:#924    // isCriticalError:(Ljava/lang/Throwable;)Z
   #923 = Utf8               isCriticalError
   #924 = Utf8               (Ljava/lang/Throwable;)Z
   #925 = String             #926         //   [AVISO] ERRO CRITICO DETECTADO
   #926 = Utf8                 [AVISO] ERRO CRITICO DETECTADO
   #927 = String             #928         //      -> Tipo de erro requer reinicio do servidor
   #928 = Utf8                    -> Tipo de erro requer reinicio do servidor
   #929 = String             #930         //      -> Falhas consecutivas: {} / {}
   #930 = Utf8                    -> Falhas consecutivas: {} / {}
   #931 = Fieldref           #8.#932      // ext/mods/commons/util/JvmOptimizer._consecutiveFailures:Ljava/util/concurrent/atomic/AtomicInteger;
   #932 = NameAndType        #933:#934    // _consecutiveFailures:Ljava/util/concurrent/atomic/AtomicInteger;
   #933 = Utf8               _consecutiveFailures
   #934 = Utf8               Ljava/util/concurrent/atomic/AtomicInteger;
   #935 = Methodref          #936.#937    // java/util/concurrent/atomic/AtomicInteger.incrementAndGet:()I
   #936 = Class              #938         // java/util/concurrent/atomic/AtomicInteger
   #937 = NameAndType        #939:#375    // incrementAndGet:()I
   #938 = Utf8               java/util/concurrent/atomic/AtomicInteger
   #939 = Utf8               incrementAndGet
   #940 = Methodref          #936.#941    // java/util/concurrent/atomic/AtomicInteger.get:()I
   #941 = NameAndType        #942:#375    // get:()I
   #942 = Utf8               get
   #943 = String             #944         //      -> Limite de falhas atingido - Agendando restart em 5 segundos...
   #944 = Utf8                    -> Limite de falhas atingido - Agendando restart em 5 segundos...
   #945 = InvokeDynamic      #4:#780      // #4:run:()Ljava/lang/Runnable;
   #946 = Long               5000l
   #948 = Methodref          #949.#950    // ext/mods/commons/pool/CoroutinePool.schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
   #949 = Class              #951         // ext/mods/commons/pool/CoroutinePool
   #950 = NameAndType        #952:#953    // schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
   #951 = Utf8               ext/mods/commons/pool/CoroutinePool
   #952 = Utf8               schedule
   #953 = Utf8               (Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
   #954 = String             #955         //      -> Monitorando... ({} falhas restantes ate restart)
   #955 = Utf8                    -> Monitorando... ({} falhas restantes ate restart)
   #956 = Methodref          #792.#957    // ext/mods/commons/util/JvmOptimizer$HealthMonitor.restartServer:()V
   #957 = NameAndType        #958:#6      // restartServer:()V
   #958 = Utf8               restartServer
   #959 = Methodref          #792.#960    // ext/mods/commons/util/JvmOptimizer$HealthMonitor.stopMonitoring:()V
   #960 = NameAndType        #961:#6      // stopMonitoring:()V
   #961 = Utf8               stopMonitoring
   #962 = String             #963         //   Shutdown hook executado - Desligamento normal detectado
   #963 = Utf8                 Shutdown hook executado - Desligamento normal detectado
   #964 = String             #965         // .jar
   #965 = Utf8               .jar
   #966 = Methodref          #70.#103     // ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
   #967 = Methodref          #936.#735    // java/util/concurrent/atomic/AtomicInteger."<init>":(I)V
   #968 = Fieldref           #8.#969      // ext/mods/commons/util/JvmOptimizer._restartCount:Ljava/util/concurrent/atomic/AtomicInteger;
   #969 = NameAndType        #970:#934    // _restartCount:Ljava/util/concurrent/atomic/AtomicInteger;
   #970 = Utf8               _restartCount
   #971 = Fieldref           #8.#972      // ext/mods/commons/util/JvmOptimizer._lastThreadWarnTime:J
   #972 = NameAndType        #973:#974    // _lastThreadWarnTime:J
   #973 = Utf8               _lastThreadWarnTime
   #974 = Utf8               J
   #975 = Fieldref           #8.#976      // ext/mods/commons/util/JvmOptimizer._lastThreadWarnCount:I
   #976 = NameAndType        #977:#978    // _lastThreadWarnCount:I
   #977 = Utf8               _lastThreadWarnCount
   #978 = Utf8               I
   #979 = InvokeDynamic      #5:#980      // #5:uncaughtException:()Ljava/lang/Thread$UncaughtExceptionHandler;
   #980 = NameAndType        #981:#982    // uncaughtException:()Ljava/lang/Thread$UncaughtExceptionHandler;
   #981 = Utf8               uncaughtException
   #982 = Utf8               ()Ljava/lang/Thread$UncaughtExceptionHandler;
   #983 = Methodref          #777.#984    // java/lang/Thread.setDefaultUncaughtExceptionHandler:(Ljava/lang/Thread$UncaughtExceptionHandler;)V
   #984 = NameAndType        #985:#986    // setDefaultUncaughtExceptionHandler:(Ljava/lang/Thread$UncaughtExceptionHandler;)V
   #985 = Utf8               setDefaultUncaughtExceptionHandler
   #986 = Utf8               (Ljava/lang/Thread$UncaughtExceptionHandler;)V
   #987 = Utf8               APP_CDS_DIR
   #988 = Utf8               ConstantValue
   #989 = Utf8               APP_CDS_FILE
   #990 = Utf8               MAX_RESTART_DELAY
   #991 = Long               60000l
   #993 = Utf8               MAX_CONSECUTIVE_FAILURES
   #994 = Integer            5
   #995 = Utf8               MEMORY_THRESHOLD
   #996 = Utf8               D
   #997 = Double             0.95d
   #999 = Utf8               HEALTH_CHECK_INTERVAL
  #1000 = Utf8               G1_PERIODIC_GC_INTERVAL_MS
  #1001 = Utf8               G1_RECLAIM_MIN_WASTE_BYTES
  #1002 = Long               268435456l
  #1004 = Utf8               G1_RECLAIM_WASTE_RATIO
  #1005 = Double             0.25d
  #1007 = Utf8               THREAD_WARN_PER_CORE
  #1008 = Integer            700
  #1009 = Utf8               THREAD_WARN_PEAK_PER_CORE
  #1010 = Integer            1400
  #1011 = Utf8               THREAD_WARN_MIN
  #1012 = Integer            4000
  #1013 = Utf8               THREAD_WARN_PEAK_MIN
  #1014 = Integer            8000
  #1015 = Utf8               THREAD_WARN_COOLDOWN_MS
  #1016 = Long               300000l
  #1018 = Utf8               Code
  #1019 = Utf8               LineNumberTable
  #1020 = Utf8               LocalVariableTable
  #1021 = Utf8               this
  #1022 = Utf8               Lext/mods/commons/util/JvmOptimizer;
  #1023 = Utf8               initialize
  #1024 = Utf8               javaVersion
  #1025 = Utf8               majorVersion
  #1026 = Utf8               javaVendor
  #1027 = Utf8               StackMapTable
  #1028 = Utf8               cacheDir
  #1029 = Utf8               Ljava/io/File;
  #1030 = Utf8               archiveFile
  #1031 = Utf8               runtimeBean
  #1032 = Utf8               Ljava/lang/management/RuntimeMXBean;
  #1033 = Utf8               vmArgs
  #1034 = Utf8               hasAutoCreate
  #1035 = Utf8               hasSharedFile
  #1036 = Utf8               useZgc
  #1037 = Utf8               e
  #1038 = Utf8               Ljava/lang/Exception;
  #1039 = Utf8               dotIndex
  #1040 = Utf8               Ljava/lang/NumberFormatException;
  #1041 = Utf8               version
  #1042 = Utf8               os
  #1043 = Utf8               enableJfr
  #1044 = Utf8               flags
  #1045 = Utf8               Ljava/util/List;
  #1046 = Utf8               LocalVariableTypeTable
  #1047 = Utf8               Ljava/util/List<Ljava/lang/String;>;
  #1048 = Utf8               Signature
  #1049 = Utf8               (ZZ)Ljava/util/List<Ljava/lang/String;>;
  #1050 = Utf8               getRecommendedGameServerFlags
  #1051 = Utf8               (Z)Ljava/util/List;
  #1052 = Utf8               (Z)Ljava/util/List<Ljava/lang/String;>;
  #1053 = Utf8               getRecommendedLoginServerFlags
  #1054 = Utf8               ()Ljava/util/List<Ljava/lang/String;>;
  #1055 = Utf8               getAppCdsArchiveFile
  #1056 = Utf8               buildRuntimeClasspath
  #1057 = Utf8               (Ljava/io/File;)Ljava/lang/String;
  #1058 = Utf8               jar
  #1059 = Utf8               libsDir
  #1060 = Utf8               entries
  #1061 = Utf8               serverJar
  #1062 = Utf8               jars
  #1063 = Utf8               [Ljava/io/File;
  #1064 = Class              #1063        // "[Ljava/io/File;"
  #1065 = Utf8               fileName
  #1066 = Utf8               gc
  #1067 = Utf8               Ljava/lang/management/GarbageCollectorMXBean;
  #1068 = Utf8               getAppCdsFlags
  #1069 = Utf8               setNormalShutdown
  #1070 = Utf8               isNormalShutdown
  #1071 = Utf8               handler
  #1072 = Utf8               Ljava/util/logging/Handler;
  #1073 = Utf8               logger
  #1074 = Utf8               Ljava/util/logging/Logger;
  #1075 = Class              #1076        // "[Ljava/util/logging/Handler;"
  #1076 = Utf8               [Ljava/util/logging/Handler;
  #1077 = Utf8               consoleHandler
  #1078 = Utf8               Ljava/util/logging/ConsoleHandler;
  #1079 = Utf8               exception
  #1080 = Utf8               Ljava/lang/Throwable;
  #1081 = Utf8               message
  #1082 = Utf8               lowerMessage
  #1083 = Utf8               lambda$static$0
  #1084 = Utf8               (Ljava/lang/Thread;Ljava/lang/Throwable;)V
  #1085 = Utf8               thread
  #1086 = Utf8               Ljava/lang/Thread;
  #1087 = Class              #1088        // "[Ljava/lang/Object;"
  #1088 = Utf8               [Ljava/lang/Object;
  #1089 = Utf8               lambda$static$1
  #1090 = Utf8               lambda$initializeHealthMonitoring$0
  #1091 = Utf8               lambda$buildRuntimeClasspath$0
  #1092 = Utf8               (Ljava/io/File;Ljava/lang/String;)Z
  #1093 = Utf8               dir
  #1094 = Utf8               name
  #1095 = Utf8               <clinit>
  #1096 = Utf8               SourceFile
  #1097 = Utf8               JvmOptimizer.java
  #1098 = Utf8               NestMembers
  #1099 = Utf8               BootstrapMethods
  #1100 = String             #1101        // libsDir invalido: \u0001
  #1101 = Utf8               libsDir invalido: \u0001
  #1102 = MethodType         #1092        //  (Ljava/io/File;Ljava/lang/String;)Z
  #1103 = MethodHandle       6:#1104      // REF_invokeStatic ext/mods/commons/util/JvmOptimizer.lambda$buildRuntimeClasspath$0:(Ljava/io/File;Ljava/lang/String;)Z
  #1104 = Methodref          #8.#1105     // ext/mods/commons/util/JvmOptimizer.lambda$buildRuntimeClasspath$0:(Ljava/io/File;Ljava/lang/String;)Z
  #1105 = NameAndType        #1091:#1092  // lambda$buildRuntimeClasspath$0:(Ljava/io/File;Ljava/lang/String;)Z
  #1106 = MethodType         #1107        //  (Ljava/lang/Object;)Ljava/lang/Object;
  #1107 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
  #1108 = MethodHandle       5:#713       // REF_invokeVirtual java/io/File.getName:()Ljava/lang/String;
  #1109 = MethodType         #1057        //  (Ljava/io/File;)Ljava/lang/String;
  #1110 = MethodType         #6           //  ()V
  #1111 = MethodHandle       6:#1112      // REF_invokeStatic ext/mods/commons/util/JvmOptimizer.lambda$initializeHealthMonitoring$0:()V
  #1112 = Methodref          #8.#1113     // ext/mods/commons/util/JvmOptimizer.lambda$initializeHealthMonitoring$0:()V
  #1113 = NameAndType        #1090:#6     // lambda$initializeHealthMonitoring$0:()V
  #1114 = MethodHandle       6:#1115      // REF_invokeStatic ext/mods/commons/util/JvmOptimizer.lambda$static$1:()V
  #1115 = Methodref          #8.#1116     // ext/mods/commons/util/JvmOptimizer.lambda$static$1:()V
  #1116 = NameAndType        #1089:#6     // lambda$static$1:()V
  #1117 = MethodType         #1084        //  (Ljava/lang/Thread;Ljava/lang/Throwable;)V
  #1118 = MethodHandle       6:#1119      // REF_invokeStatic ext/mods/commons/util/JvmOptimizer.lambda$static$0:(Ljava/lang/Thread;Ljava/lang/Throwable;)V
  #1119 = Methodref          #8.#1120     // ext/mods/commons/util/JvmOptimizer.lambda$static$0:(Ljava/lang/Thread;Ljava/lang/Throwable;)V
  #1120 = NameAndType        #1083:#1084  // lambda$static$0:(Ljava/lang/Thread;Ljava/lang/Throwable;)V
  #1121 = MethodHandle       6:#1122      // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #1122 = Methodref          #1123.#1124  // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #1123 = Class              #1125        // java/lang/invoke/StringConcatFactory
  #1124 = NameAndType        #676:#1126   // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #1125 = Utf8               java/lang/invoke/StringConcatFactory
  #1126 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #1127 = MethodHandle       6:#1128      // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #1128 = Methodref          #1129.#1130  // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #1129 = Class              #1131        // java/lang/invoke/LambdaMetafactory
  #1130 = NameAndType        #1132:#1133  // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #1131 = Utf8               java/lang/invoke/LambdaMetafactory
  #1132 = Utf8               metafactory
  #1133 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #1134 = Utf8               InnerClasses
  #1135 = Utf8               HealthMonitor
  #1136 = Class              #1137        // java/lang/Thread$UncaughtExceptionHandler
  #1137 = Utf8               java/lang/Thread$UncaughtExceptionHandler
  #1138 = Utf8               UncaughtExceptionHandler
  #1139 = Class              #1140        // java/lang/invoke/MethodHandles$Lookup
  #1140 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #1141 = Class              #1142        // java/lang/invoke/MethodHandles
  #1142 = Utf8               java/lang/invoke/MethodHandles
  #1143 = Utf8               Lookup
{
  public static final long G1_PERIODIC_GC_INTERVAL_MS;
    descriptor: J
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: long 70000l

  public ext.mods.commons.util.JvmOptimizer();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 47: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/commons/util/JvmOptimizer;

  public static void initialize();
    descriptor: ()V
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=6, locals=3, args_size=0
         0: getstatic     #7                  // Field _initialized:Z
         3: ifeq          7
         6: return
         7: iconst_1
         8: putstatic     #7                  // Field _initialized:Z
        11: ldc           #13                 // String launcher
        13: ldc           #15                 // String brproject.role
        15: invokestatic  #17                 // Method java/lang/System.getProperty:(Ljava/lang/String;)Ljava/lang/String;
        18: invokevirtual #23                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
        21: ifeq          25
        24: return
        25: ldc           #29                 // String java.version
        27: invokestatic  #17                 // Method java/lang/System.getProperty:(Ljava/lang/String;)Ljava/lang/String;
        30: astore_0
        31: aload_0
        32: invokestatic  #31                 // Method getMajorVersion:(Ljava/lang/String;)I
        35: istore_1
        36: invokestatic  #35                 // Method isVerboseStartup:()Z
        39: ifne          71
        42: invokestatic  #39                 // Method configureSilentLogger:()V
        45: iload_1
        46: bipush        25
        48: if_icmplt     57
        51: invokestatic  #42                 // Method applyJdk25Optimizations:()V
        54: goto          60
        57: invokestatic  #45                 // Method applyStandardOptimizations:()V
        60: invokestatic  #48                 // Method checkAndOptimizeAppCDS:()V
        63: iload_1
        64: invokestatic  #51                 // Method suggestGcSettings:(I)V
        67: invokestatic  #55                 // Method initializeHealthMonitoring:()V
        70: return
        71: invokestatic  #58                 // Method configureJvmOptimizerLogger:()V
        74: ldc           #61                 // String java.vendor
        76: invokestatic  #17                 // Method java/lang/System.getProperty:(Ljava/lang/String;)Ljava/lang/String;
        79: astore_2
        80: getstatic     #63                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
        83: ldc           #67                 // String
        85: invokevirtual #69                 // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;)V
        88: getstatic     #63                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
        91: ldc           #75                 // String ================================================================
        93: invokevirtual #69                 // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;)V
        96: getstatic     #63                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
        99: ldc           #77                 // String            JVM OPTIMIZER - Inicializando Sistema
       101: invokevirtual #69                 // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;)V
       104: getstatic     #63                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
       107: ldc           #75                 // String ================================================================
       109: invokevirtual #69                 // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;)V
       112: getstatic     #63                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
       115: ldc           #67                 // String
       117: invokevirtual #69                 // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;)V
       120: getstatic     #63                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
       123: ldc           #79                 // String   Informacoes do Ambiente Java:
       125: invokevirtual #69                 // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;)V
       128: getstatic     #63                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
       131: ldc           #81                 // String      - Versao: {} ({})
       133: iconst_2
       134: anewarray     #2                  // class java/lang/Object
       137: dup
       138: iconst_0
       139: aload_0
       140: aastore
       141: dup
       142: iconst_1
       143: aload_2
       144: aastore
       145: invokevirtual #83                 // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
       148: iload_1
       149: bipush        25
       151: if_icmplt     176
       154: getstatic     #63                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
       157: ldc           #86                 // String      - Status: JDK 25+ detectado - Aplicando otimizacoes avancadas
       159: invokevirtual #69                 // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;)V
       162: getstatic     #63                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
       165: ldc           #67                 // String
       167: invokevirtual #69                 // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;)V
       170: invokestatic  #42                 // Method applyJdk25Optimizations:()V
       173: goto          206
       176: getstatic     #63                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
       179: ldc           #88                 // String      - Status: JDK {} detectado - Aplicando otimizacoes padrao
       181: iconst_1
       182: anewarray     #2                  // class java/lang/Object
       185: dup
       186: iconst_0
       187: iload_1
       188: invokestatic  #90                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       191: aastore
       192: invokevirtual #83                 // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
       195: getstatic     #63                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
       198: ldc           #67                 // String
       200: invokevirtual #69                 // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;)V
       203: invokestatic  #45                 // Method applyStandardOptimizations:()V
       206: invokestatic  #48                 // Method checkAndOptimizeAppCDS:()V
       209: iload_1
       210: invokestatic  #51                 // Method suggestGcSettings:(I)V
       213: invokestatic  #55                 // Method initializeHealthMonitoring:()V
       216: return
      LineNumberTable:
        line 88: 0
        line 89: 6
        line 91: 7
        line 93: 11
        line 94: 24
        line 96: 25
        line 97: 31
        line 99: 36
        line 101: 42
        line 102: 45
        line 103: 51
        line 105: 57
        line 106: 60
        line 107: 63
        line 108: 67
        line 109: 70
        line 112: 71
        line 114: 74
        line 116: 80
        line 117: 88
        line 118: 96
        line 119: 104
        line 120: 112
        line 121: 120
        line 122: 128
        line 124: 148
        line 126: 154
        line 127: 162
        line 128: 170
        line 132: 176
        line 133: 195
        line 134: 203
        line 137: 206
        line 139: 209
        line 141: 213
        line 142: 216
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           31     186     0 javaVersion   Ljava/lang/String;
           36     181     1 majorVersion   I
           80     137     2 javaVendor   Ljava/lang/String;
      StackMapTable: number_of_entries = 7
        frame_type = 7 /* same */
        frame_type = 17 /* same */
        frame_type = 253 /* append */
          offset_delta = 31
          locals = [ class java/lang/String, int ]
        frame_type = 2 /* same */
        frame_type = 10 /* same */
        frame_type = 252 /* append */
          offset_delta = 104
          locals = [ class java/lang/String ]
        frame_type = 29 /* same */

  public static void suggestGcSettings();
    descriptor: ()V
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=2, args_size=0
         0: ldc           #29                 // String java.version
         2: invokestatic  #17                 // Method java/lang/System.getProperty:(Ljava/lang/String;)Ljava/lang/String;
         5: astore_0
         6: aload_0
         7: invokestatic  #31                 // Method getMajorVersion:(Ljava/lang/String;)I
        10: istore_1
        11: iload_1
        12: invokestatic  #51                 // Method suggestGcSettings:(I)V
        15: return
      LineNumberTable:
        line 599: 0
        line 600: 6
        line 601: 11
        line 602: 15
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            6      10     0 javaVersion   Ljava/lang/String;
           11       5     1 majorVersion   I

  public static java.util.List<java.lang.String> getRecommendedJvmFlags(boolean, boolean);
    descriptor: (ZZ)Ljava/util/List;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=6, args_size=2
         0: new           #583                // class java/util/ArrayList
         3: dup
         4: invokespecial #585                // Method java/util/ArrayList."<init>":()V
         7: astore_2
         8: ldc           #236                // String true
        10: ldc_w         #586                // String brproject.safe.graphics
        13: invokestatic  #17                 // Method java/lang/System.getProperty:(Ljava/lang/String;)Ljava/lang/String;
        16: invokevirtual #23                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
        19: ifeq          62
        22: aload_2
        23: ldc_w         #588                // String -Dsun.java2d.opengl=false
        26: invokeinterface #590,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        31: pop
        32: aload_2
        33: ldc_w         #596                // String -Dsun.java2d.d3d=false
        36: invokeinterface #590,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        41: pop
        42: aload_2
        43: ldc_w         #598                // String -Dsun.java2d.pmoffscreen=false
        46: invokeinterface #590,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        51: pop
        52: aload_2
        53: ldc_w         #600                // String -Dbrproject.safe.graphics=true
        56: invokeinterface #590,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        61: pop
        62: ldc           #29                 // String java.version
        64: invokestatic  #17                 // Method java/lang/System.getProperty:(Ljava/lang/String;)Ljava/lang/String;
        67: astore_3
        68: aload_3
        69: invokestatic  #31                 // Method getMajorVersion:(Ljava/lang/String;)I
        72: istore        4
        74: iload         4
        76: bipush        25
        78: if_icmplt     422
        81: iload_0
        82: ifeq          169
        85: aload_2
        86: ldc           #139                // String -XX:+UseZGC
        88: invokeinterface #590,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        93: pop
        94: aload_2
        95: ldc_w         #602                // String -XX:+UnlockExperimentalVMOptions
        98: invokeinterface #590,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       103: pop
       104: ldc_w         #604                // String os.name
       107: invokestatic  #17                 // Method java/lang/System.getProperty:(Ljava/lang/String;)Ljava/lang/String;
       110: invokevirtual #606                // Method java/lang/String.toLowerCase:()Ljava/lang/String;
       113: astore        5
       115: aload         5
       117: ldc_w         #609                // String linux
       120: invokevirtual #133                // Method java/lang/String.contains:(Ljava/lang/CharSequence;)Z
       123: ifeq          136
       126: aload_2
       127: ldc_w         #611                // String -XX:+UseLargePages
       130: invokeinterface #590,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       135: pop
       136: aload_2
       137: ldc_w         #613                // String -XX:ZCollectionInterval=5
       140: invokeinterface #590,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       145: pop
       146: aload_2
       147: ldc_w         #615                // String -XX:ZUncommitDelay=300
       150: invokeinterface #590,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       155: pop
       156: aload_2
       157: ldc_w         #617                // String -XX:+ZUncommit
       160: invokeinterface #590,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       165: pop
       166: goto          249
       169: aload_2
       170: ldc_w         #619                // String -XX:+UseG1GC
       173: invokeinterface #590,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       178: pop
       179: aload_2
       180: ldc_w         #621                // String -XX:MaxGCPauseMillis=200
       183: invokeinterface #590,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       188: pop
       189: aload_2
       190: ldc_w         #623                // String -XX:G1HeapRegionSize=16m
       193: invokeinterface #590,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       198: pop
       199: aload_2
       200: ldc_w         #625                // String -XX:+G1UseAdaptiveIHOP
       203: invokeinterface #590,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       208: pop
       209: aload_2
       210: ldc_w         #627                // String -XX:G1ReservePercent=20
       213: invokeinterface #590,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       218: pop
       219: aload_2
       220: ldc_w         #629                // String -XX:InitiatingHeapOccupancyPercent=45
       223: invokeinterface #590,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       228: pop
       229: aload_2
       230: ldc_w         #631                // String -XX:+UseStringDeduplication
       233: invokeinterface #590,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       238: pop
       239: aload_2
       240: invokestatic  #633                // Method getG1MemoryReclaimFlags:()Ljava/util/List;
       243: invokeinterface #636,  2          // InterfaceMethod java/util/List.addAll:(Ljava/util/Collection;)Z
       248: pop
       249: aload_2
       250: ldc_w         #640                // String -XX:+UseCompactObjectHeaders
       253: invokeinterface #590,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       258: pop
       259: iload_0
       260: ifne          292
       263: aload_2
       264: ldc           #131                // String -XX:+AutoCreateSharedArchive
       266: invokeinterface #590,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       271: pop
       272: aload_2
       273: ldc_w         #642                // String -XX:SharedArchiveFile=cache/brproject_cds.jsa
       276: invokeinterface #590,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       281: pop
       282: aload_2
       283: ldc_w         #644                // String -Xlog:cds=error
       286: invokeinterface #590,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       291: pop
       292: iload_1
       293: ifeq          336
       296: aload_2
       297: ldc_w         #314                // String -XX:+FlightRecorder
       300: invokeinterface #590,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       305: pop
       306: aload_2
       307: ldc_w         #646                // String -XX:StartFlightRecording=duration=60s,filename=./logs/recording.jfr
       310: invokeinterface #590,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       315: pop
       316: aload_2
       317: ldc_w         #648                // String -XX:+UnlockDiagnosticVMOptions
       320: invokeinterface #590,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       325: pop
       326: aload_2
       327: ldc_w         #650                // String -XX:+DebugNonSafepoints
       330: invokeinterface #590,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       335: pop
       336: iload_0
       337: ifne          367
       340: aload_2
       341: ldc_w         #652                // String -XX:+UseCompressedOops
       344: invokeinterface #590,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       349: pop
       350: iload         4
       352: bipush        25
       354: if_icmpge     367
       357: aload_2
       358: ldc_w         #654                // String -XX:+UseCompressedClassPointers
       361: invokeinterface #590,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       366: pop
       367: aload_2
       368: ldc_w         #656                // String -XX:+TieredCompilation
       371: invokeinterface #590,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       376: pop
       377: aload_2
       378: ldc_w         #658                // String -XX:TieredStopAtLevel=4
       381: invokeinterface #590,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       386: pop
       387: ldc_w         #604                // String os.name
       390: invokestatic  #17                 // Method java/lang/System.getProperty:(Ljava/lang/String;)Ljava/lang/String;
       393: invokevirtual #606                // Method java/lang/String.toLowerCase:()Ljava/lang/String;
       396: astore        5
       398: aload         5
       400: ldc_w         #609                // String linux
       403: invokevirtual #133                // Method java/lang/String.contains:(Ljava/lang/CharSequence;)Z
       406: ifeq          419
       409: aload_2
       410: ldc_w         #660                // String -XX:+UseTransparentHugePages
       413: invokeinterface #590,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       418: pop
       419: goto          442
       422: aload_2
       423: ldc_w         #619                // String -XX:+UseG1GC
       426: invokeinterface #590,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       431: pop
       432: aload_2
       433: ldc_w         #621                // String -XX:MaxGCPauseMillis=200
       436: invokeinterface #590,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       441: pop
       442: aload_2
       443: areturn
      LineNumberTable:
        line 614: 0
        line 616: 8
        line 618: 22
        line 619: 32
        line 620: 42
        line 621: 52
        line 624: 62
        line 625: 68
        line 627: 74
        line 629: 81
        line 631: 85
        line 632: 94
        line 633: 104
        line 634: 115
        line 635: 126
        line 636: 136
        line 637: 146
        line 638: 156
        line 639: 166
        line 642: 169
        line 643: 179
        line 644: 189
        line 645: 199
        line 646: 209
        line 647: 219
        line 648: 229
        line 649: 239
        line 652: 249
        line 654: 259
        line 656: 263
        line 657: 272
        line 658: 282
        line 661: 292
        line 663: 296
        line 664: 306
        line 665: 316
        line 666: 326
        line 669: 336
        line 671: 340
        line 672: 350
        line 673: 357
        line 675: 367
        line 676: 377
        line 678: 387
        line 679: 398
        line 681: 409
        line 683: 419
        line 686: 422
        line 687: 432
        line 690: 442
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          115      51     5    os   Ljava/lang/String;
          398      21     5    os   Ljava/lang/String;
            0     444     0 useZgc   Z
            0     444     1 enableJfr   Z
            8     436     2 flags   Ljava/util/List;
           68     376     3 javaVersion   Ljava/lang/String;
           74     370     4 majorVersion   I
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            8     436     2 flags   Ljava/util/List<Ljava/lang/String;>;
      StackMapTable: number_of_entries = 10
        frame_type = 252 /* append */
          offset_delta = 62
          locals = [ class java/util/List ]
        frame_type = 254 /* append */
          offset_delta = 73
          locals = [ class java/lang/String, int, class java/lang/String ]
        frame_type = 250 /* chop */
          offset_delta = 32
        frame_type = 251 /* same_frame_extended */
          offset_delta = 79
        frame_type = 42 /* same */
        frame_type = 43 /* same */
        frame_type = 30 /* same */
        frame_type = 51 /* same */
        frame_type = 2 /* same */
        frame_type = 19 /* same */
    Signature: #1049                        // (ZZ)Ljava/util/List<Ljava/lang/String;>;

  public static java.util.List<java.lang.String> getRecommendedGameServerFlags(boolean);
    descriptor: (Z)Ljava/util/List;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=1, args_size=1
         0: iconst_0
         1: iload_0
         2: invokestatic  #662                // Method getRecommendedJvmFlags:(ZZ)Ljava/util/List;
         5: areturn
      LineNumberTable:
        line 701: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0 enableJfr   Z
    Signature: #1052                        // (Z)Ljava/util/List<Ljava/lang/String;>;

  public static java.util.List<java.lang.String> getRecommendedLoginServerFlags();
    descriptor: ()Ljava/util/List;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=0, args_size=0
         0: iconst_0
         1: iconst_0
         2: invokestatic  #662                // Method getRecommendedJvmFlags:(ZZ)Ljava/util/List;
         5: areturn
      LineNumberTable:
        line 712: 0
    Signature: #1054                        // ()Ljava/util/List<Ljava/lang/String;>;

  public static java.lang.String getAppCdsArchiveFile();
    descriptor: ()Ljava/lang/String;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: ldc           #111                // String cache/brproject_cds.jsa
         2: areturn
      LineNumberTable:
        line 720: 0

  public static java.lang.String buildRuntimeClasspath(java.io.File);
    descriptor: (Ljava/io/File;)Ljava/lang/String;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=4, locals=8, args_size=1
         0: aload_0
         1: ifnull        11
         4: aload_0
         5: invokevirtual #666                // Method java/io/File.isDirectory:()Z
         8: ifne          28
        11: new           #669                // class java/lang/IllegalArgumentException
        14: dup
        15: aload_0
        16: invokestatic  #671                // Method java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        19: invokedynamic #674,  0            // InvokeDynamic #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
        24: invokespecial #677                // Method java/lang/IllegalArgumentException."<init>":(Ljava/lang/String;)V
        27: athrow
        28: new           #583                // class java/util/ArrayList
        31: dup
        32: invokespecial #585                // Method java/util/ArrayList."<init>":()V
        35: astore_1
        36: new           #98                 // class java/io/File
        39: dup
        40: aload_0
        41: ldc_w         #678                // String server.jar
        44: invokespecial #680                // Method java/io/File."<init>":(Ljava/io/File;Ljava/lang/String;)V
        47: astore_2
        48: aload_2
        49: invokevirtual #683                // Method java/io/File.isFile:()Z
        52: ifeq          66
        55: aload_1
        56: aload_2
        57: invokevirtual #686                // Method java/io/File.getAbsolutePath:()Ljava/lang/String;
        60: invokeinterface #590,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        65: pop
        66: aload_0
        67: invokedynamic #689,  0            // InvokeDynamic #1:accept:()Ljava/io/FilenameFilter;
        72: invokevirtual #693                // Method java/io/File.listFiles:(Ljava/io/FilenameFilter;)[Ljava/io/File;
        75: astore_3
        76: aload_3
        77: ifnull        146
        80: aload_3
        81: invokedynamic #697,  0            // InvokeDynamic #2:apply:()Ljava/util/function/Function;
        86: invokestatic  #701                // InterfaceMethod java/util/Comparator.comparing:(Ljava/util/function/Function;)Ljava/util/Comparator;
        89: invokestatic  #707                // Method java/util/Arrays.sort:([Ljava/lang/Object;Ljava/util/Comparator;)V
        92: aload_3
        93: astore        4
        95: aload         4
        97: arraylength
        98: istore        5
       100: iconst_0
       101: istore        6
       103: iload         6
       105: iload         5
       107: if_icmpge     146
       110: aload         4
       112: iload         6
       114: aaload
       115: astore        7
       117: aload         7
       119: invokevirtual #713                // Method java/io/File.getName:()Ljava/lang/String;
       122: invokestatic  #716                // Method shouldExcludeRuntimeJar:(Ljava/lang/String;)Z
       125: ifne          140
       128: aload_1
       129: aload         7
       131: invokevirtual #686                // Method java/io/File.getAbsolutePath:()Ljava/lang/String;
       134: invokeinterface #590,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       139: pop
       140: iinc          6, 1
       143: goto          103
       146: getstatic     #719                // Field java/io/File.pathSeparator:Ljava/lang/String;
       149: aload_1
       150: invokestatic  #127                // Method java/lang/String.join:(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;
       153: areturn
      LineNumberTable:
        line 732: 0
        line 733: 11
        line 735: 28
        line 736: 36
        line 737: 48
        line 738: 55
        line 740: 66
        line 741: 76
        line 743: 80
        line 744: 92
        line 746: 117
        line 747: 128
        line 744: 140
        line 750: 146
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          117      23     7   jar   Ljava/io/File;
            0     154     0 libsDir   Ljava/io/File;
           36     118     1 entries   Ljava/util/List;
           48     106     2 serverJar   Ljava/io/File;
           76      78     3  jars   [Ljava/io/File;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
           36     118     1 entries   Ljava/util/List<Ljava/lang/String;>;
      StackMapTable: number_of_entries = 6
        frame_type = 11 /* same */
        frame_type = 16 /* same */
        frame_type = 253 /* append */
          offset_delta = 37
          locals = [ class java/util/List, class java/io/File ]
        frame_type = 255 /* full_frame */
          offset_delta = 36
          locals = [ class java/io/File, class java/util/List, class java/io/File, class "[Ljava/io/File;", class "[Ljava/io/File;", int, int ]
          stack = []
        frame_type = 36 /* same */
        frame_type = 248 /* chop */
          offset_delta = 5

  public static java.util.List<java.lang.String> getG1MemoryReclaimFlags();
    descriptor: ()Ljava/util/List;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=3, locals=1, args_size=0
         0: new           #583                // class java/util/ArrayList
         3: dup
         4: iconst_4
         5: invokespecial #734                // Method java/util/ArrayList."<init>":(I)V
         8: astore_0
         9: aload_0
        10: ldc_w         #736                // String -XX:G1PeriodicGCInterval=70000
        13: invokeinterface #590,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        18: pop
        19: aload_0
        20: ldc_w         #738                // String -XX:+G1PeriodicGCInvokesConcurrent
        23: invokeinterface #590,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        28: pop
        29: aload_0
        30: ldc_w         #740                // String -XX:MinHeapFreeRatio=10
        33: invokeinterface #590,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        38: pop
        39: aload_0
        40: ldc_w         #742                // String -XX:MaxHeapFreeRatio=30
        43: invokeinterface #590,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        48: pop
        49: aload_0
        50: areturn
      LineNumberTable:
        line 775: 0
        line 776: 9
        line 777: 19
        line 778: 29
        line 779: 39
        line 780: 49
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            9      42     0 flags   Ljava/util/List;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            9      42     0 flags   Ljava/util/List<Ljava/lang/String;>;
    Signature: #1054                        // ()Ljava/util/List<Ljava/lang/String;>;

  public static java.util.List<java.lang.String> getAppCdsFlags();
    descriptor: ()Ljava/util/List;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=3, locals=1, args_size=0
         0: new           #583                // class java/util/ArrayList
         3: dup
         4: iconst_3
         5: invokespecial #734                // Method java/util/ArrayList."<init>":(I)V
         8: astore_0
         9: aload_0
        10: ldc           #131                // String -XX:+AutoCreateSharedArchive
        12: invokeinterface #590,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        17: pop
        18: aload_0
        19: ldc_w         #642                // String -XX:SharedArchiveFile=cache/brproject_cds.jsa
        22: invokeinterface #590,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        27: pop
        28: aload_0
        29: ldc_w         #644                // String -Xlog:cds=error
        32: invokeinterface #590,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        37: pop
        38: aload_0
        39: areturn
      LineNumberTable:
        line 806: 0
        line 807: 9
        line 808: 18
        line 809: 28
        line 810: 38
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            9      31     0 flags   Ljava/util/List;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            9      31     0 flags   Ljava/util/List<Ljava/lang/String;>;
    Signature: #1054                        // ()Ljava/util/List<Ljava/lang/String;>;

  public static void setNormalShutdown();
    descriptor: ()V
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=0, args_size=0
         0: iconst_1
         1: putstatic     #825                // Field _normalShutdown:Z
         4: getstatic     #63                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
         7: ldc           #67                 // String
         9: invokevirtual #69                 // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;)V
        12: getstatic     #63                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
        15: ldc_w         #828                // String   Desligamento Normal Detectado
        18: invokevirtual #69                 // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;)V
        21: getstatic     #63                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
        24: ldc_w         #830                // String      -> Restart automatico desabilitado
        27: invokevirtual #69                 // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;)V
        30: getstatic     #63                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
        33: ldc_w         #832                // String      -> Servidor sera desligado sem reiniciar
        36: invokevirtual #69                 // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;)V
        39: getstatic     #63                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
        42: ldc           #67                 // String
        44: invokevirtual #69                 // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;)V
        47: return
      LineNumberTable:
        line 850: 0
        line 851: 4
        line 852: 12
        line 853: 21
        line 854: 30
        line 855: 39
        line 856: 47

  public static boolean isNormalShutdown();
    descriptor: ()Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #825                // Field _normalShutdown:Z
         3: ireturn
      LineNumberTable:
        line 863: 0

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=3, locals=0, args_size=0
         0: new           #70                 // class ext/mods/commons/logging/CLogger
         3: dup
         4: ldc           #8                  // class ext/mods/commons/util/JvmOptimizer
         6: invokevirtual #839                // Method java/lang/Class.getName:()Ljava/lang/String;
         9: invokespecial #966                // Method ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
        12: putstatic     #63                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
        15: iconst_0
        16: putstatic     #7                  // Field _initialized:Z
        19: iconst_0
        20: putstatic     #836                // Field _loggerConfigured:Z
        23: iconst_0
        24: putstatic     #825                // Field _normalShutdown:Z
        27: aconst_null
        28: putstatic     #795                // Field _healthMonitor:Lext/mods/commons/util/JvmOptimizer$HealthMonitor;
        31: new           #936                // class java/util/concurrent/atomic/AtomicInteger
        34: dup
        35: iconst_0
        36: invokespecial #967                // Method java/util/concurrent/atomic/AtomicInteger."<init>":(I)V
        39: putstatic     #968                // Field _restartCount:Ljava/util/concurrent/atomic/AtomicInteger;
        42: new           #936                // class java/util/concurrent/atomic/AtomicInteger
        45: dup
        46: iconst_0
        47: invokespecial #967                // Method java/util/concurrent/atomic/AtomicInteger."<init>":(I)V
        50: putstatic     #931                // Field _consecutiveFailures:Ljava/util/concurrent/atomic/AtomicInteger;
        53: aconst_null
        54: putstatic     #744                // Field _g1GcActive:Ljava/lang/Boolean;
        57: lconst_0
        58: putstatic     #971                // Field _lastThreadWarnTime:J
        61: iconst_0
        62: putstatic     #975                // Field _lastThreadWarnCount:I
        65: invokedynamic #979,  0            // InvokeDynamic #5:uncaughtException:()Ljava/lang/Thread$UncaughtExceptionHandler;
        70: invokestatic  #983                // Method java/lang/Thread.setDefaultUncaughtExceptionHandler:(Ljava/lang/Thread$UncaughtExceptionHandler;)V
        73: return
      LineNumberTable:
        line 49: 0
        line 54: 15
        line 55: 19
        line 57: 23
        line 58: 27
        line 59: 31
        line 60: 42
        line 73: 53
        line 79: 57
        line 80: 61
        line 1220: 65
        line 1256: 73
}
SourceFile: "JvmOptimizer.java"
NestMembers:
  ext/mods/commons/util/JvmOptimizer$HealthMonitor
BootstrapMethods:
  0: #1121 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1100 libsDir invalido: \u0001
  1: #1127 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1102 (Ljava/io/File;Ljava/lang/String;)Z
      #1103 REF_invokeStatic ext/mods/commons/util/JvmOptimizer.lambda$buildRuntimeClasspath$0:(Ljava/io/File;Ljava/lang/String;)Z
      #1102 (Ljava/io/File;Ljava/lang/String;)Z
  2: #1127 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1106 (Ljava/lang/Object;)Ljava/lang/Object;
      #1108 REF_invokeVirtual java/io/File.getName:()Ljava/lang/String;
      #1109 (Ljava/io/File;)Ljava/lang/String;
  3: #1127 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1110 ()V
      #1111 REF_invokeStatic ext/mods/commons/util/JvmOptimizer.lambda$initializeHealthMonitoring$0:()V
      #1110 ()V
  4: #1127 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1110 ()V
      #1114 REF_invokeStatic ext/mods/commons/util/JvmOptimizer.lambda$static$1:()V
      #1110 ()V
  5: #1127 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1117 (Ljava/lang/Thread;Ljava/lang/Throwable;)V
      #1118 REF_invokeStatic ext/mods/commons/util/JvmOptimizer.lambda$static$0:(Ljava/lang/Thread;Ljava/lang/Throwable;)V
      #1117 (Ljava/lang/Thread;Ljava/lang/Throwable;)V
InnerClasses:
  public static #1138= #1136 of #777;     // UncaughtExceptionHandler=class java/lang/Thread$UncaughtExceptionHandler of class java/lang/Thread
  public static final #1143= #1139 of #1141; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
