// Bytecode for: ext.mods.gameserver.handler.voicedcommandhandlers.FarmZoneTeleport
// File: ext\mods\gameserver\handler\voicedcommandhandlers\FarmZoneTeleport.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/voicedcommandhandlers/FarmZoneTeleport.class
  Last modified 9 de jul de 2026; size 8988 bytes
  MD5 checksum 7ccb6b7f7d2b7dc33df599d9be1d6bde
  Compiled from "FarmZoneTeleport.java"
public class ext.mods.gameserver.handler.voicedcommandhandlers.FarmZoneTeleport implements ext.mods.gameserver.handler.IVoicedCommandHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #69                         // ext/mods/gameserver/handler/voicedcommandhandlers/FarmZoneTeleport
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 5, methods: 7, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Methodref          #8.#9         // ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
    #8 = Class              #10           // ext/mods/gameserver/model/actor/Player
    #9 = NameAndType        #11:#12       // getLocale:()Ljava/util/Locale;
   #10 = Utf8               ext/mods/gameserver/model/actor/Player
   #11 = Utf8               getLocale
   #12 = Utf8               ()Ljava/util/Locale;
   #13 = Fieldref           #14.#15       // java/util/Locale.ENGLISH:Ljava/util/Locale;
   #14 = Class              #16           // java/util/Locale
   #15 = NameAndType        #17:#18       // ENGLISH:Ljava/util/Locale;
   #16 = Utf8               java/util/Locale
   #17 = Utf8               ENGLISH
   #18 = Utf8               Ljava/util/Locale;
   #19 = Methodref          #20.#21       // ext/mods/gameserver/data/xml/SysString.getInstance:()Lext/mods/gameserver/data/xml/SysString;
   #20 = Class              #22           // ext/mods/gameserver/data/xml/SysString
   #21 = NameAndType        #23:#24       // getInstance:()Lext/mods/gameserver/data/xml/SysString;
   #22 = Utf8               ext/mods/gameserver/data/xml/SysString
   #23 = Utf8               getInstance
   #24 = Utf8               ()Lext/mods/gameserver/data/xml/SysString;
   #25 = Methodref          #20.#26       // ext/mods/gameserver/data/xml/SysString.get:(Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;
   #26 = NameAndType        #27:#28       // get:(Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;
   #27 = Utf8               get
   #28 = Utf8               (Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;
   #29 = String             #30           // farm
   #30 = Utf8               farm
   #31 = Methodref          #32.#33       // java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
   #32 = Class              #34           // java/lang/String
   #33 = NameAndType        #35:#36       // equalsIgnoreCase:(Ljava/lang/String;)Z
   #34 = Utf8               java/lang/String
   #35 = Utf8               equalsIgnoreCase
   #36 = Utf8               (Ljava/lang/String;)Z
   #37 = Methodref          #8.#38        // ext/mods/gameserver/model/actor/Player.isDead:()Z
   #38 = NameAndType        #39:#40       // isDead:()Z
   #39 = Utf8               isDead
   #40 = Utf8               ()Z
   #41 = String             #42           // Você não pode usar este comando enquanto está morto.
   #42 = Utf8               Você não pode usar este comando enquanto está morto.
   #43 = Methodref          #8.#44        // ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
   #44 = NameAndType        #45:#46       // sendMessage:(Ljava/lang/String;)V
   #45 = Utf8               sendMessage
   #46 = Utf8               (Ljava/lang/String;)V
   #47 = Fieldref           #48.#49       // ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
   #48 = Class              #50           // ext/mods/gameserver/network/serverpackets/ActionFailed
   #49 = NameAndType        #51:#52       // STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
   #50 = Utf8               ext/mods/gameserver/network/serverpackets/ActionFailed
   #51 = Utf8               STATIC_PACKET
   #52 = Utf8               Lext/mods/gameserver/network/serverpackets/ActionFailed;
   #53 = Methodref          #8.#54        // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #54 = NameAndType        #55:#56       // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #55 = Utf8               sendPacket
   #56 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #57 = Methodref          #8.#58        // ext/mods/gameserver/model/actor/Player.isInOlympiadMode:()Z
   #58 = NameAndType        #59:#40       // isInOlympiadMode:()Z
   #59 = Utf8               isInOlympiadMode
   #60 = String             #61           // Você não pode usar este comando durante as Olimpíadas.
   #61 = Utf8               Você não pode usar este comando durante as Olimpíadas.
   #62 = Methodref          #8.#63        // ext/mods/gameserver/model/actor/Player.getDungeon:()Lext/mods/dungeon/Dungeon;
   #63 = NameAndType        #64:#65       // getDungeon:()Lext/mods/dungeon/Dungeon;
   #64 = Utf8               getDungeon
   #65 = Utf8               ()Lext/mods/dungeon/Dungeon;
   #66 = String             #67           // 12000
   #67 = Utf8               12000
   #68 = Methodref          #69.#70       // ext/mods/gameserver/handler/voicedcommandhandlers/FarmZoneTeleport.getLocalizedString:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Ljava/lang/String;
   #69 = Class              #71           // ext/mods/gameserver/handler/voicedcommandhandlers/FarmZoneTeleport
   #70 = NameAndType        #72:#73       // getLocalizedString:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Ljava/lang/String;
   #71 = Utf8               ext/mods/gameserver/handler/voicedcommandhandlers/FarmZoneTeleport
   #72 = Utf8               getLocalizedString
   #73 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Ljava/lang/String;
   #74 = Methodref          #8.#75        // ext/mods/gameserver/model/actor/Player.isInCombat:()Z
   #75 = NameAndType        #76:#40       // isInCombat:()Z
   #76 = Utf8               isInCombat
   #77 = String             #78           // Você não pode usar este comando em combate.
   #78 = Utf8               Você não pode usar este comando em combate.
   #79 = Methodref          #8.#80        // ext/mods/gameserver/model/actor/Player.getCast:()Lext/mods/gameserver/model/actor/cast/PlayerCast;
   #80 = NameAndType        #81:#82       // getCast:()Lext/mods/gameserver/model/actor/cast/PlayerCast;
   #81 = Utf8               getCast
   #82 = Utf8               ()Lext/mods/gameserver/model/actor/cast/PlayerCast;
   #83 = Methodref          #84.#85       // ext/mods/gameserver/model/actor/cast/PlayerCast.isCastingNow:()Z
   #84 = Class              #86           // ext/mods/gameserver/model/actor/cast/PlayerCast
   #85 = NameAndType        #87:#40       // isCastingNow:()Z
   #86 = Utf8               ext/mods/gameserver/model/actor/cast/PlayerCast
   #87 = Utf8               isCastingNow
   #88 = Methodref          #8.#89        // ext/mods/gameserver/model/actor/Player.isTeleporting:()Z
   #89 = NameAndType        #90:#40       // isTeleporting:()Z
   #90 = Utf8               isTeleporting
   #91 = String             #92           // Aguarde sua ação atual terminar.
   #92 = Utf8               Aguarde sua ação atual terminar.
   #93 = Fieldref           #94.#95       // ext/mods/gameserver/enums/ZoneId.PVP:Lext/mods/gameserver/enums/ZoneId;
   #94 = Class              #96           // ext/mods/gameserver/enums/ZoneId
   #95 = NameAndType        #97:#98       // PVP:Lext/mods/gameserver/enums/ZoneId;
   #96 = Utf8               ext/mods/gameserver/enums/ZoneId
   #97 = Utf8               PVP
   #98 = Utf8               Lext/mods/gameserver/enums/ZoneId;
   #99 = Methodref          #8.#100       // ext/mods/gameserver/model/actor/Player.isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
  #100 = NameAndType        #101:#102     // isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
  #101 = Utf8               isInsideZone
  #102 = Utf8               (Lext/mods/gameserver/enums/ZoneId;)Z
  #103 = Fieldref           #94.#104      // ext/mods/gameserver/enums/ZoneId.SIEGE:Lext/mods/gameserver/enums/ZoneId;
  #104 = NameAndType        #105:#98      // SIEGE:Lext/mods/gameserver/enums/ZoneId;
  #105 = Utf8               SIEGE
  #106 = String             #107          // Você não pode usar este comando desta área.
  #107 = Utf8               Você não pode usar este comando desta área.
  #108 = Methodref          #109.#110     // ext/mods/Crypta/RandomManager.getInstance:()Lext/mods/Crypta/RandomManager;
  #109 = Class              #111          // ext/mods/Crypta/RandomManager
  #110 = NameAndType        #23:#112      // getInstance:()Lext/mods/Crypta/RandomManager;
  #111 = Utf8               ext/mods/Crypta/RandomManager
  #112 = Utf8               ()Lext/mods/Crypta/RandomManager;
  #113 = String             #114          // Sistema de eventos não disponível.
  #114 = Utf8               Sistema de eventos não disponível.
  #115 = Methodref          #109.#116     // ext/mods/Crypta/RandomManager.isEventRunning:()Z
  #116 = NameAndType        #117:#40      // isEventRunning:()Z
  #117 = Utf8               isEventRunning
  #118 = Methodref          #119.#120     // java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
  #119 = Class              #121          // java/lang/Boolean
  #120 = NameAndType        #122:#123     // valueOf:(Z)Ljava/lang/Boolean;
  #121 = Utf8               java/lang/Boolean
  #122 = Utf8               valueOf
  #123 = Utf8               (Z)Ljava/lang/Boolean;
  #124 = Methodref          #119.#125     // java/lang/Boolean.booleanValue:()Z
  #125 = NameAndType        #126:#40      // booleanValue:()Z
  #126 = Utf8               booleanValue
  #127 = String             #128          // Nenhuma Farm Zone ativa no momento.
  #128 = Utf8               Nenhuma Farm Zone ativa no momento.
  #129 = Class              #130          // ext/mods/gameserver/network/serverpackets/ConfirmDlg
  #130 = Utf8               ext/mods/gameserver/network/serverpackets/ConfirmDlg
  #131 = Fieldref           #132.#133     // ext/mods/gameserver/network/SystemMessageId.S1:Lext/mods/gameserver/network/SystemMessageId;
  #132 = Class              #134          // ext/mods/gameserver/network/SystemMessageId
  #133 = NameAndType        #135:#136     // S1:Lext/mods/gameserver/network/SystemMessageId;
  #134 = Utf8               ext/mods/gameserver/network/SystemMessageId
  #135 = Utf8               S1
  #136 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
  #137 = Methodref          #132.#138     // ext/mods/gameserver/network/SystemMessageId.getId:()I
  #138 = NameAndType        #139:#140     // getId:()I
  #139 = Utf8               getId
  #140 = Utf8               ()I
  #141 = Methodref          #129.#142     // ext/mods/gameserver/network/serverpackets/ConfirmDlg."<init>":(I)V
  #142 = NameAndType        #5:#143       // "<init>":(I)V
  #143 = Utf8               (I)V
  #144 = String             #145          // Você deseja se teleportar para a Farm Zone?
  #145 = Utf8               Você deseja se teleportar para a Farm Zone?
  #146 = Methodref          #129.#147     // ext/mods/gameserver/network/serverpackets/ConfirmDlg.addString:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/ConfirmDlg;
  #147 = NameAndType        #148:#149     // addString:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/ConfirmDlg;
  #148 = Utf8               addString
  #149 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/ConfirmDlg;
  #150 = Methodref          #129.#151     // ext/mods/gameserver/network/serverpackets/ConfirmDlg.addTime:(I)Lext/mods/gameserver/network/serverpackets/ConfirmDlg;
  #151 = NameAndType        #152:#153     // addTime:(I)Lext/mods/gameserver/network/serverpackets/ConfirmDlg;
  #152 = Utf8               addTime
  #153 = Utf8               (I)Lext/mods/gameserver/network/serverpackets/ConfirmDlg;
  #154 = String             #155          // farm_teleport
  #155 = Utf8               farm_teleport
  #156 = Methodref          #8.#157       // ext/mods/gameserver/model/actor/Player.setLastCommand:(Ljava/lang/String;)V
  #157 = NameAndType        #158:#46      // setLastCommand:(Ljava/lang/String;)V
  #158 = Utf8               setLastCommand
  #159 = Methodref          #8.#160       // ext/mods/gameserver/model/actor/Player.getLastCommand:()Ljava/lang/String;
  #160 = NameAndType        #161:#162     // getLastCommand:()Ljava/lang/String;
  #161 = Utf8               getLastCommand
  #162 = Utf8               ()Ljava/lang/String;
  #163 = Methodref          #32.#164      // java/lang/String.equals:(Ljava/lang/Object;)Z
  #164 = NameAndType        #165:#166     // equals:(Ljava/lang/Object;)Z
  #165 = Utf8               equals
  #166 = Utf8               (Ljava/lang/Object;)Z
  #167 = String             #168          // Teleporte cancelado. Sua condição mudou.
  #168 = Utf8               Teleporte cancelado. Sua condição mudou.
  #169 = Methodref          #109.#170     // ext/mods/Crypta/RandomManager.getActiveZones:()Ljava/util/List;
  #170 = NameAndType        #171:#172     // getActiveZones:()Ljava/util/List;
  #171 = Utf8               getActiveZones
  #172 = Utf8               ()Ljava/util/List;
  #173 = InterfaceMethodref #174.#175     // java/util/List.isEmpty:()Z
  #174 = Class              #176          // java/util/List
  #175 = NameAndType        #177:#40      // isEmpty:()Z
  #176 = Utf8               java/util/List
  #177 = Utf8               isEmpty
  #178 = Methodref          #179.#180     // ext/mods/commons/random/Rnd.get:(Ljava/util/List;)Ljava/lang/Object;
  #179 = Class              #181          // ext/mods/commons/random/Rnd
  #180 = NameAndType        #27:#182      // get:(Ljava/util/List;)Ljava/lang/Object;
  #181 = Utf8               ext/mods/commons/random/Rnd
  #182 = Utf8               (Ljava/util/List;)Ljava/lang/Object;
  #183 = Class              #184          // ext/mods/gameserver/model/zone/type/RandomZone
  #184 = Utf8               ext/mods/gameserver/model/zone/type/RandomZone
  #185 = String             #186          // Erro ao selecionar zona do evento.
  #186 = Utf8               Erro ao selecionar zona do evento.
  #187 = Methodref          #109.#188     // ext/mods/Crypta/RandomManager.getZoneDataForZone:(Lext/mods/gameserver/model/zone/type/RandomZone;)Lext/mods/FarmEventRandom/holder/RandomZoneData;
  #188 = NameAndType        #189:#190     // getZoneDataForZone:(Lext/mods/gameserver/model/zone/type/RandomZone;)Lext/mods/FarmEventRandom/holder/RandomZoneData;
  #189 = Utf8               getZoneDataForZone
  #190 = Utf8               (Lext/mods/gameserver/model/zone/type/RandomZone;)Lext/mods/FarmEventRandom/holder/RandomZoneData;
  #191 = Methodref          #192.#193     // ext/mods/FarmEventRandom/holder/RandomZoneData.getSpawnLocation:()Lext/mods/gameserver/model/location/Location;
  #192 = Class              #194          // ext/mods/FarmEventRandom/holder/RandomZoneData
  #193 = NameAndType        #195:#196     // getSpawnLocation:()Lext/mods/gameserver/model/location/Location;
  #194 = Utf8               ext/mods/FarmEventRandom/holder/RandomZoneData
  #195 = Utf8               getSpawnLocation
  #196 = Utf8               ()Lext/mods/gameserver/model/location/Location;
  #197 = Fieldref           #198.#199     // ext/mods/gameserver/enums/SpawnType.NORMAL:Lext/mods/gameserver/enums/SpawnType;
  #198 = Class              #200          // ext/mods/gameserver/enums/SpawnType
  #199 = NameAndType        #201:#202     // NORMAL:Lext/mods/gameserver/enums/SpawnType;
  #200 = Utf8               ext/mods/gameserver/enums/SpawnType
  #201 = Utf8               NORMAL
  #202 = Utf8               Lext/mods/gameserver/enums/SpawnType;
  #203 = Methodref          #183.#204     // ext/mods/gameserver/model/zone/type/RandomZone.getRndSpawn:(Lext/mods/gameserver/enums/SpawnType;)Lext/mods/gameserver/model/location/Location;
  #204 = NameAndType        #205:#206     // getRndSpawn:(Lext/mods/gameserver/enums/SpawnType;)Lext/mods/gameserver/model/location/Location;
  #205 = Utf8               getRndSpawn
  #206 = Utf8               (Lext/mods/gameserver/enums/SpawnType;)Lext/mods/gameserver/model/location/Location;
  #207 = Methodref          #109.#208     // ext/mods/Crypta/RandomManager.getActiveSpawns:()Ljava/util/List;
  #208 = NameAndType        #209:#172     // getActiveSpawns:()Ljava/util/List;
  #209 = Utf8               getActiveSpawns
  #210 = Class              #211          // java/util/ArrayList
  #211 = Utf8               java/util/ArrayList
  #212 = Methodref          #210.#3       // java/util/ArrayList."<init>":()V
  #213 = InterfaceMethodref #174.#214     // java/util/List.iterator:()Ljava/util/Iterator;
  #214 = NameAndType        #215:#216     // iterator:()Ljava/util/Iterator;
  #215 = Utf8               iterator
  #216 = Utf8               ()Ljava/util/Iterator;
  #217 = InterfaceMethodref #218.#219     // java/util/Iterator.hasNext:()Z
  #218 = Class              #220          // java/util/Iterator
  #219 = NameAndType        #221:#40      // hasNext:()Z
  #220 = Utf8               java/util/Iterator
  #221 = Utf8               hasNext
  #222 = InterfaceMethodref #218.#223     // java/util/Iterator.next:()Ljava/lang/Object;
  #223 = NameAndType        #224:#225     // next:()Ljava/lang/Object;
  #224 = Utf8               next
  #225 = Utf8               ()Ljava/lang/Object;
  #226 = Class              #227          // ext/mods/gameserver/model/spawn/Spawn
  #227 = Utf8               ext/mods/gameserver/model/spawn/Spawn
  #228 = Methodref          #226.#229     // ext/mods/gameserver/model/spawn/Spawn.getNpc:()Lext/mods/gameserver/model/actor/Npc;
  #229 = NameAndType        #230:#231     // getNpc:()Lext/mods/gameserver/model/actor/Npc;
  #230 = Utf8               getNpc
  #231 = Utf8               ()Lext/mods/gameserver/model/actor/Npc;
  #232 = Methodref          #226.#233     // ext/mods/gameserver/model/spawn/Spawn.getSpawnLocation:()Lext/mods/gameserver/model/location/SpawnLocation;
  #233 = NameAndType        #195:#234     // getSpawnLocation:()Lext/mods/gameserver/model/location/SpawnLocation;
  #234 = Utf8               ()Lext/mods/gameserver/model/location/SpawnLocation;
  #235 = Methodref          #236.#237     // ext/mods/gameserver/model/location/SpawnLocation.getX:()I
  #236 = Class              #238          // ext/mods/gameserver/model/location/SpawnLocation
  #237 = NameAndType        #239:#140     // getX:()I
  #238 = Utf8               ext/mods/gameserver/model/location/SpawnLocation
  #239 = Utf8               getX
  #240 = Methodref          #236.#241     // ext/mods/gameserver/model/location/SpawnLocation.getY:()I
  #241 = NameAndType        #242:#140     // getY:()I
  #242 = Utf8               getY
  #243 = Methodref          #236.#244     // ext/mods/gameserver/model/location/SpawnLocation.getZ:()I
  #244 = NameAndType        #245:#140     // getZ:()I
  #245 = Utf8               getZ
  #246 = Methodref          #183.#247     // ext/mods/gameserver/model/zone/type/RandomZone.isInsideZone:(III)Z
  #247 = NameAndType        #101:#248     // isInsideZone:(III)Z
  #248 = Utf8               (III)Z
  #249 = InterfaceMethodref #174.#250     // java/util/List.add:(Ljava/lang/Object;)Z
  #250 = NameAndType        #251:#166     // add:(Ljava/lang/Object;)Z
  #251 = Utf8               add
  #252 = Class              #253          // ext/mods/gameserver/model/location/Location
  #253 = Utf8               ext/mods/gameserver/model/location/Location
  #254 = Methodref          #255.#237     // ext/mods/gameserver/model/actor/Npc.getX:()I
  #255 = Class              #256          // ext/mods/gameserver/model/actor/Npc
  #256 = Utf8               ext/mods/gameserver/model/actor/Npc
  #257 = Methodref          #255.#241     // ext/mods/gameserver/model/actor/Npc.getY:()I
  #258 = Methodref          #255.#244     // ext/mods/gameserver/model/actor/Npc.getZ:()I
  #259 = Methodref          #252.#260     // ext/mods/gameserver/model/location/Location."<init>":(III)V
  #260 = NameAndType        #5:#261       // "<init>":(III)V
  #261 = Utf8               (III)V
  #262 = Methodref          #183.#263     // ext/mods/gameserver/model/zone/type/RandomZone.getReturnLocation:()Lext/mods/gameserver/model/location/Location;
  #263 = NameAndType        #264:#196     // getReturnLocation:()Lext/mods/gameserver/model/location/Location;
  #264 = Utf8               getReturnLocation
  #265 = Methodref          #252.#237     // ext/mods/gameserver/model/location/Location.getX:()I
  #266 = Methodref          #252.#241     // ext/mods/gameserver/model/location/Location.getY:()I
  #267 = String             #268          // Não foi possível encontrar um ponto de teleporte na Farm Zone.
  #268 = Utf8               Não foi possível encontrar um ponto de teleporte na Farm Zone.
  #269 = Class              #270          // ext/mods/gameserver/network/serverpackets/MagicSkillUse
  #270 = Utf8               ext/mods/gameserver/network/serverpackets/MagicSkillUse
  #271 = Methodref          #269.#272     // ext/mods/gameserver/network/serverpackets/MagicSkillUse."<init>":(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;IIII)V
  #272 = NameAndType        #5:#273       // "<init>":(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;IIII)V
  #273 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;IIII)V
  #274 = Methodref          #8.#275       // ext/mods/gameserver/model/actor/Player.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #275 = NameAndType        #276:#56      // broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #276 = Utf8               broadcastPacket
  #277 = Class              #278          // ext/mods/gameserver/network/serverpackets/SetupGauge
  #278 = Utf8               ext/mods/gameserver/network/serverpackets/SetupGauge
  #279 = Fieldref           #280.#281     // ext/mods/gameserver/enums/GaugeColor.BLUE:Lext/mods/gameserver/enums/GaugeColor;
  #280 = Class              #282          // ext/mods/gameserver/enums/GaugeColor
  #281 = NameAndType        #283:#284     // BLUE:Lext/mods/gameserver/enums/GaugeColor;
  #282 = Utf8               ext/mods/gameserver/enums/GaugeColor
  #283 = Utf8               BLUE
  #284 = Utf8               Lext/mods/gameserver/enums/GaugeColor;
  #285 = Methodref          #277.#286     // ext/mods/gameserver/network/serverpackets/SetupGauge."<init>":(Lext/mods/gameserver/enums/GaugeColor;I)V
  #286 = NameAndType        #5:#287       // "<init>":(Lext/mods/gameserver/enums/GaugeColor;I)V
  #287 = Utf8               (Lext/mods/gameserver/enums/GaugeColor;I)V
  #288 = InvokeDynamic      #0:#289       // #0:run:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/location/Location;)Ljava/lang/Runnable;
  #289 = NameAndType        #290:#291     // run:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/location/Location;)Ljava/lang/Runnable;
  #290 = Utf8               run
  #291 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/location/Location;)Ljava/lang/Runnable;
  #292 = Long               17000l
  #294 = Methodref          #295.#296     // ext/mods/commons/pool/ThreadPool.schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
  #295 = Class              #297          // ext/mods/commons/pool/ThreadPool
  #296 = NameAndType        #298:#299     // schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
  #297 = Utf8               ext/mods/commons/pool/ThreadPool
  #298 = Utf8               schedule
  #299 = Utf8               (Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
  #300 = Fieldref           #69.#301      // ext/mods/gameserver/handler/voicedcommandhandlers/FarmZoneTeleport.VOICED_COMMANDS:[Ljava/lang/String;
  #301 = NameAndType        #302:#303     // VOICED_COMMANDS:[Ljava/lang/String;
  #302 = Utf8               VOICED_COMMANDS
  #303 = Utf8               [Ljava/lang/String;
  #304 = Methodref          #8.#305       // ext/mods/gameserver/model/actor/Player.teleToLocation:(Lext/mods/gameserver/model/location/Location;)V
  #305 = NameAndType        #306:#307     // teleToLocation:(Lext/mods/gameserver/model/location/Location;)V
  #306 = Utf8               teleToLocation
  #307 = Utf8               (Lext/mods/gameserver/model/location/Location;)V
  #308 = Class              #309          // ext/mods/gameserver/handler/IVoicedCommandHandler
  #309 = Utf8               ext/mods/gameserver/handler/IVoicedCommandHandler
  #310 = Utf8               LAST_COMMAND_TAG
  #311 = Utf8               Ljava/lang/String;
  #312 = Utf8               ConstantValue
  #313 = Utf8               SOE_VISUAL_SKILL_ID
  #314 = Utf8               I
  #315 = Integer            2040
  #316 = Utf8               SOE_VISUAL_SKILL_LEVEL
  #317 = Integer            1
  #318 = Utf8               CAST_TIME_MS
  #319 = Integer            17000
  #320 = Utf8               Code
  #321 = Utf8               LineNumberTable
  #322 = Utf8               LocalVariableTable
  #323 = Utf8               this
  #324 = Utf8               Lext/mods/gameserver/handler/voicedcommandhandlers/FarmZoneTeleport;
  #325 = Utf8               player
  #326 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #327 = Utf8               key
  #328 = Utf8               locale
  #329 = Utf8               StackMapTable
  #330 = Utf8               useVoicedCommand
  #331 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
  #332 = Utf8               command
  #333 = Utf8               args
  #334 = Utf8               randomManager
  #335 = Utf8               Ljava/lang/Object;
  #336 = Utf8               isRunning
  #337 = Utf8               Ljava/lang/Boolean;
  #338 = Utf8               dlg
  #339 = Utf8               Lext/mods/gameserver/network/serverpackets/ConfirmDlg;
  #340 = Utf8               handleConfirmation
  #341 = Utf8               (Lext/mods/gameserver/model/actor/Player;Z)Z
  #342 = Utf8               spawnLoc
  #343 = Utf8               Lext/mods/gameserver/model/location/SpawnLocation;
  #344 = Utf8               spawn
  #345 = Utf8               Lext/mods/gameserver/model/spawn/Spawn;
  #346 = Utf8               selectedSpawn
  #347 = Utf8               zoneSpawns
  #348 = Utf8               Ljava/util/List;
  #349 = Utf8               activeSpawns
  #350 = Utf8               returnLoc
  #351 = Utf8               Lext/mods/gameserver/model/location/Location;
  #352 = Utf8               confirmed
  #353 = Utf8               Z
  #354 = Utf8               activeZones
  #355 = Utf8               targetZone
  #356 = Utf8               Lext/mods/gameserver/model/zone/type/RandomZone;
  #357 = Utf8               loc
  #358 = Utf8               zoneData
  #359 = Utf8               Lext/mods/FarmEventRandom/holder/RandomZoneData;
  #360 = Utf8               finalLoc
  #361 = Utf8               LocalVariableTypeTable
  #362 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/spawn/Spawn;>;
  #363 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/zone/type/RandomZone;>;
  #364 = Utf8               getVoicedCommandList
  #365 = Utf8               ()[Ljava/lang/String;
  #366 = Utf8               lambda$handleConfirmation$0
  #367 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/location/Location;)V
  #368 = Utf8               <clinit>
  #369 = Utf8               SourceFile
  #370 = Utf8               FarmZoneTeleport.java
  #371 = Utf8               BootstrapMethods
  #372 = MethodType         #6            //  ()V
  #373 = MethodHandle       6:#374        // REF_invokeStatic ext/mods/gameserver/handler/voicedcommandhandlers/FarmZoneTeleport.lambda$handleConfirmation$0:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/location/Location;)V
  #374 = Methodref          #69.#375      // ext/mods/gameserver/handler/voicedcommandhandlers/FarmZoneTeleport.lambda$handleConfirmation$0:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/location/Location;)V
  #375 = NameAndType        #366:#367     // lambda$handleConfirmation$0:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/location/Location;)V
  #376 = MethodHandle       6:#377        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #377 = Methodref          #378.#379     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #378 = Class              #380          // java/lang/invoke/LambdaMetafactory
  #379 = NameAndType        #381:#382     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #380 = Utf8               java/lang/invoke/LambdaMetafactory
  #381 = Utf8               metafactory
  #382 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #383 = Utf8               InnerClasses
  #384 = Class              #385          // java/lang/invoke/MethodHandles$Lookup
  #385 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #386 = Class              #387          // java/lang/invoke/MethodHandles
  #387 = Utf8               java/lang/invoke/MethodHandles
  #388 = Utf8               Lookup
{
  public ext.mods.gameserver.handler.voicedcommandhandlers.FarmZoneTeleport();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 42: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/handler/voicedcommandhandlers/FarmZoneTeleport;

  public boolean useVoicedCommand(java.lang.String, ext.mods.gameserver.model.actor.Player, java.lang.String);
    descriptor: (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=7, args_size=4
         0: aload_1
         1: ldc           #29                 // String farm
         3: invokevirtual #31                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
         6: ifne          11
         9: iconst_0
        10: ireturn
        11: aload_2
        12: invokevirtual #37                 // Method ext/mods/gameserver/model/actor/Player.isDead:()Z
        15: ifeq          33
        18: aload_2
        19: ldc           #41                 // String Você não pode usar este comando enquanto está morto.
        21: invokevirtual #43                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
        24: aload_2
        25: getstatic     #47                 // Field ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
        28: invokevirtual #53                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        31: iconst_0
        32: ireturn
        33: aload_2
        34: invokevirtual #57                 // Method ext/mods/gameserver/model/actor/Player.isInOlympiadMode:()Z
        37: ifeq          55
        40: aload_2
        41: ldc           #60                 // String Você não pode usar este comando durante as Olimpíadas.
        43: invokevirtual #43                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
        46: aload_2
        47: getstatic     #47                 // Field ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
        50: invokevirtual #53                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        53: iconst_0
        54: ireturn
        55: aload_2
        56: invokevirtual #62                 // Method ext/mods/gameserver/model/actor/Player.getDungeon:()Lext/mods/dungeon/Dungeon;
        59: ifnull        82
        62: aload_2
        63: aload_0
        64: aload_2
        65: ldc           #66                 // String 12000
        67: invokevirtual #68                 // Method getLocalizedString:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Ljava/lang/String;
        70: invokevirtual #43                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
        73: aload_2
        74: getstatic     #47                 // Field ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
        77: invokevirtual #53                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        80: iconst_0
        81: ireturn
        82: aload_2
        83: invokevirtual #74                 // Method ext/mods/gameserver/model/actor/Player.isInCombat:()Z
        86: ifeq          104
        89: aload_2
        90: ldc           #77                 // String Você não pode usar este comando em combate.
        92: invokevirtual #43                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
        95: aload_2
        96: getstatic     #47                 // Field ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
        99: invokevirtual #53                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       102: iconst_0
       103: ireturn
       104: aload_2
       105: invokevirtual #79                 // Method ext/mods/gameserver/model/actor/Player.getCast:()Lext/mods/gameserver/model/actor/cast/PlayerCast;
       108: invokevirtual #83                 // Method ext/mods/gameserver/model/actor/cast/PlayerCast.isCastingNow:()Z
       111: ifne          121
       114: aload_2
       115: invokevirtual #88                 // Method ext/mods/gameserver/model/actor/Player.isTeleporting:()Z
       118: ifeq          136
       121: aload_2
       122: ldc           #91                 // String Aguarde sua ação atual terminar.
       124: invokevirtual #43                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       127: aload_2
       128: getstatic     #47                 // Field ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
       131: invokevirtual #53                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       134: iconst_0
       135: ireturn
       136: aload_2
       137: getstatic     #93                 // Field ext/mods/gameserver/enums/ZoneId.PVP:Lext/mods/gameserver/enums/ZoneId;
       140: invokevirtual #99                 // Method ext/mods/gameserver/model/actor/Player.isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
       143: ifne          156
       146: aload_2
       147: getstatic     #103                // Field ext/mods/gameserver/enums/ZoneId.SIEGE:Lext/mods/gameserver/enums/ZoneId;
       150: invokevirtual #99                 // Method ext/mods/gameserver/model/actor/Player.isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
       153: ifeq          171
       156: aload_2
       157: ldc           #106                // String Você não pode usar este comando desta área.
       159: invokevirtual #43                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       162: aload_2
       163: getstatic     #47                 // Field ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
       166: invokevirtual #53                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       169: iconst_0
       170: ireturn
       171: invokestatic  #108                // Method ext/mods/Crypta/RandomManager.getInstance:()Lext/mods/Crypta/RandomManager;
       174: astore        4
       176: aload         4
       178: ifnonnull     196
       181: aload_2
       182: ldc           #113                // String Sistema de eventos não disponível.
       184: invokevirtual #43                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       187: aload_2
       188: getstatic     #47                 // Field ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
       191: invokevirtual #53                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       194: iconst_0
       195: ireturn
       196: invokestatic  #108                // Method ext/mods/Crypta/RandomManager.getInstance:()Lext/mods/Crypta/RandomManager;
       199: invokevirtual #115                // Method ext/mods/Crypta/RandomManager.isEventRunning:()Z
       202: invokestatic  #118                // Method java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
       205: astore        5
       207: aload         5
       209: ifnull        220
       212: aload         5
       214: invokevirtual #124                // Method java/lang/Boolean.booleanValue:()Z
       217: ifne          235
       220: aload_2
       221: ldc           #127                // String Nenhuma Farm Zone ativa no momento.
       223: invokevirtual #43                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       226: aload_2
       227: getstatic     #47                 // Field ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
       230: invokevirtual #53                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       233: iconst_0
       234: ireturn
       235: new           #129                // class ext/mods/gameserver/network/serverpackets/ConfirmDlg
       238: dup
       239: getstatic     #131                // Field ext/mods/gameserver/network/SystemMessageId.S1:Lext/mods/gameserver/network/SystemMessageId;
       242: invokevirtual #137                // Method ext/mods/gameserver/network/SystemMessageId.getId:()I
       245: invokespecial #141                // Method ext/mods/gameserver/network/serverpackets/ConfirmDlg."<init>":(I)V
       248: astore        6
       250: aload         6
       252: ldc           #144                // String Você deseja se teleportar para a Farm Zone?
       254: invokevirtual #146                // Method ext/mods/gameserver/network/serverpackets/ConfirmDlg.addString:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/ConfirmDlg;
       257: pop
       258: aload         6
       260: sipush        30000
       263: invokevirtual #150                // Method ext/mods/gameserver/network/serverpackets/ConfirmDlg.addTime:(I)Lext/mods/gameserver/network/serverpackets/ConfirmDlg;
       266: pop
       267: aload_2
       268: aload         6
       270: invokevirtual #53                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       273: aload_2
       274: ldc           #154                // String farm_teleport
       276: invokevirtual #156                // Method ext/mods/gameserver/model/actor/Player.setLastCommand:(Ljava/lang/String;)V
       279: iconst_1
       280: ireturn
      LineNumberTable:
        line 68: 0
        line 69: 9
        line 71: 11
        line 73: 18
        line 74: 24
        line 75: 31
        line 78: 33
        line 80: 40
        line 81: 46
        line 82: 53
        line 85: 55
        line 86: 62
        line 87: 73
        line 88: 80
        line 91: 82
        line 93: 89
        line 94: 95
        line 95: 102
        line 98: 104
        line 101: 121
        line 102: 127
        line 103: 134
        line 106: 136
        line 108: 156
        line 109: 162
        line 110: 169
        line 113: 171
        line 114: 176
        line 116: 181
        line 117: 187
        line 118: 194
        line 121: 196
        line 122: 207
        line 124: 220
        line 125: 226
        line 126: 233
        line 129: 235
        line 130: 250
        line 131: 258
        line 132: 267
        line 133: 273
        line 134: 279
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     281     0  this   Lext/mods/gameserver/handler/voicedcommandhandlers/FarmZoneTeleport;
            0     281     1 command   Ljava/lang/String;
            0     281     2 player   Lext/mods/gameserver/model/actor/Player;
            0     281     3  args   Ljava/lang/String;
          176     105     4 randomManager   Ljava/lang/Object;
          207      74     5 isRunning   Ljava/lang/Boolean;
          250      31     6   dlg   Lext/mods/gameserver/network/serverpackets/ConfirmDlg;
      StackMapTable: number_of_entries = 12
        frame_type = 11 /* same */
        frame_type = 21 /* same */
        frame_type = 21 /* same */
        frame_type = 26 /* same */
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

  public boolean handleConfirmation(ext.mods.gameserver.model.actor.Player, boolean);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Z)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=9, locals=13, args_size=3
         0: ldc           #154                // String farm_teleport
         2: aload_1
         3: invokevirtual #159                // Method ext/mods/gameserver/model/actor/Player.getLastCommand:()Ljava/lang/String;
         6: invokevirtual #163                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
         9: ifne          14
        12: iconst_0
        13: ireturn
        14: aload_1
        15: aconst_null
        16: invokevirtual #156                // Method ext/mods/gameserver/model/actor/Player.setLastCommand:(Ljava/lang/String;)V
        19: iload_2
        20: ifne          25
        23: iconst_0
        24: ireturn
        25: aload_1
        26: invokevirtual #74                 // Method ext/mods/gameserver/model/actor/Player.isInCombat:()Z
        29: ifne          63
        32: aload_1
        33: invokevirtual #37                 // Method ext/mods/gameserver/model/actor/Player.isDead:()Z
        36: ifne          63
        39: aload_1
        40: invokevirtual #57                 // Method ext/mods/gameserver/model/actor/Player.isInOlympiadMode:()Z
        43: ifne          63
        46: aload_1
        47: invokevirtual #79                 // Method ext/mods/gameserver/model/actor/Player.getCast:()Lext/mods/gameserver/model/actor/cast/PlayerCast;
        50: invokevirtual #83                 // Method ext/mods/gameserver/model/actor/cast/PlayerCast.isCastingNow:()Z
        53: ifne          63
        56: aload_1
        57: invokevirtual #88                 // Method ext/mods/gameserver/model/actor/Player.isTeleporting:()Z
        60: ifeq          78
        63: aload_1
        64: ldc           #167                // String Teleporte cancelado. Sua condição mudou.
        66: invokevirtual #43                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
        69: aload_1
        70: getstatic     #47                 // Field ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
        73: invokevirtual #53                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        76: iconst_0
        77: ireturn
        78: invokestatic  #108                // Method ext/mods/Crypta/RandomManager.getInstance:()Lext/mods/Crypta/RandomManager;
        81: astore_3
        82: aload_3
        83: ifnonnull     101
        86: aload_1
        87: ldc           #113                // String Sistema de eventos não disponível.
        89: invokevirtual #43                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
        92: aload_1
        93: getstatic     #47                 // Field ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
        96: invokevirtual #53                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        99: iconst_0
       100: ireturn
       101: invokestatic  #108                // Method ext/mods/Crypta/RandomManager.getInstance:()Lext/mods/Crypta/RandomManager;
       104: invokevirtual #169                // Method ext/mods/Crypta/RandomManager.getActiveZones:()Ljava/util/List;
       107: astore        4
       109: aload         4
       111: ifnull        124
       114: aload         4
       116: invokeinterface #173,  1          // InterfaceMethod java/util/List.isEmpty:()Z
       121: ifeq          139
       124: aload_1
       125: ldc           #127                // String Nenhuma Farm Zone ativa no momento.
       127: invokevirtual #43                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       130: aload_1
       131: getstatic     #47                 // Field ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
       134: invokevirtual #53                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       137: iconst_0
       138: ireturn
       139: aload         4
       141: invokestatic  #178                // Method ext/mods/commons/random/Rnd.get:(Ljava/util/List;)Ljava/lang/Object;
       144: checkcast     #183                // class ext/mods/gameserver/model/zone/type/RandomZone
       147: astore        5
       149: aload         5
       151: ifnonnull     169
       154: aload_1
       155: ldc           #185                // String Erro ao selecionar zona do evento.
       157: invokevirtual #43                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       160: aload_1
       161: getstatic     #47                 // Field ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
       164: invokevirtual #53                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       167: iconst_0
       168: ireturn
       169: aconst_null
       170: astore        6
       172: invokestatic  #108                // Method ext/mods/Crypta/RandomManager.getInstance:()Lext/mods/Crypta/RandomManager;
       175: aload         5
       177: invokevirtual #187                // Method ext/mods/Crypta/RandomManager.getZoneDataForZone:(Lext/mods/gameserver/model/zone/type/RandomZone;)Lext/mods/FarmEventRandom/holder/RandomZoneData;
       180: astore        7
       182: aload         7
       184: ifnull        202
       187: aload         7
       189: invokevirtual #191                // Method ext/mods/FarmEventRandom/holder/RandomZoneData.getSpawnLocation:()Lext/mods/gameserver/model/location/Location;
       192: ifnull        202
       195: aload         7
       197: invokevirtual #191                // Method ext/mods/FarmEventRandom/holder/RandomZoneData.getSpawnLocation:()Lext/mods/gameserver/model/location/Location;
       200: astore        6
       202: aload         6
       204: ifnonnull     217
       207: aload         5
       209: getstatic     #197                // Field ext/mods/gameserver/enums/SpawnType.NORMAL:Lext/mods/gameserver/enums/SpawnType;
       212: invokevirtual #203                // Method ext/mods/gameserver/model/zone/type/RandomZone.getRndSpawn:(Lext/mods/gameserver/enums/SpawnType;)Lext/mods/gameserver/model/location/Location;
       215: astore        6
       217: aload         6
       219: ifnonnull     412
       222: invokestatic  #108                // Method ext/mods/Crypta/RandomManager.getInstance:()Lext/mods/Crypta/RandomManager;
       225: invokevirtual #207                // Method ext/mods/Crypta/RandomManager.getActiveSpawns:()Ljava/util/List;
       228: astore        8
       230: aload         8
       232: ifnull        412
       235: aload         8
       237: invokeinterface #173,  1          // InterfaceMethod java/util/List.isEmpty:()Z
       242: ifne          412
       245: new           #210                // class java/util/ArrayList
       248: dup
       249: invokespecial #212                // Method java/util/ArrayList."<init>":()V
       252: astore        9
       254: aload         8
       256: invokeinterface #213,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
       261: astore        10
       263: aload         10
       265: invokeinterface #217,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       270: ifeq          346
       273: aload         10
       275: invokeinterface #222,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       280: checkcast     #226                // class ext/mods/gameserver/model/spawn/Spawn
       283: astore        11
       285: aload         11
       287: ifnull        343
       290: aload         11
       292: invokevirtual #228                // Method ext/mods/gameserver/model/spawn/Spawn.getNpc:()Lext/mods/gameserver/model/actor/Npc;
       295: ifnull        343
       298: aload         11
       300: invokevirtual #232                // Method ext/mods/gameserver/model/spawn/Spawn.getSpawnLocation:()Lext/mods/gameserver/model/location/SpawnLocation;
       303: astore        12
       305: aload         12
       307: ifnull        343
       310: aload         5
       312: aload         12
       314: invokevirtual #235                // Method ext/mods/gameserver/model/location/SpawnLocation.getX:()I
       317: aload         12
       319: invokevirtual #240                // Method ext/mods/gameserver/model/location/SpawnLocation.getY:()I
       322: aload         12
       324: invokevirtual #243                // Method ext/mods/gameserver/model/location/SpawnLocation.getZ:()I
       327: invokevirtual #246                // Method ext/mods/gameserver/model/zone/type/RandomZone.isInsideZone:(III)Z
       330: ifeq          343
       333: aload         9
       335: aload         11
       337: invokeinterface #249,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       342: pop
       343: goto          263
       346: aload         9
       348: invokeinterface #173,  1          // InterfaceMethod java/util/List.isEmpty:()Z
       353: ifne          412
       356: aload         9
       358: invokestatic  #178                // Method ext/mods/commons/random/Rnd.get:(Ljava/util/List;)Ljava/lang/Object;
       361: checkcast     #226                // class ext/mods/gameserver/model/spawn/Spawn
       364: astore        10
       366: aload         10
       368: ifnull        412
       371: aload         10
       373: invokevirtual #228                // Method ext/mods/gameserver/model/spawn/Spawn.getNpc:()Lext/mods/gameserver/model/actor/Npc;
       376: ifnull        412
       379: new           #252                // class ext/mods/gameserver/model/location/Location
       382: dup
       383: aload         10
       385: invokevirtual #228                // Method ext/mods/gameserver/model/spawn/Spawn.getNpc:()Lext/mods/gameserver/model/actor/Npc;
       388: invokevirtual #254                // Method ext/mods/gameserver/model/actor/Npc.getX:()I
       391: aload         10
       393: invokevirtual #228                // Method ext/mods/gameserver/model/spawn/Spawn.getNpc:()Lext/mods/gameserver/model/actor/Npc;
       396: invokevirtual #257                // Method ext/mods/gameserver/model/actor/Npc.getY:()I
       399: aload         10
       401: invokevirtual #228                // Method ext/mods/gameserver/model/spawn/Spawn.getNpc:()Lext/mods/gameserver/model/actor/Npc;
       404: invokevirtual #258                // Method ext/mods/gameserver/model/actor/Npc.getZ:()I
       407: invokespecial #259                // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
       410: astore        6
       412: aload         6
       414: ifnonnull     449
       417: aload         5
       419: invokevirtual #262                // Method ext/mods/gameserver/model/zone/type/RandomZone.getReturnLocation:()Lext/mods/gameserver/model/location/Location;
       422: astore        8
       424: aload         8
       426: ifnull        449
       429: aload         8
       431: invokevirtual #265                // Method ext/mods/gameserver/model/location/Location.getX:()I
       434: ifeq          449
       437: aload         8
       439: invokevirtual #266                // Method ext/mods/gameserver/model/location/Location.getY:()I
       442: ifeq          449
       445: aload         8
       447: astore        6
       449: aload         6
       451: ifnonnull     470
       454: aload_1
       455: ldc_w         #267                // String Não foi possível encontrar um ponto de teleporte na Farm Zone.
       458: invokevirtual #43                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       461: aload_1
       462: getstatic     #47                 // Field ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
       465: invokevirtual #53                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       468: iconst_0
       469: ireturn
       470: aload         6
       472: astore        8
       474: aload_1
       475: new           #269                // class ext/mods/gameserver/network/serverpackets/MagicSkillUse
       478: dup
       479: aload_1
       480: aload_1
       481: sipush        2040
       484: iconst_1
       485: sipush        17000
       488: iconst_0
       489: invokespecial #271                // Method ext/mods/gameserver/network/serverpackets/MagicSkillUse."<init>":(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;IIII)V
       492: invokevirtual #274                // Method ext/mods/gameserver/model/actor/Player.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       495: aload_1
       496: new           #277                // class ext/mods/gameserver/network/serverpackets/SetupGauge
       499: dup
       500: getstatic     #279                // Field ext/mods/gameserver/enums/GaugeColor.BLUE:Lext/mods/gameserver/enums/GaugeColor;
       503: sipush        17000
       506: invokespecial #285                // Method ext/mods/gameserver/network/serverpackets/SetupGauge."<init>":(Lext/mods/gameserver/enums/GaugeColor;I)V
       509: invokevirtual #53                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       512: aload_1
       513: aload         8
       515: invokedynamic #288,  0            // InvokeDynamic #0:run:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/location/Location;)Ljava/lang/Runnable;
       520: ldc2_w        #292                // long 17000l
       523: invokestatic  #294                // Method ext/mods/commons/pool/ThreadPool.schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
       526: pop
       527: iconst_1
       528: ireturn
      LineNumberTable:
        line 139: 0
        line 140: 12
        line 142: 14
        line 144: 19
        line 145: 23
        line 147: 25
        line 151: 63
        line 152: 69
        line 153: 76
        line 156: 78
        line 158: 82
        line 160: 86
        line 161: 92
        line 162: 99
        line 166: 101
        line 168: 109
        line 170: 124
        line 171: 130
        line 172: 137
        line 175: 139
        line 176: 149
        line 178: 154
        line 179: 160
        line 180: 167
        line 184: 169
        line 185: 172
        line 186: 182
        line 188: 195
        line 192: 202
        line 194: 207
        line 197: 217
        line 200: 222
        line 202: 230
        line 204: 245
        line 205: 254
        line 207: 285
        line 209: 298
        line 210: 305
        line 212: 333
        line 215: 343
        line 217: 346
        line 219: 356
        line 220: 366
        line 222: 379
        line 228: 412
        line 230: 417
        line 231: 424
        line 233: 445
        line 237: 449
        line 239: 454
        line 240: 461
        line 241: 468
        line 244: 470
        line 246: 474
        line 247: 495
        line 249: 512
        line 256: 527
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          305      38    12 spawnLoc   Lext/mods/gameserver/model/location/SpawnLocation;
          285      58    11 spawn   Lext/mods/gameserver/model/spawn/Spawn;
          366      46    10 selectedSpawn   Lext/mods/gameserver/model/spawn/Spawn;
          254     158     9 zoneSpawns   Ljava/util/List;
          230     182     8 activeSpawns   Ljava/util/List;
          424      25     8 returnLoc   Lext/mods/gameserver/model/location/Location;
            0     529     0  this   Lext/mods/gameserver/handler/voicedcommandhandlers/FarmZoneTeleport;
            0     529     1 player   Lext/mods/gameserver/model/actor/Player;
            0     529     2 confirmed   Z
           82     447     3 randomManager   Ljava/lang/Object;
          109     420     4 activeZones   Ljava/util/List;
          149     380     5 targetZone   Lext/mods/gameserver/model/zone/type/RandomZone;
          172     357     6   loc   Lext/mods/gameserver/model/location/Location;
          182     347     7 zoneData   Lext/mods/FarmEventRandom/holder/RandomZoneData;
          474      55     8 finalLoc   Lext/mods/gameserver/model/location/Location;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
          254     158     9 zoneSpawns   Ljava/util/List<Lext/mods/gameserver/model/spawn/Spawn;>;
          230     182     8 activeSpawns   Ljava/util/List<Lext/mods/gameserver/model/spawn/Spawn;>;
          109     420     4 activeZones   Ljava/util/List<Lext/mods/gameserver/model/zone/type/RandomZone;>;
      StackMapTable: number_of_entries = 16
        frame_type = 14 /* same */
        frame_type = 10 /* same */
        frame_type = 37 /* same */
        frame_type = 14 /* same */
        frame_type = 252 /* append */
          offset_delta = 22
          locals = [ class java/lang/Object ]
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
        frame_type = 20 /* same */

  public java.lang.String[] getVoicedCommandList();
    descriptor: ()[Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #300                // Field VOICED_COMMANDS:[Ljava/lang/String;
         3: areturn
      LineNumberTable:
        line 262: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/handler/voicedcommandhandlers/FarmZoneTeleport;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: iconst_1
         1: anewarray     #32                 // class java/lang/String
         4: dup
         5: iconst_0
         6: ldc           #29                 // String farm
         8: aastore
         9: putstatic     #300                // Field VOICED_COMMANDS:[Ljava/lang/String;
        12: return
      LineNumberTable:
        line 45: 0
}
SourceFile: "FarmZoneTeleport.java"
BootstrapMethods:
  0: #376 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #372 ()V
      #373 REF_invokeStatic ext/mods/gameserver/handler/voicedcommandhandlers/FarmZoneTeleport.lambda$handleConfirmation$0:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/location/Location;)V
      #372 ()V
InnerClasses:
  public static final #388= #384 of #386; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
