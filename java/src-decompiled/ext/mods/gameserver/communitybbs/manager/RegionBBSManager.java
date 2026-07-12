// Bytecode for: ext.mods.gameserver.communitybbs.manager.RegionBBSManager
// File: ext\mods\gameserver\communitybbs\manager\RegionBBSManager.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/communitybbs/manager/RegionBBSManager.class
  Last modified 9 de jul de 2026; size 7160 bytes
  MD5 checksum 50aee065dfef055f8b04ed649623b218
  Compiled from "RegionBBSManager.java"
public class ext.mods.gameserver.communitybbs.manager.RegionBBSManager extends ext.mods.gameserver.communitybbs.manager.BaseBBSManager
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #16                         // ext/mods/gameserver/communitybbs/manager/RegionBBSManager
  super_class: #2                         // ext/mods/gameserver/communitybbs/manager/BaseBBSManager
  interfaces: 0, fields: 0, methods: 6, attributes: 4
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/gameserver/communitybbs/manager/BaseBBSManager."<init>":()V
    #2 = Class              #4            // ext/mods/gameserver/communitybbs/manager/BaseBBSManager
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               ext/mods/gameserver/communitybbs/manager/BaseBBSManager
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = String             #8            // _bbsloc
    #8 = Utf8               _bbsloc
    #9 = Methodref          #10.#11       // java/lang/String.equals:(Ljava/lang/Object;)Z
   #10 = Class              #12           // java/lang/String
   #11 = NameAndType        #13:#14       // equals:(Ljava/lang/Object;)Z
   #12 = Utf8               java/lang/String
   #13 = Utf8               equals
   #14 = Utf8               (Ljava/lang/Object;)Z
   #15 = Methodref          #16.#17       // ext/mods/gameserver/communitybbs/manager/RegionBBSManager.showRegionsList:(Lext/mods/gameserver/model/actor/Player;)V
   #16 = Class              #18           // ext/mods/gameserver/communitybbs/manager/RegionBBSManager
   #17 = NameAndType        #19:#20       // showRegionsList:(Lext/mods/gameserver/model/actor/Player;)V
   #18 = Utf8               ext/mods/gameserver/communitybbs/manager/RegionBBSManager
   #19 = Utf8               showRegionsList
   #20 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
   #21 = Methodref          #10.#22       // java/lang/String.startsWith:(Ljava/lang/String;)Z
   #22 = NameAndType        #23:#24       // startsWith:(Ljava/lang/String;)Z
   #23 = Utf8               startsWith
   #24 = Utf8               (Ljava/lang/String;)Z
   #25 = Class              #26           // java/util/StringTokenizer
   #26 = Utf8               java/util/StringTokenizer
   #27 = String             #28           // ;
   #28 = Utf8               ;
   #29 = Methodref          #25.#30       // java/util/StringTokenizer."<init>":(Ljava/lang/String;Ljava/lang/String;)V
   #30 = NameAndType        #5:#31        // "<init>":(Ljava/lang/String;Ljava/lang/String;)V
   #31 = Utf8               (Ljava/lang/String;Ljava/lang/String;)V
   #32 = Methodref          #25.#33       // java/util/StringTokenizer.nextToken:()Ljava/lang/String;
   #33 = NameAndType        #34:#35       // nextToken:()Ljava/lang/String;
   #34 = Utf8               nextToken
   #35 = Utf8               ()Ljava/lang/String;
   #36 = Methodref          #37.#38       // java/lang/Integer.parseInt:(Ljava/lang/String;)I
   #37 = Class              #39           // java/lang/Integer
   #38 = NameAndType        #40:#41       // parseInt:(Ljava/lang/String;)I
   #39 = Utf8               java/lang/Integer
   #40 = Utf8               parseInt
   #41 = Utf8               (Ljava/lang/String;)I
   #42 = Methodref          #16.#43       // ext/mods/gameserver/communitybbs/manager/RegionBBSManager.showRegion:(Lext/mods/gameserver/model/actor/Player;I)V
   #43 = NameAndType        #44:#45       // showRegion:(Lext/mods/gameserver/model/actor/Player;I)V
   #44 = Utf8               showRegion
   #45 = Utf8               (Lext/mods/gameserver/model/actor/Player;I)V
   #46 = Methodref          #2.#47        // ext/mods/gameserver/communitybbs/manager/BaseBBSManager.parseCmd:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
   #47 = NameAndType        #48:#49       // parseCmd:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
   #48 = Utf8               parseCmd
   #49 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
   #50 = String             #51           // region/
   #51 = Utf8               region/
   #52 = Methodref          #53.#54       // ext/mods/gameserver/data/HTMLData.getInstance:()Lext/mods/gameserver/data/HTMLData;
   #53 = Class              #55           // ext/mods/gameserver/data/HTMLData
   #54 = NameAndType        #56:#57       // getInstance:()Lext/mods/gameserver/data/HTMLData;
   #55 = Utf8               ext/mods/gameserver/data/HTMLData
   #56 = Utf8               getInstance
   #57 = Utf8               ()Lext/mods/gameserver/data/HTMLData;
   #58 = String             #59           // html/CommunityBoard/region/castlelist.htm
   #59 = Utf8               html/CommunityBoard/region/castlelist.htm
   #60 = Methodref          #53.#61       // ext/mods/gameserver/data/HTMLData.getHtm:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Ljava/lang/String;
   #61 = NameAndType        #62:#63       // getHtm:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Ljava/lang/String;
   #62 = Utf8               getHtm
   #63 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Ljava/lang/String;
   #64 = Class              #65           // java/lang/StringBuilder
   #65 = Utf8               java/lang/StringBuilder
   #66 = Methodref          #64.#67       // java/lang/StringBuilder."<init>":(I)V
   #67 = NameAndType        #5:#68        // "<init>":(I)V
   #68 = Utf8               (I)V
   #69 = Methodref          #70.#71       // ext/mods/gameserver/data/manager/CastleManager.getInstance:()Lext/mods/gameserver/data/manager/CastleManager;
   #70 = Class              #72           // ext/mods/gameserver/data/manager/CastleManager
   #71 = NameAndType        #56:#73       // getInstance:()Lext/mods/gameserver/data/manager/CastleManager;
   #72 = Utf8               ext/mods/gameserver/data/manager/CastleManager
   #73 = Utf8               ()Lext/mods/gameserver/data/manager/CastleManager;
   #74 = Methodref          #70.#75       // ext/mods/gameserver/data/manager/CastleManager.getCastles:()Ljava/util/Collection;
   #75 = NameAndType        #76:#77       // getCastles:()Ljava/util/Collection;
   #76 = Utf8               getCastles
   #77 = Utf8               ()Ljava/util/Collection;
   #78 = InterfaceMethodref #79.#80       // java/util/Collection.iterator:()Ljava/util/Iterator;
   #79 = Class              #81           // java/util/Collection
   #80 = NameAndType        #82:#83       // iterator:()Ljava/util/Iterator;
   #81 = Utf8               java/util/Collection
   #82 = Utf8               iterator
   #83 = Utf8               ()Ljava/util/Iterator;
   #84 = InterfaceMethodref #85.#86       // java/util/Iterator.hasNext:()Z
   #85 = Class              #87           // java/util/Iterator
   #86 = NameAndType        #88:#89       // hasNext:()Z
   #87 = Utf8               java/util/Iterator
   #88 = Utf8               hasNext
   #89 = Utf8               ()Z
   #90 = InterfaceMethodref #85.#91       // java/util/Iterator.next:()Ljava/lang/Object;
   #91 = NameAndType        #92:#93       // next:()Ljava/lang/Object;
   #92 = Utf8               next
   #93 = Utf8               ()Ljava/lang/Object;
   #94 = Class              #95           // ext/mods/gameserver/model/residence/castle/Castle
   #95 = Utf8               ext/mods/gameserver/model/residence/castle/Castle
   #96 = Methodref          #97.#98       // ext/mods/gameserver/data/sql/ClanTable.getInstance:()Lext/mods/gameserver/data/sql/ClanTable;
   #97 = Class              #99           // ext/mods/gameserver/data/sql/ClanTable
   #98 = NameAndType        #56:#100      // getInstance:()Lext/mods/gameserver/data/sql/ClanTable;
   #99 = Utf8               ext/mods/gameserver/data/sql/ClanTable
  #100 = Utf8               ()Lext/mods/gameserver/data/sql/ClanTable;
  #101 = Methodref          #94.#102      // ext/mods/gameserver/model/residence/castle/Castle.getOwnerId:()I
  #102 = NameAndType        #103:#104     // getOwnerId:()I
  #103 = Utf8               getOwnerId
  #104 = Utf8               ()I
  #105 = Methodref          #97.#106      // ext/mods/gameserver/data/sql/ClanTable.getClan:(I)Lext/mods/gameserver/model/pledge/Clan;
  #106 = NameAndType        #107:#108     // getClan:(I)Lext/mods/gameserver/model/pledge/Clan;
  #107 = Utf8               getClan
  #108 = Utf8               (I)Lext/mods/gameserver/model/pledge/Clan;
  #109 = Class              #110          // java/lang/Object
  #110 = Utf8               java/lang/Object
  #111 = String             #112          // <table><tr><td width=5></td><td width=160><a action=\"bypass _bbsloc;
  #112 = Utf8               <table><tr><td width=5></td><td width=160><a action=\"bypass _bbsloc;
  #113 = Methodref          #94.#114      // ext/mods/gameserver/model/residence/castle/Castle.getId:()I
  #114 = NameAndType        #115:#104     // getId:()I
  #115 = Utf8               getId
  #116 = Methodref          #37.#117      // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
  #117 = NameAndType        #118:#119     // valueOf:(I)Ljava/lang/Integer;
  #118 = Utf8               valueOf
  #119 = Utf8               (I)Ljava/lang/Integer;
  #120 = String             #121          // \">
  #121 = Utf8               \">
  #122 = Methodref          #94.#123      // ext/mods/gameserver/model/residence/castle/Castle.getName:()Ljava/lang/String;
  #123 = NameAndType        #124:#35      // getName:()Ljava/lang/String;
  #124 = Utf8               getName
  #125 = String             #126          // </a></td><td width=160>
  #126 = Utf8               </a></td><td width=160>
  #127 = Methodref          #128.#129     // ext/mods/gameserver/model/pledge/Clan.getClanId:()I
  #128 = Class              #130          // ext/mods/gameserver/model/pledge/Clan
  #129 = NameAndType        #131:#104     // getClanId:()I
  #130 = Utf8               ext/mods/gameserver/model/pledge/Clan
  #131 = Utf8               getClanId
  #132 = Methodref          #128.#123     // ext/mods/gameserver/model/pledge/Clan.getName:()Ljava/lang/String;
  #133 = InvokeDynamic      #0:#134       // #0:makeConcatWithConstants:(ILjava/lang/String;)Ljava/lang/String;
  #134 = NameAndType        #135:#136     // makeConcatWithConstants:(ILjava/lang/String;)Ljava/lang/String;
  #135 = Utf8               makeConcatWithConstants
  #136 = Utf8               (ILjava/lang/String;)Ljava/lang/String;
  #137 = Methodref          #138.#139     // ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
  #138 = Class              #140          // ext/mods/gameserver/model/actor/Player
  #139 = NameAndType        #141:#142     // getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
  #140 = Utf8               ext/mods/gameserver/model/actor/Player
  #141 = Utf8               getSysString
  #142 = Utf8               (I[Ljava/lang/Object;)Ljava/lang/String;
  #143 = String             #144          // </td><td width=160>
  #144 = Utf8               </td><td width=160>
  #145 = Methodref          #128.#146     // ext/mods/gameserver/model/pledge/Clan.getAllyId:()I
  #146 = NameAndType        #147:#104     // getAllyId:()I
  #147 = Utf8               getAllyId
  #148 = Methodref          #128.#149     // ext/mods/gameserver/model/pledge/Clan.getAllyName:()Ljava/lang/String;
  #149 = NameAndType        #150:#35      // getAllyName:()Ljava/lang/String;
  #150 = Utf8               getAllyName
  #151 = String             #152          // </td><td width=120>
  #152 = Utf8               </td><td width=120>
  #153 = Methodref          #94.#154      // ext/mods/gameserver/model/residence/castle/Castle.getCurrentTaxPercent:()I
  #154 = NameAndType        #155:#104     // getCurrentTaxPercent:()I
  #155 = Utf8               getCurrentTaxPercent
  #156 = String             #157          // 0
  #157 = Utf8               0
  #158 = String             #159          // </td><td width=5></td></tr></table><br1><img src=\"L2UI.Squaregray\" width=605 height=1><br1>
  #159 = Utf8               </td><td width=5></td></tr></table><br1><img src=\"L2UI.Squaregray\" width=605 height=1><br1>
  #160 = Methodref          #161.#162     // ext/mods/commons/lang/StringUtil.append:(Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
  #161 = Class              #163          // ext/mods/commons/lang/StringUtil
  #162 = NameAndType        #164:#165     // append:(Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
  #163 = Utf8               ext/mods/commons/lang/StringUtil
  #164 = Utf8               append
  #165 = Utf8               (Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
  #166 = String             #167          // %castleList%
  #167 = Utf8               %castleList%
  #168 = Methodref          #64.#169      // java/lang/StringBuilder.toString:()Ljava/lang/String;
  #169 = NameAndType        #170:#35      // toString:()Ljava/lang/String;
  #170 = Utf8               toString
  #171 = Methodref          #10.#172      // java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
  #172 = NameAndType        #173:#174     // replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
  #173 = Utf8               replace
  #174 = Utf8               (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
  #175 = Methodref          #16.#176      // ext/mods/gameserver/communitybbs/manager/RegionBBSManager.separateAndSend:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
  #176 = NameAndType        #177:#49      // separateAndSend:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
  #177 = Utf8               separateAndSend
  #178 = Methodref          #70.#179      // ext/mods/gameserver/data/manager/CastleManager.getCastleById:(I)Lext/mods/gameserver/model/residence/castle/Castle;
  #179 = NameAndType        #180:#181     // getCastleById:(I)Lext/mods/gameserver/model/residence/castle/Castle;
  #180 = Utf8               getCastleById
  #181 = Utf8               (I)Lext/mods/gameserver/model/residence/castle/Castle;
  #182 = String             #183          // html/CommunityBoard/region/castle.htm
  #183 = Utf8               html/CommunityBoard/region/castle.htm
  #184 = String             #185          // %castleName%
  #185 = Utf8               %castleName%
  #186 = String             #187          // %tax%
  #187 = Utf8               %tax%
  #188 = Methodref          #37.#189      // java/lang/Integer.toString:(I)Ljava/lang/String;
  #189 = NameAndType        #170:#190     // toString:(I)Ljava/lang/String;
  #190 = Utf8               (I)Ljava/lang/String;
  #191 = String             #192          // %lord%
  #192 = Utf8               %lord%
  #193 = Methodref          #128.#194     // ext/mods/gameserver/model/pledge/Clan.getLeaderName:()Ljava/lang/String;
  #194 = NameAndType        #195:#35      // getLeaderName:()Ljava/lang/String;
  #195 = Utf8               getLeaderName
  #196 = String             #197          // %clanName%
  #197 = Utf8               %clanName%
  #198 = String             #199          // %allyName%
  #199 = Utf8               %allyName%
  #200 = String             #201          // %siegeDate%
  #201 = Utf8               %siegeDate%
  #202 = Class              #203          // java/text/SimpleDateFormat
  #203 = Utf8               java/text/SimpleDateFormat
  #204 = String             #205          // yyyy-MM-dd HH:mm
  #205 = Utf8               yyyy-MM-dd HH:mm
  #206 = Methodref          #202.#207     // java/text/SimpleDateFormat."<init>":(Ljava/lang/String;)V
  #207 = NameAndType        #5:#208       // "<init>":(Ljava/lang/String;)V
  #208 = Utf8               (Ljava/lang/String;)V
  #209 = Methodref          #94.#210      // ext/mods/gameserver/model/residence/castle/Castle.getSiegeDate:()Ljava/util/Calendar;
  #210 = NameAndType        #211:#212     // getSiegeDate:()Ljava/util/Calendar;
  #211 = Utf8               getSiegeDate
  #212 = Utf8               ()Ljava/util/Calendar;
  #213 = Methodref          #214.#215     // java/util/Calendar.getTimeInMillis:()J
  #214 = Class              #216          // java/util/Calendar
  #215 = NameAndType        #217:#218     // getTimeInMillis:()J
  #216 = Utf8               java/util/Calendar
  #217 = Utf8               getTimeInMillis
  #218 = Utf8               ()J
  #219 = Methodref          #220.#221     // java/lang/Long.valueOf:(J)Ljava/lang/Long;
  #220 = Class              #222          // java/lang/Long
  #221 = NameAndType        #118:#223     // valueOf:(J)Ljava/lang/Long;
  #222 = Utf8               java/lang/Long
  #223 = Utf8               (J)Ljava/lang/Long;
  #224 = Methodref          #202.#225     // java/text/SimpleDateFormat.format:(Ljava/lang/Object;)Ljava/lang/String;
  #225 = NameAndType        #226:#227     // format:(Ljava/lang/Object;)Ljava/lang/String;
  #226 = Utf8               format
  #227 = Utf8               (Ljava/lang/Object;)Ljava/lang/String;
  #228 = Methodref          #229.#230     // ext/mods/gameserver/data/manager/ClanHallManager.getInstance:()Lext/mods/gameserver/data/manager/ClanHallManager;
  #229 = Class              #231          // ext/mods/gameserver/data/manager/ClanHallManager
  #230 = NameAndType        #56:#232      // getInstance:()Lext/mods/gameserver/data/manager/ClanHallManager;
  #231 = Utf8               ext/mods/gameserver/data/manager/ClanHallManager
  #232 = Utf8               ()Lext/mods/gameserver/data/manager/ClanHallManager;
  #233 = Methodref          #229.#234     // ext/mods/gameserver/data/manager/ClanHallManager.getClanHallsByLocation:(Ljava/lang/String;)Ljava/util/List;
  #234 = NameAndType        #235:#236     // getClanHallsByLocation:(Ljava/lang/String;)Ljava/util/List;
  #235 = Utf8               getClanHallsByLocation
  #236 = Utf8               (Ljava/lang/String;)Ljava/util/List;
  #237 = InterfaceMethodref #238.#239     // java/util/List.isEmpty:()Z
  #238 = Class              #240          // java/util/List
  #239 = NameAndType        #241:#89      // isEmpty:()Z
  #240 = Utf8               java/util/List
  #241 = Utf8               isEmpty
  #242 = String             #243          // <br><br><table width=610 bgcolor=A7A19A><tr><td width=5></td><td width=200>Clan Hall Name</td><td width=200>Owning Clan</td><td width=200>Clan Leader Name</td><td width=5></td></tr></table><br1>
  #243 = Utf8               <br><br><table width=610 bgcolor=A7A19A><tr><td width=5></td><td width=200>Clan Hall Name</td><td width=200>Owning Clan</td><td width=200>Clan Leader Name</td><td width=5></td></tr></table><br1>
  #244 = Methodref          #64.#245      // java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
  #245 = NameAndType        #164:#246     // append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
  #246 = Utf8               (Ljava/lang/String;)Ljava/lang/StringBuilder;
  #247 = InterfaceMethodref #238.#80      // java/util/List.iterator:()Ljava/util/Iterator;
  #248 = Class              #249          // ext/mods/gameserver/model/residence/clanhall/ClanHall
  #249 = Utf8               ext/mods/gameserver/model/residence/clanhall/ClanHall
  #250 = Methodref          #248.#102     // ext/mods/gameserver/model/residence/clanhall/ClanHall.getOwnerId:()I
  #251 = String             #252          // <table><tr><td width=5></td><td width=200>
  #252 = Utf8               <table><tr><td width=5></td><td width=200>
  #253 = Methodref          #248.#123     // ext/mods/gameserver/model/residence/clanhall/ClanHall.getName:()Ljava/lang/String;
  #254 = String             #255          // </td><td width=200>
  #255 = Utf8               </td><td width=200>
  #256 = String             #257          // %hallsList%
  #257 = Utf8               %hallsList%
  #258 = Fieldref           #259.#260     // ext/mods/gameserver/communitybbs/manager/RegionBBSManager$SingletonHolder.INSTANCE:Lext/mods/gameserver/communitybbs/manager/RegionBBSManager;
  #259 = Class              #261          // ext/mods/gameserver/communitybbs/manager/RegionBBSManager$SingletonHolder
  #260 = NameAndType        #262:#263     // INSTANCE:Lext/mods/gameserver/communitybbs/manager/RegionBBSManager;
  #261 = Utf8               ext/mods/gameserver/communitybbs/manager/RegionBBSManager$SingletonHolder
  #262 = Utf8               INSTANCE
  #263 = Utf8               Lext/mods/gameserver/communitybbs/manager/RegionBBSManager;
  #264 = Utf8               Code
  #265 = Utf8               LineNumberTable
  #266 = Utf8               LocalVariableTable
  #267 = Utf8               this
  #268 = Utf8               st
  #269 = Utf8               Ljava/util/StringTokenizer;
  #270 = Utf8               command
  #271 = Utf8               Ljava/lang/String;
  #272 = Utf8               player
  #273 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #274 = Utf8               StackMapTable
  #275 = Utf8               getFolder
  #276 = Utf8               owner
  #277 = Utf8               Lext/mods/gameserver/model/pledge/Clan;
  #278 = Utf8               castle
  #279 = Utf8               Lext/mods/gameserver/model/residence/castle/Castle;
  #280 = Utf8               content
  #281 = Utf8               sb
  #282 = Utf8               Ljava/lang/StringBuilder;
  #283 = Class              #284          // "[Ljava/lang/Object;"
  #284 = Utf8               [Ljava/lang/Object;
  #285 = Class              #286          // java/io/Serializable
  #286 = Utf8               java/io/Serializable
  #287 = Utf8               chOwner
  #288 = Utf8               ch
  #289 = Utf8               Lext/mods/gameserver/model/residence/clanhall/ClanHall;
  #290 = Utf8               castleId
  #291 = Utf8               I
  #292 = Utf8               clanHalls
  #293 = Utf8               Ljava/util/List;
  #294 = Utf8               LocalVariableTypeTable
  #295 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/residence/clanhall/ClanHall;>;
  #296 = Utf8               ()Lext/mods/gameserver/communitybbs/manager/RegionBBSManager;
  #297 = Utf8               SourceFile
  #298 = Utf8               RegionBBSManager.java
  #299 = Utf8               NestMembers
  #300 = Utf8               BootstrapMethods
  #301 = String             #302          // <a action=\"bypass _bbsclan;home;\u0001\">\u0001</a>
  #302 = Utf8               <a action=\"bypass _bbsclan;home;\u0001\">\u0001</a>
  #303 = MethodHandle       6:#304        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #304 = Methodref          #305.#306     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #305 = Class              #307          // java/lang/invoke/StringConcatFactory
  #306 = NameAndType        #135:#308     // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #307 = Utf8               java/lang/invoke/StringConcatFactory
  #308 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #309 = Utf8               InnerClasses
  #310 = Utf8               SingletonHolder
  #311 = Class              #312          // java/lang/invoke/MethodHandles$Lookup
  #312 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #313 = Class              #314          // java/lang/invoke/MethodHandles
  #314 = Utf8               java/lang/invoke/MethodHandles
  #315 = Utf8               Lookup
{
  protected ext.mods.gameserver.communitybbs.manager.RegionBBSManager();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method ext/mods/gameserver/communitybbs/manager/BaseBBSManager."<init>":()V
         4: return
      LineNumberTable:
        line 38: 0
        line 39: 4
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/communitybbs/manager/RegionBBSManager;

  public void parseCmd(java.lang.String, ext.mods.gameserver.model.actor.Player);
    descriptor: (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=4, args_size=3
         0: aload_1
         1: ldc           #7                  // String _bbsloc
         3: invokevirtual #9                  // Method java/lang/String.equals:(Ljava/lang/Object;)Z
         6: ifeq          16
         9: aload_2
        10: invokestatic  #15                 // Method showRegionsList:(Lext/mods/gameserver/model/actor/Player;)V
        13: goto          61
        16: aload_1
        17: ldc           #7                  // String _bbsloc
        19: invokevirtual #21                 // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
        22: ifeq          55
        25: new           #25                 // class java/util/StringTokenizer
        28: dup
        29: aload_1
        30: ldc           #27                 // String ;
        32: invokespecial #29                 // Method java/util/StringTokenizer."<init>":(Ljava/lang/String;Ljava/lang/String;)V
        35: astore_3
        36: aload_3
        37: invokevirtual #32                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
        40: pop
        41: aload_2
        42: aload_3
        43: invokevirtual #32                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
        46: invokestatic  #36                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
        49: invokestatic  #42                 // Method showRegion:(Lext/mods/gameserver/model/actor/Player;I)V
        52: goto          61
        55: aload_0
        56: aload_1
        57: aload_2
        58: invokespecial #46                 // Method ext/mods/gameserver/communitybbs/manager/BaseBBSManager.parseCmd:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
        61: return
      LineNumberTable:
        line 44: 0
        line 45: 9
        line 46: 16
        line 48: 25
        line 49: 36
        line 51: 41
        line 52: 52
        line 54: 55
        line 55: 61
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           36      16     3    st   Ljava/util/StringTokenizer;
            0      62     0  this   Lext/mods/gameserver/communitybbs/manager/RegionBBSManager;
            0      62     1 command   Ljava/lang/String;
            0      62     2 player   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 3
        frame_type = 16 /* same */
        frame_type = 38 /* same */
        frame_type = 5 /* same */

  protected java.lang.String getFolder();
    descriptor: ()Ljava/lang/String;
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=1, locals=1, args_size=1
         0: ldc           #50                 // String region/
         2: areturn
      LineNumberTable:
        line 60: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       3     0  this   Lext/mods/gameserver/communitybbs/manager/RegionBBSManager;

  public static ext.mods.gameserver.communitybbs.manager.RegionBBSManager getInstance();
    descriptor: ()Lext/mods/gameserver/communitybbs/manager/RegionBBSManager;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #258                // Field ext/mods/gameserver/communitybbs/manager/RegionBBSManager$SingletonHolder.INSTANCE:Lext/mods/gameserver/communitybbs/manager/RegionBBSManager;
         3: areturn
      LineNumberTable:
        line 110: 0
}
SourceFile: "RegionBBSManager.java"
NestMembers:
  ext/mods/gameserver/communitybbs/manager/RegionBBSManager$SingletonHolder
BootstrapMethods:
  0: #303 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #301 <a action=\"bypass _bbsclan;home;\u0001\">\u0001</a>
InnerClasses:
  public static final #315= #311 of #313; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
