// Bytecode for: ext.mods.gameserver.model.residence.clanhall.ClanHallSiege
// File: ext\mods\gameserver\model\residence\clanhall\ClanHallSiege.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/residence/clanhall/ClanHallSiege.class
  Last modified 9 de jul de 2026; size 13396 bytes
  MD5 checksum 51b4fb63cf36a0260f7261a70a3a428f
  Compiled from "ClanHallSiege.java"
public abstract class ext.mods.gameserver.model.residence.clanhall.ClanHallSiege extends ext.mods.gameserver.scripting.Quest implements ext.mods.gameserver.model.residence.Siegable
  minor version: 0
  major version: 69
  flags: (0x0421) ACC_PUBLIC, ACC_SUPER, ACC_ABSTRACT
  this_class: #13                         // ext/mods/gameserver/model/residence/clanhall/ClanHallSiege
  super_class: #2                         // ext/mods/gameserver/scripting/Quest
  interfaces: 1, fields: 15, methods: 25, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/gameserver/scripting/Quest."<init>":(ILjava/lang/String;)V
    #2 = Class              #4            // ext/mods/gameserver/scripting/Quest
    #3 = NameAndType        #5:#6         // "<init>":(ILjava/lang/String;)V
    #4 = Utf8               ext/mods/gameserver/scripting/Quest
    #5 = Utf8               <init>
    #6 = Utf8               (ILjava/lang/String;)V
    #7 = Class              #8            // java/util/concurrent/CopyOnWriteArrayList
    #8 = Utf8               java/util/concurrent/CopyOnWriteArrayList
    #9 = Methodref          #7.#10        // java/util/concurrent/CopyOnWriteArrayList."<init>":()V
   #10 = NameAndType        #5:#11        // "<init>":()V
   #11 = Utf8               ()V
   #12 = Fieldref           #13.#14       // ext/mods/gameserver/model/residence/clanhall/ClanHallSiege._attackers:Ljava/util/List;
   #13 = Class              #15           // ext/mods/gameserver/model/residence/clanhall/ClanHallSiege
   #14 = NameAndType        #16:#17       // _attackers:Ljava/util/List;
   #15 = Utf8               ext/mods/gameserver/model/residence/clanhall/ClanHallSiege
   #16 = Utf8               _attackers
   #17 = Utf8               Ljava/util/List;
   #18 = Methodref          #19.#20       // ext/mods/gameserver/data/manager/ClanHallManager.getInstance:()Lext/mods/gameserver/data/manager/ClanHallManager;
   #19 = Class              #21           // ext/mods/gameserver/data/manager/ClanHallManager
   #20 = NameAndType        #22:#23       // getInstance:()Lext/mods/gameserver/data/manager/ClanHallManager;
   #21 = Utf8               ext/mods/gameserver/data/manager/ClanHallManager
   #22 = Utf8               getInstance
   #23 = Utf8               ()Lext/mods/gameserver/data/manager/ClanHallManager;
   #24 = Methodref          #19.#25       // ext/mods/gameserver/data/manager/ClanHallManager.getSiegableHall:(I)Lext/mods/gameserver/model/residence/clanhall/SiegableHall;
   #25 = NameAndType        #26:#27       // getSiegableHall:(I)Lext/mods/gameserver/model/residence/clanhall/SiegableHall;
   #26 = Utf8               getSiegableHall
   #27 = Utf8               (I)Lext/mods/gameserver/model/residence/clanhall/SiegableHall;
   #28 = Fieldref           #13.#29       // ext/mods/gameserver/model/residence/clanhall/ClanHallSiege._hall:Lext/mods/gameserver/model/residence/clanhall/SiegableHall;
   #29 = NameAndType        #30:#31       // _hall:Lext/mods/gameserver/model/residence/clanhall/SiegableHall;
   #30 = Utf8               _hall
   #31 = Utf8               Lext/mods/gameserver/model/residence/clanhall/SiegableHall;
   #32 = Methodref          #33.#34       // ext/mods/gameserver/model/residence/clanhall/SiegableHall.setSiege:(Lext/mods/gameserver/model/residence/clanhall/ClanHallSiege;)V
   #33 = Class              #35           // ext/mods/gameserver/model/residence/clanhall/SiegableHall
   #34 = NameAndType        #36:#37       // setSiege:(Lext/mods/gameserver/model/residence/clanhall/ClanHallSiege;)V
   #35 = Utf8               ext/mods/gameserver/model/residence/clanhall/SiegableHall
   #36 = Utf8               setSiege
   #37 = Utf8               (Lext/mods/gameserver/model/residence/clanhall/ClanHallSiege;)V
   #38 = Methodref          #33.#39       // ext/mods/gameserver/model/residence/clanhall/SiegableHall.getId:()I
   #39 = NameAndType        #40:#41       // getId:()I
   #40 = Utf8               getId
   #41 = Utf8               ()I
   #42 = Methodref          #13.#43       // ext/mods/gameserver/model/residence/clanhall/ClanHallSiege.loadAttackers:()V
   #43 = NameAndType        #44:#11       // loadAttackers:()V
   #44 = Utf8               loadAttackers
   #45 = InvokeDynamic      #0:#46        // #0:run:(Lext/mods/gameserver/model/residence/clanhall/ClanHallSiege;)Ljava/lang/Runnable;
   #46 = NameAndType        #47:#48       // run:(Lext/mods/gameserver/model/residence/clanhall/ClanHallSiege;)Ljava/lang/Runnable;
   #47 = Utf8               run
   #48 = Utf8               (Lext/mods/gameserver/model/residence/clanhall/ClanHallSiege;)Ljava/lang/Runnable;
   #49 = Methodref          #33.#50       // ext/mods/gameserver/model/residence/clanhall/SiegableHall.getNextSiegeTime:()J
   #50 = NameAndType        #51:#52       // getNextSiegeTime:()J
   #51 = Utf8               getNextSiegeTime
   #52 = Utf8               ()J
   #53 = Methodref          #54.#55       // java/lang/System.currentTimeMillis:()J
   #54 = Class              #56           // java/lang/System
   #55 = NameAndType        #57:#52       // currentTimeMillis:()J
   #56 = Utf8               java/lang/System
   #57 = Utf8               currentTimeMillis
   #58 = Long               3600000l
   #60 = Methodref          #61.#62       // ext/mods/commons/pool/ThreadPool.schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
   #61 = Class              #63           // ext/mods/commons/pool/ThreadPool
   #62 = NameAndType        #64:#65       // schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
   #63 = Utf8               ext/mods/commons/pool/ThreadPool
   #64 = Utf8               schedule
   #65 = Utf8               (Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
   #66 = Fieldref           #13.#67       // ext/mods/gameserver/model/residence/clanhall/ClanHallSiege._siegeTask:Ljava/util/concurrent/ScheduledFuture;
   #67 = NameAndType        #68:#69       // _siegeTask:Ljava/util/concurrent/ScheduledFuture;
   #68 = Utf8               _siegeTask
   #69 = Utf8               Ljava/util/concurrent/ScheduledFuture;
   #70 = Fieldref           #13.#71       // ext/mods/gameserver/model/residence/clanhall/ClanHallSiege.LOGGER:Lext/mods/commons/logging/CLogger;
   #71 = NameAndType        #72:#73       // LOGGER:Lext/mods/commons/logging/CLogger;
   #72 = Utf8               LOGGER
   #73 = Utf8               Lext/mods/commons/logging/CLogger;
   #74 = String             #75           // {} siege scheduled for {}.
   #75 = Utf8               {} siege scheduled for {}.
   #76 = Class              #77           // java/lang/Object
   #77 = Utf8               java/lang/Object
   #78 = Methodref          #33.#79       // ext/mods/gameserver/model/residence/clanhall/SiegableHall.getName:()Ljava/lang/String;
   #79 = NameAndType        #80:#81       // getName:()Ljava/lang/String;
   #80 = Utf8               getName
   #81 = Utf8               ()Ljava/lang/String;
   #82 = Methodref          #13.#83       // ext/mods/gameserver/model/residence/clanhall/ClanHallSiege.getSiegeDate:()Ljava/util/Calendar;
   #83 = NameAndType        #84:#85       // getSiegeDate:()Ljava/util/Calendar;
   #84 = Utf8               getSiegeDate
   #85 = Utf8               ()Ljava/util/Calendar;
   #86 = Methodref          #87.#88       // java/util/Calendar.getTime:()Ljava/util/Date;
   #87 = Class              #89           // java/util/Calendar
   #88 = NameAndType        #90:#91       // getTime:()Ljava/util/Date;
   #89 = Utf8               java/util/Calendar
   #90 = Utf8               getTime
   #91 = Utf8               ()Ljava/util/Date;
   #92 = Methodref          #93.#94       // ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
   #93 = Class              #95           // ext/mods/commons/logging/CLogger
   #94 = NameAndType        #96:#97       // info:(Ljava/lang/Object;[Ljava/lang/Object;)V
   #95 = Utf8               ext/mods/commons/logging/CLogger
   #96 = Utf8               info
   #97 = Utf8               (Ljava/lang/Object;[Ljava/lang/Object;)V
   #98 = Methodref          #99.#100      // ext/mods/gameserver/model/pledge/Clan.getFlag:()Lext/mods/gameserver/model/actor/Npc;
   #99 = Class              #101          // ext/mods/gameserver/model/pledge/Clan
  #100 = NameAndType        #102:#103     // getFlag:()Lext/mods/gameserver/model/actor/Npc;
  #101 = Utf8               ext/mods/gameserver/model/pledge/Clan
  #102 = Utf8               getFlag
  #103 = Utf8               ()Lext/mods/gameserver/model/actor/Npc;
  #104 = Fieldref           #105.#106     // ext/mods/gameserver/enums/SiegeSide.ATTACKER:Lext/mods/gameserver/enums/SiegeSide;
  #105 = Class              #107          // ext/mods/gameserver/enums/SiegeSide
  #106 = NameAndType        #108:#109     // ATTACKER:Lext/mods/gameserver/enums/SiegeSide;
  #107 = Utf8               ext/mods/gameserver/enums/SiegeSide
  #108 = Utf8               ATTACKER
  #109 = Utf8               Lext/mods/gameserver/enums/SiegeSide;
  #110 = InterfaceMethodref #111.#112     // java/util/List.contains:(Ljava/lang/Object;)Z
  #111 = Class              #113          // java/util/List
  #112 = NameAndType        #114:#115     // contains:(Ljava/lang/Object;)Z
  #113 = Utf8               java/util/List
  #114 = Utf8               contains
  #115 = Utf8               (Ljava/lang/Object;)Z
  #116 = Methodref          #117.#118     // java/util/Collections.emptyList:()Ljava/util/List;
  #117 = Class              #119          // java/util/Collections
  #118 = NameAndType        #120:#121     // emptyList:()Ljava/util/List;
  #119 = Utf8               java/util/Collections
  #120 = Utf8               emptyList
  #121 = Utf8               ()Ljava/util/List;
  #122 = Methodref          #33.#83       // ext/mods/gameserver/model/residence/clanhall/SiegableHall.getSiegeDate:()Ljava/util/Calendar;
  #123 = InterfaceMethodref #111.#124     // java/util/List.isEmpty:()Z
  #124 = NameAndType        #125:#126     // isEmpty:()Z
  #125 = Utf8               isEmpty
  #126 = Utf8               ()Z
  #127 = Methodref          #33.#128      // ext/mods/gameserver/model/residence/clanhall/SiegableHall.updateNextSiege:()V
  #128 = NameAndType        #129:#11      // updateNextSiege:()V
  #129 = Utf8               updateNextSiege
  #130 = Fieldref           #131.#132     // ext/mods/gameserver/enums/SiegeStatus.REGISTRATION_OPENED:Lext/mods/gameserver/enums/SiegeStatus;
  #131 = Class              #133          // ext/mods/gameserver/enums/SiegeStatus
  #132 = NameAndType        #134:#135     // REGISTRATION_OPENED:Lext/mods/gameserver/enums/SiegeStatus;
  #133 = Utf8               ext/mods/gameserver/enums/SiegeStatus
  #134 = Utf8               REGISTRATION_OPENED
  #135 = Utf8               Lext/mods/gameserver/enums/SiegeStatus;
  #136 = Methodref          #33.#137      // ext/mods/gameserver/model/residence/clanhall/SiegableHall.updateSiegeStatus:(Lext/mods/gameserver/enums/SiegeStatus;)V
  #137 = NameAndType        #138:#139     // updateSiegeStatus:(Lext/mods/gameserver/enums/SiegeStatus;)V
  #138 = Utf8               updateSiegeStatus
  #139 = Utf8               (Lext/mods/gameserver/enums/SiegeStatus;)V
  #140 = Fieldref           #141.#142     // ext/mods/gameserver/network/SystemMessageId.SIEGE_OF_S1_HAS_BEEN_CANCELED_DUE_TO_LACK_OF_INTEREST:Lext/mods/gameserver/network/SystemMessageId;
  #141 = Class              #143          // ext/mods/gameserver/network/SystemMessageId
  #142 = NameAndType        #144:#145     // SIEGE_OF_S1_HAS_BEEN_CANCELED_DUE_TO_LACK_OF_INTEREST:Lext/mods/gameserver/network/SystemMessageId;
  #143 = Utf8               ext/mods/gameserver/network/SystemMessageId
  #144 = Utf8               SIEGE_OF_S1_HAS_BEEN_CANCELED_DUE_TO_LACK_OF_INTEREST
  #145 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
  #146 = Methodref          #147.#148     // ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #147 = Class              #149          // ext/mods/gameserver/network/serverpackets/SystemMessage
  #148 = NameAndType        #150:#151     // getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #149 = Utf8               ext/mods/gameserver/network/serverpackets/SystemMessage
  #150 = Utf8               getSystemMessage
  #151 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #152 = Methodref          #147.#153     // ext/mods/gameserver/network/serverpackets/SystemMessage.addFortId:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #153 = NameAndType        #154:#155     // addFortId:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #154 = Utf8               addFortId
  #155 = Utf8               (I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #156 = Methodref          #157.#158     // ext/mods/gameserver/model/World.toAllOnlinePlayers:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #157 = Class              #159          // ext/mods/gameserver/model/World
  #158 = NameAndType        #160:#161     // toAllOnlinePlayers:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #159 = Utf8               ext/mods/gameserver/model/World
  #160 = Utf8               toAllOnlinePlayers
  #161 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #162 = Methodref          #33.#163      // ext/mods/gameserver/model/residence/clanhall/SiegableHall.spawnDoor:()V
  #163 = NameAndType        #164:#11      // spawnDoor:()V
  #164 = Utf8               spawnDoor
  #165 = Methodref          #33.#166      // ext/mods/gameserver/model/residence/clanhall/SiegableHall.getZone:()Lext/mods/gameserver/model/zone/type/ClanHallZone;
  #166 = NameAndType        #167:#168     // getZone:()Lext/mods/gameserver/model/zone/type/ClanHallZone;
  #167 = Utf8               getZone
  #168 = Utf8               ()Lext/mods/gameserver/model/zone/type/ClanHallZone;
  #169 = Methodref          #170.#171     // ext/mods/gameserver/model/zone/type/ClanHallZone.banishForeigners:(I)V
  #170 = Class              #172          // ext/mods/gameserver/model/zone/type/ClanHallZone
  #171 = NameAndType        #173:#174     // banishForeigners:(I)V
  #172 = Utf8               ext/mods/gameserver/model/zone/type/ClanHallZone
  #173 = Utf8               banishForeigners
  #174 = Utf8               (I)V
  #175 = Methodref          #33.#176      // ext/mods/gameserver/model/residence/clanhall/SiegableHall.getSiegeZone:()Lext/mods/gameserver/model/zone/type/SiegeZone;
  #176 = NameAndType        #177:#178     // getSiegeZone:()Lext/mods/gameserver/model/zone/type/SiegeZone;
  #177 = Utf8               getSiegeZone
  #178 = Utf8               ()Lext/mods/gameserver/model/zone/type/SiegeZone;
  #179 = Methodref          #180.#181     // ext/mods/gameserver/model/zone/type/SiegeZone.setActive:(Z)V
  #180 = Class              #182          // ext/mods/gameserver/model/zone/type/SiegeZone
  #181 = NameAndType        #183:#184     // setActive:(Z)V
  #182 = Utf8               ext/mods/gameserver/model/zone/type/SiegeZone
  #183 = Utf8               setActive
  #184 = Utf8               (Z)V
  #185 = InterfaceMethodref #111.#186     // java/util/List.iterator:()Ljava/util/Iterator;
  #186 = NameAndType        #187:#188     // iterator:()Ljava/util/Iterator;
  #187 = Utf8               iterator
  #188 = Utf8               ()Ljava/util/Iterator;
  #189 = InterfaceMethodref #190.#191     // java/util/Iterator.hasNext:()Z
  #190 = Class              #192          // java/util/Iterator
  #191 = NameAndType        #193:#126     // hasNext:()Z
  #192 = Utf8               java/util/Iterator
  #193 = Utf8               hasNext
  #194 = InterfaceMethodref #190.#195     // java/util/Iterator.next:()Ljava/lang/Object;
  #195 = NameAndType        #196:#197     // next:()Ljava/lang/Object;
  #196 = Utf8               next
  #197 = Utf8               ()Ljava/lang/Object;
  #198 = Methodref          #99.#199      // ext/mods/gameserver/model/pledge/Clan.getOnlineMembers:()[Lext/mods/gameserver/model/actor/Player;
  #199 = NameAndType        #200:#201     // getOnlineMembers:()[Lext/mods/gameserver/model/actor/Player;
  #200 = Utf8               getOnlineMembers
  #201 = Utf8               ()[Lext/mods/gameserver/model/actor/Player;
  #202 = Methodref          #203.#204     // ext/mods/gameserver/model/actor/Player.setSiegeState:(I)V
  #203 = Class              #205          // ext/mods/gameserver/model/actor/Player
  #204 = NameAndType        #206:#174     // setSiegeState:(I)V
  #205 = Utf8               ext/mods/gameserver/model/actor/Player
  #206 = Utf8               setSiegeState
  #207 = Methodref          #203.#208     // ext/mods/gameserver/model/actor/Player.broadcastUserInfo:()V
  #208 = NameAndType        #209:#11      // broadcastUserInfo:()V
  #209 = Utf8               broadcastUserInfo
  #210 = Fieldref           #131.#211     // ext/mods/gameserver/enums/SiegeStatus.IN_PROGRESS:Lext/mods/gameserver/enums/SiegeStatus;
  #211 = NameAndType        #212:#135     // IN_PROGRESS:Lext/mods/gameserver/enums/SiegeStatus;
  #212 = Utf8               IN_PROGRESS
  #213 = Methodref          #13.#214      // ext/mods/gameserver/model/residence/clanhall/ClanHallSiege.spawnNpcs:()V
  #214 = NameAndType        #215:#11      // spawnNpcs:()V
  #215 = Utf8               spawnNpcs
  #216 = InvokeDynamic      #1:#46        // #1:run:(Lext/mods/gameserver/model/residence/clanhall/ClanHallSiege;)Ljava/lang/Runnable;
  #217 = Methodref          #33.#218      // ext/mods/gameserver/model/residence/clanhall/SiegableHall.getSiegeLength:()J
  #218 = NameAndType        #219:#52      // getSiegeLength:()J
  #219 = Utf8               getSiegeLength
  #220 = Methodref          #13.#221      // ext/mods/gameserver/model/residence/clanhall/ClanHallSiege.getWinner:()Lext/mods/gameserver/model/pledge/Clan;
  #221 = NameAndType        #222:#223     // getWinner:()Lext/mods/gameserver/model/pledge/Clan;
  #222 = Utf8               getWinner
  #223 = Utf8               ()Lext/mods/gameserver/model/pledge/Clan;
  #224 = Methodref          #33.#225      // ext/mods/gameserver/model/residence/clanhall/SiegableHall.getOwnerId:()I
  #225 = NameAndType        #226:#41      // getOwnerId:()I
  #226 = Utf8               getOwnerId
  #227 = Methodref          #228.#229     // ext/mods/gameserver/data/sql/ClanTable.getInstance:()Lext/mods/gameserver/data/sql/ClanTable;
  #228 = Class              #230          // ext/mods/gameserver/data/sql/ClanTable
  #229 = NameAndType        #22:#231      // getInstance:()Lext/mods/gameserver/data/sql/ClanTable;
  #230 = Utf8               ext/mods/gameserver/data/sql/ClanTable
  #231 = Utf8               ()Lext/mods/gameserver/data/sql/ClanTable;
  #232 = Methodref          #228.#233     // ext/mods/gameserver/data/sql/ClanTable.getClan:(I)Lext/mods/gameserver/model/pledge/Clan;
  #233 = NameAndType        #234:#235     // getClan:(I)Lext/mods/gameserver/model/pledge/Clan;
  #234 = Utf8               getClan
  #235 = Utf8               (I)Lext/mods/gameserver/model/pledge/Clan;
  #236 = Fieldref           #13.#237      // ext/mods/gameserver/model/residence/clanhall/ClanHallSiege._missionAccomplished:Z
  #237 = NameAndType        #238:#239     // _missionAccomplished:Z
  #238 = Utf8               _missionAccomplished
  #239 = Utf8               Z
  #240 = Methodref          #99.#241      // ext/mods/gameserver/model/pledge/Clan.addReputationScore:(I)Z
  #241 = NameAndType        #242:#243     // addReputationScore:(I)Z
  #242 = Utf8               addReputationScore
  #243 = Utf8               (I)Z
  #244 = Methodref          #76.#245      // java/lang/Object.equals:(Ljava/lang/Object;)Z
  #245 = NameAndType        #246:#115     // equals:(Ljava/lang/Object;)Z
  #246 = Utf8               equals
  #247 = Methodref          #33.#248      // ext/mods/gameserver/model/residence/clanhall/SiegableHall.setOwner:(Lext/mods/gameserver/model/pledge/Clan;)V
  #248 = NameAndType        #249:#250     // setOwner:(Lext/mods/gameserver/model/pledge/Clan;)V
  #249 = Utf8               setOwner
  #250 = Utf8               (Lext/mods/gameserver/model/pledge/Clan;)V
  #251 = Methodref          #99.#252      // ext/mods/gameserver/model/pledge/Clan.setClanHallId:(I)V
  #252 = NameAndType        #253:#174     // setClanHallId:(I)V
  #253 = Utf8               setClanHallId
  #254 = Fieldref           #141.#255     // ext/mods/gameserver/network/SystemMessageId.S1_CLAN_DEFEATED_S2:Lext/mods/gameserver/network/SystemMessageId;
  #255 = NameAndType        #256:#145     // S1_CLAN_DEFEATED_S2:Lext/mods/gameserver/network/SystemMessageId;
  #256 = Utf8               S1_CLAN_DEFEATED_S2
  #257 = Methodref          #99.#79       // ext/mods/gameserver/model/pledge/Clan.getName:()Ljava/lang/String;
  #258 = Methodref          #147.#259     // ext/mods/gameserver/network/serverpackets/SystemMessage.addString:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #259 = NameAndType        #260:#261     // addString:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #260 = Utf8               addString
  #261 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #262 = Methodref          #99.#263      // ext/mods/gameserver/model/pledge/Clan.getLevel:()I
  #263 = NameAndType        #264:#41      // getLevel:()I
  #264 = Utf8               getLevel
  #265 = Methodref          #99.#266      // ext/mods/gameserver/model/pledge/Clan.takeReputationScore:(I)Z
  #266 = NameAndType        #267:#243     // takeReputationScore:(I)Z
  #267 = Utf8               takeReputationScore
  #268 = Fieldref           #141.#269     // ext/mods/gameserver/network/SystemMessageId.SIEGE_S1_DRAW:Lext/mods/gameserver/network/SystemMessageId;
  #269 = NameAndType        #270:#145     // SIEGE_S1_DRAW:Lext/mods/gameserver/network/SystemMessageId;
  #270 = Utf8               SIEGE_S1_DRAW
  #271 = Fieldref           #141.#272     // ext/mods/gameserver/network/SystemMessageId.SIEGE_OF_S1_FINISHED:Lext/mods/gameserver/network/SystemMessageId;
  #272 = NameAndType        #273:#145     // SIEGE_OF_S1_FINISHED:Lext/mods/gameserver/network/SystemMessageId;
  #273 = Utf8               SIEGE_OF_S1_FINISHED
  #274 = Methodref          #33.#275      // ext/mods/gameserver/model/residence/clanhall/SiegableHall.spawnDoor:(Z)V
  #275 = NameAndType        #164:#184     // spawnDoor:(Z)V
  #276 = Methodref          #33.#277      // ext/mods/gameserver/model/residence/clanhall/SiegableHall.banishForeigners:()V
  #277 = NameAndType        #173:#11      // banishForeigners:()V
  #278 = Methodref          #99.#279      // ext/mods/gameserver/model/pledge/Clan.setFlag:(Lext/mods/gameserver/model/actor/Npc;)V
  #279 = NameAndType        #280:#281     // setFlag:(Lext/mods/gameserver/model/actor/Npc;)V
  #280 = Utf8               setFlag
  #281 = Utf8               (Lext/mods/gameserver/model/actor/Npc;)V
  #282 = Methodref          #180.#283     // ext/mods/gameserver/model/zone/type/SiegeZone.getKnownTypeInside:(Ljava/lang/Class;)Ljava/util/List;
  #283 = NameAndType        #284:#285     // getKnownTypeInside:(Ljava/lang/Class;)Ljava/util/List;
  #284 = Utf8               getKnownTypeInside
  #285 = Utf8               (Ljava/lang/Class;)Ljava/util/List;
  #286 = Methodref          #203.#287     // ext/mods/gameserver/model/actor/Player.updatePvPStatus:()V
  #287 = NameAndType        #288:#11      // updatePvPStatus:()V
  #288 = Utf8               updatePvPStatus
  #289 = InterfaceMethodref #111.#290     // java/util/List.clear:()V
  #290 = NameAndType        #291:#11      // clear:()V
  #291 = Utf8               clear
  #292 = String             #293          // Siege of {} scheduled for {}.
  #293 = Utf8               Siege of {} scheduled for {}.
  #294 = Methodref          #13.#295      // ext/mods/gameserver/model/residence/clanhall/ClanHallSiege.unspawnNpcs:()V
  #295 = NameAndType        #296:#11      // unspawnNpcs:()V
  #296 = Utf8               unspawnNpcs
  #297 = Fieldref           #13.#298      // ext/mods/gameserver/model/residence/clanhall/ClanHallSiege._wasPreviouslyOwned:Z
  #298 = NameAndType        #299:#239     // _wasPreviouslyOwned:Z
  #299 = Utf8               _wasPreviouslyOwned
  #300 = Class              #301          // java/util/ArrayList
  #301 = Utf8               java/util/ArrayList
  #302 = Methodref          #300.#10      // java/util/ArrayList."<init>":()V
  #303 = Methodref          #203.#304     // ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
  #304 = NameAndType        #234:#223     // getClan:()Lext/mods/gameserver/model/pledge/Clan;
  #305 = InterfaceMethodref #111.#306     // java/util/List.add:(Ljava/lang/Object;)Z
  #306 = NameAndType        #307:#115     // add:(Ljava/lang/Object;)Z
  #307 = Utf8               add
  #308 = Methodref          #13.#309      // ext/mods/gameserver/model/residence/clanhall/ClanHallSiege.prepareSiege:(J)V
  #309 = NameAndType        #310:#311     // prepareSiege:(J)V
  #310 = Utf8               prepareSiege
  #311 = Utf8               (J)V
  #312 = Methodref          #33.#313      // ext/mods/gameserver/model/residence/clanhall/SiegableHall.free:()V
  #313 = NameAndType        #314:#11      // free:()V
  #314 = Utf8               free
  #315 = Fieldref           #131.#316     // ext/mods/gameserver/enums/SiegeStatus.REGISTRATION_OVER:Lext/mods/gameserver/enums/SiegeStatus;
  #316 = NameAndType        #317:#135     // REGISTRATION_OVER:Lext/mods/gameserver/enums/SiegeStatus;
  #317 = Utf8               REGISTRATION_OVER
  #318 = InvokeDynamic      #2:#46        // #2:run:(Lext/mods/gameserver/model/residence/clanhall/ClanHallSiege;)Ljava/lang/Runnable;
  #319 = Fieldref           #141.#320     // ext/mods/gameserver/network/SystemMessageId.REGISTRATION_TERM_FOR_S1_ENDED:Lext/mods/gameserver/network/SystemMessageId;
  #320 = NameAndType        #321:#145     // REGISTRATION_TERM_FOR_S1_ENDED:Lext/mods/gameserver/network/SystemMessageId;
  #321 = Utf8               REGISTRATION_TERM_FOR_S1_ENDED
  #322 = InterfaceMethodref #323.#324     // java/util/concurrent/ScheduledFuture.cancel:(Z)Z
  #323 = Class              #325          // java/util/concurrent/ScheduledFuture
  #324 = NameAndType        #326:#327     // cancel:(Z)Z
  #325 = Utf8               java/util/concurrent/ScheduledFuture
  #326 = Utf8               cancel
  #327 = Utf8               (Z)Z
  #328 = Methodref          #329.#330     // ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
  #329 = Class              #331          // ext/mods/commons/pool/ConnectionPool
  #330 = NameAndType        #332:#333     // getConnection:()Ljava/sql/Connection;
  #331 = Utf8               ext/mods/commons/pool/ConnectionPool
  #332 = Utf8               getConnection
  #333 = Utf8               ()Ljava/sql/Connection;
  #334 = String             #335          // SELECT attacker_id FROM clanhall_siege_attackers WHERE clanhall_id = ?
  #335 = Utf8               SELECT attacker_id FROM clanhall_siege_attackers WHERE clanhall_id = ?
  #336 = InterfaceMethodref #337.#338     // java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
  #337 = Class              #339          // java/sql/Connection
  #338 = NameAndType        #340:#341     // prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
  #339 = Utf8               java/sql/Connection
  #340 = Utf8               prepareStatement
  #341 = Utf8               (Ljava/lang/String;)Ljava/sql/PreparedStatement;
  #342 = InterfaceMethodref #343.#344     // java/sql/PreparedStatement.setInt:(II)V
  #343 = Class              #345          // java/sql/PreparedStatement
  #344 = NameAndType        #346:#347     // setInt:(II)V
  #345 = Utf8               java/sql/PreparedStatement
  #346 = Utf8               setInt
  #347 = Utf8               (II)V
  #348 = InterfaceMethodref #343.#349     // java/sql/PreparedStatement.executeQuery:()Ljava/sql/ResultSet;
  #349 = NameAndType        #350:#351     // executeQuery:()Ljava/sql/ResultSet;
  #350 = Utf8               executeQuery
  #351 = Utf8               ()Ljava/sql/ResultSet;
  #352 = InterfaceMethodref #353.#354     // java/sql/ResultSet.next:()Z
  #353 = Class              #355          // java/sql/ResultSet
  #354 = NameAndType        #196:#126     // next:()Z
  #355 = Utf8               java/sql/ResultSet
  #356 = String             #357          // attacker_id
  #357 = Utf8               attacker_id
  #358 = InterfaceMethodref #353.#359     // java/sql/ResultSet.getInt:(Ljava/lang/String;)I
  #359 = NameAndType        #360:#361     // getInt:(Ljava/lang/String;)I
  #360 = Utf8               getInt
  #361 = Utf8               (Ljava/lang/String;)I
  #362 = InterfaceMethodref #353.#363     // java/sql/ResultSet.close:()V
  #363 = NameAndType        #364:#11      // close:()V
  #364 = Utf8               close
  #365 = Class              #366          // java/lang/Throwable
  #366 = Utf8               java/lang/Throwable
  #367 = Methodref          #365.#368     // java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
  #368 = NameAndType        #369:#370     // addSuppressed:(Ljava/lang/Throwable;)V
  #369 = Utf8               addSuppressed
  #370 = Utf8               (Ljava/lang/Throwable;)V
  #371 = InterfaceMethodref #343.#363     // java/sql/PreparedStatement.close:()V
  #372 = InterfaceMethodref #337.#363     // java/sql/Connection.close:()V
  #373 = Class              #374          // java/lang/Exception
  #374 = Utf8               java/lang/Exception
  #375 = String             #376          // Couldn\'t load {} siege attackers.
  #376 = Utf8               Couldn\'t load {} siege attackers.
  #377 = Methodref          #13.#79       // ext/mods/gameserver/model/residence/clanhall/ClanHallSiege.getName:()Ljava/lang/String;
  #378 = Methodref          #93.#379      // ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
  #379 = NameAndType        #380:#381     // warn:(Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
  #380 = Utf8               warn
  #381 = Utf8               (Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
  #382 = String             #383          // DELETE FROM clanhall_siege_attackers WHERE clanhall_id = ?
  #383 = Utf8               DELETE FROM clanhall_siege_attackers WHERE clanhall_id = ?
  #384 = InterfaceMethodref #343.#385     // java/sql/PreparedStatement.execute:()Z
  #385 = NameAndType        #386:#126     // execute:()Z
  #386 = Utf8               execute
  #387 = String             #388          // INSERT INTO clanhall_siege_attackers VALUES (?,?)
  #388 = Utf8               INSERT INTO clanhall_siege_attackers VALUES (?,?)
  #389 = Methodref          #99.#390      // ext/mods/gameserver/model/pledge/Clan.getClanId:()I
  #390 = NameAndType        #391:#41      // getClanId:()I
  #391 = Utf8               getClanId
  #392 = InterfaceMethodref #343.#393     // java/sql/PreparedStatement.addBatch:()V
  #393 = NameAndType        #394:#11      // addBatch:()V
  #394 = Utf8               addBatch
  #395 = InterfaceMethodref #343.#396     // java/sql/PreparedStatement.executeBatch:()[I
  #396 = NameAndType        #397:#398     // executeBatch:()[I
  #397 = Utf8               executeBatch
  #398 = Utf8               ()[I
  #399 = String             #400          // Couldn\'t save {} siege attackers.
  #400 = Utf8               Couldn\'t save {} siege attackers.
  #401 = InterfaceMethodref #343.#402     // java/sql/PreparedStatement.executeUpdate:()I
  #402 = NameAndType        #403:#41      // executeUpdate:()I
  #403 = Utf8               executeUpdate
  #404 = String             #405          // {}: Couldnt save attacker list!
  #405 = Utf8               {}: Couldnt save attacker list!
  #406 = Methodref          #93.#407      // ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;[Ljava/lang/Object;)V
  #407 = NameAndType        #380:#97      // warn:(Ljava/lang/Object;[Ljava/lang/Object;)V
  #408 = Methodref          #409.#79      // java/lang/Class.getName:()Ljava/lang/String;
  #409 = Class              #410          // java/lang/Class
  #410 = Utf8               java/lang/Class
  #411 = Methodref          #93.#412      // ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
  #412 = NameAndType        #5:#413       // "<init>":(Ljava/lang/String;)V
  #413 = Utf8               (Ljava/lang/String;)V
  #414 = Class              #415          // ext/mods/gameserver/model/residence/Siegable
  #415 = Utf8               ext/mods/gameserver/model/residence/Siegable
  #416 = Utf8               SELECT_ATTACKERS
  #417 = Utf8               Ljava/lang/String;
  #418 = Utf8               ConstantValue
  #419 = Utf8               INSERT_ATTACKERS
  #420 = Utf8               DELETE_ATTACKERS
  #421 = Utf8               FORTRESS_OF_RESISTANCE
  #422 = Utf8               I
  #423 = Integer            21
  #424 = Utf8               DEVASTATED_CASTLE
  #425 = Integer            34
  #426 = Utf8               BANDIT_STRONGHOLD
  #427 = Integer            35
  #428 = Utf8               RAINBOW_SPRINGS
  #429 = Integer            62
  #430 = Utf8               BEAST_FARM
  #431 = Integer            63
  #432 = Utf8               FORTRESS_OF_DEAD
  #433 = Integer            64
  #434 = Utf8               Signature
  #435 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/pledge/Clan;>;
  #436 = Utf8               Ljava/util/concurrent/ScheduledFuture<*>;
  #437 = Utf8               (Ljava/lang/String;I)V
  #438 = Utf8               Code
  #439 = Utf8               LineNumberTable
  #440 = Utf8               LocalVariableTable
  #441 = Utf8               this
  #442 = Utf8               Lext/mods/gameserver/model/residence/clanhall/ClanHallSiege;
  #443 = Utf8               descr
  #444 = Utf8               hallId
  #445 = Utf8               StackMapTable
  #446 = Class              #447          // java/lang/String
  #447 = Utf8               java/lang/String
  #448 = Utf8               (Lext/mods/gameserver/model/pledge/Clan;)Lext/mods/gameserver/model/actor/Npc;
  #449 = Utf8               clan
  #450 = Utf8               Lext/mods/gameserver/model/pledge/Clan;
  #451 = Class              #452          // ext/mods/gameserver/model/actor/Npc
  #452 = Utf8               ext/mods/gameserver/model/actor/Npc
  #453 = Utf8               getAttackerClans
  #454 = Utf8               ()Ljava/util/List<Lext/mods/gameserver/model/pledge/Clan;>;
  #455 = Utf8               checkSide
  #456 = Utf8               (Lext/mods/gameserver/model/pledge/Clan;Lext/mods/gameserver/enums/SiegeSide;)Z
  #457 = Utf8               type
  #458 = Utf8               checkSides
  #459 = Utf8               (Lext/mods/gameserver/model/pledge/Clan;[Lext/mods/gameserver/enums/SiegeSide;)Z
  #460 = Utf8               types
  #461 = Utf8               [Lext/mods/gameserver/enums/SiegeSide;
  #462 = Class              #461          // "[Lext/mods/gameserver/enums/SiegeSide;"
  #463 = Utf8               (Lext/mods/gameserver/model/pledge/Clan;)Z
  #464 = Utf8               getDefenderClans
  #465 = Utf8               startSiege
  #466 = Utf8               player
  #467 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #468 = Utf8               state
  #469 = Utf8               B
  #470 = Class              #471          // "[Lext/mods/gameserver/model/actor/Player;"
  #471 = Utf8               [Lext/mods/gameserver/model/actor/Player;
  #472 = Utf8               endSiege
  #473 = Utf8               winner
  #474 = Utf8               oldOwner
  #475 = Utf8               wasPreviouslyOwned
  #476 = Utf8               canPlantFlag
  #477 = Utf8               doorIsAutoAttackable
  #478 = Utf8               getAttackersInZone
  #479 = Utf8               attackers
  #480 = Utf8               LocalVariableTypeTable
  #481 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/actor/Player;>;
  #482 = Utf8               ()Ljava/util/List<Lext/mods/gameserver/model/actor/Player;>;
  #483 = Utf8               instantSiege
  #484 = Utf8               delay
  #485 = Utf8               J
  #486 = Utf8               cancelSiegeTask
  #487 = Utf8               rset
  #488 = Utf8               Ljava/sql/ResultSet;
  #489 = Utf8               ps
  #490 = Utf8               Ljava/sql/PreparedStatement;
  #491 = Utf8               con
  #492 = Utf8               Ljava/sql/Connection;
  #493 = Utf8               e
  #494 = Utf8               Ljava/lang/Exception;
  #495 = Utf8               saveAttackers
  #496 = Utf8               insert
  #497 = Utf8               updateAttackers
  #498 = Utf8               <clinit>
  #499 = Utf8               SourceFile
  #500 = Utf8               ClanHallSiege.java
  #501 = Utf8               BootstrapMethods
  #502 = MethodType         #11           //  ()V
  #503 = MethodHandle       5:#504        // REF_invokeVirtual ext/mods/gameserver/model/residence/clanhall/ClanHallSiege.prepareSiege:()V
  #504 = Methodref          #13.#505      // ext/mods/gameserver/model/residence/clanhall/ClanHallSiege.prepareSiege:()V
  #505 = NameAndType        #310:#11      // prepareSiege:()V
  #506 = MethodHandle       5:#507        // REF_invokeVirtual ext/mods/gameserver/model/residence/clanhall/ClanHallSiege.endSiege:()V
  #507 = Methodref          #13.#508      // ext/mods/gameserver/model/residence/clanhall/ClanHallSiege.endSiege:()V
  #508 = NameAndType        #472:#11      // endSiege:()V
  #509 = MethodHandle       5:#510        // REF_invokeVirtual ext/mods/gameserver/model/residence/clanhall/ClanHallSiege.startSiege:()V
  #510 = Methodref          #13.#511      // ext/mods/gameserver/model/residence/clanhall/ClanHallSiege.startSiege:()V
  #511 = NameAndType        #465:#11      // startSiege:()V
  #512 = MethodHandle       6:#513        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #513 = Methodref          #514.#515     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #514 = Class              #516          // java/lang/invoke/LambdaMetafactory
  #515 = NameAndType        #517:#518     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #516 = Utf8               java/lang/invoke/LambdaMetafactory
  #517 = Utf8               metafactory
  #518 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #519 = Utf8               InnerClasses
  #520 = Class              #521          // java/lang/invoke/MethodHandles$Lookup
  #521 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #522 = Class              #523          // java/lang/invoke/MethodHandles
  #523 = Utf8               java/lang/invoke/MethodHandles
  #524 = Utf8               Lookup
{
  protected static final ext.mods.commons.logging.CLogger LOGGER;
    descriptor: Lext/mods/commons/logging/CLogger;
    flags: (0x001c) ACC_PROTECTED, ACC_STATIC, ACC_FINAL

  public static final int FORTRESS_OF_RESISTANCE;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 21

  public static final int DEVASTATED_CASTLE;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 34

  public static final int BANDIT_STRONGHOLD;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 35

  public static final int RAINBOW_SPRINGS;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 62

  public static final int BEAST_FARM;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 63

  public static final int FORTRESS_OF_DEAD;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 64

  protected final java.util.List<ext.mods.gameserver.model.pledge.Clan> _attackers;
    descriptor: Ljava/util/List;
    flags: (0x0014) ACC_PROTECTED, ACC_FINAL
    Signature: #435                         // Ljava/util/List<Lext/mods/gameserver/model/pledge/Clan;>;

  public ext.mods.gameserver.model.residence.clanhall.SiegableHall _hall;
    descriptor: Lext/mods/gameserver/model/residence/clanhall/SiegableHall;
    flags: (0x0001) ACC_PUBLIC

  public java.util.concurrent.ScheduledFuture<?> _siegeTask;
    descriptor: Ljava/util/concurrent/ScheduledFuture;
    flags: (0x0001) ACC_PUBLIC
    Signature: #436                         // Ljava/util/concurrent/ScheduledFuture<*>;

  protected boolean _missionAccomplished;
    descriptor: Z
    flags: (0x0004) ACC_PROTECTED

  protected boolean _wasPreviouslyOwned;
    descriptor: Z
    flags: (0x0004) ACC_PROTECTED

  protected ext.mods.gameserver.model.residence.clanhall.ClanHallSiege(java.lang.String, int);
    descriptor: (Ljava/lang/String;I)V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=6, locals=3, args_size=3
         0: aload_0
         1: iconst_m1
         2: aload_1
         3: invokespecial #1                  // Method ext/mods/gameserver/scripting/Quest."<init>":(ILjava/lang/String;)V
         6: aload_0
         7: new           #7                  // class java/util/concurrent/CopyOnWriteArrayList
        10: dup
        11: invokespecial #9                  // Method java/util/concurrent/CopyOnWriteArrayList."<init>":()V
        14: putfield      #12                 // Field _attackers:Ljava/util/List;
        17: aload_0
        18: invokestatic  #18                 // Method ext/mods/gameserver/data/manager/ClanHallManager.getInstance:()Lext/mods/gameserver/data/manager/ClanHallManager;
        21: iload_2
        22: invokevirtual #24                 // Method ext/mods/gameserver/data/manager/ClanHallManager.getSiegableHall:(I)Lext/mods/gameserver/model/residence/clanhall/SiegableHall;
        25: putfield      #28                 // Field _hall:Lext/mods/gameserver/model/residence/clanhall/SiegableHall;
        28: aload_0
        29: getfield      #28                 // Field _hall:Lext/mods/gameserver/model/residence/clanhall/SiegableHall;
        32: aload_0
        33: invokevirtual #32                 // Method ext/mods/gameserver/model/residence/clanhall/SiegableHall.setSiege:(Lext/mods/gameserver/model/residence/clanhall/ClanHallSiege;)V
        36: aload_0
        37: getfield      #28                 // Field _hall:Lext/mods/gameserver/model/residence/clanhall/SiegableHall;
        40: invokevirtual #38                 // Method ext/mods/gameserver/model/residence/clanhall/SiegableHall.getId:()I
        43: bipush        62
        45: if_icmpeq     52
        48: aload_0
        49: invokevirtual #42                 // Method loadAttackers:()V
        52: aload_0
        53: aload_0
        54: invokedynamic #45,  0             // InvokeDynamic #0:run:(Lext/mods/gameserver/model/residence/clanhall/ClanHallSiege;)Ljava/lang/Runnable;
        59: aload_0
        60: getfield      #28                 // Field _hall:Lext/mods/gameserver/model/residence/clanhall/SiegableHall;
        63: invokevirtual #49                 // Method ext/mods/gameserver/model/residence/clanhall/SiegableHall.getNextSiegeTime:()J
        66: invokestatic  #53                 // Method java/lang/System.currentTimeMillis:()J
        69: lsub
        70: ldc2_w        #58                 // long 3600000l
        73: lsub
        74: invokestatic  #60                 // Method ext/mods/commons/pool/ThreadPool.schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
        77: putfield      #66                 // Field _siegeTask:Ljava/util/concurrent/ScheduledFuture;
        80: getstatic     #70                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
        83: ldc           #74                 // String {} siege scheduled for {}.
        85: iconst_2
        86: anewarray     #76                 // class java/lang/Object
        89: dup
        90: iconst_0
        91: aload_0
        92: getfield      #28                 // Field _hall:Lext/mods/gameserver/model/residence/clanhall/SiegableHall;
        95: invokevirtual #78                 // Method ext/mods/gameserver/model/residence/clanhall/SiegableHall.getName:()Ljava/lang/String;
        98: aastore
        99: dup
       100: iconst_1
       101: aload_0
       102: invokevirtual #82                 // Method getSiegeDate:()Ljava/util/Calendar;
       105: invokevirtual #86                 // Method java/util/Calendar.getTime:()Ljava/util/Date;
       108: aastore
       109: invokevirtual #92                 // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
       112: return
      LineNumberTable:
        line 72: 0
        line 62: 6
        line 74: 17
        line 75: 28
        line 77: 36
        line 78: 48
        line 80: 52
        line 82: 80
        line 83: 112
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     113     0  this   Lext/mods/gameserver/model/residence/clanhall/ClanHallSiege;
            0     113     1 descr   Ljava/lang/String;
            0     113     2 hallId   I
      StackMapTable: number_of_entries = 1
        frame_type = 255 /* full_frame */
          offset_delta = 52
          locals = [ class ext/mods/gameserver/model/residence/clanhall/ClanHallSiege, class java/lang/String, int ]
          stack = []

  public abstract ext.mods.gameserver.model.pledge.Clan getWinner();
    descriptor: ()Lext/mods/gameserver/model/pledge/Clan;
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT

  public abstract void spawnNpcs();
    descriptor: ()V
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT

  public abstract void unspawnNpcs();
    descriptor: ()V
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT

  public ext.mods.gameserver.model.actor.Npc getFlag(ext.mods.gameserver.model.pledge.Clan);
    descriptor: (Lext/mods/gameserver/model/pledge/Clan;)Lext/mods/gameserver/model/actor/Npc;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=2, args_size=2
         0: aload_1
         1: ifnull        11
         4: aload_1
         5: invokevirtual #98                 // Method ext/mods/gameserver/model/pledge/Clan.getFlag:()Lext/mods/gameserver/model/actor/Npc;
         8: goto          12
        11: aconst_null
        12: areturn
      LineNumberTable:
        line 94: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      13     0  this   Lext/mods/gameserver/model/residence/clanhall/ClanHallSiege;
            0      13     1  clan   Lext/mods/gameserver/model/pledge/Clan;
      StackMapTable: number_of_entries = 2
        frame_type = 11 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/model/actor/Npc ]

  public java.util.List<ext.mods.gameserver.model.pledge.Clan> getAttackerClans();
    descriptor: ()Ljava/util/List;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #12                 // Field _attackers:Ljava/util/List;
         4: areturn
      LineNumberTable:
        line 100: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/residence/clanhall/ClanHallSiege;
    Signature: #454                         // ()Ljava/util/List<Lext/mods/gameserver/model/pledge/Clan;>;

  public boolean checkSide(ext.mods.gameserver.model.pledge.Clan, ext.mods.gameserver.enums.SiegeSide);
    descriptor: (Lext/mods/gameserver/model/pledge/Clan;Lext/mods/gameserver/enums/SiegeSide;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=3, args_size=3
         0: aload_1
         1: ifnull        28
         4: aload_2
         5: getstatic     #104                // Field ext/mods/gameserver/enums/SiegeSide.ATTACKER:Lext/mods/gameserver/enums/SiegeSide;
         8: if_acmpne     28
        11: aload_0
        12: getfield      #12                 // Field _attackers:Ljava/util/List;
        15: aload_1
        16: invokeinterface #110,  2          // InterfaceMethod java/util/List.contains:(Ljava/lang/Object;)Z
        21: ifeq          28
        24: iconst_1
        25: goto          29
        28: iconst_0
        29: ireturn
      LineNumberTable:
        line 106: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      30     0  this   Lext/mods/gameserver/model/residence/clanhall/ClanHallSiege;
            0      30     1  clan   Lext/mods/gameserver/model/pledge/Clan;
            0      30     2  type   Lext/mods/gameserver/enums/SiegeSide;
      StackMapTable: number_of_entries = 2
        frame_type = 28 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public boolean checkSides(ext.mods.gameserver.model.pledge.Clan, ext.mods.gameserver.enums.SiegeSide...);
    descriptor: (Lext/mods/gameserver/model/pledge/Clan;[Lext/mods/gameserver/enums/SiegeSide;)Z
    flags: (0x0081) ACC_PUBLIC, ACC_VARARGS
    Code:
      stack=2, locals=7, args_size=3
         0: aload_1
         1: ifnonnull     6
         4: iconst_0
         5: ireturn
         6: aload_2
         7: astore_3
         8: aload_3
         9: arraylength
        10: istore        4
        12: iconst_0
        13: istore        5
        15: iload         5
        17: iload         4
        19: if_icmpge     53
        22: aload_3
        23: iload         5
        25: aaload
        26: astore        6
        28: aload         6
        30: getstatic     #104                // Field ext/mods/gameserver/enums/SiegeSide.ATTACKER:Lext/mods/gameserver/enums/SiegeSide;
        33: if_acmpne     47
        36: aload_0
        37: getfield      #12                 // Field _attackers:Ljava/util/List;
        40: aload_1
        41: invokeinterface #110,  2          // InterfaceMethod java/util/List.contains:(Ljava/lang/Object;)Z
        46: ireturn
        47: iinc          5, 1
        50: goto          15
        53: iconst_0
        54: ireturn
      LineNumberTable:
        line 112: 0
        line 113: 4
        line 115: 6
        line 117: 28
        line 118: 36
        line 115: 47
        line 120: 53
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           28      19     6  type   Lext/mods/gameserver/enums/SiegeSide;
            0      55     0  this   Lext/mods/gameserver/model/residence/clanhall/ClanHallSiege;
            0      55     1  clan   Lext/mods/gameserver/model/pledge/Clan;
            0      55     2 types   [Lext/mods/gameserver/enums/SiegeSide;
      StackMapTable: number_of_entries = 4
        frame_type = 6 /* same */
        frame_type = 254 /* append */
          offset_delta = 8
          locals = [ class "[Lext/mods/gameserver/enums/SiegeSide;", int, int ]
        frame_type = 31 /* same */
        frame_type = 248 /* chop */
          offset_delta = 5

  public boolean checkSides(ext.mods.gameserver.model.pledge.Clan);
    descriptor: (Lext/mods/gameserver/model/pledge/Clan;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_1
         1: ifnull        21
         4: aload_0
         5: getfield      #12                 // Field _attackers:Ljava/util/List;
         8: aload_1
         9: invokeinterface #110,  2          // InterfaceMethod java/util/List.contains:(Ljava/lang/Object;)Z
        14: ifeq          21
        17: iconst_1
        18: goto          22
        21: iconst_0
        22: ireturn
      LineNumberTable:
        line 126: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      23     0  this   Lext/mods/gameserver/model/residence/clanhall/ClanHallSiege;
            0      23     1  clan   Lext/mods/gameserver/model/pledge/Clan;
      StackMapTable: number_of_entries = 2
        frame_type = 21 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public java.util.List<ext.mods.gameserver.model.pledge.Clan> getDefenderClans();
    descriptor: ()Ljava/util/List;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: invokestatic  #116                // Method java/util/Collections.emptyList:()Ljava/util/List;
         3: areturn
      LineNumberTable:
        line 132: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/model/residence/clanhall/ClanHallSiege;
    Signature: #454                         // ()Ljava/util/List<Lext/mods/gameserver/model/pledge/Clan;>;

  public java.util.Calendar getSiegeDate();
    descriptor: ()Ljava/util/Calendar;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #28                 // Field _hall:Lext/mods/gameserver/model/residence/clanhall/SiegableHall;
         4: invokevirtual #122                // Method ext/mods/gameserver/model/residence/clanhall/SiegableHall.getSiegeDate:()Ljava/util/Calendar;
         7: areturn
      LineNumberTable:
        line 138: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/residence/clanhall/ClanHallSiege;

  public void startSiege();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=8, args_size=1
         0: aload_0
         1: getfield      #12                 // Field _attackers:Ljava/util/List;
         4: invokeinterface #123,  1          // InterfaceMethod java/util/List.isEmpty:()Z
         9: ifeq          89
        12: aload_0
        13: getfield      #28                 // Field _hall:Lext/mods/gameserver/model/residence/clanhall/SiegableHall;
        16: invokevirtual #38                 // Method ext/mods/gameserver/model/residence/clanhall/SiegableHall.getId:()I
        19: bipush        21
        21: if_icmpeq     89
        24: aload_0
        25: getfield      #28                 // Field _hall:Lext/mods/gameserver/model/residence/clanhall/SiegableHall;
        28: invokevirtual #127                // Method ext/mods/gameserver/model/residence/clanhall/SiegableHall.updateNextSiege:()V
        31: aload_0
        32: aload_0
        33: invokedynamic #45,  0             // InvokeDynamic #0:run:(Lext/mods/gameserver/model/residence/clanhall/ClanHallSiege;)Ljava/lang/Runnable;
        38: aload_0
        39: getfield      #28                 // Field _hall:Lext/mods/gameserver/model/residence/clanhall/SiegableHall;
        42: invokevirtual #49                 // Method ext/mods/gameserver/model/residence/clanhall/SiegableHall.getNextSiegeTime:()J
        45: invokestatic  #53                 // Method java/lang/System.currentTimeMillis:()J
        48: lsub
        49: ldc2_w        #58                 // long 3600000l
        52: lsub
        53: invokestatic  #60                 // Method ext/mods/commons/pool/ThreadPool.schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
        56: putfield      #66                 // Field _siegeTask:Ljava/util/concurrent/ScheduledFuture;
        59: aload_0
        60: getfield      #28                 // Field _hall:Lext/mods/gameserver/model/residence/clanhall/SiegableHall;
        63: getstatic     #130                // Field ext/mods/gameserver/enums/SiegeStatus.REGISTRATION_OPENED:Lext/mods/gameserver/enums/SiegeStatus;
        66: invokevirtual #136                // Method ext/mods/gameserver/model/residence/clanhall/SiegableHall.updateSiegeStatus:(Lext/mods/gameserver/enums/SiegeStatus;)V
        69: getstatic     #140                // Field ext/mods/gameserver/network/SystemMessageId.SIEGE_OF_S1_HAS_BEEN_CANCELED_DUE_TO_LACK_OF_INTEREST:Lext/mods/gameserver/network/SystemMessageId;
        72: invokestatic  #146                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        75: aload_0
        76: getfield      #28                 // Field _hall:Lext/mods/gameserver/model/residence/clanhall/SiegableHall;
        79: invokevirtual #38                 // Method ext/mods/gameserver/model/residence/clanhall/SiegableHall.getId:()I
        82: invokevirtual #152                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addFortId:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        85: invokestatic  #156                // Method ext/mods/gameserver/model/World.toAllOnlinePlayers:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        88: return
        89: aload_0
        90: getfield      #28                 // Field _hall:Lext/mods/gameserver/model/residence/clanhall/SiegableHall;
        93: invokevirtual #162                // Method ext/mods/gameserver/model/residence/clanhall/SiegableHall.spawnDoor:()V
        96: aload_0
        97: getfield      #28                 // Field _hall:Lext/mods/gameserver/model/residence/clanhall/SiegableHall;
       100: invokevirtual #165                // Method ext/mods/gameserver/model/residence/clanhall/SiegableHall.getZone:()Lext/mods/gameserver/model/zone/type/ClanHallZone;
       103: iconst_m1
       104: invokevirtual #169                // Method ext/mods/gameserver/model/zone/type/ClanHallZone.banishForeigners:(I)V
       107: aload_0
       108: getfield      #28                 // Field _hall:Lext/mods/gameserver/model/residence/clanhall/SiegableHall;
       111: invokevirtual #175                // Method ext/mods/gameserver/model/residence/clanhall/SiegableHall.getSiegeZone:()Lext/mods/gameserver/model/zone/type/SiegeZone;
       114: iconst_1
       115: invokevirtual #179                // Method ext/mods/gameserver/model/zone/type/SiegeZone.setActive:(Z)V
       118: iconst_1
       119: istore_1
       120: aload_0
       121: getfield      #12                 // Field _attackers:Ljava/util/List;
       124: invokeinterface #185,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
       129: astore_2
       130: aload_2
       131: invokeinterface #189,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       136: ifeq          197
       139: aload_2
       140: invokeinterface #194,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       145: checkcast     #99                 // class ext/mods/gameserver/model/pledge/Clan
       148: astore_3
       149: aload_3
       150: invokevirtual #198                // Method ext/mods/gameserver/model/pledge/Clan.getOnlineMembers:()[Lext/mods/gameserver/model/actor/Player;
       153: astore        4
       155: aload         4
       157: arraylength
       158: istore        5
       160: iconst_0
       161: istore        6
       163: iload         6
       165: iload         5
       167: if_icmpge     194
       170: aload         4
       172: iload         6
       174: aaload
       175: astore        7
       177: aload         7
       179: iconst_1
       180: invokevirtual #202                // Method ext/mods/gameserver/model/actor/Player.setSiegeState:(I)V
       183: aload         7
       185: invokevirtual #207                // Method ext/mods/gameserver/model/actor/Player.broadcastUserInfo:()V
       188: iinc          6, 1
       191: goto          163
       194: goto          130
       197: aload_0
       198: getfield      #28                 // Field _hall:Lext/mods/gameserver/model/residence/clanhall/SiegableHall;
       201: getstatic     #210                // Field ext/mods/gameserver/enums/SiegeStatus.IN_PROGRESS:Lext/mods/gameserver/enums/SiegeStatus;
       204: invokevirtual #136                // Method ext/mods/gameserver/model/residence/clanhall/SiegableHall.updateSiegeStatus:(Lext/mods/gameserver/enums/SiegeStatus;)V
       207: aload_0
       208: invokevirtual #213                // Method spawnNpcs:()V
       211: aload_0
       212: aload_0
       213: invokedynamic #216,  0            // InvokeDynamic #1:run:(Lext/mods/gameserver/model/residence/clanhall/ClanHallSiege;)Ljava/lang/Runnable;
       218: aload_0
       219: getfield      #28                 // Field _hall:Lext/mods/gameserver/model/residence/clanhall/SiegableHall;
       222: invokevirtual #217                // Method ext/mods/gameserver/model/residence/clanhall/SiegableHall.getSiegeLength:()J
       225: invokestatic  #60                 // Method ext/mods/commons/pool/ThreadPool.schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
       228: putfield      #66                 // Field _siegeTask:Ljava/util/concurrent/ScheduledFuture;
       231: return
      LineNumberTable:
        line 144: 0
        line 146: 24
        line 148: 31
        line 150: 59
        line 152: 69
        line 153: 88
        line 156: 89
        line 158: 96
        line 159: 107
        line 161: 118
        line 162: 120
        line 164: 149
        line 166: 177
        line 167: 183
        line 164: 188
        line 169: 194
        line 171: 197
        line 173: 207
        line 175: 211
        line 176: 231
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          177      11     7 player   Lext/mods/gameserver/model/actor/Player;
          149      45     3  clan   Lext/mods/gameserver/model/pledge/Clan;
            0     232     0  this   Lext/mods/gameserver/model/residence/clanhall/ClanHallSiege;
          120     112     1 state   B
      StackMapTable: number_of_entries = 5
        frame_type = 251 /* same_frame_extended */
          offset_delta = 89
        frame_type = 253 /* append */
          offset_delta = 40
          locals = [ int, class java/util/Iterator ]
        frame_type = 255 /* full_frame */
          offset_delta = 32
          locals = [ class ext/mods/gameserver/model/residence/clanhall/ClanHallSiege, int, class java/util/Iterator, class ext/mods/gameserver/model/pledge/Clan, class "[Lext/mods/gameserver/model/actor/Player;", int, int ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 30
          locals = [ class ext/mods/gameserver/model/residence/clanhall/ClanHallSiege, int, class java/util/Iterator ]
          stack = []
        frame_type = 250 /* chop */
          offset_delta = 2

  public void endSiege();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=10, args_size=1
         0: aload_0
         1: invokevirtual #220                // Method getWinner:()Lext/mods/gameserver/model/pledge/Clan;
         4: astore_1
         5: aload_0
         6: getfield      #28                 // Field _hall:Lext/mods/gameserver/model/residence/clanhall/SiegableHall;
         9: invokevirtual #224                // Method ext/mods/gameserver/model/residence/clanhall/SiegableHall.getOwnerId:()I
        12: ifle          31
        15: invokestatic  #227                // Method ext/mods/gameserver/data/sql/ClanTable.getInstance:()Lext/mods/gameserver/data/sql/ClanTable;
        18: aload_0
        19: getfield      #28                 // Field _hall:Lext/mods/gameserver/model/residence/clanhall/SiegableHall;
        22: invokevirtual #224                // Method ext/mods/gameserver/model/residence/clanhall/SiegableHall.getOwnerId:()I
        25: invokevirtual #232                // Method ext/mods/gameserver/data/sql/ClanTable.getClan:(I)Lext/mods/gameserver/model/pledge/Clan;
        28: goto          32
        31: aconst_null
        32: astore_2
        33: aload_0
        34: getfield      #236                // Field _missionAccomplished:Z
        37: ifeq          123
        40: aload_1
        41: ifnull        123
        44: aload_2
        45: ifnonnull     59
        48: aload_1
        49: sipush        300
        52: invokevirtual #240                // Method ext/mods/gameserver/model/pledge/Clan.addReputationScore:(I)Z
        55: pop
        56: goto          75
        59: aload_2
        60: aload_1
        61: invokevirtual #244                // Method java/lang/Object.equals:(Ljava/lang/Object;)Z
        64: ifne          75
        67: aload_1
        68: sipush        500
        71: invokevirtual #240                // Method ext/mods/gameserver/model/pledge/Clan.addReputationScore:(I)Z
        74: pop
        75: aload_0
        76: getfield      #28                 // Field _hall:Lext/mods/gameserver/model/residence/clanhall/SiegableHall;
        79: aload_1
        80: invokevirtual #247                // Method ext/mods/gameserver/model/residence/clanhall/SiegableHall.setOwner:(Lext/mods/gameserver/model/pledge/Clan;)V
        83: aload_1
        84: aload_0
        85: getfield      #28                 // Field _hall:Lext/mods/gameserver/model/residence/clanhall/SiegableHall;
        88: invokevirtual #38                 // Method ext/mods/gameserver/model/residence/clanhall/SiegableHall.getId:()I
        91: invokevirtual #251                // Method ext/mods/gameserver/model/pledge/Clan.setClanHallId:(I)V
        94: getstatic     #254                // Field ext/mods/gameserver/network/SystemMessageId.S1_CLAN_DEFEATED_S2:Lext/mods/gameserver/network/SystemMessageId;
        97: invokestatic  #146                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       100: aload_1
       101: invokevirtual #257                // Method ext/mods/gameserver/model/pledge/Clan.getName:()Ljava/lang/String;
       104: invokevirtual #258                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addString:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       107: aload_0
       108: getfield      #28                 // Field _hall:Lext/mods/gameserver/model/residence/clanhall/SiegableHall;
       111: invokevirtual #38                 // Method ext/mods/gameserver/model/residence/clanhall/SiegableHall.getId:()I
       114: invokevirtual #152                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addFortId:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       117: invokestatic  #156                // Method ext/mods/gameserver/model/World.toAllOnlinePlayers:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       120: goto          210
       123: aload_2
       124: ifnull        150
       127: aload_1
       128: ifnull        150
       131: aload_2
       132: aload_1
       133: invokevirtual #244                // Method java/lang/Object.equals:(Ljava/lang/Object;)Z
       136: ifeq          150
       139: aload_2
       140: sipush        250
       143: invokevirtual #240                // Method ext/mods/gameserver/model/pledge/Clan.addReputationScore:(I)Z
       146: pop
       147: goto          210
       150: aload_2
       151: ifnull        191
       154: aload_0
       155: getfield      #236                // Field _missionAccomplished:Z
       158: ifne          191
       161: aload_2
       162: invokevirtual #262                // Method ext/mods/gameserver/model/pledge/Clan.getLevel:()I
       165: iconst_5
       166: if_icmpge     180
       169: aload_2
       170: sipush        300
       173: invokevirtual #265                // Method ext/mods/gameserver/model/pledge/Clan.takeReputationScore:(I)Z
       176: pop
       177: goto          210
       180: aload_2
       181: sipush        1000
       184: invokevirtual #265                // Method ext/mods/gameserver/model/pledge/Clan.takeReputationScore:(I)Z
       187: pop
       188: goto          210
       191: getstatic     #268                // Field ext/mods/gameserver/network/SystemMessageId.SIEGE_S1_DRAW:Lext/mods/gameserver/network/SystemMessageId;
       194: invokestatic  #146                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       197: aload_0
       198: getfield      #28                 // Field _hall:Lext/mods/gameserver/model/residence/clanhall/SiegableHall;
       201: invokevirtual #38                 // Method ext/mods/gameserver/model/residence/clanhall/SiegableHall.getId:()I
       204: invokevirtual #152                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addFortId:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       207: invokestatic  #156                // Method ext/mods/gameserver/model/World.toAllOnlinePlayers:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       210: getstatic     #271                // Field ext/mods/gameserver/network/SystemMessageId.SIEGE_OF_S1_FINISHED:Lext/mods/gameserver/network/SystemMessageId;
       213: invokestatic  #146                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       216: aload_0
       217: getfield      #28                 // Field _hall:Lext/mods/gameserver/model/residence/clanhall/SiegableHall;
       220: invokevirtual #38                 // Method ext/mods/gameserver/model/residence/clanhall/SiegableHall.getId:()I
       223: invokevirtual #152                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addFortId:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       226: invokestatic  #156                // Method ext/mods/gameserver/model/World.toAllOnlinePlayers:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       229: aload_0
       230: iconst_0
       231: putfield      #236                // Field _missionAccomplished:Z
       234: aload_0
       235: getfield      #28                 // Field _hall:Lext/mods/gameserver/model/residence/clanhall/SiegableHall;
       238: invokevirtual #175                // Method ext/mods/gameserver/model/residence/clanhall/SiegableHall.getSiegeZone:()Lext/mods/gameserver/model/zone/type/SiegeZone;
       241: iconst_0
       242: invokevirtual #179                // Method ext/mods/gameserver/model/zone/type/SiegeZone.setActive:(Z)V
       245: aload_0
       246: getfield      #28                 // Field _hall:Lext/mods/gameserver/model/residence/clanhall/SiegableHall;
       249: invokevirtual #127                // Method ext/mods/gameserver/model/residence/clanhall/SiegableHall.updateNextSiege:()V
       252: aload_0
       253: getfield      #28                 // Field _hall:Lext/mods/gameserver/model/residence/clanhall/SiegableHall;
       256: iconst_0
       257: invokevirtual #274                // Method ext/mods/gameserver/model/residence/clanhall/SiegableHall.spawnDoor:(Z)V
       260: aload_0
       261: getfield      #28                 // Field _hall:Lext/mods/gameserver/model/residence/clanhall/SiegableHall;
       264: invokevirtual #276                // Method ext/mods/gameserver/model/residence/clanhall/SiegableHall.banishForeigners:()V
       267: iconst_0
       268: istore_3
       269: aload_0
       270: getfield      #12                 // Field _attackers:Ljava/util/List;
       273: invokeinterface #185,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
       278: astore        4
       280: aload         4
       282: invokeinterface #189,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       287: ifeq          357
       290: aload         4
       292: invokeinterface #194,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       297: checkcast     #99                 // class ext/mods/gameserver/model/pledge/Clan
       300: astore        5
       302: aload         5
       304: aconst_null
       305: invokevirtual #278                // Method ext/mods/gameserver/model/pledge/Clan.setFlag:(Lext/mods/gameserver/model/actor/Npc;)V
       308: aload         5
       310: invokevirtual #198                // Method ext/mods/gameserver/model/pledge/Clan.getOnlineMembers:()[Lext/mods/gameserver/model/actor/Player;
       313: astore        6
       315: aload         6
       317: arraylength
       318: istore        7
       320: iconst_0
       321: istore        8
       323: iload         8
       325: iload         7
       327: if_icmpge     354
       330: aload         6
       332: iload         8
       334: aaload
       335: astore        9
       337: aload         9
       339: iconst_0
       340: invokevirtual #202                // Method ext/mods/gameserver/model/actor/Player.setSiegeState:(I)V
       343: aload         9
       345: invokevirtual #207                // Method ext/mods/gameserver/model/actor/Player.broadcastUserInfo:()V
       348: iinc          8, 1
       351: goto          323
       354: goto          280
       357: aload_0
       358: getfield      #28                 // Field _hall:Lext/mods/gameserver/model/residence/clanhall/SiegableHall;
       361: invokevirtual #175                // Method ext/mods/gameserver/model/residence/clanhall/SiegableHall.getSiegeZone:()Lext/mods/gameserver/model/zone/type/SiegeZone;
       364: ldc           #203                // class ext/mods/gameserver/model/actor/Player
       366: invokevirtual #282                // Method ext/mods/gameserver/model/zone/type/SiegeZone.getKnownTypeInside:(Ljava/lang/Class;)Ljava/util/List;
       369: invokeinterface #185,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
       374: astore        4
       376: aload         4
       378: invokeinterface #189,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       383: ifeq          406
       386: aload         4
       388: invokeinterface #194,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       393: checkcast     #203                // class ext/mods/gameserver/model/actor/Player
       396: astore        5
       398: aload         5
       400: invokevirtual #286                // Method ext/mods/gameserver/model/actor/Player.updatePvPStatus:()V
       403: goto          376
       406: aload_0
       407: getfield      #12                 // Field _attackers:Ljava/util/List;
       410: invokeinterface #289,  1          // InterfaceMethod java/util/List.clear:()V
       415: aload_0
       416: aload_0
       417: invokedynamic #45,  0             // InvokeDynamic #0:run:(Lext/mods/gameserver/model/residence/clanhall/ClanHallSiege;)Ljava/lang/Runnable;
       422: aload_0
       423: getfield      #28                 // Field _hall:Lext/mods/gameserver/model/residence/clanhall/SiegableHall;
       426: invokevirtual #49                 // Method ext/mods/gameserver/model/residence/clanhall/SiegableHall.getNextSiegeTime:()J
       429: invokestatic  #53                 // Method java/lang/System.currentTimeMillis:()J
       432: lsub
       433: ldc2_w        #58                 // long 3600000l
       436: lsub
       437: invokestatic  #60                 // Method ext/mods/commons/pool/ThreadPool.schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
       440: putfield      #66                 // Field _siegeTask:Ljava/util/concurrent/ScheduledFuture;
       443: getstatic     #70                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
       446: ldc_w         #292                // String Siege of {} scheduled for {}.
       449: iconst_2
       450: anewarray     #76                 // class java/lang/Object
       453: dup
       454: iconst_0
       455: aload_0
       456: getfield      #28                 // Field _hall:Lext/mods/gameserver/model/residence/clanhall/SiegableHall;
       459: invokevirtual #78                 // Method ext/mods/gameserver/model/residence/clanhall/SiegableHall.getName:()Ljava/lang/String;
       462: aastore
       463: dup
       464: iconst_1
       465: aload_0
       466: getfield      #28                 // Field _hall:Lext/mods/gameserver/model/residence/clanhall/SiegableHall;
       469: invokevirtual #122                // Method ext/mods/gameserver/model/residence/clanhall/SiegableHall.getSiegeDate:()Ljava/util/Calendar;
       472: invokevirtual #86                 // Method java/util/Calendar.getTime:()Ljava/util/Date;
       475: aastore
       476: invokevirtual #92                 // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
       479: aload_0
       480: getfield      #28                 // Field _hall:Lext/mods/gameserver/model/residence/clanhall/SiegableHall;
       483: getstatic     #130                // Field ext/mods/gameserver/enums/SiegeStatus.REGISTRATION_OPENED:Lext/mods/gameserver/enums/SiegeStatus;
       486: invokevirtual #136                // Method ext/mods/gameserver/model/residence/clanhall/SiegableHall.updateSiegeStatus:(Lext/mods/gameserver/enums/SiegeStatus;)V
       489: aload_0
       490: invokevirtual #294                // Method unspawnNpcs:()V
       493: return
      LineNumberTable:
        line 181: 0
        line 182: 5
        line 184: 33
        line 186: 44
        line 187: 48
        line 188: 59
        line 189: 67
        line 191: 75
        line 193: 83
        line 195: 94
        line 197: 123
        line 198: 139
        line 199: 150
        line 201: 161
        line 202: 169
        line 204: 180
        line 207: 191
        line 209: 210
        line 211: 229
        line 213: 234
        line 215: 245
        line 216: 252
        line 217: 260
        line 219: 267
        line 220: 269
        line 222: 302
        line 224: 308
        line 226: 337
        line 227: 343
        line 224: 348
        line 229: 354
        line 231: 357
        line 232: 398
        line 234: 406
        line 236: 415
        line 237: 443
        line 239: 479
        line 241: 489
        line 242: 493
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          337      11     9 player   Lext/mods/gameserver/model/actor/Player;
          302      52     5  clan   Lext/mods/gameserver/model/pledge/Clan;
          398       5     5 player   Lext/mods/gameserver/model/actor/Player;
            0     494     0  this   Lext/mods/gameserver/model/residence/clanhall/ClanHallSiege;
            5     489     1 winner   Lext/mods/gameserver/model/pledge/Clan;
           33     461     2 oldOwner   Lext/mods/gameserver/model/pledge/Clan;
          269     225     3 state   B
      StackMapTable: number_of_entries = 15
        frame_type = 252 /* append */
          offset_delta = 31
          locals = [ class ext/mods/gameserver/model/pledge/Clan ]
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/model/pledge/Clan ]
        frame_type = 252 /* append */
          offset_delta = 26
          locals = [ class ext/mods/gameserver/model/pledge/Clan ]
        frame_type = 15 /* same */
        frame_type = 47 /* same */
        frame_type = 26 /* same */
        frame_type = 29 /* same */
        frame_type = 10 /* same */
        frame_type = 18 /* same */
        frame_type = 253 /* append */
          offset_delta = 69
          locals = [ int, class java/util/Iterator ]
        frame_type = 255 /* full_frame */
          offset_delta = 42
          locals = [ class ext/mods/gameserver/model/residence/clanhall/ClanHallSiege, class ext/mods/gameserver/model/pledge/Clan, class ext/mods/gameserver/model/pledge/Clan, int, class java/util/Iterator, class ext/mods/gameserver/model/pledge/Clan, class "[Lext/mods/gameserver/model/actor/Player;", int, int ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 30
          locals = [ class ext/mods/gameserver/model/residence/clanhall/ClanHallSiege, class ext/mods/gameserver/model/pledge/Clan, class ext/mods/gameserver/model/pledge/Clan, int, class java/util/Iterator ]
          stack = []
        frame_type = 250 /* chop */
          offset_delta = 2
        frame_type = 252 /* append */
          offset_delta = 18
          locals = [ class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 29

  public boolean wasPreviouslyOwned();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #297                // Field _wasPreviouslyOwned:Z
         4: ireturn
      LineNumberTable:
        line 246: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/residence/clanhall/ClanHallSiege;

  public boolean canPlantFlag();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: iconst_1
         1: ireturn
      LineNumberTable:
        line 251: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/gameserver/model/residence/clanhall/ClanHallSiege;

  public boolean doorIsAutoAttackable();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: iconst_1
         1: ireturn
      LineNumberTable:
        line 256: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/gameserver/model/residence/clanhall/ClanHallSiege;

  public java.util.List<ext.mods.gameserver.model.actor.Player> getAttackersInZone();
    descriptor: ()Ljava/util/List;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=5, args_size=1
         0: new           #300                // class java/util/ArrayList
         3: dup
         4: invokespecial #302                // Method java/util/ArrayList."<init>":()V
         7: astore_1
         8: aload_0
         9: getfield      #28                 // Field _hall:Lext/mods/gameserver/model/residence/clanhall/SiegableHall;
        12: invokevirtual #175                // Method ext/mods/gameserver/model/residence/clanhall/SiegableHall.getSiegeZone:()Lext/mods/gameserver/model/zone/type/SiegeZone;
        15: ldc           #203                // class ext/mods/gameserver/model/actor/Player
        17: invokevirtual #282                // Method ext/mods/gameserver/model/zone/type/SiegeZone.getKnownTypeInside:(Ljava/lang/Class;)Ljava/util/List;
        20: invokeinterface #185,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
        25: astore_2
        26: aload_2
        27: invokeinterface #189,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        32: ifeq          81
        35: aload_2
        36: invokeinterface #194,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        41: checkcast     #203                // class ext/mods/gameserver/model/actor/Player
        44: astore_3
        45: aload_3
        46: invokevirtual #303                // Method ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
        49: astore        4
        51: aload         4
        53: ifnull        78
        56: aload_0
        57: getfield      #12                 // Field _attackers:Ljava/util/List;
        60: aload         4
        62: invokeinterface #110,  2          // InterfaceMethod java/util/List.contains:(Ljava/lang/Object;)Z
        67: ifeq          78
        70: aload_1
        71: aload_3
        72: invokeinterface #305,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        77: pop
        78: goto          26
        81: aload_1
        82: areturn
      LineNumberTable:
        line 261: 0
        line 262: 8
        line 264: 45
        line 265: 51
        line 266: 70
        line 267: 78
        line 268: 81
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           51      27     4  clan   Lext/mods/gameserver/model/pledge/Clan;
           45      33     3 player   Lext/mods/gameserver/model/actor/Player;
            0      83     0  this   Lext/mods/gameserver/model/residence/clanhall/ClanHallSiege;
            8      75     1 attackers   Ljava/util/List;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            8      75     1 attackers   Ljava/util/List<Lext/mods/gameserver/model/actor/Player;>;
      StackMapTable: number_of_entries = 3
        frame_type = 253 /* append */
          offset_delta = 26
          locals = [ class java/util/List, class java/util/Iterator ]
        frame_type = 51 /* same */
        frame_type = 250 /* chop */
          offset_delta = 2
    Signature: #482                         // ()Ljava/util/List<Lext/mods/gameserver/model/actor/Player;>;

  public void instantSiege();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=1, args_size=1
         0: aload_0
         1: lconst_0
         2: invokevirtual #308                // Method prepareSiege:(J)V
         5: return
      LineNumberTable:
        line 273: 0
        line 274: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/residence/clanhall/ClanHallSiege;

  protected void prepareSiege();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=5, locals=1, args_size=1
         0: aload_0
         1: aload_0
         2: getfield      #28                 // Field _hall:Lext/mods/gameserver/model/residence/clanhall/SiegableHall;
         5: invokevirtual #49                 // Method ext/mods/gameserver/model/residence/clanhall/SiegableHall.getNextSiegeTime:()J
         8: invokestatic  #53                 // Method java/lang/System.currentTimeMillis:()J
        11: lsub
        12: invokevirtual #308                // Method prepareSiege:(J)V
        15: return
      LineNumberTable:
        line 278: 0
        line 279: 15
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      16     0  this   Lext/mods/gameserver/model/residence/clanhall/ClanHallSiege;

  protected void prepareSiege(long);
    descriptor: (J)V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=4, locals=4, args_size=2
         0: aload_0
         1: getfield      #28                 // Field _hall:Lext/mods/gameserver/model/residence/clanhall/SiegableHall;
         4: invokevirtual #224                // Method ext/mods/gameserver/model/residence/clanhall/SiegableHall.getOwnerId:()I
         7: ifle          47
        10: invokestatic  #227                // Method ext/mods/gameserver/data/sql/ClanTable.getInstance:()Lext/mods/gameserver/data/sql/ClanTable;
        13: aload_0
        14: getfield      #28                 // Field _hall:Lext/mods/gameserver/model/residence/clanhall/SiegableHall;
        17: invokevirtual #224                // Method ext/mods/gameserver/model/residence/clanhall/SiegableHall.getOwnerId:()I
        20: invokevirtual #232                // Method ext/mods/gameserver/data/sql/ClanTable.getClan:(I)Lext/mods/gameserver/model/pledge/Clan;
        23: astore_3
        24: aload_3
        25: ifnull        39
        28: aload_0
        29: getfield      #12                 // Field _attackers:Ljava/util/List;
        32: aload_3
        33: invokeinterface #305,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        38: pop
        39: aload_0
        40: iconst_1
        41: putfield      #297                // Field _wasPreviouslyOwned:Z
        44: goto          52
        47: aload_0
        48: iconst_0
        49: putfield      #297                // Field _wasPreviouslyOwned:Z
        52: aload_0
        53: getfield      #28                 // Field _hall:Lext/mods/gameserver/model/residence/clanhall/SiegableHall;
        56: invokevirtual #312                // Method ext/mods/gameserver/model/residence/clanhall/SiegableHall.free:()V
        59: aload_0
        60: getfield      #28                 // Field _hall:Lext/mods/gameserver/model/residence/clanhall/SiegableHall;
        63: invokevirtual #276                // Method ext/mods/gameserver/model/residence/clanhall/SiegableHall.banishForeigners:()V
        66: aload_0
        67: getfield      #28                 // Field _hall:Lext/mods/gameserver/model/residence/clanhall/SiegableHall;
        70: getstatic     #315                // Field ext/mods/gameserver/enums/SiegeStatus.REGISTRATION_OVER:Lext/mods/gameserver/enums/SiegeStatus;
        73: invokevirtual #136                // Method ext/mods/gameserver/model/residence/clanhall/SiegableHall.updateSiegeStatus:(Lext/mods/gameserver/enums/SiegeStatus;)V
        76: aload_0
        77: aload_0
        78: invokedynamic #318,  0            // InvokeDynamic #2:run:(Lext/mods/gameserver/model/residence/clanhall/ClanHallSiege;)Ljava/lang/Runnable;
        83: lload_1
        84: invokestatic  #60                 // Method ext/mods/commons/pool/ThreadPool.schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
        87: putfield      #66                 // Field _siegeTask:Ljava/util/concurrent/ScheduledFuture;
        90: getstatic     #319                // Field ext/mods/gameserver/network/SystemMessageId.REGISTRATION_TERM_FOR_S1_ENDED:Lext/mods/gameserver/network/SystemMessageId;
        93: invokestatic  #146                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        96: aload_0
        97: getfield      #28                 // Field _hall:Lext/mods/gameserver/model/residence/clanhall/SiegableHall;
       100: invokevirtual #38                 // Method ext/mods/gameserver/model/residence/clanhall/SiegableHall.getId:()I
       103: invokevirtual #152                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addFortId:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       106: invokestatic  #156                // Method ext/mods/gameserver/model/World.toAllOnlinePlayers:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       109: return
      LineNumberTable:
        line 283: 0
        line 285: 10
        line 286: 24
        line 287: 28
        line 289: 39
        line 290: 44
        line 292: 47
        line 294: 52
        line 295: 59
        line 296: 66
        line 298: 76
        line 300: 90
        line 301: 109
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           24      20     3  clan   Lext/mods/gameserver/model/pledge/Clan;
            0     110     0  this   Lext/mods/gameserver/model/residence/clanhall/ClanHallSiege;
            0     110     1 delay   J
      StackMapTable: number_of_entries = 3
        frame_type = 252 /* append */
          offset_delta = 39
          locals = [ class ext/mods/gameserver/model/pledge/Clan ]
        frame_type = 250 /* chop */
          offset_delta = 7
        frame_type = 4 /* same */

  public void cancelSiegeTask();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #66                 // Field _siegeTask:Ljava/util/concurrent/ScheduledFuture;
         4: ifnull        18
         7: aload_0
         8: getfield      #66                 // Field _siegeTask:Ljava/util/concurrent/ScheduledFuture;
        11: iconst_0
        12: invokeinterface #322,  2          // InterfaceMethod java/util/concurrent/ScheduledFuture.cancel:(Z)Z
        17: pop
        18: return
      LineNumberTable:
        line 305: 0
        line 306: 7
        line 307: 18
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      19     0  this   Lext/mods/gameserver/model/residence/clanhall/ClanHallSiege;
      StackMapTable: number_of_entries = 1
        frame_type = 18 /* same */

  public void loadAttackers();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=7, locals=6, args_size=1
         0: invokestatic  #328                // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
         3: astore_1
         4: aload_1
         5: ldc_w         #334                // String SELECT attacker_id FROM clanhall_siege_attackers WHERE clanhall_id = ?
         8: invokeinterface #336,  2          // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        13: astore_2
        14: aload_2
        15: iconst_1
        16: aload_0
        17: getfield      #28                 // Field _hall:Lext/mods/gameserver/model/residence/clanhall/SiegableHall;
        20: invokevirtual #38                 // Method ext/mods/gameserver/model/residence/clanhall/SiegableHall.getId:()I
        23: invokeinterface #342,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        28: aload_2
        29: invokeinterface #348,  1          // InterfaceMethod java/sql/PreparedStatement.executeQuery:()Ljava/sql/ResultSet;
        34: astore_3
        35: aload_3
        36: invokeinterface #352,  1          // InterfaceMethod java/sql/ResultSet.next:()Z
        41: ifeq          81
        44: invokestatic  #227                // Method ext/mods/gameserver/data/sql/ClanTable.getInstance:()Lext/mods/gameserver/data/sql/ClanTable;
        47: aload_3
        48: ldc_w         #356                // String attacker_id
        51: invokeinterface #358,  2          // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
        56: invokevirtual #232                // Method ext/mods/gameserver/data/sql/ClanTable.getClan:(I)Lext/mods/gameserver/model/pledge/Clan;
        59: astore        4
        61: aload         4
        63: ifnull        78
        66: aload_0
        67: getfield      #12                 // Field _attackers:Ljava/util/List;
        70: aload         4
        72: invokeinterface #305,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        77: pop
        78: goto          35
        81: aload_3
        82: ifnull        121
        85: aload_3
        86: invokeinterface #362,  1          // InterfaceMethod java/sql/ResultSet.close:()V
        91: goto          121
        94: astore        4
        96: aload_3
        97: ifnull        118
       100: aload_3
       101: invokeinterface #362,  1          // InterfaceMethod java/sql/ResultSet.close:()V
       106: goto          118
       109: astore        5
       111: aload         4
       113: aload         5
       115: invokevirtual #367                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       118: aload         4
       120: athrow
       121: aload_2
       122: ifnull        158
       125: aload_2
       126: invokeinterface #371,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       131: goto          158
       134: astore_3
       135: aload_2
       136: ifnull        156
       139: aload_2
       140: invokeinterface #371,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       145: goto          156
       148: astore        4
       150: aload_3
       151: aload         4
       153: invokevirtual #367                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       156: aload_3
       157: athrow
       158: aload_1
       159: ifnull        193
       162: aload_1
       163: invokeinterface #372,  1          // InterfaceMethod java/sql/Connection.close:()V
       168: goto          193
       171: astore_2
       172: aload_1
       173: ifnull        191
       176: aload_1
       177: invokeinterface #372,  1          // InterfaceMethod java/sql/Connection.close:()V
       182: goto          191
       185: astore_3
       186: aload_2
       187: aload_3
       188: invokevirtual #367                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       191: aload_2
       192: athrow
       193: goto          218
       196: astore_1
       197: getstatic     #70                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
       200: ldc_w         #375                // String Couldn\'t load {} siege attackers.
       203: aload_1
       204: iconst_1
       205: anewarray     #76                 // class java/lang/Object
       208: dup
       209: iconst_0
       210: aload_0
       211: invokevirtual #377                // Method getName:()Ljava/lang/String;
       214: aastore
       215: invokevirtual #378                // Method ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
       218: return
      Exception table:
         from    to  target type
            35    81    94   Class java/lang/Throwable
           100   106   109   Class java/lang/Throwable
            14   121   134   Class java/lang/Throwable
           139   145   148   Class java/lang/Throwable
             4   158   171   Class java/lang/Throwable
           176   182   185   Class java/lang/Throwable
             0   193   196   Class java/lang/Exception
      LineNumberTable:
        line 311: 0
        line 312: 4
        line 314: 14
        line 316: 28
        line 318: 35
        line 320: 44
        line 321: 61
        line 322: 66
        line 323: 78
        line 324: 81
        line 316: 94
        line 325: 121
        line 311: 134
        line 325: 158
        line 311: 171
        line 329: 193
        line 326: 196
        line 328: 197
        line 330: 218
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           61      17     4  clan   Lext/mods/gameserver/model/pledge/Clan;
           35      86     3  rset   Ljava/sql/ResultSet;
           14     144     2    ps   Ljava/sql/PreparedStatement;
            4     189     1   con   Ljava/sql/Connection;
          197      21     1     e   Ljava/lang/Exception;
            0     219     0  this   Lext/mods/gameserver/model/residence/clanhall/ClanHallSiege;
      StackMapTable: number_of_entries = 17
        frame_type = 254 /* append */
          offset_delta = 35
          locals = [ class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/ResultSet ]
        frame_type = 42 /* same */
        frame_type = 2 /* same */
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 14
          locals = [ class ext/mods/gameserver/model/residence/clanhall/ClanHallSiege, class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/ResultSet, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/model/residence/clanhall/ClanHallSiege, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 7 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/model/residence/clanhall/ClanHallSiege, class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 5 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 21 /* same */

  public final void saveAttackers();
    descriptor: ()V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=7, locals=5, args_size=1
         0: invokestatic  #328                // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
         3: astore_1
         4: aload_1
         5: ldc_w         #382                // String DELETE FROM clanhall_siege_attackers WHERE clanhall_id = ?
         8: invokeinterface #336,  2          // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        13: astore_2
        14: aload_2
        15: iconst_1
        16: aload_0
        17: getfield      #28                 // Field _hall:Lext/mods/gameserver/model/residence/clanhall/SiegableHall;
        20: invokevirtual #38                 // Method ext/mods/gameserver/model/residence/clanhall/SiegableHall.getId:()I
        23: invokeinterface #342,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        28: aload_2
        29: invokeinterface #384,  1          // InterfaceMethod java/sql/PreparedStatement.execute:()Z
        34: pop
        35: aload_2
        36: ifnull        72
        39: aload_2
        40: invokeinterface #371,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
        45: goto          72
        48: astore_3
        49: aload_2
        50: ifnull        70
        53: aload_2
        54: invokeinterface #371,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
        59: goto          70
        62: astore        4
        64: aload_3
        65: aload         4
        67: invokevirtual #367                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        70: aload_3
        71: athrow
        72: aload_0
        73: getfield      #12                 // Field _attackers:Ljava/util/List;
        76: invokeinterface #123,  1          // InterfaceMethod java/util/List.isEmpty:()Z
        81: ifne          203
        84: aload_1
        85: ldc_w         #387                // String INSERT INTO clanhall_siege_attackers VALUES (?,?)
        88: invokeinterface #336,  2          // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        93: astore_2
        94: aload_0
        95: getfield      #12                 // Field _attackers:Ljava/util/List;
        98: invokeinterface #185,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
       103: astore_3
       104: aload_3
       105: invokeinterface #189,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       110: ifeq          159
       113: aload_3
       114: invokeinterface #194,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       119: checkcast     #99                 // class ext/mods/gameserver/model/pledge/Clan
       122: astore        4
       124: aload_2
       125: iconst_1
       126: aload_0
       127: getfield      #28                 // Field _hall:Lext/mods/gameserver/model/residence/clanhall/SiegableHall;
       130: invokevirtual #38                 // Method ext/mods/gameserver/model/residence/clanhall/SiegableHall.getId:()I
       133: invokeinterface #342,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       138: aload_2
       139: iconst_2
       140: aload         4
       142: invokevirtual #389                // Method ext/mods/gameserver/model/pledge/Clan.getClanId:()I
       145: invokeinterface #342,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       150: aload_2
       151: invokeinterface #392,  1          // InterfaceMethod java/sql/PreparedStatement.addBatch:()V
       156: goto          104
       159: aload_2
       160: invokeinterface #395,  1          // InterfaceMethod java/sql/PreparedStatement.executeBatch:()[I
       165: pop
       166: aload_2
       167: ifnull        203
       170: aload_2
       171: invokeinterface #371,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       176: goto          203
       179: astore_3
       180: aload_2
       181: ifnull        201
       184: aload_2
       185: invokeinterface #371,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       190: goto          201
       193: astore        4
       195: aload_3
       196: aload         4
       198: invokevirtual #367                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       201: aload_3
       202: athrow
       203: aload_1
       204: ifnull        238
       207: aload_1
       208: invokeinterface #372,  1          // InterfaceMethod java/sql/Connection.close:()V
       213: goto          238
       216: astore_2
       217: aload_1
       218: ifnull        236
       221: aload_1
       222: invokeinterface #372,  1          // InterfaceMethod java/sql/Connection.close:()V
       227: goto          236
       230: astore_3
       231: aload_2
       232: aload_3
       233: invokevirtual #367                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       236: aload_2
       237: athrow
       238: goto          263
       241: astore_1
       242: getstatic     #70                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
       245: ldc_w         #399                // String Couldn\'t save {} siege attackers.
       248: aload_1
       249: iconst_1
       250: anewarray     #76                 // class java/lang/Object
       253: dup
       254: iconst_0
       255: aload_0
       256: invokevirtual #377                // Method getName:()Ljava/lang/String;
       259: aastore
       260: invokevirtual #378                // Method ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
       263: return
      Exception table:
         from    to  target type
            14    35    48   Class java/lang/Throwable
            53    59    62   Class java/lang/Throwable
            94   166   179   Class java/lang/Throwable
           184   190   193   Class java/lang/Throwable
             4   203   216   Class java/lang/Throwable
           221   227   230   Class java/lang/Throwable
             0   238   241   Class java/lang/Exception
      LineNumberTable:
        line 334: 0
        line 336: 4
        line 338: 14
        line 339: 28
        line 340: 35
        line 336: 48
        line 342: 72
        line 344: 84
        line 346: 94
        line 348: 124
        line 349: 138
        line 350: 150
        line 351: 156
        line 352: 159
        line 353: 166
        line 344: 179
        line 355: 203
        line 334: 216
        line 359: 238
        line 356: 241
        line 358: 242
        line 360: 263
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           14      58     2    ps   Ljava/sql/PreparedStatement;
          124      32     4  clan   Lext/mods/gameserver/model/pledge/Clan;
           94     109     2 insert   Ljava/sql/PreparedStatement;
            4     234     1   con   Ljava/sql/Connection;
          242      21     1     e   Ljava/lang/Exception;
            0     264     0  this   Lext/mods/gameserver/model/residence/clanhall/ClanHallSiege;
      StackMapTable: number_of_entries = 16
        frame_type = 255 /* full_frame */
          offset_delta = 48
          locals = [ class ext/mods/gameserver/model/residence/clanhall/ClanHallSiege, class java/sql/Connection, class java/sql/PreparedStatement ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/model/residence/clanhall/ClanHallSiege, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 7 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 253 /* append */
          offset_delta = 31
          locals = [ class java/sql/PreparedStatement, class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 54
        frame_type = 83 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/model/residence/clanhall/ClanHallSiege, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 7 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/model/residence/clanhall/ClanHallSiege, class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 5 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 21 /* same */

  public final void updateAttackers();
    descriptor: ()V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=6, locals=6, args_size=1
         0: invokestatic  #328                // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
         3: astore_1
         4: aload_1
         5: ldc_w         #382                // String DELETE FROM clanhall_siege_attackers WHERE clanhall_id = ?
         8: invokeinterface #336,  2          // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        13: astore_2
        14: aload_2
        15: iconst_1
        16: aload_0
        17: getfield      #28                 // Field _hall:Lext/mods/gameserver/model/residence/clanhall/SiegableHall;
        20: invokevirtual #38                 // Method ext/mods/gameserver/model/residence/clanhall/SiegableHall.getId:()I
        23: invokeinterface #342,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        28: aload_2
        29: invokeinterface #384,  1          // InterfaceMethod java/sql/PreparedStatement.execute:()Z
        34: pop
        35: aload_0
        36: getfield      #12                 // Field _attackers:Ljava/util/List;
        39: invokeinterface #123,  1          // InterfaceMethod java/util/List.isEmpty:()Z
        44: ifne          166
        47: aload_1
        48: ldc_w         #387                // String INSERT INTO clanhall_siege_attackers VALUES (?,?)
        51: invokeinterface #336,  2          // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        56: astore_3
        57: aload_0
        58: getfield      #12                 // Field _attackers:Ljava/util/List;
        61: invokeinterface #185,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
        66: astore        4
        68: aload         4
        70: invokeinterface #189,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        75: ifeq          126
        78: aload         4
        80: invokeinterface #194,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        85: checkcast     #99                 // class ext/mods/gameserver/model/pledge/Clan
        88: astore        5
        90: aload_3
        91: iconst_1
        92: aload_0
        93: getfield      #28                 // Field _hall:Lext/mods/gameserver/model/residence/clanhall/SiegableHall;
        96: invokevirtual #38                 // Method ext/mods/gameserver/model/residence/clanhall/SiegableHall.getId:()I
        99: invokeinterface #342,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       104: aload_3
       105: iconst_2
       106: aload         5
       108: invokevirtual #389                // Method ext/mods/gameserver/model/pledge/Clan.getClanId:()I
       111: invokeinterface #342,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       116: aload_3
       117: invokeinterface #401,  1          // InterfaceMethod java/sql/PreparedStatement.executeUpdate:()I
       122: pop
       123: goto          68
       126: aload_3
       127: ifnull        166
       130: aload_3
       131: invokeinterface #371,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       136: goto          166
       139: astore        4
       141: aload_3
       142: ifnull        163
       145: aload_3
       146: invokeinterface #371,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       151: goto          163
       154: astore        5
       156: aload         4
       158: aload         5
       160: invokevirtual #367                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       163: aload         4
       165: athrow
       166: aload_2
       167: ifnull        203
       170: aload_2
       171: invokeinterface #371,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       176: goto          203
       179: astore_3
       180: aload_2
       181: ifnull        201
       184: aload_2
       185: invokeinterface #371,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       190: goto          201
       193: astore        4
       195: aload_3
       196: aload         4
       198: invokevirtual #367                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       201: aload_3
       202: athrow
       203: aload_1
       204: ifnull        238
       207: aload_1
       208: invokeinterface #372,  1          // InterfaceMethod java/sql/Connection.close:()V
       213: goto          238
       216: astore_2
       217: aload_1
       218: ifnull        236
       221: aload_1
       222: invokeinterface #372,  1          // InterfaceMethod java/sql/Connection.close:()V
       227: goto          236
       230: astore_3
       231: aload_2
       232: aload_3
       233: invokevirtual #367                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       236: aload_2
       237: athrow
       238: goto          266
       241: astore_1
       242: getstatic     #70                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
       245: ldc_w         #404                // String {}: Couldnt save attacker list!
       248: iconst_2
       249: anewarray     #76                 // class java/lang/Object
       252: dup
       253: iconst_0
       254: aload_0
       255: invokevirtual #377                // Method getName:()Ljava/lang/String;
       258: aastore
       259: dup
       260: iconst_1
       261: aload_1
       262: aastore
       263: invokevirtual #406                // Method ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;[Ljava/lang/Object;)V
       266: return
      Exception table:
         from    to  target type
            57   126   139   Class java/lang/Throwable
           145   151   154   Class java/lang/Throwable
            14   166   179   Class java/lang/Throwable
           184   190   193   Class java/lang/Throwable
             4   203   216   Class java/lang/Throwable
           221   227   230   Class java/lang/Throwable
             0   238   241   Class java/lang/Exception
      LineNumberTable:
        line 364: 0
        line 365: 4
        line 367: 14
        line 368: 28
        line 370: 35
        line 372: 47
        line 374: 57
        line 376: 90
        line 377: 104
        line 378: 116
        line 379: 123
        line 380: 126
        line 372: 139
        line 382: 166
        line 364: 179
        line 382: 203
        line 364: 216
        line 386: 238
        line 383: 241
        line 385: 242
        line 387: 266
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           90      33     5  clan   Lext/mods/gameserver/model/pledge/Clan;
           57     109     3 insert   Ljava/sql/PreparedStatement;
           14     189     2    ps   Ljava/sql/PreparedStatement;
            4     234     1   con   Ljava/sql/Connection;
          242      24     1     e   Ljava/lang/Exception;
            0     267     0  this   Lext/mods/gameserver/model/residence/clanhall/ClanHallSiege;
      StackMapTable: number_of_entries = 16
        frame_type = 255 /* full_frame */
          offset_delta = 68
          locals = [ class ext/mods/gameserver/model/residence/clanhall/ClanHallSiege, class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/PreparedStatement, class java/util/Iterator ]
          stack = []
        frame_type = 250 /* chop */
          offset_delta = 57
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 14
          locals = [ class ext/mods/gameserver/model/residence/clanhall/ClanHallSiege, class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/model/residence/clanhall/ClanHallSiege, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 7 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/model/residence/clanhall/ClanHallSiege, class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 5 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 24 /* same */

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=3, locals=0, args_size=0
         0: new           #93                 // class ext/mods/commons/logging/CLogger
         3: dup
         4: ldc           #13                 // class ext/mods/gameserver/model/residence/clanhall/ClanHallSiege
         6: invokevirtual #408                // Method java/lang/Class.getName:()Ljava/lang/String;
         9: invokespecial #411                // Method ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
        12: putstatic     #70                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
        15: return
      LineNumberTable:
        line 49: 0
}
SourceFile: "ClanHallSiege.java"
BootstrapMethods:
  0: #512 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #502 ()V
      #503 REF_invokeVirtual ext/mods/gameserver/model/residence/clanhall/ClanHallSiege.prepareSiege:()V
      #502 ()V
  1: #512 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #502 ()V
      #506 REF_invokeVirtual ext/mods/gameserver/model/residence/clanhall/ClanHallSiege.endSiege:()V
      #502 ()V
  2: #512 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #502 ()V
      #509 REF_invokeVirtual ext/mods/gameserver/model/residence/clanhall/ClanHallSiege.startSiege:()V
      #502 ()V
InnerClasses:
  public static final #524= #520 of #522; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
