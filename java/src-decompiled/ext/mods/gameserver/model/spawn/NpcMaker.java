// Bytecode for: ext.mods.gameserver.model.spawn.NpcMaker
// File: ext\mods\gameserver\model\spawn\NpcMaker.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/spawn/NpcMaker.class
  Last modified 9 de jul de 2026; size 15123 bytes
  MD5 checksum 46985afeb831195d04b20650b15a66c9
  Compiled from "NpcMaker.java"
public class ext.mods.gameserver.model.spawn.NpcMaker
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/spawn/NpcMaker
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 12, methods: 22, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Fieldref           #8.#9         // ext/mods/gameserver/model/spawn/NpcMaker._spawnTime:Lext/mods/gameserver/enums/MakerSpawnTime;
    #8 = Class              #10           // ext/mods/gameserver/model/spawn/NpcMaker
    #9 = NameAndType        #11:#12       // _spawnTime:Lext/mods/gameserver/enums/MakerSpawnTime;
   #10 = Utf8               ext/mods/gameserver/model/spawn/NpcMaker
   #11 = Utf8               _spawnTime
   #12 = Utf8               Lext/mods/gameserver/enums/MakerSpawnTime;
   #13 = Fieldref           #8.#14        // ext/mods/gameserver/model/spawn/NpcMaker._spawnTimeParams:[Ljava/lang/String;
   #14 = NameAndType        #15:#16       // _spawnTimeParams:[Ljava/lang/String;
   #15 = Utf8               _spawnTimeParams
   #16 = Utf8               [Ljava/lang/String;
   #17 = Methodref          #18.#19       // java/util/Collections.emptyList:()Ljava/util/List;
   #18 = Class              #20           // java/util/Collections
   #19 = NameAndType        #21:#22       // emptyList:()Ljava/util/List;
   #20 = Utf8               java/util/Collections
   #21 = Utf8               emptyList
   #22 = Utf8               ()Ljava/util/List;
   #23 = Fieldref           #8.#24        // ext/mods/gameserver/model/spawn/NpcMaker._questEvents:Ljava/util/List;
   #24 = NameAndType        #25:#26       // _questEvents:Ljava/util/List;
   #25 = Utf8               _questEvents
   #26 = Utf8               Ljava/util/List;
   #27 = Class              #28           // java/util/concurrent/atomic/AtomicInteger
   #28 = Utf8               java/util/concurrent/atomic/AtomicInteger
   #29 = Methodref          #27.#30       // java/util/concurrent/atomic/AtomicInteger."<init>":(I)V
   #30 = NameAndType        #5:#31        // "<init>":(I)V
   #31 = Utf8               (I)V
   #32 = Fieldref           #8.#33        // ext/mods/gameserver/model/spawn/NpcMaker._spawnedCount:Ljava/util/concurrent/atomic/AtomicInteger;
   #33 = NameAndType        #34:#35       // _spawnedCount:Ljava/util/concurrent/atomic/AtomicInteger;
   #34 = Utf8               _spawnedCount
   #35 = Utf8               Ljava/util/concurrent/atomic/AtomicInteger;
   #36 = String             #37           // name
   #37 = Utf8               name
   #38 = Methodref          #39.#40       // ext/mods/commons/data/StatSet.getString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #39 = Class              #41           // ext/mods/commons/data/StatSet
   #40 = NameAndType        #42:#43       // getString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #41 = Utf8               ext/mods/commons/data/StatSet
   #42 = Utf8               getString
   #43 = Utf8               (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #44 = Fieldref           #8.#45        // ext/mods/gameserver/model/spawn/NpcMaker._name:Ljava/lang/String;
   #45 = NameAndType        #46:#47       // _name:Ljava/lang/String;
   #46 = Utf8               _name
   #47 = Utf8               Ljava/lang/String;
   #48 = String             #49           // t
   #49 = Utf8               t
   #50 = Class              #51           // ext/mods/commons/geometry/Territory
   #51 = Utf8               ext/mods/commons/geometry/Territory
   #52 = Methodref          #39.#53       // ext/mods/commons/data/StatSet.getObject:(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
   #53 = NameAndType        #54:#55       // getObject:(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
   #54 = Utf8               getObject
   #55 = Utf8               (Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
   #56 = Fieldref           #8.#57        // ext/mods/gameserver/model/spawn/NpcMaker._territory:Lext/mods/commons/geometry/Territory;
   #57 = NameAndType        #58:#59       // _territory:Lext/mods/commons/geometry/Territory;
   #58 = Utf8               _territory
   #59 = Utf8               Lext/mods/commons/geometry/Territory;
   #60 = String             #61           // bt
   #61 = Utf8               bt
   #62 = Fieldref           #8.#63        // ext/mods/gameserver/model/spawn/NpcMaker._bannedTerritory:Lext/mods/commons/geometry/Territory;
   #63 = NameAndType        #64:#59       // _bannedTerritory:Lext/mods/commons/geometry/Territory;
   #64 = Utf8               _bannedTerritory
   #65 = Class              #66           // ext/mods/gameserver/model/memo/MakerMemo
   #66 = Utf8               ext/mods/gameserver/model/memo/MakerMemo
   #67 = String             #68           // aiParams
   #68 = Utf8               aiParams
   #69 = Methodref          #39.#70       // ext/mods/commons/data/StatSet.getMap:(Ljava/lang/String;)Ljava/util/Map;
   #70 = NameAndType        #71:#72       // getMap:(Ljava/lang/String;)Ljava/util/Map;
   #71 = Utf8               getMap
   #72 = Utf8               (Ljava/lang/String;)Ljava/util/Map;
   #73 = Methodref          #65.#74       // ext/mods/gameserver/model/memo/MakerMemo."<init>":(Ljava/util/Map;)V
   #74 = NameAndType        #5:#75        // "<init>":(Ljava/util/Map;)V
   #75 = Utf8               (Ljava/util/Map;)V
   #76 = Fieldref           #8.#77        // ext/mods/gameserver/model/spawn/NpcMaker._aiParams:Lext/mods/gameserver/model/memo/MakerMemo;
   #77 = NameAndType        #78:#79       // _aiParams:Lext/mods/gameserver/model/memo/MakerMemo;
   #78 = Utf8               _aiParams
   #79 = Utf8               Lext/mods/gameserver/model/memo/MakerMemo;
   #80 = String             #81           // maximumNpcs
   #81 = Utf8               maximumNpcs
   #82 = Methodref          #39.#83       // ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
   #83 = NameAndType        #84:#85       // getInteger:(Ljava/lang/String;)I
   #84 = Utf8               getInteger
   #85 = Utf8               (Ljava/lang/String;)I
   #86 = Fieldref           #87.#88       // ext/mods/Config.SPAWN_MULTIPLIER:D
   #87 = Class              #89           // ext/mods/Config
   #88 = NameAndType        #90:#91       // SPAWN_MULTIPLIER:D
   #89 = Utf8               ext/mods/Config
   #90 = Utf8               SPAWN_MULTIPLIER
   #91 = Utf8               D
   #92 = Methodref          #93.#94       // java/lang/Math.round:(D)J
   #93 = Class              #95           // java/lang/Math
   #94 = NameAndType        #96:#97       // round:(D)J
   #95 = Utf8               java/lang/Math
   #96 = Utf8               round
   #97 = Utf8               (D)J
   #98 = Fieldref           #8.#99        // ext/mods/gameserver/model/spawn/NpcMaker._maximumNpc:I
   #99 = NameAndType        #100:#101     // _maximumNpc:I
  #100 = Utf8               _maximumNpc
  #101 = Utf8               I
  #102 = String             #103          // event
  #103 = Utf8               event
  #104 = Fieldref           #8.#105       // ext/mods/gameserver/model/spawn/NpcMaker._event:Ljava/lang/String;
  #105 = NameAndType        #106:#47      // _event:Ljava/lang/String;
  #106 = Utf8               _event
  #107 = String             #108          // maker
  #108 = Utf8               maker
  #109 = String             #110          //
  #110 = Utf8
  #111 = Methodref          #112.#113     // java/lang/String.hashCode:()I
  #112 = Class              #114          // java/lang/String
  #113 = NameAndType        #115:#116     // hashCode:()I
  #114 = Utf8               java/lang/String
  #115 = Utf8               hashCode
  #116 = Utf8               ()I
  #117 = String             #118          // Close_Door_maker
  #118 = Utf8               Close_Door_maker
  #119 = Methodref          #112.#120     // java/lang/String.equals:(Ljava/lang/Object;)Z
  #120 = NameAndType        #121:#122     // equals:(Ljava/lang/Object;)Z
  #121 = Utf8               equals
  #122 = Utf8               (Ljava/lang/Object;)Z
  #123 = String             #124          // default_use_db_maker
  #124 = Utf8               default_use_db_maker
  #125 = String             #126          // exclusive_spawn_normal
  #126 = Utf8               exclusive_spawn_normal
  #127 = String             #128          // freya_deacon_keeper_maker
  #128 = Utf8               freya_deacon_keeper_maker
  #129 = String             #130          // ice_fairy_sirr_maker
  #130 = Utf8               ice_fairy_sirr_maker
  #131 = String             #132          // maker_instant_spawn_random
  #132 = Utf8               maker_instant_spawn_random
  #133 = String             #134          // maker_instant_spawn_serial
  #134 = Utf8               maker_instant_spawn_serial
  #135 = String             #136          // maker_instant_spawn
  #136 = Utf8               maker_instant_spawn
  #137 = String             #138          // manage_teleport_dungeon
  #138 = Utf8               manage_teleport_dungeon
  #139 = String             #140          // on_day_night_spawn
  #140 = Utf8               on_day_night_spawn
  #141 = String             #142          // random_spawn
  #142 = Utf8               random_spawn
  #143 = String             #144          // royal_req_next_maker
  #144 = Utf8               royal_req_next_maker
  #145 = String             #146          // royal_rush_maker
  #146 = Utf8               royal_rush_maker
  #147 = String             #148          // royal_spawn_treasurebox
  #148 = Utf8               royal_spawn_treasurebox
  #149 = String             #150          // parent_spawn_all
  #150 = Utf8               parent_spawn_all
  #151 = String             #152          // unique_npc_kill_event
  #152 = Utf8               unique_npc_kill_event
  #153 = String             #154          // no_on_start_maker
  #154 = Utf8               no_on_start_maker
  #155 = String             #156          // velociraptor_maker
  #156 = Utf8               velociraptor_maker
  #157 = String             #158          // rhamphorhynchus_maker
  #158 = Utf8               rhamphorhynchus_maker
  #159 = String             #160          // tyrannosaurus_maker
  #160 = Utf8               tyrannosaurus_maker
  #161 = String             #162          // sailren_maker
  #162 = Utf8               sailren_maker
  #163 = String             #164          // sculpture_garden_maker
  #164 = Utf8               sculpture_garden_maker
  #165 = String             #166          // sculpture_ice_fairy_maker
  #166 = Utf8               sculpture_ice_fairy_maker
  #167 = String             #168          // sailren_dummy_maker
  #168 = Utf8               sailren_dummy_maker
  #169 = String             #170          // statue_of_shilen_maker
  #170 = Utf8               statue_of_shilen_maker
  #171 = String             #172          // benom_maker
  #172 = Utf8               benom_maker
  #173 = String             #174          // default_use_db_maker_for_frintessa
  #174 = Utf8               default_use_db_maker_for_frintessa
  #175 = String             #176          // frintessa_evilate_maker
  #176 = Utf8               frintessa_evilate_maker
  #177 = String             #178          // hall_keeper_wizard_maker
  #178 = Utf8               hall_keeper_wizard_maker
  #179 = String             #180          // hall_keeper_patrol_maker
  #180 = Utf8               hall_keeper_patrol_maker
  #181 = String             #182          // alarm_device1_maker
  #182 = Utf8               alarm_device1_maker
  #183 = String             #184          // alarm_device2_maker
  #184 = Utf8               alarm_device2_maker
  #185 = String             #186          // alarm_device3_maker
  #186 = Utf8               alarm_device3_maker
  #187 = String             #188          // alarm_device4_maker
  #188 = Utf8               alarm_device4_maker
  #189 = String             #190          // hall_keeper_guard_maker
  #190 = Utf8               hall_keeper_guard_maker
  #191 = String             #192          // hall_keeper_captain_maker
  #192 = Utf8               hall_keeper_captain_maker
  #193 = String             #194          // hall_keeper_self_destruction_maker
  #194 = Utf8               hall_keeper_self_destruction_maker
  #195 = String             #196          // undead_bandmaster_maker
  #196 = Utf8               undead_bandmaster_maker
  #197 = String             #198          // undead_band_lance_maker
  #198 = Utf8               undead_band_lance_maker
  #199 = String             #200          // undead_band_leader_maker
  #200 = Utf8               undead_band_leader_maker
  #201 = String             #202          // undead_band_archer_wazird_maker
  #202 = Utf8               undead_band_archer_wazird_maker
  #203 = String             #204          // warrior_passive_weakness_maker
  #204 = Utf8               warrior_passive_weakness_maker
  #205 = String             #206          // hall_timer_bomb_maker
  #206 = Utf8               hall_timer_bomb_maker
  #207 = String             #208          // farm_maker
  #208 = Utf8               farm_maker
  #209 = String             #210          // rainbow_maker
  #210 = Utf8               rainbow_maker
  #211 = String             #212          // event_maker
  #212 = Utf8               event_maker
  #213 = String             #214          // maker_instant_spawn_serial_last
  #214 = Utf8               maker_instant_spawn_serial_last
  #215 = String             #216          // random_spawn_pawn
  #216 = Utf8               random_spawn_pawn
  #217 = String             #218          // random_spawn_treasurebox
  #218 = Utf8               random_spawn_treasurebox
  #219 = String             #220          // exclusive_despawn_normal
  #220 = Utf8               exclusive_despawn_normal
  #221 = String             #222          // exclusive_spawn_use_db
  #222 = Utf8               exclusive_spawn_use_db
  #223 = Class              #224          // ext/mods/gameserver/scripting/script/maker/CloseDoorMaker
  #224 = Utf8               ext/mods/gameserver/scripting/script/maker/CloseDoorMaker
  #225 = Methodref          #223.#226     // ext/mods/gameserver/scripting/script/maker/CloseDoorMaker."<init>":(Ljava/lang/String;)V
  #226 = NameAndType        #5:#227       // "<init>":(Ljava/lang/String;)V
  #227 = Utf8               (Ljava/lang/String;)V
  #228 = Fieldref           #8.#229       // ext/mods/gameserver/model/spawn/NpcMaker._maker:Lext/mods/gameserver/scripting/SpawnMaker;
  #229 = NameAndType        #230:#231     // _maker:Lext/mods/gameserver/scripting/SpawnMaker;
  #230 = Utf8               _maker
  #231 = Utf8               Lext/mods/gameserver/scripting/SpawnMaker;
  #232 = Class              #233          // ext/mods/gameserver/scripting/script/maker/DefaultUseDBMaker
  #233 = Utf8               ext/mods/gameserver/scripting/script/maker/DefaultUseDBMaker
  #234 = Methodref          #232.#226     // ext/mods/gameserver/scripting/script/maker/DefaultUseDBMaker."<init>":(Ljava/lang/String;)V
  #235 = Class              #236          // ext/mods/gameserver/scripting/script/maker/ExclusiveSpawnNormalMaker
  #236 = Utf8               ext/mods/gameserver/scripting/script/maker/ExclusiveSpawnNormalMaker
  #237 = Methodref          #235.#226     // ext/mods/gameserver/scripting/script/maker/ExclusiveSpawnNormalMaker."<init>":(Ljava/lang/String;)V
  #238 = Class              #239          // ext/mods/gameserver/scripting/script/maker/FreyaDeaconKeeperMaker
  #239 = Utf8               ext/mods/gameserver/scripting/script/maker/FreyaDeaconKeeperMaker
  #240 = Methodref          #238.#226     // ext/mods/gameserver/scripting/script/maker/FreyaDeaconKeeperMaker."<init>":(Ljava/lang/String;)V
  #241 = Class              #242          // ext/mods/gameserver/scripting/script/maker/IceFairySirrMaker
  #242 = Utf8               ext/mods/gameserver/scripting/script/maker/IceFairySirrMaker
  #243 = Methodref          #241.#226     // ext/mods/gameserver/scripting/script/maker/IceFairySirrMaker."<init>":(Ljava/lang/String;)V
  #244 = Class              #245          // ext/mods/gameserver/scripting/script/maker/InstantSpawnRandomMaker
  #245 = Utf8               ext/mods/gameserver/scripting/script/maker/InstantSpawnRandomMaker
  #246 = Methodref          #244.#226     // ext/mods/gameserver/scripting/script/maker/InstantSpawnRandomMaker."<init>":(Ljava/lang/String;)V
  #247 = Class              #248          // ext/mods/gameserver/scripting/script/maker/InstantSpawnSerialMaker
  #248 = Utf8               ext/mods/gameserver/scripting/script/maker/InstantSpawnSerialMaker
  #249 = Methodref          #247.#226     // ext/mods/gameserver/scripting/script/maker/InstantSpawnSerialMaker."<init>":(Ljava/lang/String;)V
  #250 = Class              #251          // ext/mods/gameserver/scripting/script/maker/InstantSpawnMaker
  #251 = Utf8               ext/mods/gameserver/scripting/script/maker/InstantSpawnMaker
  #252 = Methodref          #250.#226     // ext/mods/gameserver/scripting/script/maker/InstantSpawnMaker."<init>":(Ljava/lang/String;)V
  #253 = Class              #254          // ext/mods/gameserver/scripting/script/maker/ManageTeleportDungeonMaker
  #254 = Utf8               ext/mods/gameserver/scripting/script/maker/ManageTeleportDungeonMaker
  #255 = Methodref          #253.#226     // ext/mods/gameserver/scripting/script/maker/ManageTeleportDungeonMaker."<init>":(Ljava/lang/String;)V
  #256 = Class              #257          // ext/mods/gameserver/scripting/script/maker/OnDayNightSpawnMaker
  #257 = Utf8               ext/mods/gameserver/scripting/script/maker/OnDayNightSpawnMaker
  #258 = Methodref          #256.#226     // ext/mods/gameserver/scripting/script/maker/OnDayNightSpawnMaker."<init>":(Ljava/lang/String;)V
  #259 = Class              #260          // ext/mods/gameserver/scripting/script/maker/RandomSpawnMaker
  #260 = Utf8               ext/mods/gameserver/scripting/script/maker/RandomSpawnMaker
  #261 = Methodref          #259.#226     // ext/mods/gameserver/scripting/script/maker/RandomSpawnMaker."<init>":(Ljava/lang/String;)V
  #262 = Class              #263          // ext/mods/gameserver/scripting/script/maker/RoyalReqNextMaker
  #263 = Utf8               ext/mods/gameserver/scripting/script/maker/RoyalReqNextMaker
  #264 = Methodref          #262.#226     // ext/mods/gameserver/scripting/script/maker/RoyalReqNextMaker."<init>":(Ljava/lang/String;)V
  #265 = Class              #266          // ext/mods/gameserver/scripting/script/maker/RoyalRushMaker
  #266 = Utf8               ext/mods/gameserver/scripting/script/maker/RoyalRushMaker
  #267 = Methodref          #265.#226     // ext/mods/gameserver/scripting/script/maker/RoyalRushMaker."<init>":(Ljava/lang/String;)V
  #268 = Class              #269          // ext/mods/gameserver/scripting/script/maker/RoyalSpawnTreasureBoxMaker
  #269 = Utf8               ext/mods/gameserver/scripting/script/maker/RoyalSpawnTreasureBoxMaker
  #270 = Methodref          #268.#226     // ext/mods/gameserver/scripting/script/maker/RoyalSpawnTreasureBoxMaker."<init>":(Ljava/lang/String;)V
  #271 = Class              #272          // ext/mods/gameserver/scripting/script/maker/ParentSpawnAllMaker
  #272 = Utf8               ext/mods/gameserver/scripting/script/maker/ParentSpawnAllMaker
  #273 = Methodref          #271.#226     // ext/mods/gameserver/scripting/script/maker/ParentSpawnAllMaker."<init>":(Ljava/lang/String;)V
  #274 = Class              #275          // ext/mods/gameserver/scripting/script/maker/UniqueNpcKillEventMaker
  #275 = Utf8               ext/mods/gameserver/scripting/script/maker/UniqueNpcKillEventMaker
  #276 = Methodref          #274.#226     // ext/mods/gameserver/scripting/script/maker/UniqueNpcKillEventMaker."<init>":(Ljava/lang/String;)V
  #277 = Class              #278          // ext/mods/gameserver/scripting/script/maker/NoOnStartMaker
  #278 = Utf8               ext/mods/gameserver/scripting/script/maker/NoOnStartMaker
  #279 = Methodref          #277.#226     // ext/mods/gameserver/scripting/script/maker/NoOnStartMaker."<init>":(Ljava/lang/String;)V
  #280 = Class              #281          // ext/mods/gameserver/scripting/script/maker/VelociraptorMaker
  #281 = Utf8               ext/mods/gameserver/scripting/script/maker/VelociraptorMaker
  #282 = Methodref          #280.#226     // ext/mods/gameserver/scripting/script/maker/VelociraptorMaker."<init>":(Ljava/lang/String;)V
  #283 = Class              #284          // ext/mods/gameserver/scripting/script/maker/RhamphorhynchusMaker
  #284 = Utf8               ext/mods/gameserver/scripting/script/maker/RhamphorhynchusMaker
  #285 = Methodref          #283.#226     // ext/mods/gameserver/scripting/script/maker/RhamphorhynchusMaker."<init>":(Ljava/lang/String;)V
  #286 = Class              #287          // ext/mods/gameserver/scripting/script/maker/TyrannosaurusMaker
  #287 = Utf8               ext/mods/gameserver/scripting/script/maker/TyrannosaurusMaker
  #288 = Methodref          #286.#226     // ext/mods/gameserver/scripting/script/maker/TyrannosaurusMaker."<init>":(Ljava/lang/String;)V
  #289 = Class              #290          // ext/mods/gameserver/scripting/script/maker/SailrenMaker
  #290 = Utf8               ext/mods/gameserver/scripting/script/maker/SailrenMaker
  #291 = Methodref          #289.#226     // ext/mods/gameserver/scripting/script/maker/SailrenMaker."<init>":(Ljava/lang/String;)V
  #292 = Class              #293          // ext/mods/gameserver/scripting/script/maker/SculptureGardenMaker
  #293 = Utf8               ext/mods/gameserver/scripting/script/maker/SculptureGardenMaker
  #294 = Methodref          #292.#226     // ext/mods/gameserver/scripting/script/maker/SculptureGardenMaker."<init>":(Ljava/lang/String;)V
  #295 = Class              #296          // ext/mods/gameserver/scripting/script/maker/SculptureIceFairyMaker
  #296 = Utf8               ext/mods/gameserver/scripting/script/maker/SculptureIceFairyMaker
  #297 = Methodref          #295.#226     // ext/mods/gameserver/scripting/script/maker/SculptureIceFairyMaker."<init>":(Ljava/lang/String;)V
  #298 = Class              #299          // ext/mods/gameserver/scripting/script/maker/SailrenDummyMaker
  #299 = Utf8               ext/mods/gameserver/scripting/script/maker/SailrenDummyMaker
  #300 = Methodref          #298.#226     // ext/mods/gameserver/scripting/script/maker/SailrenDummyMaker."<init>":(Ljava/lang/String;)V
  #301 = Class              #302          // ext/mods/gameserver/scripting/script/maker/StatueOfShilenMaker
  #302 = Utf8               ext/mods/gameserver/scripting/script/maker/StatueOfShilenMaker
  #303 = Methodref          #301.#226     // ext/mods/gameserver/scripting/script/maker/StatueOfShilenMaker."<init>":(Ljava/lang/String;)V
  #304 = Class              #305          // ext/mods/gameserver/scripting/script/maker/BenomMaker
  #305 = Utf8               ext/mods/gameserver/scripting/script/maker/BenomMaker
  #306 = Methodref          #304.#226     // ext/mods/gameserver/scripting/script/maker/BenomMaker."<init>":(Ljava/lang/String;)V
  #307 = Class              #308          // ext/mods/gameserver/scripting/script/maker/DefaultUseDBMakerForFrintezza
  #308 = Utf8               ext/mods/gameserver/scripting/script/maker/DefaultUseDBMakerForFrintezza
  #309 = Methodref          #307.#226     // ext/mods/gameserver/scripting/script/maker/DefaultUseDBMakerForFrintezza."<init>":(Ljava/lang/String;)V
  #310 = Class              #311          // ext/mods/gameserver/scripting/script/maker/FrintezzaEvilateMaker
  #311 = Utf8               ext/mods/gameserver/scripting/script/maker/FrintezzaEvilateMaker
  #312 = Methodref          #310.#226     // ext/mods/gameserver/scripting/script/maker/FrintezzaEvilateMaker."<init>":(Ljava/lang/String;)V
  #313 = Class              #314          // ext/mods/gameserver/scripting/script/maker/HallKeeperDefaultMaker
  #314 = Utf8               ext/mods/gameserver/scripting/script/maker/HallKeeperDefaultMaker
  #315 = Methodref          #313.#226     // ext/mods/gameserver/scripting/script/maker/HallKeeperDefaultMaker."<init>":(Ljava/lang/String;)V
  #316 = Class              #317          // ext/mods/gameserver/scripting/script/maker/AlarmDeviceMaker1
  #317 = Utf8               ext/mods/gameserver/scripting/script/maker/AlarmDeviceMaker1
  #318 = Methodref          #316.#226     // ext/mods/gameserver/scripting/script/maker/AlarmDeviceMaker1."<init>":(Ljava/lang/String;)V
  #319 = Class              #320          // ext/mods/gameserver/scripting/script/maker/AlarmDeviceMaker2
  #320 = Utf8               ext/mods/gameserver/scripting/script/maker/AlarmDeviceMaker2
  #321 = Methodref          #319.#226     // ext/mods/gameserver/scripting/script/maker/AlarmDeviceMaker2."<init>":(Ljava/lang/String;)V
  #322 = Class              #323          // ext/mods/gameserver/scripting/script/maker/AlarmDeviceMaker3
  #323 = Utf8               ext/mods/gameserver/scripting/script/maker/AlarmDeviceMaker3
  #324 = Methodref          #322.#226     // ext/mods/gameserver/scripting/script/maker/AlarmDeviceMaker3."<init>":(Ljava/lang/String;)V
  #325 = Class              #326          // ext/mods/gameserver/scripting/script/maker/AlarmDeviceMaker4
  #326 = Utf8               ext/mods/gameserver/scripting/script/maker/AlarmDeviceMaker4
  #327 = Methodref          #325.#226     // ext/mods/gameserver/scripting/script/maker/AlarmDeviceMaker4."<init>":(Ljava/lang/String;)V
  #328 = Class              #329          // ext/mods/gameserver/scripting/script/maker/UndeadBandmasterMaker
  #329 = Utf8               ext/mods/gameserver/scripting/script/maker/UndeadBandmasterMaker
  #330 = Methodref          #328.#226     // ext/mods/gameserver/scripting/script/maker/UndeadBandmasterMaker."<init>":(Ljava/lang/String;)V
  #331 = Class              #332          // ext/mods/gameserver/scripting/script/maker/OpenDoorMaker
  #332 = Utf8               ext/mods/gameserver/scripting/script/maker/OpenDoorMaker
  #333 = Methodref          #331.#226     // ext/mods/gameserver/scripting/script/maker/OpenDoorMaker."<init>":(Ljava/lang/String;)V
  #334 = Class              #335          // ext/mods/gameserver/scripting/script/maker/WarriorPassiveWeaknessMaker
  #335 = Utf8               ext/mods/gameserver/scripting/script/maker/WarriorPassiveWeaknessMaker
  #336 = Methodref          #334.#226     // ext/mods/gameserver/scripting/script/maker/WarriorPassiveWeaknessMaker."<init>":(Ljava/lang/String;)V
  #337 = Class              #338          // ext/mods/gameserver/scripting/script/maker/FarmMaker
  #338 = Utf8               ext/mods/gameserver/scripting/script/maker/FarmMaker
  #339 = Methodref          #337.#226     // ext/mods/gameserver/scripting/script/maker/FarmMaker."<init>":(Ljava/lang/String;)V
  #340 = Class              #341          // ext/mods/gameserver/scripting/script/maker/RainbowMaker
  #341 = Utf8               ext/mods/gameserver/scripting/script/maker/RainbowMaker
  #342 = Methodref          #340.#226     // ext/mods/gameserver/scripting/script/maker/RainbowMaker."<init>":(Ljava/lang/String;)V
  #343 = Class              #344          // ext/mods/gameserver/scripting/script/maker/EventMaker
  #344 = Utf8               ext/mods/gameserver/scripting/script/maker/EventMaker
  #345 = Methodref          #343.#226     // ext/mods/gameserver/scripting/script/maker/EventMaker."<init>":(Ljava/lang/String;)V
  #346 = Class              #347          // ext/mods/gameserver/scripting/script/maker/InstantSpawnSerialLastMaker
  #347 = Utf8               ext/mods/gameserver/scripting/script/maker/InstantSpawnSerialLastMaker
  #348 = Methodref          #346.#226     // ext/mods/gameserver/scripting/script/maker/InstantSpawnSerialLastMaker."<init>":(Ljava/lang/String;)V
  #349 = Class              #350          // ext/mods/gameserver/scripting/script/maker/RandomSpawnPawnMaker
  #350 = Utf8               ext/mods/gameserver/scripting/script/maker/RandomSpawnPawnMaker
  #351 = Methodref          #349.#226     // ext/mods/gameserver/scripting/script/maker/RandomSpawnPawnMaker."<init>":(Ljava/lang/String;)V
  #352 = Class              #353          // ext/mods/gameserver/scripting/script/maker/RandomSpawnTreasurebox
  #353 = Utf8               ext/mods/gameserver/scripting/script/maker/RandomSpawnTreasurebox
  #354 = Methodref          #352.#226     // ext/mods/gameserver/scripting/script/maker/RandomSpawnTreasurebox."<init>":(Ljava/lang/String;)V
  #355 = Class              #356          // ext/mods/gameserver/scripting/script/maker/ExclusiveDespawnNormalMaker
  #356 = Utf8               ext/mods/gameserver/scripting/script/maker/ExclusiveDespawnNormalMaker
  #357 = Methodref          #355.#226     // ext/mods/gameserver/scripting/script/maker/ExclusiveDespawnNormalMaker."<init>":(Ljava/lang/String;)V
  #358 = Class              #359          // ext/mods/gameserver/scripting/script/maker/DefaultMaker
  #359 = Utf8               ext/mods/gameserver/scripting/script/maker/DefaultMaker
  #360 = String             #361          // default_maker
  #361 = Utf8               default_maker
  #362 = Methodref          #358.#226     // ext/mods/gameserver/scripting/script/maker/DefaultMaker."<init>":(Ljava/lang/String;)V
  #363 = String             #364          // spawnTime
  #364 = Utf8               spawnTime
  #365 = String             #366          // [()]
  #366 = Utf8               [()]
  #367 = Methodref          #112.#368     // java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
  #368 = NameAndType        #369:#370     // split:(Ljava/lang/String;)[Ljava/lang/String;
  #369 = Utf8               split
  #370 = Utf8               (Ljava/lang/String;)[Ljava/lang/String;
  #371 = Methodref          #372.#373     // ext/mods/gameserver/enums/MakerSpawnTime.getEnumByName:(Ljava/lang/String;)Lext/mods/gameserver/enums/MakerSpawnTime;
  #372 = Class              #374          // ext/mods/gameserver/enums/MakerSpawnTime
  #373 = NameAndType        #375:#376     // getEnumByName:(Ljava/lang/String;)Lext/mods/gameserver/enums/MakerSpawnTime;
  #374 = Utf8               ext/mods/gameserver/enums/MakerSpawnTime
  #375 = Utf8               getEnumByName
  #376 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/enums/MakerSpawnTime;
  #377 = String             #378          // ;
  #378 = Utf8               ;
  #379 = Fieldref           #8.#380       // ext/mods/gameserver/model/spawn/NpcMaker._spawns:Ljava/util/List;
  #380 = NameAndType        #381:#26      // _spawns:Ljava/util/List;
  #381 = Utf8               _spawns
  #382 = Methodref          #27.#383      // java/util/concurrent/atomic/AtomicInteger.set:(I)V
  #383 = NameAndType        #384:#31      // set:(I)V
  #384 = Utf8               set
  #385 = String             #386          // EventName
  #386 = Utf8               EventName
  #387 = Methodref          #65.#388      // ext/mods/gameserver/model/memo/MakerMemo.get:(Ljava/lang/Object;)Ljava/lang/Object;
  #388 = NameAndType        #389:#390     // get:(Ljava/lang/Object;)Ljava/lang/Object;
  #389 = Utf8               get
  #390 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
  #391 = String             #392          // on_start_spawn
  #392 = Utf8               on_start_spawn
  #393 = Methodref          #65.#83       // ext/mods/gameserver/model/memo/MakerMemo.getInteger:(Ljava/lang/String;)I
  #394 = Methodref          #27.#395      // java/util/concurrent/atomic/AtomicInteger.get:()I
  #395 = NameAndType        #389:#116     // get:()I
  #396 = Methodref          #397.#398     // ext/mods/gameserver/model/spawn/MultiSpawn.increaseSpawnedCount:(I)Z
  #397 = Class              #399          // ext/mods/gameserver/model/spawn/MultiSpawn
  #398 = NameAndType        #400:#401     // increaseSpawnedCount:(I)Z
  #399 = Utf8               ext/mods/gameserver/model/spawn/MultiSpawn
  #400 = Utf8               increaseSpawnedCount
  #401 = Utf8               (I)Z
  #402 = InterfaceMethodref #403.#404     // java/util/List.isEmpty:()Z
  #403 = Class              #405          // java/util/List
  #404 = NameAndType        #406:#407     // isEmpty:()Z
  #405 = Utf8               java/util/List
  #406 = Utf8               isEmpty
  #407 = Utf8               ()Z
  #408 = Class              #409          // java/util/ArrayList
  #409 = Utf8               java/util/ArrayList
  #410 = Methodref          #408.#30      // java/util/ArrayList."<init>":(I)V
  #411 = InterfaceMethodref #403.#412     // java/util/List.remove:(Ljava/lang/Object;)Z
  #412 = NameAndType        #413:#122     // remove:(Ljava/lang/Object;)Z
  #413 = Utf8               remove
  #414 = InterfaceMethodref #403.#415     // java/util/List.add:(Ljava/lang/Object;)Z
  #415 = NameAndType        #416:#122     // add:(Ljava/lang/Object;)Z
  #416 = Utf8               add
  #417 = Methodref          #418.#419     // ext/mods/gameserver/scripting/SpawnMaker.onStart:(Lext/mods/gameserver/model/spawn/NpcMaker;)V
  #418 = Class              #420          // ext/mods/gameserver/scripting/SpawnMaker
  #419 = NameAndType        #421:#422     // onStart:(Lext/mods/gameserver/model/spawn/NpcMaker;)V
  #420 = Utf8               ext/mods/gameserver/scripting/SpawnMaker
  #421 = Utf8               onStart
  #422 = Utf8               (Lext/mods/gameserver/model/spawn/NpcMaker;)V
  #423 = Methodref          #424.#425     // ext/mods/gameserver/model/actor/Npc.getSpawn:()Lext/mods/gameserver/model/spawn/ASpawn;
  #424 = Class              #426          // ext/mods/gameserver/model/actor/Npc
  #425 = NameAndType        #427:#428     // getSpawn:()Lext/mods/gameserver/model/spawn/ASpawn;
  #426 = Utf8               ext/mods/gameserver/model/actor/Npc
  #427 = Utf8               getSpawn
  #428 = Utf8               ()Lext/mods/gameserver/model/spawn/ASpawn;
  #429 = Methodref          #418.#430     // ext/mods/gameserver/scripting/SpawnMaker.onNpcCreated:(Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/spawn/MultiSpawn;Lext/mods/gameserver/model/spawn/NpcMaker;)V
  #430 = NameAndType        #431:#432     // onNpcCreated:(Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/spawn/MultiSpawn;Lext/mods/gameserver/model/spawn/NpcMaker;)V
  #431 = Utf8               onNpcCreated
  #432 = Utf8               (Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/spawn/MultiSpawn;Lext/mods/gameserver/model/spawn/NpcMaker;)V
  #433 = Methodref          #27.#434      // java/util/concurrent/atomic/AtomicInteger.decrementAndGet:()I
  #434 = NameAndType        #435:#116     // decrementAndGet:()I
  #435 = Utf8               decrementAndGet
  #436 = InterfaceMethodref #403.#437     // java/util/List.iterator:()Ljava/util/Iterator;
  #437 = NameAndType        #438:#439     // iterator:()Ljava/util/Iterator;
  #438 = Utf8               iterator
  #439 = Utf8               ()Ljava/util/Iterator;
  #440 = InterfaceMethodref #441.#442     // java/util/Iterator.hasNext:()Z
  #441 = Class              #443          // java/util/Iterator
  #442 = NameAndType        #444:#407     // hasNext:()Z
  #443 = Utf8               java/util/Iterator
  #444 = Utf8               hasNext
  #445 = InterfaceMethodref #441.#446     // java/util/Iterator.next:()Ljava/lang/Object;
  #446 = NameAndType        #447:#448     // next:()Ljava/lang/Object;
  #447 = Utf8               next
  #448 = Utf8               ()Ljava/lang/Object;
  #449 = Class              #450          // ext/mods/gameserver/scripting/Quest
  #450 = Utf8               ext/mods/gameserver/scripting/Quest
  #451 = Methodref          #449.#452     // ext/mods/gameserver/scripting/Quest.onMakerNpcsKilled:(Lext/mods/gameserver/model/spawn/NpcMaker;Lext/mods/gameserver/model/actor/Npc;)V
  #452 = NameAndType        #453:#454     // onMakerNpcsKilled:(Lext/mods/gameserver/model/spawn/NpcMaker;Lext/mods/gameserver/model/actor/Npc;)V
  #453 = Utf8               onMakerNpcsKilled
  #454 = Utf8               (Lext/mods/gameserver/model/spawn/NpcMaker;Lext/mods/gameserver/model/actor/Npc;)V
  #455 = Methodref          #397.#456     // ext/mods/gameserver/model/spawn/MultiSpawn.getDecayedNpcs:()Ljava/util/Set;
  #456 = NameAndType        #457:#458     // getDecayedNpcs:()Ljava/util/Set;
  #457 = Utf8               getDecayedNpcs
  #458 = Utf8               ()Ljava/util/Set;
  #459 = InterfaceMethodref #460.#437     // java/util/Set.iterator:()Ljava/util/Iterator;
  #460 = Class              #461          // java/util/Set
  #461 = Utf8               java/util/Set
  #462 = Methodref          #424.#463     // ext/mods/gameserver/model/actor/Npc.getObjectId:()I
  #463 = NameAndType        #464:#116     // getObjectId:()I
  #464 = Utf8               getObjectId
  #465 = Methodref          #418.#466     // ext/mods/gameserver/scripting/SpawnMaker.onNpcDeleted:(Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/spawn/MultiSpawn;Lext/mods/gameserver/model/spawn/NpcMaker;)V
  #466 = NameAndType        #467:#432     // onNpcDeleted:(Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/spawn/MultiSpawn;Lext/mods/gameserver/model/spawn/NpcMaker;)V
  #467 = Utf8               onNpcDeleted
  #468 = InvokeDynamic      #0:#469       // #0:accept:()Ljava/util/function/Consumer;
  #469 = NameAndType        #470:#471     // accept:()Ljava/util/function/Consumer;
  #470 = Utf8               accept
  #471 = Utf8               ()Ljava/util/function/Consumer;
  #472 = InterfaceMethodref #403.#473     // java/util/List.forEach:(Ljava/util/function/Consumer;)V
  #473 = NameAndType        #474:#475     // forEach:(Ljava/util/function/Consumer;)V
  #474 = Utf8               forEach
  #475 = Utf8               (Ljava/util/function/Consumer;)V
  #476 = InvokeDynamic      #1:#469       // #1:accept:()Ljava/util/function/Consumer;
  #477 = Utf8               Signature
  #478 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/spawn/MultiSpawn;>;
  #479 = Utf8               Ljava/util/List<Lext/mods/gameserver/scripting/Quest;>;
  #480 = Utf8               (Lext/mods/commons/data/StatSet;)V
  #481 = Utf8               Code
  #482 = Utf8               LineNumberTable
  #483 = Utf8               LocalVariableTable
  #484 = Utf8               this
  #485 = Utf8               Lext/mods/gameserver/model/spawn/NpcMaker;
  #486 = Utf8               Lext/mods/commons/data/StatSet;
  #487 = Utf8               makerSpawnTime
  #488 = Utf8               StackMapTable
  #489 = Utf8               getName
  #490 = Utf8               ()Ljava/lang/String;
  #491 = Utf8               getTerritory
  #492 = Utf8               ()Lext/mods/commons/geometry/Territory;
  #493 = Utf8               getBannedTerritory
  #494 = Utf8               getMaker
  #495 = Utf8               ()Lext/mods/gameserver/scripting/SpawnMaker;
  #496 = Utf8               getMakerSpawnTime
  #497 = Utf8               ()Lext/mods/gameserver/enums/MakerSpawnTime;
  #498 = Utf8               getMakerSpawnTimeParams
  #499 = Utf8               ()[Ljava/lang/String;
  #500 = Utf8               getMakerMemo
  #501 = Utf8               ()Lext/mods/gameserver/model/memo/MakerMemo;
  #502 = Utf8               getMaximumNpc
  #503 = Utf8               getEvent
  #504 = Utf8               isOnStart
  #505 = Utf8               Z
  #506 = Utf8               setSpawns
  #507 = Utf8               (Ljava/util/List;)V
  #508 = Utf8               spawns
  #509 = Utf8               LocalVariableTypeTable
  #510 = Utf8               (Ljava/util/List<Lext/mods/gameserver/model/spawn/MultiSpawn;>;)V
  #511 = Utf8               getSpawns
  #512 = Utf8               ()Ljava/util/List<Lext/mods/gameserver/model/spawn/MultiSpawn;>;
  #513 = Utf8               getSpawnedCount
  #514 = Utf8               setSpawnedCount
  #515 = Utf8               count
  #516 = Utf8               (Lext/mods/gameserver/model/spawn/MultiSpawn;I)Z
  #517 = Utf8               spawn
  #518 = Utf8               Lext/mods/gameserver/model/spawn/MultiSpawn;
  #519 = Utf8               newSpawnedCount
  #520 = Utf8               getQuestEvents
  #521 = Utf8               ()Ljava/util/List<Lext/mods/gameserver/scripting/Quest;>;
  #522 = Utf8               addQuestEvent
  #523 = Utf8               (Lext/mods/gameserver/scripting/Quest;)V
  #524 = Utf8               quest
  #525 = Utf8               Lext/mods/gameserver/scripting/Quest;
  #526 = Utf8               spawnAll
  #527 = Utf8               onSpawn
  #528 = Utf8               (Lext/mods/gameserver/model/actor/Npc;)V
  #529 = Utf8               npc
  #530 = Utf8               Lext/mods/gameserver/model/actor/Npc;
  #531 = Utf8               onDecay
  #532 = Utf8               msNpc
  #533 = Utf8               ms
  #534 = Utf8               shouldCallEvent
  #535 = Utf8               deleteAll
  #536 = Utf8               npcs
  #537 = Utf8               SourceFile
  #538 = Utf8               NpcMaker.java
  #539 = Utf8               BootstrapMethods
  #540 = MethodType         #541          //  (Ljava/lang/Object;)V
  #541 = Utf8               (Ljava/lang/Object;)V
  #542 = MethodHandle       5:#543        // REF_invokeVirtual ext/mods/gameserver/model/spawn/MultiSpawn.cancelScheduledSpawns:()V
  #543 = Methodref          #397.#544     // ext/mods/gameserver/model/spawn/MultiSpawn.cancelScheduledSpawns:()V
  #544 = NameAndType        #545:#6       // cancelScheduledSpawns:()V
  #545 = Utf8               cancelScheduledSpawns
  #546 = MethodType         #547          //  (Lext/mods/gameserver/model/spawn/MultiSpawn;)V
  #547 = Utf8               (Lext/mods/gameserver/model/spawn/MultiSpawn;)V
  #548 = MethodHandle       5:#549        // REF_invokeVirtual ext/mods/gameserver/model/spawn/MultiSpawn.doDelete:()V
  #549 = Methodref          #397.#550     // ext/mods/gameserver/model/spawn/MultiSpawn.doDelete:()V
  #550 = NameAndType        #551:#6       // doDelete:()V
  #551 = Utf8               doDelete
  #552 = MethodHandle       6:#553        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #553 = Methodref          #554.#555     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #554 = Class              #556          // java/lang/invoke/LambdaMetafactory
  #555 = NameAndType        #557:#558     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #556 = Utf8               java/lang/invoke/LambdaMetafactory
  #557 = Utf8               metafactory
  #558 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #559 = Utf8               InnerClasses
  #560 = Class              #561          // java/lang/invoke/MethodHandles$Lookup
  #561 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #562 = Class              #563          // java/lang/invoke/MethodHandles
  #563 = Utf8               java/lang/invoke/MethodHandles
  #564 = Utf8               Lookup
{
  public ext.mods.gameserver.model.spawn.NpcMaker(ext.mods.commons.data.StatSet);
    descriptor: (Lext/mods/commons/data/StatSet;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=4, args_size=2
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: aconst_null
         6: putfield      #7                  // Field _spawnTime:Lext/mods/gameserver/enums/MakerSpawnTime;
         9: aload_0
        10: aconst_null
        11: putfield      #13                 // Field _spawnTimeParams:[Ljava/lang/String;
        14: aload_0
        15: invokestatic  #17                 // Method java/util/Collections.emptyList:()Ljava/util/List;
        18: putfield      #23                 // Field _questEvents:Ljava/util/List;
        21: aload_0
        22: new           #27                 // class java/util/concurrent/atomic/AtomicInteger
        25: dup
        26: iconst_0
        27: invokespecial #29                 // Method java/util/concurrent/atomic/AtomicInteger."<init>":(I)V
        30: putfield      #32                 // Field _spawnedCount:Ljava/util/concurrent/atomic/AtomicInteger;
        33: aload_0
        34: aload_1
        35: ldc           #36                 // String name
        37: aconst_null
        38: invokevirtual #38                 // Method ext/mods/commons/data/StatSet.getString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        41: putfield      #44                 // Field _name:Ljava/lang/String;
        44: aload_0
        45: aload_1
        46: ldc           #48                 // String t
        48: ldc           #50                 // class ext/mods/commons/geometry/Territory
        50: invokevirtual #52                 // Method ext/mods/commons/data/StatSet.getObject:(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
        53: checkcast     #50                 // class ext/mods/commons/geometry/Territory
        56: putfield      #56                 // Field _territory:Lext/mods/commons/geometry/Territory;
        59: aload_0
        60: aload_1
        61: ldc           #60                 // String bt
        63: ldc           #50                 // class ext/mods/commons/geometry/Territory
        65: invokevirtual #52                 // Method ext/mods/commons/data/StatSet.getObject:(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
        68: checkcast     #50                 // class ext/mods/commons/geometry/Territory
        71: putfield      #62                 // Field _bannedTerritory:Lext/mods/commons/geometry/Territory;
        74: aload_0
        75: new           #65                 // class ext/mods/gameserver/model/memo/MakerMemo
        78: dup
        79: aload_1
        80: ldc           #67                 // String aiParams
        82: invokevirtual #69                 // Method ext/mods/commons/data/StatSet.getMap:(Ljava/lang/String;)Ljava/util/Map;
        85: invokespecial #73                 // Method ext/mods/gameserver/model/memo/MakerMemo."<init>":(Ljava/util/Map;)V
        88: putfield      #76                 // Field _aiParams:Lext/mods/gameserver/model/memo/MakerMemo;
        91: aload_0
        92: aload_1
        93: ldc           #80                 // String maximumNpcs
        95: invokevirtual #82                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
        98: i2d
        99: getstatic     #86                 // Field ext/mods/Config.SPAWN_MULTIPLIER:D
       102: dmul
       103: invokestatic  #92                 // Method java/lang/Math.round:(D)J
       106: l2i
       107: putfield      #98                 // Field _maximumNpc:I
       110: aload_0
       111: aload_1
       112: ldc           #102                // String event
       114: aconst_null
       115: invokevirtual #38                 // Method ext/mods/commons/data/StatSet.getString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
       118: putfield      #104                // Field _event:Ljava/lang/String;
       121: aload_1
       122: ldc           #107                // String maker
       124: ldc           #109                // String
       126: invokevirtual #38                 // Method ext/mods/commons/data/StatSet.getString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
       129: astore_2
       130: iconst_m1
       131: istore_3
       132: aload_2
       133: invokevirtual #111                // Method java/lang/String.hashCode:()I
       136: lookupswitch  { // 51

             -2024249839: 685

             -1882066551: 1165

             -1787014449: 850

             -1725226056: 985

             -1493857735: 570

             -1286552587: 1045

             -1284587230: 1075

             -1217796679: 612

             -1159648763: 790

             -1101401766: 556

             -1088449822: 655

             -1050010232: 760

              -948293952: 745

              -889424292: 865

              -832133692: 880

              -613641180: 1240

              -489931597: 805

              -468538717: 955

              -406113385: 970

              -364017304: 820

              -325320392: 1120

              -270304960: 670

              -212050689: 700

              -204967173: 1195

              -179569467: 775

               -61678212: 1270

               -52964842: 1135

               -23193997: 910

                60135433: 835

               238570019: 940

               246796844: 584

               345903666: 1000

               381158646: 598

               414664798: 1105

               443724383: 1225

               450494331: 1300

               490343083: 1090

               908661883: 1210

              1076566563: 1060

              1233407347: 1015

              1323404334: 925

              1508158656: 626

              1540605425: 640

              1589848301: 1285

              1689016356: 1150

              1716923733: 730

              1769687096: 895

              1806627441: 715

              2016661735: 1180

              2089813960: 1255

              2120911028: 1030
                 default: 1312
            }
       556: aload_2
       557: ldc           #117                // String Close_Door_maker
       559: invokevirtual #119                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       562: ifeq          1312
       565: iconst_0
       566: istore_3
       567: goto          1312
       570: aload_2
       571: ldc           #123                // String default_use_db_maker
       573: invokevirtual #119                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       576: ifeq          1312
       579: iconst_1
       580: istore_3
       581: goto          1312
       584: aload_2
       585: ldc           #125                // String exclusive_spawn_normal
       587: invokevirtual #119                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       590: ifeq          1312
       593: iconst_2
       594: istore_3
       595: goto          1312
       598: aload_2
       599: ldc           #127                // String freya_deacon_keeper_maker
       601: invokevirtual #119                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       604: ifeq          1312
       607: iconst_3
       608: istore_3
       609: goto          1312
       612: aload_2
       613: ldc           #129                // String ice_fairy_sirr_maker
       615: invokevirtual #119                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       618: ifeq          1312
       621: iconst_4
       622: istore_3
       623: goto          1312
       626: aload_2
       627: ldc           #131                // String maker_instant_spawn_random
       629: invokevirtual #119                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       632: ifeq          1312
       635: iconst_5
       636: istore_3
       637: goto          1312
       640: aload_2
       641: ldc           #133                // String maker_instant_spawn_serial
       643: invokevirtual #119                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       646: ifeq          1312
       649: bipush        6
       651: istore_3
       652: goto          1312
       655: aload_2
       656: ldc           #135                // String maker_instant_spawn
       658: invokevirtual #119                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       661: ifeq          1312
       664: bipush        7
       666: istore_3
       667: goto          1312
       670: aload_2
       671: ldc           #137                // String manage_teleport_dungeon
       673: invokevirtual #119                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       676: ifeq          1312
       679: bipush        8
       681: istore_3
       682: goto          1312
       685: aload_2
       686: ldc           #139                // String on_day_night_spawn
       688: invokevirtual #119                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       691: ifeq          1312
       694: bipush        9
       696: istore_3
       697: goto          1312
       700: aload_2
       701: ldc           #141                // String random_spawn
       703: invokevirtual #119                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       706: ifeq          1312
       709: bipush        10
       711: istore_3
       712: goto          1312
       715: aload_2
       716: ldc           #143                // String royal_req_next_maker
       718: invokevirtual #119                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       721: ifeq          1312
       724: bipush        11
       726: istore_3
       727: goto          1312
       730: aload_2
       731: ldc           #145                // String royal_rush_maker
       733: invokevirtual #119                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       736: ifeq          1312
       739: bipush        12
       741: istore_3
       742: goto          1312
       745: aload_2
       746: ldc           #147                // String royal_spawn_treasurebox
       748: invokevirtual #119                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       751: ifeq          1312
       754: bipush        13
       756: istore_3
       757: goto          1312
       760: aload_2
       761: ldc           #149                // String parent_spawn_all
       763: invokevirtual #119                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       766: ifeq          1312
       769: bipush        14
       771: istore_3
       772: goto          1312
       775: aload_2
       776: ldc           #151                // String unique_npc_kill_event
       778: invokevirtual #119                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       781: ifeq          1312
       784: bipush        15
       786: istore_3
       787: goto          1312
       790: aload_2
       791: ldc           #153                // String no_on_start_maker
       793: invokevirtual #119                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       796: ifeq          1312
       799: bipush        16
       801: istore_3
       802: goto          1312
       805: aload_2
       806: ldc           #155                // String velociraptor_maker
       808: invokevirtual #119                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       811: ifeq          1312
       814: bipush        17
       816: istore_3
       817: goto          1312
       820: aload_2
       821: ldc           #157                // String rhamphorhynchus_maker
       823: invokevirtual #119                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       826: ifeq          1312
       829: bipush        18
       831: istore_3
       832: goto          1312
       835: aload_2
       836: ldc           #159                // String tyrannosaurus_maker
       838: invokevirtual #119                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       841: ifeq          1312
       844: bipush        19
       846: istore_3
       847: goto          1312
       850: aload_2
       851: ldc           #161                // String sailren_maker
       853: invokevirtual #119                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       856: ifeq          1312
       859: bipush        20
       861: istore_3
       862: goto          1312
       865: aload_2
       866: ldc           #163                // String sculpture_garden_maker
       868: invokevirtual #119                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       871: ifeq          1312
       874: bipush        21
       876: istore_3
       877: goto          1312
       880: aload_2
       881: ldc           #165                // String sculpture_ice_fairy_maker
       883: invokevirtual #119                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       886: ifeq          1312
       889: bipush        22
       891: istore_3
       892: goto          1312
       895: aload_2
       896: ldc           #167                // String sailren_dummy_maker
       898: invokevirtual #119                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       901: ifeq          1312
       904: bipush        23
       906: istore_3
       907: goto          1312
       910: aload_2
       911: ldc           #169                // String statue_of_shilen_maker
       913: invokevirtual #119                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       916: ifeq          1312
       919: bipush        24
       921: istore_3
       922: goto          1312
       925: aload_2
       926: ldc           #171                // String benom_maker
       928: invokevirtual #119                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       931: ifeq          1312
       934: bipush        25
       936: istore_3
       937: goto          1312
       940: aload_2
       941: ldc           #173                // String default_use_db_maker_for_frintessa
       943: invokevirtual #119                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       946: ifeq          1312
       949: bipush        26
       951: istore_3
       952: goto          1312
       955: aload_2
       956: ldc           #175                // String frintessa_evilate_maker
       958: invokevirtual #119                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       961: ifeq          1312
       964: bipush        27
       966: istore_3
       967: goto          1312
       970: aload_2
       971: ldc           #177                // String hall_keeper_wizard_maker
       973: invokevirtual #119                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       976: ifeq          1312
       979: bipush        28
       981: istore_3
       982: goto          1312
       985: aload_2
       986: ldc           #179                // String hall_keeper_patrol_maker
       988: invokevirtual #119                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       991: ifeq          1312
       994: bipush        29
       996: istore_3
       997: goto          1312
      1000: aload_2
      1001: ldc           #181                // String alarm_device1_maker
      1003: invokevirtual #119                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
      1006: ifeq          1312
      1009: bipush        30
      1011: istore_3
      1012: goto          1312
      1015: aload_2
      1016: ldc           #183                // String alarm_device2_maker
      1018: invokevirtual #119                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
      1021: ifeq          1312
      1024: bipush        31
      1026: istore_3
      1027: goto          1312
      1030: aload_2
      1031: ldc           #185                // String alarm_device3_maker
      1033: invokevirtual #119                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
      1036: ifeq          1312
      1039: bipush        32
      1041: istore_3
      1042: goto          1312
      1045: aload_2
      1046: ldc           #187                // String alarm_device4_maker
      1048: invokevirtual #119                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
      1051: ifeq          1312
      1054: bipush        33
      1056: istore_3
      1057: goto          1312
      1060: aload_2
      1061: ldc           #189                // String hall_keeper_guard_maker
      1063: invokevirtual #119                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
      1066: ifeq          1312
      1069: bipush        34
      1071: istore_3
      1072: goto          1312
      1075: aload_2
      1076: ldc           #191                // String hall_keeper_captain_maker
      1078: invokevirtual #119                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
      1081: ifeq          1312
      1084: bipush        35
      1086: istore_3
      1087: goto          1312
      1090: aload_2
      1091: ldc           #193                // String hall_keeper_self_destruction_maker
      1093: invokevirtual #119                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
      1096: ifeq          1312
      1099: bipush        36
      1101: istore_3
      1102: goto          1312
      1105: aload_2
      1106: ldc           #195                // String undead_bandmaster_maker
      1108: invokevirtual #119                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
      1111: ifeq          1312
      1114: bipush        37
      1116: istore_3
      1117: goto          1312
      1120: aload_2
      1121: ldc           #197                // String undead_band_lance_maker
      1123: invokevirtual #119                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
      1126: ifeq          1312
      1129: bipush        38
      1131: istore_3
      1132: goto          1312
      1135: aload_2
      1136: ldc           #199                // String undead_band_leader_maker
      1138: invokevirtual #119                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
      1141: ifeq          1312
      1144: bipush        39
      1146: istore_3
      1147: goto          1312
      1150: aload_2
      1151: ldc           #201                // String undead_band_archer_wazird_maker
      1153: invokevirtual #119                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
      1156: ifeq          1312
      1159: bipush        40
      1161: istore_3
      1162: goto          1312
      1165: aload_2
      1166: ldc           #203                // String warrior_passive_weakness_maker
      1168: invokevirtual #119                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
      1171: ifeq          1312
      1174: bipush        41
      1176: istore_3
      1177: goto          1312
      1180: aload_2
      1181: ldc           #205                // String hall_timer_bomb_maker
      1183: invokevirtual #119                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
      1186: ifeq          1312
      1189: bipush        42
      1191: istore_3
      1192: goto          1312
      1195: aload_2
      1196: ldc           #207                // String farm_maker
      1198: invokevirtual #119                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
      1201: ifeq          1312
      1204: bipush        43
      1206: istore_3
      1207: goto          1312
      1210: aload_2
      1211: ldc           #209                // String rainbow_maker
      1213: invokevirtual #119                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
      1216: ifeq          1312
      1219: bipush        44
      1221: istore_3
      1222: goto          1312
      1225: aload_2
      1226: ldc           #211                // String event_maker
      1228: invokevirtual #119                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
      1231: ifeq          1312
      1234: bipush        45
      1236: istore_3
      1237: goto          1312
      1240: aload_2
      1241: ldc           #213                // String maker_instant_spawn_serial_last
      1243: invokevirtual #119                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
      1246: ifeq          1312
      1249: bipush        46
      1251: istore_3
      1252: goto          1312
      1255: aload_2
      1256: ldc           #215                // String random_spawn_pawn
      1258: invokevirtual #119                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
      1261: ifeq          1312
      1264: bipush        47
      1266: istore_3
      1267: goto          1312
      1270: aload_2
      1271: ldc           #217                // String random_spawn_treasurebox
      1273: invokevirtual #119                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
      1276: ifeq          1312
      1279: bipush        48
      1281: istore_3
      1282: goto          1312
      1285: aload_2
      1286: ldc           #219                // String exclusive_despawn_normal
      1288: invokevirtual #119                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
      1291: ifeq          1312
      1294: bipush        49
      1296: istore_3
      1297: goto          1312
      1300: aload_2
      1301: ldc           #221                // String exclusive_spawn_use_db
      1303: invokevirtual #119                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
      1306: ifeq          1312
      1309: bipush        50
      1311: istore_3
      1312: iload_3
      1313: tableswitch   { // 0 to 50

                       0: 1532

                       1: 1548

                       2: 1564

                       3: 1580

                       4: 1596

                       5: 1612

                       6: 1628

                       7: 1644

                       8: 1660

                       9: 1676

                      10: 1692

                      11: 1708

                      12: 1724

                      13: 1740

                      14: 1756

                      15: 1772

                      16: 1788

                      17: 1804

                      18: 1820

                      19: 1836

                      20: 1852

                      21: 1868

                      22: 1884

                      23: 1900

                      24: 1916

                      25: 1932

                      26: 1948

                      27: 1964

                      28: 1980

                      29: 1996

                      30: 2012

                      31: 2028

                      32: 2044

                      33: 2060

                      34: 2076

                      35: 2092

                      36: 2108

                      37: 2124

                      38: 2140

                      39: 2156

                      40: 2172

                      41: 2188

                      42: 2204

                      43: 2220

                      44: 2236

                      45: 2252

                      46: 2268

                      47: 2284

                      48: 2300

                      49: 2316

                      50: 2332
                 default: 2348
            }
      1532: aload_0
      1533: new           #223                // class ext/mods/gameserver/scripting/script/maker/CloseDoorMaker
      1536: dup
      1537: ldc           #117                // String Close_Door_maker
      1539: invokespecial #225                // Method ext/mods/gameserver/scripting/script/maker/CloseDoorMaker."<init>":(Ljava/lang/String;)V
      1542: putfield      #228                // Field _maker:Lext/mods/gameserver/scripting/SpawnMaker;
      1545: goto          2362
      1548: aload_0
      1549: new           #232                // class ext/mods/gameserver/scripting/script/maker/DefaultUseDBMaker
      1552: dup
      1553: ldc           #123                // String default_use_db_maker
      1555: invokespecial #234                // Method ext/mods/gameserver/scripting/script/maker/DefaultUseDBMaker."<init>":(Ljava/lang/String;)V
      1558: putfield      #228                // Field _maker:Lext/mods/gameserver/scripting/SpawnMaker;
      1561: goto          2362
      1564: aload_0
      1565: new           #235                // class ext/mods/gameserver/scripting/script/maker/ExclusiveSpawnNormalMaker
      1568: dup
      1569: ldc           #125                // String exclusive_spawn_normal
      1571: invokespecial #237                // Method ext/mods/gameserver/scripting/script/maker/ExclusiveSpawnNormalMaker."<init>":(Ljava/lang/String;)V
      1574: putfield      #228                // Field _maker:Lext/mods/gameserver/scripting/SpawnMaker;
      1577: goto          2362
      1580: aload_0
      1581: new           #238                // class ext/mods/gameserver/scripting/script/maker/FreyaDeaconKeeperMaker
      1584: dup
      1585: ldc           #127                // String freya_deacon_keeper_maker
      1587: invokespecial #240                // Method ext/mods/gameserver/scripting/script/maker/FreyaDeaconKeeperMaker."<init>":(Ljava/lang/String;)V
      1590: putfield      #228                // Field _maker:Lext/mods/gameserver/scripting/SpawnMaker;
      1593: goto          2362
      1596: aload_0
      1597: new           #241                // class ext/mods/gameserver/scripting/script/maker/IceFairySirrMaker
      1600: dup
      1601: ldc           #129                // String ice_fairy_sirr_maker
      1603: invokespecial #243                // Method ext/mods/gameserver/scripting/script/maker/IceFairySirrMaker."<init>":(Ljava/lang/String;)V
      1606: putfield      #228                // Field _maker:Lext/mods/gameserver/scripting/SpawnMaker;
      1609: goto          2362
      1612: aload_0
      1613: new           #244                // class ext/mods/gameserver/scripting/script/maker/InstantSpawnRandomMaker
      1616: dup
      1617: ldc           #131                // String maker_instant_spawn_random
      1619: invokespecial #246                // Method ext/mods/gameserver/scripting/script/maker/InstantSpawnRandomMaker."<init>":(Ljava/lang/String;)V
      1622: putfield      #228                // Field _maker:Lext/mods/gameserver/scripting/SpawnMaker;
      1625: goto          2362
      1628: aload_0
      1629: new           #247                // class ext/mods/gameserver/scripting/script/maker/InstantSpawnSerialMaker
      1632: dup
      1633: ldc           #133                // String maker_instant_spawn_serial
      1635: invokespecial #249                // Method ext/mods/gameserver/scripting/script/maker/InstantSpawnSerialMaker."<init>":(Ljava/lang/String;)V
      1638: putfield      #228                // Field _maker:Lext/mods/gameserver/scripting/SpawnMaker;
      1641: goto          2362
      1644: aload_0
      1645: new           #250                // class ext/mods/gameserver/scripting/script/maker/InstantSpawnMaker
      1648: dup
      1649: ldc           #135                // String maker_instant_spawn
      1651: invokespecial #252                // Method ext/mods/gameserver/scripting/script/maker/InstantSpawnMaker."<init>":(Ljava/lang/String;)V
      1654: putfield      #228                // Field _maker:Lext/mods/gameserver/scripting/SpawnMaker;
      1657: goto          2362
      1660: aload_0
      1661: new           #253                // class ext/mods/gameserver/scripting/script/maker/ManageTeleportDungeonMaker
      1664: dup
      1665: ldc           #137                // String manage_teleport_dungeon
      1667: invokespecial #255                // Method ext/mods/gameserver/scripting/script/maker/ManageTeleportDungeonMaker."<init>":(Ljava/lang/String;)V
      1670: putfield      #228                // Field _maker:Lext/mods/gameserver/scripting/SpawnMaker;
      1673: goto          2362
      1676: aload_0
      1677: new           #256                // class ext/mods/gameserver/scripting/script/maker/OnDayNightSpawnMaker
      1680: dup
      1681: ldc           #139                // String on_day_night_spawn
      1683: invokespecial #258                // Method ext/mods/gameserver/scripting/script/maker/OnDayNightSpawnMaker."<init>":(Ljava/lang/String;)V
      1686: putfield      #228                // Field _maker:Lext/mods/gameserver/scripting/SpawnMaker;
      1689: goto          2362
      1692: aload_0
      1693: new           #259                // class ext/mods/gameserver/scripting/script/maker/RandomSpawnMaker
      1696: dup
      1697: ldc           #141                // String random_spawn
      1699: invokespecial #261                // Method ext/mods/gameserver/scripting/script/maker/RandomSpawnMaker."<init>":(Ljava/lang/String;)V
      1702: putfield      #228                // Field _maker:Lext/mods/gameserver/scripting/SpawnMaker;
      1705: goto          2362
      1708: aload_0
      1709: new           #262                // class ext/mods/gameserver/scripting/script/maker/RoyalReqNextMaker
      1712: dup
      1713: ldc           #143                // String royal_req_next_maker
      1715: invokespecial #264                // Method ext/mods/gameserver/scripting/script/maker/RoyalReqNextMaker."<init>":(Ljava/lang/String;)V
      1718: putfield      #228                // Field _maker:Lext/mods/gameserver/scripting/SpawnMaker;
      1721: goto          2362
      1724: aload_0
      1725: new           #265                // class ext/mods/gameserver/scripting/script/maker/RoyalRushMaker
      1728: dup
      1729: ldc           #145                // String royal_rush_maker
      1731: invokespecial #267                // Method ext/mods/gameserver/scripting/script/maker/RoyalRushMaker."<init>":(Ljava/lang/String;)V
      1734: putfield      #228                // Field _maker:Lext/mods/gameserver/scripting/SpawnMaker;
      1737: goto          2362
      1740: aload_0
      1741: new           #268                // class ext/mods/gameserver/scripting/script/maker/RoyalSpawnTreasureBoxMaker
      1744: dup
      1745: ldc           #147                // String royal_spawn_treasurebox
      1747: invokespecial #270                // Method ext/mods/gameserver/scripting/script/maker/RoyalSpawnTreasureBoxMaker."<init>":(Ljava/lang/String;)V
      1750: putfield      #228                // Field _maker:Lext/mods/gameserver/scripting/SpawnMaker;
      1753: goto          2362
      1756: aload_0
      1757: new           #271                // class ext/mods/gameserver/scripting/script/maker/ParentSpawnAllMaker
      1760: dup
      1761: ldc           #149                // String parent_spawn_all
      1763: invokespecial #273                // Method ext/mods/gameserver/scripting/script/maker/ParentSpawnAllMaker."<init>":(Ljava/lang/String;)V
      1766: putfield      #228                // Field _maker:Lext/mods/gameserver/scripting/SpawnMaker;
      1769: goto          2362
      1772: aload_0
      1773: new           #274                // class ext/mods/gameserver/scripting/script/maker/UniqueNpcKillEventMaker
      1776: dup
      1777: ldc           #151                // String unique_npc_kill_event
      1779: invokespecial #276                // Method ext/mods/gameserver/scripting/script/maker/UniqueNpcKillEventMaker."<init>":(Ljava/lang/String;)V
      1782: putfield      #228                // Field _maker:Lext/mods/gameserver/scripting/SpawnMaker;
      1785: goto          2362
      1788: aload_0
      1789: new           #277                // class ext/mods/gameserver/scripting/script/maker/NoOnStartMaker
      1792: dup
      1793: ldc           #153                // String no_on_start_maker
      1795: invokespecial #279                // Method ext/mods/gameserver/scripting/script/maker/NoOnStartMaker."<init>":(Ljava/lang/String;)V
      1798: putfield      #228                // Field _maker:Lext/mods/gameserver/scripting/SpawnMaker;
      1801: goto          2362
      1804: aload_0
      1805: new           #280                // class ext/mods/gameserver/scripting/script/maker/VelociraptorMaker
      1808: dup
      1809: ldc           #155                // String velociraptor_maker
      1811: invokespecial #282                // Method ext/mods/gameserver/scripting/script/maker/VelociraptorMaker."<init>":(Ljava/lang/String;)V
      1814: putfield      #228                // Field _maker:Lext/mods/gameserver/scripting/SpawnMaker;
      1817: goto          2362
      1820: aload_0
      1821: new           #283                // class ext/mods/gameserver/scripting/script/maker/RhamphorhynchusMaker
      1824: dup
      1825: ldc           #157                // String rhamphorhynchus_maker
      1827: invokespecial #285                // Method ext/mods/gameserver/scripting/script/maker/RhamphorhynchusMaker."<init>":(Ljava/lang/String;)V
      1830: putfield      #228                // Field _maker:Lext/mods/gameserver/scripting/SpawnMaker;
      1833: goto          2362
      1836: aload_0
      1837: new           #286                // class ext/mods/gameserver/scripting/script/maker/TyrannosaurusMaker
      1840: dup
      1841: ldc           #159                // String tyrannosaurus_maker
      1843: invokespecial #288                // Method ext/mods/gameserver/scripting/script/maker/TyrannosaurusMaker."<init>":(Ljava/lang/String;)V
      1846: putfield      #228                // Field _maker:Lext/mods/gameserver/scripting/SpawnMaker;
      1849: goto          2362
      1852: aload_0
      1853: new           #289                // class ext/mods/gameserver/scripting/script/maker/SailrenMaker
      1856: dup
      1857: ldc           #161                // String sailren_maker
      1859: invokespecial #291                // Method ext/mods/gameserver/scripting/script/maker/SailrenMaker."<init>":(Ljava/lang/String;)V
      1862: putfield      #228                // Field _maker:Lext/mods/gameserver/scripting/SpawnMaker;
      1865: goto          2362
      1868: aload_0
      1869: new           #292                // class ext/mods/gameserver/scripting/script/maker/SculptureGardenMaker
      1872: dup
      1873: ldc           #163                // String sculpture_garden_maker
      1875: invokespecial #294                // Method ext/mods/gameserver/scripting/script/maker/SculptureGardenMaker."<init>":(Ljava/lang/String;)V
      1878: putfield      #228                // Field _maker:Lext/mods/gameserver/scripting/SpawnMaker;
      1881: goto          2362
      1884: aload_0
      1885: new           #295                // class ext/mods/gameserver/scripting/script/maker/SculptureIceFairyMaker
      1888: dup
      1889: ldc           #165                // String sculpture_ice_fairy_maker
      1891: invokespecial #297                // Method ext/mods/gameserver/scripting/script/maker/SculptureIceFairyMaker."<init>":(Ljava/lang/String;)V
      1894: putfield      #228                // Field _maker:Lext/mods/gameserver/scripting/SpawnMaker;
      1897: goto          2362
      1900: aload_0
      1901: new           #298                // class ext/mods/gameserver/scripting/script/maker/SailrenDummyMaker
      1904: dup
      1905: ldc           #167                // String sailren_dummy_maker
      1907: invokespecial #300                // Method ext/mods/gameserver/scripting/script/maker/SailrenDummyMaker."<init>":(Ljava/lang/String;)V
      1910: putfield      #228                // Field _maker:Lext/mods/gameserver/scripting/SpawnMaker;
      1913: goto          2362
      1916: aload_0
      1917: new           #301                // class ext/mods/gameserver/scripting/script/maker/StatueOfShilenMaker
      1920: dup
      1921: ldc           #169                // String statue_of_shilen_maker
      1923: invokespecial #303                // Method ext/mods/gameserver/scripting/script/maker/StatueOfShilenMaker."<init>":(Ljava/lang/String;)V
      1926: putfield      #228                // Field _maker:Lext/mods/gameserver/scripting/SpawnMaker;
      1929: goto          2362
      1932: aload_0
      1933: new           #304                // class ext/mods/gameserver/scripting/script/maker/BenomMaker
      1936: dup
      1937: ldc           #171                // String benom_maker
      1939: invokespecial #306                // Method ext/mods/gameserver/scripting/script/maker/BenomMaker."<init>":(Ljava/lang/String;)V
      1942: putfield      #228                // Field _maker:Lext/mods/gameserver/scripting/SpawnMaker;
      1945: goto          2362
      1948: aload_0
      1949: new           #307                // class ext/mods/gameserver/scripting/script/maker/DefaultUseDBMakerForFrintezza
      1952: dup
      1953: ldc           #173                // String default_use_db_maker_for_frintessa
      1955: invokespecial #309                // Method ext/mods/gameserver/scripting/script/maker/DefaultUseDBMakerForFrintezza."<init>":(Ljava/lang/String;)V
      1958: putfield      #228                // Field _maker:Lext/mods/gameserver/scripting/SpawnMaker;
      1961: goto          2362
      1964: aload_0
      1965: new           #310                // class ext/mods/gameserver/scripting/script/maker/FrintezzaEvilateMaker
      1968: dup
      1969: ldc           #175                // String frintessa_evilate_maker
      1971: invokespecial #312                // Method ext/mods/gameserver/scripting/script/maker/FrintezzaEvilateMaker."<init>":(Ljava/lang/String;)V
      1974: putfield      #228                // Field _maker:Lext/mods/gameserver/scripting/SpawnMaker;
      1977: goto          2362
      1980: aload_0
      1981: new           #313                // class ext/mods/gameserver/scripting/script/maker/HallKeeperDefaultMaker
      1984: dup
      1985: ldc           #177                // String hall_keeper_wizard_maker
      1987: invokespecial #315                // Method ext/mods/gameserver/scripting/script/maker/HallKeeperDefaultMaker."<init>":(Ljava/lang/String;)V
      1990: putfield      #228                // Field _maker:Lext/mods/gameserver/scripting/SpawnMaker;
      1993: goto          2362
      1996: aload_0
      1997: new           #313                // class ext/mods/gameserver/scripting/script/maker/HallKeeperDefaultMaker
      2000: dup
      2001: ldc           #179                // String hall_keeper_patrol_maker
      2003: invokespecial #315                // Method ext/mods/gameserver/scripting/script/maker/HallKeeperDefaultMaker."<init>":(Ljava/lang/String;)V
      2006: putfield      #228                // Field _maker:Lext/mods/gameserver/scripting/SpawnMaker;
      2009: goto          2362
      2012: aload_0
      2013: new           #316                // class ext/mods/gameserver/scripting/script/maker/AlarmDeviceMaker1
      2016: dup
      2017: ldc           #181                // String alarm_device1_maker
      2019: invokespecial #318                // Method ext/mods/gameserver/scripting/script/maker/AlarmDeviceMaker1."<init>":(Ljava/lang/String;)V
      2022: putfield      #228                // Field _maker:Lext/mods/gameserver/scripting/SpawnMaker;
      2025: goto          2362
      2028: aload_0
      2029: new           #319                // class ext/mods/gameserver/scripting/script/maker/AlarmDeviceMaker2
      2032: dup
      2033: ldc           #183                // String alarm_device2_maker
      2035: invokespecial #321                // Method ext/mods/gameserver/scripting/script/maker/AlarmDeviceMaker2."<init>":(Ljava/lang/String;)V
      2038: putfield      #228                // Field _maker:Lext/mods/gameserver/scripting/SpawnMaker;
      2041: goto          2362
      2044: aload_0
      2045: new           #322                // class ext/mods/gameserver/scripting/script/maker/AlarmDeviceMaker3
      2048: dup
      2049: ldc           #185                // String alarm_device3_maker
      2051: invokespecial #324                // Method ext/mods/gameserver/scripting/script/maker/AlarmDeviceMaker3."<init>":(Ljava/lang/String;)V
      2054: putfield      #228                // Field _maker:Lext/mods/gameserver/scripting/SpawnMaker;
      2057: goto          2362
      2060: aload_0
      2061: new           #325                // class ext/mods/gameserver/scripting/script/maker/AlarmDeviceMaker4
      2064: dup
      2065: ldc           #187                // String alarm_device4_maker
      2067: invokespecial #327                // Method ext/mods/gameserver/scripting/script/maker/AlarmDeviceMaker4."<init>":(Ljava/lang/String;)V
      2070: putfield      #228                // Field _maker:Lext/mods/gameserver/scripting/SpawnMaker;
      2073: goto          2362
      2076: aload_0
      2077: new           #313                // class ext/mods/gameserver/scripting/script/maker/HallKeeperDefaultMaker
      2080: dup
      2081: ldc           #189                // String hall_keeper_guard_maker
      2083: invokespecial #315                // Method ext/mods/gameserver/scripting/script/maker/HallKeeperDefaultMaker."<init>":(Ljava/lang/String;)V
      2086: putfield      #228                // Field _maker:Lext/mods/gameserver/scripting/SpawnMaker;
      2089: goto          2362
      2092: aload_0
      2093: new           #313                // class ext/mods/gameserver/scripting/script/maker/HallKeeperDefaultMaker
      2096: dup
      2097: ldc           #191                // String hall_keeper_captain_maker
      2099: invokespecial #315                // Method ext/mods/gameserver/scripting/script/maker/HallKeeperDefaultMaker."<init>":(Ljava/lang/String;)V
      2102: putfield      #228                // Field _maker:Lext/mods/gameserver/scripting/SpawnMaker;
      2105: goto          2362
      2108: aload_0
      2109: new           #313                // class ext/mods/gameserver/scripting/script/maker/HallKeeperDefaultMaker
      2112: dup
      2113: ldc           #193                // String hall_keeper_self_destruction_maker
      2115: invokespecial #315                // Method ext/mods/gameserver/scripting/script/maker/HallKeeperDefaultMaker."<init>":(Ljava/lang/String;)V
      2118: putfield      #228                // Field _maker:Lext/mods/gameserver/scripting/SpawnMaker;
      2121: goto          2362
      2124: aload_0
      2125: new           #328                // class ext/mods/gameserver/scripting/script/maker/UndeadBandmasterMaker
      2128: dup
      2129: ldc           #195                // String undead_bandmaster_maker
      2131: invokespecial #330                // Method ext/mods/gameserver/scripting/script/maker/UndeadBandmasterMaker."<init>":(Ljava/lang/String;)V
      2134: putfield      #228                // Field _maker:Lext/mods/gameserver/scripting/SpawnMaker;
      2137: goto          2362
      2140: aload_0
      2141: new           #331                // class ext/mods/gameserver/scripting/script/maker/OpenDoorMaker
      2144: dup
      2145: ldc           #197                // String undead_band_lance_maker
      2147: invokespecial #333                // Method ext/mods/gameserver/scripting/script/maker/OpenDoorMaker."<init>":(Ljava/lang/String;)V
      2150: putfield      #228                // Field _maker:Lext/mods/gameserver/scripting/SpawnMaker;
      2153: goto          2362
      2156: aload_0
      2157: new           #331                // class ext/mods/gameserver/scripting/script/maker/OpenDoorMaker
      2160: dup
      2161: ldc           #199                // String undead_band_leader_maker
      2163: invokespecial #333                // Method ext/mods/gameserver/scripting/script/maker/OpenDoorMaker."<init>":(Ljava/lang/String;)V
      2166: putfield      #228                // Field _maker:Lext/mods/gameserver/scripting/SpawnMaker;
      2169: goto          2362
      2172: aload_0
      2173: new           #331                // class ext/mods/gameserver/scripting/script/maker/OpenDoorMaker
      2176: dup
      2177: ldc           #201                // String undead_band_archer_wazird_maker
      2179: invokespecial #333                // Method ext/mods/gameserver/scripting/script/maker/OpenDoorMaker."<init>":(Ljava/lang/String;)V
      2182: putfield      #228                // Field _maker:Lext/mods/gameserver/scripting/SpawnMaker;
      2185: goto          2362
      2188: aload_0
      2189: new           #334                // class ext/mods/gameserver/scripting/script/maker/WarriorPassiveWeaknessMaker
      2192: dup
      2193: ldc           #203                // String warrior_passive_weakness_maker
      2195: invokespecial #336                // Method ext/mods/gameserver/scripting/script/maker/WarriorPassiveWeaknessMaker."<init>":(Ljava/lang/String;)V
      2198: putfield      #228                // Field _maker:Lext/mods/gameserver/scripting/SpawnMaker;
      2201: goto          2362
      2204: aload_0
      2205: new           #313                // class ext/mods/gameserver/scripting/script/maker/HallKeeperDefaultMaker
      2208: dup
      2209: ldc           #205                // String hall_timer_bomb_maker
      2211: invokespecial #315                // Method ext/mods/gameserver/scripting/script/maker/HallKeeperDefaultMaker."<init>":(Ljava/lang/String;)V
      2214: putfield      #228                // Field _maker:Lext/mods/gameserver/scripting/SpawnMaker;
      2217: goto          2362
      2220: aload_0
      2221: new           #337                // class ext/mods/gameserver/scripting/script/maker/FarmMaker
      2224: dup
      2225: ldc           #207                // String farm_maker
      2227: invokespecial #339                // Method ext/mods/gameserver/scripting/script/maker/FarmMaker."<init>":(Ljava/lang/String;)V
      2230: putfield      #228                // Field _maker:Lext/mods/gameserver/scripting/SpawnMaker;
      2233: goto          2362
      2236: aload_0
      2237: new           #340                // class ext/mods/gameserver/scripting/script/maker/RainbowMaker
      2240: dup
      2241: ldc           #209                // String rainbow_maker
      2243: invokespecial #342                // Method ext/mods/gameserver/scripting/script/maker/RainbowMaker."<init>":(Ljava/lang/String;)V
      2246: putfield      #228                // Field _maker:Lext/mods/gameserver/scripting/SpawnMaker;
      2249: goto          2362
      2252: aload_0
      2253: new           #343                // class ext/mods/gameserver/scripting/script/maker/EventMaker
      2256: dup
      2257: ldc           #211                // String event_maker
      2259: invokespecial #345                // Method ext/mods/gameserver/scripting/script/maker/EventMaker."<init>":(Ljava/lang/String;)V
      2262: putfield      #228                // Field _maker:Lext/mods/gameserver/scripting/SpawnMaker;
      2265: goto          2362
      2268: aload_0
      2269: new           #346                // class ext/mods/gameserver/scripting/script/maker/InstantSpawnSerialLastMaker
      2272: dup
      2273: ldc           #213                // String maker_instant_spawn_serial_last
      2275: invokespecial #348                // Method ext/mods/gameserver/scripting/script/maker/InstantSpawnSerialLastMaker."<init>":(Ljava/lang/String;)V
      2278: putfield      #228                // Field _maker:Lext/mods/gameserver/scripting/SpawnMaker;
      2281: goto          2362
      2284: aload_0
      2285: new           #349                // class ext/mods/gameserver/scripting/script/maker/RandomSpawnPawnMaker
      2288: dup
      2289: ldc           #215                // String random_spawn_pawn
      2291: invokespecial #351                // Method ext/mods/gameserver/scripting/script/maker/RandomSpawnPawnMaker."<init>":(Ljava/lang/String;)V
      2294: putfield      #228                // Field _maker:Lext/mods/gameserver/scripting/SpawnMaker;
      2297: goto          2362
      2300: aload_0
      2301: new           #352                // class ext/mods/gameserver/scripting/script/maker/RandomSpawnTreasurebox
      2304: dup
      2305: ldc           #217                // String random_spawn_treasurebox
      2307: invokespecial #354                // Method ext/mods/gameserver/scripting/script/maker/RandomSpawnTreasurebox."<init>":(Ljava/lang/String;)V
      2310: putfield      #228                // Field _maker:Lext/mods/gameserver/scripting/SpawnMaker;
      2313: goto          2362
      2316: aload_0
      2317: new           #355                // class ext/mods/gameserver/scripting/script/maker/ExclusiveDespawnNormalMaker
      2320: dup
      2321: ldc           #219                // String exclusive_despawn_normal
      2323: invokespecial #357                // Method ext/mods/gameserver/scripting/script/maker/ExclusiveDespawnNormalMaker."<init>":(Ljava/lang/String;)V
      2326: putfield      #228                // Field _maker:Lext/mods/gameserver/scripting/SpawnMaker;
      2329: goto          2362
      2332: aload_0
      2333: new           #235                // class ext/mods/gameserver/scripting/script/maker/ExclusiveSpawnNormalMaker
      2336: dup
      2337: ldc           #221                // String exclusive_spawn_use_db
      2339: invokespecial #237                // Method ext/mods/gameserver/scripting/script/maker/ExclusiveSpawnNormalMaker."<init>":(Ljava/lang/String;)V
      2342: putfield      #228                // Field _maker:Lext/mods/gameserver/scripting/SpawnMaker;
      2345: goto          2362
      2348: aload_0
      2349: new           #358                // class ext/mods/gameserver/scripting/script/maker/DefaultMaker
      2352: dup
      2353: ldc_w         #360                // String default_maker
      2356: invokespecial #362                // Method ext/mods/gameserver/scripting/script/maker/DefaultMaker."<init>":(Ljava/lang/String;)V
      2359: putfield      #228                // Field _maker:Lext/mods/gameserver/scripting/SpawnMaker;
      2362: aload_1
      2363: ldc_w         #363                // String spawnTime
      2366: aconst_null
      2367: invokevirtual #38                 // Method ext/mods/commons/data/StatSet.getString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
      2370: astore_2
      2371: aload_2
      2372: ifnull        2412
      2375: aload_2
      2376: ldc_w         #365                // String [()]
      2379: invokevirtual #367                // Method java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
      2382: astore_3
      2383: aload_3
      2384: arraylength
      2385: iconst_2
      2386: if_icmpne     2412
      2389: aload_0
      2390: aload_3
      2391: iconst_0
      2392: aaload
      2393: invokestatic  #371                // Method ext/mods/gameserver/enums/MakerSpawnTime.getEnumByName:(Ljava/lang/String;)Lext/mods/gameserver/enums/MakerSpawnTime;
      2396: putfield      #7                  // Field _spawnTime:Lext/mods/gameserver/enums/MakerSpawnTime;
      2399: aload_0
      2400: aload_3
      2401: iconst_1
      2402: aaload
      2403: ldc_w         #377                // String ;
      2406: invokevirtual #367                // Method java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
      2409: putfield      #13                 // Field _spawnTimeParams:[Ljava/lang/String;
      2412: aload_0
      2413: aconst_null
      2414: putfield      #379                // Field _spawns:Ljava/util/List;
      2417: aload_0
      2418: getfield      #32                 // Field _spawnedCount:Ljava/util/concurrent/atomic/AtomicInteger;
      2421: iconst_0
      2422: invokevirtual #382                // Method java/util/concurrent/atomic/AtomicInteger.set:(I)V
      2425: return
      LineNumberTable:
        line 103: 0
        line 90: 4
        line 91: 9
        line 94: 14
        line 96: 21
        line 104: 33
        line 106: 44
        line 107: 59
        line 108: 74
        line 109: 91
        line 110: 110
        line 112: 121
        line 115: 1532
        line 116: 1545
        line 119: 1548
        line 120: 1561
        line 123: 1564
        line 124: 1577
        line 127: 1580
        line 128: 1593
        line 131: 1596
        line 132: 1609
        line 135: 1612
        line 136: 1625
        line 139: 1628
        line 140: 1641
        line 143: 1644
        line 144: 1657
        line 147: 1660
        line 148: 1673
        line 151: 1676
        line 152: 1689
        line 155: 1692
        line 156: 1705
        line 159: 1708
        line 160: 1721
        line 163: 1724
        line 164: 1737
        line 167: 1740
        line 168: 1753
        line 171: 1756
        line 172: 1769
        line 175: 1772
        line 176: 1785
        line 179: 1788
        line 180: 1801
        line 183: 1804
        line 184: 1817
        line 187: 1820
        line 188: 1833
        line 191: 1836
        line 192: 1849
        line 195: 1852
        line 196: 1865
        line 199: 1868
        line 200: 1881
        line 203: 1884
        line 204: 1897
        line 207: 1900
        line 208: 1913
        line 211: 1916
        line 212: 1929
        line 215: 1932
        line 216: 1945
        line 219: 1948
        line 220: 1961
        line 223: 1964
        line 224: 1977
        line 227: 1980
        line 228: 1993
        line 231: 1996
        line 232: 2009
        line 235: 2012
        line 236: 2025
        line 239: 2028
        line 240: 2041
        line 243: 2044
        line 244: 2057
        line 247: 2060
        line 248: 2073
        line 251: 2076
        line 252: 2089
        line 255: 2092
        line 256: 2105
        line 259: 2108
        line 260: 2121
        line 263: 2124
        line 264: 2137
        line 267: 2140
        line 268: 2153
        line 271: 2156
        line 272: 2169
        line 275: 2172
        line 276: 2185
        line 279: 2188
        line 280: 2201
        line 283: 2204
        line 284: 2217
        line 287: 2220
        line 288: 2233
        line 291: 2236
        line 292: 2249
        line 295: 2252
        line 296: 2265
        line 299: 2268
        line 300: 2281
        line 303: 2284
        line 304: 2297
        line 307: 2300
        line 308: 2313
        line 311: 2316
        line 312: 2329
        line 315: 2332
        line 316: 2345
        line 319: 2348
        line 323: 2362
        line 324: 2371
        line 326: 2375
        line 327: 2383
        line 329: 2389
        line 330: 2399
        line 334: 2412
        line 335: 2417
        line 336: 2425
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
         2383      29     3 split   [Ljava/lang/String;
            0    2426     0  this   Lext/mods/gameserver/model/spawn/NpcMaker;
            0    2426     1   set   Lext/mods/commons/data/StatSet;
         2371      55     2 makerSpawnTime   Ljava/lang/String;
      StackMapTable: number_of_entries = 106
        frame_type = 255 /* full_frame */
          offset_delta = 556
          locals = [ class ext/mods/gameserver/model/spawn/NpcMaker, class ext/mods/commons/data/StatSet, class java/lang/String, int ]
          stack = []
        frame_type = 13 /* same */
        frame_type = 13 /* same */
        frame_type = 13 /* same */
        frame_type = 13 /* same */
        frame_type = 13 /* same */
        frame_type = 13 /* same */
        frame_type = 14 /* same */
        frame_type = 14 /* same */
        frame_type = 14 /* same */
        frame_type = 14 /* same */
        frame_type = 14 /* same */
        frame_type = 14 /* same */
        frame_type = 14 /* same */
        frame_type = 14 /* same */
        frame_type = 14 /* same */
        frame_type = 14 /* same */
        frame_type = 14 /* same */
        frame_type = 14 /* same */
        frame_type = 14 /* same */
        frame_type = 14 /* same */
        frame_type = 14 /* same */
        frame_type = 14 /* same */
        frame_type = 14 /* same */
        frame_type = 14 /* same */
        frame_type = 14 /* same */
        frame_type = 14 /* same */
        frame_type = 14 /* same */
        frame_type = 14 /* same */
        frame_type = 14 /* same */
        frame_type = 14 /* same */
        frame_type = 14 /* same */
        frame_type = 14 /* same */
        frame_type = 14 /* same */
        frame_type = 14 /* same */
        frame_type = 14 /* same */
        frame_type = 14 /* same */
        frame_type = 14 /* same */
        frame_type = 14 /* same */
        frame_type = 14 /* same */
        frame_type = 14 /* same */
        frame_type = 14 /* same */
        frame_type = 14 /* same */
        frame_type = 14 /* same */
        frame_type = 14 /* same */
        frame_type = 14 /* same */
        frame_type = 14 /* same */
        frame_type = 14 /* same */
        frame_type = 14 /* same */
        frame_type = 14 /* same */
        frame_type = 14 /* same */
        frame_type = 11 /* same */
        frame_type = 251 /* same_frame_extended */
          offset_delta = 219
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 249 /* chop */
          offset_delta = 13
        frame_type = 252 /* append */
          offset_delta = 49
          locals = [ class java/lang/String ]

  public final java.lang.String getName();
    descriptor: ()Ljava/lang/String;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #44                 // Field _name:Ljava/lang/String;
         4: areturn
      LineNumberTable:
        line 343: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/spawn/NpcMaker;

  public final ext.mods.commons.geometry.Territory getTerritory();
    descriptor: ()Lext/mods/commons/geometry/Territory;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #56                 // Field _territory:Lext/mods/commons/geometry/Territory;
         4: areturn
      LineNumberTable:
        line 351: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/spawn/NpcMaker;

  public final ext.mods.commons.geometry.Territory getBannedTerritory();
    descriptor: ()Lext/mods/commons/geometry/Territory;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #62                 // Field _bannedTerritory:Lext/mods/commons/geometry/Territory;
         4: areturn
      LineNumberTable:
        line 359: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/spawn/NpcMaker;

  public final ext.mods.gameserver.scripting.SpawnMaker getMaker();
    descriptor: ()Lext/mods/gameserver/scripting/SpawnMaker;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #228                // Field _maker:Lext/mods/gameserver/scripting/SpawnMaker;
         4: areturn
      LineNumberTable:
        line 367: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/spawn/NpcMaker;

  public final ext.mods.gameserver.enums.MakerSpawnTime getMakerSpawnTime();
    descriptor: ()Lext/mods/gameserver/enums/MakerSpawnTime;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #7                  // Field _spawnTime:Lext/mods/gameserver/enums/MakerSpawnTime;
         4: areturn
      LineNumberTable:
        line 375: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/spawn/NpcMaker;

  public final java.lang.String[] getMakerSpawnTimeParams();
    descriptor: ()[Ljava/lang/String;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field _spawnTimeParams:[Ljava/lang/String;
         4: areturn
      LineNumberTable:
        line 383: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/spawn/NpcMaker;

  public final ext.mods.gameserver.model.memo.MakerMemo getMakerMemo();
    descriptor: ()Lext/mods/gameserver/model/memo/MakerMemo;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #76                 // Field _aiParams:Lext/mods/gameserver/model/memo/MakerMemo;
         4: areturn
      LineNumberTable:
        line 391: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/spawn/NpcMaker;

  public final int getMaximumNpc();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #98                 // Field _maximumNpc:I
         4: ireturn
      LineNumberTable:
        line 399: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/spawn/NpcMaker;

  public final java.lang.String getEvent();
    descriptor: ()Ljava/lang/String;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #104                // Field _event:Ljava/lang/String;
         4: ifnull        12
         7: aload_0
         8: getfield      #104                // Field _event:Ljava/lang/String;
        11: areturn
        12: aload_0
        13: getfield      #76                 // Field _aiParams:Lext/mods/gameserver/model/memo/MakerMemo;
        16: ifnull        46
        19: aload_0
        20: getfield      #76                 // Field _aiParams:Lext/mods/gameserver/model/memo/MakerMemo;
        23: ldc_w         #385                // String EventName
        26: invokevirtual #387                // Method ext/mods/gameserver/model/memo/MakerMemo.get:(Ljava/lang/Object;)Ljava/lang/Object;
        29: ifnull        46
        32: aload_0
        33: getfield      #76                 // Field _aiParams:Lext/mods/gameserver/model/memo/MakerMemo;
        36: ldc_w         #385                // String EventName
        39: invokevirtual #387                // Method ext/mods/gameserver/model/memo/MakerMemo.get:(Ljava/lang/Object;)Ljava/lang/Object;
        42: checkcast     #112                // class java/lang/String
        45: areturn
        46: aconst_null
        47: areturn
      LineNumberTable:
        line 407: 0
        line 408: 7
        line 409: 12
        line 410: 32
        line 412: 46
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      48     0  this   Lext/mods/gameserver/model/spawn/NpcMaker;
      StackMapTable: number_of_entries = 2
        frame_type = 12 /* same */
        frame_type = 33 /* same */

  public final boolean isOnStart();
    descriptor: ()Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=1
         0: iconst_1
         1: istore_1
         2: aload_0
         3: getfield      #76                 // Field _aiParams:Lext/mods/gameserver/model/memo/MakerMemo;
         6: ifnull        37
         9: aload_0
        10: getfield      #76                 // Field _aiParams:Lext/mods/gameserver/model/memo/MakerMemo;
        13: ldc_w         #391                // String on_start_spawn
        16: invokevirtual #387                // Method ext/mods/gameserver/model/memo/MakerMemo.get:(Ljava/lang/Object;)Ljava/lang/Object;
        19: ifnull        37
        22: aload_0
        23: getfield      #76                 // Field _aiParams:Lext/mods/gameserver/model/memo/MakerMemo;
        26: ldc_w         #391                // String on_start_spawn
        29: invokevirtual #393                // Method ext/mods/gameserver/model/memo/MakerMemo.getInteger:(Ljava/lang/String;)I
        32: ifne          37
        35: iconst_0
        36: istore_1
        37: aload_0
        38: getfield      #104                // Field _event:Ljava/lang/String;
        41: ifnonnull     59
        44: aload_0
        45: getfield      #7                  // Field _spawnTime:Lext/mods/gameserver/enums/MakerSpawnTime;
        48: ifnonnull     59
        51: iload_1
        52: ifeq          59
        55: iconst_1
        56: goto          60
        59: iconst_0
        60: ireturn
      LineNumberTable:
        line 420: 0
        line 421: 2
        line 422: 35
        line 424: 37
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      61     0  this   Lext/mods/gameserver/model/spawn/NpcMaker;
            2      59     1 isOnStart   Z
      StackMapTable: number_of_entries = 3
        frame_type = 252 /* append */
          offset_delta = 37
          locals = [ int ]
        frame_type = 21 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public final void setSpawns(java.util.List<ext.mods.gameserver.model.spawn.MultiSpawn>);
    descriptor: (Ljava/util/List;)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: putfield      #379                // Field _spawns:Ljava/util/List;
         5: return
      LineNumberTable:
        line 433: 0
        line 434: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/spawn/NpcMaker;
            0       6     1 spawns   Ljava/util/List;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0       6     1 spawns   Ljava/util/List<Lext/mods/gameserver/model/spawn/MultiSpawn;>;
    Signature: #510                         // (Ljava/util/List<Lext/mods/gameserver/model/spawn/MultiSpawn;>;)V

  public final java.util.List<ext.mods.gameserver.model.spawn.MultiSpawn> getSpawns();
    descriptor: ()Ljava/util/List;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #379                // Field _spawns:Ljava/util/List;
         4: areturn
      LineNumberTable:
        line 441: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/spawn/NpcMaker;
    Signature: #512                         // ()Ljava/util/List<Lext/mods/gameserver/model/spawn/MultiSpawn;>;

  public final int getSpawnedCount();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #32                 // Field _spawnedCount:Ljava/util/concurrent/atomic/AtomicInteger;
         4: invokevirtual #394                // Method java/util/concurrent/atomic/AtomicInteger.get:()I
         7: ireturn
      LineNumberTable:
        line 449: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/spawn/NpcMaker;

  public void setSpawnedCount(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #32                 // Field _spawnedCount:Ljava/util/concurrent/atomic/AtomicInteger;
         4: iload_1
         5: invokevirtual #382                // Method java/util/concurrent/atomic/AtomicInteger.set:(I)V
         8: return
      LineNumberTable:
        line 454: 0
        line 455: 8
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       9     0  this   Lext/mods/gameserver/model/spawn/NpcMaker;
            0       9     1 count   I

  public final boolean increaseSpawnedCount(ext.mods.gameserver.model.spawn.MultiSpawn, int);
    descriptor: (Lext/mods/gameserver/model/spawn/MultiSpawn;I)Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=4, args_size=3
         0: aload_1
         1: iload_2
         2: invokevirtual #396                // Method ext/mods/gameserver/model/spawn/MultiSpawn.increaseSpawnedCount:(I)Z
         5: ifne          10
         8: iconst_0
         9: ireturn
        10: aload_0
        11: getfield      #32                 // Field _spawnedCount:Ljava/util/concurrent/atomic/AtomicInteger;
        14: invokevirtual #394                // Method java/util/concurrent/atomic/AtomicInteger.get:()I
        17: iload_2
        18: iadd
        19: istore_3
        20: iload_3
        21: iflt          42
        24: iload_3
        25: aload_0
        26: getfield      #98                 // Field _maximumNpc:I
        29: if_icmpgt     42
        32: aload_0
        33: getfield      #32                 // Field _spawnedCount:Ljava/util/concurrent/atomic/AtomicInteger;
        36: iload_3
        37: invokevirtual #382                // Method java/util/concurrent/atomic/AtomicInteger.set:(I)V
        40: iconst_1
        41: ireturn
        42: iconst_0
        43: ireturn
      LineNumberTable:
        line 464: 0
        line 465: 8
        line 467: 10
        line 468: 20
        line 470: 32
        line 471: 40
        line 474: 42
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      44     0  this   Lext/mods/gameserver/model/spawn/NpcMaker;
            0      44     1 spawn   Lext/mods/gameserver/model/spawn/MultiSpawn;
            0      44     2 count   I
           20      24     3 newSpawnedCount   I
      StackMapTable: number_of_entries = 2
        frame_type = 10 /* same */
        frame_type = 252 /* append */
          offset_delta = 31
          locals = [ int ]

  public final java.util.List<ext.mods.gameserver.scripting.Quest> getQuestEvents();
    descriptor: ()Ljava/util/List;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #23                 // Field _questEvents:Ljava/util/List;
         4: areturn
      LineNumberTable:
        line 482: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/spawn/NpcMaker;
    Signature: #521                         // ()Ljava/util/List<Lext/mods/gameserver/scripting/Quest;>;

  public final void addQuestEvent(ext.mods.gameserver.scripting.Quest);
    descriptor: (Lext/mods/gameserver/scripting/Quest;)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=4, locals=2, args_size=2
         0: aload_0
         1: getfield      #23                 // Field _questEvents:Ljava/util/List;
         4: invokeinterface #402,  1          // InterfaceMethod java/util/List.isEmpty:()Z
         9: ifeq          24
        12: aload_0
        13: new           #408                // class java/util/ArrayList
        16: dup
        17: iconst_3
        18: invokespecial #410                // Method java/util/ArrayList."<init>":(I)V
        21: putfield      #23                 // Field _questEvents:Ljava/util/List;
        24: aload_0
        25: getfield      #23                 // Field _questEvents:Ljava/util/List;
        28: aload_1
        29: invokeinterface #411,  2          // InterfaceMethod java/util/List.remove:(Ljava/lang/Object;)Z
        34: pop
        35: aload_0
        36: getfield      #23                 // Field _questEvents:Ljava/util/List;
        39: aload_1
        40: invokeinterface #414,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        45: pop
        46: return
      LineNumberTable:
        line 492: 0
        line 493: 12
        line 495: 24
        line 496: 35
        line 497: 46
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      47     0  this   Lext/mods/gameserver/model/spawn/NpcMaker;
            0      47     1 quest   Lext/mods/gameserver/scripting/Quest;
      StackMapTable: number_of_entries = 1
        frame_type = 24 /* same */

  public final synchronized int spawnAll();
    descriptor: ()I
    flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SYNCHRONIZED
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #228                // Field _maker:Lext/mods/gameserver/scripting/SpawnMaker;
         4: ifnull        15
         7: aload_0
         8: getfield      #228                // Field _maker:Lext/mods/gameserver/scripting/SpawnMaker;
        11: aload_0
        12: invokevirtual #417                // Method ext/mods/gameserver/scripting/SpawnMaker.onStart:(Lext/mods/gameserver/model/spawn/NpcMaker;)V
        15: aload_0
        16: getfield      #32                 // Field _spawnedCount:Ljava/util/concurrent/atomic/AtomicInteger;
        19: invokevirtual #394                // Method java/util/concurrent/atomic/AtomicInteger.get:()I
        22: ireturn
      LineNumberTable:
        line 505: 0
        line 506: 7
        line 508: 15
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      23     0  this   Lext/mods/gameserver/model/spawn/NpcMaker;
      StackMapTable: number_of_entries = 1
        frame_type = 15 /* same */

  public final void onSpawn(ext.mods.gameserver.model.actor.Npc);
    descriptor: (Lext/mods/gameserver/model/actor/Npc;)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=4, locals=2, args_size=2
         0: aload_0
         1: getfield      #228                // Field _maker:Lext/mods/gameserver/scripting/SpawnMaker;
         4: ifnull        23
         7: aload_0
         8: getfield      #228                // Field _maker:Lext/mods/gameserver/scripting/SpawnMaker;
        11: aload_1
        12: aload_1
        13: invokevirtual #423                // Method ext/mods/gameserver/model/actor/Npc.getSpawn:()Lext/mods/gameserver/model/spawn/ASpawn;
        16: checkcast     #397                // class ext/mods/gameserver/model/spawn/MultiSpawn
        19: aload_0
        20: invokevirtual #429                // Method ext/mods/gameserver/scripting/SpawnMaker.onNpcCreated:(Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/spawn/MultiSpawn;Lext/mods/gameserver/model/spawn/NpcMaker;)V
        23: return
      LineNumberTable:
        line 517: 0
        line 518: 7
        line 519: 23
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      24     0  this   Lext/mods/gameserver/model/spawn/NpcMaker;
            0      24     1   npc   Lext/mods/gameserver/model/actor/Npc;
      StackMapTable: number_of_entries = 1
        frame_type = 23 /* same */

  public final void onDecay(ext.mods.gameserver.model.actor.Npc);
    descriptor: (Lext/mods/gameserver/model/actor/Npc;)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=4, locals=7, args_size=2
         0: aload_0
         1: getfield      #32                 // Field _spawnedCount:Ljava/util/concurrent/atomic/AtomicInteger;
         4: invokevirtual #433                // Method java/util/concurrent/atomic/AtomicInteger.decrementAndGet:()I
         7: ifne          48
        10: aload_0
        11: getfield      #23                 // Field _questEvents:Ljava/util/List;
        14: invokeinterface #436,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
        19: astore_2
        20: aload_2
        21: invokeinterface #440,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        26: ifeq          48
        29: aload_2
        30: invokeinterface #445,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        35: checkcast     #449                // class ext/mods/gameserver/scripting/Quest
        38: astore_3
        39: aload_3
        40: aload_0
        41: aload_1
        42: invokevirtual #451                // Method ext/mods/gameserver/scripting/Quest.onMakerNpcsKilled:(Lext/mods/gameserver/model/spawn/NpcMaker;Lext/mods/gameserver/model/actor/Npc;)V
        45: goto          20
        48: aload_0
        49: getfield      #228                // Field _maker:Lext/mods/gameserver/scripting/SpawnMaker;
        52: ifnull        161
        55: iconst_0
        56: istore_2
        57: aload_0
        58: getfield      #379                // Field _spawns:Ljava/util/List;
        61: invokeinterface #436,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
        66: astore_3
        67: aload_3
        68: invokeinterface #440,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        73: ifeq          141
        76: aload_3
        77: invokeinterface #445,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        82: checkcast     #397                // class ext/mods/gameserver/model/spawn/MultiSpawn
        85: astore        4
        87: aload         4
        89: invokevirtual #455                // Method ext/mods/gameserver/model/spawn/MultiSpawn.getDecayedNpcs:()Ljava/util/Set;
        92: invokeinterface #459,  1          // InterfaceMethod java/util/Set.iterator:()Ljava/util/Iterator;
        97: astore        5
        99: aload         5
       101: invokeinterface #440,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       106: ifeq          138
       109: aload         5
       111: invokeinterface #445,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       116: checkcast     #424                // class ext/mods/gameserver/model/actor/Npc
       119: astore        6
       121: aload         6
       123: invokevirtual #462                // Method ext/mods/gameserver/model/actor/Npc.getObjectId:()I
       126: aload_1
       127: invokevirtual #462                // Method ext/mods/gameserver/model/actor/Npc.getObjectId:()I
       130: if_icmpne     135
       133: iconst_1
       134: istore_2
       135: goto          99
       138: goto          67
       141: iload_2
       142: ifeq          161
       145: aload_0
       146: getfield      #228                // Field _maker:Lext/mods/gameserver/scripting/SpawnMaker;
       149: aload_1
       150: aload_1
       151: invokevirtual #423                // Method ext/mods/gameserver/model/actor/Npc.getSpawn:()Lext/mods/gameserver/model/spawn/ASpawn;
       154: checkcast     #397                // class ext/mods/gameserver/model/spawn/MultiSpawn
       157: aload_0
       158: invokevirtual #465                // Method ext/mods/gameserver/scripting/SpawnMaker.onNpcDeleted:(Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/spawn/MultiSpawn;Lext/mods/gameserver/model/spawn/NpcMaker;)V
       161: return
      LineNumberTable:
        line 527: 0
        line 529: 10
        line 530: 39
        line 533: 48
        line 535: 55
        line 537: 57
        line 538: 87
        line 539: 121
        line 540: 133
        line 539: 135
        line 538: 138
        line 542: 141
        line 543: 145
        line 545: 161
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           39       6     3 quest   Lext/mods/gameserver/scripting/Quest;
          121      14     6 msNpc   Lext/mods/gameserver/model/actor/Npc;
           87      51     4    ms   Lext/mods/gameserver/model/spawn/MultiSpawn;
           57     104     2 shouldCallEvent   Z
            0     162     0  this   Lext/mods/gameserver/model/spawn/NpcMaker;
            0     162     1   npc   Lext/mods/gameserver/model/actor/Npc;
      StackMapTable: number_of_entries = 8
        frame_type = 252 /* append */
          offset_delta = 20
          locals = [ class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 27
        frame_type = 253 /* append */
          offset_delta = 18
          locals = [ int, class java/util/Iterator ]
        frame_type = 253 /* append */
          offset_delta = 31
          locals = [ class ext/mods/gameserver/model/spawn/MultiSpawn, class java/util/Iterator ]
        frame_type = 35 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 250 /* chop */
          offset_delta = 2
        frame_type = 250 /* chop */
          offset_delta = 19

  public final synchronized int deleteAll();
    descriptor: ()I
    flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SYNCHRONIZED
    Code:
      stack=2, locals=2, args_size=1
         0: aload_0
         1: getfield      #32                 // Field _spawnedCount:Ljava/util/concurrent/atomic/AtomicInteger;
         4: invokevirtual #394                // Method java/util/concurrent/atomic/AtomicInteger.get:()I
         7: istore_1
         8: aload_0
         9: getfield      #32                 // Field _spawnedCount:Ljava/util/concurrent/atomic/AtomicInteger;
        12: iconst_0
        13: invokevirtual #382                // Method java/util/concurrent/atomic/AtomicInteger.set:(I)V
        16: aload_0
        17: getfield      #379                // Field _spawns:Ljava/util/List;
        20: invokedynamic #468,  0            // InvokeDynamic #0:accept:()Ljava/util/function/Consumer;
        25: invokeinterface #472,  2          // InterfaceMethod java/util/List.forEach:(Ljava/util/function/Consumer;)V
        30: aload_0
        31: getfield      #379                // Field _spawns:Ljava/util/List;
        34: invokedynamic #476,  0            // InvokeDynamic #1:accept:()Ljava/util/function/Consumer;
        39: invokeinterface #472,  2          // InterfaceMethod java/util/List.forEach:(Ljava/util/function/Consumer;)V
        44: aload_0
        45: getfield      #32                 // Field _spawnedCount:Ljava/util/concurrent/atomic/AtomicInteger;
        48: iconst_0
        49: invokevirtual #382                // Method java/util/concurrent/atomic/AtomicInteger.set:(I)V
        52: iload_1
        53: ireturn
      LineNumberTable:
        line 553: 0
        line 555: 8
        line 556: 16
        line 557: 30
        line 559: 44
        line 560: 52
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      54     0  this   Lext/mods/gameserver/model/spawn/NpcMaker;
            8      46     1  npcs   I
}
SourceFile: "NpcMaker.java"
BootstrapMethods:
  0: #552 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #540 (Ljava/lang/Object;)V
      #542 REF_invokeVirtual ext/mods/gameserver/model/spawn/MultiSpawn.cancelScheduledSpawns:()V
      #546 (Lext/mods/gameserver/model/spawn/MultiSpawn;)V
  1: #552 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #540 (Ljava/lang/Object;)V
      #548 REF_invokeVirtual ext/mods/gameserver/model/spawn/MultiSpawn.doDelete:()V
      #546 (Lext/mods/gameserver/model/spawn/MultiSpawn;)V
InnerClasses:
  public static final #564= #560 of #562; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
