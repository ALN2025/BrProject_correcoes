// Bytecode for: ext.mods.gameserver.model.boat.BoatEngine
// File: ext\mods\gameserver\model\boat\BoatEngine.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/boat/BoatEngine.class
  Last modified 9 de jul de 2026; size 8736 bytes
  MD5 checksum 4ddf14dcff3a06ea24280c3d50f3cabe
  Compiled from "BoatEngine.java"
public class ext.mods.gameserver.model.boat.BoatEngine implements java.lang.Runnable
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #10                         // ext/mods/gameserver/model/boat/BoatEngine
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 11, methods: 10, attributes: 4
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Class              #8            // ext/mods/gameserver/network/serverpackets/PlaySound
    #8 = Utf8               ext/mods/gameserver/network/serverpackets/PlaySound
    #9 = Fieldref           #10.#11       // ext/mods/gameserver/model/boat/BoatEngine._sounds:[Lext/mods/gameserver/network/serverpackets/PlaySound;
   #10 = Class              #12           // ext/mods/gameserver/model/boat/BoatEngine
   #11 = NameAndType        #13:#14       // _sounds:[Lext/mods/gameserver/network/serverpackets/PlaySound;
   #12 = Utf8               ext/mods/gameserver/model/boat/BoatEngine
   #13 = Utf8               _sounds
   #14 = Utf8               [Lext/mods/gameserver/network/serverpackets/PlaySound;
   #15 = Fieldref           #10.#16       // ext/mods/gameserver/model/boat/BoatEngine._shoutCount:I
   #16 = NameAndType        #17:#18       // _shoutCount:I
   #17 = Utf8               _shoutCount
   #18 = Utf8               I
   #19 = Fieldref           #10.#20       // ext/mods/gameserver/model/boat/BoatEngine._delay:I
   #20 = NameAndType        #21:#18       // _delay:I
   #21 = Utf8               _delay
   #22 = Fieldref           #23.#24       // ext/mods/gameserver/enums/boats/BoatState.PREPARING:Lext/mods/gameserver/enums/boats/BoatState;
   #23 = Class              #25           // ext/mods/gameserver/enums/boats/BoatState
   #24 = NameAndType        #26:#27       // PREPARING:Lext/mods/gameserver/enums/boats/BoatState;
   #25 = Utf8               ext/mods/gameserver/enums/boats/BoatState
   #26 = Utf8               PREPARING
   #27 = Utf8               Lext/mods/gameserver/enums/boats/BoatState;
   #28 = Fieldref           #10.#29       // ext/mods/gameserver/model/boat/BoatEngine._state:Lext/mods/gameserver/enums/boats/BoatState;
   #29 = NameAndType        #30:#27       // _state:Lext/mods/gameserver/enums/boats/BoatState;
   #30 = Utf8               _state
   #31 = Methodref          #32.#33       // ext/mods/gameserver/data/xml/BoatData.getInstance:()Lext/mods/gameserver/data/xml/BoatData;
   #32 = Class              #34           // ext/mods/gameserver/data/xml/BoatData
   #33 = NameAndType        #35:#36       // getInstance:()Lext/mods/gameserver/data/xml/BoatData;
   #34 = Utf8               ext/mods/gameserver/data/xml/BoatData
   #35 = Utf8               getInstance
   #36 = Utf8               ()Lext/mods/gameserver/data/xml/BoatData;
   #37 = Methodref          #32.#38       // ext/mods/gameserver/data/xml/BoatData.getNewBoat:(Lext/mods/gameserver/model/boat/BoatItinerary;)Lext/mods/gameserver/model/actor/Boat;
   #38 = NameAndType        #39:#40       // getNewBoat:(Lext/mods/gameserver/model/boat/BoatItinerary;)Lext/mods/gameserver/model/actor/Boat;
   #39 = Utf8               getNewBoat
   #40 = Utf8               (Lext/mods/gameserver/model/boat/BoatItinerary;)Lext/mods/gameserver/model/actor/Boat;
   #41 = Fieldref           #10.#42       // ext/mods/gameserver/model/boat/BoatEngine._boat:Lext/mods/gameserver/model/actor/Boat;
   #42 = NameAndType        #43:#44       // _boat:Lext/mods/gameserver/model/actor/Boat;
   #43 = Utf8               _boat
   #44 = Utf8               Lext/mods/gameserver/model/actor/Boat;
   #45 = Methodref          #46.#47       // ext/mods/gameserver/model/actor/Boat.setEngine:(Lext/mods/gameserver/model/boat/BoatEngine;)V
   #46 = Class              #48           // ext/mods/gameserver/model/actor/Boat
   #47 = NameAndType        #49:#50       // setEngine:(Lext/mods/gameserver/model/boat/BoatEngine;)V
   #48 = Utf8               ext/mods/gameserver/model/actor/Boat
   #49 = Utf8               setEngine
   #50 = Utf8               (Lext/mods/gameserver/model/boat/BoatEngine;)V
   #51 = Methodref          #52.#53       // ext/mods/gameserver/model/boat/BoatItinerary.getInfo:()[Lext/mods/gameserver/model/boat/BoatRouteInfo;
   #52 = Class              #54           // ext/mods/gameserver/model/boat/BoatItinerary
   #53 = NameAndType        #55:#56       // getInfo:()[Lext/mods/gameserver/model/boat/BoatRouteInfo;
   #54 = Utf8               ext/mods/gameserver/model/boat/BoatItinerary
   #55 = Utf8               getInfo
   #56 = Utf8               ()[Lext/mods/gameserver/model/boat/BoatRouteInfo;
   #57 = Methodref          #58.#59       // ext/mods/gameserver/model/boat/BoatRouteInfo.getDock:()Lext/mods/gameserver/enums/boats/BoatDock;
   #58 = Class              #60           // ext/mods/gameserver/model/boat/BoatRouteInfo
   #59 = NameAndType        #61:#62       // getDock:()Lext/mods/gameserver/enums/boats/BoatDock;
   #60 = Utf8               ext/mods/gameserver/model/boat/BoatRouteInfo
   #61 = Utf8               getDock
   #62 = Utf8               ()Lext/mods/gameserver/enums/boats/BoatDock;
   #63 = Fieldref           #10.#64       // ext/mods/gameserver/model/boat/BoatEngine._currentDock:Lext/mods/gameserver/enums/boats/BoatDock;
   #64 = NameAndType        #65:#66       // _currentDock:Lext/mods/gameserver/enums/boats/BoatDock;
   #65 = Utf8               _currentDock
   #66 = Utf8               Lext/mods/gameserver/enums/boats/BoatDock;
   #67 = Methodref          #52.#68       // ext/mods/gameserver/model/boat/BoatItinerary.isOneWay:()Z
   #68 = NameAndType        #69:#70       // isOneWay:()Z
   #69 = Utf8               isOneWay
   #70 = Utf8               ()Z
   #71 = Fieldref           #10.#72       // ext/mods/gameserver/model/boat/BoatEngine._destinationDock:Lext/mods/gameserver/enums/boats/BoatDock;
   #72 = NameAndType        #73:#66       // _destinationDock:Lext/mods/gameserver/enums/boats/BoatDock;
   #73 = Utf8               _destinationDock
   #74 = Fieldref           #10.#75       // ext/mods/gameserver/model/boat/BoatEngine._info:[Lext/mods/gameserver/model/boat/BoatRouteInfo;
   #75 = NameAndType        #76:#77       // _info:[Lext/mods/gameserver/model/boat/BoatRouteInfo;
   #76 = Utf8               _info
   #77 = Utf8               [Lext/mods/gameserver/model/boat/BoatRouteInfo;
   #78 = Fieldref           #79.#80       // ext/mods/gameserver/enums/boats/BoatDock.RUNE:Lext/mods/gameserver/enums/boats/BoatDock;
   #79 = Class              #81           // ext/mods/gameserver/enums/boats/BoatDock
   #80 = NameAndType        #82:#66       // RUNE:Lext/mods/gameserver/enums/boats/BoatDock;
   #81 = Utf8               ext/mods/gameserver/enums/boats/BoatDock
   #82 = Utf8               RUNE
   #83 = Fieldref           #79.#84       // ext/mods/gameserver/enums/boats/BoatDock.PRIMEVAL:Lext/mods/gameserver/enums/boats/BoatDock;
   #84 = NameAndType        #85:#66       // PRIMEVAL:Lext/mods/gameserver/enums/boats/BoatDock;
   #85 = Utf8               PRIMEVAL
   #86 = Fieldref           #10.#87       // ext/mods/gameserver/model/boat/BoatEngine._waitDelay:I
   #87 = NameAndType        #88:#18       // _waitDelay:I
   #88 = Utf8               _waitDelay
   #89 = Fieldref           #90.#91       // ext/mods/gameserver/enums/boats/BoatSound.LEAVE_5_MIN:Lext/mods/gameserver/enums/boats/BoatSound;
   #90 = Class              #92           // ext/mods/gameserver/enums/boats/BoatSound
   #91 = NameAndType        #93:#94       // LEAVE_5_MIN:Lext/mods/gameserver/enums/boats/BoatSound;
   #92 = Utf8               ext/mods/gameserver/enums/boats/BoatSound
   #93 = Utf8               LEAVE_5_MIN
   #94 = Utf8               Lext/mods/gameserver/enums/boats/BoatSound;
   #95 = Methodref          #90.#96       // ext/mods/gameserver/enums/boats/BoatSound.get:(Lext/mods/gameserver/model/actor/Boat;)Lext/mods/gameserver/network/serverpackets/PlaySound;
   #96 = NameAndType        #97:#98       // get:(Lext/mods/gameserver/model/actor/Boat;)Lext/mods/gameserver/network/serverpackets/PlaySound;
   #97 = Utf8               get
   #98 = Utf8               (Lext/mods/gameserver/model/actor/Boat;)Lext/mods/gameserver/network/serverpackets/PlaySound;
   #99 = Fieldref           #90.#100      // ext/mods/gameserver/enums/boats/BoatSound.LEAVE_1_MIN:Lext/mods/gameserver/enums/boats/BoatSound;
  #100 = NameAndType        #101:#94      // LEAVE_1_MIN:Lext/mods/gameserver/enums/boats/BoatSound;
  #101 = Utf8               LEAVE_1_MIN
  #102 = Fieldref           #90.#103      // ext/mods/gameserver/enums/boats/BoatSound.ARRIVAL_DEPARTURE:Lext/mods/gameserver/enums/boats/BoatSound;
  #103 = NameAndType        #104:#94      // ARRIVAL_DEPARTURE:Lext/mods/gameserver/enums/boats/BoatSound;
  #104 = Utf8               ARRIVAL_DEPARTURE
  #105 = Methodref          #10.#106      // ext/mods/gameserver/model/boat/BoatEngine.getRouteInfoByDock:(Lext/mods/gameserver/enums/boats/BoatDock;)Lext/mods/gameserver/model/boat/BoatRouteInfo;
  #106 = NameAndType        #107:#108     // getRouteInfoByDock:(Lext/mods/gameserver/enums/boats/BoatDock;)Lext/mods/gameserver/model/boat/BoatRouteInfo;
  #107 = Utf8               getRouteInfoByDock
  #108 = Utf8               (Lext/mods/gameserver/enums/boats/BoatDock;)Lext/mods/gameserver/model/boat/BoatRouteInfo;
  #109 = Methodref          #58.#110      // ext/mods/gameserver/model/boat/BoatRouteInfo.getScheduledMessages:()Ljava/util/List;
  #110 = NameAndType        #111:#112     // getScheduledMessages:()Ljava/util/List;
  #111 = Utf8               getScheduledMessages
  #112 = Utf8               ()Ljava/util/List;
  #113 = InterfaceMethodref #114.#115     // java/util/List.iterator:()Ljava/util/Iterator;
  #114 = Class              #116          // java/util/List
  #115 = NameAndType        #117:#118     // iterator:()Ljava/util/Iterator;
  #116 = Utf8               java/util/List
  #117 = Utf8               iterator
  #118 = Utf8               ()Ljava/util/Iterator;
  #119 = Fieldref           #10.#120      // ext/mods/gameserver/model/boat/BoatEngine._messages:Ljava/util/Iterator;
  #120 = NameAndType        #121:#122     // _messages:Ljava/util/Iterator;
  #121 = Utf8               _messages
  #122 = Utf8               Ljava/util/Iterator;
  #123 = Methodref          #124.#125     // ext/mods/gameserver/taskmanager/BoatTaskManager.getInstance:()Lext/mods/gameserver/taskmanager/BoatTaskManager;
  #124 = Class              #126          // ext/mods/gameserver/taskmanager/BoatTaskManager
  #125 = NameAndType        #35:#127      // getInstance:()Lext/mods/gameserver/taskmanager/BoatTaskManager;
  #126 = Utf8               ext/mods/gameserver/taskmanager/BoatTaskManager
  #127 = Utf8               ()Lext/mods/gameserver/taskmanager/BoatTaskManager;
  #128 = Methodref          #124.#129     // ext/mods/gameserver/taskmanager/BoatTaskManager.add:(Lext/mods/gameserver/model/boat/BoatEngine;)V
  #129 = NameAndType        #130:#50      // add:(Lext/mods/gameserver/model/boat/BoatEngine;)V
  #130 = Utf8               add
  #131 = Methodref          #132.#133     // java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
  #132 = Class              #134          // java/lang/String
  #133 = NameAndType        #135:#136     // valueOf:(Ljava/lang/Object;)Ljava/lang/String;
  #134 = Utf8               java/lang/String
  #135 = Utf8               valueOf
  #136 = Utf8               (Ljava/lang/Object;)Ljava/lang/String;
  #137 = InvokeDynamic      #0:#138       // #0:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #138 = NameAndType        #139:#140     // makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #139 = Utf8               makeConcatWithConstants
  #140 = Utf8               (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #141 = InterfaceMethodref #114.#142     // java/util/List.isEmpty:()Z
  #142 = NameAndType        #143:#70      // isEmpty:()Z
  #143 = Utf8               isEmpty
  #144 = Methodref          #145.#146     // ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
  #145 = Class              #147          // ext/mods/gameserver/model/World
  #146 = NameAndType        #35:#148      // getInstance:()Lext/mods/gameserver/model/World;
  #147 = Utf8               ext/mods/gameserver/model/World
  #148 = Utf8               ()Lext/mods/gameserver/model/World;
  #149 = Methodref          #145.#150     // ext/mods/gameserver/model/World.getPlayers:()Ljava/util/Collection;
  #150 = NameAndType        #151:#152     // getPlayers:()Ljava/util/Collection;
  #151 = Utf8               getPlayers
  #152 = Utf8               ()Ljava/util/Collection;
  #153 = InterfaceMethodref #154.#115     // java/util/Collection.iterator:()Ljava/util/Iterator;
  #154 = Class              #155          // java/util/Collection
  #155 = Utf8               java/util/Collection
  #156 = InterfaceMethodref #157.#158     // java/util/Iterator.hasNext:()Z
  #157 = Class              #159          // java/util/Iterator
  #158 = NameAndType        #160:#70      // hasNext:()Z
  #159 = Utf8               java/util/Iterator
  #160 = Utf8               hasNext
  #161 = InterfaceMethodref #157.#162     // java/util/Iterator.next:()Ljava/lang/Object;
  #162 = NameAndType        #163:#164     // next:()Ljava/lang/Object;
  #163 = Utf8               next
  #164 = Utf8               ()Ljava/lang/Object;
  #165 = Class              #166          // ext/mods/gameserver/model/actor/Player
  #166 = Utf8               ext/mods/gameserver/model/actor/Player
  #167 = Methodref          #79.#168      // ext/mods/gameserver/enums/boats/BoatDock.getDockLoc:()Lext/mods/gameserver/model/location/BoatLocation;
  #168 = NameAndType        #169:#170     // getDockLoc:()Lext/mods/gameserver/model/location/BoatLocation;
  #169 = Utf8               getDockLoc
  #170 = Utf8               ()Lext/mods/gameserver/model/location/BoatLocation;
  #171 = Methodref          #165.#172     // ext/mods/gameserver/model/actor/Player.isIn2DRadius:(Lext/mods/gameserver/model/location/Location;I)Z
  #172 = NameAndType        #173:#174     // isIn2DRadius:(Lext/mods/gameserver/model/location/Location;I)Z
  #173 = Utf8               isIn2DRadius
  #174 = Utf8               (Lext/mods/gameserver/model/location/Location;I)Z
  #175 = Class              #176          // ext/mods/gameserver/network/serverpackets/L2GameServerPacket
  #176 = Utf8               ext/mods/gameserver/network/serverpackets/L2GameServerPacket
  #177 = Methodref          #165.#178     // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #178 = NameAndType        #179:#180     // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #179 = Utf8               sendPacket
  #180 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #181 = Fieldref           #182.#183     // ext/mods/gameserver/model/boat/BoatEngine$1.$SwitchMap$ext$mods$gameserver$enums$boats$BoatState:[I
  #182 = Class              #184          // ext/mods/gameserver/model/boat/BoatEngine$1
  #183 = NameAndType        #185:#186     // $SwitchMap$ext$mods$gameserver$enums$boats$BoatState:[I
  #184 = Utf8               ext/mods/gameserver/model/boat/BoatEngine$1
  #185 = Utf8               $SwitchMap$ext$mods$gameserver$enums$boats$BoatState
  #186 = Utf8               [I
  #187 = Methodref          #23.#188      // ext/mods/gameserver/enums/boats/BoatState.ordinal:()I
  #188 = NameAndType        #189:#190     // ordinal:()I
  #189 = Utf8               ordinal
  #190 = Utf8               ()I
  #191 = Class              #192          // ext/mods/gameserver/model/boat/ScheduledBoatMessages
  #192 = Utf8               ext/mods/gameserver/model/boat/ScheduledBoatMessages
  #193 = Methodref          #191.#194     // ext/mods/gameserver/model/boat/ScheduledBoatMessages.getMessages:()Ljava/util/List;
  #194 = NameAndType        #195:#112     // getMessages:()Ljava/util/List;
  #195 = Utf8               getMessages
  #196 = Methodref          #10.#197      // ext/mods/gameserver/model/boat/BoatEngine.broadcast:(Ljava/util/List;)V
  #197 = NameAndType        #198:#199     // broadcast:(Ljava/util/List;)V
  #198 = Utf8               broadcast
  #199 = Utf8               (Ljava/util/List;)V
  #200 = Methodref          #191.#201     // ext/mods/gameserver/model/boat/ScheduledBoatMessages.getDelay:()I
  #201 = NameAndType        #202:#190     // getDelay:()I
  #202 = Utf8               getDelay
  #203 = Methodref          #10.#204      // ext/mods/gameserver/model/boat/BoatEngine.broadcast:([Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #204 = NameAndType        #198:#205     // broadcast:([Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #205 = Utf8               ([Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #206 = Fieldref           #23.#207      // ext/mods/gameserver/enums/boats/BoatState.EXECUTE_ROUTE:Lext/mods/gameserver/enums/boats/BoatState;
  #207 = NameAndType        #208:#27      // EXECUTE_ROUTE:Lext/mods/gameserver/enums/boats/BoatState;
  #208 = Utf8               EXECUTE_ROUTE
  #209 = Methodref          #58.#210      // ext/mods/gameserver/model/boat/BoatRouteInfo.getItemId:()I
  #210 = NameAndType        #211:#190     // getItemId:()I
  #211 = Utf8               getItemId
  #212 = Methodref          #79.#213      // ext/mods/gameserver/enums/boats/BoatDock.getOustLoc:()Lext/mods/gameserver/model/location/Location;
  #213 = NameAndType        #214:#215     // getOustLoc:()Lext/mods/gameserver/model/location/Location;
  #214 = Utf8               getOustLoc
  #215 = Utf8               ()Lext/mods/gameserver/model/location/Location;
  #216 = Methodref          #46.#217      // ext/mods/gameserver/model/actor/Boat.payForRide:(ILext/mods/gameserver/model/location/Location;)V
  #217 = NameAndType        #218:#219     // payForRide:(ILext/mods/gameserver/model/location/Location;)V
  #218 = Utf8               payForRide
  #219 = Utf8               (ILext/mods/gameserver/model/location/Location;)V
  #220 = Methodref          #46.#221      // ext/mods/gameserver/model/actor/Boat.getMove:()Lext/mods/gameserver/model/actor/move/BoatMove;
  #221 = NameAndType        #222:#223     // getMove:()Lext/mods/gameserver/model/actor/move/BoatMove;
  #222 = Utf8               getMove
  #223 = Utf8               ()Lext/mods/gameserver/model/actor/move/BoatMove;
  #224 = Methodref          #58.#225      // ext/mods/gameserver/model/boat/BoatRouteInfo.getPaths:()[Lext/mods/gameserver/model/location/BoatLocation;
  #225 = NameAndType        #226:#227     // getPaths:()[Lext/mods/gameserver/model/location/BoatLocation;
  #226 = Utf8               getPaths
  #227 = Utf8               ()[Lext/mods/gameserver/model/location/BoatLocation;
  #228 = Methodref          #229.#230     // ext/mods/gameserver/model/actor/move/BoatMove.executePath:([Lext/mods/gameserver/model/location/BoatLocation;)V
  #229 = Class              #231          // ext/mods/gameserver/model/actor/move/BoatMove
  #230 = NameAndType        #232:#233     // executePath:([Lext/mods/gameserver/model/location/BoatLocation;)V
  #231 = Utf8               ext/mods/gameserver/model/actor/move/BoatMove
  #232 = Utf8               executePath
  #233 = Utf8               ([Lext/mods/gameserver/model/location/BoatLocation;)V
  #234 = Methodref          #79.#235      // ext/mods/gameserver/enums/boats/BoatDock.setBusy:(Z)V
  #235 = NameAndType        #236:#237     // setBusy:(Z)V
  #236 = Utf8               setBusy
  #237 = Utf8               (Z)V
  #238 = Fieldref           #23.#239      // ext/mods/gameserver/enums/boats/BoatState.SEALING:Lext/mods/gameserver/enums/boats/BoatState;
  #239 = NameAndType        #240:#27      // SEALING:Lext/mods/gameserver/enums/boats/BoatState;
  #240 = Utf8               SEALING
  #241 = Methodref          #79.#242      // ext/mods/gameserver/enums/boats/BoatDock.isBusy:()Z
  #242 = NameAndType        #243:#70      // isBusy:()Z
  #243 = Utf8               isBusy
  #244 = Methodref          #58.#245      // ext/mods/gameserver/model/boat/BoatRouteInfo.getBusyMessage:()Lext/mods/gameserver/network/serverpackets/BoatSay;
  #245 = NameAndType        #246:#247     // getBusyMessage:()Lext/mods/gameserver/network/serverpackets/BoatSay;
  #246 = Utf8               getBusyMessage
  #247 = Utf8               ()Lext/mods/gameserver/network/serverpackets/BoatSay;
  #248 = Methodref          #229.#249     // ext/mods/gameserver/model/actor/move/BoatMove.moveToBoatLocation:(Lext/mods/gameserver/model/location/BoatLocation;)V
  #249 = NameAndType        #250:#251     // moveToBoatLocation:(Lext/mods/gameserver/model/location/BoatLocation;)V
  #250 = Utf8               moveToBoatLocation
  #251 = Utf8               (Lext/mods/gameserver/model/location/BoatLocation;)V
  #252 = Methodref          #253.#254     // java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
  #253 = Class              #255          // java/util/Objects
  #254 = NameAndType        #256:#257     // requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
  #255 = Utf8               java/util/Objects
  #256 = Utf8               requireNonNull
  #257 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
  #258 = InvokeDynamic      #1:#259       // #1:accept:(Lext/mods/gameserver/model/actor/Boat;)Ljava/util/function/Consumer;
  #259 = NameAndType        #260:#261     // accept:(Lext/mods/gameserver/model/actor/Boat;)Ljava/util/function/Consumer;
  #260 = Utf8               accept
  #261 = Utf8               (Lext/mods/gameserver/model/actor/Boat;)Ljava/util/function/Consumer;
  #262 = Methodref          #46.#263      // ext/mods/gameserver/model/actor/Boat.forEachKnownType:(Ljava/lang/Class;Ljava/util/function/Consumer;)V
  #263 = NameAndType        #264:#265     // forEachKnownType:(Ljava/lang/Class;Ljava/util/function/Consumer;)V
  #264 = Utf8               forEachKnownType
  #265 = Utf8               (Ljava/lang/Class;Ljava/util/function/Consumer;)V
  #266 = Class              #267          // java/lang/Runnable
  #267 = Utf8               java/lang/Runnable
  #268 = Utf8               BOAT_BROADCAST_RADIUS
  #269 = Utf8               ConstantValue
  #270 = Integer            20000
  #271 = Utf8               Signature
  #272 = Utf8               Ljava/util/Iterator<Lext/mods/gameserver/model/boat/ScheduledBoatMessages;>;
  #273 = Utf8               (Lext/mods/gameserver/model/boat/BoatItinerary;)V
  #274 = Utf8               Code
  #275 = Utf8               LineNumberTable
  #276 = Utf8               LocalVariableTable
  #277 = Utf8               this
  #278 = Utf8               Lext/mods/gameserver/model/boat/BoatEngine;
  #279 = Utf8               itinerary
  #280 = Utf8               Lext/mods/gameserver/model/boat/BoatItinerary;
  #281 = Utf8               StackMapTable
  #282 = Utf8               toString
  #283 = Utf8               ()Ljava/lang/String;
  #284 = Utf8               getState
  #285 = Utf8               ()Lext/mods/gameserver/enums/boats/BoatState;
  #286 = Utf8               setState
  #287 = Utf8               (Lext/mods/gameserver/enums/boats/BoatState;)V
  #288 = Utf8               state
  #289 = Utf8               packet
  #290 = Utf8               Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;
  #291 = Utf8               player
  #292 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #293 = Utf8               packets
  #294 = Utf8               Ljava/util/List;
  #295 = Utf8               LocalVariableTypeTable
  #296 = Utf8               Ljava/util/List<Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;>;
  #297 = Utf8               (Ljava/util/List<Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;>;)V
  #298 = Utf8               [Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;
  #299 = Class              #298          // "[Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;"
  #300 = Utf8               canRun
  #301 = Utf8               routeInfo
  #302 = Utf8               Lext/mods/gameserver/model/boat/BoatRouteInfo;
  #303 = Utf8               dock
  #304 = Class              #77           // "[Lext/mods/gameserver/model/boat/BoatRouteInfo;"
  #305 = Utf8               run
  #306 = Utf8               sm
  #307 = Utf8               Lext/mods/gameserver/model/boat/ScheduledBoatMessages;
  #308 = Utf8               info
  #309 = Utf8               path
  #310 = Utf8               [Lext/mods/gameserver/model/location/BoatLocation;
  #311 = Utf8               temp
  #312 = Utf8               SourceFile
  #313 = Utf8               BoatEngine.java
  #314 = Utf8               NestMembers
  #315 = Utf8               BootstrapMethods
  #316 = String             #317          // BoatEngine [currentDock=\u0001, destinationDock=\u0001, state=\u0001]
  #317 = Utf8               BoatEngine [currentDock=\u0001, destinationDock=\u0001, state=\u0001]
  #318 = MethodType         #319          //  (Ljava/lang/Object;)V
  #319 = Utf8               (Ljava/lang/Object;)V
  #320 = MethodHandle       5:#321        // REF_invokeVirtual ext/mods/gameserver/model/actor/Boat.sendInfo:(Lext/mods/gameserver/model/actor/Player;)V
  #321 = Methodref          #46.#322      // ext/mods/gameserver/model/actor/Boat.sendInfo:(Lext/mods/gameserver/model/actor/Player;)V
  #322 = NameAndType        #323:#324     // sendInfo:(Lext/mods/gameserver/model/actor/Player;)V
  #323 = Utf8               sendInfo
  #324 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
  #325 = MethodType         #324          //  (Lext/mods/gameserver/model/actor/Player;)V
  #326 = MethodHandle       6:#327        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #327 = Methodref          #328.#329     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #328 = Class              #330          // java/lang/invoke/StringConcatFactory
  #329 = NameAndType        #139:#331     // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #330 = Utf8               java/lang/invoke/StringConcatFactory
  #331 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #332 = MethodHandle       6:#333        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #333 = Methodref          #334.#335     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #334 = Class              #336          // java/lang/invoke/LambdaMetafactory
  #335 = NameAndType        #337:#338     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #336 = Utf8               java/lang/invoke/LambdaMetafactory
  #337 = Utf8               metafactory
  #338 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #339 = Utf8               InnerClasses
  #340 = Class              #341          // java/lang/invoke/MethodHandles$Lookup
  #341 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #342 = Class              #343          // java/lang/invoke/MethodHandles
  #343 = Utf8               java/lang/invoke/MethodHandles
  #344 = Utf8               Lookup
{
  public ext.mods.gameserver.model.boat.BoatEngine(ext.mods.gameserver.model.boat.BoatItinerary);
    descriptor: (Lext/mods/gameserver/model/boat/BoatItinerary;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=2, args_size=2
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: iconst_3
         6: anewarray     #7                  // class ext/mods/gameserver/network/serverpackets/PlaySound
         9: putfield      #9                  // Field _sounds:[Lext/mods/gameserver/network/serverpackets/PlaySound;
        12: aload_0
        13: iconst_0
        14: putfield      #15                 // Field _shoutCount:I
        17: aload_0
        18: iconst_0
        19: putfield      #19                 // Field _delay:I
        22: aload_0
        23: getstatic     #22                 // Field ext/mods/gameserver/enums/boats/BoatState.PREPARING:Lext/mods/gameserver/enums/boats/BoatState;
        26: putfield      #28                 // Field _state:Lext/mods/gameserver/enums/boats/BoatState;
        29: aload_0
        30: invokestatic  #31                 // Method ext/mods/gameserver/data/xml/BoatData.getInstance:()Lext/mods/gameserver/data/xml/BoatData;
        33: aload_1
        34: invokevirtual #37                 // Method ext/mods/gameserver/data/xml/BoatData.getNewBoat:(Lext/mods/gameserver/model/boat/BoatItinerary;)Lext/mods/gameserver/model/actor/Boat;
        37: putfield      #41                 // Field _boat:Lext/mods/gameserver/model/actor/Boat;
        40: aload_0
        41: getfield      #41                 // Field _boat:Lext/mods/gameserver/model/actor/Boat;
        44: aload_0
        45: invokevirtual #45                 // Method ext/mods/gameserver/model/actor/Boat.setEngine:(Lext/mods/gameserver/model/boat/BoatEngine;)V
        48: aload_0
        49: aload_1
        50: invokevirtual #51                 // Method ext/mods/gameserver/model/boat/BoatItinerary.getInfo:()[Lext/mods/gameserver/model/boat/BoatRouteInfo;
        53: iconst_0
        54: aaload
        55: invokevirtual #57                 // Method ext/mods/gameserver/model/boat/BoatRouteInfo.getDock:()Lext/mods/gameserver/enums/boats/BoatDock;
        58: putfield      #63                 // Field _currentDock:Lext/mods/gameserver/enums/boats/BoatDock;
        61: aload_0
        62: aload_1
        63: invokevirtual #67                 // Method ext/mods/gameserver/model/boat/BoatItinerary.isOneWay:()Z
        66: ifeq          76
        69: aload_0
        70: getfield      #63                 // Field _currentDock:Lext/mods/gameserver/enums/boats/BoatDock;
        73: goto          85
        76: aload_1
        77: invokevirtual #51                 // Method ext/mods/gameserver/model/boat/BoatItinerary.getInfo:()[Lext/mods/gameserver/model/boat/BoatRouteInfo;
        80: iconst_1
        81: aaload
        82: invokevirtual #57                 // Method ext/mods/gameserver/model/boat/BoatRouteInfo.getDock:()Lext/mods/gameserver/enums/boats/BoatDock;
        85: putfield      #71                 // Field _destinationDock:Lext/mods/gameserver/enums/boats/BoatDock;
        88: aload_0
        89: aload_1
        90: invokevirtual #51                 // Method ext/mods/gameserver/model/boat/BoatItinerary.getInfo:()[Lext/mods/gameserver/model/boat/BoatRouteInfo;
        93: putfield      #74                 // Field _info:[Lext/mods/gameserver/model/boat/BoatRouteInfo;
        96: aload_0
        97: aload_0
        98: getfield      #63                 // Field _currentDock:Lext/mods/gameserver/enums/boats/BoatDock;
       101: getstatic     #78                 // Field ext/mods/gameserver/enums/boats/BoatDock.RUNE:Lext/mods/gameserver/enums/boats/BoatDock;
       104: if_acmpne     121
       107: aload_0
       108: getfield      #71                 // Field _destinationDock:Lext/mods/gameserver/enums/boats/BoatDock;
       111: getstatic     #83                 // Field ext/mods/gameserver/enums/boats/BoatDock.PRIMEVAL:Lext/mods/gameserver/enums/boats/BoatDock;
       114: if_acmpne     121
       117: iconst_0
       118: goto          124
       121: sipush        300
       124: putfield      #86                 // Field _waitDelay:I
       127: aload_0
       128: aload_0
       129: getfield      #86                 // Field _waitDelay:I
       132: putfield      #19                 // Field _delay:I
       135: aload_0
       136: getfield      #9                  // Field _sounds:[Lext/mods/gameserver/network/serverpackets/PlaySound;
       139: iconst_0
       140: getstatic     #89                 // Field ext/mods/gameserver/enums/boats/BoatSound.LEAVE_5_MIN:Lext/mods/gameserver/enums/boats/BoatSound;
       143: aload_0
       144: getfield      #41                 // Field _boat:Lext/mods/gameserver/model/actor/Boat;
       147: invokevirtual #95                 // Method ext/mods/gameserver/enums/boats/BoatSound.get:(Lext/mods/gameserver/model/actor/Boat;)Lext/mods/gameserver/network/serverpackets/PlaySound;
       150: aastore
       151: aload_0
       152: getfield      #9                  // Field _sounds:[Lext/mods/gameserver/network/serverpackets/PlaySound;
       155: iconst_1
       156: getstatic     #99                 // Field ext/mods/gameserver/enums/boats/BoatSound.LEAVE_1_MIN:Lext/mods/gameserver/enums/boats/BoatSound;
       159: aload_0
       160: getfield      #41                 // Field _boat:Lext/mods/gameserver/model/actor/Boat;
       163: invokevirtual #95                 // Method ext/mods/gameserver/enums/boats/BoatSound.get:(Lext/mods/gameserver/model/actor/Boat;)Lext/mods/gameserver/network/serverpackets/PlaySound;
       166: aastore
       167: aload_0
       168: getfield      #9                  // Field _sounds:[Lext/mods/gameserver/network/serverpackets/PlaySound;
       171: iconst_2
       172: getstatic     #102                // Field ext/mods/gameserver/enums/boats/BoatSound.ARRIVAL_DEPARTURE:Lext/mods/gameserver/enums/boats/BoatSound;
       175: aload_0
       176: getfield      #41                 // Field _boat:Lext/mods/gameserver/model/actor/Boat;
       179: invokevirtual #95                 // Method ext/mods/gameserver/enums/boats/BoatSound.get:(Lext/mods/gameserver/model/actor/Boat;)Lext/mods/gameserver/network/serverpackets/PlaySound;
       182: aastore
       183: aload_0
       184: aload_0
       185: aload_0
       186: getfield      #63                 // Field _currentDock:Lext/mods/gameserver/enums/boats/BoatDock;
       189: invokevirtual #105                // Method getRouteInfoByDock:(Lext/mods/gameserver/enums/boats/BoatDock;)Lext/mods/gameserver/model/boat/BoatRouteInfo;
       192: invokevirtual #109                // Method ext/mods/gameserver/model/boat/BoatRouteInfo.getScheduledMessages:()Ljava/util/List;
       195: invokeinterface #113,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
       200: putfield      #119                // Field _messages:Ljava/util/Iterator;
       203: invokestatic  #123                // Method ext/mods/gameserver/taskmanager/BoatTaskManager.getInstance:()Lext/mods/gameserver/taskmanager/BoatTaskManager;
       206: aload_0
       207: invokevirtual #128                // Method ext/mods/gameserver/taskmanager/BoatTaskManager.add:(Lext/mods/gameserver/model/boat/BoatEngine;)V
       210: return
      LineNumberTable:
        line 55: 0
        line 44: 4
        line 46: 12
        line 47: 17
        line 52: 22
        line 56: 29
        line 57: 40
        line 59: 48
        line 60: 61
        line 62: 88
        line 64: 96
        line 65: 127
        line 67: 135
        line 68: 151
        line 69: 167
        line 71: 183
        line 73: 203
        line 74: 210
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     211     0  this   Lext/mods/gameserver/model/boat/BoatEngine;
            0     211     1 itinerary   Lext/mods/gameserver/model/boat/BoatItinerary;
      StackMapTable: number_of_entries = 4
        frame_type = 255 /* full_frame */
          offset_delta = 76
          locals = [ class ext/mods/gameserver/model/boat/BoatEngine, class ext/mods/gameserver/model/boat/BoatItinerary ]
          stack = [ class ext/mods/gameserver/model/boat/BoatEngine ]
        frame_type = 255 /* full_frame */
          offset_delta = 8
          locals = [ class ext/mods/gameserver/model/boat/BoatEngine, class ext/mods/gameserver/model/boat/BoatItinerary ]
          stack = [ class ext/mods/gameserver/model/boat/BoatEngine, class ext/mods/gameserver/enums/boats/BoatDock ]
        frame_type = 99 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/model/boat/BoatEngine ]
        frame_type = 255 /* full_frame */
          offset_delta = 2
          locals = [ class ext/mods/gameserver/model/boat/BoatEngine, class ext/mods/gameserver/model/boat/BoatItinerary ]
          stack = [ class ext/mods/gameserver/model/boat/BoatEngine, int ]

  public java.lang.String toString();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=1, args_size=1
         0: aload_0
         1: getfield      #63                 // Field _currentDock:Lext/mods/gameserver/enums/boats/BoatDock;
         4: invokestatic  #131                // Method java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
         7: aload_0
         8: getfield      #71                 // Field _destinationDock:Lext/mods/gameserver/enums/boats/BoatDock;
        11: invokestatic  #131                // Method java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        14: aload_0
        15: getfield      #28                 // Field _state:Lext/mods/gameserver/enums/boats/BoatState;
        18: invokestatic  #131                // Method java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        21: invokedynamic #137,  0            // InvokeDynamic #0:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        26: areturn
      LineNumberTable:
        line 79: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      27     0  this   Lext/mods/gameserver/model/boat/BoatEngine;

  public ext.mods.gameserver.enums.boats.BoatDock getDock();
    descriptor: ()Lext/mods/gameserver/enums/boats/BoatDock;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #63                 // Field _currentDock:Lext/mods/gameserver/enums/boats/BoatDock;
         4: areturn
      LineNumberTable:
        line 87: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/boat/BoatEngine;

  public ext.mods.gameserver.enums.boats.BoatState getState();
    descriptor: ()Lext/mods/gameserver/enums/boats/BoatState;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #28                 // Field _state:Lext/mods/gameserver/enums/boats/BoatState;
         4: areturn
      LineNumberTable:
        line 92: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/boat/BoatEngine;

  public void setState(ext.mods.gameserver.enums.boats.BoatState);
    descriptor: (Lext/mods/gameserver/enums/boats/BoatState;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: putfield      #28                 // Field _state:Lext/mods/gameserver/enums/boats/BoatState;
         5: return
      LineNumberTable:
        line 97: 0
        line 98: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/boat/BoatEngine;
            0       6     1 state   Lext/mods/gameserver/enums/boats/BoatState;

  public void broadcast(java.util.List<ext.mods.gameserver.network.serverpackets.L2GameServerPacket>);
    descriptor: (Ljava/util/List;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=6, args_size=2
         0: aload_1
         1: ifnull        13
         4: aload_1
         5: invokeinterface #141,  1          // InterfaceMethod java/util/List.isEmpty:()Z
        10: ifeq          14
        13: return
        14: invokestatic  #144                // Method ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
        17: invokevirtual #149                // Method ext/mods/gameserver/model/World.getPlayers:()Ljava/util/Collection;
        20: invokeinterface #153,  1          // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
        25: astore_2
        26: aload_2
        27: invokeinterface #156,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        32: ifeq          140
        35: aload_2
        36: invokeinterface #161,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        41: checkcast     #165                // class ext/mods/gameserver/model/actor/Player
        44: astore_3
        45: aload_3
        46: aload_0
        47: getfield      #74                 // Field _info:[Lext/mods/gameserver/model/boat/BoatRouteInfo;
        50: iconst_0
        51: aaload
        52: invokevirtual #57                 // Method ext/mods/gameserver/model/boat/BoatRouteInfo.getDock:()Lext/mods/gameserver/enums/boats/BoatDock;
        55: invokevirtual #167                // Method ext/mods/gameserver/enums/boats/BoatDock.getDockLoc:()Lext/mods/gameserver/model/location/BoatLocation;
        58: sipush        20000
        61: invokevirtual #171                // Method ext/mods/gameserver/model/actor/Player.isIn2DRadius:(Lext/mods/gameserver/model/location/Location;I)Z
        64: ifne          98
        67: aload_0
        68: getfield      #74                 // Field _info:[Lext/mods/gameserver/model/boat/BoatRouteInfo;
        71: iconst_1
        72: aaload
        73: ifnull        137
        76: aload_3
        77: aload_0
        78: getfield      #74                 // Field _info:[Lext/mods/gameserver/model/boat/BoatRouteInfo;
        81: iconst_1
        82: aaload
        83: invokevirtual #57                 // Method ext/mods/gameserver/model/boat/BoatRouteInfo.getDock:()Lext/mods/gameserver/enums/boats/BoatDock;
        86: invokevirtual #167                // Method ext/mods/gameserver/enums/boats/BoatDock.getDockLoc:()Lext/mods/gameserver/model/location/BoatLocation;
        89: sipush        20000
        92: invokevirtual #171                // Method ext/mods/gameserver/model/actor/Player.isIn2DRadius:(Lext/mods/gameserver/model/location/Location;I)Z
        95: ifeq          137
        98: aload_1
        99: invokeinterface #113,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
       104: astore        4
       106: aload         4
       108: invokeinterface #156,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       113: ifeq          137
       116: aload         4
       118: invokeinterface #161,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       123: checkcast     #175                // class ext/mods/gameserver/network/serverpackets/L2GameServerPacket
       126: astore        5
       128: aload_3
       129: aload         5
       131: invokevirtual #177                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       134: goto          106
       137: goto          26
       140: return
      LineNumberTable:
        line 106: 0
        line 107: 13
        line 109: 14
        line 111: 45
        line 113: 98
        line 114: 128
        line 116: 137
        line 117: 140
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          128       6     5 packet   Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;
           45      92     3 player   Lext/mods/gameserver/model/actor/Player;
            0     141     0  this   Lext/mods/gameserver/model/boat/BoatEngine;
            0     141     1 packets   Ljava/util/List;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0     141     1 packets   Ljava/util/List<Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;>;
      StackMapTable: number_of_entries = 7
        frame_type = 13 /* same */
        frame_type = 0 /* same */
        frame_type = 252 /* append */
          offset_delta = 11
          locals = [ class java/util/Iterator ]
        frame_type = 252 /* append */
          offset_delta = 71
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 252 /* append */
          offset_delta = 7
          locals = [ class java/util/Iterator ]
        frame_type = 249 /* chop */
          offset_delta = 30
        frame_type = 250 /* chop */
          offset_delta = 2
    Signature: #297                         // (Ljava/util/List<Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;>;)V

  public void broadcast(ext.mods.gameserver.network.serverpackets.L2GameServerPacket...);
    descriptor: ([Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
    flags: (0x0081) ACC_PUBLIC, ACC_VARARGS
    Code:
      stack=3, locals=8, args_size=2
         0: aload_1
         1: ifnull        9
         4: aload_1
         5: arraylength
         6: ifne          10
         9: return
        10: invokestatic  #144                // Method ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
        13: invokevirtual #149                // Method ext/mods/gameserver/model/World.getPlayers:()Ljava/util/Collection;
        16: invokeinterface #153,  1          // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
        21: astore_2
        22: aload_2
        23: invokeinterface #156,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        28: ifeq          134
        31: aload_2
        32: invokeinterface #161,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        37: checkcast     #165                // class ext/mods/gameserver/model/actor/Player
        40: astore_3
        41: aload_3
        42: aload_0
        43: getfield      #74                 // Field _info:[Lext/mods/gameserver/model/boat/BoatRouteInfo;
        46: iconst_0
        47: aaload
        48: invokevirtual #57                 // Method ext/mods/gameserver/model/boat/BoatRouteInfo.getDock:()Lext/mods/gameserver/enums/boats/BoatDock;
        51: invokevirtual #167                // Method ext/mods/gameserver/enums/boats/BoatDock.getDockLoc:()Lext/mods/gameserver/model/location/BoatLocation;
        54: sipush        20000
        57: invokevirtual #171                // Method ext/mods/gameserver/model/actor/Player.isIn2DRadius:(Lext/mods/gameserver/model/location/Location;I)Z
        60: ifne          94
        63: aload_0
        64: getfield      #74                 // Field _info:[Lext/mods/gameserver/model/boat/BoatRouteInfo;
        67: iconst_1
        68: aaload
        69: ifnull        131
        72: aload_3
        73: aload_0
        74: getfield      #74                 // Field _info:[Lext/mods/gameserver/model/boat/BoatRouteInfo;
        77: iconst_1
        78: aaload
        79: invokevirtual #57                 // Method ext/mods/gameserver/model/boat/BoatRouteInfo.getDock:()Lext/mods/gameserver/enums/boats/BoatDock;
        82: invokevirtual #167                // Method ext/mods/gameserver/enums/boats/BoatDock.getDockLoc:()Lext/mods/gameserver/model/location/BoatLocation;
        85: sipush        20000
        88: invokevirtual #171                // Method ext/mods/gameserver/model/actor/Player.isIn2DRadius:(Lext/mods/gameserver/model/location/Location;I)Z
        91: ifeq          131
        94: aload_1
        95: astore        4
        97: aload         4
        99: arraylength
       100: istore        5
       102: iconst_0
       103: istore        6
       105: iload         6
       107: iload         5
       109: if_icmpge     131
       112: aload         4
       114: iload         6
       116: aaload
       117: astore        7
       119: aload_3
       120: aload         7
       122: invokevirtual #177                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       125: iinc          6, 1
       128: goto          105
       131: goto          22
       134: return
      LineNumberTable:
        line 125: 0
        line 126: 9
        line 128: 10
        line 130: 41
        line 132: 94
        line 133: 119
        line 132: 125
        line 135: 131
        line 136: 134
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          119       6     7 packet   Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;
           41      90     3 player   Lext/mods/gameserver/model/actor/Player;
            0     135     0  this   Lext/mods/gameserver/model/boat/BoatEngine;
            0     135     1 packets   [Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;
      StackMapTable: number_of_entries = 7
        frame_type = 9 /* same */
        frame_type = 0 /* same */
        frame_type = 252 /* append */
          offset_delta = 11
          locals = [ class java/util/Iterator ]
        frame_type = 252 /* append */
          offset_delta = 71
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 254 /* append */
          offset_delta = 10
          locals = [ class "[Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;", int, int ]
        frame_type = 255 /* full_frame */
          offset_delta = 25
          locals = [ class ext/mods/gameserver/model/boat/BoatEngine, class "[Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;", class java/util/Iterator ]
          stack = []
        frame_type = 250 /* chop */
          offset_delta = 2

  public boolean canRun();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=1, args_size=1
         0: aload_0
         1: getfield      #19                 // Field _delay:I
         4: ifle          17
         7: aload_0
         8: dup
         9: getfield      #19                 // Field _delay:I
        12: iconst_1
        13: isub
        14: putfield      #19                 // Field _delay:I
        17: aload_0
        18: getfield      #19                 // Field _delay:I
        21: ifne          28
        24: iconst_1
        25: goto          29
        28: iconst_0
        29: ireturn
      LineNumberTable:
        line 140: 0
        line 141: 7
        line 143: 17
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      30     0  this   Lext/mods/gameserver/model/boat/BoatEngine;
      StackMapTable: number_of_entries = 3
        frame_type = 17 /* same */
        frame_type = 10 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public ext.mods.gameserver.model.boat.BoatRouteInfo getRouteInfoByDock(ext.mods.gameserver.enums.boats.BoatDock);
    descriptor: (Lext/mods/gameserver/enums/boats/BoatDock;)Lext/mods/gameserver/model/boat/BoatRouteInfo;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=6, args_size=2
         0: aload_0
         1: getfield      #74                 // Field _info:[Lext/mods/gameserver/model/boat/BoatRouteInfo;
         4: astore_2
         5: aload_2
         6: arraylength
         7: istore_3
         8: iconst_0
         9: istore        4
        11: iload         4
        13: iload_3
        14: if_icmpge     41
        17: aload_2
        18: iload         4
        20: aaload
        21: astore        5
        23: aload         5
        25: invokevirtual #57                 // Method ext/mods/gameserver/model/boat/BoatRouteInfo.getDock:()Lext/mods/gameserver/enums/boats/BoatDock;
        28: aload_1
        29: if_acmpne     35
        32: aload         5
        34: areturn
        35: iinc          4, 1
        38: goto          11
        41: aconst_null
        42: areturn
      LineNumberTable:
        line 152: 0
        line 154: 23
        line 155: 32
        line 152: 35
        line 157: 41
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           23      12     5 routeInfo   Lext/mods/gameserver/model/boat/BoatRouteInfo;
            0      43     0  this   Lext/mods/gameserver/model/boat/BoatEngine;
            0      43     1  dock   Lext/mods/gameserver/enums/boats/BoatDock;
      StackMapTable: number_of_entries = 3
        frame_type = 254 /* append */
          offset_delta = 11
          locals = [ class "[Lext/mods/gameserver/model/boat/BoatRouteInfo;", int, int ]
        frame_type = 23 /* same */
        frame_type = 248 /* chop */
          offset_delta = 5

  public void run();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=4, args_size=1
         0: getstatic     #181                // Field ext/mods/gameserver/model/boat/BoatEngine$1.$SwitchMap$ext$mods$gameserver$enums$boats$BoatState:[I
         3: aload_0
         4: getfield      #28                 // Field _state:Lext/mods/gameserver/enums/boats/BoatState;
         7: invokevirtual #187                // Method ext/mods/gameserver/enums/boats/BoatState.ordinal:()I
        10: iaload
        11: tableswitch   { // 1 to 4

                       1: 40

                       2: 170

                       3: 246

                       4: 374
                 default: 467
            }
        40: aload_0
        41: getfield      #119                // Field _messages:Ljava/util/Iterator;
        44: invokeinterface #156,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        49: ifeq          160
        52: aload_0
        53: getfield      #119                // Field _messages:Ljava/util/Iterator;
        56: invokeinterface #161,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        61: checkcast     #191                // class ext/mods/gameserver/model/boat/ScheduledBoatMessages
        64: astore_1
        65: aload_0
        66: aload_1
        67: invokevirtual #193                // Method ext/mods/gameserver/model/boat/ScheduledBoatMessages.getMessages:()Ljava/util/List;
        70: invokevirtual #196                // Method broadcast:(Ljava/util/List;)V
        73: aload_0
        74: aload_1
        75: invokevirtual #200                // Method ext/mods/gameserver/model/boat/ScheduledBoatMessages.getDelay:()I
        78: putfield      #19                 // Field _delay:I
        81: aload_0
        82: getfield      #19                 // Field _delay:I
        85: lookupswitch  { // 3

                      20: 140

                      40: 140

                     240: 120
                 default: 157
            }
       120: aload_0
       121: iconst_1
       122: anewarray     #175                // class ext/mods/gameserver/network/serverpackets/L2GameServerPacket
       125: dup
       126: iconst_0
       127: aload_0
       128: getfield      #9                  // Field _sounds:[Lext/mods/gameserver/network/serverpackets/PlaySound;
       131: iconst_0
       132: aaload
       133: aastore
       134: invokevirtual #203                // Method broadcast:([Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       137: goto          157
       140: aload_0
       141: iconst_1
       142: anewarray     #175                // class ext/mods/gameserver/network/serverpackets/L2GameServerPacket
       145: dup
       146: iconst_0
       147: aload_0
       148: getfield      #9                  // Field _sounds:[Lext/mods/gameserver/network/serverpackets/PlaySound;
       151: iconst_1
       152: aaload
       153: aastore
       154: invokevirtual #203                // Method broadcast:([Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       157: goto          467
       160: aload_0
       161: getstatic     #206                // Field ext/mods/gameserver/enums/boats/BoatState.EXECUTE_ROUTE:Lext/mods/gameserver/enums/boats/BoatState;
       164: putfield      #28                 // Field _state:Lext/mods/gameserver/enums/boats/BoatState;
       167: goto          467
       170: aload_0
       171: aload_0
       172: getfield      #63                 // Field _currentDock:Lext/mods/gameserver/enums/boats/BoatDock;
       175: invokevirtual #105                // Method getRouteInfoByDock:(Lext/mods/gameserver/enums/boats/BoatDock;)Lext/mods/gameserver/model/boat/BoatRouteInfo;
       178: astore_1
       179: aload_0
       180: getfield      #41                 // Field _boat:Lext/mods/gameserver/model/actor/Boat;
       183: aload_1
       184: invokevirtual #209                // Method ext/mods/gameserver/model/boat/BoatRouteInfo.getItemId:()I
       187: aload_1
       188: invokevirtual #57                 // Method ext/mods/gameserver/model/boat/BoatRouteInfo.getDock:()Lext/mods/gameserver/enums/boats/BoatDock;
       191: invokevirtual #212                // Method ext/mods/gameserver/enums/boats/BoatDock.getOustLoc:()Lext/mods/gameserver/model/location/Location;
       194: invokevirtual #216                // Method ext/mods/gameserver/model/actor/Boat.payForRide:(ILext/mods/gameserver/model/location/Location;)V
       197: aload_0
       198: getfield      #41                 // Field _boat:Lext/mods/gameserver/model/actor/Boat;
       201: invokevirtual #220                // Method ext/mods/gameserver/model/actor/Boat.getMove:()Lext/mods/gameserver/model/actor/move/BoatMove;
       204: aload_1
       205: invokevirtual #224                // Method ext/mods/gameserver/model/boat/BoatRouteInfo.getPaths:()[Lext/mods/gameserver/model/location/BoatLocation;
       208: invokevirtual #228                // Method ext/mods/gameserver/model/actor/move/BoatMove.executePath:([Lext/mods/gameserver/model/location/BoatLocation;)V
       211: aload_1
       212: invokevirtual #57                 // Method ext/mods/gameserver/model/boat/BoatRouteInfo.getDock:()Lext/mods/gameserver/enums/boats/BoatDock;
       215: iconst_0
       216: invokevirtual #234                // Method ext/mods/gameserver/enums/boats/BoatDock.setBusy:(Z)V
       219: aload_0
       220: iconst_1
       221: anewarray     #175                // class ext/mods/gameserver/network/serverpackets/L2GameServerPacket
       224: dup
       225: iconst_0
       226: aload_0
       227: getfield      #9                  // Field _sounds:[Lext/mods/gameserver/network/serverpackets/PlaySound;
       230: iconst_2
       231: aaload
       232: aastore
       233: invokevirtual #203                // Method broadcast:([Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       236: aload_0
       237: getstatic     #238                // Field ext/mods/gameserver/enums/boats/BoatState.SEALING:Lext/mods/gameserver/enums/boats/BoatState;
       240: putfield      #28                 // Field _state:Lext/mods/gameserver/enums/boats/BoatState;
       243: goto          467
       246: aload_0
       247: getfield      #71                 // Field _destinationDock:Lext/mods/gameserver/enums/boats/BoatDock;
       250: invokevirtual #241                // Method ext/mods/gameserver/enums/boats/BoatDock.isBusy:()Z
       253: ifeq          328
       256: aload_0
       257: iconst_5
       258: putfield      #19                 // Field _delay:I
       261: aload_0
       262: getfield      #15                 // Field _shoutCount:I
       265: ifne          290
       268: aload_0
       269: iconst_1
       270: anewarray     #175                // class ext/mods/gameserver/network/serverpackets/L2GameServerPacket
       273: dup
       274: iconst_0
       275: aload_0
       276: aload_0
       277: getfield      #71                 // Field _destinationDock:Lext/mods/gameserver/enums/boats/BoatDock;
       280: invokevirtual #105                // Method getRouteInfoByDock:(Lext/mods/gameserver/enums/boats/BoatDock;)Lext/mods/gameserver/model/boat/BoatRouteInfo;
       283: invokevirtual #244                // Method ext/mods/gameserver/model/boat/BoatRouteInfo.getBusyMessage:()Lext/mods/gameserver/network/serverpackets/BoatSay;
       286: aastore
       287: invokevirtual #203                // Method broadcast:([Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       290: aload_0
       291: dup
       292: getfield      #15                 // Field _shoutCount:I
       295: iconst_1
       296: iadd
       297: putfield      #15                 // Field _shoutCount:I
       300: aload_0
       301: getfield      #15                 // Field _shoutCount:I
       304: bipush        35
       306: if_icmple     314
       309: aload_0
       310: iconst_0
       311: putfield      #15                 // Field _shoutCount:I
       314: aload_0
       315: aload_0
       316: getfield      #15                 // Field _shoutCount:I
       319: iconst_1
       320: iadd
       321: bipush        36
       323: irem
       324: putfield      #15                 // Field _shoutCount:I
       327: return
       328: aload_0
       329: getfield      #71                 // Field _destinationDock:Lext/mods/gameserver/enums/boats/BoatDock;
       332: iconst_1
       333: invokevirtual #234                // Method ext/mods/gameserver/enums/boats/BoatDock.setBusy:(Z)V
       336: aload_0
       337: aload_0
       338: getfield      #63                 // Field _currentDock:Lext/mods/gameserver/enums/boats/BoatDock;
       341: invokevirtual #105                // Method getRouteInfoByDock:(Lext/mods/gameserver/enums/boats/BoatDock;)Lext/mods/gameserver/model/boat/BoatRouteInfo;
       344: invokevirtual #224                // Method ext/mods/gameserver/model/boat/BoatRouteInfo.getPaths:()[Lext/mods/gameserver/model/location/BoatLocation;
       347: astore_2
       348: aload_0
       349: getfield      #41                 // Field _boat:Lext/mods/gameserver/model/actor/Boat;
       352: invokevirtual #220                // Method ext/mods/gameserver/model/actor/Boat.getMove:()Lext/mods/gameserver/model/actor/move/BoatMove;
       355: aload_2
       356: aload_2
       357: arraylength
       358: iconst_1
       359: isub
       360: aaload
       361: invokevirtual #248                // Method ext/mods/gameserver/model/actor/move/BoatMove.moveToBoatLocation:(Lext/mods/gameserver/model/location/BoatLocation;)V
       364: aload_0
       365: getstatic     #238                // Field ext/mods/gameserver/enums/boats/BoatState.SEALING:Lext/mods/gameserver/enums/boats/BoatState;
       368: putfield      #28                 // Field _state:Lext/mods/gameserver/enums/boats/BoatState;
       371: goto          467
       374: aload_0
       375: aload_0
       376: getfield      #86                 // Field _waitDelay:I
       379: putfield      #19                 // Field _delay:I
       382: aload_0
       383: iconst_1
       384: anewarray     #175                // class ext/mods/gameserver/network/serverpackets/L2GameServerPacket
       387: dup
       388: iconst_0
       389: aload_0
       390: getfield      #9                  // Field _sounds:[Lext/mods/gameserver/network/serverpackets/PlaySound;
       393: iconst_2
       394: aaload
       395: aastore
       396: invokevirtual #203                // Method broadcast:([Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       399: aload_0
       400: getfield      #63                 // Field _currentDock:Lext/mods/gameserver/enums/boats/BoatDock;
       403: astore_3
       404: aload_0
       405: aload_0
       406: getfield      #71                 // Field _destinationDock:Lext/mods/gameserver/enums/boats/BoatDock;
       409: putfield      #63                 // Field _currentDock:Lext/mods/gameserver/enums/boats/BoatDock;
       412: aload_0
       413: aload_3
       414: putfield      #71                 // Field _destinationDock:Lext/mods/gameserver/enums/boats/BoatDock;
       417: aload_0
       418: aload_0
       419: aload_0
       420: getfield      #63                 // Field _currentDock:Lext/mods/gameserver/enums/boats/BoatDock;
       423: invokevirtual #105                // Method getRouteInfoByDock:(Lext/mods/gameserver/enums/boats/BoatDock;)Lext/mods/gameserver/model/boat/BoatRouteInfo;
       426: invokevirtual #109                // Method ext/mods/gameserver/model/boat/BoatRouteInfo.getScheduledMessages:()Ljava/util/List;
       429: invokeinterface #113,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
       434: putfield      #119                // Field _messages:Ljava/util/Iterator;
       437: aload_0
       438: getfield      #41                 // Field _boat:Lext/mods/gameserver/model/actor/Boat;
       441: ldc           #165                // class ext/mods/gameserver/model/actor/Player
       443: aload_0
       444: getfield      #41                 // Field _boat:Lext/mods/gameserver/model/actor/Boat;
       447: dup
       448: invokestatic  #252                // Method java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
       451: pop
       452: invokedynamic #258,  0            // InvokeDynamic #1:accept:(Lext/mods/gameserver/model/actor/Boat;)Ljava/util/function/Consumer;
       457: invokevirtual #262                // Method ext/mods/gameserver/model/actor/Boat.forEachKnownType:(Ljava/lang/Class;Ljava/util/function/Consumer;)V
       460: aload_0
       461: getstatic     #22                 // Field ext/mods/gameserver/enums/boats/BoatState.PREPARING:Lext/mods/gameserver/enums/boats/BoatState;
       464: putfield      #28                 // Field _state:Lext/mods/gameserver/enums/boats/BoatState;
       467: return
      LineNumberTable:
        line 163: 0
        line 166: 40
        line 168: 52
        line 170: 65
        line 172: 73
        line 174: 81
        line 176: 120
        line 177: 140
        line 179: 157
        line 181: 160
        line 183: 167
        line 186: 170
        line 188: 179
        line 189: 197
        line 191: 211
        line 193: 219
        line 195: 236
        line 196: 243
        line 199: 246
        line 201: 256
        line 203: 261
        line 204: 268
        line 206: 290
        line 207: 300
        line 208: 309
        line 210: 314
        line 211: 327
        line 214: 328
        line 216: 336
        line 217: 348
        line 219: 364
        line 220: 371
        line 223: 374
        line 225: 382
        line 227: 399
        line 229: 404
        line 230: 412
        line 232: 417
        line 234: 437
        line 236: 460
        line 239: 467
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           65      92     1    sm   Lext/mods/gameserver/model/boat/ScheduledBoatMessages;
          179      67     1  info   Lext/mods/gameserver/model/boat/BoatRouteInfo;
          348      26     2  path   [Lext/mods/gameserver/model/location/BoatLocation;
          404      63     3  temp   Lext/mods/gameserver/enums/boats/BoatDock;
            0     468     0  this   Lext/mods/gameserver/model/boat/BoatEngine;
      StackMapTable: number_of_entries = 12
        frame_type = 40 /* same */
        frame_type = 252 /* append */
          offset_delta = 79
          locals = [ class ext/mods/gameserver/model/boat/ScheduledBoatMessages ]
        frame_type = 19 /* same */
        frame_type = 250 /* chop */
          offset_delta = 16
        frame_type = 2 /* same */
        frame_type = 9 /* same */
        frame_type = 251 /* same_frame_extended */
          offset_delta = 75
        frame_type = 43 /* same */
        frame_type = 23 /* same */
        frame_type = 13 /* same */
        frame_type = 45 /* same */
        frame_type = 251 /* same_frame_extended */
          offset_delta = 92
}
SourceFile: "BoatEngine.java"
NestMembers:
  ext/mods/gameserver/model/boat/BoatEngine$1
BootstrapMethods:
  0: #326 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #316 BoatEngine [currentDock=\u0001, destinationDock=\u0001, state=\u0001]
  1: #332 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #318 (Ljava/lang/Object;)V
      #320 REF_invokeVirtual ext/mods/gameserver/model/actor/Boat.sendInfo:(Lext/mods/gameserver/model/actor/Player;)V
      #325 (Lext/mods/gameserver/model/actor/Player;)V
InnerClasses:
  static #182;                            // class ext/mods/gameserver/model/boat/BoatEngine$1
  public static final #344= #340 of #342; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
