// Bytecode for: ext.mods.gameserver.model.spawn.MinionSpawn
// File: ext\mods\gameserver\model\spawn\MinionSpawn.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/spawn/MinionSpawn.class
  Last modified 9 de jul de 2026; size 8380 bytes
  MD5 checksum b6226ed65a73554b20d0e09c02fd4b68
  Compiled from "MinionSpawn.java"
public final class ext.mods.gameserver.model.spawn.MinionSpawn extends ext.mods.gameserver.model.spawn.ASpawn
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #13                         // ext/mods/gameserver/model/spawn/MinionSpawn
  super_class: #2                         // ext/mods/gameserver/model/spawn/ASpawn
  interfaces: 0, fields: 3, methods: 20, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/gameserver/model/spawn/ASpawn."<init>":(I)V
    #2 = Class              #4            // ext/mods/gameserver/model/spawn/ASpawn
    #3 = NameAndType        #5:#6         // "<init>":(I)V
    #4 = Utf8               ext/mods/gameserver/model/spawn/ASpawn
    #5 = Utf8               <init>
    #6 = Utf8               (I)V
    #7 = Class              #8            // ext/mods/gameserver/model/location/SpawnLocation
    #8 = Utf8               ext/mods/gameserver/model/location/SpawnLocation
    #9 = Methodref          #7.#10        // ext/mods/gameserver/model/location/SpawnLocation."<init>":(IIII)V
   #10 = NameAndType        #5:#11        // "<init>":(IIII)V
   #11 = Utf8               (IIII)V
   #12 = Fieldref           #13.#14       // ext/mods/gameserver/model/spawn/MinionSpawn._loc:Lext/mods/gameserver/model/location/SpawnLocation;
   #13 = Class              #15           // ext/mods/gameserver/model/spawn/MinionSpawn
   #14 = NameAndType        #16:#17       // _loc:Lext/mods/gameserver/model/location/SpawnLocation;
   #15 = Utf8               ext/mods/gameserver/model/spawn/MinionSpawn
   #16 = Utf8               _loc
   #17 = Utf8               Lext/mods/gameserver/model/location/SpawnLocation;
   #18 = Fieldref           #13.#19       // ext/mods/gameserver/model/spawn/MinionSpawn._master:Lext/mods/gameserver/model/actor/Npc;
   #19 = NameAndType        #20:#21       // _master:Lext/mods/gameserver/model/actor/Npc;
   #20 = Utf8               _master
   #21 = Utf8               Lext/mods/gameserver/model/actor/Npc;
   #22 = Methodref          #2.#23        // ext/mods/gameserver/model/spawn/ASpawn."<init>":(Lext/mods/gameserver/model/actor/template/NpcTemplate;)V
   #23 = NameAndType        #5:#24        // "<init>":(Lext/mods/gameserver/model/actor/template/NpcTemplate;)V
   #24 = Utf8               (Lext/mods/gameserver/model/actor/template/NpcTemplate;)V
   #25 = Fieldref           #7.#26        // ext/mods/gameserver/model/location/SpawnLocation.DUMMY_SPAWNLOC:Lext/mods/gameserver/model/location/SpawnLocation;
   #26 = NameAndType        #27:#17       // DUMMY_SPAWNLOC:Lext/mods/gameserver/model/location/SpawnLocation;
   #27 = Utf8               DUMMY_SPAWNLOC
   #28 = Methodref          #7.#29        // ext/mods/gameserver/model/location/SpawnLocation.equals:(Ljava/lang/Object;)Z
   #29 = NameAndType        #30:#31       // equals:(Ljava/lang/Object;)Z
   #30 = Utf8               equals
   #31 = Utf8               (Ljava/lang/Object;)Z
   #32 = Methodref          #33.#34       // ext/mods/gameserver/model/actor/Npc.getCollisionRadius:()D
   #33 = Class              #35           // ext/mods/gameserver/model/actor/Npc
   #34 = NameAndType        #36:#37       // getCollisionRadius:()D
   #35 = Utf8               ext/mods/gameserver/model/actor/Npc
   #36 = Utf8               getCollisionRadius
   #37 = Utf8               ()D
   #38 = Double             30.0d
   #40 = Double             100.0d
   #42 = Fieldref           #13.#43       // ext/mods/gameserver/model/spawn/MinionSpawn._template:Lext/mods/gameserver/model/actor/template/NpcTemplate;
   #43 = NameAndType        #44:#45       // _template:Lext/mods/gameserver/model/actor/template/NpcTemplate;
   #44 = Utf8               _template
   #45 = Utf8               Lext/mods/gameserver/model/actor/template/NpcTemplate;
   #46 = Methodref          #47.#34       // ext/mods/gameserver/model/actor/template/NpcTemplate.getCollisionRadius:()D
   #47 = Class              #48           // ext/mods/gameserver/model/actor/template/NpcTemplate
   #48 = Utf8               ext/mods/gameserver/model/actor/template/NpcTemplate
   #49 = Methodref          #33.#50       // ext/mods/gameserver/model/actor/Npc.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
   #50 = NameAndType        #51:#52       // getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
   #51 = Utf8               getPosition
   #52 = Utf8               ()Lext/mods/gameserver/model/location/SpawnLocation;
   #53 = Methodref          #7.#54        // ext/mods/gameserver/model/location/SpawnLocation.clone:()Lext/mods/gameserver/model/location/SpawnLocation;
   #54 = NameAndType        #55:#52       // clone:()Lext/mods/gameserver/model/location/SpawnLocation;
   #55 = Utf8               clone
   #56 = Methodref          #7.#57        // ext/mods/gameserver/model/location/SpawnLocation.addRandomOffsetBetween:(II)V
   #57 = NameAndType        #58:#59       // addRandomOffsetBetween:(II)V
   #58 = Utf8               addRandomOffsetBetween
   #59 = Utf8               (II)V
   #60 = Methodref          #61.#62       // ext/mods/gameserver/geoengine/GeoEngine.getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
   #61 = Class              #63           // ext/mods/gameserver/geoengine/GeoEngine
   #62 = NameAndType        #64:#65       // getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
   #63 = Utf8               ext/mods/gameserver/geoengine/GeoEngine
   #64 = Utf8               getInstance
   #65 = Utf8               ()Lext/mods/gameserver/geoengine/GeoEngine;
   #66 = Methodref          #61.#67       // ext/mods/gameserver/geoengine/GeoEngine.getValidLocation:(Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/location/Location;)Lext/mods/gameserver/model/location/Location;
   #67 = NameAndType        #68:#69       // getValidLocation:(Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/location/Location;)Lext/mods/gameserver/model/location/Location;
   #68 = Utf8               getValidLocation
   #69 = Utf8               (Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/location/Location;)Lext/mods/gameserver/model/location/Location;
   #70 = Methodref          #7.#71        // ext/mods/gameserver/model/location/SpawnLocation.set:(Lext/mods/gameserver/model/location/Location;)V
   #71 = NameAndType        #72:#73       // set:(Lext/mods/gameserver/model/location/Location;)V
   #72 = Utf8               set
   #73 = Utf8               (Lext/mods/gameserver/model/location/Location;)V
   #74 = Methodref          #75.#76       // ext/mods/gameserver/model/location/Location.addRandomOffset:(I)V
   #75 = Class              #77           // ext/mods/gameserver/model/location/Location
   #76 = NameAndType        #78:#6        // addRandomOffset:(I)V
   #77 = Utf8               ext/mods/gameserver/model/location/Location
   #78 = Utf8               addRandomOffset
   #79 = Methodref          #75.#71       // ext/mods/gameserver/model/location/Location.set:(Lext/mods/gameserver/model/location/Location;)V
   #80 = Fieldref           #13.#81       // ext/mods/gameserver/model/spawn/MinionSpawn._npc:Lext/mods/gameserver/model/actor/Npc;
   #81 = NameAndType        #82:#21       // _npc:Lext/mods/gameserver/model/actor/Npc;
   #82 = Utf8               _npc
   #83 = Methodref          #33.#84       // ext/mods/gameserver/model/actor/Npc.cancelRespawn:()V
   #84 = NameAndType        #85:#86       // cancelRespawn:()V
   #85 = Utf8               cancelRespawn
   #86 = Utf8               ()V
   #87 = Methodref          #33.#88       // ext/mods/gameserver/model/actor/Npc.deleteMe:()V
   #88 = NameAndType        #89:#86       // deleteMe:()V
   #89 = Utf8               deleteMe
   #90 = Methodref          #13.#91       // ext/mods/gameserver/model/spawn/MinionSpawn.getRespawnDelay:()I
   #91 = NameAndType        #92:#93       // getRespawnDelay:()I
   #92 = Utf8               getRespawnDelay
   #93 = Utf8               ()I
   #94 = Methodref          #33.#95       // ext/mods/gameserver/model/actor/Npc.setMaster:(Lext/mods/gameserver/model/actor/Npc;)V
   #95 = NameAndType        #96:#97       // setMaster:(Lext/mods/gameserver/model/actor/Npc;)V
   #96 = Utf8               setMaster
   #97 = Utf8               (Lext/mods/gameserver/model/actor/Npc;)V
   #98 = Methodref          #33.#99       // ext/mods/gameserver/model/actor/Npc.getMinions:()Ljava/util/Set;
   #99 = NameAndType        #100:#101     // getMinions:()Ljava/util/Set;
  #100 = Utf8               getMinions
  #101 = Utf8               ()Ljava/util/Set;
  #102 = InterfaceMethodref #103.#104     // java/util/Set.remove:(Ljava/lang/Object;)Z
  #103 = Class              #105          // java/util/Set
  #104 = NameAndType        #106:#31      // remove:(Ljava/lang/Object;)Z
  #105 = Utf8               java/util/Set
  #106 = Utf8               remove
  #107 = Methodref          #33.#108      // ext/mods/gameserver/model/actor/Npc.isDead:()Z
  #108 = NameAndType        #109:#110     // isDead:()Z
  #109 = Utf8               isDead
  #110 = Utf8               ()Z
  #111 = Methodref          #33.#112      // ext/mods/gameserver/model/actor/Npc.isDecayed:()Z
  #112 = NameAndType        #113:#110     // isDecayed:()Z
  #113 = Utf8               isDecayed
  #114 = Methodref          #33.#115      // ext/mods/gameserver/model/actor/Npc.refreshID:()V
  #115 = NameAndType        #116:#86      // refreshID:()V
  #116 = Utf8               refreshID
  #117 = Methodref          #13.#118      // ext/mods/gameserver/model/spawn/MinionSpawn.initializeAndSpawn:(Lext/mods/gameserver/model/actor/Npc;)Lext/mods/gameserver/model/actor/Npc;
  #118 = NameAndType        #119:#120     // initializeAndSpawn:(Lext/mods/gameserver/model/actor/Npc;)Lext/mods/gameserver/model/actor/Npc;
  #119 = Utf8               initializeAndSpawn
  #120 = Utf8               (Lext/mods/gameserver/model/actor/Npc;)Lext/mods/gameserver/model/actor/Npc;
  #121 = Fieldref           #13.#122      // ext/mods/gameserver/model/spawn/MinionSpawn._respawnDelay:I
  #122 = NameAndType        #123:#124     // _respawnDelay:I
  #123 = Utf8               _respawnDelay
  #124 = Utf8               I
  #125 = Fieldref           #13.#126      // ext/mods/gameserver/model/spawn/MinionSpawn._respawnRandom:I
  #126 = NameAndType        #127:#124     // _respawnRandom:I
  #127 = Utf8               _respawnRandom
  #128 = Methodref          #129.#130     // ext/mods/commons/random/Rnd.get:(II)I
  #129 = Class              #131          // ext/mods/commons/random/Rnd
  #130 = NameAndType        #132:#133     // get:(II)I
  #131 = Utf8               ext/mods/commons/random/Rnd
  #132 = Utf8               get
  #133 = Utf8               (II)I
  #134 = Methodref          #13.#135      // ext/mods/gameserver/model/spawn/MinionSpawn.getNpcId:()I
  #135 = NameAndType        #136:#93      // getNpcId:()I
  #136 = Utf8               getNpcId
  #137 = InvokeDynamic      #0:#138       // #0:makeConcatWithConstants:(I)Ljava/lang/String;
  #138 = NameAndType        #139:#140     // makeConcatWithConstants:(I)Ljava/lang/String;
  #139 = Utf8               makeConcatWithConstants
  #140 = Utf8               (I)Ljava/lang/String;
  #141 = Methodref          #142.#143     // java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
  #142 = Class              #144          // java/lang/String
  #143 = NameAndType        #145:#146     // valueOf:(Ljava/lang/Object;)Ljava/lang/String;
  #144 = Utf8               java/lang/String
  #145 = Utf8               valueOf
  #146 = Utf8               (Ljava/lang/Object;)Ljava/lang/String;
  #147 = InvokeDynamic      #1:#148       // #1:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #148 = NameAndType        #139:#149     // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #149 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
  #150 = Fieldref           #13.#151      // ext/mods/gameserver/model/spawn/MinionSpawn._constructor:Ljava/lang/reflect/Constructor;
  #151 = NameAndType        #152:#153     // _constructor:Ljava/lang/reflect/Constructor;
  #152 = Utf8               _constructor
  #153 = Utf8               Ljava/lang/reflect/Constructor;
  #154 = Class              #155          // java/lang/Object
  #155 = Utf8               java/lang/Object
  #156 = Methodref          #157.#158     // ext/mods/gameserver/idfactory/IdFactory.getInstance:()Lext/mods/gameserver/idfactory/IdFactory;
  #157 = Class              #159          // ext/mods/gameserver/idfactory/IdFactory
  #158 = NameAndType        #64:#160      // getInstance:()Lext/mods/gameserver/idfactory/IdFactory;
  #159 = Utf8               ext/mods/gameserver/idfactory/IdFactory
  #160 = Utf8               ()Lext/mods/gameserver/idfactory/IdFactory;
  #161 = Methodref          #157.#162     // ext/mods/gameserver/idfactory/IdFactory.getNextId:()I
  #162 = NameAndType        #163:#93      // getNextId:()I
  #163 = Utf8               getNextId
  #164 = Methodref          #165.#166     // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
  #165 = Class              #167          // java/lang/Integer
  #166 = NameAndType        #145:#168     // valueOf:(I)Ljava/lang/Integer;
  #167 = Utf8               java/lang/Integer
  #168 = Utf8               (I)Ljava/lang/Integer;
  #169 = Methodref          #170.#171     // java/lang/reflect/Constructor.newInstance:([Ljava/lang/Object;)Ljava/lang/Object;
  #170 = Class              #172          // java/lang/reflect/Constructor
  #171 = NameAndType        #173:#174     // newInstance:([Ljava/lang/Object;)Ljava/lang/Object;
  #172 = Utf8               java/lang/reflect/Constructor
  #173 = Utf8               newInstance
  #174 = Utf8               ([Ljava/lang/Object;)Ljava/lang/Object;
  #175 = Fieldref           #33.#176      // ext/mods/gameserver/model/actor/Npc._summoner:Lext/mods/gameserver/model/actor/Creature;
  #176 = NameAndType        #177:#178     // _summoner:Lext/mods/gameserver/model/actor/Creature;
  #177 = Utf8               _summoner
  #178 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #179 = Methodref          #33.#180      // ext/mods/gameserver/model/actor/Npc.setSpawn:(Lext/mods/gameserver/model/spawn/ASpawn;)V
  #180 = NameAndType        #181:#182     // setSpawn:(Lext/mods/gameserver/model/spawn/ASpawn;)V
  #181 = Utf8               setSpawn
  #182 = Utf8               (Lext/mods/gameserver/model/spawn/ASpawn;)V
  #183 = Methodref          #33.#184      // ext/mods/gameserver/model/actor/Npc.setShowSummonAnimation:(Z)V
  #184 = NameAndType        #185:#186     // setShowSummonAnimation:(Z)V
  #185 = Utf8               setShowSummonAnimation
  #186 = Utf8               (Z)V
  #187 = Methodref          #33.#188      // ext/mods/gameserver/model/actor/Npc.isRaidBoss:()Z
  #188 = NameAndType        #189:#110     // isRaidBoss:()Z
  #189 = Utf8               isRaidBoss
  #190 = Class              #191          // ext/mods/gameserver/model/actor/instance/Monster
  #191 = Utf8               ext/mods/gameserver/model/actor/instance/Monster
  #192 = Methodref          #190.#193     // ext/mods/gameserver/model/actor/instance/Monster.setRaidRelated:()V
  #193 = NameAndType        #194:#86      // setRaidRelated:()V
  #194 = Utf8               setRaidRelated
  #195 = Class              #196          // java/lang/Exception
  #196 = Utf8               java/lang/Exception
  #197 = Fieldref           #13.#198      // ext/mods/gameserver/model/spawn/MinionSpawn.LOGGER:Lext/mods/commons/logging/CLogger;
  #198 = NameAndType        #199:#200     // LOGGER:Lext/mods/commons/logging/CLogger;
  #199 = Utf8               LOGGER
  #200 = Utf8               Lext/mods/commons/logging/CLogger;
  #201 = String             #202          // Error during spawn, NPC id={}
  #202 = Utf8               Error during spawn, NPC id={}
  #203 = Methodref          #47.#135      // ext/mods/gameserver/model/actor/template/NpcTemplate.getNpcId:()I
  #204 = Methodref          #205.#206     // ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
  #205 = Class              #207          // ext/mods/commons/logging/CLogger
  #206 = NameAndType        #208:#209     // warn:(Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
  #207 = Utf8               ext/mods/commons/logging/CLogger
  #208 = Utf8               warn
  #209 = Utf8               (Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
  #210 = Fieldref           #33.#211      // ext/mods/gameserver/model/actor/Npc._param1:I
  #211 = NameAndType        #212:#124     // _param1:I
  #212 = Utf8               _param1
  #213 = Fieldref           #33.#214      // ext/mods/gameserver/model/actor/Npc._param2:I
  #214 = NameAndType        #215:#124     // _param2:I
  #215 = Utf8               _param2
  #216 = Fieldref           #33.#217      // ext/mods/gameserver/model/actor/Npc._param3:I
  #217 = NameAndType        #218:#124     // _param3:I
  #218 = Utf8               _param3
  #219 = Methodref          #33.#220      // ext/mods/gameserver/model/actor/Npc.stopAllEffects:()V
  #220 = NameAndType        #221:#86      // stopAllEffects:()V
  #221 = Utf8               stopAllEffects
  #222 = Methodref          #33.#223      // ext/mods/gameserver/model/actor/Npc.setScriptValue:(I)V
  #223 = NameAndType        #224:#6       // setScriptValue:(I)V
  #224 = Utf8               setScriptValue
  #225 = Methodref          #33.#226      // ext/mods/gameserver/model/actor/Npc.setIsDead:(Z)V
  #226 = NameAndType        #227:#186     // setIsDead:(Z)V
  #227 = Utf8               setIsDead
  #228 = Methodref          #33.#229      // ext/mods/gameserver/model/actor/Npc.setDecayed:(Z)V
  #229 = NameAndType        #230:#186     // setDecayed:(Z)V
  #230 = Utf8               setDecayed
  #231 = Methodref          #33.#232      // ext/mods/gameserver/model/actor/Npc.getStatus:()Lext/mods/gameserver/model/actor/status/NpcStatus;
  #232 = NameAndType        #233:#234     // getStatus:()Lext/mods/gameserver/model/actor/status/NpcStatus;
  #233 = Utf8               getStatus
  #234 = Utf8               ()Lext/mods/gameserver/model/actor/status/NpcStatus;
  #235 = Methodref          #236.#237     // ext/mods/gameserver/model/actor/status/NpcStatus.initializeValues:()V
  #236 = Class              #238          // ext/mods/gameserver/model/actor/status/NpcStatus
  #237 = NameAndType        #239:#86      // initializeValues:()V
  #238 = Utf8               ext/mods/gameserver/model/actor/status/NpcStatus
  #239 = Utf8               initializeValues
  #240 = Methodref          #13.#241      // ext/mods/gameserver/model/spawn/MinionSpawn.getSpawnLocation:()Lext/mods/gameserver/model/location/SpawnLocation;
  #241 = NameAndType        #242:#52      // getSpawnLocation:()Lext/mods/gameserver/model/location/SpawnLocation;
  #242 = Utf8               getSpawnLocation
  #243 = String             #244          // {} misses location informations.
  #244 = Utf8               {} misses location informations.
  #245 = Methodref          #205.#246     // ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;[Ljava/lang/Object;)V
  #246 = NameAndType        #208:#247     // warn:(Ljava/lang/Object;[Ljava/lang/Object;)V
  #247 = Utf8               (Ljava/lang/Object;[Ljava/lang/Object;)V
  #248 = Methodref          #236.#249     // ext/mods/gameserver/model/actor/status/NpcStatus.getMaxHp:()I
  #249 = NameAndType        #250:#93      // getMaxHp:()I
  #250 = Utf8               getMaxHp
  #251 = Methodref          #236.#252     // ext/mods/gameserver/model/actor/status/NpcStatus.getMaxMp:()I
  #252 = NameAndType        #253:#93      // getMaxMp:()I
  #253 = Utf8               getMaxMp
  #254 = Methodref          #236.#255     // ext/mods/gameserver/model/actor/status/NpcStatus.setHpMp:(DD)V
  #255 = NameAndType        #256:#257     // setHpMp:(DD)V
  #256 = Utf8               setHpMp
  #257 = Utf8               (DD)V
  #258 = Methodref          #33.#259      // ext/mods/gameserver/model/actor/Npc.setSpawnLocation:(Lext/mods/gameserver/model/location/SpawnLocation;)V
  #259 = NameAndType        #260:#261     // setSpawnLocation:(Lext/mods/gameserver/model/location/SpawnLocation;)V
  #260 = Utf8               setSpawnLocation
  #261 = Utf8               (Lext/mods/gameserver/model/location/SpawnLocation;)V
  #262 = Methodref          #33.#263      // ext/mods/gameserver/model/actor/Npc.spawnMe:(Lext/mods/gameserver/model/location/SpawnLocation;)V
  #263 = NameAndType        #264:#261     // spawnMe:(Lext/mods/gameserver/model/location/SpawnLocation;)V
  #264 = Utf8               spawnMe
  #265 = Methodref          #33.#266      // ext/mods/gameserver/model/actor/Npc.sendScriptEvent:(III)V
  #266 = NameAndType        #267:#268     // sendScriptEvent:(III)V
  #267 = Utf8               sendScriptEvent
  #268 = Utf8               (III)V
  #269 = Methodref          #7.#270       // ext/mods/gameserver/model/location/SpawnLocation.getZ:()I
  #270 = NameAndType        #271:#93      // getZ:()I
  #271 = Utf8               getZ
  #272 = Fieldref           #273.#274     // ext/mods/Config.NPC_Z_INDEX:I
  #273 = Class              #275          // ext/mods/Config
  #274 = NameAndType        #276:#124     // NPC_Z_INDEX:I
  #275 = Utf8               ext/mods/Config
  #276 = Utf8               NPC_Z_INDEX
  #277 = Methodref          #7.#278       // ext/mods/gameserver/model/location/SpawnLocation.getX:()I
  #278 = NameAndType        #279:#93      // getX:()I
  #279 = Utf8               getX
  #280 = Methodref          #7.#281       // ext/mods/gameserver/model/location/SpawnLocation.getY:()I
  #281 = NameAndType        #282:#93      // getY:()I
  #282 = Utf8               getY
  #283 = Methodref          #61.#284      // ext/mods/gameserver/geoengine/GeoEngine.getHeight:(III)S
  #284 = NameAndType        #285:#286     // getHeight:(III)S
  #285 = Utf8               getHeight
  #286 = Utf8               (III)S
  #287 = Methodref          #7.#288       // ext/mods/gameserver/model/location/SpawnLocation.getHeading:()I
  #288 = NameAndType        #289:#93      // getHeading:()I
  #289 = Utf8               getHeading
  #290 = Methodref          #7.#291       // ext/mods/gameserver/model/location/SpawnLocation.set:(IIII)V
  #291 = NameAndType        #72:#11       // set:(IIII)V
  #292 = Utf8               (ILext/mods/gameserver/model/actor/Npc;)V
  #293 = Utf8               Code
  #294 = Utf8               LineNumberTable
  #295 = Utf8               LocalVariableTable
  #296 = Utf8               this
  #297 = Utf8               Lext/mods/gameserver/model/spawn/MinionSpawn;
  #298 = Utf8               id
  #299 = Utf8               master
  #300 = Utf8               Exceptions
  #301 = Class              #302          // java/lang/SecurityException
  #302 = Utf8               java/lang/SecurityException
  #303 = Class              #304          // java/lang/ClassNotFoundException
  #304 = Utf8               java/lang/ClassNotFoundException
  #305 = Class              #306          // java/lang/NoSuchMethodException
  #306 = Utf8               java/lang/NoSuchMethodException
  #307 = Class              #308          // java/io/InvalidClassException
  #308 = Utf8               java/io/InvalidClassException
  #309 = Utf8               (Lext/mods/gameserver/model/actor/template/NpcTemplate;Lext/mods/gameserver/model/actor/Npc;)V
  #310 = Utf8               template
  #311 = Utf8               minOffset
  #312 = Utf8               maxOffset
  #313 = Utf8               loc
  #314 = Utf8               StackMapTable
  #315 = Utf8               getRandomWalkLocation
  #316 = Utf8               (Lext/mods/gameserver/model/actor/Npc;I)Lext/mods/gameserver/model/location/Location;
  #317 = Utf8               npc
  #318 = Utf8               offset
  #319 = Utf8               Lext/mods/gameserver/model/location/Location;
  #320 = Utf8               isInMyTerritory
  #321 = Utf8               (Lext/mods/gameserver/model/WorldObject;)Z
  #322 = Utf8               worldObject
  #323 = Utf8               Lext/mods/gameserver/model/WorldObject;
  #324 = Utf8               doDelete
  #325 = Utf8               onDecay
  #326 = Utf8               doRespawn
  #327 = Utf8               calculateRespawnDelay
  #328 = Utf8               ()J
  #329 = Utf8               respawnTime
  #330 = Utf8               toString
  #331 = Utf8               ()Ljava/lang/String;
  #332 = Utf8               getDescription
  #333 = Utf8               updateSpawnData
  #334 = Utf8               doSpawn
  #335 = Utf8               (ZLext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/model/actor/Npc;
  #336 = Utf8               monster
  #337 = Utf8               Lext/mods/gameserver/model/actor/instance/Monster;
  #338 = Utf8               e
  #339 = Utf8               Ljava/lang/Exception;
  #340 = Utf8               isSummonSpawn
  #341 = Utf8               Z
  #342 = Utf8               summoner
  #343 = Class              #344          // ext/mods/gameserver/model/actor/Creature
  #344 = Utf8               ext/mods/gameserver/model/actor/Creature
  #345 = Utf8               (ZIII)Lext/mods/gameserver/model/actor/Npc;
  #346 = Utf8               param1
  #347 = Utf8               param2
  #348 = Utf8               param3
  #349 = Utf8               maxHp
  #350 = Utf8               D
  #351 = Utf8               maxMp
  #352 = Utf8               getNpc
  #353 = Utf8               ()Lext/mods/gameserver/model/actor/Npc;
  #354 = Utf8               eventId
  #355 = Utf8               arg1
  #356 = Utf8               arg2
  #357 = Utf8               getMaster
  #358 = Utf8               setLoc
  #359 = Utf8               biasedZ
  #360 = Utf8               x
  #361 = Utf8               y
  #362 = Utf8               z
  #363 = Utf8               heading
  #364 = Utf8               SourceFile
  #365 = Utf8               MinionSpawn.java
  #366 = Utf8               BootstrapMethods
  #367 = String             #368          // Spawn [id=\u0001]
  #368 = Utf8               Spawn [id=\u0001]
  #369 = String             #370          // Master: \u0001
  #370 = Utf8               Master: \u0001
  #371 = MethodHandle       6:#372        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #372 = Methodref          #373.#374     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #373 = Class              #375          // java/lang/invoke/StringConcatFactory
  #374 = NameAndType        #139:#376     // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #375 = Utf8               java/lang/invoke/StringConcatFactory
  #376 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #377 = Utf8               InnerClasses
  #378 = Class              #379          // java/lang/invoke/MethodHandles$Lookup
  #379 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #380 = Class              #381          // java/lang/invoke/MethodHandles
  #381 = Utf8               java/lang/invoke/MethodHandles
  #382 = Utf8               Lookup
{
  public ext.mods.gameserver.model.spawn.MinionSpawn(int, ext.mods.gameserver.model.actor.Npc) throws java.lang.SecurityException, java.lang.ClassNotFoundException, java.lang.NoSuchMethodException, java.io.InvalidClassException;
    descriptor: (ILext/mods/gameserver/model/actor/Npc;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=7, locals=3, args_size=3
         0: aload_0
         1: iload_1
         2: invokespecial #1                  // Method ext/mods/gameserver/model/spawn/ASpawn."<init>":(I)V
         5: aload_0
         6: new           #7                  // class ext/mods/gameserver/model/location/SpawnLocation
         9: dup
        10: iconst_0
        11: iconst_0
        12: iconst_0
        13: iconst_0
        14: invokespecial #9                  // Method ext/mods/gameserver/model/location/SpawnLocation."<init>":(IIII)V
        17: putfield      #12                 // Field _loc:Lext/mods/gameserver/model/location/SpawnLocation;
        20: aload_0
        21: aload_2
        22: putfield      #18                 // Field _master:Lext/mods/gameserver/model/actor/Npc;
        25: return
      LineNumberTable:
        line 48: 0
        line 40: 5
        line 50: 20
        line 51: 25
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      26     0  this   Lext/mods/gameserver/model/spawn/MinionSpawn;
            0      26     1    id   I
            0      26     2 master   Lext/mods/gameserver/model/actor/Npc;
    Exceptions:
      throws java.lang.SecurityException, java.lang.ClassNotFoundException, java.lang.NoSuchMethodException, java.io.InvalidClassException

  public ext.mods.gameserver.model.spawn.MinionSpawn(ext.mods.gameserver.model.actor.template.NpcTemplate, ext.mods.gameserver.model.actor.Npc) throws java.lang.SecurityException, java.lang.ClassNotFoundException, java.lang.NoSuchMethodException, java.io.InvalidClassException;
    descriptor: (Lext/mods/gameserver/model/actor/template/NpcTemplate;Lext/mods/gameserver/model/actor/Npc;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=7, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: invokespecial #22                 // Method ext/mods/gameserver/model/spawn/ASpawn."<init>":(Lext/mods/gameserver/model/actor/template/NpcTemplate;)V
         5: aload_0
         6: new           #7                  // class ext/mods/gameserver/model/location/SpawnLocation
         9: dup
        10: iconst_0
        11: iconst_0
        12: iconst_0
        13: iconst_0
        14: invokespecial #9                  // Method ext/mods/gameserver/model/location/SpawnLocation."<init>":(IIII)V
        17: putfield      #12                 // Field _loc:Lext/mods/gameserver/model/location/SpawnLocation;
        20: aload_0
        21: aload_2
        22: putfield      #18                 // Field _master:Lext/mods/gameserver/model/actor/Npc;
        25: return
      LineNumberTable:
        line 55: 0
        line 40: 5
        line 57: 20
        line 58: 25
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      26     0  this   Lext/mods/gameserver/model/spawn/MinionSpawn;
            0      26     1 template   Lext/mods/gameserver/model/actor/template/NpcTemplate;
            0      26     2 master   Lext/mods/gameserver/model/actor/Npc;
    Exceptions:
      throws java.lang.SecurityException, java.lang.ClassNotFoundException, java.lang.NoSuchMethodException, java.io.InvalidClassException

  public ext.mods.gameserver.model.location.SpawnLocation getSpawnLocation();
    descriptor: ()Lext/mods/gameserver/model/location/SpawnLocation;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=4, args_size=1
         0: aload_0
         1: getfield      #12                 // Field _loc:Lext/mods/gameserver/model/location/SpawnLocation;
         4: getstatic     #25                 // Field ext/mods/gameserver/model/location/SpawnLocation.DUMMY_SPAWNLOC:Lext/mods/gameserver/model/location/SpawnLocation;
         7: invokevirtual #28                 // Method ext/mods/gameserver/model/location/SpawnLocation.equals:(Ljava/lang/Object;)Z
        10: ifne          18
        13: aload_0
        14: getfield      #12                 // Field _loc:Lext/mods/gameserver/model/location/SpawnLocation;
        17: areturn
        18: aload_0
        19: getfield      #18                 // Field _master:Lext/mods/gameserver/model/actor/Npc;
        22: invokevirtual #32                 // Method ext/mods/gameserver/model/actor/Npc.getCollisionRadius:()D
        25: ldc2_w        #38                 // double 30.0d
        28: dadd
        29: d2i
        30: istore_1
        31: ldc2_w        #40                 // double 100.0d
        34: aload_0
        35: getfield      #42                 // Field _template:Lext/mods/gameserver/model/actor/template/NpcTemplate;
        38: invokevirtual #46                 // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getCollisionRadius:()D
        41: dadd
        42: aload_0
        43: getfield      #18                 // Field _master:Lext/mods/gameserver/model/actor/Npc;
        46: invokevirtual #32                 // Method ext/mods/gameserver/model/actor/Npc.getCollisionRadius:()D
        49: dadd
        50: d2i
        51: istore_2
        52: aload_0
        53: getfield      #18                 // Field _master:Lext/mods/gameserver/model/actor/Npc;
        56: invokevirtual #49                 // Method ext/mods/gameserver/model/actor/Npc.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
        59: invokevirtual #53                 // Method ext/mods/gameserver/model/location/SpawnLocation.clone:()Lext/mods/gameserver/model/location/SpawnLocation;
        62: astore_3
        63: aload_3
        64: iload_1
        65: iload_2
        66: invokevirtual #56                 // Method ext/mods/gameserver/model/location/SpawnLocation.addRandomOffsetBetween:(II)V
        69: aload_3
        70: invokestatic  #60                 // Method ext/mods/gameserver/geoengine/GeoEngine.getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
        73: aload_0
        74: getfield      #18                 // Field _master:Lext/mods/gameserver/model/actor/Npc;
        77: aload_3
        78: invokevirtual #66                 // Method ext/mods/gameserver/geoengine/GeoEngine.getValidLocation:(Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/location/Location;)Lext/mods/gameserver/model/location/Location;
        81: invokevirtual #70                 // Method ext/mods/gameserver/model/location/SpawnLocation.set:(Lext/mods/gameserver/model/location/Location;)V
        84: aload_3
        85: areturn
      LineNumberTable:
        line 63: 0
        line 64: 13
        line 66: 18
        line 67: 31
        line 69: 52
        line 70: 63
        line 71: 69
        line 73: 84
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      86     0  this   Lext/mods/gameserver/model/spawn/MinionSpawn;
           31      55     1 minOffset   I
           52      34     2 maxOffset   I
           63      23     3   loc   Lext/mods/gameserver/model/location/SpawnLocation;
      StackMapTable: number_of_entries = 1
        frame_type = 18 /* same */

  public ext.mods.gameserver.model.location.Location getRandomWalkLocation(ext.mods.gameserver.model.actor.Npc, int);
    descriptor: (Lext/mods/gameserver/model/actor/Npc;I)Lext/mods/gameserver/model/location/Location;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=4, args_size=3
         0: aload_1
         1: invokevirtual #49                 // Method ext/mods/gameserver/model/actor/Npc.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
         4: invokevirtual #53                 // Method ext/mods/gameserver/model/location/SpawnLocation.clone:()Lext/mods/gameserver/model/location/SpawnLocation;
         7: astore_3
         8: aload_3
         9: iload_2
        10: invokevirtual #74                 // Method ext/mods/gameserver/model/location/Location.addRandomOffset:(I)V
        13: aload_3
        14: invokestatic  #60                 // Method ext/mods/gameserver/geoengine/GeoEngine.getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
        17: aload_1
        18: aload_3
        19: invokevirtual #66                 // Method ext/mods/gameserver/geoengine/GeoEngine.getValidLocation:(Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/location/Location;)Lext/mods/gameserver/model/location/Location;
        22: invokevirtual #79                 // Method ext/mods/gameserver/model/location/Location.set:(Lext/mods/gameserver/model/location/Location;)V
        25: aload_3
        26: areturn
      LineNumberTable:
        line 79: 0
        line 80: 8
        line 81: 13
        line 83: 25
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      27     0  this   Lext/mods/gameserver/model/spawn/MinionSpawn;
            0      27     1   npc   Lext/mods/gameserver/model/actor/Npc;
            0      27     2 offset   I
            8      19     3   loc   Lext/mods/gameserver/model/location/Location;

  public boolean isInMyTerritory(ext.mods.gameserver.model.WorldObject);
    descriptor: (Lext/mods/gameserver/model/WorldObject;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=2, args_size=2
         0: iconst_1
         1: ireturn
      LineNumberTable:
        line 89: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/gameserver/model/spawn/MinionSpawn;
            0       2     1 worldObject   Lext/mods/gameserver/model/WorldObject;

  public void doDelete();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #80                 // Field _npc:Lext/mods/gameserver/model/actor/Npc;
         4: ifnonnull     8
         7: return
         8: aload_0
         9: getfield      #80                 // Field _npc:Lext/mods/gameserver/model/actor/Npc;
        12: invokevirtual #83                 // Method ext/mods/gameserver/model/actor/Npc.cancelRespawn:()V
        15: aload_0
        16: getfield      #80                 // Field _npc:Lext/mods/gameserver/model/actor/Npc;
        19: invokevirtual #87                 // Method ext/mods/gameserver/model/actor/Npc.deleteMe:()V
        22: aload_0
        23: aconst_null
        24: putfield      #80                 // Field _npc:Lext/mods/gameserver/model/actor/Npc;
        27: return
      LineNumberTable:
        line 95: 0
        line 96: 7
        line 98: 8
        line 99: 15
        line 100: 22
        line 101: 27
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      28     0  this   Lext/mods/gameserver/model/spawn/MinionSpawn;
      StackMapTable: number_of_entries = 1
        frame_type = 8 /* same */

  public void onDecay(ext.mods.gameserver.model.actor.Npc);
    descriptor: (Lext/mods/gameserver/model/actor/Npc;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #18                 // Field _master:Lext/mods/gameserver/model/actor/Npc;
         4: ifnull        33
         7: aload_0
         8: invokevirtual #90                 // Method getRespawnDelay:()I
        11: ifgt          33
        14: aload_1
        15: aconst_null
        16: invokevirtual #94                 // Method ext/mods/gameserver/model/actor/Npc.setMaster:(Lext/mods/gameserver/model/actor/Npc;)V
        19: aload_0
        20: getfield      #18                 // Field _master:Lext/mods/gameserver/model/actor/Npc;
        23: invokevirtual #98                 // Method ext/mods/gameserver/model/actor/Npc.getMinions:()Ljava/util/Set;
        26: aload_1
        27: invokeinterface #102,  2          // InterfaceMethod java/util/Set.remove:(Ljava/lang/Object;)Z
        32: pop
        33: return
      LineNumberTable:
        line 106: 0
        line 108: 14
        line 110: 19
        line 112: 33
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      34     0  this   Lext/mods/gameserver/model/spawn/MinionSpawn;
            0      34     1   npc   Lext/mods/gameserver/model/actor/Npc;
      StackMapTable: number_of_entries = 1
        frame_type = 33 /* same */

  public void doRespawn(ext.mods.gameserver.model.actor.Npc);
    descriptor: (Lext/mods/gameserver/model/actor/Npc;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #18                 // Field _master:Lext/mods/gameserver/model/actor/Npc;
         4: ifnull        17
         7: aload_0
         8: getfield      #18                 // Field _master:Lext/mods/gameserver/model/actor/Npc;
        11: invokevirtual #107                // Method ext/mods/gameserver/model/actor/Npc.isDead:()Z
        14: ifeq          18
        17: return
        18: aload_1
        19: invokevirtual #83                 // Method ext/mods/gameserver/model/actor/Npc.cancelRespawn:()V
        22: aload_1
        23: invokevirtual #111                // Method ext/mods/gameserver/model/actor/Npc.isDecayed:()Z
        26: ifeq          39
        29: aload_1
        30: invokevirtual #114                // Method ext/mods/gameserver/model/actor/Npc.refreshID:()V
        33: aload_0
        34: aload_1
        35: invokevirtual #117                // Method initializeAndSpawn:(Lext/mods/gameserver/model/actor/Npc;)Lext/mods/gameserver/model/actor/Npc;
        38: pop
        39: return
      LineNumberTable:
        line 117: 0
        line 118: 17
        line 120: 18
        line 122: 22
        line 124: 29
        line 126: 33
        line 128: 39
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      40     0  this   Lext/mods/gameserver/model/spawn/MinionSpawn;
            0      40     1   npc   Lext/mods/gameserver/model/actor/Npc;
      StackMapTable: number_of_entries = 3
        frame_type = 17 /* same */
        frame_type = 0 /* same */
        frame_type = 20 /* same */

  public long calculateRespawnDelay();
    descriptor: ()J
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=1
         0: aload_0
         1: getfield      #121                // Field _respawnDelay:I
         4: istore_1
         5: aload_0
         6: getfield      #125                // Field _respawnRandom:I
         9: ifle          27
        12: iload_1
        13: aload_0
        14: getfield      #125                // Field _respawnRandom:I
        17: ineg
        18: aload_0
        19: getfield      #125                // Field _respawnRandom:I
        22: invokestatic  #128                // Method ext/mods/commons/random/Rnd.get:(II)I
        25: iadd
        26: istore_1
        27: iload_1
        28: i2l
        29: lreturn
      LineNumberTable:
        line 133: 0
        line 135: 5
        line 136: 12
        line 138: 27
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      30     0  this   Lext/mods/gameserver/model/spawn/MinionSpawn;
            5      25     1 respawnTime   I
      StackMapTable: number_of_entries = 1
        frame_type = 252 /* append */
          offset_delta = 27
          locals = [ int ]

  public java.lang.String toString();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #134                // Method getNpcId:()I
         4: invokedynamic #137,  0            // InvokeDynamic #0:makeConcatWithConstants:(I)Ljava/lang/String;
         9: areturn
      LineNumberTable:
        line 144: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/gameserver/model/spawn/MinionSpawn;

  public java.lang.String getDescription();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #18                 // Field _master:Lext/mods/gameserver/model/actor/Npc;
         4: invokestatic  #141                // Method java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
         7: invokedynamic #147,  0            // InvokeDynamic #1:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
        12: areturn
      LineNumberTable:
        line 150: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      13     0  this   Lext/mods/gameserver/model/spawn/MinionSpawn;

  public void updateSpawnData();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=0, locals=1, args_size=1
         0: return
      LineNumberTable:
        line 156: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       1     0  this   Lext/mods/gameserver/model/spawn/MinionSpawn;

  public ext.mods.gameserver.model.actor.Npc doSpawn(boolean, ext.mods.gameserver.model.actor.Creature);
    descriptor: (ZLext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/model/actor/Npc;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=7, locals=5, args_size=3
         0: aload_0
         1: getfield      #150                // Field _constructor:Ljava/lang/reflect/Constructor;
         4: iconst_2
         5: anewarray     #154                // class java/lang/Object
         8: dup
         9: iconst_0
        10: invokestatic  #156                // Method ext/mods/gameserver/idfactory/IdFactory.getInstance:()Lext/mods/gameserver/idfactory/IdFactory;
        13: invokevirtual #161                // Method ext/mods/gameserver/idfactory/IdFactory.getNextId:()I
        16: invokestatic  #164                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        19: aastore
        20: dup
        21: iconst_1
        22: aload_0
        23: getfield      #42                 // Field _template:Lext/mods/gameserver/model/actor/template/NpcTemplate;
        26: aastore
        27: invokevirtual #169                // Method java/lang/reflect/Constructor.newInstance:([Ljava/lang/Object;)Ljava/lang/Object;
        30: checkcast     #33                 // class ext/mods/gameserver/model/actor/Npc
        33: astore_3
        34: aload_2
        35: ifnull        43
        38: aload_3
        39: aload_2
        40: putfield      #175                // Field ext/mods/gameserver/model/actor/Npc._summoner:Lext/mods/gameserver/model/actor/Creature;
        43: aload_3
        44: aload_0
        45: invokevirtual #179                // Method ext/mods/gameserver/model/actor/Npc.setSpawn:(Lext/mods/gameserver/model/spawn/ASpawn;)V
        48: aload_3
        49: iload_1
        50: invokevirtual #183                // Method ext/mods/gameserver/model/actor/Npc.setShowSummonAnimation:(Z)V
        53: aload_0
        54: getfield      #18                 // Field _master:Lext/mods/gameserver/model/actor/Npc;
        57: ifnull        96
        60: aload_3
        61: aload_0
        62: getfield      #18                 // Field _master:Lext/mods/gameserver/model/actor/Npc;
        65: invokevirtual #94                 // Method ext/mods/gameserver/model/actor/Npc.setMaster:(Lext/mods/gameserver/model/actor/Npc;)V
        68: aload_0
        69: getfield      #18                 // Field _master:Lext/mods/gameserver/model/actor/Npc;
        72: invokevirtual #187                // Method ext/mods/gameserver/model/actor/Npc.isRaidBoss:()Z
        75: ifeq          96
        78: aload_3
        79: instanceof    #190                // class ext/mods/gameserver/model/actor/instance/Monster
        82: ifeq          96
        85: aload_3
        86: checkcast     #190                // class ext/mods/gameserver/model/actor/instance/Monster
        89: astore        4
        91: aload         4
        93: invokevirtual #192                // Method ext/mods/gameserver/model/actor/instance/Monster.setRaidRelated:()V
        96: aload_0
        97: aload_3
        98: invokevirtual #117                // Method initializeAndSpawn:(Lext/mods/gameserver/model/actor/Npc;)Lext/mods/gameserver/model/actor/Npc;
       101: areturn
       102: astore_3
       103: getstatic     #197                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       106: ldc           #201                // String Error during spawn, NPC id={}
       108: aload_3
       109: iconst_1
       110: anewarray     #154                // class java/lang/Object
       113: dup
       114: iconst_0
       115: aload_0
       116: getfield      #42                 // Field _template:Lext/mods/gameserver/model/actor/template/NpcTemplate;
       119: invokevirtual #203                // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getNpcId:()I
       122: invokestatic  #164                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       125: aastore
       126: invokevirtual #204                // Method ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
       129: aconst_null
       130: areturn
      Exception table:
         from    to  target type
             0   101   102   Class java/lang/Exception
      LineNumberTable:
        line 163: 0
        line 165: 34
        line 166: 38
        line 168: 43
        line 169: 48
        line 171: 53
        line 173: 60
        line 175: 68
        line 176: 91
        line 179: 96
        line 181: 102
        line 183: 103
        line 184: 129
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           91       5     4 monster   Lext/mods/gameserver/model/actor/instance/Monster;
           34      68     3   npc   Lext/mods/gameserver/model/actor/Npc;
          103      28     3     e   Ljava/lang/Exception;
            0     131     0  this   Lext/mods/gameserver/model/spawn/MinionSpawn;
            0     131     1 isSummonSpawn   Z
            0     131     2 summoner   Lext/mods/gameserver/model/actor/Creature;
      StackMapTable: number_of_entries = 3
        frame_type = 252 /* append */
          offset_delta = 43
          locals = [ class ext/mods/gameserver/model/actor/Npc ]
        frame_type = 52 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 5
          locals = [ class ext/mods/gameserver/model/spawn/MinionSpawn, int, class ext/mods/gameserver/model/actor/Creature ]
          stack = [ class java/lang/Exception ]

  public ext.mods.gameserver.model.actor.Npc doSpawn(boolean, int, int, int);
    descriptor: (ZIII)Lext/mods/gameserver/model/actor/Npc;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=7, locals=7, args_size=5
         0: aload_0
         1: getfield      #150                // Field _constructor:Ljava/lang/reflect/Constructor;
         4: iconst_2
         5: anewarray     #154                // class java/lang/Object
         8: dup
         9: iconst_0
        10: invokestatic  #156                // Method ext/mods/gameserver/idfactory/IdFactory.getInstance:()Lext/mods/gameserver/idfactory/IdFactory;
        13: invokevirtual #161                // Method ext/mods/gameserver/idfactory/IdFactory.getNextId:()I
        16: invokestatic  #164                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        19: aastore
        20: dup
        21: iconst_1
        22: aload_0
        23: getfield      #42                 // Field _template:Lext/mods/gameserver/model/actor/template/NpcTemplate;
        26: aastore
        27: invokevirtual #169                // Method java/lang/reflect/Constructor.newInstance:([Ljava/lang/Object;)Ljava/lang/Object;
        30: checkcast     #33                 // class ext/mods/gameserver/model/actor/Npc
        33: astore        5
        35: aload         5
        37: iload_2
        38: putfield      #210                // Field ext/mods/gameserver/model/actor/Npc._param1:I
        41: aload         5
        43: iload_3
        44: putfield      #213                // Field ext/mods/gameserver/model/actor/Npc._param2:I
        47: aload         5
        49: iload         4
        51: putfield      #216                // Field ext/mods/gameserver/model/actor/Npc._param3:I
        54: aload         5
        56: aload_0
        57: invokevirtual #179                // Method ext/mods/gameserver/model/actor/Npc.setSpawn:(Lext/mods/gameserver/model/spawn/ASpawn;)V
        60: aload         5
        62: iload_1
        63: invokevirtual #183                // Method ext/mods/gameserver/model/actor/Npc.setShowSummonAnimation:(Z)V
        66: aload_0
        67: getfield      #18                 // Field _master:Lext/mods/gameserver/model/actor/Npc;
        70: ifnull        112
        73: aload         5
        75: aload_0
        76: getfield      #18                 // Field _master:Lext/mods/gameserver/model/actor/Npc;
        79: invokevirtual #94                 // Method ext/mods/gameserver/model/actor/Npc.setMaster:(Lext/mods/gameserver/model/actor/Npc;)V
        82: aload_0
        83: getfield      #18                 // Field _master:Lext/mods/gameserver/model/actor/Npc;
        86: invokevirtual #187                // Method ext/mods/gameserver/model/actor/Npc.isRaidBoss:()Z
        89: ifeq          112
        92: aload         5
        94: instanceof    #190                // class ext/mods/gameserver/model/actor/instance/Monster
        97: ifeq          112
       100: aload         5
       102: checkcast     #190                // class ext/mods/gameserver/model/actor/instance/Monster
       105: astore        6
       107: aload         6
       109: invokevirtual #192                // Method ext/mods/gameserver/model/actor/instance/Monster.setRaidRelated:()V
       112: aload_0
       113: aload         5
       115: invokevirtual #117                // Method initializeAndSpawn:(Lext/mods/gameserver/model/actor/Npc;)Lext/mods/gameserver/model/actor/Npc;
       118: areturn
       119: astore        5
       121: getstatic     #197                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       124: ldc           #201                // String Error during spawn, NPC id={}
       126: aload         5
       128: iconst_1
       129: anewarray     #154                // class java/lang/Object
       132: dup
       133: iconst_0
       134: aload_0
       135: getfield      #42                 // Field _template:Lext/mods/gameserver/model/actor/template/NpcTemplate;
       138: invokevirtual #203                // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getNpcId:()I
       141: invokestatic  #164                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       144: aastore
       145: invokevirtual #204                // Method ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
       148: aconst_null
       149: areturn
      Exception table:
         from    to  target type
             0   118   119   Class java/lang/Exception
      LineNumberTable:
        line 192: 0
        line 193: 35
        line 194: 41
        line 195: 47
        line 197: 54
        line 198: 60
        line 200: 66
        line 202: 73
        line 204: 82
        line 205: 107
        line 208: 112
        line 210: 119
        line 212: 121
        line 213: 148
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          107       5     6 monster   Lext/mods/gameserver/model/actor/instance/Monster;
           35      84     5   npc   Lext/mods/gameserver/model/actor/Npc;
          121      29     5     e   Ljava/lang/Exception;
            0     150     0  this   Lext/mods/gameserver/model/spawn/MinionSpawn;
            0     150     1 isSummonSpawn   Z
            0     150     2 param1   I
            0     150     3 param2   I
            0     150     4 param3   I
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 112
          locals = [ class ext/mods/gameserver/model/actor/Npc ]
        frame_type = 255 /* full_frame */
          offset_delta = 6
          locals = [ class ext/mods/gameserver/model/spawn/MinionSpawn, int, int, int, int ]
          stack = [ class java/lang/Exception ]

  public ext.mods.gameserver.model.actor.Npc initializeAndSpawn(ext.mods.gameserver.model.actor.Npc);
    descriptor: (Lext/mods/gameserver/model/actor/Npc;)Lext/mods/gameserver/model/actor/Npc;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=7, args_size=2
         0: aload_1
         1: invokevirtual #219                // Method ext/mods/gameserver/model/actor/Npc.stopAllEffects:()V
         4: aload_1
         5: iconst_0
         6: invokevirtual #222                // Method ext/mods/gameserver/model/actor/Npc.setScriptValue:(I)V
         9: aload_1
        10: iconst_0
        11: invokevirtual #225                // Method ext/mods/gameserver/model/actor/Npc.setIsDead:(Z)V
        14: aload_1
        15: iconst_0
        16: invokevirtual #228                // Method ext/mods/gameserver/model/actor/Npc.setDecayed:(Z)V
        19: aload_1
        20: invokevirtual #231                // Method ext/mods/gameserver/model/actor/Npc.getStatus:()Lext/mods/gameserver/model/actor/status/NpcStatus;
        23: invokevirtual #235                // Method ext/mods/gameserver/model/actor/status/NpcStatus.initializeValues:()V
        26: aload_0
        27: invokevirtual #240                // Method getSpawnLocation:()Lext/mods/gameserver/model/location/SpawnLocation;
        30: astore_2
        31: aload_2
        32: ifnonnull     53
        35: getstatic     #197                // Field LOGGER:Lext/mods/commons/logging/CLogger;
        38: ldc           #243                // String {} misses location informations.
        40: iconst_1
        41: anewarray     #154                // class java/lang/Object
        44: dup
        45: iconst_0
        46: aload_0
        47: aastore
        48: invokevirtual #245                // Method ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;[Ljava/lang/Object;)V
        51: aconst_null
        52: areturn
        53: aload_1
        54: invokevirtual #231                // Method ext/mods/gameserver/model/actor/Npc.getStatus:()Lext/mods/gameserver/model/actor/status/NpcStatus;
        57: invokevirtual #248                // Method ext/mods/gameserver/model/actor/status/NpcStatus.getMaxHp:()I
        60: i2d
        61: dstore_3
        62: aload_1
        63: invokevirtual #231                // Method ext/mods/gameserver/model/actor/Npc.getStatus:()Lext/mods/gameserver/model/actor/status/NpcStatus;
        66: invokevirtual #251                // Method ext/mods/gameserver/model/actor/status/NpcStatus.getMaxMp:()I
        69: i2d
        70: dstore        5
        72: aload_1
        73: invokevirtual #231                // Method ext/mods/gameserver/model/actor/Npc.getStatus:()Lext/mods/gameserver/model/actor/status/NpcStatus;
        76: dload_3
        77: dload         5
        79: invokevirtual #254                // Method ext/mods/gameserver/model/actor/status/NpcStatus.setHpMp:(DD)V
        82: aload_1
        83: aload_2
        84: invokevirtual #258                // Method ext/mods/gameserver/model/actor/Npc.setSpawnLocation:(Lext/mods/gameserver/model/location/SpawnLocation;)V
        87: aload_1
        88: aload_2
        89: invokevirtual #262                // Method ext/mods/gameserver/model/actor/Npc.spawnMe:(Lext/mods/gameserver/model/location/SpawnLocation;)V
        92: aload_1
        93: areturn
      LineNumberTable:
        line 220: 0
        line 221: 4
        line 223: 9
        line 224: 14
        line 226: 19
        line 228: 26
        line 229: 31
        line 231: 35
        line 232: 51
        line 235: 53
        line 236: 62
        line 238: 72
        line 240: 82
        line 241: 87
        line 243: 92
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      94     0  this   Lext/mods/gameserver/model/spawn/MinionSpawn;
            0      94     1   npc   Lext/mods/gameserver/model/actor/Npc;
           31      63     2   loc   Lext/mods/gameserver/model/location/SpawnLocation;
           62      32     3 maxHp   D
           72      22     5 maxMp   D
      StackMapTable: number_of_entries = 1
        frame_type = 252 /* append */
          offset_delta = 53
          locals = [ class ext/mods/gameserver/model/location/SpawnLocation ]

  public ext.mods.gameserver.model.actor.Npc getNpc();
    descriptor: ()Lext/mods/gameserver/model/actor/Npc;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #80                 // Field _npc:Lext/mods/gameserver/model/actor/Npc;
         4: areturn
      LineNumberTable:
        line 252: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/spawn/MinionSpawn;

  public void sendScriptEvent(int, int, int);
    descriptor: (III)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=4, args_size=4
         0: aload_0
         1: getfield      #80                 // Field _npc:Lext/mods/gameserver/model/actor/Npc;
         4: iload_1
         5: iload_2
         6: iload_3
         7: invokevirtual #265                // Method ext/mods/gameserver/model/actor/Npc.sendScriptEvent:(III)V
        10: return
      LineNumberTable:
        line 258: 0
        line 259: 10
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      11     0  this   Lext/mods/gameserver/model/spawn/MinionSpawn;
            0      11     1 eventId   I
            0      11     2  arg1   I
            0      11     3  arg2   I

  public ext.mods.gameserver.model.actor.Npc getMaster();
    descriptor: ()Lext/mods/gameserver/model/actor/Npc;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #18                 // Field _master:Lext/mods/gameserver/model/actor/Npc;
         4: areturn
      LineNumberTable:
        line 266: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/spawn/MinionSpawn;

  public void setLoc(ext.mods.gameserver.model.location.SpawnLocation);
    descriptor: (Lext/mods/gameserver/model/location/SpawnLocation;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=7, locals=3, args_size=2
         0: aload_1
         1: invokevirtual #269                // Method ext/mods/gameserver/model/location/SpawnLocation.getZ:()I
         4: getstatic     #272                // Field ext/mods/Config.NPC_Z_INDEX:I
         7: isub
         8: istore_2
         9: aload_0
        10: getfield      #12                 // Field _loc:Lext/mods/gameserver/model/location/SpawnLocation;
        13: aload_1
        14: invokevirtual #277                // Method ext/mods/gameserver/model/location/SpawnLocation.getX:()I
        17: aload_1
        18: invokevirtual #280                // Method ext/mods/gameserver/model/location/SpawnLocation.getY:()I
        21: invokestatic  #60                 // Method ext/mods/gameserver/geoengine/GeoEngine.getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
        24: aload_1
        25: invokevirtual #277                // Method ext/mods/gameserver/model/location/SpawnLocation.getX:()I
        28: aload_1
        29: invokevirtual #280                // Method ext/mods/gameserver/model/location/SpawnLocation.getY:()I
        32: iload_2
        33: invokevirtual #283                // Method ext/mods/gameserver/geoengine/GeoEngine.getHeight:(III)S
        36: aload_1
        37: invokevirtual #287                // Method ext/mods/gameserver/model/location/SpawnLocation.getHeading:()I
        40: invokevirtual #290                // Method ext/mods/gameserver/model/location/SpawnLocation.set:(IIII)V
        43: return
      LineNumberTable:
        line 271: 0
        line 272: 9
        line 273: 43
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      44     0  this   Lext/mods/gameserver/model/spawn/MinionSpawn;
            0      44     1   loc   Lext/mods/gameserver/model/location/SpawnLocation;
            9      35     2 biasedZ   I

  public void setLoc(int, int, int, int);
    descriptor: (IIII)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=8, locals=5, args_size=5
         0: aload_0
         1: getfield      #12                 // Field _loc:Lext/mods/gameserver/model/location/SpawnLocation;
         4: iload_1
         5: iload_2
         6: invokestatic  #60                 // Method ext/mods/gameserver/geoengine/GeoEngine.getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
         9: iload_1
        10: iload_2
        11: iload_3
        12: getstatic     #272                // Field ext/mods/Config.NPC_Z_INDEX:I
        15: isub
        16: invokevirtual #283                // Method ext/mods/gameserver/geoengine/GeoEngine.getHeight:(III)S
        19: iload         4
        21: invokevirtual #290                // Method ext/mods/gameserver/model/location/SpawnLocation.set:(IIII)V
        24: return
      LineNumberTable:
        line 277: 0
        line 278: 24
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      25     0  this   Lext/mods/gameserver/model/spawn/MinionSpawn;
            0      25     1     x   I
            0      25     2     y   I
            0      25     3     z   I
            0      25     4 heading   I
}
SourceFile: "MinionSpawn.java"
BootstrapMethods:
  0: #371 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #367 Spawn [id=\u0001]
  1: #371 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #369 Master: \u0001
InnerClasses:
  public static final #382= #378 of #380; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
