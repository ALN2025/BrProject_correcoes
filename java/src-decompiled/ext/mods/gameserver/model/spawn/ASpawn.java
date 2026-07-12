// Bytecode for: ext.mods.gameserver.model.spawn.ASpawn
// File: ext\mods\gameserver\model\spawn\ASpawn.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/spawn/ASpawn.class
  Last modified 9 de jul de 2026; size 13353 bytes
  MD5 checksum 5f625b8d3e9b8599e4f12bf2b10b4fb0
  Compiled from "ASpawn.java"
public abstract class ext.mods.gameserver.model.spawn.ASpawn
  minor version: 0
  major version: 69
  flags: (0x0421) ACC_PUBLIC, ACC_SUPER, ACC_ABSTRACT
  this_class: #14                         // ext/mods/gameserver/model/spawn/ASpawn
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 10, methods: 40, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Methodref          #8.#9         // java/util/Collections.emptyList:()Ljava/util/List;
    #8 = Class              #10           // java/util/Collections
    #9 = NameAndType        #11:#12       // emptyList:()Ljava/util/List;
   #10 = Utf8               java/util/Collections
   #11 = Utf8               emptyList
   #12 = Utf8               ()Ljava/util/List;
   #13 = Fieldref           #14.#15       // ext/mods/gameserver/model/spawn/ASpawn._privateData:Ljava/util/List;
   #14 = Class              #16           // ext/mods/gameserver/model/spawn/ASpawn
   #15 = NameAndType        #17:#18       // _privateData:Ljava/util/List;
   #16 = Utf8               ext/mods/gameserver/model/spawn/ASpawn
   #17 = Utf8               _privateData
   #18 = Utf8               Ljava/util/List;
   #19 = Fieldref           #20.#21       // ext/mods/gameserver/model/memo/SpawnMemo.DUMMY_SET:Lext/mods/gameserver/model/memo/SpawnMemo;
   #20 = Class              #22           // ext/mods/gameserver/model/memo/SpawnMemo
   #21 = NameAndType        #23:#24       // DUMMY_SET:Lext/mods/gameserver/model/memo/SpawnMemo;
   #22 = Utf8               ext/mods/gameserver/model/memo/SpawnMemo
   #23 = Utf8               DUMMY_SET
   #24 = Utf8               Lext/mods/gameserver/model/memo/SpawnMemo;
   #25 = Fieldref           #14.#26       // ext/mods/gameserver/model/spawn/ASpawn._aiParams:Lext/mods/gameserver/model/memo/SpawnMemo;
   #26 = NameAndType        #27:#24       // _aiParams:Lext/mods/gameserver/model/memo/SpawnMemo;
   #27 = Utf8               _aiParams
   #28 = Methodref          #29.#30       // ext/mods/gameserver/data/xml/NpcData.getInstance:()Lext/mods/gameserver/data/xml/NpcData;
   #29 = Class              #31           // ext/mods/gameserver/data/xml/NpcData
   #30 = NameAndType        #32:#33       // getInstance:()Lext/mods/gameserver/data/xml/NpcData;
   #31 = Utf8               ext/mods/gameserver/data/xml/NpcData
   #32 = Utf8               getInstance
   #33 = Utf8               ()Lext/mods/gameserver/data/xml/NpcData;
   #34 = Methodref          #29.#35       // ext/mods/gameserver/data/xml/NpcData.getTemplate:(I)Lext/mods/gameserver/model/actor/template/NpcTemplate;
   #35 = NameAndType        #36:#37       // getTemplate:(I)Lext/mods/gameserver/model/actor/template/NpcTemplate;
   #36 = Utf8               getTemplate
   #37 = Utf8               (I)Lext/mods/gameserver/model/actor/template/NpcTemplate;
   #38 = Fieldref           #14.#39       // ext/mods/gameserver/model/spawn/ASpawn._template:Lext/mods/gameserver/model/actor/template/NpcTemplate;
   #39 = NameAndType        #40:#41       // _template:Lext/mods/gameserver/model/actor/template/NpcTemplate;
   #40 = Utf8               _template
   #41 = Utf8               Lext/mods/gameserver/model/actor/template/NpcTemplate;
   #42 = Fieldref           #14.#43       // ext/mods/gameserver/model/spawn/ASpawn._constructor:Ljava/lang/reflect/Constructor;
   #43 = NameAndType        #44:#45       // _constructor:Ljava/lang/reflect/Constructor;
   #44 = Utf8               _constructor
   #45 = Utf8               Ljava/lang/reflect/Constructor;
   #46 = Methodref          #47.#48       // ext/mods/gameserver/model/actor/template/NpcTemplate.getType:()Ljava/lang/String;
   #47 = Class              #49           // ext/mods/gameserver/model/actor/template/NpcTemplate
   #48 = NameAndType        #50:#51       // getType:()Ljava/lang/String;
   #49 = Utf8               ext/mods/gameserver/model/actor/template/NpcTemplate
   #50 = Utf8               getType
   #51 = Utf8               ()Ljava/lang/String;
   #52 = InvokeDynamic      #0:#53        // #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #53 = NameAndType        #54:#55       // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #54 = Utf8               makeConcatWithConstants
   #55 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
   #56 = Methodref          #57.#58       // java/lang/Class.forName:(Ljava/lang/String;)Ljava/lang/Class;
   #57 = Class              #59           // java/lang/Class
   #58 = NameAndType        #60:#61       // forName:(Ljava/lang/String;)Ljava/lang/Class;
   #59 = Utf8               java/lang/Class
   #60 = Utf8               forName
   #61 = Utf8               (Ljava/lang/String;)Ljava/lang/Class;
   #62 = Class              #63           // ext/mods/gameserver/model/actor/Npc
   #63 = Utf8               ext/mods/gameserver/model/actor/Npc
   #64 = Methodref          #57.#65       // java/lang/Class.isAssignableFrom:(Ljava/lang/Class;)Z
   #65 = NameAndType        #66:#67       // isAssignableFrom:(Ljava/lang/Class;)Z
   #66 = Utf8               isAssignableFrom
   #67 = Utf8               (Ljava/lang/Class;)Z
   #68 = Class              #69           // java/io/InvalidClassException
   #69 = Utf8               java/io/InvalidClassException
   #70 = InvokeDynamic      #1:#53        // #1:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #71 = Methodref          #68.#72       // java/io/InvalidClassException."<init>":(Ljava/lang/String;)V
   #72 = NameAndType        #5:#73        // "<init>":(Ljava/lang/String;)V
   #73 = Utf8               (Ljava/lang/String;)V
   #74 = Fieldref           #75.#76       // java/lang/Integer.TYPE:Ljava/lang/Class;
   #75 = Class              #77           // java/lang/Integer
   #76 = NameAndType        #78:#79       // TYPE:Ljava/lang/Class;
   #77 = Utf8               java/lang/Integer
   #78 = Utf8               TYPE
   #79 = Utf8               Ljava/lang/Class;
   #80 = Methodref          #57.#81       // java/lang/Class.getConstructor:([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
   #81 = NameAndType        #82:#83       // getConstructor:([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
   #82 = Utf8               getConstructor
   #83 = Utf8               ([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
   #84 = Methodref          #47.#85       // ext/mods/gameserver/model/actor/template/NpcTemplate.getNpcId:()I
   #85 = NameAndType        #86:#87       // getNpcId:()I
   #86 = Utf8               getNpcId
   #87 = Utf8               ()I
   #88 = Methodref          #89.#90       // java/lang/Math.max:(II)I
   #89 = Class              #91           // java/lang/Math
   #90 = NameAndType        #92:#93       // max:(II)I
   #91 = Utf8               java/lang/Math
   #92 = Utf8               max
   #93 = Utf8               (II)I
   #94 = Fieldref           #14.#95       // ext/mods/gameserver/model/spawn/ASpawn._respawnDelay:I
   #95 = NameAndType        #96:#97       // _respawnDelay:I
   #96 = Utf8               _respawnDelay
   #97 = Utf8               I
   #98 = Methodref          #89.#99       // java/lang/Math.clamp:(JII)I
   #99 = NameAndType        #100:#101     // clamp:(JII)I
  #100 = Utf8               clamp
  #101 = Utf8               (JII)I
  #102 = Fieldref           #14.#103      // ext/mods/gameserver/model/spawn/ASpawn._respawnRandom:I
  #103 = NameAndType        #104:#97      // _respawnRandom:I
  #104 = Utf8               _respawnRandom
  #105 = Methodref          #106.#107     // ext/mods/commons/random/Rnd.get:(II)I
  #106 = Class              #108          // ext/mods/commons/random/Rnd
  #107 = NameAndType        #109:#93      // get:(II)I
  #108 = Utf8               ext/mods/commons/random/Rnd
  #109 = Utf8               get
  #110 = Methodref          #62.#111      // ext/mods/gameserver/model/actor/Npc.isRaidBoss:()Z
  #111 = NameAndType        #112:#113     // isRaidBoss:()Z
  #112 = Utf8               isRaidBoss
  #113 = Utf8               ()Z
  #114 = Fieldref           #115.#116     // ext/mods/Config.USE_CONFIG_RAID_GRAND_BOSS_RESPAWN:Z
  #115 = Class              #117          // ext/mods/Config
  #116 = NameAndType        #118:#119     // USE_CONFIG_RAID_GRAND_BOSS_RESPAWN:Z
  #117 = Utf8               ext/mods/Config
  #118 = Utf8               USE_CONFIG_RAID_GRAND_BOSS_RESPAWN
  #119 = Utf8               Z
  #120 = Class              #121          // ext/mods/gameserver/model/actor/instance/GrandBoss
  #121 = Utf8               ext/mods/gameserver/model/actor/instance/GrandBoss
  #122 = Fieldref           #115.#123     // ext/mods/Config.GRAND_BOSS_RESPAWN_OVERRIDES:Ljava/util/Map;
  #123 = NameAndType        #124:#125     // GRAND_BOSS_RESPAWN_OVERRIDES:Ljava/util/Map;
  #124 = Utf8               GRAND_BOSS_RESPAWN_OVERRIDES
  #125 = Utf8               Ljava/util/Map;
  #126 = Fieldref           #115.#127     // ext/mods/Config.RAID_BOSS_RESPAWN_OVERRIDES:Ljava/util/Map;
  #127 = NameAndType        #128:#125     // RAID_BOSS_RESPAWN_OVERRIDES:Ljava/util/Map;
  #128 = Utf8               RAID_BOSS_RESPAWN_OVERRIDES
  #129 = Methodref          #62.#85       // ext/mods/gameserver/model/actor/Npc.getNpcId:()I
  #130 = Methodref          #75.#131      // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
  #131 = NameAndType        #132:#133     // valueOf:(I)Ljava/lang/Integer;
  #132 = Utf8               valueOf
  #133 = Utf8               (I)Ljava/lang/Integer;
  #134 = InterfaceMethodref #135.#136     // java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
  #135 = Class              #137          // java/util/Map
  #136 = NameAndType        #109:#138     // get:(Ljava/lang/Object;)Ljava/lang/Object;
  #137 = Utf8               java/util/Map
  #138 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
  #139 = Class              #140          // "[J"
  #140 = Utf8               [J
  #141 = Fieldref           #115.#142     // ext/mods/Config.GRAND_BOSS_RESPAWN_BASE_MS:J
  #142 = NameAndType        #143:#144     // GRAND_BOSS_RESPAWN_BASE_MS:J
  #143 = Utf8               GRAND_BOSS_RESPAWN_BASE_MS
  #144 = Utf8               J
  #145 = Fieldref           #115.#146     // ext/mods/Config.RAID_BOSS_RESPAWN_BASE_MS:J
  #146 = NameAndType        #147:#144     // RAID_BOSS_RESPAWN_BASE_MS:J
  #147 = Utf8               RAID_BOSS_RESPAWN_BASE_MS
  #148 = Fieldref           #115.#149     // ext/mods/Config.GRAND_BOSS_RESPAWN_RANDOM_MS:J
  #149 = NameAndType        #150:#144     // GRAND_BOSS_RESPAWN_RANDOM_MS:J
  #150 = Utf8               GRAND_BOSS_RESPAWN_RANDOM_MS
  #151 = Fieldref           #115.#152     // ext/mods/Config.RAID_BOSS_RESPAWN_RANDOM_MS:J
  #152 = NameAndType        #153:#144     // RAID_BOSS_RESPAWN_RANDOM_MS:J
  #153 = Utf8               RAID_BOSS_RESPAWN_RANDOM_MS
  #154 = Methodref          #106.#155     // ext/mods/commons/random/Rnd.get:(JJ)J
  #155 = NameAndType        #109:#156     // get:(JJ)J
  #156 = Utf8               (JJ)J
  #157 = Methodref          #89.#158      // java/lang/Math.max:(JJ)J
  #158 = NameAndType        #92:#156      // max:(JJ)J
  #159 = Fieldref           #14.#160      // ext/mods/gameserver/model/spawn/ASpawn._spawnData:Lext/mods/gameserver/model/spawn/SpawnData;
  #160 = NameAndType        #161:#162     // _spawnData:Lext/mods/gameserver/model/spawn/SpawnData;
  #161 = Utf8               _spawnData
  #162 = Utf8               Lext/mods/gameserver/model/spawn/SpawnData;
  #163 = String             #164          // flee_x
  #164 = Utf8               flee_x
  #165 = Methodref          #20.#166      // ext/mods/gameserver/model/memo/SpawnMemo.getInteger:(Ljava/lang/String;I)I
  #166 = NameAndType        #167:#168     // getInteger:(Ljava/lang/String;I)I
  #167 = Utf8               getInteger
  #168 = Utf8               (Ljava/lang/String;I)I
  #169 = String             #170          // flee_y
  #170 = Utf8               flee_y
  #171 = String             #172          // flee_z
  #172 = Utf8               flee_z
  #173 = Class              #174          // ext/mods/gameserver/model/location/Location
  #174 = Utf8               ext/mods/gameserver/model/location/Location
  #175 = Methodref          #173.#176     // ext/mods/gameserver/model/location/Location."<init>":(III)V
  #176 = NameAndType        #5:#177       // "<init>":(III)V
  #177 = Utf8               (III)V
  #178 = Methodref          #179.#180     // ext/mods/gameserver/idfactory/IdFactory.getInstance:()Lext/mods/gameserver/idfactory/IdFactory;
  #179 = Class              #181          // ext/mods/gameserver/idfactory/IdFactory
  #180 = NameAndType        #32:#182      // getInstance:()Lext/mods/gameserver/idfactory/IdFactory;
  #181 = Utf8               ext/mods/gameserver/idfactory/IdFactory
  #182 = Utf8               ()Lext/mods/gameserver/idfactory/IdFactory;
  #183 = Methodref          #179.#184     // ext/mods/gameserver/idfactory/IdFactory.getNextId:()I
  #184 = NameAndType        #185:#87      // getNextId:()I
  #185 = Utf8               getNextId
  #186 = Methodref          #187.#188     // java/lang/reflect/Constructor.newInstance:([Ljava/lang/Object;)Ljava/lang/Object;
  #187 = Class              #189          // java/lang/reflect/Constructor
  #188 = NameAndType        #190:#191     // newInstance:([Ljava/lang/Object;)Ljava/lang/Object;
  #189 = Utf8               java/lang/reflect/Constructor
  #190 = Utf8               newInstance
  #191 = Utf8               ([Ljava/lang/Object;)Ljava/lang/Object;
  #192 = Fieldref           #62.#193      // ext/mods/gameserver/model/actor/Npc._summoner:Lext/mods/gameserver/model/actor/Creature;
  #193 = NameAndType        #194:#195     // _summoner:Lext/mods/gameserver/model/actor/Creature;
  #194 = Utf8               _summoner
  #195 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #196 = Methodref          #75.#197      // java/lang/Integer.intValue:()I
  #197 = NameAndType        #198:#87      // intValue:()I
  #198 = Utf8               intValue
  #199 = Methodref          #62.#200      // ext/mods/gameserver/model/actor/Npc.setClanId:(I)V
  #200 = NameAndType        #201:#202     // setClanId:(I)V
  #201 = Utf8               setClanId
  #202 = Utf8               (I)V
  #203 = Methodref          #62.#204      // ext/mods/gameserver/model/actor/Npc.setSpawn:(Lext/mods/gameserver/model/spawn/ASpawn;)V
  #204 = NameAndType        #205:#206     // setSpawn:(Lext/mods/gameserver/model/spawn/ASpawn;)V
  #205 = Utf8               setSpawn
  #206 = Utf8               (Lext/mods/gameserver/model/spawn/ASpawn;)V
  #207 = Methodref          #62.#208      // ext/mods/gameserver/model/actor/Npc.setShowSummonAnimation:(Z)V
  #208 = NameAndType        #209:#210     // setShowSummonAnimation:(Z)V
  #209 = Utf8               setShowSummonAnimation
  #210 = Utf8               (Z)V
  #211 = Methodref          #14.#212      // ext/mods/gameserver/model/spawn/ASpawn.initializeAndSpawn:(Lext/mods/gameserver/model/actor/Npc;)Lext/mods/gameserver/model/actor/Npc;
  #212 = NameAndType        #213:#214     // initializeAndSpawn:(Lext/mods/gameserver/model/actor/Npc;)Lext/mods/gameserver/model/actor/Npc;
  #213 = Utf8               initializeAndSpawn
  #214 = Utf8               (Lext/mods/gameserver/model/actor/Npc;)Lext/mods/gameserver/model/actor/Npc;
  #215 = Class              #216          // java/lang/Exception
  #216 = Utf8               java/lang/Exception
  #217 = Fieldref           #14.#218      // ext/mods/gameserver/model/spawn/ASpawn.LOGGER:Lext/mods/commons/logging/CLogger;
  #218 = NameAndType        #219:#220     // LOGGER:Lext/mods/commons/logging/CLogger;
  #219 = Utf8               LOGGER
  #220 = Utf8               Lext/mods/commons/logging/CLogger;
  #221 = String             #222          // Error during spawn, NPC id={}
  #222 = Utf8               Error during spawn, NPC id={}
  #223 = Methodref          #224.#225     // ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
  #224 = Class              #226          // ext/mods/commons/logging/CLogger
  #225 = NameAndType        #227:#228     // warn:(Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
  #226 = Utf8               ext/mods/commons/logging/CLogger
  #227 = Utf8               warn
  #228 = Utf8               (Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
  #229 = Methodref          #14.#230      // ext/mods/gameserver/model/spawn/ASpawn.doSpawn:(ZLext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/model/actor/Npc;
  #230 = NameAndType        #231:#232     // doSpawn:(ZLext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/model/actor/Npc;
  #231 = Utf8               doSpawn
  #232 = Utf8               (ZLext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/model/actor/Npc;
  #233 = Methodref          #62.#234      // ext/mods/gameserver/model/actor/Npc.cancelRespawn:()V
  #234 = NameAndType        #235:#6       // cancelRespawn:()V
  #235 = Utf8               cancelRespawn
  #236 = Methodref          #237.#234     // ext/mods/gameserver/model/spawn/SpawnData.cancelRespawn:()V
  #237 = Class              #238          // ext/mods/gameserver/model/spawn/SpawnData
  #238 = Utf8               ext/mods/gameserver/model/spawn/SpawnData
  #239 = Methodref          #62.#240      // ext/mods/gameserver/model/actor/Npc.isDecayed:()Z
  #240 = NameAndType        #241:#113     // isDecayed:()Z
  #241 = Utf8               isDecayed
  #242 = Methodref          #62.#243      // ext/mods/gameserver/model/actor/Npc.refreshID:()V
  #243 = NameAndType        #244:#6       // refreshID:()V
  #244 = Utf8               refreshID
  #245 = Methodref          #246.#247     // ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
  #246 = Class              #248          // ext/mods/gameserver/model/World
  #247 = NameAndType        #32:#249      // getInstance:()Lext/mods/gameserver/model/World;
  #248 = Utf8               ext/mods/gameserver/model/World
  #249 = Utf8               ()Lext/mods/gameserver/model/World;
  #250 = Methodref          #246.#251     // ext/mods/gameserver/model/World.getPlayers:()Ljava/util/Collection;
  #251 = NameAndType        #252:#253     // getPlayers:()Ljava/util/Collection;
  #252 = Utf8               getPlayers
  #253 = Utf8               ()Ljava/util/Collection;
  #254 = InterfaceMethodref #255.#256     // java/util/Collection.stream:()Ljava/util/stream/Stream;
  #255 = Class              #257          // java/util/Collection
  #256 = NameAndType        #258:#259     // stream:()Ljava/util/stream/Stream;
  #257 = Utf8               java/util/Collection
  #258 = Utf8               stream
  #259 = Utf8               ()Ljava/util/stream/Stream;
  #260 = InvokeDynamic      #2:#261       // #2:test:(Lext/mods/gameserver/model/spawn/ASpawn;)Ljava/util/function/Predicate;
  #261 = NameAndType        #262:#263     // test:(Lext/mods/gameserver/model/spawn/ASpawn;)Ljava/util/function/Predicate;
  #262 = Utf8               test
  #263 = Utf8               (Lext/mods/gameserver/model/spawn/ASpawn;)Ljava/util/function/Predicate;
  #264 = InterfaceMethodref #265.#266     // java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
  #265 = Class              #267          // java/util/stream/Stream
  #266 = NameAndType        #268:#269     // filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
  #267 = Utf8               java/util/stream/Stream
  #268 = Utf8               filter
  #269 = Utf8               (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
  #270 = InvokeDynamic      #3:#271       // #3:accept:(IIII)Ljava/util/function/Consumer;
  #271 = NameAndType        #272:#273     // accept:(IIII)Ljava/util/function/Consumer;
  #272 = Utf8               accept
  #273 = Utf8               (IIII)Ljava/util/function/Consumer;
  #274 = InterfaceMethodref #265.#275     // java/util/stream/Stream.forEach:(Ljava/util/function/Consumer;)V
  #275 = NameAndType        #276:#277     // forEach:(Ljava/util/function/Consumer;)V
  #276 = Utf8               forEach
  #277 = Utf8               (Ljava/util/function/Consumer;)V
  #278 = Methodref          #14.#279      // ext/mods/gameserver/model/spawn/ASpawn.instantTeleportInMyTerritory:(IIII)V
  #279 = NameAndType        #280:#281     // instantTeleportInMyTerritory:(IIII)V
  #280 = Utf8               instantTeleportInMyTerritory
  #281 = Utf8               (IIII)V
  #282 = Methodref          #173.#283     // ext/mods/gameserver/model/location/Location.getX:()I
  #283 = NameAndType        #284:#87      // getX:()I
  #284 = Utf8               getX
  #285 = Methodref          #173.#286     // ext/mods/gameserver/model/location/Location.getY:()I
  #286 = NameAndType        #287:#87      // getY:()I
  #287 = Utf8               getY
  #288 = Methodref          #173.#289     // ext/mods/gameserver/model/location/Location.getZ:()I
  #289 = NameAndType        #290:#87      // getZ:()I
  #290 = Utf8               getZ
  #291 = Methodref          #237.#292     // ext/mods/gameserver/model/spawn/SpawnData.checkDead:()Z
  #292 = NameAndType        #293:#113     // checkDead:()Z
  #293 = Utf8               checkDead
  #294 = Methodref          #62.#295      // ext/mods/gameserver/model/actor/Npc.getStatus:()Lext/mods/gameserver/model/actor/status/NpcStatus;
  #295 = NameAndType        #296:#297     // getStatus:()Lext/mods/gameserver/model/actor/status/NpcStatus;
  #296 = Utf8               getStatus
  #297 = Utf8               ()Lext/mods/gameserver/model/actor/status/NpcStatus;
  #298 = Methodref          #299.#300     // ext/mods/gameserver/model/actor/status/NpcStatus.setHp:(D)V
  #299 = Class              #301          // ext/mods/gameserver/model/actor/status/NpcStatus
  #300 = NameAndType        #302:#303     // setHp:(D)V
  #301 = Utf8               ext/mods/gameserver/model/actor/status/NpcStatus
  #302 = Utf8               setHp
  #303 = Utf8               (D)V
  #304 = Methodref          #62.#305      // ext/mods/gameserver/model/actor/Npc.setIsDead:(Z)V
  #305 = NameAndType        #306:#210     // setIsDead:(Z)V
  #306 = Utf8               setIsDead
  #307 = Methodref          #62.#308      // ext/mods/gameserver/model/actor/Npc.setDecayed:(Z)V
  #308 = NameAndType        #309:#210     // setDecayed:(Z)V
  #309 = Utf8               setDecayed
  #310 = Methodref          #237.#311     // ext/mods/gameserver/model/spawn/SpawnData.getRespawnTime:()J
  #311 = NameAndType        #312:#313     // getRespawnTime:()J
  #312 = Utf8               getRespawnTime
  #313 = Utf8               ()J
  #314 = Methodref          #315.#316     // java/lang/System.currentTimeMillis:()J
  #315 = Class              #317          // java/lang/System
  #316 = NameAndType        #318:#313     // currentTimeMillis:()J
  #317 = Utf8               java/lang/System
  #318 = Utf8               currentTimeMillis
  #319 = Methodref          #62.#320      // ext/mods/gameserver/model/actor/Npc.scheduleDBRespawn:(J)V
  #320 = NameAndType        #321:#322     // scheduleDBRespawn:(J)V
  #321 = Utf8               scheduleDBRespawn
  #322 = Utf8               (J)V
  #323 = Fieldref           #14.#324      // ext/mods/gameserver/model/spawn/ASpawn._dbLoaded:Z
  #324 = NameAndType        #325:#119     // _dbLoaded:Z
  #325 = Utf8               _dbLoaded
  #326 = Methodref          #62.#327      // ext/mods/gameserver/model/actor/Npc.stopAllEffects:()V
  #327 = NameAndType        #328:#6       // stopAllEffects:()V
  #328 = Utf8               stopAllEffects
  #329 = Methodref          #62.#330      // ext/mods/gameserver/model/actor/Npc.setScriptValue:(I)V
  #330 = NameAndType        #331:#202     // setScriptValue:(I)V
  #331 = Utf8               setScriptValue
  #332 = Methodref          #299.#333     // ext/mods/gameserver/model/actor/status/NpcStatus.initializeValues:()V
  #333 = NameAndType        #334:#6       // initializeValues:()V
  #334 = Utf8               initializeValues
  #335 = Methodref          #14.#336      // ext/mods/gameserver/model/spawn/ASpawn.getSpawnLocation:()Lext/mods/gameserver/model/location/SpawnLocation;
  #336 = NameAndType        #337:#338     // getSpawnLocation:()Lext/mods/gameserver/model/location/SpawnLocation;
  #337 = Utf8               getSpawnLocation
  #338 = Utf8               ()Lext/mods/gameserver/model/location/SpawnLocation;
  #339 = String             #340          // {} misses location informations.
  #340 = Utf8               {} misses location informations.
  #341 = Methodref          #224.#342     // ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;[Ljava/lang/Object;)V
  #342 = NameAndType        #227:#343     // warn:(Ljava/lang/Object;[Ljava/lang/Object;)V
  #343 = Utf8               (Ljava/lang/Object;[Ljava/lang/Object;)V
  #344 = Methodref          #299.#345     // ext/mods/gameserver/model/actor/status/NpcStatus.getMaxHp:()I
  #345 = NameAndType        #346:#87      // getMaxHp:()I
  #346 = Utf8               getMaxHp
  #347 = Methodref          #299.#348     // ext/mods/gameserver/model/actor/status/NpcStatus.getMaxMp:()I
  #348 = NameAndType        #349:#87      // getMaxMp:()I
  #349 = Utf8               getMaxMp
  #350 = Methodref          #237.#351     // ext/mods/gameserver/model/spawn/SpawnData.checkAlive:(Lext/mods/gameserver/model/location/SpawnLocation;DD)Z
  #351 = NameAndType        #352:#353     // checkAlive:(Lext/mods/gameserver/model/location/SpawnLocation;DD)Z
  #352 = Utf8               checkAlive
  #353 = Utf8               (Lext/mods/gameserver/model/location/SpawnLocation;DD)Z
  #354 = Methodref          #237.#355     // ext/mods/gameserver/model/spawn/SpawnData.getCurrentHp:()I
  #355 = NameAndType        #356:#87      // getCurrentHp:()I
  #356 = Utf8               getCurrentHp
  #357 = Methodref          #237.#358     // ext/mods/gameserver/model/spawn/SpawnData.getCurrentMp:()I
  #358 = NameAndType        #359:#87      // getCurrentMp:()I
  #359 = Utf8               getCurrentMp
  #360 = Methodref          #299.#361     // ext/mods/gameserver/model/actor/status/NpcStatus.setHpMp:(DD)V
  #361 = NameAndType        #362:#363     // setHpMp:(DD)V
  #362 = Utf8               setHpMp
  #363 = Utf8               (DD)V
  #364 = Fieldref           #115.#365     // ext/mods/Config.CHAMPION_FREQUENCY:I
  #365 = NameAndType        #366:#97      // CHAMPION_FREQUENCY:I
  #366 = Utf8               CHAMPION_FREQUENCY
  #367 = Class              #368          // ext/mods/gameserver/model/actor/instance/Monster
  #368 = Utf8               ext/mods/gameserver/model/actor/instance/Monster
  #369 = Methodref          #14.#370      // ext/mods/gameserver/model/spawn/ASpawn.getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #370 = NameAndType        #36:#371      // getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #371 = Utf8               ()Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #372 = Methodref          #47.#373      // ext/mods/gameserver/model/actor/template/NpcTemplate.cantBeChampion:()Z
  #373 = NameAndType        #374:#113     // cantBeChampion:()Z
  #374 = Utf8               cantBeChampion
  #375 = Methodref          #299.#376     // ext/mods/gameserver/model/actor/status/NpcStatus.getLevel:()I
  #376 = NameAndType        #377:#87      // getLevel:()I
  #377 = Utf8               getLevel
  #378 = Fieldref           #115.#379     // ext/mods/Config.CHAMP_MIN_LVL:I
  #379 = NameAndType        #380:#97      // CHAMP_MIN_LVL:I
  #380 = Utf8               CHAMP_MIN_LVL
  #381 = Fieldref           #115.#382     // ext/mods/Config.CHAMP_MAX_LVL:I
  #382 = NameAndType        #383:#97      // CHAMP_MAX_LVL:I
  #383 = Utf8               CHAMP_MAX_LVL
  #384 = Methodref          #62.#385      // ext/mods/gameserver/model/actor/Npc.isRaidRelated:()Z
  #385 = NameAndType        #386:#113     // isRaidRelated:()Z
  #386 = Utf8               isRaidRelated
  #387 = Methodref          #62.#388      // ext/mods/gameserver/model/actor/Npc.hasMaster:()Z
  #388 = NameAndType        #389:#113     // hasMaster:()Z
  #389 = Utf8               hasMaster
  #390 = Methodref          #106.#391     // ext/mods/commons/random/Rnd.get:(I)I
  #391 = NameAndType        #109:#392     // get:(I)I
  #392 = Utf8               (I)I
  #393 = Methodref          #367.#394     // ext/mods/gameserver/model/actor/instance/Monster.setChampion:(Z)V
  #394 = NameAndType        #395:#210     // setChampion:(Z)V
  #395 = Utf8               setChampion
  #396 = Methodref          #62.#397      // ext/mods/gameserver/model/actor/Npc.setSpawnLocation:(Lext/mods/gameserver/model/location/SpawnLocation;)V
  #397 = NameAndType        #398:#399     // setSpawnLocation:(Lext/mods/gameserver/model/location/SpawnLocation;)V
  #398 = Utf8               setSpawnLocation
  #399 = Utf8               (Lext/mods/gameserver/model/location/SpawnLocation;)V
  #400 = Methodref          #62.#401      // ext/mods/gameserver/model/actor/Npc.spawnMe:(Lext/mods/gameserver/model/location/SpawnLocation;)V
  #401 = NameAndType        #402:#399     // spawnMe:(Lext/mods/gameserver/model/location/SpawnLocation;)V
  #402 = Utf8               spawnMe
  #403 = Methodref          #404.#405     // ext/mods/gameserver/data/manager/SpawnManager.getInstance:()Lext/mods/gameserver/data/manager/SpawnManager;
  #404 = Class              #406          // ext/mods/gameserver/data/manager/SpawnManager
  #405 = NameAndType        #32:#407      // getInstance:()Lext/mods/gameserver/data/manager/SpawnManager;
  #406 = Utf8               ext/mods/gameserver/data/manager/SpawnManager
  #407 = Utf8               ()Lext/mods/gameserver/data/manager/SpawnManager;
  #408 = Methodref          #404.#409     // ext/mods/gameserver/data/manager/SpawnManager.save:(Lext/mods/gameserver/model/spawn/SpawnData;)V
  #409 = NameAndType        #410:#411     // save:(Lext/mods/gameserver/model/spawn/SpawnData;)V
  #410 = Utf8               save
  #411 = Utf8               (Lext/mods/gameserver/model/spawn/SpawnData;)V
  #412 = Methodref          #413.#414     // ext/mods/gameserver/model/actor/Player.teleportTo:(IIII)Z
  #413 = Class              #415          // ext/mods/gameserver/model/actor/Player
  #414 = NameAndType        #416:#417     // teleportTo:(IIII)Z
  #415 = Utf8               ext/mods/gameserver/model/actor/Player
  #416 = Utf8               teleportTo
  #417 = Utf8               (IIII)Z
  #418 = Methodref          #413.#419     // ext/mods/gameserver/model/actor/Player.isOnline:()Z
  #419 = NameAndType        #420:#113     // isOnline:()Z
  #420 = Utf8               isOnline
  #421 = Methodref          #14.#422      // ext/mods/gameserver/model/spawn/ASpawn.isInMyTerritory:(Lext/mods/gameserver/model/WorldObject;)Z
  #422 = NameAndType        #423:#424     // isInMyTerritory:(Lext/mods/gameserver/model/WorldObject;)Z
  #423 = Utf8               isInMyTerritory
  #424 = Utf8               (Lext/mods/gameserver/model/WorldObject;)Z
  #425 = Methodref          #57.#426      // java/lang/Class.getName:()Ljava/lang/String;
  #426 = NameAndType        #427:#51      // getName:()Ljava/lang/String;
  #427 = Utf8               getName
  #428 = Methodref          #224.#72      // ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
  #429 = Utf8               INSTANCE_PACKAGE
  #430 = Utf8               Ljava/lang/String;
  #431 = Utf8               ConstantValue
  #432 = String             #433          // ext.mods.gameserver.model.actor.instance.
  #433 = Utf8               ext.mods.gameserver.model.actor.instance.
  #434 = Utf8               Signature
  #435 = Utf8               Ljava/lang/reflect/Constructor<*>;
  #436 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/records/PrivateData;>;
  #437 = Utf8               Code
  #438 = Utf8               LineNumberTable
  #439 = Utf8               LocalVariableTable
  #440 = Utf8               this
  #441 = Utf8               Lext/mods/gameserver/model/spawn/ASpawn;
  #442 = Utf8               id
  #443 = Utf8               clazz
  #444 = Utf8               LocalVariableTypeTable
  #445 = Utf8               Ljava/lang/Class<*>;
  #446 = Utf8               StackMapTable
  #447 = Utf8               Exceptions
  #448 = Class              #449          // java/lang/SecurityException
  #449 = Utf8               java/lang/SecurityException
  #450 = Class              #451          // java/lang/ClassNotFoundException
  #451 = Utf8               java/lang/ClassNotFoundException
  #452 = Class              #453          // java/lang/NoSuchMethodException
  #453 = Utf8               java/lang/NoSuchMethodException
  #454 = Utf8               (Lext/mods/gameserver/model/actor/template/NpcTemplate;)V
  #455 = Utf8               template
  #456 = Utf8               setRespawnDelay
  #457 = Utf8               delay
  #458 = Utf8               getRespawnDelay
  #459 = Utf8               setRespawnRandom
  #460 = Utf8               random
  #461 = Utf8               getRespawnRandom
  #462 = Utf8               calculateRespawnDelay
  #463 = Utf8               respawnTime
  #464 = Utf8               calculateBossRespawnDelayMs
  #465 = Utf8               (Lext/mods/gameserver/model/actor/Npc;)J
  #466 = Utf8               npc
  #467 = Utf8               Lext/mods/gameserver/model/actor/Npc;
  #468 = Utf8               isGrandBoss
  #469 = Utf8               overrides
  #470 = Utf8               override
  #471 = Utf8               baseMs
  #472 = Utf8               randomMs
  #473 = Utf8               offset
  #474 = Utf8               Ljava/util/Map<Ljava/lang/Integer;[J>;
  #475 = Utf8               getSpawnData
  #476 = Utf8               ()Lext/mods/gameserver/model/spawn/SpawnData;
  #477 = Utf8               getPrivateData
  #478 = Utf8               ()Ljava/util/List<Lext/mods/gameserver/model/records/PrivateData;>;
  #479 = Utf8               getFleeLocation
  #480 = Utf8               ()Lext/mods/gameserver/model/location/Location;
  #481 = Utf8               fleeX
  #482 = Utf8               fleeY
  #483 = Utf8               fleeZ
  #484 = Utf8               getMemo
  #485 = Utf8               ()Lext/mods/gameserver/model/memo/SpawnMemo;
  #486 = Utf8               getNpc
  #487 = Utf8               ()Lext/mods/gameserver/model/actor/Npc;
  #488 = Utf8               getRandomWalkLocation
  #489 = Utf8               (Lext/mods/gameserver/model/actor/Npc;I)Lext/mods/gameserver/model/location/Location;
  #490 = Utf8               getDescription
  #491 = Utf8               updateSpawnData
  #492 = Utf8               sendScriptEvent
  #493 = Utf8               (ZLext/mods/gameserver/model/actor/Creature;Ljava/lang/Integer;)Lext/mods/gameserver/model/actor/Npc;
  #494 = Utf8               e
  #495 = Utf8               Ljava/lang/Exception;
  #496 = Utf8               isSummonSpawn
  #497 = Utf8               summoner
  #498 = Utf8               clanId
  #499 = Utf8               Ljava/lang/Integer;
  #500 = Class              #501          // ext/mods/gameserver/model/actor/Creature
  #501 = Utf8               ext/mods/gameserver/model/actor/Creature
  #502 = Utf8               (Z)Lext/mods/gameserver/model/actor/Npc;
  #503 = Utf8               onSpawn
  #504 = Utf8               (Lext/mods/gameserver/model/actor/Npc;)V
  #505 = Utf8               doDelete
  #506 = Utf8               onDecay
  #507 = Utf8               doRespawn
  #508 = Utf8               x
  #509 = Utf8               y
  #510 = Utf8               z
  #511 = Utf8               (Lext/mods/gameserver/model/location/Location;I)V
  #512 = Utf8               loc
  #513 = Utf8               Lext/mods/gameserver/model/location/Location;
  #514 = Utf8               (Lext/mods/gameserver/model/location/Location;)V
  #515 = Utf8               Lext/mods/gameserver/model/location/SpawnLocation;
  #516 = Utf8               maxHp
  #517 = Utf8               D
  #518 = Utf8               maxMp
  #519 = Class              #520          // ext/mods/gameserver/model/location/SpawnLocation
  #520 = Utf8               ext/mods/gameserver/model/location/SpawnLocation
  #521 = Utf8               onDie
  #522 = Utf8               doSave
  #523 = Utf8               getDBLoaded
  #524 = Utf8               setDBLoaded
  #525 = Utf8               value
  #526 = Utf8               lambda$instantTeleportInMyTerritory$1
  #527 = Utf8               (IIIILext/mods/gameserver/model/actor/Player;)V
  #528 = Utf8               p
  #529 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #530 = Utf8               lambda$instantTeleportInMyTerritory$0
  #531 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Z
  #532 = Utf8               <clinit>
  #533 = Utf8               SourceFile
  #534 = Utf8               ASpawn.java
  #535 = Utf8               BootstrapMethods
  #536 = String             #537          // ext.mods.gameserver.model.actor.instance.\u0001
  #537 = Utf8               ext.mods.gameserver.model.actor.instance.\u0001
  #538 = String             #539          // Template type \u0001 is not child of Npc.
  #539 = Utf8               Template type \u0001 is not child of Npc.
  #540 = MethodType         #541          //  (Ljava/lang/Object;)Z
  #541 = Utf8               (Ljava/lang/Object;)Z
  #542 = MethodHandle       5:#543        // REF_invokeVirtual ext/mods/gameserver/model/spawn/ASpawn.lambda$instantTeleportInMyTerritory$0:(Lext/mods/gameserver/model/actor/Player;)Z
  #543 = Methodref          #14.#544      // ext/mods/gameserver/model/spawn/ASpawn.lambda$instantTeleportInMyTerritory$0:(Lext/mods/gameserver/model/actor/Player;)Z
  #544 = NameAndType        #530:#531     // lambda$instantTeleportInMyTerritory$0:(Lext/mods/gameserver/model/actor/Player;)Z
  #545 = MethodType         #531          //  (Lext/mods/gameserver/model/actor/Player;)Z
  #546 = MethodType         #547          //  (Ljava/lang/Object;)V
  #547 = Utf8               (Ljava/lang/Object;)V
  #548 = MethodHandle       6:#549        // REF_invokeStatic ext/mods/gameserver/model/spawn/ASpawn.lambda$instantTeleportInMyTerritory$1:(IIIILext/mods/gameserver/model/actor/Player;)V
  #549 = Methodref          #14.#550      // ext/mods/gameserver/model/spawn/ASpawn.lambda$instantTeleportInMyTerritory$1:(IIIILext/mods/gameserver/model/actor/Player;)V
  #550 = NameAndType        #526:#527     // lambda$instantTeleportInMyTerritory$1:(IIIILext/mods/gameserver/model/actor/Player;)V
  #551 = MethodType         #552          //  (Lext/mods/gameserver/model/actor/Player;)V
  #552 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
  #553 = MethodHandle       6:#554        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #554 = Methodref          #555.#556     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #555 = Class              #557          // java/lang/invoke/StringConcatFactory
  #556 = NameAndType        #54:#558      // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #557 = Utf8               java/lang/invoke/StringConcatFactory
  #558 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #559 = MethodHandle       6:#560        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #560 = Methodref          #561.#562     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #561 = Class              #563          // java/lang/invoke/LambdaMetafactory
  #562 = NameAndType        #564:#565     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #563 = Utf8               java/lang/invoke/LambdaMetafactory
  #564 = Utf8               metafactory
  #565 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #566 = Utf8               InnerClasses
  #567 = Class              #568          // java/lang/invoke/MethodHandles$Lookup
  #568 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #569 = Class              #570          // java/lang/invoke/MethodHandles
  #570 = Utf8               java/lang/invoke/MethodHandles
  #571 = Utf8               Lookup
{
  protected static final ext.mods.commons.logging.CLogger LOGGER;
    descriptor: Lext/mods/commons/logging/CLogger;
    flags: (0x001c) ACC_PROTECTED, ACC_STATIC, ACC_FINAL

  protected final ext.mods.gameserver.model.actor.template.NpcTemplate _template;
    descriptor: Lext/mods/gameserver/model/actor/template/NpcTemplate;
    flags: (0x0014) ACC_PROTECTED, ACC_FINAL

  protected final java.lang.reflect.Constructor<?> _constructor;
    descriptor: Ljava/lang/reflect/Constructor;
    flags: (0x0014) ACC_PROTECTED, ACC_FINAL
    Signature: #435                         // Ljava/lang/reflect/Constructor<*>;

  protected int _respawnDelay;
    descriptor: I
    flags: (0x0004) ACC_PROTECTED

  protected int _respawnRandom;
    descriptor: I
    flags: (0x0004) ACC_PROTECTED

  protected boolean _dbLoaded;
    descriptor: Z
    flags: (0x0004) ACC_PROTECTED

  protected java.util.List<ext.mods.gameserver.model.records.PrivateData> _privateData;
    descriptor: Ljava/util/List;
    flags: (0x0004) ACC_PROTECTED
    Signature: #436                         // Ljava/util/List<Lext/mods/gameserver/model/records/PrivateData;>;

  protected ext.mods.gameserver.model.memo.SpawnMemo _aiParams;
    descriptor: Lext/mods/gameserver/model/memo/SpawnMemo;
    flags: (0x0004) ACC_PROTECTED

  protected ext.mods.gameserver.model.spawn.SpawnData _spawnData;
    descriptor: Lext/mods/gameserver/model/spawn/SpawnData;
    flags: (0x0004) ACC_PROTECTED

  protected ext.mods.gameserver.model.spawn.ASpawn(int) throws java.lang.SecurityException, java.lang.ClassNotFoundException, java.lang.NoSuchMethodException, java.io.InvalidClassException;
    descriptor: (I)V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=6, locals=3, args_size=2
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: invokestatic  #7                  // Method java/util/Collections.emptyList:()Ljava/util/List;
         8: putfield      #13                 // Field _privateData:Ljava/util/List;
        11: aload_0
        12: getstatic     #19                 // Field ext/mods/gameserver/model/memo/SpawnMemo.DUMMY_SET:Lext/mods/gameserver/model/memo/SpawnMemo;
        15: putfield      #25                 // Field _aiParams:Lext/mods/gameserver/model/memo/SpawnMemo;
        18: aload_0
        19: invokestatic  #28                 // Method ext/mods/gameserver/data/xml/NpcData.getInstance:()Lext/mods/gameserver/data/xml/NpcData;
        22: iload_1
        23: invokevirtual #34                 // Method ext/mods/gameserver/data/xml/NpcData.getTemplate:(I)Lext/mods/gameserver/model/actor/template/NpcTemplate;
        26: putfield      #38                 // Field _template:Lext/mods/gameserver/model/actor/template/NpcTemplate;
        29: aload_0
        30: getfield      #38                 // Field _template:Lext/mods/gameserver/model/actor/template/NpcTemplate;
        33: ifnonnull     42
        36: aload_0
        37: aconst_null
        38: putfield      #42                 // Field _constructor:Ljava/lang/reflect/Constructor;
        41: return
        42: aload_0
        43: getfield      #38                 // Field _template:Lext/mods/gameserver/model/actor/template/NpcTemplate;
        46: invokevirtual #46                 // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getType:()Ljava/lang/String;
        49: invokedynamic #52,  0             // InvokeDynamic #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
        54: invokestatic  #56                 // Method java/lang/Class.forName:(Ljava/lang/String;)Ljava/lang/Class;
        57: astore_2
        58: ldc           #62                 // class ext/mods/gameserver/model/actor/Npc
        60: aload_2
        61: invokevirtual #64                 // Method java/lang/Class.isAssignableFrom:(Ljava/lang/Class;)Z
        64: ifne          87
        67: new           #68                 // class java/io/InvalidClassException
        70: dup
        71: aload_0
        72: getfield      #38                 // Field _template:Lext/mods/gameserver/model/actor/template/NpcTemplate;
        75: invokevirtual #46                 // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getType:()Ljava/lang/String;
        78: invokedynamic #70,  0             // InvokeDynamic #1:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
        83: invokespecial #71                 // Method java/io/InvalidClassException."<init>":(Ljava/lang/String;)V
        86: athrow
        87: aload_0
        88: aload_2
        89: iconst_2
        90: anewarray     #57                 // class java/lang/Class
        93: dup
        94: iconst_0
        95: getstatic     #74                 // Field java/lang/Integer.TYPE:Ljava/lang/Class;
        98: aastore
        99: dup
       100: iconst_1
       101: ldc           #47                 // class ext/mods/gameserver/model/actor/template/NpcTemplate
       103: aastore
       104: invokevirtual #80                 // Method java/lang/Class.getConstructor:([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
       107: putfield      #42                 // Field _constructor:Ljava/lang/reflect/Constructor;
       110: return
      LineNumberTable:
        line 70: 0
        line 63: 4
        line 65: 11
        line 71: 18
        line 72: 29
        line 74: 36
        line 75: 41
        line 78: 42
        line 79: 58
        line 81: 67
        line 84: 87
        line 85: 110
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     111     0  this   Lext/mods/gameserver/model/spawn/ASpawn;
            0     111     1    id   I
           58      53     2 clazz   Ljava/lang/Class;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
           58      53     2 clazz   Ljava/lang/Class<*>;
      StackMapTable: number_of_entries = 2
        frame_type = 255 /* full_frame */
          offset_delta = 42
          locals = [ class ext/mods/gameserver/model/spawn/ASpawn, int ]
          stack = []
        frame_type = 252 /* append */
          offset_delta = 44
          locals = [ class java/lang/Class ]
    Exceptions:
      throws java.lang.SecurityException, java.lang.ClassNotFoundException, java.lang.NoSuchMethodException, java.io.InvalidClassException

  protected ext.mods.gameserver.model.spawn.ASpawn(ext.mods.gameserver.model.actor.template.NpcTemplate) throws java.lang.SecurityException, java.lang.ClassNotFoundException, java.lang.NoSuchMethodException, java.io.InvalidClassException;
    descriptor: (Lext/mods/gameserver/model/actor/template/NpcTemplate;)V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=6, locals=3, args_size=2
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: invokestatic  #7                  // Method java/util/Collections.emptyList:()Ljava/util/List;
         8: putfield      #13                 // Field _privateData:Ljava/util/List;
        11: aload_0
        12: getstatic     #19                 // Field ext/mods/gameserver/model/memo/SpawnMemo.DUMMY_SET:Lext/mods/gameserver/model/memo/SpawnMemo;
        15: putfield      #25                 // Field _aiParams:Lext/mods/gameserver/model/memo/SpawnMemo;
        18: aload_0
        19: aload_1
        20: putfield      #38                 // Field _template:Lext/mods/gameserver/model/actor/template/NpcTemplate;
        23: aload_0
        24: getfield      #38                 // Field _template:Lext/mods/gameserver/model/actor/template/NpcTemplate;
        27: ifnonnull     36
        30: aload_0
        31: aconst_null
        32: putfield      #42                 // Field _constructor:Ljava/lang/reflect/Constructor;
        35: return
        36: aload_0
        37: getfield      #38                 // Field _template:Lext/mods/gameserver/model/actor/template/NpcTemplate;
        40: invokevirtual #46                 // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getType:()Ljava/lang/String;
        43: invokedynamic #52,  0             // InvokeDynamic #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
        48: invokestatic  #56                 // Method java/lang/Class.forName:(Ljava/lang/String;)Ljava/lang/Class;
        51: astore_2
        52: ldc           #62                 // class ext/mods/gameserver/model/actor/Npc
        54: aload_2
        55: invokevirtual #64                 // Method java/lang/Class.isAssignableFrom:(Ljava/lang/Class;)Z
        58: ifne          81
        61: new           #68                 // class java/io/InvalidClassException
        64: dup
        65: aload_0
        66: getfield      #38                 // Field _template:Lext/mods/gameserver/model/actor/template/NpcTemplate;
        69: invokevirtual #46                 // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getType:()Ljava/lang/String;
        72: invokedynamic #70,  0             // InvokeDynamic #1:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
        77: invokespecial #71                 // Method java/io/InvalidClassException."<init>":(Ljava/lang/String;)V
        80: athrow
        81: aload_0
        82: aload_2
        83: iconst_2
        84: anewarray     #57                 // class java/lang/Class
        87: dup
        88: iconst_0
        89: getstatic     #74                 // Field java/lang/Integer.TYPE:Ljava/lang/Class;
        92: aastore
        93: dup
        94: iconst_1
        95: ldc           #47                 // class ext/mods/gameserver/model/actor/template/NpcTemplate
        97: aastore
        98: invokevirtual #80                 // Method java/lang/Class.getConstructor:([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
       101: putfield      #42                 // Field _constructor:Ljava/lang/reflect/Constructor;
       104: return
      LineNumberTable:
        line 88: 0
        line 63: 4
        line 65: 11
        line 89: 18
        line 90: 23
        line 92: 30
        line 93: 35
        line 96: 36
        line 97: 52
        line 99: 61
        line 102: 81
        line 103: 104
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     105     0  this   Lext/mods/gameserver/model/spawn/ASpawn;
            0     105     1 template   Lext/mods/gameserver/model/actor/template/NpcTemplate;
           52      53     2 clazz   Ljava/lang/Class;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
           52      53     2 clazz   Ljava/lang/Class<*>;
      StackMapTable: number_of_entries = 2
        frame_type = 255 /* full_frame */
          offset_delta = 36
          locals = [ class ext/mods/gameserver/model/spawn/ASpawn, class ext/mods/gameserver/model/actor/template/NpcTemplate ]
          stack = []
        frame_type = 252 /* append */
          offset_delta = 44
          locals = [ class java/lang/Class ]
    Exceptions:
      throws java.lang.SecurityException, java.lang.ClassNotFoundException, java.lang.NoSuchMethodException, java.io.InvalidClassException

  public final ext.mods.gameserver.model.actor.template.NpcTemplate getTemplate();
    descriptor: ()Lext/mods/gameserver/model/actor/template/NpcTemplate;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #38                 // Field _template:Lext/mods/gameserver/model/actor/template/NpcTemplate;
         4: areturn
      LineNumberTable:
        line 110: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/spawn/ASpawn;

  public final int getNpcId();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #38                 // Field _template:Lext/mods/gameserver/model/actor/template/NpcTemplate;
         4: invokevirtual #84                 // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getNpcId:()I
         7: ireturn
      LineNumberTable:
        line 118: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/spawn/ASpawn;

  public final void setRespawnDelay(int);
    descriptor: (I)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: iconst_0
         2: iload_1
         3: invokestatic  #88                 // Method java/lang/Math.max:(II)I
         6: putfield      #94                 // Field _respawnDelay:I
         9: return
      LineNumberTable:
        line 127: 0
        line 128: 9
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/gameserver/model/spawn/ASpawn;
            0      10     1 delay   I

  public final int getRespawnDelay();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #94                 // Field _respawnDelay:I
         4: ireturn
      LineNumberTable:
        line 135: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/spawn/ASpawn;

  public final void setRespawnRandom(int);
    descriptor: (I)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=5, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: i2l
         3: iconst_0
         4: aload_0
         5: getfield      #94                 // Field _respawnDelay:I
         8: invokestatic  #98                 // Method java/lang/Math.clamp:(JII)I
        11: putfield      #102                // Field _respawnRandom:I
        14: return
      LineNumberTable:
        line 144: 0
        line 145: 14
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      15     0  this   Lext/mods/gameserver/model/spawn/ASpawn;
            0      15     1 random   I

  public final int getRespawnRandom();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #102                // Field _respawnRandom:I
         4: ireturn
      LineNumberTable:
        line 152: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/spawn/ASpawn;

  public long calculateRespawnDelay();
    descriptor: ()J
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=1
         0: aload_0
         1: getfield      #94                 // Field _respawnDelay:I
         4: istore_1
         5: aload_0
         6: getfield      #102                // Field _respawnRandom:I
         9: ifle          27
        12: iload_1
        13: aload_0
        14: getfield      #102                // Field _respawnRandom:I
        17: ineg
        18: aload_0
        19: getfield      #102                // Field _respawnRandom:I
        22: invokestatic  #105                // Method ext/mods/commons/random/Rnd.get:(II)I
        25: iadd
        26: istore_1
        27: iload_1
        28: i2l
        29: lreturn
      LineNumberTable:
        line 160: 0
        line 162: 5
        line 163: 12
        line 165: 27
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      30     0  this   Lext/mods/gameserver/model/spawn/ASpawn;
            5      25     1 respawnTime   I
      StackMapTable: number_of_entries = 1
        frame_type = 252 /* append */
          offset_delta = 27
          locals = [ int ]

  protected final long calculateBossRespawnDelayMs(ext.mods.gameserver.model.actor.Npc);
    descriptor: (Lext/mods/gameserver/model/actor/Npc;)J
    flags: (0x0014) ACC_PROTECTED, ACC_FINAL
    Code:
      stack=6, locals=11, args_size=2
         0: aload_1
         1: ifnull        11
         4: aload_1
         5: invokevirtual #110                // Method ext/mods/gameserver/model/actor/Npc.isRaidBoss:()Z
         8: ifne          13
        11: lconst_0
        12: lreturn
        13: getstatic     #114                // Field ext/mods/Config.USE_CONFIG_RAID_GRAND_BOSS_RESPAWN:Z
        16: ifne          21
        19: lconst_0
        20: lreturn
        21: aload_1
        22: instanceof    #120                // class ext/mods/gameserver/model/actor/instance/GrandBoss
        25: istore_2
        26: iload_2
        27: ifeq          36
        30: getstatic     #122                // Field ext/mods/Config.GRAND_BOSS_RESPAWN_OVERRIDES:Ljava/util/Map;
        33: goto          39
        36: getstatic     #126                // Field ext/mods/Config.RAID_BOSS_RESPAWN_OVERRIDES:Ljava/util/Map;
        39: astore_3
        40: aload_3
        41: ifnonnull     48
        44: aconst_null
        45: goto          64
        48: aload_3
        49: aload_1
        50: invokevirtual #129                // Method ext/mods/gameserver/model/actor/Npc.getNpcId:()I
        53: invokestatic  #130                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        56: invokeinterface #134,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        61: checkcast     #139                // class "[J"
        64: astore        4
        66: aload         4
        68: ifnull        78
        71: aload         4
        73: iconst_0
        74: laload
        75: goto          91
        78: iload_2
        79: ifeq          88
        82: getstatic     #141                // Field ext/mods/Config.GRAND_BOSS_RESPAWN_BASE_MS:J
        85: goto          91
        88: getstatic     #145                // Field ext/mods/Config.RAID_BOSS_RESPAWN_BASE_MS:J
        91: lstore        5
        93: aload         4
        95: ifnull        105
        98: aload         4
       100: iconst_1
       101: laload
       102: goto          118
       105: iload_2
       106: ifeq          115
       109: getstatic     #148                // Field ext/mods/Config.GRAND_BOSS_RESPAWN_RANDOM_MS:J
       112: goto          118
       115: getstatic     #151                // Field ext/mods/Config.RAID_BOSS_RESPAWN_RANDOM_MS:J
       118: lstore        7
       120: lload         5
       122: lconst_0
       123: lcmp
       124: ifgt          129
       127: lconst_0
       128: lreturn
       129: lload         7
       131: lconst_0
       132: lcmp
       133: ifle          147
       136: lload         7
       138: lneg
       139: lload         7
       141: invokestatic  #154                // Method ext/mods/commons/random/Rnd.get:(JJ)J
       144: goto          148
       147: lconst_0
       148: lstore        9
       150: lload         5
       152: lload         5
       154: lload         9
       156: ladd
       157: invokestatic  #157                // Method java/lang/Math.max:(JJ)J
       160: lreturn
      LineNumberTable:
        line 170: 0
        line 171: 11
        line 172: 13
        line 173: 19
        line 175: 21
        line 176: 26
        line 177: 40
        line 178: 66
        line 179: 93
        line 180: 120
        line 181: 127
        line 183: 129
        line 184: 150
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     161     0  this   Lext/mods/gameserver/model/spawn/ASpawn;
            0     161     1   npc   Lext/mods/gameserver/model/actor/Npc;
           26     135     2 isGrandBoss   Z
           40     121     3 overrides   Ljava/util/Map;
           66      95     4 override   [J
           93      68     5 baseMs   J
          120      41     7 randomMs   J
          150      11     9 offset   J
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
           40     121     3 overrides   Ljava/util/Map<Ljava/lang/Integer;[J>;
      StackMapTable: number_of_entries = 16
        frame_type = 11 /* same */
        frame_type = 1 /* same */
        frame_type = 7 /* same */
        frame_type = 252 /* append */
          offset_delta = 14
          locals = [ int ]
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/util/Map ]
        frame_type = 252 /* append */
          offset_delta = 8
          locals = [ class java/util/Map ]
        frame_type = 79 /* same_locals_1_stack_item */
          stack = [ class "[J" ]
        frame_type = 252 /* append */
          offset_delta = 13
          locals = [ class "[J" ]
        frame_type = 9 /* same */
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ long ]
        frame_type = 252 /* append */
          offset_delta = 13
          locals = [ long ]
        frame_type = 9 /* same */
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ long ]
        frame_type = 252 /* append */
          offset_delta = 10
          locals = [ long ]
        frame_type = 17 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ long ]

  public final ext.mods.gameserver.model.spawn.SpawnData getSpawnData();
    descriptor: ()Lext/mods/gameserver/model/spawn/SpawnData;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #159                // Field _spawnData:Lext/mods/gameserver/model/spawn/SpawnData;
         4: areturn
      LineNumberTable:
        line 192: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/spawn/ASpawn;

  public final java.util.List<ext.mods.gameserver.model.records.PrivateData> getPrivateData();
    descriptor: ()Ljava/util/List;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field _privateData:Ljava/util/List;
         4: areturn
      LineNumberTable:
        line 200: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/spawn/ASpawn;
    Signature: #478                         // ()Ljava/util/List<Lext/mods/gameserver/model/records/PrivateData;>;

  public final ext.mods.gameserver.model.location.Location getFleeLocation();
    descriptor: ()Lext/mods/gameserver/model/location/Location;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=5, locals=4, args_size=1
         0: aload_0
         1: getfield      #25                 // Field _aiParams:Lext/mods/gameserver/model/memo/SpawnMemo;
         4: ldc           #163                // String flee_x
         6: iconst_0
         7: invokevirtual #165                // Method ext/mods/gameserver/model/memo/SpawnMemo.getInteger:(Ljava/lang/String;I)I
        10: istore_1
        11: aload_0
        12: getfield      #25                 // Field _aiParams:Lext/mods/gameserver/model/memo/SpawnMemo;
        15: ldc           #169                // String flee_y
        17: iconst_0
        18: invokevirtual #165                // Method ext/mods/gameserver/model/memo/SpawnMemo.getInteger:(Ljava/lang/String;I)I
        21: istore_2
        22: aload_0
        23: getfield      #25                 // Field _aiParams:Lext/mods/gameserver/model/memo/SpawnMemo;
        26: ldc           #171                // String flee_z
        28: iconst_0
        29: invokevirtual #165                // Method ext/mods/gameserver/model/memo/SpawnMemo.getInteger:(Ljava/lang/String;I)I
        32: istore_3
        33: iload_1
        34: ifne          47
        37: iload_2
        38: ifne          47
        41: iload_3
        42: ifne          47
        45: aconst_null
        46: areturn
        47: new           #173                // class ext/mods/gameserver/model/location/Location
        50: dup
        51: iload_1
        52: iload_2
        53: iload_3
        54: invokespecial #175                // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
        57: areturn
      LineNumberTable:
        line 209: 0
        line 210: 11
        line 211: 22
        line 213: 33
        line 214: 45
        line 216: 47
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      58     0  this   Lext/mods/gameserver/model/spawn/ASpawn;
           11      47     1 fleeX   I
           22      36     2 fleeY   I
           33      25     3 fleeZ   I
      StackMapTable: number_of_entries = 1
        frame_type = 254 /* append */
          offset_delta = 47
          locals = [ int, int, int ]

  public final ext.mods.gameserver.model.memo.SpawnMemo getMemo();
    descriptor: ()Lext/mods/gameserver/model/memo/SpawnMemo;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #25                 // Field _aiParams:Lext/mods/gameserver/model/memo/SpawnMemo;
         4: areturn
      LineNumberTable:
        line 221: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/spawn/ASpawn;

  public abstract ext.mods.gameserver.model.actor.Npc getNpc();
    descriptor: ()Lext/mods/gameserver/model/actor/Npc;
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT

  public abstract ext.mods.gameserver.model.location.SpawnLocation getSpawnLocation();
    descriptor: ()Lext/mods/gameserver/model/location/SpawnLocation;
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT

  public abstract ext.mods.gameserver.model.location.Location getRandomWalkLocation(ext.mods.gameserver.model.actor.Npc, int);
    descriptor: (Lext/mods/gameserver/model/actor/Npc;I)Lext/mods/gameserver/model/location/Location;
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT

  public abstract boolean isInMyTerritory(ext.mods.gameserver.model.WorldObject);
    descriptor: (Lext/mods/gameserver/model/WorldObject;)Z
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT

  public abstract java.lang.String getDescription();
    descriptor: ()Ljava/lang/String;
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT

  public abstract void updateSpawnData();
    descriptor: ()V
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT

  public abstract void sendScriptEvent(int, int, int);
    descriptor: (III)V
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT

  public ext.mods.gameserver.model.actor.Npc doSpawn(boolean, ext.mods.gameserver.model.actor.Creature, java.lang.Integer);
    descriptor: (ZLext/mods/gameserver/model/actor/Creature;Ljava/lang/Integer;)Lext/mods/gameserver/model/actor/Npc;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=7, locals=5, args_size=4
         0: aload_0
         1: getfield      #42                 // Field _constructor:Ljava/lang/reflect/Constructor;
         4: iconst_2
         5: anewarray     #2                  // class java/lang/Object
         8: dup
         9: iconst_0
        10: invokestatic  #178                // Method ext/mods/gameserver/idfactory/IdFactory.getInstance:()Lext/mods/gameserver/idfactory/IdFactory;
        13: invokevirtual #183                // Method ext/mods/gameserver/idfactory/IdFactory.getNextId:()I
        16: invokestatic  #130                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        19: aastore
        20: dup
        21: iconst_1
        22: aload_0
        23: getfield      #38                 // Field _template:Lext/mods/gameserver/model/actor/template/NpcTemplate;
        26: aastore
        27: invokevirtual #186                // Method java/lang/reflect/Constructor.newInstance:([Ljava/lang/Object;)Ljava/lang/Object;
        30: checkcast     #62                 // class ext/mods/gameserver/model/actor/Npc
        33: astore        4
        35: aload_2
        36: ifnull        45
        39: aload         4
        41: aload_2
        42: putfield      #192                // Field ext/mods/gameserver/model/actor/Npc._summoner:Lext/mods/gameserver/model/actor/Creature;
        45: aload_3
        46: ifnull        58
        49: aload         4
        51: aload_3
        52: invokevirtual #196                // Method java/lang/Integer.intValue:()I
        55: invokevirtual #199                // Method ext/mods/gameserver/model/actor/Npc.setClanId:(I)V
        58: aload         4
        60: aload_0
        61: invokevirtual #203                // Method ext/mods/gameserver/model/actor/Npc.setSpawn:(Lext/mods/gameserver/model/spawn/ASpawn;)V
        64: aload         4
        66: iload_1
        67: invokevirtual #207                // Method ext/mods/gameserver/model/actor/Npc.setShowSummonAnimation:(Z)V
        70: aload_0
        71: aload         4
        73: invokevirtual #211                // Method initializeAndSpawn:(Lext/mods/gameserver/model/actor/Npc;)Lext/mods/gameserver/model/actor/Npc;
        76: areturn
        77: astore        4
        79: getstatic     #217                // Field LOGGER:Lext/mods/commons/logging/CLogger;
        82: ldc           #221                // String Error during spawn, NPC id={}
        84: aload         4
        86: iconst_1
        87: anewarray     #2                  // class java/lang/Object
        90: dup
        91: iconst_0
        92: aload_0
        93: getfield      #38                 // Field _template:Lext/mods/gameserver/model/actor/template/NpcTemplate;
        96: invokevirtual #84                 // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getNpcId:()I
        99: invokestatic  #130                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       102: aastore
       103: invokevirtual #223                // Method ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
       106: aconst_null
       107: areturn
      Exception table:
         from    to  target type
             0    76    77   Class java/lang/Exception
      LineNumberTable:
        line 278: 0
        line 280: 35
        line 281: 39
        line 283: 45
        line 284: 49
        line 286: 58
        line 287: 64
        line 289: 70
        line 291: 77
        line 293: 79
        line 294: 106
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           35      42     4   npc   Lext/mods/gameserver/model/actor/Npc;
           79      29     4     e   Ljava/lang/Exception;
            0     108     0  this   Lext/mods/gameserver/model/spawn/ASpawn;
            0     108     1 isSummonSpawn   Z
            0     108     2 summoner   Lext/mods/gameserver/model/actor/Creature;
            0     108     3 clanId   Ljava/lang/Integer;
      StackMapTable: number_of_entries = 3
        frame_type = 252 /* append */
          offset_delta = 45
          locals = [ class ext/mods/gameserver/model/actor/Npc ]
        frame_type = 12 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 18
          locals = [ class ext/mods/gameserver/model/spawn/ASpawn, int, class ext/mods/gameserver/model/actor/Creature, class java/lang/Integer ]
          stack = [ class java/lang/Exception ]

  public ext.mods.gameserver.model.actor.Npc doSpawn(boolean, ext.mods.gameserver.model.actor.Creature);
    descriptor: (ZLext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/model/actor/Npc;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=7, locals=4, args_size=3
         0: aload_0
         1: getfield      #42                 // Field _constructor:Ljava/lang/reflect/Constructor;
         4: iconst_2
         5: anewarray     #2                  // class java/lang/Object
         8: dup
         9: iconst_0
        10: invokestatic  #178                // Method ext/mods/gameserver/idfactory/IdFactory.getInstance:()Lext/mods/gameserver/idfactory/IdFactory;
        13: invokevirtual #183                // Method ext/mods/gameserver/idfactory/IdFactory.getNextId:()I
        16: invokestatic  #130                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        19: aastore
        20: dup
        21: iconst_1
        22: aload_0
        23: getfield      #38                 // Field _template:Lext/mods/gameserver/model/actor/template/NpcTemplate;
        26: aastore
        27: invokevirtual #186                // Method java/lang/reflect/Constructor.newInstance:([Ljava/lang/Object;)Ljava/lang/Object;
        30: checkcast     #62                 // class ext/mods/gameserver/model/actor/Npc
        33: astore_3
        34: aload_2
        35: ifnull        43
        38: aload_3
        39: aload_2
        40: putfield      #192                // Field ext/mods/gameserver/model/actor/Npc._summoner:Lext/mods/gameserver/model/actor/Creature;
        43: aload_3
        44: aload_0
        45: invokevirtual #203                // Method ext/mods/gameserver/model/actor/Npc.setSpawn:(Lext/mods/gameserver/model/spawn/ASpawn;)V
        48: aload_3
        49: iload_1
        50: invokevirtual #207                // Method ext/mods/gameserver/model/actor/Npc.setShowSummonAnimation:(Z)V
        53: aload_0
        54: aload_3
        55: invokevirtual #211                // Method initializeAndSpawn:(Lext/mods/gameserver/model/actor/Npc;)Lext/mods/gameserver/model/actor/Npc;
        58: areturn
        59: astore_3
        60: getstatic     #217                // Field LOGGER:Lext/mods/commons/logging/CLogger;
        63: ldc           #221                // String Error during spawn, NPC id={}
        65: aload_3
        66: iconst_1
        67: anewarray     #2                  // class java/lang/Object
        70: dup
        71: iconst_0
        72: aload_0
        73: getfield      #38                 // Field _template:Lext/mods/gameserver/model/actor/template/NpcTemplate;
        76: invokevirtual #84                 // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getNpcId:()I
        79: invokestatic  #130                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        82: aastore
        83: invokevirtual #223                // Method ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
        86: aconst_null
        87: areturn
      Exception table:
         from    to  target type
             0    58    59   Class java/lang/Exception
      LineNumberTable:
        line 313: 0
        line 315: 34
        line 316: 38
        line 318: 43
        line 319: 48
        line 321: 53
        line 323: 59
        line 325: 60
        line 326: 86
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           34      25     3   npc   Lext/mods/gameserver/model/actor/Npc;
           60      28     3     e   Ljava/lang/Exception;
            0      88     0  this   Lext/mods/gameserver/model/spawn/ASpawn;
            0      88     1 isSummonSpawn   Z
            0      88     2 summoner   Lext/mods/gameserver/model/actor/Creature;
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 43
          locals = [ class ext/mods/gameserver/model/actor/Npc ]
        frame_type = 255 /* full_frame */
          offset_delta = 15
          locals = [ class ext/mods/gameserver/model/spawn/ASpawn, int, class ext/mods/gameserver/model/actor/Creature ]
          stack = [ class java/lang/Exception ]

  public ext.mods.gameserver.model.actor.Npc doSpawn(boolean);
    descriptor: (Z)Lext/mods/gameserver/model/actor/Npc;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: aconst_null
         3: invokevirtual #229                // Method doSpawn:(ZLext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/model/actor/Npc;
         6: areturn
      LineNumberTable:
        line 332: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/model/spawn/ASpawn;
            0       7     1 isSummonSpawn   Z

  public void onSpawn(ext.mods.gameserver.model.actor.Npc);
    descriptor: (Lext/mods/gameserver/model/actor/Npc;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=0, locals=2, args_size=2
         0: return
      LineNumberTable:
        line 341: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       1     0  this   Lext/mods/gameserver/model/spawn/ASpawn;
            0       1     1   npc   Lext/mods/gameserver/model/actor/Npc;

  public abstract void doDelete();
    descriptor: ()V
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT

  public void onDecay(ext.mods.gameserver.model.actor.Npc);
    descriptor: (Lext/mods/gameserver/model/actor/Npc;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=0, locals=2, args_size=2
         0: return
      LineNumberTable:
        line 354: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       1     0  this   Lext/mods/gameserver/model/spawn/ASpawn;
            0       1     1   npc   Lext/mods/gameserver/model/actor/Npc;

  public void doRespawn(ext.mods.gameserver.model.actor.Npc);
    descriptor: (Lext/mods/gameserver/model/actor/Npc;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_1
         1: invokevirtual #233                // Method ext/mods/gameserver/model/actor/Npc.cancelRespawn:()V
         4: aload_0
         5: getfield      #159                // Field _spawnData:Lext/mods/gameserver/model/spawn/SpawnData;
         8: ifnull        18
        11: aload_0
        12: getfield      #159                // Field _spawnData:Lext/mods/gameserver/model/spawn/SpawnData;
        15: invokevirtual #236                // Method ext/mods/gameserver/model/spawn/SpawnData.cancelRespawn:()V
        18: aload_1
        19: invokevirtual #239                // Method ext/mods/gameserver/model/actor/Npc.isDecayed:()Z
        22: ifeq          35
        25: aload_1
        26: invokevirtual #242                // Method ext/mods/gameserver/model/actor/Npc.refreshID:()V
        29: aload_0
        30: aload_1
        31: invokevirtual #211                // Method initializeAndSpawn:(Lext/mods/gameserver/model/actor/Npc;)Lext/mods/gameserver/model/actor/Npc;
        34: pop
        35: return
      LineNumberTable:
        line 362: 0
        line 364: 4
        line 365: 11
        line 367: 18
        line 369: 25
        line 371: 29
        line 373: 35
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      36     0  this   Lext/mods/gameserver/model/spawn/ASpawn;
            0      36     1   npc   Lext/mods/gameserver/model/actor/Npc;
      StackMapTable: number_of_entries = 2
        frame_type = 18 /* same */
        frame_type = 16 /* same */

  public void instantTeleportInMyTerritory(int, int, int, int);
    descriptor: (IIII)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=5, args_size=5
         0: invokestatic  #245                // Method ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
         3: invokevirtual #250                // Method ext/mods/gameserver/model/World.getPlayers:()Ljava/util/Collection;
         6: invokeinterface #254,  1          // InterfaceMethod java/util/Collection.stream:()Ljava/util/stream/Stream;
        11: aload_0
        12: invokedynamic #260,  0            // InvokeDynamic #2:test:(Lext/mods/gameserver/model/spawn/ASpawn;)Ljava/util/function/Predicate;
        17: invokeinterface #264,  2          // InterfaceMethod java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
        22: iload_1
        23: iload_2
        24: iload_3
        25: iload         4
        27: invokedynamic #270,  0            // InvokeDynamic #3:accept:(IIII)Ljava/util/function/Consumer;
        32: invokeinterface #274,  2          // InterfaceMethod java/util/stream/Stream.forEach:(Ljava/util/function/Consumer;)V
        37: return
      LineNumberTable:
        line 384: 0
        line 385: 37
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      38     0  this   Lext/mods/gameserver/model/spawn/ASpawn;
            0      38     1     x   I
            0      38     2     y   I
            0      38     3     z   I
            0      38     4 offset   I

  public void instantTeleportInMyTerritory(int, int, int);
    descriptor: (III)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=4, args_size=4
         0: aload_0
         1: iload_1
         2: iload_2
         3: iload_3
         4: iconst_0
         5: invokevirtual #278                // Method instantTeleportInMyTerritory:(IIII)V
         8: return
      LineNumberTable:
        line 395: 0
        line 396: 8
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       9     0  this   Lext/mods/gameserver/model/spawn/ASpawn;
            0       9     1     x   I
            0       9     2     y   I
            0       9     3     z   I

  public void instantTeleportInMyTerritory(ext.mods.gameserver.model.location.Location, int);
    descriptor: (Lext/mods/gameserver/model/location/Location;I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: invokevirtual #282                // Method ext/mods/gameserver/model/location/Location.getX:()I
         5: aload_1
         6: invokevirtual #285                // Method ext/mods/gameserver/model/location/Location.getY:()I
         9: aload_1
        10: invokevirtual #288                // Method ext/mods/gameserver/model/location/Location.getZ:()I
        13: iload_2
        14: invokevirtual #278                // Method instantTeleportInMyTerritory:(IIII)V
        17: return
      LineNumberTable:
        line 406: 0
        line 407: 17
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      18     0  this   Lext/mods/gameserver/model/spawn/ASpawn;
            0      18     1   loc   Lext/mods/gameserver/model/location/Location;
            0      18     2 offset   I

  public void instantTeleportInMyTerritory(ext.mods.gameserver.model.location.Location);
    descriptor: (Lext/mods/gameserver/model/location/Location;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokevirtual #282                // Method ext/mods/gameserver/model/location/Location.getX:()I
         5: aload_1
         6: invokevirtual #285                // Method ext/mods/gameserver/model/location/Location.getY:()I
         9: aload_1
        10: invokevirtual #288                // Method ext/mods/gameserver/model/location/Location.getZ:()I
        13: iconst_0
        14: invokevirtual #278                // Method instantTeleportInMyTerritory:(IIII)V
        17: return
      LineNumberTable:
        line 416: 0
        line 417: 17
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      18     0  this   Lext/mods/gameserver/model/spawn/ASpawn;
            0      18     1   loc   Lext/mods/gameserver/model/location/Location;

  public ext.mods.gameserver.model.actor.Npc initializeAndSpawn(ext.mods.gameserver.model.actor.Npc);
    descriptor: (Lext/mods/gameserver/model/actor/Npc;)Lext/mods/gameserver/model/actor/Npc;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=7, args_size=2
         0: aload_0
         1: getfield      #159                // Field _spawnData:Lext/mods/gameserver/model/spawn/SpawnData;
         4: ifnull        58
         7: aload_0
         8: getfield      #159                // Field _spawnData:Lext/mods/gameserver/model/spawn/SpawnData;
        11: invokevirtual #291                // Method ext/mods/gameserver/model/spawn/SpawnData.checkDead:()Z
        14: ifeq          58
        17: aload_1
        18: invokevirtual #294                // Method ext/mods/gameserver/model/actor/Npc.getStatus:()Lext/mods/gameserver/model/actor/status/NpcStatus;
        21: dconst_0
        22: invokevirtual #298                // Method ext/mods/gameserver/model/actor/status/NpcStatus.setHp:(D)V
        25: aload_1
        26: iconst_1
        27: invokevirtual #304                // Method ext/mods/gameserver/model/actor/Npc.setIsDead:(Z)V
        30: aload_1
        31: iconst_1
        32: invokevirtual #307                // Method ext/mods/gameserver/model/actor/Npc.setDecayed:(Z)V
        35: aload_1
        36: aload_0
        37: getfield      #159                // Field _spawnData:Lext/mods/gameserver/model/spawn/SpawnData;
        40: invokevirtual #310                // Method ext/mods/gameserver/model/spawn/SpawnData.getRespawnTime:()J
        43: invokestatic  #314                // Method java/lang/System.currentTimeMillis:()J
        46: lsub
        47: invokevirtual #319                // Method ext/mods/gameserver/model/actor/Npc.scheduleDBRespawn:(J)V
        50: aload_0
        51: iconst_0
        52: putfield      #323                // Field _dbLoaded:Z
        55: goto          287
        58: aload_1
        59: invokevirtual #326                // Method ext/mods/gameserver/model/actor/Npc.stopAllEffects:()V
        62: aload_1
        63: iconst_0
        64: invokevirtual #329                // Method ext/mods/gameserver/model/actor/Npc.setScriptValue:(I)V
        67: aload_1
        68: iconst_0
        69: invokevirtual #304                // Method ext/mods/gameserver/model/actor/Npc.setIsDead:(Z)V
        72: aload_1
        73: iconst_0
        74: invokevirtual #307                // Method ext/mods/gameserver/model/actor/Npc.setDecayed:(Z)V
        77: aload_1
        78: invokevirtual #294                // Method ext/mods/gameserver/model/actor/Npc.getStatus:()Lext/mods/gameserver/model/actor/status/NpcStatus;
        81: invokevirtual #332                // Method ext/mods/gameserver/model/actor/status/NpcStatus.initializeValues:()V
        84: aload_0
        85: invokevirtual #335                // Method getSpawnLocation:()Lext/mods/gameserver/model/location/SpawnLocation;
        88: astore_2
        89: aload_2
        90: ifnonnull     112
        93: getstatic     #217                // Field LOGGER:Lext/mods/commons/logging/CLogger;
        96: ldc_w         #339                // String {} misses location informations.
        99: iconst_1
       100: anewarray     #2                  // class java/lang/Object
       103: dup
       104: iconst_0
       105: aload_0
       106: aastore
       107: invokevirtual #341                // Method ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;[Ljava/lang/Object;)V
       110: aconst_null
       111: areturn
       112: aload_1
       113: invokevirtual #294                // Method ext/mods/gameserver/model/actor/Npc.getStatus:()Lext/mods/gameserver/model/actor/status/NpcStatus;
       116: invokevirtual #344                // Method ext/mods/gameserver/model/actor/status/NpcStatus.getMaxHp:()I
       119: i2d
       120: dstore_3
       121: aload_1
       122: invokevirtual #294                // Method ext/mods/gameserver/model/actor/Npc.getStatus:()Lext/mods/gameserver/model/actor/status/NpcStatus;
       125: invokevirtual #347                // Method ext/mods/gameserver/model/actor/status/NpcStatus.getMaxMp:()I
       128: i2d
       129: dstore        5
       131: aload_0
       132: getfield      #159                // Field _spawnData:Lext/mods/gameserver/model/spawn/SpawnData;
       135: ifnull        181
       138: aload_0
       139: getfield      #159                // Field _spawnData:Lext/mods/gameserver/model/spawn/SpawnData;
       142: aload_2
       143: dload_3
       144: dload         5
       146: invokevirtual #350                // Method ext/mods/gameserver/model/spawn/SpawnData.checkAlive:(Lext/mods/gameserver/model/location/SpawnLocation;DD)Z
       149: ifeq          181
       152: aload_0
       153: getfield      #159                // Field _spawnData:Lext/mods/gameserver/model/spawn/SpawnData;
       156: astore_2
       157: aload_0
       158: getfield      #159                // Field _spawnData:Lext/mods/gameserver/model/spawn/SpawnData;
       161: invokevirtual #354                // Method ext/mods/gameserver/model/spawn/SpawnData.getCurrentHp:()I
       164: i2d
       165: dstore_3
       166: aload_0
       167: getfield      #159                // Field _spawnData:Lext/mods/gameserver/model/spawn/SpawnData;
       170: invokevirtual #357                // Method ext/mods/gameserver/model/spawn/SpawnData.getCurrentMp:()I
       173: i2d
       174: dstore        5
       176: aload_0
       177: iconst_1
       178: putfield      #323                // Field _dbLoaded:Z
       181: aload_1
       182: invokevirtual #294                // Method ext/mods/gameserver/model/actor/Npc.getStatus:()Lext/mods/gameserver/model/actor/status/NpcStatus;
       185: dload_3
       186: dload         5
       188: invokevirtual #360                // Method ext/mods/gameserver/model/actor/status/NpcStatus.setHpMp:(DD)V
       191: getstatic     #364                // Field ext/mods/Config.CHAMPION_FREQUENCY:I
       194: ifle          277
       197: aload_1
       198: instanceof    #367                // class ext/mods/gameserver/model/actor/instance/Monster
       201: ifeq          277
       204: aload_0
       205: invokevirtual #369                // Method getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
       208: invokevirtual #372                // Method ext/mods/gameserver/model/actor/template/NpcTemplate.cantBeChampion:()Z
       211: ifne          277
       214: aload_1
       215: invokevirtual #294                // Method ext/mods/gameserver/model/actor/Npc.getStatus:()Lext/mods/gameserver/model/actor/status/NpcStatus;
       218: invokevirtual #375                // Method ext/mods/gameserver/model/actor/status/NpcStatus.getLevel:()I
       221: getstatic     #378                // Field ext/mods/Config.CHAMP_MIN_LVL:I
       224: if_icmplt     277
       227: aload_1
       228: invokevirtual #294                // Method ext/mods/gameserver/model/actor/Npc.getStatus:()Lext/mods/gameserver/model/actor/status/NpcStatus;
       231: invokevirtual #375                // Method ext/mods/gameserver/model/actor/status/NpcStatus.getLevel:()I
       234: getstatic     #381                // Field ext/mods/Config.CHAMP_MAX_LVL:I
       237: if_icmpgt     277
       240: aload_1
       241: invokevirtual #384                // Method ext/mods/gameserver/model/actor/Npc.isRaidRelated:()Z
       244: ifne          277
       247: aload_1
       248: invokevirtual #387                // Method ext/mods/gameserver/model/actor/Npc.hasMaster:()Z
       251: ifne          277
       254: aload_1
       255: checkcast     #367                // class ext/mods/gameserver/model/actor/instance/Monster
       258: bipush        100
       260: invokestatic  #390                // Method ext/mods/commons/random/Rnd.get:(I)I
       263: getstatic     #364                // Field ext/mods/Config.CHAMPION_FREQUENCY:I
       266: if_icmpge     273
       269: iconst_1
       270: goto          274
       273: iconst_0
       274: invokevirtual #393                // Method ext/mods/gameserver/model/actor/instance/Monster.setChampion:(Z)V
       277: aload_1
       278: aload_2
       279: invokevirtual #396                // Method ext/mods/gameserver/model/actor/Npc.setSpawnLocation:(Lext/mods/gameserver/model/location/SpawnLocation;)V
       282: aload_1
       283: aload_2
       284: invokevirtual #400                // Method ext/mods/gameserver/model/actor/Npc.spawnMe:(Lext/mods/gameserver/model/location/SpawnLocation;)V
       287: aload_1
       288: areturn
      LineNumberTable:
        line 434: 0
        line 436: 17
        line 438: 25
        line 439: 30
        line 441: 35
        line 443: 50
        line 447: 58
        line 448: 62
        line 450: 67
        line 451: 72
        line 453: 77
        line 455: 84
        line 456: 89
        line 458: 93
        line 459: 110
        line 462: 112
        line 463: 121
        line 465: 131
        line 467: 152
        line 469: 157
        line 470: 166
        line 472: 176
        line 475: 181
        line 477: 191
        line 479: 197
        line 480: 254
        line 483: 277
        line 484: 282
        line 487: 287
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           89     198     2   loc   Lext/mods/gameserver/model/location/SpawnLocation;
          121     166     3 maxHp   D
          131     156     5 maxMp   D
            0     289     0  this   Lext/mods/gameserver/model/spawn/ASpawn;
            0     289     1   npc   Lext/mods/gameserver/model/actor/Npc;
      StackMapTable: number_of_entries = 7
        frame_type = 58 /* same */
        frame_type = 252 /* append */
          offset_delta = 53
          locals = [ class ext/mods/gameserver/model/location/SpawnLocation ]
        frame_type = 253 /* append */
          offset_delta = 68
          locals = [ double, double ]
        frame_type = 247 /* same_locals_1_stack_item_frame_extended */
          offset_delta = 91
          stack = [ class ext/mods/gameserver/model/actor/instance/Monster ]
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/model/spawn/ASpawn, class ext/mods/gameserver/model/actor/Npc, class ext/mods/gameserver/model/location/SpawnLocation, double, double ]
          stack = [ class ext/mods/gameserver/model/actor/instance/Monster, int ]
        frame_type = 2 /* same */
        frame_type = 248 /* chop */
          offset_delta = 9

  public void onDie(ext.mods.gameserver.model.actor.Npc);
    descriptor: (Lext/mods/gameserver/model/actor/Npc;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=0, locals=2, args_size=2
         0: return
      LineNumberTable:
        line 492: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       1     0  this   Lext/mods/gameserver/model/spawn/ASpawn;
            0       1     1   npc   Lext/mods/gameserver/model/actor/Npc;

  public void doSave();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #159                // Field _spawnData:Lext/mods/gameserver/model/spawn/SpawnData;
         4: ifnull        17
         7: invokestatic  #403                // Method ext/mods/gameserver/data/manager/SpawnManager.getInstance:()Lext/mods/gameserver/data/manager/SpawnManager;
        10: aload_0
        11: getfield      #159                // Field _spawnData:Lext/mods/gameserver/model/spawn/SpawnData;
        14: invokevirtual #408                // Method ext/mods/gameserver/data/manager/SpawnManager.save:(Lext/mods/gameserver/model/spawn/SpawnData;)V
        17: return
      LineNumberTable:
        line 496: 0
        line 497: 7
        line 498: 17
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      18     0  this   Lext/mods/gameserver/model/spawn/ASpawn;
      StackMapTable: number_of_entries = 1
        frame_type = 17 /* same */

  public boolean getDBLoaded();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #323                // Field _dbLoaded:Z
         4: ireturn
      LineNumberTable:
        line 502: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/spawn/ASpawn;

  public void setDBLoaded(boolean);
    descriptor: (Z)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #323                // Field _dbLoaded:Z
         5: return
      LineNumberTable:
        line 507: 0
        line 508: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/spawn/ASpawn;
            0       6     1 value   Z

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=3, locals=0, args_size=0
         0: new           #224                // class ext/mods/commons/logging/CLogger
         3: dup
         4: ldc           #14                 // class ext/mods/gameserver/model/spawn/ASpawn
         6: invokevirtual #425                // Method java/lang/Class.getName:()Ljava/lang/String;
         9: invokespecial #428                // Method ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
        12: putstatic     #217                // Field LOGGER:Lext/mods/commons/logging/CLogger;
        15: return
      LineNumberTable:
        line 51: 0
}
SourceFile: "ASpawn.java"
BootstrapMethods:
  0: #553 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #536 ext.mods.gameserver.model.actor.instance.\u0001
  1: #553 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #538 Template type \u0001 is not child of Npc.
  2: #559 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #540 (Ljava/lang/Object;)Z
      #542 REF_invokeVirtual ext/mods/gameserver/model/spawn/ASpawn.lambda$instantTeleportInMyTerritory$0:(Lext/mods/gameserver/model/actor/Player;)Z
      #545 (Lext/mods/gameserver/model/actor/Player;)Z
  3: #559 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #546 (Ljava/lang/Object;)V
      #548 REF_invokeStatic ext/mods/gameserver/model/spawn/ASpawn.lambda$instantTeleportInMyTerritory$1:(IIIILext/mods/gameserver/model/actor/Player;)V
      #551 (Lext/mods/gameserver/model/actor/Player;)V
InnerClasses:
  public static final #571= #567 of #569; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
