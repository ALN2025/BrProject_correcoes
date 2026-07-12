// Bytecode for: ext.mods.gameserver.model.spawn.MultiSpawn
// File: ext\mods\gameserver\model\spawn\MultiSpawn.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/spawn/MultiSpawn.class
  Last modified 9 de jul de 2026; size 14894 bytes
  MD5 checksum 6e62ef6d79e611bfedc178641a6573fc
  Compiled from "MultiSpawn.java"
public final class ext.mods.gameserver.model.spawn.MultiSpawn extends ext.mods.gameserver.model.spawn.ASpawn
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #14                         // ext/mods/gameserver/model/spawn/MultiSpawn
  super_class: #2                         // ext/mods/gameserver/model/spawn/ASpawn
  interfaces: 0, fields: 6, methods: 30, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/gameserver/model/spawn/ASpawn."<init>":(Lext/mods/gameserver/model/actor/template/NpcTemplate;)V
    #2 = Class              #4            // ext/mods/gameserver/model/spawn/ASpawn
    #3 = NameAndType        #5:#6         // "<init>":(Lext/mods/gameserver/model/actor/template/NpcTemplate;)V
    #4 = Utf8               ext/mods/gameserver/model/spawn/ASpawn
    #5 = Utf8               <init>
    #6 = Utf8               (Lext/mods/gameserver/model/actor/template/NpcTemplate;)V
    #7 = Methodref          #8.#9         // java/util/concurrent/ConcurrentHashMap.newKeySet:()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;
    #8 = Class              #10           // java/util/concurrent/ConcurrentHashMap
    #9 = NameAndType        #11:#12       // newKeySet:()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;
   #10 = Utf8               java/util/concurrent/ConcurrentHashMap
   #11 = Utf8               newKeySet
   #12 = Utf8               ()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;
   #13 = Fieldref           #14.#15       // ext/mods/gameserver/model/spawn/MultiSpawn._npcs:Ljava/util/Set;
   #14 = Class              #16           // ext/mods/gameserver/model/spawn/MultiSpawn
   #15 = NameAndType        #17:#18       // _npcs:Ljava/util/Set;
   #16 = Utf8               ext/mods/gameserver/model/spawn/MultiSpawn
   #17 = Utf8               _npcs
   #18 = Utf8               Ljava/util/Set;
   #19 = Class              #20           // java/util/concurrent/atomic/AtomicInteger
   #20 = Utf8               java/util/concurrent/atomic/AtomicInteger
   #21 = Methodref          #19.#22       // java/util/concurrent/atomic/AtomicInteger."<init>":(I)V
   #22 = NameAndType        #5:#23        // "<init>":(I)V
   #23 = Utf8               (I)V
   #24 = Fieldref           #14.#25       // ext/mods/gameserver/model/spawn/MultiSpawn._spawnedCount:Ljava/util/concurrent/atomic/AtomicInteger;
   #25 = NameAndType        #26:#27       // _spawnedCount:Ljava/util/concurrent/atomic/AtomicInteger;
   #26 = Utf8               _spawnedCount
   #27 = Utf8               Ljava/util/concurrent/atomic/AtomicInteger;
   #28 = Methodref          #29.#30       // java/lang/Math.max:(II)I
   #29 = Class              #31           // java/lang/Math
   #30 = NameAndType        #32:#33       // max:(II)I
   #31 = Utf8               java/lang/Math
   #32 = Utf8               max
   #33 = Utf8               (II)I
   #34 = Fieldref           #14.#35       // ext/mods/gameserver/model/spawn/MultiSpawn._respawnDelay:I
   #35 = NameAndType        #36:#37       // _respawnDelay:I
   #36 = Utf8               _respawnDelay
   #37 = Utf8               I
   #38 = Methodref          #29.#39       // java/lang/Math.min:(II)I
   #39 = NameAndType        #40:#33       // min:(II)I
   #40 = Utf8               min
   #41 = Fieldref           #14.#42       // ext/mods/gameserver/model/spawn/MultiSpawn._respawnRandom:I
   #42 = NameAndType        #43:#37       // _respawnRandom:I
   #43 = Utf8               _respawnRandom
   #44 = Fieldref           #14.#45       // ext/mods/gameserver/model/spawn/MultiSpawn._privateData:Ljava/util/List;
   #45 = NameAndType        #46:#47       // _privateData:Ljava/util/List;
   #46 = Utf8               _privateData
   #47 = Utf8               Ljava/util/List;
   #48 = Fieldref           #14.#49       // ext/mods/gameserver/model/spawn/MultiSpawn._aiParams:Lext/mods/gameserver/model/memo/SpawnMemo;
   #49 = NameAndType        #50:#51       // _aiParams:Lext/mods/gameserver/model/memo/SpawnMemo;
   #50 = Utf8               _aiParams
   #51 = Utf8               Lext/mods/gameserver/model/memo/SpawnMemo;
   #52 = Fieldref           #14.#53       // ext/mods/gameserver/model/spawn/MultiSpawn._npcMaker:Lext/mods/gameserver/model/spawn/NpcMaker;
   #53 = NameAndType        #54:#55       // _npcMaker:Lext/mods/gameserver/model/spawn/NpcMaker;
   #54 = Utf8               _npcMaker
   #55 = Utf8               Lext/mods/gameserver/model/spawn/NpcMaker;
   #56 = Fieldref           #14.#57       // ext/mods/gameserver/model/spawn/MultiSpawn._coords:[[I
   #57 = NameAndType        #58:#59       // _coords:[[I
   #58 = Utf8               _coords
   #59 = Utf8               [[I
   #60 = Fieldref           #14.#61       // ext/mods/gameserver/model/spawn/MultiSpawn._spawnData:Lext/mods/gameserver/model/spawn/SpawnData;
   #61 = NameAndType        #62:#63       // _spawnData:Lext/mods/gameserver/model/spawn/SpawnData;
   #62 = Utf8               _spawnData
   #63 = Utf8               Lext/mods/gameserver/model/spawn/SpawnData;
   #64 = Fieldref           #14.#65       // ext/mods/gameserver/model/spawn/MultiSpawn._total:I
   #65 = NameAndType        #66:#37       // _total:I
   #66 = Utf8               _total
   #67 = Fieldref           #68.#69       // ext/mods/Config.SPAWN_MULTIPLIER:D
   #68 = Class              #70           // ext/mods/Config
   #69 = NameAndType        #71:#72       // SPAWN_MULTIPLIER:D
   #70 = Utf8               ext/mods/Config
   #71 = Utf8               SPAWN_MULTIPLIER
   #72 = Utf8               D
   #73 = Methodref          #29.#74       // java/lang/Math.round:(D)J
   #74 = NameAndType        #75:#76       // round:(D)J
   #75 = Utf8               round
   #76 = Utf8               (D)J
   #77 = InterfaceMethodref #78.#79       // java/util/Set.isEmpty:()Z
   #78 = Class              #80           // java/util/Set
   #79 = NameAndType        #81:#82       // isEmpty:()Z
   #80 = Utf8               java/util/Set
   #81 = Utf8               isEmpty
   #82 = Utf8               ()Z
   #83 = InterfaceMethodref #78.#84       // java/util/Set.iterator:()Ljava/util/Iterator;
   #84 = NameAndType        #85:#86       // iterator:()Ljava/util/Iterator;
   #85 = Utf8               iterator
   #86 = Utf8               ()Ljava/util/Iterator;
   #87 = InterfaceMethodref #88.#89       // java/util/Iterator.hasNext:()Z
   #88 = Class              #90           // java/util/Iterator
   #89 = NameAndType        #91:#82       // hasNext:()Z
   #90 = Utf8               java/util/Iterator
   #91 = Utf8               hasNext
   #92 = InterfaceMethodref #88.#93       // java/util/Iterator.next:()Ljava/lang/Object;
   #93 = NameAndType        #94:#95       // next:()Ljava/lang/Object;
   #94 = Utf8               next
   #95 = Utf8               ()Ljava/lang/Object;
   #96 = Class              #97           // ext/mods/gameserver/model/actor/Npc
   #97 = Utf8               ext/mods/gameserver/model/actor/Npc
   #98 = Methodref          #96.#99       // ext/mods/gameserver/model/actor/Npc.isDecayed:()Z
   #99 = NameAndType        #100:#82      // isDecayed:()Z
  #100 = Utf8               isDecayed
  #101 = Methodref          #102.#103     // ext/mods/gameserver/model/spawn/NpcMaker.getTerritory:()Lext/mods/commons/geometry/Territory;
  #102 = Class              #104          // ext/mods/gameserver/model/spawn/NpcMaker
  #103 = NameAndType        #105:#106     // getTerritory:()Lext/mods/commons/geometry/Territory;
  #104 = Utf8               ext/mods/gameserver/model/spawn/NpcMaker
  #105 = Utf8               getTerritory
  #106 = Utf8               ()Lext/mods/commons/geometry/Territory;
  #107 = Methodref          #102.#108     // ext/mods/gameserver/model/spawn/NpcMaker.getBannedTerritory:()Lext/mods/commons/geometry/Territory;
  #108 = NameAndType        #109:#106     // getBannedTerritory:()Lext/mods/commons/geometry/Territory;
  #109 = Utf8               getBannedTerritory
  #110 = Methodref          #111.#112     // ext/mods/commons/geometry/Territory.getRandomGeoLocation:(Lext/mods/commons/geometry/Territory;)Lext/mods/gameserver/model/location/SpawnLocation;
  #111 = Class              #113          // ext/mods/commons/geometry/Territory
  #112 = NameAndType        #114:#115     // getRandomGeoLocation:(Lext/mods/commons/geometry/Territory;)Lext/mods/gameserver/model/location/SpawnLocation;
  #113 = Utf8               ext/mods/commons/geometry/Territory
  #114 = Utf8               getRandomGeoLocation
  #115 = Utf8               (Lext/mods/commons/geometry/Territory;)Lext/mods/gameserver/model/location/SpawnLocation;
  #116 = Class              #117          // ext/mods/gameserver/model/location/SpawnLocation
  #117 = Utf8               ext/mods/gameserver/model/location/SpawnLocation
  #118 = Methodref          #116.#119     // ext/mods/gameserver/model/location/SpawnLocation."<init>":(IIII)V
  #119 = NameAndType        #5:#120       // "<init>":(IIII)V
  #120 = Utf8               (IIII)V
  #121 = Methodref          #122.#123     // ext/mods/gameserver/geoengine/GeoEngine.getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
  #122 = Class              #124          // ext/mods/gameserver/geoengine/GeoEngine
  #123 = NameAndType        #125:#126     // getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
  #124 = Utf8               ext/mods/gameserver/geoengine/GeoEngine
  #125 = Utf8               getInstance
  #126 = Utf8               ()Lext/mods/gameserver/geoengine/GeoEngine;
  #127 = Methodref          #116.#128     // ext/mods/gameserver/model/location/SpawnLocation.getX:()I
  #128 = NameAndType        #129:#130     // getX:()I
  #129 = Utf8               getX
  #130 = Utf8               ()I
  #131 = Methodref          #116.#132     // ext/mods/gameserver/model/location/SpawnLocation.getY:()I
  #132 = NameAndType        #133:#130     // getY:()I
  #133 = Utf8               getY
  #134 = Methodref          #116.#135     // ext/mods/gameserver/model/location/SpawnLocation.getZ:()I
  #135 = NameAndType        #136:#130     // getZ:()I
  #136 = Utf8               getZ
  #137 = Fieldref           #68.#138      // ext/mods/Config.NPC_Z_INDEX:I
  #138 = NameAndType        #139:#37      // NPC_Z_INDEX:I
  #139 = Utf8               NPC_Z_INDEX
  #140 = Methodref          #122.#141     // ext/mods/gameserver/geoengine/GeoEngine.getHeight:(III)S
  #141 = NameAndType        #142:#143     // getHeight:(III)S
  #142 = Utf8               getHeight
  #143 = Utf8               (III)S
  #144 = Methodref          #116.#145     // ext/mods/gameserver/model/location/SpawnLocation.setZ:(I)V
  #145 = NameAndType        #146:#23      // setZ:(I)V
  #146 = Utf8               setZ
  #147 = Methodref          #148.#149     // ext/mods/commons/random/Rnd.get:(I)I
  #148 = Class              #150          // ext/mods/commons/random/Rnd
  #149 = NameAndType        #151:#152     // get:(I)I
  #150 = Utf8               ext/mods/commons/random/Rnd
  #151 = Utf8               get
  #152 = Utf8               (I)I
  #153 = Integer            65536
  #154 = Methodref          #96.#155      // ext/mods/gameserver/model/actor/Npc.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
  #155 = NameAndType        #156:#157     // getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
  #156 = Utf8               getPosition
  #157 = Utf8               ()Lext/mods/gameserver/model/location/SpawnLocation;
  #158 = Methodref          #116.#159     // ext/mods/gameserver/model/location/SpawnLocation.clone:()Lext/mods/gameserver/model/location/SpawnLocation;
  #159 = NameAndType        #160:#157     // clone:()Lext/mods/gameserver/model/location/SpawnLocation;
  #160 = Utf8               clone
  #161 = Methodref          #111.#162     // ext/mods/commons/geometry/Territory.isInside:(Lext/mods/gameserver/model/location/Location;)Z
  #162 = NameAndType        #163:#164     // isInside:(Lext/mods/gameserver/model/location/Location;)Z
  #163 = Utf8               isInside
  #164 = Utf8               (Lext/mods/gameserver/model/location/Location;)Z
  #165 = Methodref          #111.#166     // ext/mods/commons/geometry/Territory.getRandomGeoLocation:()Lext/mods/gameserver/model/location/SpawnLocation;
  #166 = NameAndType        #114:#157     // getRandomGeoLocation:()Lext/mods/gameserver/model/location/SpawnLocation;
  #167 = Methodref          #168.#169     // ext/mods/gameserver/model/location/Location.set:(Lext/mods/gameserver/model/location/Location;)V
  #168 = Class              #170          // ext/mods/gameserver/model/location/Location
  #169 = NameAndType        #171:#172     // set:(Lext/mods/gameserver/model/location/Location;)V
  #170 = Utf8               ext/mods/gameserver/model/location/Location
  #171 = Utf8               set
  #172 = Utf8               (Lext/mods/gameserver/model/location/Location;)V
  #173 = Methodref          #148.#174     // ext/mods/commons/random/Rnd.get:(II)I
  #174 = NameAndType        #151:#33      // get:(II)I
  #175 = Methodref          #168.#176     // ext/mods/gameserver/model/location/Location.addRandomOffsetBetween:(II)V
  #176 = NameAndType        #177:#178     // addRandomOffsetBetween:(II)V
  #177 = Utf8               addRandomOffsetBetween
  #178 = Utf8               (II)V
  #179 = Methodref          #122.#180     // ext/mods/gameserver/geoengine/GeoEngine.getValidLocation:(Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/location/Location;)Lext/mods/gameserver/model/location/Location;
  #180 = NameAndType        #181:#182     // getValidLocation:(Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/location/Location;)Lext/mods/gameserver/model/location/Location;
  #181 = Utf8               getValidLocation
  #182 = Utf8               (Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/location/Location;)Lext/mods/gameserver/model/location/Location;
  #183 = Methodref          #96.#184      // ext/mods/gameserver/model/actor/Npc.getSpawnLocation:()Lext/mods/gameserver/model/location/SpawnLocation;
  #184 = NameAndType        #185:#157     // getSpawnLocation:()Lext/mods/gameserver/model/location/SpawnLocation;
  #185 = Utf8               getSpawnLocation
  #186 = Methodref          #187.#155     // ext/mods/gameserver/model/WorldObject.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
  #187 = Class              #188          // ext/mods/gameserver/model/WorldObject
  #188 = Utf8               ext/mods/gameserver/model/WorldObject
  #189 = Methodref          #96.#190      // ext/mods/gameserver/model/actor/Npc.isReadyForRespawn:()Z
  #190 = NameAndType        #191:#82      // isReadyForRespawn:()Z
  #191 = Utf8               isReadyForRespawn
  #192 = Methodref          #96.#193      // ext/mods/gameserver/model/actor/Npc.setReadyForRespawn:(Z)V
  #193 = NameAndType        #194:#195     // setReadyForRespawn:(Z)V
  #194 = Utf8               setReadyForRespawn
  #195 = Utf8               (Z)V
  #196 = InterfaceMethodref #78.#197      // java/util/Set.remove:(Ljava/lang/Object;)Z
  #197 = NameAndType        #198:#199     // remove:(Ljava/lang/Object;)Z
  #198 = Utf8               remove
  #199 = Utf8               (Ljava/lang/Object;)Z
  #200 = Methodref          #14.#201      // ext/mods/gameserver/model/spawn/MultiSpawn.doRespawn:(Lext/mods/gameserver/model/actor/Npc;)V
  #201 = NameAndType        #202:#203     // doRespawn:(Lext/mods/gameserver/model/actor/Npc;)V
  #202 = Utf8               doRespawn
  #203 = Utf8               (Lext/mods/gameserver/model/actor/Npc;)V
  #204 = InterfaceMethodref #78.#205      // java/util/Set.add:(Ljava/lang/Object;)Z
  #205 = NameAndType        #206:#199     // add:(Ljava/lang/Object;)Z
  #206 = Utf8               add
  #207 = Methodref          #2.#208       // ext/mods/gameserver/model/spawn/ASpawn.doSpawn:(ZLext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/model/actor/Npc;
  #208 = NameAndType        #209:#210     // doSpawn:(ZLext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/model/actor/Npc;
  #209 = Utf8               doSpawn
  #210 = Utf8               (ZLext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/model/actor/Npc;
  #211 = Fieldref           #14.#212      // ext/mods/gameserver/model/spawn/MultiSpawn.LOGGER:Lext/mods/commons/logging/CLogger;
  #212 = NameAndType        #213:#214     // LOGGER:Lext/mods/commons/logging/CLogger;
  #213 = Utf8               LOGGER
  #214 = Utf8               Lext/mods/commons/logging/CLogger;
  #215 = String             #216          // Can not spawn id {} from maker {}.
  #216 = Utf8               Can not spawn id {} from maker {}.
  #217 = Class              #218          // java/lang/Object
  #218 = Utf8               java/lang/Object
  #219 = Methodref          #14.#220      // ext/mods/gameserver/model/spawn/MultiSpawn.getNpcId:()I
  #220 = NameAndType        #221:#130     // getNpcId:()I
  #221 = Utf8               getNpcId
  #222 = Methodref          #223.#224     // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
  #223 = Class              #225          // java/lang/Integer
  #224 = NameAndType        #226:#227     // valueOf:(I)Ljava/lang/Integer;
  #225 = Utf8               java/lang/Integer
  #226 = Utf8               valueOf
  #227 = Utf8               (I)Ljava/lang/Integer;
  #228 = Methodref          #102.#229     // ext/mods/gameserver/model/spawn/NpcMaker.getName:()Ljava/lang/String;
  #229 = NameAndType        #230:#231     // getName:()Ljava/lang/String;
  #230 = Utf8               getName
  #231 = Utf8               ()Ljava/lang/String;
  #232 = Methodref          #233.#234     // ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;[Ljava/lang/Object;)V
  #233 = Class              #235          // ext/mods/commons/logging/CLogger
  #234 = NameAndType        #236:#237     // warn:(Ljava/lang/Object;[Ljava/lang/Object;)V
  #235 = Utf8               ext/mods/commons/logging/CLogger
  #236 = Utf8               warn
  #237 = Utf8               (Ljava/lang/Object;[Ljava/lang/Object;)V
  #238 = Methodref          #102.#239     // ext/mods/gameserver/model/spawn/NpcMaker.getMakerSpawnTime:()Lext/mods/gameserver/enums/MakerSpawnTime;
  #239 = NameAndType        #240:#241     // getMakerSpawnTime:()Lext/mods/gameserver/enums/MakerSpawnTime;
  #240 = Utf8               getMakerSpawnTime
  #241 = Utf8               ()Lext/mods/gameserver/enums/MakerSpawnTime;
  #242 = Fieldref           #243.#244     // ext/mods/gameserver/enums/MakerSpawnTime.DOOR_OPEN:Lext/mods/gameserver/enums/MakerSpawnTime;
  #243 = Class              #245          // ext/mods/gameserver/enums/MakerSpawnTime
  #244 = NameAndType        #246:#247     // DOOR_OPEN:Lext/mods/gameserver/enums/MakerSpawnTime;
  #245 = Utf8               ext/mods/gameserver/enums/MakerSpawnTime
  #246 = Utf8               DOOR_OPEN
  #247 = Utf8               Lext/mods/gameserver/enums/MakerSpawnTime;
  #248 = Methodref          #102.#249     // ext/mods/gameserver/model/spawn/NpcMaker.getMakerSpawnTimeParams:()[Ljava/lang/String;
  #249 = NameAndType        #250:#251     // getMakerSpawnTimeParams:()[Ljava/lang/String;
  #250 = Utf8               getMakerSpawnTimeParams
  #251 = Utf8               ()[Ljava/lang/String;
  #252 = Methodref          #96.#253      // ext/mods/gameserver/model/actor/Npc.setResidence:(Ljava/lang/String;)V
  #253 = NameAndType        #254:#255     // setResidence:(Ljava/lang/String;)V
  #254 = Utf8               setResidence
  #255 = Utf8               (Ljava/lang/String;)V
  #256 = Methodref          #257.#258     // ext/mods/gameserver/data/xml/StaticSpawnData.getInstance:()Lext/mods/gameserver/data/xml/StaticSpawnData;
  #257 = Class              #259          // ext/mods/gameserver/data/xml/StaticSpawnData
  #258 = NameAndType        #125:#260     // getInstance:()Lext/mods/gameserver/data/xml/StaticSpawnData;
  #259 = Utf8               ext/mods/gameserver/data/xml/StaticSpawnData
  #260 = Utf8               ()Lext/mods/gameserver/data/xml/StaticSpawnData;
  #261 = Methodref          #14.#262      // ext/mods/gameserver/model/spawn/MultiSpawn.getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #262 = NameAndType        #263:#264     // getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #263 = Utf8               getTemplate
  #264 = Utf8               ()Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #265 = Methodref          #266.#220     // ext/mods/gameserver/model/actor/template/NpcTemplate.getNpcId:()I
  #266 = Class              #267          // ext/mods/gameserver/model/actor/template/NpcTemplate
  #267 = Utf8               ext/mods/gameserver/model/actor/template/NpcTemplate
  #268 = Methodref          #257.#269     // ext/mods/gameserver/data/xml/StaticSpawnData.getById:(I)Lext/mods/gameserver/model/records/custom/StaticSpawn;
  #269 = NameAndType        #270:#271     // getById:(I)Lext/mods/gameserver/model/records/custom/StaticSpawn;
  #270 = Utf8               getById
  #271 = Utf8               (I)Lext/mods/gameserver/model/records/custom/StaticSpawn;
  #272 = Methodref          #273.#274     // ext/mods/gameserver/model/records/custom/StaticSpawn.isEnabled:()Z
  #273 = Class              #275          // ext/mods/gameserver/model/records/custom/StaticSpawn
  #274 = NameAndType        #276:#82      // isEnabled:()Z
  #275 = Utf8               ext/mods/gameserver/model/records/custom/StaticSpawn
  #276 = Utf8               isEnabled
  #277 = Methodref          #273.#278     // ext/mods/gameserver/model/records/custom/StaticSpawn.earthQuake:()Z
  #278 = NameAndType        #279:#82      // earthQuake:()Z
  #279 = Utf8               earthQuake
  #280 = Class              #281          // ext/mods/gameserver/network/serverpackets/Earthquake
  #281 = Utf8               ext/mods/gameserver/network/serverpackets/Earthquake
  #282 = Methodref          #280.#283     // ext/mods/gameserver/network/serverpackets/Earthquake."<init>":(Lext/mods/gameserver/model/WorldObject;IIZ)V
  #283 = NameAndType        #5:#284       // "<init>":(Lext/mods/gameserver/model/WorldObject;IIZ)V
  #284 = Utf8               (Lext/mods/gameserver/model/WorldObject;IIZ)V
  #285 = Methodref          #96.#286      // ext/mods/gameserver/model/actor/Npc.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #286 = NameAndType        #287:#288     // broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #287 = Utf8               broadcastPacket
  #288 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #289 = Methodref          #273.#290     // ext/mods/gameserver/model/records/custom/StaticSpawn.announce:()Z
  #290 = NameAndType        #291:#82      // announce:()Z
  #291 = Utf8               announce
  #292 = Methodref          #96.#229      // ext/mods/gameserver/model/actor/Npc.getName:()Ljava/lang/String;
  #293 = Methodref          #294.#295     // ext/mods/gameserver/model/World.announceToOnlinePlayers:(ILjava/lang/String;)V
  #294 = Class              #296          // ext/mods/gameserver/model/World
  #295 = NameAndType        #297:#298     // announceToOnlinePlayers:(ILjava/lang/String;)V
  #296 = Utf8               ext/mods/gameserver/model/World
  #297 = Utf8               announceToOnlinePlayers
  #298 = Utf8               (ILjava/lang/String;)V
  #299 = Class              #300          // ext/mods/gameserver/model/actor/instance/RaidBoss
  #300 = Utf8               ext/mods/gameserver/model/actor/instance/RaidBoss
  #301 = Fieldref           #68.#302      // ext/mods/Config.ANNOUNCE_SPAWN_RAIDBOSS:Z
  #302 = NameAndType        #303:#304     // ANNOUNCE_SPAWN_RAIDBOSS:Z
  #303 = Utf8               ANNOUNCE_SPAWN_RAIDBOSS
  #304 = Utf8               Z
  #305 = Methodref          #299.#229     // ext/mods/gameserver/model/actor/instance/RaidBoss.getName:()Ljava/lang/String;
  #306 = Methodref          #299.#307     // ext/mods/gameserver/model/actor/instance/RaidBoss.getStatus:()Lext/mods/gameserver/model/actor/status/AttackableStatus;
  #307 = NameAndType        #308:#309     // getStatus:()Lext/mods/gameserver/model/actor/status/AttackableStatus;
  #308 = Utf8               getStatus
  #309 = Utf8               ()Lext/mods/gameserver/model/actor/status/AttackableStatus;
  #310 = Methodref          #311.#312     // ext/mods/gameserver/model/actor/status/AttackableStatus.getLevel:()I
  #311 = Class              #313          // ext/mods/gameserver/model/actor/status/AttackableStatus
  #312 = NameAndType        #314:#130     // getLevel:()I
  #313 = Utf8               ext/mods/gameserver/model/actor/status/AttackableStatus
  #314 = Utf8               getLevel
  #315 = Methodref          #294.#316     // ext/mods/gameserver/model/World.announceToOnlinePlayers:(I[Ljava/lang/Object;)V
  #316 = NameAndType        #297:#317     // announceToOnlinePlayers:(I[Ljava/lang/Object;)V
  #317 = Utf8               (I[Ljava/lang/Object;)V
  #318 = Class              #319          // ext/mods/gameserver/model/actor/instance/GrandBoss
  #319 = Utf8               ext/mods/gameserver/model/actor/instance/GrandBoss
  #320 = Fieldref           #68.#321      // ext/mods/Config.ANNOUNCE_SPAWN_GRANDBOSS:Z
  #321 = NameAndType        #322:#304     // ANNOUNCE_SPAWN_GRANDBOSS:Z
  #322 = Utf8               ANNOUNCE_SPAWN_GRANDBOSS
  #323 = Methodref          #318.#229     // ext/mods/gameserver/model/actor/instance/GrandBoss.getName:()Ljava/lang/String;
  #324 = Methodref          #318.#307     // ext/mods/gameserver/model/actor/instance/GrandBoss.getStatus:()Lext/mods/gameserver/model/actor/status/AttackableStatus;
  #325 = Methodref          #102.#326     // ext/mods/gameserver/model/spawn/NpcMaker.onSpawn:(Lext/mods/gameserver/model/actor/Npc;)V
  #326 = NameAndType        #327:#203     // onSpawn:(Lext/mods/gameserver/model/actor/Npc;)V
  #327 = Utf8               onSpawn
  #328 = Methodref          #14.#329      // ext/mods/gameserver/model/spawn/MultiSpawn.doSave:()V
  #329 = NameAndType        #330:#331     // doSave:()V
  #330 = Utf8               doSave
  #331 = Utf8               ()V
  #332 = InterfaceMethodref #78.#333      // java/util/Set.copyOf:(Ljava/util/Collection;)Ljava/util/Set;
  #333 = NameAndType        #334:#335     // copyOf:(Ljava/util/Collection;)Ljava/util/Set;
  #334 = Utf8               copyOf
  #335 = Utf8               (Ljava/util/Collection;)Ljava/util/Set;
  #336 = InterfaceMethodref #78.#337      // java/util/Set.clear:()V
  #337 = NameAndType        #338:#331     // clear:()V
  #338 = Utf8               clear
  #339 = InvokeDynamic      #0:#340       // #0:accept:()Ljava/util/function/Consumer;
  #340 = NameAndType        #341:#342     // accept:()Ljava/util/function/Consumer;
  #341 = Utf8               accept
  #342 = Utf8               ()Ljava/util/function/Consumer;
  #343 = InterfaceMethodref #78.#344      // java/util/Set.forEach:(Ljava/util/function/Consumer;)V
  #344 = NameAndType        #345:#346     // forEach:(Ljava/util/function/Consumer;)V
  #345 = Utf8               forEach
  #346 = Utf8               (Ljava/util/function/Consumer;)V
  #347 = Methodref          #19.#348      // java/util/concurrent/atomic/AtomicInteger.set:(I)V
  #348 = NameAndType        #171:#23      // set:(I)V
  #349 = Methodref          #350.#351     // ext/mods/gameserver/model/spawn/SpawnData.setStatus:(B)V
  #350 = Class              #352          // ext/mods/gameserver/model/spawn/SpawnData
  #351 = NameAndType        #353:#354     // setStatus:(B)V
  #352 = Utf8               ext/mods/gameserver/model/spawn/SpawnData
  #353 = Utf8               setStatus
  #354 = Utf8               (B)V
  #355 = Methodref          #273.#356     // ext/mods/gameserver/model/records/custom/StaticSpawn.calcNextDate:()J
  #356 = NameAndType        #357:#358     // calcNextDate:()J
  #357 = Utf8               calcNextDate
  #358 = Utf8               ()J
  #359 = Methodref          #360.#361     // java/lang/System.currentTimeMillis:()J
  #360 = Class              #362          // java/lang/System
  #361 = NameAndType        #363:#358     // currentTimeMillis:()J
  #362 = Utf8               java/lang/System
  #363 = Utf8               currentTimeMillis
  #364 = Long               1000l
  #366 = Methodref          #273.#367     // ext/mods/gameserver/model/records/custom/StaticSpawn.randomTime:()I
  #367 = NameAndType        #368:#130     // randomTime:()I
  #368 = Utf8               randomTime
  #369 = Methodref          #2.#370       // ext/mods/gameserver/model/spawn/ASpawn.calculateRespawnDelay:()J
  #370 = NameAndType        #371:#358     // calculateRespawnDelay:()J
  #371 = Utf8               calculateRespawnDelay
  #372 = Methodref          #14.#373      // ext/mods/gameserver/model/spawn/MultiSpawn.decreaseSpawnedCount:(I)Z
  #373 = NameAndType        #374:#375     // decreaseSpawnedCount:(I)Z
  #374 = Utf8               decreaseSpawnedCount
  #375 = Utf8               (I)Z
  #376 = Methodref          #102.#377     // ext/mods/gameserver/model/spawn/NpcMaker.onDecay:(Lext/mods/gameserver/model/actor/Npc;)V
  #377 = NameAndType        #378:#203     // onDecay:(Lext/mods/gameserver/model/actor/Npc;)V
  #378 = Utf8               onDecay
  #379 = Methodref          #14.#380      // ext/mods/gameserver/model/spawn/MultiSpawn.getRespawnDelay:()I
  #380 = NameAndType        #381:#130     // getRespawnDelay:()I
  #381 = Utf8               getRespawnDelay
  #382 = Methodref          #14.#383      // ext/mods/gameserver/model/spawn/MultiSpawn.calculateBossRespawnDelayMs:(Lext/mods/gameserver/model/actor/Npc;)J
  #383 = NameAndType        #384:#385     // calculateBossRespawnDelayMs:(Lext/mods/gameserver/model/actor/Npc;)J
  #384 = Utf8               calculateBossRespawnDelayMs
  #385 = Utf8               (Lext/mods/gameserver/model/actor/Npc;)J
  #386 = Methodref          #96.#387      // ext/mods/gameserver/model/actor/Npc.getSpawn:()Lext/mods/gameserver/model/spawn/ASpawn;
  #387 = NameAndType        #388:#389     // getSpawn:()Lext/mods/gameserver/model/spawn/ASpawn;
  #388 = Utf8               getSpawn
  #389 = Utf8               ()Lext/mods/gameserver/model/spawn/ASpawn;
  #390 = Methodref          #2.#391       // ext/mods/gameserver/model/spawn/ASpawn.getSpawnData:()Lext/mods/gameserver/model/spawn/SpawnData;
  #391 = NameAndType        #392:#393     // getSpawnData:()Lext/mods/gameserver/model/spawn/SpawnData;
  #392 = Utf8               getSpawnData
  #393 = Utf8               ()Lext/mods/gameserver/model/spawn/SpawnData;
  #394 = Methodref          #350.#395     // ext/mods/gameserver/model/spawn/SpawnData.getRespawnTime:()J
  #395 = NameAndType        #396:#358     // getRespawnTime:()J
  #396 = Utf8               getRespawnTime
  #397 = Methodref          #350.#398     // ext/mods/gameserver/model/spawn/SpawnData.setRespawn:(J)V
  #398 = NameAndType        #399:#400     // setRespawn:(J)V
  #399 = Utf8               setRespawn
  #400 = Utf8               (J)V
  #401 = InvokeDynamic      #1:#402       // #1:makeConcatWithConstants:(I)Ljava/lang/String;
  #402 = NameAndType        #403:#404     // makeConcatWithConstants:(I)Ljava/lang/String;
  #403 = Utf8               makeConcatWithConstants
  #404 = Utf8               (I)Ljava/lang/String;
  #405 = InvokeDynamic      #2:#406       // #2:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #406 = NameAndType        #403:#407     // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #407 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
  #408 = InvokeDynamic      #3:#409       // #3:accept:(Lext/mods/gameserver/model/spawn/MultiSpawn;)Ljava/util/function/Consumer;
  #409 = NameAndType        #341:#410     // accept:(Lext/mods/gameserver/model/spawn/MultiSpawn;)Ljava/util/function/Consumer;
  #410 = Utf8               (Lext/mods/gameserver/model/spawn/MultiSpawn;)Ljava/util/function/Consumer;
  #411 = InvokeDynamic      #4:#412       // #4:accept:(III)Ljava/util/function/Consumer;
  #412 = NameAndType        #341:#413     // accept:(III)Ljava/util/function/Consumer;
  #413 = Utf8               (III)Ljava/util/function/Consumer;
  #414 = Methodref          #19.#415      // java/util/concurrent/atomic/AtomicInteger.get:()I
  #415 = NameAndType        #151:#130     // get:()I
  #416 = Methodref          #14.#208      // ext/mods/gameserver/model/spawn/MultiSpawn.doSpawn:(ZLext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/model/actor/Npc;
  #417 = Methodref          #418.#419     // ext/mods/gameserver/taskmanager/MakerSpawnScheduleTaskManager.getInstance:()Lext/mods/gameserver/taskmanager/MakerSpawnScheduleTaskManager;
  #418 = Class              #420          // ext/mods/gameserver/taskmanager/MakerSpawnScheduleTaskManager
  #419 = NameAndType        #125:#421     // getInstance:()Lext/mods/gameserver/taskmanager/MakerSpawnScheduleTaskManager;
  #420 = Utf8               ext/mods/gameserver/taskmanager/MakerSpawnScheduleTaskManager
  #421 = Utf8               ()Lext/mods/gameserver/taskmanager/MakerSpawnScheduleTaskManager;
  #422 = Methodref          #423.#424     // java/lang/Long.valueOf:(J)Ljava/lang/Long;
  #423 = Class              #425          // java/lang/Long
  #424 = NameAndType        #226:#426     // valueOf:(J)Ljava/lang/Long;
  #425 = Utf8               java/lang/Long
  #426 = Utf8               (J)Ljava/lang/Long;
  #427 = Methodref          #418.#428     // ext/mods/gameserver/taskmanager/MakerSpawnScheduleTaskManager.addSpawn:(Lext/mods/gameserver/model/spawn/MultiSpawn;Ljava/lang/Long;)V
  #428 = NameAndType        #429:#430     // addSpawn:(Lext/mods/gameserver/model/spawn/MultiSpawn;Ljava/lang/Long;)V
  #429 = Utf8               addSpawn
  #430 = Utf8               (Lext/mods/gameserver/model/spawn/MultiSpawn;Ljava/lang/Long;)V
  #431 = Methodref          #418.#432     // ext/mods/gameserver/taskmanager/MakerSpawnScheduleTaskManager.cancelMakerRespawns:(Lext/mods/gameserver/model/spawn/MultiSpawn;)V
  #432 = NameAndType        #433:#434     // cancelMakerRespawns:(Lext/mods/gameserver/model/spawn/MultiSpawn;)V
  #433 = Utf8               cancelMakerRespawns
  #434 = Utf8               (Lext/mods/gameserver/model/spawn/MultiSpawn;)V
  #435 = Methodref          #418.#436     // ext/mods/gameserver/taskmanager/MakerSpawnScheduleTaskManager.getRespawningNpcCount:(Lext/mods/gameserver/model/spawn/MultiSpawn;)I
  #436 = NameAndType        #437:#438     // getRespawningNpcCount:(Lext/mods/gameserver/model/spawn/MultiSpawn;)I
  #437 = Utf8               getRespawningNpcCount
  #438 = Utf8               (Lext/mods/gameserver/model/spawn/MultiSpawn;)I
  #439 = Methodref          #102.#440     // ext/mods/gameserver/model/spawn/NpcMaker.getMaker:()Lext/mods/gameserver/scripting/SpawnMaker;
  #440 = NameAndType        #441:#442     // getMaker:()Lext/mods/gameserver/scripting/SpawnMaker;
  #441 = Utf8               getMaker
  #442 = Utf8               ()Lext/mods/gameserver/scripting/SpawnMaker;
  #443 = Methodref          #444.#445     // ext/mods/gameserver/scripting/SpawnMaker.onNpcDBInfo:(Lext/mods/gameserver/model/spawn/MultiSpawn;Lext/mods/gameserver/model/spawn/SpawnData;Lext/mods/gameserver/model/spawn/NpcMaker;)V
  #444 = Class              #446          // ext/mods/gameserver/scripting/SpawnMaker
  #445 = NameAndType        #447:#448     // onNpcDBInfo:(Lext/mods/gameserver/model/spawn/MultiSpawn;Lext/mods/gameserver/model/spawn/SpawnData;Lext/mods/gameserver/model/spawn/NpcMaker;)V
  #446 = Utf8               ext/mods/gameserver/scripting/SpawnMaker
  #447 = Utf8               onNpcDBInfo
  #448 = Utf8               (Lext/mods/gameserver/model/spawn/MultiSpawn;Lext/mods/gameserver/model/spawn/SpawnData;Lext/mods/gameserver/model/spawn/NpcMaker;)V
  #449 = Methodref          #96.#450      // ext/mods/gameserver/model/actor/Npc.sendScriptEvent:(III)V
  #450 = NameAndType        #451:#452     // sendScriptEvent:(III)V
  #451 = Utf8               sendScriptEvent
  #452 = Utf8               (III)V
  #453 = Methodref          #350.#454     // ext/mods/gameserver/model/spawn/SpawnData.setStats:(Lext/mods/gameserver/model/actor/Npc;)V
  #454 = NameAndType        #455:#203     // setStats:(Lext/mods/gameserver/model/actor/Npc;)V
  #455 = Utf8               setStats
  #456 = Methodref          #96.#457      // ext/mods/gameserver/model/actor/Npc.cancelRespawn:()V
  #457 = NameAndType        #458:#331     // cancelRespawn:()V
  #458 = Utf8               cancelRespawn
  #459 = Methodref          #96.#460      // ext/mods/gameserver/model/actor/Npc.isMaster:()Z
  #460 = NameAndType        #461:#82      // isMaster:()Z
  #461 = Utf8               isMaster
  #462 = Methodref          #96.#463      // ext/mods/gameserver/model/actor/Npc.getMinions:()Ljava/util/Set;
  #463 = NameAndType        #464:#465     // getMinions:()Ljava/util/Set;
  #464 = Utf8               getMinions
  #465 = Utf8               ()Ljava/util/Set;
  #466 = InvokeDynamic      #5:#340       // #5:accept:()Ljava/util/function/Consumer;
  #467 = Methodref          #96.#468      // ext/mods/gameserver/model/actor/Npc.deleteMe:()V
  #468 = NameAndType        #469:#331     // deleteMe:()V
  #469 = Utf8               deleteMe
  #470 = Utf8               RANDOM_WALK_LOOP_LIMIT
  #471 = Utf8               ConstantValue
  #472 = Integer            3
  #473 = Utf8               Signature
  #474 = Utf8               Ljava/util/Set<Lext/mods/gameserver/model/actor/Npc;>;
  #475 = Utf8               (Lext/mods/gameserver/model/spawn/NpcMaker;Lext/mods/gameserver/model/actor/template/NpcTemplate;IIILjava/util/List;Lext/mods/gameserver/model/memo/SpawnMemo;[[ILext/mods/gameserver/model/spawn/SpawnData;)V
  #476 = Utf8               Code
  #477 = Utf8               LineNumberTable
  #478 = Utf8               LocalVariableTable
  #479 = Utf8               this
  #480 = Utf8               Lext/mods/gameserver/model/spawn/MultiSpawn;
  #481 = Utf8               npcMaker
  #482 = Utf8               template
  #483 = Utf8               Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #484 = Utf8               total
  #485 = Utf8               respawnDelay
  #486 = Utf8               respawnRandom
  #487 = Utf8               privateData
  #488 = Utf8               aiParams
  #489 = Utf8               coords
  #490 = Utf8               spawnData
  #491 = Utf8               LocalVariableTypeTable
  #492 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/records/PrivateData;>;
  #493 = Utf8               StackMapTable
  #494 = Class              #495          // java/util/List
  #495 = Utf8               java/util/List
  #496 = Class              #497          // ext/mods/gameserver/model/memo/SpawnMemo
  #497 = Utf8               ext/mods/gameserver/model/memo/SpawnMemo
  #498 = Class              #59           // "[[I"
  #499 = Utf8               Exceptions
  #500 = Class              #501          // java/lang/SecurityException
  #501 = Utf8               java/lang/SecurityException
  #502 = Class              #503          // java/lang/ClassNotFoundException
  #503 = Utf8               java/lang/ClassNotFoundException
  #504 = Class              #505          // java/lang/NoSuchMethodException
  #505 = Utf8               java/lang/NoSuchMethodException
  #506 = Class              #507          // java/io/InvalidClassException
  #507 = Utf8               java/io/InvalidClassException
  #508 = Utf8               (Lext/mods/gameserver/model/spawn/NpcMaker;Lext/mods/gameserver/model/actor/template/NpcTemplate;IIILjava/util/List<Lext/mods/gameserver/model/records/PrivateData;>;Lext/mods/gameserver/model/memo/SpawnMemo;[[ILext/mods/gameserver/model/spawn/SpawnData;)V
  #509 = Utf8               getNpc
  #510 = Utf8               ()Lext/mods/gameserver/model/actor/Npc;
  #511 = Utf8               npc
  #512 = Utf8               Lext/mods/gameserver/model/actor/Npc;
  #513 = Utf8               spawnLoc
  #514 = Utf8               Lext/mods/gameserver/model/location/SpawnLocation;
  #515 = Utf8               coord
  #516 = Utf8               [I
  #517 = Utf8               chance
  #518 = Utf8               getRandomWalkLocation
  #519 = Utf8               (Lext/mods/gameserver/model/actor/Npc;I)Lext/mods/gameserver/model/location/Location;
  #520 = Utf8               loop
  #521 = Utf8               offset
  #522 = Utf8               loc
  #523 = Utf8               Lext/mods/gameserver/model/location/Location;
  #524 = Utf8               isInMyTerritory
  #525 = Utf8               (Lext/mods/gameserver/model/WorldObject;)Z
  #526 = Utf8               worldObject
  #527 = Utf8               Lext/mods/gameserver/model/WorldObject;
  #528 = Utf8               params
  #529 = Utf8               [Ljava/lang/String;
  #530 = Utf8               isSummonSpawn
  #531 = Utf8               summoner
  #532 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #533 = Utf8               toRespawn
  #534 = Utf8               mst
  #535 = Utf8               raidboss
  #536 = Utf8               Lext/mods/gameserver/model/actor/instance/RaidBoss;
  #537 = Utf8               grandboss
  #538 = Utf8               Lext/mods/gameserver/model/actor/instance/GrandBoss;
  #539 = Utf8               staticSpawn
  #540 = Utf8               Lext/mods/gameserver/model/records/custom/StaticSpawn;
  #541 = Utf8               doDelete
  #542 = Utf8               tmpNpcs
  #543 = Utf8               J
  #544 = Utf8               toString
  #545 = Utf8               getDescription
  #546 = Utf8               updateSpawnData
  #547 = Utf8               eventId
  #548 = Utf8               arg1
  #549 = Utf8               arg2
  #550 = Utf8               getNpcMaker
  #551 = Utf8               ()Lext/mods/gameserver/model/spawn/NpcMaker;
  #552 = Utf8               getCoords
  #553 = Utf8               ()[[I
  #554 = Utf8               getTotal
  #555 = Utf8               getNpcs
  #556 = Utf8               ()Ljava/util/Set<Lext/mods/gameserver/model/actor/Npc;>;
  #557 = Utf8               getDecayedNpcs
  #558 = Utf8               decayedNpcs
  #559 = Utf8               increaseSpawnedCount
  #560 = Utf8               count
  #561 = Utf8               newspawnedCount
  #562 = Utf8               getSpawnedCount
  #563 = Utf8               (IZ)Ljava/util/Set;
  #564 = Utf8               i
  #565 = Utf8               (IZ)Ljava/util/Set<Lext/mods/gameserver/model/actor/Npc;>;
  #566 = Utf8               scheduleSpawn
  #567 = Utf8               delay
  #568 = Utf8               cancelScheduledSpawns
  #569 = Utf8               loadDBNpcInfo
  #570 = Utf8               lambda$sendScriptEvent$0
  #571 = Utf8               (IIILext/mods/gameserver/model/actor/Npc;)V
  #572 = Utf8               lambda$updateSpawnData$0
  #573 = Utf8               lambda$doDelete$0
  #574 = Utf8               SourceFile
  #575 = Utf8               MultiSpawn.java
  #576 = Utf8               BootstrapMethods
  #577 = MethodType         #578          //  (Ljava/lang/Object;)V
  #578 = Utf8               (Ljava/lang/Object;)V
  #579 = MethodHandle       6:#580        // REF_invokeStatic ext/mods/gameserver/model/spawn/MultiSpawn.lambda$doDelete$0:(Lext/mods/gameserver/model/actor/Npc;)V
  #580 = Methodref          #14.#581      // ext/mods/gameserver/model/spawn/MultiSpawn.lambda$doDelete$0:(Lext/mods/gameserver/model/actor/Npc;)V
  #581 = NameAndType        #573:#203     // lambda$doDelete$0:(Lext/mods/gameserver/model/actor/Npc;)V
  #582 = MethodType         #203          //  (Lext/mods/gameserver/model/actor/Npc;)V
  #583 = String             #584          // MultiSpawn [id=\u0001]
  #584 = Utf8               MultiSpawn [id=\u0001]
  #585 = String             #586          // NpcMaker: \u0001
  #586 = Utf8               NpcMaker: \u0001
  #587 = MethodHandle       5:#588        // REF_invokeVirtual ext/mods/gameserver/model/spawn/MultiSpawn.lambda$updateSpawnData$0:(Lext/mods/gameserver/model/actor/Npc;)V
  #588 = Methodref          #14.#589      // ext/mods/gameserver/model/spawn/MultiSpawn.lambda$updateSpawnData$0:(Lext/mods/gameserver/model/actor/Npc;)V
  #589 = NameAndType        #572:#203     // lambda$updateSpawnData$0:(Lext/mods/gameserver/model/actor/Npc;)V
  #590 = MethodHandle       6:#591        // REF_invokeStatic ext/mods/gameserver/model/spawn/MultiSpawn.lambda$sendScriptEvent$0:(IIILext/mods/gameserver/model/actor/Npc;)V
  #591 = Methodref          #14.#592      // ext/mods/gameserver/model/spawn/MultiSpawn.lambda$sendScriptEvent$0:(IIILext/mods/gameserver/model/actor/Npc;)V
  #592 = NameAndType        #570:#571     // lambda$sendScriptEvent$0:(IIILext/mods/gameserver/model/actor/Npc;)V
  #593 = MethodHandle       5:#467        // REF_invokeVirtual ext/mods/gameserver/model/actor/Npc.deleteMe:()V
  #594 = MethodHandle       6:#595        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #595 = Methodref          #596.#597     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #596 = Class              #598          // java/lang/invoke/LambdaMetafactory
  #597 = NameAndType        #599:#600     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #598 = Utf8               java/lang/invoke/LambdaMetafactory
  #599 = Utf8               metafactory
  #600 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #601 = MethodHandle       6:#602        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #602 = Methodref          #603.#604     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #603 = Class              #605          // java/lang/invoke/StringConcatFactory
  #604 = NameAndType        #403:#606     // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #605 = Utf8               java/lang/invoke/StringConcatFactory
  #606 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #607 = Utf8               InnerClasses
  #608 = Class              #609          // java/util/concurrent/ConcurrentHashMap$KeySetView
  #609 = Utf8               java/util/concurrent/ConcurrentHashMap$KeySetView
  #610 = Utf8               KeySetView
  #611 = Class              #612          // java/lang/invoke/MethodHandles$Lookup
  #612 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #613 = Class              #614          // java/lang/invoke/MethodHandles
  #614 = Utf8               java/lang/invoke/MethodHandles
  #615 = Utf8               Lookup
{
  public ext.mods.gameserver.model.spawn.MultiSpawn(ext.mods.gameserver.model.spawn.NpcMaker, ext.mods.gameserver.model.actor.template.NpcTemplate, int, int, int, java.util.List<ext.mods.gameserver.model.records.PrivateData>, ext.mods.gameserver.model.memo.SpawnMemo, int[][], ext.mods.gameserver.model.spawn.SpawnData) throws java.lang.SecurityException, java.lang.ClassNotFoundException, java.lang.NoSuchMethodException, java.io.InvalidClassException;
    descriptor: (Lext/mods/gameserver/model/spawn/NpcMaker;Lext/mods/gameserver/model/actor/template/NpcTemplate;IIILjava/util/List;Lext/mods/gameserver/model/memo/SpawnMemo;[[ILext/mods/gameserver/model/spawn/SpawnData;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=10, args_size=10
         0: aload_0
         1: aload_2
         2: invokespecial #1                  // Method ext/mods/gameserver/model/spawn/ASpawn."<init>":(Lext/mods/gameserver/model/actor/template/NpcTemplate;)V
         5: aload_0
         6: invokestatic  #7                  // Method java/util/concurrent/ConcurrentHashMap.newKeySet:()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;
         9: putfield      #13                 // Field _npcs:Ljava/util/Set;
        12: aload_0
        13: new           #19                 // class java/util/concurrent/atomic/AtomicInteger
        16: dup
        17: iconst_0
        18: invokespecial #21                 // Method java/util/concurrent/atomic/AtomicInteger."<init>":(I)V
        21: putfield      #24                 // Field _spawnedCount:Ljava/util/concurrent/atomic/AtomicInteger;
        24: aload_0
        25: iconst_0
        26: iload         4
        28: invokestatic  #28                 // Method java/lang/Math.max:(II)I
        31: putfield      #34                 // Field _respawnDelay:I
        34: aload_0
        35: iload         4
        37: iconst_0
        38: iload         5
        40: invokestatic  #28                 // Method java/lang/Math.max:(II)I
        43: invokestatic  #38                 // Method java/lang/Math.min:(II)I
        46: putfield      #41                 // Field _respawnRandom:I
        49: aload_0
        50: aload         6
        52: putfield      #44                 // Field _privateData:Ljava/util/List;
        55: aload_0
        56: aload         7
        58: putfield      #48                 // Field _aiParams:Lext/mods/gameserver/model/memo/SpawnMemo;
        61: aload_0
        62: aload_1
        63: putfield      #52                 // Field _npcMaker:Lext/mods/gameserver/model/spawn/NpcMaker;
        66: aload_0
        67: aload         8
        69: putfield      #56                 // Field _coords:[[I
        72: aload_0
        73: aload         9
        75: putfield      #60                 // Field _spawnData:Lext/mods/gameserver/model/spawn/SpawnData;
        78: aload_0
        79: getfield      #60                 // Field _spawnData:Lext/mods/gameserver/model/spawn/SpawnData;
        82: ifnull        93
        85: aload_0
        86: iconst_1
        87: putfield      #64                 // Field _total:I
        90: goto          122
        93: aload_0
        94: getfield      #56                 // Field _coords:[[I
        97: ifnull        108
       100: aload_0
       101: iload_3
       102: putfield      #64                 // Field _total:I
       105: goto          122
       108: aload_0
       109: iload_3
       110: i2d
       111: getstatic     #67                 // Field ext/mods/Config.SPAWN_MULTIPLIER:D
       114: dmul
       115: invokestatic  #73                 // Method java/lang/Math.round:(D)J
       118: l2i
       119: putfield      #64                 // Field _total:I
       122: return
      LineNumberTable:
        line 71: 0
        line 65: 5
        line 67: 12
        line 73: 24
        line 74: 34
        line 76: 49
        line 77: 55
        line 79: 61
        line 80: 66
        line 81: 72
        line 83: 78
        line 84: 85
        line 85: 93
        line 86: 100
        line 88: 108
        line 89: 122
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     123     0  this   Lext/mods/gameserver/model/spawn/MultiSpawn;
            0     123     1 npcMaker   Lext/mods/gameserver/model/spawn/NpcMaker;
            0     123     2 template   Lext/mods/gameserver/model/actor/template/NpcTemplate;
            0     123     3 total   I
            0     123     4 respawnDelay   I
            0     123     5 respawnRandom   I
            0     123     6 privateData   Ljava/util/List;
            0     123     7 aiParams   Lext/mods/gameserver/model/memo/SpawnMemo;
            0     123     8 coords   [[I
            0     123     9 spawnData   Lext/mods/gameserver/model/spawn/SpawnData;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0     123     6 privateData   Ljava/util/List<Lext/mods/gameserver/model/records/PrivateData;>;
      StackMapTable: number_of_entries = 3
        frame_type = 255 /* full_frame */
          offset_delta = 93
          locals = [ class ext/mods/gameserver/model/spawn/MultiSpawn, class ext/mods/gameserver/model/spawn/NpcMaker, class ext/mods/gameserver/model/actor/template/NpcTemplate, int, int, int, class java/util/List, class ext/mods/gameserver/model/memo/SpawnMemo, class "[[I", class ext/mods/gameserver/model/spawn/SpawnData ]
          stack = []
        frame_type = 14 /* same */
        frame_type = 13 /* same */
    Exceptions:
      throws java.lang.SecurityException, java.lang.ClassNotFoundException, java.lang.NoSuchMethodException, java.io.InvalidClassException
    Signature: #508                         // (Lext/mods/gameserver/model/spawn/NpcMaker;Lext/mods/gameserver/model/actor/template/NpcTemplate;IIILjava/util/List<Lext/mods/gameserver/model/records/PrivateData;>;Lext/mods/gameserver/model/memo/SpawnMemo;[[ILext/mods/gameserver/model/spawn/SpawnData;)V

  public ext.mods.gameserver.model.actor.Npc getNpc();
    descriptor: ()Lext/mods/gameserver/model/actor/Npc;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=3, args_size=1
         0: aload_0
         1: getfield      #13                 // Field _npcs:Ljava/util/Set;
         4: invokeinterface #77,  1           // InterfaceMethod java/util/Set.isEmpty:()Z
         9: ifeq          14
        12: aconst_null
        13: areturn
        14: aload_0
        15: getfield      #13                 // Field _npcs:Ljava/util/Set;
        18: invokeinterface #83,  1           // InterfaceMethod java/util/Set.iterator:()Ljava/util/Iterator;
        23: astore_1
        24: aload_1
        25: invokeinterface #87,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        30: ifeq          55
        33: aload_1
        34: invokeinterface #92,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        39: checkcast     #96                 // class ext/mods/gameserver/model/actor/Npc
        42: astore_2
        43: aload_2
        44: invokevirtual #98                 // Method ext/mods/gameserver/model/actor/Npc.isDecayed:()Z
        47: ifne          52
        50: aload_2
        51: areturn
        52: goto          24
        55: aconst_null
        56: areturn
      LineNumberTable:
        line 94: 0
        line 95: 12
        line 97: 14
        line 99: 43
        line 100: 50
        line 101: 52
        line 103: 55
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           43       9     2   npc   Lext/mods/gameserver/model/actor/Npc;
            0      57     0  this   Lext/mods/gameserver/model/spawn/MultiSpawn;
      StackMapTable: number_of_entries = 4
        frame_type = 14 /* same */
        frame_type = 252 /* append */
          offset_delta = 9
          locals = [ class java/util/Iterator ]
        frame_type = 27 /* same */
        frame_type = 250 /* chop */
          offset_delta = 2

  public ext.mods.gameserver.model.location.SpawnLocation getSpawnLocation();
    descriptor: ()Lext/mods/gameserver/model/location/SpawnLocation;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=7, locals=7, args_size=1
         0: aload_0
         1: getfield      #56                 // Field _coords:[[I
         4: ifnonnull     25
         7: aload_0
         8: getfield      #52                 // Field _npcMaker:Lext/mods/gameserver/model/spawn/NpcMaker;
        11: invokevirtual #101                // Method ext/mods/gameserver/model/spawn/NpcMaker.getTerritory:()Lext/mods/commons/geometry/Territory;
        14: aload_0
        15: getfield      #52                 // Field _npcMaker:Lext/mods/gameserver/model/spawn/NpcMaker;
        18: invokevirtual #107                // Method ext/mods/gameserver/model/spawn/NpcMaker.getBannedTerritory:()Lext/mods/commons/geometry/Territory;
        21: invokevirtual #110                // Method ext/mods/commons/geometry/Territory.getRandomGeoLocation:(Lext/mods/commons/geometry/Territory;)Lext/mods/gameserver/model/location/SpawnLocation;
        24: areturn
        25: aload_0
        26: getfield      #56                 // Field _coords:[[I
        29: arraylength
        30: iconst_1
        31: if_icmpne     102
        34: new           #116                // class ext/mods/gameserver/model/location/SpawnLocation
        37: dup
        38: aload_0
        39: getfield      #56                 // Field _coords:[[I
        42: iconst_0
        43: aaload
        44: iconst_0
        45: iaload
        46: aload_0
        47: getfield      #56                 // Field _coords:[[I
        50: iconst_0
        51: aaload
        52: iconst_1
        53: iaload
        54: aload_0
        55: getfield      #56                 // Field _coords:[[I
        58: iconst_0
        59: aaload
        60: iconst_2
        61: iaload
        62: aload_0
        63: getfield      #56                 // Field _coords:[[I
        66: iconst_0
        67: aaload
        68: iconst_3
        69: iaload
        70: invokespecial #118                // Method ext/mods/gameserver/model/location/SpawnLocation."<init>":(IIII)V
        73: astore_1
        74: aload_1
        75: invokestatic  #121                // Method ext/mods/gameserver/geoengine/GeoEngine.getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
        78: aload_1
        79: invokevirtual #127                // Method ext/mods/gameserver/model/location/SpawnLocation.getX:()I
        82: aload_1
        83: invokevirtual #131                // Method ext/mods/gameserver/model/location/SpawnLocation.getY:()I
        86: aload_1
        87: invokevirtual #134                // Method ext/mods/gameserver/model/location/SpawnLocation.getZ:()I
        90: getstatic     #137                // Field ext/mods/Config.NPC_Z_INDEX:I
        93: isub
        94: invokevirtual #140                // Method ext/mods/gameserver/geoengine/GeoEngine.getHeight:(III)S
        97: invokevirtual #144                // Method ext/mods/gameserver/model/location/SpawnLocation.setZ:(I)V
       100: aload_1
       101: areturn
       102: bipush        100
       104: invokestatic  #147                // Method ext/mods/commons/random/Rnd.get:(I)I
       107: istore_1
       108: aload_0
       109: getfield      #56                 // Field _coords:[[I
       112: astore_2
       113: aload_2
       114: arraylength
       115: istore_3
       116: iconst_0
       117: istore        4
       119: iload         4
       121: iload_3
       122: if_icmpge     207
       125: aload_2
       126: iload         4
       128: aaload
       129: astore        5
       131: iload_1
       132: aload         5
       134: iconst_4
       135: iaload
       136: isub
       137: istore_1
       138: iload_1
       139: ifge          201
       142: new           #116                // class ext/mods/gameserver/model/location/SpawnLocation
       145: dup
       146: aload         5
       148: iconst_0
       149: iaload
       150: aload         5
       152: iconst_1
       153: iaload
       154: aload         5
       156: iconst_2
       157: iaload
       158: ldc           #153                // int 65536
       160: invokestatic  #147                // Method ext/mods/commons/random/Rnd.get:(I)I
       163: invokespecial #118                // Method ext/mods/gameserver/model/location/SpawnLocation."<init>":(IIII)V
       166: astore        6
       168: aload         6
       170: invokestatic  #121                // Method ext/mods/gameserver/geoengine/GeoEngine.getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
       173: aload         6
       175: invokevirtual #127                // Method ext/mods/gameserver/model/location/SpawnLocation.getX:()I
       178: aload         6
       180: invokevirtual #131                // Method ext/mods/gameserver/model/location/SpawnLocation.getY:()I
       183: aload         6
       185: invokevirtual #134                // Method ext/mods/gameserver/model/location/SpawnLocation.getZ:()I
       188: getstatic     #137                // Field ext/mods/Config.NPC_Z_INDEX:I
       191: isub
       192: invokevirtual #140                // Method ext/mods/gameserver/geoengine/GeoEngine.getHeight:(III)S
       195: invokevirtual #144                // Method ext/mods/gameserver/model/location/SpawnLocation.setZ:(I)V
       198: aload         6
       200: areturn
       201: iinc          4, 1
       204: goto          119
       207: aconst_null
       208: areturn
      LineNumberTable:
        line 109: 0
        line 110: 7
        line 112: 25
        line 114: 34
        line 115: 74
        line 116: 100
        line 119: 102
        line 120: 108
        line 122: 131
        line 123: 138
        line 125: 142
        line 126: 168
        line 127: 198
        line 120: 201
        line 131: 207
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           74      28     1 spawnLoc   Lext/mods/gameserver/model/location/SpawnLocation;
          168      33     6 spawnLoc   Lext/mods/gameserver/model/location/SpawnLocation;
          131      70     5 coord   [I
            0     209     0  this   Lext/mods/gameserver/model/spawn/MultiSpawn;
          108     101     1 chance   I
      StackMapTable: number_of_entries = 5
        frame_type = 25 /* same */
        frame_type = 251 /* same_frame_extended */
          offset_delta = 76
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/model/spawn/MultiSpawn, int, class "[[I", int, int ]
          stack = []
        frame_type = 251 /* same_frame_extended */
          offset_delta = 81
        frame_type = 248 /* chop */
          offset_delta = 5

  public ext.mods.gameserver.model.location.Location getRandomWalkLocation(ext.mods.gameserver.model.actor.Npc, int);
    descriptor: (Lext/mods/gameserver/model/actor/Npc;I)Lext/mods/gameserver/model/location/Location;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=5, args_size=3
         0: aload_1
         1: invokevirtual #154                // Method ext/mods/gameserver/model/actor/Npc.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
         4: invokevirtual #158                // Method ext/mods/gameserver/model/location/SpawnLocation.clone:()Lext/mods/gameserver/model/location/SpawnLocation;
         7: astore_3
         8: aload_0
         9: getfield      #52                 // Field _npcMaker:Lext/mods/gameserver/model/spawn/NpcMaker;
        12: invokevirtual #101                // Method ext/mods/gameserver/model/spawn/NpcMaker.getTerritory:()Lext/mods/commons/geometry/Territory;
        15: aload_3
        16: invokevirtual #161                // Method ext/mods/commons/geometry/Territory.isInside:(Lext/mods/gameserver/model/location/Location;)Z
        19: ifne          33
        22: aload_0
        23: getfield      #52                 // Field _npcMaker:Lext/mods/gameserver/model/spawn/NpcMaker;
        26: invokevirtual #101                // Method ext/mods/gameserver/model/spawn/NpcMaker.getTerritory:()Lext/mods/commons/geometry/Territory;
        29: invokevirtual #165                // Method ext/mods/commons/geometry/Territory.getRandomGeoLocation:()Lext/mods/gameserver/model/location/SpawnLocation;
        32: areturn
        33: iconst_0
        34: istore        4
        36: iload         4
        38: iconst_3
        39: if_icmpge     126
        42: aload_3
        43: aload_1
        44: invokevirtual #154                // Method ext/mods/gameserver/model/actor/Npc.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
        47: invokevirtual #167                // Method ext/mods/gameserver/model/location/Location.set:(Lext/mods/gameserver/model/location/Location;)V
        50: aload_3
        51: iload_2
        52: iconst_2
        53: iconst_4
        54: invokestatic  #173                // Method ext/mods/commons/random/Rnd.get:(II)I
        57: idiv
        58: iload_2
        59: invokevirtual #175                // Method ext/mods/gameserver/model/location/Location.addRandomOffsetBetween:(II)V
        62: aload_0
        63: getfield      #52                 // Field _npcMaker:Lext/mods/gameserver/model/spawn/NpcMaker;
        66: invokevirtual #101                // Method ext/mods/gameserver/model/spawn/NpcMaker.getTerritory:()Lext/mods/commons/geometry/Territory;
        69: aload_3
        70: invokevirtual #161                // Method ext/mods/commons/geometry/Territory.isInside:(Lext/mods/gameserver/model/location/Location;)Z
        73: ifne          79
        76: goto          120
        79: aload_0
        80: getfield      #52                 // Field _npcMaker:Lext/mods/gameserver/model/spawn/NpcMaker;
        83: invokevirtual #107                // Method ext/mods/gameserver/model/spawn/NpcMaker.getBannedTerritory:()Lext/mods/commons/geometry/Territory;
        86: ifnull        106
        89: aload_0
        90: getfield      #52                 // Field _npcMaker:Lext/mods/gameserver/model/spawn/NpcMaker;
        93: invokevirtual #107                // Method ext/mods/gameserver/model/spawn/NpcMaker.getBannedTerritory:()Lext/mods/commons/geometry/Territory;
        96: aload_3
        97: invokevirtual #161                // Method ext/mods/commons/geometry/Territory.isInside:(Lext/mods/gameserver/model/location/Location;)Z
       100: ifeq          106
       103: goto          120
       106: aload_3
       107: invokestatic  #121                // Method ext/mods/gameserver/geoengine/GeoEngine.getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
       110: aload_1
       111: aload_3
       112: invokevirtual #179                // Method ext/mods/gameserver/geoengine/GeoEngine.getValidLocation:(Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/location/Location;)Lext/mods/gameserver/model/location/Location;
       115: invokevirtual #167                // Method ext/mods/gameserver/model/location/Location.set:(Lext/mods/gameserver/model/location/Location;)V
       118: aload_3
       119: areturn
       120: iinc          4, 1
       123: goto          36
       126: aload_3
       127: aload_1
       128: invokevirtual #183                // Method ext/mods/gameserver/model/actor/Npc.getSpawnLocation:()Lext/mods/gameserver/model/location/SpawnLocation;
       131: invokevirtual #167                // Method ext/mods/gameserver/model/location/Location.set:(Lext/mods/gameserver/model/location/Location;)V
       134: aload_3
       135: areturn
      LineNumberTable:
        line 137: 0
        line 139: 8
        line 140: 22
        line 142: 33
        line 144: 42
        line 145: 50
        line 147: 62
        line 148: 76
        line 150: 79
        line 151: 103
        line 153: 106
        line 154: 118
        line 142: 120
        line 157: 126
        line 159: 134
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           36      90     4  loop   I
            0     136     0  this   Lext/mods/gameserver/model/spawn/MultiSpawn;
            0     136     1   npc   Lext/mods/gameserver/model/actor/Npc;
            0     136     2 offset   I
            8     128     3   loc   Lext/mods/gameserver/model/location/Location;
      StackMapTable: number_of_entries = 6
        frame_type = 252 /* append */
          offset_delta = 33
          locals = [ class ext/mods/gameserver/model/location/Location ]
        frame_type = 252 /* append */
          offset_delta = 2
          locals = [ int ]
        frame_type = 42 /* same */
        frame_type = 26 /* same */
        frame_type = 13 /* same */
        frame_type = 250 /* chop */
          offset_delta = 5

  public boolean isInMyTerritory(ext.mods.gameserver.model.WorldObject);
    descriptor: (Lext/mods/gameserver/model/WorldObject;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=3, args_size=2
         0: aload_1
         1: invokevirtual #186                // Method ext/mods/gameserver/model/WorldObject.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
         4: invokevirtual #158                // Method ext/mods/gameserver/model/location/SpawnLocation.clone:()Lext/mods/gameserver/model/location/SpawnLocation;
         7: astore_2
         8: aload_0
         9: getfield      #52                 // Field _npcMaker:Lext/mods/gameserver/model/spawn/NpcMaker;
        12: invokevirtual #107                // Method ext/mods/gameserver/model/spawn/NpcMaker.getBannedTerritory:()Lext/mods/commons/geometry/Territory;
        15: ifnull        34
        18: aload_0
        19: getfield      #52                 // Field _npcMaker:Lext/mods/gameserver/model/spawn/NpcMaker;
        22: invokevirtual #107                // Method ext/mods/gameserver/model/spawn/NpcMaker.getBannedTerritory:()Lext/mods/commons/geometry/Territory;
        25: aload_2
        26: invokevirtual #161                // Method ext/mods/commons/geometry/Territory.isInside:(Lext/mods/gameserver/model/location/Location;)Z
        29: ifeq          34
        32: iconst_0
        33: ireturn
        34: aload_0
        35: getfield      #52                 // Field _npcMaker:Lext/mods/gameserver/model/spawn/NpcMaker;
        38: invokevirtual #101                // Method ext/mods/gameserver/model/spawn/NpcMaker.getTerritory:()Lext/mods/commons/geometry/Territory;
        41: aload_2
        42: invokevirtual #161                // Method ext/mods/commons/geometry/Territory.isInside:(Lext/mods/gameserver/model/location/Location;)Z
        45: ireturn
      LineNumberTable:
        line 165: 0
        line 167: 8
        line 168: 32
        line 170: 34
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      46     0  this   Lext/mods/gameserver/model/spawn/MultiSpawn;
            0      46     1 worldObject   Lext/mods/gameserver/model/WorldObject;
            8      38     2   loc   Lext/mods/gameserver/model/location/Location;
      StackMapTable: number_of_entries = 1
        frame_type = 252 /* append */
          offset_delta = 34
          locals = [ class ext/mods/gameserver/model/location/Location ]

  public ext.mods.gameserver.model.actor.Npc doSpawn(boolean, ext.mods.gameserver.model.actor.Creature);
    descriptor: (ZLext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/model/actor/Npc;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=6, args_size=3
         0: aconst_null
         1: astore_3
         2: aload_0
         3: getfield      #13                 // Field _npcs:Ljava/util/Set;
         6: invokeinterface #83,  1           // InterfaceMethod java/util/Set.iterator:()Ljava/util/Iterator;
        11: astore        4
        13: aload         4
        15: invokeinterface #87,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        20: ifeq          52
        23: aload         4
        25: invokeinterface #92,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        30: checkcast     #96                 // class ext/mods/gameserver/model/actor/Npc
        33: astore        5
        35: aload         5
        37: invokevirtual #189                // Method ext/mods/gameserver/model/actor/Npc.isReadyForRespawn:()Z
        40: ifeq          49
        43: aload         5
        45: astore_3
        46: goto          52
        49: goto          13
        52: aload_3
        53: ifnull        95
        56: aload_3
        57: iconst_0
        58: invokevirtual #192                // Method ext/mods/gameserver/model/actor/Npc.setReadyForRespawn:(Z)V
        61: aload_0
        62: getfield      #13                 // Field _npcs:Ljava/util/Set;
        65: aload_3
        66: invokeinterface #196,  2          // InterfaceMethod java/util/Set.remove:(Ljava/lang/Object;)Z
        71: ifeq          93
        74: aload_0
        75: aload_3
        76: invokevirtual #200                // Method doRespawn:(Lext/mods/gameserver/model/actor/Npc;)V
        79: aload_0
        80: getfield      #13                 // Field _npcs:Ljava/util/Set;
        83: aload_3
        84: invokeinterface #204,  2          // InterfaceMethod java/util/Set.add:(Ljava/lang/Object;)Z
        89: pop
        90: goto          95
        93: aconst_null
        94: astore_3
        95: aload_3
        96: ifnonnull     155
        99: aload_0
       100: iload_1
       101: aload_2
       102: invokespecial #207                // Method ext/mods/gameserver/model/spawn/ASpawn.doSpawn:(ZLext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/model/actor/Npc;
       105: astore_3
       106: aload_3
       107: ifnonnull     144
       110: getstatic     #211                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       113: ldc           #215                // String Can not spawn id {} from maker {}.
       115: iconst_2
       116: anewarray     #217                // class java/lang/Object
       119: dup
       120: iconst_0
       121: aload_0
       122: invokevirtual #219                // Method getNpcId:()I
       125: invokestatic  #222                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       128: aastore
       129: dup
       130: iconst_1
       131: aload_0
       132: getfield      #52                 // Field _npcMaker:Lext/mods/gameserver/model/spawn/NpcMaker;
       135: invokevirtual #228                // Method ext/mods/gameserver/model/spawn/NpcMaker.getName:()Ljava/lang/String;
       138: aastore
       139: invokevirtual #232                // Method ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;[Ljava/lang/Object;)V
       142: aconst_null
       143: areturn
       144: aload_0
       145: getfield      #13                 // Field _npcs:Ljava/util/Set;
       148: aload_3
       149: invokeinterface #204,  2          // InterfaceMethod java/util/Set.add:(Ljava/lang/Object;)Z
       154: pop
       155: aload_0
       156: getfield      #52                 // Field _npcMaker:Lext/mods/gameserver/model/spawn/NpcMaker;
       159: invokevirtual #238                // Method ext/mods/gameserver/model/spawn/NpcMaker.getMakerSpawnTime:()Lext/mods/gameserver/enums/MakerSpawnTime;
       162: astore        4
       164: aload         4
       166: ifnull        199
       169: aload         4
       171: getstatic     #242                // Field ext/mods/gameserver/enums/MakerSpawnTime.DOOR_OPEN:Lext/mods/gameserver/enums/MakerSpawnTime;
       174: if_acmpeq     199
       177: aload_0
       178: getfield      #52                 // Field _npcMaker:Lext/mods/gameserver/model/spawn/NpcMaker;
       181: invokevirtual #248                // Method ext/mods/gameserver/model/spawn/NpcMaker.getMakerSpawnTimeParams:()[Ljava/lang/String;
       184: astore        5
       186: aload         5
       188: ifnull        199
       191: aload_3
       192: aload         5
       194: iconst_0
       195: aaload
       196: invokevirtual #252                // Method ext/mods/gameserver/model/actor/Npc.setResidence:(Ljava/lang/String;)V
       199: aload_3
       200: areturn
      LineNumberTable:
        line 176: 0
        line 178: 2
        line 180: 35
        line 182: 43
        line 183: 46
        line 185: 49
        line 187: 52
        line 189: 56
        line 191: 61
        line 193: 74
        line 194: 79
        line 197: 93
        line 200: 95
        line 202: 99
        line 203: 106
        line 205: 110
        line 206: 142
        line 208: 144
        line 211: 155
        line 212: 164
        line 214: 177
        line 215: 186
        line 216: 191
        line 219: 199
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           35      14     5   npc   Lext/mods/gameserver/model/actor/Npc;
          186      13     5 params   [Ljava/lang/String;
            0     201     0  this   Lext/mods/gameserver/model/spawn/MultiSpawn;
            0     201     1 isSummonSpawn   Z
            0     201     2 summoner   Lext/mods/gameserver/model/actor/Creature;
            2     199     3 toRespawn   Lext/mods/gameserver/model/actor/Npc;
          164      37     4   mst   Lext/mods/gameserver/enums/MakerSpawnTime;
      StackMapTable: number_of_entries = 8
        frame_type = 253 /* append */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/model/actor/Npc, class java/util/Iterator ]
        frame_type = 35 /* same */
        frame_type = 250 /* chop */
          offset_delta = 2
        frame_type = 40 /* same */
        frame_type = 1 /* same */
        frame_type = 48 /* same */
        frame_type = 10 /* same */
        frame_type = 252 /* append */
          offset_delta = 43
          locals = [ class ext/mods/gameserver/enums/MakerSpawnTime ]

  public void onSpawn(ext.mods.gameserver.model.actor.Npc);
    descriptor: (Lext/mods/gameserver/model/actor/Npc;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=7, locals=4, args_size=2
         0: invokestatic  #256                // Method ext/mods/gameserver/data/xml/StaticSpawnData.getInstance:()Lext/mods/gameserver/data/xml/StaticSpawnData;
         3: aload_0
         4: invokevirtual #261                // Method getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
         7: invokevirtual #265                // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getNpcId:()I
        10: invokevirtual #268                // Method ext/mods/gameserver/data/xml/StaticSpawnData.getById:(I)Lext/mods/gameserver/model/records/custom/StaticSpawn;
        13: astore_2
        14: aload_2
        15: ifnull        66
        18: aload_2
        19: invokevirtual #272                // Method ext/mods/gameserver/model/records/custom/StaticSpawn.isEnabled:()Z
        22: ifeq          66
        25: aload_2
        26: invokevirtual #277                // Method ext/mods/gameserver/model/records/custom/StaticSpawn.earthQuake:()Z
        29: ifeq          49
        32: aload_1
        33: new           #280                // class ext/mods/gameserver/network/serverpackets/Earthquake
        36: dup
        37: aload_1
        38: bipush        20
        40: bipush        10
        42: iconst_1
        43: invokespecial #282                // Method ext/mods/gameserver/network/serverpackets/Earthquake."<init>":(Lext/mods/gameserver/model/WorldObject;IIZ)V
        46: invokevirtual #285                // Method ext/mods/gameserver/model/actor/Npc.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        49: aload_2
        50: invokevirtual #289                // Method ext/mods/gameserver/model/records/custom/StaticSpawn.announce:()Z
        53: ifeq          66
        56: sipush        10047
        59: aload_1
        60: invokevirtual #292                // Method ext/mods/gameserver/model/actor/Npc.getName:()Ljava/lang/String;
        63: invokestatic  #293                // Method ext/mods/gameserver/model/World.announceToOnlinePlayers:(ILjava/lang/String;)V
        66: aload_1
        67: instanceof    #299                // class ext/mods/gameserver/model/actor/instance/RaidBoss
        70: ifeq          114
        73: aload_1
        74: checkcast     #299                // class ext/mods/gameserver/model/actor/instance/RaidBoss
        77: astore_3
        78: getstatic     #301                // Field ext/mods/Config.ANNOUNCE_SPAWN_RAIDBOSS:Z
        81: ifeq          114
        84: sipush        10237
        87: iconst_2
        88: anewarray     #217                // class java/lang/Object
        91: dup
        92: iconst_0
        93: aload_3
        94: invokevirtual #305                // Method ext/mods/gameserver/model/actor/instance/RaidBoss.getName:()Ljava/lang/String;
        97: aastore
        98: dup
        99: iconst_1
       100: aload_3
       101: invokevirtual #306                // Method ext/mods/gameserver/model/actor/instance/RaidBoss.getStatus:()Lext/mods/gameserver/model/actor/status/AttackableStatus;
       104: invokevirtual #310                // Method ext/mods/gameserver/model/actor/status/AttackableStatus.getLevel:()I
       107: invokestatic  #222                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       110: aastore
       111: invokestatic  #315                // Method ext/mods/gameserver/model/World.announceToOnlinePlayers:(I[Ljava/lang/Object;)V
       114: aload_1
       115: instanceof    #318                // class ext/mods/gameserver/model/actor/instance/GrandBoss
       118: ifeq          162
       121: aload_1
       122: checkcast     #318                // class ext/mods/gameserver/model/actor/instance/GrandBoss
       125: astore_3
       126: getstatic     #320                // Field ext/mods/Config.ANNOUNCE_SPAWN_GRANDBOSS:Z
       129: ifeq          162
       132: sipush        10238
       135: iconst_2
       136: anewarray     #217                // class java/lang/Object
       139: dup
       140: iconst_0
       141: aload_3
       142: invokevirtual #323                // Method ext/mods/gameserver/model/actor/instance/GrandBoss.getName:()Ljava/lang/String;
       145: aastore
       146: dup
       147: iconst_1
       148: aload_3
       149: invokevirtual #324                // Method ext/mods/gameserver/model/actor/instance/GrandBoss.getStatus:()Lext/mods/gameserver/model/actor/status/AttackableStatus;
       152: invokevirtual #310                // Method ext/mods/gameserver/model/actor/status/AttackableStatus.getLevel:()I
       155: invokestatic  #222                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       158: aastore
       159: invokestatic  #315                // Method ext/mods/gameserver/model/World.announceToOnlinePlayers:(I[Ljava/lang/Object;)V
       162: aload_1
       163: iconst_0
       164: invokevirtual #192                // Method ext/mods/gameserver/model/actor/Npc.setReadyForRespawn:(Z)V
       167: aload_0
       168: getfield      #52                 // Field _npcMaker:Lext/mods/gameserver/model/spawn/NpcMaker;
       171: aload_1
       172: invokevirtual #325                // Method ext/mods/gameserver/model/spawn/NpcMaker.onSpawn:(Lext/mods/gameserver/model/actor/Npc;)V
       175: aload_0
       176: invokevirtual #328                // Method doSave:()V
       179: return
      LineNumberTable:
        line 225: 0
        line 226: 14
        line 228: 25
        line 229: 32
        line 231: 49
        line 232: 56
        line 235: 66
        line 236: 84
        line 238: 114
        line 239: 132
        line 241: 162
        line 243: 167
        line 245: 175
        line 246: 179
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           78      36     3 raidboss   Lext/mods/gameserver/model/actor/instance/RaidBoss;
          126      36     3 grandboss   Lext/mods/gameserver/model/actor/instance/GrandBoss;
            0     180     0  this   Lext/mods/gameserver/model/spawn/MultiSpawn;
            0     180     1   npc   Lext/mods/gameserver/model/actor/Npc;
           14     166     2 staticSpawn   Lext/mods/gameserver/model/records/custom/StaticSpawn;
      StackMapTable: number_of_entries = 4
        frame_type = 252 /* append */
          offset_delta = 49
          locals = [ class ext/mods/gameserver/model/records/custom/StaticSpawn ]
        frame_type = 16 /* same */
        frame_type = 47 /* same */
        frame_type = 47 /* same */

  public void doDelete();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=1
         0: aload_0
         1: getfield      #13                 // Field _npcs:Ljava/util/Set;
         4: invokestatic  #332                // InterfaceMethod java/util/Set.copyOf:(Ljava/util/Collection;)Ljava/util/Set;
         7: astore_1
         8: aload_0
         9: getfield      #13                 // Field _npcs:Ljava/util/Set;
        12: invokeinterface #336,  1          // InterfaceMethod java/util/Set.clear:()V
        17: aload_1
        18: invokedynamic #339,  0            // InvokeDynamic #0:accept:()Ljava/util/function/Consumer;
        23: invokeinterface #343,  2          // InterfaceMethod java/util/Set.forEach:(Ljava/util/function/Consumer;)V
        28: aload_0
        29: getfield      #24                 // Field _spawnedCount:Ljava/util/concurrent/atomic/AtomicInteger;
        32: iconst_0
        33: invokevirtual #347                // Method java/util/concurrent/atomic/AtomicInteger.set:(I)V
        36: aload_0
        37: getfield      #60                 // Field _spawnData:Lext/mods/gameserver/model/spawn/SpawnData;
        40: ifnull        51
        43: aload_0
        44: getfield      #60                 // Field _spawnData:Lext/mods/gameserver/model/spawn/SpawnData;
        47: iconst_m1
        48: invokevirtual #349                // Method ext/mods/gameserver/model/spawn/SpawnData.setStatus:(B)V
        51: return
      LineNumberTable:
        line 251: 0
        line 253: 8
        line 255: 17
        line 266: 28
        line 268: 36
        line 269: 43
        line 270: 51
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      52     0  this   Lext/mods/gameserver/model/spawn/MultiSpawn;
            8      44     1 tmpNpcs   Ljava/util/Set;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            8      44     1 tmpNpcs   Ljava/util/Set<Lext/mods/gameserver/model/actor/Npc;>;
      StackMapTable: number_of_entries = 1
        frame_type = 252 /* append */
          offset_delta = 51
          locals = [ class java/util/Set ]

  public long calculateRespawnDelay();
    descriptor: ()J
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=2, args_size=1
         0: aload_0
         1: getfield      #60                 // Field _spawnData:Lext/mods/gameserver/model/spawn/SpawnData;
         4: ifnull        54
         7: invokestatic  #256                // Method ext/mods/gameserver/data/xml/StaticSpawnData.getInstance:()Lext/mods/gameserver/data/xml/StaticSpawnData;
        10: aload_0
        11: invokevirtual #261                // Method getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
        14: invokevirtual #265                // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getNpcId:()I
        17: invokevirtual #268                // Method ext/mods/gameserver/data/xml/StaticSpawnData.getById:(I)Lext/mods/gameserver/model/records/custom/StaticSpawn;
        20: astore_1
        21: aload_1
        22: ifnull        54
        25: aload_1
        26: invokevirtual #272                // Method ext/mods/gameserver/model/records/custom/StaticSpawn.isEnabled:()Z
        29: ifeq          54
        32: aload_1
        33: invokevirtual #355                // Method ext/mods/gameserver/model/records/custom/StaticSpawn.calcNextDate:()J
        36: invokestatic  #359                // Method java/lang/System.currentTimeMillis:()J
        39: lsub
        40: ldc2_w        #364                // long 1000l
        43: ldiv
        44: aload_1
        45: invokevirtual #366                // Method ext/mods/gameserver/model/records/custom/StaticSpawn.randomTime:()I
        48: invokestatic  #147                // Method ext/mods/commons/random/Rnd.get:(I)I
        51: i2l
        52: ladd
        53: lreturn
        54: aload_0
        55: invokespecial #369                // Method ext/mods/gameserver/model/spawn/ASpawn.calculateRespawnDelay:()J
        58: lreturn
      LineNumberTable:
        line 275: 0
        line 277: 7
        line 278: 21
        line 279: 32
        line 282: 54
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           21      33     1 staticSpawn   Lext/mods/gameserver/model/records/custom/StaticSpawn;
            0      59     0  this   Lext/mods/gameserver/model/spawn/MultiSpawn;
      StackMapTable: number_of_entries = 1
        frame_type = 54 /* same */

  public void onDecay(ext.mods.gameserver.model.actor.Npc);
    descriptor: (Lext/mods/gameserver/model/actor/Npc;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=5, args_size=2
         0: aload_0
         1: iconst_1
         2: invokevirtual #372                // Method decreaseSpawnedCount:(I)Z
         5: pop
         6: aload_0
         7: getfield      #52                 // Field _npcMaker:Lext/mods/gameserver/model/spawn/NpcMaker;
        10: aload_1
        11: invokevirtual #376                // Method ext/mods/gameserver/model/spawn/NpcMaker.onDecay:(Lext/mods/gameserver/model/actor/Npc;)V
        14: aload_0
        15: invokevirtual #379                // Method getRespawnDelay:()I
        18: ifle          114
        21: aload_0
        22: aload_1
        23: invokevirtual #382                // Method calculateBossRespawnDelayMs:(Lext/mods/gameserver/model/actor/Npc;)J
        26: lstore_2
        27: lload_2
        28: lconst_0
        29: lcmp
        30: ifne          87
        33: aload_1
        34: invokevirtual #386                // Method ext/mods/gameserver/model/actor/Npc.getSpawn:()Lext/mods/gameserver/model/spawn/ASpawn;
        37: invokevirtual #390                // Method ext/mods/gameserver/model/spawn/ASpawn.getSpawnData:()Lext/mods/gameserver/model/spawn/SpawnData;
        40: astore        4
        42: aload         4
        44: ifnull        69
        47: aload         4
        49: invokevirtual #394                // Method ext/mods/gameserver/model/spawn/SpawnData.getRespawnTime:()J
        52: invokestatic  #359                // Method java/lang/System.currentTimeMillis:()J
        55: lcmp
        56: ifle          69
        59: aload         4
        61: invokevirtual #394                // Method ext/mods/gameserver/model/spawn/SpawnData.getRespawnTime:()J
        64: invokestatic  #359                // Method java/lang/System.currentTimeMillis:()J
        67: lsub
        68: lstore_2
        69: lload_2
        70: lconst_0
        71: lcmp
        72: ifne          87
        75: aload_1
        76: invokevirtual #386                // Method ext/mods/gameserver/model/actor/Npc.getSpawn:()Lext/mods/gameserver/model/spawn/ASpawn;
        79: invokevirtual #369                // Method ext/mods/gameserver/model/spawn/ASpawn.calculateRespawnDelay:()J
        82: ldc2_w        #364                // long 1000l
        85: lmul
        86: lstore_2
        87: aload_0
        88: getfield      #60                 // Field _spawnData:Lext/mods/gameserver/model/spawn/SpawnData;
        91: ifnull        102
        94: aload_0
        95: getfield      #60                 // Field _spawnData:Lext/mods/gameserver/model/spawn/SpawnData;
        98: lload_2
        99: invokevirtual #397                // Method ext/mods/gameserver/model/spawn/SpawnData.setRespawn:(J)V
       102: aload_1
       103: iconst_1
       104: invokevirtual #192                // Method ext/mods/gameserver/model/actor/Npc.setReadyForRespawn:(Z)V
       107: aload_0
       108: invokevirtual #328                // Method doSave:()V
       111: goto          125
       114: aload_0
       115: getfield      #13                 // Field _npcs:Ljava/util/Set;
       118: aload_1
       119: invokeinterface #196,  2          // InterfaceMethod java/util/Set.remove:(Ljava/lang/Object;)Z
       124: pop
       125: return
      LineNumberTable:
        line 288: 0
        line 289: 6
        line 291: 14
        line 293: 21
        line 294: 27
        line 296: 33
        line 297: 42
        line 298: 59
        line 300: 69
        line 301: 75
        line 304: 87
        line 305: 94
        line 307: 102
        line 309: 107
        line 310: 111
        line 313: 114
        line 315: 125
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           42      45     4 spawnData   Lext/mods/gameserver/model/spawn/SpawnData;
           27      84     2 respawnDelay   J
            0     126     0  this   Lext/mods/gameserver/model/spawn/MultiSpawn;
            0     126     1   npc   Lext/mods/gameserver/model/actor/Npc;
      StackMapTable: number_of_entries = 5
        frame_type = 253 /* append */
          offset_delta = 69
          locals = [ long, class ext/mods/gameserver/model/spawn/SpawnData ]
        frame_type = 250 /* chop */
          offset_delta = 17
        frame_type = 14 /* same */
        frame_type = 250 /* chop */
          offset_delta = 11
        frame_type = 10 /* same */

  public java.lang.String toString();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #219                // Method getNpcId:()I
         4: invokedynamic #401,  0            // InvokeDynamic #1:makeConcatWithConstants:(I)Ljava/lang/String;
         9: areturn
      LineNumberTable:
        line 320: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/gameserver/model/spawn/MultiSpawn;

  public java.lang.String getDescription();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #52                 // Field _npcMaker:Lext/mods/gameserver/model/spawn/NpcMaker;
         4: invokevirtual #228                // Method ext/mods/gameserver/model/spawn/NpcMaker.getName:()Ljava/lang/String;
         7: invokedynamic #405,  0            // InvokeDynamic #2:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
        12: areturn
      LineNumberTable:
        line 326: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      13     0  this   Lext/mods/gameserver/model/spawn/MultiSpawn;

  public void updateSpawnData();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #60                 // Field _spawnData:Lext/mods/gameserver/model/spawn/SpawnData;
         4: ifnonnull     8
         7: return
         8: aload_0
         9: getfield      #13                 // Field _npcs:Ljava/util/Set;
        12: aload_0
        13: invokedynamic #408,  0            // InvokeDynamic #3:accept:(Lext/mods/gameserver/model/spawn/MultiSpawn;)Ljava/util/function/Consumer;
        18: invokeinterface #343,  2          // InterfaceMethod java/util/Set.forEach:(Ljava/util/function/Consumer;)V
        23: return
      LineNumberTable:
        line 332: 0
        line 333: 7
        line 335: 8
        line 336: 23
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      24     0  this   Lext/mods/gameserver/model/spawn/MultiSpawn;
      StackMapTable: number_of_entries = 1
        frame_type = 8 /* same */

  public void sendScriptEvent(int, int, int);
    descriptor: (III)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=4, args_size=4
         0: aload_0
         1: getfield      #13                 // Field _npcs:Ljava/util/Set;
         4: iload_1
         5: iload_2
         6: iload_3
         7: invokedynamic #411,  0            // InvokeDynamic #4:accept:(III)Ljava/util/function/Consumer;
        12: invokeinterface #343,  2          // InterfaceMethod java/util/Set.forEach:(Ljava/util/function/Consumer;)V
        17: return
      LineNumberTable:
        line 341: 0
        line 342: 17
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      18     0  this   Lext/mods/gameserver/model/spawn/MultiSpawn;
            0      18     1 eventId   I
            0      18     2  arg1   I
            0      18     3  arg2   I

  public ext.mods.gameserver.model.spawn.NpcMaker getNpcMaker();
    descriptor: ()Lext/mods/gameserver/model/spawn/NpcMaker;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #52                 // Field _npcMaker:Lext/mods/gameserver/model/spawn/NpcMaker;
         4: areturn
      LineNumberTable:
        line 346: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/spawn/MultiSpawn;

  public int[][] getCoords();
    descriptor: ()[[I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #56                 // Field _coords:[[I
         4: areturn
      LineNumberTable:
        line 351: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/spawn/MultiSpawn;

  public int getTotal();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #64                 // Field _total:I
         4: ireturn
      LineNumberTable:
        line 356: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/spawn/MultiSpawn;

  public java.util.Set<ext.mods.gameserver.model.actor.Npc> getNpcs();
    descriptor: ()Ljava/util/Set;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field _npcs:Ljava/util/Set;
         4: areturn
      LineNumberTable:
        line 361: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/spawn/MultiSpawn;
    Signature: #556                         // ()Ljava/util/Set<Lext/mods/gameserver/model/actor/Npc;>;

  public java.util.Set<ext.mods.gameserver.model.actor.Npc> getDecayedNpcs();
    descriptor: ()Ljava/util/Set;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=4, args_size=1
         0: invokestatic  #7                  // Method java/util/concurrent/ConcurrentHashMap.newKeySet:()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;
         3: astore_1
         4: aload_0
         5: getfield      #13                 // Field _npcs:Ljava/util/Set;
         8: invokeinterface #83,  1           // InterfaceMethod java/util/Set.iterator:()Ljava/util/Iterator;
        13: astore_2
        14: aload_2
        15: invokeinterface #87,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        20: ifeq          51
        23: aload_2
        24: invokeinterface #92,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        29: checkcast     #96                 // class ext/mods/gameserver/model/actor/Npc
        32: astore_3
        33: aload_3
        34: invokevirtual #98                 // Method ext/mods/gameserver/model/actor/Npc.isDecayed:()Z
        37: ifeq          48
        40: aload_1
        41: aload_3
        42: invokeinterface #204,  2          // InterfaceMethod java/util/Set.add:(Ljava/lang/Object;)Z
        47: pop
        48: goto          14
        51: aload_1
        52: areturn
      LineNumberTable:
        line 366: 0
        line 367: 4
        line 369: 33
        line 370: 40
        line 371: 48
        line 373: 51
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           33      15     3   npc   Lext/mods/gameserver/model/actor/Npc;
            0      53     0  this   Lext/mods/gameserver/model/spawn/MultiSpawn;
            4      49     1 decayedNpcs   Ljava/util/Set;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            4      49     1 decayedNpcs   Ljava/util/Set<Lext/mods/gameserver/model/actor/Npc;>;
      StackMapTable: number_of_entries = 3
        frame_type = 253 /* append */
          offset_delta = 14
          locals = [ class java/util/Set, class java/util/Iterator ]
        frame_type = 33 /* same */
        frame_type = 250 /* chop */
          offset_delta = 2
    Signature: #556                         // ()Ljava/util/Set<Lext/mods/gameserver/model/actor/Npc;>;

  public boolean increaseSpawnedCount(int);
    descriptor: (I)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=3, args_size=2
         0: aload_0
         1: getfield      #24                 // Field _spawnedCount:Ljava/util/concurrent/atomic/AtomicInteger;
         4: invokevirtual #414                // Method java/util/concurrent/atomic/AtomicInteger.get:()I
         7: iload_1
         8: iadd
         9: istore_2
        10: iload_2
        11: iflt          32
        14: iload_2
        15: aload_0
        16: getfield      #64                 // Field _total:I
        19: if_icmpgt     32
        22: aload_0
        23: getfield      #24                 // Field _spawnedCount:Ljava/util/concurrent/atomic/AtomicInteger;
        26: iload_2
        27: invokevirtual #347                // Method java/util/concurrent/atomic/AtomicInteger.set:(I)V
        30: iconst_1
        31: ireturn
        32: iconst_0
        33: ireturn
      LineNumberTable:
        line 378: 0
        line 379: 10
        line 381: 22
        line 382: 30
        line 384: 32
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      34     0  this   Lext/mods/gameserver/model/spawn/MultiSpawn;
            0      34     1 count   I
           10      24     2 newspawnedCount   I
      StackMapTable: number_of_entries = 1
        frame_type = 252 /* append */
          offset_delta = 32
          locals = [ int ]

  public boolean decreaseSpawnedCount(int);
    descriptor: (I)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=3, args_size=2
         0: aload_0
         1: getfield      #24                 // Field _spawnedCount:Ljava/util/concurrent/atomic/AtomicInteger;
         4: invokevirtual #414                // Method java/util/concurrent/atomic/AtomicInteger.get:()I
         7: iload_1
         8: isub
         9: istore_2
        10: iload_2
        11: iflt          32
        14: iload_2
        15: aload_0
        16: getfield      #64                 // Field _total:I
        19: if_icmpgt     32
        22: aload_0
        23: getfield      #24                 // Field _spawnedCount:Ljava/util/concurrent/atomic/AtomicInteger;
        26: iload_2
        27: invokevirtual #347                // Method java/util/concurrent/atomic/AtomicInteger.set:(I)V
        30: iconst_1
        31: ireturn
        32: iconst_0
        33: ireturn
      LineNumberTable:
        line 389: 0
        line 390: 10
        line 392: 22
        line 393: 30
        line 395: 32
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      34     0  this   Lext/mods/gameserver/model/spawn/MultiSpawn;
            0      34     1 count   I
           10      24     2 newspawnedCount   I
      StackMapTable: number_of_entries = 1
        frame_type = 252 /* append */
          offset_delta = 32
          locals = [ int ]

  public int getSpawnedCount();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #24                 // Field _spawnedCount:Ljava/util/concurrent/atomic/AtomicInteger;
         4: invokevirtual #414                // Method java/util/concurrent/atomic/AtomicInteger.get:()I
         7: ireturn
      LineNumberTable:
        line 400: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/spawn/MultiSpawn;

  public java.util.Set<ext.mods.gameserver.model.actor.Npc> doSpawn(int, boolean);
    descriptor: (IZ)Ljava/util/Set;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=4, args_size=3
         0: iconst_0
         1: istore_3
         2: iload_3
         3: iload_1
         4: if_icmpge     20
         7: aload_0
         8: iload_2
         9: aconst_null
        10: invokevirtual #416                // Method doSpawn:(ZLext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/model/actor/Npc;
        13: pop
        14: iinc          3, 1
        17: goto          2
        20: aload_0
        21: getfield      #13                 // Field _npcs:Ljava/util/Set;
        24: areturn
      LineNumberTable:
        line 405: 0
        line 406: 7
        line 405: 14
        line 408: 20
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            2      18     3     i   I
            0      25     0  this   Lext/mods/gameserver/model/spawn/MultiSpawn;
            0      25     1 count   I
            0      25     2 isSummonSpawn   Z
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 2
          locals = [ int ]
        frame_type = 250 /* chop */
          offset_delta = 17
    Signature: #565                         // (IZ)Ljava/util/Set<Lext/mods/gameserver/model/actor/Npc;>;

  public void scheduleSpawn(long);
    descriptor: (J)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=3, args_size=2
         0: invokestatic  #417                // Method ext/mods/gameserver/taskmanager/MakerSpawnScheduleTaskManager.getInstance:()Lext/mods/gameserver/taskmanager/MakerSpawnScheduleTaskManager;
         3: aload_0
         4: lload_1
         5: invokestatic  #422                // Method java/lang/Long.valueOf:(J)Ljava/lang/Long;
         8: invokevirtual #427                // Method ext/mods/gameserver/taskmanager/MakerSpawnScheduleTaskManager.addSpawn:(Lext/mods/gameserver/model/spawn/MultiSpawn;Ljava/lang/Long;)V
        11: return
      LineNumberTable:
        line 413: 0
        line 414: 11
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/gameserver/model/spawn/MultiSpawn;
            0      12     1 delay   J

  public void cancelScheduledSpawns();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: invokestatic  #417                // Method ext/mods/gameserver/taskmanager/MakerSpawnScheduleTaskManager.getInstance:()Lext/mods/gameserver/taskmanager/MakerSpawnScheduleTaskManager;
         3: aload_0
         4: invokevirtual #431                // Method ext/mods/gameserver/taskmanager/MakerSpawnScheduleTaskManager.cancelMakerRespawns:(Lext/mods/gameserver/model/spawn/MultiSpawn;)V
         7: return
      LineNumberTable:
        line 418: 0
        line 419: 7
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/spawn/MultiSpawn;

  public int getRespawningNpcCount();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: invokestatic  #417                // Method ext/mods/gameserver/taskmanager/MakerSpawnScheduleTaskManager.getInstance:()Lext/mods/gameserver/taskmanager/MakerSpawnScheduleTaskManager;
         3: aload_0
         4: invokevirtual #435                // Method ext/mods/gameserver/taskmanager/MakerSpawnScheduleTaskManager.getRespawningNpcCount:(Lext/mods/gameserver/model/spawn/MultiSpawn;)I
         7: ireturn
      LineNumberTable:
        line 423: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/spawn/MultiSpawn;

  public void loadDBNpcInfo();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=1, args_size=1
         0: aload_0
         1: getfield      #52                 // Field _npcMaker:Lext/mods/gameserver/model/spawn/NpcMaker;
         4: invokevirtual #439                // Method ext/mods/gameserver/model/spawn/NpcMaker.getMaker:()Lext/mods/gameserver/scripting/SpawnMaker;
         7: aload_0
         8: aload_0
         9: getfield      #60                 // Field _spawnData:Lext/mods/gameserver/model/spawn/SpawnData;
        12: aload_0
        13: getfield      #52                 // Field _npcMaker:Lext/mods/gameserver/model/spawn/NpcMaker;
        16: invokevirtual #443                // Method ext/mods/gameserver/scripting/SpawnMaker.onNpcDBInfo:(Lext/mods/gameserver/model/spawn/MultiSpawn;Lext/mods/gameserver/model/spawn/SpawnData;Lext/mods/gameserver/model/spawn/NpcMaker;)V
        19: return
      LineNumberTable:
        line 428: 0
        line 429: 19
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      20     0  this   Lext/mods/gameserver/model/spawn/MultiSpawn;
}
SourceFile: "MultiSpawn.java"
BootstrapMethods:
  0: #594 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #577 (Ljava/lang/Object;)V
      #579 REF_invokeStatic ext/mods/gameserver/model/spawn/MultiSpawn.lambda$doDelete$0:(Lext/mods/gameserver/model/actor/Npc;)V
      #582 (Lext/mods/gameserver/model/actor/Npc;)V
  1: #601 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #583 MultiSpawn [id=\u0001]
  2: #601 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #585 NpcMaker: \u0001
  3: #594 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #577 (Ljava/lang/Object;)V
      #587 REF_invokeVirtual ext/mods/gameserver/model/spawn/MultiSpawn.lambda$updateSpawnData$0:(Lext/mods/gameserver/model/actor/Npc;)V
      #582 (Lext/mods/gameserver/model/actor/Npc;)V
  4: #594 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #577 (Ljava/lang/Object;)V
      #590 REF_invokeStatic ext/mods/gameserver/model/spawn/MultiSpawn.lambda$sendScriptEvent$0:(IIILext/mods/gameserver/model/actor/Npc;)V
      #582 (Lext/mods/gameserver/model/actor/Npc;)V
  5: #594 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #577 (Ljava/lang/Object;)V
      #593 REF_invokeVirtual ext/mods/gameserver/model/actor/Npc.deleteMe:()V
      #582 (Lext/mods/gameserver/model/actor/Npc;)V
InnerClasses:
  public static final #610= #608 of #8;   // KeySetView=class java/util/concurrent/ConcurrentHashMap$KeySetView of class java/util/concurrent/ConcurrentHashMap
  public static final #615= #611 of #613; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
