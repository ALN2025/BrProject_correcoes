// Bytecode for: ext.mods.gameserver.model.spawn.Spawn
// File: ext\mods\gameserver\model\spawn\Spawn.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/spawn/Spawn.class
  Last modified 9 de jul de 2026; size 7070 bytes
  MD5 checksum 933bd1fb7c25a16b0f731931e9ce4d8d
  Compiled from "Spawn.java"
public final class ext.mods.gameserver.model.spawn.Spawn extends ext.mods.gameserver.model.spawn.ASpawn
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #13                         // ext/mods/gameserver/model/spawn/Spawn
  super_class: #2                         // ext/mods/gameserver/model/spawn/ASpawn
  interfaces: 0, fields: 3, methods: 21, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/gameserver/model/spawn/ASpawn."<init>":(Lext/mods/gameserver/model/actor/template/NpcTemplate;)V
    #2 = Class              #4            // ext/mods/gameserver/model/spawn/ASpawn
    #3 = NameAndType        #5:#6         // "<init>":(Lext/mods/gameserver/model/actor/template/NpcTemplate;)V
    #4 = Utf8               ext/mods/gameserver/model/spawn/ASpawn
    #5 = Utf8               <init>
    #6 = Utf8               (Lext/mods/gameserver/model/actor/template/NpcTemplate;)V
    #7 = Class              #8            // ext/mods/gameserver/model/location/SpawnLocation
    #8 = Utf8               ext/mods/gameserver/model/location/SpawnLocation
    #9 = Methodref          #7.#10        // ext/mods/gameserver/model/location/SpawnLocation."<init>":(IIII)V
   #10 = NameAndType        #5:#11        // "<init>":(IIII)V
   #11 = Utf8               (IIII)V
   #12 = Fieldref           #13.#14       // ext/mods/gameserver/model/spawn/Spawn._loc:Lext/mods/gameserver/model/location/SpawnLocation;
   #13 = Class              #15           // ext/mods/gameserver/model/spawn/Spawn
   #14 = NameAndType        #16:#17       // _loc:Lext/mods/gameserver/model/location/SpawnLocation;
   #15 = Utf8               ext/mods/gameserver/model/spawn/Spawn
   #16 = Utf8               _loc
   #17 = Utf8               Lext/mods/gameserver/model/location/SpawnLocation;
   #18 = Fieldref           #13.#19       // ext/mods/gameserver/model/spawn/Spawn._disableTerritoryCheck:Z
   #19 = NameAndType        #20:#21       // _disableTerritoryCheck:Z
   #20 = Utf8               _disableTerritoryCheck
   #21 = Utf8               Z
   #22 = Methodref          #2.#23        // ext/mods/gameserver/model/spawn/ASpawn."<init>":(I)V
   #23 = NameAndType        #5:#24        // "<init>":(I)V
   #24 = Utf8               (I)V
   #25 = Methodref          #7.#26        // ext/mods/gameserver/model/location/SpawnLocation.clone:()Lext/mods/gameserver/model/location/SpawnLocation;
   #26 = NameAndType        #27:#28       // clone:()Lext/mods/gameserver/model/location/SpawnLocation;
   #27 = Utf8               clone
   #28 = Utf8               ()Lext/mods/gameserver/model/location/SpawnLocation;
   #29 = Methodref          #7.#30        // ext/mods/gameserver/model/location/SpawnLocation.getHeading:()I
   #30 = NameAndType        #31:#32       // getHeading:()I
   #31 = Utf8               getHeading
   #32 = Utf8               ()I
   #33 = Integer            65536
   #34 = Methodref          #35.#36       // ext/mods/commons/random/Rnd.get:(I)I
   #35 = Class              #37           // ext/mods/commons/random/Rnd
   #36 = NameAndType        #38:#39       // get:(I)I
   #37 = Utf8               ext/mods/commons/random/Rnd
   #38 = Utf8               get
   #39 = Utf8               (I)I
   #40 = Methodref          #7.#41        // ext/mods/gameserver/model/location/SpawnLocation.setHeading:(I)V
   #41 = NameAndType        #42:#24       // setHeading:(I)V
   #42 = Utf8               setHeading
   #43 = Methodref          #44.#45       // ext/mods/gameserver/model/location/Location.addRandomOffset:(I)V
   #44 = Class              #46           // ext/mods/gameserver/model/location/Location
   #45 = NameAndType        #47:#24       // addRandomOffset:(I)V
   #46 = Utf8               ext/mods/gameserver/model/location/Location
   #47 = Utf8               addRandomOffset
   #48 = Methodref          #49.#50       // ext/mods/gameserver/geoengine/GeoEngine.getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
   #49 = Class              #51           // ext/mods/gameserver/geoengine/GeoEngine
   #50 = NameAndType        #52:#53       // getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
   #51 = Utf8               ext/mods/gameserver/geoengine/GeoEngine
   #52 = Utf8               getInstance
   #53 = Utf8               ()Lext/mods/gameserver/geoengine/GeoEngine;
   #54 = Methodref          #49.#55       // ext/mods/gameserver/geoengine/GeoEngine.getValidLocation:(Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/location/Location;)Lext/mods/gameserver/model/location/Location;
   #55 = NameAndType        #56:#57       // getValidLocation:(Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/location/Location;)Lext/mods/gameserver/model/location/Location;
   #56 = Utf8               getValidLocation
   #57 = Utf8               (Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/location/Location;)Lext/mods/gameserver/model/location/Location;
   #58 = Methodref          #44.#59       // ext/mods/gameserver/model/location/Location.set:(Lext/mods/gameserver/model/location/Location;)V
   #59 = NameAndType        #60:#61       // set:(Lext/mods/gameserver/model/location/Location;)V
   #60 = Utf8               set
   #61 = Utf8               (Lext/mods/gameserver/model/location/Location;)V
   #62 = Fieldref           #63.#64       // ext/mods/Config.MAX_DRIFT_RANGE:I
   #63 = Class              #65           // ext/mods/Config
   #64 = NameAndType        #66:#67       // MAX_DRIFT_RANGE:I
   #65 = Utf8               ext/mods/Config
   #66 = Utf8               MAX_DRIFT_RANGE
   #67 = Utf8               I
   #68 = Methodref          #69.#70       // ext/mods/gameserver/model/WorldObject.isIn3DRadius:(Lext/mods/gameserver/model/location/Location;I)Z
   #69 = Class              #71           // ext/mods/gameserver/model/WorldObject
   #70 = NameAndType        #72:#73       // isIn3DRadius:(Lext/mods/gameserver/model/location/Location;I)Z
   #71 = Utf8               ext/mods/gameserver/model/WorldObject
   #72 = Utf8               isIn3DRadius
   #73 = Utf8               (Lext/mods/gameserver/model/location/Location;I)Z
   #74 = Methodref          #2.#75        // ext/mods/gameserver/model/spawn/ASpawn.doSpawn:(ZLext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/model/actor/Npc;
   #75 = NameAndType        #76:#77       // doSpawn:(ZLext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/model/actor/Npc;
   #76 = Utf8               doSpawn
   #77 = Utf8               (ZLext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/model/actor/Npc;
   #78 = Fieldref           #13.#79       // ext/mods/gameserver/model/spawn/Spawn._npc:Lext/mods/gameserver/model/actor/Npc;
   #79 = NameAndType        #80:#81       // _npc:Lext/mods/gameserver/model/actor/Npc;
   #80 = Utf8               _npc
   #81 = Utf8               Lext/mods/gameserver/model/actor/Npc;
   #82 = Fieldref           #13.#83       // ext/mods/gameserver/model/spawn/Spawn.LOGGER:Lext/mods/commons/logging/CLogger;
   #83 = NameAndType        #84:#85       // LOGGER:Lext/mods/commons/logging/CLogger;
   #84 = Utf8               LOGGER
   #85 = Utf8               Lext/mods/commons/logging/CLogger;
   #86 = String             #87           // Can not spawn id {} from loc {}.
   #87 = Utf8               Can not spawn id {} from loc {}.
   #88 = Class              #89           // java/lang/Object
   #89 = Utf8               java/lang/Object
   #90 = Methodref          #13.#91       // ext/mods/gameserver/model/spawn/Spawn.getNpcId:()I
   #91 = NameAndType        #92:#32       // getNpcId:()I
   #92 = Utf8               getNpcId
   #93 = Methodref          #94.#95       // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
   #94 = Class              #96           // java/lang/Integer
   #95 = NameAndType        #97:#98       // valueOf:(I)Ljava/lang/Integer;
   #96 = Utf8               java/lang/Integer
   #97 = Utf8               valueOf
   #98 = Utf8               (I)Ljava/lang/Integer;
   #99 = Methodref          #100.#101     // ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;[Ljava/lang/Object;)V
  #100 = Class              #102          // ext/mods/commons/logging/CLogger
  #101 = NameAndType        #103:#104     // warn:(Ljava/lang/Object;[Ljava/lang/Object;)V
  #102 = Utf8               ext/mods/commons/logging/CLogger
  #103 = Utf8               warn
  #104 = Utf8               (Ljava/lang/Object;[Ljava/lang/Object;)V
  #105 = Methodref          #106.#107     // ext/mods/gameserver/data/manager/SpawnManager.getInstance:()Lext/mods/gameserver/data/manager/SpawnManager;
  #106 = Class              #108          // ext/mods/gameserver/data/manager/SpawnManager
  #107 = NameAndType        #52:#109      // getInstance:()Lext/mods/gameserver/data/manager/SpawnManager;
  #108 = Utf8               ext/mods/gameserver/data/manager/SpawnManager
  #109 = Utf8               ()Lext/mods/gameserver/data/manager/SpawnManager;
  #110 = Methodref          #106.#111     // ext/mods/gameserver/data/manager/SpawnManager.addSpawn:(Lext/mods/gameserver/model/spawn/Spawn;)V
  #111 = NameAndType        #112:#113     // addSpawn:(Lext/mods/gameserver/model/spawn/Spawn;)V
  #112 = Utf8               addSpawn
  #113 = Utf8               (Lext/mods/gameserver/model/spawn/Spawn;)V
  #114 = Fieldref           #13.#115      // ext/mods/gameserver/model/spawn/Spawn._spawnData:Lext/mods/gameserver/model/spawn/SpawnData;
  #115 = NameAndType        #116:#117     // _spawnData:Lext/mods/gameserver/model/spawn/SpawnData;
  #116 = Utf8               _spawnData
  #117 = Utf8               Lext/mods/gameserver/model/spawn/SpawnData;
  #118 = Methodref          #119.#120     // ext/mods/gameserver/model/spawn/SpawnData.setStatus:(B)V
  #119 = Class              #121          // ext/mods/gameserver/model/spawn/SpawnData
  #120 = NameAndType        #122:#123     // setStatus:(B)V
  #121 = Utf8               ext/mods/gameserver/model/spawn/SpawnData
  #122 = Utf8               setStatus
  #123 = Utf8               (B)V
  #124 = Methodref          #125.#126     // ext/mods/gameserver/model/actor/Npc.isMaster:()Z
  #125 = Class              #127          // ext/mods/gameserver/model/actor/Npc
  #126 = NameAndType        #128:#129     // isMaster:()Z
  #127 = Utf8               ext/mods/gameserver/model/actor/Npc
  #128 = Utf8               isMaster
  #129 = Utf8               ()Z
  #130 = Methodref          #125.#131     // ext/mods/gameserver/model/actor/Npc.getMinions:()Ljava/util/Set;
  #131 = NameAndType        #132:#133     // getMinions:()Ljava/util/Set;
  #132 = Utf8               getMinions
  #133 = Utf8               ()Ljava/util/Set;
  #134 = InvokeDynamic      #0:#135       // #0:accept:()Ljava/util/function/Consumer;
  #135 = NameAndType        #136:#137     // accept:()Ljava/util/function/Consumer;
  #136 = Utf8               accept
  #137 = Utf8               ()Ljava/util/function/Consumer;
  #138 = InterfaceMethodref #139.#140     // java/util/Set.forEach:(Ljava/util/function/Consumer;)V
  #139 = Class              #141          // java/util/Set
  #140 = NameAndType        #142:#143     // forEach:(Ljava/util/function/Consumer;)V
  #141 = Utf8               java/util/Set
  #142 = Utf8               forEach
  #143 = Utf8               (Ljava/util/function/Consumer;)V
  #144 = Methodref          #125.#145     // ext/mods/gameserver/model/actor/Npc.cancelRespawn:()V
  #145 = NameAndType        #146:#147     // cancelRespawn:()V
  #146 = Utf8               cancelRespawn
  #147 = Utf8               ()V
  #148 = Methodref          #125.#149     // ext/mods/gameserver/model/actor/Npc.deleteMe:()V
  #149 = NameAndType        #150:#147     // deleteMe:()V
  #150 = Utf8               deleteMe
  #151 = Methodref          #13.#152      // ext/mods/gameserver/model/spawn/Spawn.getRespawnDelay:()I
  #152 = NameAndType        #153:#32      // getRespawnDelay:()I
  #153 = Utf8               getRespawnDelay
  #154 = Methodref          #13.#155      // ext/mods/gameserver/model/spawn/Spawn.calculateBossRespawnDelayMs:(Lext/mods/gameserver/model/actor/Npc;)J
  #155 = NameAndType        #156:#157     // calculateBossRespawnDelayMs:(Lext/mods/gameserver/model/actor/Npc;)J
  #156 = Utf8               calculateBossRespawnDelayMs
  #157 = Utf8               (Lext/mods/gameserver/model/actor/Npc;)J
  #158 = Methodref          #13.#159      // ext/mods/gameserver/model/spawn/Spawn.calculateRespawnDelay:()J
  #159 = NameAndType        #160:#161     // calculateRespawnDelay:()J
  #160 = Utf8               calculateRespawnDelay
  #161 = Utf8               ()J
  #162 = Long               1000l
  #164 = Methodref          #119.#165     // ext/mods/gameserver/model/spawn/SpawnData.setRespawn:(J)V
  #165 = NameAndType        #166:#167     // setRespawn:(J)V
  #166 = Utf8               setRespawn
  #167 = Utf8               (J)V
  #168 = Methodref          #125.#169     // ext/mods/gameserver/model/actor/Npc.scheduleRespawn:(J)V
  #169 = NameAndType        #170:#167     // scheduleRespawn:(J)V
  #170 = Utf8               scheduleRespawn
  #171 = Methodref          #106.#172     // ext/mods/gameserver/data/manager/SpawnManager.deleteSpawn:(Lext/mods/gameserver/model/spawn/Spawn;)V
  #172 = NameAndType        #173:#113     // deleteSpawn:(Lext/mods/gameserver/model/spawn/Spawn;)V
  #173 = Utf8               deleteSpawn
  #174 = InvokeDynamic      #1:#175       // #1:makeConcatWithConstants:(I)Ljava/lang/String;
  #175 = NameAndType        #176:#177     // makeConcatWithConstants:(I)Ljava/lang/String;
  #176 = Utf8               makeConcatWithConstants
  #177 = Utf8               (I)Ljava/lang/String;
  #178 = Methodref          #179.#180     // java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
  #179 = Class              #181          // java/lang/String
  #180 = NameAndType        #97:#182      // valueOf:(Ljava/lang/Object;)Ljava/lang/String;
  #181 = Utf8               java/lang/String
  #182 = Utf8               (Ljava/lang/Object;)Ljava/lang/String;
  #183 = InvokeDynamic      #2:#184       // #2:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #184 = NameAndType        #176:#185     // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #185 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
  #186 = Methodref          #119.#187     // ext/mods/gameserver/model/spawn/SpawnData.setStats:(Lext/mods/gameserver/model/actor/Npc;)V
  #187 = NameAndType        #188:#189     // setStats:(Lext/mods/gameserver/model/actor/Npc;)V
  #188 = Utf8               setStats
  #189 = Utf8               (Lext/mods/gameserver/model/actor/Npc;)V
  #190 = Methodref          #125.#191     // ext/mods/gameserver/model/actor/Npc.sendScriptEvent:(III)V
  #191 = NameAndType        #192:#193     // sendScriptEvent:(III)V
  #192 = Utf8               sendScriptEvent
  #193 = Utf8               (III)V
  #194 = Methodref          #7.#195       // ext/mods/gameserver/model/location/SpawnLocation.getZ:()I
  #195 = NameAndType        #196:#32      // getZ:()I
  #196 = Utf8               getZ
  #197 = Fieldref           #63.#198      // ext/mods/Config.NPC_Z_INDEX:I
  #198 = NameAndType        #199:#67      // NPC_Z_INDEX:I
  #199 = Utf8               NPC_Z_INDEX
  #200 = Methodref          #7.#201       // ext/mods/gameserver/model/location/SpawnLocation.getX:()I
  #201 = NameAndType        #202:#32      // getX:()I
  #202 = Utf8               getX
  #203 = Methodref          #7.#204       // ext/mods/gameserver/model/location/SpawnLocation.getY:()I
  #204 = NameAndType        #205:#32      // getY:()I
  #205 = Utf8               getY
  #206 = Methodref          #49.#207      // ext/mods/gameserver/geoengine/GeoEngine.getHeight:(III)S
  #207 = NameAndType        #208:#209     // getHeight:(III)S
  #208 = Utf8               getHeight
  #209 = Utf8               (III)S
  #210 = Methodref          #7.#211       // ext/mods/gameserver/model/location/SpawnLocation.set:(IIII)V
  #211 = NameAndType        #60:#11       // set:(IIII)V
  #212 = Utf8               (Lext/mods/gameserver/model/actor/template/NpcTemplate;Z)V
  #213 = Utf8               Code
  #214 = Utf8               LineNumberTable
  #215 = Utf8               LocalVariableTable
  #216 = Utf8               this
  #217 = Utf8               Lext/mods/gameserver/model/spawn/Spawn;
  #218 = Utf8               template
  #219 = Utf8               Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #220 = Utf8               disableTerritoryCheck
  #221 = Utf8               Exceptions
  #222 = Class              #223          // java/lang/SecurityException
  #223 = Utf8               java/lang/SecurityException
  #224 = Class              #225          // java/lang/ClassNotFoundException
  #225 = Utf8               java/lang/ClassNotFoundException
  #226 = Class              #227          // java/lang/NoSuchMethodException
  #227 = Utf8               java/lang/NoSuchMethodException
  #228 = Class              #229          // java/io/InvalidClassException
  #229 = Utf8               java/io/InvalidClassException
  #230 = Utf8               (IZ)V
  #231 = Utf8               id
  #232 = Utf8               getSpawnLocation
  #233 = Utf8               loc
  #234 = Utf8               StackMapTable
  #235 = Utf8               getRandomWalkLocation
  #236 = Utf8               (Lext/mods/gameserver/model/actor/Npc;I)Lext/mods/gameserver/model/location/Location;
  #237 = Utf8               npc
  #238 = Utf8               offset
  #239 = Utf8               Lext/mods/gameserver/model/location/Location;
  #240 = Utf8               isInMyTerritory
  #241 = Utf8               (Lext/mods/gameserver/model/WorldObject;)Z
  #242 = Utf8               worldObject
  #243 = Utf8               Lext/mods/gameserver/model/WorldObject;
  #244 = Utf8               isSummonSpawn
  #245 = Utf8               summoner
  #246 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #247 = Utf8               doDelete
  #248 = Utf8               onDecay
  #249 = Utf8               respawnDelay
  #250 = Utf8               J
  #251 = Utf8               toString
  #252 = Utf8               ()Ljava/lang/String;
  #253 = Utf8               getDescription
  #254 = Utf8               getNpc
  #255 = Utf8               ()Lext/mods/gameserver/model/actor/Npc;
  #256 = Utf8               updateSpawnData
  #257 = Utf8               eventId
  #258 = Utf8               arg1
  #259 = Utf8               arg2
  #260 = Utf8               setLoc
  #261 = Utf8               (Lext/mods/gameserver/model/location/SpawnLocation;)V
  #262 = Utf8               biasedZ
  #263 = Utf8               x
  #264 = Utf8               y
  #265 = Utf8               z
  #266 = Utf8               heading
  #267 = Utf8               getLocX
  #268 = Utf8               getLocY
  #269 = Utf8               getLocZ
  #270 = Utf8               SourceFile
  #271 = Utf8               Spawn.java
  #272 = Utf8               BootstrapMethods
  #273 = MethodType         #274          //  (Ljava/lang/Object;)V
  #274 = Utf8               (Ljava/lang/Object;)V
  #275 = MethodHandle       5:#148        // REF_invokeVirtual ext/mods/gameserver/model/actor/Npc.deleteMe:()V
  #276 = MethodType         #189          //  (Lext/mods/gameserver/model/actor/Npc;)V
  #277 = String             #278          // Spawn [id=\u0001]
  #278 = Utf8               Spawn [id=\u0001]
  #279 = String             #280          // Location: \u0001
  #280 = Utf8               Location: \u0001
  #281 = MethodHandle       6:#282        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #282 = Methodref          #283.#284     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #283 = Class              #285          // java/lang/invoke/LambdaMetafactory
  #284 = NameAndType        #286:#287     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #285 = Utf8               java/lang/invoke/LambdaMetafactory
  #286 = Utf8               metafactory
  #287 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #288 = MethodHandle       6:#289        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #289 = Methodref          #290.#291     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #290 = Class              #292          // java/lang/invoke/StringConcatFactory
  #291 = NameAndType        #176:#293     // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #292 = Utf8               java/lang/invoke/StringConcatFactory
  #293 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #294 = Utf8               InnerClasses
  #295 = Class              #296          // java/lang/invoke/MethodHandles$Lookup
  #296 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #297 = Class              #298          // java/lang/invoke/MethodHandles
  #298 = Utf8               java/lang/invoke/MethodHandles
  #299 = Utf8               Lookup
{
  public ext.mods.gameserver.model.spawn.Spawn(ext.mods.gameserver.model.actor.template.NpcTemplate, boolean) throws java.lang.SecurityException, java.lang.ClassNotFoundException, java.lang.NoSuchMethodException, java.io.InvalidClassException;
    descriptor: (Lext/mods/gameserver/model/actor/template/NpcTemplate;Z)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=7, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: invokespecial #1                  // Method ext/mods/gameserver/model/spawn/ASpawn."<init>":(Lext/mods/gameserver/model/actor/template/NpcTemplate;)V
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
        21: iload_2
        22: putfield      #18                 // Field _disableTerritoryCheck:Z
        25: return
      LineNumberTable:
        line 46: 0
        line 39: 5
        line 48: 20
        line 49: 25
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      26     0  this   Lext/mods/gameserver/model/spawn/Spawn;
            0      26     1 template   Lext/mods/gameserver/model/actor/template/NpcTemplate;
            0      26     2 disableTerritoryCheck   Z
    Exceptions:
      throws java.lang.SecurityException, java.lang.ClassNotFoundException, java.lang.NoSuchMethodException, java.io.InvalidClassException

  public ext.mods.gameserver.model.spawn.Spawn(int, boolean) throws java.lang.SecurityException, java.lang.ClassNotFoundException, java.lang.NoSuchMethodException, java.io.InvalidClassException;
    descriptor: (IZ)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=7, locals=3, args_size=3
         0: aload_0
         1: iload_1
         2: invokespecial #22                 // Method ext/mods/gameserver/model/spawn/ASpawn."<init>":(I)V
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
        21: iload_2
        22: putfield      #18                 // Field _disableTerritoryCheck:Z
        25: return
      LineNumberTable:
        line 53: 0
        line 39: 5
        line 55: 20
        line 56: 25
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      26     0  this   Lext/mods/gameserver/model/spawn/Spawn;
            0      26     1    id   I
            0      26     2 disableTerritoryCheck   Z
    Exceptions:
      throws java.lang.SecurityException, java.lang.ClassNotFoundException, java.lang.NoSuchMethodException, java.io.InvalidClassException

  public ext.mods.gameserver.model.spawn.Spawn(ext.mods.gameserver.model.actor.template.NpcTemplate) throws java.lang.SecurityException, java.lang.ClassNotFoundException, java.lang.NoSuchMethodException, java.io.InvalidClassException;
    descriptor: (Lext/mods/gameserver/model/actor/template/NpcTemplate;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=7, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokespecial #1                  // Method ext/mods/gameserver/model/spawn/ASpawn."<init>":(Lext/mods/gameserver/model/actor/template/NpcTemplate;)V
         5: aload_0
         6: new           #7                  // class ext/mods/gameserver/model/location/SpawnLocation
         9: dup
        10: iconst_0
        11: iconst_0
        12: iconst_0
        13: iconst_0
        14: invokespecial #9                  // Method ext/mods/gameserver/model/location/SpawnLocation."<init>":(IIII)V
        17: putfield      #12                 // Field _loc:Lext/mods/gameserver/model/location/SpawnLocation;
        20: return
      LineNumberTable:
        line 60: 0
        line 39: 5
        line 61: 20
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      21     0  this   Lext/mods/gameserver/model/spawn/Spawn;
            0      21     1 template   Lext/mods/gameserver/model/actor/template/NpcTemplate;
    Exceptions:
      throws java.lang.SecurityException, java.lang.ClassNotFoundException, java.lang.NoSuchMethodException, java.io.InvalidClassException

  public ext.mods.gameserver.model.spawn.Spawn(int) throws java.lang.SecurityException, java.lang.ClassNotFoundException, java.lang.NoSuchMethodException, java.io.InvalidClassException;
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=7, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: invokespecial #22                 // Method ext/mods/gameserver/model/spawn/ASpawn."<init>":(I)V
         5: aload_0
         6: new           #7                  // class ext/mods/gameserver/model/location/SpawnLocation
         9: dup
        10: iconst_0
        11: iconst_0
        12: iconst_0
        13: iconst_0
        14: invokespecial #9                  // Method ext/mods/gameserver/model/location/SpawnLocation."<init>":(IIII)V
        17: putfield      #12                 // Field _loc:Lext/mods/gameserver/model/location/SpawnLocation;
        20: return
      LineNumberTable:
        line 65: 0
        line 39: 5
        line 66: 20
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      21     0  this   Lext/mods/gameserver/model/spawn/Spawn;
            0      21     1    id   I
    Exceptions:
      throws java.lang.SecurityException, java.lang.ClassNotFoundException, java.lang.NoSuchMethodException, java.io.InvalidClassException

  public ext.mods.gameserver.model.location.SpawnLocation getSpawnLocation();
    descriptor: ()Lext/mods/gameserver/model/location/SpawnLocation;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=1
         0: aload_0
         1: getfield      #12                 // Field _loc:Lext/mods/gameserver/model/location/SpawnLocation;
         4: invokevirtual #25                 // Method ext/mods/gameserver/model/location/SpawnLocation.clone:()Lext/mods/gameserver/model/location/SpawnLocation;
         7: astore_1
         8: aload_1
         9: invokevirtual #29                 // Method ext/mods/gameserver/model/location/SpawnLocation.getHeading:()I
        12: ifge          24
        15: aload_1
        16: ldc           #33                 // int 65536
        18: invokestatic  #34                 // Method ext/mods/commons/random/Rnd.get:(I)I
        21: invokevirtual #40                 // Method ext/mods/gameserver/model/location/SpawnLocation.setHeading:(I)V
        24: aload_1
        25: areturn
      LineNumberTable:
        line 71: 0
        line 73: 8
        line 74: 15
        line 76: 24
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      26     0  this   Lext/mods/gameserver/model/spawn/Spawn;
            8      18     1   loc   Lext/mods/gameserver/model/location/SpawnLocation;
      StackMapTable: number_of_entries = 1
        frame_type = 252 /* append */
          offset_delta = 24
          locals = [ class ext/mods/gameserver/model/location/SpawnLocation ]

  public ext.mods.gameserver.model.location.Location getRandomWalkLocation(ext.mods.gameserver.model.actor.Npc, int);
    descriptor: (Lext/mods/gameserver/model/actor/Npc;I)Lext/mods/gameserver/model/location/Location;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=4, args_size=3
         0: aload_0
         1: getfield      #12                 // Field _loc:Lext/mods/gameserver/model/location/SpawnLocation;
         4: invokevirtual #25                 // Method ext/mods/gameserver/model/location/SpawnLocation.clone:()Lext/mods/gameserver/model/location/SpawnLocation;
         7: astore_3
         8: aload_3
         9: iload_2
        10: invokevirtual #43                 // Method ext/mods/gameserver/model/location/Location.addRandomOffset:(I)V
        13: aload_3
        14: invokestatic  #48                 // Method ext/mods/gameserver/geoengine/GeoEngine.getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
        17: aload_1
        18: aload_3
        19: invokevirtual #54                 // Method ext/mods/gameserver/geoengine/GeoEngine.getValidLocation:(Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/location/Location;)Lext/mods/gameserver/model/location/Location;
        22: invokevirtual #58                 // Method ext/mods/gameserver/model/location/Location.set:(Lext/mods/gameserver/model/location/Location;)V
        25: aload_3
        26: areturn
      LineNumberTable:
        line 82: 0
        line 84: 8
        line 86: 13
        line 87: 25
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      27     0  this   Lext/mods/gameserver/model/spawn/Spawn;
            0      27     1   npc   Lext/mods/gameserver/model/actor/Npc;
            0      27     2 offset   I
            8      19     3   loc   Lext/mods/gameserver/model/location/Location;

  public boolean isInMyTerritory(ext.mods.gameserver.model.WorldObject);
    descriptor: (Lext/mods/gameserver/model/WorldObject;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: getfield      #18                 // Field _disableTerritoryCheck:Z
         4: ifeq          9
         7: iconst_1
         8: ireturn
         9: aload_1
        10: aload_0
        11: getfield      #12                 // Field _loc:Lext/mods/gameserver/model/location/SpawnLocation;
        14: getstatic     #62                 // Field ext/mods/Config.MAX_DRIFT_RANGE:I
        17: invokevirtual #68                 // Method ext/mods/gameserver/model/WorldObject.isIn3DRadius:(Lext/mods/gameserver/model/location/Location;I)Z
        20: ireturn
      LineNumberTable:
        line 93: 0
        line 94: 7
        line 96: 9
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      21     0  this   Lext/mods/gameserver/model/spawn/Spawn;
            0      21     1 worldObject   Lext/mods/gameserver/model/WorldObject;
      StackMapTable: number_of_entries = 1
        frame_type = 9 /* same */

  public ext.mods.gameserver.model.actor.Npc doSpawn(boolean, ext.mods.gameserver.model.actor.Creature);
    descriptor: (ZLext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/model/actor/Npc;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=3, args_size=3
         0: aload_0
         1: aload_0
         2: iload_1
         3: aload_2
         4: invokespecial #74                 // Method ext/mods/gameserver/model/spawn/ASpawn.doSpawn:(ZLext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/model/actor/Npc;
         7: putfield      #78                 // Field _npc:Lext/mods/gameserver/model/actor/Npc;
        10: aload_0
        11: getfield      #78                 // Field _npc:Lext/mods/gameserver/model/actor/Npc;
        14: ifnonnull     49
        17: getstatic     #82                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
        20: ldc           #86                 // String Can not spawn id {} from loc {}.
        22: iconst_2
        23: anewarray     #88                 // class java/lang/Object
        26: dup
        27: iconst_0
        28: aload_0
        29: invokevirtual #90                 // Method getNpcId:()I
        32: invokestatic  #93                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        35: aastore
        36: dup
        37: iconst_1
        38: aload_0
        39: getfield      #12                 // Field _loc:Lext/mods/gameserver/model/location/SpawnLocation;
        42: aastore
        43: invokevirtual #99                 // Method ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;[Ljava/lang/Object;)V
        46: goto          56
        49: invokestatic  #105                // Method ext/mods/gameserver/data/manager/SpawnManager.getInstance:()Lext/mods/gameserver/data/manager/SpawnManager;
        52: aload_0
        53: invokevirtual #110                // Method ext/mods/gameserver/data/manager/SpawnManager.addSpawn:(Lext/mods/gameserver/model/spawn/Spawn;)V
        56: aload_0
        57: getfield      #78                 // Field _npc:Lext/mods/gameserver/model/actor/Npc;
        60: areturn
      LineNumberTable:
        line 102: 0
        line 103: 10
        line 105: 17
        line 108: 49
        line 110: 56
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      61     0  this   Lext/mods/gameserver/model/spawn/Spawn;
            0      61     1 isSummonSpawn   Z
            0      61     2 summoner   Lext/mods/gameserver/model/actor/Creature;
      StackMapTable: number_of_entries = 2
        frame_type = 49 /* same */
        frame_type = 6 /* same */

  public void doDelete();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #78                 // Field _npc:Lext/mods/gameserver/model/actor/Npc;
         4: ifnonnull     8
         7: return
         8: aload_0
         9: getfield      #114                // Field _spawnData:Lext/mods/gameserver/model/spawn/SpawnData;
        12: ifnull        23
        15: aload_0
        16: getfield      #114                // Field _spawnData:Lext/mods/gameserver/model/spawn/SpawnData;
        19: iconst_m1
        20: invokevirtual #118                // Method ext/mods/gameserver/model/spawn/SpawnData.setStatus:(B)V
        23: aload_0
        24: getfield      #78                 // Field _npc:Lext/mods/gameserver/model/actor/Npc;
        27: invokevirtual #124                // Method ext/mods/gameserver/model/actor/Npc.isMaster:()Z
        30: ifeq          50
        33: aload_0
        34: getfield      #78                 // Field _npc:Lext/mods/gameserver/model/actor/Npc;
        37: invokevirtual #130                // Method ext/mods/gameserver/model/actor/Npc.getMinions:()Ljava/util/Set;
        40: invokedynamic #134,  0            // InvokeDynamic #0:accept:()Ljava/util/function/Consumer;
        45: invokeinterface #138,  2          // InterfaceMethod java/util/Set.forEach:(Ljava/util/function/Consumer;)V
        50: aload_0
        51: getfield      #78                 // Field _npc:Lext/mods/gameserver/model/actor/Npc;
        54: invokevirtual #144                // Method ext/mods/gameserver/model/actor/Npc.cancelRespawn:()V
        57: aload_0
        58: getfield      #78                 // Field _npc:Lext/mods/gameserver/model/actor/Npc;
        61: invokevirtual #148                // Method ext/mods/gameserver/model/actor/Npc.deleteMe:()V
        64: aload_0
        65: aconst_null
        66: putfield      #78                 // Field _npc:Lext/mods/gameserver/model/actor/Npc;
        69: return
      LineNumberTable:
        line 116: 0
        line 117: 7
        line 119: 8
        line 120: 15
        line 122: 23
        line 123: 33
        line 125: 50
        line 126: 57
        line 127: 64
        line 128: 69
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      70     0  this   Lext/mods/gameserver/model/spawn/Spawn;
      StackMapTable: number_of_entries = 3
        frame_type = 8 /* same */
        frame_type = 14 /* same */
        frame_type = 26 /* same */

  public void onDecay(ext.mods.gameserver.model.actor.Npc);
    descriptor: (Lext/mods/gameserver/model/actor/Npc;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=4, args_size=2
         0: aload_0
         1: invokevirtual #151                // Method getRespawnDelay:()I
         4: ifle          54
         7: aload_0
         8: aload_1
         9: invokevirtual #154                // Method calculateBossRespawnDelayMs:(Lext/mods/gameserver/model/actor/Npc;)J
        12: lstore_2
        13: lload_2
        14: lconst_0
        15: lcmp
        16: ifne          28
        19: aload_0
        20: invokevirtual #158                // Method calculateRespawnDelay:()J
        23: ldc2_w        #162                // long 1000l
        26: lmul
        27: lstore_2
        28: aload_0
        29: getfield      #114                // Field _spawnData:Lext/mods/gameserver/model/spawn/SpawnData;
        32: ifnull        46
        35: aload_0
        36: getfield      #114                // Field _spawnData:Lext/mods/gameserver/model/spawn/SpawnData;
        39: lload_2
        40: invokevirtual #164                // Method ext/mods/gameserver/model/spawn/SpawnData.setRespawn:(J)V
        43: goto          51
        46: aload_1
        47: lload_2
        48: invokevirtual #168                // Method ext/mods/gameserver/model/actor/Npc.scheduleRespawn:(J)V
        51: goto          61
        54: invokestatic  #105                // Method ext/mods/gameserver/data/manager/SpawnManager.getInstance:()Lext/mods/gameserver/data/manager/SpawnManager;
        57: aload_0
        58: invokevirtual #171                // Method ext/mods/gameserver/data/manager/SpawnManager.deleteSpawn:(Lext/mods/gameserver/model/spawn/Spawn;)V
        61: return
      LineNumberTable:
        line 133: 0
        line 135: 7
        line 136: 13
        line 137: 19
        line 139: 28
        line 140: 35
        line 142: 46
        line 143: 51
        line 145: 54
        line 146: 61
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           13      38     2 respawnDelay   J
            0      62     0  this   Lext/mods/gameserver/model/spawn/Spawn;
            0      62     1   npc   Lext/mods/gameserver/model/actor/Npc;
      StackMapTable: number_of_entries = 5
        frame_type = 252 /* append */
          offset_delta = 28
          locals = [ long ]
        frame_type = 17 /* same */
        frame_type = 250 /* chop */
          offset_delta = 4
        frame_type = 2 /* same */
        frame_type = 6 /* same */

  public java.lang.String toString();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #90                 // Method getNpcId:()I
         4: invokedynamic #174,  0            // InvokeDynamic #1:makeConcatWithConstants:(I)Ljava/lang/String;
         9: areturn
      LineNumberTable:
        line 151: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/gameserver/model/spawn/Spawn;

  public java.lang.String getDescription();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #12                 // Field _loc:Lext/mods/gameserver/model/location/SpawnLocation;
         4: invokestatic  #178                // Method java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
         7: invokedynamic #183,  0            // InvokeDynamic #2:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
        12: areturn
      LineNumberTable:
        line 157: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      13     0  this   Lext/mods/gameserver/model/spawn/Spawn;

  public ext.mods.gameserver.model.actor.Npc getNpc();
    descriptor: ()Lext/mods/gameserver/model/actor/Npc;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #78                 // Field _npc:Lext/mods/gameserver/model/actor/Npc;
         4: areturn
      LineNumberTable:
        line 163: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/spawn/Spawn;

  public void updateSpawnData();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #114                // Field _spawnData:Lext/mods/gameserver/model/spawn/SpawnData;
         4: ifnonnull     8
         7: return
         8: aload_0
         9: getfield      #114                // Field _spawnData:Lext/mods/gameserver/model/spawn/SpawnData;
        12: aload_0
        13: getfield      #78                 // Field _npc:Lext/mods/gameserver/model/actor/Npc;
        16: invokevirtual #186                // Method ext/mods/gameserver/model/spawn/SpawnData.setStats:(Lext/mods/gameserver/model/actor/Npc;)V
        19: return
      LineNumberTable:
        line 169: 0
        line 170: 7
        line 172: 8
        line 173: 19
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      20     0  this   Lext/mods/gameserver/model/spawn/Spawn;
      StackMapTable: number_of_entries = 1
        frame_type = 8 /* same */

  public void sendScriptEvent(int, int, int);
    descriptor: (III)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=4, args_size=4
         0: aload_0
         1: getfield      #78                 // Field _npc:Lext/mods/gameserver/model/actor/Npc;
         4: iload_1
         5: iload_2
         6: iload_3
         7: invokevirtual #190                // Method ext/mods/gameserver/model/actor/Npc.sendScriptEvent:(III)V
        10: return
      LineNumberTable:
        line 178: 0
        line 179: 10
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      11     0  this   Lext/mods/gameserver/model/spawn/Spawn;
            0      11     1 eventId   I
            0      11     2  arg1   I
            0      11     3  arg2   I

  public void setLoc(ext.mods.gameserver.model.location.SpawnLocation);
    descriptor: (Lext/mods/gameserver/model/location/SpawnLocation;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=7, locals=3, args_size=2
         0: aload_1
         1: invokevirtual #194                // Method ext/mods/gameserver/model/location/SpawnLocation.getZ:()I
         4: getstatic     #197                // Field ext/mods/Config.NPC_Z_INDEX:I
         7: isub
         8: istore_2
         9: aload_0
        10: getfield      #12                 // Field _loc:Lext/mods/gameserver/model/location/SpawnLocation;
        13: aload_1
        14: invokevirtual #200                // Method ext/mods/gameserver/model/location/SpawnLocation.getX:()I
        17: aload_1
        18: invokevirtual #203                // Method ext/mods/gameserver/model/location/SpawnLocation.getY:()I
        21: invokestatic  #48                 // Method ext/mods/gameserver/geoengine/GeoEngine.getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
        24: aload_1
        25: invokevirtual #200                // Method ext/mods/gameserver/model/location/SpawnLocation.getX:()I
        28: aload_1
        29: invokevirtual #203                // Method ext/mods/gameserver/model/location/SpawnLocation.getY:()I
        32: iload_2
        33: invokevirtual #206                // Method ext/mods/gameserver/geoengine/GeoEngine.getHeight:(III)S
        36: aload_1
        37: invokevirtual #29                 // Method ext/mods/gameserver/model/location/SpawnLocation.getHeading:()I
        40: invokevirtual #210                // Method ext/mods/gameserver/model/location/SpawnLocation.set:(IIII)V
        43: return
      LineNumberTable:
        line 187: 0
        line 188: 9
        line 189: 43
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      44     0  this   Lext/mods/gameserver/model/spawn/Spawn;
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
         6: invokestatic  #48                 // Method ext/mods/gameserver/geoengine/GeoEngine.getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
         9: iload_1
        10: iload_2
        11: iload_3
        12: getstatic     #197                // Field ext/mods/Config.NPC_Z_INDEX:I
        15: isub
        16: invokevirtual #206                // Method ext/mods/gameserver/geoengine/GeoEngine.getHeight:(III)S
        19: iload         4
        21: invokevirtual #210                // Method ext/mods/gameserver/model/location/SpawnLocation.set:(IIII)V
        24: return
      LineNumberTable:
        line 200: 0
        line 201: 24
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      25     0  this   Lext/mods/gameserver/model/spawn/Spawn;
            0      25     1     x   I
            0      25     2     y   I
            0      25     3     z   I
            0      25     4 heading   I

  public int getLocX();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #12                 // Field _loc:Lext/mods/gameserver/model/location/SpawnLocation;
         4: invokevirtual #200                // Method ext/mods/gameserver/model/location/SpawnLocation.getX:()I
         7: ireturn
      LineNumberTable:
        line 208: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/spawn/Spawn;

  public int getLocY();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #12                 // Field _loc:Lext/mods/gameserver/model/location/SpawnLocation;
         4: invokevirtual #203                // Method ext/mods/gameserver/model/location/SpawnLocation.getY:()I
         7: ireturn
      LineNumberTable:
        line 216: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/spawn/Spawn;

  public int getLocZ();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #12                 // Field _loc:Lext/mods/gameserver/model/location/SpawnLocation;
         4: invokevirtual #194                // Method ext/mods/gameserver/model/location/SpawnLocation.getZ:()I
         7: ireturn
      LineNumberTable:
        line 224: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/spawn/Spawn;

  public int getHeading();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #12                 // Field _loc:Lext/mods/gameserver/model/location/SpawnLocation;
         4: invokevirtual #29                 // Method ext/mods/gameserver/model/location/SpawnLocation.getHeading:()I
         7: ireturn
      LineNumberTable:
        line 232: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/spawn/Spawn;
}
SourceFile: "Spawn.java"
BootstrapMethods:
  0: #281 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #273 (Ljava/lang/Object;)V
      #275 REF_invokeVirtual ext/mods/gameserver/model/actor/Npc.deleteMe:()V
      #276 (Lext/mods/gameserver/model/actor/Npc;)V
  1: #288 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #277 Spawn [id=\u0001]
  2: #288 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #279 Location: \u0001
InnerClasses:
  public static final #299= #295 of #297; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
