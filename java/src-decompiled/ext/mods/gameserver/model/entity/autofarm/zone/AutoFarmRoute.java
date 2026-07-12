// Bytecode for: ext.mods.gameserver.model.entity.autofarm.zone.AutoFarmRoute
// File: ext\mods\gameserver\model\entity\autofarm\zone\AutoFarmRoute.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmRoute.class
  Last modified 9 de jul de 2026; size 10972 bytes
  MD5 checksum 31522f3a7e174a5445300aebf5e60d09
  Compiled from "AutoFarmRoute.java"
public class ext.mods.gameserver.model.entity.autofarm.zone.AutoFarmRoute extends ext.mods.gameserver.model.entity.autofarm.zone.AutoFarmArea
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #21                         // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmRoute
  super_class: #8                         // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea
  interfaces: 0, fields: 5, methods: 19, attributes: 3
Constant pool:
    #1 = Fieldref           #2.#3         // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType.ROTA:Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;
    #2 = Class              #4            // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType
    #3 = NameAndType        #5:#6         // ROTA:Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;
    #4 = Utf8               ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType
    #5 = Utf8               ROTA
    #6 = Utf8               Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;
    #7 = Methodref          #8.#9         // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea."<init>":(ILjava/lang/String;ILext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;)V
    #8 = Class              #10           // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea
    #9 = NameAndType        #11:#12       // "<init>":(ILjava/lang/String;ILext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;)V
   #10 = Utf8               ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea
   #11 = Utf8               <init>
   #12 = Utf8               (ILjava/lang/String;ILext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;)V
   #13 = Methodref          #8.#14        // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea."<init>":(Ljava/lang/String;ILext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;)V
   #14 = NameAndType        #11:#15       // "<init>":(Ljava/lang/String;ILext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;)V
   #15 = Utf8               (Ljava/lang/String;ILext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;)V
   #16 = Methodref          #8.#17        // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.getNodes:()Ljava/util/List;
   #17 = NameAndType        #18:#19       // getNodes:()Ljava/util/List;
   #18 = Utf8               getNodes
   #19 = Utf8               ()Ljava/util/List;
   #20 = Methodref          #21.#22       // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmRoute.getProfile:()Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
   #21 = Class              #23           // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmRoute
   #22 = NameAndType        #24:#25       // getProfile:()Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
   #23 = Utf8               ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmRoute
   #24 = Utf8               getProfile
   #25 = Utf8               ()Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
   #26 = Methodref          #27.#28       // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getFinalRadius:()I
   #27 = Class              #29           // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile
   #28 = NameAndType        #30:#31       // getFinalRadius:()I
   #29 = Utf8               ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile
   #30 = Utf8               getFinalRadius
   #31 = Utf8               ()I
   #32 = Class              #33           // java/util/ArrayList
   #33 = Utf8               java/util/ArrayList
   #34 = Methodref          #32.#35       // java/util/ArrayList."<init>":()V
   #35 = NameAndType        #11:#36       // "<init>":()V
   #36 = Utf8               ()V
   #37 = Methodref          #21.#38       // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmRoute.getOwner:()Lext/mods/gameserver/model/actor/Player;
   #38 = NameAndType        #39:#40       // getOwner:()Lext/mods/gameserver/model/actor/Player;
   #39 = Utf8               getOwner
   #40 = Utf8               ()Lext/mods/gameserver/model/actor/Player;
   #41 = Class              #42           // ext/mods/gameserver/model/actor/instance/Monster
   #42 = Utf8               ext/mods/gameserver/model/actor/instance/Monster
   #43 = Methodref          #44.#45       // ext/mods/gameserver/model/actor/Player.getKnownTypeInRadius:(Ljava/lang/Class;I)Ljava/util/List;
   #44 = Class              #46           // ext/mods/gameserver/model/actor/Player
   #45 = NameAndType        #47:#48       // getKnownTypeInRadius:(Ljava/lang/Class;I)Ljava/util/List;
   #46 = Utf8               ext/mods/gameserver/model/actor/Player
   #47 = Utf8               getKnownTypeInRadius
   #48 = Utf8               (Ljava/lang/Class;I)Ljava/util/List;
   #49 = InterfaceMethodref #50.#51       // java/util/List.iterator:()Ljava/util/Iterator;
   #50 = Class              #52           // java/util/List
   #51 = NameAndType        #53:#54       // iterator:()Ljava/util/Iterator;
   #52 = Utf8               java/util/List
   #53 = Utf8               iterator
   #54 = Utf8               ()Ljava/util/Iterator;
   #55 = InterfaceMethodref #56.#57       // java/util/Iterator.hasNext:()Z
   #56 = Class              #58           // java/util/Iterator
   #57 = NameAndType        #59:#60       // hasNext:()Z
   #58 = Utf8               java/util/Iterator
   #59 = Utf8               hasNext
   #60 = Utf8               ()Z
   #61 = InterfaceMethodref #56.#62       // java/util/Iterator.next:()Ljava/lang/Object;
   #62 = NameAndType        #63:#64       // next:()Ljava/lang/Object;
   #63 = Utf8               next
   #64 = Utf8               ()Ljava/lang/Object;
   #65 = Methodref          #41.#66       // ext/mods/gameserver/model/actor/instance/Monster.isInStrictRadius:(Lext/mods/gameserver/model/WorldObject;I)Z
   #66 = NameAndType        #67:#68       // isInStrictRadius:(Lext/mods/gameserver/model/WorldObject;I)Z
   #67 = Utf8               isInStrictRadius
   #68 = Utf8               (Lext/mods/gameserver/model/WorldObject;I)Z
   #69 = InterfaceMethodref #50.#70       // java/util/List.add:(Ljava/lang/Object;)Z
   #70 = NameAndType        #71:#72       // add:(Ljava/lang/Object;)Z
   #71 = Utf8               add
   #72 = Utf8               (Ljava/lang/Object;)Z
   #73 = Methodref          #41.#74       // ext/mods/gameserver/model/actor/instance/Monster.getAI:()Lext/mods/gameserver/model/actor/ai/type/AttackableAI;
   #74 = NameAndType        #75:#76       // getAI:()Lext/mods/gameserver/model/actor/ai/type/AttackableAI;
   #75 = Utf8               getAI
   #76 = Utf8               ()Lext/mods/gameserver/model/actor/ai/type/AttackableAI;
   #77 = Methodref          #78.#79       // ext/mods/gameserver/model/actor/ai/type/AttackableAI.getAggroList:()Lext/mods/gameserver/model/actor/container/attackable/AggroList;
   #78 = Class              #80           // ext/mods/gameserver/model/actor/ai/type/AttackableAI
   #79 = NameAndType        #81:#82       // getAggroList:()Lext/mods/gameserver/model/actor/container/attackable/AggroList;
   #80 = Utf8               ext/mods/gameserver/model/actor/ai/type/AttackableAI
   #81 = Utf8               getAggroList
   #82 = Utf8               ()Lext/mods/gameserver/model/actor/container/attackable/AggroList;
   #83 = Methodref          #84.#85       // ext/mods/gameserver/model/actor/container/attackable/AggroList.getHate:(Lext/mods/gameserver/model/actor/Creature;)D
   #84 = Class              #86           // ext/mods/gameserver/model/actor/container/attackable/AggroList
   #85 = NameAndType        #87:#88       // getHate:(Lext/mods/gameserver/model/actor/Creature;)D
   #86 = Utf8               ext/mods/gameserver/model/actor/container/attackable/AggroList
   #87 = Utf8               getHate
   #88 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)D
   #89 = Fieldref           #21.#90       // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmRoute._monsterHistory:Ljava/util/Set;
   #90 = NameAndType        #91:#92       // _monsterHistory:Ljava/util/Set;
   #91 = Utf8               _monsterHistory
   #92 = Utf8               Ljava/util/Set;
   #93 = Class              #94           // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager
   #94 = Utf8               ext/mods/gameserver/model/entity/autofarm/AutoFarmManager
   #95 = Methodref          #21.#45       // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmRoute.getKnownTypeInRadius:(Ljava/lang/Class;I)Ljava/util/List;
   #96 = InterfaceMethodref #50.#97       // java/util/List.stream:()Ljava/util/stream/Stream;
   #97 = NameAndType        #98:#99       // stream:()Ljava/util/stream/Stream;
   #98 = Utf8               stream
   #99 = Utf8               ()Ljava/util/stream/Stream;
  #100 = InvokeDynamic      #0:#101       // #0:apply:()Ljava/util/function/Function;
  #101 = NameAndType        #102:#103     // apply:()Ljava/util/function/Function;
  #102 = Utf8               apply
  #103 = Utf8               ()Ljava/util/function/Function;
  #104 = InterfaceMethodref #105.#106     // java/util/stream/Stream.map:(Ljava/util/function/Function;)Ljava/util/stream/Stream;
  #105 = Class              #107          // java/util/stream/Stream
  #106 = NameAndType        #108:#109     // map:(Ljava/util/function/Function;)Ljava/util/stream/Stream;
  #107 = Utf8               java/util/stream/Stream
  #108 = Utf8               map
  #109 = Utf8               (Ljava/util/function/Function;)Ljava/util/stream/Stream;
  #110 = InterfaceMethodref #105.#111     // java/util/stream/Stream.toList:()Ljava/util/List;
  #111 = NameAndType        #112:#19      // toList:()Ljava/util/List;
  #112 = Utf8               toList
  #113 = InterfaceMethodref #114.#115     // java/util/Set.addAll:(Ljava/util/Collection;)Z
  #114 = Class              #116          // java/util/Set
  #115 = NameAndType        #117:#118     // addAll:(Ljava/util/Collection;)Z
  #116 = Utf8               java/util/Set
  #117 = Utf8               addAll
  #118 = Utf8               (Ljava/util/Collection;)Z
  #119 = Fieldref           #21.#120      // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmRoute._isOnARoute:Z
  #120 = NameAndType        #121:#122     // _isOnARoute:Z
  #121 = Utf8               _isOnARoute
  #122 = Utf8               Z
  #123 = Fieldref           #21.#124      // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmRoute._reachedFirstNode:Z
  #124 = NameAndType        #125:#122     // _reachedFirstNode:Z
  #125 = Utf8               _reachedFirstNode
  #126 = Fieldref           #21.#127      // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmRoute._radius:I
  #127 = NameAndType        #128:#129     // _radius:I
  #128 = Utf8               _radius
  #129 = Utf8               I
  #130 = Methodref          #21.#17       // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmRoute.getNodes:()Ljava/util/List;
  #131 = InterfaceMethodref #50.#132      // java/util/List.isEmpty:()Z
  #132 = NameAndType        #133:#60      // isEmpty:()Z
  #133 = Utf8               isEmpty
  #134 = InvokeDynamic      #1:#135       // #1:applyAsDouble:(Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/ToDoubleFunction;
  #135 = NameAndType        #136:#137     // applyAsDouble:(Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/ToDoubleFunction;
  #136 = Utf8               applyAsDouble
  #137 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/ToDoubleFunction;
  #138 = InterfaceMethodref #139.#140     // java/util/Comparator.comparingDouble:(Ljava/util/function/ToDoubleFunction;)Ljava/util/Comparator;
  #139 = Class              #141          // java/util/Comparator
  #140 = NameAndType        #142:#143     // comparingDouble:(Ljava/util/function/ToDoubleFunction;)Ljava/util/Comparator;
  #141 = Utf8               java/util/Comparator
  #142 = Utf8               comparingDouble
  #143 = Utf8               (Ljava/util/function/ToDoubleFunction;)Ljava/util/Comparator;
  #144 = InterfaceMethodref #105.#145     // java/util/stream/Stream.min:(Ljava/util/Comparator;)Ljava/util/Optional;
  #145 = NameAndType        #146:#147     // min:(Ljava/util/Comparator;)Ljava/util/Optional;
  #146 = Utf8               min
  #147 = Utf8               (Ljava/util/Comparator;)Ljava/util/Optional;
  #148 = Methodref          #149.#150     // java/util/Optional.get:()Ljava/lang/Object;
  #149 = Class              #151          // java/util/Optional
  #150 = NameAndType        #152:#64      // get:()Ljava/lang/Object;
  #151 = Utf8               java/util/Optional
  #152 = Utf8               get
  #153 = Class              #154          // ext/mods/gameserver/model/location/Location
  #154 = Utf8               ext/mods/gameserver/model/location/Location
  #155 = InterfaceMethodref #50.#156      // java/util/List.indexOf:(Ljava/lang/Object;)I
  #156 = NameAndType        #157:#158     // indexOf:(Ljava/lang/Object;)I
  #157 = Utf8               indexOf
  #158 = Utf8               (Ljava/lang/Object;)I
  #159 = Fieldref           #21.#160      // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmRoute._index:I
  #160 = NameAndType        #161:#129     // _index:I
  #161 = Utf8               _index
  #162 = Methodref          #44.#163      // ext/mods/gameserver/model/actor/Player.isIn3DRadius:(Lext/mods/gameserver/model/location/Location;I)Z
  #163 = NameAndType        #164:#165     // isIn3DRadius:(Lext/mods/gameserver/model/location/Location;I)Z
  #164 = Utf8               isIn3DRadius
  #165 = Utf8               (Lext/mods/gameserver/model/location/Location;I)Z
  #166 = InterfaceMethodref #50.#167      // java/util/List.size:()I
  #167 = NameAndType        #168:#31      // size:()I
  #168 = Utf8               size
  #169 = InterfaceMethodref #50.#170      // java/util/List.get:(I)Ljava/lang/Object;
  #170 = NameAndType        #152:#171     // get:(I)Ljava/lang/Object;
  #171 = Utf8               (I)Ljava/lang/Object;
  #172 = Methodref          #44.#173      // ext/mods/gameserver/model/actor/Player.getMove:()Lext/mods/gameserver/model/actor/move/PlayerMove;
  #173 = NameAndType        #174:#175     // getMove:()Lext/mods/gameserver/model/actor/move/PlayerMove;
  #174 = Utf8               getMove
  #175 = Utf8               ()Lext/mods/gameserver/model/actor/move/PlayerMove;
  #176 = Methodref          #177.#178     // ext/mods/gameserver/model/actor/move/PlayerMove.getGeoPathFailCount:()I
  #177 = Class              #179          // ext/mods/gameserver/model/actor/move/PlayerMove
  #178 = NameAndType        #180:#31      // getGeoPathFailCount:()I
  #179 = Utf8               ext/mods/gameserver/model/actor/move/PlayerMove
  #180 = Utf8               getGeoPathFailCount
  #181 = Methodref          #21.#182      // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmRoute.reset:()V
  #182 = NameAndType        #183:#36      // reset:()V
  #183 = Utf8               reset
  #184 = Methodref          #93.#185      // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager.getInstance:()Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager;
  #185 = NameAndType        #186:#187     // getInstance:()Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager;
  #186 = Utf8               getInstance
  #187 = Utf8               ()Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager;
  #188 = String             #189          // Character fora da rota
  #189 = Utf8               Character fora da rota
  #190 = Methodref          #93.#191      // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager.stopPlayer:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
  #191 = NameAndType        #192:#193     // stopPlayer:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
  #192 = Utf8               stopPlayer
  #193 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
  #194 = Fieldref           #21.#195      // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmRoute._reversePath:Z
  #195 = NameAndType        #196:#122     // _reversePath:Z
  #196 = Utf8               _reversePath
  #197 = Methodref          #198.#199     // ext/mods/gameserver/geoengine/GeoEngine.getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
  #198 = Class              #200          // ext/mods/gameserver/geoengine/GeoEngine
  #199 = NameAndType        #186:#201     // getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
  #200 = Utf8               ext/mods/gameserver/geoengine/GeoEngine
  #201 = Utf8               ()Lext/mods/gameserver/geoengine/GeoEngine;
  #202 = Methodref          #44.#203      // ext/mods/gameserver/model/actor/Player.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
  #203 = NameAndType        #204:#205     // getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
  #204 = Utf8               getPosition
  #205 = Utf8               ()Lext/mods/gameserver/model/location/SpawnLocation;
  #206 = Methodref          #198.#207     // ext/mods/gameserver/geoengine/GeoEngine.canMoveToTarget:(Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;)Z
  #207 = NameAndType        #208:#209     // canMoveToTarget:(Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;)Z
  #208 = Utf8               canMoveToTarget
  #209 = Utf8               (Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;)Z
  #210 = Methodref          #44.#211      // ext/mods/gameserver/model/actor/Player.getX:()I
  #211 = NameAndType        #212:#31      // getX:()I
  #212 = Utf8               getX
  #213 = Methodref          #44.#214      // ext/mods/gameserver/model/actor/Player.getY:()I
  #214 = NameAndType        #215:#31      // getY:()I
  #215 = Utf8               getY
  #216 = Methodref          #44.#217      // ext/mods/gameserver/model/actor/Player.getZ:()I
  #217 = NameAndType        #218:#31      // getZ:()I
  #218 = Utf8               getZ
  #219 = Methodref          #153.#211     // ext/mods/gameserver/model/location/Location.getX:()I
  #220 = Methodref          #153.#214     // ext/mods/gameserver/model/location/Location.getY:()I
  #221 = Methodref          #153.#217     // ext/mods/gameserver/model/location/Location.getZ:()I
  #222 = Methodref          #198.#223     // ext/mods/gameserver/geoengine/GeoEngine.findPath:(IIIIIIZLext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Ljava/util/List;
  #223 = NameAndType        #224:#225     // findPath:(IIIIIIZLext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Ljava/util/List;
  #224 = Utf8               findPath
  #225 = Utf8               (IIIIIIZLext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Ljava/util/List;
  #226 = Methodref          #177.#227     // ext/mods/gameserver/model/actor/move/PlayerMove.addGeoPathFailCount:()V
  #227 = NameAndType        #228:#36      // addGeoPathFailCount:()V
  #228 = Utf8               addGeoPathFailCount
  #229 = Fieldref           #230.#231     // ext/mods/Config.SISTEMA_PATHFINDING:Z
  #230 = Class              #232          // ext/mods/Config
  #231 = NameAndType        #233:#122     // SISTEMA_PATHFINDING:Z
  #232 = Utf8               ext/mods/Config
  #233 = Utf8               SISTEMA_PATHFINDING
  #234 = Methodref          #177.#235     // ext/mods/gameserver/model/actor/move/PlayerMove.maybePlayerMoveToLocation:(Lext/mods/gameserver/model/location/Location;IZZ)Z
  #235 = NameAndType        #236:#237     // maybePlayerMoveToLocation:(Lext/mods/gameserver/model/location/Location;IZZ)Z
  #236 = Utf8               maybePlayerMoveToLocation
  #237 = Utf8               (Lext/mods/gameserver/model/location/Location;IZZ)Z
  #238 = InvokeDynamic      #2:#135       // #2:applyAsDouble:(Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/ToDoubleFunction;
  #239 = Methodref          #240.#241     // ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
  #240 = Class              #242          // ext/mods/gameserver/model/World
  #241 = NameAndType        #186:#243     // getInstance:()Lext/mods/gameserver/model/World;
  #242 = Utf8               ext/mods/gameserver/model/World
  #243 = Utf8               ()Lext/mods/gameserver/model/World;
  #244 = Methodref          #240.#245     // ext/mods/gameserver/model/World.getRegion:(Lext/mods/gameserver/model/location/Location;)Lext/mods/gameserver/model/WorldRegion;
  #245 = NameAndType        #246:#247     // getRegion:(Lext/mods/gameserver/model/location/Location;)Lext/mods/gameserver/model/WorldRegion;
  #246 = Utf8               getRegion
  #247 = Utf8               (Lext/mods/gameserver/model/location/Location;)Lext/mods/gameserver/model/WorldRegion;
  #248 = InvokeDynamic      #3:#249       // #3:accept:(Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmRoute;Ljava/lang/Class;ILjava/util/List;)Ljava/util/function/Consumer;
  #249 = NameAndType        #250:#251     // accept:(Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmRoute;Ljava/lang/Class;ILjava/util/List;)Ljava/util/function/Consumer;
  #250 = Utf8               accept
  #251 = Utf8               (Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmRoute;Ljava/lang/Class;ILjava/util/List;)Ljava/util/function/Consumer;
  #252 = Methodref          #253.#254     // ext/mods/gameserver/model/WorldRegion.forEachRegion:(ILjava/util/function/Consumer;)V
  #253 = Class              #255          // ext/mods/gameserver/model/WorldRegion
  #254 = NameAndType        #256:#257     // forEachRegion:(ILjava/util/function/Consumer;)V
  #255 = Utf8               ext/mods/gameserver/model/WorldRegion
  #256 = Utf8               forEachRegion
  #257 = Utf8               (ILjava/util/function/Consumer;)V
  #258 = InvokeDynamic      #4:#259       // #4:test:(I)Ljava/util/function/Predicate;
  #259 = NameAndType        #260:#261     // test:(I)Ljava/util/function/Predicate;
  #260 = Utf8               test
  #261 = Utf8               (I)Ljava/util/function/Predicate;
  #262 = Methodref          #263.#264     // java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
  #263 = Class              #265          // java/util/Objects
  #264 = NameAndType        #266:#267     // requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
  #265 = Utf8               java/util/Objects
  #266 = Utf8               requireNonNull
  #267 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
  #268 = InvokeDynamic      #5:#269       // #5:accept:(Ljava/util/List;)Ljava/util/function/Consumer;
  #269 = NameAndType        #250:#270     // accept:(Ljava/util/List;)Ljava/util/function/Consumer;
  #270 = Utf8               (Ljava/util/List;)Ljava/util/function/Consumer;
  #271 = Methodref          #253.#272     // ext/mods/gameserver/model/WorldRegion.forEachType:(Ljava/lang/Class;Lext/mods/gameserver/model/WorldObject;Ljava/util/function/Predicate;Ljava/util/function/Consumer;)V
  #272 = NameAndType        #273:#274     // forEachType:(Ljava/lang/Class;Lext/mods/gameserver/model/WorldObject;Ljava/util/function/Predicate;Ljava/util/function/Consumer;)V
  #273 = Utf8               forEachType
  #274 = Utf8               (Ljava/lang/Class;Lext/mods/gameserver/model/WorldObject;Ljava/util/function/Predicate;Ljava/util/function/Consumer;)V
  #275 = Methodref          #276.#66      // ext/mods/gameserver/model/WorldObject.isInStrictRadius:(Lext/mods/gameserver/model/WorldObject;I)Z
  #276 = Class              #277          // ext/mods/gameserver/model/WorldObject
  #277 = Utf8               ext/mods/gameserver/model/WorldObject
  #278 = Methodref          #44.#279      // ext/mods/gameserver/model/actor/Player.distance3D:(Lext/mods/gameserver/model/location/Location;)D
  #279 = NameAndType        #280:#281     // distance3D:(Lext/mods/gameserver/model/location/Location;)D
  #280 = Utf8               distance3D
  #281 = Utf8               (Lext/mods/gameserver/model/location/Location;)D
  #282 = Utf8               (ILjava/lang/String;I)V
  #283 = Utf8               Code
  #284 = Utf8               LineNumberTable
  #285 = Utf8               LocalVariableTable
  #286 = Utf8               this
  #287 = Utf8               Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmRoute;
  #288 = Utf8               id
  #289 = Utf8               name
  #290 = Utf8               Ljava/lang/String;
  #291 = Utf8               ownerId
  #292 = Utf8               (Ljava/lang/String;I)V
  #293 = Utf8               visualizeZone
  #294 = Utf8               (Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;)V
  #295 = Utf8               debug
  #296 = Utf8               Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;
  #297 = Utf8               getRouteZone
  #298 = Utf8               ()Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmRoute;
  #299 = Utf8               Signature
  #300 = Utf8               ()Ljava/util/List<Lext/mods/gameserver/model/location/Location;>;
  #301 = Utf8               getMonsters
  #302 = Utf8               m
  #303 = Utf8               Lext/mods/gameserver/model/actor/instance/Monster;
  #304 = Utf8               monsters
  #305 = Utf8               Ljava/util/List;
  #306 = Utf8               LocalVariableTypeTable
  #307 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/actor/instance/Monster;>;
  #308 = Utf8               StackMapTable
  #309 = Utf8               ()Ljava/util/List<Lext/mods/gameserver/model/actor/instance/Monster;>;
  #310 = Utf8               getMonsterHistory
  #311 = Utf8               ()Ljava/util/Set;
  #312 = Utf8               ()Ljava/util/Set<Ljava/lang/String;>;
  #313 = Utf8               isOwnerOnARoute
  #314 = Utf8               reachedFirstNode
  #315 = Utf8               getRadius
  #316 = Utf8               setRadius
  #317 = Utf8               (I)V
  #318 = Utf8               value
  #319 = Utf8               tryMoveToNextNode
  #320 = Utf8               nearestNode
  #321 = Utf8               Lext/mods/gameserver/model/location/Location;
  #322 = Utf8               path
  #323 = Utf8               player
  #324 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #325 = Utf8               nodes
  #326 = Utf8               node
  #327 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/location/Location;>;
  #328 = Utf8               moveToNextPoint
  #329 = Utf8               Deprecated
  #330 = Utf8               RuntimeVisibleAnnotations
  #331 = Utf8               Ljava/lang/Deprecated;
  #332 = Utf8               wr
  #333 = Utf8               Lext/mods/gameserver/model/WorldRegion;
  #334 = Utf8               loc
  #335 = Utf8               type
  #336 = Utf8               Ljava/lang/Class;
  #337 = Utf8               radius
  #338 = Utf8               result
  #339 = Utf8               depth
  #340 = Utf8               Ljava/lang/Class<TA;>;
  #341 = Utf8               Ljava/util/List<TA;>;
  #342 = Utf8               <A:Lext/mods/gameserver/model/WorldObject;>(Ljava/lang/Class<TA;>;I)Ljava/util/List<TA;>;
  #343 = Utf8               lambda$getKnownTypeInRadius$0
  #344 = Utf8               (Ljava/lang/Class;ILjava/util/List;Lext/mods/gameserver/model/WorldRegion;)V
  #345 = Utf8               r
  #346 = Utf8               lambda$getKnownTypeInRadius$1
  #347 = Utf8               (ILext/mods/gameserver/model/WorldObject;)Z
  #348 = Utf8               o
  #349 = Utf8               Lext/mods/gameserver/model/WorldObject;
  #350 = Utf8               lambda$moveToNextPoint$0
  #351 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/location/Location;)D
  #352 = Utf8               wl
  #353 = Utf8               lambda$tryMoveToNextNode$0
  #354 = Utf8               SourceFile
  #355 = Utf8               AutoFarmRoute.java
  #356 = Utf8               BootstrapMethods
  #357 = MethodType         #267          //  (Ljava/lang/Object;)Ljava/lang/Object;
  #358 = MethodHandle       5:#359        // REF_invokeVirtual ext/mods/gameserver/model/WorldObject.getName:()Ljava/lang/String;
  #359 = Methodref          #276.#360     // ext/mods/gameserver/model/WorldObject.getName:()Ljava/lang/String;
  #360 = NameAndType        #361:#362     // getName:()Ljava/lang/String;
  #361 = Utf8               getName
  #362 = Utf8               ()Ljava/lang/String;
  #363 = MethodType         #364          //  (Lext/mods/gameserver/model/actor/instance/Monster;)Ljava/lang/String;
  #364 = Utf8               (Lext/mods/gameserver/model/actor/instance/Monster;)Ljava/lang/String;
  #365 = MethodType         #366          //  (Ljava/lang/Object;)D
  #366 = Utf8               (Ljava/lang/Object;)D
  #367 = MethodHandle       6:#368        // REF_invokeStatic ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmRoute.lambda$tryMoveToNextNode$0:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/location/Location;)D
  #368 = Methodref          #21.#369      // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmRoute.lambda$tryMoveToNextNode$0:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/location/Location;)D
  #369 = NameAndType        #353:#351     // lambda$tryMoveToNextNode$0:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/location/Location;)D
  #370 = MethodType         #281          //  (Lext/mods/gameserver/model/location/Location;)D
  #371 = MethodHandle       6:#372        // REF_invokeStatic ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmRoute.lambda$moveToNextPoint$0:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/location/Location;)D
  #372 = Methodref          #21.#373      // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmRoute.lambda$moveToNextPoint$0:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/location/Location;)D
  #373 = NameAndType        #350:#351     // lambda$moveToNextPoint$0:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/location/Location;)D
  #374 = MethodType         #375          //  (Ljava/lang/Object;)V
  #375 = Utf8               (Ljava/lang/Object;)V
  #376 = MethodHandle       5:#377        // REF_invokeVirtual ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmRoute.lambda$getKnownTypeInRadius$0:(Ljava/lang/Class;ILjava/util/List;Lext/mods/gameserver/model/WorldRegion;)V
  #377 = Methodref          #21.#378      // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmRoute.lambda$getKnownTypeInRadius$0:(Ljava/lang/Class;ILjava/util/List;Lext/mods/gameserver/model/WorldRegion;)V
  #378 = NameAndType        #343:#344     // lambda$getKnownTypeInRadius$0:(Ljava/lang/Class;ILjava/util/List;Lext/mods/gameserver/model/WorldRegion;)V
  #379 = MethodType         #380          //  (Lext/mods/gameserver/model/WorldRegion;)V
  #380 = Utf8               (Lext/mods/gameserver/model/WorldRegion;)V
  #381 = MethodType         #72           //  (Ljava/lang/Object;)Z
  #382 = MethodHandle       6:#383        // REF_invokeStatic ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmRoute.lambda$getKnownTypeInRadius$1:(ILext/mods/gameserver/model/WorldObject;)Z
  #383 = Methodref          #21.#384      // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmRoute.lambda$getKnownTypeInRadius$1:(ILext/mods/gameserver/model/WorldObject;)Z
  #384 = NameAndType        #346:#347     // lambda$getKnownTypeInRadius$1:(ILext/mods/gameserver/model/WorldObject;)Z
  #385 = MethodType         #386          //  (Lext/mods/gameserver/model/WorldObject;)Z
  #386 = Utf8               (Lext/mods/gameserver/model/WorldObject;)Z
  #387 = MethodHandle       9:#69         // REF_invokeInterface java/util/List.add:(Ljava/lang/Object;)Z
  #388 = MethodType         #389          //  (Lext/mods/gameserver/model/WorldObject;)V
  #389 = Utf8               (Lext/mods/gameserver/model/WorldObject;)V
  #390 = MethodHandle       6:#391        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #391 = Methodref          #392.#393     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #392 = Class              #394          // java/lang/invoke/LambdaMetafactory
  #393 = NameAndType        #395:#396     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #394 = Utf8               java/lang/invoke/LambdaMetafactory
  #395 = Utf8               metafactory
  #396 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #397 = Utf8               InnerClasses
  #398 = Utf8               AutoFarmType
  #399 = Class              #400          // java/lang/invoke/MethodHandles$Lookup
  #400 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #401 = Class              #402          // java/lang/invoke/MethodHandles
  #402 = Utf8               java/lang/invoke/MethodHandles
  #403 = Utf8               Lookup
{
  public ext.mods.gameserver.model.entity.autofarm.zone.AutoFarmRoute(int, java.lang.String, int);
    descriptor: (ILjava/lang/String;I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=4, args_size=4
         0: aload_0
         1: iload_1
         2: aload_2
         3: iload_3
         4: getstatic     #1                  // Field ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType.ROTA:Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;
         7: invokespecial #7                  // Method ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea."<init>":(ILjava/lang/String;ILext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;)V
        10: return
      LineNumberTable:
        line 47: 0
        line 48: 10
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      11     0  this   Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmRoute;
            0      11     1    id   I
            0      11     2  name   Ljava/lang/String;
            0      11     3 ownerId   I

  public ext.mods.gameserver.model.entity.autofarm.zone.AutoFarmRoute(java.lang.String, int);
    descriptor: (Ljava/lang/String;I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: iload_2
         3: getstatic     #1                  // Field ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType.ROTA:Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;
         6: invokespecial #13                 // Method ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea."<init>":(Ljava/lang/String;ILext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;)V
         9: return
      LineNumberTable:
        line 52: 0
        line 53: 9
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmRoute;
            0      10     1  name   Ljava/lang/String;
            0      10     2 ownerId   I

  public void visualizeZone(ext.mods.gameserver.network.serverpackets.ExServerPrimitive);
    descriptor: (Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=0, locals=2, args_size=2
         0: return
      LineNumberTable:
        line 60: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       1     0  this   Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmRoute;
            0       1     1 debug   Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;

  public ext.mods.gameserver.model.entity.autofarm.zone.AutoFarmRoute getRouteZone();
    descriptor: ()Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmRoute;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: areturn
      LineNumberTable:
        line 66: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmRoute;

  public java.util.List<ext.mods.gameserver.model.location.Location> getNodes();
    descriptor: ()Ljava/util/List;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #16                 // Method ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.getNodes:()Ljava/util/List;
         4: areturn
      LineNumberTable:
        line 72: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmRoute;
    Signature: #300                         // ()Ljava/util/List<Lext/mods/gameserver/model/location/Location;>;

  public java.util.List<ext.mods.gameserver.model.actor.instance.Monster> getMonsters();
    descriptor: ()Ljava/util/List;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=4, args_size=1
         0: aload_0
         1: invokevirtual #20                 // Method getProfile:()Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
         4: invokevirtual #26                 // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getFinalRadius:()I
         7: bipush        100
         9: if_icmpge     124
        12: new           #32                 // class java/util/ArrayList
        15: dup
        16: invokespecial #34                 // Method java/util/ArrayList."<init>":()V
        19: astore_1
        20: aload_0
        21: invokevirtual #37                 // Method getOwner:()Lext/mods/gameserver/model/actor/Player;
        24: ldc           #41                 // class ext/mods/gameserver/model/actor/instance/Monster
        26: aload_0
        27: invokevirtual #20                 // Method getProfile:()Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
        30: invokevirtual #26                 // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getFinalRadius:()I
        33: iconst_2
        34: imul
        35: invokevirtual #43                 // Method ext/mods/gameserver/model/actor/Player.getKnownTypeInRadius:(Ljava/lang/Class;I)Ljava/util/List;
        38: invokeinterface #49,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
        43: astore_2
        44: aload_2
        45: invokeinterface #55,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        50: ifeq          122
        53: aload_2
        54: invokeinterface #61,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        59: checkcast     #41                 // class ext/mods/gameserver/model/actor/instance/Monster
        62: astore_3
        63: aload_3
        64: aload_3
        65: aload_0
        66: invokevirtual #20                 // Method getProfile:()Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
        69: invokevirtual #26                 // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getFinalRadius:()I
        72: invokevirtual #65                 // Method ext/mods/gameserver/model/actor/instance/Monster.isInStrictRadius:(Lext/mods/gameserver/model/WorldObject;I)Z
        75: ifeq          89
        78: aload_1
        79: aload_3
        80: invokeinterface #69,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        85: pop
        86: goto          44
        89: aload_3
        90: invokevirtual #73                 // Method ext/mods/gameserver/model/actor/instance/Monster.getAI:()Lext/mods/gameserver/model/actor/ai/type/AttackableAI;
        93: invokevirtual #77                 // Method ext/mods/gameserver/model/actor/ai/type/AttackableAI.getAggroList:()Lext/mods/gameserver/model/actor/container/attackable/AggroList;
        96: aload_0
        97: invokevirtual #37                 // Method getOwner:()Lext/mods/gameserver/model/actor/Player;
       100: invokevirtual #83                 // Method ext/mods/gameserver/model/actor/container/attackable/AggroList.getHate:(Lext/mods/gameserver/model/actor/Creature;)D
       103: dconst_0
       104: dcmpl
       105: ifle          119
       108: aload_1
       109: aload_3
       110: invokeinterface #69,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       115: pop
       116: goto          44
       119: goto          44
       122: aload_1
       123: areturn
       124: aload_0
       125: invokevirtual #37                 // Method getOwner:()Lext/mods/gameserver/model/actor/Player;
       128: ldc           #41                 // class ext/mods/gameserver/model/actor/instance/Monster
       130: aload_0
       131: invokevirtual #20                 // Method getProfile:()Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
       134: invokevirtual #26                 // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getFinalRadius:()I
       137: invokevirtual #43                 // Method ext/mods/gameserver/model/actor/Player.getKnownTypeInRadius:(Ljava/lang/Class;I)Ljava/util/List;
       140: areturn
      LineNumberTable:
        line 78: 0
        line 80: 12
        line 81: 20
        line 83: 63
        line 85: 78
        line 86: 86
        line 89: 89
        line 91: 108
        line 92: 116
        line 94: 119
        line 96: 122
        line 99: 124
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           63      56     3     m   Lext/mods/gameserver/model/actor/instance/Monster;
           20     104     1 monsters   Ljava/util/List;
            0     141     0  this   Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmRoute;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
           20     104     1 monsters   Ljava/util/List<Lext/mods/gameserver/model/actor/instance/Monster;>;
      StackMapTable: number_of_entries = 5
        frame_type = 253 /* append */
          offset_delta = 44
          locals = [ class java/util/List, class java/util/Iterator ]
        frame_type = 252 /* append */
          offset_delta = 44
          locals = [ class ext/mods/gameserver/model/actor/instance/Monster ]
        frame_type = 250 /* chop */
          offset_delta = 29
        frame_type = 250 /* chop */
          offset_delta = 2
        frame_type = 250 /* chop */
          offset_delta = 1
    Signature: #309                         // ()Ljava/util/List<Lext/mods/gameserver/model/actor/instance/Monster;>;

  public java.util.Set<java.lang.String> getMonsterHistory();
    descriptor: ()Ljava/util/Set;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=1, args_size=1
         0: aload_0
         1: getfield      #89                 // Field _monsterHistory:Ljava/util/Set;
         4: aload_0
         5: ldc           #41                 // class ext/mods/gameserver/model/actor/instance/Monster
         7: sipush        1500
        10: invokevirtual #95                 // Method getKnownTypeInRadius:(Ljava/lang/Class;I)Ljava/util/List;
        13: invokeinterface #96,  1           // InterfaceMethod java/util/List.stream:()Ljava/util/stream/Stream;
        18: invokedynamic #100,  0            // InvokeDynamic #0:apply:()Ljava/util/function/Function;
        23: invokeinterface #104,  2          // InterfaceMethod java/util/stream/Stream.map:(Ljava/util/function/Function;)Ljava/util/stream/Stream;
        28: invokeinterface #110,  1          // InterfaceMethod java/util/stream/Stream.toList:()Ljava/util/List;
        33: invokeinterface #113,  2          // InterfaceMethod java/util/Set.addAll:(Ljava/util/Collection;)Z
        38: pop
        39: aload_0
        40: getfield      #89                 // Field _monsterHistory:Ljava/util/Set;
        43: areturn
      LineNumberTable:
        line 105: 0
        line 106: 39
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      44     0  this   Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmRoute;
    Signature: #312                         // ()Ljava/util/Set<Ljava/lang/String;>;

  public void reset();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: iconst_0
         2: putfield      #119                // Field _isOnARoute:Z
         5: aload_0
         6: iconst_0
         7: putfield      #123                // Field _reachedFirstNode:Z
        10: return
      LineNumberTable:
        line 111: 0
        line 112: 5
        line 113: 10
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      11     0  this   Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmRoute;

  public boolean isOwnerOnARoute();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #119                // Field _isOnARoute:Z
         4: ireturn
      LineNumberTable:
        line 121: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmRoute;

  public boolean reachedFirstNode();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #123                // Field _reachedFirstNode:Z
         4: ireturn
      LineNumberTable:
        line 129: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmRoute;

  public int getRadius();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #126                // Field _radius:I
         4: ireturn
      LineNumberTable:
        line 134: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmRoute;

  public void setRadius(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #126                // Field _radius:I
         5: return
      LineNumberTable:
        line 139: 0
        line 140: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmRoute;
            0       6     1 value   I

  public boolean tryMoveToNextNode();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=9, locals=5, args_size=1
         0: aload_0
         1: invokevirtual #37                 // Method getOwner:()Lext/mods/gameserver/model/actor/Player;
         4: astore_1
         5: aload_0
         6: invokevirtual #130                // Method getNodes:()Ljava/util/List;
         9: astore_2
        10: aload_2
        11: invokeinterface #131,  1          // InterfaceMethod java/util/List.isEmpty:()Z
        16: ifeq          21
        19: iconst_0
        20: ireturn
        21: aload_0
        22: getfield      #119                // Field _isOnARoute:Z
        25: ifne          122
        28: aload_2
        29: invokeinterface #96,  1           // InterfaceMethod java/util/List.stream:()Ljava/util/stream/Stream;
        34: aload_1
        35: invokedynamic #134,  0            // InvokeDynamic #1:applyAsDouble:(Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/ToDoubleFunction;
        40: invokestatic  #138                // InterfaceMethod java/util/Comparator.comparingDouble:(Ljava/util/function/ToDoubleFunction;)Ljava/util/Comparator;
        43: invokeinterface #144,  2          // InterfaceMethod java/util/stream/Stream.min:(Ljava/util/Comparator;)Ljava/util/Optional;
        48: invokevirtual #148                // Method java/util/Optional.get:()Ljava/lang/Object;
        51: checkcast     #153                // class ext/mods/gameserver/model/location/Location
        54: astore_3
        55: aload_0
        56: aload_2
        57: aload_3
        58: invokeinterface #155,  2          // InterfaceMethod java/util/List.indexOf:(Ljava/lang/Object;)I
        63: putfield      #159                // Field _index:I
        66: aload_1
        67: aload_3
        68: bipush        50
        70: invokevirtual #162                // Method ext/mods/gameserver/model/actor/Player.isIn3DRadius:(Lext/mods/gameserver/model/location/Location;I)Z
        73: ifeq          119
        76: aload_0
        77: getfield      #159                // Field _index:I
        80: aload_2
        81: invokeinterface #166,  1          // InterfaceMethod java/util/List.size:()I
        86: iconst_1
        87: isub
        88: if_icmpge     104
        91: aload_0
        92: dup
        93: getfield      #159                // Field _index:I
        96: iconst_1
        97: iadd
        98: putfield      #159                // Field _index:I
       101: goto          119
       104: aload_2
       105: invokeinterface #166,  1          // InterfaceMethod java/util/List.size:()I
       110: iconst_1
       111: if_icmple     119
       114: aload_0
       115: iconst_0
       116: putfield      #159                // Field _index:I
       119: goto          274
       122: aload_1
       123: aload_2
       124: aload_0
       125: getfield      #159                // Field _index:I
       128: invokeinterface #169,  2          // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
       133: checkcast     #153                // class ext/mods/gameserver/model/location/Location
       136: bipush        50
       138: invokevirtual #162                // Method ext/mods/gameserver/model/actor/Player.isIn3DRadius:(Lext/mods/gameserver/model/location/Location;I)Z
       141: ifeq          274
       144: aload_1
       145: invokevirtual #172                // Method ext/mods/gameserver/model/actor/Player.getMove:()Lext/mods/gameserver/model/actor/move/PlayerMove;
       148: invokevirtual #176                // Method ext/mods/gameserver/model/actor/move/PlayerMove.getGeoPathFailCount:()I
       151: bipush        10
       153: if_icmplt     171
       156: aload_0
       157: invokevirtual #181                // Method reset:()V
       160: invokestatic  #184                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmManager.getInstance:()Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager;
       163: aload_1
       164: ldc           #188                // String Character fora da rota
       166: invokevirtual #190                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmManager.stopPlayer:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
       169: iconst_0
       170: ireturn
       171: aload_0
       172: getfield      #119                // Field _isOnARoute:Z
       175: ifeq          190
       178: aload_0
       179: getfield      #123                // Field _reachedFirstNode:Z
       182: ifne          190
       185: aload_0
       186: iconst_1
       187: putfield      #123                // Field _reachedFirstNode:Z
       190: aload_0
       191: getfield      #194                // Field _reversePath:Z
       194: ifeq          229
       197: aload_0
       198: getfield      #159                // Field _index:I
       201: ifle          229
       204: aload_0
       205: dup
       206: getfield      #159                // Field _index:I
       209: iconst_1
       210: isub
       211: putfield      #159                // Field _index:I
       214: aload_0
       215: getfield      #159                // Field _index:I
       218: ifne          274
       221: aload_0
       222: iconst_0
       223: putfield      #194                // Field _reversePath:Z
       226: goto          274
       229: aload_0
       230: getfield      #159                // Field _index:I
       233: aload_2
       234: invokeinterface #166,  1          // InterfaceMethod java/util/List.size:()I
       239: iconst_1
       240: isub
       241: if_icmpge     257
       244: aload_0
       245: dup
       246: getfield      #159                // Field _index:I
       249: iconst_1
       250: iadd
       251: putfield      #159                // Field _index:I
       254: goto          274
       257: aload_0
       258: aload_2
       259: invokeinterface #166,  1          // InterfaceMethod java/util/List.size:()I
       264: iconst_2
       265: isub
       266: putfield      #159                // Field _index:I
       269: aload_0
       270: iconst_1
       271: putfield      #194                // Field _reversePath:Z
       274: aload_2
       275: aload_0
       276: getfield      #159                // Field _index:I
       279: invokeinterface #169,  2          // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
       284: checkcast     #153                // class ext/mods/gameserver/model/location/Location
       287: astore_3
       288: invokestatic  #197                // Method ext/mods/gameserver/geoengine/GeoEngine.getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
       291: aload_1
       292: invokevirtual #202                // Method ext/mods/gameserver/model/actor/Player.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
       295: aload_3
       296: invokevirtual #206                // Method ext/mods/gameserver/geoengine/GeoEngine.canMoveToTarget:(Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;)Z
       299: ifne          404
       302: invokestatic  #197                // Method ext/mods/gameserver/geoengine/GeoEngine.getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
       305: aload_1
       306: invokevirtual #210                // Method ext/mods/gameserver/model/actor/Player.getX:()I
       309: aload_1
       310: invokevirtual #213                // Method ext/mods/gameserver/model/actor/Player.getY:()I
       313: aload_1
       314: invokevirtual #216                // Method ext/mods/gameserver/model/actor/Player.getZ:()I
       317: aload_3
       318: invokevirtual #219                // Method ext/mods/gameserver/model/location/Location.getX:()I
       321: aload_3
       322: invokevirtual #220                // Method ext/mods/gameserver/model/location/Location.getY:()I
       325: aload_3
       326: invokevirtual #221                // Method ext/mods/gameserver/model/location/Location.getZ:()I
       329: iconst_1
       330: aconst_null
       331: invokevirtual #222                // Method ext/mods/gameserver/geoengine/GeoEngine.findPath:(IIIIIIZLext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Ljava/util/List;
       334: astore        4
       336: aload         4
       338: invokeinterface #131,  1          // InterfaceMethod java/util/List.isEmpty:()Z
       343: ifeq          404
       346: aload_1
       347: invokevirtual #172                // Method ext/mods/gameserver/model/actor/Player.getMove:()Lext/mods/gameserver/model/actor/move/PlayerMove;
       350: invokevirtual #226                // Method ext/mods/gameserver/model/actor/move/PlayerMove.addGeoPathFailCount:()V
       353: aload_0
       354: getfield      #159                // Field _index:I
       357: ifne          380
       360: aload_0
       361: aload_2
       362: invokeinterface #166,  1          // InterfaceMethod java/util/List.size:()I
       367: iconst_2
       368: isub
       369: putfield      #159                // Field _index:I
       372: aload_0
       373: iconst_1
       374: putfield      #194                // Field _reversePath:Z
       377: goto          390
       380: aload_0
       381: dup
       382: getfield      #159                // Field _index:I
       385: iconst_1
       386: isub
       387: putfield      #159                // Field _index:I
       390: aload_2
       391: aload_0
       392: getfield      #159                // Field _index:I
       395: invokeinterface #169,  2          // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
       400: checkcast     #153                // class ext/mods/gameserver/model/location/Location
       403: astore_3
       404: aload_1
       405: invokevirtual #172                // Method ext/mods/gameserver/model/actor/Player.getMove:()Lext/mods/gameserver/model/actor/move/PlayerMove;
       408: aload_3
       409: iconst_0
       410: getstatic     #229                // Field ext/mods/Config.SISTEMA_PATHFINDING:Z
       413: iconst_0
       414: invokevirtual #234                // Method ext/mods/gameserver/model/actor/move/PlayerMove.maybePlayerMoveToLocation:(Lext/mods/gameserver/model/location/Location;IZZ)Z
       417: pop
       418: aload_0
       419: iconst_1
       420: putfield      #119                // Field _isOnARoute:Z
       423: iconst_1
       424: ireturn
      LineNumberTable:
        line 149: 0
        line 150: 5
        line 152: 10
        line 153: 19
        line 155: 21
        line 157: 28
        line 158: 55
        line 160: 66
        line 162: 76
        line 163: 91
        line 164: 104
        line 165: 114
        line 167: 119
        line 168: 122
        line 170: 144
        line 172: 156
        line 173: 160
        line 174: 169
        line 177: 171
        line 178: 185
        line 180: 190
        line 182: 204
        line 184: 214
        line 185: 221
        line 187: 229
        line 188: 244
        line 191: 257
        line 192: 269
        line 196: 274
        line 198: 288
        line 200: 302
        line 201: 336
        line 203: 346
        line 205: 353
        line 207: 360
        line 208: 372
        line 211: 380
        line 213: 390
        line 217: 404
        line 218: 418
        line 219: 423
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           55      64     3 nearestNode   Lext/mods/gameserver/model/location/Location;
          336      68     4  path   Ljava/util/List;
            0     425     0  this   Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmRoute;
            5     420     1 player   Lext/mods/gameserver/model/actor/Player;
           10     415     2 nodes   Ljava/util/List;
          288     137     3  node   Lext/mods/gameserver/model/location/Location;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
          336      68     4  path   Ljava/util/List<Lext/mods/gameserver/model/location/Location;>;
           10     415     2 nodes   Ljava/util/List<Lext/mods/gameserver/model/location/Location;>;
      StackMapTable: number_of_entries = 12
        frame_type = 253 /* append */
          offset_delta = 21
          locals = [ class ext/mods/gameserver/model/actor/Player, class java/util/List ]
        frame_type = 252 /* append */
          offset_delta = 82
          locals = [ class ext/mods/gameserver/model/location/Location ]
        frame_type = 250 /* chop */
          offset_delta = 14
        frame_type = 2 /* same */
        frame_type = 48 /* same */
        frame_type = 18 /* same */
        frame_type = 38 /* same */
        frame_type = 27 /* same */
        frame_type = 16 /* same */
        frame_type = 253 /* append */
          offset_delta = 105
          locals = [ class ext/mods/gameserver/model/location/Location, class java/util/List ]
        frame_type = 9 /* same */
        frame_type = 250 /* chop */
          offset_delta = 13

  public void moveToNextPoint();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=9, locals=5, args_size=1
         0: aload_0
         1: invokevirtual #37                 // Method getOwner:()Lext/mods/gameserver/model/actor/Player;
         4: astore_1
         5: aload_0
         6: invokevirtual #130                // Method getNodes:()Ljava/util/List;
         9: astore_2
        10: aload_2
        11: invokeinterface #131,  1          // InterfaceMethod java/util/List.isEmpty:()Z
        16: ifeq          20
        19: return
        20: aload_0
        21: getfield      #119                // Field _isOnARoute:Z
        24: ifne          121
        27: aload_2
        28: invokeinterface #96,  1           // InterfaceMethod java/util/List.stream:()Ljava/util/stream/Stream;
        33: aload_1
        34: invokedynamic #238,  0            // InvokeDynamic #2:applyAsDouble:(Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/ToDoubleFunction;
        39: invokestatic  #138                // InterfaceMethod java/util/Comparator.comparingDouble:(Ljava/util/function/ToDoubleFunction;)Ljava/util/Comparator;
        42: invokeinterface #144,  2          // InterfaceMethod java/util/stream/Stream.min:(Ljava/util/Comparator;)Ljava/util/Optional;
        47: invokevirtual #148                // Method java/util/Optional.get:()Ljava/lang/Object;
        50: checkcast     #153                // class ext/mods/gameserver/model/location/Location
        53: astore_3
        54: aload_0
        55: aload_2
        56: aload_3
        57: invokeinterface #155,  2          // InterfaceMethod java/util/List.indexOf:(Ljava/lang/Object;)I
        62: putfield      #159                // Field _index:I
        65: aload_1
        66: aload_3
        67: bipush        50
        69: invokevirtual #162                // Method ext/mods/gameserver/model/actor/Player.isIn3DRadius:(Lext/mods/gameserver/model/location/Location;I)Z
        72: ifeq          118
        75: aload_0
        76: getfield      #159                // Field _index:I
        79: aload_2
        80: invokeinterface #166,  1          // InterfaceMethod java/util/List.size:()I
        85: iconst_1
        86: isub
        87: if_icmpge     103
        90: aload_0
        91: dup
        92: getfield      #159                // Field _index:I
        95: iconst_1
        96: iadd
        97: putfield      #159                // Field _index:I
       100: goto          118
       103: aload_2
       104: invokeinterface #166,  1          // InterfaceMethod java/util/List.size:()I
       109: iconst_1
       110: if_icmple     118
       113: aload_0
       114: iconst_0
       115: putfield      #159                // Field _index:I
       118: goto          272
       121: aload_1
       122: aload_2
       123: aload_0
       124: getfield      #159                // Field _index:I
       127: invokeinterface #169,  2          // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
       132: checkcast     #153                // class ext/mods/gameserver/model/location/Location
       135: bipush        50
       137: invokevirtual #162                // Method ext/mods/gameserver/model/actor/Player.isIn3DRadius:(Lext/mods/gameserver/model/location/Location;I)Z
       140: ifeq          272
       143: aload_1
       144: invokevirtual #172                // Method ext/mods/gameserver/model/actor/Player.getMove:()Lext/mods/gameserver/model/actor/move/PlayerMove;
       147: invokevirtual #176                // Method ext/mods/gameserver/model/actor/move/PlayerMove.getGeoPathFailCount:()I
       150: bipush        10
       152: if_icmplt     169
       155: aload_0
       156: invokevirtual #181                // Method reset:()V
       159: invokestatic  #184                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmManager.getInstance:()Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager;
       162: aload_1
       163: ldc           #188                // String Character fora da rota
       165: invokevirtual #190                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmManager.stopPlayer:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
       168: return
       169: aload_0
       170: getfield      #119                // Field _isOnARoute:Z
       173: ifeq          188
       176: aload_0
       177: getfield      #123                // Field _reachedFirstNode:Z
       180: ifne          188
       183: aload_0
       184: iconst_1
       185: putfield      #123                // Field _reachedFirstNode:Z
       188: aload_0
       189: getfield      #194                // Field _reversePath:Z
       192: ifeq          227
       195: aload_0
       196: getfield      #159                // Field _index:I
       199: ifle          227
       202: aload_0
       203: dup
       204: getfield      #159                // Field _index:I
       207: iconst_1
       208: isub
       209: putfield      #159                // Field _index:I
       212: aload_0
       213: getfield      #159                // Field _index:I
       216: ifne          272
       219: aload_0
       220: iconst_0
       221: putfield      #194                // Field _reversePath:Z
       224: goto          272
       227: aload_0
       228: getfield      #159                // Field _index:I
       231: aload_2
       232: invokeinterface #166,  1          // InterfaceMethod java/util/List.size:()I
       237: iconst_1
       238: isub
       239: if_icmpge     255
       242: aload_0
       243: dup
       244: getfield      #159                // Field _index:I
       247: iconst_1
       248: iadd
       249: putfield      #159                // Field _index:I
       252: goto          272
       255: aload_0
       256: aload_2
       257: invokeinterface #166,  1          // InterfaceMethod java/util/List.size:()I
       262: iconst_2
       263: isub
       264: putfield      #159                // Field _index:I
       267: aload_0
       268: iconst_1
       269: putfield      #194                // Field _reversePath:Z
       272: aload_2
       273: aload_0
       274: getfield      #159                // Field _index:I
       277: invokeinterface #169,  2          // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
       282: checkcast     #153                // class ext/mods/gameserver/model/location/Location
       285: astore_3
       286: invokestatic  #197                // Method ext/mods/gameserver/geoengine/GeoEngine.getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
       289: aload_1
       290: invokevirtual #202                // Method ext/mods/gameserver/model/actor/Player.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
       293: aload_3
       294: invokevirtual #206                // Method ext/mods/gameserver/geoengine/GeoEngine.canMoveToTarget:(Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;)Z
       297: ifne          402
       300: invokestatic  #197                // Method ext/mods/gameserver/geoengine/GeoEngine.getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
       303: aload_1
       304: invokevirtual #210                // Method ext/mods/gameserver/model/actor/Player.getX:()I
       307: aload_1
       308: invokevirtual #213                // Method ext/mods/gameserver/model/actor/Player.getY:()I
       311: aload_1
       312: invokevirtual #216                // Method ext/mods/gameserver/model/actor/Player.getZ:()I
       315: aload_3
       316: invokevirtual #219                // Method ext/mods/gameserver/model/location/Location.getX:()I
       319: aload_3
       320: invokevirtual #220                // Method ext/mods/gameserver/model/location/Location.getY:()I
       323: aload_3
       324: invokevirtual #221                // Method ext/mods/gameserver/model/location/Location.getZ:()I
       327: iconst_1
       328: aconst_null
       329: invokevirtual #222                // Method ext/mods/gameserver/geoengine/GeoEngine.findPath:(IIIIIIZLext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Ljava/util/List;
       332: astore        4
       334: aload         4
       336: invokeinterface #131,  1          // InterfaceMethod java/util/List.isEmpty:()Z
       341: ifeq          402
       344: aload_1
       345: invokevirtual #172                // Method ext/mods/gameserver/model/actor/Player.getMove:()Lext/mods/gameserver/model/actor/move/PlayerMove;
       348: invokevirtual #226                // Method ext/mods/gameserver/model/actor/move/PlayerMove.addGeoPathFailCount:()V
       351: aload_0
       352: getfield      #159                // Field _index:I
       355: ifne          378
       358: aload_0
       359: aload_2
       360: invokeinterface #166,  1          // InterfaceMethod java/util/List.size:()I
       365: iconst_2
       366: isub
       367: putfield      #159                // Field _index:I
       370: aload_0
       371: iconst_1
       372: putfield      #194                // Field _reversePath:Z
       375: goto          388
       378: aload_0
       379: dup
       380: getfield      #159                // Field _index:I
       383: iconst_1
       384: isub
       385: putfield      #159                // Field _index:I
       388: aload_2
       389: aload_0
       390: getfield      #159                // Field _index:I
       393: invokeinterface #169,  2          // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
       398: checkcast     #153                // class ext/mods/gameserver/model/location/Location
       401: astore_3
       402: aload_1
       403: invokevirtual #172                // Method ext/mods/gameserver/model/actor/Player.getMove:()Lext/mods/gameserver/model/actor/move/PlayerMove;
       406: aload_3
       407: iconst_0
       408: getstatic     #229                // Field ext/mods/Config.SISTEMA_PATHFINDING:Z
       411: iconst_0
       412: invokevirtual #234                // Method ext/mods/gameserver/model/actor/move/PlayerMove.maybePlayerMoveToLocation:(Lext/mods/gameserver/model/location/Location;IZZ)Z
       415: pop
       416: aload_0
       417: iconst_1
       418: putfield      #119                // Field _isOnARoute:Z
       421: return
      LineNumberTable:
        line 229: 0
        line 230: 5
        line 232: 10
        line 233: 19
        line 235: 20
        line 237: 27
        line 238: 54
        line 240: 65
        line 242: 75
        line 243: 90
        line 244: 103
        line 245: 113
        line 247: 118
        line 248: 121
        line 250: 143
        line 252: 155
        line 253: 159
        line 254: 168
        line 257: 169
        line 258: 183
        line 260: 188
        line 262: 202
        line 264: 212
        line 265: 219
        line 267: 227
        line 268: 242
        line 271: 255
        line 272: 267
        line 276: 272
        line 278: 286
        line 280: 300
        line 281: 334
        line 283: 344
        line 285: 351
        line 287: 358
        line 288: 370
        line 291: 378
        line 293: 388
        line 297: 402
        line 298: 416
        line 299: 421
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           54      64     3 nearestNode   Lext/mods/gameserver/model/location/Location;
          334      68     4  path   Ljava/util/List;
            0     422     0  this   Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmRoute;
            5     417     1 player   Lext/mods/gameserver/model/actor/Player;
           10     412     2 nodes   Ljava/util/List;
          286     136     3  node   Lext/mods/gameserver/model/location/Location;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
          334      68     4  path   Ljava/util/List<Lext/mods/gameserver/model/location/Location;>;
           10     412     2 nodes   Ljava/util/List<Lext/mods/gameserver/model/location/Location;>;
      StackMapTable: number_of_entries = 12
        frame_type = 253 /* append */
          offset_delta = 20
          locals = [ class ext/mods/gameserver/model/actor/Player, class java/util/List ]
        frame_type = 252 /* append */
          offset_delta = 82
          locals = [ class ext/mods/gameserver/model/location/Location ]
        frame_type = 250 /* chop */
          offset_delta = 14
        frame_type = 2 /* same */
        frame_type = 47 /* same */
        frame_type = 18 /* same */
        frame_type = 38 /* same */
        frame_type = 27 /* same */
        frame_type = 16 /* same */
        frame_type = 253 /* append */
          offset_delta = 105
          locals = [ class ext/mods/gameserver/model/location/Location, class java/util/List ]
        frame_type = 9 /* same */
        frame_type = 250 /* chop */
          offset_delta = 13
    Deprecated: true
    RuntimeVisibleAnnotations:
      0: #331()
        java.lang.Deprecated
}
SourceFile: "AutoFarmRoute.java"
BootstrapMethods:
  0: #390 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #357 (Ljava/lang/Object;)Ljava/lang/Object;
      #358 REF_invokeVirtual ext/mods/gameserver/model/WorldObject.getName:()Ljava/lang/String;
      #363 (Lext/mods/gameserver/model/actor/instance/Monster;)Ljava/lang/String;
  1: #390 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #365 (Ljava/lang/Object;)D
      #367 REF_invokeStatic ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmRoute.lambda$tryMoveToNextNode$0:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/location/Location;)D
      #370 (Lext/mods/gameserver/model/location/Location;)D
  2: #390 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #365 (Ljava/lang/Object;)D
      #371 REF_invokeStatic ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmRoute.lambda$moveToNextPoint$0:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/location/Location;)D
      #370 (Lext/mods/gameserver/model/location/Location;)D
  3: #390 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #374 (Ljava/lang/Object;)V
      #376 REF_invokeVirtual ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmRoute.lambda$getKnownTypeInRadius$0:(Ljava/lang/Class;ILjava/util/List;Lext/mods/gameserver/model/WorldRegion;)V
      #379 (Lext/mods/gameserver/model/WorldRegion;)V
  4: #390 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #381 (Ljava/lang/Object;)Z
      #382 REF_invokeStatic ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmRoute.lambda$getKnownTypeInRadius$1:(ILext/mods/gameserver/model/WorldObject;)Z
      #385 (Lext/mods/gameserver/model/WorldObject;)Z
  5: #390 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #374 (Ljava/lang/Object;)V
      #387 REF_invokeInterface java/util/List.add:(Ljava/lang/Object;)Z
      #388 (Lext/mods/gameserver/model/WorldObject;)V
InnerClasses:
  public static final #398= #2 of #93;    // AutoFarmType=class ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType of class ext/mods/gameserver/model/entity/autofarm/AutoFarmManager
  public static final #403= #399 of #401; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
