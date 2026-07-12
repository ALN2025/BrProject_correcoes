// Bytecode for: ext.mods.gameserver.model.World
// File: ext\mods\gameserver\model\World.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/World.class
  Last modified 9 de jul de 2026; size 14091 bytes
  MD5 checksum a716a7c098678d5491f3d7177ba50180
  Compiled from "World.java"
public final class ext.mods.gameserver.model.World
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #1                          // ext/mods/gameserver/model/World
  super_class: #4                         // java/lang/Object
  interfaces: 0, fields: 23, methods: 39, attributes: 4
Constant pool:
    #1 = Class              #2            // ext/mods/gameserver/model/World
    #2 = Utf8               ext/mods/gameserver/model/World
    #3 = Methodref          #4.#5         // java/lang/Object."<init>":()V
    #4 = Class              #6            // java/lang/Object
    #5 = NameAndType        #7:#8         // "<init>":()V
    #6 = Utf8               java/lang/Object
    #7 = Utf8               <init>
    #8 = Utf8               ()V
    #9 = Fieldref           #1.#10        // ext/mods/gameserver/model/World.MAX_CONNECTED_COUNT:I
   #10 = NameAndType        #11:#12       // MAX_CONNECTED_COUNT:I
   #11 = Utf8               MAX_CONNECTED_COUNT
   #12 = Utf8               I
   #13 = Fieldref           #1.#14        // ext/mods/gameserver/model/World.OFFLINE_TRADE_COUNT:I
   #14 = NameAndType        #15:#12       // OFFLINE_TRADE_COUNT:I
   #15 = Utf8               OFFLINE_TRADE_COUNT
   #16 = Class              #17           // java/util/concurrent/ConcurrentHashMap
   #17 = Utf8               java/util/concurrent/ConcurrentHashMap
   #18 = Methodref          #16.#5        // java/util/concurrent/ConcurrentHashMap."<init>":()V
   #19 = Fieldref           #1.#20        // ext/mods/gameserver/model/World._objects:Ljava/util/Map;
   #20 = NameAndType        #21:#22       // _objects:Ljava/util/Map;
   #21 = Utf8               _objects
   #22 = Utf8               Ljava/util/Map;
   #23 = Fieldref           #1.#24        // ext/mods/gameserver/model/World._pets:Ljava/util/Map;
   #24 = NameAndType        #25:#22       // _pets:Ljava/util/Map;
   #25 = Utf8               _pets
   #26 = Fieldref           #1.#27        // ext/mods/gameserver/model/World._players:Ljava/util/Map;
   #27 = NameAndType        #28:#22       // _players:Ljava/util/Map;
   #28 = Utf8               _players
   #29 = Class              #30           // "[[Lext/mods/gameserver/model/WorldRegion;"
   #30 = Utf8               [[Lext/mods/gameserver/model/WorldRegion;
   #31 = Fieldref           #1.#32        // ext/mods/gameserver/model/World._worldRegions:[[Lext/mods/gameserver/model/WorldRegion;
   #32 = NameAndType        #33:#30       // _worldRegions:[[Lext/mods/gameserver/model/WorldRegion;
   #33 = Utf8               _worldRegions
   #34 = Class              #35           // ext/mods/gameserver/model/WorldRegion
   #35 = Utf8               ext/mods/gameserver/model/WorldRegion
   #36 = Methodref          #34.#37       // ext/mods/gameserver/model/WorldRegion."<init>":(II)V
   #37 = NameAndType        #7:#38        // "<init>":(II)V
   #38 = Utf8               (II)V
   #39 = Fieldref           #1.#40        // ext/mods/gameserver/model/World.LOGGER:Lext/mods/commons/logging/CLogger;
   #40 = NameAndType        #41:#42       // LOGGER:Lext/mods/commons/logging/CLogger;
   #41 = Utf8               LOGGER
   #42 = Utf8               Lext/mods/commons/logging/CLogger;
   #43 = String             #44           // World grid ({} by {}) is now set up.
   #44 = Utf8               World grid ({} by {}) is now set up.
   #45 = Methodref          #46.#47       // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
   #46 = Class              #48           // java/lang/Integer
   #47 = NameAndType        #49:#50       // valueOf:(I)Ljava/lang/Integer;
   #48 = Utf8               java/lang/Integer
   #49 = Utf8               valueOf
   #50 = Utf8               (I)Ljava/lang/Integer;
   #51 = Methodref          #52.#53       // ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
   #52 = Class              #54           // ext/mods/commons/logging/CLogger
   #53 = NameAndType        #55:#56       // info:(Ljava/lang/Object;[Ljava/lang/Object;)V
   #54 = Utf8               ext/mods/commons/logging/CLogger
   #55 = Utf8               info
   #56 = Utf8               (Ljava/lang/Object;[Ljava/lang/Object;)V
   #57 = Methodref          #58.#59       // ext/mods/gameserver/model/WorldObject.getObjectId:()I
   #58 = Class              #60           // ext/mods/gameserver/model/WorldObject
   #59 = NameAndType        #61:#62       // getObjectId:()I
   #60 = Utf8               ext/mods/gameserver/model/WorldObject
   #61 = Utf8               getObjectId
   #62 = Utf8               ()I
   #63 = InterfaceMethodref #64.#65       // java/util/Map.putIfAbsent:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #64 = Class              #66           // java/util/Map
   #65 = NameAndType        #67:#68       // putIfAbsent:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #66 = Utf8               java/util/Map
   #67 = Utf8               putIfAbsent
   #68 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #69 = InterfaceMethodref #64.#70       // java/util/Map.remove:(Ljava/lang/Object;)Ljava/lang/Object;
   #70 = NameAndType        #71:#72       // remove:(Ljava/lang/Object;)Ljava/lang/Object;
   #71 = Utf8               remove
   #72 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
   #73 = InterfaceMethodref #74.#75       // java/util/Set.isEmpty:()Z
   #74 = Class              #76           // java/util/Set
   #75 = NameAndType        #77:#78       // isEmpty:()Z
   #76 = Utf8               java/util/Set
   #77 = Utf8               isEmpty
   #78 = Utf8               ()Z
   #79 = InterfaceMethodref #64.#80       // java/util/Map.keySet:()Ljava/util/Set;
   #80 = NameAndType        #81:#82       // keySet:()Ljava/util/Set;
   #81 = Utf8               keySet
   #82 = Utf8               ()Ljava/util/Set;
   #83 = InterfaceMethodref #74.#84       // java/util/Set.stream:()Ljava/util/stream/Stream;
   #84 = NameAndType        #85:#86       // stream:()Ljava/util/stream/Stream;
   #85 = Utf8               stream
   #86 = Utf8               ()Ljava/util/stream/Stream;
   #87 = InvokeDynamic      #0:#88        // #0:apply:()Ljava/util/function/Function;
   #88 = NameAndType        #89:#90       // apply:()Ljava/util/function/Function;
   #89 = Utf8               apply
   #90 = Utf8               ()Ljava/util/function/Function;
   #91 = InterfaceMethodref #92.#93       // java/util/stream/Stream.map:(Ljava/util/function/Function;)Ljava/util/stream/Stream;
   #92 = Class              #94           // java/util/stream/Stream
   #93 = NameAndType        #95:#96       // map:(Ljava/util/function/Function;)Ljava/util/stream/Stream;
   #94 = Utf8               java/util/stream/Stream
   #95 = Utf8               map
   #96 = Utf8               (Ljava/util/function/Function;)Ljava/util/stream/Stream;
   #97 = InterfaceMethodref #92.#98       // java/util/stream/Stream.toList:()Ljava/util/List;
   #98 = NameAndType        #99:#100      // toList:()Ljava/util/List;
   #99 = Utf8               toList
  #100 = Utf8               ()Ljava/util/List;
  #101 = InterfaceMethodref #74.#102      // java/util/Set.removeAll:(Ljava/util/Collection;)Z
  #102 = NameAndType        #103:#104     // removeAll:(Ljava/util/Collection;)Z
  #103 = Utf8               removeAll
  #104 = Utf8               (Ljava/util/Collection;)Z
  #105 = InterfaceMethodref #64.#106      // java/util/Map.values:()Ljava/util/Collection;
  #106 = NameAndType        #107:#108     // values:()Ljava/util/Collection;
  #107 = Utf8               values
  #108 = Utf8               ()Ljava/util/Collection;
  #109 = InterfaceMethodref #64.#110      // java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
  #110 = NameAndType        #111:#72      // get:(Ljava/lang/Object;)Ljava/lang/Object;
  #111 = Utf8               get
  #112 = InterfaceMethodref #113.#84      // java/util/Collection.stream:()Ljava/util/stream/Stream;
  #113 = Class              #114          // java/util/Collection
  #114 = Utf8               java/util/Collection
  #115 = InvokeDynamic      #1:#116       // #1:test:(I)Ljava/util/function/Predicate;
  #116 = NameAndType        #117:#118     // test:(I)Ljava/util/function/Predicate;
  #117 = Utf8               test
  #118 = Utf8               (I)Ljava/util/function/Predicate;
  #119 = InterfaceMethodref #92.#120      // java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
  #120 = NameAndType        #121:#122     // filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
  #121 = Utf8               filter
  #122 = Utf8               (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
  #123 = InterfaceMethodref #92.#124      // java/util/stream/Stream.findFirst:()Ljava/util/Optional;
  #124 = NameAndType        #125:#126     // findFirst:()Ljava/util/Optional;
  #125 = Utf8               findFirst
  #126 = Utf8               ()Ljava/util/Optional;
  #127 = Methodref          #128.#129     // java/util/Optional.orElse:(Ljava/lang/Object;)Ljava/lang/Object;
  #128 = Class              #130          // java/util/Optional
  #129 = NameAndType        #131:#72      // orElse:(Ljava/lang/Object;)Ljava/lang/Object;
  #130 = Utf8               java/util/Optional
  #131 = Utf8               orElse
  #132 = Class              #133          // ext/mods/gameserver/model/actor/Npc
  #133 = Utf8               ext/mods/gameserver/model/actor/Npc
  #134 = InvokeDynamic      #2:#116       // #2:test:(I)Ljava/util/function/Predicate;
  #135 = Methodref          #136.#137     // java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
  #136 = Class              #138          // java/util/Objects
  #137 = NameAndType        #139:#72      // requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
  #138 = Utf8               java/util/Objects
  #139 = Utf8               requireNonNull
  #140 = InvokeDynamic      #3:#141       // #3:apply:(Ljava/lang/Class;)Ljava/util/function/Function;
  #141 = NameAndType        #89:#142      // apply:(Ljava/lang/Class;)Ljava/util/function/Function;
  #142 = Utf8               (Ljava/lang/Class;)Ljava/util/function/Function;
  #143 = Methodref          #144.#59      // ext/mods/gameserver/model/actor/Player.getObjectId:()I
  #144 = Class              #145          // ext/mods/gameserver/model/actor/Player
  #145 = Utf8               ext/mods/gameserver/model/actor/Player
  #146 = Methodref          #147.#148     // ext/mods/gameserver/data/sql/PlayerInfoTable.getInstance:()Lext/mods/gameserver/data/sql/PlayerInfoTable;
  #147 = Class              #149          // ext/mods/gameserver/data/sql/PlayerInfoTable
  #148 = NameAndType        #150:#151     // getInstance:()Lext/mods/gameserver/data/sql/PlayerInfoTable;
  #149 = Utf8               ext/mods/gameserver/data/sql/PlayerInfoTable
  #150 = Utf8               getInstance
  #151 = Utf8               ()Lext/mods/gameserver/data/sql/PlayerInfoTable;
  #152 = Methodref          #147.#153     // ext/mods/gameserver/data/sql/PlayerInfoTable.getPlayerObjectId:(Ljava/lang/String;)I
  #153 = NameAndType        #154:#155     // getPlayerObjectId:(Ljava/lang/String;)I
  #154 = Utf8               getPlayerObjectId
  #155 = Utf8               (Ljava/lang/String;)I
  #156 = Class              #157          // ext/mods/gameserver/model/actor/instance/Pet
  #157 = Utf8               ext/mods/gameserver/model/actor/instance/Pet
  #158 = Fieldref           #1.#159       // ext/mods/gameserver/model/World.REGION_X_OFFSET:I
  #159 = NameAndType        #160:#12      // REGION_X_OFFSET:I
  #160 = Utf8               REGION_X_OFFSET
  #161 = Fieldref           #1.#162       // ext/mods/gameserver/model/World.REGION_Y_OFFSET:I
  #162 = NameAndType        #163:#12      // REGION_Y_OFFSET:I
  #163 = Utf8               REGION_Y_OFFSET
  #164 = Methodref          #165.#166     // ext/mods/gameserver/model/location/Location.getX:()I
  #165 = Class              #167          // ext/mods/gameserver/model/location/Location
  #166 = NameAndType        #168:#62      // getX:()I
  #167 = Utf8               ext/mods/gameserver/model/location/Location
  #168 = Utf8               getX
  #169 = Methodref          #165.#170     // ext/mods/gameserver/model/location/Location.getY:()I
  #170 = NameAndType        #171:#62      // getY:()I
  #171 = Utf8               getY
  #172 = Methodref          #1.#173       // ext/mods/gameserver/model/World.getRegion:(II)Lext/mods/gameserver/model/WorldRegion;
  #173 = NameAndType        #174:#175     // getRegion:(II)Lext/mods/gameserver/model/WorldRegion;
  #174 = Utf8               getRegion
  #175 = Utf8               (II)Lext/mods/gameserver/model/WorldRegion;
  #176 = Integer            -131072
  #177 = Integer            -262144
  #178 = Methodref          #179.#180     // ext/mods/gameserver/model/zone/type/subtype/ZoneType.getId:()I
  #179 = Class              #181          // ext/mods/gameserver/model/zone/type/subtype/ZoneType
  #180 = NameAndType        #182:#62      // getId:()I
  #181 = Utf8               ext/mods/gameserver/model/zone/type/subtype/ZoneType
  #182 = Utf8               getId
  #183 = Methodref          #34.#184      // ext/mods/gameserver/model/WorldRegion.containsZone:(I)Z
  #184 = NameAndType        #185:#186     // containsZone:(I)Z
  #185 = Utf8               containsZone
  #186 = Utf8               (I)Z
  #187 = Class              #188          // java/util/ArrayList
  #188 = Utf8               java/util/ArrayList
  #189 = Methodref          #187.#5       // java/util/ArrayList."<init>":()V
  #190 = Methodref          #191.#192     // java/lang/Math.max:(II)I
  #191 = Class              #193          // java/lang/Math
  #192 = NameAndType        #194:#195     // max:(II)I
  #193 = Utf8               java/lang/Math
  #194 = Utf8               max
  #195 = Utf8               (II)I
  #196 = Methodref          #191.#197     // java/lang/Math.min:(II)I
  #197 = NameAndType        #198:#195     // min:(II)I
  #198 = Utf8               min
  #199 = Methodref          #34.#200      // ext/mods/gameserver/model/WorldRegion.getObjects:()Ljava/util/Collection;
  #200 = NameAndType        #201:#108     // getObjects:()Ljava/util/Collection;
  #201 = Utf8               getObjects
  #202 = InterfaceMethodref #113.#203     // java/util/Collection.iterator:()Ljava/util/Iterator;
  #203 = NameAndType        #204:#205     // iterator:()Ljava/util/Iterator;
  #204 = Utf8               iterator
  #205 = Utf8               ()Ljava/util/Iterator;
  #206 = InterfaceMethodref #207.#208     // java/util/Iterator.hasNext:()Z
  #207 = Class              #209          // java/util/Iterator
  #208 = NameAndType        #210:#78      // hasNext:()Z
  #209 = Utf8               java/util/Iterator
  #210 = Utf8               hasNext
  #211 = InterfaceMethodref #207.#212     // java/util/Iterator.next:()Ljava/lang/Object;
  #212 = NameAndType        #213:#214     // next:()Ljava/lang/Object;
  #213 = Utf8               next
  #214 = Utf8               ()Ljava/lang/Object;
  #215 = Class              #216          // ext/mods/gameserver/model/actor/Creature
  #216 = Utf8               ext/mods/gameserver/model/actor/Creature
  #217 = Methodref          #215.#166     // ext/mods/gameserver/model/actor/Creature.getX:()I
  #218 = Methodref          #191.#219     // java/lang/Math.abs:(I)I
  #219 = NameAndType        #220:#221     // abs:(I)I
  #220 = Utf8               abs
  #221 = Utf8               (I)I
  #222 = Methodref          #215.#170     // ext/mods/gameserver/model/actor/Creature.getY:()I
  #223 = InterfaceMethodref #224.#225     // java/util/List.add:(Ljava/lang/Object;)Z
  #224 = Class              #226          // java/util/List
  #225 = NameAndType        #227:#228     // add:(Ljava/lang/Object;)Z
  #226 = Utf8               java/util/List
  #227 = Utf8               add
  #228 = Utf8               (Ljava/lang/Object;)Z
  #229 = String             #230          // Deleting all visible NPCs.
  #230 = Utf8               Deleting all visible NPCs.
  #231 = Methodref          #52.#232      // ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;)V
  #232 = NameAndType        #55:#233      // info:(Ljava/lang/Object;)V
  #233 = Utf8               (Ljava/lang/Object;)V
  #234 = Methodref          #132.#235     // ext/mods/gameserver/model/actor/Npc.getSpawn:()Lext/mods/gameserver/model/spawn/ASpawn;
  #235 = NameAndType        #236:#237     // getSpawn:()Lext/mods/gameserver/model/spawn/ASpawn;
  #236 = Utf8               getSpawn
  #237 = Utf8               ()Lext/mods/gameserver/model/spawn/ASpawn;
  #238 = Methodref          #239.#240     // ext/mods/gameserver/model/spawn/ASpawn.doDelete:()V
  #239 = Class              #241          // ext/mods/gameserver/model/spawn/ASpawn
  #240 = NameAndType        #242:#8       // doDelete:()V
  #241 = Utf8               ext/mods/gameserver/model/spawn/ASpawn
  #242 = Utf8               doDelete
  #243 = Methodref          #132.#244     // ext/mods/gameserver/model/actor/Npc.deleteMe:()V
  #244 = NameAndType        #245:#8       // deleteMe:()V
  #245 = Utf8               deleteMe
  #246 = String             #247          // All visibles NPCs are now deleted.
  #247 = Utf8               All visibles NPCs are now deleted.
  #248 = Methodref          #1.#249       // ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
  #249 = NameAndType        #150:#250     // getInstance:()Lext/mods/gameserver/model/World;
  #250 = Utf8               ()Lext/mods/gameserver/model/World;
  #251 = Methodref          #1.#252       // ext/mods/gameserver/model/World.getPlayers:()Ljava/util/Collection;
  #252 = NameAndType        #253:#108     // getPlayers:()Ljava/util/Collection;
  #253 = Utf8               getPlayers
  #254 = Methodref          #144.#255     // ext/mods/gameserver/model/actor/Player.isOnline:()Z
  #255 = NameAndType        #256:#78      // isOnline:()Z
  #256 = Utf8               isOnline
  #257 = Methodref          #144.#258     // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #258 = NameAndType        #259:#260     // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #259 = Utf8               sendPacket
  #260 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #261 = Class              #262          // ext/mods/gameserver/network/serverpackets/CreatureSay
  #262 = Utf8               ext/mods/gameserver/network/serverpackets/CreatureSay
  #263 = Fieldref           #264.#265     // ext/mods/gameserver/enums/SayType.ANNOUNCEMENT:Lext/mods/gameserver/enums/SayType;
  #264 = Class              #266          // ext/mods/gameserver/enums/SayType
  #265 = NameAndType        #267:#268     // ANNOUNCEMENT:Lext/mods/gameserver/enums/SayType;
  #266 = Utf8               ext/mods/gameserver/enums/SayType
  #267 = Utf8               ANNOUNCEMENT
  #268 = Utf8               Lext/mods/gameserver/enums/SayType;
  #269 = Methodref          #261.#270     // ext/mods/gameserver/network/serverpackets/CreatureSay."<init>":(Lext/mods/gameserver/enums/SayType;Ljava/lang/String;Ljava/lang/String;)V
  #270 = NameAndType        #7:#271       // "<init>":(Lext/mods/gameserver/enums/SayType;Ljava/lang/String;Ljava/lang/String;)V
  #271 = Utf8               (Lext/mods/gameserver/enums/SayType;Ljava/lang/String;Ljava/lang/String;)V
  #272 = Methodref          #1.#273       // ext/mods/gameserver/model/World.toAllOnlinePlayers:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #273 = NameAndType        #274:#260     // toAllOnlinePlayers:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #274 = Utf8               toAllOnlinePlayers
  #275 = Fieldref           #264.#276     // ext/mods/gameserver/enums/SayType.CRITICAL_ANNOUNCE:Lext/mods/gameserver/enums/SayType;
  #276 = NameAndType        #277:#268     // CRITICAL_ANNOUNCE:Lext/mods/gameserver/enums/SayType;
  #277 = Utf8               CRITICAL_ANNOUNCE
  #278 = Methodref          #279.#280     // ext/mods/gameserver/data/xml/RestartPointData.getInstance:()Lext/mods/gameserver/data/xml/RestartPointData;
  #279 = Class              #281          // ext/mods/gameserver/data/xml/RestartPointData
  #280 = NameAndType        #150:#282     // getInstance:()Lext/mods/gameserver/data/xml/RestartPointData;
  #281 = Utf8               ext/mods/gameserver/data/xml/RestartPointData
  #282 = Utf8               ()Lext/mods/gameserver/data/xml/RestartPointData;
  #283 = Methodref          #279.#284     // ext/mods/gameserver/data/xml/RestartPointData.getRestartPoint:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/model/restart/RestartPoint;
  #284 = NameAndType        #285:#286     // getRestartPoint:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/model/restart/RestartPoint;
  #285 = Utf8               getRestartPoint
  #286 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/model/restart/RestartPoint;
  #287 = Methodref          #1.#288       // ext/mods/gameserver/model/World.isOutOfWorld:(IIII)Z
  #288 = NameAndType        #289:#290     // isOutOfWorld:(IIII)Z
  #289 = Utf8               isOutOfWorld
  #290 = Utf8               (IIII)Z
  #291 = Integer            229375
  #292 = Integer            262143
  #293 = Methodref          #144.#294     // ext/mods/gameserver/model/actor/Player.getClient:()Lext/mods/gameserver/network/GameClient;
  #294 = NameAndType        #295:#296     // getClient:()Lext/mods/gameserver/network/GameClient;
  #295 = Utf8               getClient
  #296 = Utf8               ()Lext/mods/gameserver/network/GameClient;
  #297 = Methodref          #144.#298     // ext/mods/gameserver/model/actor/Player.isInStoreMode:()Z
  #298 = NameAndType        #299:#78      // isInStoreMode:()Z
  #299 = Utf8               isInStoreMode
  #300 = Methodref          #301.#302     // ext/mods/gameserver/network/GameClient.isDetached:()Z
  #301 = Class              #303          // ext/mods/gameserver/network/GameClient
  #302 = NameAndType        #304:#78      // isDetached:()Z
  #303 = Utf8               ext/mods/gameserver/network/GameClient
  #304 = Utf8               isDetached
  #305 = InterfaceMethodref #64.#306      // java/util/Map.size:()I
  #306 = NameAndType        #307:#62      // size:()I
  #307 = Utf8               size
  #308 = Fieldref           #1.#309       // ext/mods/gameserver/model/World._maxOnline:I
  #309 = NameAndType        #310:#12      // _maxOnline:I
  #310 = Utf8               _maxOnline
  #311 = Methodref          #144.#312     // ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
  #312 = NameAndType        #313:#314     // getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
  #313 = Utf8               getSysString
  #314 = Utf8               (I[Ljava/lang/Object;)Ljava/lang/String;
  #315 = Fieldref           #316.#317     // ext/mods/gameserver/model/World$SingletonHolder.INSTANCE:Lext/mods/gameserver/model/World;
  #316 = Class              #318          // ext/mods/gameserver/model/World$SingletonHolder
  #317 = NameAndType        #319:#320     // INSTANCE:Lext/mods/gameserver/model/World;
  #318 = Utf8               ext/mods/gameserver/model/World$SingletonHolder
  #319 = Utf8               INSTANCE
  #320 = Utf8               Lext/mods/gameserver/model/World;
  #321 = Methodref          #132.#322     // ext/mods/gameserver/model/actor/Npc.getNpcId:()I
  #322 = NameAndType        #323:#62      // getNpcId:()I
  #323 = Utf8               getNpcId
  #324 = Methodref          #325.#326     // java/lang/Class.getName:()Ljava/lang/String;
  #325 = Class              #327          // java/lang/Class
  #326 = NameAndType        #328:#329     // getName:()Ljava/lang/String;
  #327 = Utf8               java/lang/Class
  #328 = Utf8               getName
  #329 = Utf8               ()Ljava/lang/String;
  #330 = Methodref          #52.#331      // ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
  #331 = NameAndType        #7:#332       // "<init>":(Ljava/lang/String;)V
  #332 = Utf8               (Ljava/lang/String;)V
  #333 = Utf8               TILE_X_MIN
  #334 = Utf8               ConstantValue
  #335 = Integer            16
  #336 = Utf8               TILE_X_MAX
  #337 = Integer            26
  #338 = Utf8               TILE_Y_MIN
  #339 = Integer            10
  #340 = Utf8               TILE_Y_MAX
  #341 = Integer            25
  #342 = Utf8               TILE_SIZE
  #343 = Integer            32768
  #344 = Utf8               WORLD_X_MIN
  #345 = Utf8               WORLD_X_MAX
  #346 = Utf8               WORLD_Y_MIN
  #347 = Utf8               WORLD_Y_MAX
  #348 = Utf8               WORLD_Z_MAX
  #349 = Integer            16410
  #350 = Utf8               REGION_SIZE
  #351 = Integer            2048
  #352 = Utf8               REGIONS_X
  #353 = Integer            176
  #354 = Utf8               REGIONS_Y
  #355 = Integer            256
  #356 = Utf8               Signature
  #357 = Utf8               Ljava/util/Map<Ljava/lang/Integer;Lext/mods/gameserver/model/WorldObject;>;
  #358 = Utf8               Ljava/util/Map<Ljava/lang/Integer;Lext/mods/gameserver/model/actor/instance/Pet;>;
  #359 = Utf8               Ljava/util/Map<Ljava/lang/Integer;Lext/mods/gameserver/model/actor/Player;>;
  #360 = Utf8               Code
  #361 = Utf8               LineNumberTable
  #362 = Utf8               LocalVariableTable
  #363 = Utf8               y
  #364 = Utf8               x
  #365 = Utf8               this
  #366 = Utf8               StackMapTable
  #367 = Utf8               addObject
  #368 = Utf8               (Lext/mods/gameserver/model/WorldObject;)V
  #369 = Utf8               object
  #370 = Utf8               Lext/mods/gameserver/model/WorldObject;
  #371 = Utf8               removeObject
  #372 = Utf8               removeObjects
  #373 = Utf8               (Ljava/util/Set;)V
  #374 = Utf8               objects
  #375 = Utf8               Ljava/util/Set;
  #376 = Utf8               LocalVariableTypeTable
  #377 = Utf8               Ljava/util/Set<+Lext/mods/gameserver/model/WorldObject;>;
  #378 = Utf8               (Ljava/util/Set<+Lext/mods/gameserver/model/WorldObject;>;)V
  #379 = Utf8               ()Ljava/util/Collection<Lext/mods/gameserver/model/WorldObject;>;
  #380 = Utf8               getObject
  #381 = Utf8               (I)Lext/mods/gameserver/model/WorldObject;
  #382 = Utf8               objectId
  #383 = Utf8               getNpc
  #384 = Utf8               (I)Lext/mods/gameserver/model/actor/Npc;
  #385 = Utf8               npcId
  #386 = Utf8               getNpcs
  #387 = Utf8               (I)Ljava/util/List;
  #388 = Utf8               (I)Ljava/util/List<Lext/mods/gameserver/model/actor/Npc;>;
  #389 = Utf8               addPlayer
  #390 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
  #391 = Utf8               cha
  #392 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #393 = Utf8               removePlayer
  #394 = Utf8               ()Ljava/util/Collection<Lext/mods/gameserver/model/actor/Player;>;
  #395 = Utf8               getPlayer
  #396 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/model/actor/Player;
  #397 = Utf8               name
  #398 = Utf8               Ljava/lang/String;
  #399 = Utf8               (I)Lext/mods/gameserver/model/actor/Player;
  #400 = Utf8               addPet
  #401 = Utf8               (ILext/mods/gameserver/model/actor/instance/Pet;)V
  #402 = Utf8               ownerId
  #403 = Utf8               pet
  #404 = Utf8               Lext/mods/gameserver/model/actor/instance/Pet;
  #405 = Utf8               removePet
  #406 = Utf8               (I)V
  #407 = Utf8               getPet
  #408 = Utf8               (I)Lext/mods/gameserver/model/actor/instance/Pet;
  #409 = Utf8               getRegionX
  #410 = Utf8               regionX
  #411 = Utf8               getRegionY
  #412 = Utf8               regionY
  #413 = Utf8               (Lext/mods/gameserver/model/location/Location;)Lext/mods/gameserver/model/WorldRegion;
  #414 = Utf8               loc
  #415 = Utf8               Lext/mods/gameserver/model/location/Location;
  #416 = Utf8               (Lext/mods/gameserver/model/zone/type/subtype/ZoneType;)Lext/mods/gameserver/model/WorldRegion;
  #417 = Utf8               region
  #418 = Utf8               Lext/mods/gameserver/model/WorldRegion;
  #419 = Utf8               zone
  #420 = Utf8               Lext/mods/gameserver/model/zone/type/subtype/ZoneType;
  #421 = Utf8               getWorldRegions
  #422 = Utf8               ()[[Lext/mods/gameserver/model/WorldRegion;
  #423 = Utf8               getAroundCharacters
  #424 = Utf8               (IIII)Ljava/util/List;
  #425 = Utf8               creature
  #426 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #427 = Utf8               obj
  #428 = Utf8               ry
  #429 = Utf8               rx
  #430 = Utf8               rangeX
  #431 = Utf8               rangeY
  #432 = Utf8               result
  #433 = Utf8               Ljava/util/List;
  #434 = Utf8               startX
  #435 = Utf8               endX
  #436 = Utf8               startY
  #437 = Utf8               endY
  #438 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/actor/Creature;>;
  #439 = Utf8               (IIII)Ljava/util/List<Lext/mods/gameserver/model/actor/Creature;>;
  #440 = Utf8               deleteVisibleNpcSpawns
  #441 = Utf8               spawn
  #442 = Utf8               Lext/mods/gameserver/model/spawn/ASpawn;
  #443 = Utf8               npc
  #444 = Utf8               Lext/mods/gameserver/model/actor/Npc;
  #445 = Utf8               j
  #446 = Utf8               i
  #447 = Utf8               player
  #448 = Utf8               packet
  #449 = Utf8               Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;
  #450 = Utf8               announceToOnlinePlayers
  #451 = Utf8               text
  #452 = Utf8               (Ljava/lang/String;Z)V
  #453 = Utf8               critical
  #454 = Utf8               Z
  #455 = Class              #456          // java/lang/String
  #456 = Utf8               java/lang/String
  #457 = Utf8               broadcastToSameRegion
  #458 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #459 = Utf8               plRp
  #460 = Utf8               Lext/mods/gameserver/model/restart/RestartPoint;
  #461 = Utf8               pl
  #462 = Utf8               creatureRp
  #463 = Class              #464          // ext/mods/gameserver/model/restart/RestartPoint
  #464 = Utf8               ext/mods/gameserver/model/restart/RestartPoint
  #465 = Utf8               (II)Z
  #466 = Utf8               minX
  #467 = Utf8               maxX
  #468 = Utf8               minY
  #469 = Utf8               maxY
  #470 = Utf8               getTraderCount
  #471 = Utf8               client
  #472 = Utf8               Lext/mods/gameserver/network/GameClient;
  #473 = Utf8               traderCount
  #474 = Utf8               getMaxOnline
  #475 = Utf8               currentOnline
  #476 = Utf8               getOnlinePlayerCount
  #477 = Utf8               onlinePlayerCount
  #478 = Utf8               (ILjava/lang/String;)V
  #479 = Utf8               id
  #480 = Utf8               (I[Ljava/lang/Object;)V
  #481 = Utf8               args
  #482 = Utf8               [Ljava/lang/Object;
  #483 = Utf8               lambda$getNpcs$0
  #484 = Utf8               (ILext/mods/gameserver/model/WorldObject;)Z
  #485 = Utf8               o
  #486 = Utf8               lambda$getNpc$0
  #487 = Utf8               <clinit>
  #488 = Utf8               SourceFile
  #489 = Utf8               World.java
  #490 = Utf8               NestMembers
  #491 = Utf8               BootstrapMethods
  #492 = MethodType         #72           //  (Ljava/lang/Object;)Ljava/lang/Object;
  #493 = MethodHandle       5:#57         // REF_invokeVirtual ext/mods/gameserver/model/WorldObject.getObjectId:()I
  #494 = MethodType         #495          //  (Lext/mods/gameserver/model/WorldObject;)Ljava/lang/Integer;
  #495 = Utf8               (Lext/mods/gameserver/model/WorldObject;)Ljava/lang/Integer;
  #496 = MethodType         #228          //  (Ljava/lang/Object;)Z
  #497 = MethodHandle       6:#498        // REF_invokeStatic ext/mods/gameserver/model/World.lambda$getNpc$0:(ILext/mods/gameserver/model/WorldObject;)Z
  #498 = Methodref          #1.#499       // ext/mods/gameserver/model/World.lambda$getNpc$0:(ILext/mods/gameserver/model/WorldObject;)Z
  #499 = NameAndType        #486:#484     // lambda$getNpc$0:(ILext/mods/gameserver/model/WorldObject;)Z
  #500 = MethodType         #501          //  (Lext/mods/gameserver/model/WorldObject;)Z
  #501 = Utf8               (Lext/mods/gameserver/model/WorldObject;)Z
  #502 = MethodHandle       6:#503        // REF_invokeStatic ext/mods/gameserver/model/World.lambda$getNpcs$0:(ILext/mods/gameserver/model/WorldObject;)Z
  #503 = Methodref          #1.#504       // ext/mods/gameserver/model/World.lambda$getNpcs$0:(ILext/mods/gameserver/model/WorldObject;)Z
  #504 = NameAndType        #483:#484     // lambda$getNpcs$0:(ILext/mods/gameserver/model/WorldObject;)Z
  #505 = MethodHandle       5:#506        // REF_invokeVirtual java/lang/Class.cast:(Ljava/lang/Object;)Ljava/lang/Object;
  #506 = Methodref          #325.#507     // java/lang/Class.cast:(Ljava/lang/Object;)Ljava/lang/Object;
  #507 = NameAndType        #508:#72      // cast:(Ljava/lang/Object;)Ljava/lang/Object;
  #508 = Utf8               cast
  #509 = MethodType         #510          //  (Lext/mods/gameserver/model/WorldObject;)Lext/mods/gameserver/model/actor/Npc;
  #510 = Utf8               (Lext/mods/gameserver/model/WorldObject;)Lext/mods/gameserver/model/actor/Npc;
  #511 = MethodHandle       6:#512        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #512 = Methodref          #513.#514     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #513 = Class              #515          // java/lang/invoke/LambdaMetafactory
  #514 = NameAndType        #516:#517     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #515 = Utf8               java/lang/invoke/LambdaMetafactory
  #516 = Utf8               metafactory
  #517 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #518 = Utf8               InnerClasses
  #519 = Utf8               SingletonHolder
  #520 = Class              #521          // java/lang/invoke/MethodHandles$Lookup
  #521 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #522 = Class              #523          // java/lang/invoke/MethodHandles
  #523 = Utf8               java/lang/invoke/MethodHandles
  #524 = Utf8               Lookup
{
  public volatile int MAX_CONNECTED_COUNT;
    descriptor: I
    flags: (0x0041) ACC_PUBLIC, ACC_VOLATILE

  public volatile int OFFLINE_TRADE_COUNT;
    descriptor: I
    flags: (0x0041) ACC_PUBLIC, ACC_VOLATILE

  public static final int TILE_X_MIN;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 16

  public static final int TILE_X_MAX;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 26

  public static final int TILE_Y_MIN;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 10

  public static final int TILE_Y_MAX;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 25

  public static final int TILE_SIZE;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 32768

  public static final int WORLD_X_MIN;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int -131072

  public static final int WORLD_X_MAX;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 229375

  public static final int WORLD_Y_MIN;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int -262144

  public static final int WORLD_Y_MAX;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 262143

  public static final int WORLD_Z_MAX;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 16410

  public static final int REGION_SIZE;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 2048

  public static final int REGIONS_X;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 176

  public static final int REGIONS_Y;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 256

  public static final int REGION_X_OFFSET;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL

  public static final int REGION_Y_OFFSET;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL

  protected ext.mods.gameserver.model.World();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=6, locals=3, args_size=1
         0: aload_0
         1: invokespecial #3                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: iconst_0
         6: putfield      #9                  // Field MAX_CONNECTED_COUNT:I
         9: aload_0
        10: iconst_0
        11: putfield      #13                 // Field OFFLINE_TRADE_COUNT:I
        14: aload_0
        15: new           #16                 // class java/util/concurrent/ConcurrentHashMap
        18: dup
        19: invokespecial #18                 // Method java/util/concurrent/ConcurrentHashMap."<init>":()V
        22: putfield      #19                 // Field _objects:Ljava/util/Map;
        25: aload_0
        26: new           #16                 // class java/util/concurrent/ConcurrentHashMap
        29: dup
        30: invokespecial #18                 // Method java/util/concurrent/ConcurrentHashMap."<init>":()V
        33: putfield      #23                 // Field _pets:Ljava/util/Map;
        36: aload_0
        37: new           #16                 // class java/util/concurrent/ConcurrentHashMap
        40: dup
        41: invokespecial #18                 // Method java/util/concurrent/ConcurrentHashMap."<init>":()V
        44: putfield      #26                 // Field _players:Ljava/util/Map;
        47: aload_0
        48: sipush        176
        51: sipush        256
        54: multianewarray #29,  2            // class "[[Lext/mods/gameserver/model/WorldRegion;"
        58: putfield      #31                 // Field _worldRegions:[[Lext/mods/gameserver/model/WorldRegion;
        61: iconst_0
        62: istore_1
        63: iload_1
        64: sipush        176
        67: if_icmpge     108
        70: iconst_0
        71: istore_2
        72: iload_2
        73: sipush        256
        76: if_icmpge     102
        79: aload_0
        80: getfield      #31                 // Field _worldRegions:[[Lext/mods/gameserver/model/WorldRegion;
        83: iload_1
        84: aaload
        85: iload_2
        86: new           #34                 // class ext/mods/gameserver/model/WorldRegion
        89: dup
        90: iload_1
        91: iload_2
        92: invokespecial #36                 // Method ext/mods/gameserver/model/WorldRegion."<init>":(II)V
        95: aastore
        96: iinc          2, 1
        99: goto          72
       102: iinc          1, 1
       105: goto          63
       108: getstatic     #39                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
       111: ldc           #43                 // String World grid ({} by {}) is now set up.
       113: iconst_2
       114: anewarray     #4                  // class java/lang/Object
       117: dup
       118: iconst_0
       119: sipush        176
       122: invokestatic  #45                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       125: aastore
       126: dup
       127: iconst_1
       128: sipush        256
       131: invokestatic  #45                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       134: aastore
       135: invokevirtual #51                 // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
       138: return
      LineNumberTable:
        line 78: 0
        line 48: 4
        line 49: 9
        line 69: 14
        line 70: 25
        line 71: 36
        line 75: 47
        line 79: 61
        line 81: 70
        line 82: 79
        line 81: 96
        line 79: 102
        line 85: 108
        line 86: 138
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           72      30     2     y   I
           63      45     1     x   I
            0     139     0  this   Lext/mods/gameserver/model/World;
      StackMapTable: number_of_entries = 4
        frame_type = 255 /* full_frame */
          offset_delta = 63
          locals = [ class ext/mods/gameserver/model/World, int ]
          stack = []
        frame_type = 252 /* append */
          offset_delta = 8
          locals = [ int ]
        frame_type = 250 /* chop */
          offset_delta = 29
        frame_type = 250 /* chop */
          offset_delta = 5

  public void addObject(ext.mods.gameserver.model.WorldObject);
    descriptor: (Lext/mods/gameserver/model/WorldObject;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: getfield      #19                 // Field _objects:Ljava/util/Map;
         4: aload_1
         5: invokevirtual #57                 // Method ext/mods/gameserver/model/WorldObject.getObjectId:()I
         8: invokestatic  #45                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        11: aload_1
        12: invokeinterface #63,  3           // InterfaceMethod java/util/Map.putIfAbsent:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        17: pop
        18: return
      LineNumberTable:
        line 90: 0
        line 91: 18
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      19     0  this   Lext/mods/gameserver/model/World;
            0      19     1 object   Lext/mods/gameserver/model/WorldObject;

  public void removeObject(ext.mods.gameserver.model.WorldObject);
    descriptor: (Lext/mods/gameserver/model/WorldObject;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #19                 // Field _objects:Ljava/util/Map;
         4: aload_1
         5: invokevirtual #57                 // Method ext/mods/gameserver/model/WorldObject.getObjectId:()I
         8: invokestatic  #45                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        11: invokeinterface #69,  2           // InterfaceMethod java/util/Map.remove:(Ljava/lang/Object;)Ljava/lang/Object;
        16: pop
        17: return
      LineNumberTable:
        line 95: 0
        line 96: 17
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      18     0  this   Lext/mods/gameserver/model/World;
            0      18     1 object   Lext/mods/gameserver/model/WorldObject;

  public void removeObjects(java.util.Set<? extends ext.mods.gameserver.model.WorldObject>);
    descriptor: (Ljava/util/Set;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: aload_1
         1: ifnull        13
         4: aload_1
         5: invokeinterface #73,  1           // InterfaceMethod java/util/Set.isEmpty:()Z
        10: ifeq          14
        13: return
        14: aload_0
        15: getfield      #19                 // Field _objects:Ljava/util/Map;
        18: invokeinterface #79,  1           // InterfaceMethod java/util/Map.keySet:()Ljava/util/Set;
        23: aload_1
        24: invokeinterface #83,  1           // InterfaceMethod java/util/Set.stream:()Ljava/util/stream/Stream;
        29: invokedynamic #87,  0             // InvokeDynamic #0:apply:()Ljava/util/function/Function;
        34: invokeinterface #91,  2           // InterfaceMethod java/util/stream/Stream.map:(Ljava/util/function/Function;)Ljava/util/stream/Stream;
        39: invokeinterface #97,  1           // InterfaceMethod java/util/stream/Stream.toList:()Ljava/util/List;
        44: invokeinterface #101,  2          // InterfaceMethod java/util/Set.removeAll:(Ljava/util/Collection;)Z
        49: pop
        50: return
      LineNumberTable:
        line 100: 0
        line 101: 13
        line 103: 14
        line 104: 50
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      51     0  this   Lext/mods/gameserver/model/World;
            0      51     1 objects   Ljava/util/Set;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      51     1 objects   Ljava/util/Set<+Lext/mods/gameserver/model/WorldObject;>;
      StackMapTable: number_of_entries = 2
        frame_type = 13 /* same */
        frame_type = 0 /* same */
    Signature: #378                         // (Ljava/util/Set<+Lext/mods/gameserver/model/WorldObject;>;)V

  public java.util.Collection<ext.mods.gameserver.model.WorldObject> getObjects();
    descriptor: ()Ljava/util/Collection;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #19                 // Field _objects:Ljava/util/Map;
         4: invokeinterface #105,  1          // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
         9: areturn
      LineNumberTable:
        line 108: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/gameserver/model/World;
    Signature: #379                         // ()Ljava/util/Collection<Lext/mods/gameserver/model/WorldObject;>;

  public ext.mods.gameserver.model.WorldObject getObject(int);
    descriptor: (I)Lext/mods/gameserver/model/WorldObject;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #19                 // Field _objects:Ljava/util/Map;
         4: iload_1
         5: invokestatic  #45                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
         8: invokeinterface #109,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        13: checkcast     #58                 // class ext/mods/gameserver/model/WorldObject
        16: areturn
      LineNumberTable:
        line 113: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      17     0  this   Lext/mods/gameserver/model/World;
            0      17     1 objectId   I

  public ext.mods.gameserver.model.actor.Npc getNpc(int);
    descriptor: (I)Lext/mods/gameserver/model/actor/Npc;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #19                 // Field _objects:Ljava/util/Map;
         4: invokeinterface #105,  1          // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
         9: invokeinterface #112,  1          // InterfaceMethod java/util/Collection.stream:()Ljava/util/stream/Stream;
        14: iload_1
        15: invokedynamic #115,  0            // InvokeDynamic #1:test:(I)Ljava/util/function/Predicate;
        20: invokeinterface #119,  2          // InterfaceMethod java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
        25: invokeinterface #123,  1          // InterfaceMethod java/util/stream/Stream.findFirst:()Ljava/util/Optional;
        30: aconst_null
        31: invokevirtual #127                // Method java/util/Optional.orElse:(Ljava/lang/Object;)Ljava/lang/Object;
        34: checkcast     #132                // class ext/mods/gameserver/model/actor/Npc
        37: areturn
      LineNumberTable:
        line 118: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      38     0  this   Lext/mods/gameserver/model/World;
            0      38     1 npcId   I

  public java.util.List<ext.mods.gameserver.model.actor.Npc> getNpcs(int);
    descriptor: (I)Ljava/util/List;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: getfield      #19                 // Field _objects:Ljava/util/Map;
         4: invokeinterface #105,  1          // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
         9: invokeinterface #112,  1          // InterfaceMethod java/util/Collection.stream:()Ljava/util/stream/Stream;
        14: iload_1
        15: invokedynamic #134,  0            // InvokeDynamic #2:test:(I)Ljava/util/function/Predicate;
        20: invokeinterface #119,  2          // InterfaceMethod java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
        25: ldc           #132                // class ext/mods/gameserver/model/actor/Npc
        27: dup
        28: invokestatic  #135                // Method java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
        31: pop
        32: invokedynamic #140,  0            // InvokeDynamic #3:apply:(Ljava/lang/Class;)Ljava/util/function/Function;
        37: invokeinterface #91,  2           // InterfaceMethod java/util/stream/Stream.map:(Ljava/util/function/Function;)Ljava/util/stream/Stream;
        42: invokeinterface #97,  1           // InterfaceMethod java/util/stream/Stream.toList:()Ljava/util/List;
        47: areturn
      LineNumberTable:
        line 123: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      48     0  this   Lext/mods/gameserver/model/World;
            0      48     1 npcId   I
    Signature: #388                         // (I)Ljava/util/List<Lext/mods/gameserver/model/actor/Npc;>;

  public void addPlayer(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: getfield      #26                 // Field _players:Ljava/util/Map;
         4: aload_1
         5: invokevirtual #143                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
         8: invokestatic  #45                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        11: aload_1
        12: invokeinterface #63,  3           // InterfaceMethod java/util/Map.putIfAbsent:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        17: pop
        18: return
      LineNumberTable:
        line 128: 0
        line 129: 18
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      19     0  this   Lext/mods/gameserver/model/World;
            0      19     1   cha   Lext/mods/gameserver/model/actor/Player;

  public void removePlayer(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #26                 // Field _players:Ljava/util/Map;
         4: aload_1
         5: invokevirtual #143                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
         8: invokestatic  #45                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        11: invokeinterface #69,  2           // InterfaceMethod java/util/Map.remove:(Ljava/lang/Object;)Ljava/lang/Object;
        16: pop
        17: return
      LineNumberTable:
        line 133: 0
        line 134: 17
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      18     0  this   Lext/mods/gameserver/model/World;
            0      18     1   cha   Lext/mods/gameserver/model/actor/Player;

  public java.util.Collection<ext.mods.gameserver.model.actor.Player> getPlayers();
    descriptor: ()Ljava/util/Collection;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #26                 // Field _players:Ljava/util/Map;
         4: invokeinterface #105,  1          // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
         9: areturn
      LineNumberTable:
        line 138: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/gameserver/model/World;
    Signature: #394                         // ()Ljava/util/Collection<Lext/mods/gameserver/model/actor/Player;>;

  public ext.mods.gameserver.model.actor.Player getPlayer(java.lang.String);
    descriptor: (Ljava/lang/String;)Lext/mods/gameserver/model/actor/Player;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: getfield      #26                 // Field _players:Ljava/util/Map;
         4: invokestatic  #146                // Method ext/mods/gameserver/data/sql/PlayerInfoTable.getInstance:()Lext/mods/gameserver/data/sql/PlayerInfoTable;
         7: aload_1
         8: invokevirtual #152                // Method ext/mods/gameserver/data/sql/PlayerInfoTable.getPlayerObjectId:(Ljava/lang/String;)I
        11: invokestatic  #45                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        14: invokeinterface #109,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        19: checkcast     #144                // class ext/mods/gameserver/model/actor/Player
        22: areturn
      LineNumberTable:
        line 143: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      23     0  this   Lext/mods/gameserver/model/World;
            0      23     1  name   Ljava/lang/String;

  public ext.mods.gameserver.model.actor.Player getPlayer(int);
    descriptor: (I)Lext/mods/gameserver/model/actor/Player;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #26                 // Field _players:Ljava/util/Map;
         4: iload_1
         5: invokestatic  #45                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
         8: invokeinterface #109,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        13: checkcast     #144                // class ext/mods/gameserver/model/actor/Player
        16: areturn
      LineNumberTable:
        line 148: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      17     0  this   Lext/mods/gameserver/model/World;
            0      17     1 objectId   I

  public void addPet(int, ext.mods.gameserver.model.actor.instance.Pet);
    descriptor: (ILext/mods/gameserver/model/actor/instance/Pet;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: getfield      #23                 // Field _pets:Ljava/util/Map;
         4: iload_1
         5: invokestatic  #45                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
         8: aload_2
         9: invokeinterface #63,  3           // InterfaceMethod java/util/Map.putIfAbsent:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        14: pop
        15: return
      LineNumberTable:
        line 153: 0
        line 154: 15
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      16     0  this   Lext/mods/gameserver/model/World;
            0      16     1 ownerId   I
            0      16     2   pet   Lext/mods/gameserver/model/actor/instance/Pet;

  public void removePet(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #23                 // Field _pets:Ljava/util/Map;
         4: iload_1
         5: invokestatic  #45                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
         8: invokeinterface #69,  2           // InterfaceMethod java/util/Map.remove:(Ljava/lang/Object;)Ljava/lang/Object;
        13: pop
        14: return
      LineNumberTable:
        line 158: 0
        line 159: 14
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      15     0  this   Lext/mods/gameserver/model/World;
            0      15     1 ownerId   I

  public ext.mods.gameserver.model.actor.instance.Pet getPet(int);
    descriptor: (I)Lext/mods/gameserver/model/actor/instance/Pet;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #23                 // Field _pets:Ljava/util/Map;
         4: iload_1
         5: invokestatic  #45                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
         8: invokeinterface #109,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        13: checkcast     #156                // class ext/mods/gameserver/model/actor/instance/Pet
        16: areturn
      LineNumberTable:
        line 163: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      17     0  this   Lext/mods/gameserver/model/World;
            0      17     1 ownerId   I

  public static int getRegionX(int);
    descriptor: (I)I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=1, args_size=1
         0: iload_0
         1: getstatic     #158                // Field REGION_X_OFFSET:I
         4: isub
         5: sipush        2048
         8: imul
         9: ireturn
      LineNumberTable:
        line 168: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0 regionX   I

  public static int getRegionY(int);
    descriptor: (I)I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=1, args_size=1
         0: iload_0
         1: getstatic     #161                // Field REGION_Y_OFFSET:I
         4: isub
         5: sipush        2048
         8: imul
         9: ireturn
      LineNumberTable:
        line 173: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0 regionY   I

  public ext.mods.gameserver.model.WorldRegion getRegion(ext.mods.gameserver.model.location.Location);
    descriptor: (Lext/mods/gameserver/model/location/Location;)Lext/mods/gameserver/model/WorldRegion;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokevirtual #164                // Method ext/mods/gameserver/model/location/Location.getX:()I
         5: aload_1
         6: invokevirtual #169                // Method ext/mods/gameserver/model/location/Location.getY:()I
         9: invokevirtual #172                // Method getRegion:(II)Lext/mods/gameserver/model/WorldRegion;
        12: areturn
      LineNumberTable:
        line 182: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      13     0  this   Lext/mods/gameserver/model/World;
            0      13     1   loc   Lext/mods/gameserver/model/location/Location;

  public ext.mods.gameserver.model.WorldRegion getRegion(int, int);
    descriptor: (II)Lext/mods/gameserver/model/WorldRegion;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: getfield      #31                 // Field _worldRegions:[[Lext/mods/gameserver/model/WorldRegion;
         4: iload_1
         5: ldc           #176                // int -131072
         7: isub
         8: sipush        2048
        11: idiv
        12: aaload
        13: iload_2
        14: ldc           #177                // int -262144
        16: isub
        17: sipush        2048
        20: idiv
        21: aaload
        22: areturn
      LineNumberTable:
        line 192: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      23     0  this   Lext/mods/gameserver/model/World;
            0      23     1     x   I
            0      23     2     y   I

  public ext.mods.gameserver.model.WorldRegion getRegion(ext.mods.gameserver.model.zone.type.subtype.ZoneType);
    descriptor: (Lext/mods/gameserver/model/zone/type/subtype/ZoneType;)Lext/mods/gameserver/model/WorldRegion;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=5, args_size=2
         0: iconst_0
         1: istore_2
         2: iload_2
         3: sipush        176
         6: if_icmpge     55
         9: iconst_0
        10: istore_3
        11: iload_3
        12: sipush        256
        15: if_icmpge     49
        18: aload_0
        19: getfield      #31                 // Field _worldRegions:[[Lext/mods/gameserver/model/WorldRegion;
        22: iload_2
        23: aaload
        24: iload_3
        25: aaload
        26: astore        4
        28: aload         4
        30: aload_1
        31: invokevirtual #178                // Method ext/mods/gameserver/model/zone/type/subtype/ZoneType.getId:()I
        34: invokevirtual #183                // Method ext/mods/gameserver/model/WorldRegion.containsZone:(I)Z
        37: ifeq          43
        40: aload         4
        42: areturn
        43: iinc          3, 1
        46: goto          11
        49: iinc          2, 1
        52: goto          2
        55: aconst_null
        56: areturn
      LineNumberTable:
        line 202: 0
        line 204: 9
        line 206: 18
        line 207: 28
        line 208: 40
        line 204: 43
        line 202: 49
        line 211: 55
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           28      15     4 region   Lext/mods/gameserver/model/WorldRegion;
           11      38     3     y   I
            2      53     2     x   I
            0      57     0  this   Lext/mods/gameserver/model/World;
            0      57     1  zone   Lext/mods/gameserver/model/zone/type/subtype/ZoneType;
      StackMapTable: number_of_entries = 5
        frame_type = 252 /* append */
          offset_delta = 2
          locals = [ int ]
        frame_type = 252 /* append */
          offset_delta = 8
          locals = [ int ]
        frame_type = 31 /* same */
        frame_type = 250 /* chop */
          offset_delta = 5
        frame_type = 250 /* chop */
          offset_delta = 5

  public ext.mods.gameserver.model.WorldRegion[][] getWorldRegions();
    descriptor: ()[[Lext/mods/gameserver/model/WorldRegion;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #31                 // Field _worldRegions:[[Lext/mods/gameserver/model/WorldRegion;
         4: areturn
      LineNumberTable:
        line 219: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/World;

  public java.util.List<ext.mods.gameserver.model.actor.Creature> getAroundCharacters(int, int, int, int);
    descriptor: (IIII)Ljava/util/List;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=15, args_size=5
         0: new           #187                // class java/util/ArrayList
         3: dup
         4: invokespecial #189                // Method java/util/ArrayList."<init>":()V
         7: astore        5
         9: iload_1
        10: iload_3
        11: isub
        12: ldc           #176                // int -131072
        14: isub
        15: sipush        2048
        18: idiv
        19: istore        6
        21: iload_1
        22: iload_3
        23: iadd
        24: ldc           #176                // int -131072
        26: isub
        27: sipush        2048
        30: idiv
        31: istore        7
        33: iload_2
        34: iload         4
        36: isub
        37: ldc           #177                // int -262144
        39: isub
        40: sipush        2048
        43: idiv
        44: istore        8
        46: iload_2
        47: iload         4
        49: iadd
        50: ldc           #177                // int -262144
        52: isub
        53: sipush        2048
        56: idiv
        57: istore        9
        59: iconst_0
        60: iload         6
        62: invokestatic  #190                // Method java/lang/Math.max:(II)I
        65: istore        10
        67: iload         10
        69: sipush        175
        72: iload         7
        74: invokestatic  #196                // Method java/lang/Math.min:(II)I
        77: if_icmpgt     212
        80: iconst_0
        81: iload         8
        83: invokestatic  #190                // Method java/lang/Math.max:(II)I
        86: istore        11
        88: iload         11
        90: sipush        255
        93: iload         9
        95: invokestatic  #196                // Method java/lang/Math.min:(II)I
        98: if_icmpgt     206
       101: aload_0
       102: getfield      #31                 // Field _worldRegions:[[Lext/mods/gameserver/model/WorldRegion;
       105: iload         10
       107: aaload
       108: iload         11
       110: aaload
       111: invokevirtual #199                // Method ext/mods/gameserver/model/WorldRegion.getObjects:()Ljava/util/Collection;
       114: invokeinterface #202,  1          // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
       119: astore        12
       121: aload         12
       123: invokeinterface #206,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       128: ifeq          200
       131: aload         12
       133: invokeinterface #211,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       138: checkcast     #58                 // class ext/mods/gameserver/model/WorldObject
       141: astore        13
       143: aload         13
       145: instanceof    #215                // class ext/mods/gameserver/model/actor/Creature
       148: ifeq          197
       151: aload         13
       153: checkcast     #215                // class ext/mods/gameserver/model/actor/Creature
       156: astore        14
       158: aload         14
       160: invokevirtual #217                // Method ext/mods/gameserver/model/actor/Creature.getX:()I
       163: iload_1
       164: isub
       165: invokestatic  #218                // Method java/lang/Math.abs:(I)I
       168: iload_3
       169: if_icmpgt     197
       172: aload         14
       174: invokevirtual #222                // Method ext/mods/gameserver/model/actor/Creature.getY:()I
       177: iload_2
       178: isub
       179: invokestatic  #218                // Method java/lang/Math.abs:(I)I
       182: iload         4
       184: if_icmpgt     197
       187: aload         5
       189: aload         14
       191: invokeinterface #223,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       196: pop
       197: goto          121
       200: iinc          11, 1
       203: goto          88
       206: iinc          10, 1
       209: goto          67
       212: aload         5
       214: areturn
      LineNumberTable:
        line 224: 0
        line 225: 9
        line 226: 21
        line 227: 33
        line 228: 46
        line 230: 59
        line 232: 80
        line 234: 101
        line 236: 143
        line 238: 158
        line 239: 187
        line 241: 197
        line 232: 200
        line 230: 206
        line 244: 212
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          158      39    14 creature   Lext/mods/gameserver/model/actor/Creature;
          143      54    13   obj   Lext/mods/gameserver/model/WorldObject;
           88     118    11    ry   I
           67     145    10    rx   I
            0     215     0  this   Lext/mods/gameserver/model/World;
            0     215     1     x   I
            0     215     2     y   I
            0     215     3 rangeX   I
            0     215     4 rangeY   I
            9     206     5 result   Ljava/util/List;
           21     194     6 startX   I
           33     182     7  endX   I
           46     169     8 startY   I
           59     156     9  endY   I
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            9     206     5 result   Ljava/util/List<Lext/mods/gameserver/model/actor/Creature;>;
      StackMapTable: number_of_entries = 7
        frame_type = 255 /* full_frame */
          offset_delta = 67
          locals = [ class ext/mods/gameserver/model/World, int, int, int, int, class java/util/List, int, int, int, int, int ]
          stack = []
        frame_type = 252 /* append */
          offset_delta = 20
          locals = [ int ]
        frame_type = 252 /* append */
          offset_delta = 32
          locals = [ class java/util/Iterator ]
        frame_type = 251 /* same_frame_extended */
          offset_delta = 75
        frame_type = 250 /* chop */
          offset_delta = 2
        frame_type = 250 /* chop */
          offset_delta = 5
        frame_type = 250 /* chop */
          offset_delta = 5
    Signature: #439                         // (IIII)Ljava/util/List<Lext/mods/gameserver/model/actor/Creature;>;

  public void deleteVisibleNpcSpawns();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=7, args_size=1
         0: getstatic     #39                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
         3: ldc           #229                // String Deleting all visible NPCs.
         5: invokevirtual #231                // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;)V
         8: iconst_0
         9: istore_1
        10: iload_1
        11: sipush        176
        14: if_icmpge     118
        17: iconst_0
        18: istore_2
        19: iload_2
        20: sipush        256
        23: if_icmpge     112
        26: aload_0
        27: getfield      #31                 // Field _worldRegions:[[Lext/mods/gameserver/model/WorldRegion;
        30: iload_1
        31: aaload
        32: iload_2
        33: aaload
        34: invokevirtual #199                // Method ext/mods/gameserver/model/WorldRegion.getObjects:()Ljava/util/Collection;
        37: invokeinterface #202,  1          // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
        42: astore_3
        43: aload_3
        44: invokeinterface #206,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        49: ifeq          106
        52: aload_3
        53: invokeinterface #211,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        58: checkcast     #58                 // class ext/mods/gameserver/model/WorldObject
        61: astore        4
        63: aload         4
        65: instanceof    #132                // class ext/mods/gameserver/model/actor/Npc
        68: ifeq          103
        71: aload         4
        73: checkcast     #132                // class ext/mods/gameserver/model/actor/Npc
        76: astore        5
        78: aload         5
        80: invokevirtual #234                // Method ext/mods/gameserver/model/actor/Npc.getSpawn:()Lext/mods/gameserver/model/spawn/ASpawn;
        83: astore        6
        85: aload         6
        87: ifnull        98
        90: aload         6
        92: invokevirtual #238                // Method ext/mods/gameserver/model/spawn/ASpawn.doDelete:()V
        95: goto          103
        98: aload         5
       100: invokevirtual #243                // Method ext/mods/gameserver/model/actor/Npc.deleteMe:()V
       103: goto          43
       106: iinc          2, 1
       109: goto          19
       112: iinc          1, 1
       115: goto          10
       118: getstatic     #39                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
       121: ldc           #246                // String All visibles NPCs are now deleted.
       123: invokevirtual #231                // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;)V
       126: return
      LineNumberTable:
        line 253: 0
        line 254: 8
        line 256: 17
        line 258: 26
        line 260: 63
        line 262: 78
        line 263: 85
        line 264: 90
        line 266: 98
        line 268: 103
        line 256: 106
        line 254: 112
        line 271: 118
        line 272: 126
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           85      18     6 spawn   Lext/mods/gameserver/model/spawn/ASpawn;
           78      25     5   npc   Lext/mods/gameserver/model/actor/Npc;
           63      40     4   obj   Lext/mods/gameserver/model/WorldObject;
           19      93     2     j   I
           10     108     1     i   I
            0     127     0  this   Lext/mods/gameserver/model/World;
      StackMapTable: number_of_entries = 8
        frame_type = 252 /* append */
          offset_delta = 10
          locals = [ int ]
        frame_type = 252 /* append */
          offset_delta = 8
          locals = [ int ]
        frame_type = 252 /* append */
          offset_delta = 23
          locals = [ class java/util/Iterator ]
        frame_type = 254 /* append */
          offset_delta = 54
          locals = [ class ext/mods/gameserver/model/WorldObject, class ext/mods/gameserver/model/actor/Npc, class ext/mods/gameserver/model/spawn/ASpawn ]
        frame_type = 248 /* chop */
          offset_delta = 4
        frame_type = 250 /* chop */
          offset_delta = 2
        frame_type = 250 /* chop */
          offset_delta = 5
        frame_type = 250 /* chop */
          offset_delta = 5

  public static void toAllOnlinePlayers(ext.mods.gameserver.network.serverpackets.L2GameServerPacket);
    descriptor: (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=3, args_size=1
         0: invokestatic  #248                // Method getInstance:()Lext/mods/gameserver/model/World;
         3: invokevirtual #251                // Method getPlayers:()Ljava/util/Collection;
         6: invokeinterface #202,  1          // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
        11: astore_1
        12: aload_1
        13: invokeinterface #206,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        18: ifeq          46
        21: aload_1
        22: invokeinterface #211,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        27: checkcast     #144                // class ext/mods/gameserver/model/actor/Player
        30: astore_2
        31: aload_2
        32: invokevirtual #254                // Method ext/mods/gameserver/model/actor/Player.isOnline:()Z
        35: ifeq          43
        38: aload_2
        39: aload_0
        40: invokevirtual #257                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        43: goto          12
        46: return
      LineNumberTable:
        line 280: 0
        line 282: 31
        line 283: 38
        line 284: 43
        line 285: 46
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           31      12     2 player   Lext/mods/gameserver/model/actor/Player;
            0      47     0 packet   Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;
      StackMapTable: number_of_entries = 3
        frame_type = 252 /* append */
          offset_delta = 12
          locals = [ class java/util/Iterator ]
        frame_type = 30 /* same */
        frame_type = 250 /* chop */
          offset_delta = 2

  public static void announceToOnlinePlayers(java.lang.String);
    descriptor: (Ljava/lang/String;)V
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=5, locals=1, args_size=1
         0: new           #261                // class ext/mods/gameserver/network/serverpackets/CreatureSay
         3: dup
         4: getstatic     #263                // Field ext/mods/gameserver/enums/SayType.ANNOUNCEMENT:Lext/mods/gameserver/enums/SayType;
         7: aconst_null
         8: aload_0
         9: invokespecial #269                // Method ext/mods/gameserver/network/serverpackets/CreatureSay."<init>":(Lext/mods/gameserver/enums/SayType;Ljava/lang/String;Ljava/lang/String;)V
        12: invokestatic  #272                // Method toAllOnlinePlayers:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        15: return
      LineNumberTable:
        line 289: 0
        line 290: 15
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      16     0  text   Ljava/lang/String;

  public static void announceToOnlinePlayers(java.lang.String, boolean);
    descriptor: (Ljava/lang/String;Z)V
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=5, locals=2, args_size=2
         0: new           #261                // class ext/mods/gameserver/network/serverpackets/CreatureSay
         3: dup
         4: iload_1
         5: ifeq          14
         8: getstatic     #275                // Field ext/mods/gameserver/enums/SayType.CRITICAL_ANNOUNCE:Lext/mods/gameserver/enums/SayType;
        11: goto          17
        14: getstatic     #263                // Field ext/mods/gameserver/enums/SayType.ANNOUNCEMENT:Lext/mods/gameserver/enums/SayType;
        17: aconst_null
        18: aload_0
        19: invokespecial #269                // Method ext/mods/gameserver/network/serverpackets/CreatureSay."<init>":(Lext/mods/gameserver/enums/SayType;Ljava/lang/String;Ljava/lang/String;)V
        22: invokestatic  #272                // Method toAllOnlinePlayers:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        25: return
      LineNumberTable:
        line 294: 0
        line 295: 25
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      26     0  text   Ljava/lang/String;
            0      26     1 critical   Z
      StackMapTable: number_of_entries = 2
        frame_type = 255 /* full_frame */
          offset_delta = 14
          locals = [ class java/lang/String, int ]
          stack = [ uninitialized 0, uninitialized 0 ]
        frame_type = 255 /* full_frame */
          offset_delta = 2
          locals = [ class java/lang/String, int ]
          stack = [ uninitialized 0, uninitialized 0, class ext/mods/gameserver/enums/SayType ]

  public static void broadcastToSameRegion(ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.network.serverpackets.L2GameServerPacket);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=6, args_size=2
         0: invokestatic  #278                // Method ext/mods/gameserver/data/xml/RestartPointData.getInstance:()Lext/mods/gameserver/data/xml/RestartPointData;
         3: aload_0
         4: invokevirtual #283                // Method ext/mods/gameserver/data/xml/RestartPointData.getRestartPoint:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/model/restart/RestartPoint;
         7: astore_2
         8: invokestatic  #248                // Method getInstance:()Lext/mods/gameserver/model/World;
        11: invokevirtual #251                // Method getPlayers:()Ljava/util/Collection;
        14: invokeinterface #202,  1          // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
        19: astore_3
        20: aload_3
        21: invokeinterface #206,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        26: ifeq          76
        29: aload_3
        30: invokeinterface #211,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        35: checkcast     #144                // class ext/mods/gameserver/model/actor/Player
        38: astore        4
        40: aload         4
        42: invokevirtual #254                // Method ext/mods/gameserver/model/actor/Player.isOnline:()Z
        45: ifne          51
        48: goto          20
        51: invokestatic  #278                // Method ext/mods/gameserver/data/xml/RestartPointData.getInstance:()Lext/mods/gameserver/data/xml/RestartPointData;
        54: aload         4
        56: invokevirtual #283                // Method ext/mods/gameserver/data/xml/RestartPointData.getRestartPoint:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/model/restart/RestartPoint;
        59: astore        5
        61: aload_2
        62: aload         5
        64: if_acmpne     73
        67: aload         4
        69: aload_1
        70: invokevirtual #257                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        73: goto          20
        76: return
      LineNumberTable:
        line 299: 0
        line 301: 8
        line 303: 40
        line 304: 48
        line 306: 51
        line 307: 61
        line 308: 67
        line 309: 73
        line 310: 76
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           61      12     5  plRp   Lext/mods/gameserver/model/restart/RestartPoint;
           40      33     4    pl   Lext/mods/gameserver/model/actor/Player;
            0      77     0 creature   Lext/mods/gameserver/model/actor/Creature;
            0      77     1 packet   Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;
            8      69     2 creatureRp   Lext/mods/gameserver/model/restart/RestartPoint;
      StackMapTable: number_of_entries = 4
        frame_type = 253 /* append */
          offset_delta = 20
          locals = [ class ext/mods/gameserver/model/restart/RestartPoint, class java/util/Iterator ]
        frame_type = 252 /* append */
          offset_delta = 30
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 250 /* chop */
          offset_delta = 21
        frame_type = 250 /* chop */
          offset_delta = 2

  public static boolean isOutOfWorld(int, int);
    descriptor: (II)Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=4, locals=2, args_size=2
         0: iload_0
         1: iload_0
         2: iload_1
         3: iload_1
         4: invokestatic  #287                // Method isOutOfWorld:(IIII)Z
         7: ireturn
      LineNumberTable:
        line 320: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0     x   I
            0       8     1     y   I

  public static boolean isOutOfWorld(int, int, int, int);
    descriptor: (IIII)Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=4, args_size=4
         0: iload_0
         1: ldc           #176                // int -131072
         3: if_icmplt     26
         6: iload_1
         7: ldc_w         #291                // int 229375
        10: if_icmpgt     26
        13: iload_2
        14: ldc           #177                // int -262144
        16: if_icmplt     26
        19: iload_3
        20: ldc_w         #292                // int 262143
        23: if_icmple     30
        26: iconst_1
        27: goto          31
        30: iconst_0
        31: ireturn
      LineNumberTable:
        line 333: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      32     0  minX   I
            0      32     1  maxX   I
            0      32     2  minY   I
            0      32     3  maxY   I
      StackMapTable: number_of_entries = 3
        frame_type = 26 /* same */
        frame_type = 3 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public int getTraderCount();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=5, args_size=1
         0: iconst_0
         1: istore_1
         2: aload_0
         3: getfield      #26                 // Field _players:Ljava/util/Map;
         6: invokeinterface #105,  1          // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
        11: invokeinterface #202,  1          // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
        16: astore_2
        17: aload_2
        18: invokeinterface #206,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        23: ifeq          79
        26: aload_2
        27: invokeinterface #211,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        32: checkcast     #144                // class ext/mods/gameserver/model/actor/Player
        35: astore_3
        36: aload_3
        37: ifnull        76
        40: aload_3
        41: invokevirtual #254                // Method ext/mods/gameserver/model/actor/Player.isOnline:()Z
        44: ifeq          76
        47: aload_3
        48: invokevirtual #293                // Method ext/mods/gameserver/model/actor/Player.getClient:()Lext/mods/gameserver/network/GameClient;
        51: astore        4
        53: aload_3
        54: invokevirtual #297                // Method ext/mods/gameserver/model/actor/Player.isInStoreMode:()Z
        57: ifne          73
        60: aload         4
        62: ifnull        76
        65: aload         4
        67: invokevirtual #300                // Method ext/mods/gameserver/network/GameClient.isDetached:()Z
        70: ifeq          76
        73: iinc          1, 1
        76: goto          17
        79: iload_1
        80: ireturn
      LineNumberTable:
        line 338: 0
        line 340: 2
        line 342: 36
        line 344: 47
        line 345: 53
        line 346: 73
        line 348: 76
        line 350: 79
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           53      23     4 client   Lext/mods/gameserver/network/GameClient;
           36      40     3 player   Lext/mods/gameserver/model/actor/Player;
            0      81     0  this   Lext/mods/gameserver/model/World;
            2      79     1 traderCount   I
      StackMapTable: number_of_entries = 4
        frame_type = 253 /* append */
          offset_delta = 17
          locals = [ int, class java/util/Iterator ]
        frame_type = 253 /* append */
          offset_delta = 55
          locals = [ class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/network/GameClient ]
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 250 /* chop */
          offset_delta = 2

  public int getMaxOnline();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=1
         0: aload_0
         1: getfield      #26                 // Field _players:Ljava/util/Map;
         4: invokeinterface #305,  1          // InterfaceMethod java/util/Map.size:()I
         9: istore_1
        10: iload_1
        11: aload_0
        12: getfield      #308                // Field _maxOnline:I
        15: if_icmple     23
        18: aload_0
        19: iload_1
        20: putfield      #308                // Field _maxOnline:I
        23: aload_0
        24: getfield      #308                // Field _maxOnline:I
        27: ireturn
      LineNumberTable:
        line 355: 0
        line 356: 10
        line 357: 18
        line 359: 23
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      28     0  this   Lext/mods/gameserver/model/World;
           10      18     1 currentOnline   I
      StackMapTable: number_of_entries = 1
        frame_type = 252 /* append */
          offset_delta = 23
          locals = [ int ]

  public int getOnlinePlayerCount();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=5, args_size=1
         0: iconst_0
         1: istore_1
         2: aload_0
         3: getfield      #26                 // Field _players:Ljava/util/Map;
         6: invokeinterface #105,  1          // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
        11: invokeinterface #202,  1          // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
        16: astore_2
        17: aload_2
        18: invokeinterface #206,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        23: ifeq          72
        26: aload_2
        27: invokeinterface #211,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        32: checkcast     #144                // class ext/mods/gameserver/model/actor/Player
        35: astore_3
        36: aload_3
        37: ifnull        69
        40: aload_3
        41: invokevirtual #254                // Method ext/mods/gameserver/model/actor/Player.isOnline:()Z
        44: ifeq          69
        47: aload_3
        48: invokevirtual #293                // Method ext/mods/gameserver/model/actor/Player.getClient:()Lext/mods/gameserver/network/GameClient;
        51: astore        4
        53: aload         4
        55: ifnull        69
        58: aload         4
        60: invokevirtual #300                // Method ext/mods/gameserver/network/GameClient.isDetached:()Z
        63: ifne          69
        66: iinc          1, 1
        69: goto          17
        72: iload_1
        73: ireturn
      LineNumberTable:
        line 364: 0
        line 366: 2
        line 368: 36
        line 370: 47
        line 371: 53
        line 372: 66
        line 374: 69
        line 376: 72
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           53      16     4 client   Lext/mods/gameserver/network/GameClient;
           36      33     3 player   Lext/mods/gameserver/model/actor/Player;
            0      74     0  this   Lext/mods/gameserver/model/World;
            2      72     1 onlinePlayerCount   I
      StackMapTable: number_of_entries = 3
        frame_type = 253 /* append */
          offset_delta = 17
          locals = [ int, class java/util/Iterator ]
        frame_type = 51 /* same */
        frame_type = 250 /* chop */
          offset_delta = 2

  public static void announceToOnlinePlayers(int, java.lang.String);
    descriptor: (ILjava/lang/String;)V
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=11, locals=4, args_size=2
         0: invokestatic  #248                // Method getInstance:()Lext/mods/gameserver/model/World;
         3: invokevirtual #251                // Method getPlayers:()Ljava/util/Collection;
         6: invokeinterface #202,  1          // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
        11: astore_2
        12: aload_2
        13: invokeinterface #206,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        18: ifeq          69
        21: aload_2
        22: invokeinterface #211,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        27: checkcast     #144                // class ext/mods/gameserver/model/actor/Player
        30: astore_3
        31: aload_3
        32: invokevirtual #254                // Method ext/mods/gameserver/model/actor/Player.isOnline:()Z
        35: ifeq          66
        38: aload_3
        39: new           #261                // class ext/mods/gameserver/network/serverpackets/CreatureSay
        42: dup
        43: getstatic     #263                // Field ext/mods/gameserver/enums/SayType.ANNOUNCEMENT:Lext/mods/gameserver/enums/SayType;
        46: aconst_null
        47: aload_3
        48: iload_0
        49: iconst_1
        50: anewarray     #4                  // class java/lang/Object
        53: dup
        54: iconst_0
        55: aload_1
        56: aastore
        57: invokevirtual #311                // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
        60: invokespecial #269                // Method ext/mods/gameserver/network/serverpackets/CreatureSay."<init>":(Lext/mods/gameserver/enums/SayType;Ljava/lang/String;Ljava/lang/String;)V
        63: invokevirtual #257                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        66: goto          12
        69: return
      LineNumberTable:
        line 381: 0
        line 383: 31
        line 384: 38
        line 385: 66
        line 386: 69
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           31      35     3 player   Lext/mods/gameserver/model/actor/Player;
            0      70     0    id   I
            0      70     1  name   Ljava/lang/String;
      StackMapTable: number_of_entries = 3
        frame_type = 252 /* append */
          offset_delta = 12
          locals = [ class java/util/Iterator ]
        frame_type = 53 /* same */
        frame_type = 250 /* chop */
          offset_delta = 2

  public static void announceToOnlinePlayers(int, java.lang.Object...);
    descriptor: (I[Ljava/lang/Object;)V
    flags: (0x0089) ACC_PUBLIC, ACC_STATIC, ACC_VARARGS
    Code:
      stack=8, locals=4, args_size=2
         0: invokestatic  #248                // Method getInstance:()Lext/mods/gameserver/model/World;
         3: invokevirtual #251                // Method getPlayers:()Ljava/util/Collection;
         6: invokeinterface #202,  1          // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
        11: astore_2
        12: aload_2
        13: invokeinterface #206,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        18: ifeq          62
        21: aload_2
        22: invokeinterface #211,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        27: checkcast     #144                // class ext/mods/gameserver/model/actor/Player
        30: astore_3
        31: aload_3
        32: invokevirtual #254                // Method ext/mods/gameserver/model/actor/Player.isOnline:()Z
        35: ifeq          59
        38: aload_3
        39: new           #261                // class ext/mods/gameserver/network/serverpackets/CreatureSay
        42: dup
        43: getstatic     #263                // Field ext/mods/gameserver/enums/SayType.ANNOUNCEMENT:Lext/mods/gameserver/enums/SayType;
        46: aconst_null
        47: aload_3
        48: iload_0
        49: aload_1
        50: invokevirtual #311                // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
        53: invokespecial #269                // Method ext/mods/gameserver/network/serverpackets/CreatureSay."<init>":(Lext/mods/gameserver/enums/SayType;Ljava/lang/String;Ljava/lang/String;)V
        56: invokevirtual #257                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        59: goto          12
        62: return
      LineNumberTable:
        line 390: 0
        line 392: 31
        line 393: 38
        line 394: 59
        line 395: 62
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           31      28     3 player   Lext/mods/gameserver/model/actor/Player;
            0      63     0    id   I
            0      63     1  args   [Ljava/lang/Object;
      StackMapTable: number_of_entries = 3
        frame_type = 252 /* append */
          offset_delta = 12
          locals = [ class java/util/Iterator ]
        frame_type = 46 /* same */
        frame_type = 250 /* chop */
          offset_delta = 2

  public static ext.mods.gameserver.model.World getInstance();
    descriptor: ()Lext/mods/gameserver/model/World;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #315                // Field ext/mods/gameserver/model/World$SingletonHolder.INSTANCE:Lext/mods/gameserver/model/World;
         3: areturn
      LineNumberTable:
        line 399: 0

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=3, locals=0, args_size=0
         0: new           #52                 // class ext/mods/commons/logging/CLogger
         3: dup
         4: ldc           #1                  // class ext/mods/gameserver/model/World
         6: invokevirtual #324                // Method java/lang/Class.getName:()Ljava/lang/String;
         9: invokespecial #330                // Method ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
        12: putstatic     #39                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
        15: bipush        -64
        17: invokestatic  #218                // Method java/lang/Math.abs:(I)I
        20: putstatic     #158                // Field REGION_X_OFFSET:I
        23: bipush        -128
        25: invokestatic  #218                // Method java/lang/Math.abs:(I)I
        28: putstatic     #161                // Field REGION_Y_OFFSET:I
        31: return
      LineNumberTable:
        line 46: 0
        line 66: 15
        line 67: 23
}
SourceFile: "World.java"
NestMembers:
  ext/mods/gameserver/model/World$SingletonHolder
BootstrapMethods:
  0: #511 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #492 (Ljava/lang/Object;)Ljava/lang/Object;
      #493 REF_invokeVirtual ext/mods/gameserver/model/WorldObject.getObjectId:()I
      #494 (Lext/mods/gameserver/model/WorldObject;)Ljava/lang/Integer;
  1: #511 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #496 (Ljava/lang/Object;)Z
      #497 REF_invokeStatic ext/mods/gameserver/model/World.lambda$getNpc$0:(ILext/mods/gameserver/model/WorldObject;)Z
      #500 (Lext/mods/gameserver/model/WorldObject;)Z
  2: #511 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #496 (Ljava/lang/Object;)Z
      #502 REF_invokeStatic ext/mods/gameserver/model/World.lambda$getNpcs$0:(ILext/mods/gameserver/model/WorldObject;)Z
      #500 (Lext/mods/gameserver/model/WorldObject;)Z
  3: #511 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #492 (Ljava/lang/Object;)Ljava/lang/Object;
      #505 REF_invokeVirtual java/lang/Class.cast:(Ljava/lang/Object;)Ljava/lang/Object;
      #509 (Lext/mods/gameserver/model/WorldObject;)Lext/mods/gameserver/model/actor/Npc;
InnerClasses:
  public static final #524= #520 of #522; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
