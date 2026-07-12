// Bytecode for: ext.mods.gameserver.handler.admincommandhandlers.AdminClanHall
// File: ext\mods\gameserver\handler\admincommandhandlers\AdminClanHall.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/admincommandhandlers/AdminClanHall.class
  Last modified 9 de jul de 2026; size 9752 bytes
  MD5 checksum c60e52ab9acb7bff9f5646a170965e15
  Compiled from "AdminClanHall.java"
public class ext.mods.gameserver.handler.admincommandhandlers.AdminClanHall implements ext.mods.gameserver.handler.IAdminCommandHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #39                         // ext/mods/gameserver/handler/admincommandhandlers/AdminClanHall
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 2, methods: 6, attributes: 1
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
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
   #18 = Methodref          #7.#19        // java/util/StringTokenizer.countTokens:()I
   #19 = NameAndType        #20:#21       // countTokens:()I
   #20 = Utf8               countTokens
   #21 = Utf8               ()I
   #22 = Methodref          #23.#24       // ext/mods/gameserver/data/manager/ClanHallManager.getInstance:()Lext/mods/gameserver/data/manager/ClanHallManager;
   #23 = Class              #25           // ext/mods/gameserver/data/manager/ClanHallManager
   #24 = NameAndType        #26:#27       // getInstance:()Lext/mods/gameserver/data/manager/ClanHallManager;
   #25 = Utf8               ext/mods/gameserver/data/manager/ClanHallManager
   #26 = Utf8               getInstance
   #27 = Utf8               ()Lext/mods/gameserver/data/manager/ClanHallManager;
   #28 = Methodref          #29.#30       // java/lang/Integer.parseInt:(Ljava/lang/String;)I
   #29 = Class              #31           // java/lang/Integer
   #30 = NameAndType        #32:#33       // parseInt:(Ljava/lang/String;)I
   #31 = Utf8               java/lang/Integer
   #32 = Utf8               parseInt
   #33 = Utf8               (Ljava/lang/String;)I
   #34 = Methodref          #23.#35       // ext/mods/gameserver/data/manager/ClanHallManager.getClanHall:(I)Lext/mods/gameserver/model/residence/clanhall/ClanHall;
   #35 = NameAndType        #36:#37       // getClanHall:(I)Lext/mods/gameserver/model/residence/clanhall/ClanHall;
   #36 = Utf8               getClanHall
   #37 = Utf8               (I)Lext/mods/gameserver/model/residence/clanhall/ClanHall;
   #38 = Methodref          #39.#40       // ext/mods/gameserver/handler/admincommandhandlers/AdminClanHall.showClanHallSelectPage:(Lext/mods/gameserver/model/actor/Player;)V
   #39 = Class              #41           // ext/mods/gameserver/handler/admincommandhandlers/AdminClanHall
   #40 = NameAndType        #42:#43       // showClanHallSelectPage:(Lext/mods/gameserver/model/actor/Player;)V
   #41 = Utf8               ext/mods/gameserver/handler/admincommandhandlers/AdminClanHall
   #42 = Utf8               showClanHallSelectPage
   #43 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
   #44 = Methodref          #39.#45       // ext/mods/gameserver/handler/admincommandhandlers/AdminClanHall.showClanHallSelectPage:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/residence/clanhall/ClanHall;)V
   #45 = NameAndType        #42:#46       // showClanHallSelectPage:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/residence/clanhall/ClanHall;)V
   #46 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/residence/clanhall/ClanHall;)V
   #47 = Methodref          #48.#49       // java/lang/String.hashCode:()I
   #48 = Class              #50           // java/lang/String
   #49 = NameAndType        #51:#21       // hashCode:()I
   #50 = Utf8               java/lang/String
   #51 = Utf8               hashCode
   #52 = String             #53           // set
   #53 = Utf8               set
   #54 = Methodref          #48.#55       // java/lang/String.equals:(Ljava/lang/Object;)Z
   #55 = NameAndType        #56:#57       // equals:(Ljava/lang/Object;)Z
   #56 = Utf8               equals
   #57 = Utf8               (Ljava/lang/Object;)Z
   #58 = String             #59           // remove
   #59 = Utf8               remove
   #60 = String             #61           // open
   #61 = Utf8               open
   #62 = String             #63           // close
   #63 = Utf8               close
   #64 = String             #65           // teleportto
   #65 = Utf8               teleportto
   #66 = String             #67           // end
   #67 = Utf8               end
   #68 = String             #69           // siege
   #69 = Utf8               siege
   #70 = Methodref          #39.#71       // ext/mods/gameserver/handler/admincommandhandlers/AdminClanHall.getTargetPlayer:(Lext/mods/gameserver/model/actor/Player;Z)Lext/mods/gameserver/model/actor/Player;
   #71 = NameAndType        #72:#73       // getTargetPlayer:(Lext/mods/gameserver/model/actor/Player;Z)Lext/mods/gameserver/model/actor/Player;
   #72 = Utf8               getTargetPlayer
   #73 = Utf8               (Lext/mods/gameserver/model/actor/Player;Z)Lext/mods/gameserver/model/actor/Player;
   #74 = Methodref          #75.#76       // ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
   #75 = Class              #77           // ext/mods/gameserver/model/actor/Player
   #76 = NameAndType        #78:#79       // getClan:()Lext/mods/gameserver/model/pledge/Clan;
   #77 = Utf8               ext/mods/gameserver/model/actor/Player
   #78 = Utf8               getClan
   #79 = Utf8               ()Lext/mods/gameserver/model/pledge/Clan;
   #80 = Fieldref           #81.#82       // ext/mods/gameserver/network/SystemMessageId.TARGET_IS_INCORRECT:Lext/mods/gameserver/network/SystemMessageId;
   #81 = Class              #83           // ext/mods/gameserver/network/SystemMessageId
   #82 = NameAndType        #84:#85       // TARGET_IS_INCORRECT:Lext/mods/gameserver/network/SystemMessageId;
   #83 = Utf8               ext/mods/gameserver/network/SystemMessageId
   #84 = Utf8               TARGET_IS_INCORRECT
   #85 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
   #86 = Methodref          #75.#87       // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #87 = NameAndType        #88:#89       // sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #88 = Utf8               sendPacket
   #89 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
   #90 = Methodref          #91.#92       // ext/mods/gameserver/model/residence/clanhall/ClanHall.isFree:()Z
   #91 = Class              #93           // ext/mods/gameserver/model/residence/clanhall/ClanHall
   #92 = NameAndType        #94:#95       // isFree:()Z
   #93 = Utf8               ext/mods/gameserver/model/residence/clanhall/ClanHall
   #94 = Utf8               isFree
   #95 = Utf8               ()Z
   #96 = String             #97           // This ClanHall isn\'t free.
   #97 = Utf8               This ClanHall isn\'t free.
   #98 = Methodref          #75.#99       // ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
   #99 = NameAndType        #100:#101     // sendMessage:(Ljava/lang/String;)V
  #100 = Utf8               sendMessage
  #101 = Utf8               (Ljava/lang/String;)V
  #102 = Methodref          #103.#104     // ext/mods/gameserver/model/pledge/Clan.hasClanHall:()Z
  #103 = Class              #105          // ext/mods/gameserver/model/pledge/Clan
  #104 = NameAndType        #106:#95      // hasClanHall:()Z
  #105 = Utf8               ext/mods/gameserver/model/pledge/Clan
  #106 = Utf8               hasClanHall
  #107 = String             #108          // Your target already owns a ClanHall.
  #108 = Utf8               Your target already owns a ClanHall.
  #109 = Methodref          #91.#110      // ext/mods/gameserver/model/residence/clanhall/ClanHall.setOwner:(Lext/mods/gameserver/model/pledge/Clan;)V
  #110 = NameAndType        #111:#112     // setOwner:(Lext/mods/gameserver/model/pledge/Clan;)V
  #111 = Utf8               setOwner
  #112 = Utf8               (Lext/mods/gameserver/model/pledge/Clan;)V
  #113 = String             #114          // This ClanHall is already free.
  #114 = Utf8               This ClanHall is already free.
  #115 = Methodref          #91.#116      // ext/mods/gameserver/model/residence/clanhall/ClanHall.free:()V
  #116 = NameAndType        #117:#6       // free:()V
  #117 = Utf8               free
  #118 = Methodref          #91.#119      // ext/mods/gameserver/model/residence/clanhall/ClanHall.openDoors:()V
  #119 = NameAndType        #120:#6       // openDoors:()V
  #120 = Utf8               openDoors
  #121 = Methodref          #91.#122      // ext/mods/gameserver/model/residence/clanhall/ClanHall.closeDoors:()V
  #122 = NameAndType        #123:#6       // closeDoors:()V
  #123 = Utf8               closeDoors
  #124 = Fieldref           #125.#126     // ext/mods/gameserver/enums/SpawnType.OWNER:Lext/mods/gameserver/enums/SpawnType;
  #125 = Class              #127          // ext/mods/gameserver/enums/SpawnType
  #126 = NameAndType        #128:#129     // OWNER:Lext/mods/gameserver/enums/SpawnType;
  #127 = Utf8               ext/mods/gameserver/enums/SpawnType
  #128 = Utf8               OWNER
  #129 = Utf8               Lext/mods/gameserver/enums/SpawnType;
  #130 = Methodref          #91.#131      // ext/mods/gameserver/model/residence/clanhall/ClanHall.getRndSpawn:(Lext/mods/gameserver/enums/SpawnType;)Lext/mods/gameserver/model/location/Location;
  #131 = NameAndType        #132:#133     // getRndSpawn:(Lext/mods/gameserver/enums/SpawnType;)Lext/mods/gameserver/model/location/Location;
  #132 = Utf8               getRndSpawn
  #133 = Utf8               (Lext/mods/gameserver/enums/SpawnType;)Lext/mods/gameserver/model/location/Location;
  #134 = Methodref          #75.#135      // ext/mods/gameserver/model/actor/Player.teleportTo:(Lext/mods/gameserver/model/location/Location;I)V
  #135 = NameAndType        #136:#137     // teleportTo:(Lext/mods/gameserver/model/location/Location;I)V
  #136 = Utf8               teleportTo
  #137 = Utf8               (Lext/mods/gameserver/model/location/Location;I)V
  #138 = Methodref          #91.#139      // ext/mods/gameserver/model/residence/clanhall/ClanHall.getAuction:()Lext/mods/gameserver/model/residence/clanhall/Auction;
  #139 = NameAndType        #140:#141     // getAuction:()Lext/mods/gameserver/model/residence/clanhall/Auction;
  #140 = Utf8               getAuction
  #141 = Utf8               ()Lext/mods/gameserver/model/residence/clanhall/Auction;
  #142 = String             #143          // This ClanHall doesn\'t hold an auction.
  #143 = Utf8               This ClanHall doesn\'t hold an auction.
  #144 = Methodref          #145.#146     // ext/mods/gameserver/model/residence/clanhall/Auction.endAuction:()V
  #145 = Class              #147          // ext/mods/gameserver/model/residence/clanhall/Auction
  #146 = NameAndType        #148:#6       // endAuction:()V
  #147 = Utf8               ext/mods/gameserver/model/residence/clanhall/Auction
  #148 = Utf8               endAuction
  #149 = Methodref          #150.#151     // ext/mods/commons/lang/StringUtil.isDigit:(Ljava/lang/String;)Z
  #150 = Class              #152          // ext/mods/commons/lang/StringUtil
  #151 = NameAndType        #153:#154     // isDigit:(Ljava/lang/String;)Z
  #152 = Utf8               ext/mods/commons/lang/StringUtil
  #153 = Utf8               isDigit
  #154 = Utf8               (Ljava/lang/String;)Z
  #155 = String             #156          // Usage: //ch siege start|end chId.
  #156 = Utf8               Usage: //ch siege start|end chId.
  #157 = Class              #158          // ext/mods/gameserver/model/residence/clanhall/SiegableHall
  #158 = Utf8               ext/mods/gameserver/model/residence/clanhall/SiegableHall
  #159 = String             #160          // This ClanHall isn\'t siegable.
  #160 = Utf8               This ClanHall isn\'t siegable.
  #161 = String             #162          // start
  #162 = Utf8               start
  #163 = Methodref          #157.#164     // ext/mods/gameserver/model/residence/clanhall/SiegableHall.isInSiege:()Z
  #164 = NameAndType        #165:#95      // isInSiege:()Z
  #165 = Utf8               isInSiege
  #166 = String             #167          // This ClanHall is already besieged.
  #167 = Utf8               This ClanHall is already besieged.
  #168 = Methodref          #157.#169     // ext/mods/gameserver/model/residence/clanhall/SiegableHall.getSiege:()Lext/mods/gameserver/model/residence/clanhall/ClanHallSiege;
  #169 = NameAndType        #170:#171     // getSiege:()Lext/mods/gameserver/model/residence/clanhall/ClanHallSiege;
  #170 = Utf8               getSiege
  #171 = Utf8               ()Lext/mods/gameserver/model/residence/clanhall/ClanHallSiege;
  #172 = Methodref          #173.#174     // ext/mods/gameserver/model/residence/clanhall/ClanHallSiege.instantSiege:()V
  #173 = Class              #175          // ext/mods/gameserver/model/residence/clanhall/ClanHallSiege
  #174 = NameAndType        #176:#6       // instantSiege:()V
  #175 = Utf8               ext/mods/gameserver/model/residence/clanhall/ClanHallSiege
  #176 = Utf8               instantSiege
  #177 = String             #178          // This ClanHall isn\'t currently besieged.
  #178 = Utf8               This ClanHall isn\'t currently besieged.
  #179 = Methodref          #173.#180     // ext/mods/gameserver/model/residence/clanhall/ClanHallSiege.endSiege:()V
  #180 = NameAndType        #181:#6       // endSiege:()V
  #181 = Utf8               endSiege
  #182 = Class              #183          // java/lang/Exception
  #183 = Utf8               java/lang/Exception
  #184 = String             #185          // Usage: //ch [set|remove|open|close|teleportto|end|siege chId].
  #185 = Utf8               Usage: //ch [set|remove|open|close|teleportto|end|siege chId].
  #186 = String             #187          // None
  #187 = Utf8               None
  #188 = Methodref          #189.#190     // ext/mods/gameserver/data/sql/ClanTable.getInstance:()Lext/mods/gameserver/data/sql/ClanTable;
  #189 = Class              #191          // ext/mods/gameserver/data/sql/ClanTable
  #190 = NameAndType        #26:#192      // getInstance:()Lext/mods/gameserver/data/sql/ClanTable;
  #191 = Utf8               ext/mods/gameserver/data/sql/ClanTable
  #192 = Utf8               ()Lext/mods/gameserver/data/sql/ClanTable;
  #193 = Methodref          #91.#194      // ext/mods/gameserver/model/residence/clanhall/ClanHall.getOwnerId:()I
  #194 = NameAndType        #195:#21      // getOwnerId:()I
  #195 = Utf8               getOwnerId
  #196 = Methodref          #189.#197     // ext/mods/gameserver/data/sql/ClanTable.getClan:(I)Lext/mods/gameserver/model/pledge/Clan;
  #197 = NameAndType        #78:#198      // getClan:(I)Lext/mods/gameserver/model/pledge/Clan;
  #198 = Utf8               (I)Lext/mods/gameserver/model/pledge/Clan;
  #199 = Methodref          #103.#200     // ext/mods/gameserver/model/pledge/Clan.getName:()Ljava/lang/String;
  #200 = NameAndType        #201:#17      // getName:()Ljava/lang/String;
  #201 = Utf8               getName
  #202 = Class              #203          // java/text/SimpleDateFormat
  #203 = Utf8               java/text/SimpleDateFormat
  #204 = String             #205          // yyyy-MM-dd
  #205 = Utf8               yyyy-MM-dd
  #206 = Methodref          #202.#207     // java/text/SimpleDateFormat."<init>":(Ljava/lang/String;)V
  #207 = NameAndType        #5:#101       // "<init>":(Ljava/lang/String;)V
  #208 = Class              #209          // java/lang/StringBuilder
  #209 = Utf8               java/lang/StringBuilder
  #210 = Methodref          #208.#3       // java/lang/StringBuilder."<init>":()V
  #211 = String             #212          // <tr><td>This clanhall doesn\'t have Auction.</td></tr>
  #212 = Utf8               <tr><td>This clanhall doesn\'t have Auction.</td></tr>
  #213 = Methodref          #208.#214     // java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
  #214 = NameAndType        #215:#216     // append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
  #215 = Utf8               append
  #216 = Utf8               (Ljava/lang/String;)Ljava/lang/StringBuilder;
  #217 = Methodref          #145.#218     // ext/mods/gameserver/model/residence/clanhall/Auction.getHighestBidder:()Lext/mods/gameserver/model/residence/clanhall/Bidder;
  #218 = NameAndType        #219:#220     // getHighestBidder:()Lext/mods/gameserver/model/residence/clanhall/Bidder;
  #219 = Utf8               getHighestBidder
  #220 = Utf8               ()Lext/mods/gameserver/model/residence/clanhall/Bidder;
  #221 = String             #222          // <tr><td width=150>Bid: 0</td><td width=120>Bidders:
  #222 = Utf8               <tr><td width=150>Bid: 0</td><td width=120>Bidders:
  #223 = Methodref          #145.#224     // ext/mods/gameserver/model/residence/clanhall/Auction.getBidders:()Ljava/util/Map;
  #224 = NameAndType        #225:#226     // getBidders:()Ljava/util/Map;
  #225 = Utf8               getBidders
  #226 = Utf8               ()Ljava/util/Map;
  #227 = InterfaceMethodref #228.#229     // java/util/Map.size:()I
  #228 = Class              #230          // java/util/Map
  #229 = NameAndType        #231:#21      // size:()I
  #230 = Utf8               java/util/Map
  #231 = Utf8               size
  #232 = Methodref          #29.#233      // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
  #233 = NameAndType        #234:#235     // valueOf:(I)Ljava/lang/Integer;
  #234 = Utf8               valueOf
  #235 = Utf8               (I)Ljava/lang/Integer;
  #236 = String             #237          // </td></tr><tr><td>End date:
  #237 = Utf8               </td></tr><tr><td>End date:
  #238 = Methodref          #145.#239     // ext/mods/gameserver/model/residence/clanhall/Auction.getEndDate:()J
  #239 = NameAndType        #240:#241     // getEndDate:()J
  #240 = Utf8               getEndDate
  #241 = Utf8               ()J
  #242 = Methodref          #243.#244     // java/lang/Long.valueOf:(J)Ljava/lang/Long;
  #243 = Class              #245          // java/lang/Long
  #244 = NameAndType        #234:#246     // valueOf:(J)Ljava/lang/Long;
  #245 = Utf8               java/lang/Long
  #246 = Utf8               (J)Ljava/lang/Long;
  #247 = Methodref          #202.#248     // java/text/SimpleDateFormat.format:(Ljava/lang/Object;)Ljava/lang/String;
  #248 = NameAndType        #249:#250     // format:(Ljava/lang/Object;)Ljava/lang/String;
  #249 = Utf8               format
  #250 = Utf8               (Ljava/lang/Object;)Ljava/lang/String;
  #251 = String             #252          // </td><td>Winner: none</td></tr>
  #252 = Utf8               </td><td>Winner: none</td></tr>
  #253 = Methodref          #150.#254     // ext/mods/commons/lang/StringUtil.append:(Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
  #254 = NameAndType        #215:#255     // append:(Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
  #255 = Utf8               (Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
  #256 = String             #257          // <tr><td width=150>Bid:
  #257 = Utf8               <tr><td width=150>Bid:
  #258 = Methodref          #259.#260     // ext/mods/gameserver/model/residence/clanhall/Bidder.getBid:()I
  #259 = Class              #261          // ext/mods/gameserver/model/residence/clanhall/Bidder
  #260 = NameAndType        #262:#21      // getBid:()I
  #261 = Utf8               ext/mods/gameserver/model/residence/clanhall/Bidder
  #262 = Utf8               getBid
  #263 = Methodref          #150.#264     // ext/mods/commons/lang/StringUtil.formatNumber:(J)Ljava/lang/String;
  #264 = NameAndType        #265:#266     // formatNumber:(J)Ljava/lang/String;
  #265 = Utf8               formatNumber
  #266 = Utf8               (J)Ljava/lang/String;
  #267 = String             #268          // </td><td width=120>Bidders:
  #268 = Utf8               </td><td width=120>Bidders:
  #269 = String             #270          // </td><td>Winner:
  #270 = Utf8               </td><td>Winner:
  #271 = Methodref          #259.#200     // ext/mods/gameserver/model/residence/clanhall/Bidder.getName:()Ljava/lang/String;
  #272 = String             #273          // </td></tr>
  #273 = Utf8               </td></tr>
  #274 = Class              #275          // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
  #275 = Utf8               ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
  #276 = Methodref          #274.#277     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
  #277 = NameAndType        #5:#278       // "<init>":(I)V
  #278 = Utf8               (I)V
  #279 = Methodref          #75.#280      // ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
  #280 = NameAndType        #281:#282     // getLocale:()Ljava/util/Locale;
  #281 = Utf8               getLocale
  #282 = Utf8               ()Ljava/util/Locale;
  #283 = String             #284          // html/admin/clanhall.htm
  #284 = Utf8               html/admin/clanhall.htm
  #285 = Methodref          #274.#286     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
  #286 = NameAndType        #287:#288     // setFile:(Ljava/util/Locale;Ljava/lang/String;)V
  #287 = Utf8               setFile
  #288 = Utf8               (Ljava/util/Locale;Ljava/lang/String;)V
  #289 = String             #290          // %name%
  #290 = Utf8               %name%
  #291 = Methodref          #91.#200      // ext/mods/gameserver/model/residence/clanhall/ClanHall.getName:()Ljava/lang/String;
  #292 = Methodref          #274.#293     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
  #293 = NameAndType        #294:#13      // replace:(Ljava/lang/String;Ljava/lang/String;)V
  #294 = Utf8               replace
  #295 = String             #296          // %id%
  #296 = Utf8               %id%
  #297 = Methodref          #91.#298      // ext/mods/gameserver/model/residence/clanhall/ClanHall.getId:()I
  #298 = NameAndType        #299:#21      // getId:()I
  #299 = Utf8               getId
  #300 = Methodref          #274.#301     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
  #301 = NameAndType        #294:#302     // replace:(Ljava/lang/String;I)V
  #302 = Utf8               (Ljava/lang/String;I)V
  #303 = String             #304          // %grade%
  #304 = Utf8               %grade%
  #305 = Methodref          #91.#306      // ext/mods/gameserver/model/residence/clanhall/ClanHall.getGrade:()I
  #306 = NameAndType        #307:#21      // getGrade:()I
  #307 = Utf8               getGrade
  #308 = String             #309          // %lease%
  #309 = Utf8               %lease%
  #310 = Methodref          #91.#311      // ext/mods/gameserver/model/residence/clanhall/ClanHall.getLease:()I
  #311 = NameAndType        #312:#21      // getLease:()I
  #312 = Utf8               getLease
  #313 = String             #314          // %loc%
  #314 = Utf8               %loc%
  #315 = Methodref          #91.#316      // ext/mods/gameserver/model/residence/clanhall/ClanHall.getTownName:()Ljava/lang/String;
  #316 = NameAndType        #317:#17      // getTownName:()Ljava/lang/String;
  #317 = Utf8               getTownName
  #318 = String             #319          // %desc%
  #319 = Utf8               %desc%
  #320 = Methodref          #91.#321      // ext/mods/gameserver/model/residence/clanhall/ClanHall.getDesc:()Ljava/lang/String;
  #321 = NameAndType        #322:#17      // getDesc:()Ljava/lang/String;
  #322 = Utf8               getDesc
  #323 = String             #324          // %defaultbid%
  #324 = Utf8               %defaultbid%
  #325 = Methodref          #91.#326      // ext/mods/gameserver/model/residence/clanhall/ClanHall.getAuctionMin:()I
  #326 = NameAndType        #327:#21      // getAuctionMin:()I
  #327 = Utf8               getAuctionMin
  #328 = String             #329          // %owner%
  #329 = Utf8               %owner%
  #330 = String             #331          // %paid%
  #331 = Utf8               %paid%
  #332 = Methodref          #91.#333      // ext/mods/gameserver/model/residence/clanhall/ClanHall.getPaid:()Z
  #333 = NameAndType        #334:#95      // getPaid:()Z
  #334 = Utf8               getPaid
  #335 = Methodref          #274.#336     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Z)V
  #336 = NameAndType        #294:#337     // replace:(Ljava/lang/String;Z)V
  #337 = Utf8               (Ljava/lang/String;Z)V
  #338 = String             #339          // %paiduntil%
  #339 = Utf8               %paiduntil%
  #340 = Methodref          #91.#341      // ext/mods/gameserver/model/residence/clanhall/ClanHall.getPaidUntil:()J
  #341 = NameAndType        #342:#241     // getPaidUntil:()J
  #342 = Utf8               getPaidUntil
  #343 = String             #344          // %auction
  #344 = Utf8               %auction
  #345 = Methodref          #208.#346     // java/lang/StringBuilder.toString:()Ljava/lang/String;
  #346 = NameAndType        #347:#17      // toString:()Ljava/lang/String;
  #347 = Utf8               toString
  #348 = Methodref          #75.#349      // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #349 = NameAndType        #88:#350      // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #350 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #351 = String             #352          // html/admin/clanhalls.htm
  #352 = Utf8               html/admin/clanhalls.htm
  #353 = Fieldref           #39.#354      // ext/mods/gameserver/handler/admincommandhandlers/AdminClanHall.LOCS:[Ljava/lang/String;
  #354 = NameAndType        #355:#356     // LOCS:[Ljava/lang/String;
  #355 = Utf8               LOCS
  #356 = Utf8               [Ljava/lang/String;
  #357 = String             #358          // <font color=\"LEVEL\">
  #358 = Utf8               <font color=\"LEVEL\">
  #359 = String             #360          // </font><br><table width=270><tr><td width=130>Clan Hall Name</td><td width=70>End Date</td><td width=70>Min Bid</td></tr>
  #360 = Utf8               </font><br><table width=270><tr><td width=130>Clan Hall Name</td><td width=70>End Date</td><td width=70>Min Bid</td></tr>
  #361 = Methodref          #23.#362      // ext/mods/gameserver/data/manager/ClanHallManager.getClanHallsByLocation:(Ljava/lang/String;)Ljava/util/List;
  #362 = NameAndType        #363:#364     // getClanHallsByLocation:(Ljava/lang/String;)Ljava/util/List;
  #363 = Utf8               getClanHallsByLocation
  #364 = Utf8               (Ljava/lang/String;)Ljava/util/List;
  #365 = InterfaceMethodref #366.#367     // java/util/List.iterator:()Ljava/util/Iterator;
  #366 = Class              #368          // java/util/List
  #367 = NameAndType        #369:#370     // iterator:()Ljava/util/Iterator;
  #368 = Utf8               java/util/List
  #369 = Utf8               iterator
  #370 = Utf8               ()Ljava/util/Iterator;
  #371 = InterfaceMethodref #372.#373     // java/util/Iterator.hasNext:()Z
  #372 = Class              #374          // java/util/Iterator
  #373 = NameAndType        #375:#95      // hasNext:()Z
  #374 = Utf8               java/util/Iterator
  #375 = Utf8               hasNext
  #376 = InterfaceMethodref #372.#377     // java/util/Iterator.next:()Ljava/lang/Object;
  #377 = NameAndType        #378:#379     // next:()Ljava/lang/Object;
  #378 = Utf8               next
  #379 = Utf8               ()Ljava/lang/Object;
  #380 = String             #381          // <tr><td><a action=\"bypass -h admin_ch
  #381 = Utf8               <tr><td><a action=\"bypass -h admin_ch
  #382 = String             #383          // \">
  #383 = Utf8               \">
  #384 = String             #385          //
  #385 = Utf8
  #386 = String             #387          // *
  #387 = Utf8               *
  #388 = String             #389          // </a></td><td>-</td><td>-</td></tr>
  #389 = Utf8               </a></td><td>-</td><td>-</td></tr>
  #390 = String             #391          //  [
  #391 = Utf8                [
  #392 = String             #393          // ]</a></td><td>
  #393 = Utf8               ]</a></td><td>
  #394 = String             #395          // </td><td>
  #395 = Utf8               </td><td>
  #396 = Methodref          #145.#397     // ext/mods/gameserver/model/residence/clanhall/Auction.getMinimumBid:()I
  #397 = NameAndType        #398:#21      // getMinimumBid:()I
  #398 = Utf8               getMinimumBid
  #399 = String             #400          // </table>
  #400 = Utf8               </table>
  #401 = String             #402          // %AGIT_LIST%
  #402 = Utf8               %AGIT_LIST%
  #403 = Fieldref           #39.#404      // ext/mods/gameserver/handler/admincommandhandlers/AdminClanHall.ADMIN_COMMANDS:[Ljava/lang/String;
  #404 = NameAndType        #405:#356     // ADMIN_COMMANDS:[Ljava/lang/String;
  #405 = Utf8               ADMIN_COMMANDS
  #406 = String             #407          // admin_ch
  #407 = Utf8               admin_ch
  #408 = String             #409          // Aden
  #409 = Utf8               Aden
  #410 = String             #411          // Dion
  #411 = Utf8               Dion
  #412 = String             #413          // Giran
  #413 = Utf8               Giran
  #414 = String             #415          // Gludin
  #415 = Utf8               Gludin
  #416 = String             #417          // Gludio
  #417 = Utf8               Gludio
  #418 = String             #419          // Goddard
  #419 = Utf8               Goddard
  #420 = String             #421          // Oren
  #421 = Utf8               Oren
  #422 = String             #423          // Rune
  #423 = Utf8               Rune
  #424 = String             #425          // Schuttgart
  #425 = Utf8               Schuttgart
  #426 = Class              #427          // ext/mods/gameserver/handler/IAdminCommandHandler
  #427 = Utf8               ext/mods/gameserver/handler/IAdminCommandHandler
  #428 = Utf8               Code
  #429 = Utf8               LineNumberTable
  #430 = Utf8               LocalVariableTable
  #431 = Utf8               this
  #432 = Utf8               Lext/mods/gameserver/handler/admincommandhandlers/AdminClanHall;
  #433 = Utf8               useAdminCommand
  #434 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
  #435 = Utf8               targetPlayer
  #436 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #437 = Utf8               auction
  #438 = Utf8               Lext/mods/gameserver/model/residence/clanhall/Auction;
  #439 = Utf8               sh
  #440 = Utf8               Lext/mods/gameserver/model/residence/clanhall/SiegableHall;
  #441 = Utf8               st
  #442 = Utf8               Ljava/util/StringTokenizer;
  #443 = Utf8               param
  #444 = Utf8               Ljava/lang/String;
  #445 = Utf8               param2
  #446 = Utf8               ch
  #447 = Utf8               Lext/mods/gameserver/model/residence/clanhall/ClanHall;
  #448 = Utf8               paramCount
  #449 = Utf8               I
  #450 = Utf8               e
  #451 = Utf8               Ljava/lang/Exception;
  #452 = Utf8               command
  #453 = Utf8               player
  #454 = Utf8               StackMapTable
  #455 = Utf8               clan
  #456 = Utf8               Lext/mods/gameserver/model/pledge/Clan;
  #457 = Utf8               clanName
  #458 = Utf8               sdf
  #459 = Utf8               Ljava/text/SimpleDateFormat;
  #460 = Utf8               sb
  #461 = Utf8               Ljava/lang/StringBuilder;
  #462 = Utf8               html
  #463 = Utf8               Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
  #464 = Utf8               loc
  #465 = Class              #356          // "[Ljava/lang/String;"
  #466 = Class              #467          // "[Ljava/lang/Object;"
  #467 = Utf8               [Ljava/lang/Object;
  #468 = Utf8               getAdminCommandList
  #469 = Utf8               ()[Ljava/lang/String;
  #470 = Utf8               <clinit>
  #471 = Utf8               SourceFile
  #472 = Utf8               AdminClanHall.java
{
  public ext.mods.gameserver.handler.admincommandhandlers.AdminClanHall();
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
            0       5     0  this   Lext/mods/gameserver/handler/admincommandhandlers/AdminClanHall;

  public void useAdminCommand(java.lang.String, ext.mods.gameserver.model.actor.Player);
    descriptor: (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=15, args_size=3
         0: new           #7                  // class java/util/StringTokenizer
         3: dup
         4: aload_1
         5: ldc           #9                  // String
         7: invokespecial #11                 // Method java/util/StringTokenizer."<init>":(Ljava/lang/String;Ljava/lang/String;)V
        10: astore_3
        11: aload_3
        12: invokevirtual #14                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
        15: pop
        16: aconst_null
        17: astore        4
        19: aconst_null
        20: astore        5
        22: aconst_null
        23: astore        6
        25: aload_3
        26: invokevirtual #18                 // Method java/util/StringTokenizer.countTokens:()I
        29: istore        7
        31: iload         7
        33: iconst_1
        34: if_icmpne     55
        37: invokestatic  #22                 // Method ext/mods/gameserver/data/manager/ClanHallManager.getInstance:()Lext/mods/gameserver/data/manager/ClanHallManager;
        40: aload_3
        41: invokevirtual #14                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
        44: invokestatic  #28                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
        47: invokevirtual #34                 // Method ext/mods/gameserver/data/manager/ClanHallManager.getClanHall:(I)Lext/mods/gameserver/model/residence/clanhall/ClanHall;
        50: astore        6
        52: goto          118
        55: iload         7
        57: iconst_2
        58: if_icmpne     85
        61: aload_3
        62: invokevirtual #14                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
        65: astore        4
        67: invokestatic  #22                 // Method ext/mods/gameserver/data/manager/ClanHallManager.getInstance:()Lext/mods/gameserver/data/manager/ClanHallManager;
        70: aload_3
        71: invokevirtual #14                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
        74: invokestatic  #28                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
        77: invokevirtual #34                 // Method ext/mods/gameserver/data/manager/ClanHallManager.getClanHall:(I)Lext/mods/gameserver/model/residence/clanhall/ClanHall;
        80: astore        6
        82: goto          118
        85: iload         7
        87: iconst_3
        88: if_icmpne     118
        91: aload_3
        92: invokevirtual #14                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
        95: astore        4
        97: aload_3
        98: invokevirtual #14                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       101: astore        5
       103: invokestatic  #22                 // Method ext/mods/gameserver/data/manager/ClanHallManager.getInstance:()Lext/mods/gameserver/data/manager/ClanHallManager;
       106: aload_3
       107: invokevirtual #14                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       110: invokestatic  #28                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       113: invokevirtual #34                 // Method ext/mods/gameserver/data/manager/ClanHallManager.getClanHall:(I)Lext/mods/gameserver/model/residence/clanhall/ClanHall;
       116: astore        6
       118: aload         6
       120: ifnonnull     128
       123: aload_2
       124: invokestatic  #38                 // Method showClanHallSelectPage:(Lext/mods/gameserver/model/actor/Player;)V
       127: return
       128: aload         4
       130: ifnonnull     140
       133: aload_2
       134: aload         6
       136: invokestatic  #44                 // Method showClanHallSelectPage:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/residence/clanhall/ClanHall;)V
       139: return
       140: aload         4
       142: astore        8
       144: iconst_m1
       145: istore        9
       147: aload         8
       149: invokevirtual #47                 // Method java/lang/String.hashCode:()I
       152: lookupswitch  { // 7

             -1484003610: 284

              -934610812: 236

                  100571: 300

                  113762: 220

                 3417674: 252

                94756344: 268

               109433325: 316
                 default: 330
            }
       220: aload         8
       222: ldc           #52                 // String set
       224: invokevirtual #54                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       227: ifeq          330
       230: iconst_0
       231: istore        9
       233: goto          330
       236: aload         8
       238: ldc           #58                 // String remove
       240: invokevirtual #54                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       243: ifeq          330
       246: iconst_1
       247: istore        9
       249: goto          330
       252: aload         8
       254: ldc           #60                 // String open
       256: invokevirtual #54                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       259: ifeq          330
       262: iconst_2
       263: istore        9
       265: goto          330
       268: aload         8
       270: ldc           #62                 // String close
       272: invokevirtual #54                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       275: ifeq          330
       278: iconst_3
       279: istore        9
       281: goto          330
       284: aload         8
       286: ldc           #64                 // String teleportto
       288: invokevirtual #54                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       291: ifeq          330
       294: iconst_4
       295: istore        9
       297: goto          330
       300: aload         8
       302: ldc           #66                 // String end
       304: invokevirtual #54                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       307: ifeq          330
       310: iconst_5
       311: istore        9
       313: goto          330
       316: aload         8
       318: ldc           #68                 // String siege
       320: invokevirtual #54                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       323: ifeq          330
       326: bipush        6
       328: istore        9
       330: iload         9
       332: tableswitch   { // 0 to 6

                       0: 376

                       1: 457

                       2: 482

                       3: 490

                       4: 498

                       5: 514

                       6: 543
                 default: 741
            }
       376: aload_0
       377: aload_2
       378: iconst_0
       379: invokevirtual #70                 // Method getTargetPlayer:(Lext/mods/gameserver/model/actor/Player;Z)Lext/mods/gameserver/model/actor/Player;
       382: astore        10
       384: aload         10
       386: ifnull        397
       389: aload         10
       391: invokevirtual #74                 // Method ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
       394: ifnonnull     407
       397: aload_2
       398: getstatic     #80                 // Field ext/mods/gameserver/network/SystemMessageId.TARGET_IS_INCORRECT:Lext/mods/gameserver/network/SystemMessageId;
       401: invokevirtual #86                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       404: goto          741
       407: aload         6
       409: invokevirtual #90                 // Method ext/mods/gameserver/model/residence/clanhall/ClanHall.isFree:()Z
       412: ifne          424
       415: aload_2
       416: ldc           #96                 // String This ClanHall isn\'t free.
       418: invokevirtual #98                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       421: goto          741
       424: aload         10
       426: invokevirtual #74                 // Method ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
       429: invokevirtual #102                // Method ext/mods/gameserver/model/pledge/Clan.hasClanHall:()Z
       432: ifeq          444
       435: aload_2
       436: ldc           #107                // String Your target already owns a ClanHall.
       438: invokevirtual #98                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       441: goto          741
       444: aload         6
       446: aload         10
       448: invokevirtual #74                 // Method ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
       451: invokevirtual #109                // Method ext/mods/gameserver/model/residence/clanhall/ClanHall.setOwner:(Lext/mods/gameserver/model/pledge/Clan;)V
       454: goto          741
       457: aload         6
       459: invokevirtual #90                 // Method ext/mods/gameserver/model/residence/clanhall/ClanHall.isFree:()Z
       462: ifeq          474
       465: aload_2
       466: ldc           #113                // String This ClanHall is already free.
       468: invokevirtual #98                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       471: goto          741
       474: aload         6
       476: invokevirtual #115                // Method ext/mods/gameserver/model/residence/clanhall/ClanHall.free:()V
       479: goto          741
       482: aload         6
       484: invokevirtual #118                // Method ext/mods/gameserver/model/residence/clanhall/ClanHall.openDoors:()V
       487: goto          741
       490: aload         6
       492: invokevirtual #121                // Method ext/mods/gameserver/model/residence/clanhall/ClanHall.closeDoors:()V
       495: goto          741
       498: aload_2
       499: aload         6
       501: getstatic     #124                // Field ext/mods/gameserver/enums/SpawnType.OWNER:Lext/mods/gameserver/enums/SpawnType;
       504: invokevirtual #130                // Method ext/mods/gameserver/model/residence/clanhall/ClanHall.getRndSpawn:(Lext/mods/gameserver/enums/SpawnType;)Lext/mods/gameserver/model/location/Location;
       507: iconst_0
       508: invokevirtual #134                // Method ext/mods/gameserver/model/actor/Player.teleportTo:(Lext/mods/gameserver/model/location/Location;I)V
       511: goto          741
       514: aload         6
       516: invokevirtual #138                // Method ext/mods/gameserver/model/residence/clanhall/ClanHall.getAuction:()Lext/mods/gameserver/model/residence/clanhall/Auction;
       519: astore        11
       521: aload         11
       523: ifnonnull     535
       526: aload_2
       527: ldc           #142                // String This ClanHall doesn\'t hold an auction.
       529: invokevirtual #98                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       532: goto          741
       535: aload         11
       537: invokevirtual #144                // Method ext/mods/gameserver/model/residence/clanhall/Auction.endAuction:()V
       540: goto          741
       543: aload         5
       545: ifnull        556
       548: aload         5
       550: invokestatic  #149                // Method ext/mods/commons/lang/StringUtil.isDigit:(Ljava/lang/String;)Z
       553: ifeq          565
       556: aload_2
       557: ldc           #155                // String Usage: //ch siege start|end chId.
       559: invokevirtual #98                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       562: goto          741
       565: aload         6
       567: instanceof    #157                // class ext/mods/gameserver/model/residence/clanhall/SiegableHall
       570: ifeq          583
       573: aload         6
       575: checkcast     #157                // class ext/mods/gameserver/model/residence/clanhall/SiegableHall
       578: astore        12
       580: goto          592
       583: aload_2
       584: ldc           #159                // String This ClanHall isn\'t siegable.
       586: invokevirtual #98                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       589: goto          741
       592: aload         5
       594: astore        13
       596: iconst_m1
       597: istore        14
       599: aload         13
       601: invokevirtual #47                 // Method java/lang/String.hashCode:()I
       604: lookupswitch  { // 2

                  100571: 648

               109757538: 632
                 default: 661
            }
       632: aload         13
       634: ldc           #161                // String start
       636: invokevirtual #54                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       639: ifeq          661
       642: iconst_0
       643: istore        14
       645: goto          661
       648: aload         13
       650: ldc           #66                 // String end
       652: invokevirtual #54                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       655: ifeq          661
       658: iconst_1
       659: istore        14
       661: iload         14
       663: lookupswitch  { // 2

                       0: 688

                       1: 716
                 default: 741
            }
       688: aload         12
       690: invokevirtual #163                // Method ext/mods/gameserver/model/residence/clanhall/SiegableHall.isInSiege:()Z
       693: ifeq          705
       696: aload_2
       697: ldc           #166                // String This ClanHall is already besieged.
       699: invokevirtual #98                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       702: goto          741
       705: aload         12
       707: invokevirtual #168                // Method ext/mods/gameserver/model/residence/clanhall/SiegableHall.getSiege:()Lext/mods/gameserver/model/residence/clanhall/ClanHallSiege;
       710: invokevirtual #172                // Method ext/mods/gameserver/model/residence/clanhall/ClanHallSiege.instantSiege:()V
       713: goto          741
       716: aload         12
       718: invokevirtual #163                // Method ext/mods/gameserver/model/residence/clanhall/SiegableHall.isInSiege:()Z
       721: ifne          733
       724: aload_2
       725: ldc           #177                // String This ClanHall isn\'t currently besieged.
       727: invokevirtual #98                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       730: goto          741
       733: aload         12
       735: invokevirtual #168                // Method ext/mods/gameserver/model/residence/clanhall/SiegableHall.getSiege:()Lext/mods/gameserver/model/residence/clanhall/ClanHallSiege;
       738: invokevirtual #179                // Method ext/mods/gameserver/model/residence/clanhall/ClanHallSiege.endSiege:()V
       741: aload_2
       742: aload         6
       744: invokestatic  #44                 // Method showClanHallSelectPage:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/residence/clanhall/ClanHall;)V
       747: goto          757
       750: astore_3
       751: aload_2
       752: ldc           #184                // String Usage: //ch [set|remove|open|close|teleportto|end|siege chId].
       754: invokevirtual #98                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       757: return
      Exception table:
         from    to  target type
             0   127   750   Class java/lang/Exception
           128   139   750   Class java/lang/Exception
           140   747   750   Class java/lang/Exception
      LineNumberTable:
        line 62: 0
        line 63: 11
        line 65: 16
        line 66: 19
        line 68: 22
        line 70: 25
        line 71: 31
        line 72: 37
        line 73: 55
        line 75: 61
        line 76: 67
        line 78: 85
        line 80: 91
        line 81: 97
        line 82: 103
        line 85: 118
        line 87: 123
        line 88: 127
        line 91: 128
        line 93: 133
        line 94: 139
        line 97: 140
        line 100: 376
        line 101: 384
        line 102: 397
        line 103: 407
        line 104: 415
        line 105: 424
        line 106: 435
        line 108: 444
        line 109: 454
        line 112: 457
        line 113: 465
        line 115: 474
        line 116: 479
        line 119: 482
        line 120: 487
        line 123: 490
        line 124: 495
        line 127: 498
        line 128: 511
        line 131: 514
        line 132: 521
        line 133: 526
        line 135: 535
        line 136: 540
        line 139: 543
        line 140: 556
        line 141: 565
        line 142: 583
        line 145: 592
        line 148: 688
        line 149: 696
        line 151: 705
        line 152: 713
        line 155: 716
        line 156: 724
        line 158: 733
        line 164: 741
        line 169: 747
        line 166: 750
        line 168: 751
        line 170: 757
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          384      73    10 targetPlayer   Lext/mods/gameserver/model/actor/Player;
          521      22    11 auction   Lext/mods/gameserver/model/residence/clanhall/Auction;
          580       3    12    sh   Lext/mods/gameserver/model/residence/clanhall/SiegableHall;
          592     149    12    sh   Lext/mods/gameserver/model/residence/clanhall/SiegableHall;
           11     736     3    st   Ljava/util/StringTokenizer;
           19     728     4 param   Ljava/lang/String;
           22     725     5 param2   Ljava/lang/String;
           25     722     6    ch   Lext/mods/gameserver/model/residence/clanhall/ClanHall;
           31     716     7 paramCount   I
          751       6     3     e   Ljava/lang/Exception;
            0     758     0  this   Lext/mods/gameserver/handler/admincommandhandlers/AdminClanHall;
            0     758     1 command   Ljava/lang/String;
            0     758     2 player   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 40
        frame_type = 255 /* full_frame */
          offset_delta = 55
          locals = [ class ext/mods/gameserver/handler/admincommandhandlers/AdminClanHall, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/util/StringTokenizer, class java/lang/String, class java/lang/String, class ext/mods/gameserver/model/residence/clanhall/ClanHall, int ]
          stack = []
        frame_type = 29 /* same */
        frame_type = 32 /* same */
        frame_type = 9 /* same */
        frame_type = 11 /* same */
        frame_type = 253 /* append */
          offset_delta = 79
          locals = [ class java/lang/String, int ]
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 13 /* same */
        frame_type = 45 /* same */
        frame_type = 252 /* append */
          offset_delta = 20
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 9 /* same */
        frame_type = 16 /* same */
        frame_type = 19 /* same */
        frame_type = 250 /* chop */
          offset_delta = 12
        frame_type = 16 /* same */
        frame_type = 7 /* same */
        frame_type = 7 /* same */
        frame_type = 7 /* same */
        frame_type = 15 /* same */
        frame_type = 253 /* append */
          offset_delta = 20
          locals = [ top, class ext/mods/gameserver/model/residence/clanhall/Auction ]
        frame_type = 249 /* chop */
          offset_delta = 7
        frame_type = 12 /* same */
        frame_type = 8 /* same */
        frame_type = 17 /* same */
        frame_type = 254 /* append */
          offset_delta = 8
          locals = [ top, top, class ext/mods/gameserver/model/residence/clanhall/SiegableHall ]
        frame_type = 253 /* append */
          offset_delta = 39
          locals = [ class java/lang/String, int ]
        frame_type = 15 /* same */
        frame_type = 12 /* same */
        frame_type = 26 /* same */
        frame_type = 16 /* same */
        frame_type = 10 /* same */
        frame_type = 16 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 7
          locals = [ class ext/mods/gameserver/handler/admincommandhandlers/AdminClanHall, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/util/StringTokenizer, class java/lang/String, class java/lang/String, class ext/mods/gameserver/model/residence/clanhall/ClanHall, int ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 8
          locals = [ class ext/mods/gameserver/handler/admincommandhandlers/AdminClanHall, class java/lang/String, class ext/mods/gameserver/model/actor/Player ]
          stack = [ class java/lang/Exception ]
        frame_type = 6 /* same */

  public java.lang.String[] getAdminCommandList();
    descriptor: ()[Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #403                // Field ADMIN_COMMANDS:[Ljava/lang/String;
         3: areturn
      LineNumberTable:
        line 249: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/handler/admincommandhandlers/AdminClanHall;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: iconst_1
         1: anewarray     #48                 // class java/lang/String
         4: dup
         5: iconst_0
         6: ldc_w         #406                // String admin_ch
         9: aastore
        10: putstatic     #403                // Field ADMIN_COMMANDS:[Ljava/lang/String;
        13: bipush        9
        15: anewarray     #48                 // class java/lang/String
        18: dup
        19: iconst_0
        20: ldc_w         #408                // String Aden
        23: aastore
        24: dup
        25: iconst_1
        26: ldc_w         #410                // String Dion
        29: aastore
        30: dup
        31: iconst_2
        32: ldc_w         #412                // String Giran
        35: aastore
        36: dup
        37: iconst_3
        38: ldc_w         #414                // String Gludin
        41: aastore
        42: dup
        43: iconst_4
        44: ldc_w         #416                // String Gludio
        47: aastore
        48: dup
        49: iconst_5
        50: ldc_w         #418                // String Goddard
        53: aastore
        54: dup
        55: bipush        6
        57: ldc_w         #420                // String Oren
        60: aastore
        61: dup
        62: bipush        7
        64: ldc_w         #422                // String Rune
        67: aastore
        68: dup
        69: bipush        8
        71: ldc_w         #424                // String Schuttgart
        74: aastore
        75: putstatic     #353                // Field LOCS:[Ljava/lang/String;
        78: return
      LineNumberTable:
        line 39: 0
        line 44: 13
}
SourceFile: "AdminClanHall.java"
