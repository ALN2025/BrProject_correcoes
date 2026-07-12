// Bytecode for: ext.mods.gameserver.model.entity.events.teamvsteam.TvTAntiAFK
// File: ext\mods\gameserver\model\entity\events\teamvsteam\TvTAntiAFK.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/entity/events/teamvsteam/TvTAntiAFK.class
  Last modified 9 de jul de 2026; size 6289 bytes
  MD5 checksum 66f1db269052e732e53a067de0c395ef
  Compiled from "TvTAntiAFK.java"
public class ext.mods.gameserver.model.entity.events.teamvsteam.TvTAntiAFK
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #11                         // ext/mods/gameserver/model/entity/events/teamvsteam/TvTAntiAFK
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 1, methods: 10, attributes: 4
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
   #10 = Fieldref           #11.#12       // ext/mods/gameserver/model/entity/events/teamvsteam/TvTAntiAFK._player:Ljava/util/concurrent/ConcurrentHashMap;
   #11 = Class              #13           // ext/mods/gameserver/model/entity/events/teamvsteam/TvTAntiAFK
   #12 = NameAndType        #14:#15       // _player:Ljava/util/concurrent/ConcurrentHashMap;
   #13 = Utf8               ext/mods/gameserver/model/entity/events/teamvsteam/TvTAntiAFK
   #14 = Utf8               _player
   #15 = Utf8               Ljava/util/concurrent/ConcurrentHashMap;
   #16 = InvokeDynamic      #0:#17        // #0:run:(Lext/mods/gameserver/model/entity/events/teamvsteam/TvTAntiAFK;)Ljava/lang/Runnable;
   #17 = NameAndType        #18:#19       // run:(Lext/mods/gameserver/model/entity/events/teamvsteam/TvTAntiAFK;)Ljava/lang/Runnable;
   #18 = Utf8               run
   #19 = Utf8               (Lext/mods/gameserver/model/entity/events/teamvsteam/TvTAntiAFK;)Ljava/lang/Runnable;
   #20 = Long               20000l
   #22 = Methodref          #23.#24       // ext/mods/commons/pool/ThreadPool.scheduleAtFixedRate:(Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
   #23 = Class              #25           // ext/mods/commons/pool/ThreadPool
   #24 = NameAndType        #26:#27       // scheduleAtFixedRate:(Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
   #25 = Utf8               ext/mods/commons/pool/ThreadPool
   #26 = Utf8               scheduleAtFixedRate
   #27 = Utf8               (Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
   #28 = Methodref          #29.#30       // ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.getInstance:()Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent;
   #29 = Class              #31           // ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent
   #30 = NameAndType        #32:#33       // getInstance:()Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent;
   #31 = Utf8               ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent
   #32 = Utf8               getInstance
   #33 = Utf8               ()Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent;
   #34 = Methodref          #29.#35       // ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.isStarted:()Z
   #35 = NameAndType        #36:#37       // isStarted:()Z
   #36 = Utf8               isStarted
   #37 = Utf8               ()Z
   #38 = Fieldref           #29.#39       // ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent._teams:[Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam;
   #39 = NameAndType        #40:#41       // _teams:[Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam;
   #40 = Utf8               _teams
   #41 = Utf8               [Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam;
   #42 = Methodref          #43.#44       // java/util/Arrays.stream:([Ljava/lang/Object;)Ljava/util/stream/Stream;
   #43 = Class              #45           // java/util/Arrays
   #44 = NameAndType        #46:#47       // stream:([Ljava/lang/Object;)Ljava/util/stream/Stream;
   #45 = Utf8               java/util/Arrays
   #46 = Utf8               stream
   #47 = Utf8               ([Ljava/lang/Object;)Ljava/util/stream/Stream;
   #48 = InvokeDynamic      #1:#49        // #1:apply:()Ljava/util/function/Function;
   #49 = NameAndType        #50:#51       // apply:()Ljava/util/function/Function;
   #50 = Utf8               apply
   #51 = Utf8               ()Ljava/util/function/Function;
   #52 = InterfaceMethodref #53.#54       // java/util/stream/Stream.flatMap:(Ljava/util/function/Function;)Ljava/util/stream/Stream;
   #53 = Class              #55           // java/util/stream/Stream
   #54 = NameAndType        #56:#57       // flatMap:(Ljava/util/function/Function;)Ljava/util/stream/Stream;
   #55 = Utf8               java/util/stream/Stream
   #56 = Utf8               flatMap
   #57 = Utf8               (Ljava/util/function/Function;)Ljava/util/stream/Stream;
   #58 = InvokeDynamic      #2:#59        // #2:test:()Ljava/util/function/Predicate;
   #59 = NameAndType        #60:#61       // test:()Ljava/util/function/Predicate;
   #60 = Utf8               test
   #61 = Utf8               ()Ljava/util/function/Predicate;
   #62 = InterfaceMethodref #53.#63       // java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
   #63 = NameAndType        #64:#65       // filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
   #64 = Utf8               filter
   #65 = Utf8               (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
   #66 = InvokeDynamic      #3:#67        // #3:accept:(Lext/mods/gameserver/model/entity/events/teamvsteam/TvTAntiAFK;)Ljava/util/function/Consumer;
   #67 = NameAndType        #68:#69       // accept:(Lext/mods/gameserver/model/entity/events/teamvsteam/TvTAntiAFK;)Ljava/util/function/Consumer;
   #68 = Utf8               accept
   #69 = Utf8               (Lext/mods/gameserver/model/entity/events/teamvsteam/TvTAntiAFK;)Ljava/util/function/Consumer;
   #70 = InterfaceMethodref #53.#71       // java/util/stream/Stream.forEach:(Ljava/util/function/Consumer;)V
   #71 = NameAndType        #72:#73       // forEach:(Ljava/util/function/Consumer;)V
   #72 = Utf8               forEach
   #73 = Utf8               (Ljava/util/function/Consumer;)V
   #74 = Methodref          #7.#75        // java/util/concurrent/ConcurrentHashMap.clear:()V
   #75 = NameAndType        #76:#6        // clear:()V
   #76 = Utf8               clear
   #77 = InvokeDynamic      #4:#78        // #4:apply:(Lext/mods/gameserver/model/entity/events/teamvsteam/TvTAntiAFK;IIILext/mods/gameserver/model/actor/Player;)Ljava/util/function/BiFunction;
   #78 = NameAndType        #50:#79       // apply:(Lext/mods/gameserver/model/entity/events/teamvsteam/TvTAntiAFK;IIILext/mods/gameserver/model/actor/Player;)Ljava/util/function/BiFunction;
   #79 = Utf8               (Lext/mods/gameserver/model/entity/events/teamvsteam/TvTAntiAFK;IIILext/mods/gameserver/model/actor/Player;)Ljava/util/function/BiFunction;
   #80 = Methodref          #7.#81        // java/util/concurrent/ConcurrentHashMap.compute:(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;
   #81 = NameAndType        #82:#83       // compute:(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;
   #82 = Utf8               compute
   #83 = Utf8               (Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;
   #84 = Class              #85           // ext/mods/gameserver/network/serverpackets/ExShowScreenMessage
   #85 = Utf8               ext/mods/gameserver/network/serverpackets/ExShowScreenMessage
   #86 = String             #87           // You\'re kicked out of the TvT by staying afk!
   #87 = Utf8               You\'re kicked out of the TvT by staying afk!
   #88 = Methodref          #84.#89       // ext/mods/gameserver/network/serverpackets/ExShowScreenMessage."<init>":(Ljava/lang/String;I)V
   #89 = NameAndType        #5:#90        // "<init>":(Ljava/lang/String;I)V
   #90 = Utf8               (Ljava/lang/String;I)V
   #91 = Methodref          #92.#93       // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #92 = Class              #94           // ext/mods/gameserver/model/actor/Player
   #93 = NameAndType        #95:#96       // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #94 = Utf8               ext/mods/gameserver/model/actor/Player
   #95 = Utf8               sendPacket
   #96 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #97 = Fieldref           #98.#99       // ext/mods/gameserver/model/entity/events/teamvsteam/TvTAntiAFK$SingletonHolder.INSTANCE:Lext/mods/gameserver/model/entity/events/teamvsteam/TvTAntiAFK;
   #98 = Class              #100          // ext/mods/gameserver/model/entity/events/teamvsteam/TvTAntiAFK$SingletonHolder
   #99 = NameAndType        #101:#102     // INSTANCE:Lext/mods/gameserver/model/entity/events/teamvsteam/TvTAntiAFK;
  #100 = Utf8               ext/mods/gameserver/model/entity/events/teamvsteam/TvTAntiAFK$SingletonHolder
  #101 = Utf8               INSTANCE
  #102 = Utf8               Lext/mods/gameserver/model/entity/events/teamvsteam/TvTAntiAFK;
  #103 = Class              #104          // ext/mods/gameserver/model/entity/events/teamvsteam/TvTAntiAFK$PlayerInfo
  #104 = Utf8               ext/mods/gameserver/model/entity/events/teamvsteam/TvTAntiAFK$PlayerInfo
  #105 = Methodref          #103.#106     // ext/mods/gameserver/model/entity/events/teamvsteam/TvTAntiAFK$PlayerInfo."<init>":(IIII)V
  #106 = NameAndType        #5:#107       // "<init>":(IIII)V
  #107 = Utf8               (IIII)V
  #108 = Methodref          #103.#109     // ext/mods/gameserver/model/entity/events/teamvsteam/TvTAntiAFK$PlayerInfo.isSameLocation:(III)Z
  #109 = NameAndType        #110:#111     // isSameLocation:(III)Z
  #110 = Utf8               isSameLocation
  #111 = Utf8               (III)Z
  #112 = Methodref          #92.#113      // ext/mods/gameserver/model/actor/Player.getAttack:()Lext/mods/gameserver/model/actor/attack/PlayerAttack;
  #113 = NameAndType        #114:#115     // getAttack:()Lext/mods/gameserver/model/actor/attack/PlayerAttack;
  #114 = Utf8               getAttack
  #115 = Utf8               ()Lext/mods/gameserver/model/actor/attack/PlayerAttack;
  #116 = Methodref          #117.#118     // ext/mods/gameserver/model/actor/attack/PlayerAttack.isAttackingNow:()Z
  #117 = Class              #119          // ext/mods/gameserver/model/actor/attack/PlayerAttack
  #118 = NameAndType        #120:#37      // isAttackingNow:()Z
  #119 = Utf8               ext/mods/gameserver/model/actor/attack/PlayerAttack
  #120 = Utf8               isAttackingNow
  #121 = Methodref          #92.#122      // ext/mods/gameserver/model/actor/Player.getCast:()Lext/mods/gameserver/model/actor/cast/PlayerCast;
  #122 = NameAndType        #123:#124     // getCast:()Lext/mods/gameserver/model/actor/cast/PlayerCast;
  #123 = Utf8               getCast
  #124 = Utf8               ()Lext/mods/gameserver/model/actor/cast/PlayerCast;
  #125 = Methodref          #126.#127     // ext/mods/gameserver/model/actor/cast/PlayerCast.isCastingNow:()Z
  #126 = Class              #128          // ext/mods/gameserver/model/actor/cast/PlayerCast
  #127 = NameAndType        #129:#37      // isCastingNow:()Z
  #128 = Utf8               ext/mods/gameserver/model/actor/cast/PlayerCast
  #129 = Utf8               isCastingNow
  #130 = Methodref          #103.#131     // ext/mods/gameserver/model/entity/events/teamvsteam/TvTAntiAFK$PlayerInfo.incrementAndGetSameLoc:()I
  #131 = NameAndType        #132:#133     // incrementAndGetSameLoc:()I
  #132 = Utf8               incrementAndGetSameLoc
  #133 = Utf8               ()I
  #134 = Methodref          #29.#135      // ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.onLogout:(Lext/mods/gameserver/model/actor/Player;)V
  #135 = NameAndType        #136:#137     // onLogout:(Lext/mods/gameserver/model/actor/Player;)V
  #136 = Utf8               onLogout
  #137 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
  #138 = Methodref          #11.#139      // ext/mods/gameserver/model/entity/events/teamvsteam/TvTAntiAFK.kickedMsg:(Lext/mods/gameserver/model/actor/Player;)V
  #139 = NameAndType        #140:#137     // kickedMsg:(Lext/mods/gameserver/model/actor/Player;)V
  #140 = Utf8               kickedMsg
  #141 = Methodref          #92.#142      // ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
  #142 = NameAndType        #143:#144     // getName:()Ljava/lang/String;
  #143 = Utf8               getName
  #144 = Utf8               ()Ljava/lang/String;
  #145 = Methodref          #92.#146      // ext/mods/gameserver/model/actor/Player.getX:()I
  #146 = NameAndType        #147:#133     // getX:()I
  #147 = Utf8               getX
  #148 = Methodref          #92.#149      // ext/mods/gameserver/model/actor/Player.getY:()I
  #149 = NameAndType        #150:#133     // getY:()I
  #150 = Utf8               getY
  #151 = Methodref          #92.#152      // ext/mods/gameserver/model/actor/Player.getZ:()I
  #152 = NameAndType        #153:#133     // getZ:()I
  #153 = Utf8               getZ
  #154 = Methodref          #11.#155      // ext/mods/gameserver/model/entity/events/teamvsteam/TvTAntiAFK.addTvTSpawnInfo:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;III)V
  #155 = NameAndType        #156:#157     // addTvTSpawnInfo:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;III)V
  #156 = Utf8               addTvTSpawnInfo
  #157 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;III)V
  #158 = Methodref          #92.#159      // ext/mods/gameserver/model/actor/Player.isOnline:()Z
  #159 = NameAndType        #160:#37      // isOnline:()Z
  #160 = Utf8               isOnline
  #161 = Methodref          #92.#162      // ext/mods/gameserver/model/actor/Player.isDead:()Z
  #162 = NameAndType        #163:#37      // isDead:()Z
  #163 = Utf8               isDead
  #164 = Methodref          #92.#165      // ext/mods/gameserver/model/actor/Player.isImmobilized:()Z
  #165 = NameAndType        #166:#37      // isImmobilized:()Z
  #166 = Utf8               isImmobilized
  #167 = Methodref          #92.#168      // ext/mods/gameserver/model/actor/Player.isParalyzed:()Z
  #168 = NameAndType        #169:#37      // isParalyzed:()Z
  #169 = Utf8               isParalyzed
  #170 = Methodref          #171.#172     // ext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam.getParticipatedPlayers:()Ljava/util/Map;
  #171 = Class              #173          // ext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam
  #172 = NameAndType        #174:#175     // getParticipatedPlayers:()Ljava/util/Map;
  #173 = Utf8               ext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam
  #174 = Utf8               getParticipatedPlayers
  #175 = Utf8               ()Ljava/util/Map;
  #176 = InterfaceMethodref #177.#178     // java/util/Map.values:()Ljava/util/Collection;
  #177 = Class              #179          // java/util/Map
  #178 = NameAndType        #180:#181     // values:()Ljava/util/Collection;
  #179 = Utf8               java/util/Map
  #180 = Utf8               values
  #181 = Utf8               ()Ljava/util/Collection;
  #182 = InterfaceMethodref #183.#184     // java/util/Collection.stream:()Ljava/util/stream/Stream;
  #183 = Class              #185          // java/util/Collection
  #184 = NameAndType        #46:#186      // stream:()Ljava/util/stream/Stream;
  #185 = Utf8               java/util/Collection
  #186 = Utf8               ()Ljava/util/stream/Stream;
  #187 = Methodref          #11.#188      // ext/mods/gameserver/model/entity/events/teamvsteam/TvTAntiAFK.checkPlayers:()V
  #188 = NameAndType        #189:#6       // checkPlayers:()V
  #189 = Utf8               checkPlayers
  #190 = Utf8               Signature
  #191 = Utf8               Ljava/util/concurrent/ConcurrentHashMap<Ljava/lang/String;Lext/mods/gameserver/model/entity/events/teamvsteam/TvTAntiAFK$PlayerInfo;>;
  #192 = Utf8               Code
  #193 = Utf8               LineNumberTable
  #194 = Utf8               LocalVariableTable
  #195 = Utf8               this
  #196 = Utf8               StackMapTable
  #197 = Utf8               player
  #198 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #199 = Utf8               name
  #200 = Utf8               Ljava/lang/String;
  #201 = Utf8               x
  #202 = Utf8               I
  #203 = Utf8               y
  #204 = Utf8               z
  #205 = Utf8               ()Lext/mods/gameserver/model/entity/events/teamvsteam/TvTAntiAFK;
  #206 = Utf8               lambda$addTvTSpawnInfo$0
  #207 = Utf8               (IIILext/mods/gameserver/model/actor/Player;Ljava/lang/String;Lext/mods/gameserver/model/entity/events/teamvsteam/TvTAntiAFK$PlayerInfo;)Lext/mods/gameserver/model/entity/events/teamvsteam/TvTAntiAFK$PlayerInfo;
  #208 = Utf8               key
  #209 = Utf8               playerInfo
  #210 = Utf8               Lext/mods/gameserver/model/entity/events/teamvsteam/TvTAntiAFK$PlayerInfo;
  #211 = Utf8               lambda$checkPlayers$2
  #212 = Utf8               lambda$checkPlayers$1
  #213 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Z
  #214 = Utf8               lambda$checkPlayers$0
  #215 = Utf8               (Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam;)Ljava/util/stream/Stream;
  #216 = Utf8               team
  #217 = Utf8               Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam;
  #218 = Utf8               lambda$new$0
  #219 = Utf8               SourceFile
  #220 = Utf8               TvTAntiAFK.java
  #221 = Utf8               NestMembers
  #222 = Utf8               BootstrapMethods
  #223 = MethodType         #6            //  ()V
  #224 = MethodHandle       5:#225        // REF_invokeVirtual ext/mods/gameserver/model/entity/events/teamvsteam/TvTAntiAFK.lambda$new$0:()V
  #225 = Methodref          #11.#226      // ext/mods/gameserver/model/entity/events/teamvsteam/TvTAntiAFK.lambda$new$0:()V
  #226 = NameAndType        #218:#6       // lambda$new$0:()V
  #227 = MethodType         #228          //  (Ljava/lang/Object;)Ljava/lang/Object;
  #228 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
  #229 = MethodHandle       6:#230        // REF_invokeStatic ext/mods/gameserver/model/entity/events/teamvsteam/TvTAntiAFK.lambda$checkPlayers$0:(Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam;)Ljava/util/stream/Stream;
  #230 = Methodref          #11.#231      // ext/mods/gameserver/model/entity/events/teamvsteam/TvTAntiAFK.lambda$checkPlayers$0:(Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam;)Ljava/util/stream/Stream;
  #231 = NameAndType        #214:#215     // lambda$checkPlayers$0:(Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam;)Ljava/util/stream/Stream;
  #232 = MethodType         #215          //  (Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam;)Ljava/util/stream/Stream;
  #233 = MethodType         #234          //  (Ljava/lang/Object;)Z
  #234 = Utf8               (Ljava/lang/Object;)Z
  #235 = MethodHandle       6:#236        // REF_invokeStatic ext/mods/gameserver/model/entity/events/teamvsteam/TvTAntiAFK.lambda$checkPlayers$1:(Lext/mods/gameserver/model/actor/Player;)Z
  #236 = Methodref          #11.#237      // ext/mods/gameserver/model/entity/events/teamvsteam/TvTAntiAFK.lambda$checkPlayers$1:(Lext/mods/gameserver/model/actor/Player;)Z
  #237 = NameAndType        #212:#213     // lambda$checkPlayers$1:(Lext/mods/gameserver/model/actor/Player;)Z
  #238 = MethodType         #213          //  (Lext/mods/gameserver/model/actor/Player;)Z
  #239 = MethodType         #240          //  (Ljava/lang/Object;)V
  #240 = Utf8               (Ljava/lang/Object;)V
  #241 = MethodHandle       5:#242        // REF_invokeVirtual ext/mods/gameserver/model/entity/events/teamvsteam/TvTAntiAFK.lambda$checkPlayers$2:(Lext/mods/gameserver/model/actor/Player;)V
  #242 = Methodref          #11.#243      // ext/mods/gameserver/model/entity/events/teamvsteam/TvTAntiAFK.lambda$checkPlayers$2:(Lext/mods/gameserver/model/actor/Player;)V
  #243 = NameAndType        #211:#137     // lambda$checkPlayers$2:(Lext/mods/gameserver/model/actor/Player;)V
  #244 = MethodType         #137          //  (Lext/mods/gameserver/model/actor/Player;)V
  #245 = MethodType         #246          //  (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #246 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #247 = MethodHandle       5:#248        // REF_invokeVirtual ext/mods/gameserver/model/entity/events/teamvsteam/TvTAntiAFK.lambda$addTvTSpawnInfo$0:(IIILext/mods/gameserver/model/actor/Player;Ljava/lang/String;Lext/mods/gameserver/model/entity/events/teamvsteam/TvTAntiAFK$PlayerInfo;)Lext/mods/gameserver/model/entity/events/teamvsteam/TvTAntiAFK$PlayerInfo;
  #248 = Methodref          #11.#249      // ext/mods/gameserver/model/entity/events/teamvsteam/TvTAntiAFK.lambda$addTvTSpawnInfo$0:(IIILext/mods/gameserver/model/actor/Player;Ljava/lang/String;Lext/mods/gameserver/model/entity/events/teamvsteam/TvTAntiAFK$PlayerInfo;)Lext/mods/gameserver/model/entity/events/teamvsteam/TvTAntiAFK$PlayerInfo;
  #249 = NameAndType        #206:#207     // lambda$addTvTSpawnInfo$0:(IIILext/mods/gameserver/model/actor/Player;Ljava/lang/String;Lext/mods/gameserver/model/entity/events/teamvsteam/TvTAntiAFK$PlayerInfo;)Lext/mods/gameserver/model/entity/events/teamvsteam/TvTAntiAFK$PlayerInfo;
  #250 = MethodType         #251          //  (Ljava/lang/String;Lext/mods/gameserver/model/entity/events/teamvsteam/TvTAntiAFK$PlayerInfo;)Lext/mods/gameserver/model/entity/events/teamvsteam/TvTAntiAFK$PlayerInfo;
  #251 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/entity/events/teamvsteam/TvTAntiAFK$PlayerInfo;)Lext/mods/gameserver/model/entity/events/teamvsteam/TvTAntiAFK$PlayerInfo;
  #252 = MethodHandle       6:#253        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #253 = Methodref          #254.#255     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #254 = Class              #256          // java/lang/invoke/LambdaMetafactory
  #255 = NameAndType        #257:#258     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #256 = Utf8               java/lang/invoke/LambdaMetafactory
  #257 = Utf8               metafactory
  #258 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #259 = Utf8               InnerClasses
  #260 = Utf8               SingletonHolder
  #261 = Utf8               PlayerInfo
  #262 = Class              #263          // java/lang/invoke/MethodHandles$Lookup
  #263 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #264 = Class              #265          // java/lang/invoke/MethodHandles
  #265 = Utf8               java/lang/invoke/MethodHandles
  #266 = Utf8               Lookup
{
  public static final ext.mods.gameserver.model.entity.events.teamvsteam.TvTAntiAFK getInstance();
    descriptor: ()Lext/mods/gameserver/model/entity/events/teamvsteam/TvTAntiAFK;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #97                 // Field ext/mods/gameserver/model/entity/events/teamvsteam/TvTAntiAFK$SingletonHolder.INSTANCE:Lext/mods/gameserver/model/entity/events/teamvsteam/TvTAntiAFK;
         3: areturn
      LineNumberTable:
        line 99: 0
}
SourceFile: "TvTAntiAFK.java"
NestMembers:
  ext/mods/gameserver/model/entity/events/teamvsteam/TvTAntiAFK$SingletonHolder
  ext/mods/gameserver/model/entity/events/teamvsteam/TvTAntiAFK$PlayerInfo
