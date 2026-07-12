// Bytecode for: ext.mods.commons.pool.CoroutinePool
// File: ext\mods\commons\pool\CoroutinePool.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/commons/pool/CoroutinePool.class
  Last modified 9 de jul de 2026; size 31742 bytes
  MD5 checksum 1d457ddf26ab67d5d84891a96a453641
  Compiled from "CoroutinePool.kt"
public final class ext.mods.commons.pool.CoroutinePool
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #2                          // ext/mods/commons/pool/CoroutinePool
  super_class: #4                         // java/lang/Object
  interfaces: 0, fields: 24, methods: 36, attributes: 6
Constant pool:
     #1 = Utf8               ext/mods/commons/pool/CoroutinePool
     #2 = Class              #1           // ext/mods/commons/pool/CoroutinePool
     #3 = Utf8               java/lang/Object
     #4 = Class              #3           // java/lang/Object
     #5 = Utf8               <init>
     #6 = Utf8               ()V
     #7 = NameAndType        #5:#6        // "<init>":()V
     #8 = Methodref          #4.#7        // java/lang/Object."<init>":()V
     #9 = Utf8               this
    #10 = Utf8               Lext/mods/commons/pool/CoroutinePool;
    #11 = Utf8               getPathfindingDispatcher
    #12 = Utf8               ()Lkotlinx/coroutines/CoroutineDispatcher;
    #13 = Utf8               Lorg/jetbrains/annotations/NotNull;
    #14 = Utf8               pathfindingExecutor
    #15 = Utf8               Ljava/util/concurrent/ThreadPoolExecutor;
    #16 = NameAndType        #14:#15      // pathfindingExecutor:Ljava/util/concurrent/ThreadPoolExecutor;
    #17 = Fieldref           #2.#16       // ext/mods/commons/pool/CoroutinePool.pathfindingExecutor:Ljava/util/concurrent/ThreadPoolExecutor;
    #18 = Utf8               java/util/concurrent/ExecutorService
    #19 = Class              #18          // java/util/concurrent/ExecutorService
    #20 = Utf8               kotlinx/coroutines/ExecutorsKt
    #21 = Class              #20          // kotlinx/coroutines/ExecutorsKt
    #22 = Utf8               from
    #23 = Utf8               (Ljava/util/concurrent/ExecutorService;)Lkotlinx/coroutines/ExecutorCoroutineDispatcher;
    #24 = NameAndType        #22:#23      // from:(Ljava/util/concurrent/ExecutorService;)Lkotlinx/coroutines/ExecutorCoroutineDispatcher;
    #25 = Methodref          #21.#24      // kotlinx/coroutines/ExecutorsKt.from:(Ljava/util/concurrent/ExecutorService;)Lkotlinx/coroutines/ExecutorCoroutineDispatcher;
    #26 = Utf8               kotlinx/coroutines/CoroutineDispatcher
    #27 = Class              #26          // kotlinx/coroutines/CoroutineDispatcher
    #28 = Utf8               kotlinx/coroutines/Dispatchers
    #29 = Class              #28          // kotlinx/coroutines/Dispatchers
    #30 = Utf8               getDefault
    #31 = NameAndType        #30:#12      // getDefault:()Lkotlinx/coroutines/CoroutineDispatcher;
    #32 = Methodref          #29.#31      // kotlinx/coroutines/Dispatchers.getDefault:()Lkotlinx/coroutines/CoroutineDispatcher;
    #33 = Utf8               getENABLE_PROFILER
    #34 = Utf8               ()Z
    #35 = Utf8               ENABLE_PROFILER
    #36 = Utf8               Z
    #37 = NameAndType        #35:#36      // ENABLE_PROFILER:Z
    #38 = Fieldref           #2.#37       // ext/mods/commons/pool/CoroutinePool.ENABLE_PROFILER:Z
    #39 = Utf8               setENABLE_PROFILER
    #40 = Utf8               (Z)V
    #41 = Utf8               <set-?>
    #42 = Utf8               getBOTTLENECK_THRESHOLD_MS
    #43 = Utf8               ()J
    #44 = Utf8               BOTTLENECK_THRESHOLD_MS
    #45 = Utf8               J
    #46 = NameAndType        #44:#45      // BOTTLENECK_THRESHOLD_MS:J
    #47 = Fieldref           #2.#46       // ext/mods/commons/pool/CoroutinePool.BOTTLENECK_THRESHOLD_MS:J
    #48 = Utf8               setBOTTLENECK_THRESHOLD_MS
    #49 = Utf8               (J)V
    #50 = Utf8               init
    #51 = Utf8               Lkotlin/jvm/JvmStatic;
    #52 = Utf8               java/lang/Exception
    #53 = Class              #52          // java/lang/Exception
    #54 = Utf8               launcher
    #55 = String             #54          // launcher
    #56 = Utf8               brproject.role
    #57 = String             #56          // brproject.role
    #58 = Utf8               java/lang/System
    #59 = Class              #58          // java/lang/System
    #60 = Utf8               getProperty
    #61 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
    #62 = NameAndType        #60:#61      // getProperty:(Ljava/lang/String;)Ljava/lang/String;
    #63 = Methodref          #59.#62      // java/lang/System.getProperty:(Ljava/lang/String;)Ljava/lang/String;
    #64 = Utf8               kotlin/text/StringsKt
    #65 = Class              #64          // kotlin/text/StringsKt
    #66 = Utf8               equals
    #67 = Utf8               (Ljava/lang/String;Ljava/lang/String;Z)Z
    #68 = NameAndType        #66:#67      // equals:(Ljava/lang/String;Ljava/lang/String;Z)Z
    #69 = Methodref          #65.#68      // kotlin/text/StringsKt.equals:(Ljava/lang/String;Ljava/lang/String;Z)Z
    #70 = Utf8               scheduledExecutors
    #71 = Utf8               [Ljava/util/concurrent/ScheduledThreadPoolExecutor;
    #72 = NameAndType        #70:#71      // scheduledExecutors:[Ljava/util/concurrent/ScheduledThreadPoolExecutor;
    #73 = Fieldref           #2.#72       // ext/mods/commons/pool/CoroutinePool.scheduledExecutors:[Ljava/util/concurrent/ScheduledThreadPoolExecutor;
    #74 = Utf8               LOGGER
    #75 = Utf8               Ljava/util/logging/Logger;
    #76 = NameAndType        #74:#75      // LOGGER:Ljava/util/logging/Logger;
    #77 = Fieldref           #2.#76       // ext/mods/commons/pool/CoroutinePool.LOGGER:Ljava/util/logging/Logger;
    #78 = Utf8               CoroutinePool já foi inicializado. Ignorando nova inicialização.
    #79 = String             #78          // CoroutinePool já foi inicializado. Ignorando nova inicialização.
    #80 = Utf8               java/util/logging/Logger
    #81 = Class              #80          // java/util/logging/Logger
    #82 = Utf8               warning
    #83 = Utf8               (Ljava/lang/String;)V
    #84 = NameAndType        #82:#83      // warning:(Ljava/lang/String;)V
    #85 = Methodref          #81.#84      // java/util/logging/Logger.warning:(Ljava/lang/String;)V
    #86 = Utf8               INSTANCE
    #87 = NameAndType        #86:#10      // INSTANCE:Lext/mods/commons/pool/CoroutinePool;
    #88 = Fieldref           #2.#87       // ext/mods/commons/pool/CoroutinePool.INSTANCE:Lext/mods/commons/pool/CoroutinePool;
    #89 = Utf8               java/io/File
    #90 = Class              #89          // java/io/File
    #91 = Utf8               log
    #92 = String             #91          // log
    #93 = NameAndType        #5:#83       // "<init>":(Ljava/lang/String;)V
    #94 = Methodref          #90.#93      // java/io/File."<init>":(Ljava/lang/String;)V
    #95 = Utf8               mkdirs
    #96 = NameAndType        #95:#34      // mkdirs:()Z
    #97 = Methodref          #90.#96      // java/io/File.mkdirs:()Z
    #98 = Utf8               java/lang/Runtime
    #99 = Class              #98          // java/lang/Runtime
   #100 = Utf8               getRuntime
   #101 = Utf8               ()Ljava/lang/Runtime;
   #102 = NameAndType        #100:#101    // getRuntime:()Ljava/lang/Runtime;
   #103 = Methodref          #99.#102     // java/lang/Runtime.getRuntime:()Ljava/lang/Runtime;
   #104 = Utf8               availableProcessors
   #105 = Utf8               ()I
   #106 = NameAndType        #104:#105    // availableProcessors:()I
   #107 = Methodref          #99.#106     // java/lang/Runtime.availableProcessors:()I
   #108 = Utf8               ext/mods/Config
   #109 = Class              #108         // ext/mods/Config
   #110 = Utf8               SCHEDULED_THREAD_POOL_COUNT
   #111 = Utf8               I
   #112 = NameAndType        #110:#111    // SCHEDULED_THREAD_POOL_COUNT:I
   #113 = Fieldref           #109.#112    // ext/mods/Config.SCHEDULED_THREAD_POOL_COUNT:I
   #114 = Utf8               kotlin/ranges/RangesKt
   #115 = Class              #114         // kotlin/ranges/RangesKt
   #116 = Utf8               coerceIn
   #117 = Utf8               (III)I
   #118 = NameAndType        #116:#117    // coerceIn:(III)I
   #119 = Methodref          #115.#118    // kotlin/ranges/RangesKt.coerceIn:(III)I
   #120 = Utf8               java/lang/Math
   #121 = Class              #120         // java/lang/Math
   #122 = Utf8               min
   #123 = Utf8               (II)I
   #124 = NameAndType        #122:#123    // min:(II)I
   #125 = Methodref          #121.#124    // java/lang/Math.min:(II)I
   #126 = Utf8               coerceAtLeast
   #127 = NameAndType        #126:#123    // coerceAtLeast:(II)I
   #128 = Methodref          #115.#127    // kotlin/ranges/RangesKt.coerceAtLeast:(II)I
   #129 = Utf8               java/util/concurrent/ScheduledThreadPoolExecutor
   #130 = Class              #129         // java/util/concurrent/ScheduledThreadPoolExecutor
   #131 = Utf8               ext/mods/commons/pool/ThreadProvider
   #132 = Class              #131         // ext/mods/commons/pool/ThreadProvider
   #133 = Utf8               Scheduled-Pool-\u0001
   #134 = String             #133         // Scheduled-Pool-\u0001
   #135 = Utf8               java/lang/invoke/StringConcatFactory
   #136 = Class              #135         // java/lang/invoke/StringConcatFactory
   #137 = Utf8               makeConcatWithConstants
   #138 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #139 = NameAndType        #137:#138    // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #140 = Methodref          #136.#139    // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #141 = MethodHandle       6:#140       // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #142 = Utf8               (I)Ljava/lang/String;
   #143 = NameAndType        #137:#142    // makeConcatWithConstants:(I)Ljava/lang/String;
   #144 = InvokeDynamic      #0:#143      // #0:makeConcatWithConstants:(I)Ljava/lang/String;
   #145 = Utf8               (Ljava/lang/String;IZ)V
   #146 = NameAndType        #5:#145      // "<init>":(Ljava/lang/String;IZ)V
   #147 = Methodref          #132.#146    // ext/mods/commons/pool/ThreadProvider."<init>":(Ljava/lang/String;IZ)V
   #148 = Utf8               java/util/concurrent/ThreadFactory
   #149 = Class              #148         // java/util/concurrent/ThreadFactory
   #150 = Utf8               (ILjava/util/concurrent/ThreadFactory;)V
   #151 = NameAndType        #5:#150      // "<init>":(ILjava/util/concurrent/ThreadFactory;)V
   #152 = Methodref          #130.#151    // java/util/concurrent/ScheduledThreadPoolExecutor."<init>":(ILjava/util/concurrent/ThreadFactory;)V
   #153 = Utf8               setRemoveOnCancelPolicy
   #154 = NameAndType        #153:#40     // setRemoveOnCancelPolicy:(Z)V
   #155 = Methodref          #130.#154    // java/util/concurrent/ScheduledThreadPoolExecutor.setRemoveOnCancelPolicy:(Z)V
   #156 = Utf8               setExecuteExistingDelayedTasksAfterShutdownPolicy
   #157 = NameAndType        #156:#40     // setExecuteExistingDelayedTasksAfterShutdownPolicy:(Z)V
   #158 = Methodref          #130.#157    // java/util/concurrent/ScheduledThreadPoolExecutor.setExecuteExistingDelayedTasksAfterShutdownPolicy:(Z)V
   #159 = Utf8               kotlin/Unit
   #160 = Class              #159         // kotlin/Unit
   #161 = Utf8               Lkotlin/Unit;
   #162 = NameAndType        #86:#161     // INSTANCE:Lkotlin/Unit;
   #163 = Fieldref           #160.#162    // kotlin/Unit.INSTANCE:Lkotlin/Unit;
   #164 = Utf8               INSTANT_THREAD_POOL_COUNT
   #165 = NameAndType        #164:#111    // INSTANT_THREAD_POOL_COUNT:I
   #166 = Fieldref           #109.#165    // ext/mods/Config.INSTANT_THREAD_POOL_COUNT:I
   #167 = Utf8               coerceAtMost
   #168 = NameAndType        #167:#123    // coerceAtMost:(II)I
   #169 = Methodref          #115.#168    // kotlin/ranges/RangesKt.coerceAtMost:(II)I
   #170 = Utf8               java/util/concurrent/ThreadPoolExecutor
   #171 = Class              #170         // java/util/concurrent/ThreadPoolExecutor
   #172 = Utf8               Instant-Pool-\u0001
   #173 = String             #172         // Instant-Pool-\u0001
   #174 = InvokeDynamic      #1:#143      // #1:makeConcatWithConstants:(I)Ljava/lang/String;
   #175 = Long               60l
   #177 = Utf8               java/util/concurrent/TimeUnit
   #178 = Class              #177         // java/util/concurrent/TimeUnit
   #179 = Utf8               SECONDS
   #180 = Utf8               Ljava/util/concurrent/TimeUnit;
   #181 = NameAndType        #179:#180    // SECONDS:Ljava/util/concurrent/TimeUnit;
   #182 = Fieldref           #178.#181    // java/util/concurrent/TimeUnit.SECONDS:Ljava/util/concurrent/TimeUnit;
   #183 = Utf8               java/util/concurrent/LinkedBlockingQueue
   #184 = Class              #183         // java/util/concurrent/LinkedBlockingQueue
   #185 = Utf8               (I)V
   #186 = NameAndType        #5:#185      // "<init>":(I)V
   #187 = Methodref          #184.#186    // java/util/concurrent/LinkedBlockingQueue."<init>":(I)V
   #188 = Utf8               java/util/concurrent/BlockingQueue
   #189 = Class              #188         // java/util/concurrent/BlockingQueue
   #190 = Utf8               rejectedHandler
   #191 = Utf8               Lext/mods/commons/pool/RejectedExecutionHandlerOptimized;
   #192 = NameAndType        #190:#191    // rejectedHandler:Lext/mods/commons/pool/RejectedExecutionHandlerOptimized;
   #193 = Fieldref           #2.#192      // ext/mods/commons/pool/CoroutinePool.rejectedHandler:Lext/mods/commons/pool/RejectedExecutionHandlerOptimized;
   #194 = Utf8               java/util/concurrent/RejectedExecutionHandler
   #195 = Class              #194         // java/util/concurrent/RejectedExecutionHandler
   #196 = Utf8               (IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;Ljava/util/concurrent/RejectedExecutionHandler;)V
   #197 = NameAndType        #5:#196      // "<init>":(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;Ljava/util/concurrent/RejectedExecutionHandler;)V
   #198 = Methodref          #171.#197    // java/util/concurrent/ThreadPoolExecutor."<init>":(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;Ljava/util/concurrent/RejectedExecutionHandler;)V
   #199 = Utf8               allowCoreThreadTimeOut
   #200 = NameAndType        #199:#40     // allowCoreThreadTimeOut:(Z)V
   #201 = Methodref          #171.#200    // java/util/concurrent/ThreadPoolExecutor.allowCoreThreadTimeOut:(Z)V
   #202 = Utf8               instantExecutors
   #203 = Utf8               [Ljava/util/concurrent/ThreadPoolExecutor;
   #204 = NameAndType        #202:#203    // instantExecutors:[Ljava/util/concurrent/ThreadPoolExecutor;
   #205 = Fieldref           #2.#204      // ext/mods/commons/pool/CoroutinePool.instantExecutors:[Ljava/util/concurrent/ThreadPoolExecutor;
   #206 = Utf8               java/util/concurrent/Executors
   #207 = Class              #206         // java/util/concurrent/Executors
   #208 = Utf8               newVirtualThreadPerTaskExecutor
   #209 = Utf8               ()Ljava/util/concurrent/ExecutorService;
   #210 = NameAndType        #208:#209    // newVirtualThreadPerTaskExecutor:()Ljava/util/concurrent/ExecutorService;
   #211 = Methodref          #207.#210    // java/util/concurrent/Executors.newVirtualThreadPerTaskExecutor:()Ljava/util/concurrent/ExecutorService;
   #212 = Utf8               Virtual Thread Executor inicializado
   #213 = String             #212         // Virtual Thread Executor inicializado
   #214 = Utf8               info
   #215 = NameAndType        #214:#83     // info:(Ljava/lang/String;)V
   #216 = Methodref          #81.#215     // java/util/logging/Logger.info:(Ljava/lang/String;)V
   #217 = Utf8               virtualExecutor
   #218 = Utf8               Ljava/util/concurrent/ExecutorService;
   #219 = NameAndType        #217:#218    // virtualExecutor:Ljava/util/concurrent/ExecutorService;
   #220 = Fieldref           #2.#219      // ext/mods/commons/pool/CoroutinePool.virtualExecutor:Ljava/util/concurrent/ExecutorService;
   #221 = Utf8               PATHFINDING_THREADS
   #222 = NameAndType        #221:#111    // PATHFINDING_THREADS:I
   #223 = Fieldref           #109.#222    // ext/mods/Config.PATHFINDING_THREADS:I
   #224 = Utf8               Pathfinding-Thread
   #225 = String             #224         // Pathfinding-Thread
   #226 = Utf8               java/util/concurrent/ThreadPoolExecutor$CallerRunsPolicy
   #227 = Class              #226         // java/util/concurrent/ThreadPoolExecutor$CallerRunsPolicy
   #228 = Methodref          #227.#7      // java/util/concurrent/ThreadPoolExecutor$CallerRunsPolicy."<init>":()V
   #229 = Utf8               prestartAllCoreThreads
   #230 = NameAndType        #229:#105    // prestartAllCoreThreads:()I
   #231 = Methodref          #171.#230    // java/util/concurrent/ThreadPoolExecutor.prestartAllCoreThreads:()I
   #232 = Utf8               java/util/concurrent/ForkJoinPool
   #233 = Class              #232         // java/util/concurrent/ForkJoinPool
   #234 = Utf8               defaultForkJoinWorkerThreadFactory
   #235 = Utf8               Ljava/util/concurrent/ForkJoinPool$ForkJoinWorkerThreadFactory;
   #236 = NameAndType        #234:#235    // defaultForkJoinWorkerThreadFactory:Ljava/util/concurrent/ForkJoinPool$ForkJoinWorkerThreadFactory;
   #237 = Fieldref           #233.#236    // java/util/concurrent/ForkJoinPool.defaultForkJoinWorkerThreadFactory:Ljava/util/concurrent/ForkJoinPool$ForkJoinWorkerThreadFactory;
   #238 = Utf8               (ILjava/util/concurrent/ForkJoinPool$ForkJoinWorkerThreadFactory;Ljava/lang/Thread$UncaughtExceptionHandler;Z)V
   #239 = NameAndType        #5:#238      // "<init>":(ILjava/util/concurrent/ForkJoinPool$ForkJoinWorkerThreadFactory;Ljava/lang/Thread$UncaughtExceptionHandler;Z)V
   #240 = Methodref          #233.#239    // java/util/concurrent/ForkJoinPool."<init>":(ILjava/util/concurrent/ForkJoinPool$ForkJoinWorkerThreadFactory;Ljava/lang/Thread$UncaughtExceptionHandler;Z)V
   #241 = Utf8               forkJoinPool
   #242 = Utf8               Ljava/util/concurrent/ForkJoinPool;
   #243 = NameAndType        #241:#242    // forkJoinPool:Ljava/util/concurrent/ForkJoinPool;
   #244 = Fieldref           #2.#243      // ext/mods/commons/pool/CoroutinePool.forkJoinPool:Ljava/util/concurrent/ForkJoinPool;
   #245 = Utf8               === Inicializado ===
   #246 = String             #245         // === Inicializado ===
   #247 = Utf8                 - Scheduled: \u0001 pools x \u0001 threads
   #248 = String             #247         //   - Scheduled: \u0001 pools x \u0001 threads
   #249 = Utf8               (II)Ljava/lang/String;
   #250 = NameAndType        #137:#249    // makeConcatWithConstants:(II)Ljava/lang/String;
   #251 = InvokeDynamic      #2:#250      // #2:makeConcatWithConstants:(II)Ljava/lang/String;
   #252 = Utf8                 - Instant: \u0001 pools x core \u0001 max \u0001
   #253 = String             #252         //   - Instant: \u0001 pools x core \u0001 max \u0001
   #254 = Utf8               (III)Ljava/lang/String;
   #255 = NameAndType        #137:#254    // makeConcatWithConstants:(III)Ljava/lang/String;
   #256 = InvokeDynamic      #3:#255      // #3:makeConcatWithConstants:(III)Ljava/lang/String;
   #257 = Utf8                 - Virtual Thread Executor: Ativo (I/O-bound tasks)
   #258 = String             #257         //   - Virtual Thread Executor: Ativo (I/O-bound tasks)
   #259 = Utf8                 - Pathfinding Threads: \u0001 (CPU-bound)
   #260 = String             #259         //   - Pathfinding Threads: \u0001 (CPU-bound)
   #261 = InvokeDynamic      #4:#143      // #4:makeConcatWithConstants:(I)Ljava/lang/String;
   #262 = Utf8                 - Smart Dispatcher: Ativo (Lento > 15ms)
   #263 = String             #262         //   - Smart Dispatcher: Ativo (Lento > 15ms)
   #264 = Utf8               ATIVO
   #265 = String             #264         // ATIVO
   #266 = Utf8               DESATIVADO
   #267 = String             #266         // DESATIVADO
   #268 = Utf8                 - Global Profiler: \u0001
   #269 = String             #268         //   - Global Profiler: \u0001
   #270 = NameAndType        #137:#61     // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #271 = InvokeDynamic      #5:#270      // #5:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #272 = Utf8               java.version
   #273 = String             #272         // java.version
   #274 = Utf8                 - JVM: \u0001
   #275 = String             #274         //   - JVM: \u0001
   #276 = InvokeDynamic      #6:#270      // #6:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #277 = Utf8               getMessage
   #278 = Utf8               ()Ljava/lang/String;
   #279 = NameAndType        #277:#278    // getMessage:()Ljava/lang/String;
   #280 = Methodref          #53.#279     // java/lang/Exception.getMessage:()Ljava/lang/String;
   #281 = Utf8               ERRO CRÍTICO ao inicializar CoroutinePool: \u0001
   #282 = String             #281         // ERRO CRÍTICO ao inicializar CoroutinePool: \u0001
   #283 = InvokeDynamic      #7:#270      // #7:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #284 = Utf8               severe
   #285 = NameAndType        #284:#83     // severe:(Ljava/lang/String;)V
   #286 = Methodref          #81.#285     // java/util/logging/Logger.severe:(Ljava/lang/String;)V
   #287 = Utf8               printStackTrace
   #288 = NameAndType        #287:#6      // printStackTrace:()V
   #289 = Methodref          #53.#288     // java/lang/Exception.printStackTrace:()V
   #290 = Utf8               $i$a$-let-CoroutinePool$init$totalScheduled$1
   #291 = Utf8               it
   #292 = Utf8               $i$a$-apply-CoroutinePool$init$1$1
   #293 = Utf8               $this$init_u24lambda_u241
   #294 = Utf8               Ljava/util/concurrent/ScheduledThreadPoolExecutor;
   #295 = Utf8               threadProvider
   #296 = Utf8               Lext/mods/commons/pool/ThreadProvider;
   #297 = Utf8               $i$a$-let-CoroutinePool$init$totalInstant$1
   #298 = Utf8               $i$a$-apply-CoroutinePool$init$2$1
   #299 = Utf8               $this$init_u24lambda_u243
   #300 = Utf8               $i$a$-apply-CoroutinePool$init$3
   #301 = Utf8               $this$init_u24lambda_u244
   #302 = Utf8               $i$a$-let-CoroutinePool$init$pathfindingThreads$1
   #303 = Utf8               $i$a$-apply-CoroutinePool$init$4
   #304 = Utf8               $this$init_u24lambda_u246
   #305 = Utf8               totalScheduled
   #306 = Utf8               scheduledPoolCount
   #307 = Utf8               scheduledPoolCoreSize
   #308 = Utf8               totalInstant
   #309 = Utf8               instantPoolCount
   #310 = Utf8               instantPoolCoreSize
   #311 = Utf8               instantPoolMaxSize
   #312 = Utf8               pathfindingThreads
   #313 = Utf8               pathfindingThreadProvider
   #314 = Utf8               e
   #315 = Utf8               Ljava/lang/Exception;
   #316 = Class              #71          // "[Ljava/util/concurrent/ScheduledThreadPoolExecutor;"
   #317 = Class              #203         // "[Ljava/util/concurrent/ThreadPoolExecutor;"
   #318 = Utf8               java/lang/String
   #319 = Class              #318         // java/lang/String
   #320 = Utf8               writeBottleneckToFile
   #321 = MethodType         #6           //  ()V
   #322 = Utf8               writeBottleneckToFile$lambda$0
   #323 = NameAndType        #322:#83     // writeBottleneckToFile$lambda$0:(Ljava/lang/String;)V
   #324 = Methodref          #2.#323      // ext/mods/commons/pool/CoroutinePool.writeBottleneckToFile$lambda$0:(Ljava/lang/String;)V
   #325 = MethodHandle       6:#324       // REF_invokeStatic ext/mods/commons/pool/CoroutinePool.writeBottleneckToFile$lambda$0:(Ljava/lang/String;)V
   #326 = Utf8               java/lang/invoke/LambdaMetafactory
   #327 = Class              #326         // java/lang/invoke/LambdaMetafactory
   #328 = Utf8               metafactory
   #329 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
   #330 = NameAndType        #328:#329    // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
   #331 = Methodref          #327.#330    // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
   #332 = MethodHandle       6:#331       // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
   #333 = Utf8               run
   #334 = Utf8               (Ljava/lang/String;)Ljava/lang/Runnable;
   #335 = NameAndType        #333:#334    // run:(Ljava/lang/String;)Ljava/lang/Runnable;
   #336 = InvokeDynamic      #8:#335      // #8:run:(Ljava/lang/String;)Ljava/lang/Runnable;
   #337 = Utf8               execute
   #338 = Utf8               (Ljava/lang/Runnable;)V
   #339 = NameAndType        #337:#338    // execute:(Ljava/lang/Runnable;)V
   #340 = InterfaceMethodref #19.#339     // java/util/concurrent/ExecutorService.execute:(Ljava/lang/Runnable;)V
   #341 = Utf8               message
   #342 = Utf8               Ljava/lang/String;
   #343 = Utf8               wrapProfiler
   #344 = Utf8               (Ljava/lang/Runnable;Ljava/lang/String;)Ljava/lang/Runnable;
   #345 = Utf8               wrapProfiler$lambda$0
   #346 = NameAndType        #345:#338    // wrapProfiler$lambda$0:(Ljava/lang/Runnable;)V
   #347 = Methodref          #2.#346      // ext/mods/commons/pool/CoroutinePool.wrapProfiler$lambda$0:(Ljava/lang/Runnable;)V
   #348 = MethodHandle       6:#347       // REF_invokeStatic ext/mods/commons/pool/CoroutinePool.wrapProfiler$lambda$0:(Ljava/lang/Runnable;)V
   #349 = Utf8               (Ljava/lang/Runnable;)Ljava/lang/Runnable;
   #350 = NameAndType        #333:#349    // run:(Ljava/lang/Runnable;)Ljava/lang/Runnable;
   #351 = InvokeDynamic      #9:#350      // #9:run:(Ljava/lang/Runnable;)Ljava/lang/Runnable;
   #352 = Methodref          #53.#7       // java/lang/Exception."<init>":()V
   #353 = Utf8               getStackTrace
   #354 = Utf8               ()[Ljava/lang/StackTraceElement;
   #355 = NameAndType        #353:#354    // getStackTrace:()[Ljava/lang/StackTraceElement;
   #356 = Methodref          #53.#355     // java/lang/Exception.getStackTrace:()[Ljava/lang/StackTraceElement;
   #357 = Utf8               java/lang/StackTraceElement
   #358 = Class              #357         // java/lang/StackTraceElement
   #359 = Utf8               getClassName
   #360 = NameAndType        #359:#278    // getClassName:()Ljava/lang/String;
   #361 = Methodref          #358.#360    // java/lang/StackTraceElement.getClassName:()Ljava/lang/String;
   #362 = Utf8               java/lang/CharSequence
   #363 = Class              #362         // java/lang/CharSequence
   #364 = Utf8               ext.mods.commons.pool.CoroutinePool
   #365 = String             #364         // ext.mods.commons.pool.CoroutinePool
   #366 = Utf8               contains$default
   #367 = Utf8               (Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z
   #368 = NameAndType        #366:#367    // contains$default:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z
   #369 = Methodref          #65.#368     // kotlin/text/StringsKt.contains$default:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z
   #370 = Utf8               ext.mods.commons.pool.ThreadPool
   #371 = String             #370         // ext.mods.commons.pool.ThreadPool
   #372 = Utf8               java.lang.Thread
   #373 = String             #372         // java.lang.Thread
   #374 = Utf8               wrapProfiler$lambda$2
   #375 = Utf8               (Ljava/lang/Runnable;Ljava/lang/StackTraceElement;Ljava/lang/String;)V
   #376 = NameAndType        #374:#375    // wrapProfiler$lambda$2:(Ljava/lang/Runnable;Ljava/lang/StackTraceElement;Ljava/lang/String;)V
   #377 = Methodref          #2.#376      // ext/mods/commons/pool/CoroutinePool.wrapProfiler$lambda$2:(Ljava/lang/Runnable;Ljava/lang/StackTraceElement;Ljava/lang/String;)V
   #378 = MethodHandle       6:#377       // REF_invokeStatic ext/mods/commons/pool/CoroutinePool.wrapProfiler$lambda$2:(Ljava/lang/Runnable;Ljava/lang/StackTraceElement;Ljava/lang/String;)V
   #379 = Utf8               (Ljava/lang/Runnable;Ljava/lang/StackTraceElement;Ljava/lang/String;)Ljava/lang/Runnable;
   #380 = NameAndType        #333:#379    // run:(Ljava/lang/Runnable;Ljava/lang/StackTraceElement;Ljava/lang/String;)Ljava/lang/Runnable;
   #381 = InvokeDynamic      #10:#380     // #10:run:(Ljava/lang/Runnable;Ljava/lang/StackTraceElement;Ljava/lang/String;)Ljava/lang/Runnable;
   #382 = Utf8               $i$a$-firstOrNull-CoroutinePool$wrapProfiler$callerTrace$1
   #383 = Utf8               Ljava/lang/StackTraceElement;
   #384 = Utf8               element$iv
   #385 = Utf8               Ljava/lang/Object;
   #386 = Utf8               $i$f$firstOrNull
   #387 = Utf8               $this$firstOrNull$iv
   #388 = Utf8               [Ljava/lang/Object;
   #389 = Utf8               callerTrace
   #390 = Utf8               task
   #391 = Utf8               Ljava/lang/Runnable;
   #392 = Utf8               executorName
   #393 = Utf8               java/lang/Runnable
   #394 = Class              #393         // java/lang/Runnable
   #395 = Utf8               [Ljava/lang/StackTraceElement;
   #396 = Class              #395         // "[Ljava/lang/StackTraceElement;"
   #397 = Utf8               executeSmart
   #398 = Utf8               (Ljava/lang/String;Ljava/lang/Runnable;)V
   #399 = Utf8               taskRoutingHistory
   #400 = Utf8               Ljava/util/concurrent/ConcurrentHashMap;
   #401 = NameAndType        #399:#400    // taskRoutingHistory:Ljava/util/concurrent/ConcurrentHashMap;
   #402 = Fieldref           #2.#401      // ext/mods/commons/pool/CoroutinePool.taskRoutingHistory:Ljava/util/concurrent/ConcurrentHashMap;
   #403 = Utf8               ext/mods/commons/pool/CoroutinePool$ExecutionRoute
   #404 = Class              #403         // ext/mods/commons/pool/CoroutinePool$ExecutionRoute
   #405 = Utf8               PLATFORM
   #406 = Utf8               Lext/mods/commons/pool/CoroutinePool$ExecutionRoute;
   #407 = NameAndType        #405:#406    // PLATFORM:Lext/mods/commons/pool/CoroutinePool$ExecutionRoute;
   #408 = Fieldref           #404.#407    // ext/mods/commons/pool/CoroutinePool$ExecutionRoute.PLATFORM:Lext/mods/commons/pool/CoroutinePool$ExecutionRoute;
   #409 = Utf8               java/util/concurrent/ConcurrentHashMap
   #410 = Class              #409         // java/util/concurrent/ConcurrentHashMap
   #411 = Utf8               getOrDefault
   #412 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #413 = NameAndType        #411:#412    // getOrDefault:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #414 = Methodref          #410.#413    // java/util/concurrent/ConcurrentHashMap.getOrDefault:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #415 = Utf8               executeSmart$lambda$0
   #416 = Utf8               (Ljava/lang/Runnable;Lext/mods/commons/pool/CoroutinePool$ExecutionRoute;Ljava/lang/String;)V
   #417 = NameAndType        #415:#416    // executeSmart$lambda$0:(Ljava/lang/Runnable;Lext/mods/commons/pool/CoroutinePool$ExecutionRoute;Ljava/lang/String;)V
   #418 = Methodref          #2.#417      // ext/mods/commons/pool/CoroutinePool.executeSmart$lambda$0:(Ljava/lang/Runnable;Lext/mods/commons/pool/CoroutinePool$ExecutionRoute;Ljava/lang/String;)V
   #419 = MethodHandle       6:#418       // REF_invokeStatic ext/mods/commons/pool/CoroutinePool.executeSmart$lambda$0:(Ljava/lang/Runnable;Lext/mods/commons/pool/CoroutinePool$ExecutionRoute;Ljava/lang/String;)V
   #420 = Utf8               (Ljava/lang/Runnable;Lext/mods/commons/pool/CoroutinePool$ExecutionRoute;Ljava/lang/String;)Ljava/lang/Runnable;
   #421 = NameAndType        #333:#420    // run:(Ljava/lang/Runnable;Lext/mods/commons/pool/CoroutinePool$ExecutionRoute;Ljava/lang/String;)Ljava/lang/Runnable;
   #422 = InvokeDynamic      #11:#421     // #11:run:(Ljava/lang/Runnable;Lext/mods/commons/pool/CoroutinePool$ExecutionRoute;Ljava/lang/String;)Ljava/lang/Runnable;
   #423 = Utf8               ext/mods/commons/pool/CoroutinePool$WhenMappings
   #424 = Class              #423         // ext/mods/commons/pool/CoroutinePool$WhenMappings
   #425 = Utf8               $EnumSwitchMapping$0
   #426 = Utf8               [I
   #427 = NameAndType        #425:#426    // $EnumSwitchMapping$0:[I
   #428 = Fieldref           #424.#427    // ext/mods/commons/pool/CoroutinePool$WhenMappings.$EnumSwitchMapping$0:[I
   #429 = Utf8               ordinal
   #430 = NameAndType        #429:#105    // ordinal:()I
   #431 = Methodref          #404.#430    // ext/mods/commons/pool/CoroutinePool$ExecutionRoute.ordinal:()I
   #432 = Methodref          #2.#339      // ext/mods/commons/pool/CoroutinePool.execute:(Ljava/lang/Runnable;)V
   #433 = Utf8               kotlin/NoWhenBranchMatchedException
   #434 = Class              #433         // kotlin/NoWhenBranchMatchedException
   #435 = Methodref          #434.#7      // kotlin/NoWhenBranchMatchedException."<init>":()V
   #436 = Utf8               currentRoute
   #437 = Utf8               wrappedTask
   #438 = Utf8               taskId
   #439 = Utf8               getClass
   #440 = Utf8               ()Ljava/lang/Class;
   #441 = NameAndType        #439:#440    // getClass:()Ljava/lang/Class;
   #442 = Methodref          #4.#441      // java/lang/Object.getClass:()Ljava/lang/Class;
   #443 = Utf8               java/lang/Class
   #444 = Class              #443         // java/lang/Class
   #445 = Utf8               getSimpleName
   #446 = NameAndType        #445:#278    // getSimpleName:()Ljava/lang/String;
   #447 = Methodref          #444.#446    // java/lang/Class.getSimpleName:()Ljava/lang/String;
   #448 = NameAndType        #397:#398    // executeSmart:(Ljava/lang/String;Ljava/lang/Runnable;)V
   #449 = Methodref          #2.#448      // ext/mods/commons/pool/CoroutinePool.executeSmart:(Ljava/lang/String;Ljava/lang/Runnable;)V
   #450 = Utf8               java/util/concurrent/RejectedExecutionException
   #451 = Class              #450         // java/util/concurrent/RejectedExecutionException
   #452 = Utf8               CoroutinePool não inicializado. Executando tarefa de emergência.
   #453 = String             #452         // CoroutinePool não inicializado. Executando tarefa de emergência.
   #454 = NameAndType        #333:#6      // run:()V
   #455 = InterfaceMethodref #394.#454    // java/lang/Runnable.run:()V
   #456 = Utf8               totalTasksSubmitted
   #457 = Utf8               Ljava/util/concurrent/atomic/LongAdder;
   #458 = NameAndType        #456:#457    // totalTasksSubmitted:Ljava/util/concurrent/atomic/LongAdder;
   #459 = Fieldref           #2.#458      // ext/mods/commons/pool/CoroutinePool.totalTasksSubmitted:Ljava/util/concurrent/atomic/LongAdder;
   #460 = Utf8               java/util/concurrent/atomic/LongAdder
   #461 = Class              #460         // java/util/concurrent/atomic/LongAdder
   #462 = Utf8               increment
   #463 = NameAndType        #462:#6      // increment:()V
   #464 = Methodref          #461.#463    // java/util/concurrent/atomic/LongAdder.increment:()V
   #465 = Utf8               java/util/concurrent/ThreadLocalRandom
   #466 = Class              #465         // java/util/concurrent/ThreadLocalRandom
   #467 = Utf8               current
   #468 = Utf8               ()Ljava/util/concurrent/ThreadLocalRandom;
   #469 = NameAndType        #467:#468    // current:()Ljava/util/concurrent/ThreadLocalRandom;
   #470 = Methodref          #466.#469    // java/util/concurrent/ThreadLocalRandom.current:()Ljava/util/concurrent/ThreadLocalRandom;
   #471 = Utf8               nextInt
   #472 = Utf8               (I)I
   #473 = NameAndType        #471:#472    // nextInt:(I)I
   #474 = Methodref          #466.#473    // java/util/concurrent/ThreadLocalRandom.nextInt:(I)I
   #475 = Utf8               InstantPool
   #476 = String             #475         // InstantPool
   #477 = NameAndType        #343:#344    // wrapProfiler:(Ljava/lang/Runnable;Ljava/lang/String;)Ljava/lang/Runnable;
   #478 = Methodref          #2.#477      // ext/mods/commons/pool/CoroutinePool.wrapProfiler:(Ljava/lang/Runnable;Ljava/lang/String;)Ljava/lang/Runnable;
   #479 = Methodref          #171.#339    // java/util/concurrent/ThreadPoolExecutor.execute:(Ljava/lang/Runnable;)V
   #480 = Utf8               totalTasksRejected
   #481 = NameAndType        #480:#457    // totalTasksRejected:Ljava/util/concurrent/atomic/LongAdder;
   #482 = Fieldref           #2.#481      // ext/mods/commons/pool/CoroutinePool.totalTasksRejected:Ljava/util/concurrent/atomic/LongAdder;
   #483 = Utf8               Tarefa rejeitada (pool cheio). Executando na thread atual.
   #484 = String             #483         // Tarefa rejeitada (pool cheio). Executando na thread atual.
   #485 = Utf8               kotlin/collections/ArraysKt
   #486 = Class              #485         // kotlin/collections/ArraysKt
   #487 = Utf8               getOrNull
   #488 = Utf8               ([Ljava/lang/Object;I)Ljava/lang/Object;
   #489 = NameAndType        #487:#488    // getOrNull:([Ljava/lang/Object;I)Ljava/lang/Object;
   #490 = Methodref          #486.#489    // kotlin/collections/ArraysKt.getOrNull:([Ljava/lang/Object;I)Ljava/lang/Object;
   #491 = Utf8               isShutdown
   #492 = NameAndType        #491:#34     // isShutdown:()Z
   #493 = Methodref          #171.#492    // java/util/concurrent/ThreadPoolExecutor.isShutdown:()Z
   #494 = Utf8               ext/mods/commons/pool/RejectedExecutionHandlerOptimized
   #495 = Class              #494         // ext/mods/commons/pool/RejectedExecutionHandlerOptimized
   #496 = Utf8               rejectedExecution
   #497 = Utf8               (Ljava/lang/Runnable;Ljava/util/concurrent/ThreadPoolExecutor;)V
   #498 = NameAndType        #496:#497    // rejectedExecution:(Ljava/lang/Runnable;Ljava/util/concurrent/ThreadPoolExecutor;)V
   #499 = Methodref          #495.#498    // ext/mods/commons/pool/RejectedExecutionHandlerOptimized.rejectedExecution:(Ljava/lang/Runnable;Ljava/util/concurrent/ThreadPoolExecutor;)V
   #500 = Utf8               Erro ao executar tarefa instantânea: \u0001
   #501 = String             #500         // Erro ao executar tarefa instantânea: \u0001
   #502 = InvokeDynamic      #12:#270     // #12:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #503 = Utf8               selectedPool
   #504 = Utf8               ex
   #505 = Utf8               pool0
   #506 = Utf8               Ljava/util/concurrent/RejectedExecutionException;
   #507 = Utf8               executors
   #508 = Utf8               r
   #509 = Utf8               executeIO
   #510 = Utf8               VirtualPool
   #511 = String             #510         // VirtualPool
   #512 = Utf8               Erro ao executar tarefa I/O: \u0001
   #513 = String             #512         // Erro ao executar tarefa I/O: \u0001
   #514 = InvokeDynamic      #13:#270     // #13:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #515 = Utf8               executor
   #516 = Utf8               schedule
   #517 = Utf8               (Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
   #518 = Utf8               (Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture<*>;
   #519 = Utf8               ext/mods/commons/pool/ScheduledFutureTask
   #520 = Class              #519         // ext/mods/commons/pool/ScheduledFutureTask
   #521 = Utf8               Companion
   #522 = Utf8               Lext/mods/commons/pool/ScheduledFutureTask$Companion;
   #523 = NameAndType        #521:#522    // Companion:Lext/mods/commons/pool/ScheduledFutureTask$Companion;
   #524 = Fieldref           #520.#523    // ext/mods/commons/pool/ScheduledFutureTask.Companion:Lext/mods/commons/pool/ScheduledFutureTask$Companion;
   #525 = Utf8               ext/mods/commons/pool/ScheduledFutureTask$Companion
   #526 = Class              #525         // ext/mods/commons/pool/ScheduledFutureTask$Companion
   #527 = Utf8               cancelled
   #528 = Utf8               ()Ljava/util/concurrent/ScheduledFuture;
   #529 = NameAndType        #527:#528    // cancelled:()Ljava/util/concurrent/ScheduledFuture;
   #530 = Methodref          #526.#529    // ext/mods/commons/pool/ScheduledFutureTask$Companion.cancelled:()Ljava/util/concurrent/ScheduledFuture;
   #531 = Utf8               ScheduledPool
   #532 = String             #531         // ScheduledPool
   #533 = Utf8               validate
   #534 = Utf8               (J)J
   #535 = NameAndType        #533:#534    // validate:(J)J
   #536 = Methodref          #2.#535      // ext/mods/commons/pool/CoroutinePool.validate:(J)J
   #537 = Utf8               MILLISECONDS
   #538 = NameAndType        #537:#180    // MILLISECONDS:Ljava/util/concurrent/TimeUnit;
   #539 = Fieldref           #178.#538    // java/util/concurrent/TimeUnit.MILLISECONDS:Ljava/util/concurrent/TimeUnit;
   #540 = Utf8               (Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;
   #541 = NameAndType        #516:#540    // schedule:(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;
   #542 = Methodref          #130.#541    // java/util/concurrent/ScheduledThreadPoolExecutor.schedule:(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;
   #543 = Utf8               Erro ao agendar tarefa: \u0001
   #544 = String             #543         // Erro ao agendar tarefa: \u0001
   #545 = InvokeDynamic      #14:#270     // #14:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #546 = Utf8               delay
   #547 = Utf8               java/util/concurrent/ScheduledFuture
   #548 = Class              #547         // java/util/concurrent/ScheduledFuture
   #549 = Utf8               scheduleAtFixedRate
   #550 = Utf8               (Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
   #551 = Utf8               (Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture<*>;
   #552 = Utf8               ScheduledPool-Periodic
   #553 = String             #552         // ScheduledPool-Periodic
   #554 = Utf8               (Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;
   #555 = NameAndType        #549:#554    // scheduleAtFixedRate:(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;
   #556 = Methodref          #130.#555    // java/util/concurrent/ScheduledThreadPoolExecutor.scheduleAtFixedRate:(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;
   #557 = Utf8               Erro ao agendar tarefa periódica: \u0001
   #558 = String             #557         // Erro ao agendar tarefa periódica: \u0001
   #559 = InvokeDynamic      #15:#270     // #15:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #560 = Utf8               period
   #561 = Utf8               executePathfinding
   #562 = Utf8               pathfindingTasksSubmitted
   #563 = NameAndType        #562:#457    // pathfindingTasksSubmitted:Ljava/util/concurrent/atomic/LongAdder;
   #564 = Fieldref           #2.#563      // ext/mods/commons/pool/CoroutinePool.pathfindingTasksSubmitted:Ljava/util/concurrent/atomic/LongAdder;
   #565 = Utf8               PathfindingPool
   #566 = String             #565         // PathfindingPool
   #567 = Utf8               PathfindingPool ocupado/erro: \u0001
   #568 = String             #567         // PathfindingPool ocupado/erro: \u0001
   #569 = InvokeDynamic      #16:#270     // #16:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #570 = Utf8               fine
   #571 = NameAndType        #570:#83     // fine:(Ljava/lang/String;)V
   #572 = Methodref          #81.#571     // java/util/logging/Logger.fine:(Ljava/lang/String;)V
   #573 = Utf8               $i$a$-run-CoroutinePool$executePathfinding$executor$1
   #574 = Utf8               $this$executePathfinding_u24lambda_u240
   #575 = Utf8               runPathfindingBlocking
   #576 = Utf8               (Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;
   #577 = Utf8               <T:Ljava/lang/Object;>(Lkotlin/jvm/functions/Function0<+TT;>;)TT;
   #578 = Utf8               kotlin/jvm/functions/Function0
   #579 = Class              #578         // kotlin/jvm/functions/Function0
   #580 = Utf8               invoke
   #581 = Utf8               ()Ljava/lang/Object;
   #582 = NameAndType        #580:#581    // invoke:()Ljava/lang/Object;
   #583 = InterfaceMethodref #579.#582    // kotlin/jvm/functions/Function0.invoke:()Ljava/lang/Object;
   #584 = MethodType         #581         //  ()Ljava/lang/Object;
   #585 = Utf8               runPathfindingBlocking$lambda$0
   #586 = NameAndType        #585:#576    // runPathfindingBlocking$lambda$0:(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;
   #587 = Methodref          #2.#586      // ext/mods/commons/pool/CoroutinePool.runPathfindingBlocking$lambda$0:(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;
   #588 = MethodHandle       6:#587       // REF_invokeStatic ext/mods/commons/pool/CoroutinePool.runPathfindingBlocking$lambda$0:(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;
   #589 = Utf8               get
   #590 = Utf8               (Lkotlin/jvm/functions/Function0;)Ljava/util/function/Supplier;
   #591 = NameAndType        #589:#590    // get:(Lkotlin/jvm/functions/Function0;)Ljava/util/function/Supplier;
   #592 = InvokeDynamic      #17:#591     // #17:get:(Lkotlin/jvm/functions/Function0;)Ljava/util/function/Supplier;
   #593 = Utf8               java/util/concurrent/Executor
   #594 = Class              #593         // java/util/concurrent/Executor
   #595 = Utf8               java/util/concurrent/CompletableFuture
   #596 = Class              #595         // java/util/concurrent/CompletableFuture
   #597 = Utf8               supplyAsync
   #598 = Utf8               (Ljava/util/function/Supplier;Ljava/util/concurrent/Executor;)Ljava/util/concurrent/CompletableFuture;
   #599 = NameAndType        #597:#598    // supplyAsync:(Ljava/util/function/Supplier;Ljava/util/concurrent/Executor;)Ljava/util/concurrent/CompletableFuture;
   #600 = Methodref          #596.#599    // java/util/concurrent/CompletableFuture.supplyAsync:(Ljava/util/function/Supplier;Ljava/util/concurrent/Executor;)Ljava/util/concurrent/CompletableFuture;
   #601 = NameAndType        #589:#581    // get:()Ljava/lang/Object;
   #602 = Methodref          #596.#601    // java/util/concurrent/CompletableFuture.get:()Ljava/lang/Object;
   #603 = Utf8               future
   #604 = Utf8               Ljava/util/concurrent/CompletableFuture;
   #605 = Utf8               block
   #606 = Utf8               Lkotlin/jvm/functions/Function0;
   #607 = Utf8               executeParallel
   #608 = Utf8               (Ljava/lang/Runnable;)Lkotlinx/coroutines/Job;
   #609 = Utf8               BackgroundScope
   #610 = Utf8               Lkotlinx/coroutines/CoroutineScope;
   #611 = NameAndType        #609:#610    // BackgroundScope:Lkotlinx/coroutines/CoroutineScope;
   #612 = Fieldref           #2.#611      // ext/mods/commons/pool/CoroutinePool.BackgroundScope:Lkotlinx/coroutines/CoroutineScope;
   #613 = Utf8               kotlin/coroutines/CoroutineContext
   #614 = Class              #613         // kotlin/coroutines/CoroutineContext
   #615 = Utf8               ext/mods/commons/pool/CoroutinePool$executeParallel$1
   #616 = Class              #615         // ext/mods/commons/pool/CoroutinePool$executeParallel$1
   #617 = Utf8               (Ljava/lang/Runnable;Lkotlin/coroutines/Continuation;)V
   #618 = NameAndType        #5:#617      // "<init>":(Ljava/lang/Runnable;Lkotlin/coroutines/Continuation;)V
   #619 = Methodref          #616.#618    // ext/mods/commons/pool/CoroutinePool$executeParallel$1."<init>":(Ljava/lang/Runnable;Lkotlin/coroutines/Continuation;)V
   #620 = Utf8               kotlin/jvm/functions/Function2
   #621 = Class              #620         // kotlin/jvm/functions/Function2
   #622 = Utf8               kotlinx/coroutines/BuildersKt
   #623 = Class              #622         // kotlinx/coroutines/BuildersKt
   #624 = Utf8               launch$default
   #625 = Utf8               (Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;
   #626 = NameAndType        #624:#625    // launch$default:(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;
   #627 = Methodref          #623.#626    // kotlinx/coroutines/BuildersKt.launch$default:(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;
   #628 = Utf8               executeParallelBlocking
   #629 = Utf8               submit
   #630 = Utf8               (Ljava/lang/Runnable;)Ljava/util/concurrent/ForkJoinTask;
   #631 = NameAndType        #629:#630    // submit:(Ljava/lang/Runnable;)Ljava/util/concurrent/ForkJoinTask;
   #632 = Methodref          #233.#631    // java/util/concurrent/ForkJoinPool.submit:(Ljava/lang/Runnable;)Ljava/util/concurrent/ForkJoinTask;
   #633 = Utf8               java/util/concurrent/ForkJoinTask
   #634 = Class              #633         // java/util/concurrent/ForkJoinTask
   #635 = Utf8               join
   #636 = NameAndType        #635:#581    // join:()Ljava/lang/Object;
   #637 = Methodref          #634.#636    // java/util/concurrent/ForkJoinTask.join:()Ljava/lang/Object;
   #638 = Utf8               Erro executeParallelBlocking: \u0001
   #639 = String             #638         // Erro executeParallelBlocking: \u0001
   #640 = InvokeDynamic      #18:#270     // #18:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #641 = Utf8               pool
   #642 = Utf8               getPathfindingQueueSize
   #643 = Utf8               getQueue
   #644 = Utf8               ()Ljava/util/concurrent/BlockingQueue;
   #645 = NameAndType        #643:#644    // getQueue:()Ljava/util/concurrent/BlockingQueue;
   #646 = Methodref          #171.#645    // java/util/concurrent/ThreadPoolExecutor.getQueue:()Ljava/util/concurrent/BlockingQueue;
   #647 = Utf8               size
   #648 = NameAndType        #647:#105    // size:()I
   #649 = InterfaceMethodref #189.#648    // java/util/concurrent/BlockingQueue.size:()I
   #650 = Utf8               getPathfindingActiveCount
   #651 = Utf8               getActiveCount
   #652 = NameAndType        #651:#105    // getActiveCount:()I
   #653 = Methodref          #171.#652    // java/util/concurrent/ThreadPoolExecutor.getActiveCount:()I
   #654 = Utf8               getTotalTasksSubmitted
   #655 = Utf8               sum
   #656 = NameAndType        #655:#43     // sum:()J
   #657 = Methodref          #461.#656    // java/util/concurrent/atomic/LongAdder.sum:()J
   #658 = Utf8               getTotalTasksCompleted
   #659 = Utf8               totalTasksCompleted
   #660 = NameAndType        #659:#457    // totalTasksCompleted:Ljava/util/concurrent/atomic/LongAdder;
   #661 = Fieldref           #2.#660      // ext/mods/commons/pool/CoroutinePool.totalTasksCompleted:Ljava/util/concurrent/atomic/LongAdder;
   #662 = Utf8               getTotalTasksRejected
   #663 = Utf8               getAverageExecutionTimeMs
   #664 = Utf8               ()D
   #665 = Utf8               totalExecutionTimeMs
   #666 = NameAndType        #665:#457    // totalExecutionTimeMs:Ljava/util/concurrent/atomic/LongAdder;
   #667 = Fieldref           #2.#666      // ext/mods/commons/pool/CoroutinePool.totalExecutionTimeMs:Ljava/util/concurrent/atomic/LongAdder;
   #668 = Utf8               completed
   #669 = Utf8               getMetrics
   #670 = Utf8               ()Ljava/util/Map;
   #671 = Utf8               ()Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;
   #672 = Utf8               getMaximumPoolSize
   #673 = NameAndType        #672:#105    // getMaximumPoolSize:()I
   #674 = Methodref          #171.#673    // java/util/concurrent/ThreadPoolExecutor.getMaximumPoolSize:()I
   #675 = Utf8               kotlin/Pair
   #676 = Class              #675         // kotlin/Pair
   #677 = Utf8               tasksSubmitted
   #678 = String             #677         // tasksSubmitted
   #679 = Utf8               java/lang/Long
   #680 = Class              #679         // java/lang/Long
   #681 = Utf8               valueOf
   #682 = Utf8               (J)Ljava/lang/Long;
   #683 = NameAndType        #681:#682    // valueOf:(J)Ljava/lang/Long;
   #684 = Methodref          #680.#683    // java/lang/Long.valueOf:(J)Ljava/lang/Long;
   #685 = Utf8               kotlin/TuplesKt
   #686 = Class              #685         // kotlin/TuplesKt
   #687 = Utf8               to
   #688 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
   #689 = NameAndType        #687:#688    // to:(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
   #690 = Methodref          #686.#689    // kotlin/TuplesKt.to:(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
   #691 = Utf8               tasksCompleted
   #692 = String             #691         // tasksCompleted
   #693 = Utf8               tasksRejected
   #694 = String             #693         // tasksRejected
   #695 = Utf8               averageLatency
   #696 = String             #695         // averageLatency
   #697 = NameAndType        #663:#664    // getAverageExecutionTimeMs:()D
   #698 = Methodref          #2.#697      // ext/mods/commons/pool/CoroutinePool.getAverageExecutionTimeMs:()D
   #699 = Utf8               java/lang/Double
   #700 = Class              #699         // java/lang/Double
   #701 = Utf8               (D)Ljava/lang/Double;
   #702 = NameAndType        #681:#701    // valueOf:(D)Ljava/lang/Double;
   #703 = Methodref          #700.#702    // java/lang/Double.valueOf:(D)Ljava/lang/Double;
   #704 = Utf8               scheduledPools
   #705 = String             #704         // scheduledPools
   #706 = Utf8               java/lang/Integer
   #707 = Class              #706         // java/lang/Integer
   #708 = Utf8               (I)Ljava/lang/Integer;
   #709 = NameAndType        #681:#708    // valueOf:(I)Ljava/lang/Integer;
   #710 = Methodref          #707.#709    // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
   #711 = Utf8               scheduledQueueSize
   #712 = String             #711         // scheduledQueueSize
   #713 = Methodref          #130.#645    // java/util/concurrent/ScheduledThreadPoolExecutor.getQueue:()Ljava/util/concurrent/BlockingQueue;
   #714 = Utf8               instantPools
   #715 = String             #714         // instantPools
   #716 = Utf8               instantPoolsSize
   #717 = String             #716         // instantPoolsSize
   #718 = Utf8               instantPoolsActive
   #719 = String             #718         // instantPoolsActive
   #720 = Utf8               instantPoolsQueueSize
   #721 = String             #720         // instantPoolsQueueSize
   #722 = Utf8               pathfindingSize
   #723 = String             #722         // pathfindingSize
   #724 = Utf8               pathfindingActive
   #725 = String             #724         // pathfindingActive
   #726 = NameAndType        #650:#105    // getPathfindingActiveCount:()I
   #727 = Methodref          #2.#726      // ext/mods/commons/pool/CoroutinePool.getPathfindingActiveCount:()I
   #728 = Utf8               pathfindingQueueSize
   #729 = String             #728         // pathfindingQueueSize
   #730 = NameAndType        #642:#105    // getPathfindingQueueSize:()I
   #731 = Methodref          #2.#730      // ext/mods/commons/pool/CoroutinePool.getPathfindingQueueSize:()I
   #732 = String             #562         // pathfindingTasksSubmitted
   #733 = Utf8               pathfindingTasksCompleted
   #734 = String             #733         // pathfindingTasksCompleted
   #735 = NameAndType        #733:#457    // pathfindingTasksCompleted:Ljava/util/concurrent/atomic/LongAdder;
   #736 = Fieldref           #2.#735      // ext/mods/commons/pool/CoroutinePool.pathfindingTasksCompleted:Ljava/util/concurrent/atomic/LongAdder;
   #737 = Utf8               smartRoutesTracked
   #738 = String             #737         // smartRoutesTracked
   #739 = Methodref          #410.#648    // java/util/concurrent/ConcurrentHashMap.size:()I
   #740 = Utf8               tasksInVirtualRoute
   #741 = String             #740         // tasksInVirtualRoute
   #742 = Utf8               values
   #743 = Utf8               ()Ljava/util/Collection;
   #744 = NameAndType        #742:#743    // values:()Ljava/util/Collection;
   #745 = Methodref          #410.#744    // java/util/concurrent/ConcurrentHashMap.values:()Ljava/util/Collection;
   #746 = Utf8               java/lang/Iterable
   #747 = Class              #746         // java/lang/Iterable
   #748 = Utf8               java/util/Collection
   #749 = Class              #748         // java/util/Collection
   #750 = Utf8               isEmpty
   #751 = NameAndType        #750:#34     // isEmpty:()Z
   #752 = InterfaceMethodref #749.#751    // java/util/Collection.isEmpty:()Z
   #753 = Utf8               iterator
   #754 = Utf8               ()Ljava/util/Iterator;
   #755 = NameAndType        #753:#754    // iterator:()Ljava/util/Iterator;
   #756 = InterfaceMethodref #747.#755    // java/lang/Iterable.iterator:()Ljava/util/Iterator;
   #757 = Utf8               java/util/Iterator
   #758 = Class              #757         // java/util/Iterator
   #759 = Utf8               hasNext
   #760 = NameAndType        #759:#34     // hasNext:()Z
   #761 = InterfaceMethodref #758.#760    // java/util/Iterator.hasNext:()Z
   #762 = Utf8               next
   #763 = NameAndType        #762:#581    // next:()Ljava/lang/Object;
   #764 = InterfaceMethodref #758.#763    // java/util/Iterator.next:()Ljava/lang/Object;
   #765 = Utf8               VIRTUAL
   #766 = NameAndType        #765:#406    // VIRTUAL:Lext/mods/commons/pool/CoroutinePool$ExecutionRoute;
   #767 = Fieldref           #404.#766    // ext/mods/commons/pool/CoroutinePool$ExecutionRoute.VIRTUAL:Lext/mods/commons/pool/CoroutinePool$ExecutionRoute;
   #768 = Utf8               kotlin/collections/CollectionsKt
   #769 = Class              #768         // kotlin/collections/CollectionsKt
   #770 = Utf8               throwCountOverflow
   #771 = NameAndType        #770:#6      // throwCountOverflow:()V
   #772 = Methodref          #769.#771    // kotlin/collections/CollectionsKt.throwCountOverflow:()V
   #773 = Utf8               kotlin/collections/MapsKt
   #774 = Class              #773         // kotlin/collections/MapsKt
   #775 = Utf8               mapOf
   #776 = Utf8               ([Lkotlin/Pair;)Ljava/util/Map;
   #777 = NameAndType        #775:#776    // mapOf:([Lkotlin/Pair;)Ljava/util/Map;
   #778 = Methodref          #774.#777    // kotlin/collections/MapsKt.mapOf:([Lkotlin/Pair;)Ljava/util/Map;
   #779 = Utf8               $i$a$-sumOfInt-CoroutinePool$getMetrics$totalInstantCapacity$1
   #780 = Utf8               $i$a$-sumOfInt-CoroutinePool$getMetrics$1
   #781 = Utf8               $i$a$-sumOfInt-CoroutinePool$getMetrics$2
   #782 = Utf8               $i$a$-sumOfInt-CoroutinePool$getMetrics$3
   #783 = Utf8               $i$a$-count-CoroutinePool$getMetrics$4
   #784 = Utf8               $i$f$count
   #785 = Utf8               count$iv
   #786 = Utf8               $this$count$iv
   #787 = Utf8               Ljava/lang/Iterable;
   #788 = Utf8               pfExecutor
   #789 = Utf8               totalInstantCapacity
   #790 = Utf8               [Lkotlin/Pair;
   #791 = Class              #790         // "[Lkotlin/Pair;"
   #792 = Utf8               printMetrics
   #793 = NameAndType        #669:#670    // getMetrics:()Ljava/util/Map;
   #794 = Methodref          #2.#793      // ext/mods/commons/pool/CoroutinePool.getMetrics:()Ljava/util/Map;
   #795 = Utf8               === CoroutinePool Metrics ===
   #796 = String             #795         // === CoroutinePool Metrics ===
   #797 = Utf8               java/util/Map
   #798 = Class              #797         // java/util/Map
   #799 = Utf8               entrySet
   #800 = Utf8               ()Ljava/util/Set;
   #801 = NameAndType        #799:#800    // entrySet:()Ljava/util/Set;
   #802 = InterfaceMethodref #798.#801    // java/util/Map.entrySet:()Ljava/util/Set;
   #803 = Utf8               java/util/Set
   #804 = Class              #803         // java/util/Set
   #805 = InterfaceMethodref #804.#755    // java/util/Set.iterator:()Ljava/util/Iterator;
   #806 = Utf8               java/util/Map$Entry
   #807 = Class              #806         // java/util/Map$Entry
   #808 = Utf8               getKey
   #809 = NameAndType        #808:#581    // getKey:()Ljava/lang/Object;
   #810 = InterfaceMethodref #807.#809    // java/util/Map$Entry.getKey:()Ljava/lang/Object;
   #811 = Utf8               getValue
   #812 = NameAndType        #811:#581    // getValue:()Ljava/lang/Object;
   #813 = InterfaceMethodref #807.#812    // java/util/Map$Entry.getValue:()Ljava/lang/Object;
   #814 = Utf8                 \u0001: \u0001
   #815 = String             #814         //   \u0001: \u0001
   #816 = Utf8               (Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
   #817 = NameAndType        #137:#816    // makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
   #818 = InvokeDynamic      #19:#817     // #19:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
   #819 = Utf8               $i$a$-forEach-CoroutinePool$printMetrics$1
   #820 = Utf8               key
   #821 = Utf8               value
   #822 = Utf8               Ljava/util/Map$Entry;
   #823 = Utf8               $i$f$forEach
   #824 = Utf8               $this$forEach$iv
   #825 = Utf8               Ljava/util/Map;
   #826 = Utf8               metrics
   #827 = Long               2000000000l
   #829 = Utf8               (JJ)J
   #830 = NameAndType        #122:#829    // min:(JJ)J
   #831 = Methodref          #121.#830    // java/lang/Math.min:(JJ)J
   #832 = Utf8               max
   #833 = NameAndType        #832:#829    // max:(JJ)J
   #834 = Methodref          #121.#833    // java/lang/Math.max:(JJ)J
   #835 = Utf8               shutdown
   #836 = Utf8               Desligando CoroutinePool...
   #837 = String             #836         // Desligando CoroutinePool...
   #838 = Utf8               kotlinx/coroutines/CoroutineScopeKt
   #839 = Class              #838         // kotlinx/coroutines/CoroutineScopeKt
   #840 = Utf8               cancel$default
   #841 = Utf8               (Lkotlinx/coroutines/CoroutineScope;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V
   #842 = NameAndType        #840:#841    // cancel$default:(Lkotlinx/coroutines/CoroutineScope;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V
   #843 = Methodref          #839.#842    // kotlinx/coroutines/CoroutineScopeKt.cancel$default:(Lkotlinx/coroutines/CoroutineScope;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V
   #844 = NameAndType        #835:#6      // shutdown:()V
   #845 = Methodref          #130.#844    // java/util/concurrent/ScheduledThreadPoolExecutor.shutdown:()V
   #846 = Methodref          #171.#844    // java/util/concurrent/ThreadPoolExecutor.shutdown:()V
   #847 = InterfaceMethodref #19.#844     // java/util/concurrent/ExecutorService.shutdown:()V
   #848 = Methodref          #233.#844    // java/util/concurrent/ForkJoinPool.shutdown:()V
   #849 = Utf8               clear
   #850 = NameAndType        #849:#6      // clear:()V
   #851 = Methodref          #410.#850    // java/util/concurrent/ConcurrentHashMap.clear:()V
   #852 = Utf8               CoroutinePool desligado.
   #853 = String             #852         // CoroutinePool desligado.
   #854 = Utf8               Erro ao desligar: \u0001
   #855 = String             #854         // Erro ao desligar: \u0001
   #856 = InvokeDynamic      #20:#270     // #20:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #857 = Utf8               $i$a$-forEach-CoroutinePool$shutdown$1
   #858 = Utf8               $i$a$-forEach-CoroutinePool$shutdown$2
   #859 = Utf8               fileWriteLock
   #860 = NameAndType        #859:#385    // fileWriteLock:Ljava/lang/Object;
   #861 = Fieldref           #2.#860      // ext/mods/commons/pool/CoroutinePool.fileWriteLock:Ljava/lang/Object;
   #862 = Utf8               java/time/LocalDateTime
   #863 = Class              #862         // java/time/LocalDateTime
   #864 = Utf8               now
   #865 = Utf8               ()Ljava/time/LocalDateTime;
   #866 = NameAndType        #864:#865    // now:()Ljava/time/LocalDateTime;
   #867 = Methodref          #863.#866    // java/time/LocalDateTime.now:()Ljava/time/LocalDateTime;
   #868 = Utf8               dateFormatter
   #869 = Utf8               Ljava/time/format/DateTimeFormatter;
   #870 = NameAndType        #868:#869    // dateFormatter:Ljava/time/format/DateTimeFormatter;
   #871 = Fieldref           #2.#870      // ext/mods/commons/pool/CoroutinePool.dateFormatter:Ljava/time/format/DateTimeFormatter;
   #872 = Utf8               format
   #873 = Utf8               (Ljava/time/format/DateTimeFormatter;)Ljava/lang/String;
   #874 = NameAndType        #872:#873    // format:(Ljava/time/format/DateTimeFormatter;)Ljava/lang/String;
   #875 = Methodref          #863.#874    // java/time/LocalDateTime.format:(Ljava/time/format/DateTimeFormatter;)Ljava/lang/String;
   #876 = Utf8               [\u0001] \u0001\n
   #877 = String             #876         // [\u0001] \u0001\n
   #878 = Utf8               (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #879 = NameAndType        #137:#878    // makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #880 = InvokeDynamic      #21:#879     // #21:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #881 = Utf8               log/coroutine_bottlenecks.log
   #882 = String             #881         // log/coroutine_bottlenecks.log
   #883 = Utf8               java/nio/file/Paths
   #884 = Class              #883         // java/nio/file/Paths
   #885 = Utf8               (Ljava/lang/String;[Ljava/lang/String;)Ljava/nio/file/Path;
   #886 = NameAndType        #589:#885    // get:(Ljava/lang/String;[Ljava/lang/String;)Ljava/nio/file/Path;
   #887 = Methodref          #884.#886    // java/nio/file/Paths.get:(Ljava/lang/String;[Ljava/lang/String;)Ljava/nio/file/Path;
   #888 = Utf8               kotlin/text/Charsets
   #889 = Class              #888         // kotlin/text/Charsets
   #890 = Utf8               UTF_8
   #891 = Utf8               Ljava/nio/charset/Charset;
   #892 = NameAndType        #890:#891    // UTF_8:Ljava/nio/charset/Charset;
   #893 = Fieldref           #889.#892    // kotlin/text/Charsets.UTF_8:Ljava/nio/charset/Charset;
   #894 = Utf8               getBytes
   #895 = Utf8               (Ljava/nio/charset/Charset;)[B
   #896 = NameAndType        #894:#895    // getBytes:(Ljava/nio/charset/Charset;)[B
   #897 = Methodref          #319.#896    // java/lang/String.getBytes:(Ljava/nio/charset/Charset;)[B
   #898 = Utf8               getBytes(...)
   #899 = String             #898         // getBytes(...)
   #900 = Utf8               kotlin/jvm/internal/Intrinsics
   #901 = Class              #900         // kotlin/jvm/internal/Intrinsics
   #902 = Utf8               checkNotNullExpressionValue
   #903 = Utf8               (Ljava/lang/Object;Ljava/lang/String;)V
   #904 = NameAndType        #902:#903    // checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
   #905 = Methodref          #901.#904    // kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
   #906 = Utf8               java/nio/file/OpenOption
   #907 = Class              #906         // java/nio/file/OpenOption
   #908 = Utf8               java/nio/file/StandardOpenOption
   #909 = Class              #908         // java/nio/file/StandardOpenOption
   #910 = Utf8               CREATE
   #911 = Utf8               Ljava/nio/file/StandardOpenOption;
   #912 = NameAndType        #910:#911    // CREATE:Ljava/nio/file/StandardOpenOption;
   #913 = Fieldref           #909.#912    // java/nio/file/StandardOpenOption.CREATE:Ljava/nio/file/StandardOpenOption;
   #914 = Utf8               APPEND
   #915 = NameAndType        #914:#911    // APPEND:Ljava/nio/file/StandardOpenOption;
   #916 = Fieldref           #909.#915    // java/nio/file/StandardOpenOption.APPEND:Ljava/nio/file/StandardOpenOption;
   #917 = Utf8               java/nio/file/Files
   #918 = Class              #917         // java/nio/file/Files
   #919 = Utf8               write
   #920 = Utf8               (Ljava/nio/file/Path;[B[Ljava/nio/file/OpenOption;)Ljava/nio/file/Path;
   #921 = NameAndType        #919:#920    // write:(Ljava/nio/file/Path;[B[Ljava/nio/file/OpenOption;)Ljava/nio/file/Path;
   #922 = Methodref          #918.#921    // java/nio/file/Files.write:(Ljava/nio/file/Path;[B[Ljava/nio/file/OpenOption;)Ljava/nio/file/Path;
   #923 = Utf8               Falha ao gravar no log de gargalos: \u0001
   #924 = String             #923         // Falha ao gravar no log de gargalos: \u0001
   #925 = InvokeDynamic      #22:#270     // #22:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #926 = Utf8               timestamp
   #927 = Utf8               logLine
   #928 = Utf8               $i$a$-synchronized-CoroutinePool$writeBottleneckToFile$1$1
   #929 = Utf8               $message
   #930 = Utf8               java/lang/Throwable
   #931 = Class              #930         // java/lang/Throwable
   #932 = Utf8               nanoTime
   #933 = NameAndType        #932:#43     // nanoTime:()J
   #934 = Methodref          #59.#933     // java/lang/System.nanoTime:()J
   #935 = Integer            1000000
   #936 = Utf8               add
   #937 = NameAndType        #936:#49     // add:(J)V
   #938 = Methodref          #461.#937    // java/util/concurrent/atomic/LongAdder.add:(J)V
   #939 = Utf8               start
   #940 = Utf8               $task
   #941 = Utf8               getMethodName
   #942 = NameAndType        #941:#278    // getMethodName:()Ljava/lang/String;
   #943 = Methodref          #358.#942    // java/lang/StackTraceElement.getMethodName:()Ljava/lang/String;
   #944 = Utf8               getFileName
   #945 = NameAndType        #944:#278    // getFileName:()Ljava/lang/String;
   #946 = Methodref          #358.#945    // java/lang/StackTraceElement.getFileName:()Ljava/lang/String;
   #947 = Utf8               getLineNumber
   #948 = NameAndType        #947:#105    // getLineNumber:()I
   #949 = Methodref          #358.#948    // java/lang/StackTraceElement.getLineNumber:()I
   #950 = Utf8               \u0001.\u0001(\u0001:\u0001)
   #951 = String             #950         // \u0001.\u0001(\u0001:\u0001)
   #952 = Utf8               (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;
   #953 = NameAndType        #137:#952    // makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;
   #954 = InvokeDynamic      #23:#953     // #23:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;
   #955 = Utf8               Desconhecido
   #956 = String             #955         // Desconhecido
   #957 = Utf8               [GARGALO - \u0001] Tarefa originada em [\u0001] levou \u0001ms
   #958 = String             #957         // [GARGALO - \u0001] Tarefa originada em [\u0001] levou \u0001ms
   #959 = Utf8               (Ljava/lang/String;Ljava/lang/String;J)Ljava/lang/String;
   #960 = NameAndType        #137:#959    // makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;J)Ljava/lang/String;
   #961 = InvokeDynamic      #24:#960     // #24:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;J)Ljava/lang/String;
   #962 = NameAndType        #320:#83     // writeBottleneckToFile:(Ljava/lang/String;)V
   #963 = Methodref          #2.#962      // ext/mods/commons/pool/CoroutinePool.writeBottleneckToFile:(Ljava/lang/String;)V
   #964 = Utf8               $i$a$-let-CoroutinePool$wrapProfiler$2$callerInfo$1
   #965 = Utf8               callerInfo
   #966 = Utf8               alertMessage
   #967 = Utf8               elapsedMs
   #968 = Utf8               $callerTrace
   #969 = Utf8               $executorName
   #970 = Long               15l
   #972 = Utf8               put
   #973 = NameAndType        #972:#412    // put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #974 = InterfaceMethodref #798.#973    // java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #975 = Long               2l
   #977 = Utf8               [GARGALO - SmartPool] A tarefa nomeada \'\u0001\' levou \u0001ms
   #978 = String             #977         // [GARGALO - SmartPool] A tarefa nomeada \'\u0001\' levou \u0001ms
   #979 = Utf8               (Ljava/lang/String;J)Ljava/lang/String;
   #980 = NameAndType        #137:#979    // makeConcatWithConstants:(Ljava/lang/String;J)Ljava/lang/String;
   #981 = InvokeDynamic      #25:#980     // #25:makeConcatWithConstants:(Ljava/lang/String;J)Ljava/lang/String;
   #982 = Utf8               startTime
   #983 = Utf8               $currentRoute
   #984 = Utf8               $taskId
   #985 = Utf8               result
   #986 = Utf8               $block
   #987 = Utf8               access$getLOGGER$p
   #988 = Utf8               ()Ljava/util/logging/Logger;
   #989 = Utf8               <clinit>
   #990 = Methodref          #2.#7        // ext/mods/commons/pool/CoroutinePool."<init>":()V
   #991 = Utf8               getName
   #992 = NameAndType        #991:#278    // getName:()Ljava/lang/String;
   #993 = Methodref          #444.#992    // java/lang/Class.getName:()Ljava/lang/String;
   #994 = Utf8               getLogger
   #995 = Utf8               (Ljava/lang/String;)Ljava/util/logging/Logger;
   #996 = NameAndType        #994:#995    // getLogger:(Ljava/lang/String;)Ljava/util/logging/Logger;
   #997 = Methodref          #81.#996     // java/util/logging/Logger.getLogger:(Ljava/lang/String;)Ljava/util/logging/Logger;
   #998 = Utf8               kotlinx/coroutines/SupervisorKt
   #999 = Class              #998         // kotlinx/coroutines/SupervisorKt
  #1000 = Utf8               SupervisorJob$default
  #1001 = Utf8               (Lkotlinx/coroutines/Job;ILjava/lang/Object;)Lkotlinx/coroutines/CompletableJob;
  #1002 = NameAndType        #1000:#1001  // SupervisorJob$default:(Lkotlinx/coroutines/Job;ILjava/lang/Object;)Lkotlinx/coroutines/CompletableJob;
  #1003 = Methodref          #999.#1002   // kotlinx/coroutines/SupervisorKt.SupervisorJob$default:(Lkotlinx/coroutines/Job;ILjava/lang/Object;)Lkotlinx/coroutines/CompletableJob;
  #1004 = Utf8               plus
  #1005 = Utf8               (Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;
  #1006 = NameAndType        #1004:#1005  // plus:(Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;
  #1007 = Methodref          #27.#1006    // kotlinx/coroutines/CoroutineDispatcher.plus:(Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;
  #1008 = Utf8               CoroutineScope
  #1009 = Utf8               (Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/CoroutineScope;
  #1010 = NameAndType        #1008:#1009  // CoroutineScope:(Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/CoroutineScope;
  #1011 = Methodref          #839.#1010   // kotlinx/coroutines/CoroutineScopeKt.CoroutineScope:(Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/CoroutineScope;
  #1012 = Methodref          #495.#7      // ext/mods/commons/pool/RejectedExecutionHandlerOptimized."<init>":()V
  #1013 = Methodref          #461.#7      // java/util/concurrent/atomic/LongAdder."<init>":()V
  #1014 = Methodref          #410.#7      // java/util/concurrent/ConcurrentHashMap."<init>":()V
  #1015 = Long               50l
  #1017 = Utf8               yyyy-MM-dd HH:mm:ss.SSS
  #1018 = String             #1017        // yyyy-MM-dd HH:mm:ss.SSS
  #1019 = Utf8               java/time/format/DateTimeFormatter
  #1020 = Class              #1019        // java/time/format/DateTimeFormatter
  #1021 = Utf8               ofPattern
  #1022 = Utf8               (Ljava/lang/String;)Ljava/time/format/DateTimeFormatter;
  #1023 = NameAndType        #1021:#1022  // ofPattern:(Ljava/lang/String;)Ljava/time/format/DateTimeFormatter;
  #1024 = Methodref          #1020.#1023  // java/time/format/DateTimeFormatter.ofPattern:(Ljava/lang/String;)Ljava/time/format/DateTimeFormatter;
  #1025 = Utf8               Lorg/jetbrains/annotations/Nullable;
  #1026 = Utf8               MAX_DELAY_MS
  #1027 = Utf8               Ljava/util/concurrent/ConcurrentHashMap<Ljava/lang/String;Lext/mods/commons/pool/CoroutinePool$ExecutionRoute;>;
  #1028 = Utf8               SMART_SLOW_THRESHOLD_MS
  #1029 = Utf8               SMART_FAST_THRESHOLD_MS
  #1030 = Utf8               DEBUG_FILE_NAME
  #1031 = Utf8               Lkotlin/Metadata;
  #1032 = Utf8               mv
  #1033 = Integer            2
  #1034 = Integer            3
  #1035 = Integer            0
  #1036 = Utf8               k
  #1037 = Integer            1
  #1038 = Utf8               xi
  #1039 = Integer            48
  #1040 = Utf8               d1
  #1041 = Utf8               \u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010$\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u00109\u001a\u00020:H\u0007J\u0010\u0010;\u001a\u00020:2\u0006\u0010<\u001a\u00020%H\u0002J \u0010=\u001a\u00060>j\u0002`?2\n\u0010@\u001a\u00060>j\u0002`?2\u0006\u0010A\u001a\u00020%H\u0002J\u001c\u0010B\u001a\u00020:2\u0006\u0010C\u001a\u00020%2\n\u0010@\u001a\u00060>j\u0002`?H\u0007J\u0014\u0010B\u001a\u00020:2\n\u0010@\u001a\u00060>j\u0002`?H\u0007J\u0014\u0010D\u001a\u00020:2\n\u0010E\u001a\u00060>j\u0002`?H\u0007J\u0014\u0010F\u001a\u00020:2\n\u0010@\u001a\u00060>j\u0002`?H\u0007J \u0010G\u001a\u0006\u0012\u0002\b\u00030H2\n\u0010E\u001a\u00060>j\u0002`?2\u0006\u0010I\u001a\u00020\"H\u0007J(\u0010J\u001a\u0006\u0012\u0002\b\u00030H2\n\u0010E\u001a\u00060>j\u0002`?2\u0006\u0010I\u001a\u00020\"2\u0006\u0010K\u001a\u00020\"H\u0007J\u0014\u0010L\u001a\u00020:2\n\u0010@\u001a\u00060>j\u0002`?H\u0007J!\u0010M\u001a\u0002HN\"\u0004\b\u0000\u0010N2\f\u0010O\u001a\b\u0012\u0004\u0012\u0002HN0PH\u0007¢\u0006\u0002\u0010QJ\u0014\u0010R\u001a\u00020S2\n\u0010@\u001a\u00060>j\u0002`?H\u0007J\u0014\u0010T\u001a\u00020:2\n\u0010@\u001a\u00060>j\u0002`?H\u0007J\b\u0010U\u001a\u00020VH\u0007J\b\u0010W\u001a\u00020VH\u0007J\b\u0010X\u001a\u00020\"H\u0007J\b\u0010Y\u001a\u00020\"H\u0007J\b\u0010Z\u001a\u00020\"H\u0007J\b\u0010[\u001a\u00020\\H\u0007J\u0014\u0010]\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00010^H\u0007J\b\u0010_\u001a\u00020:H\u0007J\u0010\u0010`\u001a\u00020\"2\u0006\u0010I\u001a\u00020\"H\u0002J\b\u0010a\u001a\u00020:H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\tR\u0018\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\fR\u0010\u0010\r\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0014\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u0082T¢\u0006\u0002\n\u0000R\u001a\u0010#\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&0$X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\'\u001a\u00020\"X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\"X\u0082T¢\u0006\u0002\n\u0000R\u001a\u0010)\u001a\u00020*X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001a\u0010/\u001a\u00020\"X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u000e\u00104\u001a\u00020%X\u0082T¢\u0006\u0002\n\u0000R\u000e\u00105\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u00106\u001a\n 8*\u0004\u0018\u00010707X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006c
  #1042 = Utf8               d2
  #1043 = Utf8
  #1044 = Utf8               PathfindingDispatcher
  #1045 = Utf8               Lkotlinx/coroutines/CoroutineDispatcher;
  #1046 = Utf8               kotlin.jvm.PlatformType
  #1047 = Utf8               Lkotlinx/coroutines/Runnable;
  #1048 = Utf8               Ljava/util/concurrent/ScheduledFuture;
  #1049 = Utf8               T
  #1050 = Utf8               Lkotlin/Function0;
  #1051 = Utf8               Lkotlinx/coroutines/Job;
  #1052 = Utf8               ExecutionRoute
  #1053 = Utf8               Brproject
  #1054 = Utf8               WhenMappings
  #1055 = Utf8               java/lang/Thread$UncaughtExceptionHandler
  #1056 = Class              #1055        // java/lang/Thread$UncaughtExceptionHandler
  #1057 = Utf8               java/lang/Thread
  #1058 = Class              #1057        // java/lang/Thread
  #1059 = Utf8               UncaughtExceptionHandler
  #1060 = Utf8               java/util/concurrent/ForkJoinPool$ForkJoinWorkerThreadFactory
  #1061 = Class              #1060        // java/util/concurrent/ForkJoinPool$ForkJoinWorkerThreadFactory
  #1062 = Utf8               ForkJoinWorkerThreadFactory
  #1063 = Utf8               CallerRunsPolicy
  #1064 = Utf8               Entry
  #1065 = Utf8               CoroutinePool.kt
  #1066 = Utf8               Lkotlin/jvm/internal/SourceDebugExtension;
  #1067 = Utf8               SMAP\nCoroutinePool.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutinePool.kt\next/mods/commons/pool/CoroutinePool\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,436:1\n1401#2,2:437\n14060#2,2:446\n14060#2,2:448\n1#3:439\n1834#4,4:440\n221#5,2:444\n*S KotlinDebug\n*F\n+ 1 CoroutinePool.kt\next/mods/commons/pool/CoroutinePool\n*L\n195#1:437,2\n419#1:446,2\n420#1:448,2\n400#1:440,4\n408#1:444,2\n*E\n
  #1068 = Utf8               RuntimeInvisibleAnnotations
  #1069 = Utf8               ConstantValue
  #1070 = Utf8               Signature
  #1071 = Utf8               Code
  #1072 = Utf8               LineNumberTable
  #1073 = Utf8               LocalVariableTable
  #1074 = Utf8               StackMapTable
  #1075 = Utf8               RuntimeVisibleAnnotations
  #1076 = Utf8               RuntimeInvisibleParameterAnnotations
  #1077 = Utf8               InnerClasses
  #1078 = Utf8               SourceFile
  #1079 = Utf8               SourceDebugExtension
  #1080 = Utf8               BootstrapMethods
{
  public static final ext.mods.commons.pool.CoroutinePool INSTANCE;
    descriptor: Lext/mods/commons/pool/CoroutinePool;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    RuntimeInvisibleAnnotations:
      0: #13()
        org.jetbrains.annotations.NotNull

  public final kotlinx.coroutines.CoroutineDispatcher getPathfindingDispatcher();
    descriptor: ()Lkotlinx/coroutines/CoroutineDispatcher;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: getstatic     #17                 // Field pathfindingExecutor:Ljava/util/concurrent/ThreadPoolExecutor;
         3: dup
         4: ifnull        23
         7: checkcast     #19                 // class java/util/concurrent/ExecutorService
        10: invokestatic  #25                 // Method kotlinx/coroutines/ExecutorsKt.from:(Ljava/util/concurrent/ExecutorService;)Lkotlinx/coroutines/ExecutorCoroutineDispatcher;
        13: dup
        14: ifnull        23
        17: checkcast     #27                 // class kotlinx/coroutines/CoroutineDispatcher
        20: goto          27
        23: pop
        24: invokestatic  #32                 // Method kotlinx/coroutines/Dispatchers.getDefault:()Lkotlinx/coroutines/CoroutineDispatcher;
        27: areturn
      StackMapTable: number_of_entries = 2
        frame_type = 87 /* same_locals_1_stack_item */
          stack = [ class java/lang/Object ]
        frame_type = 67 /* same_locals_1_stack_item */
          stack = [ class kotlinx/coroutines/CoroutineDispatcher ]
      LineNumberTable:
        line 46: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      28     0  this   Lext/mods/commons/pool/CoroutinePool;
    RuntimeInvisibleAnnotations:
      0: #13()
        org.jetbrains.annotations.NotNull

  public final boolean getENABLE_PROFILER();
    descriptor: ()Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #38                 // Field ENABLE_PROFILER:Z
         3: ireturn
      LineNumberTable:
        line 62: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/commons/pool/CoroutinePool;

  public final void setENABLE_PROFILER(boolean);
    descriptor: (Z)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=2, args_size=2
         0: iload_1
         1: putstatic     #38                 // Field ENABLE_PROFILER:Z
         4: return
      LineNumberTable:
        line 62: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/commons/pool/CoroutinePool;
            0       5     1 <set-?>   Z

  public final long getBOTTLENECK_THRESHOLD_MS();
    descriptor: ()J
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: getstatic     #47                 // Field BOTTLENECK_THRESHOLD_MS:J
         3: lreturn
      LineNumberTable:
        line 63: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/commons/pool/CoroutinePool;

  public final void setBOTTLENECK_THRESHOLD_MS(long);
    descriptor: (J)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=3, args_size=2
         0: lload_1
         1: putstatic     #47                 // Field BOTTLENECK_THRESHOLD_MS:J
         4: return
      LineNumberTable:
        line 63: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/commons/pool/CoroutinePool;
            0       5     1 <set-?>   J

  public static final void init();
    descriptor: ()V
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    Code:
      stack=12, locals=18, args_size=0
         0: ldc           #55                 // String launcher
         2: ldc           #57                 // String brproject.role
         4: invokestatic  #63                 // Method java/lang/System.getProperty:(Ljava/lang/String;)Ljava/lang/String;
         7: iconst_1
         8: invokestatic  #69                 // Method kotlin/text/StringsKt.equals:(Ljava/lang/String;Ljava/lang/String;Z)Z
        11: ifeq          15
        14: return
        15: nop
        16: getstatic     #73                 // Field scheduledExecutors:[Ljava/util/concurrent/ScheduledThreadPoolExecutor;
        19: ifnull        31
        22: getstatic     #77                 // Field LOGGER:Ljava/util/logging/Logger;
        25: ldc           #79                 // String CoroutinePool já foi inicializado. Ignorando nova inicialização.
        27: invokevirtual #85                 // Method java/util/logging/Logger.warning:(Ljava/lang/String;)V
        30: return
        31: getstatic     #88                 // Field INSTANCE:Lext/mods/commons/pool/CoroutinePool;
        34: pop
        35: getstatic     #38                 // Field ENABLE_PROFILER:Z
        38: ifeq          54
        41: new           #90                 // class java/io/File
        44: dup
        45: ldc           #92                 // String log
        47: invokespecial #94                 // Method java/io/File."<init>":(Ljava/lang/String;)V
        50: invokevirtual #97                 // Method java/io/File.mkdirs:()Z
        53: pop
        54: invokestatic  #103                // Method java/lang/Runtime.getRuntime:()Ljava/lang/Runtime;
        57: invokevirtual #107                // Method java/lang/Runtime.availableProcessors:()I
        60: istore_0
        61: getstatic     #113                // Field ext/mods/Config.SCHEDULED_THREAD_POOL_COUNT:I
        64: istore_3
        65: iconst_0
        66: istore        4
        68: iload_3
        69: iconst_m1
        70: if_icmpne     79
        73: iload_0
        74: iconst_4
        75: imul
        76: goto          80
        79: iload_3
        80: nop
        81: iconst_1
        82: sipush        256
        85: invokestatic  #119                // Method kotlin/ranges/RangesKt.coerceIn:(III)I
        88: istore_1
        89: iconst_4
        90: iload_1
        91: invokestatic  #125                // Method java/lang/Math.min:(II)I
        94: iconst_1
        95: invokestatic  #128                // Method kotlin/ranges/RangesKt.coerceAtLeast:(II)I
        98: istore_2
        99: iload_1
       100: iload_2
       101: idiv
       102: iconst_1
       103: invokestatic  #128                // Method kotlin/ranges/RangesKt.coerceAtLeast:(II)I
       106: istore_3
       107: iconst_0
       108: istore        4
       110: iload_2
       111: anewarray     #130                // class java/util/concurrent/ScheduledThreadPoolExecutor
       114: astore        5
       116: iload         4
       118: iload_2
       119: if_icmpge     205
       122: iload         4
       124: istore        6
       126: aload         5
       128: iload         6
       130: new           #132                // class ext/mods/commons/pool/ThreadProvider
       133: dup
       134: iload         6
       136: invokedynamic #144,  0            // InvokeDynamic #0:makeConcatWithConstants:(I)Ljava/lang/String;
       141: iconst_5
       142: iconst_1
       143: invokespecial #147                // Method ext/mods/commons/pool/ThreadProvider."<init>":(Ljava/lang/String;IZ)V
       146: astore        7
       148: new           #130                // class java/util/concurrent/ScheduledThreadPoolExecutor
       151: dup
       152: iload_3
       153: aload         7
       155: checkcast     #149                // class java/util/concurrent/ThreadFactory
       158: invokespecial #152                // Method java/util/concurrent/ScheduledThreadPoolExecutor."<init>":(ILjava/util/concurrent/ThreadFactory;)V
       161: astore        8
       163: aload         8
       165: astore        9
       167: istore        16
       169: astore        15
       171: iconst_0
       172: istore        10
       174: aload         9
       176: iconst_1
       177: invokevirtual #155                // Method java/util/concurrent/ScheduledThreadPoolExecutor.setRemoveOnCancelPolicy:(Z)V
       180: aload         9
       182: iconst_0
       183: invokevirtual #158                // Method java/util/concurrent/ScheduledThreadPoolExecutor.setExecuteExistingDelayedTasksAfterShutdownPolicy:(Z)V
       186: nop
       187: getstatic     #163                // Field kotlin/Unit.INSTANCE:Lkotlin/Unit;
       190: astore        17
       192: aload         15
       194: iload         16
       196: aload         8
       198: aastore
       199: iinc          4, 1
       202: goto          116
       205: aload         5
       207: putstatic     #73                 // Field scheduledExecutors:[Ljava/util/concurrent/ScheduledThreadPoolExecutor;
       210: getstatic     #166                // Field ext/mods/Config.INSTANT_THREAD_POOL_COUNT:I
       213: istore        6
       215: iconst_0
       216: istore        7
       218: iload         6
       220: iconst_m1
       221: if_icmpne     230
       224: iload_0
       225: iconst_2
       226: imul
       227: goto          232
       230: iload         6
       232: nop
       233: iconst_1
       234: sipush        256
       237: invokestatic  #119                // Method kotlin/ranges/RangesKt.coerceIn:(III)I
       240: istore        4
       242: iconst_2
       243: iload         4
       245: invokestatic  #125                // Method java/lang/Math.min:(II)I
       248: iconst_1
       249: invokestatic  #128                // Method kotlin/ranges/RangesKt.coerceAtLeast:(II)I
       252: istore        5
       254: iload         4
       256: iload         5
       258: idiv
       259: iconst_1
       260: invokestatic  #128                // Method kotlin/ranges/RangesKt.coerceAtLeast:(II)I
       263: istore        6
       265: iload         6
       267: iconst_2
       268: imul
       269: sipush        256
       272: invokestatic  #169                // Method kotlin/ranges/RangesKt.coerceAtMost:(II)I
       275: istore        7
       277: iconst_0
       278: istore        8
       280: iload         5
       282: anewarray     #171                // class java/util/concurrent/ThreadPoolExecutor
       285: astore        9
       287: iload         8
       289: iload         5
       291: if_icmpge     399
       294: iload         8
       296: istore        10
       298: aload         9
       300: iload         10
       302: new           #132                // class ext/mods/commons/pool/ThreadProvider
       305: dup
       306: iload         10
       308: invokedynamic #174,  0            // InvokeDynamic #1:makeConcatWithConstants:(I)Ljava/lang/String;
       313: iconst_5
       314: iconst_1
       315: invokespecial #147                // Method ext/mods/commons/pool/ThreadProvider."<init>":(Ljava/lang/String;IZ)V
       318: astore        11
       320: new           #171                // class java/util/concurrent/ThreadPoolExecutor
       323: dup
       324: iload         6
       326: iload         7
       328: ldc2_w        #175                // long 60l
       331: getstatic     #182                // Field java/util/concurrent/TimeUnit.SECONDS:Ljava/util/concurrent/TimeUnit;
       334: new           #184                // class java/util/concurrent/LinkedBlockingQueue
       337: dup
       338: sipush        5000
       341: invokespecial #187                // Method java/util/concurrent/LinkedBlockingQueue."<init>":(I)V
       344: checkcast     #189                // class java/util/concurrent/BlockingQueue
       347: aload         11
       349: checkcast     #149                // class java/util/concurrent/ThreadFactory
       352: getstatic     #193                // Field rejectedHandler:Lext/mods/commons/pool/RejectedExecutionHandlerOptimized;
       355: checkcast     #195                // class java/util/concurrent/RejectedExecutionHandler
       358: invokespecial #198                // Method java/util/concurrent/ThreadPoolExecutor."<init>":(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;Ljava/util/concurrent/RejectedExecutionHandler;)V
       361: astore        12
       363: aload         12
       365: astore        13
       367: istore        16
       369: astore        15
       371: iconst_0
       372: istore        14
       374: aload         13
       376: iconst_1
       377: invokevirtual #201                // Method java/util/concurrent/ThreadPoolExecutor.allowCoreThreadTimeOut:(Z)V
       380: nop
       381: getstatic     #163                // Field kotlin/Unit.INSTANCE:Lkotlin/Unit;
       384: astore        17
       386: aload         15
       388: iload         16
       390: aload         12
       392: aastore
       393: iinc          8, 1
       396: goto          287
       399: aload         9
       401: putstatic     #205                // Field instantExecutors:[Ljava/util/concurrent/ThreadPoolExecutor;
       404: invokestatic  #211                // Method java/util/concurrent/Executors.newVirtualThreadPerTaskExecutor:()Ljava/util/concurrent/ExecutorService;
       407: astore        8
       409: aload         8
       411: astore        9
       413: iconst_0
       414: istore        10
       416: getstatic     #77                 // Field LOGGER:Ljava/util/logging/Logger;
       419: ldc           #213                // String Virtual Thread Executor inicializado
       421: invokevirtual #216                // Method java/util/logging/Logger.info:(Ljava/lang/String;)V
       424: nop
       425: aload         8
       427: putstatic     #220                // Field virtualExecutor:Ljava/util/concurrent/ExecutorService;
       430: getstatic     #223                // Field ext/mods/Config.PATHFINDING_THREADS:I
       433: istore        10
       435: iconst_0
       436: istore        11
       438: iload         10
       440: iconst_m1
       441: if_icmpne     454
       444: iload_0
       445: iconst_2
       446: idiv
       447: iconst_2
       448: invokestatic  #128                // Method kotlin/ranges/RangesKt.coerceAtLeast:(II)I
       451: goto          456
       454: iload         10
       456: nop
       457: iconst_2
       458: invokestatic  #128                // Method kotlin/ranges/RangesKt.coerceAtLeast:(II)I
       461: istore        8
       463: new           #132                // class ext/mods/commons/pool/ThreadProvider
       466: dup
       467: ldc           #225                // String Pathfinding-Thread
       469: iconst_4
       470: iconst_1
       471: invokespecial #147                // Method ext/mods/commons/pool/ThreadProvider."<init>":(Ljava/lang/String;IZ)V
       474: astore        9
       476: new           #171                // class java/util/concurrent/ThreadPoolExecutor
       479: dup
       480: iload         8
       482: iload         8
       484: ldc2_w        #175                // long 60l
       487: getstatic     #182                // Field java/util/concurrent/TimeUnit.SECONDS:Ljava/util/concurrent/TimeUnit;
       490: new           #184                // class java/util/concurrent/LinkedBlockingQueue
       493: dup
       494: sipush        200
       497: invokespecial #187                // Method java/util/concurrent/LinkedBlockingQueue."<init>":(I)V
       500: checkcast     #189                // class java/util/concurrent/BlockingQueue
       503: aload         9
       505: checkcast     #149                // class java/util/concurrent/ThreadFactory
       508: new           #227                // class java/util/concurrent/ThreadPoolExecutor$CallerRunsPolicy
       511: dup
       512: invokespecial #228                // Method java/util/concurrent/ThreadPoolExecutor$CallerRunsPolicy."<init>":()V
       515: checkcast     #195                // class java/util/concurrent/RejectedExecutionHandler
       518: invokespecial #198                // Method java/util/concurrent/ThreadPoolExecutor."<init>":(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;Ljava/util/concurrent/RejectedExecutionHandler;)V
       521: astore        10
       523: aload         10
       525: astore        11
       527: iconst_0
       528: istore        12
       530: aload         11
       532: iconst_0
       533: invokevirtual #201                // Method java/util/concurrent/ThreadPoolExecutor.allowCoreThreadTimeOut:(Z)V
       536: aload         11
       538: invokevirtual #231                // Method java/util/concurrent/ThreadPoolExecutor.prestartAllCoreThreads:()I
       541: pop
       542: nop
       543: aload         10
       545: putstatic     #17                 // Field pathfindingExecutor:Ljava/util/concurrent/ThreadPoolExecutor;
       548: new           #233                // class java/util/concurrent/ForkJoinPool
       551: dup
       552: iload_0
       553: getstatic     #237                // Field java/util/concurrent/ForkJoinPool.defaultForkJoinWorkerThreadFactory:Ljava/util/concurrent/ForkJoinPool$ForkJoinWorkerThreadFactory;
       556: aconst_null
       557: iconst_1
       558: invokespecial #240                // Method java/util/concurrent/ForkJoinPool."<init>":(ILjava/util/concurrent/ForkJoinPool$ForkJoinWorkerThreadFactory;Ljava/lang/Thread$UncaughtExceptionHandler;Z)V
       561: putstatic     #244                // Field forkJoinPool:Ljava/util/concurrent/ForkJoinPool;
       564: getstatic     #77                 // Field LOGGER:Ljava/util/logging/Logger;
       567: ldc           #246                // String === Inicializado ===
       569: invokevirtual #216                // Method java/util/logging/Logger.info:(Ljava/lang/String;)V
       572: getstatic     #77                 // Field LOGGER:Ljava/util/logging/Logger;
       575: iload_2
       576: iload_3
       577: invokedynamic #251,  0            // InvokeDynamic #2:makeConcatWithConstants:(II)Ljava/lang/String;
       582: invokevirtual #216                // Method java/util/logging/Logger.info:(Ljava/lang/String;)V
       585: getstatic     #77                 // Field LOGGER:Ljava/util/logging/Logger;
       588: iload         5
       590: iload         6
       592: iload         7
       594: invokedynamic #256,  0            // InvokeDynamic #3:makeConcatWithConstants:(III)Ljava/lang/String;
       599: invokevirtual #216                // Method java/util/logging/Logger.info:(Ljava/lang/String;)V
       602: getstatic     #77                 // Field LOGGER:Ljava/util/logging/Logger;
       605: ldc_w         #258                // String   - Virtual Thread Executor: Ativo (I/O-bound tasks)
       608: invokevirtual #216                // Method java/util/logging/Logger.info:(Ljava/lang/String;)V
       611: getstatic     #77                 // Field LOGGER:Ljava/util/logging/Logger;
       614: iload         8
       616: invokedynamic #261,  0            // InvokeDynamic #4:makeConcatWithConstants:(I)Ljava/lang/String;
       621: invokevirtual #216                // Method java/util/logging/Logger.info:(Ljava/lang/String;)V
       624: getstatic     #77                 // Field LOGGER:Ljava/util/logging/Logger;
       627: ldc_w         #263                // String   - Smart Dispatcher: Ativo (Lento > 15ms)
       630: invokevirtual #216                // Method java/util/logging/Logger.info:(Ljava/lang/String;)V
       633: getstatic     #77                 // Field LOGGER:Ljava/util/logging/Logger;
       636: getstatic     #88                 // Field INSTANCE:Lext/mods/commons/pool/CoroutinePool;
       639: pop
       640: getstatic     #38                 // Field ENABLE_PROFILER:Z
       643: ifeq          652
       646: ldc_w         #265                // String ATIVO
       649: goto          655
       652: ldc_w         #267                // String DESATIVADO
       655: invokedynamic #271,  0            // InvokeDynamic #5:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       660: invokevirtual #216                // Method java/util/logging/Logger.info:(Ljava/lang/String;)V
       663: getstatic     #77                 // Field LOGGER:Ljava/util/logging/Logger;
       666: ldc_w         #273                // String java.version
       669: invokestatic  #63                 // Method java/lang/System.getProperty:(Ljava/lang/String;)Ljava/lang/String;
       672: invokedynamic #276,  0            // InvokeDynamic #6:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       677: invokevirtual #216                // Method java/util/logging/Logger.info:(Ljava/lang/String;)V
       680: goto          705
       683: astore_0
       684: getstatic     #77                 // Field LOGGER:Ljava/util/logging/Logger;
       687: aload_0
       688: invokevirtual #280                // Method java/lang/Exception.getMessage:()Ljava/lang/String;
       691: invokedynamic #283,  0            // InvokeDynamic #7:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       696: invokevirtual #286                // Method java/util/logging/Logger.severe:(Ljava/lang/String;)V
       699: aload_0
       700: invokevirtual #289                // Method java/lang/Exception.printStackTrace:()V
       703: aload_0
       704: athrow
       705: return
      Exception table:
         from    to  target type
            15   680   683   Class java/lang/Exception
      StackMapTable: number_of_entries = 17
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 22 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 24
          locals = [ int, top, top, int, int ]
          stack = []
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 255 /* full_frame */
          offset_delta = 35
          locals = [ int, int, int, int, int, class "[Ljava/util/concurrent/ScheduledThreadPoolExecutor;" ]
          stack = []
        frame_type = 251 /* same_frame_extended */
          offset_delta = 88
        frame_type = 253 /* append */
          offset_delta = 24
          locals = [ int, int ]
        frame_type = 65 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 255 /* full_frame */
          offset_delta = 54
          locals = [ int, int, int, int, int, int, int, int, int, class "[Ljava/util/concurrent/ThreadPoolExecutor;" ]
          stack = []
        frame_type = 251 /* same_frame_extended */
          offset_delta = 111
        frame_type = 255 /* full_frame */
          offset_delta = 54
          locals = [ int, int, int, int, int, int, int, int, class java/util/concurrent/ExecutorService, class java/util/concurrent/ExecutorService, int, int ]
          stack = []
        frame_type = 65 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 255 /* full_frame */
          offset_delta = 195
          locals = [ int, int, int, int, int, int, int, int, int, class ext/mods/commons/pool/ThreadProvider, class java/util/concurrent/ThreadPoolExecutor, class java/util/concurrent/ThreadPoolExecutor, int ]
          stack = [ class java/util/logging/Logger ]
        frame_type = 255 /* full_frame */
          offset_delta = 2
          locals = [ int, int, int, int, int, int, int, int, int, class ext/mods/commons/pool/ThreadProvider, class java/util/concurrent/ThreadPoolExecutor, class java/util/concurrent/ThreadPoolExecutor, int ]
          stack = [ class java/util/logging/Logger, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 27
          locals = []
          stack = [ class java/lang/Exception ]
        frame_type = 255 /* full_frame */
          offset_delta = 21
          locals = [ int, int, int, int, int, int, int, int, int, class ext/mods/commons/pool/ThreadProvider, class java/util/concurrent/ThreadPoolExecutor, class java/util/concurrent/ThreadPoolExecutor, int ]
          stack = []
      LineNumberTable:
        line 71: 0
        line 72: 14
        line 73: 15
        line 74: 16
        line 75: 22
        line 76: 30
        line 78: 31
        line 79: 41
        line 81: 54
        line 82: 61
        line 83: 68
        line 82: 80
        line 84: 81
        line 82: 88
        line 85: 89
        line 85: 94
        line 86: 99
        line 87: 107
        line 88: 130
        line 89: 148
        line 90: 152
        line 91: 153
        line 89: 158
        line 92: 163
        line 93: 174
        line 94: 180
        line 95: 186
        line 92: 196
        line 87: 199
        line 97: 210
        line 98: 218
        line 97: 232
        line 99: 233
        line 97: 240
        line 100: 242
        line 100: 248
        line 101: 254
        line 102: 265
        line 103: 277
        line 104: 302
        line 105: 320
        line 106: 324
        line 107: 326
        line 108: 328
        line 109: 334
        line 110: 347
        line 111: 352
        line 105: 358
        line 112: 363
        line 113: 374
        line 114: 380
        line 112: 390
        line 103: 393
        line 117: 404
        line 118: 416
        line 119: 424
        line 117: 425
        line 117: 427
        line 121: 430
        line 122: 438
        line 121: 456
        line 123: 457
        line 121: 461
        line 125: 463
        line 126: 467
        line 127: 469
        line 128: 470
        line 125: 471
        line 131: 476
        line 132: 480
        line 133: 482
        line 134: 484
        line 135: 490
        line 136: 503
        line 137: 508
        line 131: 518
        line 138: 523
        line 139: 530
        line 140: 536
        line 141: 542
        line 138: 543
        line 131: 545
        line 143: 548
        line 144: 552
        line 145: 553
        line 146: 556
        line 147: 557
        line 143: 558
        line 150: 564
        line 151: 572
        line 152: 585
        line 153: 602
        line 154: 611
        line 155: 624
        line 156: 633
        line 157: 663
        line 159: 683
        line 160: 684
        line 161: 699
        line 162: 703
        line 164: 705
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           68      12     4 $i$a$-let-CoroutinePool$init$totalScheduled$1   I
           65      15     3    it   I
          174      13    10 $i$a$-apply-CoroutinePool$init$1$1   I
          171      16     9 $this$init_u24lambda_u241   Ljava/util/concurrent/ScheduledThreadPoolExecutor;
          148      50     7 threadProvider   Lext/mods/commons/pool/ThreadProvider;
          218      14     7 $i$a$-let-CoroutinePool$init$totalInstant$1   I
          215      17     6    it   I
          374       7    14 $i$a$-apply-CoroutinePool$init$2$1   I
          371      10    13 $this$init_u24lambda_u243   Ljava/util/concurrent/ThreadPoolExecutor;
          320      72    11 threadProvider   Lext/mods/commons/pool/ThreadProvider;
          416       9    10 $i$a$-apply-CoroutinePool$init$3   I
          413      12     9 $this$init_u24lambda_u244   Ljava/util/concurrent/ExecutorService;
          438      18    11 $i$a$-let-CoroutinePool$init$pathfindingThreads$1   I
          435      21    10    it   I
          530      13    12 $i$a$-apply-CoroutinePool$init$4   I
          527      16    11 $this$init_u24lambda_u246   Ljava/util/concurrent/ThreadPoolExecutor;
           61     619     0 availableProcessors   I
           89     591     1 totalScheduled   I
           99     581     2 scheduledPoolCount   I
          107     573     3 scheduledPoolCoreSize   I
          242     438     4 totalInstant   I
          254     426     5 instantPoolCount   I
          265     415     6 instantPoolCoreSize   I
          277     403     7 instantPoolMaxSize   I
          463     217     8 pathfindingThreads   I
          476     204     9 pathfindingThreadProvider   Lext/mods/commons/pool/ThreadProvider;
          684      21     0     e   Ljava/lang/Exception;
    RuntimeVisibleAnnotations:
      0: #51()
        kotlin.jvm.JvmStatic

  public static final void executeSmart(java.lang.String, java.lang.Runnable);
    descriptor: (Ljava/lang/String;Ljava/lang/Runnable;)V
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    Code:
      stack=3, locals=4, args_size=2
         0: getstatic     #402                // Field taskRoutingHistory:Ljava/util/concurrent/ConcurrentHashMap;
         3: aload_0
         4: getstatic     #408                // Field ext/mods/commons/pool/CoroutinePool$ExecutionRoute.PLATFORM:Lext/mods/commons/pool/CoroutinePool$ExecutionRoute;
         7: invokevirtual #414                // Method java/util/concurrent/ConcurrentHashMap.getOrDefault:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        10: checkcast     #404                // class ext/mods/commons/pool/CoroutinePool$ExecutionRoute
        13: astore_2
        14: aload_1
        15: aload_2
        16: aload_0
        17: invokedynamic #422,  0            // InvokeDynamic #11:run:(Ljava/lang/Runnable;Lext/mods/commons/pool/CoroutinePool$ExecutionRoute;Ljava/lang/String;)Ljava/lang/Runnable;
        22: astore_3
        23: aload_2
        24: getstatic     #428                // Field ext/mods/commons/pool/CoroutinePool$WhenMappings.$EnumSwitchMapping$0:[I
        27: swap
        28: invokevirtual #431                // Method ext/mods/commons/pool/CoroutinePool$ExecutionRoute.ordinal:()I
        31: iaload
        32: tableswitch   { // 1 to 2

                       1: 56

                       2: 63
                 default: 87
            }
        56: aload_3
        57: invokestatic  #432                // Method execute:(Ljava/lang/Runnable;)V
        60: goto          95
        63: getstatic     #220                // Field virtualExecutor:Ljava/util/concurrent/ExecutorService;
        66: dup
        67: ifnull        79
        70: aload_3
        71: invokeinterface #340,  2          // InterfaceMethod java/util/concurrent/ExecutorService.execute:(Ljava/lang/Runnable;)V
        76: goto          95
        79: pop
        80: aload_3
        81: invokestatic  #432                // Method execute:(Ljava/lang/Runnable;)V
        84: goto          95
        87: new           #434                // class kotlin/NoWhenBranchMatchedException
        90: dup
        91: invokespecial #435                // Method kotlin/NoWhenBranchMatchedException."<init>":()V
        94: athrow
        95: return
      StackMapTable: number_of_entries = 5
        frame_type = 253 /* append */
          offset_delta = 56
          locals = [ class ext/mods/commons/pool/CoroutinePool$ExecutionRoute, class java/lang/Runnable ]
        frame_type = 6 /* same */
        frame_type = 79 /* same_locals_1_stack_item */
          stack = [ class java/util/concurrent/ExecutorService ]
        frame_type = 7 /* same */
        frame_type = 7 /* same */
      LineNumberTable:
        line 219: 0
        line 221: 14
        line 240: 23
        line 241: 56
        line 242: 63
        line 240: 87
        line 244: 95
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           14      82     2 currentRoute   Lext/mods/commons/pool/CoroutinePool$ExecutionRoute;
           23      73     3 wrappedTask   Ljava/lang/Runnable;
            0      96     0 taskId   Ljava/lang/String;
            0      96     1  task   Ljava/lang/Runnable;
    RuntimeVisibleAnnotations:
      0: #51()
        kotlin.jvm.JvmStatic
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #13()
          org.jetbrains.annotations.NotNull
      parameter 1:
        0: #13()
          org.jetbrains.annotations.NotNull

  public static final void executeSmart(java.lang.Runnable);
    descriptor: (Ljava/lang/Runnable;)V
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #442                // Method java/lang/Object.getClass:()Ljava/lang/Class;
         4: invokevirtual #447                // Method java/lang/Class.getSimpleName:()Ljava/lang/String;
         7: aload_0
         8: invokestatic  #449                // Method executeSmart:(Ljava/lang/String;Ljava/lang/Runnable;)V
        11: return
      LineNumberTable:
        line 247: 0
        line 248: 11
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0  task   Ljava/lang/Runnable;
    RuntimeVisibleAnnotations:
      0: #51()
        kotlin.jvm.JvmStatic
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #13()
          org.jetbrains.annotations.NotNull

  public static final void execute(java.lang.Runnable);
    descriptor: (Ljava/lang/Runnable;)V
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    Code:
      stack=4, locals=5, args_size=1
         0: getstatic     #205                // Field instantExecutors:[Ljava/util/concurrent/ThreadPoolExecutor;
         3: astore_1
         4: aload_1
         5: ifnull        21
         8: aload_1
         9: arraylength
        10: ifne          17
        13: iconst_1
        14: goto          18
        17: iconst_0
        18: ifeq          46
        21: getstatic     #77                 // Field LOGGER:Ljava/util/logging/Logger;
        24: ldc_w         #453                // String CoroutinePool não inicializado. Executando tarefa de emergência.
        27: invokevirtual #85                 // Method java/util/logging/Logger.warning:(Ljava/lang/String;)V
        30: nop
        31: aload_0
        32: invokeinterface #455,  1          // InterfaceMethod java/lang/Runnable.run:()V
        37: goto          45
        40: astore_2
        41: aload_2
        42: invokevirtual #289                // Method java/lang/Exception.printStackTrace:()V
        45: return
        46: nop
        47: getstatic     #459                // Field totalTasksSubmitted:Ljava/util/concurrent/atomic/LongAdder;
        50: invokevirtual #464                // Method java/util/concurrent/atomic/LongAdder.increment:()V
        53: aload_1
        54: invokestatic  #470                // Method java/util/concurrent/ThreadLocalRandom.current:()Ljava/util/concurrent/ThreadLocalRandom;
        57: aload_1
        58: arraylength
        59: invokevirtual #474                // Method java/util/concurrent/ThreadLocalRandom.nextInt:(I)I
        62: aaload
        63: astore_2
        64: aload_2
        65: getstatic     #88                 // Field INSTANCE:Lext/mods/commons/pool/CoroutinePool;
        68: aload_0
        69: ldc_w         #476                // String InstantPool
        72: invokespecial #478                // Method wrapProfiler:(Ljava/lang/Runnable;Ljava/lang/String;)Ljava/lang/Runnable;
        75: invokevirtual #479                // Method java/util/concurrent/ThreadPoolExecutor.execute:(Ljava/lang/Runnable;)V
        78: goto          175
        81: astore_2
        82: getstatic     #482                // Field totalTasksRejected:Ljava/util/concurrent/atomic/LongAdder;
        85: invokevirtual #464                // Method java/util/concurrent/atomic/LongAdder.increment:()V
        88: getstatic     #77                 // Field LOGGER:Ljava/util/logging/Logger;
        91: ldc_w         #484                // String Tarefa rejeitada (pool cheio). Executando na thread atual.
        94: invokevirtual #85                 // Method java/util/logging/Logger.warning:(Ljava/lang/String;)V
        97: getstatic     #205                // Field instantExecutors:[Ljava/util/concurrent/ThreadPoolExecutor;
       100: dup
       101: ifnull        114
       104: iconst_0
       105: invokestatic  #490                // Method kotlin/collections/ArraysKt.getOrNull:([Ljava/lang/Object;I)Ljava/lang/Object;
       108: checkcast     #171                // class java/util/concurrent/ThreadPoolExecutor
       111: goto          116
       114: pop
       115: aconst_null
       116: astore_3
       117: aload_3
       118: ifnull        128
       121: aload_3
       122: invokevirtual #493                // Method java/util/concurrent/ThreadPoolExecutor.isShutdown:()Z
       125: ifeq          148
       128: nop
       129: aload_0
       130: invokeinterface #455,  1          // InterfaceMethod java/lang/Runnable.run:()V
       135: goto          175
       138: astore        4
       140: aload         4
       142: invokevirtual #289                // Method java/lang/Exception.printStackTrace:()V
       145: goto          175
       148: getstatic     #193                // Field rejectedHandler:Lext/mods/commons/pool/RejectedExecutionHandlerOptimized;
       151: aload_0
       152: aload_3
       153: invokevirtual #499                // Method ext/mods/commons/pool/RejectedExecutionHandlerOptimized.rejectedExecution:(Ljava/lang/Runnable;Ljava/util/concurrent/ThreadPoolExecutor;)V
       156: goto          175
       159: astore_2
       160: getstatic     #77                 // Field LOGGER:Ljava/util/logging/Logger;
       163: aload_2
       164: invokevirtual #280                // Method java/lang/Exception.getMessage:()Ljava/lang/String;
       167: invokedynamic #502,  0            // InvokeDynamic #12:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       172: invokevirtual #286                // Method java/util/logging/Logger.severe:(Ljava/lang/String;)V
       175: return
      Exception table:
         from    to  target type
            30    37    40   Class java/lang/Exception
           128   135   138   Class java/lang/Exception
            46    78    81   Class java/util/concurrent/RejectedExecutionException
            46    78   159   Class java/lang/Exception
      StackMapTable: number_of_entries = 14
        frame_type = 252 /* append */
          offset_delta = 17
          locals = [ class "[Ljava/util/concurrent/ThreadPoolExecutor;" ]
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 2 /* same */
        frame_type = 82 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 4 /* same */
        frame_type = 0 /* same */
        frame_type = 98 /* same_locals_1_stack_item */
          stack = [ class java/util/concurrent/RejectedExecutionException ]
        frame_type = 255 /* full_frame */
          offset_delta = 32
          locals = [ class java/lang/Runnable, class "[Ljava/util/concurrent/ThreadPoolExecutor;", class java/util/concurrent/RejectedExecutionException ]
          stack = [ class "[Ljava/util/concurrent/ThreadPoolExecutor;" ]
        frame_type = 65 /* same_locals_1_stack_item */
          stack = [ class java/util/concurrent/ThreadPoolExecutor ]
        frame_type = 252 /* append */
          offset_delta = 11
          locals = [ class java/util/concurrent/ThreadPoolExecutor ]
        frame_type = 73 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 9 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 10
          locals = [ class java/lang/Runnable, class "[Ljava/util/concurrent/ThreadPoolExecutor;" ]
          stack = [ class java/lang/Exception ]
        frame_type = 252 /* append */
          offset_delta = 15
          locals = [ class java/lang/Object ]
      LineNumberTable:
        line 251: 0
        line 253: 4
        line 253: 18
        line 254: 21
        line 255: 30
        line 256: 45
        line 259: 46
        line 260: 47
        line 261: 53
        line 262: 64
        line 263: 81
        line 264: 82
        line 265: 88
        line 266: 97
        line 267: 117
        line 268: 128
        line 270: 148
        line 272: 159
        line 273: 160
        line 275: 175
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           41       4     2     e   Ljava/lang/Exception;
           64      14     2 selectedPool   Ljava/util/concurrent/ThreadPoolExecutor;
          140       5     4    ex   Ljava/lang/Exception;
          117      39     3 pool0   Ljava/util/concurrent/ThreadPoolExecutor;
           82      74     2     e   Ljava/util/concurrent/RejectedExecutionException;
          160      15     2     e   Ljava/lang/Exception;
            4     172     1 executors   [Ljava/util/concurrent/ThreadPoolExecutor;
            0     176     0     r   Ljava/lang/Runnable;
    RuntimeVisibleAnnotations:
      0: #51()
        kotlin.jvm.JvmStatic
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #13()
          org.jetbrains.annotations.NotNull

  public static final void executeIO(java.lang.Runnable);
    descriptor: (Ljava/lang/Runnable;)V
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    Code:
      stack=4, locals=3, args_size=1
         0: getstatic     #220                // Field virtualExecutor:Ljava/util/concurrent/ExecutorService;
         3: astore_1
         4: aload_1
         5: ifnonnull     13
         8: aload_0
         9: invokestatic  #432                // Method execute:(Ljava/lang/Runnable;)V
        12: return
        13: nop
        14: getstatic     #459                // Field totalTasksSubmitted:Ljava/util/concurrent/atomic/LongAdder;
        17: invokevirtual #464                // Method java/util/concurrent/atomic/LongAdder.increment:()V
        20: aload_1
        21: getstatic     #88                 // Field INSTANCE:Lext/mods/commons/pool/CoroutinePool;
        24: aload_0
        25: ldc_w         #511                // String VirtualPool
        28: invokespecial #478                // Method wrapProfiler:(Ljava/lang/Runnable;Ljava/lang/String;)Ljava/lang/Runnable;
        31: invokeinterface #340,  2          // InterfaceMethod java/util/concurrent/ExecutorService.execute:(Ljava/lang/Runnable;)V
        36: goto          65
        39: astore_2
        40: getstatic     #482                // Field totalTasksRejected:Ljava/util/concurrent/atomic/LongAdder;
        43: invokevirtual #464                // Method java/util/concurrent/atomic/LongAdder.increment:()V
        46: getstatic     #77                 // Field LOGGER:Ljava/util/logging/Logger;
        49: aload_2
        50: invokevirtual #280                // Method java/lang/Exception.getMessage:()Ljava/lang/String;
        53: invokedynamic #514,  0            // InvokeDynamic #13:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
        58: invokevirtual #286                // Method java/util/logging/Logger.severe:(Ljava/lang/String;)V
        61: aload_0
        62: invokestatic  #432                // Method execute:(Ljava/lang/Runnable;)V
        65: return
      Exception table:
         from    to  target type
            13    36    39   Class java/lang/Exception
      StackMapTable: number_of_entries = 3
        frame_type = 252 /* append */
          offset_delta = 13
          locals = [ class java/util/concurrent/ExecutorService ]
        frame_type = 89 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 25 /* same */
      LineNumberTable:
        line 279: 0
        line 280: 4
        line 281: 8
        line 282: 12
        line 284: 13
        line 285: 14
        line 286: 20
        line 287: 39
        line 288: 40
        line 289: 46
        line 290: 61
        line 292: 65
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           40      25     2     e   Ljava/lang/Exception;
            4      62     1 executor   Ljava/util/concurrent/ExecutorService;
            0      66     0  task   Ljava/lang/Runnable;
    RuntimeVisibleAnnotations:
      0: #51()
        kotlin.jvm.JvmStatic
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #13()
          org.jetbrains.annotations.NotNull

  public static final java.util.concurrent.ScheduledFuture<?> schedule(java.lang.Runnable, long);
    descriptor: (Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    Code:
      stack=5, locals=6, args_size=2
         0: getstatic     #73                 // Field scheduledExecutors:[Ljava/util/concurrent/ScheduledThreadPoolExecutor;
         3: dup
         4: ifnonnull     15
         7: pop
         8: getstatic     #524                // Field ext/mods/commons/pool/ScheduledFutureTask.Companion:Lext/mods/commons/pool/ScheduledFutureTask$Companion;
        11: invokevirtual #530                // Method ext/mods/commons/pool/ScheduledFutureTask$Companion.cancelled:()Ljava/util/concurrent/ScheduledFuture;
        14: areturn
        15: astore_3
        16: nop
        17: getstatic     #459                // Field totalTasksSubmitted:Ljava/util/concurrent/atomic/LongAdder;
        20: invokevirtual #464                // Method java/util/concurrent/atomic/LongAdder.increment:()V
        23: aload_3
        24: invokestatic  #470                // Method java/util/concurrent/ThreadLocalRandom.current:()Ljava/util/concurrent/ThreadLocalRandom;
        27: aload_3
        28: arraylength
        29: invokevirtual #474                // Method java/util/concurrent/ThreadLocalRandom.nextInt:(I)I
        32: aaload
        33: astore        4
        35: aload         4
        37: getstatic     #88                 // Field INSTANCE:Lext/mods/commons/pool/CoroutinePool;
        40: aload_0
        41: ldc_w         #532                // String ScheduledPool
        44: invokespecial #478                // Method wrapProfiler:(Ljava/lang/Runnable;Ljava/lang/String;)Ljava/lang/Runnable;
        47: getstatic     #88                 // Field INSTANCE:Lext/mods/commons/pool/CoroutinePool;
        50: lload_1
        51: invokespecial #536                // Method validate:(J)J
        54: getstatic     #539                // Field java/util/concurrent/TimeUnit.MILLISECONDS:Ljava/util/concurrent/TimeUnit;
        57: invokevirtual #542                // Method java/util/concurrent/ScheduledThreadPoolExecutor.schedule:(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;
        60: astore        4
        62: goto          91
        65: astore        5
        67: getstatic     #77                 // Field LOGGER:Ljava/util/logging/Logger;
        70: aload         5
        72: invokevirtual #280                // Method java/lang/Exception.getMessage:()Ljava/lang/String;
        75: invokedynamic #545,  0            // InvokeDynamic #14:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
        80: invokevirtual #286                // Method java/util/logging/Logger.severe:(Ljava/lang/String;)V
        83: getstatic     #524                // Field ext/mods/commons/pool/ScheduledFutureTask.Companion:Lext/mods/commons/pool/ScheduledFutureTask$Companion;
        86: invokevirtual #530                // Method ext/mods/commons/pool/ScheduledFutureTask$Companion.cancelled:()Ljava/util/concurrent/ScheduledFuture;
        89: astore        4
        91: aload         4
        93: areturn
      Exception table:
         from    to  target type
            16    62    65   Class java/lang/Exception
      StackMapTable: number_of_entries = 3
        frame_type = 79 /* same_locals_1_stack_item */
          stack = [ class "[Ljava/util/concurrent/ScheduledThreadPoolExecutor;" ]
        frame_type = 255 /* full_frame */
          offset_delta = 49
          locals = [ class java/lang/Runnable, long, class "[Ljava/util/concurrent/ScheduledThreadPoolExecutor;" ]
          stack = [ class java/lang/Exception ]
        frame_type = 252 /* append */
          offset_delta = 25
          locals = [ class java/util/concurrent/ScheduledFuture ]
      LineNumberTable:
        line 296: 0
        line 297: 16
        line 298: 17
        line 299: 23
        line 300: 35
        line 301: 65
        line 302: 67
        line 303: 83
        line 297: 93
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           35      25     4 selectedPool   Ljava/util/concurrent/ScheduledThreadPoolExecutor;
           67      24     5     e   Ljava/lang/Exception;
           16      78     3 executors   [Ljava/util/concurrent/ScheduledThreadPoolExecutor;
            0      94     0     r   Ljava/lang/Runnable;
            0      94     1 delay   J
    Signature: #518                         // (Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture<*>;
    RuntimeVisibleAnnotations:
      0: #51()
        kotlin.jvm.JvmStatic
    RuntimeInvisibleAnnotations:
      0: #13()
        org.jetbrains.annotations.NotNull
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #13()
          org.jetbrains.annotations.NotNull
      parameter 1:

  public static final java.util.concurrent.ScheduledFuture<?> scheduleAtFixedRate(java.lang.Runnable, long, long);
    descriptor: (Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    Code:
      stack=7, locals=8, args_size=3
         0: getstatic     #73                 // Field scheduledExecutors:[Ljava/util/concurrent/ScheduledThreadPoolExecutor;
         3: dup
         4: ifnonnull     15
         7: pop
         8: getstatic     #524                // Field ext/mods/commons/pool/ScheduledFutureTask.Companion:Lext/mods/commons/pool/ScheduledFutureTask$Companion;
        11: invokevirtual #530                // Method ext/mods/commons/pool/ScheduledFutureTask$Companion.cancelled:()Ljava/util/concurrent/ScheduledFuture;
        14: areturn
        15: astore        5
        17: nop
        18: getstatic     #459                // Field totalTasksSubmitted:Ljava/util/concurrent/atomic/LongAdder;
        21: invokevirtual #464                // Method java/util/concurrent/atomic/LongAdder.increment:()V
        24: aload         5
        26: invokestatic  #470                // Method java/util/concurrent/ThreadLocalRandom.current:()Ljava/util/concurrent/ThreadLocalRandom;
        29: aload         5
        31: arraylength
        32: invokevirtual #474                // Method java/util/concurrent/ThreadLocalRandom.nextInt:(I)I
        35: aaload
        36: astore        6
        38: aload         6
        40: getstatic     #88                 // Field INSTANCE:Lext/mods/commons/pool/CoroutinePool;
        43: aload_0
        44: ldc_w         #553                // String ScheduledPool-Periodic
        47: invokespecial #478                // Method wrapProfiler:(Ljava/lang/Runnable;Ljava/lang/String;)Ljava/lang/Runnable;
        50: getstatic     #88                 // Field INSTANCE:Lext/mods/commons/pool/CoroutinePool;
        53: lload_1
        54: invokespecial #536                // Method validate:(J)J
        57: getstatic     #88                 // Field INSTANCE:Lext/mods/commons/pool/CoroutinePool;
        60: lload_3
        61: invokespecial #536                // Method validate:(J)J
        64: getstatic     #539                // Field java/util/concurrent/TimeUnit.MILLISECONDS:Ljava/util/concurrent/TimeUnit;
        67: invokevirtual #556                // Method java/util/concurrent/ScheduledThreadPoolExecutor.scheduleAtFixedRate:(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;
        70: astore        6
        72: goto          101
        75: astore        7
        77: getstatic     #77                 // Field LOGGER:Ljava/util/logging/Logger;
        80: aload         7
        82: invokevirtual #280                // Method java/lang/Exception.getMessage:()Ljava/lang/String;
        85: invokedynamic #559,  0            // InvokeDynamic #15:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
        90: invokevirtual #286                // Method java/util/logging/Logger.severe:(Ljava/lang/String;)V
        93: getstatic     #524                // Field ext/mods/commons/pool/ScheduledFutureTask.Companion:Lext/mods/commons/pool/ScheduledFutureTask$Companion;
        96: invokevirtual #530                // Method ext/mods/commons/pool/ScheduledFutureTask$Companion.cancelled:()Ljava/util/concurrent/ScheduledFuture;
        99: astore        6
       101: aload         6
       103: areturn
      Exception table:
         from    to  target type
            17    72    75   Class java/lang/Exception
      StackMapTable: number_of_entries = 3
        frame_type = 79 /* same_locals_1_stack_item */
          stack = [ class "[Ljava/util/concurrent/ScheduledThreadPoolExecutor;" ]
        frame_type = 255 /* full_frame */
          offset_delta = 59
          locals = [ class java/lang/Runnable, long, long, class "[Ljava/util/concurrent/ScheduledThreadPoolExecutor;" ]
          stack = [ class java/lang/Exception ]
        frame_type = 252 /* append */
          offset_delta = 25
          locals = [ class java/util/concurrent/ScheduledFuture ]
      LineNumberTable:
        line 308: 0
        line 309: 17
        line 310: 18
        line 311: 24
        line 312: 38
        line 313: 75
        line 314: 77
        line 315: 93
        line 309: 103
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           38      32     6 selectedPool   Ljava/util/concurrent/ScheduledThreadPoolExecutor;
           77      24     7     e   Ljava/lang/Exception;
           17      87     5 executors   [Ljava/util/concurrent/ScheduledThreadPoolExecutor;
            0     104     0     r   Ljava/lang/Runnable;
            0     104     1 delay   J
            0     104     3 period   J
    Signature: #551                         // (Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture<*>;
    RuntimeVisibleAnnotations:
      0: #51()
        kotlin.jvm.JvmStatic
    RuntimeInvisibleAnnotations:
      0: #13()
        org.jetbrains.annotations.NotNull
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #13()
          org.jetbrains.annotations.NotNull
      parameter 1:
      parameter 2:

  public static final void executePathfinding(java.lang.Runnable);
    descriptor: (Ljava/lang/Runnable;)V
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    Code:
      stack=4, locals=5, args_size=1
         0: getstatic     #17                 // Field pathfindingExecutor:Ljava/util/concurrent/ThreadPoolExecutor;
         3: dup
         4: ifnonnull     22
         7: pop
         8: getstatic     #88                 // Field INSTANCE:Lext/mods/commons/pool/CoroutinePool;
        11: astore_3
        12: iconst_0
        13: istore        4
        15: aload_0
        16: invokeinterface #455,  1          // InterfaceMethod java/lang/Runnable.run:()V
        21: return
        22: astore_1
        23: nop
        24: getstatic     #564                // Field pathfindingTasksSubmitted:Ljava/util/concurrent/atomic/LongAdder;
        27: invokevirtual #464                // Method java/util/concurrent/atomic/LongAdder.increment:()V
        30: aload_1
        31: getstatic     #88                 // Field INSTANCE:Lext/mods/commons/pool/CoroutinePool;
        34: aload_0
        35: ldc_w         #566                // String PathfindingPool
        38: invokespecial #478                // Method wrapProfiler:(Ljava/lang/Runnable;Ljava/lang/String;)Ljava/lang/Runnable;
        41: invokevirtual #479                // Method java/util/concurrent/ThreadPoolExecutor.execute:(Ljava/lang/Runnable;)V
        44: goto          69
        47: astore_2
        48: getstatic     #77                 // Field LOGGER:Ljava/util/logging/Logger;
        51: aload_2
        52: invokevirtual #280                // Method java/lang/Exception.getMessage:()Ljava/lang/String;
        55: invokedynamic #569,  0            // InvokeDynamic #16:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
        60: invokevirtual #572                // Method java/util/logging/Logger.fine:(Ljava/lang/String;)V
        63: aload_0
        64: invokeinterface #455,  1          // InterfaceMethod java/lang/Runnable.run:()V
        69: return
      Exception table:
         from    to  target type
            23    44    47   Class java/lang/Exception
      StackMapTable: number_of_entries = 3
        frame_type = 86 /* same_locals_1_stack_item */
          stack = [ class java/util/concurrent/ThreadPoolExecutor ]
        frame_type = 255 /* full_frame */
          offset_delta = 24
          locals = [ class java/lang/Runnable, class java/util/concurrent/ThreadPoolExecutor ]
          stack = [ class java/lang/Exception ]
        frame_type = 21 /* same */
      LineNumberTable:
        line 321: 0
        line 439: 12
        line 321: 15
        line 321: 0
        line 321: 0
        line 322: 23
        line 323: 24
        line 324: 30
        line 325: 47
        line 326: 48
        line 327: 63
        line 329: 69
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           15       7     4 $i$a$-run-CoroutinePool$executePathfinding$executor$1   I
           12      10     3 $this$executePathfinding_u24lambda_u240   Lext/mods/commons/pool/CoroutinePool;
           48      21     2     e   Ljava/lang/Exception;
           23      47     1 executor   Ljava/util/concurrent/ThreadPoolExecutor;
            0      70     0  task   Ljava/lang/Runnable;
    RuntimeVisibleAnnotations:
      0: #51()
        kotlin.jvm.JvmStatic
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #13()
          org.jetbrains.annotations.NotNull

  public static final <T extends java.lang.Object> T runPathfindingBlocking(kotlin.jvm.functions.Function0<? extends T>);
    descriptor: (Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    Code:
      stack=2, locals=4, args_size=1
         0: getstatic     #17                 // Field pathfindingExecutor:Ljava/util/concurrent/ThreadPoolExecutor;
         3: dup
         4: ifnonnull     15
         7: pop
         8: aload_0
         9: invokeinterface #583,  1          // InterfaceMethod kotlin/jvm/functions/Function0.invoke:()Ljava/lang/Object;
        14: areturn
        15: astore_1
        16: nop
        17: getstatic     #564                // Field pathfindingTasksSubmitted:Ljava/util/concurrent/atomic/LongAdder;
        20: invokevirtual #464                // Method java/util/concurrent/atomic/LongAdder.increment:()V
        23: aload_0
        24: invokedynamic #592,  0            // InvokeDynamic #17:get:(Lkotlin/jvm/functions/Function0;)Ljava/util/function/Supplier;
        29: aload_1
        30: checkcast     #594                // class java/util/concurrent/Executor
        33: invokestatic  #600                // Method java/util/concurrent/CompletableFuture.supplyAsync:(Ljava/util/function/Supplier;Ljava/util/concurrent/Executor;)Ljava/util/concurrent/CompletableFuture;
        36: astore_2
        37: aload_2
        38: invokevirtual #602                // Method java/util/concurrent/CompletableFuture.get:()Ljava/lang/Object;
        41: astore_2
        42: goto          53
        45: astore_3
        46: aload_0
        47: invokeinterface #583,  1          // InterfaceMethod kotlin/jvm/functions/Function0.invoke:()Ljava/lang/Object;
        52: astore_2
        53: aload_2
        54: areturn
      Exception table:
         from    to  target type
            16    42    45   Class java/lang/Exception
      StackMapTable: number_of_entries = 3
        frame_type = 79 /* same_locals_1_stack_item */
          stack = [ class java/util/concurrent/ThreadPoolExecutor ]
        frame_type = 255 /* full_frame */
          offset_delta = 29
          locals = [ class kotlin/jvm/functions/Function0, class java/util/concurrent/ThreadPoolExecutor ]
          stack = [ class java/lang/Exception ]
        frame_type = 252 /* append */
          offset_delta = 7
          locals = [ class java/lang/Object ]
      LineNumberTable:
        line 333: 0
        line 334: 16
        line 335: 17
        line 336: 23
        line 340: 29
        line 336: 33
        line 341: 37
        line 342: 45
        line 343: 46
        line 334: 54
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           37       4     2 future   Ljava/util/concurrent/CompletableFuture;
           46       7     3     e   Ljava/lang/Exception;
           16      39     1 executor   Ljava/util/concurrent/ThreadPoolExecutor;
            0      55     0 block   Lkotlin/jvm/functions/Function0;
    Signature: #577                         // <T:Ljava/lang/Object;>(Lkotlin/jvm/functions/Function0<+TT;>;)TT;
    RuntimeVisibleAnnotations:
      0: #51()
        kotlin.jvm.JvmStatic
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #13()
          org.jetbrains.annotations.NotNull

  public static final kotlinx.coroutines.Job executeParallel(java.lang.Runnable);
    descriptor: (Ljava/lang/Runnable;)Lkotlinx/coroutines/Job;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    Code:
      stack=7, locals=1, args_size=1
         0: getstatic     #612                // Field BackgroundScope:Lkotlinx/coroutines/CoroutineScope;
         3: invokestatic  #32                 // Method kotlinx/coroutines/Dispatchers.getDefault:()Lkotlinx/coroutines/CoroutineDispatcher;
         6: checkcast     #614                // class kotlin/coroutines/CoroutineContext
         9: aconst_null
        10: new           #616                // class ext/mods/commons/pool/CoroutinePool$executeParallel$1
        13: dup
        14: aload_0
        15: aconst_null
        16: invokespecial #619                // Method ext/mods/commons/pool/CoroutinePool$executeParallel$1."<init>":(Ljava/lang/Runnable;Lkotlin/coroutines/Continuation;)V
        19: checkcast     #621                // class kotlin/jvm/functions/Function2
        22: iconst_2
        23: aconst_null
        24: invokestatic  #627                // Method kotlinx/coroutines/BuildersKt.launch$default:(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;
        27: areturn
      LineNumberTable:
        line 349: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      28     0  task   Ljava/lang/Runnable;
    RuntimeVisibleAnnotations:
      0: #51()
        kotlin.jvm.JvmStatic
    RuntimeInvisibleAnnotations:
      0: #13()
        org.jetbrains.annotations.NotNull
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #13()
          org.jetbrains.annotations.NotNull

  public static final void executeParallelBlocking(java.lang.Runnable);
    descriptor: (Ljava/lang/Runnable;)V
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    Code:
      stack=2, locals=3, args_size=1
         0: getstatic     #244                // Field forkJoinPool:Ljava/util/concurrent/ForkJoinPool;
         3: dup
         4: ifnonnull     13
         7: pop
         8: aload_0
         9: invokestatic  #432                // Method execute:(Ljava/lang/Runnable;)V
        12: return
        13: astore_1
        14: nop
        15: aload_1
        16: aload_0
        17: invokevirtual #632                // Method java/util/concurrent/ForkJoinPool.submit:(Ljava/lang/Runnable;)Ljava/util/concurrent/ForkJoinTask;
        20: invokevirtual #637                // Method java/util/concurrent/ForkJoinTask.join:()Ljava/lang/Object;
        23: pop
        24: goto          43
        27: astore_2
        28: getstatic     #77                 // Field LOGGER:Ljava/util/logging/Logger;
        31: aload_2
        32: invokevirtual #280                // Method java/lang/Exception.getMessage:()Ljava/lang/String;
        35: invokedynamic #640,  0            // InvokeDynamic #18:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
        40: invokevirtual #286                // Method java/util/logging/Logger.severe:(Ljava/lang/String;)V
        43: return
      Exception table:
         from    to  target type
            14    24    27   Class java/lang/Exception
      StackMapTable: number_of_entries = 3
        frame_type = 77 /* same_locals_1_stack_item */
          stack = [ class java/util/concurrent/ForkJoinPool ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class java/lang/Runnable, class java/util/concurrent/ForkJoinPool ]
          stack = [ class java/lang/Exception ]
        frame_type = 15 /* same */
      LineNumberTable:
        line 356: 0
        line 357: 14
        line 358: 15
        line 359: 27
        line 360: 28
        line 362: 43
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           28      15     2     e   Ljava/lang/Exception;
           14      30     1  pool   Ljava/util/concurrent/ForkJoinPool;
            0      44     0  task   Ljava/lang/Runnable;
    RuntimeVisibleAnnotations:
      0: #51()
        kotlin.jvm.JvmStatic
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #13()
          org.jetbrains.annotations.NotNull

  public static final int getPathfindingQueueSize();
    descriptor: ()I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    Code:
      stack=2, locals=0, args_size=0
         0: getstatic     #17                 // Field pathfindingExecutor:Ljava/util/concurrent/ThreadPoolExecutor;
         3: dup
         4: ifnull        22
         7: invokevirtual #646                // Method java/util/concurrent/ThreadPoolExecutor.getQueue:()Ljava/util/concurrent/BlockingQueue;
        10: dup
        11: ifnull        22
        14: invokeinterface #649,  1          // InterfaceMethod java/util/concurrent/BlockingQueue.size:()I
        19: goto          24
        22: pop
        23: iconst_0
        24: ireturn
      StackMapTable: number_of_entries = 2
        frame_type = 86 /* same_locals_1_stack_item */
          stack = [ class java/lang/Object ]
        frame_type = 65 /* same_locals_1_stack_item */
          stack = [ int ]
      LineNumberTable:
        line 364: 0
    RuntimeVisibleAnnotations:
      0: #51()
        kotlin.jvm.JvmStatic

  public static final int getPathfindingActiveCount();
    descriptor: ()I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    Code:
      stack=2, locals=0, args_size=0
         0: getstatic     #17                 // Field pathfindingExecutor:Ljava/util/concurrent/ThreadPoolExecutor;
         3: dup
         4: ifnull        13
         7: invokevirtual #653                // Method java/util/concurrent/ThreadPoolExecutor.getActiveCount:()I
        10: goto          15
        13: pop
        14: iconst_0
        15: ireturn
      StackMapTable: number_of_entries = 2
        frame_type = 77 /* same_locals_1_stack_item */
          stack = [ class java/util/concurrent/ThreadPoolExecutor ]
        frame_type = 65 /* same_locals_1_stack_item */
          stack = [ int ]
      LineNumberTable:
        line 365: 0
    RuntimeVisibleAnnotations:
      0: #51()
        kotlin.jvm.JvmStatic

  public static final long getTotalTasksSubmitted();
    descriptor: ()J
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    Code:
      stack=2, locals=0, args_size=0
         0: getstatic     #459                // Field totalTasksSubmitted:Ljava/util/concurrent/atomic/LongAdder;
         3: invokevirtual #657                // Method java/util/concurrent/atomic/LongAdder.sum:()J
         6: lreturn
      LineNumberTable:
        line 366: 0
    RuntimeVisibleAnnotations:
      0: #51()
        kotlin.jvm.JvmStatic

  public static final long getTotalTasksCompleted();
    descriptor: ()J
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    Code:
      stack=2, locals=0, args_size=0
         0: getstatic     #661                // Field totalTasksCompleted:Ljava/util/concurrent/atomic/LongAdder;
         3: invokevirtual #657                // Method java/util/concurrent/atomic/LongAdder.sum:()J
         6: lreturn
      LineNumberTable:
        line 367: 0
    RuntimeVisibleAnnotations:
      0: #51()
        kotlin.jvm.JvmStatic

  public static final long getTotalTasksRejected();
    descriptor: ()J
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    Code:
      stack=2, locals=0, args_size=0
         0: getstatic     #482                // Field totalTasksRejected:Ljava/util/concurrent/atomic/LongAdder;
         3: invokevirtual #657                // Method java/util/concurrent/atomic/LongAdder.sum:()J
         6: lreturn
      LineNumberTable:
        line 368: 0
    RuntimeVisibleAnnotations:
      0: #51()
        kotlin.jvm.JvmStatic

  public static final double getAverageExecutionTimeMs();
    descriptor: ()D
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    Code:
      stack=4, locals=2, args_size=0
         0: getstatic     #661                // Field totalTasksCompleted:Ljava/util/concurrent/atomic/LongAdder;
         3: invokevirtual #657                // Method java/util/concurrent/atomic/LongAdder.sum:()J
         6: lstore_0
         7: lload_0
         8: lconst_0
         9: lcmp
        10: ifle          26
        13: getstatic     #667                // Field totalExecutionTimeMs:Ljava/util/concurrent/atomic/LongAdder;
        16: invokevirtual #657                // Method java/util/concurrent/atomic/LongAdder.sum:()J
        19: l2d
        20: lload_0
        21: l2d
        22: ddiv
        23: goto          27
        26: dconst_0
        27: dreturn
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 26
          locals = [ long ]
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ double ]
      LineNumberTable:
        line 372: 0
        line 373: 7
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            7      21     0 completed   J
    RuntimeVisibleAnnotations:
      0: #51()
        kotlin.jvm.JvmStatic

  public static final java.util.Map<java.lang.String, java.lang.Object> getMetrics();
    descriptor: ()Ljava/util/Map;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    Code:
      stack=5, locals=17, args_size=0
         0: getstatic     #205                // Field instantExecutors:[Ljava/util/concurrent/ThreadPoolExecutor;
         3: dup
         4: ifnonnull     12
         7: pop
         8: iconst_0
         9: anewarray     #171                // class java/util/concurrent/ThreadPoolExecutor
        12: astore_0
        13: getstatic     #73                 // Field scheduledExecutors:[Ljava/util/concurrent/ScheduledThreadPoolExecutor;
        16: dup
        17: ifnonnull     25
        20: pop
        21: iconst_0
        22: anewarray     #130                // class java/util/concurrent/ScheduledThreadPoolExecutor
        25: astore_1
        26: getstatic     #17                 // Field pathfindingExecutor:Ljava/util/concurrent/ThreadPoolExecutor;
        29: astore_2
        30: aload_0
        31: astore        4
        33: iconst_0
        34: istore        5
        36: iconst_0
        37: istore        6
        39: aload         4
        41: arraylength
        42: istore        7
        44: iload         6
        46: iload         7
        48: if_icmpge     89
        51: aload         4
        53: iload         6
        55: aaload
        56: astore        8
        58: iload         5
        60: aload         8
        62: astore        9
        64: istore        12
        66: iconst_0
        67: istore        10
        69: aload         9
        71: invokevirtual #674                // Method java/util/concurrent/ThreadPoolExecutor.getMaximumPoolSize:()I
        74: istore        13
        76: iload         12
        78: iload         13
        80: iadd
        81: istore        5
        83: iinc          6, 1
        86: goto          44
        89: iload         5
        91: istore_3
        92: bipush        17
        94: anewarray     #676                // class kotlin/Pair
        97: astore        4
        99: aload         4
       101: iconst_0
       102: ldc_w         #678                // String tasksSubmitted
       105: getstatic     #459                // Field totalTasksSubmitted:Ljava/util/concurrent/atomic/LongAdder;
       108: invokevirtual #657                // Method java/util/concurrent/atomic/LongAdder.sum:()J
       111: invokestatic  #684                // Method java/lang/Long.valueOf:(J)Ljava/lang/Long;
       114: invokestatic  #690                // Method kotlin/TuplesKt.to:(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
       117: aastore
       118: aload         4
       120: iconst_1
       121: ldc_w         #692                // String tasksCompleted
       124: getstatic     #661                // Field totalTasksCompleted:Ljava/util/concurrent/atomic/LongAdder;
       127: invokevirtual #657                // Method java/util/concurrent/atomic/LongAdder.sum:()J
       130: invokestatic  #684                // Method java/lang/Long.valueOf:(J)Ljava/lang/Long;
       133: invokestatic  #690                // Method kotlin/TuplesKt.to:(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
       136: aastore
       137: aload         4
       139: iconst_2
       140: ldc_w         #694                // String tasksRejected
       143: getstatic     #482                // Field totalTasksRejected:Ljava/util/concurrent/atomic/LongAdder;
       146: invokevirtual #657                // Method java/util/concurrent/atomic/LongAdder.sum:()J
       149: invokestatic  #684                // Method java/lang/Long.valueOf:(J)Ljava/lang/Long;
       152: invokestatic  #690                // Method kotlin/TuplesKt.to:(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
       155: aastore
       156: aload         4
       158: iconst_3
       159: ldc_w         #696                // String averageLatency
       162: invokestatic  #698                // Method getAverageExecutionTimeMs:()D
       165: invokestatic  #703                // Method java/lang/Double.valueOf:(D)Ljava/lang/Double;
       168: invokestatic  #690                // Method kotlin/TuplesKt.to:(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
       171: aastore
       172: aload         4
       174: iconst_4
       175: ldc_w         #705                // String scheduledPools
       178: aload_1
       179: arraylength
       180: invokestatic  #710                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       183: invokestatic  #690                // Method kotlin/TuplesKt.to:(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
       186: aastore
       187: aload         4
       189: iconst_5
       190: ldc_w         #712                // String scheduledQueueSize
       193: aload_1
       194: astore        5
       196: astore        14
       198: istore        13
       200: astore        12
       202: iconst_0
       203: istore        6
       205: iconst_0
       206: istore        7
       208: aload         5
       210: arraylength
       211: istore        8
       213: iload         7
       215: iload         8
       217: if_icmpge     263
       220: aload         5
       222: iload         7
       224: aaload
       225: astore        9
       227: iload         6
       229: aload         9
       231: astore        10
       233: istore        15
       235: iconst_0
       236: istore        11
       238: aload         10
       240: invokevirtual #713                // Method java/util/concurrent/ScheduledThreadPoolExecutor.getQueue:()Ljava/util/concurrent/BlockingQueue;
       243: invokeinterface #649,  1          // InterfaceMethod java/util/concurrent/BlockingQueue.size:()I
       248: istore        16
       250: iload         15
       252: iload         16
       254: iadd
       255: istore        6
       257: iinc          7, 1
       260: goto          213
       263: iload         6
       265: istore        15
       267: aload         12
       269: iload         13
       271: aload         14
       273: iload         15
       275: invokestatic  #710                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       278: invokestatic  #690                // Method kotlin/TuplesKt.to:(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
       281: aastore
       282: aload         4
       284: bipush        6
       286: ldc_w         #715                // String instantPools
       289: aload_0
       290: arraylength
       291: invokestatic  #710                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       294: invokestatic  #690                // Method kotlin/TuplesKt.to:(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
       297: aastore
       298: aload         4
       300: bipush        7
       302: ldc_w         #717                // String instantPoolsSize
       305: iload_3
       306: invokestatic  #710                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       309: invokestatic  #690                // Method kotlin/TuplesKt.to:(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
       312: aastore
       313: aload         4
       315: bipush        8
       317: ldc_w         #719                // String instantPoolsActive
       320: aload_0
       321: astore        5
       323: astore        14
       325: istore        13
       327: astore        12
       329: iconst_0
       330: istore        6
       332: iconst_0
       333: istore        7
       335: aload         5
       337: arraylength
       338: istore        8
       340: iload         7
       342: iload         8
       344: if_icmpge     385
       347: aload         5
       349: iload         7
       351: aaload
       352: astore        9
       354: iload         6
       356: aload         9
       358: astore        10
       360: istore        15
       362: iconst_0
       363: istore        11
       365: aload         10
       367: invokevirtual #653                // Method java/util/concurrent/ThreadPoolExecutor.getActiveCount:()I
       370: istore        16
       372: iload         15
       374: iload         16
       376: iadd
       377: istore        6
       379: iinc          7, 1
       382: goto          340
       385: iload         6
       387: istore        15
       389: aload         12
       391: iload         13
       393: aload         14
       395: iload         15
       397: invokestatic  #710                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       400: invokestatic  #690                // Method kotlin/TuplesKt.to:(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
       403: aastore
       404: aload         4
       406: bipush        9
       408: ldc_w         #721                // String instantPoolsQueueSize
       411: aload_0
       412: astore        5
       414: astore        14
       416: istore        13
       418: astore        12
       420: iconst_0
       421: istore        6
       423: iconst_0
       424: istore        7
       426: aload         5
       428: arraylength
       429: istore        8
       431: iload         7
       433: iload         8
       435: if_icmpge     481
       438: aload         5
       440: iload         7
       442: aaload
       443: astore        9
       445: iload         6
       447: aload         9
       449: astore        10
       451: istore        15
       453: iconst_0
       454: istore        11
       456: aload         10
       458: invokevirtual #646                // Method java/util/concurrent/ThreadPoolExecutor.getQueue:()Ljava/util/concurrent/BlockingQueue;
       461: invokeinterface #649,  1          // InterfaceMethod java/util/concurrent/BlockingQueue.size:()I
       466: istore        16
       468: iload         15
       470: iload         16
       472: iadd
       473: istore        6
       475: iinc          7, 1
       478: goto          431
       481: iload         6
       483: istore        15
       485: aload         12
       487: iload         13
       489: aload         14
       491: iload         15
       493: invokestatic  #710                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       496: invokestatic  #690                // Method kotlin/TuplesKt.to:(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
       499: aastore
       500: aload         4
       502: bipush        10
       504: ldc_w         #723                // String pathfindingSize
       507: aload_2
       508: dup
       509: ifnull        518
       512: invokevirtual #674                // Method java/util/concurrent/ThreadPoolExecutor.getMaximumPoolSize:()I
       515: goto          520
       518: pop
       519: iconst_0
       520: invokestatic  #710                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       523: invokestatic  #690                // Method kotlin/TuplesKt.to:(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
       526: aastore
       527: aload         4
       529: bipush        11
       531: ldc_w         #725                // String pathfindingActive
       534: invokestatic  #727                // Method getPathfindingActiveCount:()I
       537: invokestatic  #710                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       540: invokestatic  #690                // Method kotlin/TuplesKt.to:(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
       543: aastore
       544: aload         4
       546: bipush        12
       548: ldc_w         #729                // String pathfindingQueueSize
       551: invokestatic  #731                // Method getPathfindingQueueSize:()I
       554: invokestatic  #710                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       557: invokestatic  #690                // Method kotlin/TuplesKt.to:(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
       560: aastore
       561: aload         4
       563: bipush        13
       565: ldc_w         #732                // String pathfindingTasksSubmitted
       568: getstatic     #564                // Field pathfindingTasksSubmitted:Ljava/util/concurrent/atomic/LongAdder;
       571: invokevirtual #657                // Method java/util/concurrent/atomic/LongAdder.sum:()J
       574: invokestatic  #684                // Method java/lang/Long.valueOf:(J)Ljava/lang/Long;
       577: invokestatic  #690                // Method kotlin/TuplesKt.to:(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
       580: aastore
       581: aload         4
       583: bipush        14
       585: ldc_w         #734                // String pathfindingTasksCompleted
       588: getstatic     #736                // Field pathfindingTasksCompleted:Ljava/util/concurrent/atomic/LongAdder;
       591: invokevirtual #657                // Method java/util/concurrent/atomic/LongAdder.sum:()J
       594: invokestatic  #684                // Method java/lang/Long.valueOf:(J)Ljava/lang/Long;
       597: invokestatic  #690                // Method kotlin/TuplesKt.to:(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
       600: aastore
       601: aload         4
       603: bipush        15
       605: ldc_w         #738                // String smartRoutesTracked
       608: getstatic     #402                // Field taskRoutingHistory:Ljava/util/concurrent/ConcurrentHashMap;
       611: invokevirtual #739                // Method java/util/concurrent/ConcurrentHashMap.size:()I
       614: invokestatic  #710                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       617: invokestatic  #690                // Method kotlin/TuplesKt.to:(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
       620: aastore
       621: aload         4
       623: bipush        16
       625: ldc_w         #741                // String tasksInVirtualRoute
       628: getstatic     #402                // Field taskRoutingHistory:Ljava/util/concurrent/ConcurrentHashMap;
       631: invokevirtual #745                // Method java/util/concurrent/ConcurrentHashMap.values:()Ljava/util/Collection;
       634: checkcast     #747                // class java/lang/Iterable
       637: astore        5
       639: astore        14
       641: istore        13
       643: astore        12
       645: iconst_0
       646: istore        6
       648: aload         5
       650: instanceof    #749                // class java/util/Collection
       653: ifeq          673
       656: aload         5
       658: checkcast     #749                // class java/util/Collection
       661: invokeinterface #752,  1          // InterfaceMethod java/util/Collection.isEmpty:()Z
       666: ifeq          673
       669: iconst_0
       670: goto          746
       673: iconst_0
       674: istore        7
       676: aload         5
       678: invokeinterface #756,  1          // InterfaceMethod java/lang/Iterable.iterator:()Ljava/util/Iterator;
       683: astore        8
       685: aload         8
       687: invokeinterface #761,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       692: ifeq          744
       695: aload         8
       697: invokeinterface #764,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       702: astore        9
       704: aload         9
       706: checkcast     #404                // class ext/mods/commons/pool/CoroutinePool$ExecutionRoute
       709: astore        10
       711: iconst_0
       712: istore        11
       714: aload         10
       716: getstatic     #767                // Field ext/mods/commons/pool/CoroutinePool$ExecutionRoute.VIRTUAL:Lext/mods/commons/pool/CoroutinePool$ExecutionRoute;
       719: if_acmpne     726
       722: iconst_1
       723: goto          727
       726: iconst_0
       727: ifeq          685
       730: iinc          7, 1
       733: iload         7
       735: ifge          685
       738: invokestatic  #772                // Method kotlin/collections/CollectionsKt.throwCountOverflow:()V
       741: goto          685
       744: iload         7
       746: istore        15
       748: aload         12
       750: iload         13
       752: aload         14
       754: iload         15
       756: invokestatic  #710                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       759: invokestatic  #690                // Method kotlin/TuplesKt.to:(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
       762: aastore
       763: aload         4
       765: invokestatic  #778                // Method kotlin/collections/MapsKt.mapOf:([Lkotlin/Pair;)Ljava/util/Map;
       768: areturn
      StackMapTable: number_of_entries = 18
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class "[Ljava/util/concurrent/ThreadPoolExecutor;" ]
        frame_type = 255 /* full_frame */
          offset_delta = 12
          locals = [ class "[Ljava/util/concurrent/ThreadPoolExecutor;" ]
          stack = [ class "[Ljava/util/concurrent/ScheduledThreadPoolExecutor;" ]
        frame_type = 255 /* full_frame */
          offset_delta = 18
          locals = [ class "[Ljava/util/concurrent/ThreadPoolExecutor;", class "[Ljava/util/concurrent/ScheduledThreadPoolExecutor;", class java/util/concurrent/ThreadPoolExecutor, top, class "[Ljava/util/concurrent/ThreadPoolExecutor;", int, int, int ]
          stack = []
        frame_type = 44 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 123
          locals = [ class "[Ljava/util/concurrent/ThreadPoolExecutor;", class "[Ljava/util/concurrent/ScheduledThreadPoolExecutor;", class java/util/concurrent/ThreadPoolExecutor, int, class "[Lkotlin/Pair;", class "[Ljava/util/concurrent/ScheduledThreadPoolExecutor;", int, int, int, top, top, top, class "[Lkotlin/Pair;", int, class java/lang/String ]
          stack = []
        frame_type = 49 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 76
          locals = [ class "[Ljava/util/concurrent/ThreadPoolExecutor;", class "[Ljava/util/concurrent/ScheduledThreadPoolExecutor;", class java/util/concurrent/ThreadPoolExecutor, int, class "[Lkotlin/Pair;", class "[Ljava/util/concurrent/ThreadPoolExecutor;", int, int, int, top, top, top, class "[Lkotlin/Pair;", int, class java/lang/String, int ]
          stack = []
        frame_type = 44 /* same */
        frame_type = 45 /* same */
        frame_type = 49 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 36
          locals = [ class "[Ljava/util/concurrent/ThreadPoolExecutor;", class "[Ljava/util/concurrent/ScheduledThreadPoolExecutor;", class java/util/concurrent/ThreadPoolExecutor, int, class "[Lkotlin/Pair;", class "[Ljava/util/concurrent/ThreadPoolExecutor;", int, int, int, top, top, top, class "[Lkotlin/Pair;", int, class java/lang/String, int ]
          stack = [ class "[Lkotlin/Pair;", int, class java/lang/String, class java/util/concurrent/ThreadPoolExecutor ]
        frame_type = 255 /* full_frame */
          offset_delta = 1
          locals = [ class "[Ljava/util/concurrent/ThreadPoolExecutor;", class "[Ljava/util/concurrent/ScheduledThreadPoolExecutor;", class java/util/concurrent/ThreadPoolExecutor, int, class "[Lkotlin/Pair;", class "[Ljava/util/concurrent/ThreadPoolExecutor;", int, int, int, top, top, top, class "[Lkotlin/Pair;", int, class java/lang/String, int ]
          stack = [ class "[Lkotlin/Pair;", int, class java/lang/String, int ]
        frame_type = 255 /* full_frame */
          offset_delta = 152
          locals = [ class "[Ljava/util/concurrent/ThreadPoolExecutor;", class "[Ljava/util/concurrent/ScheduledThreadPoolExecutor;", class java/util/concurrent/ThreadPoolExecutor, int, class "[Lkotlin/Pair;", class java/lang/Iterable, int, int, int, top, top, top, class "[Lkotlin/Pair;", int, class java/lang/String, int ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 11
          locals = [ class "[Ljava/util/concurrent/ThreadPoolExecutor;", class "[Ljava/util/concurrent/ScheduledThreadPoolExecutor;", class java/util/concurrent/ThreadPoolExecutor, int, class "[Lkotlin/Pair;", class java/lang/Iterable, int, int, class java/util/Iterator, top, top, top, class "[Lkotlin/Pair;", int, class java/lang/String, int ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 40
          locals = [ class "[Ljava/util/concurrent/ThreadPoolExecutor;", class "[Ljava/util/concurrent/ScheduledThreadPoolExecutor;", class java/util/concurrent/ThreadPoolExecutor, int, class "[Lkotlin/Pair;", class java/lang/Iterable, int, int, class java/util/Iterator, class java/lang/Object, class ext/mods/commons/pool/CoroutinePool$ExecutionRoute, int, class "[Lkotlin/Pair;", int, class java/lang/String, int ]
          stack = []
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class "[Ljava/util/concurrent/ThreadPoolExecutor;", class "[Ljava/util/concurrent/ScheduledThreadPoolExecutor;", class java/util/concurrent/ThreadPoolExecutor, int, class "[Lkotlin/Pair;", class java/lang/Iterable, int, int, class java/util/Iterator, top, top, top, class "[Lkotlin/Pair;", int, class java/lang/String, int ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 1
          locals = [ class "[Ljava/util/concurrent/ThreadPoolExecutor;", class "[Ljava/util/concurrent/ScheduledThreadPoolExecutor;", class java/util/concurrent/ThreadPoolExecutor, int, class "[Lkotlin/Pair;", class java/lang/Iterable, int, int, top, top, top, top, class "[Lkotlin/Pair;", int, class java/lang/String, int ]
          stack = [ int ]
      LineNumberTable:
        line 378: 0
        line 379: 13
        line 380: 26
        line 381: 30
        line 439: 64
        line 381: 69
        line 381: 80
        line 381: 91
        line 384: 92
        line 385: 121
        line 384: 137
        line 386: 140
        line 384: 156
        line 387: 159
        line 384: 172
        line 388: 175
        line 384: 187
        line 389: 190
        line 439: 233
        line 389: 238
        line 389: 254
        line 389: 278
        line 384: 282
        line 390: 286
        line 384: 298
        line 391: 302
        line 384: 313
        line 392: 317
        line 439: 360
        line 392: 365
        line 392: 376
        line 392: 400
        line 384: 404
        line 393: 408
        line 439: 451
        line 393: 456
        line 393: 472
        line 393: 496
        line 384: 500
        line 394: 504
        line 384: 527
        line 395: 531
        line 384: 544
        line 396: 548
        line 384: 561
        line 397: 565
        line 384: 581
        line 398: 585
        line 384: 601
        line 399: 605
        line 384: 621
        line 400: 625
        line 440: 648
        line 441: 673
        line 442: 676
        line 400: 714
        line 442: 727
        line 443: 744
        line 400: 759
        line 384: 763
        line 383: 765
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           69       5    10 $i$a$-sumOfInt-CoroutinePool$getMetrics$totalInstantCapacity$1   I
           66       8     9    it   Ljava/util/concurrent/ThreadPoolExecutor;
          238      10    11 $i$a$-sumOfInt-CoroutinePool$getMetrics$1   I
          235      13    10    it   Ljava/util/concurrent/ScheduledThreadPoolExecutor;
          365       5    11 $i$a$-sumOfInt-CoroutinePool$getMetrics$2   I
          362       8    10    it   Ljava/util/concurrent/ThreadPoolExecutor;
          456      10    11 $i$a$-sumOfInt-CoroutinePool$getMetrics$3   I
          453      13    10    it   Ljava/util/concurrent/ThreadPoolExecutor;
          714      13    11 $i$a$-count-CoroutinePool$getMetrics$4   I
          711      16    10    it   Lext/mods/commons/pool/CoroutinePool$ExecutionRoute;
          704      37     9 element$iv   Ljava/lang/Object;
          648      98     6 $i$f$count   I
          676      70     7 count$iv   I
          645     101     5 $this$count$iv   Ljava/lang/Iterable;
           13     756     0 instantPools   [Ljava/util/concurrent/ThreadPoolExecutor;
           26     743     1 scheduledPools   [Ljava/util/concurrent/ScheduledThreadPoolExecutor;
           30     739     2 pfExecutor   Ljava/util/concurrent/ThreadPoolExecutor;
           92     677     3 totalInstantCapacity   I
    Signature: #671                         // ()Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;
    RuntimeVisibleAnnotations:
      0: #51()
        kotlin.jvm.JvmStatic
    RuntimeInvisibleAnnotations:
      0: #13()
        org.jetbrains.annotations.NotNull

  public static final void printMetrics();
    descriptor: ()V
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    Code:
      stack=3, locals=9, args_size=0
         0: invokestatic  #794                // Method getMetrics:()Ljava/util/Map;
         3: astore_0
         4: getstatic     #77                 // Field LOGGER:Ljava/util/logging/Logger;
         7: ldc_w         #796                // String === CoroutinePool Metrics ===
        10: invokevirtual #216                // Method java/util/logging/Logger.info:(Ljava/lang/String;)V
        13: aload_0
        14: astore_1
        15: iconst_0
        16: istore_2
        17: aload_1
        18: invokeinterface #802,  1          // InterfaceMethod java/util/Map.entrySet:()Ljava/util/Set;
        23: invokeinterface #805,  1          // InterfaceMethod java/util/Set.iterator:()Ljava/util/Iterator;
        28: astore_3
        29: aload_3
        30: invokeinterface #761,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        35: ifeq          96
        38: aload_3
        39: invokeinterface #764,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        44: checkcast     #807                // class java/util/Map$Entry
        47: astore        4
        49: aload         4
        51: astore        5
        53: iconst_0
        54: istore        6
        56: aload         5
        58: invokeinterface #810,  1          // InterfaceMethod java/util/Map$Entry.getKey:()Ljava/lang/Object;
        63: checkcast     #319                // class java/lang/String
        66: astore        7
        68: aload         5
        70: invokeinterface #813,  1          // InterfaceMethod java/util/Map$Entry.getValue:()Ljava/lang/Object;
        75: astore        8
        77: getstatic     #77                 // Field LOGGER:Ljava/util/logging/Logger;
        80: aload         7
        82: aload         8
        84: invokedynamic #818,  0            // InvokeDynamic #19:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
        89: invokevirtual #216                // Method java/util/logging/Logger.info:(Ljava/lang/String;)V
        92: nop
        93: goto          29
        96: nop
        97: return
      StackMapTable: number_of_entries = 2
        frame_type = 255 /* full_frame */
          offset_delta = 29
          locals = [ class java/util/Map, class java/util/Map, int, class java/util/Iterator ]
          stack = []
        frame_type = 251 /* same_frame_extended */
          offset_delta = 66
      LineNumberTable:
        line 406: 0
        line 407: 4
        line 408: 13
        line 444: 17
        line 444: 28
        line 408: 77
        line 444: 92
        line 445: 96
        line 409: 97
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           56      36     6 $i$a$-forEach-CoroutinePool$printMetrics$1   I
           68      24     7   key   Ljava/lang/String;
           77      15     8 value   Ljava/lang/Object;
           49      44     4 element$iv   Ljava/util/Map$Entry;
           17      80     2 $i$f$forEach   I
           15      82     1 $this$forEach$iv   Ljava/util/Map;
            4      94     0 metrics   Ljava/util/Map;
    RuntimeVisibleAnnotations:
      0: #51()
        kotlin.jvm.JvmStatic

  public static final void shutdown();
    descriptor: ()V
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    Code:
      stack=4, locals=8, args_size=0
         0: getstatic     #73                 // Field scheduledExecutors:[Ljava/util/concurrent/ScheduledThreadPoolExecutor;
         3: ifnonnull     7
         6: return
         7: nop
         8: getstatic     #77                 // Field LOGGER:Ljava/util/logging/Logger;
        11: ldc_w         #837                // String Desligando CoroutinePool...
        14: invokevirtual #216                // Method java/util/logging/Logger.info:(Ljava/lang/String;)V
        17: getstatic     #612                // Field BackgroundScope:Lkotlinx/coroutines/CoroutineScope;
        20: aconst_null
        21: iconst_1
        22: aconst_null
        23: invokestatic  #843                // Method kotlinx/coroutines/CoroutineScopeKt.cancel$default:(Lkotlinx/coroutines/CoroutineScope;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V
        26: getstatic     #73                 // Field scheduledExecutors:[Ljava/util/concurrent/ScheduledThreadPoolExecutor;
        29: dup
        30: ifnull        76
        33: astore_1
        34: iconst_0
        35: istore_2
        36: iconst_0
        37: istore_3
        38: aload_1
        39: arraylength
        40: istore        4
        42: iload_3
        43: iload         4
        45: if_icmpge     72
        48: aload_1
        49: iload_3
        50: aaload
        51: astore        5
        53: aload         5
        55: astore        6
        57: iconst_0
        58: istore        7
        60: aload         6
        62: invokevirtual #845                // Method java/util/concurrent/ScheduledThreadPoolExecutor.shutdown:()V
        65: nop
        66: iinc          3, 1
        69: goto          42
        72: nop
        73: goto          78
        76: pop
        77: nop
        78: getstatic     #205                // Field instantExecutors:[Ljava/util/concurrent/ThreadPoolExecutor;
        81: dup
        82: ifnull        128
        85: astore_1
        86: iconst_0
        87: istore_2
        88: iconst_0
        89: istore_3
        90: aload_1
        91: arraylength
        92: istore        4
        94: iload_3
        95: iload         4
        97: if_icmpge     124
       100: aload_1
       101: iload_3
       102: aaload
       103: astore        5
       105: aload         5
       107: astore        6
       109: iconst_0
       110: istore        7
       112: aload         6
       114: invokevirtual #846                // Method java/util/concurrent/ThreadPoolExecutor.shutdown:()V
       117: nop
       118: iinc          3, 1
       121: goto          94
       124: nop
       125: goto          130
       128: pop
       129: nop
       130: getstatic     #17                 // Field pathfindingExecutor:Ljava/util/concurrent/ThreadPoolExecutor;
       133: dup
       134: ifnull        143
       137: invokevirtual #846                // Method java/util/concurrent/ThreadPoolExecutor.shutdown:()V
       140: goto          144
       143: pop
       144: getstatic     #220                // Field virtualExecutor:Ljava/util/concurrent/ExecutorService;
       147: dup
       148: ifnull        159
       151: invokeinterface #847,  1          // InterfaceMethod java/util/concurrent/ExecutorService.shutdown:()V
       156: goto          160
       159: pop
       160: getstatic     #244                // Field forkJoinPool:Ljava/util/concurrent/ForkJoinPool;
       163: dup
       164: ifnull        173
       167: invokevirtual #848                // Method java/util/concurrent/ForkJoinPool.shutdown:()V
       170: goto          174
       173: pop
       174: aconst_null
       175: putstatic     #73                 // Field scheduledExecutors:[Ljava/util/concurrent/ScheduledThreadPoolExecutor;
       178: aconst_null
       179: putstatic     #205                // Field instantExecutors:[Ljava/util/concurrent/ThreadPoolExecutor;
       182: aconst_null
       183: putstatic     #17                 // Field pathfindingExecutor:Ljava/util/concurrent/ThreadPoolExecutor;
       186: aconst_null
       187: putstatic     #220                // Field virtualExecutor:Ljava/util/concurrent/ExecutorService;
       190: aconst_null
       191: putstatic     #244                // Field forkJoinPool:Ljava/util/concurrent/ForkJoinPool;
       194: getstatic     #402                // Field taskRoutingHistory:Ljava/util/concurrent/ConcurrentHashMap;
       197: invokevirtual #851                // Method java/util/concurrent/ConcurrentHashMap.clear:()V
       200: getstatic     #77                 // Field LOGGER:Ljava/util/logging/Logger;
       203: ldc_w         #853                // String CoroutinePool desligado.
       206: invokevirtual #216                // Method java/util/logging/Logger.info:(Ljava/lang/String;)V
       209: goto          228
       212: astore_0
       213: getstatic     #77                 // Field LOGGER:Ljava/util/logging/Logger;
       216: aload_0
       217: invokevirtual #280                // Method java/lang/Exception.getMessage:()Ljava/lang/String;
       220: invokedynamic #856,  0            // InvokeDynamic #20:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       225: invokevirtual #286                // Method java/util/logging/Logger.severe:(Ljava/lang/String;)V
       228: return
      Exception table:
         from    to  target type
             7   209   212   Class java/lang/Exception
      StackMapTable: number_of_entries = 17
        frame_type = 7 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 34
          locals = [ top, class "[Ljava/util/concurrent/ScheduledThreadPoolExecutor;", int, int, int ]
          stack = []
        frame_type = 29 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 3
          locals = []
          stack = [ class "[Ljava/util/concurrent/ScheduledThreadPoolExecutor;" ]
        frame_type = 1 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 15
          locals = [ top, class "[Ljava/util/concurrent/ThreadPoolExecutor;", int, int, int ]
          stack = []
        frame_type = 29 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 3
          locals = []
          stack = [ class "[Ljava/util/concurrent/ThreadPoolExecutor;" ]
        frame_type = 1 /* same */
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/util/concurrent/ThreadPoolExecutor ]
        frame_type = 0 /* same */
        frame_type = 78 /* same_locals_1_stack_item */
          stack = [ class java/util/concurrent/ExecutorService ]
        frame_type = 0 /* same */
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/util/concurrent/ForkJoinPool ]
        frame_type = 0 /* same */
        frame_type = 101 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 15 /* same */
      LineNumberTable:
        line 415: 0
        line 416: 7
        line 417: 8
        line 418: 17
        line 419: 26
        line 446: 36
        line 419: 60
        line 446: 65
        line 447: 72
        line 419: 76
        line 420: 78
        line 448: 88
        line 420: 112
        line 448: 117
        line 449: 124
        line 420: 128
        line 421: 130
        line 422: 144
        line 423: 160
        line 425: 174
        line 426: 178
        line 427: 182
        line 428: 186
        line 429: 190
        line 430: 194
        line 431: 200
        line 432: 212
        line 433: 213
        line 435: 228
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           60       5     7 $i$a$-forEach-CoroutinePool$shutdown$1   I
           57       8     6    it   Ljava/util/concurrent/ScheduledThreadPoolExecutor;
           53      13     5 element$iv   Ljava/lang/Object;
           36      37     2 $i$f$forEach   I
           34      39     1 $this$forEach$iv   [Ljava/lang/Object;
          112       5     7 $i$a$-forEach-CoroutinePool$shutdown$2   I
          109       8     6    it   Ljava/util/concurrent/ThreadPoolExecutor;
          105      13     5 element$iv   Ljava/lang/Object;
           88      37     2 $i$f$forEach   I
           86      39     1 $this$forEach$iv   [Ljava/lang/Object;
          213      15     0     e   Ljava/lang/Exception;
    RuntimeVisibleAnnotations:
      0: #51()
        kotlin.jvm.JvmStatic

  public static final java.util.logging.Logger access$getLOGGER$p();
    descriptor: ()Ljava/util/logging/Logger;
    flags: (0x1019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_SYNTHETIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #77                 // Field LOGGER:Ljava/util/logging/Logger;
         3: areturn
      LineNumberTable:
        line 36: 0

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: new           #2                  // class ext/mods/commons/pool/CoroutinePool
         3: dup
         4: invokespecial #990                // Method "<init>":()V
         7: putstatic     #88                 // Field INSTANCE:Lext/mods/commons/pool/CoroutinePool;
        10: ldc           #2                  // class ext/mods/commons/pool/CoroutinePool
        12: invokevirtual #993                // Method java/lang/Class.getName:()Ljava/lang/String;
        15: invokestatic  #997                // Method java/util/logging/Logger.getLogger:(Ljava/lang/String;)Ljava/util/logging/Logger;
        18: putstatic     #77                 // Field LOGGER:Ljava/util/logging/Logger;
        21: invokestatic  #32                 // Method kotlinx/coroutines/Dispatchers.getDefault:()Lkotlinx/coroutines/CoroutineDispatcher;
        24: aconst_null
        25: iconst_1
        26: aconst_null
        27: invokestatic  #1003               // Method kotlinx/coroutines/SupervisorKt.SupervisorJob$default:(Lkotlinx/coroutines/Job;ILjava/lang/Object;)Lkotlinx/coroutines/CompletableJob;
        30: checkcast     #614                // class kotlin/coroutines/CoroutineContext
        33: invokevirtual #1007               // Method kotlinx/coroutines/CoroutineDispatcher.plus:(Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;
        36: invokestatic  #1011               // Method kotlinx/coroutines/CoroutineScopeKt.CoroutineScope:(Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/CoroutineScope;
        39: putstatic     #612                // Field BackgroundScope:Lkotlinx/coroutines/CoroutineScope;
        42: new           #495                // class ext/mods/commons/pool/RejectedExecutionHandlerOptimized
        45: dup
        46: invokespecial #1012               // Method ext/mods/commons/pool/RejectedExecutionHandlerOptimized."<init>":()V
        49: putstatic     #193                // Field rejectedHandler:Lext/mods/commons/pool/RejectedExecutionHandlerOptimized;
        52: new           #461                // class java/util/concurrent/atomic/LongAdder
        55: dup
        56: invokespecial #1013               // Method java/util/concurrent/atomic/LongAdder."<init>":()V
        59: putstatic     #459                // Field totalTasksSubmitted:Ljava/util/concurrent/atomic/LongAdder;
        62: new           #461                // class java/util/concurrent/atomic/LongAdder
        65: dup
        66: invokespecial #1013               // Method java/util/concurrent/atomic/LongAdder."<init>":()V
        69: putstatic     #661                // Field totalTasksCompleted:Ljava/util/concurrent/atomic/LongAdder;
        72: new           #461                // class java/util/concurrent/atomic/LongAdder
        75: dup
        76: invokespecial #1013               // Method java/util/concurrent/atomic/LongAdder."<init>":()V
        79: putstatic     #482                // Field totalTasksRejected:Ljava/util/concurrent/atomic/LongAdder;
        82: new           #461                // class java/util/concurrent/atomic/LongAdder
        85: dup
        86: invokespecial #1013               // Method java/util/concurrent/atomic/LongAdder."<init>":()V
        89: putstatic     #667                // Field totalExecutionTimeMs:Ljava/util/concurrent/atomic/LongAdder;
        92: new           #461                // class java/util/concurrent/atomic/LongAdder
        95: dup
        96: invokespecial #1013               // Method java/util/concurrent/atomic/LongAdder."<init>":()V
        99: putstatic     #564                // Field pathfindingTasksSubmitted:Ljava/util/concurrent/atomic/LongAdder;
       102: new           #461                // class java/util/concurrent/atomic/LongAdder
       105: dup
       106: invokespecial #1013               // Method java/util/concurrent/atomic/LongAdder."<init>":()V
       109: putstatic     #736                // Field pathfindingTasksCompleted:Ljava/util/concurrent/atomic/LongAdder;
       112: new           #410                // class java/util/concurrent/ConcurrentHashMap
       115: dup
       116: invokespecial #1014               // Method java/util/concurrent/ConcurrentHashMap."<init>":()V
       119: putstatic     #402                // Field taskRoutingHistory:Ljava/util/concurrent/ConcurrentHashMap;
       122: iconst_1
       123: putstatic     #38                 // Field ENABLE_PROFILER:Z
       126: ldc2_w        #1015               // long 50l
       129: putstatic     #47                 // Field BOTTLENECK_THRESHOLD_MS:J
       132: new           #4                  // class java/lang/Object
       135: dup
       136: invokespecial #8                  // Method java/lang/Object."<init>":()V
       139: putstatic     #861                // Field fileWriteLock:Ljava/lang/Object;
       142: ldc_w         #1018               // String yyyy-MM-dd HH:mm:ss.SSS
       145: invokestatic  #1024               // Method java/time/format/DateTimeFormatter.ofPattern:(Ljava/lang/String;)Ljava/time/format/DateTimeFormatter;
       148: putstatic     #871                // Field dateFormatter:Ljava/time/format/DateTimeFormatter;
       151: return
      LineNumberTable:
        line 37: 10
        line 43: 21
        line 48: 42
        line 49: 52
        line 50: 62
        line 51: 72
        line 52: 82
        line 53: 92
        line 54: 102
        line 58: 112
        line 62: 122
        line 63: 126
        line 66: 132
        line 67: 142
}
InnerClasses:
  public static final #1052= #404 of #2;  // ExecutionRoute=class ext/mods/commons/pool/CoroutinePool$ExecutionRoute of class ext/mods/commons/pool/CoroutinePool
  public static final #1054= #424 of #2;  // WhenMappings=class ext/mods/commons/pool/CoroutinePool$WhenMappings of class ext/mods/commons/pool/CoroutinePool
  static final #616;                      // class ext/mods/commons/pool/CoroutinePool$executeParallel$1
  public static final #521= #526 of #520; // Companion=class ext/mods/commons/pool/ScheduledFutureTask$Companion of class ext/mods/commons/pool/ScheduledFutureTask
  public static #1059= #1056 of #1058;    // UncaughtExceptionHandler=class java/lang/Thread$UncaughtExceptionHandler of class java/lang/Thread
  public static #1062= #1061 of #233;     // ForkJoinWorkerThreadFactory=class java/util/concurrent/ForkJoinPool$ForkJoinWorkerThreadFactory of class java/util/concurrent/ForkJoinPool
  public static #1063= #227 of #171;      // CallerRunsPolicy=class java/util/concurrent/ThreadPoolExecutor$CallerRunsPolicy of class java/util/concurrent/ThreadPoolExecutor
  public static #1064= #807 of #798;      // Entry=class java/util/Map$Entry of class java/util/Map
SourceFile: "CoroutinePool.kt"
SourceDebugExtension:
  SMAP
  CoroutinePool.kt
  Kotlin
  *S Kotlin
  *F
  + 1 CoroutinePool.kt
  ext/mods/commons/pool/CoroutinePool
  + 2 _Arrays.kt
  kotlin/collections/ArraysKt___ArraysKt
  + 3 fake.kt
  kotlin/jvm/internal/FakeKt
  + 4 _Collections.kt
  kotlin/collections/CollectionsKt___CollectionsKt
  + 5 _Maps.kt
  kotlin/collections/MapsKt___MapsKt
  *L
  1#1,436:1
  1401#2,2:437
  14060#2,2:446
  14060#2,2:448
  1#3:439
  1834#4,4:440
  221#5,2:444
  *S KotlinDebug
  *F
  + 1 CoroutinePool.kt
  ext/mods/commons/pool/CoroutinePool
  *L
  195#1:437,2
  419#1:446,2
  420#1:448,2
  400#1:440,4
  408#1:444,2
  *E
RuntimeVisibleAnnotations:
  0: #1031(#1032=[I#1033,I#1034,I#1035],#1036=I#1037,#1038=I#1039,#1040=[s#1041],#1042=[s#10,s#1043,s#5,s#6,s#74,s#75,s#70,s#1043,s#294,s#71,s#202,s#15,s#203,s#14,s#217,s#218,s#241,s#242,s#609,s#610,s#1044,s#1045,s#11,s#12,s#190,s#191,s#456,s#457,s#659,s#480,s#665,s#562,s#733,s#1026,s#1043,s#399,s#400,s#1043,s#406,s#1028,s#1029,s#35,s#1043,s#33,s#34,s#39,s#40,s#44,s#42,s#43,s#48,s#49,s#1030,s#859,s#868,s#869,s#1046,s#50,s#1043,s#320,s#341,s#343,s#391,s#1047,s#390,s#392,s#397,s#438,s#337,s#508,s#509,s#516,s#1048,s#546,s#549,s#560,s#561,s#575,s#1049,s#605,s#1050,s#576,s#607,s#1051,s#628,s#642,s#1043,s#650,s#654,s#658,s#662,s#663,s#1043,s#669,s#1043,s#792,s#533,s#835,s#1052,s#1053])
    kotlin.Metadata(
      mv=[2,3,0]
      k=1
      xi=48
      d1=["\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010$\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u00109\u001a\u00020:H\u0007J\u0010\u0010;\u001a\u00020:2\u0006\u0010<\u001a\u00020%H\u0002J \u0010=\u001a\u00060>j\u0002`?2\n\u0010@\u001a\u00060>j\u0002`?2\u0006\u0010A\u001a\u00020%H\u0002J\u001c\u0010B\u001a\u00020:2\u0006\u0010C\u001a\u00020%2\n\u0010@\u001a\u00060>j\u0002`?H\u0007J\u0014\u0010B\u001a\u00020:2\n\u0010@\u001a\u00060>j\u0002`?H\u0007J\u0014\u0010D\u001a\u00020:2\n\u0010E\u001a\u00060>j\u0002`?H\u0007J\u0014\u0010F\u001a\u00020:2\n\u0010@\u001a\u00060>j\u0002`?H\u0007J \u0010G\u001a\u0006\u0012\u0002\b\u00030H2\n\u0010E\u001a\u00060>j\u0002`?2\u0006\u0010I\u001a\u00020\"H\u0007J(\u0010J\u001a\u0006\u0012\u0002\b\u00030H2\n\u0010E\u001a\u00060>j\u0002`?2\u0006\u0010I\u001a\u00020\"2\u0006\u0010K\u001a\u00020\"H\u0007J\u0014\u0010L\u001a\u00020:2\n\u0010@\u001a\u00060>j\u0002`?H\u0007J!\u0010M\u001a\u0002HN\"\u0004\b\u0000\u0010N2\f\u0010O\u001a\b\u0012\u0004\u0012\u0002HN0PH\u0007¢\u0006\u0002\u0010QJ\u0014\u0010R\u001a\u00020S2\n\u0010@\u001a\u00060>j\u0002`?H\u0007J\u0014\u0010T\u001a\u00020:2\n\u0010@\u001a\u00060>j\u0002`?H\u0007J\b\u0010U\u001a\u00020VH\u0007J\b\u0010W\u001a\u00020VH\u0007J\b\u0010X\u001a\u00020\"H\u0007J\b\u0010Y\u001a\u00020\"H\u0007J\b\u0010Z\u001a\u00020\"H\u0007J\b\u0010[\u001a\u00020\\H\u0007J\u0014\u0010]\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00010^H\u0007J\b\u0010_\u001a\u00020:H\u0007J\u0010\u0010`\u001a\u00020\"2\u0006\u0010I\u001a\u00020\"H\u0002J\b\u0010a\u001a\u00020:H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\tR\u0018\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\fR\u0010\u0010\r\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0014\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u0082T¢\u0006\u0002\n\u0000R\u001a\u0010#\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&0$X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\'\u001a\u00020\"X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\"X\u0082T¢\u0006\u0002\n\u0000R\u001a\u0010)\u001a\u00020*X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001a\u0010/\u001a\u00020\"X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u000e\u00104\u001a\u00020%X\u0082T¢\u0006\u0002\n\u0000R\u000e\u00105\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u00106\u001a\n 8*\u0004\u0018\u00010707X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006c"]
      d2=["Lext/mods/commons/pool/CoroutinePool;","","<init>","()V","LOGGER","Ljava/util/logging/Logger;","scheduledExecutors","","Ljava/util/concurrent/ScheduledThreadPoolExecutor;","[Ljava/util/concurrent/ScheduledThreadPoolExecutor;","instantExecutors","Ljava/util/concurrent/ThreadPoolExecutor;","[Ljava/util/concurrent/ThreadPoolExecutor;","pathfindingExecutor","virtualExecutor","Ljava/util/concurrent/ExecutorService;","forkJoinPool","Ljava/util/concurrent/ForkJoinPool;","BackgroundScope","Lkotlinx/coroutines/CoroutineScope;","PathfindingDispatcher","Lkotlinx/coroutines/CoroutineDispatcher;","getPathfindingDispatcher","()Lkotlinx/coroutines/CoroutineDispatcher;","rejectedHandler","Lext/mods/commons/pool/RejectedExecutionHandlerOptimized;","totalTasksSubmitted","Ljava/util/concurrent/atomic/LongAdder;","totalTasksCompleted","totalTasksRejected","totalExecutionTimeMs","pathfindingTasksSubmitted","pathfindingTasksCompleted","MAX_DELAY_MS","","taskRoutingHistory","Ljava/util/concurrent/ConcurrentHashMap;","","Lext/mods/commons/pool/CoroutinePool$ExecutionRoute;","SMART_SLOW_THRESHOLD_MS","SMART_FAST_THRESHOLD_MS","ENABLE_PROFILER","","getENABLE_PROFILER","()Z","setENABLE_PROFILER","(Z)V","BOTTLENECK_THRESHOLD_MS","getBOTTLENECK_THRESHOLD_MS","()J","setBOTTLENECK_THRESHOLD_MS","(J)V","DEBUG_FILE_NAME","fileWriteLock","dateFormatter","Ljava/time/format/DateTimeFormatter;","kotlin.jvm.PlatformType","init","","writeBottleneckToFile","message","wrapProfiler","Ljava/lang/Runnable;","Lkotlinx/coroutines/Runnable;","task","executorName","executeSmart","taskId","execute","r","executeIO","schedule","Ljava/util/concurrent/ScheduledFuture;","delay","scheduleAtFixedRate","period","executePathfinding","runPathfindingBlocking","T","block","Lkotlin/Function0;","(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;","executeParallel","Lkotlinx/coroutines/Job;","executeParallelBlocking","getPathfindingQueueSize","","getPathfindingActiveCount","getTotalTasksSubmitted","getTotalTasksCompleted","getTotalTasksRejected","getAverageExecutionTimeMs","","getMetrics","","printMetrics","validate","shutdown","ExecutionRoute","Brproject"]
    )
RuntimeInvisibleAnnotations:
  0: #1066(#821=[s#1067])
    kotlin.jvm.internal.SourceDebugExtension(
      value=["SMAP\nCoroutinePool.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutinePool.kt\next/mods/commons/pool/CoroutinePool\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,436:1\n1401#2,2:437\n14060#2,2:446\n14060#2,2:448\n1#3:439\n1834#4,4:440\n221#5,2:444\n*S KotlinDebug\n*F\n+ 1 CoroutinePool.kt\next/mods/commons/pool/CoroutinePool\n*L\n195#1:437,2\n419#1:446,2\n420#1:448,2\n400#1:440,4\n408#1:444,2\n*E\n"]
    )
BootstrapMethods:
  0: #141 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #134 Scheduled-Pool-\u0001
  1: #141 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #173 Instant-Pool-\u0001
  2: #141 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #248   - Scheduled: \u0001 pools x \u0001 threads
  3: #141 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #253   - Instant: \u0001 pools x core \u0001 max \u0001
  4: #141 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #260   - Pathfinding Threads: \u0001 (CPU-bound)
  5: #141 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #269   - Global Profiler: \u0001
  6: #141 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #275   - JVM: \u0001
  7: #141 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #282 ERRO CRÍTICO ao inicializar CoroutinePool: \u0001
  8: #332 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #321 ()V
      #325 REF_invokeStatic ext/mods/commons/pool/CoroutinePool.writeBottleneckToFile$lambda$0:(Ljava/lang/String;)V
      #321 ()V
  9: #332 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #321 ()V
      #348 REF_invokeStatic ext/mods/commons/pool/CoroutinePool.wrapProfiler$lambda$0:(Ljava/lang/Runnable;)V
      #321 ()V
  10: #332 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #321 ()V
      #378 REF_invokeStatic ext/mods/commons/pool/CoroutinePool.wrapProfiler$lambda$2:(Ljava/lang/Runnable;Ljava/lang/StackTraceElement;Ljava/lang/String;)V
      #321 ()V
  11: #332 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #321 ()V
      #419 REF_invokeStatic ext/mods/commons/pool/CoroutinePool.executeSmart$lambda$0:(Ljava/lang/Runnable;Lext/mods/commons/pool/CoroutinePool$ExecutionRoute;Ljava/lang/String;)V
      #321 ()V
  12: #141 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #501 Erro ao executar tarefa instantânea: \u0001
  13: #141 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #513 Erro ao executar tarefa I/O: \u0001
  14: #141 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #544 Erro ao agendar tarefa: \u0001
  15: #141 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #558 Erro ao agendar tarefa periódica: \u0001
  16: #141 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #568 PathfindingPool ocupado/erro: \u0001
  17: #332 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #584 ()Ljava/lang/Object;
      #588 REF_invokeStatic ext/mods/commons/pool/CoroutinePool.runPathfindingBlocking$lambda$0:(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;
      #584 ()Ljava/lang/Object;
  18: #141 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #639 Erro executeParallelBlocking: \u0001
  19: #141 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #815   \u0001: \u0001
  20: #141 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #855 Erro ao desligar: \u0001
  21: #141 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #877 [\u0001] \u0001\n
  22: #141 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #924 Falha ao gravar no log de gargalos: \u0001
  23: #141 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #951 \u0001.\u0001(\u0001:\u0001)
  24: #141 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #958 [GARGALO - \u0001] Tarefa originada em [\u0001] levou \u0001ms
  25: #141 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #978 [GARGALO - SmartPool] A tarefa nomeada \'\u0001\' levou \u0001ms
