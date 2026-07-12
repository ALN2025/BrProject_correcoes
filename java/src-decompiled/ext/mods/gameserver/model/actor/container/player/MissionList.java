// Bytecode for: ext.mods.gameserver.model.actor.container.player.MissionList
// File: ext\mods\gameserver\model\actor\container\player\MissionList.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/actor/container/player/MissionList.class
  Last modified 9 de jul de 2026; size 11225 bytes
  MD5 checksum fe67d09a890ceafc3dae5cd3d2d0d1fc
  Compiled from "MissionList.java"
public class ext.mods.gameserver.model.actor.container.player.MissionList
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #11                         // ext/mods/gameserver/model/actor/container/player/MissionList
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 5, methods: 14, attributes: 4
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Class              #8            // java/util/HashMap
    #8 = Utf8               java/util/HashMap
    #9 = Methodref          #7.#3         // java/util/HashMap."<init>":()V
   #10 = Fieldref           #11.#12       // ext/mods/gameserver/model/actor/container/player/MissionList._entries:Ljava/util/Map;
   #11 = Class              #13           // ext/mods/gameserver/model/actor/container/player/MissionList
   #12 = NameAndType        #14:#15       // _entries:Ljava/util/Map;
   #13 = Utf8               ext/mods/gameserver/model/actor/container/player/MissionList
   #14 = Utf8               _entries
   #15 = Utf8               Ljava/util/Map;
   #16 = Fieldref           #11.#17       // ext/mods/gameserver/model/actor/container/player/MissionList._player:Lext/mods/gameserver/model/actor/Player;
   #17 = NameAndType        #18:#19       // _player:Lext/mods/gameserver/model/actor/Player;
   #18 = Utf8               _player
   #19 = Utf8               Lext/mods/gameserver/model/actor/Player;
   #20 = Fieldref           #21.#22       // ext/mods/Config.ENABLE_MISSION:Z
   #21 = Class              #23           // ext/mods/Config
   #22 = NameAndType        #24:#25       // ENABLE_MISSION:Z
   #23 = Utf8               ext/mods/Config
   #24 = Utf8               ENABLE_MISSION
   #25 = Utf8               Z
   #26 = Methodref          #27.#28       // ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
   #27 = Class              #29           // ext/mods/commons/pool/ConnectionPool
   #28 = NameAndType        #30:#31       // getConnection:()Ljava/sql/Connection;
   #29 = Utf8               ext/mods/commons/pool/ConnectionPool
   #30 = Utf8               getConnection
   #31 = Utf8               ()Ljava/sql/Connection;
   #32 = String             #33           // SELECT * FROM character_mission WHERE object_id=?
   #33 = Utf8               SELECT * FROM character_mission WHERE object_id=?
   #34 = InterfaceMethodref #35.#36       // java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
   #35 = Class              #37           // java/sql/Connection
   #36 = NameAndType        #38:#39       // prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
   #37 = Utf8               java/sql/Connection
   #38 = Utf8               prepareStatement
   #39 = Utf8               (Ljava/lang/String;)Ljava/sql/PreparedStatement;
   #40 = Methodref          #41.#42       // ext/mods/gameserver/model/actor/Player.getObjectId:()I
   #41 = Class              #43           // ext/mods/gameserver/model/actor/Player
   #42 = NameAndType        #44:#45       // getObjectId:()I
   #43 = Utf8               ext/mods/gameserver/model/actor/Player
   #44 = Utf8               getObjectId
   #45 = Utf8               ()I
   #46 = InterfaceMethodref #47.#48       // java/sql/PreparedStatement.setInt:(II)V
   #47 = Class              #49           // java/sql/PreparedStatement
   #48 = NameAndType        #50:#51       // setInt:(II)V
   #49 = Utf8               java/sql/PreparedStatement
   #50 = Utf8               setInt
   #51 = Utf8               (II)V
   #52 = InterfaceMethodref #47.#53       // java/sql/PreparedStatement.executeQuery:()Ljava/sql/ResultSet;
   #53 = NameAndType        #54:#55       // executeQuery:()Ljava/sql/ResultSet;
   #54 = Utf8               executeQuery
   #55 = Utf8               ()Ljava/sql/ResultSet;
   #56 = InterfaceMethodref #57.#58       // java/sql/ResultSet.next:()Z
   #57 = Class              #59           // java/sql/ResultSet
   #58 = NameAndType        #60:#61       // next:()Z
   #59 = Utf8               java/sql/ResultSet
   #60 = Utf8               next
   #61 = Utf8               ()Z
   #62 = String             #63           // type
   #63 = Utf8               type
   #64 = InterfaceMethodref #57.#65       // java/sql/ResultSet.getString:(Ljava/lang/String;)Ljava/lang/String;
   #65 = NameAndType        #66:#67       // getString:(Ljava/lang/String;)Ljava/lang/String;
   #66 = Utf8               getString
   #67 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
   #68 = Methodref          #69.#70       // ext/mods/gameserver/enums/actors/MissionType.valueOf:(Ljava/lang/String;)Lext/mods/gameserver/enums/actors/MissionType;
   #69 = Class              #71           // ext/mods/gameserver/enums/actors/MissionType
   #70 = NameAndType        #72:#73       // valueOf:(Ljava/lang/String;)Lext/mods/gameserver/enums/actors/MissionType;
   #71 = Utf8               ext/mods/gameserver/enums/actors/MissionType
   #72 = Utf8               valueOf
   #73 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/enums/actors/MissionType;
   #74 = Class              #75           // ext/mods/gameserver/model/holder/IntIntHolder
   #75 = Utf8               ext/mods/gameserver/model/holder/IntIntHolder
   #76 = String             #77           // level
   #77 = Utf8               level
   #78 = InterfaceMethodref #57.#79       // java/sql/ResultSet.getInt:(Ljava/lang/String;)I
   #79 = NameAndType        #80:#81       // getInt:(Ljava/lang/String;)I
   #80 = Utf8               getInt
   #81 = Utf8               (Ljava/lang/String;)I
   #82 = String             #83           // value
   #83 = Utf8               value
   #84 = Methodref          #74.#85       // ext/mods/gameserver/model/holder/IntIntHolder."<init>":(II)V
   #85 = NameAndType        #5:#51        // "<init>":(II)V
   #86 = InterfaceMethodref #87.#88       // java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #87 = Class              #89           // java/util/Map
   #88 = NameAndType        #90:#91       // put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #89 = Utf8               java/util/Map
   #90 = Utf8               put
   #91 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #92 = InterfaceMethodref #57.#93       // java/sql/ResultSet.close:()V
   #93 = NameAndType        #94:#6        // close:()V
   #94 = Utf8               close
   #95 = Class              #96           // java/lang/Throwable
   #96 = Utf8               java/lang/Throwable
   #97 = Methodref          #95.#98       // java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
   #98 = NameAndType        #99:#100      // addSuppressed:(Ljava/lang/Throwable;)V
   #99 = Utf8               addSuppressed
  #100 = Utf8               (Ljava/lang/Throwable;)V
  #101 = InterfaceMethodref #47.#93       // java/sql/PreparedStatement.close:()V
  #102 = InterfaceMethodref #35.#93       // java/sql/Connection.close:()V
  #103 = Class              #104          // java/lang/Exception
  #104 = Utf8               java/lang/Exception
  #105 = Fieldref           #11.#106      // ext/mods/gameserver/model/actor/container/player/MissionList.LOGGER:Lext/mods/commons/logging/CLogger;
  #106 = NameAndType        #107:#108     // LOGGER:Lext/mods/commons/logging/CLogger;
  #107 = Utf8               LOGGER
  #108 = Utf8               Lext/mods/commons/logging/CLogger;
  #109 = String             #110          // Failed to load mission list for player:
  #110 = Utf8               Failed to load mission list for player:
  #111 = Methodref          #41.#112      // ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
  #112 = NameAndType        #113:#114     // getName:()Ljava/lang/String;
  #113 = Utf8               getName
  #114 = Utf8               ()Ljava/lang/String;
  #115 = Methodref          #116.#117     // ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
  #116 = Class              #118          // ext/mods/commons/logging/CLogger
  #117 = NameAndType        #119:#120     // warn:(Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
  #118 = Utf8               ext/mods/commons/logging/CLogger
  #119 = Utf8               warn
  #120 = Utf8               (Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
  #121 = String             #122          // INSERT INTO character_mission (object_id,type,level,value) VALUES (?,?,?,?) ON DUPLICATE KEY UPDATE level=VALUES(level), value=VALUES(value)
  #122 = Utf8               INSERT INTO character_mission (object_id,type,level,value) VALUES (?,?,?,?) ON DUPLICATE KEY UPDATE level=VALUES(level), value=VALUES(value)
  #123 = InterfaceMethodref #87.#124      // java/util/Map.entrySet:()Ljava/util/Set;
  #124 = NameAndType        #125:#126     // entrySet:()Ljava/util/Set;
  #125 = Utf8               entrySet
  #126 = Utf8               ()Ljava/util/Set;
  #127 = InterfaceMethodref #128.#129     // java/util/Set.iterator:()Ljava/util/Iterator;
  #128 = Class              #130          // java/util/Set
  #129 = NameAndType        #131:#132     // iterator:()Ljava/util/Iterator;
  #130 = Utf8               java/util/Set
  #131 = Utf8               iterator
  #132 = Utf8               ()Ljava/util/Iterator;
  #133 = InterfaceMethodref #134.#135     // java/util/Iterator.hasNext:()Z
  #134 = Class              #136          // java/util/Iterator
  #135 = NameAndType        #137:#61      // hasNext:()Z
  #136 = Utf8               java/util/Iterator
  #137 = Utf8               hasNext
  #138 = InterfaceMethodref #134.#139     // java/util/Iterator.next:()Ljava/lang/Object;
  #139 = NameAndType        #60:#140      // next:()Ljava/lang/Object;
  #140 = Utf8               ()Ljava/lang/Object;
  #141 = Class              #142          // java/util/Map$Entry
  #142 = Utf8               java/util/Map$Entry
  #143 = InterfaceMethodref #141.#144     // java/util/Map$Entry.getValue:()Ljava/lang/Object;
  #144 = NameAndType        #145:#140     // getValue:()Ljava/lang/Object;
  #145 = Utf8               getValue
  #146 = Methodref          #74.#147      // ext/mods/gameserver/model/holder/IntIntHolder.getId:()I
  #147 = NameAndType        #148:#45      // getId:()I
  #148 = Utf8               getId
  #149 = Methodref          #74.#150      // ext/mods/gameserver/model/holder/IntIntHolder.getValue:()I
  #150 = NameAndType        #145:#45      // getValue:()I
  #151 = InterfaceMethodref #141.#152     // java/util/Map$Entry.getKey:()Ljava/lang/Object;
  #152 = NameAndType        #153:#140     // getKey:()Ljava/lang/Object;
  #153 = Utf8               getKey
  #154 = Methodref          #155.#156     // java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
  #155 = Class              #157          // java/lang/String
  #156 = NameAndType        #72:#158      // valueOf:(Ljava/lang/Object;)Ljava/lang/String;
  #157 = Utf8               java/lang/String
  #158 = Utf8               (Ljava/lang/Object;)Ljava/lang/String;
  #159 = InterfaceMethodref #47.#160      // java/sql/PreparedStatement.setString:(ILjava/lang/String;)V
  #160 = NameAndType        #161:#162     // setString:(ILjava/lang/String;)V
  #161 = Utf8               setString
  #162 = Utf8               (ILjava/lang/String;)V
  #163 = InterfaceMethodref #47.#164      // java/sql/PreparedStatement.executeUpdate:()I
  #164 = NameAndType        #165:#45      // executeUpdate:()I
  #165 = Utf8               executeUpdate
  #166 = String             #167          // Failed to load mission list for player: {} (Id: {}). Exception:
  #167 = Utf8               Failed to load mission list for player: {} (Id: {}). Exception:
  #168 = Methodref          #169.#170     // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
  #169 = Class              #171          // java/lang/Integer
  #170 = NameAndType        #72:#172      // valueOf:(I)Ljava/lang/Integer;
  #171 = Utf8               java/lang/Integer
  #172 = Utf8               (I)Ljava/lang/Integer;
  #173 = Methodref          #116.#174     // ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;[Ljava/lang/Object;)V
  #174 = NameAndType        #119:#175     // warn:(Ljava/lang/Object;[Ljava/lang/Object;)V
  #175 = Utf8               (Ljava/lang/Object;[Ljava/lang/Object;)V
  #176 = InterfaceMethodref #87.#177      // java/util/Map.containsKey:(Ljava/lang/Object;)Z
  #177 = NameAndType        #178:#179     // containsKey:(Ljava/lang/Object;)Z
  #178 = Utf8               containsKey
  #179 = Utf8               (Ljava/lang/Object;)Z
  #180 = InterfaceMethodref #87.#181      // java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
  #181 = NameAndType        #182:#183     // get:(Ljava/lang/Object;)Ljava/lang/Object;
  #182 = Utf8               get
  #183 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
  #184 = Methodref          #41.#185      // ext/mods/gameserver/model/actor/Player.getParty:()Lext/mods/gameserver/model/group/Party;
  #185 = NameAndType        #186:#187     // getParty:()Lext/mods/gameserver/model/group/Party;
  #186 = Utf8               getParty
  #187 = Utf8               ()Lext/mods/gameserver/model/group/Party;
  #188 = Fieldref           #21.#189      // ext/mods/Config.PARTY_RANGE:I
  #189 = NameAndType        #190:#191     // PARTY_RANGE:I
  #190 = Utf8               PARTY_RANGE
  #191 = Utf8               I
  #192 = InvokeDynamic      #0:#193       // #0:test:(Lext/mods/gameserver/model/actor/container/player/MissionList;)Ljava/util/function/Predicate;
  #193 = NameAndType        #194:#195     // test:(Lext/mods/gameserver/model/actor/container/player/MissionList;)Ljava/util/function/Predicate;
  #194 = Utf8               test
  #195 = Utf8               (Lext/mods/gameserver/model/actor/container/player/MissionList;)Ljava/util/function/Predicate;
  #196 = Methodref          #41.#197      // ext/mods/gameserver/model/actor/Player.getKnownTypeInRadius:(Ljava/lang/Class;ILjava/util/function/Predicate;)Ljava/util/List;
  #197 = NameAndType        #198:#199     // getKnownTypeInRadius:(Ljava/lang/Class;ILjava/util/function/Predicate;)Ljava/util/List;
  #198 = Utf8               getKnownTypeInRadius
  #199 = Utf8               (Ljava/lang/Class;ILjava/util/function/Predicate;)Ljava/util/List;
  #200 = InvokeDynamic      #1:#201       // #1:accept:(Lext/mods/gameserver/enums/actors/MissionType;)Ljava/util/function/Consumer;
  #201 = NameAndType        #202:#203     // accept:(Lext/mods/gameserver/enums/actors/MissionType;)Ljava/util/function/Consumer;
  #202 = Utf8               accept
  #203 = Utf8               (Lext/mods/gameserver/enums/actors/MissionType;)Ljava/util/function/Consumer;
  #204 = InterfaceMethodref #205.#206     // java/util/List.forEach:(Ljava/util/function/Consumer;)V
  #205 = Class              #207          // java/util/List
  #206 = NameAndType        #208:#209     // forEach:(Ljava/util/function/Consumer;)V
  #207 = Utf8               java/util/List
  #208 = Utf8               forEach
  #209 = Utf8               (Ljava/util/function/Consumer;)V
  #210 = Methodref          #11.#211      // ext/mods/gameserver/model/actor/container/player/MissionList.update:(Lext/mods/gameserver/enums/actors/MissionType;)V
  #211 = NameAndType        #212:#213     // update:(Lext/mods/gameserver/enums/actors/MissionType;)V
  #212 = Utf8               update
  #213 = Utf8               (Lext/mods/gameserver/enums/actors/MissionType;)V
  #214 = Methodref          #11.#215      // ext/mods/gameserver/model/actor/container/player/MissionList.set:(Lext/mods/gameserver/enums/actors/MissionType;IZZ)V
  #215 = NameAndType        #216:#217     // set:(Lext/mods/gameserver/enums/actors/MissionType;IZZ)V
  #216 = Utf8               set
  #217 = Utf8               (Lext/mods/gameserver/enums/actors/MissionType;IZZ)V
  #218 = Methodref          #219.#220     // ext/mods/gameserver/custom/data/MissionData.getInstance:()Lext/mods/gameserver/custom/data/MissionData;
  #219 = Class              #221          // ext/mods/gameserver/custom/data/MissionData
  #220 = NameAndType        #222:#223     // getInstance:()Lext/mods/gameserver/custom/data/MissionData;
  #221 = Utf8               ext/mods/gameserver/custom/data/MissionData
  #222 = Utf8               getInstance
  #223 = Utf8               ()Lext/mods/gameserver/custom/data/MissionData;
  #224 = Methodref          #219.#225     // ext/mods/gameserver/custom/data/MissionData.getMission:(Lext/mods/gameserver/enums/actors/MissionType;)Ljava/util/List;
  #225 = NameAndType        #226:#227     // getMission:(Lext/mods/gameserver/enums/actors/MissionType;)Ljava/util/List;
  #226 = Utf8               getMission
  #227 = Utf8               (Lext/mods/gameserver/enums/actors/MissionType;)Ljava/util/List;
  #228 = InterfaceMethodref #205.#229     // java/util/List.isEmpty:()Z
  #229 = NameAndType        #230:#61      // isEmpty:()Z
  #230 = Utf8               isEmpty
  #231 = InterfaceMethodref #205.#232     // java/util/List.size:()I
  #232 = NameAndType        #233:#45      // size:()I
  #233 = Utf8               size
  #234 = Methodref          #219.#235     // ext/mods/gameserver/custom/data/MissionData.getMissionByLevel:(Lext/mods/gameserver/enums/actors/MissionType;I)Lext/mods/gameserver/model/Mission;
  #235 = NameAndType        #236:#237     // getMissionByLevel:(Lext/mods/gameserver/enums/actors/MissionType;I)Lext/mods/gameserver/model/Mission;
  #236 = Utf8               getMissionByLevel
  #237 = Utf8               (Lext/mods/gameserver/enums/actors/MissionType;I)Lext/mods/gameserver/model/Mission;
  #238 = Methodref          #239.#240     // ext/mods/gameserver/model/Mission.getLevel:()I
  #239 = Class              #241          // ext/mods/gameserver/model/Mission
  #240 = NameAndType        #242:#45      // getLevel:()I
  #241 = Utf8               ext/mods/gameserver/model/Mission
  #242 = Utf8               getLevel
  #243 = Methodref          #74.#244      // ext/mods/gameserver/model/holder/IntIntHolder.setValue:(I)V
  #244 = NameAndType        #245:#246     // setValue:(I)V
  #245 = Utf8               setValue
  #246 = Utf8               (I)V
  #247 = Methodref          #239.#248     // ext/mods/gameserver/model/Mission.getRequired:()I
  #248 = NameAndType        #249:#45      // getRequired:()I
  #249 = Utf8               getRequired
  #250 = Methodref          #239.#251     // ext/mods/gameserver/model/Mission.getRewards:()Ljava/util/List;
  #251 = NameAndType        #252:#253     // getRewards:()Ljava/util/List;
  #252 = Utf8               getRewards
  #253 = Utf8               ()Ljava/util/List;
  #254 = InvokeDynamic      #2:#255       // #2:accept:(Lext/mods/gameserver/model/actor/container/player/MissionList;)Ljava/util/function/Consumer;
  #255 = NameAndType        #202:#256     // accept:(Lext/mods/gameserver/model/actor/container/player/MissionList;)Ljava/util/function/Consumer;
  #256 = Utf8               (Lext/mods/gameserver/model/actor/container/player/MissionList;)Ljava/util/function/Consumer;
  #257 = Methodref          #74.#258      // ext/mods/gameserver/model/holder/IntIntHolder.setId:(I)V
  #258 = NameAndType        #259:#246     // setId:(I)V
  #259 = Utf8               setId
  #260 = Class              #261          // ext/mods/gameserver/network/serverpackets/MagicSkillUse
  #261 = Utf8               ext/mods/gameserver/network/serverpackets/MagicSkillUse
  #262 = Methodref          #260.#263     // ext/mods/gameserver/network/serverpackets/MagicSkillUse."<init>":(Lext/mods/gameserver/model/actor/Creature;IIII)V
  #263 = NameAndType        #5:#264       // "<init>":(Lext/mods/gameserver/model/actor/Creature;IIII)V
  #264 = Utf8               (Lext/mods/gameserver/model/actor/Creature;IIII)V
  #265 = Methodref          #41.#266      // ext/mods/gameserver/model/actor/Player.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #266 = NameAndType        #267:#268     // broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #267 = Utf8               broadcastPacket
  #268 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #269 = Class              #270          // ext/mods/gameserver/network/serverpackets/CreatureSay
  #270 = Utf8               ext/mods/gameserver/network/serverpackets/CreatureSay
  #271 = Fieldref           #272.#273     // ext/mods/gameserver/enums/SayType.PARTY:Lext/mods/gameserver/enums/SayType;
  #272 = Class              #274          // ext/mods/gameserver/enums/SayType
  #273 = NameAndType        #275:#276     // PARTY:Lext/mods/gameserver/enums/SayType;
  #274 = Utf8               ext/mods/gameserver/enums/SayType
  #275 = Utf8               PARTY
  #276 = Utf8               Lext/mods/gameserver/enums/SayType;
  #277 = String             #278          // Achievements
  #278 = Utf8               Achievements
  #279 = Methodref          #239.#112     // ext/mods/gameserver/model/Mission.getName:()Ljava/lang/String;
  #280 = InvokeDynamic      #3:#281       // #3:makeConcatWithConstants:(ILjava/lang/String;)Ljava/lang/String;
  #281 = NameAndType        #282:#283     // makeConcatWithConstants:(ILjava/lang/String;)Ljava/lang/String;
  #282 = Utf8               makeConcatWithConstants
  #283 = Utf8               (ILjava/lang/String;)Ljava/lang/String;
  #284 = Methodref          #269.#285     // ext/mods/gameserver/network/serverpackets/CreatureSay."<init>":(Lext/mods/gameserver/enums/SayType;Ljava/lang/String;Ljava/lang/String;)V
  #285 = NameAndType        #5:#286       // "<init>":(Lext/mods/gameserver/enums/SayType;Ljava/lang/String;Ljava/lang/String;)V
  #286 = Utf8               (Lext/mods/gameserver/enums/SayType;Ljava/lang/String;Ljava/lang/String;)V
  #287 = Methodref          #41.#288      // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #288 = NameAndType        #289:#268     // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #289 = Utf8               sendPacket
  #290 = Methodref          #219.#291     // ext/mods/gameserver/custom/data/MissionData.getMissions:()Ljava/util/Map;
  #291 = NameAndType        #292:#293     // getMissions:()Ljava/util/Map;
  #292 = Utf8               getMissions
  #293 = Utf8               ()Ljava/util/Map;
  #294 = InterfaceMethodref #87.#229      // java/util/Map.isEmpty:()Z
  #295 = Methodref          #296.#297     // java/util/Collections.emptyList:()Ljava/util/List;
  #296 = Class              #298          // java/util/Collections
  #297 = NameAndType        #299:#253     // emptyList:()Ljava/util/List;
  #298 = Utf8               java/util/Collections
  #299 = Utf8               emptyList
  #300 = InterfaceMethodref #87.#301      // java/util/Map.keySet:()Ljava/util/Set;
  #301 = NameAndType        #302:#126     // keySet:()Ljava/util/Set;
  #302 = Utf8               keySet
  #303 = InterfaceMethodref #128.#304     // java/util/Set.stream:()Ljava/util/stream/Stream;
  #304 = NameAndType        #305:#306     // stream:()Ljava/util/stream/Stream;
  #305 = Utf8               stream
  #306 = Utf8               ()Ljava/util/stream/Stream;
  #307 = InvokeDynamic      #4:#193       // #4:test:(Lext/mods/gameserver/model/actor/container/player/MissionList;)Ljava/util/function/Predicate;
  #308 = InterfaceMethodref #309.#310     // java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
  #309 = Class              #311          // java/util/stream/Stream
  #310 = NameAndType        #312:#313     // filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
  #311 = Utf8               java/util/stream/Stream
  #312 = Utf8               filter
  #313 = Utf8               (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
  #314 = Methodref          #315.#316     // java/util/stream/Collectors.toList:()Ljava/util/stream/Collector;
  #315 = Class              #317          // java/util/stream/Collectors
  #316 = NameAndType        #318:#319     // toList:()Ljava/util/stream/Collector;
  #317 = Utf8               java/util/stream/Collectors
  #318 = Utf8               toList
  #319 = Utf8               ()Ljava/util/stream/Collector;
  #320 = InterfaceMethodref #309.#321     // java/util/stream/Stream.collect:(Ljava/util/stream/Collector;)Ljava/lang/Object;
  #321 = NameAndType        #322:#323     // collect:(Ljava/util/stream/Collector;)Ljava/lang/Object;
  #322 = Utf8               collect
  #323 = Utf8               (Ljava/util/stream/Collector;)Ljava/lang/Object;
  #324 = Fieldref           #325.#326     // ext/mods/gameserver/model/actor/container/player/MissionList$1.$SwitchMap$ext$mods$gameserver$enums$actors$MissionType:[I
  #325 = Class              #327          // ext/mods/gameserver/model/actor/container/player/MissionList$1
  #326 = NameAndType        #328:#329     // $SwitchMap$ext$mods$gameserver$enums$actors$MissionType:[I
  #327 = Utf8               ext/mods/gameserver/model/actor/container/player/MissionList$1
  #328 = Utf8               $SwitchMap$ext$mods$gameserver$enums$actors$MissionType
  #329 = Utf8               [I
  #330 = Methodref          #69.#331      // ext/mods/gameserver/enums/actors/MissionType.ordinal:()I
  #331 = NameAndType        #332:#45      // ordinal:()I
  #332 = Utf8               ordinal
  #333 = Methodref          #41.#334      // ext/mods/gameserver/model/actor/Player.isClanLeader:()Z
  #334 = NameAndType        #335:#61      // isClanLeader:()Z
  #335 = Utf8               isClanLeader
  #336 = Methodref          #41.#337      // ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
  #337 = NameAndType        #338:#339     // getClan:()Lext/mods/gameserver/model/pledge/Clan;
  #338 = Utf8               getClan
  #339 = Utf8               ()Lext/mods/gameserver/model/pledge/Clan;
  #340 = Methodref          #41.#341      // ext/mods/gameserver/model/actor/Player.getSkill:(I)Lext/mods/gameserver/skills/L2Skill;
  #341 = NameAndType        #342:#343     // getSkill:(I)Lext/mods/gameserver/skills/L2Skill;
  #342 = Utf8               getSkill
  #343 = Utf8               (I)Lext/mods/gameserver/skills/L2Skill;
  #344 = Methodref          #41.#345      // ext/mods/gameserver/model/actor/Player.getClassId:()Lext/mods/gameserver/enums/actors/ClassId;
  #345 = NameAndType        #346:#347     // getClassId:()Lext/mods/gameserver/enums/actors/ClassId;
  #346 = Utf8               getClassId
  #347 = Utf8               ()Lext/mods/gameserver/enums/actors/ClassId;
  #348 = Methodref          #349.#240     // ext/mods/gameserver/enums/actors/ClassId.getLevel:()I
  #349 = Class              #350          // ext/mods/gameserver/enums/actors/ClassId
  #350 = Utf8               ext/mods/gameserver/enums/actors/ClassId
  #351 = Methodref          #11.#352      // ext/mods/gameserver/model/actor/container/player/MissionList.isAvailable:(Lext/mods/gameserver/enums/actors/MissionType;)Z
  #352 = NameAndType        #353:#354     // isAvailable:(Lext/mods/gameserver/enums/actors/MissionType;)Z
  #353 = Utf8               isAvailable
  #354 = Utf8               (Lext/mods/gameserver/enums/actors/MissionType;)Z
  #355 = Methodref          #41.#356      // ext/mods/gameserver/model/actor/Player.addItem:(IIZ)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #356 = NameAndType        #357:#358     // addItem:(IIZ)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #357 = Utf8               addItem
  #358 = Utf8               (IIZ)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #359 = Methodref          #41.#360      // ext/mods/gameserver/model/actor/Player.getMissions:()Lext/mods/gameserver/model/actor/container/player/MissionList;
  #360 = NameAndType        #292:#361     // getMissions:()Lext/mods/gameserver/model/actor/container/player/MissionList;
  #361 = Utf8               ()Lext/mods/gameserver/model/actor/container/player/MissionList;
  #362 = Methodref          #363.#364     // ext/mods/gameserver/model/group/Party.containsPlayer:(Lext/mods/gameserver/model/WorldObject;)Z
  #363 = Class              #365          // ext/mods/gameserver/model/group/Party
  #364 = NameAndType        #366:#367     // containsPlayer:(Lext/mods/gameserver/model/WorldObject;)Z
  #365 = Utf8               ext/mods/gameserver/model/group/Party
  #366 = Utf8               containsPlayer
  #367 = Utf8               (Lext/mods/gameserver/model/WorldObject;)Z
  #368 = Methodref          #369.#112     // java/lang/Class.getName:()Ljava/lang/String;
  #369 = Class              #370          // java/lang/Class
  #370 = Utf8               java/lang/Class
  #371 = Methodref          #116.#372     // ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
  #372 = NameAndType        #5:#373       // "<init>":(Ljava/lang/String;)V
  #373 = Utf8               (Ljava/lang/String;)V
  #374 = Utf8               LOAD_MISSION
  #375 = Utf8               Ljava/lang/String;
  #376 = Utf8               ConstantValue
  #377 = Utf8               UPDATE_MISSION
  #378 = Utf8               Signature
  #379 = Utf8               Ljava/util/Map<Lext/mods/gameserver/enums/actors/MissionType;Lext/mods/gameserver/model/holder/IntIntHolder;>;
  #380 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
  #381 = Utf8               Code
  #382 = Utf8               LineNumberTable
  #383 = Utf8               LocalVariableTable
  #384 = Utf8               this
  #385 = Utf8               Lext/mods/gameserver/model/actor/container/player/MissionList;
  #386 = Utf8               player
  #387 = Utf8               restore
  #388 = Utf8               rs
  #389 = Utf8               Ljava/sql/ResultSet;
  #390 = Utf8               ps
  #391 = Utf8               Ljava/sql/PreparedStatement;
  #392 = Utf8               con
  #393 = Utf8               Ljava/sql/Connection;
  #394 = Utf8               e
  #395 = Utf8               Ljava/lang/Exception;
  #396 = Utf8               StackMapTable
  #397 = Utf8               store
  #398 = Utf8               mission
  #399 = Utf8               Ljava/util/Map$Entry;
  #400 = Utf8               LocalVariableTypeTable
  #401 = Utf8               Ljava/util/Map$Entry<Lext/mods/gameserver/enums/actors/MissionType;Lext/mods/gameserver/model/holder/IntIntHolder;>;
  #402 = Utf8               (Lext/mods/gameserver/enums/actors/MissionType;)Lext/mods/gameserver/model/holder/IntIntHolder;
  #403 = Utf8               Lext/mods/gameserver/enums/actors/MissionType;
  #404 = Utf8               updateParty
  #405 = Utf8               increaseValue
  #406 = Utf8               resetValue
  #407 = Utf8               missions
  #408 = Utf8               Ljava/util/List;
  #409 = Utf8               Lext/mods/gameserver/model/holder/IntIntHolder;
  #410 = Utf8               missionData
  #411 = Utf8               Lext/mods/gameserver/model/Mission;
  #412 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/Mission;>;
  #413 = Utf8               getAvailableTypes
  #414 = Utf8               Ljava/util/Map<Lext/mods/gameserver/enums/actors/MissionType;Ljava/util/List<Lext/mods/gameserver/model/Mission;>;>;
  #415 = Utf8               ()Ljava/util/List<Lext/mods/gameserver/enums/actors/MissionType;>;
  #416 = Utf8               lambda$getAvailableTypes$0
  #417 = Utf8               lambda$set$0
  #418 = Utf8               (Lext/mods/gameserver/model/holder/IntIntHolder;)V
  #419 = Utf8               reward
  #420 = Utf8               lambda$updateParty$1
  #421 = Utf8               (Lext/mods/gameserver/enums/actors/MissionType;Lext/mods/gameserver/model/actor/Player;)V
  #422 = Utf8               x
  #423 = Utf8               lambda$updateParty$0
  #424 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Z
  #425 = Utf8               <clinit>
  #426 = Utf8               SourceFile
  #427 = Utf8               MissionList.java
  #428 = Utf8               NestMembers
  #429 = Utf8               BootstrapMethods
  #430 = MethodType         #179          //  (Ljava/lang/Object;)Z
  #431 = MethodHandle       5:#432        // REF_invokeVirtual ext/mods/gameserver/model/actor/container/player/MissionList.lambda$updateParty$0:(Lext/mods/gameserver/model/actor/Player;)Z
  #432 = Methodref          #11.#433      // ext/mods/gameserver/model/actor/container/player/MissionList.lambda$updateParty$0:(Lext/mods/gameserver/model/actor/Player;)Z
  #433 = NameAndType        #423:#424     // lambda$updateParty$0:(Lext/mods/gameserver/model/actor/Player;)Z
  #434 = MethodType         #424          //  (Lext/mods/gameserver/model/actor/Player;)Z
  #435 = MethodType         #436          //  (Ljava/lang/Object;)V
  #436 = Utf8               (Ljava/lang/Object;)V
  #437 = MethodHandle       6:#438        // REF_invokeStatic ext/mods/gameserver/model/actor/container/player/MissionList.lambda$updateParty$1:(Lext/mods/gameserver/enums/actors/MissionType;Lext/mods/gameserver/model/actor/Player;)V
  #438 = Methodref          #11.#439      // ext/mods/gameserver/model/actor/container/player/MissionList.lambda$updateParty$1:(Lext/mods/gameserver/enums/actors/MissionType;Lext/mods/gameserver/model/actor/Player;)V
  #439 = NameAndType        #420:#421     // lambda$updateParty$1:(Lext/mods/gameserver/enums/actors/MissionType;Lext/mods/gameserver/model/actor/Player;)V
  #440 = MethodType         #380          //  (Lext/mods/gameserver/model/actor/Player;)V
  #441 = MethodHandle       5:#442        // REF_invokeVirtual ext/mods/gameserver/model/actor/container/player/MissionList.lambda$set$0:(Lext/mods/gameserver/model/holder/IntIntHolder;)V
  #442 = Methodref          #11.#443      // ext/mods/gameserver/model/actor/container/player/MissionList.lambda$set$0:(Lext/mods/gameserver/model/holder/IntIntHolder;)V
  #443 = NameAndType        #417:#418     // lambda$set$0:(Lext/mods/gameserver/model/holder/IntIntHolder;)V
  #444 = MethodType         #418          //  (Lext/mods/gameserver/model/holder/IntIntHolder;)V
  #445 = String             #446          // Lv \u0001 \u0001 mission complete.
  #446 = Utf8               Lv \u0001 \u0001 mission complete.
  #447 = MethodHandle       5:#448        // REF_invokeVirtual ext/mods/gameserver/model/actor/container/player/MissionList.lambda$getAvailableTypes$0:(Lext/mods/gameserver/enums/actors/MissionType;)Z
  #448 = Methodref          #11.#449      // ext/mods/gameserver/model/actor/container/player/MissionList.lambda$getAvailableTypes$0:(Lext/mods/gameserver/enums/actors/MissionType;)Z
  #449 = NameAndType        #416:#354     // lambda$getAvailableTypes$0:(Lext/mods/gameserver/enums/actors/MissionType;)Z
  #450 = MethodType         #354          //  (Lext/mods/gameserver/enums/actors/MissionType;)Z
  #451 = MethodHandle       6:#452        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #452 = Methodref          #453.#454     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #453 = Class              #455          // java/lang/invoke/LambdaMetafactory
  #454 = NameAndType        #456:#457     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #455 = Utf8               java/lang/invoke/LambdaMetafactory
  #456 = Utf8               metafactory
  #457 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #458 = MethodHandle       6:#459        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #459 = Methodref          #460.#461     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #460 = Class              #462          // java/lang/invoke/StringConcatFactory
  #461 = NameAndType        #282:#463     // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #462 = Utf8               java/lang/invoke/StringConcatFactory
  #463 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #464 = Utf8               InnerClasses
  #465 = Utf8               Entry
  #466 = Class              #467          // java/lang/invoke/MethodHandles$Lookup
  #467 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #468 = Class              #469          // java/lang/invoke/MethodHandles
  #469 = Utf8               java/lang/invoke/MethodHandles
  #470 = Utf8               Lookup
{
  public ext.mods.gameserver.model.actor.container.player.MissionList(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: new           #7                  // class java/util/HashMap
         8: dup
         9: invokespecial #9                  // Method java/util/HashMap."<init>":()V
        12: putfield      #10                 // Field _entries:Ljava/util/Map;
        15: aload_0
        16: aload_1
        17: putfield      #16                 // Field _player:Lext/mods/gameserver/model/actor/Player;
        20: return
      LineNumberTable:
        line 54: 0
        line 51: 4
        line 55: 15
        line 56: 20
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      21     0  this   Lext/mods/gameserver/model/actor/container/player/MissionList;
            0      21     1 player   Lext/mods/gameserver/model/actor/Player;

  public void restore();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=7, locals=6, args_size=1
         0: getstatic     #20                 // Field ext/mods/Config.ENABLE_MISSION:Z
         3: ifne          7
         6: return
         7: invokestatic  #26                 // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
        10: astore_1
        11: aload_1
        12: ldc           #32                 // String SELECT * FROM character_mission WHERE object_id=?
        14: invokeinterface #34,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        19: astore_2
        20: aload_2
        21: iconst_1
        22: aload_0
        23: getfield      #16                 // Field _player:Lext/mods/gameserver/model/actor/Player;
        26: invokevirtual #40                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        29: invokeinterface #46,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        34: aload_2
        35: invokeinterface #52,  1           // InterfaceMethod java/sql/PreparedStatement.executeQuery:()Ljava/sql/ResultSet;
        40: astore_3
        41: aload_3
        42: invokeinterface #56,  1           // InterfaceMethod java/sql/ResultSet.next:()Z
        47: ifeq          97
        50: aload_0
        51: getfield      #10                 // Field _entries:Ljava/util/Map;
        54: aload_3
        55: ldc           #62                 // String type
        57: invokeinterface #64,  2           // InterfaceMethod java/sql/ResultSet.getString:(Ljava/lang/String;)Ljava/lang/String;
        62: invokestatic  #68                 // Method ext/mods/gameserver/enums/actors/MissionType.valueOf:(Ljava/lang/String;)Lext/mods/gameserver/enums/actors/MissionType;
        65: new           #74                 // class ext/mods/gameserver/model/holder/IntIntHolder
        68: dup
        69: aload_3
        70: ldc           #76                 // String level
        72: invokeinterface #78,  2           // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
        77: aload_3
        78: ldc           #82                 // String value
        80: invokeinterface #78,  2           // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
        85: invokespecial #84                 // Method ext/mods/gameserver/model/holder/IntIntHolder."<init>":(II)V
        88: invokeinterface #86,  3           // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        93: pop
        94: goto          41
        97: aload_3
        98: ifnull        137
       101: aload_3
       102: invokeinterface #92,  1           // InterfaceMethod java/sql/ResultSet.close:()V
       107: goto          137
       110: astore        4
       112: aload_3
       113: ifnull        134
       116: aload_3
       117: invokeinterface #92,  1           // InterfaceMethod java/sql/ResultSet.close:()V
       122: goto          134
       125: astore        5
       127: aload         4
       129: aload         5
       131: invokevirtual #97                 // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       134: aload         4
       136: athrow
       137: aload_2
       138: ifnull        174
       141: aload_2
       142: invokeinterface #101,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       147: goto          174
       150: astore_3
       151: aload_2
       152: ifnull        172
       155: aload_2
       156: invokeinterface #101,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       161: goto          172
       164: astore        4
       166: aload_3
       167: aload         4
       169: invokevirtual #97                 // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       172: aload_3
       173: athrow
       174: aload_1
       175: ifnull        209
       178: aload_1
       179: invokeinterface #102,  1          // InterfaceMethod java/sql/Connection.close:()V
       184: goto          209
       187: astore_2
       188: aload_1
       189: ifnull        207
       192: aload_1
       193: invokeinterface #102,  1          // InterfaceMethod java/sql/Connection.close:()V
       198: goto          207
       201: astore_3
       202: aload_2
       203: aload_3
       204: invokevirtual #97                 // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       207: aload_2
       208: athrow
       209: goto          236
       212: astore_1
       213: getstatic     #105                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       216: ldc           #109                // String Failed to load mission list for player:
       218: aload_1
       219: iconst_1
       220: anewarray     #2                  // class java/lang/Object
       223: dup
       224: iconst_0
       225: aload_0
       226: getfield      #16                 // Field _player:Lext/mods/gameserver/model/actor/Player;
       229: invokevirtual #111                // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
       232: aastore
       233: invokevirtual #115                // Method ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
       236: return
      Exception table:
         from    to  target type
            41    97   110   Class java/lang/Throwable
           116   122   125   Class java/lang/Throwable
            20   137   150   Class java/lang/Throwable
           155   161   164   Class java/lang/Throwable
            11   174   187   Class java/lang/Throwable
           192   198   201   Class java/lang/Throwable
             7   209   212   Class java/lang/Exception
      LineNumberTable:
        line 60: 0
        line 61: 6
        line 63: 7
        line 64: 11
        line 66: 20
        line 67: 34
        line 69: 41
        line 70: 50
        line 71: 97
        line 67: 110
        line 72: 137
        line 63: 150
        line 72: 174
        line 63: 187
        line 76: 209
        line 73: 212
        line 75: 213
        line 77: 236
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           41      96     3    rs   Ljava/sql/ResultSet;
           20     154     2    ps   Ljava/sql/PreparedStatement;
           11     198     1   con   Ljava/sql/Connection;
          213      23     1     e   Ljava/lang/Exception;
            0     237     0  this   Lext/mods/gameserver/model/actor/container/player/MissionList;
      StackMapTable: number_of_entries = 17
        frame_type = 7 /* same */
        frame_type = 254 /* append */
          offset_delta = 33
          locals = [ class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/ResultSet ]
        frame_type = 55 /* same */
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 14
          locals = [ class ext/mods/gameserver/model/actor/container/player/MissionList, class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/ResultSet, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/model/actor/container/player/MissionList, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 7 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/model/actor/container/player/MissionList, class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 5 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 23 /* same */

  public void store();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=5, args_size=1
         0: getstatic     #20                 // Field ext/mods/Config.ENABLE_MISSION:Z
         3: ifne          7
         6: return
         7: invokestatic  #26                 // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
        10: astore_1
        11: aload_1
        12: ldc           #121                // String INSERT INTO character_mission (object_id,type,level,value) VALUES (?,?,?,?) ON DUPLICATE KEY UPDATE level=VALUES(level), value=VALUES(value)
        14: invokeinterface #34,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        19: astore_2
        20: aload_0
        21: getfield      #10                 // Field _entries:Ljava/util/Map;
        24: invokeinterface #123,  1          // InterfaceMethod java/util/Map.entrySet:()Ljava/util/Set;
        29: invokeinterface #127,  1          // InterfaceMethod java/util/Set.iterator:()Ljava/util/Iterator;
        34: astore_3
        35: aload_3
        36: invokeinterface #133,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        41: ifeq          171
        44: aload_3
        45: invokeinterface #138,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        50: checkcast     #141                // class java/util/Map$Entry
        53: astore        4
        55: aload         4
        57: invokeinterface #143,  1          // InterfaceMethod java/util/Map$Entry.getValue:()Ljava/lang/Object;
        62: checkcast     #74                 // class ext/mods/gameserver/model/holder/IntIntHolder
        65: invokevirtual #146                // Method ext/mods/gameserver/model/holder/IntIntHolder.getId:()I
        68: ifne          90
        71: aload         4
        73: invokeinterface #143,  1          // InterfaceMethod java/util/Map$Entry.getValue:()Ljava/lang/Object;
        78: checkcast     #74                 // class ext/mods/gameserver/model/holder/IntIntHolder
        81: invokevirtual #149                // Method ext/mods/gameserver/model/holder/IntIntHolder.getValue:()I
        84: ifne          90
        87: goto          35
        90: aload_2
        91: iconst_1
        92: aload_0
        93: getfield      #16                 // Field _player:Lext/mods/gameserver/model/actor/Player;
        96: invokevirtual #40                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        99: invokeinterface #46,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       104: aload_2
       105: iconst_2
       106: aload         4
       108: invokeinterface #151,  1          // InterfaceMethod java/util/Map$Entry.getKey:()Ljava/lang/Object;
       113: invokestatic  #154                // Method java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
       116: invokeinterface #159,  3          // InterfaceMethod java/sql/PreparedStatement.setString:(ILjava/lang/String;)V
       121: aload_2
       122: iconst_3
       123: aload         4
       125: invokeinterface #143,  1          // InterfaceMethod java/util/Map$Entry.getValue:()Ljava/lang/Object;
       130: checkcast     #74                 // class ext/mods/gameserver/model/holder/IntIntHolder
       133: invokevirtual #146                // Method ext/mods/gameserver/model/holder/IntIntHolder.getId:()I
       136: invokeinterface #46,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       141: aload_2
       142: iconst_4
       143: aload         4
       145: invokeinterface #143,  1          // InterfaceMethod java/util/Map$Entry.getValue:()Ljava/lang/Object;
       150: checkcast     #74                 // class ext/mods/gameserver/model/holder/IntIntHolder
       153: invokevirtual #149                // Method ext/mods/gameserver/model/holder/IntIntHolder.getValue:()I
       156: invokeinterface #46,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       161: aload_2
       162: invokeinterface #163,  1          // InterfaceMethod java/sql/PreparedStatement.executeUpdate:()I
       167: pop
       168: goto          35
       171: aload_2
       172: ifnull        208
       175: aload_2
       176: invokeinterface #101,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       181: goto          208
       184: astore_3
       185: aload_2
       186: ifnull        206
       189: aload_2
       190: invokeinterface #101,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       195: goto          206
       198: astore        4
       200: aload_3
       201: aload         4
       203: invokevirtual #97                 // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       206: aload_3
       207: athrow
       208: aload_1
       209: ifnull        243
       212: aload_1
       213: invokeinterface #102,  1          // InterfaceMethod java/sql/Connection.close:()V
       218: goto          243
       221: astore_2
       222: aload_1
       223: ifnull        241
       226: aload_1
       227: invokeinterface #102,  1          // InterfaceMethod java/sql/Connection.close:()V
       232: goto          241
       235: astore_3
       236: aload_2
       237: aload_3
       238: invokevirtual #97                 // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       241: aload_2
       242: athrow
       243: goto          286
       246: astore_1
       247: getstatic     #105                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       250: ldc           #166                // String Failed to load mission list for player: {} (Id: {}). Exception:
       252: iconst_3
       253: anewarray     #2                  // class java/lang/Object
       256: dup
       257: iconst_0
       258: aload_0
       259: getfield      #16                 // Field _player:Lext/mods/gameserver/model/actor/Player;
       262: invokevirtual #111                // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
       265: aastore
       266: dup
       267: iconst_1
       268: aload_0
       269: getfield      #16                 // Field _player:Lext/mods/gameserver/model/actor/Player;
       272: invokevirtual #40                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
       275: invokestatic  #168                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       278: aastore
       279: dup
       280: iconst_2
       281: aload_1
       282: aastore
       283: invokevirtual #173                // Method ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;[Ljava/lang/Object;)V
       286: return
      Exception table:
         from    to  target type
            20   171   184   Class java/lang/Throwable
           189   195   198   Class java/lang/Throwable
            11   208   221   Class java/lang/Throwable
           226   232   235   Class java/lang/Throwable
             7   243   246   Class java/lang/Exception
      LineNumberTable:
        line 81: 0
        line 82: 6
        line 84: 7
        line 85: 11
        line 87: 20
        line 89: 55
        line 90: 87
        line 92: 90
        line 93: 104
        line 94: 121
        line 95: 141
        line 96: 161
        line 97: 168
        line 98: 171
        line 84: 184
        line 98: 208
        line 84: 221
        line 102: 243
        line 99: 246
        line 101: 247
        line 103: 286
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           55     113     4 mission   Ljava/util/Map$Entry;
           20     188     2    ps   Ljava/sql/PreparedStatement;
           11     232     1   con   Ljava/sql/Connection;
          247      39     1     e   Ljava/lang/Exception;
            0     287     0  this   Lext/mods/gameserver/model/actor/container/player/MissionList;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
           55     113     4 mission   Ljava/util/Map$Entry<Lext/mods/gameserver/enums/actors/MissionType;Lext/mods/gameserver/model/holder/IntIntHolder;>;
      StackMapTable: number_of_entries = 14
        frame_type = 7 /* same */
        frame_type = 254 /* append */
          offset_delta = 27
          locals = [ class java/sql/Connection, class java/sql/PreparedStatement, class java/util/Iterator ]
        frame_type = 252 /* append */
          offset_delta = 54
          locals = [ class java/util/Map$Entry ]
        frame_type = 249 /* chop */
          offset_delta = 80
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/model/actor/container/player/MissionList, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 7 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/model/actor/container/player/MissionList, class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 5 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 39 /* same */

  public ext.mods.gameserver.model.holder.IntIntHolder getMission(ext.mods.gameserver.enums.actors.MissionType);
    descriptor: (Lext/mods/gameserver/enums/actors/MissionType;)Lext/mods/gameserver/model/holder/IntIntHolder;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=2, args_size=2
         0: aload_0
         1: getfield      #10                 // Field _entries:Ljava/util/Map;
         4: aload_1
         5: invokeinterface #176,  2          // InterfaceMethod java/util/Map.containsKey:(Ljava/lang/Object;)Z
        10: ifne          33
        13: aload_0
        14: getfield      #10                 // Field _entries:Ljava/util/Map;
        17: aload_1
        18: new           #74                 // class ext/mods/gameserver/model/holder/IntIntHolder
        21: dup
        22: iconst_0
        23: iconst_0
        24: invokespecial #84                 // Method ext/mods/gameserver/model/holder/IntIntHolder."<init>":(II)V
        27: invokeinterface #86,  3           // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        32: pop
        33: aload_0
        34: getfield      #10                 // Field _entries:Ljava/util/Map;
        37: aload_1
        38: invokeinterface #180,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        43: checkcast     #74                 // class ext/mods/gameserver/model/holder/IntIntHolder
        46: areturn
      LineNumberTable:
        line 111: 0
        line 112: 13
        line 114: 33
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      47     0  this   Lext/mods/gameserver/model/actor/container/player/MissionList;
            0      47     1  type   Lext/mods/gameserver/enums/actors/MissionType;
      StackMapTable: number_of_entries = 1
        frame_type = 33 /* same */

  public void updateParty(ext.mods.gameserver.enums.actors.MissionType);
    descriptor: (Lext/mods/gameserver/enums/actors/MissionType;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=2, args_size=2
         0: getstatic     #20                 // Field ext/mods/Config.ENABLE_MISSION:Z
         3: ifne          7
         6: return
         7: aload_0
         8: getfield      #16                 // Field _player:Lext/mods/gameserver/model/actor/Player;
        11: invokevirtual #184                // Method ext/mods/gameserver/model/actor/Player.getParty:()Lext/mods/gameserver/model/group/Party;
        14: ifnull        49
        17: aload_0
        18: getfield      #16                 // Field _player:Lext/mods/gameserver/model/actor/Player;
        21: ldc           #41                 // class ext/mods/gameserver/model/actor/Player
        23: getstatic     #188                // Field ext/mods/Config.PARTY_RANGE:I
        26: aload_0
        27: invokedynamic #192,  0            // InvokeDynamic #0:test:(Lext/mods/gameserver/model/actor/container/player/MissionList;)Ljava/util/function/Predicate;
        32: invokevirtual #196                // Method ext/mods/gameserver/model/actor/Player.getKnownTypeInRadius:(Ljava/lang/Class;ILjava/util/function/Predicate;)Ljava/util/List;
        35: aload_1
        36: invokedynamic #200,  0            // InvokeDynamic #1:accept:(Lext/mods/gameserver/enums/actors/MissionType;)Ljava/util/function/Consumer;
        41: invokeinterface #204,  2          // InterfaceMethod java/util/List.forEach:(Ljava/util/function/Consumer;)V
        46: goto          54
        49: aload_0
        50: aload_1
        51: invokevirtual #210                // Method update:(Lext/mods/gameserver/enums/actors/MissionType;)V
        54: return
      LineNumberTable:
        line 122: 0
        line 123: 6
        line 125: 7
        line 126: 17
        line 128: 49
        line 129: 54
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      55     0  this   Lext/mods/gameserver/model/actor/container/player/MissionList;
            0      55     1  type   Lext/mods/gameserver/enums/actors/MissionType;
      StackMapTable: number_of_entries = 3
        frame_type = 7 /* same */
        frame_type = 41 /* same */
        frame_type = 4 /* same */

  public void update(ext.mods.gameserver.enums.actors.MissionType);
    descriptor: (Lext/mods/gameserver/enums/actors/MissionType;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=2, args_size=2
         0: getstatic     #20                 // Field ext/mods/Config.ENABLE_MISSION:Z
         3: ifne          7
         6: return
         7: aload_0
         8: aload_1
         9: iconst_1
        10: iconst_1
        11: iconst_1
        12: invokevirtual #214                // Method set:(Lext/mods/gameserver/enums/actors/MissionType;IZZ)V
        15: return
      LineNumberTable:
        line 136: 0
        line 137: 6
        line 139: 7
        line 140: 15
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      16     0  this   Lext/mods/gameserver/model/actor/container/player/MissionList;
            0      16     1  type   Lext/mods/gameserver/enums/actors/MissionType;
      StackMapTable: number_of_entries = 1
        frame_type = 7 /* same */

  public void set(ext.mods.gameserver.enums.actors.MissionType, int, boolean, boolean);
    descriptor: (Lext/mods/gameserver/enums/actors/MissionType;IZZ)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=8, locals=8, args_size=5
         0: getstatic     #20                 // Field ext/mods/Config.ENABLE_MISSION:Z
         3: ifne          7
         6: return
         7: invokestatic  #218                // Method ext/mods/gameserver/custom/data/MissionData.getInstance:()Lext/mods/gameserver/custom/data/MissionData;
        10: aload_1
        11: invokevirtual #224                // Method ext/mods/gameserver/custom/data/MissionData.getMission:(Lext/mods/gameserver/enums/actors/MissionType;)Ljava/util/List;
        14: astore        5
        16: aload_1
        17: ifnull        35
        20: aload         5
        22: ifnull        35
        25: aload         5
        27: invokeinterface #228,  1          // InterfaceMethod java/util/List.isEmpty:()Z
        32: ifeq          36
        35: return
        36: aload_0
        37: getfield      #10                 // Field _entries:Ljava/util/Map;
        40: aload_1
        41: invokeinterface #176,  2          // InterfaceMethod java/util/Map.containsKey:(Ljava/lang/Object;)Z
        46: ifeq          65
        49: aload_0
        50: getfield      #10                 // Field _entries:Ljava/util/Map;
        53: aload_1
        54: invokeinterface #180,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        59: checkcast     #74                 // class ext/mods/gameserver/model/holder/IntIntHolder
        62: goto          74
        65: new           #74                 // class ext/mods/gameserver/model/holder/IntIntHolder
        68: dup
        69: iconst_0
        70: iload_2
        71: invokespecial #84                 // Method ext/mods/gameserver/model/holder/IntIntHolder."<init>":(II)V
        74: astore        6
        76: aload         5
        78: invokeinterface #231,  1          // InterfaceMethod java/util/List.size:()I
        83: aload         6
        85: invokevirtual #146                // Method ext/mods/gameserver/model/holder/IntIntHolder.getId:()I
        88: if_icmpge     92
        91: return
        92: invokestatic  #218                // Method ext/mods/gameserver/custom/data/MissionData.getInstance:()Lext/mods/gameserver/custom/data/MissionData;
        95: aload_1
        96: aload         6
        98: invokevirtual #146                // Method ext/mods/gameserver/model/holder/IntIntHolder.getId:()I
       101: iconst_1
       102: iadd
       103: invokevirtual #234                // Method ext/mods/gameserver/custom/data/MissionData.getMissionByLevel:(Lext/mods/gameserver/enums/actors/MissionType;I)Lext/mods/gameserver/model/Mission;
       106: astore        7
       108: aload         7
       110: ifnull        126
       113: aload         7
       115: invokevirtual #238                // Method ext/mods/gameserver/model/Mission.getLevel:()I
       118: aload         6
       120: invokevirtual #146                // Method ext/mods/gameserver/model/holder/IntIntHolder.getId:()I
       123: if_icmpne     127
       126: return
       127: aload         6
       129: iload_3
       130: ifeq          143
       133: aload         6
       135: invokevirtual #149                // Method ext/mods/gameserver/model/holder/IntIntHolder.getValue:()I
       138: iload_2
       139: iadd
       140: goto          144
       143: iload_2
       144: invokevirtual #243                // Method ext/mods/gameserver/model/holder/IntIntHolder.setValue:(I)V
       147: aload         7
       149: invokevirtual #247                // Method ext/mods/gameserver/model/Mission.getRequired:()I
       152: aload         6
       154: invokevirtual #149                // Method ext/mods/gameserver/model/holder/IntIntHolder.getValue:()I
       157: if_icmpgt     289
       160: aload         7
       162: invokevirtual #250                // Method ext/mods/gameserver/model/Mission.getRewards:()Ljava/util/List;
       165: ifnull        197
       168: aload         7
       170: invokevirtual #250                // Method ext/mods/gameserver/model/Mission.getRewards:()Ljava/util/List;
       173: invokeinterface #228,  1          // InterfaceMethod java/util/List.isEmpty:()Z
       178: ifne          197
       181: aload         7
       183: invokevirtual #250                // Method ext/mods/gameserver/model/Mission.getRewards:()Ljava/util/List;
       186: aload_0
       187: invokedynamic #254,  0            // InvokeDynamic #2:accept:(Lext/mods/gameserver/model/actor/container/player/MissionList;)Ljava/util/function/Consumer;
       192: invokeinterface #204,  2          // InterfaceMethod java/util/List.forEach:(Ljava/util/function/Consumer;)V
       197: aload         6
       199: aload         6
       201: invokevirtual #146                // Method ext/mods/gameserver/model/holder/IntIntHolder.getId:()I
       204: iconst_1
       205: iadd
       206: invokevirtual #257                // Method ext/mods/gameserver/model/holder/IntIntHolder.setId:(I)V
       209: aload         6
       211: iload         4
       213: ifeq          220
       216: iconst_0
       217: goto          225
       220: aload         6
       222: invokevirtual #149                // Method ext/mods/gameserver/model/holder/IntIntHolder.getValue:()I
       225: invokevirtual #243                // Method ext/mods/gameserver/model/holder/IntIntHolder.setValue:(I)V
       228: aload_0
       229: getfield      #16                 // Field _player:Lext/mods/gameserver/model/actor/Player;
       232: new           #260                // class ext/mods/gameserver/network/serverpackets/MagicSkillUse
       235: dup
       236: aload_0
       237: getfield      #16                 // Field _player:Lext/mods/gameserver/model/actor/Player;
       240: sipush        5103
       243: iconst_1
       244: sipush        1000
       247: iconst_0
       248: invokespecial #262                // Method ext/mods/gameserver/network/serverpackets/MagicSkillUse."<init>":(Lext/mods/gameserver/model/actor/Creature;IIII)V
       251: invokevirtual #265                // Method ext/mods/gameserver/model/actor/Player.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       254: aload_0
       255: getfield      #16                 // Field _player:Lext/mods/gameserver/model/actor/Player;
       258: new           #269                // class ext/mods/gameserver/network/serverpackets/CreatureSay
       261: dup
       262: getstatic     #271                // Field ext/mods/gameserver/enums/SayType.PARTY:Lext/mods/gameserver/enums/SayType;
       265: ldc_w         #277                // String Achievements
       268: aload         7
       270: invokevirtual #238                // Method ext/mods/gameserver/model/Mission.getLevel:()I
       273: aload         7
       275: invokevirtual #279                // Method ext/mods/gameserver/model/Mission.getName:()Ljava/lang/String;
       278: invokedynamic #280,  0            // InvokeDynamic #3:makeConcatWithConstants:(ILjava/lang/String;)Ljava/lang/String;
       283: invokespecial #284                // Method ext/mods/gameserver/network/serverpackets/CreatureSay."<init>":(Lext/mods/gameserver/enums/SayType;Ljava/lang/String;Ljava/lang/String;)V
       286: invokevirtual #287                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       289: aload_0
       290: getfield      #10                 // Field _entries:Ljava/util/Map;
       293: aload_1
       294: aload         6
       296: invokeinterface #86,  3           // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
       301: pop
       302: return
      LineNumberTable:
        line 150: 0
        line 151: 6
        line 153: 7
        line 154: 16
        line 155: 35
        line 157: 36
        line 158: 76
        line 159: 91
        line 161: 92
        line 162: 108
        line 163: 126
        line 165: 127
        line 167: 147
        line 169: 160
        line 170: 181
        line 172: 197
        line 173: 209
        line 175: 228
        line 176: 254
        line 178: 289
        line 179: 302
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     303     0  this   Lext/mods/gameserver/model/actor/container/player/MissionList;
            0     303     1  type   Lext/mods/gameserver/enums/actors/MissionType;
            0     303     2 value   I
            0     303     3 increaseValue   Z
            0     303     4 resetValue   Z
           16     287     5 missions   Ljava/util/List;
           76     227     6 mission   Lext/mods/gameserver/model/holder/IntIntHolder;
          108     195     7 missionData   Lext/mods/gameserver/model/Mission;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
           16     287     5 missions   Ljava/util/List<Lext/mods/gameserver/model/Mission;>;
      StackMapTable: number_of_entries = 14
        frame_type = 7 /* same */
        frame_type = 252 /* append */
          offset_delta = 27
          locals = [ class java/util/List ]
        frame_type = 0 /* same */
        frame_type = 28 /* same */
        frame_type = 72 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/model/holder/IntIntHolder ]
        frame_type = 252 /* append */
          offset_delta = 17
          locals = [ class ext/mods/gameserver/model/holder/IntIntHolder ]
        frame_type = 252 /* append */
          offset_delta = 33
          locals = [ class ext/mods/gameserver/model/Mission ]
        frame_type = 0 /* same */
        frame_type = 79 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/model/holder/IntIntHolder ]
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/model/actor/container/player/MissionList, class ext/mods/gameserver/enums/actors/MissionType, int, int, int, class java/util/List, class ext/mods/gameserver/model/holder/IntIntHolder, class ext/mods/gameserver/model/Mission ]
          stack = [ class ext/mods/gameserver/model/holder/IntIntHolder, int ]
        frame_type = 52 /* same */
        frame_type = 86 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/model/holder/IntIntHolder ]
        frame_type = 255 /* full_frame */
          offset_delta = 4
          locals = [ class ext/mods/gameserver/model/actor/container/player/MissionList, class ext/mods/gameserver/enums/actors/MissionType, int, int, int, class java/util/List, class ext/mods/gameserver/model/holder/IntIntHolder, class ext/mods/gameserver/model/Mission ]
          stack = [ class ext/mods/gameserver/model/holder/IntIntHolder, int ]
        frame_type = 63 /* same */

  public java.util.List<ext.mods.gameserver.enums.actors.MissionType> getAvailableTypes();
    descriptor: ()Ljava/util/List;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=1
         0: invokestatic  #218                // Method ext/mods/gameserver/custom/data/MissionData.getInstance:()Lext/mods/gameserver/custom/data/MissionData;
         3: invokevirtual #290                // Method ext/mods/gameserver/custom/data/MissionData.getMissions:()Ljava/util/Map;
         6: astore_1
         7: aload_1
         8: ifnull        20
        11: aload_1
        12: invokeinterface #294,  1          // InterfaceMethod java/util/Map.isEmpty:()Z
        17: ifeq          24
        20: invokestatic  #295                // Method java/util/Collections.emptyList:()Ljava/util/List;
        23: areturn
        24: aload_1
        25: invokeinterface #300,  1          // InterfaceMethod java/util/Map.keySet:()Ljava/util/Set;
        30: invokeinterface #303,  1          // InterfaceMethod java/util/Set.stream:()Ljava/util/stream/Stream;
        35: aload_0
        36: invokedynamic #307,  0            // InvokeDynamic #4:test:(Lext/mods/gameserver/model/actor/container/player/MissionList;)Ljava/util/function/Predicate;
        41: invokeinterface #308,  2          // InterfaceMethod java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
        46: invokestatic  #314                // Method java/util/stream/Collectors.toList:()Ljava/util/stream/Collector;
        49: invokeinterface #320,  2          // InterfaceMethod java/util/stream/Stream.collect:(Ljava/util/stream/Collector;)Ljava/lang/Object;
        54: checkcast     #205                // class java/util/List
        57: areturn
      LineNumberTable:
        line 186: 0
        line 187: 7
        line 188: 20
        line 190: 24
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      58     0  this   Lext/mods/gameserver/model/actor/container/player/MissionList;
            7      51     1 missions   Ljava/util/Map;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            7      51     1 missions   Ljava/util/Map<Lext/mods/gameserver/enums/actors/MissionType;Ljava/util/List<Lext/mods/gameserver/model/Mission;>;>;
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 20
          locals = [ class java/util/Map ]
        frame_type = 3 /* same */
    Signature: #415                         // ()Ljava/util/List<Lext/mods/gameserver/enums/actors/MissionType;>;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=3, locals=0, args_size=0
         0: new           #116                // class ext/mods/commons/logging/CLogger
         3: dup
         4: ldc           #11                 // class ext/mods/gameserver/model/actor/container/player/MissionList
         6: invokevirtual #368                // Method java/lang/Class.getName:()Ljava/lang/String;
         9: invokespecial #371                // Method ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
        12: putstatic     #105                // Field LOGGER:Lext/mods/commons/logging/CLogger;
        15: return
      LineNumberTable:
        line 45: 0
}
SourceFile: "MissionList.java"
NestMembers:
  ext/mods/gameserver/model/actor/container/player/MissionList$1
