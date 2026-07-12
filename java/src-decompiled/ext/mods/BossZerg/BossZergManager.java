// Bytecode for: ext.mods.BossZerg.BossZergManager
// File: ext\mods\BossZerg\BossZergManager.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/BossZerg/BossZergManager.class
  Last modified 9 de jul de 2026; size 19134 bytes
  MD5 checksum 9cf98514ce6bc4861b197760e652d210
  Compiled from "BossZergManager.java"
public final class ext.mods.BossZerg.BossZergManager
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #11                         // ext/mods/BossZerg/BossZergManager
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 2, methods: 25, attributes: 4
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Class              #8            // java/util/concurrent/ConcurrentHashMap
    #8 = Utf8               java/util/concurrent/ConcurrentHashMap
    #9 = Methodref          #7.#3         // java/util/concurrent/ConcurrentHashMap."<init>":()V
   #10 = Fieldref           #11.#12       // ext/mods/BossZerg/BossZergManager._bossStates:Ljava/util/Map;
   #11 = Class              #13           // ext/mods/BossZerg/BossZergManager
   #12 = NameAndType        #14:#15       // _bossStates:Ljava/util/Map;
   #13 = Utf8               ext/mods/BossZerg/BossZergManager
   #14 = Utf8               _bossStates
   #15 = Utf8               Ljava/util/Map;
   #16 = Methodref          #11.#17       // ext/mods/BossZerg/BossZergManager.start:()V
   #17 = NameAndType        #18:#6        // start:()V
   #18 = Utf8               start
   #19 = Fieldref           #20.#21       // ext/mods/Config.BOSS_ZERG_ENABLED:Z
   #20 = Class              #22           // ext/mods/Config
   #21 = NameAndType        #23:#24       // BOSS_ZERG_ENABLED:Z
   #22 = Utf8               ext/mods/Config
   #23 = Utf8               BOSS_ZERG_ENABLED
   #24 = Utf8               Z
   #25 = Long               1000l
   #27 = Fieldref           #20.#28       // ext/mods/Config.BOSS_ZERG_CHECK_INTERVAL_MS:J
   #28 = NameAndType        #29:#30       // BOSS_ZERG_CHECK_INTERVAL_MS:J
   #29 = Utf8               BOSS_ZERG_CHECK_INTERVAL_MS
   #30 = Utf8               J
   #31 = Methodref          #32.#33       // java/lang/Math.max:(JJ)J
   #32 = Class              #34           // java/lang/Math
   #33 = NameAndType        #35:#36       // max:(JJ)J
   #34 = Utf8               java/lang/Math
   #35 = Utf8               max
   #36 = Utf8               (JJ)J
   #37 = InvokeDynamic      #0:#38        // #0:run:(Lext/mods/BossZerg/BossZergManager;)Ljava/lang/Runnable;
   #38 = NameAndType        #39:#40       // run:(Lext/mods/BossZerg/BossZergManager;)Ljava/lang/Runnable;
   #39 = Utf8               run
   #40 = Utf8               (Lext/mods/BossZerg/BossZergManager;)Ljava/lang/Runnable;
   #41 = Methodref          #42.#43       // ext/mods/commons/pool/ThreadPool.scheduleAtFixedRate:(Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
   #42 = Class              #44           // ext/mods/commons/pool/ThreadPool
   #43 = NameAndType        #45:#46       // scheduleAtFixedRate:(Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
   #44 = Utf8               ext/mods/commons/pool/ThreadPool
   #45 = Utf8               scheduleAtFixedRate
   #46 = Utf8               (Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
   #47 = Fieldref           #11.#48       // ext/mods/BossZerg/BossZergManager.LOGGER:Lext/mods/commons/logging/CLogger;
   #48 = NameAndType        #49:#50       // LOGGER:Lext/mods/commons/logging/CLogger;
   #49 = Utf8               LOGGER
   #50 = Utf8               Lext/mods/commons/logging/CLogger;
   #51 = String             #52           // BossZerg: Manager iniciado (intervalo: {}ms).
   #52 = Utf8               BossZerg: Manager iniciado (intervalo: {}ms).
   #53 = Methodref          #54.#55       // java/lang/Long.valueOf:(J)Ljava/lang/Long;
   #54 = Class              #56           // java/lang/Long
   #55 = NameAndType        #57:#58       // valueOf:(J)Ljava/lang/Long;
   #56 = Utf8               java/lang/Long
   #57 = Utf8               valueOf
   #58 = Utf8               (J)Ljava/lang/Long;
   #59 = Methodref          #60.#61       // ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
   #60 = Class              #62           // ext/mods/commons/logging/CLogger
   #61 = NameAndType        #63:#64       // info:(Ljava/lang/Object;[Ljava/lang/Object;)V
   #62 = Utf8               ext/mods/commons/logging/CLogger
   #63 = Utf8               info
   #64 = Utf8               (Ljava/lang/Object;[Ljava/lang/Object;)V
   #65 = Class              #66           // java/util/HashSet
   #66 = Utf8               java/util/HashSet
   #67 = Methodref          #65.#3        // java/util/HashSet."<init>":()V
   #68 = Methodref          #69.#70       // ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
   #69 = Class              #71           // ext/mods/gameserver/model/World
   #70 = NameAndType        #72:#73       // getInstance:()Lext/mods/gameserver/model/World;
   #71 = Utf8               ext/mods/gameserver/model/World
   #72 = Utf8               getInstance
   #73 = Utf8               ()Lext/mods/gameserver/model/World;
   #74 = Methodref          #69.#75       // ext/mods/gameserver/model/World.getObjects:()Ljava/util/Collection;
   #75 = NameAndType        #76:#77       // getObjects:()Ljava/util/Collection;
   #76 = Utf8               getObjects
   #77 = Utf8               ()Ljava/util/Collection;
   #78 = InterfaceMethodref #79.#80       // java/util/Collection.iterator:()Ljava/util/Iterator;
   #79 = Class              #81           // java/util/Collection
   #80 = NameAndType        #82:#83       // iterator:()Ljava/util/Iterator;
   #81 = Utf8               java/util/Collection
   #82 = Utf8               iterator
   #83 = Utf8               ()Ljava/util/Iterator;
   #84 = InterfaceMethodref #85.#86       // java/util/Iterator.hasNext:()Z
   #85 = Class              #87           // java/util/Iterator
   #86 = NameAndType        #88:#89       // hasNext:()Z
   #87 = Utf8               java/util/Iterator
   #88 = Utf8               hasNext
   #89 = Utf8               ()Z
   #90 = InterfaceMethodref #85.#91       // java/util/Iterator.next:()Ljava/lang/Object;
   #91 = NameAndType        #92:#93       // next:()Ljava/lang/Object;
   #92 = Utf8               next
   #93 = Utf8               ()Ljava/lang/Object;
   #94 = Class              #95           // ext/mods/gameserver/model/WorldObject
   #95 = Utf8               ext/mods/gameserver/model/WorldObject
   #96 = Class              #97           // ext/mods/gameserver/model/actor/Npc
   #97 = Utf8               ext/mods/gameserver/model/actor/Npc
   #98 = Methodref          #96.#99       // ext/mods/gameserver/model/actor/Npc.isRaidBoss:()Z
   #99 = NameAndType        #100:#89      // isRaidBoss:()Z
  #100 = Utf8               isRaidBoss
  #101 = Methodref          #96.#102      // ext/mods/gameserver/model/actor/Npc.isDead:()Z
  #102 = NameAndType        #103:#89      // isDead:()Z
  #103 = Utf8               isDead
  #104 = Methodref          #96.#105      // ext/mods/gameserver/model/actor/Npc.getObjectId:()I
  #105 = NameAndType        #106:#107     // getObjectId:()I
  #106 = Utf8               getObjectId
  #107 = Utf8               ()I
  #108 = Methodref          #109.#110     // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
  #109 = Class              #111          // java/lang/Integer
  #110 = NameAndType        #57:#112      // valueOf:(I)Ljava/lang/Integer;
  #111 = Utf8               java/lang/Integer
  #112 = Utf8               (I)Ljava/lang/Integer;
  #113 = InvokeDynamic      #1:#114       // #1:apply:()Ljava/util/function/Function;
  #114 = NameAndType        #115:#116     // apply:()Ljava/util/function/Function;
  #115 = Utf8               apply
  #116 = Utf8               ()Ljava/util/function/Function;
  #117 = InterfaceMethodref #118.#119     // java/util/Map.computeIfAbsent:(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;
  #118 = Class              #120          // java/util/Map
  #119 = NameAndType        #121:#122     // computeIfAbsent:(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;
  #120 = Utf8               java/util/Map
  #121 = Utf8               computeIfAbsent
  #122 = Utf8               (Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;
  #123 = Class              #124          // ext/mods/BossZerg/BossZergManager$BossZergState
  #124 = Utf8               ext/mods/BossZerg/BossZergManager$BossZergState
  #125 = Methodref          #11.#126      // ext/mods/BossZerg/BossZergManager.processBoss:(Lext/mods/gameserver/model/actor/Npc;Lext/mods/BossZerg/BossZergManager$BossZergState;)V
  #126 = NameAndType        #127:#128     // processBoss:(Lext/mods/gameserver/model/actor/Npc;Lext/mods/BossZerg/BossZergManager$BossZergState;)V
  #127 = Utf8               processBoss
  #128 = Utf8               (Lext/mods/gameserver/model/actor/Npc;Lext/mods/BossZerg/BossZergManager$BossZergState;)V
  #129 = InterfaceMethodref #130.#131     // java/util/Set.add:(Ljava/lang/Object;)Z
  #130 = Class              #132          // java/util/Set
  #131 = NameAndType        #133:#134     // add:(Ljava/lang/Object;)Z
  #132 = Utf8               java/util/Set
  #133 = Utf8               add
  #134 = Utf8               (Ljava/lang/Object;)Z
  #135 = Methodref          #11.#136      // ext/mods/BossZerg/BossZergManager.cleanupRemovedBosses:(Ljava/util/Set;)V
  #136 = NameAndType        #137:#138     // cleanupRemovedBosses:(Ljava/util/Set;)V
  #137 = Utf8               cleanupRemovedBosses
  #138 = Utf8               (Ljava/util/Set;)V
  #139 = Methodref          #11.#140      // ext/mods/BossZerg/BossZergManager.isBossIgnored:(Lext/mods/gameserver/model/actor/Npc;)Z
  #140 = NameAndType        #141:#142     // isBossIgnored:(Lext/mods/gameserver/model/actor/Npc;)Z
  #141 = Utf8               isBossIgnored
  #142 = Utf8               (Lext/mods/gameserver/model/actor/Npc;)Z
  #143 = Methodref          #11.#144      // ext/mods/BossZerg/BossZergManager.applyPvpFlagAndPreview:(Lext/mods/gameserver/model/actor/Npc;Lext/mods/BossZerg/BossZergManager$BossZergState;)V
  #144 = NameAndType        #145:#128     // applyPvpFlagAndPreview:(Lext/mods/gameserver/model/actor/Npc;Lext/mods/BossZerg/BossZergManager$BossZergState;)V
  #145 = Utf8               applyPvpFlagAndPreview
  #146 = Methodref          #11.#147      // ext/mods/BossZerg/BossZergManager.clearFlagPreview:(Lext/mods/BossZerg/BossZergManager$BossZergState;)V
  #147 = NameAndType        #148:#149     // clearFlagPreview:(Lext/mods/BossZerg/BossZergManager$BossZergState;)V
  #148 = Utf8               clearFlagPreview
  #149 = Utf8               (Lext/mods/BossZerg/BossZergManager$BossZergState;)V
  #150 = Fieldref           #20.#151      // ext/mods/Config.BOSS_ZERG_RANGE:I
  #151 = NameAndType        #152:#153     // BOSS_ZERG_RANGE:I
  #152 = Utf8               BOSS_ZERG_RANGE
  #153 = Utf8               I
  #154 = Methodref          #11.#155      // ext/mods/BossZerg/BossZergManager.collectPartiesNearBoss:(Lext/mods/gameserver/model/actor/Npc;I)Ljava/util/Map;
  #155 = NameAndType        #156:#157     // collectPartiesNearBoss:(Lext/mods/gameserver/model/actor/Npc;I)Ljava/util/Map;
  #156 = Utf8               collectPartiesNearBoss
  #157 = Utf8               (Lext/mods/gameserver/model/actor/Npc;I)Ljava/util/Map;
  #158 = InterfaceMethodref #118.#159     // java/util/Map.values:()Ljava/util/Collection;
  #159 = NameAndType        #160:#77      // values:()Ljava/util/Collection;
  #160 = Utf8               values
  #161 = Class              #162          // ext/mods/BossZerg/BossZergManager$PartyPresence
  #162 = Utf8               ext/mods/BossZerg/BossZergManager$PartyPresence
  #163 = Fieldref           #161.#164     // ext/mods/BossZerg/BossZergManager$PartyPresence.players:Ljava/util/List;
  #164 = NameAndType        #165:#166     // players:Ljava/util/List;
  #165 = Utf8               players
  #166 = Utf8               Ljava/util/List;
  #167 = InterfaceMethodref #168.#169     // java/util/List.size:()I
  #168 = Class              #170          // java/util/List
  #169 = NameAndType        #171:#107     // size:()I
  #170 = Utf8               java/util/List
  #171 = Utf8               size
  #172 = Fieldref           #20.#173      // ext/mods/Config.BOSS_ZERG_MIN_PARTY_SIZE:I
  #173 = NameAndType        #174:#153     // BOSS_ZERG_MIN_PARTY_SIZE:I
  #174 = Utf8               BOSS_ZERG_MIN_PARTY_SIZE
  #175 = Fieldref           #161.#176     // ext/mods/BossZerg/BossZergManager$PartyPresence.party:Lext/mods/gameserver/model/group/Party;
  #176 = NameAndType        #177:#178     // party:Lext/mods/gameserver/model/group/Party;
  #177 = Utf8               party
  #178 = Utf8               Lext/mods/gameserver/model/group/Party;
  #179 = Methodref          #180.#181     // ext/mods/gameserver/model/group/Party.getLeaderObjectId:()I
  #180 = Class              #182          // ext/mods/gameserver/model/group/Party
  #181 = NameAndType        #183:#107     // getLeaderObjectId:()I
  #182 = Utf8               ext/mods/gameserver/model/group/Party
  #183 = Utf8               getLeaderObjectId
  #184 = Methodref          #161.#185     // ext/mods/BossZerg/BossZergManager$PartyPresence.getPlayerIds:()Ljava/util/Set;
  #185 = NameAndType        #186:#187     // getPlayerIds:()Ljava/util/Set;
  #186 = Utf8               getPlayerIds
  #187 = Utf8               ()Ljava/util/Set;
  #188 = InterfaceMethodref #130.#189     // java/util/Set.addAll:(Ljava/util/Collection;)Z
  #189 = NameAndType        #190:#191     // addAll:(Ljava/util/Collection;)Z
  #190 = Utf8               addAll
  #191 = Utf8               (Ljava/util/Collection;)Z
  #192 = Methodref          #11.#193      // ext/mods/BossZerg/BossZergManager.maybeAnnounceZerg:(Lext/mods/gameserver/model/actor/Npc;Lext/mods/BossZerg/BossZergManager$BossZergState;Lext/mods/BossZerg/BossZergManager$PartyPresence;)V
  #193 = NameAndType        #194:#195     // maybeAnnounceZerg:(Lext/mods/gameserver/model/actor/Npc;Lext/mods/BossZerg/BossZergManager$BossZergState;Lext/mods/BossZerg/BossZergManager$PartyPresence;)V
  #194 = Utf8               maybeAnnounceZerg
  #195 = Utf8               (Lext/mods/gameserver/model/actor/Npc;Lext/mods/BossZerg/BossZergManager$BossZergState;Lext/mods/BossZerg/BossZergManager$PartyPresence;)V
  #196 = Methodref          #123.#197     // ext/mods/BossZerg/BossZergManager$BossZergState.replaceZergPlayers:(Ljava/util/Set;)V
  #197 = NameAndType        #198:#138     // replaceZergPlayers:(Ljava/util/Set;)V
  #198 = Utf8               replaceZergPlayers
  #199 = Methodref          #123.#200     // ext/mods/BossZerg/BossZergManager$BossZergState.replaceActiveParties:(Ljava/util/Set;)V
  #200 = NameAndType        #201:#138     // replaceActiveParties:(Ljava/util/Set;)V
  #201 = Utf8               replaceActiveParties
  #202 = Methodref          #11.#203      // ext/mods/BossZerg/BossZergManager.updateZergAreaPreview:(Lext/mods/gameserver/model/actor/Npc;Lext/mods/BossZerg/BossZergManager$BossZergState;Z)V
  #203 = NameAndType        #204:#205     // updateZergAreaPreview:(Lext/mods/gameserver/model/actor/Npc;Lext/mods/BossZerg/BossZergManager$BossZergState;Z)V
  #204 = Utf8               updateZergAreaPreview
  #205 = Utf8               (Lext/mods/gameserver/model/actor/Npc;Lext/mods/BossZerg/BossZergManager$BossZergState;Z)V
  #206 = Methodref          #11.#207      // ext/mods/BossZerg/BossZergManager.clearPreview:(Lext/mods/BossZerg/BossZergManager$BossZergState;)V
  #207 = NameAndType        #208:#149     // clearPreview:(Lext/mods/BossZerg/BossZergManager$BossZergState;)V
  #208 = Utf8               clearPreview
  #209 = Class              #210          // ext/mods/gameserver/model/actor/Player
  #210 = Utf8               ext/mods/gameserver/model/actor/Player
  #211 = Methodref          #96.#212      // ext/mods/gameserver/model/actor/Npc.getKnownTypeInRadius:(Ljava/lang/Class;I)Ljava/util/List;
  #212 = NameAndType        #213:#214     // getKnownTypeInRadius:(Ljava/lang/Class;I)Ljava/util/List;
  #213 = Utf8               getKnownTypeInRadius
  #214 = Utf8               (Ljava/lang/Class;I)Ljava/util/List;
  #215 = Methodref          #123.#216     // ext/mods/BossZerg/BossZergManager$BossZergState.updateEntryTimes:(Ljava/util/List;)V
  #216 = NameAndType        #217:#218     // updateEntryTimes:(Ljava/util/List;)V
  #217 = Utf8               updateEntryTimes
  #218 = Utf8               (Ljava/util/List;)V
  #219 = Class              #220          // java/util/HashMap
  #220 = Utf8               java/util/HashMap
  #221 = Methodref          #219.#3       // java/util/HashMap."<init>":()V
  #222 = InterfaceMethodref #168.#80      // java/util/List.iterator:()Ljava/util/Iterator;
  #223 = Methodref          #209.#224     // ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
  #224 = NameAndType        #225:#226     // getClan:()Lext/mods/gameserver/model/pledge/Clan;
  #225 = Utf8               getClan
  #226 = Utf8               ()Lext/mods/gameserver/model/pledge/Clan;
  #227 = Methodref          #209.#228     // ext/mods/gameserver/model/actor/Player.getAllyId:()I
  #228 = NameAndType        #229:#107     // getAllyId:()I
  #229 = Utf8               getAllyId
  #230 = Methodref          #209.#231     // ext/mods/gameserver/model/actor/Player.getClanId:()I
  #231 = NameAndType        #232:#107     // getClanId:()I
  #232 = Utf8               getClanId
  #233 = InvokeDynamic      #2:#114       // #2:apply:()Ljava/util/function/Function;
  #234 = InterfaceMethodref #168.#131     // java/util/List.add:(Ljava/lang/Object;)Z
  #235 = Methodref          #11.#236      // ext/mods/BossZerg/BossZergManager.announceAllyCount:(Ljava/util/Map;Z)V
  #236 = NameAndType        #237:#238     // announceAllyCount:(Ljava/util/Map;Z)V
  #237 = Utf8               announceAllyCount
  #238 = Utf8               (Ljava/util/Map;Z)V
  #239 = InterfaceMethodref #118.#240     // java/util/Map.entrySet:()Ljava/util/Set;
  #240 = NameAndType        #241:#187     // entrySet:()Ljava/util/Set;
  #241 = Utf8               entrySet
  #242 = InterfaceMethodref #130.#80      // java/util/Set.iterator:()Ljava/util/Iterator;
  #243 = Class              #244          // java/util/Map$Entry
  #244 = Utf8               java/util/Map$Entry
  #245 = InterfaceMethodref #243.#246     // java/util/Map$Entry.getValue:()Ljava/lang/Object;
  #246 = NameAndType        #247:#93      // getValue:()Ljava/lang/Object;
  #247 = Utf8               getValue
  #248 = Fieldref           #20.#249      // ext/mods/Config.BOSS_ZERG_MAX_ALLY_MEMBERS:I
  #249 = NameAndType        #250:#153     // BOSS_ZERG_MAX_ALLY_MEMBERS:I
  #250 = Utf8               BOSS_ZERG_MAX_ALLY_MEMBERS
  #251 = InvokeDynamic      #3:#252       // #3:applyAsLong:(Lext/mods/BossZerg/BossZergManager$BossZergState;)Ljava/util/function/ToLongFunction;
  #252 = NameAndType        #253:#254     // applyAsLong:(Lext/mods/BossZerg/BossZergManager$BossZergState;)Ljava/util/function/ToLongFunction;
  #253 = Utf8               applyAsLong
  #254 = Utf8               (Lext/mods/BossZerg/BossZergManager$BossZergState;)Ljava/util/function/ToLongFunction;
  #255 = InterfaceMethodref #256.#257     // java/util/Comparator.comparingLong:(Ljava/util/function/ToLongFunction;)Ljava/util/Comparator;
  #256 = Class              #258          // java/util/Comparator
  #257 = NameAndType        #259:#260     // comparingLong:(Ljava/util/function/ToLongFunction;)Ljava/util/Comparator;
  #258 = Utf8               java/util/Comparator
  #259 = Utf8               comparingLong
  #260 = Utf8               (Ljava/util/function/ToLongFunction;)Ljava/util/Comparator;
  #261 = InterfaceMethodref #168.#262     // java/util/List.sort:(Ljava/util/Comparator;)V
  #262 = NameAndType        #263:#264     // sort:(Ljava/util/Comparator;)V
  #263 = Utf8               sort
  #264 = Utf8               (Ljava/util/Comparator;)V
  #265 = InterfaceMethodref #168.#266     // java/util/List.get:(I)Ljava/lang/Object;
  #266 = NameAndType        #267:#268     // get:(I)Ljava/lang/Object;
  #267 = Utf8               get
  #268 = Utf8               (I)Ljava/lang/Object;
  #269 = Methodref          #96.#270      // ext/mods/gameserver/model/actor/Npc.getName:()Ljava/lang/String;
  #270 = NameAndType        #271:#272     // getName:()Ljava/lang/String;
  #271 = Utf8               getName
  #272 = Utf8               ()Ljava/lang/String;
  #273 = Methodref          #11.#274      // ext/mods/BossZerg/BossZergManager.teleportExcessPlayer:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
  #274 = NameAndType        #275:#276     // teleportExcessPlayer:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
  #275 = Utf8               teleportExcessPlayer
  #276 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
  #277 = Methodref          #209.#278     // ext/mods/gameserver/model/actor/Player.isOnline:()Z
  #278 = NameAndType        #279:#89      // isOnline:()Z
  #279 = Utf8               isOnline
  #280 = Methodref          #209.#281     // ext/mods/gameserver/model/actor/Player.isTeleporting:()Z
  #281 = NameAndType        #282:#89      // isTeleporting:()Z
  #282 = Utf8               isTeleporting
  #283 = InvokeDynamic      #4:#284       // #4:makeConcatWithConstants:(ILjava/lang/String;)Ljava/lang/String;
  #284 = NameAndType        #285:#286     // makeConcatWithConstants:(ILjava/lang/String;)Ljava/lang/String;
  #285 = Utf8               makeConcatWithConstants
  #286 = Utf8               (ILjava/lang/String;)Ljava/lang/String;
  #287 = Methodref          #209.#288     // ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
  #288 = NameAndType        #289:#290     // sendMessage:(Ljava/lang/String;)V
  #289 = Utf8               sendMessage
  #290 = Utf8               (Ljava/lang/String;)V
  #291 = String             #292          // Você entrou por último e foi removido para manter o equilíbrio.
  #292 = Utf8               Você entrou por último e foi removido para manter o equilíbrio.
  #293 = Methodref          #294.#295     // ext/mods/gameserver/data/xml/RestartPointData.getInstance:()Lext/mods/gameserver/data/xml/RestartPointData;
  #294 = Class              #296          // ext/mods/gameserver/data/xml/RestartPointData
  #295 = NameAndType        #72:#297      // getInstance:()Lext/mods/gameserver/data/xml/RestartPointData;
  #296 = Utf8               ext/mods/gameserver/data/xml/RestartPointData
  #297 = Utf8               ()Lext/mods/gameserver/data/xml/RestartPointData;
  #298 = Methodref          #294.#299     // ext/mods/gameserver/data/xml/RestartPointData.getNearestRestartLocation:(Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/model/location/Location;
  #299 = NameAndType        #300:#301     // getNearestRestartLocation:(Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/model/location/Location;
  #300 = Utf8               getNearestRestartLocation
  #301 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/model/location/Location;
  #302 = Methodref          #209.#303     // ext/mods/gameserver/model/actor/Player.teleToLocation:(Lext/mods/gameserver/model/location/Location;)V
  #303 = NameAndType        #304:#305     // teleToLocation:(Lext/mods/gameserver/model/location/Location;)V
  #304 = Utf8               teleToLocation
  #305 = Utf8               (Lext/mods/gameserver/model/location/Location;)V
  #306 = Methodref          #307.#228     // ext/mods/gameserver/model/pledge/Clan.getAllyId:()I
  #307 = Class              #308          // ext/mods/gameserver/model/pledge/Clan
  #308 = Utf8               ext/mods/gameserver/model/pledge/Clan
  #309 = Methodref          #307.#310     // ext/mods/gameserver/model/pledge/Clan.getAllyName:()Ljava/lang/String;
  #310 = NameAndType        #311:#272     // getAllyName:()Ljava/lang/String;
  #311 = Utf8               getAllyName
  #312 = String             #313          // N/A
  #313 = Utf8               N/A
  #314 = String             #315          // BossZerg: Player {} (Ally: {}) teleportado do Boss {}. Limite excedido.
  #315 = Utf8               BossZerg: Player {} (Ally: {}) teleportado do Boss {}. Limite excedido.
  #316 = Methodref          #209.#270     // ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
  #317 = Fieldref           #20.#318      // ext/mods/Config.BOSS_ZERG_FLAG_ENABLED:Z
  #318 = NameAndType        #319:#24      // BOSS_ZERG_FLAG_ENABLED:Z
  #319 = Utf8               BOSS_ZERG_FLAG_ENABLED
  #320 = Fieldref           #20.#321      // ext/mods/Config.BOSS_ZERG_FLAG_RANGE:I
  #321 = NameAndType        #322:#153     // BOSS_ZERG_FLAG_RANGE:I
  #322 = Utf8               BOSS_ZERG_FLAG_RANGE
  #323 = Methodref          #32.#324      // java/lang/Math.max:(II)I
  #324 = NameAndType        #35:#325      // max:(II)I
  #325 = Utf8               (II)I
  #326 = Fieldref           #20.#327      // ext/mods/Config.BOSS_ZERG_FLAG_RENEW_MS:J
  #327 = NameAndType        #328:#30      // BOSS_ZERG_FLAG_RENEW_MS:J
  #328 = Utf8               BOSS_ZERG_FLAG_RENEW_MS
  #329 = Fieldref           #20.#330      // ext/mods/Config.BOSS_ZERG_FLAG_MIN_PLAYERS:I
  #330 = NameAndType        #331:#153     // BOSS_ZERG_FLAG_MIN_PLAYERS:I
  #331 = Utf8               BOSS_ZERG_FLAG_MIN_PLAYERS
  #332 = Fieldref           #20.#333      // ext/mods/Config.BOSS_ZERG_FLAG_AREA_ENABLED:Z
  #333 = NameAndType        #334:#24      // BOSS_ZERG_FLAG_AREA_ENABLED:Z
  #334 = Utf8               BOSS_ZERG_FLAG_AREA_ENABLED
  #335 = Fieldref           #20.#336      // ext/mods/Config.BOSS_ZERG_FLAG_WARNING_RANGE:I
  #336 = NameAndType        #337:#153     // BOSS_ZERG_FLAG_WARNING_RANGE:I
  #337 = Utf8               BOSS_ZERG_FLAG_WARNING_RANGE
  #338 = Class              #339          // java/awt/Color
  #339 = Utf8               java/awt/Color
  #340 = Fieldref           #20.#341      // ext/mods/Config.BOSS_ZERG_FLAG_AREA_COLOR:I
  #341 = NameAndType        #342:#153     // BOSS_ZERG_FLAG_AREA_COLOR:I
  #342 = Utf8               BOSS_ZERG_FLAG_AREA_COLOR
  #343 = Methodref          #338.#344     // java/awt/Color."<init>":(I)V
  #344 = NameAndType        #5:#345       // "<init>":(I)V
  #345 = Utf8               (I)V
  #346 = Fieldref           #20.#347      // ext/mods/Config.BOSS_ZERG_FLAG_AREA_RADIUS:I
  #347 = NameAndType        #348:#153     // BOSS_ZERG_FLAG_AREA_RADIUS:I
  #348 = Utf8               BOSS_ZERG_FLAG_AREA_RADIUS
  #349 = Methodref          #209.#105     // ext/mods/gameserver/model/actor/Player.getObjectId:()I
  #350 = Methodref          #351.#352     // ext/mods/gameserver/model/entity/autofarm/ZoneBuilder.getInstance:()Lext/mods/gameserver/model/entity/autofarm/ZoneBuilder;
  #351 = Class              #353          // ext/mods/gameserver/model/entity/autofarm/ZoneBuilder
  #352 = NameAndType        #72:#354      // getInstance:()Lext/mods/gameserver/model/entity/autofarm/ZoneBuilder;
  #353 = Utf8               ext/mods/gameserver/model/entity/autofarm/ZoneBuilder
  #354 = Utf8               ()Lext/mods/gameserver/model/entity/autofarm/ZoneBuilder;
  #355 = Methodref          #96.#356      // ext/mods/gameserver/model/actor/Npc.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
  #356 = NameAndType        #357:#358     // getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
  #357 = Utf8               getPosition
  #358 = Utf8               ()Lext/mods/gameserver/model/location/SpawnLocation;
  #359 = Methodref          #351.#360     // ext/mods/gameserver/model/entity/autofarm/ZoneBuilder.previewCylinder:(Lext/mods/gameserver/model/actor/Player;ILjava/awt/Color;Lext/mods/gameserver/model/location/Location;)V
  #360 = NameAndType        #361:#362     // previewCylinder:(Lext/mods/gameserver/model/actor/Player;ILjava/awt/Color;Lext/mods/gameserver/model/location/Location;)V
  #361 = Utf8               previewCylinder
  #362 = Utf8               (Lext/mods/gameserver/model/actor/Player;ILjava/awt/Color;Lext/mods/gameserver/model/location/Location;)V
  #363 = Methodref          #11.#364      // ext/mods/BossZerg/BossZergManager.clearFlagPreviewForMissingPlayers:(Lext/mods/BossZerg/BossZergManager$BossZergState;Ljava/util/Set;)V
  #364 = NameAndType        #365:#366     // clearFlagPreviewForMissingPlayers:(Lext/mods/BossZerg/BossZergManager$BossZergState;Ljava/util/Set;)V
  #365 = Utf8               clearFlagPreviewForMissingPlayers
  #366 = Utf8               (Lext/mods/BossZerg/BossZergManager$BossZergState;Ljava/util/Set;)V
  #367 = Methodref          #123.#368     // ext/mods/BossZerg/BossZergManager$BossZergState.replaceFlagPreviewPlayers:(Ljava/util/Set;)V
  #368 = NameAndType        #369:#138     // replaceFlagPreviewPlayers:(Ljava/util/Set;)V
  #369 = Utf8               replaceFlagPreviewPlayers
  #370 = Methodref          #371.#372     // ext/mods/gameserver/taskmanager/PvpFlagTaskManager.getInstance:()Lext/mods/gameserver/taskmanager/PvpFlagTaskManager;
  #371 = Class              #373          // ext/mods/gameserver/taskmanager/PvpFlagTaskManager
  #372 = NameAndType        #72:#374      // getInstance:()Lext/mods/gameserver/taskmanager/PvpFlagTaskManager;
  #373 = Utf8               ext/mods/gameserver/taskmanager/PvpFlagTaskManager
  #374 = Utf8               ()Lext/mods/gameserver/taskmanager/PvpFlagTaskManager;
  #375 = Methodref          #371.#376     // ext/mods/gameserver/taskmanager/PvpFlagTaskManager.add:(Lext/mods/gameserver/model/actor/Player;J)V
  #376 = NameAndType        #133:#377     // add:(Lext/mods/gameserver/model/actor/Player;J)V
  #377 = Utf8               (Lext/mods/gameserver/model/actor/Player;J)V
  #378 = Fieldref           #20.#379      // ext/mods/Config.BOSS_ZERG_SHOW_ALLY_COUNT:Z
  #379 = NameAndType        #380:#24      // BOSS_ZERG_SHOW_ALLY_COUNT:Z
  #380 = Utf8               BOSS_ZERG_SHOW_ALLY_COUNT
  #381 = InterfaceMethodref #118.#382     // java/util/Map.isEmpty:()Z
  #382 = NameAndType        #383:#89      // isEmpty:()Z
  #383 = Utf8               isEmpty
  #384 = InvokeDynamic      #5:#385       // #5:makeConcatWithConstants:(II)Ljava/lang/String;
  #385 = NameAndType        #285:#386     // makeConcatWithConstants:(II)Ljava/lang/String;
  #386 = Utf8               (II)Ljava/lang/String;
  #387 = Class              #388          // ext/mods/gameserver/network/serverpackets/ExShowScreenMessage
  #388 = Utf8               ext/mods/gameserver/network/serverpackets/ExShowScreenMessage
  #389 = Fieldref           #390.#391     // ext/mods/gameserver/network/serverpackets/ExShowScreenMessage$SMPOS.TOP_CENTER:Lext/mods/gameserver/network/serverpackets/ExShowScreenMessage$SMPOS;
  #390 = Class              #392          // ext/mods/gameserver/network/serverpackets/ExShowScreenMessage$SMPOS
  #391 = NameAndType        #393:#394     // TOP_CENTER:Lext/mods/gameserver/network/serverpackets/ExShowScreenMessage$SMPOS;
  #392 = Utf8               ext/mods/gameserver/network/serverpackets/ExShowScreenMessage$SMPOS
  #393 = Utf8               TOP_CENTER
  #394 = Utf8               Lext/mods/gameserver/network/serverpackets/ExShowScreenMessage$SMPOS;
  #395 = Methodref          #387.#396     // ext/mods/gameserver/network/serverpackets/ExShowScreenMessage."<init>":(Ljava/lang/String;ILext/mods/gameserver/network/serverpackets/ExShowScreenMessage$SMPOS;Z)V
  #396 = NameAndType        #5:#397       // "<init>":(Ljava/lang/String;ILext/mods/gameserver/network/serverpackets/ExShowScreenMessage$SMPOS;Z)V
  #397 = Utf8               (Ljava/lang/String;ILext/mods/gameserver/network/serverpackets/ExShowScreenMessage$SMPOS;Z)V
  #398 = Methodref          #209.#399     // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #399 = NameAndType        #400:#401     // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #400 = Utf8               sendPacket
  #401 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #402 = Fieldref           #20.#403      // ext/mods/Config.BOSS_ZERG_IGNORED_BOSS_IDS:Ljava/util/Set;
  #403 = NameAndType        #404:#405     // BOSS_ZERG_IGNORED_BOSS_IDS:Ljava/util/Set;
  #404 = Utf8               BOSS_ZERG_IGNORED_BOSS_IDS
  #405 = Utf8               Ljava/util/Set;
  #406 = Methodref          #96.#407      // ext/mods/gameserver/model/actor/Npc.getNpcId:()I
  #407 = NameAndType        #408:#107     // getNpcId:()I
  #408 = Utf8               getNpcId
  #409 = InterfaceMethodref #130.#410     // java/util/Set.contains:(Ljava/lang/Object;)Z
  #410 = NameAndType        #411:#134     // contains:(Ljava/lang/Object;)Z
  #411 = Utf8               contains
  #412 = Methodref          #209.#413     // ext/mods/gameserver/model/actor/Player.getParty:()Lext/mods/gameserver/model/group/Party;
  #413 = NameAndType        #414:#415     // getParty:()Lext/mods/gameserver/model/group/Party;
  #414 = Utf8               getParty
  #415 = Utf8               ()Lext/mods/gameserver/model/group/Party;
  #416 = InvokeDynamic      #6:#417       // #6:apply:(Lext/mods/gameserver/model/group/Party;)Ljava/util/function/Function;
  #417 = NameAndType        #115:#418     // apply:(Lext/mods/gameserver/model/group/Party;)Ljava/util/function/Function;
  #418 = Utf8               (Lext/mods/gameserver/model/group/Party;)Ljava/util/function/Function;
  #419 = Methodref          #161.#420     // ext/mods/BossZerg/BossZergManager$PartyPresence.addPlayer:(Lext/mods/gameserver/model/actor/Player;)V
  #420 = NameAndType        #421:#422     // addPlayer:(Lext/mods/gameserver/model/actor/Player;)V
  #421 = Utf8               addPlayer
  #422 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
  #423 = Fieldref           #20.#424      // ext/mods/Config.BOSS_ZERG_ANNOUNCE:Z
  #424 = NameAndType        #425:#24      // BOSS_ZERG_ANNOUNCE:Z
  #425 = Utf8               BOSS_ZERG_ANNOUNCE
  #426 = Methodref          #427.#428     // java/lang/System.currentTimeMillis:()J
  #427 = Class              #429          // java/lang/System
  #428 = NameAndType        #430:#431     // currentTimeMillis:()J
  #429 = Utf8               java/lang/System
  #430 = Utf8               currentTimeMillis
  #431 = Utf8               ()J
  #432 = Fieldref           #123.#433     // ext/mods/BossZerg/BossZergManager$BossZergState.partyAnnounceTimes:Ljava/util/Map;
  #433 = NameAndType        #434:#15      // partyAnnounceTimes:Ljava/util/Map;
  #434 = Utf8               partyAnnounceTimes
  #435 = InterfaceMethodref #118.#436     // java/util/Map.getOrDefault:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #436 = NameAndType        #437:#438     // getOrDefault:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #437 = Utf8               getOrDefault
  #438 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #439 = Methodref          #54.#440      // java/lang/Long.longValue:()J
  #440 = NameAndType        #441:#431     // longValue:()J
  #441 = Utf8               longValue
  #442 = Fieldref           #20.#443      // ext/mods/Config.BOSS_ZERG_ANNOUNCE_COOLDOWN_MS:J
  #443 = NameAndType        #444:#30      // BOSS_ZERG_ANNOUNCE_COOLDOWN_MS:J
  #444 = Utf8               BOSS_ZERG_ANNOUNCE_COOLDOWN_MS
  #445 = InterfaceMethodref #118.#446     // java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #446 = NameAndType        #447:#438     // put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #447 = Utf8               put
  #448 = Methodref          #161.#449     // ext/mods/BossZerg/BossZergManager$PartyPresence.getDominantClanName:()Ljava/lang/String;
  #449 = NameAndType        #450:#272     // getDominantClanName:()Ljava/lang/String;
  #450 = Utf8               getDominantClanName
  #451 = Methodref          #452.#382     // java/lang/String.isEmpty:()Z
  #452 = Class              #453          // java/lang/String
  #453 = Utf8               java/lang/String
  #454 = InvokeDynamic      #7:#455       // #7:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #455 = NameAndType        #285:#456     // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #456 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
  #457 = InvokeDynamic      #8:#458       // #8:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #458 = NameAndType        #285:#459     // makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #459 = Utf8               (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #460 = Methodref          #69.#461      // ext/mods/gameserver/model/World.announceToOnlinePlayers:(Ljava/lang/String;Z)V
  #461 = NameAndType        #462:#463     // announceToOnlinePlayers:(Ljava/lang/String;Z)V
  #462 = Utf8               announceToOnlinePlayers
  #463 = Utf8               (Ljava/lang/String;Z)V
  #464 = Fieldref           #20.#465      // ext/mods/Config.BOSS_ZERG_SHOW_AREA:Z
  #465 = NameAndType        #466:#24      // BOSS_ZERG_SHOW_AREA:Z
  #466 = Utf8               BOSS_ZERG_SHOW_AREA
  #467 = Fieldref           #20.#468      // ext/mods/Config.BOSS_ZERG_AREA_RADIUS:I
  #468 = NameAndType        #469:#153     // BOSS_ZERG_AREA_RADIUS:I
  #469 = Utf8               BOSS_ZERG_AREA_RADIUS
  #470 = Methodref          #123.#471     // ext/mods/BossZerg/BossZergManager$BossZergState.isFlagPreviewPlayer:(I)Z
  #471 = NameAndType        #472:#473     // isFlagPreviewPlayer:(I)Z
  #472 = Utf8               isFlagPreviewPlayer
  #473 = Utf8               (I)Z
  #474 = Fieldref           #338.#475     // java/awt/Color.RED:Ljava/awt/Color;
  #475 = NameAndType        #476:#477     // RED:Ljava/awt/Color;
  #476 = Utf8               RED
  #477 = Utf8               Ljava/awt/Color;
  #478 = Methodref          #11.#479      // ext/mods/BossZerg/BossZergManager.clearPreviewForMissingPlayers:(Lext/mods/BossZerg/BossZergManager$BossZergState;Ljava/util/Set;)V
  #479 = NameAndType        #480:#366     // clearPreviewForMissingPlayers:(Lext/mods/BossZerg/BossZergManager$BossZergState;Ljava/util/Set;)V
  #480 = Utf8               clearPreviewForMissingPlayers
  #481 = Methodref          #123.#482     // ext/mods/BossZerg/BossZergManager$BossZergState.replacePreviewPlayers:(Ljava/util/Set;)V
  #482 = NameAndType        #483:#138     // replacePreviewPlayers:(Ljava/util/Set;)V
  #483 = Utf8               replacePreviewPlayers
  #484 = Fieldref           #123.#485     // ext/mods/BossZerg/BossZergManager$BossZergState.previewPlayers:Ljava/util/Set;
  #485 = NameAndType        #486:#405     // previewPlayers:Ljava/util/Set;
  #486 = Utf8               previewPlayers
  #487 = InterfaceMethodref #130.#382     // java/util/Set.isEmpty:()Z
  #488 = Methodref          #109.#489     // java/lang/Integer.intValue:()I
  #489 = NameAndType        #490:#107     // intValue:()I
  #490 = Utf8               intValue
  #491 = Methodref          #69.#492      // ext/mods/gameserver/model/World.getPlayer:(I)Lext/mods/gameserver/model/actor/Player;
  #492 = NameAndType        #493:#494     // getPlayer:(I)Lext/mods/gameserver/model/actor/Player;
  #493 = Utf8               getPlayer
  #494 = Utf8               (I)Lext/mods/gameserver/model/actor/Player;
  #495 = Methodref          #351.#496     // ext/mods/gameserver/model/entity/autofarm/ZoneBuilder.clearCylinderPreview:(Lext/mods/gameserver/model/actor/Player;)V
  #496 = NameAndType        #497:#422     // clearCylinderPreview:(Lext/mods/gameserver/model/actor/Player;)V
  #497 = Utf8               clearCylinderPreview
  #498 = InterfaceMethodref #130.#499     // java/util/Set.clear:()V
  #499 = NameAndType        #500:#6       // clear:()V
  #500 = Utf8               clear
  #501 = Fieldref           #123.#502     // ext/mods/BossZerg/BossZergManager$BossZergState.flagPreviewPlayers:Ljava/util/Set;
  #502 = NameAndType        #503:#405     // flagPreviewPlayers:Ljava/util/Set;
  #503 = Utf8               flagPreviewPlayers
  #504 = Class              #505          // java/util/ArrayList
  #505 = Utf8               java/util/ArrayList
  #506 = Methodref          #504.#3       // java/util/ArrayList."<init>":()V
  #507 = InterfaceMethodref #243.#508     // java/util/Map$Entry.getKey:()Ljava/lang/Object;
  #508 = NameAndType        #509:#93      // getKey:()Ljava/lang/Object;
  #509 = Utf8               getKey
  #510 = InterfaceMethodref #118.#511     // java/util/Map.remove:(Ljava/lang/Object;)Ljava/lang/Object;
  #511 = NameAndType        #512:#513     // remove:(Ljava/lang/Object;)Ljava/lang/Object;
  #512 = Utf8               remove
  #513 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
  #514 = Methodref          #123.#515     // ext/mods/BossZerg/BossZergManager$BossZergState.isZergPlayer:(I)Z
  #515 = NameAndType        #516:#473     // isZergPlayer:(I)Z
  #516 = Utf8               isZergPlayer
  #517 = Fieldref           #20.#518      // ext/mods/Config.BOSS_ZERG_HEAL_PENALTY_ENABLED:Z
  #518 = NameAndType        #519:#24      // BOSS_ZERG_HEAL_PENALTY_ENABLED:Z
  #519 = Utf8               BOSS_ZERG_HEAL_PENALTY_ENABLED
  #520 = Methodref          #11.#521      // ext/mods/BossZerg/BossZergManager.isPlayerInZerg:(Lext/mods/gameserver/model/actor/Player;)Z
  #521 = NameAndType        #522:#523     // isPlayerInZerg:(Lext/mods/gameserver/model/actor/Player;)Z
  #522 = Utf8               isPlayerInZerg
  #523 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Z
  #524 = Fieldref           #20.#525      // ext/mods/Config.BOSS_ZERG_HEAL_PENALTY_MULTIPLIER:D
  #525 = NameAndType        #526:#527     // BOSS_ZERG_HEAL_PENALTY_MULTIPLIER:D
  #526 = Utf8               BOSS_ZERG_HEAL_PENALTY_MULTIPLIER
  #527 = Utf8               D
  #528 = Methodref          #11.#529      // ext/mods/BossZerg/BossZergManager.hasPrayerEffect:(Lext/mods/gameserver/model/actor/Player;)Z
  #529 = NameAndType        #530:#523     // hasPrayerEffect:(Lext/mods/gameserver/model/actor/Player;)Z
  #530 = Utf8               hasPrayerEffect
  #531 = Fieldref           #20.#532      // ext/mods/Config.BOSS_ZERG_PRAYER_REVERSE_MULTIPLIER:D
  #532 = NameAndType        #533:#527     // BOSS_ZERG_PRAYER_REVERSE_MULTIPLIER:D
  #533 = Utf8               BOSS_ZERG_PRAYER_REVERSE_MULTIPLIER
  #534 = Methodref          #32.#535      // java/lang/Math.max:(DD)D
  #535 = NameAndType        #35:#536      // max:(DD)D
  #536 = Utf8               (DD)D
  #537 = Fieldref           #20.#538      // ext/mods/Config.BOSS_ZERG_PRAYER_SKILL_IDS:[I
  #538 = NameAndType        #539:#540     // BOSS_ZERG_PRAYER_SKILL_IDS:[I
  #539 = Utf8               BOSS_ZERG_PRAYER_SKILL_IDS
  #540 = Utf8               [I
  #541 = Methodref          #209.#542     // ext/mods/gameserver/model/actor/Player.getFirstEffect:(I)Lext/mods/gameserver/skills/AbstractEffect;
  #542 = NameAndType        #543:#544     // getFirstEffect:(I)Lext/mods/gameserver/skills/AbstractEffect;
  #543 = Utf8               getFirstEffect
  #544 = Utf8               (I)Lext/mods/gameserver/skills/AbstractEffect;
  #545 = Fieldref           #546.#547     // ext/mods/BossZerg/BossZergManager$SingletonHolder.INSTANCE:Lext/mods/BossZerg/BossZergManager;
  #546 = Class              #548          // ext/mods/BossZerg/BossZergManager$SingletonHolder
  #547 = NameAndType        #549:#550     // INSTANCE:Lext/mods/BossZerg/BossZergManager;
  #548 = Utf8               ext/mods/BossZerg/BossZergManager$SingletonHolder
  #549 = Utf8               INSTANCE
  #550 = Utf8               Lext/mods/BossZerg/BossZergManager;
  #551 = Methodref          #161.#552     // ext/mods/BossZerg/BossZergManager$PartyPresence."<init>":(Lext/mods/gameserver/model/group/Party;)V
  #552 = NameAndType        #5:#553       // "<init>":(Lext/mods/gameserver/model/group/Party;)V
  #553 = Utf8               (Lext/mods/gameserver/model/group/Party;)V
  #554 = Fieldref           #123.#555     // ext/mods/BossZerg/BossZergManager$BossZergState.playerEntryTimes:Ljava/util/Map;
  #555 = NameAndType        #556:#15      // playerEntryTimes:Ljava/util/Map;
  #556 = Utf8               playerEntryTimes
  #557 = Methodref          #123.#3       // ext/mods/BossZerg/BossZergManager$BossZergState."<init>":()V
  #558 = Methodref          #559.#270     // java/lang/Class.getName:()Ljava/lang/String;
  #559 = Class              #560          // java/lang/Class
  #560 = Utf8               java/lang/Class
  #561 = Methodref          #60.#562      // ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
  #562 = NameAndType        #5:#290       // "<init>":(Ljava/lang/String;)V
  #563 = Utf8               Signature
  #564 = Utf8               Ljava/util/Map<Ljava/lang/Integer;Lext/mods/BossZerg/BossZergManager$BossZergState;>;
  #565 = Utf8               Code
  #566 = Utf8               LineNumberTable
  #567 = Utf8               LocalVariableTable
  #568 = Utf8               this
  #569 = Utf8               interval
  #570 = Utf8               StackMapTable
  #571 = Utf8               tick
  #572 = Utf8               boss
  #573 = Utf8               Lext/mods/gameserver/model/actor/Npc;
  #574 = Utf8               state
  #575 = Utf8               Lext/mods/BossZerg/BossZergManager$BossZergState;
  #576 = Utf8               object
  #577 = Utf8               Lext/mods/gameserver/model/WorldObject;
  #578 = Utf8               activeBossIds
  #579 = Utf8               LocalVariableTypeTable
  #580 = Utf8               Ljava/util/Set<Ljava/lang/Integer;>;
  #581 = Utf8               presence
  #582 = Utf8               Lext/mods/BossZerg/BossZergManager$PartyPresence;
  #583 = Utf8               groupId
  #584 = Utf8               player
  #585 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #586 = Utf8               excessPlayer
  #587 = Utf8               i
  #588 = Utf8               members
  #589 = Utf8               entry
  #590 = Utf8               Ljava/util/Map$Entry;
  #591 = Utf8               ignoreBoss
  #592 = Utf8               parties
  #593 = Utf8               zergPlayers
  #594 = Utf8               activePartyLeaders
  #595 = Utf8               zergActive
  #596 = Utf8               playersInRange
  #597 = Utf8               groupMap
  #598 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/actor/Player;>;
  #599 = Utf8               Ljava/util/Map$Entry<Ljava/lang/Integer;Ljava/util/List<Lext/mods/gameserver/model/actor/Player;>;>;
  #600 = Utf8               Ljava/util/Map<Ljava/lang/Integer;Lext/mods/BossZerg/BossZergManager$PartyPresence;>;
  #601 = Utf8               Ljava/util/Map<Ljava/lang/Integer;Ljava/util/List<Lext/mods/gameserver/model/actor/Player;>;>;
  #602 = Utf8               bossName
  #603 = Utf8               Ljava/lang/String;
  #604 = Utf8               restartLocation
  #605 = Utf8               Lext/mods/gameserver/model/location/Location;
  #606 = Utf8               clan
  #607 = Utf8               Lext/mods/gameserver/model/pledge/Clan;
  #608 = Utf8               allyName
  #609 = Class              #610          // ext/mods/gameserver/model/location/Location
  #610 = Utf8               ext/mods/gameserver/model/location/Location
  #611 = Utf8               previewColor
  #612 = Utf8               previewRadius
  #613 = Utf8               warningRange
  #614 = Utf8               previewRange
  #615 = Utf8               warningPlayers
  #616 = Utf8               newPreviewPlayers
  #617 = Utf8               range
  #618 = Utf8               flagTime
  #619 = Utf8               nearbyPlayers
  #620 = Utf8               minPlayers
  #621 = Utf8               groupSize
  #622 = Utf8               message
  #623 = Utf8               packet
  #624 = Utf8               Lext/mods/gameserver/network/serverpackets/ExShowScreenMessage;
  #625 = Utf8               (Ljava/util/Map<Ljava/lang/Integer;Ljava/util/List<Lext/mods/gameserver/model/actor/Player;>;>;Z)V
  #626 = Utf8               partyId
  #627 = Utf8               (Lext/mods/gameserver/model/actor/Npc;I)Ljava/util/Map<Ljava/lang/Integer;Lext/mods/BossZerg/BossZergManager$PartyPresence;>;
  #628 = Utf8               now
  #629 = Utf8               lastAnnounce
  #630 = Utf8               clanName
  #631 = Utf8               radius
  #632 = Utf8               playerId
  #633 = Utf8               Ljava/lang/Integer;
  #634 = Utf8               (Lext/mods/BossZerg/BossZergManager$BossZergState;Ljava/util/Set<Ljava/lang/Integer;>;)V
  #635 = Utf8               bossId
  #636 = Utf8               toRemove
  #637 = Utf8               Ljava/util/Map$Entry<Ljava/lang/Integer;Lext/mods/BossZerg/BossZergManager$BossZergState;>;
  #638 = Utf8               Ljava/util/List<Ljava/lang/Integer;>;
  #639 = Utf8               (Ljava/util/Set<Ljava/lang/Integer;>;)V
  #640 = Utf8               applyHealPenalty
  #641 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;D)D
  #642 = Utf8               targetPlayer
  #643 = Utf8               casterPlayer
  #644 = Utf8               effector
  #645 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #646 = Utf8               effected
  #647 = Utf8               amount
  #648 = Utf8               result
  #649 = Utf8               skillId
  #650 = Class              #540          // "[I"
  #651 = Utf8               ()Lext/mods/BossZerg/BossZergManager;
  #652 = Utf8               lambda$collectPartiesNearBoss$0
  #653 = Utf8               (Lext/mods/gameserver/model/group/Party;Ljava/lang/Integer;)Lext/mods/BossZerg/BossZergManager$PartyPresence;
  #654 = Utf8               id
  #655 = Utf8               lambda$processBoss$1
  #656 = Utf8               (Lext/mods/BossZerg/BossZergManager$BossZergState;Lext/mods/gameserver/model/actor/Player;)J
  #657 = Utf8               lambda$processBoss$0
  #658 = Utf8               (Ljava/lang/Integer;)Ljava/util/List;
  #659 = Utf8               k
  #660 = Utf8               lambda$tick$0
  #661 = Utf8               (Ljava/lang/Integer;)Lext/mods/BossZerg/BossZergManager$BossZergState;
  #662 = Utf8               <clinit>
  #663 = Utf8               SourceFile
  #664 = Utf8               BossZergManager.java
  #665 = Utf8               NestMembers
  #666 = Utf8               BootstrapMethods
  #667 = MethodType         #6            //  ()V
  #668 = MethodHandle       5:#669        // REF_invokeVirtual ext/mods/BossZerg/BossZergManager.tick:()V
  #669 = Methodref          #11.#670      // ext/mods/BossZerg/BossZergManager.tick:()V
  #670 = NameAndType        #571:#6       // tick:()V
  #671 = MethodType         #513          //  (Ljava/lang/Object;)Ljava/lang/Object;
  #672 = MethodHandle       6:#673        // REF_invokeStatic ext/mods/BossZerg/BossZergManager.lambda$tick$0:(Ljava/lang/Integer;)Lext/mods/BossZerg/BossZergManager$BossZergState;
  #673 = Methodref          #11.#674      // ext/mods/BossZerg/BossZergManager.lambda$tick$0:(Ljava/lang/Integer;)Lext/mods/BossZerg/BossZergManager$BossZergState;
  #674 = NameAndType        #660:#661     // lambda$tick$0:(Ljava/lang/Integer;)Lext/mods/BossZerg/BossZergManager$BossZergState;
  #675 = MethodType         #661          //  (Ljava/lang/Integer;)Lext/mods/BossZerg/BossZergManager$BossZergState;
  #676 = MethodHandle       6:#677        // REF_invokeStatic ext/mods/BossZerg/BossZergManager.lambda$processBoss$0:(Ljava/lang/Integer;)Ljava/util/List;
  #677 = Methodref          #11.#678      // ext/mods/BossZerg/BossZergManager.lambda$processBoss$0:(Ljava/lang/Integer;)Ljava/util/List;
  #678 = NameAndType        #657:#658     // lambda$processBoss$0:(Ljava/lang/Integer;)Ljava/util/List;
  #679 = MethodType         #658          //  (Ljava/lang/Integer;)Ljava/util/List;
  #680 = MethodType         #681          //  (Ljava/lang/Object;)J
  #681 = Utf8               (Ljava/lang/Object;)J
  #682 = MethodHandle       6:#683        // REF_invokeStatic ext/mods/BossZerg/BossZergManager.lambda$processBoss$1:(Lext/mods/BossZerg/BossZergManager$BossZergState;Lext/mods/gameserver/model/actor/Player;)J
  #683 = Methodref          #11.#684      // ext/mods/BossZerg/BossZergManager.lambda$processBoss$1:(Lext/mods/BossZerg/BossZergManager$BossZergState;Lext/mods/gameserver/model/actor/Player;)J
  #684 = NameAndType        #655:#656     // lambda$processBoss$1:(Lext/mods/BossZerg/BossZergManager$BossZergState;Lext/mods/gameserver/model/actor/Player;)J
  #685 = MethodType         #686          //  (Lext/mods/gameserver/model/actor/Player;)J
  #686 = Utf8               (Lext/mods/gameserver/model/actor/Player;)J
  #687 = String             #688          // Sua Aliança/Clã excedeu o limite de \u0001 membros para o \u0001.
  #688 = Utf8               Sua Aliança/Clã excedeu o limite de \u0001 membros para o \u0001.
  #689 = String             #690          // Ally/Clan no Boss: \u0001/\u0001
  #690 = Utf8               Ally/Clan no Boss: \u0001/\u0001
  #691 = MethodHandle       6:#692        // REF_invokeStatic ext/mods/BossZerg/BossZergManager.lambda$collectPartiesNearBoss$0:(Lext/mods/gameserver/model/group/Party;Ljava/lang/Integer;)Lext/mods/BossZerg/BossZergManager$PartyPresence;
  #692 = Methodref          #11.#693      // ext/mods/BossZerg/BossZergManager.lambda$collectPartiesNearBoss$0:(Lext/mods/gameserver/model/group/Party;Ljava/lang/Integer;)Lext/mods/BossZerg/BossZergManager$PartyPresence;
  #693 = NameAndType        #652:#653     // lambda$collectPartiesNearBoss$0:(Lext/mods/gameserver/model/group/Party;Ljava/lang/Integer;)Lext/mods/BossZerg/BossZergManager$PartyPresence;
  #694 = MethodType         #695          //  (Ljava/lang/Integer;)Lext/mods/BossZerg/BossZergManager$PartyPresence;
  #695 = Utf8               (Ljava/lang/Integer;)Lext/mods/BossZerg/BossZergManager$PartyPresence;
  #696 = String             #697          // Zerg detectada no boss \u0001.
  #697 = Utf8               Zerg detectada no boss \u0001.
  #698 = String             #699          // Zerg detectada no boss \u0001. Clã: \u0001.
  #699 = Utf8               Zerg detectada no boss \u0001. Clã: \u0001.
  #700 = MethodHandle       6:#701        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #701 = Methodref          #702.#703     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #702 = Class              #704          // java/lang/invoke/LambdaMetafactory
  #703 = NameAndType        #705:#706     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #704 = Utf8               java/lang/invoke/LambdaMetafactory
  #705 = Utf8               metafactory
  #706 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #707 = MethodHandle       6:#708        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #708 = Methodref          #709.#710     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #709 = Class              #711          // java/lang/invoke/StringConcatFactory
  #710 = NameAndType        #285:#712     // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #711 = Utf8               java/lang/invoke/StringConcatFactory
  #712 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #713 = Utf8               InnerClasses
  #714 = Utf8               BossZergState
  #715 = Utf8               PartyPresence
  #716 = Utf8               Entry
  #717 = Utf8               SMPOS
  #718 = Utf8               SingletonHolder
  #719 = Class              #720          // java/lang/invoke/MethodHandles$Lookup
  #720 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #721 = Class              #722          // java/lang/invoke/MethodHandles
  #722 = Utf8               java/lang/invoke/MethodHandles
  #723 = Utf8               Lookup
{
  public boolean isPlayerInZerg(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=5, args_size=2
         0: aload_1
         1: ifnonnull     6
         4: iconst_0
         5: ireturn
         6: aload_1
         7: invokevirtual #349                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        10: istore_2
        11: aload_0
        12: getfield      #10                 // Field _bossStates:Ljava/util/Map;
        15: invokeinterface #158,  1          // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
        20: invokeinterface #78,  1           // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
        25: astore_3
        26: aload_3
        27: invokeinterface #84,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        32: ifeq          60
        35: aload_3
        36: invokeinterface #90,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        41: checkcast     #123                // class ext/mods/BossZerg/BossZergManager$BossZergState
        44: astore        4
        46: aload         4
        48: iload_2
        49: invokevirtual #514                // Method ext/mods/BossZerg/BossZergManager$BossZergState.isZergPlayer:(I)Z
        52: ifeq          57
        55: iconst_1
        56: ireturn
        57: goto          26
        60: iconst_0
        61: ireturn
      LineNumberTable:
        line 442: 0
        line 443: 4
        line 445: 6
        line 446: 11
        line 448: 46
        line 449: 55
        line 450: 57
        line 452: 60
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           46      11     4 state   Lext/mods/BossZerg/BossZergManager$BossZergState;
            0      62     0  this   Lext/mods/BossZerg/BossZergManager;
            0      62     1 player   Lext/mods/gameserver/model/actor/Player;
           11      51     2 playerId   I
      StackMapTable: number_of_entries = 4
        frame_type = 6 /* same */
        frame_type = 253 /* append */
          offset_delta = 19
          locals = [ int, class java/util/Iterator ]
        frame_type = 30 /* same */
        frame_type = 250 /* chop */
          offset_delta = 2

  public double applyHealPenalty(ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.model.actor.Creature, double);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;D)D
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=9, args_size=4
         0: getstatic     #517                // Field ext/mods/Config.BOSS_ZERG_HEAL_PENALTY_ENABLED:Z
         3: ifeq          12
         6: dload_3
         7: dconst_0
         8: dcmpg
         9: ifgt          14
        12: dload_3
        13: dreturn
        14: aload_2
        15: instanceof    #209                // class ext/mods/gameserver/model/actor/Player
        18: ifeq          30
        21: aload_2
        22: checkcast     #209                // class ext/mods/gameserver/model/actor/Player
        25: astore        5
        27: goto          32
        30: dload_3
        31: dreturn
        32: aload_0
        33: aload         5
        35: invokevirtual #520                // Method isPlayerInZerg:(Lext/mods/gameserver/model/actor/Player;)Z
        38: ifne          43
        41: dload_3
        42: dreturn
        43: dload_3
        44: getstatic     #524                // Field ext/mods/Config.BOSS_ZERG_HEAL_PENALTY_MULTIPLIER:D
        47: dmul
        48: dstore        6
        50: aload_0
        51: aload         5
        53: invokevirtual #528                // Method hasPrayerEffect:(Lext/mods/gameserver/model/actor/Player;)Z
        56: ifeq          67
        59: dload         6
        61: getstatic     #531                // Field ext/mods/Config.BOSS_ZERG_PRAYER_REVERSE_MULTIPLIER:D
        64: dmul
        65: dstore        6
        67: aload_1
        68: instanceof    #209                // class ext/mods/gameserver/model/actor/Player
        71: ifeq          97
        74: aload_1
        75: checkcast     #209                // class ext/mods/gameserver/model/actor/Player
        78: astore        8
        80: aload_0
        81: aload         8
        83: invokevirtual #528                // Method hasPrayerEffect:(Lext/mods/gameserver/model/actor/Player;)Z
        86: ifeq          97
        89: dload         6
        91: getstatic     #531                // Field ext/mods/Config.BOSS_ZERG_PRAYER_REVERSE_MULTIPLIER:D
        94: dmul
        95: dstore        6
        97: dconst_1
        98: dload         6
       100: invokestatic  #534                // Method java/lang/Math.max:(DD)D
       103: dreturn
      LineNumberTable:
        line 457: 0
        line 458: 12
        line 460: 14
        line 461: 30
        line 463: 32
        line 464: 41
        line 466: 43
        line 468: 50
        line 469: 59
        line 471: 67
        line 472: 89
        line 474: 97
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           27       3     5 targetPlayer   Lext/mods/gameserver/model/actor/Player;
           80      17     8 casterPlayer   Lext/mods/gameserver/model/actor/Player;
            0     104     0  this   Lext/mods/BossZerg/BossZergManager;
            0     104     1 effector   Lext/mods/gameserver/model/actor/Creature;
            0     104     2 effected   Lext/mods/gameserver/model/actor/Creature;
            0     104     3 amount   D
           32      72     5 targetPlayer   Lext/mods/gameserver/model/actor/Player;
           50      54     6 result   D
      StackMapTable: number_of_entries = 7
        frame_type = 12 /* same */
        frame_type = 1 /* same */
        frame_type = 15 /* same */
        frame_type = 252 /* append */
          offset_delta = 1
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 10 /* same */
        frame_type = 252 /* append */
          offset_delta = 23
          locals = [ double ]
        frame_type = 29 /* same */

  public static ext.mods.BossZerg.BossZergManager getInstance();
    descriptor: ()Lext/mods/BossZerg/BossZergManager;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #545                // Field ext/mods/BossZerg/BossZergManager$SingletonHolder.INSTANCE:Lext/mods/BossZerg/BossZergManager;
         3: areturn
      LineNumberTable:
        line 493: 0

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=3, locals=0, args_size=0
         0: new           #60                 // class ext/mods/commons/logging/CLogger
         3: dup
         4: ldc           #11                 // class ext/mods/BossZerg/BossZergManager
         6: invokevirtual #558                // Method java/lang/Class.getName:()Ljava/lang/String;
         9: invokespecial #561                // Method ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
        12: putstatic     #47                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
        15: return
      LineNumberTable:
        line 68: 0
}
SourceFile: "BossZergManager.java"
NestMembers:
  ext/mods/BossZerg/BossZergManager$SingletonHolder
  ext/mods/BossZerg/BossZergManager$PartyPresence
  ext/mods/BossZerg/BossZergManager$BossZergState
