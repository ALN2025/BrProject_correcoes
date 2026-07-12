// Bytecode for: ext.mods.gameserver.communitybbs.CommunityBoard
// File: ext\mods\gameserver\communitybbs\CommunityBoard.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/communitybbs/CommunityBoard.class
  Last modified 9 de jul de 2026; size 11867 bytes
  MD5 checksum e0af5303bfd08614fa00692ccb7cc7c2
  Compiled from "CommunityBoard.java"
public class ext.mods.gameserver.communitybbs.CommunityBoard
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #14                         // ext/mods/gameserver/communitybbs/CommunityBoard
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 5, methods: 12, attributes: 4
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Methodref          #8.#9         // java/util/concurrent/ConcurrentHashMap.newKeySet:()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;
    #8 = Class              #10           // java/util/concurrent/ConcurrentHashMap
    #9 = NameAndType        #11:#12       // newKeySet:()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;
   #10 = Utf8               java/util/concurrent/ConcurrentHashMap
   #11 = Utf8               newKeySet
   #12 = Utf8               ()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;
   #13 = Fieldref           #14.#15       // ext/mods/gameserver/communitybbs/CommunityBoard._forums:Ljava/util/Set;
   #14 = Class              #16           // ext/mods/gameserver/communitybbs/CommunityBoard
   #15 = NameAndType        #17:#18       // _forums:Ljava/util/Set;
   #16 = Utf8               ext/mods/gameserver/communitybbs/CommunityBoard
   #17 = Utf8               _forums
   #18 = Utf8               Ljava/util/Set;
   #19 = Fieldref           #20.#21       // ext/mods/Config.ENABLE_COMMUNITY_BOARD:Z
   #20 = Class              #22           // ext/mods/Config
   #21 = NameAndType        #23:#24       // ENABLE_COMMUNITY_BOARD:Z
   #22 = Utf8               ext/mods/Config
   #23 = Utf8               ENABLE_COMMUNITY_BOARD
   #24 = Utf8               Z
   #25 = Methodref          #26.#27       // ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
   #26 = Class              #28           // ext/mods/commons/pool/ConnectionPool
   #27 = NameAndType        #29:#30       // getConnection:()Ljava/sql/Connection;
   #28 = Utf8               ext/mods/commons/pool/ConnectionPool
   #29 = Utf8               getConnection
   #30 = Utf8               ()Ljava/sql/Connection;
   #31 = String             #32           // SELECT * FROM bbs_forum
   #32 = Utf8               SELECT * FROM bbs_forum
   #33 = InterfaceMethodref #34.#35       // java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
   #34 = Class              #36           // java/sql/Connection
   #35 = NameAndType        #37:#38       // prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
   #36 = Utf8               java/sql/Connection
   #37 = Utf8               prepareStatement
   #38 = Utf8               (Ljava/lang/String;)Ljava/sql/PreparedStatement;
   #39 = String             #40           // SELECT * FROM bbs_topic ORDER BY id DESC
   #40 = Utf8               SELECT * FROM bbs_topic ORDER BY id DESC
   #41 = String             #42           // SELECT * FROM bbs_post ORDER BY id ASC
   #42 = Utf8               SELECT * FROM bbs_post ORDER BY id ASC
   #43 = InterfaceMethodref #44.#45       // java/sql/PreparedStatement.executeQuery:()Ljava/sql/ResultSet;
   #44 = Class              #46           // java/sql/PreparedStatement
   #45 = NameAndType        #47:#48       // executeQuery:()Ljava/sql/ResultSet;
   #46 = Utf8               java/sql/PreparedStatement
   #47 = Utf8               executeQuery
   #48 = Utf8               ()Ljava/sql/ResultSet;
   #49 = InterfaceMethodref #50.#51       // java/sql/ResultSet.next:()Z
   #50 = Class              #52           // java/sql/ResultSet
   #51 = NameAndType        #53:#54       // next:()Z
   #52 = Utf8               java/sql/ResultSet
   #53 = Utf8               next
   #54 = Utf8               ()Z
   #55 = Class              #56           // ext/mods/gameserver/communitybbs/model/Forum
   #56 = Utf8               ext/mods/gameserver/communitybbs/model/Forum
   #57 = Methodref          #55.#58       // ext/mods/gameserver/communitybbs/model/Forum."<init>":(Ljava/sql/ResultSet;)V
   #58 = NameAndType        #5:#59        // "<init>":(Ljava/sql/ResultSet;)V
   #59 = Utf8               (Ljava/sql/ResultSet;)V
   #60 = Methodref          #14.#61       // ext/mods/gameserver/communitybbs/CommunityBoard.addForum:(Lext/mods/gameserver/communitybbs/model/Forum;)V
   #61 = NameAndType        #62:#63       // addForum:(Lext/mods/gameserver/communitybbs/model/Forum;)V
   #62 = Utf8               addForum
   #63 = Utf8               (Lext/mods/gameserver/communitybbs/model/Forum;)V
   #64 = InterfaceMethodref #50.#65       // java/sql/ResultSet.close:()V
   #65 = NameAndType        #66:#6        // close:()V
   #66 = Utf8               close
   #67 = Class              #68           // java/lang/Throwable
   #68 = Utf8               java/lang/Throwable
   #69 = Methodref          #67.#70       // java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
   #70 = NameAndType        #71:#72       // addSuppressed:(Ljava/lang/Throwable;)V
   #71 = Utf8               addSuppressed
   #72 = Utf8               (Ljava/lang/Throwable;)V
   #73 = String             #74           // forum_id
   #74 = Utf8               forum_id
   #75 = InterfaceMethodref #50.#76       // java/sql/ResultSet.getInt:(Ljava/lang/String;)I
   #76 = NameAndType        #77:#78       // getInt:(Ljava/lang/String;)I
   #77 = Utf8               getInt
   #78 = Utf8               (Ljava/lang/String;)I
   #79 = Methodref          #14.#80       // ext/mods/gameserver/communitybbs/CommunityBoard.getForumByID:(I)Lext/mods/gameserver/communitybbs/model/Forum;
   #80 = NameAndType        #81:#82       // getForumByID:(I)Lext/mods/gameserver/communitybbs/model/Forum;
   #81 = Utf8               getForumByID
   #82 = Utf8               (I)Lext/mods/gameserver/communitybbs/model/Forum;
   #83 = InterfaceMethodref #44.#65       // java/sql/PreparedStatement.close:()V
   #84 = InterfaceMethodref #34.#65       // java/sql/Connection.close:()V
   #85 = Class              #86           // ext/mods/gameserver/communitybbs/model/Topic
   #86 = Utf8               ext/mods/gameserver/communitybbs/model/Topic
   #87 = Methodref          #85.#58       // ext/mods/gameserver/communitybbs/model/Topic."<init>":(Ljava/sql/ResultSet;)V
   #88 = Methodref          #55.#89       // ext/mods/gameserver/communitybbs/model/Forum.addTopic:(Lext/mods/gameserver/communitybbs/model/Topic;)V
   #89 = NameAndType        #90:#91       // addTopic:(Lext/mods/gameserver/communitybbs/model/Topic;)V
   #90 = Utf8               addTopic
   #91 = Utf8               (Lext/mods/gameserver/communitybbs/model/Topic;)V
   #92 = String             #93           // topic_id
   #93 = Utf8               topic_id
   #94 = Methodref          #55.#95       // ext/mods/gameserver/communitybbs/model/Forum.getTopic:(I)Lext/mods/gameserver/communitybbs/model/Topic;
   #95 = NameAndType        #96:#97       // getTopic:(I)Lext/mods/gameserver/communitybbs/model/Topic;
   #96 = Utf8               getTopic
   #97 = Utf8               (I)Lext/mods/gameserver/communitybbs/model/Topic;
   #98 = Class              #99           // ext/mods/gameserver/communitybbs/model/Post
   #99 = Utf8               ext/mods/gameserver/communitybbs/model/Post
  #100 = Methodref          #98.#58       // ext/mods/gameserver/communitybbs/model/Post."<init>":(Ljava/sql/ResultSet;)V
  #101 = Methodref          #85.#102      // ext/mods/gameserver/communitybbs/model/Topic.addPost:(Lext/mods/gameserver/communitybbs/model/Post;)V
  #102 = NameAndType        #103:#104     // addPost:(Lext/mods/gameserver/communitybbs/model/Post;)V
  #103 = Utf8               addPost
  #104 = Utf8               (Lext/mods/gameserver/communitybbs/model/Post;)V
  #105 = Class              #106          // java/lang/Exception
  #106 = Utf8               java/lang/Exception
  #107 = Fieldref           #14.#108      // ext/mods/gameserver/communitybbs/CommunityBoard.LOGGER:Lext/mods/commons/logging/CLogger;
  #108 = NameAndType        #109:#110     // LOGGER:Lext/mods/commons/logging/CLogger;
  #109 = Utf8               LOGGER
  #110 = Utf8               Lext/mods/commons/logging/CLogger;
  #111 = String             #112          // Couldn\'t load forums.
  #112 = Utf8               Couldn\'t load forums.
  #113 = Methodref          #114.#115     // ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
  #114 = Class              #116          // ext/mods/commons/logging/CLogger
  #115 = NameAndType        #117:#118     // error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
  #116 = Utf8               ext/mods/commons/logging/CLogger
  #117 = Utf8               error
  #118 = Utf8               (Ljava/lang/Object;Ljava/lang/Throwable;)V
  #119 = String             #120          // Loaded {} forums.
  #120 = Utf8               Loaded {} forums.
  #121 = InterfaceMethodref #122.#123     // java/util/Set.size:()I
  #122 = Class              #124          // java/util/Set
  #123 = NameAndType        #125:#126     // size:()I
  #124 = Utf8               java/util/Set
  #125 = Utf8               size
  #126 = Utf8               ()I
  #127 = Methodref          #128.#129     // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
  #128 = Class              #130          // java/lang/Integer
  #129 = NameAndType        #131:#132     // valueOf:(I)Ljava/lang/Integer;
  #130 = Utf8               java/lang/Integer
  #131 = Utf8               valueOf
  #132 = Utf8               (I)Ljava/lang/Integer;
  #133 = Methodref          #114.#134     // ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
  #134 = NameAndType        #135:#136     // info:(Ljava/lang/Object;[Ljava/lang/Object;)V
  #135 = Utf8               info
  #136 = Utf8               (Ljava/lang/Object;[Ljava/lang/Object;)V
  #137 = Methodref          #138.#139     // ext/mods/gameserver/network/GameClient.getPlayer:()Lext/mods/gameserver/model/actor/Player;
  #138 = Class              #140          // ext/mods/gameserver/network/GameClient
  #139 = NameAndType        #141:#142     // getPlayer:()Lext/mods/gameserver/model/actor/Player;
  #140 = Utf8               ext/mods/gameserver/network/GameClient
  #141 = Utf8               getPlayer
  #142 = Utf8               ()Lext/mods/gameserver/model/actor/Player;
  #143 = Fieldref           #144.#145     // ext/mods/gameserver/network/SystemMessageId.CB_OFFLINE:Lext/mods/gameserver/network/SystemMessageId;
  #144 = Class              #146          // ext/mods/gameserver/network/SystemMessageId
  #145 = NameAndType        #147:#148     // CB_OFFLINE:Lext/mods/gameserver/network/SystemMessageId;
  #146 = Utf8               ext/mods/gameserver/network/SystemMessageId
  #147 = Utf8               CB_OFFLINE
  #148 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
  #149 = Methodref          #150.#151     // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
  #150 = Class              #152          // ext/mods/gameserver/model/actor/Player
  #151 = NameAndType        #153:#154     // sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
  #152 = Utf8               ext/mods/gameserver/model/actor/Player
  #153 = Utf8               sendPacket
  #154 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
  #155 = String             #156          // _bbshome
  #156 = Utf8               _bbshome
  #157 = Methodref          #158.#159     // java/lang/String.startsWith:(Ljava/lang/String;)Z
  #158 = Class              #160          // java/lang/String
  #159 = NameAndType        #161:#162     // startsWith:(Ljava/lang/String;)Z
  #160 = Utf8               java/lang/String
  #161 = Utf8               startsWith
  #162 = Utf8               (Ljava/lang/String;)Z
  #163 = Methodref          #164.#165     // ext/mods/gameserver/communitybbs/manager/TopBBSManager.getInstance:()Lext/mods/gameserver/communitybbs/manager/TopBBSManager;
  #164 = Class              #166          // ext/mods/gameserver/communitybbs/manager/TopBBSManager
  #165 = NameAndType        #167:#168     // getInstance:()Lext/mods/gameserver/communitybbs/manager/TopBBSManager;
  #166 = Utf8               ext/mods/gameserver/communitybbs/manager/TopBBSManager
  #167 = Utf8               getInstance
  #168 = Utf8               ()Lext/mods/gameserver/communitybbs/manager/TopBBSManager;
  #169 = Methodref          #164.#170     // ext/mods/gameserver/communitybbs/manager/TopBBSManager.parseCmd:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
  #170 = NameAndType        #171:#172     // parseCmd:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
  #171 = Utf8               parseCmd
  #172 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
  #173 = String             #174          // _bbsgetfav
  #174 = Utf8               _bbsgetfav
  #175 = Methodref          #176.#177     // ext/mods/gameserver/communitybbs/manager/FavoriteBBSManager.getInstance:()Lext/mods/gameserver/communitybbs/manager/FavoriteBBSManager;
  #176 = Class              #178          // ext/mods/gameserver/communitybbs/manager/FavoriteBBSManager
  #177 = NameAndType        #167:#179     // getInstance:()Lext/mods/gameserver/communitybbs/manager/FavoriteBBSManager;
  #178 = Utf8               ext/mods/gameserver/communitybbs/manager/FavoriteBBSManager
  #179 = Utf8               ()Lext/mods/gameserver/communitybbs/manager/FavoriteBBSManager;
  #180 = Methodref          #176.#170     // ext/mods/gameserver/communitybbs/manager/FavoriteBBSManager.parseCmd:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
  #181 = String             #182          // _bbsloc
  #182 = Utf8               _bbsloc
  #183 = Methodref          #184.#185     // ext/mods/gameserver/communitybbs/manager/RegionBBSManager.getInstance:()Lext/mods/gameserver/communitybbs/manager/RegionBBSManager;
  #184 = Class              #186          // ext/mods/gameserver/communitybbs/manager/RegionBBSManager
  #185 = NameAndType        #167:#187     // getInstance:()Lext/mods/gameserver/communitybbs/manager/RegionBBSManager;
  #186 = Utf8               ext/mods/gameserver/communitybbs/manager/RegionBBSManager
  #187 = Utf8               ()Lext/mods/gameserver/communitybbs/manager/RegionBBSManager;
  #188 = Methodref          #184.#170     // ext/mods/gameserver/communitybbs/manager/RegionBBSManager.parseCmd:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
  #189 = String             #190          // _bbsclan
  #190 = Utf8               _bbsclan
  #191 = Methodref          #192.#193     // ext/mods/gameserver/communitybbs/manager/ClanBBSManager.getInstance:()Lext/mods/gameserver/communitybbs/manager/ClanBBSManager;
  #192 = Class              #194          // ext/mods/gameserver/communitybbs/manager/ClanBBSManager
  #193 = NameAndType        #167:#195     // getInstance:()Lext/mods/gameserver/communitybbs/manager/ClanBBSManager;
  #194 = Utf8               ext/mods/gameserver/communitybbs/manager/ClanBBSManager
  #195 = Utf8               ()Lext/mods/gameserver/communitybbs/manager/ClanBBSManager;
  #196 = Methodref          #192.#170     // ext/mods/gameserver/communitybbs/manager/ClanBBSManager.parseCmd:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
  #197 = String             #198          // _bbsmemo
  #198 = Utf8               _bbsmemo
  #199 = Methodref          #200.#201     // ext/mods/gameserver/communitybbs/manager/TopicBBSManager.getInstance:()Lext/mods/gameserver/communitybbs/manager/TopicBBSManager;
  #200 = Class              #202          // ext/mods/gameserver/communitybbs/manager/TopicBBSManager
  #201 = NameAndType        #167:#203     // getInstance:()Lext/mods/gameserver/communitybbs/manager/TopicBBSManager;
  #202 = Utf8               ext/mods/gameserver/communitybbs/manager/TopicBBSManager
  #203 = Utf8               ()Lext/mods/gameserver/communitybbs/manager/TopicBBSManager;
  #204 = Methodref          #200.#170     // ext/mods/gameserver/communitybbs/manager/TopicBBSManager.parseCmd:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
  #205 = String             #206          // _bbsmail
  #206 = Utf8               _bbsmail
  #207 = String             #208          // _maillist_0_1_0_
  #208 = Utf8               _maillist_0_1_0_
  #209 = Methodref          #158.#210     // java/lang/String.equals:(Ljava/lang/Object;)Z
  #210 = NameAndType        #211:#212     // equals:(Ljava/lang/Object;)Z
  #211 = Utf8               equals
  #212 = Utf8               (Ljava/lang/Object;)Z
  #213 = Methodref          #214.#215     // ext/mods/gameserver/communitybbs/manager/MailBBSManager.getInstance:()Lext/mods/gameserver/communitybbs/manager/MailBBSManager;
  #214 = Class              #216          // ext/mods/gameserver/communitybbs/manager/MailBBSManager
  #215 = NameAndType        #167:#217     // getInstance:()Lext/mods/gameserver/communitybbs/manager/MailBBSManager;
  #216 = Utf8               ext/mods/gameserver/communitybbs/manager/MailBBSManager
  #217 = Utf8               ()Lext/mods/gameserver/communitybbs/manager/MailBBSManager;
  #218 = Methodref          #214.#170     // ext/mods/gameserver/communitybbs/manager/MailBBSManager.parseCmd:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
  #219 = String             #220          // _friend
  #220 = Utf8               _friend
  #221 = String             #222          // _block
  #222 = Utf8               _block
  #223 = Methodref          #224.#225     // ext/mods/gameserver/communitybbs/manager/FriendsBBSManager.getInstance:()Lext/mods/gameserver/communitybbs/manager/FriendsBBSManager;
  #224 = Class              #226          // ext/mods/gameserver/communitybbs/manager/FriendsBBSManager
  #225 = NameAndType        #167:#227     // getInstance:()Lext/mods/gameserver/communitybbs/manager/FriendsBBSManager;
  #226 = Utf8               ext/mods/gameserver/communitybbs/manager/FriendsBBSManager
  #227 = Utf8               ()Lext/mods/gameserver/communitybbs/manager/FriendsBBSManager;
  #228 = Methodref          #224.#170     // ext/mods/gameserver/communitybbs/manager/FriendsBBSManager.parseCmd:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
  #229 = String             #230          // _bbstopics
  #230 = Utf8               _bbstopics
  #231 = String             #232          // _bbsposts
  #232 = Utf8               _bbsposts
  #233 = Methodref          #234.#235     // ext/mods/gameserver/communitybbs/manager/PostBBSManager.getInstance:()Lext/mods/gameserver/communitybbs/manager/PostBBSManager;
  #234 = Class              #236          // ext/mods/gameserver/communitybbs/manager/PostBBSManager
  #235 = NameAndType        #167:#237     // getInstance:()Lext/mods/gameserver/communitybbs/manager/PostBBSManager;
  #236 = Utf8               ext/mods/gameserver/communitybbs/manager/PostBBSManager
  #237 = Utf8               ()Lext/mods/gameserver/communitybbs/manager/PostBBSManager;
  #238 = Methodref          #234.#170     // ext/mods/gameserver/communitybbs/manager/PostBBSManager.parseCmd:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
  #239 = String             #240          // _bbsmultisell;
  #240 = Utf8               _bbsmultisell;
  #241 = Methodref          #242.#243     // ext/mods/gameserver/data/xml/MultisellData.getInstance:()Lext/mods/gameserver/data/xml/MultisellData;
  #242 = Class              #244          // ext/mods/gameserver/data/xml/MultisellData
  #243 = NameAndType        #167:#245     // getInstance:()Lext/mods/gameserver/data/xml/MultisellData;
  #244 = Utf8               ext/mods/gameserver/data/xml/MultisellData
  #245 = Utf8               ()Lext/mods/gameserver/data/xml/MultisellData;
  #246 = Methodref          #158.#247     // java/lang/String.substring:(I)Ljava/lang/String;
  #247 = NameAndType        #248:#249     // substring:(I)Ljava/lang/String;
  #248 = Utf8               substring
  #249 = Utf8               (I)Ljava/lang/String;
  #250 = Methodref          #158.#251     // java/lang/String.trim:()Ljava/lang/String;
  #251 = NameAndType        #252:#253     // trim:()Ljava/lang/String;
  #252 = Utf8               trim
  #253 = Utf8               ()Ljava/lang/String;
  #254 = Methodref          #242.#255     // ext/mods/gameserver/data/xml/MultisellData.separateAndSendCb:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;Z)V
  #255 = NameAndType        #256:#257     // separateAndSendCb:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;Z)V
  #256 = Utf8               separateAndSendCb
  #257 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;Z)V
  #258 = InvokeDynamic      #0:#259       // #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #259 = NameAndType        #260:#261     // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #260 = Utf8               makeConcatWithConstants
  #261 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
  #262 = Methodref          #263.#264     // ext/mods/gameserver/communitybbs/manager/BaseBBSManager.separateAndSend:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
  #263 = Class              #265          // ext/mods/gameserver/communitybbs/manager/BaseBBSManager
  #264 = NameAndType        #266:#172     // separateAndSend:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
  #265 = Utf8               ext/mods/gameserver/communitybbs/manager/BaseBBSManager
  #266 = Utf8               separateAndSend
  #267 = String             #268          // Topic
  #268 = Utf8               Topic
  #269 = Methodref          #200.#270     // ext/mods/gameserver/communitybbs/manager/TopicBBSManager.parseWrite:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
  #270 = NameAndType        #271:#272     // parseWrite:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
  #271 = Utf8               parseWrite
  #272 = Utf8               (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
  #273 = String             #274          // Post
  #274 = Utf8               Post
  #275 = Methodref          #234.#270     // ext/mods/gameserver/communitybbs/manager/PostBBSManager.parseWrite:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
  #276 = Methodref          #184.#270     // ext/mods/gameserver/communitybbs/manager/RegionBBSManager.parseWrite:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
  #277 = Methodref          #192.#270     // ext/mods/gameserver/communitybbs/manager/ClanBBSManager.parseWrite:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
  #278 = String             #279          // Mail
  #279 = Utf8               Mail
  #280 = Methodref          #214.#270     // ext/mods/gameserver/communitybbs/manager/MailBBSManager.parseWrite:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
  #281 = Methodref          #224.#270     // ext/mods/gameserver/communitybbs/manager/FriendsBBSManager.parseWrite:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
  #282 = InterfaceMethodref #122.#283     // java/util/Set.add:(Ljava/lang/Object;)Z
  #283 = NameAndType        #284:#212     // add:(Ljava/lang/Object;)Z
  #284 = Utf8               add
  #285 = InterfaceMethodref #122.#286     // java/util/Set.stream:()Ljava/util/stream/Stream;
  #286 = NameAndType        #287:#288     // stream:()Ljava/util/stream/Stream;
  #287 = Utf8               stream
  #288 = Utf8               ()Ljava/util/stream/Stream;
  #289 = InvokeDynamic      #1:#290       // #1:applyAsInt:()Ljava/util/function/ToIntFunction;
  #290 = NameAndType        #291:#292     // applyAsInt:()Ljava/util/function/ToIntFunction;
  #291 = Utf8               applyAsInt
  #292 = Utf8               ()Ljava/util/function/ToIntFunction;
  #293 = InterfaceMethodref #294.#295     // java/util/stream/Stream.mapToInt:(Ljava/util/function/ToIntFunction;)Ljava/util/stream/IntStream;
  #294 = Class              #296          // java/util/stream/Stream
  #295 = NameAndType        #297:#298     // mapToInt:(Ljava/util/function/ToIntFunction;)Ljava/util/stream/IntStream;
  #296 = Utf8               java/util/stream/Stream
  #297 = Utf8               mapToInt
  #298 = Utf8               (Ljava/util/function/ToIntFunction;)Ljava/util/stream/IntStream;
  #299 = InterfaceMethodref #300.#301     // java/util/stream/IntStream.max:()Ljava/util/OptionalInt;
  #300 = Class              #302          // java/util/stream/IntStream
  #301 = NameAndType        #303:#304     // max:()Ljava/util/OptionalInt;
  #302 = Utf8               java/util/stream/IntStream
  #303 = Utf8               max
  #304 = Utf8               ()Ljava/util/OptionalInt;
  #305 = Methodref          #306.#307     // java/util/OptionalInt.orElse:(I)I
  #306 = Class              #308          // java/util/OptionalInt
  #307 = NameAndType        #309:#310     // orElse:(I)I
  #308 = Utf8               java/util/OptionalInt
  #309 = Utf8               orElse
  #310 = Utf8               (I)I
  #311 = InvokeDynamic      #2:#312       // #2:test:(Lext/mods/gameserver/enums/bbs/ForumType;I)Ljava/util/function/Predicate;
  #312 = NameAndType        #313:#314     // test:(Lext/mods/gameserver/enums/bbs/ForumType;I)Ljava/util/function/Predicate;
  #313 = Utf8               test
  #314 = Utf8               (Lext/mods/gameserver/enums/bbs/ForumType;I)Ljava/util/function/Predicate;
  #315 = InterfaceMethodref #294.#316     // java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
  #316 = NameAndType        #317:#318     // filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
  #317 = Utf8               filter
  #318 = Utf8               (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
  #319 = InterfaceMethodref #294.#320     // java/util/stream/Stream.findFirst:()Ljava/util/Optional;
  #320 = NameAndType        #321:#322     // findFirst:()Ljava/util/Optional;
  #321 = Utf8               findFirst
  #322 = Utf8               ()Ljava/util/Optional;
  #323 = Methodref          #324.#325     // java/util/Optional.orElse:(Ljava/lang/Object;)Ljava/lang/Object;
  #324 = Class              #326          // java/util/Optional
  #325 = NameAndType        #309:#327     // orElse:(Ljava/lang/Object;)Ljava/lang/Object;
  #326 = Utf8               java/util/Optional
  #327 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
  #328 = InvokeDynamic      #3:#329       // #3:test:(I)Ljava/util/function/Predicate;
  #329 = NameAndType        #313:#330     // test:(I)Ljava/util/function/Predicate;
  #330 = Utf8               (I)Ljava/util/function/Predicate;
  #331 = Methodref          #14.#332      // ext/mods/gameserver/communitybbs/CommunityBoard.getForum:(Lext/mods/gameserver/enums/bbs/ForumType;I)Lext/mods/gameserver/communitybbs/model/Forum;
  #332 = NameAndType        #333:#334     // getForum:(Lext/mods/gameserver/enums/bbs/ForumType;I)Lext/mods/gameserver/communitybbs/model/Forum;
  #333 = Utf8               getForum
  #334 = Utf8               (Lext/mods/gameserver/enums/bbs/ForumType;I)Lext/mods/gameserver/communitybbs/model/Forum;
  #335 = Methodref          #55.#336      // ext/mods/gameserver/communitybbs/model/Forum."<init>":(Lext/mods/gameserver/enums/bbs/ForumType;Lext/mods/gameserver/enums/bbs/ForumAccess;I)V
  #336 = NameAndType        #5:#337       // "<init>":(Lext/mods/gameserver/enums/bbs/ForumType;Lext/mods/gameserver/enums/bbs/ForumAccess;I)V
  #337 = Utf8               (Lext/mods/gameserver/enums/bbs/ForumType;Lext/mods/gameserver/enums/bbs/ForumAccess;I)V
  #338 = Methodref          #55.#339      // ext/mods/gameserver/communitybbs/model/Forum.insertIntoDb:()V
  #339 = NameAndType        #340:#6       // insertIntoDb:()V
  #340 = Utf8               insertIntoDb
  #341 = Fieldref           #342.#343     // ext/mods/gameserver/communitybbs/CommunityBoard$SingletonHolder.INSTANCE:Lext/mods/gameserver/communitybbs/CommunityBoard;
  #342 = Class              #344          // ext/mods/gameserver/communitybbs/CommunityBoard$SingletonHolder
  #343 = NameAndType        #345:#346     // INSTANCE:Lext/mods/gameserver/communitybbs/CommunityBoard;
  #344 = Utf8               ext/mods/gameserver/communitybbs/CommunityBoard$SingletonHolder
  #345 = Utf8               INSTANCE
  #346 = Utf8               Lext/mods/gameserver/communitybbs/CommunityBoard;
  #347 = Methodref          #55.#348      // ext/mods/gameserver/communitybbs/model/Forum.getId:()I
  #348 = NameAndType        #349:#126     // getId:()I
  #349 = Utf8               getId
  #350 = Methodref          #55.#351      // ext/mods/gameserver/communitybbs/model/Forum.getType:()Lext/mods/gameserver/enums/bbs/ForumType;
  #351 = NameAndType        #352:#353     // getType:()Lext/mods/gameserver/enums/bbs/ForumType;
  #352 = Utf8               getType
  #353 = Utf8               ()Lext/mods/gameserver/enums/bbs/ForumType;
  #354 = Methodref          #55.#355      // ext/mods/gameserver/communitybbs/model/Forum.getOwnerId:()I
  #355 = NameAndType        #356:#126     // getOwnerId:()I
  #356 = Utf8               getOwnerId
  #357 = Methodref          #358.#359     // java/lang/Class.getName:()Ljava/lang/String;
  #358 = Class              #360          // java/lang/Class
  #359 = NameAndType        #361:#253     // getName:()Ljava/lang/String;
  #360 = Utf8               java/lang/Class
  #361 = Utf8               getName
  #362 = Methodref          #114.#363     // ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
  #363 = NameAndType        #5:#364       // "<init>":(Ljava/lang/String;)V
  #364 = Utf8               (Ljava/lang/String;)V
  #365 = Utf8               SELECT_FORUMS
  #366 = Utf8               Ljava/lang/String;
  #367 = Utf8               ConstantValue
  #368 = Utf8               SELECT_TOPICS
  #369 = Utf8               SELECT_POSTS
  #370 = Utf8               Signature
  #371 = Utf8               Ljava/util/Set<Lext/mods/gameserver/communitybbs/model/Forum;>;
  #372 = Utf8               Code
  #373 = Utf8               LineNumberTable
  #374 = Utf8               LocalVariableTable
  #375 = Utf8               rs
  #376 = Utf8               Ljava/sql/ResultSet;
  #377 = Utf8               forum
  #378 = Utf8               Lext/mods/gameserver/communitybbs/model/Forum;
  #379 = Utf8               rs2
  #380 = Utf8               topic
  #381 = Utf8               Lext/mods/gameserver/communitybbs/model/Topic;
  #382 = Utf8               rs3
  #383 = Utf8               ps3
  #384 = Utf8               Ljava/sql/PreparedStatement;
  #385 = Utf8               ps2
  #386 = Utf8               ps
  #387 = Utf8               con
  #388 = Utf8               Ljava/sql/Connection;
  #389 = Utf8               e
  #390 = Utf8               Ljava/lang/Exception;
  #391 = Utf8               this
  #392 = Utf8               StackMapTable
  #393 = Utf8               handleCommands
  #394 = Utf8               (Lext/mods/gameserver/network/GameClient;Ljava/lang/String;)V
  #395 = Utf8               client
  #396 = Utf8               Lext/mods/gameserver/network/GameClient;
  #397 = Utf8               command
  #398 = Utf8               player
  #399 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #400 = Utf8               handleWriteCommands
  #401 = Utf8               (Lext/mods/gameserver/network/GameClient;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
  #402 = Utf8               url
  #403 = Utf8               arg1
  #404 = Utf8               arg2
  #405 = Utf8               arg3
  #406 = Utf8               arg4
  #407 = Utf8               arg5
  #408 = Utf8               getANewForumId
  #409 = Utf8               type
  #410 = Utf8               Lext/mods/gameserver/enums/bbs/ForumType;
  #411 = Utf8               ownerId
  #412 = Utf8               I
  #413 = Utf8               id
  #414 = Utf8               getOrCreateForum
  #415 = Utf8               (Lext/mods/gameserver/enums/bbs/ForumType;Lext/mods/gameserver/enums/bbs/ForumAccess;I)Lext/mods/gameserver/communitybbs/model/Forum;
  #416 = Utf8               access
  #417 = Utf8               Lext/mods/gameserver/enums/bbs/ForumAccess;
  #418 = Utf8               ()Lext/mods/gameserver/communitybbs/CommunityBoard;
  #419 = Utf8               lambda$getForumByID$0
  #420 = Utf8               (ILext/mods/gameserver/communitybbs/model/Forum;)Z
  #421 = Utf8               f
  #422 = Utf8               lambda$getForum$0
  #423 = Utf8               (Lext/mods/gameserver/enums/bbs/ForumType;ILext/mods/gameserver/communitybbs/model/Forum;)Z
  #424 = Utf8               <clinit>
  #425 = Utf8               SourceFile
  #426 = Utf8               CommunityBoard.java
  #427 = Utf8               NestMembers
  #428 = Utf8               BootstrapMethods
  #429 = String             #430          // <html><body><br><br><center>The command: \u0001 isn\'t implemented.</center></body></html>
  #430 = Utf8               <html><body><br><br><center>The command: \u0001 isn\'t implemented.</center></body></html>
  #431 = MethodType         #432          //  (Ljava/lang/Object;)I
  #432 = Utf8               (Ljava/lang/Object;)I
  #433 = MethodHandle       5:#347        // REF_invokeVirtual ext/mods/gameserver/communitybbs/model/Forum.getId:()I
  #434 = MethodType         #435          //  (Lext/mods/gameserver/communitybbs/model/Forum;)I
  #435 = Utf8               (Lext/mods/gameserver/communitybbs/model/Forum;)I
  #436 = MethodType         #212          //  (Ljava/lang/Object;)Z
  #437 = MethodHandle       6:#438        // REF_invokeStatic ext/mods/gameserver/communitybbs/CommunityBoard.lambda$getForum$0:(Lext/mods/gameserver/enums/bbs/ForumType;ILext/mods/gameserver/communitybbs/model/Forum;)Z
  #438 = Methodref          #14.#439      // ext/mods/gameserver/communitybbs/CommunityBoard.lambda$getForum$0:(Lext/mods/gameserver/enums/bbs/ForumType;ILext/mods/gameserver/communitybbs/model/Forum;)Z
  #439 = NameAndType        #422:#423     // lambda$getForum$0:(Lext/mods/gameserver/enums/bbs/ForumType;ILext/mods/gameserver/communitybbs/model/Forum;)Z
  #440 = MethodType         #441          //  (Lext/mods/gameserver/communitybbs/model/Forum;)Z
  #441 = Utf8               (Lext/mods/gameserver/communitybbs/model/Forum;)Z
  #442 = MethodHandle       6:#443        // REF_invokeStatic ext/mods/gameserver/communitybbs/CommunityBoard.lambda$getForumByID$0:(ILext/mods/gameserver/communitybbs/model/Forum;)Z
  #443 = Methodref          #14.#444      // ext/mods/gameserver/communitybbs/CommunityBoard.lambda$getForumByID$0:(ILext/mods/gameserver/communitybbs/model/Forum;)Z
  #444 = NameAndType        #419:#420     // lambda$getForumByID$0:(ILext/mods/gameserver/communitybbs/model/Forum;)Z
  #445 = MethodHandle       6:#446        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #446 = Methodref          #447.#448     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #447 = Class              #449          // java/lang/invoke/StringConcatFactory
  #448 = NameAndType        #260:#450     // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #449 = Utf8               java/lang/invoke/StringConcatFactory
  #450 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #451 = MethodHandle       6:#452        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #452 = Methodref          #453.#454     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #453 = Class              #455          // java/lang/invoke/LambdaMetafactory
  #454 = NameAndType        #456:#457     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #455 = Utf8               java/lang/invoke/LambdaMetafactory
  #456 = Utf8               metafactory
  #457 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #458 = Utf8               InnerClasses
  #459 = Class              #460          // java/util/concurrent/ConcurrentHashMap$KeySetView
  #460 = Utf8               java/util/concurrent/ConcurrentHashMap$KeySetView
  #461 = Utf8               KeySetView
  #462 = Utf8               SingletonHolder
  #463 = Class              #464          // java/lang/invoke/MethodHandles$Lookup
  #464 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #465 = Class              #466          // java/lang/invoke/MethodHandles
  #466 = Utf8               java/lang/invoke/MethodHandles
  #467 = Utf8               Lookup
{
  protected ext.mods.gameserver.communitybbs.CommunityBoard();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=6, locals=8, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: invokestatic  #7                  // Method java/util/concurrent/ConcurrentHashMap.newKeySet:()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;
         8: putfield      #13                 // Field _forums:Ljava/util/Set;
        11: getstatic     #19                 // Field ext/mods/Config.ENABLE_COMMUNITY_BOARD:Z
        14: ifne          18
        17: return
        18: invokestatic  #25                 // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
        21: astore_1
        22: aload_1
        23: ldc           #31                 // String SELECT * FROM bbs_forum
        25: invokeinterface #33,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        30: astore_2
        31: aload_1
        32: ldc           #39                 // String SELECT * FROM bbs_topic ORDER BY id DESC
        34: invokeinterface #33,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        39: astore_3
        40: aload_1
        41: ldc           #41                 // String SELECT * FROM bbs_post ORDER BY id ASC
        43: invokeinterface #33,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        48: astore        4
        50: aload_2
        51: invokeinterface #43,  1           // InterfaceMethod java/sql/PreparedStatement.executeQuery:()Ljava/sql/ResultSet;
        56: astore        5
        58: aload         5
        60: invokeinterface #49,  1           // InterfaceMethod java/sql/ResultSet.next:()Z
        65: ifeq          84
        68: aload_0
        69: new           #55                 // class ext/mods/gameserver/communitybbs/model/Forum
        72: dup
        73: aload         5
        75: invokespecial #57                 // Method ext/mods/gameserver/communitybbs/model/Forum."<init>":(Ljava/sql/ResultSet;)V
        78: invokevirtual #60                 // Method addForum:(Lext/mods/gameserver/communitybbs/model/Forum;)V
        81: goto          58
        84: aload         5
        86: ifnull        128
        89: aload         5
        91: invokeinterface #64,  1           // InterfaceMethod java/sql/ResultSet.close:()V
        96: goto          128
        99: astore        6
       101: aload         5
       103: ifnull        125
       106: aload         5
       108: invokeinterface #64,  1           // InterfaceMethod java/sql/ResultSet.close:()V
       113: goto          125
       116: astore        7
       118: aload         6
       120: aload         7
       122: invokevirtual #69                 // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       125: aload         6
       127: athrow
       128: aload_3
       129: invokeinterface #43,  1           // InterfaceMethod java/sql/PreparedStatement.executeQuery:()Ljava/sql/ResultSet;
       134: astore        5
       136: aload         5
       138: invokeinterface #49,  1           // InterfaceMethod java/sql/ResultSet.next:()Z
       143: ifeq          238
       146: aload_0
       147: aload         5
       149: ldc           #73                 // String forum_id
       151: invokeinterface #75,  2           // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
       156: invokevirtual #79                 // Method getForumByID:(I)Lext/mods/gameserver/communitybbs/model/Forum;
       159: astore        6
       161: aload         6
       163: ifnonnull     221
       166: aload         5
       168: ifnull        178
       171: aload         5
       173: invokeinterface #64,  1           // InterfaceMethod java/sql/ResultSet.close:()V
       178: aload         4
       180: ifnull        190
       183: aload         4
       185: invokeinterface #83,  1           // InterfaceMethod java/sql/PreparedStatement.close:()V
       190: aload_3
       191: ifnull        200
       194: aload_3
       195: invokeinterface #83,  1           // InterfaceMethod java/sql/PreparedStatement.close:()V
       200: aload_2
       201: ifnull        210
       204: aload_2
       205: invokeinterface #83,  1           // InterfaceMethod java/sql/PreparedStatement.close:()V
       210: aload_1
       211: ifnull        220
       214: aload_1
       215: invokeinterface #84,  1           // InterfaceMethod java/sql/Connection.close:()V
       220: return
       221: aload         6
       223: new           #85                 // class ext/mods/gameserver/communitybbs/model/Topic
       226: dup
       227: aload         5
       229: invokespecial #87                 // Method ext/mods/gameserver/communitybbs/model/Topic."<init>":(Ljava/sql/ResultSet;)V
       232: invokevirtual #88                 // Method ext/mods/gameserver/communitybbs/model/Forum.addTopic:(Lext/mods/gameserver/communitybbs/model/Topic;)V
       235: goto          136
       238: aload         5
       240: ifnull        282
       243: aload         5
       245: invokeinterface #64,  1           // InterfaceMethod java/sql/ResultSet.close:()V
       250: goto          282
       253: astore        6
       255: aload         5
       257: ifnull        279
       260: aload         5
       262: invokeinterface #64,  1           // InterfaceMethod java/sql/ResultSet.close:()V
       267: goto          279
       270: astore        7
       272: aload         6
       274: aload         7
       276: invokevirtual #69                 // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       279: aload         6
       281: athrow
       282: aload         4
       284: invokeinterface #43,  1           // InterfaceMethod java/sql/PreparedStatement.executeQuery:()Ljava/sql/ResultSet;
       289: astore        5
       291: aload         5
       293: invokeinterface #49,  1           // InterfaceMethod java/sql/ResultSet.next:()Z
       298: ifeq          469
       301: aload_0
       302: aload         5
       304: ldc           #73                 // String forum_id
       306: invokeinterface #75,  2           // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
       311: invokevirtual #79                 // Method getForumByID:(I)Lext/mods/gameserver/communitybbs/model/Forum;
       314: astore        6
       316: aload         6
       318: ifnonnull     376
       321: aload         5
       323: ifnull        333
       326: aload         5
       328: invokeinterface #64,  1           // InterfaceMethod java/sql/ResultSet.close:()V
       333: aload         4
       335: ifnull        345
       338: aload         4
       340: invokeinterface #83,  1           // InterfaceMethod java/sql/PreparedStatement.close:()V
       345: aload_3
       346: ifnull        355
       349: aload_3
       350: invokeinterface #83,  1           // InterfaceMethod java/sql/PreparedStatement.close:()V
       355: aload_2
       356: ifnull        365
       359: aload_2
       360: invokeinterface #83,  1           // InterfaceMethod java/sql/PreparedStatement.close:()V
       365: aload_1
       366: ifnull        375
       369: aload_1
       370: invokeinterface #84,  1           // InterfaceMethod java/sql/Connection.close:()V
       375: return
       376: aload         6
       378: aload         5
       380: ldc           #92                 // String topic_id
       382: invokeinterface #75,  2           // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
       387: invokevirtual #94                 // Method ext/mods/gameserver/communitybbs/model/Forum.getTopic:(I)Lext/mods/gameserver/communitybbs/model/Topic;
       390: astore        7
       392: aload         7
       394: ifnonnull     452
       397: aload         5
       399: ifnull        409
       402: aload         5
       404: invokeinterface #64,  1           // InterfaceMethod java/sql/ResultSet.close:()V
       409: aload         4
       411: ifnull        421
       414: aload         4
       416: invokeinterface #83,  1           // InterfaceMethod java/sql/PreparedStatement.close:()V
       421: aload_3
       422: ifnull        431
       425: aload_3
       426: invokeinterface #83,  1           // InterfaceMethod java/sql/PreparedStatement.close:()V
       431: aload_2
       432: ifnull        441
       435: aload_2
       436: invokeinterface #83,  1           // InterfaceMethod java/sql/PreparedStatement.close:()V
       441: aload_1
       442: ifnull        451
       445: aload_1
       446: invokeinterface #84,  1           // InterfaceMethod java/sql/Connection.close:()V
       451: return
       452: aload         7
       454: new           #98                 // class ext/mods/gameserver/communitybbs/model/Post
       457: dup
       458: aload         5
       460: invokespecial #100                // Method ext/mods/gameserver/communitybbs/model/Post."<init>":(Ljava/sql/ResultSet;)V
       463: invokevirtual #101                // Method ext/mods/gameserver/communitybbs/model/Topic.addPost:(Lext/mods/gameserver/communitybbs/model/Post;)V
       466: goto          291
       469: aload         5
       471: ifnull        513
       474: aload         5
       476: invokeinterface #64,  1           // InterfaceMethod java/sql/ResultSet.close:()V
       481: goto          513
       484: astore        6
       486: aload         5
       488: ifnull        510
       491: aload         5
       493: invokeinterface #64,  1           // InterfaceMethod java/sql/ResultSet.close:()V
       498: goto          510
       501: astore        7
       503: aload         6
       505: aload         7
       507: invokevirtual #69                 // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       510: aload         6
       512: athrow
       513: aload         4
       515: ifnull        557
       518: aload         4
       520: invokeinterface #83,  1           // InterfaceMethod java/sql/PreparedStatement.close:()V
       525: goto          557
       528: astore        5
       530: aload         4
       532: ifnull        554
       535: aload         4
       537: invokeinterface #83,  1           // InterfaceMethod java/sql/PreparedStatement.close:()V
       542: goto          554
       545: astore        6
       547: aload         5
       549: aload         6
       551: invokevirtual #69                 // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       554: aload         5
       556: athrow
       557: aload_3
       558: ifnull        597
       561: aload_3
       562: invokeinterface #83,  1           // InterfaceMethod java/sql/PreparedStatement.close:()V
       567: goto          597
       570: astore        4
       572: aload_3
       573: ifnull        594
       576: aload_3
       577: invokeinterface #83,  1           // InterfaceMethod java/sql/PreparedStatement.close:()V
       582: goto          594
       585: astore        5
       587: aload         4
       589: aload         5
       591: invokevirtual #69                 // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       594: aload         4
       596: athrow
       597: aload_2
       598: ifnull        634
       601: aload_2
       602: invokeinterface #83,  1           // InterfaceMethod java/sql/PreparedStatement.close:()V
       607: goto          634
       610: astore_3
       611: aload_2
       612: ifnull        632
       615: aload_2
       616: invokeinterface #83,  1           // InterfaceMethod java/sql/PreparedStatement.close:()V
       621: goto          632
       624: astore        4
       626: aload_3
       627: aload         4
       629: invokevirtual #69                 // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       632: aload_3
       633: athrow
       634: aload_1
       635: ifnull        669
       638: aload_1
       639: invokeinterface #84,  1           // InterfaceMethod java/sql/Connection.close:()V
       644: goto          669
       647: astore_2
       648: aload_1
       649: ifnull        667
       652: aload_1
       653: invokeinterface #84,  1           // InterfaceMethod java/sql/Connection.close:()V
       658: goto          667
       661: astore_3
       662: aload_2
       663: aload_3
       664: invokevirtual #69                 // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       667: aload_2
       668: athrow
       669: goto          682
       672: astore_1
       673: getstatic     #107                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       676: ldc           #111                // String Couldn\'t load forums.
       678: aload_1
       679: invokevirtual #113                // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
       682: getstatic     #107                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       685: ldc           #119                // String Loaded {} forums.
       687: iconst_1
       688: anewarray     #2                  // class java/lang/Object
       691: dup
       692: iconst_0
       693: aload_0
       694: getfield      #13                 // Field _forums:Ljava/util/Set;
       697: invokeinterface #121,  1          // InterfaceMethod java/util/Set.size:()I
       702: invokestatic  #127                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       705: aastore
       706: invokevirtual #133                // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
       709: return
      Exception table:
         from    to  target type
            58    84    99   Class java/lang/Throwable
           106   113   116   Class java/lang/Throwable
           136   166   253   Class java/lang/Throwable
           221   238   253   Class java/lang/Throwable
           260   267   270   Class java/lang/Throwable
           291   321   484   Class java/lang/Throwable
           376   397   484   Class java/lang/Throwable
           452   469   484   Class java/lang/Throwable
           491   498   501   Class java/lang/Throwable
            50   178   528   Class java/lang/Throwable
           221   333   528   Class java/lang/Throwable
           376   409   528   Class java/lang/Throwable
           452   513   528   Class java/lang/Throwable
           535   542   545   Class java/lang/Throwable
            40   190   570   Class java/lang/Throwable
           221   345   570   Class java/lang/Throwable
           376   421   570   Class java/lang/Throwable
           452   557   570   Class java/lang/Throwable
           576   582   585   Class java/lang/Throwable
            31   200   610   Class java/lang/Throwable
           221   355   610   Class java/lang/Throwable
           376   431   610   Class java/lang/Throwable
           452   597   610   Class java/lang/Throwable
           615   621   624   Class java/lang/Throwable
            22   210   647   Class java/lang/Throwable
           221   365   647   Class java/lang/Throwable
           376   441   647   Class java/lang/Throwable
           452   634   647   Class java/lang/Throwable
           652   658   661   Class java/lang/Throwable
            18   220   672   Class java/lang/Exception
           221   375   672   Class java/lang/Exception
           376   451   672   Class java/lang/Exception
           452   669   672   Class java/lang/Exception
      LineNumberTable:
        line 60: 0
        line 57: 4
        line 61: 11
        line 62: 17
        line 64: 18
        line 65: 22
        line 66: 31
        line 67: 40
        line 69: 50
        line 71: 58
        line 72: 68
        line 73: 84
        line 69: 99
        line 75: 128
        line 77: 136
        line 79: 146
        line 80: 161
        line 85: 166
        line 102: 178
        line 81: 220
        line 83: 221
        line 84: 235
        line 85: 238
        line 75: 253
        line 87: 282
        line 89: 291
        line 91: 301
        line 92: 316
        line 101: 321
        line 102: 333
        line 93: 375
        line 95: 376
        line 96: 392
        line 101: 397
        line 102: 409
        line 97: 451
        line 99: 452
        line 100: 466
        line 101: 469
        line 87: 484
        line 102: 513
        line 64: 528
        line 102: 557
        line 64: 570
        line 102: 597
        line 64: 610
        line 102: 634
        line 64: 647
        line 106: 669
        line 103: 672
        line 105: 673
        line 107: 682
        line 108: 709
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           58      70     5    rs   Ljava/sql/ResultSet;
          161      74     6 forum   Lext/mods/gameserver/communitybbs/model/Forum;
          136     146     5   rs2   Ljava/sql/ResultSet;
          316     150     6 forum   Lext/mods/gameserver/communitybbs/model/Forum;
          392      74     7 topic   Lext/mods/gameserver/communitybbs/model/Topic;
          291     222     5   rs3   Ljava/sql/ResultSet;
           50     507     4   ps3   Ljava/sql/PreparedStatement;
           40     557     3   ps2   Ljava/sql/PreparedStatement;
           31     603     2    ps   Ljava/sql/PreparedStatement;
           22     647     1   con   Ljava/sql/Connection;
          673       9     1     e   Ljava/lang/Exception;
            0     710     0  this   Lext/mods/gameserver/communitybbs/CommunityBoard;
      StackMapTable: number_of_entries = 55
        frame_type = 255 /* full_frame */
          offset_delta = 18
          locals = [ class ext/mods/gameserver/communitybbs/CommunityBoard ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 39
          locals = [ class ext/mods/gameserver/communitybbs/CommunityBoard, class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/PreparedStatement, class java/sql/PreparedStatement, class java/sql/ResultSet ]
          stack = []
        frame_type = 25 /* same */
        frame_type = 78 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/communitybbs/CommunityBoard, class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/PreparedStatement, class java/sql/PreparedStatement, class java/sql/ResultSet, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 252 /* append */
          offset_delta = 7
          locals = [ class java/sql/ResultSet ]
        frame_type = 252 /* append */
          offset_delta = 41
          locals = [ class ext/mods/gameserver/communitybbs/model/Forum ]
        frame_type = 11 /* same */
        frame_type = 9 /* same */
        frame_type = 9 /* same */
        frame_type = 9 /* same */
        frame_type = 0 /* same */
        frame_type = 250 /* chop */
          offset_delta = 16
        frame_type = 78 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/communitybbs/CommunityBoard, class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/PreparedStatement, class java/sql/PreparedStatement, class java/sql/ResultSet, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 252 /* append */
          offset_delta = 8
          locals = [ class java/sql/ResultSet ]
        frame_type = 252 /* append */
          offset_delta = 41
          locals = [ class ext/mods/gameserver/communitybbs/model/Forum ]
        frame_type = 11 /* same */
        frame_type = 9 /* same */
        frame_type = 9 /* same */
        frame_type = 9 /* same */
        frame_type = 0 /* same */
        frame_type = 252 /* append */
          offset_delta = 32
          locals = [ class ext/mods/gameserver/communitybbs/model/Topic ]
        frame_type = 11 /* same */
        frame_type = 9 /* same */
        frame_type = 9 /* same */
        frame_type = 9 /* same */
        frame_type = 0 /* same */
        frame_type = 249 /* chop */
          offset_delta = 16
        frame_type = 78 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/communitybbs/CommunityBoard, class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/PreparedStatement, class java/sql/PreparedStatement, class java/sql/ResultSet, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 78 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/communitybbs/CommunityBoard, class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/PreparedStatement, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 14
          locals = [ class ext/mods/gameserver/communitybbs/CommunityBoard, class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/communitybbs/CommunityBoard, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 7 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/communitybbs/CommunityBoard, class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 5 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 9 /* same */

  public void handleCommands(ext.mods.gameserver.network.GameClient, java.lang.String);
    descriptor: (Lext/mods/gameserver/network/GameClient;Ljava/lang/String;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=4, args_size=3
         0: aload_1
         1: invokevirtual #137                // Method ext/mods/gameserver/network/GameClient.getPlayer:()Lext/mods/gameserver/model/actor/Player;
         4: astore_3
         5: aload_3
         6: ifnonnull     10
         9: return
        10: getstatic     #19                 // Field ext/mods/Config.ENABLE_COMMUNITY_BOARD:Z
        13: ifne          24
        16: aload_3
        17: getstatic     #143                // Field ext/mods/gameserver/network/SystemMessageId.CB_OFFLINE:Lext/mods/gameserver/network/SystemMessageId;
        20: invokevirtual #149                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        23: return
        24: aload_2
        25: ldc           #155                // String _bbshome
        27: invokevirtual #157                // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
        30: ifeq          44
        33: invokestatic  #163                // Method ext/mods/gameserver/communitybbs/manager/TopBBSManager.getInstance:()Lext/mods/gameserver/communitybbs/manager/TopBBSManager;
        36: aload_2
        37: aload_3
        38: invokevirtual #169                // Method ext/mods/gameserver/communitybbs/manager/TopBBSManager.parseCmd:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
        41: goto          261
        44: aload_2
        45: ldc           #173                // String _bbsgetfav
        47: invokevirtual #157                // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
        50: ifeq          64
        53: invokestatic  #175                // Method ext/mods/gameserver/communitybbs/manager/FavoriteBBSManager.getInstance:()Lext/mods/gameserver/communitybbs/manager/FavoriteBBSManager;
        56: aload_2
        57: aload_3
        58: invokevirtual #180                // Method ext/mods/gameserver/communitybbs/manager/FavoriteBBSManager.parseCmd:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
        61: goto          261
        64: aload_2
        65: ldc           #181                // String _bbsloc
        67: invokevirtual #157                // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
        70: ifeq          84
        73: invokestatic  #183                // Method ext/mods/gameserver/communitybbs/manager/RegionBBSManager.getInstance:()Lext/mods/gameserver/communitybbs/manager/RegionBBSManager;
        76: aload_2
        77: aload_3
        78: invokevirtual #188                // Method ext/mods/gameserver/communitybbs/manager/RegionBBSManager.parseCmd:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
        81: goto          261
        84: aload_2
        85: ldc           #189                // String _bbsclan
        87: invokevirtual #157                // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
        90: ifeq          104
        93: invokestatic  #191                // Method ext/mods/gameserver/communitybbs/manager/ClanBBSManager.getInstance:()Lext/mods/gameserver/communitybbs/manager/ClanBBSManager;
        96: aload_2
        97: aload_3
        98: invokevirtual #196                // Method ext/mods/gameserver/communitybbs/manager/ClanBBSManager.parseCmd:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
       101: goto          261
       104: aload_2
       105: ldc           #197                // String _bbsmemo
       107: invokevirtual #157                // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
       110: ifeq          124
       113: invokestatic  #199                // Method ext/mods/gameserver/communitybbs/manager/TopicBBSManager.getInstance:()Lext/mods/gameserver/communitybbs/manager/TopicBBSManager;
       116: aload_2
       117: aload_3
       118: invokevirtual #204                // Method ext/mods/gameserver/communitybbs/manager/TopicBBSManager.parseCmd:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
       121: goto          261
       124: aload_2
       125: ldc           #205                // String _bbsmail
       127: invokevirtual #157                // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
       130: ifne          142
       133: aload_2
       134: ldc           #207                // String _maillist_0_1_0_
       136: invokevirtual #209                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       139: ifeq          153
       142: invokestatic  #213                // Method ext/mods/gameserver/communitybbs/manager/MailBBSManager.getInstance:()Lext/mods/gameserver/communitybbs/manager/MailBBSManager;
       145: aload_2
       146: aload_3
       147: invokevirtual #218                // Method ext/mods/gameserver/communitybbs/manager/MailBBSManager.parseCmd:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
       150: goto          261
       153: aload_2
       154: ldc           #219                // String _friend
       156: invokevirtual #157                // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
       159: ifne          171
       162: aload_2
       163: ldc           #221                // String _block
       165: invokevirtual #157                // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
       168: ifeq          182
       171: invokestatic  #223                // Method ext/mods/gameserver/communitybbs/manager/FriendsBBSManager.getInstance:()Lext/mods/gameserver/communitybbs/manager/FriendsBBSManager;
       174: aload_2
       175: aload_3
       176: invokevirtual #228                // Method ext/mods/gameserver/communitybbs/manager/FriendsBBSManager.parseCmd:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
       179: goto          261
       182: aload_2
       183: ldc           #229                // String _bbstopics
       185: invokevirtual #157                // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
       188: ifeq          202
       191: invokestatic  #199                // Method ext/mods/gameserver/communitybbs/manager/TopicBBSManager.getInstance:()Lext/mods/gameserver/communitybbs/manager/TopicBBSManager;
       194: aload_2
       195: aload_3
       196: invokevirtual #204                // Method ext/mods/gameserver/communitybbs/manager/TopicBBSManager.parseCmd:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
       199: goto          261
       202: aload_2
       203: ldc           #231                // String _bbsposts
       205: invokevirtual #157                // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
       208: ifeq          222
       211: invokestatic  #233                // Method ext/mods/gameserver/communitybbs/manager/PostBBSManager.getInstance:()Lext/mods/gameserver/communitybbs/manager/PostBBSManager;
       214: aload_2
       215: aload_3
       216: invokevirtual #238                // Method ext/mods/gameserver/communitybbs/manager/PostBBSManager.parseCmd:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
       219: goto          261
       222: aload_2
       223: ldc           #239                // String _bbsmultisell;
       225: invokevirtual #157                // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
       228: ifeq          251
       231: invokestatic  #241                // Method ext/mods/gameserver/data/xml/MultisellData.getInstance:()Lext/mods/gameserver/data/xml/MultisellData;
       234: aload_2
       235: bipush        14
       237: invokevirtual #246                // Method java/lang/String.substring:(I)Ljava/lang/String;
       240: invokevirtual #250                // Method java/lang/String.trim:()Ljava/lang/String;
       243: aload_3
       244: iconst_0
       245: invokevirtual #254                // Method ext/mods/gameserver/data/xml/MultisellData.separateAndSendCb:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;Z)V
       248: goto          261
       251: aload_2
       252: invokedynamic #258,  0            // InvokeDynamic #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       257: aload_3
       258: invokestatic  #262                // Method ext/mods/gameserver/communitybbs/manager/BaseBBSManager.separateAndSend:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
       261: return
      LineNumberTable:
        line 112: 0
        line 113: 5
        line 114: 9
        line 116: 10
        line 118: 16
        line 119: 23
        line 122: 24
        line 123: 33
        line 124: 44
        line 125: 53
        line 126: 64
        line 127: 73
        line 128: 84
        line 129: 93
        line 130: 104
        line 131: 113
        line 132: 124
        line 133: 142
        line 134: 153
        line 135: 171
        line 136: 182
        line 137: 191
        line 138: 202
        line 139: 211
        line 140: 222
        line 141: 231
        line 143: 251
        line 144: 261
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     262     0  this   Lext/mods/gameserver/communitybbs/CommunityBoard;
            0     262     1 client   Lext/mods/gameserver/network/GameClient;
            0     262     2 command   Ljava/lang/String;
            5     257     3 player   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 15
        frame_type = 252 /* append */
          offset_delta = 10
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 13 /* same */
        frame_type = 19 /* same */
        frame_type = 19 /* same */
        frame_type = 19 /* same */
        frame_type = 19 /* same */
        frame_type = 19 /* same */
        frame_type = 17 /* same */
        frame_type = 10 /* same */
        frame_type = 17 /* same */
        frame_type = 10 /* same */
        frame_type = 19 /* same */
        frame_type = 19 /* same */
        frame_type = 28 /* same */
        frame_type = 9 /* same */

  public void handleWriteCommands(ext.mods.gameserver.network.GameClient, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String);
    descriptor: (Lext/mods/gameserver/network/GameClient;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=7, locals=9, args_size=8
         0: aload_1
         1: invokevirtual #137                // Method ext/mods/gameserver/network/GameClient.getPlayer:()Lext/mods/gameserver/model/actor/Player;
         4: astore        8
         6: aload         8
         8: ifnonnull     12
        11: return
        12: getstatic     #19                 // Field ext/mods/Config.ENABLE_COMMUNITY_BOARD:Z
        15: ifne          27
        18: aload         8
        20: getstatic     #143                // Field ext/mods/gameserver/network/SystemMessageId.CB_OFFLINE:Lext/mods/gameserver/network/SystemMessageId;
        23: invokevirtual #149                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        26: return
        27: aload_2
        28: ldc_w         #267                // String Topic
        31: invokevirtual #209                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
        34: ifeq          57
        37: invokestatic  #199                // Method ext/mods/gameserver/communitybbs/manager/TopicBBSManager.getInstance:()Lext/mods/gameserver/communitybbs/manager/TopicBBSManager;
        40: aload_3
        41: aload         4
        43: aload         5
        45: aload         6
        47: aload         7
        49: aload         8
        51: invokevirtual #269                // Method ext/mods/gameserver/communitybbs/manager/TopicBBSManager.parseWrite:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
        54: goto          215
        57: aload_2
        58: ldc_w         #273                // String Post
        61: invokevirtual #209                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
        64: ifeq          87
        67: invokestatic  #233                // Method ext/mods/gameserver/communitybbs/manager/PostBBSManager.getInstance:()Lext/mods/gameserver/communitybbs/manager/PostBBSManager;
        70: aload_3
        71: aload         4
        73: aload         5
        75: aload         6
        77: aload         7
        79: aload         8
        81: invokevirtual #275                // Method ext/mods/gameserver/communitybbs/manager/PostBBSManager.parseWrite:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
        84: goto          215
        87: aload_2
        88: ldc           #181                // String _bbsloc
        90: invokevirtual #209                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
        93: ifeq          116
        96: invokestatic  #183                // Method ext/mods/gameserver/communitybbs/manager/RegionBBSManager.getInstance:()Lext/mods/gameserver/communitybbs/manager/RegionBBSManager;
        99: aload_3
       100: aload         4
       102: aload         5
       104: aload         6
       106: aload         7
       108: aload         8
       110: invokevirtual #276                // Method ext/mods/gameserver/communitybbs/manager/RegionBBSManager.parseWrite:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
       113: goto          215
       116: aload_2
       117: ldc           #189                // String _bbsclan
       119: invokevirtual #209                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       122: ifeq          145
       125: invokestatic  #191                // Method ext/mods/gameserver/communitybbs/manager/ClanBBSManager.getInstance:()Lext/mods/gameserver/communitybbs/manager/ClanBBSManager;
       128: aload_3
       129: aload         4
       131: aload         5
       133: aload         6
       135: aload         7
       137: aload         8
       139: invokevirtual #277                // Method ext/mods/gameserver/communitybbs/manager/ClanBBSManager.parseWrite:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
       142: goto          215
       145: aload_2
       146: ldc_w         #278                // String Mail
       149: invokevirtual #209                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       152: ifeq          175
       155: invokestatic  #213                // Method ext/mods/gameserver/communitybbs/manager/MailBBSManager.getInstance:()Lext/mods/gameserver/communitybbs/manager/MailBBSManager;
       158: aload_3
       159: aload         4
       161: aload         5
       163: aload         6
       165: aload         7
       167: aload         8
       169: invokevirtual #280                // Method ext/mods/gameserver/communitybbs/manager/MailBBSManager.parseWrite:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
       172: goto          215
       175: aload_2
       176: ldc           #219                // String _friend
       178: invokevirtual #209                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       181: ifeq          204
       184: invokestatic  #223                // Method ext/mods/gameserver/communitybbs/manager/FriendsBBSManager.getInstance:()Lext/mods/gameserver/communitybbs/manager/FriendsBBSManager;
       187: aload_3
       188: aload         4
       190: aload         5
       192: aload         6
       194: aload         7
       196: aload         8
       198: invokevirtual #281                // Method ext/mods/gameserver/communitybbs/manager/FriendsBBSManager.parseWrite:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
       201: goto          215
       204: aload_2
       205: invokedynamic #258,  0            // InvokeDynamic #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       210: aload         8
       212: invokestatic  #262                // Method ext/mods/gameserver/communitybbs/manager/BaseBBSManager.separateAndSend:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
       215: return
      LineNumberTable:
        line 148: 0
        line 149: 6
        line 150: 11
        line 152: 12
        line 154: 18
        line 155: 26
        line 158: 27
        line 159: 37
        line 160: 57
        line 161: 67
        line 162: 87
        line 163: 96
        line 164: 116
        line 165: 125
        line 166: 145
        line 167: 155
        line 168: 175
        line 169: 184
        line 171: 204
        line 172: 215
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     216     0  this   Lext/mods/gameserver/communitybbs/CommunityBoard;
            0     216     1 client   Lext/mods/gameserver/network/GameClient;
            0     216     2   url   Ljava/lang/String;
            0     216     3  arg1   Ljava/lang/String;
            0     216     4  arg2   Ljava/lang/String;
            0     216     5  arg3   Ljava/lang/String;
            0     216     6  arg4   Ljava/lang/String;
            0     216     7  arg5   Ljava/lang/String;
            6     210     8 player   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 9
        frame_type = 252 /* append */
          offset_delta = 12
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 14 /* same */
        frame_type = 29 /* same */
        frame_type = 29 /* same */
        frame_type = 28 /* same */
        frame_type = 28 /* same */
        frame_type = 29 /* same */
        frame_type = 28 /* same */
        frame_type = 10 /* same */

  public void addForum(ext.mods.gameserver.communitybbs.model.Forum);
    descriptor: (Lext/mods/gameserver/communitybbs/model/Forum;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_1
         1: ifnonnull     5
         4: return
         5: aload_0
         6: getfield      #13                 // Field _forums:Ljava/util/Set;
         9: aload_1
        10: invokeinterface #282,  2          // InterfaceMethod java/util/Set.add:(Ljava/lang/Object;)Z
        15: pop
        16: return
      LineNumberTable:
        line 176: 0
        line 177: 4
        line 179: 5
        line 180: 16
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      17     0  this   Lext/mods/gameserver/communitybbs/CommunityBoard;
            0      17     1 forum   Lext/mods/gameserver/communitybbs/model/Forum;
      StackMapTable: number_of_entries = 1
        frame_type = 5 /* same */

  public int getANewForumId();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field _forums:Ljava/util/Set;
         4: invokeinterface #285,  1          // InterfaceMethod java/util/Set.stream:()Ljava/util/stream/Stream;
         9: invokedynamic #289,  0            // InvokeDynamic #1:applyAsInt:()Ljava/util/function/ToIntFunction;
        14: invokeinterface #293,  2          // InterfaceMethod java/util/stream/Stream.mapToInt:(Ljava/util/function/ToIntFunction;)Ljava/util/stream/IntStream;
        19: invokeinterface #299,  1          // InterfaceMethod java/util/stream/IntStream.max:()Ljava/util/OptionalInt;
        24: iconst_0
        25: invokevirtual #305                // Method java/util/OptionalInt.orElse:(I)I
        28: iconst_1
        29: iadd
        30: ireturn
      LineNumberTable:
        line 184: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      31     0  this   Lext/mods/gameserver/communitybbs/CommunityBoard;

  public ext.mods.gameserver.communitybbs.model.Forum getForum(ext.mods.gameserver.enums.bbs.ForumType, int);
    descriptor: (Lext/mods/gameserver/enums/bbs/ForumType;I)Lext/mods/gameserver/communitybbs/model/Forum;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: getfield      #13                 // Field _forums:Ljava/util/Set;
         4: invokeinterface #285,  1          // InterfaceMethod java/util/Set.stream:()Ljava/util/stream/Stream;
         9: aload_1
        10: iload_2
        11: invokedynamic #311,  0            // InvokeDynamic #2:test:(Lext/mods/gameserver/enums/bbs/ForumType;I)Ljava/util/function/Predicate;
        16: invokeinterface #315,  2          // InterfaceMethod java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
        21: invokeinterface #319,  1          // InterfaceMethod java/util/stream/Stream.findFirst:()Ljava/util/Optional;
        26: aconst_null
        27: invokevirtual #323                // Method java/util/Optional.orElse:(Ljava/lang/Object;)Ljava/lang/Object;
        30: checkcast     #55                 // class ext/mods/gameserver/communitybbs/model/Forum
        33: areturn
      LineNumberTable:
        line 189: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      34     0  this   Lext/mods/gameserver/communitybbs/CommunityBoard;
            0      34     1  type   Lext/mods/gameserver/enums/bbs/ForumType;
            0      34     2 ownerId   I

  public ext.mods.gameserver.communitybbs.model.Forum getForumByID(int);
    descriptor: (I)Lext/mods/gameserver/communitybbs/model/Forum;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #13                 // Field _forums:Ljava/util/Set;
         4: invokeinterface #285,  1          // InterfaceMethod java/util/Set.stream:()Ljava/util/stream/Stream;
         9: iload_1
        10: invokedynamic #328,  0            // InvokeDynamic #3:test:(I)Ljava/util/function/Predicate;
        15: invokeinterface #315,  2          // InterfaceMethod java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
        20: invokeinterface #319,  1          // InterfaceMethod java/util/stream/Stream.findFirst:()Ljava/util/Optional;
        25: aconst_null
        26: invokevirtual #323                // Method java/util/Optional.orElse:(Ljava/lang/Object;)Ljava/lang/Object;
        29: checkcast     #55                 // class ext/mods/gameserver/communitybbs/model/Forum
        32: areturn
      LineNumberTable:
        line 194: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      33     0  this   Lext/mods/gameserver/communitybbs/CommunityBoard;
            0      33     1    id   I

  public ext.mods.gameserver.communitybbs.model.Forum getOrCreateForum(ext.mods.gameserver.enums.bbs.ForumType, ext.mods.gameserver.enums.bbs.ForumAccess, int);
    descriptor: (Lext/mods/gameserver/enums/bbs/ForumType;Lext/mods/gameserver/enums/bbs/ForumAccess;I)Lext/mods/gameserver/communitybbs/model/Forum;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=5, args_size=4
         0: aload_0
         1: aload_1
         2: iload_3
         3: invokevirtual #331                // Method getForum:(Lext/mods/gameserver/enums/bbs/ForumType;I)Lext/mods/gameserver/communitybbs/model/Forum;
         6: astore        4
         8: aload         4
        10: ifnull        16
        13: aload         4
        15: areturn
        16: new           #55                 // class ext/mods/gameserver/communitybbs/model/Forum
        19: dup
        20: aload_1
        21: aload_2
        22: iload_3
        23: invokespecial #335                // Method ext/mods/gameserver/communitybbs/model/Forum."<init>":(Lext/mods/gameserver/enums/bbs/ForumType;Lext/mods/gameserver/enums/bbs/ForumAccess;I)V
        26: astore        4
        28: aload         4
        30: invokevirtual #338                // Method ext/mods/gameserver/communitybbs/model/Forum.insertIntoDb:()V
        33: aload_0
        34: aload         4
        36: invokevirtual #60                 // Method addForum:(Lext/mods/gameserver/communitybbs/model/Forum;)V
        39: aload         4
        41: areturn
      LineNumberTable:
        line 199: 0
        line 200: 8
        line 201: 13
        line 203: 16
        line 204: 28
        line 206: 33
        line 208: 39
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      42     0  this   Lext/mods/gameserver/communitybbs/CommunityBoard;
            0      42     1  type   Lext/mods/gameserver/enums/bbs/ForumType;
            0      42     2 access   Lext/mods/gameserver/enums/bbs/ForumAccess;
            0      42     3 ownerId   I
            8      34     4 forum   Lext/mods/gameserver/communitybbs/model/Forum;
      StackMapTable: number_of_entries = 1
        frame_type = 252 /* append */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/communitybbs/model/Forum ]

  public static ext.mods.gameserver.communitybbs.CommunityBoard getInstance();
    descriptor: ()Lext/mods/gameserver/communitybbs/CommunityBoard;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #341                // Field ext/mods/gameserver/communitybbs/CommunityBoard$SingletonHolder.INSTANCE:Lext/mods/gameserver/communitybbs/CommunityBoard;
         3: areturn
      LineNumberTable:
        line 213: 0

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=3, locals=0, args_size=0
         0: new           #114                // class ext/mods/commons/logging/CLogger
         3: dup
         4: ldc           #14                 // class ext/mods/gameserver/communitybbs/CommunityBoard
         6: invokevirtual #357                // Method java/lang/Class.getName:()Ljava/lang/String;
         9: invokespecial #362                // Method ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
        12: putstatic     #107                // Field LOGGER:Lext/mods/commons/logging/CLogger;
        15: return
      LineNumberTable:
        line 51: 0
}
SourceFile: "CommunityBoard.java"
NestMembers:
  ext/mods/gameserver/communitybbs/CommunityBoard$SingletonHolder
BootstrapMethods:
  0: #445 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #429 <html><body><br><br><center>The command: \u0001 isn\'t implemented.</center></body></html>
  1: #451 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #431 (Ljava/lang/Object;)I
      #433 REF_invokeVirtual ext/mods/gameserver/communitybbs/model/Forum.getId:()I
      #434 (Lext/mods/gameserver/communitybbs/model/Forum;)I
  2: #451 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #436 (Ljava/lang/Object;)Z
      #437 REF_invokeStatic ext/mods/gameserver/communitybbs/CommunityBoard.lambda$getForum$0:(Lext/mods/gameserver/enums/bbs/ForumType;ILext/mods/gameserver/communitybbs/model/Forum;)Z
      #440 (Lext/mods/gameserver/communitybbs/model/Forum;)Z
  3: #451 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #436 (Ljava/lang/Object;)Z
      #442 REF_invokeStatic ext/mods/gameserver/communitybbs/CommunityBoard.lambda$getForumByID$0:(ILext/mods/gameserver/communitybbs/model/Forum;)Z
      #440 (Lext/mods/gameserver/communitybbs/model/Forum;)Z
InnerClasses:
  public static final #461= #459 of #8;   // KeySetView=class java/util/concurrent/ConcurrentHashMap$KeySetView of class java/util/concurrent/ConcurrentHashMap
  public static final #467= #463 of #465; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
