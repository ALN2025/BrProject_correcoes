// Bytecode for: ext.mods.gameserver.model.residence.castle.Siege
// File: ext\mods\gameserver\model\residence\castle\Siege.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/residence/castle/Siege.class
  Last modified 9 de jul de 2026; size 32296 bytes
  MD5 checksum 9627658dd3064184d73e42d127bcd806
  Compiled from "Siege.java"
public class ext.mods.gameserver.model.residence.castle.Siege implements ext.mods.gameserver.model.residence.Siegable
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #11                         // ext/mods/gameserver/model/residence/castle/Siege
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 14, methods: 57, attributes: 4
Constant pool:
     #1 = Methodref          #2.#3        // java/lang/Object."<init>":()V
     #2 = Class              #4           // java/lang/Object
     #3 = NameAndType        #5:#6        // "<init>":()V
     #4 = Utf8               java/lang/Object
     #5 = Utf8               <init>
     #6 = Utf8               ()V
     #7 = Class              #8           // java/util/concurrent/ConcurrentHashMap
     #8 = Utf8               java/util/concurrent/ConcurrentHashMap
     #9 = Methodref          #7.#3        // java/util/concurrent/ConcurrentHashMap."<init>":()V
    #10 = Fieldref           #11.#12      // ext/mods/gameserver/model/residence/castle/Siege._registeredClans:Ljava/util/Map;
    #11 = Class              #13          // ext/mods/gameserver/model/residence/castle/Siege
    #12 = NameAndType        #14:#15      // _registeredClans:Ljava/util/Map;
    #13 = Utf8               ext/mods/gameserver/model/residence/castle/Siege
    #14 = Utf8               _registeredClans
    #15 = Utf8               Ljava/util/Map;
    #16 = Fieldref           #17.#18      // ext/mods/gameserver/enums/SiegeStatus.REGISTRATION_OPENED:Lext/mods/gameserver/enums/SiegeStatus;
    #17 = Class              #19          // ext/mods/gameserver/enums/SiegeStatus
    #18 = NameAndType        #20:#21      // REGISTRATION_OPENED:Lext/mods/gameserver/enums/SiegeStatus;
    #19 = Utf8               ext/mods/gameserver/enums/SiegeStatus
    #20 = Utf8               REGISTRATION_OPENED
    #21 = Utf8               Lext/mods/gameserver/enums/SiegeStatus;
    #22 = Fieldref           #11.#23      // ext/mods/gameserver/model/residence/castle/Siege._siegeStatus:Lext/mods/gameserver/enums/SiegeStatus;
    #23 = NameAndType        #24:#21      // _siegeStatus:Lext/mods/gameserver/enums/SiegeStatus;
    #24 = Utf8               _siegeStatus
    #25 = Methodref          #26.#27      // java/util/Collections.emptyList:()Ljava/util/List;
    #26 = Class              #28          // java/util/Collections
    #27 = NameAndType        #29:#30      // emptyList:()Ljava/util/List;
    #28 = Utf8               java/util/Collections
    #29 = Utf8               emptyList
    #30 = Utf8               ()Ljava/util/List;
    #31 = Fieldref           #11.#32      // ext/mods/gameserver/model/residence/castle/Siege._makerEvents:Ljava/util/List;
    #32 = NameAndType        #33:#34      // _makerEvents:Ljava/util/List;
    #33 = Utf8               _makerEvents
    #34 = Utf8               Ljava/util/List;
    #35 = Fieldref           #11.#36      // ext/mods/gameserver/model/residence/castle/Siege._castle:Lext/mods/gameserver/model/residence/castle/Castle;
    #36 = NameAndType        #37:#38      // _castle:Lext/mods/gameserver/model/residence/castle/Castle;
    #37 = Utf8               _castle
    #38 = Utf8               Lext/mods/gameserver/model/residence/castle/Castle;
    #39 = Methodref          #40.#41      // ext/mods/gameserver/model/residence/castle/Castle.getOwnerId:()I
    #40 = Class              #42          // ext/mods/gameserver/model/residence/castle/Castle
    #41 = NameAndType        #43:#44      // getOwnerId:()I
    #42 = Utf8               ext/mods/gameserver/model/residence/castle/Castle
    #43 = Utf8               getOwnerId
    #44 = Utf8               ()I
    #45 = Methodref          #46.#47      // ext/mods/gameserver/data/sql/ClanTable.getInstance:()Lext/mods/gameserver/data/sql/ClanTable;
    #46 = Class              #48          // ext/mods/gameserver/data/sql/ClanTable
    #47 = NameAndType        #49:#50      // getInstance:()Lext/mods/gameserver/data/sql/ClanTable;
    #48 = Utf8               ext/mods/gameserver/data/sql/ClanTable
    #49 = Utf8               getInstance
    #50 = Utf8               ()Lext/mods/gameserver/data/sql/ClanTable;
    #51 = Methodref          #46.#52      // ext/mods/gameserver/data/sql/ClanTable.getClan:(I)Lext/mods/gameserver/model/pledge/Clan;
    #52 = NameAndType        #53:#54      // getClan:(I)Lext/mods/gameserver/model/pledge/Clan;
    #53 = Utf8               getClan
    #54 = Utf8               (I)Lext/mods/gameserver/model/pledge/Clan;
    #55 = Fieldref           #56.#57      // ext/mods/gameserver/enums/SiegeSide.OWNER:Lext/mods/gameserver/enums/SiegeSide;
    #56 = Class              #58          // ext/mods/gameserver/enums/SiegeSide
    #57 = NameAndType        #59:#60      // OWNER:Lext/mods/gameserver/enums/SiegeSide;
    #58 = Utf8               ext/mods/gameserver/enums/SiegeSide
    #59 = Utf8               OWNER
    #60 = Utf8               Lext/mods/gameserver/enums/SiegeSide;
    #61 = InterfaceMethodref #62.#63      // java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    #62 = Class              #64          // java/util/Map
    #63 = NameAndType        #65:#66      // put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    #64 = Utf8               java/util/Map
    #65 = Utf8               put
    #66 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    #67 = Methodref          #68.#69      // ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
    #68 = Class              #70          // ext/mods/commons/pool/ConnectionPool
    #69 = NameAndType        #71:#72      // getConnection:()Ljava/sql/Connection;
    #70 = Utf8               ext/mods/commons/pool/ConnectionPool
    #71 = Utf8               getConnection
    #72 = Utf8               ()Ljava/sql/Connection;
    #73 = String             #74          // SELECT clan_id,type FROM siege_clans WHERE castle_id=?
    #74 = Utf8               SELECT clan_id,type FROM siege_clans WHERE castle_id=?
    #75 = InterfaceMethodref #76.#77      // java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
    #76 = Class              #78          // java/sql/Connection
    #77 = NameAndType        #79:#80      // prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
    #78 = Utf8               java/sql/Connection
    #79 = Utf8               prepareStatement
    #80 = Utf8               (Ljava/lang/String;)Ljava/sql/PreparedStatement;
    #81 = Methodref          #40.#82      // ext/mods/gameserver/model/residence/castle/Castle.getId:()I
    #82 = NameAndType        #83:#44      // getId:()I
    #83 = Utf8               getId
    #84 = InterfaceMethodref #85.#86      // java/sql/PreparedStatement.setInt:(II)V
    #85 = Class              #87          // java/sql/PreparedStatement
    #86 = NameAndType        #88:#89      // setInt:(II)V
    #87 = Utf8               java/sql/PreparedStatement
    #88 = Utf8               setInt
    #89 = Utf8               (II)V
    #90 = InterfaceMethodref #85.#91      // java/sql/PreparedStatement.executeQuery:()Ljava/sql/ResultSet;
    #91 = NameAndType        #92:#93      // executeQuery:()Ljava/sql/ResultSet;
    #92 = Utf8               executeQuery
    #93 = Utf8               ()Ljava/sql/ResultSet;
    #94 = InterfaceMethodref #95.#96      // java/sql/ResultSet.next:()Z
    #95 = Class              #97          // java/sql/ResultSet
    #96 = NameAndType        #98:#99      // next:()Z
    #97 = Utf8               java/sql/ResultSet
    #98 = Utf8               next
    #99 = Utf8               ()Z
   #100 = String             #101         // clan_id
   #101 = Utf8               clan_id
   #102 = InterfaceMethodref #95.#103     // java/sql/ResultSet.getInt:(Ljava/lang/String;)I
   #103 = NameAndType        #104:#105    // getInt:(Ljava/lang/String;)I
   #104 = Utf8               getInt
   #105 = Utf8               (Ljava/lang/String;)I
   #106 = String             #107         // type
   #107 = Utf8               type
   #108 = InterfaceMethodref #95.#109     // java/sql/ResultSet.getString:(Ljava/lang/String;)Ljava/lang/String;
   #109 = NameAndType        #110:#111    // getString:(Ljava/lang/String;)Ljava/lang/String;
   #110 = Utf8               getString
   #111 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
   #112 = Methodref          #113.#114    // java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
   #113 = Class              #115         // java/lang/Enum
   #114 = NameAndType        #116:#117    // valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
   #115 = Utf8               java/lang/Enum
   #116 = Utf8               valueOf
   #117 = Utf8               (Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
   #118 = InterfaceMethodref #95.#119     // java/sql/ResultSet.close:()V
   #119 = NameAndType        #120:#6      // close:()V
   #120 = Utf8               close
   #121 = Class              #122         // java/lang/Throwable
   #122 = Utf8               java/lang/Throwable
   #123 = Methodref          #121.#124    // java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
   #124 = NameAndType        #125:#126    // addSuppressed:(Ljava/lang/Throwable;)V
   #125 = Utf8               addSuppressed
   #126 = Utf8               (Ljava/lang/Throwable;)V
   #127 = InterfaceMethodref #85.#119     // java/sql/PreparedStatement.close:()V
   #128 = InterfaceMethodref #76.#119     // java/sql/Connection.close:()V
   #129 = Class              #130         // java/lang/Exception
   #130 = Utf8               java/lang/Exception
   #131 = Fieldref           #11.#132     // ext/mods/gameserver/model/residence/castle/Siege.LOGGER:Lext/mods/commons/logging/CLogger;
   #132 = NameAndType        #133:#134    // LOGGER:Lext/mods/commons/logging/CLogger;
   #133 = Utf8               LOGGER
   #134 = Utf8               Lext/mods/commons/logging/CLogger;
   #135 = String             #136         // Couldn\'t load siege registered clans.
   #136 = Utf8               Couldn\'t load siege registered clans.
   #137 = Methodref          #138.#139    // ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
   #138 = Class              #140         // ext/mods/commons/logging/CLogger
   #139 = NameAndType        #141:#142    // error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
   #140 = Utf8               ext/mods/commons/logging/CLogger
   #141 = Utf8               error
   #142 = Utf8               (Ljava/lang/Object;Ljava/lang/Throwable;)V
   #143 = Methodref          #11.#144     // ext/mods/gameserver/model/residence/castle/Siege.startAutoTask:()V
   #144 = NameAndType        #145:#6      // startAutoTask:()V
   #145 = Utf8               startAutoTask
   #146 = Methodref          #11.#147     // ext/mods/gameserver/model/residence/castle/Siege.isInProgress:()Z
   #147 = NameAndType        #148:#99     // isInProgress:()Z
   #148 = Utf8               isInProgress
   #149 = Methodref          #11.#150     // ext/mods/gameserver/model/residence/castle/Siege.getAttackerClans:()Ljava/util/List;
   #150 = NameAndType        #151:#30     // getAttackerClans:()Ljava/util/List;
   #151 = Utf8               getAttackerClans
   #152 = InterfaceMethodref #153.#154    // java/util/List.isEmpty:()Z
   #153 = Class              #155         // java/util/List
   #154 = NameAndType        #156:#99     // isEmpty:()Z
   #155 = Utf8               java/util/List
   #156 = Utf8               isEmpty
   #157 = Fieldref           #158.#159    // ext/mods/gameserver/network/SystemMessageId.SIEGE_OF_S1_HAS_BEEN_CANCELED_DUE_TO_LACK_OF_INTEREST:Lext/mods/gameserver/network/SystemMessageId;
   #158 = Class              #160         // ext/mods/gameserver/network/SystemMessageId
   #159 = NameAndType        #161:#162    // SIEGE_OF_S1_HAS_BEEN_CANCELED_DUE_TO_LACK_OF_INTEREST:Lext/mods/gameserver/network/SystemMessageId;
   #160 = Utf8               ext/mods/gameserver/network/SystemMessageId
   #161 = Utf8               SIEGE_OF_S1_HAS_BEEN_CANCELED_DUE_TO_LACK_OF_INTEREST
   #162 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
   #163 = Fieldref           #158.#164    // ext/mods/gameserver/network/SystemMessageId.S1_SIEGE_WAS_CANCELED_BECAUSE_NO_CLANS_PARTICIPATED:Lext/mods/gameserver/network/SystemMessageId;
   #164 = NameAndType        #165:#162    // S1_SIEGE_WAS_CANCELED_BECAUSE_NO_CLANS_PARTICIPATED:Lext/mods/gameserver/network/SystemMessageId;
   #165 = Utf8               S1_SIEGE_WAS_CANCELED_BECAUSE_NO_CLANS_PARTICIPATED
   #166 = Methodref          #167.#168    // ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #167 = Class              #169         // ext/mods/gameserver/network/serverpackets/SystemMessage
   #168 = NameAndType        #170:#171    // getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #169 = Utf8               ext/mods/gameserver/network/serverpackets/SystemMessage
   #170 = Utf8               getSystemMessage
   #171 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #172 = Methodref          #167.#173    // ext/mods/gameserver/network/serverpackets/SystemMessage.addFortId:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #173 = NameAndType        #174:#175    // addFortId:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #174 = Utf8               addFortId
   #175 = Utf8               (I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #176 = Methodref          #177.#178    // ext/mods/gameserver/model/World.toAllOnlinePlayers:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #177 = Class              #179         // ext/mods/gameserver/model/World
   #178 = NameAndType        #180:#181    // toAllOnlinePlayers:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #179 = Utf8               ext/mods/gameserver/model/World
   #180 = Utf8               toAllOnlinePlayers
   #181 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #182 = Methodref          #11.#183     // ext/mods/gameserver/model/residence/castle/Siege.saveCastleSiege:(Z)V
   #183 = NameAndType        #184:#185    // saveCastleSiege:(Z)V
   #184 = Utf8               saveCastleSiege
   #185 = Utf8               (Z)V
   #186 = Fieldref           #11.#187     // ext/mods/gameserver/model/residence/castle/Siege._formerOwner:Lext/mods/gameserver/model/pledge/Clan;
   #187 = NameAndType        #188:#189    // _formerOwner:Lext/mods/gameserver/model/pledge/Clan;
   #188 = Utf8               _formerOwner
   #189 = Utf8               Lext/mods/gameserver/model/pledge/Clan;
   #190 = Fieldref           #17.#191     // ext/mods/gameserver/enums/SiegeStatus.IN_PROGRESS:Lext/mods/gameserver/enums/SiegeStatus;
   #191 = NameAndType        #192:#21     // IN_PROGRESS:Lext/mods/gameserver/enums/SiegeStatus;
   #192 = Utf8               IN_PROGRESS
   #193 = Methodref          #11.#194     // ext/mods/gameserver/model/residence/castle/Siege.changeStatus:(Lext/mods/gameserver/enums/SiegeStatus;)V
   #194 = NameAndType        #195:#196    // changeStatus:(Lext/mods/gameserver/enums/SiegeStatus;)V
   #195 = Utf8               changeStatus
   #196 = Utf8               (Lext/mods/gameserver/enums/SiegeStatus;)V
   #197 = Methodref          #40.#198     // ext/mods/gameserver/model/residence/castle/Castle.getSiegeZone:()Lext/mods/gameserver/model/zone/type/SiegeZone;
   #198 = NameAndType        #199:#200    // getSiegeZone:()Lext/mods/gameserver/model/zone/type/SiegeZone;
   #199 = Utf8               getSiegeZone
   #200 = Utf8               ()Lext/mods/gameserver/model/zone/type/SiegeZone;
   #201 = Methodref          #202.#203    // ext/mods/gameserver/model/zone/type/SiegeZone.banishForeigners:(I)V
   #202 = Class              #204         // ext/mods/gameserver/model/zone/type/SiegeZone
   #203 = NameAndType        #205:#206    // banishForeigners:(I)V
   #204 = Utf8               ext/mods/gameserver/model/zone/type/SiegeZone
   #205 = Utf8               banishForeigners
   #206 = Utf8               (I)V
   #207 = Methodref          #202.#208    // ext/mods/gameserver/model/zone/type/SiegeZone.setActive:(Z)V
   #208 = NameAndType        #209:#185    // setActive:(Z)V
   #209 = Utf8               setActive
   #210 = Methodref          #11.#211     // ext/mods/gameserver/model/residence/castle/Siege.updatePlayerSiegeStateFlags:(Z)V
   #211 = NameAndType        #212:#185    // updatePlayerSiegeStateFlags:(Z)V
   #212 = Utf8               updatePlayerSiegeStateFlags
   #213 = Methodref          #40.#214     // ext/mods/gameserver/model/residence/castle/Castle.getControlTowers:()Ljava/util/List;
   #214 = NameAndType        #215:#30     // getControlTowers:()Ljava/util/List;
   #215 = Utf8               getControlTowers
   #216 = InvokeDynamic      #0:#217      // #0:accept:()Ljava/util/function/Consumer;
   #217 = NameAndType        #218:#219    // accept:()Ljava/util/function/Consumer;
   #218 = Utf8               accept
   #219 = Utf8               ()Ljava/util/function/Consumer;
   #220 = InterfaceMethodref #153.#221    // java/util/List.forEach:(Ljava/util/function/Consumer;)V
   #221 = NameAndType        #222:#223    // forEach:(Ljava/util/function/Consumer;)V
   #222 = Utf8               forEach
   #223 = Utf8               (Ljava/util/function/Consumer;)V
   #224 = Methodref          #40.#225     // ext/mods/gameserver/model/residence/castle/Castle.closeDoors:()V
   #225 = NameAndType        #226:#6      // closeDoors:()V
   #226 = Utf8               closeDoors
   #227 = Methodref          #40.#228     // ext/mods/gameserver/model/residence/castle/Castle.spawnSiegeGuardsOrMercenaries:()V
   #228 = NameAndType        #229:#6      // spawnSiegeGuardsOrMercenaries:()V
   #229 = Utf8               spawnSiegeGuardsOrMercenaries
   #230 = Fieldref           #158.#231    // ext/mods/gameserver/network/SystemMessageId.SIEGE_OF_S1_HAS_STARTED:Lext/mods/gameserver/network/SystemMessageId;
   #231 = NameAndType        #232:#162    // SIEGE_OF_S1_HAS_STARTED:Lext/mods/gameserver/network/SystemMessageId;
   #232 = Utf8               SIEGE_OF_S1_HAS_STARTED
   #233 = Class              #234         // ext/mods/gameserver/network/serverpackets/PlaySound
   #234 = Utf8               ext/mods/gameserver/network/serverpackets/PlaySound
   #235 = String             #236         // systemmsg_e.17
   #236 = Utf8               systemmsg_e.17
   #237 = Methodref          #233.#238    // ext/mods/gameserver/network/serverpackets/PlaySound."<init>":(Ljava/lang/String;)V
   #238 = NameAndType        #5:#239      // "<init>":(Ljava/lang/String;)V
   #239 = Utf8               (Ljava/lang/String;)V
   #240 = Fieldref           #158.#241    // ext/mods/gameserver/network/SystemMessageId.TEMPORARY_ALLIANCE:Lext/mods/gameserver/network/SystemMessageId;
   #241 = NameAndType        #242:#162    // TEMPORARY_ALLIANCE:Lext/mods/gameserver/network/SystemMessageId;
   #242 = Utf8               TEMPORARY_ALLIANCE
   #243 = Fieldref           #56.#244     // ext/mods/gameserver/enums/SiegeSide.ATTACKER:Lext/mods/gameserver/enums/SiegeSide;
   #244 = NameAndType        #245:#60     // ATTACKER:Lext/mods/gameserver/enums/SiegeSide;
   #245 = Utf8               ATTACKER
   #246 = Methodref          #11.#247     // ext/mods/gameserver/model/residence/castle/Siege.announce:(Lext/mods/gameserver/network/SystemMessageId;[Lext/mods/gameserver/enums/SiegeSide;)V
   #247 = NameAndType        #248:#249    // announce:(Lext/mods/gameserver/network/SystemMessageId;[Lext/mods/gameserver/enums/SiegeSide;)V
   #248 = Utf8               announce
   #249 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;[Lext/mods/gameserver/enums/SiegeSide;)V
   #250 = Methodref          #251.#252    // java/util/Calendar.getInstance:()Ljava/util/Calendar;
   #251 = Class              #253         // java/util/Calendar
   #252 = NameAndType        #49:#254     // getInstance:()Ljava/util/Calendar;
   #253 = Utf8               java/util/Calendar
   #254 = Utf8               ()Ljava/util/Calendar;
   #255 = Fieldref           #11.#256     // ext/mods/gameserver/model/residence/castle/Siege._siegeEndDate:Ljava/util/Calendar;
   #256 = NameAndType        #257:#258    // _siegeEndDate:Ljava/util/Calendar;
   #257 = Utf8               _siegeEndDate
   #258 = Utf8               Ljava/util/Calendar;
   #259 = Fieldref           #260.#261    // ext/mods/Config.SIEGE_LENGTH:I
   #260 = Class              #262         // ext/mods/Config
   #261 = NameAndType        #263:#264    // SIEGE_LENGTH:I
   #262 = Utf8               ext/mods/Config
   #263 = Utf8               SIEGE_LENGTH
   #264 = Utf8               I
   #265 = Methodref          #251.#266    // java/util/Calendar.add:(II)V
   #266 = NameAndType        #267:#89     // add:(II)V
   #267 = Utf8               add
   #268 = Methodref          #11.#269     // ext/mods/gameserver/model/residence/castle/Siege.processSiegeTimer:()V
   #269 = NameAndType        #270:#6      // processSiegeTimer:()V
   #270 = Utf8               processSiegeTimer
   #271 = Methodref          #272.#273    // ext/mods/extensions/listener/manager/SiegeListenerManager.getInstance:()Lext/mods/extensions/listener/manager/SiegeListenerManager;
   #272 = Class              #274         // ext/mods/extensions/listener/manager/SiegeListenerManager
   #273 = NameAndType        #49:#275     // getInstance:()Lext/mods/extensions/listener/manager/SiegeListenerManager;
   #274 = Utf8               ext/mods/extensions/listener/manager/SiegeListenerManager
   #275 = Utf8               ()Lext/mods/extensions/listener/manager/SiegeListenerManager;
   #276 = Methodref          #272.#277    // ext/mods/extensions/listener/manager/SiegeListenerManager.notifySiegeStart:(Lext/mods/gameserver/model/residence/castle/Siege;)V
   #277 = NameAndType        #278:#279    // notifySiegeStart:(Lext/mods/gameserver/model/residence/castle/Siege;)V
   #278 = Utf8               notifySiegeStart
   #279 = Utf8               (Lext/mods/gameserver/model/residence/castle/Siege;)V
   #280 = Fieldref           #158.#281    // ext/mods/gameserver/network/SystemMessageId.SIEGE_OF_S1_HAS_ENDED:Lext/mods/gameserver/network/SystemMessageId;
   #281 = NameAndType        #282:#162    // SIEGE_OF_S1_HAS_ENDED:Lext/mods/gameserver/network/SystemMessageId;
   #282 = Utf8               SIEGE_OF_S1_HAS_ENDED
   #283 = String             #284         // systemmsg_e.18
   #284 = Utf8               systemmsg_e.18
   #285 = Fieldref           #158.#286    // ext/mods/gameserver/network/SystemMessageId.CLAN_S1_VICTORIOUS_OVER_S2_S_SIEGE:Lext/mods/gameserver/network/SystemMessageId;
   #286 = NameAndType        #287:#162    // CLAN_S1_VICTORIOUS_OVER_S2_S_SIEGE:Lext/mods/gameserver/network/SystemMessageId;
   #287 = Utf8               CLAN_S1_VICTORIOUS_OVER_S2_S_SIEGE
   #288 = Methodref          #289.#290    // ext/mods/gameserver/model/pledge/Clan.getName:()Ljava/lang/String;
   #289 = Class              #291         // ext/mods/gameserver/model/pledge/Clan
   #290 = NameAndType        #292:#293    // getName:()Ljava/lang/String;
   #291 = Utf8               ext/mods/gameserver/model/pledge/Clan
   #292 = Utf8               getName
   #293 = Utf8               ()Ljava/lang/String;
   #294 = Methodref          #167.#295    // ext/mods/gameserver/network/serverpackets/SystemMessage.addString:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #295 = NameAndType        #296:#297    // addString:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #296 = Utf8               addString
   #297 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #298 = Methodref          #289.#299    // ext/mods/gameserver/model/pledge/Clan.getOnlineMembers:()[Lext/mods/gameserver/model/actor/Player;
   #299 = NameAndType        #300:#301    // getOnlineMembers:()[Lext/mods/gameserver/model/actor/Player;
   #300 = Utf8               getOnlineMembers
   #301 = Utf8               ()[Lext/mods/gameserver/model/actor/Player;
   #302 = Methodref          #303.#304    // ext/mods/gameserver/model/actor/Player.isClanLeader:()Z
   #303 = Class              #305         // ext/mods/gameserver/model/actor/Player
   #304 = NameAndType        #306:#99     // isClanLeader:()Z
   #305 = Utf8               ext/mods/gameserver/model/actor/Player
   #306 = Utf8               isClanLeader
   #307 = Methodref          #40.#308     // ext/mods/gameserver/model/residence/castle/Castle.getItemsLeader:()Ljava/util/Map;
   #308 = NameAndType        #309:#310    // getItemsLeader:()Ljava/util/Map;
   #309 = Utf8               getItemsLeader
   #310 = Utf8               ()Ljava/util/Map;
   #311 = Methodref          #40.#312     // ext/mods/gameserver/model/residence/castle/Castle.getItemsMember:()Ljava/util/Map;
   #312 = NameAndType        #313:#310    // getItemsMember:()Ljava/util/Map;
   #313 = Utf8               getItemsMember
   #314 = InvokeDynamic      #1:#315      // #1:accept:(Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/BiConsumer;
   #315 = NameAndType        #218:#316    // accept:(Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/BiConsumer;
   #316 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/BiConsumer;
   #317 = InterfaceMethodref #62.#318     // java/util/Map.forEach:(Ljava/util/function/BiConsumer;)V
   #318 = NameAndType        #222:#319    // forEach:(Ljava/util/function/BiConsumer;)V
   #319 = Utf8               (Ljava/util/function/BiConsumer;)V
   #320 = Methodref          #40.#321     // ext/mods/gameserver/model/residence/castle/Castle.checkItemsForClan:(Lext/mods/gameserver/model/pledge/Clan;)V
   #321 = NameAndType        #322:#323    // checkItemsForClan:(Lext/mods/gameserver/model/pledge/Clan;)V
   #322 = Utf8               checkItemsForClan
   #323 = Utf8               (Lext/mods/gameserver/model/pledge/Clan;)V
   #324 = Methodref          #289.#325    // ext/mods/gameserver/model/pledge/Clan.getMembers:()Ljava/util/Collection;
   #325 = NameAndType        #326:#327    // getMembers:()Ljava/util/Collection;
   #326 = Utf8               getMembers
   #327 = Utf8               ()Ljava/util/Collection;
   #328 = InterfaceMethodref #329.#330    // java/util/Collection.iterator:()Ljava/util/Iterator;
   #329 = Class              #331         // java/util/Collection
   #330 = NameAndType        #332:#333    // iterator:()Ljava/util/Iterator;
   #331 = Utf8               java/util/Collection
   #332 = Utf8               iterator
   #333 = Utf8               ()Ljava/util/Iterator;
   #334 = InterfaceMethodref #335.#336    // java/util/Iterator.hasNext:()Z
   #335 = Class              #337         // java/util/Iterator
   #336 = NameAndType        #338:#99     // hasNext:()Z
   #337 = Utf8               java/util/Iterator
   #338 = Utf8               hasNext
   #339 = InterfaceMethodref #335.#340    // java/util/Iterator.next:()Ljava/lang/Object;
   #340 = NameAndType        #98:#341     // next:()Ljava/lang/Object;
   #341 = Utf8               ()Ljava/lang/Object;
   #342 = Class              #343         // ext/mods/gameserver/model/pledge/ClanMember
   #343 = Utf8               ext/mods/gameserver/model/pledge/ClanMember
   #344 = Methodref          #342.#345    // ext/mods/gameserver/model/pledge/ClanMember.getPlayerInstance:()Lext/mods/gameserver/model/actor/Player;
   #345 = NameAndType        #346:#347    // getPlayerInstance:()Lext/mods/gameserver/model/actor/Player;
   #346 = Utf8               getPlayerInstance
   #347 = Utf8               ()Lext/mods/gameserver/model/actor/Player;
   #348 = Methodref          #303.#349    // ext/mods/gameserver/model/actor/Player.isNoble:()Z
   #349 = NameAndType        #350:#99     // isNoble:()Z
   #350 = Utf8               isNoble
   #351 = Methodref          #352.#353    // ext/mods/gameserver/data/manager/HeroManager.getInstance:()Lext/mods/gameserver/data/manager/HeroManager;
   #352 = Class              #354         // ext/mods/gameserver/data/manager/HeroManager
   #353 = NameAndType        #49:#355     // getInstance:()Lext/mods/gameserver/data/manager/HeroManager;
   #354 = Utf8               ext/mods/gameserver/data/manager/HeroManager
   #355 = Utf8               ()Lext/mods/gameserver/data/manager/HeroManager;
   #356 = Methodref          #303.#357    // ext/mods/gameserver/model/actor/Player.getObjectId:()I
   #357 = NameAndType        #358:#44     // getObjectId:()I
   #358 = Utf8               getObjectId
   #359 = Methodref          #352.#360    // ext/mods/gameserver/data/manager/HeroManager.setCastleTaken:(II)V
   #360 = NameAndType        #361:#89     // setCastleTaken:(II)V
   #361 = Utf8               setCastleTaken
   #362 = Fieldref           #158.#363    // ext/mods/gameserver/network/SystemMessageId.SIEGE_S1_DRAW:Lext/mods/gameserver/network/SystemMessageId;
   #363 = NameAndType        #364:#162    // SIEGE_S1_DRAW:Lext/mods/gameserver/network/SystemMessageId;
   #364 = Utf8               SIEGE_S1_DRAW
   #365 = InterfaceMethodref #62.#366     // java/util/Map.keySet:()Ljava/util/Set;
   #366 = NameAndType        #367:#368    // keySet:()Ljava/util/Set;
   #367 = Utf8               keySet
   #368 = Utf8               ()Ljava/util/Set;
   #369 = InterfaceMethodref #370.#330    // java/util/Set.iterator:()Ljava/util/Iterator;
   #370 = Class              #371         // java/util/Set
   #371 = Utf8               java/util/Set
   #372 = Methodref          #289.#373    // ext/mods/gameserver/model/pledge/Clan.setSiegeKills:(I)V
   #373 = NameAndType        #374:#206    // setSiegeKills:(I)V
   #374 = Utf8               setSiegeKills
   #375 = Methodref          #289.#376    // ext/mods/gameserver/model/pledge/Clan.setSiegeDeaths:(I)V
   #376 = NameAndType        #377:#206    // setSiegeDeaths:(I)V
   #377 = Utf8               setSiegeDeaths
   #378 = Methodref          #289.#379    // ext/mods/gameserver/model/pledge/Clan.setFlag:(Lext/mods/gameserver/model/actor/Npc;)V
   #379 = NameAndType        #380:#381    // setFlag:(Lext/mods/gameserver/model/actor/Npc;)V
   #380 = Utf8               setFlag
   #381 = Utf8               (Lext/mods/gameserver/model/actor/Npc;)V
   #382 = Methodref          #11.#383     // ext/mods/gameserver/model/residence/castle/Siege.updateClansReputation:()V
   #383 = NameAndType        #384:#6      // updateClansReputation:()V
   #384 = Utf8               updateClansReputation
   #385 = Methodref          #11.#386     // ext/mods/gameserver/model/residence/castle/Siege.clearAllClans:()V
   #386 = NameAndType        #387:#6      // clearAllClans:()V
   #387 = Utf8               clearAllClans
   #388 = InvokeDynamic      #2:#217      // #2:accept:()Ljava/util/function/Consumer;
   #389 = Methodref          #40.#390     // ext/mods/gameserver/model/residence/castle/Castle.despawnSiegeGuardsOrMercenaries:()V
   #390 = NameAndType        #391:#6      // despawnSiegeGuardsOrMercenaries:()V
   #391 = Utf8               despawnSiegeGuardsOrMercenaries
   #392 = Methodref          #40.#393     // ext/mods/gameserver/model/residence/castle/Castle.spawnDoors:(Z)V
   #393 = NameAndType        #394:#185    // spawnDoors:(Z)V
   #394 = Utf8               spawnDoors
   #395 = Methodref          #40.#396     // ext/mods/gameserver/model/residence/castle/Castle.getSkillsLeader:()Ljava/util/Map;
   #396 = NameAndType        #397:#310    // getSkillsLeader:()Ljava/util/Map;
   #397 = Utf8               getSkillsLeader
   #398 = Methodref          #40.#399     // ext/mods/gameserver/model/residence/castle/Castle.getSkillsMember:()Ljava/util/Map;
   #399 = NameAndType        #400:#310    // getSkillsMember:()Ljava/util/Map;
   #400 = Utf8               getSkillsMember
   #401 = InvokeDynamic      #3:#315      // #3:accept:(Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/BiConsumer;
   #402 = Methodref          #289.#403    // ext/mods/gameserver/model/pledge/Clan.getClanId:()I
   #403 = NameAndType        #404:#44     // getClanId:()I
   #404 = Utf8               getClanId
   #405 = InvokeDynamic      #4:#315      // #4:accept:(Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/BiConsumer;
   #406 = Methodref          #272.#407    // ext/mods/extensions/listener/manager/SiegeListenerManager.notifySiegeEnd:(Lext/mods/gameserver/model/residence/castle/Siege;)V
   #407 = NameAndType        #408:#279    // notifySiegeEnd:(Lext/mods/gameserver/model/residence/castle/Siege;)V
   #408 = Utf8               notifySiegeEnd
   #409 = InterfaceMethodref #62.#410     // java/util/Map.entrySet:()Ljava/util/Set;
   #410 = NameAndType        #411:#368    // entrySet:()Ljava/util/Set;
   #411 = Utf8               entrySet
   #412 = InterfaceMethodref #370.#413    // java/util/Set.stream:()Ljava/util/stream/Stream;
   #413 = NameAndType        #414:#415    // stream:()Ljava/util/stream/Stream;
   #414 = Utf8               stream
   #415 = Utf8               ()Ljava/util/stream/Stream;
   #416 = InvokeDynamic      #5:#417      // #5:test:()Ljava/util/function/Predicate;
   #417 = NameAndType        #418:#419    // test:()Ljava/util/function/Predicate;
   #418 = Utf8               test
   #419 = Utf8               ()Ljava/util/function/Predicate;
   #420 = InterfaceMethodref #421.#422    // java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
   #421 = Class              #423         // java/util/stream/Stream
   #422 = NameAndType        #424:#425    // filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
   #423 = Utf8               java/util/stream/Stream
   #424 = Utf8               filter
   #425 = Utf8               (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
   #426 = InvokeDynamic      #6:#427      // #6:apply:()Ljava/util/function/Function;
   #427 = NameAndType        #428:#429    // apply:()Ljava/util/function/Function;
   #428 = Utf8               apply
   #429 = Utf8               ()Ljava/util/function/Function;
   #430 = InterfaceMethodref #421.#431    // java/util/stream/Stream.map:(Ljava/util/function/Function;)Ljava/util/stream/Stream;
   #431 = NameAndType        #432:#433    // map:(Ljava/util/function/Function;)Ljava/util/stream/Stream;
   #432 = Utf8               map
   #433 = Utf8               (Ljava/util/function/Function;)Ljava/util/stream/Stream;
   #434 = InterfaceMethodref #421.#435    // java/util/stream/Stream.toList:()Ljava/util/List;
   #435 = NameAndType        #436:#30     // toList:()Ljava/util/List;
   #436 = Utf8               toList
   #437 = InvokeDynamic      #7:#417      // #7:test:()Ljava/util/function/Predicate;
   #438 = InterfaceMethodref #62.#439     // java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
   #439 = NameAndType        #440:#441    // get:(Ljava/lang/Object;)Ljava/lang/Object;
   #440 = Utf8               get
   #441 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
   #442 = Methodref          #443.#444    // ext/mods/commons/util/ArraysUtil.contains:([Ljava/lang/Object;Ljava/lang/Object;)Z
   #443 = Class              #445         // ext/mods/commons/util/ArraysUtil
   #444 = NameAndType        #446:#447    // contains:([Ljava/lang/Object;Ljava/lang/Object;)Z
   #445 = Utf8               ext/mods/commons/util/ArraysUtil
   #446 = Utf8               contains
   #447 = Utf8               ([Ljava/lang/Object;Ljava/lang/Object;)Z
   #448 = InterfaceMethodref #62.#449     // java/util/Map.containsKey:(Ljava/lang/Object;)Z
   #449 = NameAndType        #450:#451    // containsKey:(Ljava/lang/Object;)Z
   #450 = Utf8               containsKey
   #451 = Utf8               (Ljava/lang/Object;)Z
   #452 = Methodref          #11.#453     // ext/mods/gameserver/model/residence/castle/Siege.checkSide:(Lext/mods/gameserver/model/pledge/Clan;Lext/mods/gameserver/enums/SiegeSide;)Z
   #453 = NameAndType        #454:#455    // checkSide:(Lext/mods/gameserver/model/pledge/Clan;Lext/mods/gameserver/enums/SiegeSide;)Z
   #454 = Utf8               checkSide
   #455 = Utf8               (Lext/mods/gameserver/model/pledge/Clan;Lext/mods/gameserver/enums/SiegeSide;)Z
   #456 = Methodref          #289.#457    // ext/mods/gameserver/model/pledge/Clan.getFlag:()Lext/mods/gameserver/model/actor/Npc;
   #457 = NameAndType        #458:#459    // getFlag:()Lext/mods/gameserver/model/actor/Npc;
   #458 = Utf8               getFlag
   #459 = Utf8               ()Lext/mods/gameserver/model/actor/Npc;
   #460 = Methodref          #40.#461     // ext/mods/gameserver/model/residence/castle/Castle.getSiegeDate:()Ljava/util/Calendar;
   #461 = NameAndType        #462:#254    // getSiegeDate:()Ljava/util/Calendar;
   #462 = Utf8               getSiegeDate
   #463 = InvokeDynamic      #8:#417      // #8:test:()Ljava/util/function/Predicate;
   #464 = Methodref          #289.#465    // ext/mods/gameserver/model/pledge/Clan.takeReputationScore:(I)Z
   #465 = NameAndType        #466:#467    // takeReputationScore:(I)Z
   #466 = Utf8               takeReputationScore
   #467 = Utf8               (I)Z
   #468 = Class              #469         // ext/mods/gameserver/network/serverpackets/L2GameServerPacket
   #469 = Utf8               ext/mods/gameserver/network/serverpackets/L2GameServerPacket
   #470 = Fieldref           #158.#471    // ext/mods/gameserver/network/SystemMessageId.CLAN_WAS_DEFEATED_IN_SIEGE_AND_LOST_S1_REPUTATION_POINTS:Lext/mods/gameserver/network/SystemMessageId;
   #471 = NameAndType        #472:#162    // CLAN_WAS_DEFEATED_IN_SIEGE_AND_LOST_S1_REPUTATION_POINTS:Lext/mods/gameserver/network/SystemMessageId;
   #472 = Utf8               CLAN_WAS_DEFEATED_IN_SIEGE_AND_LOST_S1_REPUTATION_POINTS
   #473 = Methodref          #167.#474    // ext/mods/gameserver/network/serverpackets/SystemMessage.addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #474 = NameAndType        #475:#175    // addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #475 = Utf8               addNumber
   #476 = Methodref          #289.#477    // ext/mods/gameserver/model/pledge/Clan.broadcastToMembers:([Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #477 = NameAndType        #478:#479    // broadcastToMembers:([Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #478 = Utf8               broadcastToMembers
   #479 = Utf8               ([Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #480 = Methodref          #289.#481    // ext/mods/gameserver/model/pledge/Clan.addReputationScore:(I)Z
   #481 = NameAndType        #482:#467    // addReputationScore:(I)Z
   #482 = Utf8               addReputationScore
   #483 = Fieldref           #158.#484    // ext/mods/gameserver/network/SystemMessageId.CLAN_VICTORIOUS_IN_SIEGE_AND_GAINED_S1_REPUTATION_POINTS:Lext/mods/gameserver/network/SystemMessageId;
   #484 = NameAndType        #485:#162    // CLAN_VICTORIOUS_IN_SIEGE_AND_GAINED_S1_REPUTATION_POINTS:Lext/mods/gameserver/network/SystemMessageId;
   #485 = Utf8               CLAN_VICTORIOUS_IN_SIEGE_AND_GAINED_S1_REPUTATION_POINTS
   #486 = Class              #487         // java/util/Map$Entry
   #487 = Utf8               java/util/Map$Entry
   #488 = InterfaceMethodref #486.#489    // java/util/Map$Entry.getValue:()Ljava/lang/Object;
   #489 = NameAndType        #490:#341    // getValue:()Ljava/lang/Object;
   #490 = Utf8               getValue
   #491 = InterfaceMethodref #486.#492    // java/util/Map$Entry.setValue:(Ljava/lang/Object;)Ljava/lang/Object;
   #492 = NameAndType        #493:#441    // setValue:(Ljava/lang/Object;)Ljava/lang/Object;
   #493 = Utf8               setValue
   #494 = Fieldref           #495.#496    // ext/mods/gameserver/model/residence/castle/Siege$1.$SwitchMap$ext$mods$gameserver$enums$SiegeSide:[I
   #495 = Class              #497         // ext/mods/gameserver/model/residence/castle/Siege$1
   #496 = NameAndType        #498:#499    // $SwitchMap$ext$mods$gameserver$enums$SiegeSide:[I
   #497 = Utf8               ext/mods/gameserver/model/residence/castle/Siege$1
   #498 = Utf8               $SwitchMap$ext$mods$gameserver$enums$SiegeSide
   #499 = Utf8               [I
   #500 = Methodref          #56.#501     // ext/mods/gameserver/enums/SiegeSide.ordinal:()I
   #501 = NameAndType        #502:#44     // ordinal:()I
   #502 = Utf8               ordinal
   #503 = Fieldref           #56.#504     // ext/mods/gameserver/enums/SiegeSide.DEFENDER:Lext/mods/gameserver/enums/SiegeSide;
   #504 = NameAndType        #505:#60     // DEFENDER:Lext/mods/gameserver/enums/SiegeSide;
   #505 = Utf8               DEFENDER
   #506 = Fieldref           #56.#507     // ext/mods/gameserver/enums/SiegeSide.PENDING:Lext/mods/gameserver/enums/SiegeSide;
   #507 = NameAndType        #508:#60     // PENDING:Lext/mods/gameserver/enums/SiegeSide;
   #508 = Utf8               PENDING
   #509 = Methodref          #289.#510    // ext/mods/gameserver/model/pledge/Clan.getAllyId:()I
   #510 = NameAndType        #511:#44     // getAllyId:()I
   #511 = Utf8               getAllyId
   #512 = Fieldref           #158.#513    // ext/mods/gameserver/network/SystemMessageId.TEMPORARY_ALLIANCE_DISSOLVED:Lext/mods/gameserver/network/SystemMessageId;
   #513 = NameAndType        #514:#162    // TEMPORARY_ALLIANCE_DISSOLVED:Lext/mods/gameserver/network/SystemMessageId;
   #514 = Utf8               TEMPORARY_ALLIANCE_DISSOLVED
   #515 = Methodref          #11.#516     // ext/mods/gameserver/model/residence/castle/Siege.switchSides:(Lext/mods/gameserver/enums/SiegeSide;[Lext/mods/gameserver/enums/SiegeSide;)V
   #516 = NameAndType        #517:#518    // switchSides:(Lext/mods/gameserver/enums/SiegeSide;[Lext/mods/gameserver/enums/SiegeSide;)V
   #517 = Utf8               switchSides
   #518 = Utf8               (Lext/mods/gameserver/enums/SiegeSide;[Lext/mods/gameserver/enums/SiegeSide;)V
   #519 = Methodref          #11.#520     // ext/mods/gameserver/model/residence/castle/Siege.switchSide:(Lext/mods/gameserver/model/pledge/Clan;Lext/mods/gameserver/enums/SiegeSide;)V
   #520 = NameAndType        #521:#522    // switchSide:(Lext/mods/gameserver/model/pledge/Clan;Lext/mods/gameserver/enums/SiegeSide;)V
   #521 = Utf8               switchSide
   #522 = Utf8               (Lext/mods/gameserver/model/pledge/Clan;Lext/mods/gameserver/enums/SiegeSide;)V
   #523 = InterfaceMethodref #153.#330    // java/util/List.iterator:()Ljava/util/Iterator;
   #524 = Methodref          #40.#525     // ext/mods/gameserver/model/residence/castle/Castle.removeDoorUpgrade:()V
   #525 = NameAndType        #526:#6      // removeDoorUpgrade:()V
   #526 = Utf8               removeDoorUpgrade
   #527 = Methodref          #40.#528     // ext/mods/gameserver/model/residence/castle/Castle.removeTrapUpgrade:()V
   #528 = NameAndType        #529:#6      // removeTrapUpgrade:()V
   #529 = Utf8               removeTrapUpgrade
   #530 = InvokeDynamic      #9:#217      // #9:accept:()Ljava/util/function/Consumer;
   #531 = InvokeDynamic      #10:#532     // #10:accept:(Lext/mods/gameserver/network/serverpackets/SystemMessage;)Ljava/util/function/Consumer;
   #532 = NameAndType        #218:#533    // accept:(Lext/mods/gameserver/network/serverpackets/SystemMessage;)Ljava/util/function/Consumer;
   #533 = Utf8               (Lext/mods/gameserver/network/serverpackets/SystemMessage;)Ljava/util/function/Consumer;
   #534 = Methodref          #11.#535     // ext/mods/gameserver/model/residence/castle/Siege.getDefenderClans:()Ljava/util/List;
   #535 = NameAndType        #536:#30     // getDefenderClans:()Ljava/util/List;
   #536 = Utf8               getDefenderClans
   #537 = InvokeDynamic      #11:#532     // #11:accept:(Lext/mods/gameserver/network/serverpackets/SystemMessage;)Ljava/util/function/Consumer;
   #538 = Methodref          #11.#539     // ext/mods/gameserver/model/residence/castle/Siege.announce:(Lext/mods/gameserver/network/serverpackets/SystemMessage;[Lext/mods/gameserver/enums/SiegeSide;)V
   #539 = NameAndType        #248:#540    // announce:(Lext/mods/gameserver/network/serverpackets/SystemMessage;[Lext/mods/gameserver/enums/SiegeSide;)V
   #540 = Utf8               (Lext/mods/gameserver/network/serverpackets/SystemMessage;[Lext/mods/gameserver/enums/SiegeSide;)V
   #541 = Methodref          #303.#542    // ext/mods/gameserver/model/actor/Player.setSiegeState:(I)V
   #542 = NameAndType        #543:#206    // setSiegeState:(I)V
   #543 = Utf8               setSiegeState
   #544 = Class              #545         // ext/mods/gameserver/network/serverpackets/UserInfo
   #545 = Utf8               ext/mods/gameserver/network/serverpackets/UserInfo
   #546 = Methodref          #544.#547    // ext/mods/gameserver/network/serverpackets/UserInfo."<init>":(Lext/mods/gameserver/model/actor/Player;)V
   #547 = NameAndType        #5:#548      // "<init>":(Lext/mods/gameserver/model/actor/Player;)V
   #548 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
   #549 = Methodref          #303.#550    // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #550 = NameAndType        #551:#181    // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #551 = Utf8               sendPacket
   #552 = Methodref          #303.#553    // ext/mods/gameserver/model/actor/Player.broadcastRelationsChanges:()V
   #553 = NameAndType        #554:#6      // broadcastRelationsChanges:()V
   #554 = Utf8               broadcastRelationsChanges
   #555 = String             #556         // DELETE FROM siege_clans WHERE castle_id=?
   #556 = Utf8               DELETE FROM siege_clans WHERE castle_id=?
   #557 = InterfaceMethodref #85.#558     // java/sql/PreparedStatement.executeUpdate:()I
   #558 = NameAndType        #559:#44     // executeUpdate:()I
   #559 = Utf8               executeUpdate
   #560 = String             #561         // Couldn\'t clear siege registered clans.
   #561 = Utf8               Couldn\'t clear siege registered clans.
   #562 = InterfaceMethodref #62.#563     // java/util/Map.clear:()V
   #563 = NameAndType        #564:#6      // clear:()V
   #564 = Utf8               clear
   #565 = String             #566         // DELETE FROM siege_clans WHERE castle_id=? AND type=\'PENDING\'
   #566 = Utf8               DELETE FROM siege_clans WHERE castle_id=? AND type=\'PENDING\'
   #567 = String             #568         // Couldn\'t clear siege pending clans.
   #568 = Utf8               Couldn\'t clear siege pending clans.
   #569 = InvokeDynamic      #12:#417     // #12:test:()Ljava/util/function/Predicate;
   #570 = InterfaceMethodref #370.#571    // java/util/Set.removeIf:(Ljava/util/function/Predicate;)Z
   #571 = NameAndType        #572:#573    // removeIf:(Ljava/util/function/Predicate;)Z
   #572 = Utf8               removeIf
   #573 = Utf8               (Ljava/util/function/Predicate;)Z
   #574 = Methodref          #303.#575    // ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
   #575 = NameAndType        #53:#576     // getClan:()Lext/mods/gameserver/model/pledge/Clan;
   #576 = Utf8               ()Lext/mods/gameserver/model/pledge/Clan;
   #577 = Fieldref           #158.#578    // ext/mods/gameserver/network/SystemMessageId.CANNOT_ATTACK_ALLIANCE_CASTLE:Lext/mods/gameserver/network/SystemMessageId;
   #578 = NameAndType        #579:#162    // CANNOT_ATTACK_ALLIANCE_CASTLE:Lext/mods/gameserver/network/SystemMessageId;
   #579 = Utf8               CANNOT_ATTACK_ALLIANCE_CASTLE
   #580 = Methodref          #303.#581    // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #581 = NameAndType        #551:#582    // sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #582 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
   #583 = Methodref          #11.#584     // ext/mods/gameserver/model/residence/castle/Siege.allyIsRegisteredOnOppositeSide:(Lext/mods/gameserver/model/pledge/Clan;Z)Z
   #584 = NameAndType        #585:#586    // allyIsRegisteredOnOppositeSide:(Lext/mods/gameserver/model/pledge/Clan;Z)Z
   #585 = Utf8               allyIsRegisteredOnOppositeSide
   #586 = Utf8               (Lext/mods/gameserver/model/pledge/Clan;Z)Z
   #587 = Fieldref           #158.#588    // ext/mods/gameserver/network/SystemMessageId.CANT_ACCEPT_ALLY_ENEMY_FOR_SIEGE:Lext/mods/gameserver/network/SystemMessageId;
   #588 = NameAndType        #589:#162    // CANT_ACCEPT_ALLY_ENEMY_FOR_SIEGE:Lext/mods/gameserver/network/SystemMessageId;
   #589 = Utf8               CANT_ACCEPT_ALLY_ENEMY_FOR_SIEGE
   #590 = Methodref          #11.#591     // ext/mods/gameserver/model/residence/castle/Siege.checkIfCanRegister:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/enums/SiegeSide;)Z
   #591 = NameAndType        #592:#593    // checkIfCanRegister:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/enums/SiegeSide;)Z
   #592 = Utf8               checkIfCanRegister
   #593 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/enums/SiegeSide;)Z
   #594 = Methodref          #11.#595     // ext/mods/gameserver/model/residence/castle/Siege.registerClan:(Lext/mods/gameserver/model/pledge/Clan;Lext/mods/gameserver/enums/SiegeSide;)V
   #595 = NameAndType        #596:#522    // registerClan:(Lext/mods/gameserver/model/pledge/Clan;Lext/mods/gameserver/enums/SiegeSide;)V
   #596 = Utf8               registerClan
   #597 = Methodref          #272.#598    // ext/mods/extensions/listener/manager/SiegeListenerManager.notifyRegisterAttacker:(Lext/mods/gameserver/model/residence/castle/Siege;Lext/mods/gameserver/model/actor/Player;)V
   #598 = NameAndType        #599:#600    // notifyRegisterAttacker:(Lext/mods/gameserver/model/residence/castle/Siege;Lext/mods/gameserver/model/actor/Player;)V
   #599 = Utf8               notifyRegisterAttacker
   #600 = Utf8               (Lext/mods/gameserver/model/residence/castle/Siege;Lext/mods/gameserver/model/actor/Player;)V
   #601 = Fieldref           #158.#602    // ext/mods/gameserver/network/SystemMessageId.DEFENDER_SIDE_FULL:Lext/mods/gameserver/network/SystemMessageId;
   #602 = NameAndType        #603:#162    // DEFENDER_SIDE_FULL:Lext/mods/gameserver/network/SystemMessageId;
   #603 = Utf8               DEFENDER_SIDE_FULL
   #604 = Methodref          #272.#605    // ext/mods/extensions/listener/manager/SiegeListenerManager.notifyRegisterDefender:(Lext/mods/gameserver/model/residence/castle/Siege;Lext/mods/gameserver/model/actor/Player;)V
   #605 = NameAndType        #606:#600    // notifyRegisterDefender:(Lext/mods/gameserver/model/residence/castle/Siege;Lext/mods/gameserver/model/actor/Player;)V
   #606 = Utf8               notifyRegisterDefender
   #607 = Methodref          #46.#608     // ext/mods/gameserver/data/sql/ClanTable.getClans:()Ljava/util/Collection;
   #608 = NameAndType        #609:#327    // getClans:()Ljava/util/Collection;
   #609 = Utf8               getClans
   #610 = Methodref          #11.#611     // ext/mods/gameserver/model/residence/castle/Siege.checkSides:(Lext/mods/gameserver/model/pledge/Clan;[Lext/mods/gameserver/enums/SiegeSide;)Z
   #611 = NameAndType        #612:#613    // checkSides:(Lext/mods/gameserver/model/pledge/Clan;[Lext/mods/gameserver/enums/SiegeSide;)Z
   #612 = Utf8               checkSides
   #613 = Utf8               (Lext/mods/gameserver/model/pledge/Clan;[Lext/mods/gameserver/enums/SiegeSide;)Z
   #614 = Methodref          #289.#615    // ext/mods/gameserver/model/pledge/Clan.getCastleId:()I
   #615 = NameAndType        #616:#44     // getCastleId:()I
   #616 = Utf8               getCastleId
   #617 = InterfaceMethodref #62.#618     // java/util/Map.remove:(Ljava/lang/Object;)Ljava/lang/Object;
   #618 = NameAndType        #619:#441    // remove:(Ljava/lang/Object;)Ljava/lang/Object;
   #619 = Utf8               remove
   #620 = String             #621         // DELETE FROM siege_clans WHERE castle_id=? AND clan_id=?
   #621 = Utf8               DELETE FROM siege_clans WHERE castle_id=? AND clan_id=?
   #622 = String             #623         // Couldn\'t unregister clan on siege.
   #623 = Utf8               Couldn\'t unregister clan on siege.
   #624 = Methodref          #251.#625    // java/util/Calendar.getTimeInMillis:()J
   #625 = NameAndType        #626:#627    // getTimeInMillis:()J
   #626 = Utf8               getTimeInMillis
   #627 = Utf8               ()J
   #628 = Fieldref           #11.#629     // ext/mods/gameserver/model/residence/castle/Siege._siegeTask:Ljava/util/concurrent/ScheduledFuture;
   #629 = NameAndType        #630:#631    // _siegeTask:Ljava/util/concurrent/ScheduledFuture;
   #630 = Utf8               _siegeTask
   #631 = Utf8               Ljava/util/concurrent/ScheduledFuture;
   #632 = InterfaceMethodref #633.#634    // java/util/concurrent/ScheduledFuture.cancel:(Z)Z
   #633 = Class              #635         // java/util/concurrent/ScheduledFuture
   #634 = NameAndType        #636:#637    // cancel:(Z)Z
   #635 = Utf8               java/util/concurrent/ScheduledFuture
   #636 = Utf8               cancel
   #637 = Utf8               (Z)Z
   #638 = InvokeDynamic      #13:#639     // #13:run:(Lext/mods/gameserver/model/residence/castle/Siege;)Ljava/lang/Runnable;
   #639 = NameAndType        #640:#641    // run:(Lext/mods/gameserver/model/residence/castle/Siege;)Ljava/lang/Runnable;
   #640 = Utf8               run
   #641 = Utf8               (Lext/mods/gameserver/model/residence/castle/Siege;)Ljava/lang/Runnable;
   #642 = Long               1000l
   #644 = Methodref          #645.#646    // ext/mods/commons/pool/ThreadPool.schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
   #645 = Class              #647         // ext/mods/commons/pool/ThreadPool
   #646 = NameAndType        #648:#649    // schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
   #647 = Utf8               ext/mods/commons/pool/ThreadPool
   #648 = Utf8               schedule
   #649 = Utf8               (Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
   #650 = Methodref          #11.#651     // ext/mods/gameserver/model/residence/castle/Siege.isRegistrationOver:()Z
   #651 = NameAndType        #652:#99     // isRegistrationOver:()Z
   #652 = Utf8               isRegistrationOver
   #653 = Fieldref           #158.#654    // ext/mods/gameserver/network/SystemMessageId.DEADLINE_FOR_SIEGE_S1_PASSED:Lext/mods/gameserver/network/SystemMessageId;
   #654 = NameAndType        #655:#162    // DEADLINE_FOR_SIEGE_S1_PASSED:Lext/mods/gameserver/network/SystemMessageId;
   #655 = Utf8               DEADLINE_FOR_SIEGE_S1_PASSED
   #656 = Fieldref           #158.#657    // ext/mods/gameserver/network/SystemMessageId.NOT_SIEGE_REGISTRATION_TIME2:Lext/mods/gameserver/network/SystemMessageId;
   #657 = NameAndType        #658:#162    // NOT_SIEGE_REGISTRATION_TIME2:Lext/mods/gameserver/network/SystemMessageId;
   #658 = Utf8               NOT_SIEGE_REGISTRATION_TIME2
   #659 = Methodref          #289.#660    // ext/mods/gameserver/model/pledge/Clan.getLevel:()I
   #660 = NameAndType        #661:#44     // getLevel:()I
   #661 = Utf8               getLevel
   #662 = Fieldref           #260.#663    // ext/mods/Config.MINIMUM_CLAN_LEVEL:I
   #663 = NameAndType        #664:#264    // MINIMUM_CLAN_LEVEL:I
   #664 = Utf8               MINIMUM_CLAN_LEVEL
   #665 = Fieldref           #158.#666    // ext/mods/gameserver/network/SystemMessageId.ONLY_CLAN_LEVEL_4_ABOVE_MAY_SIEGE:Lext/mods/gameserver/network/SystemMessageId;
   #666 = NameAndType        #667:#162    // ONLY_CLAN_LEVEL_4_ABOVE_MAY_SIEGE:Lext/mods/gameserver/network/SystemMessageId;
   #667 = Utf8               ONLY_CLAN_LEVEL_4_ABOVE_MAY_SIEGE
   #668 = Methodref          #289.#669    // ext/mods/gameserver/model/pledge/Clan.hasCastle:()Z
   #669 = NameAndType        #670:#99     // hasCastle:()Z
   #670 = Utf8               hasCastle
   #671 = Fieldref           #158.#672    // ext/mods/gameserver/network/SystemMessageId.CLAN_THAT_OWNS_CASTLE_IS_AUTOMATICALLY_REGISTERED_DEFENDING:Lext/mods/gameserver/network/SystemMessageId;
   #672 = NameAndType        #673:#162    // CLAN_THAT_OWNS_CASTLE_IS_AUTOMATICALLY_REGISTERED_DEFENDING:Lext/mods/gameserver/network/SystemMessageId;
   #673 = Utf8               CLAN_THAT_OWNS_CASTLE_IS_AUTOMATICALLY_REGISTERED_DEFENDING
   #674 = Fieldref           #158.#675    // ext/mods/gameserver/network/SystemMessageId.CLAN_THAT_OWNS_CASTLE_CANNOT_PARTICIPATE_OTHER_SIEGE:Lext/mods/gameserver/network/SystemMessageId;
   #675 = NameAndType        #676:#162    // CLAN_THAT_OWNS_CASTLE_CANNOT_PARTICIPATE_OTHER_SIEGE:Lext/mods/gameserver/network/SystemMessageId;
   #676 = Utf8               CLAN_THAT_OWNS_CASTLE_CANNOT_PARTICIPATE_OTHER_SIEGE
   #677 = Methodref          #289.#678    // ext/mods/gameserver/model/pledge/Clan.isRegisteredOnSiege:()Z
   #678 = NameAndType        #679:#99     // isRegisteredOnSiege:()Z
   #679 = Utf8               isRegisteredOnSiege
   #680 = Fieldref           #158.#681    // ext/mods/gameserver/network/SystemMessageId.ALREADY_REQUESTED_SIEGE_BATTLE:Lext/mods/gameserver/network/SystemMessageId;
   #681 = NameAndType        #682:#162    // ALREADY_REQUESTED_SIEGE_BATTLE:Lext/mods/gameserver/network/SystemMessageId;
   #682 = Utf8               ALREADY_REQUESTED_SIEGE_BATTLE
   #683 = Methodref          #11.#684     // ext/mods/gameserver/model/residence/castle/Siege.checkIfAlreadyRegisteredForSameDay:(Lext/mods/gameserver/model/pledge/Clan;)Z
   #684 = NameAndType        #685:#686    // checkIfAlreadyRegisteredForSameDay:(Lext/mods/gameserver/model/pledge/Clan;)Z
   #685 = Utf8               checkIfAlreadyRegisteredForSameDay
   #686 = Utf8               (Lext/mods/gameserver/model/pledge/Clan;)Z
   #687 = Fieldref           #158.#688    // ext/mods/gameserver/network/SystemMessageId.APPLICATION_DENIED_BECAUSE_ALREADY_SUBMITTED_A_REQUEST_FOR_ANOTHER_SIEGE_BATTLE:Lext/mods/gameserver/network/SystemMessageId;
   #688 = NameAndType        #689:#162    // APPLICATION_DENIED_BECAUSE_ALREADY_SUBMITTED_A_REQUEST_FOR_ANOTHER_SIEGE_BATTLE:Lext/mods/gameserver/network/SystemMessageId;
   #689 = Utf8               APPLICATION_DENIED_BECAUSE_ALREADY_SUBMITTED_A_REQUEST_FOR_ANOTHER_SIEGE_BATTLE
   #690 = InterfaceMethodref #153.#691    // java/util/List.size:()I
   #691 = NameAndType        #692:#44     // size:()I
   #692 = Utf8               size
   #693 = Fieldref           #260.#694    // ext/mods/Config.MAX_ATTACKERS_NUMBER:I
   #694 = NameAndType        #695:#264    // MAX_ATTACKERS_NUMBER:I
   #695 = Utf8               MAX_ATTACKERS_NUMBER
   #696 = Fieldref           #158.#697    // ext/mods/gameserver/network/SystemMessageId.ATTACKER_SIDE_FULL:Lext/mods/gameserver/network/SystemMessageId;
   #697 = NameAndType        #698:#162    // ATTACKER_SIDE_FULL:Lext/mods/gameserver/network/SystemMessageId;
   #698 = Utf8               ATTACKER_SIDE_FULL
   #699 = Methodref          #11.#700     // ext/mods/gameserver/model/residence/castle/Siege.getPendingClans:()Ljava/util/List;
   #700 = NameAndType        #701:#30     // getPendingClans:()Ljava/util/List;
   #701 = Utf8               getPendingClans
   #702 = Fieldref           #260.#703    // ext/mods/Config.MAX_DEFENDERS_NUMBER:I
   #703 = NameAndType        #704:#264    // MAX_DEFENDERS_NUMBER:I
   #704 = Utf8               MAX_DEFENDERS_NUMBER
   #705 = Methodref          #706.#707    // ext/mods/gameserver/data/manager/CastleManager.getInstance:()Lext/mods/gameserver/data/manager/CastleManager;
   #706 = Class              #708         // ext/mods/gameserver/data/manager/CastleManager
   #707 = NameAndType        #49:#709     // getInstance:()Lext/mods/gameserver/data/manager/CastleManager;
   #708 = Utf8               ext/mods/gameserver/data/manager/CastleManager
   #709 = Utf8               ()Lext/mods/gameserver/data/manager/CastleManager;
   #710 = Methodref          #706.#711    // ext/mods/gameserver/data/manager/CastleManager.getCastles:()Ljava/util/Collection;
   #711 = NameAndType        #712:#327    // getCastles:()Ljava/util/Collection;
   #712 = Utf8               getCastles
   #713 = Methodref          #40.#714     // ext/mods/gameserver/model/residence/castle/Castle.getSiege:()Lext/mods/gameserver/model/residence/castle/Siege;
   #714 = NameAndType        #715:#716    // getSiege:()Lext/mods/gameserver/model/residence/castle/Siege;
   #715 = Utf8               getSiege
   #716 = Utf8               ()Lext/mods/gameserver/model/residence/castle/Siege;
   #717 = Methodref          #11.#461     // ext/mods/gameserver/model/residence/castle/Siege.getSiegeDate:()Ljava/util/Calendar;
   #718 = Methodref          #251.#719    // java/util/Calendar.get:(I)I
   #719 = NameAndType        #440:#720    // get:(I)I
   #720 = Utf8               (I)I
   #721 = Methodref          #11.#722     // ext/mods/gameserver/model/residence/castle/Siege.checkSides:(Lext/mods/gameserver/model/pledge/Clan;)Z
   #722 = NameAndType        #612:#686    // checkSides:(Lext/mods/gameserver/model/pledge/Clan;)Z
   #723 = Methodref          #40.#724     // ext/mods/gameserver/model/residence/castle/Castle.getSieges:()Ljava/util/Map;
   #724 = NameAndType        #725:#310    // getSieges:()Ljava/util/Map;
   #725 = Utf8               getSieges
   #726 = InterfaceMethodref #62.#691     // java/util/Map.size:()I
   #727 = Methodref          #11.#728     // ext/mods/gameserver/model/residence/castle/Siege.customSetNextSiegeData:()V
   #728 = NameAndType        #729:#6      // customSetNextSiegeData:()V
   #729 = Utf8               customSetNextSiegeData
   #730 = Methodref          #11.#731     // ext/mods/gameserver/model/residence/castle/Siege.setNextSiegeDate:()V
   #731 = NameAndType        #732:#6      // setNextSiegeDate:()V
   #732 = Utf8               setNextSiegeDate
   #733 = Methodref          #40.#734     // ext/mods/gameserver/model/residence/castle/Castle.setTimeRegistrationOver:(Z)V
   #734 = NameAndType        #735:#185    // setTimeRegistrationOver:(Z)V
   #735 = Utf8               setTimeRegistrationOver
   #736 = Methodref          #11.#737     // ext/mods/gameserver/model/residence/castle/Siege.saveSiegeDate:()V
   #737 = NameAndType        #738:#6      // saveSiegeDate:()V
   #738 = Utf8               saveSiegeDate
   #739 = String             #740         // New date for {} siege: {}.
   #740 = Utf8               New date for {} siege: {}.
   #741 = Methodref          #40.#290     // ext/mods/gameserver/model/residence/castle/Castle.getName:()Ljava/lang/String;
   #742 = Methodref          #251.#743    // java/util/Calendar.getTime:()Ljava/util/Date;
   #743 = NameAndType        #744:#745    // getTime:()Ljava/util/Date;
   #744 = Utf8               getTime
   #745 = Utf8               ()Ljava/util/Date;
   #746 = Methodref          #138.#747    // ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
   #747 = NameAndType        #748:#749    // info:(Ljava/lang/Object;[Ljava/lang/Object;)V
   #748 = Utf8               info
   #749 = Utf8               (Ljava/lang/Object;[Ljava/lang/Object;)V
   #750 = String             #751         // UPDATE castle SET siegeDate=?, regTimeOver=? WHERE id=?
   #751 = Utf8               UPDATE castle SET siegeDate=?, regTimeOver=? WHERE id=?
   #752 = InterfaceMethodref #85.#753     // java/sql/PreparedStatement.setLong:(IJ)V
   #753 = NameAndType        #754:#755    // setLong:(IJ)V
   #754 = Utf8               setLong
   #755 = Utf8               (IJ)V
   #756 = Methodref          #11.#757     // ext/mods/gameserver/model/residence/castle/Siege.isTimeRegistrationOver:()Z
   #757 = NameAndType        #758:#99     // isTimeRegistrationOver:()Z
   #758 = Utf8               isTimeRegistrationOver
   #759 = Methodref          #760.#761    // java/lang/String.valueOf:(Z)Ljava/lang/String;
   #760 = Class              #762         // java/lang/String
   #761 = NameAndType        #116:#763    // valueOf:(Z)Ljava/lang/String;
   #762 = Utf8               java/lang/String
   #763 = Utf8               (Z)Ljava/lang/String;
   #764 = InterfaceMethodref #85.#765     // java/sql/PreparedStatement.setString:(ILjava/lang/String;)V
   #765 = NameAndType        #766:#767    // setString:(ILjava/lang/String;)V
   #766 = Utf8               setString
   #767 = Utf8               (ILjava/lang/String;)V
   #768 = String             #769         // Couldn\'t save siege date.
   #769 = Utf8               Couldn\'t save siege date.
   #770 = String             #771         // INSERT INTO siege_clans (clan_id,castle_id,type) VALUES (?,?,?) ON DUPLICATE KEY UPDATE type=VALUES(type)
   #771 = Utf8               INSERT INTO siege_clans (clan_id,castle_id,type) VALUES (?,?,?) ON DUPLICATE KEY UPDATE type=VALUES(type)
   #772 = Methodref          #56.#773     // ext/mods/gameserver/enums/SiegeSide.toString:()Ljava/lang/String;
   #773 = NameAndType        #774:#293    // toString:()Ljava/lang/String;
   #774 = Utf8               toString
   #775 = String             #776         // Couldn\'t register clan on siege.
   #776 = Utf8               Couldn\'t register clan on siege.
   #777 = Methodref          #778.#779    // java/lang/System.currentTimeMillis:()J
   #778 = Class              #780         // java/lang/System
   #779 = NameAndType        #781:#627    // currentTimeMillis:()J
   #780 = Utf8               java/lang/System
   #781 = Utf8               currentTimeMillis
   #782 = Methodref          #251.#783    // java/util/Calendar.setTimeInMillis:(J)V
   #783 = NameAndType        #784:#785    // setTimeInMillis:(J)V
   #784 = Utf8               setTimeInMillis
   #785 = Utf8               (J)V
   #786 = Methodref          #251.#787    // java/util/Calendar.set:(II)V
   #787 = NameAndType        #788:#89     // set:(II)V
   #788 = Utf8               set
   #789 = Fieldref           #158.#790    // ext/mods/gameserver/network/SystemMessageId.S1_ANNOUNCED_SIEGE_TIME:Lext/mods/gameserver/network/SystemMessageId;
   #790 = NameAndType        #791:#162    // S1_ANNOUNCED_SIEGE_TIME:Lext/mods/gameserver/network/SystemMessageId;
   #791 = Utf8               S1_ANNOUNCED_SIEGE_TIME
   #792 = InterfaceMethodref #486.#793    // java/util/Map$Entry.getKey:()Ljava/lang/Object;
   #793 = NameAndType        #794:#341    // getKey:()Ljava/lang/Object;
   #794 = Utf8               getKey
   #795 = Class              #796         // java/lang/Integer
   #796 = Utf8               java/lang/Integer
   #797 = Class              #798         // ext/mods/gameserver/model/records/custom/SiegeInfo
   #798 = Utf8               ext/mods/gameserver/model/records/custom/SiegeInfo
   #799 = Methodref          #797.#800    // ext/mods/gameserver/model/records/custom/SiegeInfo.day:()I
   #800 = NameAndType        #801:#44     // day:()I
   #801 = Utf8               day
   #802 = Methodref          #795.#803    // java/lang/Integer.intValue:()I
   #803 = NameAndType        #804:#44     // intValue:()I
   #804 = Utf8               intValue
   #805 = Methodref          #797.#806    // ext/mods/gameserver/model/records/custom/SiegeInfo.hour:()I
   #806 = NameAndType        #807:#44     // hour:()I
   #807 = Utf8               hour
   #808 = Methodref          #797.#809    // ext/mods/gameserver/model/records/custom/SiegeInfo.minute:()I
   #809 = NameAndType        #810:#44     // minute:()I
   #810 = Utf8               minute
   #811 = Methodref          #40.#757     // ext/mods/gameserver/model/residence/castle/Castle.isTimeRegistrationOver:()Z
   #812 = Long               86400000l
   #814 = Class              #815         // java/util/ArrayList
   #815 = Utf8               java/util/ArrayList
   #816 = Methodref          #814.#817    // java/util/ArrayList."<init>":(I)V
   #817 = NameAndType        #5:#206      // "<init>":(I)V
   #818 = InterfaceMethodref #153.#819    // java/util/List.add:(Ljava/lang/Object;)Z
   #819 = NameAndType        #267:#451    // add:(Ljava/lang/Object;)Z
   #820 = Fieldref           #495.#821    // ext/mods/gameserver/model/residence/castle/Siege$1.$SwitchMap$ext$mods$gameserver$enums$SiegeStatus:[I
   #821 = NameAndType        #822:#499    // $SwitchMap$ext$mods$gameserver$enums$SiegeStatus:[I
   #822 = Utf8               $SwitchMap$ext$mods$gameserver$enums$SiegeStatus
   #823 = Methodref          #17.#501     // ext/mods/gameserver/enums/SiegeStatus.ordinal:()I
   #824 = Methodref          #303.#825    // ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
   #825 = NameAndType        #826:#827    // getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
   #826 = Utf8               getSysString
   #827 = Utf8               (I[Ljava/lang/Object;)Ljava/lang/String;
   #828 = Class              #829         // ext/mods/gameserver/model/spawn/NpcMaker
   #829 = Utf8               ext/mods/gameserver/model/spawn/NpcMaker
   #830 = Methodref          #828.#831    // ext/mods/gameserver/model/spawn/NpcMaker.getMaker:()Lext/mods/gameserver/scripting/SpawnMaker;
   #831 = NameAndType        #832:#833    // getMaker:()Lext/mods/gameserver/scripting/SpawnMaker;
   #832 = Utf8               getMaker
   #833 = Utf8               ()Lext/mods/gameserver/scripting/SpawnMaker;
   #834 = Methodref          #835.#836    // ext/mods/gameserver/scripting/SpawnMaker.onSiegeEvent:(Lext/mods/gameserver/model/residence/castle/Siege;Lext/mods/gameserver/model/spawn/NpcMaker;)V
   #835 = Class              #837         // ext/mods/gameserver/scripting/SpawnMaker
   #836 = NameAndType        #838:#839    // onSiegeEvent:(Lext/mods/gameserver/model/residence/castle/Siege;Lext/mods/gameserver/model/spawn/NpcMaker;)V
   #837 = Utf8               ext/mods/gameserver/scripting/SpawnMaker
   #838 = Utf8               onSiegeEvent
   #839 = Utf8               (Lext/mods/gameserver/model/residence/castle/Siege;Lext/mods/gameserver/model/spawn/NpcMaker;)V
   #840 = Methodref          #11.#841     // ext/mods/gameserver/model/residence/castle/Siege.getSiegeRegistrationEndDate:()J
   #841 = NameAndType        #842:#627    // getSiegeRegistrationEndDate:()J
   #842 = Utf8               getSiegeRegistrationEndDate
   #843 = Methodref          #11.#844     // ext/mods/gameserver/model/residence/castle/Siege.endTimeRegistration:(Z)V
   #844 = NameAndType        #845:#185    // endTimeRegistration:(Z)V
   #845 = Utf8               endTimeRegistration
   #846 = Long               13600000l
   #848 = Fieldref           #158.#849    // ext/mods/gameserver/network/SystemMessageId.REGISTRATION_TERM_FOR_S1_ENDED:Lext/mods/gameserver/network/SystemMessageId;
   #849 = NameAndType        #850:#162    // REGISTRATION_TERM_FOR_S1_ENDED:Lext/mods/gameserver/network/SystemMessageId;
   #850 = Utf8               REGISTRATION_TERM_FOR_S1_ENDED
   #851 = Fieldref           #17.#852     // ext/mods/gameserver/enums/SiegeStatus.REGISTRATION_OVER:Lext/mods/gameserver/enums/SiegeStatus;
   #852 = NameAndType        #853:#21     // REGISTRATION_OVER:Lext/mods/gameserver/enums/SiegeStatus;
   #853 = Utf8               REGISTRATION_OVER
   #854 = Methodref          #11.#855     // ext/mods/gameserver/model/residence/castle/Siege.clearPendingClans:()V
   #855 = NameAndType        #856:#6      // clearPendingClans:()V
   #856 = Utf8               clearPendingClans
   #857 = Long               600000l
   #859 = Long               300000l
   #861 = Long               10000l
   #863 = Methodref          #11.#864     // ext/mods/gameserver/model/residence/castle/Siege.startSiege:()V
   #864 = NameAndType        #865:#6      // startSiege:()V
   #865 = Utf8               startSiege
   #866 = Long               3600000l
   #868 = InvokeDynamic      #14:#639     // #14:run:(Lext/mods/gameserver/model/residence/castle/Siege;)Ljava/lang/Runnable;
   #869 = Long               1800000l
   #871 = Fieldref           #158.#872    // ext/mods/gameserver/network/SystemMessageId.S1_HOURS_UNTIL_SIEGE_CONCLUSION:Lext/mods/gameserver/network/SystemMessageId;
   #872 = NameAndType        #873:#162    // S1_HOURS_UNTIL_SIEGE_CONCLUSION:Lext/mods/gameserver/network/SystemMessageId;
   #873 = Utf8               S1_HOURS_UNTIL_SIEGE_CONCLUSION
   #874 = Fieldref           #158.#875    // ext/mods/gameserver/network/SystemMessageId.S1_MINUTES_UNTIL_SIEGE_CONCLUSION:Lext/mods/gameserver/network/SystemMessageId;
   #875 = NameAndType        #876:#162    // S1_MINUTES_UNTIL_SIEGE_CONCLUSION:Lext/mods/gameserver/network/SystemMessageId;
   #876 = Utf8               S1_MINUTES_UNTIL_SIEGE_CONCLUSION
   #877 = Long               60000l
   #879 = Long               9000l
   #881 = Fieldref           #158.#882    // ext/mods/gameserver/network/SystemMessageId.CASTLE_SIEGE_S1_SECONDS_LEFT:Lext/mods/gameserver/network/SystemMessageId;
   #882 = NameAndType        #883:#162    // CASTLE_SIEGE_S1_SECONDS_LEFT:Lext/mods/gameserver/network/SystemMessageId;
   #883 = Utf8               CASTLE_SIEGE_S1_SECONDS_LEFT
   #884 = Long               8000l
   #886 = Long               7000l
   #888 = Long               6000l
   #890 = Long               5000l
   #892 = Long               4000l
   #894 = Long               3000l
   #896 = Long               2000l
   #898 = Methodref          #11.#899     // ext/mods/gameserver/model/residence/castle/Siege.endSiege:()V
   #899 = NameAndType        #900:#6      // endSiege:()V
   #900 = Utf8               endSiege
   #901 = Methodref          #303.#902    // ext/mods/gameserver/model/actor/Player.removeSkill:(IZ)Lext/mods/gameserver/skills/L2Skill;
   #902 = NameAndType        #903:#904    // removeSkill:(IZ)Lext/mods/gameserver/skills/L2Skill;
   #903 = Utf8               removeSkill
   #904 = Utf8               (IZ)Lext/mods/gameserver/skills/L2Skill;
   #905 = Methodref          #906.#907    // ext/mods/gameserver/data/SkillTable.getInstance:()Lext/mods/gameserver/data/SkillTable;
   #906 = Class              #908         // ext/mods/gameserver/data/SkillTable
   #907 = NameAndType        #49:#909     // getInstance:()Lext/mods/gameserver/data/SkillTable;
   #908 = Utf8               ext/mods/gameserver/data/SkillTable
   #909 = Utf8               ()Lext/mods/gameserver/data/SkillTable;
   #910 = Methodref          #906.#911    // ext/mods/gameserver/data/SkillTable.getInfo:(II)Lext/mods/gameserver/skills/L2Skill;
   #911 = NameAndType        #912:#913    // getInfo:(II)Lext/mods/gameserver/skills/L2Skill;
   #912 = Utf8               getInfo
   #913 = Utf8               (II)Lext/mods/gameserver/skills/L2Skill;
   #914 = Methodref          #303.#915    // ext/mods/gameserver/model/actor/Player.addSkill:(Lext/mods/gameserver/skills/L2Skill;Z)Z
   #915 = NameAndType        #916:#917    // addSkill:(Lext/mods/gameserver/skills/L2Skill;Z)Z
   #916 = Utf8               addSkill
   #917 = Utf8               (Lext/mods/gameserver/skills/L2Skill;Z)Z
   #918 = Methodref          #919.#920    // ext/mods/gameserver/model/pledge/ItemInfo.getCount:()I
   #919 = Class              #921         // ext/mods/gameserver/model/pledge/ItemInfo
   #920 = NameAndType        #922:#44     // getCount:()I
   #921 = Utf8               ext/mods/gameserver/model/pledge/ItemInfo
   #922 = Utf8               getCount
   #923 = Methodref          #303.#924    // ext/mods/gameserver/model/actor/Player.addItem:(IIZ)Lext/mods/gameserver/model/item/instance/ItemInstance;
   #924 = NameAndType        #925:#926    // addItem:(IIZ)Lext/mods/gameserver/model/item/instance/ItemInstance;
   #925 = Utf8               addItem
   #926 = Utf8               (IIZ)Lext/mods/gameserver/model/item/instance/ItemInstance;
   #927 = Methodref          #919.#928    // ext/mods/gameserver/model/pledge/ItemInfo.getEnchant:()I
   #928 = NameAndType        #929:#44     // getEnchant:()I
   #929 = Utf8               getEnchant
   #930 = Methodref          #931.#932    // ext/mods/gameserver/model/item/instance/ItemInstance.setEnchantLevel:(ILext/mods/gameserver/model/actor/Playable;)V
   #931 = Class              #933         // ext/mods/gameserver/model/item/instance/ItemInstance
   #932 = NameAndType        #934:#935    // setEnchantLevel:(ILext/mods/gameserver/model/actor/Playable;)V
   #933 = Utf8               ext/mods/gameserver/model/item/instance/ItemInstance
   #934 = Utf8               setEnchantLevel
   #935 = Utf8               (ILext/mods/gameserver/model/actor/Playable;)V
   #936 = Methodref          #937.#290    // java/lang/Class.getName:()Ljava/lang/String;
   #937 = Class              #938         // java/lang/Class
   #938 = Utf8               java/lang/Class
   #939 = Methodref          #138.#238    // ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
   #940 = Class              #941         // ext/mods/gameserver/model/residence/Siegable
   #941 = Utf8               ext/mods/gameserver/model/residence/Siegable
   #942 = Utf8               LOAD_SIEGE_CLAN
   #943 = Utf8               Ljava/lang/String;
   #944 = Utf8               ConstantValue
   #945 = Utf8               CLEAR_SIEGE_CLANS
   #946 = Utf8               CLEAR_PENDING_CLANS
   #947 = Utf8               CLEAR_SIEGE_CLAN
   #948 = Utf8               UPDATE_SIEGE_INFOS
   #949 = Utf8               ADD_OR_UPDATE_SIEGE_CLAN
   #950 = Utf8               Signature
   #951 = Utf8               Ljava/util/Map<Lext/mods/gameserver/model/pledge/Clan;Lext/mods/gameserver/enums/SiegeSide;>;
   #952 = Utf8               Ljava/util/concurrent/ScheduledFuture<*>;
   #953 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/spawn/NpcMaker;>;
   #954 = Utf8               (Lext/mods/gameserver/model/residence/castle/Castle;)V
   #955 = Utf8               Code
   #956 = Utf8               LineNumberTable
   #957 = Utf8               LocalVariableTable
   #958 = Utf8               clan
   #959 = Utf8               rs
   #960 = Utf8               Ljava/sql/ResultSet;
   #961 = Utf8               ps
   #962 = Utf8               Ljava/sql/PreparedStatement;
   #963 = Utf8               con
   #964 = Utf8               Ljava/sql/Connection;
   #965 = Utf8               e
   #966 = Utf8               Ljava/lang/Exception;
   #967 = Utf8               this
   #968 = Utf8               Lext/mods/gameserver/model/residence/castle/Siege;
   #969 = Utf8               castle
   #970 = Utf8               StackMapTable
   #971 = Utf8               sm
   #972 = Utf8               Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #973 = Utf8               item
   #974 = Utf8               player
   #975 = Utf8               Lext/mods/gameserver/model/actor/Player;
   #976 = Utf8               member
   #977 = Utf8               Lext/mods/gameserver/model/pledge/ClanMember;
   #978 = Utf8               skill
   #979 = Utf8               formerOwner
   #980 = Utf8               owner
   #981 = Utf8               LocalVariableTypeTable
   #982 = Utf8               Ljava/util/Map<Ljava/lang/Integer;Lext/mods/gameserver/model/pledge/ItemInfo;>;
   #983 = Utf8               Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Integer;>;
   #984 = Class              #985         // "[Lext/mods/gameserver/model/actor/Player;"
   #985 = Utf8               [Lext/mods/gameserver/model/actor/Player;
   #986 = Utf8               ()Ljava/util/List<Lext/mods/gameserver/model/pledge/Clan;>;
   #987 = Utf8               types
   #988 = Utf8               [Lext/mods/gameserver/enums/SiegeSide;
   #989 = Utf8               (Lext/mods/gameserver/model/pledge/Clan;)Lext/mods/gameserver/model/actor/Npc;
   #990 = Class              #991         // ext/mods/gameserver/model/actor/Npc
   #991 = Utf8               ext/mods/gameserver/model/actor/Npc
   #992 = Utf8               getRegisteredClans
   #993 = Utf8               ()Ljava/util/Map<Lext/mods/gameserver/model/pledge/Clan;Lext/mods/gameserver/enums/SiegeSide;>;
   #994 = Utf8               newState
   #995 = Utf8               entry
   #996 = Utf8               Ljava/util/Map$Entry;
   #997 = Utf8               previousStates
   #998 = Utf8               Ljava/util/Map$Entry<Lext/mods/gameserver/model/pledge/Clan;Lext/mods/gameserver/enums/SiegeSide;>;
   #999 = Utf8               getSide
  #1000 = Utf8               (Lext/mods/gameserver/model/pledge/Clan;)Lext/mods/gameserver/enums/SiegeSide;
  #1001 = Utf8               isOnOppositeSide
  #1002 = Utf8               (Lext/mods/gameserver/model/pledge/Clan;Lext/mods/gameserver/model/pledge/Clan;)Z
  #1003 = Utf8               formerClan
  #1004 = Utf8               targetClan
  #1005 = Utf8               formerSide
  #1006 = Utf8               targetSide
  #1007 = Utf8               midVictory
  #1008 = Utf8               attackers
  #1009 = Utf8               castleOwner
  #1010 = Utf8               allyId
  #1011 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/pledge/Clan;>;
  #1012 = Utf8               side
  #1013 = Utf8               sides
  #1014 = Class              #988         // "[Lext/mods/gameserver/enums/SiegeSide;"
  #1015 = Utf8               smId
  #1016 = Utf8               Z
  #1017 = Utf8               registerAttacker
  #1018 = Utf8               registerDefender
  #1019 = Utf8               alliedClan
  #1020 = Utf8               attacker
  #1021 = Utf8               unregisterClan
  #1022 = Utf8               siege
  #1023 = Utf8               launchTask
  #1024 = Utf8               siegeDate
  #1025 = Utf8               week
  #1026 = Utf8               Ljava/lang/Integer;
  #1027 = Utf8               siegeInfo
  #1028 = Utf8               Lext/mods/gameserver/model/records/custom/SiegeInfo;
  #1029 = Utf8               sieges
  #1030 = Utf8               Ljava/util/Map$Entry<Ljava/lang/Integer;Lext/mods/gameserver/model/records/custom/SiegeInfo;>;
  #1031 = Utf8               Ljava/util/Map<Ljava/lang/Integer;Lext/mods/gameserver/model/records/custom/SiegeInfo;>;
  #1032 = Utf8               getCastle
  #1033 = Utf8               ()Lext/mods/gameserver/model/residence/castle/Castle;
  #1034 = Utf8               automatic
  #1035 = Utf8               addMakerEvent
  #1036 = Utf8               (Lext/mods/gameserver/model/spawn/NpcMaker;)V
  #1037 = Utf8               quest
  #1038 = Utf8               Lext/mods/gameserver/model/spawn/NpcMaker;
  #1039 = Utf8               getStatusTranslation
  #1040 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/enums/SiegeStatus;)Ljava/lang/String;
  #1041 = Utf8               status
  #1042 = Utf8               getStatus
  #1043 = Utf8               ()Lext/mods/gameserver/enums/SiegeStatus;
  #1044 = Utf8               maker
  #1045 = Utf8               siegeStart
  #1046 = Utf8               regTimeRemaining
  #1047 = Utf8               J
  #1048 = Utf8               timeRemaining
  #1049 = Utf8               lambda$clearPendingClans$0
  #1050 = Utf8               (Ljava/util/Map$Entry;)Z
  #1051 = Utf8               lambda$announce$1
  #1052 = Utf8               (Lext/mods/gameserver/network/serverpackets/SystemMessage;Lext/mods/gameserver/model/pledge/Clan;)V
  #1053 = Utf8               c
  #1054 = Utf8               lambda$announce$0
  #1055 = Utf8               lambda$getPendingClans$0
  #1056 = Utf8               lambda$getDefenderClans$0
  #1057 = Utf8               lambda$getAttackerClans$0
  #1058 = Utf8               lambda$endSiege$2
  #1059 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/lang/Integer;Ljava/lang/Integer;)V
  #1060 = Utf8               skillId
  #1061 = Utf8               skillLvl
  #1062 = Utf8               lambda$endSiege$1
  #1063 = Utf8               lambda$endSiege$0
  #1064 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/lang/Integer;Lext/mods/gameserver/model/pledge/ItemInfo;)V
  #1065 = Utf8               itemId
  #1066 = Utf8               itemCount
  #1067 = Utf8               Lext/mods/gameserver/model/pledge/ItemInfo;
  #1068 = Utf8               <clinit>
  #1069 = Utf8               SourceFile
  #1070 = Utf8               Siege.java
  #1071 = Utf8               NestMembers
  #1072 = Utf8               BootstrapMethods
  #1073 = MethodType         #1074        //  (Ljava/lang/Object;)V
  #1074 = Utf8               (Ljava/lang/Object;)V
  #1075 = MethodHandle       5:#1076      // REF_invokeVirtual ext/mods/gameserver/model/location/TowerSpawnLocation.polymorph:()V
  #1076 = Methodref          #1077.#1078  // ext/mods/gameserver/model/location/TowerSpawnLocation.polymorph:()V
  #1077 = Class              #1079        // ext/mods/gameserver/model/location/TowerSpawnLocation
  #1078 = NameAndType        #1080:#6     // polymorph:()V
  #1079 = Utf8               ext/mods/gameserver/model/location/TowerSpawnLocation
  #1080 = Utf8               polymorph
  #1081 = MethodType         #1082        //  (Lext/mods/gameserver/model/location/TowerSpawnLocation;)V
  #1082 = Utf8               (Lext/mods/gameserver/model/location/TowerSpawnLocation;)V
  #1083 = MethodType         #1084        //  (Ljava/lang/Object;Ljava/lang/Object;)V
  #1084 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)V
  #1085 = MethodHandle       6:#1086      // REF_invokeStatic ext/mods/gameserver/model/residence/castle/Siege.lambda$endSiege$0:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/Integer;Lext/mods/gameserver/model/pledge/ItemInfo;)V
  #1086 = Methodref          #11.#1087    // ext/mods/gameserver/model/residence/castle/Siege.lambda$endSiege$0:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/Integer;Lext/mods/gameserver/model/pledge/ItemInfo;)V
  #1087 = NameAndType        #1063:#1064  // lambda$endSiege$0:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/Integer;Lext/mods/gameserver/model/pledge/ItemInfo;)V
  #1088 = MethodType         #1089        //  (Ljava/lang/Integer;Lext/mods/gameserver/model/pledge/ItemInfo;)V
  #1089 = Utf8               (Ljava/lang/Integer;Lext/mods/gameserver/model/pledge/ItemInfo;)V
  #1090 = MethodHandle       5:#1091      // REF_invokeVirtual ext/mods/gameserver/model/location/TowerSpawnLocation.unpolymorph:()V
  #1091 = Methodref          #1077.#1092  // ext/mods/gameserver/model/location/TowerSpawnLocation.unpolymorph:()V
  #1092 = NameAndType        #1093:#6     // unpolymorph:()V
  #1093 = Utf8               unpolymorph
  #1094 = MethodHandle       6:#1095      // REF_invokeStatic ext/mods/gameserver/model/residence/castle/Siege.lambda$endSiege$1:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/Integer;Ljava/lang/Integer;)V
  #1095 = Methodref          #11.#1096    // ext/mods/gameserver/model/residence/castle/Siege.lambda$endSiege$1:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/Integer;Ljava/lang/Integer;)V
  #1096 = NameAndType        #1062:#1059  // lambda$endSiege$1:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/Integer;Ljava/lang/Integer;)V
  #1097 = MethodType         #1098        //  (Ljava/lang/Integer;Ljava/lang/Integer;)V
  #1098 = Utf8               (Ljava/lang/Integer;Ljava/lang/Integer;)V
  #1099 = MethodHandle       6:#1100      // REF_invokeStatic ext/mods/gameserver/model/residence/castle/Siege.lambda$endSiege$2:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/Integer;Ljava/lang/Integer;)V
  #1100 = Methodref          #11.#1101    // ext/mods/gameserver/model/residence/castle/Siege.lambda$endSiege$2:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/Integer;Ljava/lang/Integer;)V
  #1101 = NameAndType        #1058:#1059  // lambda$endSiege$2:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/Integer;Ljava/lang/Integer;)V
  #1102 = MethodType         #451         //  (Ljava/lang/Object;)Z
  #1103 = MethodHandle       6:#1104      // REF_invokeStatic ext/mods/gameserver/model/residence/castle/Siege.lambda$getAttackerClans$0:(Ljava/util/Map$Entry;)Z
  #1104 = Methodref          #11.#1105    // ext/mods/gameserver/model/residence/castle/Siege.lambda$getAttackerClans$0:(Ljava/util/Map$Entry;)Z
  #1105 = NameAndType        #1057:#1050  // lambda$getAttackerClans$0:(Ljava/util/Map$Entry;)Z
  #1106 = MethodType         #1050        //  (Ljava/util/Map$Entry;)Z
  #1107 = MethodType         #441         //  (Ljava/lang/Object;)Ljava/lang/Object;
  #1108 = MethodHandle       9:#792       // REF_invokeInterface java/util/Map$Entry.getKey:()Ljava/lang/Object;
  #1109 = MethodType         #1110        //  (Ljava/util/Map$Entry;)Lext/mods/gameserver/model/pledge/Clan;
  #1110 = Utf8               (Ljava/util/Map$Entry;)Lext/mods/gameserver/model/pledge/Clan;
  #1111 = MethodHandle       6:#1112      // REF_invokeStatic ext/mods/gameserver/model/residence/castle/Siege.lambda$getDefenderClans$0:(Ljava/util/Map$Entry;)Z
  #1112 = Methodref          #11.#1113    // ext/mods/gameserver/model/residence/castle/Siege.lambda$getDefenderClans$0:(Ljava/util/Map$Entry;)Z
  #1113 = NameAndType        #1056:#1050  // lambda$getDefenderClans$0:(Ljava/util/Map$Entry;)Z
  #1114 = MethodHandle       6:#1115      // REF_invokeStatic ext/mods/gameserver/model/residence/castle/Siege.lambda$getPendingClans$0:(Ljava/util/Map$Entry;)Z
  #1115 = Methodref          #11.#1116    // ext/mods/gameserver/model/residence/castle/Siege.lambda$getPendingClans$0:(Ljava/util/Map$Entry;)Z
  #1116 = NameAndType        #1055:#1050  // lambda$getPendingClans$0:(Ljava/util/Map$Entry;)Z
  #1117 = MethodHandle       5:#1118      // REF_invokeVirtual ext/mods/gameserver/model/location/TowerSpawnLocation.midVictory:()V
  #1118 = Methodref          #1077.#1119  // ext/mods/gameserver/model/location/TowerSpawnLocation.midVictory:()V
  #1119 = NameAndType        #1007:#6     // midVictory:()V
  #1120 = MethodHandle       6:#1121      // REF_invokeStatic ext/mods/gameserver/model/residence/castle/Siege.lambda$announce$0:(Lext/mods/gameserver/network/serverpackets/SystemMessage;Lext/mods/gameserver/model/pledge/Clan;)V
  #1121 = Methodref          #11.#1122    // ext/mods/gameserver/model/residence/castle/Siege.lambda$announce$0:(Lext/mods/gameserver/network/serverpackets/SystemMessage;Lext/mods/gameserver/model/pledge/Clan;)V
  #1122 = NameAndType        #1054:#1052  // lambda$announce$0:(Lext/mods/gameserver/network/serverpackets/SystemMessage;Lext/mods/gameserver/model/pledge/Clan;)V
  #1123 = MethodType         #323         //  (Lext/mods/gameserver/model/pledge/Clan;)V
  #1124 = MethodHandle       6:#1125      // REF_invokeStatic ext/mods/gameserver/model/residence/castle/Siege.lambda$announce$1:(Lext/mods/gameserver/network/serverpackets/SystemMessage;Lext/mods/gameserver/model/pledge/Clan;)V
  #1125 = Methodref          #11.#1126    // ext/mods/gameserver/model/residence/castle/Siege.lambda$announce$1:(Lext/mods/gameserver/network/serverpackets/SystemMessage;Lext/mods/gameserver/model/pledge/Clan;)V
  #1126 = NameAndType        #1051:#1052  // lambda$announce$1:(Lext/mods/gameserver/network/serverpackets/SystemMessage;Lext/mods/gameserver/model/pledge/Clan;)V
  #1127 = MethodHandle       6:#1128      // REF_invokeStatic ext/mods/gameserver/model/residence/castle/Siege.lambda$clearPendingClans$0:(Ljava/util/Map$Entry;)Z
  #1128 = Methodref          #11.#1129    // ext/mods/gameserver/model/residence/castle/Siege.lambda$clearPendingClans$0:(Ljava/util/Map$Entry;)Z
  #1129 = NameAndType        #1049:#1050  // lambda$clearPendingClans$0:(Ljava/util/Map$Entry;)Z
  #1130 = MethodType         #6           //  ()V
  #1131 = MethodHandle       5:#1132      // REF_invokeVirtual ext/mods/gameserver/model/residence/castle/Siege.siegeStart:()V
  #1132 = Methodref          #11.#1133    // ext/mods/gameserver/model/residence/castle/Siege.siegeStart:()V
  #1133 = NameAndType        #1045:#6     // siegeStart:()V
  #1134 = MethodHandle       5:#268       // REF_invokeVirtual ext/mods/gameserver/model/residence/castle/Siege.processSiegeTimer:()V
  #1135 = MethodHandle       6:#1136      // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #1136 = Methodref          #1137.#1138  // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #1137 = Class              #1139        // java/lang/invoke/LambdaMetafactory
  #1138 = NameAndType        #1140:#1141  // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #1139 = Utf8               java/lang/invoke/LambdaMetafactory
  #1140 = Utf8               metafactory
  #1141 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #1142 = Utf8               InnerClasses
  #1143 = Utf8               Entry
  #1144 = Class              #1145        // java/lang/invoke/MethodHandles$Lookup
  #1145 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #1146 = Class              #1147        // java/lang/invoke/MethodHandles
  #1147 = Utf8               java/lang/invoke/MethodHandles
  #1148 = Utf8               Lookup
{
  protected java.util.Calendar _siegeEndDate;
    descriptor: Ljava/util/Calendar;
    flags: (0x0004) ACC_PROTECTED

  protected java.util.concurrent.ScheduledFuture<?> _siegeTask;
    descriptor: Ljava/util/concurrent/ScheduledFuture;
    flags: (0x0004) ACC_PROTECTED
    Signature: #952                         // Ljava/util/concurrent/ScheduledFuture<*>;

  public ext.mods.gameserver.model.residence.castle.Siege(ext.mods.gameserver.model.residence.castle.Castle);
    descriptor: (Lext/mods/gameserver/model/residence/castle/Castle;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=7, args_size=2
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: new           #7                  // class java/util/concurrent/ConcurrentHashMap
         8: dup
         9: invokespecial #9                  // Method java/util/concurrent/ConcurrentHashMap."<init>":()V
        12: putfield      #10                 // Field _registeredClans:Ljava/util/Map;
        15: aload_0
        16: getstatic     #16                 // Field ext/mods/gameserver/enums/SiegeStatus.REGISTRATION_OPENED:Lext/mods/gameserver/enums/SiegeStatus;
        19: putfield      #22                 // Field _siegeStatus:Lext/mods/gameserver/enums/SiegeStatus;
        22: aload_0
        23: invokestatic  #25                 // Method java/util/Collections.emptyList:()Ljava/util/List;
        26: putfield      #31                 // Field _makerEvents:Ljava/util/List;
        29: aload_0
        30: aload_1
        31: putfield      #35                 // Field _castle:Lext/mods/gameserver/model/residence/castle/Castle;
        34: aload_0
        35: getfield      #35                 // Field _castle:Lext/mods/gameserver/model/residence/castle/Castle;
        38: invokevirtual #39                 // Method ext/mods/gameserver/model/residence/castle/Castle.getOwnerId:()I
        41: ifle          76
        44: invokestatic  #45                 // Method ext/mods/gameserver/data/sql/ClanTable.getInstance:()Lext/mods/gameserver/data/sql/ClanTable;
        47: aload_0
        48: getfield      #35                 // Field _castle:Lext/mods/gameserver/model/residence/castle/Castle;
        51: invokevirtual #39                 // Method ext/mods/gameserver/model/residence/castle/Castle.getOwnerId:()I
        54: invokevirtual #51                 // Method ext/mods/gameserver/data/sql/ClanTable.getClan:(I)Lext/mods/gameserver/model/pledge/Clan;
        57: astore_2
        58: aload_2
        59: ifnull        76
        62: aload_0
        63: getfield      #10                 // Field _registeredClans:Ljava/util/Map;
        66: aload_2
        67: getstatic     #55                 // Field ext/mods/gameserver/enums/SiegeSide.OWNER:Lext/mods/gameserver/enums/SiegeSide;
        70: invokeinterface #61,  3           // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        75: pop
        76: invokestatic  #67                 // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
        79: astore_2
        80: aload_2
        81: ldc           #73                 // String SELECT clan_id,type FROM siege_clans WHERE castle_id=?
        83: invokeinterface #75,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        88: astore_3
        89: aload_3
        90: iconst_1
        91: aload_0
        92: getfield      #35                 // Field _castle:Lext/mods/gameserver/model/residence/castle/Castle;
        95: invokevirtual #81                 // Method ext/mods/gameserver/model/residence/castle/Castle.getId:()I
        98: invokeinterface #84,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       103: aload_3
       104: invokeinterface #90,  1           // InterfaceMethod java/sql/PreparedStatement.executeQuery:()Ljava/sql/ResultSet;
       109: astore        4
       111: aload         4
       113: invokeinterface #94,  1           // InterfaceMethod java/sql/ResultSet.next:()Z
       118: ifeq          175
       121: invokestatic  #45                 // Method ext/mods/gameserver/data/sql/ClanTable.getInstance:()Lext/mods/gameserver/data/sql/ClanTable;
       124: aload         4
       126: ldc           #100                // String clan_id
       128: invokeinterface #102,  2          // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
       133: invokevirtual #51                 // Method ext/mods/gameserver/data/sql/ClanTable.getClan:(I)Lext/mods/gameserver/model/pledge/Clan;
       136: astore        5
       138: aload         5
       140: ifnull        172
       143: aload_0
       144: getfield      #10                 // Field _registeredClans:Ljava/util/Map;
       147: aload         5
       149: ldc           #56                 // class ext/mods/gameserver/enums/SiegeSide
       151: aload         4
       153: ldc           #106                // String type
       155: invokeinterface #108,  2          // InterfaceMethod java/sql/ResultSet.getString:(Ljava/lang/String;)Ljava/lang/String;
       160: invokestatic  #112                // Method java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
       163: checkcast     #56                 // class ext/mods/gameserver/enums/SiegeSide
       166: invokeinterface #61,  3           // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
       171: pop
       172: goto          111
       175: aload         4
       177: ifnull        219
       180: aload         4
       182: invokeinterface #118,  1          // InterfaceMethod java/sql/ResultSet.close:()V
       187: goto          219
       190: astore        5
       192: aload         4
       194: ifnull        216
       197: aload         4
       199: invokeinterface #118,  1          // InterfaceMethod java/sql/ResultSet.close:()V
       204: goto          216
       207: astore        6
       209: aload         5
       211: aload         6
       213: invokevirtual #123                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       216: aload         5
       218: athrow
       219: aload_3
       220: ifnull        259
       223: aload_3
       224: invokeinterface #127,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       229: goto          259
       232: astore        4
       234: aload_3
       235: ifnull        256
       238: aload_3
       239: invokeinterface #127,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       244: goto          256
       247: astore        5
       249: aload         4
       251: aload         5
       253: invokevirtual #123                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       256: aload         4
       258: athrow
       259: aload_2
       260: ifnull        296
       263: aload_2
       264: invokeinterface #128,  1          // InterfaceMethod java/sql/Connection.close:()V
       269: goto          296
       272: astore_3
       273: aload_2
       274: ifnull        294
       277: aload_2
       278: invokeinterface #128,  1          // InterfaceMethod java/sql/Connection.close:()V
       283: goto          294
       286: astore        4
       288: aload_3
       289: aload         4
       291: invokevirtual #123                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       294: aload_3
       295: athrow
       296: goto          309
       299: astore_2
       300: getstatic     #131                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       303: ldc           #135                // String Couldn\'t load siege registered clans.
       305: aload_2
       306: invokevirtual #137                // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
       309: aload_0
       310: invokevirtual #143                // Method startAutoTask:()V
       313: return
      Exception table:
         from    to  target type
           111   175   190   Class java/lang/Throwable
           197   204   207   Class java/lang/Throwable
            89   219   232   Class java/lang/Throwable
           238   244   247   Class java/lang/Throwable
            80   259   272   Class java/lang/Throwable
           277   283   286   Class java/lang/Throwable
            76   296   299   Class java/lang/Exception
      LineNumberTable:
        line 82: 0
        line 71: 4
        line 77: 15
        line 79: 22
        line 83: 29
        line 85: 34
        line 87: 44
        line 88: 58
        line 89: 62
        line 92: 76
        line 94: 80
        line 96: 89
        line 98: 103
        line 100: 111
        line 102: 121
        line 103: 138
        line 104: 143
        line 105: 172
        line 106: 175
        line 98: 190
        line 108: 219
        line 94: 232
        line 109: 259
        line 92: 272
        line 113: 296
        line 110: 299
        line 112: 300
        line 115: 309
        line 116: 313
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           58      18     2  clan   Lext/mods/gameserver/model/pledge/Clan;
          138      34     5  clan   Lext/mods/gameserver/model/pledge/Clan;
          111     108     4    rs   Ljava/sql/ResultSet;
           89     170     3    ps   Ljava/sql/PreparedStatement;
           80     216     2   con   Ljava/sql/Connection;
          300       9     2     e   Ljava/lang/Exception;
            0     314     0  this   Lext/mods/gameserver/model/residence/castle/Siege;
            0     314     1 castle   Lext/mods/gameserver/model/residence/castle/Castle;
      StackMapTable: number_of_entries = 18
        frame_type = 255 /* full_frame */
          offset_delta = 76
          locals = [ class ext/mods/gameserver/model/residence/castle/Siege, class ext/mods/gameserver/model/residence/castle/Castle ]
          stack = []
        frame_type = 254 /* append */
          offset_delta = 34
          locals = [ class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/ResultSet ]
        frame_type = 60 /* same */
        frame_type = 2 /* same */
        frame_type = 78 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/model/residence/castle/Siege, class ext/mods/gameserver/model/residence/castle/Castle, class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/ResultSet, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 14
          locals = [ class ext/mods/gameserver/model/residence/castle/Siege, class ext/mods/gameserver/model/residence/castle/Castle, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/model/residence/castle/Siege, class ext/mods/gameserver/model/residence/castle/Castle, class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 7 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 9 /* same */

  public void startSiege();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=2, args_size=1
         0: aload_0
         1: invokevirtual #146                // Method isInProgress:()Z
         4: ifeq          8
         7: return
         8: aload_0
         9: invokevirtual #149                // Method getAttackerClans:()Ljava/util/List;
        12: invokeinterface #152,  1          // InterfaceMethod java/util/List.isEmpty:()Z
        17: ifeq          65
        20: aload_0
        21: getfield      #35                 // Field _castle:Lext/mods/gameserver/model/residence/castle/Castle;
        24: invokevirtual #39                 // Method ext/mods/gameserver/model/residence/castle/Castle.getOwnerId:()I
        27: ifgt          36
        30: getstatic     #157                // Field ext/mods/gameserver/network/SystemMessageId.SIEGE_OF_S1_HAS_BEEN_CANCELED_DUE_TO_LACK_OF_INTEREST:Lext/mods/gameserver/network/SystemMessageId;
        33: goto          39
        36: getstatic     #163                // Field ext/mods/gameserver/network/SystemMessageId.S1_SIEGE_WAS_CANCELED_BECAUSE_NO_CLANS_PARTICIPATED:Lext/mods/gameserver/network/SystemMessageId;
        39: invokestatic  #166                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        42: astore_1
        43: aload_1
        44: aload_0
        45: getfield      #35                 // Field _castle:Lext/mods/gameserver/model/residence/castle/Castle;
        48: invokevirtual #81                 // Method ext/mods/gameserver/model/residence/castle/Castle.getId:()I
        51: invokevirtual #172                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addFortId:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        54: pop
        55: aload_1
        56: invokestatic  #176                // Method ext/mods/gameserver/model/World.toAllOnlinePlayers:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        59: aload_0
        60: iconst_1
        61: invokevirtual #182                // Method saveCastleSiege:(Z)V
        64: return
        65: aload_0
        66: invokestatic  #45                 // Method ext/mods/gameserver/data/sql/ClanTable.getInstance:()Lext/mods/gameserver/data/sql/ClanTable;
        69: aload_0
        70: getfield      #35                 // Field _castle:Lext/mods/gameserver/model/residence/castle/Castle;
        73: invokevirtual #39                 // Method ext/mods/gameserver/model/residence/castle/Castle.getOwnerId:()I
        76: invokevirtual #51                 // Method ext/mods/gameserver/data/sql/ClanTable.getClan:(I)Lext/mods/gameserver/model/pledge/Clan;
        79: putfield      #186                // Field _formerOwner:Lext/mods/gameserver/model/pledge/Clan;
        82: aload_0
        83: getstatic     #190                // Field ext/mods/gameserver/enums/SiegeStatus.IN_PROGRESS:Lext/mods/gameserver/enums/SiegeStatus;
        86: invokevirtual #193                // Method changeStatus:(Lext/mods/gameserver/enums/SiegeStatus;)V
        89: aload_0
        90: getfield      #35                 // Field _castle:Lext/mods/gameserver/model/residence/castle/Castle;
        93: invokevirtual #197                // Method ext/mods/gameserver/model/residence/castle/Castle.getSiegeZone:()Lext/mods/gameserver/model/zone/type/SiegeZone;
        96: aload_0
        97: getfield      #35                 // Field _castle:Lext/mods/gameserver/model/residence/castle/Castle;
       100: invokevirtual #39                 // Method ext/mods/gameserver/model/residence/castle/Castle.getOwnerId:()I
       103: invokevirtual #201                // Method ext/mods/gameserver/model/zone/type/SiegeZone.banishForeigners:(I)V
       106: aload_0
       107: getfield      #35                 // Field _castle:Lext/mods/gameserver/model/residence/castle/Castle;
       110: invokevirtual #197                // Method ext/mods/gameserver/model/residence/castle/Castle.getSiegeZone:()Lext/mods/gameserver/model/zone/type/SiegeZone;
       113: iconst_1
       114: invokevirtual #207                // Method ext/mods/gameserver/model/zone/type/SiegeZone.setActive:(Z)V
       117: aload_0
       118: iconst_0
       119: invokevirtual #210                // Method updatePlayerSiegeStateFlags:(Z)V
       122: aload_0
       123: getfield      #35                 // Field _castle:Lext/mods/gameserver/model/residence/castle/Castle;
       126: invokevirtual #213                // Method ext/mods/gameserver/model/residence/castle/Castle.getControlTowers:()Ljava/util/List;
       129: invokedynamic #216,  0            // InvokeDynamic #0:accept:()Ljava/util/function/Consumer;
       134: invokeinterface #220,  2          // InterfaceMethod java/util/List.forEach:(Ljava/util/function/Consumer;)V
       139: aload_0
       140: getfield      #35                 // Field _castle:Lext/mods/gameserver/model/residence/castle/Castle;
       143: invokevirtual #224                // Method ext/mods/gameserver/model/residence/castle/Castle.closeDoors:()V
       146: aload_0
       147: getfield      #35                 // Field _castle:Lext/mods/gameserver/model/residence/castle/Castle;
       150: invokevirtual #227                // Method ext/mods/gameserver/model/residence/castle/Castle.spawnSiegeGuardsOrMercenaries:()V
       153: getstatic     #230                // Field ext/mods/gameserver/network/SystemMessageId.SIEGE_OF_S1_HAS_STARTED:Lext/mods/gameserver/network/SystemMessageId;
       156: invokestatic  #166                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       159: aload_0
       160: getfield      #35                 // Field _castle:Lext/mods/gameserver/model/residence/castle/Castle;
       163: invokevirtual #81                 // Method ext/mods/gameserver/model/residence/castle/Castle.getId:()I
       166: invokevirtual #172                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addFortId:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       169: invokestatic  #176                // Method ext/mods/gameserver/model/World.toAllOnlinePlayers:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       172: new           #233                // class ext/mods/gameserver/network/serverpackets/PlaySound
       175: dup
       176: ldc           #235                // String systemmsg_e.17
       178: invokespecial #237                // Method ext/mods/gameserver/network/serverpackets/PlaySound."<init>":(Ljava/lang/String;)V
       181: invokestatic  #176                // Method ext/mods/gameserver/model/World.toAllOnlinePlayers:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       184: aload_0
       185: getstatic     #240                // Field ext/mods/gameserver/network/SystemMessageId.TEMPORARY_ALLIANCE:Lext/mods/gameserver/network/SystemMessageId;
       188: iconst_1
       189: anewarray     #56                 // class ext/mods/gameserver/enums/SiegeSide
       192: dup
       193: iconst_0
       194: getstatic     #243                // Field ext/mods/gameserver/enums/SiegeSide.ATTACKER:Lext/mods/gameserver/enums/SiegeSide;
       197: aastore
       198: invokevirtual #246                // Method announce:(Lext/mods/gameserver/network/SystemMessageId;[Lext/mods/gameserver/enums/SiegeSide;)V
       201: aload_0
       202: invokestatic  #250                // Method java/util/Calendar.getInstance:()Ljava/util/Calendar;
       205: putfield      #255                // Field _siegeEndDate:Ljava/util/Calendar;
       208: aload_0
       209: getfield      #255                // Field _siegeEndDate:Ljava/util/Calendar;
       212: bipush        12
       214: getstatic     #259                // Field ext/mods/Config.SIEGE_LENGTH:I
       217: invokevirtual #265                // Method java/util/Calendar.add:(II)V
       220: aload_0
       221: invokevirtual #268                // Method processSiegeTimer:()V
       224: invokestatic  #271                // Method ext/mods/extensions/listener/manager/SiegeListenerManager.getInstance:()Lext/mods/extensions/listener/manager/SiegeListenerManager;
       227: aload_0
       228: invokevirtual #276                // Method ext/mods/extensions/listener/manager/SiegeListenerManager.notifySiegeStart:(Lext/mods/gameserver/model/residence/castle/Siege;)V
       231: return
      LineNumberTable:
        line 121: 0
        line 122: 7
        line 124: 8
        line 126: 20
        line 127: 43
        line 129: 55
        line 130: 59
        line 131: 64
        line 134: 65
        line 136: 82
        line 138: 89
        line 139: 106
        line 141: 117
        line 143: 122
        line 145: 139
        line 146: 146
        line 148: 153
        line 149: 172
        line 151: 184
        line 153: 201
        line 154: 208
        line 156: 220
        line 157: 224
        line 159: 231
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           43      22     1    sm   Lext/mods/gameserver/network/serverpackets/SystemMessage;
            0     232     0  this   Lext/mods/gameserver/model/residence/castle/Siege;
      StackMapTable: number_of_entries = 4
        frame_type = 8 /* same */
        frame_type = 27 /* same */
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/network/SystemMessageId ]
        frame_type = 25 /* same */

  public void endSiege();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=8, args_size=1
         0: aload_0
         1: invokevirtual #146                // Method isInProgress:()Z
         4: ifne          8
         7: return
         8: getstatic     #280                // Field ext/mods/gameserver/network/SystemMessageId.SIEGE_OF_S1_HAS_ENDED:Lext/mods/gameserver/network/SystemMessageId;
        11: invokestatic  #166                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        14: aload_0
        15: getfield      #35                 // Field _castle:Lext/mods/gameserver/model/residence/castle/Castle;
        18: invokevirtual #81                 // Method ext/mods/gameserver/model/residence/castle/Castle.getId:()I
        21: invokevirtual #172                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addFortId:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        24: invokestatic  #176                // Method ext/mods/gameserver/model/World.toAllOnlinePlayers:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        27: new           #233                // class ext/mods/gameserver/network/serverpackets/PlaySound
        30: dup
        31: ldc_w         #283                // String systemmsg_e.18
        34: invokespecial #237                // Method ext/mods/gameserver/network/serverpackets/PlaySound."<init>":(Ljava/lang/String;)V
        37: invokestatic  #176                // Method ext/mods/gameserver/model/World.toAllOnlinePlayers:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        40: aload_0
        41: getfield      #35                 // Field _castle:Lext/mods/gameserver/model/residence/castle/Castle;
        44: invokevirtual #39                 // Method ext/mods/gameserver/model/residence/castle/Castle.getOwnerId:()I
        47: ifle          258
        50: invokestatic  #45                 // Method ext/mods/gameserver/data/sql/ClanTable.getInstance:()Lext/mods/gameserver/data/sql/ClanTable;
        53: aload_0
        54: getfield      #35                 // Field _castle:Lext/mods/gameserver/model/residence/castle/Castle;
        57: invokevirtual #39                 // Method ext/mods/gameserver/model/residence/castle/Castle.getOwnerId:()I
        60: invokevirtual #51                 // Method ext/mods/gameserver/data/sql/ClanTable.getClan:(I)Lext/mods/gameserver/model/pledge/Clan;
        63: astore_1
        64: getstatic     #285                // Field ext/mods/gameserver/network/SystemMessageId.CLAN_S1_VICTORIOUS_OVER_S2_S_SIEGE:Lext/mods/gameserver/network/SystemMessageId;
        67: invokestatic  #166                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        70: aload_1
        71: invokevirtual #288                // Method ext/mods/gameserver/model/pledge/Clan.getName:()Ljava/lang/String;
        74: invokevirtual #294                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addString:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        77: aload_0
        78: getfield      #35                 // Field _castle:Lext/mods/gameserver/model/residence/castle/Castle;
        81: invokevirtual #81                 // Method ext/mods/gameserver/model/residence/castle/Castle.getId:()I
        84: invokevirtual #172                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addFortId:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        87: invokestatic  #176                // Method ext/mods/gameserver/model/World.toAllOnlinePlayers:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        90: aload_1
        91: invokevirtual #298                // Method ext/mods/gameserver/model/pledge/Clan.getOnlineMembers:()[Lext/mods/gameserver/model/actor/Player;
        94: astore_2
        95: aload_2
        96: arraylength
        97: istore_3
        98: iconst_0
        99: istore        4
       101: iload         4
       103: iload_3
       104: if_icmpge     160
       107: aload_2
       108: iload         4
       110: aaload
       111: astore        5
       113: aload         5
       115: invokevirtual #302                // Method ext/mods/gameserver/model/actor/Player.isClanLeader:()Z
       118: ifeq          131
       121: aload_0
       122: getfield      #35                 // Field _castle:Lext/mods/gameserver/model/residence/castle/Castle;
       125: invokevirtual #307                // Method ext/mods/gameserver/model/residence/castle/Castle.getItemsLeader:()Ljava/util/Map;
       128: goto          138
       131: aload_0
       132: getfield      #35                 // Field _castle:Lext/mods/gameserver/model/residence/castle/Castle;
       135: invokevirtual #311                // Method ext/mods/gameserver/model/residence/castle/Castle.getItemsMember:()Ljava/util/Map;
       138: astore        6
       140: aload         6
       142: aload         5
       144: invokedynamic #314,  0            // InvokeDynamic #1:accept:(Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/BiConsumer;
       149: invokeinterface #317,  2          // InterfaceMethod java/util/Map.forEach:(Ljava/util/function/BiConsumer;)V
       154: iinc          4, 1
       157: goto          101
       160: aload_0
       161: getfield      #186                // Field _formerOwner:Lext/mods/gameserver/model/pledge/Clan;
       164: ifnull        255
       167: aload_1
       168: aload_0
       169: getfield      #186                // Field _formerOwner:Lext/mods/gameserver/model/pledge/Clan;
       172: if_acmpeq     255
       175: aload_0
       176: getfield      #35                 // Field _castle:Lext/mods/gameserver/model/residence/castle/Castle;
       179: aload_0
       180: getfield      #186                // Field _formerOwner:Lext/mods/gameserver/model/pledge/Clan;
       183: invokevirtual #320                // Method ext/mods/gameserver/model/residence/castle/Castle.checkItemsForClan:(Lext/mods/gameserver/model/pledge/Clan;)V
       186: aload_1
       187: invokevirtual #324                // Method ext/mods/gameserver/model/pledge/Clan.getMembers:()Ljava/util/Collection;
       190: invokeinterface #328,  1          // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
       195: astore_2
       196: aload_2
       197: invokeinterface #334,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       202: ifeq          255
       205: aload_2
       206: invokeinterface #339,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       211: checkcast     #342                // class ext/mods/gameserver/model/pledge/ClanMember
       214: astore_3
       215: aload_3
       216: invokevirtual #344                // Method ext/mods/gameserver/model/pledge/ClanMember.getPlayerInstance:()Lext/mods/gameserver/model/actor/Player;
       219: astore        4
       221: aload         4
       223: ifnull        252
       226: aload         4
       228: invokevirtual #348                // Method ext/mods/gameserver/model/actor/Player.isNoble:()Z
       231: ifeq          252
       234: invokestatic  #351                // Method ext/mods/gameserver/data/manager/HeroManager.getInstance:()Lext/mods/gameserver/data/manager/HeroManager;
       237: aload         4
       239: invokevirtual #356                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
       242: aload_0
       243: getfield      #35                 // Field _castle:Lext/mods/gameserver/model/residence/castle/Castle;
       246: invokevirtual #81                 // Method ext/mods/gameserver/model/residence/castle/Castle.getId:()I
       249: invokevirtual #359                // Method ext/mods/gameserver/data/manager/HeroManager.setCastleTaken:(II)V
       252: goto          196
       255: goto          277
       258: getstatic     #362                // Field ext/mods/gameserver/network/SystemMessageId.SIEGE_S1_DRAW:Lext/mods/gameserver/network/SystemMessageId;
       261: invokestatic  #166                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       264: aload_0
       265: getfield      #35                 // Field _castle:Lext/mods/gameserver/model/residence/castle/Castle;
       268: invokevirtual #81                 // Method ext/mods/gameserver/model/residence/castle/Castle.getId:()I
       271: invokevirtual #172                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addFortId:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       274: invokestatic  #176                // Method ext/mods/gameserver/model/World.toAllOnlinePlayers:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       277: aload_0
       278: getfield      #10                 // Field _registeredClans:Ljava/util/Map;
       281: invokeinterface #365,  1          // InterfaceMethod java/util/Map.keySet:()Ljava/util/Set;
       286: invokeinterface #369,  1          // InterfaceMethod java/util/Set.iterator:()Ljava/util/Iterator;
       291: astore_1
       292: aload_1
       293: invokeinterface #334,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       298: ifeq          329
       301: aload_1
       302: invokeinterface #339,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       307: checkcast     #289                // class ext/mods/gameserver/model/pledge/Clan
       310: astore_2
       311: aload_2
       312: iconst_0
       313: invokevirtual #372                // Method ext/mods/gameserver/model/pledge/Clan.setSiegeKills:(I)V
       316: aload_2
       317: iconst_0
       318: invokevirtual #375                // Method ext/mods/gameserver/model/pledge/Clan.setSiegeDeaths:(I)V
       321: aload_2
       322: aconst_null
       323: invokevirtual #378                // Method ext/mods/gameserver/model/pledge/Clan.setFlag:(Lext/mods/gameserver/model/actor/Npc;)V
       326: goto          292
       329: aload_0
       330: invokevirtual #382                // Method updateClansReputation:()V
       333: aload_0
       334: getfield      #35                 // Field _castle:Lext/mods/gameserver/model/residence/castle/Castle;
       337: invokevirtual #197                // Method ext/mods/gameserver/model/residence/castle/Castle.getSiegeZone:()Lext/mods/gameserver/model/zone/type/SiegeZone;
       340: aload_0
       341: getfield      #35                 // Field _castle:Lext/mods/gameserver/model/residence/castle/Castle;
       344: invokevirtual #39                 // Method ext/mods/gameserver/model/residence/castle/Castle.getOwnerId:()I
       347: invokevirtual #201                // Method ext/mods/gameserver/model/zone/type/SiegeZone.banishForeigners:(I)V
       350: aload_0
       351: iconst_1
       352: invokevirtual #210                // Method updatePlayerSiegeStateFlags:(Z)V
       355: aload_0
       356: iconst_1
       357: invokevirtual #182                // Method saveCastleSiege:(Z)V
       360: aload_0
       361: invokevirtual #385                // Method clearAllClans:()V
       364: aload_0
       365: getfield      #35                 // Field _castle:Lext/mods/gameserver/model/residence/castle/Castle;
       368: invokevirtual #213                // Method ext/mods/gameserver/model/residence/castle/Castle.getControlTowers:()Ljava/util/List;
       371: invokedynamic #388,  0            // InvokeDynamic #2:accept:()Ljava/util/function/Consumer;
       376: invokeinterface #220,  2          // InterfaceMethod java/util/List.forEach:(Ljava/util/function/Consumer;)V
       381: aload_0
       382: getfield      #35                 // Field _castle:Lext/mods/gameserver/model/residence/castle/Castle;
       385: invokevirtual #389                // Method ext/mods/gameserver/model/residence/castle/Castle.despawnSiegeGuardsOrMercenaries:()V
       388: aload_0
       389: getfield      #35                 // Field _castle:Lext/mods/gameserver/model/residence/castle/Castle;
       392: iconst_0
       393: invokevirtual #392                // Method ext/mods/gameserver/model/residence/castle/Castle.spawnDoors:(Z)V
       396: aload_0
       397: getfield      #35                 // Field _castle:Lext/mods/gameserver/model/residence/castle/Castle;
       400: invokevirtual #197                // Method ext/mods/gameserver/model/residence/castle/Castle.getSiegeZone:()Lext/mods/gameserver/model/zone/type/SiegeZone;
       403: iconst_0
       404: invokevirtual #207                // Method ext/mods/gameserver/model/zone/type/SiegeZone.setActive:(Z)V
       407: invokestatic  #45                 // Method ext/mods/gameserver/data/sql/ClanTable.getInstance:()Lext/mods/gameserver/data/sql/ClanTable;
       410: aload_0
       411: getfield      #35                 // Field _castle:Lext/mods/gameserver/model/residence/castle/Castle;
       414: invokevirtual #39                 // Method ext/mods/gameserver/model/residence/castle/Castle.getOwnerId:()I
       417: invokevirtual #51                 // Method ext/mods/gameserver/data/sql/ClanTable.getClan:(I)Lext/mods/gameserver/model/pledge/Clan;
       420: astore_1
       421: aload_1
       422: ifnull        495
       425: aload_1
       426: invokevirtual #298                // Method ext/mods/gameserver/model/pledge/Clan.getOnlineMembers:()[Lext/mods/gameserver/model/actor/Player;
       429: astore_2
       430: aload_2
       431: arraylength
       432: istore_3
       433: iconst_0
       434: istore        4
       436: iload         4
       438: iload_3
       439: if_icmpge     495
       442: aload_2
       443: iload         4
       445: aaload
       446: astore        5
       448: aload         5
       450: invokevirtual #302                // Method ext/mods/gameserver/model/actor/Player.isClanLeader:()Z
       453: ifeq          466
       456: aload_0
       457: getfield      #35                 // Field _castle:Lext/mods/gameserver/model/residence/castle/Castle;
       460: invokevirtual #395                // Method ext/mods/gameserver/model/residence/castle/Castle.getSkillsLeader:()Ljava/util/Map;
       463: goto          473
       466: aload_0
       467: getfield      #35                 // Field _castle:Lext/mods/gameserver/model/residence/castle/Castle;
       470: invokevirtual #398                // Method ext/mods/gameserver/model/residence/castle/Castle.getSkillsMember:()Ljava/util/Map;
       473: astore        6
       475: aload         6
       477: aload         5
       479: invokedynamic #401,  0            // InvokeDynamic #3:accept:(Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/BiConsumer;
       484: invokeinterface #317,  2          // InterfaceMethod java/util/Map.forEach:(Ljava/util/function/BiConsumer;)V
       489: iinc          4, 1
       492: goto          436
       495: aload_0
       496: getfield      #186                // Field _formerOwner:Lext/mods/gameserver/model/pledge/Clan;
       499: ifnull        588
       502: invokestatic  #45                 // Method ext/mods/gameserver/data/sql/ClanTable.getInstance:()Lext/mods/gameserver/data/sql/ClanTable;
       505: aload_0
       506: getfield      #186                // Field _formerOwner:Lext/mods/gameserver/model/pledge/Clan;
       509: invokevirtual #402                // Method ext/mods/gameserver/model/pledge/Clan.getClanId:()I
       512: invokevirtual #51                 // Method ext/mods/gameserver/data/sql/ClanTable.getClan:(I)Lext/mods/gameserver/model/pledge/Clan;
       515: astore_2
       516: aload_2
       517: invokevirtual #298                // Method ext/mods/gameserver/model/pledge/Clan.getOnlineMembers:()[Lext/mods/gameserver/model/actor/Player;
       520: astore_3
       521: aload_3
       522: arraylength
       523: istore        4
       525: iconst_0
       526: istore        5
       528: iload         5
       530: iload         4
       532: if_icmpge     588
       535: aload_3
       536: iload         5
       538: aaload
       539: astore        6
       541: aload         6
       543: invokevirtual #302                // Method ext/mods/gameserver/model/actor/Player.isClanLeader:()Z
       546: ifeq          559
       549: aload_0
       550: getfield      #35                 // Field _castle:Lext/mods/gameserver/model/residence/castle/Castle;
       553: invokevirtual #395                // Method ext/mods/gameserver/model/residence/castle/Castle.getSkillsLeader:()Ljava/util/Map;
       556: goto          566
       559: aload_0
       560: getfield      #35                 // Field _castle:Lext/mods/gameserver/model/residence/castle/Castle;
       563: invokevirtual #398                // Method ext/mods/gameserver/model/residence/castle/Castle.getSkillsMember:()Ljava/util/Map;
       566: astore        7
       568: aload         7
       570: aload         6
       572: invokedynamic #405,  0            // InvokeDynamic #4:accept:(Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/BiConsumer;
       577: invokeinterface #317,  2          // InterfaceMethod java/util/Map.forEach:(Ljava/util/function/BiConsumer;)V
       582: iinc          5, 1
       585: goto          528
       588: invokestatic  #271                // Method ext/mods/extensions/listener/manager/SiegeListenerManager.getInstance:()Lext/mods/extensions/listener/manager/SiegeListenerManager;
       591: aload_0
       592: invokevirtual #406                // Method ext/mods/extensions/listener/manager/SiegeListenerManager.notifySiegeEnd:(Lext/mods/gameserver/model/residence/castle/Siege;)V
       595: return
      LineNumberTable:
        line 164: 0
        line 165: 7
        line 167: 8
        line 168: 27
        line 170: 40
        line 172: 50
        line 173: 64
        line 175: 90
        line 177: 113
        line 179: 140
        line 175: 154
        line 185: 160
        line 187: 175
        line 189: 186
        line 191: 215
        line 192: 221
        line 193: 234
        line 194: 252
        line 196: 255
        line 198: 258
        line 200: 277
        line 202: 311
        line 203: 316
        line 204: 321
        line 205: 326
        line 207: 329
        line 209: 333
        line 211: 350
        line 213: 355
        line 215: 360
        line 217: 364
        line 219: 381
        line 221: 388
        line 223: 396
        line 225: 407
        line 226: 421
        line 228: 425
        line 230: 448
        line 231: 475
        line 228: 489
        line 238: 495
        line 240: 502
        line 241: 516
        line 243: 541
        line 244: 568
        line 241: 582
        line 250: 588
        line 251: 595
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          140      14     6  item   Ljava/util/Map;
          113      41     5 player   Lext/mods/gameserver/model/actor/Player;
          221      31     4 player   Lext/mods/gameserver/model/actor/Player;
          215      37     3 member   Lext/mods/gameserver/model/pledge/ClanMember;
           64     191     1  clan   Lext/mods/gameserver/model/pledge/Clan;
          311      15     2  clan   Lext/mods/gameserver/model/pledge/Clan;
          475      14     6 skill   Ljava/util/Map;
          448      41     5 player   Lext/mods/gameserver/model/actor/Player;
          568      14     7 skill   Ljava/util/Map;
          541      41     6 player   Lext/mods/gameserver/model/actor/Player;
          516      72     2 formerOwner   Lext/mods/gameserver/model/pledge/Clan;
            0     596     0  this   Lext/mods/gameserver/model/residence/castle/Siege;
          421     175     1 owner   Lext/mods/gameserver/model/pledge/Clan;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
          140      14     6  item   Ljava/util/Map<Ljava/lang/Integer;Lext/mods/gameserver/model/pledge/ItemInfo;>;
          475      14     6 skill   Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Integer;>;
          568      14     7 skill   Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Integer;>;
      StackMapTable: number_of_entries = 20
        frame_type = 8 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 92
          locals = [ class ext/mods/gameserver/model/residence/castle/Siege, class ext/mods/gameserver/model/pledge/Clan, class "[Lext/mods/gameserver/model/actor/Player;", int, int ]
          stack = []
        frame_type = 252 /* append */
          offset_delta = 29
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 70 /* same_locals_1_stack_item */
          stack = [ class java/util/Map ]
        frame_type = 255 /* full_frame */
          offset_delta = 21
          locals = [ class ext/mods/gameserver/model/residence/castle/Siege, class ext/mods/gameserver/model/pledge/Clan ]
          stack = []
        frame_type = 252 /* append */
          offset_delta = 35
          locals = [ class java/util/Iterator ]
        frame_type = 55 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 2 /* same */
        frame_type = 18 /* same */
        frame_type = 252 /* append */
          offset_delta = 14
          locals = [ class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 36
        frame_type = 255 /* full_frame */
          offset_delta = 106
          locals = [ class ext/mods/gameserver/model/residence/castle/Siege, class ext/mods/gameserver/model/pledge/Clan, class "[Lext/mods/gameserver/model/actor/Player;", int, int ]
          stack = []
        frame_type = 252 /* append */
          offset_delta = 29
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 70 /* same_locals_1_stack_item */
          stack = [ class java/util/Map ]
        frame_type = 255 /* full_frame */
          offset_delta = 21
          locals = [ class ext/mods/gameserver/model/residence/castle/Siege, class ext/mods/gameserver/model/pledge/Clan ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 32
          locals = [ class ext/mods/gameserver/model/residence/castle/Siege, class ext/mods/gameserver/model/pledge/Clan, class ext/mods/gameserver/model/pledge/Clan, class "[Lext/mods/gameserver/model/actor/Player;", int, int ]
          stack = []
        frame_type = 252 /* append */
          offset_delta = 30
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 70 /* same_locals_1_stack_item */
          stack = [ class java/util/Map ]
        frame_type = 255 /* full_frame */
          offset_delta = 21
          locals = [ class ext/mods/gameserver/model/residence/castle/Siege, class ext/mods/gameserver/model/pledge/Clan ]
          stack = []

  public final java.util.List<ext.mods.gameserver.model.pledge.Clan> getAttackerClans();
    descriptor: ()Ljava/util/List;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #10                 // Field _registeredClans:Ljava/util/Map;
         4: invokeinterface #409,  1          // InterfaceMethod java/util/Map.entrySet:()Ljava/util/Set;
         9: invokeinterface #412,  1          // InterfaceMethod java/util/Set.stream:()Ljava/util/stream/Stream;
        14: invokedynamic #416,  0            // InvokeDynamic #5:test:()Ljava/util/function/Predicate;
        19: invokeinterface #420,  2          // InterfaceMethod java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
        24: invokedynamic #426,  0            // InvokeDynamic #6:apply:()Ljava/util/function/Function;
        29: invokeinterface #430,  2          // InterfaceMethod java/util/stream/Stream.map:(Ljava/util/function/Function;)Ljava/util/stream/Stream;
        34: invokeinterface #434,  1          // InterfaceMethod java/util/stream/Stream.toList:()Ljava/util/List;
        39: areturn
      LineNumberTable:
        line 256: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      40     0  this   Lext/mods/gameserver/model/residence/castle/Siege;
    Signature: #986                         // ()Ljava/util/List<Lext/mods/gameserver/model/pledge/Clan;>;

  public final java.util.List<ext.mods.gameserver.model.pledge.Clan> getDefenderClans();
    descriptor: ()Ljava/util/List;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #10                 // Field _registeredClans:Ljava/util/Map;
         4: invokeinterface #409,  1          // InterfaceMethod java/util/Map.entrySet:()Ljava/util/Set;
         9: invokeinterface #412,  1          // InterfaceMethod java/util/Set.stream:()Ljava/util/stream/Stream;
        14: invokedynamic #437,  0            // InvokeDynamic #7:test:()Ljava/util/function/Predicate;
        19: invokeinterface #420,  2          // InterfaceMethod java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
        24: invokedynamic #426,  0            // InvokeDynamic #6:apply:()Ljava/util/function/Function;
        29: invokeinterface #430,  2          // InterfaceMethod java/util/stream/Stream.map:(Ljava/util/function/Function;)Ljava/util/stream/Stream;
        34: invokeinterface #434,  1          // InterfaceMethod java/util/stream/Stream.toList:()Ljava/util/List;
        39: areturn
      LineNumberTable:
        line 262: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      40     0  this   Lext/mods/gameserver/model/residence/castle/Siege;
    Signature: #986                         // ()Ljava/util/List<Lext/mods/gameserver/model/pledge/Clan;>;

  public boolean checkSide(ext.mods.gameserver.model.pledge.Clan, ext.mods.gameserver.enums.SiegeSide);
    descriptor: (Lext/mods/gameserver/model/pledge/Clan;Lext/mods/gameserver/enums/SiegeSide;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=3, args_size=3
         0: aload_1
         1: ifnull        22
         4: aload_0
         5: getfield      #10                 // Field _registeredClans:Ljava/util/Map;
         8: aload_1
         9: invokeinterface #438,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        14: aload_2
        15: if_acmpne     22
        18: iconst_1
        19: goto          23
        22: iconst_0
        23: ireturn
      LineNumberTable:
        line 268: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      24     0  this   Lext/mods/gameserver/model/residence/castle/Siege;
            0      24     1  clan   Lext/mods/gameserver/model/pledge/Clan;
            0      24     2  type   Lext/mods/gameserver/enums/SiegeSide;
      StackMapTable: number_of_entries = 2
        frame_type = 22 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public boolean checkSides(ext.mods.gameserver.model.pledge.Clan, ext.mods.gameserver.enums.SiegeSide...);
    descriptor: (Lext/mods/gameserver/model/pledge/Clan;[Lext/mods/gameserver/enums/SiegeSide;)Z
    flags: (0x0081) ACC_PUBLIC, ACC_VARARGS
    Code:
      stack=3, locals=3, args_size=3
         0: aload_1
         1: ifnull        28
         4: aload_2
         5: aload_0
         6: getfield      #10                 // Field _registeredClans:Ljava/util/Map;
         9: aload_1
        10: invokeinterface #438,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        15: checkcast     #56                 // class ext/mods/gameserver/enums/SiegeSide
        18: invokestatic  #442                // Method ext/mods/commons/util/ArraysUtil.contains:([Ljava/lang/Object;Ljava/lang/Object;)Z
        21: ifeq          28
        24: iconst_1
        25: goto          29
        28: iconst_0
        29: ireturn
      LineNumberTable:
        line 274: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      30     0  this   Lext/mods/gameserver/model/residence/castle/Siege;
            0      30     1  clan   Lext/mods/gameserver/model/pledge/Clan;
            0      30     2 types   [Lext/mods/gameserver/enums/SiegeSide;
      StackMapTable: number_of_entries = 2
        frame_type = 28 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public boolean checkSides(ext.mods.gameserver.model.pledge.Clan);
    descriptor: (Lext/mods/gameserver/model/pledge/Clan;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_1
         1: ifnull        21
         4: aload_0
         5: getfield      #10                 // Field _registeredClans:Ljava/util/Map;
         8: aload_1
         9: invokeinterface #448,  2          // InterfaceMethod java/util/Map.containsKey:(Ljava/lang/Object;)Z
        14: ifeq          21
        17: iconst_1
        18: goto          22
        21: iconst_0
        22: ireturn
      LineNumberTable:
        line 280: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      23     0  this   Lext/mods/gameserver/model/residence/castle/Siege;
            0      23     1  clan   Lext/mods/gameserver/model/pledge/Clan;
      StackMapTable: number_of_entries = 2
        frame_type = 21 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public ext.mods.gameserver.model.actor.Npc getFlag(ext.mods.gameserver.model.pledge.Clan);
    descriptor: (Lext/mods/gameserver/model/pledge/Clan;)Lext/mods/gameserver/model/actor/Npc;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: getstatic     #243                // Field ext/mods/gameserver/enums/SiegeSide.ATTACKER:Lext/mods/gameserver/enums/SiegeSide;
         5: invokevirtual #452                // Method checkSide:(Lext/mods/gameserver/model/pledge/Clan;Lext/mods/gameserver/enums/SiegeSide;)Z
         8: ifeq          18
        11: aload_1
        12: invokevirtual #456                // Method ext/mods/gameserver/model/pledge/Clan.getFlag:()Lext/mods/gameserver/model/actor/Npc;
        15: goto          19
        18: aconst_null
        19: areturn
      LineNumberTable:
        line 286: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      20     0  this   Lext/mods/gameserver/model/residence/castle/Siege;
            0      20     1  clan   Lext/mods/gameserver/model/pledge/Clan;
      StackMapTable: number_of_entries = 2
        frame_type = 18 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/model/actor/Npc ]

  public final java.util.Calendar getSiegeDate();
    descriptor: ()Ljava/util/Calendar;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #35                 // Field _castle:Lext/mods/gameserver/model/residence/castle/Castle;
         4: invokevirtual #460                // Method ext/mods/gameserver/model/residence/castle/Castle.getSiegeDate:()Ljava/util/Calendar;
         7: areturn
      LineNumberTable:
        line 292: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/residence/castle/Siege;

  public java.util.Map<ext.mods.gameserver.model.pledge.Clan, ext.mods.gameserver.enums.SiegeSide> getRegisteredClans();
    descriptor: ()Ljava/util/Map;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #10                 // Field _registeredClans:Ljava/util/Map;
         4: areturn
      LineNumberTable:
        line 297: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/residence/castle/Siege;
    Signature: #993                         // ()Ljava/util/Map<Lext/mods/gameserver/model/pledge/Clan;Lext/mods/gameserver/enums/SiegeSide;>;

  public final java.util.List<ext.mods.gameserver.model.pledge.Clan> getPendingClans();
    descriptor: ()Ljava/util/List;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #10                 // Field _registeredClans:Ljava/util/Map;
         4: invokeinterface #409,  1          // InterfaceMethod java/util/Map.entrySet:()Ljava/util/Set;
         9: invokeinterface #412,  1          // InterfaceMethod java/util/Set.stream:()Ljava/util/stream/Stream;
        14: invokedynamic #463,  0            // InvokeDynamic #8:test:()Ljava/util/function/Predicate;
        19: invokeinterface #420,  2          // InterfaceMethod java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
        24: invokedynamic #426,  0            // InvokeDynamic #6:apply:()Ljava/util/function/Function;
        29: invokeinterface #430,  2          // InterfaceMethod java/util/stream/Stream.map:(Ljava/util/function/Function;)Ljava/util/stream/Stream;
        34: invokeinterface #434,  1          // InterfaceMethod java/util/stream/Stream.toList:()Ljava/util/List;
        39: areturn
      LineNumberTable:
        line 302: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      40     0  this   Lext/mods/gameserver/model/residence/castle/Siege;
    Signature: #986                         // ()Ljava/util/List<Lext/mods/gameserver/model/pledge/Clan;>;

  public void updateClansReputation();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=2, args_size=1
         0: invokestatic  #45                 // Method ext/mods/gameserver/data/sql/ClanTable.getInstance:()Lext/mods/gameserver/data/sql/ClanTable;
         3: aload_0
         4: getfield      #35                 // Field _castle:Lext/mods/gameserver/model/residence/castle/Castle;
         7: invokevirtual #39                 // Method ext/mods/gameserver/model/residence/castle/Castle.getOwnerId:()I
        10: invokevirtual #51                 // Method ext/mods/gameserver/data/sql/ClanTable.getClan:(I)Lext/mods/gameserver/model/pledge/Clan;
        13: astore_1
        14: aload_0
        15: getfield      #186                // Field _formerOwner:Lext/mods/gameserver/model/pledge/Clan;
        18: ifnull        144
        21: aload_0
        22: getfield      #186                // Field _formerOwner:Lext/mods/gameserver/model/pledge/Clan;
        25: aload_1
        26: if_acmpeq     104
        29: aload_0
        30: getfield      #186                // Field _formerOwner:Lext/mods/gameserver/model/pledge/Clan;
        33: sipush        2000
        36: invokevirtual #464                // Method ext/mods/gameserver/model/pledge/Clan.takeReputationScore:(I)Z
        39: pop
        40: aload_0
        41: getfield      #186                // Field _formerOwner:Lext/mods/gameserver/model/pledge/Clan;
        44: iconst_1
        45: anewarray     #468                // class ext/mods/gameserver/network/serverpackets/L2GameServerPacket
        48: dup
        49: iconst_0
        50: getstatic     #470                // Field ext/mods/gameserver/network/SystemMessageId.CLAN_WAS_DEFEATED_IN_SIEGE_AND_LOST_S1_REPUTATION_POINTS:Lext/mods/gameserver/network/SystemMessageId;
        53: invokestatic  #166                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        56: sipush        1000
        59: invokevirtual #473                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        62: aastore
        63: invokevirtual #476                // Method ext/mods/gameserver/model/pledge/Clan.broadcastToMembers:([Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        66: aload_1
        67: ifnull        179
        70: aload_1
        71: sipush        1000
        74: invokevirtual #480                // Method ext/mods/gameserver/model/pledge/Clan.addReputationScore:(I)Z
        77: pop
        78: aload_1
        79: iconst_1
        80: anewarray     #468                // class ext/mods/gameserver/network/serverpackets/L2GameServerPacket
        83: dup
        84: iconst_0
        85: getstatic     #483                // Field ext/mods/gameserver/network/SystemMessageId.CLAN_VICTORIOUS_IN_SIEGE_AND_GAINED_S1_REPUTATION_POINTS:Lext/mods/gameserver/network/SystemMessageId;
        88: invokestatic  #166                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        91: sipush        1000
        94: invokevirtual #473                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        97: aastore
        98: invokevirtual #476                // Method ext/mods/gameserver/model/pledge/Clan.broadcastToMembers:([Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       101: goto          179
       104: aload_0
       105: getfield      #186                // Field _formerOwner:Lext/mods/gameserver/model/pledge/Clan;
       108: sipush        500
       111: invokevirtual #480                // Method ext/mods/gameserver/model/pledge/Clan.addReputationScore:(I)Z
       114: pop
       115: aload_0
       116: getfield      #186                // Field _formerOwner:Lext/mods/gameserver/model/pledge/Clan;
       119: iconst_1
       120: anewarray     #468                // class ext/mods/gameserver/network/serverpackets/L2GameServerPacket
       123: dup
       124: iconst_0
       125: getstatic     #483                // Field ext/mods/gameserver/network/SystemMessageId.CLAN_VICTORIOUS_IN_SIEGE_AND_GAINED_S1_REPUTATION_POINTS:Lext/mods/gameserver/network/SystemMessageId;
       128: invokestatic  #166                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       131: sipush        500
       134: invokevirtual #473                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       137: aastore
       138: invokevirtual #476                // Method ext/mods/gameserver/model/pledge/Clan.broadcastToMembers:([Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       141: goto          179
       144: aload_1
       145: ifnull        179
       148: aload_1
       149: sipush        1000
       152: invokevirtual #480                // Method ext/mods/gameserver/model/pledge/Clan.addReputationScore:(I)Z
       155: pop
       156: aload_1
       157: iconst_1
       158: anewarray     #468                // class ext/mods/gameserver/network/serverpackets/L2GameServerPacket
       161: dup
       162: iconst_0
       163: getstatic     #483                // Field ext/mods/gameserver/network/SystemMessageId.CLAN_VICTORIOUS_IN_SIEGE_AND_GAINED_S1_REPUTATION_POINTS:Lext/mods/gameserver/network/SystemMessageId;
       166: invokestatic  #166                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       169: sipush        1000
       172: invokevirtual #473                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       175: aastore
       176: invokevirtual #476                // Method ext/mods/gameserver/model/pledge/Clan.broadcastToMembers:([Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       179: return
      LineNumberTable:
        line 315: 0
        line 316: 14
        line 318: 21
        line 320: 29
        line 321: 40
        line 323: 66
        line 325: 70
        line 326: 78
        line 331: 104
        line 332: 115
        line 335: 144
        line 337: 148
        line 338: 156
        line 340: 179
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     180     0  this   Lext/mods/gameserver/model/residence/castle/Siege;
           14     166     1 owner   Lext/mods/gameserver/model/pledge/Clan;
      StackMapTable: number_of_entries = 3
        frame_type = 252 /* append */
          offset_delta = 104
          locals = [ class ext/mods/gameserver/model/pledge/Clan ]
        frame_type = 39 /* same */
        frame_type = 34 /* same */

  public ext.mods.gameserver.enums.SiegeSide getSide(ext.mods.gameserver.model.pledge.Clan);
    descriptor: (Lext/mods/gameserver/model/pledge/Clan;)Lext/mods/gameserver/enums/SiegeSide;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #10                 // Field _registeredClans:Ljava/util/Map;
         4: aload_1
         5: invokeinterface #438,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        10: checkcast     #56                 // class ext/mods/gameserver/enums/SiegeSide
        13: areturn
      LineNumberTable:
        line 368: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0  this   Lext/mods/gameserver/model/residence/castle/Siege;
            0      14     1  clan   Lext/mods/gameserver/model/pledge/Clan;

  public boolean isOnOppositeSide(ext.mods.gameserver.model.pledge.Clan, ext.mods.gameserver.model.pledge.Clan);
    descriptor: (Lext/mods/gameserver/model/pledge/Clan;Lext/mods/gameserver/model/pledge/Clan;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=5, args_size=3
         0: aload_1
         1: ifnull        8
         4: aload_2
         5: ifnonnull     10
         8: iconst_0
         9: ireturn
        10: aload_0
        11: getfield      #10                 // Field _registeredClans:Ljava/util/Map;
        14: aload_1
        15: invokeinterface #438,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        20: checkcast     #56                 // class ext/mods/gameserver/enums/SiegeSide
        23: astore_3
        24: aload_0
        25: getfield      #10                 // Field _registeredClans:Ljava/util/Map;
        28: aload_2
        29: invokeinterface #438,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        34: checkcast     #56                 // class ext/mods/gameserver/enums/SiegeSide
        37: astore        4
        39: aload_3
        40: ifnull        48
        43: aload         4
        45: ifnonnull     50
        48: iconst_0
        49: ireturn
        50: getstatic     #494                // Field ext/mods/gameserver/model/residence/castle/Siege$1.$SwitchMap$ext$mods$gameserver$enums$SiegeSide:[I
        53: aload_3
        54: invokevirtual #500                // Method ext/mods/gameserver/enums/SiegeSide.ordinal:()I
        57: iaload
        58: tableswitch   { // 1 to 4

                       1: 88

                       2: 88

                       3: 88

                       4: 102
                 default: 132
            }
        88: aload         4
        90: getstatic     #243                // Field ext/mods/gameserver/enums/SiegeSide.ATTACKER:Lext/mods/gameserver/enums/SiegeSide;
        93: if_acmpne     100
        96: iconst_1
        97: goto          101
       100: iconst_0
       101: ireturn
       102: aload         4
       104: getstatic     #55                 // Field ext/mods/gameserver/enums/SiegeSide.OWNER:Lext/mods/gameserver/enums/SiegeSide;
       107: if_acmpeq     126
       110: aload         4
       112: getstatic     #503                // Field ext/mods/gameserver/enums/SiegeSide.DEFENDER:Lext/mods/gameserver/enums/SiegeSide;
       115: if_acmpeq     126
       118: aload         4
       120: getstatic     #506                // Field ext/mods/gameserver/enums/SiegeSide.PENDING:Lext/mods/gameserver/enums/SiegeSide;
       123: if_acmpne     130
       126: iconst_1
       127: goto          131
       130: iconst_0
       131: ireturn
       132: iconst_0
       133: ireturn
      LineNumberTable:
        line 379: 0
        line 380: 8
        line 382: 10
        line 383: 24
        line 385: 39
        line 386: 48
        line 388: 50
        line 391: 88
        line 394: 102
        line 396: 132
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     134     0  this   Lext/mods/gameserver/model/residence/castle/Siege;
            0     134     1 formerClan   Lext/mods/gameserver/model/pledge/Clan;
            0     134     2 targetClan   Lext/mods/gameserver/model/pledge/Clan;
           24     110     3 formerSide   Lext/mods/gameserver/enums/SiegeSide;
           39      95     4 targetSide   Lext/mods/gameserver/enums/SiegeSide;
      StackMapTable: number_of_entries = 12
        frame_type = 8 /* same */
        frame_type = 1 /* same */
        frame_type = 253 /* append */
          offset_delta = 37
          locals = [ class ext/mods/gameserver/enums/SiegeSide, class ext/mods/gameserver/enums/SiegeSide ]
        frame_type = 1 /* same */
        frame_type = 37 /* same */
        frame_type = 11 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 0 /* same */
        frame_type = 23 /* same */
        frame_type = 3 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 0 /* same */

  public void midVictory();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=6, args_size=1
         0: aload_0
         1: invokevirtual #146                // Method isInProgress:()Z
         4: ifne          8
         7: return
         8: aload_0
         9: getfield      #35                 // Field _castle:Lext/mods/gameserver/model/residence/castle/Castle;
        12: invokevirtual #389                // Method ext/mods/gameserver/model/residence/castle/Castle.despawnSiegeGuardsOrMercenaries:()V
        15: aload_0
        16: getfield      #35                 // Field _castle:Lext/mods/gameserver/model/residence/castle/Castle;
        19: invokevirtual #227                // Method ext/mods/gameserver/model/residence/castle/Castle.spawnSiegeGuardsOrMercenaries:()V
        22: aload_0
        23: getfield      #35                 // Field _castle:Lext/mods/gameserver/model/residence/castle/Castle;
        26: invokevirtual #39                 // Method ext/mods/gameserver/model/residence/castle/Castle.getOwnerId:()I
        29: ifgt          33
        32: return
        33: aload_0
        34: invokevirtual #149                // Method getAttackerClans:()Ljava/util/List;
        37: astore_1
        38: invokestatic  #45                 // Method ext/mods/gameserver/data/sql/ClanTable.getInstance:()Lext/mods/gameserver/data/sql/ClanTable;
        41: aload_0
        42: getfield      #35                 // Field _castle:Lext/mods/gameserver/model/residence/castle/Castle;
        45: invokevirtual #39                 // Method ext/mods/gameserver/model/residence/castle/Castle.getOwnerId:()I
        48: invokevirtual #51                 // Method ext/mods/gameserver/data/sql/ClanTable.getClan:(I)Lext/mods/gameserver/model/pledge/Clan;
        51: astore_2
        52: aload_2
        53: invokevirtual #509                // Method ext/mods/gameserver/model/pledge/Clan.getAllyId:()I
        56: istore_3
        57: aload_0
        58: getstatic     #512                // Field ext/mods/gameserver/network/SystemMessageId.TEMPORARY_ALLIANCE_DISSOLVED:Lext/mods/gameserver/network/SystemMessageId;
        61: iconst_1
        62: anewarray     #56                 // class ext/mods/gameserver/enums/SiegeSide
        65: dup
        66: iconst_0
        67: getstatic     #243                // Field ext/mods/gameserver/enums/SiegeSide.ATTACKER:Lext/mods/gameserver/enums/SiegeSide;
        70: aastore
        71: invokevirtual #246                // Method announce:(Lext/mods/gameserver/network/SystemMessageId;[Lext/mods/gameserver/enums/SiegeSide;)V
        74: aload_0
        75: getstatic     #243                // Field ext/mods/gameserver/enums/SiegeSide.ATTACKER:Lext/mods/gameserver/enums/SiegeSide;
        78: iconst_2
        79: anewarray     #56                 // class ext/mods/gameserver/enums/SiegeSide
        82: dup
        83: iconst_0
        84: getstatic     #503                // Field ext/mods/gameserver/enums/SiegeSide.DEFENDER:Lext/mods/gameserver/enums/SiegeSide;
        87: aastore
        88: dup
        89: iconst_1
        90: getstatic     #55                 // Field ext/mods/gameserver/enums/SiegeSide.OWNER:Lext/mods/gameserver/enums/SiegeSide;
        93: aastore
        94: invokevirtual #515                // Method switchSides:(Lext/mods/gameserver/enums/SiegeSide;[Lext/mods/gameserver/enums/SiegeSide;)V
        97: aload_0
        98: aload_2
        99: getstatic     #55                 // Field ext/mods/gameserver/enums/SiegeSide.OWNER:Lext/mods/gameserver/enums/SiegeSide;
       102: invokevirtual #519                // Method switchSide:(Lext/mods/gameserver/model/pledge/Clan;Lext/mods/gameserver/enums/SiegeSide;)V
       105: iload_3
       106: ifeq          160
       109: aload_1
       110: invokeinterface #523,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
       115: astore        4
       117: aload         4
       119: invokeinterface #334,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       124: ifeq          160
       127: aload         4
       129: invokeinterface #339,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       134: checkcast     #289                // class ext/mods/gameserver/model/pledge/Clan
       137: astore        5
       139: aload         5
       141: invokevirtual #509                // Method ext/mods/gameserver/model/pledge/Clan.getAllyId:()I
       144: iload_3
       145: if_icmpne     157
       148: aload_0
       149: aload         5
       151: getstatic     #503                // Field ext/mods/gameserver/enums/SiegeSide.DEFENDER:Lext/mods/gameserver/enums/SiegeSide;
       154: invokevirtual #519                // Method switchSide:(Lext/mods/gameserver/model/pledge/Clan;Lext/mods/gameserver/enums/SiegeSide;)V
       157: goto          117
       160: aload_0
       161: getfield      #35                 // Field _castle:Lext/mods/gameserver/model/residence/castle/Castle;
       164: invokevirtual #197                // Method ext/mods/gameserver/model/residence/castle/Castle.getSiegeZone:()Lext/mods/gameserver/model/zone/type/SiegeZone;
       167: aload_0
       168: getfield      #35                 // Field _castle:Lext/mods/gameserver/model/residence/castle/Castle;
       171: invokevirtual #39                 // Method ext/mods/gameserver/model/residence/castle/Castle.getOwnerId:()I
       174: invokevirtual #201                // Method ext/mods/gameserver/model/zone/type/SiegeZone.banishForeigners:(I)V
       177: aload_1
       178: invokeinterface #523,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
       183: astore        4
       185: aload         4
       187: invokeinterface #334,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       192: ifeq          216
       195: aload         4
       197: invokeinterface #339,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       202: checkcast     #289                // class ext/mods/gameserver/model/pledge/Clan
       205: astore        5
       207: aload         5
       209: aconst_null
       210: invokevirtual #378                // Method ext/mods/gameserver/model/pledge/Clan.setFlag:(Lext/mods/gameserver/model/actor/Npc;)V
       213: goto          185
       216: aload_0
       217: getfield      #35                 // Field _castle:Lext/mods/gameserver/model/residence/castle/Castle;
       220: invokevirtual #524                // Method ext/mods/gameserver/model/residence/castle/Castle.removeDoorUpgrade:()V
       223: aload_0
       224: getfield      #35                 // Field _castle:Lext/mods/gameserver/model/residence/castle/Castle;
       227: invokevirtual #527                // Method ext/mods/gameserver/model/residence/castle/Castle.removeTrapUpgrade:()V
       230: aload_0
       231: getfield      #35                 // Field _castle:Lext/mods/gameserver/model/residence/castle/Castle;
       234: iconst_1
       235: invokevirtual #392                // Method ext/mods/gameserver/model/residence/castle/Castle.spawnDoors:(Z)V
       238: aload_0
       239: getfield      #35                 // Field _castle:Lext/mods/gameserver/model/residence/castle/Castle;
       242: invokevirtual #213                // Method ext/mods/gameserver/model/residence/castle/Castle.getControlTowers:()Ljava/util/List;
       245: invokedynamic #530,  0            // InvokeDynamic #9:accept:()Ljava/util/function/Consumer;
       250: invokeinterface #220,  2          // InterfaceMethod java/util/List.forEach:(Ljava/util/function/Consumer;)V
       255: aload_0
       256: iconst_0
       257: invokevirtual #210                // Method updatePlayerSiegeStateFlags:(Z)V
       260: return
      LineNumberTable:
        line 404: 0
        line 405: 7
        line 407: 8
        line 409: 15
        line 411: 22
        line 412: 32
        line 414: 33
        line 416: 38
        line 417: 52
        line 419: 57
        line 421: 74
        line 423: 97
        line 425: 105
        line 427: 109
        line 429: 139
        line 430: 148
        line 431: 157
        line 433: 160
        line 435: 177
        line 436: 207
        line 438: 216
        line 440: 223
        line 442: 230
        line 444: 238
        line 446: 255
        line 447: 260
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          139      18     5  clan   Lext/mods/gameserver/model/pledge/Clan;
          207       6     5  clan   Lext/mods/gameserver/model/pledge/Clan;
            0     261     0  this   Lext/mods/gameserver/model/residence/castle/Siege;
           38     223     1 attackers   Ljava/util/List;
           52     209     2 castleOwner   Lext/mods/gameserver/model/pledge/Clan;
           57     204     3 allyId   I
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
           38     223     1 attackers   Ljava/util/List<Lext/mods/gameserver/model/pledge/Clan;>;
      StackMapTable: number_of_entries = 7
        frame_type = 8 /* same */
        frame_type = 24 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 83
          locals = [ class ext/mods/gameserver/model/residence/castle/Siege, class java/util/List, class ext/mods/gameserver/model/pledge/Clan, int, class java/util/Iterator ]
          stack = []
        frame_type = 39 /* same */
        frame_type = 250 /* chop */
          offset_delta = 2
        frame_type = 252 /* append */
          offset_delta = 24
          locals = [ class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 30

  public void announce(ext.mods.gameserver.network.serverpackets.SystemMessage, ext.mods.gameserver.enums.SiegeSide...);
    descriptor: (Lext/mods/gameserver/network/serverpackets/SystemMessage;[Lext/mods/gameserver/enums/SiegeSide;)V
    flags: (0x0081) ACC_PUBLIC, ACC_VARARGS
    Code:
      stack=2, locals=7, args_size=3
         0: aload_2
         1: astore_3
         2: aload_3
         3: arraylength
         4: istore        4
         6: iconst_0
         7: istore        5
         9: iload         5
        11: iload         4
        13: if_icmpge     77
        16: aload_3
        17: iload         5
        19: aaload
        20: astore        6
        22: aload         6
        24: getstatic     #243                // Field ext/mods/gameserver/enums/SiegeSide.ATTACKER:Lext/mods/gameserver/enums/SiegeSide;
        27: if_acmpne     48
        30: aload_0
        31: invokevirtual #149                // Method getAttackerClans:()Ljava/util/List;
        34: aload_1
        35: invokedynamic #531,  0            // InvokeDynamic #10:accept:(Lext/mods/gameserver/network/serverpackets/SystemMessage;)Ljava/util/function/Consumer;
        40: invokeinterface #220,  2          // InterfaceMethod java/util/List.forEach:(Ljava/util/function/Consumer;)V
        45: goto          71
        48: aload         6
        50: getstatic     #503                // Field ext/mods/gameserver/enums/SiegeSide.DEFENDER:Lext/mods/gameserver/enums/SiegeSide;
        53: if_acmpne     71
        56: aload_0
        57: invokevirtual #534                // Method getDefenderClans:()Ljava/util/List;
        60: aload_1
        61: invokedynamic #537,  0            // InvokeDynamic #11:accept:(Lext/mods/gameserver/network/serverpackets/SystemMessage;)Ljava/util/function/Consumer;
        66: invokeinterface #220,  2          // InterfaceMethod java/util/List.forEach:(Ljava/util/function/Consumer;)V
        71: iinc          5, 1
        74: goto          9
        77: return
      LineNumberTable:
        line 456: 0
        line 458: 22
        line 459: 30
        line 460: 48
        line 461: 56
        line 456: 71
        line 463: 77
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           22      49     6  side   Lext/mods/gameserver/enums/SiegeSide;
            0      78     0  this   Lext/mods/gameserver/model/residence/castle/Siege;
            0      78     1    sm   Lext/mods/gameserver/network/serverpackets/SystemMessage;
            0      78     2 sides   [Lext/mods/gameserver/enums/SiegeSide;
      StackMapTable: number_of_entries = 4
        frame_type = 254 /* append */
          offset_delta = 9
          locals = [ class "[Lext/mods/gameserver/enums/SiegeSide;", int, int ]
        frame_type = 252 /* append */
          offset_delta = 38
          locals = [ class ext/mods/gameserver/enums/SiegeSide ]
        frame_type = 250 /* chop */
          offset_delta = 22
        frame_type = 248 /* chop */
          offset_delta = 5

  public void announce(ext.mods.gameserver.network.SystemMessageId, ext.mods.gameserver.enums.SiegeSide...);
    descriptor: (Lext/mods/gameserver/network/SystemMessageId;[Lext/mods/gameserver/enums/SiegeSide;)V
    flags: (0x0081) ACC_PUBLIC, ACC_VARARGS
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: invokestatic  #166                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
         5: aload_2
         6: invokevirtual #538                // Method announce:(Lext/mods/gameserver/network/serverpackets/SystemMessage;[Lext/mods/gameserver/enums/SiegeSide;)V
         9: return
      LineNumberTable:
        line 473: 0
        line 474: 9
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/gameserver/model/residence/castle/Siege;
            0      10     1  smId   Lext/mods/gameserver/network/SystemMessageId;
            0      10     2 sides   [Lext/mods/gameserver/enums/SiegeSide;

  public void clearAllClans();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=5, args_size=1
         0: invokestatic  #67                 // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
         3: astore_1
         4: aload_1
         5: ldc_w         #555                // String DELETE FROM siege_clans WHERE castle_id=?
         8: invokeinterface #75,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        13: astore_2
        14: aload_2
        15: iconst_1
        16: aload_0
        17: getfield      #35                 // Field _castle:Lext/mods/gameserver/model/residence/castle/Castle;
        20: invokevirtual #81                 // Method ext/mods/gameserver/model/residence/castle/Castle.getId:()I
        23: invokeinterface #84,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        28: aload_2
        29: invokeinterface #557,  1          // InterfaceMethod java/sql/PreparedStatement.executeUpdate:()I
        34: pop
        35: aload_2
        36: ifnull        72
        39: aload_2
        40: invokeinterface #127,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
        45: goto          72
        48: astore_3
        49: aload_2
        50: ifnull        70
        53: aload_2
        54: invokeinterface #127,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
        59: goto          70
        62: astore        4
        64: aload_3
        65: aload         4
        67: invokevirtual #123                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        70: aload_3
        71: athrow
        72: aload_1
        73: ifnull        107
        76: aload_1
        77: invokeinterface #128,  1          // InterfaceMethod java/sql/Connection.close:()V
        82: goto          107
        85: astore_2
        86: aload_1
        87: ifnull        105
        90: aload_1
        91: invokeinterface #128,  1          // InterfaceMethod java/sql/Connection.close:()V
        96: goto          105
        99: astore_3
       100: aload_2
       101: aload_3
       102: invokevirtual #123                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       105: aload_2
       106: athrow
       107: goto          121
       110: astore_1
       111: getstatic     #131                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       114: ldc_w         #560                // String Couldn\'t clear siege registered clans.
       117: aload_1
       118: invokevirtual #137                // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
       121: aload_0
       122: getfield      #10                 // Field _registeredClans:Ljava/util/Map;
       125: invokeinterface #562,  1          // InterfaceMethod java/util/Map.clear:()V
       130: aload_0
       131: getfield      #35                 // Field _castle:Lext/mods/gameserver/model/residence/castle/Castle;
       134: invokevirtual #39                 // Method ext/mods/gameserver/model/residence/castle/Castle.getOwnerId:()I
       137: ifle          172
       140: invokestatic  #45                 // Method ext/mods/gameserver/data/sql/ClanTable.getInstance:()Lext/mods/gameserver/data/sql/ClanTable;
       143: aload_0
       144: getfield      #35                 // Field _castle:Lext/mods/gameserver/model/residence/castle/Castle;
       147: invokevirtual #39                 // Method ext/mods/gameserver/model/residence/castle/Castle.getOwnerId:()I
       150: invokevirtual #51                 // Method ext/mods/gameserver/data/sql/ClanTable.getClan:(I)Lext/mods/gameserver/model/pledge/Clan;
       153: astore_1
       154: aload_1
       155: ifnull        172
       158: aload_0
       159: getfield      #10                 // Field _registeredClans:Ljava/util/Map;
       162: aload_1
       163: getstatic     #55                 // Field ext/mods/gameserver/enums/SiegeSide.OWNER:Lext/mods/gameserver/enums/SiegeSide;
       166: invokeinterface #61,  3           // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
       171: pop
       172: return
      Exception table:
         from    to  target type
            14    35    48   Class java/lang/Throwable
            53    59    62   Class java/lang/Throwable
             4    72    85   Class java/lang/Throwable
            90    96    99   Class java/lang/Throwable
             0   107   110   Class java/lang/Exception
      LineNumberTable:
        line 502: 0
        line 503: 4
        line 505: 14
        line 506: 28
        line 507: 35
        line 502: 48
        line 507: 72
        line 502: 85
        line 511: 107
        line 508: 110
        line 510: 111
        line 513: 121
        line 515: 130
        line 517: 140
        line 518: 154
        line 519: 158
        line 521: 172
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           14      58     2    ps   Ljava/sql/PreparedStatement;
            4     103     1   con   Ljava/sql/Connection;
          111      10     1     e   Ljava/lang/Exception;
          154      18     1  clan   Lext/mods/gameserver/model/pledge/Clan;
            0     173     0  this   Lext/mods/gameserver/model/residence/castle/Siege;
      StackMapTable: number_of_entries = 11
        frame_type = 255 /* full_frame */
          offset_delta = 48
          locals = [ class ext/mods/gameserver/model/residence/castle/Siege, class java/sql/Connection, class java/sql/PreparedStatement ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/model/residence/castle/Siege, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 7 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/model/residence/castle/Siege, class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 5 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 10 /* same */
        frame_type = 50 /* same */

  protected void clearPendingClans();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=3, locals=5, args_size=1
         0: invokestatic  #67                 // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
         3: astore_1
         4: aload_1
         5: ldc_w         #565                // String DELETE FROM siege_clans WHERE castle_id=? AND type=\'PENDING\'
         8: invokeinterface #75,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        13: astore_2
        14: aload_2
        15: iconst_1
        16: aload_0
        17: getfield      #35                 // Field _castle:Lext/mods/gameserver/model/residence/castle/Castle;
        20: invokevirtual #81                 // Method ext/mods/gameserver/model/residence/castle/Castle.getId:()I
        23: invokeinterface #84,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        28: aload_2
        29: invokeinterface #557,  1          // InterfaceMethod java/sql/PreparedStatement.executeUpdate:()I
        34: pop
        35: aload_2
        36: ifnull        72
        39: aload_2
        40: invokeinterface #127,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
        45: goto          72
        48: astore_3
        49: aload_2
        50: ifnull        70
        53: aload_2
        54: invokeinterface #127,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
        59: goto          70
        62: astore        4
        64: aload_3
        65: aload         4
        67: invokevirtual #123                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        70: aload_3
        71: athrow
        72: aload_1
        73: ifnull        107
        76: aload_1
        77: invokeinterface #128,  1          // InterfaceMethod java/sql/Connection.close:()V
        82: goto          107
        85: astore_2
        86: aload_1
        87: ifnull        105
        90: aload_1
        91: invokeinterface #128,  1          // InterfaceMethod java/sql/Connection.close:()V
        96: goto          105
        99: astore_3
       100: aload_2
       101: aload_3
       102: invokevirtual #123                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       105: aload_2
       106: athrow
       107: goto          121
       110: astore_1
       111: getstatic     #131                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       114: ldc_w         #567                // String Couldn\'t clear siege pending clans.
       117: aload_1
       118: invokevirtual #137                // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
       121: aload_0
       122: getfield      #10                 // Field _registeredClans:Ljava/util/Map;
       125: invokeinterface #409,  1          // InterfaceMethod java/util/Map.entrySet:()Ljava/util/Set;
       130: invokedynamic #569,  0            // InvokeDynamic #12:test:()Ljava/util/function/Predicate;
       135: invokeinterface #570,  2          // InterfaceMethod java/util/Set.removeIf:(Ljava/util/function/Predicate;)Z
       140: pop
       141: return
      Exception table:
         from    to  target type
            14    35    48   Class java/lang/Throwable
            53    59    62   Class java/lang/Throwable
             4    72    85   Class java/lang/Throwable
            90    96    99   Class java/lang/Throwable
             0   107   110   Class java/lang/Exception
      LineNumberTable:
        line 526: 0
        line 527: 4
        line 529: 14
        line 530: 28
        line 531: 35
        line 526: 48
        line 531: 72
        line 526: 85
        line 535: 107
        line 532: 110
        line 534: 111
        line 537: 121
        line 538: 141
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           14      58     2    ps   Ljava/sql/PreparedStatement;
            4     103     1   con   Ljava/sql/Connection;
          111      10     1     e   Ljava/lang/Exception;
            0     142     0  this   Lext/mods/gameserver/model/residence/castle/Siege;
      StackMapTable: number_of_entries = 10
        frame_type = 255 /* full_frame */
          offset_delta = 48
          locals = [ class ext/mods/gameserver/model/residence/castle/Siege, class java/sql/Connection, class java/sql/PreparedStatement ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/model/residence/castle/Siege, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 7 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/model/residence/castle/Siege, class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 5 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 10 /* same */

  public void registerAttacker(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=2
         0: aload_1
         1: invokevirtual #574                // Method ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
         4: ifnonnull     8
         7: return
         8: iconst_0
         9: istore_2
        10: aload_0
        11: getfield      #35                 // Field _castle:Lext/mods/gameserver/model/residence/castle/Castle;
        14: invokevirtual #39                 // Method ext/mods/gameserver/model/residence/castle/Castle.getOwnerId:()I
        17: ifeq          37
        20: invokestatic  #45                 // Method ext/mods/gameserver/data/sql/ClanTable.getInstance:()Lext/mods/gameserver/data/sql/ClanTable;
        23: aload_0
        24: getfield      #35                 // Field _castle:Lext/mods/gameserver/model/residence/castle/Castle;
        27: invokevirtual #39                 // Method ext/mods/gameserver/model/residence/castle/Castle.getOwnerId:()I
        30: invokevirtual #51                 // Method ext/mods/gameserver/data/sql/ClanTable.getClan:(I)Lext/mods/gameserver/model/pledge/Clan;
        33: invokevirtual #509                // Method ext/mods/gameserver/model/pledge/Clan.getAllyId:()I
        36: istore_2
        37: iload_2
        38: ifeq          60
        41: aload_1
        42: invokevirtual #574                // Method ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
        45: invokevirtual #509                // Method ext/mods/gameserver/model/pledge/Clan.getAllyId:()I
        48: iload_2
        49: if_icmpne     60
        52: aload_1
        53: getstatic     #577                // Field ext/mods/gameserver/network/SystemMessageId.CANNOT_ATTACK_ALLIANCE_CASTLE:Lext/mods/gameserver/network/SystemMessageId;
        56: invokevirtual #580                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        59: return
        60: aload_0
        61: aload_1
        62: invokevirtual #574                // Method ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
        65: iconst_1
        66: invokevirtual #583                // Method allyIsRegisteredOnOppositeSide:(Lext/mods/gameserver/model/pledge/Clan;Z)Z
        69: ifeq          82
        72: aload_1
        73: getstatic     #587                // Field ext/mods/gameserver/network/SystemMessageId.CANT_ACCEPT_ALLY_ENEMY_FOR_SIEGE:Lext/mods/gameserver/network/SystemMessageId;
        76: invokevirtual #580                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        79: goto          112
        82: aload_0
        83: aload_1
        84: getstatic     #243                // Field ext/mods/gameserver/enums/SiegeSide.ATTACKER:Lext/mods/gameserver/enums/SiegeSide;
        87: invokevirtual #590                // Method checkIfCanRegister:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/enums/SiegeSide;)Z
        90: ifeq          112
        93: aload_0
        94: aload_1
        95: invokevirtual #574                // Method ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
        98: getstatic     #243                // Field ext/mods/gameserver/enums/SiegeSide.ATTACKER:Lext/mods/gameserver/enums/SiegeSide;
       101: invokevirtual #594                // Method registerClan:(Lext/mods/gameserver/model/pledge/Clan;Lext/mods/gameserver/enums/SiegeSide;)V
       104: invokestatic  #271                // Method ext/mods/extensions/listener/manager/SiegeListenerManager.getInstance:()Lext/mods/extensions/listener/manager/SiegeListenerManager;
       107: aload_0
       108: aload_1
       109: invokevirtual #597                // Method ext/mods/extensions/listener/manager/SiegeListenerManager.notifyRegisterAttacker:(Lext/mods/gameserver/model/residence/castle/Siege;Lext/mods/gameserver/model/actor/Player;)V
       112: return
      LineNumberTable:
        line 546: 0
        line 547: 7
        line 549: 8
        line 550: 10
        line 551: 20
        line 553: 37
        line 555: 52
        line 556: 59
        line 559: 60
        line 560: 72
        line 561: 82
        line 563: 93
        line 564: 104
        line 566: 112
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     113     0  this   Lext/mods/gameserver/model/residence/castle/Siege;
            0     113     1 player   Lext/mods/gameserver/model/actor/Player;
           10     103     2 allyId   I
      StackMapTable: number_of_entries = 5
        frame_type = 8 /* same */
        frame_type = 252 /* append */
          offset_delta = 28
          locals = [ int ]
        frame_type = 22 /* same */
        frame_type = 21 /* same */
        frame_type = 29 /* same */

  public void registerDefender(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: aload_1
         1: invokevirtual #574                // Method ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
         4: ifnonnull     8
         7: return
         8: aload_0
         9: getfield      #35                 // Field _castle:Lext/mods/gameserver/model/residence/castle/Castle;
        12: invokevirtual #39                 // Method ext/mods/gameserver/model/residence/castle/Castle.getOwnerId:()I
        15: ifgt          28
        18: aload_1
        19: getstatic     #601                // Field ext/mods/gameserver/network/SystemMessageId.DEFENDER_SIDE_FULL:Lext/mods/gameserver/network/SystemMessageId;
        22: invokevirtual #580                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        25: goto          80
        28: aload_0
        29: aload_1
        30: invokevirtual #574                // Method ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
        33: iconst_0
        34: invokevirtual #583                // Method allyIsRegisteredOnOppositeSide:(Lext/mods/gameserver/model/pledge/Clan;Z)Z
        37: ifeq          50
        40: aload_1
        41: getstatic     #587                // Field ext/mods/gameserver/network/SystemMessageId.CANT_ACCEPT_ALLY_ENEMY_FOR_SIEGE:Lext/mods/gameserver/network/SystemMessageId;
        44: invokevirtual #580                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        47: goto          80
        50: aload_0
        51: aload_1
        52: getstatic     #506                // Field ext/mods/gameserver/enums/SiegeSide.PENDING:Lext/mods/gameserver/enums/SiegeSide;
        55: invokevirtual #590                // Method checkIfCanRegister:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/enums/SiegeSide;)Z
        58: ifeq          80
        61: aload_0
        62: aload_1
        63: invokevirtual #574                // Method ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
        66: getstatic     #506                // Field ext/mods/gameserver/enums/SiegeSide.PENDING:Lext/mods/gameserver/enums/SiegeSide;
        69: invokevirtual #594                // Method registerClan:(Lext/mods/gameserver/model/pledge/Clan;Lext/mods/gameserver/enums/SiegeSide;)V
        72: invokestatic  #271                // Method ext/mods/extensions/listener/manager/SiegeListenerManager.getInstance:()Lext/mods/extensions/listener/manager/SiegeListenerManager;
        75: aload_0
        76: aload_1
        77: invokevirtual #604                // Method ext/mods/extensions/listener/manager/SiegeListenerManager.notifyRegisterDefender:(Lext/mods/gameserver/model/residence/castle/Siege;Lext/mods/gameserver/model/actor/Player;)V
        80: return
      LineNumberTable:
        line 574: 0
        line 575: 7
        line 577: 8
        line 578: 18
        line 579: 28
        line 580: 40
        line 581: 50
        line 583: 61
        line 584: 72
        line 586: 80
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      81     0  this   Lext/mods/gameserver/model/residence/castle/Siege;
            0      81     1 player   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 4
        frame_type = 8 /* same */
        frame_type = 19 /* same */
        frame_type = 21 /* same */
        frame_type = 29 /* same */

  public void unregisterClan(ext.mods.gameserver.model.pledge.Clan);
    descriptor: (Lext/mods/gameserver/model/pledge/Clan;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=6, args_size=2
         0: aload_1
         1: ifnull        31
         4: aload_1
         5: invokevirtual #614                // Method ext/mods/gameserver/model/pledge/Clan.getCastleId:()I
         8: aload_0
         9: getfield      #35                 // Field _castle:Lext/mods/gameserver/model/residence/castle/Castle;
        12: invokevirtual #81                 // Method ext/mods/gameserver/model/residence/castle/Castle.getId:()I
        15: if_icmpeq     31
        18: aload_0
        19: getfield      #10                 // Field _registeredClans:Ljava/util/Map;
        22: aload_1
        23: invokeinterface #617,  2          // InterfaceMethod java/util/Map.remove:(Ljava/lang/Object;)Ljava/lang/Object;
        28: ifnonnull     32
        31: return
        32: invokestatic  #67                 // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
        35: astore_2
        36: aload_2
        37: ldc_w         #620                // String DELETE FROM siege_clans WHERE castle_id=? AND clan_id=?
        40: invokeinterface #75,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        45: astore_3
        46: aload_3
        47: iconst_1
        48: aload_0
        49: getfield      #35                 // Field _castle:Lext/mods/gameserver/model/residence/castle/Castle;
        52: invokevirtual #81                 // Method ext/mods/gameserver/model/residence/castle/Castle.getId:()I
        55: invokeinterface #84,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        60: aload_3
        61: iconst_2
        62: aload_1
        63: invokevirtual #402                // Method ext/mods/gameserver/model/pledge/Clan.getClanId:()I
        66: invokeinterface #84,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        71: aload_3
        72: invokeinterface #557,  1          // InterfaceMethod java/sql/PreparedStatement.executeUpdate:()I
        77: pop
        78: aload_3
        79: ifnull        118
        82: aload_3
        83: invokeinterface #127,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
        88: goto          118
        91: astore        4
        93: aload_3
        94: ifnull        115
        97: aload_3
        98: invokeinterface #127,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       103: goto          115
       106: astore        5
       108: aload         4
       110: aload         5
       112: invokevirtual #123                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       115: aload         4
       117: athrow
       118: aload_2
       119: ifnull        155
       122: aload_2
       123: invokeinterface #128,  1          // InterfaceMethod java/sql/Connection.close:()V
       128: goto          155
       131: astore_3
       132: aload_2
       133: ifnull        153
       136: aload_2
       137: invokeinterface #128,  1          // InterfaceMethod java/sql/Connection.close:()V
       142: goto          153
       145: astore        4
       147: aload_3
       148: aload         4
       150: invokevirtual #123                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       153: aload_3
       154: athrow
       155: goto          169
       158: astore_2
       159: getstatic     #131                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       162: ldc_w         #622                // String Couldn\'t unregister clan on siege.
       165: aload_2
       166: invokevirtual #137                // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
       169: return
      Exception table:
         from    to  target type
            46    78    91   Class java/lang/Throwable
            97   103   106   Class java/lang/Throwable
            36   118   131   Class java/lang/Throwable
           136   142   145   Class java/lang/Throwable
            32   155   158   Class java/lang/Exception
      LineNumberTable:
        line 628: 0
        line 629: 31
        line 631: 32
        line 632: 36
        line 634: 46
        line 635: 60
        line 636: 71
        line 637: 78
        line 631: 91
        line 637: 118
        line 631: 131
        line 641: 155
        line 638: 158
        line 640: 159
        line 642: 169
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           46      72     3    ps   Ljava/sql/PreparedStatement;
           36     119     2   con   Ljava/sql/Connection;
          159      10     2     e   Ljava/lang/Exception;
            0     170     0  this   Lext/mods/gameserver/model/residence/castle/Siege;
            0     170     1  clan   Lext/mods/gameserver/model/pledge/Clan;
      StackMapTable: number_of_entries = 12
        frame_type = 31 /* same */
        frame_type = 0 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 58
          locals = [ class ext/mods/gameserver/model/residence/castle/Siege, class ext/mods/gameserver/model/pledge/Clan, class java/sql/Connection, class java/sql/PreparedStatement ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 14
          locals = [ class ext/mods/gameserver/model/residence/castle/Siege, class ext/mods/gameserver/model/pledge/Clan, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/model/residence/castle/Siege, class ext/mods/gameserver/model/pledge/Clan, class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 7 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 10 /* same */

  public boolean checkIfAlreadyRegisteredForSameDay(ext.mods.gameserver.model.pledge.Clan);
    descriptor: (Lext/mods/gameserver/model/pledge/Clan;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=5, args_size=2
         0: invokestatic  #705                // Method ext/mods/gameserver/data/manager/CastleManager.getInstance:()Lext/mods/gameserver/data/manager/CastleManager;
         3: invokevirtual #710                // Method ext/mods/gameserver/data/manager/CastleManager.getCastles:()Ljava/util/Collection;
         6: invokeinterface #328,  1          // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
        11: astore_2
        12: aload_2
        13: invokeinterface #334,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        18: ifeq          82
        21: aload_2
        22: invokeinterface #339,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        27: checkcast     #40                 // class ext/mods/gameserver/model/residence/castle/Castle
        30: astore_3
        31: aload_3
        32: invokevirtual #713                // Method ext/mods/gameserver/model/residence/castle/Castle.getSiege:()Lext/mods/gameserver/model/residence/castle/Siege;
        35: astore        4
        37: aload         4
        39: aload_0
        40: if_acmpne     46
        43: goto          12
        46: aload         4
        48: invokevirtual #717                // Method getSiegeDate:()Ljava/util/Calendar;
        51: bipush        7
        53: invokevirtual #718                // Method java/util/Calendar.get:(I)I
        56: aload_0
        57: invokevirtual #717                // Method getSiegeDate:()Ljava/util/Calendar;
        60: bipush        7
        62: invokevirtual #718                // Method java/util/Calendar.get:(I)I
        65: if_icmpne     79
        68: aload         4
        70: aload_1
        71: invokevirtual #721                // Method checkSides:(Lext/mods/gameserver/model/pledge/Clan;)Z
        74: ifeq          79
        77: iconst_1
        78: ireturn
        79: goto          12
        82: iconst_0
        83: ireturn
      LineNumberTable:
        line 702: 0
        line 704: 31
        line 705: 37
        line 706: 43
        line 708: 46
        line 709: 77
        line 710: 79
        line 711: 82
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           37      42     4 siege   Lext/mods/gameserver/model/residence/castle/Siege;
           31      48     3 castle   Lext/mods/gameserver/model/residence/castle/Castle;
            0      84     0  this   Lext/mods/gameserver/model/residence/castle/Siege;
            0      84     1  clan   Lext/mods/gameserver/model/pledge/Clan;
      StackMapTable: number_of_entries = 4
        frame_type = 252 /* append */
          offset_delta = 12
          locals = [ class java/util/Iterator ]
        frame_type = 253 /* append */
          offset_delta = 33
          locals = [ class ext/mods/gameserver/model/residence/castle/Castle, class ext/mods/gameserver/model/residence/castle/Siege ]
        frame_type = 249 /* chop */
          offset_delta = 32
        frame_type = 250 /* chop */
          offset_delta = 2

  public void registerClan(ext.mods.gameserver.model.pledge.Clan, ext.mods.gameserver.enums.SiegeSide);
    descriptor: (Lext/mods/gameserver/model/pledge/Clan;Lext/mods/gameserver/enums/SiegeSide;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=7, args_size=3
         0: aload_1
         1: invokevirtual #668                // Method ext/mods/gameserver/model/pledge/Clan.hasCastle:()Z
         4: ifeq          8
         7: return
         8: getstatic     #494                // Field ext/mods/gameserver/model/residence/castle/Siege$1.$SwitchMap$ext$mods$gameserver$enums$SiegeSide:[I
        11: aload_2
        12: invokevirtual #500                // Method ext/mods/gameserver/enums/SiegeSide.ordinal:()I
        15: iaload
        16: tableswitch   { // 1 to 3

                       1: 44

                       2: 44

                       3: 44
                 default: 70
            }
        44: aload_0
        45: invokevirtual #534                // Method getDefenderClans:()Ljava/util/List;
        48: invokeinterface #690,  1          // InterfaceMethod java/util/List.size:()I
        53: aload_0
        54: invokevirtual #699                // Method getPendingClans:()Ljava/util/List;
        57: invokeinterface #690,  1          // InterfaceMethod java/util/List.size:()I
        62: iadd
        63: getstatic     #702                // Field ext/mods/Config.MAX_DEFENDERS_NUMBER:I
        66: if_icmplt     86
        69: return
        70: aload_0
        71: invokevirtual #149                // Method getAttackerClans:()Ljava/util/List;
        74: invokeinterface #690,  1          // InterfaceMethod java/util/List.size:()I
        79: getstatic     #693                // Field ext/mods/Config.MAX_ATTACKERS_NUMBER:I
        82: if_icmplt     86
        85: return
        86: invokestatic  #67                 // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
        89: astore_3
        90: aload_3
        91: ldc_w         #770                // String INSERT INTO siege_clans (clan_id,castle_id,type) VALUES (?,?,?) ON DUPLICATE KEY UPDATE type=VALUES(type)
        94: invokeinterface #75,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        99: astore        4
       101: aload         4
       103: iconst_1
       104: aload_1
       105: invokevirtual #402                // Method ext/mods/gameserver/model/pledge/Clan.getClanId:()I
       108: invokeinterface #84,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       113: aload         4
       115: iconst_2
       116: aload_0
       117: getfield      #35                 // Field _castle:Lext/mods/gameserver/model/residence/castle/Castle;
       120: invokevirtual #81                 // Method ext/mods/gameserver/model/residence/castle/Castle.getId:()I
       123: invokeinterface #84,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       128: aload         4
       130: iconst_3
       131: aload_2
       132: invokevirtual #772                // Method ext/mods/gameserver/enums/SiegeSide.toString:()Ljava/lang/String;
       135: invokeinterface #764,  3          // InterfaceMethod java/sql/PreparedStatement.setString:(ILjava/lang/String;)V
       140: aload         4
       142: invokeinterface #557,  1          // InterfaceMethod java/sql/PreparedStatement.executeUpdate:()I
       147: pop
       148: aload         4
       150: ifnull        192
       153: aload         4
       155: invokeinterface #127,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       160: goto          192
       163: astore        5
       165: aload         4
       167: ifnull        189
       170: aload         4
       172: invokeinterface #127,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       177: goto          189
       180: astore        6
       182: aload         5
       184: aload         6
       186: invokevirtual #123                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       189: aload         5
       191: athrow
       192: aload_3
       193: ifnull        232
       196: aload_3
       197: invokeinterface #128,  1          // InterfaceMethod java/sql/Connection.close:()V
       202: goto          232
       205: astore        4
       207: aload_3
       208: ifnull        229
       211: aload_3
       212: invokeinterface #128,  1          // InterfaceMethod java/sql/Connection.close:()V
       217: goto          229
       220: astore        5
       222: aload         4
       224: aload         5
       226: invokevirtual #123                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       229: aload         4
       231: athrow
       232: goto          246
       235: astore_3
       236: getstatic     #131                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       239: ldc_w         #775                // String Couldn\'t register clan on siege.
       242: aload_3
       243: invokevirtual #137                // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
       246: aload_0
       247: getfield      #10                 // Field _registeredClans:Ljava/util/Map;
       250: aload_1
       251: aload_2
       252: invokeinterface #61,  3           // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
       257: pop
       258: return
      Exception table:
         from    to  target type
           101   148   163   Class java/lang/Throwable
           170   177   180   Class java/lang/Throwable
            90   192   205   Class java/lang/Throwable
           211   217   220   Class java/lang/Throwable
            86   232   235   Class java/lang/Exception
      LineNumberTable:
        line 767: 0
        line 768: 7
        line 770: 8
        line 773: 44
        line 774: 69
        line 778: 70
        line 779: 85
        line 783: 86
        line 784: 90
        line 786: 101
        line 787: 113
        line 788: 128
        line 789: 140
        line 790: 148
        line 783: 163
        line 790: 192
        line 783: 205
        line 794: 232
        line 791: 235
        line 793: 236
        line 796: 246
        line 797: 258
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          101      91     4    ps   Ljava/sql/PreparedStatement;
           90     142     3   con   Ljava/sql/Connection;
          236      10     3     e   Ljava/lang/Exception;
            0     259     0  this   Lext/mods/gameserver/model/residence/castle/Siege;
            0     259     1  clan   Lext/mods/gameserver/model/pledge/Clan;
            0     259     2  type   Lext/mods/gameserver/enums/SiegeSide;
      StackMapTable: number_of_entries = 14
        frame_type = 8 /* same */
        frame_type = 35 /* same */
        frame_type = 25 /* same */
        frame_type = 15 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 76
          locals = [ class ext/mods/gameserver/model/residence/castle/Siege, class ext/mods/gameserver/model/pledge/Clan, class ext/mods/gameserver/enums/SiegeSide, class java/sql/Connection, class java/sql/PreparedStatement ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/model/residence/castle/Siege, class ext/mods/gameserver/model/pledge/Clan, class ext/mods/gameserver/enums/SiegeSide, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 14
          locals = [ class ext/mods/gameserver/model/residence/castle/Siege, class ext/mods/gameserver/model/pledge/Clan, class ext/mods/gameserver/enums/SiegeSide, class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 10 /* same */

  public final ext.mods.gameserver.model.residence.castle.Castle getCastle();
    descriptor: ()Lext/mods/gameserver/model/residence/castle/Castle;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #35                 // Field _castle:Lext/mods/gameserver/model/residence/castle/Castle;
         4: areturn
      LineNumberTable:
        line 858: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/residence/castle/Siege;

  public final boolean isInProgress();
    descriptor: ()Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #22                 // Field _siegeStatus:Lext/mods/gameserver/enums/SiegeStatus;
         4: getstatic     #190                // Field ext/mods/gameserver/enums/SiegeStatus.IN_PROGRESS:Lext/mods/gameserver/enums/SiegeStatus;
         7: if_acmpne     14
        10: iconst_1
        11: goto          15
        14: iconst_0
        15: ireturn
      LineNumberTable:
        line 863: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      16     0  this   Lext/mods/gameserver/model/residence/castle/Siege;
      StackMapTable: number_of_entries = 2
        frame_type = 14 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public final boolean isRegistrationOver();
    descriptor: ()Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #22                 // Field _siegeStatus:Lext/mods/gameserver/enums/SiegeStatus;
         4: getstatic     #16                 // Field ext/mods/gameserver/enums/SiegeStatus.REGISTRATION_OPENED:Lext/mods/gameserver/enums/SiegeStatus;
         7: if_acmpeq     14
        10: iconst_1
        11: goto          15
        14: iconst_0
        15: ireturn
      LineNumberTable:
        line 868: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      16     0  this   Lext/mods/gameserver/model/residence/castle/Siege;
      StackMapTable: number_of_entries = 2
        frame_type = 14 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public final boolean isTimeRegistrationOver();
    descriptor: ()Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #35                 // Field _castle:Lext/mods/gameserver/model/residence/castle/Castle;
         4: invokevirtual #811                // Method ext/mods/gameserver/model/residence/castle/Castle.isTimeRegistrationOver:()Z
         7: ireturn
      LineNumberTable:
        line 873: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/residence/castle/Siege;

  public final long getSiegeRegistrationEndDate();
    descriptor: ()J
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=4, locals=1, args_size=1
         0: aload_0
         1: getfield      #35                 // Field _castle:Lext/mods/gameserver/model/residence/castle/Castle;
         4: invokevirtual #460                // Method ext/mods/gameserver/model/residence/castle/Castle.getSiegeDate:()Ljava/util/Calendar;
         7: invokevirtual #624                // Method java/util/Calendar.getTimeInMillis:()J
        10: ldc2_w        #812                // long 86400000l
        13: lsub
        14: lreturn
      LineNumberTable:
        line 881: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      15     0  this   Lext/mods/gameserver/model/residence/castle/Siege;

  public void endTimeRegistration(boolean);
    descriptor: (Z)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #35                 // Field _castle:Lext/mods/gameserver/model/residence/castle/Castle;
         4: iconst_1
         5: invokevirtual #733                // Method ext/mods/gameserver/model/residence/castle/Castle.setTimeRegistrationOver:(Z)V
         8: iload_1
         9: ifne          16
        12: aload_0
        13: invokevirtual #736                // Method saveSiegeDate:()V
        16: return
      LineNumberTable:
        line 886: 0
        line 887: 8
        line 888: 12
        line 889: 16
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      17     0  this   Lext/mods/gameserver/model/residence/castle/Siege;
            0      17     1 automatic   Z
      StackMapTable: number_of_entries = 1
        frame_type = 16 /* same */

  public void addMakerEvent(ext.mods.gameserver.model.spawn.NpcMaker);
    descriptor: (Lext/mods/gameserver/model/spawn/NpcMaker;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=2, args_size=2
         0: aload_0
         1: getfield      #31                 // Field _makerEvents:Ljava/util/List;
         4: invokeinterface #152,  1          // InterfaceMethod java/util/List.isEmpty:()Z
         9: ifeq          24
        12: aload_0
        13: new           #814                // class java/util/ArrayList
        16: dup
        17: iconst_3
        18: invokespecial #816                // Method java/util/ArrayList."<init>":(I)V
        21: putfield      #31                 // Field _makerEvents:Ljava/util/List;
        24: aload_0
        25: getfield      #31                 // Field _makerEvents:Ljava/util/List;
        28: aload_1
        29: invokeinterface #818,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        34: pop
        35: return
      LineNumberTable:
        line 893: 0
        line 894: 12
        line 896: 24
        line 897: 35
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      36     0  this   Lext/mods/gameserver/model/residence/castle/Siege;
            0      36     1 quest   Lext/mods/gameserver/model/spawn/NpcMaker;
      StackMapTable: number_of_entries = 1
        frame_type = 24 /* same */

  public java.lang.String getStatusTranslation(ext.mods.gameserver.model.actor.Player, ext.mods.gameserver.enums.SiegeStatus);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/enums/SiegeStatus;)Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=3
         0: getstatic     #820                // Field ext/mods/gameserver/model/residence/castle/Siege$1.$SwitchMap$ext$mods$gameserver$enums$SiegeStatus:[I
         3: aload_2
         4: invokevirtual #823                // Method ext/mods/gameserver/enums/SiegeStatus.ordinal:()I
         7: iaload
         8: tableswitch   { // 1 to 3

                       1: 36

                       2: 48

                       3: 60
                 default: 72
            }
        36: aload_1
        37: sipush        10166
        40: iconst_0
        41: anewarray     #2                  // class java/lang/Object
        44: invokevirtual #824                // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
        47: areturn
        48: aload_1
        49: sipush        10167
        52: iconst_0
        53: anewarray     #2                  // class java/lang/Object
        56: invokevirtual #824                // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
        59: areturn
        60: aload_1
        61: sipush        10168
        64: iconst_0
        65: anewarray     #2                  // class java/lang/Object
        68: invokevirtual #824                // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
        71: areturn
        72: aload_1
        73: sipush        10169
        76: iconst_0
        77: anewarray     #2                  // class java/lang/Object
        80: invokevirtual #824                // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
        83: areturn
      LineNumberTable:
        line 901: 0
        line 904: 36
        line 906: 48
        line 908: 60
        line 910: 72
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      84     0  this   Lext/mods/gameserver/model/residence/castle/Siege;
            0      84     1 player   Lext/mods/gameserver/model/actor/Player;
            0      84     2 status   Lext/mods/gameserver/enums/SiegeStatus;
      StackMapTable: number_of_entries = 4
        frame_type = 36 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */

  public ext.mods.gameserver.enums.SiegeStatus getStatus();
    descriptor: ()Lext/mods/gameserver/enums/SiegeStatus;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #22                 // Field _siegeStatus:Lext/mods/gameserver/enums/SiegeStatus;
         4: areturn
      LineNumberTable:
        line 916: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/residence/castle/Siege;

  protected void changeStatus(ext.mods.gameserver.enums.SiegeStatus);
    descriptor: (Lext/mods/gameserver/enums/SiegeStatus;)V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=3, locals=4, args_size=2
         0: aload_0
         1: aload_1
         2: putfield      #22                 // Field _siegeStatus:Lext/mods/gameserver/enums/SiegeStatus;
         5: aload_0
         6: getfield      #31                 // Field _makerEvents:Ljava/util/List;
         9: invokeinterface #523,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
        14: astore_2
        15: aload_2
        16: invokeinterface #334,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        21: ifeq          46
        24: aload_2
        25: invokeinterface #339,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        30: checkcast     #828                // class ext/mods/gameserver/model/spawn/NpcMaker
        33: astore_3
        34: aload_3
        35: invokevirtual #830                // Method ext/mods/gameserver/model/spawn/NpcMaker.getMaker:()Lext/mods/gameserver/scripting/SpawnMaker;
        38: aload_0
        39: aload_3
        40: invokevirtual #834                // Method ext/mods/gameserver/scripting/SpawnMaker.onSiegeEvent:(Lext/mods/gameserver/model/residence/castle/Siege;Lext/mods/gameserver/model/spawn/NpcMaker;)V
        43: goto          15
        46: return
      LineNumberTable:
        line 921: 0
        line 923: 5
        line 924: 34
        line 925: 46
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           34       9     3 maker   Lext/mods/gameserver/model/spawn/NpcMaker;
            0      47     0  this   Lext/mods/gameserver/model/residence/castle/Siege;
            0      47     1 status   Lext/mods/gameserver/enums/SiegeStatus;
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 15
          locals = [ class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 30

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=3, locals=0, args_size=0
         0: new           #138                // class ext/mods/commons/logging/CLogger
         3: dup
         4: ldc           #11                 // class ext/mods/gameserver/model/residence/castle/Siege
         6: invokevirtual #936                // Method java/lang/Class.getName:()Ljava/lang/String;
         9: invokespecial #939                // Method ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
        12: putstatic     #131                // Field LOGGER:Lext/mods/commons/logging/CLogger;
        15: return
      LineNumberTable:
        line 60: 0
}
SourceFile: "Siege.java"
NestMembers:
  ext/mods/gameserver/model/residence/castle/Siege$1
BootstrapMethods:
  0: #1135 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1073 (Ljava/lang/Object;)V
      #1075 REF_invokeVirtual ext/mods/gameserver/model/location/TowerSpawnLocation.polymorph:()V
      #1081 (Lext/mods/gameserver/model/location/TowerSpawnLocation;)V
  1: #1135 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1083 (Ljava/lang/Object;Ljava/lang/Object;)V
      #1085 REF_invokeStatic ext/mods/gameserver/model/residence/castle/Siege.lambda$endSiege$0:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/Integer;Lext/mods/gameserver/model/pledge/ItemInfo;)V
      #1088 (Ljava/lang/Integer;Lext/mods/gameserver/model/pledge/ItemInfo;)V
  2: #1135 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1073 (Ljava/lang/Object;)V
      #1090 REF_invokeVirtual ext/mods/gameserver/model/location/TowerSpawnLocation.unpolymorph:()V
      #1081 (Lext/mods/gameserver/model/location/TowerSpawnLocation;)V
  3: #1135 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1083 (Ljava/lang/Object;Ljava/lang/Object;)V
      #1094 REF_invokeStatic ext/mods/gameserver/model/residence/castle/Siege.lambda$endSiege$1:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/Integer;Ljava/lang/Integer;)V
      #1097 (Ljava/lang/Integer;Ljava/lang/Integer;)V
  4: #1135 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1083 (Ljava/lang/Object;Ljava/lang/Object;)V
      #1099 REF_invokeStatic ext/mods/gameserver/model/residence/castle/Siege.lambda$endSiege$2:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/Integer;Ljava/lang/Integer;)V
      #1097 (Ljava/lang/Integer;Ljava/lang/Integer;)V
  5: #1135 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1102 (Ljava/lang/Object;)Z
      #1103 REF_invokeStatic ext/mods/gameserver/model/residence/castle/Siege.lambda$getAttackerClans$0:(Ljava/util/Map$Entry;)Z
      #1106 (Ljava/util/Map$Entry;)Z
  6: #1135 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1107 (Ljava/lang/Object;)Ljava/lang/Object;
      #1108 REF_invokeInterface java/util/Map$Entry.getKey:()Ljava/lang/Object;
      #1109 (Ljava/util/Map$Entry;)Lext/mods/gameserver/model/pledge/Clan;
  7: #1135 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1102 (Ljava/lang/Object;)Z
      #1111 REF_invokeStatic ext/mods/gameserver/model/residence/castle/Siege.lambda$getDefenderClans$0:(Ljava/util/Map$Entry;)Z
      #1106 (Ljava/util/Map$Entry;)Z
  8: #1135 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1102 (Ljava/lang/Object;)Z
      #1114 REF_invokeStatic ext/mods/gameserver/model/residence/castle/Siege.lambda$getPendingClans$0:(Ljava/util/Map$Entry;)Z
      #1106 (Ljava/util/Map$Entry;)Z
  9: #1135 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1073 (Ljava/lang/Object;)V
      #1117 REF_invokeVirtual ext/mods/gameserver/model/location/TowerSpawnLocation.midVictory:()V
      #1081 (Lext/mods/gameserver/model/location/TowerSpawnLocation;)V
  10: #1135 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1073 (Ljava/lang/Object;)V
      #1120 REF_invokeStatic ext/mods/gameserver/model/residence/castle/Siege.lambda$announce$0:(Lext/mods/gameserver/network/serverpackets/SystemMessage;Lext/mods/gameserver/model/pledge/Clan;)V
      #1123 (Lext/mods/gameserver/model/pledge/Clan;)V
  11: #1135 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1073 (Ljava/lang/Object;)V
      #1124 REF_invokeStatic ext/mods/gameserver/model/residence/castle/Siege.lambda$announce$1:(Lext/mods/gameserver/network/serverpackets/SystemMessage;Lext/mods/gameserver/model/pledge/Clan;)V
      #1123 (Lext/mods/gameserver/model/pledge/Clan;)V
  12: #1135 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1102 (Ljava/lang/Object;)Z
      #1127 REF_invokeStatic ext/mods/gameserver/model/residence/castle/Siege.lambda$clearPendingClans$0:(Ljava/util/Map$Entry;)Z
      #1106 (Ljava/util/Map$Entry;)Z
  13: #1135 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1130 ()V
      #1131 REF_invokeVirtual ext/mods/gameserver/model/residence/castle/Siege.siegeStart:()V
      #1130 ()V
  14: #1135 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1130 ()V
      #1134 REF_invokeVirtual ext/mods/gameserver/model/residence/castle/Siege.processSiegeTimer:()V
      #1130 ()V
InnerClasses:
  public static #1143= #486 of #62;       // Entry=class java/util/Map$Entry of class java/util/Map
  static #495;                            // class ext/mods/gameserver/model/residence/castle/Siege$1
  public static final #1148= #1144 of #1146; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
