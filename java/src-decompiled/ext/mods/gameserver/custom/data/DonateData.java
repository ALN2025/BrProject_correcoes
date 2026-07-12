// Bytecode for: ext.mods.gameserver.custom.data.DonateData
// File: ext\mods\gameserver\custom\data\DonateData.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/custom/data/DonateData.class
  Last modified 9 de jul de 2026; size 13819 bytes
  MD5 checksum 609526f625145e552ad7409c4b97e8ad
  Compiled from "DonateData.java"
public class ext.mods.gameserver.custom.data.DonateData implements ext.mods.commons.data.xml.IXmlReader
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #11                         // ext/mods/gameserver/custom/data/DonateData
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 2, methods: 22, attributes: 4
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Class              #8            // java/util/ArrayList
    #8 = Utf8               java/util/ArrayList
    #9 = Methodref          #7.#3         // java/util/ArrayList."<init>":()V
   #10 = Fieldref           #11.#12       // ext/mods/gameserver/custom/data/DonateData._services:Ljava/util/List;
   #11 = Class              #13           // ext/mods/gameserver/custom/data/DonateData
   #12 = NameAndType        #14:#15       // _services:Ljava/util/List;
   #13 = Utf8               ext/mods/gameserver/custom/data/DonateData
   #14 = Utf8               _services
   #15 = Utf8               Ljava/util/List;
   #16 = Methodref          #11.#17       // ext/mods/gameserver/custom/data/DonateData.load:()V
   #17 = NameAndType        #18:#6        // load:()V
   #18 = Utf8               load
   #19 = InterfaceMethodref #20.#21       // java/util/List.clear:()V
   #20 = Class              #22           // java/util/List
   #21 = NameAndType        #23:#6        // clear:()V
   #22 = Utf8               java/util/List
   #23 = Utf8               clear
   #24 = String             #25           // custom/mods/donate.xml
   #25 = Utf8               custom/mods/donate.xml
   #26 = Methodref          #11.#27       // ext/mods/gameserver/custom/data/DonateData.parseDataFile:(Ljava/lang/String;)V
   #27 = NameAndType        #28:#29       // parseDataFile:(Ljava/lang/String;)V
   #28 = Utf8               parseDataFile
   #29 = Utf8               (Ljava/lang/String;)V
   #30 = Fieldref           #11.#31       // ext/mods/gameserver/custom/data/DonateData.LOGGER:Lext/mods/commons/logging/CLogger;
   #31 = NameAndType        #32:#33       // LOGGER:Lext/mods/commons/logging/CLogger;
   #32 = Utf8               LOGGER
   #33 = Utf8               Lext/mods/commons/logging/CLogger;
   #34 = String             #35           // Loaded {} Donate Service data.
   #35 = Utf8               Loaded {} Donate Service data.
   #36 = InterfaceMethodref #20.#37       // java/util/List.size:()I
   #37 = NameAndType        #38:#39       // size:()I
   #38 = Utf8               size
   #39 = Utf8               ()I
   #40 = Methodref          #41.#42       // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
   #41 = Class              #43           // java/lang/Integer
   #42 = NameAndType        #44:#45       // valueOf:(I)Ljava/lang/Integer;
   #43 = Utf8               java/lang/Integer
   #44 = Utf8               valueOf
   #45 = Utf8               (I)Ljava/lang/Integer;
   #46 = Methodref          #47.#48       // ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
   #47 = Class              #49           // ext/mods/commons/logging/CLogger
   #48 = NameAndType        #50:#51       // info:(Ljava/lang/Object;[Ljava/lang/Object;)V
   #49 = Utf8               ext/mods/commons/logging/CLogger
   #50 = Utf8               info
   #51 = Utf8               (Ljava/lang/Object;[Ljava/lang/Object;)V
   #52 = String             #53           // list
   #53 = Utf8               list
   #54 = InvokeDynamic      #0:#55        // #0:accept:(Lext/mods/gameserver/custom/data/DonateData;)Ljava/util/function/Consumer;
   #55 = NameAndType        #56:#57       // accept:(Lext/mods/gameserver/custom/data/DonateData;)Ljava/util/function/Consumer;
   #56 = Utf8               accept
   #57 = Utf8               (Lext/mods/gameserver/custom/data/DonateData;)Ljava/util/function/Consumer;
   #58 = Methodref          #11.#59       // ext/mods/gameserver/custom/data/DonateData.forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
   #59 = NameAndType        #60:#61       // forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
   #60 = Utf8               forEach
   #61 = Utf8               (Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
   #62 = InterfaceMethodref #20.#63       // java/util/List.iterator:()Ljava/util/Iterator;
   #63 = NameAndType        #64:#65       // iterator:()Ljava/util/Iterator;
   #64 = Utf8               iterator
   #65 = Utf8               ()Ljava/util/Iterator;
   #66 = InterfaceMethodref #67.#68       // java/util/Iterator.hasNext:()Z
   #67 = Class              #69           // java/util/Iterator
   #68 = NameAndType        #70:#71       // hasNext:()Z
   #69 = Utf8               java/util/Iterator
   #70 = Utf8               hasNext
   #71 = Utf8               ()Z
   #72 = InterfaceMethodref #67.#73       // java/util/Iterator.next:()Ljava/lang/Object;
   #73 = NameAndType        #74:#75       // next:()Ljava/lang/Object;
   #74 = Utf8               next
   #75 = Utf8               ()Ljava/lang/Object;
   #76 = Class              #77           // ext/mods/gameserver/custom/data/DonateData$Donate
   #77 = Utf8               ext/mods/gameserver/custom/data/DonateData$Donate
   #78 = Methodref          #76.#79       // ext/mods/gameserver/custom/data/DonateData$Donate.service:()I
   #79 = NameAndType        #80:#39       // service:()I
   #80 = Utf8               service
   #81 = Fieldref           #82.#83       // ext/mods/Config.DONATE_CNAME_TEMPLATE:Ljava/lang/String;
   #82 = Class              #84           // ext/mods/Config
   #83 = NameAndType        #85:#86       // DONATE_CNAME_TEMPLATE:Ljava/lang/String;
   #84 = Utf8               ext/mods/Config
   #85 = Utf8               DONATE_CNAME_TEMPLATE
   #86 = Utf8               Ljava/lang/String;
   #87 = Methodref          #88.#89       // java/util/regex/Pattern.compile:(Ljava/lang/String;)Ljava/util/regex/Pattern;
   #88 = Class              #90           // java/util/regex/Pattern
   #89 = NameAndType        #91:#92       // compile:(Ljava/lang/String;)Ljava/util/regex/Pattern;
   #90 = Utf8               java/util/regex/Pattern
   #91 = Utf8               compile
   #92 = Utf8               (Ljava/lang/String;)Ljava/util/regex/Pattern;
   #93 = Class              #94           // java/util/regex/PatternSyntaxException
   #94 = Utf8               java/util/regex/PatternSyntaxException
   #95 = String             #96           // .*
   #96 = Utf8               .*
   #97 = Methodref          #88.#98       // java/util/regex/Pattern.matcher:(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
   #98 = NameAndType        #99:#100      // matcher:(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
   #99 = Utf8               matcher
  #100 = Utf8               (Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
  #101 = Methodref          #102.#103     // java/util/regex/Matcher.matches:()Z
  #102 = Class              #104          // java/util/regex/Matcher
  #103 = NameAndType        #105:#71      // matches:()Z
  #104 = Utf8               java/util/regex/Matcher
  #105 = Utf8               matches
  #106 = Methodref          #107.#108     // ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
  #107 = Class              #109          // ext/mods/commons/pool/ConnectionPool
  #108 = NameAndType        #110:#111     // getConnection:()Ljava/sql/Connection;
  #109 = Utf8               ext/mods/commons/pool/ConnectionPool
  #110 = Utf8               getConnection
  #111 = Utf8               ()Ljava/sql/Connection;
  #112 = String             #113          // REPLACE INTO account_premium (premium_service,enddate,account_name) values(?,?,?)
  #113 = Utf8               REPLACE INTO account_premium (premium_service,enddate,account_name) values(?,?,?)
  #114 = InterfaceMethodref #115.#116     // java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
  #115 = Class              #117          // java/sql/Connection
  #116 = NameAndType        #118:#119     // prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
  #117 = Utf8               java/sql/Connection
  #118 = Utf8               prepareStatement
  #119 = Utf8               (Ljava/lang/String;)Ljava/sql/PreparedStatement;
  #120 = InterfaceMethodref #121.#122     // java/sql/PreparedStatement.setInt:(II)V
  #121 = Class              #123          // java/sql/PreparedStatement
  #122 = NameAndType        #124:#125     // setInt:(II)V
  #123 = Utf8               java/sql/PreparedStatement
  #124 = Utf8               setInt
  #125 = Utf8               (II)V
  #126 = InterfaceMethodref #121.#127     // java/sql/PreparedStatement.setLong:(IJ)V
  #127 = NameAndType        #128:#129     // setLong:(IJ)V
  #128 = Utf8               setLong
  #129 = Utf8               (IJ)V
  #130 = InterfaceMethodref #121.#131     // java/sql/PreparedStatement.setString:(ILjava/lang/String;)V
  #131 = NameAndType        #132:#133     // setString:(ILjava/lang/String;)V
  #132 = Utf8               setString
  #133 = Utf8               (ILjava/lang/String;)V
  #134 = InterfaceMethodref #121.#135     // java/sql/PreparedStatement.execute:()Z
  #135 = NameAndType        #136:#71      // execute:()Z
  #136 = Utf8               execute
  #137 = InterfaceMethodref #121.#138     // java/sql/PreparedStatement.close:()V
  #138 = NameAndType        #139:#6       // close:()V
  #139 = Utf8               close
  #140 = Class              #141          // java/lang/Throwable
  #141 = Utf8               java/lang/Throwable
  #142 = Methodref          #140.#143     // java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
  #143 = NameAndType        #144:#145     // addSuppressed:(Ljava/lang/Throwable;)V
  #144 = Utf8               addSuppressed
  #145 = Utf8               (Ljava/lang/Throwable;)V
  #146 = InterfaceMethodref #115.#138     // java/sql/Connection.close:()V
  #147 = Class              #148          // java/lang/Exception
  #148 = Utf8               java/lang/Exception
  #149 = Methodref          #150.#151     // java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
  #150 = Class              #152          // java/lang/String
  #151 = NameAndType        #44:#153      // valueOf:(Ljava/lang/Object;)Ljava/lang/String;
  #152 = Utf8               java/lang/String
  #153 = Utf8               (Ljava/lang/Object;)Ljava/lang/String;
  #154 = InvokeDynamic      #1:#155       // #1:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #155 = NameAndType        #156:#157     // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #156 = Utf8               makeConcatWithConstants
  #157 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
  #158 = Methodref          #47.#159      // ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;)V
  #159 = NameAndType        #160:#161     // warn:(Ljava/lang/Object;)V
  #160 = Utf8               warn
  #161 = Utf8               (Ljava/lang/Object;)V
  #162 = Methodref          #163.#164     // ext/mods/gameserver/model/actor/Player.getClassId:()Lext/mods/gameserver/enums/actors/ClassId;
  #163 = Class              #165          // ext/mods/gameserver/model/actor/Player
  #164 = NameAndType        #166:#167     // getClassId:()Lext/mods/gameserver/enums/actors/ClassId;
  #165 = Utf8               ext/mods/gameserver/model/actor/Player
  #166 = Utf8               getClassId
  #167 = Utf8               ()Lext/mods/gameserver/enums/actors/ClassId;
  #168 = Methodref          #169.#170     // ext/mods/gameserver/enums/actors/ClassId.getLevel:()I
  #169 = Class              #171          // ext/mods/gameserver/enums/actors/ClassId
  #170 = NameAndType        #172:#39      // getLevel:()I
  #171 = Utf8               ext/mods/gameserver/enums/actors/ClassId
  #172 = Utf8               getLevel
  #173 = Methodref          #163.#174     // ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
  #174 = NameAndType        #175:#176     // getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
  #175 = Utf8               getSysString
  #176 = Utf8               (I[Ljava/lang/Object;)Ljava/lang/String;
  #177 = Methodref          #163.#178     // ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
  #178 = NameAndType        #179:#29      // sendMessage:(Ljava/lang/String;)V
  #179 = Utf8               sendMessage
  #180 = Methodref          #163.#181     // ext/mods/gameserver/model/actor/Player.isNoble:()Z
  #181 = NameAndType        #182:#71      // isNoble:()Z
  #182 = Utf8               isNoble
  #183 = Methodref          #76.#184      // ext/mods/gameserver/custom/data/DonateData$Donate.price:()Lext/mods/gameserver/model/holder/IntIntHolder;
  #184 = NameAndType        #185:#186     // price:()Lext/mods/gameserver/model/holder/IntIntHolder;
  #185 = Utf8               price
  #186 = Utf8               ()Lext/mods/gameserver/model/holder/IntIntHolder;
  #187 = Methodref          #188.#189     // ext/mods/gameserver/model/holder/IntIntHolder.getId:()I
  #188 = Class              #190          // ext/mods/gameserver/model/holder/IntIntHolder
  #189 = NameAndType        #191:#39      // getId:()I
  #190 = Utf8               ext/mods/gameserver/model/holder/IntIntHolder
  #191 = Utf8               getId
  #192 = Methodref          #188.#193     // ext/mods/gameserver/model/holder/IntIntHolder.getValue:()I
  #193 = NameAndType        #194:#39      // getValue:()I
  #194 = Utf8               getValue
  #195 = Methodref          #163.#196     // ext/mods/gameserver/model/actor/Player.destroyItemByItemId:(IIZ)Z
  #196 = NameAndType        #197:#198     // destroyItemByItemId:(IIZ)Z
  #197 = Utf8               destroyItemByItemId
  #198 = Utf8               (IIZ)Z
  #199 = Methodref          #163.#200     // ext/mods/gameserver/model/actor/Player.setNoble:(ZZ)V
  #200 = NameAndType        #201:#202     // setNoble:(ZZ)V
  #201 = Utf8               setNoble
  #202 = Utf8               (ZZ)V
  #203 = Methodref          #163.#204     // ext/mods/gameserver/model/actor/Player.broadcastUserInfo:()V
  #204 = NameAndType        #205:#6       // broadcastUserInfo:()V
  #205 = Utf8               broadcastUserInfo
  #206 = Methodref          #163.#207     // ext/mods/gameserver/model/actor/Player.isHero:()Z
  #207 = NameAndType        #208:#71      // isHero:()Z
  #208 = Utf8               isHero
  #209 = Methodref          #163.#210     // ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
  #210 = NameAndType        #211:#212     // getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
  #211 = Utf8               getInventory
  #212 = Utf8               ()Lext/mods/gameserver/model/itemcontainer/PcInventory;
  #213 = Methodref          #214.#215     // ext/mods/gameserver/model/itemcontainer/PcInventory.getItemByItemId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #214 = Class              #216          // ext/mods/gameserver/model/itemcontainer/PcInventory
  #215 = NameAndType        #217:#218     // getItemByItemId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #216 = Utf8               ext/mods/gameserver/model/itemcontainer/PcInventory
  #217 = Utf8               getItemByItemId
  #218 = Utf8               (I)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #219 = Methodref          #220.#221     // ext/mods/gameserver/model/item/instance/ItemInstance.getCount:()I
  #220 = Class              #222          // ext/mods/gameserver/model/item/instance/ItemInstance
  #221 = NameAndType        #223:#39      // getCount:()I
  #222 = Utf8               ext/mods/gameserver/model/item/instance/ItemInstance
  #223 = Utf8               getCount
  #224 = Class              #225          // ext/mods/gameserver/network/serverpackets/ItemList
  #225 = Utf8               ext/mods/gameserver/network/serverpackets/ItemList
  #226 = Methodref          #224.#227     // ext/mods/gameserver/network/serverpackets/ItemList."<init>":(Lext/mods/gameserver/model/actor/Player;Z)V
  #227 = NameAndType        #5:#228       // "<init>":(Lext/mods/gameserver/model/actor/Player;Z)V
  #228 = Utf8               (Lext/mods/gameserver/model/actor/Player;Z)V
  #229 = Methodref          #163.#230     // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #230 = NameAndType        #231:#232     // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #231 = Utf8               sendPacket
  #232 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #233 = Methodref          #163.#234     // ext/mods/gameserver/model/actor/Player.setHero:(Z)V
  #234 = NameAndType        #235:#236     // setHero:(Z)V
  #235 = Utf8               setHero
  #236 = Utf8               (Z)V
  #237 = Methodref          #238.#239     // java/lang/System.currentTimeMillis:()J
  #238 = Class              #240          // java/lang/System
  #239 = NameAndType        #241:#242     // currentTimeMillis:()J
  #240 = Utf8               java/lang/System
  #241 = Utf8               currentTimeMillis
  #242 = Utf8               ()J
  #243 = Fieldref           #244.#245     // java/util/concurrent/TimeUnit.DAYS:Ljava/util/concurrent/TimeUnit;
  #244 = Class              #246          // java/util/concurrent/TimeUnit
  #245 = NameAndType        #247:#248     // DAYS:Ljava/util/concurrent/TimeUnit;
  #246 = Utf8               java/util/concurrent/TimeUnit
  #247 = Utf8               DAYS
  #248 = Utf8               Ljava/util/concurrent/TimeUnit;
  #249 = Methodref          #76.#250      // ext/mods/gameserver/custom/data/DonateData$Donate.duration:()I
  #250 = NameAndType        #251:#39      // duration:()I
  #251 = Utf8               duration
  #252 = Methodref          #244.#253     // java/util/concurrent/TimeUnit.toMillis:(J)J
  #253 = NameAndType        #254:#255     // toMillis:(J)J
  #254 = Utf8               toMillis
  #255 = Utf8               (J)J
  #256 = Methodref          #163.#257     // ext/mods/gameserver/model/actor/Player.setHeroUntil:(J)V
  #257 = NameAndType        #258:#259     // setHeroUntil:(J)V
  #258 = Utf8               setHeroUntil
  #259 = Utf8               (J)V
  #260 = Methodref          #163.#261     // ext/mods/gameserver/model/actor/Player.store:()V
  #261 = NameAndType        #262:#6       // store:()V
  #262 = Utf8               store
  #263 = Class              #264          // ext/mods/gameserver/custom/data/DonateData$1
  #264 = Utf8               ext/mods/gameserver/custom/data/DonateData$1
  #265 = Methodref          #263.#266     // ext/mods/gameserver/custom/data/DonateData$1."<init>":(Lext/mods/gameserver/model/actor/Player;)V
  #266 = NameAndType        #5:#267       // "<init>":(Lext/mods/gameserver/model/actor/Player;)V
  #267 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
  #268 = Methodref          #163.#269     // ext/mods/gameserver/model/actor/Player.getHeroUntil:()J
  #269 = NameAndType        #270:#242     // getHeroUntil:()J
  #270 = Utf8               getHeroUntil
  #271 = Methodref          #272.#273     // ext/mods/commons/pool/ThreadPool.schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
  #272 = Class              #274          // ext/mods/commons/pool/ThreadPool
  #273 = NameAndType        #275:#276     // schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
  #274 = Utf8               ext/mods/commons/pool/ThreadPool
  #275 = Utf8               schedule
  #276 = Utf8               (Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
  #277 = InvokeDynamic      #2:#155       // #2:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #278 = Methodref          #41.#279      // java/lang/Integer.decode:(Ljava/lang/String;)Ljava/lang/Integer;
  #279 = NameAndType        #280:#281     // decode:(Ljava/lang/String;)Ljava/lang/Integer;
  #280 = Utf8               decode
  #281 = Utf8               (Ljava/lang/String;)Ljava/lang/Integer;
  #282 = Methodref          #41.#283      // java/lang/Integer.intValue:()I
  #283 = NameAndType        #284:#39      // intValue:()I
  #284 = Utf8               intValue
  #285 = Methodref          #163.#286     // ext/mods/gameserver/model/actor/Player.getAppearance:()Lext/mods/gameserver/model/actor/container/player/Appearance;
  #286 = NameAndType        #287:#288     // getAppearance:()Lext/mods/gameserver/model/actor/container/player/Appearance;
  #287 = Utf8               getAppearance
  #288 = Utf8               ()Lext/mods/gameserver/model/actor/container/player/Appearance;
  #289 = Methodref          #290.#291     // ext/mods/gameserver/model/actor/container/player/Appearance.setNameColor:(I)V
  #290 = Class              #292          // ext/mods/gameserver/model/actor/container/player/Appearance
  #291 = NameAndType        #293:#294     // setNameColor:(I)V
  #292 = Utf8               ext/mods/gameserver/model/actor/container/player/Appearance
  #293 = Utf8               setNameColor
  #294 = Utf8               (I)V
  #295 = Methodref          #163.#296     // ext/mods/gameserver/model/actor/Player.setNameColor:(I)I
  #296 = NameAndType        #293:#297     // setNameColor:(I)I
  #297 = Utf8               (I)I
  #298 = Methodref          #290.#299     // ext/mods/gameserver/model/actor/container/player/Appearance.setTitleColor:(I)V
  #299 = NameAndType        #300:#294     // setTitleColor:(I)V
  #300 = Utf8               setTitleColor
  #301 = Methodref          #163.#302     // ext/mods/gameserver/model/actor/Player.setTitleColor:(I)I
  #302 = NameAndType        #300:#297     // setTitleColor:(I)I
  #303 = Methodref          #150.#304     // java/lang/String.length:()I
  #304 = NameAndType        #305:#39      // length:()I
  #305 = Utf8               length
  #306 = Methodref          #11.#307      // ext/mods/gameserver/custom/data/DonateData.isValidNick:(Ljava/lang/String;)Z
  #307 = NameAndType        #308:#309     // isValidNick:(Ljava/lang/String;)Z
  #308 = Utf8               isValidNick
  #309 = Utf8               (Ljava/lang/String;)Z
  #310 = Fieldref           #82.#311      // ext/mods/Config.LIST_RESTRICTED_CHAR_NAMES:Ljava/util/List;
  #311 = NameAndType        #312:#15      // LIST_RESTRICTED_CHAR_NAMES:Ljava/util/List;
  #312 = Utf8               LIST_RESTRICTED_CHAR_NAMES
  #313 = Methodref          #150.#314     // java/lang/String.toLowerCase:()Ljava/lang/String;
  #314 = NameAndType        #315:#316     // toLowerCase:()Ljava/lang/String;
  #315 = Utf8               toLowerCase
  #316 = Utf8               ()Ljava/lang/String;
  #317 = InterfaceMethodref #20.#318      // java/util/List.contains:(Ljava/lang/Object;)Z
  #318 = NameAndType        #319:#320     // contains:(Ljava/lang/Object;)Z
  #319 = Utf8               contains
  #320 = Utf8               (Ljava/lang/Object;)Z
  #321 = Methodref          #322.#323     // ext/mods/gameserver/data/sql/PlayerInfoTable.getInstance:()Lext/mods/gameserver/data/sql/PlayerInfoTable;
  #322 = Class              #324          // ext/mods/gameserver/data/sql/PlayerInfoTable
  #323 = NameAndType        #325:#326     // getInstance:()Lext/mods/gameserver/data/sql/PlayerInfoTable;
  #324 = Utf8               ext/mods/gameserver/data/sql/PlayerInfoTable
  #325 = Utf8               getInstance
  #326 = Utf8               ()Lext/mods/gameserver/data/sql/PlayerInfoTable;
  #327 = Methodref          #322.#328     // ext/mods/gameserver/data/sql/PlayerInfoTable.getPlayerObjectId:(Ljava/lang/String;)I
  #328 = NameAndType        #329:#330     // getPlayerObjectId:(Ljava/lang/String;)I
  #329 = Utf8               getPlayerObjectId
  #330 = Utf8               (Ljava/lang/String;)I
  #331 = Methodref          #163.#332     // ext/mods/gameserver/model/actor/Player.setName:(Ljava/lang/String;)V
  #332 = NameAndType        #333:#29      // setName:(Ljava/lang/String;)V
  #333 = Utf8               setName
  #334 = Methodref          #322.#335     // ext/mods/gameserver/data/sql/PlayerInfoTable.updatePlayerData:(Lext/mods/gameserver/model/actor/Player;Z)V
  #335 = NameAndType        #336:#228     // updatePlayerData:(Lext/mods/gameserver/model/actor/Player;Z)V
  #336 = Utf8               updatePlayerData
  #337 = Methodref          #163.#338     // ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
  #338 = NameAndType        #339:#340     // getClan:()Lext/mods/gameserver/model/pledge/Clan;
  #339 = Utf8               getClan
  #340 = Utf8               ()Lext/mods/gameserver/model/pledge/Clan;
  #341 = Methodref          #342.#343     // ext/mods/gameserver/model/pledge/Clan.broadcastClanStatus:()V
  #342 = Class              #344          // ext/mods/gameserver/model/pledge/Clan
  #343 = NameAndType        #345:#6       // broadcastClanStatus:()V
  #344 = Utf8               ext/mods/gameserver/model/pledge/Clan
  #345 = Utf8               broadcastClanStatus
  #346 = Fieldref           #82.#347      // ext/mods/Config.USE_PREMIUM_SERVICE:Z
  #347 = NameAndType        #348:#349     // USE_PREMIUM_SERVICE:Z
  #348 = Utf8               USE_PREMIUM_SERVICE
  #349 = Utf8               Z
  #350 = Methodref          #163.#351     // ext/mods/gameserver/model/actor/Player.getPremServiceData:()J
  #351 = NameAndType        #352:#242     // getPremServiceData:()J
  #352 = Utf8               getPremServiceData
  #353 = Methodref          #354.#355     // java/util/Calendar.getInstance:()Ljava/util/Calendar;
  #354 = Class              #356          // java/util/Calendar
  #355 = NameAndType        #325:#357     // getInstance:()Ljava/util/Calendar;
  #356 = Utf8               java/util/Calendar
  #357 = Utf8               ()Ljava/util/Calendar;
  #358 = Methodref          #354.#359     // java/util/Calendar.getTimeInMillis:()J
  #359 = NameAndType        #360:#242     // getTimeInMillis:()J
  #360 = Utf8               getTimeInMillis
  #361 = Methodref          #354.#362     // java/util/Calendar.add:(II)V
  #362 = NameAndType        #363:#125     // add:(II)V
  #363 = Utf8               add
  #364 = Class              #365          // java/lang/NumberFormatException
  #365 = Utf8               java/lang/NumberFormatException
  #366 = Methodref          #163.#367     // ext/mods/gameserver/model/actor/Player.setPremiumService:(I)V
  #367 = NameAndType        #368:#294     // setPremiumService:(I)V
  #368 = Utf8               setPremiumService
  #369 = Methodref          #370.#371     // ext/mods/gameserver/taskmanager/PremiumTaskManager.getInstance:()Lext/mods/gameserver/taskmanager/PremiumTaskManager;
  #370 = Class              #372          // ext/mods/gameserver/taskmanager/PremiumTaskManager
  #371 = NameAndType        #325:#373     // getInstance:()Lext/mods/gameserver/taskmanager/PremiumTaskManager;
  #372 = Utf8               ext/mods/gameserver/taskmanager/PremiumTaskManager
  #373 = Utf8               ()Lext/mods/gameserver/taskmanager/PremiumTaskManager;
  #374 = Methodref          #370.#375     // ext/mods/gameserver/taskmanager/PremiumTaskManager.add:(Lext/mods/gameserver/model/actor/Player;)V
  #375 = NameAndType        #363:#267     // add:(Lext/mods/gameserver/model/actor/Player;)V
  #376 = Methodref          #163.#377     // ext/mods/gameserver/model/actor/Player.getAccountName:()Ljava/lang/String;
  #377 = NameAndType        #378:#316     // getAccountName:()Ljava/lang/String;
  #378 = Utf8               getAccountName
  #379 = Methodref          #11.#380      // ext/mods/gameserver/custom/data/DonateData.updateDatabasePremium:(JLjava/lang/String;)V
  #380 = NameAndType        #381:#382     // updateDatabasePremium:(JLjava/lang/String;)V
  #381 = Utf8               updateDatabasePremium
  #382 = Utf8               (JLjava/lang/String;)V
  #383 = Fieldref           #384.#385     // ext/mods/gameserver/custom/data/DonateData$2.$SwitchMap$ext$mods$gameserver$enums$actors$Sex:[I
  #384 = Class              #386          // ext/mods/gameserver/custom/data/DonateData$2
  #385 = NameAndType        #387:#388     // $SwitchMap$ext$mods$gameserver$enums$actors$Sex:[I
  #386 = Utf8               ext/mods/gameserver/custom/data/DonateData$2
  #387 = Utf8               $SwitchMap$ext$mods$gameserver$enums$actors$Sex
  #388 = Utf8               [I
  #389 = Methodref          #290.#390     // ext/mods/gameserver/model/actor/container/player/Appearance.getSex:()Lext/mods/gameserver/enums/actors/Sex;
  #390 = NameAndType        #391:#392     // getSex:()Lext/mods/gameserver/enums/actors/Sex;
  #391 = Utf8               getSex
  #392 = Utf8               ()Lext/mods/gameserver/enums/actors/Sex;
  #393 = Methodref          #394.#395     // ext/mods/gameserver/enums/actors/Sex.ordinal:()I
  #394 = Class              #396          // ext/mods/gameserver/enums/actors/Sex
  #395 = NameAndType        #397:#39      // ordinal:()I
  #396 = Utf8               ext/mods/gameserver/enums/actors/Sex
  #397 = Utf8               ordinal
  #398 = Fieldref           #394.#399     // ext/mods/gameserver/enums/actors/Sex.FEMALE:Lext/mods/gameserver/enums/actors/Sex;
  #399 = NameAndType        #400:#401     // FEMALE:Lext/mods/gameserver/enums/actors/Sex;
  #400 = Utf8               FEMALE
  #401 = Utf8               Lext/mods/gameserver/enums/actors/Sex;
  #402 = Methodref          #290.#403     // ext/mods/gameserver/model/actor/container/player/Appearance.setSex:(Lext/mods/gameserver/enums/actors/Sex;)V
  #403 = NameAndType        #404:#405     // setSex:(Lext/mods/gameserver/enums/actors/Sex;)V
  #404 = Utf8               setSex
  #405 = Utf8               (Lext/mods/gameserver/enums/actors/Sex;)V
  #406 = Fieldref           #394.#407     // ext/mods/gameserver/enums/actors/Sex.MALE:Lext/mods/gameserver/enums/actors/Sex;
  #407 = NameAndType        #408:#401     // MALE:Lext/mods/gameserver/enums/actors/Sex;
  #408 = Utf8               MALE
  #409 = Methodref          #163.#410     // ext/mods/gameserver/model/actor/Player.decayMe:()V
  #410 = NameAndType        #411:#6       // decayMe:()V
  #411 = Utf8               decayMe
  #412 = Methodref          #163.#413     // ext/mods/gameserver/model/actor/Player.spawnMe:()V
  #413 = NameAndType        #414:#6       // spawnMe:()V
  #414 = Utf8               spawnMe
  #415 = Methodref          #163.#416     // ext/mods/gameserver/model/actor/Player.logout:(Z)V
  #416 = NameAndType        #417:#236     // logout:(Z)V
  #417 = Utf8               logout
  #418 = Methodref          #163.#419     // ext/mods/gameserver/model/actor/Player.getPkKills:()I
  #419 = NameAndType        #420:#39      // getPkKills:()I
  #420 = Utf8               getPkKills
  #421 = Methodref          #163.#422     // ext/mods/gameserver/model/actor/Player.getKarma:()I
  #422 = NameAndType        #423:#39      // getKarma:()I
  #423 = Utf8               getKarma
  #424 = Fieldref           #425.#426     // ext/mods/gameserver/network/SystemMessageId.NOT_ENOUGH_ITEMS:Lext/mods/gameserver/network/SystemMessageId;
  #425 = Class              #427          // ext/mods/gameserver/network/SystemMessageId
  #426 = NameAndType        #428:#429     // NOT_ENOUGH_ITEMS:Lext/mods/gameserver/network/SystemMessageId;
  #427 = Utf8               ext/mods/gameserver/network/SystemMessageId
  #428 = Utf8               NOT_ENOUGH_ITEMS
  #429 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
  #430 = Methodref          #163.#431     // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
  #431 = NameAndType        #231:#432     // sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
  #432 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
  #433 = Methodref          #163.#434     // ext/mods/gameserver/model/actor/Player.setPkKills:(I)V
  #434 = NameAndType        #435:#294     // setPkKills:(I)V
  #435 = Utf8               setPkKills
  #436 = Methodref          #163.#437     // ext/mods/gameserver/model/actor/Player.setKarma:(I)V
  #437 = NameAndType        #438:#294     // setKarma:(I)V
  #438 = Utf8               setKarma
  #439 = Methodref          #342.#170     // ext/mods/gameserver/model/pledge/Clan.getLevel:()I
  #440 = Methodref          #163.#441     // ext/mods/gameserver/model/actor/Player.isClanLeader:()Z
  #441 = NameAndType        #442:#71      // isClanLeader:()Z
  #442 = Utf8               isClanLeader
  #443 = Methodref          #342.#444     // ext/mods/gameserver/model/pledge/Clan.changeLevel:(I)V
  #444 = NameAndType        #445:#294     // changeLevel:(I)V
  #445 = Utf8               changeLevel
  #446 = Methodref          #342.#447     // ext/mods/gameserver/model/pledge/Clan.addAllClanSkills:()Z
  #447 = NameAndType        #448:#71      // addAllClanSkills:()Z
  #448 = Utf8               addAllClanSkills
  #449 = Class              #450          // ext/mods/gameserver/network/serverpackets/L2GameServerPacket
  #450 = Utf8               ext/mods/gameserver/network/serverpackets/L2GameServerPacket
  #451 = Class              #452          // ext/mods/gameserver/network/serverpackets/PledgeSkillList
  #452 = Utf8               ext/mods/gameserver/network/serverpackets/PledgeSkillList
  #453 = Methodref          #451.#454     // ext/mods/gameserver/network/serverpackets/PledgeSkillList."<init>":(Lext/mods/gameserver/model/pledge/Clan;)V
  #454 = NameAndType        #5:#455       // "<init>":(Lext/mods/gameserver/model/pledge/Clan;)V
  #455 = Utf8               (Lext/mods/gameserver/model/pledge/Clan;)V
  #456 = Methodref          #342.#457     // ext/mods/gameserver/model/pledge/Clan.broadcastToMembers:([Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #457 = NameAndType        #458:#459     // broadcastToMembers:([Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #458 = Utf8               broadcastToMembers
  #459 = Utf8               ([Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #460 = Methodref          #342.#461     // ext/mods/gameserver/model/pledge/Clan.addReputationScore:(I)Z
  #461 = NameAndType        #462:#463     // addReputationScore:(I)Z
  #462 = Utf8               addReputationScore
  #463 = Utf8               (I)Z
  #464 = Methodref          #342.#465     // ext/mods/gameserver/model/pledge/Clan.getReputationScore:()I
  #465 = NameAndType        #466:#39      // getReputationScore:()I
  #466 = Utf8               getReputationScore
  #467 = Fieldref           #468.#469     // ext/mods/gameserver/custom/data/DonateData$SingletonHolder.INSTANCE:Lext/mods/gameserver/custom/data/DonateData;
  #468 = Class              #470          // ext/mods/gameserver/custom/data/DonateData$SingletonHolder
  #469 = NameAndType        #471:#472     // INSTANCE:Lext/mods/gameserver/custom/data/DonateData;
  #470 = Utf8               ext/mods/gameserver/custom/data/DonateData$SingletonHolder
  #471 = Utf8               INSTANCE
  #472 = Utf8               Lext/mods/gameserver/custom/data/DonateData;
  #473 = String             #474          // donate
  #474 = Utf8               donate
  #475 = InvokeDynamic      #3:#55        // #3:accept:(Lext/mods/gameserver/custom/data/DonateData;)Ljava/util/function/Consumer;
  #476 = Methodref          #11.#477      // ext/mods/gameserver/custom/data/DonateData.parseAttributes:(Lorg/w3c/dom/Node;)Lext/mods/commons/data/StatSet;
  #477 = NameAndType        #478:#479     // parseAttributes:(Lorg/w3c/dom/Node;)Lext/mods/commons/data/StatSet;
  #478 = Utf8               parseAttributes
  #479 = Utf8               (Lorg/w3c/dom/Node;)Lext/mods/commons/data/StatSet;
  #480 = Methodref          #76.#481      // ext/mods/gameserver/custom/data/DonateData$Donate."<init>":(Lext/mods/commons/data/StatSet;)V
  #481 = NameAndType        #5:#482       // "<init>":(Lext/mods/commons/data/StatSet;)V
  #482 = Utf8               (Lext/mods/commons/data/StatSet;)V
  #483 = InterfaceMethodref #20.#484      // java/util/List.add:(Ljava/lang/Object;)Z
  #484 = NameAndType        #363:#320     // add:(Ljava/lang/Object;)Z
  #485 = Class              #486          // ext/mods/commons/data/xml/IXmlReader
  #486 = Utf8               ext/mods/commons/data/xml/IXmlReader
  #487 = Utf8               Signature
  #488 = Utf8               Ljava/util/List<Lext/mods/gameserver/custom/data/DonateData$Donate;>;
  #489 = Utf8               UPDATE_PREMIUMSERVICE
  #490 = Utf8               ConstantValue
  #491 = Utf8               Code
  #492 = Utf8               LineNumberTable
  #493 = Utf8               LocalVariableTable
  #494 = Utf8               this
  #495 = Utf8               reload
  #496 = Utf8               parseDocument
  #497 = Utf8               (Lorg/w3c/dom/Document;Ljava/nio/file/Path;)V
  #498 = Utf8               doc
  #499 = Utf8               Lorg/w3c/dom/Document;
  #500 = Utf8               path
  #501 = Utf8               Ljava/nio/file/Path;
  #502 = Utf8               getDonate
  #503 = Utf8               ()Ljava/util/List;
  #504 = Utf8               ()Ljava/util/List<Lext/mods/gameserver/custom/data/DonateData$Donate;>;
  #505 = Utf8               (I)Lext/mods/gameserver/custom/data/DonateData$Donate;
  #506 = Utf8               Lext/mods/gameserver/custom/data/DonateData$Donate;
  #507 = Utf8               id
  #508 = Utf8               I
  #509 = Utf8               StackMapTable
  #510 = Utf8               pattern
  #511 = Utf8               Ljava/util/regex/Pattern;
  #512 = Utf8               e
  #513 = Utf8               Ljava/util/regex/PatternSyntaxException;
  #514 = Utf8               name
  #515 = Utf8               result
  #516 = Utf8               regexp
  #517 = Utf8               Ljava/util/regex/Matcher;
  #518 = Utf8               statement
  #519 = Utf8               Ljava/sql/PreparedStatement;
  #520 = Utf8               con
  #521 = Utf8               Ljava/sql/Connection;
  #522 = Utf8               Ljava/lang/Exception;
  #523 = Utf8               time
  #524 = Utf8               J
  #525 = Utf8               AccName
  #526 = Utf8               setNobless
  #527 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/custom/data/DonateData$Donate;)V
  #528 = Utf8               player
  #529 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #530 = Utf8               Lext/mods/gameserver/model/holder/IntIntHolder;
  #531 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/custom/data/DonateData$Donate;Ljava/lang/String;)V
  #532 = Utf8               color
  #533 = Utf8               colorName
  #534 = Utf8               colorTitle
  #535 = Utf8               nick
  #536 = Utf8               setPremium
  #537 = Utf8               now
  #538 = Utf8               Ljava/util/Calendar;
  #539 = Utf8               nfe
  #540 = Utf8               Ljava/lang/NumberFormatException;
  #541 = Utf8               premiumTime
  #542 = Utf8               setGender
  #543 = Utf8               clearPK
  #544 = Utf8               setClanLevel
  #545 = Utf8               clanItemId
  #546 = Utf8               addClanSkill
  #547 = Utf8               addClanRep
  #548 = Utf8               ()Lext/mods/gameserver/custom/data/DonateData;
  #549 = Utf8               lambda$parseDocument$0
  #550 = Utf8               (Lorg/w3c/dom/Node;)V
  #551 = Utf8               listNode
  #552 = Utf8               Lorg/w3c/dom/Node;
  #553 = Utf8               lambda$parseDocument$1
  #554 = Utf8               node
  #555 = Utf8               set
  #556 = Utf8               Lext/mods/commons/data/StatSet;
  #557 = Utf8               SourceFile
  #558 = Utf8               DonateData.java
  #559 = Utf8               NestMembers
  #560 = Utf8               BootstrapMethods
  #561 = MethodType         #161          //  (Ljava/lang/Object;)V
  #562 = MethodHandle       5:#563        // REF_invokeVirtual ext/mods/gameserver/custom/data/DonateData.lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
  #563 = Methodref          #11.#564      // ext/mods/gameserver/custom/data/DonateData.lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
  #564 = NameAndType        #549:#550     // lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
  #565 = MethodType         #550          //  (Lorg/w3c/dom/Node;)V
  #566 = String             #567          // updateDatabasePremium: Could not update data:\u0001
  #567 = Utf8               updateDatabasePremium: Could not update data:\u0001
  #568 = String             #569          // 0x\u0001
  #569 = Utf8               0x\u0001
  #570 = MethodHandle       5:#571        // REF_invokeVirtual ext/mods/gameserver/custom/data/DonateData.lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
  #571 = Methodref          #11.#572      // ext/mods/gameserver/custom/data/DonateData.lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
  #572 = NameAndType        #553:#550     // lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
  #573 = MethodHandle       6:#574        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #574 = Methodref          #575.#576     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #575 = Class              #577          // java/lang/invoke/LambdaMetafactory
  #576 = NameAndType        #578:#579     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #577 = Utf8               java/lang/invoke/LambdaMetafactory
  #578 = Utf8               metafactory
  #579 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #580 = MethodHandle       6:#581        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #581 = Methodref          #582.#583     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #582 = Class              #584          // java/lang/invoke/StringConcatFactory
  #583 = NameAndType        #156:#585     // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #584 = Utf8               java/lang/invoke/StringConcatFactory
  #585 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #586 = Utf8               InnerClasses
  #587 = Utf8               Donate
  #588 = Utf8               SingletonHolder
  #589 = Class              #590          // java/lang/invoke/MethodHandles$Lookup
  #590 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #591 = Class              #592          // java/lang/invoke/MethodHandles
  #592 = Utf8               java/lang/invoke/MethodHandles
  #593 = Utf8               Lookup
{
  public ext.mods.gameserver.custom.data.DonateData();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: new           #7                  // class java/util/ArrayList
         8: dup
         9: invokespecial #9                  // Method java/util/ArrayList."<init>":()V
        12: putfield      #10                 // Field _services:Ljava/util/List;
        15: aload_0
        16: invokevirtual #16                 // Method load:()V
        19: return
      LineNumberTable:
        line 54: 0
        line 50: 4
        line 55: 15
        line 56: 19
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      20     0  this   Lext/mods/gameserver/custom/data/DonateData;

  public void reload();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #10                 // Field _services:Ljava/util/List;
         4: invokeinterface #19,  1           // InterfaceMethod java/util/List.clear:()V
         9: aload_0
        10: invokevirtual #16                 // Method load:()V
        13: return
      LineNumberTable:
        line 60: 0
        line 61: 9
        line 62: 13
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0  this   Lext/mods/gameserver/custom/data/DonateData;

  public void load();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=1, args_size=1
         0: aload_0
         1: ldc           #24                 // String custom/mods/donate.xml
         3: invokevirtual #26                 // Method parseDataFile:(Ljava/lang/String;)V
         6: getstatic     #30                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
         9: ldc           #34                 // String Loaded {} Donate Service data.
        11: iconst_1
        12: anewarray     #2                  // class java/lang/Object
        15: dup
        16: iconst_0
        17: aload_0
        18: getfield      #10                 // Field _services:Ljava/util/List;
        21: invokeinterface #36,  1           // InterfaceMethod java/util/List.size:()I
        26: invokestatic  #40                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        29: aastore
        30: invokevirtual #46                 // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
        33: return
      LineNumberTable:
        line 67: 0
        line 68: 6
        line 69: 33
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      34     0  this   Lext/mods/gameserver/custom/data/DonateData;

  public void parseDocument(org.w3c.dom.Document, java.nio.file.Path);
    descriptor: (Lorg/w3c/dom/Document;Ljava/nio/file/Path;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: ldc           #52                 // String list
         4: aload_0
         5: invokedynamic #54,  0             // InvokeDynamic #0:accept:(Lext/mods/gameserver/custom/data/DonateData;)Ljava/util/function/Consumer;
        10: invokevirtual #58                 // Method forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
        13: return
      LineNumberTable:
        line 74: 0
        line 79: 13
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0  this   Lext/mods/gameserver/custom/data/DonateData;
            0      14     1   doc   Lorg/w3c/dom/Document;
            0      14     2  path   Ljava/nio/file/Path;

  public java.util.List<ext.mods.gameserver.custom.data.DonateData$Donate> getDonate();
    descriptor: ()Ljava/util/List;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #10                 // Field _services:Ljava/util/List;
         4: areturn
      LineNumberTable:
        line 83: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/custom/data/DonateData;
    Signature: #504                         // ()Ljava/util/List<Lext/mods/gameserver/custom/data/DonateData$Donate;>;

  public ext.mods.gameserver.custom.data.DonateData$Donate getDonate(int);
    descriptor: (I)Lext/mods/gameserver/custom/data/DonateData$Donate;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=4, args_size=2
         0: aload_0
         1: getfield      #10                 // Field _services:Ljava/util/List;
         4: invokeinterface #62,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
         9: astore_2
        10: aload_2
        11: invokeinterface #66,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        16: ifeq          42
        19: aload_2
        20: invokeinterface #72,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        25: checkcast     #76                 // class ext/mods/gameserver/custom/data/DonateData$Donate
        28: astore_3
        29: aload_3
        30: invokevirtual #78                 // Method ext/mods/gameserver/custom/data/DonateData$Donate.service:()I
        33: iload_1
        34: if_icmpne     39
        37: aload_3
        38: areturn
        39: goto          10
        42: aconst_null
        43: areturn
      LineNumberTable:
        line 88: 0
        line 90: 29
        line 91: 37
        line 92: 39
        line 93: 42
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           29      10     3 donate   Lext/mods/gameserver/custom/data/DonateData$Donate;
            0      44     0  this   Lext/mods/gameserver/custom/data/DonateData;
            0      44     1    id   I
      StackMapTable: number_of_entries = 3
        frame_type = 252 /* append */
          offset_delta = 10
          locals = [ class java/util/Iterator ]
        frame_type = 28 /* same */
        frame_type = 250 /* chop */
          offset_delta = 2

  public static boolean isValidNick(java.lang.String);
    descriptor: (Ljava/lang/String;)Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=4, args_size=1
         0: iconst_1
         1: istore_1
         2: getstatic     #81                 // Field ext/mods/Config.DONATE_CNAME_TEMPLATE:Ljava/lang/String;
         5: invokestatic  #87                 // Method java/util/regex/Pattern.compile:(Ljava/lang/String;)Ljava/util/regex/Pattern;
         8: astore_2
         9: goto          19
        12: astore_3
        13: ldc           #95                 // String .*
        15: invokestatic  #87                 // Method java/util/regex/Pattern.compile:(Ljava/lang/String;)Ljava/util/regex/Pattern;
        18: astore_2
        19: aload_2
        20: aload_0
        21: invokevirtual #97                 // Method java/util/regex/Pattern.matcher:(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
        24: astore_3
        25: aload_3
        26: invokevirtual #101                // Method java/util/regex/Matcher.matches:()Z
        29: ifne          34
        32: iconst_0
        33: istore_1
        34: iload_1
        35: ireturn
      Exception table:
         from    to  target type
             2     9    12   Class java/util/regex/PatternSyntaxException
      LineNumberTable:
        line 106: 0
        line 110: 2
        line 115: 9
        line 112: 12
        line 114: 13
        line 117: 19
        line 118: 25
        line 119: 32
        line 121: 34
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            9       3     2 pattern   Ljava/util/regex/Pattern;
           13       6     3     e   Ljava/util/regex/PatternSyntaxException;
            0      36     0  name   Ljava/lang/String;
            2      34     1 result   Z
           19      17     2 pattern   Ljava/util/regex/Pattern;
           25      11     3 regexp   Ljava/util/regex/Matcher;
      StackMapTable: number_of_entries = 3
        frame_type = 255 /* full_frame */
          offset_delta = 12
          locals = [ class java/lang/String, int ]
          stack = [ class java/util/regex/PatternSyntaxException ]
        frame_type = 252 /* append */
          offset_delta = 6
          locals = [ class java/util/regex/Pattern ]
        frame_type = 252 /* append */
          offset_delta = 14
          locals = [ class java/util/regex/Matcher ]

  public static void updateDatabasePremium(long, java.lang.String);
    descriptor: (JLjava/lang/String;)V
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=4, locals=7, args_size=2
         0: invokestatic  #106                // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
         3: astore_3
         4: aload_3
         5: ldc           #112                // String REPLACE INTO account_premium (premium_service,enddate,account_name) values(?,?,?)
         7: invokeinterface #114,  2          // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        12: astore        4
        14: aload         4
        16: iconst_1
        17: iconst_1
        18: invokeinterface #120,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        23: aload         4
        25: iconst_2
        26: lload_0
        27: invokeinterface #126,  4          // InterfaceMethod java/sql/PreparedStatement.setLong:(IJ)V
        32: aload         4
        34: iconst_3
        35: aload_2
        36: invokeinterface #130,  3          // InterfaceMethod java/sql/PreparedStatement.setString:(ILjava/lang/String;)V
        41: aload         4
        43: invokeinterface #134,  1          // InterfaceMethod java/sql/PreparedStatement.execute:()Z
        48: pop
        49: aload         4
        51: ifnull        93
        54: aload         4
        56: invokeinterface #137,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
        61: goto          93
        64: astore        5
        66: aload         4
        68: ifnull        90
        71: aload         4
        73: invokeinterface #137,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
        78: goto          90
        81: astore        6
        83: aload         5
        85: aload         6
        87: invokevirtual #142                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        90: aload         5
        92: athrow
        93: aload_3
        94: ifnull        133
        97: aload_3
        98: invokeinterface #146,  1          // InterfaceMethod java/sql/Connection.close:()V
       103: goto          133
       106: astore        4
       108: aload_3
       109: ifnull        130
       112: aload_3
       113: invokeinterface #146,  1          // InterfaceMethod java/sql/Connection.close:()V
       118: goto          130
       121: astore        5
       123: aload         4
       125: aload         5
       127: invokevirtual #142                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       130: aload         4
       132: athrow
       133: goto          152
       136: astore_3
       137: getstatic     #30                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
       140: aload_3
       141: invokestatic  #149                // Method java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
       144: invokedynamic #154,  0            // InvokeDynamic #1:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       149: invokevirtual #158                // Method ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;)V
       152: return
      Exception table:
         from    to  target type
            14    49    64   Class java/lang/Throwable
            71    78    81   Class java/lang/Throwable
             4    93   106   Class java/lang/Throwable
           112   118   121   Class java/lang/Throwable
             0   133   136   Class java/lang/Exception
      LineNumberTable:
        line 126: 0
        line 127: 4
        line 129: 14
        line 130: 23
        line 131: 32
        line 132: 41
        line 133: 49
        line 126: 64
        line 133: 93
        line 126: 106
        line 137: 133
        line 134: 136
        line 136: 137
        line 138: 152
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           14      79     4 statement   Ljava/sql/PreparedStatement;
            4     129     3   con   Ljava/sql/Connection;
          137      15     3     e   Ljava/lang/Exception;
            0     153     0  time   J
            0     153     2 AccName   Ljava/lang/String;
      StackMapTable: number_of_entries = 10
        frame_type = 255 /* full_frame */
          offset_delta = 64
          locals = [ long, class java/lang/String, class java/sql/Connection, class java/sql/PreparedStatement ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ long, class java/lang/String, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 14
          locals = [ long, class java/lang/String, class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 15 /* same */

  public static void setNobless(ext.mods.gameserver.model.actor.Player, ext.mods.gameserver.custom.data.DonateData$Donate);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/custom/data/DonateData$Donate;)V
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=4, locals=2, args_size=2
         0: aload_0
         1: invokevirtual #162                // Method ext/mods/gameserver/model/actor/Player.getClassId:()Lext/mods/gameserver/enums/actors/ClassId;
         4: invokevirtual #168                // Method ext/mods/gameserver/enums/actors/ClassId.getLevel:()I
         7: iconst_3
         8: if_icmpge     27
        11: aload_0
        12: aload_0
        13: sipush        10020
        16: iconst_0
        17: anewarray     #2                  // class java/lang/Object
        20: invokevirtual #173                // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
        23: invokevirtual #177                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
        26: return
        27: aload_0
        28: invokevirtual #180                // Method ext/mods/gameserver/model/actor/Player.isNoble:()Z
        31: ifeq          50
        34: aload_0
        35: aload_0
        36: sipush        10021
        39: iconst_0
        40: anewarray     #2                  // class java/lang/Object
        43: invokevirtual #173                // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
        46: invokevirtual #177                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
        49: return
        50: aload_0
        51: aload_1
        52: invokevirtual #183                // Method ext/mods/gameserver/custom/data/DonateData$Donate.price:()Lext/mods/gameserver/model/holder/IntIntHolder;
        55: invokevirtual #187                // Method ext/mods/gameserver/model/holder/IntIntHolder.getId:()I
        58: aload_1
        59: invokevirtual #183                // Method ext/mods/gameserver/custom/data/DonateData$Donate.price:()Lext/mods/gameserver/model/holder/IntIntHolder;
        62: invokevirtual #192                // Method ext/mods/gameserver/model/holder/IntIntHolder.getValue:()I
        65: iconst_1
        66: invokevirtual #195                // Method ext/mods/gameserver/model/actor/Player.destroyItemByItemId:(IIZ)Z
        69: ifne          73
        72: return
        73: aload_0
        74: iconst_1
        75: iconst_1
        76: invokevirtual #199                // Method ext/mods/gameserver/model/actor/Player.setNoble:(ZZ)V
        79: aload_0
        80: invokevirtual #203                // Method ext/mods/gameserver/model/actor/Player.broadcastUserInfo:()V
        83: return
      LineNumberTable:
        line 143: 0
        line 145: 11
        line 146: 26
        line 149: 27
        line 151: 34
        line 152: 49
        line 155: 50
        line 156: 72
        line 157: 73
        line 158: 79
        line 159: 83
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      84     0 player   Lext/mods/gameserver/model/actor/Player;
            0      84     1 service   Lext/mods/gameserver/custom/data/DonateData$Donate;
      StackMapTable: number_of_entries = 3
        frame_type = 27 /* same */
        frame_type = 22 /* same */
        frame_type = 22 /* same */

  public static void setHero(ext.mods.gameserver.model.actor.Player, ext.mods.gameserver.custom.data.DonateData$Donate);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/custom/data/DonateData$Donate;)V
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=7, locals=3, args_size=2
         0: aload_1
         1: invokevirtual #183                // Method ext/mods/gameserver/custom/data/DonateData$Donate.price:()Lext/mods/gameserver/model/holder/IntIntHolder;
         4: astore_2
         5: aload_0
         6: invokevirtual #206                // Method ext/mods/gameserver/model/actor/Player.isHero:()Z
         9: ifeq          28
        12: aload_0
        13: aload_0
        14: sipush        10022
        17: iconst_0
        18: anewarray     #2                  // class java/lang/Object
        21: invokevirtual #173                // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
        24: invokevirtual #177                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
        27: return
        28: aload_0
        29: invokevirtual #209                // Method ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
        32: aload_2
        33: invokevirtual #187                // Method ext/mods/gameserver/model/holder/IntIntHolder.getId:()I
        36: invokevirtual #213                // Method ext/mods/gameserver/model/itemcontainer/PcInventory.getItemByItemId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
        39: ifnull        63
        42: aload_0
        43: invokevirtual #209                // Method ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
        46: aload_2
        47: invokevirtual #187                // Method ext/mods/gameserver/model/holder/IntIntHolder.getId:()I
        50: invokevirtual #213                // Method ext/mods/gameserver/model/itemcontainer/PcInventory.getItemByItemId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
        53: invokevirtual #219                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getCount:()I
        56: aload_2
        57: invokevirtual #192                // Method ext/mods/gameserver/model/holder/IntIntHolder.getValue:()I
        60: if_icmpge     89
        63: aload_0
        64: aload_0
        65: sipush        10023
        68: iconst_1
        69: anewarray     #2                  // class java/lang/Object
        72: dup
        73: iconst_0
        74: aload_2
        75: invokevirtual #192                // Method ext/mods/gameserver/model/holder/IntIntHolder.getValue:()I
        78: invokestatic  #40                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        81: aastore
        82: invokevirtual #173                // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
        85: invokevirtual #177                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
        88: return
        89: aload_0
        90: aload_2
        91: invokevirtual #187                // Method ext/mods/gameserver/model/holder/IntIntHolder.getId:()I
        94: aload_2
        95: invokevirtual #192                // Method ext/mods/gameserver/model/holder/IntIntHolder.getValue:()I
        98: iconst_1
        99: invokevirtual #195                // Method ext/mods/gameserver/model/actor/Player.destroyItemByItemId:(IIZ)Z
       102: pop
       103: aload_0
       104: new           #224                // class ext/mods/gameserver/network/serverpackets/ItemList
       107: dup
       108: aload_0
       109: iconst_0
       110: invokespecial #226                // Method ext/mods/gameserver/network/serverpackets/ItemList."<init>":(Lext/mods/gameserver/model/actor/Player;Z)V
       113: invokevirtual #229                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       116: aload_0
       117: iconst_1
       118: invokevirtual #233                // Method ext/mods/gameserver/model/actor/Player.setHero:(Z)V
       121: aload_0
       122: invokestatic  #237                // Method java/lang/System.currentTimeMillis:()J
       125: getstatic     #243                // Field java/util/concurrent/TimeUnit.DAYS:Ljava/util/concurrent/TimeUnit;
       128: aload_1
       129: invokevirtual #249                // Method ext/mods/gameserver/custom/data/DonateData$Donate.duration:()I
       132: i2l
       133: invokevirtual #252                // Method java/util/concurrent/TimeUnit.toMillis:(J)J
       136: ladd
       137: invokevirtual #256                // Method ext/mods/gameserver/model/actor/Player.setHeroUntil:(J)V
       140: aload_0
       141: invokevirtual #260                // Method ext/mods/gameserver/model/actor/Player.store:()V
       144: aload_0
       145: aload_0
       146: sipush        10024
       149: iconst_1
       150: anewarray     #2                  // class java/lang/Object
       153: dup
       154: iconst_0
       155: aload_1
       156: invokevirtual #249                // Method ext/mods/gameserver/custom/data/DonateData$Donate.duration:()I
       159: invokestatic  #40                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       162: aastore
       163: invokevirtual #173                // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
       166: invokevirtual #177                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       169: aload_0
       170: invokevirtual #203                // Method ext/mods/gameserver/model/actor/Player.broadcastUserInfo:()V
       173: new           #263                // class ext/mods/gameserver/custom/data/DonateData$1
       176: dup
       177: aload_0
       178: invokespecial #265                // Method ext/mods/gameserver/custom/data/DonateData$1."<init>":(Lext/mods/gameserver/model/actor/Player;)V
       181: aload_0
       182: invokevirtual #268                // Method ext/mods/gameserver/model/actor/Player.getHeroUntil:()J
       185: invokestatic  #237                // Method java/lang/System.currentTimeMillis:()J
       188: lsub
       189: invokestatic  #271                // Method ext/mods/commons/pool/ThreadPool.schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
       192: pop
       193: return
      LineNumberTable:
        line 163: 0
        line 165: 5
        line 167: 12
        line 168: 27
        line 171: 28
        line 173: 63
        line 174: 88
        line 177: 89
        line 178: 103
        line 180: 116
        line 181: 121
        line 182: 140
        line 183: 144
        line 184: 169
        line 185: 173
        line 199: 182
        line 185: 189
        line 200: 193
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     194     0 player   Lext/mods/gameserver/model/actor/Player;
            0     194     1 service   Lext/mods/gameserver/custom/data/DonateData$Donate;
            5     189     2 price   Lext/mods/gameserver/model/holder/IntIntHolder;
      StackMapTable: number_of_entries = 3
        frame_type = 252 /* append */
          offset_delta = 28
          locals = [ class ext/mods/gameserver/model/holder/IntIntHolder ]
        frame_type = 34 /* same */
        frame_type = 25 /* same */

  public static void setNameColor(ext.mods.gameserver.model.actor.Player, ext.mods.gameserver.custom.data.DonateData$Donate, java.lang.String);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/custom/data/DonateData$Donate;Ljava/lang/String;)V
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=4, locals=5, args_size=3
         0: aload_1
         1: invokevirtual #183                // Method ext/mods/gameserver/custom/data/DonateData$Donate.price:()Lext/mods/gameserver/model/holder/IntIntHolder;
         4: astore_3
         5: aload_2
         6: invokedynamic #277,  0            // InvokeDynamic #2:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
        11: invokestatic  #278                // Method java/lang/Integer.decode:(Ljava/lang/String;)Ljava/lang/Integer;
        14: invokevirtual #282                // Method java/lang/Integer.intValue:()I
        17: istore        4
        19: aload_0
        20: aload_3
        21: invokevirtual #187                // Method ext/mods/gameserver/model/holder/IntIntHolder.getId:()I
        24: aload_3
        25: invokevirtual #192                // Method ext/mods/gameserver/model/holder/IntIntHolder.getValue:()I
        28: iconst_1
        29: invokevirtual #195                // Method ext/mods/gameserver/model/actor/Player.destroyItemByItemId:(IIZ)Z
        32: ifne          36
        35: return
        36: aload_0
        37: invokevirtual #285                // Method ext/mods/gameserver/model/actor/Player.getAppearance:()Lext/mods/gameserver/model/actor/container/player/Appearance;
        40: iload         4
        42: invokevirtual #289                // Method ext/mods/gameserver/model/actor/container/player/Appearance.setNameColor:(I)V
        45: aload_0
        46: iload         4
        48: invokevirtual #295                // Method ext/mods/gameserver/model/actor/Player.setNameColor:(I)I
        51: pop
        52: aload_0
        53: invokevirtual #203                // Method ext/mods/gameserver/model/actor/Player.broadcastUserInfo:()V
        56: aload_0
        57: invokevirtual #260                // Method ext/mods/gameserver/model/actor/Player.store:()V
        60: aload_0
        61: aload_0
        62: sipush        10026
        65: iconst_0
        66: anewarray     #2                  // class java/lang/Object
        69: invokevirtual #173                // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
        72: invokevirtual #177                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
        75: return
      LineNumberTable:
        line 204: 0
        line 205: 5
        line 206: 19
        line 207: 35
        line 208: 36
        line 209: 45
        line 210: 52
        line 211: 56
        line 212: 60
        line 213: 75
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      76     0 player   Lext/mods/gameserver/model/actor/Player;
            0      76     1 service   Lext/mods/gameserver/custom/data/DonateData$Donate;
            0      76     2 color   Ljava/lang/String;
            5      71     3 price   Lext/mods/gameserver/model/holder/IntIntHolder;
           19      57     4 colorName   I
      StackMapTable: number_of_entries = 1
        frame_type = 253 /* append */
          offset_delta = 36
          locals = [ class ext/mods/gameserver/model/holder/IntIntHolder, int ]

  public static void setTitleColor(ext.mods.gameserver.model.actor.Player, ext.mods.gameserver.custom.data.DonateData$Donate, java.lang.String);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/custom/data/DonateData$Donate;Ljava/lang/String;)V
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=4, locals=5, args_size=3
         0: aload_1
         1: invokevirtual #183                // Method ext/mods/gameserver/custom/data/DonateData$Donate.price:()Lext/mods/gameserver/model/holder/IntIntHolder;
         4: astore_3
         5: aload_2
         6: invokedynamic #277,  0            // InvokeDynamic #2:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
        11: invokestatic  #278                // Method java/lang/Integer.decode:(Ljava/lang/String;)Ljava/lang/Integer;
        14: invokevirtual #282                // Method java/lang/Integer.intValue:()I
        17: istore        4
        19: aload_0
        20: aload_3
        21: invokevirtual #187                // Method ext/mods/gameserver/model/holder/IntIntHolder.getId:()I
        24: aload_3
        25: invokevirtual #192                // Method ext/mods/gameserver/model/holder/IntIntHolder.getValue:()I
        28: iconst_1
        29: invokevirtual #195                // Method ext/mods/gameserver/model/actor/Player.destroyItemByItemId:(IIZ)Z
        32: ifne          36
        35: return
        36: aload_0
        37: invokevirtual #285                // Method ext/mods/gameserver/model/actor/Player.getAppearance:()Lext/mods/gameserver/model/actor/container/player/Appearance;
        40: iload         4
        42: invokevirtual #298                // Method ext/mods/gameserver/model/actor/container/player/Appearance.setTitleColor:(I)V
        45: aload_0
        46: iload         4
        48: invokevirtual #301                // Method ext/mods/gameserver/model/actor/Player.setTitleColor:(I)I
        51: pop
        52: aload_0
        53: invokevirtual #203                // Method ext/mods/gameserver/model/actor/Player.broadcastUserInfo:()V
        56: aload_0
        57: invokevirtual #260                // Method ext/mods/gameserver/model/actor/Player.store:()V
        60: aload_0
        61: aload_0
        62: sipush        10027
        65: iconst_0
        66: anewarray     #2                  // class java/lang/Object
        69: invokevirtual #173                // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
        72: invokevirtual #177                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
        75: return
      LineNumberTable:
        line 217: 0
        line 218: 5
        line 219: 19
        line 220: 35
        line 221: 36
        line 222: 45
        line 223: 52
        line 224: 56
        line 225: 60
        line 226: 75
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      76     0 player   Lext/mods/gameserver/model/actor/Player;
            0      76     1 service   Lext/mods/gameserver/custom/data/DonateData$Donate;
            0      76     2 color   Ljava/lang/String;
            5      71     3 price   Lext/mods/gameserver/model/holder/IntIntHolder;
           19      57     4 colorTitle   I
      StackMapTable: number_of_entries = 1
        frame_type = 253 /* append */
          offset_delta = 36
          locals = [ class ext/mods/gameserver/model/holder/IntIntHolder, int ]

  public static void setName(ext.mods.gameserver.model.actor.Player, ext.mods.gameserver.custom.data.DonateData$Donate, java.lang.String);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/custom/data/DonateData$Donate;Ljava/lang/String;)V
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=4, locals=4, args_size=3
         0: aload_1
         1: invokevirtual #183                // Method ext/mods/gameserver/custom/data/DonateData$Donate.price:()Lext/mods/gameserver/model/holder/IntIntHolder;
         4: astore_3
         5: aload_2
         6: invokevirtual #303                // Method java/lang/String.length:()I
         9: iconst_1
        10: if_icmplt     29
        13: aload_2
        14: invokevirtual #303                // Method java/lang/String.length:()I
        17: bipush        16
        19: if_icmpgt     29
        22: aload_2
        23: invokestatic  #306                // Method isValidNick:(Ljava/lang/String;)Z
        26: ifne          45
        29: aload_0
        30: aload_0
        31: sipush        10028
        34: iconst_0
        35: anewarray     #2                  // class java/lang/Object
        38: invokevirtual #173                // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
        41: invokevirtual #177                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
        44: return
        45: getstatic     #310                // Field ext/mods/Config.LIST_RESTRICTED_CHAR_NAMES:Ljava/util/List;
        48: aload_2
        49: invokevirtual #313                // Method java/lang/String.toLowerCase:()Ljava/lang/String;
        52: invokeinterface #317,  2          // InterfaceMethod java/util/List.contains:(Ljava/lang/Object;)Z
        57: ifeq          76
        60: aload_0
        61: aload_0
        62: sipush        10028
        65: iconst_0
        66: anewarray     #2                  // class java/lang/Object
        69: invokevirtual #173                // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
        72: invokevirtual #177                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
        75: return
        76: invokestatic  #321                // Method ext/mods/gameserver/data/sql/PlayerInfoTable.getInstance:()Lext/mods/gameserver/data/sql/PlayerInfoTable;
        79: aload_2
        80: invokevirtual #327                // Method ext/mods/gameserver/data/sql/PlayerInfoTable.getPlayerObjectId:(Ljava/lang/String;)I
        83: ifle          102
        86: aload_0
        87: aload_0
        88: sipush        10029
        91: iconst_0
        92: anewarray     #2                  // class java/lang/Object
        95: invokevirtual #173                // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
        98: invokevirtual #177                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       101: return
       102: aload_0
       103: aload_3
       104: invokevirtual #187                // Method ext/mods/gameserver/model/holder/IntIntHolder.getId:()I
       107: aload_3
       108: invokevirtual #192                // Method ext/mods/gameserver/model/holder/IntIntHolder.getValue:()I
       111: iconst_1
       112: invokevirtual #195                // Method ext/mods/gameserver/model/actor/Player.destroyItemByItemId:(IIZ)Z
       115: ifne          119
       118: return
       119: aload_0
       120: aload_2
       121: invokevirtual #331                // Method ext/mods/gameserver/model/actor/Player.setName:(Ljava/lang/String;)V
       124: invokestatic  #321                // Method ext/mods/gameserver/data/sql/PlayerInfoTable.getInstance:()Lext/mods/gameserver/data/sql/PlayerInfoTable;
       127: aload_0
       128: iconst_0
       129: invokevirtual #334                // Method ext/mods/gameserver/data/sql/PlayerInfoTable.updatePlayerData:(Lext/mods/gameserver/model/actor/Player;Z)V
       132: aload_0
       133: invokevirtual #260                // Method ext/mods/gameserver/model/actor/Player.store:()V
       136: aload_0
       137: invokevirtual #203                // Method ext/mods/gameserver/model/actor/Player.broadcastUserInfo:()V
       140: aload_0
       141: invokevirtual #337                // Method ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
       144: ifnull        154
       147: aload_0
       148: invokevirtual #337                // Method ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
       151: invokevirtual #341                // Method ext/mods/gameserver/model/pledge/Clan.broadcastClanStatus:()V
       154: aload_0
       155: aload_0
       156: sipush        10030
       159: iconst_0
       160: anewarray     #2                  // class java/lang/Object
       163: invokevirtual #173                // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
       166: invokevirtual #177                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       169: return
      LineNumberTable:
        line 230: 0
        line 231: 5
        line 233: 29
        line 234: 44
        line 237: 45
        line 239: 60
        line 240: 75
        line 243: 76
        line 245: 86
        line 246: 101
        line 249: 102
        line 250: 118
        line 252: 119
        line 253: 124
        line 255: 132
        line 256: 136
        line 258: 140
        line 259: 147
        line 261: 154
        line 262: 169
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     170     0 player   Lext/mods/gameserver/model/actor/Player;
            0     170     1 service   Lext/mods/gameserver/custom/data/DonateData$Donate;
            0     170     2  nick   Ljava/lang/String;
            5     165     3 price   Lext/mods/gameserver/model/holder/IntIntHolder;
      StackMapTable: number_of_entries = 6
        frame_type = 252 /* append */
          offset_delta = 29
          locals = [ class ext/mods/gameserver/model/holder/IntIntHolder ]
        frame_type = 15 /* same */
        frame_type = 30 /* same */
        frame_type = 25 /* same */
        frame_type = 16 /* same */
        frame_type = 34 /* same */

  public static void setPremium(ext.mods.gameserver.model.actor.Player, ext.mods.gameserver.custom.data.DonateData$Donate);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/custom/data/DonateData$Donate;)V
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=7, locals=6, args_size=2
         0: aload_1
         1: invokevirtual #183                // Method ext/mods/gameserver/custom/data/DonateData$Donate.price:()Lext/mods/gameserver/model/holder/IntIntHolder;
         4: astore_2
         5: lconst_0
         6: lstore_3
         7: getstatic     #346                // Field ext/mods/Config.USE_PREMIUM_SERVICE:Z
        10: ifne          29
        13: aload_0
        14: aload_0
        15: sipush        10031
        18: iconst_0
        19: anewarray     #2                  // class java/lang/Object
        22: invokevirtual #173                // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
        25: invokevirtual #177                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
        28: return
        29: aload_0
        30: invokevirtual #350                // Method ext/mods/gameserver/model/actor/Player.getPremServiceData:()J
        33: invokestatic  #353                // Method java/util/Calendar.getInstance:()Ljava/util/Calendar;
        36: invokevirtual #358                // Method java/util/Calendar.getTimeInMillis:()J
        39: lcmp
        40: ifle          59
        43: aload_0
        44: aload_0
        45: sipush        10032
        48: iconst_0
        49: anewarray     #2                  // class java/lang/Object
        52: invokevirtual #173                // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
        55: invokevirtual #177                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
        58: return
        59: invokestatic  #353                // Method java/util/Calendar.getInstance:()Ljava/util/Calendar;
        62: astore        5
        64: aload         5
        66: iconst_5
        67: aload_1
        68: invokevirtual #249                // Method ext/mods/gameserver/custom/data/DonateData$Donate.duration:()I
        71: invokevirtual #361                // Method java/util/Calendar.add:(II)V
        74: aload         5
        76: invokevirtual #358                // Method java/util/Calendar.getTimeInMillis:()J
        79: lstore_3
        80: goto          86
        83: astore        5
        85: return
        86: aload_0
        87: aload_2
        88: invokevirtual #187                // Method ext/mods/gameserver/model/holder/IntIntHolder.getId:()I
        91: aload_2
        92: invokevirtual #192                // Method ext/mods/gameserver/model/holder/IntIntHolder.getValue:()I
        95: iconst_1
        96: invokevirtual #195                // Method ext/mods/gameserver/model/actor/Player.destroyItemByItemId:(IIZ)Z
        99: ifne          103
       102: return
       103: aload_0
       104: iconst_1
       105: invokevirtual #366                // Method ext/mods/gameserver/model/actor/Player.setPremiumService:(I)V
       108: invokestatic  #369                // Method ext/mods/gameserver/taskmanager/PremiumTaskManager.getInstance:()Lext/mods/gameserver/taskmanager/PremiumTaskManager;
       111: aload_0
       112: invokevirtual #374                // Method ext/mods/gameserver/taskmanager/PremiumTaskManager.add:(Lext/mods/gameserver/model/actor/Player;)V
       115: lload_3
       116: aload_0
       117: invokevirtual #376                // Method ext/mods/gameserver/model/actor/Player.getAccountName:()Ljava/lang/String;
       120: invokestatic  #379                // Method updateDatabasePremium:(JLjava/lang/String;)V
       123: aload_0
       124: aload_0
       125: sipush        10033
       128: iconst_1
       129: anewarray     #2                  // class java/lang/Object
       132: dup
       133: iconst_0
       134: aload_1
       135: invokevirtual #249                // Method ext/mods/gameserver/custom/data/DonateData$Donate.duration:()I
       138: invokestatic  #40                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       141: aastore
       142: invokevirtual #173                // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
       145: invokevirtual #177                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       148: aload_0
       149: invokevirtual #203                // Method ext/mods/gameserver/model/actor/Player.broadcastUserInfo:()V
       152: return
      Exception table:
         from    to  target type
            59    80    83   Class java/lang/NumberFormatException
      LineNumberTable:
        line 266: 0
        line 267: 5
        line 269: 7
        line 271: 13
        line 272: 28
        line 275: 29
        line 277: 43
        line 278: 58
        line 283: 59
        line 284: 64
        line 285: 74
        line 290: 80
        line 287: 83
        line 289: 85
        line 292: 86
        line 293: 102
        line 295: 103
        line 296: 108
        line 297: 115
        line 298: 123
        line 299: 148
        line 300: 152
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           64      16     5   now   Ljava/util/Calendar;
           85       1     5   nfe   Ljava/lang/NumberFormatException;
            0     153     0 player   Lext/mods/gameserver/model/actor/Player;
            0     153     1 service   Lext/mods/gameserver/custom/data/DonateData$Donate;
            5     148     2 price   Lext/mods/gameserver/model/holder/IntIntHolder;
            7     146     3 premiumTime   J
      StackMapTable: number_of_entries = 5
        frame_type = 253 /* append */
          offset_delta = 29
          locals = [ class ext/mods/gameserver/model/holder/IntIntHolder, long ]
        frame_type = 29 /* same */
        frame_type = 87 /* same_locals_1_stack_item */
          stack = [ class java/lang/NumberFormatException ]
        frame_type = 2 /* same */
        frame_type = 16 /* same */

  public static void setGender(ext.mods.gameserver.model.actor.Player, ext.mods.gameserver.custom.data.DonateData$Donate);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/custom/data/DonateData$Donate;)V
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=4, locals=3, args_size=2
         0: aload_1
         1: invokevirtual #183                // Method ext/mods/gameserver/custom/data/DonateData$Donate.price:()Lext/mods/gameserver/model/holder/IntIntHolder;
         4: astore_2
         5: aload_0
         6: aload_2
         7: invokevirtual #187                // Method ext/mods/gameserver/model/holder/IntIntHolder.getId:()I
        10: aload_2
        11: invokevirtual #192                // Method ext/mods/gameserver/model/holder/IntIntHolder.getValue:()I
        14: iconst_1
        15: invokevirtual #195                // Method ext/mods/gameserver/model/actor/Player.destroyItemByItemId:(IIZ)Z
        18: ifne          22
        21: return
        22: getstatic     #383                // Field ext/mods/gameserver/custom/data/DonateData$2.$SwitchMap$ext$mods$gameserver$enums$actors$Sex:[I
        25: aload_0
        26: invokevirtual #285                // Method ext/mods/gameserver/model/actor/Player.getAppearance:()Lext/mods/gameserver/model/actor/container/player/Appearance;
        29: invokevirtual #389                // Method ext/mods/gameserver/model/actor/container/player/Appearance.getSex:()Lext/mods/gameserver/enums/actors/Sex;
        32: invokevirtual #393                // Method ext/mods/gameserver/enums/actors/Sex.ordinal:()I
        35: iaload
        36: lookupswitch  { // 2

                       1: 64

                       2: 77
                 default: 87
            }
        64: aload_0
        65: invokevirtual #285                // Method ext/mods/gameserver/model/actor/Player.getAppearance:()Lext/mods/gameserver/model/actor/container/player/Appearance;
        68: getstatic     #398                // Field ext/mods/gameserver/enums/actors/Sex.FEMALE:Lext/mods/gameserver/enums/actors/Sex;
        71: invokevirtual #402                // Method ext/mods/gameserver/model/actor/container/player/Appearance.setSex:(Lext/mods/gameserver/enums/actors/Sex;)V
        74: goto          87
        77: aload_0
        78: invokevirtual #285                // Method ext/mods/gameserver/model/actor/Player.getAppearance:()Lext/mods/gameserver/model/actor/container/player/Appearance;
        81: getstatic     #406                // Field ext/mods/gameserver/enums/actors/Sex.MALE:Lext/mods/gameserver/enums/actors/Sex;
        84: invokevirtual #402                // Method ext/mods/gameserver/model/actor/container/player/Appearance.setSex:(Lext/mods/gameserver/enums/actors/Sex;)V
        87: aload_0
        88: invokevirtual #260                // Method ext/mods/gameserver/model/actor/Player.store:()V
        91: aload_0
        92: invokevirtual #203                // Method ext/mods/gameserver/model/actor/Player.broadcastUserInfo:()V
        95: aload_0
        96: aload_0
        97: sipush        10034
       100: iconst_0
       101: anewarray     #2                  // class java/lang/Object
       104: invokevirtual #173                // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
       107: invokevirtual #177                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       110: aload_0
       111: invokevirtual #409                // Method ext/mods/gameserver/model/actor/Player.decayMe:()V
       114: aload_0
       115: invokevirtual #412                // Method ext/mods/gameserver/model/actor/Player.spawnMe:()V
       118: aload_0
       119: iconst_0
       120: invokevirtual #415                // Method ext/mods/gameserver/model/actor/Player.logout:(Z)V
       123: return
      LineNumberTable:
        line 304: 0
        line 305: 5
        line 306: 21
        line 308: 22
        line 311: 64
        line 312: 74
        line 315: 77
        line 319: 87
        line 320: 91
        line 321: 95
        line 322: 110
        line 323: 114
        line 324: 118
        line 325: 123
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     124     0 player   Lext/mods/gameserver/model/actor/Player;
            0     124     1 service   Lext/mods/gameserver/custom/data/DonateData$Donate;
            5     119     2 price   Lext/mods/gameserver/model/holder/IntIntHolder;
      StackMapTable: number_of_entries = 4
        frame_type = 252 /* append */
          offset_delta = 22
          locals = [ class ext/mods/gameserver/model/holder/IntIntHolder ]
        frame_type = 41 /* same */
        frame_type = 12 /* same */
        frame_type = 9 /* same */

  public static void clearPK(ext.mods.gameserver.model.actor.Player, ext.mods.gameserver.custom.data.DonateData$Donate);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/custom/data/DonateData$Donate;)V
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=4, locals=3, args_size=2
         0: aload_1
         1: invokevirtual #183                // Method ext/mods/gameserver/custom/data/DonateData$Donate.price:()Lext/mods/gameserver/model/holder/IntIntHolder;
         4: astore_2
         5: aload_0
         6: invokevirtual #418                // Method ext/mods/gameserver/model/actor/Player.getPkKills:()I
         9: ifne          35
        12: aload_0
        13: invokevirtual #421                // Method ext/mods/gameserver/model/actor/Player.getKarma:()I
        16: ifne          35
        19: aload_0
        20: aload_0
        21: sipush        10035
        24: iconst_0
        25: anewarray     #2                  // class java/lang/Object
        28: invokevirtual #173                // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
        31: invokevirtual #177                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
        34: return
        35: aload_0
        36: invokevirtual #209                // Method ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
        39: aload_2
        40: invokevirtual #187                // Method ext/mods/gameserver/model/holder/IntIntHolder.getId:()I
        43: invokevirtual #213                // Method ext/mods/gameserver/model/itemcontainer/PcInventory.getItemByItemId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
        46: ifnonnull     57
        49: aload_0
        50: getstatic     #424                // Field ext/mods/gameserver/network/SystemMessageId.NOT_ENOUGH_ITEMS:Lext/mods/gameserver/network/SystemMessageId;
        53: invokevirtual #430                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        56: return
        57: aload_0
        58: invokevirtual #209                // Method ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
        61: aload_2
        62: invokevirtual #187                // Method ext/mods/gameserver/model/holder/IntIntHolder.getId:()I
        65: invokevirtual #213                // Method ext/mods/gameserver/model/itemcontainer/PcInventory.getItemByItemId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
        68: invokevirtual #219                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getCount:()I
        71: aload_2
        72: invokevirtual #192                // Method ext/mods/gameserver/model/holder/IntIntHolder.getValue:()I
        75: if_icmpge     86
        78: aload_0
        79: getstatic     #424                // Field ext/mods/gameserver/network/SystemMessageId.NOT_ENOUGH_ITEMS:Lext/mods/gameserver/network/SystemMessageId;
        82: invokevirtual #430                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        85: return
        86: aload_0
        87: aload_2
        88: invokevirtual #187                // Method ext/mods/gameserver/model/holder/IntIntHolder.getId:()I
        91: aload_2
        92: invokevirtual #192                // Method ext/mods/gameserver/model/holder/IntIntHolder.getValue:()I
        95: iconst_1
        96: invokevirtual #195                // Method ext/mods/gameserver/model/actor/Player.destroyItemByItemId:(IIZ)Z
        99: pop
       100: aload_0
       101: iconst_0
       102: invokevirtual #433                // Method ext/mods/gameserver/model/actor/Player.setPkKills:(I)V
       105: aload_0
       106: iconst_0
       107: invokevirtual #436                // Method ext/mods/gameserver/model/actor/Player.setKarma:(I)V
       110: aload_0
       111: invokevirtual #203                // Method ext/mods/gameserver/model/actor/Player.broadcastUserInfo:()V
       114: aload_0
       115: aload_0
       116: sipush        10036
       119: iconst_0
       120: anewarray     #2                  // class java/lang/Object
       123: invokevirtual #173                // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
       126: invokevirtual #177                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       129: return
      LineNumberTable:
        line 329: 0
        line 331: 5
        line 333: 19
        line 334: 34
        line 337: 35
        line 339: 49
        line 340: 56
        line 343: 57
        line 345: 78
        line 346: 85
        line 349: 86
        line 350: 100
        line 351: 105
        line 352: 110
        line 353: 114
        line 355: 129
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     130     0 player   Lext/mods/gameserver/model/actor/Player;
            0     130     1 service   Lext/mods/gameserver/custom/data/DonateData$Donate;
            5     125     2 price   Lext/mods/gameserver/model/holder/IntIntHolder;
      StackMapTable: number_of_entries = 3
        frame_type = 252 /* append */
          offset_delta = 35
          locals = [ class ext/mods/gameserver/model/holder/IntIntHolder ]
        frame_type = 21 /* same */
        frame_type = 28 /* same */

  public static void setClanLevel(ext.mods.gameserver.model.actor.Player, ext.mods.gameserver.custom.data.DonateData$Donate);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/custom/data/DonateData$Donate;)V
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=4, locals=4, args_size=2
         0: aload_1
         1: invokevirtual #183                // Method ext/mods/gameserver/custom/data/DonateData$Donate.price:()Lext/mods/gameserver/model/holder/IntIntHolder;
         4: astore_2
         5: aload_2
         6: invokevirtual #187                // Method ext/mods/gameserver/model/holder/IntIntHolder.getId:()I
         9: istore_3
        10: aload_0
        11: invokevirtual #337                // Method ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
        14: ifnonnull     18
        17: return
        18: aload_0
        19: invokevirtual #337                // Method ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
        22: invokevirtual #439                // Method ext/mods/gameserver/model/pledge/Clan.getLevel:()I
        25: bipush        8
        27: if_icmpne     46
        30: aload_0
        31: aload_0
        32: sipush        10037
        35: iconst_0
        36: anewarray     #2                  // class java/lang/Object
        39: invokevirtual #173                // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
        42: invokevirtual #177                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
        45: return
        46: aload_0
        47: invokevirtual #440                // Method ext/mods/gameserver/model/actor/Player.isClanLeader:()Z
        50: ifne          69
        53: aload_0
        54: aload_0
        55: sipush        10038
        58: iconst_0
        59: anewarray     #2                  // class java/lang/Object
        62: invokevirtual #173                // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
        65: invokevirtual #177                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
        68: return
        69: aload_0
        70: invokevirtual #209                // Method ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
        73: iload_3
        74: invokevirtual #213                // Method ext/mods/gameserver/model/itemcontainer/PcInventory.getItemByItemId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
        77: ifnonnull     88
        80: aload_0
        81: getstatic     #424                // Field ext/mods/gameserver/network/SystemMessageId.NOT_ENOUGH_ITEMS:Lext/mods/gameserver/network/SystemMessageId;
        84: invokevirtual #430                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        87: return
        88: aload_0
        89: invokevirtual #209                // Method ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
        92: iload_3
        93: invokevirtual #213                // Method ext/mods/gameserver/model/itemcontainer/PcInventory.getItemByItemId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
        96: invokevirtual #219                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getCount:()I
        99: aload_2
       100: invokevirtual #192                // Method ext/mods/gameserver/model/holder/IntIntHolder.getValue:()I
       103: if_icmpge     114
       106: aload_0
       107: getstatic     #424                // Field ext/mods/gameserver/network/SystemMessageId.NOT_ENOUGH_ITEMS:Lext/mods/gameserver/network/SystemMessageId;
       110: invokevirtual #430                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       113: return
       114: aload_1
       115: invokevirtual #249                // Method ext/mods/gameserver/custom/data/DonateData$Donate.duration:()I
       118: aload_0
       119: invokevirtual #337                // Method ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
       122: invokevirtual #439                // Method ext/mods/gameserver/model/pledge/Clan.getLevel:()I
       125: if_icmple     165
       128: aload_0
       129: iload_3
       130: aload_2
       131: invokevirtual #192                // Method ext/mods/gameserver/model/holder/IntIntHolder.getValue:()I
       134: iconst_1
       135: invokevirtual #195                // Method ext/mods/gameserver/model/actor/Player.destroyItemByItemId:(IIZ)Z
       138: pop
       139: aload_0
       140: invokevirtual #337                // Method ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
       143: aload_1
       144: invokevirtual #249                // Method ext/mods/gameserver/custom/data/DonateData$Donate.duration:()I
       147: invokevirtual #443                // Method ext/mods/gameserver/model/pledge/Clan.changeLevel:(I)V
       150: aload_0
       151: aload_0
       152: sipush        10039
       155: iconst_0
       156: anewarray     #2                  // class java/lang/Object
       159: invokevirtual #173                // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
       162: invokevirtual #177                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       165: return
      LineNumberTable:
        line 359: 0
        line 360: 5
        line 362: 10
        line 363: 17
        line 365: 18
        line 367: 30
        line 368: 45
        line 371: 46
        line 373: 53
        line 374: 68
        line 377: 69
        line 379: 80
        line 380: 87
        line 383: 88
        line 385: 106
        line 386: 113
        line 389: 114
        line 391: 128
        line 392: 139
        line 393: 150
        line 395: 165
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     166     0 player   Lext/mods/gameserver/model/actor/Player;
            0     166     1 service   Lext/mods/gameserver/custom/data/DonateData$Donate;
            5     161     2 price   Lext/mods/gameserver/model/holder/IntIntHolder;
           10     156     3 clanItemId   I
      StackMapTable: number_of_entries = 6
        frame_type = 253 /* append */
          offset_delta = 18
          locals = [ class ext/mods/gameserver/model/holder/IntIntHolder, int ]
        frame_type = 27 /* same */
        frame_type = 22 /* same */
        frame_type = 18 /* same */
        frame_type = 25 /* same */
        frame_type = 50 /* same */

  public static void addClanSkill(ext.mods.gameserver.model.actor.Player, ext.mods.gameserver.custom.data.DonateData$Donate);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/custom/data/DonateData$Donate;)V
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=7, locals=3, args_size=2
         0: aload_1
         1: invokevirtual #183                // Method ext/mods/gameserver/custom/data/DonateData$Donate.price:()Lext/mods/gameserver/model/holder/IntIntHolder;
         4: astore_2
         5: aload_0
         6: invokevirtual #440                // Method ext/mods/gameserver/model/actor/Player.isClanLeader:()Z
         9: ifne          28
        12: aload_0
        13: aload_0
        14: sipush        10040
        17: iconst_0
        18: anewarray     #2                  // class java/lang/Object
        21: invokevirtual #173                // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
        24: invokevirtual #177                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
        27: return
        28: aload_0
        29: invokevirtual #337                // Method ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
        32: ifnull        46
        35: aload_0
        36: invokevirtual #337                // Method ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
        39: invokevirtual #439                // Method ext/mods/gameserver/model/pledge/Clan.getLevel:()I
        42: iconst_5
        43: if_icmpge     62
        46: aload_0
        47: aload_0
        48: sipush        10041
        51: iconst_0
        52: anewarray     #2                  // class java/lang/Object
        55: invokevirtual #173                // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
        58: invokevirtual #177                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
        61: return
        62: aload_0
        63: invokevirtual #209                // Method ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
        66: aload_2
        67: invokevirtual #187                // Method ext/mods/gameserver/model/holder/IntIntHolder.getId:()I
        70: invokevirtual #213                // Method ext/mods/gameserver/model/itemcontainer/PcInventory.getItemByItemId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
        73: ifnonnull     84
        76: aload_0
        77: getstatic     #424                // Field ext/mods/gameserver/network/SystemMessageId.NOT_ENOUGH_ITEMS:Lext/mods/gameserver/network/SystemMessageId;
        80: invokevirtual #430                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        83: return
        84: aload_0
        85: invokevirtual #209                // Method ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
        88: aload_2
        89: invokevirtual #187                // Method ext/mods/gameserver/model/holder/IntIntHolder.getId:()I
        92: invokevirtual #213                // Method ext/mods/gameserver/model/itemcontainer/PcInventory.getItemByItemId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
        95: invokevirtual #219                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getCount:()I
        98: aload_2
        99: invokevirtual #192                // Method ext/mods/gameserver/model/holder/IntIntHolder.getValue:()I
       102: if_icmpge     113
       105: aload_0
       106: getstatic     #424                // Field ext/mods/gameserver/network/SystemMessageId.NOT_ENOUGH_ITEMS:Lext/mods/gameserver/network/SystemMessageId;
       109: invokevirtual #430                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       112: return
       113: aload_0
       114: invokevirtual #337                // Method ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
       117: invokevirtual #446                // Method ext/mods/gameserver/model/pledge/Clan.addAllClanSkills:()Z
       120: ifne          139
       123: aload_0
       124: aload_0
       125: sipush        10042
       128: iconst_0
       129: anewarray     #2                  // class java/lang/Object
       132: invokevirtual #173                // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
       135: invokevirtual #177                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       138: return
       139: aload_0
       140: aload_2
       141: invokevirtual #187                // Method ext/mods/gameserver/model/holder/IntIntHolder.getId:()I
       144: aload_2
       145: invokevirtual #192                // Method ext/mods/gameserver/model/holder/IntIntHolder.getValue:()I
       148: iconst_1
       149: invokevirtual #195                // Method ext/mods/gameserver/model/actor/Player.destroyItemByItemId:(IIZ)Z
       152: pop
       153: aload_0
       154: invokevirtual #337                // Method ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
       157: invokevirtual #446                // Method ext/mods/gameserver/model/pledge/Clan.addAllClanSkills:()Z
       160: pop
       161: aload_0
       162: invokevirtual #337                // Method ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
       165: iconst_1
       166: anewarray     #449                // class ext/mods/gameserver/network/serverpackets/L2GameServerPacket
       169: dup
       170: iconst_0
       171: new           #451                // class ext/mods/gameserver/network/serverpackets/PledgeSkillList
       174: dup
       175: aload_0
       176: invokevirtual #337                // Method ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
       179: invokespecial #453                // Method ext/mods/gameserver/network/serverpackets/PledgeSkillList."<init>":(Lext/mods/gameserver/model/pledge/Clan;)V
       182: aastore
       183: invokevirtual #456                // Method ext/mods/gameserver/model/pledge/Clan.broadcastToMembers:([Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       186: aload_0
       187: aload_0
       188: sipush        10043
       191: iconst_0
       192: anewarray     #2                  // class java/lang/Object
       195: invokevirtual #173                // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
       198: invokevirtual #177                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       201: return
      LineNumberTable:
        line 399: 0
        line 401: 5
        line 403: 12
        line 404: 27
        line 407: 28
        line 409: 46
        line 410: 61
        line 413: 62
        line 415: 76
        line 416: 83
        line 419: 84
        line 421: 105
        line 422: 112
        line 425: 113
        line 427: 123
        line 428: 138
        line 431: 139
        line 432: 153
        line 433: 161
        line 434: 186
        line 435: 201
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     202     0 player   Lext/mods/gameserver/model/actor/Player;
            0     202     1 service   Lext/mods/gameserver/custom/data/DonateData$Donate;
            5     197     2 price   Lext/mods/gameserver/model/holder/IntIntHolder;
      StackMapTable: number_of_entries = 6
        frame_type = 252 /* append */
          offset_delta = 28
          locals = [ class ext/mods/gameserver/model/holder/IntIntHolder ]
        frame_type = 17 /* same */
        frame_type = 15 /* same */
        frame_type = 21 /* same */
        frame_type = 28 /* same */
        frame_type = 25 /* same */

  public static void addClanRep(ext.mods.gameserver.model.actor.Player, ext.mods.gameserver.custom.data.DonateData$Donate);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/custom/data/DonateData$Donate;)V
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=7, locals=3, args_size=2
         0: aload_1
         1: invokevirtual #183                // Method ext/mods/gameserver/custom/data/DonateData$Donate.price:()Lext/mods/gameserver/model/holder/IntIntHolder;
         4: astore_2
         5: aload_0
         6: invokevirtual #440                // Method ext/mods/gameserver/model/actor/Player.isClanLeader:()Z
         9: ifne          28
        12: aload_0
        13: aload_0
        14: sipush        10038
        17: iconst_0
        18: anewarray     #2                  // class java/lang/Object
        21: invokevirtual #173                // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
        24: invokevirtual #177                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
        27: return
        28: aload_0
        29: invokevirtual #337                // Method ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
        32: ifnull        46
        35: aload_0
        36: invokevirtual #337                // Method ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
        39: invokevirtual #439                // Method ext/mods/gameserver/model/pledge/Clan.getLevel:()I
        42: iconst_5
        43: if_icmpge     62
        46: aload_0
        47: aload_0
        48: sipush        10041
        51: iconst_0
        52: anewarray     #2                  // class java/lang/Object
        55: invokevirtual #173                // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
        58: invokevirtual #177                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
        61: return
        62: aload_0
        63: invokevirtual #209                // Method ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
        66: aload_2
        67: invokevirtual #187                // Method ext/mods/gameserver/model/holder/IntIntHolder.getId:()I
        70: invokevirtual #213                // Method ext/mods/gameserver/model/itemcontainer/PcInventory.getItemByItemId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
        73: ifnonnull     84
        76: aload_0
        77: getstatic     #424                // Field ext/mods/gameserver/network/SystemMessageId.NOT_ENOUGH_ITEMS:Lext/mods/gameserver/network/SystemMessageId;
        80: invokevirtual #430                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        83: return
        84: aload_0
        85: invokevirtual #209                // Method ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
        88: aload_2
        89: invokevirtual #187                // Method ext/mods/gameserver/model/holder/IntIntHolder.getId:()I
        92: invokevirtual #213                // Method ext/mods/gameserver/model/itemcontainer/PcInventory.getItemByItemId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
        95: invokevirtual #219                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getCount:()I
        98: aload_2
        99: invokevirtual #192                // Method ext/mods/gameserver/model/holder/IntIntHolder.getValue:()I
       102: if_icmpge     113
       105: aload_0
       106: getstatic     #424                // Field ext/mods/gameserver/network/SystemMessageId.NOT_ENOUGH_ITEMS:Lext/mods/gameserver/network/SystemMessageId;
       109: invokevirtual #430                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       112: return
       113: aload_0
       114: aload_2
       115: invokevirtual #187                // Method ext/mods/gameserver/model/holder/IntIntHolder.getId:()I
       118: aload_2
       119: invokevirtual #192                // Method ext/mods/gameserver/model/holder/IntIntHolder.getValue:()I
       122: iconst_1
       123: invokevirtual #195                // Method ext/mods/gameserver/model/actor/Player.destroyItemByItemId:(IIZ)Z
       126: pop
       127: aload_0
       128: invokevirtual #337                // Method ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
       131: aload_1
       132: invokevirtual #249                // Method ext/mods/gameserver/custom/data/DonateData$Donate.duration:()I
       135: invokevirtual #460                // Method ext/mods/gameserver/model/pledge/Clan.addReputationScore:(I)Z
       138: pop
       139: aload_0
       140: aload_0
       141: sipush        10044
       144: iconst_1
       145: anewarray     #2                  // class java/lang/Object
       148: dup
       149: iconst_0
       150: aload_0
       151: invokevirtual #337                // Method ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
       154: invokevirtual #464                // Method ext/mods/gameserver/model/pledge/Clan.getReputationScore:()I
       157: invokestatic  #40                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       160: aastore
       161: invokevirtual #173                // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
       164: invokevirtual #177                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       167: return
      LineNumberTable:
        line 439: 0
        line 441: 5
        line 443: 12
        line 444: 27
        line 447: 28
        line 449: 46
        line 450: 61
        line 453: 62
        line 455: 76
        line 456: 83
        line 459: 84
        line 461: 105
        line 462: 112
        line 465: 113
        line 466: 127
        line 467: 139
        line 468: 167
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     168     0 player   Lext/mods/gameserver/model/actor/Player;
            0     168     1 service   Lext/mods/gameserver/custom/data/DonateData$Donate;
            5     163     2 price   Lext/mods/gameserver/model/holder/IntIntHolder;
      StackMapTable: number_of_entries = 5
        frame_type = 252 /* append */
          offset_delta = 28
          locals = [ class ext/mods/gameserver/model/holder/IntIntHolder ]
        frame_type = 17 /* same */
        frame_type = 15 /* same */
        frame_type = 21 /* same */
        frame_type = 28 /* same */

  public static ext.mods.gameserver.custom.data.DonateData getInstance();
    descriptor: ()Lext/mods/gameserver/custom/data/DonateData;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #467                // Field ext/mods/gameserver/custom/data/DonateData$SingletonHolder.INSTANCE:Lext/mods/gameserver/custom/data/DonateData;
         3: areturn
      LineNumberTable:
        line 472: 0
}
SourceFile: "DonateData.java"
NestMembers:
  ext/mods/gameserver/custom/data/DonateData$2
  ext/mods/gameserver/custom/data/DonateData$SingletonHolder
  ext/mods/gameserver/custom/data/DonateData$Donate
  ext/mods/gameserver/custom/data/DonateData$1
BootstrapMethods:
  0: #573 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #561 (Ljava/lang/Object;)V
      #562 REF_invokeVirtual ext/mods/gameserver/custom/data/DonateData.lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
      #565 (Lorg/w3c/dom/Node;)V
  1: #580 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #566 updateDatabasePremium: Could not update data:\u0001
  2: #580 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #568 0x\u0001
  3: #573 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #561 (Ljava/lang/Object;)V
      #570 REF_invokeVirtual ext/mods/gameserver/custom/data/DonateData.lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
      #565 (Lorg/w3c/dom/Node;)V
InnerClasses:
  public static final #587= #76 of #11;   // Donate=class ext/mods/gameserver/custom/data/DonateData$Donate of class ext/mods/gameserver/custom/data/DonateData
  #263;                                   // class ext/mods/gameserver/custom/data/DonateData$1
  static #384;                            // class ext/mods/gameserver/custom/data/DonateData$2
  public static final #593= #589 of #591; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
