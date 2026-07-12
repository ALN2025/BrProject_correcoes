// Bytecode for: ext.mods.gameserver.data.manager.HeroManager
// File: ext\mods\gameserver\data\manager\HeroManager.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/data/manager/HeroManager.class
  Last modified 9 de jul de 2026; size 31459 bytes
  MD5 checksum 89abca1ba77a91ba17c693cb1fc29d02
  Compiled from "HeroManager.java"
public class ext.mods.gameserver.data.manager.HeroManager
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #11                         // ext/mods/gameserver/data/manager/HeroManager
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 31, methods: 25, attributes: 4
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
   #10 = Fieldref           #11.#12       // ext/mods/gameserver/data/manager/HeroManager._heroes:Ljava/util/Map;
   #11 = Class              #13           // ext/mods/gameserver/data/manager/HeroManager
   #12 = NameAndType        #14:#15       // _heroes:Ljava/util/Map;
   #13 = Utf8               ext/mods/gameserver/data/manager/HeroManager
   #14 = Utf8               _heroes
   #15 = Utf8               Ljava/util/Map;
   #16 = Fieldref           #11.#17       // ext/mods/gameserver/data/manager/HeroManager._completeHeroes:Ljava/util/Map;
   #17 = NameAndType        #18:#15       // _completeHeroes:Ljava/util/Map;
   #18 = Utf8               _completeHeroes
   #19 = Fieldref           #11.#20       // ext/mods/gameserver/data/manager/HeroManager._heroCounts:Ljava/util/Map;
   #20 = NameAndType        #21:#15       // _heroCounts:Ljava/util/Map;
   #21 = Utf8               _heroCounts
   #22 = Fieldref           #11.#23       // ext/mods/gameserver/data/manager/HeroManager._heroFights:Ljava/util/Map;
   #23 = NameAndType        #24:#15       // _heroFights:Ljava/util/Map;
   #24 = Utf8               _heroFights
   #25 = Class              #26           // java/util/ArrayList
   #26 = Utf8               java/util/ArrayList
   #27 = Methodref          #25.#3        // java/util/ArrayList."<init>":()V
   #28 = Fieldref           #11.#29       // ext/mods/gameserver/data/manager/HeroManager._fights:Ljava/util/List;
   #29 = NameAndType        #30:#31       // _fights:Ljava/util/List;
   #30 = Utf8               _fights
   #31 = Utf8               Ljava/util/List;
   #32 = Fieldref           #11.#33       // ext/mods/gameserver/data/manager/HeroManager._heroDiaries:Ljava/util/Map;
   #33 = NameAndType        #34:#15       // _heroDiaries:Ljava/util/Map;
   #34 = Utf8               _heroDiaries
   #35 = Fieldref           #11.#36       // ext/mods/gameserver/data/manager/HeroManager._heroMessages:Ljava/util/Map;
   #36 = NameAndType        #37:#15       // _heroMessages:Ljava/util/Map;
   #37 = Utf8               _heroMessages
   #38 = Fieldref           #11.#39       // ext/mods/gameserver/data/manager/HeroManager._diary:Ljava/util/List;
   #39 = NameAndType        #40:#31       // _diary:Ljava/util/List;
   #40 = Utf8               _diary
   #41 = Methodref          #42.#43       // ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
   #42 = Class              #44           // ext/mods/commons/pool/ConnectionPool
   #43 = NameAndType        #45:#46       // getConnection:()Ljava/sql/Connection;
   #44 = Utf8               ext/mods/commons/pool/ConnectionPool
   #45 = Utf8               getConnection
   #46 = Utf8               ()Ljava/sql/Connection;
   #47 = String             #48           // SELECT characters.clanid AS clanid, coalesce(clan_data.ally_Id, 0) AS allyId FROM characters LEFT JOIN clan_data ON clan_data.clan_id = characters.clanid WHERE characters.obj_Id = ?
   #48 = Utf8               SELECT characters.clanid AS clanid, coalesce(clan_data.ally_Id, 0) AS allyId FROM characters LEFT JOIN clan_data ON clan_data.clan_id = characters.clanid WHERE characters.obj_Id = ?
   #49 = InterfaceMethodref #50.#51       // java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
   #50 = Class              #52           // java/sql/Connection
   #51 = NameAndType        #53:#54       // prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
   #52 = Utf8               java/sql/Connection
   #53 = Utf8               prepareStatement
   #54 = Utf8               (Ljava/lang/String;)Ljava/sql/PreparedStatement;
   #55 = String             #56           // SELECT heroes.char_id, characters.char_name, heroes.class_id, heroes.count, heroes.played, heroes.active FROM heroes, characters WHERE characters.obj_Id = heroes.char_id AND heroes.played = 1
   #56 = Utf8               SELECT heroes.char_id, characters.char_name, heroes.class_id, heroes.count, heroes.played, heroes.active FROM heroes, characters WHERE characters.obj_Id = heroes.char_id AND heroes.played = 1
   #57 = InterfaceMethodref #58.#59       // java/sql/PreparedStatement.executeQuery:()Ljava/sql/ResultSet;
   #58 = Class              #60           // java/sql/PreparedStatement
   #59 = NameAndType        #61:#62       // executeQuery:()Ljava/sql/ResultSet;
   #60 = Utf8               java/sql/PreparedStatement
   #61 = Utf8               executeQuery
   #62 = Utf8               ()Ljava/sql/ResultSet;
   #63 = InterfaceMethodref #64.#65       // java/sql/ResultSet.next:()Z
   #64 = Class              #66           // java/sql/ResultSet
   #65 = NameAndType        #67:#68       // next:()Z
   #66 = Utf8               java/sql/ResultSet
   #67 = Utf8               next
   #68 = Utf8               ()Z
   #69 = Class              #70           // ext/mods/gameserver/model/olympiad/Olympiad
   #70 = Utf8               ext/mods/gameserver/model/olympiad/Olympiad
   #71 = String             #72           // char_id
   #72 = Utf8               char_id
   #73 = InterfaceMethodref #64.#74       // java/sql/ResultSet.getInt:(Ljava/lang/String;)I
   #74 = NameAndType        #75:#76       // getInt:(Ljava/lang/String;)I
   #75 = Utf8               getInt
   #76 = Utf8               (Ljava/lang/String;)I
   #77 = Class              #78           // ext/mods/commons/data/StatSet
   #78 = Utf8               ext/mods/commons/data/StatSet
   #79 = Methodref          #77.#3        // ext/mods/commons/data/StatSet."<init>":()V
   #80 = String             #81           // char_name
   #81 = Utf8               char_name
   #82 = InterfaceMethodref #64.#83       // java/sql/ResultSet.getString:(Ljava/lang/String;)Ljava/lang/String;
   #83 = NameAndType        #84:#85       // getString:(Ljava/lang/String;)Ljava/lang/String;
   #84 = Utf8               getString
   #85 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
   #86 = Methodref          #77.#87       // ext/mods/commons/data/StatSet.set:(Ljava/lang/String;Ljava/lang/String;)V
   #87 = NameAndType        #88:#89       // set:(Ljava/lang/String;Ljava/lang/String;)V
   #88 = Utf8               set
   #89 = Utf8               (Ljava/lang/String;Ljava/lang/String;)V
   #90 = String             #91           // class_id
   #91 = Utf8               class_id
   #92 = Methodref          #77.#93       // ext/mods/commons/data/StatSet.set:(Ljava/lang/String;I)V
   #93 = NameAndType        #88:#94       // set:(Ljava/lang/String;I)V
   #94 = Utf8               (Ljava/lang/String;I)V
   #95 = String             #96           // count
   #96 = Utf8               count
   #97 = String             #98           // played
   #98 = Utf8               played
   #99 = String             #100          // active
  #100 = Utf8               active
  #101 = Methodref          #11.#102      // ext/mods/gameserver/data/manager/HeroManager.loadFights:(I)V
  #102 = NameAndType        #103:#104     // loadFights:(I)V
  #103 = Utf8               loadFights
  #104 = Utf8               (I)V
  #105 = Methodref          #11.#106      // ext/mods/gameserver/data/manager/HeroManager.loadDiary:(I)V
  #106 = NameAndType        #107:#104     // loadDiary:(I)V
  #107 = Utf8               loadDiary
  #108 = Methodref          #11.#109      // ext/mods/gameserver/data/manager/HeroManager.loadMessage:(I)V
  #109 = NameAndType        #110:#104     // loadMessage:(I)V
  #110 = Utf8               loadMessage
  #111 = InterfaceMethodref #58.#112      // java/sql/PreparedStatement.setInt:(II)V
  #112 = NameAndType        #113:#114     // setInt:(II)V
  #113 = Utf8               setInt
  #114 = Utf8               (II)V
  #115 = String             #116          //
  #116 = Utf8
  #117 = String             #118          // clanid
  #118 = Utf8               clanid
  #119 = Methodref          #120.#121     // ext/mods/gameserver/data/sql/ClanTable.getInstance:()Lext/mods/gameserver/data/sql/ClanTable;
  #120 = Class              #122          // ext/mods/gameserver/data/sql/ClanTable
  #121 = NameAndType        #123:#124     // getInstance:()Lext/mods/gameserver/data/sql/ClanTable;
  #122 = Utf8               ext/mods/gameserver/data/sql/ClanTable
  #123 = Utf8               getInstance
  #124 = Utf8               ()Lext/mods/gameserver/data/sql/ClanTable;
  #125 = Methodref          #120.#126     // ext/mods/gameserver/data/sql/ClanTable.getClan:(I)Lext/mods/gameserver/model/pledge/Clan;
  #126 = NameAndType        #127:#128     // getClan:(I)Lext/mods/gameserver/model/pledge/Clan;
  #127 = Utf8               getClan
  #128 = Utf8               (I)Lext/mods/gameserver/model/pledge/Clan;
  #129 = Methodref          #130.#131     // ext/mods/gameserver/model/pledge/Clan.getName:()Ljava/lang/String;
  #130 = Class              #132          // ext/mods/gameserver/model/pledge/Clan
  #131 = NameAndType        #133:#134     // getName:()Ljava/lang/String;
  #132 = Utf8               ext/mods/gameserver/model/pledge/Clan
  #133 = Utf8               getName
  #134 = Utf8               ()Ljava/lang/String;
  #135 = Methodref          #130.#136     // ext/mods/gameserver/model/pledge/Clan.getCrestId:()I
  #136 = NameAndType        #137:#138     // getCrestId:()I
  #137 = Utf8               getCrestId
  #138 = Utf8               ()I
  #139 = String             #140          // allyId
  #140 = Utf8               allyId
  #141 = Methodref          #130.#142     // ext/mods/gameserver/model/pledge/Clan.getAllyName:()Ljava/lang/String;
  #142 = NameAndType        #143:#134     // getAllyName:()Ljava/lang/String;
  #143 = Utf8               getAllyName
  #144 = Methodref          #130.#145     // ext/mods/gameserver/model/pledge/Clan.getAllyCrestId:()I
  #145 = NameAndType        #146:#138     // getAllyCrestId:()I
  #146 = Utf8               getAllyCrestId
  #147 = String             #148          // clan_crest
  #148 = Utf8               clan_crest
  #149 = String             #150          // clan_name
  #150 = Utf8               clan_name
  #151 = String             #152          // ally_crest
  #152 = Utf8               ally_crest
  #153 = String             #154          // ally_name
  #154 = Utf8               ally_name
  #155 = InterfaceMethodref #64.#156      // java/sql/ResultSet.close:()V
  #156 = NameAndType        #157:#6       // close:()V
  #157 = Utf8               close
  #158 = Class              #159          // java/lang/Throwable
  #159 = Utf8               java/lang/Throwable
  #160 = Methodref          #158.#161     // java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
  #161 = NameAndType        #162:#163     // addSuppressed:(Ljava/lang/Throwable;)V
  #162 = Utf8               addSuppressed
  #163 = Utf8               (Ljava/lang/Throwable;)V
  #164 = InterfaceMethodref #58.#165      // java/sql/PreparedStatement.clearParameters:()V
  #165 = NameAndType        #166:#6       // clearParameters:()V
  #166 = Utf8               clearParameters
  #167 = Methodref          #168.#169     // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
  #168 = Class              #170          // java/lang/Integer
  #169 = NameAndType        #171:#172     // valueOf:(I)Ljava/lang/Integer;
  #170 = Utf8               java/lang/Integer
  #171 = Utf8               valueOf
  #172 = Utf8               (I)Ljava/lang/Integer;
  #173 = InterfaceMethodref #174.#175     // java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #174 = Class              #176          // java/util/Map
  #175 = NameAndType        #177:#178     // put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #176 = Utf8               java/util/Map
  #177 = Utf8               put
  #178 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #179 = InterfaceMethodref #58.#156      // java/sql/PreparedStatement.close:()V
  #180 = String             #181          // SELECT heroes.char_id, characters.char_name, heroes.class_id, heroes.count, heroes.played, heroes.active FROM heroes, characters WHERE characters.obj_Id = heroes.char_id
  #181 = Utf8               SELECT heroes.char_id, characters.char_name, heroes.class_id, heroes.count, heroes.played, heroes.active FROM heroes, characters WHERE characters.obj_Id = heroes.char_id
  #182 = InterfaceMethodref #50.#156      // java/sql/Connection.close:()V
  #183 = Class              #184          // java/lang/Exception
  #184 = Utf8               java/lang/Exception
  #185 = Fieldref           #11.#186      // ext/mods/gameserver/data/manager/HeroManager.LOGGER:Lext/mods/commons/logging/CLogger;
  #186 = NameAndType        #187:#188     // LOGGER:Lext/mods/commons/logging/CLogger;
  #187 = Utf8               LOGGER
  #188 = Utf8               Lext/mods/commons/logging/CLogger;
  #189 = String             #190          // Couldn\'t load heroes.
  #190 = Utf8               Couldn\'t load heroes.
  #191 = Methodref          #192.#193     // ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
  #192 = Class              #194          // ext/mods/commons/logging/CLogger
  #193 = NameAndType        #195:#196     // error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
  #194 = Utf8               ext/mods/commons/logging/CLogger
  #195 = Utf8               error
  #196 = Utf8               (Ljava/lang/Object;Ljava/lang/Throwable;)V
  #197 = String             #198          // Loaded {} heroes and {} all time heroes.
  #198 = Utf8               Loaded {} heroes and {} all time heroes.
  #199 = InterfaceMethodref #174.#200     // java/util/Map.size:()I
  #200 = NameAndType        #201:#138     // size:()I
  #201 = Utf8               size
  #202 = Methodref          #192.#203     // ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
  #203 = NameAndType        #204:#205     // info:(Ljava/lang/Object;[Ljava/lang/Object;)V
  #204 = Utf8               info
  #205 = Utf8               (Ljava/lang/Object;[Ljava/lang/Object;)V
  #206 = String             #207          // %%0%dd
  #207 = Utf8               %%0%dd
  #208 = Methodref          #209.#210     // java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
  #209 = Class              #211          // java/lang/String
  #210 = NameAndType        #212:#213     // format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
  #211 = Utf8               java/lang/String
  #212 = Utf8               format
  #213 = Utf8               (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
  #214 = Long               1000l
  #216 = Long               60l
  #218 = Methodref          #219.#220     // java/lang/Long.valueOf:(J)Ljava/lang/Long;
  #219 = Class              #221          // java/lang/Long
  #220 = NameAndType        #171:#222     // valueOf:(J)Ljava/lang/Long;
  #221 = Utf8               java/lang/Long
  #222 = Utf8               (J)Ljava/lang/Long;
  #223 = Long               3600l
  #225 = InvokeDynamic      #0:#226       // #0:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #226 = NameAndType        #227:#228     // makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #227 = Utf8               makeConcatWithConstants
  #228 = Utf8               (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #229 = String             #230          // SELECT message FROM heroes WHERE char_id=?
  #230 = Utf8               SELECT message FROM heroes WHERE char_id=?
  #231 = String             #232          // message
  #232 = Utf8               message
  #233 = String             #234          // Couldn\'t load hero message for: {}.
  #234 = Utf8               Couldn\'t load hero message for: {}.
  #235 = Methodref          #192.#236     // ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
  #236 = NameAndType        #195:#237     // error:(Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
  #237 = Utf8               (Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
  #238 = String             #239          // SELECT * FROM  heroes_diary WHERE char_id=? ORDER BY time ASC
  #239 = Utf8               SELECT * FROM  heroes_diary WHERE char_id=? ORDER BY time ASC
  #240 = String             #241          // time
  #241 = Utf8               time
  #242 = InterfaceMethodref #64.#243      // java/sql/ResultSet.getLong:(Ljava/lang/String;)J
  #243 = NameAndType        #244:#245     // getLong:(Ljava/lang/String;)J
  #244 = Utf8               getLong
  #245 = Utf8               (Ljava/lang/String;)J
  #246 = String             #247          // action
  #247 = Utf8               action
  #248 = String             #249          // param
  #249 = Utf8               param
  #250 = String             #251          // date
  #251 = Utf8               date
  #252 = Class              #253          // java/text/SimpleDateFormat
  #253 = Utf8               java/text/SimpleDateFormat
  #254 = String             #255          // yyyy-MM-dd HH
  #255 = Utf8               yyyy-MM-dd HH
  #256 = Methodref          #252.#257     // java/text/SimpleDateFormat."<init>":(Ljava/lang/String;)V
  #257 = NameAndType        #5:#258       // "<init>":(Ljava/lang/String;)V
  #258 = Utf8               (Ljava/lang/String;)V
  #259 = Methodref          #252.#260     // java/text/SimpleDateFormat.format:(Ljava/lang/Object;)Ljava/lang/String;
  #260 = NameAndType        #212:#261     // format:(Ljava/lang/Object;)Ljava/lang/String;
  #261 = Utf8               (Ljava/lang/Object;)Ljava/lang/String;
  #262 = Methodref          #263.#264     // ext/mods/gameserver/data/xml/NpcData.getInstance:()Lext/mods/gameserver/data/xml/NpcData;
  #263 = Class              #265          // ext/mods/gameserver/data/xml/NpcData
  #264 = NameAndType        #123:#266     // getInstance:()Lext/mods/gameserver/data/xml/NpcData;
  #265 = Utf8               ext/mods/gameserver/data/xml/NpcData
  #266 = Utf8               ()Lext/mods/gameserver/data/xml/NpcData;
  #267 = Methodref          #263.#268     // ext/mods/gameserver/data/xml/NpcData.getTemplate:(I)Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #268 = NameAndType        #269:#270     // getTemplate:(I)Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #269 = Utf8               getTemplate
  #270 = Utf8               (I)Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #271 = Methodref          #272.#131     // ext/mods/gameserver/model/actor/template/NpcTemplate.getName:()Ljava/lang/String;
  #272 = Class              #273          // ext/mods/gameserver/model/actor/template/NpcTemplate
  #273 = Utf8               ext/mods/gameserver/model/actor/template/NpcTemplate
  #274 = InvokeDynamic      #1:#275       // #1:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #275 = NameAndType        #227:#85      // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #276 = String             #277          // Gained Hero status
  #277 = Utf8               Gained Hero status
  #278 = Methodref          #279.#280     // ext/mods/gameserver/data/manager/CastleManager.getInstance:()Lext/mods/gameserver/data/manager/CastleManager;
  #279 = Class              #281          // ext/mods/gameserver/data/manager/CastleManager
  #280 = NameAndType        #123:#282     // getInstance:()Lext/mods/gameserver/data/manager/CastleManager;
  #281 = Utf8               ext/mods/gameserver/data/manager/CastleManager
  #282 = Utf8               ()Lext/mods/gameserver/data/manager/CastleManager;
  #283 = Methodref          #279.#284     // ext/mods/gameserver/data/manager/CastleManager.getCastleById:(I)Lext/mods/gameserver/model/residence/castle/Castle;
  #284 = NameAndType        #285:#286     // getCastleById:(I)Lext/mods/gameserver/model/residence/castle/Castle;
  #285 = Utf8               getCastleById
  #286 = Utf8               (I)Lext/mods/gameserver/model/residence/castle/Castle;
  #287 = Methodref          #288.#131     // ext/mods/gameserver/model/residence/castle/Castle.getName:()Ljava/lang/String;
  #288 = Class              #289          // ext/mods/gameserver/model/residence/castle/Castle
  #289 = Utf8               ext/mods/gameserver/model/residence/castle/Castle
  #290 = InvokeDynamic      #2:#275       // #2:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #291 = InterfaceMethodref #292.#293     // java/util/List.add:(Ljava/lang/Object;)Z
  #292 = Class              #294          // java/util/List
  #293 = NameAndType        #295:#296     // add:(Ljava/lang/Object;)Z
  #294 = Utf8               java/util/List
  #295 = Utf8               add
  #296 = Utf8               (Ljava/lang/Object;)Z
  #297 = String             #298          // Couldn\'t load hero diary for: {}.
  #298 = Utf8               Couldn\'t load hero diary for: {}.
  #299 = String             #300          // Loaded {} diary entries for hero: {}.
  #300 = Utf8               Loaded {} diary entries for hero: {}.
  #301 = Methodref          #302.#303     // ext/mods/gameserver/data/sql/PlayerInfoTable.getInstance:()Lext/mods/gameserver/data/sql/PlayerInfoTable;
  #302 = Class              #304          // ext/mods/gameserver/data/sql/PlayerInfoTable
  #303 = NameAndType        #123:#305     // getInstance:()Lext/mods/gameserver/data/sql/PlayerInfoTable;
  #304 = Utf8               ext/mods/gameserver/data/sql/PlayerInfoTable
  #305 = Utf8               ()Lext/mods/gameserver/data/sql/PlayerInfoTable;
  #306 = Methodref          #302.#307     // ext/mods/gameserver/data/sql/PlayerInfoTable.getPlayerName:(I)Ljava/lang/String;
  #307 = NameAndType        #308:#309     // getPlayerName:(I)Ljava/lang/String;
  #308 = Utf8               getPlayerName
  #309 = Utf8               (I)Ljava/lang/String;
  #310 = Methodref          #311.#312     // java/util/Calendar.getInstance:()Ljava/util/Calendar;
  #311 = Class              #313          // java/util/Calendar
  #312 = NameAndType        #123:#314     // getInstance:()Ljava/util/Calendar;
  #313 = Utf8               java/util/Calendar
  #314 = Utf8               ()Ljava/util/Calendar;
  #315 = Methodref          #311.#316     // java/util/Calendar.set:(II)V
  #316 = NameAndType        #88:#114      // set:(II)V
  #317 = Methodref          #311.#318     // java/util/Calendar.getTimeInMillis:()J
  #318 = NameAndType        #319:#320     // getTimeInMillis:()J
  #319 = Utf8               getTimeInMillis
  #320 = Utf8               ()J
  #321 = String             #322          // SELECT * FROM olympiad_fights WHERE (charOneId=? OR charTwoId=?) AND start<? ORDER BY start ASC
  #322 = Utf8               SELECT * FROM olympiad_fights WHERE (charOneId=? OR charTwoId=?) AND start<? ORDER BY start ASC
  #323 = InterfaceMethodref #58.#324      // java/sql/PreparedStatement.setLong:(IJ)V
  #324 = NameAndType        #325:#326     // setLong:(IJ)V
  #325 = Utf8               setLong
  #326 = Utf8               (IJ)V
  #327 = String             #328          // charOneId
  #328 = Utf8               charOneId
  #329 = String             #330          // charOneClass
  #330 = Utf8               charOneClass
  #331 = String             #332          // charTwoId
  #332 = Utf8               charTwoId
  #333 = String             #334          // charTwoClass
  #334 = Utf8               charTwoClass
  #335 = String             #336          // winner
  #336 = Utf8               winner
  #337 = String             #338          // start
  #338 = Utf8               start
  #339 = String             #340          // classed
  #340 = Utf8               classed
  #341 = Methodref          #342.#343     // ext/mods/gameserver/data/xml/PlayerData.getInstance:()Lext/mods/gameserver/data/xml/PlayerData;
  #342 = Class              #344          // ext/mods/gameserver/data/xml/PlayerData
  #343 = NameAndType        #123:#345     // getInstance:()Lext/mods/gameserver/data/xml/PlayerData;
  #344 = Utf8               ext/mods/gameserver/data/xml/PlayerData
  #345 = Utf8               ()Lext/mods/gameserver/data/xml/PlayerData;
  #346 = Methodref          #342.#347     // ext/mods/gameserver/data/xml/PlayerData.getClassNameById:(I)Ljava/lang/String;
  #347 = NameAndType        #348:#309     // getClassNameById:(I)Ljava/lang/String;
  #348 = Utf8               getClassNameById
  #349 = String             #350          // oponent
  #350 = Utf8               oponent
  #351 = String             #352          // oponentclass
  #352 = Utf8               oponentclass
  #353 = Methodref          #11.#354      // ext/mods/gameserver/data/manager/HeroManager.calcFightTime:(J)Ljava/lang/String;
  #354 = NameAndType        #355:#356     // calcFightTime:(J)Ljava/lang/String;
  #355 = Utf8               calcFightTime
  #356 = Utf8               (J)Ljava/lang/String;
  #357 = String             #358          // yyyy-MM-dd HH:mm
  #358 = Utf8               yyyy-MM-dd HH:mm
  #359 = String             #360          // result
  #360 = Utf8               result
  #361 = String             #362          // <font color=\"00ff00\">victory</font>
  #362 = Utf8               <font color=\"00ff00\">victory</font>
  #363 = String             #364          // <font color=\"ff0000\">loss</font>
  #364 = Utf8               <font color=\"ff0000\">loss</font>
  #365 = String             #366          // <font color=\"ffff00\">draw</font>
  #366 = Utf8               <font color=\"ffff00\">draw</font>
  #367 = String             #368          // victory
  #368 = Utf8               victory
  #369 = String             #370          // draw
  #370 = Utf8               draw
  #371 = String             #372          // loss
  #372 = Utf8               loss
  #373 = String             #374          // Couldn\'t load hero fights history for: {}.
  #374 = Utf8               Couldn\'t load hero fights history for: {}.
  #375 = String             #376          // Loaded {} fights for: {}.
  #376 = Utf8               Loaded {} fights for: {}.
  #377 = InterfaceMethodref #174.#378     // java/util/Map.isEmpty:()Z
  #378 = NameAndType        #379:#68      // isEmpty:()Z
  #379 = Utf8               isEmpty
  #380 = InterfaceMethodref #174.#381     // java/util/Map.entrySet:()Ljava/util/Set;
  #381 = NameAndType        #382:#383     // entrySet:()Ljava/util/Set;
  #382 = Utf8               entrySet
  #383 = Utf8               ()Ljava/util/Set;
  #384 = InterfaceMethodref #385.#386     // java/util/Set.iterator:()Ljava/util/Iterator;
  #385 = Class              #387          // java/util/Set
  #386 = NameAndType        #388:#389     // iterator:()Ljava/util/Iterator;
  #387 = Utf8               java/util/Set
  #388 = Utf8               iterator
  #389 = Utf8               ()Ljava/util/Iterator;
  #390 = InterfaceMethodref #391.#392     // java/util/Iterator.hasNext:()Z
  #391 = Class              #393          // java/util/Iterator
  #392 = NameAndType        #394:#68      // hasNext:()Z
  #393 = Utf8               java/util/Iterator
  #394 = Utf8               hasNext
  #395 = InterfaceMethodref #391.#396     // java/util/Iterator.next:()Ljava/lang/Object;
  #396 = NameAndType        #67:#397      // next:()Ljava/lang/Object;
  #397 = Utf8               ()Ljava/lang/Object;
  #398 = Class              #399          // java/util/Map$Entry
  #399 = Utf8               java/util/Map$Entry
  #400 = InterfaceMethodref #398.#401     // java/util/Map$Entry.getValue:()Ljava/lang/Object;
  #401 = NameAndType        #402:#397     // getValue:()Ljava/lang/Object;
  #402 = Utf8               getValue
  #403 = Methodref          #77.#404      // ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
  #404 = NameAndType        #405:#76      // getInteger:(Ljava/lang/String;)I
  #405 = Utf8               getInteger
  #406 = InterfaceMethodref #398.#407     // java/util/Map$Entry.getKey:()Ljava/lang/Object;
  #407 = NameAndType        #408:#397     // getKey:()Ljava/lang/Object;
  #408 = Utf8               getKey
  #409 = Methodref          #168.#410     // java/lang/Integer.intValue:()I
  #410 = NameAndType        #411:#138     // intValue:()I
  #411 = Utf8               intValue
  #412 = InterfaceMethodref #174.#413     // java/util/Map.clear:()V
  #413 = NameAndType        #414:#6       // clear:()V
  #414 = Utf8               clear
  #415 = InterfaceMethodref #174.#416     // java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
  #416 = NameAndType        #417:#418     // get:(Ljava/lang/Object;)Ljava/lang/Object;
  #417 = Utf8               get
  #418 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
  #419 = Class              #420          // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
  #420 = Utf8               ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
  #421 = Methodref          #419.#422     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
  #422 = NameAndType        #5:#104       // "<init>":(I)V
  #423 = Methodref          #424.#425     // ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
  #424 = Class              #426          // ext/mods/gameserver/model/actor/Player
  #425 = NameAndType        #427:#428     // getLocale:()Ljava/util/Locale;
  #426 = Utf8               ext/mods/gameserver/model/actor/Player
  #427 = Utf8               getLocale
  #428 = Utf8               ()Ljava/util/Locale;
  #429 = String             #430          // html/olympiad/herodiary.htm
  #430 = Utf8               html/olympiad/herodiary.htm
  #431 = Methodref          #419.#432     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
  #432 = NameAndType        #433:#434     // setFile:(Ljava/util/Locale;Ljava/lang/String;)V
  #433 = Utf8               setFile
  #434 = Utf8               (Ljava/util/Locale;Ljava/lang/String;)V
  #435 = String             #436          // %heroname%
  #436 = Utf8               %heroname%
  #437 = Methodref          #419.#438     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
  #438 = NameAndType        #439:#89      // replace:(Ljava/lang/String;Ljava/lang/String;)V
  #439 = Utf8               replace
  #440 = String             #441          // %message%
  #441 = Utf8               %message%
  #442 = Methodref          #419.#443     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.disableValidation:()V
  #443 = NameAndType        #444:#6       // disableValidation:()V
  #444 = Utf8               disableValidation
  #445 = InterfaceMethodref #292.#378     // java/util/List.isEmpty:()Z
  #446 = Methodref          #25.#447      // java/util/ArrayList."<init>":(Ljava/util/Collection;)V
  #447 = NameAndType        #5:#448       // "<init>":(Ljava/util/Collection;)V
  #448 = Utf8               (Ljava/util/Collection;)V
  #449 = Methodref          #450.#451     // java/util/Collections.reverse:(Ljava/util/List;)V
  #450 = Class              #452          // java/util/Collections
  #451 = NameAndType        #453:#454     // reverse:(Ljava/util/List;)V
  #452 = Utf8               java/util/Collections
  #453 = Utf8               reverse
  #454 = Utf8               (Ljava/util/List;)V
  #455 = Class              #456          // java/lang/StringBuilder
  #456 = Utf8               java/lang/StringBuilder
  #457 = Methodref          #455.#422     // java/lang/StringBuilder."<init>":(I)V
  #458 = InterfaceMethodref #292.#200     // java/util/List.size:()I
  #459 = InterfaceMethodref #292.#460     // java/util/List.get:(I)Ljava/lang/Object;
  #460 = NameAndType        #417:#461     // get:(I)Ljava/lang/Object;
  #461 = Utf8               (I)Ljava/lang/Object;
  #462 = String             #463          // <tr><td>
  #463 = Utf8               <tr><td>
  #464 = String             #465          // <table width=270 bgcolor=\"131210\">
  #465 = Utf8               <table width=270 bgcolor=\"131210\">
  #466 = String             #467          // <table width=270>
  #467 = Utf8               <table width=270>
  #468 = String             #469          // <tr><td width=270><font color=\"LEVEL\">
  #469 = Utf8               <tr><td width=270><font color=\"LEVEL\">
  #470 = Methodref          #77.#83       // ext/mods/commons/data/StatSet.getString:(Ljava/lang/String;)Ljava/lang/String;
  #471 = String             #472          // :xx</font></td></tr><tr><td width=270>
  #472 = Utf8               :xx</font></td></tr><tr><td width=270>
  #473 = String             #474          // </td></tr><tr><td>&nbsp;</td></tr></table></td></tr>
  #474 = Utf8               </td></tr><tr><td>&nbsp;</td></tr></table></td></tr>
  #475 = Methodref          #476.#477     // ext/mods/commons/lang/StringUtil.append:(Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
  #476 = Class              #478          // ext/mods/commons/lang/StringUtil
  #477 = NameAndType        #479:#480     // append:(Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
  #478 = Utf8               ext/mods/commons/lang/StringUtil
  #479 = Utf8               append
  #480 = Utf8               (Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
  #481 = String             #482          // %buttprev%
  #482 = Utf8               %buttprev%
  #483 = InvokeDynamic      #3:#484       // #3:makeConcatWithConstants:(II)Ljava/lang/String;
  #484 = NameAndType        #227:#485     // makeConcatWithConstants:(II)Ljava/lang/String;
  #485 = Utf8               (II)Ljava/lang/String;
  #486 = String             #487          // %buttnext%
  #487 = Utf8               %buttnext%
  #488 = InvokeDynamic      #4:#484       // #4:makeConcatWithConstants:(II)Ljava/lang/String;
  #489 = String             #490          // %list%
  #490 = Utf8               %list%
  #491 = Methodref          #455.#492     // java/lang/StringBuilder.toString:()Ljava/lang/String;
  #492 = NameAndType        #493:#134     // toString:()Ljava/lang/String;
  #493 = Utf8               toString
  #494 = Methodref          #424.#495     // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #495 = NameAndType        #496:#497     // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #496 = Utf8               sendPacket
  #497 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #498 = String             #499          // html/olympiad/herohistory.htm
  #499 = Utf8               html/olympiad/herohistory.htm
  #500 = String             #501          // <table width=270><tr><td width=220><font color=\"LEVEL\">
  #501 = Utf8               <table width=270><tr><td width=220><font color=\"LEVEL\">
  #502 = String             #503          // </font>&nbsp;&nbsp;
  #503 = Utf8               </font>&nbsp;&nbsp;
  #504 = String             #505          // </td><td width=50 align=right>
  #505 = Utf8               </td><td width=50 align=right>
  #506 = String             #507          // <font color=\"FFFF99\">cls</font>
  #507 = Utf8               <font color=\"FFFF99\">cls</font>
  #508 = String             #509          // <font color=\"999999\">non-cls<font>
  #509 = Utf8               <font color=\"999999\">non-cls<font>
  #510 = String             #511          // </td></tr><tr><td width=220>vs
  #511 = Utf8               </td></tr><tr><td width=220>vs
  #512 = String             #513          //  (
  #513 = Utf8                (
  #514 = String             #515          // )</td><td width=50 align=right>(
  #515 = Utf8               )</td><td width=50 align=right>(
  #516 = String             #517          // )</td></tr><tr><td colspan=2>&nbsp;</td></tr></table></td></tr>
  #517 = Utf8               )</td></tr><tr><td colspan=2>&nbsp;</td></tr></table></td></tr>
  #518 = InvokeDynamic      #5:#484       // #5:makeConcatWithConstants:(II)Ljava/lang/String;
  #519 = InvokeDynamic      #6:#484       // #6:makeConcatWithConstants:(II)Ljava/lang/String;
  #520 = String             #521          // %win%
  #521 = Utf8               %win%
  #522 = Methodref          #419.#523     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
  #523 = NameAndType        #439:#94      // replace:(Ljava/lang/String;I)V
  #524 = String             #525          // %draw%
  #525 = Utf8               %draw%
  #526 = String             #527          // %loos%
  #527 = Utf8               %loos%
  #528 = String             #529          // UPDATE heroes SET played = 0
  #529 = Utf8               UPDATE heroes SET played = 0
  #530 = InterfaceMethodref #58.#531      // java/sql/PreparedStatement.execute:()Z
  #531 = NameAndType        #532:#68      // execute:()Z
  #532 = Utf8               execute
  #533 = String             #534          // Couldn\'t reset heroes.
  #534 = Utf8               Couldn\'t reset heroes.
  #535 = InterfaceMethodref #174.#536     // java/util/Map.values:()Ljava/util/Collection;
  #536 = NameAndType        #537:#538     // values:()Ljava/util/Collection;
  #537 = Utf8               values
  #538 = Utf8               ()Ljava/util/Collection;
  #539 = InterfaceMethodref #540.#386     // java/util/Collection.iterator:()Ljava/util/Iterator;
  #540 = Class              #541          // java/util/Collection
  #541 = Utf8               java/util/Collection
  #542 = Methodref          #543.#544     // ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
  #543 = Class              #545          // ext/mods/gameserver/model/World
  #544 = NameAndType        #123:#546     // getInstance:()Lext/mods/gameserver/model/World;
  #545 = Utf8               ext/mods/gameserver/model/World
  #546 = Utf8               ()Lext/mods/gameserver/model/World;
  #547 = Methodref          #543.#548     // ext/mods/gameserver/model/World.getPlayer:(Ljava/lang/String;)Lext/mods/gameserver/model/actor/Player;
  #548 = NameAndType        #549:#550     // getPlayer:(Ljava/lang/String;)Lext/mods/gameserver/model/actor/Player;
  #549 = Utf8               getPlayer
  #550 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/model/actor/Player;
  #551 = Methodref          #424.#552     // ext/mods/gameserver/model/actor/Player.setHero:(Z)V
  #552 = NameAndType        #553:#554     // setHero:(Z)V
  #553 = Utf8               setHero
  #554 = Utf8               (Z)V
  #555 = Methodref          #424.#556     // ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
  #556 = NameAndType        #557:#558     // getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
  #557 = Utf8               getInventory
  #558 = Utf8               ()Lext/mods/gameserver/model/itemcontainer/PcInventory;
  #559 = Methodref          #560.#561     // ext/mods/gameserver/model/itemcontainer/PcInventory.getPaperdollItems:()Ljava/util/List;
  #560 = Class              #562          // ext/mods/gameserver/model/itemcontainer/PcInventory
  #561 = NameAndType        #563:#564     // getPaperdollItems:()Ljava/util/List;
  #562 = Utf8               ext/mods/gameserver/model/itemcontainer/PcInventory
  #563 = Utf8               getPaperdollItems
  #564 = Utf8               ()Ljava/util/List;
  #565 = InterfaceMethodref #292.#386     // java/util/List.iterator:()Ljava/util/Iterator;
  #566 = Class              #567          // ext/mods/gameserver/model/item/instance/ItemInstance
  #567 = Utf8               ext/mods/gameserver/model/item/instance/ItemInstance
  #568 = Methodref          #566.#569     // ext/mods/gameserver/model/item/instance/ItemInstance.isHeroItem:()Z
  #569 = NameAndType        #570:#68      // isHeroItem:()Z
  #570 = Utf8               isHeroItem
  #571 = Methodref          #424.#572     // ext/mods/gameserver/model/actor/Player.useEquippableItem:(Lext/mods/gameserver/model/item/instance/ItemInstance;Z)V
  #572 = NameAndType        #573:#574     // useEquippableItem:(Lext/mods/gameserver/model/item/instance/ItemInstance;Z)V
  #573 = Utf8               useEquippableItem
  #574 = Utf8               (Lext/mods/gameserver/model/item/instance/ItemInstance;Z)V
  #575 = Methodref          #560.#576     // ext/mods/gameserver/model/itemcontainer/PcInventory.getAvailableItems:(ZZZ)[Lext/mods/gameserver/model/item/instance/ItemInstance;
  #576 = NameAndType        #577:#578     // getAvailableItems:(ZZZ)[Lext/mods/gameserver/model/item/instance/ItemInstance;
  #577 = Utf8               getAvailableItems
  #578 = Utf8               (ZZZ)[Lext/mods/gameserver/model/item/instance/ItemInstance;
  #579 = Methodref          #424.#580     // ext/mods/gameserver/model/actor/Player.destroyItem:(Lext/mods/gameserver/model/item/instance/ItemInstance;Z)Z
  #580 = NameAndType        #581:#582     // destroyItem:(Lext/mods/gameserver/model/item/instance/ItemInstance;Z)Z
  #581 = Utf8               destroyItem
  #582 = Utf8               (Lext/mods/gameserver/model/item/instance/ItemInstance;Z)Z
  #583 = Methodref          #424.#584     // ext/mods/gameserver/model/actor/Player.broadcastUserInfo:()V
  #584 = NameAndType        #585:#6       // broadcastUserInfo:()V
  #585 = Utf8               broadcastUserInfo
  #586 = String             #587          // SELECT olympiad_nobles.char_id, characters.char_name FROM olympiad_nobles, characters WHERE characters.obj_Id = olympiad_nobles.char_id AND olympiad_nobles.class_id = ? AND olympiad_nobles.competitions_done >= ? AND olympiad_nobles.competitions_won > 0 ORDER BY olympiad_nobles.olympiad_points DESC, olympiad_nobles.competitions_done DESC, olympiad_nobles.competitions_won DESC
  #587 = Utf8               SELECT olympiad_nobles.char_id, characters.char_name FROM olympiad_nobles, characters WHERE characters.obj_Id = olympiad_nobles.char_id AND olympiad_nobles.class_id = ? AND olympiad_nobles.competitions_done >= ? AND olympiad_nobles.competitions_won > 0 ORDER BY olympiad_nobles.olympiad_points DESC, olympiad_nobles.competitions_done DESC, olympiad_nobles.competitions_won DESC
  #588 = Fieldref           #589.#590     // ext/mods/gameserver/enums/actors/ClassId.VALUES:[Lext/mods/gameserver/enums/actors/ClassId;
  #589 = Class              #591          // ext/mods/gameserver/enums/actors/ClassId
  #590 = NameAndType        #592:#593     // VALUES:[Lext/mods/gameserver/enums/actors/ClassId;
  #591 = Utf8               ext/mods/gameserver/enums/actors/ClassId
  #592 = Utf8               VALUES
  #593 = Utf8               [Lext/mods/gameserver/enums/actors/ClassId;
  #594 = Methodref          #589.#595     // ext/mods/gameserver/enums/actors/ClassId.getLevel:()I
  #595 = NameAndType        #596:#138     // getLevel:()I
  #596 = Utf8               getLevel
  #597 = Methodref          #589.#598     // ext/mods/gameserver/enums/actors/ClassId.getId:()I
  #598 = NameAndType        #599:#138     // getId:()I
  #599 = Utf8               getId
  #600 = Fieldref           #601.#602     // ext/mods/Config.OLY_MIN_MATCHES:I
  #601 = Class              #603          // ext/mods/Config
  #602 = NameAndType        #604:#605     // OLY_MIN_MATCHES:I
  #603 = Utf8               ext/mods/Config
  #604 = Utf8               OLY_MIN_MATCHES
  #605 = Utf8               I
  #606 = String             #607          // Couldn\'t load heroes to be.
  #607 = Utf8               Couldn\'t load heroes to be.
  #608 = String             #609          // DELETE FROM items WHERE item_id IN (6842, 6611, 6612, 6613, 6614, 6615, 6616, 6617, 6618, 6619, 6620, 6621) AND owner_id NOT IN (SELECT obj_Id FROM characters WHERE accesslevel > 0)
  #609 = Utf8               DELETE FROM items WHERE item_id IN (6842, 6611, 6612, 6613, 6614, 6615, 6616, 6617, 6618, 6619, 6620, 6621) AND owner_id NOT IN (SELECT obj_Id FROM characters WHERE accesslevel > 0)
  #610 = String             #611          // Couldn\'t delete hero items.
  #611 = Utf8               Couldn\'t delete hero items.
  #612 = InterfaceMethodref #174.#613     // java/util/Map.putAll:(Ljava/util/Map;)V
  #613 = NameAndType        #614:#615     // putAll:(Ljava/util/Map;)V
  #614 = Utf8               putAll
  #615 = Utf8               (Ljava/util/Map;)V
  #616 = Methodref          #11.#617      // ext/mods/gameserver/data/manager/HeroManager.updateHeroes:()V
  #617 = NameAndType        #618:#6       // updateHeroes:()V
  #618 = Utf8               updateHeroes
  #619 = String             #620          // INSERT INTO heroes (char_id, class_id, count, played, active) VALUES (?,?,?,?,?) ON DUPLICATE KEY UPDATE count=VALUES(count),played=VALUES(played),active=VALUES(active)
  #620 = Utf8               INSERT INTO heroes (char_id, class_id, count, played, active) VALUES (?,?,?,?,?) ON DUPLICATE KEY UPDATE count=VALUES(count),played=VALUES(played),active=VALUES(active)
  #621 = InterfaceMethodref #58.#622      // java/sql/PreparedStatement.addBatch:()V
  #622 = NameAndType        #623:#6       // addBatch:()V
  #623 = Utf8               addBatch
  #624 = InterfaceMethodref #174.#625     // java/util/Map.containsKey:(Ljava/lang/Object;)Z
  #625 = NameAndType        #626:#296     // containsKey:(Ljava/lang/Object;)Z
  #626 = Utf8               containsKey
  #627 = InterfaceMethodref #58.#628      // java/sql/PreparedStatement.executeBatch:()[I
  #628 = NameAndType        #629:#630     // executeBatch:()[I
  #629 = Utf8               executeBatch
  #630 = Utf8               ()[I
  #631 = String             #632          // Couldn\'t update heroes.
  #632 = Utf8               Couldn\'t update heroes.
  #633 = Methodref          #11.#634      // ext/mods/gameserver/data/manager/HeroManager.setDiaryData:(III)V
  #634 = NameAndType        #635:#636     // setDiaryData:(III)V
  #635 = Utf8               setDiaryData
  #636 = Utf8               (III)V
  #637 = InterfaceMethodref #174.#638     // java/util/Map.remove:(Ljava/lang/Object;)Ljava/lang/Object;
  #638 = NameAndType        #639:#418     // remove:(Ljava/lang/Object;)Ljava/lang/Object;
  #639 = Utf8               remove
  #640 = Methodref          #641.#642     // java/lang/System.currentTimeMillis:()J
  #641 = Class              #643          // java/lang/System
  #642 = NameAndType        #644:#320     // currentTimeMillis:()J
  #643 = Utf8               java/lang/System
  #644 = Utf8               currentTimeMillis
  #645 = String             #646          // INSERT INTO heroes_diary (char_id, time, action, param) values(?,?,?,?)
  #646 = Utf8               INSERT INTO heroes_diary (char_id, time, action, param) values(?,?,?,?)
  #647 = String             #648          // Couldn\'t save diary data for {}.
  #648 = Utf8               Couldn\'t save diary data for {}.
  #649 = Methodref          #424.#650     // ext/mods/gameserver/model/actor/Player.getObjectId:()I
  #650 = NameAndType        #651:#138     // getObjectId:()I
  #651 = Utf8               getObjectId
  #652 = String             #653          // UPDATE heroes SET message=? WHERE char_id=?
  #653 = Utf8               UPDATE heroes SET message=? WHERE char_id=?
  #654 = InterfaceMethodref #58.#655      // java/sql/PreparedStatement.setString:(ILjava/lang/String;)V
  #655 = NameAndType        #656:#657     // setString:(ILjava/lang/String;)V
  #656 = Utf8               setString
  #657 = Utf8               (ILjava/lang/String;)V
  #658 = String             #659          // Couldn\'t save hero messages upon shutdown.
  #659 = Utf8               Couldn\'t save hero messages upon shutdown.
  #660 = Class              #661          // ext/mods/gameserver/network/serverpackets/SocialAction
  #661 = Utf8               ext/mods/gameserver/network/serverpackets/SocialAction
  #662 = Methodref          #660.#663     // ext/mods/gameserver/network/serverpackets/SocialAction."<init>":(Lext/mods/gameserver/model/actor/Creature;I)V
  #663 = NameAndType        #5:#664       // "<init>":(Lext/mods/gameserver/model/actor/Creature;I)V
  #664 = Utf8               (Lext/mods/gameserver/model/actor/Creature;I)V
  #665 = Methodref          #424.#666     // ext/mods/gameserver/model/actor/Player.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #666 = NameAndType        #667:#497     // broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #667 = Utf8               broadcastPacket
  #668 = Methodref          #424.#669     // ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
  #669 = NameAndType        #127:#670     // getClan:()Lext/mods/gameserver/model/pledge/Clan;
  #670 = Utf8               ()Lext/mods/gameserver/model/pledge/Clan;
  #671 = Methodref          #130.#595     // ext/mods/gameserver/model/pledge/Clan.getLevel:()I
  #672 = Methodref          #130.#673     // ext/mods/gameserver/model/pledge/Clan.addReputationScore:(I)Z
  #673 = NameAndType        #674:#675     // addReputationScore:(I)Z
  #674 = Utf8               addReputationScore
  #675 = Utf8               (I)Z
  #676 = Class              #677          // ext/mods/gameserver/network/serverpackets/L2GameServerPacket
  #677 = Utf8               ext/mods/gameserver/network/serverpackets/L2GameServerPacket
  #678 = Class              #679          // ext/mods/gameserver/network/serverpackets/PledgeShowInfoUpdate
  #679 = Utf8               ext/mods/gameserver/network/serverpackets/PledgeShowInfoUpdate
  #680 = Methodref          #678.#681     // ext/mods/gameserver/network/serverpackets/PledgeShowInfoUpdate."<init>":(Lext/mods/gameserver/model/pledge/Clan;)V
  #681 = NameAndType        #5:#682       // "<init>":(Lext/mods/gameserver/model/pledge/Clan;)V
  #682 = Utf8               (Lext/mods/gameserver/model/pledge/Clan;)V
  #683 = Fieldref           #684.#685     // ext/mods/gameserver/network/SystemMessageId.CLAN_MEMBER_S1_BECAME_HERO_AND_GAINED_S2_REPUTATION_POINTS:Lext/mods/gameserver/network/SystemMessageId;
  #684 = Class              #686          // ext/mods/gameserver/network/SystemMessageId
  #685 = NameAndType        #687:#688     // CLAN_MEMBER_S1_BECAME_HERO_AND_GAINED_S2_REPUTATION_POINTS:Lext/mods/gameserver/network/SystemMessageId;
  #686 = Utf8               ext/mods/gameserver/network/SystemMessageId
  #687 = Utf8               CLAN_MEMBER_S1_BECAME_HERO_AND_GAINED_S2_REPUTATION_POINTS
  #688 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
  #689 = Methodref          #690.#691     // ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #690 = Class              #692          // ext/mods/gameserver/network/serverpackets/SystemMessage
  #691 = NameAndType        #693:#694     // getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #692 = Utf8               ext/mods/gameserver/network/serverpackets/SystemMessage
  #693 = Utf8               getSystemMessage
  #694 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #695 = Methodref          #690.#696     // ext/mods/gameserver/network/serverpackets/SystemMessage.addString:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #696 = NameAndType        #697:#698     // addString:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #697 = Utf8               addString
  #698 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #699 = Methodref          #690.#700     // ext/mods/gameserver/network/serverpackets/SystemMessage.addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #700 = NameAndType        #701:#702     // addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #701 = Utf8               addNumber
  #702 = Utf8               (I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #703 = Methodref          #130.#704     // ext/mods/gameserver/model/pledge/Clan.broadcastToMembers:([Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #704 = NameAndType        #705:#706     // broadcastToMembers:([Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #705 = Utf8               broadcastToMembers
  #706 = Utf8               ([Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #707 = Methodref          #11.#708      // ext/mods/gameserver/data/manager/HeroManager.setHeroGained:(I)V
  #708 = NameAndType        #709:#104     // setHeroGained:(I)V
  #709 = Utf8               setHeroGained
  #710 = Methodref          #424.#711     // ext/mods/gameserver/model/actor/Player.getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
  #711 = NameAndType        #712:#713     // getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
  #712 = Utf8               getActingPlayer
  #713 = Utf8               ()Lext/mods/gameserver/model/actor/Player;
  #714 = Methodref          #424.#715     // ext/mods/gameserver/model/actor/Player.getClassId:()Lext/mods/gameserver/enums/actors/ClassId;
  #715 = NameAndType        #716:#717     // getClassId:()Lext/mods/gameserver/enums/actors/ClassId;
  #716 = Utf8               getClassId
  #717 = Utf8               ()Lext/mods/gameserver/enums/actors/ClassId;
  #718 = Methodref          #589.#719     // ext/mods/gameserver/enums/actors/ClassId.getParent:()Lext/mods/gameserver/enums/actors/ClassId;
  #719 = NameAndType        #720:#717     // getParent:()Lext/mods/gameserver/enums/actors/ClassId;
  #720 = Utf8               getParent
  #721 = Methodref          #589.#722     // ext/mods/gameserver/enums/actors/ClassId.name:()Ljava/lang/String;
  #722 = NameAndType        #723:#134     // name:()Ljava/lang/String;
  #723 = Utf8               name
  #724 = Methodref          #209.#725     // java/lang/String.toLowerCase:()Ljava/lang/String;
  #725 = NameAndType        #726:#134     // toLowerCase:()Ljava/lang/String;
  #726 = Utf8               toLowerCase
  #727 = Methodref          #209.#728     // java/lang/String.replace:(CC)Ljava/lang/String;
  #728 = NameAndType        #439:#729     // replace:(CC)Ljava/lang/String;
  #729 = Utf8               (CC)Ljava/lang/String;
  #730 = String             #731          //
  #731 = Utf8
  #732 = Methodref          #209.#733     // java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
  #733 = NameAndType        #734:#735     // split:(Ljava/lang/String;)[Ljava/lang/String;
  #734 = Utf8               split
  #735 = Utf8               (Ljava/lang/String;)[Ljava/lang/String;
  #736 = Methodref          #737.#738     // java/util/Arrays.stream:([Ljava/lang/Object;)Ljava/util/stream/Stream;
  #737 = Class              #739          // java/util/Arrays
  #738 = NameAndType        #740:#741     // stream:([Ljava/lang/Object;)Ljava/util/stream/Stream;
  #739 = Utf8               java/util/Arrays
  #740 = Utf8               stream
  #741 = Utf8               ([Ljava/lang/Object;)Ljava/util/stream/Stream;
  #742 = InvokeDynamic      #7:#743       // #7:apply:()Ljava/util/function/Function;
  #743 = NameAndType        #744:#745     // apply:()Ljava/util/function/Function;
  #744 = Utf8               apply
  #745 = Utf8               ()Ljava/util/function/Function;
  #746 = InterfaceMethodref #747.#748     // java/util/stream/Stream.map:(Ljava/util/function/Function;)Ljava/util/stream/Stream;
  #747 = Class              #749          // java/util/stream/Stream
  #748 = NameAndType        #750:#751     // map:(Ljava/util/function/Function;)Ljava/util/stream/Stream;
  #749 = Utf8               java/util/stream/Stream
  #750 = Utf8               map
  #751 = Utf8               (Ljava/util/function/Function;)Ljava/util/stream/Stream;
  #752 = Methodref          #753.#754     // java/util/stream/Collectors.joining:(Ljava/lang/CharSequence;)Ljava/util/stream/Collector;
  #753 = Class              #755          // java/util/stream/Collectors
  #754 = NameAndType        #756:#757     // joining:(Ljava/lang/CharSequence;)Ljava/util/stream/Collector;
  #755 = Utf8               java/util/stream/Collectors
  #756 = Utf8               joining
  #757 = Utf8               (Ljava/lang/CharSequence;)Ljava/util/stream/Collector;
  #758 = InterfaceMethodref #747.#759     // java/util/stream/Stream.collect:(Ljava/util/stream/Collector;)Ljava/lang/Object;
  #759 = NameAndType        #760:#761     // collect:(Ljava/util/stream/Collector;)Ljava/lang/Object;
  #760 = Utf8               collect
  #761 = Utf8               (Ljava/util/stream/Collector;)Ljava/lang/Object;
  #762 = Methodref          #424.#763     // ext/mods/gameserver/model/actor/Player.getMissions:()Lext/mods/gameserver/model/actor/container/player/MissionList;
  #763 = NameAndType        #764:#765     // getMissions:()Lext/mods/gameserver/model/actor/container/player/MissionList;
  #764 = Utf8               getMissions
  #765 = Utf8               ()Lext/mods/gameserver/model/actor/container/player/MissionList;
  #766 = Fieldref           #767.#768     // ext/mods/gameserver/enums/actors/MissionType.HEROIC:Lext/mods/gameserver/enums/actors/MissionType;
  #767 = Class              #769          // ext/mods/gameserver/enums/actors/MissionType
  #768 = NameAndType        #770:#771     // HEROIC:Lext/mods/gameserver/enums/actors/MissionType;
  #769 = Utf8               ext/mods/gameserver/enums/actors/MissionType
  #770 = Utf8               HEROIC
  #771 = Utf8               Lext/mods/gameserver/enums/actors/MissionType;
  #772 = Methodref          #773.#774     // ext/mods/gameserver/model/actor/container/player/MissionList.update:(Lext/mods/gameserver/enums/actors/MissionType;)V
  #773 = Class              #775          // ext/mods/gameserver/model/actor/container/player/MissionList
  #774 = NameAndType        #776:#777     // update:(Lext/mods/gameserver/enums/actors/MissionType;)V
  #775 = Utf8               ext/mods/gameserver/model/actor/container/player/MissionList
  #776 = Utf8               update
  #777 = Utf8               (Lext/mods/gameserver/enums/actors/MissionType;)V
  #778 = Fieldref           #779.#780     // ext/mods/gameserver/data/manager/HeroManager$SingletonHolder.INSTANCE:Lext/mods/gameserver/data/manager/HeroManager;
  #779 = Class              #781          // ext/mods/gameserver/data/manager/HeroManager$SingletonHolder
  #780 = NameAndType        #782:#783     // INSTANCE:Lext/mods/gameserver/data/manager/HeroManager;
  #781 = Utf8               ext/mods/gameserver/data/manager/HeroManager$SingletonHolder
  #782 = Utf8               INSTANCE
  #783 = Utf8               Lext/mods/gameserver/data/manager/HeroManager;
  #784 = Methodref          #209.#785     // java/lang/String.substring:(II)Ljava/lang/String;
  #785 = NameAndType        #786:#485     // substring:(II)Ljava/lang/String;
  #786 = Utf8               substring
  #787 = Methodref          #209.#788     // java/lang/String.toUpperCase:()Ljava/lang/String;
  #788 = NameAndType        #789:#134     // toUpperCase:()Ljava/lang/String;
  #789 = Utf8               toUpperCase
  #790 = Methodref          #209.#791     // java/lang/String.substring:(I)Ljava/lang/String;
  #791 = NameAndType        #786:#309     // substring:(I)Ljava/lang/String;
  #792 = InvokeDynamic      #8:#226       // #8:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #793 = Methodref          #794.#131     // java/lang/Class.getName:()Ljava/lang/String;
  #794 = Class              #795          // java/lang/Class
  #795 = Utf8               java/lang/Class
  #796 = Methodref          #192.#257     // ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
  #797 = Utf8               LOAD_HEROES
  #798 = Utf8               Ljava/lang/String;
  #799 = Utf8               ConstantValue
  #800 = Utf8               LOAD_ALL_HEROES
  #801 = Utf8               SELECT_HEROES_TO_BE
  #802 = Utf8               RESET_PLAYED
  #803 = Utf8               INSERT_HERO
  #804 = Utf8               LOAD_CLAN_DATA
  #805 = Utf8               LOAD_MESSAGE
  #806 = Utf8               LOAD_DIARY
  #807 = Utf8               LOAD_FIGHTS
  #808 = Utf8               UPDATE_DIARY
  #809 = Utf8               UPDATE_MESSAGE
  #810 = Utf8               DELETE_ITEMS
  #811 = Utf8               COUNT
  #812 = Utf8               PLAYED
  #813 = Utf8               CLAN_NAME
  #814 = Utf8               CLAN_CREST
  #815 = Utf8               ALLY_NAME
  #816 = Utf8               ALLY_CREST
  #817 = Utf8               ACTIVE
  #818 = Utf8               ACTION_RAID_KILLED
  #819 = Integer            1
  #820 = Utf8               ACTION_HERO_GAINED
  #821 = Integer            2
  #822 = Utf8               ACTION_CASTLE_TAKEN
  #823 = Integer            3
  #824 = Utf8               Signature
  #825 = Utf8               Ljava/util/Map<Ljava/lang/Integer;Lext/mods/commons/data/StatSet;>;
  #826 = Utf8               Ljava/util/Map<Ljava/lang/Integer;Ljava/util/List<Lext/mods/commons/data/StatSet;>;>;
  #827 = Utf8               Ljava/util/List<Lext/mods/commons/data/StatSet;>;
  #828 = Utf8               Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/String;>;
  #829 = Utf8               Code
  #830 = Utf8               LineNumberTable
  #831 = Utf8               LocalVariableTable
  #832 = Utf8               clan
  #833 = Utf8               Lext/mods/gameserver/model/pledge/Clan;
  #834 = Utf8               clanName
  #835 = Utf8               allyName
  #836 = Utf8               clanCrest
  #837 = Utf8               allyCrest
  #838 = Utf8               clanId
  #839 = Utf8               rs2
  #840 = Utf8               Ljava/sql/ResultSet;
  #841 = Utf8               objectId
  #842 = Utf8               hero
  #843 = Utf8               Lext/mods/commons/data/StatSet;
  #844 = Utf8               rs
  #845 = Utf8               ps
  #846 = Utf8               Ljava/sql/PreparedStatement;
  #847 = Utf8               ps2
  #848 = Utf8               con
  #849 = Utf8               Ljava/sql/Connection;
  #850 = Utf8               e
  #851 = Utf8               Ljava/lang/Exception;
  #852 = Utf8               this
  #853 = Utf8               StackMapTable
  #854 = Utf8               fightTime
  #855 = Utf8               J
  #856 = Utf8               seconds
  #857 = Utf8               minutes
  #858 = Utf8               template
  #859 = Utf8               Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #860 = Utf8               castle
  #861 = Utf8               Lext/mods/gameserver/model/residence/castle/Castle;
  #862 = Utf8               entry
  #863 = Utf8               entries
  #864 = Utf8               fight
  #865 = Utf8               cls
  #866 = Utf8               rset
  #867 = Utf8               charId
  #868 = Utf8               heroCountData
  #869 = Utf8               data
  #870 = Utf8               Ljava/util/Calendar;
  #871 = Utf8               from
  #872 = Utf8               numberOfFights
  #873 = Utf8               victories
  #874 = Utf8               losses
  #875 = Utf8               draws
  #876 = Utf8               getHeroes
  #877 = Utf8               ()Ljava/util/Map;
  #878 = Utf8               ()Ljava/util/Map<Ljava/lang/Integer;Lext/mods/commons/data/StatSet;>;
  #879 = Utf8               getAllHeroes
  #880 = Utf8               getHeroByClass
  #881 = Utf8               (I)I
  #882 = Utf8               Ljava/util/Map$Entry;
  #883 = Utf8               classId
  #884 = Utf8               LocalVariableTypeTable
  #885 = Utf8               Ljava/util/Map$Entry<Ljava/lang/Integer;Lext/mods/commons/data/StatSet;>;
  #886 = Utf8               resetData
  #887 = Utf8               showHeroDiary
  #888 = Utf8               (Lext/mods/gameserver/model/actor/Player;III)V
  #889 = Utf8               diaryEntry
  #890 = Utf8               i
  #891 = Utf8               list
  #892 = Utf8               color
  #893 = Utf8               Z
  #894 = Utf8               counter
  #895 = Utf8               breakAt
  #896 = Utf8               perPage
  #897 = Utf8               sb
  #898 = Utf8               Ljava/lang/StringBuilder;
  #899 = Utf8               player
  #900 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #901 = Utf8               heroclass
  #902 = Utf8               page
  #903 = Utf8               mainList
  #904 = Utf8               html
  #905 = Utf8               Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
  #906 = Class              #907          // "[Ljava/lang/Object;"
  #907 = Utf8               [Ljava/lang/Object;
  #908 = Utf8               showHeroFights
  #909 = Utf8               heroCount
  #910 = Utf8               breakat
  #911 = Utf8               perpage
  #912 = Utf8               win
  #913 = Utf8               computeNewHeroes
  #914 = Utf8               item
  #915 = Utf8               Lext/mods/gameserver/model/item/instance/ItemInstance;
  #916 = Utf8               worldPlayer
  #917 = Utf8               id
  #918 = Utf8               Lext/mods/gameserver/enums/actors/ClassId;
  #919 = Utf8               newHeroes
  #920 = Utf8               heroes
  #921 = Class              #922          // "[Lext/mods/gameserver/model/item/instance/ItemInstance;"
  #922 = Utf8               [Lext/mods/gameserver/model/item/instance/ItemInstance;
  #923 = Class              #593          // "[Lext/mods/gameserver/enums/actors/ClassId;"
  #924 = Utf8               heroId
  #925 = Utf8               heroEntry
  #926 = Utf8               setRBkilled
  #927 = Utf8               npcId
  #928 = Utf8               setCastleTaken
  #929 = Utf8               castleId
  #930 = Utf8               setHeroMessage
  #931 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
  #932 = Utf8               shutdown
  #933 = Utf8               Ljava/util/Map$Entry<Ljava/lang/Integer;Ljava/lang/String;>;
  #934 = Utf8               isActiveHero
  #935 = Utf8               isInactiveHero
  #936 = Utf8               activateHero
  #937 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
  #938 = Utf8               className
  #939 = Utf8               ()Lext/mods/gameserver/data/manager/HeroManager;
  #940 = Utf8               lambda$activateHero$0
  #941 = Utf8               word
  #942 = Utf8               <clinit>
  #943 = Utf8               SourceFile
  #944 = Utf8               HeroManager.java
  #945 = Utf8               NestMembers
  #946 = Utf8               BootstrapMethods
  #947 = String             #948          // \u0001:\u0001
  #948 = Utf8               \u0001:\u0001
  #949 = String             #950          // \u0001 was defeated
  #950 = Utf8               \u0001 was defeated
  #951 = String             #952          // \u0001 Castle was successfuly taken
  #952 = Utf8               \u0001 Castle was successfuly taken
  #953 = String             #954          // <button value=\"Prev\" action=\"bypass _diary?class=\u0001&page=\u0001\" width=60 height=25 back=\"L2UI_ct1.button_df\" fore=\"L2UI_ct1.button_df\">
  #954 = Utf8               <button value=\"Prev\" action=\"bypass _diary?class=\u0001&page=\u0001\" width=60 height=25 back=\"L2UI_ct1.button_df\" fore=\"L2UI_ct1.button_df\">
  #955 = String             #956          // <button value=\"Next\" action=\"bypass _diary?class=\u0001&page=\u0001\" width=60 height=25 back=\"L2UI_ct1.button_df\" fore=\"L2UI_ct1.button_df\">
  #956 = Utf8               <button value=\"Next\" action=\"bypass _diary?class=\u0001&page=\u0001\" width=60 height=25 back=\"L2UI_ct1.button_df\" fore=\"L2UI_ct1.button_df\">
  #957 = String             #958          // <button value=\"Prev\" action=\"bypass _match?class=\u0001&page=\u0001\" width=60 height=25 back=\"L2UI_ct1.button_df\" fore=\"L2UI_ct1.button_df\">
  #958 = Utf8               <button value=\"Prev\" action=\"bypass _match?class=\u0001&page=\u0001\" width=60 height=25 back=\"L2UI_ct1.button_df\" fore=\"L2UI_ct1.button_df\">
  #959 = String             #960          // <button value=\"Next\" action=\"bypass _match?class=\u0001&page=\u0001\" width=60 height=25 back=\"L2UI_ct1.button_df\" fore=\"L2UI_ct1.button_df\">
  #960 = Utf8               <button value=\"Next\" action=\"bypass _match?class=\u0001&page=\u0001\" width=60 height=25 back=\"L2UI_ct1.button_df\" fore=\"L2UI_ct1.button_df\">
  #961 = MethodType         #418          //  (Ljava/lang/Object;)Ljava/lang/Object;
  #962 = MethodHandle       6:#963        // REF_invokeStatic ext/mods/gameserver/data/manager/HeroManager.lambda$activateHero$0:(Ljava/lang/String;)Ljava/lang/String;
  #963 = Methodref          #11.#964      // ext/mods/gameserver/data/manager/HeroManager.lambda$activateHero$0:(Ljava/lang/String;)Ljava/lang/String;
  #964 = NameAndType        #940:#85      // lambda$activateHero$0:(Ljava/lang/String;)Ljava/lang/String;
  #965 = MethodType         #85           //  (Ljava/lang/String;)Ljava/lang/String;
  #966 = String             #967          // \u0001\u0001
  #967 = Utf8               \u0001\u0001
  #968 = MethodHandle       6:#969        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #969 = Methodref          #970.#971     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #970 = Class              #972          // java/lang/invoke/StringConcatFactory
  #971 = NameAndType        #227:#973     // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #972 = Utf8               java/lang/invoke/StringConcatFactory
  #973 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #974 = MethodHandle       6:#975        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #975 = Methodref          #976.#977     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #976 = Class              #978          // java/lang/invoke/LambdaMetafactory
  #977 = NameAndType        #979:#980     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #978 = Utf8               java/lang/invoke/LambdaMetafactory
  #979 = Utf8               metafactory
  #980 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #981 = Utf8               InnerClasses
  #982 = Utf8               Entry
  #983 = Utf8               SingletonHolder
  #984 = Class              #985          // java/lang/invoke/MethodHandles$Lookup
  #985 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #986 = Class              #987          // java/lang/invoke/MethodHandles
  #987 = Utf8               java/lang/invoke/MethodHandles
  #988 = Utf8               Lookup
{
  public static final java.lang.String COUNT;
    descriptor: Ljava/lang/String;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: String count

  public static final java.lang.String PLAYED;
    descriptor: Ljava/lang/String;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: String played

  public static final java.lang.String CLAN_NAME;
    descriptor: Ljava/lang/String;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: String clan_name

  public static final java.lang.String CLAN_CREST;
    descriptor: Ljava/lang/String;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: String clan_crest

  public static final java.lang.String ALLY_NAME;
    descriptor: Ljava/lang/String;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: String ally_name

  public static final java.lang.String ALLY_CREST;
    descriptor: Ljava/lang/String;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: String ally_crest

  public static final java.lang.String ACTIVE;
    descriptor: Ljava/lang/String;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: String active

  public static final int ACTION_RAID_KILLED;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 1

  public static final int ACTION_HERO_GAINED;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 2

  public static final int ACTION_CASTLE_TAKEN;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 3

  protected ext.mods.gameserver.data.manager.HeroManager();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=6, locals=15, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: new           #7                  // class java/util/HashMap
         8: dup
         9: invokespecial #9                  // Method java/util/HashMap."<init>":()V
        12: putfield      #10                 // Field _heroes:Ljava/util/Map;
        15: aload_0
        16: new           #7                  // class java/util/HashMap
        19: dup
        20: invokespecial #9                  // Method java/util/HashMap."<init>":()V
        23: putfield      #16                 // Field _completeHeroes:Ljava/util/Map;
        26: aload_0
        27: new           #7                  // class java/util/HashMap
        30: dup
        31: invokespecial #9                  // Method java/util/HashMap."<init>":()V
        34: putfield      #19                 // Field _heroCounts:Ljava/util/Map;
        37: aload_0
        38: new           #7                  // class java/util/HashMap
        41: dup
        42: invokespecial #9                  // Method java/util/HashMap."<init>":()V
        45: putfield      #22                 // Field _heroFights:Ljava/util/Map;
        48: aload_0
        49: new           #25                 // class java/util/ArrayList
        52: dup
        53: invokespecial #27                 // Method java/util/ArrayList."<init>":()V
        56: putfield      #28                 // Field _fights:Ljava/util/List;
        59: aload_0
        60: new           #7                  // class java/util/HashMap
        63: dup
        64: invokespecial #9                  // Method java/util/HashMap."<init>":()V
        67: putfield      #32                 // Field _heroDiaries:Ljava/util/Map;
        70: aload_0
        71: new           #7                  // class java/util/HashMap
        74: dup
        75: invokespecial #9                  // Method java/util/HashMap."<init>":()V
        78: putfield      #35                 // Field _heroMessages:Ljava/util/Map;
        81: aload_0
        82: new           #25                 // class java/util/ArrayList
        85: dup
        86: invokespecial #27                 // Method java/util/ArrayList."<init>":()V
        89: putfield      #38                 // Field _diary:Ljava/util/List;
        92: invokestatic  #41                 // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
        95: astore_1
        96: aload_1
        97: ldc           #47                 // String SELECT characters.clanid AS clanid, coalesce(clan_data.ally_Id, 0) AS allyId FROM characters LEFT JOIN clan_data ON clan_data.clan_id = characters.clanid WHERE characters.obj_Id = ?
        99: invokeinterface #49,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
       104: astore_2
       105: aload_1
       106: ldc           #55                 // String SELECT heroes.char_id, characters.char_name, heroes.class_id, heroes.count, heroes.played, heroes.active FROM heroes, characters WHERE characters.obj_Id = heroes.char_id AND heroes.played = 1
       108: invokeinterface #49,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
       113: astore_3
       114: aload_3
       115: invokeinterface #57,  1           // InterfaceMethod java/sql/PreparedStatement.executeQuery:()Ljava/sql/ResultSet;
       120: astore        4
       122: aload         4
       124: invokeinterface #63,  1           // InterfaceMethod java/sql/ResultSet.next:()Z
       129: ifeq          472
       132: aload         4
       134: ldc           #71                 // String char_id
       136: invokeinterface #73,  2           // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
       141: istore        5
       143: new           #77                 // class ext/mods/commons/data/StatSet
       146: dup
       147: invokespecial #79                 // Method ext/mods/commons/data/StatSet."<init>":()V
       150: astore        6
       152: aload         6
       154: ldc           #80                 // String char_name
       156: aload         4
       158: ldc           #80                 // String char_name
       160: invokeinterface #82,  2           // InterfaceMethod java/sql/ResultSet.getString:(Ljava/lang/String;)Ljava/lang/String;
       165: invokevirtual #86                 // Method ext/mods/commons/data/StatSet.set:(Ljava/lang/String;Ljava/lang/String;)V
       168: aload         6
       170: ldc           #90                 // String class_id
       172: aload         4
       174: ldc           #90                 // String class_id
       176: invokeinterface #73,  2           // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
       181: invokevirtual #92                 // Method ext/mods/commons/data/StatSet.set:(Ljava/lang/String;I)V
       184: aload         6
       186: ldc           #95                 // String count
       188: aload         4
       190: ldc           #95                 // String count
       192: invokeinterface #73,  2           // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
       197: invokevirtual #92                 // Method ext/mods/commons/data/StatSet.set:(Ljava/lang/String;I)V
       200: aload         6
       202: ldc           #97                 // String played
       204: aload         4
       206: ldc           #97                 // String played
       208: invokeinterface #73,  2           // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
       213: invokevirtual #92                 // Method ext/mods/commons/data/StatSet.set:(Ljava/lang/String;I)V
       216: aload         6
       218: ldc           #99                 // String active
       220: aload         4
       222: ldc           #99                 // String active
       224: invokeinterface #73,  2           // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
       229: invokevirtual #92                 // Method ext/mods/commons/data/StatSet.set:(Ljava/lang/String;I)V
       232: aload_0
       233: iload         5
       235: invokevirtual #101                // Method loadFights:(I)V
       238: aload_0
       239: iload         5
       241: invokevirtual #105                // Method loadDiary:(I)V
       244: aload_0
       245: iload         5
       247: invokevirtual #108                // Method loadMessage:(I)V
       250: aload_2
       251: iconst_1
       252: iload         5
       254: invokeinterface #111,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       259: aload_2
       260: invokeinterface #57,  1           // InterfaceMethod java/sql/PreparedStatement.executeQuery:()Ljava/sql/ResultSet;
       265: astore        7
       267: aload         7
       269: invokeinterface #63,  1           // InterfaceMethod java/sql/ResultSet.next:()Z
       274: ifeq          402
       277: ldc           #115                // String
       279: astore        8
       281: ldc           #115                // String
       283: astore        9
       285: iconst_0
       286: istore        10
       288: iconst_0
       289: istore        11
       291: aload         7
       293: ldc           #117                // String clanid
       295: invokeinterface #73,  2           // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
       300: istore        12
       302: iload         12
       304: ifle          366
       307: invokestatic  #119                // Method ext/mods/gameserver/data/sql/ClanTable.getInstance:()Lext/mods/gameserver/data/sql/ClanTable;
       310: iload         12
       312: invokevirtual #125                // Method ext/mods/gameserver/data/sql/ClanTable.getClan:(I)Lext/mods/gameserver/model/pledge/Clan;
       315: astore        13
       317: aload         13
       319: ifnull        366
       322: aload         13
       324: invokevirtual #129                // Method ext/mods/gameserver/model/pledge/Clan.getName:()Ljava/lang/String;
       327: astore        8
       329: aload         13
       331: invokevirtual #135                // Method ext/mods/gameserver/model/pledge/Clan.getCrestId:()I
       334: istore        10
       336: aload         7
       338: ldc           #139                // String allyId
       340: invokeinterface #73,  2           // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
       345: istore        14
       347: iload         14
       349: ifle          366
       352: aload         13
       354: invokevirtual #141                // Method ext/mods/gameserver/model/pledge/Clan.getAllyName:()Ljava/lang/String;
       357: astore        9
       359: aload         13
       361: invokevirtual #144                // Method ext/mods/gameserver/model/pledge/Clan.getAllyCrestId:()I
       364: istore        11
       366: aload         6
       368: ldc           #147                // String clan_crest
       370: iload         10
       372: invokevirtual #92                 // Method ext/mods/commons/data/StatSet.set:(Ljava/lang/String;I)V
       375: aload         6
       377: ldc           #149                // String clan_name
       379: aload         8
       381: invokevirtual #86                 // Method ext/mods/commons/data/StatSet.set:(Ljava/lang/String;Ljava/lang/String;)V
       384: aload         6
       386: ldc           #151                // String ally_crest
       388: iload         11
       390: invokevirtual #92                 // Method ext/mods/commons/data/StatSet.set:(Ljava/lang/String;I)V
       393: aload         6
       395: ldc           #153                // String ally_name
       397: aload         9
       399: invokevirtual #86                 // Method ext/mods/commons/data/StatSet.set:(Ljava/lang/String;Ljava/lang/String;)V
       402: aload         7
       404: ifnull        446
       407: aload         7
       409: invokeinterface #155,  1          // InterfaceMethod java/sql/ResultSet.close:()V
       414: goto          446
       417: astore        8
       419: aload         7
       421: ifnull        443
       424: aload         7
       426: invokeinterface #155,  1          // InterfaceMethod java/sql/ResultSet.close:()V
       431: goto          443
       434: astore        9
       436: aload         8
       438: aload         9
       440: invokevirtual #160                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       443: aload         8
       445: athrow
       446: aload_2
       447: invokeinterface #164,  1          // InterfaceMethod java/sql/PreparedStatement.clearParameters:()V
       452: aload_0
       453: getfield      #10                 // Field _heroes:Ljava/util/Map;
       456: iload         5
       458: invokestatic  #167                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       461: aload         6
       463: invokeinterface #173,  3          // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
       468: pop
       469: goto          122
       472: aload         4
       474: ifnull        516
       477: aload         4
       479: invokeinterface #155,  1          // InterfaceMethod java/sql/ResultSet.close:()V
       484: goto          516
       487: astore        5
       489: aload         4
       491: ifnull        513
       494: aload         4
       496: invokeinterface #155,  1          // InterfaceMethod java/sql/ResultSet.close:()V
       501: goto          513
       504: astore        6
       506: aload         5
       508: aload         6
       510: invokevirtual #160                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       513: aload         5
       515: athrow
       516: aload_3
       517: ifnull        556
       520: aload_3
       521: invokeinterface #179,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       526: goto          556
       529: astore        4
       531: aload_3
       532: ifnull        553
       535: aload_3
       536: invokeinterface #179,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       541: goto          553
       544: astore        5
       546: aload         4
       548: aload         5
       550: invokevirtual #160                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       553: aload         4
       555: athrow
       556: aload_1
       557: ldc           #180                // String SELECT heroes.char_id, characters.char_name, heroes.class_id, heroes.count, heroes.played, heroes.active FROM heroes, characters WHERE characters.obj_Id = heroes.char_id
       559: invokeinterface #49,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
       564: astore_3
       565: aload_3
       566: invokeinterface #57,  1           // InterfaceMethod java/sql/PreparedStatement.executeQuery:()Ljava/sql/ResultSet;
       571: astore        4
       573: aload         4
       575: invokeinterface #63,  1           // InterfaceMethod java/sql/ResultSet.next:()Z
       580: ifeq          905
       583: aload         4
       585: ldc           #71                 // String char_id
       587: invokeinterface #73,  2           // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
       592: istore        5
       594: new           #77                 // class ext/mods/commons/data/StatSet
       597: dup
       598: invokespecial #79                 // Method ext/mods/commons/data/StatSet."<init>":()V
       601: astore        6
       603: aload         6
       605: ldc           #80                 // String char_name
       607: aload         4
       609: ldc           #80                 // String char_name
       611: invokeinterface #82,  2           // InterfaceMethod java/sql/ResultSet.getString:(Ljava/lang/String;)Ljava/lang/String;
       616: invokevirtual #86                 // Method ext/mods/commons/data/StatSet.set:(Ljava/lang/String;Ljava/lang/String;)V
       619: aload         6
       621: ldc           #90                 // String class_id
       623: aload         4
       625: ldc           #90                 // String class_id
       627: invokeinterface #73,  2           // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
       632: invokevirtual #92                 // Method ext/mods/commons/data/StatSet.set:(Ljava/lang/String;I)V
       635: aload         6
       637: ldc           #95                 // String count
       639: aload         4
       641: ldc           #95                 // String count
       643: invokeinterface #73,  2           // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
       648: invokevirtual #92                 // Method ext/mods/commons/data/StatSet.set:(Ljava/lang/String;I)V
       651: aload         6
       653: ldc           #97                 // String played
       655: aload         4
       657: ldc           #97                 // String played
       659: invokeinterface #73,  2           // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
       664: invokevirtual #92                 // Method ext/mods/commons/data/StatSet.set:(Ljava/lang/String;I)V
       667: aload         6
       669: ldc           #99                 // String active
       671: aload         4
       673: ldc           #99                 // String active
       675: invokeinterface #73,  2           // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
       680: invokevirtual #92                 // Method ext/mods/commons/data/StatSet.set:(Ljava/lang/String;I)V
       683: aload_2
       684: iconst_1
       685: iload         5
       687: invokeinterface #111,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       692: aload_2
       693: invokeinterface #57,  1           // InterfaceMethod java/sql/PreparedStatement.executeQuery:()Ljava/sql/ResultSet;
       698: astore        7
       700: aload         7
       702: invokeinterface #63,  1           // InterfaceMethod java/sql/ResultSet.next:()Z
       707: ifeq          835
       710: ldc           #115                // String
       712: astore        8
       714: ldc           #115                // String
       716: astore        9
       718: iconst_0
       719: istore        10
       721: iconst_0
       722: istore        11
       724: aload         7
       726: ldc           #117                // String clanid
       728: invokeinterface #73,  2           // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
       733: istore        12
       735: iload         12
       737: ifle          799
       740: invokestatic  #119                // Method ext/mods/gameserver/data/sql/ClanTable.getInstance:()Lext/mods/gameserver/data/sql/ClanTable;
       743: iload         12
       745: invokevirtual #125                // Method ext/mods/gameserver/data/sql/ClanTable.getClan:(I)Lext/mods/gameserver/model/pledge/Clan;
       748: astore        13
       750: aload         13
       752: ifnull        799
       755: aload         13
       757: invokevirtual #129                // Method ext/mods/gameserver/model/pledge/Clan.getName:()Ljava/lang/String;
       760: astore        8
       762: aload         13
       764: invokevirtual #135                // Method ext/mods/gameserver/model/pledge/Clan.getCrestId:()I
       767: istore        10
       769: aload         7
       771: ldc           #139                // String allyId
       773: invokeinterface #73,  2           // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
       778: istore        14
       780: iload         14
       782: ifle          799
       785: aload         13
       787: invokevirtual #141                // Method ext/mods/gameserver/model/pledge/Clan.getAllyName:()Ljava/lang/String;
       790: astore        9
       792: aload         13
       794: invokevirtual #144                // Method ext/mods/gameserver/model/pledge/Clan.getAllyCrestId:()I
       797: istore        11
       799: aload         6
       801: ldc           #147                // String clan_crest
       803: iload         10
       805: invokevirtual #92                 // Method ext/mods/commons/data/StatSet.set:(Ljava/lang/String;I)V
       808: aload         6
       810: ldc           #149                // String clan_name
       812: aload         8
       814: invokevirtual #86                 // Method ext/mods/commons/data/StatSet.set:(Ljava/lang/String;Ljava/lang/String;)V
       817: aload         6
       819: ldc           #151                // String ally_crest
       821: iload         11
       823: invokevirtual #92                 // Method ext/mods/commons/data/StatSet.set:(Ljava/lang/String;I)V
       826: aload         6
       828: ldc           #153                // String ally_name
       830: aload         9
       832: invokevirtual #86                 // Method ext/mods/commons/data/StatSet.set:(Ljava/lang/String;Ljava/lang/String;)V
       835: aload         7
       837: ifnull        879
       840: aload         7
       842: invokeinterface #155,  1          // InterfaceMethod java/sql/ResultSet.close:()V
       847: goto          879
       850: astore        8
       852: aload         7
       854: ifnull        876
       857: aload         7
       859: invokeinterface #155,  1          // InterfaceMethod java/sql/ResultSet.close:()V
       864: goto          876
       867: astore        9
       869: aload         8
       871: aload         9
       873: invokevirtual #160                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       876: aload         8
       878: athrow
       879: aload_2
       880: invokeinterface #164,  1          // InterfaceMethod java/sql/PreparedStatement.clearParameters:()V
       885: aload_0
       886: getfield      #16                 // Field _completeHeroes:Ljava/util/Map;
       889: iload         5
       891: invokestatic  #167                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       894: aload         6
       896: invokeinterface #173,  3          // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
       901: pop
       902: goto          573
       905: aload         4
       907: ifnull        949
       910: aload         4
       912: invokeinterface #155,  1          // InterfaceMethod java/sql/ResultSet.close:()V
       917: goto          949
       920: astore        5
       922: aload         4
       924: ifnull        946
       927: aload         4
       929: invokeinterface #155,  1          // InterfaceMethod java/sql/ResultSet.close:()V
       934: goto          946
       937: astore        6
       939: aload         5
       941: aload         6
       943: invokevirtual #160                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       946: aload         5
       948: athrow
       949: aload_3
       950: ifnull        989
       953: aload_3
       954: invokeinterface #179,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       959: goto          989
       962: astore        4
       964: aload_3
       965: ifnull        986
       968: aload_3
       969: invokeinterface #179,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       974: goto          986
       977: astore        5
       979: aload         4
       981: aload         5
       983: invokevirtual #160                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       986: aload         4
       988: athrow
       989: aload_2
       990: ifnull        1026
       993: aload_2
       994: invokeinterface #179,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       999: goto          1026
      1002: astore_3
      1003: aload_2
      1004: ifnull        1024
      1007: aload_2
      1008: invokeinterface #179,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
      1013: goto          1024
      1016: astore        4
      1018: aload_3
      1019: aload         4
      1021: invokevirtual #160                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
      1024: aload_3
      1025: athrow
      1026: aload_1
      1027: ifnull        1061
      1030: aload_1
      1031: invokeinterface #182,  1          // InterfaceMethod java/sql/Connection.close:()V
      1036: goto          1061
      1039: astore_2
      1040: aload_1
      1041: ifnull        1059
      1044: aload_1
      1045: invokeinterface #182,  1          // InterfaceMethod java/sql/Connection.close:()V
      1050: goto          1059
      1053: astore_3
      1054: aload_2
      1055: aload_3
      1056: invokevirtual #160                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
      1059: aload_2
      1060: athrow
      1061: goto          1074
      1064: astore_1
      1065: getstatic     #185                // Field LOGGER:Lext/mods/commons/logging/CLogger;
      1068: ldc           #189                // String Couldn\'t load heroes.
      1070: aload_1
      1071: invokevirtual #191                // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
      1074: getstatic     #185                // Field LOGGER:Lext/mods/commons/logging/CLogger;
      1077: ldc           #197                // String Loaded {} heroes and {} all time heroes.
      1079: iconst_2
      1080: anewarray     #2                  // class java/lang/Object
      1083: dup
      1084: iconst_0
      1085: aload_0
      1086: getfield      #10                 // Field _heroes:Ljava/util/Map;
      1089: invokeinterface #199,  1          // InterfaceMethod java/util/Map.size:()I
      1094: invokestatic  #167                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
      1097: aastore
      1098: dup
      1099: iconst_1
      1100: aload_0
      1101: getfield      #16                 // Field _completeHeroes:Ljava/util/Map;
      1104: invokeinterface #199,  1          // InterfaceMethod java/util/Map.size:()I
      1109: invokestatic  #167                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
      1112: aastore
      1113: invokevirtual #202                // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
      1116: return
      Exception table:
         from    to  target type
           267   402   417   Class java/lang/Throwable
           424   431   434   Class java/lang/Throwable
           122   472   487   Class java/lang/Throwable
           494   501   504   Class java/lang/Throwable
           114   516   529   Class java/lang/Throwable
           535   541   544   Class java/lang/Throwable
           700   835   850   Class java/lang/Throwable
           857   864   867   Class java/lang/Throwable
           573   905   920   Class java/lang/Throwable
           927   934   937   Class java/lang/Throwable
           565   949   962   Class java/lang/Throwable
           968   974   977   Class java/lang/Throwable
           105   989  1002   Class java/lang/Throwable
          1007  1013  1016   Class java/lang/Throwable
            96  1026  1039   Class java/lang/Throwable
          1044  1050  1053   Class java/lang/Throwable
            92  1061  1064   Class java/lang/Exception
      LineNumberTable:
        line 100: 0
        line 88: 4
        line 89: 15
        line 91: 26
        line 92: 37
        line 93: 48
        line 95: 59
        line 96: 70
        line 97: 81
        line 101: 92
        line 102: 96
        line 104: 105
        line 105: 114
        line 107: 122
        line 109: 132
        line 111: 143
        line 112: 152
        line 113: 168
        line 114: 184
        line 115: 200
        line 116: 216
        line 118: 232
        line 119: 238
        line 120: 244
        line 122: 250
        line 124: 259
        line 126: 267
        line 128: 277
        line 129: 281
        line 130: 285
        line 131: 288
        line 133: 291
        line 134: 302
        line 136: 307
        line 137: 317
        line 139: 322
        line 140: 329
        line 142: 336
        line 143: 347
        line 145: 352
        line 146: 359
        line 151: 366
        line 152: 375
        line 153: 384
        line 154: 393
        line 156: 402
        line 124: 417
        line 157: 446
        line 159: 452
        line 160: 469
        line 161: 472
        line 104: 487
        line 161: 516
        line 104: 529
        line 163: 556
        line 164: 565
        line 166: 573
        line 168: 583
        line 170: 594
        line 171: 603
        line 172: 619
        line 173: 635
        line 174: 651
        line 175: 667
        line 177: 683
        line 179: 692
        line 181: 700
        line 183: 710
        line 184: 714
        line 185: 718
        line 186: 721
        line 188: 724
        line 189: 735
        line 191: 740
        line 192: 750
        line 194: 755
        line 195: 762
        line 197: 769
        line 198: 780
        line 200: 785
        line 201: 792
        line 206: 799
        line 207: 808
        line 208: 817
        line 209: 826
        line 211: 835
        line 179: 850
        line 212: 879
        line 214: 885
        line 215: 902
        line 216: 905
        line 163: 920
        line 216: 949
        line 163: 962
        line 217: 989
        line 101: 1002
        line 217: 1026
        line 101: 1039
        line 221: 1061
        line 218: 1064
        line 220: 1065
        line 222: 1074
        line 223: 1116
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          347      19    14 allyId   I
          317      49    13  clan   Lext/mods/gameserver/model/pledge/Clan;
          281     121     8 clanName   Ljava/lang/String;
          285     117     9 allyName   Ljava/lang/String;
          288     114    10 clanCrest   I
          291     111    11 allyCrest   I
          302     100    12 clanId   I
          267     179     7   rs2   Ljava/sql/ResultSet;
          143     326     5 objectId   I
          152     317     6  hero   Lext/mods/commons/data/StatSet;
          122     394     4    rs   Ljava/sql/ResultSet;
          114     442     3    ps   Ljava/sql/PreparedStatement;
          780      19    14 allyId   I
          750      49    13  clan   Lext/mods/gameserver/model/pledge/Clan;
          714     121     8 clanName   Ljava/lang/String;
          718     117     9 allyName   Ljava/lang/String;
          721     114    10 clanCrest   I
          724     111    11 allyCrest   I
          735     100    12 clanId   I
          700     179     7   rs2   Ljava/sql/ResultSet;
          594     308     5 objectId   I
          603     299     6  hero   Lext/mods/commons/data/StatSet;
          573     376     4    rs   Ljava/sql/ResultSet;
          565     424     3    ps   Ljava/sql/PreparedStatement;
          105     921     2   ps2   Ljava/sql/PreparedStatement;
           96     965     1   con   Ljava/sql/Connection;
         1065       9     1     e   Ljava/lang/Exception;
            0    1117     0  this   Lext/mods/gameserver/data/manager/HeroManager;
      StackMapTable: number_of_entries = 42
        frame_type = 255 /* full_frame */
          offset_delta = 122
          locals = [ class ext/mods/gameserver/data/manager/HeroManager, class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/PreparedStatement, class java/sql/ResultSet ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 243
          locals = [ class ext/mods/gameserver/data/manager/HeroManager, class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/PreparedStatement, class java/sql/ResultSet, int, class ext/mods/commons/data/StatSet, class java/sql/ResultSet, class java/lang/String, class java/lang/String, int, int, int ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 35
          locals = [ class ext/mods/gameserver/data/manager/HeroManager, class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/PreparedStatement, class java/sql/ResultSet, int, class ext/mods/commons/data/StatSet, class java/sql/ResultSet ]
          stack = []
        frame_type = 78 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/data/manager/HeroManager, class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/PreparedStatement, class java/sql/ResultSet, int, class ext/mods/commons/data/StatSet, class java/sql/ResultSet, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 249 /* chop */
          offset_delta = 25
        frame_type = 78 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/data/manager/HeroManager, class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/PreparedStatement, class java/sql/ResultSet, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 14
          locals = [ class ext/mods/gameserver/data/manager/HeroManager, class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 253 /* append */
          offset_delta = 16
          locals = [ class java/sql/PreparedStatement, class java/sql/ResultSet ]
        frame_type = 255 /* full_frame */
          offset_delta = 225
          locals = [ class ext/mods/gameserver/data/manager/HeroManager, class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/PreparedStatement, class java/sql/ResultSet, int, class ext/mods/commons/data/StatSet, class java/sql/ResultSet, class java/lang/String, class java/lang/String, int, int, int ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 35
          locals = [ class ext/mods/gameserver/data/manager/HeroManager, class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/PreparedStatement, class java/sql/ResultSet, int, class ext/mods/commons/data/StatSet, class java/sql/ResultSet ]
          stack = []
        frame_type = 78 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/data/manager/HeroManager, class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/PreparedStatement, class java/sql/ResultSet, int, class ext/mods/commons/data/StatSet, class java/sql/ResultSet, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 249 /* chop */
          offset_delta = 25
        frame_type = 78 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/data/manager/HeroManager, class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/PreparedStatement, class java/sql/ResultSet, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 14
          locals = [ class ext/mods/gameserver/data/manager/HeroManager, class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/data/manager/HeroManager, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 7 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/data/manager/HeroManager, class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 5 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 9 /* same */

  public java.util.Map<java.lang.Integer, ext.mods.commons.data.StatSet> getHeroes();
    descriptor: ()Ljava/util/Map;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #10                 // Field _heroes:Ljava/util/Map;
         4: areturn
      LineNumberTable:
        line 431: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/data/manager/HeroManager;
    Signature: #878                         // ()Ljava/util/Map<Ljava/lang/Integer;Lext/mods/commons/data/StatSet;>;

  public java.util.Map<java.lang.Integer, ext.mods.commons.data.StatSet> getAllHeroes();
    descriptor: ()Ljava/util/Map;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #16                 // Field _completeHeroes:Ljava/util/Map;
         4: areturn
      LineNumberTable:
        line 436: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/data/manager/HeroManager;
    Signature: #878                         // ()Ljava/util/Map<Ljava/lang/Integer;Lext/mods/commons/data/StatSet;>;

  public int getHeroByClass(int);
    descriptor: (I)I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=4, args_size=2
         0: aload_0
         1: getfield      #10                 // Field _heroes:Ljava/util/Map;
         4: invokeinterface #377,  1          // InterfaceMethod java/util/Map.isEmpty:()Z
         9: ifeq          14
        12: iconst_0
        13: ireturn
        14: aload_0
        15: getfield      #10                 // Field _heroes:Ljava/util/Map;
        18: invokeinterface #380,  1          // InterfaceMethod java/util/Map.entrySet:()Ljava/util/Set;
        23: invokeinterface #384,  1          // InterfaceMethod java/util/Set.iterator:()Ljava/util/Iterator;
        28: astore_2
        29: aload_2
        30: invokeinterface #390,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        35: ifeq          82
        38: aload_2
        39: invokeinterface #395,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        44: checkcast     #398                // class java/util/Map$Entry
        47: astore_3
        48: aload_3
        49: invokeinterface #400,  1          // InterfaceMethod java/util/Map$Entry.getValue:()Ljava/lang/Object;
        54: checkcast     #77                 // class ext/mods/commons/data/StatSet
        57: ldc           #90                 // String class_id
        59: invokevirtual #403                // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
        62: iload_1
        63: if_icmpne     79
        66: aload_3
        67: invokeinterface #406,  1          // InterfaceMethod java/util/Map$Entry.getKey:()Ljava/lang/Object;
        72: checkcast     #168                // class java/lang/Integer
        75: invokevirtual #409                // Method java/lang/Integer.intValue:()I
        78: ireturn
        79: goto          29
        82: iconst_0
        83: ireturn
      LineNumberTable:
        line 441: 0
        line 442: 12
        line 444: 14
        line 446: 48
        line 447: 66
        line 448: 79
        line 449: 82
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           48      31     3  hero   Ljava/util/Map$Entry;
            0      84     0  this   Lext/mods/gameserver/data/manager/HeroManager;
            0      84     1 classId   I
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
           48      31     3  hero   Ljava/util/Map$Entry<Ljava/lang/Integer;Lext/mods/commons/data/StatSet;>;
      StackMapTable: number_of_entries = 4
        frame_type = 14 /* same */
        frame_type = 252 /* append */
          offset_delta = 14
          locals = [ class java/util/Iterator ]
        frame_type = 49 /* same */
        frame_type = 250 /* chop */
          offset_delta = 2

  public void resetData();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #32                 // Field _heroDiaries:Ljava/util/Map;
         4: invokeinterface #412,  1          // InterfaceMethod java/util/Map.clear:()V
         9: aload_0
        10: getfield      #22                 // Field _heroFights:Ljava/util/Map;
        13: invokeinterface #412,  1          // InterfaceMethod java/util/Map.clear:()V
        18: aload_0
        19: getfield      #19                 // Field _heroCounts:Ljava/util/Map;
        22: invokeinterface #412,  1          // InterfaceMethod java/util/Map.clear:()V
        27: aload_0
        28: getfield      #35                 // Field _heroMessages:Ljava/util/Map;
        31: invokeinterface #412,  1          // InterfaceMethod java/util/Map.clear:()V
        36: return
      LineNumberTable:
        line 454: 0
        line 455: 9
        line 456: 18
        line 457: 27
        line 458: 36
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      37     0  this   Lext/mods/gameserver/data/manager/HeroManager;

  public void showHeroDiary(ext.mods.gameserver.model.actor.Player, int, int, int);
    descriptor: (Lext/mods/gameserver/model/actor/Player;III)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=15, args_size=5
         0: aload_0
         1: getfield      #32                 // Field _heroDiaries:Ljava/util/Map;
         4: iload_3
         5: invokestatic  #167                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
         8: invokeinterface #415,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        13: checkcast     #292                // class java/util/List
        16: astore        5
        18: aload         5
        20: ifnonnull     24
        23: return
        24: new           #419                // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
        27: dup
        28: iconst_0
        29: invokespecial #421                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
        32: astore        6
        34: aload         6
        36: aload_1
        37: invokevirtual #423                // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
        40: ldc_w         #429                // String html/olympiad/herodiary.htm
        43: invokevirtual #431                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
        46: aload         6
        48: ldc_w         #435                // String %heroname%
        51: invokestatic  #301                // Method ext/mods/gameserver/data/sql/PlayerInfoTable.getInstance:()Lext/mods/gameserver/data/sql/PlayerInfoTable;
        54: iload_3
        55: invokevirtual #306                // Method ext/mods/gameserver/data/sql/PlayerInfoTable.getPlayerName:(I)Ljava/lang/String;
        58: invokevirtual #437                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
        61: aload         6
        63: ldc_w         #440                // String %message%
        66: aload_0
        67: getfield      #35                 // Field _heroMessages:Ljava/util/Map;
        70: iload_3
        71: invokestatic  #167                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        74: invokeinterface #415,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        79: checkcast     #209                // class java/lang/String
        82: invokevirtual #437                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
        85: aload         6
        87: invokevirtual #442                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.disableValidation:()V
        90: aload         5
        92: invokeinterface #445,  1          // InterfaceMethod java/util/List.isEmpty:()Z
        97: ifne          381
       100: new           #25                 // class java/util/ArrayList
       103: dup
       104: aload         5
       106: invokespecial #446                // Method java/util/ArrayList."<init>":(Ljava/util/Collection;)V
       109: astore        7
       111: aload         7
       113: invokestatic  #449                // Method java/util/Collections.reverse:(Ljava/util/List;)V
       116: iconst_1
       117: istore        8
       119: iconst_0
       120: istore        9
       122: iconst_0
       123: istore        10
       125: bipush        10
       127: istore        11
       129: new           #455                // class java/lang/StringBuilder
       132: dup
       133: sipush        500
       136: invokespecial #457                // Method java/lang/StringBuilder."<init>":(I)V
       139: astore        12
       141: iload         4
       143: iconst_1
       144: isub
       145: bipush        10
       147: imul
       148: istore        13
       150: iload         13
       152: aload         7
       154: invokeinterface #458,  1          // InterfaceMethod java/util/List.size:()I
       159: if_icmpge     283
       162: iload         13
       164: istore        10
       166: aload         7
       168: iload         13
       170: invokeinterface #459,  2          // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
       175: checkcast     #77                 // class ext/mods/commons/data/StatSet
       178: astore        14
       180: aload         12
       182: bipush        7
       184: anewarray     #2                  // class java/lang/Object
       187: dup
       188: iconst_0
       189: ldc_w         #462                // String <tr><td>
       192: aastore
       193: dup
       194: iconst_1
       195: iload         8
       197: ifeq          206
       200: ldc_w         #464                // String <table width=270 bgcolor=\"131210\">
       203: goto          209
       206: ldc_w         #466                // String <table width=270>
       209: aastore
       210: dup
       211: iconst_2
       212: ldc_w         #468                // String <tr><td width=270><font color=\"LEVEL\">
       215: aastore
       216: dup
       217: iconst_3
       218: aload         14
       220: ldc           #250                // String date
       222: invokevirtual #470                // Method ext/mods/commons/data/StatSet.getString:(Ljava/lang/String;)Ljava/lang/String;
       225: aastore
       226: dup
       227: iconst_4
       228: ldc_w         #471                // String :xx</font></td></tr><tr><td width=270>
       231: aastore
       232: dup
       233: iconst_5
       234: aload         14
       236: ldc           #246                // String action
       238: invokevirtual #470                // Method ext/mods/commons/data/StatSet.getString:(Ljava/lang/String;)Ljava/lang/String;
       241: aastore
       242: dup
       243: bipush        6
       245: ldc_w         #473                // String </td></tr><tr><td>&nbsp;</td></tr></table></td></tr>
       248: aastore
       249: invokestatic  #475                // Method ext/mods/commons/lang/StringUtil.append:(Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
       252: iload         8
       254: ifne          261
       257: iconst_1
       258: goto          262
       261: iconst_0
       262: istore        8
       264: iinc          9, 1
       267: iload         9
       269: bipush        10
       271: if_icmplt     277
       274: goto          283
       277: iinc          13, 1
       280: goto          150
       283: iload         10
       285: aload         7
       287: invokeinterface #458,  1          // InterfaceMethod java/util/List.size:()I
       292: iconst_1
       293: isub
       294: if_icmpge     318
       297: aload         6
       299: ldc_w         #481                // String %buttprev%
       302: iload_2
       303: iload         4
       305: iconst_1
       306: iadd
       307: invokedynamic #483,  0            // InvokeDynamic #3:makeConcatWithConstants:(II)Ljava/lang/String;
       312: invokevirtual #437                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       315: goto          328
       318: aload         6
       320: ldc_w         #481                // String %buttprev%
       323: ldc           #115                // String
       325: invokevirtual #437                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       328: iload         4
       330: iconst_1
       331: if_icmple     355
       334: aload         6
       336: ldc_w         #486                // String %buttnext%
       339: iload_2
       340: iload         4
       342: iconst_1
       343: isub
       344: invokedynamic #488,  0            // InvokeDynamic #4:makeConcatWithConstants:(II)Ljava/lang/String;
       349: invokevirtual #437                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       352: goto          365
       355: aload         6
       357: ldc_w         #486                // String %buttnext%
       360: ldc           #115                // String
       362: invokevirtual #437                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       365: aload         6
       367: ldc_w         #489                // String %list%
       370: aload         12
       372: invokevirtual #491                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
       375: invokevirtual #437                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       378: goto          411
       381: aload         6
       383: ldc_w         #489                // String %list%
       386: ldc           #115                // String
       388: invokevirtual #437                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       391: aload         6
       393: ldc_w         #481                // String %buttprev%
       396: ldc           #115                // String
       398: invokevirtual #437                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       401: aload         6
       403: ldc_w         #486                // String %buttnext%
       406: ldc           #115                // String
       408: invokevirtual #437                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       411: aload_1
       412: aload         6
       414: invokevirtual #494                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       417: return
      LineNumberTable:
        line 462: 0
        line 463: 18
        line 464: 23
        line 466: 24
        line 467: 34
        line 468: 46
        line 469: 61
        line 470: 85
        line 472: 90
        line 474: 100
        line 475: 111
        line 477: 116
        line 478: 119
        line 479: 122
        line 480: 125
        line 482: 129
        line 483: 141
        line 485: 162
        line 486: 166
        line 487: 180
        line 488: 252
        line 490: 264
        line 491: 267
        line 492: 274
        line 483: 277
        line 495: 283
        line 496: 297
        line 498: 318
        line 500: 328
        line 501: 334
        line 503: 355
        line 505: 365
        line 506: 378
        line 509: 381
        line 510: 391
        line 511: 401
        line 513: 411
        line 514: 417
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          180      97    14 diaryEntry   Lext/mods/commons/data/StatSet;
          150     133    13     i   I
          111     267     7  list   Ljava/util/List;
          119     259     8 color   Z
          122     256     9 counter   I
          125     253    10 breakAt   I
          129     249    11 perPage   I
          141     237    12    sb   Ljava/lang/StringBuilder;
            0     418     0  this   Lext/mods/gameserver/data/manager/HeroManager;
            0     418     1 player   Lext/mods/gameserver/model/actor/Player;
            0     418     2 heroclass   I
            0     418     3 objectId   I
            0     418     4  page   I
           18     400     5 mainList   Ljava/util/List;
           34     384     6  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
          111     267     7  list   Ljava/util/List<Lext/mods/commons/data/StatSet;>;
           18     400     5 mainList   Ljava/util/List<Lext/mods/commons/data/StatSet;>;
      StackMapTable: number_of_entries = 14
        frame_type = 252 /* append */
          offset_delta = 24
          locals = [ class java/util/List ]
        frame_type = 255 /* full_frame */
          offset_delta = 125
          locals = [ class ext/mods/gameserver/data/manager/HeroManager, class ext/mods/gameserver/model/actor/Player, int, int, int, class java/util/List, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/util/List, int, int, int, int, class java/lang/StringBuilder, int ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 55
          locals = [ class ext/mods/gameserver/data/manager/HeroManager, class ext/mods/gameserver/model/actor/Player, int, int, int, class java/util/List, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/util/List, int, int, int, int, class java/lang/StringBuilder, int, class ext/mods/commons/data/StatSet ]
          stack = [ class java/lang/StringBuilder, class "[Ljava/lang/Object;", class "[Ljava/lang/Object;", int ]
        frame_type = 255 /* full_frame */
          offset_delta = 2
          locals = [ class ext/mods/gameserver/data/manager/HeroManager, class ext/mods/gameserver/model/actor/Player, int, int, int, class java/util/List, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/util/List, int, int, int, int, class java/lang/StringBuilder, int, class ext/mods/commons/data/StatSet ]
          stack = [ class java/lang/StringBuilder, class "[Ljava/lang/Object;", class "[Ljava/lang/Object;", int, class java/lang/String ]
        frame_type = 51 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 250 /* chop */
          offset_delta = 14
        frame_type = 250 /* chop */
          offset_delta = 5
        frame_type = 34 /* same */
        frame_type = 9 /* same */
        frame_type = 26 /* same */
        frame_type = 9 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 15
          locals = [ class ext/mods/gameserver/data/manager/HeroManager, class ext/mods/gameserver/model/actor/Player, int, int, int, class java/util/List, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage ]
          stack = []
        frame_type = 29 /* same */

  public void showHeroFights(ext.mods.gameserver.model.actor.Player, int, int, int);
    descriptor: (Lext/mods/gameserver/model/actor/Player;III)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=18, args_size=5
         0: aload_0
         1: getfield      #22                 // Field _heroFights:Ljava/util/Map;
         4: iload_3
         5: invokestatic  #167                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
         8: invokeinterface #415,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        13: checkcast     #292                // class java/util/List
        16: astore        5
        18: aload         5
        20: ifnonnull     24
        23: return
        24: iconst_0
        25: istore        6
        27: iconst_0
        28: istore        7
        30: iconst_0
        31: istore        8
        33: new           #419                // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
        36: dup
        37: iconst_0
        38: invokespecial #421                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
        41: astore        9
        43: aload         9
        45: aload_1
        46: invokevirtual #423                // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
        49: ldc_w         #498                // String html/olympiad/herohistory.htm
        52: invokevirtual #431                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
        55: aload         9
        57: ldc_w         #435                // String %heroname%
        60: invokestatic  #301                // Method ext/mods/gameserver/data/sql/PlayerInfoTable.getInstance:()Lext/mods/gameserver/data/sql/PlayerInfoTable;
        63: iload_3
        64: invokevirtual #306                // Method ext/mods/gameserver/data/sql/PlayerInfoTable.getPlayerName:(I)Ljava/lang/String;
        67: invokevirtual #437                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
        70: aload         9
        72: invokevirtual #442                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.disableValidation:()V
        75: aload         5
        77: invokeinterface #445,  1          // InterfaceMethod java/util/List.isEmpty:()Z
        82: ifne          485
        85: aload_0
        86: getfield      #19                 // Field _heroCounts:Ljava/util/Map;
        89: iload_3
        90: invokestatic  #167                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        93: invokeinterface #415,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        98: checkcast     #77                 // class ext/mods/commons/data/StatSet
       101: astore        10
       103: aload         10
       105: ifnull        138
       108: aload         10
       110: ldc_w         #367                // String victory
       113: invokevirtual #403                // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
       116: istore        6
       118: aload         10
       120: ldc_w         #371                // String loss
       123: invokevirtual #403                // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
       126: istore        7
       128: aload         10
       130: ldc_w         #369                // String draw
       133: invokevirtual #403                // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
       136: istore        8
       138: iconst_1
       139: istore        11
       141: iconst_0
       142: istore        12
       144: iconst_0
       145: istore        13
       147: bipush        20
       149: istore        14
       151: new           #455                // class java/lang/StringBuilder
       154: dup
       155: sipush        500
       158: invokespecial #457                // Method java/lang/StringBuilder."<init>":(I)V
       161: astore        15
       163: iload         4
       165: iconst_1
       166: isub
       167: bipush        20
       169: imul
       170: istore        16
       172: iload         16
       174: aload         5
       176: invokeinterface #458,  1          // InterfaceMethod java/util/List.size:()I
       181: if_icmpge     387
       184: iload         16
       186: istore        13
       188: aload         5
       190: iload         16
       192: invokeinterface #459,  2          // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
       197: checkcast     #77                 // class ext/mods/commons/data/StatSet
       200: astore        17
       202: aload         15
       204: bipush        14
       206: anewarray     #2                  // class java/lang/Object
       209: dup
       210: iconst_0
       211: ldc_w         #462                // String <tr><td>
       214: aastore
       215: dup
       216: iconst_1
       217: iload         11
       219: ifeq          228
       222: ldc_w         #464                // String <table width=270 bgcolor=\"131210\">
       225: goto          231
       228: ldc_w         #500                // String <table width=270><tr><td width=220><font color=\"LEVEL\">
       231: aastore
       232: dup
       233: iconst_2
       234: aload         17
       236: ldc_w         #337                // String start
       239: invokevirtual #470                // Method ext/mods/commons/data/StatSet.getString:(Ljava/lang/String;)Ljava/lang/String;
       242: aastore
       243: dup
       244: iconst_3
       245: ldc_w         #502                // String </font>&nbsp;&nbsp;
       248: aastore
       249: dup
       250: iconst_4
       251: aload         17
       253: ldc_w         #359                // String result
       256: invokevirtual #470                // Method ext/mods/commons/data/StatSet.getString:(Ljava/lang/String;)Ljava/lang/String;
       259: aastore
       260: dup
       261: iconst_5
       262: ldc_w         #504                // String </td><td width=50 align=right>
       265: aastore
       266: dup
       267: bipush        6
       269: aload         17
       271: ldc_w         #339                // String classed
       274: invokevirtual #403                // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
       277: ifle          286
       280: ldc_w         #506                // String <font color=\"FFFF99\">cls</font>
       283: goto          289
       286: ldc_w         #508                // String <font color=\"999999\">non-cls<font>
       289: aastore
       290: dup
       291: bipush        7
       293: ldc_w         #510                // String </td></tr><tr><td width=220>vs
       296: aastore
       297: dup
       298: bipush        8
       300: aload         17
       302: ldc_w         #349                // String oponent
       305: invokevirtual #470                // Method ext/mods/commons/data/StatSet.getString:(Ljava/lang/String;)Ljava/lang/String;
       308: aastore
       309: dup
       310: bipush        9
       312: ldc_w         #512                // String  (
       315: aastore
       316: dup
       317: bipush        10
       319: aload         17
       321: ldc_w         #351                // String oponentclass
       324: invokevirtual #470                // Method ext/mods/commons/data/StatSet.getString:(Ljava/lang/String;)Ljava/lang/String;
       327: aastore
       328: dup
       329: bipush        11
       331: ldc_w         #514                // String )</td><td width=50 align=right>(
       334: aastore
       335: dup
       336: bipush        12
       338: aload         17
       340: ldc           #240                // String time
       342: invokevirtual #470                // Method ext/mods/commons/data/StatSet.getString:(Ljava/lang/String;)Ljava/lang/String;
       345: aastore
       346: dup
       347: bipush        13
       349: ldc_w         #516                // String )</td></tr><tr><td colspan=2>&nbsp;</td></tr></table></td></tr>
       352: aastore
       353: invokestatic  #475                // Method ext/mods/commons/lang/StringUtil.append:(Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
       356: iload         11
       358: ifne          365
       361: iconst_1
       362: goto          366
       365: iconst_0
       366: istore        11
       368: iinc          12, 1
       371: iload         12
       373: bipush        20
       375: if_icmplt     381
       378: goto          387
       381: iinc          16, 1
       384: goto          172
       387: iload         13
       389: aload         5
       391: invokeinterface #458,  1          // InterfaceMethod java/util/List.size:()I
       396: iconst_1
       397: isub
       398: if_icmpge     422
       401: aload         9
       403: ldc_w         #481                // String %buttprev%
       406: iload_2
       407: iload         4
       409: iconst_1
       410: iadd
       411: invokedynamic #518,  0            // InvokeDynamic #5:makeConcatWithConstants:(II)Ljava/lang/String;
       416: invokevirtual #437                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       419: goto          432
       422: aload         9
       424: ldc_w         #481                // String %buttprev%
       427: ldc           #115                // String
       429: invokevirtual #437                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       432: iload         4
       434: iconst_1
       435: if_icmple     459
       438: aload         9
       440: ldc_w         #486                // String %buttnext%
       443: iload_2
       444: iload         4
       446: iconst_1
       447: isub
       448: invokedynamic #519,  0            // InvokeDynamic #6:makeConcatWithConstants:(II)Ljava/lang/String;
       453: invokevirtual #437                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       456: goto          469
       459: aload         9
       461: ldc_w         #486                // String %buttnext%
       464: ldc           #115                // String
       466: invokevirtual #437                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       469: aload         9
       471: ldc_w         #489                // String %list%
       474: aload         15
       476: invokevirtual #491                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
       479: invokevirtual #437                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       482: goto          515
       485: aload         9
       487: ldc_w         #489                // String %list%
       490: ldc           #115                // String
       492: invokevirtual #437                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       495: aload         9
       497: ldc_w         #481                // String %buttprev%
       500: ldc           #115                // String
       502: invokevirtual #437                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       505: aload         9
       507: ldc_w         #486                // String %buttnext%
       510: ldc           #115                // String
       512: invokevirtual #437                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       515: aload         9
       517: ldc_w         #520                // String %win%
       520: iload         6
       522: invokevirtual #522                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
       525: aload         9
       527: ldc_w         #524                // String %draw%
       530: iload         8
       532: invokevirtual #522                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
       535: aload         9
       537: ldc_w         #526                // String %loos%
       540: iload         7
       542: invokevirtual #522                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
       545: aload_1
       546: aload         9
       548: invokevirtual #494                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       551: return
      LineNumberTable:
        line 518: 0
        line 519: 18
        line 520: 23
        line 522: 24
        line 523: 27
        line 524: 30
        line 526: 33
        line 527: 43
        line 528: 55
        line 529: 70
        line 531: 75
        line 533: 85
        line 534: 103
        line 536: 108
        line 537: 118
        line 538: 128
        line 541: 138
        line 542: 141
        line 543: 144
        line 544: 147
        line 546: 151
        line 547: 163
        line 549: 184
        line 550: 188
        line 551: 202
        line 552: 356
        line 554: 368
        line 555: 371
        line 556: 378
        line 547: 381
        line 559: 387
        line 560: 401
        line 562: 422
        line 564: 432
        line 565: 438
        line 567: 459
        line 569: 469
        line 570: 482
        line 573: 485
        line 574: 495
        line 575: 505
        line 578: 515
        line 579: 525
        line 580: 535
        line 582: 545
        line 583: 551
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          202     179    17 fight   Lext/mods/commons/data/StatSet;
          172     215    16     i   I
          103     379    10 heroCount   Lext/mods/commons/data/StatSet;
          141     341    11 color   Z
          144     338    12 counter   I
          147     335    13 breakat   I
          151     331    14 perpage   I
          163     319    15    sb   Ljava/lang/StringBuilder;
            0     552     0  this   Lext/mods/gameserver/data/manager/HeroManager;
            0     552     1 player   Lext/mods/gameserver/model/actor/Player;
            0     552     2 heroclass   I
            0     552     3 objectId   I
            0     552     4  page   I
           18     534     5  list   Ljava/util/List;
           27     525     6   win   I
           30     522     7  loss   I
           33     519     8  draw   I
           43     509     9  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
           18     534     5  list   Ljava/util/List<Lext/mods/commons/data/StatSet;>;
      StackMapTable: number_of_entries = 17
        frame_type = 252 /* append */
          offset_delta = 24
          locals = [ class java/util/List ]
        frame_type = 255 /* full_frame */
          offset_delta = 113
          locals = [ class ext/mods/gameserver/data/manager/HeroManager, class ext/mods/gameserver/model/actor/Player, int, int, int, class java/util/List, int, int, int, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class ext/mods/commons/data/StatSet ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 33
          locals = [ class ext/mods/gameserver/data/manager/HeroManager, class ext/mods/gameserver/model/actor/Player, int, int, int, class java/util/List, int, int, int, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class ext/mods/commons/data/StatSet, int, int, int, int, class java/lang/StringBuilder, int ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 55
          locals = [ class ext/mods/gameserver/data/manager/HeroManager, class ext/mods/gameserver/model/actor/Player, int, int, int, class java/util/List, int, int, int, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class ext/mods/commons/data/StatSet, int, int, int, int, class java/lang/StringBuilder, int, class ext/mods/commons/data/StatSet ]
          stack = [ class java/lang/StringBuilder, class "[Ljava/lang/Object;", class "[Ljava/lang/Object;", int ]
        frame_type = 255 /* full_frame */
          offset_delta = 2
          locals = [ class ext/mods/gameserver/data/manager/HeroManager, class ext/mods/gameserver/model/actor/Player, int, int, int, class java/util/List, int, int, int, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class ext/mods/commons/data/StatSet, int, int, int, int, class java/lang/StringBuilder, int, class ext/mods/commons/data/StatSet ]
          stack = [ class java/lang/StringBuilder, class "[Ljava/lang/Object;", class "[Ljava/lang/Object;", int, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 54
          locals = [ class ext/mods/gameserver/data/manager/HeroManager, class ext/mods/gameserver/model/actor/Player, int, int, int, class java/util/List, int, int, int, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class ext/mods/commons/data/StatSet, int, int, int, int, class java/lang/StringBuilder, int, class ext/mods/commons/data/StatSet ]
          stack = [ class java/lang/StringBuilder, class "[Ljava/lang/Object;", class "[Ljava/lang/Object;", int ]
        frame_type = 255 /* full_frame */
          offset_delta = 2
          locals = [ class ext/mods/gameserver/data/manager/HeroManager, class ext/mods/gameserver/model/actor/Player, int, int, int, class java/util/List, int, int, int, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class ext/mods/commons/data/StatSet, int, int, int, int, class java/lang/StringBuilder, int, class ext/mods/commons/data/StatSet ]
          stack = [ class java/lang/StringBuilder, class "[Ljava/lang/Object;", class "[Ljava/lang/Object;", int, class java/lang/String ]
        frame_type = 251 /* same_frame_extended */
          offset_delta = 75
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 250 /* chop */
          offset_delta = 14
        frame_type = 250 /* chop */
          offset_delta = 5
        frame_type = 34 /* same */
        frame_type = 9 /* same */
        frame_type = 26 /* same */
        frame_type = 9 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 15
          locals = [ class ext/mods/gameserver/data/manager/HeroManager, class ext/mods/gameserver/model/actor/Player, int, int, int, class java/util/List, int, int, int, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage ]
          stack = []
        frame_type = 29 /* same */

  public synchronized void computeNewHeroes();
    descriptor: ()V
    flags: (0x0021) ACC_PUBLIC, ACC_SYNCHRONIZED
    Code:
      stack=4, locals=11, args_size=1
         0: invokestatic  #41                 // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
         3: astore_1
         4: aload_1
         5: ldc_w         #528                // String UPDATE heroes SET played = 0
         8: invokeinterface #49,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        13: astore_2
        14: aload_2
        15: invokeinterface #530,  1          // InterfaceMethod java/sql/PreparedStatement.execute:()Z
        20: pop
        21: aload_2
        22: ifnull        58
        25: aload_2
        26: invokeinterface #179,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
        31: goto          58
        34: astore_3
        35: aload_2
        36: ifnull        56
        39: aload_2
        40: invokeinterface #179,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
        45: goto          56
        48: astore        4
        50: aload_3
        51: aload         4
        53: invokevirtual #160                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        56: aload_3
        57: athrow
        58: aload_1
        59: ifnull        93
        62: aload_1
        63: invokeinterface #182,  1          // InterfaceMethod java/sql/Connection.close:()V
        68: goto          93
        71: astore_2
        72: aload_1
        73: ifnull        91
        76: aload_1
        77: invokeinterface #182,  1          // InterfaceMethod java/sql/Connection.close:()V
        82: goto          91
        85: astore_3
        86: aload_2
        87: aload_3
        88: invokevirtual #160                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        91: aload_2
        92: athrow
        93: goto          107
        96: astore_1
        97: getstatic     #185                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       100: ldc_w         #533                // String Couldn\'t reset heroes.
       103: aload_1
       104: invokevirtual #191                // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
       107: aload_0
       108: getfield      #10                 // Field _heroes:Ljava/util/Map;
       111: invokeinterface #535,  1          // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
       116: invokeinterface #539,  1          // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
       121: astore_1
       122: aload_1
       123: invokeinterface #390,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       128: ifeq          286
       131: aload_1
       132: invokeinterface #395,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       137: checkcast     #77                 // class ext/mods/commons/data/StatSet
       140: astore_2
       141: invokestatic  #542                // Method ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
       144: aload_2
       145: ldc           #80                 // String char_name
       147: invokevirtual #470                // Method ext/mods/commons/data/StatSet.getString:(Ljava/lang/String;)Ljava/lang/String;
       150: invokevirtual #547                // Method ext/mods/gameserver/model/World.getPlayer:(Ljava/lang/String;)Lext/mods/gameserver/model/actor/Player;
       153: astore_3
       154: aload_3
       155: ifnonnull     161
       158: goto          122
       161: aload_3
       162: iconst_0
       163: invokevirtual #551                // Method ext/mods/gameserver/model/actor/Player.setHero:(Z)V
       166: aload_3
       167: invokevirtual #555                // Method ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
       170: invokevirtual #559                // Method ext/mods/gameserver/model/itemcontainer/PcInventory.getPaperdollItems:()Ljava/util/List;
       173: invokeinterface #565,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
       178: astore        4
       180: aload         4
       182: invokeinterface #390,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       187: ifeq          220
       190: aload         4
       192: invokeinterface #395,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       197: checkcast     #566                // class ext/mods/gameserver/model/item/instance/ItemInstance
       200: astore        5
       202: aload         5
       204: invokevirtual #568                // Method ext/mods/gameserver/model/item/instance/ItemInstance.isHeroItem:()Z
       207: ifeq          217
       210: aload_3
       211: aload         5
       213: iconst_1
       214: invokevirtual #571                // Method ext/mods/gameserver/model/actor/Player.useEquippableItem:(Lext/mods/gameserver/model/item/instance/ItemInstance;Z)V
       217: goto          180
       220: aload_3
       221: invokevirtual #555                // Method ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
       224: iconst_0
       225: iconst_1
       226: iconst_0
       227: invokevirtual #575                // Method ext/mods/gameserver/model/itemcontainer/PcInventory.getAvailableItems:(ZZZ)[Lext/mods/gameserver/model/item/instance/ItemInstance;
       230: astore        4
       232: aload         4
       234: arraylength
       235: istore        5
       237: iconst_0
       238: istore        6
       240: iload         6
       242: iload         5
       244: if_icmpge     279
       247: aload         4
       249: iload         6
       251: aaload
       252: astore        7
       254: aload         7
       256: invokevirtual #568                // Method ext/mods/gameserver/model/item/instance/ItemInstance.isHeroItem:()Z
       259: ifne          265
       262: goto          273
       265: aload_3
       266: aload         7
       268: iconst_1
       269: invokevirtual #579                // Method ext/mods/gameserver/model/actor/Player.destroyItem:(Lext/mods/gameserver/model/item/instance/ItemInstance;Z)Z
       272: pop
       273: iinc          6, 1
       276: goto          240
       279: aload_3
       280: invokevirtual #583                // Method ext/mods/gameserver/model/actor/Player.broadcastUserInfo:()V
       283: goto          122
       286: new           #25                 // class java/util/ArrayList
       289: dup
       290: invokespecial #27                 // Method java/util/ArrayList."<init>":()V
       293: astore_1
       294: invokestatic  #41                 // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
       297: astore_2
       298: aload_2
       299: ldc_w         #586                // String SELECT olympiad_nobles.char_id, characters.char_name FROM olympiad_nobles, characters WHERE characters.obj_Id = olympiad_nobles.char_id AND olympiad_nobles.class_id = ? AND olympiad_nobles.competitions_done >= ? AND olympiad_nobles.competitions_won > 0 ORDER BY olympiad_nobles.olympiad_points DESC, olympiad_nobles.competitions_done DESC, olympiad_nobles.competitions_won DESC
       302: invokeinterface #49,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
       307: astore_3
       308: getstatic     #588                // Field ext/mods/gameserver/enums/actors/ClassId.VALUES:[Lext/mods/gameserver/enums/actors/ClassId;
       311: astore        4
       313: aload         4
       315: arraylength
       316: istore        5
       318: iconst_0
       319: istore        6
       321: iload         6
       323: iload         5
       325: if_icmpge     505
       328: aload         4
       330: iload         6
       332: aaload
       333: astore        7
       335: aload         7
       337: invokevirtual #594                // Method ext/mods/gameserver/enums/actors/ClassId.getLevel:()I
       340: iconst_3
       341: if_icmpeq     347
       344: goto          499
       347: aload_3
       348: iconst_1
       349: aload         7
       351: invokevirtual #597                // Method ext/mods/gameserver/enums/actors/ClassId.getId:()I
       354: invokeinterface #111,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       359: aload_3
       360: iconst_2
       361: getstatic     #600                // Field ext/mods/Config.OLY_MIN_MATCHES:I
       364: invokeinterface #111,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       369: aload_3
       370: invokeinterface #57,  1           // InterfaceMethod java/sql/PreparedStatement.executeQuery:()Ljava/sql/ResultSet;
       375: astore        8
       377: aload         8
       379: invokeinterface #63,  1           // InterfaceMethod java/sql/ResultSet.next:()Z
       384: ifeq          449
       387: new           #77                 // class ext/mods/commons/data/StatSet
       390: dup
       391: invokespecial #79                 // Method ext/mods/commons/data/StatSet."<init>":()V
       394: astore        9
       396: aload         9
       398: ldc           #90                 // String class_id
       400: aload         7
       402: invokevirtual #597                // Method ext/mods/gameserver/enums/actors/ClassId.getId:()I
       405: invokevirtual #92                 // Method ext/mods/commons/data/StatSet.set:(Ljava/lang/String;I)V
       408: aload         9
       410: ldc           #71                 // String char_id
       412: aload         8
       414: ldc           #71                 // String char_id
       416: invokeinterface #73,  2           // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
       421: invokevirtual #92                 // Method ext/mods/commons/data/StatSet.set:(Ljava/lang/String;I)V
       424: aload         9
       426: ldc           #80                 // String char_name
       428: aload         8
       430: ldc           #80                 // String char_name
       432: invokeinterface #82,  2           // InterfaceMethod java/sql/ResultSet.getString:(Ljava/lang/String;)Ljava/lang/String;
       437: invokevirtual #86                 // Method ext/mods/commons/data/StatSet.set:(Ljava/lang/String;Ljava/lang/String;)V
       440: aload_1
       441: aload         9
       443: invokeinterface #291,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       448: pop
       449: aload_3
       450: invokeinterface #164,  1          // InterfaceMethod java/sql/PreparedStatement.clearParameters:()V
       455: aload         8
       457: ifnull        499
       460: aload         8
       462: invokeinterface #155,  1          // InterfaceMethod java/sql/ResultSet.close:()V
       467: goto          499
       470: astore        9
       472: aload         8
       474: ifnull        496
       477: aload         8
       479: invokeinterface #155,  1          // InterfaceMethod java/sql/ResultSet.close:()V
       484: goto          496
       487: astore        10
       489: aload         9
       491: aload         10
       493: invokevirtual #160                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       496: aload         9
       498: athrow
       499: iinc          6, 1
       502: goto          321
       505: aload_3
       506: ifnull        545
       509: aload_3
       510: invokeinterface #179,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       515: goto          545
       518: astore        4
       520: aload_3
       521: ifnull        542
       524: aload_3
       525: invokeinterface #179,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       530: goto          542
       533: astore        5
       535: aload         4
       537: aload         5
       539: invokevirtual #160                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       542: aload         4
       544: athrow
       545: aload_2
       546: ifnull        582
       549: aload_2
       550: invokeinterface #182,  1          // InterfaceMethod java/sql/Connection.close:()V
       555: goto          582
       558: astore_3
       559: aload_2
       560: ifnull        580
       563: aload_2
       564: invokeinterface #182,  1          // InterfaceMethod java/sql/Connection.close:()V
       569: goto          580
       572: astore        4
       574: aload_3
       575: aload         4
       577: invokevirtual #160                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       580: aload_3
       581: athrow
       582: goto          596
       585: astore_2
       586: getstatic     #185                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       589: ldc_w         #606                // String Couldn\'t load heroes to be.
       592: aload_2
       593: invokevirtual #191                // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
       596: aload_1
       597: invokeinterface #445,  1          // InterfaceMethod java/util/List.isEmpty:()Z
       602: ifeq          615
       605: aload_0
       606: getfield      #10                 // Field _heroes:Ljava/util/Map;
       609: invokeinterface #412,  1          // InterfaceMethod java/util/Map.clear:()V
       614: return
       615: new           #7                  // class java/util/HashMap
       618: dup
       619: invokespecial #9                  // Method java/util/HashMap."<init>":()V
       622: astore_2
       623: aload_1
       624: invokeinterface #565,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
       629: astore_3
       630: aload_3
       631: invokeinterface #390,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       636: ifeq          796
       639: aload_3
       640: invokeinterface #395,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       645: checkcast     #77                 // class ext/mods/commons/data/StatSet
       648: astore        4
       650: aload         4
       652: ldc           #71                 // String char_id
       654: invokevirtual #403                // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
       657: istore        5
       659: aload_0
       660: getfield      #16                 // Field _completeHeroes:Ljava/util/Map;
       663: iload         5
       665: invokestatic  #167                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       668: invokeinterface #415,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
       673: checkcast     #77                 // class ext/mods/commons/data/StatSet
       676: astore        6
       678: aload         6
       680: ifnull        718
       683: aload         6
       685: ldc           #95                 // String count
       687: aload         6
       689: ldc           #95                 // String count
       691: invokevirtual #403                // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
       694: iconst_1
       695: iadd
       696: invokevirtual #92                 // Method ext/mods/commons/data/StatSet.set:(Ljava/lang/String;I)V
       699: aload         6
       701: ldc           #97                 // String played
       703: iconst_1
       704: invokevirtual #92                 // Method ext/mods/commons/data/StatSet.set:(Ljava/lang/String;I)V
       707: aload         6
       709: ldc           #99                 // String active
       711: iconst_0
       712: invokevirtual #92                 // Method ext/mods/commons/data/StatSet.set:(Ljava/lang/String;I)V
       715: goto          779
       718: new           #77                 // class ext/mods/commons/data/StatSet
       721: dup
       722: invokespecial #79                 // Method ext/mods/commons/data/StatSet."<init>":()V
       725: astore        6
       727: aload         6
       729: ldc           #80                 // String char_name
       731: aload         4
       733: ldc           #80                 // String char_name
       735: invokevirtual #470                // Method ext/mods/commons/data/StatSet.getString:(Ljava/lang/String;)Ljava/lang/String;
       738: invokevirtual #86                 // Method ext/mods/commons/data/StatSet.set:(Ljava/lang/String;Ljava/lang/String;)V
       741: aload         6
       743: ldc           #90                 // String class_id
       745: aload         4
       747: ldc           #90                 // String class_id
       749: invokevirtual #403                // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
       752: invokevirtual #92                 // Method ext/mods/commons/data/StatSet.set:(Ljava/lang/String;I)V
       755: aload         6
       757: ldc           #95                 // String count
       759: iconst_1
       760: invokevirtual #92                 // Method ext/mods/commons/data/StatSet.set:(Ljava/lang/String;I)V
       763: aload         6
       765: ldc           #97                 // String played
       767: iconst_1
       768: invokevirtual #92                 // Method ext/mods/commons/data/StatSet.set:(Ljava/lang/String;I)V
       771: aload         6
       773: ldc           #99                 // String active
       775: iconst_0
       776: invokevirtual #92                 // Method ext/mods/commons/data/StatSet.set:(Ljava/lang/String;I)V
       779: aload_2
       780: iload         5
       782: invokestatic  #167                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       785: aload         6
       787: invokeinterface #173,  3          // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
       792: pop
       793: goto          630
       796: invokestatic  #41                 // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
       799: astore_3
       800: aload_3
       801: ldc_w         #608                // String DELETE FROM items WHERE item_id IN (6842, 6611, 6612, 6613, 6614, 6615, 6616, 6617, 6618, 6619, 6620, 6621) AND owner_id NOT IN (SELECT obj_Id FROM characters WHERE accesslevel > 0)
       804: invokeinterface #49,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
       809: astore        4
       811: aload         4
       813: invokeinterface #530,  1          // InterfaceMethod java/sql/PreparedStatement.execute:()Z
       818: pop
       819: aload         4
       821: ifnull        863
       824: aload         4
       826: invokeinterface #179,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       831: goto          863
       834: astore        5
       836: aload         4
       838: ifnull        860
       841: aload         4
       843: invokeinterface #179,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       848: goto          860
       851: astore        6
       853: aload         5
       855: aload         6
       857: invokevirtual #160                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       860: aload         5
       862: athrow
       863: aload_3
       864: ifnull        903
       867: aload_3
       868: invokeinterface #182,  1          // InterfaceMethod java/sql/Connection.close:()V
       873: goto          903
       876: astore        4
       878: aload_3
       879: ifnull        900
       882: aload_3
       883: invokeinterface #182,  1          // InterfaceMethod java/sql/Connection.close:()V
       888: goto          900
       891: astore        5
       893: aload         4
       895: aload         5
       897: invokevirtual #160                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       900: aload         4
       902: athrow
       903: goto          917
       906: astore_3
       907: getstatic     #185                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       910: ldc_w         #610                // String Couldn\'t delete hero items.
       913: aload_3
       914: invokevirtual #191                // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
       917: aload_0
       918: getfield      #10                 // Field _heroes:Ljava/util/Map;
       921: invokeinterface #412,  1          // InterfaceMethod java/util/Map.clear:()V
       926: aload_0
       927: getfield      #10                 // Field _heroes:Ljava/util/Map;
       930: aload_2
       931: invokeinterface #612,  2          // InterfaceMethod java/util/Map.putAll:(Ljava/util/Map;)V
       936: aload_0
       937: invokevirtual #616                // Method updateHeroes:()V
       940: return
      Exception table:
         from    to  target type
            14    21    34   Class java/lang/Throwable
            39    45    48   Class java/lang/Throwable
             4    58    71   Class java/lang/Throwable
            76    82    85   Class java/lang/Throwable
             0    93    96   Class java/lang/Exception
           377   455   470   Class java/lang/Throwable
           477   484   487   Class java/lang/Throwable
           308   505   518   Class java/lang/Throwable
           524   530   533   Class java/lang/Throwable
           298   545   558   Class java/lang/Throwable
           563   569   572   Class java/lang/Throwable
           294   582   585   Class java/lang/Exception
           811   819   834   Class java/lang/Throwable
           841   848   851   Class java/lang/Throwable
           800   863   876   Class java/lang/Throwable
           882   888   891   Class java/lang/Throwable
           796   903   906   Class java/lang/Exception
      LineNumberTable:
        line 587: 0
        line 588: 4
        line 590: 14
        line 591: 21
        line 587: 34
        line 591: 58
        line 587: 71
        line 595: 93
        line 592: 96
        line 594: 97
        line 597: 107
        line 599: 141
        line 600: 154
        line 601: 158
        line 603: 161
        line 605: 166
        line 607: 202
        line 608: 210
        line 609: 217
        line 611: 220
        line 613: 254
        line 614: 262
        line 616: 265
        line 611: 273
        line 619: 279
        line 620: 283
        line 622: 286
        line 624: 294
        line 625: 298
        line 627: 308
        line 629: 335
        line 630: 344
        line 632: 347
        line 633: 359
        line 635: 369
        line 637: 377
        line 639: 387
        line 640: 396
        line 641: 408
        line 642: 424
        line 644: 440
        line 646: 449
        line 647: 455
        line 635: 470
        line 627: 499
        line 649: 505
        line 624: 518
        line 649: 545
        line 624: 558
        line 653: 582
        line 650: 585
        line 652: 586
        line 655: 596
        line 657: 605
        line 658: 614
        line 661: 615
        line 663: 623
        line 665: 650
        line 667: 659
        line 668: 678
        line 670: 683
        line 671: 699
        line 672: 707
        line 676: 718
        line 677: 727
        line 678: 741
        line 679: 755
        line 680: 763
        line 681: 771
        line 683: 779
        line 684: 793
        line 686: 796
        line 687: 800
        line 689: 811
        line 690: 819
        line 686: 834
        line 690: 863
        line 686: 876
        line 694: 903
        line 691: 906
        line 693: 907
        line 696: 917
        line 697: 926
        line 699: 936
        line 700: 940
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           14      44     2    ps   Ljava/sql/PreparedStatement;
            4      89     1   con   Ljava/sql/Connection;
           97      10     1     e   Ljava/lang/Exception;
          202      15     5  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
          254      19     7  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
          154     129     3 worldPlayer   Lext/mods/gameserver/model/actor/Player;
          141     142     2   set   Lext/mods/commons/data/StatSet;
          396      53     9  hero   Lext/mods/commons/data/StatSet;
          377     122     8    rs   Ljava/sql/ResultSet;
          335     164     7    id   Lext/mods/gameserver/enums/actors/ClassId;
          308     237     3    ps   Ljava/sql/PreparedStatement;
          298     284     2   con   Ljava/sql/Connection;
          586      10     2     e   Ljava/lang/Exception;
          659     134     5 objectId   I
          678     115     6   set   Lext/mods/commons/data/StatSet;
          650     143     4  hero   Lext/mods/commons/data/StatSet;
          811      52     4    ps   Ljava/sql/PreparedStatement;
          800     103     3   con   Ljava/sql/Connection;
          907      10     3     e   Ljava/lang/Exception;
            0     941     0  this   Lext/mods/gameserver/data/manager/HeroManager;
          294     647     1 newHeroes   Ljava/util/List;
          623     318     2 heroes   Ljava/util/Map;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
          294     647     1 newHeroes   Ljava/util/List<Lext/mods/commons/data/StatSet;>;
          623     318     2 heroes   Ljava/util/Map<Ljava/lang/Integer;Lext/mods/commons/data/StatSet;>;
      StackMapTable: number_of_entries = 53
        frame_type = 255 /* full_frame */
          offset_delta = 34
          locals = [ class ext/mods/gameserver/data/manager/HeroManager, class java/sql/Connection, class java/sql/PreparedStatement ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/data/manager/HeroManager, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 7 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/data/manager/HeroManager, class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 5 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 10 /* same */
        frame_type = 252 /* append */
          offset_delta = 14
          locals = [ class java/util/Iterator ]
        frame_type = 253 /* append */
          offset_delta = 38
          locals = [ class ext/mods/commons/data/StatSet, class ext/mods/gameserver/model/actor/Player ]
        frame_type = 252 /* append */
          offset_delta = 18
          locals = [ class java/util/Iterator ]
        frame_type = 36 /* same */
        frame_type = 250 /* chop */
          offset_delta = 2
        frame_type = 254 /* append */
          offset_delta = 19
          locals = [ class "[Lext/mods/gameserver/model/item/instance/ItemInstance;", int, int ]
        frame_type = 252 /* append */
          offset_delta = 24
          locals = [ class ext/mods/gameserver/model/item/instance/ItemInstance ]
        frame_type = 250 /* chop */
          offset_delta = 7
        frame_type = 248 /* chop */
          offset_delta = 5
        frame_type = 248 /* chop */
          offset_delta = 6
        frame_type = 255 /* full_frame */
          offset_delta = 34
          locals = [ class ext/mods/gameserver/data/manager/HeroManager, class java/util/List, class java/sql/Connection, class java/sql/PreparedStatement, class "[Lext/mods/gameserver/enums/actors/ClassId;", int, int ]
          stack = []
        frame_type = 252 /* append */
          offset_delta = 25
          locals = [ class ext/mods/gameserver/enums/actors/ClassId ]
        frame_type = 252 /* append */
          offset_delta = 101
          locals = [ class java/sql/ResultSet ]
        frame_type = 84 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/data/manager/HeroManager, class java/util/List, class java/sql/Connection, class java/sql/PreparedStatement, class "[Lext/mods/gameserver/enums/actors/ClassId;", int, int, class ext/mods/gameserver/enums/actors/ClassId, class java/sql/ResultSet, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 248 /* chop */
          offset_delta = 2
        frame_type = 248 /* chop */
          offset_delta = 5
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 14
          locals = [ class ext/mods/gameserver/data/manager/HeroManager, class java/util/List, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/data/manager/HeroManager, class java/util/List, class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 7 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 10 /* same */
        frame_type = 18 /* same */
        frame_type = 253 /* append */
          offset_delta = 14
          locals = [ class java/util/Map, class java/util/Iterator ]
        frame_type = 254 /* append */
          offset_delta = 87
          locals = [ class ext/mods/commons/data/StatSet, int, class ext/mods/commons/data/StatSet ]
        frame_type = 60 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/data/manager/HeroManager, class java/util/List, class java/util/Map ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 37
          locals = [ class ext/mods/gameserver/data/manager/HeroManager, class java/util/List, class java/util/Map, class java/sql/Connection, class java/sql/PreparedStatement ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/data/manager/HeroManager, class java/util/List, class java/util/Map, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 14
          locals = [ class ext/mods/gameserver/data/manager/HeroManager, class java/util/List, class java/util/Map, class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 10 /* same */

  public void setHeroGained(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: iconst_2
         3: iconst_0
         4: invokevirtual #633                // Method setDiaryData:(III)V
         7: return
      LineNumberTable:
        line 774: 0
        line 775: 7
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/data/manager/HeroManager;
            0       8     1 objectId   I

  public void setRBkilled(int, int);
    descriptor: (II)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=6, args_size=3
         0: aload_0
         1: iload_1
         2: iconst_1
         3: iload_2
         4: invokevirtual #633                // Method setDiaryData:(III)V
         7: invokestatic  #262                // Method ext/mods/gameserver/data/xml/NpcData.getInstance:()Lext/mods/gameserver/data/xml/NpcData;
        10: iload_2
        11: invokevirtual #267                // Method ext/mods/gameserver/data/xml/NpcData.getTemplate:(I)Lext/mods/gameserver/model/actor/template/NpcTemplate;
        14: astore_3
        15: aload_3
        16: ifnonnull     20
        19: return
        20: aload_0
        21: getfield      #32                 // Field _heroDiaries:Ljava/util/Map;
        24: iload_1
        25: invokestatic  #167                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        28: invokeinterface #415,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        33: checkcast     #292                // class java/util/List
        36: astore        4
        38: aload         4
        40: ifnonnull     44
        43: return
        44: aload_0
        45: getfield      #32                 // Field _heroDiaries:Ljava/util/Map;
        48: iload_1
        49: invokestatic  #167                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        52: invokeinterface #637,  2          // InterfaceMethod java/util/Map.remove:(Ljava/lang/Object;)Ljava/lang/Object;
        57: pop
        58: new           #77                 // class ext/mods/commons/data/StatSet
        61: dup
        62: invokespecial #79                 // Method ext/mods/commons/data/StatSet."<init>":()V
        65: astore        5
        67: aload         5
        69: ldc           #250                // String date
        71: new           #252                // class java/text/SimpleDateFormat
        74: dup
        75: ldc           #254                // String yyyy-MM-dd HH
        77: invokespecial #256                // Method java/text/SimpleDateFormat."<init>":(Ljava/lang/String;)V
        80: invokestatic  #640                // Method java/lang/System.currentTimeMillis:()J
        83: invokestatic  #218                // Method java/lang/Long.valueOf:(J)Ljava/lang/Long;
        86: invokevirtual #259                // Method java/text/SimpleDateFormat.format:(Ljava/lang/Object;)Ljava/lang/String;
        89: invokevirtual #86                 // Method ext/mods/commons/data/StatSet.set:(Ljava/lang/String;Ljava/lang/String;)V
        92: aload         5
        94: ldc           #246                // String action
        96: aload_3
        97: invokevirtual #271                // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getName:()Ljava/lang/String;
       100: invokedynamic #274,  0            // InvokeDynamic #1:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       105: invokevirtual #86                 // Method ext/mods/commons/data/StatSet.set:(Ljava/lang/String;Ljava/lang/String;)V
       108: aload         4
       110: aload         5
       112: invokeinterface #291,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       117: pop
       118: aload_0
       119: getfield      #32                 // Field _heroDiaries:Ljava/util/Map;
       122: iload_1
       123: invokestatic  #167                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       126: aload         4
       128: invokeinterface #173,  3          // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
       133: pop
       134: return
      LineNumberTable:
        line 779: 0
        line 781: 7
        line 782: 15
        line 783: 19
        line 785: 20
        line 786: 38
        line 787: 43
        line 789: 44
        line 791: 58
        line 792: 67
        line 793: 92
        line 795: 108
        line 797: 118
        line 798: 134
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     135     0  this   Lext/mods/gameserver/data/manager/HeroManager;
            0     135     1 objectId   I
            0     135     2 npcId   I
           15     120     3 template   Lext/mods/gameserver/model/actor/template/NpcTemplate;
           38      97     4  list   Ljava/util/List;
           67      68     5 entry   Lext/mods/commons/data/StatSet;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
           38      97     4  list   Ljava/util/List<Lext/mods/commons/data/StatSet;>;
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 20
          locals = [ class ext/mods/gameserver/model/actor/template/NpcTemplate ]
        frame_type = 252 /* append */
          offset_delta = 23
          locals = [ class java/util/List ]

  public void setCastleTaken(int, int);
    descriptor: (II)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=6, args_size=3
         0: aload_0
         1: iload_1
         2: iconst_3
         3: iload_2
         4: invokevirtual #633                // Method setDiaryData:(III)V
         7: invokestatic  #278                // Method ext/mods/gameserver/data/manager/CastleManager.getInstance:()Lext/mods/gameserver/data/manager/CastleManager;
        10: iload_2
        11: invokevirtual #283                // Method ext/mods/gameserver/data/manager/CastleManager.getCastleById:(I)Lext/mods/gameserver/model/residence/castle/Castle;
        14: astore_3
        15: aload_3
        16: ifnonnull     20
        19: return
        20: aload_0
        21: getfield      #32                 // Field _heroDiaries:Ljava/util/Map;
        24: iload_1
        25: invokestatic  #167                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        28: invokeinterface #415,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        33: checkcast     #292                // class java/util/List
        36: astore        4
        38: aload         4
        40: ifnonnull     44
        43: return
        44: aload_0
        45: getfield      #32                 // Field _heroDiaries:Ljava/util/Map;
        48: iload_1
        49: invokestatic  #167                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        52: invokeinterface #637,  2          // InterfaceMethod java/util/Map.remove:(Ljava/lang/Object;)Ljava/lang/Object;
        57: pop
        58: new           #77                 // class ext/mods/commons/data/StatSet
        61: dup
        62: invokespecial #79                 // Method ext/mods/commons/data/StatSet."<init>":()V
        65: astore        5
        67: aload         5
        69: ldc           #250                // String date
        71: new           #252                // class java/text/SimpleDateFormat
        74: dup
        75: ldc           #254                // String yyyy-MM-dd HH
        77: invokespecial #256                // Method java/text/SimpleDateFormat."<init>":(Ljava/lang/String;)V
        80: invokestatic  #640                // Method java/lang/System.currentTimeMillis:()J
        83: invokestatic  #218                // Method java/lang/Long.valueOf:(J)Ljava/lang/Long;
        86: invokevirtual #259                // Method java/text/SimpleDateFormat.format:(Ljava/lang/Object;)Ljava/lang/String;
        89: invokevirtual #86                 // Method ext/mods/commons/data/StatSet.set:(Ljava/lang/String;Ljava/lang/String;)V
        92: aload         5
        94: ldc           #246                // String action
        96: aload_3
        97: invokevirtual #287                // Method ext/mods/gameserver/model/residence/castle/Castle.getName:()Ljava/lang/String;
       100: invokedynamic #290,  0            // InvokeDynamic #2:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       105: invokevirtual #86                 // Method ext/mods/commons/data/StatSet.set:(Ljava/lang/String;Ljava/lang/String;)V
       108: aload         4
       110: aload         5
       112: invokeinterface #291,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       117: pop
       118: aload_0
       119: getfield      #32                 // Field _heroDiaries:Ljava/util/Map;
       122: iload_1
       123: invokestatic  #167                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       126: aload         4
       128: invokeinterface #173,  3          // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
       133: pop
       134: return
      LineNumberTable:
        line 802: 0
        line 804: 7
        line 805: 15
        line 806: 19
        line 808: 20
        line 809: 38
        line 810: 43
        line 812: 44
        line 814: 58
        line 815: 67
        line 816: 92
        line 818: 108
        line 820: 118
        line 821: 134
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     135     0  this   Lext/mods/gameserver/data/manager/HeroManager;
            0     135     1 objectId   I
            0     135     2 castleId   I
           15     120     3 castle   Lext/mods/gameserver/model/residence/castle/Castle;
           38      97     4  list   Ljava/util/List;
           67      68     5 entry   Lext/mods/commons/data/StatSet;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
           38      97     4  list   Ljava/util/List<Lext/mods/commons/data/StatSet;>;
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 20
          locals = [ class ext/mods/gameserver/model/residence/castle/Castle ]
        frame_type = 252 /* append */
          offset_delta = 23
          locals = [ class java/util/List ]

  public void setDiaryData(int, int, int);
    descriptor: (III)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=7, locals=8, args_size=4
         0: invokestatic  #41                 // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
         3: astore        4
         5: aload         4
         7: ldc_w         #645                // String INSERT INTO heroes_diary (char_id, time, action, param) values(?,?,?,?)
        10: invokeinterface #49,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        15: astore        5
        17: aload         5
        19: iconst_1
        20: iload_1
        21: invokeinterface #111,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        26: aload         5
        28: iconst_2
        29: invokestatic  #640                // Method java/lang/System.currentTimeMillis:()J
        32: invokeinterface #323,  4          // InterfaceMethod java/sql/PreparedStatement.setLong:(IJ)V
        37: aload         5
        39: iconst_3
        40: iload_2
        41: invokeinterface #111,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        46: aload         5
        48: iconst_4
        49: iload_3
        50: invokeinterface #111,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        55: aload         5
        57: invokeinterface #530,  1          // InterfaceMethod java/sql/PreparedStatement.execute:()Z
        62: pop
        63: aload         5
        65: ifnull        107
        68: aload         5
        70: invokeinterface #179,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
        75: goto          107
        78: astore        6
        80: aload         5
        82: ifnull        104
        85: aload         5
        87: invokeinterface #179,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
        92: goto          104
        95: astore        7
        97: aload         6
        99: aload         7
       101: invokevirtual #160                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       104: aload         6
       106: athrow
       107: aload         4
       109: ifnull        151
       112: aload         4
       114: invokeinterface #182,  1          // InterfaceMethod java/sql/Connection.close:()V
       119: goto          151
       122: astore        5
       124: aload         4
       126: ifnull        148
       129: aload         4
       131: invokeinterface #182,  1          // InterfaceMethod java/sql/Connection.close:()V
       136: goto          148
       139: astore        6
       141: aload         5
       143: aload         6
       145: invokevirtual #160                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       148: aload         5
       150: athrow
       151: goto          178
       154: astore        4
       156: getstatic     #185                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       159: ldc_w         #647                // String Couldn\'t save diary data for {}.
       162: aload         4
       164: iconst_1
       165: anewarray     #2                  // class java/lang/Object
       168: dup
       169: iconst_0
       170: iload_1
       171: invokestatic  #167                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       174: aastore
       175: invokevirtual #235                // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
       178: return
      Exception table:
         from    to  target type
            17    63    78   Class java/lang/Throwable
            85    92    95   Class java/lang/Throwable
             5   107   122   Class java/lang/Throwable
           129   136   139   Class java/lang/Throwable
             0   151   154   Class java/lang/Exception
      LineNumberTable:
        line 825: 0
        line 826: 5
        line 828: 17
        line 829: 26
        line 830: 37
        line 831: 46
        line 832: 55
        line 833: 63
        line 825: 78
        line 833: 107
        line 825: 122
        line 837: 151
        line 834: 154
        line 836: 156
        line 838: 178
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           17      90     5    ps   Ljava/sql/PreparedStatement;
            5     146     4   con   Ljava/sql/Connection;
          156      22     4     e   Ljava/lang/Exception;
            0     179     0  this   Lext/mods/gameserver/data/manager/HeroManager;
            0     179     1 objectId   I
            0     179     2 action   I
            0     179     3 param   I
      StackMapTable: number_of_entries = 10
        frame_type = 255 /* full_frame */
          offset_delta = 78
          locals = [ class ext/mods/gameserver/data/manager/HeroManager, int, int, int, class java/sql/Connection, class java/sql/PreparedStatement ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/data/manager/HeroManager, int, int, int, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 78 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/data/manager/HeroManager, int, int, int, class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 23 /* same */

  public void setHeroMessage(ext.mods.gameserver.model.actor.Player, java.lang.String);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: getfield      #35                 // Field _heroMessages:Ljava/util/Map;
         4: aload_1
         5: invokevirtual #649                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
         8: invokestatic  #167                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        11: aload_2
        12: invokeinterface #173,  3          // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        17: pop
        18: return
      LineNumberTable:
        line 847: 0
        line 848: 18
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      19     0  this   Lext/mods/gameserver/data/manager/HeroManager;
            0      19     1 player   Lext/mods/gameserver/model/actor/Player;
            0      19     2 message   Ljava/lang/String;

  public void shutdown();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=5, args_size=1
         0: invokestatic  #41                 // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
         3: astore_1
         4: aload_1
         5: ldc_w         #652                // String UPDATE heroes SET message=? WHERE char_id=?
         8: invokeinterface #49,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        13: astore_2
        14: aload_0
        15: getfield      #35                 // Field _heroMessages:Ljava/util/Map;
        18: invokeinterface #380,  1          // InterfaceMethod java/util/Map.entrySet:()Ljava/util/Set;
        23: invokeinterface #384,  1          // InterfaceMethod java/util/Set.iterator:()Ljava/util/Iterator;
        28: astore_3
        29: aload_3
        30: invokeinterface #390,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        35: ifeq          95
        38: aload_3
        39: invokeinterface #395,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        44: checkcast     #398                // class java/util/Map$Entry
        47: astore        4
        49: aload_2
        50: iconst_1
        51: aload         4
        53: invokeinterface #400,  1          // InterfaceMethod java/util/Map$Entry.getValue:()Ljava/lang/Object;
        58: checkcast     #209                // class java/lang/String
        61: invokeinterface #654,  3          // InterfaceMethod java/sql/PreparedStatement.setString:(ILjava/lang/String;)V
        66: aload_2
        67: iconst_2
        68: aload         4
        70: invokeinterface #406,  1          // InterfaceMethod java/util/Map$Entry.getKey:()Ljava/lang/Object;
        75: checkcast     #168                // class java/lang/Integer
        78: invokevirtual #409                // Method java/lang/Integer.intValue:()I
        81: invokeinterface #111,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        86: aload_2
        87: invokeinterface #621,  1          // InterfaceMethod java/sql/PreparedStatement.addBatch:()V
        92: goto          29
        95: aload_2
        96: invokeinterface #627,  1          // InterfaceMethod java/sql/PreparedStatement.executeBatch:()[I
       101: pop
       102: aload_2
       103: ifnull        139
       106: aload_2
       107: invokeinterface #179,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       112: goto          139
       115: astore_3
       116: aload_2
       117: ifnull        137
       120: aload_2
       121: invokeinterface #179,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       126: goto          137
       129: astore        4
       131: aload_3
       132: aload         4
       134: invokevirtual #160                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       137: aload_3
       138: athrow
       139: aload_1
       140: ifnull        174
       143: aload_1
       144: invokeinterface #182,  1          // InterfaceMethod java/sql/Connection.close:()V
       149: goto          174
       152: astore_2
       153: aload_1
       154: ifnull        172
       157: aload_1
       158: invokeinterface #182,  1          // InterfaceMethod java/sql/Connection.close:()V
       163: goto          172
       166: astore_3
       167: aload_2
       168: aload_3
       169: invokevirtual #160                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       172: aload_2
       173: athrow
       174: goto          188
       177: astore_1
       178: getstatic     #185                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       181: ldc_w         #658                // String Couldn\'t save hero messages upon shutdown.
       184: aload_1
       185: invokevirtual #191                // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
       188: return
      Exception table:
         from    to  target type
            14   102   115   Class java/lang/Throwable
           120   126   129   Class java/lang/Throwable
             4   139   152   Class java/lang/Throwable
           157   163   166   Class java/lang/Throwable
             0   174   177   Class java/lang/Exception
      LineNumberTable:
        line 855: 0
        line 856: 4
        line 858: 14
        line 860: 49
        line 861: 66
        line 862: 86
        line 863: 92
        line 864: 95
        line 865: 102
        line 855: 115
        line 865: 139
        line 855: 152
        line 869: 174
        line 866: 177
        line 868: 178
        line 870: 188
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           49      43     4 entry   Ljava/util/Map$Entry;
           14     125     2    ps   Ljava/sql/PreparedStatement;
            4     170     1   con   Ljava/sql/Connection;
          178      10     1     e   Ljava/lang/Exception;
            0     189     0  this   Lext/mods/gameserver/data/manager/HeroManager;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
           49      43     4 entry   Ljava/util/Map$Entry<Ljava/lang/Integer;Ljava/lang/String;>;
      StackMapTable: number_of_entries = 12
        frame_type = 254 /* append */
          offset_delta = 29
          locals = [ class java/sql/Connection, class java/sql/PreparedStatement, class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 65
        frame_type = 83 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/data/manager/HeroManager, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 7 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/data/manager/HeroManager, class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 5 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 10 /* same */

  public boolean isActiveHero(int);
    descriptor: (I)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=3, args_size=2
         0: aload_0
         1: getfield      #10                 // Field _heroes:Ljava/util/Map;
         4: iload_1
         5: invokestatic  #167                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
         8: invokeinterface #415,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        13: checkcast     #77                 // class ext/mods/commons/data/StatSet
        16: astore_2
        17: aload_2
        18: ifnull        35
        21: aload_2
        22: ldc           #99                 // String active
        24: invokevirtual #403                // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
        27: iconst_1
        28: if_icmpne     35
        31: iconst_1
        32: goto          36
        35: iconst_0
        36: ireturn
      LineNumberTable:
        line 874: 0
        line 876: 17
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      37     0  this   Lext/mods/gameserver/data/manager/HeroManager;
            0      37     1    id   I
           17      20     2 entry   Lext/mods/commons/data/StatSet;
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 35
          locals = [ class ext/mods/commons/data/StatSet ]
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public boolean isInactiveHero(int);
    descriptor: (I)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=3, args_size=2
         0: aload_0
         1: getfield      #10                 // Field _heroes:Ljava/util/Map;
         4: iload_1
         5: invokestatic  #167                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
         8: invokeinterface #415,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        13: checkcast     #77                 // class ext/mods/commons/data/StatSet
        16: astore_2
        17: aload_2
        18: ifnull        34
        21: aload_2
        22: ldc           #99                 // String active
        24: invokevirtual #403                // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
        27: ifne          34
        30: iconst_1
        31: goto          35
        34: iconst_0
        35: ireturn
      LineNumberTable:
        line 881: 0
        line 883: 17
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      36     0  this   Lext/mods/gameserver/data/manager/HeroManager;
            0      36     1    id   I
           17      19     2 entry   Lext/mods/commons/data/StatSet;
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 34
          locals = [ class ext/mods/commons/data/StatSet ]
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public void activateHero(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=7, locals=5, args_size=2
         0: aload_0
         1: getfield      #10                 // Field _heroes:Ljava/util/Map;
         4: aload_1
         5: invokevirtual #649                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
         8: invokestatic  #167                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        11: invokeinterface #415,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        16: checkcast     #77                 // class ext/mods/commons/data/StatSet
        19: astore_2
        20: aload_2
        21: ifnonnull     25
        24: return
        25: aload_2
        26: ldc           #99                 // String active
        28: iconst_1
        29: invokevirtual #92                 // Method ext/mods/commons/data/StatSet.set:(Ljava/lang/String;I)V
        32: aload_1
        33: iconst_1
        34: invokevirtual #551                // Method ext/mods/gameserver/model/actor/Player.setHero:(Z)V
        37: aload_1
        38: new           #660                // class ext/mods/gameserver/network/serverpackets/SocialAction
        41: dup
        42: aload_1
        43: bipush        16
        45: invokespecial #662                // Method ext/mods/gameserver/network/serverpackets/SocialAction."<init>":(Lext/mods/gameserver/model/actor/Creature;I)V
        48: invokevirtual #665                // Method ext/mods/gameserver/model/actor/Player.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        51: aload_1
        52: invokevirtual #583                // Method ext/mods/gameserver/model/actor/Player.broadcastUserInfo:()V
        55: aload_1
        56: invokevirtual #668                // Method ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
        59: astore_3
        60: aload_3
        61: ifnull        123
        64: aload_3
        65: invokevirtual #671                // Method ext/mods/gameserver/model/pledge/Clan.getLevel:()I
        68: iconst_5
        69: if_icmplt     123
        72: aload_3
        73: sipush        1000
        76: invokevirtual #672                // Method ext/mods/gameserver/model/pledge/Clan.addReputationScore:(I)Z
        79: pop
        80: aload_3
        81: iconst_2
        82: anewarray     #676                // class ext/mods/gameserver/network/serverpackets/L2GameServerPacket
        85: dup
        86: iconst_0
        87: new           #678                // class ext/mods/gameserver/network/serverpackets/PledgeShowInfoUpdate
        90: dup
        91: aload_3
        92: invokespecial #680                // Method ext/mods/gameserver/network/serverpackets/PledgeShowInfoUpdate."<init>":(Lext/mods/gameserver/model/pledge/Clan;)V
        95: aastore
        96: dup
        97: iconst_1
        98: getstatic     #683                // Field ext/mods/gameserver/network/SystemMessageId.CLAN_MEMBER_S1_BECAME_HERO_AND_GAINED_S2_REPUTATION_POINTS:Lext/mods/gameserver/network/SystemMessageId;
       101: invokestatic  #689                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       104: aload_2
       105: ldc           #80                 // String char_name
       107: invokevirtual #470                // Method ext/mods/commons/data/StatSet.getString:(Ljava/lang/String;)Ljava/lang/String;
       110: invokevirtual #695                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addString:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       113: sipush        1000
       116: invokevirtual #699                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       119: aastore
       120: invokevirtual #703                // Method ext/mods/gameserver/model/pledge/Clan.broadcastToMembers:([Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       123: aload_0
       124: aload_1
       125: invokevirtual #649                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
       128: invokevirtual #707                // Method setHeroGained:(I)V
       131: aload_0
       132: aload_1
       133: invokevirtual #649                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
       136: invokevirtual #101                // Method loadFights:(I)V
       139: aload_0
       140: aload_1
       141: invokevirtual #649                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
       144: invokevirtual #105                // Method loadDiary:(I)V
       147: aload_1
       148: invokevirtual #710                // Method ext/mods/gameserver/model/actor/Player.getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
       151: invokevirtual #714                // Method ext/mods/gameserver/model/actor/Player.getClassId:()Lext/mods/gameserver/enums/actors/ClassId;
       154: invokevirtual #718                // Method ext/mods/gameserver/enums/actors/ClassId.getParent:()Lext/mods/gameserver/enums/actors/ClassId;
       157: invokevirtual #721                // Method ext/mods/gameserver/enums/actors/ClassId.name:()Ljava/lang/String;
       160: invokevirtual #724                // Method java/lang/String.toLowerCase:()Ljava/lang/String;
       163: bipush        95
       165: bipush        32
       167: invokevirtual #727                // Method java/lang/String.replace:(CC)Ljava/lang/String;
       170: astore        4
       172: aload         4
       174: ldc_w         #730                // String
       177: invokevirtual #732                // Method java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
       180: invokestatic  #736                // Method java/util/Arrays.stream:([Ljava/lang/Object;)Ljava/util/stream/Stream;
       183: invokedynamic #742,  0            // InvokeDynamic #7:apply:()Ljava/util/function/Function;
       188: invokeinterface #746,  2          // InterfaceMethod java/util/stream/Stream.map:(Ljava/util/function/Function;)Ljava/util/stream/Stream;
       193: ldc_w         #730                // String
       196: invokestatic  #752                // Method java/util/stream/Collectors.joining:(Ljava/lang/CharSequence;)Ljava/util/stream/Collector;
       199: invokeinterface #758,  2          // InterfaceMethod java/util/stream/Stream.collect:(Ljava/util/stream/Collector;)Ljava/lang/Object;
       204: checkcast     #209                // class java/lang/String
       207: astore        4
       209: aload_0
       210: getfield      #35                 // Field _heroMessages:Ljava/util/Map;
       213: aload_1
       214: invokevirtual #649                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
       217: invokestatic  #167                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       220: aload         4
       222: invokeinterface #173,  3          // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
       227: pop
       228: aload_1
       229: invokevirtual #762                // Method ext/mods/gameserver/model/actor/Player.getMissions:()Lext/mods/gameserver/model/actor/container/player/MissionList;
       232: getstatic     #766                // Field ext/mods/gameserver/enums/actors/MissionType.HEROIC:Lext/mods/gameserver/enums/actors/MissionType;
       235: invokevirtual #772                // Method ext/mods/gameserver/model/actor/container/player/MissionList.update:(Lext/mods/gameserver/enums/actors/MissionType;)V
       238: aload_0
       239: invokevirtual #616                // Method updateHeroes:()V
       242: return
      LineNumberTable:
        line 888: 0
        line 889: 20
        line 890: 24
        line 892: 25
        line 894: 32
        line 895: 37
        line 896: 51
        line 898: 55
        line 899: 60
        line 901: 72
        line 902: 80
        line 905: 123
        line 906: 131
        line 907: 139
        line 909: 147
        line 911: 172
        line 913: 209
        line 915: 228
        line 916: 238
        line 917: 242
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     243     0  this   Lext/mods/gameserver/data/manager/HeroManager;
            0     243     1 player   Lext/mods/gameserver/model/actor/Player;
           20     223     2  hero   Lext/mods/commons/data/StatSet;
           60     183     3  clan   Lext/mods/gameserver/model/pledge/Clan;
          172      71     4 className   Ljava/lang/String;
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 25
          locals = [ class ext/mods/commons/data/StatSet ]
        frame_type = 252 /* append */
          offset_delta = 97
          locals = [ class ext/mods/gameserver/model/pledge/Clan ]

  public static ext.mods.gameserver.data.manager.HeroManager getInstance();
    descriptor: ()Lext/mods/gameserver/data/manager/HeroManager;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #778                // Field ext/mods/gameserver/data/manager/HeroManager$SingletonHolder.INSTANCE:Lext/mods/gameserver/data/manager/HeroManager;
         3: areturn
      LineNumberTable:
        line 921: 0

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=3, locals=0, args_size=0
         0: new           #192                // class ext/mods/commons/logging/CLogger
         3: dup
         4: ldc           #11                 // class ext/mods/gameserver/data/manager/HeroManager
         6: invokevirtual #793                // Method java/lang/Class.getName:()Ljava/lang/String;
         9: invokespecial #796                // Method ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
        12: putstatic     #185                // Field LOGGER:Lext/mods/commons/logging/CLogger;
        15: return
      LineNumberTable:
        line 59: 0
}
SourceFile: "HeroManager.java"
NestMembers:
  ext/mods/gameserver/data/manager/HeroManager$SingletonHolder
BootstrapMethods:
  0: #968 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #947 \u0001:\u0001
  1: #968 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #949 \u0001 was defeated
  2: #968 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #951 \u0001 Castle was successfuly taken
  3: #968 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #953 <button value=\"Prev\" action=\"bypass _diary?class=\u0001&page=\u0001\" width=60 height=25 back=\"L2UI_ct1.button_df\" fore=\"L2UI_ct1.button_df\">
  4: #968 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #955 <button value=\"Next\" action=\"bypass _diary?class=\u0001&page=\u0001\" width=60 height=25 back=\"L2UI_ct1.button_df\" fore=\"L2UI_ct1.button_df\">
  5: #968 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #957 <button value=\"Prev\" action=\"bypass _match?class=\u0001&page=\u0001\" width=60 height=25 back=\"L2UI_ct1.button_df\" fore=\"L2UI_ct1.button_df\">
  6: #968 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #959 <button value=\"Next\" action=\"bypass _match?class=\u0001&page=\u0001\" width=60 height=25 back=\"L2UI_ct1.button_df\" fore=\"L2UI_ct1.button_df\">
  7: #974 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #961 (Ljava/lang/Object;)Ljava/lang/Object;
      #962 REF_invokeStatic ext/mods/gameserver/data/manager/HeroManager.lambda$activateHero$0:(Ljava/lang/String;)Ljava/lang/String;
      #965 (Ljava/lang/String;)Ljava/lang/String;
  8: #968 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #966 \u0001\u0001
InnerClasses:
  public static #982= #398 of #174;       // Entry=class java/util/Map$Entry of class java/util/Map
  public static final #988= #984 of #986; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
