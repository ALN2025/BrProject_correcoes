// Bytecode for: ext.mods.gameserver.model.actor.move.MovementIntegration
// File: ext\mods\gameserver\model\actor\move\MovementIntegration.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/actor/move/MovementIntegration.class
  Last modified 9 de jul de 2026; size 12738 bytes
  MD5 checksum f08852003d20ee7ada6a01e05481e8c2
  Compiled from "MovementIntegration.java"
public class ext.mods.gameserver.model.actor.move.MovementIntegration
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/actor/move/MovementIntegration
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 5, methods: 27, attributes: 4
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Methodref          #8.#9         // ext/mods/gameserver/model/actor/move/MovementIntegration.startGlobalValidationTask:()V
    #8 = Class              #10           // ext/mods/gameserver/model/actor/move/MovementIntegration
    #9 = NameAndType        #11:#6        // startGlobalValidationTask:()V
   #10 = Utf8               ext/mods/gameserver/model/actor/move/MovementIntegration
   #11 = Utf8               startGlobalValidationTask
   #12 = Fieldref           #13.#14       // ext/mods/gameserver/model/actor/move/MovementIntegration$SingletonHolder.INSTANCE:Lext/mods/gameserver/model/actor/move/MovementIntegration;
   #13 = Class              #15           // ext/mods/gameserver/model/actor/move/MovementIntegration$SingletonHolder
   #14 = NameAndType        #16:#17       // INSTANCE:Lext/mods/gameserver/model/actor/move/MovementIntegration;
   #15 = Utf8               ext/mods/gameserver/model/actor/move/MovementIntegration$SingletonHolder
   #16 = Utf8               INSTANCE
   #17 = Utf8               Lext/mods/gameserver/model/actor/move/MovementIntegration;
   #18 = Fieldref           #8.#19        // ext/mods/gameserver/model/actor/move/MovementIntegration._globalValidationTask:Ljava/util/concurrent/ScheduledFuture;
   #19 = NameAndType        #20:#21       // _globalValidationTask:Ljava/util/concurrent/ScheduledFuture;
   #20 = Utf8               _globalValidationTask
   #21 = Utf8               Ljava/util/concurrent/ScheduledFuture;
   #22 = InvokeDynamic      #0:#23        // #0:run:(Lext/mods/gameserver/model/actor/move/MovementIntegration;)Ljava/lang/Runnable;
   #23 = NameAndType        #24:#25       // run:(Lext/mods/gameserver/model/actor/move/MovementIntegration;)Ljava/lang/Runnable;
   #24 = Utf8               run
   #25 = Utf8               (Lext/mods/gameserver/model/actor/move/MovementIntegration;)Ljava/lang/Runnable;
   #26 = Long               500l
   #28 = Methodref          #29.#30       // ext/mods/commons/pool/ThreadPool.scheduleAtFixedRate:(Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
   #29 = Class              #31           // ext/mods/commons/pool/ThreadPool
   #30 = NameAndType        #32:#33       // scheduleAtFixedRate:(Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
   #31 = Utf8               ext/mods/commons/pool/ThreadPool
   #32 = Utf8               scheduleAtFixedRate
   #33 = Utf8               (Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
   #34 = Fieldref           #8.#35        // ext/mods/gameserver/model/actor/move/MovementIntegration._predictions:Ljava/util/concurrent/ConcurrentMap;
   #35 = NameAndType        #36:#37       // _predictions:Ljava/util/concurrent/ConcurrentMap;
   #36 = Utf8               _predictions
   #37 = Utf8               Ljava/util/concurrent/ConcurrentMap;
   #38 = InterfaceMethodref #39.#40       // java/util/concurrent/ConcurrentMap.isEmpty:()Z
   #39 = Class              #41           // java/util/concurrent/ConcurrentMap
   #40 = NameAndType        #42:#43       // isEmpty:()Z
   #41 = Utf8               java/util/concurrent/ConcurrentMap
   #42 = Utf8               isEmpty
   #43 = Utf8               ()Z
   #44 = InterfaceMethodref #39.#45       // java/util/concurrent/ConcurrentMap.entrySet:()Ljava/util/Set;
   #45 = NameAndType        #46:#47       // entrySet:()Ljava/util/Set;
   #46 = Utf8               entrySet
   #47 = Utf8               ()Ljava/util/Set;
   #48 = InterfaceMethodref #49.#50       // java/util/Set.iterator:()Ljava/util/Iterator;
   #49 = Class              #51           // java/util/Set
   #50 = NameAndType        #52:#53       // iterator:()Ljava/util/Iterator;
   #51 = Utf8               java/util/Set
   #52 = Utf8               iterator
   #53 = Utf8               ()Ljava/util/Iterator;
   #54 = InterfaceMethodref #55.#56       // java/util/Iterator.hasNext:()Z
   #55 = Class              #57           // java/util/Iterator
   #56 = NameAndType        #58:#43       // hasNext:()Z
   #57 = Utf8               java/util/Iterator
   #58 = Utf8               hasNext
   #59 = InterfaceMethodref #55.#60       // java/util/Iterator.next:()Ljava/lang/Object;
   #60 = NameAndType        #61:#62       // next:()Ljava/lang/Object;
   #61 = Utf8               next
   #62 = Utf8               ()Ljava/lang/Object;
   #63 = Class              #64           // java/util/Map$Entry
   #64 = Utf8               java/util/Map$Entry
   #65 = InterfaceMethodref #63.#66       // java/util/Map$Entry.getKey:()Ljava/lang/Object;
   #66 = NameAndType        #67:#62       // getKey:()Ljava/lang/Object;
   #67 = Utf8               getKey
   #68 = Class              #69           // java/lang/Integer
   #69 = Utf8               java/lang/Integer
   #70 = Methodref          #68.#71       // java/lang/Integer.intValue:()I
   #71 = NameAndType        #72:#73       // intValue:()I
   #72 = Utf8               intValue
   #73 = Utf8               ()I
   #74 = InterfaceMethodref #63.#75       // java/util/Map$Entry.getValue:()Ljava/lang/Object;
   #75 = NameAndType        #76:#62       // getValue:()Ljava/lang/Object;
   #76 = Utf8               getValue
   #77 = Class              #78           // ext/mods/gameserver/model/actor/move/MovementIntegration$MovementPrediction
   #78 = Utf8               ext/mods/gameserver/model/actor/move/MovementIntegration$MovementPrediction
   #79 = Methodref          #80.#81       // ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
   #80 = Class              #82           // ext/mods/gameserver/model/World
   #81 = NameAndType        #83:#84       // getInstance:()Lext/mods/gameserver/model/World;
   #82 = Utf8               ext/mods/gameserver/model/World
   #83 = Utf8               getInstance
   #84 = Utf8               ()Lext/mods/gameserver/model/World;
   #85 = Methodref          #80.#86       // ext/mods/gameserver/model/World.getObject:(I)Lext/mods/gameserver/model/WorldObject;
   #86 = NameAndType        #87:#88       // getObject:(I)Lext/mods/gameserver/model/WorldObject;
   #87 = Utf8               getObject
   #88 = Utf8               (I)Lext/mods/gameserver/model/WorldObject;
   #89 = Class              #90           // ext/mods/gameserver/model/actor/Player
   #90 = Utf8               ext/mods/gameserver/model/actor/Player
   #91 = Methodref          #68.#92       // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
   #92 = NameAndType        #93:#94       // valueOf:(I)Ljava/lang/Integer;
   #93 = Utf8               valueOf
   #94 = Utf8               (I)Ljava/lang/Integer;
   #95 = InterfaceMethodref #39.#96       // java/util/concurrent/ConcurrentMap.remove:(Ljava/lang/Object;)Ljava/lang/Object;
   #96 = NameAndType        #97:#98       // remove:(Ljava/lang/Object;)Ljava/lang/Object;
   #97 = Utf8               remove
   #98 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
   #99 = Methodref          #89.#100      // ext/mods/gameserver/model/actor/Player.isMoving:()Z
  #100 = NameAndType        #101:#43      // isMoving:()Z
  #101 = Utf8               isMoving
  #102 = Methodref          #89.#103      // ext/mods/gameserver/model/actor/Player.isDead:()Z
  #103 = NameAndType        #104:#43      // isDead:()Z
  #104 = Utf8               isDead
  #105 = Methodref          #8.#106       // ext/mods/gameserver/model/actor/move/MovementIntegration.validateSinglePlayer:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/move/MovementIntegration$MovementPrediction;)V
  #106 = NameAndType        #107:#108     // validateSinglePlayer:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/move/MovementIntegration$MovementPrediction;)V
  #107 = Utf8               validateSinglePlayer
  #108 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/move/MovementIntegration$MovementPrediction;)V
  #109 = Methodref          #89.#110      // ext/mods/gameserver/model/actor/Player.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
  #110 = NameAndType        #111:#112     // getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
  #111 = Utf8               getPosition
  #112 = Utf8               ()Lext/mods/gameserver/model/location/SpawnLocation;
  #113 = Methodref          #114.#115     // ext/mods/gameserver/model/location/SpawnLocation.clone:()Lext/mods/gameserver/model/location/SpawnLocation;
  #114 = Class              #116          // ext/mods/gameserver/model/location/SpawnLocation
  #115 = NameAndType        #117:#112     // clone:()Lext/mods/gameserver/model/location/SpawnLocation;
  #116 = Utf8               ext/mods/gameserver/model/location/SpawnLocation
  #117 = Utf8               clone
  #118 = Methodref          #8.#119       // ext/mods/gameserver/model/actor/move/MovementIntegration.calculatePredictedPosition:(Lext/mods/gameserver/model/actor/move/MovementIntegration$MovementPrediction;)Lext/mods/gameserver/model/location/Location;
  #119 = NameAndType        #120:#121     // calculatePredictedPosition:(Lext/mods/gameserver/model/actor/move/MovementIntegration$MovementPrediction;)Lext/mods/gameserver/model/location/Location;
  #120 = Utf8               calculatePredictedPosition
  #121 = Utf8               (Lext/mods/gameserver/model/actor/move/MovementIntegration$MovementPrediction;)Lext/mods/gameserver/model/location/Location;
  #122 = Methodref          #123.#124     // ext/mods/gameserver/model/location/Location.distance3D:(Lext/mods/gameserver/model/location/Location;)D
  #123 = Class              #125          // ext/mods/gameserver/model/location/Location
  #124 = NameAndType        #126:#127     // distance3D:(Lext/mods/gameserver/model/location/Location;)D
  #125 = Utf8               ext/mods/gameserver/model/location/Location
  #126 = Utf8               distance3D
  #127 = Utf8               (Lext/mods/gameserver/model/location/Location;)D
  #128 = Double             64.0d
  #130 = Methodref          #8.#131       // ext/mods/gameserver/model/actor/move/MovementIntegration.reconcilePosition:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/location/Location;)V
  #131 = NameAndType        #132:#133     // reconcilePosition:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/location/Location;)V
  #132 = Utf8               reconcilePosition
  #133 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/location/Location;)V
  #134 = Methodref          #8.#135       // ext/mods/gameserver/model/actor/move/MovementIntegration.hasReachedDestination:(Lext/mods/gameserver/model/actor/move/MovementIntegration$MovementPrediction;Lext/mods/gameserver/model/location/Location;)Z
  #135 = NameAndType        #136:#137     // hasReachedDestination:(Lext/mods/gameserver/model/actor/move/MovementIntegration$MovementPrediction;Lext/mods/gameserver/model/location/Location;)Z
  #136 = Utf8               hasReachedDestination
  #137 = Utf8               (Lext/mods/gameserver/model/actor/move/MovementIntegration$MovementPrediction;Lext/mods/gameserver/model/location/Location;)Z
  #138 = Methodref          #8.#139       // ext/mods/gameserver/model/actor/move/MovementIntegration.completeMovement:(Lext/mods/gameserver/model/actor/Creature;)V
  #139 = NameAndType        #140:#141     // completeMovement:(Lext/mods/gameserver/model/actor/Creature;)V
  #140 = Utf8               completeMovement
  #141 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)V
  #142 = Methodref          #143.#144     // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager.getInstance:()Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager;
  #143 = Class              #145          // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager
  #144 = NameAndType        #83:#146      // getInstance:()Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager;
  #145 = Utf8               ext/mods/gameserver/model/entity/autofarm/AutoFarmManager
  #146 = Utf8               ()Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager;
  #147 = Methodref          #143.#148     // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager.getProfile:(Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
  #148 = NameAndType        #149:#150     // getProfile:(Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
  #149 = Utf8               getProfile
  #150 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
  #151 = Methodref          #152.#153     // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.isEnabled:()Z
  #152 = Class              #154          // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile
  #153 = NameAndType        #155:#43      // isEnabled:()Z
  #154 = Utf8               ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile
  #155 = Utf8               isEnabled
  #156 = Methodref          #152.#157     // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getSelectedArea:()Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;
  #157 = NameAndType        #158:#159     // getSelectedArea:()Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;
  #158 = Utf8               getSelectedArea
  #159 = Utf8               ()Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;
  #160 = Methodref          #161.#162     // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.getType:()Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;
  #161 = Class              #163          // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea
  #162 = NameAndType        #164:#165     // getType:()Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;
  #163 = Utf8               ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea
  #164 = Utf8               getType
  #165 = Utf8               ()Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;
  #166 = Fieldref           #167.#168     // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType.ZONA:Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;
  #167 = Class              #169          // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType
  #168 = NameAndType        #170:#171     // ZONA:Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;
  #169 = Utf8               ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType
  #170 = Utf8               ZONA
  #171 = Utf8               Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;
  #172 = Methodref          #152.#173     // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getAnchorLocation:()Lext/mods/gameserver/model/location/Location;
  #173 = NameAndType        #174:#175     // getAnchorLocation:()Lext/mods/gameserver/model/location/Location;
  #174 = Utf8               getAnchorLocation
  #175 = Utf8               ()Lext/mods/gameserver/model/location/Location;
  #176 = Methodref          #152.#177     // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getFinalRadius:()I
  #177 = NameAndType        #178:#73      // getFinalRadius:()I
  #178 = Utf8               getFinalRadius
  #179 = Methodref          #123.#180     // ext/mods/gameserver/model/location/Location.distance2D:(Lext/mods/gameserver/model/location/Point2D;)D
  #180 = NameAndType        #181:#182     // distance2D:(Lext/mods/gameserver/model/location/Point2D;)D
  #181 = Utf8               distance2D
  #182 = Utf8               (Lext/mods/gameserver/model/location/Point2D;)D
  #183 = String             #184          // Modo Fechado: Você não pode sair da área delimitada.
  #184 = Utf8               Modo Fechado: Você não pode sair da área delimitada.
  #185 = Methodref          #89.#186      // ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
  #186 = NameAndType        #187:#188     // sendMessage:(Ljava/lang/String;)V
  #187 = Utf8               sendMessage
  #188 = Utf8               (Ljava/lang/String;)V
  #189 = Methodref          #8.#190       // ext/mods/gameserver/model/actor/move/MovementIntegration.visualizeFarmLimit:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/location/Location;I)V
  #190 = NameAndType        #191:#192     // visualizeFarmLimit:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/location/Location;I)V
  #191 = Utf8               visualizeFarmLimit
  #192 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/location/Location;I)V
  #193 = Fieldref           #194.#195     // ext/mods/Config.SISTEMA_PATHFINDING:Z
  #194 = Class              #196          // ext/mods/Config
  #195 = NameAndType        #197:#198     // SISTEMA_PATHFINDING:Z
  #196 = Utf8               ext/mods/Config
  #197 = Utf8               SISTEMA_PATHFINDING
  #198 = Utf8               Z
  #199 = Fieldref           #194.#200     // ext/mods/Config.USE_OPTIMIZED_MOVEMENT:Z
  #200 = NameAndType        #201:#198     // USE_OPTIMIZED_MOVEMENT:Z
  #201 = Utf8               USE_OPTIMIZED_MOVEMENT
  #202 = Methodref          #203.#204     // ext/mods/gameserver/model/actor/Creature.setMove:()V
  #203 = Class              #205          // ext/mods/gameserver/model/actor/Creature
  #204 = NameAndType        #206:#6       // setMove:()V
  #205 = Utf8               ext/mods/gameserver/model/actor/Creature
  #206 = Utf8               setMove
  #207 = Methodref          #208.#209     // ext/mods/gameserver/geoengine/GeoEngine.getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
  #208 = Class              #210          // ext/mods/gameserver/geoengine/GeoEngine
  #209 = NameAndType        #83:#211      // getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
  #210 = Utf8               ext/mods/gameserver/geoengine/GeoEngine
  #211 = Utf8               ()Lext/mods/gameserver/geoengine/GeoEngine;
  #212 = Methodref          #208.#213     // ext/mods/gameserver/geoengine/GeoEngine.canMoveToTarget:(IIIIII)Z
  #213 = NameAndType        #214:#215     // canMoveToTarget:(IIIIII)Z
  #214 = Utf8               canMoveToTarget
  #215 = Utf8               (IIIIII)Z
  #216 = Methodref          #208.#217     // ext/mods/gameserver/geoengine/GeoEngine.getValidLocation:(IIIIIILext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Lext/mods/gameserver/model/location/Location;
  #217 = NameAndType        #218:#219     // getValidLocation:(IIIIIILext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Lext/mods/gameserver/model/location/Location;
  #218 = Utf8               getValidLocation
  #219 = Utf8               (IIIIIILext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Lext/mods/gameserver/model/location/Location;
  #220 = Methodref          #208.#221     // ext/mods/gameserver/geoengine/GeoEngine.canSee:(IIIDIIIDLext/mods/gameserver/geoengine/geodata/IGeoObject;Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Z
  #221 = NameAndType        #222:#223     // canSee:(IIIDIIIDLext/mods/gameserver/geoengine/geodata/IGeoObject;Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Z
  #222 = Utf8               canSee
  #223 = Utf8               (IIIDIIIDLext/mods/gameserver/geoengine/geodata/IGeoObject;Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Z
  #224 = Methodref          #225.#226     // ext/mods/gameserver/model/WorldObject.getX:()I
  #225 = Class              #227          // ext/mods/gameserver/model/WorldObject
  #226 = NameAndType        #228:#73      // getX:()I
  #227 = Utf8               ext/mods/gameserver/model/WorldObject
  #228 = Utf8               getX
  #229 = Methodref          #225.#230     // ext/mods/gameserver/model/WorldObject.getY:()I
  #230 = NameAndType        #231:#73      // getY:()I
  #231 = Utf8               getY
  #232 = Methodref          #225.#233     // ext/mods/gameserver/model/WorldObject.getZ:()I
  #233 = NameAndType        #234:#73      // getZ:()I
  #234 = Utf8               getZ
  #235 = Methodref          #203.#236     // ext/mods/gameserver/model/actor/Creature.getCollisionHeight:()D
  #236 = NameAndType        #237:#238     // getCollisionHeight:()D
  #237 = Utf8               getCollisionHeight
  #238 = Utf8               ()D
  #239 = Double             2.0d
  #241 = Fieldref           #194.#242     // ext/mods/Config.PART_OF_CHARACTER_HEIGHT:I
  #242 = NameAndType        #243:#244     // PART_OF_CHARACTER_HEIGHT:I
  #243 = Utf8               PART_OF_CHARACTER_HEIGHT
  #244 = Utf8               I
  #245 = Double             100.0d
  #247 = Class              #248          // ext/mods/gameserver/geoengine/geodata/IGeoObject
  #248 = Utf8               ext/mods/gameserver/geoengine/geodata/IGeoObject
  #249 = Methodref          #8.#213       // ext/mods/gameserver/model/actor/move/MovementIntegration.canMoveToTarget:(IIIIII)Z
  #250 = Methodref          #8.#251       // ext/mods/gameserver/model/actor/move/MovementIntegration.canSeeTarget:(Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/WorldObject;)Z
  #251 = NameAndType        #252:#253     // canSeeTarget:(Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/WorldObject;)Z
  #252 = Utf8               canSeeTarget
  #253 = Utf8               (Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/WorldObject;)Z
  #254 = Methodref          #255.#256     // java/lang/Math.abs:(I)I
  #255 = Class              #257          // java/lang/Math
  #256 = NameAndType        #258:#259     // abs:(I)I
  #257 = Utf8               java/lang/Math
  #258 = Utf8               abs
  #259 = Utf8               (I)I
  #260 = Methodref          #8.#261       // ext/mods/gameserver/model/actor/move/MovementIntegration.startPlayerMovement:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/location/Location;)V
  #261 = NameAndType        #262:#133     // startPlayerMovement:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/location/Location;)V
  #262 = Utf8               startPlayerMovement
  #263 = Methodref          #8.#264       // ext/mods/gameserver/model/actor/move/MovementIntegration.startCreatureMovement:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/location/Location;)V
  #264 = NameAndType        #265:#266     // startCreatureMovement:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/location/Location;)V
  #265 = Utf8               startCreatureMovement
  #266 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/location/Location;)V
  #267 = Methodref          #8.#268       // ext/mods/gameserver/model/actor/move/MovementIntegration.canMoveInAutoFarm:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/location/Location;)Z
  #268 = NameAndType        #269:#270     // canMoveInAutoFarm:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/location/Location;)Z
  #269 = Utf8               canMoveInAutoFarm
  #270 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/location/Location;)Z
  #271 = Class              #272          // ext/mods/gameserver/network/serverpackets/ValidateLocation
  #272 = Utf8               ext/mods/gameserver/network/serverpackets/ValidateLocation
  #273 = Methodref          #271.#274     // ext/mods/gameserver/network/serverpackets/ValidateLocation."<init>":(Lext/mods/gameserver/model/actor/Creature;)V
  #274 = NameAndType        #5:#141       // "<init>":(Lext/mods/gameserver/model/actor/Creature;)V
  #275 = Methodref          #89.#276      // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #276 = NameAndType        #277:#278     // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #277 = Utf8               sendPacket
  #278 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #279 = Fieldref           #280.#281     // ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
  #280 = Class              #282          // ext/mods/gameserver/network/serverpackets/ActionFailed
  #281 = NameAndType        #283:#284     // STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
  #282 = Utf8               ext/mods/gameserver/network/serverpackets/ActionFailed
  #283 = Utf8               STATIC_PACKET
  #284 = Utf8               Lext/mods/gameserver/network/serverpackets/ActionFailed;
  #285 = Methodref          #89.#286      // ext/mods/gameserver/model/actor/Player.getObjectId:()I
  #286 = NameAndType        #287:#73      // getObjectId:()I
  #287 = Utf8               getObjectId
  #288 = Methodref          #289.#290     // java/lang/System.currentTimeMillis:()J
  #289 = Class              #291          // java/lang/System
  #290 = NameAndType        #292:#293     // currentTimeMillis:()J
  #291 = Utf8               java/lang/System
  #292 = Utf8               currentTimeMillis
  #293 = Utf8               ()J
  #294 = Methodref          #8.#295       // ext/mods/gameserver/model/actor/move/MovementIntegration.calculateMovementSpeed:(Lext/mods/gameserver/model/actor/Creature;)D
  #295 = NameAndType        #296:#297     // calculateMovementSpeed:(Lext/mods/gameserver/model/actor/Creature;)D
  #296 = Utf8               calculateMovementSpeed
  #297 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)D
  #298 = Methodref          #77.#299      // ext/mods/gameserver/model/actor/move/MovementIntegration$MovementPrediction."<init>":(Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;JD)V
  #299 = NameAndType        #5:#300       // "<init>":(Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;JD)V
  #300 = Utf8               (Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;JD)V
  #301 = InterfaceMethodref #39.#302      // java/util/concurrent/ConcurrentMap.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #302 = NameAndType        #303:#304     // put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #303 = Utf8               put
  #304 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #305 = Methodref          #77.#306      // ext/mods/gameserver/model/actor/move/MovementIntegration$MovementPrediction.getStartTime:()J
  #306 = NameAndType        #307:#293     // getStartTime:()J
  #307 = Utf8               getStartTime
  #308 = Methodref          #77.#309      // ext/mods/gameserver/model/actor/move/MovementIntegration$MovementPrediction.getStartPosition:()Lext/mods/gameserver/model/location/Location;
  #309 = NameAndType        #310:#175     // getStartPosition:()Lext/mods/gameserver/model/location/Location;
  #310 = Utf8               getStartPosition
  #311 = Methodref          #77.#312      // ext/mods/gameserver/model/actor/move/MovementIntegration$MovementPrediction.getDestination:()Lext/mods/gameserver/model/location/Location;
  #312 = NameAndType        #313:#175     // getDestination:()Lext/mods/gameserver/model/location/Location;
  #313 = Utf8               getDestination
  #314 = Double             0.1d
  #316 = Methodref          #77.#317      // ext/mods/gameserver/model/actor/move/MovementIntegration$MovementPrediction.getSpeed:()D
  #317 = NameAndType        #318:#238     // getSpeed:()D
  #318 = Utf8               getSpeed
  #319 = Double             1000.0d
  #321 = Methodref          #123.#226     // ext/mods/gameserver/model/location/Location.getX:()I
  #322 = Methodref          #123.#230     // ext/mods/gameserver/model/location/Location.getY:()I
  #323 = Methodref          #123.#233     // ext/mods/gameserver/model/location/Location.getZ:()I
  #324 = Methodref          #123.#325     // ext/mods/gameserver/model/location/Location."<init>":(III)V
  #325 = NameAndType        #5:#326       // "<init>":(III)V
  #326 = Utf8               (III)V
  #327 = Double             32.0d
  #329 = Methodref          #203.#286     // ext/mods/gameserver/model/actor/Creature.getObjectId:()I
  #330 = Methodref          #203.#331     // ext/mods/gameserver/model/actor/Creature.getStatus:()Lext/mods/gameserver/model/actor/status/CreatureStatus;
  #331 = NameAndType        #332:#333     // getStatus:()Lext/mods/gameserver/model/actor/status/CreatureStatus;
  #332 = Utf8               getStatus
  #333 = Utf8               ()Lext/mods/gameserver/model/actor/status/CreatureStatus;
  #334 = Methodref          #335.#336     // ext/mods/gameserver/model/actor/status/CreatureStatus.getMoveSpeed:()F
  #335 = Class              #337          // ext/mods/gameserver/model/actor/status/CreatureStatus
  #336 = NameAndType        #338:#339     // getMoveSpeed:()F
  #337 = Utf8               ext/mods/gameserver/model/actor/status/CreatureStatus
  #338 = Utf8               getMoveSpeed
  #339 = Utf8               ()F
  #340 = InterfaceMethodref #39.#341      // java/util/concurrent/ConcurrentMap.containsKey:(Ljava/lang/Object;)Z
  #341 = NameAndType        #342:#343     // containsKey:(Ljava/lang/Object;)Z
  #342 = Utf8               containsKey
  #343 = Utf8               (Ljava/lang/Object;)Z
  #344 = InterfaceMethodref #39.#345      // java/util/concurrent/ConcurrentMap.get:(Ljava/lang/Object;)Ljava/lang/Object;
  #345 = NameAndType        #346:#98      // get:(Ljava/lang/Object;)Ljava/lang/Object;
  #346 = Utf8               get
  #347 = Methodref          #203.#110     // ext/mods/gameserver/model/actor/Creature.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
  #348 = Class              #349          // ext/mods/commons/logging/CLogger
  #349 = Utf8               ext/mods/commons/logging/CLogger
  #350 = Methodref          #351.#352     // java/lang/Class.getName:()Ljava/lang/String;
  #351 = Class              #353          // java/lang/Class
  #352 = NameAndType        #354:#355     // getName:()Ljava/lang/String;
  #353 = Utf8               java/lang/Class
  #354 = Utf8               getName
  #355 = Utf8               ()Ljava/lang/String;
  #356 = Methodref          #348.#357     // ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
  #357 = NameAndType        #5:#188       // "<init>":(Ljava/lang/String;)V
  #358 = Fieldref           #8.#359       // ext/mods/gameserver/model/actor/move/MovementIntegration.LOGGER:Lext/mods/commons/logging/CLogger;
  #359 = NameAndType        #360:#361     // LOGGER:Lext/mods/commons/logging/CLogger;
  #360 = Utf8               LOGGER
  #361 = Utf8               Lext/mods/commons/logging/CLogger;
  #362 = Class              #363          // java/util/concurrent/ConcurrentHashMap
  #363 = Utf8               java/util/concurrent/ConcurrentHashMap
  #364 = Methodref          #362.#3       // java/util/concurrent/ConcurrentHashMap."<init>":()V
  #365 = Utf8               VALIDATION_INTERVAL
  #366 = Utf8               ConstantValue
  #367 = Integer            500
  #368 = Utf8               RECONCILIATION_THRESHOLD
  #369 = Utf8               D
  #370 = Utf8               Signature
  #371 = Utf8               Ljava/util/concurrent/ConcurrentMap<Ljava/lang/Integer;Lext/mods/gameserver/model/actor/move/MovementIntegration$MovementPrediction;>;
  #372 = Utf8               Ljava/util/concurrent/ScheduledFuture<*>;
  #373 = Utf8               Code
  #374 = Utf8               LineNumberTable
  #375 = Utf8               LocalVariableTable
  #376 = Utf8               this
  #377 = Utf8               ()Lext/mods/gameserver/model/actor/move/MovementIntegration;
  #378 = Utf8               StackMapTable
  #379 = Utf8               validateAllMovements
  #380 = Utf8               objectId
  #381 = Utf8               prediction
  #382 = Utf8               Lext/mods/gameserver/model/actor/move/MovementIntegration$MovementPrediction;
  #383 = Utf8               obj
  #384 = Utf8               Lext/mods/gameserver/model/WorldObject;
  #385 = Utf8               player
  #386 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #387 = Utf8               entry
  #388 = Utf8               Ljava/util/Map$Entry;
  #389 = Utf8               LocalVariableTypeTable
  #390 = Utf8               Ljava/util/Map$Entry<Ljava/lang/Integer;Lext/mods/gameserver/model/actor/move/MovementIntegration$MovementPrediction;>;
  #391 = Utf8               currentPos
  #392 = Utf8               Lext/mods/gameserver/model/location/Location;
  #393 = Utf8               predictedPos
  #394 = Utf8               distance
  #395 = Utf8               anchor
  #396 = Utf8               radius
  #397 = Utf8               dist
  #398 = Utf8               dest
  #399 = Utf8               profile
  #400 = Utf8               Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
  #401 = Utf8               center
  #402 = Utf8               initializeMovementSystem
  #403 = Utf8               creature
  #404 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #405 = Utf8               ox
  #406 = Utf8               oy
  #407 = Utf8               oz
  #408 = Utf8               tx
  #409 = Utf8               ty
  #410 = Utf8               tz
  #411 = Utf8               (IIIIII)Lext/mods/gameserver/model/location/Location;
  #412 = Utf8               (IIIDIIID)Z
  #413 = Utf8               oheight
  #414 = Utf8               theight
  #415 = Utf8               c
  #416 = Utf8               igo
  #417 = Utf8               Lext/mods/gameserver/geoengine/geodata/IGeoObject;
  #418 = Utf8               object
  #419 = Utf8               target
  #420 = Utf8               ignore
  #421 = Utf8               canMoveToTargetForAutoFarm
  #422 = Utf8               canSeeTargetForAutoFarm
  #423 = Utf8               canCastOnTarget
  #424 = Utf8               (Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/WorldObject;I)Z
  #425 = Utf8               caster
  #426 = Utf8               skillRange
  #427 = Utf8               startMovement
  #428 = Utf8               destination
  #429 = Utf8               startPos
  #430 = Utf8               now
  #431 = Utf8               J
  #432 = Utf8               timePassed
  #433 = Utf8               totalDistance
  #434 = Utf8               speed
  #435 = Utf8               distanceTraveled
  #436 = Utf8               ratio
  #437 = Utf8               dirX
  #438 = Utf8               dirY
  #439 = Utf8               dirZ
  #440 = Utf8               correctPosition
  #441 = Utf8               stopMovement
  #442 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)Z
  #443 = Utf8               getPredictedPosition
  #444 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/model/location/Location;
  #445 = Utf8               <clinit>
  #446 = Utf8               SourceFile
  #447 = Utf8               MovementIntegration.java
  #448 = Utf8               NestMembers
  #449 = Utf8               BootstrapMethods
  #450 = MethodType         #6            //  ()V
  #451 = MethodHandle       5:#452        // REF_invokeVirtual ext/mods/gameserver/model/actor/move/MovementIntegration.validateAllMovements:()V
  #452 = Methodref          #8.#453       // ext/mods/gameserver/model/actor/move/MovementIntegration.validateAllMovements:()V
  #453 = NameAndType        #379:#6       // validateAllMovements:()V
  #454 = MethodHandle       6:#455        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #455 = Methodref          #456.#457     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #456 = Class              #458          // java/lang/invoke/LambdaMetafactory
  #457 = NameAndType        #459:#460     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #458 = Utf8               java/lang/invoke/LambdaMetafactory
  #459 = Utf8               metafactory
  #460 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #461 = Utf8               InnerClasses
  #462 = Utf8               SingletonHolder
  #463 = Class              #464          // java/util/Map
  #464 = Utf8               java/util/Map
  #465 = Utf8               Entry
  #466 = Utf8               MovementPrediction
  #467 = Utf8               AutoFarmType
  #468 = Class              #469          // java/lang/invoke/MethodHandles$Lookup
  #469 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #470 = Class              #471          // java/lang/invoke/MethodHandles
  #471 = Utf8               java/lang/invoke/MethodHandles
  #472 = Utf8               Lookup
{
  public static ext.mods.gameserver.model.actor.move.MovementIntegration getInstance();
    descriptor: ()Lext/mods/gameserver/model/actor/move/MovementIntegration;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #12                 // Field ext/mods/gameserver/model/actor/move/MovementIntegration$SingletonHolder.INSTANCE:Lext/mods/gameserver/model/actor/move/MovementIntegration;
         3: areturn
      LineNumberTable:
        line 68: 0

  public static boolean canMoveInAutoFarm(ext.mods.gameserver.model.actor.Player, ext.mods.gameserver.model.location.Location);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/location/Location;)Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=4, locals=7, args_size=2
         0: invokestatic  #142                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmManager.getInstance:()Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager;
         3: aload_0
         4: invokevirtual #147                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmManager.getProfile:(Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
         7: astore_2
         8: aload_2
         9: invokevirtual #151                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.isEnabled:()Z
        12: ifne          17
        15: iconst_1
        16: ireturn
        17: aload_2
        18: invokevirtual #156                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getSelectedArea:()Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;
        21: ifnull        95
        24: aload_2
        25: invokevirtual #156                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getSelectedArea:()Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;
        28: invokevirtual #160                // Method ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.getType:()Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;
        31: getstatic     #166                // Field ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType.ZONA:Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;
        34: if_acmpne     95
        37: aload_2
        38: invokevirtual #172                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getAnchorLocation:()Lext/mods/gameserver/model/location/Location;
        41: astore_3
        42: aload_3
        43: ifnonnull     48
        46: iconst_1
        47: ireturn
        48: aload_2
        49: invokevirtual #176                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getFinalRadius:()I
        52: istore        4
        54: iload         4
        56: ifgt          64
        59: sipush        1000
        62: istore        4
        64: aload_3
        65: aload_1
        66: invokevirtual #179                // Method ext/mods/gameserver/model/location/Location.distance2D:(Lext/mods/gameserver/model/location/Point2D;)D
        69: dstore        5
        71: dload         5
        73: iload         4
        75: i2d
        76: dcmpl
        77: ifle          95
        80: aload_0
        81: ldc           #183                // String Modo Fechado: Você não pode sair da área delimitada.
        83: invokevirtual #185                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
        86: aload_0
        87: aload_3
        88: iload         4
        90: invokestatic  #189                // Method visualizeFarmLimit:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/location/Location;I)V
        93: iconst_0
        94: ireturn
        95: iconst_1
        96: ireturn
      LineNumberTable:
        line 125: 0
        line 127: 8
        line 129: 17
        line 131: 37
        line 132: 42
        line 134: 48
        line 135: 54
        line 137: 64
        line 139: 71
        line 141: 80
        line 142: 86
        line 143: 93
        line 146: 95
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           42      53     3 anchor   Lext/mods/gameserver/model/location/Location;
           54      41     4 radius   I
           71      24     5  dist   D
            0      97     0 player   Lext/mods/gameserver/model/actor/Player;
            0      97     1  dest   Lext/mods/gameserver/model/location/Location;
            8      89     2 profile   Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
      StackMapTable: number_of_entries = 4
        frame_type = 252 /* append */
          offset_delta = 17
          locals = [ class ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile ]
        frame_type = 252 /* append */
          offset_delta = 30
          locals = [ class ext/mods/gameserver/model/location/Location ]
        frame_type = 252 /* append */
          offset_delta = 15
          locals = [ int ]
        frame_type = 249 /* chop */
          offset_delta = 30

  public static void initializeMovementSystem(ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;)V
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #193                // Field ext/mods/Config.SISTEMA_PATHFINDING:Z
         3: ifne          7
         6: return
         7: getstatic     #199                // Field ext/mods/Config.USE_OPTIMIZED_MOVEMENT:Z
        10: ifeq          24
        13: aload_0
        14: instanceof    #89                 // class ext/mods/gameserver/model/actor/Player
        17: ifeq          24
        20: aload_0
        21: invokevirtual #202                // Method ext/mods/gameserver/model/actor/Creature.setMove:()V
        24: return
      LineNumberTable:
        line 157: 0
        line 158: 7
        line 159: 24
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      25     0 creature   Lext/mods/gameserver/model/actor/Creature;
      StackMapTable: number_of_entries = 2
        frame_type = 7 /* same */
        frame_type = 16 /* same */

  public static boolean canMoveToTarget(int, int, int, int, int, int);
    descriptor: (IIIIII)Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=7, locals=6, args_size=6
         0: invokestatic  #207                // Method ext/mods/gameserver/geoengine/GeoEngine.getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
         3: iload_0
         4: iload_1
         5: iload_2
         6: iload_3
         7: iload         4
         9: iload         5
        11: invokevirtual #212                // Method ext/mods/gameserver/geoengine/GeoEngine.canMoveToTarget:(IIIIII)Z
        14: ireturn
      LineNumberTable:
        line 162: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      15     0    ox   I
            0      15     1    oy   I
            0      15     2    oz   I
            0      15     3    tx   I
            0      15     4    ty   I
            0      15     5    tz   I

  public static ext.mods.gameserver.model.location.Location getValidLocation(int, int, int, int, int, int);
    descriptor: (IIIIII)Lext/mods/gameserver/model/location/Location;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=8, locals=6, args_size=6
         0: invokestatic  #207                // Method ext/mods/gameserver/geoengine/GeoEngine.getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
         3: iload_0
         4: iload_1
         5: iload_2
         6: iload_3
         7: iload         4
         9: iload         5
        11: aconst_null
        12: invokevirtual #216                // Method ext/mods/gameserver/geoengine/GeoEngine.getValidLocation:(IIIIIILext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Lext/mods/gameserver/model/location/Location;
        15: areturn
      LineNumberTable:
        line 166: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      16     0    ox   I
            0      16     1    oy   I
            0      16     2    oz   I
            0      16     3    tx   I
            0      16     4    ty   I
            0      16     5    tz   I

  public static boolean canSee(int, int, int, double, int, int, int, double);
    descriptor: (IIIDIIID)Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=13, locals=10, args_size=8
         0: invokestatic  #207                // Method ext/mods/gameserver/geoengine/GeoEngine.getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
         3: iload_0
         4: iload_1
         5: iload_2
         6: dload_3
         7: iload         5
         9: iload         6
        11: iload         7
        13: dload         8
        15: aconst_null
        16: aconst_null
        17: invokevirtual #220                // Method ext/mods/gameserver/geoengine/GeoEngine.canSee:(IIIDIIIDLext/mods/gameserver/geoengine/geodata/IGeoObject;Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Z
        20: ireturn
      LineNumberTable:
        line 170: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      21     0    ox   I
            0      21     1    oy   I
            0      21     2    oz   I
            0      21     3 oheight   D
            0      21     5    tx   I
            0      21     6    ty   I
            0      21     7    tz   I
            0      21     8 theight   D

  public static boolean canSeeTarget(ext.mods.gameserver.model.WorldObject, ext.mods.gameserver.model.WorldObject);
    descriptor: (Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/WorldObject;)Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=13, locals=14, args_size=2
         0: getstatic     #193                // Field ext/mods/Config.SISTEMA_PATHFINDING:Z
         3: ifne          8
         6: iconst_1
         7: ireturn
         8: aload_0
         9: invokevirtual #224                // Method ext/mods/gameserver/model/WorldObject.getX:()I
        12: istore_2
        13: aload_0
        14: invokevirtual #229                // Method ext/mods/gameserver/model/WorldObject.getY:()I
        17: istore_3
        18: aload_0
        19: invokevirtual #232                // Method ext/mods/gameserver/model/WorldObject.getZ:()I
        22: istore        4
        24: aload_1
        25: invokevirtual #224                // Method ext/mods/gameserver/model/WorldObject.getX:()I
        28: istore        5
        30: aload_1
        31: invokevirtual #229                // Method ext/mods/gameserver/model/WorldObject.getY:()I
        34: istore        6
        36: aload_1
        37: invokevirtual #232                // Method ext/mods/gameserver/model/WorldObject.getZ:()I
        40: istore        7
        42: aload_0
        43: instanceof    #203                // class ext/mods/gameserver/model/actor/Creature
        46: ifeq          76
        49: aload_0
        50: checkcast     #203                // class ext/mods/gameserver/model/actor/Creature
        53: astore        10
        55: aload         10
        57: invokevirtual #235                // Method ext/mods/gameserver/model/actor/Creature.getCollisionHeight:()D
        60: ldc2_w        #239                // double 2.0d
        63: dmul
        64: getstatic     #241                // Field ext/mods/Config.PART_OF_CHARACTER_HEIGHT:I
        67: i2d
        68: dmul
        69: ldc2_w        #245                // double 100.0d
        72: ddiv
        73: goto          77
        76: dconst_0
        77: dstore        8
        79: aload_1
        80: instanceof    #203                // class ext/mods/gameserver/model/actor/Creature
        83: ifeq          113
        86: aload_1
        87: checkcast     #203                // class ext/mods/gameserver/model/actor/Creature
        90: astore        12
        92: aload         12
        94: invokevirtual #235                // Method ext/mods/gameserver/model/actor/Creature.getCollisionHeight:()D
        97: ldc2_w        #239                // double 2.0d
       100: dmul
       101: getstatic     #241                // Field ext/mods/Config.PART_OF_CHARACTER_HEIGHT:I
       104: i2d
       105: dmul
       106: ldc2_w        #245                // double 100.0d
       109: ddiv
       110: goto          114
       113: dconst_0
       114: dstore        10
       116: aload_1
       117: instanceof    #247                // class ext/mods/gameserver/geoengine/geodata/IGeoObject
       120: ifeq          134
       123: aload_1
       124: checkcast     #247                // class ext/mods/gameserver/geoengine/geodata/IGeoObject
       127: astore        13
       129: aload         13
       131: goto          135
       134: aconst_null
       135: astore        12
       137: invokestatic  #207                // Method ext/mods/gameserver/geoengine/GeoEngine.getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
       140: iload_2
       141: iload_3
       142: iload         4
       144: dload         8
       146: iload         5
       148: iload         6
       150: iload         7
       152: dload         10
       154: aload         12
       156: aconst_null
       157: invokevirtual #220                // Method ext/mods/gameserver/geoengine/GeoEngine.canSee:(IIIDIIIDLext/mods/gameserver/geoengine/geodata/IGeoObject;Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Z
       160: ireturn
      LineNumberTable:
        line 174: 0
        line 177: 8
        line 178: 24
        line 179: 42
        line 180: 79
        line 181: 116
        line 182: 137
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           55      21    10     c   Lext/mods/gameserver/model/actor/Creature;
           92      21    12     c   Lext/mods/gameserver/model/actor/Creature;
          129       5    13   igo   Lext/mods/gameserver/geoengine/geodata/IGeoObject;
            0     161     0 object   Lext/mods/gameserver/model/WorldObject;
            0     161     1 target   Lext/mods/gameserver/model/WorldObject;
           13     148     2    ox   I
           18     143     3    oy   I
           24     137     4    oz   I
           30     131     5    tx   I
           36     125     6    ty   I
           42     119     7    tz   I
           79      82     8 oheight   D
          116      45    10 theight   D
          137      24    12 ignore   Lext/mods/gameserver/geoengine/geodata/IGeoObject;
      StackMapTable: number_of_entries = 7
        frame_type = 8 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 67
          locals = [ class ext/mods/gameserver/model/WorldObject, class ext/mods/gameserver/model/WorldObject, int, int, int, int, int, int ]
          stack = []
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ double ]
        frame_type = 252 /* append */
          offset_delta = 35
          locals = [ double ]
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ double ]
        frame_type = 252 /* append */
          offset_delta = 19
          locals = [ double ]
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/geoengine/geodata/IGeoObject ]

  public static boolean canMoveToTargetForAutoFarm(int, int, int, int, int, int);
    descriptor: (IIIIII)Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=6, locals=6, args_size=6
         0: iload_0
         1: iload_1
         2: iload_2
         3: iload_3
         4: iload         4
         6: iload         5
         8: invokestatic  #249                // Method canMoveToTarget:(IIIIII)Z
        11: ireturn
      LineNumberTable:
        line 186: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0    ox   I
            0      12     1    oy   I
            0      12     2    oz   I
            0      12     3    tx   I
            0      12     4    ty   I
            0      12     5    tz   I

  public static boolean canSeeTargetForAutoFarm(ext.mods.gameserver.model.WorldObject, ext.mods.gameserver.model.WorldObject);
    descriptor: (Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/WorldObject;)Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokestatic  #250                // Method canSeeTarget:(Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/WorldObject;)Z
         5: ireturn
      LineNumberTable:
        line 190: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0 object   Lext/mods/gameserver/model/WorldObject;
            0       6     1 target   Lext/mods/gameserver/model/WorldObject;

  public static boolean canCastOnTarget(ext.mods.gameserver.model.WorldObject, ext.mods.gameserver.model.WorldObject, int);
    descriptor: (Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/WorldObject;I)Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=3, locals=7, args_size=3
         0: getstatic     #193                // Field ext/mods/Config.SISTEMA_PATHFINDING:Z
         3: ifne          8
         6: iconst_1
         7: ireturn
         8: aload_0
         9: invokevirtual #224                // Method ext/mods/gameserver/model/WorldObject.getX:()I
        12: istore_3
        13: aload_0
        14: invokevirtual #229                // Method ext/mods/gameserver/model/WorldObject.getY:()I
        17: istore        4
        19: aload_1
        20: invokevirtual #224                // Method ext/mods/gameserver/model/WorldObject.getX:()I
        23: istore        5
        25: aload_1
        26: invokevirtual #229                // Method ext/mods/gameserver/model/WorldObject.getY:()I
        29: istore        6
        31: iload_3
        32: iload         5
        34: isub
        35: invokestatic  #254                // Method java/lang/Math.abs:(I)I
        38: iload_2
        39: sipush        200
        42: iadd
        43: if_icmpgt     62
        46: iload         4
        48: iload         6
        50: isub
        51: invokestatic  #254                // Method java/lang/Math.abs:(I)I
        54: iload_2
        55: sipush        200
        58: iadd
        59: if_icmple     64
        62: iconst_0
        63: ireturn
        64: aload_0
        65: aload_1
        66: invokestatic  #250                // Method canSeeTarget:(Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/WorldObject;)Z
        69: ireturn
      LineNumberTable:
        line 194: 0
        line 196: 8
        line 197: 19
        line 199: 31
        line 201: 64
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      70     0 caster   Lext/mods/gameserver/model/WorldObject;
            0      70     1 target   Lext/mods/gameserver/model/WorldObject;
            0      70     2 skillRange   I
           13      57     3    ox   I
           19      51     4    oy   I
           25      45     5    tx   I
           31      39     6    ty   I
      StackMapTable: number_of_entries = 3
        frame_type = 8 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 53
          locals = [ class ext/mods/gameserver/model/WorldObject, class ext/mods/gameserver/model/WorldObject, int, int, int, int, int ]
          stack = []
        frame_type = 1 /* same */

  public static void startMovement(ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.model.location.Location);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/location/Location;)V
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=3, args_size=2
         0: aload_0
         1: instanceof    #89                 // class ext/mods/gameserver/model/actor/Player
         4: ifeq          20
         7: aload_0
         8: checkcast     #89                 // class ext/mods/gameserver/model/actor/Player
        11: astore_2
        12: aload_2
        13: aload_1
        14: invokestatic  #260                // Method startPlayerMovement:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/location/Location;)V
        17: goto          25
        20: aload_0
        21: aload_1
        22: invokestatic  #263                // Method startCreatureMovement:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/location/Location;)V
        25: return
      LineNumberTable:
        line 206: 0
        line 207: 12
        line 209: 20
        line 210: 25
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           12       8     2 player   Lext/mods/gameserver/model/actor/Player;
            0      26     0 creature   Lext/mods/gameserver/model/actor/Creature;
            0      26     1 destination   Lext/mods/gameserver/model/location/Location;
      StackMapTable: number_of_entries = 2
        frame_type = 20 /* same */
        frame_type = 4 /* same */

  public static void stopMovement(ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;)V
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=1, args_size=1
         0: getstatic     #34                 // Field _predictions:Ljava/util/concurrent/ConcurrentMap;
         3: aload_0
         4: invokevirtual #329                // Method ext/mods/gameserver/model/actor/Creature.getObjectId:()I
         7: invokestatic  #91                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        10: invokeinterface #95,  2           // InterfaceMethod java/util/concurrent/ConcurrentMap.remove:(Ljava/lang/Object;)Ljava/lang/Object;
        15: pop
        16: return
      LineNumberTable:
        line 279: 0
        line 280: 16
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      17     0 creature   Lext/mods/gameserver/model/actor/Creature;

  public static boolean isMoving(ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;)Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=1, args_size=1
         0: getstatic     #34                 // Field _predictions:Ljava/util/concurrent/ConcurrentMap;
         3: aload_0
         4: invokevirtual #329                // Method ext/mods/gameserver/model/actor/Creature.getObjectId:()I
         7: invokestatic  #91                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        10: invokeinterface #340,  2          // InterfaceMethod java/util/concurrent/ConcurrentMap.containsKey:(Ljava/lang/Object;)Z
        15: ireturn
      LineNumberTable:
        line 283: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      16     0 creature   Lext/mods/gameserver/model/actor/Creature;

  public static ext.mods.gameserver.model.location.Location getPredictedPosition(ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/model/location/Location;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=2, args_size=1
         0: getstatic     #34                 // Field _predictions:Ljava/util/concurrent/ConcurrentMap;
         3: aload_0
         4: invokevirtual #329                // Method ext/mods/gameserver/model/actor/Creature.getObjectId:()I
         7: invokestatic  #91                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        10: invokeinterface #344,  2          // InterfaceMethod java/util/concurrent/ConcurrentMap.get:(Ljava/lang/Object;)Ljava/lang/Object;
        15: checkcast     #77                 // class ext/mods/gameserver/model/actor/move/MovementIntegration$MovementPrediction
        18: astore_1
        19: aload_1
        20: ifnonnull     28
        23: aload_0
        24: invokevirtual #347                // Method ext/mods/gameserver/model/actor/Creature.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
        27: areturn
        28: aload_1
        29: invokestatic  #118                // Method calculatePredictedPosition:(Lext/mods/gameserver/model/actor/move/MovementIntegration$MovementPrediction;)Lext/mods/gameserver/model/location/Location;
        32: areturn
      LineNumberTable:
        line 287: 0
        line 288: 19
        line 289: 28
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      33     0 creature   Lext/mods/gameserver/model/actor/Creature;
           19      14     1 prediction   Lext/mods/gameserver/model/actor/move/MovementIntegration$MovementPrediction;
      StackMapTable: number_of_entries = 1
        frame_type = 252 /* append */
          offset_delta = 28
          locals = [ class ext/mods/gameserver/model/actor/move/MovementIntegration$MovementPrediction ]

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=3, locals=0, args_size=0
         0: new           #348                // class ext/mods/commons/logging/CLogger
         3: dup
         4: ldc           #8                  // class ext/mods/gameserver/model/actor/move/MovementIntegration
         6: invokevirtual #350                // Method java/lang/Class.getName:()Ljava/lang/String;
         9: invokespecial #356                // Method ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
        12: putstatic     #358                // Field LOGGER:Lext/mods/commons/logging/CLogger;
        15: new           #362                // class java/util/concurrent/ConcurrentHashMap
        18: dup
        19: invokespecial #364                // Method java/util/concurrent/ConcurrentHashMap."<init>":()V
        22: putstatic     #34                 // Field _predictions:Ljava/util/concurrent/ConcurrentMap;
        25: return
      LineNumberTable:
        line 48: 0
        line 53: 15
}
SourceFile: "MovementIntegration.java"
NestMembers:
  ext/mods/gameserver/model/actor/move/MovementIntegration$MovementPrediction
  ext/mods/gameserver/model/actor/move/MovementIntegration$SingletonHolder
BootstrapMethods:
  0: #454 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #450 ()V
      #451 REF_invokeVirtual ext/mods/gameserver/model/actor/move/MovementIntegration.validateAllMovements:()V
      #450 ()V
InnerClasses:
  public static #465= #63 of #463;        // Entry=class java/util/Map$Entry of class java/util/Map
  public static final #467= #167 of #143; // AutoFarmType=class ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType of class ext/mods/gameserver/model/entity/autofarm/AutoFarmManager
  public static final #472= #468 of #470; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
