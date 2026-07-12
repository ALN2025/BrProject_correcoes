// Bytecode for: ext.mods.gameserver.model.residence.clanhall.SiegableHall
// File: ext\mods\gameserver\model\residence\clanhall\SiegableHall.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/residence/clanhall/SiegableHall.class
  Last modified 9 de jul de 2026; size 9355 bytes
  MD5 checksum b331b231661c8b3834425079a9063998
  Compiled from "SiegableHall.java"
public final class ext.mods.gameserver.model.residence.clanhall.SiegableHall extends ext.mods.gameserver.model.residence.clanhall.ClanHall
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #14                         // ext/mods/gameserver/model/residence/clanhall/SiegableHall
  super_class: #2                         // ext/mods/gameserver/model/residence/clanhall/ClanHall
  interfaces: 0, fields: 7, methods: 24, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/gameserver/model/residence/clanhall/ClanHall."<init>":(Lext/mods/commons/data/StatSet;)V
    #2 = Class              #4            // ext/mods/gameserver/model/residence/clanhall/ClanHall
    #3 = NameAndType        #5:#6         // "<init>":(Lext/mods/commons/data/StatSet;)V
    #4 = Utf8               ext/mods/gameserver/model/residence/clanhall/ClanHall
    #5 = Utf8               <init>
    #6 = Utf8               (Lext/mods/commons/data/StatSet;)V
    #7 = Fieldref           #8.#9         // ext/mods/gameserver/enums/SiegeStatus.REGISTRATION_OPENED:Lext/mods/gameserver/enums/SiegeStatus;
    #8 = Class              #10           // ext/mods/gameserver/enums/SiegeStatus
    #9 = NameAndType        #11:#12       // REGISTRATION_OPENED:Lext/mods/gameserver/enums/SiegeStatus;
   #10 = Utf8               ext/mods/gameserver/enums/SiegeStatus
   #11 = Utf8               REGISTRATION_OPENED
   #12 = Utf8               Lext/mods/gameserver/enums/SiegeStatus;
   #13 = Fieldref           #14.#15       // ext/mods/gameserver/model/residence/clanhall/SiegableHall._status:Lext/mods/gameserver/enums/SiegeStatus;
   #14 = Class              #16           // ext/mods/gameserver/model/residence/clanhall/SiegableHall
   #15 = NameAndType        #17:#12       // _status:Lext/mods/gameserver/enums/SiegeStatus;
   #16 = Utf8               ext/mods/gameserver/model/residence/clanhall/SiegableHall
   #17 = Utf8               _status
   #18 = String             #19           // siegeLength
   #19 = Utf8               siegeLength
   #20 = Methodref          #21.#22       // ext/mods/commons/data/StatSet.getLong:(Ljava/lang/String;)J
   #21 = Class              #23           // ext/mods/commons/data/StatSet
   #22 = NameAndType        #24:#25       // getLong:(Ljava/lang/String;)J
   #23 = Utf8               ext/mods/commons/data/StatSet
   #24 = Utf8               getLong
   #25 = Utf8               (Ljava/lang/String;)J
   #26 = Fieldref           #14.#27       // ext/mods/gameserver/model/residence/clanhall/SiegableHall._siegeLength:J
   #27 = NameAndType        #28:#29       // _siegeLength:J
   #28 = Utf8               _siegeLength
   #29 = Utf8               J
   #30 = String             #31           // scheduleConfig
   #31 = Utf8               scheduleConfig
   #32 = Methodref          #21.#33       // ext/mods/commons/data/StatSet.getIntegerArray:(Ljava/lang/String;)[I
   #33 = NameAndType        #34:#35       // getIntegerArray:(Ljava/lang/String;)[I
   #34 = Utf8               getIntegerArray
   #35 = Utf8               (Ljava/lang/String;)[I
   #36 = Fieldref           #14.#37       // ext/mods/gameserver/model/residence/clanhall/SiegableHall._scheduleConfig:[I
   #37 = NameAndType        #38:#39       // _scheduleConfig:[I
   #38 = Utf8               _scheduleConfig
   #39 = Utf8               [I
   #40 = Methodref          #41.#42       // ext/mods/gameserver/data/manager/ZoneManager.getInstance:()Lext/mods/gameserver/data/manager/ZoneManager;
   #41 = Class              #43           // ext/mods/gameserver/data/manager/ZoneManager
   #42 = NameAndType        #44:#45       // getInstance:()Lext/mods/gameserver/data/manager/ZoneManager;
   #43 = Utf8               ext/mods/gameserver/data/manager/ZoneManager
   #44 = Utf8               getInstance
   #45 = Utf8               ()Lext/mods/gameserver/data/manager/ZoneManager;
   #46 = Class              #47           // ext/mods/gameserver/model/zone/type/SiegeZone
   #47 = Utf8               ext/mods/gameserver/model/zone/type/SiegeZone
   #48 = Methodref          #41.#49       // ext/mods/gameserver/data/manager/ZoneManager.getAllZones:(Ljava/lang/Class;)Ljava/util/Collection;
   #49 = NameAndType        #50:#51       // getAllZones:(Ljava/lang/Class;)Ljava/util/Collection;
   #50 = Utf8               getAllZones
   #51 = Utf8               (Ljava/lang/Class;)Ljava/util/Collection;
   #52 = InterfaceMethodref #53.#54       // java/util/Collection.stream:()Ljava/util/stream/Stream;
   #53 = Class              #55           // java/util/Collection
   #54 = NameAndType        #56:#57       // stream:()Ljava/util/stream/Stream;
   #55 = Utf8               java/util/Collection
   #56 = Utf8               stream
   #57 = Utf8               ()Ljava/util/stream/Stream;
   #58 = InvokeDynamic      #0:#59        // #0:test:(Lext/mods/gameserver/model/residence/clanhall/SiegableHall;)Ljava/util/function/Predicate;
   #59 = NameAndType        #60:#61       // test:(Lext/mods/gameserver/model/residence/clanhall/SiegableHall;)Ljava/util/function/Predicate;
   #60 = Utf8               test
   #61 = Utf8               (Lext/mods/gameserver/model/residence/clanhall/SiegableHall;)Ljava/util/function/Predicate;
   #62 = InterfaceMethodref #63.#64       // java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
   #63 = Class              #65           // java/util/stream/Stream
   #64 = NameAndType        #66:#67       // filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
   #65 = Utf8               java/util/stream/Stream
   #66 = Utf8               filter
   #67 = Utf8               (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
   #68 = InterfaceMethodref #63.#69       // java/util/stream/Stream.findFirst:()Ljava/util/Optional;
   #69 = NameAndType        #70:#71       // findFirst:()Ljava/util/Optional;
   #70 = Utf8               findFirst
   #71 = Utf8               ()Ljava/util/Optional;
   #72 = Methodref          #73.#74       // java/util/Optional.orElse:(Ljava/lang/Object;)Ljava/lang/Object;
   #73 = Class              #75           // java/util/Optional
   #74 = NameAndType        #76:#77       // orElse:(Ljava/lang/Object;)Ljava/lang/Object;
   #75 = Utf8               java/util/Optional
   #76 = Utf8               orElse
   #77 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
   #78 = Fieldref           #14.#79       // ext/mods/gameserver/model/residence/clanhall/SiegableHall._siegeZone:Lext/mods/gameserver/model/zone/type/SiegeZone;
   #79 = NameAndType        #80:#81       // _siegeZone:Lext/mods/gameserver/model/zone/type/SiegeZone;
   #80 = Utf8               _siegeZone
   #81 = Utf8               Lext/mods/gameserver/model/zone/type/SiegeZone;
   #82 = Methodref          #83.#84       // ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
   #83 = Class              #85           // ext/mods/commons/pool/ConnectionPool
   #84 = NameAndType        #86:#87       // getConnection:()Ljava/sql/Connection;
   #85 = Utf8               ext/mods/commons/pool/ConnectionPool
   #86 = Utf8               getConnection
   #87 = Utf8               ()Ljava/sql/Connection;
   #88 = String             #89           // UPDATE clanhall SET ownerId=?, endDate=? WHERE id=?
   #89 = Utf8               UPDATE clanhall SET ownerId=?, endDate=? WHERE id=?
   #90 = InterfaceMethodref #91.#92       // java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
   #91 = Class              #93           // java/sql/Connection
   #92 = NameAndType        #94:#95       // prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
   #93 = Utf8               java/sql/Connection
   #94 = Utf8               prepareStatement
   #95 = Utf8               (Ljava/lang/String;)Ljava/sql/PreparedStatement;
   #96 = Methodref          #14.#97       // ext/mods/gameserver/model/residence/clanhall/SiegableHall.getOwnerId:()I
   #97 = NameAndType        #98:#99       // getOwnerId:()I
   #98 = Utf8               getOwnerId
   #99 = Utf8               ()I
  #100 = InterfaceMethodref #101.#102     // java/sql/PreparedStatement.setInt:(II)V
  #101 = Class              #103          // java/sql/PreparedStatement
  #102 = NameAndType        #104:#105     // setInt:(II)V
  #103 = Utf8               java/sql/PreparedStatement
  #104 = Utf8               setInt
  #105 = Utf8               (II)V
  #106 = Methodref          #14.#107      // ext/mods/gameserver/model/residence/clanhall/SiegableHall.getNextSiegeTime:()J
  #107 = NameAndType        #108:#109     // getNextSiegeTime:()J
  #108 = Utf8               getNextSiegeTime
  #109 = Utf8               ()J
  #110 = InterfaceMethodref #101.#111     // java/sql/PreparedStatement.setLong:(IJ)V
  #111 = NameAndType        #112:#113     // setLong:(IJ)V
  #112 = Utf8               setLong
  #113 = Utf8               (IJ)V
  #114 = Methodref          #14.#115      // ext/mods/gameserver/model/residence/clanhall/SiegableHall.getId:()I
  #115 = NameAndType        #116:#99      // getId:()I
  #116 = Utf8               getId
  #117 = InterfaceMethodref #101.#118     // java/sql/PreparedStatement.execute:()Z
  #118 = NameAndType        #119:#120     // execute:()Z
  #119 = Utf8               execute
  #120 = Utf8               ()Z
  #121 = InterfaceMethodref #101.#122     // java/sql/PreparedStatement.close:()V
  #122 = NameAndType        #123:#124     // close:()V
  #123 = Utf8               close
  #124 = Utf8               ()V
  #125 = Class              #126          // java/lang/Throwable
  #126 = Utf8               java/lang/Throwable
  #127 = Methodref          #125.#128     // java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
  #128 = NameAndType        #129:#130     // addSuppressed:(Ljava/lang/Throwable;)V
  #129 = Utf8               addSuppressed
  #130 = Utf8               (Ljava/lang/Throwable;)V
  #131 = InterfaceMethodref #91.#122      // java/sql/Connection.close:()V
  #132 = Class              #133          // java/lang/Exception
  #133 = Utf8               java/lang/Exception
  #134 = Fieldref           #14.#135      // ext/mods/gameserver/model/residence/clanhall/SiegableHall.LOGGER:Lext/mods/commons/logging/CLogger;
  #135 = NameAndType        #136:#137     // LOGGER:Lext/mods/commons/logging/CLogger;
  #136 = Utf8               LOGGER
  #137 = Utf8               Lext/mods/commons/logging/CLogger;
  #138 = String             #139          // Couldn\'t save SiegableHall.
  #139 = Utf8               Couldn\'t save SiegableHall.
  #140 = Methodref          #141.#142     // ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
  #141 = Class              #143          // ext/mods/commons/logging/CLogger
  #142 = NameAndType        #144:#145     // error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
  #143 = Utf8               ext/mods/commons/logging/CLogger
  #144 = Utf8               error
  #145 = Utf8               (Ljava/lang/Object;Ljava/lang/Throwable;)V
  #146 = Fieldref           #14.#147      // ext/mods/gameserver/model/residence/clanhall/SiegableHall._siege:Lext/mods/gameserver/model/residence/clanhall/ClanHallSiege;
  #147 = NameAndType        #148:#149     // _siege:Lext/mods/gameserver/model/residence/clanhall/ClanHallSiege;
  #148 = Utf8               _siege
  #149 = Utf8               Lext/mods/gameserver/model/residence/clanhall/ClanHallSiege;
  #150 = Fieldref           #14.#151      // ext/mods/gameserver/model/residence/clanhall/SiegableHall._nextSiege:Ljava/util/Calendar;
  #151 = NameAndType        #152:#153     // _nextSiege:Ljava/util/Calendar;
  #152 = Utf8               _nextSiege
  #153 = Utf8               Ljava/util/Calendar;
  #154 = Methodref          #155.#156     // java/util/Calendar.getTimeInMillis:()J
  #155 = Class              #157          // java/util/Calendar
  #156 = NameAndType        #158:#109     // getTimeInMillis:()J
  #157 = Utf8               java/util/Calendar
  #158 = Utf8               getTimeInMillis
  #159 = Methodref          #155.#160     // java/util/Calendar.setTimeInMillis:(J)V
  #160 = NameAndType        #161:#162     // setTimeInMillis:(J)V
  #161 = Utf8               setTimeInMillis
  #162 = Utf8               (J)V
  #163 = Methodref          #155.#164     // java/util/Calendar.getInstance:()Ljava/util/Calendar;
  #164 = NameAndType        #44:#165      // getInstance:()Ljava/util/Calendar;
  #165 = Utf8               ()Ljava/util/Calendar;
  #166 = Methodref          #155.#167     // java/util/Calendar.add:(II)V
  #167 = NameAndType        #168:#105     // add:(II)V
  #168 = Utf8               add
  #169 = Methodref          #155.#170     // java/util/Calendar.set:(II)V
  #170 = NameAndType        #171:#105     // set:(II)V
  #171 = Utf8               set
  #172 = Methodref          #14.#173      // ext/mods/gameserver/model/residence/clanhall/SiegableHall.setNextSiegeDate:(Ljava/util/Calendar;)V
  #173 = NameAndType        #174:#175     // setNextSiegeDate:(Ljava/util/Calendar;)V
  #174 = Utf8               setNextSiegeDate
  #175 = Utf8               (Ljava/util/Calendar;)V
  #176 = Methodref          #14.#177      // ext/mods/gameserver/model/residence/clanhall/SiegableHall.updateDb:()V
  #177 = NameAndType        #178:#124     // updateDb:()V
  #178 = Utf8               updateDb
  #179 = Methodref          #14.#180      // ext/mods/gameserver/model/residence/clanhall/SiegableHall.getSiege:()Lext/mods/gameserver/model/residence/clanhall/ClanHallSiege;
  #180 = NameAndType        #181:#182     // getSiege:()Lext/mods/gameserver/model/residence/clanhall/ClanHallSiege;
  #181 = Utf8               getSiege
  #182 = Utf8               ()Lext/mods/gameserver/model/residence/clanhall/ClanHallSiege;
  #183 = Methodref          #184.#185     // ext/mods/gameserver/model/residence/clanhall/ClanHallSiege.getAttackerClans:()Ljava/util/List;
  #184 = Class              #186          // ext/mods/gameserver/model/residence/clanhall/ClanHallSiege
  #185 = NameAndType        #187:#188     // getAttackerClans:()Ljava/util/List;
  #186 = Utf8               ext/mods/gameserver/model/residence/clanhall/ClanHallSiege
  #187 = Utf8               getAttackerClans
  #188 = Utf8               ()Ljava/util/List;
  #189 = InterfaceMethodref #190.#191     // java/util/List.add:(Ljava/lang/Object;)Z
  #190 = Class              #192          // java/util/List
  #191 = NameAndType        #168:#193     // add:(Ljava/lang/Object;)Z
  #192 = Utf8               java/util/List
  #193 = Utf8               (Ljava/lang/Object;)Z
  #194 = InterfaceMethodref #190.#195     // java/util/List.remove:(Ljava/lang/Object;)Z
  #195 = NameAndType        #196:#193     // remove:(Ljava/lang/Object;)Z
  #196 = Utf8               remove
  #197 = InterfaceMethodref #190.#198     // java/util/List.contains:(Ljava/lang/Object;)Z
  #198 = NameAndType        #199:#193     // contains:(Ljava/lang/Object;)Z
  #199 = Utf8               contains
  #200 = Fieldref           #8.#201       // ext/mods/gameserver/enums/SiegeStatus.IN_PROGRESS:Lext/mods/gameserver/enums/SiegeStatus;
  #201 = NameAndType        #202:#12      // IN_PROGRESS:Lext/mods/gameserver/enums/SiegeStatus;
  #202 = Utf8               IN_PROGRESS
  #203 = Fieldref           #8.#204       // ext/mods/gameserver/enums/SiegeStatus.REGISTRATION_OVER:Lext/mods/gameserver/enums/SiegeStatus;
  #204 = NameAndType        #205:#12      // REGISTRATION_OVER:Lext/mods/gameserver/enums/SiegeStatus;
  #205 = Utf8               REGISTRATION_OVER
  #206 = Methodref          #14.#207      // ext/mods/gameserver/model/residence/clanhall/SiegableHall.spawnDoor:(Z)V
  #207 = NameAndType        #208:#209     // spawnDoor:(Z)V
  #208 = Utf8               spawnDoor
  #209 = Utf8               (Z)V
  #210 = Methodref          #14.#211      // ext/mods/gameserver/model/residence/clanhall/SiegableHall.getDoors:()Ljava/util/List;
  #211 = NameAndType        #212:#188     // getDoors:()Ljava/util/List;
  #212 = Utf8               getDoors
  #213 = InterfaceMethodref #190.#214     // java/util/List.iterator:()Ljava/util/Iterator;
  #214 = NameAndType        #215:#216     // iterator:()Ljava/util/Iterator;
  #215 = Utf8               iterator
  #216 = Utf8               ()Ljava/util/Iterator;
  #217 = InterfaceMethodref #218.#219     // java/util/Iterator.hasNext:()Z
  #218 = Class              #220          // java/util/Iterator
  #219 = NameAndType        #221:#120     // hasNext:()Z
  #220 = Utf8               java/util/Iterator
  #221 = Utf8               hasNext
  #222 = InterfaceMethodref #218.#223     // java/util/Iterator.next:()Ljava/lang/Object;
  #223 = NameAndType        #224:#225     // next:()Ljava/lang/Object;
  #224 = Utf8               next
  #225 = Utf8               ()Ljava/lang/Object;
  #226 = Class              #227          // ext/mods/gameserver/model/actor/instance/Door
  #227 = Utf8               ext/mods/gameserver/model/actor/instance/Door
  #228 = Methodref          #226.#229     // ext/mods/gameserver/model/actor/instance/Door.isDead:()Z
  #229 = NameAndType        #230:#120     // isDead:()Z
  #230 = Utf8               isDead
  #231 = Methodref          #226.#232     // ext/mods/gameserver/model/actor/instance/Door.doRevive:()V
  #232 = NameAndType        #233:#124     // doRevive:()V
  #233 = Utf8               doRevive
  #234 = Methodref          #226.#235     // ext/mods/gameserver/model/actor/instance/Door.closeMe:()V
  #235 = NameAndType        #236:#124     // closeMe:()V
  #236 = Utf8               closeMe
  #237 = Methodref          #226.#238     // ext/mods/gameserver/model/actor/instance/Door.getStatus:()Lext/mods/gameserver/model/actor/status/DoorStatus;
  #238 = NameAndType        #239:#240     // getStatus:()Lext/mods/gameserver/model/actor/status/DoorStatus;
  #239 = Utf8               getStatus
  #240 = Utf8               ()Lext/mods/gameserver/model/actor/status/DoorStatus;
  #241 = Methodref          #242.#243     // ext/mods/gameserver/model/actor/status/DoorStatus.getMaxHp:()I
  #242 = Class              #244          // ext/mods/gameserver/model/actor/status/DoorStatus
  #243 = NameAndType        #245:#99      // getMaxHp:()I
  #244 = Utf8               ext/mods/gameserver/model/actor/status/DoorStatus
  #245 = Utf8               getMaxHp
  #246 = Methodref          #242.#247     // ext/mods/gameserver/model/actor/status/DoorStatus.setHp:(D)V
  #247 = NameAndType        #248:#249     // setHp:(D)V
  #248 = Utf8               setHp
  #249 = Utf8               (D)V
  #250 = Methodref          #251.#252     // ext/mods/gameserver/model/pledge/Clan.getLevel:()I
  #251 = Class              #253          // ext/mods/gameserver/model/pledge/Clan
  #252 = NameAndType        #254:#99      // getLevel:()I
  #253 = Utf8               ext/mods/gameserver/model/pledge/Clan
  #254 = Utf8               getLevel
  #255 = Fieldref           #256.#257     // ext/mods/Config.CH_MINIMUM_CLAN_LEVEL:I
  #256 = Class              #258          // ext/mods/Config
  #257 = NameAndType        #259:#260     // CH_MINIMUM_CLAN_LEVEL:I
  #258 = Utf8               ext/mods/Config
  #259 = Utf8               CH_MINIMUM_CLAN_LEVEL
  #260 = Utf8               I
  #261 = Fieldref           #262.#263     // ext/mods/gameserver/network/SystemMessageId.ONLY_CLAN_LEVEL_4_ABOVE_MAY_SIEGE:Lext/mods/gameserver/network/SystemMessageId;
  #262 = Class              #264          // ext/mods/gameserver/network/SystemMessageId
  #263 = NameAndType        #265:#266     // ONLY_CLAN_LEVEL_4_ABOVE_MAY_SIEGE:Lext/mods/gameserver/network/SystemMessageId;
  #264 = Utf8               ext/mods/gameserver/network/SystemMessageId
  #265 = Utf8               ONLY_CLAN_LEVEL_4_ABOVE_MAY_SIEGE
  #266 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
  #267 = Methodref          #268.#269     // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
  #268 = Class              #270          // ext/mods/gameserver/model/actor/Player
  #269 = NameAndType        #271:#272     // sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
  #270 = Utf8               ext/mods/gameserver/model/actor/Player
  #271 = Utf8               sendPacket
  #272 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
  #273 = Methodref          #14.#274      // ext/mods/gameserver/model/residence/clanhall/SiegableHall.isWaitingBattle:()Z
  #274 = NameAndType        #275:#120     // isWaitingBattle:()Z
  #275 = Utf8               isWaitingBattle
  #276 = Fieldref           #262.#277     // ext/mods/gameserver/network/SystemMessageId.DEADLINE_FOR_SIEGE_S1_PASSED:Lext/mods/gameserver/network/SystemMessageId;
  #277 = NameAndType        #278:#266     // DEADLINE_FOR_SIEGE_S1_PASSED:Lext/mods/gameserver/network/SystemMessageId;
  #278 = Utf8               DEADLINE_FOR_SIEGE_S1_PASSED
  #279 = Methodref          #280.#281     // ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #280 = Class              #282          // ext/mods/gameserver/network/serverpackets/SystemMessage
  #281 = NameAndType        #283:#284     // getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #282 = Utf8               ext/mods/gameserver/network/serverpackets/SystemMessage
  #283 = Utf8               getSystemMessage
  #284 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #285 = Methodref          #280.#286     // ext/mods/gameserver/network/serverpackets/SystemMessage.addFortId:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #286 = NameAndType        #287:#288     // addFortId:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #287 = Utf8               addFortId
  #288 = Utf8               (I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #289 = Methodref          #268.#290     // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #290 = NameAndType        #271:#291     // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #291 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #292 = Methodref          #14.#293      // ext/mods/gameserver/model/residence/clanhall/SiegableHall.isInSiege:()Z
  #293 = NameAndType        #294:#120     // isInSiege:()Z
  #294 = Utf8               isInSiege
  #295 = Fieldref           #262.#296     // ext/mods/gameserver/network/SystemMessageId.NOT_SIEGE_REGISTRATION_TIME2:Lext/mods/gameserver/network/SystemMessageId;
  #296 = NameAndType        #297:#266     // NOT_SIEGE_REGISTRATION_TIME2:Lext/mods/gameserver/network/SystemMessageId;
  #297 = Utf8               NOT_SIEGE_REGISTRATION_TIME2
  #298 = Methodref          #251.#299     // ext/mods/gameserver/model/pledge/Clan.getClanId:()I
  #299 = NameAndType        #300:#99      // getClanId:()I
  #300 = Utf8               getClanId
  #301 = Fieldref           #262.#302     // ext/mods/gameserver/network/SystemMessageId.CLAN_THAT_OWNS_CASTLE_IS_AUTOMATICALLY_REGISTERED_DEFENDING:Lext/mods/gameserver/network/SystemMessageId;
  #302 = NameAndType        #303:#266     // CLAN_THAT_OWNS_CASTLE_IS_AUTOMATICALLY_REGISTERED_DEFENDING:Lext/mods/gameserver/network/SystemMessageId;
  #303 = Utf8               CLAN_THAT_OWNS_CASTLE_IS_AUTOMATICALLY_REGISTERED_DEFENDING
  #304 = Methodref          #251.#305     // ext/mods/gameserver/model/pledge/Clan.getClanHallId:()I
  #305 = NameAndType        #306:#99      // getClanHallId:()I
  #306 = Utf8               getClanHallId
  #307 = Fieldref           #262.#308     // ext/mods/gameserver/network/SystemMessageId.CLAN_THAT_OWNS_CASTLE_CANNOT_PARTICIPATE_OTHER_SIEGE:Lext/mods/gameserver/network/SystemMessageId;
  #308 = NameAndType        #309:#266     // CLAN_THAT_OWNS_CASTLE_CANNOT_PARTICIPATE_OTHER_SIEGE:Lext/mods/gameserver/network/SystemMessageId;
  #309 = Utf8               CLAN_THAT_OWNS_CASTLE_CANNOT_PARTICIPATE_OTHER_SIEGE
  #310 = Fieldref           #262.#311     // ext/mods/gameserver/network/SystemMessageId.ALREADY_REQUESTED_SIEGE_BATTLE:Lext/mods/gameserver/network/SystemMessageId;
  #311 = NameAndType        #312:#266     // ALREADY_REQUESTED_SIEGE_BATTLE:Lext/mods/gameserver/network/SystemMessageId;
  #312 = Utf8               ALREADY_REQUESTED_SIEGE_BATTLE
  #313 = Methodref          #314.#315     // ext/mods/gameserver/data/manager/ClanHallManager.getInstance:()Lext/mods/gameserver/data/manager/ClanHallManager;
  #314 = Class              #316          // ext/mods/gameserver/data/manager/ClanHallManager
  #315 = NameAndType        #44:#317      // getInstance:()Lext/mods/gameserver/data/manager/ClanHallManager;
  #316 = Utf8               ext/mods/gameserver/data/manager/ClanHallManager
  #317 = Utf8               ()Lext/mods/gameserver/data/manager/ClanHallManager;
  #318 = Methodref          #314.#319     // ext/mods/gameserver/data/manager/ClanHallManager.isClanParticipating:(Lext/mods/gameserver/model/pledge/Clan;)Z
  #319 = NameAndType        #320:#321     // isClanParticipating:(Lext/mods/gameserver/model/pledge/Clan;)Z
  #320 = Utf8               isClanParticipating
  #321 = Utf8               (Lext/mods/gameserver/model/pledge/Clan;)Z
  #322 = Fieldref           #262.#323     // ext/mods/gameserver/network/SystemMessageId.APPLICATION_DENIED_BECAUSE_ALREADY_SUBMITTED_A_REQUEST_FOR_ANOTHER_SIEGE_BATTLE:Lext/mods/gameserver/network/SystemMessageId;
  #323 = NameAndType        #324:#266     // APPLICATION_DENIED_BECAUSE_ALREADY_SUBMITTED_A_REQUEST_FOR_ANOTHER_SIEGE_BATTLE:Lext/mods/gameserver/network/SystemMessageId;
  #324 = Utf8               APPLICATION_DENIED_BECAUSE_ALREADY_SUBMITTED_A_REQUEST_FOR_ANOTHER_SIEGE_BATTLE
  #325 = InterfaceMethodref #190.#326     // java/util/List.size:()I
  #326 = NameAndType        #327:#99      // size:()I
  #327 = Utf8               size
  #328 = Fieldref           #256.#329     // ext/mods/Config.CH_MAX_ATTACKERS_NUMBER:I
  #329 = NameAndType        #330:#260     // CH_MAX_ATTACKERS_NUMBER:I
  #330 = Utf8               CH_MAX_ATTACKERS_NUMBER
  #331 = Fieldref           #262.#332     // ext/mods/gameserver/network/SystemMessageId.ATTACKER_SIDE_FULL:Lext/mods/gameserver/network/SystemMessageId;
  #332 = NameAndType        #333:#266     // ATTACKER_SIDE_FULL:Lext/mods/gameserver/network/SystemMessageId;
  #333 = Utf8               ATTACKER_SIDE_FULL
  #334 = Methodref          #14.#335      // ext/mods/gameserver/model/residence/clanhall/SiegableHall.addAttacker:(Lext/mods/gameserver/model/pledge/Clan;)V
  #335 = NameAndType        #336:#337     // addAttacker:(Lext/mods/gameserver/model/pledge/Clan;)V
  #336 = Utf8               addAttacker
  #337 = Utf8               (Lext/mods/gameserver/model/pledge/Clan;)V
  #338 = Methodref          #184.#339     // ext/mods/gameserver/model/residence/clanhall/ClanHallSiege.updateAttackers:()V
  #339 = NameAndType        #340:#124     // updateAttackers:()V
  #340 = Utf8               updateAttackers
  #341 = Methodref          #14.#342      // ext/mods/gameserver/model/residence/clanhall/SiegableHall.isRegistering:()Z
  #342 = NameAndType        #343:#120     // isRegistering:()Z
  #343 = Utf8               isRegistering
  #344 = Methodref          #14.#345      // ext/mods/gameserver/model/residence/clanhall/SiegableHall.removeAttacker:(Lext/mods/gameserver/model/pledge/Clan;)V
  #345 = NameAndType        #346:#337     // removeAttacker:(Lext/mods/gameserver/model/pledge/Clan;)V
  #346 = Utf8               removeAttacker
  #347 = Methodref          #46.#348      // ext/mods/gameserver/model/zone/type/SiegeZone.getSiegableId:()I
  #348 = NameAndType        #349:#99      // getSiegableId:()I
  #349 = Utf8               getSiegableId
  #350 = Utf8               UPDATE_CLANHALL
  #351 = Utf8               Ljava/lang/String;
  #352 = Utf8               ConstantValue
  #353 = Utf8               Code
  #354 = Utf8               LineNumberTable
  #355 = Utf8               LocalVariableTable
  #356 = Utf8               this
  #357 = Utf8               Lext/mods/gameserver/model/residence/clanhall/SiegableHall;
  #358 = Utf8               Lext/mods/commons/data/StatSet;
  #359 = Utf8               ps
  #360 = Utf8               Ljava/sql/PreparedStatement;
  #361 = Utf8               con
  #362 = Utf8               Ljava/sql/Connection;
  #363 = Utf8               e
  #364 = Utf8               Ljava/lang/Exception;
  #365 = Utf8               StackMapTable
  #366 = Utf8               setSiege
  #367 = Utf8               (Lext/mods/gameserver/model/residence/clanhall/ClanHallSiege;)V
  #368 = Utf8               siegable
  #369 = Utf8               getSiegeDate
  #370 = Utf8               getSiegeLength
  #371 = Utf8               date
  #372 = Utf8               c
  #373 = Utf8               updateNextSiege
  #374 = Utf8               clan
  #375 = Utf8               Lext/mods/gameserver/model/pledge/Clan;
  #376 = Utf8               isRegistered
  #377 = Utf8               getSiegeStatus
  #378 = Utf8               ()Lext/mods/gameserver/enums/SiegeStatus;
  #379 = Utf8               updateSiegeStatus
  #380 = Utf8               (Lext/mods/gameserver/enums/SiegeStatus;)V
  #381 = Utf8               status
  #382 = Utf8               getSiegeZone
  #383 = Utf8               ()Lext/mods/gameserver/model/zone/type/SiegeZone;
  #384 = Utf8               door
  #385 = Utf8               Lext/mods/gameserver/model/actor/instance/Door;
  #386 = Utf8               isDoorWeak
  #387 = Utf8               Z
  #388 = Utf8               registerClan
  #389 = Utf8               (Lext/mods/gameserver/model/pledge/Clan;Lext/mods/gameserver/model/actor/Player;)V
  #390 = Utf8               player
  #391 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #392 = Utf8               unregisterClan
  #393 = Utf8               lambda$new$0
  #394 = Utf8               (Lext/mods/gameserver/model/zone/type/SiegeZone;)Z
  #395 = Utf8               z
  #396 = Utf8               SourceFile
  #397 = Utf8               SiegableHall.java
  #398 = Utf8               BootstrapMethods
  #399 = MethodType         #193          //  (Ljava/lang/Object;)Z
  #400 = MethodHandle       5:#401        // REF_invokeVirtual ext/mods/gameserver/model/residence/clanhall/SiegableHall.lambda$new$0:(Lext/mods/gameserver/model/zone/type/SiegeZone;)Z
  #401 = Methodref          #14.#402      // ext/mods/gameserver/model/residence/clanhall/SiegableHall.lambda$new$0:(Lext/mods/gameserver/model/zone/type/SiegeZone;)Z
  #402 = NameAndType        #393:#394     // lambda$new$0:(Lext/mods/gameserver/model/zone/type/SiegeZone;)Z
  #403 = MethodType         #394          //  (Lext/mods/gameserver/model/zone/type/SiegeZone;)Z
  #404 = MethodHandle       6:#405        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #405 = Methodref          #406.#407     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #406 = Class              #408          // java/lang/invoke/LambdaMetafactory
  #407 = NameAndType        #409:#410     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #408 = Utf8               java/lang/invoke/LambdaMetafactory
  #409 = Utf8               metafactory
  #410 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #411 = Utf8               InnerClasses
  #412 = Class              #413          // java/lang/invoke/MethodHandles$Lookup
  #413 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #414 = Class              #415          // java/lang/invoke/MethodHandles
  #415 = Utf8               java/lang/invoke/MethodHandles
  #416 = Utf8               Lookup
{
  public ext.mods.gameserver.model.residence.clanhall.SiegableHall(ext.mods.commons.data.StatSet);
    descriptor: (Lext/mods/commons/data/StatSet;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokespecial #1                  // Method ext/mods/gameserver/model/residence/clanhall/ClanHall."<init>":(Lext/mods/commons/data/StatSet;)V
         5: aload_0
         6: getstatic     #7                  // Field ext/mods/gameserver/enums/SiegeStatus.REGISTRATION_OPENED:Lext/mods/gameserver/enums/SiegeStatus;
         9: putfield      #13                 // Field _status:Lext/mods/gameserver/enums/SiegeStatus;
        12: aload_0
        13: aload_1
        14: ldc           #18                 // String siegeLength
        16: invokevirtual #20                 // Method ext/mods/commons/data/StatSet.getLong:(Ljava/lang/String;)J
        19: putfield      #26                 // Field _siegeLength:J
        22: aload_0
        23: aload_1
        24: ldc           #30                 // String scheduleConfig
        26: invokevirtual #32                 // Method ext/mods/commons/data/StatSet.getIntegerArray:(Ljava/lang/String;)[I
        29: putfield      #36                 // Field _scheduleConfig:[I
        32: aload_0
        33: invokestatic  #40                 // Method ext/mods/gameserver/data/manager/ZoneManager.getInstance:()Lext/mods/gameserver/data/manager/ZoneManager;
        36: ldc           #46                 // class ext/mods/gameserver/model/zone/type/SiegeZone
        38: invokevirtual #48                 // Method ext/mods/gameserver/data/manager/ZoneManager.getAllZones:(Ljava/lang/Class;)Ljava/util/Collection;
        41: invokeinterface #52,  1           // InterfaceMethod java/util/Collection.stream:()Ljava/util/stream/Stream;
        46: aload_0
        47: invokedynamic #58,  0             // InvokeDynamic #0:test:(Lext/mods/gameserver/model/residence/clanhall/SiegableHall;)Ljava/util/function/Predicate;
        52: invokeinterface #62,  2           // InterfaceMethod java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
        57: invokeinterface #68,  1           // InterfaceMethod java/util/stream/Stream.findFirst:()Ljava/util/Optional;
        62: aconst_null
        63: invokevirtual #72                 // Method java/util/Optional.orElse:(Ljava/lang/Object;)Ljava/lang/Object;
        66: checkcast     #46                 // class ext/mods/gameserver/model/zone/type/SiegeZone
        69: putfield      #78                 // Field _siegeZone:Lext/mods/gameserver/model/zone/type/SiegeZone;
        72: return
      LineNumberTable:
        line 54: 0
        line 47: 5
        line 56: 12
        line 57: 22
        line 59: 32
        line 60: 72
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      73     0  this   Lext/mods/gameserver/model/residence/clanhall/SiegableHall;
            0      73     1   set   Lext/mods/commons/data/StatSet;

  public final void updateDb();
    descriptor: ()V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=4, locals=5, args_size=1
         0: invokestatic  #82                 // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
         3: astore_1
         4: aload_1
         5: ldc           #88                 // String UPDATE clanhall SET ownerId=?, endDate=? WHERE id=?
         7: invokeinterface #90,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        12: astore_2
        13: aload_2
        14: iconst_1
        15: aload_0
        16: invokevirtual #96                 // Method getOwnerId:()I
        19: invokeinterface #100,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        24: aload_2
        25: iconst_2
        26: aload_0
        27: invokevirtual #106                // Method getNextSiegeTime:()J
        30: invokeinterface #110,  4          // InterfaceMethod java/sql/PreparedStatement.setLong:(IJ)V
        35: aload_2
        36: iconst_3
        37: aload_0
        38: invokevirtual #114                // Method getId:()I
        41: invokeinterface #100,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        46: aload_2
        47: invokeinterface #117,  1          // InterfaceMethod java/sql/PreparedStatement.execute:()Z
        52: pop
        53: aload_2
        54: ifnull        90
        57: aload_2
        58: invokeinterface #121,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
        63: goto          90
        66: astore_3
        67: aload_2
        68: ifnull        88
        71: aload_2
        72: invokeinterface #121,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
        77: goto          88
        80: astore        4
        82: aload_3
        83: aload         4
        85: invokevirtual #127                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        88: aload_3
        89: athrow
        90: aload_1
        91: ifnull        125
        94: aload_1
        95: invokeinterface #131,  1          // InterfaceMethod java/sql/Connection.close:()V
       100: goto          125
       103: astore_2
       104: aload_1
       105: ifnull        123
       108: aload_1
       109: invokeinterface #131,  1          // InterfaceMethod java/sql/Connection.close:()V
       114: goto          123
       117: astore_3
       118: aload_2
       119: aload_3
       120: invokevirtual #127                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       123: aload_2
       124: athrow
       125: goto          138
       128: astore_1
       129: getstatic     #134                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       132: ldc           #138                // String Couldn\'t save SiegableHall.
       134: aload_1
       135: invokevirtual #140                // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
       138: return
      Exception table:
         from    to  target type
            13    53    66   Class java/lang/Throwable
            71    77    80   Class java/lang/Throwable
             4    90   103   Class java/lang/Throwable
           108   114   117   Class java/lang/Throwable
             0   125   128   Class java/lang/Exception
      LineNumberTable:
        line 65: 0
        line 66: 4
        line 68: 13
        line 69: 24
        line 70: 35
        line 71: 46
        line 72: 53
        line 65: 66
        line 72: 90
        line 65: 103
        line 76: 125
        line 73: 128
        line 75: 129
        line 77: 138
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           13      77     2    ps   Ljava/sql/PreparedStatement;
            4     121     1   con   Ljava/sql/Connection;
          129       9     1     e   Ljava/lang/Exception;
            0     139     0  this   Lext/mods/gameserver/model/residence/clanhall/SiegableHall;
      StackMapTable: number_of_entries = 10
        frame_type = 255 /* full_frame */
          offset_delta = 66
          locals = [ class ext/mods/gameserver/model/residence/clanhall/SiegableHall, class java/sql/Connection, class java/sql/PreparedStatement ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/model/residence/clanhall/SiegableHall, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 7 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/model/residence/clanhall/SiegableHall, class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 5 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 9 /* same */

  public final void setSiege(ext.mods.gameserver.model.residence.clanhall.ClanHallSiege);
    descriptor: (Lext/mods/gameserver/model/residence/clanhall/ClanHallSiege;)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: putfield      #146                // Field _siege:Lext/mods/gameserver/model/residence/clanhall/ClanHallSiege;
         5: return
      LineNumberTable:
        line 81: 0
        line 82: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/residence/clanhall/SiegableHall;
            0       6     1 siegable   Lext/mods/gameserver/model/residence/clanhall/ClanHallSiege;

  public final ext.mods.gameserver.model.residence.clanhall.ClanHallSiege getSiege();
    descriptor: ()Lext/mods/gameserver/model/residence/clanhall/ClanHallSiege;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #146                // Field _siege:Lext/mods/gameserver/model/residence/clanhall/ClanHallSiege;
         4: areturn
      LineNumberTable:
        line 86: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/residence/clanhall/SiegableHall;

  public final java.util.Calendar getSiegeDate();
    descriptor: ()Ljava/util/Calendar;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #150                // Field _nextSiege:Ljava/util/Calendar;
         4: areturn
      LineNumberTable:
        line 91: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/residence/clanhall/SiegableHall;

  public final long getSiegeLength();
    descriptor: ()J
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #26                 // Field _siegeLength:J
         4: lreturn
      LineNumberTable:
        line 96: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/residence/clanhall/SiegableHall;

  public final long getNextSiegeTime();
    descriptor: ()J
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #150                // Field _nextSiege:Ljava/util/Calendar;
         4: invokevirtual #154                // Method java/util/Calendar.getTimeInMillis:()J
         7: lreturn
      LineNumberTable:
        line 101: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/residence/clanhall/SiegableHall;

  public final void setNextSiegeDate(long);
    descriptor: (J)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=3, locals=3, args_size=2
         0: aload_0
         1: getfield      #150                // Field _nextSiege:Ljava/util/Calendar;
         4: lload_1
         5: invokevirtual #159                // Method java/util/Calendar.setTimeInMillis:(J)V
         8: return
      LineNumberTable:
        line 106: 0
        line 107: 8
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       9     0  this   Lext/mods/gameserver/model/residence/clanhall/SiegableHall;
            0       9     1  date   J

  public final void setNextSiegeDate(java.util.Calendar);
    descriptor: (Ljava/util/Calendar;)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: putfield      #150                // Field _nextSiege:Ljava/util/Calendar;
         5: return
      LineNumberTable:
        line 111: 0
        line 112: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/residence/clanhall/SiegableHall;
            0       6     1     c   Ljava/util/Calendar;

  public final void updateNextSiege();
    descriptor: ()V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=4, locals=2, args_size=1
         0: invokestatic  #163                // Method java/util/Calendar.getInstance:()Ljava/util/Calendar;
         3: astore_1
         4: aload_1
         5: bipush        6
         7: aload_0
         8: getfield      #36                 // Field _scheduleConfig:[I
        11: iconst_0
        12: iaload
        13: invokevirtual #166                // Method java/util/Calendar.add:(II)V
        16: aload_1
        17: iconst_2
        18: aload_0
        19: getfield      #36                 // Field _scheduleConfig:[I
        22: iconst_1
        23: iaload
        24: invokevirtual #166                // Method java/util/Calendar.add:(II)V
        27: aload_1
        28: iconst_1
        29: aload_0
        30: getfield      #36                 // Field _scheduleConfig:[I
        33: iconst_2
        34: iaload
        35: invokevirtual #166                // Method java/util/Calendar.add:(II)V
        38: aload_1
        39: bipush        11
        41: aload_0
        42: getfield      #36                 // Field _scheduleConfig:[I
        45: iconst_3
        46: iaload
        47: invokevirtual #169                // Method java/util/Calendar.set:(II)V
        50: aload_1
        51: bipush        12
        53: aload_0
        54: getfield      #36                 // Field _scheduleConfig:[I
        57: iconst_4
        58: iaload
        59: invokevirtual #169                // Method java/util/Calendar.set:(II)V
        62: aload_1
        63: bipush        13
        65: iconst_0
        66: invokevirtual #169                // Method java/util/Calendar.set:(II)V
        69: aload_0
        70: aload_1
        71: invokevirtual #172                // Method setNextSiegeDate:(Ljava/util/Calendar;)V
        74: aload_0
        75: invokevirtual #176                // Method updateDb:()V
        78: return
      LineNumberTable:
        line 116: 0
        line 117: 4
        line 118: 16
        line 119: 27
        line 120: 38
        line 121: 50
        line 122: 62
        line 124: 69
        line 126: 74
        line 127: 78
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      79     0  this   Lext/mods/gameserver/model/residence/clanhall/SiegableHall;
            4      75     1     c   Ljava/util/Calendar;

  public final void addAttacker(ext.mods.gameserver.model.pledge.Clan);
    descriptor: (Lext/mods/gameserver/model/pledge/Clan;)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: invokevirtual #179                // Method getSiege:()Lext/mods/gameserver/model/residence/clanhall/ClanHallSiege;
         4: ifnull        21
         7: aload_0
         8: invokevirtual #179                // Method getSiege:()Lext/mods/gameserver/model/residence/clanhall/ClanHallSiege;
        11: invokevirtual #183                // Method ext/mods/gameserver/model/residence/clanhall/ClanHallSiege.getAttackerClans:()Ljava/util/List;
        14: aload_1
        15: invokeinterface #189,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        20: pop
        21: return
      LineNumberTable:
        line 131: 0
        line 132: 7
        line 133: 21
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      22     0  this   Lext/mods/gameserver/model/residence/clanhall/SiegableHall;
            0      22     1  clan   Lext/mods/gameserver/model/pledge/Clan;
      StackMapTable: number_of_entries = 1
        frame_type = 21 /* same */

  public final void removeAttacker(ext.mods.gameserver.model.pledge.Clan);
    descriptor: (Lext/mods/gameserver/model/pledge/Clan;)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: invokevirtual #179                // Method getSiege:()Lext/mods/gameserver/model/residence/clanhall/ClanHallSiege;
         4: ifnull        21
         7: aload_0
         8: invokevirtual #179                // Method getSiege:()Lext/mods/gameserver/model/residence/clanhall/ClanHallSiege;
        11: invokevirtual #183                // Method ext/mods/gameserver/model/residence/clanhall/ClanHallSiege.getAttackerClans:()Ljava/util/List;
        14: aload_1
        15: invokeinterface #194,  2          // InterfaceMethod java/util/List.remove:(Ljava/lang/Object;)Z
        20: pop
        21: return
      LineNumberTable:
        line 137: 0
        line 138: 7
        line 139: 21
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      22     0  this   Lext/mods/gameserver/model/residence/clanhall/SiegableHall;
            0      22     1  clan   Lext/mods/gameserver/model/pledge/Clan;
      StackMapTable: number_of_entries = 1
        frame_type = 21 /* same */

  public final boolean isRegistered(ext.mods.gameserver.model.pledge.Clan);
    descriptor: (Lext/mods/gameserver/model/pledge/Clan;)Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: invokevirtual #179                // Method getSiege:()Lext/mods/gameserver/model/residence/clanhall/ClanHallSiege;
         4: ifnull        27
         7: aload_0
         8: invokevirtual #179                // Method getSiege:()Lext/mods/gameserver/model/residence/clanhall/ClanHallSiege;
        11: invokevirtual #183                // Method ext/mods/gameserver/model/residence/clanhall/ClanHallSiege.getAttackerClans:()Ljava/util/List;
        14: aload_1
        15: invokeinterface #197,  2          // InterfaceMethod java/util/List.contains:(Ljava/lang/Object;)Z
        20: ifeq          27
        23: iconst_1
        24: goto          28
        27: iconst_0
        28: ireturn
      LineNumberTable:
        line 143: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      29     0  this   Lext/mods/gameserver/model/residence/clanhall/SiegableHall;
            0      29     1  clan   Lext/mods/gameserver/model/pledge/Clan;
      StackMapTable: number_of_entries = 2
        frame_type = 27 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public final ext.mods.gameserver.enums.SiegeStatus getSiegeStatus();
    descriptor: ()Lext/mods/gameserver/enums/SiegeStatus;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field _status:Lext/mods/gameserver/enums/SiegeStatus;
         4: areturn
      LineNumberTable:
        line 148: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/residence/clanhall/SiegableHall;

  public final boolean isRegistering();
    descriptor: ()Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field _status:Lext/mods/gameserver/enums/SiegeStatus;
         4: getstatic     #7                  // Field ext/mods/gameserver/enums/SiegeStatus.REGISTRATION_OPENED:Lext/mods/gameserver/enums/SiegeStatus;
         7: if_acmpne     14
        10: iconst_1
        11: goto          15
        14: iconst_0
        15: ireturn
      LineNumberTable:
        line 153: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      16     0  this   Lext/mods/gameserver/model/residence/clanhall/SiegableHall;
      StackMapTable: number_of_entries = 2
        frame_type = 14 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public final boolean isInSiege();
    descriptor: ()Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field _status:Lext/mods/gameserver/enums/SiegeStatus;
         4: getstatic     #200                // Field ext/mods/gameserver/enums/SiegeStatus.IN_PROGRESS:Lext/mods/gameserver/enums/SiegeStatus;
         7: if_acmpne     14
        10: iconst_1
        11: goto          15
        14: iconst_0
        15: ireturn
      LineNumberTable:
        line 158: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      16     0  this   Lext/mods/gameserver/model/residence/clanhall/SiegableHall;
      StackMapTable: number_of_entries = 2
        frame_type = 14 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public final boolean isWaitingBattle();
    descriptor: ()Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field _status:Lext/mods/gameserver/enums/SiegeStatus;
         4: getstatic     #203                // Field ext/mods/gameserver/enums/SiegeStatus.REGISTRATION_OVER:Lext/mods/gameserver/enums/SiegeStatus;
         7: if_acmpne     14
        10: iconst_1
        11: goto          15
        14: iconst_0
        15: ireturn
      LineNumberTable:
        line 163: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      16     0  this   Lext/mods/gameserver/model/residence/clanhall/SiegableHall;
      StackMapTable: number_of_entries = 2
        frame_type = 14 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public final void updateSiegeStatus(ext.mods.gameserver.enums.SiegeStatus);
    descriptor: (Lext/mods/gameserver/enums/SiegeStatus;)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: putfield      #13                 // Field _status:Lext/mods/gameserver/enums/SiegeStatus;
         5: return
      LineNumberTable:
        line 168: 0
        line 169: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/residence/clanhall/SiegableHall;
            0       6     1 status   Lext/mods/gameserver/enums/SiegeStatus;

  public final ext.mods.gameserver.model.zone.type.SiegeZone getSiegeZone();
    descriptor: ()Lext/mods/gameserver/model/zone/type/SiegeZone;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #78                 // Field _siegeZone:Lext/mods/gameserver/model/zone/type/SiegeZone;
         4: areturn
      LineNumberTable:
        line 173: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/residence/clanhall/SiegableHall;

  public final void spawnDoor();
    descriptor: ()V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: iconst_0
         2: invokevirtual #206                // Method spawnDoor:(Z)V
         5: return
      LineNumberTable:
        line 178: 0
        line 179: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/residence/clanhall/SiegableHall;

  public final void spawnDoor(boolean);
    descriptor: (Z)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=3, locals=4, args_size=2
         0: aload_0
         1: invokevirtual #210                // Method getDoors:()Ljava/util/List;
         4: invokeinterface #213,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
         9: astore_2
        10: aload_2
        11: invokeinterface #217,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        16: ifeq          79
        19: aload_2
        20: invokeinterface #222,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        25: checkcast     #226                // class ext/mods/gameserver/model/actor/instance/Door
        28: astore_3
        29: aload_3
        30: invokevirtual #228                // Method ext/mods/gameserver/model/actor/instance/Door.isDead:()Z
        33: ifeq          40
        36: aload_3
        37: invokevirtual #231                // Method ext/mods/gameserver/model/actor/instance/Door.doRevive:()V
        40: aload_3
        41: invokevirtual #234                // Method ext/mods/gameserver/model/actor/instance/Door.closeMe:()V
        44: aload_3
        45: invokevirtual #237                // Method ext/mods/gameserver/model/actor/instance/Door.getStatus:()Lext/mods/gameserver/model/actor/status/DoorStatus;
        48: iload_1
        49: ifeq          65
        52: aload_3
        53: invokevirtual #237                // Method ext/mods/gameserver/model/actor/instance/Door.getStatus:()Lext/mods/gameserver/model/actor/status/DoorStatus;
        56: invokevirtual #241                // Method ext/mods/gameserver/model/actor/status/DoorStatus.getMaxHp:()I
        59: iconst_2
        60: idiv
        61: i2d
        62: goto          73
        65: aload_3
        66: invokevirtual #237                // Method ext/mods/gameserver/model/actor/instance/Door.getStatus:()Lext/mods/gameserver/model/actor/status/DoorStatus;
        69: invokevirtual #241                // Method ext/mods/gameserver/model/actor/status/DoorStatus.getMaxHp:()I
        72: i2d
        73: invokevirtual #246                // Method ext/mods/gameserver/model/actor/status/DoorStatus.setHp:(D)V
        76: goto          10
        79: return
      LineNumberTable:
        line 187: 0
        line 189: 29
        line 190: 36
        line 192: 40
        line 193: 44
        line 194: 76
        line 195: 79
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           29      47     3  door   Lext/mods/gameserver/model/actor/instance/Door;
            0      80     0  this   Lext/mods/gameserver/model/residence/clanhall/SiegableHall;
            0      80     1 isDoorWeak   Z
      StackMapTable: number_of_entries = 5
        frame_type = 252 /* append */
          offset_delta = 10
          locals = [ class java/util/Iterator ]
        frame_type = 252 /* append */
          offset_delta = 29
          locals = [ class ext/mods/gameserver/model/actor/instance/Door ]
        frame_type = 88 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/model/actor/status/DoorStatus ]
        frame_type = 255 /* full_frame */
          offset_delta = 7
          locals = [ class ext/mods/gameserver/model/residence/clanhall/SiegableHall, int, class java/util/Iterator, class ext/mods/gameserver/model/actor/instance/Door ]
          stack = [ class ext/mods/gameserver/model/actor/status/DoorStatus, double ]
        frame_type = 249 /* chop */
          offset_delta = 5

  public final void registerClan(ext.mods.gameserver.model.pledge.Clan, ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/pledge/Clan;Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=3, locals=3, args_size=3
         0: aload_1
         1: ifnull        14
         4: aload_1
         5: invokevirtual #250                // Method ext/mods/gameserver/model/pledge/Clan.getLevel:()I
         8: getstatic     #255                // Field ext/mods/Config.CH_MINIMUM_CLAN_LEVEL:I
        11: if_icmpge     24
        14: aload_2
        15: getstatic     #261                // Field ext/mods/gameserver/network/SystemMessageId.ONLY_CLAN_LEVEL_4_ABOVE_MAY_SIEGE:Lext/mods/gameserver/network/SystemMessageId;
        18: invokevirtual #267                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        21: goto          185
        24: aload_0
        25: invokevirtual #273                // Method isWaitingBattle:()Z
        28: ifeq          51
        31: aload_2
        32: getstatic     #276                // Field ext/mods/gameserver/network/SystemMessageId.DEADLINE_FOR_SIEGE_S1_PASSED:Lext/mods/gameserver/network/SystemMessageId;
        35: invokestatic  #279                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        38: aload_0
        39: invokevirtual #114                // Method getId:()I
        42: invokevirtual #285                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addFortId:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        45: invokevirtual #289                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        48: goto          185
        51: aload_0
        52: invokevirtual #292                // Method isInSiege:()Z
        55: ifeq          68
        58: aload_2
        59: getstatic     #295                // Field ext/mods/gameserver/network/SystemMessageId.NOT_SIEGE_REGISTRATION_TIME2:Lext/mods/gameserver/network/SystemMessageId;
        62: invokevirtual #267                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        65: goto          185
        68: aload_0
        69: invokevirtual #96                 // Method getOwnerId:()I
        72: aload_1
        73: invokevirtual #298                // Method ext/mods/gameserver/model/pledge/Clan.getClanId:()I
        76: if_icmpne     89
        79: aload_2
        80: getstatic     #301                // Field ext/mods/gameserver/network/SystemMessageId.CLAN_THAT_OWNS_CASTLE_IS_AUTOMATICALLY_REGISTERED_DEFENDING:Lext/mods/gameserver/network/SystemMessageId;
        83: invokevirtual #267                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        86: goto          185
        89: aload_1
        90: invokevirtual #304                // Method ext/mods/gameserver/model/pledge/Clan.getClanHallId:()I
        93: ifeq          106
        96: aload_2
        97: getstatic     #307                // Field ext/mods/gameserver/network/SystemMessageId.CLAN_THAT_OWNS_CASTLE_CANNOT_PARTICIPATE_OTHER_SIEGE:Lext/mods/gameserver/network/SystemMessageId;
       100: invokevirtual #267                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       103: goto          185
       106: aload_0
       107: invokevirtual #179                // Method getSiege:()Lext/mods/gameserver/model/residence/clanhall/ClanHallSiege;
       110: invokevirtual #183                // Method ext/mods/gameserver/model/residence/clanhall/ClanHallSiege.getAttackerClans:()Ljava/util/List;
       113: aload_1
       114: invokeinterface #197,  2          // InterfaceMethod java/util/List.contains:(Ljava/lang/Object;)Z
       119: ifeq          132
       122: aload_2
       123: getstatic     #310                // Field ext/mods/gameserver/network/SystemMessageId.ALREADY_REQUESTED_SIEGE_BATTLE:Lext/mods/gameserver/network/SystemMessageId;
       126: invokevirtual #267                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       129: goto          185
       132: invokestatic  #313                // Method ext/mods/gameserver/data/manager/ClanHallManager.getInstance:()Lext/mods/gameserver/data/manager/ClanHallManager;
       135: aload_1
       136: invokevirtual #318                // Method ext/mods/gameserver/data/manager/ClanHallManager.isClanParticipating:(Lext/mods/gameserver/model/pledge/Clan;)Z
       139: ifeq          152
       142: aload_2
       143: getstatic     #322                // Field ext/mods/gameserver/network/SystemMessageId.APPLICATION_DENIED_BECAUSE_ALREADY_SUBMITTED_A_REQUEST_FOR_ANOTHER_SIEGE_BATTLE:Lext/mods/gameserver/network/SystemMessageId;
       146: invokevirtual #267                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       149: goto          185
       152: aload_0
       153: invokevirtual #179                // Method getSiege:()Lext/mods/gameserver/model/residence/clanhall/ClanHallSiege;
       156: invokevirtual #183                // Method ext/mods/gameserver/model/residence/clanhall/ClanHallSiege.getAttackerClans:()Ljava/util/List;
       159: invokeinterface #325,  1          // InterfaceMethod java/util/List.size:()I
       164: getstatic     #328                // Field ext/mods/Config.CH_MAX_ATTACKERS_NUMBER:I
       167: if_icmplt     180
       170: aload_2
       171: getstatic     #331                // Field ext/mods/gameserver/network/SystemMessageId.ATTACKER_SIDE_FULL:Lext/mods/gameserver/network/SystemMessageId;
       174: invokevirtual #267                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       177: goto          185
       180: aload_0
       181: aload_1
       182: invokevirtual #334                // Method addAttacker:(Lext/mods/gameserver/model/pledge/Clan;)V
       185: aload_0
       186: invokevirtual #179                // Method getSiege:()Lext/mods/gameserver/model/residence/clanhall/ClanHallSiege;
       189: invokevirtual #338                // Method ext/mods/gameserver/model/residence/clanhall/ClanHallSiege.updateAttackers:()V
       192: return
      LineNumberTable:
        line 204: 0
        line 205: 14
        line 206: 24
        line 207: 31
        line 208: 51
        line 209: 58
        line 210: 68
        line 211: 79
        line 212: 89
        line 213: 96
        line 214: 106
        line 215: 122
        line 216: 132
        line 217: 142
        line 218: 152
        line 219: 170
        line 221: 180
        line 223: 185
        line 224: 192
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     193     0  this   Lext/mods/gameserver/model/residence/clanhall/SiegableHall;
            0     193     1  clan   Lext/mods/gameserver/model/pledge/Clan;
            0     193     2 player   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 10
        frame_type = 14 /* same */
        frame_type = 9 /* same */
        frame_type = 26 /* same */
        frame_type = 16 /* same */
        frame_type = 20 /* same */
        frame_type = 16 /* same */
        frame_type = 25 /* same */
        frame_type = 19 /* same */
        frame_type = 27 /* same */
        frame_type = 4 /* same */

  public final void unregisterClan(ext.mods.gameserver.model.pledge.Clan);
    descriptor: (Lext/mods/gameserver/model/pledge/Clan;)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: invokevirtual #341                // Method isRegistering:()Z
         4: ifne          8
         7: return
         8: aload_0
         9: aload_1
        10: invokevirtual #344                // Method removeAttacker:(Lext/mods/gameserver/model/pledge/Clan;)V
        13: aload_0
        14: invokevirtual #179                // Method getSiege:()Lext/mods/gameserver/model/residence/clanhall/ClanHallSiege;
        17: invokevirtual #338                // Method ext/mods/gameserver/model/residence/clanhall/ClanHallSiege.updateAttackers:()V
        20: return
      LineNumberTable:
        line 232: 0
        line 233: 7
        line 235: 8
        line 237: 13
        line 238: 20
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      21     0  this   Lext/mods/gameserver/model/residence/clanhall/SiegableHall;
            0      21     1  clan   Lext/mods/gameserver/model/pledge/Clan;
      StackMapTable: number_of_entries = 1
        frame_type = 8 /* same */
}
SourceFile: "SiegableHall.java"
BootstrapMethods:
  0: #404 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #399 (Ljava/lang/Object;)Z
      #400 REF_invokeVirtual ext/mods/gameserver/model/residence/clanhall/SiegableHall.lambda$new$0:(Lext/mods/gameserver/model/zone/type/SiegeZone;)Z
      #403 (Lext/mods/gameserver/model/zone/type/SiegeZone;)Z
InnerClasses:
  public static final #416= #412 of #414; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