BootstrapMethods:
  0: #700 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #667 ()V
      #668 REF_invokeVirtual ext/mods/BossZerg/BossZergManager.tick:()V
      #667 ()V
  1: #700 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #671 (Ljava/lang/Object;)Ljava/lang/Object;
      #672 REF_invokeStatic ext/mods/BossZerg/BossZergManager.lambda$tick$0:(Ljava/lang/Integer;)Lext/mods/BossZerg/BossZergManager$BossZergState;
      #675 (Ljava/lang/Integer;)Lext/mods/BossZerg/BossZergManager$BossZergState;
  2: #700 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #671 (Ljava/lang/Object;)Ljava/lang/Object;
      #676 REF_invokeStatic ext/mods/BossZerg/BossZergManager.lambda$processBoss$0:(Ljava/lang/Integer;)Ljava/util/List;
      #679 (Ljava/lang/Integer;)Ljava/util/List;
  3: #700 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #680 (Ljava/lang/Object;)J
      #682 REF_invokeStatic ext/mods/BossZerg/BossZergManager.lambda$processBoss$1:(Lext/mods/BossZerg/BossZergManager$BossZergState;Lext/mods/gameserver/model/actor/Player;)J
      #685 (Lext/mods/gameserver/model/actor/Player;)J
  4: #707 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #687 Sua Aliança/Clã excedeu o limite de \u0001 membros para o \u0001.
  5: #707 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #689 Ally/Clan no Boss: \u0001/\u0001
  6: #700 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #671 (Ljava/lang/Object;)Ljava/lang/Object;
      #691 REF_invokeStatic ext/mods/BossZerg/BossZergManager.lambda$collectPartiesNearBoss$0:(Lext/mods/gameserver/model/group/Party;Ljava/lang/Integer;)Lext/mods/BossZerg/BossZergManager$PartyPresence;
      #694 (Ljava/lang/Integer;)Lext/mods/BossZerg/BossZergManager$PartyPresence;
  7: #707 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #696 Zerg detectada no boss \u0001.
  8: #707 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #698 Zerg detectada no boss \u0001. Clã: \u0001.
InnerClasses:
  public static #716= #243 of #118;       // Entry=class java/util/Map$Entry of class java/util/Map
  public static final #717= #390 of #387; // SMPOS=class ext/mods/gameserver/network/serverpackets/ExShowScreenMessage$SMPOS of class ext/mods/gameserver/network/serverpackets/ExShowScreenMessage
  public static final #723= #719 of #721; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
