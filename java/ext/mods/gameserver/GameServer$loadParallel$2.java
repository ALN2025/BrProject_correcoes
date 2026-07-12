// Bytecode for: ext.mods.gameserver.GameServer$loadParallel$2
// File: ext\mods\gameserver\GameServer$loadParallel$2.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/GameServer$loadParallel$2.class
  Last modified 9 de jul de 2026; size 11318 bytes
  MD5 checksum 4d076d4506da00aac48f83af96b2138c
  Compiled from "GameServer.kt"
final class ext.mods.gameserver.GameServer$loadParallel$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object>
  minor version: 0
  major version: 69
  flags: (0x0030) ACC_FINAL, ACC_SUPER
  this_class: #2                          // ext/mods/gameserver/GameServer$loadParallel$2
  super_class: #5                         // kotlin/coroutines/jvm/internal/SuspendLambda
  interfaces: 1, fields: 7, methods: 5, attributes: 7
Constant pool:
    #1 = Utf8               ext/mods/gameserver/GameServer$loadParallel$2
    #2 = Class              #1            // ext/mods/gameserver/GameServer$loadParallel$2
    #3 = Utf8               Lkotlin/coroutines/jvm/internal/SuspendLambda;Lkotlin/jvm/functions/Function2<Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation<-Lkotlin/Unit;>;Ljava/lang/Object;>;
    #4 = Utf8               kotlin/coroutines/jvm/internal/SuspendLambda
    #5 = Class              #4            // kotlin/coroutines/jvm/internal/SuspendLambda
    #6 = Utf8               kotlin/jvm/functions/Function2
    #7 = Class              #6            // kotlin/jvm/functions/Function2
    #8 = Utf8               <init>
    #9 = Utf8               (Lext/mods/gameserver/GameServer;Lkotlin/coroutines/Continuation;)V
   #10 = Utf8               (Lext/mods/gameserver/GameServer;Lkotlin/coroutines/Continuation<-Lext/mods/gameserver/GameServer$loadParallel$2;>;)V
   #11 = Utf8               this$0
   #12 = Utf8               Lext/mods/gameserver/GameServer;
   #13 = NameAndType        #11:#12       // this$0:Lext/mods/gameserver/GameServer;
   #14 = Fieldref           #2.#13        // ext/mods/gameserver/GameServer$loadParallel$2.this$0:Lext/mods/gameserver/GameServer;
   #15 = Utf8               (ILkotlin/coroutines/Continuation;)V
   #16 = NameAndType        #8:#15        // "<init>":(ILkotlin/coroutines/Continuation;)V
   #17 = Methodref          #5.#16        // kotlin/coroutines/jvm/internal/SuspendLambda."<init>":(ILkotlin/coroutines/Continuation;)V
   #18 = Utf8               this
   #19 = Utf8               Lext/mods/gameserver/GameServer$loadParallel$2;
   #20 = Utf8               $receiver
   #21 = Utf8               $completion
   #22 = Utf8               Lkotlin/coroutines/Continuation;
   #23 = Utf8               invokeSuspend
   #24 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
   #25 = Utf8               L$1
   #26 = Utf8               Ljava/lang/Object;
   #27 = Utf8               I$0
   #28 = Utf8               I
   #29 = Utf8               I$1
   #30 = Utf8               J$0
   #31 = Utf8               J
   #32 = Utf8               Lkotlin/coroutines/jvm/internal/DebugMetadata;
   #33 = Utf8               f
   #34 = Utf8               GameServer.kt
   #35 = Utf8               l
   #36 = Integer            406
   #37 = Integer            411
   #38 = Integer            414
   #39 = Integer            417
   #40 = Integer            421
   #41 = Utf8               nl
   #42 = Integer            709
   #43 = Integer            711
   #44 = Integer            713
   #45 = Integer            715
   #46 = Integer            717
   #47 = Utf8               i
   #48 = Integer            0
   #49 = Integer            1
   #50 = Integer            2
   #51 = Integer            3
   #52 = Integer            4
   #53 = Utf8               s
   #54 = Utf8               L$0
   #55 = Utf8               n
   #56 = Utf8               $this$coroutineScope
   #57 = Utf8               $i$f$measureTimeMillis
   #58 = Utf8               start$iv
   #59 = Utf8               $i$a$-measureTimeMillis-GameServer$loadParallel$2$totalTime$1
   #60 = Utf8               m
   #61 = Utf8               c
   #62 = Utf8               ext.mods.gameserver.GameServer$loadParallel$2
   #63 = Utf8               v
   #64 = NameAndType        #54:#26       // L$0:Ljava/lang/Object;
   #65 = Fieldref           #2.#64        // ext/mods/gameserver/GameServer$loadParallel$2.L$0:Ljava/lang/Object;
   #66 = Utf8               kotlinx/coroutines/CoroutineScope
   #67 = Class              #66           // kotlinx/coroutines/CoroutineScope
   #68 = Utf8               kotlin/coroutines/intrinsics/IntrinsicsKt
   #69 = Class              #68           // kotlin/coroutines/intrinsics/IntrinsicsKt
   #70 = Utf8               getCOROUTINE_SUSPENDED
   #71 = Utf8               ()Ljava/lang/Object;
   #72 = NameAndType        #70:#71       // getCOROUTINE_SUSPENDED:()Ljava/lang/Object;
   #73 = Methodref          #69.#72       // kotlin/coroutines/intrinsics/IntrinsicsKt.getCOROUTINE_SUSPENDED:()Ljava/lang/Object;
   #74 = Utf8               label
   #75 = NameAndType        #74:#28       // label:I
   #76 = Fieldref           #2.#75        // ext/mods/gameserver/GameServer$loadParallel$2.label:I
   #77 = Utf8               kotlin/ResultKt
   #78 = Class              #77           // kotlin/ResultKt
   #79 = Utf8               throwOnFailure
   #80 = Utf8               (Ljava/lang/Object;)V
   #81 = NameAndType        #79:#80       // throwOnFailure:(Ljava/lang/Object;)V
   #82 = Methodref          #78.#81       // kotlin/ResultKt.throwOnFailure:(Ljava/lang/Object;)V
   #83 = Utf8               ext/mods/gameserver/LoadMetricsService
   #84 = Class              #83           // ext/mods/gameserver/LoadMetricsService
   #85 = Utf8               INSTANCE
   #86 = Utf8               Lext/mods/gameserver/LoadMetricsService;
   #87 = NameAndType        #85:#86       // INSTANCE:Lext/mods/gameserver/LoadMetricsService;
   #88 = Fieldref           #84.#87       // ext/mods/gameserver/LoadMetricsService.INSTANCE:Lext/mods/gameserver/LoadMetricsService;
   #89 = Utf8               clear
   #90 = Utf8               ()V
   #91 = NameAndType        #89:#90       // clear:()V
   #92 = Methodref          #84.#91       // ext/mods/gameserver/LoadMetricsService.clear:()V
   #93 = Utf8               java/lang/System
   #94 = Class              #93           // java/lang/System
   #95 = Utf8               currentTimeMillis
   #96 = Utf8               ()J
   #97 = NameAndType        #95:#96       // currentTimeMillis:()J
   #98 = Methodref          #94.#97       // java/lang/System.currentTimeMillis:()J
   #99 = Utf8               Config & Pools
  #100 = String             #99           // Config & Pools
  #101 = Utf8               ext/mods/gameserver/GameServer
  #102 = Class              #101          // ext/mods/gameserver/GameServer
  #103 = Utf8               access$loadConfigAndPools
  #104 = Utf8               (Lext/mods/gameserver/GameServer;)V
  #105 = NameAndType        #103:#104     // access$loadConfigAndPools:(Lext/mods/gameserver/GameServer;)V
  #106 = Methodref          #102.#105     // ext/mods/gameserver/GameServer.access$loadConfigAndPools:(Lext/mods/gameserver/GameServer;)V
  #107 = Utf8               kotlin/Unit
  #108 = Class              #107          // kotlin/Unit
  #109 = Utf8               Lkotlin/Unit;
  #110 = NameAndType        #85:#109      // INSTANCE:Lkotlin/Unit;
  #111 = Fieldref           #108.#110     // kotlin/Unit.INSTANCE:Lkotlin/Unit;
  #112 = Utf8               record
  #113 = Utf8               (Ljava/lang/String;J)V
  #114 = NameAndType        #112:#113     // record:(Ljava/lang/String;J)V
  #115 = Methodref          #84.#114      // ext/mods/gameserver/LoadMetricsService.record:(Ljava/lang/String;J)V
  #116 = Utf8               kotlinx/coroutines/Deferred
  #117 = Class              #116          // kotlinx/coroutines/Deferred
  #118 = Utf8               kotlinx/coroutines/Dispatchers
  #119 = Class              #118          // kotlinx/coroutines/Dispatchers
  #120 = Utf8               getDefault
  #121 = Utf8               ()Lkotlinx/coroutines/CoroutineDispatcher;
  #122 = NameAndType        #120:#121     // getDefault:()Lkotlinx/coroutines/CoroutineDispatcher;
  #123 = Methodref          #119.#122     // kotlinx/coroutines/Dispatchers.getDefault:()Lkotlinx/coroutines/CoroutineDispatcher;
  #124 = Utf8               kotlin/coroutines/CoroutineContext
  #125 = Class              #124          // kotlin/coroutines/CoroutineContext
  #126 = Utf8               ext/mods/gameserver/GameServer$loadParallel$2$totalTime$1$2
  #127 = Class              #126          // ext/mods/gameserver/GameServer$loadParallel$2$totalTime$1$2
  #128 = NameAndType        #8:#9         // "<init>":(Lext/mods/gameserver/GameServer;Lkotlin/coroutines/Continuation;)V
  #129 = Methodref          #127.#128     // ext/mods/gameserver/GameServer$loadParallel$2$totalTime$1$2."<init>":(Lext/mods/gameserver/GameServer;Lkotlin/coroutines/Continuation;)V
  #130 = Utf8               kotlinx/coroutines/BuildersKt
  #131 = Class              #130          // kotlinx/coroutines/BuildersKt
  #132 = Utf8               async$default
  #133 = Utf8               (Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Deferred;
  #134 = NameAndType        #132:#133     // async$default:(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Deferred;
  #135 = Methodref          #131.#134     // kotlinx/coroutines/BuildersKt.async$default:(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Deferred;
  #136 = Utf8               ext/mods/gameserver/GameServer$loadParallel$2$totalTime$1$3
  #137 = Class              #136          // ext/mods/gameserver/GameServer$loadParallel$2$totalTime$1$3
  #138 = Methodref          #137.#128     // ext/mods/gameserver/GameServer$loadParallel$2$totalTime$1$3."<init>":(Lext/mods/gameserver/GameServer;Lkotlin/coroutines/Continuation;)V
  #139 = Utf8               kotlin/collections/CollectionsKt
  #140 = Class              #139          // kotlin/collections/CollectionsKt
  #141 = Utf8               listOf
  #142 = Utf8               ([Ljava/lang/Object;)Ljava/util/List;
  #143 = NameAndType        #141:#142     // listOf:([Ljava/lang/Object;)Ljava/util/List;
  #144 = Methodref          #140.#143     // kotlin/collections/CollectionsKt.listOf:([Ljava/lang/Object;)Ljava/util/List;
  #145 = Utf8               java/util/Collection
  #146 = Class              #145          // java/util/Collection
  #147 = NameAndType        #25:#26       // L$1:Ljava/lang/Object;
  #148 = Fieldref           #2.#147       // ext/mods/gameserver/GameServer$loadParallel$2.L$1:Ljava/lang/Object;
  #149 = NameAndType        #27:#28       // I$0:I
  #150 = Fieldref           #2.#149       // ext/mods/gameserver/GameServer$loadParallel$2.I$0:I
  #151 = NameAndType        #30:#31       // J$0:J
  #152 = Fieldref           #2.#151       // ext/mods/gameserver/GameServer$loadParallel$2.J$0:J
  #153 = NameAndType        #29:#28       // I$1:I
  #154 = Fieldref           #2.#153       // ext/mods/gameserver/GameServer$loadParallel$2.I$1:I
  #155 = Utf8               kotlinx/coroutines/AwaitKt
  #156 = Class              #155          // kotlinx/coroutines/AwaitKt
  #157 = Utf8               awaitAll
  #158 = Utf8               (Ljava/util/Collection;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
  #159 = NameAndType        #157:#158     // awaitAll:(Ljava/util/Collection;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
  #160 = Methodref          #156.#159     // kotlinx/coroutines/AwaitKt.awaitAll:(Ljava/util/Collection;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
  #161 = Utf8               java/lang/Iterable
  #162 = Class              #161          // java/lang/Iterable
  #163 = Utf8               iterator
  #164 = Utf8               ()Ljava/util/Iterator;
  #165 = NameAndType        #163:#164     // iterator:()Ljava/util/Iterator;
  #166 = InterfaceMethodref #162.#165     // java/lang/Iterable.iterator:()Ljava/util/Iterator;
  #167 = Utf8               java/util/Iterator
  #168 = Class              #167          // java/util/Iterator
  #169 = Utf8               hasNext
  #170 = Utf8               ()Z
  #171 = NameAndType        #169:#170     // hasNext:()Z
  #172 = InterfaceMethodref #168.#171     // java/util/Iterator.hasNext:()Z
  #173 = Utf8               next
  #174 = NameAndType        #173:#71      // next:()Ljava/lang/Object;
  #175 = InterfaceMethodref #168.#174     // java/util/Iterator.next:()Ljava/lang/Object;
  #176 = Utf8               kotlin/Pair
  #177 = Class              #176          // kotlin/Pair
  #178 = Utf8               component1
  #179 = NameAndType        #178:#71      // component1:()Ljava/lang/Object;
  #180 = Methodref          #177.#179     // kotlin/Pair.component1:()Ljava/lang/Object;
  #181 = Utf8               java/lang/String
  #182 = Class              #181          // java/lang/String
  #183 = Utf8               component2
  #184 = NameAndType        #183:#71      // component2:()Ljava/lang/Object;
  #185 = Methodref          #177.#184     // kotlin/Pair.component2:()Ljava/lang/Object;
  #186 = Utf8               java/lang/Number
  #187 = Class              #186          // java/lang/Number
  #188 = Utf8               longValue
  #189 = NameAndType        #188:#96      // longValue:()J
  #190 = Methodref          #187.#189     // java/lang/Number.longValue:()J
  #191 = Utf8               ext/mods/gameserver/GameServer$loadParallel$2$totalTime$1$5
  #192 = Class              #191          // ext/mods/gameserver/GameServer$loadParallel$2$totalTime$1$5
  #193 = Methodref          #192.#128     // ext/mods/gameserver/GameServer$loadParallel$2$totalTime$1$5."<init>":(Lext/mods/gameserver/GameServer;Lkotlin/coroutines/Continuation;)V
  #194 = Utf8               ext/mods/gameserver/GameServer$loadParallel$2$totalTime$1$6
  #195 = Class              #194          // ext/mods/gameserver/GameServer$loadParallel$2$totalTime$1$6
  #196 = Methodref          #195.#128     // ext/mods/gameserver/GameServer$loadParallel$2$totalTime$1$6."<init>":(Lext/mods/gameserver/GameServer;Lkotlin/coroutines/Continuation;)V
  #197 = Utf8               getIO
  #198 = NameAndType        #197:#121     // getIO:()Lkotlinx/coroutines/CoroutineDispatcher;
  #199 = Methodref          #119.#198     // kotlinx/coroutines/Dispatchers.getIO:()Lkotlinx/coroutines/CoroutineDispatcher;
  #200 = Utf8               ext/mods/gameserver/GameServer$loadParallel$2$totalTime$1$7
  #201 = Class              #200          // ext/mods/gameserver/GameServer$loadParallel$2$totalTime$1$7
  #202 = Methodref          #201.#128     // ext/mods/gameserver/GameServer$loadParallel$2$totalTime$1$7."<init>":(Lext/mods/gameserver/GameServer;Lkotlin/coroutines/Continuation;)V
  #203 = Utf8               ext/mods/gameserver/GameServer$loadParallel$2$totalTime$1$9
  #204 = Class              #203          // ext/mods/gameserver/GameServer$loadParallel$2$totalTime$1$9
  #205 = Methodref          #204.#128     // ext/mods/gameserver/GameServer$loadParallel$2$totalTime$1$9."<init>":(Lext/mods/gameserver/GameServer;Lkotlin/coroutines/Continuation;)V
  #206 = Utf8               (Ljava/lang/Object;)Ljava/util/List;
  #207 = NameAndType        #141:#206     // listOf:(Ljava/lang/Object;)Ljava/util/List;
  #208 = Methodref          #140.#207     // kotlin/collections/CollectionsKt.listOf:(Ljava/lang/Object;)Ljava/util/List;
  #209 = Utf8               ext/mods/gameserver/GameServer$loadParallel$2$totalTime$1$11
  #210 = Class              #209          // ext/mods/gameserver/GameServer$loadParallel$2$totalTime$1$11
  #211 = Methodref          #210.#128     // ext/mods/gameserver/GameServer$loadParallel$2$totalTime$1$11."<init>":(Lext/mods/gameserver/GameServer;Lkotlin/coroutines/Continuation;)V
  #212 = Utf8               ext/mods/gameserver/GameServer$loadParallel$2$totalTime$1$13
  #213 = Class              #212          // ext/mods/gameserver/GameServer$loadParallel$2$totalTime$1$13
  #214 = Methodref          #213.#128     // ext/mods/gameserver/GameServer$loadParallel$2$totalTime$1$13."<init>":(Lext/mods/gameserver/GameServer;Lkotlin/coroutines/Continuation;)V
  #215 = Utf8               ext/mods/gameserver/GameServer$loadParallel$2$totalTime$1$14
  #216 = Class              #215          // ext/mods/gameserver/GameServer$loadParallel$2$totalTime$1$14
  #217 = Methodref          #216.#128     // ext/mods/gameserver/GameServer$loadParallel$2$totalTime$1$14."<init>":(Lext/mods/gameserver/GameServer;Lkotlin/coroutines/Continuation;)V
  #218 = Utf8               kotlin/coroutines/jvm/internal/SpillingKt
  #219 = Class              #218          // kotlin/coroutines/jvm/internal/SpillingKt
  #220 = Utf8               nullOutSpilledVariable
  #221 = NameAndType        #220:#24      // nullOutSpilledVariable:(Ljava/lang/Object;)Ljava/lang/Object;
  #222 = Methodref          #219.#221     // kotlin/coroutines/jvm/internal/SpillingKt.nullOutSpilledVariable:(Ljava/lang/Object;)Ljava/lang/Object;
  #223 = Utf8               Handlers
  #224 = String             #223          // Handlers
  #225 = Utf8               access$loadHandlers
  #226 = NameAndType        #225:#104     // access$loadHandlers:(Lext/mods/gameserver/GameServer;)V
  #227 = Methodref          #102.#226     // ext/mods/gameserver/GameServer.access$loadHandlers:(Lext/mods/gameserver/GameServer;)V
  #228 = Utf8               java/lang/Runtime
  #229 = Class              #228          // java/lang/Runtime
  #230 = Utf8               getRuntime
  #231 = Utf8               ()Ljava/lang/Runtime;
  #232 = NameAndType        #230:#231     // getRuntime:()Ljava/lang/Runtime;
  #233 = Methodref          #229.#232     // java/lang/Runtime.getRuntime:()Ljava/lang/Runtime;
  #234 = Utf8               ext/mods/gameserver/Shutdown
  #235 = Class              #234          // ext/mods/gameserver/Shutdown
  #236 = Utf8               getInstance
  #237 = Utf8               ()Lext/mods/gameserver/Shutdown;
  #238 = NameAndType        #236:#237     // getInstance:()Lext/mods/gameserver/Shutdown;
  #239 = Methodref          #235.#238     // ext/mods/gameserver/Shutdown.getInstance:()Lext/mods/gameserver/Shutdown;
  #240 = Utf8               java/lang/Thread
  #241 = Class              #240          // java/lang/Thread
  #242 = Utf8               addShutdownHook
  #243 = Utf8               (Ljava/lang/Thread;)V
  #244 = NameAndType        #242:#243     // addShutdownHook:(Ljava/lang/Thread;)V
  #245 = Methodref          #229.#244     // java/lang/Runtime.addShutdownHook:(Ljava/lang/Thread;)V
  #246 = Utf8               access$getLOGGER$cp
  #247 = Utf8               ()Lext/mods/commons/logging/CLogger;
  #248 = NameAndType        #246:#247     // access$getLOGGER$cp:()Lext/mods/commons/logging/CLogger;
  #249 = Methodref          #102.#248     // ext/mods/gameserver/GameServer.access$getLOGGER$cp:()Lext/mods/commons/logging/CLogger;
  #250 = Utf8               Server loaded in %.2f seconds (Otimized Mode)
  #251 = String             #250          // Server loaded in %.2f seconds (Otimized Mode)
  #252 = Utf8               java/lang/Object
  #253 = Class              #252          // java/lang/Object
  #254 = Double             1000.0d
  #256 = Utf8               kotlin/coroutines/jvm/internal/Boxing
  #257 = Class              #256          // kotlin/coroutines/jvm/internal/Boxing
  #258 = Utf8               boxDouble
  #259 = Utf8               (D)Ljava/lang/Double;
  #260 = NameAndType        #258:#259     // boxDouble:(D)Ljava/lang/Double;
  #261 = Methodref          #257.#260     // kotlin/coroutines/jvm/internal/Boxing.boxDouble:(D)Ljava/lang/Double;
  #262 = Utf8               java/util/Arrays
  #263 = Class              #262          // java/util/Arrays
  #264 = Utf8               copyOf
  #265 = Utf8               ([Ljava/lang/Object;I)[Ljava/lang/Object;
  #266 = NameAndType        #264:#265     // copyOf:([Ljava/lang/Object;I)[Ljava/lang/Object;
  #267 = Methodref          #263.#266     // java/util/Arrays.copyOf:([Ljava/lang/Object;I)[Ljava/lang/Object;
  #268 = Utf8               format
  #269 = Utf8               (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
  #270 = NameAndType        #268:#269     // format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
  #271 = Methodref          #182.#270     // java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
  #272 = Utf8               format(...)
  #273 = String             #272          // format(...)
  #274 = Utf8               kotlin/jvm/internal/Intrinsics
  #275 = Class              #274          // kotlin/jvm/internal/Intrinsics
  #276 = Utf8               checkNotNullExpressionValue
  #277 = Utf8               (Ljava/lang/Object;Ljava/lang/String;)V
  #278 = NameAndType        #276:#277     // checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
  #279 = Methodref          #275.#278     // kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
  #280 = Utf8               ext/mods/commons/logging/CLogger
  #281 = Class              #280          // ext/mods/commons/logging/CLogger
  #282 = Utf8               info
  #283 = NameAndType        #282:#80      // info:(Ljava/lang/Object;)V
  #284 = Methodref          #281.#283     // ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;)V
  #285 = Utf8               {}
  #286 = String             #285          // {}
  #287 = Utf8               ext/mods/commons/pool/ConnectionPool
  #288 = Class              #287          // ext/mods/commons/pool/ConnectionPool
  #289 = Utf8               getStats
  #290 = Utf8               ()Ljava/lang/String;
  #291 = NameAndType        #289:#290     // getStats:()Ljava/lang/String;
  #292 = Methodref          #288.#291     // ext/mods/commons/pool/ConnectionPool.getStats:()Ljava/lang/String;
  #293 = Utf8               (Ljava/lang/Object;[Ljava/lang/Object;)V
  #294 = NameAndType        #282:#293     // info:(Ljava/lang/Object;[Ljava/lang/Object;)V
  #295 = Methodref          #281.#294     // ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
  #296 = Utf8               java/lang/IllegalStateException
  #297 = Class              #296          // java/lang/IllegalStateException
  #298 = Utf8               call to \'resume\' before \'invoke\' with coroutine
  #299 = String             #298          // call to \'resume\' before \'invoke\' with coroutine
  #300 = Utf8               (Ljava/lang/String;)V
  #301 = NameAndType        #8:#300       // "<init>":(Ljava/lang/String;)V
  #302 = Methodref          #297.#301     // java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
  #303 = Utf8               $i$a$-measureTimeMillis-GameServer$loadParallel$2$totalTime$1$1
  #304 = Utf8               $i$a$-forEach-GameServer$loadParallel$2$totalTime$1$4
  #305 = Utf8               name
  #306 = Utf8               Ljava/lang/String;
  #307 = Utf8               ms
  #308 = Utf8               element$iv
  #309 = Utf8               $i$f$forEach
  #310 = Utf8               $this$forEach$iv
  #311 = Utf8               Ljava/lang/Iterable;
  #312 = Utf8               $i$a$-forEach-GameServer$loadParallel$2$totalTime$1$8
  #313 = Utf8               $i$a$-forEach-GameServer$loadParallel$2$totalTime$1$10
  #314 = Utf8               $i$a$-forEach-GameServer$loadParallel$2$totalTime$1$12
  #315 = Utf8               $i$a$-forEach-GameServer$loadParallel$2$totalTime$1$15
  #316 = Utf8               $i$a$-measureTimeMillis-GameServer$loadParallel$2$totalTime$1$16
  #317 = Utf8               totalTime
  #318 = Utf8               $result
  #319 = Utf8               Lkotlinx/coroutines/CoroutineScope;
  #320 = Utf8               create
  #321 = Utf8               (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
  #322 = Utf8               (Ljava/lang/Object;Lkotlin/coroutines/Continuation<*>;)Lkotlin/coroutines/Continuation<Lkotlin/Unit;>;
  #323 = Methodref          #2.#128       // ext/mods/gameserver/GameServer$loadParallel$2."<init>":(Lext/mods/gameserver/GameServer;Lkotlin/coroutines/Continuation;)V
  #324 = Utf8               kotlin/coroutines/Continuation
  #325 = Class              #324          // kotlin/coroutines/Continuation
  #326 = Utf8               value
  #327 = Utf8               invoke
  #328 = Utf8               (Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
  #329 = Utf8               (Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation<-Lkotlin/Unit;>;)Ljava/lang/Object;
  #330 = NameAndType        #320:#321     // create:(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
  #331 = Methodref          #2.#330       // ext/mods/gameserver/GameServer$loadParallel$2.create:(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
  #332 = NameAndType        #23:#24       // invokeSuspend:(Ljava/lang/Object;)Ljava/lang/Object;
  #333 = Methodref          #2.#332       // ext/mods/gameserver/GameServer$loadParallel$2.invokeSuspend:(Ljava/lang/Object;)Ljava/lang/Object;
  #334 = Utf8               p1
  #335 = Utf8               p2
  #336 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #337 = NameAndType        #327:#328     // invoke:(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
  #338 = Methodref          #2.#337       // ext/mods/gameserver/GameServer$loadParallel$2.invoke:(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
  #339 = Utf8               Lkotlin/Metadata;
  #340 = Utf8               mv
  #341 = Utf8               k
  #342 = Utf8               xi
  #343 = Integer            48
  #344 = Utf8               d1
  #345 = Utf8               \u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n
  #346 = Utf8               d2
  #347 = Utf8               <anonymous>
  #348 = Utf8
  #349 = Utf8               loadParallel
  #350 = Utf8               (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
  #351 = NameAndType        #349:#350     // loadParallel:(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
  #352 = Utf8               Lkotlin/jvm/internal/SourceDebugExtension;
  #353 = Utf8               SMAP\nGameServer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GameServer.kt\next/mods/gameserver/GameServer$loadParallel$2\n+ 2 Timing.kt\nkotlin/system/TimingKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,703:1\n29#2,2:704\n29#2,3:706\n29#2,3:719\n31#2:722\n1915#3,2:709\n1915#3,2:711\n1915#3,2:713\n1915#3,2:715\n1915#3,2:717\n*S KotlinDebug\n*F\n+ 1 GameServer.kt\next/mods/gameserver/GameServer$loadParallel$2\n*L\n401#1:704,2\n402#1:706,3\n422#1:719,3\n401#1:722\n406#1:709,2\n411#1:711,2\n414#1:713,2\n417#1:715,2\n421#1:717,2\n*E\n
  #354 = Utf8               Code
  #355 = Utf8               LocalVariableTable
  #356 = Utf8               Signature
  #357 = Utf8               StackMapTable
  #358 = Utf8               LineNumberTable
  #359 = Utf8               InnerClasses
  #360 = Utf8               EnclosingMethod
  #361 = Utf8               SourceFile
  #362 = Utf8               SourceDebugExtension
  #363 = Utf8               RuntimeVisibleAnnotations
  #364 = Utf8               RuntimeInvisibleAnnotations
{
  java.lang.Object L$1;
    descriptor: Ljava/lang/Object;
    flags: (0x0000)

  int I$0;
    descriptor: I
    flags: (0x0000)

  int I$1;
    descriptor: I
    flags: (0x0000)

  long J$0;
    descriptor: J
    flags: (0x0000)

  int label;
    descriptor: I
    flags: (0x0000)

  final ext.mods.gameserver.GameServer this$0;
    descriptor: Lext/mods/gameserver/GameServer;
    flags: (0x1010) ACC_FINAL, ACC_SYNTHETIC

  ext.mods.gameserver.GameServer$loadParallel$2(ext.mods.gameserver.GameServer, kotlin.coroutines.Continuation<? super ext.mods.gameserver.GameServer$loadParallel$2>);
    descriptor: (Lext/mods/gameserver/GameServer;Lkotlin/coroutines/Continuation;)V
    flags: (0x0000)
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: putfield      #14                 // Field this$0:Lext/mods/gameserver/GameServer;
         5: aload_0
         6: iconst_2
         7: aload_2
         8: invokespecial #17                 // Method kotlin/coroutines/jvm/internal/SuspendLambda."<init>":(ILkotlin/coroutines/Continuation;)V
        11: return
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/gameserver/GameServer$loadParallel$2;
            0      12     1 $receiver   Lext/mods/gameserver/GameServer;
            0      12     2 $completion   Lkotlin/coroutines/Continuation;
    Signature: #10                          // (Lext/mods/gameserver/GameServer;Lkotlin/coroutines/Continuation<-Lext/mods/gameserver/GameServer$loadParallel$2;>;)V

  public final java.lang.Object invokeSuspend(java.lang.Object);
    descriptor: (Ljava/lang/Object;)Ljava/lang/Object;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=9, locals=25, args_size=2
         0: aload_0
         1: getfield      #65                 // Field L$0:Ljava/lang/Object;
         4: checkcast     #67                 // class kotlinx/coroutines/CoroutineScope
         7: astore_2
         8: invokestatic  #73                 // Method kotlin/coroutines/intrinsics/IntrinsicsKt.getCOROUTINE_SUSPENDED:()Ljava/lang/Object;
        11: astore        24
        13: aload_0
        14: getfield      #76                 // Field label:I
        17: tableswitch   { // 0 to 5

                       0: 56

                       1: 248

                       2: 514

                       3: 708

                       4: 902

                       5: 1141
                 default: 1401
            }
        56: aload_1
        57: invokestatic  #82                 // Method kotlin/ResultKt.throwOnFailure:(Ljava/lang/Object;)V
        60: getstatic     #88                 // Field ext/mods/gameserver/LoadMetricsService.INSTANCE:Lext/mods/gameserver/LoadMetricsService;
        63: invokevirtual #92                 // Method ext/mods/gameserver/LoadMetricsService.clear:()V
        66: aload_0
        67: getfield      #14                 // Field this$0:Lext/mods/gameserver/GameServer;
        70: astore        5
        72: iconst_0
        73: istore        6
        75: invokestatic  #98                 // Method java/lang/System.currentTimeMillis:()J
        78: lstore        7
        80: iconst_0
        81: istore        9
        83: getstatic     #88                 // Field ext/mods/gameserver/LoadMetricsService.INSTANCE:Lext/mods/gameserver/LoadMetricsService;
        86: ldc           #100                // String Config & Pools
        88: iconst_0
        89: istore        10
        91: invokestatic  #98                 // Method java/lang/System.currentTimeMillis:()J
        94: lstore        11
        96: astore        13
        98: astore        14
       100: iconst_0
       101: istore        15
       103: aload         5
       105: invokestatic  #106                // Method ext/mods/gameserver/GameServer.access$loadConfigAndPools:(Lext/mods/gameserver/GameServer;)V
       108: getstatic     #111                // Field kotlin/Unit.INSTANCE:Lkotlin/Unit;
       111: astore        16
       113: aload         14
       115: aload         13
       117: nop
       118: invokestatic  #98                 // Method java/lang/System.currentTimeMillis:()J
       121: lload         11
       123: lsub
       124: invokevirtual #115                // Method ext/mods/gameserver/LoadMetricsService.record:(Ljava/lang/String;J)V
       127: iconst_2
       128: anewarray     #117                // class kotlinx/coroutines/Deferred
       131: astore        10
       133: aload         10
       135: iconst_0
       136: aload_2
       137: invokestatic  #123                // Method kotlinx/coroutines/Dispatchers.getDefault:()Lkotlinx/coroutines/CoroutineDispatcher;
       140: checkcast     #125                // class kotlin/coroutines/CoroutineContext
       143: aconst_null
       144: new           #127                // class ext/mods/gameserver/GameServer$loadParallel$2$totalTime$1$2
       147: dup
       148: aload         5
       150: aconst_null
       151: invokespecial #129                // Method ext/mods/gameserver/GameServer$loadParallel$2$totalTime$1$2."<init>":(Lext/mods/gameserver/GameServer;Lkotlin/coroutines/Continuation;)V
       154: checkcast     #7                  // class kotlin/jvm/functions/Function2
       157: iconst_2
       158: aconst_null
       159: invokestatic  #135                // Method kotlinx/coroutines/BuildersKt.async$default:(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Deferred;
       162: aastore
       163: aload         10
       165: iconst_1
       166: aload_2
       167: invokestatic  #123                // Method kotlinx/coroutines/Dispatchers.getDefault:()Lkotlinx/coroutines/CoroutineDispatcher;
       170: checkcast     #125                // class kotlin/coroutines/CoroutineContext
       173: aconst_null
       174: new           #137                // class ext/mods/gameserver/GameServer$loadParallel$2$totalTime$1$3
       177: dup
       178: aload         5
       180: aconst_null
       181: invokespecial #138                // Method ext/mods/gameserver/GameServer$loadParallel$2$totalTime$1$3."<init>":(Lext/mods/gameserver/GameServer;Lkotlin/coroutines/Continuation;)V
       184: checkcast     #7                  // class kotlin/jvm/functions/Function2
       187: iconst_2
       188: aconst_null
       189: invokestatic  #135                // Method kotlinx/coroutines/BuildersKt.async$default:(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Deferred;
       192: aastore
       193: aload         10
       195: invokestatic  #144                // Method kotlin/collections/CollectionsKt.listOf:([Ljava/lang/Object;)Ljava/util/List;
       198: checkcast     #146                // class java/util/Collection
       201: aload_0
       202: aload_0
       203: aload_2
       204: putfield      #65                 // Field L$0:Ljava/lang/Object;
       207: aload_0
       208: aload         5
       210: putfield      #148                // Field L$1:Ljava/lang/Object;
       213: aload_0
       214: iload         6
       216: putfield      #150                // Field I$0:I
       219: aload_0
       220: lload         7
       222: putfield      #152                // Field J$0:J
       225: aload_0
       226: iload         9
       228: putfield      #154                // Field I$1:I
       231: aload_0
       232: iconst_1
       233: putfield      #76                 // Field label:I
       236: invokestatic  #160                // Method kotlinx/coroutines/AwaitKt.awaitAll:(Ljava/util/Collection;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
       239: dup
       240: aload         24
       242: if_acmpne     280
       245: aload         24
       247: areturn
       248: aload_0
       249: getfield      #154                // Field I$1:I
       252: istore        9
       254: aload_0
       255: getfield      #152                // Field J$0:J
       258: lstore        7
       260: aload_0
       261: getfield      #150                // Field I$0:I
       264: istore        6
       266: aload_0
       267: getfield      #148                // Field L$1:Ljava/lang/Object;
       270: checkcast     #102                // class ext/mods/gameserver/GameServer
       273: astore        5
       275: aload_1
       276: invokestatic  #82                 // Method kotlin/ResultKt.throwOnFailure:(Ljava/lang/Object;)V
       279: aload_1
       280: checkcast     #162                // class java/lang/Iterable
       283: astore        10
       285: iconst_0
       286: istore        17
       288: aload         10
       290: invokeinterface #166,  1          // InterfaceMethod java/lang/Iterable.iterator:()Ljava/util/Iterator;
       295: astore        18
       297: aload         18
       299: invokeinterface #172,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       304: ifeq          362
       307: aload         18
       309: invokeinterface #175,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       314: astore        15
       316: aload         15
       318: checkcast     #177                // class kotlin/Pair
       321: astore        19
       323: iconst_0
       324: istore        20
       326: aload         19
       328: invokevirtual #180                // Method kotlin/Pair.component1:()Ljava/lang/Object;
       331: checkcast     #182                // class java/lang/String
       334: astore        21
       336: aload         19
       338: invokevirtual #185                // Method kotlin/Pair.component2:()Ljava/lang/Object;
       341: checkcast     #187                // class java/lang/Number
       344: invokevirtual #190                // Method java/lang/Number.longValue:()J
       347: lstore        22
       349: getstatic     #88                 // Field ext/mods/gameserver/LoadMetricsService.INSTANCE:Lext/mods/gameserver/LoadMetricsService;
       352: aload         21
       354: lload         22
       356: invokevirtual #115                // Method ext/mods/gameserver/LoadMetricsService.record:(Ljava/lang/String;J)V
       359: goto          297
       362: nop
       363: iconst_3
       364: anewarray     #117                // class kotlinx/coroutines/Deferred
       367: astore        10
       369: aload         10
       371: iconst_0
       372: aload_2
       373: invokestatic  #123                // Method kotlinx/coroutines/Dispatchers.getDefault:()Lkotlinx/coroutines/CoroutineDispatcher;
       376: checkcast     #125                // class kotlin/coroutines/CoroutineContext
       379: aconst_null
       380: new           #192                // class ext/mods/gameserver/GameServer$loadParallel$2$totalTime$1$5
       383: dup
       384: aload         5
       386: aconst_null
       387: invokespecial #193                // Method ext/mods/gameserver/GameServer$loadParallel$2$totalTime$1$5."<init>":(Lext/mods/gameserver/GameServer;Lkotlin/coroutines/Continuation;)V
       390: checkcast     #7                  // class kotlin/jvm/functions/Function2
       393: iconst_2
       394: aconst_null
       395: invokestatic  #135                // Method kotlinx/coroutines/BuildersKt.async$default:(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Deferred;
       398: aastore
       399: aload         10
       401: iconst_1
       402: aload_2
       403: invokestatic  #123                // Method kotlinx/coroutines/Dispatchers.getDefault:()Lkotlinx/coroutines/CoroutineDispatcher;
       406: checkcast     #125                // class kotlin/coroutines/CoroutineContext
       409: aconst_null
       410: new           #195                // class ext/mods/gameserver/GameServer$loadParallel$2$totalTime$1$6
       413: dup
       414: aload         5
       416: aconst_null
       417: invokespecial #196                // Method ext/mods/gameserver/GameServer$loadParallel$2$totalTime$1$6."<init>":(Lext/mods/gameserver/GameServer;Lkotlin/coroutines/Continuation;)V
       420: checkcast     #7                  // class kotlin/jvm/functions/Function2
       423: iconst_2
       424: aconst_null
       425: invokestatic  #135                // Method kotlinx/coroutines/BuildersKt.async$default:(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Deferred;
       428: aastore
       429: aload         10
       431: iconst_2
       432: aload_2
       433: invokestatic  #199                // Method kotlinx/coroutines/Dispatchers.getIO:()Lkotlinx/coroutines/CoroutineDispatcher;
       436: checkcast     #125                // class kotlin/coroutines/CoroutineContext
       439: aconst_null
       440: new           #201                // class ext/mods/gameserver/GameServer$loadParallel$2$totalTime$1$7
       443: dup
       444: aload         5
       446: aconst_null
       447: invokespecial #202                // Method ext/mods/gameserver/GameServer$loadParallel$2$totalTime$1$7."<init>":(Lext/mods/gameserver/GameServer;Lkotlin/coroutines/Continuation;)V
       450: checkcast     #7                  // class kotlin/jvm/functions/Function2
       453: iconst_2
       454: aconst_null
       455: invokestatic  #135                // Method kotlinx/coroutines/BuildersKt.async$default:(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Deferred;
       458: aastore
       459: aload         10
       461: invokestatic  #144                // Method kotlin/collections/CollectionsKt.listOf:([Ljava/lang/Object;)Ljava/util/List;
       464: checkcast     #146                // class java/util/Collection
       467: aload_0
       468: aload_0
       469: aload_2
       470: putfield      #65                 // Field L$0:Ljava/lang/Object;
       473: aload_0
       474: aload         5
       476: putfield      #148                // Field L$1:Ljava/lang/Object;
       479: aload_0
       480: iload         6
       482: putfield      #150                // Field I$0:I
       485: aload_0
       486: lload         7
       488: putfield      #152                // Field J$0:J
       491: aload_0
       492: iload         9
       494: putfield      #154                // Field I$1:I
       497: aload_0
       498: iconst_2
       499: putfield      #76                 // Field label:I
       502: invokestatic  #160                // Method kotlinx/coroutines/AwaitKt.awaitAll:(Ljava/util/Collection;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
       505: dup
       506: aload         24
       508: if_acmpne     546
       511: aload         24
       513: areturn
       514: aload_0
       515: getfield      #154                // Field I$1:I
       518: istore        9
       520: aload_0
       521: getfield      #152                // Field J$0:J
       524: lstore        7
       526: aload_0
       527: getfield      #150                // Field I$0:I
       530: istore        6
       532: aload_0
       533: getfield      #148                // Field L$1:Ljava/lang/Object;
       536: checkcast     #102                // class ext/mods/gameserver/GameServer
       539: astore        5
       541: aload_1
       542: invokestatic  #82                 // Method kotlin/ResultKt.throwOnFailure:(Ljava/lang/Object;)V
       545: aload_1
       546: checkcast     #162                // class java/lang/Iterable
       549: astore        10
       551: iconst_0
       552: istore        17
       554: aload         10
       556: invokeinterface #166,  1          // InterfaceMethod java/lang/Iterable.iterator:()Ljava/util/Iterator;
       561: astore        18
       563: aload         18
       565: invokeinterface #172,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       570: ifeq          628
       573: aload         18
       575: invokeinterface #175,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       580: astore        15
       582: aload         15
       584: checkcast     #177                // class kotlin/Pair
       587: astore        19
       589: iconst_0
       590: istore        20
       592: aload         19
       594: invokevirtual #180                // Method kotlin/Pair.component1:()Ljava/lang/Object;
       597: checkcast     #182                // class java/lang/String
       600: astore        21
       602: aload         19
       604: invokevirtual #185                // Method kotlin/Pair.component2:()Ljava/lang/Object;
       607: checkcast     #187                // class java/lang/Number
       610: invokevirtual #190                // Method java/lang/Number.longValue:()J
       613: lstore        22
       615: getstatic     #88                 // Field ext/mods/gameserver/LoadMetricsService.INSTANCE:Lext/mods/gameserver/LoadMetricsService;
       618: aload         21
       620: lload         22
       622: invokevirtual #115                // Method ext/mods/gameserver/LoadMetricsService.record:(Ljava/lang/String;J)V
       625: goto          563
       628: nop
       629: aload_2
       630: invokestatic  #123                // Method kotlinx/coroutines/Dispatchers.getDefault:()Lkotlinx/coroutines/CoroutineDispatcher;
       633: checkcast     #125                // class kotlin/coroutines/CoroutineContext
       636: aconst_null
       637: new           #204                // class ext/mods/gameserver/GameServer$loadParallel$2$totalTime$1$9
       640: dup
       641: aload         5
       643: aconst_null
       644: invokespecial #205                // Method ext/mods/gameserver/GameServer$loadParallel$2$totalTime$1$9."<init>":(Lext/mods/gameserver/GameServer;Lkotlin/coroutines/Continuation;)V
       647: checkcast     #7                  // class kotlin/jvm/functions/Function2
       650: iconst_2
       651: aconst_null
       652: invokestatic  #135                // Method kotlinx/coroutines/BuildersKt.async$default:(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Deferred;
       655: invokestatic  #208                // Method kotlin/collections/CollectionsKt.listOf:(Ljava/lang/Object;)Ljava/util/List;
       658: checkcast     #146                // class java/util/Collection
       661: aload_0
       662: aload_0
       663: aload_2
       664: putfield      #65                 // Field L$0:Ljava/lang/Object;
       667: aload_0
       668: aload         5
       670: putfield      #148                // Field L$1:Ljava/lang/Object;
       673: aload_0
       674: iload         6
       676: putfield      #150                // Field I$0:I
       679: aload_0
       680: lload         7
       682: putfield      #152                // Field J$0:J
       685: aload_0
       686: iload         9
       688: putfield      #154                // Field I$1:I
       691: aload_0
       692: iconst_3
       693: putfield      #76                 // Field label:I
       696: invokestatic  #160                // Method kotlinx/coroutines/AwaitKt.awaitAll:(Ljava/util/Collection;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
       699: dup
       700: aload         24
       702: if_acmpne     740
       705: aload         24
       707: areturn
       708: aload_0
       709: getfield      #154                // Field I$1:I
       712: istore        9
       714: aload_0
       715: getfield      #152                // Field J$0:J
       718: lstore        7
       720: aload_0
       721: getfield      #150                // Field I$0:I
       724: istore        6
       726: aload_0
       727: getfield      #148                // Field L$1:Ljava/lang/Object;
       730: checkcast     #102                // class ext/mods/gameserver/GameServer
       733: astore        5
       735: aload_1
       736: invokestatic  #82                 // Method kotlin/ResultKt.throwOnFailure:(Ljava/lang/Object;)V
       739: aload_1
       740: checkcast     #162                // class java/lang/Iterable
       743: astore        10
       745: iconst_0
       746: istore        17
       748: aload         10
       750: invokeinterface #166,  1          // InterfaceMethod java/lang/Iterable.iterator:()Ljava/util/Iterator;
       755: astore        18
       757: aload         18
       759: invokeinterface #172,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       764: ifeq          822
       767: aload         18
       769: invokeinterface #175,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       774: astore        15
       776: aload         15
       778: checkcast     #177                // class kotlin/Pair
       781: astore        19
       783: iconst_0
       784: istore        20
       786: aload         19
       788: invokevirtual #180                // Method kotlin/Pair.component1:()Ljava/lang/Object;
       791: checkcast     #182                // class java/lang/String
       794: astore        21
       796: aload         19
       798: invokevirtual #185                // Method kotlin/Pair.component2:()Ljava/lang/Object;
       801: checkcast     #187                // class java/lang/Number
       804: invokevirtual #190                // Method java/lang/Number.longValue:()J
       807: lstore        22
       809: getstatic     #88                 // Field ext/mods/gameserver/LoadMetricsService.INSTANCE:Lext/mods/gameserver/LoadMetricsService;
       812: aload         21
       814: lload         22
       816: invokevirtual #115                // Method ext/mods/gameserver/LoadMetricsService.record:(Ljava/lang/String;J)V
       819: goto          757
       822: nop
       823: aload_2
       824: invokestatic  #199                // Method kotlinx/coroutines/Dispatchers.getIO:()Lkotlinx/coroutines/CoroutineDispatcher;
       827: checkcast     #125                // class kotlin/coroutines/CoroutineContext
       830: aconst_null
       831: new           #210                // class ext/mods/gameserver/GameServer$loadParallel$2$totalTime$1$11
       834: dup
       835: aload         5
       837: aconst_null
       838: invokespecial #211                // Method ext/mods/gameserver/GameServer$loadParallel$2$totalTime$1$11."<init>":(Lext/mods/gameserver/GameServer;Lkotlin/coroutines/Continuation;)V
       841: checkcast     #7                  // class kotlin/jvm/functions/Function2
       844: iconst_2
       845: aconst_null
       846: invokestatic  #135                // Method kotlinx/coroutines/BuildersKt.async$default:(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Deferred;
       849: invokestatic  #208                // Method kotlin/collections/CollectionsKt.listOf:(Ljava/lang/Object;)Ljava/util/List;
       852: checkcast     #146                // class java/util/Collection
       855: aload_0
       856: aload_0
       857: aload_2
       858: putfield      #65                 // Field L$0:Ljava/lang/Object;
       861: aload_0
       862: aload         5
       864: putfield      #148                // Field L$1:Ljava/lang/Object;
       867: aload_0
       868: iload         6
       870: putfield      #150                // Field I$0:I
       873: aload_0
       874: lload         7
       876: putfield      #152                // Field J$0:J
       879: aload_0
       880: iload         9
       882: putfield      #154                // Field I$1:I
       885: aload_0
       886: iconst_4
       887: putfield      #76                 // Field label:I
       890: invokestatic  #160                // Method kotlinx/coroutines/AwaitKt.awaitAll:(Ljava/util/Collection;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
       893: dup
       894: aload         24
       896: if_acmpne     934
       899: aload         24
       901: areturn
       902: aload_0
       903: getfield      #154                // Field I$1:I
       906: istore        9
       908: aload_0
       909: getfield      #152                // Field J$0:J
       912: lstore        7
       914: aload_0
       915: getfield      #150                // Field I$0:I
       918: istore        6
       920: aload_0
       921: getfield      #148                // Field L$1:Ljava/lang/Object;
       924: checkcast     #102                // class ext/mods/gameserver/GameServer
       927: astore        5
       929: aload_1
       930: invokestatic  #82                 // Method kotlin/ResultKt.throwOnFailure:(Ljava/lang/Object;)V
       933: aload_1
       934: checkcast     #162                // class java/lang/Iterable
       937: astore        10
       939: iconst_0
       940: istore        17
       942: aload         10
       944: invokeinterface #166,  1          // InterfaceMethod java/lang/Iterable.iterator:()Ljava/util/Iterator;
       949: astore        18
       951: aload         18
       953: invokeinterface #172,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       958: ifeq          1016
       961: aload         18
       963: invokeinterface #175,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       968: astore        15
       970: aload         15
       972: checkcast     #177                // class kotlin/Pair
       975: astore        19
       977: iconst_0
       978: istore        20
       980: aload         19
       982: invokevirtual #180                // Method kotlin/Pair.component1:()Ljava/lang/Object;
       985: checkcast     #182                // class java/lang/String
       988: astore        21
       990: aload         19
       992: invokevirtual #185                // Method kotlin/Pair.component2:()Ljava/lang/Object;
       995: checkcast     #187                // class java/lang/Number
       998: invokevirtual #190                // Method java/lang/Number.longValue:()J
      1001: lstore        22
      1003: getstatic     #88                 // Field ext/mods/gameserver/LoadMetricsService.INSTANCE:Lext/mods/gameserver/LoadMetricsService;
      1006: aload         21
      1008: lload         22
      1010: invokevirtual #115                // Method ext/mods/gameserver/LoadMetricsService.record:(Ljava/lang/String;J)V
      1013: goto          951
      1016: nop
      1017: iconst_2
      1018: anewarray     #117                // class kotlinx/coroutines/Deferred
      1021: astore        10
      1023: aload         10
      1025: iconst_0
      1026: aload_2
      1027: invokestatic  #199                // Method kotlinx/coroutines/Dispatchers.getIO:()Lkotlinx/coroutines/CoroutineDispatcher;
      1030: checkcast     #125                // class kotlin/coroutines/CoroutineContext
      1033: aconst_null
      1034: new           #213                // class ext/mods/gameserver/GameServer$loadParallel$2$totalTime$1$13
      1037: dup
      1038: aload         5
      1040: aconst_null
      1041: invokespecial #214                // Method ext/mods/gameserver/GameServer$loadParallel$2$totalTime$1$13."<init>":(Lext/mods/gameserver/GameServer;Lkotlin/coroutines/Continuation;)V
      1044: checkcast     #7                  // class kotlin/jvm/functions/Function2
      1047: iconst_2
      1048: aconst_null
      1049: invokestatic  #135                // Method kotlinx/coroutines/BuildersKt.async$default:(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Deferred;
      1052: aastore
      1053: aload         10
      1055: iconst_1
      1056: aload_2
      1057: invokestatic  #199                // Method kotlinx/coroutines/Dispatchers.getIO:()Lkotlinx/coroutines/CoroutineDispatcher;
      1060: checkcast     #125                // class kotlin/coroutines/CoroutineContext
      1063: aconst_null
      1064: new           #216                // class ext/mods/gameserver/GameServer$loadParallel$2$totalTime$1$14
      1067: dup
      1068: aload         5
      1070: aconst_null
      1071: invokespecial #217                // Method ext/mods/gameserver/GameServer$loadParallel$2$totalTime$1$14."<init>":(Lext/mods/gameserver/GameServer;Lkotlin/coroutines/Continuation;)V
      1074: checkcast     #7                  // class kotlin/jvm/functions/Function2
      1077: iconst_2
      1078: aconst_null
      1079: invokestatic  #135                // Method kotlinx/coroutines/BuildersKt.async$default:(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Deferred;
      1082: aastore
      1083: aload         10
      1085: invokestatic  #144                // Method kotlin/collections/CollectionsKt.listOf:([Ljava/lang/Object;)Ljava/util/List;
      1088: checkcast     #146                // class java/util/Collection
      1091: aload_0
      1092: aload_0
      1093: aload_2
      1094: invokestatic  #222                // Method kotlin/coroutines/jvm/internal/SpillingKt.nullOutSpilledVariable:(Ljava/lang/Object;)Ljava/lang/Object;
      1097: putfield      #65                 // Field L$0:Ljava/lang/Object;
      1100: aload_0
      1101: aload         5
      1103: putfield      #148                // Field L$1:Ljava/lang/Object;
      1106: aload_0
      1107: iload         6
      1109: putfield      #150                // Field I$0:I
      1112: aload_0
      1113: lload         7
      1115: putfield      #152                // Field J$0:J
      1118: aload_0
      1119: iload         9
      1121: putfield      #154                // Field I$1:I
      1124: aload_0
      1125: iconst_5
      1126: putfield      #76                 // Field label:I
      1129: invokestatic  #160                // Method kotlinx/coroutines/AwaitKt.awaitAll:(Ljava/util/Collection;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
      1132: dup
      1133: aload         24
      1135: if_acmpne     1173
      1138: aload         24
      1140: areturn
      1141: aload_0
      1142: getfield      #154                // Field I$1:I
      1145: istore        9
      1147: aload_0
      1148: getfield      #152                // Field J$0:J
      1151: lstore        7
      1153: aload_0
      1154: getfield      #150                // Field I$0:I
      1157: istore        6
      1159: aload_0
      1160: getfield      #148                // Field L$1:Ljava/lang/Object;
      1163: checkcast     #102                // class ext/mods/gameserver/GameServer
      1166: astore        5
      1168: aload_1
      1169: invokestatic  #82                 // Method kotlin/ResultKt.throwOnFailure:(Ljava/lang/Object;)V
      1172: aload_1
      1173: checkcast     #162                // class java/lang/Iterable
      1176: astore        10
      1178: iconst_0
      1179: istore        17
      1181: aload         10
      1183: invokeinterface #166,  1          // InterfaceMethod java/lang/Iterable.iterator:()Ljava/util/Iterator;
      1188: astore        18
      1190: aload         18
      1192: invokeinterface #172,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
      1197: ifeq          1255
      1200: aload         18
      1202: invokeinterface #175,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      1207: astore        15
      1209: aload         15
      1211: checkcast     #177                // class kotlin/Pair
      1214: astore        19
      1216: iconst_0
      1217: istore        20
      1219: aload         19
      1221: invokevirtual #180                // Method kotlin/Pair.component1:()Ljava/lang/Object;
      1224: checkcast     #182                // class java/lang/String
      1227: astore        21
      1229: aload         19
      1231: invokevirtual #185                // Method kotlin/Pair.component2:()Ljava/lang/Object;
      1234: checkcast     #187                // class java/lang/Number
      1237: invokevirtual #190                // Method java/lang/Number.longValue:()J
      1240: lstore        22
      1242: getstatic     #88                 // Field ext/mods/gameserver/LoadMetricsService.INSTANCE:Lext/mods/gameserver/LoadMetricsService;
      1245: aload         21
      1247: lload         22
      1249: invokevirtual #115                // Method ext/mods/gameserver/LoadMetricsService.record:(Ljava/lang/String;J)V
      1252: goto          1190
      1255: nop
      1256: getstatic     #88                 // Field ext/mods/gameserver/LoadMetricsService.INSTANCE:Lext/mods/gameserver/LoadMetricsService;
      1259: ldc           #224                // String Handlers
      1261: iconst_0
      1262: istore        10
      1264: invokestatic  #98                 // Method java/lang/System.currentTimeMillis:()J
      1267: lstore        11
      1269: astore        13
      1271: astore        14
      1273: iconst_0
      1274: istore        15
      1276: aload         5
      1278: invokestatic  #227                // Method ext/mods/gameserver/GameServer.access$loadHandlers:(Lext/mods/gameserver/GameServer;)V
      1281: getstatic     #111                // Field kotlin/Unit.INSTANCE:Lkotlin/Unit;
      1284: astore        16
      1286: aload         14
      1288: aload         13
      1290: nop
      1291: invokestatic  #98                 // Method java/lang/System.currentTimeMillis:()J
      1294: lload         11
      1296: lsub
      1297: invokevirtual #115                // Method ext/mods/gameserver/LoadMetricsService.record:(Ljava/lang/String;J)V
      1300: invokestatic  #233                // Method java/lang/Runtime.getRuntime:()Ljava/lang/Runtime;
      1303: invokestatic  #239                // Method ext/mods/gameserver/Shutdown.getInstance:()Lext/mods/gameserver/Shutdown;
      1306: checkcast     #241                // class java/lang/Thread
      1309: invokevirtual #245                // Method java/lang/Runtime.addShutdownHook:(Ljava/lang/Thread;)V
      1312: nop
      1313: invokestatic  #98                 // Method java/lang/System.currentTimeMillis:()J
      1316: lload         7
      1318: lsub
      1319: lstore_3
      1320: invokestatic  #249                // Method ext/mods/gameserver/GameServer.access$getLOGGER$cp:()Lext/mods/commons/logging/CLogger;
      1323: ldc           #251                // String Server loaded in %.2f seconds (Otimized Mode)
      1325: astore        5
      1327: iconst_1
      1328: anewarray     #253                // class java/lang/Object
      1331: astore        6
      1333: aload         6
      1335: iconst_0
      1336: lload_3
      1337: l2d
      1338: ldc2_w        #254                // double 1000.0d
      1341: ddiv
      1342: invokestatic  #261                // Method kotlin/coroutines/jvm/internal/Boxing.boxDouble:(D)Ljava/lang/Double;
      1345: aastore
      1346: aload         6
      1348: astore        6
      1350: aload         5
      1352: aload         6
      1354: aload         6
      1356: arraylength
      1357: invokestatic  #267                // Method java/util/Arrays.copyOf:([Ljava/lang/Object;I)[Ljava/lang/Object;
      1360: invokestatic  #271                // Method java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      1363: dup
      1364: ldc_w         #273                // String format(...)
      1367: invokestatic  #279                // Method kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
      1370: invokevirtual #284                // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;)V
      1373: invokestatic  #249                // Method ext/mods/gameserver/GameServer.access$getLOGGER$cp:()Lext/mods/commons/logging/CLogger;
      1376: ldc_w         #286                // String {}
      1379: iconst_1
      1380: anewarray     #253                // class java/lang/Object
      1383: astore        5
      1385: aload         5
      1387: iconst_0
      1388: invokestatic  #292                // Method ext/mods/commons/pool/ConnectionPool.getStats:()Ljava/lang/String;
      1391: aastore
      1392: aload         5
      1394: invokevirtual #295                // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
      1397: getstatic     #111                // Field kotlin/Unit.INSTANCE:Lkotlin/Unit;
      1400: areturn
      1401: new           #297                // class java/lang/IllegalStateException
      1404: dup
      1405: ldc_w         #299                // String call to \'resume\' before \'invoke\' with coroutine
      1408: invokespecial #302                // Method java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
      1411: athrow
      StackMapTable: number_of_entries = 22
        frame_type = 255 /* full_frame */
          offset_delta = 56
          locals = [ class ext/mods/gameserver/GameServer$loadParallel$2, class java/lang/Object, class kotlinx/coroutines/CoroutineScope, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, class java/lang/Object ]
          stack = []
        frame_type = 251 /* same_frame_extended */
          offset_delta = 191
        frame_type = 255 /* full_frame */
          offset_delta = 31
          locals = [ class ext/mods/gameserver/GameServer$loadParallel$2, class java/lang/Object, class kotlinx/coroutines/CoroutineScope, top, top, class ext/mods/gameserver/GameServer, int, long, int, top, top, top, top, top, top, top, top, top, top, top, top, top, top, class java/lang/Object ]
          stack = [ class java/lang/Object ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/GameServer$loadParallel$2, class java/lang/Object, class kotlinx/coroutines/CoroutineScope, top, top, class ext/mods/gameserver/GameServer, int, long, int, class java/lang/Iterable, top, top, top, top, top, top, int, class java/util/Iterator, top, top, top, top, top, class java/lang/Object ]
          stack = []
        frame_type = 251 /* same_frame_extended */
          offset_delta = 64
        frame_type = 255 /* full_frame */
          offset_delta = 151
          locals = [ class ext/mods/gameserver/GameServer$loadParallel$2, class java/lang/Object, class kotlinx/coroutines/CoroutineScope, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, class java/lang/Object ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 31
          locals = [ class ext/mods/gameserver/GameServer$loadParallel$2, class java/lang/Object, class kotlinx/coroutines/CoroutineScope, top, top, class ext/mods/gameserver/GameServer, int, long, int, top, top, top, top, top, top, top, top, top, top, top, top, top, top, class java/lang/Object ]
          stack = [ class java/lang/Object ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/GameServer$loadParallel$2, class java/lang/Object, class kotlinx/coroutines/CoroutineScope, top, top, class ext/mods/gameserver/GameServer, int, long, int, class java/lang/Iterable, top, top, top, top, top, top, int, class java/util/Iterator, top, top, top, top, top, class java/lang/Object ]
          stack = []
        frame_type = 251 /* same_frame_extended */
          offset_delta = 64
        frame_type = 255 /* full_frame */
          offset_delta = 79
          locals = [ class ext/mods/gameserver/GameServer$loadParallel$2, class java/lang/Object, class kotlinx/coroutines/CoroutineScope, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, class java/lang/Object ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 31
          locals = [ class ext/mods/gameserver/GameServer$loadParallel$2, class java/lang/Object, class kotlinx/coroutines/CoroutineScope, top, top, class ext/mods/gameserver/GameServer, int, long, int, top, top, top, top, top, top, top, top, top, top, top, top, top, top, class java/lang/Object ]
          stack = [ class java/lang/Object ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/GameServer$loadParallel$2, class java/lang/Object, class kotlinx/coroutines/CoroutineScope, top, top, class ext/mods/gameserver/GameServer, int, long, int, class java/lang/Iterable, top, top, top, top, top, top, int, class java/util/Iterator, top, top, top, top, top, class java/lang/Object ]
          stack = []
        frame_type = 251 /* same_frame_extended */
          offset_delta = 64
        frame_type = 255 /* full_frame */
          offset_delta = 79
          locals = [ class ext/mods/gameserver/GameServer$loadParallel$2, class java/lang/Object, class kotlinx/coroutines/CoroutineScope, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, class java/lang/Object ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 31
          locals = [ class ext/mods/gameserver/GameServer$loadParallel$2, class java/lang/Object, class kotlinx/coroutines/CoroutineScope, top, top, class ext/mods/gameserver/GameServer, int, long, int, top, top, top, top, top, top, top, top, top, top, top, top, top, top, class java/lang/Object ]
          stack = [ class java/lang/Object ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/GameServer$loadParallel$2, class java/lang/Object, class kotlinx/coroutines/CoroutineScope, top, top, class ext/mods/gameserver/GameServer, int, long, int, class java/lang/Iterable, top, top, top, top, top, top, int, class java/util/Iterator, top, top, top, top, top, class java/lang/Object ]
          stack = []
        frame_type = 251 /* same_frame_extended */
          offset_delta = 64
        frame_type = 255 /* full_frame */
          offset_delta = 124
          locals = [ class ext/mods/gameserver/GameServer$loadParallel$2, class java/lang/Object, class kotlinx/coroutines/CoroutineScope, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, class java/lang/Object ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 31
          locals = [ class ext/mods/gameserver/GameServer$loadParallel$2, class java/lang/Object, class kotlinx/coroutines/CoroutineScope, top, top, class ext/mods/gameserver/GameServer, int, long, int, top, top, top, top, top, top, top, top, top, top, top, top, top, top, class java/lang/Object ]
          stack = [ class java/lang/Object ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/GameServer$loadParallel$2, class java/lang/Object, class kotlinx/coroutines/CoroutineScope, top, top, class ext/mods/gameserver/GameServer, int, long, int, class java/lang/Iterable, top, top, top, top, top, top, int, class java/util/Iterator, top, top, top, top, top, class java/lang/Object ]
          stack = []
        frame_type = 251 /* same_frame_extended */
          offset_delta = 64
        frame_type = 255 /* full_frame */
          offset_delta = 145
          locals = [ class ext/mods/gameserver/GameServer$loadParallel$2, class java/lang/Object, class kotlinx/coroutines/CoroutineScope, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, class java/lang/Object ]
          stack = []
      LineNumberTable:
        line 399: 11
        line 400: 60
        line 401: 72
        line 704: 75
        line 705: 80
        line 402: 83
        line 706: 91
        line 707: 96
        line 402: 103
        line 707: 117
        line 708: 118
        line 402: 124
        line 404: 127
        line 405: 166
        line 404: 193
        line 403: 195
        line 406: 202
        line 399: 245
        line 709: 288
        line 406: 349
        line 709: 359
        line 710: 362
        line 408: 363
        line 409: 402
        line 408: 429
        line 410: 432
        line 408: 459
        line 407: 461
        line 411: 468
        line 399: 511
        line 711: 554
        line 411: 615
        line 711: 625
        line 712: 628
        line 413: 629
        line 412: 655
        line 414: 662
        line 399: 705
        line 713: 748
        line 414: 809
        line 713: 819
        line 714: 822
        line 416: 823
        line 415: 849
        line 417: 856
        line 399: 899
        line 715: 942
        line 417: 1003
        line 715: 1013
        line 716: 1016
        line 419: 1017
        line 420: 1056
        line 419: 1083
        line 418: 1085
        line 421: 1092
        line 399: 1138
        line 717: 1181
        line 421: 1242
        line 717: 1252
        line 718: 1255
        line 422: 1256
        line 719: 1264
        line 720: 1269
        line 422: 1276
        line 720: 1290
        line 721: 1291
        line 422: 1297
        line 423: 1300
        line 425: 1312
        line 705: 1313
        line 722: 1313
        line 401: 1319
        line 426: 1320
        line 426: 1370
        line 427: 1373
        line 428: 1397
        line 399: 1401
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          103       5    15 $i$a$-measureTimeMillis-GameServer$loadParallel$2$totalTime$1$1   I
           91      33    10 $i$f$measureTimeMillis   I
           96      28    11 start$iv   J
          326      33    20 $i$a$-forEach-GameServer$loadParallel$2$totalTime$1$4   I
          336      23    21  name   Ljava/lang/String;
          349      10    22    ms   J
          316      43    15 element$iv   Ljava/lang/Object;
          288      75    17 $i$f$forEach   I
          285      78    10 $this$forEach$iv   Ljava/lang/Iterable;
          592      33    20 $i$a$-forEach-GameServer$loadParallel$2$totalTime$1$8   I
          602      23    21  name   Ljava/lang/String;
          615      10    22    ms   J
          582      43    15 element$iv   Ljava/lang/Object;
          554      75    17 $i$f$forEach   I
          551      78    10 $this$forEach$iv   Ljava/lang/Iterable;
          786      33    20 $i$a$-forEach-GameServer$loadParallel$2$totalTime$1$10   I
          796      23    21  name   Ljava/lang/String;
          809      10    22    ms   J
          776      43    15 element$iv   Ljava/lang/Object;
          748      75    17 $i$f$forEach   I
          745      78    10 $this$forEach$iv   Ljava/lang/Iterable;
          980      33    20 $i$a$-forEach-GameServer$loadParallel$2$totalTime$1$12   I
          990      23    21  name   Ljava/lang/String;
         1003      10    22    ms   J
          970      43    15 element$iv   Ljava/lang/Object;
          942      75    17 $i$f$forEach   I
          939      78    10 $this$forEach$iv   Ljava/lang/Iterable;
         1219      33    20 $i$a$-forEach-GameServer$loadParallel$2$totalTime$1$15   I
         1229      23    21  name   Ljava/lang/String;
         1242      10    22    ms   J
         1209      43    15 element$iv   Ljava/lang/Object;
         1181      75    17 $i$f$forEach   I
         1178      78    10 $this$forEach$iv   Ljava/lang/Iterable;
         1276       5    15 $i$a$-measureTimeMillis-GameServer$loadParallel$2$totalTime$1$16   I
         1264      33    10 $i$f$measureTimeMillis   I
         1269      28    11 start$iv   J
           83     165     9 $i$a$-measureTimeMillis-GameServer$loadParallel$2$totalTime$1   I
           75     173     6 $i$f$measureTimeMillis   I
           80     168     7 start$iv   J
         1320      81     3 totalTime   J
            0    1412     0  this   Lext/mods/gameserver/GameServer$loadParallel$2;
            0    1412     1 $result   Ljava/lang/Object;
          266     248     6 $i$f$measureTimeMillis   I
          260     254     7 start$iv   J
          254     260     9 $i$a$-measureTimeMillis-GameServer$loadParallel$2$totalTime$1   I
          532     176     6 $i$f$measureTimeMillis   I
          526     182     7 start$iv   J
          520     188     9 $i$a$-measureTimeMillis-GameServer$loadParallel$2$totalTime$1   I
          726     176     6 $i$f$measureTimeMillis   I
          720     182     7 start$iv   J
          714     188     9 $i$a$-measureTimeMillis-GameServer$loadParallel$2$totalTime$1   I
          920     221     6 $i$f$measureTimeMillis   I
          914     227     7 start$iv   J
          908     233     9 $i$a$-measureTimeMillis-GameServer$loadParallel$2$totalTime$1   I
         1159     160     6 $i$f$measureTimeMillis   I
         1153     166     7 start$iv   J
         1147     166     9 $i$a$-measureTimeMillis-GameServer$loadParallel$2$totalTime$1   I
           11    1401     2 $this$coroutineScope   Lkotlinx/coroutines/CoroutineScope;

  public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object, kotlin.coroutines.Continuation<?>);
    descriptor: (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=4, locals=4, args_size=3
         0: new           #2                  // class ext/mods/gameserver/GameServer$loadParallel$2
         3: dup
         4: aload_0
         5: getfield      #14                 // Field this$0:Lext/mods/gameserver/GameServer;
         8: aload_2
         9: invokespecial #323                // Method "<init>":(Lext/mods/gameserver/GameServer;Lkotlin/coroutines/Continuation;)V
        12: astore_3
        13: aload_3
        14: aload_1
        15: putfield      #65                 // Field L$0:Ljava/lang/Object;
        18: aload_3
        19: checkcast     #325                // class kotlin/coroutines/Continuation
        22: areturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      23     0  this   Lext/mods/gameserver/GameServer$loadParallel$2;
            0      23     1 value   Ljava/lang/Object;
            0      23     2 $completion   Lkotlin/coroutines/Continuation;
    Signature: #322                         // (Ljava/lang/Object;Lkotlin/coroutines/Continuation<*>;)Lkotlin/coroutines/Continuation<Lkotlin/Unit;>;

  public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>);
    descriptor: (Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: aload_2
         3: invokevirtual #331                // Method create:(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
         6: checkcast     #2                  // class ext/mods/gameserver/GameServer$loadParallel$2
         9: getstatic     #111                // Field kotlin/Unit.INSTANCE:Lkotlin/Unit;
        12: invokevirtual #333                // Method invokeSuspend:(Ljava/lang/Object;)Ljava/lang/Object;
        15: areturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      16     0  this   Lext/mods/gameserver/GameServer$loadParallel$2;
            0      16     1    p1   Lkotlinx/coroutines/CoroutineScope;
            0      16     2    p2   Lkotlin/coroutines/Continuation;
    Signature: #329                         // (Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation<-Lkotlin/Unit;>;)Ljava/lang/Object;

  public java.lang.Object invoke(java.lang.Object, java.lang.Object);
    descriptor: (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    flags: (0x1041) ACC_PUBLIC, ACC_BRIDGE, ACC_SYNTHETIC
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: checkcast     #67                 // class kotlinx/coroutines/CoroutineScope
         5: aload_2
         6: checkcast     #325                // class kotlin/coroutines/Continuation
         9: invokevirtual #338                // Method invoke:(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
        12: areturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      13     0  this   Lext/mods/gameserver/GameServer$loadParallel$2;
            0      13     1    p1   Ljava/lang/Object;
            0      13     2    p2   Ljava/lang/Object;
}
InnerClasses:
  static final #2;                        // class ext/mods/gameserver/GameServer$loadParallel$2
  static final #127;                      // class ext/mods/gameserver/GameServer$loadParallel$2$totalTime$1$2
  static final #137;                      // class ext/mods/gameserver/GameServer$loadParallel$2$totalTime$1$3
  static final #192;                      // class ext/mods/gameserver/GameServer$loadParallel$2$totalTime$1$5
  static final #195;                      // class ext/mods/gameserver/GameServer$loadParallel$2$totalTime$1$6
  static final #201;                      // class ext/mods/gameserver/GameServer$loadParallel$2$totalTime$1$7
  static final #204;                      // class ext/mods/gameserver/GameServer$loadParallel$2$totalTime$1$9
  static final #210;                      // class ext/mods/gameserver/GameServer$loadParallel$2$totalTime$1$11
  static final #213;                      // class ext/mods/gameserver/GameServer$loadParallel$2$totalTime$1$13
  static final #216;                      // class ext/mods/gameserver/GameServer$loadParallel$2$totalTime$1$14
EnclosingMethod: #102.#351              // ext.mods.gameserver.GameServer.loadParallel
Signature: #3                           // Lkotlin/coroutines/jvm/internal/SuspendLambda;Lkotlin/jvm/functions/Function2<Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation<-Lkotlin/Unit;>;Ljava/lang/Object;>;
SourceFile: "GameServer.kt"
SourceDebugExtension:
  SMAP
  GameServer.kt
  Kotlin
  *S Kotlin
  *F
  + 1 GameServer.kt
  ext/mods/gameserver/GameServer$loadParallel$2
  + 2 Timing.kt
  kotlin/system/TimingKt
  + 3 _Collections.kt
  kotlin/collections/CollectionsKt___CollectionsKt
  *L
  1#1,703:1
  29#2,2:704
  29#2,3:706
  29#2,3:719
  31#2:722
  1915#3,2:709
  1915#3,2:711
  1915#3,2:713
  1915#3,2:715
  1915#3,2:717
  *S KotlinDebug
  *F
  + 1 GameServer.kt
  ext/mods/gameserver/GameServer$loadParallel$2
  *L
  401#1:704,2
  402#1:706,3
  422#1:719,3
  401#1:722
  406#1:709,2
  411#1:711,2
  414#1:713,2
  417#1:715,2
  421#1:717,2
  *E
RuntimeVisibleAnnotations:
  0: #32(#33=s#34,#35=[I#36,I#37,I#38,I#39,I#40],#41=[I#42,I#43,I#44,I#45,I#46],#47=[I#48,I#48,I#48,I#48,I#49,I#49,I#49,I#49,I#50,I#50,I#50,I#50,I#51,I#51,I#51,I#51,I#52,I#52,I#52,I#52],#53=[s#54,s#27,s#30,s#29,s#54,s#27,s#30,s#29,s#54,s#27,s#30,s#29,s#54,s#27,s#30,s#29,s#54,s#27,s#30,s#29],#55=[s#56,s#57,s#58,s#59,s#56,s#57,s#58,s#59,s#56,s#57,s#58,s#59,s#56,s#57,s#58,s#59,s#56,s#57,s#58,s#59],#60=s#23,#61=s#62,#63=I#50)
    kotlin.coroutines.jvm.internal.DebugMetadata(
      f="GameServer.kt"
      l=[406,411,414,417,421]
      nl=[709,711,713,715,717]
      i=[0,0,0,0,1,1,1,1,2,2,2,2,3,3,3,3,4,4,4,4]
      s=["L$0","I$0","J$0","I$1","L$0","I$0","J$0","I$1","L$0","I$0","J$0","I$1","L$0","I$0","J$0","I$1","L$0","I$0","J$0","I$1"]
      n=["$this$coroutineScope","$i$f$measureTimeMillis","start$iv","$i$a$-measureTimeMillis-GameServer$loadParallel$2$totalTime$1","$this$coroutineScope","$i$f$measureTimeMillis","start$iv","$i$a$-measureTimeMillis-GameServer$loadParallel$2$totalTime$1","$this$coroutineScope","$i$f$measureTimeMillis","start$iv","$i$a$-measureTimeMillis-GameServer$loadParallel$2$totalTime$1","$this$coroutineScope","$i$f$measureTimeMillis","start$iv","$i$a$-measureTimeMillis-GameServer$loadParallel$2$totalTime$1","$this$coroutineScope","$i$f$measureTimeMillis","start$iv","$i$a$-measureTimeMillis-GameServer$loadParallel$2$totalTime$1"]
      m="invokeSuspend"
      c="ext.mods.gameserver.GameServer$loadParallel$2"
      v=2
    )
  1: #339(#340=[I#50,I#51,I#48],#341=I#51,#342=I#343,#344=[s#345],#346=[s#347,s#348,s#319])
    kotlin.Metadata(
      mv=[2,3,0]
      k=3
      xi=48
      d1=["\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"]
      d2=["<anonymous>","","Lkotlinx/coroutines/CoroutineScope;"]
    )
RuntimeInvisibleAnnotations:
  0: #352(#326=[s#353])
    kotlin.jvm.internal.SourceDebugExtension(
      value=["SMAP\nGameServer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GameServer.kt\next/mods/gameserver/GameServer$loadParallel$2\n+ 2 Timing.kt\nkotlin/system/TimingKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,703:1\n29#2,2:704\n29#2,3:706\n29#2,3:719\n31#2:722\n1915#3,2:709\n1915#3,2:711\n1915#3,2:713\n1915#3,2:715\n1915#3,2:717\n*S KotlinDebug\n*F\n+ 1 GameServer.kt\next/mods/gameserver/GameServer$loadParallel$2\n*L\n401#1:704,2\n402#1:706,3\n422#1:719,3\n401#1:722\n406#1:709,2\n411#1:711,2\n414#1:713,2\n417#1:715,2\n421#1:717,2\n*E\n"]
    )
