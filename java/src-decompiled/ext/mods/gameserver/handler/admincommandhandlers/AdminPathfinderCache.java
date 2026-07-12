// Bytecode for: ext.mods.gameserver.handler.admincommandhandlers.AdminPathfinderCache
// File: ext\mods\gameserver\handler\admincommandhandlers\AdminPathfinderCache.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/admincommandhandlers/AdminPathfinderCache.class
  Last modified 9 de jul de 2026; size 8737 bytes
  MD5 checksum b40d6c141ab6ab9ad35603c0d8c6755c
  Compiled from "AdminPathfinderCache.java"
public class ext.mods.gameserver.handler.admincommandhandlers.AdminPathfinderCache implements ext.mods.gameserver.handler.IAdminCommandHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #16                         // ext/mods/gameserver/handler/admincommandhandlers/AdminPathfinderCache
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 1, methods: 14, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = String             #8            // admin_pathcache
    #8 = Utf8               admin_pathcache
    #9 = Methodref          #10.#11       // java/lang/String.startsWith:(Ljava/lang/String;)Z
   #10 = Class              #12           // java/lang/String
   #11 = NameAndType        #13:#14       // startsWith:(Ljava/lang/String;)Z
   #12 = Utf8               java/lang/String
   #13 = Utf8               startsWith
   #14 = Utf8               (Ljava/lang/String;)Z
   #15 = Methodref          #16.#17       // ext/mods/gameserver/handler/admincommandhandlers/AdminPathfinderCache.handlePathfinderCacheCommand:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
   #16 = Class              #18           // ext/mods/gameserver/handler/admincommandhandlers/AdminPathfinderCache
   #17 = NameAndType        #19:#20       // handlePathfinderCacheCommand:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
   #18 = Utf8               ext/mods/gameserver/handler/admincommandhandlers/AdminPathfinderCache
   #19 = Utf8               handlePathfinderCacheCommand
   #20 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
   #21 = Fieldref           #16.#22       // ext/mods/gameserver/handler/admincommandhandlers/AdminPathfinderCache.ADMIN_COMMANDS:[Ljava/lang/String;
   #22 = NameAndType        #23:#24       // ADMIN_COMMANDS:[Ljava/lang/String;
   #23 = Utf8               ADMIN_COMMANDS
   #24 = Utf8               [Ljava/lang/String;
   #25 = String             #26           //
   #26 = Utf8
   #27 = Methodref          #10.#28       // java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
   #28 = NameAndType        #29:#30       // split:(Ljava/lang/String;)[Ljava/lang/String;
   #29 = Utf8               split
   #30 = Utf8               (Ljava/lang/String;)[Ljava/lang/String;
   #31 = Methodref          #16.#32       // ext/mods/gameserver/handler/admincommandhandlers/AdminPathfinderCache.showHelp:(Lext/mods/gameserver/model/actor/Player;)V
   #32 = NameAndType        #33:#34       // showHelp:(Lext/mods/gameserver/model/actor/Player;)V
   #33 = Utf8               showHelp
   #34 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
   #35 = Methodref          #10.#36       // java/lang/String.toLowerCase:()Ljava/lang/String;
   #36 = NameAndType        #37:#38       // toLowerCase:()Ljava/lang/String;
   #37 = Utf8               toLowerCase
   #38 = Utf8               ()Ljava/lang/String;
   #39 = Methodref          #10.#40       // java/lang/String.hashCode:()I
   #40 = NameAndType        #41:#42       // hashCode:()I
   #41 = Utf8               hashCode
   #42 = Utf8               ()I
   #43 = String             #44           // stats
   #44 = Utf8               stats
   #45 = Methodref          #10.#46       // java/lang/String.equals:(Ljava/lang/Object;)Z
   #46 = NameAndType        #47:#48       // equals:(Ljava/lang/Object;)Z
   #47 = Utf8               equals
   #48 = Utf8               (Ljava/lang/Object;)Z
   #49 = String             #50           // clear
   #50 = Utf8               clear
   #51 = String             #52           // save
   #52 = Utf8               save
   #53 = String             #54           // generate
   #54 = Utf8               generate
   #55 = String             #56           // cleanup
   #56 = Utf8               cleanup
   #57 = String             #58           // reload
   #58 = Utf8               reload
   #59 = String             #60           // test
   #60 = Utf8               test
   #61 = Methodref          #16.#62       // ext/mods/gameserver/handler/admincommandhandlers/AdminPathfinderCache.showCacheStatistics:(Lext/mods/gameserver/model/actor/Player;)V
   #62 = NameAndType        #63:#34       // showCacheStatistics:(Lext/mods/gameserver/model/actor/Player;)V
   #63 = Utf8               showCacheStatistics
   #64 = Methodref          #16.#65       // ext/mods/gameserver/handler/admincommandhandlers/AdminPathfinderCache.clearMemoryCache:(Lext/mods/gameserver/model/actor/Player;)V
   #65 = NameAndType        #66:#34       // clearMemoryCache:(Lext/mods/gameserver/model/actor/Player;)V
   #66 = Utf8               clearMemoryCache
   #67 = Methodref          #16.#68       // ext/mods/gameserver/handler/admincommandhandlers/AdminPathfinderCache.saveCacheToFiles:(Lext/mods/gameserver/model/actor/Player;)V
   #68 = NameAndType        #69:#34       // saveCacheToFiles:(Lext/mods/gameserver/model/actor/Player;)V
   #69 = Utf8               saveCacheToFiles
   #70 = Methodref          #16.#71       // ext/mods/gameserver/handler/admincommandhandlers/AdminPathfinderCache.generatePaths:(Lext/mods/gameserver/model/actor/Player;[Ljava/lang/String;)V
   #71 = NameAndType        #72:#73       // generatePaths:(Lext/mods/gameserver/model/actor/Player;[Ljava/lang/String;)V
   #72 = Utf8               generatePaths
   #73 = Utf8               (Lext/mods/gameserver/model/actor/Player;[Ljava/lang/String;)V
   #74 = Methodref          #16.#75       // ext/mods/gameserver/handler/admincommandhandlers/AdminPathfinderCache.cleanupOldFiles:(Lext/mods/gameserver/model/actor/Player;[Ljava/lang/String;)V
   #75 = NameAndType        #76:#73       // cleanupOldFiles:(Lext/mods/gameserver/model/actor/Player;[Ljava/lang/String;)V
   #76 = Utf8               cleanupOldFiles
   #77 = Methodref          #16.#78       // ext/mods/gameserver/handler/admincommandhandlers/AdminPathfinderCache.reloadCache:(Lext/mods/gameserver/model/actor/Player;)V
   #78 = NameAndType        #79:#34       // reloadCache:(Lext/mods/gameserver/model/actor/Player;)V
   #79 = Utf8               reloadCache
   #80 = Methodref          #16.#81       // ext/mods/gameserver/handler/admincommandhandlers/AdminPathfinderCache.testPathfinding:(Lext/mods/gameserver/model/actor/Player;)V
   #81 = NameAndType        #82:#34       // testPathfinding:(Lext/mods/gameserver/model/actor/Player;)V
   #82 = Utf8               testPathfinding
   #83 = String             #84           // === COMANDOS DE CACHE DE PATHFINDING ===
   #84 = Utf8               === COMANDOS DE CACHE DE PATHFINDING ===
   #85 = Methodref          #86.#87       // ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
   #86 = Class              #88           // ext/mods/gameserver/model/actor/Player
   #87 = NameAndType        #89:#90       // sendMessage:(Ljava/lang/String;)V
   #88 = Utf8               ext/mods/gameserver/model/actor/Player
   #89 = Utf8               sendMessage
   #90 = Utf8               (Ljava/lang/String;)V
   #91 = String             #92           // //pathcache stats - Mostra estatísticas do cache
   #92 = Utf8               //pathcache stats - Mostra estatísticas do cache
   #93 = String             #94           // //pathcache clear - Limpa cache em memória
   #94 = Utf8               //pathcache clear - Limpa cache em memória
   #95 = String             #96           // //pathcache save - Salva cache para arquivos
   #96 = Utf8               //pathcache save - Salva cache para arquivos
   #97 = String             #98           // //pathcache generate [distancia] - Gera rotas automaticamente
   #98 = Utf8               //pathcache generate [distancia] - Gera rotas automaticamente
   #99 = String             #100          // //pathcache cleanup [dias] - Remove arquivos antigos
  #100 = Utf8               //pathcache cleanup [dias] - Remove arquivos antigos
  #101 = String             #102          // //pathcache reload - Recarrega cache dos arquivos
  #102 = Utf8               //pathcache reload - Recarrega cache dos arquivos
  #103 = String             #104          // //pathcache test - Testa pathfinding entre duas posições
  #104 = Utf8               //pathcache test - Testa pathfinding entre duas posições
  #105 = Methodref          #106.#107     // ext/mods/gameserver/geoengine/pathfinding/PathfinderCache.getInstance:()Lext/mods/gameserver/geoengine/pathfinding/PathfinderCache;
  #106 = Class              #108          // ext/mods/gameserver/geoengine/pathfinding/PathfinderCache
  #107 = NameAndType        #109:#110     // getInstance:()Lext/mods/gameserver/geoengine/pathfinding/PathfinderCache;
  #108 = Utf8               ext/mods/gameserver/geoengine/pathfinding/PathfinderCache
  #109 = Utf8               getInstance
  #110 = Utf8               ()Lext/mods/gameserver/geoengine/pathfinding/PathfinderCache;
  #111 = Methodref          #106.#112     // ext/mods/gameserver/geoengine/pathfinding/PathfinderCache.getStatistics:()Lext/mods/gameserver/geoengine/pathfinding/PathfinderCache$CacheStatistics;
  #112 = NameAndType        #113:#114     // getStatistics:()Lext/mods/gameserver/geoengine/pathfinding/PathfinderCache$CacheStatistics;
  #113 = Utf8               getStatistics
  #114 = Utf8               ()Lext/mods/gameserver/geoengine/pathfinding/PathfinderCache$CacheStatistics;
  #115 = String             #116          // === ESTATÍSTICAS DO CACHE DE PATHFINDING ===
  #116 = Utf8               === ESTATÍSTICAS DO CACHE DE PATHFINDING ===
  #117 = Fieldref           #118.#119     // ext/mods/gameserver/geoengine/pathfinding/PathfinderCache$CacheStatistics.cacheHits:J
  #118 = Class              #120          // ext/mods/gameserver/geoengine/pathfinding/PathfinderCache$CacheStatistics
  #119 = NameAndType        #121:#122     // cacheHits:J
  #120 = Utf8               ext/mods/gameserver/geoengine/pathfinding/PathfinderCache$CacheStatistics
  #121 = Utf8               cacheHits
  #122 = Utf8               J
  #123 = InvokeDynamic      #0:#124       // #0:makeConcatWithConstants:(J)Ljava/lang/String;
  #124 = NameAndType        #125:#126     // makeConcatWithConstants:(J)Ljava/lang/String;
  #125 = Utf8               makeConcatWithConstants
  #126 = Utf8               (J)Ljava/lang/String;
  #127 = Fieldref           #118.#128     // ext/mods/gameserver/geoengine/pathfinding/PathfinderCache$CacheStatistics.cacheMisses:J
  #128 = NameAndType        #129:#122     // cacheMisses:J
  #129 = Utf8               cacheMisses
  #130 = InvokeDynamic      #1:#124       // #1:makeConcatWithConstants:(J)Ljava/lang/String;
  #131 = String             #132          // %.2f%%
  #132 = Utf8               %.2f%%
  #133 = Methodref          #118.#134     // ext/mods/gameserver/geoengine/pathfinding/PathfinderCache$CacheStatistics.getHitRatio:()D
  #134 = NameAndType        #135:#136     // getHitRatio:()D
  #135 = Utf8               getHitRatio
  #136 = Utf8               ()D
  #137 = Double             100.0d
  #139 = Methodref          #140.#141     // java/lang/Double.valueOf:(D)Ljava/lang/Double;
  #140 = Class              #142          // java/lang/Double
  #141 = NameAndType        #143:#144     // valueOf:(D)Ljava/lang/Double;
  #142 = Utf8               java/lang/Double
  #143 = Utf8               valueOf
  #144 = Utf8               (D)Ljava/lang/Double;
  #145 = Methodref          #10.#146      // java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
  #146 = NameAndType        #147:#148     // format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
  #147 = Utf8               format
  #148 = Utf8               (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
  #149 = InvokeDynamic      #2:#150       // #2:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #150 = NameAndType        #125:#151     // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #151 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
  #152 = Fieldref           #118.#153     // ext/mods/gameserver/geoengine/pathfinding/PathfinderCache$CacheStatistics.pathsGenerated:J
  #153 = NameAndType        #154:#122     // pathsGenerated:J
  #154 = Utf8               pathsGenerated
  #155 = InvokeDynamic      #3:#124       // #3:makeConcatWithConstants:(J)Ljava/lang/String;
  #156 = Fieldref           #118.#157     // ext/mods/gameserver/geoengine/pathfinding/PathfinderCache$CacheStatistics.pathsLoaded:J
  #157 = NameAndType        #158:#122     // pathsLoaded:J
  #158 = Utf8               pathsLoaded
  #159 = InvokeDynamic      #4:#124       // #4:makeConcatWithConstants:(J)Ljava/lang/String;
  #160 = Fieldref           #118.#161     // ext/mods/gameserver/geoengine/pathfinding/PathfinderCache$CacheStatistics.currentCacheSize:I
  #161 = NameAndType        #162:#163     // currentCacheSize:I
  #162 = Utf8               currentCacheSize
  #163 = Utf8               I
  #164 = Fieldref           #118.#165     // ext/mods/gameserver/geoengine/pathfinding/PathfinderCache$CacheStatistics.maxCacheSize:I
  #165 = NameAndType        #166:#163     // maxCacheSize:I
  #166 = Utf8               maxCacheSize
  #167 = InvokeDynamic      #5:#168       // #5:makeConcatWithConstants:(II)Ljava/lang/String;
  #168 = NameAndType        #125:#169     // makeConcatWithConstants:(II)Ljava/lang/String;
  #169 = Utf8               (II)Ljava/lang/String;
  #170 = String             #171          // %.1f%%
  #171 = Utf8               %.1f%%
  #172 = InvokeDynamic      #6:#150       // #6:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #173 = Methodref          #106.#174     // ext/mods/gameserver/geoengine/pathfinding/PathfinderCache.clearMemoryCache:()V
  #174 = NameAndType        #66:#6        // clearMemoryCache:()V
  #175 = String             #176          // Cache em memória limpo com sucesso!
  #176 = Utf8               Cache em memória limpo com sucesso!
  #177 = Methodref          #106.#178     // ext/mods/gameserver/geoengine/pathfinding/PathfinderCache.saveAllCacheToFiles:()V
  #178 = NameAndType        #179:#6       // saveAllCacheToFiles:()V
  #179 = Utf8               saveAllCacheToFiles
  #180 = String             #181          // Cache salvo para arquivos com sucesso!
  #181 = Utf8               Cache salvo para arquivos com sucesso!
  #182 = Methodref          #183.#184     // java/lang/Integer.parseInt:(Ljava/lang/String;)I
  #183 = Class              #185          // java/lang/Integer
  #184 = NameAndType        #186:#187     // parseInt:(Ljava/lang/String;)I
  #185 = Utf8               java/lang/Integer
  #186 = Utf8               parseInt
  #187 = Utf8               (Ljava/lang/String;)I
  #188 = Class              #189          // java/lang/NumberFormatException
  #189 = Utf8               java/lang/NumberFormatException
  #190 = InvokeDynamic      #7:#191       // #7:makeConcatWithConstants:(I)Ljava/lang/String;
  #191 = NameAndType        #125:#192     // makeConcatWithConstants:(I)Ljava/lang/String;
  #192 = Utf8               (I)Ljava/lang/String;
  #193 = InvokeDynamic      #8:#191       // #8:makeConcatWithConstants:(I)Ljava/lang/String;
  #194 = InvokeDynamic      #9:#195       // #9:run:(Lext/mods/gameserver/model/actor/Player;)Ljava/lang/Runnable;
  #195 = NameAndType        #196:#197     // run:(Lext/mods/gameserver/model/actor/Player;)Ljava/lang/Runnable;
  #196 = Utf8               run
  #197 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Ljava/lang/Runnable;
  #198 = Methodref          #199.#200     // ext/mods/commons/pool/ThreadPool.schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
  #199 = Class              #201          // ext/mods/commons/pool/ThreadPool
  #200 = NameAndType        #202:#203     // schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
  #201 = Utf8               ext/mods/commons/pool/ThreadPool
  #202 = Utf8               schedule
  #203 = Utf8               (Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
  #204 = InvokeDynamic      #10:#191      // #10:makeConcatWithConstants:(I)Ljava/lang/String;
  #205 = Methodref          #106.#206     // ext/mods/gameserver/geoengine/pathfinding/PathfinderCache.cleanupOldCacheFiles:(I)V
  #206 = NameAndType        #207:#208     // cleanupOldCacheFiles:(I)V
  #207 = Utf8               cleanupOldCacheFiles
  #208 = Utf8               (I)V
  #209 = InvokeDynamic      #11:#191      // #11:makeConcatWithConstants:(I)Ljava/lang/String;
  #210 = String             #211          // Cache será recarregado automaticamente na próxima busca!
  #211 = Utf8               Cache será recarregado automaticamente na próxima busca!
  #212 = Methodref          #86.#213      // ext/mods/gameserver/model/actor/Player.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
  #213 = NameAndType        #214:#215     // getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
  #214 = Utf8               getPosition
  #215 = Utf8               ()Lext/mods/gameserver/model/location/SpawnLocation;
  #216 = Class              #217          // ext/mods/gameserver/model/location/Location
  #217 = Utf8               ext/mods/gameserver/model/location/Location
  #218 = Methodref          #216.#219     // ext/mods/gameserver/model/location/Location.getX:()I
  #219 = NameAndType        #220:#42      // getX:()I
  #220 = Utf8               getX
  #221 = Methodref          #216.#222     // ext/mods/gameserver/model/location/Location.getY:()I
  #222 = NameAndType        #223:#42      // getY:()I
  #223 = Utf8               getY
  #224 = Methodref          #216.#225     // ext/mods/gameserver/model/location/Location.getZ:()I
  #225 = NameAndType        #226:#42      // getZ:()I
  #226 = Utf8               getZ
  #227 = Methodref          #216.#228     // ext/mods/gameserver/model/location/Location."<init>":(III)V
  #228 = NameAndType        #5:#229       // "<init>":(III)V
  #229 = Utf8               (III)V
  #230 = Methodref          #10.#231      // java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
  #231 = NameAndType        #143:#232     // valueOf:(Ljava/lang/Object;)Ljava/lang/String;
  #232 = Utf8               (Ljava/lang/Object;)Ljava/lang/String;
  #233 = InvokeDynamic      #12:#234      // #12:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #234 = NameAndType        #125:#235     // makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #235 = Utf8               (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #236 = Methodref          #106.#237     // ext/mods/gameserver/geoengine/pathfinding/PathfinderCache.getPath:(Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;Z)Ljava/util/List;
  #237 = NameAndType        #238:#239     // getPath:(Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;Z)Ljava/util/List;
  #238 = Utf8               getPath
  #239 = Utf8               (Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;Z)Ljava/util/List;
  #240 = InterfaceMethodref #241.#242     // java/util/List.isEmpty:()Z
  #241 = Class              #243          // java/util/List
  #242 = NameAndType        #244:#245     // isEmpty:()Z
  #243 = Utf8               java/util/List
  #244 = Utf8               isEmpty
  #245 = Utf8               ()Z
  #246 = InterfaceMethodref #241.#247     // java/util/List.size:()I
  #247 = NameAndType        #248:#42      // size:()I
  #248 = Utf8               size
  #249 = InvokeDynamic      #13:#191      // #13:makeConcatWithConstants:(I)Ljava/lang/String;
  #250 = InterfaceMethodref #241.#251     // java/util/List.get:(I)Ljava/lang/Object;
  #251 = NameAndType        #252:#253     // get:(I)Ljava/lang/Object;
  #252 = Utf8               get
  #253 = Utf8               (I)Ljava/lang/Object;
  #254 = InvokeDynamic      #14:#150      // #14:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #255 = InvokeDynamic      #15:#150      // #15:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #256 = String             #257          // Nenhuma rota encontrada!
  #257 = Utf8               Nenhuma rota encontrada!
  #258 = Methodref          #259.#260     // ext/mods/gameserver/geoengine/pathfinding/PathfinderGenerator.getInstance:()Lext/mods/gameserver/geoengine/pathfinding/PathfinderGenerator;
  #259 = Class              #261          // ext/mods/gameserver/geoengine/pathfinding/PathfinderGenerator
  #260 = NameAndType        #109:#262     // getInstance:()Lext/mods/gameserver/geoengine/pathfinding/PathfinderGenerator;
  #261 = Utf8               ext/mods/gameserver/geoengine/pathfinding/PathfinderGenerator
  #262 = Utf8               ()Lext/mods/gameserver/geoengine/pathfinding/PathfinderGenerator;
  #263 = Methodref          #259.#264     // ext/mods/gameserver/geoengine/pathfinding/PathfinderGenerator.generateStrategicWaypoints:()V
  #264 = NameAndType        #265:#6       // generateStrategicWaypoints:()V
  #265 = Utf8               generateStrategicWaypoints
  #266 = String             #267          // Geração de rotas concluída!
  #267 = Utf8               Geração de rotas concluída!
  #268 = Class              #269          // java/lang/Exception
  #269 = Utf8               java/lang/Exception
  #270 = Methodref          #268.#271     // java/lang/Exception.getMessage:()Ljava/lang/String;
  #271 = NameAndType        #272:#38      // getMessage:()Ljava/lang/String;
  #272 = Utf8               getMessage
  #273 = InvokeDynamic      #16:#150      // #16:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #274 = Class              #275          // ext/mods/gameserver/handler/IAdminCommandHandler
  #275 = Utf8               ext/mods/gameserver/handler/IAdminCommandHandler
  #276 = Utf8               Code
  #277 = Utf8               LineNumberTable
  #278 = Utf8               LocalVariableTable
  #279 = Utf8               this
  #280 = Utf8               Lext/mods/gameserver/handler/admincommandhandlers/AdminPathfinderCache;
  #281 = Utf8               useAdminCommand
  #282 = Utf8               command
  #283 = Utf8               Ljava/lang/String;
  #284 = Utf8               activeChar
  #285 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #286 = Utf8               StackMapTable
  #287 = Utf8               getAdminCommandList
  #288 = Utf8               ()[Ljava/lang/String;
  #289 = Utf8               parts
  #290 = Utf8               subCommand
  #291 = Class              #24           // "[Ljava/lang/String;"
  #292 = Utf8               cache
  #293 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/PathfinderCache;
  #294 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/PathfinderCache$CacheStatistics;
  #295 = Utf8               e
  #296 = Utf8               Ljava/lang/NumberFormatException;
  #297 = Utf8               maxDistance
  #298 = Utf8               maxAgeDays
  #299 = Utf8               currentPos
  #300 = Utf8               Lext/mods/gameserver/model/location/Location;
  #301 = Utf8               testPos
  #302 = Utf8               path
  #303 = Utf8               Ljava/util/List;
  #304 = Utf8               LocalVariableTypeTable
  #305 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/location/Location;>;
  #306 = Utf8               lambda$generatePaths$0
  #307 = Utf8               generator
  #308 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/PathfinderGenerator;
  #309 = Utf8               Ljava/lang/Exception;
  #310 = Utf8               <clinit>
  #311 = Utf8               SourceFile
  #312 = Utf8               AdminPathfinderCache.java
  #313 = Utf8               BootstrapMethods
  #314 = String             #315          // Cache Hits: \u0001
  #315 = Utf8               Cache Hits: \u0001
  #316 = String             #317          // Cache Misses: \u0001
  #317 = Utf8               Cache Misses: \u0001
  #318 = String             #319          // Taxa de Acerto: \u0001
  #319 = Utf8               Taxa de Acerto: \u0001
  #320 = String             #321          // Rotas Geradas: \u0001
  #321 = Utf8               Rotas Geradas: \u0001
  #322 = String             #323          // Rotas Carregadas: \u0001
  #323 = Utf8               Rotas Carregadas: \u0001
  #324 = String             #325          // Tamanho Atual: \u0001/\u0001
  #325 = Utf8               Tamanho Atual: \u0001/\u0001
  #326 = String             #327          // Uso da Memória: \u0001
  #327 = Utf8               Uso da Memória: \u0001
  #328 = String             #329          // Distância inválida. Usando padrão: \u0001
  #329 = Utf8               Distância inválida. Usando padrão: \u0001
  #330 = String             #331          // Iniciando geração de rotas (distância máxima: \u0001)...
  #331 = Utf8               Iniciando geração de rotas (distância máxima: \u0001)...
  #332 = MethodType         #6            //  ()V
  #333 = MethodHandle       6:#334        // REF_invokeStatic ext/mods/gameserver/handler/admincommandhandlers/AdminPathfinderCache.lambda$generatePaths$0:(Lext/mods/gameserver/model/actor/Player;)V
  #334 = Methodref          #16.#335      // ext/mods/gameserver/handler/admincommandhandlers/AdminPathfinderCache.lambda$generatePaths$0:(Lext/mods/gameserver/model/actor/Player;)V
  #335 = NameAndType        #306:#34      // lambda$generatePaths$0:(Lext/mods/gameserver/model/actor/Player;)V
  #336 = String             #337          // Idade inválida. Usando padrão: \u0001 dias
  #337 = Utf8               Idade inválida. Usando padrão: \u0001 dias
  #338 = String             #339          // Limpeza de arquivos antigos concluída (mais de \u0001 dias)!
  #339 = Utf8               Limpeza de arquivos antigos concluída (mais de \u0001 dias)!
  #340 = String             #341          // Testando pathfinding de \u0001 para \u0001
  #341 = Utf8               Testando pathfinding de \u0001 para \u0001
  #342 = String             #343          // Rota encontrada! Pontos: \u0001
  #343 = Utf8               Rota encontrada! Pontos: \u0001
  #344 = String             #345          // Primeiro ponto: \u0001
  #345 = Utf8               Primeiro ponto: \u0001
  #346 = String             #347          // Último ponto: \u0001
  #347 = Utf8               Último ponto: \u0001
  #348 = String             #349          // Erro durante geração de rotas: \u0001
  #349 = Utf8               Erro durante geração de rotas: \u0001
  #350 = MethodHandle       6:#351        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #351 = Methodref          #352.#353     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #352 = Class              #354          // java/lang/invoke/StringConcatFactory
  #353 = NameAndType        #125:#355     // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #354 = Utf8               java/lang/invoke/StringConcatFactory
  #355 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #356 = MethodHandle       6:#357        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #357 = Methodref          #358.#359     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #358 = Class              #360          // java/lang/invoke/LambdaMetafactory
  #359 = NameAndType        #361:#362     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #360 = Utf8               java/lang/invoke/LambdaMetafactory
  #361 = Utf8               metafactory
  #362 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #363 = Utf8               InnerClasses
  #364 = Utf8               CacheStatistics
  #365 = Class              #366          // java/lang/invoke/MethodHandles$Lookup
  #366 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #367 = Class              #368          // java/lang/invoke/MethodHandles
  #368 = Utf8               java/lang/invoke/MethodHandles
  #369 = Utf8               Lookup
{
  public ext.mods.gameserver.handler.admincommandhandlers.AdminPathfinderCache();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 40: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/handler/admincommandhandlers/AdminPathfinderCache;

  public void useAdminCommand(java.lang.String, ext.mods.gameserver.model.actor.Player);
    descriptor: (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=3
         0: aload_1
         1: ldc           #7                  // String admin_pathcache
         3: invokevirtual #9                  // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
         6: ifeq          15
         9: aload_0
        10: aload_1
        11: aload_2
        12: invokevirtual #15                 // Method handlePathfinderCacheCommand:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
        15: return
      LineNumberTable:
        line 48: 0
        line 49: 9
        line 51: 15
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      16     0  this   Lext/mods/gameserver/handler/admincommandhandlers/AdminPathfinderCache;
            0      16     1 command   Ljava/lang/String;
            0      16     2 activeChar   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 1
        frame_type = 15 /* same */

  public java.lang.String[] getAdminCommandList();
    descriptor: ()[Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #21                 // Field ADMIN_COMMANDS:[Ljava/lang/String;
         3: areturn
      LineNumberTable:
        line 55: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/handler/admincommandhandlers/AdminPathfinderCache;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: iconst_1
         1: anewarray     #10                 // class java/lang/String
         4: dup
         5: iconst_0
         6: ldc           #7                  // String admin_pathcache
         8: aastore
         9: putstatic     #21                 // Field ADMIN_COMMANDS:[Ljava/lang/String;
        12: return
      LineNumberTable:
        line 42: 0
}
SourceFile: "AdminPathfinderCache.java"
BootstrapMethods:
  0: #350 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #314 Cache Hits: \u0001
  1: #350 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #316 Cache Misses: \u0001
  2: #350 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #318 Taxa de Acerto: \u0001
  3: #350 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #320 Rotas Geradas: \u0001
  4: #350 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #322 Rotas Carregadas: \u0001
  5: #350 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #324 Tamanho Atual: \u0001/\u0001
  6: #350 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #326 Uso da Memória: \u0001
  7: #350 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #328 Distância inválida. Usando padrão: \u0001
  8: #350 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #330 Iniciando geração de rotas (distância máxima: \u0001)...
  9: #356 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #332 ()V
      #333 REF_invokeStatic ext/mods/gameserver/handler/admincommandhandlers/AdminPathfinderCache.lambda$generatePaths$0:(Lext/mods/gameserver/model/actor/Player;)V
      #332 ()V
  10: #350 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #336 Idade inválida. Usando padrão: \u0001 dias
  11: #350 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #338 Limpeza de arquivos antigos concluída (mais de \u0001 dias)!
  12: #350 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #340 Testando pathfinding de \u0001 para \u0001
  13: #350 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #342 Rota encontrada! Pontos: \u0001
  14: #350 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #344 Primeiro ponto: \u0001
  15: #350 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #346 Último ponto: \u0001
  16: #350 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #348 Erro durante geração de rotas: \u0001
InnerClasses:
  public static #364= #118 of #106;       // CacheStatistics=class ext/mods/gameserver/geoengine/pathfinding/PathfinderCache$CacheStatistics of class ext/mods/gameserver/geoengine/pathfinding/PathfinderCache
  public static final #369= #365 of #367; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
