// Bytecode for: ext.mods.battlerboss.matches.BattleBossRumble
// File: ext\mods\battlerboss\matches\BattleBossRumble.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/battlerboss/matches/BattleBossRumble.class
  Last modified 9 de jul de 2026; size 30276 bytes
  MD5 checksum 49524302aaf527688e4c24908e827d33
  Compiled from "BattleBossRumble.java"
public class ext.mods.battlerboss.matches.BattleBossRumble implements java.lang.Runnable
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #17                         // ext/mods/battlerboss/matches/BattleBossRumble
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 22, methods: 50, attributes: 4
Constant pool:
     #1 = Methodref          #2.#3        // java/lang/Object."<init>":()V
     #2 = Class              #4           // java/lang/Object
     #3 = NameAndType        #5:#6        // "<init>":()V
     #4 = Utf8               java/lang/Object
     #5 = Utf8               <init>
     #6 = Utf8               ()V
     #7 = Class              #8           // java/util/concurrent/ConcurrentHashMap
     #8 = Utf8               java/util/concurrent/ConcurrentHashMap
     #9 = Methodref          #7.#3        // java/util/concurrent/ConcurrentHashMap."<init>":()V
    #10 = Methodref          #11.#12      // java/util/Collections.newSetFromMap:(Ljava/util/Map;)Ljava/util/Set;
    #11 = Class              #13          // java/util/Collections
    #12 = NameAndType        #14:#15      // newSetFromMap:(Ljava/util/Map;)Ljava/util/Set;
    #13 = Utf8               java/util/Collections
    #14 = Utf8               newSetFromMap
    #15 = Utf8               (Ljava/util/Map;)Ljava/util/Set;
    #16 = Fieldref           #17.#18      // ext/mods/battlerboss/matches/BattleBossRumble.participants:Ljava/util/Set;
    #17 = Class              #19          // ext/mods/battlerboss/matches/BattleBossRumble
    #18 = NameAndType        #20:#21      // participants:Ljava/util/Set;
    #19 = Utf8               ext/mods/battlerboss/matches/BattleBossRumble
    #20 = Utf8               participants
    #21 = Utf8               Ljava/util/Set;
    #22 = Class              #23          // java/util/concurrent/CopyOnWriteArrayList
    #23 = Utf8               java/util/concurrent/CopyOnWriteArrayList
    #24 = Methodref          #22.#3       // java/util/concurrent/CopyOnWriteArrayList."<init>":()V
    #25 = Fieldref           #17.#26      // ext/mods/battlerboss/matches/BattleBossRumble.teams:Ljava/util/List;
    #26 = NameAndType        #27:#28      // teams:Ljava/util/List;
    #27 = Utf8               teams
    #28 = Utf8               Ljava/util/List;
    #29 = Fieldref           #17.#30      // ext/mods/battlerboss/matches/BattleBossRumble.playerTeam:Ljava/util/Map;
    #30 = NameAndType        #31:#32      // playerTeam:Ljava/util/Map;
    #31 = Utf8               playerTeam
    #32 = Utf8               Ljava/util/Map;
    #33 = Fieldref           #17.#34      // ext/mods/battlerboss/matches/BattleBossRumble.aliveTeams:Ljava/util/Set;
    #34 = NameAndType        #35:#21      // aliveTeams:Ljava/util/Set;
    #35 = Utf8               aliveTeams
    #36 = Fieldref           #17.#37      // ext/mods/battlerboss/matches/BattleBossRumble.aliveMembersByTeam:Ljava/util/Map;
    #37 = NameAndType        #38:#32      // aliveMembersByTeam:Ljava/util/Map;
    #38 = Utf8               aliveMembersByTeam
    #39 = Fieldref           #17.#40      // ext/mods/battlerboss/matches/BattleBossRumble.monsterSpawns:Ljava/util/List;
    #40 = NameAndType        #41:#28      // monsterSpawns:Ljava/util/List;
    #41 = Utf8               monsterSpawns
    #42 = Class              #43          // java/util/concurrent/atomic/AtomicBoolean
    #43 = Utf8               java/util/concurrent/atomic/AtomicBoolean
    #44 = Methodref          #42.#45      // java/util/concurrent/atomic/AtomicBoolean."<init>":(Z)V
    #45 = NameAndType        #5:#46       // "<init>":(Z)V
    #46 = Utf8               (Z)V
    #47 = Fieldref           #17.#48      // ext/mods/battlerboss/matches/BattleBossRumble.finished:Ljava/util/concurrent/atomic/AtomicBoolean;
    #48 = NameAndType        #49:#50      // finished:Ljava/util/concurrent/atomic/AtomicBoolean;
    #49 = Utf8               finished
    #50 = Utf8               Ljava/util/concurrent/atomic/AtomicBoolean;
    #51 = Fieldref           #17.#52      // ext/mods/battlerboss/matches/BattleBossRumble.battleStarted:Ljava/util/concurrent/atomic/AtomicBoolean;
    #52 = NameAndType        #53:#50      // battleStarted:Ljava/util/concurrent/atomic/AtomicBoolean;
    #53 = Utf8               battleStarted
    #54 = Fieldref           #17.#55      // ext/mods/battlerboss/matches/BattleBossRumble.paused:Ljava/util/concurrent/atomic/AtomicBoolean;
    #55 = NameAndType        #56:#50      // paused:Ljava/util/concurrent/atomic/AtomicBoolean;
    #56 = Utf8               paused
    #57 = Fieldref           #58.#59      // ext/mods/battlerboss/matches/BattleBossRumble$Phase.PREP:Lext/mods/battlerboss/matches/BattleBossRumble$Phase;
    #58 = Class              #60          // ext/mods/battlerboss/matches/BattleBossRumble$Phase
    #59 = NameAndType        #61:#62      // PREP:Lext/mods/battlerboss/matches/BattleBossRumble$Phase;
    #60 = Utf8               ext/mods/battlerboss/matches/BattleBossRumble$Phase
    #61 = Utf8               PREP
    #62 = Utf8               Lext/mods/battlerboss/matches/BattleBossRumble$Phase;
    #63 = Fieldref           #17.#64      // ext/mods/battlerboss/matches/BattleBossRumble.phase:Lext/mods/battlerboss/matches/BattleBossRumble$Phase;
    #64 = NameAndType        #65:#62      // phase:Lext/mods/battlerboss/matches/BattleBossRumble$Phase;
    #65 = Utf8               phase
    #66 = Fieldref           #17.#67      // ext/mods/battlerboss/matches/BattleBossRumble.teamOfflineFlag:Ljava/util/Map;
    #67 = NameAndType        #68:#32      // teamOfflineFlag:Ljava/util/Map;
    #68 = Utf8               teamOfflineFlag
    #69 = Fieldref           #17.#70      // ext/mods/battlerboss/matches/BattleBossRumble.rewardedHwids:Ljava/util/Set;
    #70 = NameAndType        #71:#21      // rewardedHwids:Ljava/util/Set;
    #71 = Utf8               rewardedHwids
    #72 = Fieldref           #17.#73      // ext/mods/battlerboss/matches/BattleBossRumble.rumbleId:I
    #73 = NameAndType        #74:#75      // rumbleId:I
    #74 = Utf8               rumbleId
    #75 = Utf8               I
    #76 = Fieldref           #17.#77      // ext/mods/battlerboss/matches/BattleBossRumble.event:Lext/mods/battlerboss/holder/EventHolder;
    #77 = NameAndType        #78:#79      // event:Lext/mods/battlerboss/holder/EventHolder;
    #78 = Utf8               event
    #79 = Utf8               Lext/mods/battlerboss/holder/EventHolder;
    #80 = Methodref          #81.#82      // ext/mods/InstanceMap/InstanceManager.getInstance:()Lext/mods/InstanceMap/InstanceManager;
    #81 = Class              #83          // ext/mods/InstanceMap/InstanceManager
    #82 = NameAndType        #84:#85      // getInstance:()Lext/mods/InstanceMap/InstanceManager;
    #83 = Utf8               ext/mods/InstanceMap/InstanceManager
    #84 = Utf8               getInstance
    #85 = Utf8               ()Lext/mods/InstanceMap/InstanceManager;
    #86 = Methodref          #81.#87      // ext/mods/InstanceMap/InstanceManager.createInstance:()Lext/mods/InstanceMap/MapInstance;
    #87 = NameAndType        #88:#89      // createInstance:()Lext/mods/InstanceMap/MapInstance;
    #88 = Utf8               createInstance
    #89 = Utf8               ()Lext/mods/InstanceMap/MapInstance;
    #90 = Fieldref           #17.#91      // ext/mods/battlerboss/matches/BattleBossRumble.instance:Lext/mods/InstanceMap/MapInstance;
    #91 = NameAndType        #92:#93      // instance:Lext/mods/InstanceMap/MapInstance;
    #92 = Utf8               instance
    #93 = Utf8               Lext/mods/InstanceMap/MapInstance;
    #94 = InterfaceMethodref #95.#96      // java/util/Set.addAll:(Ljava/util/Collection;)Z
    #95 = Class              #97          // java/util/Set
    #96 = NameAndType        #98:#99      // addAll:(Ljava/util/Collection;)Z
    #97 = Utf8               java/util/Set
    #98 = Utf8               addAll
    #99 = Utf8               (Ljava/util/Collection;)Z
   #100 = Methodref          #17.#101     // ext/mods/battlerboss/matches/BattleBossRumble.startPreparation:()V
   #101 = NameAndType        #102:#6      // startPreparation:()V
   #102 = Utf8               startPreparation
   #103 = InvokeDynamic      #0:#104      // #0:run:(Lext/mods/battlerboss/matches/BattleBossRumble;)Ljava/lang/Runnable;
   #104 = NameAndType        #105:#106    // run:(Lext/mods/battlerboss/matches/BattleBossRumble;)Ljava/lang/Runnable;
   #105 = Utf8               run
   #106 = Utf8               (Lext/mods/battlerboss/matches/BattleBossRumble;)Ljava/lang/Runnable;
   #107 = Long               7000l
   #109 = Methodref          #110.#111    // ext/mods/commons/pool/ThreadPool.schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
   #110 = Class              #112         // ext/mods/commons/pool/ThreadPool
   #111 = NameAndType        #113:#114    // schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
   #112 = Utf8               ext/mods/commons/pool/ThreadPool
   #113 = Utf8               schedule
   #114 = Utf8               (Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
   #115 = Fieldref           #17.#116     // ext/mods/battlerboss/matches/BattleBossRumble.taskStartBattle:Ljava/util/concurrent/ScheduledFuture;
   #116 = NameAndType        #117:#118    // taskStartBattle:Ljava/util/concurrent/ScheduledFuture;
   #117 = Utf8               taskStartBattle
   #118 = Utf8               Ljava/util/concurrent/ScheduledFuture;
   #119 = Class              #120         // java/lang/Throwable
   #120 = Utf8               java/lang/Throwable
   #121 = Fieldref           #17.#122     // ext/mods/battlerboss/matches/BattleBossRumble.LOGGER:Ljava/util/logging/Logger;
   #122 = NameAndType        #123:#124    // LOGGER:Ljava/util/logging/Logger;
   #123 = Utf8               LOGGER
   #124 = Utf8               Ljava/util/logging/Logger;
   #125 = Fieldref           #126.#127    // java/util/logging/Level.SEVERE:Ljava/util/logging/Level;
   #126 = Class              #128         // java/util/logging/Level
   #127 = NameAndType        #129:#130    // SEVERE:Ljava/util/logging/Level;
   #128 = Utf8               java/util/logging/Level
   #129 = Utf8               SEVERE
   #130 = Utf8               Ljava/util/logging/Level;
   #131 = String             #132         // [BattleBoss] Falha no run inicial
   #132 = Utf8               [BattleBoss] Falha no run inicial
   #133 = Methodref          #134.#135    // java/util/logging/Logger.log:(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V
   #134 = Class              #136         // java/util/logging/Logger
   #135 = NameAndType        #137:#138    // log:(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V
   #136 = Utf8               java/util/logging/Logger
   #137 = Utf8               log
   #138 = Utf8               (Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V
   #139 = Methodref          #17.#140     // ext/mods/battlerboss/matches/BattleBossRumble.forceFinish:()V
   #140 = NameAndType        #141:#6      // forceFinish:()V
   #141 = Utf8               forceFinish
   #142 = Methodref          #17.#143     // ext/mods/battlerboss/matches/BattleBossRumble.makeTeams:()V
   #143 = NameAndType        #144:#6      // makeTeams:()V
   #144 = Utf8               makeTeams
   #145 = Methodref          #17.#146     // ext/mods/battlerboss/matches/BattleBossRumble.teleportTeamsAndSetup:()V
   #146 = NameAndType        #147:#6      // teleportTeamsAndSetup:()V
   #147 = Utf8               teleportTeamsAndSetup
   #148 = Methodref          #17.#149     // ext/mods/battlerboss/matches/BattleBossRumble.startDisconnectionWatcher:()V
   #149 = NameAndType        #150:#6      // startDisconnectionWatcher:()V
   #150 = Utf8               startDisconnectionWatcher
   #151 = Methodref          #152.#153    // ext/mods/battlerboss/holder/EventHolder.getRegistration:()Lext/mods/battlerboss/holder/RegistrationHolder;
   #152 = Class              #154         // ext/mods/battlerboss/holder/EventHolder
   #153 = NameAndType        #155:#156    // getRegistration:()Lext/mods/battlerboss/holder/RegistrationHolder;
   #154 = Utf8               ext/mods/battlerboss/holder/EventHolder
   #155 = Utf8               getRegistration
   #156 = Utf8               ()Lext/mods/battlerboss/holder/RegistrationHolder;
   #157 = Methodref          #158.#159    // ext/mods/battlerboss/holder/RegistrationHolder.getGroupSize:()I
   #158 = Class              #160         // ext/mods/battlerboss/holder/RegistrationHolder
   #159 = NameAndType        #161:#162    // getGroupSize:()I
   #160 = Utf8               ext/mods/battlerboss/holder/RegistrationHolder
   #161 = Utf8               getGroupSize
   #162 = Utf8               ()I
   #163 = Methodref          #164.#165    // java/lang/Math.max:(II)I
   #164 = Class              #166         // java/lang/Math
   #165 = NameAndType        #167:#168    // max:(II)I
   #166 = Utf8               java/lang/Math
   #167 = Utf8               max
   #168 = Utf8               (II)I
   #169 = Class              #170         // java/util/ArrayList
   #170 = Utf8               java/util/ArrayList
   #171 = Methodref          #169.#172    // java/util/ArrayList."<init>":(Ljava/util/Collection;)V
   #172 = NameAndType        #5:#173      // "<init>":(Ljava/util/Collection;)V
   #173 = Utf8               (Ljava/util/Collection;)V
   #174 = InterfaceMethodref #95.#175     // java/util/Set.clear:()V
   #175 = NameAndType        #176:#6      // clear:()V
   #176 = Utf8               clear
   #177 = InterfaceMethodref #178.#175    // java/util/List.clear:()V
   #178 = Class              #179         // java/util/List
   #179 = Utf8               java/util/List
   #180 = InterfaceMethodref #181.#175    // java/util/Map.clear:()V
   #181 = Class              #182         // java/util/Map
   #182 = Utf8               java/util/Map
   #183 = Class              #184         // java/util/HashMap
   #184 = Utf8               java/util/HashMap
   #185 = Methodref          #183.#3      // java/util/HashMap."<init>":()V
   #186 = InterfaceMethodref #178.#187    // java/util/List.iterator:()Ljava/util/Iterator;
   #187 = NameAndType        #188:#189    // iterator:()Ljava/util/Iterator;
   #188 = Utf8               iterator
   #189 = Utf8               ()Ljava/util/Iterator;
   #190 = InterfaceMethodref #191.#192    // java/util/Iterator.hasNext:()Z
   #191 = Class              #193         // java/util/Iterator
   #192 = NameAndType        #194:#195    // hasNext:()Z
   #193 = Utf8               java/util/Iterator
   #194 = Utf8               hasNext
   #195 = Utf8               ()Z
   #196 = InterfaceMethodref #191.#197    // java/util/Iterator.next:()Ljava/lang/Object;
   #197 = NameAndType        #198:#199    // next:()Ljava/lang/Object;
   #198 = Utf8               next
   #199 = Utf8               ()Ljava/lang/Object;
   #200 = Class              #201         // ext/mods/gameserver/model/actor/Player
   #201 = Utf8               ext/mods/gameserver/model/actor/Player
   #202 = Methodref          #200.#203    // ext/mods/gameserver/model/actor/Player.isInParty:()Z
   #203 = NameAndType        #204:#195    // isInParty:()Z
   #204 = Utf8               isInParty
   #205 = Methodref          #200.#206    // ext/mods/gameserver/model/actor/Player.getParty:()Lext/mods/gameserver/model/group/Party;
   #206 = NameAndType        #207:#208    // getParty:()Lext/mods/gameserver/model/group/Party;
   #207 = Utf8               getParty
   #208 = Utf8               ()Lext/mods/gameserver/model/group/Party;
   #209 = InvokeDynamic      #1:#210      // #1:apply:()Ljava/util/function/Function;
   #210 = NameAndType        #211:#212    // apply:()Ljava/util/function/Function;
   #211 = Utf8               apply
   #212 = Utf8               ()Ljava/util/function/Function;
   #213 = InterfaceMethodref #181.#214    // java/util/Map.computeIfAbsent:(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;
   #214 = NameAndType        #215:#216    // computeIfAbsent:(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;
   #215 = Utf8               computeIfAbsent
   #216 = Utf8               (Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;
   #217 = InterfaceMethodref #178.#218    // java/util/List.add:(Ljava/lang/Object;)Z
   #218 = NameAndType        #219:#220    // add:(Ljava/lang/Object;)Z
   #219 = Utf8               add
   #220 = Utf8               (Ljava/lang/Object;)Z
   #221 = InterfaceMethodref #181.#222    // java/util/Map.values:()Ljava/util/Collection;
   #222 = NameAndType        #223:#224    // values:()Ljava/util/Collection;
   #223 = Utf8               values
   #224 = Utf8               ()Ljava/util/Collection;
   #225 = InterfaceMethodref #226.#187    // java/util/Collection.iterator:()Ljava/util/Iterator;
   #226 = Class              #227         // java/util/Collection
   #227 = Utf8               java/util/Collection
   #228 = Methodref          #17.#229     // ext/mods/battlerboss/matches/BattleBossRumble.extractFullGroups:(Ljava/util/List;Ljava/util/List;I)V
   #229 = NameAndType        #230:#231    // extractFullGroups:(Ljava/util/List;Ljava/util/List;I)V
   #230 = Utf8               extractFullGroups
   #231 = Utf8               (Ljava/util/List;Ljava/util/List;I)V
   #232 = Methodref          #169.#187    // java/util/ArrayList.iterator:()Ljava/util/Iterator;
   #233 = Methodref          #200.#234    // ext/mods/gameserver/model/actor/Player.hasClan:()Z
   #234 = NameAndType        #235:#195    // hasClan:()Z
   #235 = Utf8               hasClan
   #236 = Methodref          #200.#237    // ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
   #237 = NameAndType        #238:#239    // getClan:()Lext/mods/gameserver/model/pledge/Clan;
   #238 = Utf8               getClan
   #239 = Utf8               ()Lext/mods/gameserver/model/pledge/Clan;
   #240 = InvokeDynamic      #2:#210      // #2:apply:()Ljava/util/function/Function;
   #241 = Methodref          #11.#242     // java/util/Collections.shuffle:(Ljava/util/List;)V
   #242 = NameAndType        #243:#244    // shuffle:(Ljava/util/List;)V
   #243 = Utf8               shuffle
   #244 = Utf8               (Ljava/util/List;)V
   #245 = Methodref          #169.#246    // java/util/ArrayList."<init>":(I)V
   #246 = NameAndType        #5:#247      // "<init>":(I)V
   #247 = Utf8               (I)V
   #248 = InterfaceMethodref #178.#249    // java/util/List.size:()I
   #249 = NameAndType        #250:#162    // size:()I
   #250 = Utf8               size
   #251 = Methodref          #17.#252     // ext/mods/battlerboss/matches/BattleBossRumble.addTeam:(Ljava/util/List;)V
   #252 = NameAndType        #253:#244    // addTeam:(Ljava/util/List;)V
   #253 = Utf8               addTeam
   #254 = InterfaceMethodref #178.#255    // java/util/List.isEmpty:()Z
   #255 = NameAndType        #256:#195    // isEmpty:()Z
   #256 = Utf8               isEmpty
   #257 = InterfaceMethodref #178.#258    // java/util/List.get:(I)Ljava/lang/Object;
   #258 = NameAndType        #259:#260    // get:(I)Ljava/lang/Object;
   #259 = Utf8               get
   #260 = Utf8               (I)Ljava/lang/Object;
   #261 = Class              #262         // ext/mods/battlerboss/matches/BattleBossRumble$Team
   #262 = Utf8               ext/mods/battlerboss/matches/BattleBossRumble$Team
   #263 = Fieldref           #261.#264    // ext/mods/battlerboss/matches/BattleBossRumble$Team.members:Ljava/util/List;
   #264 = NameAndType        #265:#28     // members:Ljava/util/List;
   #265 = Utf8               members
   #266 = Methodref          #17.#267     // ext/mods/battlerboss/matches/BattleBossRumble.resetTeamStructures:()V
   #267 = NameAndType        #268:#6      // resetTeamStructures:()V
   #268 = Utf8               resetTeamStructures
   #269 = InterfaceMethodref #178.#270    // java/util/List.subList:(II)Ljava/util/List;
   #270 = NameAndType        #271:#272    // subList:(II)Ljava/util/List;
   #271 = Utf8               subList
   #272 = Utf8               (II)Ljava/util/List;
   #273 = InterfaceMethodref #178.#274    // java/util/List.remove:(I)Ljava/lang/Object;
   #274 = NameAndType        #275:#260    // remove:(I)Ljava/lang/Object;
   #275 = Utf8               remove
   #276 = InterfaceMethodref #178.#277    // java/util/List.remove:(Ljava/lang/Object;)Z
   #277 = NameAndType        #275:#220    // remove:(Ljava/lang/Object;)Z
   #278 = InvokeDynamic      #3:#279      // #3:test:()Ljava/util/function/Predicate;
   #279 = NameAndType        #280:#281    // test:()Ljava/util/function/Predicate;
   #280 = Utf8               test
   #281 = Utf8               ()Ljava/util/function/Predicate;
   #282 = InterfaceMethodref #178.#283    // java/util/List.removeIf:(Ljava/util/function/Predicate;)Z
   #283 = NameAndType        #284:#285    // removeIf:(Ljava/util/function/Predicate;)Z
   #284 = Utf8               removeIf
   #285 = Utf8               (Ljava/util/function/Predicate;)Z
   #286 = Methodref          #11.#287     // java/util/Collections.unmodifiableList:(Ljava/util/List;)Ljava/util/List;
   #287 = NameAndType        #288:#289    // unmodifiableList:(Ljava/util/List;)Ljava/util/List;
   #288 = Utf8               unmodifiableList
   #289 = Utf8               (Ljava/util/List;)Ljava/util/List;
   #290 = Methodref          #261.#291    // ext/mods/battlerboss/matches/BattleBossRumble$Team."<init>":(Ljava/util/List;)V
   #291 = NameAndType        #5:#244      // "<init>":(Ljava/util/List;)V
   #292 = InterfaceMethodref #95.#218     // java/util/Set.add:(Ljava/lang/Object;)Z
   #293 = InterfaceMethodref #181.#294    // java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #294 = NameAndType        #295:#296    // put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #295 = Utf8               put
   #296 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #297 = Methodref          #152.#298    // ext/mods/battlerboss/holder/EventHolder.getTeleport:()Lext/mods/battlerboss/holder/TeleportHolder;
   #298 = NameAndType        #299:#300    // getTeleport:()Lext/mods/battlerboss/holder/TeleportHolder;
   #299 = Utf8               getTeleport
   #300 = Utf8               ()Lext/mods/battlerboss/holder/TeleportHolder;
   #301 = Methodref          #302.#303    // ext/mods/battlerboss/holder/TeleportHolder.getArenaX:()I
   #302 = Class              #304         // ext/mods/battlerboss/holder/TeleportHolder
   #303 = NameAndType        #305:#162    // getArenaX:()I
   #304 = Utf8               ext/mods/battlerboss/holder/TeleportHolder
   #305 = Utf8               getArenaX
   #306 = Methodref          #302.#307    // ext/mods/battlerboss/holder/TeleportHolder.getArenaY:()I
   #307 = NameAndType        #308:#162    // getArenaY:()I
   #308 = Utf8               getArenaY
   #309 = Methodref          #302.#310    // ext/mods/battlerboss/holder/TeleportHolder.getArenaZ:()I
   #310 = NameAndType        #311:#162    // getArenaZ:()I
   #311 = Utf8               getArenaZ
   #312 = Fieldref           #313.#314    // ext/mods/gameserver/enums/TeamType.BLUE:Lext/mods/gameserver/enums/TeamType;
   #313 = Class              #315         // ext/mods/gameserver/enums/TeamType
   #314 = NameAndType        #316:#317    // BLUE:Lext/mods/gameserver/enums/TeamType;
   #315 = Utf8               ext/mods/gameserver/enums/TeamType
   #316 = Utf8               BLUE
   #317 = Utf8               Lext/mods/gameserver/enums/TeamType;
   #318 = Fieldref           #313.#319    // ext/mods/gameserver/enums/TeamType.RED:Lext/mods/gameserver/enums/TeamType;
   #319 = NameAndType        #320:#317    // RED:Lext/mods/gameserver/enums/TeamType;
   #320 = Utf8               RED
   #321 = Methodref          #164.#322    // java/lang/Math.sqrt:(D)D
   #322 = NameAndType        #323:#324    // sqrt:(D)D
   #323 = Utf8               sqrt
   #324 = Utf8               (D)D
   #325 = Methodref          #164.#326    // java/lang/Math.ceil:(D)D
   #326 = NameAndType        #327:#324    // ceil:(D)D
   #327 = Utf8               ceil
   #328 = Methodref          #17.#329     // ext/mods/battlerboss/matches/BattleBossRumble.setInvulParalyze:(Lext/mods/gameserver/model/actor/Player;Z)V
   #329 = NameAndType        #330:#331    // setInvulParalyze:(Lext/mods/gameserver/model/actor/Player;Z)V
   #330 = Utf8               setInvulParalyze
   #331 = Utf8               (Lext/mods/gameserver/model/actor/Player;Z)V
   #332 = Methodref          #200.#333    // ext/mods/gameserver/model/actor/Player.isFakeDeath:()Z
   #333 = NameAndType        #334:#195    // isFakeDeath:()Z
   #334 = Utf8               isFakeDeath
   #335 = Methodref          #200.#336    // ext/mods/gameserver/model/actor/Player.stopFakeDeath:(Z)V
   #336 = NameAndType        #337:#46     // stopFakeDeath:(Z)V
   #337 = Utf8               stopFakeDeath
   #338 = String             #339         // You have been teleported to the arena! Get ready.
   #339 = Utf8               You have been teleported to the arena! Get ready.
   #340 = Methodref          #17.#341     // ext/mods/battlerboss/matches/BattleBossRumble.screenMsg:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;I)V
   #341 = NameAndType        #342:#343    // screenMsg:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;I)V
   #342 = Utf8               screenMsg
   #343 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;I)V
   #344 = Methodref          #17.#345     // ext/mods/battlerboss/matches/BattleBossRumble.applyHealAndRevive:(Lext/mods/gameserver/model/actor/Player;)V
   #345 = NameAndType        #346:#347    // applyHealAndRevive:(Lext/mods/gameserver/model/actor/Player;)V
   #346 = Utf8               applyHealAndRevive
   #347 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
   #348 = Methodref          #200.#349    // ext/mods/gameserver/model/actor/Player.setInstanceMap:(Lext/mods/InstanceMap/MapInstance;Z)V
   #349 = NameAndType        #350:#351    // setInstanceMap:(Lext/mods/InstanceMap/MapInstance;Z)V
   #350 = Utf8               setInstanceMap
   #351 = Utf8               (Lext/mods/InstanceMap/MapInstance;Z)V
   #352 = Methodref          #200.#353    // ext/mods/gameserver/model/actor/Player.setTeam:(Lext/mods/gameserver/enums/TeamType;)V
   #353 = NameAndType        #354:#355    // setTeam:(Lext/mods/gameserver/enums/TeamType;)V
   #354 = Utf8               setTeam
   #355 = Utf8               (Lext/mods/gameserver/enums/TeamType;)V
   #356 = Methodref          #200.#357    // ext/mods/gameserver/model/actor/Player.teleportTo:(IIII)Z
   #357 = NameAndType        #358:#359    // teleportTo:(IIII)Z
   #358 = Utf8               teleportTo
   #359 = Utf8               (IIII)Z
   #360 = Methodref          #200.#361    // ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
   #361 = NameAndType        #362:#363    // getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
   #362 = Utf8               getStatus
   #363 = Utf8               ()Lext/mods/gameserver/model/actor/status/PlayerStatus;
   #364 = Methodref          #365.#366    // ext/mods/gameserver/model/actor/status/PlayerStatus.getMaxHp:()I
   #365 = Class              #367         // ext/mods/gameserver/model/actor/status/PlayerStatus
   #366 = NameAndType        #368:#162    // getMaxHp:()I
   #367 = Utf8               ext/mods/gameserver/model/actor/status/PlayerStatus
   #368 = Utf8               getMaxHp
   #369 = Methodref          #365.#370    // ext/mods/gameserver/model/actor/status/PlayerStatus.setHp:(D)V
   #370 = NameAndType        #371:#372    // setHp:(D)V
   #371 = Utf8               setHp
   #372 = Utf8               (D)V
   #373 = Methodref          #365.#374    // ext/mods/gameserver/model/actor/status/PlayerStatus.getMaxCp:()I
   #374 = NameAndType        #375:#162    // getMaxCp:()I
   #375 = Utf8               getMaxCp
   #376 = Methodref          #365.#377    // ext/mods/gameserver/model/actor/status/PlayerStatus.setCp:(D)V
   #377 = NameAndType        #378:#372    // setCp:(D)V
   #378 = Utf8               setCp
   #379 = Methodref          #365.#380    // ext/mods/gameserver/model/actor/status/PlayerStatus.getMaxMp:()I
   #380 = NameAndType        #381:#162    // getMaxMp:()I
   #381 = Utf8               getMaxMp
   #382 = Methodref          #365.#383    // ext/mods/gameserver/model/actor/status/PlayerStatus.setMp:(D)V
   #383 = NameAndType        #384:#372    // setMp:(D)V
   #384 = Utf8               setMp
   #385 = Methodref          #200.#386    // ext/mods/gameserver/model/actor/Player.stopAllEffectsDebuff:()V
   #386 = NameAndType        #387:#6      // stopAllEffectsDebuff:()V
   #387 = Utf8               stopAllEffectsDebuff
   #388 = Methodref          #200.#389    // ext/mods/gameserver/model/actor/Player.broadcastCharInfo:()V
   #389 = NameAndType        #390:#6      // broadcastCharInfo:()V
   #390 = Utf8               broadcastCharInfo
   #391 = Class              #392         // java/lang/Exception
   #392 = Utf8               java/lang/Exception
   #393 = Fieldref           #126.#394    // java/util/logging/Level.FINE:Ljava/util/logging/Level;
   #394 = NameAndType        #395:#130    // FINE:Ljava/util/logging/Level;
   #395 = Utf8               FINE
   #396 = String             #397         // Falha ao teleportar jogador
   #397 = Utf8               Falha ao teleportar jogador
   #398 = Methodref          #17.#399     // ext/mods/battlerboss/matches/BattleBossRumble.startBattle:()V
   #399 = NameAndType        #400:#6      // startBattle:()V
   #400 = Utf8               startBattle
   #401 = String             #402         // startBattle falhou
   #402 = Utf8               startBattle falhou
   #403 = Methodref          #42.#404     // java/util/concurrent/atomic/AtomicBoolean.get:()Z
   #404 = NameAndType        #259:#195    // get:()Z
   #405 = Fieldref           #58.#406     // ext/mods/battlerboss/matches/BattleBossRumble$Phase.BATTLE:Lext/mods/battlerboss/matches/BattleBossRumble$Phase;
   #406 = NameAndType        #407:#62     // BATTLE:Lext/mods/battlerboss/matches/BattleBossRumble$Phase;
   #407 = Utf8               BATTLE
   #408 = Methodref          #42.#409     // java/util/concurrent/atomic/AtomicBoolean.set:(Z)V
   #409 = NameAndType        #410:#46     // set:(Z)V
   #410 = Utf8               set
   #411 = Methodref          #412.#413    // java/lang/System.currentTimeMillis:()J
   #412 = Class              #414         // java/lang/System
   #413 = NameAndType        #415:#416    // currentTimeMillis:()J
   #414 = Utf8               java/lang/System
   #415 = Utf8               currentTimeMillis
   #416 = Utf8               ()J
   #417 = Fieldref           #17.#418     // ext/mods/battlerboss/matches/BattleBossRumble.stageBeginTime:J
   #418 = NameAndType        #419:#420    // stageBeginTime:J
   #419 = Utf8               stageBeginTime
   #420 = Utf8               J
   #421 = Long               1000l
   #423 = Methodref          #152.#424    // ext/mods/battlerboss/holder/EventHolder.getBattle:()Lext/mods/battlerboss/holder/BattleHolder;
   #424 = NameAndType        #425:#426    // getBattle:()Lext/mods/battlerboss/holder/BattleHolder;
   #425 = Utf8               getBattle
   #426 = Utf8               ()Lext/mods/battlerboss/holder/BattleHolder;
   #427 = Methodref          #428.#429    // ext/mods/battlerboss/holder/BattleHolder.getDuration:()I
   #428 = Class              #430         // ext/mods/battlerboss/holder/BattleHolder
   #429 = NameAndType        #431:#162    // getDuration:()I
   #430 = Utf8               ext/mods/battlerboss/holder/BattleHolder
   #431 = Utf8               getDuration
   #432 = Methodref          #164.#433    // java/lang/Math.max:(JJ)J
   #433 = NameAndType        #167:#434    // max:(JJ)J
   #434 = Utf8               (JJ)J
   #435 = Fieldref           #17.#436     // ext/mods/battlerboss/matches/BattleBossRumble.stageDurationMillis:J
   #436 = NameAndType        #437:#420    // stageDurationMillis:J
   #437 = Utf8               stageDurationMillis
   #438 = Methodref          #17.#439     // ext/mods/battlerboss/matches/BattleBossRumble.snapshotParticipants:()Ljava/util/List;
   #439 = NameAndType        #440:#441    // snapshotParticipants:()Ljava/util/List;
   #440 = Utf8               snapshotParticipants
   #441 = Utf8               ()Ljava/util/List;
   #442 = String             #443         // A batalha começou!
   #443 = Utf8               A batalha começou!
   #444 = Methodref          #200.#445    // ext/mods/gameserver/model/actor/Player.setBattleBossRumbleId:(I)V
   #445 = NameAndType        #446:#247    // setBattleBossRumbleId:(I)V
   #446 = Utf8               setBattleBossRumbleId
   #447 = Methodref          #152.#448    // ext/mods/battlerboss/holder/EventHolder.getId:()I
   #448 = NameAndType        #449:#162    // getId:()I
   #449 = Utf8               getId
   #450 = Methodref          #200.#451    // ext/mods/gameserver/model/actor/Player.setBattleBossEventId:(I)V
   #451 = NameAndType        #452:#247    // setBattleBossEventId:(I)V
   #452 = Utf8               setBattleBossEventId
   #453 = InvokeDynamic      #4:#104      // #4:run:(Lext/mods/battlerboss/matches/BattleBossRumble;)Ljava/lang/Runnable;
   #454 = Methodref          #17.#455     // ext/mods/battlerboss/matches/BattleBossRumble.reschedulePhaseTimeout:(Ljava/lang/Runnable;J)V
   #455 = NameAndType        #456:#457    // reschedulePhaseTimeout:(Ljava/lang/Runnable;J)V
   #456 = Utf8               reschedulePhaseTimeout
   #457 = Utf8               (Ljava/lang/Runnable;J)V
   #458 = Methodref          #17.#459     // ext/mods/battlerboss/matches/BattleBossRumble.rescheduleBroadcast:()V
   #459 = NameAndType        #460:#6      // rescheduleBroadcast:()V
   #460 = Utf8               rescheduleBroadcast
   #461 = Methodref          #17.#462     // ext/mods/battlerboss/matches/BattleBossRumble.startBattleSafe:()V
   #462 = NameAndType        #463:#6      // startBattleSafe:()V
   #463 = Utf8               startBattleSafe
   #464 = Methodref          #17.#465     // ext/mods/battlerboss/matches/BattleBossRumble.decideWinnersOnTimeout:()Ljava/util/List;
   #465 = NameAndType        #466:#441    // decideWinnersOnTimeout:()Ljava/util/List;
   #466 = Utf8               decideWinnersOnTimeout
   #467 = Methodref          #17.#468     // ext/mods/battlerboss/matches/BattleBossRumble.endBattleAndProceed:(Ljava/util/List;)V
   #468 = NameAndType        #469:#244    // endBattleAndProceed:(Ljava/util/List;)V
   #469 = Utf8               endBattleAndProceed
   #470 = Methodref          #428.#471    // ext/mods/battlerboss/holder/BattleHolder.isWinnerByHpCp:()Z
   #471 = NameAndType        #472:#195    // isWinnerByHpCp:()Z
   #472 = Utf8               isWinnerByHpCp
   #473 = Methodref          #169.#3      // java/util/ArrayList."<init>":()V
   #474 = Methodref          #11.#475     // java/util/Collections.emptySet:()Ljava/util/Set;
   #475 = NameAndType        #476:#477    // emptySet:()Ljava/util/Set;
   #476 = Utf8               emptySet
   #477 = Utf8               ()Ljava/util/Set;
   #478 = InterfaceMethodref #181.#479    // java/util/Map.getOrDefault:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #479 = NameAndType        #480:#296    // getOrDefault:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #480 = Utf8               getOrDefault
   #481 = InterfaceMethodref #95.#255     // java/util/Set.isEmpty:()Z
   #482 = Methodref          #11.#483     // java/util/Collections.emptyList:()Ljava/util/List;
   #483 = NameAndType        #484:#441    // emptyList:()Ljava/util/List;
   #484 = Utf8               emptyList
   #485 = Double             -1.0d
   #487 = InterfaceMethodref #95.#187     // java/util/Set.iterator:()Ljava/util/Iterator;
   #488 = Methodref          #17.#489     // ext/mods/battlerboss/matches/BattleBossRumble.safeHp:(Lext/mods/gameserver/model/actor/Player;)D
   #489 = NameAndType        #490:#491    // safeHp:(Lext/mods/gameserver/model/actor/Player;)D
   #490 = Utf8               safeHp
   #491 = Utf8               (Lext/mods/gameserver/model/actor/Player;)D
   #492 = Methodref          #17.#493     // ext/mods/battlerboss/matches/BattleBossRumble.safeCp:(Lext/mods/gameserver/model/actor/Player;)D
   #493 = NameAndType        #494:#491    // safeCp:(Lext/mods/gameserver/model/actor/Player;)D
   #494 = Utf8               safeCp
   #495 = Methodref          #365.#496    // ext/mods/gameserver/model/actor/status/PlayerStatus.getHp:()D
   #496 = NameAndType        #497:#498    // getHp:()D
   #497 = Utf8               getHp
   #498 = Utf8               ()D
   #499 = Methodref          #164.#500    // java/lang/Math.max:(DD)D
   #500 = NameAndType        #167:#501    // max:(DD)D
   #501 = Utf8               (DD)D
   #502 = Methodref          #365.#503    // ext/mods/gameserver/model/actor/status/PlayerStatus.getCp:()D
   #503 = NameAndType        #504:#498    // getCp:()D
   #504 = Utf8               getCp
   #505 = Methodref          #42.#506     // java/util/concurrent/atomic/AtomicBoolean.compareAndSet:(ZZ)Z
   #506 = NameAndType        #507:#508    // compareAndSet:(ZZ)Z
   #507 = Utf8               compareAndSet
   #508 = Utf8               (ZZ)Z
   #509 = Fieldref           #17.#510     // ext/mods/battlerboss/matches/BattleBossRumble.taskBroadcast:Ljava/util/concurrent/ScheduledFuture;
   #510 = NameAndType        #511:#118    // taskBroadcast:Ljava/util/concurrent/ScheduledFuture;
   #511 = Utf8               taskBroadcast
   #512 = Methodref          #17.#513     // ext/mods/battlerboss/matches/BattleBossRumble.cancel:(Ljava/util/concurrent/ScheduledFuture;)V
   #513 = NameAndType        #514:#515    // cancel:(Ljava/util/concurrent/ScheduledFuture;)V
   #514 = Utf8               cancel
   #515 = Utf8               (Ljava/util/concurrent/ScheduledFuture;)V
   #516 = Long               11500l
   #518 = InvokeDynamic      #5:#519      // #5:run:(Lext/mods/battlerboss/matches/BattleBossRumble;Ljava/util/List;)Ljava/lang/Runnable;
   #519 = NameAndType        #105:#520    // run:(Lext/mods/battlerboss/matches/BattleBossRumble;Ljava/util/List;)Ljava/lang/Runnable;
   #520 = Utf8               (Lext/mods/battlerboss/matches/BattleBossRumble;Ljava/util/List;)Ljava/lang/Runnable;
   #521 = Methodref          #17.#522     // ext/mods/battlerboss/matches/BattleBossRumble.cleanup:(ZLjava/util/List;)V
   #522 = NameAndType        #523:#524    // cleanup:(ZLjava/util/List;)V
   #523 = Utf8               cleanup
   #524 = Utf8               (ZLjava/util/List;)V
   #525 = InterfaceMethodref #95.#526     // java/util/Set.contains:(Ljava/lang/Object;)Z
   #526 = NameAndType        #527:#220    // contains:(Ljava/lang/Object;)Z
   #527 = Utf8               contains
   #528 = InterfaceMethodref #181.#529    // java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
   #529 = NameAndType        #259:#530    // get:(Ljava/lang/Object;)Ljava/lang/Object;
   #530 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
   #531 = Methodref          #428.#532    // ext/mods/battlerboss/holder/BattleHolder.isStayDownOnDeath:()Z
   #532 = NameAndType        #533:#195    // isStayDownOnDeath:()Z
   #533 = Utf8               isStayDownOnDeath
   #534 = InterfaceMethodref #95.#277     // java/util/Set.remove:(Ljava/lang/Object;)Z
   #535 = String             #536         // You can try to get back into the fight if you can..
   #536 = Utf8               You can try to get back into the fight if you can..
   #537 = Methodref          #200.#538    // ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
   #538 = NameAndType        #539:#540    // sendMessage:(Ljava/lang/String;)V
   #539 = Utf8               sendMessage
   #540 = Utf8               (Ljava/lang/String;)V
   #541 = String             #542         // Your team has been eliminated!
   #542 = Utf8               Your team has been eliminated!
   #543 = Methodref          #17.#544     // ext/mods/battlerboss/matches/BattleBossRumble.giveRewardsChecked:(Lext/mods/gameserver/model/actor/Player;Z)V
   #544 = NameAndType        #545:#331    // giveRewardsChecked:(Lext/mods/gameserver/model/actor/Player;Z)V
   #545 = Utf8               giveRewardsChecked
   #546 = InvokeDynamic      #6:#547      // #6:run:(Lext/mods/battlerboss/matches/BattleBossRumble;Lext/mods/gameserver/model/actor/Player;)Ljava/lang/Runnable;
   #547 = NameAndType        #105:#548    // run:(Lext/mods/battlerboss/matches/BattleBossRumble;Lext/mods/gameserver/model/actor/Player;)Ljava/lang/Runnable;
   #548 = Utf8               (Lext/mods/battlerboss/matches/BattleBossRumble;Lext/mods/gameserver/model/actor/Player;)Ljava/lang/Runnable;
   #549 = Long               10000l
   #551 = InterfaceMethodref #95.#249     // java/util/Set.size:()I
   #552 = String             #553         // Congratulations! Your team won!
   #553 = Utf8               Congratulations! Your team won!
   #554 = InterfaceMethodref #178.#96     // java/util/List.addAll:(Ljava/util/Collection;)Z
   #555 = String             #556         // Congratulations! You defeated the boss!
   #556 = Utf8               Congratulations! You defeated the boss!
   #557 = Methodref          #302.#558    // ext/mods/battlerboss/holder/TeleportHolder.getReturnDelay:()I
   #558 = NameAndType        #559:#162    // getReturnDelay:()I
   #559 = Utf8               getReturnDelay
   #560 = InvokeDynamic      #7:#561      // #7:makeConcatWithConstants:(I)Ljava/lang/String;
   #561 = NameAndType        #562:#563    // makeConcatWithConstants:(I)Ljava/lang/String;
   #562 = Utf8               makeConcatWithConstants
   #563 = Utf8               (I)Ljava/lang/String;
   #564 = InvokeDynamic      #8:#519      // #8:run:(Lext/mods/battlerboss/matches/BattleBossRumble;Ljava/util/List;)Ljava/lang/Runnable;
   #565 = InterfaceMethodref #181.#566    // java/util/Map.remove:(Ljava/lang/Object;)Ljava/lang/Object;
   #566 = NameAndType        #275:#530    // remove:(Ljava/lang/Object;)Ljava/lang/Object;
   #567 = Methodref          #152.#568    // ext/mods/battlerboss/holder/EventHolder.getMonster:()Lext/mods/battlerboss/holder/MonsterChallengeHolder;
   #568 = NameAndType        #569:#570    // getMonster:()Lext/mods/battlerboss/holder/MonsterChallengeHolder;
   #569 = Utf8               getMonster
   #570 = Utf8               ()Lext/mods/battlerboss/holder/MonsterChallengeHolder;
   #571 = Methodref          #572.#573    // ext/mods/battlerboss/holder/MonsterChallengeHolder.getNpcId:()I
   #572 = Class              #574         // ext/mods/battlerboss/holder/MonsterChallengeHolder
   #573 = NameAndType        #575:#162    // getNpcId:()I
   #574 = Utf8               ext/mods/battlerboss/holder/MonsterChallengeHolder
   #575 = Utf8               getNpcId
   #576 = Methodref          #17.#577     // ext/mods/battlerboss/matches/BattleBossRumble.teleportBack:(Ljava/util/List;)V
   #577 = NameAndType        #578:#244    // teleportBack:(Ljava/util/List;)V
   #578 = Utf8               teleportBack
   #579 = Fieldref           #58.#580     // ext/mods/battlerboss/matches/BattleBossRumble$Phase.BOSS:Lext/mods/battlerboss/matches/BattleBossRumble$Phase;
   #580 = NameAndType        #581:#62     // BOSS:Lext/mods/battlerboss/matches/BattleBossRumble$Phase;
   #581 = Utf8               BOSS
   #582 = Methodref          #572.#583    // ext/mods/battlerboss/holder/MonsterChallengeHolder.isReviveTeam:()Z
   #583 = NameAndType        #584:#195    // isReviveTeam:()Z
   #584 = Utf8               isReviveTeam
   #585 = Methodref          #586.#587    // ext/mods/gameserver/data/xml/NpcData.getInstance:()Lext/mods/gameserver/data/xml/NpcData;
   #586 = Class              #588         // ext/mods/gameserver/data/xml/NpcData
   #587 = NameAndType        #84:#589     // getInstance:()Lext/mods/gameserver/data/xml/NpcData;
   #588 = Utf8               ext/mods/gameserver/data/xml/NpcData
   #589 = Utf8               ()Lext/mods/gameserver/data/xml/NpcData;
   #590 = Methodref          #586.#591    // ext/mods/gameserver/data/xml/NpcData.getTemplate:(I)Lext/mods/gameserver/model/actor/template/NpcTemplate;
   #591 = NameAndType        #592:#593    // getTemplate:(I)Lext/mods/gameserver/model/actor/template/NpcTemplate;
   #592 = Utf8               getTemplate
   #593 = Utf8               (I)Lext/mods/gameserver/model/actor/template/NpcTemplate;
   #594 = InvokeDynamic      #9:#561      // #9:makeConcatWithConstants:(I)Ljava/lang/String;
   #595 = Methodref          #134.#596    // java/util/logging/Logger.warning:(Ljava/lang/String;)V
   #596 = NameAndType        #597:#540    // warning:(Ljava/lang/String;)V
   #597 = Utf8               warning
   #598 = Methodref          #17.#599     // ext/mods/battlerboss/matches/BattleBossRumble.fallbackRewardAndExit:(Ljava/util/List;)V
   #599 = NameAndType        #600:#244    // fallbackRewardAndExit:(Ljava/util/List;)V
   #600 = Utf8               fallbackRewardAndExit
   #601 = Class              #602         // ext/mods/gameserver/model/spawn/Spawn
   #602 = Utf8               ext/mods/gameserver/model/spawn/Spawn
   #603 = Methodref          #601.#604    // ext/mods/gameserver/model/spawn/Spawn."<init>":(Lext/mods/gameserver/model/actor/template/NpcTemplate;)V
   #604 = NameAndType        #5:#605      // "<init>":(Lext/mods/gameserver/model/actor/template/NpcTemplate;)V
   #605 = Utf8               (Lext/mods/gameserver/model/actor/template/NpcTemplate;)V
   #606 = Class              #607         // ext/mods/gameserver/model/location/SpawnLocation
   #607 = Utf8               ext/mods/gameserver/model/location/SpawnLocation
   #608 = Methodref          #572.#609    // ext/mods/battlerboss/holder/MonsterChallengeHolder.getX:()I
   #609 = NameAndType        #610:#162    // getX:()I
   #610 = Utf8               getX
   #611 = Methodref          #572.#612    // ext/mods/battlerboss/holder/MonsterChallengeHolder.getY:()I
   #612 = NameAndType        #613:#162    // getY:()I
   #613 = Utf8               getY
   #614 = Methodref          #572.#615    // ext/mods/battlerboss/holder/MonsterChallengeHolder.getZ:()I
   #615 = NameAndType        #616:#162    // getZ:()I
   #616 = Utf8               getZ
   #617 = Integer            65535
   #618 = Methodref          #619.#620    // ext/mods/commons/random/Rnd.get:(I)I
   #619 = Class              #621         // ext/mods/commons/random/Rnd
   #620 = NameAndType        #259:#622    // get:(I)I
   #621 = Utf8               ext/mods/commons/random/Rnd
   #622 = Utf8               (I)I
   #623 = Methodref          #606.#624    // ext/mods/gameserver/model/location/SpawnLocation."<init>":(IIII)V
   #624 = NameAndType        #5:#625      // "<init>":(IIII)V
   #625 = Utf8               (IIII)V
   #626 = Methodref          #601.#627    // ext/mods/gameserver/model/spawn/Spawn.setLoc:(Lext/mods/gameserver/model/location/SpawnLocation;)V
   #627 = NameAndType        #628:#629    // setLoc:(Lext/mods/gameserver/model/location/SpawnLocation;)V
   #628 = Utf8               setLoc
   #629 = Utf8               (Lext/mods/gameserver/model/location/SpawnLocation;)V
   #630 = Methodref          #601.#631    // ext/mods/gameserver/model/spawn/Spawn.doSpawn:(Z)Lext/mods/gameserver/model/actor/Npc;
   #631 = NameAndType        #632:#633    // doSpawn:(Z)Lext/mods/gameserver/model/actor/Npc;
   #632 = Utf8               doSpawn
   #633 = Utf8               (Z)Lext/mods/gameserver/model/actor/Npc;
   #634 = Methodref          #601.#635    // ext/mods/gameserver/model/spawn/Spawn.getNpc:()Lext/mods/gameserver/model/actor/Npc;
   #635 = NameAndType        #636:#637    // getNpc:()Lext/mods/gameserver/model/actor/Npc;
   #636 = Utf8               getNpc
   #637 = Utf8               ()Lext/mods/gameserver/model/actor/Npc;
   #638 = Methodref          #639.#349    // ext/mods/gameserver/model/actor/Npc.setInstanceMap:(Lext/mods/InstanceMap/MapInstance;Z)V
   #639 = Class              #640         // ext/mods/gameserver/model/actor/Npc
   #640 = Utf8               ext/mods/gameserver/model/actor/Npc
   #641 = Methodref          #642.#643    // ext/mods/gameserver/data/manager/SpawnManager.getInstance:()Lext/mods/gameserver/data/manager/SpawnManager;
   #642 = Class              #644         // ext/mods/gameserver/data/manager/SpawnManager
   #643 = NameAndType        #84:#645     // getInstance:()Lext/mods/gameserver/data/manager/SpawnManager;
   #644 = Utf8               ext/mods/gameserver/data/manager/SpawnManager
   #645 = Utf8               ()Lext/mods/gameserver/data/manager/SpawnManager;
   #646 = Methodref          #642.#647    // ext/mods/gameserver/data/manager/SpawnManager.addSpawn:(Lext/mods/gameserver/model/spawn/Spawn;Z)V
   #647 = NameAndType        #648:#649    // addSpawn:(Lext/mods/gameserver/model/spawn/Spawn;Z)V
   #648 = Utf8               addSpawn
   #649 = Utf8               (Lext/mods/gameserver/model/spawn/Spawn;Z)V
   #650 = Methodref          #639.#651    // ext/mods/gameserver/model/actor/Npc.setIsParalyzed:(Z)V
   #651 = NameAndType        #652:#46     // setIsParalyzed:(Z)V
   #652 = Utf8               setIsParalyzed
   #653 = InvokeDynamic      #10:#654     // #10:run:(Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Player;)Ljava/lang/Runnable;
   #654 = NameAndType        #105:#655    // run:(Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Player;)Ljava/lang/Runnable;
   #655 = Utf8               (Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Player;)Ljava/lang/Runnable;
   #656 = Long               1500l
   #658 = InvokeDynamic      #11:#519     // #11:run:(Lext/mods/battlerboss/matches/BattleBossRumble;Ljava/util/List;)Ljava/lang/Runnable;
   #659 = Long               15500l
   #661 = Fieldref           #126.#662    // java/util/logging/Level.WARNING:Ljava/util/logging/Level;
   #662 = NameAndType        #663:#130    // WARNING:Ljava/util/logging/Level;
   #663 = Utf8               WARNING
   #664 = String             #665         // [Battle Boss] Falha ao spawnar monstro do desafio
   #665 = Utf8               [Battle Boss] Falha ao spawnar monstro do desafio
   #666 = Methodref          #667.#668    // ext/mods/battlerboss/holder/RewardsHolder.getWinners:()Ljava/util/List;
   #667 = Class              #669         // ext/mods/battlerboss/holder/RewardsHolder
   #668 = NameAndType        #670:#441    // getWinners:()Ljava/util/List;
   #669 = Utf8               ext/mods/battlerboss/holder/RewardsHolder
   #670 = Utf8               getWinners
   #671 = Methodref          #667.#672    // ext/mods/battlerboss/holder/RewardsHolder.getLosers:()Ljava/util/List;
   #672 = NameAndType        #673:#441    // getLosers:()Ljava/util/List;
   #673 = Utf8               getLosers
   #674 = Class              #675         // ext/mods/battlerboss/holder/RewardHolder
   #675 = Utf8               ext/mods/battlerboss/holder/RewardHolder
   #676 = Methodref          #674.#677    // ext/mods/battlerboss/holder/RewardHolder.getItemId:()I
   #677 = NameAndType        #678:#162    // getItemId:()I
   #678 = Utf8               getItemId
   #679 = Methodref          #674.#680    // ext/mods/battlerboss/holder/RewardHolder.getCount:()J
   #680 = NameAndType        #681:#416    // getCount:()J
   #681 = Utf8               getCount
   #682 = Methodref          #200.#683    // ext/mods/gameserver/model/actor/Player.addItem:(IIZ)Lext/mods/gameserver/model/item/instance/ItemInstance;
   #683 = NameAndType        #684:#685    // addItem:(IIZ)Lext/mods/gameserver/model/item/instance/ItemInstance;
   #684 = Utf8               addItem
   #685 = Utf8               (IIZ)Lext/mods/gameserver/model/item/instance/ItemInstance;
   #686 = Methodref          #200.#687    // ext/mods/gameserver/model/actor/Player.getClient:()Lext/mods/gameserver/network/GameClient;
   #687 = NameAndType        #688:#689    // getClient:()Lext/mods/gameserver/network/GameClient;
   #688 = Utf8               getClient
   #689 = Utf8               ()Lext/mods/gameserver/network/GameClient;
   #690 = Methodref          #691.#692    // ext/mods/gameserver/network/GameClient.getHWID:()Ljava/lang/String;
   #691 = Class              #693         // ext/mods/gameserver/network/GameClient
   #692 = NameAndType        #694:#695    // getHWID:()Ljava/lang/String;
   #693 = Utf8               ext/mods/gameserver/network/GameClient
   #694 = Utf8               getHWID
   #695 = Utf8               ()Ljava/lang/String;
   #696 = Methodref          #697.#255    // java/lang/String.isEmpty:()Z
   #697 = Class              #698         // java/lang/String
   #698 = Utf8               java/lang/String
   #699 = String             #700         // You cannot receive reward: There is already another character on the same HWID.
   #700 = Utf8               You cannot receive reward: There is already another character on the same HWID.
   #701 = Methodref          #152.#702    // ext/mods/battlerboss/holder/EventHolder.getRewards:()Lext/mods/battlerboss/holder/RewardsHolder;
   #702 = NameAndType        #703:#704    // getRewards:()Lext/mods/battlerboss/holder/RewardsHolder;
   #703 = Utf8               getRewards
   #704 = Utf8               ()Lext/mods/battlerboss/holder/RewardsHolder;
   #705 = Methodref          #17.#706     // ext/mods/battlerboss/matches/BattleBossRumble.giveRewards:(Lext/mods/gameserver/model/actor/Player;Lext/mods/battlerboss/holder/RewardsHolder;Z)V
   #706 = NameAndType        #707:#708    // giveRewards:(Lext/mods/gameserver/model/actor/Player;Lext/mods/battlerboss/holder/RewardsHolder;Z)V
   #707 = Utf8               giveRewards
   #708 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/battlerboss/holder/RewardsHolder;Z)V
   #709 = Methodref          #17.#710     // ext/mods/battlerboss/matches/BattleBossRumble.safeList:(Ljava/util/List;)Ljava/util/List;
   #710 = NameAndType        #711:#289    // safeList:(Ljava/util/List;)Ljava/util/List;
   #711 = Utf8               safeList
   #712 = Methodref          #200.#713    // ext/mods/gameserver/model/actor/Player.leaveBattleBoss:()V
   #713 = NameAndType        #714:#6      // leaveBattleBoss:()V
   #714 = Utf8               leaveBattleBoss
   #715 = Fieldref           #313.#716    // ext/mods/gameserver/enums/TeamType.NONE:Lext/mods/gameserver/enums/TeamType;
   #716 = NameAndType        #717:#317    // NONE:Lext/mods/gameserver/enums/TeamType;
   #717 = Utf8               NONE
   #718 = Methodref          #81.#719     // ext/mods/InstanceMap/InstanceManager.getInstance:(I)Lext/mods/InstanceMap/MapInstance;
   #719 = NameAndType        #84:#720     // getInstance:(I)Lext/mods/InstanceMap/MapInstance;
   #720 = Utf8               (I)Lext/mods/InstanceMap/MapInstance;
   #721 = Methodref          #302.#722    // ext/mods/battlerboss/holder/TeleportHolder.getReturnX:()I
   #722 = NameAndType        #723:#162    // getReturnX:()I
   #723 = Utf8               getReturnX
   #724 = Methodref          #302.#725    // ext/mods/battlerboss/holder/TeleportHolder.getReturnY:()I
   #725 = NameAndType        #726:#162    // getReturnY:()I
   #726 = Utf8               getReturnY
   #727 = Methodref          #302.#728    // ext/mods/battlerboss/holder/TeleportHolder.getReturnZ:()I
   #728 = NameAndType        #729:#162    // getReturnZ:()I
   #729 = Utf8               getReturnZ
   #730 = Fieldref           #17.#731     // ext/mods/battlerboss/matches/BattleBossRumble.taskPhaseTimeout:Ljava/util/concurrent/ScheduledFuture;
   #731 = NameAndType        #732:#118    // taskPhaseTimeout:Ljava/util/concurrent/ScheduledFuture;
   #732 = Utf8               taskPhaseTimeout
   #733 = Fieldref           #17.#734     // ext/mods/battlerboss/matches/BattleBossRumble.taskDisconnect:Ljava/util/concurrent/ScheduledFuture;
   #734 = NameAndType        #735:#118    // taskDisconnect:Ljava/util/concurrent/ScheduledFuture;
   #735 = Utf8               taskDisconnect
   #736 = Methodref          #639.#737    // ext/mods/gameserver/model/actor/Npc.deleteMe:()V
   #737 = NameAndType        #738:#6      // deleteMe:()V
   #738 = Utf8               deleteMe
   #739 = Methodref          #740.#448    // ext/mods/InstanceMap/MapInstance.getId:()I
   #740 = Class              #741         // ext/mods/InstanceMap/MapInstance
   #741 = Utf8               ext/mods/InstanceMap/MapInstance
   #742 = Methodref          #81.#743     // ext/mods/InstanceMap/InstanceManager.deleteInstance:(I)V
   #743 = NameAndType        #744:#247    // deleteInstance:(I)V
   #744 = Utf8               deleteInstance
   #745 = String             #746         // Falha ao deletar instance
   #746 = Utf8               Falha ao deletar instance
   #747 = Methodref          #748.#749    // ext/mods/battlerboss/register/BattleBossOpenRegister.getInstance:()Lext/mods/battlerboss/register/BattleBossOpenRegister;
   #748 = Class              #750         // ext/mods/battlerboss/register/BattleBossOpenRegister
   #749 = NameAndType        #84:#751     // getInstance:()Lext/mods/battlerboss/register/BattleBossOpenRegister;
   #750 = Utf8               ext/mods/battlerboss/register/BattleBossOpenRegister
   #751 = Utf8               ()Lext/mods/battlerboss/register/BattleBossOpenRegister;
   #752 = Methodref          #748.#753    // ext/mods/battlerboss/register/BattleBossOpenRegister.removeRumble:(I)V
   #753 = NameAndType        #754:#247    // removeRumble:(I)V
   #754 = Utf8               removeRumble
   #755 = Methodref          #17.#756     // ext/mods/battlerboss/matches/BattleBossRumble.removePlayer:(Lext/mods/gameserver/model/actor/Player;)V
   #756 = NameAndType        #757:#347    // removePlayer:(Lext/mods/gameserver/model/actor/Player;)V
   #757 = Utf8               removePlayer
   #758 = String             #759         // safeReturnAndDetach falhou
   #759 = Utf8               safeReturnAndDetach falhou
   #760 = Fieldref           #761.#762    // java/lang/Boolean.TRUE:Ljava/lang/Boolean;
   #761 = Class              #763         // java/lang/Boolean
   #762 = NameAndType        #764:#765    // TRUE:Ljava/lang/Boolean;
   #763 = Utf8               java/lang/Boolean
   #764 = Utf8               TRUE
   #765 = Utf8               Ljava/lang/Boolean;
   #766 = Methodref          #761.#767    // java/lang/Boolean.equals:(Ljava/lang/Object;)Z
   #767 = NameAndType        #768:#220    // equals:(Ljava/lang/Object;)Z
   #768 = Utf8               equals
   #769 = Methodref          #200.#770    // ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
   #770 = NameAndType        #771:#695    // getName:()Ljava/lang/String;
   #771 = Utf8               getName
   #772 = InvokeDynamic      #12:#773     // #12:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #773 = NameAndType        #562:#774    // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #774 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
   #775 = Methodref          #776.#777    // ext/mods/gameserver/model/World.announceToOnlinePlayers:(Ljava/lang/String;)V
   #776 = Class              #778         // ext/mods/gameserver/model/World
   #777 = NameAndType        #779:#540    // announceToOnlinePlayers:(Ljava/lang/String;)V
   #778 = Utf8               ext/mods/gameserver/model/World
   #779 = Utf8               announceToOnlinePlayers
   #780 = String             #781         // Boss
   #781 = Utf8               Boss
   #782 = String             #783         // Battle
   #783 = Utf8               Battle
   #784 = String             #785         // %02d:%02d
   #785 = Utf8               %02d:%02d
   #786 = Methodref          #787.#788    // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
   #787 = Class              #789         // java/lang/Integer
   #788 = NameAndType        #790:#791    // valueOf:(I)Ljava/lang/Integer;
   #789 = Utf8               java/lang/Integer
   #790 = Utf8               valueOf
   #791 = Utf8               (I)Ljava/lang/Integer;
   #792 = Methodref          #697.#793    // java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
   #793 = NameAndType        #794:#795    // format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
   #794 = Utf8               format
   #795 = Utf8               (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
   #796 = InvokeDynamic      #13:#797     // #13:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #797 = NameAndType        #562:#798    // makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #798 = Utf8               (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #799 = Class              #800         // ext/mods/gameserver/network/serverpackets/ExShowScreenMessage
   #800 = Utf8               ext/mods/gameserver/network/serverpackets/ExShowScreenMessage
   #801 = Fieldref           #802.#803    // ext/mods/gameserver/network/serverpackets/ExShowScreenMessage$SMPOS.BOTTOM_RIGHT:Lext/mods/gameserver/network/serverpackets/ExShowScreenMessage$SMPOS;
   #802 = Class              #804         // ext/mods/gameserver/network/serverpackets/ExShowScreenMessage$SMPOS
   #803 = NameAndType        #805:#806    // BOTTOM_RIGHT:Lext/mods/gameserver/network/serverpackets/ExShowScreenMessage$SMPOS;
   #804 = Utf8               ext/mods/gameserver/network/serverpackets/ExShowScreenMessage$SMPOS
   #805 = Utf8               BOTTOM_RIGHT
   #806 = Utf8               Lext/mods/gameserver/network/serverpackets/ExShowScreenMessage$SMPOS;
   #807 = Methodref          #799.#808    // ext/mods/gameserver/network/serverpackets/ExShowScreenMessage."<init>":(Ljava/lang/String;ILext/mods/gameserver/network/serverpackets/ExShowScreenMessage$SMPOS;Z)V
   #808 = NameAndType        #5:#809      // "<init>":(Ljava/lang/String;ILext/mods/gameserver/network/serverpackets/ExShowScreenMessage$SMPOS;Z)V
   #809 = Utf8               (Ljava/lang/String;ILext/mods/gameserver/network/serverpackets/ExShowScreenMessage$SMPOS;Z)V
   #810 = Methodref          #200.#811    // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #811 = NameAndType        #812:#813    // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #812 = Utf8               sendPacket
   #813 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #814 = Fieldref           #802.#815    // ext/mods/gameserver/network/serverpackets/ExShowScreenMessage$SMPOS.TOP_CENTER:Lext/mods/gameserver/network/serverpackets/ExShowScreenMessage$SMPOS;
   #815 = NameAndType        #816:#806    // TOP_CENTER:Lext/mods/gameserver/network/serverpackets/ExShowScreenMessage$SMPOS;
   #816 = Utf8               TOP_CENTER
   #817 = InterfaceMethodref #818.#819    // java/util/concurrent/ScheduledFuture.cancel:(Z)Z
   #818 = Class              #820         // java/util/concurrent/ScheduledFuture
   #819 = NameAndType        #514:#821    // cancel:(Z)Z
   #820 = Utf8               java/util/concurrent/ScheduledFuture
   #821 = Utf8               (Z)Z
   #822 = InvokeDynamic      #14:#104     // #14:run:(Lext/mods/battlerboss/matches/BattleBossRumble;)Ljava/lang/Runnable;
   #823 = Methodref          #110.#824    // ext/mods/commons/pool/ThreadPool.scheduleAtFixedRate:(Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
   #824 = NameAndType        #825:#826    // scheduleAtFixedRate:(Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
   #825 = Utf8               scheduleAtFixedRate
   #826 = Utf8               (Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
   #827 = Methodref          #200.#828    // ext/mods/gameserver/model/actor/Player.setInvul:(Z)V
   #828 = NameAndType        #829:#46     // setInvul:(Z)V
   #829 = Utf8               setInvul
   #830 = Methodref          #200.#831    // ext/mods/gameserver/model/actor/Player.setIsImmobilized:(Z)V
   #831 = NameAndType        #832:#46     // setIsImmobilized:(Z)V
   #832 = Utf8               setIsImmobilized
   #833 = String             #834         // Falha ao setar Invul/Immob
   #834 = Utf8               Falha ao setar Invul/Immob
   #835 = InvokeDynamic      #15:#104     // #15:run:(Lext/mods/battlerboss/matches/BattleBossRumble;)Ljava/lang/Runnable;
   #836 = Long               5000l
   #838 = Methodref          #200.#839    // ext/mods/gameserver/model/actor/Player.isOnline:()Z
   #839 = NameAndType        #840:#195    // isOnline:()Z
   #840 = Utf8               isOnline
   #841 = String             #842         // Seu time foi eliminado (desconexão)!
   #842 = Utf8               Seu time foi eliminado (desconexão)!
   #843 = Methodref          #844.#845    // java/util/Arrays.asList:([Ljava/lang/Object;)Ljava/util/List;
   #844 = Class              #846         // java/util/Arrays
   #845 = NameAndType        #847:#848    // asList:([Ljava/lang/Object;)Ljava/util/List;
   #846 = Utf8               java/util/Arrays
   #847 = Utf8               asList
   #848 = Utf8               ([Ljava/lang/Object;)Ljava/util/List;
   #849 = String             #850         // O time inimigo foi eliminado (desconexão)!
   #850 = Utf8               O time inimigo foi eliminado (desconexão)!
   #851 = Methodref          #200.#852    // ext/mods/gameserver/model/actor/Player.isOnlineInt:()I
   #852 = NameAndType        #853:#162    // isOnlineInt:()I
   #853 = Utf8               isOnlineInt
   #854 = Methodref          #200.#855    // ext/mods/gameserver/model/actor/Player.getOfflineStartTime:()J
   #855 = NameAndType        #856:#416    // getOfflineStartTime:()J
   #856 = Utf8               getOfflineStartTime
   #857 = Methodref          #200.#858    // ext/mods/gameserver/model/actor/Player.isTeleporting:()Z
   #858 = NameAndType        #859:#195    // isTeleporting:()Z
   #859 = Utf8               isTeleporting
   #860 = Methodref          #200.#861    // ext/mods/gameserver/model/actor/Player.getInstanceMap:()Lext/mods/InstanceMap/MapInstance;
   #861 = NameAndType        #862:#89     // getInstanceMap:()Lext/mods/InstanceMap/MapInstance;
   #862 = Utf8               getInstanceMap
   #863 = Methodref          #17.#864     // ext/mods/battlerboss/matches/BattleBossRumble.handleDisconnect:(Lext/mods/gameserver/model/actor/Player;)V
   #864 = NameAndType        #865:#347    // handleDisconnect:(Lext/mods/gameserver/model/actor/Player;)V
   #865 = Utf8               handleDisconnect
   #866 = Methodref          #572.#867    // ext/mods/battlerboss/holder/MonsterChallengeHolder.getTimeLimit:()I
   #867 = NameAndType        #868:#162    // getTimeLimit:()I
   #868 = Utf8               getTimeLimit
   #869 = InvokeDynamic      #16:#519     // #16:run:(Lext/mods/battlerboss/matches/BattleBossRumble;Ljava/util/List;)Ljava/lang/Runnable;
   #870 = InvokeDynamic      #17:#519     // #17:run:(Lext/mods/battlerboss/matches/BattleBossRumble;Ljava/util/List;)Ljava/lang/Runnable;
   #871 = Methodref          #872.#873    // ext/mods/battlerboss/cinematic/CinematicTaskEpicTrailer.playNpcCinematic:(Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Player;)V
   #872 = Class              #874         // ext/mods/battlerboss/cinematic/CinematicTaskEpicTrailer
   #873 = NameAndType        #875:#876    // playNpcCinematic:(Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Player;)V
   #874 = Utf8               ext/mods/battlerboss/cinematic/CinematicTaskEpicTrailer
   #875 = Utf8               playNpcCinematic
   #876 = Utf8               (Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Player;)V
   #877 = Methodref          #17.#878     // ext/mods/battlerboss/matches/BattleBossRumble.safeReturnAndDetach:(Lext/mods/gameserver/model/actor/Player;)V
   #878 = NameAndType        #879:#347    // safeReturnAndDetach:(Lext/mods/gameserver/model/actor/Player;)V
   #879 = Utf8               safeReturnAndDetach
   #880 = Methodref          #17.#881     // ext/mods/battlerboss/matches/BattleBossRumble.spawnMonsterChallenge:(Ljava/util/List;)V
   #881 = NameAndType        #882:#244    // spawnMonsterChallenge:(Ljava/util/List;)V
   #882 = Utf8               spawnMonsterChallenge
   #883 = String             #884         // spawnMonsterChallenge falhou
   #884 = Utf8               spawnMonsterChallenge falhou
   #885 = Methodref          #886.#770    // java/lang/Class.getName:()Ljava/lang/String;
   #886 = Class              #887         // java/lang/Class
   #887 = Utf8               java/lang/Class
   #888 = Methodref          #134.#889    // java/util/logging/Logger.getLogger:(Ljava/lang/String;)Ljava/util/logging/Logger;
   #889 = NameAndType        #890:#891    // getLogger:(Ljava/lang/String;)Ljava/util/logging/Logger;
   #890 = Utf8               getLogger
   #891 = Utf8               (Ljava/lang/String;)Ljava/util/logging/Logger;
   #892 = Class              #893         // java/lang/Runnable
   #893 = Utf8               java/lang/Runnable
   #894 = Utf8               Signature
   #895 = Utf8               Ljava/util/Set<Lext/mods/gameserver/model/actor/Player;>;
   #896 = Utf8               Ljava/util/List<Lext/mods/battlerboss/matches/BattleBossRumble$Team;>;
   #897 = Utf8               Ljava/util/Map<Lext/mods/gameserver/model/actor/Player;Lext/mods/battlerboss/matches/BattleBossRumble$Team;>;
   #898 = Utf8               Ljava/util/Set<Lext/mods/battlerboss/matches/BattleBossRumble$Team;>;
   #899 = Utf8               Ljava/util/Map<Lext/mods/battlerboss/matches/BattleBossRumble$Team;Ljava/util/Set<Lext/mods/gameserver/model/actor/Player;>;>;
   #900 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/spawn/Spawn;>;
   #901 = Utf8               Ljava/util/concurrent/ScheduledFuture<*>;
   #902 = Utf8               Ljava/util/Map<Lext/mods/battlerboss/matches/BattleBossRumble$Team;Ljava/lang/Boolean;>;
   #903 = Utf8               Ljava/util/Set<Ljava/lang/String;>;
   #904 = Utf8               (ILext/mods/battlerboss/holder/EventHolder;Ljava/util/List;)V
   #905 = Utf8               Code
   #906 = Utf8               LineNumberTable
   #907 = Utf8               LocalVariableTable
   #908 = Utf8               this
   #909 = Utf8               Lext/mods/battlerboss/matches/BattleBossRumble;
   #910 = Utf8               players
   #911 = Utf8               LocalVariableTypeTable
   #912 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/actor/Player;>;
   #913 = Utf8               StackMapTable
   #914 = Utf8               (ILext/mods/battlerboss/holder/EventHolder;Ljava/util/List<Lext/mods/gameserver/model/actor/Player;>;)V
   #915 = Utf8               t
   #916 = Utf8               Ljava/lang/Throwable;
   #917 = Utf8               p
   #918 = Utf8               Lext/mods/gameserver/model/actor/Player;
   #919 = Utf8               partyPlayers
   #920 = Utf8               clanPlayers
   #921 = Utf8               oneTeam
   #922 = Utf8               mid
   #923 = Utf8               groupSize
   #924 = Utf8               pool
   #925 = Utf8               byParty
   #926 = Utf8               byClan
   #927 = Utf8               buffer
   #928 = Utf8               Ljava/util/Map<Lext/mods/gameserver/model/group/Party;Ljava/util/List<Lext/mods/gameserver/model/actor/Player;>;>;
   #929 = Utf8               Ljava/util/Map<Lext/mods/gameserver/model/pledge/Clan;Ljava/util/List<Lext/mods/gameserver/model/actor/Player;>;>;
   #930 = Utf8               take
   #931 = Utf8               i
   #932 = Utf8               squad
   #933 = Utf8               src
   #934 = Utf8               (Ljava/util/List<Lext/mods/gameserver/model/actor/Player;>;Ljava/util/List<Lext/mods/gameserver/model/actor/Player;>;I)V
   #935 = Utf8               list
   #936 = Utf8               team
   #937 = Utf8               Lext/mods/battlerboss/matches/BattleBossRumble$Team;
   #938 = Utf8               aliveSet
   #939 = Utf8               (Ljava/util/List<Lext/mods/gameserver/model/actor/Player;>;)V
   #940 = Utf8               row
   #941 = Utf8               col
   #942 = Utf8               offsetX
   #943 = Utf8               offsetY
   #944 = Utf8               e
   #945 = Utf8               Ljava/lang/Exception;
   #946 = Utf8               color
   #947 = Utf8               spacing
   #948 = Utf8               baseX
   #949 = Utf8               baseY
   #950 = Utf8               rowSize
   #951 = Utf8               index
   #952 = Utf8               arenaX
   #953 = Utf8               arenaY
   #954 = Utf8               arenaZ
   #955 = Utf8               colorToggle
   #956 = Utf8               onBattleTimeOver
   #957 = Utf8               winners
   #958 = Utf8               score
   #959 = Utf8               D
   #960 = Utf8               alive
   #961 = Utf8               winnerByHpCp
   #962 = Utf8               Z
   #963 = Utf8               contenders
   #964 = Utf8               bestTeam
   #965 = Utf8               bestScore
   #966 = Utf8               bestAlive
   #967 = Utf8               ()Ljava/util/List<Lext/mods/gameserver/model/actor/Player;>;
   #968 = Utf8               delay
   #969 = Utf8               onPlayerDeath
   #970 = Utf8               member
   #971 = Utf8               w
   #972 = Utf8               deadPlayer
   #973 = Utf8               stayDownOnDeath
   #974 = Utf8               onPlayerDeathMonster
   #975 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Creature;)V
   #976 = Utf8               player
   #977 = Utf8               monster
   #978 = Utf8               Lext/mods/gameserver/model/actor/Creature;
   #979 = Utf8               template
   #980 = Utf8               Lext/mods/gameserver/model/actor/template/NpcTemplate;
   #981 = Utf8               spawn
   #982 = Utf8               Lext/mods/gameserver/model/spawn/Spawn;
   #983 = Utf8               npc
   #984 = Utf8               Lext/mods/gameserver/model/actor/Npc;
   #985 = Utf8               npcId
   #986 = Class              #987         // ext/mods/gameserver/model/actor/template/NpcTemplate
   #987 = Utf8               ext/mods/gameserver/model/actor/template/NpcTemplate
   #988 = Utf8               itemId
   #989 = Utf8               itemCount
   #990 = Utf8               reward
   #991 = Utf8               Lext/mods/battlerboss/holder/RewardHolder;
   #992 = Utf8               rewards
   #993 = Utf8               Lext/mods/battlerboss/holder/RewardsHolder;
   #994 = Utf8               winner
   #995 = Utf8               Ljava/util/List<Lext/mods/battlerboss/holder/RewardHolder;>;
   #996 = Utf8               hwid
   #997 = Utf8               Ljava/lang/String;
   #998 = Utf8               n
   #999 = Utf8               s
  #1000 = Utf8               teleportSingle
  #1001 = Utf8               (ZLjava/util/List<Lext/mods/gameserver/model/actor/Player;>;)V
  #1002 = Utf8               surrenderTeam
  #1003 = Utf8               broadcastTimer
  #1004 = Utf8               elapsed
  #1005 = Utf8               remaining
  #1006 = Utf8               totalSeconds
  #1007 = Utf8               minutes
  #1008 = Utf8               seconds
  #1009 = Utf8               label
  #1010 = Utf8               text
  #1011 = Utf8               packet
  #1012 = Utf8               Lext/mods/gameserver/network/serverpackets/ExShowScreenMessage;
  #1013 = Utf8               msg
  #1014 = Utf8               task
  #1015 = Utf8               (Ljava/util/concurrent/ScheduledFuture<*>;)V
  #1016 = Utf8               r
  #1017 = Utf8               Ljava/lang/Runnable;
  #1018 = Utf8               delayMs
  #1019 = Utf8               on
  #1020 = Utf8               winnerTeam
  #1021 = Utf8               (Ljava/util/List<Lext/mods/gameserver/model/actor/Player;>;)Ljava/util/List<Lext/mods/gameserver/model/actor/Player;>;
  #1022 = Utf8               lambda$startDisconnectionWatcher$0
  #1023 = Utf8               invalid
  #1024 = Utf8               i$
  #1025 = Utf8               Ljava/util/Iterator;
  #1026 = Utf8               lambda$spawnMonsterChallenge$1
  #1027 = Utf8               lambda$spawnMonsterChallenge$2
  #1028 = Utf8               lambda$spawnMonsterChallenge$3
  #1029 = Utf8               lambda$spawnMonsterChallenge$0
  #1030 = Utf8               lambda$onPlayerDeathMonster$0
  #1031 = Utf8               lambda$onPlayerDeath$0
  #1032 = Utf8               lambda$endBattleAndProceed$0
  #1033 = Utf8               lambda$addTeam$0
  #1034 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Z
  #1035 = Utf8               lambda$makeTeams$1
  #1036 = Utf8               (Lext/mods/gameserver/model/pledge/Clan;)Ljava/util/List;
  #1037 = Utf8               k
  #1038 = Utf8               Lext/mods/gameserver/model/pledge/Clan;
  #1039 = Utf8               lambda$makeTeams$0
  #1040 = Utf8               (Lext/mods/gameserver/model/group/Party;)Ljava/util/List;
  #1041 = Utf8               Lext/mods/gameserver/model/group/Party;
  #1042 = Utf8               <clinit>
  #1043 = Utf8               SourceFile
  #1044 = Utf8               BattleBossRumble.java
  #1045 = Utf8               NestMembers
  #1046 = Utf8               BootstrapMethods
  #1047 = MethodType         #6           //  ()V
  #1048 = MethodHandle       5:#461       // REF_invokeVirtual ext/mods/battlerboss/matches/BattleBossRumble.startBattleSafe:()V
  #1049 = MethodType         #530         //  (Ljava/lang/Object;)Ljava/lang/Object;
  #1050 = MethodHandle       6:#1051      // REF_invokeStatic ext/mods/battlerboss/matches/BattleBossRumble.lambda$makeTeams$0:(Lext/mods/gameserver/model/group/Party;)Ljava/util/List;
  #1051 = Methodref          #17.#1052    // ext/mods/battlerboss/matches/BattleBossRumble.lambda$makeTeams$0:(Lext/mods/gameserver/model/group/Party;)Ljava/util/List;
  #1052 = NameAndType        #1039:#1040  // lambda$makeTeams$0:(Lext/mods/gameserver/model/group/Party;)Ljava/util/List;
  #1053 = MethodType         #1040        //  (Lext/mods/gameserver/model/group/Party;)Ljava/util/List;
  #1054 = MethodHandle       6:#1055      // REF_invokeStatic ext/mods/battlerboss/matches/BattleBossRumble.lambda$makeTeams$1:(Lext/mods/gameserver/model/pledge/Clan;)Ljava/util/List;
  #1055 = Methodref          #17.#1056    // ext/mods/battlerboss/matches/BattleBossRumble.lambda$makeTeams$1:(Lext/mods/gameserver/model/pledge/Clan;)Ljava/util/List;
  #1056 = NameAndType        #1035:#1036  // lambda$makeTeams$1:(Lext/mods/gameserver/model/pledge/Clan;)Ljava/util/List;
  #1057 = MethodType         #1036        //  (Lext/mods/gameserver/model/pledge/Clan;)Ljava/util/List;
  #1058 = MethodType         #220         //  (Ljava/lang/Object;)Z
  #1059 = MethodHandle       6:#1060      // REF_invokeStatic ext/mods/battlerboss/matches/BattleBossRumble.lambda$addTeam$0:(Lext/mods/gameserver/model/actor/Player;)Z
  #1060 = Methodref          #17.#1061    // ext/mods/battlerboss/matches/BattleBossRumble.lambda$addTeam$0:(Lext/mods/gameserver/model/actor/Player;)Z
  #1061 = NameAndType        #1033:#1034  // lambda$addTeam$0:(Lext/mods/gameserver/model/actor/Player;)Z
  #1062 = MethodType         #1034        //  (Lext/mods/gameserver/model/actor/Player;)Z
  #1063 = MethodHandle       5:#1064      // REF_invokeVirtual ext/mods/battlerboss/matches/BattleBossRumble.onBattleTimeOver:()V
  #1064 = Methodref          #17.#1065    // ext/mods/battlerboss/matches/BattleBossRumble.onBattleTimeOver:()V
  #1065 = NameAndType        #956:#6      // onBattleTimeOver:()V
  #1066 = MethodHandle       5:#1067      // REF_invokeVirtual ext/mods/battlerboss/matches/BattleBossRumble.lambda$endBattleAndProceed$0:(Ljava/util/List;)V
  #1067 = Methodref          #17.#1068    // ext/mods/battlerboss/matches/BattleBossRumble.lambda$endBattleAndProceed$0:(Ljava/util/List;)V
  #1068 = NameAndType        #1032:#244   // lambda$endBattleAndProceed$0:(Ljava/util/List;)V
  #1069 = MethodHandle       5:#1070      // REF_invokeVirtual ext/mods/battlerboss/matches/BattleBossRumble.lambda$onPlayerDeath$0:(Lext/mods/gameserver/model/actor/Player;)V
  #1070 = Methodref          #17.#1071    // ext/mods/battlerboss/matches/BattleBossRumble.lambda$onPlayerDeath$0:(Lext/mods/gameserver/model/actor/Player;)V
  #1071 = NameAndType        #1031:#347   // lambda$onPlayerDeath$0:(Lext/mods/gameserver/model/actor/Player;)V
  #1072 = String             #1073        // Teleport em \u0001 segundos.
  #1073 = Utf8               Teleport em \u0001 segundos.
  #1074 = MethodHandle       5:#1075      // REF_invokeVirtual ext/mods/battlerboss/matches/BattleBossRumble.lambda$onPlayerDeathMonster$0:(Ljava/util/List;)V
  #1075 = Methodref          #17.#1076    // ext/mods/battlerboss/matches/BattleBossRumble.lambda$onPlayerDeathMonster$0:(Ljava/util/List;)V
  #1076 = NameAndType        #1030:#244   // lambda$onPlayerDeathMonster$0:(Ljava/util/List;)V
  #1077 = String             #1078        // [Battle Boss] NPC Template não encontrado para ID: \u0001
  #1078 = Utf8               [Battle Boss] NPC Template não encontrado para ID: \u0001
  #1079 = MethodHandle       6:#1080      // REF_invokeStatic ext/mods/battlerboss/matches/BattleBossRumble.lambda$spawnMonsterChallenge$0:(Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Player;)V
  #1080 = Methodref          #17.#1081    // ext/mods/battlerboss/matches/BattleBossRumble.lambda$spawnMonsterChallenge$0:(Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Player;)V
  #1081 = NameAndType        #1029:#876   // lambda$spawnMonsterChallenge$0:(Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Player;)V
  #1082 = MethodHandle       5:#1083      // REF_invokeVirtual ext/mods/battlerboss/matches/BattleBossRumble.lambda$spawnMonsterChallenge$1:(Ljava/util/List;)V
  #1083 = Methodref          #17.#1084    // ext/mods/battlerboss/matches/BattleBossRumble.lambda$spawnMonsterChallenge$1:(Ljava/util/List;)V
  #1084 = NameAndType        #1026:#244   // lambda$spawnMonsterChallenge$1:(Ljava/util/List;)V
  #1085 = String             #1086        // [BattleBoss] O time de \u0001 desistiu da batalha.
  #1086 = Utf8               [BattleBoss] O time de \u0001 desistiu da batalha.
  #1087 = String             #1088        // \u0001 \u0001
  #1088 = Utf8               \u0001 \u0001
  #1089 = MethodHandle       5:#1090      // REF_invokeVirtual ext/mods/battlerboss/matches/BattleBossRumble.broadcastTimer:()V
  #1090 = Methodref          #17.#1091    // ext/mods/battlerboss/matches/BattleBossRumble.broadcastTimer:()V
  #1091 = NameAndType        #1003:#6     // broadcastTimer:()V
  #1092 = MethodHandle       5:#1093      // REF_invokeVirtual ext/mods/battlerboss/matches/BattleBossRumble.lambda$startDisconnectionWatcher$0:()V
  #1093 = Methodref          #17.#1094    // ext/mods/battlerboss/matches/BattleBossRumble.lambda$startDisconnectionWatcher$0:()V
  #1094 = NameAndType        #1022:#6     // lambda$startDisconnectionWatcher$0:()V
  #1095 = MethodHandle       5:#1096      // REF_invokeVirtual ext/mods/battlerboss/matches/BattleBossRumble.lambda$spawnMonsterChallenge$2:(Ljava/util/List;)V
  #1096 = Methodref          #17.#1097    // ext/mods/battlerboss/matches/BattleBossRumble.lambda$spawnMonsterChallenge$2:(Ljava/util/List;)V
  #1097 = NameAndType        #1027:#244   // lambda$spawnMonsterChallenge$2:(Ljava/util/List;)V
  #1098 = MethodHandle       5:#1099      // REF_invokeVirtual ext/mods/battlerboss/matches/BattleBossRumble.lambda$spawnMonsterChallenge$3:(Ljava/util/List;)V
  #1099 = Methodref          #17.#1100    // ext/mods/battlerboss/matches/BattleBossRumble.lambda$spawnMonsterChallenge$3:(Ljava/util/List;)V
  #1100 = NameAndType        #1028:#244   // lambda$spawnMonsterChallenge$3:(Ljava/util/List;)V
  #1101 = MethodHandle       6:#1102      // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #1102 = Methodref          #1103.#1104  // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #1103 = Class              #1105        // java/lang/invoke/LambdaMetafactory
  #1104 = NameAndType        #1106:#1107  // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #1105 = Utf8               java/lang/invoke/LambdaMetafactory
  #1106 = Utf8               metafactory
  #1107 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #1108 = MethodHandle       6:#1109      // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #1109 = Methodref          #1110.#1111  // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #1110 = Class              #1112        // java/lang/invoke/StringConcatFactory
  #1111 = NameAndType        #562:#1113   // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #1112 = Utf8               java/lang/invoke/StringConcatFactory
  #1113 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #1114 = Utf8               InnerClasses
  #1115 = Utf8               Phase
  #1116 = Utf8               Team
  #1117 = Utf8               SMPOS
  #1118 = Class              #1119        // java/lang/invoke/MethodHandles$Lookup
  #1119 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #1120 = Class              #1121        // java/lang/invoke/MethodHandles
  #1121 = Utf8               java/lang/invoke/MethodHandles
  #1122 = Utf8               Lookup
{
  public ext.mods.battlerboss.matches.BattleBossRumble(int, ext.mods.battlerboss.holder.EventHolder, java.util.List<ext.mods.gameserver.model.actor.Player>);
    descriptor: (ILext/mods/battlerboss/holder/EventHolder;Ljava/util/List;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=4, args_size=4
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: new           #7                  // class java/util/concurrent/ConcurrentHashMap
         8: dup
         9: invokespecial #9                  // Method java/util/concurrent/ConcurrentHashMap."<init>":()V
        12: invokestatic  #10                 // Method java/util/Collections.newSetFromMap:(Ljava/util/Map;)Ljava/util/Set;
        15: putfield      #16                 // Field participants:Ljava/util/Set;
        18: aload_0
        19: new           #22                 // class java/util/concurrent/CopyOnWriteArrayList
        22: dup
        23: invokespecial #24                 // Method java/util/concurrent/CopyOnWriteArrayList."<init>":()V
        26: putfield      #25                 // Field teams:Ljava/util/List;
        29: aload_0
        30: new           #7                  // class java/util/concurrent/ConcurrentHashMap
        33: dup
        34: invokespecial #9                  // Method java/util/concurrent/ConcurrentHashMap."<init>":()V
        37: putfield      #29                 // Field playerTeam:Ljava/util/Map;
        40: aload_0
        41: new           #7                  // class java/util/concurrent/ConcurrentHashMap
        44: dup
        45: invokespecial #9                  // Method java/util/concurrent/ConcurrentHashMap."<init>":()V
        48: invokestatic  #10                 // Method java/util/Collections.newSetFromMap:(Ljava/util/Map;)Ljava/util/Set;
        51: putfield      #33                 // Field aliveTeams:Ljava/util/Set;
        54: aload_0
        55: new           #7                  // class java/util/concurrent/ConcurrentHashMap
        58: dup
        59: invokespecial #9                  // Method java/util/concurrent/ConcurrentHashMap."<init>":()V
        62: putfield      #36                 // Field aliveMembersByTeam:Ljava/util/Map;
        65: aload_0
        66: new           #22                 // class java/util/concurrent/CopyOnWriteArrayList
        69: dup
        70: invokespecial #24                 // Method java/util/concurrent/CopyOnWriteArrayList."<init>":()V
        73: putfield      #39                 // Field monsterSpawns:Ljava/util/List;
        76: aload_0
        77: new           #42                 // class java/util/concurrent/atomic/AtomicBoolean
        80: dup
        81: iconst_0
        82: invokespecial #44                 // Method java/util/concurrent/atomic/AtomicBoolean."<init>":(Z)V
        85: putfield      #47                 // Field finished:Ljava/util/concurrent/atomic/AtomicBoolean;
        88: aload_0
        89: new           #42                 // class java/util/concurrent/atomic/AtomicBoolean
        92: dup
        93: iconst_0
        94: invokespecial #44                 // Method java/util/concurrent/atomic/AtomicBoolean."<init>":(Z)V
        97: putfield      #51                 // Field battleStarted:Ljava/util/concurrent/atomic/AtomicBoolean;
       100: aload_0
       101: new           #42                 // class java/util/concurrent/atomic/AtomicBoolean
       104: dup
       105: iconst_0
       106: invokespecial #44                 // Method java/util/concurrent/atomic/AtomicBoolean."<init>":(Z)V
       109: putfield      #54                 // Field paused:Ljava/util/concurrent/atomic/AtomicBoolean;
       112: aload_0
       113: getstatic     #57                 // Field ext/mods/battlerboss/matches/BattleBossRumble$Phase.PREP:Lext/mods/battlerboss/matches/BattleBossRumble$Phase;
       116: putfield      #63                 // Field phase:Lext/mods/battlerboss/matches/BattleBossRumble$Phase;
       119: aload_0
       120: new           #7                  // class java/util/concurrent/ConcurrentHashMap
       123: dup
       124: invokespecial #9                  // Method java/util/concurrent/ConcurrentHashMap."<init>":()V
       127: putfield      #66                 // Field teamOfflineFlag:Ljava/util/Map;
       130: aload_0
       131: new           #7                  // class java/util/concurrent/ConcurrentHashMap
       134: dup
       135: invokespecial #9                  // Method java/util/concurrent/ConcurrentHashMap."<init>":()V
       138: invokestatic  #10                 // Method java/util/Collections.newSetFromMap:(Ljava/util/Map;)Ljava/util/Set;
       141: putfield      #69                 // Field rewardedHwids:Ljava/util/Set;
       144: aload_0
       145: iload_1
       146: putfield      #72                 // Field rumbleId:I
       149: aload_0
       150: aload_2
       151: putfield      #76                 // Field event:Lext/mods/battlerboss/holder/EventHolder;
       154: aload_0
       155: invokestatic  #80                 // Method ext/mods/InstanceMap/InstanceManager.getInstance:()Lext/mods/InstanceMap/InstanceManager;
       158: invokevirtual #86                 // Method ext/mods/InstanceMap/InstanceManager.createInstance:()Lext/mods/InstanceMap/MapInstance;
       161: putfield      #90                 // Field instance:Lext/mods/InstanceMap/MapInstance;
       164: aload_3
       165: ifnull        179
       168: aload_0
       169: getfield      #16                 // Field participants:Ljava/util/Set;
       172: aload_3
       173: invokeinterface #94,  2           // InterfaceMethod java/util/Set.addAll:(Ljava/util/Collection;)Z
       178: pop
       179: return
      LineNumberTable:
        line 126: 0
        line 101: 4
        line 102: 18
        line 103: 29
        line 104: 40
        line 105: 54
        line 107: 65
        line 114: 76
        line 115: 88
        line 116: 100
        line 117: 112
        line 122: 119
        line 123: 130
        line 127: 144
        line 128: 149
        line 129: 154
        line 130: 164
        line 132: 168
        line 134: 179
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     180     0  this   Lext/mods/battlerboss/matches/BattleBossRumble;
            0     180     1 rumbleId   I
            0     180     2 event   Lext/mods/battlerboss/holder/EventHolder;
            0     180     3 players   Ljava/util/List;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0     180     3 players   Ljava/util/List<Lext/mods/gameserver/model/actor/Player;>;
      StackMapTable: number_of_entries = 1
        frame_type = 255 /* full_frame */
          offset_delta = 179
          locals = [ class ext/mods/battlerboss/matches/BattleBossRumble, int, class ext/mods/battlerboss/holder/EventHolder, class java/util/List ]
          stack = []
    Signature: #914                         // (ILext/mods/battlerboss/holder/EventHolder;Ljava/util/List<Lext/mods/gameserver/model/actor/Player;>;)V

  public void run();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=2, args_size=1
         0: aload_0
         1: invokevirtual #100                // Method startPreparation:()V
         4: aload_0
         5: aload_0
         6: invokedynamic #103,  0            // InvokeDynamic #0:run:(Lext/mods/battlerboss/matches/BattleBossRumble;)Ljava/lang/Runnable;
        11: ldc2_w        #107                // long 7000l
        14: invokestatic  #109                // Method ext/mods/commons/pool/ThreadPool.schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
        17: putfield      #115                // Field taskStartBattle:Ljava/util/concurrent/ScheduledFuture;
        20: goto          40
        23: astore_1
        24: getstatic     #121                // Field LOGGER:Ljava/util/logging/Logger;
        27: getstatic     #125                // Field java/util/logging/Level.SEVERE:Ljava/util/logging/Level;
        30: ldc           #131                // String [BattleBoss] Falha no run inicial
        32: aload_1
        33: invokevirtual #133                // Method java/util/logging/Logger.log:(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V
        36: aload_0
        37: invokevirtual #139                // Method forceFinish:()V
        40: return
      Exception table:
         from    to  target type
             0    20    23   Class java/lang/Throwable
      LineNumberTable:
        line 141: 0
        line 142: 4
        line 148: 20
        line 144: 23
        line 146: 24
        line 147: 36
        line 149: 40
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           24      16     1     t   Ljava/lang/Throwable;
            0      41     0  this   Lext/mods/battlerboss/matches/BattleBossRumble;
      StackMapTable: number_of_entries = 2
        frame_type = 87 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 16 /* same */

  public void onPlayerDeath(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=8, args_size=2
         0: aload_0
         1: getfield      #51                 // Field battleStarted:Ljava/util/concurrent/atomic/AtomicBoolean;
         4: invokevirtual #403                // Method java/util/concurrent/atomic/AtomicBoolean.get:()Z
         7: ifeq          20
        10: aload_0
        11: getfield      #47                 // Field finished:Ljava/util/concurrent/atomic/AtomicBoolean;
        14: invokevirtual #403                // Method java/util/concurrent/atomic/AtomicBoolean.get:()Z
        17: ifeq          21
        20: return
        21: aload_1
        22: ifnull        38
        25: aload_0
        26: getfield      #16                 // Field participants:Ljava/util/Set;
        29: aload_1
        30: invokeinterface #525,  2          // InterfaceMethod java/util/Set.contains:(Ljava/lang/Object;)Z
        35: ifne          39
        38: return
        39: aload_0
        40: getfield      #29                 // Field playerTeam:Ljava/util/Map;
        43: aload_1
        44: invokeinterface #528,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        49: checkcast     #261                // class ext/mods/battlerboss/matches/BattleBossRumble$Team
        52: astore_2
        53: aload_2
        54: ifnonnull     58
        57: return
        58: aload_0
        59: getfield      #76                 // Field event:Lext/mods/battlerboss/holder/EventHolder;
        62: invokevirtual #423                // Method ext/mods/battlerboss/holder/EventHolder.getBattle:()Lext/mods/battlerboss/holder/BattleHolder;
        65: invokevirtual #531                // Method ext/mods/battlerboss/holder/BattleHolder.isStayDownOnDeath:()Z
        68: istore_3
        69: aload_0
        70: getfield      #36                 // Field aliveMembersByTeam:Ljava/util/Map;
        73: aload_2
        74: invokeinterface #528,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        79: checkcast     #95                 // class java/util/Set
        82: astore        4
        84: aload         4
        86: ifnull        98
        89: aload         4
        91: aload_1
        92: invokeinterface #534,  2          // InterfaceMethod java/util/Set.remove:(Ljava/lang/Object;)Z
        97: pop
        98: iload_3
        99: ifne          109
       102: aload_1
       103: ldc_w         #535                // String You can try to get back into the fight if you can..
       106: invokevirtual #537                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       109: aload         4
       111: ifnull        124
       114: aload         4
       116: invokeinterface #481,  1          // InterfaceMethod java/util/Set.isEmpty:()Z
       121: ifeq          238
       124: aload_0
       125: getfield      #33                 // Field aliveTeams:Ljava/util/Set;
       128: aload_2
       129: invokeinterface #534,  2          // InterfaceMethod java/util/Set.remove:(Ljava/lang/Object;)Z
       134: pop
       135: aload_0
       136: aload_0
       137: getfield      #509                // Field taskBroadcast:Ljava/util/concurrent/ScheduledFuture;
       140: invokevirtual #512                // Method cancel:(Ljava/util/concurrent/ScheduledFuture;)V
       143: new           #169                // class java/util/ArrayList
       146: dup
       147: aload_2
       148: getfield      #263                // Field ext/mods/battlerboss/matches/BattleBossRumble$Team.members:Ljava/util/List;
       151: invokespecial #171                // Method java/util/ArrayList."<init>":(Ljava/util/Collection;)V
       154: invokevirtual #232                // Method java/util/ArrayList.iterator:()Ljava/util/Iterator;
       157: astore        5
       159: aload         5
       161: invokeinterface #190,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       166: ifeq          238
       169: aload         5
       171: invokeinterface #196,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       176: checkcast     #200                // class ext/mods/gameserver/model/actor/Player
       179: astore        6
       181: aload         6
       183: ifnonnull     189
       186: goto          159
       189: aload_0
       190: aload         6
       192: iconst_1
       193: invokevirtual #328                // Method setInvulParalyze:(Lext/mods/gameserver/model/actor/Player;Z)V
       196: aload_0
       197: aload         6
       199: ldc_w         #541                // String Your team has been eliminated!
       202: bipush        10
       204: invokevirtual #340                // Method screenMsg:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;I)V
       207: aload_0
       208: aload         6
       210: iconst_0
       211: invokevirtual #543                // Method giveRewardsChecked:(Lext/mods/gameserver/model/actor/Player;Z)V
       214: aload_0
       215: aload         6
       217: invokevirtual #344                // Method applyHealAndRevive:(Lext/mods/gameserver/model/actor/Player;)V
       220: aload_0
       221: aload         6
       223: invokedynamic #546,  0            // InvokeDynamic #6:run:(Lext/mods/battlerboss/matches/BattleBossRumble;Lext/mods/gameserver/model/actor/Player;)Ljava/lang/Runnable;
       228: ldc2_w        #549                // long 10000l
       231: invokestatic  #109                // Method ext/mods/commons/pool/ThreadPool.schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
       234: pop
       235: goto          159
       238: aload_0
       239: getfield      #33                 // Field aliveTeams:Ljava/util/Set;
       242: invokeinterface #551,  1          // InterfaceMethod java/util/Set.size:()I
       247: iconst_1
       248: if_icmpne     341
       251: new           #169                // class java/util/ArrayList
       254: dup
       255: aload_0
       256: getfield      #33                 // Field aliveTeams:Ljava/util/Set;
       259: invokeinterface #487,  1          // InterfaceMethod java/util/Set.iterator:()Ljava/util/Iterator;
       264: invokeinterface #196,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       269: checkcast     #261                // class ext/mods/battlerboss/matches/BattleBossRumble$Team
       272: getfield      #263                // Field ext/mods/battlerboss/matches/BattleBossRumble$Team.members:Ljava/util/List;
       275: invokespecial #171                // Method java/util/ArrayList."<init>":(Ljava/util/Collection;)V
       278: astore        5
       280: aload         5
       282: invokeinterface #186,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
       287: astore        6
       289: aload         6
       291: invokeinterface #190,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       296: ifeq          332
       299: aload         6
       301: invokeinterface #196,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       306: checkcast     #200                // class ext/mods/gameserver/model/actor/Player
       309: astore        7
       311: aload_0
       312: aload         7
       314: ldc_w         #552                // String Congratulations! Your team won!
       317: bipush        10
       319: invokevirtual #340                // Method screenMsg:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;I)V
       322: aload_0
       323: aload         7
       325: iconst_1
       326: invokevirtual #328                // Method setInvulParalyze:(Lext/mods/gameserver/model/actor/Player;Z)V
       329: goto          289
       332: aload_0
       333: aload         5
       335: invokevirtual #467                // Method endBattleAndProceed:(Ljava/util/List;)V
       338: goto          360
       341: aload_0
       342: getfield      #33                 // Field aliveTeams:Ljava/util/Set;
       345: invokeinterface #481,  1          // InterfaceMethod java/util/Set.isEmpty:()Z
       350: ifeq          360
       353: aload_0
       354: invokestatic  #482                // Method java/util/Collections.emptyList:()Ljava/util/List;
       357: invokevirtual #467                // Method endBattleAndProceed:(Ljava/util/List;)V
       360: return
      LineNumberTable:
        line 445: 0
        line 446: 20
        line 447: 21
        line 448: 38
        line 450: 39
        line 451: 53
        line 452: 57
        line 454: 58
        line 455: 69
        line 456: 84
        line 457: 89
        line 458: 98
        line 459: 102
        line 461: 109
        line 463: 124
        line 464: 135
        line 465: 143
        line 467: 181
        line 468: 186
        line 469: 189
        line 470: 196
        line 471: 207
        line 472: 214
        line 473: 220
        line 474: 235
        line 477: 238
        line 479: 251
        line 480: 280
        line 482: 311
        line 483: 322
        line 484: 329
        line 485: 332
        line 486: 338
        line 487: 341
        line 489: 353
        line 491: 360
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          181      54     6 member   Lext/mods/gameserver/model/actor/Player;
          311      18     7     w   Lext/mods/gameserver/model/actor/Player;
          280      58     5 winners   Ljava/util/List;
            0     361     0  this   Lext/mods/battlerboss/matches/BattleBossRumble;
            0     361     1 deadPlayer   Lext/mods/gameserver/model/actor/Player;
           53     308     2  team   Lext/mods/battlerboss/matches/BattleBossRumble$Team;
           69     292     3 stayDownOnDeath   Z
           84     277     4 aliveSet   Ljava/util/Set;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
          280      58     5 winners   Ljava/util/List<Lext/mods/gameserver/model/actor/Player;>;
           84     277     4 aliveSet   Ljava/util/Set<Lext/mods/gameserver/model/actor/Player;>;
      StackMapTable: number_of_entries = 15
        frame_type = 20 /* same */
        frame_type = 0 /* same */
        frame_type = 16 /* same */
        frame_type = 0 /* same */
        frame_type = 252 /* append */
          offset_delta = 18
          locals = [ class ext/mods/battlerboss/matches/BattleBossRumble$Team ]
        frame_type = 253 /* append */
          offset_delta = 39
          locals = [ int, class java/util/Set ]
        frame_type = 10 /* same */
        frame_type = 14 /* same */
        frame_type = 252 /* append */
          offset_delta = 34
          locals = [ class java/util/Iterator ]
        frame_type = 252 /* append */
          offset_delta = 29
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 249 /* chop */
          offset_delta = 48
        frame_type = 253 /* append */
          offset_delta = 50
          locals = [ class java/util/List, class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 42
        frame_type = 250 /* chop */
          offset_delta = 8
        frame_type = 18 /* same */

  public void onPlayerDeathMonster(ext.mods.gameserver.model.actor.Player, ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Creature;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=7, locals=6, args_size=3
         0: aload_0
         1: aload_0
         2: getfield      #509                // Field taskBroadcast:Ljava/util/concurrent/ScheduledFuture;
         5: invokevirtual #512                // Method cancel:(Ljava/util/concurrent/ScheduledFuture;)V
         8: aload_0
         9: getfield      #51                 // Field battleStarted:Ljava/util/concurrent/atomic/AtomicBoolean;
        12: invokevirtual #403                // Method java/util/concurrent/atomic/AtomicBoolean.get:()Z
        15: ifeq          28
        18: aload_0
        19: getfield      #47                 // Field finished:Ljava/util/concurrent/atomic/AtomicBoolean;
        22: invokevirtual #403                // Method java/util/concurrent/atomic/AtomicBoolean.get:()Z
        25: ifeq          29
        28: return
        29: new           #169                // class java/util/ArrayList
        32: dup
        33: invokespecial #473                // Method java/util/ArrayList."<init>":()V
        36: astore_3
        37: new           #169                // class java/util/ArrayList
        40: dup
        41: aload_0
        42: getfield      #33                 // Field aliveTeams:Ljava/util/Set;
        45: invokespecial #171                // Method java/util/ArrayList."<init>":(Ljava/util/Collection;)V
        48: invokevirtual #232                // Method java/util/ArrayList.iterator:()Ljava/util/Iterator;
        51: astore        4
        53: aload         4
        55: invokeinterface #190,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        60: ifeq          90
        63: aload         4
        65: invokeinterface #196,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        70: checkcast     #261                // class ext/mods/battlerboss/matches/BattleBossRumble$Team
        73: astore        5
        75: aload_3
        76: aload         5
        78: getfield      #263                // Field ext/mods/battlerboss/matches/BattleBossRumble$Team.members:Ljava/util/List;
        81: invokeinterface #554,  2          // InterfaceMethod java/util/List.addAll:(Ljava/util/Collection;)Z
        86: pop
        87: goto          53
        90: aload_3
        91: invokeinterface #186,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
        96: astore        4
        98: aload         4
       100: invokeinterface #190,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       105: ifeq          154
       108: aload         4
       110: invokeinterface #196,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       115: checkcast     #200                // class ext/mods/gameserver/model/actor/Player
       118: astore        5
       120: aload_0
       121: aload         5
       123: ldc_w         #555                // String Congratulations! You defeated the boss!
       126: bipush        10
       128: invokevirtual #340                // Method screenMsg:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;I)V
       131: aload         5
       133: aload_0
       134: getfield      #76                 // Field event:Lext/mods/battlerboss/holder/EventHolder;
       137: invokevirtual #297                // Method ext/mods/battlerboss/holder/EventHolder.getTeleport:()Lext/mods/battlerboss/holder/TeleportHolder;
       140: invokevirtual #557                // Method ext/mods/battlerboss/holder/TeleportHolder.getReturnDelay:()I
       143: invokedynamic #560,  0            // InvokeDynamic #7:makeConcatWithConstants:(I)Ljava/lang/String;
       148: invokevirtual #537                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       151: goto          98
       154: aload_0
       155: aload_3
       156: invokedynamic #564,  0            // InvokeDynamic #8:run:(Lext/mods/battlerboss/matches/BattleBossRumble;Ljava/util/List;)Ljava/lang/Runnable;
       161: ldc2_w        #421                // long 1000l
       164: ldc2_w        #421                // long 1000l
       167: aload_0
       168: getfield      #76                 // Field event:Lext/mods/battlerboss/holder/EventHolder;
       171: invokevirtual #297                // Method ext/mods/battlerboss/holder/EventHolder.getTeleport:()Lext/mods/battlerboss/holder/TeleportHolder;
       174: invokevirtual #557                // Method ext/mods/battlerboss/holder/TeleportHolder.getReturnDelay:()I
       177: i2l
       178: lmul
       179: invokestatic  #432                // Method java/lang/Math.max:(JJ)J
       182: invokestatic  #109                // Method ext/mods/commons/pool/ThreadPool.schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
       185: pop
       186: aload_0
       187: getfield      #47                 // Field finished:Ljava/util/concurrent/atomic/AtomicBoolean;
       190: iconst_1
       191: invokevirtual #408                // Method java/util/concurrent/atomic/AtomicBoolean.set:(Z)V
       194: return
      LineNumberTable:
        line 495: 0
        line 496: 8
        line 497: 28
        line 499: 29
        line 500: 37
        line 501: 75
        line 502: 90
        line 504: 120
        line 505: 131
        line 506: 151
        line 507: 154
        line 511: 171
        line 507: 182
        line 512: 186
        line 513: 194
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           75      12     5  team   Lext/mods/battlerboss/matches/BattleBossRumble$Team;
          120      31     5     w   Lext/mods/gameserver/model/actor/Player;
            0     195     0  this   Lext/mods/battlerboss/matches/BattleBossRumble;
            0     195     1 player   Lext/mods/gameserver/model/actor/Player;
            0     195     2 monster   Lext/mods/gameserver/model/actor/Creature;
           37     158     3 winners   Ljava/util/List;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
           37     158     3 winners   Ljava/util/List<Lext/mods/gameserver/model/actor/Player;>;
      StackMapTable: number_of_entries = 6
        frame_type = 28 /* same */
        frame_type = 0 /* same */
        frame_type = 253 /* append */
          offset_delta = 23
          locals = [ class java/util/List, class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 36
        frame_type = 252 /* append */
          offset_delta = 7
          locals = [ class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 55

  public void removePlayer(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=4, args_size=2
         0: aload_1
         1: ifnonnull     5
         4: return
         5: aload_0
         6: getfield      #16                 // Field participants:Ljava/util/Set;
         9: aload_1
        10: invokeinterface #534,  2          // InterfaceMethod java/util/Set.remove:(Ljava/lang/Object;)Z
        15: pop
        16: aload_0
        17: getfield      #29                 // Field playerTeam:Ljava/util/Map;
        20: aload_1
        21: invokeinterface #565,  2          // InterfaceMethod java/util/Map.remove:(Ljava/lang/Object;)Ljava/lang/Object;
        26: checkcast     #261                // class ext/mods/battlerboss/matches/BattleBossRumble$Team
        29: astore_2
        30: aload_2
        31: ifnull        84
        34: aload_0
        35: getfield      #36                 // Field aliveMembersByTeam:Ljava/util/Map;
        38: aload_2
        39: invokeinterface #528,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        44: checkcast     #95                 // class java/util/Set
        47: astore_3
        48: aload_3
        49: ifnull        60
        52: aload_3
        53: aload_1
        54: invokeinterface #534,  2          // InterfaceMethod java/util/Set.remove:(Ljava/lang/Object;)Z
        59: pop
        60: aload_3
        61: ifnull        73
        64: aload_3
        65: invokeinterface #481,  1          // InterfaceMethod java/util/Set.isEmpty:()Z
        70: ifeq          84
        73: aload_0
        74: getfield      #33                 // Field aliveTeams:Ljava/util/Set;
        77: aload_2
        78: invokeinterface #534,  2          // InterfaceMethod java/util/Set.remove:(Ljava/lang/Object;)Z
        83: pop
        84: return
      LineNumberTable:
        line 517: 0
        line 518: 4
        line 519: 5
        line 520: 16
        line 521: 30
        line 523: 34
        line 524: 48
        line 525: 52
        line 526: 60
        line 527: 73
        line 529: 84
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           48      36     3 alive   Ljava/util/Set;
            0      85     0  this   Lext/mods/battlerboss/matches/BattleBossRumble;
            0      85     1 player   Lext/mods/gameserver/model/actor/Player;
           30      55     2  team   Lext/mods/battlerboss/matches/BattleBossRumble$Team;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
           48      36     3 alive   Ljava/util/Set<Lext/mods/gameserver/model/actor/Player;>;
      StackMapTable: number_of_entries = 4
        frame_type = 5 /* same */
        frame_type = 253 /* append */
          offset_delta = 54
          locals = [ class ext/mods/battlerboss/matches/BattleBossRumble$Team, class java/util/Set ]
        frame_type = 12 /* same */
        frame_type = 250 /* chop */
          offset_delta = 10

  public void forceFinish();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #47                 // Field finished:Ljava/util/concurrent/atomic/AtomicBoolean;
         4: invokevirtual #403                // Method java/util/concurrent/atomic/AtomicBoolean.get:()Z
         7: ifeq          11
        10: return
        11: aload_0
        12: invokestatic  #482                // Method java/util/Collections.emptyList:()Ljava/util/List;
        15: invokevirtual #467                // Method endBattleAndProceed:(Ljava/util/List;)V
        18: return
      LineNumberTable:
        line 533: 0
        line 534: 10
        line 535: 11
        line 536: 18
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      19     0  this   Lext/mods/battlerboss/matches/BattleBossRumble;
      StackMapTable: number_of_entries = 1
        frame_type = 11 /* same */

  public void surrenderTeam(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=2
         0: aload_0
         1: getfield      #29                 // Field playerTeam:Ljava/util/Map;
         4: aload_1
         5: invokeinterface #528,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        10: checkcast     #261                // class ext/mods/battlerboss/matches/BattleBossRumble$Team
        13: astore_2
        14: aload_2
        15: ifnonnull     19
        18: return
        19: getstatic     #760                // Field java/lang/Boolean.TRUE:Ljava/lang/Boolean;
        22: aload_0
        23: getfield      #66                 // Field teamOfflineFlag:Ljava/util/Map;
        26: aload_2
        27: invokeinterface #528,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        32: invokevirtual #766                // Method java/lang/Boolean.equals:(Ljava/lang/Object;)Z
        35: ifeq          57
        38: aload_1
        39: invokevirtual #769                // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
        42: invokedynamic #772,  0            // InvokeDynamic #12:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
        47: invokestatic  #775                // Method ext/mods/gameserver/model/World.announceToOnlinePlayers:(Ljava/lang/String;)V
        50: aload_0
        51: invokestatic  #482                // Method java/util/Collections.emptyList:()Ljava/util/List;
        54: invokevirtual #467                // Method endBattleAndProceed:(Ljava/util/List;)V
        57: return
      LineNumberTable:
        line 765: 0
        line 766: 14
        line 767: 18
        line 768: 19
        line 770: 38
        line 771: 50
        line 773: 57
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      58     0  this   Lext/mods/battlerboss/matches/BattleBossRumble;
            0      58     1 player   Lext/mods/gameserver/model/actor/Player;
           14      44     2  team   Lext/mods/battlerboss/matches/BattleBossRumble$Team;
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 19
          locals = [ class ext/mods/battlerboss/matches/BattleBossRumble$Team ]
        frame_type = 37 /* same */

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: ldc           #17                 // class ext/mods/battlerboss/matches/BattleBossRumble
         2: invokevirtual #885                // Method java/lang/Class.getName:()Ljava/lang/String;
         5: invokestatic  #888                // Method java/util/logging/Logger.getLogger:(Ljava/lang/String;)Ljava/util/logging/Logger;
         8: putstatic     #121                // Field LOGGER:Ljava/util/logging/Logger;
        11: return
      LineNumberTable:
        line 60: 0
}
SourceFile: "BattleBossRumble.java"
NestMembers:
  ext/mods/battlerboss/matches/BattleBossRumble$Team
  ext/mods/battlerboss/matches/BattleBossRumble$Phase
BootstrapMethods:
  0: #1101 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1047 ()V
      #1048 REF_invokeVirtual ext/mods/battlerboss/matches/BattleBossRumble.startBattleSafe:()V
      #1047 ()V
  1: #1101 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1049 (Ljava/lang/Object;)Ljava/lang/Object;
      #1050 REF_invokeStatic ext/mods/battlerboss/matches/BattleBossRumble.lambda$makeTeams$0:(Lext/mods/gameserver/model/group/Party;)Ljava/util/List;
      #1053 (Lext/mods/gameserver/model/group/Party;)Ljava/util/List;
  2: #1101 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1049 (Ljava/lang/Object;)Ljava/lang/Object;
      #1054 REF_invokeStatic ext/mods/battlerboss/matches/BattleBossRumble.lambda$makeTeams$1:(Lext/mods/gameserver/model/pledge/Clan;)Ljava/util/List;
      #1057 (Lext/mods/gameserver/model/pledge/Clan;)Ljava/util/List;
  3: #1101 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1058 (Ljava/lang/Object;)Z
      #1059 REF_invokeStatic ext/mods/battlerboss/matches/BattleBossRumble.lambda$addTeam$0:(Lext/mods/gameserver/model/actor/Player;)Z
      #1062 (Lext/mods/gameserver/model/actor/Player;)Z
  4: #1101 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1047 ()V
      #1063 REF_invokeVirtual ext/mods/battlerboss/matches/BattleBossRumble.onBattleTimeOver:()V
      #1047 ()V
  5: #1101 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1047 ()V
      #1066 REF_invokeVirtual ext/mods/battlerboss/matches/BattleBossRumble.lambda$endBattleAndProceed$0:(Ljava/util/List;)V
      #1047 ()V
  6: #1101 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1047 ()V
      #1069 REF_invokeVirtual ext/mods/battlerboss/matches/BattleBossRumble.lambda$onPlayerDeath$0:(Lext/mods/gameserver/model/actor/Player;)V
      #1047 ()V
  7: #1108 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1072 Teleport em \u0001 segundos.
  8: #1101 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1047 ()V
      #1074 REF_invokeVirtual ext/mods/battlerboss/matches/BattleBossRumble.lambda$onPlayerDeathMonster$0:(Ljava/util/List;)V
      #1047 ()V
  9: #1108 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1077 [Battle Boss] NPC Template não encontrado para ID: \u0001
  10: #1101 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1047 ()V
      #1079 REF_invokeStatic ext/mods/battlerboss/matches/BattleBossRumble.lambda$spawnMonsterChallenge$0:(Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Player;)V
      #1047 ()V
  11: #1101 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1047 ()V
      #1082 REF_invokeVirtual ext/mods/battlerboss/matches/BattleBossRumble.lambda$spawnMonsterChallenge$1:(Ljava/util/List;)V
      #1047 ()V
  12: #1108 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1085 [BattleBoss] O time de \u0001 desistiu da batalha.
  13: #1108 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1087 \u0001 \u0001
  14: #1101 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1047 ()V
      #1089 REF_invokeVirtual ext/mods/battlerboss/matches/BattleBossRumble.broadcastTimer:()V
      #1047 ()V
  15: #1101 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1047 ()V
      #1092 REF_invokeVirtual ext/mods/battlerboss/matches/BattleBossRumble.lambda$startDisconnectionWatcher$0:()V
      #1047 ()V
  16: #1101 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1047 ()V
      #1095 REF_invokeVirtual ext/mods/battlerboss/matches/BattleBossRumble.lambda$spawnMonsterChallenge$2:(Ljava/util/List;)V
      #1047 ()V
  17: #1101 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1047 ()V
      #1098 REF_invokeVirtual ext/mods/battlerboss/matches/BattleBossRumble.lambda$spawnMonsterChallenge$3:(Ljava/util/List;)V
      #1047 ()V
InnerClasses:
  public static final #1117= #802 of #799; // SMPOS=class ext/mods/gameserver/network/serverpackets/ExShowScreenMessage$SMPOS of class ext/mods/gameserver/network/serverpackets/ExShowScreenMessage
  public static final #1122= #1118 of #1120; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
