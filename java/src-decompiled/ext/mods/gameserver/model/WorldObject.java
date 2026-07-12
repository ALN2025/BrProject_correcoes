// Bytecode for: ext.mods.gameserver.model.WorldObject
// File: ext\mods\gameserver\model\WorldObject.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/WorldObject.class
  Last modified 9 de jul de 2026; size 24770 bytes
  MD5 checksum 117f93e0f15dc2870abefea31d7e68ff
  Compiled from "WorldObject.java"
public abstract class ext.mods.gameserver.model.WorldObject
  minor version: 0
  major version: 69
  flags: (0x0421) ACC_PUBLIC, ACC_SUPER, ACC_ABSTRACT
  this_class: #13                         // ext/mods/gameserver/model/WorldObject
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 8, methods: 99, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Class              #8            // ext/mods/gameserver/model/location/SpawnLocation
    #8 = Utf8               ext/mods/gameserver/model/location/SpawnLocation
    #9 = Methodref          #7.#10        // ext/mods/gameserver/model/location/SpawnLocation."<init>":(IIII)V
   #10 = NameAndType        #5:#11        // "<init>":(IIII)V
   #11 = Utf8               (IIII)V
   #12 = Fieldref           #13.#14       // ext/mods/gameserver/model/WorldObject._position:Lext/mods/gameserver/model/location/SpawnLocation;
   #13 = Class              #15           // ext/mods/gameserver/model/WorldObject
   #14 = NameAndType        #16:#17       // _position:Lext/mods/gameserver/model/location/SpawnLocation;
   #15 = Utf8               ext/mods/gameserver/model/WorldObject
   #16 = Utf8               _position
   #17 = Utf8               Lext/mods/gameserver/model/location/SpawnLocation;
   #18 = Methodref          #19.#20       // ext/mods/InstanceMap/InstanceManager.getInstance:()Lext/mods/InstanceMap/InstanceManager;
   #19 = Class              #21           // ext/mods/InstanceMap/InstanceManager
   #20 = NameAndType        #22:#23       // getInstance:()Lext/mods/InstanceMap/InstanceManager;
   #21 = Utf8               ext/mods/InstanceMap/InstanceManager
   #22 = Utf8               getInstance
   #23 = Utf8               ()Lext/mods/InstanceMap/InstanceManager;
   #24 = Methodref          #19.#25       // ext/mods/InstanceMap/InstanceManager.getInstance:(I)Lext/mods/InstanceMap/MapInstance;
   #25 = NameAndType        #22:#26       // getInstance:(I)Lext/mods/InstanceMap/MapInstance;
   #26 = Utf8               (I)Lext/mods/InstanceMap/MapInstance;
   #27 = Fieldref           #13.#28       // ext/mods/gameserver/model/WorldObject._instance:Lext/mods/InstanceMap/MapInstance;
   #28 = NameAndType        #29:#30       // _instance:Lext/mods/InstanceMap/MapInstance;
   #29 = Utf8               _instance
   #30 = Utf8               Lext/mods/InstanceMap/MapInstance;
   #31 = Fieldref           #13.#32       // ext/mods/gameserver/model/WorldObject._objectId:I
   #32 = NameAndType        #33:#34       // _objectId:I
   #33 = Utf8               _objectId
   #34 = Utf8               I
   #35 = Methodref          #36.#37       // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
   #36 = Class              #38           // java/lang/Integer
   #37 = NameAndType        #39:#40       // valueOf:(I)Ljava/lang/Integer;
   #38 = Utf8               java/lang/Integer
   #39 = Utf8               valueOf
   #40 = Utf8               (I)Ljava/lang/Integer;
   #41 = Methodref          #42.#43       // java/util/Objects.hash:([Ljava/lang/Object;)I
   #42 = Class              #44           // java/util/Objects
   #43 = NameAndType        #45:#46       // hash:([Ljava/lang/Object;)I
   #44 = Utf8               java/util/Objects
   #45 = Utf8               hash
   #46 = Utf8               ([Ljava/lang/Object;)I
   #47 = Methodref          #2.#48        // java/lang/Object.getClass:()Ljava/lang/Class;
   #48 = NameAndType        #49:#50       // getClass:()Ljava/lang/Class;
   #49 = Utf8               getClass
   #50 = Utf8               ()Ljava/lang/Class;
   #51 = Methodref          #13.#52       // ext/mods/gameserver/model/WorldObject.getName:()Ljava/lang/String;
   #52 = NameAndType        #53:#54       // getName:()Ljava/lang/String;
   #53 = Utf8               getName
   #54 = Utf8               ()Ljava/lang/String;
   #55 = Methodref          #13.#56       // ext/mods/gameserver/model/WorldObject.getObjectId:()I
   #56 = NameAndType        #57:#58       // getObjectId:()I
   #57 = Utf8               getObjectId
   #58 = Utf8               ()I
   #59 = InvokeDynamic      #0:#60        // #0:makeConcatWithConstants:(Ljava/lang/String;I)Ljava/lang/String;
   #60 = NameAndType        #61:#62       // makeConcatWithConstants:(Ljava/lang/String;I)Ljava/lang/String;
   #61 = Utf8               makeConcatWithConstants
   #62 = Utf8               (Ljava/lang/String;I)Ljava/lang/String;
   #63 = Fieldref           #64.#65       // ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
   #64 = Class              #66           // ext/mods/gameserver/network/serverpackets/ActionFailed
   #65 = NameAndType        #67:#68       // STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
   #66 = Utf8               ext/mods/gameserver/network/serverpackets/ActionFailed
   #67 = Utf8               STATIC_PACKET
   #68 = Utf8               Lext/mods/gameserver/network/serverpackets/ActionFailed;
   #69 = Methodref          #70.#71       // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #70 = Class              #72           // ext/mods/gameserver/model/actor/Player
   #71 = NameAndType        #73:#74       // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #72 = Utf8               ext/mods/gameserver/model/actor/Player
   #73 = Utf8               sendPacket
   #74 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #75 = Methodref          #13.#76       // ext/mods/gameserver/model/WorldObject.setIsVisible:(Z)V
   #76 = NameAndType        #77:#78       // setIsVisible:(Z)V
   #77 = Utf8               setIsVisible
   #78 = Utf8               (Z)V
   #79 = Methodref          #80.#81       // ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
   #80 = Class              #82           // ext/mods/gameserver/model/World
   #81 = NameAndType        #22:#83       // getInstance:()Lext/mods/gameserver/model/World;
   #82 = Utf8               ext/mods/gameserver/model/World
   #83 = Utf8               ()Lext/mods/gameserver/model/World;
   #84 = Methodref          #80.#85       // ext/mods/gameserver/model/World.removeObject:(Lext/mods/gameserver/model/WorldObject;)V
   #85 = NameAndType        #86:#87       // removeObject:(Lext/mods/gameserver/model/WorldObject;)V
   #86 = Utf8               removeObject
   #87 = Utf8               (Lext/mods/gameserver/model/WorldObject;)V
   #88 = Methodref          #89.#90       // ext/mods/gameserver/idfactory/IdFactory.getInstance:()Lext/mods/gameserver/idfactory/IdFactory;
   #89 = Class              #91           // ext/mods/gameserver/idfactory/IdFactory
   #90 = NameAndType        #22:#92       // getInstance:()Lext/mods/gameserver/idfactory/IdFactory;
   #91 = Utf8               ext/mods/gameserver/idfactory/IdFactory
   #92 = Utf8               ()Lext/mods/gameserver/idfactory/IdFactory;
   #93 = Methodref          #89.#94       // ext/mods/gameserver/idfactory/IdFactory.releaseId:(I)V
   #94 = NameAndType        #95:#96       // releaseId:(I)V
   #95 = Utf8               releaseId
   #96 = Utf8               (I)V
   #97 = Methodref          #89.#98       // ext/mods/gameserver/idfactory/IdFactory.getNextId:()I
   #98 = NameAndType        #99:#58       // getNextId:()I
   #99 = Utf8               getNextId
  #100 = Fieldref           #13.#101      // ext/mods/gameserver/model/WorldObject._isVisible:Z
  #101 = NameAndType        #102:#103     // _isVisible:Z
  #102 = Utf8               _isVisible
  #103 = Utf8               Z
  #104 = Methodref          #80.#105      // ext/mods/gameserver/model/World.getRegion:(Lext/mods/gameserver/model/location/Location;)Lext/mods/gameserver/model/WorldRegion;
  #105 = NameAndType        #106:#107     // getRegion:(Lext/mods/gameserver/model/location/Location;)Lext/mods/gameserver/model/WorldRegion;
  #106 = Utf8               getRegion
  #107 = Utf8               (Lext/mods/gameserver/model/location/Location;)Lext/mods/gameserver/model/WorldRegion;
  #108 = Methodref          #13.#109      // ext/mods/gameserver/model/WorldObject.setRegion:(Lext/mods/gameserver/model/WorldRegion;)V
  #109 = NameAndType        #110:#111     // setRegion:(Lext/mods/gameserver/model/WorldRegion;)V
  #110 = Utf8               setRegion
  #111 = Utf8               (Lext/mods/gameserver/model/WorldRegion;)V
  #112 = Methodref          #80.#113      // ext/mods/gameserver/model/World.addObject:(Lext/mods/gameserver/model/WorldObject;)V
  #113 = NameAndType        #114:#87      // addObject:(Lext/mods/gameserver/model/WorldObject;)V
  #114 = Utf8               addObject
  #115 = Methodref          #13.#116      // ext/mods/gameserver/model/WorldObject.onSpawn:()V
  #116 = NameAndType        #117:#6       // onSpawn:()V
  #117 = Utf8               onSpawn
  #118 = Methodref          #119.#120     // ext/mods/gameserver/model/location/Location.getX:()I
  #119 = Class              #121          // ext/mods/gameserver/model/location/Location
  #120 = NameAndType        #122:#58      // getX:()I
  #121 = Utf8               ext/mods/gameserver/model/location/Location
  #122 = Utf8               getX
  #123 = Methodref          #119.#124     // ext/mods/gameserver/model/location/Location.getY:()I
  #124 = NameAndType        #125:#58      // getY:()I
  #125 = Utf8               getY
  #126 = Methodref          #119.#127     // ext/mods/gameserver/model/location/Location.getZ:()I
  #127 = NameAndType        #128:#58      // getZ:()I
  #128 = Utf8               getZ
  #129 = Methodref          #13.#130      // ext/mods/gameserver/model/WorldObject.spawnMe:(III)V
  #130 = NameAndType        #131:#132     // spawnMe:(III)V
  #131 = Utf8               spawnMe
  #132 = Utf8               (III)V
  #133 = Methodref          #13.#134      // ext/mods/gameserver/model/WorldObject.spawnMe:(IIII)V
  #134 = NameAndType        #131:#11      // spawnMe:(IIII)V
  #135 = Methodref          #7.#120       // ext/mods/gameserver/model/location/SpawnLocation.getX:()I
  #136 = Methodref          #7.#124       // ext/mods/gameserver/model/location/SpawnLocation.getY:()I
  #137 = Methodref          #7.#127       // ext/mods/gameserver/model/location/SpawnLocation.getZ:()I
  #138 = Methodref          #7.#139       // ext/mods/gameserver/model/location/SpawnLocation.getHeading:()I
  #139 = NameAndType        #140:#58      // getHeading:()I
  #140 = Utf8               getHeading
  #141 = Methodref          #142.#143     // ext/mods/gameserver/model/boat/BoatItinerary.getInfo:()[Lext/mods/gameserver/model/boat/BoatRouteInfo;
  #142 = Class              #144          // ext/mods/gameserver/model/boat/BoatItinerary
  #143 = NameAndType        #145:#146     // getInfo:()[Lext/mods/gameserver/model/boat/BoatRouteInfo;
  #144 = Utf8               ext/mods/gameserver/model/boat/BoatItinerary
  #145 = Utf8               getInfo
  #146 = Utf8               ()[Lext/mods/gameserver/model/boat/BoatRouteInfo;
  #147 = Methodref          #148.#149     // ext/mods/gameserver/model/boat/BoatRouteInfo.getDock:()Lext/mods/gameserver/enums/boats/BoatDock;
  #148 = Class              #150          // ext/mods/gameserver/model/boat/BoatRouteInfo
  #149 = NameAndType        #151:#152     // getDock:()Lext/mods/gameserver/enums/boats/BoatDock;
  #150 = Utf8               ext/mods/gameserver/model/boat/BoatRouteInfo
  #151 = Utf8               getDock
  #152 = Utf8               ()Lext/mods/gameserver/enums/boats/BoatDock;
  #153 = Methodref          #154.#155     // ext/mods/gameserver/enums/boats/BoatDock.getDockLoc:()Lext/mods/gameserver/model/location/BoatLocation;
  #154 = Class              #156          // ext/mods/gameserver/enums/boats/BoatDock
  #155 = NameAndType        #157:#158     // getDockLoc:()Lext/mods/gameserver/model/location/BoatLocation;
  #156 = Utf8               ext/mods/gameserver/enums/boats/BoatDock
  #157 = Utf8               getDockLoc
  #158 = Utf8               ()Lext/mods/gameserver/model/location/BoatLocation;
  #159 = Methodref          #142.#139     // ext/mods/gameserver/model/boat/BoatItinerary.getHeading:()I
  #160 = Methodref          #13.#161      // ext/mods/gameserver/model/WorldObject.spawnMe:(Lext/mods/gameserver/model/location/Location;I)V
  #161 = NameAndType        #131:#162     // spawnMe:(Lext/mods/gameserver/model/location/Location;I)V
  #162 = Utf8               (Lext/mods/gameserver/model/location/Location;I)V
  #163 = Integer            -131072
  #164 = Integer            229375
  #165 = Methodref          #166.#167     // java/lang/Math.clamp:(JII)I
  #166 = Class              #168          // java/lang/Math
  #167 = NameAndType        #169:#170     // clamp:(JII)I
  #168 = Utf8               java/lang/Math
  #169 = Utf8               clamp
  #170 = Utf8               (JII)I
  #171 = Integer            -262144
  #172 = Integer            262143
  #173 = Methodref          #7.#174       // ext/mods/gameserver/model/location/SpawnLocation.set:(III)V
  #174 = NameAndType        #175:#132     // set:(III)V
  #175 = Utf8               set
  #176 = Methodref          #13.#177      // ext/mods/gameserver/model/WorldObject.spawnMe:()V
  #177 = NameAndType        #131:#6       // spawnMe:()V
  #178 = Methodref          #7.#179       // ext/mods/gameserver/model/location/SpawnLocation.set:(IIII)V
  #179 = NameAndType        #175:#11      // set:(IIII)V
  #180 = Fieldref           #13.#181      // ext/mods/gameserver/model/WorldObject._region:Lext/mods/gameserver/model/WorldRegion;
  #181 = NameAndType        #182:#183     // _region:Lext/mods/gameserver/model/WorldRegion;
  #182 = Utf8               _region
  #183 = Utf8               Lext/mods/gameserver/model/WorldRegion;
  #184 = Fieldref           #13.#185      // ext/mods/gameserver/model/WorldObject._name:Ljava/lang/String;
  #185 = NameAndType        #186:#187     // _name:Ljava/lang/String;
  #186 = Utf8               _name
  #187 = Utf8               Ljava/lang/String;
  #188 = Methodref          #13.#189      // ext/mods/gameserver/model/WorldObject.isVisible:()Z
  #189 = NameAndType        #190:#191     // isVisible:()Z
  #190 = Utf8               isVisible
  #191 = Utf8               ()Z
  #192 = Methodref          #7.#193       // ext/mods/gameserver/model/location/SpawnLocation.set:(Lext/mods/gameserver/model/location/SpawnLocation;)V
  #193 = NameAndType        #175:#194     // set:(Lext/mods/gameserver/model/location/SpawnLocation;)V
  #194 = Utf8               (Lext/mods/gameserver/model/location/SpawnLocation;)V
  #195 = Methodref          #13.#196      // ext/mods/gameserver/model/WorldObject.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
  #196 = NameAndType        #197:#198     // getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
  #197 = Utf8               getPosition
  #198 = Utf8               ()Lext/mods/gameserver/model/location/SpawnLocation;
  #199 = Methodref          #13.#200      // ext/mods/gameserver/model/WorldObject.setXYZ:(Lext/mods/gameserver/model/location/SpawnLocation;)V
  #200 = NameAndType        #201:#194     // setXYZ:(Lext/mods/gameserver/model/location/SpawnLocation;)V
  #201 = Utf8               setXYZ
  #202 = Methodref          #13.#203      // ext/mods/gameserver/model/WorldObject.setXYZInvisible:(III)V
  #203 = NameAndType        #204:#132     // setXYZInvisible:(III)V
  #204 = Utf8               setXYZInvisible
  #205 = Methodref          #206.#207     // java/util/Collections.emptyList:()Ljava/util/List;
  #206 = Class              #208          // java/util/Collections
  #207 = NameAndType        #209:#210     // emptyList:()Ljava/util/List;
  #208 = Utf8               java/util/Collections
  #209 = Utf8               emptyList
  #210 = Utf8               ()Ljava/util/List;
  #211 = Methodref          #212.#213     // ext/mods/gameserver/model/WorldRegion.removeVisibleObject:(Lext/mods/gameserver/model/WorldObject;)V
  #212 = Class              #214          // ext/mods/gameserver/model/WorldRegion
  #213 = NameAndType        #215:#87      // removeVisibleObject:(Lext/mods/gameserver/model/WorldObject;)V
  #214 = Utf8               ext/mods/gameserver/model/WorldRegion
  #215 = Utf8               removeVisibleObject
  #216 = Methodref          #212.#217     // ext/mods/gameserver/model/WorldRegion.getSurroundingRegions:()Ljava/util/List;
  #217 = NameAndType        #218:#210     // getSurroundingRegions:()Ljava/util/List;
  #218 = Utf8               getSurroundingRegions
  #219 = Methodref          #212.#220     // ext/mods/gameserver/model/WorldRegion.addVisibleObject:(Lext/mods/gameserver/model/WorldObject;)V
  #220 = NameAndType        #221:#87      // addVisibleObject:(Lext/mods/gameserver/model/WorldObject;)V
  #221 = Utf8               addVisibleObject
  #222 = InterfaceMethodref #223.#224     // java/util/List.iterator:()Ljava/util/Iterator;
  #223 = Class              #225          // java/util/List
  #224 = NameAndType        #226:#227     // iterator:()Ljava/util/Iterator;
  #225 = Utf8               java/util/List
  #226 = Utf8               iterator
  #227 = Utf8               ()Ljava/util/Iterator;
  #228 = InterfaceMethodref #229.#230     // java/util/Iterator.hasNext:()Z
  #229 = Class              #231          // java/util/Iterator
  #230 = NameAndType        #232:#191     // hasNext:()Z
  #231 = Utf8               java/util/Iterator
  #232 = Utf8               hasNext
  #233 = InterfaceMethodref #229.#234     // java/util/Iterator.next:()Ljava/lang/Object;
  #234 = NameAndType        #235:#236     // next:()Ljava/lang/Object;
  #235 = Utf8               next
  #236 = Utf8               ()Ljava/lang/Object;
  #237 = InterfaceMethodref #223.#238     // java/util/List.contains:(Ljava/lang/Object;)Z
  #238 = NameAndType        #239:#240     // contains:(Ljava/lang/Object;)Z
  #239 = Utf8               contains
  #240 = Utf8               (Ljava/lang/Object;)Z
  #241 = Methodref          #212.#242     // ext/mods/gameserver/model/WorldRegion.getZones:()Ljava/util/List;
  #242 = NameAndType        #243:#210     // getZones:()Ljava/util/List;
  #243 = Utf8               getZones
  #244 = Class              #245          // ext/mods/gameserver/model/zone/type/subtype/ZoneType
  #245 = Utf8               ext/mods/gameserver/model/zone/type/subtype/ZoneType
  #246 = Methodref          #244.#247     // ext/mods/gameserver/model/zone/type/subtype/ZoneType.removeKnownObject:(Lext/mods/gameserver/model/WorldObject;)V
  #247 = NameAndType        #248:#87      // removeKnownObject:(Lext/mods/gameserver/model/WorldObject;)V
  #248 = Utf8               removeKnownObject
  #249 = Methodref          #212.#250     // ext/mods/gameserver/model/WorldRegion.getObjects:()Ljava/util/Collection;
  #250 = NameAndType        #251:#252     // getObjects:()Ljava/util/Collection;
  #251 = Utf8               getObjects
  #252 = Utf8               ()Ljava/util/Collection;
  #253 = InvokeDynamic      #1:#254       // #1:accept:(Lext/mods/gameserver/model/WorldObject;)Ljava/util/function/Consumer;
  #254 = NameAndType        #255:#256     // accept:(Lext/mods/gameserver/model/WorldObject;)Ljava/util/function/Consumer;
  #255 = Utf8               accept
  #256 = Utf8               (Lext/mods/gameserver/model/WorldObject;)Ljava/util/function/Consumer;
  #257 = InterfaceMethodref #258.#259     // java/util/Collection.forEach:(Ljava/util/function/Consumer;)V
  #258 = Class              #260          // java/util/Collection
  #259 = NameAndType        #261:#262     // forEach:(Ljava/util/function/Consumer;)V
  #260 = Utf8               java/util/Collection
  #261 = Utf8               forEach
  #262 = Utf8               (Ljava/util/function/Consumer;)V
  #263 = Methodref          #212.#264     // ext/mods/gameserver/model/WorldRegion.isEmptyNeighborhood:()Z
  #264 = NameAndType        #265:#191     // isEmptyNeighborhood:()Z
  #265 = Utf8               isEmptyNeighborhood
  #266 = Methodref          #212.#267     // ext/mods/gameserver/model/WorldRegion.setActive:(Z)V
  #267 = NameAndType        #268:#78      // setActive:(Z)V
  #268 = Utf8               setActive
  #269 = Methodref          #244.#270     // ext/mods/gameserver/model/zone/type/subtype/ZoneType.addKnownObject:(Lext/mods/gameserver/model/WorldObject;)V
  #270 = NameAndType        #271:#87      // addKnownObject:(Lext/mods/gameserver/model/WorldObject;)V
  #271 = Utf8               addKnownObject
  #272 = InvokeDynamic      #2:#254       // #2:accept:(Lext/mods/gameserver/model/WorldObject;)Ljava/util/function/Consumer;
  #273 = Methodref          #13.#274      // ext/mods/gameserver/model/WorldObject.refreshKnownList:()V
  #274 = NameAndType        #275:#6       // refreshKnownList:()V
  #275 = Utf8               refreshKnownList
  #276 = InterfaceMethodref #258.#224     // java/util/Collection.iterator:()Ljava/util/Iterator;
  #277 = Class              #278          // ext/mods/gameserver/model/actor/instance/Door
  #278 = Utf8               ext/mods/gameserver/model/actor/instance/Door
  #279 = Class              #280          // ext/mods/gameserver/model/actor/instance/Fence
  #280 = Utf8               ext/mods/gameserver/model/actor/instance/Fence
  #281 = Methodref          #13.#282      // ext/mods/gameserver/model/WorldObject.getInstanceMap:()Lext/mods/InstanceMap/MapInstance;
  #282 = NameAndType        #283:#284     // getInstanceMap:()Lext/mods/InstanceMap/MapInstance;
  #283 = Utf8               getInstanceMap
  #284 = Utf8               ()Lext/mods/InstanceMap/MapInstance;
  #285 = Methodref          #286.#287     // ext/mods/InstanceMap/MapInstance.getId:()I
  #286 = Class              #288          // ext/mods/InstanceMap/MapInstance
  #287 = NameAndType        #289:#58      // getId:()I
  #288 = Utf8               ext/mods/InstanceMap/MapInstance
  #289 = Utf8               getId
  #290 = Methodref          #13.#247      // ext/mods/gameserver/model/WorldObject.removeKnownObject:(Lext/mods/gameserver/model/WorldObject;)V
  #291 = Methodref          #13.#292      // ext/mods/gameserver/model/WorldObject.getRegion:()Lext/mods/gameserver/model/WorldRegion;
  #292 = NameAndType        #106:#293     // getRegion:()Lext/mods/gameserver/model/WorldRegion;
  #293 = Utf8               ()Lext/mods/gameserver/model/WorldRegion;
  #294 = Class              #295          // java/util/ArrayList
  #295 = Utf8               java/util/ArrayList
  #296 = Methodref          #294.#3       // java/util/ArrayList."<init>":()V
  #297 = InvokeDynamic      #3:#298       // #3:accept:(Lext/mods/gameserver/model/WorldObject;Ljava/lang/Class;Ljava/util/function/Consumer;)Ljava/util/function/Consumer;
  #298 = NameAndType        #255:#299     // accept:(Lext/mods/gameserver/model/WorldObject;Ljava/lang/Class;Ljava/util/function/Consumer;)Ljava/util/function/Consumer;
  #299 = Utf8               (Lext/mods/gameserver/model/WorldObject;Ljava/lang/Class;Ljava/util/function/Consumer;)Ljava/util/function/Consumer;
  #300 = Methodref          #212.#301     // ext/mods/gameserver/model/WorldRegion.forEachSurroundingRegion:(Ljava/util/function/Consumer;)V
  #301 = NameAndType        #302:#262     // forEachSurroundingRegion:(Ljava/util/function/Consumer;)V
  #302 = Utf8               forEachSurroundingRegion
  #303 = InvokeDynamic      #4:#304       // #4:accept:(Lext/mods/gameserver/model/WorldObject;Ljava/lang/Class;Ljava/util/function/Predicate;Ljava/util/function/Consumer;)Ljava/util/function/Consumer;
  #304 = NameAndType        #255:#305     // accept:(Lext/mods/gameserver/model/WorldObject;Ljava/lang/Class;Ljava/util/function/Predicate;Ljava/util/function/Consumer;)Ljava/util/function/Consumer;
  #305 = Utf8               (Lext/mods/gameserver/model/WorldObject;Ljava/lang/Class;Ljava/util/function/Predicate;Ljava/util/function/Consumer;)Ljava/util/function/Consumer;
  #306 = InvokeDynamic      #5:#307       // #5:accept:(Lext/mods/gameserver/model/WorldObject;Ljava/lang/Class;Ljava/util/function/Predicate;Ljava/util/List;)Ljava/util/function/Consumer;
  #307 = NameAndType        #255:#308     // accept:(Lext/mods/gameserver/model/WorldObject;Ljava/lang/Class;Ljava/util/function/Predicate;Ljava/util/List;)Ljava/util/function/Consumer;
  #308 = Utf8               (Lext/mods/gameserver/model/WorldObject;Ljava/lang/Class;Ljava/util/function/Predicate;Ljava/util/List;)Ljava/util/function/Consumer;
  #309 = InvokeDynamic      #6:#310       // #6:accept:(Lext/mods/gameserver/model/WorldObject;Ljava/lang/Class;ILjava/util/function/Consumer;)Ljava/util/function/Consumer;
  #310 = NameAndType        #255:#311     // accept:(Lext/mods/gameserver/model/WorldObject;Ljava/lang/Class;ILjava/util/function/Consumer;)Ljava/util/function/Consumer;
  #311 = Utf8               (Lext/mods/gameserver/model/WorldObject;Ljava/lang/Class;ILjava/util/function/Consumer;)Ljava/util/function/Consumer;
  #312 = Methodref          #212.#313     // ext/mods/gameserver/model/WorldRegion.forEachRegion:(ILjava/util/function/Consumer;)V
  #313 = NameAndType        #314:#315     // forEachRegion:(ILjava/util/function/Consumer;)V
  #314 = Utf8               forEachRegion
  #315 = Utf8               (ILjava/util/function/Consumer;)V
  #316 = InvokeDynamic      #7:#317       // #7:accept:(Lext/mods/gameserver/model/WorldObject;Ljava/lang/Class;ILjava/util/List;)Ljava/util/function/Consumer;
  #317 = NameAndType        #255:#318     // accept:(Lext/mods/gameserver/model/WorldObject;Ljava/lang/Class;ILjava/util/List;)Ljava/util/function/Consumer;
  #318 = Utf8               (Lext/mods/gameserver/model/WorldObject;Ljava/lang/Class;ILjava/util/List;)Ljava/util/function/Consumer;
  #319 = InvokeDynamic      #8:#320       // #8:accept:(Lext/mods/gameserver/model/WorldObject;Ljava/lang/Class;ILjava/util/function/Predicate;Ljava/util/function/Consumer;)Ljava/util/function/Consumer;
  #320 = NameAndType        #255:#321     // accept:(Lext/mods/gameserver/model/WorldObject;Ljava/lang/Class;ILjava/util/function/Predicate;Ljava/util/function/Consumer;)Ljava/util/function/Consumer;
  #321 = Utf8               (Lext/mods/gameserver/model/WorldObject;Ljava/lang/Class;ILjava/util/function/Predicate;Ljava/util/function/Consumer;)Ljava/util/function/Consumer;
  #322 = InvokeDynamic      #9:#323       // #9:accept:(Lext/mods/gameserver/model/WorldObject;Ljava/lang/Class;ILjava/util/function/Predicate;Ljava/util/List;)Ljava/util/function/Consumer;
  #323 = NameAndType        #255:#324     // accept:(Lext/mods/gameserver/model/WorldObject;Ljava/lang/Class;ILjava/util/function/Predicate;Ljava/util/List;)Ljava/util/function/Consumer;
  #324 = Utf8               (Lext/mods/gameserver/model/WorldObject;Ljava/lang/Class;ILjava/util/function/Predicate;Ljava/util/List;)Ljava/util/function/Consumer;
  #325 = InvokeDynamic      #10:#254      // #10:accept:(Lext/mods/gameserver/model/WorldObject;)Ljava/util/function/Consumer;
  #326 = Methodref          #244.#327     // ext/mods/gameserver/model/zone/type/subtype/ZoneType.isInsideZone:(Lext/mods/gameserver/model/WorldObject;)Z
  #327 = NameAndType        #328:#329     // isInsideZone:(Lext/mods/gameserver/model/WorldObject;)Z
  #328 = Utf8               isInsideZone
  #329 = Utf8               (Lext/mods/gameserver/model/WorldObject;)Z
  #330 = InterfaceMethodref #223.#331     // java/util/List.add:(Ljava/lang/Object;)Z
  #331 = NameAndType        #332:#240     // add:(Ljava/lang/Object;)Z
  #332 = Utf8               add
  #333 = InvokeDynamic      #11:#334      // #11:accept:(Lext/mods/gameserver/model/WorldObject;Ljava/util/List;Z)Ljava/util/function/Consumer;
  #334 = NameAndType        #255:#335     // accept:(Lext/mods/gameserver/model/WorldObject;Ljava/util/List;Z)Ljava/util/function/Consumer;
  #335 = Utf8               (Lext/mods/gameserver/model/WorldObject;Ljava/util/List;Z)Ljava/util/function/Consumer;
  #336 = Methodref          #7.#337       // ext/mods/gameserver/model/location/SpawnLocation.isIn3DRadius:(Lext/mods/gameserver/model/location/Location;I)Z
  #337 = NameAndType        #338:#339     // isIn3DRadius:(Lext/mods/gameserver/model/location/Location;I)Z
  #338 = Utf8               isIn3DRadius
  #339 = Utf8               (Lext/mods/gameserver/model/location/Location;I)Z
  #340 = Methodref          #7.#341       // ext/mods/gameserver/model/location/SpawnLocation.isIn3DRadius:(IIII)Z
  #341 = NameAndType        #338:#342     // isIn3DRadius:(IIII)Z
  #342 = Utf8               (IIII)Z
  #343 = Methodref          #7.#344       // ext/mods/gameserver/model/location/SpawnLocation.distance3D:(Lext/mods/gameserver/model/location/Location;)D
  #344 = NameAndType        #345:#346     // distance3D:(Lext/mods/gameserver/model/location/Location;)D
  #345 = Utf8               distance3D
  #346 = Utf8               (Lext/mods/gameserver/model/location/Location;)D
  #347 = Methodref          #7.#348       // ext/mods/gameserver/model/location/SpawnLocation.isIn2DRadius:(Lext/mods/gameserver/model/location/Point2D;I)Z
  #348 = NameAndType        #349:#350     // isIn2DRadius:(Lext/mods/gameserver/model/location/Point2D;I)Z
  #349 = Utf8               isIn2DRadius
  #350 = Utf8               (Lext/mods/gameserver/model/location/Point2D;I)Z
  #351 = Methodref          #7.#352       // ext/mods/gameserver/model/location/SpawnLocation.isIn2DRadius:(III)Z
  #352 = NameAndType        #349:#353     // isIn2DRadius:(III)Z
  #353 = Utf8               (III)Z
  #354 = Methodref          #7.#355       // ext/mods/gameserver/model/location/SpawnLocation.distance2D:(Lext/mods/gameserver/model/location/Point2D;)D
  #355 = NameAndType        #356:#357     // distance2D:(Lext/mods/gameserver/model/location/Point2D;)D
  #356 = Utf8               distance2D
  #357 = Utf8               (Lext/mods/gameserver/model/location/Point2D;)D
  #358 = Methodref          #7.#359       // ext/mods/gameserver/model/location/SpawnLocation.isBehind:(Lext/mods/gameserver/model/WorldObject;)Z
  #359 = NameAndType        #360:#329     // isBehind:(Lext/mods/gameserver/model/WorldObject;)Z
  #360 = Utf8               isBehind
  #361 = Methodref          #7.#362       // ext/mods/gameserver/model/location/SpawnLocation.isInFrontOf:(Lext/mods/gameserver/model/WorldObject;)Z
  #362 = NameAndType        #363:#329     // isInFrontOf:(Lext/mods/gameserver/model/WorldObject;)Z
  #363 = Utf8               isInFrontOf
  #364 = Methodref          #7.#365       // ext/mods/gameserver/model/location/SpawnLocation.isFacing:(Lext/mods/gameserver/model/WorldObject;I)Z
  #365 = NameAndType        #366:#367     // isFacing:(Lext/mods/gameserver/model/WorldObject;I)Z
  #366 = Utf8               isFacing
  #367 = Utf8               (Lext/mods/gameserver/model/WorldObject;I)Z
  #368 = Fieldref           #13.#369      // ext/mods/gameserver/model/WorldObject._townZone:Z
  #369 = NameAndType        #370:#103     // _townZone:Z
  #370 = Utf8               _townZone
  #371 = Class              #372          // ext/mods/gameserver/model/actor/Creature
  #372 = Utf8               ext/mods/gameserver/model/actor/Creature
  #373 = Methodref          #371.#374     // ext/mods/gameserver/model/actor/Creature.getCollisionRadius:()D
  #374 = NameAndType        #375:#376     // getCollisionRadius:()D
  #375 = Utf8               getCollisionRadius
  #376 = Utf8               ()D
  #377 = Methodref          #13.#378      // ext/mods/gameserver/model/WorldObject.distance3D:(Lext/mods/gameserver/model/WorldObject;)D
  #378 = NameAndType        #345:#379     // distance3D:(Lext/mods/gameserver/model/WorldObject;)D
  #379 = Utf8               (Lext/mods/gameserver/model/WorldObject;)D
  #380 = Methodref          #13.#344      // ext/mods/gameserver/model/WorldObject.distance3D:(Lext/mods/gameserver/model/location/Location;)D
  #381 = Methodref          #13.#382      // ext/mods/gameserver/model/WorldObject.decayMe:()V
  #382 = NameAndType        #383:#6       // decayMe:()V
  #383 = Utf8               decayMe
  #384 = InvokeDynamic      #12:#254      // #12:accept:(Lext/mods/gameserver/model/WorldObject;)Ljava/util/function/Consumer;
  #385 = Methodref          #13.#270      // ext/mods/gameserver/model/WorldObject.addKnownObject:(Lext/mods/gameserver/model/WorldObject;)V
  #386 = InvokeDynamic      #13:#387      // #13:test:(Lext/mods/gameserver/model/WorldObject;ILjava/util/function/Predicate;)Ljava/util/function/Predicate;
  #387 = NameAndType        #388:#389     // test:(Lext/mods/gameserver/model/WorldObject;ILjava/util/function/Predicate;)Ljava/util/function/Predicate;
  #388 = Utf8               test
  #389 = Utf8               (Lext/mods/gameserver/model/WorldObject;ILjava/util/function/Predicate;)Ljava/util/function/Predicate;
  #390 = Methodref          #42.#391      // java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
  #391 = NameAndType        #392:#393     // requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
  #392 = Utf8               requireNonNull
  #393 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
  #394 = InvokeDynamic      #14:#395      // #14:accept:(Ljava/util/List;)Ljava/util/function/Consumer;
  #395 = NameAndType        #255:#396     // accept:(Ljava/util/List;)Ljava/util/function/Consumer;
  #396 = Utf8               (Ljava/util/List;)Ljava/util/function/Consumer;
  #397 = Methodref          #212.#398     // ext/mods/gameserver/model/WorldRegion.forEachType:(Ljava/lang/Class;Lext/mods/gameserver/model/WorldObject;Ljava/util/function/Predicate;Ljava/util/function/Consumer;)V
  #398 = NameAndType        #399:#400     // forEachType:(Ljava/lang/Class;Lext/mods/gameserver/model/WorldObject;Ljava/util/function/Predicate;Ljava/util/function/Consumer;)V
  #399 = Utf8               forEachType
  #400 = Utf8               (Ljava/lang/Class;Lext/mods/gameserver/model/WorldObject;Ljava/util/function/Predicate;Ljava/util/function/Consumer;)V
  #401 = Methodref          #13.#402      // ext/mods/gameserver/model/WorldObject.isInStrictRadius:(Lext/mods/gameserver/model/WorldObject;I)Z
  #402 = NameAndType        #403:#367     // isInStrictRadius:(Lext/mods/gameserver/model/WorldObject;I)Z
  #403 = Utf8               isInStrictRadius
  #404 = InterfaceMethodref #405.#406     // java/util/function/Predicate.test:(Ljava/lang/Object;)Z
  #405 = Class              #407          // java/util/function/Predicate
  #406 = NameAndType        #388:#240     // test:(Ljava/lang/Object;)Z
  #407 = Utf8               java/util/function/Predicate
  #408 = InvokeDynamic      #15:#387      // #15:test:(Lext/mods/gameserver/model/WorldObject;ILjava/util/function/Predicate;)Ljava/util/function/Predicate;
  #409 = InvokeDynamic      #16:#410      // #16:test:(Lext/mods/gameserver/model/WorldObject;I)Ljava/util/function/Predicate;
  #410 = NameAndType        #388:#411     // test:(Lext/mods/gameserver/model/WorldObject;I)Ljava/util/function/Predicate;
  #411 = Utf8               (Lext/mods/gameserver/model/WorldObject;I)Ljava/util/function/Predicate;
  #412 = InvokeDynamic      #17:#410      // #17:test:(Lext/mods/gameserver/model/WorldObject;I)Ljava/util/function/Predicate;
  #413 = InvokeDynamic      #18:#414      // #18:test:(Lext/mods/gameserver/model/WorldObject;Ljava/util/function/Predicate;)Ljava/util/function/Predicate;
  #414 = NameAndType        #388:#415     // test:(Lext/mods/gameserver/model/WorldObject;Ljava/util/function/Predicate;)Ljava/util/function/Predicate;
  #415 = Utf8               (Lext/mods/gameserver/model/WorldObject;Ljava/util/function/Predicate;)Ljava/util/function/Predicate;
  #416 = InvokeDynamic      #19:#414      // #19:test:(Lext/mods/gameserver/model/WorldObject;Ljava/util/function/Predicate;)Ljava/util/function/Predicate;
  #417 = InvokeDynamic      #20:#418      // #20:test:(Lext/mods/gameserver/model/WorldObject;)Ljava/util/function/Predicate;
  #418 = NameAndType        #388:#419     // test:(Lext/mods/gameserver/model/WorldObject;)Ljava/util/function/Predicate;
  #419 = Utf8               (Lext/mods/gameserver/model/WorldObject;)Ljava/util/function/Predicate;
  #420 = Class              #421          // ext/mods/commons/logging/CLogger
  #421 = Utf8               ext/mods/commons/logging/CLogger
  #422 = Methodref          #423.#52      // java/lang/Class.getName:()Ljava/lang/String;
  #423 = Class              #424          // java/lang/Class
  #424 = Utf8               java/lang/Class
  #425 = Methodref          #420.#426     // ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
  #426 = NameAndType        #5:#427       // "<init>":(Ljava/lang/String;)V
  #427 = Utf8               (Ljava/lang/String;)V
  #428 = Fieldref           #13.#429      // ext/mods/gameserver/model/WorldObject.LOGGER:Lext/mods/commons/logging/CLogger;
  #429 = NameAndType        #430:#431     // LOGGER:Lext/mods/commons/logging/CLogger;
  #430 = Utf8               LOGGER
  #431 = Utf8               Lext/mods/commons/logging/CLogger;
  #432 = Utf8               Code
  #433 = Utf8               LineNumberTable
  #434 = Utf8               LocalVariableTable
  #435 = Utf8               this
  #436 = Utf8               Lext/mods/gameserver/model/WorldObject;
  #437 = Utf8               objectId
  #438 = Utf8               hashCode
  #439 = Utf8               equals
  #440 = Utf8               obj
  #441 = Utf8               Ljava/lang/Object;
  #442 = Utf8               other
  #443 = Utf8               StackMapTable
  #444 = Utf8               toString
  #445 = Utf8               isAttackableBy
  #446 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)Z
  #447 = Utf8               attacker
  #448 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #449 = Utf8               isAttackableWithoutForceBy
  #450 = Utf8               (Lext/mods/gameserver/model/actor/Playable;)Z
  #451 = Utf8               Lext/mods/gameserver/model/actor/Playable;
  #452 = Utf8               onAction
  #453 = Utf8               (Lext/mods/gameserver/model/actor/Player;ZZ)V
  #454 = Utf8               player
  #455 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #456 = Utf8               isCtrlPressed
  #457 = Utf8               isShiftPressed
  #458 = Utf8               refreshID
  #459 = Utf8               (Lext/mods/gameserver/model/location/Location;)V
  #460 = Utf8               loc
  #461 = Utf8               Lext/mods/gameserver/model/location/Location;
  #462 = Utf8               heading
  #463 = Utf8               (Lext/mods/gameserver/model/boat/BoatItinerary;)V
  #464 = Utf8               itinerary
  #465 = Utf8               Lext/mods/gameserver/model/boat/BoatItinerary;
  #466 = Utf8               x
  #467 = Utf8               y
  #468 = Utf8               z
  #469 = Utf8               value
  #470 = Utf8               setName
  #471 = Utf8               getActingPlayer
  #472 = Utf8               ()Lext/mods/gameserver/model/actor/Player;
  #473 = Utf8               sendInfo
  #474 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
  #475 = Utf8               isChargedShot
  #476 = Utf8               (Lext/mods/gameserver/enums/items/ShotType;)Z
  #477 = Utf8               type
  #478 = Utf8               Lext/mods/gameserver/enums/items/ShotType;
  #479 = Utf8               setChargedShot
  #480 = Utf8               (Lext/mods/gameserver/enums/items/ShotType;Z)V
  #481 = Utf8               charged
  #482 = Utf8               rechargeShots
  #483 = Utf8               (ZZ)V
  #484 = Utf8               physical
  #485 = Utf8               magical
  #486 = Utf8               (Lext/mods/gameserver/enums/ZoneId;)Z
  #487 = Utf8               zone
  #488 = Utf8               Lext/mods/gameserver/enums/ZoneId;
  #489 = Utf8               region
  #490 = Utf8               object
  #491 = Utf8               Lext/mods/gameserver/model/zone/type/subtype/ZoneType;
  #492 = Utf8               newRegion
  #493 = Utf8               oldAreas
  #494 = Utf8               Ljava/util/List;
  #495 = Utf8               newAreas
  #496 = Utf8               LocalVariableTypeTable
  #497 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/WorldRegion;>;
  #498 = Utf8               reg
  #499 = Utf8               knows
  #500 = Utf8               target
  #501 = Utf8               targetRegion
  #502 = Utf8               getKnownType
  #503 = Utf8               (Ljava/lang/Class;)Ljava/util/List;
  #504 = Utf8               Ljava/lang/Class;
  #505 = Utf8               result
  #506 = Utf8               Ljava/lang/Class<TA;>;
  #507 = Utf8               Ljava/util/List<TA;>;
  #508 = Utf8               Signature
  #509 = Utf8               <A:Lext/mods/gameserver/model/WorldObject;>(Ljava/lang/Class<TA;>;)Ljava/util/List<TA;>;
  #510 = Utf8               forEachKnownType
  #511 = Utf8               (Ljava/lang/Class;Ljava/util/function/Consumer;)V
  #512 = Utf8               action
  #513 = Utf8               Ljava/util/function/Consumer;
  #514 = Utf8               Ljava/util/function/Consumer<TA;>;
  #515 = Utf8               <A:Lext/mods/gameserver/model/WorldObject;>(Ljava/lang/Class<TA;>;Ljava/util/function/Consumer<TA;>;)V
  #516 = Utf8               (Ljava/lang/Class;Ljava/util/function/Predicate;Ljava/util/function/Consumer;)V
  #517 = Utf8               filter
  #518 = Utf8               Ljava/util/function/Predicate;
  #519 = Utf8               Ljava/util/function/Predicate<TA;>;
  #520 = Utf8               <A:Lext/mods/gameserver/model/WorldObject;>(Ljava/lang/Class<TA;>;Ljava/util/function/Predicate<TA;>;Ljava/util/function/Consumer<TA;>;)V
  #521 = Utf8               (Ljava/lang/Class;Ljava/util/function/Predicate;)Ljava/util/List;
  #522 = Utf8               <A:Lext/mods/gameserver/model/WorldObject;>(Ljava/lang/Class<TA;>;Ljava/util/function/Predicate<TA;>;)Ljava/util/List<TA;>;
  #523 = Utf8               forEachKnownTypeInRadius
  #524 = Utf8               (Ljava/lang/Class;ILjava/util/function/Consumer;)V
  #525 = Utf8               radius
  #526 = Utf8               depth
  #527 = Utf8               <A:Lext/mods/gameserver/model/WorldObject;>(Ljava/lang/Class<TA;>;ILjava/util/function/Consumer<TA;>;)V
  #528 = Utf8               getKnownTypeInRadius
  #529 = Utf8               (Ljava/lang/Class;I)Ljava/util/List;
  #530 = Utf8               <A:Lext/mods/gameserver/model/WorldObject;>(Ljava/lang/Class<TA;>;I)Ljava/util/List<TA;>;
  #531 = Utf8               (Ljava/lang/Class;ILjava/util/function/Predicate;Ljava/util/function/Consumer;)V
  #532 = Utf8               <A:Lext/mods/gameserver/model/WorldObject;>(Ljava/lang/Class<TA;>;ILjava/util/function/Predicate<TA;>;Ljava/util/function/Consumer<TA;>;)V
  #533 = Utf8               (Ljava/lang/Class;ILjava/util/function/Predicate;)Ljava/util/List;
  #534 = Utf8               <A:Lext/mods/gameserver/model/WorldObject;>(Ljava/lang/Class<TA;>;ILjava/util/function/Predicate<TA;>;)Ljava/util/List<TA;>;
  #535 = Utf8               refreshKnownlist
  #536 = Utf8               (Z)Ljava/util/List;
  #537 = Utf8               zt
  #538 = Utf8               checkIfInside
  #539 = Utf8               zones
  #540 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/zone/type/subtype/ZoneType;>;
  #541 = Utf8               (Z)Ljava/util/List<Lext/mods/gameserver/model/zone/type/subtype/ZoneType;>;
  #542 = Utf8               onActiveRegion
  #543 = Utf8               onInactiveRegion
  #544 = Utf8               maxAngle
  #545 = Utf8               onInteract
  #546 = Utf8               getMonster
  #547 = Utf8               ()Lext/mods/gameserver/model/actor/instance/Monster;
  #548 = Utf8               isVisibleTo
  #549 = Utf8               getTownZone
  #550 = Utf8               setTownZone
  #551 = Utf8               val
  #552 = Utf8               creature
  #553 = Utf8               totalRadius
  #554 = Utf8               D
  #555 = Utf8               isSameInstanceMap
  #556 = Utf8               setInstanceMap
  #557 = Utf8               (Lext/mods/InstanceMap/MapInstance;Z)V
  #558 = Utf8               instance
  #559 = Utf8               silent
  #560 = Utf8               lambda$getZones$0
  #561 = Utf8               (Ljava/util/List;ZLext/mods/gameserver/model/WorldRegion;)V
  #562 = Utf8               i$
  #563 = Utf8               Ljava/util/Iterator;
  #564 = Utf8               r
  #565 = Utf8               lambda$refreshKnownlist$0
  #566 = Utf8               lambda$refreshKnownlist$1
  #567 = Utf8               o
  #568 = Utf8               lambda$getKnownTypeInRadius$2
  #569 = Utf8               (Ljava/lang/Class;ILjava/util/function/Predicate;Ljava/util/List;Lext/mods/gameserver/model/WorldRegion;)V
  #570 = Utf8               lambda$getKnownTypeInRadius$3
  #571 = Utf8               (ILjava/util/function/Predicate;Lext/mods/gameserver/model/WorldObject;)Z
  #572 = Utf8               lambda$forEachKnownTypeInRadius$2
  #573 = Utf8               (Ljava/lang/Class;ILjava/util/function/Predicate;Ljava/util/function/Consumer;Lext/mods/gameserver/model/WorldRegion;)V
  #574 = Utf8               lambda$forEachKnownTypeInRadius$3
  #575 = Utf8               lambda$getKnownTypeInRadius$0
  #576 = Utf8               (Ljava/lang/Class;ILjava/util/List;Lext/mods/gameserver/model/WorldRegion;)V
  #577 = Utf8               lambda$getKnownTypeInRadius$1
  #578 = Utf8               (ILext/mods/gameserver/model/WorldObject;)Z
  #579 = Utf8               lambda$forEachKnownTypeInRadius$0
  #580 = Utf8               (Ljava/lang/Class;ILjava/util/function/Consumer;Lext/mods/gameserver/model/WorldRegion;)V
  #581 = Utf8               lambda$forEachKnownTypeInRadius$1
  #582 = Utf8               lambda$getKnownType$0
  #583 = Utf8               (Ljava/lang/Class;Ljava/util/function/Predicate;Ljava/util/List;Lext/mods/gameserver/model/WorldRegion;)V
  #584 = Utf8               lambda$getKnownType$1
  #585 = Utf8               (Ljava/util/function/Predicate;Lext/mods/gameserver/model/WorldObject;)Z
  #586 = Utf8               lambda$forEachKnownType$2
  #587 = Utf8               (Ljava/lang/Class;Ljava/util/function/Predicate;Ljava/util/function/Consumer;Lext/mods/gameserver/model/WorldRegion;)V
  #588 = Utf8               lambda$forEachKnownType$3
  #589 = Utf8               lambda$forEachKnownType$0
  #590 = Utf8               (Ljava/lang/Class;Ljava/util/function/Consumer;Lext/mods/gameserver/model/WorldRegion;)V
  #591 = Utf8               lambda$forEachKnownType$1
  #592 = Utf8               lambda$setRegion$1
  #593 = Utf8               lambda$setRegion$0
  #594 = Utf8               <clinit>
  #595 = Utf8               SourceFile
  #596 = Utf8               WorldObject.java
  #597 = Utf8               BootstrapMethods
  #598 = String             #599          // \u0001 [objId=\u0001]
  #599 = Utf8               \u0001 [objId=\u0001]
  #600 = MethodType         #601          //  (Ljava/lang/Object;)V
  #601 = Utf8               (Ljava/lang/Object;)V
  #602 = MethodHandle       5:#603        // REF_invokeVirtual ext/mods/gameserver/model/WorldObject.lambda$setRegion$0:(Lext/mods/gameserver/model/WorldObject;)V
  #603 = Methodref          #13.#604      // ext/mods/gameserver/model/WorldObject.lambda$setRegion$0:(Lext/mods/gameserver/model/WorldObject;)V
  #604 = NameAndType        #593:#87      // lambda$setRegion$0:(Lext/mods/gameserver/model/WorldObject;)V
  #605 = MethodType         #87           //  (Lext/mods/gameserver/model/WorldObject;)V
  #606 = MethodHandle       5:#607        // REF_invokeVirtual ext/mods/gameserver/model/WorldObject.lambda$setRegion$1:(Lext/mods/gameserver/model/WorldObject;)V
  #607 = Methodref          #13.#608      // ext/mods/gameserver/model/WorldObject.lambda$setRegion$1:(Lext/mods/gameserver/model/WorldObject;)V
  #608 = NameAndType        #592:#87      // lambda$setRegion$1:(Lext/mods/gameserver/model/WorldObject;)V
  #609 = MethodHandle       5:#610        // REF_invokeVirtual ext/mods/gameserver/model/WorldObject.lambda$forEachKnownType$0:(Ljava/lang/Class;Ljava/util/function/Consumer;Lext/mods/gameserver/model/WorldRegion;)V
  #610 = Methodref          #13.#611      // ext/mods/gameserver/model/WorldObject.lambda$forEachKnownType$0:(Ljava/lang/Class;Ljava/util/function/Consumer;Lext/mods/gameserver/model/WorldRegion;)V
  #611 = NameAndType        #589:#590     // lambda$forEachKnownType$0:(Ljava/lang/Class;Ljava/util/function/Consumer;Lext/mods/gameserver/model/WorldRegion;)V
  #612 = MethodType         #111          //  (Lext/mods/gameserver/model/WorldRegion;)V
  #613 = MethodHandle       5:#614        // REF_invokeVirtual ext/mods/gameserver/model/WorldObject.lambda$forEachKnownType$2:(Ljava/lang/Class;Ljava/util/function/Predicate;Ljava/util/function/Consumer;Lext/mods/gameserver/model/WorldRegion;)V
  #614 = Methodref          #13.#615      // ext/mods/gameserver/model/WorldObject.lambda$forEachKnownType$2:(Ljava/lang/Class;Ljava/util/function/Predicate;Ljava/util/function/Consumer;Lext/mods/gameserver/model/WorldRegion;)V
  #615 = NameAndType        #586:#587     // lambda$forEachKnownType$2:(Ljava/lang/Class;Ljava/util/function/Predicate;Ljava/util/function/Consumer;Lext/mods/gameserver/model/WorldRegion;)V
  #616 = MethodHandle       5:#617        // REF_invokeVirtual ext/mods/gameserver/model/WorldObject.lambda$getKnownType$0:(Ljava/lang/Class;Ljava/util/function/Predicate;Ljava/util/List;Lext/mods/gameserver/model/WorldRegion;)V
  #617 = Methodref          #13.#618      // ext/mods/gameserver/model/WorldObject.lambda$getKnownType$0:(Ljava/lang/Class;Ljava/util/function/Predicate;Ljava/util/List;Lext/mods/gameserver/model/WorldRegion;)V
  #618 = NameAndType        #582:#583     // lambda$getKnownType$0:(Ljava/lang/Class;Ljava/util/function/Predicate;Ljava/util/List;Lext/mods/gameserver/model/WorldRegion;)V
  #619 = MethodHandle       5:#620        // REF_invokeVirtual ext/mods/gameserver/model/WorldObject.lambda$forEachKnownTypeInRadius$0:(Ljava/lang/Class;ILjava/util/function/Consumer;Lext/mods/gameserver/model/WorldRegion;)V
  #620 = Methodref          #13.#621      // ext/mods/gameserver/model/WorldObject.lambda$forEachKnownTypeInRadius$0:(Ljava/lang/Class;ILjava/util/function/Consumer;Lext/mods/gameserver/model/WorldRegion;)V
  #621 = NameAndType        #579:#580     // lambda$forEachKnownTypeInRadius$0:(Ljava/lang/Class;ILjava/util/function/Consumer;Lext/mods/gameserver/model/WorldRegion;)V
  #622 = MethodHandle       5:#623        // REF_invokeVirtual ext/mods/gameserver/model/WorldObject.lambda$getKnownTypeInRadius$0:(Ljava/lang/Class;ILjava/util/List;Lext/mods/gameserver/model/WorldRegion;)V
  #623 = Methodref          #13.#624      // ext/mods/gameserver/model/WorldObject.lambda$getKnownTypeInRadius$0:(Ljava/lang/Class;ILjava/util/List;Lext/mods/gameserver/model/WorldRegion;)V
  #624 = NameAndType        #575:#576     // lambda$getKnownTypeInRadius$0:(Ljava/lang/Class;ILjava/util/List;Lext/mods/gameserver/model/WorldRegion;)V
  #625 = MethodHandle       5:#626        // REF_invokeVirtual ext/mods/gameserver/model/WorldObject.lambda$forEachKnownTypeInRadius$2:(Ljava/lang/Class;ILjava/util/function/Predicate;Ljava/util/function/Consumer;Lext/mods/gameserver/model/WorldRegion;)V
  #626 = Methodref          #13.#627      // ext/mods/gameserver/model/WorldObject.lambda$forEachKnownTypeInRadius$2:(Ljava/lang/Class;ILjava/util/function/Predicate;Ljava/util/function/Consumer;Lext/mods/gameserver/model/WorldRegion;)V
  #627 = NameAndType        #572:#573     // lambda$forEachKnownTypeInRadius$2:(Ljava/lang/Class;ILjava/util/function/Predicate;Ljava/util/function/Consumer;Lext/mods/gameserver/model/WorldRegion;)V
  #628 = MethodHandle       5:#629        // REF_invokeVirtual ext/mods/gameserver/model/WorldObject.lambda$getKnownTypeInRadius$2:(Ljava/lang/Class;ILjava/util/function/Predicate;Ljava/util/List;Lext/mods/gameserver/model/WorldRegion;)V
  #629 = Methodref          #13.#630      // ext/mods/gameserver/model/WorldObject.lambda$getKnownTypeInRadius$2:(Ljava/lang/Class;ILjava/util/function/Predicate;Ljava/util/List;Lext/mods/gameserver/model/WorldRegion;)V
  #630 = NameAndType        #568:#569     // lambda$getKnownTypeInRadius$2:(Ljava/lang/Class;ILjava/util/function/Predicate;Ljava/util/List;Lext/mods/gameserver/model/WorldRegion;)V
  #631 = MethodHandle       5:#632        // REF_invokeVirtual ext/mods/gameserver/model/WorldObject.lambda$refreshKnownlist$0:(Lext/mods/gameserver/model/WorldRegion;)V
  #632 = Methodref          #13.#633      // ext/mods/gameserver/model/WorldObject.lambda$refreshKnownlist$0:(Lext/mods/gameserver/model/WorldRegion;)V
  #633 = NameAndType        #565:#111     // lambda$refreshKnownlist$0:(Lext/mods/gameserver/model/WorldRegion;)V
  #634 = MethodHandle       5:#635        // REF_invokeVirtual ext/mods/gameserver/model/WorldObject.lambda$getZones$0:(Ljava/util/List;ZLext/mods/gameserver/model/WorldRegion;)V
  #635 = Methodref          #13.#636      // ext/mods/gameserver/model/WorldObject.lambda$getZones$0:(Ljava/util/List;ZLext/mods/gameserver/model/WorldRegion;)V
  #636 = NameAndType        #560:#561     // lambda$getZones$0:(Ljava/util/List;ZLext/mods/gameserver/model/WorldRegion;)V
  #637 = MethodHandle       5:#638        // REF_invokeVirtual ext/mods/gameserver/model/WorldObject.lambda$refreshKnownlist$1:(Lext/mods/gameserver/model/WorldObject;)V
  #638 = Methodref          #13.#639      // ext/mods/gameserver/model/WorldObject.lambda$refreshKnownlist$1:(Lext/mods/gameserver/model/WorldObject;)V
  #639 = NameAndType        #566:#87      // lambda$refreshKnownlist$1:(Lext/mods/gameserver/model/WorldObject;)V
  #640 = MethodType         #240          //  (Ljava/lang/Object;)Z
  #641 = MethodHandle       5:#642        // REF_invokeVirtual ext/mods/gameserver/model/WorldObject.lambda$getKnownTypeInRadius$3:(ILjava/util/function/Predicate;Lext/mods/gameserver/model/WorldObject;)Z
  #642 = Methodref          #13.#643      // ext/mods/gameserver/model/WorldObject.lambda$getKnownTypeInRadius$3:(ILjava/util/function/Predicate;Lext/mods/gameserver/model/WorldObject;)Z
  #643 = NameAndType        #570:#571     // lambda$getKnownTypeInRadius$3:(ILjava/util/function/Predicate;Lext/mods/gameserver/model/WorldObject;)Z
  #644 = MethodType         #329          //  (Lext/mods/gameserver/model/WorldObject;)Z
  #645 = MethodHandle       9:#330        // REF_invokeInterface java/util/List.add:(Ljava/lang/Object;)Z
  #646 = MethodHandle       5:#647        // REF_invokeVirtual ext/mods/gameserver/model/WorldObject.lambda$forEachKnownTypeInRadius$3:(ILjava/util/function/Predicate;Lext/mods/gameserver/model/WorldObject;)Z
  #647 = Methodref          #13.#648      // ext/mods/gameserver/model/WorldObject.lambda$forEachKnownTypeInRadius$3:(ILjava/util/function/Predicate;Lext/mods/gameserver/model/WorldObject;)Z
  #648 = NameAndType        #574:#571     // lambda$forEachKnownTypeInRadius$3:(ILjava/util/function/Predicate;Lext/mods/gameserver/model/WorldObject;)Z
  #649 = MethodHandle       5:#650        // REF_invokeVirtual ext/mods/gameserver/model/WorldObject.lambda$getKnownTypeInRadius$1:(ILext/mods/gameserver/model/WorldObject;)Z
  #650 = Methodref          #13.#651      // ext/mods/gameserver/model/WorldObject.lambda$getKnownTypeInRadius$1:(ILext/mods/gameserver/model/WorldObject;)Z
  #651 = NameAndType        #577:#578     // lambda$getKnownTypeInRadius$1:(ILext/mods/gameserver/model/WorldObject;)Z
  #652 = MethodHandle       5:#653        // REF_invokeVirtual ext/mods/gameserver/model/WorldObject.lambda$forEachKnownTypeInRadius$1:(ILext/mods/gameserver/model/WorldObject;)Z
  #653 = Methodref          #13.#654      // ext/mods/gameserver/model/WorldObject.lambda$forEachKnownTypeInRadius$1:(ILext/mods/gameserver/model/WorldObject;)Z
  #654 = NameAndType        #581:#578     // lambda$forEachKnownTypeInRadius$1:(ILext/mods/gameserver/model/WorldObject;)Z
  #655 = MethodHandle       5:#656        // REF_invokeVirtual ext/mods/gameserver/model/WorldObject.lambda$getKnownType$1:(Ljava/util/function/Predicate;Lext/mods/gameserver/model/WorldObject;)Z
  #656 = Methodref          #13.#657      // ext/mods/gameserver/model/WorldObject.lambda$getKnownType$1:(Ljava/util/function/Predicate;Lext/mods/gameserver/model/WorldObject;)Z
  #657 = NameAndType        #584:#585     // lambda$getKnownType$1:(Ljava/util/function/Predicate;Lext/mods/gameserver/model/WorldObject;)Z
  #658 = MethodHandle       5:#659        // REF_invokeVirtual ext/mods/gameserver/model/WorldObject.lambda$forEachKnownType$3:(Ljava/util/function/Predicate;Lext/mods/gameserver/model/WorldObject;)Z
  #659 = Methodref          #13.#660      // ext/mods/gameserver/model/WorldObject.lambda$forEachKnownType$3:(Ljava/util/function/Predicate;Lext/mods/gameserver/model/WorldObject;)Z
  #660 = NameAndType        #588:#585     // lambda$forEachKnownType$3:(Ljava/util/function/Predicate;Lext/mods/gameserver/model/WorldObject;)Z
  #661 = MethodHandle       5:#662        // REF_invokeVirtual ext/mods/gameserver/model/WorldObject.lambda$forEachKnownType$1:(Lext/mods/gameserver/model/WorldObject;)Z
  #662 = Methodref          #13.#663      // ext/mods/gameserver/model/WorldObject.lambda$forEachKnownType$1:(Lext/mods/gameserver/model/WorldObject;)Z
  #663 = NameAndType        #591:#329     // lambda$forEachKnownType$1:(Lext/mods/gameserver/model/WorldObject;)Z
  #664 = MethodHandle       6:#665        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #665 = Methodref          #666.#667     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #666 = Class              #668          // java/lang/invoke/StringConcatFactory
  #667 = NameAndType        #61:#669      // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #668 = Utf8               java/lang/invoke/StringConcatFactory
  #669 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #670 = MethodHandle       6:#671        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #671 = Methodref          #672.#673     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #672 = Class              #674          // java/lang/invoke/LambdaMetafactory
  #673 = NameAndType        #675:#676     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #674 = Utf8               java/lang/invoke/LambdaMetafactory
  #675 = Utf8               metafactory
  #676 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #677 = Utf8               InnerClasses
  #678 = Class              #679          // java/lang/invoke/MethodHandles$Lookup
  #679 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #680 = Class              #681          // java/lang/invoke/MethodHandles
  #681 = Utf8               java/lang/invoke/MethodHandles
  #682 = Utf8               Lookup
{
  public static final ext.mods.commons.logging.CLogger LOGGER;
    descriptor: Lext/mods/commons/logging/CLogger;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL

  protected boolean _townZone;
    descriptor: Z
    flags: (0x0004) ACC_PROTECTED

  protected ext.mods.gameserver.model.WorldObject(int);
    descriptor: (I)V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=7, locals=2, args_size=2
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: new           #7                  // class ext/mods/gameserver/model/location/SpawnLocation
         8: dup
         9: iconst_0
        10: iconst_0
        11: iconst_0
        12: iconst_0
        13: invokespecial #9                  // Method ext/mods/gameserver/model/location/SpawnLocation."<init>":(IIII)V
        16: putfield      #12                 // Field _position:Lext/mods/gameserver/model/location/SpawnLocation;
        19: aload_0
        20: invokestatic  #18                 // Method ext/mods/InstanceMap/InstanceManager.getInstance:()Lext/mods/InstanceMap/InstanceManager;
        23: iconst_0
        24: invokevirtual #24                 // Method ext/mods/InstanceMap/InstanceManager.getInstance:(I)Lext/mods/InstanceMap/MapInstance;
        27: putfield      #27                 // Field _instance:Lext/mods/InstanceMap/MapInstance;
        30: aload_0
        31: iload_1
        32: putfield      #31                 // Field _objectId:I
        35: return
      LineNumberTable:
        line 64: 0
        line 58: 4
        line 928: 19
        line 65: 30
        line 66: 35
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      36     0  this   Lext/mods/gameserver/model/WorldObject;
            0      36     1 objectId   I

  public int hashCode();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=1, args_size=1
         0: iconst_1
         1: anewarray     #2                  // class java/lang/Object
         4: dup
         5: iconst_0
         6: aload_0
         7: getfield      #31                 // Field _objectId:I
        10: invokestatic  #35                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        13: aastore
        14: invokestatic  #41                 // Method java/util/Objects.hash:([Ljava/lang/Object;)I
        17: ireturn
      LineNumberTable:
        line 71: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      18     0  this   Lext/mods/gameserver/model/WorldObject;

  public boolean equals(java.lang.Object);
    descriptor: (Ljava/lang/Object;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=3, args_size=2
         0: aload_0
         1: aload_1
         2: if_acmpne     7
         5: iconst_1
         6: ireturn
         7: aload_1
         8: ifnonnull     13
        11: iconst_0
        12: ireturn
        13: aload_0
        14: invokevirtual #47                 // Method java/lang/Object.getClass:()Ljava/lang/Class;
        17: aload_1
        18: invokevirtual #47                 // Method java/lang/Object.getClass:()Ljava/lang/Class;
        21: if_acmpeq     26
        24: iconst_0
        25: ireturn
        26: aload_1
        27: checkcast     #13                 // class ext/mods/gameserver/model/WorldObject
        30: astore_2
        31: aload_0
        32: getfield      #31                 // Field _objectId:I
        35: aload_2
        36: getfield      #31                 // Field _objectId:I
        39: if_icmpne     46
        42: iconst_1
        43: goto          47
        46: iconst_0
        47: ireturn
      LineNumberTable:
        line 77: 0
        line 78: 5
        line 80: 7
        line 81: 11
        line 83: 13
        line 84: 24
        line 86: 26
        line 87: 31
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      48     0  this   Lext/mods/gameserver/model/WorldObject;
            0      48     1   obj   Ljava/lang/Object;
           31      17     2 other   Lext/mods/gameserver/model/WorldObject;
      StackMapTable: number_of_entries = 5
        frame_type = 7 /* same */
        frame_type = 5 /* same */
        frame_type = 12 /* same */
        frame_type = 252 /* append */
          offset_delta = 19
          locals = [ class ext/mods/gameserver/model/WorldObject ]
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public java.lang.String toString();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #51                 // Method getName:()Ljava/lang/String;
         4: aload_0
         5: invokevirtual #55                 // Method getObjectId:()I
         8: invokedynamic #59,  0             // InvokeDynamic #0:makeConcatWithConstants:(Ljava/lang/String;I)Ljava/lang/String;
        13: areturn
      LineNumberTable:
        line 93: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0  this   Lext/mods/gameserver/model/WorldObject;

  public boolean isAttackableBy(ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=2, args_size=2
         0: iconst_0
         1: ireturn
      LineNumberTable:
        line 98: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/gameserver/model/WorldObject;
            0       2     1 attacker   Lext/mods/gameserver/model/actor/Creature;

  public boolean isAttackableWithoutForceBy(ext.mods.gameserver.model.actor.Playable);
    descriptor: (Lext/mods/gameserver/model/actor/Playable;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=2, args_size=2
         0: iconst_0
         1: ireturn
      LineNumberTable:
        line 103: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/gameserver/model/WorldObject;
            0       2     1 attacker   Lext/mods/gameserver/model/actor/Playable;

  public void onAction(ext.mods.gameserver.model.actor.Player, boolean, boolean);
    descriptor: (Lext/mods/gameserver/model/actor/Player;ZZ)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=4, args_size=4
         0: aload_1
         1: getstatic     #63                 // Field ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
         4: invokevirtual #69                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
         7: return
      LineNumberTable:
        line 108: 0
        line 109: 7
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/WorldObject;
            0       8     1 player   Lext/mods/gameserver/model/actor/Player;
            0       8     2 isCtrlPressed   Z
            0       8     3 isShiftPressed   Z

  public void onSpawn();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=0, locals=1, args_size=1
         0: return
      LineNumberTable:
        line 113: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       1     0  this   Lext/mods/gameserver/model/WorldObject;

  public void decayMe();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: iconst_0
         2: invokevirtual #75                 // Method setIsVisible:(Z)V
         5: invokestatic  #79                 // Method ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
         8: aload_0
         9: invokevirtual #84                 // Method ext/mods/gameserver/model/World.removeObject:(Lext/mods/gameserver/model/WorldObject;)V
        12: return
      LineNumberTable:
        line 120: 0
        line 122: 5
        line 123: 12
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      13     0  this   Lext/mods/gameserver/model/WorldObject;

  public void refreshID();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: invokestatic  #79                 // Method ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
         3: aload_0
         4: invokevirtual #84                 // Method ext/mods/gameserver/model/World.removeObject:(Lext/mods/gameserver/model/WorldObject;)V
         7: invokestatic  #88                 // Method ext/mods/gameserver/idfactory/IdFactory.getInstance:()Lext/mods/gameserver/idfactory/IdFactory;
        10: aload_0
        11: invokevirtual #55                 // Method getObjectId:()I
        14: invokevirtual #93                 // Method ext/mods/gameserver/idfactory/IdFactory.releaseId:(I)V
        17: aload_0
        18: invokestatic  #88                 // Method ext/mods/gameserver/idfactory/IdFactory.getInstance:()Lext/mods/gameserver/idfactory/IdFactory;
        21: invokevirtual #97                 // Method ext/mods/gameserver/idfactory/IdFactory.getNextId:()I
        24: putfield      #31                 // Field _objectId:I
        27: return
      LineNumberTable:
        line 127: 0
        line 128: 7
        line 129: 17
        line 130: 27
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      28     0  this   Lext/mods/gameserver/model/WorldObject;

  public final void spawnMe();
    descriptor: ()V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=3, locals=1, args_size=1
         0: aload_0
         1: iconst_1
         2: putfield      #100                // Field _isVisible:Z
         5: aload_0
         6: invokestatic  #79                 // Method ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
         9: aload_0
        10: getfield      #12                 // Field _position:Lext/mods/gameserver/model/location/SpawnLocation;
        13: invokevirtual #104                // Method ext/mods/gameserver/model/World.getRegion:(Lext/mods/gameserver/model/location/Location;)Lext/mods/gameserver/model/WorldRegion;
        16: invokevirtual #108                // Method setRegion:(Lext/mods/gameserver/model/WorldRegion;)V
        19: invokestatic  #79                 // Method ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
        22: aload_0
        23: invokevirtual #112                // Method ext/mods/gameserver/model/World.addObject:(Lext/mods/gameserver/model/WorldObject;)V
        26: aload_0
        27: invokevirtual #115                // Method onSpawn:()V
        30: return
      LineNumberTable:
        line 137: 0
        line 139: 5
        line 141: 19
        line 143: 26
        line 144: 30
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      31     0  this   Lext/mods/gameserver/model/WorldObject;

  public final void spawnMe(ext.mods.gameserver.model.location.Location);
    descriptor: (Lext/mods/gameserver/model/location/Location;)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=4, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokevirtual #118                // Method ext/mods/gameserver/model/location/Location.getX:()I
         5: aload_1
         6: invokevirtual #123                // Method ext/mods/gameserver/model/location/Location.getY:()I
         9: aload_1
        10: invokevirtual #126                // Method ext/mods/gameserver/model/location/Location.getZ:()I
        13: invokevirtual #129                // Method spawnMe:(III)V
        16: return
      LineNumberTable:
        line 152: 0
        line 153: 16
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      17     0  this   Lext/mods/gameserver/model/WorldObject;
            0      17     1   loc   Lext/mods/gameserver/model/location/Location;

  public final void spawnMe(ext.mods.gameserver.model.location.Location, int);
    descriptor: (Lext/mods/gameserver/model/location/Location;I)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=5, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: invokevirtual #118                // Method ext/mods/gameserver/model/location/Location.getX:()I
         5: aload_1
         6: invokevirtual #123                // Method ext/mods/gameserver/model/location/Location.getY:()I
         9: aload_1
        10: invokevirtual #126                // Method ext/mods/gameserver/model/location/Location.getZ:()I
        13: iload_2
        14: invokevirtual #133                // Method spawnMe:(IIII)V
        17: return
      LineNumberTable:
        line 162: 0
        line 163: 17
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      18     0  this   Lext/mods/gameserver/model/WorldObject;
            0      18     1   loc   Lext/mods/gameserver/model/location/Location;
            0      18     2 heading   I

  public final void spawnMe(ext.mods.gameserver.model.location.SpawnLocation);
    descriptor: (Lext/mods/gameserver/model/location/SpawnLocation;)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=5, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokevirtual #135                // Method ext/mods/gameserver/model/location/SpawnLocation.getX:()I
         5: aload_1
         6: invokevirtual #136                // Method ext/mods/gameserver/model/location/SpawnLocation.getY:()I
         9: aload_1
        10: invokevirtual #137                // Method ext/mods/gameserver/model/location/SpawnLocation.getZ:()I
        13: aload_1
        14: invokevirtual #138                // Method ext/mods/gameserver/model/location/SpawnLocation.getHeading:()I
        17: invokevirtual #133                // Method spawnMe:(IIII)V
        20: return
      LineNumberTable:
        line 171: 0
        line 172: 20
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      21     0  this   Lext/mods/gameserver/model/WorldObject;
            0      21     1   loc   Lext/mods/gameserver/model/location/SpawnLocation;

  public final void spawnMe(ext.mods.gameserver.model.boat.BoatItinerary);
    descriptor: (Lext/mods/gameserver/model/boat/BoatItinerary;)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokevirtual #141                // Method ext/mods/gameserver/model/boat/BoatItinerary.getInfo:()[Lext/mods/gameserver/model/boat/BoatRouteInfo;
         5: iconst_0
         6: aaload
         7: invokevirtual #147                // Method ext/mods/gameserver/model/boat/BoatRouteInfo.getDock:()Lext/mods/gameserver/enums/boats/BoatDock;
        10: invokevirtual #153                // Method ext/mods/gameserver/enums/boats/BoatDock.getDockLoc:()Lext/mods/gameserver/model/location/BoatLocation;
        13: aload_1
        14: invokevirtual #159                // Method ext/mods/gameserver/model/boat/BoatItinerary.getHeading:()I
        17: invokevirtual #160                // Method spawnMe:(Lext/mods/gameserver/model/location/Location;I)V
        20: return
      LineNumberTable:
        line 176: 0
        line 177: 20
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      21     0  this   Lext/mods/gameserver/model/WorldObject;
            0      21     1 itinerary   Lext/mods/gameserver/model/boat/BoatItinerary;

  public final void spawnMe(int, int, int);
    descriptor: (III)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=6, locals=4, args_size=4
         0: aload_0
         1: getfield      #12                 // Field _position:Lext/mods/gameserver/model/location/SpawnLocation;
         4: iload_1
         5: i2l
         6: ldc           #163                // int -131072
         8: ldc           #164                // int 229375
        10: invokestatic  #165                // Method java/lang/Math.clamp:(JII)I
        13: iload_2
        14: i2l
        15: ldc           #171                // int -262144
        17: ldc           #172                // int 262143
        19: invokestatic  #165                // Method java/lang/Math.clamp:(JII)I
        22: iload_3
        23: invokevirtual #173                // Method ext/mods/gameserver/model/location/SpawnLocation.set:(III)V
        26: aload_0
        27: invokevirtual #176                // Method spawnMe:()V
        30: return
      LineNumberTable:
        line 187: 0
        line 189: 26
        line 190: 30
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      31     0  this   Lext/mods/gameserver/model/WorldObject;
            0      31     1     x   I
            0      31     2     y   I
            0      31     3     z   I

  public final void spawnMe(int, int, int, int);
    descriptor: (IIII)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=6, locals=5, args_size=5
         0: aload_0
         1: getfield      #12                 // Field _position:Lext/mods/gameserver/model/location/SpawnLocation;
         4: iload_1
         5: i2l
         6: ldc           #163                // int -131072
         8: ldc           #164                // int 229375
        10: invokestatic  #165                // Method java/lang/Math.clamp:(JII)I
        13: iload_2
        14: i2l
        15: ldc           #171                // int -262144
        17: ldc           #172                // int 262143
        19: invokestatic  #165                // Method java/lang/Math.clamp:(JII)I
        22: iload_3
        23: iload         4
        25: invokevirtual #178                // Method ext/mods/gameserver/model/location/SpawnLocation.set:(IIII)V
        28: aload_0
        29: invokevirtual #176                // Method spawnMe:()V
        32: return
      LineNumberTable:
        line 201: 0
        line 203: 28
        line 204: 32
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      33     0  this   Lext/mods/gameserver/model/WorldObject;
            0      33     1     x   I
            0      33     2     y   I
            0      33     3     z   I
            0      33     4 heading   I

  public final boolean isVisible();
    descriptor: ()Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #180                // Field _region:Lext/mods/gameserver/model/WorldRegion;
         4: ifnull        18
         7: aload_0
         8: getfield      #100                // Field _isVisible:Z
        11: ifeq          18
        14: iconst_1
        15: goto          19
        18: iconst_0
        19: ireturn
      LineNumberTable:
        line 211: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      20     0  this   Lext/mods/gameserver/model/WorldObject;
      StackMapTable: number_of_entries = 2
        frame_type = 18 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public final void setIsVisible(boolean);
    descriptor: (Z)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #100                // Field _isVisible:Z
         5: aload_0
         6: getfield      #100                // Field _isVisible:Z
         9: ifne          17
        12: aload_0
        13: aconst_null
        14: invokevirtual #108                // Method setRegion:(Lext/mods/gameserver/model/WorldRegion;)V
        17: return
      LineNumberTable:
        line 216: 0
        line 218: 5
        line 219: 12
        line 220: 17
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      18     0  this   Lext/mods/gameserver/model/WorldObject;
            0      18     1 value   Z
      StackMapTable: number_of_entries = 1
        frame_type = 17 /* same */

  public final java.lang.String getName();
    descriptor: ()Ljava/lang/String;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #184                // Field _name:Ljava/lang/String;
         4: areturn
      LineNumberTable:
        line 224: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/WorldObject;

  public void setName(java.lang.String);
    descriptor: (Ljava/lang/String;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: putfield      #184                // Field _name:Ljava/lang/String;
         5: return
      LineNumberTable:
        line 229: 0
        line 230: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/WorldObject;
            0       6     1 value   Ljava/lang/String;

  public final int getObjectId();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #31                 // Field _objectId:I
         4: ireturn
      LineNumberTable:
        line 234: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/WorldObject;

  public ext.mods.gameserver.model.actor.Player getActingPlayer();
    descriptor: ()Lext/mods/gameserver/model/actor/Player;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aconst_null
         1: areturn
      LineNumberTable:
        line 239: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/gameserver/model/WorldObject;

  public void sendInfo(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=0, locals=2, args_size=2
         0: return
      LineNumberTable:
        line 248: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       1     0  this   Lext/mods/gameserver/model/WorldObject;
            0       1     1 player   Lext/mods/gameserver/model/actor/Player;

  public boolean isChargedShot(ext.mods.gameserver.enums.items.ShotType);
    descriptor: (Lext/mods/gameserver/enums/items/ShotType;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=2, args_size=2
         0: iconst_0
         1: ireturn
      LineNumberTable:
        line 257: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/gameserver/model/WorldObject;
            0       2     1  type   Lext/mods/gameserver/enums/items/ShotType;

  public void setChargedShot(ext.mods.gameserver.enums.items.ShotType, boolean);
    descriptor: (Lext/mods/gameserver/enums/items/ShotType;Z)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=0, locals=3, args_size=3
         0: return
      LineNumberTable:
        line 267: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       1     0  this   Lext/mods/gameserver/model/WorldObject;
            0       1     1  type   Lext/mods/gameserver/enums/items/ShotType;
            0       1     2 charged   Z

  public void rechargeShots(boolean, boolean);
    descriptor: (ZZ)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=0, locals=3, args_size=3
         0: return
      LineNumberTable:
        line 276: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       1     0  this   Lext/mods/gameserver/model/WorldObject;
            0       1     1 physical   Z
            0       1     2 magical   Z

  public boolean isInsideZone(ext.mods.gameserver.enums.ZoneId);
    descriptor: (Lext/mods/gameserver/enums/ZoneId;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=2, args_size=2
         0: iconst_0
         1: ireturn
      LineNumberTable:
        line 285: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/gameserver/model/WorldObject;
            0       2     1  zone   Lext/mods/gameserver/enums/ZoneId;

  public final void setXYZ(int, int, int);
    descriptor: (III)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=4, locals=5, args_size=4
         0: aload_0
         1: getfield      #12                 // Field _position:Lext/mods/gameserver/model/location/SpawnLocation;
         4: iload_1
         5: iload_2
         6: iload_3
         7: invokevirtual #173                // Method ext/mods/gameserver/model/location/SpawnLocation.set:(III)V
        10: aload_0
        11: invokevirtual #188                // Method isVisible:()Z
        14: ifne          18
        17: return
        18: invokestatic  #79                 // Method ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
        21: aload_0
        22: getfield      #12                 // Field _position:Lext/mods/gameserver/model/location/SpawnLocation;
        25: invokevirtual #104                // Method ext/mods/gameserver/model/World.getRegion:(Lext/mods/gameserver/model/location/Location;)Lext/mods/gameserver/model/WorldRegion;
        28: astore        4
        30: aload         4
        32: aload_0
        33: getfield      #180                // Field _region:Lext/mods/gameserver/model/WorldRegion;
        36: if_acmpeq     45
        39: aload_0
        40: aload         4
        42: invokevirtual #108                // Method setRegion:(Lext/mods/gameserver/model/WorldRegion;)V
        45: return
      LineNumberTable:
        line 296: 0
        line 298: 10
        line 299: 17
        line 301: 18
        line 302: 30
        line 303: 39
        line 304: 45
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      46     0  this   Lext/mods/gameserver/model/WorldObject;
            0      46     1     x   I
            0      46     2     y   I
            0      46     3     z   I
           30      16     4 region   Lext/mods/gameserver/model/WorldRegion;
      StackMapTable: number_of_entries = 2
        frame_type = 18 /* same */
        frame_type = 252 /* append */
          offset_delta = 26
          locals = [ class ext/mods/gameserver/model/WorldRegion ]

  public final void setXYZ(ext.mods.gameserver.model.location.SpawnLocation);
    descriptor: (Lext/mods/gameserver/model/location/SpawnLocation;)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=3, args_size=2
         0: aload_0
         1: getfield      #12                 // Field _position:Lext/mods/gameserver/model/location/SpawnLocation;
         4: aload_1
         5: invokevirtual #192                // Method ext/mods/gameserver/model/location/SpawnLocation.set:(Lext/mods/gameserver/model/location/SpawnLocation;)V
         8: aload_0
         9: invokevirtual #188                // Method isVisible:()Z
        12: ifne          16
        15: return
        16: invokestatic  #79                 // Method ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
        19: aload_0
        20: getfield      #12                 // Field _position:Lext/mods/gameserver/model/location/SpawnLocation;
        23: invokevirtual #104                // Method ext/mods/gameserver/model/World.getRegion:(Lext/mods/gameserver/model/location/Location;)Lext/mods/gameserver/model/WorldRegion;
        26: astore_2
        27: aload_2
        28: aload_0
        29: getfield      #180                // Field _region:Lext/mods/gameserver/model/WorldRegion;
        32: if_acmpeq     40
        35: aload_0
        36: aload_2
        37: invokevirtual #108                // Method setRegion:(Lext/mods/gameserver/model/WorldRegion;)V
        40: return
      LineNumberTable:
        line 312: 0
        line 314: 8
        line 315: 15
        line 317: 16
        line 318: 27
        line 319: 35
        line 320: 40
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      41     0  this   Lext/mods/gameserver/model/WorldObject;
            0      41     1   loc   Lext/mods/gameserver/model/location/SpawnLocation;
           27      14     2 region   Lext/mods/gameserver/model/WorldRegion;
      StackMapTable: number_of_entries = 2
        frame_type = 16 /* same */
        frame_type = 252 /* append */
          offset_delta = 23
          locals = [ class ext/mods/gameserver/model/WorldRegion ]

  public final void setXYZ(ext.mods.gameserver.model.WorldObject);
    descriptor: (Lext/mods/gameserver/model/WorldObject;)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokevirtual #195                // Method getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
         5: invokevirtual #199                // Method setXYZ:(Lext/mods/gameserver/model/location/SpawnLocation;)V
         8: return
      LineNumberTable:
        line 328: 0
        line 329: 8
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       9     0  this   Lext/mods/gameserver/model/WorldObject;
            0       9     1 object   Lext/mods/gameserver/model/WorldObject;

  public final void setXYZInvisible(int, int, int);
    descriptor: (III)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=6, locals=4, args_size=4
         0: aload_0
         1: getfield      #12                 // Field _position:Lext/mods/gameserver/model/location/SpawnLocation;
         4: iload_1
         5: i2l
         6: ldc           #163                // int -131072
         8: ldc           #164                // int 229375
        10: invokestatic  #165                // Method java/lang/Math.clamp:(JII)I
        13: iload_2
        14: i2l
        15: ldc           #171                // int -262144
        17: ldc           #172                // int 262143
        19: invokestatic  #165                // Method java/lang/Math.clamp:(JII)I
        22: iload_3
        23: invokevirtual #173                // Method ext/mods/gameserver/model/location/SpawnLocation.set:(III)V
        26: aload_0
        27: iconst_0
        28: invokevirtual #75                 // Method setIsVisible:(Z)V
        31: return
      LineNumberTable:
        line 339: 0
        line 341: 26
        line 342: 31
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      32     0  this   Lext/mods/gameserver/model/WorldObject;
            0      32     1     x   I
            0      32     2     y   I
            0      32     3     z   I

  public final void setXYZInvisible(ext.mods.gameserver.model.location.Location);
    descriptor: (Lext/mods/gameserver/model/location/Location;)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=4, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokevirtual #118                // Method ext/mods/gameserver/model/location/Location.getX:()I
         5: aload_1
         6: invokevirtual #123                // Method ext/mods/gameserver/model/location/Location.getY:()I
         9: aload_1
        10: invokevirtual #126                // Method ext/mods/gameserver/model/location/Location.getZ:()I
        13: invokevirtual #202                // Method setXYZInvisible:(III)V
        16: return
      LineNumberTable:
        line 346: 0
        line 347: 16
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      17     0  this   Lext/mods/gameserver/model/WorldObject;
            0      17     1   loc   Lext/mods/gameserver/model/location/Location;

  public final int getX();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #12                 // Field _position:Lext/mods/gameserver/model/location/SpawnLocation;
         4: invokevirtual #135                // Method ext/mods/gameserver/model/location/SpawnLocation.getX:()I
         7: ireturn
      LineNumberTable:
        line 351: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/WorldObject;

  public final int getY();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #12                 // Field _position:Lext/mods/gameserver/model/location/SpawnLocation;
         4: invokevirtual #136                // Method ext/mods/gameserver/model/location/SpawnLocation.getY:()I
         7: ireturn
      LineNumberTable:
        line 356: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/WorldObject;

  public final int getZ();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #12                 // Field _position:Lext/mods/gameserver/model/location/SpawnLocation;
         4: invokevirtual #137                // Method ext/mods/gameserver/model/location/SpawnLocation.getZ:()I
         7: ireturn
      LineNumberTable:
        line 361: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/WorldObject;

  public final int getHeading();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #12                 // Field _position:Lext/mods/gameserver/model/location/SpawnLocation;
         4: invokevirtual #138                // Method ext/mods/gameserver/model/location/SpawnLocation.getHeading:()I
         7: ireturn
      LineNumberTable:
        line 366: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/WorldObject;

  public final ext.mods.gameserver.model.location.SpawnLocation getPosition();
    descriptor: ()Lext/mods/gameserver/model/location/SpawnLocation;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #12                 // Field _position:Lext/mods/gameserver/model/location/SpawnLocation;
         4: areturn
      LineNumberTable:
        line 371: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/WorldObject;

  public final ext.mods.gameserver.model.WorldRegion getRegion();
    descriptor: ()Lext/mods/gameserver/model/WorldRegion;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #180                // Field _region:Lext/mods/gameserver/model/WorldRegion;
         4: areturn
      LineNumberTable:
        line 376: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/WorldObject;

  public void setRegion(ext.mods.gameserver.model.WorldRegion);
    descriptor: (Lext/mods/gameserver/model/WorldRegion;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=8, args_size=2
         0: invokestatic  #205                // Method java/util/Collections.emptyList:()Ljava/util/List;
         3: astore_2
         4: aload_0
         5: getfield      #180                // Field _region:Lext/mods/gameserver/model/WorldRegion;
         8: ifnull        27
        11: aload_0
        12: getfield      #180                // Field _region:Lext/mods/gameserver/model/WorldRegion;
        15: aload_0
        16: invokevirtual #211                // Method ext/mods/gameserver/model/WorldRegion.removeVisibleObject:(Lext/mods/gameserver/model/WorldObject;)V
        19: aload_0
        20: getfield      #180                // Field _region:Lext/mods/gameserver/model/WorldRegion;
        23: invokevirtual #216                // Method ext/mods/gameserver/model/WorldRegion.getSurroundingRegions:()Ljava/util/List;
        26: astore_2
        27: invokestatic  #205                // Method java/util/Collections.emptyList:()Ljava/util/List;
        30: astore_3
        31: aload_1
        32: ifnull        45
        35: aload_1
        36: aload_0
        37: invokevirtual #219                // Method ext/mods/gameserver/model/WorldRegion.addVisibleObject:(Lext/mods/gameserver/model/WorldObject;)V
        40: aload_1
        41: invokevirtual #216                // Method ext/mods/gameserver/model/WorldRegion.getSurroundingRegions:()Ljava/util/List;
        44: astore_3
        45: aload_2
        46: invokeinterface #222,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
        51: astore        4
        53: aload         4
        55: invokeinterface #228,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        60: ifeq          169
        63: aload         4
        65: invokeinterface #233,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        70: checkcast     #212                // class ext/mods/gameserver/model/WorldRegion
        73: astore        5
        75: aload_3
        76: aload         5
        78: invokeinterface #237,  2          // InterfaceMethod java/util/List.contains:(Ljava/lang/Object;)Z
        83: ifne          166
        86: aload         5
        88: invokevirtual #241                // Method ext/mods/gameserver/model/WorldRegion.getZones:()Ljava/util/List;
        91: invokeinterface #222,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
        96: astore        6
        98: aload         6
       100: invokeinterface #228,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       105: ifeq          129
       108: aload         6
       110: invokeinterface #233,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       115: checkcast     #244                // class ext/mods/gameserver/model/zone/type/subtype/ZoneType
       118: astore        7
       120: aload         7
       122: aload_0
       123: invokevirtual #246                // Method ext/mods/gameserver/model/zone/type/subtype/ZoneType.removeKnownObject:(Lext/mods/gameserver/model/WorldObject;)V
       126: goto          98
       129: aload         5
       131: invokevirtual #249                // Method ext/mods/gameserver/model/WorldRegion.getObjects:()Ljava/util/Collection;
       134: aload_0
       135: invokedynamic #253,  0            // InvokeDynamic #1:accept:(Lext/mods/gameserver/model/WorldObject;)Ljava/util/function/Consumer;
       140: invokeinterface #257,  2          // InterfaceMethod java/util/Collection.forEach:(Ljava/util/function/Consumer;)V
       145: aload_0
       146: instanceof    #70                 // class ext/mods/gameserver/model/actor/Player
       149: ifeq          166
       152: aload         5
       154: invokevirtual #263                // Method ext/mods/gameserver/model/WorldRegion.isEmptyNeighborhood:()Z
       157: ifeq          166
       160: aload         5
       162: iconst_0
       163: invokevirtual #266                // Method ext/mods/gameserver/model/WorldRegion.setActive:(Z)V
       166: goto          53
       169: aload_3
       170: invokeinterface #222,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
       175: astore        4
       177: aload         4
       179: invokeinterface #228,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       184: ifeq          285
       187: aload         4
       189: invokeinterface #233,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       194: checkcast     #212                // class ext/mods/gameserver/model/WorldRegion
       197: astore        5
       199: aload_2
       200: aload         5
       202: invokeinterface #237,  2          // InterfaceMethod java/util/List.contains:(Ljava/lang/Object;)Z
       207: ifne          282
       210: aload         5
       212: invokevirtual #241                // Method ext/mods/gameserver/model/WorldRegion.getZones:()Ljava/util/List;
       215: invokeinterface #222,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
       220: astore        6
       222: aload         6
       224: invokeinterface #228,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       229: ifeq          253
       232: aload         6
       234: invokeinterface #233,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       239: checkcast     #244                // class ext/mods/gameserver/model/zone/type/subtype/ZoneType
       242: astore        7
       244: aload         7
       246: aload_0
       247: invokevirtual #269                // Method ext/mods/gameserver/model/zone/type/subtype/ZoneType.addKnownObject:(Lext/mods/gameserver/model/WorldObject;)V
       250: goto          222
       253: aload         5
       255: invokevirtual #249                // Method ext/mods/gameserver/model/WorldRegion.getObjects:()Ljava/util/Collection;
       258: aload_0
       259: invokedynamic #272,  0            // InvokeDynamic #2:accept:(Lext/mods/gameserver/model/WorldObject;)Ljava/util/function/Consumer;
       264: invokeinterface #257,  2          // InterfaceMethod java/util/Collection.forEach:(Ljava/util/function/Consumer;)V
       269: aload_0
       270: instanceof    #70                 // class ext/mods/gameserver/model/actor/Player
       273: ifeq          282
       276: aload         5
       278: iconst_1
       279: invokevirtual #266                // Method ext/mods/gameserver/model/WorldRegion.setActive:(Z)V
       282: goto          177
       285: aload_0
       286: aload_1
       287: putfield      #180                // Field _region:Lext/mods/gameserver/model/WorldRegion;
       290: aload_0
       291: invokevirtual #273                // Method refreshKnownList:()V
       294: return
      LineNumberTable:
        line 385: 0
        line 387: 4
        line 389: 11
        line 390: 19
        line 393: 27
        line 395: 31
        line 397: 35
        line 398: 40
        line 401: 45
        line 403: 75
        line 405: 86
        line 406: 120
        line 408: 129
        line 417: 145
        line 418: 160
        line 420: 166
        line 422: 169
        line 424: 199
        line 426: 210
        line 429: 244
        line 430: 250
        line 431: 253
        line 440: 269
        line 441: 276
        line 443: 282
        line 445: 285
        line 447: 290
        line 448: 294
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          120       6     7  zone   Lext/mods/gameserver/model/zone/type/subtype/ZoneType;
           75      91     5 region   Lext/mods/gameserver/model/WorldRegion;
          244       6     7  zone   Lext/mods/gameserver/model/zone/type/subtype/ZoneType;
          199      83     5 region   Lext/mods/gameserver/model/WorldRegion;
            0     295     0  this   Lext/mods/gameserver/model/WorldObject;
            0     295     1 newRegion   Lext/mods/gameserver/model/WorldRegion;
            4     291     2 oldAreas   Ljava/util/List;
           31     264     3 newAreas   Ljava/util/List;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            4     291     2 oldAreas   Ljava/util/List<Lext/mods/gameserver/model/WorldRegion;>;
           31     264     3 newAreas   Ljava/util/List<Lext/mods/gameserver/model/WorldRegion;>;
      StackMapTable: number_of_entries = 12
        frame_type = 252 /* append */
          offset_delta = 27
          locals = [ class java/util/List ]
        frame_type = 252 /* append */
          offset_delta = 17
          locals = [ class java/util/List ]
        frame_type = 252 /* append */
          offset_delta = 7
          locals = [ class java/util/Iterator ]
        frame_type = 253 /* append */
          offset_delta = 44
          locals = [ class ext/mods/gameserver/model/WorldRegion, class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 30
        frame_type = 250 /* chop */
          offset_delta = 36
        frame_type = 250 /* chop */
          offset_delta = 2
        frame_type = 252 /* append */
          offset_delta = 7
          locals = [ class java/util/Iterator ]
        frame_type = 253 /* append */
          offset_delta = 44
          locals = [ class ext/mods/gameserver/model/WorldRegion, class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 30
        frame_type = 250 /* chop */
          offset_delta = 28
        frame_type = 250 /* chop */
          offset_delta = 2

  public void refreshKnownList();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=5, args_size=1
         0: aload_0
         1: getfield      #180                // Field _region:Lext/mods/gameserver/model/WorldRegion;
         4: ifnonnull     8
         7: return
         8: aload_0
         9: getfield      #180                // Field _region:Lext/mods/gameserver/model/WorldRegion;
        12: invokevirtual #216                // Method ext/mods/gameserver/model/WorldRegion.getSurroundingRegions:()Ljava/util/List;
        15: invokeinterface #222,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
        20: astore_1
        21: aload_1
        22: invokeinterface #228,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        27: ifeq          131
        30: aload_1
        31: invokeinterface #233,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        36: checkcast     #212                // class ext/mods/gameserver/model/WorldRegion
        39: astore_2
        40: aload_2
        41: invokevirtual #249                // Method ext/mods/gameserver/model/WorldRegion.getObjects:()Ljava/util/Collection;
        44: invokeinterface #276,  1          // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
        49: astore_3
        50: aload_3
        51: invokeinterface #228,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        56: ifeq          128
        59: aload_3
        60: invokeinterface #233,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        65: checkcast     #13                 // class ext/mods/gameserver/model/WorldObject
        68: astore        4
        70: aload         4
        72: aload_0
        73: if_acmpeq     50
        76: aload         4
        78: instanceof    #277                // class ext/mods/gameserver/model/actor/instance/Door
        81: ifne          50
        84: aload         4
        86: instanceof    #279                // class ext/mods/gameserver/model/actor/instance/Fence
        89: ifeq          95
        92: goto          50
        95: aload_0
        96: invokevirtual #281                // Method getInstanceMap:()Lext/mods/InstanceMap/MapInstance;
        99: invokevirtual #285                // Method ext/mods/InstanceMap/MapInstance.getId:()I
       102: aload         4
       104: invokevirtual #281                // Method getInstanceMap:()Lext/mods/InstanceMap/MapInstance;
       107: invokevirtual #285                // Method ext/mods/InstanceMap/MapInstance.getId:()I
       110: if_icmpeq     125
       113: aload         4
       115: aload_0
       116: invokevirtual #290                // Method removeKnownObject:(Lext/mods/gameserver/model/WorldObject;)V
       119: aload_0
       120: aload         4
       122: invokevirtual #290                // Method removeKnownObject:(Lext/mods/gameserver/model/WorldObject;)V
       125: goto          50
       128: goto          21
       131: return
      LineNumberTable:
        line 452: 0
        line 453: 7
        line 455: 8
        line 457: 40
        line 459: 70
        line 460: 92
        line 462: 95
        line 464: 113
        line 465: 119
        line 467: 125
        line 468: 128
        line 469: 131
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           70      55     4   obj   Lext/mods/gameserver/model/WorldObject;
           40      88     2   reg   Lext/mods/gameserver/model/WorldRegion;
            0     132     0  this   Lext/mods/gameserver/model/WorldObject;
      StackMapTable: number_of_entries = 7
        frame_type = 8 /* same */
        frame_type = 252 /* append */
          offset_delta = 12
          locals = [ class java/util/Iterator ]
        frame_type = 253 /* append */
          offset_delta = 28
          locals = [ class ext/mods/gameserver/model/WorldRegion, class java/util/Iterator ]
        frame_type = 252 /* append */
          offset_delta = 44
          locals = [ class ext/mods/gameserver/model/WorldObject ]
        frame_type = 250 /* chop */
          offset_delta = 29
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 250 /* chop */
          offset_delta = 2

  public void addKnownObject(ext.mods.gameserver.model.WorldObject);
    descriptor: (Lext/mods/gameserver/model/WorldObject;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=0, locals=2, args_size=2
         0: return
      LineNumberTable:
        line 477: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       1     0  this   Lext/mods/gameserver/model/WorldObject;
            0       1     1 object   Lext/mods/gameserver/model/WorldObject;

  public void removeKnownObject(ext.mods.gameserver.model.WorldObject);
    descriptor: (Lext/mods/gameserver/model/WorldObject;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=0, locals=2, args_size=2
         0: return
      LineNumberTable:
        line 485: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       1     0  this   Lext/mods/gameserver/model/WorldObject;
            0       1     1 object   Lext/mods/gameserver/model/WorldObject;

  public boolean knows(ext.mods.gameserver.model.WorldObject);
    descriptor: (Lext/mods/gameserver/model/WorldObject;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=4, args_size=2
         0: aload_1
         1: ifnonnull     6
         4: iconst_0
         5: ireturn
         6: aload_0
         7: getfield      #180                // Field _region:Lext/mods/gameserver/model/WorldRegion;
        10: astore_2
        11: aload_2
        12: ifnonnull     17
        15: iconst_0
        16: ireturn
        17: aload_1
        18: invokevirtual #291                // Method getRegion:()Lext/mods/gameserver/model/WorldRegion;
        21: astore_3
        22: aload_3
        23: ifnonnull     28
        26: iconst_0
        27: ireturn
        28: aload_2
        29: invokevirtual #216                // Method ext/mods/gameserver/model/WorldRegion.getSurroundingRegions:()Ljava/util/List;
        32: aload_3
        33: invokeinterface #237,  2          // InterfaceMethod java/util/List.contains:(Ljava/lang/Object;)Z
        38: ireturn
      LineNumberTable:
        line 493: 0
        line 494: 4
        line 496: 6
        line 497: 11
        line 498: 15
        line 500: 17
        line 501: 22
        line 502: 26
        line 504: 28
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      39     0  this   Lext/mods/gameserver/model/WorldObject;
            0      39     1 target   Lext/mods/gameserver/model/WorldObject;
           11      28     2 region   Lext/mods/gameserver/model/WorldRegion;
           22      17     3 targetRegion   Lext/mods/gameserver/model/WorldRegion;
      StackMapTable: number_of_entries = 3
        frame_type = 6 /* same */
        frame_type = 252 /* append */
          offset_delta = 10
          locals = [ class ext/mods/gameserver/model/WorldRegion ]
        frame_type = 252 /* append */
          offset_delta = 10
          locals = [ class ext/mods/gameserver/model/WorldRegion ]

  public final <A extends ext.mods.gameserver.model.WorldObject> java.util.List<A> getKnownType(java.lang.Class<A>);
    descriptor: (Ljava/lang/Class;)Ljava/util/List;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=4, args_size=2
         0: aload_0
         1: getfield      #180                // Field _region:Lext/mods/gameserver/model/WorldRegion;
         4: astore_2
         5: aload_2
         6: ifnonnull     13
         9: invokestatic  #205                // Method java/util/Collections.emptyList:()Ljava/util/List;
        12: areturn
        13: new           #294                // class java/util/ArrayList
        16: dup
        17: invokespecial #296                // Method java/util/ArrayList."<init>":()V
        20: astore_3
        21: aload_3
        22: areturn
      LineNumberTable:
        line 515: 0
        line 516: 5
        line 517: 9
        line 519: 13
        line 522: 21
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      23     0  this   Lext/mods/gameserver/model/WorldObject;
            0      23     1  type   Ljava/lang/Class;
            5      18     2 region   Lext/mods/gameserver/model/WorldRegion;
           21       2     3 result   Ljava/util/List;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      23     1  type   Ljava/lang/Class<TA;>;
           21       2     3 result   Ljava/util/List<TA;>;
      StackMapTable: number_of_entries = 1
        frame_type = 252 /* append */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/model/WorldRegion ]
    Signature: #509                         // <A:Lext/mods/gameserver/model/WorldObject;>(Ljava/lang/Class<TA;>;)Ljava/util/List<TA;>;

  public <A extends ext.mods.gameserver.model.WorldObject> void forEachKnownType(java.lang.Class<A>, java.util.function.Consumer<A>);
    descriptor: (Ljava/lang/Class;Ljava/util/function/Consumer;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=4, args_size=3
         0: aload_0
         1: getfield      #180                // Field _region:Lext/mods/gameserver/model/WorldRegion;
         4: astore_3
         5: aload_3
         6: ifnonnull     10
         9: return
        10: aload_3
        11: aload_0
        12: aload_1
        13: aload_2
        14: invokedynamic #297,  0            // InvokeDynamic #3:accept:(Lext/mods/gameserver/model/WorldObject;Ljava/lang/Class;Ljava/util/function/Consumer;)Ljava/util/function/Consumer;
        19: invokevirtual #300                // Method ext/mods/gameserver/model/WorldRegion.forEachSurroundingRegion:(Ljava/util/function/Consumer;)V
        22: return
      LineNumberTable:
        line 533: 0
        line 534: 5
        line 535: 9
        line 537: 10
        line 538: 22
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      23     0  this   Lext/mods/gameserver/model/WorldObject;
            0      23     1  type   Ljava/lang/Class;
            0      23     2 action   Ljava/util/function/Consumer;
            5      18     3 region   Lext/mods/gameserver/model/WorldRegion;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      23     1  type   Ljava/lang/Class<TA;>;
            0      23     2 action   Ljava/util/function/Consumer<TA;>;
      StackMapTable: number_of_entries = 1
        frame_type = 252 /* append */
          offset_delta = 10
          locals = [ class ext/mods/gameserver/model/WorldRegion ]
    Signature: #515                         // <A:Lext/mods/gameserver/model/WorldObject;>(Ljava/lang/Class<TA;>;Ljava/util/function/Consumer<TA;>;)V

  public <A extends ext.mods.gameserver.model.WorldObject> void forEachKnownType(java.lang.Class<A>, java.util.function.Predicate<A>, java.util.function.Consumer<A>);
    descriptor: (Ljava/lang/Class;Ljava/util/function/Predicate;Ljava/util/function/Consumer;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=5, args_size=4
         0: aload_0
         1: getfield      #180                // Field _region:Lext/mods/gameserver/model/WorldRegion;
         4: astore        4
         6: aload         4
         8: ifnonnull     12
        11: return
        12: aload         4
        14: aload_0
        15: aload_1
        16: aload_2
        17: aload_3
        18: invokedynamic #303,  0            // InvokeDynamic #4:accept:(Lext/mods/gameserver/model/WorldObject;Ljava/lang/Class;Ljava/util/function/Predicate;Ljava/util/function/Consumer;)Ljava/util/function/Consumer;
        23: invokevirtual #300                // Method ext/mods/gameserver/model/WorldRegion.forEachSurroundingRegion:(Ljava/util/function/Consumer;)V
        26: return
      LineNumberTable:
        line 550: 0
        line 551: 6
        line 552: 11
        line 554: 12
        line 555: 26
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      27     0  this   Lext/mods/gameserver/model/WorldObject;
            0      27     1  type   Ljava/lang/Class;
            0      27     2 filter   Ljava/util/function/Predicate;
            0      27     3 action   Ljava/util/function/Consumer;
            6      21     4 region   Lext/mods/gameserver/model/WorldRegion;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      27     1  type   Ljava/lang/Class<TA;>;
            0      27     2 filter   Ljava/util/function/Predicate<TA;>;
            0      27     3 action   Ljava/util/function/Consumer<TA;>;
      StackMapTable: number_of_entries = 1
        frame_type = 252 /* append */
          offset_delta = 12
          locals = [ class ext/mods/gameserver/model/WorldRegion ]
    Signature: #520                         // <A:Lext/mods/gameserver/model/WorldObject;>(Ljava/lang/Class<TA;>;Ljava/util/function/Predicate<TA;>;Ljava/util/function/Consumer<TA;>;)V

  public final <A extends ext.mods.gameserver.model.WorldObject> java.util.List<A> getKnownType(java.lang.Class<A>, java.util.function.Predicate<A>);
    descriptor: (Ljava/lang/Class;Ljava/util/function/Predicate;)Ljava/util/List;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=5, locals=5, args_size=3
         0: aload_0
         1: getfield      #180                // Field _region:Lext/mods/gameserver/model/WorldRegion;
         4: astore_3
         5: aload_3
         6: ifnonnull     13
         9: invokestatic  #205                // Method java/util/Collections.emptyList:()Ljava/util/List;
        12: areturn
        13: new           #294                // class java/util/ArrayList
        16: dup
        17: invokespecial #296                // Method java/util/ArrayList."<init>":()V
        20: astore        4
        22: aload_3
        23: aload_0
        24: aload_1
        25: aload_2
        26: aload         4
        28: invokedynamic #306,  0            // InvokeDynamic #5:accept:(Lext/mods/gameserver/model/WorldObject;Ljava/lang/Class;Ljava/util/function/Predicate;Ljava/util/List;)Ljava/util/function/Consumer;
        33: invokevirtual #300                // Method ext/mods/gameserver/model/WorldRegion.forEachSurroundingRegion:(Ljava/util/function/Consumer;)V
        36: aload         4
        38: areturn
      LineNumberTable:
        line 567: 0
        line 568: 5
        line 569: 9
        line 571: 13
        line 573: 22
        line 575: 36
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      39     0  this   Lext/mods/gameserver/model/WorldObject;
            0      39     1  type   Ljava/lang/Class;
            0      39     2 filter   Ljava/util/function/Predicate;
            5      34     3 region   Lext/mods/gameserver/model/WorldRegion;
           22      17     4 result   Ljava/util/List;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      39     1  type   Ljava/lang/Class<TA;>;
            0      39     2 filter   Ljava/util/function/Predicate<TA;>;
           22      17     4 result   Ljava/util/List<TA;>;
      StackMapTable: number_of_entries = 1
        frame_type = 252 /* append */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/model/WorldRegion ]
    Signature: #522                         // <A:Lext/mods/gameserver/model/WorldObject;>(Ljava/lang/Class<TA;>;Ljava/util/function/Predicate<TA;>;)Ljava/util/List<TA;>;

  public <A extends ext.mods.gameserver.model.WorldObject> void forEachKnownTypeInRadius(java.lang.Class<A>, int, java.util.function.Consumer<A>);
    descriptor: (Ljava/lang/Class;ILjava/util/function/Consumer;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=6, args_size=4
         0: aload_0
         1: getfield      #180                // Field _region:Lext/mods/gameserver/model/WorldRegion;
         4: astore        4
         6: aload         4
         8: ifnonnull     12
        11: return
        12: iload_2
        13: sipush        2048
        16: if_icmpgt     23
        19: iconst_1
        20: goto          30
        23: iload_2
        24: sipush        2048
        27: idiv
        28: iconst_1
        29: iadd
        30: istore        5
        32: aload         4
        34: iload         5
        36: aload_0
        37: aload_1
        38: iload_2
        39: aload_3
        40: invokedynamic #309,  0            // InvokeDynamic #6:accept:(Lext/mods/gameserver/model/WorldObject;Ljava/lang/Class;ILjava/util/function/Consumer;)Ljava/util/function/Consumer;
        45: invokevirtual #312                // Method ext/mods/gameserver/model/WorldRegion.forEachRegion:(ILjava/util/function/Consumer;)V
        48: return
      LineNumberTable:
        line 588: 0
        line 589: 6
        line 590: 11
        line 592: 12
        line 594: 32
        line 595: 48
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      49     0  this   Lext/mods/gameserver/model/WorldObject;
            0      49     1  type   Ljava/lang/Class;
            0      49     2 radius   I
            0      49     3 action   Ljava/util/function/Consumer;
            6      43     4 region   Lext/mods/gameserver/model/WorldRegion;
           32      17     5 depth   I
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      49     1  type   Ljava/lang/Class<TA;>;
            0      49     3 action   Ljava/util/function/Consumer<TA;>;
      StackMapTable: number_of_entries = 3
        frame_type = 252 /* append */
          offset_delta = 12
          locals = [ class ext/mods/gameserver/model/WorldRegion ]
        frame_type = 10 /* same */
        frame_type = 70 /* same_locals_1_stack_item */
          stack = [ int ]
    Signature: #527                         // <A:Lext/mods/gameserver/model/WorldObject;>(Ljava/lang/Class<TA;>;ILjava/util/function/Consumer<TA;>;)V

  public final <A extends ext.mods.gameserver.model.WorldObject> java.util.List<A> getKnownTypeInRadius(java.lang.Class<A>, int);
    descriptor: (Ljava/lang/Class;I)Ljava/util/List;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=6, locals=6, args_size=3
         0: aload_0
         1: getfield      #180                // Field _region:Lext/mods/gameserver/model/WorldRegion;
         4: astore_3
         5: aload_3
         6: ifnonnull     13
         9: invokestatic  #205                // Method java/util/Collections.emptyList:()Ljava/util/List;
        12: areturn
        13: new           #294                // class java/util/ArrayList
        16: dup
        17: invokespecial #296                // Method java/util/ArrayList."<init>":()V
        20: astore        4
        22: iload_2
        23: sipush        2048
        26: if_icmpgt     33
        29: iconst_1
        30: goto          40
        33: iload_2
        34: sipush        2048
        37: idiv
        38: iconst_1
        39: iadd
        40: istore        5
        42: aload_3
        43: iload         5
        45: aload_0
        46: aload_1
        47: iload_2
        48: aload         4
        50: invokedynamic #316,  0            // InvokeDynamic #7:accept:(Lext/mods/gameserver/model/WorldObject;Ljava/lang/Class;ILjava/util/List;)Ljava/util/function/Consumer;
        55: invokevirtual #312                // Method ext/mods/gameserver/model/WorldRegion.forEachRegion:(ILjava/util/function/Consumer;)V
        58: aload         4
        60: areturn
      LineNumberTable:
        line 607: 0
        line 608: 5
        line 609: 9
        line 611: 13
        line 612: 22
        line 614: 42
        line 616: 58
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      61     0  this   Lext/mods/gameserver/model/WorldObject;
            0      61     1  type   Ljava/lang/Class;
            0      61     2 radius   I
            5      56     3 region   Lext/mods/gameserver/model/WorldRegion;
           22      39     4 result   Ljava/util/List;
           42      19     5 depth   I
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      61     1  type   Ljava/lang/Class<TA;>;
           22      39     4 result   Ljava/util/List<TA;>;
      StackMapTable: number_of_entries = 3
        frame_type = 252 /* append */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/model/WorldRegion ]
        frame_type = 252 /* append */
          offset_delta = 19
          locals = [ class java/util/List ]
        frame_type = 70 /* same_locals_1_stack_item */
          stack = [ int ]
    Signature: #530                         // <A:Lext/mods/gameserver/model/WorldObject;>(Ljava/lang/Class<TA;>;I)Ljava/util/List<TA;>;

  public <A extends ext.mods.gameserver.model.WorldObject> void forEachKnownTypeInRadius(java.lang.Class<A>, int, java.util.function.Predicate<A>, java.util.function.Consumer<A>);
    descriptor: (Ljava/lang/Class;ILjava/util/function/Predicate;Ljava/util/function/Consumer;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=7, locals=7, args_size=5
         0: aload_0
         1: getfield      #180                // Field _region:Lext/mods/gameserver/model/WorldRegion;
         4: astore        5
         6: aload         5
         8: ifnonnull     12
        11: return
        12: iload_2
        13: sipush        2048
        16: if_icmpgt     23
        19: iconst_1
        20: goto          30
        23: iload_2
        24: sipush        2048
        27: idiv
        28: iconst_1
        29: iadd
        30: istore        6
        32: aload         5
        34: iload         6
        36: aload_0
        37: aload_1
        38: iload_2
        39: aload_3
        40: aload         4
        42: invokedynamic #319,  0            // InvokeDynamic #8:accept:(Lext/mods/gameserver/model/WorldObject;Ljava/lang/Class;ILjava/util/function/Predicate;Ljava/util/function/Consumer;)Ljava/util/function/Consumer;
        47: invokevirtual #312                // Method ext/mods/gameserver/model/WorldRegion.forEachRegion:(ILjava/util/function/Consumer;)V
        50: return
      LineNumberTable:
        line 630: 0
        line 631: 6
        line 632: 11
        line 634: 12
        line 636: 32
        line 637: 50
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      51     0  this   Lext/mods/gameserver/model/WorldObject;
            0      51     1  type   Ljava/lang/Class;
            0      51     2 radius   I
            0      51     3 filter   Ljava/util/function/Predicate;
            0      51     4 action   Ljava/util/function/Consumer;
            6      45     5 region   Lext/mods/gameserver/model/WorldRegion;
           32      19     6 depth   I
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      51     1  type   Ljava/lang/Class<TA;>;
            0      51     3 filter   Ljava/util/function/Predicate<TA;>;
            0      51     4 action   Ljava/util/function/Consumer<TA;>;
      StackMapTable: number_of_entries = 3
        frame_type = 252 /* append */
          offset_delta = 12
          locals = [ class ext/mods/gameserver/model/WorldRegion ]
        frame_type = 10 /* same */
        frame_type = 70 /* same_locals_1_stack_item */
          stack = [ int ]
    Signature: #532                         // <A:Lext/mods/gameserver/model/WorldObject;>(Ljava/lang/Class<TA;>;ILjava/util/function/Predicate<TA;>;Ljava/util/function/Consumer<TA;>;)V

  public final <A extends ext.mods.gameserver.model.WorldObject> java.util.List<A> getKnownTypeInRadius(java.lang.Class<A>, int, java.util.function.Predicate<A>);
    descriptor: (Ljava/lang/Class;ILjava/util/function/Predicate;)Ljava/util/List;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=7, locals=7, args_size=4
         0: aload_0
         1: getfield      #180                // Field _region:Lext/mods/gameserver/model/WorldRegion;
         4: astore        4
         6: aload         4
         8: ifnonnull     15
        11: invokestatic  #205                // Method java/util/Collections.emptyList:()Ljava/util/List;
        14: areturn
        15: new           #294                // class java/util/ArrayList
        18: dup
        19: invokespecial #296                // Method java/util/ArrayList."<init>":()V
        22: astore        5
        24: iload_2
        25: sipush        2048
        28: if_icmpgt     35
        31: iconst_1
        32: goto          42
        35: iload_2
        36: sipush        2048
        39: idiv
        40: iconst_1
        41: iadd
        42: istore        6
        44: aload         4
        46: iload         6
        48: aload_0
        49: aload_1
        50: iload_2
        51: aload_3
        52: aload         5
        54: invokedynamic #322,  0            // InvokeDynamic #9:accept:(Lext/mods/gameserver/model/WorldObject;Ljava/lang/Class;ILjava/util/function/Predicate;Ljava/util/List;)Ljava/util/function/Consumer;
        59: invokevirtual #312                // Method ext/mods/gameserver/model/WorldRegion.forEachRegion:(ILjava/util/function/Consumer;)V
        62: aload         5
        64: areturn
      LineNumberTable:
        line 649: 0
        line 650: 6
        line 651: 11
        line 653: 15
        line 654: 24
        line 656: 44
        line 658: 62
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      65     0  this   Lext/mods/gameserver/model/WorldObject;
            0      65     1  type   Ljava/lang/Class;
            0      65     2 radius   I
            0      65     3 filter   Ljava/util/function/Predicate;
            6      59     4 region   Lext/mods/gameserver/model/WorldRegion;
           24      41     5 result   Ljava/util/List;
           44      21     6 depth   I
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      65     1  type   Ljava/lang/Class<TA;>;
            0      65     3 filter   Ljava/util/function/Predicate<TA;>;
           24      41     5 result   Ljava/util/List<TA;>;
      StackMapTable: number_of_entries = 3
        frame_type = 252 /* append */
          offset_delta = 15
          locals = [ class ext/mods/gameserver/model/WorldRegion ]
        frame_type = 252 /* append */
          offset_delta = 19
          locals = [ class java/util/List ]
        frame_type = 70 /* same_locals_1_stack_item */
          stack = [ int ]
    Signature: #534                         // <A:Lext/mods/gameserver/model/WorldObject;>(Ljava/lang/Class<TA;>;ILjava/util/function/Predicate<TA;>;)Ljava/util/List<TA;>;

  public final void refreshKnownlist();
    descriptor: ()V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=1
         0: aload_0
         1: getfield      #180                // Field _region:Lext/mods/gameserver/model/WorldRegion;
         4: astore_1
         5: aload_1
         6: ifnonnull     10
         9: return
        10: aload_1
        11: aload_0
        12: invokedynamic #325,  0            // InvokeDynamic #10:accept:(Lext/mods/gameserver/model/WorldObject;)Ljava/util/function/Consumer;
        17: invokevirtual #300                // Method ext/mods/gameserver/model/WorldRegion.forEachSurroundingRegion:(Ljava/util/function/Consumer;)V
        20: return
      LineNumberTable:
        line 666: 0
        line 667: 5
        line 668: 9
        line 670: 10
        line 678: 20
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      21     0  this   Lext/mods/gameserver/model/WorldObject;
            5      16     1 region   Lext/mods/gameserver/model/WorldRegion;
      StackMapTable: number_of_entries = 1
        frame_type = 252 /* append */
          offset_delta = 10
          locals = [ class ext/mods/gameserver/model/WorldRegion ]

  public final java.util.List<ext.mods.gameserver.model.zone.type.subtype.ZoneType> getZones(boolean);
    descriptor: (Z)Ljava/util/List;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=4, locals=6, args_size=2
         0: aload_0
         1: getfield      #180                // Field _region:Lext/mods/gameserver/model/WorldRegion;
         4: astore_2
         5: aload_2
         6: ifnonnull     13
         9: invokestatic  #205                // Method java/util/Collections.emptyList:()Ljava/util/List;
        12: areturn
        13: new           #294                // class java/util/ArrayList
        16: dup
        17: invokespecial #296                // Method java/util/ArrayList."<init>":()V
        20: astore_3
        21: aload_2
        22: invokevirtual #241                // Method ext/mods/gameserver/model/WorldRegion.getZones:()Ljava/util/List;
        25: invokeinterface #222,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
        30: astore        4
        32: aload         4
        34: invokeinterface #228,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        39: ifeq          96
        42: aload         4
        44: invokeinterface #233,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        49: checkcast     #244                // class ext/mods/gameserver/model/zone/type/subtype/ZoneType
        52: astore        5
        54: aload_3
        55: aload         5
        57: invokeinterface #237,  2          // InterfaceMethod java/util/List.contains:(Ljava/lang/Object;)Z
        62: ifeq          68
        65: goto          32
        68: iload_1
        69: ifeq          84
        72: aload         5
        74: aload_0
        75: invokevirtual #326                // Method ext/mods/gameserver/model/zone/type/subtype/ZoneType.isInsideZone:(Lext/mods/gameserver/model/WorldObject;)Z
        78: ifne          84
        81: goto          32
        84: aload_3
        85: aload         5
        87: invokeinterface #330,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        92: pop
        93: goto          32
        96: aload_2
        97: aload_0
        98: aload_3
        99: iload_1
       100: invokedynamic #333,  0            // InvokeDynamic #11:accept:(Lext/mods/gameserver/model/WorldObject;Ljava/util/List;Z)Ljava/util/function/Consumer;
       105: invokevirtual #300                // Method ext/mods/gameserver/model/WorldRegion.forEachSurroundingRegion:(Ljava/util/function/Consumer;)V
       108: aload_3
       109: areturn
      LineNumberTable:
        line 687: 0
        line 688: 5
        line 689: 9
        line 691: 13
        line 693: 21
        line 695: 54
        line 696: 65
        line 698: 68
        line 699: 81
        line 701: 84
        line 702: 93
        line 704: 96
        line 717: 108
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           54      39     5    zt   Lext/mods/gameserver/model/zone/type/subtype/ZoneType;
            0     110     0  this   Lext/mods/gameserver/model/WorldObject;
            0     110     1 checkIfInside   Z
            5     105     2 region   Lext/mods/gameserver/model/WorldRegion;
           21      89     3 zones   Ljava/util/List;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
           21      89     3 zones   Ljava/util/List<Lext/mods/gameserver/model/zone/type/subtype/ZoneType;>;
      StackMapTable: number_of_entries = 5
        frame_type = 252 /* append */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/model/WorldRegion ]
        frame_type = 253 /* append */
          offset_delta = 18
          locals = [ class java/util/List, class java/util/Iterator ]
        frame_type = 252 /* append */
          offset_delta = 35
          locals = [ class ext/mods/gameserver/model/zone/type/subtype/ZoneType ]
        frame_type = 15 /* same */
        frame_type = 249 /* chop */
          offset_delta = 11
    Signature: #541                         // (Z)Ljava/util/List<Lext/mods/gameserver/model/zone/type/subtype/ZoneType;>;

  public void onActiveRegion();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=0, locals=1, args_size=1
         0: return
      LineNumberTable:
        line 729: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       1     0  this   Lext/mods/gameserver/model/WorldObject;

  public void onInactiveRegion();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=0, locals=1, args_size=1
         0: return
      LineNumberTable:
        line 740: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       1     0  this   Lext/mods/gameserver/model/WorldObject;

  public final boolean isIn3DRadius(ext.mods.gameserver.model.WorldObject, int);
    descriptor: (Lext/mods/gameserver/model/WorldObject;I)Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: getfield      #12                 // Field _position:Lext/mods/gameserver/model/location/SpawnLocation;
         4: aload_1
         5: invokevirtual #195                // Method getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
         8: iload_2
         9: invokevirtual #336                // Method ext/mods/gameserver/model/location/SpawnLocation.isIn3DRadius:(Lext/mods/gameserver/model/location/Location;I)Z
        12: ireturn
      LineNumberTable:
        line 749: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      13     0  this   Lext/mods/gameserver/model/WorldObject;
            0      13     1 object   Lext/mods/gameserver/model/WorldObject;
            0      13     2 radius   I

  public final boolean isIn3DRadius(ext.mods.gameserver.model.location.Location, int);
    descriptor: (Lext/mods/gameserver/model/location/Location;I)Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: getfield      #12                 // Field _position:Lext/mods/gameserver/model/location/SpawnLocation;
         4: aload_1
         5: iload_2
         6: invokevirtual #336                // Method ext/mods/gameserver/model/location/SpawnLocation.isIn3DRadius:(Lext/mods/gameserver/model/location/Location;I)Z
         9: ireturn
      LineNumberTable:
        line 759: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/gameserver/model/WorldObject;
            0      10     1   loc   Lext/mods/gameserver/model/location/Location;
            0      10     2 radius   I

  public final boolean isIn3DRadius(int, int, int, int);
    descriptor: (IIII)Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=5, locals=5, args_size=5
         0: aload_0
         1: getfield      #12                 // Field _position:Lext/mods/gameserver/model/location/SpawnLocation;
         4: iload_1
         5: iload_2
         6: iload_3
         7: iload         4
         9: invokevirtual #340                // Method ext/mods/gameserver/model/location/SpawnLocation.isIn3DRadius:(IIII)Z
        12: ireturn
      LineNumberTable:
        line 771: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      13     0  this   Lext/mods/gameserver/model/WorldObject;
            0      13     1     x   I
            0      13     2     y   I
            0      13     3     z   I
            0      13     4 radius   I

  public final double distance3D(ext.mods.gameserver.model.WorldObject);
    descriptor: (Lext/mods/gameserver/model/WorldObject;)D
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #12                 // Field _position:Lext/mods/gameserver/model/location/SpawnLocation;
         4: aload_1
         5: invokevirtual #195                // Method getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
         8: invokevirtual #343                // Method ext/mods/gameserver/model/location/SpawnLocation.distance3D:(Lext/mods/gameserver/model/location/Location;)D
        11: dreturn
      LineNumberTable:
        line 780: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/gameserver/model/WorldObject;
            0      12     1 object   Lext/mods/gameserver/model/WorldObject;

  public final double distance3D(ext.mods.gameserver.model.location.Location);
    descriptor: (Lext/mods/gameserver/model/location/Location;)D
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #12                 // Field _position:Lext/mods/gameserver/model/location/SpawnLocation;
         4: aload_1
         5: invokevirtual #343                // Method ext/mods/gameserver/model/location/SpawnLocation.distance3D:(Lext/mods/gameserver/model/location/Location;)D
         8: dreturn
      LineNumberTable:
        line 789: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       9     0  this   Lext/mods/gameserver/model/WorldObject;
            0       9     1   loc   Lext/mods/gameserver/model/location/Location;

  public final boolean isIn2DRadius(ext.mods.gameserver.model.WorldObject, int);
    descriptor: (Lext/mods/gameserver/model/WorldObject;I)Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: getfield      #12                 // Field _position:Lext/mods/gameserver/model/location/SpawnLocation;
         4: aload_1
         5: invokevirtual #195                // Method getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
         8: iload_2
         9: invokevirtual #347                // Method ext/mods/gameserver/model/location/SpawnLocation.isIn2DRadius:(Lext/mods/gameserver/model/location/Point2D;I)Z
        12: ireturn
      LineNumberTable:
        line 799: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      13     0  this   Lext/mods/gameserver/model/WorldObject;
            0      13     1 object   Lext/mods/gameserver/model/WorldObject;
            0      13     2 radius   I

  public final boolean isIn2DRadius(ext.mods.gameserver.model.location.Location, int);
    descriptor: (Lext/mods/gameserver/model/location/Location;I)Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: getfield      #12                 // Field _position:Lext/mods/gameserver/model/location/SpawnLocation;
         4: aload_1
         5: iload_2
         6: invokevirtual #347                // Method ext/mods/gameserver/model/location/SpawnLocation.isIn2DRadius:(Lext/mods/gameserver/model/location/Point2D;I)Z
         9: ireturn
      LineNumberTable:
        line 809: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/gameserver/model/WorldObject;
            0      10     1   loc   Lext/mods/gameserver/model/location/Location;
            0      10     2 radius   I

  public final boolean isIn2DRadius(int, int, int);
    descriptor: (III)Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=4, locals=4, args_size=4
         0: aload_0
         1: getfield      #12                 // Field _position:Lext/mods/gameserver/model/location/SpawnLocation;
         4: iload_1
         5: iload_2
         6: iload_3
         7: invokevirtual #351                // Method ext/mods/gameserver/model/location/SpawnLocation.isIn2DRadius:(III)Z
        10: ireturn
      LineNumberTable:
        line 820: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      11     0  this   Lext/mods/gameserver/model/WorldObject;
            0      11     1     x   I
            0      11     2     y   I
            0      11     3 radius   I

  public final double distance2D(ext.mods.gameserver.model.WorldObject);
    descriptor: (Lext/mods/gameserver/model/WorldObject;)D
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #12                 // Field _position:Lext/mods/gameserver/model/location/SpawnLocation;
         4: aload_1
         5: invokevirtual #195                // Method getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
         8: invokevirtual #354                // Method ext/mods/gameserver/model/location/SpawnLocation.distance2D:(Lext/mods/gameserver/model/location/Point2D;)D
        11: dreturn
      LineNumberTable:
        line 829: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/gameserver/model/WorldObject;
            0      12     1 object   Lext/mods/gameserver/model/WorldObject;

  public final double distance2D(ext.mods.gameserver.model.location.Location);
    descriptor: (Lext/mods/gameserver/model/location/Location;)D
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #12                 // Field _position:Lext/mods/gameserver/model/location/SpawnLocation;
         4: aload_1
         5: invokevirtual #354                // Method ext/mods/gameserver/model/location/SpawnLocation.distance2D:(Lext/mods/gameserver/model/location/Point2D;)D
         8: dreturn
      LineNumberTable:
        line 838: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       9     0  this   Lext/mods/gameserver/model/WorldObject;
            0       9     1   loc   Lext/mods/gameserver/model/location/Location;

  public final boolean isBehind(ext.mods.gameserver.model.WorldObject);
    descriptor: (Lext/mods/gameserver/model/WorldObject;)Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #12                 // Field _position:Lext/mods/gameserver/model/location/SpawnLocation;
         4: aload_1
         5: invokevirtual #358                // Method ext/mods/gameserver/model/location/SpawnLocation.isBehind:(Lext/mods/gameserver/model/WorldObject;)Z
         8: ireturn
      LineNumberTable:
        line 847: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       9     0  this   Lext/mods/gameserver/model/WorldObject;
            0       9     1 target   Lext/mods/gameserver/model/WorldObject;

  public final boolean isInFrontOf(ext.mods.gameserver.model.WorldObject);
    descriptor: (Lext/mods/gameserver/model/WorldObject;)Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #12                 // Field _position:Lext/mods/gameserver/model/location/SpawnLocation;
         4: aload_1
         5: invokevirtual #361                // Method ext/mods/gameserver/model/location/SpawnLocation.isInFrontOf:(Lext/mods/gameserver/model/WorldObject;)Z
         8: ireturn
      LineNumberTable:
        line 856: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       9     0  this   Lext/mods/gameserver/model/WorldObject;
            0       9     1 target   Lext/mods/gameserver/model/WorldObject;

  public final boolean isFacing(ext.mods.gameserver.model.WorldObject, int);
    descriptor: (Lext/mods/gameserver/model/WorldObject;I)Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: getfield      #12                 // Field _position:Lext/mods/gameserver/model/location/SpawnLocation;
         4: aload_1
         5: iload_2
         6: invokevirtual #364                // Method ext/mods/gameserver/model/location/SpawnLocation.isFacing:(Lext/mods/gameserver/model/WorldObject;I)Z
         9: ireturn
      LineNumberTable:
        line 866: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/gameserver/model/WorldObject;
            0      10     1 target   Lext/mods/gameserver/model/WorldObject;
            0      10     2 maxAngle   I

  public void onInteract(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=0, locals=2, args_size=2
         0: return
      LineNumberTable:
        line 875: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       1     0  this   Lext/mods/gameserver/model/WorldObject;
            0       1     1 player   Lext/mods/gameserver/model/actor/Player;

  public ext.mods.gameserver.model.actor.instance.Monster getMonster();
    descriptor: ()Lext/mods/gameserver/model/actor/instance/Monster;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aconst_null
         1: areturn
      LineNumberTable:
        line 879: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/gameserver/model/WorldObject;

  public boolean isVisibleTo(ext.mods.gameserver.model.WorldObject);
    descriptor: (Lext/mods/gameserver/model/WorldObject;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=2, args_size=2
         0: iconst_1
         1: ireturn
      LineNumberTable:
        line 884: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/gameserver/model/WorldObject;
            0       2     1   obj   Lext/mods/gameserver/model/WorldObject;

  public boolean getTownZone();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #368                // Field _townZone:Z
         4: ireturn
      LineNumberTable:
        line 889: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/WorldObject;

  public void setTownZone(boolean);
    descriptor: (Z)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #368                // Field _townZone:Z
         5: return
      LineNumberTable:
        line 894: 0
        line 895: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/WorldObject;
            0       6     1   val   Z

  public boolean isInStrictRadius(ext.mods.gameserver.model.WorldObject, int);
    descriptor: (Lext/mods/gameserver/model/WorldObject;I)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=7, args_size=3
         0: dconst_0
         1: dstore_3
         2: aload_0
         3: astore        6
         5: aload         6
         7: instanceof    #371                // class ext/mods/gameserver/model/actor/Creature
        10: ifeq          28
        13: aload         6
        15: checkcast     #371                // class ext/mods/gameserver/model/actor/Creature
        18: astore        5
        20: dload_3
        21: aload         5
        23: invokevirtual #373                // Method ext/mods/gameserver/model/actor/Creature.getCollisionRadius:()D
        26: dadd
        27: dstore_3
        28: aload_1
        29: instanceof    #371                // class ext/mods/gameserver/model/actor/Creature
        32: ifeq          49
        35: aload_1
        36: checkcast     #371                // class ext/mods/gameserver/model/actor/Creature
        39: astore        5
        41: dload_3
        42: aload         5
        44: invokevirtual #373                // Method ext/mods/gameserver/model/actor/Creature.getCollisionRadius:()D
        47: dadd
        48: dstore_3
        49: aload_0
        50: aload_1
        51: invokevirtual #377                // Method distance3D:(Lext/mods/gameserver/model/WorldObject;)D
        54: iload_2
        55: i2d
        56: dload_3
        57: dadd
        58: dcmpg
        59: ifge          66
        62: iconst_1
        63: goto          67
        66: iconst_0
        67: ireturn
      LineNumberTable:
        line 904: 0
        line 905: 2
        line 906: 20
        line 908: 28
        line 909: 41
        line 911: 49
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           20       8     5 creature   Lext/mods/gameserver/model/actor/Creature;
           41       8     5 creature   Lext/mods/gameserver/model/actor/Creature;
            0      68     0  this   Lext/mods/gameserver/model/WorldObject;
            0      68     1   obj   Lext/mods/gameserver/model/WorldObject;
            0      68     2 radius   I
            2      66     3 totalRadius   D
      StackMapTable: number_of_entries = 4
        frame_type = 252 /* append */
          offset_delta = 28
          locals = [ double ]
        frame_type = 20 /* same */
        frame_type = 16 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public boolean isInStrictRadius(ext.mods.gameserver.model.location.Location, int);
    descriptor: (Lext/mods/gameserver/model/location/Location;I)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=7, args_size=3
         0: dconst_0
         1: dstore_3
         2: aload_0
         3: astore        6
         5: aload         6
         7: instanceof    #371                // class ext/mods/gameserver/model/actor/Creature
        10: ifeq          28
        13: aload         6
        15: checkcast     #371                // class ext/mods/gameserver/model/actor/Creature
        18: astore        5
        20: dload_3
        21: aload         5
        23: invokevirtual #373                // Method ext/mods/gameserver/model/actor/Creature.getCollisionRadius:()D
        26: dadd
        27: dstore_3
        28: aload_0
        29: aload_1
        30: invokevirtual #380                // Method distance3D:(Lext/mods/gameserver/model/location/Location;)D
        33: iload_2
        34: i2d
        35: dload_3
        36: dadd
        37: dcmpg
        38: ifge          45
        41: iconst_1
        42: goto          46
        45: iconst_0
        46: ireturn
      LineNumberTable:
        line 921: 0
        line 922: 2
        line 923: 20
        line 925: 28
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           20       8     5 creature   Lext/mods/gameserver/model/actor/Creature;
            0      47     0  this   Lext/mods/gameserver/model/WorldObject;
            0      47     1   loc   Lext/mods/gameserver/model/location/Location;
            0      47     2 radius   I
            2      45     3 totalRadius   D
      StackMapTable: number_of_entries = 3
        frame_type = 252 /* append */
          offset_delta = 28
          locals = [ double ]
        frame_type = 16 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public ext.mods.InstanceMap.MapInstance getInstanceMap();
    descriptor: ()Lext/mods/InstanceMap/MapInstance;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #27                 // Field _instance:Lext/mods/InstanceMap/MapInstance;
         4: areturn
      LineNumberTable:
        line 932: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/WorldObject;

  public boolean isSameInstanceMap(ext.mods.gameserver.model.WorldObject);
    descriptor: (Lext/mods/gameserver/model/WorldObject;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: invokevirtual #281                // Method getInstanceMap:()Lext/mods/InstanceMap/MapInstance;
         4: invokevirtual #285                // Method ext/mods/InstanceMap/MapInstance.getId:()I
         7: aload_1
         8: invokevirtual #281                // Method getInstanceMap:()Lext/mods/InstanceMap/MapInstance;
        11: invokevirtual #285                // Method ext/mods/InstanceMap/MapInstance.getId:()I
        14: if_icmpne     21
        17: iconst_1
        18: goto          22
        21: iconst_0
        22: ireturn
      LineNumberTable:
        line 937: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      23     0  this   Lext/mods/gameserver/model/WorldObject;
            0      23     1 other   Lext/mods/gameserver/model/WorldObject;
      StackMapTable: number_of_entries = 2
        frame_type = 21 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public void setInstanceMap(ext.mods.InstanceMap.MapInstance, boolean);
    descriptor: (Lext/mods/InstanceMap/MapInstance;Z)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: putfield      #27                 // Field _instance:Lext/mods/InstanceMap/MapInstance;
         5: iload_2
         6: ifne          17
         9: aload_0
        10: invokevirtual #381                // Method decayMe:()V
        13: aload_0
        14: invokevirtual #176                // Method spawnMe:()V
        17: return
      LineNumberTable:
        line 942: 0
        line 944: 5
        line 946: 9
        line 947: 13
        line 949: 17
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      18     0  this   Lext/mods/gameserver/model/WorldObject;
            0      18     1 instance   Lext/mods/InstanceMap/MapInstance;
            0      18     2 silent   Z
      StackMapTable: number_of_entries = 1
        frame_type = 17 /* same */

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=3, locals=0, args_size=0
         0: new           #420                // class ext/mods/commons/logging/CLogger
         3: dup
         4: ldc           #13                 // class ext/mods/gameserver/model/WorldObject
         6: invokevirtual #422                // Method java/lang/Class.getName:()Ljava/lang/String;
         9: invokespecial #425                // Method ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
        12: putstatic     #428                // Field LOGGER:Lext/mods/commons/logging/CLogger;
        15: return
      LineNumberTable:
        line 52: 0
}
SourceFile: "WorldObject.java"
BootstrapMethods:
  0: #664 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #598 \u0001 [objId=\u0001]
  1: #670 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #600 (Ljava/lang/Object;)V
      #602 REF_invokeVirtual ext/mods/gameserver/model/WorldObject.lambda$setRegion$0:(Lext/mods/gameserver/model/WorldObject;)V
      #605 (Lext/mods/gameserver/model/WorldObject;)V
  2: #670 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #600 (Ljava/lang/Object;)V
      #606 REF_invokeVirtual ext/mods/gameserver/model/WorldObject.lambda$setRegion$1:(Lext/mods/gameserver/model/WorldObject;)V
      #605 (Lext/mods/gameserver/model/WorldObject;)V
  3: #670 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #600 (Ljava/lang/Object;)V
      #609 REF_invokeVirtual ext/mods/gameserver/model/WorldObject.lambda$forEachKnownType$0:(Ljava/lang/Class;Ljava/util/function/Consumer;Lext/mods/gameserver/model/WorldRegion;)V
      #612 (Lext/mods/gameserver/model/WorldRegion;)V
  4: #670 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #600 (Ljava/lang/Object;)V
      #613 REF_invokeVirtual ext/mods/gameserver/model/WorldObject.lambda$forEachKnownType$2:(Ljava/lang/Class;Ljava/util/function/Predicate;Ljava/util/function/Consumer;Lext/mods/gameserver/model/WorldRegion;)V
      #612 (Lext/mods/gameserver/model/WorldRegion;)V
  5: #670 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #600 (Ljava/lang/Object;)V
      #616 REF_invokeVirtual ext/mods/gameserver/model/WorldObject.lambda$getKnownType$0:(Ljava/lang/Class;Ljava/util/function/Predicate;Ljava/util/List;Lext/mods/gameserver/model/WorldRegion;)V
      #612 (Lext/mods/gameserver/model/WorldRegion;)V
  6: #670 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #600 (Ljava/lang/Object;)V
      #619 REF_invokeVirtual ext/mods/gameserver/model/WorldObject.lambda$forEachKnownTypeInRadius$0:(Ljava/lang/Class;ILjava/util/function/Consumer;Lext/mods/gameserver/model/WorldRegion;)V
      #612 (Lext/mods/gameserver/model/WorldRegion;)V
  7: #670 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #600 (Ljava/lang/Object;)V
      #622 REF_invokeVirtual ext/mods/gameserver/model/WorldObject.lambda$getKnownTypeInRadius$0:(Ljava/lang/Class;ILjava/util/List;Lext/mods/gameserver/model/WorldRegion;)V
      #612 (Lext/mods/gameserver/model/WorldRegion;)V
  8: #670 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #600 (Ljava/lang/Object;)V
      #625 REF_invokeVirtual ext/mods/gameserver/model/WorldObject.lambda$forEachKnownTypeInRadius$2:(Ljava/lang/Class;ILjava/util/function/Predicate;Ljava/util/function/Consumer;Lext/mods/gameserver/model/WorldRegion;)V
      #612 (Lext/mods/gameserver/model/WorldRegion;)V
  9: #670 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #600 (Ljava/lang/Object;)V
      #628 REF_invokeVirtual ext/mods/gameserver/model/WorldObject.lambda$getKnownTypeInRadius$2:(Ljava/lang/Class;ILjava/util/function/Predicate;Ljava/util/List;Lext/mods/gameserver/model/WorldRegion;)V
      #612 (Lext/mods/gameserver/model/WorldRegion;)V
  10: #670 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #600 (Ljava/lang/Object;)V
      #631 REF_invokeVirtual ext/mods/gameserver/model/WorldObject.lambda$refreshKnownlist$0:(Lext/mods/gameserver/model/WorldRegion;)V
      #612 (Lext/mods/gameserver/model/WorldRegion;)V
  11: #670 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #600 (Ljava/lang/Object;)V
      #634 REF_invokeVirtual ext/mods/gameserver/model/WorldObject.lambda$getZones$0:(Ljava/util/List;ZLext/mods/gameserver/model/WorldRegion;)V
      #612 (Lext/mods/gameserver/model/WorldRegion;)V
  12: #670 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #600 (Ljava/lang/Object;)V
      #637 REF_invokeVirtual ext/mods/gameserver/model/WorldObject.lambda$refreshKnownlist$1:(Lext/mods/gameserver/model/WorldObject;)V
      #605 (Lext/mods/gameserver/model/WorldObject;)V
  13: #670 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #640 (Ljava/lang/Object;)Z
      #641 REF_invokeVirtual ext/mods/gameserver/model/WorldObject.lambda$getKnownTypeInRadius$3:(ILjava/util/function/Predicate;Lext/mods/gameserver/model/WorldObject;)Z
      #644 (Lext/mods/gameserver/model/WorldObject;)Z
  14: #670 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #600 (Ljava/lang/Object;)V
      #645 REF_invokeInterface java/util/List.add:(Ljava/lang/Object;)Z
      #605 (Lext/mods/gameserver/model/WorldObject;)V
  15: #670 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #640 (Ljava/lang/Object;)Z
      #646 REF_invokeVirtual ext/mods/gameserver/model/WorldObject.lambda$forEachKnownTypeInRadius$3:(ILjava/util/function/Predicate;Lext/mods/gameserver/model/WorldObject;)Z
      #644 (Lext/mods/gameserver/model/WorldObject;)Z
  16: #670 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #640 (Ljava/lang/Object;)Z
      #649 REF_invokeVirtual ext/mods/gameserver/model/WorldObject.lambda$getKnownTypeInRadius$1:(ILext/mods/gameserver/model/WorldObject;)Z
      #644 (Lext/mods/gameserver/model/WorldObject;)Z
  17: #670 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #640 (Ljava/lang/Object;)Z
      #652 REF_invokeVirtual ext/mods/gameserver/model/WorldObject.lambda$forEachKnownTypeInRadius$1:(ILext/mods/gameserver/model/WorldObject;)Z
      #644 (Lext/mods/gameserver/model/WorldObject;)Z
  18: #670 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #640 (Ljava/lang/Object;)Z
      #655 REF_invokeVirtual ext/mods/gameserver/model/WorldObject.lambda$getKnownType$1:(Ljava/util/function/Predicate;Lext/mods/gameserver/model/WorldObject;)Z
      #644 (Lext/mods/gameserver/model/WorldObject;)Z
  19: #670 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #640 (Ljava/lang/Object;)Z
      #658 REF_invokeVirtual ext/mods/gameserver/model/WorldObject.lambda$forEachKnownType$3:(Ljava/util/function/Predicate;Lext/mods/gameserver/model/WorldObject;)Z
      #644 (Lext/mods/gameserver/model/WorldObject;)Z
  20: #670 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #640 (Ljava/lang/Object;)Z
      #661 REF_invokeVirtual ext/mods/gameserver/model/WorldObject.lambda$forEachKnownType$1:(Lext/mods/gameserver/model/WorldObject;)Z
      #644 (Lext/mods/gameserver/model/WorldObject;)Z
InnerClasses:
  public static final #682= #678 of #680; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
