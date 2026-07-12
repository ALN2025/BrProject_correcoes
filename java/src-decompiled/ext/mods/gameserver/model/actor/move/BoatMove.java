// Bytecode for: ext.mods.gameserver.model.actor.move.BoatMove
// File: ext\mods\gameserver\model\actor\move\BoatMove.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/actor/move/BoatMove.class
  Last modified 9 de jul de 2026; size 7696 bytes
  MD5 checksum 1e01d4e6626f5b05461caf71457b1b03
  Compiled from "BoatMove.kt"
public final class ext.mods.gameserver.model.actor.move.BoatMove extends ext.mods.gameserver.model.actor.move.CreatureMove<ext.mods.gameserver.model.actor.Boat>
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #2                          // ext/mods/gameserver/model/actor/move/BoatMove
  super_class: #5                         // ext/mods/gameserver/model/actor/move/CreatureMove
  interfaces: 0, fields: 3, methods: 12, attributes: 6
Constant pool:
    #1 = Utf8               ext/mods/gameserver/model/actor/move/BoatMove
    #2 = Class              #1            // ext/mods/gameserver/model/actor/move/BoatMove
    #3 = Utf8               Lext/mods/gameserver/model/actor/move/CreatureMove<Lext/mods/gameserver/model/actor/Boat;>;
    #4 = Utf8               ext/mods/gameserver/model/actor/move/CreatureMove
    #5 = Class              #4            // ext/mods/gameserver/model/actor/move/CreatureMove
    #6 = Utf8               <init>
    #7 = Utf8               (Lext/mods/gameserver/model/actor/Boat;)V
    #8 = Utf8               Lorg/jetbrains/annotations/NotNull;
    #9 = Utf8               ext/mods/gameserver/model/actor/Creature
   #10 = Class              #9            // ext/mods/gameserver/model/actor/Creature
   #11 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)V
   #12 = NameAndType        #6:#11        // "<init>":(Lext/mods/gameserver/model/actor/Creature;)V
   #13 = Methodref          #5.#12        // ext/mods/gameserver/model/actor/move/CreatureMove."<init>":(Lext/mods/gameserver/model/actor/Creature;)V
   #14 = Utf8               ext/mods/gameserver/enums/actors/MoveType
   #15 = Class              #14           // ext/mods/gameserver/enums/actors/MoveType
   #16 = Utf8               FLY
   #17 = Utf8               Lext/mods/gameserver/enums/actors/MoveType;
   #18 = NameAndType        #16:#17       // FLY:Lext/mods/gameserver/enums/actors/MoveType;
   #19 = Fieldref           #15.#18       // ext/mods/gameserver/enums/actors/MoveType.FLY:Lext/mods/gameserver/enums/actors/MoveType;
   #20 = Utf8               addMoveType
   #21 = Utf8               (Lext/mods/gameserver/enums/actors/MoveType;)V
   #22 = NameAndType        #20:#21       // addMoveType:(Lext/mods/gameserver/enums/actors/MoveType;)V
   #23 = Methodref          #2.#22        // ext/mods/gameserver/model/actor/move/BoatMove.addMoveType:(Lext/mods/gameserver/enums/actors/MoveType;)V
   #24 = Utf8               this
   #25 = Utf8               Lext/mods/gameserver/model/actor/move/BoatMove;
   #26 = Utf8               actor
   #27 = Utf8               Lext/mods/gameserver/model/actor/Boat;
   #28 = Utf8               stop
   #29 = Utf8               ()V
   #30 = Utf8               cancelMoveTask
   #31 = NameAndType        #30:#29       // cancelMoveTask:()V
   #32 = Methodref          #2.#31        // ext/mods/gameserver/model/actor/move/BoatMove.cancelMoveTask:()V
   #33 = Utf8               _actor
   #34 = Utf8               Lext/mods/gameserver/model/actor/Creature;
   #35 = NameAndType        #33:#34       // _actor:Lext/mods/gameserver/model/actor/Creature;
   #36 = Fieldref           #2.#35        // ext/mods/gameserver/model/actor/move/BoatMove._actor:Lext/mods/gameserver/model/actor/Creature;
   #37 = Utf8               ext/mods/gameserver/model/actor/Boat
   #38 = Class              #37           // ext/mods/gameserver/model/actor/Boat
   #39 = Utf8               ext/mods/gameserver/network/serverpackets/VehicleStarted
   #40 = Class              #39           // ext/mods/gameserver/network/serverpackets/VehicleStarted
   #41 = Utf8               (Lext/mods/gameserver/model/actor/Creature;I)V
   #42 = NameAndType        #6:#41        // "<init>":(Lext/mods/gameserver/model/actor/Creature;I)V
   #43 = Methodref          #40.#42       // ext/mods/gameserver/network/serverpackets/VehicleStarted."<init>":(Lext/mods/gameserver/model/actor/Creature;I)V
   #44 = Utf8               ext/mods/gameserver/network/serverpackets/L2GameServerPacket
   #45 = Class              #44           // ext/mods/gameserver/network/serverpackets/L2GameServerPacket
   #46 = Utf8               broadcastPacket
   #47 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #48 = NameAndType        #46:#47       // broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #49 = Methodref          #38.#48       // ext/mods/gameserver/model/actor/Boat.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #50 = Utf8               ext/mods/gameserver/network/serverpackets/VehicleInfo
   #51 = Class              #50           // ext/mods/gameserver/network/serverpackets/VehicleInfo
   #52 = NameAndType        #6:#7         // "<init>":(Lext/mods/gameserver/model/actor/Boat;)V
   #53 = Methodref          #51.#52       // ext/mods/gameserver/network/serverpackets/VehicleInfo."<init>":(Lext/mods/gameserver/model/actor/Boat;)V
   #54 = Utf8               updatePosition
   #55 = Utf8               ()Z
   #56 = NameAndType        #54:#55       // updatePosition:()Z
   #57 = Methodref          #5.#56        // ext/mods/gameserver/model/actor/move/CreatureMove.updatePosition:()Z
   #58 = Utf8               getPassengers
   #59 = Utf8               ()Ljava/util/Set;
   #60 = NameAndType        #58:#59       // getPassengers:()Ljava/util/Set;
   #61 = Methodref          #38.#60       // ext/mods/gameserver/model/actor/Boat.getPassengers:()Ljava/util/Set;
   #62 = Utf8               java/util/Collection
   #63 = Class              #62           // java/util/Collection
   #64 = Utf8               isEmpty
   #65 = NameAndType        #64:#55       // isEmpty:()Z
   #66 = InterfaceMethodref #63.#65       // java/util/Collection.isEmpty:()Z
   #67 = Utf8               java/util/Set
   #68 = Class              #67           // java/util/Set
   #69 = Utf8               iterator
   #70 = Utf8               ()Ljava/util/Iterator;
   #71 = NameAndType        #69:#70       // iterator:()Ljava/util/Iterator;
   #72 = InterfaceMethodref #68.#71       // java/util/Set.iterator:()Ljava/util/Iterator;
   #73 = Utf8               java/util/Iterator
   #74 = Class              #73           // java/util/Iterator
   #75 = Utf8               hasNext
   #76 = NameAndType        #75:#55       // hasNext:()Z
   #77 = InterfaceMethodref #74.#76       // java/util/Iterator.hasNext:()Z
   #78 = Utf8               next
   #79 = Utf8               ()Ljava/lang/Object;
   #80 = NameAndType        #78:#79       // next:()Ljava/lang/Object;
   #81 = InterfaceMethodref #74.#80       // java/util/Iterator.next:()Ljava/lang/Object;
   #82 = Utf8               ext/mods/gameserver/model/actor/Player
   #83 = Class              #82           // ext/mods/gameserver/model/actor/Player
   #84 = Utf8               ext/mods/gameserver/model/WorldObject
   #85 = Class              #84           // ext/mods/gameserver/model/WorldObject
   #86 = Utf8               setXYZ
   #87 = Utf8               (Lext/mods/gameserver/model/WorldObject;)V
   #88 = NameAndType        #86:#87       // setXYZ:(Lext/mods/gameserver/model/WorldObject;)V
   #89 = Methodref          #83.#88       // ext/mods/gameserver/model/actor/Player.setXYZ:(Lext/mods/gameserver/model/WorldObject;)V
   #90 = Utf8               revalidateZone
   #91 = Utf8               (Z)V
   #92 = NameAndType        #90:#91       // revalidateZone:(Z)V
   #93 = Methodref          #83.#92       // ext/mods/gameserver/model/actor/Player.revalidateZone:(Z)V
   #94 = Utf8               ext/mods/gameserver/network/serverpackets/OnVehicleCheckLocation
   #95 = Class              #94           // ext/mods/gameserver/network/serverpackets/OnVehicleCheckLocation
   #96 = Methodref          #95.#12       // ext/mods/gameserver/network/serverpackets/OnVehicleCheckLocation."<init>":(Lext/mods/gameserver/model/actor/Creature;)V
   #97 = Utf8               sendPacket
   #98 = NameAndType        #97:#47       // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #99 = Methodref          #83.#98       // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #100 = Utf8               player
  #101 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #102 = Utf8               result
  #103 = Utf8               Z
  #104 = Utf8               passengers
  #105 = Utf8               Ljava/util/Set;
  #106 = Utf8               onArrival
  #107 = Utf8               isValidPath
  #108 = NameAndType        #107:#55      // isValidPath:()Z
  #109 = Methodref          #2.#108       // ext/mods/gameserver/model/actor/move/BoatMove.isValidPath:()Z
  #110 = Utf8               LOGGER
  #111 = Utf8               Lext/mods/commons/logging/CLogger;
  #112 = NameAndType        #110:#111     // LOGGER:Lext/mods/commons/logging/CLogger;
  #113 = Fieldref           #5.#112       // ext/mods/gameserver/model/actor/move/CreatureMove.LOGGER:Lext/mods/commons/logging/CLogger;
  #114 = Utf8               getName
  #115 = Utf8               ()Ljava/lang/String;
  #116 = NameAndType        #114:#115     // getName:()Ljava/lang/String;
  #117 = Methodref          #38.#116      // ext/mods/gameserver/model/actor/Boat.getName:()Ljava/lang/String;
  #118 = Utf8               Boat arrival error: Path is null or empty. Boat: \u0001
  #119 = String             #118          // Boat arrival error: Path is null or empty. Boat: \u0001
  #120 = Utf8               java/lang/invoke/StringConcatFactory
  #121 = Class              #120          // java/lang/invoke/StringConcatFactory
  #122 = Utf8               makeConcatWithConstants
  #123 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #124 = NameAndType        #122:#123     // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #125 = Methodref          #121.#124     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #126 = MethodHandle       6:#125        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #127 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
  #128 = NameAndType        #122:#127     // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #129 = InvokeDynamic      #0:#128       // #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #130 = Utf8               ext/mods/commons/logging/CLogger
  #131 = Class              #130          // ext/mods/commons/logging/CLogger
  #132 = Utf8               warn
  #133 = Utf8               (Ljava/lang/Object;)V
  #134 = NameAndType        #132:#133     // warn:(Ljava/lang/Object;)V
  #135 = Methodref          #131.#134     // ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;)V
  #136 = Utf8               setBoatDocked
  #137 = NameAndType        #136:#29      // setBoatDocked:()V
  #138 = Methodref          #2.#137       // ext/mods/gameserver/model/actor/move/BoatMove.setBoatDocked:()V
  #139 = Utf8               currentPath
  #140 = Utf8               [Lext/mods/gameserver/model/location/BoatLocation;
  #141 = NameAndType        #139:#140     // currentPath:[Lext/mods/gameserver/model/location/BoatLocation;
  #142 = Fieldref           #2.#141       // ext/mods/gameserver/model/actor/move/BoatMove.currentPath:[Lext/mods/gameserver/model/location/BoatLocation;
  #143 = Utf8               pathIndex
  #144 = Utf8               I
  #145 = NameAndType        #143:#144     // pathIndex:I
  #146 = Fieldref           #2.#145       // ext/mods/gameserver/model/actor/move/BoatMove.pathIndex:I
  #147 = Utf8               kotlin/collections/ArraysKt
  #148 = Class              #147          // kotlin/collections/ArraysKt
  #149 = Utf8               getOrNull
  #150 = Utf8               ([Ljava/lang/Object;I)Ljava/lang/Object;
  #151 = NameAndType        #149:#150     // getOrNull:([Ljava/lang/Object;I)Ljava/lang/Object;
  #152 = Methodref          #148.#151     // kotlin/collections/ArraysKt.getOrNull:([Ljava/lang/Object;I)Ljava/lang/Object;
  #153 = Utf8               ext/mods/gameserver/model/location/BoatLocation
  #154 = Class              #153          // ext/mods/gameserver/model/location/BoatLocation
  #155 = Utf8               getArrivalMessages
  #156 = Utf8               ()[Lext/mods/gameserver/network/serverpackets/BoatSay;
  #157 = NameAndType        #155:#156     // getArrivalMessages:()[Lext/mods/gameserver/network/serverpackets/BoatSay;
  #158 = Methodref          #154.#157     // ext/mods/gameserver/model/location/BoatLocation.getArrivalMessages:()[Lext/mods/gameserver/network/serverpackets/BoatSay;
  #159 = Utf8               getEngine
  #160 = Utf8               ()Lext/mods/gameserver/model/boat/BoatEngine;
  #161 = NameAndType        #159:#160     // getEngine:()Lext/mods/gameserver/model/boat/BoatEngine;
  #162 = Methodref          #38.#161      // ext/mods/gameserver/model/actor/Boat.getEngine:()Lext/mods/gameserver/model/boat/BoatEngine;
  #163 = Utf8               java/util/Arrays
  #164 = Class              #163          // java/util/Arrays
  #165 = Utf8               copyOf
  #166 = Utf8               ([Ljava/lang/Object;I)[Ljava/lang/Object;
  #167 = NameAndType        #165:#166     // copyOf:([Ljava/lang/Object;I)[Ljava/lang/Object;
  #168 = Methodref          #164.#167     // java/util/Arrays.copyOf:([Ljava/lang/Object;I)[Ljava/lang/Object;
  #169 = Utf8               [Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;
  #170 = Class              #169          // "[Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;"
  #171 = Utf8               ext/mods/gameserver/model/boat/BoatEngine
  #172 = Class              #171          // ext/mods/gameserver/model/boat/BoatEngine
  #173 = Utf8               broadcast
  #174 = Utf8               ([Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #175 = NameAndType        #173:#174     // broadcast:([Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #176 = Methodref          #172.#175     // ext/mods/gameserver/model/boat/BoatEngine.broadcast:([Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #177 = Utf8               pathLength
  #178 = NameAndType        #177:#144     // pathLength:I
  #179 = Fieldref           #2.#178       // ext/mods/gameserver/model/actor/move/BoatMove.pathLength:I
  #180 = Utf8               ext/mods/gameserver/enums/boats/BoatState
  #181 = Class              #180          // ext/mods/gameserver/enums/boats/BoatState
  #182 = Utf8               READY_TO_MOVE_TO_DOCK
  #183 = Utf8               Lext/mods/gameserver/enums/boats/BoatState;
  #184 = NameAndType        #182:#183     // READY_TO_MOVE_TO_DOCK:Lext/mods/gameserver/enums/boats/BoatState;
  #185 = Fieldref           #181.#184     // ext/mods/gameserver/enums/boats/BoatState.READY_TO_MOVE_TO_DOCK:Lext/mods/gameserver/enums/boats/BoatState;
  #186 = Utf8               setState
  #187 = Utf8               (Lext/mods/gameserver/enums/boats/BoatState;)V
  #188 = NameAndType        #186:#187     // setState:(Lext/mods/gameserver/enums/boats/BoatState;)V
  #189 = Methodref          #172.#188     // ext/mods/gameserver/model/boat/BoatEngine.setState:(Lext/mods/gameserver/enums/boats/BoatState;)V
  #190 = Utf8               moveToNextSegment
  #191 = NameAndType        #190:#29      // moveToNextSegment:()V
  #192 = Methodref          #2.#191       // ext/mods/gameserver/model/actor/move/BoatMove.moveToNextSegment:()V
  #193 = Utf8               $i$a$-takeIf-BoatMove$onArrival$1
  #194 = Utf8               it
  #195 = Utf8               [Lext/mods/gameserver/network/serverpackets/BoatSay;
  #196 = Utf8               $i$a$-let-BoatMove$onArrival$2
  #197 = Utf8               messages
  #198 = Class              #195          // "[Lext/mods/gameserver/network/serverpackets/BoatSay;"
  #199 = Utf8               java/lang/Object
  #200 = Class              #199          // java/lang/Object
  #201 = Utf8               moveToBoatLocation
  #202 = Utf8               (Lext/mods/gameserver/model/location/BoatLocation;)V
  #203 = Utf8               ext/mods/gameserver/model/location/Location
  #204 = Class              #203          // ext/mods/gameserver/model/location/Location
  #205 = Utf8               moveToLocation
  #206 = Utf8               (Lext/mods/gameserver/model/location/Location;Z)V
  #207 = NameAndType        #205:#206     // moveToLocation:(Lext/mods/gameserver/model/location/Location;Z)V
  #208 = Methodref          #2.#207       // ext/mods/gameserver/model/actor/move/BoatMove.moveToLocation:(Lext/mods/gameserver/model/location/Location;Z)V
  #209 = Utf8               ext/mods/gameserver/network/serverpackets/VehicleDeparture
  #210 = Class              #209          // ext/mods/gameserver/network/serverpackets/VehicleDeparture
  #211 = Methodref          #210.#52      // ext/mods/gameserver/network/serverpackets/VehicleDeparture."<init>":(Lext/mods/gameserver/model/actor/Boat;)V
  #212 = Utf8               loc
  #213 = Utf8               Lext/mods/gameserver/model/location/BoatLocation;
  #214 = Utf8               executePath
  #215 = Utf8               ([Lext/mods/gameserver/model/location/BoatLocation;)V
  #216 = Utf8               Lorg/jetbrains/annotations/Nullable;
  #217 = Utf8               Invalid path provided to executePath. Boat: \u0001
  #218 = String             #217          // Invalid path provided to executePath. Boat: \u0001
  #219 = InvokeDynamic      #1:#128       // #1:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #220 = Utf8               clone
  #221 = NameAndType        #220:#79      // clone:()Ljava/lang/Object;
  #222 = Methodref          #200.#221     // java/lang/Object.clone:()Ljava/lang/Object;
  #223 = Class              #140          // "[Lext/mods/gameserver/model/location/BoatLocation;"
  #224 = Utf8               kotlin/jvm/internal/Intrinsics
  #225 = Class              #224          // kotlin/jvm/internal/Intrinsics
  #226 = Utf8               checkNotNull
  #227 = NameAndType        #226:#133     // checkNotNull:(Ljava/lang/Object;)V
  #228 = Methodref          #225.#227     // kotlin/jvm/internal/Intrinsics.checkNotNull:(Ljava/lang/Object;)V
  #229 = Utf8               path
  #230 = Utf8               getDepartureMessages
  #231 = NameAndType        #230:#156     // getDepartureMessages:()[Lext/mods/gameserver/network/serverpackets/BoatSay;
  #232 = Methodref          #154.#231     // ext/mods/gameserver/model/location/BoatLocation.getDepartureMessages:()[Lext/mods/gameserver/network/serverpackets/BoatSay;
  #233 = NameAndType        #201:#202     // moveToBoatLocation:(Lext/mods/gameserver/model/location/BoatLocation;)V
  #234 = Methodref          #2.#233       // ext/mods/gameserver/model/actor/move/BoatMove.moveToBoatLocation:(Lext/mods/gameserver/model/location/BoatLocation;)V
  #235 = Utf8               $i$a$-takeIf-BoatMove$moveToNextSegment$1
  #236 = Utf8               $i$a$-let-BoatMove$moveToNextSegment$2
  #237 = Utf8               DOCKED
  #238 = NameAndType        #237:#183     // DOCKED:Lext/mods/gameserver/enums/boats/BoatState;
  #239 = Fieldref           #181.#238     // ext/mods/gameserver/enums/boats/BoatState.DOCKED:Lext/mods/gameserver/enums/boats/BoatState;
  #240 = NameAndType        #28:#29       // stop:()V
  #241 = Methodref          #2.#240       // ext/mods/gameserver/model/actor/move/BoatMove.stop:()V
  #242 = Utf8               getCurrentPathIndex
  #243 = Utf8               ()I
  #244 = Utf8               getPathLength
  #245 = Utf8               isPathCompleted
  #246 = Utf8               Lkotlin/Metadata;
  #247 = Utf8               mv
  #248 = Integer            2
  #249 = Integer            3
  #250 = Integer            0
  #251 = Utf8               k
  #252 = Integer            1
  #253 = Utf8               xi
  #254 = Integer            48
  #255 = Utf8               d1
  #256 = Utf8               \u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0006\u0010\u0011\u001a\u00020\u000eJ\u000e\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\bJ\u001b\u0010\u0014\u001a\u00020\u000e2\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0002\u0010\u0016J\b\u0010\u0017\u001a\u00020\u000eH\u0002J\b\u0010\u0018\u001a\u00020\u0010H\u0002J\b\u0010\u0019\u001a\u00020\u000eH\u0002J\u0006\u0010\u001a\u001a\u00020\u000bJ\u0006\u0010\u001b\u001a\u00020\u000bJ\u0006\u0010\u001c\u001a\u00020\u0010R\u0018\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d
  #257 = Utf8               d2
  #258 = Utf8               Lext/mods/gameserver/model/actor/move/CreatureMove;
  #259 = Utf8
  #260 = Utf8               Brproject
  #261 = Utf8               BoatMove.kt
  #262 = Utf8               Lkotlin/jvm/internal/SourceDebugExtension;
  #263 = Utf8               value
  #264 = Utf8               SMAP\nBoatMove.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BoatMove.kt\next/mods/gameserver/model/actor/move/BoatMove\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,128:1\n1#2:129\n*E\n
  #265 = Utf8               RuntimeInvisibleAnnotations
  #266 = Utf8               Code
  #267 = Utf8               LineNumberTable
  #268 = Utf8               LocalVariableTable
  #269 = Utf8               RuntimeInvisibleParameterAnnotations
  #270 = Utf8               StackMapTable
  #271 = Utf8               Signature
  #272 = Utf8               SourceFile
  #273 = Utf8               SourceDebugExtension
  #274 = Utf8               RuntimeVisibleAnnotations
  #275 = Utf8               BootstrapMethods
{
  public ext.mods.gameserver.model.actor.move.BoatMove(ext.mods.gameserver.model.actor.Boat);
    descriptor: (Lext/mods/gameserver/model/actor/Boat;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: checkcast     #10                 // class ext/mods/gameserver/model/actor/Creature
         5: invokespecial #13                 // Method ext/mods/gameserver/model/actor/move/CreatureMove."<init>":(Lext/mods/gameserver/model/actor/Creature;)V
         8: nop
         9: aload_0
        10: getstatic     #19                 // Field ext/mods/gameserver/enums/actors/MoveType.FLY:Lext/mods/gameserver/enums/actors/MoveType;
        13: invokevirtual #23                 // Method addMoveType:(Lext/mods/gameserver/enums/actors/MoveType;)V
        16: nop
        17: return
      LineNumberTable:
        line 34: 0
        line 38: 8
        line 39: 9
        line 40: 16
        line 34: 17
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      18     0  this   Lext/mods/gameserver/model/actor/move/BoatMove;
            0      18     1 actor   Lext/mods/gameserver/model/actor/Boat;
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #8()
          org.jetbrains.annotations.NotNull

  public void stop();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #32                 // Method cancelMoveTask:()V
         4: aload_0
         5: getfield      #36                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         8: checkcast     #38                 // class ext/mods/gameserver/model/actor/Boat
        11: new           #40                 // class ext/mods/gameserver/network/serverpackets/VehicleStarted
        14: dup
        15: aload_0
        16: getfield      #36                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        19: iconst_0
        20: invokespecial #43                 // Method ext/mods/gameserver/network/serverpackets/VehicleStarted."<init>":(Lext/mods/gameserver/model/actor/Creature;I)V
        23: checkcast     #45                 // class ext/mods/gameserver/network/serverpackets/L2GameServerPacket
        26: invokevirtual #49                 // Method ext/mods/gameserver/model/actor/Boat.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        29: aload_0
        30: getfield      #36                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        33: checkcast     #38                 // class ext/mods/gameserver/model/actor/Boat
        36: new           #51                 // class ext/mods/gameserver/network/serverpackets/VehicleInfo
        39: dup
        40: aload_0
        41: getfield      #36                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        44: checkcast     #38                 // class ext/mods/gameserver/model/actor/Boat
        47: invokespecial #53                 // Method ext/mods/gameserver/network/serverpackets/VehicleInfo."<init>":(Lext/mods/gameserver/model/actor/Boat;)V
        50: checkcast     #45                 // class ext/mods/gameserver/network/serverpackets/L2GameServerPacket
        53: invokevirtual #49                 // Method ext/mods/gameserver/model/actor/Boat.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        56: return
      LineNumberTable:
        line 42: 0
        line 43: 4
        line 44: 29
        line 45: 56
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      57     0  this   Lext/mods/gameserver/model/actor/move/BoatMove;

  public boolean updatePosition();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=5, args_size=1
         0: aload_0
         1: invokespecial #57                 // Method ext/mods/gameserver/model/actor/move/CreatureMove.updatePosition:()Z
         4: istore_1
         5: aload_0
         6: getfield      #36                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         9: checkcast     #38                 // class ext/mods/gameserver/model/actor/Boat
        12: invokevirtual #61                 // Method ext/mods/gameserver/model/actor/Boat.getPassengers:()Ljava/util/Set;
        15: astore_2
        16: aload_2
        17: checkcast     #63                 // class java/util/Collection
        20: invokeinterface #66,  1           // InterfaceMethod java/util/Collection.isEmpty:()Z
        25: ifne          32
        28: iconst_1
        29: goto          33
        32: iconst_0
        33: ifeq          103
        36: aload_2
        37: invokeinterface #72,  1           // InterfaceMethod java/util/Set.iterator:()Ljava/util/Iterator;
        42: astore_3
        43: aload_3
        44: invokeinterface #77,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        49: ifeq          103
        52: aload_3
        53: invokeinterface #81,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        58: checkcast     #83                 // class ext/mods/gameserver/model/actor/Player
        61: astore        4
        63: aload         4
        65: aload_0
        66: getfield      #36                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        69: checkcast     #85                 // class ext/mods/gameserver/model/WorldObject
        72: invokevirtual #89                 // Method ext/mods/gameserver/model/actor/Player.setXYZ:(Lext/mods/gameserver/model/WorldObject;)V
        75: aload         4
        77: iconst_0
        78: invokevirtual #93                 // Method ext/mods/gameserver/model/actor/Player.revalidateZone:(Z)V
        81: aload         4
        83: new           #95                 // class ext/mods/gameserver/network/serverpackets/OnVehicleCheckLocation
        86: dup
        87: aload_0
        88: getfield      #36                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        91: invokespecial #96                 // Method ext/mods/gameserver/network/serverpackets/OnVehicleCheckLocation."<init>":(Lext/mods/gameserver/model/actor/Creature;)V
        94: checkcast     #45                 // class ext/mods/gameserver/network/serverpackets/L2GameServerPacket
        97: invokevirtual #99                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       100: goto          43
       103: iload_1
       104: ireturn
      StackMapTable: number_of_entries = 4
        frame_type = 253 /* append */
          offset_delta = 32
          locals = [ int, class java/util/Set ]
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 252 /* append */
          offset_delta = 9
          locals = [ class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 59
      LineNumberTable:
        line 47: 0
        line 48: 5
        line 49: 16
        line 49: 33
        line 50: 36
        line 51: 63
        line 52: 75
        line 54: 81
        line 57: 103
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           63      37     4 player   Lext/mods/gameserver/model/actor/Player;
            5     100     1 result   Z
           16      89     2 passengers   Ljava/util/Set;
            0     105     0  this   Lext/mods/gameserver/model/actor/move/BoatMove;

  public final void onArrival();
    descriptor: ()V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=3, locals=5, args_size=1
         0: aload_0
         1: invokespecial #109                // Method isValidPath:()Z
         4: ifne          33
         7: getstatic     #113                // Field ext/mods/gameserver/model/actor/move/CreatureMove.LOGGER:Lext/mods/commons/logging/CLogger;
        10: aload_0
        11: getfield      #36                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        14: checkcast     #38                 // class ext/mods/gameserver/model/actor/Boat
        17: invokevirtual #117                // Method ext/mods/gameserver/model/actor/Boat.getName:()Ljava/lang/String;
        20: invokedynamic #129,  0            // InvokeDynamic #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
        25: invokevirtual #135                // Method ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;)V
        28: aload_0
        29: invokespecial #138                // Method setBoatDocked:()V
        32: return
        33: aload_0
        34: getfield      #142                // Field currentPath:[Lext/mods/gameserver/model/location/BoatLocation;
        37: dup
        38: ifnull        129
        41: aload_0
        42: getfield      #146                // Field pathIndex:I
        45: invokestatic  #152                // Method kotlin/collections/ArraysKt.getOrNull:([Ljava/lang/Object;I)Ljava/lang/Object;
        48: checkcast     #154                // class ext/mods/gameserver/model/location/BoatLocation
        51: dup
        52: ifnull        129
        55: invokevirtual #158                // Method ext/mods/gameserver/model/location/BoatLocation.getArrivalMessages:()[Lext/mods/gameserver/network/serverpackets/BoatSay;
        58: dup
        59: ifnull        129
        62: astore_2
        63: aload_2
        64: astore_3
        65: iconst_0
        66: istore        4
        68: aload_3
        69: arraylength
        70: ifne          77
        73: iconst_1
        74: goto          78
        77: iconst_0
        78: ifne          85
        81: iconst_1
        82: goto          86
        85: iconst_0
        86: nop
        87: ifeq          94
        90: aload_2
        91: goto          95
        94: aconst_null
        95: dup
        96: ifnull        129
        99: astore_3
       100: iconst_0
       101: istore        4
       103: aload_0
       104: getfield      #36                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       107: checkcast     #38                 // class ext/mods/gameserver/model/actor/Boat
       110: invokevirtual #162                // Method ext/mods/gameserver/model/actor/Boat.getEngine:()Lext/mods/gameserver/model/boat/BoatEngine;
       113: aload_3
       114: aload_3
       115: arraylength
       116: invokestatic  #168                // Method java/util/Arrays.copyOf:([Ljava/lang/Object;I)[Ljava/lang/Object;
       119: checkcast     #170                // class "[Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;"
       122: invokevirtual #176                // Method ext/mods/gameserver/model/boat/BoatEngine.broadcast:([Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       125: nop
       126: goto          131
       129: pop
       130: nop
       131: aload_0
       132: getfield      #146                // Field pathIndex:I
       135: istore_1
       136: aload_0
       137: iload_1
       138: iconst_1
       139: iadd
       140: putfield      #146                // Field pathIndex:I
       143: nop
       144: aload_0
       145: getfield      #146                // Field pathIndex:I
       148: aload_0
       149: getfield      #179                // Field pathLength:I
       152: if_icmplt     162
       155: aload_0
       156: invokespecial #138                // Method setBoatDocked:()V
       159: goto          202
       162: aload_0
       163: getfield      #146                // Field pathIndex:I
       166: aload_0
       167: getfield      #179                // Field pathLength:I
       170: iconst_1
       171: isub
       172: if_icmpne     198
       175: aload_0
       176: getfield      #36                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       179: checkcast     #38                 // class ext/mods/gameserver/model/actor/Boat
       182: invokevirtual #162                // Method ext/mods/gameserver/model/actor/Boat.getEngine:()Lext/mods/gameserver/model/boat/BoatEngine;
       185: getstatic     #185                // Field ext/mods/gameserver/enums/boats/BoatState.READY_TO_MOVE_TO_DOCK:Lext/mods/gameserver/enums/boats/BoatState;
       188: invokevirtual #189                // Method ext/mods/gameserver/model/boat/BoatEngine.setState:(Lext/mods/gameserver/enums/boats/BoatState;)V
       191: aload_0
       192: invokespecial #192                // Method moveToNextSegment:()V
       195: goto          202
       198: aload_0
       199: invokespecial #192                // Method moveToNextSegment:()V
       202: return
      StackMapTable: number_of_entries = 12
        frame_type = 33 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 43
          locals = [ class ext/mods/gameserver/model/actor/move/BoatMove, top, class "[Lext/mods/gameserver/network/serverpackets/BoatSay;", class "[Lext/mods/gameserver/network/serverpackets/BoatSay;", int ]
          stack = []
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 6 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 7 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ class "[Lext/mods/gameserver/network/serverpackets/BoatSay;" ]
        frame_type = 255 /* full_frame */
          offset_delta = 33
          locals = [ class ext/mods/gameserver/model/actor/move/BoatMove ]
          stack = [ class java/lang/Object ]
        frame_type = 1 /* same */
        frame_type = 252 /* append */
          offset_delta = 30
          locals = [ int ]
        frame_type = 35 /* same */
        frame_type = 3 /* same */
      LineNumberTable:
        line 61: 0
        line 62: 7
        line 63: 28
        line 64: 32
        line 66: 33
        line 129: 65
        line 66: 68
        line 66: 86
        line 66: 87
        line 66: 95
        line 67: 103
        line 68: 125
        line 66: 126
        line 66: 129
        line 69: 131
        line 70: 143
        line 71: 144
        line 72: 155
        line 75: 162
        line 76: 175
        line 77: 191
        line 81: 198
        line 84: 202
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           68      19     4 $i$a$-takeIf-BoatMove$onArrival$1   I
           65      22     3    it   [Lext/mods/gameserver/network/serverpackets/BoatSay;
          103      23     4 $i$a$-let-BoatMove$onArrival$2   I
          100      26     3 messages   [Lext/mods/gameserver/network/serverpackets/BoatSay;
            0     203     0  this   Lext/mods/gameserver/model/actor/move/BoatMove;

  public final void moveToBoatLocation(ext.mods.gameserver.model.location.BoatLocation);
    descriptor: (Lext/mods/gameserver/model/location/BoatLocation;)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=4, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: checkcast     #204                // class ext/mods/gameserver/model/location/Location
         5: iconst_0
         6: invokevirtual #208                // Method moveToLocation:(Lext/mods/gameserver/model/location/Location;Z)V
         9: aload_0
        10: getfield      #36                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        13: checkcast     #38                 // class ext/mods/gameserver/model/actor/Boat
        16: new           #210                // class ext/mods/gameserver/network/serverpackets/VehicleDeparture
        19: dup
        20: aload_0
        21: getfield      #36                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        24: checkcast     #38                 // class ext/mods/gameserver/model/actor/Boat
        27: invokespecial #211                // Method ext/mods/gameserver/network/serverpackets/VehicleDeparture."<init>":(Lext/mods/gameserver/model/actor/Boat;)V
        30: checkcast     #45                 // class ext/mods/gameserver/network/serverpackets/L2GameServerPacket
        33: invokevirtual #49                 // Method ext/mods/gameserver/model/actor/Boat.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        36: return
      LineNumberTable:
        line 87: 0
        line 88: 9
        line 89: 36
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      37     0  this   Lext/mods/gameserver/model/actor/move/BoatMove;
            0      37     1   loc   Lext/mods/gameserver/model/location/BoatLocation;
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #8()
          org.jetbrains.annotations.NotNull

  public final void executePath(ext.mods.gameserver.model.location.BoatLocation[]);
    descriptor: ([Lext/mods/gameserver/model/location/BoatLocation;)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=5, locals=2, args_size=2
         0: aload_1
         1: ifnull        17
         4: aload_1
         5: arraylength
         6: ifne          13
         9: iconst_1
        10: goto          14
        13: iconst_0
        14: ifeq          39
        17: getstatic     #113                // Field ext/mods/gameserver/model/actor/move/CreatureMove.LOGGER:Lext/mods/commons/logging/CLogger;
        20: aload_0
        21: getfield      #36                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        24: checkcast     #38                 // class ext/mods/gameserver/model/actor/Boat
        27: invokevirtual #117                // Method ext/mods/gameserver/model/actor/Boat.getName:()Ljava/lang/String;
        30: invokedynamic #219,  0            // InvokeDynamic #1:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
        35: invokevirtual #135                // Method ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;)V
        38: return
        39: aload_0
        40: iconst_0
        41: putfield      #146                // Field pathIndex:I
        44: aload_0
        45: aload_1
        46: invokevirtual #222                // Method java/lang/Object.clone:()Ljava/lang/Object;
        49: checkcast     #223                // class "[Lext/mods/gameserver/model/location/BoatLocation;"
        52: putfield      #142                // Field currentPath:[Lext/mods/gameserver/model/location/BoatLocation;
        55: aload_0
        56: aload_0
        57: getfield      #142                // Field currentPath:[Lext/mods/gameserver/model/location/BoatLocation;
        60: dup
        61: invokestatic  #228                // Method kotlin/jvm/internal/Intrinsics.checkNotNull:(Ljava/lang/Object;)V
        64: arraylength
        65: putfield      #179                // Field pathLength:I
        68: aload_0
        69: invokespecial #192                // Method moveToNextSegment:()V
        72: aload_0
        73: getfield      #36                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        76: checkcast     #38                 // class ext/mods/gameserver/model/actor/Boat
        79: new           #40                 // class ext/mods/gameserver/network/serverpackets/VehicleStarted
        82: dup
        83: aload_0
        84: getfield      #36                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        87: iconst_1
        88: invokespecial #43                 // Method ext/mods/gameserver/network/serverpackets/VehicleStarted."<init>":(Lext/mods/gameserver/model/actor/Creature;I)V
        91: checkcast     #45                 // class ext/mods/gameserver/network/serverpackets/L2GameServerPacket
        94: invokevirtual #49                 // Method ext/mods/gameserver/model/actor/Boat.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        97: return
      StackMapTable: number_of_entries = 4
        frame_type = 13 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 2 /* same */
        frame_type = 21 /* same */
      LineNumberTable:
        line 91: 0
        line 91: 14
        line 92: 17
        line 93: 38
        line 95: 39
        line 96: 44
        line 97: 55
        line 98: 68
        line 99: 72
        line 100: 97
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      98     0  this   Lext/mods/gameserver/model/actor/move/BoatMove;
            0      98     1  path   [Lext/mods/gameserver/model/location/BoatLocation;
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #216()
          org.jetbrains.annotations.Nullable

  public final int getCurrentPathIndex();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #146                // Field pathIndex:I
         4: ireturn
      LineNumberTable:
        line 125: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/move/BoatMove;

  public final int getPathLength();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #179                // Field pathLength:I
         4: ireturn
      LineNumberTable:
        line 126: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/move/BoatMove;

  public final boolean isPathCompleted();
    descriptor: ()Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #146                // Field pathIndex:I
         4: aload_0
         5: getfield      #179                // Field pathLength:I
         8: if_icmplt     15
        11: iconst_1
        12: goto          16
        15: iconst_0
        16: ireturn
      StackMapTable: number_of_entries = 2
        frame_type = 15 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
      LineNumberTable:
        line 127: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      17     0  this   Lext/mods/gameserver/model/actor/move/BoatMove;
}
Signature: #3                           // Lext/mods/gameserver/model/actor/move/CreatureMove<Lext/mods/gameserver/model/actor/Boat;>;
SourceFile: "BoatMove.kt"
SourceDebugExtension:
  SMAP
  BoatMove.kt
  Kotlin
  *S Kotlin
  *F
  + 1 BoatMove.kt
  ext/mods/gameserver/model/actor/move/BoatMove
  + 2 fake.kt
  kotlin/jvm/internal/FakeKt
  *L
  1#1,128:1
  1#2:129
  *E
RuntimeVisibleAnnotations:
  0: #246(#247=[I#248,I#249,I#250],#251=I#252,#253=I#254,#255=[s#256],#257=[s#25,s#258,s#27,s#26,s#6,s#7,s#139,s#259,s#213,s#140,s#143,s#259,s#177,s#28,s#259,s#54,s#259,s#106,s#201,s#212,s#214,s#229,s#215,s#190,s#107,s#136,s#242,s#244,s#245,s#260])
    kotlin.Metadata(
      mv=[2,3,0]
      k=1
      xi=48
      d1=["\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0006\u0010\u0011\u001a\u00020\u000eJ\u000e\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\bJ\u001b\u0010\u0014\u001a\u00020\u000e2\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0002\u0010\u0016J\b\u0010\u0017\u001a\u00020\u000eH\u0002J\b\u0010\u0018\u001a\u00020\u0010H\u0002J\b\u0010\u0019\u001a\u00020\u000eH\u0002J\u0006\u0010\u001a\u001a\u00020\u000bJ\u0006\u0010\u001b\u001a\u00020\u000bJ\u0006\u0010\u001c\u001a\u00020\u0010R\u0018\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"]
      d2=["Lext/mods/gameserver/model/actor/move/BoatMove;","Lext/mods/gameserver/model/actor/move/CreatureMove;","Lext/mods/gameserver/model/actor/Boat;","actor","<init>","(Lext/mods/gameserver/model/actor/Boat;)V","currentPath","","Lext/mods/gameserver/model/location/BoatLocation;","[Lext/mods/gameserver/model/location/BoatLocation;","pathIndex","","pathLength","stop","","updatePosition","","onArrival","moveToBoatLocation","loc","executePath","path","([Lext/mods/gameserver/model/location/BoatLocation;)V","moveToNextSegment","isValidPath","setBoatDocked","getCurrentPathIndex","getPathLength","isPathCompleted","Brproject"]
    )
RuntimeInvisibleAnnotations:
  0: #262(#263=[s#264])
    kotlin.jvm.internal.SourceDebugExtension(
      value=["SMAP\nBoatMove.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BoatMove.kt\next/mods/gameserver/model/actor/move/BoatMove\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,128:1\n1#2:129\n*E\n"]
    )
BootstrapMethods:
  0: #126 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #119 Boat arrival error: Path is null or empty. Boat: \u0001
  1: #126 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #218 Invalid path provided to executePath. Boat: \u0001
