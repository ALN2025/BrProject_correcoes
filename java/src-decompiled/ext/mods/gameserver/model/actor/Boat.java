// Bytecode for: ext.mods.gameserver.model.actor.Boat
// File: ext\mods\gameserver\model\actor\Boat.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/actor/Boat.class
  Last modified 9 de jul de 2026; size 10537 bytes
  MD5 checksum d1dcefbb84450bad53d0f9fc115bdbd0
  Compiled from "Boat.java"
public class ext.mods.gameserver.model.actor.Boat extends ext.mods.gameserver.model.actor.Creature
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #14                         // ext/mods/gameserver/model/actor/Boat
  super_class: #2                         // ext/mods/gameserver/model/actor/Creature
  interfaces: 0, fields: 3, methods: 36, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/gameserver/model/actor/Creature."<init>":(ILext/mods/gameserver/model/actor/template/CreatureTemplate;)V
    #2 = Class              #4            // ext/mods/gameserver/model/actor/Creature
    #3 = NameAndType        #5:#6         // "<init>":(ILext/mods/gameserver/model/actor/template/CreatureTemplate;)V
    #4 = Utf8               ext/mods/gameserver/model/actor/Creature
    #5 = Utf8               <init>
    #6 = Utf8               (ILext/mods/gameserver/model/actor/template/CreatureTemplate;)V
    #7 = Methodref          #8.#9         // java/util/concurrent/ConcurrentHashMap.newKeySet:()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;
    #8 = Class              #10           // java/util/concurrent/ConcurrentHashMap
    #9 = NameAndType        #11:#12       // newKeySet:()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;
   #10 = Utf8               java/util/concurrent/ConcurrentHashMap
   #11 = Utf8               newKeySet
   #12 = Utf8               ()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;
   #13 = Fieldref           #14.#15       // ext/mods/gameserver/model/actor/Boat._passengers:Ljava/util/Set;
   #14 = Class              #16           // ext/mods/gameserver/model/actor/Boat
   #15 = NameAndType        #17:#18       // _passengers:Ljava/util/Set;
   #16 = Utf8               ext/mods/gameserver/model/actor/Boat
   #17 = Utf8               _passengers
   #18 = Utf8               Ljava/util/Set;
   #19 = Fieldref           #14.#20       // ext/mods/gameserver/model/actor/Boat._ai:Lext/mods/gameserver/model/actor/ai/type/CreatureAI;
   #20 = NameAndType        #21:#22       // _ai:Lext/mods/gameserver/model/actor/ai/type/CreatureAI;
   #21 = Utf8               _ai
   #22 = Utf8               Lext/mods/gameserver/model/actor/ai/type/CreatureAI;
   #23 = Class              #24           // ext/mods/gameserver/model/actor/ai/type/BoatAI
   #24 = Utf8               ext/mods/gameserver/model/actor/ai/type/BoatAI
   #25 = Methodref          #23.#26       // ext/mods/gameserver/model/actor/ai/type/BoatAI."<init>":(Lext/mods/gameserver/model/actor/Boat;)V
   #26 = NameAndType        #5:#27        // "<init>":(Lext/mods/gameserver/model/actor/Boat;)V
   #27 = Utf8               (Lext/mods/gameserver/model/actor/Boat;)V
   #28 = Fieldref           #14.#29       // ext/mods/gameserver/model/actor/Boat._status:Lext/mods/gameserver/model/actor/status/CreatureStatus;
   #29 = NameAndType        #30:#31       // _status:Lext/mods/gameserver/model/actor/status/CreatureStatus;
   #30 = Utf8               _status
   #31 = Utf8               Lext/mods/gameserver/model/actor/status/CreatureStatus;
   #32 = Class              #33           // ext/mods/gameserver/model/actor/status/BoatStatus
   #33 = Utf8               ext/mods/gameserver/model/actor/status/BoatStatus
   #34 = Methodref          #32.#26       // ext/mods/gameserver/model/actor/status/BoatStatus."<init>":(Lext/mods/gameserver/model/actor/Boat;)V
   #35 = Fieldref           #14.#36       // ext/mods/gameserver/model/actor/Boat._move:Lext/mods/gameserver/model/actor/move/CreatureMove;
   #36 = NameAndType        #37:#38       // _move:Lext/mods/gameserver/model/actor/move/CreatureMove;
   #37 = Utf8               _move
   #38 = Utf8               Lext/mods/gameserver/model/actor/move/CreatureMove;
   #39 = Class              #40           // ext/mods/gameserver/model/actor/move/BoatMove
   #40 = Utf8               ext/mods/gameserver/model/actor/move/BoatMove
   #41 = Methodref          #39.#26       // ext/mods/gameserver/model/actor/move/BoatMove."<init>":(Lext/mods/gameserver/model/actor/Boat;)V
   #42 = Fieldref           #14.#43       // ext/mods/gameserver/model/actor/Boat._isTeleporting:Ljava/util/concurrent/atomic/AtomicBoolean;
   #43 = NameAndType        #44:#45       // _isTeleporting:Ljava/util/concurrent/atomic/AtomicBoolean;
   #44 = Utf8               _isTeleporting
   #45 = Utf8               Ljava/util/concurrent/atomic/AtomicBoolean;
   #46 = Methodref          #47.#48       // java/util/concurrent/atomic/AtomicBoolean.compareAndSet:(ZZ)Z
   #47 = Class              #49           // java/util/concurrent/atomic/AtomicBoolean
   #48 = NameAndType        #50:#51       // compareAndSet:(ZZ)Z
   #49 = Utf8               java/util/concurrent/atomic/AtomicBoolean
   #50 = Utf8               compareAndSet
   #51 = Utf8               (ZZ)Z
   #52 = Methodref          #14.#53       // ext/mods/gameserver/model/actor/Boat.stopPayTask:()V
   #53 = NameAndType        #54:#55       // stopPayTask:()V
   #54 = Utf8               stopPayTask
   #55 = Utf8               ()V
   #56 = Methodref          #14.#57       // ext/mods/gameserver/model/actor/Boat.getMove:()Lext/mods/gameserver/model/actor/move/BoatMove;
   #57 = NameAndType        #58:#59       // getMove:()Lext/mods/gameserver/model/actor/move/BoatMove;
   #58 = Utf8               getMove
   #59 = Utf8               ()Lext/mods/gameserver/model/actor/move/BoatMove;
   #60 = Methodref          #39.#61       // ext/mods/gameserver/model/actor/move/BoatMove.stop:()V
   #61 = NameAndType        #62:#55       // stop:()V
   #62 = Utf8               stop
   #63 = InterfaceMethodref #64.#65       // java/util/Set.iterator:()Ljava/util/Iterator;
   #64 = Class              #66           // java/util/Set
   #65 = NameAndType        #67:#68       // iterator:()Ljava/util/Iterator;
   #66 = Utf8               java/util/Set
   #67 = Utf8               iterator
   #68 = Utf8               ()Ljava/util/Iterator;
   #69 = InterfaceMethodref #70.#71       // java/util/Iterator.hasNext:()Z
   #70 = Class              #72           // java/util/Iterator
   #71 = NameAndType        #73:#74       // hasNext:()Z
   #72 = Utf8               java/util/Iterator
   #73 = Utf8               hasNext
   #74 = Utf8               ()Z
   #75 = InterfaceMethodref #70.#76       // java/util/Iterator.next:()Ljava/lang/Object;
   #76 = NameAndType        #77:#78       // next:()Ljava/lang/Object;
   #77 = Utf8               next
   #78 = Utf8               ()Ljava/lang/Object;
   #79 = Class              #80           // ext/mods/gameserver/model/actor/Player
   #80 = Utf8               ext/mods/gameserver/model/actor/Player
   #81 = Methodref          #79.#82       // ext/mods/gameserver/model/actor/Player.teleportTo:(IIII)Z
   #82 = NameAndType        #83:#84       // teleportTo:(IIII)Z
   #83 = Utf8               teleportTo
   #84 = Utf8               (IIII)Z
   #85 = Methodref          #14.#86       // ext/mods/gameserver/model/actor/Boat.decayMe:()V
   #86 = NameAndType        #87:#55       // decayMe:()V
   #87 = Utf8               decayMe
   #88 = Methodref          #14.#89       // ext/mods/gameserver/model/actor/Boat.setXYZ:(III)V
   #89 = NameAndType        #90:#91       // setXYZ:(III)V
   #90 = Utf8               setXYZ
   #91 = Utf8               (III)V
   #92 = Methodref          #14.#93       // ext/mods/gameserver/model/actor/Boat.onTeleported:()V
   #93 = NameAndType        #94:#55       // onTeleported:()V
   #94 = Utf8               onTeleported
   #95 = Methodref          #14.#96       // ext/mods/gameserver/model/actor/Boat.revalidateZone:(Z)V
   #96 = NameAndType        #97:#98       // revalidateZone:(Z)V
   #97 = Utf8               revalidateZone
   #98 = Utf8               (Z)V
   #99 = Fieldref           #14.#100      // ext/mods/gameserver/model/actor/Boat._engine:Lext/mods/gameserver/model/boat/BoatEngine;
  #100 = NameAndType        #101:#102     // _engine:Lext/mods/gameserver/model/boat/BoatEngine;
  #101 = Utf8               _engine
  #102 = Utf8               Lext/mods/gameserver/model/boat/BoatEngine;
  #103 = Methodref          #14.#104      // ext/mods/gameserver/model/actor/Boat.oustPlayers:()V
  #104 = NameAndType        #105:#55      // oustPlayers:()V
  #105 = Utf8               oustPlayers
  #106 = Methodref          #2.#107       // ext/mods/gameserver/model/actor/Creature.deleteMe:()V
  #107 = NameAndType        #108:#55      // deleteMe:()V
  #108 = Utf8               deleteMe
  #109 = Class              #110          // ext/mods/gameserver/network/serverpackets/VehicleInfo
  #110 = Utf8               ext/mods/gameserver/network/serverpackets/VehicleInfo
  #111 = Methodref          #109.#26      // ext/mods/gameserver/network/serverpackets/VehicleInfo."<init>":(Lext/mods/gameserver/model/actor/Boat;)V
  #112 = Methodref          #79.#113      // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #113 = NameAndType        #114:#115     // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #114 = Utf8               sendPacket
  #115 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #116 = Methodref          #117.#118     // ext/mods/gameserver/model/boat/BoatEngine.toString:()Ljava/lang/String;
  #117 = Class              #119          // ext/mods/gameserver/model/boat/BoatEngine
  #118 = NameAndType        #120:#121     // toString:()Ljava/lang/String;
  #119 = Utf8               ext/mods/gameserver/model/boat/BoatEngine
  #120 = Utf8               toString
  #121 = Utf8               ()Ljava/lang/String;
  #122 = InterfaceMethodref #64.#123      // java/util/Set.size:()I
  #123 = NameAndType        #124:#125     // size:()I
  #124 = Utf8               size
  #125 = Utf8               ()I
  #126 = InvokeDynamic      #0:#127       // #0:makeConcatWithConstants:(Ljava/lang/String;I)Ljava/lang/String;
  #127 = NameAndType        #128:#129     // makeConcatWithConstants:(Ljava/lang/String;I)Ljava/lang/String;
  #128 = Utf8               makeConcatWithConstants
  #129 = Utf8               (Ljava/lang/String;I)Ljava/lang/String;
  #130 = Methodref          #131.#132     // ext/mods/gameserver/data/xml/RestartPointData.getInstance:()Lext/mods/gameserver/data/xml/RestartPointData;
  #131 = Class              #133          // ext/mods/gameserver/data/xml/RestartPointData
  #132 = NameAndType        #134:#135     // getInstance:()Lext/mods/gameserver/data/xml/RestartPointData;
  #133 = Utf8               ext/mods/gameserver/data/xml/RestartPointData
  #134 = Utf8               getInstance
  #135 = Utf8               ()Lext/mods/gameserver/data/xml/RestartPointData;
  #136 = Fieldref           #137.#138     // ext/mods/gameserver/enums/RestartType.TOWN:Lext/mods/gameserver/enums/RestartType;
  #137 = Class              #139          // ext/mods/gameserver/enums/RestartType
  #138 = NameAndType        #140:#141     // TOWN:Lext/mods/gameserver/enums/RestartType;
  #139 = Utf8               ext/mods/gameserver/enums/RestartType
  #140 = Utf8               TOWN
  #141 = Utf8               Lext/mods/gameserver/enums/RestartType;
  #142 = Methodref          #131.#143     // ext/mods/gameserver/data/xml/RestartPointData.getLocationToTeleport:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/enums/RestartType;)Lext/mods/gameserver/model/location/Location;
  #143 = NameAndType        #144:#145     // getLocationToTeleport:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/enums/RestartType;)Lext/mods/gameserver/model/location/Location;
  #144 = Utf8               getLocationToTeleport
  #145 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/enums/RestartType;)Lext/mods/gameserver/model/location/Location;
  #146 = Methodref          #14.#147      // ext/mods/gameserver/model/actor/Boat.oustPlayer:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/location/Location;)V
  #147 = NameAndType        #148:#149     // oustPlayer:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/location/Location;)V
  #148 = Utf8               oustPlayer
  #149 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/location/Location;)V
  #150 = Methodref          #79.#151      // ext/mods/gameserver/model/actor/Player.isInStoreMode:()Z
  #151 = NameAndType        #152:#74      // isInStoreMode:()Z
  #152 = Utf8               isInStoreMode
  #153 = Fieldref           #154.#155     // ext/mods/gameserver/enums/actors/OperateType.NONE:Lext/mods/gameserver/enums/actors/OperateType;
  #154 = Class              #156          // ext/mods/gameserver/enums/actors/OperateType
  #155 = NameAndType        #157:#158     // NONE:Lext/mods/gameserver/enums/actors/OperateType;
  #156 = Utf8               ext/mods/gameserver/enums/actors/OperateType
  #157 = Utf8               NONE
  #158 = Utf8               Lext/mods/gameserver/enums/actors/OperateType;
  #159 = Methodref          #79.#160      // ext/mods/gameserver/model/actor/Player.setOperateType:(Lext/mods/gameserver/enums/actors/OperateType;)V
  #160 = NameAndType        #161:#162     // setOperateType:(Lext/mods/gameserver/enums/actors/OperateType;)V
  #161 = Utf8               setOperateType
  #162 = Utf8               (Lext/mods/gameserver/enums/actors/OperateType;)V
  #163 = Methodref          #79.#164      // ext/mods/gameserver/model/actor/Player.broadcastUserInfo:()V
  #164 = NameAndType        #165:#55      // broadcastUserInfo:()V
  #165 = Utf8               broadcastUserInfo
  #166 = Methodref          #79.#167      // ext/mods/gameserver/model/actor/Player.isOnline:()Z
  #167 = NameAndType        #168:#74      // isOnline:()Z
  #168 = Utf8               isOnline
  #169 = Methodref          #170.#171     // ext/mods/gameserver/model/location/Location.getX:()I
  #170 = Class              #172          // ext/mods/gameserver/model/location/Location
  #171 = NameAndType        #173:#125     // getX:()I
  #172 = Utf8               ext/mods/gameserver/model/location/Location
  #173 = Utf8               getX
  #174 = Methodref          #170.#175     // ext/mods/gameserver/model/location/Location.getY:()I
  #175 = NameAndType        #176:#125     // getY:()I
  #176 = Utf8               getY
  #177 = Methodref          #170.#178     // ext/mods/gameserver/model/location/Location.getZ:()I
  #178 = NameAndType        #179:#125     // getZ:()I
  #179 = Utf8               getZ
  #180 = Methodref          #14.#181      // ext/mods/gameserver/model/actor/Boat.removePassenger:(Lext/mods/gameserver/model/actor/Player;)V
  #181 = NameAndType        #182:#183     // removePassenger:(Lext/mods/gameserver/model/actor/Player;)V
  #182 = Utf8               removePassenger
  #183 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
  #184 = Methodref          #79.#185      // ext/mods/gameserver/model/actor/Player.setXYZInvisible:(Lext/mods/gameserver/model/location/Location;)V
  #185 = NameAndType        #186:#187     // setXYZInvisible:(Lext/mods/gameserver/model/location/Location;)V
  #186 = Utf8               setXYZInvisible
  #187 = Utf8               (Lext/mods/gameserver/model/location/Location;)V
  #188 = Methodref          #79.#189      // ext/mods/gameserver/model/actor/Player.getBoatInfo:()Lext/mods/gameserver/model/actor/container/player/BoatInfo;
  #189 = NameAndType        #190:#191     // getBoatInfo:()Lext/mods/gameserver/model/actor/container/player/BoatInfo;
  #190 = Utf8               getBoatInfo
  #191 = Utf8               ()Lext/mods/gameserver/model/actor/container/player/BoatInfo;
  #192 = Methodref          #193.#194     // ext/mods/gameserver/model/actor/container/player/BoatInfo.getBoat:()Lext/mods/gameserver/model/actor/Boat;
  #193 = Class              #195          // ext/mods/gameserver/model/actor/container/player/BoatInfo
  #194 = NameAndType        #196:#197     // getBoat:()Lext/mods/gameserver/model/actor/Boat;
  #195 = Utf8               ext/mods/gameserver/model/actor/container/player/BoatInfo
  #196 = Utf8               getBoat
  #197 = Utf8               ()Lext/mods/gameserver/model/actor/Boat;
  #198 = InterfaceMethodref #64.#199      // java/util/Set.add:(Ljava/lang/Object;)Z
  #199 = NameAndType        #200:#201     // add:(Ljava/lang/Object;)Z
  #200 = Utf8               add
  #201 = Utf8               (Ljava/lang/Object;)Z
  #202 = Fieldref           #203.#204     // ext/mods/gameserver/enums/ZoneId.PEACE:Lext/mods/gameserver/enums/ZoneId;
  #203 = Class              #205          // ext/mods/gameserver/enums/ZoneId
  #204 = NameAndType        #206:#207     // PEACE:Lext/mods/gameserver/enums/ZoneId;
  #205 = Utf8               ext/mods/gameserver/enums/ZoneId
  #206 = Utf8               PEACE
  #207 = Utf8               Lext/mods/gameserver/enums/ZoneId;
  #208 = Methodref          #79.#209      // ext/mods/gameserver/model/actor/Player.setInsideZone:(Lext/mods/gameserver/enums/ZoneId;Z)V
  #209 = NameAndType        #210:#211     // setInsideZone:(Lext/mods/gameserver/enums/ZoneId;Z)V
  #210 = Utf8               setInsideZone
  #211 = Utf8               (Lext/mods/gameserver/enums/ZoneId;Z)V
  #212 = Fieldref           #203.#213     // ext/mods/gameserver/enums/ZoneId.NO_SUMMON_FRIEND:Lext/mods/gameserver/enums/ZoneId;
  #213 = NameAndType        #214:#207     // NO_SUMMON_FRIEND:Lext/mods/gameserver/enums/ZoneId;
  #214 = Utf8               NO_SUMMON_FRIEND
  #215 = Fieldref           #216.#217     // ext/mods/gameserver/network/SystemMessageId.ENTER_PEACEFUL_ZONE:Lext/mods/gameserver/network/SystemMessageId;
  #216 = Class              #218          // ext/mods/gameserver/network/SystemMessageId
  #217 = NameAndType        #219:#220     // ENTER_PEACEFUL_ZONE:Lext/mods/gameserver/network/SystemMessageId;
  #218 = Utf8               ext/mods/gameserver/network/SystemMessageId
  #219 = Utf8               ENTER_PEACEFUL_ZONE
  #220 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
  #221 = Methodref          #79.#222      // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
  #222 = NameAndType        #114:#223     // sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
  #223 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
  #224 = Methodref          #193.#225     // ext/mods/gameserver/model/actor/container/player/BoatInfo.setBoat:(Lext/mods/gameserver/model/actor/Boat;)V
  #225 = NameAndType        #226:#27      // setBoat:(Lext/mods/gameserver/model/actor/Boat;)V
  #226 = Utf8               setBoat
  #227 = Fieldref           #216.#228     // ext/mods/gameserver/network/SystemMessageId.EXIT_PEACEFUL_ZONE:Lext/mods/gameserver/network/SystemMessageId;
  #228 = NameAndType        #229:#220     // EXIT_PEACEFUL_ZONE:Lext/mods/gameserver/network/SystemMessageId;
  #229 = Utf8               EXIT_PEACEFUL_ZONE
  #230 = InterfaceMethodref #64.#231      // java/util/Set.remove:(Ljava/lang/Object;)Z
  #231 = NameAndType        #232:#201     // remove:(Ljava/lang/Object;)Z
  #232 = Utf8               remove
  #233 = InvokeDynamic      #1:#234       // #1:run:(Lext/mods/gameserver/model/actor/Boat;ILext/mods/gameserver/model/location/Location;)Ljava/lang/Runnable;
  #234 = NameAndType        #235:#236     // run:(Lext/mods/gameserver/model/actor/Boat;ILext/mods/gameserver/model/location/Location;)Ljava/lang/Runnable;
  #235 = Utf8               run
  #236 = Utf8               (Lext/mods/gameserver/model/actor/Boat;ILext/mods/gameserver/model/location/Location;)Ljava/lang/Runnable;
  #237 = Long               5000l
  #239 = Methodref          #240.#241     // ext/mods/commons/pool/ThreadPool.schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
  #240 = Class              #242          // ext/mods/commons/pool/ThreadPool
  #241 = NameAndType        #243:#244     // schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
  #242 = Utf8               ext/mods/commons/pool/ThreadPool
  #243 = Utf8               schedule
  #244 = Utf8               (Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
  #245 = Fieldref           #14.#246      // ext/mods/gameserver/model/actor/Boat._payTask:Ljava/util/concurrent/Future;
  #246 = NameAndType        #247:#248     // _payTask:Ljava/util/concurrent/Future;
  #247 = Utf8               _payTask
  #248 = Utf8               Ljava/util/concurrent/Future;
  #249 = InterfaceMethodref #250.#251     // java/util/concurrent/Future.cancel:(Z)Z
  #250 = Class              #252          // java/util/concurrent/Future
  #251 = NameAndType        #253:#254     // cancel:(Z)Z
  #252 = Utf8               java/util/concurrent/Future
  #253 = Utf8               cancel
  #254 = Utf8               (Z)Z
  #255 = Methodref          #117.#256     // ext/mods/gameserver/model/boat/BoatEngine.getDock:()Lext/mods/gameserver/enums/boats/BoatDock;
  #256 = NameAndType        #257:#258     // getDock:()Lext/mods/gameserver/enums/boats/BoatDock;
  #257 = Utf8               getDock
  #258 = Utf8               ()Lext/mods/gameserver/enums/boats/BoatDock;
  #259 = Methodref          #117.#260     // ext/mods/gameserver/model/boat/BoatEngine.getState:()Lext/mods/gameserver/enums/boats/BoatState;
  #260 = NameAndType        #261:#262     // getState:()Lext/mods/gameserver/enums/boats/BoatState;
  #261 = Utf8               getState
  #262 = Utf8               ()Lext/mods/gameserver/enums/boats/BoatState;
  #263 = Fieldref           #264.#265     // ext/mods/gameserver/enums/boats/BoatState.DOCKED:Lext/mods/gameserver/enums/boats/BoatState;
  #264 = Class              #266          // ext/mods/gameserver/enums/boats/BoatState
  #265 = NameAndType        #267:#268     // DOCKED:Lext/mods/gameserver/enums/boats/BoatState;
  #266 = Utf8               ext/mods/gameserver/enums/boats/BoatState
  #267 = Utf8               DOCKED
  #268 = Utf8               Lext/mods/gameserver/enums/boats/BoatState;
  #269 = Methodref          #14.#270      // ext/mods/gameserver/model/actor/Boat.getStatus:()Lext/mods/gameserver/model/actor/status/BoatStatus;
  #270 = NameAndType        #271:#272     // getStatus:()Lext/mods/gameserver/model/actor/status/BoatStatus;
  #271 = Utf8               getStatus
  #272 = Utf8               ()Lext/mods/gameserver/model/actor/status/BoatStatus;
  #273 = Methodref          #14.#274      // ext/mods/gameserver/model/actor/Boat.getAI:()Lext/mods/gameserver/model/actor/ai/type/BoatAI;
  #274 = NameAndType        #275:#276     // getAI:()Lext/mods/gameserver/model/actor/ai/type/BoatAI;
  #275 = Utf8               getAI
  #276 = Utf8               ()Lext/mods/gameserver/model/actor/ai/type/BoatAI;
  #277 = Methodref          #14.#278      // ext/mods/gameserver/model/actor/Boat.getSecondaryWeaponItem:()Lext/mods/gameserver/model/item/kind/Weapon;
  #278 = NameAndType        #279:#280     // getSecondaryWeaponItem:()Lext/mods/gameserver/model/item/kind/Weapon;
  #279 = Utf8               getSecondaryWeaponItem
  #280 = Utf8               ()Lext/mods/gameserver/model/item/kind/Weapon;
  #281 = Methodref          #79.#282      // ext/mods/gameserver/model/actor/Player.destroyItemByItemId:(IIZ)Z
  #282 = NameAndType        #283:#284     // destroyItemByItemId:(IIZ)Z
  #283 = Utf8               destroyItemByItemId
  #284 = Utf8               (IIZ)Z
  #285 = Fieldref           #216.#286     // ext/mods/gameserver/network/SystemMessageId.S1_DISAPPEARED:Lext/mods/gameserver/network/SystemMessageId;
  #286 = NameAndType        #287:#220     // S1_DISAPPEARED:Lext/mods/gameserver/network/SystemMessageId;
  #287 = Utf8               S1_DISAPPEARED
  #288 = Methodref          #289.#290     // ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #289 = Class              #291          // ext/mods/gameserver/network/serverpackets/SystemMessage
  #290 = NameAndType        #292:#293     // getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #291 = Utf8               ext/mods/gameserver/network/serverpackets/SystemMessage
  #292 = Utf8               getSystemMessage
  #293 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #294 = Methodref          #289.#295     // ext/mods/gameserver/network/serverpackets/SystemMessage.addItemName:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #295 = NameAndType        #296:#297     // addItemName:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #296 = Utf8               addItemName
  #297 = Utf8               (I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #298 = Fieldref           #216.#299     // ext/mods/gameserver/network/SystemMessageId.NOT_CORRECT_BOAT_TICKET:Lext/mods/gameserver/network/SystemMessageId;
  #299 = NameAndType        #300:#220     // NOT_CORRECT_BOAT_TICKET:Lext/mods/gameserver/network/SystemMessageId;
  #300 = Utf8               NOT_CORRECT_BOAT_TICKET
  #301 = Utf8               Signature
  #302 = Utf8               Ljava/util/Set<Lext/mods/gameserver/model/actor/Player;>;
  #303 = Utf8               Ljava/util/concurrent/Future<*>;
  #304 = Utf8               Code
  #305 = Utf8               LineNumberTable
  #306 = Utf8               LocalVariableTable
  #307 = Utf8               this
  #308 = Utf8               Lext/mods/gameserver/model/actor/Boat;
  #309 = Utf8               objectId
  #310 = Utf8               I
  #311 = Utf8               template
  #312 = Utf8               Lext/mods/gameserver/model/actor/template/CreatureTemplate;
  #313 = Utf8               setAI
  #314 = Utf8               setStatus
  #315 = Utf8               setMove
  #316 = Utf8               player
  #317 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #318 = Utf8               x
  #319 = Utf8               y
  #320 = Utf8               z
  #321 = Utf8               randomOffset
  #322 = Utf8               StackMapTable
  #323 = Utf8               updateAbnormalEffect
  #324 = Utf8               getActiveWeaponInstance
  #325 = Utf8               ()Lext/mods/gameserver/model/item/instance/ItemInstance;
  #326 = Utf8               getActiveWeaponItem
  #327 = Utf8               getSecondaryWeaponInstance
  #328 = Utf8               sendInfo
  #329 = Utf8               isFlying
  #330 = Utf8               onInteract
  #331 = Utf8               actor
  #332 = Utf8               onAction
  #333 = Utf8               (Lext/mods/gameserver/model/actor/Player;ZZ)V
  #334 = Utf8               isCtrlPressed
  #335 = Utf8               Z
  #336 = Utf8               isShiftPressed
  #337 = Utf8               isAttackableBy
  #338 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)Z
  #339 = Utf8               attacker
  #340 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #341 = Utf8               getPassengers
  #342 = Utf8               ()Ljava/util/Set;
  #343 = Utf8               ()Ljava/util/Set<Lext/mods/gameserver/model/actor/Player;>;
  #344 = Utf8               loc
  #345 = Utf8               Lext/mods/gameserver/model/location/Location;
  #346 = Utf8               addPassenger
  #347 = Utf8               boat
  #348 = Utf8               payForRide
  #349 = Utf8               (ILext/mods/gameserver/model/location/Location;)V
  #350 = Utf8               itemId
  #351 = Utf8               setEngine
  #352 = Utf8               (Lext/mods/gameserver/model/boat/BoatEngine;)V
  #353 = Utf8               engine
  #354 = Utf8               getEngine
  #355 = Utf8               ()Lext/mods/gameserver/model/boat/BoatEngine;
  #356 = Class              #357          // ext/mods/gameserver/enums/boats/BoatDock
  #357 = Utf8               ext/mods/gameserver/enums/boats/BoatDock
  #358 = Utf8               isDocked
  #359 = Utf8               ()Lext/mods/gameserver/model/actor/move/CreatureMove;
  #360 = Utf8               ()Lext/mods/gameserver/model/actor/status/CreatureStatus;
  #361 = Utf8               ()Lext/mods/gameserver/model/actor/ai/type/CreatureAI;
  #362 = Utf8               ()Lext/mods/gameserver/model/item/kind/Item;
  #363 = Utf8               lambda$payForRide$0
  #364 = Utf8               i$
  #365 = Utf8               Ljava/util/Iterator;
  #366 = Utf8               SourceFile
  #367 = Utf8               Boat.java
  #368 = Utf8               BootstrapMethods
  #369 = String             #370          // Boat \u0001 passengers=\u0001
  #370 = Utf8               Boat \u0001 passengers=\u0001
  #371 = MethodType         #55           //  ()V
  #372 = MethodHandle       5:#373        // REF_invokeVirtual ext/mods/gameserver/model/actor/Boat.lambda$payForRide$0:(ILext/mods/gameserver/model/location/Location;)V
  #373 = Methodref          #14.#374      // ext/mods/gameserver/model/actor/Boat.lambda$payForRide$0:(ILext/mods/gameserver/model/location/Location;)V
  #374 = NameAndType        #363:#349     // lambda$payForRide$0:(ILext/mods/gameserver/model/location/Location;)V
  #375 = MethodHandle       6:#376        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #376 = Methodref          #377.#378     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #377 = Class              #379          // java/lang/invoke/StringConcatFactory
  #378 = NameAndType        #128:#380     // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #379 = Utf8               java/lang/invoke/StringConcatFactory
  #380 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #381 = MethodHandle       6:#382        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #382 = Methodref          #383.#384     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #383 = Class              #385          // java/lang/invoke/LambdaMetafactory
  #384 = NameAndType        #386:#387     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #385 = Utf8               java/lang/invoke/LambdaMetafactory
  #386 = Utf8               metafactory
  #387 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #388 = Utf8               InnerClasses
  #389 = Class              #390          // java/util/concurrent/ConcurrentHashMap$KeySetView
  #390 = Utf8               java/util/concurrent/ConcurrentHashMap$KeySetView
  #391 = Utf8               KeySetView
  #392 = Class              #393          // java/lang/invoke/MethodHandles$Lookup
  #393 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #394 = Class              #395          // java/lang/invoke/MethodHandles
  #395 = Utf8               java/lang/invoke/MethodHandles
  #396 = Utf8               Lookup
{
  public ext.mods.gameserver.model.actor.Boat(int, ext.mods.gameserver.model.actor.template.CreatureTemplate);
    descriptor: (ILext/mods/gameserver/model/actor/template/CreatureTemplate;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: iload_1
         2: aload_2
         3: invokespecial #1                  // Method ext/mods/gameserver/model/actor/Creature."<init>":(ILext/mods/gameserver/model/actor/template/CreatureTemplate;)V
         6: aload_0
         7: invokestatic  #7                  // Method java/util/concurrent/ConcurrentHashMap.newKeySet:()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;
        10: putfield      #13                 // Field _passengers:Ljava/util/Set;
        13: return
      LineNumberTable:
        line 53: 0
        line 46: 6
        line 54: 13
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0  this   Lext/mods/gameserver/model/actor/Boat;
            0      14     1 objectId   I
            0      14     2 template   Lext/mods/gameserver/model/actor/template/CreatureTemplate;

  public ext.mods.gameserver.model.actor.ai.type.BoatAI getAI();
    descriptor: ()Lext/mods/gameserver/model/actor/ai/type/BoatAI;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #19                 // Field _ai:Lext/mods/gameserver/model/actor/ai/type/CreatureAI;
         4: checkcast     #23                 // class ext/mods/gameserver/model/actor/ai/type/BoatAI
         7: areturn
      LineNumberTable:
        line 59: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/actor/Boat;

  public void setAI();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=1, args_size=1
         0: aload_0
         1: new           #23                 // class ext/mods/gameserver/model/actor/ai/type/BoatAI
         4: dup
         5: aload_0
         6: invokespecial #25                 // Method ext/mods/gameserver/model/actor/ai/type/BoatAI."<init>":(Lext/mods/gameserver/model/actor/Boat;)V
         9: putfield      #19                 // Field _ai:Lext/mods/gameserver/model/actor/ai/type/CreatureAI;
        12: return
      LineNumberTable:
        line 65: 0
        line 66: 12
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      13     0  this   Lext/mods/gameserver/model/actor/Boat;

  public ext.mods.gameserver.model.actor.status.BoatStatus getStatus();
    descriptor: ()Lext/mods/gameserver/model/actor/status/BoatStatus;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #28                 // Field _status:Lext/mods/gameserver/model/actor/status/CreatureStatus;
         4: checkcast     #32                 // class ext/mods/gameserver/model/actor/status/BoatStatus
         7: areturn
      LineNumberTable:
        line 71: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/actor/Boat;

  public void setStatus();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=1, args_size=1
         0: aload_0
         1: new           #32                 // class ext/mods/gameserver/model/actor/status/BoatStatus
         4: dup
         5: aload_0
         6: invokespecial #34                 // Method ext/mods/gameserver/model/actor/status/BoatStatus."<init>":(Lext/mods/gameserver/model/actor/Boat;)V
         9: putfield      #28                 // Field _status:Lext/mods/gameserver/model/actor/status/CreatureStatus;
        12: return
      LineNumberTable:
        line 77: 0
        line 78: 12
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      13     0  this   Lext/mods/gameserver/model/actor/Boat;

  public ext.mods.gameserver.model.actor.move.BoatMove getMove();
    descriptor: ()Lext/mods/gameserver/model/actor/move/BoatMove;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #35                 // Field _move:Lext/mods/gameserver/model/actor/move/CreatureMove;
         4: checkcast     #39                 // class ext/mods/gameserver/model/actor/move/BoatMove
         7: areturn
      LineNumberTable:
        line 83: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/actor/Boat;

  public void setMove();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=1, args_size=1
         0: aload_0
         1: new           #39                 // class ext/mods/gameserver/model/actor/move/BoatMove
         4: dup
         5: aload_0
         6: invokespecial #41                 // Method ext/mods/gameserver/model/actor/move/BoatMove."<init>":(Lext/mods/gameserver/model/actor/Boat;)V
         9: putfield      #35                 // Field _move:Lext/mods/gameserver/model/actor/move/CreatureMove;
        12: return
      LineNumberTable:
        line 89: 0
        line 90: 12
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      13     0  this   Lext/mods/gameserver/model/actor/Boat;

  public boolean teleportTo(int, int, int, int);
    descriptor: (IIII)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=7, args_size=5
         0: aload_0
         1: getfield      #42                 // Field _isTeleporting:Ljava/util/concurrent/atomic/AtomicBoolean;
         4: iconst_0
         5: iconst_1
         6: invokevirtual #46                 // Method java/util/concurrent/atomic/AtomicBoolean.compareAndSet:(ZZ)Z
         9: ifne          14
        12: iconst_0
        13: ireturn
        14: aload_0
        15: invokevirtual #52                 // Method stopPayTask:()V
        18: aload_0
        19: invokevirtual #56                 // Method getMove:()Lext/mods/gameserver/model/actor/move/BoatMove;
        22: invokevirtual #60                 // Method ext/mods/gameserver/model/actor/move/BoatMove.stop:()V
        25: aload_0
        26: getfield      #13                 // Field _passengers:Ljava/util/Set;
        29: invokeinterface #63,  1           // InterfaceMethod java/util/Set.iterator:()Ljava/util/Iterator;
        34: astore        5
        36: aload         5
        38: invokeinterface #69,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        43: ifeq          72
        46: aload         5
        48: invokeinterface #75,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        53: checkcast     #79                 // class ext/mods/gameserver/model/actor/Player
        56: astore        6
        58: aload         6
        60: iload_1
        61: iload_2
        62: iload_3
        63: iload         4
        65: invokevirtual #81                 // Method ext/mods/gameserver/model/actor/Player.teleportTo:(IIII)Z
        68: pop
        69: goto          36
        72: aload_0
        73: invokevirtual #85                 // Method decayMe:()V
        76: aload_0
        77: iload_1
        78: iload_2
        79: iload_3
        80: invokevirtual #88                 // Method setXYZ:(III)V
        83: aload_0
        84: invokevirtual #92                 // Method onTeleported:()V
        87: aload_0
        88: iconst_1
        89: invokevirtual #95                 // Method revalidateZone:(Z)V
        92: iconst_1
        93: ireturn
      LineNumberTable:
        line 95: 0
        line 96: 12
        line 98: 14
        line 100: 18
        line 102: 25
        line 103: 58
        line 105: 72
        line 106: 76
        line 108: 83
        line 109: 87
        line 110: 92
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           58      11     6 player   Lext/mods/gameserver/model/actor/Player;
            0      94     0  this   Lext/mods/gameserver/model/actor/Boat;
            0      94     1     x   I
            0      94     2     y   I
            0      94     3     z   I
            0      94     4 randomOffset   I
      StackMapTable: number_of_entries = 3
        frame_type = 14 /* same */
        frame_type = 252 /* append */
          offset_delta = 21
          locals = [ class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 35

  public void deleteMe();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #52                 // Method stopPayTask:()V
         4: aload_0
         5: aconst_null
         6: putfield      #99                 // Field _engine:Lext/mods/gameserver/model/boat/BoatEngine;
         9: aload_0
        10: invokevirtual #56                 // Method getMove:()Lext/mods/gameserver/model/actor/move/BoatMove;
        13: invokevirtual #60                 // Method ext/mods/gameserver/model/actor/move/BoatMove.stop:()V
        16: aload_0
        17: invokevirtual #103                // Method oustPlayers:()V
        20: aload_0
        21: invokevirtual #85                 // Method decayMe:()V
        24: aload_0
        25: invokespecial #106                // Method ext/mods/gameserver/model/actor/Creature.deleteMe:()V
        28: return
      LineNumberTable:
        line 116: 0
        line 118: 4
        line 120: 9
        line 122: 16
        line 124: 20
        line 126: 24
        line 127: 28
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      29     0  this   Lext/mods/gameserver/model/actor/Boat;

  public void updateAbnormalEffect();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=0, locals=1, args_size=1
         0: return
      LineNumberTable:
        line 132: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       1     0  this   Lext/mods/gameserver/model/actor/Boat;

  public ext.mods.gameserver.model.item.instance.ItemInstance getActiveWeaponInstance();
    descriptor: ()Lext/mods/gameserver/model/item/instance/ItemInstance;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aconst_null
         1: areturn
      LineNumberTable:
        line 137: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/gameserver/model/actor/Boat;

  public ext.mods.gameserver.model.item.kind.Weapon getActiveWeaponItem();
    descriptor: ()Lext/mods/gameserver/model/item/kind/Weapon;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aconst_null
         1: areturn
      LineNumberTable:
        line 143: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/gameserver/model/actor/Boat;

  public ext.mods.gameserver.model.item.instance.ItemInstance getSecondaryWeaponInstance();
    descriptor: ()Lext/mods/gameserver/model/item/instance/ItemInstance;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aconst_null
         1: areturn
      LineNumberTable:
        line 149: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/gameserver/model/actor/Boat;

  public ext.mods.gameserver.model.item.kind.Weapon getSecondaryWeaponItem();
    descriptor: ()Lext/mods/gameserver/model/item/kind/Weapon;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aconst_null
         1: areturn
      LineNumberTable:
        line 155: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/gameserver/model/actor/Boat;

  public void sendInfo(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=2, args_size=2
         0: aload_1
         1: new           #109                // class ext/mods/gameserver/network/serverpackets/VehicleInfo
         4: dup
         5: aload_0
         6: invokespecial #111                // Method ext/mods/gameserver/network/serverpackets/VehicleInfo."<init>":(Lext/mods/gameserver/model/actor/Boat;)V
         9: invokevirtual #112                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        12: return
      LineNumberTable:
        line 161: 0
        line 162: 12
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      13     0  this   Lext/mods/gameserver/model/actor/Boat;
            0      13     1 player   Lext/mods/gameserver/model/actor/Player;

  public boolean isFlying();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: iconst_1
         1: ireturn
      LineNumberTable:
        line 167: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/gameserver/model/actor/Boat;

  public void onInteract(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=0, locals=2, args_size=2
         0: return
      LineNumberTable:
        line 173: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       1     0  this   Lext/mods/gameserver/model/actor/Boat;
            0       1     1 actor   Lext/mods/gameserver/model/actor/Player;

  public void onAction(ext.mods.gameserver.model.actor.Player, boolean, boolean);
    descriptor: (Lext/mods/gameserver/model/actor/Player;ZZ)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=0, locals=4, args_size=4
         0: return
      LineNumberTable:
        line 178: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       1     0  this   Lext/mods/gameserver/model/actor/Boat;
            0       1     1 player   Lext/mods/gameserver/model/actor/Player;
            0       1     2 isCtrlPressed   Z
            0       1     3 isShiftPressed   Z

  public boolean isAttackableBy(ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=2, args_size=2
         0: iconst_0
         1: ireturn
      LineNumberTable:
        line 183: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/gameserver/model/actor/Boat;
            0       2     1 attacker   Lext/mods/gameserver/model/actor/Creature;

  public java.lang.String toString();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #99                 // Field _engine:Lext/mods/gameserver/model/boat/BoatEngine;
         4: invokevirtual #116                // Method ext/mods/gameserver/model/boat/BoatEngine.toString:()Ljava/lang/String;
         7: aload_0
         8: getfield      #13                 // Field _passengers:Ljava/util/Set;
        11: invokeinterface #122,  1          // InterfaceMethod java/util/Set.size:()I
        16: invokedynamic #126,  0            // InvokeDynamic #0:makeConcatWithConstants:(Ljava/lang/String;I)Ljava/lang/String;
        21: areturn
      LineNumberTable:
        line 189: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      22     0  this   Lext/mods/gameserver/model/actor/Boat;

  public java.util.Set<ext.mods.gameserver.model.actor.Player> getPassengers();
    descriptor: ()Ljava/util/Set;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field _passengers:Ljava/util/Set;
         4: areturn
      LineNumberTable:
        line 194: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/Boat;
    Signature: #343                         // ()Ljava/util/Set<Lext/mods/gameserver/model/actor/Player;>;

  public void oustPlayers();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=3, args_size=1
         0: aload_0
         1: getfield      #13                 // Field _passengers:Ljava/util/Set;
         4: invokeinterface #63,  1           // InterfaceMethod java/util/Set.iterator:()Ljava/util/Iterator;
         9: astore_1
        10: aload_1
        11: invokeinterface #69,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        16: ifeq          47
        19: aload_1
        20: invokeinterface #75,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        25: checkcast     #79                 // class ext/mods/gameserver/model/actor/Player
        28: astore_2
        29: aload_0
        30: aload_2
        31: invokestatic  #130                // Method ext/mods/gameserver/data/xml/RestartPointData.getInstance:()Lext/mods/gameserver/data/xml/RestartPointData;
        34: aload_2
        35: getstatic     #136                // Field ext/mods/gameserver/enums/RestartType.TOWN:Lext/mods/gameserver/enums/RestartType;
        38: invokevirtual #142                // Method ext/mods/gameserver/data/xml/RestartPointData.getLocationToTeleport:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/enums/RestartType;)Lext/mods/gameserver/model/location/Location;
        41: invokevirtual #146                // Method oustPlayer:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/location/Location;)V
        44: goto          10
        47: return
      LineNumberTable:
        line 202: 0
        line 203: 29
        line 204: 47
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           29      15     2 player   Lext/mods/gameserver/model/actor/Player;
            0      48     0  this   Lext/mods/gameserver/model/actor/Boat;
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 10
          locals = [ class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 36

  public void oustPlayer(ext.mods.gameserver.model.actor.Player, ext.mods.gameserver.model.location.Location);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/location/Location;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=3, args_size=3
         0: aload_1
         1: invokevirtual #150                // Method ext/mods/gameserver/model/actor/Player.isInStoreMode:()Z
         4: ifeq          18
         7: aload_1
         8: getstatic     #153                // Field ext/mods/gameserver/enums/actors/OperateType.NONE:Lext/mods/gameserver/enums/actors/OperateType;
        11: invokevirtual #159                // Method ext/mods/gameserver/model/actor/Player.setOperateType:(Lext/mods/gameserver/enums/actors/OperateType;)V
        14: aload_1
        15: invokevirtual #163                // Method ext/mods/gameserver/model/actor/Player.broadcastUserInfo:()V
        18: aload_1
        19: invokevirtual #166                // Method ext/mods/gameserver/model/actor/Player.isOnline:()Z
        22: ifeq          46
        25: aload_1
        26: aload_2
        27: invokevirtual #169                // Method ext/mods/gameserver/model/location/Location.getX:()I
        30: aload_2
        31: invokevirtual #174                // Method ext/mods/gameserver/model/location/Location.getY:()I
        34: aload_2
        35: invokevirtual #177                // Method ext/mods/gameserver/model/location/Location.getZ:()I
        38: iconst_0
        39: invokevirtual #81                 // Method ext/mods/gameserver/model/actor/Player.teleportTo:(IIII)Z
        42: pop
        43: goto          56
        46: aload_0
        47: aload_1
        48: invokevirtual #180                // Method removePassenger:(Lext/mods/gameserver/model/actor/Player;)V
        51: aload_1
        52: aload_2
        53: invokevirtual #184                // Method ext/mods/gameserver/model/actor/Player.setXYZInvisible:(Lext/mods/gameserver/model/location/Location;)V
        56: return
      LineNumberTable:
        line 218: 0
        line 220: 7
        line 221: 14
        line 224: 18
        line 225: 25
        line 228: 46
        line 230: 51
        line 232: 56
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      57     0  this   Lext/mods/gameserver/model/actor/Boat;
            0      57     1 player   Lext/mods/gameserver/model/actor/Player;
            0      57     2   loc   Lext/mods/gameserver/model/location/Location;
      StackMapTable: number_of_entries = 3
        frame_type = 18 /* same */
        frame_type = 27 /* same */
        frame_type = 9 /* same */

  public void addPassenger(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=2
         0: aload_1
         1: invokevirtual #188                // Method ext/mods/gameserver/model/actor/Player.getBoatInfo:()Lext/mods/gameserver/model/actor/container/player/BoatInfo;
         4: invokevirtual #192                // Method ext/mods/gameserver/model/actor/container/player/BoatInfo.getBoat:()Lext/mods/gameserver/model/actor/Boat;
         7: astore_2
         8: aload_2
         9: aload_0
        10: if_acmpeq     14
        13: return
        14: aload_0
        15: getfield      #13                 // Field _passengers:Ljava/util/Set;
        18: aload_1
        19: invokeinterface #198,  2          // InterfaceMethod java/util/Set.add:(Ljava/lang/Object;)Z
        24: ifne          28
        27: return
        28: aload_1
        29: getstatic     #202                // Field ext/mods/gameserver/enums/ZoneId.PEACE:Lext/mods/gameserver/enums/ZoneId;
        32: iconst_1
        33: invokevirtual #208                // Method ext/mods/gameserver/model/actor/Player.setInsideZone:(Lext/mods/gameserver/enums/ZoneId;Z)V
        36: aload_1
        37: getstatic     #212                // Field ext/mods/gameserver/enums/ZoneId.NO_SUMMON_FRIEND:Lext/mods/gameserver/enums/ZoneId;
        40: iconst_1
        41: invokevirtual #208                // Method ext/mods/gameserver/model/actor/Player.setInsideZone:(Lext/mods/gameserver/enums/ZoneId;Z)V
        44: aload_1
        45: getstatic     #215                // Field ext/mods/gameserver/network/SystemMessageId.ENTER_PEACEFUL_ZONE:Lext/mods/gameserver/network/SystemMessageId;
        48: invokevirtual #221                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        51: return
      LineNumberTable:
        line 240: 0
        line 242: 8
        line 243: 13
        line 245: 14
        line 246: 27
        line 248: 28
        line 249: 36
        line 251: 44
        line 252: 51
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      52     0  this   Lext/mods/gameserver/model/actor/Boat;
            0      52     1 player   Lext/mods/gameserver/model/actor/Player;
            8      44     2  boat   Lext/mods/gameserver/model/actor/Boat;
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 14
          locals = [ class ext/mods/gameserver/model/actor/Boat ]
        frame_type = 13 /* same */

  public void removePassenger(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: invokevirtual #52                 // Method stopPayTask:()V
         4: aload_1
         5: invokevirtual #188                // Method ext/mods/gameserver/model/actor/Player.getBoatInfo:()Lext/mods/gameserver/model/actor/container/player/BoatInfo;
         8: aconst_null
         9: invokevirtual #224                // Method ext/mods/gameserver/model/actor/container/player/BoatInfo.setBoat:(Lext/mods/gameserver/model/actor/Boat;)V
        12: aload_1
        13: getstatic     #202                // Field ext/mods/gameserver/enums/ZoneId.PEACE:Lext/mods/gameserver/enums/ZoneId;
        16: iconst_0
        17: invokevirtual #208                // Method ext/mods/gameserver/model/actor/Player.setInsideZone:(Lext/mods/gameserver/enums/ZoneId;Z)V
        20: aload_1
        21: getstatic     #212                // Field ext/mods/gameserver/enums/ZoneId.NO_SUMMON_FRIEND:Lext/mods/gameserver/enums/ZoneId;
        24: iconst_0
        25: invokevirtual #208                // Method ext/mods/gameserver/model/actor/Player.setInsideZone:(Lext/mods/gameserver/enums/ZoneId;Z)V
        28: aload_1
        29: getstatic     #227                // Field ext/mods/gameserver/network/SystemMessageId.EXIT_PEACEFUL_ZONE:Lext/mods/gameserver/network/SystemMessageId;
        32: invokevirtual #221                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        35: aload_0
        36: getfield      #13                 // Field _passengers:Ljava/util/Set;
        39: aload_1
        40: invokeinterface #230,  2          // InterfaceMethod java/util/Set.remove:(Ljava/lang/Object;)Z
        45: pop
        46: return
      LineNumberTable:
        line 260: 0
        line 262: 4
        line 264: 12
        line 265: 20
        line 267: 28
        line 269: 35
        line 270: 46
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      47     0  this   Lext/mods/gameserver/model/actor/Boat;
            0      47     1 player   Lext/mods/gameserver/model/actor/Player;

  public void payForRide(int, ext.mods.gameserver.model.location.Location);
    descriptor: (ILext/mods/gameserver/model/location/Location;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=3, args_size=3
         0: aload_0
         1: invokevirtual #52                 // Method stopPayTask:()V
         4: iload_1
         5: ifgt          9
         8: return
         9: aload_0
        10: aload_0
        11: iload_1
        12: aload_2
        13: invokedynamic #233,  0            // InvokeDynamic #1:run:(Lext/mods/gameserver/model/actor/Boat;ILext/mods/gameserver/model/location/Location;)Ljava/lang/Runnable;
        18: ldc2_w        #237                // long 5000l
        21: invokestatic  #239                // Method ext/mods/commons/pool/ThreadPool.schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
        24: putfield      #245                // Field _payTask:Ljava/util/concurrent/Future;
        27: return
      LineNumberTable:
        line 279: 0
        line 281: 4
        line 282: 8
        line 284: 9
        line 297: 27
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      28     0  this   Lext/mods/gameserver/model/actor/Boat;
            0      28     1 itemId   I
            0      28     2   loc   Lext/mods/gameserver/model/location/Location;
      StackMapTable: number_of_entries = 1
        frame_type = 9 /* same */

  public void setEngine(ext.mods.gameserver.model.boat.BoatEngine);
    descriptor: (Lext/mods/gameserver/model/boat/BoatEngine;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: putfield      #99                 // Field _engine:Lext/mods/gameserver/model/boat/BoatEngine;
         5: return
      LineNumberTable:
        line 313: 0
        line 314: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/actor/Boat;
            0       6     1 engine   Lext/mods/gameserver/model/boat/BoatEngine;

  public ext.mods.gameserver.model.boat.BoatEngine getEngine();
    descriptor: ()Lext/mods/gameserver/model/boat/BoatEngine;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #99                 // Field _engine:Lext/mods/gameserver/model/boat/BoatEngine;
         4: areturn
      LineNumberTable:
        line 318: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/Boat;

  public ext.mods.gameserver.enums.boats.BoatDock getDock();
    descriptor: ()Lext/mods/gameserver/enums/boats/BoatDock;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #99                 // Field _engine:Lext/mods/gameserver/model/boat/BoatEngine;
         4: ifnonnull     11
         7: aconst_null
         8: goto          18
        11: aload_0
        12: getfield      #99                 // Field _engine:Lext/mods/gameserver/model/boat/BoatEngine;
        15: invokevirtual #255                // Method ext/mods/gameserver/model/boat/BoatEngine.getDock:()Lext/mods/gameserver/enums/boats/BoatDock;
        18: areturn
      LineNumberTable:
        line 323: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      19     0  this   Lext/mods/gameserver/model/actor/Boat;
      StackMapTable: number_of_entries = 2
        frame_type = 11 /* same */
        frame_type = 70 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/enums/boats/BoatDock ]

  public boolean isDocked();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #99                 // Field _engine:Lext/mods/gameserver/model/boat/BoatEngine;
         4: ifnull        24
         7: aload_0
         8: getfield      #99                 // Field _engine:Lext/mods/gameserver/model/boat/BoatEngine;
        11: invokevirtual #259                // Method ext/mods/gameserver/model/boat/BoatEngine.getState:()Lext/mods/gameserver/enums/boats/BoatState;
        14: getstatic     #263                // Field ext/mods/gameserver/enums/boats/BoatState.DOCKED:Lext/mods/gameserver/enums/boats/BoatState;
        17: if_acmpne     24
        20: iconst_1
        21: goto          25
        24: iconst_0
        25: ireturn
      LineNumberTable:
        line 328: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      26     0  this   Lext/mods/gameserver/model/actor/Boat;
      StackMapTable: number_of_entries = 2
        frame_type = 24 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public ext.mods.gameserver.model.actor.move.CreatureMove getMove();
    descriptor: ()Lext/mods/gameserver/model/actor/move/CreatureMove;
    flags: (0x1041) ACC_PUBLIC, ACC_BRIDGE, ACC_SYNTHETIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #56                 // Method getMove:()Lext/mods/gameserver/model/actor/move/BoatMove;
         4: areturn
      LineNumberTable:
        line 44: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/Boat;

  public ext.mods.gameserver.model.actor.status.CreatureStatus getStatus();
    descriptor: ()Lext/mods/gameserver/model/actor/status/CreatureStatus;
    flags: (0x1041) ACC_PUBLIC, ACC_BRIDGE, ACC_SYNTHETIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #269                // Method getStatus:()Lext/mods/gameserver/model/actor/status/BoatStatus;
         4: areturn
      LineNumberTable:
        line 44: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/Boat;

  public ext.mods.gameserver.model.actor.ai.type.CreatureAI getAI();
    descriptor: ()Lext/mods/gameserver/model/actor/ai/type/CreatureAI;
    flags: (0x1041) ACC_PUBLIC, ACC_BRIDGE, ACC_SYNTHETIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #273                // Method getAI:()Lext/mods/gameserver/model/actor/ai/type/BoatAI;
         4: areturn
      LineNumberTable:
        line 44: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/Boat;

  public ext.mods.gameserver.model.item.kind.Item getSecondaryWeaponItem();
    descriptor: ()Lext/mods/gameserver/model/item/kind/Item;
    flags: (0x1041) ACC_PUBLIC, ACC_BRIDGE, ACC_SYNTHETIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #277                // Method getSecondaryWeaponItem:()Lext/mods/gameserver/model/item/kind/Weapon;
         4: areturn
      LineNumberTable:
        line 44: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/Boat;
}
SourceFile: "Boat.java"
BootstrapMethods:
  0: #375 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #369 Boat \u0001 passengers=\u0001
  1: #381 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #371 ()V
      #372 REF_invokeVirtual ext/mods/gameserver/model/actor/Boat.lambda$payForRide$0:(ILext/mods/gameserver/model/location/Location;)V
      #371 ()V
InnerClasses:
  public static final #391= #389 of #8;   // KeySetView=class java/util/concurrent/ConcurrentHashMap$KeySetView of class java/util/concurrent/ConcurrentHashMap
  public static final #396= #392 of #394; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
