// Bytecode for: ext.mods.gameserver.model.entity.autofarm.zone.AutoFarmZone
// File: ext\mods\gameserver\model\entity\autofarm\zone\AutoFarmZone.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmZone.class
  Last modified 9 de jul de 2026; size 8668 bytes
  MD5 checksum 09748032c6fd44cf51056e2a676a5e7f
  Compiled from "AutoFarmZone.java"
public class ext.mods.gameserver.model.entity.autofarm.zone.AutoFarmZone extends ext.mods.gameserver.model.entity.autofarm.zone.AutoFarmArea
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #27                         // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmZone
  super_class: #8                         // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea
  interfaces: 0, fields: 1, methods: 16, attributes: 3
Constant pool:
    #1 = Fieldref           #2.#3         // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType.ZONA:Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;
    #2 = Class              #4            // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType
    #3 = NameAndType        #5:#6         // ZONA:Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;
    #4 = Utf8               ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType
    #5 = Utf8               ZONA
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
   #16 = Methodref          #17.#18       // ext/mods/gameserver/model/actor/Creature.getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
   #17 = Class              #19           // ext/mods/gameserver/model/actor/Creature
   #18 = NameAndType        #20:#21       // getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
   #19 = Utf8               ext/mods/gameserver/model/actor/Creature
   #20 = Utf8               getActingPlayer
   #21 = Utf8               ()Lext/mods/gameserver/model/actor/Player;
   #22 = Methodref          #17.#23       // ext/mods/gameserver/model/actor/Creature.getObjectId:()I
   #23 = NameAndType        #24:#25       // getObjectId:()I
   #24 = Utf8               getObjectId
   #25 = Utf8               ()I
   #26 = Methodref          #27.#28       // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmZone.getOwnerId:()I
   #27 = Class              #29           // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmZone
   #28 = NameAndType        #30:#25       // getOwnerId:()I
   #29 = Utf8               ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmZone
   #30 = Utf8               getOwnerId
   #31 = Methodref          #27.#32       // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmZone.getProfile:()Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
   #32 = NameAndType        #33:#34       // getProfile:()Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
   #33 = Utf8               getProfile
   #34 = Utf8               ()Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
   #35 = Methodref          #36.#37       // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.isEnabled:()Z
   #36 = Class              #38           // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile
   #37 = NameAndType        #39:#40       // isEnabled:()Z
   #38 = Utf8               ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile
   #39 = Utf8               isEnabled
   #40 = Utf8               ()Z
   #41 = String             #42           // You have entered an AutoFarm zone.
   #42 = Utf8               You have entered an AutoFarm zone.
   #43 = Methodref          #17.#44       // ext/mods/gameserver/model/actor/Creature.sendMessage:(Ljava/lang/String;)V
   #44 = NameAndType        #45:#46       // sendMessage:(Ljava/lang/String;)V
   #45 = Utf8               sendMessage
   #46 = Utf8               (Ljava/lang/String;)V
   #47 = Methodref          #27.#48       // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmZone.getMonsterHistory:()Ljava/util/Set;
   #48 = NameAndType        #49:#50       // getMonsterHistory:()Ljava/util/Set;
   #49 = Utf8               getMonsterHistory
   #50 = Utf8               ()Ljava/util/Set;
   #51 = Methodref          #17.#52       // ext/mods/gameserver/model/actor/Creature.getName:()Ljava/lang/String;
   #52 = NameAndType        #53:#54       // getName:()Ljava/lang/String;
   #53 = Utf8               getName
   #54 = Utf8               ()Ljava/lang/String;
   #55 = InterfaceMethodref #56.#57       // java/util/Set.add:(Ljava/lang/Object;)Z
   #56 = Class              #58           // java/util/Set
   #57 = NameAndType        #59:#60       // add:(Ljava/lang/Object;)Z
   #58 = Utf8               java/util/Set
   #59 = Utf8               add
   #60 = Utf8               (Ljava/lang/Object;)Z
   #61 = Fieldref           #62.#63       // ext/mods/gameserver/enums/ZoneId.AUTO_FARM:Lext/mods/gameserver/enums/ZoneId;
   #62 = Class              #64           // ext/mods/gameserver/enums/ZoneId
   #63 = NameAndType        #65:#66       // AUTO_FARM:Lext/mods/gameserver/enums/ZoneId;
   #64 = Utf8               ext/mods/gameserver/enums/ZoneId
   #65 = Utf8               AUTO_FARM
   #66 = Utf8               Lext/mods/gameserver/enums/ZoneId;
   #67 = Methodref          #17.#68       // ext/mods/gameserver/model/actor/Creature.setInsideZone:(Lext/mods/gameserver/enums/ZoneId;Z)V
   #68 = NameAndType        #69:#70       // setInsideZone:(Lext/mods/gameserver/enums/ZoneId;Z)V
   #69 = Utf8               setInsideZone
   #70 = Utf8               (Lext/mods/gameserver/enums/ZoneId;Z)V
   #71 = String             #72           // You have exited the AutoFarm zone.
   #72 = Utf8               You have exited the AutoFarm zone.
   #73 = Fieldref           #27.#74       // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmZone._isBuilt:Z
   #74 = NameAndType        #75:#76       // _isBuilt:Z
   #75 = Utf8               _isBuilt
   #76 = Utf8               Z
   #77 = Class              #78           // ext/mods/gameserver/model/actor/instance/Monster
   #78 = Utf8               ext/mods/gameserver/model/actor/instance/Monster
   #79 = Methodref          #27.#80       // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmZone.getKnownTypeInside:(Ljava/lang/Class;)Ljava/util/List;
   #80 = NameAndType        #81:#82       // getKnownTypeInside:(Ljava/lang/Class;)Ljava/util/List;
   #81 = Utf8               getKnownTypeInside
   #82 = Utf8               (Ljava/lang/Class;)Ljava/util/List;
   #83 = Methodref          #27.#84       // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmZone.getZoneZ:()Lext/mods/gameserver/model/entity/autofarm/zone/form/ZoneNPolyZ;
   #84 = NameAndType        #85:#86       // getZoneZ:()Lext/mods/gameserver/model/entity/autofarm/zone/form/ZoneNPolyZ;
   #85 = Utf8               getZoneZ
   #86 = Utf8               ()Lext/mods/gameserver/model/entity/autofarm/zone/form/ZoneNPolyZ;
   #87 = Methodref          #88.#89       // ext/mods/gameserver/model/entity/autofarm/zone/form/ZoneNPolyZ.findPointInCenter:()Lext/mods/gameserver/model/location/Location;
   #88 = Class              #90           // ext/mods/gameserver/model/entity/autofarm/zone/form/ZoneNPolyZ
   #89 = NameAndType        #91:#92       // findPointInCenter:()Lext/mods/gameserver/model/location/Location;
   #90 = Utf8               ext/mods/gameserver/model/entity/autofarm/zone/form/ZoneNPolyZ
   #91 = Utf8               findPointInCenter
   #92 = Utf8               ()Lext/mods/gameserver/model/location/Location;
   #93 = Methodref          #27.#94       // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmZone.getOwner:()Lext/mods/gameserver/model/actor/Player;
   #94 = NameAndType        #95:#21       // getOwner:()Lext/mods/gameserver/model/actor/Player;
   #95 = Utf8               getOwner
   #96 = Methodref          #97.#98       // ext/mods/gameserver/model/actor/Player.getMove:()Lext/mods/gameserver/model/actor/move/PlayerMove;
   #97 = Class              #99           // ext/mods/gameserver/model/actor/Player
   #98 = NameAndType        #100:#101     // getMove:()Lext/mods/gameserver/model/actor/move/PlayerMove;
   #99 = Utf8               ext/mods/gameserver/model/actor/Player
  #100 = Utf8               getMove
  #101 = Utf8               ()Lext/mods/gameserver/model/actor/move/PlayerMove;
  #102 = Methodref          #103.#104     // ext/mods/gameserver/model/actor/move/PlayerMove.maybeMoveToLocation:(Lext/mods/gameserver/model/location/Location;IZZ)Z
  #103 = Class              #105          // ext/mods/gameserver/model/actor/move/PlayerMove
  #104 = NameAndType        #106:#107     // maybeMoveToLocation:(Lext/mods/gameserver/model/location/Location;IZZ)Z
  #105 = Utf8               ext/mods/gameserver/model/actor/move/PlayerMove
  #106 = Utf8               maybeMoveToLocation
  #107 = Utf8               (Lext/mods/gameserver/model/location/Location;IZZ)Z
  #108 = Methodref          #109.#110     // java/lang/Math.random:()D
  #109 = Class              #111          // java/lang/Math
  #110 = NameAndType        #112:#113     // random:()D
  #111 = Utf8               java/lang/Math
  #112 = Utf8               random
  #113 = Utf8               ()D
  #114 = Double             2.0d
  #116 = Double             3.141592653589793d
  #118 = Methodref          #119.#120     // ext/mods/gameserver/model/location/Location.getX:()I
  #119 = Class              #121          // ext/mods/gameserver/model/location/Location
  #120 = NameAndType        #122:#25      // getX:()I
  #121 = Utf8               ext/mods/gameserver/model/location/Location
  #122 = Utf8               getX
  #123 = Methodref          #109.#124     // java/lang/Math.cos:(D)D
  #124 = NameAndType        #125:#126     // cos:(D)D
  #125 = Utf8               cos
  #126 = Utf8               (D)D
  #127 = Methodref          #119.#128     // ext/mods/gameserver/model/location/Location.getY:()I
  #128 = NameAndType        #129:#25      // getY:()I
  #129 = Utf8               getY
  #130 = Methodref          #109.#131     // java/lang/Math.sin:(D)D
  #131 = NameAndType        #132:#126     // sin:(D)D
  #132 = Utf8               sin
  #133 = Methodref          #119.#134     // ext/mods/gameserver/model/location/Location.getZ:()I
  #134 = NameAndType        #135:#25      // getZ:()I
  #135 = Utf8               getZ
  #136 = Methodref          #119.#137     // ext/mods/gameserver/model/location/Location."<init>":(III)V
  #137 = NameAndType        #11:#138      // "<init>":(III)V
  #138 = Utf8               (III)V
  #139 = Methodref          #27.#140      // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmZone.getWayIn:()Lext/mods/gameserver/model/location/Location;
  #140 = NameAndType        #141:#92      // getWayIn:()Lext/mods/gameserver/model/location/Location;
  #141 = Utf8               getWayIn
  #142 = Fieldref           #143.#144     // ext/mods/Config.SISTEMA_PATHFINDING:Z
  #143 = Class              #145          // ext/mods/Config
  #144 = NameAndType        #146:#76      // SISTEMA_PATHFINDING:Z
  #145 = Utf8               ext/mods/Config
  #146 = Utf8               SISTEMA_PATHFINDING
  #147 = Methodref          #103.#148     // ext/mods/gameserver/model/actor/move/PlayerMove.maybePlayerMoveToLocation:(Lext/mods/gameserver/model/location/Location;IZZ)Z
  #148 = NameAndType        #149:#107     // maybePlayerMoveToLocation:(Lext/mods/gameserver/model/location/Location;IZZ)Z
  #149 = Utf8               maybePlayerMoveToLocation
  #150 = Methodref          #151.#152     // ext/mods/gameserver/geoengine/GeoEngine.getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
  #151 = Class              #153          // ext/mods/gameserver/geoengine/GeoEngine
  #152 = NameAndType        #154:#155     // getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
  #153 = Utf8               ext/mods/gameserver/geoengine/GeoEngine
  #154 = Utf8               getInstance
  #155 = Utf8               ()Lext/mods/gameserver/geoengine/GeoEngine;
  #156 = Methodref          #151.#157     // ext/mods/gameserver/geoengine/GeoEngine.canMoveToTarget:(Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/location/Location;)Z
  #157 = NameAndType        #158:#159     // canMoveToTarget:(Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/location/Location;)Z
  #158 = Utf8               canMoveToTarget
  #159 = Utf8               (Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/location/Location;)Z
  #160 = Methodref          #27.#161      // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmZone.getMonsters:()Ljava/util/List;
  #161 = NameAndType        #162:#163     // getMonsters:()Ljava/util/List;
  #162 = Utf8               getMonsters
  #163 = Utf8               ()Ljava/util/List;
  #164 = InterfaceMethodref #165.#166     // java/util/List.stream:()Ljava/util/stream/Stream;
  #165 = Class              #167          // java/util/List
  #166 = NameAndType        #168:#169     // stream:()Ljava/util/stream/Stream;
  #167 = Utf8               java/util/List
  #168 = Utf8               stream
  #169 = Utf8               ()Ljava/util/stream/Stream;
  #170 = InvokeDynamic      #0:#171       // #0:test:(Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/Predicate;
  #171 = NameAndType        #172:#173     // test:(Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/Predicate;
  #172 = Utf8               test
  #173 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/Predicate;
  #174 = InterfaceMethodref #175.#176     // java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
  #175 = Class              #177          // java/util/stream/Stream
  #176 = NameAndType        #178:#179     // filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
  #177 = Utf8               java/util/stream/Stream
  #178 = Utf8               filter
  #179 = Utf8               (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
  #180 = InterfaceMethodref #175.#181     // java/util/stream/Stream.toList:()Ljava/util/List;
  #181 = NameAndType        #182:#163     // toList:()Ljava/util/List;
  #182 = Utf8               toList
  #183 = InterfaceMethodref #165.#184     // java/util/List.isEmpty:()Z
  #184 = NameAndType        #185:#40      // isEmpty:()Z
  #185 = Utf8               isEmpty
  #186 = Methodref          #187.#188     // ext/mods/commons/random/Rnd.get:(Ljava/util/List;)Ljava/lang/Object;
  #187 = Class              #189          // ext/mods/commons/random/Rnd
  #188 = NameAndType        #190:#191     // get:(Ljava/util/List;)Ljava/lang/Object;
  #189 = Utf8               ext/mods/commons/random/Rnd
  #190 = Utf8               get
  #191 = Utf8               (Ljava/util/List;)Ljava/lang/Object;
  #192 = Methodref          #77.#193      // ext/mods/gameserver/model/actor/instance/Monster.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
  #193 = NameAndType        #194:#195     // getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
  #194 = Utf8               getPosition
  #195 = Utf8               ()Lext/mods/gameserver/model/location/SpawnLocation;
  #196 = Methodref          #197.#198     // ext/mods/gameserver/model/location/SpawnLocation.clone:()Lext/mods/gameserver/model/location/SpawnLocation;
  #197 = Class              #199          // ext/mods/gameserver/model/location/SpawnLocation
  #198 = NameAndType        #200:#195     // clone:()Lext/mods/gameserver/model/location/SpawnLocation;
  #199 = Utf8               ext/mods/gameserver/model/location/SpawnLocation
  #200 = Utf8               clone
  #201 = Methodref          #88.#202      // ext/mods/gameserver/model/entity/autofarm/zone/form/ZoneNPolyZ.getRandomPoint:()Lext/mods/gameserver/model/location/Location;
  #202 = NameAndType        #203:#92      // getRandomPoint:()Lext/mods/gameserver/model/location/Location;
  #203 = Utf8               getRandomPoint
  #204 = Methodref          #27.#205      // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmZone.updateWorldRegions:()V
  #205 = NameAndType        #206:#207     // updateWorldRegions:()V
  #206 = Utf8               updateWorldRegions
  #207 = Utf8               ()V
  #208 = Methodref          #27.#209      // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmZone.getCreatures:()Ljava/util/Set;
  #209 = NameAndType        #210:#50      // getCreatures:()Ljava/util/Set;
  #210 = Utf8               getCreatures
  #211 = InvokeDynamic      #1:#212       // #1:accept:(Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmZone;)Ljava/util/function/Consumer;
  #212 = NameAndType        #213:#214     // accept:(Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmZone;)Ljava/util/function/Consumer;
  #213 = Utf8               accept
  #214 = Utf8               (Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmZone;)Ljava/util/function/Consumer;
  #215 = InterfaceMethodref #56.#216      // java/util/Set.forEach:(Ljava/util/function/Consumer;)V
  #216 = NameAndType        #217:#218     // forEach:(Ljava/util/function/Consumer;)V
  #217 = Utf8               forEach
  #218 = Utf8               (Ljava/util/function/Consumer;)V
  #219 = Methodref          #220.#221     // ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
  #220 = Class              #222          // ext/mods/gameserver/model/World
  #221 = NameAndType        #154:#223     // getInstance:()Lext/mods/gameserver/model/World;
  #222 = Utf8               ext/mods/gameserver/model/World
  #223 = Utf8               ()Lext/mods/gameserver/model/World;
  #224 = Methodref          #220.#225     // ext/mods/gameserver/model/World.getWorldRegions:()[[Lext/mods/gameserver/model/WorldRegion;
  #225 = NameAndType        #226:#227     // getWorldRegions:()[[Lext/mods/gameserver/model/WorldRegion;
  #226 = Utf8               getWorldRegions
  #227 = Utf8               ()[[Lext/mods/gameserver/model/WorldRegion;
  #228 = Methodref          #220.#229     // ext/mods/gameserver/model/World.getRegionX:(I)I
  #229 = NameAndType        #230:#231     // getRegionX:(I)I
  #230 = Utf8               getRegionX
  #231 = Utf8               (I)I
  #232 = Methodref          #27.#233      // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmZone.getZone:()Lext/mods/gameserver/model/zone/ZoneForm;
  #233 = NameAndType        #234:#235     // getZone:()Lext/mods/gameserver/model/zone/ZoneForm;
  #234 = Utf8               getZone
  #235 = Utf8               ()Lext/mods/gameserver/model/zone/ZoneForm;
  #236 = Methodref          #220.#237     // ext/mods/gameserver/model/World.getRegionY:(I)I
  #237 = NameAndType        #238:#231     // getRegionY:(I)I
  #238 = Utf8               getRegionY
  #239 = Methodref          #240.#241     // ext/mods/gameserver/model/zone/ZoneForm.intersectsRectangle:(IIII)Z
  #240 = Class              #242          // ext/mods/gameserver/model/zone/ZoneForm
  #241 = NameAndType        #243:#244     // intersectsRectangle:(IIII)Z
  #242 = Utf8               ext/mods/gameserver/model/zone/ZoneForm
  #243 = Utf8               intersectsRectangle
  #244 = Utf8               (IIII)Z
  #245 = Methodref          #246.#247     // ext/mods/gameserver/model/WorldRegion.removeZone:(Lext/mods/gameserver/model/zone/type/subtype/ZoneType;)V
  #246 = Class              #248          // ext/mods/gameserver/model/WorldRegion
  #247 = NameAndType        #249:#250     // removeZone:(Lext/mods/gameserver/model/zone/type/subtype/ZoneType;)V
  #248 = Utf8               ext/mods/gameserver/model/WorldRegion
  #249 = Utf8               removeZone
  #250 = Utf8               (Lext/mods/gameserver/model/zone/type/subtype/ZoneType;)V
  #251 = Methodref          #246.#252     // ext/mods/gameserver/model/WorldRegion.getObjects:()Ljava/util/Collection;
  #252 = NameAndType        #253:#254     // getObjects:()Ljava/util/Collection;
  #253 = Utf8               getObjects
  #254 = Utf8               ()Ljava/util/Collection;
  #255 = InterfaceMethodref #256.#257     // java/util/Collection.iterator:()Ljava/util/Iterator;
  #256 = Class              #258          // java/util/Collection
  #257 = NameAndType        #259:#260     // iterator:()Ljava/util/Iterator;
  #258 = Utf8               java/util/Collection
  #259 = Utf8               iterator
  #260 = Utf8               ()Ljava/util/Iterator;
  #261 = InterfaceMethodref #262.#263     // java/util/Iterator.hasNext:()Z
  #262 = Class              #264          // java/util/Iterator
  #263 = NameAndType        #265:#40      // hasNext:()Z
  #264 = Utf8               java/util/Iterator
  #265 = Utf8               hasNext
  #266 = InterfaceMethodref #262.#267     // java/util/Iterator.next:()Ljava/lang/Object;
  #267 = NameAndType        #268:#269     // next:()Ljava/lang/Object;
  #268 = Utf8               next
  #269 = Utf8               ()Ljava/lang/Object;
  #270 = Class              #271          // ext/mods/gameserver/model/WorldObject
  #271 = Utf8               ext/mods/gameserver/model/WorldObject
  #272 = Methodref          #27.#273      // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmZone.revalidateInZone:(Lext/mods/gameserver/model/actor/Creature;)V
  #273 = NameAndType        #274:#275     // revalidateInZone:(Lext/mods/gameserver/model/actor/Creature;)V
  #274 = Utf8               revalidateInZone
  #275 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)V
  #276 = Methodref          #246.#277     // ext/mods/gameserver/model/WorldRegion.addZone:(Lext/mods/gameserver/model/zone/type/subtype/ZoneType;)V
  #277 = NameAndType        #278:#250     // addZone:(Lext/mods/gameserver/model/zone/type/subtype/ZoneType;)V
  #278 = Utf8               addZone
  #279 = Methodref          #27.#280      // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmZone.removeCreature:(Lext/mods/gameserver/model/actor/Creature;)V
  #280 = NameAndType        #281:#275     // removeCreature:(Lext/mods/gameserver/model/actor/Creature;)V
  #281 = Utf8               removeCreature
  #282 = Methodref          #151.#283     // ext/mods/gameserver/geoengine/GeoEngine.canMoveToTarget:(Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/WorldObject;)Z
  #283 = NameAndType        #158:#284     // canMoveToTarget:(Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/WorldObject;)Z
  #284 = Utf8               (Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/WorldObject;)Z
  #285 = Utf8               (ILjava/lang/String;I)V
  #286 = Utf8               Code
  #287 = Utf8               LineNumberTable
  #288 = Utf8               LocalVariableTable
  #289 = Utf8               this
  #290 = Utf8               Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmZone;
  #291 = Utf8               zoneId
  #292 = Utf8               I
  #293 = Utf8               name
  #294 = Utf8               Ljava/lang/String;
  #295 = Utf8               ownerId
  #296 = Utf8               (Ljava/lang/String;I)V
  #297 = Utf8               onEnter
  #298 = Utf8               character
  #299 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #300 = Utf8               StackMapTable
  #301 = Utf8               onExit
  #302 = Utf8               visualizeZone
  #303 = Utf8               (Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;)V
  #304 = Utf8               debug
  #305 = Utf8               Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;
  #306 = Utf8               getFarmZone
  #307 = Utf8               ()Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmZone;
  #308 = Utf8               isBuilt
  #309 = Utf8               Signature
  #310 = Utf8               ()Ljava/util/List<Lext/mods/gameserver/model/actor/instance/Monster;>;
  #311 = Utf8               findValidLocation
  #312 = Utf8               angle
  #313 = Utf8               D
  #314 = Utf8               newX
  #315 = Utf8               newY
  #316 = Utf8               newZ
  #317 = Utf8               center
  #318 = Utf8               Lext/mods/gameserver/model/location/Location;
  #319 = Utf8               attempt
  #320 = Utf8               radius
  #321 = Utf8               tryGoBackInside
  #322 = Utf8               way
  #323 = Utf8               loc
  #324 = Utf8               i
  #325 = Utf8               owner
  #326 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #327 = Utf8               monsters
  #328 = Utf8               Ljava/util/List;
  #329 = Utf8               LocalVariableTypeTable
  #330 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/actor/instance/Monster;>;
  #331 = Utf8               addToWorld
  #332 = Utf8               removeFromWorld
  #333 = Utf8               object
  #334 = Utf8               Lext/mods/gameserver/model/WorldObject;
  #335 = Utf8               y
  #336 = Utf8               xLoc
  #337 = Utf8               xLoc2
  #338 = Utf8               x
  #339 = Utf8               regions
  #340 = Utf8               [[Lext/mods/gameserver/model/WorldRegion;
  #341 = Class              #340          // "[[Lext/mods/gameserver/model/WorldRegion;"
  #342 = Utf8               lambda$removeFromWorld$0
  #343 = Utf8               c
  #344 = Utf8               lambda$getWayIn$0
  #345 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/instance/Monster;)Z
  #346 = Utf8               m
  #347 = Utf8               Lext/mods/gameserver/model/actor/instance/Monster;
  #348 = Utf8               SourceFile
  #349 = Utf8               AutoFarmZone.java
  #350 = Utf8               BootstrapMethods
  #351 = MethodType         #60           //  (Ljava/lang/Object;)Z
  #352 = MethodHandle       6:#353        // REF_invokeStatic ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmZone.lambda$getWayIn$0:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/instance/Monster;)Z
  #353 = Methodref          #27.#354      // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmZone.lambda$getWayIn$0:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/instance/Monster;)Z
  #354 = NameAndType        #344:#345     // lambda$getWayIn$0:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/instance/Monster;)Z
  #355 = MethodType         #356          //  (Lext/mods/gameserver/model/actor/instance/Monster;)Z
  #356 = Utf8               (Lext/mods/gameserver/model/actor/instance/Monster;)Z
  #357 = MethodType         #358          //  (Ljava/lang/Object;)V
  #358 = Utf8               (Ljava/lang/Object;)V
  #359 = MethodHandle       5:#360        // REF_invokeVirtual ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmZone.lambda$removeFromWorld$0:(Lext/mods/gameserver/model/actor/Creature;)V
  #360 = Methodref          #27.#361      // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmZone.lambda$removeFromWorld$0:(Lext/mods/gameserver/model/actor/Creature;)V
  #361 = NameAndType        #342:#275     // lambda$removeFromWorld$0:(Lext/mods/gameserver/model/actor/Creature;)V
  #362 = MethodType         #275          //  (Lext/mods/gameserver/model/actor/Creature;)V
  #363 = MethodHandle       6:#364        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #364 = Methodref          #365.#366     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #365 = Class              #367          // java/lang/invoke/LambdaMetafactory
  #366 = NameAndType        #368:#369     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #367 = Utf8               java/lang/invoke/LambdaMetafactory
  #368 = Utf8               metafactory
  #369 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #370 = Utf8               InnerClasses
  #371 = Class              #372          // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager
  #372 = Utf8               ext/mods/gameserver/model/entity/autofarm/AutoFarmManager
  #373 = Utf8               AutoFarmType
  #374 = Class              #375          // java/lang/invoke/MethodHandles$Lookup
  #375 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #376 = Class              #377          // java/lang/invoke/MethodHandles
  #377 = Utf8               java/lang/invoke/MethodHandles
  #378 = Utf8               Lookup
{
  public ext.mods.gameserver.model.entity.autofarm.zone.AutoFarmZone(int, java.lang.String, int);
    descriptor: (ILjava/lang/String;I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=4, args_size=4
         0: aload_0
         1: iload_1
         2: aload_2
         3: iload_3
         4: getstatic     #1                  // Field ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType.ZONA:Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;
         7: invokespecial #7                  // Method ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea."<init>":(ILjava/lang/String;ILext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;)V
        10: return
      LineNumberTable:
        line 43: 0
        line 44: 10
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      11     0  this   Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmZone;
            0      11     1 zoneId   I
            0      11     2  name   Ljava/lang/String;
            0      11     3 ownerId   I

  public ext.mods.gameserver.model.entity.autofarm.zone.AutoFarmZone(java.lang.String, int);
    descriptor: (Ljava/lang/String;I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: iload_2
         3: getstatic     #1                  // Field ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType.ZONA:Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;
         6: invokespecial #13                 // Method ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea."<init>":(Ljava/lang/String;ILext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;)V
         9: return
      LineNumberTable:
        line 48: 0
        line 49: 9
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmZone;
            0      10     1  name   Ljava/lang/String;
            0      10     2 ownerId   I

  public void onEnter(ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: aload_1
         1: invokevirtual #16                 // Method ext/mods/gameserver/model/actor/Creature.getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
         4: ifnull        38
         7: aload_1
         8: invokevirtual #22                 // Method ext/mods/gameserver/model/actor/Creature.getObjectId:()I
        11: aload_0
        12: invokevirtual #26                 // Method getOwnerId:()I
        15: if_icmpeq     19
        18: return
        19: aload_0
        20: invokevirtual #31                 // Method getProfile:()Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
        23: invokevirtual #35                 // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.isEnabled:()Z
        26: ifne          52
        29: aload_1
        30: ldc           #41                 // String You have entered an AutoFarm zone.
        32: invokevirtual #43                 // Method ext/mods/gameserver/model/actor/Creature.sendMessage:(Ljava/lang/String;)V
        35: goto          52
        38: aload_0
        39: invokevirtual #47                 // Method getMonsterHistory:()Ljava/util/Set;
        42: aload_1
        43: invokevirtual #51                 // Method ext/mods/gameserver/model/actor/Creature.getName:()Ljava/lang/String;
        46: invokeinterface #55,  2           // InterfaceMethod java/util/Set.add:(Ljava/lang/Object;)Z
        51: pop
        52: aload_1
        53: getstatic     #61                 // Field ext/mods/gameserver/enums/ZoneId.AUTO_FARM:Lext/mods/gameserver/enums/ZoneId;
        56: iconst_1
        57: invokevirtual #67                 // Method ext/mods/gameserver/model/actor/Creature.setInsideZone:(Lext/mods/gameserver/enums/ZoneId;Z)V
        60: return
      LineNumberTable:
        line 54: 0
        line 56: 7
        line 57: 18
        line 59: 19
        line 60: 29
        line 63: 38
        line 65: 52
        line 66: 60
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      61     0  this   Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmZone;
            0      61     1 character   Lext/mods/gameserver/model/actor/Creature;
      StackMapTable: number_of_entries = 3
        frame_type = 19 /* same */
        frame_type = 18 /* same */
        frame_type = 13 /* same */

  public void onExit(ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: aload_1
         1: invokevirtual #16                 // Method ext/mods/gameserver/model/actor/Creature.getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
         4: ifnull        23
         7: aload_0
         8: invokevirtual #31                 // Method getProfile:()Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
        11: invokevirtual #35                 // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.isEnabled:()Z
        14: ifne          23
        17: aload_1
        18: ldc           #71                 // String You have exited the AutoFarm zone.
        20: invokevirtual #43                 // Method ext/mods/gameserver/model/actor/Creature.sendMessage:(Ljava/lang/String;)V
        23: aload_1
        24: getstatic     #61                 // Field ext/mods/gameserver/enums/ZoneId.AUTO_FARM:Lext/mods/gameserver/enums/ZoneId;
        27: iconst_0
        28: invokevirtual #67                 // Method ext/mods/gameserver/model/actor/Creature.setInsideZone:(Lext/mods/gameserver/enums/ZoneId;Z)V
        31: return
      LineNumberTable:
        line 71: 0
        line 72: 17
        line 74: 23
        line 75: 31
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      32     0  this   Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmZone;
            0      32     1 character   Lext/mods/gameserver/model/actor/Creature;
      StackMapTable: number_of_entries = 1
        frame_type = 23 /* same */

  public void visualizeZone(ext.mods.gameserver.network.serverpackets.ExServerPrimitive);
    descriptor: (Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=0, locals=2, args_size=2
         0: return
      LineNumberTable:
        line 82: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       1     0  this   Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmZone;
            0       1     1 debug   Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;

  public ext.mods.gameserver.model.entity.autofarm.zone.AutoFarmZone getFarmZone();
    descriptor: ()Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmZone;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: areturn
      LineNumberTable:
        line 88: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmZone;

  public boolean isBuilt();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #73                 // Field _isBuilt:Z
         4: ireturn
      LineNumberTable:
        line 93: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmZone;

  public java.util.List<ext.mods.gameserver.model.actor.instance.Monster> getMonsters();
    descriptor: ()Ljava/util/List;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: ldc           #77                 // class ext/mods/gameserver/model/actor/instance/Monster
         3: invokevirtual #79                 // Method getKnownTypeInside:(Ljava/lang/Class;)Ljava/util/List;
         6: areturn
      LineNumberTable:
        line 99: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmZone;
    Signature: #310                         // ()Ljava/util/List<Lext/mods/gameserver/model/actor/instance/Monster;>;

  public ext.mods.gameserver.model.location.Location findValidLocation();
    descriptor: ()Lext/mods/gameserver/model/location/Location;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=9, args_size=1
         0: aload_0
         1: invokevirtual #83                 // Method getZoneZ:()Lext/mods/gameserver/model/entity/autofarm/zone/form/ZoneNPolyZ;
         4: invokevirtual #87                 // Method ext/mods/gameserver/model/entity/autofarm/zone/form/ZoneNPolyZ.findPointInCenter:()Lext/mods/gameserver/model/location/Location;
         7: astore_1
         8: iconst_0
         9: istore_2
        10: bipush        100
        12: istore_3
        13: iload_2
        14: bipush        10
        16: if_icmpge     114
        19: aload_0
        20: invokevirtual #93                 // Method getOwner:()Lext/mods/gameserver/model/actor/Player;
        23: invokevirtual #96                 // Method ext/mods/gameserver/model/actor/Player.getMove:()Lext/mods/gameserver/model/actor/move/PlayerMove;
        26: aload_1
        27: iconst_0
        28: iconst_1
        29: iconst_1
        30: invokevirtual #102                // Method ext/mods/gameserver/model/actor/move/PlayerMove.maybeMoveToLocation:(Lext/mods/gameserver/model/location/Location;IZZ)Z
        33: ifeq          38
        36: aload_1
        37: areturn
        38: invokestatic  #108                // Method java/lang/Math.random:()D
        41: ldc2_w        #114                // double 2.0d
        44: dmul
        45: ldc2_w        #116                // double 3.141592653589793d
        48: dmul
        49: dstore        4
        51: aload_1
        52: invokevirtual #118                // Method ext/mods/gameserver/model/location/Location.getX:()I
        55: i2d
        56: iload_3
        57: i2d
        58: dload         4
        60: invokestatic  #123                // Method java/lang/Math.cos:(D)D
        63: dmul
        64: dadd
        65: d2i
        66: istore        6
        68: aload_1
        69: invokevirtual #127                // Method ext/mods/gameserver/model/location/Location.getY:()I
        72: i2d
        73: iload_3
        74: i2d
        75: dload         4
        77: invokestatic  #130                // Method java/lang/Math.sin:(D)D
        80: dmul
        81: dadd
        82: d2i
        83: istore        7
        85: aload_1
        86: invokevirtual #133                // Method ext/mods/gameserver/model/location/Location.getZ:()I
        89: istore        8
        91: new           #119                // class ext/mods/gameserver/model/location/Location
        94: dup
        95: iload         6
        97: iload         7
        99: iload         8
       101: invokespecial #136                // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
       104: astore_1
       105: iinc          3, 100
       108: iinc          2, 1
       111: goto          13
       114: aconst_null
       115: areturn
      LineNumberTable:
        line 104: 0
        line 105: 8
        line 106: 10
        line 108: 13
        line 110: 19
        line 112: 36
        line 115: 38
        line 116: 51
        line 117: 68
        line 119: 85
        line 121: 91
        line 122: 105
        line 123: 108
        line 124: 111
        line 126: 114
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           51      60     4 angle   D
           68      43     6  newX   I
           85      26     7  newY   I
           91      20     8  newZ   I
            0     116     0  this   Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmZone;
            8     108     1 center   Lext/mods/gameserver/model/location/Location;
           10     106     2 attempt   I
           13     103     3 radius   I
      StackMapTable: number_of_entries = 3
        frame_type = 254 /* append */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/model/location/Location, int, int ]
        frame_type = 24 /* same */
        frame_type = 251 /* same_frame_extended */
          offset_delta = 75

  public boolean tryGoBackInside();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=2, args_size=1
         0: aload_0
         1: invokevirtual #139                // Method getWayIn:()Lext/mods/gameserver/model/location/Location;
         4: astore_1
         5: aload_1
         6: ifnull        28
         9: aload_0
        10: invokevirtual #93                 // Method getOwner:()Lext/mods/gameserver/model/actor/Player;
        13: invokevirtual #96                 // Method ext/mods/gameserver/model/actor/Player.getMove:()Lext/mods/gameserver/model/actor/move/PlayerMove;
        16: aload_1
        17: iconst_0
        18: getstatic     #142                // Field ext/mods/Config.SISTEMA_PATHFINDING:Z
        21: iconst_0
        22: invokevirtual #147                // Method ext/mods/gameserver/model/actor/move/PlayerMove.maybePlayerMoveToLocation:(Lext/mods/gameserver/model/location/Location;IZZ)Z
        25: pop
        26: iconst_1
        27: ireturn
        28: iconst_0
        29: ireturn
      LineNumberTable:
        line 131: 0
        line 132: 5
        line 134: 9
        line 135: 26
        line 138: 28
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      30     0  this   Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmZone;
            5      25     1   way   Lext/mods/gameserver/model/location/Location;
      StackMapTable: number_of_entries = 1
        frame_type = 252 /* append */
          offset_delta = 28
          locals = [ class ext/mods/gameserver/model/location/Location ]

  public void addToWorld();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #73                 // Field _isBuilt:Z
         4: ifeq          8
         7: return
         8: aload_0
         9: invokevirtual #204                // Method updateWorldRegions:()V
        12: aload_0
        13: iconst_1
        14: putfield      #73                 // Field _isBuilt:Z
        17: return
      LineNumberTable:
        line 165: 0
        line 166: 7
        line 168: 8
        line 169: 12
        line 170: 17
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      18     0  this   Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmZone;
      StackMapTable: number_of_entries = 1
        frame_type = 8 /* same */

  public void removeFromWorld();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #73                 // Field _isBuilt:Z
         4: ifne          8
         7: return
         8: aload_0
         9: invokevirtual #208                // Method getCreatures:()Ljava/util/Set;
        12: aload_0
        13: invokedynamic #211,  0            // InvokeDynamic #1:accept:(Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmZone;)Ljava/util/function/Consumer;
        18: invokeinterface #215,  2          // InterfaceMethod java/util/Set.forEach:(Ljava/util/function/Consumer;)V
        23: aload_0
        24: invokevirtual #204                // Method updateWorldRegions:()V
        27: aload_0
        28: iconst_0
        29: putfield      #73                 // Field _isBuilt:Z
        32: return
      LineNumberTable:
        line 174: 0
        line 175: 7
        line 177: 8
        line 178: 23
        line 179: 27
        line 180: 32
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      33     0  this   Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmZone;
      StackMapTable: number_of_entries = 1
        frame_type = 8 /* same */
}
SourceFile: "AutoFarmZone.java"
BootstrapMethods:
  0: #363 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #351 (Ljava/lang/Object;)Z
      #352 REF_invokeStatic ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmZone.lambda$getWayIn$0:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/instance/Monster;)Z
      #355 (Lext/mods/gameserver/model/actor/instance/Monster;)Z
  1: #363 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #357 (Ljava/lang/Object;)V
      #359 REF_invokeVirtual ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmZone.lambda$removeFromWorld$0:(Lext/mods/gameserver/model/actor/Creature;)V
      #362 (Lext/mods/gameserver/model/actor/Creature;)V
InnerClasses:
  public static final #373= #2 of #371;   // AutoFarmType=class ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType of class ext/mods/gameserver/model/entity/autofarm/AutoFarmManager
  public static final #378= #374 of #376; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
