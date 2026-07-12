// Bytecode for: ext.mods.dungeon.DungeonManager
// File: ext\mods\dungeon\DungeonManager.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/dungeon/DungeonManager.class
  Last modified 9 de jul de 2026; size 10637 bytes
  MD5 checksum 84bbdbb5daab43b13a928d79a6de1225
  Compiled from "DungeonManager.java"
public class ext.mods.dungeon.DungeonManager
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #11                         // ext/mods/dungeon/DungeonManager
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 2, methods: 13, attributes: 4
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Class              #8            // java/util/concurrent/CopyOnWriteArrayList
    #8 = Utf8               java/util/concurrent/CopyOnWriteArrayList
    #9 = Methodref          #7.#3         // java/util/concurrent/CopyOnWriteArrayList."<init>":()V
   #10 = Fieldref           #11.#12       // ext/mods/dungeon/DungeonManager.running:Ljava/util/List;
   #11 = Class              #13           // ext/mods/dungeon/DungeonManager
   #12 = NameAndType        #14:#15       // running:Ljava/util/List;
   #13 = Utf8               ext/mods/dungeon/DungeonManager
   #14 = Utf8               running
   #15 = Utf8               Ljava/util/List;
   #16 = Methodref          #17.#18       // ext/mods/util/Tokenizer.getAsInteger:(II)I
   #17 = Class              #19           // ext/mods/util/Tokenizer
   #18 = NameAndType        #20:#21       // getAsInteger:(II)I
   #19 = Utf8               ext/mods/util/Tokenizer
   #20 = Utf8               getAsInteger
   #21 = Utf8               (II)I
   #22 = Methodref          #11.#23       // ext/mods/dungeon/DungeonManager.isPlayerEligibleForDungeon:(Lext/mods/gameserver/model/actor/Player;I)Z
   #23 = NameAndType        #24:#25       // isPlayerEligibleForDungeon:(Lext/mods/gameserver/model/actor/Player;I)Z
   #24 = Utf8               isPlayerEligibleForDungeon
   #25 = Utf8               (Lext/mods/gameserver/model/actor/Player;I)Z
   #26 = Methodref          #11.#27       // ext/mods/dungeon/DungeonManager.enterDungeon:(ILext/mods/gameserver/model/actor/Player;)V
   #27 = NameAndType        #28:#29       // enterDungeon:(ILext/mods/gameserver/model/actor/Player;)V
   #28 = Utf8               enterDungeon
   #29 = Utf8               (ILext/mods/gameserver/model/actor/Player;)V
   #30 = Methodref          #31.#32       // ext/mods/gameserver/model/actor/Player.getObjectId:()I
   #31 = Class              #33           // ext/mods/gameserver/model/actor/Player
   #32 = NameAndType        #34:#35       // getObjectId:()I
   #33 = Utf8               ext/mods/gameserver/model/actor/Player
   #34 = Utf8               getObjectId
   #35 = Utf8               ()I
   #36 = Methodref          #11.#37       // ext/mods/dungeon/DungeonManager.getNextJoinTime:(II)J
   #37 = NameAndType        #38:#39       // getNextJoinTime:(II)J
   #38 = Utf8               getNextJoinTime
   #39 = Utf8               (II)J
   #40 = Methodref          #41.#42       // java/lang/System.currentTimeMillis:()J
   #41 = Class              #43           // java/lang/System
   #42 = NameAndType        #44:#45       // currentTimeMillis:()J
   #43 = Utf8               java/lang/System
   #44 = Utf8               currentTimeMillis
   #45 = Utf8               ()J
   #46 = Long               60000l
   #48 = Long               60l
   #50 = Long               1000l
   #52 = String             #53           // You cannot enter this dungeon yet. Remaining time: %d min %d seg
   #53 = Utf8               You cannot enter this dungeon yet. Remaining time: %d min %d seg
   #54 = Methodref          #55.#56       // java/lang/Long.valueOf:(J)Ljava/lang/Long;
   #55 = Class              #57           // java/lang/Long
   #56 = NameAndType        #58:#59       // valueOf:(J)Ljava/lang/Long;
   #57 = Utf8               java/lang/Long
   #58 = Utf8               valueOf
   #59 = Utf8               (J)Ljava/lang/Long;
   #60 = Methodref          #61.#62       // java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
   #61 = Class              #63           // java/lang/String
   #62 = NameAndType        #64:#65       // format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
   #63 = Utf8               java/lang/String
   #64 = Utf8               format
   #65 = Utf8               (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
   #66 = Methodref          #31.#67       // ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
   #67 = NameAndType        #68:#69       // sendMessage:(Ljava/lang/String;)V
   #68 = Utf8               sendMessage
   #69 = Utf8               (Ljava/lang/String;)V
   #70 = Methodref          #71.#72       // ext/mods/dungeon/data/DungeonData.getInstance:()Lext/mods/dungeon/data/DungeonData;
   #71 = Class              #73           // ext/mods/dungeon/data/DungeonData
   #72 = NameAndType        #74:#75       // getInstance:()Lext/mods/dungeon/data/DungeonData;
   #73 = Utf8               ext/mods/dungeon/data/DungeonData
   #74 = Utf8               getInstance
   #75 = Utf8               ()Lext/mods/dungeon/data/DungeonData;
   #76 = Methodref          #71.#77       // ext/mods/dungeon/data/DungeonData.getDungeon:(I)Lext/mods/dungeon/DungeonTemplate;
   #77 = NameAndType        #78:#79       // getDungeon:(I)Lext/mods/dungeon/DungeonTemplate;
   #78 = Utf8               getDungeon
   #79 = Utf8               (I)Lext/mods/dungeon/DungeonTemplate;
   #80 = String             #81           // Invalid dungeon ID.
   #81 = Utf8               Invalid dungeon ID.
   #82 = Fieldref           #83.#84       // ext/mods/dungeon/DungeonTemplate.type:Lext/mods/dungeon/enums/DungeonType;
   #83 = Class              #85           // ext/mods/dungeon/DungeonTemplate
   #84 = NameAndType        #86:#87       // type:Lext/mods/dungeon/enums/DungeonType;
   #85 = Utf8               ext/mods/dungeon/DungeonTemplate
   #86 = Utf8               type
   #87 = Utf8               Lext/mods/dungeon/enums/DungeonType;
   #88 = Fieldref           #89.#90       // ext/mods/dungeon/enums/DungeonType.PARTY:Lext/mods/dungeon/enums/DungeonType;
   #89 = Class              #91           // ext/mods/dungeon/enums/DungeonType
   #90 = NameAndType        #92:#87       // PARTY:Lext/mods/dungeon/enums/DungeonType;
   #91 = Utf8               ext/mods/dungeon/enums/DungeonType
   #92 = Utf8               PARTY
   #93 = Methodref          #31.#94       // ext/mods/gameserver/model/actor/Player.isInParty:()Z
   #94 = NameAndType        #95:#96       // isInParty:()Z
   #95 = Utf8               isInParty
   #96 = Utf8               ()Z
   #97 = String             #98           // This dungeon requires a party.
   #98 = Utf8               This dungeon requires a party.
   #99 = Methodref          #31.#100      // ext/mods/gameserver/model/actor/Player.getParty:()Lext/mods/gameserver/model/group/Party;
  #100 = NameAndType        #101:#102     // getParty:()Lext/mods/gameserver/model/group/Party;
  #101 = Utf8               getParty
  #102 = Utf8               ()Lext/mods/gameserver/model/group/Party;
  #103 = Methodref          #104.#105     // ext/mods/gameserver/model/group/Party.isLeader:(Lext/mods/gameserver/model/actor/Player;)Z
  #104 = Class              #106          // ext/mods/gameserver/model/group/Party
  #105 = NameAndType        #107:#108     // isLeader:(Lext/mods/gameserver/model/actor/Player;)Z
  #106 = Utf8               ext/mods/gameserver/model/group/Party
  #107 = Utf8               isLeader
  #108 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Z
  #109 = String             #110          // Only the party leader can enter this dungeon.
  #110 = Utf8               Only the party leader can enter this dungeon.
  #111 = Methodref          #104.#112     // ext/mods/gameserver/model/group/Party.getMembers:()Ljava/util/List;
  #112 = NameAndType        #113:#114     // getMembers:()Ljava/util/List;
  #113 = Utf8               getMembers
  #114 = Utf8               ()Ljava/util/List;
  #115 = InterfaceMethodref #116.#117     // java/util/List.iterator:()Ljava/util/Iterator;
  #116 = Class              #118          // java/util/List
  #117 = NameAndType        #119:#120     // iterator:()Ljava/util/Iterator;
  #118 = Utf8               java/util/List
  #119 = Utf8               iterator
  #120 = Utf8               ()Ljava/util/Iterator;
  #121 = InterfaceMethodref #122.#123     // java/util/Iterator.hasNext:()Z
  #122 = Class              #124          // java/util/Iterator
  #123 = NameAndType        #125:#96      // hasNext:()Z
  #124 = Utf8               java/util/Iterator
  #125 = Utf8               hasNext
  #126 = InterfaceMethodref #122.#127     // java/util/Iterator.next:()Ljava/lang/Object;
  #127 = NameAndType        #128:#129     // next:()Ljava/lang/Object;
  #128 = Utf8               next
  #129 = Utf8               ()Ljava/lang/Object;
  #130 = Methodref          #31.#131      // ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
  #131 = NameAndType        #132:#133     // getName:()Ljava/lang/String;
  #132 = Utf8               getName
  #133 = Utf8               ()Ljava/lang/String;
  #134 = InvokeDynamic      #0:#135       // #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #135 = NameAndType        #136:#137     // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #136 = Utf8               makeConcatWithConstants
  #137 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
  #138 = InterfaceMethodref #116.#139     // java/util/List.add:(Ljava/lang/Object;)Z
  #139 = NameAndType        #140:#141     // add:(Ljava/lang/Object;)Z
  #140 = Utf8               add
  #141 = Utf8               (Ljava/lang/Object;)Z
  #142 = String             #143          // This dungeon is solo. Leave your party to enter.
  #143 = Utf8               This dungeon is solo. Leave your party to enter.
  #144 = Fieldref           #83.#145      // ext/mods/dungeon/DungeonTemplate.id:I
  #145 = NameAndType        #146:#147     // id:I
  #146 = Utf8               id
  #147 = Utf8               I
  #148 = Class              #149          // ext/mods/dungeon/Dungeon
  #149 = Utf8               ext/mods/dungeon/Dungeon
  #150 = Methodref          #148.#151     // ext/mods/dungeon/Dungeon."<init>":(Lext/mods/dungeon/DungeonTemplate;Ljava/util/List;)V
  #151 = NameAndType        #5:#152       // "<init>":(Lext/mods/dungeon/DungeonTemplate;Ljava/util/List;)V
  #152 = Utf8               (Lext/mods/dungeon/DungeonTemplate;Ljava/util/List;)V
  #153 = Fieldref           #83.#154      // ext/mods/dungeon/DungeonTemplate.cooldown:J
  #154 = NameAndType        #155:#156     // cooldown:J
  #155 = Utf8               cooldown
  #156 = Utf8               J
  #157 = Methodref          #31.#158      // ext/mods/gameserver/model/actor/Player.getClient:()Lext/mods/gameserver/network/GameClient;
  #158 = NameAndType        #159:#160     // getClient:()Lext/mods/gameserver/network/GameClient;
  #159 = Utf8               getClient
  #160 = Utf8               ()Lext/mods/gameserver/network/GameClient;
  #161 = Methodref          #162.#163     // ext/mods/gameserver/network/GameClient.getConnection:()Lext/mods/commons/mmocore/MMOConnection;
  #162 = Class              #164          // ext/mods/gameserver/network/GameClient
  #163 = NameAndType        #165:#166     // getConnection:()Lext/mods/commons/mmocore/MMOConnection;
  #164 = Utf8               ext/mods/gameserver/network/GameClient
  #165 = Utf8               getConnection
  #166 = Utf8               ()Lext/mods/commons/mmocore/MMOConnection;
  #167 = Methodref          #168.#169     // ext/mods/commons/mmocore/MMOConnection.getInetAddress:()Ljava/net/InetAddress;
  #168 = Class              #170          // ext/mods/commons/mmocore/MMOConnection
  #169 = NameAndType        #171:#172     // getInetAddress:()Ljava/net/InetAddress;
  #170 = Utf8               ext/mods/commons/mmocore/MMOConnection
  #171 = Utf8               getInetAddress
  #172 = Utf8               ()Ljava/net/InetAddress;
  #173 = Methodref          #174.#175     // java/net/InetAddress.getHostAddress:()Ljava/lang/String;
  #174 = Class              #176          // java/net/InetAddress
  #175 = NameAndType        #177:#133     // getHostAddress:()Ljava/lang/String;
  #176 = Utf8               java/net/InetAddress
  #177 = Utf8               getHostAddress
  #178 = Methodref          #11.#179      // ext/mods/dungeon/DungeonManager.savePlayerCooldown:(IIJJLjava/lang/String;I)V
  #179 = NameAndType        #180:#181     // savePlayerCooldown:(IIJJLjava/lang/String;I)V
  #180 = Utf8               savePlayerCooldown
  #181 = Utf8               (IIJJLjava/lang/String;I)V
  #182 = Methodref          #183.#184     // ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
  #183 = Class              #185          // ext/mods/commons/pool/ConnectionPool
  #184 = NameAndType        #165:#186     // getConnection:()Ljava/sql/Connection;
  #185 = Utf8               ext/mods/commons/pool/ConnectionPool
  #186 = Utf8               ()Ljava/sql/Connection;
  #187 = String             #188          // SELECT next_join FROM dungeon_cooldowns WHERE dungeon_id = ? AND player_id = ?
  #188 = Utf8               SELECT next_join FROM dungeon_cooldowns WHERE dungeon_id = ? AND player_id = ?
  #189 = InterfaceMethodref #190.#191     // java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
  #190 = Class              #192          // java/sql/Connection
  #191 = NameAndType        #193:#194     // prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
  #192 = Utf8               java/sql/Connection
  #193 = Utf8               prepareStatement
  #194 = Utf8               (Ljava/lang/String;)Ljava/sql/PreparedStatement;
  #195 = InterfaceMethodref #196.#197     // java/sql/PreparedStatement.setInt:(II)V
  #196 = Class              #198          // java/sql/PreparedStatement
  #197 = NameAndType        #199:#200     // setInt:(II)V
  #198 = Utf8               java/sql/PreparedStatement
  #199 = Utf8               setInt
  #200 = Utf8               (II)V
  #201 = InterfaceMethodref #196.#202     // java/sql/PreparedStatement.executeQuery:()Ljava/sql/ResultSet;
  #202 = NameAndType        #203:#204     // executeQuery:()Ljava/sql/ResultSet;
  #203 = Utf8               executeQuery
  #204 = Utf8               ()Ljava/sql/ResultSet;
  #205 = InterfaceMethodref #206.#207     // java/sql/ResultSet.next:()Z
  #206 = Class              #208          // java/sql/ResultSet
  #207 = NameAndType        #128:#96      // next:()Z
  #208 = Utf8               java/sql/ResultSet
  #209 = String             #210          // next_join
  #210 = Utf8               next_join
  #211 = InterfaceMethodref #206.#212     // java/sql/ResultSet.getLong:(Ljava/lang/String;)J
  #212 = NameAndType        #213:#214     // getLong:(Ljava/lang/String;)J
  #213 = Utf8               getLong
  #214 = Utf8               (Ljava/lang/String;)J
  #215 = InterfaceMethodref #206.#216     // java/sql/ResultSet.close:()V
  #216 = NameAndType        #217:#6       // close:()V
  #217 = Utf8               close
  #218 = InterfaceMethodref #196.#216     // java/sql/PreparedStatement.close:()V
  #219 = InterfaceMethodref #190.#216     // java/sql/Connection.close:()V
  #220 = Class              #221          // java/lang/Throwable
  #221 = Utf8               java/lang/Throwable
  #222 = Methodref          #220.#223     // java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
  #223 = NameAndType        #224:#225     // addSuppressed:(Ljava/lang/Throwable;)V
  #224 = Utf8               addSuppressed
  #225 = Utf8               (Ljava/lang/Throwable;)V
  #226 = Class              #227          // java/lang/Exception
  #227 = Utf8               java/lang/Exception
  #228 = Fieldref           #11.#229      // ext/mods/dungeon/DungeonManager.log:Ljava/util/logging/Logger;
  #229 = NameAndType        #230:#231     // log:Ljava/util/logging/Logger;
  #230 = Utf8               log
  #231 = Utf8               Ljava/util/logging/Logger;
  #232 = Methodref          #226.#233     // java/lang/Exception.getMessage:()Ljava/lang/String;
  #233 = NameAndType        #234:#133     // getMessage:()Ljava/lang/String;
  #234 = Utf8               getMessage
  #235 = InvokeDynamic      #1:#135       // #1:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #236 = Methodref          #237.#238     // java/util/logging/Logger.severe:(Ljava/lang/String;)V
  #237 = Class              #239          // java/util/logging/Logger
  #238 = NameAndType        #240:#69      // severe:(Ljava/lang/String;)V
  #239 = Utf8               java/util/logging/Logger
  #240 = Utf8               severe
  #241 = Methodref          #226.#242     // java/lang/Exception.printStackTrace:()V
  #242 = NameAndType        #243:#6       // printStackTrace:()V
  #243 = Utf8               printStackTrace
  #244 = InterfaceMethodref #116.#245     // java/util/List.remove:(Ljava/lang/Object;)Z
  #245 = NameAndType        #246:#141     // remove:(Ljava/lang/Object;)Z
  #246 = Utf8               remove
  #247 = Methodref          #11.#248      // ext/mods/dungeon/DungeonManager.isInDungeon:(Lext/mods/gameserver/model/actor/Player;)Z
  #248 = NameAndType        #249:#108     // isInDungeon:(Lext/mods/gameserver/model/actor/Player;)Z
  #249 = Utf8               isInDungeon
  #250 = Methodref          #31.#251      // ext/mods/gameserver/model/actor/Player.isInOlympiadMode:()Z
  #251 = NameAndType        #252:#96      // isInOlympiadMode:()Z
  #252 = Utf8               isInOlympiadMode
  #253 = Methodref          #11.#254      // ext/mods/dungeon/DungeonManager.getPlayerSavedStage:(II)I
  #254 = NameAndType        #255:#21      // getPlayerSavedStage:(II)I
  #255 = Utf8               getPlayerSavedStage
  #256 = Fieldref           #83.#257      // ext/mods/dungeon/DungeonTemplate.stages:Ljava/util/List;
  #257 = NameAndType        #258:#15      // stages:Ljava/util/List;
  #258 = Utf8               stages
  #259 = InterfaceMethodref #116.#260     // java/util/List.size:()I
  #260 = NameAndType        #261:#35      // size:()I
  #261 = Utf8               size
  #262 = InterfaceMethodref #116.#263     // java/util/List.stream:()Ljava/util/stream/Stream;
  #263 = NameAndType        #264:#265     // stream:()Ljava/util/stream/Stream;
  #264 = Utf8               stream
  #265 = Utf8               ()Ljava/util/stream/Stream;
  #266 = InvokeDynamic      #2:#267       // #2:test:(Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/Predicate;
  #267 = NameAndType        #268:#269     // test:(Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/Predicate;
  #268 = Utf8               test
  #269 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/Predicate;
  #270 = InterfaceMethodref #271.#272     // java/util/stream/Stream.anyMatch:(Ljava/util/function/Predicate;)Z
  #271 = Class              #273          // java/util/stream/Stream
  #272 = NameAndType        #274:#275     // anyMatch:(Ljava/util/function/Predicate;)Z
  #273 = Utf8               java/util/stream/Stream
  #274 = Utf8               anyMatch
  #275 = Utf8               (Ljava/util/function/Predicate;)Z
  #276 = String             #277          // UPDATE dungeon_cooldowns SET stage = ? WHERE dungeon_id = ? AND player_id = ?
  #277 = Utf8               UPDATE dungeon_cooldowns SET stage = ? WHERE dungeon_id = ? AND player_id = ?
  #278 = InterfaceMethodref #196.#279     // java/sql/PreparedStatement.executeUpdate:()I
  #279 = NameAndType        #280:#35      // executeUpdate:()I
  #280 = Utf8               executeUpdate
  #281 = InvokeDynamic      #3:#135       // #3:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #282 = String             #283          // INSERT INTO dungeon_cooldowns (dungeon_id, player_id, last_join, next_join, ip_address, stage) VALUES (?, ?, ?, ?, ?, ?) ON DUPLICATE KEY UPDATE last_join = VALUES(last_join), next_join = VALUES(next_join), ip_address = VALUES(ip_address), stage = VALUES(stage)
  #283 = Utf8               INSERT INTO dungeon_cooldowns (dungeon_id, player_id, last_join, next_join, ip_address, stage) VALUES (?, ?, ?, ?, ?, ?) ON DUPLICATE KEY UPDATE last_join = VALUES(last_join), next_join = VALUES(next_join), ip_address = VALUES(ip_address), stage = VALUES(stage)
  #284 = InterfaceMethodref #196.#285     // java/sql/PreparedStatement.setLong:(IJ)V
  #285 = NameAndType        #286:#287     // setLong:(IJ)V
  #286 = Utf8               setLong
  #287 = Utf8               (IJ)V
  #288 = InterfaceMethodref #196.#289     // java/sql/PreparedStatement.setString:(ILjava/lang/String;)V
  #289 = NameAndType        #290:#291     // setString:(ILjava/lang/String;)V
  #290 = Utf8               setString
  #291 = Utf8               (ILjava/lang/String;)V
  #292 = InvokeDynamic      #4:#135       // #4:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #293 = String             #294          // SELECT stage FROM dungeon_cooldowns WHERE dungeon_id = ? AND player_id = ?
  #294 = Utf8               SELECT stage FROM dungeon_cooldowns WHERE dungeon_id = ? AND player_id = ?
  #295 = String             #296          // stage
  #296 = Utf8               stage
  #297 = InterfaceMethodref #206.#298     // java/sql/ResultSet.getInt:(Ljava/lang/String;)I
  #298 = NameAndType        #299:#300     // getInt:(Ljava/lang/String;)I
  #299 = Utf8               getInt
  #300 = Utf8               (Ljava/lang/String;)I
  #301 = InvokeDynamic      #5:#135       // #5:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #302 = Fieldref           #303.#304     // ext/mods/dungeon/DungeonManager$SingletonHolder.instance:Lext/mods/dungeon/DungeonManager;
  #303 = Class              #305          // ext/mods/dungeon/DungeonManager$SingletonHolder
  #304 = NameAndType        #306:#307     // instance:Lext/mods/dungeon/DungeonManager;
  #305 = Utf8               ext/mods/dungeon/DungeonManager$SingletonHolder
  #306 = Utf8               instance
  #307 = Utf8               Lext/mods/dungeon/DungeonManager;
  #308 = Methodref          #148.#309     // ext/mods/dungeon/Dungeon.getPlayers:()Ljava/util/List;
  #309 = NameAndType        #310:#114     // getPlayers:()Ljava/util/List;
  #310 = Utf8               getPlayers
  #311 = InterfaceMethodref #116.#312     // java/util/List.contains:(Ljava/lang/Object;)Z
  #312 = NameAndType        #313:#141     // contains:(Ljava/lang/Object;)Z
  #313 = Utf8               contains
  #314 = Methodref          #315.#131     // java/lang/Class.getName:()Ljava/lang/String;
  #315 = Class              #316          // java/lang/Class
  #316 = Utf8               java/lang/Class
  #317 = Methodref          #237.#318     // java/util/logging/Logger.getLogger:(Ljava/lang/String;)Ljava/util/logging/Logger;
  #318 = NameAndType        #319:#320     // getLogger:(Ljava/lang/String;)Ljava/util/logging/Logger;
  #319 = Utf8               getLogger
  #320 = Utf8               (Ljava/lang/String;)Ljava/util/logging/Logger;
  #321 = Utf8               Signature
  #322 = Utf8               Ljava/util/List<Lext/mods/dungeon/Dungeon;>;
  #323 = Utf8               Code
  #324 = Utf8               LineNumberTable
  #325 = Utf8               LocalVariableTable
  #326 = Utf8               this
  #327 = Utf8               handleEnterDungeonId
  #328 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/util/Tokenizer;)V
  #329 = Utf8               remainingTime
  #330 = Utf8               minutes
  #331 = Utf8               seconds
  #332 = Utf8               currentTime
  #333 = Utf8               playerId
  #334 = Utf8               nextJoin
  #335 = Utf8               player
  #336 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #337 = Utf8               tokenizer
  #338 = Utf8               Lext/mods/util/Tokenizer;
  #339 = Utf8               dungeonId
  #340 = Utf8               StackMapTable
  #341 = Utf8               member
  #342 = Utf8               template
  #343 = Utf8               Lext/mods/dungeon/DungeonTemplate;
  #344 = Utf8               party
  #345 = Utf8               dungeon
  #346 = Utf8               Lext/mods/dungeon/Dungeon;
  #347 = Utf8               LocalVariableTypeTable
  #348 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/actor/Player;>;
  #349 = Utf8               rs
  #350 = Utf8               Ljava/sql/ResultSet;
  #351 = Utf8               ps
  #352 = Utf8               Ljava/sql/PreparedStatement;
  #353 = Utf8               con
  #354 = Utf8               Ljava/sql/Connection;
  #355 = Utf8               e
  #356 = Utf8               Ljava/lang/Exception;
  #357 = Utf8               removeDungeon
  #358 = Utf8               (Lext/mods/dungeon/Dungeon;)V
  #359 = Utf8               savedStage
  #360 = Utf8               updateStage
  #361 = Utf8               (III)V
  #362 = Utf8               lastJoin
  #363 = Utf8               cooldownMillis
  #364 = Utf8               ipAddress
  #365 = Utf8               Ljava/lang/String;
  #366 = Utf8               ()Lext/mods/dungeon/DungeonManager;
  #367 = Utf8               lambda$isInDungeon$0
  #368 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/dungeon/Dungeon;)Z
  #369 = Utf8               <clinit>
  #370 = Utf8               SourceFile
  #371 = Utf8               DungeonManager.java
  #372 = Utf8               NestMembers
  #373 = Utf8               BootstrapMethods
  #374 = String             #375          // \u0001 is not eligible for the dungeon.
  #375 = Utf8               \u0001 is not eligible for the dungeon.
  #376 = String             #377          // DungeonManager: Error retrieving next join time: \u0001
  #377 = Utf8               DungeonManager: Error retrieving next join time: \u0001
  #378 = MethodType         #141          //  (Ljava/lang/Object;)Z
  #379 = MethodHandle       6:#380        // REF_invokeStatic ext/mods/dungeon/DungeonManager.lambda$isInDungeon$0:(Lext/mods/gameserver/model/actor/Player;Lext/mods/dungeon/Dungeon;)Z
  #380 = Methodref          #11.#381      // ext/mods/dungeon/DungeonManager.lambda$isInDungeon$0:(Lext/mods/gameserver/model/actor/Player;Lext/mods/dungeon/Dungeon;)Z
  #381 = NameAndType        #367:#368     // lambda$isInDungeon$0:(Lext/mods/gameserver/model/actor/Player;Lext/mods/dungeon/Dungeon;)Z
  #382 = MethodType         #383          //  (Lext/mods/dungeon/Dungeon;)Z
  #383 = Utf8               (Lext/mods/dungeon/Dungeon;)Z
  #384 = String             #385          // DungeonManager: Failed to update stage: \u0001
  #385 = Utf8               DungeonManager: Failed to update stage: \u0001
  #386 = String             #387          // SystemDungeonManager: Error saving cooldown: \u0001
  #387 = Utf8               SystemDungeonManager: Error saving cooldown: \u0001
  #388 = String             #389          // DungeonManager: Error retrieving saved stage: \u0001
  #389 = Utf8               DungeonManager: Error retrieving saved stage: \u0001
  #390 = MethodHandle       6:#391        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #391 = Methodref          #392.#393     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #392 = Class              #394          // java/lang/invoke/StringConcatFactory
  #393 = NameAndType        #136:#395     // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #394 = Utf8               java/lang/invoke/StringConcatFactory
  #395 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #396 = MethodHandle       6:#397        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #397 = Methodref          #398.#399     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #398 = Class              #400          // java/lang/invoke/LambdaMetafactory
  #399 = NameAndType        #401:#402     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #400 = Utf8               java/lang/invoke/LambdaMetafactory
  #401 = Utf8               metafactory
  #402 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #403 = Utf8               InnerClasses
  #404 = Utf8               SingletonHolder
  #405 = Class              #406          // java/lang/invoke/MethodHandles$Lookup
  #406 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #407 = Class              #408          // java/lang/invoke/MethodHandles
  #408 = Utf8               java/lang/invoke/MethodHandles
  #409 = Utf8               Lookup
{
  public ext.mods.dungeon.DungeonManager();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: new           #7                  // class java/util/concurrent/CopyOnWriteArrayList
         8: dup
         9: invokespecial #9                  // Method java/util/concurrent/CopyOnWriteArrayList."<init>":()V
        12: putfield      #10                 // Field running:Ljava/util/List;
        15: return
      LineNumberTable:
        line 35: 0
        line 39: 4
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      16     0  this   Lext/mods/dungeon/DungeonManager;

  public void handleEnterDungeonId(ext.mods.gameserver.model.actor.Player, ext.mods.util.Tokenizer);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Lext/mods/util/Tokenizer;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=7, locals=15, args_size=3
         0: aload_2
         1: iconst_2
         2: iconst_0
         3: invokevirtual #16                 // Method ext/mods/util/Tokenizer.getAsInteger:(II)I
         6: istore_3
         7: aload_0
         8: aload_1
         9: iload_3
        10: invokevirtual #22                 // Method isPlayerEligibleForDungeon:(Lext/mods/gameserver/model/actor/Player;I)Z
        13: ifeq          25
        16: aload_0
        17: iload_3
        18: aload_1
        19: invokevirtual #26                 // Method enterDungeon:(ILext/mods/gameserver/model/actor/Player;)V
        22: goto          120
        25: aload_1
        26: invokevirtual #30                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        29: istore        4
        31: iload_3
        32: iload         4
        34: invokestatic  #36                 // Method getNextJoinTime:(II)J
        37: lstore        5
        39: lload         5
        41: lconst_0
        42: lcmp
        43: ifle          120
        46: invokestatic  #40                 // Method java/lang/System.currentTimeMillis:()J
        49: lstore        7
        51: lload         7
        53: lload         5
        55: lcmp
        56: ifge          120
        59: lload         5
        61: lload         7
        63: lsub
        64: lstore        9
        66: lload         9
        68: ldc2_w        #46                 // long 60000l
        71: ldiv
        72: ldc2_w        #48                 // long 60l
        75: lrem
        76: lstore        11
        78: lload         9
        80: ldc2_w        #50                 // long 1000l
        83: ldiv
        84: ldc2_w        #48                 // long 60l
        87: lrem
        88: lstore        13
        90: aload_1
        91: ldc           #52                 // String You cannot enter this dungeon yet. Remaining time: %d min %d seg
        93: iconst_2
        94: anewarray     #2                  // class java/lang/Object
        97: dup
        98: iconst_0
        99: lload         11
       101: invokestatic  #54                 // Method java/lang/Long.valueOf:(J)Ljava/lang/Long;
       104: aastore
       105: dup
       106: iconst_1
       107: lload         13
       109: invokestatic  #54                 // Method java/lang/Long.valueOf:(J)Ljava/lang/Long;
       112: aastore
       113: invokestatic  #60                 // Method java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
       116: invokevirtual #66                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       119: return
       120: return
      LineNumberTable:
        line 43: 0
        line 44: 7
        line 46: 16
        line 50: 25
        line 52: 31
        line 54: 39
        line 56: 46
        line 57: 51
        line 59: 59
        line 60: 66
        line 61: 78
        line 62: 90
        line 63: 119
        line 68: 120
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           66      54     9 remainingTime   J
           78      42    11 minutes   J
           90      30    13 seconds   J
           51      69     7 currentTime   J
           31      89     4 playerId   I
           39      81     5 nextJoin   J
            0     121     0  this   Lext/mods/dungeon/DungeonManager;
            0     121     1 player   Lext/mods/gameserver/model/actor/Player;
            0     121     2 tokenizer   Lext/mods/util/Tokenizer;
            7     114     3 dungeonId   I
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 25
          locals = [ int ]
        frame_type = 251 /* same_frame_extended */
          offset_delta = 94

  public synchronized void removeDungeon(ext.mods.dungeon.Dungeon);
    descriptor: (Lext/mods/dungeon/Dungeon;)V
    flags: (0x0021) ACC_PUBLIC, ACC_SYNCHRONIZED
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #10                 // Field running:Ljava/util/List;
         4: aload_1
         5: invokeinterface #244,  2          // InterfaceMethod java/util/List.remove:(Ljava/lang/Object;)Z
        10: pop
        11: return
      LineNumberTable:
        line 168: 0
        line 170: 11
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/dungeon/DungeonManager;
            0      12     1 dungeon   Lext/mods/dungeon/Dungeon;

  public boolean isInDungeon(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #10                 // Field running:Ljava/util/List;
         4: invokeinterface #262,  1          // InterfaceMethod java/util/List.stream:()Ljava/util/stream/Stream;
         9: aload_1
        10: invokedynamic #266,  0            // InvokeDynamic #2:test:(Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/Predicate;
        15: invokeinterface #270,  2          // InterfaceMethod java/util/stream/Stream.anyMatch:(Ljava/util/function/Predicate;)Z
        20: ireturn
      LineNumberTable:
        line 191: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      21     0  this   Lext/mods/dungeon/DungeonManager;
            0      21     1 player   Lext/mods/gameserver/model/actor/Player;

  public void updateStage(int, int, int);
    descriptor: (III)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=8, args_size=4
         0: invokestatic  #182                // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
         3: astore        4
         5: aload         4
         7: ldc_w         #276                // String UPDATE dungeon_cooldowns SET stage = ? WHERE dungeon_id = ? AND player_id = ?
        10: invokeinterface #189,  2          // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        15: astore        5
        17: aload         5
        19: iconst_1
        20: iload_3
        21: invokeinterface #195,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        26: aload         5
        28: iconst_2
        29: iload_1
        30: invokeinterface #195,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        35: aload         5
        37: iconst_3
        38: iload_2
        39: invokeinterface #195,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        44: aload         5
        46: invokeinterface #278,  1          // InterfaceMethod java/sql/PreparedStatement.executeUpdate:()I
        51: pop
        52: aload         5
        54: ifnull        96
        57: aload         5
        59: invokeinterface #218,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
        64: goto          96
        67: astore        6
        69: aload         5
        71: ifnull        93
        74: aload         5
        76: invokeinterface #218,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
        81: goto          93
        84: astore        7
        86: aload         6
        88: aload         7
        90: invokevirtual #222                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        93: aload         6
        95: athrow
        96: aload         4
        98: ifnull        140
       101: aload         4
       103: invokeinterface #219,  1          // InterfaceMethod java/sql/Connection.close:()V
       108: goto          140
       111: astore        5
       113: aload         4
       115: ifnull        137
       118: aload         4
       120: invokeinterface #219,  1          // InterfaceMethod java/sql/Connection.close:()V
       125: goto          137
       128: astore        6
       130: aload         5
       132: aload         6
       134: invokevirtual #222                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       137: aload         5
       139: athrow
       140: goto          166
       143: astore        4
       145: getstatic     #228                // Field log:Ljava/util/logging/Logger;
       148: aload         4
       150: invokevirtual #232                // Method java/lang/Exception.getMessage:()Ljava/lang/String;
       153: invokedynamic #281,  0            // InvokeDynamic #3:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       158: invokevirtual #236                // Method java/util/logging/Logger.severe:(Ljava/lang/String;)V
       161: aload         4
       163: invokevirtual #241                // Method java/lang/Exception.printStackTrace:()V
       166: return
      Exception table:
         from    to  target type
            17    52    67   Class java/lang/Throwable
            74    81    84   Class java/lang/Throwable
             5    96   111   Class java/lang/Throwable
           118   125   128   Class java/lang/Throwable
             0   140   143   Class java/lang/Exception
      LineNumberTable:
        line 196: 0
        line 197: 5
        line 199: 17
        line 200: 26
        line 201: 35
        line 202: 44
        line 203: 52
        line 196: 67
        line 203: 96
        line 196: 111
        line 208: 140
        line 204: 143
        line 206: 145
        line 207: 161
        line 209: 166
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           17      79     5    ps   Ljava/sql/PreparedStatement;
            5     135     4   con   Ljava/sql/Connection;
          145      21     4     e   Ljava/lang/Exception;
            0     167     0  this   Lext/mods/dungeon/DungeonManager;
            0     167     1 dungeonId   I
            0     167     2 playerId   I
            0     167     3 stage   I
      StackMapTable: number_of_entries = 10
        frame_type = 255 /* full_frame */
          offset_delta = 67
          locals = [ class ext/mods/dungeon/DungeonManager, int, int, int, class java/sql/Connection, class java/sql/PreparedStatement ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/dungeon/DungeonManager, int, int, int, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 78 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/dungeon/DungeonManager, int, int, int, class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 22 /* same */

  public void savePlayerCooldown(int, int, long, long, java.lang.String, int);
    descriptor: (IIJJLjava/lang/String;I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=13, args_size=7
         0: invokestatic  #182                // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
         3: astore        9
         5: aload         9
         7: ldc_w         #282                // String INSERT INTO dungeon_cooldowns (dungeon_id, player_id, last_join, next_join, ip_address, stage) VALUES (?, ?, ?, ?, ?, ?) ON DUPLICATE KEY UPDATE last_join = VALUES(last_join), next_join = VALUES(next_join), ip_address = VALUES(ip_address), stage = VALUES(stage)
        10: invokeinterface #189,  2          // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        15: astore        10
        17: lload_3
        18: lload         5
        20: ladd
        21: lstore        11
        23: aload         10
        25: iconst_1
        26: iload_1
        27: invokeinterface #195,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        32: aload         10
        34: iconst_2
        35: iload_2
        36: invokeinterface #195,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        41: aload         10
        43: iconst_3
        44: lload_3
        45: invokeinterface #284,  4          // InterfaceMethod java/sql/PreparedStatement.setLong:(IJ)V
        50: aload         10
        52: iconst_4
        53: lload         11
        55: invokeinterface #284,  4          // InterfaceMethod java/sql/PreparedStatement.setLong:(IJ)V
        60: aload         10
        62: iconst_5
        63: aload         7
        65: invokeinterface #288,  3          // InterfaceMethod java/sql/PreparedStatement.setString:(ILjava/lang/String;)V
        70: aload         10
        72: bipush        6
        74: iload         8
        76: invokeinterface #195,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        81: aload         10
        83: invokeinterface #278,  1          // InterfaceMethod java/sql/PreparedStatement.executeUpdate:()I
        88: pop
        89: aload         10
        91: ifnull        133
        94: aload         10
        96: invokeinterface #218,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       101: goto          133
       104: astore        11
       106: aload         10
       108: ifnull        130
       111: aload         10
       113: invokeinterface #218,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       118: goto          130
       121: astore        12
       123: aload         11
       125: aload         12
       127: invokevirtual #222                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       130: aload         11
       132: athrow
       133: aload         9
       135: ifnull        177
       138: aload         9
       140: invokeinterface #219,  1          // InterfaceMethod java/sql/Connection.close:()V
       145: goto          177
       148: astore        10
       150: aload         9
       152: ifnull        174
       155: aload         9
       157: invokeinterface #219,  1          // InterfaceMethod java/sql/Connection.close:()V
       162: goto          174
       165: astore        11
       167: aload         10
       169: aload         11
       171: invokevirtual #222                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       174: aload         10
       176: athrow
       177: goto          203
       180: astore        9
       182: getstatic     #228                // Field log:Ljava/util/logging/Logger;
       185: aload         9
       187: invokevirtual #232                // Method java/lang/Exception.getMessage:()Ljava/lang/String;
       190: invokedynamic #292,  0            // InvokeDynamic #4:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       195: invokevirtual #236                // Method java/util/logging/Logger.severe:(Ljava/lang/String;)V
       198: aload         9
       200: invokevirtual #241                // Method java/lang/Exception.printStackTrace:()V
       203: return
      Exception table:
         from    to  target type
            17    89   104   Class java/lang/Throwable
           111   118   121   Class java/lang/Throwable
             5   133   148   Class java/lang/Throwable
           155   162   165   Class java/lang/Throwable
             0   177   180   Class java/lang/Exception
      LineNumberTable:
        line 213: 0
        line 214: 5
        line 217: 17
        line 218: 23
        line 219: 32
        line 220: 41
        line 221: 50
        line 222: 60
        line 223: 70
        line 225: 81
        line 227: 89
        line 213: 104
        line 227: 133
        line 213: 148
        line 232: 177
        line 228: 180
        line 230: 182
        line 231: 198
        line 233: 203
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           23      66    11 nextJoin   J
           17     116    10    ps   Ljava/sql/PreparedStatement;
            5     172     9   con   Ljava/sql/Connection;
          182      21     9     e   Ljava/lang/Exception;
            0     204     0  this   Lext/mods/dungeon/DungeonManager;
            0     204     1 dungeonId   I
            0     204     2 playerId   I
            0     204     3 lastJoin   J
            0     204     5 cooldownMillis   J
            0     204     7 ipAddress   Ljava/lang/String;
            0     204     8 stage   I
      StackMapTable: number_of_entries = 10
        frame_type = 255 /* full_frame */
          offset_delta = 104
          locals = [ class ext/mods/dungeon/DungeonManager, int, int, long, long, class java/lang/String, int, class java/sql/Connection, class java/sql/PreparedStatement ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/dungeon/DungeonManager, int, int, long, long, class java/lang/String, int, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 78 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/dungeon/DungeonManager, int, int, long, long, class java/lang/String, int, class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 22 /* same */

  public int getPlayerSavedStage(int, int);
    descriptor: (II)I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=8, args_size=3
         0: invokestatic  #182                // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
         3: astore_3
         4: aload_3
         5: ldc_w         #293                // String SELECT stage FROM dungeon_cooldowns WHERE dungeon_id = ? AND player_id = ?
         8: invokeinterface #189,  2          // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        13: astore        4
        15: aload         4
        17: iconst_1
        18: iload_1
        19: invokeinterface #195,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        24: aload         4
        26: iconst_2
        27: iload_2
        28: invokeinterface #195,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        33: aload         4
        35: invokeinterface #201,  1          // InterfaceMethod java/sql/PreparedStatement.executeQuery:()Ljava/sql/ResultSet;
        40: astore        5
        42: aload         5
        44: invokeinterface #205,  1          // InterfaceMethod java/sql/ResultSet.next:()Z
        49: ifeq          101
        52: aload         5
        54: ldc_w         #295                // String stage
        57: invokeinterface #297,  2          // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
        62: istore        6
        64: aload         5
        66: ifnull        76
        69: aload         5
        71: invokeinterface #215,  1          // InterfaceMethod java/sql/ResultSet.close:()V
        76: aload         4
        78: ifnull        88
        81: aload         4
        83: invokeinterface #218,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
        88: aload_3
        89: ifnull        98
        92: aload_3
        93: invokeinterface #219,  1          // InterfaceMethod java/sql/Connection.close:()V
        98: iload         6
       100: ireturn
       101: aload         5
       103: ifnull        145
       106: aload         5
       108: invokeinterface #215,  1          // InterfaceMethod java/sql/ResultSet.close:()V
       113: goto          145
       116: astore        6
       118: aload         5
       120: ifnull        142
       123: aload         5
       125: invokeinterface #215,  1          // InterfaceMethod java/sql/ResultSet.close:()V
       130: goto          142
       133: astore        7
       135: aload         6
       137: aload         7
       139: invokevirtual #222                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       142: aload         6
       144: athrow
       145: aload         4
       147: ifnull        189
       150: aload         4
       152: invokeinterface #218,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       157: goto          189
       160: astore        5
       162: aload         4
       164: ifnull        186
       167: aload         4
       169: invokeinterface #218,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       174: goto          186
       177: astore        6
       179: aload         5
       181: aload         6
       183: invokevirtual #222                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       186: aload         5
       188: athrow
       189: aload_3
       190: ifnull        229
       193: aload_3
       194: invokeinterface #219,  1          // InterfaceMethod java/sql/Connection.close:()V
       199: goto          229
       202: astore        4
       204: aload_3
       205: ifnull        226
       208: aload_3
       209: invokeinterface #219,  1          // InterfaceMethod java/sql/Connection.close:()V
       214: goto          226
       217: astore        5
       219: aload         4
       221: aload         5
       223: invokevirtual #222                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       226: aload         4
       228: athrow
       229: goto          252
       232: astore_3
       233: getstatic     #228                // Field log:Ljava/util/logging/Logger;
       236: aload_3
       237: invokevirtual #232                // Method java/lang/Exception.getMessage:()Ljava/lang/String;
       240: invokedynamic #301,  0            // InvokeDynamic #5:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       245: invokevirtual #236                // Method java/util/logging/Logger.severe:(Ljava/lang/String;)V
       248: aload_3
       249: invokevirtual #241                // Method java/lang/Exception.printStackTrace:()V
       252: iconst_1
       253: ireturn
      Exception table:
         from    to  target type
            42    64   116   Class java/lang/Throwable
           123   130   133   Class java/lang/Throwable
            15    76   160   Class java/lang/Throwable
           101   145   160   Class java/lang/Throwable
           167   174   177   Class java/lang/Throwable
             4    88   202   Class java/lang/Throwable
           101   189   202   Class java/lang/Throwable
           208   214   217   Class java/lang/Throwable
             0    98   232   Class java/lang/Exception
           101   229   232   Class java/lang/Exception
      LineNumberTable:
        line 237: 0
        line 238: 4
        line 240: 15
        line 241: 24
        line 243: 33
        line 245: 42
        line 247: 52
        line 249: 64
        line 250: 76
        line 247: 98
        line 249: 101
        line 243: 116
        line 250: 145
        line 237: 160
        line 250: 189
        line 237: 202
        line 255: 229
        line 251: 232
        line 253: 233
        line 254: 248
        line 256: 252
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           42     103     5    rs   Ljava/sql/ResultSet;
           15     174     4    ps   Ljava/sql/PreparedStatement;
            4     225     3   con   Ljava/sql/Connection;
          233      19     3     e   Ljava/lang/Exception;
            0     254     0  this   Lext/mods/dungeon/DungeonManager;
            0     254     1 dungeonId   I
            0     254     2 playerId   I
      StackMapTable: number_of_entries = 18
        frame_type = 255 /* full_frame */
          offset_delta = 76
          locals = [ class ext/mods/dungeon/DungeonManager, int, int, class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/ResultSet, int ]
          stack = []
        frame_type = 11 /* same */
        frame_type = 9 /* same */
        frame_type = 250 /* chop */
          offset_delta = 2
        frame_type = 78 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/dungeon/DungeonManager, int, int, class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/ResultSet, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 78 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/dungeon/DungeonManager, int, int, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 14
          locals = [ class ext/mods/dungeon/DungeonManager, int, int, class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 19 /* same */

  public static ext.mods.dungeon.DungeonManager getInstance();
    descriptor: ()Lext/mods/dungeon/DungeonManager;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #302                // Field ext/mods/dungeon/DungeonManager$SingletonHolder.instance:Lext/mods/dungeon/DungeonManager;
         3: areturn
      LineNumberTable:
        line 261: 0

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: ldc           #11                 // class ext/mods/dungeon/DungeonManager
         2: invokevirtual #314                // Method java/lang/Class.getName:()Ljava/lang/String;
         5: invokestatic  #317                // Method java/util/logging/Logger.getLogger:(Ljava/lang/String;)Ljava/util/logging/Logger;
         8: putstatic     #228                // Field log:Ljava/util/logging/Logger;
        11: return
      LineNumberTable:
        line 37: 0
}
SourceFile: "DungeonManager.java"
NestMembers:
  ext/mods/dungeon/DungeonManager$SingletonHolder
BootstrapMethods:
  0: #390 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #374 \u0001 is not eligible for the dungeon.
  1: #390 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #376 DungeonManager: Error retrieving next join time: \u0001
  2: #396 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #378 (Ljava/lang/Object;)Z
      #379 REF_invokeStatic ext/mods/dungeon/DungeonManager.lambda$isInDungeon$0:(Lext/mods/gameserver/model/actor/Player;Lext/mods/dungeon/Dungeon;)Z
      #382 (Lext/mods/dungeon/Dungeon;)Z
  3: #390 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #384 DungeonManager: Failed to update stage: \u0001
  4: #390 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #386 SystemDungeonManager: Error saving cooldown: \u0001
  5: #390 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #388 DungeonManager: Error retrieving saved stage: \u0001
InnerClasses:
  public static final #409= #405 of #407; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