BootstrapMethods:
  0: #252 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #223 ()V
      #224 REF_invokeVirtual ext/mods/gameserver/model/entity/events/teamvsteam/TvTAntiAFK.lambda$new$0:()V
      #223 ()V
  1: #252 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #227 (Ljava/lang/Object;)Ljava/lang/Object;
      #229 REF_invokeStatic ext/mods/gameserver/model/entity/events/teamvsteam/TvTAntiAFK.lambda$checkPlayers$0:(Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam;)Ljava/util/stream/Stream;
      #232 (Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam;)Ljava/util/stream/Stream;
  2: #252 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #233 (Ljava/lang/Object;)Z
      #235 REF_invokeStatic ext/mods/gameserver/model/entity/events/teamvsteam/TvTAntiAFK.lambda$checkPlayers$1:(Lext/mods/gameserver/model/actor/Player;)Z
      #238 (Lext/mods/gameserver/model/actor/Player;)Z
  3: #252 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #239 (Ljava/lang/Object;)V
      #241 REF_invokeVirtual ext/mods/gameserver/model/entity/events/teamvsteam/TvTAntiAFK.lambda$checkPlayers$2:(Lext/mods/gameserver/model/actor/Player;)V
      #244 (Lext/mods/gameserver/model/actor/Player;)V
  4: #252 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #245 (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      #247 REF_invokeVirtual ext/mods/gameserver/model/entity/events/teamvsteam/TvTAntiAFK.lambda$addTvTSpawnInfo$0:(IIILext/mods/gameserver/model/actor/Player;Ljava/lang/String;Lext/mods/gameserver/model/entity/events/teamvsteam/TvTAntiAFK$PlayerInfo;)Lext/mods/gameserver/model/entity/events/teamvsteam/TvTAntiAFK$PlayerInfo;
      #250 (Ljava/lang/String;Lext/mods/gameserver/model/entity/events/teamvsteam/TvTAntiAFK$PlayerInfo;)Lext/mods/gameserver/model/entity/events/teamvsteam/TvTAntiAFK$PlayerInfo;
InnerClasses:
  public static final #266= #262 of #264; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