BootstrapMethods:
  0: #451 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #430 (Ljava/lang/Object;)Z
      #431 REF_invokeVirtual ext/mods/gameserver/model/actor/container/player/MissionList.lambda$updateParty$0:(Lext/mods/gameserver/model/actor/Player;)Z
      #434 (Lext/mods/gameserver/model/actor/Player;)Z
  1: #451 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #435 (Ljava/lang/Object;)V
      #437 REF_invokeStatic ext/mods/gameserver/model/actor/container/player/MissionList.lambda$updateParty$1:(Lext/mods/gameserver/enums/actors/MissionType;Lext/mods/gameserver/model/actor/Player;)V
      #440 (Lext/mods/gameserver/model/actor/Player;)V
  2: #451 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #435 (Ljava/lang/Object;)V
      #441 REF_invokeVirtual ext/mods/gameserver/model/actor/container/player/MissionList.lambda$set$0:(Lext/mods/gameserver/model/holder/IntIntHolder;)V
      #444 (Lext/mods/gameserver/model/holder/IntIntHolder;)V
  3: #458 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #445 Lv \u0001 \u0001 mission complete.
  4: #451 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #430 (Ljava/lang/Object;)Z
      #447 REF_invokeVirtual ext/mods/gameserver/model/actor/container/player/MissionList.lambda$getAvailableTypes$0:(Lext/mods/gameserver/enums/actors/MissionType;)Z
      #450 (Lext/mods/gameserver/enums/actors/MissionType;)Z
InnerClasses:
  public static #465= #141 of #87;        // Entry=class java/util/Map$Entry of class java/util/Map
  static #325;                            // class ext/mods/gameserver/model/actor/container/player/MissionList$1
  public static final #470= #466 of #468; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
