// Bytecode for: ext.mods.gameserver.handler.bypasshandlers.FarmZoneTeleportBypass
// File: ext\mods\gameserver\handler\bypasshandlers\FarmZoneTeleportBypass.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/bypasshandlers/FarmZoneTeleportBypass.class
  Last modified 9 de jul de 2026; size 7391 bytes
  MD5 checksum f7500456e254b2d56029f433bd2073e1
  Compiled from "FarmZoneTeleportBypass.java"
public class ext.mods.gameserver.handler.bypasshandlers.FarmZoneTeleportBypass implements ext.mods.gameserver.handler.IBypassHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #201                        // ext/mods/gameserver/handler/bypasshandlers/FarmZoneTeleportBypass
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 4, methods: 5, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Class              #8            // ext/mods/gameserver/model/actor/Npc
    #8 = Utf8               ext/mods/gameserver/model/actor/Npc
    #9 = Methodref          #10.#11       // ext/mods/gameserver/model/actor/Player.isDead:()Z
   #10 = Class              #12           // ext/mods/gameserver/model/actor/Player
   #11 = NameAndType        #13:#14       // isDead:()Z
   #12 = Utf8               ext/mods/gameserver/model/actor/Player
   #13 = Utf8               isDead
   #14 = Utf8               ()Z
   #15 = String             #16           // Você não pode usar este comando enquanto está morto.
   #16 = Utf8               Você não pode usar este comando enquanto está morto.
   #17 = Methodref          #10.#18       // ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
   #18 = NameAndType        #19:#20       // sendMessage:(Ljava/lang/String;)V
   #19 = Utf8               sendMessage
   #20 = Utf8               (Ljava/lang/String;)V
   #21 = Fieldref           #22.#23       // ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
   #22 = Class              #24           // ext/mods/gameserver/network/serverpackets/ActionFailed
   #23 = NameAndType        #25:#26       // STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
   #24 = Utf8               ext/mods/gameserver/network/serverpackets/ActionFailed
   #25 = Utf8               STATIC_PACKET
   #26 = Utf8               Lext/mods/gameserver/network/serverpackets/ActionFailed;
   #27 = Methodref          #10.#28       // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #28 = NameAndType        #29:#30       // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #29 = Utf8               sendPacket
   #30 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #31 = Methodref          #10.#32       // ext/mods/gameserver/model/actor/Player.isInOlympiadMode:()Z
   #32 = NameAndType        #33:#14       // isInOlympiadMode:()Z
   #33 = Utf8               isInOlympiadMode
   #34 = String             #35           // Você não pode usar este comando durante as Olimpíadas.
   #35 = Utf8               Você não pode usar este comando durante as Olimpíadas.
   #36 = Methodref          #10.#37       // ext/mods/gameserver/model/actor/Player.getDungeon:()Lext/mods/dungeon/Dungeon;
   #37 = NameAndType        #38:#39       // getDungeon:()Lext/mods/dungeon/Dungeon;
   #38 = Utf8               getDungeon
   #39 = Utf8               ()Lext/mods/dungeon/Dungeon;
   #40 = String             #41           // Você não pode usar este comando dentro de uma dungeon.
   #41 = Utf8               Você não pode usar este comando dentro de uma dungeon.
   #42 = Methodref          #10.#43       // ext/mods/gameserver/model/actor/Player.isInCombat:()Z
   #43 = NameAndType        #44:#14       // isInCombat:()Z
   #44 = Utf8               isInCombat
   #45 = String             #46           // Você não pode usar este comando em combate.
   #46 = Utf8               Você não pode usar este comando em combate.
   #47 = Methodref          #10.#48       // ext/mods/gameserver/model/actor/Player.getCast:()Lext/mods/gameserver/model/actor/cast/PlayerCast;
   #48 = NameAndType        #49:#50       // getCast:()Lext/mods/gameserver/model/actor/cast/PlayerCast;
   #49 = Utf8               getCast
   #50 = Utf8               ()Lext/mods/gameserver/model/actor/cast/PlayerCast;
   #51 = Methodref          #52.#53       // ext/mods/gameserver/model/actor/cast/PlayerCast.isCastingNow:()Z
   #52 = Class              #54           // ext/mods/gameserver/model/actor/cast/PlayerCast
   #53 = NameAndType        #55:#14       // isCastingNow:()Z
   #54 = Utf8               ext/mods/gameserver/model/actor/cast/PlayerCast
   #55 = Utf8               isCastingNow
   #56 = Methodref          #10.#57       // ext/mods/gameserver/model/actor/Player.isTeleporting:()Z
   #57 = NameAndType        #58:#14       // isTeleporting:()Z
   #58 = Utf8               isTeleporting
   #59 = String             #60           // Aguarde sua ação atual terminar.
   #60 = Utf8               Aguarde sua ação atual terminar.
   #61 = Fieldref           #62.#63       // ext/mods/gameserver/enums/ZoneId.PVP:Lext/mods/gameserver/enums/ZoneId;
   #62 = Class              #64           // ext/mods/gameserver/enums/ZoneId
   #63 = NameAndType        #65:#66       // PVP:Lext/mods/gameserver/enums/ZoneId;
   #64 = Utf8               ext/mods/gameserver/enums/ZoneId
   #65 = Utf8               PVP
   #66 = Utf8               Lext/mods/gameserver/enums/ZoneId;
   #67 = Methodref          #10.#68       // ext/mods/gameserver/model/actor/Player.isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
   #68 = NameAndType        #69:#70       // isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
   #69 = Utf8               isInsideZone
   #70 = Utf8               (Lext/mods/gameserver/enums/ZoneId;)Z
   #71 = Fieldref           #62.#72       // ext/mods/gameserver/enums/ZoneId.SIEGE:Lext/mods/gameserver/enums/ZoneId;
   #72 = NameAndType        #73:#66       // SIEGE:Lext/mods/gameserver/enums/ZoneId;
   #73 = Utf8               SIEGE
   #74 = String             #75           // Você não pode usar este comando desta área.
   #75 = Utf8               Você não pode usar este comando desta área.
   #76 = Methodref          #77.#78       // ext/mods/Crypta/RandomManager.getInstance:()Lext/mods/Crypta/RandomManager;
   #77 = Class              #79           // ext/mods/Crypta/RandomManager
   #78 = NameAndType        #80:#81       // getInstance:()Lext/mods/Crypta/RandomManager;
   #79 = Utf8               ext/mods/Crypta/RandomManager
   #80 = Utf8               getInstance
   #81 = Utf8               ()Lext/mods/Crypta/RandomManager;
   #82 = String             #83           // Sistema de eventos não disponível.
   #83 = Utf8               Sistema de eventos não disponível.
   #84 = Methodref          #77.#85       // ext/mods/Crypta/RandomManager.isEventRunning:()Z
   #85 = NameAndType        #86:#14       // isEventRunning:()Z
   #86 = Utf8               isEventRunning
   #87 = Methodref          #88.#89       // java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
   #88 = Class              #90           // java/lang/Boolean
   #89 = NameAndType        #91:#92       // valueOf:(Z)Ljava/lang/Boolean;
   #90 = Utf8               java/lang/Boolean
   #91 = Utf8               valueOf
   #92 = Utf8               (Z)Ljava/lang/Boolean;
   #93 = Methodref          #88.#94       // java/lang/Boolean.booleanValue:()Z
   #94 = NameAndType        #95:#14       // booleanValue:()Z
   #95 = Utf8               booleanValue
   #96 = String             #97           // Nenhuma Farm Zone ativa no momento.
   #97 = Utf8               Nenhuma Farm Zone ativa no momento.
   #98 = Methodref          #77.#99       // ext/mods/Crypta/RandomManager.getActiveZones:()Ljava/util/List;
   #99 = NameAndType        #100:#101     // getActiveZones:()Ljava/util/List;
  #100 = Utf8               getActiveZones
  #101 = Utf8               ()Ljava/util/List;
  #102 = InterfaceMethodref #103.#104     // java/util/List.isEmpty:()Z
  #103 = Class              #105          // java/util/List
  #104 = NameAndType        #106:#14      // isEmpty:()Z
  #105 = Utf8               java/util/List
  #106 = Utf8               isEmpty
  #107 = Methodref          #108.#109     // ext/mods/commons/random/Rnd.get:(Ljava/util/List;)Ljava/lang/Object;
  #108 = Class              #110          // ext/mods/commons/random/Rnd
  #109 = NameAndType        #111:#112     // get:(Ljava/util/List;)Ljava/lang/Object;
  #110 = Utf8               ext/mods/commons/random/Rnd
  #111 = Utf8               get
  #112 = Utf8               (Ljava/util/List;)Ljava/lang/Object;
  #113 = Class              #114          // ext/mods/gameserver/model/zone/type/RandomZone
  #114 = Utf8               ext/mods/gameserver/model/zone/type/RandomZone
  #115 = String             #116          // Erro ao selecionar zona do evento.
  #116 = Utf8               Erro ao selecionar zona do evento.
  #117 = Methodref          #77.#118      // ext/mods/Crypta/RandomManager.getZoneDataForZone:(Lext/mods/gameserver/model/zone/type/RandomZone;)Lext/mods/FarmEventRandom/holder/RandomZoneData;
  #118 = NameAndType        #119:#120     // getZoneDataForZone:(Lext/mods/gameserver/model/zone/type/RandomZone;)Lext/mods/FarmEventRandom/holder/RandomZoneData;
  #119 = Utf8               getZoneDataForZone
  #120 = Utf8               (Lext/mods/gameserver/model/zone/type/RandomZone;)Lext/mods/FarmEventRandom/holder/RandomZoneData;
  #121 = Methodref          #122.#123     // ext/mods/FarmEventRandom/holder/RandomZoneData.getSpawnLocation:()Lext/mods/gameserver/model/location/Location;
  #122 = Class              #124          // ext/mods/FarmEventRandom/holder/RandomZoneData
  #123 = NameAndType        #125:#126     // getSpawnLocation:()Lext/mods/gameserver/model/location/Location;
  #124 = Utf8               ext/mods/FarmEventRandom/holder/RandomZoneData
  #125 = Utf8               getSpawnLocation
  #126 = Utf8               ()Lext/mods/gameserver/model/location/Location;
  #127 = Fieldref           #128.#129     // ext/mods/gameserver/enums/SpawnType.NORMAL:Lext/mods/gameserver/enums/SpawnType;
  #128 = Class              #130          // ext/mods/gameserver/enums/SpawnType
  #129 = NameAndType        #131:#132     // NORMAL:Lext/mods/gameserver/enums/SpawnType;
  #130 = Utf8               ext/mods/gameserver/enums/SpawnType
  #131 = Utf8               NORMAL
  #132 = Utf8               Lext/mods/gameserver/enums/SpawnType;
  #133 = Methodref          #113.#134     // ext/mods/gameserver/model/zone/type/RandomZone.getRndSpawn:(Lext/mods/gameserver/enums/SpawnType;)Lext/mods/gameserver/model/location/Location;
  #134 = NameAndType        #135:#136     // getRndSpawn:(Lext/mods/gameserver/enums/SpawnType;)Lext/mods/gameserver/model/location/Location;
  #135 = Utf8               getRndSpawn
  #136 = Utf8               (Lext/mods/gameserver/enums/SpawnType;)Lext/mods/gameserver/model/location/Location;
  #137 = Methodref          #77.#138      // ext/mods/Crypta/RandomManager.getActiveSpawns:()Ljava/util/List;
  #138 = NameAndType        #139:#101     // getActiveSpawns:()Ljava/util/List;
  #139 = Utf8               getActiveSpawns
  #140 = Class              #141          // java/util/ArrayList
  #141 = Utf8               java/util/ArrayList
  #142 = Methodref          #140.#3       // java/util/ArrayList."<init>":()V
  #143 = InterfaceMethodref #103.#144     // java/util/List.iterator:()Ljava/util/Iterator;
  #144 = NameAndType        #145:#146     // iterator:()Ljava/util/Iterator;
  #145 = Utf8               iterator
  #146 = Utf8               ()Ljava/util/Iterator;
  #147 = InterfaceMethodref #148.#149     // java/util/Iterator.hasNext:()Z
  #148 = Class              #150          // java/util/Iterator
  #149 = NameAndType        #151:#14      // hasNext:()Z
  #150 = Utf8               java/util/Iterator
  #151 = Utf8               hasNext
  #152 = InterfaceMethodref #148.#153     // java/util/Iterator.next:()Ljava/lang/Object;
  #153 = NameAndType        #154:#155     // next:()Ljava/lang/Object;
  #154 = Utf8               next
  #155 = Utf8               ()Ljava/lang/Object;
  #156 = Class              #157          // ext/mods/gameserver/model/spawn/Spawn
  #157 = Utf8               ext/mods/gameserver/model/spawn/Spawn
  #158 = Methodref          #156.#159     // ext/mods/gameserver/model/spawn/Spawn.getNpc:()Lext/mods/gameserver/model/actor/Npc;
  #159 = NameAndType        #160:#161     // getNpc:()Lext/mods/gameserver/model/actor/Npc;
  #160 = Utf8               getNpc
  #161 = Utf8               ()Lext/mods/gameserver/model/actor/Npc;
  #162 = Methodref          #156.#163     // ext/mods/gameserver/model/spawn/Spawn.getSpawnLocation:()Lext/mods/gameserver/model/location/SpawnLocation;
  #163 = NameAndType        #125:#164     // getSpawnLocation:()Lext/mods/gameserver/model/location/SpawnLocation;
  #164 = Utf8               ()Lext/mods/gameserver/model/location/SpawnLocation;
  #165 = Methodref          #166.#167     // ext/mods/gameserver/model/location/SpawnLocation.getX:()I
  #166 = Class              #168          // ext/mods/gameserver/model/location/SpawnLocation
  #167 = NameAndType        #169:#170     // getX:()I
  #168 = Utf8               ext/mods/gameserver/model/location/SpawnLocation
  #169 = Utf8               getX
  #170 = Utf8               ()I
  #171 = Methodref          #166.#172     // ext/mods/gameserver/model/location/SpawnLocation.getY:()I
  #172 = NameAndType        #173:#170     // getY:()I
  #173 = Utf8               getY
  #174 = Methodref          #166.#175     // ext/mods/gameserver/model/location/SpawnLocation.getZ:()I
  #175 = NameAndType        #176:#170     // getZ:()I
  #176 = Utf8               getZ
  #177 = Methodref          #113.#178     // ext/mods/gameserver/model/zone/type/RandomZone.isInsideZone:(III)Z
  #178 = NameAndType        #69:#179      // isInsideZone:(III)Z
  #179 = Utf8               (III)Z
  #180 = InterfaceMethodref #103.#181     // java/util/List.add:(Ljava/lang/Object;)Z
  #181 = NameAndType        #182:#183     // add:(Ljava/lang/Object;)Z
  #182 = Utf8               add
  #183 = Utf8               (Ljava/lang/Object;)Z
  #184 = Class              #185          // ext/mods/gameserver/model/location/Location
  #185 = Utf8               ext/mods/gameserver/model/location/Location
  #186 = Methodref          #7.#167       // ext/mods/gameserver/model/actor/Npc.getX:()I
  #187 = Methodref          #7.#172       // ext/mods/gameserver/model/actor/Npc.getY:()I
  #188 = Methodref          #7.#175       // ext/mods/gameserver/model/actor/Npc.getZ:()I
  #189 = Methodref          #184.#190     // ext/mods/gameserver/model/location/Location."<init>":(III)V
  #190 = NameAndType        #5:#191       // "<init>":(III)V
  #191 = Utf8               (III)V
  #192 = Methodref          #113.#193     // ext/mods/gameserver/model/zone/type/RandomZone.getReturnLocation:()Lext/mods/gameserver/model/location/Location;
  #193 = NameAndType        #194:#126     // getReturnLocation:()Lext/mods/gameserver/model/location/Location;
  #194 = Utf8               getReturnLocation
  #195 = Methodref          #184.#167     // ext/mods/gameserver/model/location/Location.getX:()I
  #196 = Methodref          #184.#172     // ext/mods/gameserver/model/location/Location.getY:()I
  #197 = String             #198          // Não foi possível encontrar um ponto de teleporte na Farm Zone.
  #198 = Utf8               Não foi possível encontrar um ponto de teleporte na Farm Zone.
  #199 = Class              #200          // ext/mods/gameserver/network/serverpackets/MagicSkillUse
  #200 = Utf8               ext/mods/gameserver/network/serverpackets/MagicSkillUse
  #201 = Class              #202          // ext/mods/gameserver/handler/bypasshandlers/FarmZoneTeleportBypass
  #202 = Utf8               ext/mods/gameserver/handler/bypasshandlers/FarmZoneTeleportBypass
  #203 = Methodref          #199.#204     // ext/mods/gameserver/network/serverpackets/MagicSkillUse."<init>":(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;IIII)V
  #204 = NameAndType        #5:#205       // "<init>":(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;IIII)V
  #205 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;IIII)V
  #206 = Methodref          #10.#207      // ext/mods/gameserver/model/actor/Player.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #207 = NameAndType        #208:#30      // broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #208 = Utf8               broadcastPacket
  #209 = Class              #210          // ext/mods/gameserver/network/serverpackets/SetupGauge
  #210 = Utf8               ext/mods/gameserver/network/serverpackets/SetupGauge
  #211 = Fieldref           #212.#213     // ext/mods/gameserver/enums/GaugeColor.BLUE:Lext/mods/gameserver/enums/GaugeColor;
  #212 = Class              #214          // ext/mods/gameserver/enums/GaugeColor
  #213 = NameAndType        #215:#216     // BLUE:Lext/mods/gameserver/enums/GaugeColor;
  #214 = Utf8               ext/mods/gameserver/enums/GaugeColor
  #215 = Utf8               BLUE
  #216 = Utf8               Lext/mods/gameserver/enums/GaugeColor;
  #217 = Methodref          #209.#218     // ext/mods/gameserver/network/serverpackets/SetupGauge."<init>":(Lext/mods/gameserver/enums/GaugeColor;I)V
  #218 = NameAndType        #5:#219       // "<init>":(Lext/mods/gameserver/enums/GaugeColor;I)V
  #219 = Utf8               (Lext/mods/gameserver/enums/GaugeColor;I)V
  #220 = InvokeDynamic      #0:#221       // #0:run:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/location/Location;)Ljava/lang/Runnable;
  #221 = NameAndType        #222:#223     // run:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/location/Location;)Ljava/lang/Runnable;
  #222 = Utf8               run
  #223 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/location/Location;)Ljava/lang/Runnable;
  #224 = Long               5000l
  #226 = Methodref          #227.#228     // ext/mods/commons/pool/ThreadPool.schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
  #227 = Class              #229          // ext/mods/commons/pool/ThreadPool
  #228 = NameAndType        #230:#231     // schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
  #229 = Utf8               ext/mods/commons/pool/ThreadPool
  #230 = Utf8               schedule
  #231 = Utf8               (Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
  #232 = Fieldref           #201.#233     // ext/mods/gameserver/handler/bypasshandlers/FarmZoneTeleportBypass.COMMANDS:[Ljava/lang/String;
  #233 = NameAndType        #234:#235     // COMMANDS:[Ljava/lang/String;
  #234 = Utf8               COMMANDS
  #235 = Utf8               [Ljava/lang/String;
  #236 = Methodref          #10.#237      // ext/mods/gameserver/model/actor/Player.teleToLocation:(Lext/mods/gameserver/model/location/Location;)V
  #237 = NameAndType        #238:#239     // teleToLocation:(Lext/mods/gameserver/model/location/Location;)V
  #238 = Utf8               teleToLocation
  #239 = Utf8               (Lext/mods/gameserver/model/location/Location;)V
  #240 = Class              #241          // java/lang/String
  #241 = Utf8               java/lang/String
  #242 = String             #243          // farm_teleport
  #243 = Utf8               farm_teleport
  #244 = String             #245          // farmzone
  #245 = Utf8               farmzone
  #246 = Class              #247          // ext/mods/gameserver/handler/IBypassHandler
  #247 = Utf8               ext/mods/gameserver/handler/IBypassHandler
  #248 = Utf8               SOE_VISUAL_SKILL_ID
  #249 = Utf8               I
  #250 = Utf8               ConstantValue
  #251 = Integer            2036
  #252 = Utf8               SOE_VISUAL_SKILL_LEVEL
  #253 = Integer            1
  #254 = Utf8               CAST_TIME_MS
  #255 = Integer            5000
  #256 = Utf8               Code
  #257 = Utf8               LineNumberTable
  #258 = Utf8               LocalVariableTable
  #259 = Utf8               this
  #260 = Utf8               Lext/mods/gameserver/handler/bypasshandlers/FarmZoneTeleportBypass;
  #261 = Utf8               useBypass
  #262 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Creature;)Z
  #263 = Utf8               spawnLoc
  #264 = Utf8               Lext/mods/gameserver/model/location/SpawnLocation;
  #265 = Utf8               spawn
  #266 = Utf8               Lext/mods/gameserver/model/spawn/Spawn;
  #267 = Utf8               selectedSpawn
  #268 = Utf8               zoneSpawns
  #269 = Utf8               Ljava/util/List;
  #270 = Utf8               activeSpawns
  #271 = Utf8               returnLoc
  #272 = Utf8               Lext/mods/gameserver/model/location/Location;
  #273 = Utf8               command
  #274 = Utf8               Ljava/lang/String;
  #275 = Utf8               player
  #276 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #277 = Utf8               target
  #278 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #279 = Utf8               randomManager
  #280 = Utf8               Ljava/lang/Object;
  #281 = Utf8               isRunning
  #282 = Utf8               Ljava/lang/Boolean;
  #283 = Utf8               activeZones
  #284 = Utf8               targetZone
  #285 = Utf8               Lext/mods/gameserver/model/zone/type/RandomZone;
  #286 = Utf8               loc
  #287 = Utf8               zoneData
  #288 = Utf8               Lext/mods/FarmEventRandom/holder/RandomZoneData;
  #289 = Utf8               finalLoc
  #290 = Utf8               LocalVariableTypeTable
  #291 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/spawn/Spawn;>;
  #292 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/zone/type/RandomZone;>;
  #293 = Utf8               StackMapTable
  #294 = Utf8               getBypassList
  #295 = Utf8               ()[Ljava/lang/String;
  #296 = Utf8               lambda$useBypass$0
  #297 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/location/Location;)V
  #298 = Utf8               <clinit>
  #299 = Utf8               SourceFile
  #300 = Utf8               FarmZoneTeleportBypass.java
  #301 = Utf8               BootstrapMethods
  #302 = MethodType         #6            //  ()V
  #303 = MethodHandle       6:#304        // REF_invokeStatic ext/mods/gameserver/handler/bypasshandlers/FarmZoneTeleportBypass.lambda$useBypass$0:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/location/Location;)V
  #304 = Methodref          #201.#305     // ext/mods/gameserver/handler/bypasshandlers/FarmZoneTeleportBypass.lambda$useBypass$0:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/location/Location;)V
  #305 = NameAndType        #296:#297     // lambda$useBypass$0:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/location/Location;)V
  #306 = MethodHandle       6:#307        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #307 = Methodref          #308.#309     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #308 = Class              #310          // java/lang/invoke/LambdaMetafactory
  #309 = NameAndType        #311:#312     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #310 = Utf8               java/lang/invoke/LambdaMetafactory
  #311 = Utf8               metafactory
  #312 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #313 = Utf8               InnerClasses
  #314 = Class              #315          // java/lang/invoke/MethodHandles$Lookup
  #315 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #316 = Class              #317          // java/lang/invoke/MethodHandles
  #317 = Utf8               java/lang/invoke/MethodHandles
  #318 = Utf8               Lookup
{
  public ext.mods.gameserver.handler.bypasshandlers.FarmZoneTeleportBypass();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 39: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/handler/bypasshandlers/FarmZoneTeleportBypass;

  public boolean useBypass(java.lang.String, ext.mods.gameserver.model.actor.Player, ext.mods.gameserver.model.actor.Creature);
    descriptor: (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Creature;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=9, locals=15, args_size=4
         0: aload_3
         1: instanceof    #7                  // class ext/mods/gameserver/model/actor/Npc
         4: ifne          9
         7: iconst_0
         8: ireturn
         9: aload_2
        10: invokevirtual #9                  // Method ext/mods/gameserver/model/actor/Player.isDead:()Z
        13: ifeq          31
        16: aload_2
        17: ldc           #15                 // String Você não pode usar este comando enquanto está morto.
        19: invokevirtual #17                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
        22: aload_2
        23: getstatic     #21                 // Field ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
        26: invokevirtual #27                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        29: iconst_1
        30: ireturn
        31: aload_2
        32: invokevirtual #31                 // Method ext/mods/gameserver/model/actor/Player.isInOlympiadMode:()Z
        35: ifeq          53
        38: aload_2
        39: ldc           #34                 // String Você não pode usar este comando durante as Olimpíadas.
        41: invokevirtual #17                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
        44: aload_2
        45: getstatic     #21                 // Field ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
        48: invokevirtual #27                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        51: iconst_1
        52: ireturn
        53: aload_2
        54: invokevirtual #36                 // Method ext/mods/gameserver/model/actor/Player.getDungeon:()Lext/mods/dungeon/Dungeon;
        57: ifnull        75
        60: aload_2
        61: ldc           #40                 // String Você não pode usar este comando dentro de uma dungeon.
        63: invokevirtual #17                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
        66: aload_2
        67: getstatic     #21                 // Field ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
        70: invokevirtual #27                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        73: iconst_1
        74: ireturn
        75: aload_2
        76: invokevirtual #42                 // Method ext/mods/gameserver/model/actor/Player.isInCombat:()Z
        79: ifeq          97
        82: aload_2
        83: ldc           #45                 // String Você não pode usar este comando em combate.
        85: invokevirtual #17                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
        88: aload_2
        89: getstatic     #21                 // Field ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
        92: invokevirtual #27                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        95: iconst_1
        96: ireturn
        97: aload_2
        98: invokevirtual #47                 // Method ext/mods/gameserver/model/actor/Player.getCast:()Lext/mods/gameserver/model/actor/cast/PlayerCast;
       101: invokevirtual #51                 // Method ext/mods/gameserver/model/actor/cast/PlayerCast.isCastingNow:()Z
       104: ifne          114
       107: aload_2
       108: invokevirtual #56                 // Method ext/mods/gameserver/model/actor/Player.isTeleporting:()Z
       111: ifeq          129
       114: aload_2
       115: ldc           #59                 // String Aguarde sua ação atual terminar.
       117: invokevirtual #17                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       120: aload_2
       121: getstatic     #21                 // Field ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
       124: invokevirtual #27                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       127: iconst_1
       128: ireturn
       129: aload_2
       130: getstatic     #61                 // Field ext/mods/gameserver/enums/ZoneId.PVP:Lext/mods/gameserver/enums/ZoneId;
       133: invokevirtual #67                 // Method ext/mods/gameserver/model/actor/Player.isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
       136: ifne          149
       139: aload_2
       140: getstatic     #71                 // Field ext/mods/gameserver/enums/ZoneId.SIEGE:Lext/mods/gameserver/enums/ZoneId;
       143: invokevirtual #67                 // Method ext/mods/gameserver/model/actor/Player.isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
       146: ifeq          164
       149: aload_2
       150: ldc           #74                 // String Você não pode usar este comando desta área.
       152: invokevirtual #17                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       155: aload_2
       156: getstatic     #21                 // Field ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
       159: invokevirtual #27                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       162: iconst_1
       163: ireturn
       164: invokestatic  #76                 // Method ext/mods/Crypta/RandomManager.getInstance:()Lext/mods/Crypta/RandomManager;
       167: astore        4
       169: aload         4
       171: ifnonnull     189
       174: aload_2
       175: ldc           #82                 // String Sistema de eventos não disponível.
       177: invokevirtual #17                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       180: aload_2
       181: getstatic     #21                 // Field ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
       184: invokevirtual #27                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       187: iconst_1
       188: ireturn
       189: invokestatic  #76                 // Method ext/mods/Crypta/RandomManager.getInstance:()Lext/mods/Crypta/RandomManager;
       192: invokevirtual #84                 // Method ext/mods/Crypta/RandomManager.isEventRunning:()Z
       195: invokestatic  #87                 // Method java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
       198: astore        5
       200: aload         5
       202: ifnull        213
       205: aload         5
       207: invokevirtual #93                 // Method java/lang/Boolean.booleanValue:()Z
       210: ifne          228
       213: aload_2
       214: ldc           #96                 // String Nenhuma Farm Zone ativa no momento.
       216: invokevirtual #17                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       219: aload_2
       220: getstatic     #21                 // Field ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
       223: invokevirtual #27                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       226: iconst_1
       227: ireturn
       228: invokestatic  #76                 // Method ext/mods/Crypta/RandomManager.getInstance:()Lext/mods/Crypta/RandomManager;
       231: invokevirtual #98                 // Method ext/mods/Crypta/RandomManager.getActiveZones:()Ljava/util/List;
       234: astore        6
       236: aload         6
       238: ifnull        251
       241: aload         6
       243: invokeinterface #102,  1          // InterfaceMethod java/util/List.isEmpty:()Z
       248: ifeq          266
       251: aload_2
       252: ldc           #96                 // String Nenhuma Farm Zone ativa no momento.
       254: invokevirtual #17                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       257: aload_2
       258: getstatic     #21                 // Field ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
       261: invokevirtual #27                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       264: iconst_1
       265: ireturn
       266: aload         6
       268: invokestatic  #107                // Method ext/mods/commons/random/Rnd.get:(Ljava/util/List;)Ljava/lang/Object;
       271: checkcast     #113                // class ext/mods/gameserver/model/zone/type/RandomZone
       274: astore        7
       276: aload         7
       278: ifnonnull     296
       281: aload_2
       282: ldc           #115                // String Erro ao selecionar zona do evento.
       284: invokevirtual #17                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       287: aload_2
       288: getstatic     #21                 // Field ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
       291: invokevirtual #27                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       294: iconst_1
       295: ireturn
       296: aconst_null
       297: astore        8
       299: invokestatic  #76                 // Method ext/mods/Crypta/RandomManager.getInstance:()Lext/mods/Crypta/RandomManager;
       302: aload         7
       304: invokevirtual #117                // Method ext/mods/Crypta/RandomManager.getZoneDataForZone:(Lext/mods/gameserver/model/zone/type/RandomZone;)Lext/mods/FarmEventRandom/holder/RandomZoneData;
       307: astore        9
       309: aload         9
       311: ifnull        329
       314: aload         9
       316: invokevirtual #121                // Method ext/mods/FarmEventRandom/holder/RandomZoneData.getSpawnLocation:()Lext/mods/gameserver/model/location/Location;
       319: ifnull        329
       322: aload         9
       324: invokevirtual #121                // Method ext/mods/FarmEventRandom/holder/RandomZoneData.getSpawnLocation:()Lext/mods/gameserver/model/location/Location;
       327: astore        8
       329: aload         8
       331: ifnonnull     344
       334: aload         7
       336: getstatic     #127                // Field ext/mods/gameserver/enums/SpawnType.NORMAL:Lext/mods/gameserver/enums/SpawnType;
       339: invokevirtual #133                // Method ext/mods/gameserver/model/zone/type/RandomZone.getRndSpawn:(Lext/mods/gameserver/enums/SpawnType;)Lext/mods/gameserver/model/location/Location;
       342: astore        8
       344: aload         8
       346: ifnonnull     539
       349: invokestatic  #76                 // Method ext/mods/Crypta/RandomManager.getInstance:()Lext/mods/Crypta/RandomManager;
       352: invokevirtual #137                // Method ext/mods/Crypta/RandomManager.getActiveSpawns:()Ljava/util/List;
       355: astore        10
       357: aload         10
       359: ifnull        539
       362: aload         10
       364: invokeinterface #102,  1          // InterfaceMethod java/util/List.isEmpty:()Z
       369: ifne          539
       372: new           #140                // class java/util/ArrayList
       375: dup
       376: invokespecial #142                // Method java/util/ArrayList."<init>":()V
       379: astore        11
       381: aload         10
       383: invokeinterface #143,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
       388: astore        12
       390: aload         12
       392: invokeinterface #147,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       397: ifeq          473
       400: aload         12
       402: invokeinterface #152,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       407: checkcast     #156                // class ext/mods/gameserver/model/spawn/Spawn
       410: astore        13
       412: aload         13
       414: ifnull        470
       417: aload         13
       419: invokevirtual #158                // Method ext/mods/gameserver/model/spawn/Spawn.getNpc:()Lext/mods/gameserver/model/actor/Npc;
       422: ifnull        470
       425: aload         13
       427: invokevirtual #162                // Method ext/mods/gameserver/model/spawn/Spawn.getSpawnLocation:()Lext/mods/gameserver/model/location/SpawnLocation;
       430: astore        14
       432: aload         14
       434: ifnull        470
       437: aload         7
       439: aload         14
       441: invokevirtual #165                // Method ext/mods/gameserver/model/location/SpawnLocation.getX:()I
       444: aload         14
       446: invokevirtual #171                // Method ext/mods/gameserver/model/location/SpawnLocation.getY:()I
       449: aload         14
       451: invokevirtual #174                // Method ext/mods/gameserver/model/location/SpawnLocation.getZ:()I
       454: invokevirtual #177                // Method ext/mods/gameserver/model/zone/type/RandomZone.isInsideZone:(III)Z
       457: ifeq          470
       460: aload         11
       462: aload         13
       464: invokeinterface #180,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       469: pop
       470: goto          390
       473: aload         11
       475: invokeinterface #102,  1          // InterfaceMethod java/util/List.isEmpty:()Z
       480: ifne          539
       483: aload         11
       485: invokestatic  #107                // Method ext/mods/commons/random/Rnd.get:(Ljava/util/List;)Ljava/lang/Object;
       488: checkcast     #156                // class ext/mods/gameserver/model/spawn/Spawn
       491: astore        12
       493: aload         12
       495: ifnull        539
       498: aload         12
       500: invokevirtual #158                // Method ext/mods/gameserver/model/spawn/Spawn.getNpc:()Lext/mods/gameserver/model/actor/Npc;
       503: ifnull        539
       506: new           #184                // class ext/mods/gameserver/model/location/Location
       509: dup
       510: aload         12
       512: invokevirtual #158                // Method ext/mods/gameserver/model/spawn/Spawn.getNpc:()Lext/mods/gameserver/model/actor/Npc;
       515: invokevirtual #186                // Method ext/mods/gameserver/model/actor/Npc.getX:()I
       518: aload         12
       520: invokevirtual #158                // Method ext/mods/gameserver/model/spawn/Spawn.getNpc:()Lext/mods/gameserver/model/actor/Npc;
       523: invokevirtual #187                // Method ext/mods/gameserver/model/actor/Npc.getY:()I
       526: aload         12
       528: invokevirtual #158                // Method ext/mods/gameserver/model/spawn/Spawn.getNpc:()Lext/mods/gameserver/model/actor/Npc;
       531: invokevirtual #188                // Method ext/mods/gameserver/model/actor/Npc.getZ:()I
       534: invokespecial #189                // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
       537: astore        8
       539: aload         8
       541: ifnonnull     576
       544: aload         7
       546: invokevirtual #192                // Method ext/mods/gameserver/model/zone/type/RandomZone.getReturnLocation:()Lext/mods/gameserver/model/location/Location;
       549: astore        10
       551: aload         10
       553: ifnull        576
       556: aload         10
       558: invokevirtual #195                // Method ext/mods/gameserver/model/location/Location.getX:()I
       561: ifeq          576
       564: aload         10
       566: invokevirtual #196                // Method ext/mods/gameserver/model/location/Location.getY:()I
       569: ifeq          576
       572: aload         10
       574: astore        8
       576: aload         8
       578: ifnonnull     596
       581: aload_2
       582: ldc           #197                // String Não foi possível encontrar um ponto de teleporte na Farm Zone.
       584: invokevirtual #17                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       587: aload_2
       588: getstatic     #21                 // Field ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
       591: invokevirtual #27                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       594: iconst_1
       595: ireturn
       596: aload         8
       598: astore        10
       600: aload_2
       601: new           #199                // class ext/mods/gameserver/network/serverpackets/MagicSkillUse
       604: dup
       605: aload_2
       606: aload_2
       607: sipush        2036
       610: iconst_1
       611: sipush        5000
       614: iconst_0
       615: invokespecial #203                // Method ext/mods/gameserver/network/serverpackets/MagicSkillUse."<init>":(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;IIII)V
       618: invokevirtual #206                // Method ext/mods/gameserver/model/actor/Player.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       621: aload_2
       622: new           #209                // class ext/mods/gameserver/network/serverpackets/SetupGauge
       625: dup
       626: getstatic     #211                // Field ext/mods/gameserver/enums/GaugeColor.BLUE:Lext/mods/gameserver/enums/GaugeColor;
       629: sipush        5000
       632: invokespecial #217                // Method ext/mods/gameserver/network/serverpackets/SetupGauge."<init>":(Lext/mods/gameserver/enums/GaugeColor;I)V
       635: invokevirtual #27                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       638: aload_2
       639: aload         10
       641: invokedynamic #220,  0            // InvokeDynamic #0:run:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/location/Location;)Ljava/lang/Runnable;
       646: ldc2_w        #224                // long 5000l
       649: invokestatic  #226                // Method ext/mods/commons/pool/ThreadPool.schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
       652: pop
       653: iconst_1
       654: ireturn
      LineNumberTable:
        line 49: 0
        line 50: 7
        line 52: 9
        line 54: 16
        line 55: 22
        line 56: 29
        line 59: 31
        line 61: 38
        line 62: 44
        line 63: 51
        line 66: 53
        line 68: 60
        line 69: 66
        line 70: 73
        line 73: 75
        line 75: 82
        line 76: 88
        line 77: 95
        line 80: 97
        line 82: 114
        line 83: 120
        line 84: 127
        line 87: 129
        line 89: 149
        line 90: 155
        line 91: 162
        line 94: 164
        line 95: 169
        line 97: 174
        line 98: 180
        line 99: 187
        line 102: 189
        line 103: 200
        line 105: 213
        line 106: 219
        line 107: 226
        line 111: 228
        line 113: 236
        line 115: 251
        line 116: 257
        line 117: 264
        line 120: 266
        line 121: 276
        line 123: 281
        line 124: 287
        line 125: 294
        line 128: 296
        line 129: 299
        line 130: 309
        line 132: 322
        line 135: 329
        line 137: 334
        line 140: 344
        line 143: 349
        line 145: 357
        line 147: 372
        line 148: 381
        line 150: 412
        line 152: 425
        line 153: 432
        line 155: 460
        line 158: 470
        line 160: 473
        line 162: 483
        line 163: 493
        line 165: 506
        line 171: 539
        line 173: 544
        line 174: 551
        line 176: 572
        line 180: 576
        line 182: 581
        line 183: 587
        line 184: 594
        line 187: 596
        line 189: 600
        line 190: 621
        line 192: 638
        line 199: 653
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          432      38    14 spawnLoc   Lext/mods/gameserver/model/location/SpawnLocation;
          412      58    13 spawn   Lext/mods/gameserver/model/spawn/Spawn;
          493      46    12 selectedSpawn   Lext/mods/gameserver/model/spawn/Spawn;
          381     158    11 zoneSpawns   Ljava/util/List;
          357     182    10 activeSpawns   Ljava/util/List;
          551      25    10 returnLoc   Lext/mods/gameserver/model/location/Location;
            0     655     0  this   Lext/mods/gameserver/handler/bypasshandlers/FarmZoneTeleportBypass;
            0     655     1 command   Ljava/lang/String;
            0     655     2 player   Lext/mods/gameserver/model/actor/Player;
            0     655     3 target   Lext/mods/gameserver/model/actor/Creature;
          169     486     4 randomManager   Ljava/lang/Object;
          200     455     5 isRunning   Ljava/lang/Boolean;
          236     419     6 activeZones   Ljava/util/List;
          276     379     7 targetZone   Lext/mods/gameserver/model/zone/type/RandomZone;
          299     356     8   loc   Lext/mods/gameserver/model/location/Location;
          309     346     9 zoneData   Lext/mods/FarmEventRandom/holder/RandomZoneData;
          600      55    10 finalLoc   Lext/mods/gameserver/model/location/Location;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
          381     158    11 zoneSpawns   Ljava/util/List<Lext/mods/gameserver/model/spawn/Spawn;>;
          357     182    10 activeSpawns   Ljava/util/List<Lext/mods/gameserver/model/spawn/Spawn;>;
          236     419     6 activeZones   Ljava/util/List<Lext/mods/gameserver/model/zone/type/RandomZone;>;
      StackMapTable: number_of_entries = 23
        frame_type = 9 /* same */
        frame_type = 21 /* same */
        frame_type = 21 /* same */
        frame_type = 21 /* same */
        frame_type = 21 /* same */
        frame_type = 16 /* same */
        frame_type = 14 /* same */
        frame_type = 19 /* same */
        frame_type = 14 /* same */
        frame_type = 252 /* append */
          offset_delta = 24
          locals = [ class java/lang/Object ]
        frame_type = 252 /* append */
          offset_delta = 23
          locals = [ class java/lang/Boolean ]
        frame_type = 14 /* same */
        frame_type = 252 /* append */
          offset_delta = 22
          locals = [ class java/util/List ]
        frame_type = 14 /* same */
        frame_type = 252 /* append */
          offset_delta = 29
          locals = [ class ext/mods/gameserver/model/zone/type/RandomZone ]
        frame_type = 253 /* append */
          offset_delta = 32
          locals = [ class ext/mods/gameserver/model/location/Location, class ext/mods/FarmEventRandom/holder/RandomZoneData ]
        frame_type = 14 /* same */
        frame_type = 254 /* append */
          offset_delta = 45
          locals = [ class java/util/List, class java/util/List, class java/util/Iterator ]
        frame_type = 251 /* same_frame_extended */
          offset_delta = 79
        frame_type = 250 /* chop */
          offset_delta = 2
        frame_type = 249 /* chop */
          offset_delta = 65
        frame_type = 36 /* same */
        frame_type = 19 /* same */

  public java.lang.String[] getBypassList();
    descriptor: ()[Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #232                // Field COMMANDS:[Ljava/lang/String;
         3: areturn
      LineNumberTable:
        line 205: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/handler/bypasshandlers/FarmZoneTeleportBypass;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: iconst_2
         1: anewarray     #240                // class java/lang/String
         4: dup
         5: iconst_0
         6: ldc           #242                // String farm_teleport
         8: aastore
         9: dup
        10: iconst_1
        11: ldc           #244                // String farmzone
        13: aastore
        14: putstatic     #232                // Field COMMANDS:[Ljava/lang/String;
        17: return
      LineNumberTable:
        line 41: 0
}
SourceFile: "FarmZoneTeleportBypass.java"
BootstrapMethods:
  0: #306 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #302 ()V
      #303 REF_invokeStatic ext/mods/gameserver/handler/bypasshandlers/FarmZoneTeleportBypass.lambda$useBypass$0:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/location/Location;)V
      #302 ()V
InnerClasses:
  public static final #318= #314 of #316; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
