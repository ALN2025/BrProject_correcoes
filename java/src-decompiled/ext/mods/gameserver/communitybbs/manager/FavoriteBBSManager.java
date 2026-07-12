// Bytecode for: ext.mods.gameserver.communitybbs.manager.FavoriteBBSManager
// File: ext\mods\gameserver\communitybbs\manager\FavoriteBBSManager.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/communitybbs/manager/FavoriteBBSManager.class
  Last modified 9 de jul de 2026; size 8800 bytes
  MD5 checksum 80b6fe3289f87a70fb124702b1591c00
  Compiled from "FavoriteBBSManager.java"
public class ext.mods.gameserver.communitybbs.manager.FavoriteBBSManager extends ext.mods.gameserver.communitybbs.manager.BaseBBSManager
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #11                         // ext/mods/gameserver/communitybbs/manager/FavoriteBBSManager
  super_class: #2                         // ext/mods/gameserver/communitybbs/manager/BaseBBSManager
  interfaces: 0, fields: 5, methods: 8, attributes: 4
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/gameserver/communitybbs/manager/BaseBBSManager."<init>":()V
    #2 = Class              #4            // ext/mods/gameserver/communitybbs/manager/BaseBBSManager
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               ext/mods/gameserver/communitybbs/manager/BaseBBSManager
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Class              #8            // java/util/concurrent/ConcurrentHashMap
    #8 = Utf8               java/util/concurrent/ConcurrentHashMap
    #9 = Methodref          #7.#3         // java/util/concurrent/ConcurrentHashMap."<init>":()V
   #10 = Fieldref           #11.#12       // ext/mods/gameserver/communitybbs/manager/FavoriteBBSManager._favorites:Ljava/util/Map;
   #11 = Class              #13           // ext/mods/gameserver/communitybbs/manager/FavoriteBBSManager
   #12 = NameAndType        #14:#15       // _favorites:Ljava/util/Map;
   #13 = Utf8               ext/mods/gameserver/communitybbs/manager/FavoriteBBSManager
   #14 = Utf8               _favorites
   #15 = Utf8               Ljava/util/Map;
   #16 = Fieldref           #11.#17       // ext/mods/gameserver/communitybbs/manager/FavoriteBBSManager._lastFavoriteId:I
   #17 = NameAndType        #18:#19       // _lastFavoriteId:I
   #18 = Utf8               _lastFavoriteId
   #19 = Utf8               I
   #20 = Methodref          #21.#22       // ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
   #21 = Class              #23           // ext/mods/commons/pool/ConnectionPool
   #22 = NameAndType        #24:#25       // getConnection:()Ljava/sql/Connection;
   #23 = Utf8               ext/mods/commons/pool/ConnectionPool
   #24 = Utf8               getConnection
   #25 = Utf8               ()Ljava/sql/Connection;
   #26 = String             #27           // SELECT * FROM bbs_favorite ORDER BY id ASC
   #27 = Utf8               SELECT * FROM bbs_favorite ORDER BY id ASC
   #28 = InterfaceMethodref #29.#30       // java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
   #29 = Class              #31           // java/sql/Connection
   #30 = NameAndType        #32:#33       // prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
   #31 = Utf8               java/sql/Connection
   #32 = Utf8               prepareStatement
   #33 = Utf8               (Ljava/lang/String;)Ljava/sql/PreparedStatement;
   #34 = InterfaceMethodref #35.#36       // java/sql/PreparedStatement.executeQuery:()Ljava/sql/ResultSet;
   #35 = Class              #37           // java/sql/PreparedStatement
   #36 = NameAndType        #38:#39       // executeQuery:()Ljava/sql/ResultSet;
   #37 = Utf8               java/sql/PreparedStatement
   #38 = Utf8               executeQuery
   #39 = Utf8               ()Ljava/sql/ResultSet;
   #40 = InterfaceMethodref #41.#42       // java/sql/ResultSet.next:()Z
   #41 = Class              #43           // java/sql/ResultSet
   #42 = NameAndType        #44:#45       // next:()Z
   #43 = Utf8               java/sql/ResultSet
   #44 = Utf8               next
   #45 = Utf8               ()Z
   #46 = String             #47           // player_id
   #47 = Utf8               player_id
   #48 = InterfaceMethodref #41.#49       // java/sql/ResultSet.getInt:(Ljava/lang/String;)I
   #49 = NameAndType        #50:#51       // getInt:(Ljava/lang/String;)I
   #50 = Utf8               getInt
   #51 = Utf8               (Ljava/lang/String;)I
   #52 = Methodref          #11.#53       // ext/mods/gameserver/communitybbs/manager/FavoriteBBSManager.getFavorites:(I)Ljava/util/Set;
   #53 = NameAndType        #54:#55       // getFavorites:(I)Ljava/util/Set;
   #54 = Utf8               getFavorites
   #55 = Utf8               (I)Ljava/util/Set;
   #56 = Class              #57           // ext/mods/gameserver/communitybbs/model/Favorite
   #57 = Utf8               ext/mods/gameserver/communitybbs/model/Favorite
   #58 = Methodref          #56.#59       // ext/mods/gameserver/communitybbs/model/Favorite."<init>":(Ljava/sql/ResultSet;)V
   #59 = NameAndType        #5:#60        // "<init>":(Ljava/sql/ResultSet;)V
   #60 = Utf8               (Ljava/sql/ResultSet;)V
   #61 = InterfaceMethodref #62.#63       // java/util/Set.add:(Ljava/lang/Object;)Z
   #62 = Class              #64           // java/util/Set
   #63 = NameAndType        #65:#66       // add:(Ljava/lang/Object;)Z
   #64 = Utf8               java/util/Set
   #65 = Utf8               add
   #66 = Utf8               (Ljava/lang/Object;)Z
   #67 = String             #68           // id
   #68 = Utf8               id
   #69 = InterfaceMethodref #41.#70       // java/sql/ResultSet.close:()V
   #70 = NameAndType        #71:#6        // close:()V
   #71 = Utf8               close
   #72 = Class              #73           // java/lang/Throwable
   #73 = Utf8               java/lang/Throwable
   #74 = Methodref          #72.#75       // java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
   #75 = NameAndType        #76:#77       // addSuppressed:(Ljava/lang/Throwable;)V
   #76 = Utf8               addSuppressed
   #77 = Utf8               (Ljava/lang/Throwable;)V
   #78 = InterfaceMethodref #35.#70       // java/sql/PreparedStatement.close:()V
   #79 = InterfaceMethodref #29.#70       // java/sql/Connection.close:()V
   #80 = Class              #81           // java/lang/Exception
   #81 = Utf8               java/lang/Exception
   #82 = Fieldref           #11.#83       // ext/mods/gameserver/communitybbs/manager/FavoriteBBSManager.LOGGER:Lext/mods/commons/logging/CLogger;
   #83 = NameAndType        #84:#85       // LOGGER:Lext/mods/commons/logging/CLogger;
   #84 = Utf8               LOGGER
   #85 = Utf8               Lext/mods/commons/logging/CLogger;
   #86 = String             #87           // Couldn\'t load favorites.
   #87 = Utf8               Couldn\'t load favorites.
   #88 = Methodref          #89.#90       // ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
   #89 = Class              #91           // ext/mods/commons/logging/CLogger
   #90 = NameAndType        #92:#93       // error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
   #91 = Utf8               ext/mods/commons/logging/CLogger
   #92 = Utf8               error
   #93 = Utf8               (Ljava/lang/Object;Ljava/lang/Throwable;)V
   #94 = String             #95           // _bbsgetfav
   #95 = Utf8               _bbsgetfav
   #96 = Methodref          #97.#98       // java/lang/String.equals:(Ljava/lang/Object;)Z
   #97 = Class              #99           // java/lang/String
   #98 = NameAndType        #100:#66      // equals:(Ljava/lang/Object;)Z
   #99 = Utf8               java/lang/String
  #100 = Utf8               equals
  #101 = Methodref          #102.#103     // ext/mods/gameserver/data/HTMLData.getInstance:()Lext/mods/gameserver/data/HTMLData;
  #102 = Class              #104          // ext/mods/gameserver/data/HTMLData
  #103 = NameAndType        #105:#106     // getInstance:()Lext/mods/gameserver/data/HTMLData;
  #104 = Utf8               ext/mods/gameserver/data/HTMLData
  #105 = Utf8               getInstance
  #106 = Utf8               ()Lext/mods/gameserver/data/HTMLData;
  #107 = String             #108          // html/CommunityBoard/favorite/favorite-get.htm
  #108 = Utf8               html/CommunityBoard/favorite/favorite-get.htm
  #109 = Methodref          #102.#110     // ext/mods/gameserver/data/HTMLData.getHtm:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Ljava/lang/String;
  #110 = NameAndType        #111:#112     // getHtm:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Ljava/lang/String;
  #111 = Utf8               getHtm
  #112 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Ljava/lang/String;
  #113 = Methodref          #114.#115     // ext/mods/gameserver/model/actor/Player.getObjectId:()I
  #114 = Class              #116          // ext/mods/gameserver/model/actor/Player
  #115 = NameAndType        #117:#118     // getObjectId:()I
  #116 = Utf8               ext/mods/gameserver/model/actor/Player
  #117 = Utf8               getObjectId
  #118 = Utf8               ()I
  #119 = Methodref          #120.#121     // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
  #120 = Class              #122          // java/lang/Integer
  #121 = NameAndType        #123:#124     // valueOf:(I)Ljava/lang/Integer;
  #122 = Utf8               java/lang/Integer
  #123 = Utf8               valueOf
  #124 = Utf8               (I)Ljava/lang/Integer;
  #125 = InterfaceMethodref #126.#127     // java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
  #126 = Class              #128          // java/util/Map
  #127 = NameAndType        #129:#130     // get:(Ljava/lang/Object;)Ljava/lang/Object;
  #128 = Utf8               java/util/Map
  #129 = Utf8               get
  #130 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
  #131 = String             #132          // <?FAV_LIST?>
  #132 = Utf8               <?FAV_LIST?>
  #133 = String             #134          //
  #134 = Utf8
  #135 = Methodref          #97.#136      // java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
  #136 = NameAndType        #137:#138     // replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
  #137 = Utf8               replace
  #138 = Utf8               (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
  #139 = Class              #140          // java/lang/StringBuilder
  #140 = Utf8               java/lang/StringBuilder
  #141 = Methodref          #139.#3       // java/lang/StringBuilder."<init>":()V
  #142 = InterfaceMethodref #62.#143      // java/util/Set.iterator:()Ljava/util/Iterator;
  #143 = NameAndType        #144:#145     // iterator:()Ljava/util/Iterator;
  #144 = Utf8               iterator
  #145 = Utf8               ()Ljava/util/Iterator;
  #146 = InterfaceMethodref #147.#148     // java/util/Iterator.hasNext:()Z
  #147 = Class              #149          // java/util/Iterator
  #148 = NameAndType        #150:#45      // hasNext:()Z
  #149 = Utf8               java/util/Iterator
  #150 = Utf8               hasNext
  #151 = InterfaceMethodref #147.#152     // java/util/Iterator.next:()Ljava/lang/Object;
  #152 = NameAndType        #44:#153      // next:()Ljava/lang/Object;
  #153 = Utf8               ()Ljava/lang/Object;
  #154 = String             #155          // html/CommunityBoard/favorite/template.htm
  #155 = Utf8               html/CommunityBoard/favorite/template.htm
  #156 = String             #157          // <?sDate?>
  #157 = Utf8               <?sDate?>
  #158 = Class              #159          // java/text/SimpleDateFormat
  #159 = Utf8               java/text/SimpleDateFormat
  #160 = String             #161          // yyyy-MM-dd HH:mm:ss
  #161 = Utf8               yyyy-MM-dd HH:mm:ss
  #162 = Methodref          #158.#163     // java/text/SimpleDateFormat."<init>":(Ljava/lang/String;)V
  #163 = NameAndType        #5:#164       // "<init>":(Ljava/lang/String;)V
  #164 = Utf8               (Ljava/lang/String;)V
  #165 = Methodref          #56.#166      // ext/mods/gameserver/communitybbs/model/Favorite.getDate:()Ljava/sql/Timestamp;
  #166 = NameAndType        #167:#168     // getDate:()Ljava/sql/Timestamp;
  #167 = Utf8               getDate
  #168 = Utf8               ()Ljava/sql/Timestamp;
  #169 = Methodref          #158.#170     // java/text/SimpleDateFormat.format:(Ljava/util/Date;)Ljava/lang/String;
  #170 = NameAndType        #171:#172     // format:(Ljava/util/Date;)Ljava/lang/String;
  #171 = Utf8               format
  #172 = Utf8               (Ljava/util/Date;)Ljava/lang/String;
  #173 = String             #174          // <?fav_id?>
  #174 = Utf8               <?fav_id?>
  #175 = Methodref          #56.#176      // ext/mods/gameserver/communitybbs/model/Favorite.getId:()I
  #176 = NameAndType        #177:#118     // getId:()I
  #177 = Utf8               getId
  #178 = Methodref          #120.#179     // java/lang/Integer.toString:(I)Ljava/lang/String;
  #179 = NameAndType        #180:#181     // toString:(I)Ljava/lang/String;
  #180 = Utf8               toString
  #181 = Utf8               (I)Ljava/lang/String;
  #182 = String             #183          // <?bypass?>
  #183 = Utf8               <?bypass?>
  #184 = Methodref          #56.#185      // ext/mods/gameserver/communitybbs/model/Favorite.getBypass:()Ljava/lang/String;
  #185 = NameAndType        #186:#187     // getBypass:()Ljava/lang/String;
  #186 = Utf8               getBypass
  #187 = Utf8               ()Ljava/lang/String;
  #188 = String             #189          // <?arg_last?>
  #189 = Utf8               <?arg_last?>
  #190 = Methodref          #56.#191      // ext/mods/gameserver/communitybbs/model/Favorite.getTitle:()Ljava/lang/String;
  #191 = NameAndType        #192:#187     // getTitle:()Ljava/lang/String;
  #192 = Utf8               getTitle
  #193 = Methodref          #139.#194     // java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
  #194 = NameAndType        #195:#196     // append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
  #195 = Utf8               append
  #196 = Utf8               (Ljava/lang/String;)Ljava/lang/StringBuilder;
  #197 = Methodref          #139.#198     // java/lang/StringBuilder.toString:()Ljava/lang/String;
  #198 = NameAndType        #180:#187     // toString:()Ljava/lang/String;
  #199 = Methodref          #11.#200      // ext/mods/gameserver/communitybbs/manager/FavoriteBBSManager.separateAndSend:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
  #200 = NameAndType        #201:#202     // separateAndSend:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
  #201 = Utf8               separateAndSend
  #202 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
  #203 = String             #204          // _bbsgetfav_add
  #204 = Utf8               _bbsgetfav_add
  #205 = Methodref          #97.#206      // java/lang/String.startsWith:(Ljava/lang/String;)Z
  #206 = NameAndType        #207:#208     // startsWith:(Ljava/lang/String;)Z
  #207 = Utf8               startsWith
  #208 = Utf8               (Ljava/lang/String;)Z
  #209 = String             #210          // Testing favorites&_bbshome
  #210 = Utf8               Testing favorites&_bbshome
  #211 = String             #212          // &
  #212 = Utf8               &
  #213 = Methodref          #97.#214      // java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
  #214 = NameAndType        #215:#216     // split:(Ljava/lang/String;)[Ljava/lang/String;
  #215 = Utf8               split
  #216 = Utf8               (Ljava/lang/String;)[Ljava/lang/String;
  #217 = Methodref          #11.#218      // ext/mods/gameserver/communitybbs/manager/FavoriteBBSManager.getNewFavoriteId:()I
  #218 = NameAndType        #219:#118     // getNewFavoriteId:()I
  #219 = Utf8               getNewFavoriteId
  #220 = Class              #221          // java/sql/Timestamp
  #221 = Utf8               java/sql/Timestamp
  #222 = Methodref          #223.#224     // java/lang/System.currentTimeMillis:()J
  #223 = Class              #225          // java/lang/System
  #224 = NameAndType        #226:#227     // currentTimeMillis:()J
  #225 = Utf8               java/lang/System
  #226 = Utf8               currentTimeMillis
  #227 = Utf8               ()J
  #228 = Methodref          #220.#229     // java/sql/Timestamp."<init>":(J)V
  #229 = NameAndType        #5:#230       // "<init>":(J)V
  #230 = Utf8               (J)V
  #231 = Methodref          #56.#232      // ext/mods/gameserver/communitybbs/model/Favorite."<init>":(IILjava/lang/String;Ljava/lang/String;Ljava/sql/Timestamp;)V
  #232 = NameAndType        #5:#233       // "<init>":(IILjava/lang/String;Ljava/lang/String;Ljava/sql/Timestamp;)V
  #233 = Utf8               (IILjava/lang/String;Ljava/lang/String;Ljava/sql/Timestamp;)V
  #234 = String             #235          // INSERT INTO bbs_favorite (id,player_id,title,bypass,date) VALUES (?,?,?,?,?)
  #235 = Utf8               INSERT INTO bbs_favorite (id,player_id,title,bypass,date) VALUES (?,?,?,?,?)
  #236 = InterfaceMethodref #35.#237      // java/sql/PreparedStatement.setInt:(II)V
  #237 = NameAndType        #238:#239     // setInt:(II)V
  #238 = Utf8               setInt
  #239 = Utf8               (II)V
  #240 = InterfaceMethodref #35.#241      // java/sql/PreparedStatement.setString:(ILjava/lang/String;)V
  #241 = NameAndType        #242:#243     // setString:(ILjava/lang/String;)V
  #242 = Utf8               setString
  #243 = Utf8               (ILjava/lang/String;)V
  #244 = InterfaceMethodref #35.#245      // java/sql/PreparedStatement.setTimestamp:(ILjava/sql/Timestamp;)V
  #245 = NameAndType        #246:#247     // setTimestamp:(ILjava/sql/Timestamp;)V
  #246 = Utf8               setTimestamp
  #247 = Utf8               (ILjava/sql/Timestamp;)V
  #248 = InterfaceMethodref #35.#249      // java/sql/PreparedStatement.execute:()Z
  #249 = NameAndType        #250:#45      // execute:()Z
  #250 = Utf8               execute
  #251 = String             #252          // Couldn\'t add the favorite.
  #252 = Utf8               Couldn\'t add the favorite.
  #253 = Methodref          #11.#254      // ext/mods/gameserver/communitybbs/manager/FavoriteBBSManager.parseCmd:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
  #254 = NameAndType        #255:#202     // parseCmd:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
  #255 = Utf8               parseCmd
  #256 = String             #257          // _bbsgetfav_del
  #257 = Utf8               _bbsgetfav_del
  #258 = Class              #259          // java/util/StringTokenizer
  #259 = Utf8               java/util/StringTokenizer
  #260 = String             #261          // _
  #261 = Utf8               _
  #262 = Methodref          #258.#263     // java/util/StringTokenizer."<init>":(Ljava/lang/String;Ljava/lang/String;)V
  #263 = NameAndType        #5:#264       // "<init>":(Ljava/lang/String;Ljava/lang/String;)V
  #264 = Utf8               (Ljava/lang/String;Ljava/lang/String;)V
  #265 = Methodref          #258.#266     // java/util/StringTokenizer.nextToken:()Ljava/lang/String;
  #266 = NameAndType        #267:#187     // nextToken:()Ljava/lang/String;
  #267 = Utf8               nextToken
  #268 = Methodref          #120.#269     // java/lang/Integer.parseInt:(Ljava/lang/String;)I
  #269 = NameAndType        #270:#51      // parseInt:(Ljava/lang/String;)I
  #270 = Utf8               parseInt
  #271 = InvokeDynamic      #0:#272       // #0:test:(I)Ljava/util/function/Predicate;
  #272 = NameAndType        #273:#274     // test:(I)Ljava/util/function/Predicate;
  #273 = Utf8               test
  #274 = Utf8               (I)Ljava/util/function/Predicate;
  #275 = InterfaceMethodref #62.#276      // java/util/Set.removeIf:(Ljava/util/function/Predicate;)Z
  #276 = NameAndType        #277:#278     // removeIf:(Ljava/util/function/Predicate;)Z
  #277 = Utf8               removeIf
  #278 = Utf8               (Ljava/util/function/Predicate;)Z
  #279 = String             #280          // DELETE FROM bbs_favorite WHERE id=?
  #280 = Utf8               DELETE FROM bbs_favorite WHERE id=?
  #281 = String             #282          // Couldn\'t delete favorite #{}.
  #282 = Utf8               Couldn\'t delete favorite #{}.
  #283 = Class              #284          // java/lang/Object
  #284 = Utf8               java/lang/Object
  #285 = Methodref          #89.#286      // ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
  #286 = NameAndType        #92:#287      // error:(Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
  #287 = Utf8               (Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
  #288 = Methodref          #2.#254       // ext/mods/gameserver/communitybbs/manager/BaseBBSManager.parseCmd:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
  #289 = String             #290          // favorite/
  #290 = Utf8               favorite/
  #291 = InvokeDynamic      #1:#292       // #1:apply:()Ljava/util/function/Function;
  #292 = NameAndType        #293:#294     // apply:()Ljava/util/function/Function;
  #293 = Utf8               apply
  #294 = Utf8               ()Ljava/util/function/Function;
  #295 = InterfaceMethodref #126.#296     // java/util/Map.computeIfAbsent:(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;
  #296 = NameAndType        #297:#298     // computeIfAbsent:(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;
  #297 = Utf8               computeIfAbsent
  #298 = Utf8               (Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;
  #299 = Fieldref           #300.#301     // ext/mods/gameserver/communitybbs/manager/FavoriteBBSManager$SingletonHolder.INSTANCE:Lext/mods/gameserver/communitybbs/manager/FavoriteBBSManager;
  #300 = Class              #302          // ext/mods/gameserver/communitybbs/manager/FavoriteBBSManager$SingletonHolder
  #301 = NameAndType        #303:#304     // INSTANCE:Lext/mods/gameserver/communitybbs/manager/FavoriteBBSManager;
  #302 = Utf8               ext/mods/gameserver/communitybbs/manager/FavoriteBBSManager$SingletonHolder
  #303 = Utf8               INSTANCE
  #304 = Utf8               Lext/mods/gameserver/communitybbs/manager/FavoriteBBSManager;
  #305 = Methodref          #7.#306       // java/util/concurrent/ConcurrentHashMap.newKeySet:()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;
  #306 = NameAndType        #307:#308     // newKeySet:()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;
  #307 = Utf8               newKeySet
  #308 = Utf8               ()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;
  #309 = Utf8               SELECT_FAVORITES
  #310 = Utf8               Ljava/lang/String;
  #311 = Utf8               ConstantValue
  #312 = Utf8               INSERT_FAVORITE
  #313 = Utf8               DELETE_FAVORITE
  #314 = Utf8               Signature
  #315 = Utf8               Ljava/util/Map<Ljava/lang/Integer;Ljava/util/Set<Lext/mods/gameserver/communitybbs/model/Favorite;>;>;
  #316 = Utf8               Code
  #317 = Utf8               LineNumberTable
  #318 = Utf8               LocalVariableTable
  #319 = Utf8               favoriteId
  #320 = Utf8               rs
  #321 = Utf8               Ljava/sql/ResultSet;
  #322 = Utf8               ps
  #323 = Utf8               Ljava/sql/PreparedStatement;
  #324 = Utf8               con
  #325 = Utf8               Ljava/sql/Connection;
  #326 = Utf8               e
  #327 = Utf8               Ljava/lang/Exception;
  #328 = Utf8               this
  #329 = Utf8               StackMapTable
  #330 = Utf8               template
  #331 = Utf8               favorite
  #332 = Utf8               Lext/mods/gameserver/communitybbs/model/Favorite;
  #333 = Utf8               sb
  #334 = Utf8               Ljava/lang/StringBuilder;
  #335 = Utf8               content
  #336 = Utf8               favorites
  #337 = Utf8               Ljava/util/Set;
  #338 = Utf8               playerId
  #339 = Utf8               title
  #340 = Utf8               bypass
  #341 = Utf8               date
  #342 = Utf8               Ljava/sql/Timestamp;
  #343 = Utf8               storedFav
  #344 = Utf8               params
  #345 = Utf8               [Ljava/lang/String;
  #346 = Utf8               st
  #347 = Utf8               Ljava/util/StringTokenizer;
  #348 = Utf8               command
  #349 = Utf8               player
  #350 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #351 = Utf8               LocalVariableTypeTable
  #352 = Utf8               Ljava/util/Set<Lext/mods/gameserver/communitybbs/model/Favorite;>;
  #353 = Class              #345          // "[Ljava/lang/String;"
  #354 = Utf8               getFolder
  #355 = Utf8               objectId
  #356 = Utf8               (I)Ljava/util/Set<Lext/mods/gameserver/communitybbs/model/Favorite;>;
  #357 = Utf8               ()Lext/mods/gameserver/communitybbs/manager/FavoriteBBSManager;
  #358 = Utf8               lambda$getFavorites$0
  #359 = Utf8               (Ljava/lang/Integer;)Ljava/util/Set;
  #360 = Utf8               f
  #361 = Utf8               Ljava/lang/Integer;
  #362 = Utf8               lambda$parseCmd$0
  #363 = Utf8               (ILext/mods/gameserver/communitybbs/model/Favorite;)Z
  #364 = Utf8               SourceFile
  #365 = Utf8               FavoriteBBSManager.java
  #366 = Utf8               NestMembers
  #367 = Utf8               BootstrapMethods
  #368 = MethodType         #66           //  (Ljava/lang/Object;)Z
  #369 = MethodHandle       6:#370        // REF_invokeStatic ext/mods/gameserver/communitybbs/manager/FavoriteBBSManager.lambda$parseCmd$0:(ILext/mods/gameserver/communitybbs/model/Favorite;)Z
  #370 = Methodref          #11.#371      // ext/mods/gameserver/communitybbs/manager/FavoriteBBSManager.lambda$parseCmd$0:(ILext/mods/gameserver/communitybbs/model/Favorite;)Z
  #371 = NameAndType        #362:#363     // lambda$parseCmd$0:(ILext/mods/gameserver/communitybbs/model/Favorite;)Z
  #372 = MethodType         #373          //  (Lext/mods/gameserver/communitybbs/model/Favorite;)Z
  #373 = Utf8               (Lext/mods/gameserver/communitybbs/model/Favorite;)Z
  #374 = MethodType         #130          //  (Ljava/lang/Object;)Ljava/lang/Object;
  #375 = MethodHandle       6:#376        // REF_invokeStatic ext/mods/gameserver/communitybbs/manager/FavoriteBBSManager.lambda$getFavorites$0:(Ljava/lang/Integer;)Ljava/util/Set;
  #376 = Methodref          #11.#377      // ext/mods/gameserver/communitybbs/manager/FavoriteBBSManager.lambda$getFavorites$0:(Ljava/lang/Integer;)Ljava/util/Set;
  #377 = NameAndType        #358:#359     // lambda$getFavorites$0:(Ljava/lang/Integer;)Ljava/util/Set;
  #378 = MethodType         #359          //  (Ljava/lang/Integer;)Ljava/util/Set;
  #379 = MethodHandle       6:#380        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #380 = Methodref          #381.#382     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #381 = Class              #383          // java/lang/invoke/LambdaMetafactory
  #382 = NameAndType        #384:#385     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #383 = Utf8               java/lang/invoke/LambdaMetafactory
  #384 = Utf8               metafactory
  #385 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #386 = Utf8               InnerClasses
  #387 = Utf8               SingletonHolder
  #388 = Class              #389          // java/util/concurrent/ConcurrentHashMap$KeySetView
  #389 = Utf8               java/util/concurrent/ConcurrentHashMap$KeySetView
  #390 = Utf8               KeySetView
  #391 = Class              #392          // java/lang/invoke/MethodHandles$Lookup
  #392 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #393 = Class              #394          // java/lang/invoke/MethodHandles
  #394 = Utf8               java/lang/invoke/MethodHandles
  #395 = Utf8               Lookup
{
  protected ext.mods.gameserver.communitybbs.manager.FavoriteBBSManager();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=4, locals=6, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method ext/mods/gameserver/communitybbs/manager/BaseBBSManager."<init>":()V
         4: aload_0
         5: new           #7                  // class java/util/concurrent/ConcurrentHashMap
         8: dup
         9: invokespecial #9                  // Method java/util/concurrent/ConcurrentHashMap."<init>":()V
        12: putfield      #10                 // Field _favorites:Ljava/util/Map;
        15: aload_0
        16: iconst_0
        17: putfield      #16                 // Field _lastFavoriteId:I
        20: invokestatic  #20                 // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
        23: astore_1
        24: aload_1
        25: ldc           #26                 // String SELECT * FROM bbs_favorite ORDER BY id ASC
        27: invokeinterface #28,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        32: astore_2
        33: aload_2
        34: invokeinterface #34,  1           // InterfaceMethod java/sql/PreparedStatement.executeQuery:()Ljava/sql/ResultSet;
        39: astore_3
        40: aload_3
        41: invokeinterface #40,  1           // InterfaceMethod java/sql/ResultSet.next:()Z
        46: ifeq          103
        49: aload_0
        50: aload_3
        51: ldc           #46                 // String player_id
        53: invokeinterface #48,  2           // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
        58: invokevirtual #52                 // Method getFavorites:(I)Ljava/util/Set;
        61: new           #56                 // class ext/mods/gameserver/communitybbs/model/Favorite
        64: dup
        65: aload_3
        66: invokespecial #58                 // Method ext/mods/gameserver/communitybbs/model/Favorite."<init>":(Ljava/sql/ResultSet;)V
        69: invokeinterface #61,  2           // InterfaceMethod java/util/Set.add:(Ljava/lang/Object;)Z
        74: pop
        75: aload_3
        76: ldc           #67                 // String id
        78: invokeinterface #48,  2           // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
        83: istore        4
        85: iload         4
        87: aload_0
        88: getfield      #16                 // Field _lastFavoriteId:I
        91: if_icmple     100
        94: aload_0
        95: iload         4
        97: putfield      #16                 // Field _lastFavoriteId:I
       100: goto          40
       103: aload_3
       104: ifnull        143
       107: aload_3
       108: invokeinterface #69,  1           // InterfaceMethod java/sql/ResultSet.close:()V
       113: goto          143
       116: astore        4
       118: aload_3
       119: ifnull        140
       122: aload_3
       123: invokeinterface #69,  1           // InterfaceMethod java/sql/ResultSet.close:()V
       128: goto          140
       131: astore        5
       133: aload         4
       135: aload         5
       137: invokevirtual #74                 // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       140: aload         4
       142: athrow
       143: aload_2
       144: ifnull        180
       147: aload_2
       148: invokeinterface #78,  1           // InterfaceMethod java/sql/PreparedStatement.close:()V
       153: goto          180
       156: astore_3
       157: aload_2
       158: ifnull        178
       161: aload_2
       162: invokeinterface #78,  1           // InterfaceMethod java/sql/PreparedStatement.close:()V
       167: goto          178
       170: astore        4
       172: aload_3
       173: aload         4
       175: invokevirtual #74                 // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       178: aload_3
       179: athrow
       180: aload_1
       181: ifnull        215
       184: aload_1
       185: invokeinterface #79,  1           // InterfaceMethod java/sql/Connection.close:()V
       190: goto          215
       193: astore_2
       194: aload_1
       195: ifnull        213
       198: aload_1
       199: invokeinterface #79,  1           // InterfaceMethod java/sql/Connection.close:()V
       204: goto          213
       207: astore_3
       208: aload_2
       209: aload_3
       210: invokevirtual #74                 // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       213: aload_2
       214: athrow
       215: goto          228
       218: astore_1
       219: getstatic     #82                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
       222: ldc           #86                 // String Couldn\'t load favorites.
       224: aload_1
       225: invokevirtual #88                 // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
       228: return
      Exception table:
         from    to  target type
            40   103   116   Class java/lang/Throwable
           122   128   131   Class java/lang/Throwable
            33   143   156   Class java/lang/Throwable
           161   167   170   Class java/lang/Throwable
            24   180   193   Class java/lang/Throwable
           198   204   207   Class java/lang/Throwable
            20   215   218   Class java/lang/Exception
      LineNumberTable:
        line 47: 0
        line 42: 4
        line 44: 15
        line 48: 20
        line 49: 24
        line 50: 33
        line 52: 40
        line 54: 49
        line 56: 75
        line 57: 85
        line 58: 94
        line 59: 100
        line 60: 103
        line 48: 116
        line 60: 143
        line 48: 156
        line 60: 180
        line 48: 193
        line 64: 215
        line 61: 218
        line 63: 219
        line 65: 228
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           85      15     4 favoriteId   I
           40     103     3    rs   Ljava/sql/ResultSet;
           33     147     2    ps   Ljava/sql/PreparedStatement;
           24     191     1   con   Ljava/sql/Connection;
          219       9     1     e   Ljava/lang/Exception;
            0     229     0  this   Lext/mods/gameserver/communitybbs/manager/FavoriteBBSManager;
      StackMapTable: number_of_entries = 17
        frame_type = 255 /* full_frame */
          offset_delta = 40
          locals = [ class ext/mods/gameserver/communitybbs/manager/FavoriteBBSManager, class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/ResultSet ]
          stack = []
        frame_type = 59 /* same */
        frame_type = 2 /* same */
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 14
          locals = [ class ext/mods/gameserver/communitybbs/manager/FavoriteBBSManager, class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/ResultSet, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/communitybbs/manager/FavoriteBBSManager, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 7 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/communitybbs/manager/FavoriteBBSManager, class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 5 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 9 /* same */

  public void parseCmd(java.lang.String, ext.mods.gameserver.model.actor.Player);
    descriptor: (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=8, locals=14, args_size=3
         0: aload_1
         1: ldc           #94                 // String _bbsgetfav
         3: invokevirtual #96                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
         6: ifeq          210
         9: invokestatic  #101                // Method ext/mods/gameserver/data/HTMLData.getInstance:()Lext/mods/gameserver/data/HTMLData;
        12: aload_2
        13: ldc           #107                // String html/CommunityBoard/favorite/favorite-get.htm
        15: invokevirtual #109                // Method ext/mods/gameserver/data/HTMLData.getHtm:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Ljava/lang/String;
        18: astore_3
        19: aload_0
        20: getfield      #10                 // Field _favorites:Ljava/util/Map;
        23: aload_2
        24: invokevirtual #113                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        27: invokestatic  #119                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        30: invokeinterface #125,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        35: checkcast     #62                 // class java/util/Set
        38: astore        4
        40: aload         4
        42: ifnonnull     57
        45: aload_3
        46: ldc           #131                // String <?FAV_LIST?>
        48: ldc           #133                // String
        50: invokevirtual #135                // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
        53: astore_3
        54: goto          202
        57: new           #139                // class java/lang/StringBuilder
        60: dup
        61: invokespecial #141                // Method java/lang/StringBuilder."<init>":()V
        64: astore        5
        66: aload         4
        68: invokeinterface #142,  1          // InterfaceMethod java/util/Set.iterator:()Ljava/util/Iterator;
        73: astore        6
        75: aload         6
        77: invokeinterface #146,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        82: ifeq          190
        85: aload         6
        87: invokeinterface #151,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        92: checkcast     #56                 // class ext/mods/gameserver/communitybbs/model/Favorite
        95: astore        7
        97: invokestatic  #101                // Method ext/mods/gameserver/data/HTMLData.getInstance:()Lext/mods/gameserver/data/HTMLData;
       100: aload_2
       101: ldc           #154                // String html/CommunityBoard/favorite/template.htm
       103: invokevirtual #109                // Method ext/mods/gameserver/data/HTMLData.getHtm:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Ljava/lang/String;
       106: astore        8
       108: aload         8
       110: ldc           #156                // String <?sDate?>
       112: new           #158                // class java/text/SimpleDateFormat
       115: dup
       116: ldc           #160                // String yyyy-MM-dd HH:mm:ss
       118: invokespecial #162                // Method java/text/SimpleDateFormat."<init>":(Ljava/lang/String;)V
       121: aload         7
       123: invokevirtual #165                // Method ext/mods/gameserver/communitybbs/model/Favorite.getDate:()Ljava/sql/Timestamp;
       126: invokevirtual #169                // Method java/text/SimpleDateFormat.format:(Ljava/util/Date;)Ljava/lang/String;
       129: invokevirtual #135                // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
       132: astore        8
       134: aload         8
       136: ldc           #173                // String <?fav_id?>
       138: aload         7
       140: invokevirtual #175                // Method ext/mods/gameserver/communitybbs/model/Favorite.getId:()I
       143: invokestatic  #178                // Method java/lang/Integer.toString:(I)Ljava/lang/String;
       146: invokevirtual #135                // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
       149: astore        8
       151: aload         8
       153: ldc           #182                // String <?bypass?>
       155: aload         7
       157: invokevirtual #184                // Method ext/mods/gameserver/communitybbs/model/Favorite.getBypass:()Ljava/lang/String;
       160: invokevirtual #135                // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
       163: astore        8
       165: aload         8
       167: ldc           #188                // String <?arg_last?>
       169: aload         7
       171: invokevirtual #190                // Method ext/mods/gameserver/communitybbs/model/Favorite.getTitle:()Ljava/lang/String;
       174: invokevirtual #135                // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
       177: astore        8
       179: aload         5
       181: aload         8
       183: invokevirtual #193                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       186: pop
       187: goto          75
       190: aload_3
       191: ldc           #131                // String <?FAV_LIST?>
       193: aload         5
       195: invokevirtual #197                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
       198: invokevirtual #135                // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
       201: astore_3
       202: aload_3
       203: aload_2
       204: invokestatic  #199                // Method separateAndSend:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
       207: goto          721
       210: aload_1
       211: ldc           #203                // String _bbsgetfav_add
       213: invokevirtual #205                // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
       216: ifeq          490
       219: ldc           #209                // String Testing favorites&_bbshome
       221: astore_3
       222: ldc           #209                // String Testing favorites&_bbshome
       224: ldc           #211                // String &
       226: invokevirtual #213                // Method java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
       229: astore        4
       231: aload         4
       233: arraylength
       234: iconst_1
       235: if_icmple     480
       238: aload_0
       239: invokevirtual #217                // Method getNewFavoriteId:()I
       242: istore        5
       244: aload_2
       245: invokevirtual #113                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
       248: istore        6
       250: aload         4
       252: iconst_0
       253: aaload
       254: astore        7
       256: aload         4
       258: iconst_1
       259: aaload
       260: astore        8
       262: new           #220                // class java/sql/Timestamp
       265: dup
       266: invokestatic  #222                // Method java/lang/System.currentTimeMillis:()J
       269: invokespecial #228                // Method java/sql/Timestamp."<init>":(J)V
       272: astore        9
       274: aload_0
       275: iload         6
       277: invokevirtual #52                 // Method getFavorites:(I)Ljava/util/Set;
       280: new           #56                 // class ext/mods/gameserver/communitybbs/model/Favorite
       283: dup
       284: iload         5
       286: iload         6
       288: aload         7
       290: aload         8
       292: aload         9
       294: invokespecial #231                // Method ext/mods/gameserver/communitybbs/model/Favorite."<init>":(IILjava/lang/String;Ljava/lang/String;Ljava/sql/Timestamp;)V
       297: invokeinterface #61,  2           // InterfaceMethod java/util/Set.add:(Ljava/lang/Object;)Z
       302: pop
       303: invokestatic  #20                 // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
       306: astore        10
       308: aload         10
       310: ldc           #234                // String INSERT INTO bbs_favorite (id,player_id,title,bypass,date) VALUES (?,?,?,?,?)
       312: invokeinterface #28,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
       317: astore        11
       319: aload         11
       321: iconst_1
       322: iload         5
       324: invokeinterface #236,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       329: aload         11
       331: iconst_2
       332: iload         6
       334: invokeinterface #236,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       339: aload         11
       341: iconst_3
       342: aload         7
       344: invokeinterface #240,  3          // InterfaceMethod java/sql/PreparedStatement.setString:(ILjava/lang/String;)V
       349: aload         11
       351: iconst_4
       352: aload         8
       354: invokeinterface #240,  3          // InterfaceMethod java/sql/PreparedStatement.setString:(ILjava/lang/String;)V
       359: aload         11
       361: iconst_5
       362: aload         9
       364: invokeinterface #244,  3          // InterfaceMethod java/sql/PreparedStatement.setTimestamp:(ILjava/sql/Timestamp;)V
       369: aload         11
       371: invokeinterface #248,  1          // InterfaceMethod java/sql/PreparedStatement.execute:()Z
       376: pop
       377: aload         11
       379: ifnull        421
       382: aload         11
       384: invokeinterface #78,  1           // InterfaceMethod java/sql/PreparedStatement.close:()V
       389: goto          421
       392: astore        12
       394: aload         11
       396: ifnull        418
       399: aload         11
       401: invokeinterface #78,  1           // InterfaceMethod java/sql/PreparedStatement.close:()V
       406: goto          418
       409: astore        13
       411: aload         12
       413: aload         13
       415: invokevirtual #74                 // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       418: aload         12
       420: athrow
       421: aload         10
       423: ifnull        465
       426: aload         10
       428: invokeinterface #79,  1           // InterfaceMethod java/sql/Connection.close:()V
       433: goto          465
       436: astore        11
       438: aload         10
       440: ifnull        462
       443: aload         10
       445: invokeinterface #79,  1           // InterfaceMethod java/sql/Connection.close:()V
       450: goto          462
       453: astore        12
       455: aload         11
       457: aload         12
       459: invokevirtual #74                 // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       462: aload         11
       464: athrow
       465: goto          480
       468: astore        10
       470: getstatic     #82                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
       473: ldc           #251                // String Couldn\'t add the favorite.
       475: aload         10
       477: invokevirtual #88                 // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
       480: aload_0
       481: ldc           #94                 // String _bbsgetfav
       483: aload_2
       484: invokevirtual #253                // Method parseCmd:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
       487: goto          721
       490: aload_1
       491: ldc_w         #256                // String _bbsgetfav_del
       494: invokevirtual #205                // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
       497: ifeq          715
       500: new           #258                // class java/util/StringTokenizer
       503: dup
       504: aload_1
       505: ldc_w         #260                // String _
       508: invokespecial #262                // Method java/util/StringTokenizer."<init>":(Ljava/lang/String;Ljava/lang/String;)V
       511: astore_3
       512: aload_3
       513: invokevirtual #265                // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       516: pop
       517: aload_3
       518: invokevirtual #265                // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       521: pop
       522: aload_3
       523: invokevirtual #265                // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       526: invokestatic  #268                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       529: istore        4
       531: aload_0
       532: aload_2
       533: invokevirtual #113                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
       536: invokevirtual #52                 // Method getFavorites:(I)Ljava/util/Set;
       539: iload         4
       541: invokedynamic #271,  0            // InvokeDynamic #0:test:(I)Ljava/util/function/Predicate;
       546: invokeinterface #275,  2          // InterfaceMethod java/util/Set.removeIf:(Ljava/util/function/Predicate;)Z
       551: ifeq          705
       554: invokestatic  #20                 // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
       557: astore        5
       559: aload         5
       561: ldc_w         #279                // String DELETE FROM bbs_favorite WHERE id=?
       564: invokeinterface #28,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
       569: astore        6
       571: aload         6
       573: iconst_1
       574: iload         4
       576: invokeinterface #236,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       581: aload         6
       583: invokeinterface #248,  1          // InterfaceMethod java/sql/PreparedStatement.execute:()Z
       588: pop
       589: aload         6
       591: ifnull        633
       594: aload         6
       596: invokeinterface #78,  1           // InterfaceMethod java/sql/PreparedStatement.close:()V
       601: goto          633
       604: astore        7
       606: aload         6
       608: ifnull        630
       611: aload         6
       613: invokeinterface #78,  1           // InterfaceMethod java/sql/PreparedStatement.close:()V
       618: goto          630
       621: astore        8
       623: aload         7
       625: aload         8
       627: invokevirtual #74                 // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       630: aload         7
       632: athrow
       633: aload         5
       635: ifnull        677
       638: aload         5
       640: invokeinterface #79,  1           // InterfaceMethod java/sql/Connection.close:()V
       645: goto          677
       648: astore        6
       650: aload         5
       652: ifnull        674
       655: aload         5
       657: invokeinterface #79,  1           // InterfaceMethod java/sql/Connection.close:()V
       662: goto          674
       665: astore        7
       667: aload         6
       669: aload         7
       671: invokevirtual #74                 // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       674: aload         6
       676: athrow
       677: goto          705
       680: astore        5
       682: getstatic     #82                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
       685: ldc_w         #281                // String Couldn\'t delete favorite #{}.
       688: aload         5
       690: iconst_1
       691: anewarray     #283                // class java/lang/Object
       694: dup
       695: iconst_0
       696: iload         4
       698: invokestatic  #119                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       701: aastore
       702: invokevirtual #285                // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
       705: aload_0
       706: ldc           #94                 // String _bbsgetfav
       708: aload_2
       709: invokevirtual #253                // Method parseCmd:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
       712: goto          721
       715: aload_0
       716: aload_1
       717: aload_2
       718: invokespecial #288                // Method ext/mods/gameserver/communitybbs/manager/BaseBBSManager.parseCmd:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
       721: return
      Exception table:
         from    to  target type
           319   377   392   Class java/lang/Throwable
           399   406   409   Class java/lang/Throwable
           308   421   436   Class java/lang/Throwable
           443   450   453   Class java/lang/Throwable
           303   465   468   Class java/lang/Exception
           571   589   604   Class java/lang/Throwable
           611   618   621   Class java/lang/Throwable
           559   633   648   Class java/lang/Throwable
           655   662   665   Class java/lang/Throwable
           554   677   680   Class java/lang/Exception
      LineNumberTable:
        line 70: 0
        line 72: 9
        line 74: 19
        line 75: 40
        line 76: 45
        line 79: 57
        line 80: 66
        line 82: 97
        line 83: 108
        line 84: 134
        line 85: 151
        line 86: 165
        line 88: 179
        line 89: 187
        line 90: 190
        line 92: 202
        line 93: 207
        line 94: 210
        line 108: 219
        line 110: 222
        line 111: 231
        line 113: 238
        line 114: 244
        line 115: 250
        line 116: 256
        line 117: 262
        line 119: 274
        line 121: 303
        line 122: 308
        line 124: 319
        line 125: 329
        line 126: 339
        line 127: 349
        line 128: 359
        line 129: 369
        line 130: 377
        line 121: 392
        line 130: 421
        line 121: 436
        line 134: 465
        line 131: 468
        line 133: 470
        line 137: 480
        line 138: 487
        line 139: 490
        line 141: 500
        line 142: 512
        line 143: 517
        line 145: 522
        line 147: 531
        line 149: 554
        line 150: 559
        line 152: 571
        line 153: 581
        line 154: 589
        line 149: 604
        line 154: 633
        line 149: 648
        line 158: 677
        line 155: 680
        line 157: 682
        line 161: 705
        line 162: 712
        line 164: 715
        line 165: 721
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          108      79     8 template   Ljava/lang/String;
           97      90     7 favorite   Lext/mods/gameserver/communitybbs/model/Favorite;
           66     136     5    sb   Ljava/lang/StringBuilder;
           19     188     3 content   Ljava/lang/String;
           40     167     4 favorites   Ljava/util/Set;
          319     102    11    ps   Ljava/sql/PreparedStatement;
          308     157    10   con   Ljava/sql/Connection;
          470      10    10     e   Ljava/lang/Exception;
          244     236     5    id   I
          250     230     6 playerId   I
          256     224     7 title   Ljava/lang/String;
          262     218     8 bypass   Ljava/lang/String;
          274     206     9  date   Ljava/sql/Timestamp;
          222     265     3 storedFav   Ljava/lang/String;
          231     256     4 params   [Ljava/lang/String;
          571      62     6    ps   Ljava/sql/PreparedStatement;
          559     118     5   con   Ljava/sql/Connection;
          682      23     5     e   Ljava/lang/Exception;
          512     200     3    st   Ljava/util/StringTokenizer;
          531     181     4    id   I
            0     722     0  this   Lext/mods/gameserver/communitybbs/manager/FavoriteBBSManager;
            0     722     1 command   Ljava/lang/String;
            0     722     2 player   Lext/mods/gameserver/model/actor/Player;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
           40     167     4 favorites   Ljava/util/Set<Lext/mods/gameserver/communitybbs/model/Favorite;>;
      StackMapTable: number_of_entries = 28
        frame_type = 253 /* append */
          offset_delta = 57
          locals = [ class java/lang/String, class java/util/Set ]
        frame_type = 253 /* append */
          offset_delta = 17
          locals = [ class java/lang/StringBuilder, class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 114
        frame_type = 250 /* chop */
          offset_delta = 11
        frame_type = 249 /* chop */
          offset_delta = 7
        frame_type = 255 /* full_frame */
          offset_delta = 181
          locals = [ class ext/mods/gameserver/communitybbs/manager/FavoriteBBSManager, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class "[Ljava/lang/String;", int, int, class java/lang/String, class java/lang/String, class java/sql/Timestamp, class java/sql/Connection, class java/sql/PreparedStatement ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/communitybbs/manager/FavoriteBBSManager, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class "[Ljava/lang/String;", int, int, class java/lang/String, class java/lang/String, class java/sql/Timestamp, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 78 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/communitybbs/manager/FavoriteBBSManager, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class "[Ljava/lang/String;", int, int, class java/lang/String, class java/lang/String, class java/sql/Timestamp, class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 255 /* full_frame */
          offset_delta = 11
          locals = [ class ext/mods/gameserver/communitybbs/manager/FavoriteBBSManager, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class "[Ljava/lang/String;" ]
          stack = []
        frame_type = 249 /* chop */
          offset_delta = 9
        frame_type = 255 /* full_frame */
          offset_delta = 113
          locals = [ class ext/mods/gameserver/communitybbs/manager/FavoriteBBSManager, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/util/StringTokenizer, int, class java/sql/Connection, class java/sql/PreparedStatement ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/communitybbs/manager/FavoriteBBSManager, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/util/StringTokenizer, int, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 78 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/communitybbs/manager/FavoriteBBSManager, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/util/StringTokenizer, int, class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 24 /* same */
        frame_type = 249 /* chop */
          offset_delta = 9
        frame_type = 5 /* same */

  protected java.lang.String getFolder();
    descriptor: ()Ljava/lang/String;
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=1, locals=1, args_size=1
         0: ldc_w         #289                // String favorite/
         3: areturn
      LineNumberTable:
        line 170: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/communitybbs/manager/FavoriteBBSManager;

  public static ext.mods.gameserver.communitybbs.manager.FavoriteBBSManager getInstance();
    descriptor: ()Lext/mods/gameserver/communitybbs/manager/FavoriteBBSManager;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #299                // Field ext/mods/gameserver/communitybbs/manager/FavoriteBBSManager$SingletonHolder.INSTANCE:Lext/mods/gameserver/communitybbs/manager/FavoriteBBSManager;
         3: areturn
      LineNumberTable:
        line 185: 0
}
SourceFile: "FavoriteBBSManager.java"
NestMembers:
  ext/mods/gameserver/communitybbs/manager/FavoriteBBSManager$SingletonHolder
BootstrapMethods:
  0: #379 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #368 (Ljava/lang/Object;)Z
      #369 REF_invokeStatic ext/mods/gameserver/communitybbs/manager/FavoriteBBSManager.lambda$parseCmd$0:(ILext/mods/gameserver/communitybbs/model/Favorite;)Z
      #372 (Lext/mods/gameserver/communitybbs/model/Favorite;)Z
  1: #379 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #374 (Ljava/lang/Object;)Ljava/lang/Object;
      #375 REF_invokeStatic ext/mods/gameserver/communitybbs/manager/FavoriteBBSManager.lambda$getFavorites$0:(Ljava/lang/Integer;)Ljava/util/Set;
      #378 (Ljava/lang/Integer;)Ljava/util/Set;
InnerClasses:
  public static final #390= #388 of #7;   // KeySetView=class java/util/concurrent/ConcurrentHashMap$KeySetView of class java/util/concurrent/ConcurrentHashMap
  public static final #395= #391 of #393; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
