// Bytecode for: ext.mods.gameserver.network.clientpackets.MoveBackwardToLocation
// File: ext\mods\gameserver\network\clientpackets\MoveBackwardToLocation.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/network/clientpackets/MoveBackwardToLocation.class
  Last modified 9 de jul de 2026; size 8916 bytes
  MD5 checksum 5219a55f6c46c7a3ab8c047329b3cd04
  Compiled from "MoveBackwardToLocation.java"
public class ext.mods.gameserver.network.clientpackets.MoveBackwardToLocation extends ext.mods.gameserver.network.clientpackets.L2GameClientPacket
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/network/clientpackets/MoveBackwardToLocation
  super_class: #2                         // ext/mods/gameserver/network/clientpackets/L2GameClientPacket
  interfaces: 0, fields: 8, methods: 4, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/gameserver/network/clientpackets/L2GameClientPacket."<init>":()V
    #2 = Class              #4            // ext/mods/gameserver/network/clientpackets/L2GameClientPacket
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               ext/mods/gameserver/network/clientpackets/L2GameClientPacket
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Methodref          #8.#9         // ext/mods/gameserver/network/clientpackets/MoveBackwardToLocation.readD:()I
    #8 = Class              #10           // ext/mods/gameserver/network/clientpackets/MoveBackwardToLocation
    #9 = NameAndType        #11:#12       // readD:()I
   #10 = Utf8               ext/mods/gameserver/network/clientpackets/MoveBackwardToLocation
   #11 = Utf8               readD
   #12 = Utf8               ()I
   #13 = Fieldref           #8.#14        // ext/mods/gameserver/network/clientpackets/MoveBackwardToLocation._targetX:I
   #14 = NameAndType        #15:#16       // _targetX:I
   #15 = Utf8               _targetX
   #16 = Utf8               I
   #17 = Fieldref           #8.#18        // ext/mods/gameserver/network/clientpackets/MoveBackwardToLocation._targetY:I
   #18 = NameAndType        #19:#16       // _targetY:I
   #19 = Utf8               _targetY
   #20 = Fieldref           #8.#21        // ext/mods/gameserver/network/clientpackets/MoveBackwardToLocation._targetZ:I
   #21 = NameAndType        #22:#16       // _targetZ:I
   #22 = Utf8               _targetZ
   #23 = Fieldref           #8.#24        // ext/mods/gameserver/network/clientpackets/MoveBackwardToLocation._originX:I
   #24 = NameAndType        #25:#16       // _originX:I
   #25 = Utf8               _originX
   #26 = Fieldref           #8.#27        // ext/mods/gameserver/network/clientpackets/MoveBackwardToLocation._originY:I
   #27 = NameAndType        #28:#16       // _originY:I
   #28 = Utf8               _originY
   #29 = Fieldref           #8.#30        // ext/mods/gameserver/network/clientpackets/MoveBackwardToLocation._originZ:I
   #30 = NameAndType        #31:#16       // _originZ:I
   #31 = Utf8               _originZ
   #32 = Fieldref           #8.#33        // ext/mods/gameserver/network/clientpackets/MoveBackwardToLocation._moveMovement:I
   #33 = NameAndType        #34:#16       // _moveMovement:I
   #34 = Utf8               _moveMovement
   #35 = Class              #36           // java/nio/BufferUnderflowException
   #36 = Utf8               java/nio/BufferUnderflowException
   #37 = Fieldref           #38.#39       // ext/mods/Config.L2WALKER_PROTECTION:Z
   #38 = Class              #40           // ext/mods/Config
   #39 = NameAndType        #41:#42       // L2WALKER_PROTECTION:Z
   #40 = Utf8               ext/mods/Config
   #41 = Utf8               L2WALKER_PROTECTION
   #42 = Utf8               Z
   #43 = Methodref          #8.#44        // ext/mods/gameserver/network/clientpackets/MoveBackwardToLocation.getClient:()Lext/mods/commons/mmocore/MMOClient;
   #44 = NameAndType        #45:#46       // getClient:()Lext/mods/commons/mmocore/MMOClient;
   #45 = Utf8               getClient
   #46 = Utf8               ()Lext/mods/commons/mmocore/MMOClient;
   #47 = Class              #48           // ext/mods/gameserver/network/GameClient
   #48 = Utf8               ext/mods/gameserver/network/GameClient
   #49 = Methodref          #47.#50       // ext/mods/gameserver/network/GameClient.getPlayer:()Lext/mods/gameserver/model/actor/Player;
   #50 = NameAndType        #51:#52       // getPlayer:()Lext/mods/gameserver/model/actor/Player;
   #51 = Utf8               getPlayer
   #52 = Utf8               ()Lext/mods/gameserver/model/actor/Player;
   #53 = Methodref          #54.#55       // ext/mods/gameserver/model/actor/Player.logout:(Z)V
   #54 = Class              #56           // ext/mods/gameserver/model/actor/Player
   #55 = NameAndType        #57:#58       // logout:(Z)V
   #56 = Utf8               ext/mods/gameserver/model/actor/Player
   #57 = Utf8               logout
   #58 = Utf8               (Z)V
   #59 = Methodref          #54.#60       // ext/mods/gameserver/model/actor/Player.getBoatInfo:()Lext/mods/gameserver/model/actor/container/player/BoatInfo;
   #60 = NameAndType        #61:#62       // getBoatInfo:()Lext/mods/gameserver/model/actor/container/player/BoatInfo;
   #61 = Utf8               getBoatInfo
   #62 = Utf8               ()Lext/mods/gameserver/model/actor/container/player/BoatInfo;
   #63 = Methodref          #54.#64       // ext/mods/gameserver/model/actor/Player.isOutOfControl:()Z
   #64 = NameAndType        #65:#66       // isOutOfControl:()Z
   #65 = Utf8               isOutOfControl
   #66 = Utf8               ()Z
   #67 = Methodref          #54.#68       // ext/mods/gameserver/model/actor/Player.getCast:()Lext/mods/gameserver/model/actor/cast/PlayerCast;
   #68 = NameAndType        #69:#70       // getCast:()Lext/mods/gameserver/model/actor/cast/PlayerCast;
   #69 = Utf8               getCast
   #70 = Utf8               ()Lext/mods/gameserver/model/actor/cast/PlayerCast;
   #71 = Methodref          #72.#73       // ext/mods/gameserver/model/actor/cast/PlayerCast.isCastingNow:()Z
   #72 = Class              #74           // ext/mods/gameserver/model/actor/cast/PlayerCast
   #73 = NameAndType        #75:#66       // isCastingNow:()Z
   #74 = Utf8               ext/mods/gameserver/model/actor/cast/PlayerCast
   #75 = Utf8               isCastingNow
   #76 = Fieldref           #77.#78       // ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
   #77 = Class              #79           // ext/mods/gameserver/network/serverpackets/ActionFailed
   #78 = NameAndType        #80:#81       // STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
   #79 = Utf8               ext/mods/gameserver/network/serverpackets/ActionFailed
   #80 = Utf8               STATIC_PACKET
   #81 = Utf8               Lext/mods/gameserver/network/serverpackets/ActionFailed;
   #82 = Methodref          #54.#83       // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #83 = NameAndType        #84:#85       // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #84 = Utf8               sendPacket
   #85 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #86 = Methodref          #54.#87       // ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
   #87 = NameAndType        #88:#89       // getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
   #88 = Utf8               getStatus
   #89 = Utf8               ()Lext/mods/gameserver/model/actor/status/PlayerStatus;
   #90 = Methodref          #91.#92       // ext/mods/gameserver/model/actor/status/PlayerStatus.getMoveSpeed:()F
   #91 = Class              #93           // ext/mods/gameserver/model/actor/status/PlayerStatus
   #92 = NameAndType        #94:#95       // getMoveSpeed:()F
   #93 = Utf8               ext/mods/gameserver/model/actor/status/PlayerStatus
   #94 = Utf8               getMoveSpeed
   #95 = Utf8               ()F
   #96 = Fieldref           #97.#98       // ext/mods/gameserver/network/SystemMessageId.CANT_MOVE_TOO_ENCUMBERED:Lext/mods/gameserver/network/SystemMessageId;
   #97 = Class              #99           // ext/mods/gameserver/network/SystemMessageId
   #98 = NameAndType        #100:#101     // CANT_MOVE_TOO_ENCUMBERED:Lext/mods/gameserver/network/SystemMessageId;
   #99 = Utf8               ext/mods/gameserver/network/SystemMessageId
  #100 = Utf8               CANT_MOVE_TOO_ENCUMBERED
  #101 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
  #102 = Methodref          #54.#103      // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
  #103 = NameAndType        #84:#104      // sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
  #104 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
  #105 = Methodref          #54.#106      // ext/mods/gameserver/model/actor/Player.cancelActiveEnchant:()V
  #106 = NameAndType        #107:#6       // cancelActiveEnchant:()V
  #107 = Utf8               cancelActiveEnchant
  #108 = Methodref          #54.#109      // ext/mods/gameserver/model/actor/Player.getCollisionHeight:()D
  #109 = NameAndType        #110:#111     // getCollisionHeight:()D
  #110 = Utf8               getCollisionHeight
  #111 = Utf8               ()D
  #112 = Fieldref           #113.#114     // ext/mods/gameserver/network/clientpackets/MoveBackwardToLocation$1.$SwitchMap$ext$mods$gameserver$enums$TeleportMode:[I
  #113 = Class              #115          // ext/mods/gameserver/network/clientpackets/MoveBackwardToLocation$1
  #114 = NameAndType        #116:#117     // $SwitchMap$ext$mods$gameserver$enums$TeleportMode:[I
  #115 = Utf8               ext/mods/gameserver/network/clientpackets/MoveBackwardToLocation$1
  #116 = Utf8               $SwitchMap$ext$mods$gameserver$enums$TeleportMode
  #117 = Utf8               [I
  #118 = Methodref          #54.#119      // ext/mods/gameserver/model/actor/Player.getTeleportMode:()Lext/mods/gameserver/enums/TeleportMode;
  #119 = NameAndType        #120:#121     // getTeleportMode:()Lext/mods/gameserver/enums/TeleportMode;
  #120 = Utf8               getTeleportMode
  #121 = Utf8               ()Lext/mods/gameserver/enums/TeleportMode;
  #122 = Methodref          #123.#124     // ext/mods/gameserver/enums/TeleportMode.ordinal:()I
  #123 = Class              #125          // ext/mods/gameserver/enums/TeleportMode
  #124 = NameAndType        #126:#12      // ordinal:()I
  #125 = Utf8               ext/mods/gameserver/enums/TeleportMode
  #126 = Utf8               ordinal
  #127 = Fieldref           #123.#128     // ext/mods/gameserver/enums/TeleportMode.NONE:Lext/mods/gameserver/enums/TeleportMode;
  #128 = NameAndType        #129:#130     // NONE:Lext/mods/gameserver/enums/TeleportMode;
  #129 = Utf8               NONE
  #130 = Utf8               Lext/mods/gameserver/enums/TeleportMode;
  #131 = Methodref          #54.#132      // ext/mods/gameserver/model/actor/Player.setTeleportMode:(Lext/mods/gameserver/enums/TeleportMode;)V
  #132 = NameAndType        #133:#134     // setTeleportMode:(Lext/mods/gameserver/enums/TeleportMode;)V
  #133 = Utf8               setTeleportMode
  #134 = Utf8               (Lext/mods/gameserver/enums/TeleportMode;)V
  #135 = Methodref          #54.#136      // ext/mods/gameserver/model/actor/Player.teleportTo:(IIII)Z
  #136 = NameAndType        #137:#138     // teleportTo:(IIII)Z
  #137 = Utf8               teleportTo
  #138 = Utf8               (IIII)Z
  #139 = Class              #140          // ext/mods/gameserver/model/location/Location
  #140 = Utf8               ext/mods/gameserver/model/location/Location
  #141 = Methodref          #139.#142     // ext/mods/gameserver/model/location/Location."<init>":(III)V
  #142 = NameAndType        #5:#143       // "<init>":(III)V
  #143 = Utf8               (III)V
  #144 = Methodref          #139.#145     // ext/mods/gameserver/model/location/Location.isIn3DRadius:(IIII)Z
  #145 = NameAndType        #146:#138     // isIn3DRadius:(IIII)Z
  #146 = Utf8               isIn3DRadius
  #147 = Methodref          #148.#149     // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager.getInstance:()Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager;
  #148 = Class              #150          // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager
  #149 = NameAndType        #151:#152     // getInstance:()Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager;
  #150 = Utf8               ext/mods/gameserver/model/entity/autofarm/AutoFarmManager
  #151 = Utf8               getInstance
  #152 = Utf8               ()Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager;
  #153 = Methodref          #54.#154      // ext/mods/gameserver/model/actor/Player.getObjectId:()I
  #154 = NameAndType        #155:#12      // getObjectId:()I
  #155 = Utf8               getObjectId
  #156 = Methodref          #148.#157     // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager.isPlayerAddingLoc:(I)Z
  #157 = NameAndType        #158:#159     // isPlayerAddingLoc:(I)Z
  #158 = Utf8               isPlayerAddingLoc
  #159 = Utf8               (I)Z
  #160 = Methodref          #148.#161     // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager.addAreaNode:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/location/Location;)V
  #161 = NameAndType        #162:#163     // addAreaNode:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/location/Location;)V
  #162 = Utf8               addAreaNode
  #163 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/location/Location;)V
  #164 = Methodref          #148.#165     // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager.isRouteFarmActive:(I)Z
  #165 = NameAndType        #166:#159     // isRouteFarmActive:(I)Z
  #166 = Utf8               isRouteFarmActive
  #167 = Methodref          #168.#169     // ext/mods/gameserver/model/actor/container/player/BoatInfo.isInBoat:()Z
  #168 = Class              #170          // ext/mods/gameserver/model/actor/container/player/BoatInfo
  #169 = NameAndType        #171:#66      // isInBoat:()Z
  #170 = Utf8               ext/mods/gameserver/model/actor/container/player/BoatInfo
  #171 = Utf8               isInBoat
  #172 = Methodref          #54.#173      // ext/mods/gameserver/model/actor/Player.tryToPassBoatEntrance:(Lext/mods/gameserver/model/location/Point2D;Z)Z
  #173 = NameAndType        #174:#175     // tryToPassBoatEntrance:(Lext/mods/gameserver/model/location/Point2D;Z)Z
  #174 = Utf8               tryToPassBoatEntrance
  #175 = Utf8               (Lext/mods/gameserver/model/location/Point2D;Z)Z
  #176 = Methodref          #168.#177     // ext/mods/gameserver/model/actor/container/player/BoatInfo.setCanBoard:(Z)V
  #177 = NameAndType        #178:#58      // setCanBoard:(Z)V
  #178 = Utf8               setCanBoard
  #179 = Methodref          #139.#180     // ext/mods/gameserver/model/location/Location.getX:()I
  #180 = NameAndType        #181:#12      // getX:()I
  #181 = Utf8               getX
  #182 = Methodref          #54.#180      // ext/mods/gameserver/model/actor/Player.getX:()I
  #183 = Methodref          #139.#184     // ext/mods/gameserver/model/location/Location.getY:()I
  #184 = NameAndType        #185:#12      // getY:()I
  #185 = Utf8               getY
  #186 = Methodref          #54.#184      // ext/mods/gameserver/model/actor/Player.getY:()I
  #187 = Methodref          #188.#189     // java/lang/Math.sqrt:(D)D
  #188 = Class              #190          // java/lang/Math
  #189 = NameAndType        #191:#192     // sqrt:(D)D
  #190 = Utf8               java/lang/Math
  #191 = Utf8               sqrt
  #192 = Utf8               (D)D
  #193 = Double             16.0d
  #195 = Methodref          #54.#196      // ext/mods/gameserver/model/actor/Player.getZ:()I
  #196 = NameAndType        #197:#12      // getZ:()I
  #197 = Utf8               getZ
  #198 = Methodref          #199.#200     // ext/mods/gameserver/geoengine/GeoEngine.getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
  #199 = Class              #201          // ext/mods/gameserver/geoengine/GeoEngine
  #200 = NameAndType        #151:#202     // getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
  #201 = Utf8               ext/mods/gameserver/geoengine/GeoEngine
  #202 = Utf8               ()Lext/mods/gameserver/geoengine/GeoEngine;
  #203 = Methodref          #139.#196     // ext/mods/gameserver/model/location/Location.getZ:()I
  #204 = Methodref          #199.#205     // ext/mods/gameserver/geoengine/GeoEngine.canMove:(IIIIIILext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Z
  #205 = NameAndType        #206:#207     // canMove:(IIIIIILext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Z
  #206 = Utf8               canMove
  #207 = Utf8               (IIIIIILext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Z
  #208 = Methodref          #54.#209      // ext/mods/gameserver/model/actor/Player.getMove:()Lext/mods/gameserver/model/actor/move/PlayerMove;
  #209 = NameAndType        #210:#211     // getMove:()Lext/mods/gameserver/model/actor/move/PlayerMove;
  #210 = Utf8               getMove
  #211 = Utf8               ()Lext/mods/gameserver/model/actor/move/PlayerMove;
  #212 = Methodref          #199.#213     // ext/mods/gameserver/geoengine/GeoEngine.getValidLocation:(Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/location/Location;)Lext/mods/gameserver/model/location/Location;
  #213 = NameAndType        #214:#215     // getValidLocation:(Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/location/Location;)Lext/mods/gameserver/model/location/Location;
  #214 = Utf8               getValidLocation
  #215 = Utf8               (Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/location/Location;)Lext/mods/gameserver/model/location/Location;
  #216 = Methodref          #217.#218     // ext/mods/gameserver/model/actor/move/PlayerMove.maybeMoveToLocation:(Lext/mods/gameserver/model/location/Location;IZZ)Z
  #217 = Class              #219          // ext/mods/gameserver/model/actor/move/PlayerMove
  #218 = NameAndType        #220:#221     // maybeMoveToLocation:(Lext/mods/gameserver/model/location/Location;IZZ)Z
  #219 = Utf8               ext/mods/gameserver/model/actor/move/PlayerMove
  #220 = Utf8               maybeMoveToLocation
  #221 = Utf8               (Lext/mods/gameserver/model/location/Location;IZZ)Z
  #222 = Methodref          #54.#223      // ext/mods/gameserver/model/actor/Player.getAI:()Lext/mods/gameserver/model/actor/ai/type/PlayerAI;
  #223 = NameAndType        #224:#225     // getAI:()Lext/mods/gameserver/model/actor/ai/type/PlayerAI;
  #224 = Utf8               getAI
  #225 = Utf8               ()Lext/mods/gameserver/model/actor/ai/type/PlayerAI;
  #226 = Methodref          #227.#228     // ext/mods/gameserver/model/actor/ai/type/PlayerAI.tryToMoveTo:(Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/actor/Boat;)V
  #227 = Class              #229          // ext/mods/gameserver/model/actor/ai/type/PlayerAI
  #228 = NameAndType        #230:#231     // tryToMoveTo:(Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/actor/Boat;)V
  #229 = Utf8               ext/mods/gameserver/model/actor/ai/type/PlayerAI
  #230 = Utf8               tryToMoveTo
  #231 = Utf8               (Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/actor/Boat;)V
  #232 = Methodref          #233.#234     // ext/mods/extensions/listener/manager/CreatureListenerManager.getInstance:()Lext/mods/extensions/listener/manager/CreatureListenerManager;
  #233 = Class              #235          // ext/mods/extensions/listener/manager/CreatureListenerManager
  #234 = NameAndType        #151:#236     // getInstance:()Lext/mods/extensions/listener/manager/CreatureListenerManager;
  #235 = Utf8               ext/mods/extensions/listener/manager/CreatureListenerManager
  #236 = Utf8               ()Lext/mods/extensions/listener/manager/CreatureListenerManager;
  #237 = Methodref          #233.#238     // ext/mods/extensions/listener/manager/CreatureListenerManager.notifyMove:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/location/Location;)V
  #238 = NameAndType        #239:#240     // notifyMove:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/location/Location;)V
  #239 = Utf8               notifyMove
  #240 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/location/Location;)V
  #241 = Methodref          #54.#242      // ext/mods/gameserver/model/actor/Player.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
  #242 = NameAndType        #243:#244     // getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
  #243 = Utf8               getPosition
  #244 = Utf8               ()Lext/mods/gameserver/model/location/SpawnLocation;
  #245 = Methodref          #246.#247     // ext/mods/commons/math/MathUtil.calculateHeadingFrom:(IIII)I
  #246 = Class              #248          // ext/mods/commons/math/MathUtil
  #247 = NameAndType        #249:#250     // calculateHeadingFrom:(IIII)I
  #248 = Utf8               ext/mods/commons/math/MathUtil
  #249 = Utf8               calculateHeadingFrom
  #250 = Utf8               (IIII)I
  #251 = Methodref          #252.#253     // ext/mods/gameserver/model/location/SpawnLocation.setHeading:(I)V
  #252 = Class              #254          // ext/mods/gameserver/model/location/SpawnLocation
  #253 = NameAndType        #255:#256     // setHeading:(I)V
  #254 = Utf8               ext/mods/gameserver/model/location/SpawnLocation
  #255 = Utf8               setHeading
  #256 = Utf8               (I)V
  #257 = Methodref          #168.#258     // ext/mods/gameserver/model/actor/container/player/BoatInfo.getBoat:()Lext/mods/gameserver/model/actor/Boat;
  #258 = NameAndType        #259:#260     // getBoat:()Lext/mods/gameserver/model/actor/Boat;
  #259 = Utf8               getBoat
  #260 = Utf8               ()Lext/mods/gameserver/model/actor/Boat;
  #261 = Methodref          #8.#83        // ext/mods/gameserver/network/clientpackets/MoveBackwardToLocation.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #262 = Methodref          #263.#264     // ext/mods/gameserver/model/actor/Boat.getDock:()Lext/mods/gameserver/enums/boats/BoatDock;
  #263 = Class              #265          // ext/mods/gameserver/model/actor/Boat
  #264 = NameAndType        #266:#267     // getDock:()Lext/mods/gameserver/enums/boats/BoatDock;
  #265 = Utf8               ext/mods/gameserver/model/actor/Boat
  #266 = Utf8               getDock
  #267 = Utf8               ()Lext/mods/gameserver/enums/boats/BoatDock;
  #268 = Methodref          #263.#269     // ext/mods/gameserver/model/actor/Boat.isMoving:()Z
  #269 = NameAndType        #270:#66      // isMoving:()Z
  #270 = Utf8               isMoving
  #271 = Class              #272          // ext/mods/gameserver/model/location/Point2D
  #272 = Utf8               ext/mods/gameserver/model/location/Point2D
  #273 = Methodref          #271.#274     // ext/mods/gameserver/model/location/Point2D."<init>":(II)V
  #274 = NameAndType        #5:#275       // "<init>":(II)V
  #275 = Utf8               (II)V
  #276 = Methodref          #277.#278     // ext/mods/gameserver/enums/boats/BoatDock.getBoardingPoint:(Lext/mods/gameserver/model/location/Point2D;Lext/mods/gameserver/model/location/Point2D;Z)Lext/mods/gameserver/model/location/Point2D;
  #277 = Class              #279          // ext/mods/gameserver/enums/boats/BoatDock
  #278 = NameAndType        #280:#281     // getBoardingPoint:(Lext/mods/gameserver/model/location/Point2D;Lext/mods/gameserver/model/location/Point2D;Z)Lext/mods/gameserver/model/location/Point2D;
  #279 = Utf8               ext/mods/gameserver/enums/boats/BoatDock
  #280 = Utf8               getBoardingPoint
  #281 = Utf8               (Lext/mods/gameserver/model/location/Point2D;Lext/mods/gameserver/model/location/Point2D;Z)Lext/mods/gameserver/model/location/Point2D;
  #282 = Methodref          #277.#283     // ext/mods/gameserver/enums/boats/BoatDock.getBoatExit:()Lext/mods/commons/geometry/basic/Line2D;
  #283 = NameAndType        #284:#285     // getBoatExit:()Lext/mods/commons/geometry/basic/Line2D;
  #284 = Utf8               getBoatExit
  #285 = Utf8               ()Lext/mods/commons/geometry/basic/Line2D;
  #286 = Methodref          #277.#287     // ext/mods/gameserver/enums/boats/BoatDock.getBoardingPoint:(Lext/mods/commons/geometry/basic/Line2D;Lext/mods/gameserver/model/location/Point2D;Lext/mods/gameserver/model/location/Point2D;Z)Lext/mods/gameserver/model/location/Point2D;
  #287 = NameAndType        #280:#288     // getBoardingPoint:(Lext/mods/commons/geometry/basic/Line2D;Lext/mods/gameserver/model/location/Point2D;Lext/mods/gameserver/model/location/Point2D;Z)Lext/mods/gameserver/model/location/Point2D;
  #288 = Utf8               (Lext/mods/commons/geometry/basic/Line2D;Lext/mods/gameserver/model/location/Point2D;Lext/mods/gameserver/model/location/Point2D;Z)Lext/mods/gameserver/model/location/Point2D;
  #289 = Methodref          #168.#290     // ext/mods/gameserver/model/actor/container/player/BoatInfo.getBoatPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
  #290 = NameAndType        #291:#244     // getBoatPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
  #291 = Utf8               getBoatPosition
  #292 = Methodref          #168.#293     // ext/mods/gameserver/model/actor/container/player/BoatInfo.setBoatMovement:(Z)V
  #293 = NameAndType        #294:#58      // setBoatMovement:(Z)V
  #294 = Utf8               setBoatMovement
  #295 = Double             400.0d
  #297 = Methodref          #271.#298     // ext/mods/gameserver/model/location/Point2D.distance2D:(Lext/mods/gameserver/model/location/Point2D;)D
  #298 = NameAndType        #299:#300     // distance2D:(Lext/mods/gameserver/model/location/Point2D;)D
  #299 = Utf8               distance2D
  #300 = Utf8               (Lext/mods/gameserver/model/location/Point2D;)D
  #301 = Double             90.0d
  #303 = Class              #304          // ext/mods/gameserver/network/serverpackets/MoveToLocation
  #304 = Utf8               ext/mods/gameserver/network/serverpackets/MoveToLocation
  #305 = Methodref          #271.#180     // ext/mods/gameserver/model/location/Point2D.getX:()I
  #306 = Methodref          #271.#184     // ext/mods/gameserver/model/location/Point2D.getY:()I
  #307 = Methodref          #303.#308     // ext/mods/gameserver/network/serverpackets/MoveToLocation."<init>":(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/location/Location;)V
  #308 = NameAndType        #5:#240       // "<init>":(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/location/Location;)V
  #309 = Methodref          #54.#310      // ext/mods/gameserver/model/actor/Player.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #310 = NameAndType        #311:#85      // broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #311 = Utf8               broadcastPacket
  #312 = Methodref          #252.#180     // ext/mods/gameserver/model/location/SpawnLocation.getX:()I
  #313 = Methodref          #252.#184     // ext/mods/gameserver/model/location/SpawnLocation.getY:()I
  #314 = Fieldref           #8.#315       // ext/mods/gameserver/network/clientpackets/MoveBackwardToLocation.CENTER_BOAT:Lext/mods/gameserver/model/location/Point2D;
  #315 = NameAndType        #316:#317     // CENTER_BOAT:Lext/mods/gameserver/model/location/Point2D;
  #316 = Utf8               CENTER_BOAT
  #317 = Utf8               Lext/mods/gameserver/model/location/Point2D;
  #318 = Double             350.0d
  #320 = Double             200.0d
  #322 = Double             250.0d
  #324 = Methodref          #277.#325     // ext/mods/gameserver/enums/boats/BoatDock.convertWorldToBoatCoordinates:(II)Lext/mods/gameserver/model/location/Point2D;
  #325 = NameAndType        #326:#327     // convertWorldToBoatCoordinates:(II)Lext/mods/gameserver/model/location/Point2D;
  #326 = Utf8               convertWorldToBoatCoordinates
  #327 = Utf8               (II)Lext/mods/gameserver/model/location/Point2D;
  #328 = Class              #329          // ext/mods/gameserver/network/serverpackets/MoveToLocationInVehicle
  #329 = Utf8               ext/mods/gameserver/network/serverpackets/MoveToLocationInVehicle
  #330 = Methodref          #328.#331     // ext/mods/gameserver/network/serverpackets/MoveToLocationInVehicle."<init>":(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Boat;IIIIII)V
  #331 = NameAndType        #5:#332       // "<init>":(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Boat;IIIIII)V
  #332 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Boat;IIIIII)V
  #333 = Utf8               Code
  #334 = Utf8               LineNumberTable
  #335 = Utf8               LocalVariableTable
  #336 = Utf8               this
  #337 = Utf8               Lext/mods/gameserver/network/clientpackets/MoveBackwardToLocation;
  #338 = Utf8               readImpl
  #339 = Utf8               player
  #340 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #341 = Utf8               e
  #342 = Utf8               Ljava/nio/BufferUnderflowException;
  #343 = Utf8               StackMapTable
  #344 = Utf8               runImpl
  #345 = Utf8               vectorX
  #346 = Utf8               vectorY
  #347 = Utf8               magnitude
  #348 = Utf8               D
  #349 = Utf8               unitVectorX
  #350 = Utf8               unitVectorY
  #351 = Utf8               newVectorX
  #352 = Utf8               newVectorY
  #353 = Utf8               newX
  #354 = Utf8               newY
  #355 = Utf8               checkLoc
  #356 = Utf8               Lext/mods/gameserver/model/location/Location;
  #357 = Utf8               tX
  #358 = Utf8               tY
  #359 = Utf8               boat
  #360 = Utf8               Lext/mods/gameserver/model/actor/Boat;
  #361 = Utf8               dock
  #362 = Utf8               Lext/mods/gameserver/enums/boats/BoatDock;
  #363 = Utf8               targetPoint
  #364 = Utf8               originPoint
  #365 = Utf8               boardingPoint
  #366 = Utf8               pos
  #367 = Utf8               oX
  #368 = Utf8               oY
  #369 = Utf8               z
  #370 = Utf8               distToBorder
  #371 = Utf8               boatPos
  #372 = Utf8               Lext/mods/gameserver/model/location/SpawnLocation;
  #373 = Utf8               currentPoint
  #374 = Utf8               distToCenter
  #375 = Utf8               info
  #376 = Utf8               Lext/mods/gameserver/model/actor/container/player/BoatInfo;
  #377 = Utf8               targetLoc
  #378 = Utf8               <clinit>
  #379 = Utf8               SourceFile
  #380 = Utf8               MoveBackwardToLocation.java
  #381 = Utf8               NestMembers
  #382 = Utf8               InnerClasses
{
  public ext.mods.gameserver.network.clientpackets.MoveBackwardToLocation();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method ext/mods/gameserver/network/clientpackets/L2GameClientPacket."<init>":()V
         4: return
      LineNumberTable:
        line 40: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/network/clientpackets/MoveBackwardToLocation;

  protected void readImpl();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=2, locals=3, args_size=1
         0: aload_0
         1: aload_0
         2: invokevirtual #7                  // Method readD:()I
         5: putfield      #13                 // Field _targetX:I
         8: aload_0
         9: aload_0
        10: invokevirtual #7                  // Method readD:()I
        13: putfield      #17                 // Field _targetY:I
        16: aload_0
        17: aload_0
        18: invokevirtual #7                  // Method readD:()I
        21: putfield      #20                 // Field _targetZ:I
        24: aload_0
        25: aload_0
        26: invokevirtual #7                  // Method readD:()I
        29: putfield      #23                 // Field _originX:I
        32: aload_0
        33: aload_0
        34: invokevirtual #7                  // Method readD:()I
        37: putfield      #26                 // Field _originY:I
        40: aload_0
        41: aload_0
        42: invokevirtual #7                  // Method readD:()I
        45: putfield      #29                 // Field _originZ:I
        48: aload_0
        49: aload_0
        50: invokevirtual #7                  // Method readD:()I
        53: putfield      #32                 // Field _moveMovement:I
        56: goto          86
        59: astore_1
        60: getstatic     #37                 // Field ext/mods/Config.L2WALKER_PROTECTION:Z
        63: ifeq          86
        66: aload_0
        67: invokevirtual #43                 // Method getClient:()Lext/mods/commons/mmocore/MMOClient;
        70: checkcast     #47                 // class ext/mods/gameserver/network/GameClient
        73: invokevirtual #49                 // Method ext/mods/gameserver/network/GameClient.getPlayer:()Lext/mods/gameserver/model/actor/Player;
        76: astore_2
        77: aload_2
        78: ifnull        86
        81: aload_2
        82: iconst_0
        83: invokevirtual #53                 // Method ext/mods/gameserver/model/actor/Player.logout:(Z)V
        86: return
      Exception table:
         from    to  target type
            48    56    59   Class java/nio/BufferUnderflowException
      LineNumberTable:
        line 55: 0
        line 56: 8
        line 57: 16
        line 58: 24
        line 59: 32
        line 60: 40
        line 64: 48
        line 74: 56
        line 66: 59
        line 68: 60
        line 70: 66
        line 71: 77
        line 72: 81
        line 75: 86
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           77       9     2 player   Lext/mods/gameserver/model/actor/Player;
           60      26     1     e   Ljava/nio/BufferUnderflowException;
            0      87     0  this   Lext/mods/gameserver/network/clientpackets/MoveBackwardToLocation;
      StackMapTable: number_of_entries = 2
        frame_type = 123 /* same_locals_1_stack_item */
          stack = [ class java/nio/BufferUnderflowException ]
        frame_type = 26 /* same */

  protected void runImpl();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=11, locals=23, args_size=1
         0: aload_0
         1: invokevirtual #43                 // Method getClient:()Lext/mods/commons/mmocore/MMOClient;
         4: checkcast     #47                 // class ext/mods/gameserver/network/GameClient
         7: invokevirtual #49                 // Method ext/mods/gameserver/network/GameClient.getPlayer:()Lext/mods/gameserver/model/actor/Player;
        10: astore_1
        11: aload_1
        12: ifnonnull     16
        15: return
        16: aload_1
        17: invokevirtual #59                 // Method ext/mods/gameserver/model/actor/Player.getBoatInfo:()Lext/mods/gameserver/model/actor/container/player/BoatInfo;
        20: astore_2
        21: aload_1
        22: invokevirtual #63                 // Method ext/mods/gameserver/model/actor/Player.isOutOfControl:()Z
        25: ifne          38
        28: aload_1
        29: invokevirtual #67                 // Method ext/mods/gameserver/model/actor/Player.getCast:()Lext/mods/gameserver/model/actor/cast/PlayerCast;
        32: invokevirtual #71                 // Method ext/mods/gameserver/model/actor/cast/PlayerCast.isCastingNow:()Z
        35: ifeq          46
        38: aload_1
        39: getstatic     #76                 // Field ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
        42: invokevirtual #82                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        45: return
        46: aload_1
        47: invokevirtual #86                 // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
        50: invokevirtual #90                 // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getMoveSpeed:()F
        53: fconst_0
        54: fcmpl
        55: ifne          73
        58: aload_1
        59: getstatic     #76                 // Field ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
        62: invokevirtual #82                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        65: aload_1
        66: getstatic     #96                 // Field ext/mods/gameserver/network/SystemMessageId.CANT_MOVE_TOO_ENCUMBERED:Lext/mods/gameserver/network/SystemMessageId;
        69: invokevirtual #102                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        72: return
        73: aload_1
        74: invokevirtual #105                // Method ext/mods/gameserver/model/actor/Player.cancelActiveEnchant:()V
        77: aload_0
        78: dup
        79: getfield      #20                 // Field _targetZ:I
        82: i2d
        83: aload_1
        84: invokevirtual #108                // Method ext/mods/gameserver/model/actor/Player.getCollisionHeight:()D
        87: dadd
        88: d2i
        89: putfield      #20                 // Field _targetZ:I
        92: getstatic     #112                // Field ext/mods/gameserver/network/clientpackets/MoveBackwardToLocation$1.$SwitchMap$ext$mods$gameserver$enums$TeleportMode:[I
        95: aload_1
        96: invokevirtual #118                // Method ext/mods/gameserver/model/actor/Player.getTeleportMode:()Lext/mods/gameserver/enums/TeleportMode;
        99: invokevirtual #122                // Method ext/mods/gameserver/enums/TeleportMode.ordinal:()I
       102: iaload
       103: lookupswitch  { // 2

                       1: 128

                       2: 135
                 default: 161
            }
       128: aload_1
       129: getstatic     #127                // Field ext/mods/gameserver/enums/TeleportMode.NONE:Lext/mods/gameserver/enums/TeleportMode;
       132: invokevirtual #131                // Method ext/mods/gameserver/model/actor/Player.setTeleportMode:(Lext/mods/gameserver/enums/TeleportMode;)V
       135: aload_1
       136: getstatic     #76                 // Field ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
       139: invokevirtual #82                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       142: aload_1
       143: aload_0
       144: getfield      #13                 // Field _targetX:I
       147: aload_0
       148: getfield      #17                 // Field _targetY:I
       151: aload_0
       152: getfield      #20                 // Field _targetZ:I
       155: iconst_0
       156: invokevirtual #135                // Method ext/mods/gameserver/model/actor/Player.teleportTo:(IIII)Z
       159: pop
       160: return
       161: new           #139                // class ext/mods/gameserver/model/location/Location
       164: dup
       165: aload_0
       166: getfield      #13                 // Field _targetX:I
       169: aload_0
       170: getfield      #17                 // Field _targetY:I
       173: aload_0
       174: getfield      #20                 // Field _targetZ:I
       177: invokespecial #141                // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
       180: astore_3
       181: aload_3
       182: aload_0
       183: getfield      #23                 // Field _originX:I
       186: aload_0
       187: getfield      #26                 // Field _originY:I
       190: aload_0
       191: getfield      #29                 // Field _originZ:I
       194: sipush        9900
       197: invokevirtual #144                // Method ext/mods/gameserver/model/location/Location.isIn3DRadius:(IIII)Z
       200: ifne          211
       203: aload_1
       204: getstatic     #76                 // Field ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
       207: invokevirtual #82                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       210: return
       211: invokestatic  #147                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmManager.getInstance:()Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager;
       214: aload_1
       215: invokevirtual #153                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
       218: invokevirtual #156                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmManager.isPlayerAddingLoc:(I)Z
       221: ifeq          240
       224: invokestatic  #147                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmManager.getInstance:()Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager;
       227: aload_1
       228: aload_3
       229: invokevirtual #160                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmManager.addAreaNode:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/location/Location;)V
       232: aload_1
       233: getstatic     #76                 // Field ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
       236: invokevirtual #82                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       239: return
       240: invokestatic  #147                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmManager.getInstance:()Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager;
       243: aload_1
       244: invokevirtual #153                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
       247: invokevirtual #164                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmManager.isRouteFarmActive:(I)Z
       250: ifeq          261
       253: aload_1
       254: getstatic     #76                 // Field ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
       257: invokevirtual #82                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       260: return
       261: aload_2
       262: invokevirtual #167                // Method ext/mods/gameserver/model/actor/container/player/BoatInfo.isInBoat:()Z
       265: istore        4
       267: iload         4
       269: ifne          522
       272: aload_1
       273: aload_3
       274: aload_0
       275: getfield      #32                 // Field _moveMovement:I
       278: ifne          285
       281: iconst_1
       282: goto          286
       285: iconst_0
       286: invokevirtual #172                // Method ext/mods/gameserver/model/actor/Player.tryToPassBoatEntrance:(Lext/mods/gameserver/model/location/Point2D;Z)Z
       289: ifeq          293
       292: return
       293: aload_2
       294: iconst_0
       295: invokevirtual #176                // Method ext/mods/gameserver/model/actor/container/player/BoatInfo.setCanBoard:(Z)V
       298: aload_0
       299: getfield      #32                 // Field _moveMovement:I
       302: ifne          502
       305: aload_3
       306: invokevirtual #179                // Method ext/mods/gameserver/model/location/Location.getX:()I
       309: aload_1
       310: invokevirtual #182                // Method ext/mods/gameserver/model/actor/Player.getX:()I
       313: isub
       314: istore        5
       316: aload_3
       317: invokevirtual #183                // Method ext/mods/gameserver/model/location/Location.getY:()I
       320: aload_1
       321: invokevirtual #186                // Method ext/mods/gameserver/model/actor/Player.getY:()I
       324: isub
       325: istore        6
       327: iload         5
       329: iload         5
       331: imul
       332: iload         6
       334: iload         6
       336: imul
       337: iadd
       338: i2d
       339: invokestatic  #187                // Method java/lang/Math.sqrt:(D)D
       342: dstore        7
       344: dload         7
       346: dconst_1
       347: dcmpg
       348: ifge          359
       351: aload_1
       352: getstatic     #76                 // Field ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
       355: invokevirtual #82                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       358: return
       359: iload         5
       361: i2d
       362: dload         7
       364: ddiv
       365: dstore        9
       367: iload         6
       369: i2d
       370: dload         7
       372: ddiv
       373: dstore        11
       375: dload         9
       377: ldc2_w        #193                // double 16.0d
       380: dmul
       381: d2i
       382: istore        13
       384: dload         11
       386: ldc2_w        #193                // double 16.0d
       389: dmul
       390: d2i
       391: istore        14
       393: aload_1
       394: invokevirtual #182                // Method ext/mods/gameserver/model/actor/Player.getX:()I
       397: iload         13
       399: iadd
       400: istore        15
       402: aload_1
       403: invokevirtual #186                // Method ext/mods/gameserver/model/actor/Player.getY:()I
       406: iload         14
       408: iadd
       409: istore        16
       411: new           #139                // class ext/mods/gameserver/model/location/Location
       414: dup
       415: iload         15
       417: iload         16
       419: aload_1
       420: invokevirtual #195                // Method ext/mods/gameserver/model/actor/Player.getZ:()I
       423: invokespecial #141                // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
       426: astore        17
       428: invokestatic  #198                // Method ext/mods/gameserver/geoengine/GeoEngine.getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
       431: aload_1
       432: invokevirtual #182                // Method ext/mods/gameserver/model/actor/Player.getX:()I
       435: aload_1
       436: invokevirtual #186                // Method ext/mods/gameserver/model/actor/Player.getY:()I
       439: aload_1
       440: invokevirtual #195                // Method ext/mods/gameserver/model/actor/Player.getZ:()I
       443: aload         17
       445: invokevirtual #179                // Method ext/mods/gameserver/model/location/Location.getX:()I
       448: aload         17
       450: invokevirtual #183                // Method ext/mods/gameserver/model/location/Location.getY:()I
       453: aload         17
       455: invokevirtual #203                // Method ext/mods/gameserver/model/location/Location.getZ:()I
       458: aconst_null
       459: invokevirtual #204                // Method ext/mods/gameserver/geoengine/GeoEngine.canMove:(IIIIIILext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Z
       462: ifne          473
       465: aload_1
       466: getstatic     #76                 // Field ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
       469: invokevirtual #82                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       472: return
       473: aload_1
       474: invokevirtual #208                // Method ext/mods/gameserver/model/actor/Player.getMove:()Lext/mods/gameserver/model/actor/move/PlayerMove;
       477: invokestatic  #198                // Method ext/mods/gameserver/geoengine/GeoEngine.getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
       480: aload_1
       481: aload_3
       482: invokevirtual #212                // Method ext/mods/gameserver/geoengine/GeoEngine.getValidLocation:(Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/location/Location;)Lext/mods/gameserver/model/location/Location;
       485: iconst_0
       486: iconst_0
       487: iconst_0
       488: invokevirtual #216                // Method ext/mods/gameserver/model/actor/move/PlayerMove.maybeMoveToLocation:(Lext/mods/gameserver/model/location/Location;IZZ)Z
       491: ifne          501
       494: aload_1
       495: getstatic     #76                 // Field ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
       498: invokevirtual #82                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       501: return
       502: aload_1
       503: invokevirtual #222                // Method ext/mods/gameserver/model/actor/Player.getAI:()Lext/mods/gameserver/model/actor/ai/type/PlayerAI;
       506: aload_3
       507: aconst_null
       508: invokevirtual #226                // Method ext/mods/gameserver/model/actor/ai/type/PlayerAI.tryToMoveTo:(Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/actor/Boat;)V
       511: invokestatic  #232                // Method ext/mods/extensions/listener/manager/CreatureListenerManager.getInstance:()Lext/mods/extensions/listener/manager/CreatureListenerManager;
       514: aload_1
       515: aload_3
       516: invokevirtual #237                // Method ext/mods/extensions/listener/manager/CreatureListenerManager.notifyMove:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/location/Location;)V
       519: goto          1007
       522: aload_1
       523: invokevirtual #241                // Method ext/mods/gameserver/model/actor/Player.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
       526: aload_0
       527: getfield      #23                 // Field _originX:I
       530: aload_0
       531: getfield      #26                 // Field _originY:I
       534: aload_0
       535: getfield      #13                 // Field _targetX:I
       538: aload_0
       539: getfield      #17                 // Field _targetY:I
       542: invokestatic  #245                // Method ext/mods/commons/math/MathUtil.calculateHeadingFrom:(IIII)I
       545: invokevirtual #251                // Method ext/mods/gameserver/model/location/SpawnLocation.setHeading:(I)V
       548: aload_2
       549: invokevirtual #257                // Method ext/mods/gameserver/model/actor/container/player/BoatInfo.getBoat:()Lext/mods/gameserver/model/actor/Boat;
       552: astore        5
       554: aload         5
       556: ifnonnull     567
       559: aload_0
       560: getstatic     #76                 // Field ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
       563: invokevirtual #261                // Method sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       566: return
       567: aload         5
       569: invokevirtual #262                // Method ext/mods/gameserver/model/actor/Boat.getDock:()Lext/mods/gameserver/enums/boats/BoatDock;
       572: astore        6
       574: aload         6
       576: ifnonnull     587
       579: aload_0
       580: getstatic     #76                 // Field ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
       583: invokevirtual #261                // Method sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       586: return
       587: aload         5
       589: invokevirtual #268                // Method ext/mods/gameserver/model/actor/Boat.isMoving:()Z
       592: istore        7
       594: new           #271                // class ext/mods/gameserver/model/location/Point2D
       597: dup
       598: aload_0
       599: getfield      #13                 // Field _targetX:I
       602: aload_0
       603: getfield      #17                 // Field _targetY:I
       606: invokespecial #273                // Method ext/mods/gameserver/model/location/Point2D."<init>":(II)V
       609: astore        8
       611: new           #271                // class ext/mods/gameserver/model/location/Point2D
       614: dup
       615: aload_0
       616: getfield      #23                 // Field _originX:I
       619: aload_0
       620: getfield      #26                 // Field _originY:I
       623: invokespecial #273                // Method ext/mods/gameserver/model/location/Point2D."<init>":(II)V
       626: astore        9
       628: aload         6
       630: aload         9
       632: aload         8
       634: iload         4
       636: invokevirtual #276                // Method ext/mods/gameserver/enums/boats/BoatDock.getBoardingPoint:(Lext/mods/gameserver/model/location/Point2D;Lext/mods/gameserver/model/location/Point2D;Z)Lext/mods/gameserver/model/location/Point2D;
       639: astore        10
       641: aload         10
       643: ifnonnull     662
       646: aload         6
       648: invokevirtual #282                // Method ext/mods/gameserver/enums/boats/BoatDock.getBoatExit:()Lext/mods/commons/geometry/basic/Line2D;
       651: aload         9
       653: aload         8
       655: iload         4
       657: invokestatic  #286                // Method ext/mods/gameserver/enums/boats/BoatDock.getBoardingPoint:(Lext/mods/commons/geometry/basic/Line2D;Lext/mods/gameserver/model/location/Point2D;Lext/mods/gameserver/model/location/Point2D;Z)Lext/mods/gameserver/model/location/Point2D;
       660: astore        10
       662: aload         10
       664: ifnonnull     680
       667: iload         7
       669: ifne          680
       672: aload_0
       673: getstatic     #76                 // Field ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
       676: invokevirtual #261                // Method sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       679: return
       680: aload_2
       681: invokevirtual #289                // Method ext/mods/gameserver/model/actor/container/player/BoatInfo.getBoatPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
       684: astore        11
       686: aload         11
       688: invokevirtual #179                // Method ext/mods/gameserver/model/location/Location.getX:()I
       691: istore        12
       693: aload         11
       695: invokevirtual #183                // Method ext/mods/gameserver/model/location/Location.getY:()I
       698: istore        13
       700: aload         11
       702: invokevirtual #203                // Method ext/mods/gameserver/model/location/Location.getZ:()I
       705: istore        14
       707: aload_2
       708: iconst_1
       709: invokevirtual #292                // Method ext/mods/gameserver/model/actor/container/player/BoatInfo.setBoatMovement:(Z)V
       712: iload         7
       714: ifeq          723
       717: ldc2_w        #295                // double 400.0d
       720: goto          730
       723: aload         9
       725: aload         10
       727: invokevirtual #297                // Method ext/mods/gameserver/model/location/Point2D.distance2D:(Lext/mods/gameserver/model/location/Point2D;)D
       730: dstore        15
       732: aload         10
       734: ifnull        789
       737: dload         15
       739: ldc2_w        #301                // double 90.0d
       742: dcmpg
       743: ifge          789
       746: aload_1
       747: new           #303                // class ext/mods/gameserver/network/serverpackets/MoveToLocation
       750: dup
       751: aload_1
       752: new           #139                // class ext/mods/gameserver/model/location/Location
       755: dup
       756: aload         10
       758: invokevirtual #305                // Method ext/mods/gameserver/model/location/Point2D.getX:()I
       761: aload         10
       763: invokevirtual #306                // Method ext/mods/gameserver/model/location/Point2D.getY:()I
       766: sipush        -3624
       769: invokespecial #141                // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
       772: invokespecial #307                // Method ext/mods/gameserver/network/serverpackets/MoveToLocation."<init>":(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/location/Location;)V
       775: invokevirtual #309                // Method ext/mods/gameserver/model/actor/Player.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       778: aload_2
       779: iconst_0
       780: invokevirtual #292                // Method ext/mods/gameserver/model/actor/container/player/BoatInfo.setBoatMovement:(Z)V
       783: aload_2
       784: iconst_0
       785: invokevirtual #176                // Method ext/mods/gameserver/model/actor/container/player/BoatInfo.setCanBoard:(Z)V
       788: return
       789: aload_2
       790: invokevirtual #289                // Method ext/mods/gameserver/model/actor/container/player/BoatInfo.getBoatPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
       793: astore        17
       795: new           #271                // class ext/mods/gameserver/model/location/Point2D
       798: dup
       799: aload         17
       801: invokevirtual #312                // Method ext/mods/gameserver/model/location/SpawnLocation.getX:()I
       804: aload         17
       806: invokevirtual #313                // Method ext/mods/gameserver/model/location/SpawnLocation.getY:()I
       809: invokespecial #273                // Method ext/mods/gameserver/model/location/Point2D."<init>":(II)V
       812: astore        18
       814: getstatic     #314                // Field CENTER_BOAT:Lext/mods/gameserver/model/location/Point2D;
       817: aload         18
       819: invokevirtual #297                // Method ext/mods/gameserver/model/location/Point2D.distance2D:(Lext/mods/gameserver/model/location/Point2D;)D
       822: dstore        19
       824: dload         19
       826: ldc2_w        #318                // double 350.0d
       829: dcmpl
       830: ifle          841
       833: aload_0
       834: getstatic     #76                 // Field ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
       837: invokevirtual #261                // Method sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       840: return
       841: iload         7
       843: ifne          872
       846: dload         15
       848: ldc2_w        #320                // double 200.0d
       851: dcmpl
       852: ifle          872
       855: dload         19
       857: ldc2_w        #322                // double 250.0d
       860: dcmpl
       861: ifle          872
       864: aload_0
       865: getstatic     #76                 // Field ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
       868: invokevirtual #261                // Method sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       871: return
       872: iload         7
       874: ifeq          928
       877: dload         19
       879: ldc2_w        #322                // double 250.0d
       882: dcmpg
       883: ifge          928
       886: aload_1
       887: new           #303                // class ext/mods/gameserver/network/serverpackets/MoveToLocation
       890: dup
       891: aload_1
       892: new           #139                // class ext/mods/gameserver/model/location/Location
       895: dup
       896: aload_0
       897: getfield      #13                 // Field _targetX:I
       900: aload_0
       901: getfield      #17                 // Field _targetY:I
       904: aload_0
       905: getfield      #20                 // Field _targetZ:I
       908: invokespecial #141                // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
       911: invokespecial #307                // Method ext/mods/gameserver/network/serverpackets/MoveToLocation."<init>":(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/location/Location;)V
       914: invokevirtual #309                // Method ext/mods/gameserver/model/actor/Player.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       917: aload_2
       918: iconst_0
       919: invokevirtual #292                // Method ext/mods/gameserver/model/actor/container/player/BoatInfo.setBoatMovement:(Z)V
       922: aload_2
       923: iconst_0
       924: invokevirtual #176                // Method ext/mods/gameserver/model/actor/container/player/BoatInfo.setCanBoard:(Z)V
       927: return
       928: aload         10
       930: ifnull        1000
       933: aload         6
       935: aload         10
       937: invokevirtual #305                // Method ext/mods/gameserver/model/location/Point2D.getX:()I
       940: aload         10
       942: invokevirtual #306                // Method ext/mods/gameserver/model/location/Point2D.getY:()I
       945: invokevirtual #324                // Method ext/mods/gameserver/enums/boats/BoatDock.convertWorldToBoatCoordinates:(II)Lext/mods/gameserver/model/location/Point2D;
       948: astore        10
       950: aload         10
       952: invokevirtual #305                // Method ext/mods/gameserver/model/location/Point2D.getX:()I
       955: istore        21
       957: aload         10
       959: invokevirtual #306                // Method ext/mods/gameserver/model/location/Point2D.getY:()I
       962: istore        22
       964: aload_1
       965: new           #328                // class ext/mods/gameserver/network/serverpackets/MoveToLocationInVehicle
       968: dup
       969: aload_1
       970: aload         5
       972: iload         21
       974: iload         22
       976: iload         14
       978: iload         12
       980: iload         13
       982: iload         14
       984: invokespecial #330                // Method ext/mods/gameserver/network/serverpackets/MoveToLocationInVehicle."<init>":(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Boat;IIIIII)V
       987: invokevirtual #309                // Method ext/mods/gameserver/model/actor/Player.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       990: aload_2
       991: iconst_0
       992: invokevirtual #292                // Method ext/mods/gameserver/model/actor/container/player/BoatInfo.setBoatMovement:(Z)V
       995: aload_2
       996: iconst_0
       997: invokevirtual #176                // Method ext/mods/gameserver/model/actor/container/player/BoatInfo.setCanBoard:(Z)V
      1000: aload_0
      1001: getstatic     #76                 // Field ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
      1004: invokevirtual #261                // Method sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
      1007: aload_0
      1008: getstatic     #76                 // Field ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
      1011: invokevirtual #261                // Method sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
      1014: return
      LineNumberTable:
        line 80: 0
        line 81: 11
        line 82: 15
        line 84: 16
        line 86: 21
        line 88: 38
        line 89: 45
        line 92: 46
        line 94: 58
        line 95: 65
        line 96: 72
        line 99: 73
        line 101: 77
        line 103: 92
        line 106: 128
        line 108: 135
        line 109: 142
        line 110: 160
        line 113: 161
        line 115: 181
        line 117: 203
        line 118: 210
        line 121: 211
        line 123: 224
        line 124: 232
        line 125: 239
        line 128: 240
        line 130: 253
        line 131: 260
        line 134: 261
        line 136: 267
        line 138: 272
        line 139: 292
        line 141: 293
        line 143: 298
        line 145: 305
        line 146: 316
        line 148: 327
        line 150: 344
        line 152: 351
        line 153: 358
        line 156: 359
        line 157: 367
        line 159: 375
        line 160: 384
        line 162: 393
        line 163: 402
        line 165: 411
        line 167: 428
        line 169: 465
        line 170: 472
        line 173: 473
        line 174: 494
        line 176: 501
        line 179: 502
        line 180: 511
        line 185: 522
        line 187: 548
        line 188: 554
        line 190: 559
        line 191: 566
        line 194: 567
        line 195: 574
        line 197: 579
        line 198: 586
        line 201: 587
        line 203: 594
        line 204: 611
        line 206: 628
        line 208: 641
        line 209: 646
        line 211: 662
        line 213: 672
        line 214: 679
        line 217: 680
        line 218: 686
        line 219: 693
        line 220: 700
        line 222: 707
        line 224: 712
        line 226: 732
        line 228: 746
        line 229: 778
        line 230: 783
        line 231: 788
        line 234: 789
        line 235: 795
        line 237: 814
        line 239: 824
        line 241: 833
        line 242: 840
        line 245: 841
        line 247: 864
        line 248: 871
        line 251: 872
        line 253: 886
        line 254: 917
        line 255: 922
        line 256: 927
        line 259: 928
        line 261: 933
        line 263: 950
        line 264: 957
        line 266: 964
        line 267: 990
        line 268: 995
        line 271: 1000
        line 274: 1007
        line 275: 1014
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          316     186     5 vectorX   I
          327     175     6 vectorY   I
          344     158     7 magnitude   D
          367     135     9 unitVectorX   D
          375     127    11 unitVectorY   D
          384     118    13 newVectorX   I
          393     109    14 newVectorY   I
          402     100    15  newX   I
          411      91    16  newY   I
          428      74    17 checkLoc   Lext/mods/gameserver/model/location/Location;
          957      43    21    tX   I
          964      36    22    tY   I
          554     453     5  boat   Lext/mods/gameserver/model/actor/Boat;
          574     433     6  dock   Lext/mods/gameserver/enums/boats/BoatDock;
          594     413     7 isMoving   Z
          611     396     8 targetPoint   Lext/mods/gameserver/model/location/Point2D;
          628     379     9 originPoint   Lext/mods/gameserver/model/location/Point2D;
          641     366    10 boardingPoint   Lext/mods/gameserver/model/location/Point2D;
          686     321    11   pos   Lext/mods/gameserver/model/location/Location;
          693     314    12    oX   I
          700     307    13    oY   I
          707     300    14     z   I
          732     275    15 distToBorder   D
          795     212    17 boatPos   Lext/mods/gameserver/model/location/SpawnLocation;
          814     193    18 currentPoint   Lext/mods/gameserver/model/location/Point2D;
          824     183    19 distToCenter   D
            0    1015     0  this   Lext/mods/gameserver/network/clientpackets/MoveBackwardToLocation;
           11    1004     1 player   Lext/mods/gameserver/model/actor/Player;
           21     994     2  info   Lext/mods/gameserver/model/actor/container/player/BoatInfo;
          181     834     3 targetLoc   Lext/mods/gameserver/model/location/Location;
          267     748     4 isInBoat   Z
      StackMapTable: number_of_entries = 30
        frame_type = 252 /* append */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 252 /* append */
          offset_delta = 21
          locals = [ class ext/mods/gameserver/model/actor/container/player/BoatInfo ]
        frame_type = 7 /* same */
        frame_type = 26 /* same */
        frame_type = 54 /* same */
        frame_type = 6 /* same */
        frame_type = 25 /* same */
        frame_type = 252 /* append */
          offset_delta = 49
          locals = [ class ext/mods/gameserver/model/location/Location ]
        frame_type = 28 /* same */
        frame_type = 20 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 23
          locals = [ class ext/mods/gameserver/network/clientpackets/MoveBackwardToLocation, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/actor/container/player/BoatInfo, class ext/mods/gameserver/model/location/Location, int ]
          stack = [ class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/location/Location ]
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/network/clientpackets/MoveBackwardToLocation, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/actor/container/player/BoatInfo, class ext/mods/gameserver/model/location/Location, int ]
          stack = [ class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/location/Location, int ]
        frame_type = 6 /* same */
        frame_type = 254 /* append */
          offset_delta = 65
          locals = [ int, int, double ]
        frame_type = 255 /* full_frame */
          offset_delta = 113
          locals = [ class ext/mods/gameserver/network/clientpackets/MoveBackwardToLocation, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/actor/container/player/BoatInfo, class ext/mods/gameserver/model/location/Location, int, int, int, double, double, double, int, int, int, int, class ext/mods/gameserver/model/location/Location ]
          stack = []
        frame_type = 27 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/network/clientpackets/MoveBackwardToLocation, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/actor/container/player/BoatInfo, class ext/mods/gameserver/model/location/Location, int ]
          stack = []
        frame_type = 19 /* same */
        frame_type = 252 /* append */
          offset_delta = 44
          locals = [ class ext/mods/gameserver/model/actor/Boat ]
        frame_type = 252 /* append */
          offset_delta = 19
          locals = [ class ext/mods/gameserver/enums/boats/BoatDock ]
        frame_type = 255 /* full_frame */
          offset_delta = 74
          locals = [ class ext/mods/gameserver/network/clientpackets/MoveBackwardToLocation, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/actor/container/player/BoatInfo, class ext/mods/gameserver/model/location/Location, int, class ext/mods/gameserver/model/actor/Boat, class ext/mods/gameserver/enums/boats/BoatDock, int, class ext/mods/gameserver/model/location/Point2D, class ext/mods/gameserver/model/location/Point2D, class ext/mods/gameserver/model/location/Point2D ]
          stack = []
        frame_type = 17 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 42
          locals = [ class ext/mods/gameserver/network/clientpackets/MoveBackwardToLocation, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/actor/container/player/BoatInfo, class ext/mods/gameserver/model/location/Location, int, class ext/mods/gameserver/model/actor/Boat, class ext/mods/gameserver/enums/boats/BoatDock, int, class ext/mods/gameserver/model/location/Point2D, class ext/mods/gameserver/model/location/Point2D, class ext/mods/gameserver/model/location/Point2D, class ext/mods/gameserver/model/location/Location, int, int, int ]
          stack = []
        frame_type = 70 /* same_locals_1_stack_item */
          stack = [ double ]
        frame_type = 252 /* append */
          offset_delta = 58
          locals = [ double ]
        frame_type = 254 /* append */
          offset_delta = 51
          locals = [ class ext/mods/gameserver/model/location/SpawnLocation, class ext/mods/gameserver/model/location/Point2D, double ]
        frame_type = 30 /* same */
        frame_type = 55 /* same */
        frame_type = 251 /* same_frame_extended */
          offset_delta = 71
        frame_type = 255 /* full_frame */
          offset_delta = 6
          locals = [ class ext/mods/gameserver/network/clientpackets/MoveBackwardToLocation, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/actor/container/player/BoatInfo, class ext/mods/gameserver/model/location/Location, int ]
          stack = []

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: new           #271                // class ext/mods/gameserver/model/location/Point2D
         3: dup
         4: iconst_0
         5: bipush        -100
         7: invokespecial #273                // Method ext/mods/gameserver/model/location/Point2D."<init>":(II)V
        10: putstatic     #314                // Field CENTER_BOAT:Lext/mods/gameserver/model/location/Point2D;
        13: return
      LineNumberTable:
        line 42: 0
}
SourceFile: "MoveBackwardToLocation.java"
NestMembers:
  ext/mods/gameserver/network/clientpackets/MoveBackwardToLocation$1
InnerClasses:
  static #113;                            // class ext/mods/gameserver/network/clientpackets/MoveBackwardToLocation$1
