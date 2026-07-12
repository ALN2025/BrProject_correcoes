// Bytecode for: ext.mods.gameserver.model.residence.castle.Castle
// File: ext\mods\gameserver\model\residence\castle\Castle.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/residence/castle/Castle.class
  Last modified 9 de jul de 2026; size 35252 bytes
  MD5 checksum 6d658adbd51a3403f9d74fbdbe6d851b
  Compiled from "Castle.java"
public class ext.mods.gameserver.model.residence.castle.Castle extends ext.mods.gameserver.model.residence.Residence
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #13                         // ext/mods/gameserver/model/residence/castle/Castle
  super_class: #2                         // ext/mods/gameserver/model/residence/Residence
  interfaces: 0, fields: 48, methods: 75, attributes: 4
Constant pool:
     #1 = Methodref          #2.#3        // ext/mods/gameserver/model/residence/Residence."<init>":(Lext/mods/commons/data/StatSet;)V
     #2 = Class              #4           // ext/mods/gameserver/model/residence/Residence
     #3 = NameAndType        #5:#6        // "<init>":(Lext/mods/commons/data/StatSet;)V
     #4 = Utf8               ext/mods/gameserver/model/residence/Residence
     #5 = Utf8               <init>
     #6 = Utf8               (Lext/mods/commons/data/StatSet;)V
     #7 = Class              #8           // java/util/HashMap
     #8 = Utf8               java/util/HashMap
     #9 = Methodref          #7.#10       // java/util/HashMap."<init>":()V
    #10 = NameAndType        #5:#11       // "<init>":()V
    #11 = Utf8               ()V
    #12 = Fieldref           #13.#14      // ext/mods/gameserver/model/residence/castle/Castle._function:Ljava/util/Map;
    #13 = Class              #15          // ext/mods/gameserver/model/residence/castle/Castle
    #14 = NameAndType        #16:#17      // _function:Ljava/util/Map;
    #15 = Utf8               ext/mods/gameserver/model/residence/castle/Castle
    #16 = Utf8               _function
    #17 = Utf8               Ljava/util/Map;
    #18 = Class              #19          // java/util/ArrayList
    #19 = Utf8               java/util/ArrayList
    #20 = Methodref          #18.#21      // java/util/ArrayList."<init>":(I)V
    #21 = NameAndType        #5:#22       // "<init>":(I)V
    #22 = Utf8               (I)V
    #23 = Fieldref           #13.#24      // ext/mods/gameserver/model/residence/castle/Castle._tickets:Ljava/util/List;
    #24 = NameAndType        #25:#26      // _tickets:Ljava/util/List;
    #25 = Utf8               _tickets
    #26 = Utf8               Ljava/util/List;
    #27 = Class              #28          // java/util/concurrent/ConcurrentSkipListSet
    #28 = Utf8               java/util/concurrent/ConcurrentSkipListSet
    #29 = Methodref          #27.#10      // java/util/concurrent/ConcurrentSkipListSet."<init>":()V
    #30 = Fieldref           #13.#31      // ext/mods/gameserver/model/residence/castle/Castle._droppedTickets:Ljava/util/Set;
    #31 = NameAndType        #32:#33      // _droppedTickets:Ljava/util/Set;
    #32 = Utf8               _droppedTickets
    #33 = Utf8               Ljava/util/Set;
    #34 = Methodref          #18.#10      // java/util/ArrayList."<init>":()V
    #35 = Fieldref           #13.#36      // ext/mods/gameserver/model/residence/castle/Castle._siegeGuards:Ljava/util/List;
    #36 = NameAndType        #37:#26      // _siegeGuards:Ljava/util/List;
    #37 = Utf8               _siegeGuards
    #38 = Fieldref           #13.#39      // ext/mods/gameserver/model/residence/castle/Castle._controlTowers:Ljava/util/List;
    #39 = NameAndType        #40:#26      // _controlTowers:Ljava/util/List;
    #40 = Utf8               _controlTowers
    #41 = Methodref          #7.#21       // java/util/HashMap."<init>":(I)V
    #42 = Fieldref           #13.#43      // ext/mods/gameserver/model/residence/castle/Castle._artifacts:Ljava/util/Map;
    #43 = NameAndType        #44:#17      // _artifacts:Ljava/util/Map;
    #44 = Utf8               _artifacts
    #45 = Fieldref           #13.#46      // ext/mods/gameserver/model/residence/castle/Castle._isTimeRegistrationOver:Z
    #46 = NameAndType        #47:#48      // _isTimeRegistrationOver:Z
    #47 = Utf8               _isTimeRegistrationOver
    #48 = Utf8               Z
    #49 = Fieldref           #13.#50      // ext/mods/gameserver/model/residence/castle/Castle._sieges:Ljava/util/Map;
    #50 = NameAndType        #51:#17      // _sieges:Ljava/util/Map;
    #51 = Utf8               _sieges
    #52 = Fieldref           #13.#53      // ext/mods/gameserver/model/residence/castle/Castle._skillMember:Ljava/util/Map;
    #53 = NameAndType        #54:#17      // _skillMember:Ljava/util/Map;
    #54 = Utf8               _skillMember
    #55 = Fieldref           #13.#56      // ext/mods/gameserver/model/residence/castle/Castle._skillLeader:Ljava/util/Map;
    #56 = NameAndType        #57:#17      // _skillLeader:Ljava/util/Map;
    #57 = Utf8               _skillLeader
    #58 = Fieldref           #13.#59      // ext/mods/gameserver/model/residence/castle/Castle._itemsMember:Ljava/util/Map;
    #59 = NameAndType        #60:#17      // _itemsMember:Ljava/util/Map;
    #60 = Utf8               _itemsMember
    #61 = Fieldref           #13.#62      // ext/mods/gameserver/model/residence/castle/Castle._itemsLeader:Ljava/util/Map;
    #62 = NameAndType        #63:#17      // _itemsLeader:Ljava/util/Map;
    #63 = Utf8               _itemsLeader
    #64 = String             #65          // circletId
    #65 = Utf8               circletId
    #66 = Methodref          #67.#68      // ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
    #67 = Class              #69          // ext/mods/commons/data/StatSet
    #68 = NameAndType        #70:#71      // getInteger:(Ljava/lang/String;)I
    #69 = Utf8               ext/mods/commons/data/StatSet
    #70 = Utf8               getInteger
    #71 = Utf8               (Ljava/lang/String;)I
    #72 = Fieldref           #13.#73      // ext/mods/gameserver/model/residence/castle/Castle._circletId:I
    #73 = NameAndType        #74:#75      // _circletId:I
    #74 = Utf8               _circletId
    #75 = Utf8               I
    #76 = Integer            1001000
    #77 = Fieldref           #13.#78      // ext/mods/gameserver/model/residence/castle/Castle._id:I
    #78 = NameAndType        #79:#75      // _id:I
    #79 = Utf8               _id
    #80 = Methodref          #81.#82      // ext/mods/gameserver/network/NpcStringId.getNpcMessage:(I)Ljava/lang/String;
    #81 = Class              #83          // ext/mods/gameserver/network/NpcStringId
    #82 = NameAndType        #84:#85      // getNpcMessage:(I)Ljava/lang/String;
    #83 = Utf8               ext/mods/gameserver/network/NpcStringId
    #84 = Utf8               getNpcMessage
    #85 = Utf8               (I)Ljava/lang/String;
    #86 = Fieldref           #13.#87      // ext/mods/gameserver/model/residence/castle/Castle._townName:Ljava/lang/String;
    #87 = NameAndType        #88:#89      // _townName:Ljava/lang/String;
    #88 = Utf8               _townName
    #89 = Utf8               Ljava/lang/String;
    #90 = Methodref          #91.#92      // ext/mods/gameserver/data/manager/ZoneManager.getInstance:()Lext/mods/gameserver/data/manager/ZoneManager;
    #91 = Class              #93          // ext/mods/gameserver/data/manager/ZoneManager
    #92 = NameAndType        #94:#95      // getInstance:()Lext/mods/gameserver/data/manager/ZoneManager;
    #93 = Utf8               ext/mods/gameserver/data/manager/ZoneManager
    #94 = Utf8               getInstance
    #95 = Utf8               ()Lext/mods/gameserver/data/manager/ZoneManager;
    #96 = Class              #97          // ext/mods/gameserver/model/zone/type/SiegeZone
    #97 = Utf8               ext/mods/gameserver/model/zone/type/SiegeZone
    #98 = Methodref          #91.#99      // ext/mods/gameserver/data/manager/ZoneManager.getAllZones:(Ljava/lang/Class;)Ljava/util/Collection;
    #99 = NameAndType        #100:#101    // getAllZones:(Ljava/lang/Class;)Ljava/util/Collection;
   #100 = Utf8               getAllZones
   #101 = Utf8               (Ljava/lang/Class;)Ljava/util/Collection;
   #102 = InterfaceMethodref #103.#104    // java/util/Collection.iterator:()Ljava/util/Iterator;
   #103 = Class              #105         // java/util/Collection
   #104 = NameAndType        #106:#107    // iterator:()Ljava/util/Iterator;
   #105 = Utf8               java/util/Collection
   #106 = Utf8               iterator
   #107 = Utf8               ()Ljava/util/Iterator;
   #108 = InterfaceMethodref #109.#110    // java/util/Iterator.hasNext:()Z
   #109 = Class              #111         // java/util/Iterator
   #110 = NameAndType        #112:#113    // hasNext:()Z
   #111 = Utf8               java/util/Iterator
   #112 = Utf8               hasNext
   #113 = Utf8               ()Z
   #114 = InterfaceMethodref #109.#115    // java/util/Iterator.next:()Ljava/lang/Object;
   #115 = NameAndType        #116:#117    // next:()Ljava/lang/Object;
   #116 = Utf8               next
   #117 = Utf8               ()Ljava/lang/Object;
   #118 = Methodref          #96.#119     // ext/mods/gameserver/model/zone/type/SiegeZone.getSiegableId:()I
   #119 = NameAndType        #120:#121    // getSiegableId:()I
   #120 = Utf8               getSiegableId
   #121 = Utf8               ()I
   #122 = Fieldref           #13.#123     // ext/mods/gameserver/model/residence/castle/Castle._siegeZone:Lext/mods/gameserver/model/zone/type/SiegeZone;
   #123 = NameAndType        #124:#125    // _siegeZone:Lext/mods/gameserver/model/zone/type/SiegeZone;
   #124 = Utf8               _siegeZone
   #125 = Utf8               Lext/mods/gameserver/model/zone/type/SiegeZone;
   #126 = Class              #127         // ext/mods/gameserver/model/zone/type/CastleZone
   #127 = Utf8               ext/mods/gameserver/model/zone/type/CastleZone
   #128 = Methodref          #126.#129    // ext/mods/gameserver/model/zone/type/CastleZone.getResidenceId:()I
   #129 = NameAndType        #130:#121    // getResidenceId:()I
   #130 = Utf8               getResidenceId
   #131 = Fieldref           #13.#132     // ext/mods/gameserver/model/residence/castle/Castle._castleZone:Lext/mods/gameserver/model/zone/type/CastleZone;
   #132 = NameAndType        #133:#134    // _castleZone:Lext/mods/gameserver/model/zone/type/CastleZone;
   #133 = Utf8               _castleZone
   #134 = Utf8               Lext/mods/gameserver/model/zone/type/CastleZone;
   #135 = Class              #136         // ext/mods/gameserver/model/zone/type/CastleTeleportZone
   #136 = Utf8               ext/mods/gameserver/model/zone/type/CastleTeleportZone
   #137 = Methodref          #135.#138    // ext/mods/gameserver/model/zone/type/CastleTeleportZone.getCastleId:()I
   #138 = NameAndType        #139:#121    // getCastleId:()I
   #139 = Utf8               getCastleId
   #140 = Fieldref           #13.#141     // ext/mods/gameserver/model/residence/castle/Castle._teleZone:Lext/mods/gameserver/model/zone/type/CastleTeleportZone;
   #141 = NameAndType        #142:#143    // _teleZone:Lext/mods/gameserver/model/zone/type/CastleTeleportZone;
   #142 = Utf8               _teleZone
   #143 = Utf8               Lext/mods/gameserver/model/zone/type/CastleTeleportZone;
   #144 = Methodref          #13.#145     // ext/mods/gameserver/model/residence/castle/Castle.loadFunctions:()V
   #145 = NameAndType        #146:#11     // loadFunctions:()V
   #146 = Utf8               loadFunctions
   #147 = Methodref          #148.#149    // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
   #148 = Class              #150         // java/lang/Integer
   #149 = NameAndType        #151:#152    // valueOf:(I)Ljava/lang/Integer;
   #150 = Utf8               java/lang/Integer
   #151 = Utf8               valueOf
   #152 = Utf8               (I)Ljava/lang/Integer;
   #153 = InterfaceMethodref #154.#155    // java/util/Map.containsKey:(Ljava/lang/Object;)Z
   #154 = Class              #156         // java/util/Map
   #155 = NameAndType        #157:#158    // containsKey:(Ljava/lang/Object;)Z
   #156 = Utf8               java/util/Map
   #157 = Utf8               containsKey
   #158 = Utf8               (Ljava/lang/Object;)Z
   #159 = InterfaceMethodref #154.#160    // java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
   #160 = NameAndType        #161:#162    // get:(Ljava/lang/Object;)Ljava/lang/Object;
   #161 = Utf8               get
   #162 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
   #163 = Class              #164         // ext/mods/gameserver/model/residence/castle/Castle$CastleFunction
   #164 = Utf8               ext/mods/gameserver/model/residence/castle/Castle$CastleFunction
   #165 = Methodref          #13.#166     // ext/mods/gameserver/model/residence/castle/Castle.isGoodArtifact:(Lext/mods/gameserver/model/WorldObject;)Z
   #166 = NameAndType        #167:#168    // isGoodArtifact:(Lext/mods/gameserver/model/WorldObject;)Z
   #167 = Utf8               isGoodArtifact
   #168 = Utf8               (Lext/mods/gameserver/model/WorldObject;)Z
   #169 = Methodref          #13.#170     // ext/mods/gameserver/model/residence/castle/Castle.getSiege:()Lext/mods/gameserver/model/residence/castle/Siege;
   #170 = NameAndType        #171:#172    // getSiege:()Lext/mods/gameserver/model/residence/castle/Siege;
   #171 = Utf8               getSiege
   #172 = Utf8               ()Lext/mods/gameserver/model/residence/castle/Siege;
   #173 = Fieldref           #174.#175    // ext/mods/gameserver/network/SystemMessageId.CLAN_S1_ENGRAVED_RULER:Lext/mods/gameserver/network/SystemMessageId;
   #174 = Class              #176         // ext/mods/gameserver/network/SystemMessageId
   #175 = NameAndType        #177:#178    // CLAN_S1_ENGRAVED_RULER:Lext/mods/gameserver/network/SystemMessageId;
   #176 = Utf8               ext/mods/gameserver/network/SystemMessageId
   #177 = Utf8               CLAN_S1_ENGRAVED_RULER
   #178 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
   #179 = Methodref          #180.#181    // ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #180 = Class              #182         // ext/mods/gameserver/network/serverpackets/SystemMessage
   #181 = NameAndType        #183:#184    // getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #182 = Utf8               ext/mods/gameserver/network/serverpackets/SystemMessage
   #183 = Utf8               getSystemMessage
   #184 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #185 = Methodref          #186.#187    // ext/mods/gameserver/model/pledge/Clan.getName:()Ljava/lang/String;
   #186 = Class              #188         // ext/mods/gameserver/model/pledge/Clan
   #187 = NameAndType        #189:#190    // getName:()Ljava/lang/String;
   #188 = Utf8               ext/mods/gameserver/model/pledge/Clan
   #189 = Utf8               getName
   #190 = Utf8               ()Ljava/lang/String;
   #191 = Methodref          #180.#192    // ext/mods/gameserver/network/serverpackets/SystemMessage.addString:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #192 = NameAndType        #193:#194    // addString:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #193 = Utf8               addString
   #194 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #195 = Class              #196         // ext/mods/gameserver/enums/SiegeSide
   #196 = Utf8               ext/mods/gameserver/enums/SiegeSide
   #197 = Fieldref           #195.#198    // ext/mods/gameserver/enums/SiegeSide.ATTACKER:Lext/mods/gameserver/enums/SiegeSide;
   #198 = NameAndType        #199:#200    // ATTACKER:Lext/mods/gameserver/enums/SiegeSide;
   #199 = Utf8               ATTACKER
   #200 = Utf8               Lext/mods/gameserver/enums/SiegeSide;
   #201 = Fieldref           #195.#202    // ext/mods/gameserver/enums/SiegeSide.DEFENDER:Lext/mods/gameserver/enums/SiegeSide;
   #202 = NameAndType        #203:#200    // DEFENDER:Lext/mods/gameserver/enums/SiegeSide;
   #203 = Utf8               DEFENDER
   #204 = Methodref          #205.#206    // ext/mods/gameserver/model/residence/castle/Siege.announce:(Lext/mods/gameserver/network/serverpackets/SystemMessage;[Lext/mods/gameserver/enums/SiegeSide;)V
   #205 = Class              #207         // ext/mods/gameserver/model/residence/castle/Siege
   #206 = NameAndType        #208:#209    // announce:(Lext/mods/gameserver/network/serverpackets/SystemMessage;[Lext/mods/gameserver/enums/SiegeSide;)V
   #207 = Utf8               ext/mods/gameserver/model/residence/castle/Siege
   #208 = Utf8               announce
   #209 = Utf8               (Lext/mods/gameserver/network/serverpackets/SystemMessage;[Lext/mods/gameserver/enums/SiegeSide;)V
   #210 = Methodref          #13.#211     // ext/mods/gameserver/model/residence/castle/Castle.setOwner:(Lext/mods/gameserver/model/pledge/Clan;)V
   #211 = NameAndType        #212:#213    // setOwner:(Lext/mods/gameserver/model/pledge/Clan;)V
   #212 = Utf8               setOwner
   #213 = Utf8               (Lext/mods/gameserver/model/pledge/Clan;)V
   #214 = Methodref          #186.#215    // ext/mods/gameserver/model/pledge/Clan.getLeader:()Lext/mods/gameserver/model/pledge/ClanMember;
   #215 = NameAndType        #216:#217    // getLeader:()Lext/mods/gameserver/model/pledge/ClanMember;
   #216 = Utf8               getLeader
   #217 = Utf8               ()Lext/mods/gameserver/model/pledge/ClanMember;
   #218 = Methodref          #219.#220    // ext/mods/gameserver/model/pledge/ClanMember.getPlayerInstance:()Lext/mods/gameserver/model/actor/Player;
   #219 = Class              #221         // ext/mods/gameserver/model/pledge/ClanMember
   #220 = NameAndType        #222:#223    // getPlayerInstance:()Lext/mods/gameserver/model/actor/Player;
   #221 = Utf8               ext/mods/gameserver/model/pledge/ClanMember
   #222 = Utf8               getPlayerInstance
   #223 = Utf8               ()Lext/mods/gameserver/model/actor/Player;
   #224 = Methodref          #225.#226    // ext/mods/gameserver/model/actor/Player.getMissions:()Lext/mods/gameserver/model/actor/container/player/MissionList;
   #225 = Class              #227         // ext/mods/gameserver/model/actor/Player
   #226 = NameAndType        #228:#229    // getMissions:()Lext/mods/gameserver/model/actor/container/player/MissionList;
   #227 = Utf8               ext/mods/gameserver/model/actor/Player
   #228 = Utf8               getMissions
   #229 = Utf8               ()Lext/mods/gameserver/model/actor/container/player/MissionList;
   #230 = Fieldref           #231.#232    // ext/mods/gameserver/enums/actors/MissionType.CASTLE:Lext/mods/gameserver/enums/actors/MissionType;
   #231 = Class              #233         // ext/mods/gameserver/enums/actors/MissionType
   #232 = NameAndType        #234:#235    // CASTLE:Lext/mods/gameserver/enums/actors/MissionType;
   #233 = Utf8               ext/mods/gameserver/enums/actors/MissionType
   #234 = Utf8               CASTLE
   #235 = Utf8               Lext/mods/gameserver/enums/actors/MissionType;
   #236 = Methodref          #237.#238    // ext/mods/gameserver/model/actor/container/player/MissionList.update:(Lext/mods/gameserver/enums/actors/MissionType;)V
   #237 = Class              #239         // ext/mods/gameserver/model/actor/container/player/MissionList
   #238 = NameAndType        #240:#241    // update:(Lext/mods/gameserver/enums/actors/MissionType;)V
   #239 = Utf8               ext/mods/gameserver/model/actor/container/player/MissionList
   #240 = Utf8               update
   #241 = Utf8               (Lext/mods/gameserver/enums/actors/MissionType;)V
   #242 = Fieldref           #13.#243     // ext/mods/gameserver/model/residence/castle/Castle._ownerId:I
   #243 = NameAndType        #244:#75     // _ownerId:I
   #244 = Utf8               _ownerId
   #245 = Fieldref           #13.#246     // ext/mods/gameserver/model/residence/castle/Castle._taxSysgetRate:I
   #246 = NameAndType        #247:#75     // _taxSysgetRate:I
   #247 = Utf8               _taxSysgetRate
   #248 = Double             100.0d
   #250 = Fieldref           #13.#251     // ext/mods/gameserver/model/residence/castle/Castle._parentId:I
   #251 = NameAndType        #252:#75     // _parentId:I
   #252 = Utf8               _parentId
   #253 = Fieldref           #13.#254     // ext/mods/gameserver/model/residence/castle/Castle._tributeRate:I
   #254 = NameAndType        #255:#75     // _tributeRate:I
   #255 = Utf8               _tributeRate
   #256 = Methodref          #257.#258    // ext/mods/gameserver/data/manager/CastleManager.getInstance:()Lext/mods/gameserver/data/manager/CastleManager;
   #257 = Class              #259         // ext/mods/gameserver/data/manager/CastleManager
   #258 = NameAndType        #94:#260     // getInstance:()Lext/mods/gameserver/data/manager/CastleManager;
   #259 = Utf8               ext/mods/gameserver/data/manager/CastleManager
   #260 = Utf8               ()Lext/mods/gameserver/data/manager/CastleManager;
   #261 = Methodref          #257.#262    // ext/mods/gameserver/data/manager/CastleManager.getCastleById:(I)Lext/mods/gameserver/model/residence/castle/Castle;
   #262 = NameAndType        #263:#264    // getCastleById:(I)Lext/mods/gameserver/model/residence/castle/Castle;
   #263 = Utf8               getCastleById
   #264 = Utf8               (I)Lext/mods/gameserver/model/residence/castle/Castle;
   #265 = Methodref          #13.#266     // ext/mods/gameserver/model/residence/castle/Castle.riseTaxRevenue:(JZ)V
   #266 = NameAndType        #267:#268    // riseTaxRevenue:(JZ)V
   #267 = Utf8               riseTaxRevenue
   #268 = Utf8               (JZ)V
   #269 = Fieldref           #13.#270     // ext/mods/gameserver/model/residence/castle/Castle._treasury:J
   #270 = NameAndType        #271:#272    // _treasury:J
   #271 = Utf8               _treasury
   #272 = Utf8               J
   #273 = Methodref          #274.#275    // java/lang/Math.abs:(J)J
   #274 = Class              #276         // java/lang/Math
   #275 = NameAndType        #277:#278    // abs:(J)J
   #276 = Utf8               java/lang/Math
   #277 = Utf8               abs
   #278 = Utf8               (J)J
   #279 = Long               2147483647l
   #281 = Methodref          #282.#283    // ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
   #282 = Class              #284         // ext/mods/commons/pool/ConnectionPool
   #283 = NameAndType        #285:#286    // getConnection:()Ljava/sql/Connection;
   #284 = Utf8               ext/mods/commons/pool/ConnectionPool
   #285 = Utf8               getConnection
   #286 = Utf8               ()Ljava/sql/Connection;
   #287 = String             #288         // UPDATE castle SET treasury=? WHERE id=?
   #288 = Utf8               UPDATE castle SET treasury=? WHERE id=?
   #289 = InterfaceMethodref #290.#291    // java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
   #290 = Class              #292         // java/sql/Connection
   #291 = NameAndType        #293:#294    // prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
   #292 = Utf8               java/sql/Connection
   #293 = Utf8               prepareStatement
   #294 = Utf8               (Ljava/lang/String;)Ljava/sql/PreparedStatement;
   #295 = InterfaceMethodref #296.#297    // java/sql/PreparedStatement.setLong:(IJ)V
   #296 = Class              #298         // java/sql/PreparedStatement
   #297 = NameAndType        #299:#300    // setLong:(IJ)V
   #298 = Utf8               java/sql/PreparedStatement
   #299 = Utf8               setLong
   #300 = Utf8               (IJ)V
   #301 = InterfaceMethodref #296.#302    // java/sql/PreparedStatement.setInt:(II)V
   #302 = NameAndType        #303:#304    // setInt:(II)V
   #303 = Utf8               setInt
   #304 = Utf8               (II)V
   #305 = InterfaceMethodref #296.#306    // java/sql/PreparedStatement.executeUpdate:()I
   #306 = NameAndType        #307:#121    // executeUpdate:()I
   #307 = Utf8               executeUpdate
   #308 = InterfaceMethodref #296.#309    // java/sql/PreparedStatement.close:()V
   #309 = NameAndType        #310:#11     // close:()V
   #310 = Utf8               close
   #311 = Class              #312         // java/lang/Throwable
   #312 = Utf8               java/lang/Throwable
   #313 = Methodref          #311.#314    // java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
   #314 = NameAndType        #315:#316    // addSuppressed:(Ljava/lang/Throwable;)V
   #315 = Utf8               addSuppressed
   #316 = Utf8               (Ljava/lang/Throwable;)V
   #317 = InterfaceMethodref #290.#309    // java/sql/Connection.close:()V
   #318 = Class              #319         // java/lang/Exception
   #319 = Utf8               java/lang/Exception
   #320 = Fieldref           #13.#321     // ext/mods/gameserver/model/residence/castle/Castle.LOGGER:Lext/mods/commons/logging/CLogger;
   #321 = NameAndType        #322:#323    // LOGGER:Lext/mods/commons/logging/CLogger;
   #322 = Utf8               LOGGER
   #323 = Utf8               Lext/mods/commons/logging/CLogger;
   #324 = String             #325         // Couldn\'t update treasury.
   #325 = Utf8               Couldn\'t update treasury.
   #326 = Methodref          #327.#328    // ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
   #327 = Class              #329         // ext/mods/commons/logging/CLogger
   #328 = NameAndType        #330:#331    // error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
   #329 = Utf8               ext/mods/commons/logging/CLogger
   #330 = Utf8               error
   #331 = Utf8               (Ljava/lang/Object;Ljava/lang/Throwable;)V
   #332 = Methodref          #13.#333     // ext/mods/gameserver/model/residence/castle/Castle.tax:(J)J
   #333 = NameAndType        #334:#278    // tax:(J)J
   #334 = Utf8               tax
   #335 = Fieldref           #13.#336     // ext/mods/gameserver/model/residence/castle/Castle._taxRevenue:J
   #336 = NameAndType        #337:#272    // _taxRevenue:J
   #337 = Utf8               _taxRevenue
   #338 = String             #339         // UPDATE castle SET taxRevenue=? WHERE id=?
   #339 = Utf8               UPDATE castle SET taxRevenue=? WHERE id=?
   #340 = String             #341         // Couldn\'t update tax revenue.
   #341 = Utf8               Couldn\'t update tax revenue.
   #342 = Fieldref           #13.#343     // ext/mods/gameserver/model/residence/castle/Castle._seedIncome:J
   #343 = NameAndType        #344:#272    // _seedIncome:J
   #344 = Utf8               _seedIncome
   #345 = String             #346         // UPDATE castle SET seedIncome=? WHERE id=?
   #346 = Utf8               UPDATE castle SET seedIncome=? WHERE id=?
   #347 = String             #348         // Couldn\'t update seed income.
   #348 = Utf8               Couldn\'t update seed income.
   #349 = String             #350         // UPDATE castle SET treasury=?, taxRevenue=?, seedIncome=?, currentTaxPercent=?, nextTaxPercent=? WHERE id=?
   #350 = Utf8               UPDATE castle SET treasury=?, taxRevenue=?, seedIncome=?, currentTaxPercent=?, nextTaxPercent=? WHERE id=?
   #351 = Methodref          #13.#352     // ext/mods/gameserver/model/residence/castle/Castle.isFree:()Z
   #352 = NameAndType        #353:#113    // isFree:()Z
   #353 = Utf8               isFree
   #354 = Methodref          #13.#355     // ext/mods/gameserver/model/residence/castle/Castle.setTreasury:(J)V
   #355 = NameAndType        #356:#357    // setTreasury:(J)V
   #356 = Utf8               setTreasury
   #357 = Utf8               (J)V
   #358 = Methodref          #13.#359     // ext/mods/gameserver/model/residence/castle/Castle.setTaxRevenue:(J)V
   #359 = NameAndType        #360:#357    // setTaxRevenue:(J)V
   #360 = Utf8               setTaxRevenue
   #361 = Methodref          #13.#362     // ext/mods/gameserver/model/residence/castle/Castle.setSeedIncome:(J)V
   #362 = NameAndType        #363:#357    // setSeedIncome:(J)V
   #363 = Utf8               setSeedIncome
   #364 = Methodref          #13.#365     // ext/mods/gameserver/model/residence/castle/Castle.getDefaultTaxRate:()I
   #365 = NameAndType        #366:#121    // getDefaultTaxRate:()I
   #366 = Utf8               getDefaultTaxRate
   #367 = Methodref          #13.#368     // ext/mods/gameserver/model/residence/castle/Castle.getTaxRevenue:()J
   #368 = NameAndType        #369:#370    // getTaxRevenue:()J
   #369 = Utf8               getTaxRevenue
   #370 = Utf8               ()J
   #371 = Methodref          #13.#372     // ext/mods/gameserver/model/residence/castle/Castle.getSeedIncome:()J
   #372 = NameAndType        #373:#370    // getSeedIncome:()J
   #373 = Utf8               getSeedIncome
   #374 = Methodref          #13.#375     // ext/mods/gameserver/model/residence/castle/Castle.editTreasury:(JZ)Z
   #375 = NameAndType        #376:#377    // editTreasury:(JZ)Z
   #376 = Utf8               editTreasury
   #377 = Utf8               (JZ)Z
   #378 = Methodref          #13.#379     // ext/mods/gameserver/model/residence/castle/Castle.getNextTaxPercent:()I
   #379 = NameAndType        #380:#121    // getNextTaxPercent:()I
   #380 = Utf8               getNextTaxPercent
   #381 = Methodref          #13.#382     // ext/mods/gameserver/model/residence/castle/Castle.setCurrentTaxPercent:(IZ)V
   #382 = NameAndType        #383:#384    // setCurrentTaxPercent:(IZ)V
   #383 = Utf8               setCurrentTaxPercent
   #384 = Utf8               (IZ)V
   #385 = Methodref          #13.#386     // ext/mods/gameserver/model/residence/castle/Castle.getTreasury:()J
   #386 = NameAndType        #387:#370    // getTreasury:()J
   #387 = Utf8               getTreasury
   #388 = Methodref          #13.#389     // ext/mods/gameserver/model/residence/castle/Castle.getCurrentTaxPercent:()I
   #389 = NameAndType        #390:#121    // getCurrentTaxPercent:()I
   #390 = Utf8               getCurrentTaxPercent
   #391 = Methodref          #13.#392     // ext/mods/gameserver/model/residence/castle/Castle.getId:()I
   #392 = NameAndType        #393:#121    // getId:()I
   #393 = Utf8               getId
   #394 = InterfaceMethodref #296.#395    // java/sql/PreparedStatement.addBatch:()V
   #395 = NameAndType        #396:#11     // addBatch:()V
   #396 = Utf8               addBatch
   #397 = InterfaceMethodref #296.#398    // java/sql/PreparedStatement.executeBatch:()[I
   #398 = NameAndType        #399:#400    // executeBatch:()[I
   #399 = Utf8               executeBatch
   #400 = Utf8               ()[I
   #401 = String             #402         // Failed to update taxes for {}.
   #402 = Utf8               Failed to update taxes for {}.
   #403 = Class              #404         // java/lang/Object
   #404 = Utf8               java/lang/Object
   #405 = Methodref          #13.#187     // ext/mods/gameserver/model/residence/castle/Castle.getName:()Ljava/lang/String;
   #406 = Methodref          #327.#407    // ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
   #407 = NameAndType        #330:#408    // error:(Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
   #408 = Utf8               (Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
   #409 = Methodref          #13.#410     // ext/mods/gameserver/model/residence/castle/Castle.getCastleZone:()Lext/mods/gameserver/model/zone/type/CastleZone;
   #410 = NameAndType        #411:#412    // getCastleZone:()Lext/mods/gameserver/model/zone/type/CastleZone;
   #411 = Utf8               getCastleZone
   #412 = Utf8               ()Lext/mods/gameserver/model/zone/type/CastleZone;
   #413 = Methodref          #126.#414    // ext/mods/gameserver/model/zone/type/CastleZone.banishForeigners:(I)V
   #414 = NameAndType        #415:#22     // banishForeigners:(I)V
   #415 = Utf8               banishForeigners
   #416 = Methodref          #13.#417     // ext/mods/gameserver/model/residence/castle/Castle.getTeleZone:()Lext/mods/gameserver/model/zone/type/CastleTeleportZone;
   #417 = NameAndType        #418:#419    // getTeleZone:()Lext/mods/gameserver/model/zone/type/CastleTeleportZone;
   #418 = Utf8               getTeleZone
   #419 = Utf8               ()Lext/mods/gameserver/model/zone/type/CastleTeleportZone;
   #420 = Methodref          #135.#421    // ext/mods/gameserver/model/zone/type/CastleTeleportZone.oustAllPlayers:()V
   #421 = NameAndType        #422:#11     // oustAllPlayers:()V
   #422 = Utf8               oustAllPlayers
   #423 = Fieldref           #13.#424     // ext/mods/gameserver/model/residence/castle/Castle._leftCertificates:I
   #424 = NameAndType        #425:#75     // _leftCertificates:I
   #425 = Utf8               _leftCertificates
   #426 = String             #427         // UPDATE castle SET certificates=? WHERE id=?
   #427 = Utf8               UPDATE castle SET certificates=? WHERE id=?
   #428 = String             #429         // Couldn\'t update certificates amount.
   #429 = Utf8               Couldn\'t update certificates amount.
   #430 = Methodref          #186.#431    // ext/mods/gameserver/model/pledge/Clan.getClanId:()I
   #431 = NameAndType        #432:#121    // getClanId:()I
   #432 = Utf8               getClanId
   #433 = Methodref          #434.#435    // ext/mods/gameserver/data/sql/ClanTable.getInstance:()Lext/mods/gameserver/data/sql/ClanTable;
   #434 = Class              #436         // ext/mods/gameserver/data/sql/ClanTable
   #435 = NameAndType        #94:#437     // getInstance:()Lext/mods/gameserver/data/sql/ClanTable;
   #436 = Utf8               ext/mods/gameserver/data/sql/ClanTable
   #437 = Utf8               ()Lext/mods/gameserver/data/sql/ClanTable;
   #438 = Methodref          #434.#439    // ext/mods/gameserver/data/sql/ClanTable.getClan:(I)Lext/mods/gameserver/model/pledge/Clan;
   #439 = NameAndType        #440:#441    // getClan:(I)Lext/mods/gameserver/model/pledge/Clan;
   #440 = Utf8               getClan
   #441 = Utf8               (I)Lext/mods/gameserver/model/pledge/Clan;
   #442 = Methodref          #225.#443    // ext/mods/gameserver/model/actor/Player.getMountType:()I
   #443 = NameAndType        #444:#121    // getMountType:()I
   #444 = Utf8               getMountType
   #445 = Methodref          #225.#446    // ext/mods/gameserver/model/actor/Player.dismount:()V
   #446 = NameAndType        #447:#11     // dismount:()V
   #447 = Utf8               dismount
   #448 = Methodref          #186.#449    // ext/mods/gameserver/model/pledge/Clan.setCastle:(I)V
   #449 = NameAndType        #450:#22     // setCastle:(I)V
   #450 = Utf8               setCastle
   #451 = Methodref          #13.#452     // ext/mods/gameserver/model/residence/castle/Castle.updateOwnerInDB:(Lext/mods/gameserver/model/pledge/Clan;)V
   #452 = NameAndType        #453:#213    // updateOwnerInDB:(Lext/mods/gameserver/model/pledge/Clan;)V
   #453 = Utf8               updateOwnerInDB
   #454 = Methodref          #205.#455    // ext/mods/gameserver/model/residence/castle/Siege.isInProgress:()Z
   #455 = NameAndType        #456:#113    // isInProgress:()Z
   #456 = Utf8               isInProgress
   #457 = Methodref          #205.#458    // ext/mods/gameserver/model/residence/castle/Siege.midVictory:()V
   #458 = NameAndType        #459:#11     // midVictory:()V
   #459 = Utf8               midVictory
   #460 = Class              #461         // ext/mods/gameserver/network/serverpackets/L2GameServerPacket
   #461 = Utf8               ext/mods/gameserver/network/serverpackets/L2GameServerPacket
   #462 = Class              #463         // ext/mods/gameserver/network/serverpackets/PledgeShowInfoUpdate
   #463 = Utf8               ext/mods/gameserver/network/serverpackets/PledgeShowInfoUpdate
   #464 = Methodref          #462.#465    // ext/mods/gameserver/network/serverpackets/PledgeShowInfoUpdate."<init>":(Lext/mods/gameserver/model/pledge/Clan;)V
   #465 = NameAndType        #5:#213      // "<init>":(Lext/mods/gameserver/model/pledge/Clan;)V
   #466 = Methodref          #186.#467    // ext/mods/gameserver/model/pledge/Clan.broadcastToMembers:([Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #467 = NameAndType        #468:#469    // broadcastToMembers:([Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #468 = Utf8               broadcastToMembers
   #469 = Utf8               ([Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #470 = Methodref          #205.#471    // ext/mods/gameserver/model/residence/castle/Siege.getRegisteredClans:()Ljava/util/Map;
   #471 = NameAndType        #472:#473    // getRegisteredClans:()Ljava/util/Map;
   #472 = Utf8               getRegisteredClans
   #473 = Utf8               ()Ljava/util/Map;
   #474 = InterfaceMethodref #154.#475    // java/util/Map.remove:(Ljava/lang/Object;)Ljava/lang/Object;
   #475 = NameAndType        #476:#162    // remove:(Ljava/lang/Object;)Ljava/lang/Object;
   #476 = Utf8               remove
   #477 = InterfaceMethodref #478.#104    // java/util/Set.iterator:()Ljava/util/Iterator;
   #478 = Class              #479         // java/util/Set
   #479 = Utf8               java/util/Set
   #480 = Class              #481         // ext/mods/gameserver/model/item/instance/ItemInstance
   #481 = Utf8               ext/mods/gameserver/model/item/instance/ItemInstance
   #482 = Methodref          #480.#483    // ext/mods/gameserver/model/item/instance/ItemInstance.decayMe:()V
   #483 = NameAndType        #484:#11     // decayMe:()V
   #484 = Utf8               decayMe
   #485 = InterfaceMethodref #478.#486    // java/util/Set.clear:()V
   #486 = NameAndType        #487:#11     // clear:()V
   #487 = Utf8               clear
   #488 = Methodref          #186.#489    // ext/mods/gameserver/model/pledge/Clan.getOnlineMembers:()[Lext/mods/gameserver/model/actor/Player;
   #489 = NameAndType        #490:#491    // getOnlineMembers:()[Lext/mods/gameserver/model/actor/Player;
   #490 = Utf8               getOnlineMembers
   #491 = Utf8               ()[Lext/mods/gameserver/model/actor/Player;
   #492 = Methodref          #225.#493    // ext/mods/gameserver/model/actor/Player.isClanLeader:()Z
   #493 = NameAndType        #494:#113    // isClanLeader:()Z
   #494 = Utf8               isClanLeader
   #495 = Methodref          #13.#496     // ext/mods/gameserver/model/residence/castle/Castle.getSkillsLeader:()Ljava/util/Map;
   #496 = NameAndType        #497:#473    // getSkillsLeader:()Ljava/util/Map;
   #497 = Utf8               getSkillsLeader
   #498 = Methodref          #13.#499     // ext/mods/gameserver/model/residence/castle/Castle.getSkillsMember:()Ljava/util/Map;
   #499 = NameAndType        #500:#473    // getSkillsMember:()Ljava/util/Map;
   #500 = Utf8               getSkillsMember
   #501 = InvokeDynamic      #0:#502      // #0:accept:(Lext/mods/gameserver/model/residence/castle/Castle;Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/BiConsumer;
   #502 = NameAndType        #503:#504    // accept:(Lext/mods/gameserver/model/residence/castle/Castle;Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/BiConsumer;
   #503 = Utf8               accept
   #504 = Utf8               (Lext/mods/gameserver/model/residence/castle/Castle;Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/BiConsumer;
   #505 = InterfaceMethodref #154.#506    // java/util/Map.forEach:(Ljava/util/function/BiConsumer;)V
   #506 = NameAndType        #507:#508    // forEach:(Ljava/util/function/BiConsumer;)V
   #507 = Utf8               forEach
   #508 = Utf8               (Ljava/util/function/BiConsumer;)V
   #509 = InvokeDynamic      #1:#510      // #1:accept:()Ljava/util/function/Consumer;
   #510 = NameAndType        #503:#511    // accept:()Ljava/util/function/Consumer;
   #511 = Utf8               ()Ljava/util/function/Consumer;
   #512 = InterfaceMethodref #513.#514    // java/util/List.forEach:(Ljava/util/function/Consumer;)V
   #513 = Class              #515         // java/util/List
   #514 = NameAndType        #507:#516    // forEach:(Ljava/util/function/Consumer;)V
   #515 = Utf8               java/util/List
   #516 = Utf8               (Ljava/util/function/Consumer;)V
   #517 = InterfaceMethodref #513.#486    // java/util/List.clear:()V
   #518 = Methodref          #13.#519     // ext/mods/gameserver/model/residence/castle/Castle.checkItemsForClan:(Lext/mods/gameserver/model/pledge/Clan;)V
   #519 = NameAndType        #520:#213    // checkItemsForClan:(Lext/mods/gameserver/model/pledge/Clan;)V
   #520 = Utf8               checkItemsForClan
   #521 = Fieldref           #13.#522     // ext/mods/gameserver/model/residence/castle/Castle._currentTaxPercent:I
   #522 = NameAndType        #523:#75     // _currentTaxPercent:I
   #523 = Utf8               _currentTaxPercent
   #524 = Fieldref           #13.#525     // ext/mods/gameserver/model/residence/castle/Castle._taxRate:D
   #525 = NameAndType        #526:#527    // _taxRate:D
   #526 = Utf8               _taxRate
   #527 = Utf8               D
   #528 = String             #529         // UPDATE castle SET currentTaxPercent=? WHERE id=?
   #529 = Utf8               UPDATE castle SET currentTaxPercent=? WHERE id=?
   #530 = String             #531         // Couldn\'t update tax amount.
   #531 = Utf8               Couldn\'t update tax amount.
   #532 = Fieldref           #13.#533     // ext/mods/gameserver/model/residence/castle/Castle._nextTaxPercent:I
   #533 = NameAndType        #534:#75     // _nextTaxPercent:I
   #534 = Utf8               _nextTaxPercent
   #535 = String             #536         // UPDATE castle SET nextTaxPercent=? WHERE id=?
   #536 = Utf8               UPDATE castle SET nextTaxPercent=? WHERE id=?
   #537 = Fieldref           #13.#538     // ext/mods/gameserver/model/residence/castle/Castle._doors:Ljava/util/List;
   #538 = NameAndType        #539:#26     // _doors:Ljava/util/List;
   #539 = Utf8               _doors
   #540 = InterfaceMethodref #513.#104    // java/util/List.iterator:()Ljava/util/Iterator;
   #541 = Class              #542         // ext/mods/gameserver/model/actor/instance/Door
   #542 = Utf8               ext/mods/gameserver/model/actor/instance/Door
   #543 = Methodref          #541.#544    // ext/mods/gameserver/model/actor/instance/Door.isDead:()Z
   #544 = NameAndType        #545:#113    // isDead:()Z
   #545 = Utf8               isDead
   #546 = Methodref          #541.#547    // ext/mods/gameserver/model/actor/instance/Door.doRevive:()V
   #547 = NameAndType        #548:#11     // doRevive:()V
   #548 = Utf8               doRevive
   #549 = Methodref          #541.#550    // ext/mods/gameserver/model/actor/instance/Door.closeMe:()V
   #550 = NameAndType        #551:#11     // closeMe:()V
   #551 = Utf8               closeMe
   #552 = Methodref          #541.#553    // ext/mods/gameserver/model/actor/instance/Door.getStatus:()Lext/mods/gameserver/model/actor/status/DoorStatus;
   #553 = NameAndType        #554:#555    // getStatus:()Lext/mods/gameserver/model/actor/status/DoorStatus;
   #554 = Utf8               getStatus
   #555 = Utf8               ()Lext/mods/gameserver/model/actor/status/DoorStatus;
   #556 = Methodref          #557.#558    // ext/mods/gameserver/model/actor/status/DoorStatus.getMaxHp:()I
   #557 = Class              #559         // ext/mods/gameserver/model/actor/status/DoorStatus
   #558 = NameAndType        #560:#121    // getMaxHp:()I
   #559 = Utf8               ext/mods/gameserver/model/actor/status/DoorStatus
   #560 = Utf8               getMaxHp
   #561 = Methodref          #557.#562    // ext/mods/gameserver/model/actor/status/DoorStatus.setHp:(D)V
   #562 = NameAndType        #563:#564    // setHp:(D)V
   #563 = Utf8               setHp
   #564 = Utf8               (D)V
   #565 = Methodref          #13.#566     // ext/mods/gameserver/model/residence/castle/Castle.getDoor:(I)Lext/mods/gameserver/model/actor/instance/Door;
   #566 = NameAndType        #567:#568    // getDoor:(I)Lext/mods/gameserver/model/actor/instance/Door;
   #567 = Utf8               getDoor
   #568 = Utf8               (I)Lext/mods/gameserver/model/actor/instance/Door;
   #569 = Methodref          #557.#570    // ext/mods/gameserver/model/actor/status/DoorStatus.setUpgradeHpRatio:(I)V
   #570 = NameAndType        #571:#22     // setUpgradeHpRatio:(I)V
   #571 = Utf8               setUpgradeHpRatio
   #572 = Methodref          #557.#573    // ext/mods/gameserver/model/actor/status/DoorStatus.setMaxHp:()V
   #573 = NameAndType        #574:#11     // setMaxHp:()V
   #574 = Utf8               setMaxHp
   #575 = String             #576         // REPLACE INTO castle_doorupgrade (doorId,hp,castleId) VALUES (?,?,?)
   #576 = Utf8               REPLACE INTO castle_doorupgrade (doorId,hp,castleId) VALUES (?,?,?)
   #577 = InterfaceMethodref #296.#578    // java/sql/PreparedStatement.execute:()Z
   #578 = NameAndType        #579:#113    // execute:()Z
   #579 = Utf8               execute
   #580 = String             #581         // Couldn\'t upgrade castle doors.
   #581 = Utf8               Couldn\'t upgrade castle doors.
   #582 = String             #583         // DELETE FROM castle_doorupgrade WHERE castleId=?
   #583 = Utf8               DELETE FROM castle_doorupgrade WHERE castleId=?
   #584 = String             #585         // Couldn\'t delete door upgrade.
   #585 = Utf8               Couldn\'t delete door upgrade.
   #586 = Class              #587         // ext/mods/gameserver/network/serverpackets/PlaySound
   #587 = Utf8               ext/mods/gameserver/network/serverpackets/PlaySound
   #588 = String             #589         // Siege_Victory
   #589 = Utf8               Siege_Victory
   #590 = Methodref          #586.#591    // ext/mods/gameserver/network/serverpackets/PlaySound."<init>":(ILjava/lang/String;)V
   #591 = NameAndType        #5:#592      // "<init>":(ILjava/lang/String;)V
   #592 = Utf8               (ILjava/lang/String;)V
   #593 = Methodref          #594.#595    // ext/mods/gameserver/data/manager/CastleManorManager.getInstance:()Lext/mods/gameserver/data/manager/CastleManorManager;
   #594 = Class              #596         // ext/mods/gameserver/data/manager/CastleManorManager
   #595 = NameAndType        #94:#597     // getInstance:()Lext/mods/gameserver/data/manager/CastleManorManager;
   #596 = Utf8               ext/mods/gameserver/data/manager/CastleManorManager
   #597 = Utf8               ()Lext/mods/gameserver/data/manager/CastleManorManager;
   #598 = Methodref          #594.#599    // ext/mods/gameserver/data/manager/CastleManorManager.resetManorData:(I)V
   #599 = NameAndType        #600:#22     // resetManorData:(I)V
   #600 = Utf8               resetManorData
   #601 = Methodref          #13.#602     // ext/mods/gameserver/model/residence/castle/Castle.setNextTaxPercent:(IZ)V
   #602 = NameAndType        #603:#384    // setNextTaxPercent:(IZ)V
   #603 = Utf8               setNextTaxPercent
   #604 = String             #605         // Couldn\'t reset financial vars.
   #605 = Utf8               Couldn\'t reset financial vars.
   #606 = String             #607         // UPDATE clan_data SET hasCastle=0 WHERE hasCastle=?
   #607 = Utf8               UPDATE clan_data SET hasCastle=0 WHERE hasCastle=?
   #608 = String             #609         // UPDATE clan_data SET hasCastle=? WHERE clan_id=?
   #609 = Utf8               UPDATE clan_data SET hasCastle=? WHERE clan_id=?
   #610 = String             #611         // Couldn\'t update castle owner.
   #611 = Utf8               Couldn\'t update castle owner.
   #612 = InterfaceMethodref #513.#613    // java/util/List.stream:()Ljava/util/stream/Stream;
   #613 = NameAndType        #614:#615    // stream:()Ljava/util/stream/Stream;
   #614 = Utf8               stream
   #615 = Utf8               ()Ljava/util/stream/Stream;
   #616 = InvokeDynamic      #2:#617      // #2:test:(I)Ljava/util/function/Predicate;
   #617 = NameAndType        #618:#619    // test:(I)Ljava/util/function/Predicate;
   #618 = Utf8               test
   #619 = Utf8               (I)Ljava/util/function/Predicate;
   #620 = InterfaceMethodref #621.#622    // java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
   #621 = Class              #623         // java/util/stream/Stream
   #622 = NameAndType        #624:#625    // filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
   #623 = Utf8               java/util/stream/Stream
   #624 = Utf8               filter
   #625 = Utf8               (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
   #626 = InterfaceMethodref #621.#627    // java/util/stream/Stream.findFirst:()Ljava/util/Optional;
   #627 = NameAndType        #628:#629    // findFirst:()Ljava/util/Optional;
   #628 = Utf8               findFirst
   #629 = Utf8               ()Ljava/util/Optional;
   #630 = Methodref          #631.#632    // java/util/Optional.orElse:(Ljava/lang/Object;)Ljava/lang/Object;
   #631 = Class              #633         // java/util/Optional
   #632 = NameAndType        #634:#162    // orElse:(Ljava/lang/Object;)Ljava/lang/Object;
   #633 = Utf8               java/util/Optional
   #634 = Utf8               orElse
   #635 = Class              #636         // ext/mods/gameserver/model/item/MercenaryTicket
   #636 = Utf8               ext/mods/gameserver/model/item/MercenaryTicket
   #637 = Methodref          #635.#3      // ext/mods/gameserver/model/item/MercenaryTicket."<init>":(Lext/mods/commons/data/StatSet;)V
   #638 = InterfaceMethodref #513.#639    // java/util/List.add:(Ljava/lang/Object;)Z
   #639 = NameAndType        #640:#158    // add:(Ljava/lang/Object;)Z
   #640 = Utf8               add
   #641 = InterfaceMethodref #478.#639    // java/util/Set.add:(Ljava/lang/Object;)Z
   #642 = InterfaceMethodref #478.#643    // java/util/Set.remove:(Ljava/lang/Object;)Z
   #643 = NameAndType        #476:#158    // remove:(Ljava/lang/Object;)Z
   #644 = InterfaceMethodref #478.#613    // java/util/Set.stream:()Ljava/util/stream/Stream;
   #645 = InvokeDynamic      #3:#617      // #3:test:(I)Ljava/util/function/Predicate;
   #646 = InterfaceMethodref #621.#647    // java/util/stream/Stream.count:()J
   #647 = NameAndType        #648:#370    // count:()J
   #648 = Utf8               count
   #649 = InvokeDynamic      #4:#650      // #4:test:(III)Ljava/util/function/Predicate;
   #650 = NameAndType        #618:#651    // test:(III)Ljava/util/function/Predicate;
   #651 = Utf8               (III)Ljava/util/function/Predicate;
   #652 = InterfaceMethodref #621.#653    // java/util/stream/Stream.anyMatch:(Ljava/util/function/Predicate;)Z
   #653 = NameAndType        #654:#655    // anyMatch:(Ljava/util/function/Predicate;)Z
   #654 = Utf8               anyMatch
   #655 = Utf8               (Ljava/util/function/Predicate;)Z
   #656 = Methodref          #657.#658    // ext/mods/gameserver/data/manager/SpawnManager.getInstance:()Lext/mods/gameserver/data/manager/SpawnManager;
   #657 = Class              #659         // ext/mods/gameserver/data/manager/SpawnManager
   #658 = NameAndType        #94:#660     // getInstance:()Lext/mods/gameserver/data/manager/SpawnManager;
   #659 = Utf8               ext/mods/gameserver/data/manager/SpawnManager
   #660 = Utf8               ()Lext/mods/gameserver/data/manager/SpawnManager;
   #661 = String             #662         // pc_siege_warfare_start
   #662 = Utf8               pc_siege_warfare_start
   #663 = Methodref          #664.#665    // java/lang/String.valueOf:(I)Ljava/lang/String;
   #664 = Class              #666         // java/lang/String
   #665 = NameAndType        #151:#85     // valueOf:(I)Ljava/lang/String;
   #666 = Utf8               java/lang/String
   #667 = Methodref          #657.#668    // ext/mods/gameserver/data/manager/SpawnManager.startSpawnTime:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)J
   #668 = NameAndType        #669:#670    // startSpawnTime:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)J
   #669 = Utf8               startSpawnTime
   #670 = Utf8               (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)J
   #671 = Methodref          #480.#672    // ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
   #672 = NameAndType        #673:#121    // getItemId:()I
   #673 = Utf8               getItemId
   #674 = Methodref          #13.#675     // ext/mods/gameserver/model/residence/castle/Castle.getTicket:(I)Lext/mods/gameserver/model/item/MercenaryTicket;
   #675 = NameAndType        #676:#677    // getTicket:(I)Lext/mods/gameserver/model/item/MercenaryTicket;
   #676 = Utf8               getTicket
   #677 = Utf8               (I)Lext/mods/gameserver/model/item/MercenaryTicket;
   #678 = Class              #679         // ext/mods/gameserver/model/spawn/Spawn
   #679 = Utf8               ext/mods/gameserver/model/spawn/Spawn
   #680 = Methodref          #635.#681    // ext/mods/gameserver/model/item/MercenaryTicket.getNpcId:()I
   #681 = NameAndType        #682:#121    // getNpcId:()I
   #682 = Utf8               getNpcId
   #683 = Methodref          #678.#21     // ext/mods/gameserver/model/spawn/Spawn."<init>":(I)V
   #684 = Methodref          #480.#685    // ext/mods/gameserver/model/item/instance/ItemInstance.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
   #685 = NameAndType        #686:#687    // getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
   #686 = Utf8               getPosition
   #687 = Utf8               ()Lext/mods/gameserver/model/location/SpawnLocation;
   #688 = Methodref          #678.#689    // ext/mods/gameserver/model/spawn/Spawn.setLoc:(Lext/mods/gameserver/model/location/SpawnLocation;)V
   #689 = NameAndType        #690:#691    // setLoc:(Lext/mods/gameserver/model/location/SpawnLocation;)V
   #690 = Utf8               setLoc
   #691 = Utf8               (Lext/mods/gameserver/model/location/SpawnLocation;)V
   #692 = Methodref          #678.#693    // ext/mods/gameserver/model/spawn/Spawn.doSpawn:(Z)Lext/mods/gameserver/model/actor/Npc;
   #693 = NameAndType        #694:#695    // doSpawn:(Z)Lext/mods/gameserver/model/actor/Npc;
   #694 = Utf8               doSpawn
   #695 = Utf8               (Z)Lext/mods/gameserver/model/actor/Npc;
   #696 = Methodref          #697.#698    // ext/mods/gameserver/model/actor/Npc.setResidence:(Lext/mods/gameserver/model/residence/Residence;)V
   #697 = Class              #699         // ext/mods/gameserver/model/actor/Npc
   #698 = NameAndType        #700:#701    // setResidence:(Lext/mods/gameserver/model/residence/Residence;)V
   #699 = Utf8               ext/mods/gameserver/model/actor/Npc
   #700 = Utf8               setResidence
   #701 = Utf8               (Lext/mods/gameserver/model/residence/Residence;)V
   #702 = String             #703         // Couldn\'t spawn npc ticket {}.
   #703 = Utf8               Couldn\'t spawn npc ticket {}.
   #704 = String             #705         // siege_warfare_start
   #705 = Utf8               siege_warfare_start
   #706 = InvokeDynamic      #5:#510      // #5:accept:()Ljava/util/function/Consumer;
   #707 = Methodref          #657.#708    // ext/mods/gameserver/data/manager/SpawnManager.stopSpawnTime:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)J
   #708 = NameAndType        #709:#670    // stopSpawnTime:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)J
   #709 = Utf8               stopSpawnTime
   #710 = InvokeDynamic      #6:#711      // #6:test:(Lext/mods/gameserver/model/residence/castle/Castle;)Ljava/util/function/Predicate;
   #711 = NameAndType        #618:#712    // test:(Lext/mods/gameserver/model/residence/castle/Castle;)Ljava/util/function/Predicate;
   #712 = Utf8               (Lext/mods/gameserver/model/residence/castle/Castle;)Ljava/util/function/Predicate;
   #713 = Fieldref           #13.#714     // ext/mods/gameserver/model/residence/castle/Castle._siege:Lext/mods/gameserver/model/residence/castle/Siege;
   #714 = NameAndType        #715:#716    // _siege:Lext/mods/gameserver/model/residence/castle/Siege;
   #715 = Utf8               _siege
   #716 = Utf8               Lext/mods/gameserver/model/residence/castle/Siege;
   #717 = Methodref          #205.#718    // ext/mods/gameserver/model/residence/castle/Siege."<init>":(Lext/mods/gameserver/model/residence/castle/Castle;)V
   #718 = NameAndType        #5:#719      // "<init>":(Lext/mods/gameserver/model/residence/castle/Castle;)V
   #719 = Utf8               (Lext/mods/gameserver/model/residence/castle/Castle;)V
   #720 = Fieldref           #13.#721     // ext/mods/gameserver/model/residence/castle/Castle._siegeDate:Ljava/util/Calendar;
   #721 = NameAndType        #722:#723    // _siegeDate:Ljava/util/Calendar;
   #722 = Utf8               _siegeDate
   #723 = Utf8               Ljava/util/Calendar;
   #724 = Class              #725         // ext/mods/gameserver/model/actor/instance/HolyThing
   #725 = Utf8               ext/mods/gameserver/model/actor/instance/HolyThing
   #726 = Methodref          #724.#681    // ext/mods/gameserver/model/actor/instance/HolyThing.getNpcId:()I
   #727 = InterfaceMethodref #513.#728    // java/util/List.get:(I)Ljava/lang/Object;
   #728 = NameAndType        #161:#729    // get:(I)Ljava/lang/Object;
   #729 = Utf8               (I)Ljava/lang/Object;
   #730 = Class              #731         // ext/mods/gameserver/model/location/TowerSpawnLocation
   #731 = Utf8               ext/mods/gameserver/model/location/TowerSpawnLocation
   #732 = Methodref          #730.#733    // ext/mods/gameserver/model/location/TowerSpawnLocation.getUpgradeLevel:()I
   #733 = NameAndType        #734:#121    // getUpgradeLevel:()I
   #734 = Utf8               getUpgradeLevel
   #735 = String             #736         // REPLACE INTO castle_trapupgrade (castleId, towerIndex, level) VALUES (?,?,?)
   #736 = Utf8               REPLACE INTO castle_trapupgrade (castleId, towerIndex, level) VALUES (?,?,?)
   #737 = String             #738         // Couldn\'t replace trap upgrade.
   #738 = Utf8               Couldn\'t replace trap upgrade.
   #739 = Methodref          #730.#740    // ext/mods/gameserver/model/location/TowerSpawnLocation.setUpgradeLevel:(I)V
   #740 = NameAndType        #741:#22     // setUpgradeLevel:(I)V
   #741 = Utf8               setUpgradeLevel
   #742 = String             #743         // DELETE FROM castle_trapupgrade WHERE castleId=?
   #743 = Utf8               DELETE FROM castle_trapupgrade WHERE castleId=?
   #744 = String             #745         // Couldn\'t delete trap upgrade.
   #745 = Utf8               Couldn\'t delete trap upgrade.
   #746 = Methodref          #225.#747    // ext/mods/gameserver/model/actor/Player.checkItemRestriction:()V
   #747 = NameAndType        #748:#11     // checkItemRestriction:()V
   #748 = Utf8               checkItemRestriction
   #749 = String             #750         // UPDATE items SET loc=\'INVENTORY\' WHERE item_id IN (?,6841) AND owner_id=? AND loc=\'PAPERDOLL\'
   #750 = Utf8               UPDATE items SET loc=\'INVENTORY\' WHERE item_id IN (?,6841) AND owner_id=? AND loc=\'PAPERDOLL\'
   #751 = Methodref          #219.#752    // ext/mods/gameserver/model/pledge/ClanMember.getObjectId:()I
   #752 = NameAndType        #753:#121    // getObjectId:()I
   #753 = Utf8               getObjectId
   #754 = String             #755         // Couldn\'t update items for member.
   #755 = Utf8               Couldn\'t update items for member.
   #756 = Methodref          #186.#757    // ext/mods/gameserver/model/pledge/Clan.getMembers:()Ljava/util/Collection;
   #757 = NameAndType        #758:#759    // getMembers:()Ljava/util/Collection;
   #758 = Utf8               getMembers
   #759 = Utf8               ()Ljava/util/Collection;
   #760 = String             #761         // Couldn\'t update items for clan.
   #761 = Utf8               Couldn\'t update items for clan.
   #762 = String             #763         // SELECT * FROM castle_functions WHERE castle_id = ?
   #763 = Utf8               SELECT * FROM castle_functions WHERE castle_id = ?
   #764 = InterfaceMethodref #296.#765    // java/sql/PreparedStatement.executeQuery:()Ljava/sql/ResultSet;
   #765 = NameAndType        #766:#767    // executeQuery:()Ljava/sql/ResultSet;
   #766 = Utf8               executeQuery
   #767 = Utf8               ()Ljava/sql/ResultSet;
   #768 = InterfaceMethodref #769.#770    // java/sql/ResultSet.next:()Z
   #769 = Class              #771         // java/sql/ResultSet
   #770 = NameAndType        #116:#113    // next:()Z
   #771 = Utf8               java/sql/ResultSet
   #772 = String             #773         // type
   #773 = Utf8               type
   #774 = InterfaceMethodref #769.#775    // java/sql/ResultSet.getInt:(Ljava/lang/String;)I
   #775 = NameAndType        #776:#71     // getInt:(Ljava/lang/String;)I
   #776 = Utf8               getInt
   #777 = String             #778         // lvl
   #778 = Utf8               lvl
   #779 = String             #780         // lease
   #780 = Utf8               lease
   #781 = String             #782         // rate
   #782 = Utf8               rate
   #783 = InterfaceMethodref #769.#784    // java/sql/ResultSet.getLong:(Ljava/lang/String;)J
   #784 = NameAndType        #785:#786    // getLong:(Ljava/lang/String;)J
   #785 = Utf8               getLong
   #786 = Utf8               (Ljava/lang/String;)J
   #787 = String             #788         // endTime
   #788 = Utf8               endTime
   #789 = Methodref          #163.#790    // ext/mods/gameserver/model/residence/castle/Castle$CastleFunction."<init>":(Lext/mods/gameserver/model/residence/castle/Castle;IIIIJJZ)V
   #790 = NameAndType        #5:#791      // "<init>":(Lext/mods/gameserver/model/residence/castle/Castle;IIIIJJZ)V
   #791 = Utf8               (Lext/mods/gameserver/model/residence/castle/Castle;IIIIJJZ)V
   #792 = InterfaceMethodref #154.#793    // java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #793 = NameAndType        #794:#795    // put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #794 = Utf8               put
   #795 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #796 = InterfaceMethodref #769.#309    // java/sql/ResultSet.close:()V
   #797 = InterfaceMethodref #296.#798    // java/sql/PreparedStatement.clearParameters:()V
   #798 = NameAndType        #799:#11     // clearParameters:()V
   #799 = Utf8               clearParameters
   #800 = Methodref          #318.#801    // java/lang/Exception.getMessage:()Ljava/lang/String;
   #801 = NameAndType        #802:#190    // getMessage:()Ljava/lang/String;
   #802 = Utf8               getMessage
   #803 = InvokeDynamic      #7:#804      // #7:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #804 = NameAndType        #805:#806    // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #805 = Utf8               makeConcatWithConstants
   #806 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
   #807 = String             #808         // DELETE FROM castle_functions WHERE castle_id=? AND type=?
   #808 = Utf8               DELETE FROM castle_functions WHERE castle_id=? AND type=?
   #809 = Methodref          #13.#810     // ext/mods/gameserver/model/residence/castle/Castle.getOwnerId:()I
   #810 = NameAndType        #811:#121    // getOwnerId:()I
   #811 = Utf8               getOwnerId
   #812 = InvokeDynamic      #8:#804      // #8:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #813 = Class              #814         // ext/mods/gameserver/model/itemcontainer/PcInventory
   #814 = Utf8               ext/mods/gameserver/model/itemcontainer/PcInventory
   #815 = Methodref          #225.#816    // ext/mods/gameserver/model/actor/Player.destroyItemByItemId:(IIZ)Z
   #816 = NameAndType        #817:#818    // destroyItemByItemId:(IIZ)Z
   #817 = Utf8               destroyItemByItemId
   #818 = Utf8               (IIZ)Z
   #819 = Methodref          #13.#820     // ext/mods/gameserver/model/residence/castle/Castle.removeFunction:(I)V
   #820 = NameAndType        #821:#22     // removeFunction:(I)V
   #821 = Utf8               removeFunction
   #822 = Methodref          #163.#823    // ext/mods/gameserver/model/residence/castle/Castle$CastleFunction.getLease:()I
   #823 = NameAndType        #824:#121    // getLease:()I
   #824 = Utf8               getLease
   #825 = Long               -1l
   #827 = Methodref          #163.#828    // ext/mods/gameserver/model/residence/castle/Castle$CastleFunction.setLease:(I)V
   #828 = NameAndType        #829:#22     // setLease:(I)V
   #829 = Utf8               setLease
   #830 = Methodref          #163.#831    // ext/mods/gameserver/model/residence/castle/Castle$CastleFunction.setLvl:(I)V
   #831 = NameAndType        #832:#22     // setLvl:(I)V
   #832 = Utf8               setLvl
   #833 = Methodref          #163.#834    // ext/mods/gameserver/model/residence/castle/Castle$CastleFunction.dbSave:()V
   #834 = NameAndType        #835:#11     // dbSave:()V
   #835 = Utf8               dbSave
   #836 = Methodref          #730.#837    // ext/mods/gameserver/model/location/TowerSpawnLocation.getType:()Lext/mods/gameserver/enums/actors/TowerType;
   #837 = NameAndType        #838:#839    // getType:()Lext/mods/gameserver/enums/actors/TowerType;
   #838 = Utf8               getType
   #839 = Utf8               ()Lext/mods/gameserver/enums/actors/TowerType;
   #840 = Fieldref           #841.#842    // ext/mods/gameserver/enums/actors/TowerType.LIFE_CONTROL:Lext/mods/gameserver/enums/actors/TowerType;
   #841 = Class              #843         // ext/mods/gameserver/enums/actors/TowerType
   #842 = NameAndType        #844:#845    // LIFE_CONTROL:Lext/mods/gameserver/enums/actors/TowerType;
   #843 = Utf8               ext/mods/gameserver/enums/actors/TowerType
   #844 = Utf8               LIFE_CONTROL
   #845 = Utf8               Lext/mods/gameserver/enums/actors/TowerType;
   #846 = Methodref          #730.#847    // ext/mods/gameserver/model/location/TowerSpawnLocation.getNpc:()Lext/mods/gameserver/model/actor/Npc;
   #847 = NameAndType        #848:#849    // getNpc:()Lext/mods/gameserver/model/actor/Npc;
   #848 = Utf8               getNpc
   #849 = Utf8               ()Lext/mods/gameserver/model/actor/Npc;
   #850 = Methodref          #697.#851    // ext/mods/gameserver/model/actor/Npc.getPolymorphTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
   #851 = NameAndType        #852:#853    // getPolymorphTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
   #852 = Utf8               getPolymorphTemplate
   #853 = Utf8               ()Lext/mods/gameserver/model/actor/template/NpcTemplate;
   #854 = Methodref          #480.#855    // ext/mods/gameserver/model/item/instance/ItemInstance.isIn3DRadius:(IIII)Z
   #855 = NameAndType        #856:#857    // isIn3DRadius:(IIII)Z
   #856 = Utf8               isIn3DRadius
   #857 = Utf8               (IIII)Z
   #858 = Methodref          #635.#672    // ext/mods/gameserver/model/item/MercenaryTicket.getItemId:()I
   #859 = Methodref          #697.#860    // ext/mods/gameserver/model/actor/Npc.doDie:(Lext/mods/gameserver/model/actor/Creature;)Z
   #860 = NameAndType        #861:#862    // doDie:(Lext/mods/gameserver/model/actor/Creature;)Z
   #861 = Utf8               doDie
   #862 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)Z
   #863 = Methodref          #225.#864    // ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
   #864 = NameAndType        #440:#865    // getClan:()Lext/mods/gameserver/model/pledge/Clan;
   #865 = Utf8               ()Lext/mods/gameserver/model/pledge/Clan;
   #866 = Methodref          #186.#138    // ext/mods/gameserver/model/pledge/Clan.getCastleId:()I
   #867 = Methodref          #868.#869    // ext/mods/gameserver/data/SkillTable.getInstance:()Lext/mods/gameserver/data/SkillTable;
   #868 = Class              #870         // ext/mods/gameserver/data/SkillTable
   #869 = NameAndType        #94:#871     // getInstance:()Lext/mods/gameserver/data/SkillTable;
   #870 = Utf8               ext/mods/gameserver/data/SkillTable
   #871 = Utf8               ()Lext/mods/gameserver/data/SkillTable;
   #872 = Methodref          #148.#873    // java/lang/Integer.intValue:()I
   #873 = NameAndType        #874:#121    // intValue:()I
   #874 = Utf8               intValue
   #875 = Methodref          #868.#876    // ext/mods/gameserver/data/SkillTable.getInfo:(II)Lext/mods/gameserver/skills/L2Skill;
   #876 = NameAndType        #877:#878    // getInfo:(II)Lext/mods/gameserver/skills/L2Skill;
   #877 = Utf8               getInfo
   #878 = Utf8               (II)Lext/mods/gameserver/skills/L2Skill;
   #879 = Methodref          #225.#880    // ext/mods/gameserver/model/actor/Player.addSkill:(Lext/mods/gameserver/skills/L2Skill;Z)Z
   #880 = NameAndType        #881:#882    // addSkill:(Lext/mods/gameserver/skills/L2Skill;Z)Z
   #881 = Utf8               addSkill
   #882 = Utf8               (Lext/mods/gameserver/skills/L2Skill;Z)Z
   #883 = Methodref          #225.#884    // ext/mods/gameserver/model/actor/Player.removeSkill:(IZ)Lext/mods/gameserver/skills/L2Skill;
   #884 = NameAndType        #885:#886    // removeSkill:(IZ)Lext/mods/gameserver/skills/L2Skill;
   #885 = Utf8               removeSkill
   #886 = Utf8               (IZ)Lext/mods/gameserver/skills/L2Skill;
   #887 = Methodref          #888.#187    // java/lang/Class.getName:()Ljava/lang/String;
   #888 = Class              #889         // java/lang/Class
   #889 = Utf8               java/lang/Class
   #890 = Methodref          #327.#891    // ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
   #891 = NameAndType        #5:#892      // "<init>":(Ljava/lang/String;)V
   #892 = Utf8               (Ljava/lang/String;)V
   #893 = Utf8               UPDATE_TAXES
   #894 = Utf8               ConstantValue
   #895 = Utf8               UPDATE_TREASURY
   #896 = Utf8               UPDATE_TAX_REVENUE
   #897 = Utf8               UPDATE_SEED_INCOME
   #898 = Utf8               UPDATE_CERTIFICATES
   #899 = Utf8               UPDATE_CURRENT_TAX
   #900 = Utf8               UPDATE_NEXT_TAX
   #901 = Utf8               UPDATE_DOORS
   #902 = Utf8               DELETE_DOOR
   #903 = Utf8               DELETE_OLD_OWNER
   #904 = Utf8               UPDATE_NEW_OWNER
   #905 = Utf8               UPDATE_TRAP
   #906 = Utf8               DELETE_TRAP
   #907 = Utf8               LOAD_FUNCTIONS
   #908 = Utf8               UPDATE_FUNCTIONS
   #909 = String             #910         // REPLACE INTO castle_functions (castle_id, type, lvl, lease, rate, endTime) VALUES (?,?,?,?,?,?)
   #910 = Utf8               REPLACE INTO castle_functions (castle_id, type, lvl, lease, rate, endTime) VALUES (?,?,?,?,?,?)
   #911 = Utf8               DELETE_FUNCTIONS
   #912 = Utf8               UPDATE_ITEMS_LOC
   #913 = Utf8               Signature
   #914 = Utf8               Ljava/util/Map<Ljava/lang/Integer;Lext/mods/gameserver/model/residence/castle/Castle$CastleFunction;>;
   #915 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/item/MercenaryTicket;>;
   #916 = Utf8               Ljava/util/Set<Lext/mods/gameserver/model/item/instance/ItemInstance;>;
   #917 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/actor/Npc;>;
   #918 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/location/TowerSpawnLocation;>;
   #919 = Utf8               Ljava/util/Map<Ljava/lang/Integer;Lext/mods/gameserver/model/location/SpawnLocation;>;
   #920 = Utf8               Ljava/util/Map<Ljava/lang/Integer;Lext/mods/gameserver/model/records/custom/SiegeInfo;>;
   #921 = Utf8               Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Integer;>;
   #922 = Utf8               Ljava/util/Map<Ljava/lang/Integer;Lext/mods/gameserver/model/pledge/ItemInfo;>;
   #923 = Utf8               FUNC_TELEPORT
   #924 = Integer            1
   #925 = Utf8               FUNC_RESTORE_HP
   #926 = Integer            2
   #927 = Utf8               FUNC_RESTORE_MP
   #928 = Integer            3
   #929 = Utf8               FUNC_RESTORE_EXP
   #930 = Integer            4
   #931 = Utf8               FUNC_SUPPORT
   #932 = Integer            5
   #933 = Utf8               Code
   #934 = Utf8               LineNumberTable
   #935 = Utf8               LocalVariableTable
   #936 = Utf8               zone
   #937 = Utf8               this
   #938 = Utf8               Lext/mods/gameserver/model/residence/castle/Castle;
   #939 = Utf8               set
   #940 = Utf8               Lext/mods/commons/data/StatSet;
   #941 = Utf8               StackMapTable
   #942 = Utf8               getFunction
   #943 = Utf8               (I)Lext/mods/gameserver/model/residence/castle/Castle$CastleFunction;
   #944 = Utf8               engrave
   #945 = Utf8               (Lext/mods/gameserver/model/pledge/Clan;Lext/mods/gameserver/model/WorldObject;)V
   #946 = Utf8               clan
   #947 = Utf8               Lext/mods/gameserver/model/pledge/Clan;
   #948 = Utf8               target
   #949 = Utf8               Lext/mods/gameserver/model/WorldObject;
   #950 = Utf8               parentCastle
   #951 = Utf8               amount
   #952 = Utf8               ps
   #953 = Utf8               Ljava/sql/PreparedStatement;
   #954 = Utf8               con
   #955 = Utf8               Ljava/sql/Connection;
   #956 = Utf8               e
   #957 = Utf8               Ljava/lang/Exception;
   #958 = Utf8               save
   #959 = Utf8               bypassTax
   #960 = Utf8               riseSeedIncome
   #961 = Utf8               updateTaxes
   #962 = Utf8               getSiegeZone
   #963 = Utf8               ()Lext/mods/gameserver/model/zone/type/SiegeZone;
   #964 = Utf8               getLeftCertificates
   #965 = Utf8               setLeftCertificates
   #966 = Utf8               leftCertificates
   #967 = Utf8               storeInDb
   #968 = Utf8               oldLeader
   #969 = Utf8               Lext/mods/gameserver/model/actor/Player;
   #970 = Utf8               oldOwner
   #971 = Utf8               removeOwner
   #972 = Utf8               item
   #973 = Utf8               Lext/mods/gameserver/model/item/instance/ItemInstance;
   #974 = Utf8               skill
   #975 = Utf8               player
   #976 = Utf8               LocalVariableTypeTable
   #977 = Class              #978         // "[Lext/mods/gameserver/model/actor/Player;"
   #978 = Utf8               [Lext/mods/gameserver/model/actor/Player;
   #979 = Utf8               value
   #980 = Utf8               spawnDoors
   #981 = Utf8               (Z)V
   #982 = Utf8               door
   #983 = Utf8               Lext/mods/gameserver/model/actor/instance/Door;
   #984 = Utf8               isDoorWeak
   #985 = Utf8               upgradeDoor
   #986 = Utf8               (IIZ)V
   #987 = Utf8               doorId
   #988 = Utf8               hp
   #989 = Utf8               db
   #990 = Utf8               removeDoorUpgrade
   #991 = Utf8               ps2
   #992 = Utf8               getTickets
   #993 = Utf8               ()Ljava/util/List;
   #994 = Utf8               ()Ljava/util/List<Lext/mods/gameserver/model/item/MercenaryTicket;>;
   #995 = Utf8               itemId
   #996 = Utf8               addTicket
   #997 = Utf8               getDroppedTickets
   #998 = Utf8               ()Ljava/util/Set;
   #999 = Utf8               ()Ljava/util/Set<Lext/mods/gameserver/model/item/instance/ItemInstance;>;
  #1000 = Utf8               addDroppedTicket
  #1001 = Utf8               (Lext/mods/gameserver/model/item/instance/ItemInstance;)V
  #1002 = Utf8               removeDroppedTicket
  #1003 = Utf8               getDroppedTicketsCount
  #1004 = Utf8               (I)I
  #1005 = Utf8               isTooCloseFromDroppedTicket
  #1006 = Utf8               (III)Z
  #1007 = Utf8               x
  #1008 = Utf8               y
  #1009 = Utf8               z
  #1010 = Utf8               spawnSiegeGuardsOrMercenaries
  #1011 = Utf8               spawn
  #1012 = Utf8               Lext/mods/gameserver/model/spawn/Spawn;
  #1013 = Utf8               guard
  #1014 = Utf8               Lext/mods/gameserver/model/actor/Npc;
  #1015 = Utf8               ticket
  #1016 = Utf8               Lext/mods/gameserver/model/item/MercenaryTicket;
  #1017 = Utf8               despawnSiegeGuardsOrMercenaries
  #1018 = Utf8               getControlTowers
  #1019 = Utf8               ()Ljava/util/List<Lext/mods/gameserver/model/location/TowerSpawnLocation;>;
  #1020 = Utf8               getAliveLifeTowerCount
  #1021 = Utf8               getCircletId
  #1022 = Utf8               setCircletId
  #1023 = Utf8               launchSiege
  #1024 = Utf8               getSiegeDate
  #1025 = Utf8               ()Ljava/util/Calendar;
  #1026 = Utf8               setSiegeDate
  #1027 = Utf8               (Ljava/util/Calendar;)V
  #1028 = Utf8               siegeDate
  #1029 = Utf8               isTimeRegistrationOver
  #1030 = Utf8               setTimeRegistrationOver
  #1031 = Utf8               val
  #1032 = Utf8               getTaxRate
  #1033 = Utf8               ()D
  #1034 = Utf8               treasury
  #1035 = Utf8               taxRevenue
  #1036 = Utf8               seedIncome
  #1037 = Utf8               getArtifacts
  #1038 = Utf8               ()Ljava/util/Map<Ljava/lang/Integer;Lext/mods/gameserver/model/location/SpawnLocation;>;
  #1039 = Utf8               getSieges
  #1040 = Utf8               ()Ljava/util/Map<Ljava/lang/Integer;Lext/mods/gameserver/model/records/custom/SiegeInfo;>;
  #1041 = Utf8               ()Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Integer;>;
  #1042 = Utf8               getItemsMember
  #1043 = Utf8               ()Ljava/util/Map<Ljava/lang/Integer;Lext/mods/gameserver/model/pledge/ItemInfo;>;
  #1044 = Utf8               getItemsLeader
  #1045 = Utf8               holyThing
  #1046 = Utf8               Lext/mods/gameserver/model/actor/instance/HolyThing;
  #1047 = Utf8               object
  #1048 = Utf8               getTrapUpgradeLevel
  #1049 = Utf8               towerIndex
  #1050 = Utf8               Lext/mods/gameserver/model/location/TowerSpawnLocation;
  #1051 = Utf8               setTrapUpgrade
  #1052 = Utf8               level
  #1053 = Utf8               removeTrapUpgrade
  #1054 = Utf8               ts
  #1055 = Utf8               checkItemsForMember
  #1056 = Utf8               (Lext/mods/gameserver/model/pledge/ClanMember;)V
  #1057 = Utf8               member
  #1058 = Utf8               Lext/mods/gameserver/model/pledge/ClanMember;
  #1059 = Utf8               rs
  #1060 = Utf8               Ljava/sql/ResultSet;
  #1061 = Utf8               statement
  #1062 = Utf8               functionType
  #1063 = Utf8               updateFunctions
  #1064 = Utf8               (Lext/mods/gameserver/model/actor/Player;IIIJZ)Z
  #1065 = Utf8               diffLease
  #1066 = Utf8               addNew
  #1067 = Utf8               lambda$getAliveLifeTowerCount$0
  #1068 = Utf8               (Lext/mods/gameserver/model/location/TowerSpawnLocation;)Z
  #1069 = Utf8               ct
  #1070 = Utf8               lambda$isTooCloseFromDroppedTicket$0
  #1071 = Utf8               (IIILext/mods/gameserver/model/item/instance/ItemInstance;)Z
  #1072 = Utf8               i
  #1073 = Utf8               lambda$getDroppedTicketsCount$0
  #1074 = Utf8               (ILext/mods/gameserver/model/item/instance/ItemInstance;)Z
  #1075 = Utf8               t
  #1076 = Utf8               lambda$getTicket$0
  #1077 = Utf8               (ILext/mods/gameserver/model/item/MercenaryTicket;)Z
  #1078 = Utf8               lambda$removeOwner$1
  #1079 = Utf8               (Lext/mods/gameserver/model/actor/Npc;)V
  #1080 = Utf8               npc
  #1081 = Utf8               lambda$removeOwner$0
  #1082 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/lang/Integer;Ljava/lang/Integer;)V
  #1083 = Utf8               skillId
  #1084 = Utf8               Ljava/lang/Integer;
  #1085 = Utf8               skillLvl
  #1086 = Utf8               <clinit>
  #1087 = Utf8               SourceFile
  #1088 = Utf8               Castle.java
  #1089 = Utf8               NestMembers
  #1090 = Class              #1091        // ext/mods/gameserver/model/residence/castle/Castle$CastleFunction$FunctionTask
  #1091 = Utf8               ext/mods/gameserver/model/residence/castle/Castle$CastleFunction$FunctionTask
  #1092 = Utf8               BootstrapMethods
  #1093 = MethodType         #1094        //  (Ljava/lang/Object;Ljava/lang/Object;)V
  #1094 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)V
  #1095 = MethodHandle       5:#1096      // REF_invokeVirtual ext/mods/gameserver/model/residence/castle/Castle.lambda$removeOwner$0:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/Integer;Ljava/lang/Integer;)V
  #1096 = Methodref          #13.#1097    // ext/mods/gameserver/model/residence/castle/Castle.lambda$removeOwner$0:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/Integer;Ljava/lang/Integer;)V
  #1097 = NameAndType        #1081:#1082  // lambda$removeOwner$0:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/Integer;Ljava/lang/Integer;)V
  #1098 = MethodType         #1099        //  (Ljava/lang/Integer;Ljava/lang/Integer;)V
  #1099 = Utf8               (Ljava/lang/Integer;Ljava/lang/Integer;)V
  #1100 = MethodType         #1101        //  (Ljava/lang/Object;)V
  #1101 = Utf8               (Ljava/lang/Object;)V
  #1102 = MethodHandle       6:#1103      // REF_invokeStatic ext/mods/gameserver/model/residence/castle/Castle.lambda$removeOwner$1:(Lext/mods/gameserver/model/actor/Npc;)V
  #1103 = Methodref          #13.#1104    // ext/mods/gameserver/model/residence/castle/Castle.lambda$removeOwner$1:(Lext/mods/gameserver/model/actor/Npc;)V
  #1104 = NameAndType        #1078:#1079  // lambda$removeOwner$1:(Lext/mods/gameserver/model/actor/Npc;)V
  #1105 = MethodType         #1079        //  (Lext/mods/gameserver/model/actor/Npc;)V
  #1106 = MethodType         #158         //  (Ljava/lang/Object;)Z
  #1107 = MethodHandle       6:#1108      // REF_invokeStatic ext/mods/gameserver/model/residence/castle/Castle.lambda$getTicket$0:(ILext/mods/gameserver/model/item/MercenaryTicket;)Z
  #1108 = Methodref          #13.#1109    // ext/mods/gameserver/model/residence/castle/Castle.lambda$getTicket$0:(ILext/mods/gameserver/model/item/MercenaryTicket;)Z
  #1109 = NameAndType        #1076:#1077  // lambda$getTicket$0:(ILext/mods/gameserver/model/item/MercenaryTicket;)Z
  #1110 = MethodType         #1111        //  (Lext/mods/gameserver/model/item/MercenaryTicket;)Z
  #1111 = Utf8               (Lext/mods/gameserver/model/item/MercenaryTicket;)Z
  #1112 = MethodHandle       6:#1113      // REF_invokeStatic ext/mods/gameserver/model/residence/castle/Castle.lambda$getDroppedTicketsCount$0:(ILext/mods/gameserver/model/item/instance/ItemInstance;)Z
  #1113 = Methodref          #13.#1114    // ext/mods/gameserver/model/residence/castle/Castle.lambda$getDroppedTicketsCount$0:(ILext/mods/gameserver/model/item/instance/ItemInstance;)Z
  #1114 = NameAndType        #1073:#1074  // lambda$getDroppedTicketsCount$0:(ILext/mods/gameserver/model/item/instance/ItemInstance;)Z
  #1115 = MethodType         #1116        //  (Lext/mods/gameserver/model/item/instance/ItemInstance;)Z
  #1116 = Utf8               (Lext/mods/gameserver/model/item/instance/ItemInstance;)Z
  #1117 = MethodHandle       6:#1118      // REF_invokeStatic ext/mods/gameserver/model/residence/castle/Castle.lambda$isTooCloseFromDroppedTicket$0:(IIILext/mods/gameserver/model/item/instance/ItemInstance;)Z
  #1118 = Methodref          #13.#1119    // ext/mods/gameserver/model/residence/castle/Castle.lambda$isTooCloseFromDroppedTicket$0:(IIILext/mods/gameserver/model/item/instance/ItemInstance;)Z
  #1119 = NameAndType        #1070:#1071  // lambda$isTooCloseFromDroppedTicket$0:(IIILext/mods/gameserver/model/item/instance/ItemInstance;)Z
  #1120 = MethodHandle       5:#1121      // REF_invokeVirtual ext/mods/gameserver/model/actor/Npc.deleteMe:()V
  #1121 = Methodref          #697.#1122   // ext/mods/gameserver/model/actor/Npc.deleteMe:()V
  #1122 = NameAndType        #1123:#11    // deleteMe:()V
  #1123 = Utf8               deleteMe
  #1124 = MethodHandle       5:#1125      // REF_invokeVirtual ext/mods/gameserver/model/residence/castle/Castle.lambda$getAliveLifeTowerCount$0:(Lext/mods/gameserver/model/location/TowerSpawnLocation;)Z
  #1125 = Methodref          #13.#1126    // ext/mods/gameserver/model/residence/castle/Castle.lambda$getAliveLifeTowerCount$0:(Lext/mods/gameserver/model/location/TowerSpawnLocation;)Z
  #1126 = NameAndType        #1067:#1068  // lambda$getAliveLifeTowerCount$0:(Lext/mods/gameserver/model/location/TowerSpawnLocation;)Z
  #1127 = MethodType         #1068        //  (Lext/mods/gameserver/model/location/TowerSpawnLocation;)Z
  #1128 = String             #1129        // Exception: Castle.loadFunctions(): \u0001
  #1129 = Utf8               Exception: Castle.loadFunctions(): \u0001
  #1130 = String             #1131        // Exception: Castle.removeFunctions(int functionType): \u0001
  #1131 = Utf8               Exception: Castle.removeFunctions(int functionType): \u0001
  #1132 = MethodHandle       6:#1133      // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #1133 = Methodref          #1134.#1135  // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #1134 = Class              #1136        // java/lang/invoke/LambdaMetafactory
  #1135 = NameAndType        #1137:#1138  // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #1136 = Utf8               java/lang/invoke/LambdaMetafactory
  #1137 = Utf8               metafactory
  #1138 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #1139 = MethodHandle       6:#1140      // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #1140 = Methodref          #1141.#1142  // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #1141 = Class              #1143        // java/lang/invoke/StringConcatFactory
  #1142 = NameAndType        #805:#1144   // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #1143 = Utf8               java/lang/invoke/StringConcatFactory
  #1144 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #1145 = Utf8               InnerClasses
  #1146 = Utf8               CastleFunction
  #1147 = Utf8               FunctionTask
  #1148 = Class              #1149        // java/lang/invoke/MethodHandles$Lookup
  #1149 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #1150 = Class              #1151        // java/lang/invoke/MethodHandles
  #1151 = Utf8               java/lang/invoke/MethodHandles
  #1152 = Utf8               Lookup
{
  public static final int FUNC_TELEPORT;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 1

  public static final int FUNC_RESTORE_HP;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 2

  public static final int FUNC_RESTORE_MP;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 3

  public static final int FUNC_RESTORE_EXP;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 4

  public static final int FUNC_SUPPORT;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 5

  public ext.mods.gameserver.model.residence.castle.Castle(ext.mods.commons.data.StatSet);
    descriptor: (Lext/mods/commons/data/StatSet;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=4, args_size=2
         0: aload_0
         1: aload_1
         2: invokespecial #1                  // Method ext/mods/gameserver/model/residence/Residence."<init>":(Lext/mods/commons/data/StatSet;)V
         5: aload_0
         6: new           #7                  // class java/util/HashMap
         9: dup
        10: invokespecial #9                  // Method java/util/HashMap."<init>":()V
        13: putfield      #12                 // Field _function:Ljava/util/Map;
        16: aload_0
        17: new           #18                 // class java/util/ArrayList
        20: dup
        21: bipush        60
        23: invokespecial #20                 // Method java/util/ArrayList."<init>":(I)V
        26: putfield      #23                 // Field _tickets:Ljava/util/List;
        29: aload_0
        30: new           #27                 // class java/util/concurrent/ConcurrentSkipListSet
        33: dup
        34: invokespecial #29                 // Method java/util/concurrent/ConcurrentSkipListSet."<init>":()V
        37: putfield      #30                 // Field _droppedTickets:Ljava/util/Set;
        40: aload_0
        41: new           #18                 // class java/util/ArrayList
        44: dup
        45: invokespecial #34                 // Method java/util/ArrayList."<init>":()V
        48: putfield      #35                 // Field _siegeGuards:Ljava/util/List;
        51: aload_0
        52: new           #18                 // class java/util/ArrayList
        55: dup
        56: invokespecial #34                 // Method java/util/ArrayList."<init>":()V
        59: putfield      #38                 // Field _controlTowers:Ljava/util/List;
        62: aload_0
        63: new           #7                  // class java/util/HashMap
        66: dup
        67: iconst_1
        68: invokespecial #41                 // Method java/util/HashMap."<init>":(I)V
        71: putfield      #42                 // Field _artifacts:Ljava/util/Map;
        74: aload_0
        75: iconst_1
        76: putfield      #45                 // Field _isTimeRegistrationOver:Z
        79: aload_0
        80: new           #7                  // class java/util/HashMap
        83: dup
        84: invokespecial #9                  // Method java/util/HashMap."<init>":()V
        87: putfield      #49                 // Field _sieges:Ljava/util/Map;
        90: aload_0
        91: new           #7                  // class java/util/HashMap
        94: dup
        95: invokespecial #9                  // Method java/util/HashMap."<init>":()V
        98: putfield      #52                 // Field _skillMember:Ljava/util/Map;
       101: aload_0
       102: new           #7                  // class java/util/HashMap
       105: dup
       106: invokespecial #9                  // Method java/util/HashMap."<init>":()V
       109: putfield      #55                 // Field _skillLeader:Ljava/util/Map;
       112: aload_0
       113: new           #7                  // class java/util/HashMap
       116: dup
       117: invokespecial #9                  // Method java/util/HashMap."<init>":()V
       120: putfield      #58                 // Field _itemsMember:Ljava/util/Map;
       123: aload_0
       124: new           #7                  // class java/util/HashMap
       127: dup
       128: invokespecial #9                  // Method java/util/HashMap."<init>":()V
       131: putfield      #61                 // Field _itemsLeader:Ljava/util/Map;
       134: aload_0
       135: aload_1
       136: ldc           #64                 // String circletId
       138: invokevirtual #66                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
       141: putfield      #72                 // Field _circletId:I
       144: aload_0
       145: ldc           #76                 // int 1001000
       147: aload_0
       148: getfield      #77                 // Field _id:I
       151: iadd
       152: invokestatic  #80                 // Method ext/mods/gameserver/network/NpcStringId.getNpcMessage:(I)Ljava/lang/String;
       155: putfield      #86                 // Field _townName:Ljava/lang/String;
       158: invokestatic  #90                 // Method ext/mods/gameserver/data/manager/ZoneManager.getInstance:()Lext/mods/gameserver/data/manager/ZoneManager;
       161: ldc           #96                 // class ext/mods/gameserver/model/zone/type/SiegeZone
       163: invokevirtual #98                 // Method ext/mods/gameserver/data/manager/ZoneManager.getAllZones:(Ljava/lang/Class;)Ljava/util/Collection;
       166: invokeinterface #102,  1          // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
       171: astore_2
       172: aload_2
       173: invokeinterface #108,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       178: ifeq          213
       181: aload_2
       182: invokeinterface #114,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       187: checkcast     #96                 // class ext/mods/gameserver/model/zone/type/SiegeZone
       190: astore_3
       191: aload_3
       192: invokevirtual #118                // Method ext/mods/gameserver/model/zone/type/SiegeZone.getSiegableId:()I
       195: aload_0
       196: getfield      #77                 // Field _id:I
       199: if_icmpne     210
       202: aload_0
       203: aload_3
       204: putfield      #122                // Field _siegeZone:Lext/mods/gameserver/model/zone/type/SiegeZone;
       207: goto          213
       210: goto          172
       213: invokestatic  #90                 // Method ext/mods/gameserver/data/manager/ZoneManager.getInstance:()Lext/mods/gameserver/data/manager/ZoneManager;
       216: ldc           #126                // class ext/mods/gameserver/model/zone/type/CastleZone
       218: invokevirtual #98                 // Method ext/mods/gameserver/data/manager/ZoneManager.getAllZones:(Ljava/lang/Class;)Ljava/util/Collection;
       221: invokeinterface #102,  1          // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
       226: astore_2
       227: aload_2
       228: invokeinterface #108,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       233: ifeq          268
       236: aload_2
       237: invokeinterface #114,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       242: checkcast     #126                // class ext/mods/gameserver/model/zone/type/CastleZone
       245: astore_3
       246: aload_3
       247: invokevirtual #128                // Method ext/mods/gameserver/model/zone/type/CastleZone.getResidenceId:()I
       250: aload_0
       251: getfield      #77                 // Field _id:I
       254: if_icmpne     265
       257: aload_0
       258: aload_3
       259: putfield      #131                // Field _castleZone:Lext/mods/gameserver/model/zone/type/CastleZone;
       262: goto          268
       265: goto          227
       268: invokestatic  #90                 // Method ext/mods/gameserver/data/manager/ZoneManager.getInstance:()Lext/mods/gameserver/data/manager/ZoneManager;
       271: ldc           #135                // class ext/mods/gameserver/model/zone/type/CastleTeleportZone
       273: invokevirtual #98                 // Method ext/mods/gameserver/data/manager/ZoneManager.getAllZones:(Ljava/lang/Class;)Ljava/util/Collection;
       276: invokeinterface #102,  1          // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
       281: astore_2
       282: aload_2
       283: invokeinterface #108,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       288: ifeq          323
       291: aload_2
       292: invokeinterface #114,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       297: checkcast     #135                // class ext/mods/gameserver/model/zone/type/CastleTeleportZone
       300: astore_3
       301: aload_3
       302: invokevirtual #137                // Method ext/mods/gameserver/model/zone/type/CastleTeleportZone.getCastleId:()I
       305: aload_0
       306: getfield      #77                 // Field _id:I
       309: if_icmpne     320
       312: aload_0
       313: aload_3
       314: putfield      #140                // Field _teleZone:Lext/mods/gameserver/model/zone/type/CastleTeleportZone;
       317: goto          323
       320: goto          282
       323: aload_0
       324: invokevirtual #144                // Method loadFunctions:()V
       327: return
      LineNumberTable:
        line 143: 0
        line 99: 5
        line 101: 16
        line 103: 29
        line 104: 40
        line 106: 51
        line 108: 62
        line 112: 74
        line 128: 79
        line 130: 90
        line 131: 101
        line 132: 112
        line 133: 123
        line 145: 134
        line 146: 144
        line 148: 158
        line 150: 191
        line 152: 202
        line 153: 207
        line 155: 210
        line 157: 213
        line 159: 246
        line 161: 257
        line 162: 262
        line 164: 265
        line 166: 268
        line 168: 301
        line 170: 312
        line 171: 317
        line 173: 320
        line 175: 323
        line 176: 327
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          191      19     3  zone   Lext/mods/gameserver/model/zone/type/SiegeZone;
          246      19     3  zone   Lext/mods/gameserver/model/zone/type/CastleZone;
          301      19     3  zone   Lext/mods/gameserver/model/zone/type/CastleTeleportZone;
            0     328     0  this   Lext/mods/gameserver/model/residence/castle/Castle;
            0     328     1   set   Lext/mods/commons/data/StatSet;
      StackMapTable: number_of_entries = 9
        frame_type = 255 /* full_frame */
          offset_delta = 172
          locals = [ class ext/mods/gameserver/model/residence/castle/Castle, class ext/mods/commons/data/StatSet, class java/util/Iterator ]
          stack = []
        frame_type = 37 /* same */
        frame_type = 250 /* chop */
          offset_delta = 2
        frame_type = 252 /* append */
          offset_delta = 13
          locals = [ class java/util/Iterator ]
        frame_type = 37 /* same */
        frame_type = 250 /* chop */
          offset_delta = 2
        frame_type = 252 /* append */
          offset_delta = 13
          locals = [ class java/util/Iterator ]
        frame_type = 37 /* same */
        frame_type = 250 /* chop */
          offset_delta = 2

  public ext.mods.gameserver.model.residence.castle.Castle$CastleFunction getFunction(int);
    descriptor: (I)Lext/mods/gameserver/model/residence/castle/Castle$CastleFunction;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #12                 // Field _function:Ljava/util/Map;
         4: iload_1
         5: invokestatic  #147                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
         8: invokeinterface #153,  2          // InterfaceMethod java/util/Map.containsKey:(Ljava/lang/Object;)Z
        13: ifeq          33
        16: aload_0
        17: getfield      #12                 // Field _function:Ljava/util/Map;
        20: iload_1
        21: invokestatic  #147                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        24: invokeinterface #159,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        29: checkcast     #163                // class ext/mods/gameserver/model/residence/castle/Castle$CastleFunction
        32: areturn
        33: aconst_null
        34: areturn
      LineNumberTable:
        line 180: 0
        line 181: 16
        line 183: 33
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      35     0  this   Lext/mods/gameserver/model/residence/castle/Castle;
            0      35     1  type   I
      StackMapTable: number_of_entries = 1
        frame_type = 33 /* same */

  public synchronized void engrave(ext.mods.gameserver.model.pledge.Clan, ext.mods.gameserver.model.WorldObject);
    descriptor: (Lext/mods/gameserver/model/pledge/Clan;Lext/mods/gameserver/model/WorldObject;)V
    flags: (0x0021) ACC_PUBLIC, ACC_SYNCHRONIZED
    Code:
      stack=6, locals=3, args_size=3
         0: aload_0
         1: aload_2
         2: invokevirtual #165                // Method isGoodArtifact:(Lext/mods/gameserver/model/WorldObject;)Z
         5: ifne          9
         8: return
         9: aload_0
        10: invokevirtual #169                // Method getSiege:()Lext/mods/gameserver/model/residence/castle/Siege;
        13: getstatic     #173                // Field ext/mods/gameserver/network/SystemMessageId.CLAN_S1_ENGRAVED_RULER:Lext/mods/gameserver/network/SystemMessageId;
        16: invokestatic  #179                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        19: aload_1
        20: invokevirtual #185                // Method ext/mods/gameserver/model/pledge/Clan.getName:()Ljava/lang/String;
        23: invokevirtual #191                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addString:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        26: iconst_2
        27: anewarray     #195                // class ext/mods/gameserver/enums/SiegeSide
        30: dup
        31: iconst_0
        32: getstatic     #197                // Field ext/mods/gameserver/enums/SiegeSide.ATTACKER:Lext/mods/gameserver/enums/SiegeSide;
        35: aastore
        36: dup
        37: iconst_1
        38: getstatic     #201                // Field ext/mods/gameserver/enums/SiegeSide.DEFENDER:Lext/mods/gameserver/enums/SiegeSide;
        41: aastore
        42: invokevirtual #204                // Method ext/mods/gameserver/model/residence/castle/Siege.announce:(Lext/mods/gameserver/network/serverpackets/SystemMessage;[Lext/mods/gameserver/enums/SiegeSide;)V
        45: aload_0
        46: aload_1
        47: invokevirtual #210                // Method setOwner:(Lext/mods/gameserver/model/pledge/Clan;)V
        50: aload_1
        51: invokevirtual #214                // Method ext/mods/gameserver/model/pledge/Clan.getLeader:()Lext/mods/gameserver/model/pledge/ClanMember;
        54: invokevirtual #218                // Method ext/mods/gameserver/model/pledge/ClanMember.getPlayerInstance:()Lext/mods/gameserver/model/actor/Player;
        57: invokevirtual #224                // Method ext/mods/gameserver/model/actor/Player.getMissions:()Lext/mods/gameserver/model/actor/container/player/MissionList;
        60: getstatic     #230                // Field ext/mods/gameserver/enums/actors/MissionType.CASTLE:Lext/mods/gameserver/enums/actors/MissionType;
        63: invokevirtual #236                // Method ext/mods/gameserver/model/actor/container/player/MissionList.update:(Lext/mods/gameserver/enums/actors/MissionType;)V
        66: return
      LineNumberTable:
        line 188: 0
        line 189: 8
        line 191: 9
        line 193: 45
        line 194: 50
        line 195: 66
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      67     0  this   Lext/mods/gameserver/model/residence/castle/Castle;
            0      67     1  clan   Lext/mods/gameserver/model/pledge/Clan;
            0      67     2 target   Lext/mods/gameserver/model/WorldObject;
      StackMapTable: number_of_entries = 1
        frame_type = 9 /* same */

  public boolean editTreasury(long, boolean);
    descriptor: (JZ)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=8, args_size=3
         0: aload_0
         1: getfield      #242                // Field _ownerId:I
         4: ifle          13
         7: lload_1
         8: lconst_0
         9: lcmp
        10: ifne          15
        13: iconst_0
        14: ireturn
        15: lload_1
        16: lconst_0
        17: lcmp
        18: ifge          48
        21: aload_0
        22: getfield      #269                // Field _treasury:J
        25: lload_1
        26: invokestatic  #273                // Method java/lang/Math.abs:(J)J
        29: lcmp
        30: ifge          35
        33: iconst_0
        34: ireturn
        35: aload_0
        36: dup
        37: getfield      #269                // Field _treasury:J
        40: lload_1
        41: ladd
        42: putfield      #269                // Field _treasury:J
        45: goto          81
        48: aload_0
        49: getfield      #269                // Field _treasury:J
        52: lload_1
        53: ladd
        54: ldc2_w        #279                // long 2147483647l
        57: lcmp
        58: ifle          71
        61: aload_0
        62: ldc2_w        #279                // long 2147483647l
        65: putfield      #269                // Field _treasury:J
        68: goto          81
        71: aload_0
        72: dup
        73: getfield      #269                // Field _treasury:J
        76: lload_1
        77: ladd
        78: putfield      #269                // Field _treasury:J
        81: iload_3
        82: ifeq          238
        85: invokestatic  #281                // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
        88: astore        4
        90: aload         4
        92: ldc_w         #287                // String UPDATE castle SET treasury=? WHERE id=?
        95: invokeinterface #289,  2          // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
       100: astore        5
       102: aload         5
       104: iconst_1
       105: aload_0
       106: getfield      #269                // Field _treasury:J
       109: invokeinterface #295,  4          // InterfaceMethod java/sql/PreparedStatement.setLong:(IJ)V
       114: aload         5
       116: iconst_2
       117: aload_0
       118: getfield      #77                 // Field _id:I
       121: invokeinterface #301,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       126: aload         5
       128: invokeinterface #305,  1          // InterfaceMethod java/sql/PreparedStatement.executeUpdate:()I
       133: pop
       134: aload         5
       136: ifnull        178
       139: aload         5
       141: invokeinterface #308,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       146: goto          178
       149: astore        6
       151: aload         5
       153: ifnull        175
       156: aload         5
       158: invokeinterface #308,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       163: goto          175
       166: astore        7
       168: aload         6
       170: aload         7
       172: invokevirtual #313                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       175: aload         6
       177: athrow
       178: aload         4
       180: ifnull        222
       183: aload         4
       185: invokeinterface #317,  1          // InterfaceMethod java/sql/Connection.close:()V
       190: goto          222
       193: astore        5
       195: aload         4
       197: ifnull        219
       200: aload         4
       202: invokeinterface #317,  1          // InterfaceMethod java/sql/Connection.close:()V
       207: goto          219
       210: astore        6
       212: aload         5
       214: aload         6
       216: invokevirtual #313                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       219: aload         5
       221: athrow
       222: goto          238
       225: astore        4
       227: getstatic     #320                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       230: ldc_w         #324                // String Couldn\'t update treasury.
       233: aload         4
       235: invokevirtual #326                // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
       238: iconst_1
       239: ireturn
      Exception table:
         from    to  target type
           102   134   149   Class java/lang/Throwable
           156   163   166   Class java/lang/Throwable
            90   178   193   Class java/lang/Throwable
           200   207   210   Class java/lang/Throwable
            85   222   225   Class java/lang/Exception
      LineNumberTable:
        line 236: 0
        line 237: 13
        line 239: 15
        line 241: 21
        line 242: 33
        line 244: 35
        line 246: 48
        line 247: 61
        line 249: 71
        line 251: 81
        line 253: 85
        line 254: 90
        line 256: 102
        line 257: 114
        line 258: 126
        line 259: 134
        line 253: 149
        line 259: 178
        line 253: 193
        line 263: 222
        line 260: 225
        line 262: 227
        line 265: 238
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          102      76     5    ps   Ljava/sql/PreparedStatement;
           90     132     4   con   Ljava/sql/Connection;
          227      11     4     e   Ljava/lang/Exception;
            0     240     0  this   Lext/mods/gameserver/model/residence/castle/Castle;
            0     240     1 amount   J
            0     240     3  save   Z
      StackMapTable: number_of_entries = 16
        frame_type = 13 /* same */
        frame_type = 1 /* same */
        frame_type = 19 /* same */
        frame_type = 12 /* same */
        frame_type = 22 /* same */
        frame_type = 9 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 67
          locals = [ class ext/mods/gameserver/model/residence/castle/Castle, long, int, class java/sql/Connection, class java/sql/PreparedStatement ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/model/residence/castle/Castle, long, int, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 78 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/model/residence/castle/Castle, long, int, class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 12 /* same */

  public void riseTaxRevenue(long);
    descriptor: (J)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=3, args_size=2
         0: aload_0
         1: lload_1
         2: iconst_0
         3: invokevirtual #265                // Method riseTaxRevenue:(JZ)V
         6: return
      LineNumberTable:
        line 270: 0
        line 271: 6
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/model/residence/castle/Castle;
            0       7     1 amount   J

  public void riseTaxRevenue(long, boolean);
    descriptor: (JZ)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=8, args_size=3
         0: aload_0
         1: getfield      #242                // Field _ownerId:I
         4: ifle          13
         7: lload_1
         8: lconst_0
         9: lcmp
        10: ifgt          14
        13: return
        14: iload_3
        15: ifne          24
        18: aload_0
        19: lload_1
        20: invokevirtual #332                // Method tax:(J)J
        23: lstore_1
        24: aload_0
        25: getfield      #335                // Field _taxRevenue:J
        28: ldc2_w        #279                // long 2147483647l
        31: lcmp
        32: ifge          221
        35: aload_0
        36: getfield      #335                // Field _taxRevenue:J
        39: lload_1
        40: ladd
        41: ldc2_w        #279                // long 2147483647l
        44: lcmp
        45: ifle          58
        48: aload_0
        49: ldc2_w        #279                // long 2147483647l
        52: putfield      #335                // Field _taxRevenue:J
        55: goto          68
        58: aload_0
        59: dup
        60: getfield      #335                // Field _taxRevenue:J
        63: lload_1
        64: ladd
        65: putfield      #335                // Field _taxRevenue:J
        68: invokestatic  #281                // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
        71: astore        4
        73: aload         4
        75: ldc_w         #338                // String UPDATE castle SET taxRevenue=? WHERE id=?
        78: invokeinterface #289,  2          // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        83: astore        5
        85: aload         5
        87: iconst_1
        88: aload_0
        89: getfield      #335                // Field _taxRevenue:J
        92: invokeinterface #295,  4          // InterfaceMethod java/sql/PreparedStatement.setLong:(IJ)V
        97: aload         5
        99: iconst_2
       100: aload_0
       101: getfield      #77                 // Field _id:I
       104: invokeinterface #301,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       109: aload         5
       111: invokeinterface #305,  1          // InterfaceMethod java/sql/PreparedStatement.executeUpdate:()I
       116: pop
       117: aload         5
       119: ifnull        161
       122: aload         5
       124: invokeinterface #308,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       129: goto          161
       132: astore        6
       134: aload         5
       136: ifnull        158
       139: aload         5
       141: invokeinterface #308,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       146: goto          158
       149: astore        7
       151: aload         6
       153: aload         7
       155: invokevirtual #313                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       158: aload         6
       160: athrow
       161: aload         4
       163: ifnull        205
       166: aload         4
       168: invokeinterface #317,  1          // InterfaceMethod java/sql/Connection.close:()V
       173: goto          205
       176: astore        5
       178: aload         4
       180: ifnull        202
       183: aload         4
       185: invokeinterface #317,  1          // InterfaceMethod java/sql/Connection.close:()V
       190: goto          202
       193: astore        6
       195: aload         5
       197: aload         6
       199: invokevirtual #313                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       202: aload         5
       204: athrow
       205: goto          221
       208: astore        4
       210: getstatic     #320                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       213: ldc_w         #340                // String Couldn\'t update tax revenue.
       216: aload         4
       218: invokevirtual #326                // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
       221: return
      Exception table:
         from    to  target type
            85   117   132   Class java/lang/Throwable
           139   146   149   Class java/lang/Throwable
            73   161   176   Class java/lang/Throwable
           183   190   193   Class java/lang/Throwable
            68   205   208   Class java/lang/Exception
      LineNumberTable:
        line 275: 0
        line 276: 13
        line 278: 14
        line 279: 18
        line 281: 24
        line 283: 35
        line 284: 48
        line 286: 58
        line 288: 68
        line 289: 73
        line 291: 85
        line 292: 97
        line 293: 109
        line 294: 117
        line 288: 132
        line 294: 161
        line 288: 176
        line 298: 205
        line 295: 208
        line 297: 210
        line 301: 221
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           85      76     5    ps   Ljava/sql/PreparedStatement;
           73     132     4   con   Ljava/sql/Connection;
          210      11     4     e   Ljava/lang/Exception;
            0     222     0  this   Lext/mods/gameserver/model/residence/castle/Castle;
            0     222     1 amount   J
            0     222     3 bypassTax   Z
      StackMapTable: number_of_entries = 15
        frame_type = 13 /* same */
        frame_type = 0 /* same */
        frame_type = 9 /* same */
        frame_type = 33 /* same */
        frame_type = 9 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 63
          locals = [ class ext/mods/gameserver/model/residence/castle/Castle, long, int, class java/sql/Connection, class java/sql/PreparedStatement ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/model/residence/castle/Castle, long, int, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 78 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/model/residence/castle/Castle, long, int, class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 12 /* same */

  public void riseSeedIncome(long);
    descriptor: (J)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=7, args_size=2
         0: aload_0
         1: getfield      #242                // Field _ownerId:I
         4: ifle          13
         7: lload_1
         8: lconst_0
         9: lcmp
        10: ifgt          14
        13: return
        14: aload_0
        15: lload_1
        16: invokevirtual #332                // Method tax:(J)J
        19: lstore_1
        20: aload_0
        21: getfield      #342                // Field _seedIncome:J
        24: ldc2_w        #279                // long 2147483647l
        27: lcmp
        28: ifge          209
        31: aload_0
        32: getfield      #342                // Field _seedIncome:J
        35: lload_1
        36: ladd
        37: ldc2_w        #279                // long 2147483647l
        40: lcmp
        41: ifle          54
        44: aload_0
        45: ldc2_w        #279                // long 2147483647l
        48: putfield      #342                // Field _seedIncome:J
        51: goto          64
        54: aload_0
        55: dup
        56: getfield      #342                // Field _seedIncome:J
        59: lload_1
        60: ladd
        61: putfield      #342                // Field _seedIncome:J
        64: invokestatic  #281                // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
        67: astore_3
        68: aload_3
        69: ldc_w         #345                // String UPDATE castle SET seedIncome=? WHERE id=?
        72: invokeinterface #289,  2          // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        77: astore        4
        79: aload         4
        81: iconst_1
        82: aload_0
        83: getfield      #342                // Field _seedIncome:J
        86: invokeinterface #295,  4          // InterfaceMethod java/sql/PreparedStatement.setLong:(IJ)V
        91: aload         4
        93: iconst_2
        94: aload_0
        95: getfield      #77                 // Field _id:I
        98: invokeinterface #301,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       103: aload         4
       105: invokeinterface #305,  1          // InterfaceMethod java/sql/PreparedStatement.executeUpdate:()I
       110: pop
       111: aload         4
       113: ifnull        155
       116: aload         4
       118: invokeinterface #308,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       123: goto          155
       126: astore        5
       128: aload         4
       130: ifnull        152
       133: aload         4
       135: invokeinterface #308,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       140: goto          152
       143: astore        6
       145: aload         5
       147: aload         6
       149: invokevirtual #313                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       152: aload         5
       154: athrow
       155: aload_3
       156: ifnull        195
       159: aload_3
       160: invokeinterface #317,  1          // InterfaceMethod java/sql/Connection.close:()V
       165: goto          195
       168: astore        4
       170: aload_3
       171: ifnull        192
       174: aload_3
       175: invokeinterface #317,  1          // InterfaceMethod java/sql/Connection.close:()V
       180: goto          192
       183: astore        5
       185: aload         4
       187: aload         5
       189: invokevirtual #313                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       192: aload         4
       194: athrow
       195: goto          209
       198: astore_3
       199: getstatic     #320                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       202: ldc_w         #347                // String Couldn\'t update seed income.
       205: aload_3
       206: invokevirtual #326                // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
       209: return
      Exception table:
         from    to  target type
            79   111   126   Class java/lang/Throwable
           133   140   143   Class java/lang/Throwable
            68   155   168   Class java/lang/Throwable
           174   180   183   Class java/lang/Throwable
            64   195   198   Class java/lang/Exception
      LineNumberTable:
        line 305: 0
        line 306: 13
        line 308: 14
        line 310: 20
        line 312: 31
        line 313: 44
        line 315: 54
        line 317: 64
        line 318: 68
        line 320: 79
        line 321: 91
        line 322: 103
        line 323: 111
        line 317: 126
        line 323: 155
        line 317: 168
        line 327: 195
        line 324: 198
        line 326: 199
        line 329: 209
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           79      76     4    ps   Ljava/sql/PreparedStatement;
           68     127     3   con   Ljava/sql/Connection;
          199      10     3     e   Ljava/lang/Exception;
            0     210     0  this   Lext/mods/gameserver/model/residence/castle/Castle;
            0     210     1 amount   J
      StackMapTable: number_of_entries = 14
        frame_type = 13 /* same */
        frame_type = 0 /* same */
        frame_type = 39 /* same */
        frame_type = 9 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 61
          locals = [ class ext/mods/gameserver/model/residence/castle/Castle, long, class java/sql/Connection, class java/sql/PreparedStatement ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/model/residence/castle/Castle, long, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 14
          locals = [ class ext/mods/gameserver/model/residence/castle/Castle, long, class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 10 /* same */

  public void updateTaxes();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=7, locals=5, args_size=1
         0: invokestatic  #281                // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
         3: astore_1
         4: aload_1
         5: ldc_w         #349                // String UPDATE castle SET treasury=?, taxRevenue=?, seedIncome=?, currentTaxPercent=?, nextTaxPercent=? WHERE id=?
         8: invokeinterface #289,  2          // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        13: astore_2
        14: aload_0
        15: invokevirtual #351                // Method isFree:()Z
        18: ifeq          85
        21: aload_0
        22: lconst_0
        23: invokevirtual #354                // Method setTreasury:(J)V
        26: aload_0
        27: lconst_0
        28: invokevirtual #358                // Method setTaxRevenue:(J)V
        31: aload_0
        32: lconst_0
        33: invokevirtual #361                // Method setSeedIncome:(J)V
        36: aload_2
        37: iconst_1
        38: lconst_0
        39: invokeinterface #295,  4          // InterfaceMethod java/sql/PreparedStatement.setLong:(IJ)V
        44: aload_2
        45: iconst_2
        46: lconst_0
        47: invokeinterface #295,  4          // InterfaceMethod java/sql/PreparedStatement.setLong:(IJ)V
        52: aload_2
        53: iconst_3
        54: lconst_0
        55: invokeinterface #295,  4          // InterfaceMethod java/sql/PreparedStatement.setLong:(IJ)V
        60: aload_2
        61: iconst_4
        62: aload_0
        63: invokevirtual #364                // Method getDefaultTaxRate:()I
        66: invokeinterface #301,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        71: aload_2
        72: iconst_5
        73: aload_0
        74: invokevirtual #364                // Method getDefaultTaxRate:()I
        77: invokeinterface #301,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        82: goto          168
        85: aload_0
        86: aload_0
        87: invokevirtual #367                // Method getTaxRevenue:()J
        90: aload_0
        91: invokevirtual #371                // Method getSeedIncome:()J
        94: ladd
        95: iconst_0
        96: invokevirtual #374                // Method editTreasury:(JZ)Z
        99: pop
       100: aload_0
       101: lconst_0
       102: invokevirtual #358                // Method setTaxRevenue:(J)V
       105: aload_0
       106: lconst_0
       107: invokevirtual #361                // Method setSeedIncome:(J)V
       110: aload_0
       111: aload_0
       112: invokevirtual #378                // Method getNextTaxPercent:()I
       115: iconst_0
       116: invokevirtual #381                // Method setCurrentTaxPercent:(IZ)V
       119: aload_2
       120: iconst_1
       121: aload_0
       122: invokevirtual #385                // Method getTreasury:()J
       125: invokeinterface #295,  4          // InterfaceMethod java/sql/PreparedStatement.setLong:(IJ)V
       130: aload_2
       131: iconst_2
       132: lconst_0
       133: invokeinterface #295,  4          // InterfaceMethod java/sql/PreparedStatement.setLong:(IJ)V
       138: aload_2
       139: iconst_3
       140: lconst_0
       141: invokeinterface #295,  4          // InterfaceMethod java/sql/PreparedStatement.setLong:(IJ)V
       146: aload_2
       147: iconst_4
       148: aload_0
       149: invokevirtual #388                // Method getCurrentTaxPercent:()I
       152: invokeinterface #301,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       157: aload_2
       158: iconst_5
       159: aload_0
       160: invokevirtual #378                // Method getNextTaxPercent:()I
       163: invokeinterface #301,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       168: aload_2
       169: bipush        6
       171: aload_0
       172: invokevirtual #391                // Method getId:()I
       175: invokeinterface #301,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       180: aload_2
       181: invokeinterface #394,  1          // InterfaceMethod java/sql/PreparedStatement.addBatch:()V
       186: aload_2
       187: invokeinterface #397,  1          // InterfaceMethod java/sql/PreparedStatement.executeBatch:()[I
       192: pop
       193: aload_2
       194: ifnull        230
       197: aload_2
       198: invokeinterface #308,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       203: goto          230
       206: astore_3
       207: aload_2
       208: ifnull        228
       211: aload_2
       212: invokeinterface #308,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       217: goto          228
       220: astore        4
       222: aload_3
       223: aload         4
       225: invokevirtual #313                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       228: aload_3
       229: athrow
       230: aload_1
       231: ifnull        265
       234: aload_1
       235: invokeinterface #317,  1          // InterfaceMethod java/sql/Connection.close:()V
       240: goto          265
       243: astore_2
       244: aload_1
       245: ifnull        263
       248: aload_1
       249: invokeinterface #317,  1          // InterfaceMethod java/sql/Connection.close:()V
       254: goto          263
       257: astore_3
       258: aload_2
       259: aload_3
       260: invokevirtual #313                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       263: aload_2
       264: athrow
       265: goto          290
       268: astore_1
       269: getstatic     #320                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       272: ldc_w         #401                // String Failed to update taxes for {}.
       275: aload_1
       276: iconst_1
       277: anewarray     #403                // class java/lang/Object
       280: dup
       281: iconst_0
       282: aload_0
       283: invokevirtual #405                // Method getName:()Ljava/lang/String;
       286: aastore
       287: invokevirtual #406                // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
       290: return
      Exception table:
         from    to  target type
            14   193   206   Class java/lang/Throwable
           211   217   220   Class java/lang/Throwable
             4   230   243   Class java/lang/Throwable
           248   254   257   Class java/lang/Throwable
             0   265   268   Class java/lang/Exception
      LineNumberTable:
        line 348: 0
        line 349: 4
        line 351: 14
        line 353: 21
        line 354: 26
        line 355: 31
        line 357: 36
        line 358: 44
        line 359: 52
        line 360: 60
        line 361: 71
        line 365: 85
        line 366: 100
        line 367: 105
        line 369: 110
        line 371: 119
        line 372: 130
        line 373: 138
        line 374: 146
        line 375: 157
        line 377: 168
        line 378: 180
        line 379: 186
        line 380: 193
        line 348: 206
        line 380: 230
        line 348: 243
        line 384: 265
        line 381: 268
        line 383: 269
        line 385: 290
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           14     216     2    ps   Ljava/sql/PreparedStatement;
            4     261     1   con   Ljava/sql/Connection;
          269      21     1     e   Ljava/lang/Exception;
            0     291     0  this   Lext/mods/gameserver/model/residence/castle/Castle;
      StackMapTable: number_of_entries = 12
        frame_type = 253 /* append */
          offset_delta = 85
          locals = [ class java/sql/Connection, class java/sql/PreparedStatement ]
        frame_type = 251 /* same_frame_extended */
          offset_delta = 82
        frame_type = 101 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/model/residence/castle/Castle, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 7 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/model/residence/castle/Castle, class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 5 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 21 /* same */

  public void banishForeigners();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #409                // Method getCastleZone:()Lext/mods/gameserver/model/zone/type/CastleZone;
         4: aload_0
         5: getfield      #242                // Field _ownerId:I
         8: invokevirtual #413                // Method ext/mods/gameserver/model/zone/type/CastleZone.banishForeigners:(I)V
        11: return
      LineNumberTable:
        line 392: 0
        line 393: 11
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/gameserver/model/residence/castle/Castle;

  public ext.mods.gameserver.model.zone.type.SiegeZone getSiegeZone();
    descriptor: ()Lext/mods/gameserver/model/zone/type/SiegeZone;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #122                // Field _siegeZone:Lext/mods/gameserver/model/zone/type/SiegeZone;
         4: areturn
      LineNumberTable:
        line 397: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/residence/castle/Castle;

  public ext.mods.gameserver.model.zone.type.CastleZone getCastleZone();
    descriptor: ()Lext/mods/gameserver/model/zone/type/CastleZone;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #131                // Field _castleZone:Lext/mods/gameserver/model/zone/type/CastleZone;
         4: areturn
      LineNumberTable:
        line 402: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/residence/castle/Castle;

  public ext.mods.gameserver.model.zone.type.CastleTeleportZone getTeleZone();
    descriptor: ()Lext/mods/gameserver/model/zone/type/CastleTeleportZone;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #140                // Field _teleZone:Lext/mods/gameserver/model/zone/type/CastleTeleportZone;
         4: areturn
      LineNumberTable:
        line 407: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/residence/castle/Castle;

  public void oustAllPlayers();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #416                // Method getTeleZone:()Lext/mods/gameserver/model/zone/type/CastleTeleportZone;
         4: invokevirtual #420                // Method ext/mods/gameserver/model/zone/type/CastleTeleportZone.oustAllPlayers:()V
         7: return
      LineNumberTable:
        line 412: 0
        line 413: 7
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/residence/castle/Castle;

  public int getLeftCertificates();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #423                // Field _leftCertificates:I
         4: ireturn
      LineNumberTable:
        line 417: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/residence/castle/Castle;

  public void setLeftCertificates(int, boolean);
    descriptor: (IZ)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=7, args_size=3
         0: aload_0
         1: iload_1
         2: putfield      #423                // Field _leftCertificates:I
         5: iload_2
         6: ifeq          151
         9: invokestatic  #281                // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
        12: astore_3
        13: aload_3
        14: ldc_w         #426                // String UPDATE castle SET certificates=? WHERE id=?
        17: invokeinterface #289,  2          // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        22: astore        4
        24: aload         4
        26: iconst_1
        27: iload_1
        28: invokeinterface #301,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        33: aload         4
        35: iconst_2
        36: aload_0
        37: getfield      #77                 // Field _id:I
        40: invokeinterface #301,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        45: aload         4
        47: invokeinterface #305,  1          // InterfaceMethod java/sql/PreparedStatement.executeUpdate:()I
        52: pop
        53: aload         4
        55: ifnull        97
        58: aload         4
        60: invokeinterface #308,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
        65: goto          97
        68: astore        5
        70: aload         4
        72: ifnull        94
        75: aload         4
        77: invokeinterface #308,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
        82: goto          94
        85: astore        6
        87: aload         5
        89: aload         6
        91: invokevirtual #313                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        94: aload         5
        96: athrow
        97: aload_3
        98: ifnull        137
       101: aload_3
       102: invokeinterface #317,  1          // InterfaceMethod java/sql/Connection.close:()V
       107: goto          137
       110: astore        4
       112: aload_3
       113: ifnull        134
       116: aload_3
       117: invokeinterface #317,  1          // InterfaceMethod java/sql/Connection.close:()V
       122: goto          134
       125: astore        5
       127: aload         4
       129: aload         5
       131: invokevirtual #313                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       134: aload         4
       136: athrow
       137: goto          151
       140: astore_3
       141: getstatic     #320                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       144: ldc_w         #428                // String Couldn\'t update certificates amount.
       147: aload_3
       148: invokevirtual #326                // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
       151: return
      Exception table:
         from    to  target type
            24    53    68   Class java/lang/Throwable
            75    82    85   Class java/lang/Throwable
            13    97   110   Class java/lang/Throwable
           116   122   125   Class java/lang/Throwable
             9   137   140   Class java/lang/Exception
      LineNumberTable:
        line 427: 0
        line 429: 5
        line 431: 9
        line 432: 13
        line 434: 24
        line 435: 33
        line 436: 45
        line 437: 53
        line 431: 68
        line 437: 97
        line 431: 110
        line 441: 137
        line 438: 140
        line 440: 141
        line 443: 151
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           24      73     4    ps   Ljava/sql/PreparedStatement;
           13     124     3   con   Ljava/sql/Connection;
          141      10     3     e   Ljava/lang/Exception;
            0     152     0  this   Lext/mods/gameserver/model/residence/castle/Castle;
            0     152     1 leftCertificates   I
            0     152     2 storeInDb   Z
      StackMapTable: number_of_entries = 10
        frame_type = 255 /* full_frame */
          offset_delta = 68
          locals = [ class ext/mods/gameserver/model/residence/castle/Castle, int, int, class java/sql/Connection, class java/sql/PreparedStatement ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/model/residence/castle/Castle, int, int, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 14
          locals = [ class ext/mods/gameserver/model/residence/castle/Castle, int, int, class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 10 /* same */

  public void setOwner(ext.mods.gameserver.model.pledge.Clan);
    descriptor: (Lext/mods/gameserver/model/pledge/Clan;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=4, args_size=2
         0: aload_0
         1: getfield      #242                // Field _ownerId:I
         4: ifle          66
         7: aload_1
         8: ifnull        22
        11: aload_1
        12: invokevirtual #430                // Method ext/mods/gameserver/model/pledge/Clan.getClanId:()I
        15: aload_0
        16: getfield      #242                // Field _ownerId:I
        19: if_icmpeq     66
        22: invokestatic  #433                // Method ext/mods/gameserver/data/sql/ClanTable.getInstance:()Lext/mods/gameserver/data/sql/ClanTable;
        25: aload_0
        26: getfield      #242                // Field _ownerId:I
        29: invokevirtual #438                // Method ext/mods/gameserver/data/sql/ClanTable.getClan:(I)Lext/mods/gameserver/model/pledge/Clan;
        32: astore_2
        33: aload_2
        34: ifnull        66
        37: aload_2
        38: invokevirtual #214                // Method ext/mods/gameserver/model/pledge/Clan.getLeader:()Lext/mods/gameserver/model/pledge/ClanMember;
        41: invokevirtual #218                // Method ext/mods/gameserver/model/pledge/ClanMember.getPlayerInstance:()Lext/mods/gameserver/model/actor/Player;
        44: astore_3
        45: aload_3
        46: ifnull        61
        49: aload_3
        50: invokevirtual #442                // Method ext/mods/gameserver/model/actor/Player.getMountType:()I
        53: iconst_2
        54: if_icmpne     61
        57: aload_3
        58: invokevirtual #445                // Method ext/mods/gameserver/model/actor/Player.dismount:()V
        61: aload_2
        62: iconst_0
        63: invokevirtual #448                // Method ext/mods/gameserver/model/pledge/Clan.setCastle:(I)V
        66: aload_0
        67: aload_1
        68: invokevirtual #451                // Method updateOwnerInDB:(Lext/mods/gameserver/model/pledge/Clan;)V
        71: aload_0
        72: invokevirtual #169                // Method getSiege:()Lext/mods/gameserver/model/residence/castle/Siege;
        75: invokevirtual #454                // Method ext/mods/gameserver/model/residence/castle/Siege.isInProgress:()Z
        78: ifeq          88
        81: aload_0
        82: invokevirtual #169                // Method getSiege:()Lext/mods/gameserver/model/residence/castle/Siege;
        85: invokevirtual #457                // Method ext/mods/gameserver/model/residence/castle/Siege.midVictory:()V
        88: return
      LineNumberTable:
        line 451: 0
        line 453: 22
        line 454: 33
        line 456: 37
        line 457: 45
        line 458: 57
        line 460: 61
        line 464: 66
        line 466: 71
        line 467: 81
        line 468: 88
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           45      21     3 oldLeader   Lext/mods/gameserver/model/actor/Player;
           33      33     2 oldOwner   Lext/mods/gameserver/model/pledge/Clan;
            0      89     0  this   Lext/mods/gameserver/model/residence/castle/Castle;
            0      89     1  clan   Lext/mods/gameserver/model/pledge/Clan;
      StackMapTable: number_of_entries = 4
        frame_type = 22 /* same */
        frame_type = 253 /* append */
          offset_delta = 38
          locals = [ class ext/mods/gameserver/model/pledge/Clan, class ext/mods/gameserver/model/actor/Player ]
        frame_type = 249 /* chop */
          offset_delta = 4
        frame_type = 21 /* same */

  public void removeOwner();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=7, locals=7, args_size=1
         0: aload_0
         1: getfield      #242                // Field _ownerId:I
         4: ifgt          8
         7: return
         8: invokestatic  #433                // Method ext/mods/gameserver/data/sql/ClanTable.getInstance:()Lext/mods/gameserver/data/sql/ClanTable;
        11: aload_0
        12: getfield      #242                // Field _ownerId:I
        15: invokevirtual #438                // Method ext/mods/gameserver/data/sql/ClanTable.getClan:(I)Lext/mods/gameserver/model/pledge/Clan;
        18: astore_1
        19: aload_1
        20: ifnonnull     24
        23: return
        24: aload_1
        25: iconst_0
        26: invokevirtual #448                // Method ext/mods/gameserver/model/pledge/Clan.setCastle:(I)V
        29: aload_1
        30: iconst_1
        31: anewarray     #460                // class ext/mods/gameserver/network/serverpackets/L2GameServerPacket
        34: dup
        35: iconst_0
        36: new           #462                // class ext/mods/gameserver/network/serverpackets/PledgeShowInfoUpdate
        39: dup
        40: aload_1
        41: invokespecial #464                // Method ext/mods/gameserver/network/serverpackets/PledgeShowInfoUpdate."<init>":(Lext/mods/gameserver/model/pledge/Clan;)V
        44: aastore
        45: invokevirtual #466                // Method ext/mods/gameserver/model/pledge/Clan.broadcastToMembers:([Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        48: aload_0
        49: invokevirtual #169                // Method getSiege:()Lext/mods/gameserver/model/residence/castle/Siege;
        52: invokevirtual #470                // Method ext/mods/gameserver/model/residence/castle/Siege.getRegisteredClans:()Ljava/util/Map;
        55: aload_1
        56: invokeinterface #474,  2          // InterfaceMethod java/util/Map.remove:(Ljava/lang/Object;)Ljava/lang/Object;
        61: pop
        62: aload_0
        63: getfield      #30                 // Field _droppedTickets:Ljava/util/Set;
        66: invokeinterface #477,  1          // InterfaceMethod java/util/Set.iterator:()Ljava/util/Iterator;
        71: astore_2
        72: aload_2
        73: invokeinterface #108,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        78: ifeq          98
        81: aload_2
        82: invokeinterface #114,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        87: checkcast     #480                // class ext/mods/gameserver/model/item/instance/ItemInstance
        90: astore_3
        91: aload_3
        92: invokevirtual #482                // Method ext/mods/gameserver/model/item/instance/ItemInstance.decayMe:()V
        95: goto          72
        98: aload_0
        99: getfield      #30                 // Field _droppedTickets:Ljava/util/Set;
       102: invokeinterface #485,  1          // InterfaceMethod java/util/Set.clear:()V
       107: aload_1
       108: invokevirtual #488                // Method ext/mods/gameserver/model/pledge/Clan.getOnlineMembers:()[Lext/mods/gameserver/model/actor/Player;
       111: astore_2
       112: aload_2
       113: arraylength
       114: istore_3
       115: iconst_0
       116: istore        4
       118: iload         4
       120: iload_3
       121: if_icmpge     172
       124: aload_2
       125: iload         4
       127: aaload
       128: astore        5
       130: aload         5
       132: invokevirtual #492                // Method ext/mods/gameserver/model/actor/Player.isClanLeader:()Z
       135: ifeq          145
       138: aload_0
       139: invokevirtual #495                // Method getSkillsLeader:()Ljava/util/Map;
       142: goto          149
       145: aload_0
       146: invokevirtual #498                // Method getSkillsMember:()Ljava/util/Map;
       149: astore        6
       151: aload         6
       153: aload_0
       154: aload         5
       156: invokedynamic #501,  0            // InvokeDynamic #0:accept:(Lext/mods/gameserver/model/residence/castle/Castle;Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/BiConsumer;
       161: invokeinterface #505,  2          // InterfaceMethod java/util/Map.forEach:(Ljava/util/function/BiConsumer;)V
       166: iinc          4, 1
       169: goto          118
       172: aload_0
       173: getfield      #35                 // Field _siegeGuards:Ljava/util/List;
       176: invokedynamic #509,  0            // InvokeDynamic #1:accept:()Ljava/util/function/Consumer;
       181: invokeinterface #512,  2          // InterfaceMethod java/util/List.forEach:(Ljava/util/function/Consumer;)V
       186: aload_0
       187: getfield      #35                 // Field _siegeGuards:Ljava/util/List;
       190: invokeinterface #517,  1          // InterfaceMethod java/util/List.clear:()V
       195: aload_0
       196: aconst_null
       197: invokevirtual #451                // Method updateOwnerInDB:(Lext/mods/gameserver/model/pledge/Clan;)V
       200: aload_0
       201: invokevirtual #169                // Method getSiege:()Lext/mods/gameserver/model/residence/castle/Siege;
       204: invokevirtual #454                // Method ext/mods/gameserver/model/residence/castle/Siege.isInProgress:()Z
       207: ifeq          220
       210: aload_0
       211: invokevirtual #169                // Method getSiege:()Lext/mods/gameserver/model/residence/castle/Siege;
       214: invokevirtual #457                // Method ext/mods/gameserver/model/residence/castle/Siege.midVictory:()V
       217: goto          225
       220: aload_0
       221: aload_1
       222: invokevirtual #518                // Method checkItemsForClan:(Lext/mods/gameserver/model/pledge/Clan;)V
       225: return
      LineNumberTable:
        line 475: 0
        line 476: 7
        line 478: 8
        line 479: 19
        line 480: 23
        line 482: 24
        line 483: 29
        line 485: 48
        line 487: 62
        line 488: 91
        line 490: 98
        line 492: 107
        line 494: 130
        line 495: 151
        line 492: 166
        line 504: 172
        line 505: 186
        line 507: 195
        line 509: 200
        line 510: 210
        line 512: 220
        line 513: 225
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           91       4     3  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
          151      15     6 skill   Ljava/util/Map;
          130      36     5 player   Lext/mods/gameserver/model/actor/Player;
            0     226     0  this   Lext/mods/gameserver/model/residence/castle/Castle;
           19     207     1  clan   Lext/mods/gameserver/model/pledge/Clan;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
          151      15     6 skill   Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Integer;>;
      StackMapTable: number_of_entries = 10
        frame_type = 8 /* same */
        frame_type = 252 /* append */
          offset_delta = 15
          locals = [ class ext/mods/gameserver/model/pledge/Clan ]
        frame_type = 252 /* append */
          offset_delta = 47
          locals = [ class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 25
        frame_type = 254 /* append */
          offset_delta = 19
          locals = [ class "[Lext/mods/gameserver/model/actor/Player;", int, int ]
        frame_type = 252 /* append */
          offset_delta = 26
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 67 /* same_locals_1_stack_item */
          stack = [ class java/util/Map ]
        frame_type = 255 /* full_frame */
          offset_delta = 22
          locals = [ class ext/mods/gameserver/model/residence/castle/Castle, class ext/mods/gameserver/model/pledge/Clan ]
          stack = []
        frame_type = 47 /* same */
        frame_type = 4 /* same */

  public void setCurrentTaxPercent(int, boolean);
    descriptor: (IZ)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=7, args_size=3
         0: aload_0
         1: getfield      #521                // Field _currentTaxPercent:I
         4: iload_1
         5: if_icmpne     9
         8: return
         9: aload_0
        10: iload_1
        11: putfield      #521                // Field _currentTaxPercent:I
        14: aload_0
        15: aload_0
        16: getfield      #521                // Field _currentTaxPercent:I
        19: i2d
        20: ldc2_w        #248                // double 100.0d
        23: ddiv
        24: putfield      #524                // Field _taxRate:D
        27: iload_2
        28: ifeq          173
        31: invokestatic  #281                // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
        34: astore_3
        35: aload_3
        36: ldc_w         #528                // String UPDATE castle SET currentTaxPercent=? WHERE id=?
        39: invokeinterface #289,  2          // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        44: astore        4
        46: aload         4
        48: iconst_1
        49: iload_1
        50: invokeinterface #301,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        55: aload         4
        57: iconst_2
        58: aload_0
        59: getfield      #77                 // Field _id:I
        62: invokeinterface #301,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        67: aload         4
        69: invokeinterface #305,  1          // InterfaceMethod java/sql/PreparedStatement.executeUpdate:()I
        74: pop
        75: aload         4
        77: ifnull        119
        80: aload         4
        82: invokeinterface #308,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
        87: goto          119
        90: astore        5
        92: aload         4
        94: ifnull        116
        97: aload         4
        99: invokeinterface #308,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       104: goto          116
       107: astore        6
       109: aload         5
       111: aload         6
       113: invokevirtual #313                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       116: aload         5
       118: athrow
       119: aload_3
       120: ifnull        159
       123: aload_3
       124: invokeinterface #317,  1          // InterfaceMethod java/sql/Connection.close:()V
       129: goto          159
       132: astore        4
       134: aload_3
       135: ifnull        156
       138: aload_3
       139: invokeinterface #317,  1          // InterfaceMethod java/sql/Connection.close:()V
       144: goto          156
       147: astore        5
       149: aload         4
       151: aload         5
       153: invokevirtual #313                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       156: aload         4
       158: athrow
       159: goto          173
       162: astore_3
       163: getstatic     #320                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       166: ldc_w         #530                // String Couldn\'t update tax amount.
       169: aload_3
       170: invokevirtual #326                // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
       173: return
      Exception table:
         from    to  target type
            46    75    90   Class java/lang/Throwable
            97   104   107   Class java/lang/Throwable
            35   119   132   Class java/lang/Throwable
           138   144   147   Class java/lang/Throwable
            31   159   162   Class java/lang/Exception
      LineNumberTable:
        line 517: 0
        line 518: 8
        line 520: 9
        line 521: 14
        line 523: 27
        line 525: 31
        line 526: 35
        line 528: 46
        line 529: 55
        line 530: 67
        line 531: 75
        line 525: 90
        line 531: 119
        line 525: 132
        line 535: 159
        line 532: 162
        line 534: 163
        line 537: 173
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           46      73     4    ps   Ljava/sql/PreparedStatement;
           35     124     3   con   Ljava/sql/Connection;
          163      10     3     e   Ljava/lang/Exception;
            0     174     0  this   Lext/mods/gameserver/model/residence/castle/Castle;
            0     174     1 value   I
            0     174     2  save   Z
      StackMapTable: number_of_entries = 11
        frame_type = 9 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 80
          locals = [ class ext/mods/gameserver/model/residence/castle/Castle, int, int, class java/sql/Connection, class java/sql/PreparedStatement ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/model/residence/castle/Castle, int, int, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 14
          locals = [ class ext/mods/gameserver/model/residence/castle/Castle, int, int, class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 10 /* same */

  public void setNextTaxPercent(int, boolean);
    descriptor: (IZ)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=7, args_size=3
         0: aload_0
         1: getfield      #532                // Field _nextTaxPercent:I
         4: iload_1
         5: if_icmpne     9
         8: return
         9: aload_0
        10: iload_1
        11: putfield      #532                // Field _nextTaxPercent:I
        14: iload_2
        15: ifeq          160
        18: invokestatic  #281                // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
        21: astore_3
        22: aload_3
        23: ldc_w         #535                // String UPDATE castle SET nextTaxPercent=? WHERE id=?
        26: invokeinterface #289,  2          // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        31: astore        4
        33: aload         4
        35: iconst_1
        36: iload_1
        37: invokeinterface #301,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        42: aload         4
        44: iconst_2
        45: aload_0
        46: getfield      #77                 // Field _id:I
        49: invokeinterface #301,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        54: aload         4
        56: invokeinterface #305,  1          // InterfaceMethod java/sql/PreparedStatement.executeUpdate:()I
        61: pop
        62: aload         4
        64: ifnull        106
        67: aload         4
        69: invokeinterface #308,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
        74: goto          106
        77: astore        5
        79: aload         4
        81: ifnull        103
        84: aload         4
        86: invokeinterface #308,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
        91: goto          103
        94: astore        6
        96: aload         5
        98: aload         6
       100: invokevirtual #313                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       103: aload         5
       105: athrow
       106: aload_3
       107: ifnull        146
       110: aload_3
       111: invokeinterface #317,  1          // InterfaceMethod java/sql/Connection.close:()V
       116: goto          146
       119: astore        4
       121: aload_3
       122: ifnull        143
       125: aload_3
       126: invokeinterface #317,  1          // InterfaceMethod java/sql/Connection.close:()V
       131: goto          143
       134: astore        5
       136: aload         4
       138: aload         5
       140: invokevirtual #313                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       143: aload         4
       145: athrow
       146: goto          160
       149: astore_3
       150: getstatic     #320                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       153: ldc_w         #530                // String Couldn\'t update tax amount.
       156: aload_3
       157: invokevirtual #326                // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
       160: return
      Exception table:
         from    to  target type
            33    62    77   Class java/lang/Throwable
            84    91    94   Class java/lang/Throwable
            22   106   119   Class java/lang/Throwable
           125   131   134   Class java/lang/Throwable
            18   146   149   Class java/lang/Exception
      LineNumberTable:
        line 541: 0
        line 542: 8
        line 544: 9
        line 546: 14
        line 548: 18
        line 549: 22
        line 551: 33
        line 552: 42
        line 553: 54
        line 554: 62
        line 548: 77
        line 554: 106
        line 548: 119
        line 558: 146
        line 555: 149
        line 557: 150
        line 560: 160
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           33      73     4    ps   Ljava/sql/PreparedStatement;
           22     124     3   con   Ljava/sql/Connection;
          150      10     3     e   Ljava/lang/Exception;
            0     161     0  this   Lext/mods/gameserver/model/residence/castle/Castle;
            0     161     1 value   I
            0     161     2  save   Z
      StackMapTable: number_of_entries = 11
        frame_type = 9 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 67
          locals = [ class ext/mods/gameserver/model/residence/castle/Castle, int, int, class java/sql/Connection, class java/sql/PreparedStatement ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/model/residence/castle/Castle, int, int, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 14
          locals = [ class ext/mods/gameserver/model/residence/castle/Castle, int, int, class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 10 /* same */

  public void spawnDoors(boolean);
    descriptor: (Z)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=4, args_size=2
         0: aload_0
         1: getfield      #537                // Field _doors:Ljava/util/List;
         4: invokeinterface #540,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
         9: astore_2
        10: aload_2
        11: invokeinterface #108,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        16: ifeq          79
        19: aload_2
        20: invokeinterface #114,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        25: checkcast     #541                // class ext/mods/gameserver/model/actor/instance/Door
        28: astore_3
        29: aload_3
        30: invokevirtual #543                // Method ext/mods/gameserver/model/actor/instance/Door.isDead:()Z
        33: ifeq          40
        36: aload_3
        37: invokevirtual #546                // Method ext/mods/gameserver/model/actor/instance/Door.doRevive:()V
        40: aload_3
        41: invokevirtual #549                // Method ext/mods/gameserver/model/actor/instance/Door.closeMe:()V
        44: aload_3
        45: invokevirtual #552                // Method ext/mods/gameserver/model/actor/instance/Door.getStatus:()Lext/mods/gameserver/model/actor/status/DoorStatus;
        48: iload_1
        49: ifeq          65
        52: aload_3
        53: invokevirtual #552                // Method ext/mods/gameserver/model/actor/instance/Door.getStatus:()Lext/mods/gameserver/model/actor/status/DoorStatus;
        56: invokevirtual #556                // Method ext/mods/gameserver/model/actor/status/DoorStatus.getMaxHp:()I
        59: iconst_2
        60: idiv
        61: i2d
        62: goto          73
        65: aload_3
        66: invokevirtual #552                // Method ext/mods/gameserver/model/actor/instance/Door.getStatus:()Lext/mods/gameserver/model/actor/status/DoorStatus;
        69: invokevirtual #556                // Method ext/mods/gameserver/model/actor/status/DoorStatus.getMaxHp:()I
        72: i2d
        73: invokevirtual #561                // Method ext/mods/gameserver/model/actor/status/DoorStatus.setHp:(D)V
        76: goto          10
        79: return
      LineNumberTable:
        line 568: 0
        line 570: 29
        line 571: 36
        line 573: 40
        line 574: 44
        line 575: 76
        line 576: 79
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           29      47     3  door   Lext/mods/gameserver/model/actor/instance/Door;
            0      80     0  this   Lext/mods/gameserver/model/residence/castle/Castle;
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
          locals = [ class ext/mods/gameserver/model/residence/castle/Castle, int, class java/util/Iterator, class ext/mods/gameserver/model/actor/instance/Door ]
          stack = [ class ext/mods/gameserver/model/actor/status/DoorStatus, double ]
        frame_type = 249 /* chop */
          offset_delta = 5

  public void upgradeDoor(int, int, boolean);
    descriptor: (IIZ)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=9, args_size=4
         0: aload_0
         1: iload_1
         2: invokevirtual #565                // Method getDoor:(I)Lext/mods/gameserver/model/actor/instance/Door;
         5: astore        4
         7: aload         4
         9: ifnonnull     13
        12: return
        13: aload         4
        15: invokevirtual #552                // Method ext/mods/gameserver/model/actor/instance/Door.getStatus:()Lext/mods/gameserver/model/actor/status/DoorStatus;
        18: iload_2
        19: invokevirtual #569                // Method ext/mods/gameserver/model/actor/status/DoorStatus.setUpgradeHpRatio:(I)V
        22: aload         4
        24: invokevirtual #552                // Method ext/mods/gameserver/model/actor/instance/Door.getStatus:()Lext/mods/gameserver/model/actor/status/DoorStatus;
        27: invokevirtual #572                // Method ext/mods/gameserver/model/actor/status/DoorStatus.setMaxHp:()V
        30: iload_3
        31: ifeq          193
        34: invokestatic  #281                // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
        37: astore        5
        39: aload         5
        41: ldc_w         #575                // String REPLACE INTO castle_doorupgrade (doorId,hp,castleId) VALUES (?,?,?)
        44: invokeinterface #289,  2          // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        49: astore        6
        51: aload         6
        53: iconst_1
        54: iload_1
        55: invokeinterface #301,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        60: aload         6
        62: iconst_2
        63: iload_2
        64: invokeinterface #301,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        69: aload         6
        71: iconst_3
        72: aload_0
        73: getfield      #77                 // Field _id:I
        76: invokeinterface #301,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        81: aload         6
        83: invokeinterface #577,  1          // InterfaceMethod java/sql/PreparedStatement.execute:()Z
        88: pop
        89: aload         6
        91: ifnull        133
        94: aload         6
        96: invokeinterface #308,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       101: goto          133
       104: astore        7
       106: aload         6
       108: ifnull        130
       111: aload         6
       113: invokeinterface #308,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       118: goto          130
       121: astore        8
       123: aload         7
       125: aload         8
       127: invokevirtual #313                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       130: aload         7
       132: athrow
       133: aload         5
       135: ifnull        177
       138: aload         5
       140: invokeinterface #317,  1          // InterfaceMethod java/sql/Connection.close:()V
       145: goto          177
       148: astore        6
       150: aload         5
       152: ifnull        174
       155: aload         5
       157: invokeinterface #317,  1          // InterfaceMethod java/sql/Connection.close:()V
       162: goto          174
       165: astore        7
       167: aload         6
       169: aload         7
       171: invokevirtual #313                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       174: aload         6
       176: athrow
       177: goto          193
       180: astore        5
       182: getstatic     #320                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       185: ldc_w         #580                // String Couldn\'t upgrade castle doors.
       188: aload         5
       190: invokevirtual #326                // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
       193: return
      Exception table:
         from    to  target type
            51    89   104   Class java/lang/Throwable
           111   118   121   Class java/lang/Throwable
            39   133   148   Class java/lang/Throwable
           155   162   165   Class java/lang/Throwable
            34   177   180   Class java/lang/Exception
      LineNumberTable:
        line 586: 0
        line 587: 7
        line 588: 12
        line 590: 13
        line 591: 22
        line 593: 30
        line 595: 34
        line 596: 39
        line 598: 51
        line 599: 60
        line 600: 69
        line 601: 81
        line 602: 89
        line 595: 104
        line 602: 133
        line 595: 148
        line 606: 177
        line 603: 180
        line 605: 182
        line 608: 193
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           51      82     6    ps   Ljava/sql/PreparedStatement;
           39     138     5   con   Ljava/sql/Connection;
          182      11     5     e   Ljava/lang/Exception;
            0     194     0  this   Lext/mods/gameserver/model/residence/castle/Castle;
            0     194     1 doorId   I
            0     194     2    hp   I
            0     194     3    db   Z
            7     187     4  door   Lext/mods/gameserver/model/actor/instance/Door;
      StackMapTable: number_of_entries = 11
        frame_type = 252 /* append */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/model/actor/instance/Door ]
        frame_type = 255 /* full_frame */
          offset_delta = 90
          locals = [ class ext/mods/gameserver/model/residence/castle/Castle, int, int, int, class ext/mods/gameserver/model/actor/instance/Door, class java/sql/Connection, class java/sql/PreparedStatement ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/model/residence/castle/Castle, int, int, int, class ext/mods/gameserver/model/actor/instance/Door, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 78 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/model/residence/castle/Castle, int, int, int, class ext/mods/gameserver/model/actor/instance/Door, class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 12 /* same */

  public void removeDoorUpgrade();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=5, args_size=1
         0: aload_0
         1: getfield      #537                // Field _doors:Ljava/util/List;
         4: invokeinterface #540,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
         9: astore_1
        10: aload_1
        11: invokeinterface #108,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        16: ifeq          40
        19: aload_1
        20: invokeinterface #114,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        25: checkcast     #541                // class ext/mods/gameserver/model/actor/instance/Door
        28: astore_2
        29: aload_2
        30: invokevirtual #552                // Method ext/mods/gameserver/model/actor/instance/Door.getStatus:()Lext/mods/gameserver/model/actor/status/DoorStatus;
        33: iconst_1
        34: invokevirtual #569                // Method ext/mods/gameserver/model/actor/status/DoorStatus.setUpgradeHpRatio:(I)V
        37: goto          10
        40: invokestatic  #281                // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
        43: astore_1
        44: aload_1
        45: ldc_w         #582                // String DELETE FROM castle_doorupgrade WHERE castleId=?
        48: invokeinterface #289,  2          // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        53: astore_2
        54: aload_2
        55: iconst_1
        56: aload_0
        57: getfield      #77                 // Field _id:I
        60: invokeinterface #301,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        65: aload_2
        66: invokeinterface #305,  1          // InterfaceMethod java/sql/PreparedStatement.executeUpdate:()I
        71: pop
        72: aload_2
        73: ifnull        109
        76: aload_2
        77: invokeinterface #308,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
        82: goto          109
        85: astore_3
        86: aload_2
        87: ifnull        107
        90: aload_2
        91: invokeinterface #308,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
        96: goto          107
        99: astore        4
       101: aload_3
       102: aload         4
       104: invokevirtual #313                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       107: aload_3
       108: athrow
       109: aload_1
       110: ifnull        144
       113: aload_1
       114: invokeinterface #317,  1          // InterfaceMethod java/sql/Connection.close:()V
       119: goto          144
       122: astore_2
       123: aload_1
       124: ifnull        142
       127: aload_1
       128: invokeinterface #317,  1          // InterfaceMethod java/sql/Connection.close:()V
       133: goto          142
       136: astore_3
       137: aload_2
       138: aload_3
       139: invokevirtual #313                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       142: aload_2
       143: athrow
       144: goto          158
       147: astore_1
       148: getstatic     #320                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       151: ldc_w         #584                // String Couldn\'t delete door upgrade.
       154: aload_1
       155: invokevirtual #326                // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
       158: return
      Exception table:
         from    to  target type
            54    72    85   Class java/lang/Throwable
            90    96    99   Class java/lang/Throwable
            44   109   122   Class java/lang/Throwable
           127   133   136   Class java/lang/Throwable
            40   144   147   Class java/lang/Exception
      LineNumberTable:
        line 615: 0
        line 616: 29
        line 618: 40
        line 619: 44
        line 621: 54
        line 622: 65
        line 623: 72
        line 618: 85
        line 623: 109
        line 618: 122
        line 627: 144
        line 624: 147
        line 626: 148
        line 628: 158
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           29       8     2  door   Lext/mods/gameserver/model/actor/instance/Door;
           54      55     2    ps   Ljava/sql/PreparedStatement;
           44     100     1   con   Ljava/sql/Connection;
          148      10     1     e   Ljava/lang/Exception;
            0     159     0  this   Lext/mods/gameserver/model/residence/castle/Castle;
      StackMapTable: number_of_entries = 12
        frame_type = 252 /* append */
          offset_delta = 10
          locals = [ class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 29
        frame_type = 255 /* full_frame */
          offset_delta = 44
          locals = [ class ext/mods/gameserver/model/residence/castle/Castle, class java/sql/Connection, class java/sql/PreparedStatement ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/model/residence/castle/Castle, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 7 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/model/residence/castle/Castle, class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 5 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 10 /* same */

  public java.util.List<ext.mods.gameserver.model.item.MercenaryTicket> getTickets();
    descriptor: ()Ljava/util/List;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #23                 // Field _tickets:Ljava/util/List;
         4: areturn
      LineNumberTable:
        line 689: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/residence/castle/Castle;
    Signature: #994                         // ()Ljava/util/List<Lext/mods/gameserver/model/item/MercenaryTicket;>;

  public ext.mods.gameserver.model.item.MercenaryTicket getTicket(int);
    descriptor: (I)Lext/mods/gameserver/model/item/MercenaryTicket;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #23                 // Field _tickets:Ljava/util/List;
         4: invokeinterface #612,  1          // InterfaceMethod java/util/List.stream:()Ljava/util/stream/Stream;
         9: iload_1
        10: invokedynamic #616,  0            // InvokeDynamic #2:test:(I)Ljava/util/function/Predicate;
        15: invokeinterface #620,  2          // InterfaceMethod java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
        20: invokeinterface #626,  1          // InterfaceMethod java/util/stream/Stream.findFirst:()Ljava/util/Optional;
        25: aconst_null
        26: invokevirtual #630                // Method java/util/Optional.orElse:(Ljava/lang/Object;)Ljava/lang/Object;
        29: checkcast     #635                // class ext/mods/gameserver/model/item/MercenaryTicket
        32: areturn
      LineNumberTable:
        line 694: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      33     0  this   Lext/mods/gameserver/model/residence/castle/Castle;
            0      33     1 itemId   I

  public void addTicket(ext.mods.commons.data.StatSet);
    descriptor: (Lext/mods/commons/data/StatSet;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=2, args_size=2
         0: aload_0
         1: getfield      #23                 // Field _tickets:Ljava/util/List;
         4: new           #635                // class ext/mods/gameserver/model/item/MercenaryTicket
         7: dup
         8: aload_1
         9: invokespecial #637                // Method ext/mods/gameserver/model/item/MercenaryTicket."<init>":(Lext/mods/commons/data/StatSet;)V
        12: invokeinterface #638,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        17: pop
        18: return
      LineNumberTable:
        line 699: 0
        line 700: 18
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      19     0  this   Lext/mods/gameserver/model/residence/castle/Castle;
            0      19     1   set   Lext/mods/commons/data/StatSet;

  public java.util.Set<ext.mods.gameserver.model.item.instance.ItemInstance> getDroppedTickets();
    descriptor: ()Ljava/util/Set;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #30                 // Field _droppedTickets:Ljava/util/Set;
         4: areturn
      LineNumberTable:
        line 704: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/residence/castle/Castle;
    Signature: #999                         // ()Ljava/util/Set<Lext/mods/gameserver/model/item/instance/ItemInstance;>;

  public void addDroppedTicket(ext.mods.gameserver.model.item.instance.ItemInstance);
    descriptor: (Lext/mods/gameserver/model/item/instance/ItemInstance;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #30                 // Field _droppedTickets:Ljava/util/Set;
         4: aload_1
         5: invokeinterface #641,  2          // InterfaceMethod java/util/Set.add:(Ljava/lang/Object;)Z
        10: pop
        11: return
      LineNumberTable:
        line 709: 0
        line 710: 11
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/gameserver/model/residence/castle/Castle;
            0      12     1  item   Lext/mods/gameserver/model/item/instance/ItemInstance;

  public void removeDroppedTicket(ext.mods.gameserver.model.item.instance.ItemInstance);
    descriptor: (Lext/mods/gameserver/model/item/instance/ItemInstance;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #30                 // Field _droppedTickets:Ljava/util/Set;
         4: aload_1
         5: invokeinterface #642,  2          // InterfaceMethod java/util/Set.remove:(Ljava/lang/Object;)Z
        10: pop
        11: return
      LineNumberTable:
        line 714: 0
        line 715: 11
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/gameserver/model/residence/castle/Castle;
            0      12     1  item   Lext/mods/gameserver/model/item/instance/ItemInstance;

  public int getDroppedTicketsCount(int);
    descriptor: (I)I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #30                 // Field _droppedTickets:Ljava/util/Set;
         4: invokeinterface #644,  1          // InterfaceMethod java/util/Set.stream:()Ljava/util/stream/Stream;
         9: iload_1
        10: invokedynamic #645,  0            // InvokeDynamic #3:test:(I)Ljava/util/function/Predicate;
        15: invokeinterface #620,  2          // InterfaceMethod java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
        20: invokeinterface #646,  1          // InterfaceMethod java/util/stream/Stream.count:()J
        25: l2i
        26: ireturn
      LineNumberTable:
        line 719: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      27     0  this   Lext/mods/gameserver/model/residence/castle/Castle;
            0      27     1 itemId   I

  public boolean isTooCloseFromDroppedTicket(int, int, int);
    descriptor: (III)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=4, args_size=4
         0: aload_0
         1: getfield      #30                 // Field _droppedTickets:Ljava/util/Set;
         4: invokeinterface #644,  1          // InterfaceMethod java/util/Set.stream:()Ljava/util/stream/Stream;
         9: iload_1
        10: iload_2
        11: iload_3
        12: invokedynamic #649,  0            // InvokeDynamic #4:test:(III)Ljava/util/function/Predicate;
        17: invokeinterface #652,  2          // InterfaceMethod java/util/stream/Stream.anyMatch:(Ljava/util/function/Predicate;)Z
        22: ireturn
      LineNumberTable:
        line 724: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      23     0  this   Lext/mods/gameserver/model/residence/castle/Castle;
            0      23     1     x   I
            0      23     2     y   I
            0      23     3     z   I

  public void spawnSiegeGuardsOrMercenaries();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=7, locals=6, args_size=1
         0: aload_0
         1: getfield      #242                // Field _ownerId:I
         4: ifle          172
         7: invokestatic  #656                // Method ext/mods/gameserver/data/manager/SpawnManager.getInstance:()Lext/mods/gameserver/data/manager/SpawnManager;
        10: ldc_w         #661                // String pc_siege_warfare_start
        13: aload_0
        14: getfield      #77                 // Field _id:I
        17: invokestatic  #663                // Method java/lang/String.valueOf:(I)Ljava/lang/String;
        20: aconst_null
        21: aconst_null
        22: iconst_1
        23: invokevirtual #667                // Method ext/mods/gameserver/data/manager/SpawnManager.startSpawnTime:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)J
        26: pop2
        27: aload_0
        28: getfield      #30                 // Field _droppedTickets:Ljava/util/Set;
        31: invokeinterface #477,  1          // InterfaceMethod java/util/Set.iterator:()Ljava/util/Iterator;
        36: astore_1
        37: aload_1
        38: invokeinterface #108,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        43: ifeq          160
        46: aload_1
        47: invokeinterface #114,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        52: checkcast     #480                // class ext/mods/gameserver/model/item/instance/ItemInstance
        55: astore_2
        56: aload_0
        57: aload_2
        58: invokevirtual #671                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
        61: invokevirtual #674                // Method getTicket:(I)Lext/mods/gameserver/model/item/MercenaryTicket;
        64: astore_3
        65: aload_3
        66: ifnonnull     72
        69: goto          37
        72: new           #678                // class ext/mods/gameserver/model/spawn/Spawn
        75: dup
        76: aload_3
        77: invokevirtual #680                // Method ext/mods/gameserver/model/item/MercenaryTicket.getNpcId:()I
        80: invokespecial #683                // Method ext/mods/gameserver/model/spawn/Spawn."<init>":(I)V
        83: astore        4
        85: aload         4
        87: aload_2
        88: invokevirtual #684                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
        91: invokevirtual #688                // Method ext/mods/gameserver/model/spawn/Spawn.setLoc:(Lext/mods/gameserver/model/location/SpawnLocation;)V
        94: aload         4
        96: iconst_0
        97: invokevirtual #692                // Method ext/mods/gameserver/model/spawn/Spawn.doSpawn:(Z)Lext/mods/gameserver/model/actor/Npc;
       100: astore        5
       102: aload         5
       104: aload_0
       105: invokevirtual #696                // Method ext/mods/gameserver/model/actor/Npc.setResidence:(Lext/mods/gameserver/model/residence/Residence;)V
       108: aload_0
       109: getfield      #35                 // Field _siegeGuards:Ljava/util/List;
       112: aload         5
       114: invokeinterface #638,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       119: pop
       120: goto          153
       123: astore        4
       125: getstatic     #320                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       128: ldc_w         #702                // String Couldn\'t spawn npc ticket {}.
       131: aload         4
       133: iconst_1
       134: anewarray     #403                // class java/lang/Object
       137: dup
       138: iconst_0
       139: aload_3
       140: invokevirtual #680                // Method ext/mods/gameserver/model/item/MercenaryTicket.getNpcId:()I
       143: invokestatic  #147                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       146: aastore
       147: invokevirtual #406                // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
       150: goto          37
       153: aload_2
       154: invokevirtual #482                // Method ext/mods/gameserver/model/item/instance/ItemInstance.decayMe:()V
       157: goto          37
       160: aload_0
       161: getfield      #30                 // Field _droppedTickets:Ljava/util/Set;
       164: invokeinterface #485,  1          // InterfaceMethod java/util/Set.clear:()V
       169: goto          192
       172: invokestatic  #656                // Method ext/mods/gameserver/data/manager/SpawnManager.getInstance:()Lext/mods/gameserver/data/manager/SpawnManager;
       175: ldc_w         #704                // String siege_warfare_start
       178: aload_0
       179: getfield      #77                 // Field _id:I
       182: invokestatic  #663                // Method java/lang/String.valueOf:(I)Ljava/lang/String;
       185: aconst_null
       186: aconst_null
       187: iconst_1
       188: invokevirtual #667                // Method ext/mods/gameserver/data/manager/SpawnManager.startSpawnTime:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)J
       191: pop2
       192: return
      Exception table:
         from    to  target type
            72   120   123   Class java/lang/Exception
      LineNumberTable:
        line 736: 0
        line 738: 7
        line 740: 27
        line 742: 56
        line 743: 65
        line 744: 69
        line 748: 72
        line 749: 85
        line 751: 94
        line 752: 102
        line 754: 108
        line 760: 120
        line 756: 123
        line 758: 125
        line 759: 150
        line 762: 153
        line 763: 157
        line 765: 160
        line 768: 172
        line 769: 192
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           85      35     4 spawn   Lext/mods/gameserver/model/spawn/Spawn;
          102      18     5 guard   Lext/mods/gameserver/model/actor/Npc;
          125      28     4     e   Ljava/lang/Exception;
           65      92     3 ticket   Lext/mods/gameserver/model/item/MercenaryTicket;
           56     101     2  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
            0     193     0  this   Lext/mods/gameserver/model/residence/castle/Castle;
      StackMapTable: number_of_entries = 7
        frame_type = 252 /* append */
          offset_delta = 37
          locals = [ class java/util/Iterator ]
        frame_type = 253 /* append */
          offset_delta = 34
          locals = [ class ext/mods/gameserver/model/item/instance/ItemInstance, class ext/mods/gameserver/model/item/MercenaryTicket ]
        frame_type = 114 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 29 /* same */
        frame_type = 248 /* chop */
          offset_delta = 6
        frame_type = 11 /* same */
        frame_type = 19 /* same */

  public void despawnSiegeGuardsOrMercenaries();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=1, args_size=1
         0: aload_0
         1: getfield      #35                 // Field _siegeGuards:Ljava/util/List;
         4: invokedynamic #706,  0            // InvokeDynamic #5:accept:()Ljava/util/function/Consumer;
         9: invokeinterface #512,  2          // InterfaceMethod java/util/List.forEach:(Ljava/util/function/Consumer;)V
        14: aload_0
        15: getfield      #35                 // Field _siegeGuards:Ljava/util/List;
        18: invokeinterface #517,  1          // InterfaceMethod java/util/List.clear:()V
        23: invokestatic  #656                // Method ext/mods/gameserver/data/manager/SpawnManager.getInstance:()Lext/mods/gameserver/data/manager/SpawnManager;
        26: ldc_w         #661                // String pc_siege_warfare_start
        29: aload_0
        30: getfield      #77                 // Field _id:I
        33: invokestatic  #663                // Method java/lang/String.valueOf:(I)Ljava/lang/String;
        36: aconst_null
        37: aconst_null
        38: iconst_1
        39: invokevirtual #707                // Method ext/mods/gameserver/data/manager/SpawnManager.stopSpawnTime:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)J
        42: pop2
        43: invokestatic  #656                // Method ext/mods/gameserver/data/manager/SpawnManager.getInstance:()Lext/mods/gameserver/data/manager/SpawnManager;
        46: ldc_w         #704                // String siege_warfare_start
        49: aload_0
        50: getfield      #77                 // Field _id:I
        53: invokestatic  #663                // Method java/lang/String.valueOf:(I)Ljava/lang/String;
        56: aconst_null
        57: aconst_null
        58: iconst_1
        59: invokevirtual #707                // Method ext/mods/gameserver/data/manager/SpawnManager.stopSpawnTime:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)J
        62: pop2
        63: return
      LineNumberTable:
        line 776: 0
        line 777: 14
        line 779: 23
        line 780: 43
        line 781: 63
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      64     0  this   Lext/mods/gameserver/model/residence/castle/Castle;

  public java.util.List<ext.mods.gameserver.model.location.TowerSpawnLocation> getControlTowers();
    descriptor: ()Ljava/util/List;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #38                 // Field _controlTowers:Ljava/util/List;
         4: areturn
      LineNumberTable:
        line 785: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/residence/castle/Castle;
    Signature: #1019                        // ()Ljava/util/List<Lext/mods/gameserver/model/location/TowerSpawnLocation;>;

  public int getAliveLifeTowerCount();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #38                 // Field _controlTowers:Ljava/util/List;
         4: invokeinterface #612,  1          // InterfaceMethod java/util/List.stream:()Ljava/util/stream/Stream;
         9: aload_0
        10: invokedynamic #710,  0            // InvokeDynamic #6:test:(Lext/mods/gameserver/model/residence/castle/Castle;)Ljava/util/function/Predicate;
        15: invokeinterface #620,  2          // InterfaceMethod java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
        20: invokeinterface #646,  1          // InterfaceMethod java/util/stream/Stream.count:()J
        25: l2i
        26: ireturn
      LineNumberTable:
        line 790: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      27     0  this   Lext/mods/gameserver/model/residence/castle/Castle;

  public int getCircletId();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #72                 // Field _circletId:I
         4: ireturn
      LineNumberTable:
        line 795: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/residence/castle/Castle;

  public void setCircletId(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #72                 // Field _circletId:I
         5: return
      LineNumberTable:
        line 800: 0
        line 801: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/residence/castle/Castle;
            0       6     1 circletId   I

  public ext.mods.gameserver.model.residence.castle.Siege getSiege();
    descriptor: ()Lext/mods/gameserver/model/residence/castle/Siege;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #713                // Field _siege:Lext/mods/gameserver/model/residence/castle/Siege;
         4: areturn
      LineNumberTable:
        line 805: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/residence/castle/Castle;

  public void launchSiege();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=1, args_size=1
         0: aload_0
         1: new           #205                // class ext/mods/gameserver/model/residence/castle/Siege
         4: dup
         5: aload_0
         6: invokespecial #717                // Method ext/mods/gameserver/model/residence/castle/Siege."<init>":(Lext/mods/gameserver/model/residence/castle/Castle;)V
         9: putfield      #713                // Field _siege:Lext/mods/gameserver/model/residence/castle/Siege;
        12: return
      LineNumberTable:
        line 810: 0
        line 811: 12
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      13     0  this   Lext/mods/gameserver/model/residence/castle/Castle;

  public java.util.Calendar getSiegeDate();
    descriptor: ()Ljava/util/Calendar;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #720                // Field _siegeDate:Ljava/util/Calendar;
         4: areturn
      LineNumberTable:
        line 815: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/residence/castle/Castle;

  public void setSiegeDate(java.util.Calendar);
    descriptor: (Ljava/util/Calendar;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: putfield      #720                // Field _siegeDate:Ljava/util/Calendar;
         5: return
      LineNumberTable:
        line 820: 0
        line 821: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/residence/castle/Castle;
            0       6     1 siegeDate   Ljava/util/Calendar;

  public boolean isTimeRegistrationOver();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #45                 // Field _isTimeRegistrationOver:Z
         4: ireturn
      LineNumberTable:
        line 825: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/residence/castle/Castle;

  public void setTimeRegistrationOver(boolean);
    descriptor: (Z)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #45                 // Field _isTimeRegistrationOver:Z
         5: return
      LineNumberTable:
        line 830: 0
        line 831: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/residence/castle/Castle;
            0       6     1   val   Z

  public int getCurrentTaxPercent();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #521                // Field _currentTaxPercent:I
         4: ireturn
      LineNumberTable:
        line 835: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/residence/castle/Castle;

  public int getNextTaxPercent();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #532                // Field _nextTaxPercent:I
         4: ireturn
      LineNumberTable:
        line 840: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/residence/castle/Castle;

  public double getTaxRate();
    descriptor: ()D
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #524                // Field _taxRate:D
         4: dreturn
      LineNumberTable:
        line 845: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/residence/castle/Castle;

  public long getTreasury();
    descriptor: ()J
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #269                // Field _treasury:J
         4: lreturn
      LineNumberTable:
        line 850: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/residence/castle/Castle;

  public void setTreasury(long);
    descriptor: (J)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=2
         0: aload_0
         1: lload_1
         2: putfield      #269                // Field _treasury:J
         5: return
      LineNumberTable:
        line 855: 0
        line 856: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/residence/castle/Castle;
            0       6     1 treasury   J

  public long getTaxRevenue();
    descriptor: ()J
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #335                // Field _taxRevenue:J
         4: lreturn
      LineNumberTable:
        line 860: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/residence/castle/Castle;

  public void setTaxRevenue(long);
    descriptor: (J)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=2
         0: aload_0
         1: lload_1
         2: putfield      #335                // Field _taxRevenue:J
         5: return
      LineNumberTable:
        line 865: 0
        line 866: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/residence/castle/Castle;
            0       6     1 taxRevenue   J

  public long getSeedIncome();
    descriptor: ()J
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #342                // Field _seedIncome:J
         4: lreturn
      LineNumberTable:
        line 870: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/residence/castle/Castle;

  public void setSeedIncome(long);
    descriptor: (J)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=2
         0: aload_0
         1: lload_1
         2: putfield      #342                // Field _seedIncome:J
         5: return
      LineNumberTable:
        line 875: 0
        line 876: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/residence/castle/Castle;
            0       6     1 seedIncome   J

  public java.util.Map<java.lang.Integer, ext.mods.gameserver.model.location.SpawnLocation> getArtifacts();
    descriptor: ()Ljava/util/Map;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #42                 // Field _artifacts:Ljava/util/Map;
         4: areturn
      LineNumberTable:
        line 880: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/residence/castle/Castle;
    Signature: #1038                        // ()Ljava/util/Map<Ljava/lang/Integer;Lext/mods/gameserver/model/location/SpawnLocation;>;

  public java.util.Map<java.lang.Integer, ext.mods.gameserver.model.records.custom.SiegeInfo> getSieges();
    descriptor: ()Ljava/util/Map;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #49                 // Field _sieges:Ljava/util/Map;
         4: areturn
      LineNumberTable:
        line 885: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/residence/castle/Castle;
    Signature: #1040                        // ()Ljava/util/Map<Ljava/lang/Integer;Lext/mods/gameserver/model/records/custom/SiegeInfo;>;

  public java.util.Map<java.lang.Integer, java.lang.Integer> getSkillsMember();
    descriptor: ()Ljava/util/Map;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #52                 // Field _skillMember:Ljava/util/Map;
         4: areturn
      LineNumberTable:
        line 890: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/residence/castle/Castle;
    Signature: #1041                        // ()Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Integer;>;

  public java.util.Map<java.lang.Integer, java.lang.Integer> getSkillsLeader();
    descriptor: ()Ljava/util/Map;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #55                 // Field _skillLeader:Ljava/util/Map;
         4: areturn
      LineNumberTable:
        line 895: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/residence/castle/Castle;
    Signature: #1041                        // ()Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Integer;>;

  public java.util.Map<java.lang.Integer, ext.mods.gameserver.model.pledge.ItemInfo> getItemsMember();
    descriptor: ()Ljava/util/Map;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #58                 // Field _itemsMember:Ljava/util/Map;
         4: areturn
      LineNumberTable:
        line 900: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/residence/castle/Castle;
    Signature: #1043                        // ()Ljava/util/Map<Ljava/lang/Integer;Lext/mods/gameserver/model/pledge/ItemInfo;>;

  public java.util.Map<java.lang.Integer, ext.mods.gameserver.model.pledge.ItemInfo> getItemsLeader();
    descriptor: ()Ljava/util/Map;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #61                 // Field _itemsLeader:Ljava/util/Map;
         4: areturn
      LineNumberTable:
        line 905: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/residence/castle/Castle;
    Signature: #1043                        // ()Ljava/util/Map<Ljava/lang/Integer;Lext/mods/gameserver/model/pledge/ItemInfo;>;

  public boolean isGoodArtifact(ext.mods.gameserver.model.WorldObject);
    descriptor: (Lext/mods/gameserver/model/WorldObject;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=3, args_size=2
         0: aload_1
         1: instanceof    #724                // class ext/mods/gameserver/model/actor/instance/HolyThing
         4: ifeq          35
         7: aload_1
         8: checkcast     #724                // class ext/mods/gameserver/model/actor/instance/HolyThing
        11: astore_2
        12: aload_0
        13: getfield      #42                 // Field _artifacts:Ljava/util/Map;
        16: aload_2
        17: invokevirtual #726                // Method ext/mods/gameserver/model/actor/instance/HolyThing.getNpcId:()I
        20: invokestatic  #147                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        23: invokeinterface #153,  2          // InterfaceMethod java/util/Map.containsKey:(Ljava/lang/Object;)Z
        28: ifeq          35
        31: iconst_1
        32: goto          36
        35: iconst_0
        36: ireturn
      LineNumberTable:
        line 910: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           12      23     2 holyThing   Lext/mods/gameserver/model/actor/instance/HolyThing;
            0      37     0  this   Lext/mods/gameserver/model/residence/castle/Castle;
            0      37     1 object   Lext/mods/gameserver/model/WorldObject;
      StackMapTable: number_of_entries = 2
        frame_type = 35 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public int getTrapUpgradeLevel(int);
    descriptor: (I)I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=3, args_size=2
         0: aload_0
         1: getfield      #38                 // Field _controlTowers:Ljava/util/List;
         4: iload_1
         5: invokeinterface #727,  2          // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
        10: checkcast     #730                // class ext/mods/gameserver/model/location/TowerSpawnLocation
        13: astore_2
        14: aload_2
        15: ifnull        25
        18: aload_2
        19: invokevirtual #732                // Method ext/mods/gameserver/model/location/TowerSpawnLocation.getUpgradeLevel:()I
        22: goto          26
        25: iconst_0
        26: ireturn
      LineNumberTable:
        line 919: 0
        line 920: 14
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      27     0  this   Lext/mods/gameserver/model/residence/castle/Castle;
            0      27     1 towerIndex   I
           14      13     2 spawn   Lext/mods/gameserver/model/location/TowerSpawnLocation;
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 25
          locals = [ class ext/mods/gameserver/model/location/TowerSpawnLocation ]
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public void setTrapUpgrade(int, int, boolean);
    descriptor: (IIZ)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=8, args_size=4
         0: iload_3
         1: ifeq          163
         4: invokestatic  #281                // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
         7: astore        4
         9: aload         4
        11: ldc_w         #735                // String REPLACE INTO castle_trapupgrade (castleId, towerIndex, level) VALUES (?,?,?)
        14: invokeinterface #289,  2          // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        19: astore        5
        21: aload         5
        23: iconst_1
        24: aload_0
        25: getfield      #77                 // Field _id:I
        28: invokeinterface #301,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        33: aload         5
        35: iconst_2
        36: iload_1
        37: invokeinterface #301,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        42: aload         5
        44: iconst_3
        45: iload_2
        46: invokeinterface #301,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        51: aload         5
        53: invokeinterface #577,  1          // InterfaceMethod java/sql/PreparedStatement.execute:()Z
        58: pop
        59: aload         5
        61: ifnull        103
        64: aload         5
        66: invokeinterface #308,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
        71: goto          103
        74: astore        6
        76: aload         5
        78: ifnull        100
        81: aload         5
        83: invokeinterface #308,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
        88: goto          100
        91: astore        7
        93: aload         6
        95: aload         7
        97: invokevirtual #313                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       100: aload         6
       102: athrow
       103: aload         4
       105: ifnull        147
       108: aload         4
       110: invokeinterface #317,  1          // InterfaceMethod java/sql/Connection.close:()V
       115: goto          147
       118: astore        5
       120: aload         4
       122: ifnull        144
       125: aload         4
       127: invokeinterface #317,  1          // InterfaceMethod java/sql/Connection.close:()V
       132: goto          144
       135: astore        6
       137: aload         5
       139: aload         6
       141: invokevirtual #313                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       144: aload         5
       146: athrow
       147: goto          163
       150: astore        4
       152: getstatic     #320                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       155: ldc_w         #737                // String Couldn\'t replace trap upgrade.
       158: aload         4
       160: invokevirtual #326                // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
       163: aload_0
       164: getfield      #38                 // Field _controlTowers:Ljava/util/List;
       167: iload_1
       168: invokeinterface #727,  2          // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
       173: checkcast     #730                // class ext/mods/gameserver/model/location/TowerSpawnLocation
       176: astore        4
       178: aload         4
       180: ifnull        189
       183: aload         4
       185: iload_2
       186: invokevirtual #739                // Method ext/mods/gameserver/model/location/TowerSpawnLocation.setUpgradeLevel:(I)V
       189: return
      Exception table:
         from    to  target type
            21    59    74   Class java/lang/Throwable
            81    88    91   Class java/lang/Throwable
             9   103   118   Class java/lang/Throwable
           125   132   135   Class java/lang/Throwable
             4   147   150   Class java/lang/Exception
      LineNumberTable:
        line 931: 0
        line 933: 4
        line 934: 9
        line 936: 21
        line 937: 33
        line 938: 42
        line 939: 51
        line 940: 59
        line 933: 74
        line 940: 103
        line 933: 118
        line 944: 147
        line 941: 150
        line 943: 152
        line 947: 163
        line 948: 178
        line 949: 183
        line 950: 189
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           21      82     5    ps   Ljava/sql/PreparedStatement;
            9     138     4   con   Ljava/sql/Connection;
          152      11     4     e   Ljava/lang/Exception;
            0     190     0  this   Lext/mods/gameserver/model/residence/castle/Castle;
            0     190     1 towerIndex   I
            0     190     2 level   I
            0     190     3  save   Z
          178      12     4 spawn   Lext/mods/gameserver/model/location/TowerSpawnLocation;
      StackMapTable: number_of_entries = 11
        frame_type = 255 /* full_frame */
          offset_delta = 74
          locals = [ class ext/mods/gameserver/model/residence/castle/Castle, int, int, int, class java/sql/Connection, class java/sql/PreparedStatement ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/model/residence/castle/Castle, int, int, int, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 78 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/model/residence/castle/Castle, int, int, int, class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 12 /* same */
        frame_type = 252 /* append */
          offset_delta = 25
          locals = [ class ext/mods/gameserver/model/location/TowerSpawnLocation ]

  public void removeTrapUpgrade();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=5, args_size=1
         0: aload_0
         1: getfield      #38                 // Field _controlTowers:Ljava/util/List;
         4: invokeinterface #540,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
         9: astore_1
        10: aload_1
        11: invokeinterface #108,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        16: ifeq          37
        19: aload_1
        20: invokeinterface #114,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        25: checkcast     #730                // class ext/mods/gameserver/model/location/TowerSpawnLocation
        28: astore_2
        29: aload_2
        30: iconst_0
        31: invokevirtual #739                // Method ext/mods/gameserver/model/location/TowerSpawnLocation.setUpgradeLevel:(I)V
        34: goto          10
        37: invokestatic  #281                // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
        40: astore_1
        41: aload_1
        42: ldc_w         #742                // String DELETE FROM castle_trapupgrade WHERE castleId=?
        45: invokeinterface #289,  2          // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        50: astore_2
        51: aload_2
        52: iconst_1
        53: aload_0
        54: getfield      #77                 // Field _id:I
        57: invokeinterface #301,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        62: aload_2
        63: invokeinterface #305,  1          // InterfaceMethod java/sql/PreparedStatement.executeUpdate:()I
        68: pop
        69: aload_2
        70: ifnull        106
        73: aload_2
        74: invokeinterface #308,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
        79: goto          106
        82: astore_3
        83: aload_2
        84: ifnull        104
        87: aload_2
        88: invokeinterface #308,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
        93: goto          104
        96: astore        4
        98: aload_3
        99: aload         4
       101: invokevirtual #313                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       104: aload_3
       105: athrow
       106: aload_1
       107: ifnull        141
       110: aload_1
       111: invokeinterface #317,  1          // InterfaceMethod java/sql/Connection.close:()V
       116: goto          141
       119: astore_2
       120: aload_1
       121: ifnull        139
       124: aload_1
       125: invokeinterface #317,  1          // InterfaceMethod java/sql/Connection.close:()V
       130: goto          139
       133: astore_3
       134: aload_2
       135: aload_3
       136: invokevirtual #313                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       139: aload_2
       140: athrow
       141: goto          155
       144: astore_1
       145: getstatic     #320                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       148: ldc_w         #744                // String Couldn\'t delete trap upgrade.
       151: aload_1
       152: invokevirtual #326                // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
       155: return
      Exception table:
         from    to  target type
            51    69    82   Class java/lang/Throwable
            87    93    96   Class java/lang/Throwable
            41   106   119   Class java/lang/Throwable
           124   130   133   Class java/lang/Throwable
            37   141   144   Class java/lang/Exception
      LineNumberTable:
        line 957: 0
        line 958: 29
        line 960: 37
        line 961: 41
        line 963: 51
        line 964: 62
        line 965: 69
        line 960: 82
        line 965: 106
        line 960: 119
        line 969: 141
        line 966: 144
        line 968: 145
        line 970: 155
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           29       5     2    ts   Lext/mods/gameserver/model/location/TowerSpawnLocation;
           51      55     2    ps   Ljava/sql/PreparedStatement;
           41     100     1   con   Ljava/sql/Connection;
          145      10     1     e   Ljava/lang/Exception;
            0     156     0  this   Lext/mods/gameserver/model/residence/castle/Castle;
      StackMapTable: number_of_entries = 12
        frame_type = 252 /* append */
          offset_delta = 10
          locals = [ class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 26
        frame_type = 255 /* full_frame */
          offset_delta = 44
          locals = [ class ext/mods/gameserver/model/residence/castle/Castle, class java/sql/Connection, class java/sql/PreparedStatement ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/model/residence/castle/Castle, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 7 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/model/residence/castle/Castle, class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 5 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 10 /* same */

  public void checkItemsForMember(ext.mods.gameserver.model.pledge.ClanMember);
    descriptor: (Lext/mods/gameserver/model/pledge/ClanMember;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=7, args_size=2
         0: aload_1
         1: invokevirtual #218                // Method ext/mods/gameserver/model/pledge/ClanMember.getPlayerInstance:()Lext/mods/gameserver/model/actor/Player;
         4: astore_2
         5: aload_2
         6: ifnull        16
         9: aload_2
        10: invokevirtual #746                // Method ext/mods/gameserver/model/actor/Player.checkItemRestriction:()V
        13: goto          161
        16: invokestatic  #281                // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
        19: astore_3
        20: aload_3
        21: ldc_w         #749                // String UPDATE items SET loc=\'INVENTORY\' WHERE item_id IN (?,6841) AND owner_id=? AND loc=\'PAPERDOLL\'
        24: invokeinterface #289,  2          // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        29: astore        4
        31: aload         4
        33: iconst_1
        34: aload_0
        35: getfield      #72                 // Field _circletId:I
        38: invokeinterface #301,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        43: aload         4
        45: iconst_2
        46: aload_1
        47: invokevirtual #751                // Method ext/mods/gameserver/model/pledge/ClanMember.getObjectId:()I
        50: invokeinterface #301,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        55: aload         4
        57: invokeinterface #305,  1          // InterfaceMethod java/sql/PreparedStatement.executeUpdate:()I
        62: pop
        63: aload         4
        65: ifnull        107
        68: aload         4
        70: invokeinterface #308,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
        75: goto          107
        78: astore        5
        80: aload         4
        82: ifnull        104
        85: aload         4
        87: invokeinterface #308,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
        92: goto          104
        95: astore        6
        97: aload         5
        99: aload         6
       101: invokevirtual #313                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       104: aload         5
       106: athrow
       107: aload_3
       108: ifnull        147
       111: aload_3
       112: invokeinterface #317,  1          // InterfaceMethod java/sql/Connection.close:()V
       117: goto          147
       120: astore        4
       122: aload_3
       123: ifnull        144
       126: aload_3
       127: invokeinterface #317,  1          // InterfaceMethod java/sql/Connection.close:()V
       132: goto          144
       135: astore        5
       137: aload         4
       139: aload         5
       141: invokevirtual #313                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       144: aload         4
       146: athrow
       147: goto          161
       150: astore_3
       151: getstatic     #320                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       154: ldc_w         #754                // String Couldn\'t update items for member.
       157: aload_3
       158: invokevirtual #326                // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
       161: return
      Exception table:
         from    to  target type
            31    63    78   Class java/lang/Throwable
            85    92    95   Class java/lang/Throwable
            20   107   120   Class java/lang/Throwable
           126   132   135   Class java/lang/Throwable
            16   147   150   Class java/lang/Exception
      LineNumberTable:
        line 974: 0
        line 975: 5
        line 976: 9
        line 979: 16
        line 980: 20
        line 982: 31
        line 983: 43
        line 984: 55
        line 985: 63
        line 979: 78
        line 985: 107
        line 979: 120
        line 989: 147
        line 986: 150
        line 988: 151
        line 991: 161
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           31      76     4    ps   Ljava/sql/PreparedStatement;
           20     127     3   con   Ljava/sql/Connection;
          151      10     3     e   Ljava/lang/Exception;
            0     162     0  this   Lext/mods/gameserver/model/residence/castle/Castle;
            0     162     1 member   Lext/mods/gameserver/model/pledge/ClanMember;
            5     157     2 player   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 11
        frame_type = 252 /* append */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 255 /* full_frame */
          offset_delta = 61
          locals = [ class ext/mods/gameserver/model/residence/castle/Castle, class ext/mods/gameserver/model/pledge/ClanMember, class ext/mods/gameserver/model/actor/Player, class java/sql/Connection, class java/sql/PreparedStatement ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/model/residence/castle/Castle, class ext/mods/gameserver/model/pledge/ClanMember, class ext/mods/gameserver/model/actor/Player, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 14
          locals = [ class ext/mods/gameserver/model/residence/castle/Castle, class ext/mods/gameserver/model/pledge/ClanMember, class ext/mods/gameserver/model/actor/Player, class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 10 /* same */

  public void checkItemsForClan(ext.mods.gameserver.model.pledge.Clan);
    descriptor: (Lext/mods/gameserver/model/pledge/Clan;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=7, args_size=2
         0: invokestatic  #281                // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
         3: astore_2
         4: aload_2
         5: ldc_w         #749                // String UPDATE items SET loc=\'INVENTORY\' WHERE item_id IN (?,6841) AND owner_id=? AND loc=\'PAPERDOLL\'
         8: invokeinterface #289,  2          // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        13: astore_3
        14: aload_3
        15: iconst_1
        16: aload_0
        17: getfield      #72                 // Field _circletId:I
        20: invokeinterface #301,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        25: aload_1
        26: invokevirtual #756                // Method ext/mods/gameserver/model/pledge/Clan.getMembers:()Ljava/util/Collection;
        29: invokeinterface #102,  1          // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
        34: astore        4
        36: aload         4
        38: invokeinterface #108,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        43: ifeq          99
        46: aload         4
        48: invokeinterface #114,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        53: checkcast     #219                // class ext/mods/gameserver/model/pledge/ClanMember
        56: astore        5
        58: aload         5
        60: invokevirtual #218                // Method ext/mods/gameserver/model/pledge/ClanMember.getPlayerInstance:()Lext/mods/gameserver/model/actor/Player;
        63: astore        6
        65: aload         6
        67: ifnull        78
        70: aload         6
        72: invokevirtual #746                // Method ext/mods/gameserver/model/actor/Player.checkItemRestriction:()V
        75: goto          96
        78: aload_3
        79: iconst_2
        80: aload         5
        82: invokevirtual #751                // Method ext/mods/gameserver/model/pledge/ClanMember.getObjectId:()I
        85: invokeinterface #301,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        90: aload_3
        91: invokeinterface #394,  1          // InterfaceMethod java/sql/PreparedStatement.addBatch:()V
        96: goto          36
        99: aload_3
       100: invokeinterface #397,  1          // InterfaceMethod java/sql/PreparedStatement.executeBatch:()[I
       105: pop
       106: aload_3
       107: ifnull        146
       110: aload_3
       111: invokeinterface #308,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       116: goto          146
       119: astore        4
       121: aload_3
       122: ifnull        143
       125: aload_3
       126: invokeinterface #308,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       131: goto          143
       134: astore        5
       136: aload         4
       138: aload         5
       140: invokevirtual #313                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       143: aload         4
       145: athrow
       146: aload_2
       147: ifnull        183
       150: aload_2
       151: invokeinterface #317,  1          // InterfaceMethod java/sql/Connection.close:()V
       156: goto          183
       159: astore_3
       160: aload_2
       161: ifnull        181
       164: aload_2
       165: invokeinterface #317,  1          // InterfaceMethod java/sql/Connection.close:()V
       170: goto          181
       173: astore        4
       175: aload_3
       176: aload         4
       178: invokevirtual #313                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       181: aload_3
       182: athrow
       183: goto          197
       186: astore_2
       187: getstatic     #320                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       190: ldc_w         #760                // String Couldn\'t update items for clan.
       193: aload_2
       194: invokevirtual #326                // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
       197: return
      Exception table:
         from    to  target type
            14   106   119   Class java/lang/Throwable
           125   131   134   Class java/lang/Throwable
             4   146   159   Class java/lang/Throwable
           164   170   173   Class java/lang/Throwable
             0   183   186   Class java/lang/Exception
      LineNumberTable:
        line 995: 0
        line 996: 4
        line 998: 14
        line 1000: 25
        line 1002: 58
        line 1003: 65
        line 1004: 70
        line 1007: 78
        line 1008: 90
        line 1010: 96
        line 1011: 99
        line 1012: 106
        line 995: 119
        line 1012: 146
        line 995: 159
        line 1016: 183
        line 1013: 186
        line 1015: 187
        line 1017: 197
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           65      31     6 player   Lext/mods/gameserver/model/actor/Player;
           58      38     5 member   Lext/mods/gameserver/model/pledge/ClanMember;
           14     132     3    ps   Ljava/sql/PreparedStatement;
            4     179     2   con   Ljava/sql/Connection;
          187      10     2     e   Ljava/lang/Exception;
            0     198     0  this   Lext/mods/gameserver/model/residence/castle/Castle;
            0     198     1  clan   Lext/mods/gameserver/model/pledge/Clan;
      StackMapTable: number_of_entries = 14
        frame_type = 254 /* append */
          offset_delta = 36
          locals = [ class java/sql/Connection, class java/sql/PreparedStatement, class java/util/Iterator ]
        frame_type = 253 /* append */
          offset_delta = 41
          locals = [ class ext/mods/gameserver/model/pledge/ClanMember, class ext/mods/gameserver/model/actor/Player ]
        frame_type = 249 /* chop */
          offset_delta = 17
        frame_type = 250 /* chop */
          offset_delta = 2
        frame_type = 83 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 14
          locals = [ class ext/mods/gameserver/model/residence/castle/Castle, class ext/mods/gameserver/model/pledge/Clan, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/model/residence/castle/Castle, class ext/mods/gameserver/model/pledge/Clan, class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 7 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 10 /* same */

  public void removeFunction(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=6, args_size=2
         0: aload_0
         1: getfield      #12                 // Field _function:Ljava/util/Map;
         4: iload_1
         5: invokestatic  #147                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
         8: invokeinterface #474,  2          // InterfaceMethod java/util/Map.remove:(Ljava/lang/Object;)Ljava/lang/Object;
        13: pop
        14: invokestatic  #281                // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
        17: astore_2
        18: aload_2
        19: ldc_w         #807                // String DELETE FROM castle_functions WHERE castle_id=? AND type=?
        22: invokeinterface #289,  2          // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        27: astore_3
        28: aload_3
        29: iconst_1
        30: aload_0
        31: invokevirtual #809                // Method getOwnerId:()I
        34: invokeinterface #301,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        39: aload_3
        40: iconst_2
        41: iload_1
        42: invokeinterface #301,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        47: aload_3
        48: invokeinterface #577,  1          // InterfaceMethod java/sql/PreparedStatement.execute:()Z
        53: pop
        54: aload_3
        55: ifnull        94
        58: aload_3
        59: invokeinterface #308,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
        64: goto          94
        67: astore        4
        69: aload_3
        70: ifnull        91
        73: aload_3
        74: invokeinterface #308,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
        79: goto          91
        82: astore        5
        84: aload         4
        86: aload         5
        88: invokevirtual #313                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        91: aload         4
        93: athrow
        94: aload_2
        95: ifnull        131
        98: aload_2
        99: invokeinterface #317,  1          // InterfaceMethod java/sql/Connection.close:()V
       104: goto          131
       107: astore_3
       108: aload_2
       109: ifnull        129
       112: aload_2
       113: invokeinterface #317,  1          // InterfaceMethod java/sql/Connection.close:()V
       118: goto          129
       121: astore        4
       123: aload_3
       124: aload         4
       126: invokevirtual #313                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       129: aload_3
       130: athrow
       131: goto          151
       134: astore_2
       135: getstatic     #320                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       138: aload_2
       139: invokevirtual #800                // Method java/lang/Exception.getMessage:()Ljava/lang/String;
       142: invokedynamic #812,  0            // InvokeDynamic #8:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       147: aload_2
       148: invokevirtual #326                // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
       151: return
      Exception table:
         from    to  target type
            28    54    67   Class java/lang/Throwable
            73    79    82   Class java/lang/Throwable
            18    94   107   Class java/lang/Throwable
           112   118   121   Class java/lang/Throwable
            14   131   134   Class java/lang/Exception
      LineNumberTable:
        line 1042: 0
        line 1043: 14
        line 1044: 18
        line 1046: 28
        line 1047: 39
        line 1048: 47
        line 1049: 54
        line 1043: 67
        line 1049: 94
        line 1043: 107
        line 1053: 131
        line 1050: 134
        line 1052: 135
        line 1054: 151
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           28      66     3 statement   Ljava/sql/PreparedStatement;
           18     113     2   con   Ljava/sql/Connection;
          135      16     2     e   Ljava/lang/Exception;
            0     152     0  this   Lext/mods/gameserver/model/residence/castle/Castle;
            0     152     1 functionType   I
      StackMapTable: number_of_entries = 10
        frame_type = 255 /* full_frame */
          offset_delta = 67
          locals = [ class ext/mods/gameserver/model/residence/castle/Castle, int, class java/sql/Connection, class java/sql/PreparedStatement ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 14
          locals = [ class ext/mods/gameserver/model/residence/castle/Castle, int, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/model/residence/castle/Castle, int, class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 7 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 16 /* same */

  public boolean updateFunctions(ext.mods.gameserver.model.actor.Player, int, int, int, long, boolean);
    descriptor: (Lext/mods/gameserver/model/actor/Player;IIIJZ)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=14, locals=9, args_size=7
         0: aload_1
         1: ifnonnull     6
         4: iconst_0
         5: ireturn
         6: iload         4
         8: ifle          25
        11: aload_1
        12: bipush        57
        14: iload         4
        16: iconst_1
        17: invokevirtual #815                // Method ext/mods/gameserver/model/actor/Player.destroyItemByItemId:(IIZ)Z
        20: ifne          25
        23: iconst_0
        24: ireturn
        25: iload         7
        27: ifeq          64
        30: aload_0
        31: getfield      #12                 // Field _function:Ljava/util/Map;
        34: iload_2
        35: invokestatic  #147                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        38: new           #163                // class ext/mods/gameserver/model/residence/castle/Castle$CastleFunction
        41: dup
        42: aload_0
        43: iload_2
        44: iload_3
        45: iload         4
        47: iconst_0
        48: lload         5
        50: lconst_0
        51: iconst_0
        52: invokespecial #789                // Method ext/mods/gameserver/model/residence/castle/Castle$CastleFunction."<init>":(Lext/mods/gameserver/model/residence/castle/Castle;IIIIJJZ)V
        55: invokeinterface #792,  3          // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        60: pop
        61: goto          220
        64: iload_3
        65: ifne          81
        68: iload         4
        70: ifne          81
        73: aload_0
        74: iload_2
        75: invokevirtual #819                // Method removeFunction:(I)V
        78: goto          220
        81: iload         4
        83: aload_0
        84: getfield      #12                 // Field _function:Ljava/util/Map;
        87: iload_2
        88: invokestatic  #147                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        91: invokeinterface #159,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        96: checkcast     #163                // class ext/mods/gameserver/model/residence/castle/Castle$CastleFunction
        99: invokevirtual #822                // Method ext/mods/gameserver/model/residence/castle/Castle$CastleFunction.getLease:()I
       102: isub
       103: istore        8
       105: iload         8
       107: ifle          160
       110: aload_0
       111: getfield      #12                 // Field _function:Ljava/util/Map;
       114: iload_2
       115: invokestatic  #147                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       118: invokeinterface #474,  2          // InterfaceMethod java/util/Map.remove:(Ljava/lang/Object;)Ljava/lang/Object;
       123: pop
       124: aload_0
       125: getfield      #12                 // Field _function:Ljava/util/Map;
       128: iload_2
       129: invokestatic  #147                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       132: new           #163                // class ext/mods/gameserver/model/residence/castle/Castle$CastleFunction
       135: dup
       136: aload_0
       137: iload_2
       138: iload_3
       139: iload         4
       141: iconst_0
       142: lload         5
       144: ldc2_w        #825                // long -1l
       147: iconst_0
       148: invokespecial #789                // Method ext/mods/gameserver/model/residence/castle/Castle$CastleFunction."<init>":(Lext/mods/gameserver/model/residence/castle/Castle;IIIIJJZ)V
       151: invokeinterface #792,  3          // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
       156: pop
       157: goto          220
       160: aload_0
       161: getfield      #12                 // Field _function:Ljava/util/Map;
       164: iload_2
       165: invokestatic  #147                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       168: invokeinterface #159,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
       173: checkcast     #163                // class ext/mods/gameserver/model/residence/castle/Castle$CastleFunction
       176: iload         4
       178: invokevirtual #827                // Method ext/mods/gameserver/model/residence/castle/Castle$CastleFunction.setLease:(I)V
       181: aload_0
       182: getfield      #12                 // Field _function:Ljava/util/Map;
       185: iload_2
       186: invokestatic  #147                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       189: invokeinterface #159,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
       194: checkcast     #163                // class ext/mods/gameserver/model/residence/castle/Castle$CastleFunction
       197: iload_3
       198: invokevirtual #830                // Method ext/mods/gameserver/model/residence/castle/Castle$CastleFunction.setLvl:(I)V
       201: aload_0
       202: getfield      #12                 // Field _function:Ljava/util/Map;
       205: iload_2
       206: invokestatic  #147                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       209: invokeinterface #159,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
       214: checkcast     #163                // class ext/mods/gameserver/model/residence/castle/Castle$CastleFunction
       217: invokevirtual #833                // Method ext/mods/gameserver/model/residence/castle/Castle$CastleFunction.dbSave:()V
       220: iconst_1
       221: ireturn
      LineNumberTable:
        line 1058: 0
        line 1059: 4
        line 1061: 6
        line 1063: 11
        line 1064: 23
        line 1067: 25
        line 1068: 30
        line 1071: 64
        line 1072: 73
        line 1075: 81
        line 1076: 105
        line 1078: 110
        line 1079: 124
        line 1083: 160
        line 1084: 181
        line 1085: 201
        line 1089: 220
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          105     115     8 diffLease   I
            0     222     0  this   Lext/mods/gameserver/model/residence/castle/Castle;
            0     222     1 player   Lext/mods/gameserver/model/actor/Player;
            0     222     2  type   I
            0     222     3   lvl   I
            0     222     4 lease   I
            0     222     5  rate   J
            0     222     7 addNew   Z
      StackMapTable: number_of_entries = 6
        frame_type = 6 /* same */
        frame_type = 18 /* same */
        frame_type = 38 /* same */
        frame_type = 16 /* same */
        frame_type = 252 /* append */
          offset_delta = 78
          locals = [ int ]
        frame_type = 250 /* chop */
          offset_delta = 59

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=3, locals=0, args_size=0
         0: new           #327                // class ext/mods/commons/logging/CLogger
         3: dup
         4: ldc           #13                 // class ext/mods/gameserver/model/residence/castle/Castle
         6: invokevirtual #887                // Method java/lang/Class.getName:()Ljava/lang/String;
         9: invokespecial #890                // Method ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
        12: putstatic     #320                // Field LOGGER:Lext/mods/commons/logging/CLogger;
        15: return
      LineNumberTable:
        line 72: 0
}
SourceFile: "Castle.java"
NestMembers:
  ext/mods/gameserver/model/residence/castle/Castle$CastleFunction
  ext/mods/gameserver/model/residence/castle/Castle$CastleFunction$FunctionTask
BootstrapMethods:
  0: #1132 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1093 (Ljava/lang/Object;Ljava/lang/Object;)V
      #1095 REF_invokeVirtual ext/mods/gameserver/model/residence/castle/Castle.lambda$removeOwner$0:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/Integer;Ljava/lang/Integer;)V
      #1098 (Ljava/lang/Integer;Ljava/lang/Integer;)V
  1: #1132 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1100 (Ljava/lang/Object;)V
      #1102 REF_invokeStatic ext/mods/gameserver/model/residence/castle/Castle.lambda$removeOwner$1:(Lext/mods/gameserver/model/actor/Npc;)V
      #1105 (Lext/mods/gameserver/model/actor/Npc;)V
  2: #1132 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1106 (Ljava/lang/Object;)Z
      #1107 REF_invokeStatic ext/mods/gameserver/model/residence/castle/Castle.lambda$getTicket$0:(ILext/mods/gameserver/model/item/MercenaryTicket;)Z
      #1110 (Lext/mods/gameserver/model/item/MercenaryTicket;)Z
  3: #1132 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1106 (Ljava/lang/Object;)Z
      #1112 REF_invokeStatic ext/mods/gameserver/model/residence/castle/Castle.lambda$getDroppedTicketsCount$0:(ILext/mods/gameserver/model/item/instance/ItemInstance;)Z
      #1115 (Lext/mods/gameserver/model/item/instance/ItemInstance;)Z
  4: #1132 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1106 (Ljava/lang/Object;)Z
      #1117 REF_invokeStatic ext/mods/gameserver/model/residence/castle/Castle.lambda$isTooCloseFromDroppedTicket$0:(IIILext/mods/gameserver/model/item/instance/ItemInstance;)Z
      #1115 (Lext/mods/gameserver/model/item/instance/ItemInstance;)Z
  5: #1132 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1100 (Ljava/lang/Object;)V
      #1120 REF_invokeVirtual ext/mods/gameserver/model/actor/Npc.deleteMe:()V
      #1105 (Lext/mods/gameserver/model/actor/Npc;)V
  6: #1132 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1106 (Ljava/lang/Object;)Z
      #1124 REF_invokeVirtual ext/mods/gameserver/model/residence/castle/Castle.lambda$getAliveLifeTowerCount$0:(Lext/mods/gameserver/model/location/TowerSpawnLocation;)Z
      #1127 (Lext/mods/gameserver/model/location/TowerSpawnLocation;)Z
  7: #1139 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1128 Exception: Castle.loadFunctions(): \u0001
  8: #1139 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1130 Exception: Castle.removeFunctions(int functionType): \u0001
InnerClasses:
  public #1146= #163 of #13;              // CastleFunction=class ext/mods/gameserver/model/residence/castle/Castle$CastleFunction of class ext/mods/gameserver/model/residence/castle/Castle
  public static final #1152= #1148 of #1150; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
