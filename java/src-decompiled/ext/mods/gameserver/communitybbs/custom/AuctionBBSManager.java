// Bytecode for: ext.mods.gameserver.communitybbs.custom.AuctionBBSManager
// File: ext\mods\gameserver\communitybbs\custom\AuctionBBSManager.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/communitybbs/custom/AuctionBBSManager.class
  Last modified 9 de jul de 2026; size 27758 bytes
  MD5 checksum ce5152b18113dafbdfe5ddced5b59413
  Compiled from "AuctionBBSManager.java"
public class ext.mods.gameserver.communitybbs.custom.AuctionBBSManager extends ext.mods.gameserver.communitybbs.manager.BaseBBSManager
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #11                         // ext/mods/gameserver/communitybbs/custom/AuctionBBSManager
  super_class: #2                         // ext/mods/gameserver/communitybbs/manager/BaseBBSManager
  interfaces: 0, fields: 3, methods: 23, attributes: 4
Constant pool:
     #1 = Methodref          #2.#3        // ext/mods/gameserver/communitybbs/manager/BaseBBSManager."<init>":()V
     #2 = Class              #4           // ext/mods/gameserver/communitybbs/manager/BaseBBSManager
     #3 = NameAndType        #5:#6        // "<init>":()V
     #4 = Utf8               ext/mods/gameserver/communitybbs/manager/BaseBBSManager
     #5 = Utf8               <init>
     #6 = Utf8               ()V
     #7 = Class              #8           // java/util/concurrent/ConcurrentHashMap
     #8 = Utf8               java/util/concurrent/ConcurrentHashMap
     #9 = Methodref          #7.#3        // java/util/concurrent/ConcurrentHashMap."<init>":()V
    #10 = Fieldref           #11.#12      // ext/mods/gameserver/communitybbs/custom/AuctionBBSManager._auctions:Ljava/util/Map;
    #11 = Class              #13          // ext/mods/gameserver/communitybbs/custom/AuctionBBSManager
    #12 = NameAndType        #14:#15      // _auctions:Ljava/util/Map;
    #13 = Utf8               ext/mods/gameserver/communitybbs/custom/AuctionBBSManager
    #14 = Utf8               _auctions
    #15 = Utf8               Ljava/util/Map;
    #16 = Fieldref           #11.#17      // ext/mods/gameserver/communitybbs/custom/AuctionBBSManager._functions:Ljava/util/Map;
    #17 = NameAndType        #18:#15      // _functions:Ljava/util/Map;
    #18 = Utf8               _functions
    #19 = Methodref          #20.#21      // ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
    #20 = Class              #22          // ext/mods/commons/pool/ConnectionPool
    #21 = NameAndType        #23:#24      // getConnection:()Ljava/sql/Connection;
    #22 = Utf8               ext/mods/commons/pool/ConnectionPool
    #23 = Utf8               getConnection
    #24 = Utf8               ()Ljava/sql/Connection;
    #25 = String             #26          // SELECT * FROM bbs_auction
    #26 = Utf8               SELECT * FROM bbs_auction
    #27 = InterfaceMethodref #28.#29      // java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
    #28 = Class              #30          // java/sql/Connection
    #29 = NameAndType        #31:#32      // prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
    #30 = Utf8               java/sql/Connection
    #31 = Utf8               prepareStatement
    #32 = Utf8               (Ljava/lang/String;)Ljava/sql/PreparedStatement;
    #33 = InterfaceMethodref #34.#35      // java/sql/PreparedStatement.executeQuery:()Ljava/sql/ResultSet;
    #34 = Class              #36          // java/sql/PreparedStatement
    #35 = NameAndType        #37:#38      // executeQuery:()Ljava/sql/ResultSet;
    #36 = Utf8               java/sql/PreparedStatement
    #37 = Utf8               executeQuery
    #38 = Utf8               ()Ljava/sql/ResultSet;
    #39 = InterfaceMethodref #40.#41      // java/sql/ResultSet.next:()Z
    #40 = Class              #42          // java/sql/ResultSet
    #41 = NameAndType        #43:#44      // next:()Z
    #42 = Utf8               java/sql/ResultSet
    #43 = Utf8               next
    #44 = Utf8               ()Z
    #45 = Class              #46          // ext/mods/gameserver/communitybbs/custom/model/Auction
    #46 = Utf8               ext/mods/gameserver/communitybbs/custom/model/Auction
    #47 = Methodref          #45.#48      // ext/mods/gameserver/communitybbs/custom/model/Auction."<init>":(Ljava/sql/ResultSet;)V
    #48 = NameAndType        #5:#49       // "<init>":(Ljava/sql/ResultSet;)V
    #49 = Utf8               (Ljava/sql/ResultSet;)V
    #50 = Methodref          #11.#51      // ext/mods/gameserver/communitybbs/custom/AuctionBBSManager.addAuction:(Lext/mods/gameserver/communitybbs/custom/model/Auction;)V
    #51 = NameAndType        #52:#53      // addAuction:(Lext/mods/gameserver/communitybbs/custom/model/Auction;)V
    #52 = Utf8               addAuction
    #53 = Utf8               (Lext/mods/gameserver/communitybbs/custom/model/Auction;)V
    #54 = InterfaceMethodref #40.#55      // java/sql/ResultSet.close:()V
    #55 = NameAndType        #56:#6       // close:()V
    #56 = Utf8               close
    #57 = Class              #58          // java/lang/Throwable
    #58 = Utf8               java/lang/Throwable
    #59 = Methodref          #57.#60      // java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
    #60 = NameAndType        #61:#62      // addSuppressed:(Ljava/lang/Throwable;)V
    #61 = Utf8               addSuppressed
    #62 = Utf8               (Ljava/lang/Throwable;)V
    #63 = InterfaceMethodref #34.#55      // java/sql/PreparedStatement.close:()V
    #64 = InterfaceMethodref #28.#55      // java/sql/Connection.close:()V
    #65 = Class              #66          // java/lang/Exception
    #66 = Utf8               java/lang/Exception
    #67 = Fieldref           #11.#68      // ext/mods/gameserver/communitybbs/custom/AuctionBBSManager.LOGGER:Lext/mods/commons/logging/CLogger;
    #68 = NameAndType        #69:#70      // LOGGER:Lext/mods/commons/logging/CLogger;
    #69 = Utf8               LOGGER
    #70 = Utf8               Lext/mods/commons/logging/CLogger;
    #71 = String             #72          // Couldn\'t load bbs_auction items.
    #72 = Utf8               Couldn\'t load bbs_auction items.
    #73 = Methodref          #74.#75      // ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;Ljava/lang/Throwable;)V
    #74 = Class              #76          // ext/mods/commons/logging/CLogger
    #75 = NameAndType        #77:#78      // warn:(Ljava/lang/Object;Ljava/lang/Throwable;)V
    #76 = Utf8               ext/mods/commons/logging/CLogger
    #77 = Utf8               warn
    #78 = Utf8               (Ljava/lang/Object;Ljava/lang/Throwable;)V
    #79 = String             #80          // Loaded {} auction items.
    #80 = Utf8               Loaded {} auction items.
    #81 = Class              #82          // java/lang/Object
    #82 = Utf8               java/lang/Object
    #83 = InterfaceMethodref #84.#85      // java/util/Map.size:()I
    #84 = Class              #86          // java/util/Map
    #85 = NameAndType        #87:#88      // size:()I
    #86 = Utf8               java/util/Map
    #87 = Utf8               size
    #88 = Utf8               ()I
    #89 = Methodref          #90.#91      // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
    #90 = Class              #92          // java/lang/Integer
    #91 = NameAndType        #93:#94      // valueOf:(I)Ljava/lang/Integer;
    #92 = Utf8               java/lang/Integer
    #93 = Utf8               valueOf
    #94 = Utf8               (I)Ljava/lang/Integer;
    #95 = Methodref          #74.#96      // ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
    #96 = NameAndType        #97:#98      // info:(Ljava/lang/Object;[Ljava/lang/Object;)V
    #97 = Utf8               info
    #98 = Utf8               (Ljava/lang/Object;[Ljava/lang/Object;)V
    #99 = Class              #100         // java/util/StringTokenizer
   #100 = Utf8               java/util/StringTokenizer
   #101 = String             #102         //
   #102 = Utf8
   #103 = Methodref          #99.#104     // java/util/StringTokenizer."<init>":(Ljava/lang/String;Ljava/lang/String;)V
   #104 = NameAndType        #5:#105      // "<init>":(Ljava/lang/String;Ljava/lang/String;)V
   #105 = Utf8               (Ljava/lang/String;Ljava/lang/String;)V
   #106 = Methodref          #99.#107     // java/util/StringTokenizer.hasMoreTokens:()Z
   #107 = NameAndType        #108:#44     // hasMoreTokens:()Z
   #108 = Utf8               hasMoreTokens
   #109 = Methodref          #99.#110     // java/util/StringTokenizer.nextToken:()Ljava/lang/String;
   #110 = NameAndType        #111:#112    // nextToken:()Ljava/lang/String;
   #111 = Utf8               nextToken
   #112 = Utf8               ()Ljava/lang/String;
   #113 = String             #114         //
   #114 = Utf8
   #115 = Methodref          #11.#116     // ext/mods/gameserver/communitybbs/custom/AuctionBBSManager.getFunction:(Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/communitybbs/custom/model/Function;
   #116 = NameAndType        #117:#118    // getFunction:(Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/communitybbs/custom/model/Function;
   #117 = Utf8               getFunction
   #118 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/communitybbs/custom/model/Function;
   #119 = String             #120         // _friendlist_0_
   #120 = Utf8               _friendlist_0_
   #121 = Methodref          #122.#123    // java/lang/String.equals:(Ljava/lang/Object;)Z
   #122 = Class              #124         // java/lang/String
   #123 = NameAndType        #125:#126    // equals:(Ljava/lang/Object;)Z
   #124 = Utf8               java/lang/String
   #125 = Utf8               equals
   #126 = Utf8               (Ljava/lang/Object;)Z
   #127 = Methodref          #90.#128     // java/lang/Integer.parseInt:(Ljava/lang/String;)I
   #128 = NameAndType        #129:#130    // parseInt:(Ljava/lang/String;)I
   #129 = Utf8               parseInt
   #130 = Utf8               (Ljava/lang/String;)I
   #131 = Methodref          #132.#133    // ext/mods/gameserver/communitybbs/custom/model/Function.getLastPage:()I
   #132 = Class              #134         // ext/mods/gameserver/communitybbs/custom/model/Function
   #133 = NameAndType        #135:#88     // getLastPage:()I
   #134 = Utf8               ext/mods/gameserver/communitybbs/custom/model/Function
   #135 = Utf8               getLastPage
   #136 = Methodref          #122.#137    // java/lang/String.hashCode:()I
   #137 = NameAndType        #138:#88     // hashCode:()I
   #138 = Utf8               hashCode
   #139 = String             #140         // src
   #140 = Utf8               src
   #141 = String             #142         // clear
   #142 = Utf8               clear
   #143 = String             #144         // type
   #144 = Utf8               type
   #145 = String             #146         // grade
   #146 = Utf8               grade
   #147 = String             #148         // currency
   #148 = Utf8               currency
   #149 = String             #150         // select
   #150 = Utf8               select
   #151 = String             #152         // purchase
   #152 = Utf8               purchase
   #153 = String             #154         // cancel
   #154 = Utf8               cancel
   #155 = Methodref          #122.#156    // java/lang/String.valueOf:(I)Ljava/lang/String;
   #156 = NameAndType        #93:#157     // valueOf:(I)Ljava/lang/String;
   #157 = Utf8               (I)Ljava/lang/String;
   #158 = Methodref          #122.#159    // java/lang/String.length:()I
   #159 = NameAndType        #160:#88     // length:()I
   #160 = Utf8               length
   #161 = Methodref          #122.#162    // java/lang/String.substring:(I)Ljava/lang/String;
   #162 = NameAndType        #163:#157    // substring:(I)Ljava/lang/String;
   #163 = Utf8               substring
   #164 = Methodref          #122.#165    // java/lang/String.isBlank:()Z
   #165 = NameAndType        #166:#44     // isBlank:()Z
   #166 = Utf8               isBlank
   #167 = Methodref          #132.#168    // ext/mods/gameserver/communitybbs/custom/model/Function.setSearch:(Ljava/lang/String;)V
   #168 = NameAndType        #169:#170    // setSearch:(Ljava/lang/String;)V
   #169 = Utf8               setSearch
   #170 = Utf8               (Ljava/lang/String;)V
   #171 = Fieldref           #172.#173    // ext/mods/gameserver/network/SystemMessageId.INCORRECT_SYNTAX:Lext/mods/gameserver/network/SystemMessageId;
   #172 = Class              #174         // ext/mods/gameserver/network/SystemMessageId
   #173 = NameAndType        #175:#176    // INCORRECT_SYNTAX:Lext/mods/gameserver/network/SystemMessageId;
   #174 = Utf8               ext/mods/gameserver/network/SystemMessageId
   #175 = Utf8               INCORRECT_SYNTAX
   #176 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
   #177 = Methodref          #178.#179    // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #178 = Class              #180         // ext/mods/gameserver/model/actor/Player
   #179 = NameAndType        #181:#182    // sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #180 = Utf8               ext/mods/gameserver/model/actor/Player
   #181 = Utf8               sendPacket
   #182 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
   #183 = String             #184         // All
   #184 = Utf8               All
   #185 = Methodref          #132.#186    // ext/mods/gameserver/communitybbs/custom/model/Function.setItemType:(Ljava/lang/String;)V
   #186 = NameAndType        #187:#170    // setItemType:(Ljava/lang/String;)V
   #187 = Utf8               setItemType
   #188 = Methodref          #132.#189    // ext/mods/gameserver/communitybbs/custom/model/Function.setItemGrade:(Ljava/lang/String;)V
   #189 = NameAndType        #190:#170    // setItemGrade:(Ljava/lang/String;)V
   #190 = Utf8               setItemGrade
   #191 = Methodref          #132.#192    // ext/mods/gameserver/communitybbs/custom/model/Function.setCurrency:(Ljava/lang/String;)V
   #192 = NameAndType        #193:#170    // setCurrency:(Ljava/lang/String;)V
   #193 = Utf8               setCurrency
   #194 = Methodref          #132.#195    // ext/mods/gameserver/communitybbs/custom/model/Function.setViewId:(I)V
   #195 = NameAndType        #196:#197    // setViewId:(I)V
   #196 = Utf8               setViewId
   #197 = Utf8               (I)V
   #198 = Methodref          #132.#199    // ext/mods/gameserver/communitybbs/custom/model/Function.getViewId:()I
   #199 = NameAndType        #200:#88     // getViewId:()I
   #200 = Utf8               getViewId
   #201 = Methodref          #11.#202     // ext/mods/gameserver/communitybbs/custom/AuctionBBSManager.getAuction:(I)Lext/mods/gameserver/communitybbs/custom/model/Auction;
   #202 = NameAndType        #203:#204    // getAuction:(I)Lext/mods/gameserver/communitybbs/custom/model/Auction;
   #203 = Utf8               getAuction
   #204 = Utf8               (I)Lext/mods/gameserver/communitybbs/custom/model/Auction;
   #205 = Methodref          #178.#206    // ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
   #206 = NameAndType        #207:#208    // getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
   #207 = Utf8               getSysString
   #208 = Utf8               (I[Ljava/lang/Object;)Ljava/lang/String;
   #209 = Methodref          #178.#210    // ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
   #210 = NameAndType        #211:#170    // sendMessage:(Ljava/lang/String;)V
   #211 = Utf8               sendMessage
   #212 = Methodref          #178.#213    // ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
   #213 = NameAndType        #214:#215    // getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
   #214 = Utf8               getInventory
   #215 = Utf8               ()Lext/mods/gameserver/model/itemcontainer/PcInventory;
   #216 = Methodref          #45.#217     // ext/mods/gameserver/communitybbs/custom/model/Auction.getPriceId:()I
   #217 = NameAndType        #218:#88     // getPriceId:()I
   #218 = Utf8               getPriceId
   #219 = Methodref          #220.#221    // ext/mods/gameserver/model/itemcontainer/PcInventory.getItemCount:(I)I
   #220 = Class              #222         // ext/mods/gameserver/model/itemcontainer/PcInventory
   #221 = NameAndType        #223:#224    // getItemCount:(I)I
   #222 = Utf8               ext/mods/gameserver/model/itemcontainer/PcInventory
   #223 = Utf8               getItemCount
   #224 = Utf8               (I)I
   #225 = Methodref          #45.#226     // ext/mods/gameserver/communitybbs/custom/model/Auction.getPriceCount:()I
   #226 = NameAndType        #227:#88     // getPriceCount:()I
   #227 = Utf8               getPriceCount
   #228 = Methodref          #229.#230    // ext/mods/commons/lang/StringUtil.formatNumber:(J)Ljava/lang/String;
   #229 = Class              #231         // ext/mods/commons/lang/StringUtil
   #230 = NameAndType        #232:#233    // formatNumber:(J)Ljava/lang/String;
   #231 = Utf8               ext/mods/commons/lang/StringUtil
   #232 = Utf8               formatNumber
   #233 = Utf8               (J)Ljava/lang/String;
   #234 = Methodref          #45.#235     // ext/mods/gameserver/communitybbs/custom/model/Auction.getPrice:()Lext/mods/gameserver/model/item/kind/Item;
   #235 = NameAndType        #236:#237    // getPrice:()Lext/mods/gameserver/model/item/kind/Item;
   #236 = Utf8               getPrice
   #237 = Utf8               ()Lext/mods/gameserver/model/item/kind/Item;
   #238 = Methodref          #45.#239     // ext/mods/gameserver/communitybbs/custom/model/Auction.tryPurchase:(Lext/mods/gameserver/model/actor/Player;I)Z
   #239 = NameAndType        #240:#241    // tryPurchase:(Lext/mods/gameserver/model/actor/Player;I)Z
   #240 = Utf8               tryPurchase
   #241 = Utf8               (Lext/mods/gameserver/model/actor/Player;I)Z
   #242 = Methodref          #11.#243     // ext/mods/gameserver/communitybbs/custom/AuctionBBSManager.sendIndex:(Lext/mods/gameserver/model/actor/Player;ILext/mods/gameserver/communitybbs/custom/model/Function;)V
   #243 = NameAndType        #244:#245    // sendIndex:(Lext/mods/gameserver/model/actor/Player;ILext/mods/gameserver/communitybbs/custom/model/Function;)V
   #244 = Utf8               sendIndex
   #245 = Utf8               (Lext/mods/gameserver/model/actor/Player;ILext/mods/gameserver/communitybbs/custom/model/Function;)V
   #246 = String             #247         // _friendlist_0_mine
   #247 = Utf8               _friendlist_0_mine
   #248 = Methodref          #122.#249    // java/lang/String.toLowerCase:()Ljava/lang/String;
   #249 = NameAndType        #250:#112    // toLowerCase:()Ljava/lang/String;
   #250 = Utf8               toLowerCase
   #251 = String             #252         // toselect
   #252 = Utf8               toselect
   #253 = String             #254         // unselect
   #254 = Utf8               unselect
   #255 = String             #256         // edit
   #256 = Utf8               edit
   #257 = String             #258         // update
   #258 = Utf8               update
   #259 = String             #260         // remove
   #260 = Utf8               remove
   #261 = String             #262         // sell
   #262 = Utf8               sell
   #263 = Methodref          #132.#264    // ext/mods/gameserver/communitybbs/custom/model/Function.setItemId:(I)V
   #264 = NameAndType        #265:#197    // setItemId:(I)V
   #265 = Utf8               setItemId
   #266 = Class              #267         // ext/mods/gameserver/network/serverpackets/ItemList
   #267 = Utf8               ext/mods/gameserver/network/serverpackets/ItemList
   #268 = Methodref          #266.#269    // ext/mods/gameserver/network/serverpackets/ItemList."<init>":(Lext/mods/gameserver/model/actor/Player;Z)V
   #269 = NameAndType        #5:#270      // "<init>":(Lext/mods/gameserver/model/actor/Player;Z)V
   #270 = Utf8               (Lext/mods/gameserver/model/actor/Player;Z)V
   #271 = Methodref          #178.#272    // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #272 = NameAndType        #181:#273    // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #273 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #274 = Methodref          #132.#275    // ext/mods/gameserver/communitybbs/custom/model/Function.setEditId:(I)V
   #275 = NameAndType        #276:#197    // setEditId:(I)V
   #276 = Utf8               setEditId
   #277 = Methodref          #132.#278    // ext/mods/gameserver/communitybbs/custom/model/Function.getEditId:()I
   #278 = NameAndType        #279:#88     // getEditId:()I
   #279 = Utf8               getEditId
   #280 = Methodref          #45.#281     // ext/mods/gameserver/communitybbs/custom/model/Auction.refund:()V
   #281 = NameAndType        #282:#6      // refund:()V
   #282 = Utf8               refund
   #283 = Methodref          #45.#284     // ext/mods/gameserver/communitybbs/custom/model/Auction.updateDuration:()V
   #284 = NameAndType        #285:#6      // updateDuration:()V
   #285 = Utf8               updateDuration
   #286 = Methodref          #132.#287    // ext/mods/gameserver/communitybbs/custom/model/Function.getItemId:()I
   #287 = NameAndType        #288:#88     // getItemId:()I
   #288 = Utf8               getItemId
   #289 = Methodref          #220.#290    // ext/mods/gameserver/model/itemcontainer/PcInventory.getItemByObjectId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
   #290 = NameAndType        #291:#292    // getItemByObjectId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
   #291 = Utf8               getItemByObjectId
   #292 = Utf8               (I)Lext/mods/gameserver/model/item/instance/ItemInstance;
   #293 = String             #294         // 0
   #294 = Utf8               0
   #295 = Class              #296         // java/lang/NumberFormatException
   #296 = Utf8               java/lang/NumberFormatException
   #297 = String             #298         // Adena
   #298 = Utf8               Adena
   #299 = Methodref          #300.#301    // ext/mods/gameserver/model/item/instance/ItemInstance.getObjectId:()I
   #300 = Class              #302         // ext/mods/gameserver/model/item/instance/ItemInstance
   #301 = NameAndType        #303:#88     // getObjectId:()I
   #302 = Utf8               ext/mods/gameserver/model/item/instance/ItemInstance
   #303 = Utf8               getObjectId
   #304 = Methodref          #11.#305     // ext/mods/gameserver/communitybbs/custom/AuctionBBSManager.sellItem:(Lext/mods/gameserver/model/actor/Player;IILjava/lang/String;I)V
   #305 = NameAndType        #306:#307    // sellItem:(Lext/mods/gameserver/model/actor/Player;IILjava/lang/String;I)V
   #306 = Utf8               sellItem
   #307 = Utf8               (Lext/mods/gameserver/model/actor/Player;IILjava/lang/String;I)V
   #308 = Methodref          #11.#309     // ext/mods/gameserver/communitybbs/custom/AuctionBBSManager.sendIndexMine:(Lext/mods/gameserver/model/actor/Player;ILext/mods/gameserver/communitybbs/custom/model/Function;)V
   #309 = NameAndType        #310:#245    // sendIndexMine:(Lext/mods/gameserver/model/actor/Player;ILext/mods/gameserver/communitybbs/custom/model/Function;)V
   #310 = Utf8               sendIndexMine
   #311 = String             #312         // index.htm
   #312 = Utf8               index.htm
   #313 = Methodref          #11.#314     // ext/mods/gameserver/communitybbs/custom/AuctionBBSManager.getContent:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Ljava/lang/String;
   #314 = NameAndType        #315:#316    // getContent:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Ljava/lang/String;
   #315 = Utf8               getContent
   #316 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Ljava/lang/String;
   #317 = Class              #318         // ext/mods/commons/data/Pagination
   #318 = Utf8               ext/mods/commons/data/Pagination
   #319 = Methodref          #11.#320     // ext/mods/gameserver/communitybbs/custom/AuctionBBSManager.getAuctions:()Ljava/util/Collection;
   #320 = NameAndType        #321:#322    // getAuctions:()Ljava/util/Collection;
   #321 = Utf8               getAuctions
   #322 = Utf8               ()Ljava/util/Collection;
   #323 = InterfaceMethodref #324.#325    // java/util/Collection.stream:()Ljava/util/stream/Stream;
   #324 = Class              #326         // java/util/Collection
   #325 = NameAndType        #327:#328    // stream:()Ljava/util/stream/Stream;
   #326 = Utf8               java/util/Collection
   #327 = Utf8               stream
   #328 = Utf8               ()Ljava/util/stream/Stream;
   #329 = InvokeDynamic      #0:#330      // #0:test:(Lext/mods/gameserver/communitybbs/custom/model/Function;)Ljava/util/function/Predicate;
   #330 = NameAndType        #331:#332    // test:(Lext/mods/gameserver/communitybbs/custom/model/Function;)Ljava/util/function/Predicate;
   #331 = Utf8               test
   #332 = Utf8               (Lext/mods/gameserver/communitybbs/custom/model/Function;)Ljava/util/function/Predicate;
   #333 = InvokeDynamic      #1:#334      // #1:apply:()Ljava/util/function/Function;
   #334 = NameAndType        #335:#336    // apply:()Ljava/util/function/Function;
   #335 = Utf8               apply
   #336 = Utf8               ()Ljava/util/function/Function;
   #337 = InterfaceMethodref #338.#339    // java/util/Comparator.comparing:(Ljava/util/function/Function;)Ljava/util/Comparator;
   #338 = Class              #340         // java/util/Comparator
   #339 = NameAndType        #341:#342    // comparing:(Ljava/util/function/Function;)Ljava/util/Comparator;
   #340 = Utf8               java/util/Comparator
   #341 = Utf8               comparing
   #342 = Utf8               (Ljava/util/function/Function;)Ljava/util/Comparator;
   #343 = InvokeDynamic      #2:#334      // #2:apply:()Ljava/util/function/Function;
   #344 = InterfaceMethodref #338.#345    // java/util/Comparator.thenComparing:(Ljava/util/Comparator;)Ljava/util/Comparator;
   #345 = NameAndType        #346:#347    // thenComparing:(Ljava/util/Comparator;)Ljava/util/Comparator;
   #346 = Utf8               thenComparing
   #347 = Utf8               (Ljava/util/Comparator;)Ljava/util/Comparator;
   #348 = Methodref          #317.#349    // ext/mods/commons/data/Pagination."<init>":(Ljava/util/stream/Stream;IILjava/util/function/Predicate;Ljava/util/Comparator;)V
   #349 = NameAndType        #5:#350      // "<init>":(Ljava/util/stream/Stream;IILjava/util/function/Predicate;Ljava/util/Comparator;)V
   #350 = Utf8               (Ljava/util/stream/Stream;IILjava/util/function/Predicate;Ljava/util/Comparator;)V
   #351 = Class              #352         // java/lang/StringBuilder
   #352 = Utf8               java/lang/StringBuilder
   #353 = Methodref          #351.#3      // java/lang/StringBuilder."<init>":()V
   #354 = Methodref          #132.#355    // ext/mods/gameserver/communitybbs/custom/model/Function.setLastPage:(I)V
   #355 = NameAndType        #356:#197    // setLastPage:(I)V
   #356 = Utf8               setLastPage
   #357 = String             #358         // bypass _friendlist_0_ %page%
   #358 = Utf8               bypass _friendlist_0_ %page%
   #359 = Methodref          #317.#360    // ext/mods/commons/data/Pagination.generatePagesMedium:(Ljava/lang/String;)V
   #360 = NameAndType        #361:#170    // generatePagesMedium:(Ljava/lang/String;)V
   #361 = Utf8               generatePagesMedium
   #362 = String             #363         // <img height=6>
   #363 = Utf8               <img height=6>
   #364 = Methodref          #317.#365    // ext/mods/commons/data/Pagination.append:([Ljava/lang/Object;)V
   #365 = NameAndType        #366:#367    // append:([Ljava/lang/Object;)V
   #366 = Utf8               append
   #367 = Utf8               ([Ljava/lang/Object;)V
   #368 = Methodref          #317.#369    // ext/mods/commons/data/Pagination.iterator:()Ljava/util/Iterator;
   #369 = NameAndType        #370:#371    // iterator:()Ljava/util/Iterator;
   #370 = Utf8               iterator
   #371 = Utf8               ()Ljava/util/Iterator;
   #372 = InterfaceMethodref #373.#374    // java/util/Iterator.hasNext:()Z
   #373 = Class              #375         // java/util/Iterator
   #374 = NameAndType        #376:#44     // hasNext:()Z
   #375 = Utf8               java/util/Iterator
   #376 = Utf8               hasNext
   #377 = InterfaceMethodref #373.#378    // java/util/Iterator.next:()Ljava/lang/Object;
   #378 = NameAndType        #43:#379     // next:()Ljava/lang/Object;
   #379 = Utf8               ()Ljava/lang/Object;
   #380 = Methodref          #45.#381     // ext/mods/gameserver/communitybbs/custom/model/Auction.getItem:()Lext/mods/gameserver/model/item/kind/Item;
   #381 = NameAndType        #382:#237    // getItem:()Lext/mods/gameserver/model/item/kind/Item;
   #382 = Utf8               getItem
   #383 = String             #384         // template-1.htm
   #384 = Utf8               template-1.htm
   #385 = String             #386         // %icon%
   #386 = Utf8               %icon%
   #387 = Methodref          #388.#389    // ext/mods/gameserver/model/item/kind/Item.getIcon:()Ljava/lang/String;
   #388 = Class              #390         // ext/mods/gameserver/model/item/kind/Item
   #389 = NameAndType        #391:#112    // getIcon:()Ljava/lang/String;
   #390 = Utf8               ext/mods/gameserver/model/item/kind/Item
   #391 = Utf8               getIcon
   #392 = Methodref          #122.#393    // java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
   #393 = NameAndType        #394:#395    // replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
   #394 = Utf8               replace
   #395 = Utf8               (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
   #396 = String             #397         // %gradeIcon%
   #397 = Utf8               %gradeIcon%
   #398 = Methodref          #45.#399     // ext/mods/gameserver/communitybbs/custom/model/Auction.getGradeIcon:()Ljava/lang/String;
   #399 = NameAndType        #400:#112    // getGradeIcon:()Ljava/lang/String;
   #400 = Utf8               getGradeIcon
   #401 = String             #402         // %itemName%
   #402 = Utf8               %itemName%
   #403 = Methodref          #11.#404     // ext/mods/gameserver/communitybbs/custom/AuctionBBSManager.getName:(Lext/mods/gameserver/communitybbs/custom/model/Auction;)Ljava/lang/String;
   #404 = NameAndType        #405:#406    // getName:(Lext/mods/gameserver/communitybbs/custom/model/Auction;)Ljava/lang/String;
   #405 = Utf8               getName
   #406 = Utf8               (Lext/mods/gameserver/communitybbs/custom/model/Auction;)Ljava/lang/String;
   #407 = String             #408         // %stackable%
   #408 = Utf8               %stackable%
   #409 = Methodref          #388.#410    // ext/mods/gameserver/model/item/kind/Item.isStackable:()Z
   #410 = NameAndType        #411:#44     // isStackable:()Z
   #411 = Utf8               isStackable
   #412 = InvokeDynamic      #3:#413      // #3:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #413 = NameAndType        #414:#415    // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #414 = Utf8               makeConcatWithConstants
   #415 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
   #416 = String             #417         // %priceCount%
   #417 = Utf8               %priceCount%
   #418 = String             #419         // %currencyName%
   #419 = Utf8               %currencyName%
   #420 = Methodref          #421.#422    // ext/mods/gameserver/custom/data/AuctionCurrencies.getInstance:()Lext/mods/gameserver/custom/data/AuctionCurrencies;
   #421 = Class              #423         // ext/mods/gameserver/custom/data/AuctionCurrencies
   #422 = NameAndType        #424:#425    // getInstance:()Lext/mods/gameserver/custom/data/AuctionCurrencies;
   #423 = Utf8               ext/mods/gameserver/custom/data/AuctionCurrencies
   #424 = Utf8               getInstance
   #425 = Utf8               ()Lext/mods/gameserver/custom/data/AuctionCurrencies;
   #426 = Methodref          #421.#427    // ext/mods/gameserver/custom/data/AuctionCurrencies.getCurrencyName:(I)Ljava/lang/String;
   #427 = NameAndType        #428:#157    // getCurrencyName:(I)Ljava/lang/String;
   #428 = Utf8               getCurrencyName
   #429 = Methodref          #45.#301     // ext/mods/gameserver/communitybbs/custom/model/Auction.getObjectId:()I
   #430 = Methodref          #178.#301    // ext/mods/gameserver/model/actor/Player.getObjectId:()I
   #431 = String             #432         // %button%
   #432 = Utf8               %button%
   #433 = InvokeDynamic      #4:#413      // #4:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #434 = Methodref          #45.#435     // ext/mods/gameserver/communitybbs/custom/model/Auction.getId:()I
   #435 = NameAndType        #436:#88     // getId:()I
   #436 = Utf8               getId
   #437 = InvokeDynamic      #5:#438      // #5:makeConcatWithConstants:(Ljava/lang/String;II)Ljava/lang/String;
   #438 = NameAndType        #414:#439    // makeConcatWithConstants:(Ljava/lang/String;II)Ljava/lang/String;
   #439 = Utf8               (Ljava/lang/String;II)Ljava/lang/String;
   #440 = Methodref          #351.#441    // java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
   #441 = NameAndType        #366:#442    // append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
   #442 = Utf8               (Ljava/lang/String;)Ljava/lang/StringBuilder;
   #443 = String             #444         // %template%
   #444 = Utf8               %template%
   #445 = Methodref          #317.#446    // ext/mods/commons/data/Pagination.getContent:()Ljava/lang/String;
   #446 = NameAndType        #315:#112    // getContent:()Ljava/lang/String;
   #447 = Methodref          #351.#448    // java/lang/StringBuilder.toString:()Ljava/lang/String;
   #448 = NameAndType        #449:#112    // toString:()Ljava/lang/String;
   #449 = Utf8               toString
   #450 = InvokeDynamic      #6:#451      // #6:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #451 = NameAndType        #414:#452    // makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #452 = Utf8               (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #453 = String             #454         // template-2.htm
   #454 = Utf8               template-2.htm
   #455 = String             #456         // %playerName%
   #456 = Utf8               %playerName%
   #457 = Methodref          #45.#458     // ext/mods/gameserver/communitybbs/custom/model/Auction.getPlayerName:()Ljava/lang/String;
   #458 = NameAndType        #459:#112    // getPlayerName:()Ljava/lang/String;
   #459 = Utf8               getPlayerName
   #460 = String             #461         // %auctionEndDate%
   #461 = Utf8               %auctionEndDate%
   #462 = Class              #463         // java/text/SimpleDateFormat
   #463 = Utf8               java/text/SimpleDateFormat
   #464 = String             #465         // dd-MM-yyyy HH:mm:ss
   #465 = Utf8               dd-MM-yyyy HH:mm:ss
   #466 = Methodref          #462.#467    // java/text/SimpleDateFormat."<init>":(Ljava/lang/String;)V
   #467 = NameAndType        #5:#170      // "<init>":(Ljava/lang/String;)V
   #468 = Methodref          #45.#469     // ext/mods/gameserver/communitybbs/custom/model/Auction.getDuration:()J
   #469 = NameAndType        #470:#471    // getDuration:()J
   #470 = Utf8               getDuration
   #471 = Utf8               ()J
   #472 = Methodref          #473.#474    // java/lang/Long.valueOf:(J)Ljava/lang/Long;
   #473 = Class              #475         // java/lang/Long
   #474 = NameAndType        #93:#476     // valueOf:(J)Ljava/lang/Long;
   #475 = Utf8               java/lang/Long
   #476 = Utf8               (J)Ljava/lang/Long;
   #477 = Methodref          #462.#478    // java/text/SimpleDateFormat.format:(Ljava/lang/Object;)Ljava/lang/String;
   #478 = NameAndType        #479:#480    // format:(Ljava/lang/Object;)Ljava/lang/String;
   #479 = Utf8               format
   #480 = Utf8               (Ljava/lang/Object;)Ljava/lang/String;
   #481 = InvokeDynamic      #7:#413      // #7:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #482 = String             #483         // template-stackable-3.htm
   #483 = Utf8               template-stackable-3.htm
   #484 = String             #485         // %totalPrice%
   #485 = Utf8               %totalPrice%
   #486 = Methodref          #45.#487     // ext/mods/gameserver/communitybbs/custom/model/Auction.getItemCount:()I
   #487 = NameAndType        #223:#88     // getItemCount:()I
   #488 = InvokeDynamic      #8:#489      // #8:makeConcatWithConstants:(Ljava/lang/String;I)Ljava/lang/String;
   #489 = NameAndType        #414:#490    // makeConcatWithConstants:(Ljava/lang/String;I)Ljava/lang/String;
   #490 = Utf8               (Ljava/lang/String;I)Ljava/lang/String;
   #491 = String             #492         // %button2%
   #492 = Utf8               %button2%
   #493 = InvokeDynamic      #9:#489      // #9:makeConcatWithConstants:(Ljava/lang/String;I)Ljava/lang/String;
   #494 = String             #495         // template-nonstackable-3.htm
   #495 = Utf8               template-nonstackable-3.htm
   #496 = InvokeDynamic      #10:#489     // #10:makeConcatWithConstants:(Ljava/lang/String;I)Ljava/lang/String;
   #497 = String             #498         // %search%
   #498 = Utf8               %search%
   #499 = Methodref          #132.#500    // ext/mods/gameserver/communitybbs/custom/model/Function.getSearch:()Ljava/lang/String;
   #500 = NameAndType        #501:#112    // getSearch:()Ljava/lang/String;
   #501 = Utf8               getSearch
   #502 = InvokeDynamic      #11:#413     // #11:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #503 = String             #504         // <edit var=param width=250 height=11 length=75>
   #504 = Utf8               <edit var=param width=250 height=11 length=75>
   #505 = InvokeDynamic      #12:#413     // #12:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #506 = String             #507         // %filters%
   #507 = Utf8               %filters%
   #508 = Methodref          #11.#509     // ext/mods/gameserver/communitybbs/custom/AuctionBBSManager.getFilters:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/communitybbs/custom/model/Function;)Ljava/lang/String;
   #509 = NameAndType        #510:#511    // getFilters:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/communitybbs/custom/model/Function;)Ljava/lang/String;
   #510 = Utf8               getFilters
   #511 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/communitybbs/custom/model/Function;)Ljava/lang/String;
   #512 = Methodref          #11.#513     // ext/mods/gameserver/communitybbs/custom/AuctionBBSManager.separateAndSend:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
   #513 = NameAndType        #514:#515    // separateAndSend:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
   #514 = Utf8               separateAndSend
   #515 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
   #516 = String             #517         // index-mine.htm
   #517 = Utf8               index-mine.htm
   #518 = InvokeDynamic      #13:#519     // #13:test:(Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/Predicate;
   #519 = NameAndType        #331:#520    // test:(Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/Predicate;
   #520 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/Predicate;
   #521 = InvokeDynamic      #14:#334     // #14:apply:()Ljava/util/function/Function;
   #522 = InterfaceMethodref #338.#523    // java/util/Comparator.reversed:()Ljava/util/Comparator;
   #523 = NameAndType        #524:#525    // reversed:()Ljava/util/Comparator;
   #524 = Utf8               reversed
   #525 = Utf8               ()Ljava/util/Comparator;
   #526 = InvokeDynamic      #15:#413     // #15:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #527 = Methodref          #317.#85     // ext/mods/commons/data/Pagination.size:()I
   #528 = Methodref          #122.#529    // java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
   #529 = NameAndType        #479:#530    // format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
   #530 = Utf8               (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
   #531 = InvokeDynamic      #16:#413     // #16:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #532 = String             #533         // bypass _friendlist_0_mine %page%
   #533 = Utf8               bypass _friendlist_0_mine %page%
   #534 = String             #535         // auction-template.htm
   #535 = Utf8               auction-template.htm
   #536 = String             #537         // %bgColor%
   #537 = Utf8               %bgColor%
   #538 = Methodref          #539.#540    // java/lang/System.currentTimeMillis:()J
   #539 = Class              #541         // java/lang/System
   #540 = NameAndType        #542:#471    // currentTimeMillis:()J
   #541 = Utf8               java/lang/System
   #542 = Utf8               currentTimeMillis
   #543 = String             #544         // bgcolor=FF0000
   #544 = Utf8               bgcolor=FF0000
   #545 = String             #546         // %isStackable%
   #546 = Utf8               %isStackable%
   #547 = String             #548         // %price%
   #548 = Utf8               %price%
   #549 = String             #550         // %page%
   #550 = Utf8               %page%
   #551 = String             #552         // %auctionId%
   #552 = Utf8               %auctionId%
   #553 = InvokeDynamic      #17:#413     // #17:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #554 = InvokeDynamic      #18:#413     // #18:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #555 = InvokeDynamic      #19:#451     // #19:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #556 = String             #557         // auction-details.htm
   #557 = Utf8               auction-details.htm
   #558 = String             #559         // %auctionFee%
   #559 = Utf8               %auctionFee%
   #560 = Fieldref           #561.#562    // ext/mods/Config.AUCTION_FEE:I
   #561 = Class              #563         // ext/mods/Config
   #562 = NameAndType        #564:#565    // AUCTION_FEE:I
   #563 = Utf8               ext/mods/Config
   #564 = Utf8               AUCTION_FEE
   #565 = Utf8               I
   #566 = String             #567         // %auctionFeeName%
   #567 = Utf8               %auctionFeeName%
   #568 = Fieldref           #561.#569    // ext/mods/Config.AUCTION_ITEM_FEE_NAME:Ljava/lang/String;
   #569 = NameAndType        #570:#571    // AUCTION_ITEM_FEE_NAME:Ljava/lang/String;
   #570 = Utf8               AUCTION_ITEM_FEE_NAME
   #571 = Utf8               Ljava/lang/String;
   #572 = String             #573         // %inventory%
   #573 = Utf8               %inventory%
   #574 = Methodref          #11.#575     // ext/mods/gameserver/communitybbs/custom/AuctionBBSManager.getInventory:(Lext/mods/gameserver/model/actor/Player;I)Ljava/lang/String;
   #575 = NameAndType        #214:#576    // getInventory:(Lext/mods/gameserver/model/actor/Player;I)Ljava/lang/String;
   #576 = Utf8               (Lext/mods/gameserver/model/actor/Player;I)Ljava/lang/String;
   #577 = Methodref          #388.#578    // ext/mods/gameserver/model/item/kind/Item.getName:()Ljava/lang/String;
   #578 = NameAndType        #405:#112    // getName:()Ljava/lang/String;
   #579 = Methodref          #122.#580    // java/lang/String.substring:(II)Ljava/lang/String;
   #580 = NameAndType        #163:#581    // substring:(II)Ljava/lang/String;
   #581 = Utf8               (II)Ljava/lang/String;
   #582 = InvokeDynamic      #20:#413     // #20:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #583 = Methodref          #388.#584    // ext/mods/gameserver/model/item/kind/Item.isEquipable:()Z
   #584 = NameAndType        #585:#44     // isEquipable:()Z
   #585 = Utf8               isEquipable
   #586 = String             #587         //  -
   #587 = Utf8                -
   #588 = Methodref          #122.#589    // java/lang/String.contains:(Ljava/lang/CharSequence;)Z
   #589 = NameAndType        #590:#591    // contains:(Ljava/lang/CharSequence;)Z
   #590 = Utf8               contains
   #591 = Utf8               (Ljava/lang/CharSequence;)Z
   #592 = String             #593         // </font> - <font color=LEVEL>
   #593 = Utf8               </font> - <font color=LEVEL>
   #594 = InvokeDynamic      #21:#413     // #21:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #595 = InvokeDynamic      #22:#451     // #22:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #596 = Methodref          #45.#597     // ext/mods/gameserver/communitybbs/custom/model/Auction.getItemEnchant:()I
   #597 = NameAndType        #598:#88     // getItemEnchant:()I
   #598 = Utf8               getItemEnchant
   #599 = InvokeDynamic      #23:#489     // #23:makeConcatWithConstants:(Ljava/lang/String;I)Ljava/lang/String;
   #600 = String             #601         // filter.htm
   #601 = Utf8               filter.htm
   #602 = String             #603         // %type%
   #603 = Utf8               %type%
   #604 = Methodref          #132.#605    // ext/mods/gameserver/communitybbs/custom/model/Function.getItemType:()Ljava/lang/String;
   #605 = NameAndType        #606:#112    // getItemType:()Ljava/lang/String;
   #606 = Utf8               getItemType
   #607 = String             #608         // All,Weapon,Armor,Jewel,Other,Soulshot/Spiritshot,Enchant
   #608 = Utf8               All,Weapon,Armor,Jewel,Other,Soulshot/Spiritshot,Enchant
   #609 = Methodref          #11.#610     // ext/mods/gameserver/communitybbs/custom/AuctionBBSManager.getFilters:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #610 = NameAndType        #510:#611    // getFilters:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #611 = Utf8               (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #612 = String             #613         // %grade%
   #613 = Utf8               %grade%
   #614 = Methodref          #132.#615    // ext/mods/gameserver/communitybbs/custom/model/Function.getItemGrade:()Ljava/lang/String;
   #615 = NameAndType        #616:#112    // getItemGrade:()Ljava/lang/String;
   #616 = Utf8               getItemGrade
   #617 = String             #618         // All,S,A,B,C,D,NONE
   #618 = Utf8               All,S,A,B,C,D,NONE
   #619 = Methodref          #351.#467    // java/lang/StringBuilder."<init>":(Ljava/lang/String;)V
   #620 = Methodref          #421.#621    // ext/mods/gameserver/custom/data/AuctionCurrencies.getCurrencyNames:()Ljava/util/Set;
   #621 = NameAndType        #622:#623    // getCurrencyNames:()Ljava/util/Set;
   #622 = Utf8               getCurrencyNames
   #623 = Utf8               ()Ljava/util/Set;
   #624 = InterfaceMethodref #625.#369    // java/util/Set.iterator:()Ljava/util/Iterator;
   #625 = Class              #626         // java/util/Set
   #626 = Utf8               java/util/Set
   #627 = String             #628         // ,
   #628 = Utf8               ,
   #629 = String             #630         // %currency%
   #630 = Utf8               %currency%
   #631 = Methodref          #132.#632    // ext/mods/gameserver/communitybbs/custom/model/Function.getCurrency:()Ljava/lang/String;
   #632 = NameAndType        #633:#112    // getCurrency:()Ljava/lang/String;
   #633 = Utf8               getCurrency
   #634 = String             #635         // <table width=180>
   #635 = Utf8               <table width=180>
   #636 = Methodref          #122.#637    // java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
   #637 = NameAndType        #638:#639    // split:(Ljava/lang/String;)[Ljava/lang/String;
   #638 = Utf8               split
   #639 = Utf8               (Ljava/lang/String;)[Ljava/lang/String;
   #640 = Methodref          #122.#641    // java/lang/String.toUpperCase:()Ljava/lang/String;
   #641 = NameAndType        #642:#112    // toUpperCase:()Ljava/lang/String;
   #642 = Utf8               toUpperCase
   #643 = Methodref          #122.#644    // java/lang/String.replaceAll:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #644 = NameAndType        #645:#452    // replaceAll:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #645 = Utf8               replaceAll
   #646 = String             #647         // width=12 height=12 back=L2UI.CheckBox_checked fore=L2UI.CheckBox_checked
   #647 = Utf8               width=12 height=12 back=L2UI.CheckBox_checked fore=L2UI.CheckBox_checked
   #648 = InvokeDynamic      #24:#451     // #24:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #649 = String             #650         // NONE
   #650 = Utf8               NONE
   #651 = String             #652         // D
   #652 = Utf8               D
   #653 = String             #654         // C
   #654 = Utf8               C
   #655 = String             #656         // B
   #656 = Utf8               B
   #657 = String             #658         // A
   #658 = Utf8               A
   #659 = String             #660         // S
   #660 = Utf8               S
   #661 = String             #662         // No-Grade
   #662 = Utf8               No-Grade
   #663 = InvokeDynamic      #25:#413     // #25:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #664 = String             #665         // Enchant
   #665 = Utf8               Enchant
   #666 = String             #667         // Enchant Scroll
   #667 = Utf8               Enchant Scroll
   #668 = String             #669         // <tr><td width=20 align=right><button
   #669 = Utf8               <tr><td width=20 align=right><button
   #670 = String             #671         // ></td><td width=160 align=left>
   #671 = Utf8               ></td><td width=160 align=left>
   #672 = String             #673         // </td></tr>
   #673 = Utf8               </td></tr>
   #674 = Methodref          #229.#675    // ext/mods/commons/lang/StringUtil.append:(Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
   #675 = NameAndType        #366:#676    // append:(Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
   #676 = Utf8               (Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
   #677 = String             #678         // </table>
   #678 = Utf8               </table>
   #679 = Methodref          #680.#681    // ext/mods/gameserver/data/xml/ItemData.getInstance:()Lext/mods/gameserver/data/xml/ItemData;
   #680 = Class              #682         // ext/mods/gameserver/data/xml/ItemData
   #681 = NameAndType        #424:#683    // getInstance:()Lext/mods/gameserver/data/xml/ItemData;
   #682 = Utf8               ext/mods/gameserver/data/xml/ItemData
   #683 = Utf8               ()Lext/mods/gameserver/data/xml/ItemData;
   #684 = Methodref          #300.#287    // ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
   #685 = Methodref          #680.#686    // ext/mods/gameserver/data/xml/ItemData.getTemplate:(I)Lext/mods/gameserver/model/item/kind/Item;
   #686 = NameAndType        #687:#688    // getTemplate:(I)Lext/mods/gameserver/model/item/kind/Item;
   #687 = Utf8               getTemplate
   #688 = Utf8               (I)Lext/mods/gameserver/model/item/kind/Item;
   #689 = Methodref          #300.#578    // ext/mods/gameserver/model/item/instance/ItemInstance.getName:()Ljava/lang/String;
   #690 = Methodref          #300.#584    // ext/mods/gameserver/model/item/instance/ItemInstance.isEquipable:()Z
   #691 = String             #692         // inventory-item.htm
   #692 = Utf8               inventory-item.htm
   #693 = InvokeDynamic      #26:#694     // #26:makeConcatWithConstants:(I)Ljava/lang/String;
   #694 = NameAndType        #414:#157    // makeConcatWithConstants:(I)Ljava/lang/String;
   #695 = String             #696         // %etc%
   #696 = Utf8               %etc%
   #697 = Methodref          #300.#381    // ext/mods/gameserver/model/item/instance/ItemInstance.getItem:()Lext/mods/gameserver/model/item/kind/Item;
   #698 = Class              #699         // ext/mods/gameserver/model/item/kind/EtcItem
   #699 = Utf8               ext/mods/gameserver/model/item/kind/EtcItem
   #700 = Methodref          #698.#701    // ext/mods/gameserver/model/item/kind/EtcItem.getItemType:()Lext/mods/gameserver/enums/items/EtcItemType;
   #701 = NameAndType        #606:#702    // getItemType:()Lext/mods/gameserver/enums/items/EtcItemType;
   #702 = Utf8               ()Lext/mods/gameserver/enums/items/EtcItemType;
   #703 = Fieldref           #704.#705    // ext/mods/gameserver/enums/items/EtcItemType.PET_COLLAR:Lext/mods/gameserver/enums/items/EtcItemType;
   #704 = Class              #706         // ext/mods/gameserver/enums/items/EtcItemType
   #705 = NameAndType        #707:#708    // PET_COLLAR:Lext/mods/gameserver/enums/items/EtcItemType;
   #706 = Utf8               ext/mods/gameserver/enums/items/EtcItemType
   #707 = Utf8               PET_COLLAR
   #708 = Utf8               Lext/mods/gameserver/enums/items/EtcItemType;
   #709 = Methodref          #300.#710    // ext/mods/gameserver/model/item/instance/ItemInstance.getEnchantLevel:()I
   #710 = NameAndType        #711:#88     // getEnchantLevel:()I
   #711 = Utf8               getEnchantLevel
   #712 = InvokeDynamic      #27:#694     // #27:makeConcatWithConstants:(I)Ljava/lang/String;
   #713 = Methodref          #300.#410    // ext/mods/gameserver/model/item/instance/ItemInstance.isStackable:()Z
   #714 = Methodref          #300.#715    // ext/mods/gameserver/model/item/instance/ItemInstance.getCount:()I
   #715 = NameAndType        #716:#88     // getCount:()I
   #716 = Utf8               getCount
   #717 = InvokeDynamic      #28:#413     // #28:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #718 = InvokeDynamic      #29:#694     // #29:makeConcatWithConstants:(I)Ljava/lang/String;
   #719 = String             #720         // %name%
   #720 = Utf8               %name%
   #721 = String             #722         // %auction_fee%
   #722 = Utf8               %auction_fee%
   #723 = String             #724         // %format%
   #724 = Utf8               %format%
   #725 = Fieldref           #726.#727    // java/util/concurrent/TimeUnit.DAYS:Ljava/util/concurrent/TimeUnit;
   #726 = Class              #728         // java/util/concurrent/TimeUnit
   #727 = NameAndType        #729:#730    // DAYS:Ljava/util/concurrent/TimeUnit;
   #728 = Utf8               java/util/concurrent/TimeUnit
   #729 = Utf8               DAYS
   #730 = Utf8               Ljava/util/concurrent/TimeUnit;
   #731 = Long               7l
   #733 = Methodref          #726.#734    // java/util/concurrent/TimeUnit.toMillis:(J)J
   #734 = NameAndType        #735:#736    // toMillis:(J)J
   #735 = Utf8               toMillis
   #736 = Utf8               (J)J
   #737 = String             #738         // <edit var=quantity type=number width=180 height=12>
   #738 = Utf8               <edit var=quantity type=number width=180 height=12>
   #739 = String             #740         // <font color=B09B79>1</font>
   #740 = Utf8               <font color=B09B79>1</font>
   #741 = Methodref          #351.#159    // java/lang/StringBuilder.length:()I
   #742 = String             #743         // ;
   #743 = Utf8               ;
   #744 = String             #745         // %currencyList%
   #745 = Utf8               %currencyList%
   #746 = String             #747         // %combobox%
   #747 = Utf8               %combobox%
   #748 = Methodref          #122.#749    // java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
   #749 = NameAndType        #93:#480     // valueOf:(Ljava/lang/Object;)Ljava/lang/String;
   #750 = InvokeDynamic      #30:#413     // #30:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #751 = String             #752         // $quantity
   #752 = Utf8               $quantity
   #753 = String             #754         // 1
   #754 = Utf8               1
   #755 = InvokeDynamic      #31:#756     // #31:makeConcatWithConstants:(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;
   #756 = NameAndType        #414:#757    // makeConcatWithConstants:(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;
   #757 = Utf8               (Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;
   #758 = String             #759         // inventory-item1.htm
   #759 = Utf8               inventory-item1.htm
   #760 = InvokeDynamic      #32:#761     // #32:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;
   #761 = NameAndType        #414:#762    // makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;
   #762 = Utf8               (Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;
   #763 = String             #764         // inventory-item2.htm
   #764 = Utf8               inventory-item2.htm
   #765 = InvokeDynamic      #33:#761     // #33:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;
   #766 = InterfaceMethodref #84.#767     // java/util/Map.values:()Ljava/util/Collection;
   #767 = NameAndType        #768:#322    // values:()Ljava/util/Collection;
   #768 = Utf8               values
   #769 = InvokeDynamic      #34:#519     // #34:test:(Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/Predicate;
   #770 = InterfaceMethodref #771.#772    // java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
   #771 = Class              #773         // java/util/stream/Stream
   #772 = NameAndType        #774:#775    // filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
   #773 = Utf8               java/util/stream/Stream
   #774 = Utf8               filter
   #775 = Utf8               (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
   #776 = InterfaceMethodref #771.#777    // java/util/stream/Stream.count:()J
   #777 = NameAndType        #778:#471    // count:()J
   #778 = Utf8               count
   #779 = Fieldref           #561.#780    // ext/mods/Config.AUCTION_LIMIT_ITEM:I
   #780 = NameAndType        #781:#565    // AUCTION_LIMIT_ITEM:I
   #781 = Utf8               AUCTION_LIMIT_ITEM
   #782 = Methodref          #300.#783    // ext/mods/gameserver/model/item/instance/ItemInstance.isQuestItem:()Z
   #783 = NameAndType        #784:#44     // isQuestItem:()Z
   #784 = Utf8               isQuestItem
   #785 = Methodref          #300.#786    // ext/mods/gameserver/model/item/instance/ItemInstance.isHeroItem:()Z
   #786 = NameAndType        #787:#44     // isHeroItem:()Z
   #787 = Utf8               isHeroItem
   #788 = Integer            2147483647
   #789 = Long               2147483647l
   #791 = Methodref          #421.#792    // ext/mods/gameserver/custom/data/AuctionCurrencies.getCurrencyId:(Ljava/lang/String;)I
   #792 = NameAndType        #793:#130    // getCurrencyId:(Ljava/lang/String;)I
   #793 = Utf8               getCurrencyId
   #794 = InvokeDynamic      #35:#413     // #35:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #795 = Fieldref           #561.#796    // ext/mods/Config.AUCTION_ITEM_FEE:I
   #796 = NameAndType        #797:#565    // AUCTION_ITEM_FEE:I
   #797 = Utf8               AUCTION_ITEM_FEE
   #798 = Methodref          #178.#799    // ext/mods/gameserver/model/actor/Player.destroyItemByItemId:(IIZ)Z
   #799 = NameAndType        #800:#801    // destroyItemByItemId:(IIZ)Z
   #800 = Utf8               destroyItemByItemId
   #801 = Utf8               (IIZ)Z
   #802 = Methodref          #178.#803    // ext/mods/gameserver/model/actor/Player.destroyItem:(IIZ)Z
   #803 = NameAndType        #804:#801    // destroyItem:(IIZ)Z
   #804 = Utf8               destroyItem
   #805 = Methodref          #45.#806     // ext/mods/gameserver/communitybbs/custom/model/Auction."<init>":(IIIIII)V
   #806 = NameAndType        #5:#807      // "<init>":(IIIIII)V
   #807 = Utf8               (IIIIII)V
   #808 = InterfaceMethodref #84.#809     // java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #809 = NameAndType        #810:#811    // put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #810 = Utf8               put
   #811 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #812 = Methodref          #45.#813     // ext/mods/gameserver/communitybbs/custom/model/Auction.store:()V
   #813 = NameAndType        #814:#6      // store:()V
   #814 = Utf8               store
   #815 = InterfaceMethodref #84.#816     // java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
   #816 = NameAndType        #817:#818    // get:(Ljava/lang/Object;)Ljava/lang/Object;
   #817 = Utf8               get
   #818 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
   #819 = InvokeDynamic      #36:#820     // #36:test:()Ljava/util/function/Predicate;
   #820 = NameAndType        #331:#821    // test:()Ljava/util/function/Predicate;
   #821 = Utf8               ()Ljava/util/function/Predicate;
   #822 = InterfaceMethodref #324.#823    // java/util/Collection.removeIf:(Ljava/util/function/Predicate;)Z
   #823 = NameAndType        #824:#825    // removeIf:(Ljava/util/function/Predicate;)Z
   #824 = Utf8               removeIf
   #825 = Utf8               (Ljava/util/function/Predicate;)Z
   #826 = InterfaceMethodref #84.#827     // java/util/Map.keySet:()Ljava/util/Set;
   #827 = NameAndType        #828:#623    // keySet:()Ljava/util/Set;
   #828 = Utf8               keySet
   #829 = InterfaceMethodref #625.#325    // java/util/Set.stream:()Ljava/util/stream/Stream;
   #830 = InvokeDynamic      #37:#831     // #37:compare:()Ljava/util/Comparator;
   #831 = NameAndType        #832:#525    // compare:()Ljava/util/Comparator;
   #832 = Utf8               compare
   #833 = InterfaceMethodref #771.#834    // java/util/stream/Stream.max:(Ljava/util/Comparator;)Ljava/util/Optional;
   #834 = NameAndType        #835:#836    // max:(Ljava/util/Comparator;)Ljava/util/Optional;
   #835 = Utf8               max
   #836 = Utf8               (Ljava/util/Comparator;)Ljava/util/Optional;
   #837 = Methodref          #838.#839    // java/util/Optional.orElse:(Ljava/lang/Object;)Ljava/lang/Object;
   #838 = Class              #840         // java/util/Optional
   #839 = NameAndType        #841:#818    // orElse:(Ljava/lang/Object;)Ljava/lang/Object;
   #840 = Utf8               java/util/Optional
   #841 = Utf8               orElse
   #842 = Methodref          #90.#843     // java/lang/Integer.intValue:()I
   #843 = NameAndType        #844:#88     // intValue:()I
   #844 = Utf8               intValue
   #845 = Methodref          #132.#3      // ext/mods/gameserver/communitybbs/custom/model/Function."<init>":()V
   #846 = InterfaceMethodref #84.#847     // java/util/Map.putIfAbsent:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #847 = NameAndType        #848:#811    // putIfAbsent:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #848 = Utf8               putIfAbsent
   #849 = Fieldref           #561.#850    // ext/mods/Config.ENABLED_AUCTION:Z
   #850 = NameAndType        #851:#852    // ENABLED_AUCTION:Z
   #851 = Utf8               ENABLED_AUCTION
   #852 = Utf8               Z
   #853 = Methodref          #854.#855    // ext/mods/gameserver/data/HTMLData.getInstance:()Lext/mods/gameserver/data/HTMLData;
   #854 = Class              #856         // ext/mods/gameserver/data/HTMLData
   #855 = NameAndType        #424:#857    // getInstance:()Lext/mods/gameserver/data/HTMLData;
   #856 = Utf8               ext/mods/gameserver/data/HTMLData
   #857 = Utf8               ()Lext/mods/gameserver/data/HTMLData;
   #858 = Methodref          #178.#859    // ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
   #859 = NameAndType        #860:#861    // getLocale:()Ljava/util/Locale;
   #860 = Utf8               getLocale
   #861 = Utf8               ()Ljava/util/Locale;
   #862 = Methodref          #11.#863     // ext/mods/gameserver/communitybbs/custom/AuctionBBSManager.getFolder:()Ljava/lang/String;
   #863 = NameAndType        #864:#112    // getFolder:()Ljava/lang/String;
   #864 = Utf8               getFolder
   #865 = InvokeDynamic      #38:#451     // #38:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #866 = Methodref          #854.#867    // ext/mods/gameserver/data/HTMLData.getHtm:(Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;
   #867 = NameAndType        #868:#869    // getHtm:(Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;
   #868 = Utf8               getHtm
   #869 = Utf8               (Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;
   #870 = InvokeDynamic      #39:#413     // #39:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #871 = String             #872         // custom/auction/
   #872 = Utf8               custom/auction/
   #873 = Fieldref           #874.#875    // ext/mods/gameserver/communitybbs/custom/AuctionBBSManager$SingletonHolder.INSTANCE:Lext/mods/gameserver/communitybbs/custom/AuctionBBSManager;
   #874 = Class              #876         // ext/mods/gameserver/communitybbs/custom/AuctionBBSManager$SingletonHolder
   #875 = NameAndType        #877:#878    // INSTANCE:Lext/mods/gameserver/communitybbs/custom/AuctionBBSManager;
   #876 = Utf8               ext/mods/gameserver/communitybbs/custom/AuctionBBSManager$SingletonHolder
   #877 = Utf8               INSTANCE
   #878 = Utf8               Lext/mods/gameserver/communitybbs/custom/AuctionBBSManager;
   #879 = Methodref          #45.#880     // ext/mods/gameserver/communitybbs/custom/model/Auction.filter:(Lext/mods/gameserver/communitybbs/custom/model/Function;)Z
   #880 = NameAndType        #774:#881    // filter:(Lext/mods/gameserver/communitybbs/custom/model/Function;)Z
   #881 = Utf8               (Lext/mods/gameserver/communitybbs/custom/model/Function;)Z
   #882 = Utf8               SELECT_AUCTION
   #883 = Utf8               ConstantValue
   #884 = Utf8               Signature
   #885 = Utf8               Ljava/util/Map<Ljava/lang/Integer;Lext/mods/gameserver/communitybbs/custom/model/Auction;>;
   #886 = Utf8               Ljava/util/Map<Ljava/lang/Integer;Lext/mods/gameserver/communitybbs/custom/model/Function;>;
   #887 = Utf8               Code
   #888 = Utf8               LineNumberTable
   #889 = Utf8               LocalVariableTable
   #890 = Utf8               this
   #891 = Utf8               load
   #892 = Utf8               rs
   #893 = Utf8               Ljava/sql/ResultSet;
   #894 = Utf8               ps
   #895 = Utf8               Ljava/sql/PreparedStatement;
   #896 = Utf8               con
   #897 = Utf8               Ljava/sql/Connection;
   #898 = Utf8               e
   #899 = Utf8               Ljava/lang/Exception;
   #900 = Utf8               StackMapTable
   #901 = Utf8               parseCmd
   #902 = Utf8               search
   #903 = Utf8               auction
   #904 = Utf8               Lext/mods/gameserver/communitybbs/custom/model/Auction;
   #905 = Utf8               page
   #906 = Utf8               subCommand
   #907 = Utf8               token1
   #908 = Utf8               value1
   #909 = Utf8               token2
   #910 = Utf8               value2
   #911 = Utf8               item
   #912 = Utf8               Lext/mods/gameserver/model/item/instance/ItemInstance;
   #913 = Utf8               param
   #914 = Utf8               command
   #915 = Utf8               player
   #916 = Utf8               Lext/mods/gameserver/model/actor/Player;
   #917 = Utf8               st
   #918 = Utf8               Ljava/util/StringTokenizer;
   #919 = Utf8               commandToken
   #920 = Utf8               function
   #921 = Utf8               Lext/mods/gameserver/communitybbs/custom/model/Function;
   #922 = Utf8               Lext/mods/gameserver/model/item/kind/Item;
   #923 = Utf8               auctionTemplate
   #924 = Utf8               stackableTemplate
   #925 = Utf8               nonStackableTemplate
   #926 = Utf8               content
   #927 = Utf8               list
   #928 = Utf8               Lext/mods/commons/data/Pagination;
   #929 = Utf8               auctionView
   #930 = Utf8               str
   #931 = Utf8               Ljava/lang/StringBuilder;
   #932 = Utf8               LocalVariableTypeTable
   #933 = Utf8               Lext/mods/commons/data/Pagination<Lext/mods/gameserver/communitybbs/custom/model/Auction;>;
   #934 = Utf8               auctionEdit
   #935 = Utf8               listBuilder
   #936 = Utf8               name
   #937 = Utf8               sb
   #938 = Utf8               currencyOptions
   #939 = Utf8               typeAll
   #940 = Utf8               bypass
   #941 = Class              #942         // "[Ljava/lang/String;"
   #942 = Utf8               [Ljava/lang/String;
   #943 = Utf8               etc
   #944 = Utf8               Lext/mods/gameserver/model/item/kind/EtcItem;
   #945 = Utf8               items
   #946 = Utf8               currencyList
   #947 = Utf8               itemId
   #948 = Utf8               selectItem
   #949 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/item/instance/ItemInstance;)Z
   #950 = Utf8               quantity
   #951 = Utf8               price
   #952 = Utf8               costId
   #953 = Utf8               id
   #954 = Utf8               ()Ljava/util/Collection<Lext/mods/gameserver/communitybbs/custom/model/Auction;>;
   #955 = Utf8               nextId
   #956 = Utf8               file
   #957 = Utf8               ()Lext/mods/gameserver/communitybbs/custom/AuctionBBSManager;
   #958 = Utf8               lambda$getAuctions$0
   #959 = Utf8               (Lext/mods/gameserver/communitybbs/custom/model/Auction;)Z
   #960 = Utf8               a
   #961 = Utf8               lambda$selectItem$0
   #962 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/communitybbs/custom/model/Auction;)Z
   #963 = Utf8               lambda$sendIndexMine$0
   #964 = Utf8               lambda$sendIndex$0
   #965 = Utf8               (Lext/mods/gameserver/communitybbs/custom/model/Function;Lext/mods/gameserver/communitybbs/custom/model/Auction;)Z
   #966 = Utf8               SourceFile
   #967 = Utf8               AuctionBBSManager.java
   #968 = Utf8               NestMembers
   #969 = Utf8               BootstrapMethods
   #970 = MethodType         #126         //  (Ljava/lang/Object;)Z
   #971 = MethodHandle       6:#972       // REF_invokeStatic ext/mods/gameserver/communitybbs/custom/AuctionBBSManager.lambda$sendIndex$0:(Lext/mods/gameserver/communitybbs/custom/model/Function;Lext/mods/gameserver/communitybbs/custom/model/Auction;)Z
   #972 = Methodref          #11.#973     // ext/mods/gameserver/communitybbs/custom/AuctionBBSManager.lambda$sendIndex$0:(Lext/mods/gameserver/communitybbs/custom/model/Function;Lext/mods/gameserver/communitybbs/custom/model/Auction;)Z
   #973 = NameAndType        #964:#965    // lambda$sendIndex$0:(Lext/mods/gameserver/communitybbs/custom/model/Function;Lext/mods/gameserver/communitybbs/custom/model/Auction;)Z
   #974 = MethodType         #959         //  (Lext/mods/gameserver/communitybbs/custom/model/Auction;)Z
   #975 = MethodType         #818         //  (Ljava/lang/Object;)Ljava/lang/Object;
   #976 = MethodHandle       5:#977       // REF_invokeVirtual ext/mods/gameserver/communitybbs/custom/model/Auction.getItemName:()Ljava/lang/String;
   #977 = Methodref          #45.#978     // ext/mods/gameserver/communitybbs/custom/model/Auction.getItemName:()Ljava/lang/String;
   #978 = NameAndType        #979:#112    // getItemName:()Ljava/lang/String;
   #979 = Utf8               getItemName
   #980 = MethodType         #406         //  (Lext/mods/gameserver/communitybbs/custom/model/Auction;)Ljava/lang/String;
   #981 = MethodHandle       5:#225       // REF_invokeVirtual ext/mods/gameserver/communitybbs/custom/model/Auction.getPriceCount:()I
   #982 = MethodType         #983         //  (Lext/mods/gameserver/communitybbs/custom/model/Auction;)Ljava/lang/Integer;
   #983 = Utf8               (Lext/mods/gameserver/communitybbs/custom/model/Auction;)Ljava/lang/Integer;
   #984 = String             #985         //  \u0001
   #985 = Utf8                \u0001
   #986 = String             #987         // <font color=5A5A5A>\u0001</font>
   #987 = Utf8               <font color=5A5A5A>\u0001</font>
   #988 = String             #989         // <img height=6><button value=\"\u0001\" action=\"bypass _friendlist_0_ \u0001 select \u0001\" width=65 height=19 back=L2UI_ch3.smallbutton2_down fore=L2UI_ch3.smallbutton2>
   #989 = Utf8               <img height=6><button value=\"\u0001\" action=\"bypass _friendlist_0_ \u0001 select \u0001\" width=65 height=19 back=L2UI_ch3.smallbutton2_down fore=L2UI_ch3.smallbutton2>
   #990 = String             #991         // \u0001\u0001
   #991 = Utf8               \u0001\u0001
   #992 = String             #993         // \u0001 GMT +2
   #993 = Utf8               \u0001 GMT +2
   #994 = String             #995         // <button value=\u0001 action=\"bypass _friendlist_0_ \u0001 purchase $quanity\" width=65 height=19 back=L2UI_ch3.smallbutton2_down fore=L2UI_ch3.smallbutton2>
   #995 = Utf8               <button value=\u0001 action=\"bypass _friendlist_0_ \u0001 purchase $quanity\" width=65 height=19 back=L2UI_ch3.smallbutton2_down fore=L2UI_ch3.smallbutton2>
   #996 = String             #997         // <button value=\u0001 action=\"bypass _friendlist_0_ \u0001 cancel\" width=65 height=19 back=L2UI_ch3.smallbutton2_down fore=L2UI_ch3.smallbutton2>
   #997 = Utf8               <button value=\u0001 action=\"bypass _friendlist_0_ \u0001 cancel\" width=65 height=19 back=L2UI_ch3.smallbutton2_down fore=L2UI_ch3.smallbutton2>
   #998 = String             #999         // <button value=\u0001 action=\"bypass _friendlist_0_ \u0001 purchase 1\" width=65 height=19 back=L2UI_ch3.smallbutton2_down fore=L2UI_ch3.smallbutton2>
   #999 = Utf8               <button value=\u0001 action=\"bypass _friendlist_0_ \u0001 purchase 1\" width=65 height=19 back=L2UI_ch3.smallbutton2_down fore=L2UI_ch3.smallbutton2>
  #1000 = String             #1001        // <button value=\u0001 action=\"bypass _friendlist_0_ 1 clear\" width=75 height=21 back=L2UI_ch3.bigbutton2 fore=L2UI_ch3.Btn1_normal>
  #1001 = Utf8               <button value=\u0001 action=\"bypass _friendlist_0_ 1 clear\" width=75 height=21 back=L2UI_ch3.bigbutton2 fore=L2UI_ch3.Btn1_normal>
  #1002 = String             #1003        // <button value=\u0001 action=\"bypass _friendlist_0_ 1 src $param\" width=75 height=21 back=L2UI_ch3.Btn1_normalOn fore=L2UI_ch3.Btn1_normal>
  #1003 = Utf8               <button value=\u0001 action=\"bypass _friendlist_0_ 1 src $param\" width=75 height=21 back=L2UI_ch3.Btn1_normalOn fore=L2UI_ch3.Btn1_normal>
  #1004 = MethodHandle       6:#1005      // REF_invokeStatic ext/mods/gameserver/communitybbs/custom/AuctionBBSManager.lambda$sendIndexMine$0:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/communitybbs/custom/model/Auction;)Z
  #1005 = Methodref          #11.#1006    // ext/mods/gameserver/communitybbs/custom/AuctionBBSManager.lambda$sendIndexMine$0:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/communitybbs/custom/model/Auction;)Z
  #1006 = NameAndType        #963:#962    // lambda$sendIndexMine$0:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/communitybbs/custom/model/Auction;)Z
  #1007 = MethodHandle       5:#468       // REF_invokeVirtual ext/mods/gameserver/communitybbs/custom/model/Auction.getDuration:()J
  #1008 = MethodType         #1009        //  (Lext/mods/gameserver/communitybbs/custom/model/Auction;)Ljava/lang/Long;
  #1009 = Utf8               (Lext/mods/gameserver/communitybbs/custom/model/Auction;)Ljava/lang/Long;
  #1010 = String             #1011        // <font color=A3A3A3>\u0001</font> <font color=B09B79>(%s/9)</font>
  #1011 = Utf8               <font color=A3A3A3>\u0001</font> <font color=B09B79>(%s/9)</font>
  #1012 = String             #1013        // <img height=6>\u0001
  #1013 = Utf8               <img height=6>\u0001
  #1014 = String             #1015        // <font color=00FF00>\u0001 GMT +2</font>
  #1015 = Utf8               <font color=00FF00>\u0001 GMT +2</font>
  #1016 = String             #1017        // <font color=FF0000>\u0001</font>
  #1017 = Utf8               <font color=FF0000>\u0001</font>
  #1018 = String             #1019        // <img height=6><font color=A3A3A3>\u0001</font> \u0001
  #1019 = Utf8               <img height=6><font color=A3A3A3>\u0001</font> \u0001
  #1020 = String             #1021        // \u0001..
  #1021 = Utf8               \u0001..
  #1022 = String             #1023        // \u0001</font>
  #1023 = Utf8               \u0001</font>
  #1024 = String             #1025        // \u0001 (\u0001)
  #1025 = Utf8               \u0001 (\u0001)
  #1026 = String             #1027        // \u0001 <font color=B09B79>+\u0001</font>
  #1027 = Utf8               \u0001 <font color=B09B79>+\u0001</font>
  #1028 = String             #1029        // action=\"bypass _friendlist_0_ 1 \u0001 \u0001\" width=12 height=12 back=L2UI.CheckBox fore=L2UI.CheckBox
  #1029 = Utf8               action=\"bypass _friendlist_0_ 1 \u0001 \u0001\" width=12 height=12 back=L2UI.CheckBox fore=L2UI.CheckBox
  #1030 = String             #1031        // \u0001-Grade
  #1031 = Utf8               \u0001-Grade
  #1032 = String             #1033        // <button value=\"Remove\" action=\"bypass _friendlist_0_mine \u0001 unselect\" width=65 height=20 back=L2UI_CH3.smallbutton2_down fore=L2UI_CH3.smallbutton2>
  #1033 = Utf8               <button value=\"Remove\" action=\"bypass _friendlist_0_mine \u0001 unselect\" width=65 height=20 back=L2UI_CH3.smallbutton2_down fore=L2UI_CH3.smallbutton2>
  #1034 = String             #1035        // <font color=A3A3A3>Level:</font> <font color=B09B79>\u0001</font></td>
  #1035 = Utf8               <font color=A3A3A3>Level:</font> <font color=B09B79>\u0001</font></td>
  #1036 = String             #1037        // <font color=A3A3A3>Quantity:</font> \u0001</font></td>
  #1037 = Utf8               <font color=A3A3A3>Quantity:</font> \u0001</font></td>
  #1038 = String             #1039        // <font color=A3A3A3>Enchant Level:</font> <font color=B09B79>+\u0001</font></td>
  #1039 = Utf8               <font color=A3A3A3>Enchant Level:</font> <font color=B09B79>+\u0001</font></td>
  #1040 = String             #1041        // <combobox width=180 height=21 var=\"currency\" list=\u0001>
  #1041 = Utf8               <combobox width=180 height=21 var=\"currency\" list=\u0001>
  #1042 = String             #1043        // <button value=\u0001 action=\"bypass _friendlist_0_mine \u0001 sell \u0001 $currency $price\" width=65 height=19 back=L2UI_ch3.smallbutton2_down fore=L2UI_ch3.smallbutton2>
  #1043 = Utf8               <button value=\u0001 action=\"bypass _friendlist_0_mine \u0001 sell \u0001 $currency $price\" width=65 height=19 back=L2UI_ch3.smallbutton2_down fore=L2UI_ch3.smallbutton2>
  #1044 = String             #1045        // <button value=\u0001 action=\"bypass _friendlist_0_\" width=115 height=31 back=L2UI_ch3.bigbutton2 fore=L2UI_ch3.bigbutton2></td><td width=150 align=right valign=top><button value=\u0001 action=\"bypass _friendlist_0_mine \u0001 unselect\" width=65 height=20 back=L2UI_CH3.smallbutton2_down fore=L2UI_CH3.smallbutton2>
  #1045 = Utf8               <button value=\u0001 action=\"bypass _friendlist_0_\" width=115 height=31 back=L2UI_ch3.bigbutton2 fore=L2UI_ch3.bigbutton2></td><td width=150 align=right valign=top><button value=\u0001 action=\"bypass _friendlist_0_mine \u0001 unselect\" width=65 height=20 back=L2UI_CH3.smallbutton2_down fore=L2UI_CH3.smallbutton2>
  #1046 = String             #1047        // <button value=\u0001 action=\"bypass _friendlist_0_\" width=115 height=31 back=L2UI_ch3.bigbutton2 fore=L2UI_ch3.bigbutton2></td><td width=150 align=right valign=top><button value=\u0001 action=\"bypass _friendlist_0_mine \u0001 toselect\" width=65 height=20 back=L2UI_CH3.smallbutton2_down fore=L2UI_CH3.smallbutton2>
  #1047 = Utf8               <button value=\u0001 action=\"bypass _friendlist_0_\" width=115 height=31 back=L2UI_ch3.bigbutton2 fore=L2UI_ch3.bigbutton2></td><td width=150 align=right valign=top><button value=\u0001 action=\"bypass _friendlist_0_mine \u0001 toselect\" width=65 height=20 back=L2UI_CH3.smallbutton2_down fore=L2UI_CH3.smallbutton2>
  #1048 = MethodHandle       6:#1049      // REF_invokeStatic ext/mods/gameserver/communitybbs/custom/AuctionBBSManager.lambda$selectItem$0:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/communitybbs/custom/model/Auction;)Z
  #1049 = Methodref          #11.#1050    // ext/mods/gameserver/communitybbs/custom/AuctionBBSManager.lambda$selectItem$0:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/communitybbs/custom/model/Auction;)Z
  #1050 = NameAndType        #961:#962    // lambda$selectItem$0:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/communitybbs/custom/model/Auction;)Z
  #1051 = String             #1052        // Invalid currency: \u0001
  #1052 = Utf8               Invalid currency: \u0001
  #1053 = MethodHandle       6:#1054      // REF_invokeStatic ext/mods/gameserver/communitybbs/custom/AuctionBBSManager.lambda$getAuctions$0:(Lext/mods/gameserver/communitybbs/custom/model/Auction;)Z
  #1054 = Methodref          #11.#1055    // ext/mods/gameserver/communitybbs/custom/AuctionBBSManager.lambda$getAuctions$0:(Lext/mods/gameserver/communitybbs/custom/model/Auction;)Z
  #1055 = NameAndType        #958:#959    // lambda$getAuctions$0:(Lext/mods/gameserver/communitybbs/custom/model/Auction;)Z
  #1056 = MethodType         #1057        //  (Ljava/lang/Object;Ljava/lang/Object;)I
  #1057 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)I
  #1058 = MethodHandle       5:#1059      // REF_invokeVirtual java/lang/Integer.compareTo:(Ljava/lang/Integer;)I
  #1059 = Methodref          #90.#1060    // java/lang/Integer.compareTo:(Ljava/lang/Integer;)I
  #1060 = NameAndType        #1061:#1062  // compareTo:(Ljava/lang/Integer;)I
  #1061 = Utf8               compareTo
  #1062 = Utf8               (Ljava/lang/Integer;)I
  #1063 = MethodType         #1064        //  (Ljava/lang/Integer;Ljava/lang/Integer;)I
  #1064 = Utf8               (Ljava/lang/Integer;Ljava/lang/Integer;)I
  #1065 = String             #1066        // html/CommunityBoard/\u0001\u0001
  #1066 = Utf8               html/CommunityBoard/\u0001\u0001
  #1067 = String             #1068        // html/CommunityBoard/\u0001disabled.htm
  #1068 = Utf8               html/CommunityBoard/\u0001disabled.htm
  #1069 = MethodHandle       6:#1070      // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #1070 = Methodref          #1071.#1072  // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #1071 = Class              #1073        // java/lang/invoke/LambdaMetafactory
  #1072 = NameAndType        #1074:#1075  // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #1073 = Utf8               java/lang/invoke/LambdaMetafactory
  #1074 = Utf8               metafactory
  #1075 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #1076 = MethodHandle       6:#1077      // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #1077 = Methodref          #1078.#1079  // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #1078 = Class              #1080        // java/lang/invoke/StringConcatFactory
  #1079 = NameAndType        #414:#1081   // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #1080 = Utf8               java/lang/invoke/StringConcatFactory
  #1081 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #1082 = Utf8               InnerClasses
  #1083 = Utf8               SingletonHolder
  #1084 = Class              #1085        // java/lang/invoke/MethodHandles$Lookup
  #1085 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #1086 = Class              #1087        // java/lang/invoke/MethodHandles
  #1087 = Utf8               java/lang/invoke/MethodHandles
  #1088 = Utf8               Lookup
{
  public ext.mods.gameserver.communitybbs.custom.AuctionBBSManager();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method ext/mods/gameserver/communitybbs/manager/BaseBBSManager."<init>":()V
         4: aload_0
         5: new           #7                  // class java/util/concurrent/ConcurrentHashMap
         8: dup
         9: invokespecial #9                  // Method java/util/concurrent/ConcurrentHashMap."<init>":()V
        12: putfield      #10                 // Field _auctions:Ljava/util/Map;
        15: aload_0
        16: new           #7                  // class java/util/concurrent/ConcurrentHashMap
        19: dup
        20: invokespecial #9                  // Method java/util/concurrent/ConcurrentHashMap."<init>":()V
        23: putfield      #16                 // Field _functions:Ljava/util/Map;
        26: return
      LineNumberTable:
        line 50: 0
        line 54: 4
        line 55: 15
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      27     0  this   Lext/mods/gameserver/communitybbs/custom/AuctionBBSManager;

  public void load();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=6, args_size=1
         0: invokestatic  #19                 // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
         3: astore_1
         4: aload_1
         5: ldc           #25                 // String SELECT * FROM bbs_auction
         7: invokeinterface #27,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        12: astore_2
        13: aload_2
        14: invokeinterface #33,  1           // InterfaceMethod java/sql/PreparedStatement.executeQuery:()Ljava/sql/ResultSet;
        19: astore_3
        20: aload_3
        21: invokeinterface #39,  1           // InterfaceMethod java/sql/ResultSet.next:()Z
        26: ifeq          44
        29: aload_0
        30: new           #45                 // class ext/mods/gameserver/communitybbs/custom/model/Auction
        33: dup
        34: aload_3
        35: invokespecial #47                 // Method ext/mods/gameserver/communitybbs/custom/model/Auction."<init>":(Ljava/sql/ResultSet;)V
        38: invokevirtual #50                 // Method addAuction:(Lext/mods/gameserver/communitybbs/custom/model/Auction;)V
        41: goto          20
        44: aload_3
        45: ifnull        84
        48: aload_3
        49: invokeinterface #54,  1           // InterfaceMethod java/sql/ResultSet.close:()V
        54: goto          84
        57: astore        4
        59: aload_3
        60: ifnull        81
        63: aload_3
        64: invokeinterface #54,  1           // InterfaceMethod java/sql/ResultSet.close:()V
        69: goto          81
        72: astore        5
        74: aload         4
        76: aload         5
        78: invokevirtual #59                 // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        81: aload         4
        83: athrow
        84: aload_2
        85: ifnull        121
        88: aload_2
        89: invokeinterface #63,  1           // InterfaceMethod java/sql/PreparedStatement.close:()V
        94: goto          121
        97: astore_3
        98: aload_2
        99: ifnull        119
       102: aload_2
       103: invokeinterface #63,  1           // InterfaceMethod java/sql/PreparedStatement.close:()V
       108: goto          119
       111: astore        4
       113: aload_3
       114: aload         4
       116: invokevirtual #59                 // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       119: aload_3
       120: athrow
       121: aload_1
       122: ifnull        156
       125: aload_1
       126: invokeinterface #64,  1           // InterfaceMethod java/sql/Connection.close:()V
       131: goto          156
       134: astore_2
       135: aload_1
       136: ifnull        154
       139: aload_1
       140: invokeinterface #64,  1           // InterfaceMethod java/sql/Connection.close:()V
       145: goto          154
       148: astore_3
       149: aload_2
       150: aload_3
       151: invokevirtual #59                 // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       154: aload_2
       155: athrow
       156: goto          169
       159: astore_1
       160: getstatic     #67                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
       163: ldc           #71                 // String Couldn\'t load bbs_auction items.
       165: aload_1
       166: invokevirtual #73                 // Method ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;Ljava/lang/Throwable;)V
       169: getstatic     #67                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
       172: ldc           #79                 // String Loaded {} auction items.
       174: iconst_1
       175: anewarray     #81                 // class java/lang/Object
       178: dup
       179: iconst_0
       180: aload_0
       181: getfield      #10                 // Field _auctions:Ljava/util/Map;
       184: invokeinterface #83,  1           // InterfaceMethod java/util/Map.size:()I
       189: invokestatic  #89                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       192: aastore
       193: invokevirtual #95                 // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
       196: return
      Exception table:
         from    to  target type
            20    44    57   Class java/lang/Throwable
            63    69    72   Class java/lang/Throwable
            13    84    97   Class java/lang/Throwable
           102   108   111   Class java/lang/Throwable
             4   121   134   Class java/lang/Throwable
           139   145   148   Class java/lang/Throwable
             0   156   159   Class java/lang/Exception
      LineNumberTable:
        line 59: 0
        line 60: 4
        line 61: 13
        line 63: 20
        line 64: 29
        line 65: 44
        line 59: 57
        line 65: 84
        line 59: 97
        line 65: 121
        line 59: 134
        line 69: 156
        line 66: 159
        line 68: 160
        line 70: 169
        line 71: 196
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           20      64     3    rs   Ljava/sql/ResultSet;
           13     108     2    ps   Ljava/sql/PreparedStatement;
            4     152     1   con   Ljava/sql/Connection;
          160       9     1     e   Ljava/lang/Exception;
            0     197     0  this   Lext/mods/gameserver/communitybbs/custom/AuctionBBSManager;
      StackMapTable: number_of_entries = 16
        frame_type = 254 /* append */
          offset_delta = 20
          locals = [ class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/ResultSet ]
        frame_type = 23 /* same */
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 14
          locals = [ class ext/mods/gameserver/communitybbs/custom/AuctionBBSManager, class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/ResultSet, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/communitybbs/custom/AuctionBBSManager, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 7 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/communitybbs/custom/AuctionBBSManager, class java/sql/Connection, class java/lang/Throwable ]
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
      stack=8, locals=16, args_size=3
         0: new           #99                 // class java/util/StringTokenizer
         3: dup
         4: aload_1
         5: ldc           #101                // String
         7: invokespecial #103                // Method java/util/StringTokenizer."<init>":(Ljava/lang/String;Ljava/lang/String;)V
        10: astore_3
        11: aload_3
        12: invokevirtual #106                // Method java/util/StringTokenizer.hasMoreTokens:()Z
        15: ifeq          25
        18: aload_3
        19: invokevirtual #109                // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
        22: goto          27
        25: ldc           #113                // String
        27: astore        4
        29: aload_0
        30: aload_2
        31: invokevirtual #115                // Method getFunction:(Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/communitybbs/custom/model/Function;
        34: astore        5
        36: aload         4
        38: ldc           #119                // String _friendlist_0_
        40: invokevirtual #121                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
        43: ifeq          691
        46: aload_3
        47: invokevirtual #106                // Method java/util/StringTokenizer.hasMoreTokens:()Z
        50: ifeq          63
        53: aload_3
        54: invokevirtual #109                // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
        57: invokestatic  #127                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
        60: goto          68
        63: aload         5
        65: invokevirtual #131                // Method ext/mods/gameserver/communitybbs/custom/model/Function.getLastPage:()I
        68: istore        6
        70: aload_3
        71: invokevirtual #106                // Method java/util/StringTokenizer.hasMoreTokens:()Z
        74: ifeq          84
        77: aload_3
        78: invokevirtual #109                // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
        81: goto          86
        84: ldc           #113                // String
        86: astore        7
        88: aload         7
        90: astore        8
        92: iconst_m1
        93: istore        9
        95: aload         8
        97: invokevirtual #136                // Method java/lang/String.hashCode:()I
       100: lookupswitch  { // 8

             -1367724422: 289

              -906021636: 256

                  114148: 176

                 3575610: 208

                94746189: 192

                98615255: 224

               575402001: 240

              1743324417: 272
                 default: 303
            }
       176: aload         8
       178: ldc           #139                // String src
       180: invokevirtual #121                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       183: ifeq          303
       186: iconst_0
       187: istore        9
       189: goto          303
       192: aload         8
       194: ldc           #141                // String clear
       196: invokevirtual #121                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       199: ifeq          303
       202: iconst_1
       203: istore        9
       205: goto          303
       208: aload         8
       210: ldc           #143                // String type
       212: invokevirtual #121                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       215: ifeq          303
       218: iconst_2
       219: istore        9
       221: goto          303
       224: aload         8
       226: ldc           #145                // String grade
       228: invokevirtual #121                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       231: ifeq          303
       234: iconst_3
       235: istore        9
       237: goto          303
       240: aload         8
       242: ldc           #147                // String currency
       244: invokevirtual #121                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       247: ifeq          303
       250: iconst_4
       251: istore        9
       253: goto          303
       256: aload         8
       258: ldc           #149                // String select
       260: invokevirtual #121                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       263: ifeq          303
       266: iconst_5
       267: istore        9
       269: goto          303
       272: aload         8
       274: ldc           #151                // String purchase
       276: invokevirtual #121                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       279: ifeq          303
       282: bipush        6
       284: istore        9
       286: goto          303
       289: aload         8
       291: ldc           #153                // String cancel
       293: invokevirtual #121                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       296: ifeq          303
       299: bipush        7
       301: istore        9
       303: iload         9
       305: tableswitch   { // 0 to 7

                       0: 352

                       1: 427

                       2: 437

                       3: 461

                       4: 485

                       5: 509

                       6: 535

                       7: 673
                 default: 679
            }
       352: aload_3
       353: invokevirtual #106                // Method java/util/StringTokenizer.hasMoreTokens:()Z
       356: ifeq          377
       359: aload_1
       360: bipush        19
       362: iload         6
       364: invokestatic  #155                // Method java/lang/String.valueOf:(I)Ljava/lang/String;
       367: invokevirtual #158                // Method java/lang/String.length:()I
       370: iadd
       371: invokevirtual #161                // Method java/lang/String.substring:(I)Ljava/lang/String;
       374: goto          379
       377: ldc           #113                // String
       379: astore        10
       381: aload         10
       383: invokevirtual #164                // Method java/lang/String.isBlank:()Z
       386: ifne          407
       389: aload_1
       390: invokevirtual #158                // Method java/lang/String.length:()I
       393: bipush        17
       395: iload         6
       397: invokestatic  #155                // Method java/lang/String.valueOf:(I)Ljava/lang/String;
       400: invokevirtual #158                // Method java/lang/String.length:()I
       403: iadd
       404: if_icmple     417
       407: aload         5
       409: aload         10
       411: invokevirtual #167                // Method ext/mods/gameserver/communitybbs/custom/model/Function.setSearch:(Ljava/lang/String;)V
       414: goto          679
       417: aload_2
       418: getstatic     #171                // Field ext/mods/gameserver/network/SystemMessageId.INCORRECT_SYNTAX:Lext/mods/gameserver/network/SystemMessageId;
       421: invokevirtual #177                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       424: goto          679
       427: aload         5
       429: ldc           #113                // String
       431: invokevirtual #167                // Method ext/mods/gameserver/communitybbs/custom/model/Function.setSearch:(Ljava/lang/String;)V
       434: goto          679
       437: aload         5
       439: aload_3
       440: invokevirtual #106                // Method java/util/StringTokenizer.hasMoreTokens:()Z
       443: ifeq          453
       446: aload_3
       447: invokevirtual #109                // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       450: goto          455
       453: ldc           #183                // String All
       455: invokevirtual #185                // Method ext/mods/gameserver/communitybbs/custom/model/Function.setItemType:(Ljava/lang/String;)V
       458: goto          679
       461: aload         5
       463: aload_3
       464: invokevirtual #106                // Method java/util/StringTokenizer.hasMoreTokens:()Z
       467: ifeq          477
       470: aload_3
       471: invokevirtual #109                // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       474: goto          479
       477: ldc           #183                // String All
       479: invokevirtual #188                // Method ext/mods/gameserver/communitybbs/custom/model/Function.setItemGrade:(Ljava/lang/String;)V
       482: goto          679
       485: aload         5
       487: aload_3
       488: invokevirtual #106                // Method java/util/StringTokenizer.hasMoreTokens:()Z
       491: ifeq          501
       494: aload_3
       495: invokevirtual #109                // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       498: goto          503
       501: ldc           #183                // String All
       503: invokevirtual #191                // Method ext/mods/gameserver/communitybbs/custom/model/Function.setCurrency:(Ljava/lang/String;)V
       506: goto          679
       509: aload         5
       511: aload_3
       512: invokevirtual #106                // Method java/util/StringTokenizer.hasMoreTokens:()Z
       515: ifeq          528
       518: aload_3
       519: invokevirtual #109                // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       522: invokestatic  #127                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       525: goto          529
       528: iconst_0
       529: invokevirtual #194                // Method ext/mods/gameserver/communitybbs/custom/model/Function.setViewId:(I)V
       532: goto          679
       535: aload_0
       536: aload         5
       538: invokevirtual #198                // Method ext/mods/gameserver/communitybbs/custom/model/Function.getViewId:()I
       541: invokevirtual #201                // Method getAuction:(I)Lext/mods/gameserver/communitybbs/custom/model/Auction;
       544: astore        11
       546: aload         11
       548: ifnonnull     569
       551: aload_2
       552: aload_2
       553: sipush        10202
       556: iconst_0
       557: anewarray     #81                 // class java/lang/Object
       560: invokevirtual #205                // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
       563: invokevirtual #209                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       566: goto          679
       569: aload_2
       570: invokevirtual #212                // Method ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
       573: aload         11
       575: invokevirtual #216                // Method ext/mods/gameserver/communitybbs/custom/model/Auction.getPriceId:()I
       578: invokevirtual #219                // Method ext/mods/gameserver/model/itemcontainer/PcInventory.getItemCount:(I)I
       581: aload         11
       583: invokevirtual #225                // Method ext/mods/gameserver/communitybbs/custom/model/Auction.getPriceCount:()I
       586: if_icmpge     627
       589: aload_2
       590: aload_2
       591: sipush        10223
       594: iconst_2
       595: anewarray     #81                 // class java/lang/Object
       598: dup
       599: iconst_0
       600: aload         11
       602: invokevirtual #225                // Method ext/mods/gameserver/communitybbs/custom/model/Auction.getPriceCount:()I
       605: i2l
       606: invokestatic  #228                // Method ext/mods/commons/lang/StringUtil.formatNumber:(J)Ljava/lang/String;
       609: aastore
       610: dup
       611: iconst_1
       612: aload         11
       614: invokevirtual #234                // Method ext/mods/gameserver/communitybbs/custom/model/Auction.getPrice:()Lext/mods/gameserver/model/item/kind/Item;
       617: aastore
       618: invokevirtual #205                // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
       621: invokevirtual #209                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       624: goto          679
       627: aload         11
       629: aload_2
       630: aload_3
       631: invokevirtual #106                // Method java/util/StringTokenizer.hasMoreTokens:()Z
       634: ifeq          647
       637: aload_3
       638: invokevirtual #109                // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       641: invokestatic  #127                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       644: goto          648
       647: iconst_0
       648: invokevirtual #238                // Method ext/mods/gameserver/communitybbs/custom/model/Auction.tryPurchase:(Lext/mods/gameserver/model/actor/Player;I)Z
       651: ifeq          679
       654: aload         5
       656: iconst_0
       657: invokevirtual #194                // Method ext/mods/gameserver/communitybbs/custom/model/Function.setViewId:(I)V
       660: aload_0
       661: aload_2
       662: aload         5
       664: invokevirtual #131                // Method ext/mods/gameserver/communitybbs/custom/model/Function.getLastPage:()I
       667: aload         5
       669: invokevirtual #242                // Method sendIndex:(Lext/mods/gameserver/model/actor/Player;ILext/mods/gameserver/communitybbs/custom/model/Function;)V
       672: return
       673: aload         5
       675: iconst_0
       676: invokevirtual #194                // Method ext/mods/gameserver/communitybbs/custom/model/Function.setViewId:(I)V
       679: aload_0
       680: aload_2
       681: iload         6
       683: aload         5
       685: invokevirtual #242                // Method sendIndex:(Lext/mods/gameserver/model/actor/Player;ILext/mods/gameserver/communitybbs/custom/model/Function;)V
       688: goto          1267
       691: aload         4
       693: ldc           #246                // String _friendlist_0_mine
       695: invokevirtual #121                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       698: ifeq          1267
       701: aload_3
       702: invokevirtual #106                // Method java/util/StringTokenizer.hasMoreTokens:()Z
       705: ifeq          718
       708: aload_3
       709: invokevirtual #109                // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       712: invokestatic  #127                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       715: goto          723
       718: aload         5
       720: invokevirtual #131                // Method ext/mods/gameserver/communitybbs/custom/model/Function.getLastPage:()I
       723: istore        6
       725: aload_3
       726: invokevirtual #106                // Method java/util/StringTokenizer.hasMoreTokens:()Z
       729: ifeq          742
       732: aload_3
       733: invokevirtual #109                // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       736: invokevirtual #248                // Method java/lang/String.toLowerCase:()Ljava/lang/String;
       739: goto          744
       742: ldc           #113                // String
       744: astore        7
       746: aload         7
       748: astore        8
       750: iconst_m1
       751: istore        9
       753: aload         8
       755: invokevirtual #136                // Method java/lang/String.hashCode:()I
       758: lookupswitch  { // 7

             -1367724422: 906

              -934610812: 889

              -874824905: 824

              -838846263: 872

               -19518251: 840

                 3108362: 856

                 3526482: 922
                 default: 937
            }
       824: aload         8
       826: ldc           #251                // String toselect
       828: invokevirtual #121                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       831: ifeq          937
       834: iconst_0
       835: istore        9
       837: goto          937
       840: aload         8
       842: ldc           #253                // String unselect
       844: invokevirtual #121                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       847: ifeq          937
       850: iconst_1
       851: istore        9
       853: goto          937
       856: aload         8
       858: ldc           #255                // String edit
       860: invokevirtual #121                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       863: ifeq          937
       866: iconst_2
       867: istore        9
       869: goto          937
       872: aload         8
       874: ldc_w         #257                // String update
       877: invokevirtual #121                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       880: ifeq          937
       883: iconst_3
       884: istore        9
       886: goto          937
       889: aload         8
       891: ldc_w         #259                // String remove
       894: invokevirtual #121                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       897: ifeq          937
       900: iconst_4
       901: istore        9
       903: goto          937
       906: aload         8
       908: ldc           #153                // String cancel
       910: invokevirtual #121                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       913: ifeq          937
       916: iconst_5
       917: istore        9
       919: goto          937
       922: aload         8
       924: ldc_w         #261                // String sell
       927: invokevirtual #121                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       930: ifeq          937
       933: bipush        6
       935: istore        9
       937: iload         9
       939: tableswitch   { // 0 to 6

                       0: 980

                       1: 1002

                       2: 1011

                       3: 1037

                       4: 1037

                       5: 1117

                       6: 1126
                 default: 1258
            }
       980: aload         5
       982: iconst_m1
       983: invokevirtual #263                // Method ext/mods/gameserver/communitybbs/custom/model/Function.setItemId:(I)V
       986: aload_2
       987: new           #266                // class ext/mods/gameserver/network/serverpackets/ItemList
       990: dup
       991: aload_2
       992: iconst_1
       993: invokespecial #268                // Method ext/mods/gameserver/network/serverpackets/ItemList."<init>":(Lext/mods/gameserver/model/actor/Player;Z)V
       996: invokevirtual #271                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       999: goto          1258
      1002: aload         5
      1004: iconst_0
      1005: invokevirtual #263                // Method ext/mods/gameserver/communitybbs/custom/model/Function.setItemId:(I)V
      1008: goto          1258
      1011: aload         5
      1013: aload_3
      1014: invokevirtual #106                // Method java/util/StringTokenizer.hasMoreTokens:()Z
      1017: ifeq          1030
      1020: aload_3
      1021: invokevirtual #109                // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
      1024: invokestatic  #127                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
      1027: goto          1031
      1030: iconst_0
      1031: invokevirtual #274                // Method ext/mods/gameserver/communitybbs/custom/model/Function.setEditId:(I)V
      1034: goto          1258
      1037: aload_0
      1038: aload         5
      1040: invokevirtual #277                // Method ext/mods/gameserver/communitybbs/custom/model/Function.getEditId:()I
      1043: invokevirtual #201                // Method getAuction:(I)Lext/mods/gameserver/communitybbs/custom/model/Auction;
      1046: astore        10
      1048: aload         10
      1050: ifnonnull     1071
      1053: aload_2
      1054: aload_2
      1055: sipush        10202
      1058: iconst_0
      1059: anewarray     #81                 // class java/lang/Object
      1062: invokevirtual #205                // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
      1065: invokevirtual #209                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
      1068: goto          1258
      1071: aload         7
      1073: ldc_w         #259                // String remove
      1076: invokevirtual #121                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
      1079: ifeq          1109
      1082: aload         10
      1084: invokevirtual #280                // Method ext/mods/gameserver/communitybbs/custom/model/Auction.refund:()V
      1087: aload         5
      1089: iconst_0
      1090: invokevirtual #274                // Method ext/mods/gameserver/communitybbs/custom/model/Function.setEditId:(I)V
      1093: aload_2
      1094: new           #266                // class ext/mods/gameserver/network/serverpackets/ItemList
      1097: dup
      1098: aload_2
      1099: iconst_0
      1100: invokespecial #268                // Method ext/mods/gameserver/network/serverpackets/ItemList."<init>":(Lext/mods/gameserver/model/actor/Player;Z)V
      1103: invokevirtual #271                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
      1106: goto          1258
      1109: aload         10
      1111: invokevirtual #283                // Method ext/mods/gameserver/communitybbs/custom/model/Auction.updateDuration:()V
      1114: goto          1258
      1117: aload         5
      1119: iconst_0
      1120: invokevirtual #274                // Method ext/mods/gameserver/communitybbs/custom/model/Function.setEditId:(I)V
      1123: goto          1258
      1126: aload_2
      1127: invokevirtual #212                // Method ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
      1130: aload         5
      1132: invokevirtual #286                // Method ext/mods/gameserver/communitybbs/custom/model/Function.getItemId:()I
      1135: invokevirtual #289                // Method ext/mods/gameserver/model/itemcontainer/PcInventory.getItemByObjectId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
      1138: astore        11
      1140: aload         11
      1142: ifnonnull     1163
      1145: aload_2
      1146: aload_2
      1147: sipush        10203
      1150: iconst_0
      1151: anewarray     #81                 // class java/lang/Object
      1154: invokevirtual #205                // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
      1157: invokevirtual #209                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
      1160: goto          1252
      1163: aload_3
      1164: invokevirtual #106                // Method java/util/StringTokenizer.hasMoreTokens:()Z
      1167: ifeq          1177
      1170: aload_3
      1171: invokevirtual #109                // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
      1174: goto          1180
      1177: ldc_w         #293                // String 0
      1180: astore        12
      1182: iconst_0
      1183: istore        13
      1185: aload         12
      1187: invokestatic  #127                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
      1190: istore        13
      1192: goto          1197
      1195: astore        14
      1197: aload_3
      1198: invokevirtual #106                // Method java/util/StringTokenizer.hasMoreTokens:()Z
      1201: ifeq          1211
      1204: aload_3
      1205: invokevirtual #109                // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
      1208: goto          1214
      1211: ldc_w         #297                // String Adena
      1214: astore        14
      1216: aload_3
      1217: invokevirtual #106                // Method java/util/StringTokenizer.hasMoreTokens:()Z
      1220: ifeq          1233
      1223: aload_3
      1224: invokevirtual #109                // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
      1227: invokestatic  #127                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
      1230: goto          1234
      1233: iconst_0
      1234: istore        15
      1236: aload_0
      1237: aload_2
      1238: aload         11
      1240: invokevirtual #299                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getObjectId:()I
      1243: iload         13
      1245: aload         14
      1247: iload         15
      1249: invokevirtual #304                // Method sellItem:(Lext/mods/gameserver/model/actor/Player;IILjava/lang/String;I)V
      1252: aload         5
      1254: iconst_0
      1255: invokevirtual #263                // Method ext/mods/gameserver/communitybbs/custom/model/Function.setItemId:(I)V
      1258: aload_0
      1259: aload_2
      1260: iload         6
      1262: aload         5
      1264: invokevirtual #308                // Method sendIndexMine:(Lext/mods/gameserver/model/actor/Player;ILext/mods/gameserver/communitybbs/custom/model/Function;)V
      1267: return
      Exception table:
         from    to  target type
          1185  1192  1195   Class java/lang/NumberFormatException
      LineNumberTable:
        line 76: 0
        line 78: 11
        line 80: 29
        line 81: 36
        line 83: 46
        line 84: 70
        line 86: 88
        line 89: 352
        line 90: 381
        line 91: 407
        line 93: 417
        line 94: 424
        line 97: 427
        line 98: 434
        line 101: 437
        line 102: 458
        line 105: 461
        line 106: 482
        line 109: 485
        line 110: 506
        line 113: 509
        line 114: 532
        line 117: 535
        line 118: 546
        line 119: 551
        line 120: 569
        line 121: 589
        line 122: 627
        line 124: 654
        line 125: 660
        line 126: 672
        line 131: 673
        line 134: 679
        line 135: 688
        line 136: 691
        line 138: 701
        line 139: 725
        line 141: 746
        line 144: 980
        line 145: 986
        line 146: 999
        line 149: 1002
        line 150: 1008
        line 153: 1011
        line 154: 1034
        line 158: 1037
        line 159: 1048
        line 160: 1053
        line 163: 1071
        line 165: 1082
        line 166: 1087
        line 167: 1093
        line 170: 1109
        line 172: 1114
        line 175: 1117
        line 176: 1123
        line 179: 1126
        line 180: 1140
        line 181: 1145
        line 184: 1163
        line 185: 1182
        line 188: 1185
        line 192: 1192
        line 190: 1195
        line 194: 1197
        line 195: 1216
        line 197: 1236
        line 200: 1252
        line 204: 1258
        line 206: 1267
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          381      46    10 search   Ljava/lang/String;
          546     127    11 auction   Lext/mods/gameserver/communitybbs/custom/model/Auction;
           70     618     6  page   I
           88     600     7 subCommand   Ljava/lang/String;
         1048      69    10 auction   Lext/mods/gameserver/communitybbs/custom/model/Auction;
         1182      70    12 token1   Ljava/lang/String;
         1185      67    13 value1   I
         1216      36    14 token2   Ljava/lang/String;
         1236      16    15 value2   I
         1140     118    11  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
          725     542     6  page   I
          746     521     7 param   Ljava/lang/String;
            0    1268     0  this   Lext/mods/gameserver/communitybbs/custom/AuctionBBSManager;
            0    1268     1 command   Ljava/lang/String;
            0    1268     2 player   Lext/mods/gameserver/model/actor/Player;
           11    1257     3    st   Ljava/util/StringTokenizer;
           29    1239     4 commandToken   Ljava/lang/String;
           36    1232     5 function   Lext/mods/gameserver/communitybbs/custom/model/Function;
      StackMapTable: number_of_entries = 75
        frame_type = 252 /* append */
          offset_delta = 25
          locals = [ class java/util/StringTokenizer ]
        frame_type = 65 /* same_locals_1_stack_item */
          stack = [ class java/lang/String ]
        frame_type = 253 /* append */
          offset_delta = 35
          locals = [ class java/lang/String, class ext/mods/gameserver/communitybbs/custom/model/Function ]
        frame_type = 68 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 252 /* append */
          offset_delta = 15
          locals = [ int ]
        frame_type = 65 /* same_locals_1_stack_item */
          stack = [ class java/lang/String ]
        frame_type = 254 /* append */
          offset_delta = 89
          locals = [ class java/lang/String, class java/lang/String, int ]
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 16 /* same */
        frame_type = 13 /* same */
        frame_type = 48 /* same */
        frame_type = 24 /* same */
        frame_type = 65 /* same_locals_1_stack_item */
          stack = [ class java/lang/String ]
        frame_type = 252 /* append */
          offset_delta = 27
          locals = [ class java/lang/String ]
        frame_type = 9 /* same */
        frame_type = 250 /* chop */
          offset_delta = 9
        frame_type = 9 /* same */
        frame_type = 79 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/communitybbs/custom/model/Function ]
        frame_type = 255 /* full_frame */
          offset_delta = 1
          locals = [ class ext/mods/gameserver/communitybbs/custom/AuctionBBSManager, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/util/StringTokenizer, class java/lang/String, class ext/mods/gameserver/communitybbs/custom/model/Function, int, class java/lang/String, class java/lang/String, int ]
          stack = [ class ext/mods/gameserver/communitybbs/custom/model/Function, class java/lang/String ]
        frame_type = 5 /* same */
        frame_type = 79 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/communitybbs/custom/model/Function ]
        frame_type = 255 /* full_frame */
          offset_delta = 1
          locals = [ class ext/mods/gameserver/communitybbs/custom/AuctionBBSManager, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/util/StringTokenizer, class java/lang/String, class ext/mods/gameserver/communitybbs/custom/model/Function, int, class java/lang/String, class java/lang/String, int ]
          stack = [ class ext/mods/gameserver/communitybbs/custom/model/Function, class java/lang/String ]
        frame_type = 5 /* same */
        frame_type = 79 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/communitybbs/custom/model/Function ]
        frame_type = 255 /* full_frame */
          offset_delta = 1
          locals = [ class ext/mods/gameserver/communitybbs/custom/AuctionBBSManager, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/util/StringTokenizer, class java/lang/String, class ext/mods/gameserver/communitybbs/custom/model/Function, int, class java/lang/String, class java/lang/String, int ]
          stack = [ class ext/mods/gameserver/communitybbs/custom/model/Function, class java/lang/String ]
        frame_type = 5 /* same */
        frame_type = 82 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/communitybbs/custom/model/Function ]
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/communitybbs/custom/AuctionBBSManager, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/util/StringTokenizer, class java/lang/String, class ext/mods/gameserver/communitybbs/custom/model/Function, int, class java/lang/String, class java/lang/String, int ]
          stack = [ class ext/mods/gameserver/communitybbs/custom/model/Function, int ]
        frame_type = 5 /* same */
        frame_type = 253 /* append */
          offset_delta = 33
          locals = [ top, class ext/mods/gameserver/communitybbs/custom/model/Auction ]
        frame_type = 57 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 19
          locals = [ class ext/mods/gameserver/communitybbs/custom/AuctionBBSManager, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/util/StringTokenizer, class java/lang/String, class ext/mods/gameserver/communitybbs/custom/model/Function, int, class java/lang/String, class java/lang/String, int, top, class ext/mods/gameserver/communitybbs/custom/model/Auction ]
          stack = [ class ext/mods/gameserver/communitybbs/custom/model/Auction, class ext/mods/gameserver/model/actor/Player ]
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/communitybbs/custom/AuctionBBSManager, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/util/StringTokenizer, class java/lang/String, class ext/mods/gameserver/communitybbs/custom/model/Function, int, class java/lang/String, class java/lang/String, int, top, class ext/mods/gameserver/communitybbs/custom/model/Auction ]
          stack = [ class ext/mods/gameserver/communitybbs/custom/model/Auction, class ext/mods/gameserver/model/actor/Player, int ]
        frame_type = 249 /* chop */
          offset_delta = 24
        frame_type = 249 /* chop */
          offset_delta = 5
        frame_type = 249 /* chop */
          offset_delta = 11
        frame_type = 26 /* same */
        frame_type = 68 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 252 /* append */
          offset_delta = 18
          locals = [ int ]
        frame_type = 65 /* same_locals_1_stack_item */
          stack = [ class java/lang/String ]
        frame_type = 254 /* append */
          offset_delta = 79
          locals = [ class java/lang/String, class java/lang/String, int ]
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 16 /* same */
        frame_type = 16 /* same */
        frame_type = 15 /* same */
        frame_type = 14 /* same */
        frame_type = 42 /* same */
        frame_type = 21 /* same */
        frame_type = 8 /* same */
        frame_type = 82 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/communitybbs/custom/model/Function ]
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/communitybbs/custom/AuctionBBSManager, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/util/StringTokenizer, class java/lang/String, class ext/mods/gameserver/communitybbs/custom/model/Function, int, class java/lang/String, class java/lang/String, int ]
          stack = [ class ext/mods/gameserver/communitybbs/custom/model/Function, int ]
        frame_type = 5 /* same */
        frame_type = 252 /* append */
          offset_delta = 33
          locals = [ class ext/mods/gameserver/communitybbs/custom/model/Auction ]
        frame_type = 37 /* same */
        frame_type = 250 /* chop */
          offset_delta = 7
        frame_type = 8 /* same */
        frame_type = 253 /* append */
          offset_delta = 36
          locals = [ top, class ext/mods/gameserver/model/item/instance/ItemInstance ]
        frame_type = 13 /* same */
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 14
          locals = [ class ext/mods/gameserver/communitybbs/custom/AuctionBBSManager, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/util/StringTokenizer, class java/lang/String, class ext/mods/gameserver/communitybbs/custom/model/Function, int, class java/lang/String, class java/lang/String, int, top, class ext/mods/gameserver/model/item/instance/ItemInstance, class java/lang/String, int ]
          stack = [ class java/lang/NumberFormatException ]
        frame_type = 1 /* same */
        frame_type = 13 /* same */
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/String ]
        frame_type = 252 /* append */
          offset_delta = 18
          locals = [ class java/lang/String ]
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 248 /* chop */
          offset_delta = 17
        frame_type = 255 /* full_frame */
          offset_delta = 5
          locals = [ class ext/mods/gameserver/communitybbs/custom/AuctionBBSManager, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/util/StringTokenizer, class java/lang/String, class ext/mods/gameserver/communitybbs/custom/model/Function, int, class java/lang/String ]
          stack = []
        frame_type = 249 /* chop */
          offset_delta = 8

  public void sendIndex(ext.mods.gameserver.model.actor.Player, int, ext.mods.gameserver.communitybbs.custom.model.Function);
    descriptor: (Lext/mods/gameserver/model/actor/Player;ILext/mods/gameserver/communitybbs/custom/model/Function;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=8, locals=12, args_size=4
         0: aload_0
         1: aload_1
         2: ldc_w         #311                // String index.htm
         5: invokevirtual #313                // Method getContent:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Ljava/lang/String;
         8: astore        4
        10: new           #317                // class ext/mods/commons/data/Pagination
        13: dup
        14: aload_0
        15: invokevirtual #319                // Method getAuctions:()Ljava/util/Collection;
        18: invokeinterface #323,  1          // InterfaceMethod java/util/Collection.stream:()Ljava/util/stream/Stream;
        23: iload_2
        24: bipush        8
        26: aload_3
        27: invokedynamic #329,  0            // InvokeDynamic #0:test:(Lext/mods/gameserver/communitybbs/custom/model/Function;)Ljava/util/function/Predicate;
        32: invokedynamic #333,  0            // InvokeDynamic #1:apply:()Ljava/util/function/Function;
        37: invokestatic  #337                // InterfaceMethod java/util/Comparator.comparing:(Ljava/util/function/Function;)Ljava/util/Comparator;
        40: invokedynamic #343,  0            // InvokeDynamic #2:apply:()Ljava/util/function/Function;
        45: invokestatic  #337                // InterfaceMethod java/util/Comparator.comparing:(Ljava/util/function/Function;)Ljava/util/Comparator;
        48: invokeinterface #344,  2          // InterfaceMethod java/util/Comparator.thenComparing:(Ljava/util/Comparator;)Ljava/util/Comparator;
        53: invokespecial #348                // Method ext/mods/commons/data/Pagination."<init>":(Ljava/util/stream/Stream;IILjava/util/function/Predicate;Ljava/util/Comparator;)V
        56: astore        5
        58: aload_0
        59: aload_3
        60: invokevirtual #198                // Method ext/mods/gameserver/communitybbs/custom/model/Function.getViewId:()I
        63: invokevirtual #201                // Method getAuction:(I)Lext/mods/gameserver/communitybbs/custom/model/Auction;
        66: astore        6
        68: new           #351                // class java/lang/StringBuilder
        71: dup
        72: invokespecial #353                // Method java/lang/StringBuilder."<init>":()V
        75: astore        7
        77: aload         6
        79: ifnonnull     393
        82: aload_3
        83: iload_2
        84: invokevirtual #354                // Method ext/mods/gameserver/communitybbs/custom/model/Function.setLastPage:(I)V
        87: aload         5
        89: ldc_w         #357                // String bypass _friendlist_0_ %page%
        92: invokevirtual #359                // Method ext/mods/commons/data/Pagination.generatePagesMedium:(Ljava/lang/String;)V
        95: aload         5
        97: iconst_1
        98: anewarray     #81                 // class java/lang/Object
       101: dup
       102: iconst_0
       103: ldc_w         #362                // String <img height=6>
       106: aastore
       107: invokevirtual #364                // Method ext/mods/commons/data/Pagination.append:([Ljava/lang/Object;)V
       110: aload         5
       112: invokevirtual #368                // Method ext/mods/commons/data/Pagination.iterator:()Ljava/util/Iterator;
       115: astore        8
       117: aload         8
       119: invokeinterface #372,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       124: ifeq          365
       127: aload         8
       129: invokeinterface #377,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       134: checkcast     #45                 // class ext/mods/gameserver/communitybbs/custom/model/Auction
       137: astore        9
       139: aload         9
       141: invokevirtual #380                // Method ext/mods/gameserver/communitybbs/custom/model/Auction.getItem:()Lext/mods/gameserver/model/item/kind/Item;
       144: astore        10
       146: aload_0
       147: aload_1
       148: ldc_w         #383                // String template-1.htm
       151: invokevirtual #313                // Method getContent:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Ljava/lang/String;
       154: astore        11
       156: aload         11
       158: ldc_w         #385                // String %icon%
       161: aload         10
       163: invokevirtual #387                // Method ext/mods/gameserver/model/item/kind/Item.getIcon:()Ljava/lang/String;
       166: invokevirtual #392                // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
       169: astore        11
       171: aload         11
       173: ldc_w         #396                // String %gradeIcon%
       176: aload         9
       178: invokevirtual #398                // Method ext/mods/gameserver/communitybbs/custom/model/Auction.getGradeIcon:()Ljava/lang/String;
       181: invokevirtual #392                // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
       184: astore        11
       186: aload         11
       188: ldc_w         #401                // String %itemName%
       191: aload_0
       192: aload         9
       194: invokevirtual #403                // Method getName:(Lext/mods/gameserver/communitybbs/custom/model/Auction;)Ljava/lang/String;
       197: invokevirtual #392                // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
       200: astore        11
       202: aload         11
       204: ldc_w         #407                // String %stackable%
       207: aload         10
       209: invokevirtual #409                // Method ext/mods/gameserver/model/item/kind/Item.isStackable:()Z
       212: ifeq          234
       215: aload_1
       216: sipush        10218
       219: iconst_0
       220: anewarray     #81                 // class java/lang/Object
       223: invokevirtual #205                // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
       226: invokedynamic #412,  0            // InvokeDynamic #3:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       231: goto          236
       234: ldc           #113                // String
       236: invokevirtual #392                // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
       239: astore        11
       241: aload         11
       243: ldc_w         #416                // String %priceCount%
       246: aload         9
       248: invokevirtual #225                // Method ext/mods/gameserver/communitybbs/custom/model/Auction.getPriceCount:()I
       251: i2l
       252: invokestatic  #228                // Method ext/mods/commons/lang/StringUtil.formatNumber:(J)Ljava/lang/String;
       255: invokevirtual #392                // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
       258: astore        11
       260: aload         11
       262: ldc_w         #418                // String %currencyName%
       265: invokestatic  #420                // Method ext/mods/gameserver/custom/data/AuctionCurrencies.getInstance:()Lext/mods/gameserver/custom/data/AuctionCurrencies;
       268: aload         9
       270: invokevirtual #216                // Method ext/mods/gameserver/communitybbs/custom/model/Auction.getPriceId:()I
       273: invokevirtual #426                // Method ext/mods/gameserver/custom/data/AuctionCurrencies.getCurrencyName:(I)Ljava/lang/String;
       276: invokevirtual #392                // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
       279: astore        11
       281: aload         9
       283: invokevirtual #429                // Method ext/mods/gameserver/communitybbs/custom/model/Auction.getObjectId:()I
       286: aload_1
       287: invokevirtual #430                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
       290: if_icmpne     322
       293: aload         11
       295: ldc_w         #431                // String %button%
       298: aload_1
       299: sipush        10219
       302: iconst_0
       303: anewarray     #81                 // class java/lang/Object
       306: invokevirtual #205                // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
       309: invokedynamic #433,  0            // InvokeDynamic #4:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       314: invokevirtual #392                // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
       317: astore        11
       319: goto          354
       322: aload         11
       324: ldc_w         #431                // String %button%
       327: aload_1
       328: sipush        10220
       331: iconst_0
       332: anewarray     #81                 // class java/lang/Object
       335: invokevirtual #205                // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
       338: iload_2
       339: aload         9
       341: invokevirtual #434                // Method ext/mods/gameserver/communitybbs/custom/model/Auction.getId:()I
       344: invokedynamic #437,  0            // InvokeDynamic #5:makeConcatWithConstants:(Ljava/lang/String;II)Ljava/lang/String;
       349: invokevirtual #392                // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
       352: astore        11
       354: aload         7
       356: aload         11
       358: invokevirtual #440                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       361: pop
       362: goto          117
       365: aload         4
       367: ldc_w         #443                // String %template%
       370: aload         5
       372: invokevirtual #445                // Method ext/mods/commons/data/Pagination.getContent:()Ljava/lang/String;
       375: aload         7
       377: invokevirtual #447                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
       380: invokedynamic #450,  0            // InvokeDynamic #6:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
       385: invokevirtual #392                // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
       388: astore        4
       390: goto          820
       393: aload         6
       395: invokevirtual #380                // Method ext/mods/gameserver/communitybbs/custom/model/Auction.getItem:()Lext/mods/gameserver/model/item/kind/Item;
       398: astore        8
       400: aload_0
       401: aload_1
       402: ldc_w         #453                // String template-2.htm
       405: invokevirtual #313                // Method getContent:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Ljava/lang/String;
       408: astore        9
       410: aload         9
       412: ldc_w         #385                // String %icon%
       415: aload         8
       417: invokevirtual #387                // Method ext/mods/gameserver/model/item/kind/Item.getIcon:()Ljava/lang/String;
       420: invokevirtual #392                // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
       423: astore        9
       425: aload         9
       427: ldc_w         #396                // String %gradeIcon%
       430: aload         6
       432: invokevirtual #398                // Method ext/mods/gameserver/communitybbs/custom/model/Auction.getGradeIcon:()Ljava/lang/String;
       435: invokevirtual #392                // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
       438: astore        9
       440: aload         9
       442: ldc_w         #401                // String %itemName%
       445: aload_0
       446: aload         6
       448: invokevirtual #403                // Method getName:(Lext/mods/gameserver/communitybbs/custom/model/Auction;)Ljava/lang/String;
       451: invokevirtual #392                // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
       454: astore        9
       456: aload         9
       458: ldc_w         #407                // String %stackable%
       461: aload         8
       463: invokevirtual #409                // Method ext/mods/gameserver/model/item/kind/Item.isStackable:()Z
       466: ifeq          488
       469: aload_1
       470: sipush        10218
       473: iconst_0
       474: anewarray     #81                 // class java/lang/Object
       477: invokevirtual #205                // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
       480: invokedynamic #412,  0            // InvokeDynamic #3:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       485: goto          490
       488: ldc           #113                // String
       490: invokevirtual #392                // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
       493: astore        9
       495: aload         9
       497: ldc_w         #416                // String %priceCount%
       500: aload         6
       502: invokevirtual #225                // Method ext/mods/gameserver/communitybbs/custom/model/Auction.getPriceCount:()I
       505: i2l
       506: invokestatic  #228                // Method ext/mods/commons/lang/StringUtil.formatNumber:(J)Ljava/lang/String;
       509: invokevirtual #392                // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
       512: astore        9
       514: aload         9
       516: ldc_w         #418                // String %currencyName%
       519: invokestatic  #420                // Method ext/mods/gameserver/custom/data/AuctionCurrencies.getInstance:()Lext/mods/gameserver/custom/data/AuctionCurrencies;
       522: aload         6
       524: invokevirtual #216                // Method ext/mods/gameserver/communitybbs/custom/model/Auction.getPriceId:()I
       527: invokevirtual #426                // Method ext/mods/gameserver/custom/data/AuctionCurrencies.getCurrencyName:(I)Ljava/lang/String;
       530: invokevirtual #392                // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
       533: astore        9
       535: aload         9
       537: ldc_w         #455                // String %playerName%
       540: aload         6
       542: invokevirtual #457                // Method ext/mods/gameserver/communitybbs/custom/model/Auction.getPlayerName:()Ljava/lang/String;
       545: invokevirtual #392                // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
       548: astore        9
       550: aload         9
       552: ldc_w         #460                // String %auctionEndDate%
       555: new           #462                // class java/text/SimpleDateFormat
       558: dup
       559: ldc_w         #464                // String dd-MM-yyyy HH:mm:ss
       562: invokespecial #466                // Method java/text/SimpleDateFormat."<init>":(Ljava/lang/String;)V
       565: aload         6
       567: invokevirtual #468                // Method ext/mods/gameserver/communitybbs/custom/model/Auction.getDuration:()J
       570: invokestatic  #472                // Method java/lang/Long.valueOf:(J)Ljava/lang/Long;
       573: invokevirtual #477                // Method java/text/SimpleDateFormat.format:(Ljava/lang/Object;)Ljava/lang/String;
       576: invokedynamic #481,  0            // InvokeDynamic #7:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       581: invokevirtual #392                // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
       584: astore        9
       586: aload         7
       588: aload         9
       590: invokevirtual #440                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       593: pop
       594: aload         8
       596: invokevirtual #409                // Method ext/mods/gameserver/model/item/kind/Item.isStackable:()Z
       599: ifeq          723
       602: aload_0
       603: aload_1
       604: ldc_w         #482                // String template-stackable-3.htm
       607: invokevirtual #313                // Method getContent:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Ljava/lang/String;
       610: astore        10
       612: aload         10
       614: ldc_w         #484                // String %totalPrice%
       617: aload         6
       619: invokevirtual #486                // Method ext/mods/gameserver/communitybbs/custom/model/Auction.getItemCount:()I
       622: aload         6
       624: invokevirtual #225                // Method ext/mods/gameserver/communitybbs/custom/model/Auction.getPriceCount:()I
       627: imul
       628: i2l
       629: invokestatic  #228                // Method ext/mods/commons/lang/StringUtil.formatNumber:(J)Ljava/lang/String;
       632: invokevirtual #392                // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
       635: astore        10
       637: aload         10
       639: ldc_w         #418                // String %currencyName%
       642: invokestatic  #420                // Method ext/mods/gameserver/custom/data/AuctionCurrencies.getInstance:()Lext/mods/gameserver/custom/data/AuctionCurrencies;
       645: aload         6
       647: invokevirtual #216                // Method ext/mods/gameserver/communitybbs/custom/model/Auction.getPriceId:()I
       650: invokevirtual #426                // Method ext/mods/gameserver/custom/data/AuctionCurrencies.getCurrencyName:(I)Ljava/lang/String;
       653: invokevirtual #392                // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
       656: astore        10
       658: aload         10
       660: ldc_w         #431                // String %button%
       663: aload_1
       664: sipush        10221
       667: iconst_0
       668: anewarray     #81                 // class java/lang/Object
       671: invokevirtual #205                // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
       674: iload_2
       675: invokedynamic #488,  0            // InvokeDynamic #8:makeConcatWithConstants:(Ljava/lang/String;I)Ljava/lang/String;
       680: invokevirtual #392                // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
       683: astore        10
       685: aload         10
       687: ldc_w         #491                // String %button2%
       690: aload_1
       691: sipush        10222
       694: iconst_0
       695: anewarray     #81                 // class java/lang/Object
       698: invokevirtual #205                // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
       701: iload_2
       702: invokedynamic #493,  0            // InvokeDynamic #9:makeConcatWithConstants:(Ljava/lang/String;I)Ljava/lang/String;
       707: invokevirtual #392                // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
       710: astore        10
       712: aload         7
       714: aload         10
       716: invokevirtual #440                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       719: pop
       720: goto          795
       723: aload_0
       724: aload_1
       725: ldc_w         #494                // String template-nonstackable-3.htm
       728: invokevirtual #313                // Method getContent:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Ljava/lang/String;
       731: astore        10
       733: aload         10
       735: ldc_w         #431                // String %button%
       738: aload_1
       739: sipush        10221
       742: iconst_0
       743: anewarray     #81                 // class java/lang/Object
       746: invokevirtual #205                // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
       749: iload_2
       750: invokedynamic #496,  0            // InvokeDynamic #10:makeConcatWithConstants:(Ljava/lang/String;I)Ljava/lang/String;
       755: invokevirtual #392                // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
       758: astore        10
       760: aload         10
       762: ldc_w         #491                // String %button2%
       765: aload_1
       766: sipush        10222
       769: iconst_0
       770: anewarray     #81                 // class java/lang/Object
       773: invokevirtual #205                // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
       776: iload_2
       777: invokedynamic #493,  0            // InvokeDynamic #9:makeConcatWithConstants:(Ljava/lang/String;I)Ljava/lang/String;
       782: invokevirtual #392                // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
       785: astore        10
       787: aload         7
       789: aload         10
       791: invokevirtual #440                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       794: pop
       795: aload         4
       797: ldc_w         #443                // String %template%
       800: aload         5
       802: invokevirtual #445                // Method ext/mods/commons/data/Pagination.getContent:()Ljava/lang/String;
       805: aload         7
       807: invokevirtual #447                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
       810: invokedynamic #450,  0            // InvokeDynamic #6:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
       815: invokevirtual #392                // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
       818: astore        4
       820: aload_3
       821: invokevirtual #198                // Method ext/mods/gameserver/communitybbs/custom/model/Function.getViewId:()I
       824: ifeq          854
       827: aload         4
       829: ldc_w         #497                // String %search%
       832: ldc           #101                // String
       834: invokevirtual #392                // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
       837: astore        4
       839: aload         4
       841: ldc_w         #431                // String %button%
       844: ldc           #101                // String
       846: invokevirtual #392                // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
       849: astore        4
       851: goto          946
       854: aload_3
       855: invokevirtual #499                // Method ext/mods/gameserver/communitybbs/custom/model/Function.getSearch:()Ljava/lang/String;
       858: invokevirtual #164                // Method java/lang/String.isBlank:()Z
       861: ifne          907
       864: aload         4
       866: ldc_w         #497                // String %search%
       869: aload_3
       870: invokevirtual #499                // Method ext/mods/gameserver/communitybbs/custom/model/Function.getSearch:()Ljava/lang/String;
       873: invokevirtual #392                // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
       876: astore        4
       878: aload         4
       880: ldc_w         #431                // String %button%
       883: aload_1
       884: sipush        10224
       887: iconst_0
       888: anewarray     #81                 // class java/lang/Object
       891: invokevirtual #205                // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
       894: invokedynamic #502,  0            // InvokeDynamic #11:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       899: invokevirtual #392                // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
       902: astore        4
       904: goto          946
       907: aload         4
       909: ldc_w         #497                // String %search%
       912: ldc_w         #503                // String <edit var=param width=250 height=11 length=75>
       915: invokevirtual #392                // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
       918: astore        4
       920: aload         4
       922: ldc_w         #431                // String %button%
       925: aload_1
       926: sipush        10225
       929: iconst_0
       930: anewarray     #81                 // class java/lang/Object
       933: invokevirtual #205                // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
       936: invokedynamic #505,  0            // InvokeDynamic #12:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       941: invokevirtual #392                // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
       944: astore        4
       946: aload         4
       948: ldc_w         #443                // String %template%
       951: aload         5
       953: invokevirtual #445                // Method ext/mods/commons/data/Pagination.getContent:()Ljava/lang/String;
       956: invokevirtual #392                // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
       959: astore        4
       961: aload         4
       963: ldc_w         #506                // String %filters%
       966: aload_0
       967: aload_1
       968: aload_3
       969: invokevirtual #508                // Method getFilters:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/communitybbs/custom/model/Function;)Ljava/lang/String;
       972: invokevirtual #392                // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
       975: astore        4
       977: aload         4
       979: aload_1
       980: invokestatic  #512                // Method separateAndSend:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
       983: return
      LineNumberTable:
        line 210: 0
        line 212: 10
        line 214: 58
        line 215: 68
        line 217: 77
        line 219: 82
        line 221: 87
        line 222: 95
        line 224: 110
        line 226: 139
        line 227: 146
        line 229: 156
        line 230: 171
        line 231: 186
        line 232: 202
        line 233: 241
        line 234: 260
        line 236: 281
        line 237: 293
        line 239: 322
        line 241: 354
        line 242: 362
        line 243: 365
        line 247: 393
        line 248: 400
        line 250: 410
        line 251: 425
        line 252: 440
        line 253: 456
        line 254: 495
        line 255: 514
        line 256: 535
        line 257: 550
        line 259: 586
        line 261: 594
        line 263: 602
        line 264: 612
        line 265: 637
        line 266: 658
        line 267: 685
        line 269: 712
        line 270: 720
        line 273: 723
        line 274: 733
        line 275: 760
        line 277: 787
        line 280: 795
        line 283: 820
        line 285: 827
        line 286: 839
        line 288: 854
        line 290: 864
        line 291: 878
        line 295: 907
        line 296: 920
        line 299: 946
        line 300: 961
        line 302: 977
        line 303: 983
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          146     216    10  item   Lext/mods/gameserver/model/item/kind/Item;
          156     206    11 auctionTemplate   Ljava/lang/String;
          139     223     9 auction   Lext/mods/gameserver/communitybbs/custom/model/Auction;
          612     108    10 stackableTemplate   Ljava/lang/String;
          733      62    10 nonStackableTemplate   Ljava/lang/String;
          400     420     8  item   Lext/mods/gameserver/model/item/kind/Item;
          410     410     9 auctionTemplate   Ljava/lang/String;
            0     984     0  this   Lext/mods/gameserver/communitybbs/custom/AuctionBBSManager;
            0     984     1 player   Lext/mods/gameserver/model/actor/Player;
            0     984     2  page   I
            0     984     3 function   Lext/mods/gameserver/communitybbs/custom/model/Function;
           10     974     4 content   Ljava/lang/String;
           58     926     5  list   Lext/mods/commons/data/Pagination;
           68     916     6 auctionView   Lext/mods/gameserver/communitybbs/custom/model/Auction;
           77     907     7   str   Ljava/lang/StringBuilder;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
           58     926     5  list   Lext/mods/commons/data/Pagination<Lext/mods/gameserver/communitybbs/custom/model/Auction;>;
      StackMapTable: number_of_entries = 15
        frame_type = 255 /* full_frame */
          offset_delta = 117
          locals = [ class ext/mods/gameserver/communitybbs/custom/AuctionBBSManager, class ext/mods/gameserver/model/actor/Player, int, class ext/mods/gameserver/communitybbs/custom/model/Function, class java/lang/String, class ext/mods/commons/data/Pagination, class ext/mods/gameserver/communitybbs/custom/model/Auction, class java/lang/StringBuilder, class java/util/Iterator ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 116
          locals = [ class ext/mods/gameserver/communitybbs/custom/AuctionBBSManager, class ext/mods/gameserver/model/actor/Player, int, class ext/mods/gameserver/communitybbs/custom/model/Function, class java/lang/String, class ext/mods/commons/data/Pagination, class ext/mods/gameserver/communitybbs/custom/model/Auction, class java/lang/StringBuilder, class java/util/Iterator, class ext/mods/gameserver/communitybbs/custom/model/Auction, class ext/mods/gameserver/model/item/kind/Item, class java/lang/String ]
          stack = [ class java/lang/String, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 1
          locals = [ class ext/mods/gameserver/communitybbs/custom/AuctionBBSManager, class ext/mods/gameserver/model/actor/Player, int, class ext/mods/gameserver/communitybbs/custom/model/Function, class java/lang/String, class ext/mods/commons/data/Pagination, class ext/mods/gameserver/communitybbs/custom/model/Auction, class java/lang/StringBuilder, class java/util/Iterator, class ext/mods/gameserver/communitybbs/custom/model/Auction, class ext/mods/gameserver/model/item/kind/Item, class java/lang/String ]
          stack = [ class java/lang/String, class java/lang/String, class java/lang/String ]
        frame_type = 251 /* same_frame_extended */
          offset_delta = 85
        frame_type = 31 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 10
          locals = [ class ext/mods/gameserver/communitybbs/custom/AuctionBBSManager, class ext/mods/gameserver/model/actor/Player, int, class ext/mods/gameserver/communitybbs/custom/model/Function, class java/lang/String, class ext/mods/commons/data/Pagination, class ext/mods/gameserver/communitybbs/custom/model/Auction, class java/lang/StringBuilder ]
          stack = []
        frame_type = 27 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 94
          locals = [ class ext/mods/gameserver/communitybbs/custom/AuctionBBSManager, class ext/mods/gameserver/model/actor/Player, int, class ext/mods/gameserver/communitybbs/custom/model/Function, class java/lang/String, class ext/mods/commons/data/Pagination, class ext/mods/gameserver/communitybbs/custom/model/Auction, class java/lang/StringBuilder, class ext/mods/gameserver/model/item/kind/Item, class java/lang/String ]
          stack = [ class java/lang/String, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 1
          locals = [ class ext/mods/gameserver/communitybbs/custom/AuctionBBSManager, class ext/mods/gameserver/model/actor/Player, int, class ext/mods/gameserver/communitybbs/custom/model/Function, class java/lang/String, class ext/mods/commons/data/Pagination, class ext/mods/gameserver/communitybbs/custom/model/Auction, class java/lang/StringBuilder, class ext/mods/gameserver/model/item/kind/Item, class java/lang/String ]
          stack = [ class java/lang/String, class java/lang/String, class java/lang/String ]
        frame_type = 251 /* same_frame_extended */
          offset_delta = 232
        frame_type = 251 /* same_frame_extended */
          offset_delta = 71
        frame_type = 249 /* chop */
          offset_delta = 24
        frame_type = 33 /* same */
        frame_type = 52 /* same */
        frame_type = 38 /* same */

  public void sendIndexMine(ext.mods.gameserver.model.actor.Player, int, ext.mods.gameserver.communitybbs.custom.model.Function);
    descriptor: (Lext/mods/gameserver/model/actor/Player;ILext/mods/gameserver/communitybbs/custom/model/Function;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=7, locals=12, args_size=4
         0: aload_0
         1: aload_1
         2: ldc_w         #516                // String index-mine.htm
         5: invokevirtual #313                // Method getContent:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Ljava/lang/String;
         8: astore        4
        10: new           #317                // class ext/mods/commons/data/Pagination
        13: dup
        14: aload_0
        15: invokevirtual #319                // Method getAuctions:()Ljava/util/Collection;
        18: invokeinterface #323,  1          // InterfaceMethod java/util/Collection.stream:()Ljava/util/stream/Stream;
        23: iload_2
        24: bipush        9
        26: aload_1
        27: invokedynamic #518,  0            // InvokeDynamic #13:test:(Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/Predicate;
        32: invokedynamic #521,  0            // InvokeDynamic #14:apply:()Ljava/util/function/Function;
        37: invokestatic  #337                // InterfaceMethod java/util/Comparator.comparing:(Ljava/util/function/Function;)Ljava/util/Comparator;
        40: invokeinterface #522,  1          // InterfaceMethod java/util/Comparator.reversed:()Ljava/util/Comparator;
        45: invokespecial #348                // Method ext/mods/commons/data/Pagination."<init>":(Ljava/util/stream/Stream;IILjava/util/function/Predicate;Ljava/util/Comparator;)V
        48: astore        5
        50: aload_0
        51: aload_3
        52: invokevirtual #277                // Method ext/mods/gameserver/communitybbs/custom/model/Function.getEditId:()I
        55: invokevirtual #201                // Method getAuction:(I)Lext/mods/gameserver/communitybbs/custom/model/Auction;
        58: astore        6
        60: new           #351                // class java/lang/StringBuilder
        63: dup
        64: invokespecial #353                // Method java/lang/StringBuilder."<init>":()V
        67: astore        7
        69: aload         6
        71: ifnonnull     404
        74: aload_3
        75: iload_2
        76: invokevirtual #354                // Method ext/mods/gameserver/communitybbs/custom/model/Function.setLastPage:(I)V
        79: aload         7
        81: aload_1
        82: sipush        10231
        85: iconst_0
        86: anewarray     #81                 // class java/lang/Object
        89: invokevirtual #205                // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
        92: invokedynamic #526,  0            // InvokeDynamic #15:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
        97: iconst_1
        98: anewarray     #81                 // class java/lang/Object
       101: dup
       102: iconst_0
       103: aload         5
       105: invokevirtual #527                // Method ext/mods/commons/data/Pagination.size:()I
       108: invokestatic  #89                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       111: aastore
       112: invokestatic  #528                // Method java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
       115: invokedynamic #531,  0            // InvokeDynamic #16:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       120: invokevirtual #440                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       123: pop
       124: aload         5
       126: ldc_w         #532                // String bypass _friendlist_0_mine %page%
       129: invokevirtual #359                // Method ext/mods/commons/data/Pagination.generatePagesMedium:(Ljava/lang/String;)V
       132: aload         5
       134: invokevirtual #368                // Method ext/mods/commons/data/Pagination.iterator:()Ljava/util/Iterator;
       137: astore        8
       139: aload         8
       141: invokeinterface #372,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       146: ifeq          376
       149: aload         8
       151: invokeinterface #377,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       156: checkcast     #45                 // class ext/mods/gameserver/communitybbs/custom/model/Auction
       159: astore        9
       161: aload         9
       163: invokevirtual #380                // Method ext/mods/gameserver/communitybbs/custom/model/Auction.getItem:()Lext/mods/gameserver/model/item/kind/Item;
       166: astore        10
       168: aload_0
       169: aload_1
       170: ldc_w         #534                // String auction-template.htm
       173: invokevirtual #313                // Method getContent:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Ljava/lang/String;
       176: astore        11
       178: aload         11
       180: ldc_w         #536                // String %bgColor%
       183: aload         9
       185: invokevirtual #468                // Method ext/mods/gameserver/communitybbs/custom/model/Auction.getDuration:()J
       188: invokestatic  #538                // Method java/lang/System.currentTimeMillis:()J
       191: lcmp
       192: ifge          201
       195: ldc_w         #543                // String bgcolor=FF0000
       198: goto          203
       201: ldc           #113                // String
       203: invokevirtual #392                // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
       206: astore        11
       208: aload         11
       210: ldc_w         #385                // String %icon%
       213: aload         10
       215: invokevirtual #387                // Method ext/mods/gameserver/model/item/kind/Item.getIcon:()Ljava/lang/String;
       218: invokevirtual #392                // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
       221: astore        11
       223: aload         11
       225: ldc_w         #396                // String %gradeIcon%
       228: aload         9
       230: invokevirtual #398                // Method ext/mods/gameserver/communitybbs/custom/model/Auction.getGradeIcon:()Ljava/lang/String;
       233: invokevirtual #392                // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
       236: astore        11
       238: aload         11
       240: ldc_w         #401                // String %itemName%
       243: aload_0
       244: aload         9
       246: invokevirtual #403                // Method getName:(Lext/mods/gameserver/communitybbs/custom/model/Auction;)Ljava/lang/String;
       249: invokevirtual #392                // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
       252: astore        11
       254: aload         11
       256: ldc_w         #545                // String %isStackable%
       259: aload         10
       261: invokevirtual #409                // Method ext/mods/gameserver/model/item/kind/Item.isStackable:()Z
       264: ifeq          286
       267: aload_1
       268: sipush        10218
       271: iconst_0
       272: anewarray     #81                 // class java/lang/Object
       275: invokevirtual #205                // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
       278: invokedynamic #412,  0            // InvokeDynamic #3:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       283: goto          288
       286: ldc           #113                // String
       288: invokevirtual #392                // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
       291: astore        11
       293: aload         11
       295: ldc_w         #547                // String %price%
       298: aload         9
       300: invokevirtual #225                // Method ext/mods/gameserver/communitybbs/custom/model/Auction.getPriceCount:()I
       303: i2l
       304: invokestatic  #228                // Method ext/mods/commons/lang/StringUtil.formatNumber:(J)Ljava/lang/String;
       307: invokevirtual #392                // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
       310: astore        11
       312: aload         11
       314: ldc_w         #418                // String %currencyName%
       317: invokestatic  #420                // Method ext/mods/gameserver/custom/data/AuctionCurrencies.getInstance:()Lext/mods/gameserver/custom/data/AuctionCurrencies;
       320: aload         9
       322: invokevirtual #216                // Method ext/mods/gameserver/communitybbs/custom/model/Auction.getPriceId:()I
       325: invokevirtual #426                // Method ext/mods/gameserver/custom/data/AuctionCurrencies.getCurrencyName:(I)Ljava/lang/String;
       328: invokevirtual #392                // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
       331: astore        11
       333: aload         11
       335: ldc_w         #549                // String %page%
       338: iload_2
       339: invokestatic  #155                // Method java/lang/String.valueOf:(I)Ljava/lang/String;
       342: invokevirtual #392                // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
       345: astore        11
       347: aload         11
       349: ldc_w         #551                // String %auctionId%
       352: aload         9
       354: invokevirtual #434                // Method ext/mods/gameserver/communitybbs/custom/model/Auction.getId:()I
       357: invokestatic  #155                // Method java/lang/String.valueOf:(I)Ljava/lang/String;
       360: invokevirtual #392                // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
       363: astore        11
       365: aload         7
       367: aload         11
       369: invokevirtual #440                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       372: pop
       373: goto          139
       376: aload         4
       378: ldc_w         #443                // String %template%
       381: aload         5
       383: invokevirtual #445                // Method ext/mods/commons/data/Pagination.getContent:()Ljava/lang/String;
       386: aload         7
       388: invokevirtual #447                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
       391: invokedynamic #450,  0            // InvokeDynamic #6:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
       396: invokevirtual #392                // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
       399: astore        4
       401: goto          706
       404: aload         6
       406: invokevirtual #468                // Method ext/mods/gameserver/communitybbs/custom/model/Auction.getDuration:()J
       409: invokestatic  #538                // Method java/lang/System.currentTimeMillis:()J
       412: lcmp
       413: ifle          445
       416: new           #462                // class java/text/SimpleDateFormat
       419: dup
       420: ldc_w         #464                // String dd-MM-yyyy HH:mm:ss
       423: invokespecial #466                // Method java/text/SimpleDateFormat."<init>":(Ljava/lang/String;)V
       426: aload         6
       428: invokevirtual #468                // Method ext/mods/gameserver/communitybbs/custom/model/Auction.getDuration:()J
       431: invokestatic  #472                // Method java/lang/Long.valueOf:(J)Ljava/lang/Long;
       434: invokevirtual #477                // Method java/text/SimpleDateFormat.format:(Ljava/lang/Object;)Ljava/lang/String;
       437: invokedynamic #553,  0            // InvokeDynamic #17:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       442: goto          461
       445: aload_1
       446: sipush        10232
       449: iconst_0
       450: anewarray     #81                 // class java/lang/Object
       453: invokevirtual #205                // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
       456: invokedynamic #554,  0            // InvokeDynamic #18:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       461: astore        8
       463: aload         7
       465: aload_1
       466: sipush        10226
       469: iconst_0
       470: anewarray     #81                 // class java/lang/Object
       473: invokevirtual #205                // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
       476: aload         8
       478: invokedynamic #555,  0            // InvokeDynamic #19:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
       483: invokevirtual #440                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       486: pop
       487: aload         6
       489: invokevirtual #380                // Method ext/mods/gameserver/communitybbs/custom/model/Auction.getItem:()Lext/mods/gameserver/model/item/kind/Item;
       492: astore        9
       494: aload_0
       495: aload_1
       496: ldc_w         #556                // String auction-details.htm
       499: invokevirtual #313                // Method getContent:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Ljava/lang/String;
       502: astore        10
       504: aload         10
       506: ldc_w         #385                // String %icon%
       509: aload         9
       511: invokevirtual #387                // Method ext/mods/gameserver/model/item/kind/Item.getIcon:()Ljava/lang/String;
       514: invokevirtual #392                // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
       517: astore        10
       519: aload         10
       521: ldc_w         #396                // String %gradeIcon%
       524: aload         6
       526: invokevirtual #398                // Method ext/mods/gameserver/communitybbs/custom/model/Auction.getGradeIcon:()Ljava/lang/String;
       529: invokevirtual #392                // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
       532: astore        10
       534: aload         10
       536: ldc_w         #401                // String %itemName%
       539: aload_0
       540: aload         6
       542: invokevirtual #403                // Method getName:(Lext/mods/gameserver/communitybbs/custom/model/Auction;)Ljava/lang/String;
       545: invokevirtual #392                // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
       548: astore        10
       550: aload         10
       552: ldc_w         #545                // String %isStackable%
       555: aload         9
       557: invokevirtual #409                // Method ext/mods/gameserver/model/item/kind/Item.isStackable:()Z
       560: ifeq          582
       563: aload_1
       564: sipush        10218
       567: iconst_0
       568: anewarray     #81                 // class java/lang/Object
       571: invokevirtual #205                // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
       574: invokedynamic #412,  0            // InvokeDynamic #3:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       579: goto          584
       582: ldc           #113                // String
       584: invokevirtual #392                // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
       587: astore        10
       589: aload         10
       591: ldc_w         #547                // String %price%
       594: aload         6
       596: invokevirtual #225                // Method ext/mods/gameserver/communitybbs/custom/model/Auction.getPriceCount:()I
       599: i2l
       600: invokestatic  #228                // Method ext/mods/commons/lang/StringUtil.formatNumber:(J)Ljava/lang/String;
       603: invokevirtual #392                // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
       606: astore        10
       608: aload         10
       610: ldc_w         #418                // String %currencyName%
       613: invokestatic  #420                // Method ext/mods/gameserver/custom/data/AuctionCurrencies.getInstance:()Lext/mods/gameserver/custom/data/AuctionCurrencies;
       616: aload         6
       618: invokevirtual #216                // Method ext/mods/gameserver/communitybbs/custom/model/Auction.getPriceId:()I
       621: invokevirtual #426                // Method ext/mods/gameserver/custom/data/AuctionCurrencies.getCurrencyName:(I)Ljava/lang/String;
       624: invokevirtual #392                // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
       627: astore        10
       629: aload         10
       631: ldc_w         #549                // String %page%
       634: iload_2
       635: invokestatic  #155                // Method java/lang/String.valueOf:(I)Ljava/lang/String;
       638: invokevirtual #392                // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
       641: astore        10
       643: aload         10
       645: ldc_w         #558                // String %auctionFee%
       648: getstatic     #560                // Field ext/mods/Config.AUCTION_FEE:I
       651: i2l
       652: invokestatic  #228                // Method ext/mods/commons/lang/StringUtil.formatNumber:(J)Ljava/lang/String;
       655: invokevirtual #392                // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
       658: astore        10
       660: aload         10
       662: ldc_w         #566                // String %auctionFeeName%
       665: getstatic     #568                // Field ext/mods/Config.AUCTION_ITEM_FEE_NAME:Ljava/lang/String;
       668: invokevirtual #392                // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
       671: astore        10
       673: aload         7
       675: aload         10
       677: invokevirtual #440                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       680: pop
       681: aload         4
       683: ldc_w         #443                // String %template%
       686: aload         5
       688: invokevirtual #445                // Method ext/mods/commons/data/Pagination.getContent:()Ljava/lang/String;
       691: aload         7
       693: invokevirtual #447                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
       696: invokedynamic #450,  0            // InvokeDynamic #6:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
       701: invokevirtual #392                // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
       704: astore        4
       706: aload         4
       708: ldc_w         #443                // String %template%
       711: aload         5
       713: invokevirtual #445                // Method ext/mods/commons/data/Pagination.getContent:()Ljava/lang/String;
       716: invokevirtual #392                // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
       719: astore        4
       721: aload         4
       723: ldc_w         #572                // String %inventory%
       726: aload_0
       727: aload_1
       728: iload_2
       729: invokevirtual #574                // Method getInventory:(Lext/mods/gameserver/model/actor/Player;I)Ljava/lang/String;
       732: invokevirtual #392                // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
       735: astore        4
       737: aload         4
       739: aload_1
       740: invokestatic  #512                // Method separateAndSend:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
       743: return
      LineNumberTable:
        line 307: 0
        line 308: 10
        line 310: 50
        line 311: 60
        line 313: 69
        line 315: 74
        line 316: 79
        line 317: 124
        line 319: 132
        line 321: 161
        line 322: 168
        line 323: 178
        line 324: 208
        line 325: 223
        line 326: 238
        line 327: 254
        line 328: 293
        line 329: 312
        line 330: 333
        line 331: 347
        line 332: 365
        line 333: 373
        line 334: 376
        line 338: 404
        line 339: 463
        line 340: 487
        line 342: 494
        line 343: 504
        line 344: 519
        line 345: 534
        line 346: 550
        line 347: 589
        line 348: 608
        line 349: 629
        line 350: 643
        line 351: 660
        line 352: 673
        line 353: 681
        line 356: 706
        line 357: 721
        line 359: 737
        line 360: 743
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          168     205    10  item   Lext/mods/gameserver/model/item/kind/Item;
          178     195    11 auctionTemplate   Ljava/lang/String;
          161     212     9 auction   Lext/mods/gameserver/communitybbs/custom/model/Auction;
          463     243     8  info   Ljava/lang/String;
          494     212     9  item   Lext/mods/gameserver/model/item/kind/Item;
          504     202    10 auctionTemplate   Ljava/lang/String;
            0     744     0  this   Lext/mods/gameserver/communitybbs/custom/AuctionBBSManager;
            0     744     1 player   Lext/mods/gameserver/model/actor/Player;
            0     744     2  page   I
            0     744     3 function   Lext/mods/gameserver/communitybbs/custom/model/Function;
           10     734     4 content   Ljava/lang/String;
           50     694     5  list   Lext/mods/commons/data/Pagination;
           60     684     6 auctionEdit   Lext/mods/gameserver/communitybbs/custom/model/Auction;
           69     675     7 listBuilder   Ljava/lang/StringBuilder;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
           50     694     5  list   Lext/mods/commons/data/Pagination<Lext/mods/gameserver/communitybbs/custom/model/Auction;>;
      StackMapTable: number_of_entries = 12
        frame_type = 255 /* full_frame */
          offset_delta = 139
          locals = [ class ext/mods/gameserver/communitybbs/custom/AuctionBBSManager, class ext/mods/gameserver/model/actor/Player, int, class ext/mods/gameserver/communitybbs/custom/model/Function, class java/lang/String, class ext/mods/commons/data/Pagination, class ext/mods/gameserver/communitybbs/custom/model/Auction, class java/lang/StringBuilder, class java/util/Iterator ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 61
          locals = [ class ext/mods/gameserver/communitybbs/custom/AuctionBBSManager, class ext/mods/gameserver/model/actor/Player, int, class ext/mods/gameserver/communitybbs/custom/model/Function, class java/lang/String, class ext/mods/commons/data/Pagination, class ext/mods/gameserver/communitybbs/custom/model/Auction, class java/lang/StringBuilder, class java/util/Iterator, class ext/mods/gameserver/communitybbs/custom/model/Auction, class ext/mods/gameserver/model/item/kind/Item, class java/lang/String ]
          stack = [ class java/lang/String, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 1
          locals = [ class ext/mods/gameserver/communitybbs/custom/AuctionBBSManager, class ext/mods/gameserver/model/actor/Player, int, class ext/mods/gameserver/communitybbs/custom/model/Function, class java/lang/String, class ext/mods/commons/data/Pagination, class ext/mods/gameserver/communitybbs/custom/model/Auction, class java/lang/StringBuilder, class java/util/Iterator, class ext/mods/gameserver/communitybbs/custom/model/Auction, class ext/mods/gameserver/model/item/kind/Item, class java/lang/String ]
          stack = [ class java/lang/String, class java/lang/String, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 82
          locals = [ class ext/mods/gameserver/communitybbs/custom/AuctionBBSManager, class ext/mods/gameserver/model/actor/Player, int, class ext/mods/gameserver/communitybbs/custom/model/Function, class java/lang/String, class ext/mods/commons/data/Pagination, class ext/mods/gameserver/communitybbs/custom/model/Auction, class java/lang/StringBuilder, class java/util/Iterator, class ext/mods/gameserver/communitybbs/custom/model/Auction, class ext/mods/gameserver/model/item/kind/Item, class java/lang/String ]
          stack = [ class java/lang/String, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 1
          locals = [ class ext/mods/gameserver/communitybbs/custom/AuctionBBSManager, class ext/mods/gameserver/model/actor/Player, int, class ext/mods/gameserver/communitybbs/custom/model/Function, class java/lang/String, class ext/mods/commons/data/Pagination, class ext/mods/gameserver/communitybbs/custom/model/Auction, class java/lang/StringBuilder, class java/util/Iterator, class ext/mods/gameserver/communitybbs/custom/model/Auction, class ext/mods/gameserver/model/item/kind/Item, class java/lang/String ]
          stack = [ class java/lang/String, class java/lang/String, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 87
          locals = [ class ext/mods/gameserver/communitybbs/custom/AuctionBBSManager, class ext/mods/gameserver/model/actor/Player, int, class ext/mods/gameserver/communitybbs/custom/model/Function, class java/lang/String, class ext/mods/commons/data/Pagination, class ext/mods/gameserver/communitybbs/custom/model/Auction, class java/lang/StringBuilder ]
          stack = []
        frame_type = 27 /* same */
        frame_type = 40 /* same */
        frame_type = 79 /* same_locals_1_stack_item */
          stack = [ class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 120
          locals = [ class ext/mods/gameserver/communitybbs/custom/AuctionBBSManager, class ext/mods/gameserver/model/actor/Player, int, class ext/mods/gameserver/communitybbs/custom/model/Function, class java/lang/String, class ext/mods/commons/data/Pagination, class ext/mods/gameserver/communitybbs/custom/model/Auction, class java/lang/StringBuilder, class java/lang/String, class ext/mods/gameserver/model/item/kind/Item, class java/lang/String ]
          stack = [ class java/lang/String, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 1
          locals = [ class ext/mods/gameserver/communitybbs/custom/AuctionBBSManager, class ext/mods/gameserver/model/actor/Player, int, class ext/mods/gameserver/communitybbs/custom/model/Function, class java/lang/String, class ext/mods/commons/data/Pagination, class ext/mods/gameserver/communitybbs/custom/model/Auction, class java/lang/StringBuilder, class java/lang/String, class ext/mods/gameserver/model/item/kind/Item, class java/lang/String ]
          stack = [ class java/lang/String, class java/lang/String, class java/lang/String ]
        frame_type = 248 /* chop */
          offset_delta = 121

  public java.lang.String getName(ext.mods.gameserver.communitybbs.custom.model.Auction);
    descriptor: (Lext/mods/gameserver/communitybbs/custom/model/Auction;)Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=2
         0: aload_1
         1: invokevirtual #380                // Method ext/mods/gameserver/communitybbs/custom/model/Auction.getItem:()Lext/mods/gameserver/model/item/kind/Item;
         4: invokevirtual #577                // Method ext/mods/gameserver/model/item/kind/Item.getName:()Ljava/lang/String;
         7: astore_2
         8: aload_2
         9: invokevirtual #158                // Method java/lang/String.length:()I
        12: bipush        44
        14: if_icmplt     30
        17: aload_2
        18: iconst_0
        19: bipush        42
        21: invokevirtual #579                // Method java/lang/String.substring:(II)Ljava/lang/String;
        24: invokedynamic #582,  0            // InvokeDynamic #20:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
        29: astore_2
        30: aload_1
        31: invokevirtual #380                // Method ext/mods/gameserver/communitybbs/custom/model/Auction.getItem:()Lext/mods/gameserver/model/item/kind/Item;
        34: invokevirtual #583                // Method ext/mods/gameserver/model/item/kind/Item.isEquipable:()Z
        37: ifeq          72
        40: aload_2
        41: ldc_w         #586                // String  -
        44: invokevirtual #588                // Method java/lang/String.contains:(Ljava/lang/CharSequence;)Z
        47: ifeq          72
        50: aload_1
        51: invokevirtual #380                // Method ext/mods/gameserver/communitybbs/custom/model/Auction.getItem:()Lext/mods/gameserver/model/item/kind/Item;
        54: invokevirtual #577                // Method ext/mods/gameserver/model/item/kind/Item.getName:()Ljava/lang/String;
        57: ldc_w         #586                // String  -
        60: ldc_w         #592                // String </font> - <font color=LEVEL>
        63: invokevirtual #392                // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
        66: invokedynamic #594,  0            // InvokeDynamic #21:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
        71: astore_2
        72: aload_1
        73: invokevirtual #380                // Method ext/mods/gameserver/communitybbs/custom/model/Auction.getItem:()Lext/mods/gameserver/model/item/kind/Item;
        76: invokevirtual #409                // Method ext/mods/gameserver/model/item/kind/Item.isStackable:()Z
        79: ifeq          97
        82: aload_2
        83: aload_1
        84: invokevirtual #486                // Method ext/mods/gameserver/communitybbs/custom/model/Auction.getItemCount:()I
        87: i2l
        88: invokestatic  #228                // Method ext/mods/commons/lang/StringUtil.formatNumber:(J)Ljava/lang/String;
        91: invokedynamic #595,  0            // InvokeDynamic #22:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        96: astore_2
        97: aload_1
        98: invokevirtual #596                // Method ext/mods/gameserver/communitybbs/custom/model/Auction.getItemEnchant:()I
       101: ifle          115
       104: aload_2
       105: aload_1
       106: invokevirtual #596                // Method ext/mods/gameserver/communitybbs/custom/model/Auction.getItemEnchant:()I
       109: invokedynamic #599,  0            // InvokeDynamic #23:makeConcatWithConstants:(Ljava/lang/String;I)Ljava/lang/String;
       114: astore_2
       115: aload_2
       116: areturn
      LineNumberTable:
        line 364: 0
        line 365: 8
        line 366: 17
        line 368: 30
        line 369: 50
        line 371: 72
        line 372: 82
        line 374: 97
        line 375: 104
        line 377: 115
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     117     0  this   Lext/mods/gameserver/communitybbs/custom/AuctionBBSManager;
            0     117     1 auction   Lext/mods/gameserver/communitybbs/custom/model/Auction;
            8     109     2  name   Ljava/lang/String;
      StackMapTable: number_of_entries = 4
        frame_type = 252 /* append */
          offset_delta = 30
          locals = [ class java/lang/String ]
        frame_type = 41 /* same */
        frame_type = 24 /* same */
        frame_type = 17 /* same */

  public java.lang.String getFilters(ext.mods.gameserver.model.actor.Player, ext.mods.gameserver.communitybbs.custom.model.Function);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/communitybbs/custom/model/Function;)Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=8, args_size=3
         0: new           #351                // class java/lang/StringBuilder
         3: dup
         4: invokespecial #353                // Method java/lang/StringBuilder."<init>":()V
         7: astore_3
         8: aload_0
         9: aload_1
        10: ldc_w         #600                // String filter.htm
        13: invokevirtual #313                // Method getContent:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Ljava/lang/String;
        16: astore        4
        18: aload         4
        20: ldc_w         #602                // String %type%
        23: aload_0
        24: ldc           #143                // String type
        26: aload_2
        27: invokevirtual #604                // Method ext/mods/gameserver/communitybbs/custom/model/Function.getItemType:()Ljava/lang/String;
        30: ldc_w         #607                // String All,Weapon,Armor,Jewel,Other,Soulshot/Spiritshot,Enchant
        33: invokevirtual #609                // Method getFilters:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        36: invokevirtual #392                // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
        39: astore        4
        41: aload         4
        43: ldc_w         #612                // String %grade%
        46: aload_0
        47: ldc           #145                // String grade
        49: aload_2
        50: invokevirtual #614                // Method ext/mods/gameserver/communitybbs/custom/model/Function.getItemGrade:()Ljava/lang/String;
        53: ldc_w         #617                // String All,S,A,B,C,D,NONE
        56: invokevirtual #609                // Method getFilters:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        59: invokevirtual #392                // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
        62: astore        4
        64: new           #351                // class java/lang/StringBuilder
        67: dup
        68: ldc           #183                // String All
        70: invokespecial #619                // Method java/lang/StringBuilder."<init>":(Ljava/lang/String;)V
        73: astore        5
        75: invokestatic  #420                // Method ext/mods/gameserver/custom/data/AuctionCurrencies.getInstance:()Lext/mods/gameserver/custom/data/AuctionCurrencies;
        78: invokevirtual #620                // Method ext/mods/gameserver/custom/data/AuctionCurrencies.getCurrencyNames:()Ljava/util/Set;
        81: invokeinterface #624,  1          // InterfaceMethod java/util/Set.iterator:()Ljava/util/Iterator;
        86: astore        6
        88: aload         6
        90: invokeinterface #372,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        95: ifeq          127
        98: aload         6
       100: invokeinterface #377,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       105: checkcast     #122                // class java/lang/String
       108: astore        7
       110: aload         5
       112: ldc_w         #627                // String ,
       115: invokevirtual #440                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       118: aload         7
       120: invokevirtual #440                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       123: pop
       124: goto          88
       127: aload         4
       129: ldc_w         #629                // String %currency%
       132: aload_0
       133: ldc           #147                // String currency
       135: aload_2
       136: invokevirtual #631                // Method ext/mods/gameserver/communitybbs/custom/model/Function.getCurrency:()Ljava/lang/String;
       139: aload         5
       141: invokevirtual #447                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
       144: invokevirtual #609                // Method getFilters:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
       147: invokevirtual #392                // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
       150: astore        4
       152: aload_3
       153: aload         4
       155: invokevirtual #440                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       158: pop
       159: aload_3
       160: invokevirtual #447                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
       163: areturn
      LineNumberTable:
        line 382: 0
        line 384: 8
        line 386: 18
        line 387: 41
        line 389: 64
        line 390: 75
        line 391: 110
        line 393: 127
        line 395: 152
        line 396: 159
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          110      14     7 currency   Ljava/lang/String;
            0     164     0  this   Lext/mods/gameserver/communitybbs/custom/AuctionBBSManager;
            0     164     1 player   Lext/mods/gameserver/model/actor/Player;
            0     164     2 function   Lext/mods/gameserver/communitybbs/custom/model/Function;
            8     156     3    sb   Ljava/lang/StringBuilder;
           18     146     4 content   Ljava/lang/String;
           75      89     5 currencyOptions   Ljava/lang/StringBuilder;
      StackMapTable: number_of_entries = 2
        frame_type = 255 /* full_frame */
          offset_delta = 88
          locals = [ class ext/mods/gameserver/communitybbs/custom/AuctionBBSManager, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/communitybbs/custom/model/Function, class java/lang/StringBuilder, class java/lang/String, class java/lang/StringBuilder, class java/util/Iterator ]
          stack = []
        frame_type = 250 /* chop */
          offset_delta = 38

  public java.lang.String getFilters(java.lang.String, java.lang.String, java.lang.String);
    descriptor: (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=10, args_size=4
         0: new           #351                // class java/lang/StringBuilder
         3: dup
         4: invokespecial #353                // Method java/lang/StringBuilder."<init>":()V
         7: astore        4
         9: aload         4
        11: ldc_w         #634                // String <table width=180>
        14: invokevirtual #440                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        17: pop
        18: aload_3
        19: ldc_w         #627                // String ,
        22: invokevirtual #636                // Method java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
        25: astore        5
        27: aload         5
        29: arraylength
        30: istore        6
        32: iconst_0
        33: istore        7
        35: iload         7
        37: iload         6
        39: if_icmpge     245
        42: aload         5
        44: iload         7
        46: aaload
        47: astore        8
        49: aload_2
        50: invokevirtual #640                // Method java/lang/String.toUpperCase:()Ljava/lang/String;
        53: aload         8
        55: ldc           #101                // String
        57: ldc           #113                // String
        59: invokevirtual #643                // Method java/lang/String.replaceAll:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        62: invokevirtual #640                // Method java/lang/String.toUpperCase:()Ljava/lang/String;
        65: invokevirtual #121                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
        68: ifeq          77
        71: ldc_w         #646                // String width=12 height=12 back=L2UI.CheckBox_checked fore=L2UI.CheckBox_checked
        74: goto          92
        77: aload_1
        78: aload         8
        80: ldc           #101                // String
        82: ldc           #113                // String
        84: invokevirtual #643                // Method java/lang/String.replaceAll:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        87: invokedynamic #648,  0            // InvokeDynamic #24:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        92: astore        9
        94: aload         8
        96: ldc_w         #649                // String NONE
        99: invokevirtual #121                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       102: ifne          160
       105: aload         8
       107: ldc_w         #651                // String D
       110: invokevirtual #121                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       113: ifne          160
       116: aload         8
       118: ldc_w         #653                // String C
       121: invokevirtual #121                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       124: ifne          160
       127: aload         8
       129: ldc_w         #655                // String B
       132: invokevirtual #121                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       135: ifne          160
       138: aload         8
       140: ldc_w         #657                // String A
       143: invokevirtual #121                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       146: ifne          160
       149: aload         8
       151: ldc_w         #659                // String S
       154: invokevirtual #121                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       157: ifeq          186
       160: aload         8
       162: ldc_w         #649                // String NONE
       165: invokevirtual #121                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       168: ifeq          177
       171: ldc_w         #661                // String No-Grade
       174: goto          184
       177: aload         8
       179: invokedynamic #663,  0            // InvokeDynamic #25:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       184: astore        8
       186: aload         8
       188: ldc_w         #664                // String Enchant
       191: invokevirtual #121                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       194: ifeq          202
       197: ldc_w         #666                // String Enchant Scroll
       200: astore        8
       202: aload         4
       204: iconst_5
       205: anewarray     #81                 // class java/lang/Object
       208: dup
       209: iconst_0
       210: ldc_w         #668                // String <tr><td width=20 align=right><button
       213: aastore
       214: dup
       215: iconst_1
       216: aload         9
       218: aastore
       219: dup
       220: iconst_2
       221: ldc_w         #670                // String ></td><td width=160 align=left>
       224: aastore
       225: dup
       226: iconst_3
       227: aload         8
       229: aastore
       230: dup
       231: iconst_4
       232: ldc_w         #672                // String </td></tr>
       235: aastore
       236: invokestatic  #674                // Method ext/mods/commons/lang/StringUtil.append:(Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
       239: iinc          7, 1
       242: goto          35
       245: aload         4
       247: ldc_w         #677                // String </table>
       250: invokevirtual #440                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       253: pop
       254: aload         4
       256: invokevirtual #447                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
       259: areturn
      LineNumberTable:
        line 402: 0
        line 403: 9
        line 404: 18
        line 406: 49
        line 407: 94
        line 408: 160
        line 410: 186
        line 411: 197
        line 413: 202
        line 404: 239
        line 415: 245
        line 416: 254
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           94     145     9 typeAll   Ljava/lang/String;
           49     190     8 split   Ljava/lang/String;
            0     260     0  this   Lext/mods/gameserver/communitybbs/custom/AuctionBBSManager;
            0     260     1 bypass   Ljava/lang/String;
            0     260     2 function   Ljava/lang/String;
            0     260     3  type   Ljava/lang/String;
            9     251     4    sb   Ljava/lang/StringBuilder;
      StackMapTable: number_of_entries = 9
        frame_type = 255 /* full_frame */
          offset_delta = 35
          locals = [ class ext/mods/gameserver/communitybbs/custom/AuctionBBSManager, class java/lang/String, class java/lang/String, class java/lang/String, class java/lang/StringBuilder, class "[Ljava/lang/String;", int, int ]
          stack = []
        frame_type = 252 /* append */
          offset_delta = 41
          locals = [ class java/lang/String ]
        frame_type = 78 /* same_locals_1_stack_item */
          stack = [ class java/lang/String ]
        frame_type = 252 /* append */
          offset_delta = 67
          locals = [ class java/lang/String ]
        frame_type = 16 /* same */
        frame_type = 70 /* same_locals_1_stack_item */
          stack = [ class java/lang/String ]
        frame_type = 1 /* same */
        frame_type = 15 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 42
          locals = [ class ext/mods/gameserver/communitybbs/custom/AuctionBBSManager, class java/lang/String, class java/lang/String, class java/lang/String, class java/lang/StringBuilder ]
          stack = []

  public java.lang.String getInventory(ext.mods.gameserver.model.actor.Player, int);
    descriptor: (Lext/mods/gameserver/model/actor/Player;I)Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=8, locals=12, args_size=3
         0: aload_0
         1: aload_1
         2: invokevirtual #115                // Method getFunction:(Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/communitybbs/custom/model/Function;
         5: invokevirtual #286                // Method ext/mods/gameserver/communitybbs/custom/model/Function.getItemId:()I
         8: istore_3
         9: new           #351                // class java/lang/StringBuilder
        12: dup
        13: invokespecial #353                // Method java/lang/StringBuilder."<init>":()V
        16: astore        4
        18: aload_1
        19: invokevirtual #212                // Method ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
        22: iload_3
        23: invokevirtual #289                // Method ext/mods/gameserver/model/itemcontainer/PcInventory.getItemByObjectId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
        26: astore        5
        28: aload         5
        30: ifnull        556
        33: invokestatic  #679                // Method ext/mods/gameserver/data/xml/ItemData.getInstance:()Lext/mods/gameserver/data/xml/ItemData;
        36: aload         5
        38: invokevirtual #684                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
        41: invokevirtual #685                // Method ext/mods/gameserver/data/xml/ItemData.getTemplate:(I)Lext/mods/gameserver/model/item/kind/Item;
        44: astore        6
        46: aload         5
        48: invokevirtual #689                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getName:()Ljava/lang/String;
        51: astore        7
        53: aload         7
        55: invokevirtual #158                // Method java/lang/String.length:()I
        58: bipush        44
        60: if_icmplt     78
        63: aload         7
        65: iconst_0
        66: bipush        42
        68: invokevirtual #579                // Method java/lang/String.substring:(II)Ljava/lang/String;
        71: invokedynamic #582,  0            // InvokeDynamic #20:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
        76: astore        7
        78: aload         5
        80: invokevirtual #690                // Method ext/mods/gameserver/model/item/instance/ItemInstance.isEquipable:()Z
        83: ifeq          118
        86: aload         7
        88: ldc_w         #586                // String  -
        91: invokevirtual #588                // Method java/lang/String.contains:(Ljava/lang/CharSequence;)Z
        94: ifeq          118
        97: aload         5
        99: invokevirtual #689                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getName:()Ljava/lang/String;
       102: ldc_w         #586                // String  -
       105: ldc_w         #592                // String </font> - <font color=LEVEL>
       108: invokevirtual #392                // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
       111: invokedynamic #594,  0            // InvokeDynamic #21:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       116: astore        7
       118: aload_0
       119: aload_1
       120: ldc_w         #691                // String inventory-item.htm
       123: invokevirtual #313                // Method getContent:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Ljava/lang/String;
       126: astore        8
       128: aload         8
       130: ldc_w         #431                // String %button%
       133: iload_2
       134: invokedynamic #693,  0            // InvokeDynamic #26:makeConcatWithConstants:(I)Ljava/lang/String;
       139: invokevirtual #392                // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
       142: astore        8
       144: aload         8
       146: ldc_w         #695                // String %etc%
       149: aload         5
       151: invokevirtual #697                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItem:()Lext/mods/gameserver/model/item/kind/Item;
       154: astore        10
       156: aload         10
       158: instanceof    #698                // class ext/mods/gameserver/model/item/kind/EtcItem
       161: ifeq          195
       164: aload         10
       166: checkcast     #698                // class ext/mods/gameserver/model/item/kind/EtcItem
       169: astore        9
       171: aload         9
       173: invokevirtual #700                // Method ext/mods/gameserver/model/item/kind/EtcItem.getItemType:()Lext/mods/gameserver/enums/items/EtcItemType;
       176: getstatic     #703                // Field ext/mods/gameserver/enums/items/EtcItemType.PET_COLLAR:Lext/mods/gameserver/enums/items/EtcItemType;
       179: if_acmpne     195
       182: aload         5
       184: invokevirtual #709                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getEnchantLevel:()I
       187: invokedynamic #712,  0            // InvokeDynamic #27:makeConcatWithConstants:(I)Ljava/lang/String;
       192: goto          230
       195: aload         5
       197: invokevirtual #713                // Method ext/mods/gameserver/model/item/instance/ItemInstance.isStackable:()Z
       200: ifeq          220
       203: aload         5
       205: invokevirtual #714                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getCount:()I
       208: i2l
       209: invokestatic  #228                // Method ext/mods/commons/lang/StringUtil.formatNumber:(J)Ljava/lang/String;
       212: invokedynamic #717,  0            // InvokeDynamic #28:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       217: goto          230
       220: aload         5
       222: invokevirtual #709                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getEnchantLevel:()I
       225: invokedynamic #718,  0            // InvokeDynamic #29:makeConcatWithConstants:(I)Ljava/lang/String;
       230: invokevirtual #392                // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
       233: astore        8
       235: aload         8
       237: ldc_w         #385                // String %icon%
       240: aload         6
       242: invokevirtual #387                // Method ext/mods/gameserver/model/item/kind/Item.getIcon:()Ljava/lang/String;
       245: invokevirtual #392                // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
       248: astore        8
       250: aload         8
       252: ldc_w         #719                // String %name%
       255: aload         7
       257: invokevirtual #392                // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
       260: astore        8
       262: aload         8
       264: ldc_w         #721                // String %auction_fee%
       267: getstatic     #560                // Field ext/mods/Config.AUCTION_FEE:I
       270: i2l
       271: invokestatic  #228                // Method ext/mods/commons/lang/StringUtil.formatNumber:(J)Ljava/lang/String;
       274: invokevirtual #392                // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
       277: astore        8
       279: aload         8
       281: ldc_w         #566                // String %auctionFeeName%
       284: getstatic     #568                // Field ext/mods/Config.AUCTION_ITEM_FEE_NAME:Ljava/lang/String;
       287: invokevirtual #392                // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
       290: astore        8
       292: aload         8
       294: ldc_w         #723                // String %format%
       297: new           #462                // class java/text/SimpleDateFormat
       300: dup
       301: ldc_w         #464                // String dd-MM-yyyy HH:mm:ss
       304: invokespecial #466                // Method java/text/SimpleDateFormat."<init>":(Ljava/lang/String;)V
       307: invokestatic  #538                // Method java/lang/System.currentTimeMillis:()J
       310: getstatic     #725                // Field java/util/concurrent/TimeUnit.DAYS:Ljava/util/concurrent/TimeUnit;
       313: ldc2_w        #731                // long 7l
       316: invokevirtual #733                // Method java/util/concurrent/TimeUnit.toMillis:(J)J
       319: ladd
       320: invokestatic  #472                // Method java/lang/Long.valueOf:(J)Ljava/lang/Long;
       323: invokevirtual #477                // Method java/text/SimpleDateFormat.format:(Ljava/lang/Object;)Ljava/lang/String;
       326: invokevirtual #392                // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
       329: astore        8
       331: aload         8
       333: ldc_w         #407                // String %stackable%
       336: aload         5
       338: invokevirtual #713                // Method ext/mods/gameserver/model/item/instance/ItemInstance.isStackable:()Z
       341: ifeq          350
       344: ldc_w         #737                // String <edit var=quantity type=number width=180 height=12>
       347: goto          353
       350: ldc_w         #739                // String <font color=B09B79>1</font>
       353: invokevirtual #392                // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
       356: astore        8
       358: new           #351                // class java/lang/StringBuilder
       361: dup
       362: invokespecial #353                // Method java/lang/StringBuilder."<init>":()V
       365: astore        9
       367: invokestatic  #420                // Method ext/mods/gameserver/custom/data/AuctionCurrencies.getInstance:()Lext/mods/gameserver/custom/data/AuctionCurrencies;
       370: invokevirtual #620                // Method ext/mods/gameserver/custom/data/AuctionCurrencies.getCurrencyNames:()Ljava/util/Set;
       373: invokeinterface #624,  1          // InterfaceMethod java/util/Set.iterator:()Ljava/util/Iterator;
       378: astore        10
       380: aload         10
       382: invokeinterface #372,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       387: ifeq          430
       390: aload         10
       392: invokeinterface #377,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       397: checkcast     #122                // class java/lang/String
       400: astore        11
       402: aload         9
       404: invokevirtual #741                // Method java/lang/StringBuilder.length:()I
       407: ifle          419
       410: aload         9
       412: ldc_w         #742                // String ;
       415: invokevirtual #440                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       418: pop
       419: aload         9
       421: aload         11
       423: invokevirtual #440                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       426: pop
       427: goto          380
       430: aload         8
       432: ldc_w         #744                // String %currencyList%
       435: aload         9
       437: invokevirtual #392                // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
       440: astore        8
       442: aload         8
       444: ldc_w         #547                // String %price%
       447: aload         5
       449: invokevirtual #713                // Method ext/mods/gameserver/model/item/instance/ItemInstance.isStackable:()Z
       452: ifeq          474
       455: aload_1
       456: sipush        10218
       459: iconst_0
       460: anewarray     #81                 // class java/lang/Object
       463: invokevirtual #205                // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
       466: invokedynamic #412,  0            // InvokeDynamic #3:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       471: goto          476
       474: ldc           #113                // String
       476: invokevirtual #392                // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
       479: astore        8
       481: aload         8
       483: ldc_w         #746                // String %combobox%
       486: aload         9
       488: invokestatic  #748                // Method java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
       491: invokedynamic #750,  0            // InvokeDynamic #30:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       496: invokevirtual #392                // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
       499: astore        8
       501: aload         8
       503: ldc_w         #491                // String %button2%
       506: aload_1
       507: sipush        10217
       510: iconst_0
       511: anewarray     #81                 // class java/lang/Object
       514: invokevirtual #205                // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
       517: iload_2
       518: aload         5
       520: invokevirtual #713                // Method ext/mods/gameserver/model/item/instance/ItemInstance.isStackable:()Z
       523: ifeq          532
       526: ldc_w         #751                // String $quantity
       529: goto          535
       532: ldc_w         #753                // String 1
       535: invokedynamic #755,  0            // InvokeDynamic #31:makeConcatWithConstants:(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;
       540: invokevirtual #392                // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
       543: astore        8
       545: aload         4
       547: aload         8
       549: invokevirtual #440                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       552: pop
       553: goto          676
       556: iload_3
       557: iconst_m1
       558: if_icmpne     620
       561: aload_0
       562: aload_1
       563: ldc_w         #758                // String inventory-item1.htm
       566: invokevirtual #313                // Method getContent:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Ljava/lang/String;
       569: astore        6
       571: aload         6
       573: ldc_w         #431                // String %button%
       576: aload_1
       577: sipush        10227
       580: iconst_0
       581: anewarray     #81                 // class java/lang/Object
       584: invokevirtual #205                // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
       587: aload_1
       588: sipush        10228
       591: iconst_0
       592: anewarray     #81                 // class java/lang/Object
       595: invokevirtual #205                // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
       598: iload_2
       599: invokedynamic #760,  0            // InvokeDynamic #32:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;
       604: invokevirtual #392                // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
       607: astore        6
       609: aload         4
       611: aload         6
       613: invokevirtual #440                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       616: pop
       617: goto          676
       620: aload_0
       621: aload_1
       622: ldc_w         #763                // String inventory-item2.htm
       625: invokevirtual #313                // Method getContent:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Ljava/lang/String;
       628: astore        6
       630: aload         6
       632: ldc_w         #431                // String %button%
       635: aload_1
       636: sipush        10227
       639: iconst_0
       640: anewarray     #81                 // class java/lang/Object
       643: invokevirtual #205                // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
       646: aload_1
       647: sipush        10229
       650: iconst_0
       651: anewarray     #81                 // class java/lang/Object
       654: invokevirtual #205                // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
       657: iload_2
       658: invokedynamic #765,  0            // InvokeDynamic #33:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;
       663: invokevirtual #392                // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
       666: astore        6
       668: aload         4
       670: aload         6
       672: invokevirtual #440                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       675: pop
       676: aload         4
       678: invokevirtual #447                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
       681: areturn
      LineNumberTable:
        line 421: 0
        line 422: 9
        line 423: 18
        line 425: 28
        line 427: 33
        line 428: 46
        line 429: 53
        line 430: 63
        line 431: 78
        line 432: 97
        line 434: 118
        line 436: 128
        line 437: 144
        line 438: 235
        line 439: 250
        line 440: 262
        line 441: 279
        line 442: 292
        line 443: 331
        line 445: 358
        line 446: 367
        line 448: 402
        line 449: 410
        line 450: 419
        line 451: 427
        line 453: 430
        line 454: 442
        line 455: 481
        line 456: 501
        line 457: 545
        line 458: 553
        line 461: 556
        line 463: 561
        line 464: 571
        line 465: 609
        line 466: 617
        line 469: 620
        line 470: 630
        line 471: 668
        line 475: 676
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          171      24     9   etc   Lext/mods/gameserver/model/item/kind/EtcItem;
          402      25    11 currency   Ljava/lang/String;
           46     507     6 items   Lext/mods/gameserver/model/item/kind/Item;
           53     500     7  name   Ljava/lang/String;
          128     425     8 content   Ljava/lang/String;
          367     186     9 currencyList   Ljava/lang/StringBuilder;
          571      46     6 auctionTemplate   Ljava/lang/String;
          630      46     6 auctionTemplate   Ljava/lang/String;
            0     682     0  this   Lext/mods/gameserver/communitybbs/custom/AuctionBBSManager;
            0     682     1 player   Lext/mods/gameserver/model/actor/Player;
            0     682     2  page   I
            9     673     3 itemId   I
           18     664     4    sb   Ljava/lang/StringBuilder;
           28     654     5  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
      StackMapTable: number_of_entries = 17
        frame_type = 255 /* full_frame */
          offset_delta = 78
          locals = [ class ext/mods/gameserver/communitybbs/custom/AuctionBBSManager, class ext/mods/gameserver/model/actor/Player, int, int, class java/lang/StringBuilder, class ext/mods/gameserver/model/item/instance/ItemInstance, class ext/mods/gameserver/model/item/kind/Item, class java/lang/String ]
          stack = []
        frame_type = 39 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 76
          locals = [ class ext/mods/gameserver/communitybbs/custom/AuctionBBSManager, class ext/mods/gameserver/model/actor/Player, int, int, class java/lang/StringBuilder, class ext/mods/gameserver/model/item/instance/ItemInstance, class ext/mods/gameserver/model/item/kind/Item, class java/lang/String, class java/lang/String ]
          stack = [ class java/lang/String, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 24
          locals = [ class ext/mods/gameserver/communitybbs/custom/AuctionBBSManager, class ext/mods/gameserver/model/actor/Player, int, int, class java/lang/StringBuilder, class ext/mods/gameserver/model/item/instance/ItemInstance, class ext/mods/gameserver/model/item/kind/Item, class java/lang/String, class java/lang/String ]
          stack = [ class java/lang/String, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 9
          locals = [ class ext/mods/gameserver/communitybbs/custom/AuctionBBSManager, class ext/mods/gameserver/model/actor/Player, int, int, class java/lang/StringBuilder, class ext/mods/gameserver/model/item/instance/ItemInstance, class ext/mods/gameserver/model/item/kind/Item, class java/lang/String, class java/lang/String ]
          stack = [ class java/lang/String, class java/lang/String, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 119
          locals = [ class ext/mods/gameserver/communitybbs/custom/AuctionBBSManager, class ext/mods/gameserver/model/actor/Player, int, int, class java/lang/StringBuilder, class ext/mods/gameserver/model/item/instance/ItemInstance, class ext/mods/gameserver/model/item/kind/Item, class java/lang/String, class java/lang/String ]
          stack = [ class java/lang/String, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 2
          locals = [ class ext/mods/gameserver/communitybbs/custom/AuctionBBSManager, class ext/mods/gameserver/model/actor/Player, int, int, class java/lang/StringBuilder, class ext/mods/gameserver/model/item/instance/ItemInstance, class ext/mods/gameserver/model/item/kind/Item, class java/lang/String, class java/lang/String ]
          stack = [ class java/lang/String, class java/lang/String, class java/lang/String ]
        frame_type = 253 /* append */
          offset_delta = 26
          locals = [ class java/lang/StringBuilder, class java/util/Iterator ]
        frame_type = 252 /* append */
          offset_delta = 38
          locals = [ class java/lang/String ]
        frame_type = 249 /* chop */
          offset_delta = 10
        frame_type = 255 /* full_frame */
          offset_delta = 43
          locals = [ class ext/mods/gameserver/communitybbs/custom/AuctionBBSManager, class ext/mods/gameserver/model/actor/Player, int, int, class java/lang/StringBuilder, class ext/mods/gameserver/model/item/instance/ItemInstance, class ext/mods/gameserver/model/item/kind/Item, class java/lang/String, class java/lang/String, class java/lang/StringBuilder ]
          stack = [ class java/lang/String, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 1
          locals = [ class ext/mods/gameserver/communitybbs/custom/AuctionBBSManager, class ext/mods/gameserver/model/actor/Player, int, int, class java/lang/StringBuilder, class ext/mods/gameserver/model/item/instance/ItemInstance, class ext/mods/gameserver/model/item/kind/Item, class java/lang/String, class java/lang/String, class java/lang/StringBuilder ]
          stack = [ class java/lang/String, class java/lang/String, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 55
          locals = [ class ext/mods/gameserver/communitybbs/custom/AuctionBBSManager, class ext/mods/gameserver/model/actor/Player, int, int, class java/lang/StringBuilder, class ext/mods/gameserver/model/item/instance/ItemInstance, class ext/mods/gameserver/model/item/kind/Item, class java/lang/String, class java/lang/String, class java/lang/StringBuilder ]
          stack = [ class java/lang/String, class java/lang/String, class java/lang/String, int ]
        frame_type = 255 /* full_frame */
          offset_delta = 2
          locals = [ class ext/mods/gameserver/communitybbs/custom/AuctionBBSManager, class ext/mods/gameserver/model/actor/Player, int, int, class java/lang/StringBuilder, class ext/mods/gameserver/model/item/instance/ItemInstance, class ext/mods/gameserver/model/item/kind/Item, class java/lang/String, class java/lang/String, class java/lang/StringBuilder ]
          stack = [ class java/lang/String, class java/lang/String, class java/lang/String, int, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 20
          locals = [ class ext/mods/gameserver/communitybbs/custom/AuctionBBSManager, class ext/mods/gameserver/model/actor/Player, int, int, class java/lang/StringBuilder, class ext/mods/gameserver/model/item/instance/ItemInstance ]
          stack = []
        frame_type = 63 /* same */
        frame_type = 55 /* same */

  public boolean selectItem(ext.mods.gameserver.model.actor.Player, ext.mods.gameserver.model.item.instance.ItemInstance);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/item/instance/ItemInstance;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=7, locals=4, args_size=3
         0: aload_0
         1: aload_1
         2: invokevirtual #115                // Method getFunction:(Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/communitybbs/custom/model/Function;
         5: astore_3
         6: aload_3
         7: invokevirtual #286                // Method ext/mods/gameserver/communitybbs/custom/model/Function.getItemId:()I
        10: iconst_m1
        11: if_icmpeq     16
        14: iconst_0
        15: ireturn
        16: aload_0
        17: getfield      #10                 // Field _auctions:Ljava/util/Map;
        20: invokeinterface #766,  1          // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
        25: invokeinterface #323,  1          // InterfaceMethod java/util/Collection.stream:()Ljava/util/stream/Stream;
        30: aload_1
        31: invokedynamic #769,  0            // InvokeDynamic #34:test:(Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/Predicate;
        36: invokeinterface #770,  2          // InterfaceMethod java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
        41: invokeinterface #776,  1          // InterfaceMethod java/util/stream/Stream.count:()J
        46: getstatic     #779                // Field ext/mods/Config.AUCTION_LIMIT_ITEM:I
        49: i2l
        50: lcmp
        51: iflt          80
        54: aload_1
        55: aload_1
        56: sipush        10204
        59: iconst_1
        60: anewarray     #81                 // class java/lang/Object
        63: dup
        64: iconst_0
        65: getstatic     #779                // Field ext/mods/Config.AUCTION_LIMIT_ITEM:I
        68: invokestatic  #89                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        71: aastore
        72: invokevirtual #205                // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
        75: invokevirtual #209                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
        78: iconst_1
        79: ireturn
        80: aload_2
        81: invokevirtual #684                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
        84: bipush        57
        86: if_icmpeq     103
        89: aload_2
        90: invokevirtual #782                // Method ext/mods/gameserver/model/item/instance/ItemInstance.isQuestItem:()Z
        93: ifne          103
        96: aload_2
        97: invokevirtual #785                // Method ext/mods/gameserver/model/item/instance/ItemInstance.isHeroItem:()Z
       100: ifeq          127
       103: aload_1
       104: aload_1
       105: sipush        10205
       108: iconst_1
       109: anewarray     #81                 // class java/lang/Object
       112: dup
       113: iconst_0
       114: aload_2
       115: invokevirtual #689                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getName:()Ljava/lang/String;
       118: aastore
       119: invokevirtual #205                // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
       122: invokevirtual #209                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       125: iconst_1
       126: ireturn
       127: aload_3
       128: aload_2
       129: invokevirtual #299                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getObjectId:()I
       132: invokevirtual #263                // Method ext/mods/gameserver/communitybbs/custom/model/Function.setItemId:(I)V
       135: aload_0
       136: aload_1
       137: iconst_1
       138: aload_3
       139: invokevirtual #308                // Method sendIndexMine:(Lext/mods/gameserver/model/actor/Player;ILext/mods/gameserver/communitybbs/custom/model/Function;)V
       142: iconst_1
       143: ireturn
      LineNumberTable:
        line 480: 0
        line 481: 6
        line 482: 14
        line 484: 16
        line 486: 54
        line 487: 78
        line 490: 80
        line 492: 103
        line 493: 125
        line 496: 127
        line 497: 135
        line 499: 142
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     144     0  this   Lext/mods/gameserver/communitybbs/custom/AuctionBBSManager;
            0     144     1 player   Lext/mods/gameserver/model/actor/Player;
            0     144     2  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
            6     138     3 function   Lext/mods/gameserver/communitybbs/custom/model/Function;
      StackMapTable: number_of_entries = 4
        frame_type = 252 /* append */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/communitybbs/custom/model/Function ]
        frame_type = 63 /* same */
        frame_type = 22 /* same */
        frame_type = 23 /* same */

  public void sellItem(ext.mods.gameserver.model.actor.Player, int, int, java.lang.String, int);
    descriptor: (Lext/mods/gameserver/model/actor/Player;IILjava/lang/String;I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=8, locals=9, args_size=6
         0: aload_1
         1: invokevirtual #212                // Method ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
         4: iload_2
         5: invokevirtual #289                // Method ext/mods/gameserver/model/itemcontainer/PcInventory.getItemByObjectId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
         8: astore        6
        10: aload         6
        12: ifnonnull     31
        15: aload_1
        16: aload_1
        17: sipush        10206
        20: iconst_0
        21: anewarray     #81                 // class java/lang/Object
        24: invokevirtual #205                // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
        27: invokevirtual #209                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
        30: return
        31: iload_3
        32: ifeq          44
        35: aload         6
        37: invokevirtual #714                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getCount:()I
        40: iload_3
        41: if_icmpge     60
        44: aload_1
        45: aload_1
        46: sipush        10207
        49: iconst_0
        50: anewarray     #81                 // class java/lang/Object
        53: invokevirtual #205                // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
        56: invokevirtual #209                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
        59: return
        60: iload         5
        62: ifeq          95
        65: ldc_w         #788                // int 2147483647
        68: aload         6
        70: invokevirtual #714                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getCount:()I
        73: idiv
        74: iload         5
        76: if_icmplt     95
        79: iload         5
        81: aload         6
        83: invokevirtual #714                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getCount:()I
        86: imul
        87: i2l
        88: ldc2_w        #789                // long 2147483647l
        91: lcmp
        92: ifle          111
        95: aload_1
        96: aload_1
        97: sipush        10208
       100: iconst_0
       101: anewarray     #81                 // class java/lang/Object
       104: invokevirtual #205                // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
       107: invokevirtual #209                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       110: return
       111: invokestatic  #420                // Method ext/mods/gameserver/custom/data/AuctionCurrencies.getInstance:()Lext/mods/gameserver/custom/data/AuctionCurrencies;
       114: aload         4
       116: invokevirtual #791                // Method ext/mods/gameserver/custom/data/AuctionCurrencies.getCurrencyId:(Ljava/lang/String;)I
       119: istore        7
       121: iload         7
       123: iconst_m1
       124: if_icmpne     139
       127: aload_1
       128: aload         4
       130: invokedynamic #794,  0            // InvokeDynamic #35:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       135: invokevirtual #209                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       138: return
       139: aload_1
       140: getstatic     #795                // Field ext/mods/Config.AUCTION_ITEM_FEE:I
       143: getstatic     #560                // Field ext/mods/Config.AUCTION_FEE:I
       146: iconst_1
       147: invokevirtual #798                // Method ext/mods/gameserver/model/actor/Player.destroyItemByItemId:(IIZ)Z
       150: ifne          185
       153: aload_1
       154: aload_1
       155: sipush        10209
       158: iconst_2
       159: anewarray     #81                 // class java/lang/Object
       162: dup
       163: iconst_0
       164: getstatic     #560                // Field ext/mods/Config.AUCTION_FEE:I
       167: i2l
       168: invokestatic  #228                // Method ext/mods/commons/lang/StringUtil.formatNumber:(J)Ljava/lang/String;
       171: aastore
       172: dup
       173: iconst_1
       174: getstatic     #568                // Field ext/mods/Config.AUCTION_ITEM_FEE_NAME:Ljava/lang/String;
       177: aastore
       178: invokevirtual #205                // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
       181: invokevirtual #209                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       184: return
       185: aload_1
       186: iload_2
       187: iload_3
       188: iconst_1
       189: invokevirtual #802                // Method ext/mods/gameserver/model/actor/Player.destroyItem:(IIZ)Z
       192: ifne          211
       195: aload_1
       196: aload_1
       197: sipush        10206
       200: iconst_0
       201: anewarray     #81                 // class java/lang/Object
       204: invokevirtual #205                // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
       207: invokevirtual #209                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       210: return
       211: new           #45                 // class ext/mods/gameserver/communitybbs/custom/model/Auction
       214: dup
       215: aload_1
       216: invokevirtual #430                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
       219: aload         6
       221: invokevirtual #684                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
       224: iload_3
       225: aload         6
       227: invokevirtual #709                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getEnchantLevel:()I
       230: iload         7
       232: iload         5
       234: invokespecial #805                // Method ext/mods/gameserver/communitybbs/custom/model/Auction."<init>":(IIIIII)V
       237: astore        8
       239: aload_0
       240: getfield      #10                 // Field _auctions:Ljava/util/Map;
       243: aload         8
       245: invokevirtual #434                // Method ext/mods/gameserver/communitybbs/custom/model/Auction.getId:()I
       248: invokestatic  #89                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       251: aload         8
       253: invokeinterface #808,  3          // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
       258: pop
       259: aload         8
       261: invokevirtual #812                // Method ext/mods/gameserver/communitybbs/custom/model/Auction.store:()V
       264: aload_1
       265: aload_1
       266: sipush        10210
       269: iconst_1
       270: anewarray     #81                 // class java/lang/Object
       273: dup
       274: iconst_0
       275: aload         6
       277: invokevirtual #689                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getName:()Ljava/lang/String;
       280: aastore
       281: invokevirtual #205                // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
       284: invokevirtual #209                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       287: aload_1
       288: new           #266                // class ext/mods/gameserver/network/serverpackets/ItemList
       291: dup
       292: aload_1
       293: iconst_0
       294: invokespecial #268                // Method ext/mods/gameserver/network/serverpackets/ItemList."<init>":(Lext/mods/gameserver/model/actor/Player;Z)V
       297: invokevirtual #271                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       300: return
      LineNumberTable:
        line 504: 0
        line 505: 10
        line 507: 15
        line 508: 30
        line 511: 31
        line 513: 44
        line 514: 59
        line 517: 60
        line 519: 95
        line 520: 110
        line 523: 111
        line 524: 121
        line 526: 127
        line 527: 138
        line 530: 139
        line 532: 153
        line 533: 184
        line 536: 185
        line 538: 195
        line 539: 210
        line 542: 211
        line 543: 239
        line 544: 259
        line 546: 264
        line 547: 287
        line 548: 300
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     301     0  this   Lext/mods/gameserver/communitybbs/custom/AuctionBBSManager;
            0     301     1 player   Lext/mods/gameserver/model/actor/Player;
            0     301     2 itemId   I
            0     301     3 quantity   I
            0     301     4 currency   Ljava/lang/String;
            0     301     5 price   I
           10     291     6  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
          121     180     7 costId   I
          239      62     8 auction   Lext/mods/gameserver/communitybbs/custom/model/Auction;
      StackMapTable: number_of_entries = 8
        frame_type = 252 /* append */
          offset_delta = 31
          locals = [ class ext/mods/gameserver/model/item/instance/ItemInstance ]
        frame_type = 12 /* same */
        frame_type = 15 /* same */
        frame_type = 34 /* same */
        frame_type = 15 /* same */
        frame_type = 252 /* append */
          offset_delta = 27
          locals = [ int ]
        frame_type = 45 /* same */
        frame_type = 25 /* same */

  public ext.mods.gameserver.communitybbs.custom.model.Auction getAuction(int);
    descriptor: (I)Lext/mods/gameserver/communitybbs/custom/model/Auction;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #10                 // Field _auctions:Ljava/util/Map;
         4: iload_1
         5: invokestatic  #89                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
         8: invokeinterface #815,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        13: checkcast     #45                 // class ext/mods/gameserver/communitybbs/custom/model/Auction
        16: areturn
      LineNumberTable:
        line 552: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      17     0  this   Lext/mods/gameserver/communitybbs/custom/AuctionBBSManager;
            0      17     1    id   I

  public java.util.Collection<ext.mods.gameserver.communitybbs.custom.model.Auction> getAuctions();
    descriptor: ()Ljava/util/Collection;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #10                 // Field _auctions:Ljava/util/Map;
         4: invokeinterface #766,  1          // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
         9: invokedynamic #819,  0            // InvokeDynamic #36:test:()Ljava/util/function/Predicate;
        14: invokeinterface #822,  2          // InterfaceMethod java/util/Collection.removeIf:(Ljava/util/function/Predicate;)Z
        19: pop
        20: aload_0
        21: getfield      #10                 // Field _auctions:Ljava/util/Map;
        24: invokeinterface #766,  1          // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
        29: areturn
      LineNumberTable:
        line 557: 0
        line 558: 20
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      30     0  this   Lext/mods/gameserver/communitybbs/custom/AuctionBBSManager;
    Signature: #954                         // ()Ljava/util/Collection<Lext/mods/gameserver/communitybbs/custom/model/Auction;>;

  public void addAuction(ext.mods.gameserver.communitybbs.custom.model.Auction);
    descriptor: (Lext/mods/gameserver/communitybbs/custom/model/Auction;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: getfield      #10                 // Field _auctions:Ljava/util/Map;
         4: aload_1
         5: invokevirtual #434                // Method ext/mods/gameserver/communitybbs/custom/model/Auction.getId:()I
         8: invokestatic  #89                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        11: aload_1
        12: invokeinterface #808,  3          // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        17: pop
        18: return
      LineNumberTable:
        line 563: 0
        line 564: 18
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      19     0  this   Lext/mods/gameserver/communitybbs/custom/AuctionBBSManager;
            0      19     1 auction   Lext/mods/gameserver/communitybbs/custom/model/Auction;

  public int nextId();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #10                 // Field _auctions:Ljava/util/Map;
         4: invokeinterface #826,  1          // InterfaceMethod java/util/Map.keySet:()Ljava/util/Set;
         9: invokeinterface #829,  1          // InterfaceMethod java/util/Set.stream:()Ljava/util/stream/Stream;
        14: invokedynamic #830,  0            // InvokeDynamic #37:compare:()Ljava/util/Comparator;
        19: invokeinterface #833,  2          // InterfaceMethod java/util/stream/Stream.max:(Ljava/util/Comparator;)Ljava/util/Optional;
        24: iconst_0
        25: invokestatic  #89                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        28: invokevirtual #837                // Method java/util/Optional.orElse:(Ljava/lang/Object;)Ljava/lang/Object;
        31: checkcast     #90                 // class java/lang/Integer
        34: invokevirtual #842                // Method java/lang/Integer.intValue:()I
        37: iconst_1
        38: iadd
        39: ireturn
      LineNumberTable:
        line 568: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      40     0  this   Lext/mods/gameserver/communitybbs/custom/AuctionBBSManager;

  public ext.mods.gameserver.communitybbs.custom.model.Function getFunction(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/communitybbs/custom/model/Function;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=2, args_size=2
         0: aload_0
         1: getfield      #16                 // Field _functions:Ljava/util/Map;
         4: aload_1
         5: invokevirtual #430                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
         8: invokestatic  #89                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        11: new           #132                // class ext/mods/gameserver/communitybbs/custom/model/Function
        14: dup
        15: invokespecial #845                // Method ext/mods/gameserver/communitybbs/custom/model/Function."<init>":()V
        18: invokeinterface #846,  3          // InterfaceMethod java/util/Map.putIfAbsent:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        23: pop
        24: aload_0
        25: getfield      #16                 // Field _functions:Ljava/util/Map;
        28: aload_1
        29: invokevirtual #430                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        32: invokestatic  #89                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        35: invokeinterface #815,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        40: checkcast     #132                // class ext/mods/gameserver/communitybbs/custom/model/Function
        43: areturn
      LineNumberTable:
        line 573: 0
        line 574: 24
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      44     0  this   Lext/mods/gameserver/communitybbs/custom/AuctionBBSManager;
            0      44     1 player   Lext/mods/gameserver/model/actor/Player;

  protected java.lang.String getContent(ext.mods.gameserver.model.actor.Player, java.lang.String);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Ljava/lang/String;
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=4, locals=3, args_size=3
         0: getstatic     #849                // Field ext/mods/Config.ENABLED_AUCTION:Z
         3: ifeq          27
         6: invokestatic  #853                // Method ext/mods/gameserver/data/HTMLData.getInstance:()Lext/mods/gameserver/data/HTMLData;
         9: aload_1
        10: invokevirtual #858                // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
        13: aload_0
        14: invokevirtual #862                // Method getFolder:()Ljava/lang/String;
        17: aload_2
        18: invokedynamic #865,  0            // InvokeDynamic #38:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        23: invokevirtual #866                // Method ext/mods/gameserver/data/HTMLData.getHtm:(Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;
        26: areturn
        27: invokestatic  #853                // Method ext/mods/gameserver/data/HTMLData.getInstance:()Lext/mods/gameserver/data/HTMLData;
        30: aload_1
        31: invokevirtual #858                // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
        34: aload_0
        35: invokevirtual #862                // Method getFolder:()Ljava/lang/String;
        38: invokedynamic #870,  0            // InvokeDynamic #39:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
        43: invokevirtual #866                // Method ext/mods/gameserver/data/HTMLData.getHtm:(Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;
        46: areturn
      LineNumberTable:
        line 579: 0
        line 580: 6
        line 582: 27
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      47     0  this   Lext/mods/gameserver/communitybbs/custom/AuctionBBSManager;
            0      47     1 player   Lext/mods/gameserver/model/actor/Player;
            0      47     2  file   Ljava/lang/String;
      StackMapTable: number_of_entries = 1
        frame_type = 27 /* same */

  protected java.lang.String getFolder();
    descriptor: ()Ljava/lang/String;
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=1, locals=1, args_size=1
         0: ldc_w         #871                // String custom/auction/
         3: areturn
      LineNumberTable:
        line 588: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/communitybbs/custom/AuctionBBSManager;

  public static ext.mods.gameserver.communitybbs.custom.AuctionBBSManager getInstance();
    descriptor: ()Lext/mods/gameserver/communitybbs/custom/AuctionBBSManager;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #873                // Field ext/mods/gameserver/communitybbs/custom/AuctionBBSManager$SingletonHolder.INSTANCE:Lext/mods/gameserver/communitybbs/custom/AuctionBBSManager;
         3: areturn
      LineNumberTable:
        line 593: 0
}
SourceFile: "AuctionBBSManager.java"
NestMembers:
  ext/mods/gameserver/communitybbs/custom/AuctionBBSManager$SingletonHolder
BootstrapMethods:
  0: #1069 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #970 (Ljava/lang/Object;)Z
      #971 REF_invokeStatic ext/mods/gameserver/communitybbs/custom/AuctionBBSManager.lambda$sendIndex$0:(Lext/mods/gameserver/communitybbs/custom/model/Function;Lext/mods/gameserver/communitybbs/custom/model/Auction;)Z
      #974 (Lext/mods/gameserver/communitybbs/custom/model/Auction;)Z
  1: #1069 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #975 (Ljava/lang/Object;)Ljava/lang/Object;
      #976 REF_invokeVirtual ext/mods/gameserver/communitybbs/custom/model/Auction.getItemName:()Ljava/lang/String;
      #980 (Lext/mods/gameserver/communitybbs/custom/model/Auction;)Ljava/lang/String;
  2: #1069 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #975 (Ljava/lang/Object;)Ljava/lang/Object;
      #981 REF_invokeVirtual ext/mods/gameserver/communitybbs/custom/model/Auction.getPriceCount:()I
      #982 (Lext/mods/gameserver/communitybbs/custom/model/Auction;)Ljava/lang/Integer;
  3: #1076 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #984  \u0001
  4: #1076 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #986 <font color=5A5A5A>\u0001</font>
  5: #1076 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #988 <img height=6><button value=\"\u0001\" action=\"bypass _friendlist_0_ \u0001 select \u0001\" width=65 height=19 back=L2UI_ch3.smallbutton2_down fore=L2UI_ch3.smallbutton2>
  6: #1076 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #990 \u0001\u0001
  7: #1076 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #992 \u0001 GMT +2
  8: #1076 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #994 <button value=\u0001 action=\"bypass _friendlist_0_ \u0001 purchase $quanity\" width=65 height=19 back=L2UI_ch3.smallbutton2_down fore=L2UI_ch3.smallbutton2>
  9: #1076 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #996 <button value=\u0001 action=\"bypass _friendlist_0_ \u0001 cancel\" width=65 height=19 back=L2UI_ch3.smallbutton2_down fore=L2UI_ch3.smallbutton2>
  10: #1076 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #998 <button value=\u0001 action=\"bypass _friendlist_0_ \u0001 purchase 1\" width=65 height=19 back=L2UI_ch3.smallbutton2_down fore=L2UI_ch3.smallbutton2>
  11: #1076 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1000 <button value=\u0001 action=\"bypass _friendlist_0_ 1 clear\" width=75 height=21 back=L2UI_ch3.bigbutton2 fore=L2UI_ch3.Btn1_normal>
  12: #1076 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1002 <button value=\u0001 action=\"bypass _friendlist_0_ 1 src $param\" width=75 height=21 back=L2UI_ch3.Btn1_normalOn fore=L2UI_ch3.Btn1_normal>
  13: #1069 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #970 (Ljava/lang/Object;)Z
      #1004 REF_invokeStatic ext/mods/gameserver/communitybbs/custom/AuctionBBSManager.lambda$sendIndexMine$0:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/communitybbs/custom/model/Auction;)Z
      #974 (Lext/mods/gameserver/communitybbs/custom/model/Auction;)Z
  14: #1069 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #975 (Ljava/lang/Object;)Ljava/lang/Object;
      #1007 REF_invokeVirtual ext/mods/gameserver/communitybbs/custom/model/Auction.getDuration:()J
      #1008 (Lext/mods/gameserver/communitybbs/custom/model/Auction;)Ljava/lang/Long;
  15: #1076 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1010 <font color=A3A3A3>\u0001</font> <font color=B09B79>(%s/9)</font>
  16: #1076 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1012 <img height=6>\u0001
  17: #1076 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1014 <font color=00FF00>\u0001 GMT +2</font>
  18: #1076 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1016 <font color=FF0000>\u0001</font>
  19: #1076 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1018 <img height=6><font color=A3A3A3>\u0001</font> \u0001
  20: #1076 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1020 \u0001..
  21: #1076 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1022 \u0001</font>
  22: #1076 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1024 \u0001 (\u0001)
  23: #1076 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1026 \u0001 <font color=B09B79>+\u0001</font>
  24: #1076 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1028 action=\"bypass _friendlist_0_ 1 \u0001 \u0001\" width=12 height=12 back=L2UI.CheckBox fore=L2UI.CheckBox
  25: #1076 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1030 \u0001-Grade
  26: #1076 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1032 <button value=\"Remove\" action=\"bypass _friendlist_0_mine \u0001 unselect\" width=65 height=20 back=L2UI_CH3.smallbutton2_down fore=L2UI_CH3.smallbutton2>
  27: #1076 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1034 <font color=A3A3A3>Level:</font> <font color=B09B79>\u0001</font></td>
  28: #1076 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1036 <font color=A3A3A3>Quantity:</font> \u0001</font></td>
  29: #1076 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1038 <font color=A3A3A3>Enchant Level:</font> <font color=B09B79>+\u0001</font></td>
  30: #1076 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1040 <combobox width=180 height=21 var=\"currency\" list=\u0001>
  31: #1076 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1042 <button value=\u0001 action=\"bypass _friendlist_0_mine \u0001 sell \u0001 $currency $price\" width=65 height=19 back=L2UI_ch3.smallbutton2_down fore=L2UI_ch3.smallbutton2>
  32: #1076 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1044 <button value=\u0001 action=\"bypass _friendlist_0_\" width=115 height=31 back=L2UI_ch3.bigbutton2 fore=L2UI_ch3.bigbutton2></td><td width=150 align=right valign=top><button value=\u0001 action=\"bypass _friendlist_0_mine \u0001 unselect\" width=65 height=20 back=L2UI_CH3.smallbutton2_down fore=L2UI_CH3.smallbutton2>
  33: #1076 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1046 <button value=\u0001 action=\"bypass _friendlist_0_\" width=115 height=31 back=L2UI_ch3.bigbutton2 fore=L2UI_ch3.bigbutton2></td><td width=150 align=right valign=top><button value=\u0001 action=\"bypass _friendlist_0_mine \u0001 toselect\" width=65 height=20 back=L2UI_CH3.smallbutton2_down fore=L2UI_CH3.smallbutton2>
  34: #1069 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #970 (Ljava/lang/Object;)Z
      #1048 REF_invokeStatic ext/mods/gameserver/communitybbs/custom/AuctionBBSManager.lambda$selectItem$0:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/communitybbs/custom/model/Auction;)Z
      #974 (Lext/mods/gameserver/communitybbs/custom/model/Auction;)Z
  35: #1076 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1051 Invalid currency: \u0001
  36: #1069 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #970 (Ljava/lang/Object;)Z
      #1053 REF_invokeStatic ext/mods/gameserver/communitybbs/custom/AuctionBBSManager.lambda$getAuctions$0:(Lext/mods/gameserver/communitybbs/custom/model/Auction;)Z
      #974 (Lext/mods/gameserver/communitybbs/custom/model/Auction;)Z
  37: #1069 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1056 (Ljava/lang/Object;Ljava/lang/Object;)I
      #1058 REF_invokeVirtual java/lang/Integer.compareTo:(Ljava/lang/Integer;)I
      #1063 (Ljava/lang/Integer;Ljava/lang/Integer;)I
  38: #1076 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1065 html/CommunityBoard/\u0001\u0001
  39: #1076 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1067 html/CommunityBoard/\u0001disabled.htm
InnerClasses:
  public static final #1088= #1084 of #1086; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
