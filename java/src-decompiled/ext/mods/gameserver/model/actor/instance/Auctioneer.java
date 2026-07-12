// Bytecode for: ext.mods.gameserver.model.actor.instance.Auctioneer
// File: ext\mods\gameserver\model\actor\instance\Auctioneer.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/actor/instance/Auctioneer.class
  Last modified 9 de jul de 2026; size 16403 bytes
  MD5 checksum b300da993660b9297644f96a589c8baf
  Compiled from "Auctioneer.java"
public final class ext.mods.gameserver.model.actor.instance.Auctioneer extends ext.mods.gameserver.model.actor.instance.Folk
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #60                         // ext/mods/gameserver/model/actor/instance/Auctioneer
  super_class: #2                         // ext/mods/gameserver/model/actor/instance/Folk
  interfaces: 0, fields: 1, methods: 6, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/gameserver/model/actor/instance/Folk."<init>":(ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
    #2 = Class              #4            // ext/mods/gameserver/model/actor/instance/Folk
    #3 = NameAndType        #5:#6         // "<init>":(ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
    #4 = Utf8               ext/mods/gameserver/model/actor/instance/Folk
    #5 = Utf8               <init>
    #6 = Utf8               (ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
    #7 = Class              #8            // java/util/StringTokenizer
    #8 = Utf8               java/util/StringTokenizer
    #9 = String             #10           //
   #10 = Utf8
   #11 = Methodref          #7.#12        // java/util/StringTokenizer."<init>":(Ljava/lang/String;Ljava/lang/String;)V
   #12 = NameAndType        #5:#13        // "<init>":(Ljava/lang/String;Ljava/lang/String;)V
   #13 = Utf8               (Ljava/lang/String;Ljava/lang/String;)V
   #14 = Methodref          #7.#15        // java/util/StringTokenizer.nextToken:()Ljava/lang/String;
   #15 = NameAndType        #16:#17       // nextToken:()Ljava/lang/String;
   #16 = Utf8               nextToken
   #17 = Utf8               ()Ljava/lang/String;
   #18 = Methodref          #7.#19        // java/util/StringTokenizer.hasMoreTokens:()Z
   #19 = NameAndType        #20:#21       // hasMoreTokens:()Z
   #20 = Utf8               hasMoreTokens
   #21 = Utf8               ()Z
   #22 = String             #23           //
   #23 = Utf8
   #24 = Methodref          #25.#26       // ext/mods/gameserver/data/manager/ClanHallManager.getInstance:()Lext/mods/gameserver/data/manager/ClanHallManager;
   #25 = Class              #27           // ext/mods/gameserver/data/manager/ClanHallManager
   #26 = NameAndType        #28:#29       // getInstance:()Lext/mods/gameserver/data/manager/ClanHallManager;
   #27 = Utf8               ext/mods/gameserver/data/manager/ClanHallManager
   #28 = Utf8               getInstance
   #29 = Utf8               ()Lext/mods/gameserver/data/manager/ClanHallManager;
   #30 = Methodref          #25.#31       // ext/mods/gameserver/data/manager/ClanHallManager.getAuctionableClanHalls:()Ljava/util/List;
   #31 = NameAndType        #32:#33       // getAuctionableClanHalls:()Ljava/util/List;
   #32 = Utf8               getAuctionableClanHalls
   #33 = Utf8               ()Ljava/util/List;
   #34 = InterfaceMethodref #35.#36       // java/util/List.isEmpty:()Z
   #35 = Class              #37           // java/util/List
   #36 = NameAndType        #38:#21       // isEmpty:()Z
   #37 = Utf8               java/util/List
   #38 = Utf8               isEmpty
   #39 = Fieldref           #40.#41       // ext/mods/gameserver/network/SystemMessageId.NO_CLAN_HALLS_UP_FOR_AUCTION:Lext/mods/gameserver/network/SystemMessageId;
   #40 = Class              #42           // ext/mods/gameserver/network/SystemMessageId
   #41 = NameAndType        #43:#44       // NO_CLAN_HALLS_UP_FOR_AUCTION:Lext/mods/gameserver/network/SystemMessageId;
   #42 = Utf8               ext/mods/gameserver/network/SystemMessageId
   #43 = Utf8               NO_CLAN_HALLS_UP_FOR_AUCTION
   #44 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
   #45 = Methodref          #46.#47       // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #46 = Class              #48           // ext/mods/gameserver/model/actor/Player
   #47 = NameAndType        #49:#50       // sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #48 = Utf8               ext/mods/gameserver/model/actor/Player
   #49 = Utf8               sendPacket
   #50 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
   #51 = String             #52           // list
   #52 = Utf8               list
   #53 = Methodref          #54.#55       // java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
   #54 = Class              #56           // java/lang/String
   #55 = NameAndType        #57:#58       // equalsIgnoreCase:(Ljava/lang/String;)Z
   #56 = Utf8               java/lang/String
   #57 = Utf8               equalsIgnoreCase
   #58 = Utf8               (Ljava/lang/String;)Z
   #59 = Methodref          #60.#61       // ext/mods/gameserver/model/actor/instance/Auctioneer.showAuctionsList:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
   #60 = Class              #62           // ext/mods/gameserver/model/actor/instance/Auctioneer
   #61 = NameAndType        #63:#64       // showAuctionsList:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
   #62 = Utf8               ext/mods/gameserver/model/actor/instance/Auctioneer
   #63 = Utf8               showAuctionsList
   #64 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
   #65 = String             #66           // bidding
   #66 = Utf8               bidding
   #67 = Methodref          #54.#36       // java/lang/String.isEmpty:()Z
   #68 = Methodref          #69.#70       // java/lang/Integer.parseInt:(Ljava/lang/String;)I
   #69 = Class              #71           // java/lang/Integer
   #70 = NameAndType        #72:#73       // parseInt:(Ljava/lang/String;)I
   #71 = Utf8               java/lang/Integer
   #72 = Utf8               parseInt
   #73 = Utf8               (Ljava/lang/String;)I
   #74 = Methodref          #25.#75       // ext/mods/gameserver/data/manager/ClanHallManager.getClanHall:(I)Lext/mods/gameserver/model/residence/clanhall/ClanHall;
   #75 = NameAndType        #76:#77       // getClanHall:(I)Lext/mods/gameserver/model/residence/clanhall/ClanHall;
   #76 = Utf8               getClanHall
   #77 = Utf8               (I)Lext/mods/gameserver/model/residence/clanhall/ClanHall;
   #78 = Methodref          #79.#80       // ext/mods/gameserver/model/residence/clanhall/ClanHall.getAuction:()Lext/mods/gameserver/model/residence/clanhall/Auction;
   #79 = Class              #81           // ext/mods/gameserver/model/residence/clanhall/ClanHall
   #80 = NameAndType        #82:#83       // getAuction:()Lext/mods/gameserver/model/residence/clanhall/Auction;
   #81 = Utf8               ext/mods/gameserver/model/residence/clanhall/ClanHall
   #82 = Utf8               getAuction
   #83 = Utf8               ()Lext/mods/gameserver/model/residence/clanhall/Auction;
   #84 = Methodref          #85.#86       // ext/mods/gameserver/model/residence/clanhall/Auction.getEndDate:()J
   #85 = Class              #87           // ext/mods/gameserver/model/residence/clanhall/Auction
   #86 = NameAndType        #88:#89       // getEndDate:()J
   #87 = Utf8               ext/mods/gameserver/model/residence/clanhall/Auction
   #88 = Utf8               getEndDate
   #89 = Utf8               ()J
   #90 = Methodref          #91.#92       // java/lang/System.currentTimeMillis:()J
   #91 = Class              #93           // java/lang/System
   #92 = NameAndType        #94:#89       // currentTimeMillis:()J
   #93 = Utf8               java/lang/System
   #94 = Utf8               currentTimeMillis
   #95 = Class              #96           // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
   #96 = Utf8               ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
   #97 = Methodref          #60.#98       // ext/mods/gameserver/model/actor/instance/Auctioneer.getObjectId:()I
   #98 = NameAndType        #99:#100      // getObjectId:()I
   #99 = Utf8               getObjectId
  #100 = Utf8               ()I
  #101 = Methodref          #95.#102      // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
  #102 = NameAndType        #5:#103       // "<init>":(I)V
  #103 = Utf8               (I)V
  #104 = Methodref          #46.#105      // ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
  #105 = NameAndType        #106:#107     // getLocale:()Ljava/util/Locale;
  #106 = Utf8               getLocale
  #107 = Utf8               ()Ljava/util/Locale;
  #108 = String             #109          // html/auction/AgitAuctionInfo.htm
  #109 = Utf8               html/auction/AgitAuctionInfo.htm
  #110 = Methodref          #95.#111      // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
  #111 = NameAndType        #112:#113     // setFile:(Ljava/util/Locale;Ljava/lang/String;)V
  #112 = Utf8               setFile
  #113 = Utf8               (Ljava/util/Locale;Ljava/lang/String;)V
  #114 = String             #115          // %AGIT_NAME%
  #115 = Utf8               %AGIT_NAME%
  #116 = Methodref          #79.#117      // ext/mods/gameserver/model/residence/clanhall/ClanHall.getName:()Ljava/lang/String;
  #117 = NameAndType        #118:#17      // getName:()Ljava/lang/String;
  #118 = Utf8               getName
  #119 = Methodref          #95.#120      // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
  #120 = NameAndType        #121:#13      // replace:(Ljava/lang/String;Ljava/lang/String;)V
  #121 = Utf8               replace
  #122 = String             #123          // %AGIT_SIZE%
  #123 = Utf8               %AGIT_SIZE%
  #124 = Methodref          #79.#125      // ext/mods/gameserver/model/residence/clanhall/ClanHall.getSize:()I
  #125 = NameAndType        #126:#100     // getSize:()I
  #126 = Utf8               getSize
  #127 = Methodref          #95.#128      // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
  #128 = NameAndType        #121:#129     // replace:(Ljava/lang/String;I)V
  #129 = Utf8               (Ljava/lang/String;I)V
  #130 = String             #131          // %AGIT_LEASE%
  #131 = Utf8               %AGIT_LEASE%
  #132 = Methodref          #79.#133      // ext/mods/gameserver/model/residence/clanhall/ClanHall.getLease:()I
  #133 = NameAndType        #134:#100     // getLease:()I
  #134 = Utf8               getLease
  #135 = String             #136          // %AGIT_LOCATION%
  #136 = Utf8               %AGIT_LOCATION%
  #137 = Methodref          #79.#138      // ext/mods/gameserver/model/residence/clanhall/ClanHall.getTownName:()Ljava/lang/String;
  #138 = NameAndType        #139:#17      // getTownName:()Ljava/lang/String;
  #139 = Utf8               getTownName
  #140 = String             #141          // %AGIT_AUCTION_END%
  #141 = Utf8               %AGIT_AUCTION_END%
  #142 = Class              #143          // java/text/SimpleDateFormat
  #143 = Utf8               java/text/SimpleDateFormat
  #144 = String             #145          // dd-MM-yyyy HH:mm
  #145 = Utf8               dd-MM-yyyy HH:mm
  #146 = Methodref          #142.#147     // java/text/SimpleDateFormat."<init>":(Ljava/lang/String;)V
  #147 = NameAndType        #5:#148       // "<init>":(Ljava/lang/String;)V
  #148 = Utf8               (Ljava/lang/String;)V
  #149 = Methodref          #150.#151     // java/lang/Long.valueOf:(J)Ljava/lang/Long;
  #150 = Class              #152          // java/lang/Long
  #151 = NameAndType        #153:#154     // valueOf:(J)Ljava/lang/Long;
  #152 = Utf8               java/lang/Long
  #153 = Utf8               valueOf
  #154 = Utf8               (J)Ljava/lang/Long;
  #155 = Methodref          #142.#156     // java/text/SimpleDateFormat.format:(Ljava/lang/Object;)Ljava/lang/String;
  #156 = NameAndType        #157:#158     // format:(Ljava/lang/Object;)Ljava/lang/String;
  #157 = Utf8               format
  #158 = Utf8               (Ljava/lang/Object;)Ljava/lang/String;
  #159 = String             #160          // %AGIT_AUCTION_REMAIN%
  #160 = Utf8               %AGIT_AUCTION_REMAIN%
  #161 = Long               3600000l
  #163 = Long               60000l
  #165 = Long               60l
  #167 = InvokeDynamic      #0:#168       // #0:makeConcatWithConstants:(JJ)Ljava/lang/String;
  #168 = NameAndType        #169:#170     // makeConcatWithConstants:(JJ)Ljava/lang/String;
  #169 = Utf8               makeConcatWithConstants
  #170 = Utf8               (JJ)Ljava/lang/String;
  #171 = String             #172          // %AGIT_AUCTION_MINBID%
  #172 = Utf8               %AGIT_AUCTION_MINBID%
  #173 = Methodref          #85.#174      // ext/mods/gameserver/model/residence/clanhall/Auction.getMinimumBid:()I
  #174 = NameAndType        #175:#100     // getMinimumBid:()I
  #175 = Utf8               getMinimumBid
  #176 = String             #177          // %AGIT_AUCTION_COUNT%
  #177 = Utf8               %AGIT_AUCTION_COUNT%
  #178 = Methodref          #85.#179      // ext/mods/gameserver/model/residence/clanhall/Auction.getBidders:()Ljava/util/Map;
  #179 = NameAndType        #180:#181     // getBidders:()Ljava/util/Map;
  #180 = Utf8               getBidders
  #181 = Utf8               ()Ljava/util/Map;
  #182 = InterfaceMethodref #183.#184     // java/util/Map.size:()I
  #183 = Class              #185          // java/util/Map
  #184 = NameAndType        #186:#100     // size:()I
  #185 = Utf8               java/util/Map
  #186 = Utf8               size
  #187 = String             #188          // %AGIT_AUCTION_DESC%
  #188 = Utf8               %AGIT_AUCTION_DESC%
  #189 = Methodref          #79.#190      // ext/mods/gameserver/model/residence/clanhall/ClanHall.getDesc:()Ljava/lang/String;
  #190 = NameAndType        #191:#17      // getDesc:()Ljava/lang/String;
  #191 = Utf8               getDesc
  #192 = String             #193          // %AGIT_LINK_BACK%
  #193 = Utf8               %AGIT_LINK_BACK%
  #194 = InvokeDynamic      #1:#195       // #1:makeConcatWithConstants:(I)Ljava/lang/String;
  #195 = NameAndType        #169:#196     // makeConcatWithConstants:(I)Ljava/lang/String;
  #196 = Utf8               (I)Ljava/lang/String;
  #197 = String             #198          // %AGIT_LINK_BIDLIST%
  #198 = Utf8               %AGIT_LINK_BIDLIST%
  #199 = Methodref          #79.#200      // ext/mods/gameserver/model/residence/clanhall/ClanHall.getId:()I
  #200 = NameAndType        #201:#100     // getId:()I
  #201 = Utf8               getId
  #202 = InvokeDynamic      #2:#203       // #2:makeConcatWithConstants:(II)Ljava/lang/String;
  #203 = NameAndType        #169:#204     // makeConcatWithConstants:(II)Ljava/lang/String;
  #204 = Utf8               (II)Ljava/lang/String;
  #205 = String             #206          // %AGIT_LINK_RE%
  #206 = Utf8               %AGIT_LINK_RE%
  #207 = InvokeDynamic      #3:#203       // #3:makeConcatWithConstants:(II)Ljava/lang/String;
  #208 = Methodref          #85.#209      // ext/mods/gameserver/model/residence/clanhall/Auction.getSeller:()Lext/mods/gameserver/model/residence/clanhall/Seller;
  #209 = NameAndType        #210:#211     // getSeller:()Lext/mods/gameserver/model/residence/clanhall/Seller;
  #210 = Utf8               getSeller
  #211 = Utf8               ()Lext/mods/gameserver/model/residence/clanhall/Seller;
  #212 = String             #213          // %OWNER_PLEDGE_NAME%
  #213 = Utf8               %OWNER_PLEDGE_NAME%
  #214 = String             #215          // %OWNER_PLEDGE_MASTER%
  #215 = Utf8               %OWNER_PLEDGE_MASTER%
  #216 = Methodref          #217.#218     // ext/mods/gameserver/model/residence/clanhall/Seller.getClanName:()Ljava/lang/String;
  #217 = Class              #219          // ext/mods/gameserver/model/residence/clanhall/Seller
  #218 = NameAndType        #220:#17      // getClanName:()Ljava/lang/String;
  #219 = Utf8               ext/mods/gameserver/model/residence/clanhall/Seller
  #220 = Utf8               getClanName
  #221 = Methodref          #217.#117     // ext/mods/gameserver/model/residence/clanhall/Seller.getName:()Ljava/lang/String;
  #222 = Methodref          #46.#223      // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #223 = NameAndType        #49:#224      // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #224 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #225 = Class              #226          // java/lang/Exception
  #226 = Utf8               java/lang/Exception
  #227 = String             #228          // location
  #228 = Utf8               location
  #229 = Methodref          #230.#231     // ext/mods/gameserver/data/xml/RestartPointData.getInstance:()Lext/mods/gameserver/data/xml/RestartPointData;
  #230 = Class              #232          // ext/mods/gameserver/data/xml/RestartPointData
  #231 = NameAndType        #28:#233      // getInstance:()Lext/mods/gameserver/data/xml/RestartPointData;
  #232 = Utf8               ext/mods/gameserver/data/xml/RestartPointData
  #233 = Utf8               ()Lext/mods/gameserver/data/xml/RestartPointData;
  #234 = Methodref          #230.#235     // ext/mods/gameserver/data/xml/RestartPointData.getAgitMap:(Lext/mods/gameserver/model/actor/Player;)Ljava/lang/String;
  #235 = NameAndType        #236:#237     // getAgitMap:(Lext/mods/gameserver/model/actor/Player;)Ljava/lang/String;
  #236 = Utf8               getAgitMap
  #237 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Ljava/lang/String;
  #238 = InvokeDynamic      #4:#239       // #4:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #239 = NameAndType        #169:#240     // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #240 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
  #241 = InvokeDynamic      #5:#195       // #5:makeConcatWithConstants:(I)Ljava/lang/String;
  #242 = String             #243          // start
  #243 = Utf8               start
  #244 = Methodref          #60.#245      // ext/mods/gameserver/model/actor/instance/Auctioneer.showChatWindow:(Lext/mods/gameserver/model/actor/Player;)V
  #245 = NameAndType        #246:#247     // showChatWindow:(Lext/mods/gameserver/model/actor/Player;)V
  #246 = Utf8               showChatWindow
  #247 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
  #248 = Methodref          #46.#249      // ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
  #249 = NameAndType        #250:#251     // getClan:()Lext/mods/gameserver/model/pledge/Clan;
  #250 = Utf8               getClan
  #251 = Utf8               ()Lext/mods/gameserver/model/pledge/Clan;
  #252 = Fieldref           #253.#254     // ext/mods/gameserver/enums/PrivilegeType.CHP_AUCTION:Lext/mods/gameserver/enums/PrivilegeType;
  #253 = Class              #255          // ext/mods/gameserver/enums/PrivilegeType
  #254 = NameAndType        #256:#257     // CHP_AUCTION:Lext/mods/gameserver/enums/PrivilegeType;
  #255 = Utf8               ext/mods/gameserver/enums/PrivilegeType
  #256 = Utf8               CHP_AUCTION
  #257 = Utf8               Lext/mods/gameserver/enums/PrivilegeType;
  #258 = Methodref          #46.#259      // ext/mods/gameserver/model/actor/Player.hasClanPrivileges:(Lext/mods/gameserver/enums/PrivilegeType;)Z
  #259 = NameAndType        #260:#261     // hasClanPrivileges:(Lext/mods/gameserver/enums/PrivilegeType;)Z
  #260 = Utf8               hasClanPrivileges
  #261 = Utf8               (Lext/mods/gameserver/enums/PrivilegeType;)Z
  #262 = String             #263          // 1
  #263 = Utf8               1
  #264 = Fieldref           #40.#265      // ext/mods/gameserver/network/SystemMessageId.CANNOT_PARTICIPATE_IN_AUCTION:Lext/mods/gameserver/network/SystemMessageId;
  #265 = NameAndType        #266:#44      // CANNOT_PARTICIPATE_IN_AUCTION:Lext/mods/gameserver/network/SystemMessageId;
  #266 = Utf8               CANNOT_PARTICIPATE_IN_AUCTION
  #267 = String             #268          // bid
  #268 = Utf8               bid
  #269 = Integer            2147483647
  #270 = Methodref          #271.#272     // java/lang/Math.min:(II)I
  #271 = Class              #273          // java/lang/Math
  #272 = NameAndType        #274:#275     // min:(II)I
  #273 = Utf8               java/lang/Math
  #274 = Utf8               min
  #275 = Utf8               (II)I
  #276 = Methodref          #25.#277      // ext/mods/gameserver/data/manager/ClanHallManager.getAuction:(I)Lext/mods/gameserver/model/residence/clanhall/Auction;
  #277 = NameAndType        #82:#278      // getAuction:(I)Lext/mods/gameserver/model/residence/clanhall/Auction;
  #278 = Utf8               (I)Lext/mods/gameserver/model/residence/clanhall/Auction;
  #279 = Methodref          #85.#280      // ext/mods/gameserver/model/residence/clanhall/Auction.setBid:(Lext/mods/gameserver/model/actor/Player;I)V
  #280 = NameAndType        #281:#282     // setBid:(Lext/mods/gameserver/model/actor/Player;I)V
  #281 = Utf8               setBid
  #282 = Utf8               (Lext/mods/gameserver/model/actor/Player;I)V
  #283 = String             #284          // bid1
  #284 = Utf8               bid1
  #285 = Methodref          #286.#287     // ext/mods/gameserver/model/pledge/Clan.getLevel:()I
  #286 = Class              #288          // ext/mods/gameserver/model/pledge/Clan
  #287 = NameAndType        #289:#100     // getLevel:()I
  #288 = Utf8               ext/mods/gameserver/model/pledge/Clan
  #289 = Utf8               getLevel
  #290 = Fieldref           #40.#291      // ext/mods/gameserver/network/SystemMessageId.AUCTION_ONLY_CLAN_LEVEL_2_HIGHER:Lext/mods/gameserver/network/SystemMessageId;
  #291 = NameAndType        #292:#44      // AUCTION_ONLY_CLAN_LEVEL_2_HIGHER:Lext/mods/gameserver/network/SystemMessageId;
  #292 = Utf8               AUCTION_ONLY_CLAN_LEVEL_2_HIGHER
  #293 = Methodref          #286.#294     // ext/mods/gameserver/model/pledge/Clan.hasClanHall:()Z
  #294 = NameAndType        #295:#21      // hasClanHall:()Z
  #295 = Utf8               hasClanHall
  #296 = Methodref          #286.#297     // ext/mods/gameserver/model/pledge/Clan.getAuctionBiddedAt:()I
  #297 = NameAndType        #298:#100     // getAuctionBiddedAt:()I
  #298 = Utf8               getAuctionBiddedAt
  #299 = Fieldref           #40.#300      // ext/mods/gameserver/network/SystemMessageId.ALREADY_SUBMITTED_BID:Lext/mods/gameserver/network/SystemMessageId;
  #300 = NameAndType        #301:#44      // ALREADY_SUBMITTED_BID:Lext/mods/gameserver/network/SystemMessageId;
  #301 = Utf8               ALREADY_SUBMITTED_BID
  #302 = String             #303          // html/auction/AgitBid1.htm
  #303 = Utf8               html/auction/AgitBid1.htm
  #304 = InvokeDynamic      #6:#305       // #6:makeConcatWithConstants:(ILjava/lang/String;)Ljava/lang/String;
  #305 = NameAndType        #169:#306     // makeConcatWithConstants:(ILjava/lang/String;)Ljava/lang/String;
  #306 = Utf8               (ILjava/lang/String;)Ljava/lang/String;
  #307 = String             #308          // %PLEDGE_ADENA%
  #308 = Utf8               %PLEDGE_ADENA%
  #309 = Methodref          #286.#310     // ext/mods/gameserver/model/pledge/Clan.getWarehouse:()Lext/mods/gameserver/model/itemcontainer/ItemContainer;
  #310 = NameAndType        #311:#312     // getWarehouse:()Lext/mods/gameserver/model/itemcontainer/ItemContainer;
  #311 = Utf8               getWarehouse
  #312 = Utf8               ()Lext/mods/gameserver/model/itemcontainer/ItemContainer;
  #313 = Methodref          #314.#315     // ext/mods/gameserver/model/itemcontainer/ItemContainer.getAdena:()I
  #314 = Class              #316          // ext/mods/gameserver/model/itemcontainer/ItemContainer
  #315 = NameAndType        #317:#100     // getAdena:()I
  #316 = Utf8               ext/mods/gameserver/model/itemcontainer/ItemContainer
  #317 = Utf8               getAdena
  #318 = String             #319          // npc_%objectId%_bid
  #319 = Utf8               npc_%objectId%_bid
  #320 = InvokeDynamic      #7:#305       // #7:makeConcatWithConstants:(ILjava/lang/String;)Ljava/lang/String;
  #321 = String             #322          // bidlist
  #322 = Utf8               bidlist
  #323 = Methodref          #286.#117     // ext/mods/gameserver/model/pledge/Clan.getName:()Ljava/lang/String;
  #324 = String             #325          // yyyy-MM-dd
  #325 = Utf8               yyyy-MM-dd
  #326 = InterfaceMethodref #183.#327     // java/util/Map.values:()Ljava/util/Collection;
  #327 = NameAndType        #328:#329     // values:()Ljava/util/Collection;
  #328 = Utf8               values
  #329 = Utf8               ()Ljava/util/Collection;
  #330 = Class              #331          // java/lang/StringBuilder
  #331 = Utf8               java/lang/StringBuilder
  #332 = InterfaceMethodref #333.#184     // java/util/Collection.size:()I
  #333 = Class              #334          // java/util/Collection
  #334 = Utf8               java/util/Collection
  #335 = Methodref          #330.#102     // java/lang/StringBuilder."<init>":(I)V
  #336 = InterfaceMethodref #333.#337     // java/util/Collection.iterator:()Ljava/util/Iterator;
  #337 = NameAndType        #338:#339     // iterator:()Ljava/util/Iterator;
  #338 = Utf8               iterator
  #339 = Utf8               ()Ljava/util/Iterator;
  #340 = InterfaceMethodref #341.#342     // java/util/Iterator.hasNext:()Z
  #341 = Class              #343          // java/util/Iterator
  #342 = NameAndType        #344:#21      // hasNext:()Z
  #343 = Utf8               java/util/Iterator
  #344 = Utf8               hasNext
  #345 = InterfaceMethodref #341.#346     // java/util/Iterator.next:()Ljava/lang/Object;
  #346 = NameAndType        #347:#348     // next:()Ljava/lang/Object;
  #347 = Utf8               next
  #348 = Utf8               ()Ljava/lang/Object;
  #349 = Class              #350          // ext/mods/gameserver/model/residence/clanhall/Bidder
  #350 = Utf8               ext/mods/gameserver/model/residence/clanhall/Bidder
  #351 = Class              #352          // java/lang/Object
  #352 = Utf8               java/lang/Object
  #353 = String             #354          // <tr><td width=90 align=center>
  #354 = Utf8               <tr><td width=90 align=center>
  #355 = Methodref          #349.#218     // ext/mods/gameserver/model/residence/clanhall/Bidder.getClanName:()Ljava/lang/String;
  #356 = String             #357          // </td><td width=90 align=center>
  #357 = Utf8               </td><td width=90 align=center>
  #358 = Methodref          #349.#117     // ext/mods/gameserver/model/residence/clanhall/Bidder.getName:()Ljava/lang/String;
  #359 = Methodref          #349.#360     // ext/mods/gameserver/model/residence/clanhall/Bidder.getTime:()J
  #360 = NameAndType        #361:#89      // getTime:()J
  #361 = Utf8               getTime
  #362 = String             #363          // </td></tr>
  #363 = Utf8               </td></tr>
  #364 = Methodref          #365.#366     // ext/mods/commons/lang/StringUtil.append:(Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
  #365 = Class              #367          // ext/mods/commons/lang/StringUtil
  #366 = NameAndType        #368:#369     // append:(Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
  #367 = Utf8               ext/mods/commons/lang/StringUtil
  #368 = Utf8               append
  #369 = Utf8               (Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
  #370 = String             #371          // html/auction/AgitBidderList.htm
  #371 = Utf8               html/auction/AgitBidderList.htm
  #372 = String             #373          // %AGIT_LIST%
  #373 = Utf8               %AGIT_LIST%
  #374 = Methodref          #330.#375     // java/lang/StringBuilder.toString:()Ljava/lang/String;
  #375 = NameAndType        #376:#17      // toString:()Ljava/lang/String;
  #376 = Utf8               toString
  #377 = String             #378          // _selectedItems
  #378 = Utf8               _selectedItems
  #379 = InvokeDynamic      #8:#195       // #8:makeConcatWithConstants:(I)Ljava/lang/String;
  #380 = InvokeDynamic      #9:#305       // #9:makeConcatWithConstants:(ILjava/lang/String;)Ljava/lang/String;
  #381 = String             #382          // %objectId%
  #382 = Utf8               %objectId%
  #383 = String             #384          // selectedItems
  #384 = Utf8               selectedItems
  #385 = Methodref          #60.#386      // ext/mods/gameserver/model/actor/instance/Auctioneer.showSelectedItems:(Lext/mods/gameserver/model/actor/Player;)V
  #386 = NameAndType        #387:#247     // showSelectedItems:(Lext/mods/gameserver/model/actor/Player;)V
  #387 = Utf8               showSelectedItems
  #388 = String             #389          // cancelBid
  #389 = Utf8               cancelBid
  #390 = Methodref          #46.#391      // ext/mods/gameserver/model/actor/Player.getClanId:()I
  #391 = NameAndType        #392:#100     // getClanId:()I
  #392 = Utf8               getClanId
  #393 = Methodref          #69.#394      // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
  #394 = NameAndType        #153:#395     // valueOf:(I)Ljava/lang/Integer;
  #395 = Utf8               (I)Ljava/lang/Integer;
  #396 = InterfaceMethodref #183.#397     // java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
  #397 = NameAndType        #398:#399     // get:(Ljava/lang/Object;)Ljava/lang/Object;
  #398 = Utf8               get
  #399 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
  #400 = Methodref          #349.#401     // ext/mods/gameserver/model/residence/clanhall/Bidder.getBid:()I
  #401 = NameAndType        #402:#100     // getBid:()I
  #402 = Utf8               getBid
  #403 = String             #404          // html/auction/AgitBidCancel.htm
  #404 = Utf8               html/auction/AgitBidCancel.htm
  #405 = String             #406          // %AGIT_BID%
  #406 = Utf8               %AGIT_BID%
  #407 = String             #408          // %AGIT_BID_REMAIN%
  #408 = Utf8               %AGIT_BID_REMAIN%
  #409 = Double             0.9d
  #411 = InvokeDynamic      #10:#195      // #10:makeConcatWithConstants:(I)Ljava/lang/String;
  #412 = String             #413          // doCancelBid
  #413 = Utf8               doCancelBid
  #414 = Methodref          #85.#415      // ext/mods/gameserver/model/residence/clanhall/Auction.cancelBid:(Lext/mods/gameserver/model/pledge/Clan;)V
  #415 = NameAndType        #389:#416     // cancelBid:(Lext/mods/gameserver/model/pledge/Clan;)V
  #416 = Utf8               (Lext/mods/gameserver/model/pledge/Clan;)V
  #417 = Fieldref           #40.#418      // ext/mods/gameserver/network/SystemMessageId.CANCELED_BID:Lext/mods/gameserver/network/SystemMessageId;
  #418 = NameAndType        #419:#44      // CANCELED_BID:Lext/mods/gameserver/network/SystemMessageId;
  #419 = Utf8               CANCELED_BID
  #420 = String             #421          // cancelAuction
  #421 = Utf8               cancelAuction
  #422 = Methodref          #25.#423      // ext/mods/gameserver/data/manager/ClanHallManager.getClanHallByOwner:(Lext/mods/gameserver/model/pledge/Clan;)Lext/mods/gameserver/model/residence/clanhall/ClanHall;
  #423 = NameAndType        #424:#425     // getClanHallByOwner:(Lext/mods/gameserver/model/pledge/Clan;)Lext/mods/gameserver/model/residence/clanhall/ClanHall;
  #424 = Utf8               getClanHallByOwner
  #425 = Utf8               (Lext/mods/gameserver/model/pledge/Clan;)Lext/mods/gameserver/model/residence/clanhall/ClanHall;
  #426 = String             #427          // html/auction/AgitSaleCancel.htm
  #427 = Utf8               html/auction/AgitSaleCancel.htm
  #428 = String             #429          // %AGIT_DEPOSIT%
  #429 = Utf8               %AGIT_DEPOSIT%
  #430 = String             #431          // doCancelAuction
  #431 = Utf8               doCancelAuction
  #432 = Methodref          #286.#433     // ext/mods/gameserver/model/pledge/Clan.getClanHallId:()I
  #433 = NameAndType        #434:#100     // getClanHallId:()I
  #434 = Utf8               getClanHallId
  #435 = Methodref          #85.#436      // ext/mods/gameserver/model/residence/clanhall/Auction.cancelAuction:()V
  #436 = NameAndType        #421:#437     // cancelAuction:()V
  #437 = Utf8               ()V
  #438 = String             #439          // sale
  #439 = Utf8               sale
  #440 = String             #441          // html/auction/AgitSale1.htm
  #441 = Utf8               html/auction/AgitSale1.htm
  #442 = String             #443          // %AGIT_PLEDGE_ADENA%
  #443 = Utf8               %AGIT_PLEDGE_ADENA%
  #444 = String             #445          // rebid
  #445 = Utf8               rebid
  #446 = String             #447          // html/auction/AgitBid2.htm
  #447 = Utf8               html/auction/AgitBid2.htm
  #448 = String             #449          // %AGIT_AUCTION_BID%
  #449 = Utf8               %AGIT_AUCTION_BID%
  #450 = Methodref          #79.#451      // ext/mods/gameserver/model/residence/clanhall/ClanHall.getAuctionMin:()I
  #451 = NameAndType        #452:#100     // getAuctionMin:()I
  #452 = Utf8               getAuctionMin
  #453 = String             #454          // npc_%objectId%_bid1
  #454 = Utf8               npc_%objectId%_bid1
  #455 = InvokeDynamic      #11:#203      // #11:makeConcatWithConstants:(II)Ljava/lang/String;
  #456 = Fieldref           #40.#457      // ext/mods/gameserver/network/SystemMessageId.NOT_ENOUGH_ADENA_IN_CWH:Lext/mods/gameserver/network/SystemMessageId;
  #457 = NameAndType        #458:#44      // NOT_ENOUGH_ADENA_IN_CWH:Lext/mods/gameserver/network/SystemMessageId;
  #458 = Utf8               NOT_ENOUGH_ADENA_IN_CWH
  #459 = String             #460          // auction
  #460 = Utf8               auction
  #461 = Methodref          #85.#462      // ext/mods/gameserver/model/residence/clanhall/Auction.setSeller:(Lext/mods/gameserver/model/pledge/Clan;I)V
  #462 = NameAndType        #463:#464     // setSeller:(Lext/mods/gameserver/model/pledge/Clan;I)V
  #463 = Utf8               setSeller
  #464 = Utf8               (Lext/mods/gameserver/model/pledge/Clan;I)V
  #465 = Long               86400000l
  #467 = Methodref          #85.#468      // ext/mods/gameserver/model/residence/clanhall/Auction.setEndDate:(J)V
  #468 = NameAndType        #469:#470     // setEndDate:(J)V
  #469 = Utf8               setEndDate
  #470 = Utf8               (J)V
  #471 = String             #472          // html/auction/AgitSale3.htm
  #472 = Utf8               html/auction/AgitSale3.htm
  #473 = String             #474          // %x%
  #474 = Utf8               %x%
  #475 = String             #476          // %AGIT_AUCTION_MIN%
  #476 = Utf8               %AGIT_AUCTION_MIN%
  #477 = InvokeDynamic      #12:#195      // #12:makeConcatWithConstants:(I)Ljava/lang/String;
  #478 = String             #479          // confirmAuction
  #479 = Utf8               confirmAuction
  #480 = Methodref          #85.#481      // ext/mods/gameserver/model/residence/clanhall/Auction.takeItem:(Lext/mods/gameserver/model/actor/Player;I)Z
  #481 = NameAndType        #482:#483     // takeItem:(Lext/mods/gameserver/model/actor/Player;I)Z
  #482 = Utf8               takeItem
  #483 = Utf8               (Lext/mods/gameserver/model/actor/Player;I)Z
  #484 = Methodref          #85.#485      // ext/mods/gameserver/model/residence/clanhall/Auction.confirmAuction:()V
  #485 = NameAndType        #479:#437     // confirmAuction:()V
  #486 = Fieldref           #40.#487      // ext/mods/gameserver/network/SystemMessageId.REGISTERED_FOR_CLANHALL:Lext/mods/gameserver/network/SystemMessageId;
  #487 = NameAndType        #488:#44      // REGISTERED_FOR_CLANHALL:Lext/mods/gameserver/network/SystemMessageId;
  #488 = Utf8               REGISTERED_FOR_CLANHALL
  #489 = String             #490          // sale2
  #490 = Utf8               sale2
  #491 = String             #492          // html/auction/AgitSale2.htm
  #492 = Utf8               html/auction/AgitSale2.htm
  #493 = String             #494          // %AGIT_LAST_PRICE%
  #494 = Utf8               %AGIT_LAST_PRICE%
  #495 = InvokeDynamic      #13:#195      // #13:makeConcatWithConstants:(I)Ljava/lang/String;
  #496 = Methodref          #2.#497       // ext/mods/gameserver/model/actor/instance/Folk.onBypassFeedback:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
  #497 = NameAndType        #498:#499     // onBypassFeedback:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
  #498 = Utf8               onBypassFeedback
  #499 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
  #500 = String             #501          // html/auction/auction.htm
  #501 = Utf8               html/auction/auction.htm
  #502 = String             #503          // %npcId%
  #503 = Utf8               %npcId%
  #504 = Methodref          #60.#505      // ext/mods/gameserver/model/actor/instance/Auctioneer.getNpcId:()I
  #505 = NameAndType        #506:#100     // getNpcId:()I
  #506 = Utf8               getNpcId
  #507 = String             #508          // %npcname%
  #508 = Utf8               %npcname%
  #509 = Methodref          #60.#117      // ext/mods/gameserver/model/actor/instance/Auctioneer.getName:()Ljava/lang/String;
  #510 = Methodref          #2.#511       // ext/mods/gameserver/model/actor/instance/Folk.showChatWindow:(Lext/mods/gameserver/model/actor/Player;I)V
  #511 = NameAndType        #246:#282     // showChatWindow:(Lext/mods/gameserver/model/actor/Player;I)V
  #512 = InterfaceMethodref #35.#184      // java/util/List.size:()I
  #513 = Methodref          #514.#515     // ext/mods/commons/math/MathUtil.countPagesNumber:(II)I
  #514 = Class              #516          // ext/mods/commons/math/MathUtil
  #515 = NameAndType        #517:#275     // countPagesNumber:(II)I
  #516 = Utf8               ext/mods/commons/math/MathUtil
  #517 = Utf8               countPagesNumber
  #518 = InterfaceMethodref #35.#519      // java/util/List.subList:(II)Ljava/util/List;
  #519 = NameAndType        #520:#521     // subList:(II)Ljava/util/List;
  #520 = Utf8               subList
  #521 = Utf8               (II)Ljava/util/List;
  #522 = String             #523          // <table width=280>
  #523 = Utf8               <table width=280>
  #524 = Methodref          #330.#525     // java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
  #525 = NameAndType        #368:#526     // append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
  #526 = Utf8               (Ljava/lang/String;)Ljava/lang/StringBuilder;
  #527 = InterfaceMethodref #35.#337      // java/util/List.iterator:()Ljava/util/Iterator;
  #528 = String             #529          // <tr><td><font color=\"aaaaff\">
  #529 = Utf8               <tr><td><font color=\"aaaaff\">
  #530 = String             #531          // </font></td><td><font color=\"ffffaa\"><a action=\"bypass -h npc_
  #531 = Utf8               </font></td><td><font color=\"ffffaa\"><a action=\"bypass -h npc_
  #532 = String             #533          // _bidding
  #533 = Utf8               _bidding
  #534 = String             #535          // \">
  #535 = Utf8               \">
  #536 = String             #537          //  [
  #537 = Utf8                [
  #538 = String             #539          // ]</a></font></td><td>
  #539 = Utf8               ]</a></font></td><td>
  #540 = String             #541          // </td><td><font color=\"aaffff\">
  #541 = Utf8               </td><td><font color=\"aaffff\">
  #542 = String             #543          // </font></td></tr>
  #543 = Utf8               </font></td></tr>
  #544 = String             #545          // </table><table width=280><tr>
  #545 = Utf8               </table><table width=280><tr>
  #546 = String             #547          // <td align=center><a action=\"bypass -h npc_
  #547 = Utf8               <td align=center><a action=\"bypass -h npc_
  #548 = String             #549          // _list
  #549 = Utf8               _list
  #550 = String             #551          // \"> Page
  #551 = Utf8               \"> Page
  #552 = String             #553          //  </a></td>
  #553 = Utf8                </a></td>
  #554 = String             #555          // </tr></table>
  #555 = Utf8               </tr></table>
  #556 = String             #557          // html/auction/AgitAuctionList.htm
  #557 = Utf8               html/auction/AgitAuctionList.htm
  #558 = String             #559          // html/auction/AgitBidInfo.htm
  #559 = Utf8               html/auction/AgitBidInfo.htm
  #560 = String             #561          // %AGIT_AUCTION_MYBID%
  #561 = Utf8               %AGIT_AUCTION_MYBID%
  #562 = Methodref          #217.#401     // ext/mods/gameserver/model/residence/clanhall/Seller.getBid:()I
  #563 = String             #564          // html/auction/AgitSaleInfo.htm
  #564 = Utf8               html/auction/AgitSaleInfo.htm
  #565 = String             #566          // %AGIT_OWNER_PLEDGE_NAME%
  #566 = Utf8               %AGIT_OWNER_PLEDGE_NAME%
  #567 = String             #568          // %AGIT_AUCTION_BIDCOUNT%
  #568 = Utf8               %AGIT_AUCTION_BIDCOUNT%
  #569 = String             #570          // %id%
  #570 = Utf8               %id%
  #571 = String             #572          // html/auction/AgitInfo.htm
  #572 = Utf8               html/auction/AgitInfo.htm
  #573 = Methodref          #286.#574     // ext/mods/gameserver/model/pledge/Clan.getLeaderName:()Ljava/lang/String;
  #574 = NameAndType        #575:#17      // getLeaderName:()Ljava/lang/String;
  #575 = Utf8               getLeaderName
  #576 = Fieldref           #40.#577      // ext/mods/gameserver/network/SystemMessageId.NO_OFFERINGS_OWN_OR_MADE_BID_FOR:Lext/mods/gameserver/network/SystemMessageId;
  #577 = NameAndType        #578:#44      // NO_OFFERINGS_OWN_OR_MADE_BID_FOR:Lext/mods/gameserver/network/SystemMessageId;
  #578 = Utf8               NO_OFFERINGS_OWN_OR_MADE_BID_FOR
  #579 = Utf8               PAGE_LIMIT
  #580 = Utf8               I
  #581 = Utf8               ConstantValue
  #582 = Integer            15
  #583 = Utf8               Code
  #584 = Utf8               LineNumberTable
  #585 = Utf8               LocalVariableTable
  #586 = Utf8               this
  #587 = Utf8               Lext/mods/gameserver/model/actor/instance/Auctioneer;
  #588 = Utf8               objectId
  #589 = Utf8               template
  #590 = Utf8               Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #591 = Utf8               remainingTime
  #592 = Utf8               J
  #593 = Utf8               html
  #594 = Utf8               Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
  #595 = Utf8               seller
  #596 = Utf8               Lext/mods/gameserver/model/residence/clanhall/Seller;
  #597 = Utf8               Lext/mods/gameserver/model/residence/clanhall/Auction;
  #598 = Utf8               ch
  #599 = Utf8               Lext/mods/gameserver/model/residence/clanhall/ClanHall;
  #600 = Utf8               bidder
  #601 = Utf8               Lext/mods/gameserver/model/residence/clanhall/Bidder;
  #602 = Utf8               auctionId
  #603 = Utf8               isSeller
  #604 = Utf8               Z
  #605 = Utf8               sdf
  #606 = Utf8               Ljava/text/SimpleDateFormat;
  #607 = Utf8               bidders
  #608 = Utf8               Ljava/util/Collection;
  #609 = Utf8               sb
  #610 = Utf8               Ljava/lang/StringBuilder;
  #611 = Utf8               days
  #612 = Utf8               clan
  #613 = Utf8               Lext/mods/gameserver/model/pledge/Clan;
  #614 = Utf8               player
  #615 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #616 = Utf8               command
  #617 = Utf8               Ljava/lang/String;
  #618 = Utf8               st
  #619 = Utf8               Ljava/util/StringTokenizer;
  #620 = Utf8               actualCommand
  #621 = Utf8               val
  #622 = Utf8               LocalVariableTypeTable
  #623 = Utf8               Ljava/util/Collection<Lext/mods/gameserver/model/residence/clanhall/Bidder;>;
  #624 = Utf8               StackMapTable
  #625 = Utf8               j
  #626 = Utf8               chs
  #627 = Utf8               Ljava/util/List;
  #628 = Utf8               page
  #629 = Utf8               max
  #630 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/residence/clanhall/ClanHall;>;
  #631 = Utf8               SourceFile
  #632 = Utf8               Auctioneer.java
  #633 = Utf8               BootstrapMethods
  #634 = String             #635          // \u0001 hours \u0001 minutes
  #635 = Utf8               \u0001 hours \u0001 minutes
  #636 = String             #637          // bypass -h npc_\u0001_list
  #637 = Utf8               bypass -h npc_\u0001_list
  #638 = String             #639          // bypass -h npc_\u0001_bidlist \u0001
  #639 = Utf8               bypass -h npc_\u0001_bidlist \u0001
  #640 = String             #641          // bypass -h npc_\u0001_bid1 \u0001
  #641 = Utf8               bypass -h npc_\u0001_bid1 \u0001
  #642 = String             #643          // html/auction/map_agit_\u0001.htm
  #643 = Utf8               html/auction/map_agit_\u0001.htm
  #644 = String             #645          // bypass -h npc_\u0001_start
  #645 = Utf8               bypass -h npc_\u0001_start
  #646 = String             #647          // bypass -h npc_\u0001_bidding \u0001
  #647 = Utf8               bypass -h npc_\u0001_bidding \u0001
  #648 = String             #649          // npc_\u0001_bid \u0001
  #649 = Utf8               npc_\u0001_bid \u0001
  #650 = String             #651          // _bidding \u0001
  #651 = Utf8               _bidding \u0001
  #652 = String             #653          // bypass -h npc_\u0001\u0001
  #653 = Utf8               bypass -h npc_\u0001\u0001
  #654 = String             #655          // bypass -h npc_\u0001_selectedItems
  #655 = Utf8               bypass -h npc_\u0001_selectedItems
  #656 = String             #657          // npc_\u0001_bid1 \u0001
  #657 = Utf8               npc_\u0001_bid1 \u0001
  #658 = String             #659          // bypass -h npc_\u0001_sale2
  #659 = Utf8               bypass -h npc_\u0001_sale2
  #660 = String             #661          // bypass -h npc_\u0001_sale
  #661 = Utf8               bypass -h npc_\u0001_sale
  #662 = MethodHandle       6:#663        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #663 = Methodref          #664.#665     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #664 = Class              #666          // java/lang/invoke/StringConcatFactory
  #665 = NameAndType        #169:#667     // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #666 = Utf8               java/lang/invoke/StringConcatFactory
  #667 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #668 = Utf8               InnerClasses
  #669 = Class              #670          // java/lang/invoke/MethodHandles$Lookup
  #670 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #671 = Class              #672          // java/lang/invoke/MethodHandles
  #672 = Utf8               java/lang/invoke/MethodHandles
  #673 = Utf8               Lookup
{
  public ext.mods.gameserver.model.actor.instance.Auctioneer(int, ext.mods.gameserver.model.actor.template.NpcTemplate);
    descriptor: (ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: iload_1
         2: aload_2
         3: invokespecial #1                  // Method ext/mods/gameserver/model/actor/instance/Folk."<init>":(ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
         6: return
      LineNumberTable:
        line 47: 0
        line 48: 6
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/model/actor/instance/Auctioneer;
            0       7     1 objectId   I
            0       7     2 template   Lext/mods/gameserver/model/actor/template/NpcTemplate;

  public void onBypassFeedback(ext.mods.gameserver.model.actor.Player, java.lang.String);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=8, locals=16, args_size=3
         0: new           #7                  // class java/util/StringTokenizer
         3: dup
         4: aload_2
         5: ldc           #9                  // String
         7: invokespecial #11                 // Method java/util/StringTokenizer."<init>":(Ljava/lang/String;Ljava/lang/String;)V
        10: astore_3
        11: aload_3
        12: invokevirtual #14                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
        15: astore        4
        17: aload_3
        18: invokevirtual #18                 // Method java/util/StringTokenizer.hasMoreTokens:()Z
        21: ifeq          31
        24: aload_3
        25: invokevirtual #14                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
        28: goto          33
        31: ldc           #22                 // String
        33: astore        5
        35: invokestatic  #24                 // Method ext/mods/gameserver/data/manager/ClanHallManager.getInstance:()Lext/mods/gameserver/data/manager/ClanHallManager;
        38: invokevirtual #30                 // Method ext/mods/gameserver/data/manager/ClanHallManager.getAuctionableClanHalls:()Ljava/util/List;
        41: invokeinterface #34,  1           // InterfaceMethod java/util/List.isEmpty:()Z
        46: ifeq          57
        49: aload_1
        50: getstatic     #39                 // Field ext/mods/gameserver/network/SystemMessageId.NO_CLAN_HALLS_UP_FOR_AUCTION:Lext/mods/gameserver/network/SystemMessageId;
        53: invokevirtual #45                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        56: return
        57: aload         4
        59: ldc           #51                 // String list
        61: invokevirtual #53                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
        64: ifeq          75
        67: aload_0
        68: aload         5
        70: aload_1
        71: invokevirtual #59                 // Method showAuctionsList:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
        74: return
        75: aload         4
        77: ldc           #65                 // String bidding
        79: invokevirtual #53                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
        82: ifeq          430
        85: aload         5
        87: invokevirtual #67                 // Method java/lang/String.isEmpty:()Z
        90: ifeq          94
        93: return
        94: invokestatic  #24                 // Method ext/mods/gameserver/data/manager/ClanHallManager.getInstance:()Lext/mods/gameserver/data/manager/ClanHallManager;
        97: aload         5
        99: invokestatic  #68                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       102: invokevirtual #74                 // Method ext/mods/gameserver/data/manager/ClanHallManager.getClanHall:(I)Lext/mods/gameserver/model/residence/clanhall/ClanHall;
       105: astore        6
       107: aload         6
       109: ifnull        424
       112: aload         6
       114: invokevirtual #78                 // Method ext/mods/gameserver/model/residence/clanhall/ClanHall.getAuction:()Lext/mods/gameserver/model/residence/clanhall/Auction;
       117: astore        7
       119: aload         7
       121: ifnull        424
       124: aload         7
       126: invokevirtual #84                 // Method ext/mods/gameserver/model/residence/clanhall/Auction.getEndDate:()J
       129: invokestatic  #90                 // Method java/lang/System.currentTimeMillis:()J
       132: lsub
       133: lstore        8
       135: new           #95                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
       138: dup
       139: aload_0
       140: invokevirtual #97                 // Method getObjectId:()I
       143: invokespecial #101                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
       146: astore        10
       148: aload         10
       150: aload_1
       151: invokevirtual #104                // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
       154: ldc           #108                // String html/auction/AgitAuctionInfo.htm
       156: invokevirtual #110                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
       159: aload         10
       161: ldc           #114                // String %AGIT_NAME%
       163: aload         6
       165: invokevirtual #116                // Method ext/mods/gameserver/model/residence/clanhall/ClanHall.getName:()Ljava/lang/String;
       168: invokevirtual #119                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       171: aload         10
       173: ldc           #122                // String %AGIT_SIZE%
       175: aload         6
       177: invokevirtual #124                // Method ext/mods/gameserver/model/residence/clanhall/ClanHall.getSize:()I
       180: invokevirtual #127                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
       183: aload         10
       185: ldc           #130                // String %AGIT_LEASE%
       187: aload         6
       189: invokevirtual #132                // Method ext/mods/gameserver/model/residence/clanhall/ClanHall.getLease:()I
       192: invokevirtual #127                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
       195: aload         10
       197: ldc           #135                // String %AGIT_LOCATION%
       199: aload         6
       201: invokevirtual #137                // Method ext/mods/gameserver/model/residence/clanhall/ClanHall.getTownName:()Ljava/lang/String;
       204: invokevirtual #119                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       207: aload         10
       209: ldc           #140                // String %AGIT_AUCTION_END%
       211: new           #142                // class java/text/SimpleDateFormat
       214: dup
       215: ldc           #144                // String dd-MM-yyyy HH:mm
       217: invokespecial #146                // Method java/text/SimpleDateFormat."<init>":(Ljava/lang/String;)V
       220: aload         7
       222: invokevirtual #84                 // Method ext/mods/gameserver/model/residence/clanhall/Auction.getEndDate:()J
       225: invokestatic  #149                // Method java/lang/Long.valueOf:(J)Ljava/lang/Long;
       228: invokevirtual #155                // Method java/text/SimpleDateFormat.format:(Ljava/lang/Object;)Ljava/lang/String;
       231: invokevirtual #119                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       234: aload         10
       236: ldc           #159                // String %AGIT_AUCTION_REMAIN%
       238: lload         8
       240: ldc2_w        #161                // long 3600000l
       243: ldiv
       244: lload         8
       246: ldc2_w        #163                // long 60000l
       249: ldiv
       250: ldc2_w        #165                // long 60l
       253: lrem
       254: invokedynamic #167,  0            // InvokeDynamic #0:makeConcatWithConstants:(JJ)Ljava/lang/String;
       259: invokevirtual #119                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       262: aload         10
       264: ldc           #171                // String %AGIT_AUCTION_MINBID%
       266: aload         7
       268: invokevirtual #173                // Method ext/mods/gameserver/model/residence/clanhall/Auction.getMinimumBid:()I
       271: invokevirtual #127                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
       274: aload         10
       276: ldc           #176                // String %AGIT_AUCTION_COUNT%
       278: aload         7
       280: invokevirtual #178                // Method ext/mods/gameserver/model/residence/clanhall/Auction.getBidders:()Ljava/util/Map;
       283: invokeinterface #182,  1          // InterfaceMethod java/util/Map.size:()I
       288: invokevirtual #127                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
       291: aload         10
       293: ldc           #187                // String %AGIT_AUCTION_DESC%
       295: aload         6
       297: invokevirtual #189                // Method ext/mods/gameserver/model/residence/clanhall/ClanHall.getDesc:()Ljava/lang/String;
       300: invokevirtual #119                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       303: aload         10
       305: ldc           #192                // String %AGIT_LINK_BACK%
       307: aload_0
       308: invokevirtual #97                 // Method getObjectId:()I
       311: invokedynamic #194,  0            // InvokeDynamic #1:makeConcatWithConstants:(I)Ljava/lang/String;
       316: invokevirtual #119                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       319: aload         10
       321: ldc           #197                // String %AGIT_LINK_BIDLIST%
       323: aload_0
       324: invokevirtual #97                 // Method getObjectId:()I
       327: aload         6
       329: invokevirtual #199                // Method ext/mods/gameserver/model/residence/clanhall/ClanHall.getId:()I
       332: invokedynamic #202,  0            // InvokeDynamic #2:makeConcatWithConstants:(II)Ljava/lang/String;
       337: invokevirtual #119                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       340: aload         10
       342: ldc           #205                // String %AGIT_LINK_RE%
       344: aload_0
       345: invokevirtual #97                 // Method getObjectId:()I
       348: aload         6
       350: invokevirtual #199                // Method ext/mods/gameserver/model/residence/clanhall/ClanHall.getId:()I
       353: invokedynamic #207,  0            // InvokeDynamic #3:makeConcatWithConstants:(II)Ljava/lang/String;
       358: invokevirtual #119                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       361: aload         7
       363: invokevirtual #208                // Method ext/mods/gameserver/model/residence/clanhall/Auction.getSeller:()Lext/mods/gameserver/model/residence/clanhall/Seller;
       366: astore        11
       368: aload         11
       370: ifnonnull     394
       373: aload         10
       375: ldc           #212                // String %OWNER_PLEDGE_NAME%
       377: ldc           #22                 // String
       379: invokevirtual #119                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       382: aload         10
       384: ldc           #214                // String %OWNER_PLEDGE_MASTER%
       386: ldc           #22                 // String
       388: invokevirtual #119                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       391: goto          418
       394: aload         10
       396: ldc           #212                // String %OWNER_PLEDGE_NAME%
       398: aload         11
       400: invokevirtual #216                // Method ext/mods/gameserver/model/residence/clanhall/Seller.getClanName:()Ljava/lang/String;
       403: invokevirtual #119                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       406: aload         10
       408: ldc           #214                // String %OWNER_PLEDGE_MASTER%
       410: aload         11
       412: invokevirtual #221                // Method ext/mods/gameserver/model/residence/clanhall/Seller.getName:()Ljava/lang/String;
       415: invokevirtual #119                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       418: aload_1
       419: aload         10
       421: invokevirtual #222                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       424: goto          429
       427: astore        6
       429: return
       430: aload         4
       432: ldc           #227                // String location
       434: invokevirtual #53                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
       437: ifeq          497
       440: new           #95                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
       443: dup
       444: aload_0
       445: invokevirtual #97                 // Method getObjectId:()I
       448: invokespecial #101                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
       451: astore        6
       453: aload         6
       455: aload_1
       456: invokevirtual #104                // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
       459: invokestatic  #229                // Method ext/mods/gameserver/data/xml/RestartPointData.getInstance:()Lext/mods/gameserver/data/xml/RestartPointData;
       462: aload_1
       463: invokevirtual #234                // Method ext/mods/gameserver/data/xml/RestartPointData.getAgitMap:(Lext/mods/gameserver/model/actor/Player;)Ljava/lang/String;
       466: invokedynamic #238,  0            // InvokeDynamic #4:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       471: invokevirtual #110                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
       474: aload         6
       476: ldc           #192                // String %AGIT_LINK_BACK%
       478: aload_0
       479: invokevirtual #97                 // Method getObjectId:()I
       482: invokedynamic #241,  0            // InvokeDynamic #5:makeConcatWithConstants:(I)Ljava/lang/String;
       487: invokevirtual #119                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       490: aload_1
       491: aload         6
       493: invokevirtual #222                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       496: return
       497: aload         4
       499: ldc           #242                // String start
       501: invokevirtual #53                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
       504: ifeq          513
       507: aload_0
       508: aload_1
       509: invokevirtual #244                // Method showChatWindow:(Lext/mods/gameserver/model/actor/Player;)V
       512: return
       513: aload_1
       514: invokevirtual #248                // Method ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
       517: astore        6
       519: aload         6
       521: ifnull        534
       524: aload_1
       525: getstatic     #252                // Field ext/mods/gameserver/enums/PrivilegeType.CHP_AUCTION:Lext/mods/gameserver/enums/PrivilegeType;
       528: invokevirtual #258                // Method ext/mods/gameserver/model/actor/Player.hasClanPrivileges:(Lext/mods/gameserver/enums/PrivilegeType;)Z
       531: ifne          550
       534: aload_0
       535: ldc_w         #262                // String 1
       538: aload_1
       539: invokevirtual #59                 // Method showAuctionsList:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
       542: aload_1
       543: getstatic     #264                // Field ext/mods/gameserver/network/SystemMessageId.CANNOT_PARTICIPATE_IN_AUCTION:Lext/mods/gameserver/network/SystemMessageId;
       546: invokevirtual #45                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       549: return
       550: aload         4
       552: ldc_w         #267                // String bid
       555: invokevirtual #53                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
       558: ifeq          628
       561: aload         5
       563: invokevirtual #67                 // Method java/lang/String.isEmpty:()Z
       566: ifeq          570
       569: return
       570: aload_3
       571: invokevirtual #18                 // Method java/util/StringTokenizer.hasMoreTokens:()Z
       574: ifeq          593
       577: aload_3
       578: invokevirtual #14                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       581: invokestatic  #68                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       584: ldc_w         #269                // int 2147483647
       587: invokestatic  #270                // Method java/lang/Math.min:(II)I
       590: goto          594
       593: iconst_0
       594: istore        7
       596: invokestatic  #24                 // Method ext/mods/gameserver/data/manager/ClanHallManager.getInstance:()Lext/mods/gameserver/data/manager/ClanHallManager;
       599: aload         5
       601: invokestatic  #68                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       604: invokevirtual #276                // Method ext/mods/gameserver/data/manager/ClanHallManager.getAuction:(I)Lext/mods/gameserver/model/residence/clanhall/Auction;
       607: astore        8
       609: aload         8
       611: ifnull        622
       614: aload         8
       616: aload_1
       617: iload         7
       619: invokevirtual #279                // Method ext/mods/gameserver/model/residence/clanhall/Auction.setBid:(Lext/mods/gameserver/model/actor/Player;I)V
       622: goto          627
       625: astore        7
       627: return
       628: aload         4
       630: ldc_w         #283                // String bid1
       633: invokevirtual #53                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
       636: ifeq          868
       639: aload         5
       641: invokevirtual #67                 // Method java/lang/String.isEmpty:()Z
       644: ifeq          648
       647: return
       648: aload         6
       650: invokevirtual #285                // Method ext/mods/gameserver/model/pledge/Clan.getLevel:()I
       653: iconst_2
       654: if_icmpge     673
       657: aload_0
       658: ldc_w         #262                // String 1
       661: aload_1
       662: invokevirtual #59                 // Method showAuctionsList:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
       665: aload_1
       666: getstatic     #290                // Field ext/mods/gameserver/network/SystemMessageId.AUCTION_ONLY_CLAN_LEVEL_2_HIGHER:Lext/mods/gameserver/network/SystemMessageId;
       669: invokevirtual #45                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       672: return
       673: aload         6
       675: invokevirtual #293                // Method ext/mods/gameserver/model/pledge/Clan.hasClanHall:()Z
       678: ifeq          697
       681: aload_0
       682: ldc_w         #262                // String 1
       685: aload_1
       686: invokevirtual #59                 // Method showAuctionsList:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
       689: aload_1
       690: getstatic     #264                // Field ext/mods/gameserver/network/SystemMessageId.CANNOT_PARTICIPATE_IN_AUCTION:Lext/mods/gameserver/network/SystemMessageId;
       693: invokevirtual #45                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       696: return
       697: aload         6
       699: invokevirtual #296                // Method ext/mods/gameserver/model/pledge/Clan.getAuctionBiddedAt:()I
       702: ifle          734
       705: aload         6
       707: invokevirtual #296                // Method ext/mods/gameserver/model/pledge/Clan.getAuctionBiddedAt:()I
       710: aload         5
       712: invokestatic  #68                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       715: if_icmpeq     734
       718: aload_0
       719: ldc_w         #262                // String 1
       722: aload_1
       723: invokevirtual #59                 // Method showAuctionsList:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
       726: aload_1
       727: getstatic     #299                // Field ext/mods/gameserver/network/SystemMessageId.ALREADY_SUBMITTED_BID:Lext/mods/gameserver/network/SystemMessageId;
       730: invokevirtual #45                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       733: return
       734: invokestatic  #24                 // Method ext/mods/gameserver/data/manager/ClanHallManager.getInstance:()Lext/mods/gameserver/data/manager/ClanHallManager;
       737: aload         5
       739: invokestatic  #68                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       742: invokevirtual #74                 // Method ext/mods/gameserver/data/manager/ClanHallManager.getClanHall:(I)Lext/mods/gameserver/model/residence/clanhall/ClanHall;
       745: astore        7
       747: aload         7
       749: ifnonnull     753
       752: return
       753: aload         7
       755: invokevirtual #78                 // Method ext/mods/gameserver/model/residence/clanhall/ClanHall.getAuction:()Lext/mods/gameserver/model/residence/clanhall/Auction;
       758: astore        8
       760: aload         8
       762: ifnonnull     766
       765: return
       766: new           #95                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
       769: dup
       770: aload_0
       771: invokevirtual #97                 // Method getObjectId:()I
       774: invokespecial #101                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
       777: astore        9
       779: aload         9
       781: aload_1
       782: invokevirtual #104                // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
       785: ldc_w         #302                // String html/auction/AgitBid1.htm
       788: invokevirtual #110                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
       791: aload         9
       793: ldc           #192                // String %AGIT_LINK_BACK%
       795: aload_0
       796: invokevirtual #97                 // Method getObjectId:()I
       799: aload         5
       801: invokedynamic #304,  0            // InvokeDynamic #6:makeConcatWithConstants:(ILjava/lang/String;)Ljava/lang/String;
       806: invokevirtual #119                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       809: aload         9
       811: ldc_w         #307                // String %PLEDGE_ADENA%
       814: aload         6
       816: invokevirtual #309                // Method ext/mods/gameserver/model/pledge/Clan.getWarehouse:()Lext/mods/gameserver/model/itemcontainer/ItemContainer;
       819: invokevirtual #313                // Method ext/mods/gameserver/model/itemcontainer/ItemContainer.getAdena:()I
       822: invokevirtual #127                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
       825: aload         9
       827: ldc           #171                // String %AGIT_AUCTION_MINBID%
       829: aload         8
       831: invokevirtual #173                // Method ext/mods/gameserver/model/residence/clanhall/Auction.getMinimumBid:()I
       834: invokevirtual #127                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
       837: aload         9
       839: ldc_w         #318                // String npc_%objectId%_bid
       842: aload_0
       843: invokevirtual #97                 // Method getObjectId:()I
       846: aload         5
       848: invokedynamic #320,  0            // InvokeDynamic #7:makeConcatWithConstants:(ILjava/lang/String;)Ljava/lang/String;
       853: invokevirtual #119                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       856: aload_1
       857: aload         9
       859: invokevirtual #222                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       862: goto          867
       865: astore        7
       867: return
       868: aload         4
       870: ldc_w         #321                // String bidlist
       873: invokevirtual #53                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
       876: ifeq          1189
       879: aload         5
       881: invokevirtual #67                 // Method java/lang/String.isEmpty:()Z
       884: ifeq          895
       887: aload         6
       889: invokevirtual #296                // Method ext/mods/gameserver/model/pledge/Clan.getAuctionBiddedAt:()I
       892: goto          900
       895: aload         5
       897: invokestatic  #68                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       900: istore        7
       902: invokestatic  #24                 // Method ext/mods/gameserver/data/manager/ClanHallManager.getInstance:()Lext/mods/gameserver/data/manager/ClanHallManager;
       905: iload         7
       907: invokevirtual #276                // Method ext/mods/gameserver/data/manager/ClanHallManager.getAuction:(I)Lext/mods/gameserver/model/residence/clanhall/Auction;
       910: astore        8
       912: aload         8
       914: ifnonnull     918
       917: return
       918: iconst_0
       919: istore        9
       921: aload         8
       923: invokevirtual #208                // Method ext/mods/gameserver/model/residence/clanhall/Auction.getSeller:()Lext/mods/gameserver/model/residence/clanhall/Seller;
       926: astore        10
       928: aload         10
       930: ifnull        948
       933: aload         10
       935: invokevirtual #216                // Method ext/mods/gameserver/model/residence/clanhall/Seller.getClanName:()Ljava/lang/String;
       938: aload         6
       940: invokevirtual #323                // Method ext/mods/gameserver/model/pledge/Clan.getName:()Ljava/lang/String;
       943: invokevirtual #53                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
       946: istore        9
       948: new           #142                // class java/text/SimpleDateFormat
       951: dup
       952: ldc_w         #324                // String yyyy-MM-dd
       955: invokespecial #146                // Method java/text/SimpleDateFormat."<init>":(Ljava/lang/String;)V
       958: astore        11
       960: aload         8
       962: invokevirtual #178                // Method ext/mods/gameserver/model/residence/clanhall/Auction.getBidders:()Ljava/util/Map;
       965: invokeinterface #326,  1          // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
       970: astore        12
       972: new           #330                // class java/lang/StringBuilder
       975: dup
       976: aload         12
       978: invokeinterface #332,  1          // InterfaceMethod java/util/Collection.size:()I
       983: sipush        150
       986: imul
       987: invokespecial #335                // Method java/lang/StringBuilder."<init>":(I)V
       990: astore        13
       992: aload         12
       994: invokeinterface #336,  1          // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
       999: astore        14
      1001: aload         14
      1003: invokeinterface #340,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
      1008: ifeq          1093
      1011: aload         14
      1013: invokeinterface #345,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      1018: checkcast     #349                // class ext/mods/gameserver/model/residence/clanhall/Bidder
      1021: astore        15
      1023: aload         13
      1025: bipush        7
      1027: anewarray     #351                // class java/lang/Object
      1030: dup
      1031: iconst_0
      1032: ldc_w         #353                // String <tr><td width=90 align=center>
      1035: aastore
      1036: dup
      1037: iconst_1
      1038: aload         15
      1040: invokevirtual #355                // Method ext/mods/gameserver/model/residence/clanhall/Bidder.getClanName:()Ljava/lang/String;
      1043: aastore
      1044: dup
      1045: iconst_2
      1046: ldc_w         #356                // String </td><td width=90 align=center>
      1049: aastore
      1050: dup
      1051: iconst_3
      1052: aload         15
      1054: invokevirtual #358                // Method ext/mods/gameserver/model/residence/clanhall/Bidder.getName:()Ljava/lang/String;
      1057: aastore
      1058: dup
      1059: iconst_4
      1060: ldc_w         #356                // String </td><td width=90 align=center>
      1063: aastore
      1064: dup
      1065: iconst_5
      1066: aload         11
      1068: aload         15
      1070: invokevirtual #359                // Method ext/mods/gameserver/model/residence/clanhall/Bidder.getTime:()J
      1073: invokestatic  #149                // Method java/lang/Long.valueOf:(J)Ljava/lang/Long;
      1076: invokevirtual #155                // Method java/text/SimpleDateFormat.format:(Ljava/lang/Object;)Ljava/lang/String;
      1079: aastore
      1080: dup
      1081: bipush        6
      1083: ldc_w         #362                // String </td></tr>
      1086: aastore
      1087: invokestatic  #364                // Method ext/mods/commons/lang/StringUtil.append:(Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
      1090: goto          1001
      1093: new           #95                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
      1096: dup
      1097: aload_0
      1098: invokevirtual #97                 // Method getObjectId:()I
      1101: invokespecial #101                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
      1104: astore        14
      1106: aload         14
      1108: aload_1
      1109: invokevirtual #104                // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
      1112: ldc_w         #370                // String html/auction/AgitBidderList.htm
      1115: invokevirtual #110                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
      1118: aload         14
      1120: ldc_w         #372                // String %AGIT_LIST%
      1123: aload         13
      1125: invokevirtual #374                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      1128: invokevirtual #119                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      1131: aload         14
      1133: ldc           #192                // String %AGIT_LINK_BACK%
      1135: aload_0
      1136: invokevirtual #97                 // Method getObjectId:()I
      1139: iload         9
      1141: ifeq          1150
      1144: ldc_w         #377                // String _selectedItems
      1147: goto          1157
      1150: iload         7
      1152: invokedynamic #379,  0            // InvokeDynamic #8:makeConcatWithConstants:(I)Ljava/lang/String;
      1157: invokedynamic #380,  0            // InvokeDynamic #9:makeConcatWithConstants:(ILjava/lang/String;)Ljava/lang/String;
      1162: invokevirtual #119                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      1165: aload         14
      1167: ldc_w         #381                // String %objectId%
      1170: aload_0
      1171: invokevirtual #97                 // Method getObjectId:()I
      1174: invokevirtual #127                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
      1177: aload_1
      1178: aload         14
      1180: invokevirtual #222                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
      1183: goto          1188
      1186: astore        7
      1188: return
      1189: aload         4
      1191: ldc_w         #383                // String selectedItems
      1194: invokevirtual #53                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
      1197: ifeq          1206
      1200: aload_0
      1201: aload_1
      1202: invokevirtual #385                // Method showSelectedItems:(Lext/mods/gameserver/model/actor/Player;)V
      1205: return
      1206: aload         4
      1208: ldc_w         #388                // String cancelBid
      1211: invokevirtual #53                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
      1214: ifeq          1362
      1217: invokestatic  #24                 // Method ext/mods/gameserver/data/manager/ClanHallManager.getInstance:()Lext/mods/gameserver/data/manager/ClanHallManager;
      1220: aload         6
      1222: invokevirtual #296                // Method ext/mods/gameserver/model/pledge/Clan.getAuctionBiddedAt:()I
      1225: invokevirtual #276                // Method ext/mods/gameserver/data/manager/ClanHallManager.getAuction:(I)Lext/mods/gameserver/model/residence/clanhall/Auction;
      1228: astore        7
      1230: aload         7
      1232: ifnonnull     1236
      1235: return
      1236: aload         7
      1238: invokevirtual #178                // Method ext/mods/gameserver/model/residence/clanhall/Auction.getBidders:()Ljava/util/Map;
      1241: aload_1
      1242: invokevirtual #390                // Method ext/mods/gameserver/model/actor/Player.getClanId:()I
      1245: invokestatic  #393                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
      1248: invokeinterface #396,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
      1253: checkcast     #349                // class ext/mods/gameserver/model/residence/clanhall/Bidder
      1256: astore        8
      1258: aload         8
      1260: ifnonnull     1264
      1263: return
      1264: aload         8
      1266: invokevirtual #400                // Method ext/mods/gameserver/model/residence/clanhall/Bidder.getBid:()I
      1269: istore        9
      1271: new           #95                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
      1274: dup
      1275: aload_0
      1276: invokevirtual #97                 // Method getObjectId:()I
      1279: invokespecial #101                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
      1282: astore        10
      1284: aload         10
      1286: aload_1
      1287: invokevirtual #104                // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
      1290: ldc_w         #403                // String html/auction/AgitBidCancel.htm
      1293: invokevirtual #110                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
      1296: aload         10
      1298: ldc_w         #405                // String %AGIT_BID%
      1301: iload         9
      1303: invokevirtual #127                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
      1306: aload         10
      1308: ldc_w         #407                // String %AGIT_BID_REMAIN%
      1311: iload         9
      1313: i2d
      1314: ldc2_w        #409                // double 0.9d
      1317: dmul
      1318: d2i
      1319: invokevirtual #127                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
      1322: aload         10
      1324: ldc           #192                // String %AGIT_LINK_BACK%
      1326: aload_0
      1327: invokevirtual #97                 // Method getObjectId:()I
      1330: invokedynamic #411,  0            // InvokeDynamic #10:makeConcatWithConstants:(I)Ljava/lang/String;
      1335: invokevirtual #119                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      1338: aload         10
      1340: ldc_w         #381                // String %objectId%
      1343: aload_0
      1344: invokevirtual #97                 // Method getObjectId:()I
      1347: invokevirtual #127                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
      1350: aload_1
      1351: aload         10
      1353: invokevirtual #222                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
      1356: goto          1361
      1359: astore        7
      1361: return
      1362: aload         4
      1364: ldc_w         #412                // String doCancelBid
      1367: invokevirtual #53                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
      1370: ifeq          1406
      1373: invokestatic  #24                 // Method ext/mods/gameserver/data/manager/ClanHallManager.getInstance:()Lext/mods/gameserver/data/manager/ClanHallManager;
      1376: aload         6
      1378: invokevirtual #296                // Method ext/mods/gameserver/model/pledge/Clan.getAuctionBiddedAt:()I
      1381: invokevirtual #276                // Method ext/mods/gameserver/data/manager/ClanHallManager.getAuction:(I)Lext/mods/gameserver/model/residence/clanhall/Auction;
      1384: astore        7
      1386: aload         7
      1388: ifnull        1405
      1391: aload         7
      1393: aload         6
      1395: invokevirtual #414                // Method ext/mods/gameserver/model/residence/clanhall/Auction.cancelBid:(Lext/mods/gameserver/model/pledge/Clan;)V
      1398: aload_1
      1399: getstatic     #417                // Field ext/mods/gameserver/network/SystemMessageId.CANCELED_BID:Lext/mods/gameserver/network/SystemMessageId;
      1402: invokevirtual #45                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
      1405: return
      1406: aload         4
      1408: ldc_w         #420                // String cancelAuction
      1411: invokevirtual #53                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
      1414: ifeq          1506
      1417: invokestatic  #24                 // Method ext/mods/gameserver/data/manager/ClanHallManager.getInstance:()Lext/mods/gameserver/data/manager/ClanHallManager;
      1420: aload         6
      1422: invokevirtual #422                // Method ext/mods/gameserver/data/manager/ClanHallManager.getClanHallByOwner:(Lext/mods/gameserver/model/pledge/Clan;)Lext/mods/gameserver/model/residence/clanhall/ClanHall;
      1425: astore        7
      1427: aload         7
      1429: ifnonnull     1433
      1432: return
      1433: new           #95                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
      1436: dup
      1437: aload_0
      1438: invokevirtual #97                 // Method getObjectId:()I
      1441: invokespecial #101                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
      1444: astore        8
      1446: aload         8
      1448: aload_1
      1449: invokevirtual #104                // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
      1452: ldc_w         #426                // String html/auction/AgitSaleCancel.htm
      1455: invokevirtual #110                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
      1458: aload         8
      1460: ldc_w         #428                // String %AGIT_DEPOSIT%
      1463: aload         7
      1465: invokevirtual #132                // Method ext/mods/gameserver/model/residence/clanhall/ClanHall.getLease:()I
      1468: invokevirtual #127                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
      1471: aload         8
      1473: ldc           #192                // String %AGIT_LINK_BACK%
      1475: aload_0
      1476: invokevirtual #97                 // Method getObjectId:()I
      1479: invokedynamic #411,  0            // InvokeDynamic #10:makeConcatWithConstants:(I)Ljava/lang/String;
      1484: invokevirtual #119                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      1487: aload         8
      1489: ldc_w         #381                // String %objectId%
      1492: aload_0
      1493: invokevirtual #97                 // Method getObjectId:()I
      1496: invokevirtual #127                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
      1499: aload_1
      1500: aload         8
      1502: invokevirtual #222                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
      1505: return
      1506: aload         4
      1508: ldc_w         #430                // String doCancelAuction
      1511: invokevirtual #53                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
      1514: ifeq          1553
      1517: invokestatic  #24                 // Method ext/mods/gameserver/data/manager/ClanHallManager.getInstance:()Lext/mods/gameserver/data/manager/ClanHallManager;
      1520: aload         6
      1522: invokevirtual #432                // Method ext/mods/gameserver/model/pledge/Clan.getClanHallId:()I
      1525: invokevirtual #276                // Method ext/mods/gameserver/data/manager/ClanHallManager.getAuction:(I)Lext/mods/gameserver/model/residence/clanhall/Auction;
      1528: astore        7
      1530: aload         7
      1532: ifnull        1547
      1535: aload         7
      1537: invokevirtual #435                // Method ext/mods/gameserver/model/residence/clanhall/Auction.cancelAuction:()V
      1540: aload_1
      1541: getstatic     #417                // Field ext/mods/gameserver/network/SystemMessageId.CANCELED_BID:Lext/mods/gameserver/network/SystemMessageId;
      1544: invokevirtual #45                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
      1547: aload_0
      1548: aload_1
      1549: invokevirtual #244                // Method showChatWindow:(Lext/mods/gameserver/model/actor/Player;)V
      1552: return
      1553: aload         4
      1555: ldc_w         #438                // String sale
      1558: invokevirtual #53                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
      1561: ifeq          1669
      1564: invokestatic  #24                 // Method ext/mods/gameserver/data/manager/ClanHallManager.getInstance:()Lext/mods/gameserver/data/manager/ClanHallManager;
      1567: aload         6
      1569: invokevirtual #422                // Method ext/mods/gameserver/data/manager/ClanHallManager.getClanHallByOwner:(Lext/mods/gameserver/model/pledge/Clan;)Lext/mods/gameserver/model/residence/clanhall/ClanHall;
      1572: astore        7
      1574: aload         7
      1576: ifnonnull     1580
      1579: return
      1580: new           #95                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
      1583: dup
      1584: aload_0
      1585: invokevirtual #97                 // Method getObjectId:()I
      1588: invokespecial #101                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
      1591: astore        8
      1593: aload         8
      1595: aload_1
      1596: invokevirtual #104                // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
      1599: ldc_w         #440                // String html/auction/AgitSale1.htm
      1602: invokevirtual #110                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
      1605: aload         8
      1607: ldc_w         #428                // String %AGIT_DEPOSIT%
      1610: aload         7
      1612: invokevirtual #132                // Method ext/mods/gameserver/model/residence/clanhall/ClanHall.getLease:()I
      1615: invokevirtual #127                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
      1618: aload         8
      1620: ldc_w         #442                // String %AGIT_PLEDGE_ADENA%
      1623: aload         6
      1625: invokevirtual #309                // Method ext/mods/gameserver/model/pledge/Clan.getWarehouse:()Lext/mods/gameserver/model/itemcontainer/ItemContainer;
      1628: invokevirtual #313                // Method ext/mods/gameserver/model/itemcontainer/ItemContainer.getAdena:()I
      1631: invokevirtual #127                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
      1634: aload         8
      1636: ldc           #192                // String %AGIT_LINK_BACK%
      1638: aload_0
      1639: invokevirtual #97                 // Method getObjectId:()I
      1642: invokedynamic #411,  0            // InvokeDynamic #10:makeConcatWithConstants:(I)Ljava/lang/String;
      1647: invokevirtual #119                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      1650: aload         8
      1652: ldc_w         #381                // String %objectId%
      1655: aload_0
      1656: invokevirtual #97                 // Method getObjectId:()I
      1659: invokevirtual #127                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
      1662: aload_1
      1663: aload         8
      1665: invokevirtual #222                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
      1668: return
      1669: aload         4
      1671: ldc_w         #444                // String rebid
      1674: invokevirtual #53                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
      1677: ifeq          1862
      1680: invokestatic  #24                 // Method ext/mods/gameserver/data/manager/ClanHallManager.getInstance:()Lext/mods/gameserver/data/manager/ClanHallManager;
      1683: aload         6
      1685: invokevirtual #296                // Method ext/mods/gameserver/model/pledge/Clan.getAuctionBiddedAt:()I
      1688: invokevirtual #74                 // Method ext/mods/gameserver/data/manager/ClanHallManager.getClanHall:(I)Lext/mods/gameserver/model/residence/clanhall/ClanHall;
      1691: astore        7
      1693: aload         7
      1695: ifnonnull     1699
      1698: return
      1699: aload         7
      1701: invokevirtual #78                 // Method ext/mods/gameserver/model/residence/clanhall/ClanHall.getAuction:()Lext/mods/gameserver/model/residence/clanhall/Auction;
      1704: astore        8
      1706: aload         8
      1708: ifnonnull     1712
      1711: return
      1712: aload         8
      1714: invokevirtual #178                // Method ext/mods/gameserver/model/residence/clanhall/Auction.getBidders:()Ljava/util/Map;
      1717: aload_1
      1718: invokevirtual #390                // Method ext/mods/gameserver/model/actor/Player.getClanId:()I
      1721: invokestatic  #393                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
      1724: invokeinterface #396,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
      1729: checkcast     #349                // class ext/mods/gameserver/model/residence/clanhall/Bidder
      1732: astore        9
      1734: aload         9
      1736: ifnonnull     1740
      1739: return
      1740: new           #95                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
      1743: dup
      1744: aload_0
      1745: invokevirtual #97                 // Method getObjectId:()I
      1748: invokespecial #101                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
      1751: astore        10
      1753: aload         10
      1755: aload_1
      1756: invokevirtual #104                // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
      1759: ldc_w         #446                // String html/auction/AgitBid2.htm
      1762: invokevirtual #110                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
      1765: aload         10
      1767: ldc_w         #448                // String %AGIT_AUCTION_BID%
      1770: aload         9
      1772: invokevirtual #400                // Method ext/mods/gameserver/model/residence/clanhall/Bidder.getBid:()I
      1775: invokevirtual #127                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
      1778: aload         10
      1780: ldc           #171                // String %AGIT_AUCTION_MINBID%
      1782: aload         7
      1784: invokevirtual #450                // Method ext/mods/gameserver/model/residence/clanhall/ClanHall.getAuctionMin:()I
      1787: invokevirtual #127                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
      1790: aload         10
      1792: ldc           #140                // String %AGIT_AUCTION_END%
      1794: new           #142                // class java/text/SimpleDateFormat
      1797: dup
      1798: ldc           #144                // String dd-MM-yyyy HH:mm
      1800: invokespecial #146                // Method java/text/SimpleDateFormat."<init>":(Ljava/lang/String;)V
      1803: aload         8
      1805: invokevirtual #84                 // Method ext/mods/gameserver/model/residence/clanhall/Auction.getEndDate:()J
      1808: invokestatic  #149                // Method java/lang/Long.valueOf:(J)Ljava/lang/Long;
      1811: invokevirtual #155                // Method java/text/SimpleDateFormat.format:(Ljava/lang/Object;)Ljava/lang/String;
      1814: invokevirtual #119                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      1817: aload         10
      1819: ldc           #192                // String %AGIT_LINK_BACK%
      1821: aload_0
      1822: invokevirtual #97                 // Method getObjectId:()I
      1825: invokedynamic #411,  0            // InvokeDynamic #10:makeConcatWithConstants:(I)Ljava/lang/String;
      1830: invokevirtual #119                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      1833: aload         10
      1835: ldc_w         #453                // String npc_%objectId%_bid1
      1838: aload_0
      1839: invokevirtual #97                 // Method getObjectId:()I
      1842: aload         7
      1844: invokevirtual #199                // Method ext/mods/gameserver/model/residence/clanhall/ClanHall.getId:()I
      1847: invokedynamic #455,  0            // InvokeDynamic #11:makeConcatWithConstants:(II)Ljava/lang/String;
      1852: invokevirtual #119                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      1855: aload_1
      1856: aload         10
      1858: invokevirtual #222                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
      1861: return
      1862: aload         6
      1864: invokevirtual #309                // Method ext/mods/gameserver/model/pledge/Clan.getWarehouse:()Lext/mods/gameserver/model/itemcontainer/ItemContainer;
      1867: invokevirtual #313                // Method ext/mods/gameserver/model/itemcontainer/ItemContainer.getAdena:()I
      1870: invokestatic  #24                 // Method ext/mods/gameserver/data/manager/ClanHallManager.getInstance:()Lext/mods/gameserver/data/manager/ClanHallManager;
      1873: aload         6
      1875: invokevirtual #422                // Method ext/mods/gameserver/data/manager/ClanHallManager.getClanHallByOwner:(Lext/mods/gameserver/model/pledge/Clan;)Lext/mods/gameserver/model/residence/clanhall/ClanHall;
      1878: invokevirtual #132                // Method ext/mods/gameserver/model/residence/clanhall/ClanHall.getLease:()I
      1881: if_icmpge     1897
      1884: aload_0
      1885: aload_1
      1886: invokevirtual #385                // Method showSelectedItems:(Lext/mods/gameserver/model/actor/Player;)V
      1889: aload_1
      1890: getstatic     #456                // Field ext/mods/gameserver/network/SystemMessageId.NOT_ENOUGH_ADENA_IN_CWH:Lext/mods/gameserver/network/SystemMessageId;
      1893: invokevirtual #45                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
      1896: return
      1897: aload         4
      1899: ldc_w         #459                // String auction
      1902: invokevirtual #53                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
      1905: ifeq          2136
      1908: aload         5
      1910: invokevirtual #67                 // Method java/lang/String.isEmpty:()Z
      1913: ifeq          1917
      1916: return
      1917: aload         5
      1919: invokestatic  #68                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
      1922: istore        7
      1924: aload_3
      1925: invokevirtual #18                 // Method java/util/StringTokenizer.hasMoreTokens:()Z
      1928: ifeq          1947
      1931: aload_3
      1932: invokevirtual #14                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
      1935: invokestatic  #68                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
      1938: ldc_w         #269                // int 2147483647
      1941: invokestatic  #270                // Method java/lang/Math.min:(II)I
      1944: goto          1948
      1947: iconst_0
      1948: istore        8
      1950: invokestatic  #24                 // Method ext/mods/gameserver/data/manager/ClanHallManager.getInstance:()Lext/mods/gameserver/data/manager/ClanHallManager;
      1953: aload         6
      1955: invokevirtual #422                // Method ext/mods/gameserver/data/manager/ClanHallManager.getClanHallByOwner:(Lext/mods/gameserver/model/pledge/Clan;)Lext/mods/gameserver/model/residence/clanhall/ClanHall;
      1958: astore        9
      1960: aload         9
      1962: ifnonnull     1966
      1965: return
      1966: aload         9
      1968: invokevirtual #78                 // Method ext/mods/gameserver/model/residence/clanhall/ClanHall.getAuction:()Lext/mods/gameserver/model/residence/clanhall/Auction;
      1971: astore        10
      1973: aload         10
      1975: ifnonnull     1979
      1978: return
      1979: aload         10
      1981: aload         6
      1983: iload         8
      1985: invokevirtual #461                // Method ext/mods/gameserver/model/residence/clanhall/Auction.setSeller:(Lext/mods/gameserver/model/pledge/Clan;I)V
      1988: aload         10
      1990: iload         7
      1992: i2l
      1993: ldc2_w        #465                // long 86400000l
      1996: lmul
      1997: invokevirtual #467                // Method ext/mods/gameserver/model/residence/clanhall/Auction.setEndDate:(J)V
      2000: new           #95                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
      2003: dup
      2004: aload_0
      2005: invokevirtual #97                 // Method getObjectId:()I
      2008: invokespecial #101                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
      2011: astore        11
      2013: aload         11
      2015: aload_1
      2016: invokevirtual #104                // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
      2019: ldc_w         #471                // String html/auction/AgitSale3.htm
      2022: invokevirtual #110                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
      2025: aload         11
      2027: ldc_w         #473                // String %x%
      2030: aload         5
      2032: invokevirtual #119                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      2035: aload         11
      2037: ldc           #140                // String %AGIT_AUCTION_END%
      2039: new           #142                // class java/text/SimpleDateFormat
      2042: dup
      2043: ldc           #144                // String dd-MM-yyyy HH:mm
      2045: invokespecial #146                // Method java/text/SimpleDateFormat."<init>":(Ljava/lang/String;)V
      2048: aload         10
      2050: invokevirtual #84                 // Method ext/mods/gameserver/model/residence/clanhall/Auction.getEndDate:()J
      2053: invokestatic  #149                // Method java/lang/Long.valueOf:(J)Ljava/lang/Long;
      2056: invokevirtual #155                // Method java/text/SimpleDateFormat.format:(Ljava/lang/Object;)Ljava/lang/String;
      2059: invokevirtual #119                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      2062: aload         11
      2064: ldc           #171                // String %AGIT_AUCTION_MINBID%
      2066: aload         9
      2068: invokevirtual #450                // Method ext/mods/gameserver/model/residence/clanhall/ClanHall.getAuctionMin:()I
      2071: invokevirtual #127                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
      2074: aload         11
      2076: ldc_w         #475                // String %AGIT_AUCTION_MIN%
      2079: iload         8
      2081: invokevirtual #127                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
      2084: aload         11
      2086: ldc           #187                // String %AGIT_AUCTION_DESC%
      2088: aload         9
      2090: invokevirtual #189                // Method ext/mods/gameserver/model/residence/clanhall/ClanHall.getDesc:()Ljava/lang/String;
      2093: invokevirtual #119                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      2096: aload         11
      2098: ldc           #192                // String %AGIT_LINK_BACK%
      2100: aload_0
      2101: invokevirtual #97                 // Method getObjectId:()I
      2104: invokedynamic #477,  0            // InvokeDynamic #12:makeConcatWithConstants:(I)Ljava/lang/String;
      2109: invokevirtual #119                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      2112: aload         11
      2114: ldc_w         #381                // String %objectId%
      2117: aload_0
      2118: invokevirtual #97                 // Method getObjectId:()I
      2121: invokevirtual #127                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
      2124: aload_1
      2125: aload         11
      2127: invokevirtual #222                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
      2130: goto          2135
      2133: astore        7
      2135: return
      2136: aload         4
      2138: ldc_w         #478                // String confirmAuction
      2141: invokevirtual #53                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
      2144: ifeq          2219
      2147: invokestatic  #24                 // Method ext/mods/gameserver/data/manager/ClanHallManager.getInstance:()Lext/mods/gameserver/data/manager/ClanHallManager;
      2150: aload         6
      2152: invokevirtual #432                // Method ext/mods/gameserver/model/pledge/Clan.getClanHallId:()I
      2155: invokevirtual #74                 // Method ext/mods/gameserver/data/manager/ClanHallManager.getClanHall:(I)Lext/mods/gameserver/model/residence/clanhall/ClanHall;
      2158: astore        7
      2160: aload         7
      2162: ifnonnull     2166
      2165: return
      2166: aload         7
      2168: invokevirtual #78                 // Method ext/mods/gameserver/model/residence/clanhall/ClanHall.getAuction:()Lext/mods/gameserver/model/residence/clanhall/Auction;
      2171: astore        8
      2173: aload         8
      2175: ifnull        2186
      2178: aload         8
      2180: invokevirtual #208                // Method ext/mods/gameserver/model/residence/clanhall/Auction.getSeller:()Lext/mods/gameserver/model/residence/clanhall/Seller;
      2183: ifnonnull     2187
      2186: return
      2187: aload         8
      2189: aload_1
      2190: aload         7
      2192: invokevirtual #132                // Method ext/mods/gameserver/model/residence/clanhall/ClanHall.getLease:()I
      2195: invokevirtual #480                // Method ext/mods/gameserver/model/residence/clanhall/Auction.takeItem:(Lext/mods/gameserver/model/actor/Player;I)Z
      2198: ifeq          2218
      2201: aload         8
      2203: invokevirtual #484                // Method ext/mods/gameserver/model/residence/clanhall/Auction.confirmAuction:()V
      2206: aload_0
      2207: aload_1
      2208: invokevirtual #385                // Method showSelectedItems:(Lext/mods/gameserver/model/actor/Player;)V
      2211: aload_1
      2212: getstatic     #486                // Field ext/mods/gameserver/network/SystemMessageId.REGISTERED_FOR_CLANHALL:Lext/mods/gameserver/network/SystemMessageId;
      2215: invokevirtual #45                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
      2218: return
      2219: aload         4
      2221: ldc_w         #489                // String sale2
      2224: invokevirtual #53                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
      2227: ifeq          2319
      2230: invokestatic  #24                 // Method ext/mods/gameserver/data/manager/ClanHallManager.getInstance:()Lext/mods/gameserver/data/manager/ClanHallManager;
      2233: aload         6
      2235: invokevirtual #422                // Method ext/mods/gameserver/data/manager/ClanHallManager.getClanHallByOwner:(Lext/mods/gameserver/model/pledge/Clan;)Lext/mods/gameserver/model/residence/clanhall/ClanHall;
      2238: astore        7
      2240: aload         7
      2242: ifnonnull     2246
      2245: return
      2246: new           #95                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
      2249: dup
      2250: aload_0
      2251: invokevirtual #97                 // Method getObjectId:()I
      2254: invokespecial #101                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
      2257: astore        8
      2259: aload         8
      2261: aload_1
      2262: invokevirtual #104                // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
      2265: ldc_w         #491                // String html/auction/AgitSale2.htm
      2268: invokevirtual #110                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
      2271: aload         8
      2273: ldc_w         #493                // String %AGIT_LAST_PRICE%
      2276: aload         7
      2278: invokevirtual #132                // Method ext/mods/gameserver/model/residence/clanhall/ClanHall.getLease:()I
      2281: invokevirtual #127                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
      2284: aload         8
      2286: ldc           #192                // String %AGIT_LINK_BACK%
      2288: aload_0
      2289: invokevirtual #97                 // Method getObjectId:()I
      2292: invokedynamic #495,  0            // InvokeDynamic #13:makeConcatWithConstants:(I)Ljava/lang/String;
      2297: invokevirtual #119                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      2300: aload         8
      2302: ldc_w         #381                // String %objectId%
      2305: aload_0
      2306: invokevirtual #97                 // Method getObjectId:()I
      2309: invokevirtual #127                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
      2312: aload_1
      2313: aload         8
      2315: invokevirtual #222                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
      2318: return
      2319: aload_0
      2320: aload_1
      2321: aload_2
      2322: invokespecial #496                // Method ext/mods/gameserver/model/actor/instance/Folk.onBypassFeedback:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
      2325: return
      Exception table:
         from    to  target type
            94   424   427   Class java/lang/Exception
           570   622   625   Class java/lang/Exception
           648   672   865   Class java/lang/Exception
           673   696   865   Class java/lang/Exception
           697   733   865   Class java/lang/Exception
           734   752   865   Class java/lang/Exception
           753   765   865   Class java/lang/Exception
           766   862   865   Class java/lang/Exception
           879   917  1186   Class java/lang/Exception
           918  1183  1186   Class java/lang/Exception
          1217  1235  1359   Class java/lang/Exception
          1236  1263  1359   Class java/lang/Exception
          1264  1356  1359   Class java/lang/Exception
          1917  1965  2133   Class java/lang/Exception
          1966  1978  2133   Class java/lang/Exception
          1979  2130  2133   Class java/lang/Exception
      LineNumberTable:
        line 53: 0
        line 55: 11
        line 56: 17
        line 58: 35
        line 60: 49
        line 61: 56
        line 64: 57
        line 66: 67
        line 67: 74
        line 69: 75
        line 71: 85
        line 72: 93
        line 76: 94
        line 77: 107
        line 79: 112
        line 80: 119
        line 82: 124
        line 84: 135
        line 85: 148
        line 86: 159
        line 87: 171
        line 88: 183
        line 89: 195
        line 90: 207
        line 91: 234
        line 92: 262
        line 93: 274
        line 94: 291
        line 95: 303
        line 96: 319
        line 97: 340
        line 99: 361
        line 100: 368
        line 102: 373
        line 103: 382
        line 107: 394
        line 108: 406
        line 111: 418
        line 117: 424
        line 115: 427
        line 118: 429
        line 120: 430
        line 122: 440
        line 123: 453
        line 124: 474
        line 125: 490
        line 126: 496
        line 128: 497
        line 130: 507
        line 131: 512
        line 135: 513
        line 136: 519
        line 138: 534
        line 139: 542
        line 140: 549
        line 143: 550
        line 145: 561
        line 146: 569
        line 150: 570
        line 152: 596
        line 153: 609
        line 154: 614
        line 158: 622
        line 156: 625
        line 159: 627
        line 161: 628
        line 163: 639
        line 164: 647
        line 168: 648
        line 170: 657
        line 171: 665
        line 172: 672
        line 175: 673
        line 177: 681
        line 178: 689
        line 179: 696
        line 182: 697
        line 184: 718
        line 185: 726
        line 186: 733
        line 189: 734
        line 190: 747
        line 191: 752
        line 193: 753
        line 194: 760
        line 195: 765
        line 197: 766
        line 198: 779
        line 199: 791
        line 200: 809
        line 201: 825
        line 202: 837
        line 203: 856
        line 207: 862
        line 205: 865
        line 208: 867
        line 210: 868
        line 214: 879
        line 216: 902
        line 217: 912
        line 218: 917
        line 220: 918
        line 222: 921
        line 223: 928
        line 224: 933
        line 226: 948
        line 227: 960
        line 229: 972
        line 230: 992
        line 231: 1023
        line 233: 1093
        line 234: 1106
        line 235: 1118
        line 236: 1131
        line 237: 1165
        line 238: 1177
        line 242: 1183
        line 240: 1186
        line 243: 1188
        line 245: 1189
        line 247: 1200
        line 248: 1205
        line 250: 1206
        line 254: 1217
        line 255: 1230
        line 256: 1235
        line 258: 1236
        line 259: 1258
        line 260: 1263
        line 262: 1264
        line 264: 1271
        line 265: 1284
        line 266: 1296
        line 267: 1306
        line 268: 1322
        line 269: 1338
        line 270: 1350
        line 274: 1356
        line 272: 1359
        line 275: 1361
        line 277: 1362
        line 279: 1373
        line 280: 1386
        line 282: 1391
        line 283: 1398
        line 285: 1405
        line 287: 1406
        line 289: 1417
        line 290: 1427
        line 291: 1432
        line 293: 1433
        line 294: 1446
        line 295: 1458
        line 296: 1471
        line 297: 1487
        line 298: 1499
        line 299: 1505
        line 301: 1506
        line 303: 1517
        line 304: 1530
        line 306: 1535
        line 307: 1540
        line 309: 1547
        line 310: 1552
        line 312: 1553
        line 314: 1564
        line 315: 1574
        line 316: 1579
        line 318: 1580
        line 319: 1593
        line 320: 1605
        line 321: 1618
        line 322: 1634
        line 323: 1650
        line 324: 1662
        line 325: 1668
        line 327: 1669
        line 329: 1680
        line 330: 1693
        line 331: 1698
        line 333: 1699
        line 334: 1706
        line 335: 1711
        line 337: 1712
        line 338: 1734
        line 339: 1739
        line 341: 1740
        line 342: 1753
        line 343: 1765
        line 344: 1778
        line 345: 1790
        line 346: 1817
        line 347: 1833
        line 348: 1855
        line 349: 1861
        line 353: 1862
        line 355: 1884
        line 356: 1889
        line 357: 1896
        line 360: 1897
        line 362: 1908
        line 363: 1916
        line 367: 1917
        line 368: 1924
        line 370: 1950
        line 371: 1960
        line 372: 1965
        line 374: 1966
        line 375: 1973
        line 376: 1978
        line 378: 1979
        line 379: 1988
        line 381: 2000
        line 382: 2013
        line 383: 2025
        line 384: 2035
        line 385: 2062
        line 386: 2074
        line 387: 2084
        line 388: 2096
        line 389: 2112
        line 390: 2124
        line 394: 2130
        line 392: 2133
        line 395: 2135
        line 397: 2136
        line 399: 2147
        line 400: 2160
        line 401: 2165
        line 403: 2166
        line 404: 2173
        line 405: 2186
        line 407: 2187
        line 409: 2201
        line 411: 2206
        line 412: 2211
        line 414: 2218
        line 416: 2219
        line 418: 2230
        line 419: 2240
        line 420: 2245
        line 422: 2246
        line 423: 2259
        line 424: 2271
        line 425: 2284
        line 426: 2300
        line 427: 2312
        line 428: 2318
        line 432: 2319
        line 433: 2325
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          135     289     8 remainingTime   J
          148     276    10  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
          368      56    11 seller   Lext/mods/gameserver/model/residence/clanhall/Seller;
          119     305     7 auction   Lext/mods/gameserver/model/residence/clanhall/Auction;
          107     317     6    ch   Lext/mods/gameserver/model/residence/clanhall/ClanHall;
          453      44     6  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
          596      26     7   bid   I
          609      13     8 auction   Lext/mods/gameserver/model/residence/clanhall/Auction;
          747     115     7    ch   Lext/mods/gameserver/model/residence/clanhall/ClanHall;
          760     102     8 auction   Lext/mods/gameserver/model/residence/clanhall/Auction;
          779      83     9  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
         1023      67    15 bidder   Lext/mods/gameserver/model/residence/clanhall/Bidder;
          902     281     7 auctionId   I
          912     271     8 auction   Lext/mods/gameserver/model/residence/clanhall/Auction;
          921     262     9 isSeller   Z
          928     255    10 seller   Lext/mods/gameserver/model/residence/clanhall/Seller;
          960     223    11   sdf   Ljava/text/SimpleDateFormat;
          972     211    12 bidders   Ljava/util/Collection;
          992     191    13    sb   Ljava/lang/StringBuilder;
         1106      77    14  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
         1230     126     7 auction   Lext/mods/gameserver/model/residence/clanhall/Auction;
         1258      98     8 bidder   Lext/mods/gameserver/model/residence/clanhall/Bidder;
         1271      85     9   bid   I
         1284      72    10  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
         1386      20     7 auction   Lext/mods/gameserver/model/residence/clanhall/Auction;
         1427      79     7    ch   Lext/mods/gameserver/model/residence/clanhall/ClanHall;
         1446      60     8  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
         1530      23     7 auction   Lext/mods/gameserver/model/residence/clanhall/Auction;
         1574      95     7    ch   Lext/mods/gameserver/model/residence/clanhall/ClanHall;
         1593      76     8  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
         1693     169     7    ch   Lext/mods/gameserver/model/residence/clanhall/ClanHall;
         1706     156     8 auction   Lext/mods/gameserver/model/residence/clanhall/Auction;
         1734     128     9 bidder   Lext/mods/gameserver/model/residence/clanhall/Bidder;
         1753     109    10  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
         1924     206     7  days   I
         1950     180     8   bid   I
         1960     170     9    ch   Lext/mods/gameserver/model/residence/clanhall/ClanHall;
         1973     157    10 auction   Lext/mods/gameserver/model/residence/clanhall/Auction;
         2013     117    11  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
         2160      59     7    ch   Lext/mods/gameserver/model/residence/clanhall/ClanHall;
         2173      46     8 auction   Lext/mods/gameserver/model/residence/clanhall/Auction;
         2240      79     7    ch   Lext/mods/gameserver/model/residence/clanhall/ClanHall;
         2259      60     8  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
          519    1800     6  clan   Lext/mods/gameserver/model/pledge/Clan;
            0    2326     0  this   Lext/mods/gameserver/model/actor/instance/Auctioneer;
            0    2326     1 player   Lext/mods/gameserver/model/actor/Player;
            0    2326     2 command   Ljava/lang/String;
           11    2315     3    st   Ljava/util/StringTokenizer;
           17    2309     4 actualCommand   Ljava/lang/String;
           35    2291     5   val   Ljava/lang/String;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
          972     211    12 bidders   Ljava/util/Collection<Lext/mods/gameserver/model/residence/clanhall/Bidder;>;
      StackMapTable: number_of_entries = 76
        frame_type = 253 /* append */
          offset_delta = 31
          locals = [ class java/util/StringTokenizer, class java/lang/String ]
        frame_type = 65 /* same_locals_1_stack_item */
          stack = [ class java/lang/String ]
        frame_type = 252 /* append */
          offset_delta = 23
          locals = [ class java/lang/String ]
        frame_type = 17 /* same */
        frame_type = 18 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 299
          locals = [ class ext/mods/gameserver/model/actor/instance/Auctioneer, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class java/util/StringTokenizer, class java/lang/String, class java/lang/String, class ext/mods/gameserver/model/residence/clanhall/ClanHall, class ext/mods/gameserver/model/residence/clanhall/Auction, long, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class ext/mods/gameserver/model/residence/clanhall/Seller ]
          stack = []
        frame_type = 23 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 5
          locals = [ class ext/mods/gameserver/model/actor/instance/Auctioneer, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class java/util/StringTokenizer, class java/lang/String, class java/lang/String ]
          stack = []
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 1 /* same */
        frame_type = 0 /* same */
        frame_type = 251 /* same_frame_extended */
          offset_delta = 66
        frame_type = 15 /* same */
        frame_type = 252 /* append */
          offset_delta = 20
          locals = [ class ext/mods/gameserver/model/pledge/Clan ]
        frame_type = 15 /* same */
        frame_type = 19 /* same */
        frame_type = 22 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 27 /* same */
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 1 /* same */
        frame_type = 0 /* same */
        frame_type = 19 /* same */
        frame_type = 24 /* same */
        frame_type = 23 /* same */
        frame_type = 36 /* same */
        frame_type = 252 /* append */
          offset_delta = 18
          locals = [ class ext/mods/gameserver/model/residence/clanhall/ClanHall ]
        frame_type = 252 /* append */
          offset_delta = 12
          locals = [ class ext/mods/gameserver/model/residence/clanhall/Auction ]
        frame_type = 255 /* full_frame */
          offset_delta = 98
          locals = [ class ext/mods/gameserver/model/actor/instance/Auctioneer, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class java/util/StringTokenizer, class java/lang/String, class java/lang/String, class ext/mods/gameserver/model/pledge/Clan ]
          stack = [ class java/lang/Exception ]
        frame_type = 1 /* same */
        frame_type = 0 /* same */
        frame_type = 26 /* same */
        frame_type = 68 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 253 /* append */
          offset_delta = 17
          locals = [ int, class ext/mods/gameserver/model/residence/clanhall/Auction ]
        frame_type = 253 /* append */
          offset_delta = 29
          locals = [ int, class ext/mods/gameserver/model/residence/clanhall/Seller ]
        frame_type = 255 /* full_frame */
          offset_delta = 52
          locals = [ class ext/mods/gameserver/model/actor/instance/Auctioneer, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class java/util/StringTokenizer, class java/lang/String, class java/lang/String, class ext/mods/gameserver/model/pledge/Clan, int, class ext/mods/gameserver/model/residence/clanhall/Auction, int, class ext/mods/gameserver/model/residence/clanhall/Seller, class java/text/SimpleDateFormat, class java/util/Collection, class java/lang/StringBuilder, class java/util/Iterator ]
          stack = []
        frame_type = 250 /* chop */
          offset_delta = 91
        frame_type = 255 /* full_frame */
          offset_delta = 56
          locals = [ class ext/mods/gameserver/model/actor/instance/Auctioneer, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class java/util/StringTokenizer, class java/lang/String, class java/lang/String, class ext/mods/gameserver/model/pledge/Clan, int, class ext/mods/gameserver/model/residence/clanhall/Auction, int, class ext/mods/gameserver/model/residence/clanhall/Seller, class java/text/SimpleDateFormat, class java/util/Collection, class java/lang/StringBuilder, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String, int ]
        frame_type = 255 /* full_frame */
          offset_delta = 6
          locals = [ class ext/mods/gameserver/model/actor/instance/Auctioneer, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class java/util/StringTokenizer, class java/lang/String, class java/lang/String, class ext/mods/gameserver/model/pledge/Clan, int, class ext/mods/gameserver/model/residence/clanhall/Auction, int, class ext/mods/gameserver/model/residence/clanhall/Seller, class java/text/SimpleDateFormat, class java/util/Collection, class java/lang/StringBuilder, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String, int, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 28
          locals = [ class ext/mods/gameserver/model/actor/instance/Auctioneer, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class java/util/StringTokenizer, class java/lang/String, class java/lang/String, class ext/mods/gameserver/model/pledge/Clan ]
          stack = [ class java/lang/Exception ]
        frame_type = 1 /* same */
        frame_type = 0 /* same */
        frame_type = 16 /* same */
        frame_type = 252 /* append */
          offset_delta = 29
          locals = [ class ext/mods/gameserver/model/residence/clanhall/Auction ]
        frame_type = 252 /* append */
          offset_delta = 27
          locals = [ class ext/mods/gameserver/model/residence/clanhall/Bidder ]
        frame_type = 255 /* full_frame */
          offset_delta = 94
          locals = [ class ext/mods/gameserver/model/actor/instance/Auctioneer, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class java/util/StringTokenizer, class java/lang/String, class java/lang/String, class ext/mods/gameserver/model/pledge/Clan ]
          stack = [ class java/lang/Exception ]
        frame_type = 1 /* same */
        frame_type = 0 /* same */
        frame_type = 252 /* append */
          offset_delta = 42
          locals = [ class ext/mods/gameserver/model/residence/clanhall/Auction ]
        frame_type = 250 /* chop */
          offset_delta = 0
        frame_type = 252 /* append */
          offset_delta = 26
          locals = [ class ext/mods/gameserver/model/residence/clanhall/ClanHall ]
        frame_type = 250 /* chop */
          offset_delta = 72
        frame_type = 252 /* append */
          offset_delta = 40
          locals = [ class ext/mods/gameserver/model/residence/clanhall/Auction ]
        frame_type = 250 /* chop */
          offset_delta = 5
        frame_type = 252 /* append */
          offset_delta = 26
          locals = [ class ext/mods/gameserver/model/residence/clanhall/ClanHall ]
        frame_type = 250 /* chop */
          offset_delta = 88
        frame_type = 252 /* append */
          offset_delta = 29
          locals = [ class ext/mods/gameserver/model/residence/clanhall/ClanHall ]
        frame_type = 252 /* append */
          offset_delta = 12
          locals = [ class ext/mods/gameserver/model/residence/clanhall/Auction ]
        frame_type = 252 /* append */
          offset_delta = 27
          locals = [ class ext/mods/gameserver/model/residence/clanhall/Bidder ]
        frame_type = 248 /* chop */
          offset_delta = 121
        frame_type = 34 /* same */
        frame_type = 19 /* same */
        frame_type = 252 /* append */
          offset_delta = 29
          locals = [ int ]
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 253 /* append */
          offset_delta = 17
          locals = [ int, class ext/mods/gameserver/model/residence/clanhall/ClanHall ]
        frame_type = 252 /* append */
          offset_delta = 12
          locals = [ class ext/mods/gameserver/model/residence/clanhall/Auction ]
        frame_type = 255 /* full_frame */
          offset_delta = 153
          locals = [ class ext/mods/gameserver/model/actor/instance/Auctioneer, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class java/util/StringTokenizer, class java/lang/String, class java/lang/String, class ext/mods/gameserver/model/pledge/Clan ]
          stack = [ class java/lang/Exception ]
        frame_type = 1 /* same */
        frame_type = 0 /* same */
        frame_type = 252 /* append */
          offset_delta = 29
          locals = [ class ext/mods/gameserver/model/residence/clanhall/ClanHall ]
        frame_type = 252 /* append */
          offset_delta = 19
          locals = [ class ext/mods/gameserver/model/residence/clanhall/Auction ]
        frame_type = 0 /* same */
        frame_type = 30 /* same */
        frame_type = 249 /* chop */
          offset_delta = 0
        frame_type = 252 /* append */
          offset_delta = 26
          locals = [ class ext/mods/gameserver/model/residence/clanhall/ClanHall ]
        frame_type = 249 /* chop */
          offset_delta = 72

  public void showChatWindow(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=2
         0: new           #95                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
         3: dup
         4: aload_0
         5: invokevirtual #97                 // Method getObjectId:()I
         8: invokespecial #101                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
        11: astore_2
        12: aload_2
        13: aload_1
        14: invokevirtual #104                // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
        17: ldc_w         #500                // String html/auction/auction.htm
        20: invokevirtual #110                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
        23: aload_2
        24: ldc_w         #381                // String %objectId%
        27: aload_0
        28: invokevirtual #97                 // Method getObjectId:()I
        31: invokevirtual #127                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
        34: aload_2
        35: ldc_w         #502                // String %npcId%
        38: aload_0
        39: invokevirtual #504                // Method getNpcId:()I
        42: invokevirtual #127                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
        45: aload_2
        46: ldc_w         #507                // String %npcname%
        49: aload_0
        50: invokevirtual #509                // Method getName:()Ljava/lang/String;
        53: invokevirtual #119                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
        56: aload_1
        57: aload_2
        58: invokevirtual #222                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        61: return
      LineNumberTable:
        line 438: 0
        line 439: 12
        line 440: 23
        line 441: 34
        line 442: 45
        line 443: 56
        line 444: 61
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      62     0  this   Lext/mods/gameserver/model/actor/instance/Auctioneer;
            0      62     1 player   Lext/mods/gameserver/model/actor/Player;
           12      50     2  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;

  public void showChatWindow(ext.mods.gameserver.model.actor.Player, int);
    descriptor: (Lext/mods/gameserver/model/actor/Player;I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=3
         0: iload_2
         1: ifne          5
         4: return
         5: aload_0
         6: aload_1
         7: iload_2
         8: invokespecial #510                // Method ext/mods/gameserver/model/actor/instance/Folk.showChatWindow:(Lext/mods/gameserver/model/actor/Player;I)V
        11: return
      LineNumberTable:
        line 449: 0
        line 450: 4
        line 452: 5
        line 453: 11
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/gameserver/model/actor/instance/Auctioneer;
            0      12     1 player   Lext/mods/gameserver/model/actor/Player;
            0      12     2   val   I
      StackMapTable: number_of_entries = 1
        frame_type = 5 /* same */
}
SourceFile: "Auctioneer.java"
BootstrapMethods:
  0: #662 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #634 \u0001 hours \u0001 minutes
  1: #662 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #636 bypass -h npc_\u0001_list
  2: #662 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #638 bypass -h npc_\u0001_bidlist \u0001
  3: #662 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #640 bypass -h npc_\u0001_bid1 \u0001
  4: #662 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #642 html/auction/map_agit_\u0001.htm
  5: #662 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #644 bypass -h npc_\u0001_start
  6: #662 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #646 bypass -h npc_\u0001_bidding \u0001
  7: #662 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #648 npc_\u0001_bid \u0001
  8: #662 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #650 _bidding \u0001
  9: #662 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #652 bypass -h npc_\u0001\u0001
  10: #662 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #654 bypass -h npc_\u0001_selectedItems
  11: #662 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #656 npc_\u0001_bid1 \u0001
  12: #662 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #658 bypass -h npc_\u0001_sale2
  13: #662 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #660 bypass -h npc_\u0001_sale
InnerClasses:
  public static final #673= #669 of #671; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
