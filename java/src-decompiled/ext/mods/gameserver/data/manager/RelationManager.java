// Bytecode for: ext.mods.gameserver.data.manager.RelationManager
// File: ext\mods\gameserver\data\manager\RelationManager.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/data/manager/RelationManager.class
  Last modified 9 de jul de 2026; size 12073 bytes
  MD5 checksum 02e0980c60f5f9759f1f704dd3781d10
  Compiled from "RelationManager.java"
public class ext.mods.gameserver.data.manager.RelationManager
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #11                         // ext/mods/gameserver/data/manager/RelationManager
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 8, methods: 23, attributes: 4
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Class              #8            // java/util/concurrent/ConcurrentHashMap
    #8 = Utf8               java/util/concurrent/ConcurrentHashMap
    #9 = Methodref          #7.#3         // java/util/concurrent/ConcurrentHashMap."<init>":()V
   #10 = Fieldref           #11.#12       // ext/mods/gameserver/data/manager/RelationManager._relations:Ljava/util/Map;
   #11 = Class              #13           // ext/mods/gameserver/data/manager/RelationManager
   #12 = NameAndType        #14:#15       // _relations:Ljava/util/Map;
   #13 = Utf8               ext/mods/gameserver/data/manager/RelationManager
   #14 = Utf8               _relations
   #15 = Utf8               Ljava/util/Map;
   #16 = Methodref          #17.#18       // ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
   #17 = Class              #19           // ext/mods/commons/pool/ConnectionPool
   #18 = NameAndType        #20:#21       // getConnection:()Ljava/sql/Connection;
   #19 = Utf8               ext/mods/commons/pool/ConnectionPool
   #20 = Utf8               getConnection
   #21 = Utf8               ()Ljava/sql/Connection;
   #22 = String             #23           // SELECT * FROM character_relations
   #23 = Utf8               SELECT * FROM character_relations
   #24 = InterfaceMethodref #25.#26       // java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
   #25 = Class              #27           // java/sql/Connection
   #26 = NameAndType        #28:#29       // prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
   #27 = Utf8               java/sql/Connection
   #28 = Utf8               prepareStatement
   #29 = Utf8               (Ljava/lang/String;)Ljava/sql/PreparedStatement;
   #30 = InterfaceMethodref #31.#32       // java/sql/PreparedStatement.executeQuery:()Ljava/sql/ResultSet;
   #31 = Class              #33           // java/sql/PreparedStatement
   #32 = NameAndType        #34:#35       // executeQuery:()Ljava/sql/ResultSet;
   #33 = Utf8               java/sql/PreparedStatement
   #34 = Utf8               executeQuery
   #35 = Utf8               ()Ljava/sql/ResultSet;
   #36 = InterfaceMethodref #37.#38       // java/sql/ResultSet.next:()Z
   #37 = Class              #39           // java/sql/ResultSet
   #38 = NameAndType        #40:#41       // next:()Z
   #39 = Utf8               java/sql/ResultSet
   #40 = Utf8               next
   #41 = Utf8               ()Z
   #42 = Class              #43           // ext/mods/gameserver/model/records/PlayerPair
   #43 = Utf8               ext/mods/gameserver/model/records/PlayerPair
   #44 = String             #45           // char_id
   #45 = Utf8               char_id
   #46 = InterfaceMethodref #37.#47       // java/sql/ResultSet.getInt:(Ljava/lang/String;)I
   #47 = NameAndType        #48:#49       // getInt:(Ljava/lang/String;)I
   #48 = Utf8               getInt
   #49 = Utf8               (Ljava/lang/String;)I
   #50 = String             #51           // friend_id
   #51 = Utf8               friend_id
   #52 = Methodref          #42.#53       // ext/mods/gameserver/model/records/PlayerPair."<init>":(II)V
   #53 = NameAndType        #5:#54        // "<init>":(II)V
   #54 = Utf8               (II)V
   #55 = String             #56           // relation
   #56 = Utf8               relation
   #57 = Methodref          #58.#59       // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
   #58 = Class              #60           // java/lang/Integer
   #59 = NameAndType        #61:#62       // valueOf:(I)Ljava/lang/Integer;
   #60 = Utf8               java/lang/Integer
   #61 = Utf8               valueOf
   #62 = Utf8               (I)Ljava/lang/Integer;
   #63 = InterfaceMethodref #64.#65       // java/util/Map.putIfAbsent:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #64 = Class              #66           // java/util/Map
   #65 = NameAndType        #67:#68       // putIfAbsent:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #66 = Utf8               java/util/Map
   #67 = Utf8               putIfAbsent
   #68 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #69 = InterfaceMethodref #37.#70       // java/sql/ResultSet.close:()V
   #70 = NameAndType        #71:#6        // close:()V
   #71 = Utf8               close
   #72 = Class              #73           // java/lang/Throwable
   #73 = Utf8               java/lang/Throwable
   #74 = Methodref          #72.#75       // java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
   #75 = NameAndType        #76:#77       // addSuppressed:(Ljava/lang/Throwable;)V
   #76 = Utf8               addSuppressed
   #77 = Utf8               (Ljava/lang/Throwable;)V
   #78 = InterfaceMethodref #31.#70       // java/sql/PreparedStatement.close:()V
   #79 = InterfaceMethodref #25.#70       // java/sql/Connection.close:()V
   #80 = Class              #81           // java/lang/Exception
   #81 = Utf8               java/lang/Exception
   #82 = Fieldref           #11.#83       // ext/mods/gameserver/data/manager/RelationManager.LOGGER:Lext/mods/commons/logging/CLogger;
   #83 = NameAndType        #84:#85       // LOGGER:Lext/mods/commons/logging/CLogger;
   #84 = Utf8               LOGGER
   #85 = Utf8               Lext/mods/commons/logging/CLogger;
   #86 = String             #87           // Couldn\'t restore relations.
   #87 = Utf8               Couldn\'t restore relations.
   #88 = Methodref          #89.#90       // ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
   #89 = Class              #91           // ext/mods/commons/logging/CLogger
   #90 = NameAndType        #92:#93       // error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
   #91 = Utf8               ext/mods/commons/logging/CLogger
   #92 = Utf8               error
   #93 = Utf8               (Ljava/lang/Object;Ljava/lang/Throwable;)V
   #94 = InterfaceMethodref #64.#95       // java/util/Map.isEmpty:()Z
   #95 = NameAndType        #96:#41       // isEmpty:()Z
   #96 = Utf8               isEmpty
   #97 = String             #98           // INSERT INTO character_relations (char_id, friend_id, relation) VALUES (?,?,?) ON DUPLICATE KEY UPDATE relation=VALUES(relation)
   #98 = Utf8               INSERT INTO character_relations (char_id, friend_id, relation) VALUES (?,?,?) ON DUPLICATE KEY UPDATE relation=VALUES(relation)
   #99 = String             #100          // DELETE FROM character_relations WHERE char_id=? AND friend_id=?
  #100 = Utf8               DELETE FROM character_relations WHERE char_id=? AND friend_id=?
  #101 = InterfaceMethodref #64.#102      // java/util/Map.entrySet:()Ljava/util/Set;
  #102 = NameAndType        #103:#104     // entrySet:()Ljava/util/Set;
  #103 = Utf8               entrySet
  #104 = Utf8               ()Ljava/util/Set;
  #105 = InterfaceMethodref #106.#107     // java/util/Set.iterator:()Ljava/util/Iterator;
  #106 = Class              #108          // java/util/Set
  #107 = NameAndType        #109:#110     // iterator:()Ljava/util/Iterator;
  #108 = Utf8               java/util/Set
  #109 = Utf8               iterator
  #110 = Utf8               ()Ljava/util/Iterator;
  #111 = InterfaceMethodref #112.#113     // java/util/Iterator.hasNext:()Z
  #112 = Class              #114          // java/util/Iterator
  #113 = NameAndType        #115:#41      // hasNext:()Z
  #114 = Utf8               java/util/Iterator
  #115 = Utf8               hasNext
  #116 = InterfaceMethodref #112.#117     // java/util/Iterator.next:()Ljava/lang/Object;
  #117 = NameAndType        #40:#118      // next:()Ljava/lang/Object;
  #118 = Utf8               ()Ljava/lang/Object;
  #119 = Class              #120          // java/util/Map$Entry
  #120 = Utf8               java/util/Map$Entry
  #121 = InterfaceMethodref #119.#122     // java/util/Map$Entry.getKey:()Ljava/lang/Object;
  #122 = NameAndType        #123:#118     // getKey:()Ljava/lang/Object;
  #123 = Utf8               getKey
  #124 = InterfaceMethodref #119.#125     // java/util/Map$Entry.getValue:()Ljava/lang/Object;
  #125 = NameAndType        #126:#118     // getValue:()Ljava/lang/Object;
  #126 = Utf8               getValue
  #127 = Methodref          #58.#128      // java/lang/Integer.intValue:()I
  #128 = NameAndType        #129:#130     // intValue:()I
  #129 = Utf8               intValue
  #130 = Utf8               ()I
  #131 = Methodref          #42.#132      // ext/mods/gameserver/model/records/PlayerPair.id1:()I
  #132 = NameAndType        #133:#130     // id1:()I
  #133 = Utf8               id1
  #134 = InterfaceMethodref #31.#135      // java/sql/PreparedStatement.setInt:(II)V
  #135 = NameAndType        #136:#54      // setInt:(II)V
  #136 = Utf8               setInt
  #137 = Methodref          #42.#138      // ext/mods/gameserver/model/records/PlayerPair.id2:()I
  #138 = NameAndType        #139:#130     // id2:()I
  #139 = Utf8               id2
  #140 = InterfaceMethodref #31.#141      // java/sql/PreparedStatement.addBatch:()V
  #141 = NameAndType        #142:#6       // addBatch:()V
  #142 = Utf8               addBatch
  #143 = InterfaceMethodref #31.#144      // java/sql/PreparedStatement.executeBatch:()[I
  #144 = NameAndType        #145:#146     // executeBatch:()[I
  #145 = Utf8               executeBatch
  #146 = Utf8               ()[I
  #147 = String             #148          // Couldn\'t store players relations.
  #148 = Utf8               Couldn\'t store players relations.
  #149 = Methodref          #150.#151     // ext/mods/gameserver/model/actor/Player.getObjectId:()I
  #150 = Class              #152          // ext/mods/gameserver/model/actor/Player
  #151 = NameAndType        #153:#130     // getObjectId:()I
  #152 = Utf8               ext/mods/gameserver/model/actor/Player
  #153 = Utf8               getObjectId
  #154 = Methodref          #11.#155      // ext/mods/gameserver/data/manager/RelationManager.isInBlockList:(Lext/mods/gameserver/model/actor/Player;I)Z
  #155 = NameAndType        #156:#157     // isInBlockList:(Lext/mods/gameserver/model/actor/Player;I)Z
  #156 = Utf8               isInBlockList
  #157 = Utf8               (Lext/mods/gameserver/model/actor/Player;I)Z
  #158 = InterfaceMethodref #64.#159      // java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
  #159 = NameAndType        #160:#161     // get:(Ljava/lang/Object;)Ljava/lang/Object;
  #160 = Utf8               get
  #161 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
  #162 = Class              #163          // java/util/HashSet
  #163 = Utf8               java/util/HashSet
  #164 = Methodref          #162.#3       // java/util/HashSet."<init>":()V
  #165 = InvokeDynamic      #0:#166       // #0:accept:(ILjava/util/Set;)Ljava/util/function/BiConsumer;
  #166 = NameAndType        #167:#168     // accept:(ILjava/util/Set;)Ljava/util/function/BiConsumer;
  #167 = Utf8               accept
  #168 = Utf8               (ILjava/util/Set;)Ljava/util/function/BiConsumer;
  #169 = InterfaceMethodref #64.#170      // java/util/Map.forEach:(Ljava/util/function/BiConsumer;)V
  #170 = NameAndType        #171:#172     // forEach:(Ljava/util/function/BiConsumer;)V
  #171 = Utf8               forEach
  #172 = Utf8               (Ljava/util/function/BiConsumer;)V
  #173 = Fieldref           #174.#175     // ext/mods/gameserver/network/SystemMessageId.S1_WAS_ADDED_TO_YOUR_IGNORE_LIST:Lext/mods/gameserver/network/SystemMessageId;
  #174 = Class              #176          // ext/mods/gameserver/network/SystemMessageId
  #175 = NameAndType        #177:#178     // S1_WAS_ADDED_TO_YOUR_IGNORE_LIST:Lext/mods/gameserver/network/SystemMessageId;
  #176 = Utf8               ext/mods/gameserver/network/SystemMessageId
  #177 = Utf8               S1_WAS_ADDED_TO_YOUR_IGNORE_LIST
  #178 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
  #179 = Methodref          #180.#181     // ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #180 = Class              #182          // ext/mods/gameserver/network/serverpackets/SystemMessage
  #181 = NameAndType        #183:#184     // getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #182 = Utf8               ext/mods/gameserver/network/serverpackets/SystemMessage
  #183 = Utf8               getSystemMessage
  #184 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #185 = Methodref          #180.#186     // ext/mods/gameserver/network/serverpackets/SystemMessage.addCharName:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #186 = NameAndType        #187:#188     // addCharName:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #187 = Utf8               addCharName
  #188 = Utf8               (I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #189 = Methodref          #150.#190     // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #190 = NameAndType        #191:#192     // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #191 = Utf8               sendPacket
  #192 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #193 = Methodref          #194.#195     // ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
  #194 = Class              #196          // ext/mods/gameserver/model/World
  #195 = NameAndType        #197:#198     // getInstance:()Lext/mods/gameserver/model/World;
  #196 = Utf8               ext/mods/gameserver/model/World
  #197 = Utf8               getInstance
  #198 = Utf8               ()Lext/mods/gameserver/model/World;
  #199 = Methodref          #194.#200     // ext/mods/gameserver/model/World.getPlayer:(I)Lext/mods/gameserver/model/actor/Player;
  #200 = NameAndType        #201:#202     // getPlayer:(I)Lext/mods/gameserver/model/actor/Player;
  #201 = Utf8               getPlayer
  #202 = Utf8               (I)Lext/mods/gameserver/model/actor/Player;
  #203 = Fieldref           #174.#204     // ext/mods/gameserver/network/SystemMessageId.S1_HAS_ADDED_YOU_TO_IGNORE_LIST:Lext/mods/gameserver/network/SystemMessageId;
  #204 = NameAndType        #205:#178     // S1_HAS_ADDED_YOU_TO_IGNORE_LIST:Lext/mods/gameserver/network/SystemMessageId;
  #205 = Utf8               S1_HAS_ADDED_YOU_TO_IGNORE_LIST
  #206 = Methodref          #150.#207     // ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
  #207 = NameAndType        #208:#209     // getName:()Ljava/lang/String;
  #208 = Utf8               getName
  #209 = Utf8               ()Ljava/lang/String;
  #210 = Methodref          #180.#211     // ext/mods/gameserver/network/serverpackets/SystemMessage.addString:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #211 = NameAndType        #212:#213     // addString:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #212 = Utf8               addString
  #213 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #214 = Methodref          #11.#215      // ext/mods/gameserver/data/manager/RelationManager.updateRelation:(IIIZ)V
  #215 = NameAndType        #216:#217     // updateRelation:(IIIZ)V
  #216 = Utf8               updateRelation
  #217 = Utf8               (IIIZ)V
  #218 = Fieldref           #174.#219     // ext/mods/gameserver/network/SystemMessageId.S1_WAS_REMOVED_FROM_YOUR_IGNORE_LIST:Lext/mods/gameserver/network/SystemMessageId;
  #219 = NameAndType        #220:#178     // S1_WAS_REMOVED_FROM_YOUR_IGNORE_LIST:Lext/mods/gameserver/network/SystemMessageId;
  #220 = Utf8               S1_WAS_REMOVED_FROM_YOUR_IGNORE_LIST
  #221 = InvokeDynamic      #1:#166       // #1:accept:(ILjava/util/Set;)Ljava/util/function/BiConsumer;
  #222 = Methodref          #11.#223      // ext/mods/gameserver/data/manager/RelationManager.areFriends:(II)Z
  #223 = NameAndType        #224:#225     // areFriends:(II)Z
  #224 = Utf8               areFriends
  #225 = Utf8               (II)Z
  #226 = Fieldref           #174.#227     // ext/mods/gameserver/network/SystemMessageId.S1_HAS_BEEN_DELETED_FROM_YOUR_FRIENDS_LIST:Lext/mods/gameserver/network/SystemMessageId;
  #227 = NameAndType        #228:#178     // S1_HAS_BEEN_DELETED_FROM_YOUR_FRIENDS_LIST:Lext/mods/gameserver/network/SystemMessageId;
  #228 = Utf8               S1_HAS_BEEN_DELETED_FROM_YOUR_FRIENDS_LIST
  #229 = Methodref          #11.#230      // ext/mods/gameserver/data/manager/RelationManager.getFriendList:(I)Ljava/util/Set;
  #230 = NameAndType        #231:#232     // getFriendList:(I)Ljava/util/Set;
  #231 = Utf8               getFriendList
  #232 = Utf8               (I)Ljava/util/Set;
  #233 = Class              #234          // ext/mods/gameserver/network/serverpackets/L2FriendStatus
  #234 = Utf8               ext/mods/gameserver/network/serverpackets/L2FriendStatus
  #235 = Methodref          #233.#236     // ext/mods/gameserver/network/serverpackets/L2FriendStatus."<init>":(Lext/mods/gameserver/model/actor/Player;Z)V
  #236 = NameAndType        #5:#237       // "<init>":(Lext/mods/gameserver/model/actor/Player;Z)V
  #237 = Utf8               (Lext/mods/gameserver/model/actor/Player;Z)V
  #238 = Fieldref           #174.#239     // ext/mods/gameserver/network/SystemMessageId.FRIEND_S1_HAS_LOGGED_IN:Lext/mods/gameserver/network/SystemMessageId;
  #239 = NameAndType        #240:#178     // FRIEND_S1_HAS_LOGGED_IN:Lext/mods/gameserver/network/SystemMessageId;
  #240 = Utf8               FRIEND_S1_HAS_LOGGED_IN
  #241 = Methodref          #180.#242     // ext/mods/gameserver/network/serverpackets/SystemMessage.addCharName:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #242 = NameAndType        #187:#243     // addCharName:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #243 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #244 = Fieldref           #174.#245     // ext/mods/gameserver/network/SystemMessageId.BLOCK_LIST_HEADER:Lext/mods/gameserver/network/SystemMessageId;
  #245 = NameAndType        #246:#178     // BLOCK_LIST_HEADER:Lext/mods/gameserver/network/SystemMessageId;
  #246 = Utf8               BLOCK_LIST_HEADER
  #247 = Methodref          #150.#248     // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
  #248 = NameAndType        #191:#249     // sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
  #249 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
  #250 = Methodref          #11.#251      // ext/mods/gameserver/data/manager/RelationManager.getBlockList:(I)Ljava/util/Set;
  #251 = NameAndType        #252:#232     // getBlockList:(I)Ljava/util/Set;
  #252 = Utf8               getBlockList
  #253 = Methodref          #254.#255     // ext/mods/gameserver/data/sql/PlayerInfoTable.getInstance:()Lext/mods/gameserver/data/sql/PlayerInfoTable;
  #254 = Class              #256          // ext/mods/gameserver/data/sql/PlayerInfoTable
  #255 = NameAndType        #197:#257     // getInstance:()Lext/mods/gameserver/data/sql/PlayerInfoTable;
  #256 = Utf8               ext/mods/gameserver/data/sql/PlayerInfoTable
  #257 = Utf8               ()Lext/mods/gameserver/data/sql/PlayerInfoTable;
  #258 = Methodref          #254.#259     // ext/mods/gameserver/data/sql/PlayerInfoTable.getPlayerName:(I)Ljava/lang/String;
  #259 = NameAndType        #260:#261     // getPlayerName:(I)Ljava/lang/String;
  #260 = Utf8               getPlayerName
  #261 = Utf8               (I)Ljava/lang/String;
  #262 = InvokeDynamic      #2:#263       // #2:makeConcatWithConstants:(ILjava/lang/String;)Ljava/lang/String;
  #263 = NameAndType        #264:#265     // makeConcatWithConstants:(ILjava/lang/String;)Ljava/lang/String;
  #264 = Utf8               makeConcatWithConstants
  #265 = Utf8               (ILjava/lang/String;)Ljava/lang/String;
  #266 = Methodref          #150.#267     // ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
  #267 = NameAndType        #268:#269     // sendMessage:(Ljava/lang/String;)V
  #268 = Utf8               sendMessage
  #269 = Utf8               (Ljava/lang/String;)V
  #270 = Fieldref           #174.#271     // ext/mods/gameserver/network/SystemMessageId.FRIEND_LIST_FOOTER:Lext/mods/gameserver/network/SystemMessageId;
  #271 = NameAndType        #272:#178     // FRIEND_LIST_FOOTER:Lext/mods/gameserver/network/SystemMessageId;
  #272 = Utf8               FRIEND_LIST_FOOTER
  #273 = InvokeDynamic      #3:#274       // #3:accept:(Lext/mods/gameserver/data/manager/RelationManager;Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/Consumer;
  #274 = NameAndType        #167:#275     // accept:(Lext/mods/gameserver/data/manager/RelationManager;Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/Consumer;
  #275 = Utf8               (Lext/mods/gameserver/data/manager/RelationManager;Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/Consumer;
  #276 = InterfaceMethodref #106.#277     // java/util/Set.forEach:(Ljava/util/function/Consumer;)V
  #277 = NameAndType        #171:#278     // forEach:(Ljava/util/function/Consumer;)V
  #278 = Utf8               (Ljava/util/function/Consumer;)V
  #279 = InvokeDynamic      #4:#274       // #4:accept:(Lext/mods/gameserver/data/manager/RelationManager;Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/Consumer;
  #280 = InvokeDynamic      #5:#281       // #5:apply:(ZI)Ljava/util/function/BiFunction;
  #281 = NameAndType        #282:#283     // apply:(ZI)Ljava/util/function/BiFunction;
  #282 = Utf8               apply
  #283 = Utf8               (ZI)Ljava/util/function/BiFunction;
  #284 = InterfaceMethodref #64.#285      // java/util/Map.compute:(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;
  #285 = NameAndType        #286:#287     // compute:(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;
  #286 = Utf8               compute
  #287 = Utf8               (Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;
  #288 = Fieldref           #289.#290     // ext/mods/gameserver/data/manager/RelationManager$SingletonHolder.INSTANCE:Lext/mods/gameserver/data/manager/RelationManager;
  #289 = Class              #291          // ext/mods/gameserver/data/manager/RelationManager$SingletonHolder
  #290 = NameAndType        #292:#293     // INSTANCE:Lext/mods/gameserver/data/manager/RelationManager;
  #291 = Utf8               ext/mods/gameserver/data/manager/RelationManager$SingletonHolder
  #292 = Utf8               INSTANCE
  #293 = Utf8               Lext/mods/gameserver/data/manager/RelationManager;
  #294 = Methodref          #11.#295      // ext/mods/gameserver/data/manager/RelationManager.removeFromBlockList:(Lext/mods/gameserver/model/actor/Player;I)V
  #295 = NameAndType        #296:#297     // removeFromBlockList:(Lext/mods/gameserver/model/actor/Player;I)V
  #296 = Utf8               removeFromBlockList
  #297 = Utf8               (Lext/mods/gameserver/model/actor/Player;I)V
  #298 = Methodref          #11.#299      // ext/mods/gameserver/data/manager/RelationManager.removeFromFriendList:(Lext/mods/gameserver/model/actor/Player;I)V
  #299 = NameAndType        #300:#297     // removeFromFriendList:(Lext/mods/gameserver/model/actor/Player;I)V
  #300 = Utf8               removeFromFriendList
  #301 = Methodref          #42.#302      // ext/mods/gameserver/model/records/PlayerPair.contains:(I)Z
  #302 = NameAndType        #303:#304     // contains:(I)Z
  #303 = Utf8               contains
  #304 = Utf8               (I)Z
  #305 = InterfaceMethodref #106.#306     // java/util/Set.add:(Ljava/lang/Object;)Z
  #306 = NameAndType        #307:#308     // add:(Ljava/lang/Object;)Z
  #307 = Utf8               add
  #308 = Utf8               (Ljava/lang/Object;)Z
  #309 = Methodref          #310.#207     // java/lang/Class.getName:()Ljava/lang/String;
  #310 = Class              #311          // java/lang/Class
  #311 = Utf8               java/lang/Class
  #312 = Methodref          #89.#313      // ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
  #313 = NameAndType        #5:#269       // "<init>":(Ljava/lang/String;)V
  #314 = Utf8               LOAD
  #315 = Utf8               Ljava/lang/String;
  #316 = Utf8               ConstantValue
  #317 = Utf8               ADD_OR_UPDATE
  #318 = Utf8               DELETE
  #319 = Utf8               ARE_FRIENDS
  #320 = Utf8               I
  #321 = Integer            1
  #322 = Utf8               CHAR_BLOCKS_FRIEND
  #323 = Integer            2
  #324 = Utf8               FRIEND_BLOCKS_CHAR
  #325 = Integer            4
  #326 = Utf8               Signature
  #327 = Utf8               Ljava/util/Map<Lext/mods/gameserver/model/records/PlayerPair;Ljava/lang/Integer;>;
  #328 = Utf8               Code
  #329 = Utf8               LineNumberTable
  #330 = Utf8               LocalVariableTable
  #331 = Utf8               rs
  #332 = Utf8               Ljava/sql/ResultSet;
  #333 = Utf8               ps
  #334 = Utf8               Ljava/sql/PreparedStatement;
  #335 = Utf8               con
  #336 = Utf8               Ljava/sql/Connection;
  #337 = Utf8               e
  #338 = Utf8               Ljava/lang/Exception;
  #339 = Utf8               this
  #340 = Utf8               StackMapTable
  #341 = Utf8               save
  #342 = Utf8               pair
  #343 = Utf8               Lext/mods/gameserver/model/records/PlayerPair;
  #344 = Utf8               entry
  #345 = Utf8               Ljava/util/Map$Entry;
  #346 = Utf8               ps2
  #347 = Utf8               LocalVariableTypeTable
  #348 = Utf8               Ljava/util/Map$Entry<Lext/mods/gameserver/model/records/PlayerPair;Ljava/lang/Integer;>;
  #349 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;)Z
  #350 = Utf8               player
  #351 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #352 = Utf8               target
  #353 = Utf8               targetId
  #354 = Utf8               key
  #355 = Utf8               Ljava/lang/Integer;
  #356 = Utf8               playerId
  #357 = Utf8               blockList
  #358 = Utf8               Ljava/util/Set;
  #359 = Utf8               Ljava/util/Set<Ljava/lang/Integer;>;
  #360 = Utf8               (I)Ljava/util/Set<Ljava/lang/Integer;>;
  #361 = Utf8               addToBlockList
  #362 = Utf8               targetPlayer
  #363 = Utf8               friendList
  #364 = Utf8               addToFriendList
  #365 = Utf8               notifyFriends
  #366 = Utf8               friend
  #367 = Utf8               id
  #368 = Utf8               isOnline
  #369 = Utf8               Z
  #370 = Utf8               sendBlockList
  #371 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
  #372 = Utf8               i
  #373 = Utf8               removeAllFromFriendList
  #374 = Utf8               removeAllFromBlockList
  #375 = Utf8               flag
  #376 = Utf8               ()Lext/mods/gameserver/data/manager/RelationManager;
  #377 = Utf8               lambda$updateRelation$0
  #378 = Utf8               (ZILext/mods/gameserver/model/records/PlayerPair;Ljava/lang/Integer;)Ljava/lang/Integer;
  #379 = Utf8               k
  #380 = Utf8               oldRelation
  #381 = Utf8               lambda$removeAllFromBlockList$0
  #382 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/lang/Integer;)V
  #383 = Utf8               lambda$removeAllFromFriendList$0
  #384 = Utf8               lambda$getFriendList$0
  #385 = Utf8               (ILjava/util/Set;Lext/mods/gameserver/model/records/PlayerPair;Ljava/lang/Integer;)V
  #386 = Utf8               playerPair
  #387 = Utf8               lambda$getBlockList$0
  #388 = Utf8               <clinit>
  #389 = Utf8               SourceFile
  #390 = Utf8               RelationManager.java
  #391 = Utf8               NestMembers
  #392 = Utf8               BootstrapMethods
  #393 = MethodType         #394          //  (Ljava/lang/Object;Ljava/lang/Object;)V
  #394 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)V
  #395 = MethodHandle       6:#396        // REF_invokeStatic ext/mods/gameserver/data/manager/RelationManager.lambda$getBlockList$0:(ILjava/util/Set;Lext/mods/gameserver/model/records/PlayerPair;Ljava/lang/Integer;)V
  #396 = Methodref          #11.#397      // ext/mods/gameserver/data/manager/RelationManager.lambda$getBlockList$0:(ILjava/util/Set;Lext/mods/gameserver/model/records/PlayerPair;Ljava/lang/Integer;)V
  #397 = NameAndType        #387:#385     // lambda$getBlockList$0:(ILjava/util/Set;Lext/mods/gameserver/model/records/PlayerPair;Ljava/lang/Integer;)V
  #398 = MethodType         #399          //  (Lext/mods/gameserver/model/records/PlayerPair;Ljava/lang/Integer;)V
  #399 = Utf8               (Lext/mods/gameserver/model/records/PlayerPair;Ljava/lang/Integer;)V
  #400 = MethodHandle       6:#401        // REF_invokeStatic ext/mods/gameserver/data/manager/RelationManager.lambda$getFriendList$0:(ILjava/util/Set;Lext/mods/gameserver/model/records/PlayerPair;Ljava/lang/Integer;)V
  #401 = Methodref          #11.#402      // ext/mods/gameserver/data/manager/RelationManager.lambda$getFriendList$0:(ILjava/util/Set;Lext/mods/gameserver/model/records/PlayerPair;Ljava/lang/Integer;)V
  #402 = NameAndType        #384:#385     // lambda$getFriendList$0:(ILjava/util/Set;Lext/mods/gameserver/model/records/PlayerPair;Ljava/lang/Integer;)V
  #403 = String             #404          // \u0001. \u0001
  #404 = Utf8               \u0001. \u0001
  #405 = MethodType         #406          //  (Ljava/lang/Object;)V
  #406 = Utf8               (Ljava/lang/Object;)V
  #407 = MethodHandle       5:#408        // REF_invokeVirtual ext/mods/gameserver/data/manager/RelationManager.lambda$removeAllFromFriendList$0:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/Integer;)V
  #408 = Methodref          #11.#409      // ext/mods/gameserver/data/manager/RelationManager.lambda$removeAllFromFriendList$0:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/Integer;)V
  #409 = NameAndType        #383:#382     // lambda$removeAllFromFriendList$0:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/Integer;)V
  #410 = MethodType         #411          //  (Ljava/lang/Integer;)V
  #411 = Utf8               (Ljava/lang/Integer;)V
  #412 = MethodHandle       5:#413        // REF_invokeVirtual ext/mods/gameserver/data/manager/RelationManager.lambda$removeAllFromBlockList$0:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/Integer;)V
  #413 = Methodref          #11.#414      // ext/mods/gameserver/data/manager/RelationManager.lambda$removeAllFromBlockList$0:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/Integer;)V
  #414 = NameAndType        #381:#382     // lambda$removeAllFromBlockList$0:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/Integer;)V
  #415 = MethodType         #68           //  (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #416 = MethodHandle       6:#417        // REF_invokeStatic ext/mods/gameserver/data/manager/RelationManager.lambda$updateRelation$0:(ZILext/mods/gameserver/model/records/PlayerPair;Ljava/lang/Integer;)Ljava/lang/Integer;
  #417 = Methodref          #11.#418      // ext/mods/gameserver/data/manager/RelationManager.lambda$updateRelation$0:(ZILext/mods/gameserver/model/records/PlayerPair;Ljava/lang/Integer;)Ljava/lang/Integer;
  #418 = NameAndType        #377:#378     // lambda$updateRelation$0:(ZILext/mods/gameserver/model/records/PlayerPair;Ljava/lang/Integer;)Ljava/lang/Integer;
  #419 = MethodType         #420          //  (Lext/mods/gameserver/model/records/PlayerPair;Ljava/lang/Integer;)Ljava/lang/Integer;
  #420 = Utf8               (Lext/mods/gameserver/model/records/PlayerPair;Ljava/lang/Integer;)Ljava/lang/Integer;
  #421 = MethodHandle       6:#422        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #422 = Methodref          #423.#424     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #423 = Class              #425          // java/lang/invoke/LambdaMetafactory
  #424 = NameAndType        #426:#427     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #425 = Utf8               java/lang/invoke/LambdaMetafactory
  #426 = Utf8               metafactory
  #427 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #428 = MethodHandle       6:#429        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #429 = Methodref          #430.#431     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #430 = Class              #432          // java/lang/invoke/StringConcatFactory
  #431 = NameAndType        #264:#433     // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #432 = Utf8               java/lang/invoke/StringConcatFactory
  #433 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #434 = Utf8               InnerClasses
  #435 = Utf8               Entry
  #436 = Utf8               SingletonHolder
  #437 = Class              #438          // java/lang/invoke/MethodHandles$Lookup
  #438 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #439 = Class              #440          // java/lang/invoke/MethodHandles
  #440 = Utf8               java/lang/invoke/MethodHandles
  #441 = Utf8               Lookup
{
  public void save();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=8, args_size=1
         0: aload_0
         1: getfield      #10                 // Field _relations:Ljava/util/Map;
         4: invokeinterface #94,  1           // InterfaceMethod java/util/Map.isEmpty:()Z
         9: ifeq          13
        12: return
        13: invokestatic  #16                 // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
        16: astore_1
        17: aload_1
        18: ldc           #97                 // String INSERT INTO character_relations (char_id, friend_id, relation) VALUES (?,?,?) ON DUPLICATE KEY UPDATE relation=VALUES(relation)
        20: invokeinterface #24,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        25: astore_2
        26: aload_1
        27: ldc           #99                 // String DELETE FROM character_relations WHERE char_id=? AND friend_id=?
        29: invokeinterface #24,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        34: astore_3
        35: aload_0
        36: getfield      #10                 // Field _relations:Ljava/util/Map;
        39: invokeinterface #101,  1          // InterfaceMethod java/util/Map.entrySet:()Ljava/util/Set;
        44: invokeinterface #105,  1          // InterfaceMethod java/util/Set.iterator:()Ljava/util/Iterator;
        49: astore        4
        51: aload         4
        53: invokeinterface #111,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        58: ifeq          180
        61: aload         4
        63: invokeinterface #116,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        68: checkcast     #119                // class java/util/Map$Entry
        71: astore        5
        73: aload         5
        75: invokeinterface #121,  1          // InterfaceMethod java/util/Map$Entry.getKey:()Ljava/lang/Object;
        80: checkcast     #42                 // class ext/mods/gameserver/model/records/PlayerPair
        83: astore        6
        85: aload         5
        87: invokeinterface #124,  1          // InterfaceMethod java/util/Map$Entry.getValue:()Ljava/lang/Object;
        92: checkcast     #58                 // class java/lang/Integer
        95: invokevirtual #127                // Method java/lang/Integer.intValue:()I
        98: istore        7
       100: iload         7
       102: ifne          138
       105: aload_3
       106: iconst_1
       107: aload         6
       109: invokevirtual #131                // Method ext/mods/gameserver/model/records/PlayerPair.id1:()I
       112: invokeinterface #134,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       117: aload_3
       118: iconst_2
       119: aload         6
       121: invokevirtual #137                // Method ext/mods/gameserver/model/records/PlayerPair.id2:()I
       124: invokeinterface #134,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       129: aload_3
       130: invokeinterface #140,  1          // InterfaceMethod java/sql/PreparedStatement.addBatch:()V
       135: goto          177
       138: aload_2
       139: iconst_1
       140: aload         6
       142: invokevirtual #131                // Method ext/mods/gameserver/model/records/PlayerPair.id1:()I
       145: invokeinterface #134,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       150: aload_2
       151: iconst_2
       152: aload         6
       154: invokevirtual #137                // Method ext/mods/gameserver/model/records/PlayerPair.id2:()I
       157: invokeinterface #134,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       162: aload_2
       163: iconst_3
       164: iload         7
       166: invokeinterface #134,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       171: aload_2
       172: invokeinterface #140,  1          // InterfaceMethod java/sql/PreparedStatement.addBatch:()V
       177: goto          51
       180: aload_2
       181: invokeinterface #143,  1          // InterfaceMethod java/sql/PreparedStatement.executeBatch:()[I
       186: pop
       187: aload_3
       188: invokeinterface #143,  1          // InterfaceMethod java/sql/PreparedStatement.executeBatch:()[I
       193: pop
       194: aload_3
       195: ifnull        234
       198: aload_3
       199: invokeinterface #78,  1           // InterfaceMethod java/sql/PreparedStatement.close:()V
       204: goto          234
       207: astore        4
       209: aload_3
       210: ifnull        231
       213: aload_3
       214: invokeinterface #78,  1           // InterfaceMethod java/sql/PreparedStatement.close:()V
       219: goto          231
       222: astore        5
       224: aload         4
       226: aload         5
       228: invokevirtual #74                 // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       231: aload         4
       233: athrow
       234: aload_2
       235: ifnull        271
       238: aload_2
       239: invokeinterface #78,  1           // InterfaceMethod java/sql/PreparedStatement.close:()V
       244: goto          271
       247: astore_3
       248: aload_2
       249: ifnull        269
       252: aload_2
       253: invokeinterface #78,  1           // InterfaceMethod java/sql/PreparedStatement.close:()V
       258: goto          269
       261: astore        4
       263: aload_3
       264: aload         4
       266: invokevirtual #74                 // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       269: aload_3
       270: athrow
       271: aload_1
       272: ifnull        306
       275: aload_1
       276: invokeinterface #79,  1           // InterfaceMethod java/sql/Connection.close:()V
       281: goto          306
       284: astore_2
       285: aload_1
       286: ifnull        304
       289: aload_1
       290: invokeinterface #79,  1           // InterfaceMethod java/sql/Connection.close:()V
       295: goto          304
       298: astore_3
       299: aload_2
       300: aload_3
       301: invokevirtual #74                 // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       304: aload_2
       305: athrow
       306: goto          319
       309: astore_1
       310: getstatic     #82                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
       313: ldc           #147                // String Couldn\'t store players relations.
       315: aload_1
       316: invokevirtual #88                 // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
       319: return
      Exception table:
         from    to  target type
            35   194   207   Class java/lang/Throwable
           213   219   222   Class java/lang/Throwable
            26   234   247   Class java/lang/Throwable
           252   258   261   Class java/lang/Throwable
            17   271   284   Class java/lang/Throwable
           289   295   298   Class java/lang/Throwable
            13   306   309   Class java/lang/Exception
      LineNumberTable:
        line 74: 0
        line 75: 12
        line 77: 13
        line 78: 17
        line 79: 26
        line 81: 35
        line 83: 73
        line 84: 85
        line 86: 100
        line 88: 105
        line 89: 117
        line 90: 129
        line 94: 138
        line 95: 150
        line 96: 162
        line 97: 171
        line 99: 177
        line 101: 180
        line 102: 187
        line 103: 194
        line 77: 207
        line 103: 234
        line 77: 247
        line 103: 271
        line 77: 284
        line 107: 306
        line 104: 309
        line 106: 310
        line 108: 319
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           85      92     6  pair   Lext/mods/gameserver/model/records/PlayerPair;
          100      77     7 relation   I
           73     104     5 entry   Ljava/util/Map$Entry;
           35     199     3   ps2   Ljava/sql/PreparedStatement;
           26     245     2    ps   Ljava/sql/PreparedStatement;
           17     289     1   con   Ljava/sql/Connection;
          310       9     1     e   Ljava/lang/Exception;
            0     320     0  this   Lext/mods/gameserver/data/manager/RelationManager;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
           73     104     5 entry   Ljava/util/Map$Entry<Lext/mods/gameserver/model/records/PlayerPair;Ljava/lang/Integer;>;
      StackMapTable: number_of_entries = 19
        frame_type = 13 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 37
          locals = [ class ext/mods/gameserver/data/manager/RelationManager, class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/PreparedStatement, class java/util/Iterator ]
          stack = []
        frame_type = 254 /* append */
          offset_delta = 86
          locals = [ class java/util/Map$Entry, class ext/mods/gameserver/model/records/PlayerPair, int ]
        frame_type = 248 /* chop */
          offset_delta = 38
        frame_type = 250 /* chop */
          offset_delta = 2
        frame_type = 90 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 14
          locals = [ class ext/mods/gameserver/data/manager/RelationManager, class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/data/manager/RelationManager, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 7 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/data/manager/RelationManager, class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 5 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 9 /* same */

  public boolean isInBlockList(ext.mods.gameserver.model.actor.Player, ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: aload_2
         3: invokevirtual #149                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
         6: invokevirtual #154                // Method isInBlockList:(Lext/mods/gameserver/model/actor/Player;I)Z
         9: ireturn
      LineNumberTable:
        line 117: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/gameserver/data/manager/RelationManager;
            0      10     1 player   Lext/mods/gameserver/model/actor/Player;
            0      10     2 target   Lext/mods/gameserver/model/actor/Player;

  public java.util.Set<java.lang.Integer> getBlockList(int);
    descriptor: (I)Ljava/util/Set;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=2
         0: new           #162                // class java/util/HashSet
         3: dup
         4: invokespecial #164                // Method java/util/HashSet."<init>":()V
         7: astore_2
         8: aload_0
         9: getfield      #10                 // Field _relations:Ljava/util/Map;
        12: iload_1
        13: aload_2
        14: invokedynamic #165,  0            // InvokeDynamic #0:accept:(ILjava/util/Set;)Ljava/util/function/BiConsumer;
        19: invokeinterface #169,  2          // InterfaceMethod java/util/Map.forEach:(Ljava/util/function/BiConsumer;)V
        24: aload_2
        25: areturn
      LineNumberTable:
        line 142: 0
        line 144: 8
        line 155: 24
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      26     0  this   Lext/mods/gameserver/data/manager/RelationManager;
            0      26     1 playerId   I
            8      18     2 blockList   Ljava/util/Set;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            8      18     2 blockList   Ljava/util/Set<Ljava/lang/Integer;>;
    Signature: #360                         // (I)Ljava/util/Set<Ljava/lang/Integer;>;

  public void addToBlockList(ext.mods.gameserver.model.actor.Player, int);
    descriptor: (Lext/mods/gameserver/model/actor/Player;I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=5, args_size=3
         0: aload_1
         1: invokevirtual #149                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
         4: istore_3
         5: iload_3
         6: iload_2
         7: if_icmpne     11
        10: return
        11: aload_1
        12: getstatic     #173                // Field ext/mods/gameserver/network/SystemMessageId.S1_WAS_ADDED_TO_YOUR_IGNORE_LIST:Lext/mods/gameserver/network/SystemMessageId;
        15: invokestatic  #179                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        18: iload_2
        19: invokevirtual #185                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addCharName:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        22: invokevirtual #189                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        25: invokestatic  #193                // Method ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
        28: iload_2
        29: invokevirtual #199                // Method ext/mods/gameserver/model/World.getPlayer:(I)Lext/mods/gameserver/model/actor/Player;
        32: astore        4
        34: aload         4
        36: ifnull        57
        39: aload         4
        41: getstatic     #203                // Field ext/mods/gameserver/network/SystemMessageId.S1_HAS_ADDED_YOU_TO_IGNORE_LIST:Lext/mods/gameserver/network/SystemMessageId;
        44: invokestatic  #179                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        47: aload_1
        48: invokevirtual #206                // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
        51: invokevirtual #210                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addString:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        54: invokevirtual #189                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        57: aload_0
        58: iload_3
        59: iload_2
        60: iload_3
        61: iload_2
        62: if_icmpge     69
        65: iconst_2
        66: goto          70
        69: iconst_4
        70: iconst_1
        71: invokevirtual #214                // Method updateRelation:(IIIZ)V
        74: return
      LineNumberTable:
        line 165: 0
        line 166: 5
        line 167: 10
        line 169: 11
        line 171: 25
        line 172: 34
        line 173: 39
        line 175: 57
        line 176: 74
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      75     0  this   Lext/mods/gameserver/data/manager/RelationManager;
            0      75     1 player   Lext/mods/gameserver/model/actor/Player;
            0      75     2 targetId   I
            5      70     3 playerId   I
           34      41     4 targetPlayer   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 4
        frame_type = 252 /* append */
          offset_delta = 11
          locals = [ int ]
        frame_type = 252 /* append */
          offset_delta = 45
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 255 /* full_frame */
          offset_delta = 11
          locals = [ class ext/mods/gameserver/data/manager/RelationManager, class ext/mods/gameserver/model/actor/Player, int, int, class ext/mods/gameserver/model/actor/Player ]
          stack = [ class ext/mods/gameserver/data/manager/RelationManager, int, int ]
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/data/manager/RelationManager, class ext/mods/gameserver/model/actor/Player, int, int, class ext/mods/gameserver/model/actor/Player ]
          stack = [ class ext/mods/gameserver/data/manager/RelationManager, int, int, int ]

  public void removeFromBlockList(ext.mods.gameserver.model.actor.Player, int);
    descriptor: (Lext/mods/gameserver/model/actor/Player;I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: iload_2
         3: invokevirtual #154                // Method isInBlockList:(Lext/mods/gameserver/model/actor/Player;I)Z
         6: ifne          10
         9: return
        10: aload_1
        11: getstatic     #218                // Field ext/mods/gameserver/network/SystemMessageId.S1_WAS_REMOVED_FROM_YOUR_IGNORE_LIST:Lext/mods/gameserver/network/SystemMessageId;
        14: invokestatic  #179                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        17: iload_2
        18: invokevirtual #185                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addCharName:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        21: invokevirtual #189                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        24: aload_0
        25: aload_1
        26: invokevirtual #149                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        29: iload_2
        30: aload_1
        31: invokevirtual #149                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        34: iload_2
        35: if_icmpge     42
        38: iconst_2
        39: goto          43
        42: iconst_4
        43: iconst_0
        44: invokevirtual #214                // Method updateRelation:(IIIZ)V
        47: return
      LineNumberTable:
        line 185: 0
        line 186: 9
        line 188: 10
        line 190: 24
        line 191: 47
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      48     0  this   Lext/mods/gameserver/data/manager/RelationManager;
            0      48     1 player   Lext/mods/gameserver/model/actor/Player;
            0      48     2 targetId   I
      StackMapTable: number_of_entries = 3
        frame_type = 10 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 31
          locals = [ class ext/mods/gameserver/data/manager/RelationManager, class ext/mods/gameserver/model/actor/Player, int ]
          stack = [ class ext/mods/gameserver/data/manager/RelationManager, int, int ]
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/data/manager/RelationManager, class ext/mods/gameserver/model/actor/Player, int ]
          stack = [ class ext/mods/gameserver/data/manager/RelationManager, int, int, int ]

  public boolean areFriends(int, int);
    descriptor: (II)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=5, args_size=3
         0: new           #42                 // class ext/mods/gameserver/model/records/PlayerPair
         3: dup
         4: iload_1
         5: iload_2
         6: invokespecial #52                 // Method ext/mods/gameserver/model/records/PlayerPair."<init>":(II)V
         9: astore_3
        10: aload_0
        11: getfield      #10                 // Field _relations:Ljava/util/Map;
        14: aload_3
        15: invokeinterface #158,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        20: checkcast     #58                 // class java/lang/Integer
        23: astore        4
        25: aload         4
        27: ifnull        38
        30: aload         4
        32: invokevirtual #127                // Method java/lang/Integer.intValue:()I
        35: ifne          40
        38: iconst_0
        39: ireturn
        40: aload         4
        42: invokevirtual #127                // Method java/lang/Integer.intValue:()I
        45: iconst_1
        46: iand
        47: ifeq          54
        50: iconst_1
        51: goto          55
        54: iconst_0
        55: ireturn
      LineNumberTable:
        line 200: 0
        line 202: 10
        line 203: 25
        line 204: 38
        line 206: 40
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      56     0  this   Lext/mods/gameserver/data/manager/RelationManager;
            0      56     1 playerId   I
            0      56     2 targetId   I
           10      46     3   key   Lext/mods/gameserver/model/records/PlayerPair;
           25      31     4 relation   Ljava/lang/Integer;
      StackMapTable: number_of_entries = 4
        frame_type = 253 /* append */
          offset_delta = 38
          locals = [ class ext/mods/gameserver/model/records/PlayerPair, class java/lang/Integer ]
        frame_type = 1 /* same */
        frame_type = 13 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public java.util.Set<java.lang.Integer> getFriendList(int);
    descriptor: (I)Ljava/util/Set;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=2
         0: new           #162                // class java/util/HashSet
         3: dup
         4: invokespecial #164                // Method java/util/HashSet."<init>":()V
         7: astore_2
         8: aload_0
         9: getfield      #10                 // Field _relations:Ljava/util/Map;
        12: iload_1
        13: aload_2
        14: invokedynamic #221,  0            // InvokeDynamic #1:accept:(ILjava/util/Set;)Ljava/util/function/BiConsumer;
        19: invokeinterface #169,  2          // InterfaceMethod java/util/Map.forEach:(Ljava/util/function/BiConsumer;)V
        24: aload_2
        25: areturn
      LineNumberTable:
        line 215: 0
        line 217: 8
        line 223: 24
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      26     0  this   Lext/mods/gameserver/data/manager/RelationManager;
            0      26     1 playerId   I
            8      18     2 friendList   Ljava/util/Set;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            8      18     2 friendList   Ljava/util/Set<Ljava/lang/Integer;>;
    Signature: #360                         // (I)Ljava/util/Set<Ljava/lang/Integer;>;

  public void addToFriendList(ext.mods.gameserver.model.actor.Player, int);
    descriptor: (Lext/mods/gameserver/model/actor/Player;I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=4, args_size=3
         0: aload_1
         1: invokevirtual #149                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
         4: istore_3
         5: iload_3
         6: iload_2
         7: if_icmpne     11
        10: return
        11: aload_0
        12: iload_3
        13: iload_2
        14: iconst_1
        15: iconst_1
        16: invokevirtual #214                // Method updateRelation:(IIIZ)V
        19: return
      LineNumberTable:
        line 233: 0
        line 234: 5
        line 235: 10
        line 237: 11
        line 238: 19
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      20     0  this   Lext/mods/gameserver/data/manager/RelationManager;
            0      20     1 player   Lext/mods/gameserver/model/actor/Player;
            0      20     2 targetId   I
            5      15     3 playerId   I
      StackMapTable: number_of_entries = 1
        frame_type = 252 /* append */
          offset_delta = 11
          locals = [ int ]

  public void removeFromFriendList(ext.mods.gameserver.model.actor.Player, int);
    descriptor: (Lext/mods/gameserver/model/actor/Player;I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: invokevirtual #149                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
         5: iload_2
         6: invokevirtual #222                // Method areFriends:(II)Z
         9: ifne          13
        12: return
        13: aload_1
        14: getstatic     #226                // Field ext/mods/gameserver/network/SystemMessageId.S1_HAS_BEEN_DELETED_FROM_YOUR_FRIENDS_LIST:Lext/mods/gameserver/network/SystemMessageId;
        17: invokestatic  #179                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        20: iload_2
        21: invokevirtual #185                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addCharName:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        24: invokevirtual #189                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        27: aload_0
        28: aload_1
        29: invokevirtual #149                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        32: iload_2
        33: iconst_1
        34: iconst_0
        35: invokevirtual #214                // Method updateRelation:(IIIZ)V
        38: return
      LineNumberTable:
        line 247: 0
        line 248: 12
        line 250: 13
        line 252: 27
        line 253: 38
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      39     0  this   Lext/mods/gameserver/data/manager/RelationManager;
            0      39     1 player   Lext/mods/gameserver/model/actor/Player;
            0      39     2 targetId   I
      StackMapTable: number_of_entries = 1
        frame_type = 13 /* same */

  public void notifyFriends(ext.mods.gameserver.model.actor.Player, boolean);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Z)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=6, args_size=3
         0: aload_0
         1: aload_1
         2: invokevirtual #149                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
         5: invokevirtual #229                // Method getFriendList:(I)Ljava/util/Set;
         8: invokeinterface #105,  1          // InterfaceMethod java/util/Set.iterator:()Ljava/util/Iterator;
        13: astore_3
        14: aload_3
        15: invokeinterface #111,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        20: ifeq          88
        23: aload_3
        24: invokeinterface #116,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        29: checkcast     #58                 // class java/lang/Integer
        32: invokevirtual #127                // Method java/lang/Integer.intValue:()I
        35: istore        4
        37: invokestatic  #193                // Method ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
        40: iload         4
        42: invokevirtual #199                // Method ext/mods/gameserver/model/World.getPlayer:(I)Lext/mods/gameserver/model/actor/Player;
        45: astore        5
        47: aload         5
        49: ifnull        85
        52: aload         5
        54: new           #233                // class ext/mods/gameserver/network/serverpackets/L2FriendStatus
        57: dup
        58: aload_1
        59: iload_2
        60: invokespecial #235                // Method ext/mods/gameserver/network/serverpackets/L2FriendStatus."<init>":(Lext/mods/gameserver/model/actor/Player;Z)V
        63: invokevirtual #189                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        66: iload_2
        67: ifeq          85
        70: aload         5
        72: getstatic     #238                // Field ext/mods/gameserver/network/SystemMessageId.FRIEND_S1_HAS_LOGGED_IN:Lext/mods/gameserver/network/SystemMessageId;
        75: invokestatic  #179                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        78: aload_1
        79: invokevirtual #241                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addCharName:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        82: invokevirtual #189                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        85: goto          14
        88: return
      LineNumberTable:
        line 262: 0
        line 264: 37
        line 265: 47
        line 267: 52
        line 269: 66
        line 270: 70
        line 272: 85
        line 273: 88
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           47      38     5 friend   Lext/mods/gameserver/model/actor/Player;
           37      48     4    id   I
            0      89     0  this   Lext/mods/gameserver/data/manager/RelationManager;
            0      89     1 player   Lext/mods/gameserver/model/actor/Player;
            0      89     2 isOnline   Z
      StackMapTable: number_of_entries = 3
        frame_type = 252 /* append */
          offset_delta = 14
          locals = [ class java/util/Iterator ]
        frame_type = 251 /* same_frame_extended */
          offset_delta = 70
        frame_type = 250 /* chop */
          offset_delta = 2

  public void sendBlockList(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=5, args_size=2
         0: iconst_1
         1: istore_2
         2: aload_1
         3: getstatic     #244                // Field ext/mods/gameserver/network/SystemMessageId.BLOCK_LIST_HEADER:Lext/mods/gameserver/network/SystemMessageId;
         6: invokevirtual #247                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
         9: aload_0
        10: aload_1
        11: invokevirtual #149                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        14: invokevirtual #250                // Method getBlockList:(I)Ljava/util/Set;
        17: invokeinterface #105,  1          // InterfaceMethod java/util/Set.iterator:()Ljava/util/Iterator;
        22: astore_3
        23: aload_3
        24: invokeinterface #111,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        29: ifeq          70
        32: aload_3
        33: invokeinterface #116,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        38: checkcast     #58                 // class java/lang/Integer
        41: invokevirtual #127                // Method java/lang/Integer.intValue:()I
        44: istore        4
        46: aload_1
        47: iload_2
        48: iinc          2, 1
        51: invokestatic  #253                // Method ext/mods/gameserver/data/sql/PlayerInfoTable.getInstance:()Lext/mods/gameserver/data/sql/PlayerInfoTable;
        54: iload         4
        56: invokevirtual #258                // Method ext/mods/gameserver/data/sql/PlayerInfoTable.getPlayerName:(I)Ljava/lang/String;
        59: invokedynamic #262,  0            // InvokeDynamic #2:makeConcatWithConstants:(ILjava/lang/String;)Ljava/lang/String;
        64: invokevirtual #266                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
        67: goto          23
        70: aload_1
        71: getstatic     #270                // Field ext/mods/gameserver/network/SystemMessageId.FRIEND_LIST_FOOTER:Lext/mods/gameserver/network/SystemMessageId;
        74: invokevirtual #247                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        77: return
      LineNumberTable:
        line 281: 0
        line 282: 2
        line 284: 9
        line 285: 46
        line 287: 70
        line 288: 77
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           46      21     4 playerId   I
            0      78     0  this   Lext/mods/gameserver/data/manager/RelationManager;
            0      78     1 player   Lext/mods/gameserver/model/actor/Player;
            2      76     2     i   I
      StackMapTable: number_of_entries = 2
        frame_type = 253 /* append */
          offset_delta = 23
          locals = [ int, class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 46

  public void removeAllFromFriendList(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokevirtual #149                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
         5: invokevirtual #229                // Method getFriendList:(I)Ljava/util/Set;
         8: aload_0
         9: aload_1
        10: invokedynamic #273,  0            // InvokeDynamic #3:accept:(Lext/mods/gameserver/data/manager/RelationManager;Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/Consumer;
        15: invokeinterface #276,  2          // InterfaceMethod java/util/Set.forEach:(Ljava/util/function/Consumer;)V
        20: return
      LineNumberTable:
        line 296: 0
        line 297: 20
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      21     0  this   Lext/mods/gameserver/data/manager/RelationManager;
            0      21     1 player   Lext/mods/gameserver/model/actor/Player;

  public void removeAllFromBlockList(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokevirtual #149                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
         5: invokevirtual #250                // Method getBlockList:(I)Ljava/util/Set;
         8: aload_0
         9: aload_1
        10: invokedynamic #279,  0            // InvokeDynamic #4:accept:(Lext/mods/gameserver/data/manager/RelationManager;Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/Consumer;
        15: invokeinterface #276,  2          // InterfaceMethod java/util/Set.forEach:(Ljava/util/function/Consumer;)V
        20: return
      LineNumberTable:
        line 305: 0
        line 306: 20
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      21     0  this   Lext/mods/gameserver/data/manager/RelationManager;
            0      21     1 player   Lext/mods/gameserver/model/actor/Player;

  public static final ext.mods.gameserver.data.manager.RelationManager getInstance();
    descriptor: ()Lext/mods/gameserver/data/manager/RelationManager;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #288                // Field ext/mods/gameserver/data/manager/RelationManager$SingletonHolder.INSTANCE:Lext/mods/gameserver/data/manager/RelationManager;
         3: areturn
      LineNumberTable:
        line 336: 0

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=3, locals=0, args_size=0
         0: new           #89                 // class ext/mods/commons/logging/CLogger
         3: dup
         4: ldc           #11                 // class ext/mods/gameserver/data/manager/RelationManager
         6: invokevirtual #309                // Method java/lang/Class.getName:()Ljava/lang/String;
         9: invokespecial #312                // Method ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
        12: putstatic     #82                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
        15: return
      LineNumberTable:
        line 42: 0
}
SourceFile: "RelationManager.java"
NestMembers:
  ext/mods/gameserver/data/manager/RelationManager$SingletonHolder
BootstrapMethods:
  0: #421 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #393 (Ljava/lang/Object;Ljava/lang/Object;)V
      #395 REF_invokeStatic ext/mods/gameserver/data/manager/RelationManager.lambda$getBlockList$0:(ILjava/util/Set;Lext/mods/gameserver/model/records/PlayerPair;Ljava/lang/Integer;)V
      #398 (Lext/mods/gameserver/model/records/PlayerPair;Ljava/lang/Integer;)V
  1: #421 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #393 (Ljava/lang/Object;Ljava/lang/Object;)V
      #400 REF_invokeStatic ext/mods/gameserver/data/manager/RelationManager.lambda$getFriendList$0:(ILjava/util/Set;Lext/mods/gameserver/model/records/PlayerPair;Ljava/lang/Integer;)V
      #398 (Lext/mods/gameserver/model/records/PlayerPair;Ljava/lang/Integer;)V
  2: #428 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #403 \u0001. \u0001
  3: #421 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #405 (Ljava/lang/Object;)V
      #407 REF_invokeVirtual ext/mods/gameserver/data/manager/RelationManager.lambda$removeAllFromFriendList$0:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/Integer;)V
      #410 (Ljava/lang/Integer;)V
  4: #421 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #405 (Ljava/lang/Object;)V
      #412 REF_invokeVirtual ext/mods/gameserver/data/manager/RelationManager.lambda$removeAllFromBlockList$0:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/Integer;)V
      #410 (Ljava/lang/Integer;)V
  5: #421 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #415 (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      #416 REF_invokeStatic ext/mods/gameserver/data/manager/RelationManager.lambda$updateRelation$0:(ZILext/mods/gameserver/model/records/PlayerPair;Ljava/lang/Integer;)Ljava/lang/Integer;
      #419 (Lext/mods/gameserver/model/records/PlayerPair;Ljava/lang/Integer;)Ljava/lang/Integer;
InnerClasses:
  public static #435= #119 of #64;        // Entry=class java/util/Map$Entry of class java/util/Map
  public static final #441= #437 of #439; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
