// Bytecode for: ext.mods.gameserver.model.entity.autofarm.AutoFarmData
// File: ext\mods\gameserver\model\entity\autofarm\AutoFarmData.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/entity/autofarm/AutoFarmData.class
  Last modified 9 de jul de 2026; size 14542 bytes
  MD5 checksum c57591e90abfaee12afe0b888fbce8c5
  Compiled from "AutoFarmData.java"
public class ext.mods.gameserver.model.entity.autofarm.AutoFarmData
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/entity/autofarm/AutoFarmData
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 12, methods: 15, attributes: 4
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Methodref          #8.#9         // ext/mods/gameserver/model/entity/autofarm/AutoFarmData.restoreAreas:(Lext/mods/gameserver/model/actor/Player;)V
    #8 = Class              #10           // ext/mods/gameserver/model/entity/autofarm/AutoFarmData
    #9 = NameAndType        #11:#12       // restoreAreas:(Lext/mods/gameserver/model/actor/Player;)V
   #10 = Utf8               ext/mods/gameserver/model/entity/autofarm/AutoFarmData
   #11 = Utf8               restoreAreas
   #12 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
   #13 = Methodref          #8.#14        // ext/mods/gameserver/model/entity/autofarm/AutoFarmData.restoreSkills:(Lext/mods/gameserver/model/actor/Player;)V
   #14 = NameAndType        #15:#12       // restoreSkills:(Lext/mods/gameserver/model/actor/Player;)V
   #15 = Utf8               restoreSkills
   #16 = Methodref          #17.#18       // ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
   #17 = Class              #19           // ext/mods/commons/pool/ConnectionPool
   #18 = NameAndType        #20:#21       // getConnection:()Ljava/sql/Connection;
   #19 = Utf8               ext/mods/commons/pool/ConnectionPool
   #20 = Utf8               getConnection
   #21 = Utf8               ()Ljava/sql/Connection;
   #22 = String             #23           // SELECT * FROM autofarm_skills WHERE player_id = ?
   #23 = Utf8               SELECT * FROM autofarm_skills WHERE player_id = ?
   #24 = InterfaceMethodref #25.#26       // java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
   #25 = Class              #27           // java/sql/Connection
   #26 = NameAndType        #28:#29       // prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
   #27 = Utf8               java/sql/Connection
   #28 = Utf8               prepareStatement
   #29 = Utf8               (Ljava/lang/String;)Ljava/sql/PreparedStatement;
   #30 = Methodref          #31.#32       // ext/mods/gameserver/model/actor/Player.getObjectId:()I
   #31 = Class              #33           // ext/mods/gameserver/model/actor/Player
   #32 = NameAndType        #34:#35       // getObjectId:()I
   #33 = Utf8               ext/mods/gameserver/model/actor/Player
   #34 = Utf8               getObjectId
   #35 = Utf8               ()I
   #36 = InterfaceMethodref #37.#38       // java/sql/PreparedStatement.setInt:(II)V
   #37 = Class              #39           // java/sql/PreparedStatement
   #38 = NameAndType        #40:#41       // setInt:(II)V
   #39 = Utf8               java/sql/PreparedStatement
   #40 = Utf8               setInt
   #41 = Utf8               (II)V
   #42 = InterfaceMethodref #37.#43       // java/sql/PreparedStatement.executeQuery:()Ljava/sql/ResultSet;
   #43 = NameAndType        #44:#45       // executeQuery:()Ljava/sql/ResultSet;
   #44 = Utf8               executeQuery
   #45 = Utf8               ()Ljava/sql/ResultSet;
   #46 = Methodref          #47.#48       // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager.getInstance:()Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager;
   #47 = Class              #49           // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager
   #48 = NameAndType        #50:#51       // getInstance:()Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager;
   #49 = Utf8               ext/mods/gameserver/model/entity/autofarm/AutoFarmManager
   #50 = Utf8               getInstance
   #51 = Utf8               ()Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager;
   #52 = Methodref          #47.#53       // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager.getProfile:(Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
   #53 = NameAndType        #54:#55       // getProfile:(Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
   #54 = Utf8               getProfile
   #55 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
   #56 = Methodref          #57.#58       // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getSkills:()Ljava/util/Map;
   #57 = Class              #59           // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile
   #58 = NameAndType        #60:#61       // getSkills:()Ljava/util/Map;
   #59 = Utf8               ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile
   #60 = Utf8               getSkills
   #61 = Utf8               ()Ljava/util/Map;
   #62 = InterfaceMethodref #63.#64       // java/util/Map.clear:()V
   #63 = Class              #65           // java/util/Map
   #64 = NameAndType        #66:#6        // clear:()V
   #65 = Utf8               java/util/Map
   #66 = Utf8               clear
   #67 = InterfaceMethodref #68.#69       // java/sql/ResultSet.next:()Z
   #68 = Class              #70           // java/sql/ResultSet
   #69 = NameAndType        #71:#72       // next:()Z
   #70 = Utf8               java/sql/ResultSet
   #71 = Utf8               next
   #72 = Utf8               ()Z
   #73 = String             #74           // skill_id
   #74 = Utf8               skill_id
   #75 = InterfaceMethodref #68.#76       // java/sql/ResultSet.getInt:(Ljava/lang/String;)I
   #76 = NameAndType        #77:#78       // getInt:(Ljava/lang/String;)I
   #77 = Utf8               getInt
   #78 = Utf8               (Ljava/lang/String;)I
   #79 = String             #80           // slot
   #80 = Utf8               slot
   #81 = Methodref          #82.#83       // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
   #82 = Class              #84           // java/lang/Integer
   #83 = NameAndType        #85:#86       // valueOf:(I)Ljava/lang/Integer;
   #84 = Utf8               java/lang/Integer
   #85 = Utf8               valueOf
   #86 = Utf8               (I)Ljava/lang/Integer;
   #87 = InterfaceMethodref #63.#88       // java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #88 = NameAndType        #89:#90       // put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #89 = Utf8               put
   #90 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #91 = InterfaceMethodref #68.#92       // java/sql/ResultSet.close:()V
   #92 = NameAndType        #93:#6        // close:()V
   #93 = Utf8               close
   #94 = Class              #95           // java/lang/Throwable
   #95 = Utf8               java/lang/Throwable
   #96 = Methodref          #94.#97       // java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
   #97 = NameAndType        #98:#99       // addSuppressed:(Ljava/lang/Throwable;)V
   #98 = Utf8               addSuppressed
   #99 = Utf8               (Ljava/lang/Throwable;)V
  #100 = InterfaceMethodref #37.#92       // java/sql/PreparedStatement.close:()V
  #101 = InterfaceMethodref #25.#92       // java/sql/Connection.close:()V
  #102 = Class              #103          // java/lang/Exception
  #103 = Utf8               java/lang/Exception
  #104 = Fieldref           #8.#105       // ext/mods/gameserver/model/entity/autofarm/AutoFarmData.LOGGER:Lext/mods/commons/logging/CLogger;
  #105 = NameAndType        #106:#107     // LOGGER:Lext/mods/commons/logging/CLogger;
  #106 = Utf8               LOGGER
  #107 = Utf8               Lext/mods/commons/logging/CLogger;
  #108 = String             #109          // AutoFarm: Erro ao restaurar skills do player {}.
  #109 = Utf8               AutoFarm: Erro ao restaurar skills do player {}.
  #110 = Methodref          #31.#111      // ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
  #111 = NameAndType        #112:#113     // getName:()Ljava/lang/String;
  #112 = Utf8               getName
  #113 = Utf8               ()Ljava/lang/String;
  #114 = Methodref          #115.#116     // ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
  #115 = Class              #117          // ext/mods/commons/logging/CLogger
  #116 = NameAndType        #118:#119     // error:(Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
  #117 = Utf8               ext/mods/commons/logging/CLogger
  #118 = Utf8               error
  #119 = Utf8               (Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
  #120 = String             #121          // DELETE FROM autofarm_skills WHERE player_id = ?
  #121 = Utf8               DELETE FROM autofarm_skills WHERE player_id = ?
  #122 = InterfaceMethodref #37.#123      // java/sql/PreparedStatement.execute:()Z
  #123 = NameAndType        #124:#72      // execute:()Z
  #124 = Utf8               execute
  #125 = InterfaceMethodref #63.#126      // java/util/Map.isEmpty:()Z
  #126 = NameAndType        #127:#72      // isEmpty:()Z
  #127 = Utf8               isEmpty
  #128 = String             #129          // INSERT INTO autofarm_skills (player_id, skill_id, slot) VALUES (?,?,?)
  #129 = Utf8               INSERT INTO autofarm_skills (player_id, skill_id, slot) VALUES (?,?,?)
  #130 = InterfaceMethodref #63.#131      // java/util/Map.entrySet:()Ljava/util/Set;
  #131 = NameAndType        #132:#133     // entrySet:()Ljava/util/Set;
  #132 = Utf8               entrySet
  #133 = Utf8               ()Ljava/util/Set;
  #134 = InterfaceMethodref #135.#136     // java/util/Set.iterator:()Ljava/util/Iterator;
  #135 = Class              #137          // java/util/Set
  #136 = NameAndType        #138:#139     // iterator:()Ljava/util/Iterator;
  #137 = Utf8               java/util/Set
  #138 = Utf8               iterator
  #139 = Utf8               ()Ljava/util/Iterator;
  #140 = InterfaceMethodref #141.#142     // java/util/Iterator.hasNext:()Z
  #141 = Class              #143          // java/util/Iterator
  #142 = NameAndType        #144:#72      // hasNext:()Z
  #143 = Utf8               java/util/Iterator
  #144 = Utf8               hasNext
  #145 = InterfaceMethodref #141.#146     // java/util/Iterator.next:()Ljava/lang/Object;
  #146 = NameAndType        #71:#147      // next:()Ljava/lang/Object;
  #147 = Utf8               ()Ljava/lang/Object;
  #148 = Class              #149          // java/util/Map$Entry
  #149 = Utf8               java/util/Map$Entry
  #150 = InterfaceMethodref #148.#151     // java/util/Map$Entry.getValue:()Ljava/lang/Object;
  #151 = NameAndType        #152:#147     // getValue:()Ljava/lang/Object;
  #152 = Utf8               getValue
  #153 = Methodref          #82.#154      // java/lang/Integer.intValue:()I
  #154 = NameAndType        #155:#35      // intValue:()I
  #155 = Utf8               intValue
  #156 = InterfaceMethodref #148.#157     // java/util/Map$Entry.getKey:()Ljava/lang/Object;
  #157 = NameAndType        #158:#147     // getKey:()Ljava/lang/Object;
  #158 = Utf8               getKey
  #159 = InterfaceMethodref #37.#160      // java/sql/PreparedStatement.addBatch:()V
  #160 = NameAndType        #161:#6       // addBatch:()V
  #161 = Utf8               addBatch
  #162 = InterfaceMethodref #37.#163      // java/sql/PreparedStatement.executeBatch:()[I
  #163 = NameAndType        #164:#165     // executeBatch:()[I
  #164 = Utf8               executeBatch
  #165 = Utf8               ()[I
  #166 = String             #167          // AutoFarm: Erro ao salvar skills do player {}.
  #167 = Utf8               AutoFarm: Erro ao salvar skills do player {}.
  #168 = String             #169          // SELECT * FROM autofarm_areas WHERE player_id = ?
  #169 = Utf8               SELECT * FROM autofarm_areas WHERE player_id = ?
  #170 = String             #171          // type
  #171 = Utf8               type
  #172 = InterfaceMethodref #68.#173      // java/sql/ResultSet.getString:(Ljava/lang/String;)Ljava/lang/String;
  #173 = NameAndType        #174:#175     // getString:(Ljava/lang/String;)Ljava/lang/String;
  #174 = Utf8               getString
  #175 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
  #176 = Methodref          #177.#178     // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType.valueOf:(Ljava/lang/String;)Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;
  #177 = Class              #179          // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType
  #178 = NameAndType        #85:#180      // valueOf:(Ljava/lang/String;)Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;
  #179 = Utf8               ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType
  #180 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;
  #181 = String             #182          // area_id
  #182 = Utf8               area_id
  #183 = Fieldref           #177.#184     // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType.ZONA:Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;
  #184 = NameAndType        #185:#186     // ZONA:Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;
  #185 = Utf8               ZONA
  #186 = Utf8               Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;
  #187 = Methodref          #57.#188      // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getAreas:()Ljava/util/Map;
  #188 = NameAndType        #189:#61      // getAreas:()Ljava/util/Map;
  #189 = Utf8               getAreas
  #190 = Class              #191          // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmZone
  #191 = Utf8               ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmZone
  #192 = String             #193          // name
  #193 = Utf8               name
  #194 = String             #195          // player_id
  #195 = Utf8               player_id
  #196 = Methodref          #190.#197     // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmZone."<init>":(ILjava/lang/String;I)V
  #197 = NameAndType        #5:#198       // "<init>":(ILjava/lang/String;I)V
  #198 = Utf8               (ILjava/lang/String;I)V
  #199 = Fieldref           #177.#200     // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType.ROTA:Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;
  #200 = NameAndType        #201:#186     // ROTA:Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;
  #201 = Utf8               ROTA
  #202 = Class              #203          // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmRoute
  #203 = Utf8               ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmRoute
  #204 = Methodref          #202.#197     // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmRoute."<init>":(ILjava/lang/String;I)V
  #205 = Methodref          #47.#206      // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager.getPlayer:(I)Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
  #206 = NameAndType        #207:#208     // getPlayer:(I)Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
  #207 = Utf8               getPlayer
  #208 = Utf8               (I)Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
  #209 = InterfaceMethodref #63.#210      // java/util/Map.values:()Ljava/util/Collection;
  #210 = NameAndType        #211:#212     // values:()Ljava/util/Collection;
  #211 = Utf8               values
  #212 = Utf8               ()Ljava/util/Collection;
  #213 = InterfaceMethodref #214.#215     // java/util/Collection.stream:()Ljava/util/stream/Stream;
  #214 = Class              #216          // java/util/Collection
  #215 = NameAndType        #217:#218     // stream:()Ljava/util/stream/Stream;
  #216 = Utf8               java/util/Collection
  #217 = Utf8               stream
  #218 = Utf8               ()Ljava/util/stream/Stream;
  #219 = InvokeDynamic      #0:#220       // #0:apply:()Ljava/util/function/Function;
  #220 = NameAndType        #221:#222     // apply:()Ljava/util/function/Function;
  #221 = Utf8               apply
  #222 = Utf8               ()Ljava/util/function/Function;
  #223 = InterfaceMethodref #224.#225     // java/util/stream/Stream.map:(Ljava/util/function/Function;)Ljava/util/stream/Stream;
  #224 = Class              #226          // java/util/stream/Stream
  #225 = NameAndType        #227:#228     // map:(Ljava/util/function/Function;)Ljava/util/stream/Stream;
  #226 = Utf8               java/util/stream/Stream
  #227 = Utf8               map
  #228 = Utf8               (Ljava/util/function/Function;)Ljava/util/stream/Stream;
  #229 = InterfaceMethodref #224.#230     // java/util/stream/Stream.toList:()Ljava/util/List;
  #230 = NameAndType        #231:#232     // toList:()Ljava/util/List;
  #231 = Utf8               toList
  #232 = Utf8               ()Ljava/util/List;
  #233 = InterfaceMethodref #234.#126     // java/util/List.isEmpty:()Z
  #234 = Class              #235          // java/util/List
  #235 = Utf8               java/util/List
  #236 = InterfaceMethodref #234.#215     // java/util/List.stream:()Ljava/util/stream/Stream;
  #237 = InvokeDynamic      #1:#220       // #1:apply:()Ljava/util/function/Function;
  #238 = String             #239          // ,
  #239 = Utf8               ,
  #240 = Methodref          #241.#242     // java/util/stream/Collectors.joining:(Ljava/lang/CharSequence;)Ljava/util/stream/Collector;
  #241 = Class              #243          // java/util/stream/Collectors
  #242 = NameAndType        #244:#245     // joining:(Ljava/lang/CharSequence;)Ljava/util/stream/Collector;
  #243 = Utf8               java/util/stream/Collectors
  #244 = Utf8               joining
  #245 = Utf8               (Ljava/lang/CharSequence;)Ljava/util/stream/Collector;
  #246 = InterfaceMethodref #224.#247     // java/util/stream/Stream.collect:(Ljava/util/stream/Collector;)Ljava/lang/Object;
  #247 = NameAndType        #248:#249     // collect:(Ljava/util/stream/Collector;)Ljava/lang/Object;
  #248 = Utf8               collect
  #249 = Utf8               (Ljava/util/stream/Collector;)Ljava/lang/Object;
  #250 = Class              #251          // java/lang/String
  #251 = Utf8               java/lang/String
  #252 = String             #253          // SELECT * FROM autofarm_nodes WHERE area_id IN (%s) ORDER BY node_id
  #253 = Utf8               SELECT * FROM autofarm_nodes WHERE area_id IN (%s) ORDER BY node_id
  #254 = Methodref          #250.#255     // java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
  #255 = NameAndType        #256:#257     // format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
  #256 = Utf8               format
  #257 = Utf8               (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
  #258 = InterfaceMethodref #234.#259     // java/util/List.size:()I
  #259 = NameAndType        #260:#35      // size:()I
  #260 = Utf8               size
  #261 = InterfaceMethodref #234.#262     // java/util/List.get:(I)Ljava/lang/Object;
  #262 = NameAndType        #263:#264     // get:(I)Ljava/lang/Object;
  #263 = Utf8               get
  #264 = Utf8               (I)Ljava/lang/Object;
  #265 = Methodref          #57.#266      // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getAreaById:(I)Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;
  #266 = NameAndType        #267:#268     // getAreaById:(I)Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;
  #267 = Utf8               getAreaById
  #268 = Utf8               (I)Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;
  #269 = Methodref          #270.#271     // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.getNodes:()Ljava/util/List;
  #270 = Class              #272          // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea
  #271 = NameAndType        #273:#232     // getNodes:()Ljava/util/List;
  #272 = Utf8               ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea
  #273 = Utf8               getNodes
  #274 = Class              #275          // ext/mods/gameserver/model/location/Location
  #275 = Utf8               ext/mods/gameserver/model/location/Location
  #276 = String             #277          // loc_x
  #277 = Utf8               loc_x
  #278 = String             #279          // loc_y
  #279 = Utf8               loc_y
  #280 = String             #281          // loc_z
  #281 = Utf8               loc_z
  #282 = Methodref          #274.#283     // ext/mods/gameserver/model/location/Location."<init>":(III)V
  #283 = NameAndType        #5:#284       // "<init>":(III)V
  #284 = Utf8               (III)V
  #285 = InterfaceMethodref #234.#286     // java/util/List.add:(Ljava/lang/Object;)Z
  #286 = NameAndType        #287:#288     // add:(Ljava/lang/Object;)Z
  #287 = Utf8               add
  #288 = Utf8               (Ljava/lang/Object;)Z
  #289 = String             #290          // Não foi possível restaurar as AutoFarmArea do player {}.
  #290 = Utf8               Não foi possível restaurar as AutoFarmArea do player {}.
  #291 = String             #292          // DELETE FROM autofarm_areas WHERE player_id = ? AND area_id = ?
  #292 = Utf8               DELETE FROM autofarm_areas WHERE player_id = ? AND area_id = ?
  #293 = String             #294          // DELETE FROM autofarm_nodes WHERE area_id = ?
  #294 = Utf8               DELETE FROM autofarm_nodes WHERE area_id = ?
  #295 = String             #296          // Não foi possível deletar a AutoFarmArea id #{}.
  #296 = Utf8               Não foi possível deletar a AutoFarmArea id #{}.
  #297 = Methodref          #270.#298     // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.getId:()I
  #298 = NameAndType        #299:#35      // getId:()I
  #299 = Utf8               getId
  #300 = String             #301          // INSERT INTO autofarm_nodes (node_id, area_id, loc_x, loc_y, loc_z) VALUES (?,?,?,?,?)
  #301 = Utf8               INSERT INTO autofarm_nodes (node_id, area_id, loc_x, loc_y, loc_z) VALUES (?,?,?,?,?)
  #302 = InterfaceMethodref #234.#136     // java/util/List.iterator:()Ljava/util/Iterator;
  #303 = Methodref          #274.#304     // ext/mods/gameserver/model/location/Location.getX:()I
  #304 = NameAndType        #305:#35      // getX:()I
  #305 = Utf8               getX
  #306 = Methodref          #274.#307     // ext/mods/gameserver/model/location/Location.getY:()I
  #307 = NameAndType        #308:#35      // getY:()I
  #308 = Utf8               getY
  #309 = Methodref          #274.#310     // ext/mods/gameserver/model/location/Location.getZ:()I
  #310 = NameAndType        #311:#35      // getZ:()I
  #311 = Utf8               getZ
  #312 = String             #313          // Não foi possível salvar os nodes da AutoFarmArea id #{}.
  #313 = Utf8               Não foi possível salvar os nodes da AutoFarmArea id #{}.
  #314 = String             #315          // INSERT INTO autofarm_areas (player_id, area_id, name,type) VALUES (?,?,?,?)
  #315 = Utf8               INSERT INTO autofarm_areas (player_id, area_id, name,type) VALUES (?,?,?,?)
  #316 = Methodref          #270.#111     // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.getName:()Ljava/lang/String;
  #317 = InterfaceMethodref #37.#318      // java/sql/PreparedStatement.setString:(ILjava/lang/String;)V
  #318 = NameAndType        #319:#320     // setString:(ILjava/lang/String;)V
  #319 = Utf8               setString
  #320 = Utf8               (ILjava/lang/String;)V
  #321 = Methodref          #270.#322     // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.getType:()Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;
  #322 = NameAndType        #323:#324     // getType:()Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;
  #323 = Utf8               getType
  #324 = Utf8               ()Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;
  #325 = Methodref          #177.#326     // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType.name:()Ljava/lang/String;
  #326 = NameAndType        #193:#113     // name:()Ljava/lang/String;
  #327 = Methodref          #270.#328     // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.setIsFromDb:()V
  #328 = NameAndType        #329:#6       // setIsFromDb:()V
  #329 = Utf8               setIsFromDb
  #330 = String             #331          // Não foi possível salvar a AutoFarmArea id #{}.
  #331 = Utf8               Não foi possível salvar a AutoFarmArea id #{}.
  #332 = String             #333          // INSERT INTO autofarm_player_data (player_id, time_used) VALUES (?, ?) ON DUPLICATE KEY UPDATE time_used = ?
  #333 = Utf8               INSERT INTO autofarm_player_data (player_id, time_used) VALUES (?, ?) ON DUPLICATE KEY UPDATE time_used = ?
  #334 = InterfaceMethodref #37.#335      // java/sql/PreparedStatement.setLong:(IJ)V
  #335 = NameAndType        #336:#337     // setLong:(IJ)V
  #336 = Utf8               setLong
  #337 = Utf8               (IJ)V
  #338 = Methodref          #102.#339     // java/lang/Exception.getMessage:()Ljava/lang/String;
  #339 = NameAndType        #340:#113     // getMessage:()Ljava/lang/String;
  #340 = Utf8               getMessage
  #341 = InvokeDynamic      #2:#342       // #2:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #342 = NameAndType        #343:#175     // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #343 = Utf8               makeConcatWithConstants
  #344 = Methodref          #115.#345     // ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
  #345 = NameAndType        #118:#346     // error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
  #346 = Utf8               (Ljava/lang/Object;Ljava/lang/Throwable;)V
  #347 = String             #348          // SELECT time_used FROM autofarm_player_data WHERE player_id = ?
  #348 = Utf8               SELECT time_used FROM autofarm_player_data WHERE player_id = ?
  #349 = String             #350          // time_used
  #350 = Utf8               time_used
  #351 = InterfaceMethodref #68.#352      // java/sql/ResultSet.getLong:(Ljava/lang/String;)J
  #352 = NameAndType        #353:#354     // getLong:(Ljava/lang/String;)J
  #353 = Utf8               getLong
  #354 = Utf8               (Ljava/lang/String;)J
  #355 = InvokeDynamic      #3:#342       // #3:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #356 = Fieldref           #357.#358     // ext/mods/gameserver/model/entity/autofarm/AutoFarmData$SingletonHolder.INSTANCE:Lext/mods/gameserver/model/entity/autofarm/AutoFarmData;
  #357 = Class              #359          // ext/mods/gameserver/model/entity/autofarm/AutoFarmData$SingletonHolder
  #358 = NameAndType        #360:#361     // INSTANCE:Lext/mods/gameserver/model/entity/autofarm/AutoFarmData;
  #359 = Utf8               ext/mods/gameserver/model/entity/autofarm/AutoFarmData$SingletonHolder
  #360 = Utf8               INSTANCE
  #361 = Utf8               Lext/mods/gameserver/model/entity/autofarm/AutoFarmData;
  #362 = String             #363          // ?
  #363 = Utf8               ?
  #364 = Methodref          #365.#111     // java/lang/Class.getName:()Ljava/lang/String;
  #365 = Class              #366          // java/lang/Class
  #366 = Utf8               java/lang/Class
  #367 = Methodref          #115.#368     // ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
  #368 = NameAndType        #5:#369       // "<init>":(Ljava/lang/String;)V
  #369 = Utf8               (Ljava/lang/String;)V
  #370 = Utf8               LOAD_AREAS
  #371 = Utf8               Ljava/lang/String;
  #372 = Utf8               ConstantValue
  #373 = Utf8               LOAD_NODES
  #374 = Utf8               INSERT_AREA
  #375 = Utf8               INSERT_NODES
  #376 = Utf8               DELETE_AREA
  #377 = Utf8               DELETE_NODES
  #378 = Utf8               LOAD_SKILLS
  #379 = Utf8               DELETE_SKILLS
  #380 = Utf8               INSERT_SKILL
  #381 = Utf8               LOAD_TIME_USAGE
  #382 = Utf8               UPDATE_TIME_USAGE
  #383 = Utf8               Code
  #384 = Utf8               LineNumberTable
  #385 = Utf8               LocalVariableTable
  #386 = Utf8               this
  #387 = Utf8               restorePlayer
  #388 = Utf8               player
  #389 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #390 = Utf8               skillId
  #391 = Utf8               I
  #392 = Utf8               profile
  #393 = Utf8               Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
  #394 = Utf8               rset
  #395 = Utf8               Ljava/sql/ResultSet;
  #396 = Utf8               ps
  #397 = Utf8               Ljava/sql/PreparedStatement;
  #398 = Utf8               con
  #399 = Utf8               Ljava/sql/Connection;
  #400 = Utf8               e
  #401 = Utf8               Ljava/lang/Exception;
  #402 = Utf8               StackMapTable
  #403 = Utf8               storeSkills
  #404 = Utf8               psDel
  #405 = Utf8               entry
  #406 = Utf8               Ljava/util/Map$Entry;
  #407 = Utf8               psIns
  #408 = Utf8               LocalVariableTypeTable
  #409 = Utf8               Ljava/util/Map$Entry<Ljava/lang/Integer;Ljava/lang/Integer;>;
  #410 = Utf8               areaId
  #411 = Utf8               i
  #412 = Utf8               ps2
  #413 = Utf8               areaIds
  #414 = Utf8               Ljava/util/List;
  #415 = Utf8               placeholders
  #416 = Utf8               ps1
  #417 = Utf8               Ljava/util/List<Ljava/lang/Integer;>;
  #418 = Utf8               deleteArea
  #419 = Utf8               playerId
  #420 = Utf8               insertNodes
  #421 = Utf8               (Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;)V
  #422 = Utf8               loc
  #423 = Utf8               Lext/mods/gameserver/model/location/Location;
  #424 = Utf8               indice
  #425 = Utf8               area
  #426 = Utf8               Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;
  #427 = Utf8               insertArea
  #428 = Utf8               (ILext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;)V
  #429 = Utf8               addExtraTime
  #430 = Utf8               objectId
  #431 = Utf8               extraTime
  #432 = Utf8               J
  #433 = Utf8               getExtraTime
  #434 = Utf8               (I)J
  #435 = Utf8               updatePlayerTimeUsage
  #436 = Utf8               timeUsed
  #437 = Utf8               loadPlayerTimeUsage
  #438 = Utf8               rs
  #439 = Utf8               ()Lext/mods/gameserver/model/entity/autofarm/AutoFarmData;
  #440 = Utf8               lambda$restoreAreas$0
  #441 = Utf8               (Ljava/lang/Integer;)Ljava/lang/String;
  #442 = Utf8               id
  #443 = Utf8               Ljava/lang/Integer;
  #444 = Utf8               <clinit>
  #445 = Utf8               SourceFile
  #446 = Utf8               AutoFarmData.java
  #447 = Utf8               NestMembers
  #448 = Utf8               BootstrapMethods
  #449 = MethodType         #450          //  (Ljava/lang/Object;)Ljava/lang/Object;
  #450 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
  #451 = MethodHandle       5:#452        // REF_invokeVirtual ext/mods/gameserver/model/zone/type/subtype/ZoneType.getId:()I
  #452 = Methodref          #453.#298     // ext/mods/gameserver/model/zone/type/subtype/ZoneType.getId:()I
  #453 = Class              #454          // ext/mods/gameserver/model/zone/type/subtype/ZoneType
  #454 = Utf8               ext/mods/gameserver/model/zone/type/subtype/ZoneType
  #455 = MethodType         #456          //  (Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;)Ljava/lang/Integer;
  #456 = Utf8               (Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;)Ljava/lang/Integer;
  #457 = MethodHandle       6:#458        // REF_invokeStatic ext/mods/gameserver/model/entity/autofarm/AutoFarmData.lambda$restoreAreas$0:(Ljava/lang/Integer;)Ljava/lang/String;
  #458 = Methodref          #8.#459       // ext/mods/gameserver/model/entity/autofarm/AutoFarmData.lambda$restoreAreas$0:(Ljava/lang/Integer;)Ljava/lang/String;
  #459 = NameAndType        #440:#441     // lambda$restoreAreas$0:(Ljava/lang/Integer;)Ljava/lang/String;
  #460 = MethodType         #441          //  (Ljava/lang/Integer;)Ljava/lang/String;
  #461 = String             #462          // Erro ao salvar tempo de autofarm: \u0001
  #462 = Utf8               Erro ao salvar tempo de autofarm: \u0001
  #463 = String             #464          // Erro ao carregar tempo de autofarm: \u0001
  #464 = Utf8               Erro ao carregar tempo de autofarm: \u0001
  #465 = MethodHandle       6:#466        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #466 = Methodref          #467.#468     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #467 = Class              #469          // java/lang/invoke/LambdaMetafactory
  #468 = NameAndType        #470:#471     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #469 = Utf8               java/lang/invoke/LambdaMetafactory
  #470 = Utf8               metafactory
  #471 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #472 = MethodHandle       6:#473        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #473 = Methodref          #474.#475     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #474 = Class              #476          // java/lang/invoke/StringConcatFactory
  #475 = NameAndType        #343:#477     // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #476 = Utf8               java/lang/invoke/StringConcatFactory
  #477 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #478 = Utf8               InnerClasses
  #479 = Utf8               Entry
  #480 = Utf8               AutoFarmType
  #481 = Utf8               SingletonHolder
  #482 = Class              #483          // java/lang/invoke/MethodHandles$Lookup
  #483 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #484 = Class              #485          // java/lang/invoke/MethodHandles
  #485 = Utf8               java/lang/invoke/MethodHandles
  #486 = Utf8               Lookup
{
  public ext.mods.gameserver.model.entity.autofarm.AutoFarmData();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 37: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/entity/autofarm/AutoFarmData;

  public void restorePlayer(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokevirtual #7                  // Method restoreAreas:(Lext/mods/gameserver/model/actor/Player;)V
         5: aload_0
         6: aload_1
         7: invokevirtual #13                 // Method restoreSkills:(Lext/mods/gameserver/model/actor/Player;)V
        10: return
      LineNumberTable:
        line 57: 0
        line 59: 5
        line 60: 10
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      11     0  this   Lext/mods/gameserver/model/entity/autofarm/AutoFarmData;
            0      11     1 player   Lext/mods/gameserver/model/actor/Player;

  public void storeSkills(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=7, locals=7, args_size=2
         0: invokestatic  #46                 // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmManager.getInstance:()Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager;
         3: aload_1
         4: invokevirtual #52                 // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmManager.getProfile:(Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
         7: astore_2
         8: aload_2
         9: ifnonnull     13
        12: return
        13: invokestatic  #16                 // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
        16: astore_3
        17: aload_3
        18: ldc           #120                // String DELETE FROM autofarm_skills WHERE player_id = ?
        20: invokeinterface #24,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        25: astore        4
        27: aload         4
        29: iconst_1
        30: aload_1
        31: invokevirtual #30                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        34: invokeinterface #36,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        39: aload         4
        41: invokeinterface #122,  1          // InterfaceMethod java/sql/PreparedStatement.execute:()Z
        46: pop
        47: aload         4
        49: ifnull        91
        52: aload         4
        54: invokeinterface #100,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
        59: goto          91
        62: astore        5
        64: aload         4
        66: ifnull        88
        69: aload         4
        71: invokeinterface #100,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
        76: goto          88
        79: astore        6
        81: aload         5
        83: aload         6
        85: invokevirtual #96                 // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        88: aload         5
        90: athrow
        91: aload_2
        92: invokevirtual #56                 // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getSkills:()Ljava/util/Map;
        95: invokeinterface #125,  1          // InterfaceMethod java/util/Map.isEmpty:()Z
       100: ifne          267
       103: aload_3
       104: ldc           #128                // String INSERT INTO autofarm_skills (player_id, skill_id, slot) VALUES (?,?,?)
       106: invokeinterface #24,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
       111: astore        4
       113: aload_2
       114: invokevirtual #56                 // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getSkills:()Ljava/util/Map;
       117: invokeinterface #130,  1          // InterfaceMethod java/util/Map.entrySet:()Ljava/util/Set;
       122: invokeinterface #134,  1          // InterfaceMethod java/util/Set.iterator:()Ljava/util/Iterator;
       127: astore        5
       129: aload         5
       131: invokeinterface #140,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       136: ifeq          215
       139: aload         5
       141: invokeinterface #145,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       146: checkcast     #148                // class java/util/Map$Entry
       149: astore        6
       151: aload         4
       153: iconst_1
       154: aload_1
       155: invokevirtual #30                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
       158: invokeinterface #36,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       163: aload         4
       165: iconst_2
       166: aload         6
       168: invokeinterface #150,  1          // InterfaceMethod java/util/Map$Entry.getValue:()Ljava/lang/Object;
       173: checkcast     #82                 // class java/lang/Integer
       176: invokevirtual #153                // Method java/lang/Integer.intValue:()I
       179: invokeinterface #36,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       184: aload         4
       186: iconst_3
       187: aload         6
       189: invokeinterface #156,  1          // InterfaceMethod java/util/Map$Entry.getKey:()Ljava/lang/Object;
       194: checkcast     #82                 // class java/lang/Integer
       197: invokevirtual #153                // Method java/lang/Integer.intValue:()I
       200: invokeinterface #36,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       205: aload         4
       207: invokeinterface #159,  1          // InterfaceMethod java/sql/PreparedStatement.addBatch:()V
       212: goto          129
       215: aload         4
       217: invokeinterface #162,  1          // InterfaceMethod java/sql/PreparedStatement.executeBatch:()[I
       222: pop
       223: aload         4
       225: ifnull        267
       228: aload         4
       230: invokeinterface #100,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       235: goto          267
       238: astore        5
       240: aload         4
       242: ifnull        264
       245: aload         4
       247: invokeinterface #100,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       252: goto          264
       255: astore        6
       257: aload         5
       259: aload         6
       261: invokevirtual #96                 // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       264: aload         5
       266: athrow
       267: aload_3
       268: ifnull        307
       271: aload_3
       272: invokeinterface #101,  1          // InterfaceMethod java/sql/Connection.close:()V
       277: goto          307
       280: astore        4
       282: aload_3
       283: ifnull        304
       286: aload_3
       287: invokeinterface #101,  1          // InterfaceMethod java/sql/Connection.close:()V
       292: goto          304
       295: astore        5
       297: aload         4
       299: aload         5
       301: invokevirtual #96                 // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       304: aload         4
       306: athrow
       307: goto          331
       310: astore_3
       311: getstatic     #104                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       314: ldc           #166                // String AutoFarm: Erro ao salvar skills do player {}.
       316: aload_3
       317: iconst_1
       318: anewarray     #2                  // class java/lang/Object
       321: dup
       322: iconst_0
       323: aload_1
       324: invokevirtual #110                // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
       327: aastore
       328: invokevirtual #114                // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
       331: return
      Exception table:
         from    to  target type
            27    47    62   Class java/lang/Throwable
            69    76    79   Class java/lang/Throwable
           113   223   238   Class java/lang/Throwable
           245   252   255   Class java/lang/Throwable
            17   267   280   Class java/lang/Throwable
           286   292   295   Class java/lang/Throwable
            13   307   310   Class java/lang/Exception
      LineNumberTable:
        line 90: 0
        line 91: 8
        line 93: 13
        line 95: 17
        line 97: 27
        line 98: 39
        line 99: 47
        line 95: 62
        line 101: 91
        line 103: 103
        line 105: 113
        line 107: 151
        line 108: 163
        line 109: 184
        line 110: 205
        line 111: 212
        line 112: 215
        line 113: 223
        line 103: 238
        line 115: 267
        line 93: 280
        line 119: 307
        line 116: 310
        line 118: 311
        line 120: 331
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           27      64     4 psDel   Ljava/sql/PreparedStatement;
          151      61     6 entry   Ljava/util/Map$Entry;
          113     154     4 psIns   Ljava/sql/PreparedStatement;
           17     290     3   con   Ljava/sql/Connection;
          311      20     3     e   Ljava/lang/Exception;
            0     332     0  this   Lext/mods/gameserver/model/entity/autofarm/AutoFarmData;
            0     332     1 player   Lext/mods/gameserver/model/actor/Player;
            8     324     2 profile   Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
          151      61     6 entry   Ljava/util/Map$Entry<Ljava/lang/Integer;Ljava/lang/Integer;>;
      StackMapTable: number_of_entries = 17
        frame_type = 252 /* append */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile ]
        frame_type = 255 /* full_frame */
          offset_delta = 48
          locals = [ class ext/mods/gameserver/model/entity/autofarm/AutoFarmData, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile, class java/sql/Connection, class java/sql/PreparedStatement ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/model/entity/autofarm/AutoFarmData, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 253 /* append */
          offset_delta = 37
          locals = [ class java/sql/PreparedStatement, class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 85
        frame_type = 86 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/model/entity/autofarm/AutoFarmData, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 14
          locals = [ class ext/mods/gameserver/model/entity/autofarm/AutoFarmData, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile, class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 20 /* same */

  public void deleteArea(int, int);
    descriptor: (II)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=7, locals=7, args_size=3
         0: invokestatic  #16                 // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
         3: astore_3
         4: aload_3
         5: ldc_w         #291                // String DELETE FROM autofarm_areas WHERE player_id = ? AND area_id = ?
         8: invokeinterface #24,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        13: astore        4
        15: aload         4
        17: iconst_1
        18: iload_1
        19: invokeinterface #36,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        24: aload         4
        26: iconst_2
        27: iload_2
        28: invokeinterface #36,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        33: aload         4
        35: invokeinterface #122,  1          // InterfaceMethod java/sql/PreparedStatement.execute:()Z
        40: pop
        41: aload         4
        43: ifnull        85
        46: aload         4
        48: invokeinterface #100,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
        53: goto          85
        56: astore        5
        58: aload         4
        60: ifnull        82
        63: aload         4
        65: invokeinterface #100,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
        70: goto          82
        73: astore        6
        75: aload         5
        77: aload         6
        79: invokevirtual #96                 // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        82: aload         5
        84: athrow
        85: aload_3
        86: ldc_w         #293                // String DELETE FROM autofarm_nodes WHERE area_id = ?
        89: invokeinterface #24,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        94: astore        4
        96: aload         4
        98: iconst_1
        99: iload_2
       100: invokeinterface #36,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       105: aload         4
       107: invokeinterface #122,  1          // InterfaceMethod java/sql/PreparedStatement.execute:()Z
       112: pop
       113: aload         4
       115: ifnull        157
       118: aload         4
       120: invokeinterface #100,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       125: goto          157
       128: astore        5
       130: aload         4
       132: ifnull        154
       135: aload         4
       137: invokeinterface #100,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       142: goto          154
       145: astore        6
       147: aload         5
       149: aload         6
       151: invokevirtual #96                 // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       154: aload         5
       156: athrow
       157: aload_3
       158: ifnull        197
       161: aload_3
       162: invokeinterface #101,  1          // InterfaceMethod java/sql/Connection.close:()V
       167: goto          197
       170: astore        4
       172: aload_3
       173: ifnull        194
       176: aload_3
       177: invokeinterface #101,  1          // InterfaceMethod java/sql/Connection.close:()V
       182: goto          194
       185: astore        5
       187: aload         4
       189: aload         5
       191: invokevirtual #96                 // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       194: aload         4
       196: athrow
       197: goto          222
       200: astore_3
       201: getstatic     #104                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       204: ldc_w         #295                // String Não foi possível deletar a AutoFarmArea id #{}.
       207: aload_3
       208: iconst_1
       209: anewarray     #2                  // class java/lang/Object
       212: dup
       213: iconst_0
       214: iload_2
       215: invokestatic  #81                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       218: aastore
       219: invokevirtual #114                // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
       222: return
      Exception table:
         from    to  target type
            15    41    56   Class java/lang/Throwable
            63    70    73   Class java/lang/Throwable
            96   113   128   Class java/lang/Throwable
           135   142   145   Class java/lang/Throwable
             4   157   170   Class java/lang/Throwable
           176   182   185   Class java/lang/Throwable
             0   197   200   Class java/lang/Exception
      LineNumberTable:
        line 180: 0
        line 182: 4
        line 184: 15
        line 185: 24
        line 186: 33
        line 187: 41
        line 182: 56
        line 189: 85
        line 191: 96
        line 192: 105
        line 193: 113
        line 189: 128
        line 194: 157
        line 180: 170
        line 198: 197
        line 195: 200
        line 197: 201
        line 199: 222
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           15      70     4   ps1   Ljava/sql/PreparedStatement;
           96      61     4   ps2   Ljava/sql/PreparedStatement;
            4     193     3   con   Ljava/sql/Connection;
          201      21     3     e   Ljava/lang/Exception;
            0     223     0  this   Lext/mods/gameserver/model/entity/autofarm/AutoFarmData;
            0     223     1 playerId   I
            0     223     2 areaId   I
      StackMapTable: number_of_entries = 14
        frame_type = 255 /* full_frame */
          offset_delta = 56
          locals = [ class ext/mods/gameserver/model/entity/autofarm/AutoFarmData, int, int, class java/sql/Connection, class java/sql/PreparedStatement ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/model/entity/autofarm/AutoFarmData, int, int, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 255 /* full_frame */
          offset_delta = 42
          locals = [ class ext/mods/gameserver/model/entity/autofarm/AutoFarmData, int, int, class java/sql/Connection, class java/sql/PreparedStatement ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/model/entity/autofarm/AutoFarmData, int, int, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 14
          locals = [ class ext/mods/gameserver/model/entity/autofarm/AutoFarmData, int, int, class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 21 /* same */

  public void insertNodes(ext.mods.gameserver.model.entity.autofarm.zone.AutoFarmArea);
    descriptor: (Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=7, locals=7, args_size=2
         0: invokestatic  #16                 // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
         3: astore_2
         4: aload_2
         5: ldc_w         #293                // String DELETE FROM autofarm_nodes WHERE area_id = ?
         8: invokeinterface #24,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        13: astore_3
        14: aload_3
        15: iconst_1
        16: aload_1
        17: invokevirtual #297                // Method ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.getId:()I
        20: invokeinterface #36,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        25: aload_3
        26: invokeinterface #122,  1          // InterfaceMethod java/sql/PreparedStatement.execute:()Z
        31: pop
        32: aload_3
        33: ifnull        72
        36: aload_3
        37: invokeinterface #100,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
        42: goto          72
        45: astore        4
        47: aload_3
        48: ifnull        69
        51: aload_3
        52: invokeinterface #100,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
        57: goto          69
        60: astore        5
        62: aload         4
        64: aload         5
        66: invokevirtual #96                 // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        69: aload         4
        71: athrow
        72: aload_2
        73: ldc_w         #300                // String INSERT INTO autofarm_nodes (node_id, area_id, loc_x, loc_y, loc_z) VALUES (?,?,?,?,?)
        76: invokeinterface #24,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        81: astore_3
        82: iconst_0
        83: istore        4
        85: aload_1
        86: invokevirtual #269                // Method ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.getNodes:()Ljava/util/List;
        89: invokeinterface #302,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
        94: astore        5
        96: aload         5
        98: invokeinterface #140,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       103: ifeq          186
       106: aload         5
       108: invokeinterface #145,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       113: checkcast     #274                // class ext/mods/gameserver/model/location/Location
       116: astore        6
       118: aload_3
       119: iconst_1
       120: iload         4
       122: invokeinterface #36,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       127: aload_3
       128: iconst_2
       129: aload_1
       130: invokevirtual #297                // Method ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.getId:()I
       133: invokeinterface #36,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       138: aload_3
       139: iconst_3
       140: aload         6
       142: invokevirtual #303                // Method ext/mods/gameserver/model/location/Location.getX:()I
       145: invokeinterface #36,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       150: aload_3
       151: iconst_4
       152: aload         6
       154: invokevirtual #306                // Method ext/mods/gameserver/model/location/Location.getY:()I
       157: invokeinterface #36,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       162: aload_3
       163: iconst_5
       164: aload         6
       166: invokevirtual #309                // Method ext/mods/gameserver/model/location/Location.getZ:()I
       169: invokeinterface #36,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       174: aload_3
       175: invokeinterface #159,  1          // InterfaceMethod java/sql/PreparedStatement.addBatch:()V
       180: iinc          4, 1
       183: goto          96
       186: aload_3
       187: invokeinterface #162,  1          // InterfaceMethod java/sql/PreparedStatement.executeBatch:()[I
       192: pop
       193: aload_3
       194: ifnull        233
       197: aload_3
       198: invokeinterface #100,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       203: goto          233
       206: astore        4
       208: aload_3
       209: ifnull        230
       212: aload_3
       213: invokeinterface #100,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       218: goto          230
       221: astore        5
       223: aload         4
       225: aload         5
       227: invokevirtual #96                 // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       230: aload         4
       232: athrow
       233: aload_2
       234: ifnull        270
       237: aload_2
       238: invokeinterface #101,  1          // InterfaceMethod java/sql/Connection.close:()V
       243: goto          270
       246: astore_3
       247: aload_2
       248: ifnull        268
       251: aload_2
       252: invokeinterface #101,  1          // InterfaceMethod java/sql/Connection.close:()V
       257: goto          268
       260: astore        4
       262: aload_3
       263: aload         4
       265: invokevirtual #96                 // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       268: aload_3
       269: athrow
       270: goto          298
       273: astore_2
       274: getstatic     #104                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       277: ldc_w         #312                // String Não foi possível salvar os nodes da AutoFarmArea id #{}.
       280: aload_2
       281: iconst_1
       282: anewarray     #2                  // class java/lang/Object
       285: dup
       286: iconst_0
       287: aload_1
       288: invokevirtual #297                // Method ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.getId:()I
       291: invokestatic  #81                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       294: aastore
       295: invokevirtual #114                // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
       298: return
      Exception table:
         from    to  target type
            14    32    45   Class java/lang/Throwable
            51    57    60   Class java/lang/Throwable
            82   193   206   Class java/lang/Throwable
           212   218   221   Class java/lang/Throwable
             4   233   246   Class java/lang/Throwable
           251   257   260   Class java/lang/Throwable
             0   270   273   Class java/lang/Exception
      LineNumberTable:
        line 203: 0
        line 205: 4
        line 207: 14
        line 208: 25
        line 209: 32
        line 205: 45
        line 211: 72
        line 213: 82
        line 214: 85
        line 216: 118
        line 217: 127
        line 218: 138
        line 219: 150
        line 220: 162
        line 221: 174
        line 222: 180
        line 223: 183
        line 224: 186
        line 225: 193
        line 211: 206
        line 226: 233
        line 203: 246
        line 230: 270
        line 227: 273
        line 229: 274
        line 231: 298
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           14      58     3   ps1   Ljava/sql/PreparedStatement;
          118      65     6   loc   Lext/mods/gameserver/model/location/Location;
           85     108     4 indice   I
           82     151     3   ps2   Ljava/sql/PreparedStatement;
            4     266     2   con   Ljava/sql/Connection;
          274      24     2     e   Ljava/lang/Exception;
            0     299     0  this   Lext/mods/gameserver/model/entity/autofarm/AutoFarmData;
            0     299     1  area   Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;
      StackMapTable: number_of_entries = 16
        frame_type = 255 /* full_frame */
          offset_delta = 45
          locals = [ class ext/mods/gameserver/model/entity/autofarm/AutoFarmData, class ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea, class java/sql/Connection, class java/sql/PreparedStatement ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 14
          locals = [ class ext/mods/gameserver/model/entity/autofarm/AutoFarmData, class ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 254 /* append */
          offset_delta = 23
          locals = [ class java/sql/PreparedStatement, int, class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 89
        frame_type = 255 /* full_frame */
          offset_delta = 19
          locals = [ class ext/mods/gameserver/model/entity/autofarm/AutoFarmData, class ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea, class java/sql/Connection, class java/sql/PreparedStatement ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 14
          locals = [ class ext/mods/gameserver/model/entity/autofarm/AutoFarmData, class ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/model/entity/autofarm/AutoFarmData, class ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea, class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 7 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 24 /* same */

  public void insertArea(int, ext.mods.gameserver.model.entity.autofarm.zone.AutoFarmArea);
    descriptor: (ILext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=7, locals=7, args_size=3
         0: invokestatic  #16                 // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
         3: astore_3
         4: aload_3
         5: ldc_w         #314                // String INSERT INTO autofarm_areas (player_id, area_id, name,type) VALUES (?,?,?,?)
         8: invokeinterface #24,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        13: astore        4
        15: aload         4
        17: iconst_1
        18: iload_1
        19: invokeinterface #36,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        24: aload         4
        26: iconst_2
        27: aload_2
        28: invokevirtual #297                // Method ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.getId:()I
        31: invokeinterface #36,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        36: aload         4
        38: iconst_3
        39: aload_2
        40: invokevirtual #316                // Method ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.getName:()Ljava/lang/String;
        43: invokeinterface #317,  3          // InterfaceMethod java/sql/PreparedStatement.setString:(ILjava/lang/String;)V
        48: aload         4
        50: iconst_4
        51: aload_2
        52: invokevirtual #321                // Method ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.getType:()Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;
        55: invokevirtual #325                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType.name:()Ljava/lang/String;
        58: invokeinterface #317,  3          // InterfaceMethod java/sql/PreparedStatement.setString:(ILjava/lang/String;)V
        63: aload         4
        65: invokeinterface #122,  1          // InterfaceMethod java/sql/PreparedStatement.execute:()Z
        70: pop
        71: aload_2
        72: invokevirtual #327                // Method ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.setIsFromDb:()V
        75: aload         4
        77: ifnull        119
        80: aload         4
        82: invokeinterface #100,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
        87: goto          119
        90: astore        5
        92: aload         4
        94: ifnull        116
        97: aload         4
        99: invokeinterface #100,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       104: goto          116
       107: astore        6
       109: aload         5
       111: aload         6
       113: invokevirtual #96                 // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       116: aload         5
       118: athrow
       119: aload_3
       120: ifnull        159
       123: aload_3
       124: invokeinterface #101,  1          // InterfaceMethod java/sql/Connection.close:()V
       129: goto          159
       132: astore        4
       134: aload_3
       135: ifnull        156
       138: aload_3
       139: invokeinterface #101,  1          // InterfaceMethod java/sql/Connection.close:()V
       144: goto          156
       147: astore        5
       149: aload         4
       151: aload         5
       153: invokevirtual #96                 // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       156: aload         4
       158: athrow
       159: goto          187
       162: astore_3
       163: getstatic     #104                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       166: ldc_w         #330                // String Não foi possível salvar a AutoFarmArea id #{}.
       169: aload_3
       170: iconst_1
       171: anewarray     #2                  // class java/lang/Object
       174: dup
       175: iconst_0
       176: aload_2
       177: invokevirtual #297                // Method ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.getId:()I
       180: invokestatic  #81                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       183: aastore
       184: invokevirtual #114                // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
       187: return
      Exception table:
         from    to  target type
            15    75    90   Class java/lang/Throwable
            97   104   107   Class java/lang/Throwable
             4   119   132   Class java/lang/Throwable
           138   144   147   Class java/lang/Throwable
             0   159   162   Class java/lang/Exception
      LineNumberTable:
        line 235: 0
        line 236: 4
        line 238: 15
        line 239: 24
        line 240: 36
        line 241: 48
        line 242: 63
        line 244: 71
        line 245: 75
        line 235: 90
        line 245: 119
        line 235: 132
        line 249: 159
        line 246: 162
        line 248: 163
        line 250: 187
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           15     104     4    ps   Ljava/sql/PreparedStatement;
            4     155     3   con   Ljava/sql/Connection;
          163      24     3     e   Ljava/lang/Exception;
            0     188     0  this   Lext/mods/gameserver/model/entity/autofarm/AutoFarmData;
            0     188     1 playerId   I
            0     188     2  area   Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;
      StackMapTable: number_of_entries = 10
        frame_type = 255 /* full_frame */
          offset_delta = 90
          locals = [ class ext/mods/gameserver/model/entity/autofarm/AutoFarmData, int, class ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea, class java/sql/Connection, class java/sql/PreparedStatement ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/model/entity/autofarm/AutoFarmData, int, class ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 14
          locals = [ class ext/mods/gameserver/model/entity/autofarm/AutoFarmData, int, class ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea, class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 24 /* same */

  public void addExtraTime(int, long);
    descriptor: (IJ)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=0, locals=4, args_size=3
         0: return
      LineNumberTable:
        line 253: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       1     0  this   Lext/mods/gameserver/model/entity/autofarm/AutoFarmData;
            0       1     1 objectId   I
            0       1     2 extraTime   J

  public long getExtraTime(int);
    descriptor: (I)J
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: lconst_0
         1: lreturn
      LineNumberTable:
        line 256: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/gameserver/model/entity/autofarm/AutoFarmData;
            0       2     1 objectId   I

  public void updatePlayerTimeUsage(int, long);
    descriptor: (IJ)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=8, args_size=3
         0: invokestatic  #16                 // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
         3: astore        4
         5: aload         4
         7: ldc_w         #332                // String INSERT INTO autofarm_player_data (player_id, time_used) VALUES (?, ?) ON DUPLICATE KEY UPDATE time_used = ?
        10: invokeinterface #24,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        15: astore        5
        17: aload         5
        19: iconst_1
        20: iload_1
        21: invokeinterface #36,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        26: aload         5
        28: iconst_2
        29: lload_2
        30: invokeinterface #334,  4          // InterfaceMethod java/sql/PreparedStatement.setLong:(IJ)V
        35: aload         5
        37: iconst_3
        38: lload_2
        39: invokeinterface #334,  4          // InterfaceMethod java/sql/PreparedStatement.setLong:(IJ)V
        44: aload         5
        46: invokeinterface #122,  1          // InterfaceMethod java/sql/PreparedStatement.execute:()Z
        51: pop
        52: aload         5
        54: ifnull        96
        57: aload         5
        59: invokeinterface #100,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
        64: goto          96
        67: astore        6
        69: aload         5
        71: ifnull        93
        74: aload         5
        76: invokeinterface #100,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
        81: goto          93
        84: astore        7
        86: aload         6
        88: aload         7
        90: invokevirtual #96                 // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        93: aload         6
        95: athrow
        96: aload         4
        98: ifnull        140
       101: aload         4
       103: invokeinterface #101,  1          // InterfaceMethod java/sql/Connection.close:()V
       108: goto          140
       111: astore        5
       113: aload         4
       115: ifnull        137
       118: aload         4
       120: invokeinterface #101,  1          // InterfaceMethod java/sql/Connection.close:()V
       125: goto          137
       128: astore        6
       130: aload         5
       132: aload         6
       134: invokevirtual #96                 // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       137: aload         5
       139: athrow
       140: goto          163
       143: astore        4
       145: getstatic     #104                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       148: aload         4
       150: invokevirtual #338                // Method java/lang/Exception.getMessage:()Ljava/lang/String;
       153: invokedynamic #341,  0            // InvokeDynamic #2:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       158: aload         4
       160: invokevirtual #344                // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
       163: return
      Exception table:
         from    to  target type
            17    52    67   Class java/lang/Throwable
            74    81    84   Class java/lang/Throwable
             5    96   111   Class java/lang/Throwable
           118   125   128   Class java/lang/Throwable
             0   140   143   Class java/lang/Exception
      LineNumberTable:
        line 260: 0
        line 261: 5
        line 262: 17
        line 263: 26
        line 264: 35
        line 265: 44
        line 266: 52
        line 260: 67
        line 266: 96
        line 260: 111
        line 268: 140
        line 266: 143
        line 267: 145
        line 269: 163
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           17      79     5    ps   Ljava/sql/PreparedStatement;
            5     135     4   con   Ljava/sql/Connection;
          145      18     4     e   Ljava/lang/Exception;
            0     164     0  this   Lext/mods/gameserver/model/entity/autofarm/AutoFarmData;
            0     164     1 objectId   I
            0     164     2 timeUsed   J
      StackMapTable: number_of_entries = 10
        frame_type = 255 /* full_frame */
          offset_delta = 67
          locals = [ class ext/mods/gameserver/model/entity/autofarm/AutoFarmData, int, long, class java/sql/Connection, class java/sql/PreparedStatement ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/model/entity/autofarm/AutoFarmData, int, long, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 78 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/model/entity/autofarm/AutoFarmData, int, long, class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 19 /* same */

  public long loadPlayerTimeUsage(int);
    descriptor: (I)J
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=7, args_size=2
         0: invokestatic  #16                 // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
         3: astore_2
         4: aload_2
         5: ldc_w         #347                // String SELECT time_used FROM autofarm_player_data WHERE player_id = ?
         8: invokeinterface #24,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        13: astore_3
        14: aload_3
        15: iconst_1
        16: iload_1
        17: invokeinterface #36,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        22: aload_3
        23: invokeinterface #42,  1           // InterfaceMethod java/sql/PreparedStatement.executeQuery:()Ljava/sql/ResultSet;
        28: astore        4
        30: aload         4
        32: invokeinterface #67,  1           // InterfaceMethod java/sql/ResultSet.next:()Z
        37: ifeq          87
        40: aload         4
        42: ldc_w         #349                // String time_used
        45: invokeinterface #351,  2          // InterfaceMethod java/sql/ResultSet.getLong:(Ljava/lang/String;)J
        50: lstore        5
        52: aload         4
        54: ifnull        64
        57: aload         4
        59: invokeinterface #91,  1           // InterfaceMethod java/sql/ResultSet.close:()V
        64: aload_3
        65: ifnull        74
        68: aload_3
        69: invokeinterface #100,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
        74: aload_2
        75: ifnull        84
        78: aload_2
        79: invokeinterface #101,  1          // InterfaceMethod java/sql/Connection.close:()V
        84: lload         5
        86: lreturn
        87: aload         4
        89: ifnull        131
        92: aload         4
        94: invokeinterface #91,  1           // InterfaceMethod java/sql/ResultSet.close:()V
        99: goto          131
       102: astore        5
       104: aload         4
       106: ifnull        128
       109: aload         4
       111: invokeinterface #91,  1           // InterfaceMethod java/sql/ResultSet.close:()V
       116: goto          128
       119: astore        6
       121: aload         5
       123: aload         6
       125: invokevirtual #96                 // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       128: aload         5
       130: athrow
       131: aload_3
       132: ifnull        171
       135: aload_3
       136: invokeinterface #100,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       141: goto          171
       144: astore        4
       146: aload_3
       147: ifnull        168
       150: aload_3
       151: invokeinterface #100,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       156: goto          168
       159: astore        5
       161: aload         4
       163: aload         5
       165: invokevirtual #96                 // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       168: aload         4
       170: athrow
       171: aload_2
       172: ifnull        208
       175: aload_2
       176: invokeinterface #101,  1          // InterfaceMethod java/sql/Connection.close:()V
       181: goto          208
       184: astore_3
       185: aload_2
       186: ifnull        206
       189: aload_2
       190: invokeinterface #101,  1          // InterfaceMethod java/sql/Connection.close:()V
       195: goto          206
       198: astore        4
       200: aload_3
       201: aload         4
       203: invokevirtual #96                 // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       206: aload_3
       207: athrow
       208: goto          228
       211: astore_2
       212: getstatic     #104                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       215: aload_2
       216: invokevirtual #338                // Method java/lang/Exception.getMessage:()Ljava/lang/String;
       219: invokedynamic #355,  0            // InvokeDynamic #3:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       224: aload_2
       225: invokevirtual #344                // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
       228: lconst_0
       229: lreturn
      Exception table:
         from    to  target type
            30    52   102   Class java/lang/Throwable
           109   116   119   Class java/lang/Throwable
            14    64   144   Class java/lang/Throwable
            87   131   144   Class java/lang/Throwable
           150   156   159   Class java/lang/Throwable
             4    74   184   Class java/lang/Throwable
            87   171   184   Class java/lang/Throwable
           189   195   198   Class java/lang/Throwable
             0    84   211   Class java/lang/Exception
            87   208   211   Class java/lang/Exception
      LineNumberTable:
        line 272: 0
        line 273: 4
        line 274: 14
        line 275: 22
        line 276: 30
        line 277: 40
        line 279: 52
        line 280: 64
        line 277: 84
        line 279: 87
        line 275: 102
        line 280: 131
        line 272: 144
        line 280: 171
        line 272: 184
        line 282: 208
        line 280: 211
        line 281: 212
        line 283: 228
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           30     101     4    rs   Ljava/sql/ResultSet;
           14     157     3    ps   Ljava/sql/PreparedStatement;
            4     204     2   con   Ljava/sql/Connection;
          212      16     2     e   Ljava/lang/Exception;
            0     230     0  this   Lext/mods/gameserver/model/entity/autofarm/AutoFarmData;
            0     230     1 objectId   I
      StackMapTable: number_of_entries = 18
        frame_type = 255 /* full_frame */
          offset_delta = 64
          locals = [ class ext/mods/gameserver/model/entity/autofarm/AutoFarmData, int, class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/ResultSet, long ]
          stack = []
        frame_type = 9 /* same */
        frame_type = 9 /* same */
        frame_type = 250 /* chop */
          offset_delta = 2
        frame_type = 78 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/model/entity/autofarm/AutoFarmData, int, class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/ResultSet, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 14
          locals = [ class ext/mods/gameserver/model/entity/autofarm/AutoFarmData, int, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/model/entity/autofarm/AutoFarmData, int, class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 7 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 16 /* same */

  public static final ext.mods.gameserver.model.entity.autofarm.AutoFarmData getInstance();
    descriptor: ()Lext/mods/gameserver/model/entity/autofarm/AutoFarmData;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #356                // Field ext/mods/gameserver/model/entity/autofarm/AutoFarmData$SingletonHolder.INSTANCE:Lext/mods/gameserver/model/entity/autofarm/AutoFarmData;
         3: areturn
      LineNumberTable:
        line 288: 0

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=3, locals=0, args_size=0
         0: new           #115                // class ext/mods/commons/logging/CLogger
         3: dup
         4: ldc           #47                 // class ext/mods/gameserver/model/entity/autofarm/AutoFarmManager
         6: invokevirtual #364                // Method java/lang/Class.getName:()Ljava/lang/String;
         9: invokespecial #367                // Method ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
        12: putstatic     #104                // Field LOGGER:Lext/mods/commons/logging/CLogger;
        15: return
      LineNumberTable:
        line 39: 0
}
SourceFile: "AutoFarmData.java"
NestMembers:
  ext/mods/gameserver/model/entity/autofarm/AutoFarmData$SingletonHolder
BootstrapMethods:
  0: #465 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #449 (Ljava/lang/Object;)Ljava/lang/Object;
      #451 REF_invokeVirtual ext/mods/gameserver/model/zone/type/subtype/ZoneType.getId:()I
      #455 (Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;)Ljava/lang/Integer;
  1: #465 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #449 (Ljava/lang/Object;)Ljava/lang/Object;
      #457 REF_invokeStatic ext/mods/gameserver/model/entity/autofarm/AutoFarmData.lambda$restoreAreas$0:(Ljava/lang/Integer;)Ljava/lang/String;
      #460 (Ljava/lang/Integer;)Ljava/lang/String;
  2: #472 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #461 Erro ao salvar tempo de autofarm: \u0001
  3: #472 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #463 Erro ao carregar tempo de autofarm: \u0001
InnerClasses:
  public static #479= #148 of #63;        // Entry=class java/util/Map$Entry of class java/util/Map
  public static final #480= #177 of #47;  // AutoFarmType=class ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType of class ext/mods/gameserver/model/entity/autofarm/AutoFarmManager
  public static final #486= #482 of #484; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
