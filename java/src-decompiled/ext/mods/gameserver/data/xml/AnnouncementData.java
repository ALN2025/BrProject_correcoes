// Bytecode for: ext.mods.gameserver.data.xml.AnnouncementData
// File: ext\mods\gameserver\data\xml\AnnouncementData.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/data/xml/AnnouncementData.class
  Last modified 9 de jul de 2026; size 9925 bytes
  MD5 checksum 55e9e75f67dbac88dd0d5c393a74b559
  Compiled from "AnnouncementData.java"
public class ext.mods.gameserver.data.xml.AnnouncementData implements ext.mods.commons.data.xml.IXmlReader
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #11                         // ext/mods/gameserver/data/xml/AnnouncementData
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 2, methods: 13, attributes: 4
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
   #10 = Fieldref           #11.#12       // ext/mods/gameserver/data/xml/AnnouncementData._announcements:Ljava/util/Map;
   #11 = Class              #13           // ext/mods/gameserver/data/xml/AnnouncementData
   #12 = NameAndType        #14:#15       // _announcements:Ljava/util/Map;
   #13 = Utf8               ext/mods/gameserver/data/xml/AnnouncementData
   #14 = Utf8               _announcements
   #15 = Utf8               Ljava/util/Map;
   #16 = Methodref          #11.#17       // ext/mods/gameserver/data/xml/AnnouncementData.load:()V
   #17 = NameAndType        #18:#6        // load:()V
   #18 = Utf8               load
   #19 = String             #20           // xml/announcements.xml
   #20 = Utf8               xml/announcements.xml
   #21 = Methodref          #11.#22       // ext/mods/gameserver/data/xml/AnnouncementData.parseDataFile:(Ljava/lang/String;)V
   #22 = NameAndType        #23:#24       // parseDataFile:(Ljava/lang/String;)V
   #23 = Utf8               parseDataFile
   #24 = Utf8               (Ljava/lang/String;)V
   #25 = Fieldref           #11.#26       // ext/mods/gameserver/data/xml/AnnouncementData.LOGGER:Lext/mods/commons/logging/CLogger;
   #26 = NameAndType        #27:#28       // LOGGER:Lext/mods/commons/logging/CLogger;
   #27 = Utf8               LOGGER
   #28 = Utf8               Lext/mods/commons/logging/CLogger;
   #29 = String             #30           // Loaded {} announcements.
   #30 = Utf8               Loaded {} announcements.
   #31 = InterfaceMethodref #32.#33       // java/util/Map.size:()I
   #32 = Class              #34           // java/util/Map
   #33 = NameAndType        #35:#36       // size:()I
   #34 = Utf8               java/util/Map
   #35 = Utf8               size
   #36 = Utf8               ()I
   #37 = Methodref          #38.#39       // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
   #38 = Class              #40           // java/lang/Integer
   #39 = NameAndType        #41:#42       // valueOf:(I)Ljava/lang/Integer;
   #40 = Utf8               java/lang/Integer
   #41 = Utf8               valueOf
   #42 = Utf8               (I)Ljava/lang/Integer;
   #43 = Methodref          #44.#45       // ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
   #44 = Class              #46           // ext/mods/commons/logging/CLogger
   #45 = NameAndType        #47:#48       // info:(Ljava/lang/Object;[Ljava/lang/Object;)V
   #46 = Utf8               ext/mods/commons/logging/CLogger
   #47 = Utf8               info
   #48 = Utf8               (Ljava/lang/Object;[Ljava/lang/Object;)V
   #49 = String             #50           // list
   #50 = Utf8               list
   #51 = InvokeDynamic      #0:#52        // #0:accept:(Lext/mods/gameserver/data/xml/AnnouncementData;)Ljava/util/function/Consumer;
   #52 = NameAndType        #53:#54       // accept:(Lext/mods/gameserver/data/xml/AnnouncementData;)Ljava/util/function/Consumer;
   #53 = Utf8               accept
   #54 = Utf8               (Lext/mods/gameserver/data/xml/AnnouncementData;)Ljava/util/function/Consumer;
   #55 = Methodref          #11.#56       // ext/mods/gameserver/data/xml/AnnouncementData.forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
   #56 = NameAndType        #57:#58       // forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
   #57 = Utf8               forEach
   #58 = Utf8               (Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
   #59 = InterfaceMethodref #32.#60       // java/util/Map.values:()Ljava/util/Collection;
   #60 = NameAndType        #61:#62       // values:()Ljava/util/Collection;
   #61 = Utf8               values
   #62 = Utf8               ()Ljava/util/Collection;
   #63 = InterfaceMethodref #64.#65       // java/util/Collection.iterator:()Ljava/util/Iterator;
   #64 = Class              #66           // java/util/Collection
   #65 = NameAndType        #67:#68       // iterator:()Ljava/util/Iterator;
   #66 = Utf8               java/util/Collection
   #67 = Utf8               iterator
   #68 = Utf8               ()Ljava/util/Iterator;
   #69 = InterfaceMethodref #70.#71       // java/util/Iterator.hasNext:()Z
   #70 = Class              #72           // java/util/Iterator
   #71 = NameAndType        #73:#74       // hasNext:()Z
   #72 = Utf8               java/util/Iterator
   #73 = Utf8               hasNext
   #74 = Utf8               ()Z
   #75 = InterfaceMethodref #70.#76       // java/util/Iterator.next:()Ljava/lang/Object;
   #76 = NameAndType        #77:#78       // next:()Ljava/lang/Object;
   #77 = Utf8               next
   #78 = Utf8               ()Ljava/lang/Object;
   #79 = Class              #80           // ext/mods/gameserver/model/Announcement
   #80 = Utf8               ext/mods/gameserver/model/Announcement
   #81 = Methodref          #79.#82       // ext/mods/gameserver/model/Announcement.stopTask:()V
   #82 = NameAndType        #83:#6        // stopTask:()V
   #83 = Utf8               stopTask
   #84 = InterfaceMethodref #32.#85       // java/util/Map.clear:()V
   #85 = NameAndType        #86:#6        // clear:()V
   #86 = Utf8               clear
   #87 = Methodref          #79.#88       // ext/mods/gameserver/model/Announcement.reloadTask:()V
   #88 = NameAndType        #89:#6        // reloadTask:()V
   #89 = Utf8               reloadTask
   #90 = Methodref          #79.#91       // ext/mods/gameserver/model/Announcement.isAuto:()Z
   #91 = NameAndType        #92:#74       // isAuto:()Z
   #92 = Utf8               isAuto
   #93 = Class              #94           // ext/mods/gameserver/network/serverpackets/CreatureSay
   #94 = Utf8               ext/mods/gameserver/network/serverpackets/CreatureSay
   #95 = Methodref          #79.#96       // ext/mods/gameserver/model/Announcement.isCritical:()Z
   #96 = NameAndType        #97:#74       // isCritical:()Z
   #97 = Utf8               isCritical
   #98 = Fieldref           #99.#100      // ext/mods/gameserver/enums/SayType.CRITICAL_ANNOUNCE:Lext/mods/gameserver/enums/SayType;
   #99 = Class              #101          // ext/mods/gameserver/enums/SayType
  #100 = NameAndType        #102:#103     // CRITICAL_ANNOUNCE:Lext/mods/gameserver/enums/SayType;
  #101 = Utf8               ext/mods/gameserver/enums/SayType
  #102 = Utf8               CRITICAL_ANNOUNCE
  #103 = Utf8               Lext/mods/gameserver/enums/SayType;
  #104 = Fieldref           #99.#105      // ext/mods/gameserver/enums/SayType.ANNOUNCEMENT:Lext/mods/gameserver/enums/SayType;
  #105 = NameAndType        #106:#103     // ANNOUNCEMENT:Lext/mods/gameserver/enums/SayType;
  #106 = Utf8               ANNOUNCEMENT
  #107 = Methodref          #108.#109     // ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
  #108 = Class              #110          // ext/mods/gameserver/model/actor/Player
  #109 = NameAndType        #111:#112     // getName:()Ljava/lang/String;
  #110 = Utf8               ext/mods/gameserver/model/actor/Player
  #111 = Utf8               getName
  #112 = Utf8               ()Ljava/lang/String;
  #113 = Methodref          #79.#114      // ext/mods/gameserver/model/Announcement.getMessage:()Ljava/lang/String;
  #114 = NameAndType        #115:#112     // getMessage:()Ljava/lang/String;
  #115 = Utf8               getMessage
  #116 = Methodref          #93.#117      // ext/mods/gameserver/network/serverpackets/CreatureSay."<init>":(Lext/mods/gameserver/enums/SayType;Ljava/lang/String;Ljava/lang/String;)V
  #117 = NameAndType        #5:#118       // "<init>":(Lext/mods/gameserver/enums/SayType;Ljava/lang/String;Ljava/lang/String;)V
  #118 = Utf8               (Lext/mods/gameserver/enums/SayType;Ljava/lang/String;Ljava/lang/String;)V
  #119 = Methodref          #108.#120     // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #120 = NameAndType        #121:#122     // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #121 = Utf8               sendPacket
  #122 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #123 = Methodref          #124.#125     // java/lang/String.substring:(I)Ljava/lang/String;
  #124 = Class              #126          // java/lang/String
  #125 = NameAndType        #127:#128     // substring:(I)Ljava/lang/String;
  #126 = Utf8               java/lang/String
  #127 = Utf8               substring
  #128 = Utf8               (I)Ljava/lang/String;
  #129 = Methodref          #130.#131     // ext/mods/gameserver/model/World.announceToOnlinePlayers:(Ljava/lang/String;Z)V
  #130 = Class              #132          // ext/mods/gameserver/model/World
  #131 = NameAndType        #133:#134     // announceToOnlinePlayers:(Ljava/lang/String;Z)V
  #132 = Utf8               ext/mods/gameserver/model/World
  #133 = Utf8               announceToOnlinePlayers
  #134 = Utf8               (Ljava/lang/String;Z)V
  #135 = Class              #136          // java/lang/StringIndexOutOfBoundsException
  #136 = Utf8               java/lang/StringIndexOutOfBoundsException
  #137 = Class              #138          // java/lang/StringBuilder
  #138 = Utf8               java/lang/StringBuilder
  #139 = String             #140          // <br>
  #140 = Utf8               <br>
  #141 = Methodref          #137.#142     // java/lang/StringBuilder."<init>":(Ljava/lang/String;)V
  #142 = NameAndType        #5:#24        // "<init>":(Ljava/lang/String;)V
  #143 = InterfaceMethodref #32.#144      // java/util/Map.isEmpty:()Z
  #144 = NameAndType        #145:#74      // isEmpty:()Z
  #145 = Utf8               isEmpty
  #146 = String             #147          // <tr><td>The XML file doesn\'t contain any content.</td></tr>
  #147 = Utf8               <tr><td>The XML file doesn\'t contain any content.</td></tr>
  #148 = Methodref          #137.#149     // java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
  #149 = NameAndType        #150:#151     // append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
  #150 = Utf8               append
  #151 = Utf8               (Ljava/lang/String;)Ljava/lang/StringBuilder;
  #152 = InterfaceMethodref #32.#153      // java/util/Map.entrySet:()Ljava/util/Set;
  #153 = NameAndType        #154:#155     // entrySet:()Ljava/util/Set;
  #154 = Utf8               entrySet
  #155 = Utf8               ()Ljava/util/Set;
  #156 = InterfaceMethodref #157.#65      // java/util/Set.iterator:()Ljava/util/Iterator;
  #157 = Class              #158          // java/util/Set
  #158 = Utf8               java/util/Set
  #159 = Class              #160          // java/util/Map$Entry
  #160 = Utf8               java/util/Map$Entry
  #161 = InterfaceMethodref #159.#162     // java/util/Map$Entry.getKey:()Ljava/lang/Object;
  #162 = NameAndType        #163:#78      // getKey:()Ljava/lang/Object;
  #163 = Utf8               getKey
  #164 = Methodref          #38.#165      // java/lang/Integer.intValue:()I
  #165 = NameAndType        #166:#36      // intValue:()I
  #166 = Utf8               intValue
  #167 = InterfaceMethodref #159.#168     // java/util/Map$Entry.getValue:()Ljava/lang/Object;
  #168 = NameAndType        #169:#78      // getValue:()Ljava/lang/Object;
  #169 = Utf8               getValue
  #170 = String             #171          // <table width=260><tr><td width=240>#
  #171 = Utf8               <table width=260><tr><td width=240>#
  #172 = String             #173          //  -
  #173 = Utf8                -
  #174 = String             #175          // </td><td></td></tr></table><table width=260><tr><td>Critical:
  #175 = Utf8               </td><td></td></tr></table><table width=260><tr><td>Critical:
  #176 = Methodref          #177.#178     // java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
  #177 = Class              #179          // java/lang/Boolean
  #178 = NameAndType        #41:#180      // valueOf:(Z)Ljava/lang/Boolean;
  #179 = Utf8               java/lang/Boolean
  #180 = Utf8               (Z)Ljava/lang/Boolean;
  #181 = String             #182          //  | Auto:
  #182 = Utf8                | Auto:
  #183 = String             #184          // </td><td><button value=\"Delete\" action=\"bypass -h admin_announce del
  #184 = Utf8               </td><td><button value=\"Delete\" action=\"bypass -h admin_announce del
  #185 = String             #186          // \" width=65 height=19 back=\"L2UI_ch3.smallbutton2_over\" fore=\"L2UI_ch3.smallbutton2\"></td></tr></table>
  #186 = Utf8               \" width=65 height=19 back=\"L2UI_ch3.smallbutton2_over\" fore=\"L2UI_ch3.smallbutton2\"></td></tr></table>
  #187 = Methodref          #188.#189     // ext/mods/commons/lang/StringUtil.append:(Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
  #188 = Class              #190          // ext/mods/commons/lang/StringUtil
  #189 = NameAndType        #150:#191     // append:(Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
  #190 = Utf8               ext/mods/commons/lang/StringUtil
  #191 = Utf8               (Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
  #192 = Class              #193          // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
  #193 = Utf8               ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
  #194 = Methodref          #192.#195     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
  #195 = NameAndType        #5:#196       // "<init>":(I)V
  #196 = Utf8               (I)V
  #197 = Methodref          #198.#199     // ext/mods/gameserver/data/HTMLData.getInstance:()Lext/mods/gameserver/data/HTMLData;
  #198 = Class              #200          // ext/mods/gameserver/data/HTMLData
  #199 = NameAndType        #201:#202     // getInstance:()Lext/mods/gameserver/data/HTMLData;
  #200 = Utf8               ext/mods/gameserver/data/HTMLData
  #201 = Utf8               getInstance
  #202 = Utf8               ()Lext/mods/gameserver/data/HTMLData;
  #203 = Methodref          #108.#204     // ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
  #204 = NameAndType        #205:#206     // getLocale:()Ljava/util/Locale;
  #205 = Utf8               getLocale
  #206 = Utf8               ()Ljava/util/Locale;
  #207 = String             #208          // html/admin/announce_list.htm
  #208 = Utf8               html/admin/announce_list.htm
  #209 = Methodref          #198.#210     // ext/mods/gameserver/data/HTMLData.getHtm:(Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;
  #210 = NameAndType        #211:#212     // getHtm:(Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;
  #211 = Utf8               getHtm
  #212 = Utf8               (Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;
  #213 = Methodref          #192.#214     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setHtml:(Ljava/lang/String;)V
  #214 = NameAndType        #215:#24      // setHtml:(Ljava/lang/String;)V
  #215 = Utf8               setHtml
  #216 = String             #217          // %announces%
  #217 = Utf8               %announces%
  #218 = Methodref          #137.#219     // java/lang/StringBuilder.toString:()Ljava/lang/String;
  #219 = NameAndType        #220:#112     // toString:()Ljava/lang/String;
  #220 = Utf8               toString
  #221 = Methodref          #192.#222     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
  #222 = NameAndType        #223:#224     // replace:(Ljava/lang/String;Ljava/lang/String;)V
  #223 = Utf8               replace
  #224 = Utf8               (Ljava/lang/String;Ljava/lang/String;)V
  #225 = Methodref          #124.#144     // java/lang/String.isEmpty:()Z
  #226 = Methodref          #79.#227      // ext/mods/gameserver/model/Announcement."<init>":(Ljava/lang/String;ZZIII)V
  #227 = NameAndType        #5:#228       // "<init>":(Ljava/lang/String;ZZIII)V
  #228 = Utf8               (Ljava/lang/String;ZZIII)V
  #229 = InterfaceMethodref #32.#230      // java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #230 = NameAndType        #231:#232     // put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #231 = Utf8               put
  #232 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #233 = Methodref          #79.#234      // ext/mods/gameserver/model/Announcement."<init>":(Ljava/lang/String;Z)V
  #234 = NameAndType        #5:#134       // "<init>":(Ljava/lang/String;Z)V
  #235 = Methodref          #11.#236      // ext/mods/gameserver/data/xml/AnnouncementData.regenerateXML:()V
  #236 = NameAndType        #237:#6       // regenerateXML:()V
  #237 = Utf8               regenerateXML
  #238 = InterfaceMethodref #32.#239      // java/util/Map.remove:(Ljava/lang/Object;)Ljava/lang/Object;
  #239 = NameAndType        #240:#241     // remove:(Ljava/lang/Object;)Ljava/lang/Object;
  #240 = Utf8               remove
  #241 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
  #242 = String             #243          // <?xml version=\'1.0\' encoding=\'utf-8\'?> \n<!-- \n@param String message - the message to be announced \n@param Boolean critical - type of announcement (true = critical,false = normal) \n@param Boolean auto - when the announcement will be displayed (true = auto,false = on player login) \n@param Integer initial_delay - time delay for the first announce (used only if auto=true;value in seconds) \n@param Integer delay - time delay for the announces following the first announce (used only if auto=true;value in seconds) \n@param Integer limit - limit of announces (used only if auto=true, 0 = unlimited) \n--> \n
  #243 = Utf8               <?xml version=\'1.0\' encoding=\'utf-8\'?> \n<!-- \n@param String message - the message to be announced \n@param Boolean critical - type of announcement (true = critical,false = normal) \n@param Boolean auto - when the announcement will be displayed (true = auto,false = on player login) \n@param Integer initial_delay - time delay for the first announce (used only if auto=true;value in seconds) \n@param Integer delay - time delay for the announces following the first announce (used only if auto=true;value in seconds) \n@param Integer limit - limit of announces (used only if auto=true, 0 = unlimited) \n--> \n
  #244 = String             #245          // <list> \n
  #245 = Utf8               <list> \n
  #246 = String             #247          // <announcement message=\"
  #247 = Utf8               <announcement message=\"
  #248 = String             #249          // \" critical=\"
  #249 = Utf8               \" critical=\"
  #250 = String             #251          // \" auto=\"
  #251 = Utf8               \" auto=\"
  #252 = String             #253          // \" initial_delay=\"
  #253 = Utf8               \" initial_delay=\"
  #254 = Methodref          #79.#255      // ext/mods/gameserver/model/Announcement.getInitialDelay:()I
  #255 = NameAndType        #256:#36      // getInitialDelay:()I
  #256 = Utf8               getInitialDelay
  #257 = String             #258          // \" delay=\"
  #258 = Utf8               \" delay=\"
  #259 = Methodref          #79.#260      // ext/mods/gameserver/model/Announcement.getDelay:()I
  #260 = NameAndType        #261:#36      // getDelay:()I
  #261 = Utf8               getDelay
  #262 = String             #263          // \" limit=\"
  #263 = Utf8               \" limit=\"
  #264 = Methodref          #79.#265      // ext/mods/gameserver/model/Announcement.getLimit:()I
  #265 = NameAndType        #266:#36      // getLimit:()I
  #266 = Utf8               getLimit
  #267 = String             #268          // \" /> \n
  #268 = Utf8               \" /> \n
  #269 = String             #270          // </list>
  #270 = Utf8               </list>
  #271 = Class              #272          // java/io/FileWriter
  #272 = Utf8               java/io/FileWriter
  #273 = Class              #274          // java/io/File
  #274 = Utf8               java/io/File
  #275 = String             #276          // ./data/xml/announcements.xml
  #276 = Utf8               ./data/xml/announcements.xml
  #277 = Methodref          #273.#142     // java/io/File."<init>":(Ljava/lang/String;)V
  #278 = Methodref          #271.#279     // java/io/FileWriter."<init>":(Ljava/io/File;)V
  #279 = NameAndType        #5:#280       // "<init>":(Ljava/io/File;)V
  #280 = Utf8               (Ljava/io/File;)V
  #281 = Methodref          #271.#282     // java/io/FileWriter.write:(Ljava/lang/String;)V
  #282 = NameAndType        #283:#24      // write:(Ljava/lang/String;)V
  #283 = Utf8               write
  #284 = Methodref          #271.#285     // java/io/FileWriter.close:()V
  #285 = NameAndType        #286:#6       // close:()V
  #286 = Utf8               close
  #287 = Class              #288          // java/lang/Throwable
  #288 = Utf8               java/lang/Throwable
  #289 = Methodref          #287.#290     // java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
  #290 = NameAndType        #291:#292     // addSuppressed:(Ljava/lang/Throwable;)V
  #291 = Utf8               addSuppressed
  #292 = Utf8               (Ljava/lang/Throwable;)V
  #293 = Class              #294          // java/lang/Exception
  #294 = Utf8               java/lang/Exception
  #295 = String             #296          // Error regenerating XML.
  #296 = Utf8               Error regenerating XML.
  #297 = Methodref          #44.#298      // ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
  #298 = NameAndType        #299:#300     // error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
  #299 = Utf8               error
  #300 = Utf8               (Ljava/lang/Object;Ljava/lang/Throwable;)V
  #301 = Fieldref           #302.#303     // ext/mods/gameserver/data/xml/AnnouncementData$SingletonHolder.INSTANCE:Lext/mods/gameserver/data/xml/AnnouncementData;
  #302 = Class              #304          // ext/mods/gameserver/data/xml/AnnouncementData$SingletonHolder
  #303 = NameAndType        #305:#306     // INSTANCE:Lext/mods/gameserver/data/xml/AnnouncementData;
  #304 = Utf8               ext/mods/gameserver/data/xml/AnnouncementData$SingletonHolder
  #305 = Utf8               INSTANCE
  #306 = Utf8               Lext/mods/gameserver/data/xml/AnnouncementData;
  #307 = String             #308          // announcement
  #308 = Utf8               announcement
  #309 = InvokeDynamic      #1:#52        // #1:accept:(Lext/mods/gameserver/data/xml/AnnouncementData;)Ljava/util/function/Consumer;
  #310 = InterfaceMethodref #311.#312     // org/w3c/dom/Node.getAttributes:()Lorg/w3c/dom/NamedNodeMap;
  #311 = Class              #313          // org/w3c/dom/Node
  #312 = NameAndType        #314:#315     // getAttributes:()Lorg/w3c/dom/NamedNodeMap;
  #313 = Utf8               org/w3c/dom/Node
  #314 = Utf8               getAttributes
  #315 = Utf8               ()Lorg/w3c/dom/NamedNodeMap;
  #316 = String             #317          // message
  #317 = Utf8               message
  #318 = Methodref          #11.#319      // ext/mods/gameserver/data/xml/AnnouncementData.parseString:(Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)Ljava/lang/String;
  #319 = NameAndType        #320:#321     // parseString:(Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)Ljava/lang/String;
  #320 = Utf8               parseString
  #321 = Utf8               (Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)Ljava/lang/String;
  #322 = String             #323          // The message is empty on an announcement. Ignoring it.
  #323 = Utf8               The message is empty on an announcement. Ignoring it.
  #324 = Methodref          #44.#325      // ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;)V
  #325 = NameAndType        #326:#327     // warn:(Ljava/lang/Object;)V
  #326 = Utf8               warn
  #327 = Utf8               (Ljava/lang/Object;)V
  #328 = String             #329          // critical
  #329 = Utf8               critical
  #330 = Methodref          #11.#331      // ext/mods/gameserver/data/xml/AnnouncementData.parseBoolean:(Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;Ljava/lang/Boolean;)Ljava/lang/Boolean;
  #331 = NameAndType        #332:#333     // parseBoolean:(Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;Ljava/lang/Boolean;)Ljava/lang/Boolean;
  #332 = Utf8               parseBoolean
  #333 = Utf8               (Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;Ljava/lang/Boolean;)Ljava/lang/Boolean;
  #334 = Methodref          #177.#335     // java/lang/Boolean.booleanValue:()Z
  #335 = NameAndType        #336:#74      // booleanValue:()Z
  #336 = Utf8               booleanValue
  #337 = String             #338          // auto
  #338 = Utf8               auto
  #339 = String             #340          // initial_delay
  #340 = Utf8               initial_delay
  #341 = Methodref          #11.#342      // ext/mods/gameserver/data/xml/AnnouncementData.parseInteger:(Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)Ljava/lang/Integer;
  #342 = NameAndType        #343:#344     // parseInteger:(Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)Ljava/lang/Integer;
  #343 = Utf8               parseInteger
  #344 = Utf8               (Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)Ljava/lang/Integer;
  #345 = String             #346          // delay
  #346 = Utf8               delay
  #347 = String             #348          // limit
  #348 = Utf8               limit
  #349 = Methodref          #350.#351     // java/lang/Math.max:(II)I
  #350 = Class              #352          // java/lang/Math
  #351 = NameAndType        #353:#354     // max:(II)I
  #352 = Utf8               java/lang/Math
  #353 = Utf8               max
  #354 = Utf8               (II)I
  #355 = Class              #356          // ext/mods/commons/data/xml/IXmlReader
  #356 = Utf8               ext/mods/commons/data/xml/IXmlReader
  #357 = Utf8               HEADER
  #358 = Utf8               Ljava/lang/String;
  #359 = Utf8               ConstantValue
  #360 = Utf8               Signature
  #361 = Utf8               Ljava/util/Map<Ljava/lang/Integer;Lext/mods/gameserver/model/Announcement;>;
  #362 = Utf8               Code
  #363 = Utf8               LineNumberTable
  #364 = Utf8               LocalVariableTable
  #365 = Utf8               this
  #366 = Utf8               parseDocument
  #367 = Utf8               (Lorg/w3c/dom/Document;Ljava/nio/file/Path;)V
  #368 = Utf8               doc
  #369 = Utf8               Lorg/w3c/dom/Document;
  #370 = Utf8               path
  #371 = Utf8               Ljava/nio/file/Path;
  #372 = Utf8               reload
  #373 = Utf8               announce
  #374 = Utf8               Lext/mods/gameserver/model/Announcement;
  #375 = Utf8               StackMapTable
  #376 = Utf8               showAnnouncements
  #377 = Utf8               (Lext/mods/gameserver/model/actor/Player;Z)V
  #378 = Utf8               player
  #379 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #380 = Utf8               autoOrNot
  #381 = Utf8               Z
  #382 = Utf8               handleAnnounce
  #383 = Utf8               (Ljava/lang/String;IZ)V
  #384 = Utf8               command
  #385 = Utf8               lengthToTrim
  #386 = Utf8               I
  #387 = Utf8               listAnnouncements
  #388 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
  #389 = Utf8               index
  #390 = Utf8               entry
  #391 = Utf8               Ljava/util/Map$Entry;
  #392 = Utf8               sb
  #393 = Utf8               Ljava/lang/StringBuilder;
  #394 = Utf8               html
  #395 = Utf8               Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
  #396 = Utf8               LocalVariableTypeTable
  #397 = Utf8               Ljava/util/Map$Entry<Ljava/lang/Integer;Lext/mods/gameserver/model/Announcement;>;
  #398 = Utf8               addAnnouncement
  #399 = Utf8               (Ljava/lang/String;ZZIII)Z
  #400 = Utf8               initialDelay
  #401 = Utf8               delAnnouncement
  #402 = Utf8               fw
  #403 = Utf8               Ljava/io/FileWriter;
  #404 = Utf8               e
  #405 = Utf8               Ljava/lang/Exception;
  #406 = Utf8               ()Lext/mods/gameserver/data/xml/AnnouncementData;
  #407 = Utf8               lambda$parseDocument$0
  #408 = Utf8               (Lorg/w3c/dom/Node;)V
  #409 = Utf8               listNode
  #410 = Utf8               Lorg/w3c/dom/Node;
  #411 = Utf8               lambda$parseDocument$1
  #412 = Utf8               announcementNode
  #413 = Utf8               attrs
  #414 = Utf8               Lorg/w3c/dom/NamedNodeMap;
  #415 = Class              #416          // org/w3c/dom/NamedNodeMap
  #416 = Utf8               org/w3c/dom/NamedNodeMap
  #417 = Utf8               SourceFile
  #418 = Utf8               AnnouncementData.java
  #419 = Utf8               NestMembers
  #420 = Utf8               BootstrapMethods
  #421 = MethodType         #327          //  (Ljava/lang/Object;)V
  #422 = MethodHandle       5:#423        // REF_invokeVirtual ext/mods/gameserver/data/xml/AnnouncementData.lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
  #423 = Methodref          #11.#424      // ext/mods/gameserver/data/xml/AnnouncementData.lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
  #424 = NameAndType        #407:#408     // lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
  #425 = MethodType         #408          //  (Lorg/w3c/dom/Node;)V
  #426 = MethodHandle       5:#427        // REF_invokeVirtual ext/mods/gameserver/data/xml/AnnouncementData.lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
  #427 = Methodref          #11.#428      // ext/mods/gameserver/data/xml/AnnouncementData.lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
  #428 = NameAndType        #411:#408     // lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
  #429 = MethodHandle       6:#430        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #430 = Methodref          #431.#432     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #431 = Class              #433          // java/lang/invoke/LambdaMetafactory
  #432 = NameAndType        #434:#435     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #433 = Utf8               java/lang/invoke/LambdaMetafactory
  #434 = Utf8               metafactory
  #435 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #436 = Utf8               InnerClasses
  #437 = Utf8               Entry
  #438 = Utf8               SingletonHolder
  #439 = Class              #440          // java/lang/invoke/MethodHandles$Lookup
  #440 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #441 = Class              #442          // java/lang/invoke/MethodHandles
  #442 = Utf8               java/lang/invoke/MethodHandles
  #443 = Utf8               Lookup
{
  protected ext.mods.gameserver.data.xml.AnnouncementData();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=3, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: new           #7                  // class java/util/concurrent/ConcurrentHashMap
         8: dup
         9: invokespecial #9                  // Method java/util/concurrent/ConcurrentHashMap."<init>":()V
        12: putfield      #10                 // Field _announcements:Ljava/util/Map;
        15: aload_0
        16: invokevirtual #16                 // Method load:()V
        19: return
      LineNumberTable:
        line 51: 0
        line 48: 4
        line 52: 15
        line 53: 19
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      20     0  this   Lext/mods/gameserver/data/xml/AnnouncementData;

  public void load();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=1, args_size=1
         0: aload_0
         1: ldc           #19                 // String xml/announcements.xml
         3: invokevirtual #21                 // Method parseDataFile:(Ljava/lang/String;)V
         6: getstatic     #25                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
         9: ldc           #29                 // String Loaded {} announcements.
        11: iconst_1
        12: anewarray     #2                  // class java/lang/Object
        15: dup
        16: iconst_0
        17: aload_0
        18: getfield      #10                 // Field _announcements:Ljava/util/Map;
        21: invokeinterface #31,  1           // InterfaceMethod java/util/Map.size:()I
        26: invokestatic  #37                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        29: aastore
        30: invokevirtual #43                 // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
        33: return
      LineNumberTable:
        line 58: 0
        line 59: 6
        line 60: 33
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      34     0  this   Lext/mods/gameserver/data/xml/AnnouncementData;

  public void parseDocument(org.w3c.dom.Document, java.nio.file.Path);
    descriptor: (Lorg/w3c/dom/Document;Ljava/nio/file/Path;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: ldc           #49                 // String list
         4: aload_0
         5: invokedynamic #51,  0             // InvokeDynamic #0:accept:(Lext/mods/gameserver/data/xml/AnnouncementData;)Ljava/util/function/Consumer;
        10: invokevirtual #55                 // Method forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
        13: return
      LineNumberTable:
        line 65: 0
        line 87: 13
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0  this   Lext/mods/gameserver/data/xml/AnnouncementData;
            0      14     1   doc   Lorg/w3c/dom/Document;
            0      14     2  path   Ljava/nio/file/Path;

  public void reload();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=3, args_size=1
         0: aload_0
         1: getfield      #10                 // Field _announcements:Ljava/util/Map;
         4: invokeinterface #59,  1           // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
         9: invokeinterface #63,  1           // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
        14: astore_1
        15: aload_1
        16: invokeinterface #69,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        21: ifeq          41
        24: aload_1
        25: invokeinterface #75,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        30: checkcast     #79                 // class ext/mods/gameserver/model/Announcement
        33: astore_2
        34: aload_2
        35: invokevirtual #81                 // Method ext/mods/gameserver/model/Announcement.stopTask:()V
        38: goto          15
        41: aload_0
        42: getfield      #10                 // Field _announcements:Ljava/util/Map;
        45: invokeinterface #84,  1           // InterfaceMethod java/util/Map.clear:()V
        50: aload_0
        51: invokevirtual #16                 // Method load:()V
        54: return
      LineNumberTable:
        line 91: 0
        line 92: 34
        line 94: 41
        line 96: 50
        line 97: 54
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           34       4     2 announce   Lext/mods/gameserver/model/Announcement;
            0      55     0  this   Lext/mods/gameserver/data/xml/AnnouncementData;
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 15
          locals = [ class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 25

  public void showAnnouncements(ext.mods.gameserver.model.actor.Player, boolean);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Z)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=5, args_size=3
         0: aload_0
         1: getfield      #10                 // Field _announcements:Ljava/util/Map;
         4: invokeinterface #59,  1           // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
         9: invokeinterface #63,  1           // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
        14: astore_3
        15: aload_3
        16: invokeinterface #69,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        21: ifeq          98
        24: aload_3
        25: invokeinterface #75,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        30: checkcast     #79                 // class ext/mods/gameserver/model/Announcement
        33: astore        4
        35: iload_2
        36: ifeq          47
        39: aload         4
        41: invokevirtual #87                 // Method ext/mods/gameserver/model/Announcement.reloadTask:()V
        44: goto          95
        47: aload         4
        49: invokevirtual #90                 // Method ext/mods/gameserver/model/Announcement.isAuto:()Z
        52: ifeq          58
        55: goto          15
        58: aload_1
        59: new           #93                 // class ext/mods/gameserver/network/serverpackets/CreatureSay
        62: dup
        63: aload         4
        65: invokevirtual #95                 // Method ext/mods/gameserver/model/Announcement.isCritical:()Z
        68: ifeq          77
        71: getstatic     #98                 // Field ext/mods/gameserver/enums/SayType.CRITICAL_ANNOUNCE:Lext/mods/gameserver/enums/SayType;
        74: goto          80
        77: getstatic     #104                // Field ext/mods/gameserver/enums/SayType.ANNOUNCEMENT:Lext/mods/gameserver/enums/SayType;
        80: aload_1
        81: invokevirtual #107                // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
        84: aload         4
        86: invokevirtual #113                // Method ext/mods/gameserver/model/Announcement.getMessage:()Ljava/lang/String;
        89: invokespecial #116                // Method ext/mods/gameserver/network/serverpackets/CreatureSay."<init>":(Lext/mods/gameserver/enums/SayType;Ljava/lang/String;Ljava/lang/String;)V
        92: invokevirtual #119                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        95: goto          15
        98: return
      LineNumberTable:
        line 106: 0
        line 108: 35
        line 109: 39
        line 112: 47
        line 113: 55
        line 115: 58
        line 117: 95
        line 118: 98
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           35      60     4 announce   Lext/mods/gameserver/model/Announcement;
            0      99     0  this   Lext/mods/gameserver/data/xml/AnnouncementData;
            0      99     1 player   Lext/mods/gameserver/model/actor/Player;
            0      99     2 autoOrNot   Z
      StackMapTable: number_of_entries = 7
        frame_type = 252 /* append */
          offset_delta = 15
          locals = [ class java/util/Iterator ]
        frame_type = 252 /* append */
          offset_delta = 31
          locals = [ class ext/mods/gameserver/model/Announcement ]
        frame_type = 10 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 18
          locals = [ class ext/mods/gameserver/data/xml/AnnouncementData, class ext/mods/gameserver/model/actor/Player, int, class java/util/Iterator, class ext/mods/gameserver/model/Announcement ]
          stack = [ class ext/mods/gameserver/model/actor/Player, uninitialized 59, uninitialized 59 ]
        frame_type = 255 /* full_frame */
          offset_delta = 2
          locals = [ class ext/mods/gameserver/data/xml/AnnouncementData, class ext/mods/gameserver/model/actor/Player, int, class java/util/Iterator, class ext/mods/gameserver/model/Announcement ]
          stack = [ class ext/mods/gameserver/model/actor/Player, uninitialized 59, uninitialized 59, class ext/mods/gameserver/enums/SayType ]
        frame_type = 250 /* chop */
          offset_delta = 14
        frame_type = 250 /* chop */
          offset_delta = 2

  public void handleAnnounce(java.lang.String, int, boolean);
    descriptor: (Ljava/lang/String;IZ)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=5, args_size=4
         0: aload_1
         1: iload_2
         2: invokevirtual #123                // Method java/lang/String.substring:(I)Ljava/lang/String;
         5: iload_3
         6: invokestatic  #129                // Method ext/mods/gameserver/model/World.announceToOnlinePlayers:(Ljava/lang/String;Z)V
         9: goto          14
        12: astore        4
        14: return
      Exception table:
         from    to  target type
             0     9    12   Class java/lang/StringIndexOutOfBoundsException
      LineNumberTable:
        line 130: 0
        line 134: 9
        line 132: 12
        line 135: 14
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      15     0  this   Lext/mods/gameserver/data/xml/AnnouncementData;
            0      15     1 command   Ljava/lang/String;
            0      15     2 lengthToTrim   I
            0      15     3 critical   Z
      StackMapTable: number_of_entries = 2
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/StringIndexOutOfBoundsException ]
        frame_type = 1 /* same */

  public void listAnnouncements(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=7, args_size=2
         0: new           #137                // class java/lang/StringBuilder
         3: dup
         4: ldc           #139                // String <br>
         6: invokespecial #141                // Method java/lang/StringBuilder."<init>":(Ljava/lang/String;)V
         9: astore_2
        10: aload_0
        11: getfield      #10                 // Field _announcements:Ljava/util/Map;
        14: invokeinterface #143,  1          // InterfaceMethod java/util/Map.isEmpty:()Z
        19: ifeq          32
        22: aload_2
        23: ldc           #146                // String <tr><td>The XML file doesn\'t contain any content.</td></tr>
        25: invokevirtual #148                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        28: pop
        29: goto          187
        32: aload_0
        33: getfield      #10                 // Field _announcements:Ljava/util/Map;
        36: invokeinterface #152,  1          // InterfaceMethod java/util/Map.entrySet:()Ljava/util/Set;
        41: invokeinterface #156,  1          // InterfaceMethod java/util/Set.iterator:()Ljava/util/Iterator;
        46: astore_3
        47: aload_3
        48: invokeinterface #69,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        53: ifeq          187
        56: aload_3
        57: invokeinterface #75,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        62: checkcast     #159                // class java/util/Map$Entry
        65: astore        4
        67: aload         4
        69: invokeinterface #161,  1          // InterfaceMethod java/util/Map$Entry.getKey:()Ljava/lang/Object;
        74: checkcast     #38                 // class java/lang/Integer
        77: invokevirtual #164                // Method java/lang/Integer.intValue:()I
        80: istore        5
        82: aload         4
        84: invokeinterface #167,  1          // InterfaceMethod java/util/Map$Entry.getValue:()Ljava/lang/Object;
        89: checkcast     #79                 // class ext/mods/gameserver/model/Announcement
        92: astore        6
        94: aload_2
        95: bipush        11
        97: anewarray     #2                  // class java/lang/Object
       100: dup
       101: iconst_0
       102: ldc           #170                // String <table width=260><tr><td width=240>#
       104: aastore
       105: dup
       106: iconst_1
       107: iload         5
       109: invokestatic  #37                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       112: aastore
       113: dup
       114: iconst_2
       115: ldc           #172                // String  -
       117: aastore
       118: dup
       119: iconst_3
       120: aload         6
       122: invokevirtual #113                // Method ext/mods/gameserver/model/Announcement.getMessage:()Ljava/lang/String;
       125: aastore
       126: dup
       127: iconst_4
       128: ldc           #174                // String </td><td></td></tr></table><table width=260><tr><td>Critical:
       130: aastore
       131: dup
       132: iconst_5
       133: aload         6
       135: invokevirtual #95                 // Method ext/mods/gameserver/model/Announcement.isCritical:()Z
       138: invokestatic  #176                // Method java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
       141: aastore
       142: dup
       143: bipush        6
       145: ldc           #181                // String  | Auto:
       147: aastore
       148: dup
       149: bipush        7
       151: aload         6
       153: invokevirtual #90                 // Method ext/mods/gameserver/model/Announcement.isAuto:()Z
       156: invokestatic  #176                // Method java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
       159: aastore
       160: dup
       161: bipush        8
       163: ldc           #183                // String </td><td><button value=\"Delete\" action=\"bypass -h admin_announce del
       165: aastore
       166: dup
       167: bipush        9
       169: iload         5
       171: invokestatic  #37                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       174: aastore
       175: dup
       176: bipush        10
       178: ldc           #185                // String \" width=65 height=19 back=\"L2UI_ch3.smallbutton2_over\" fore=\"L2UI_ch3.smallbutton2\"></td></tr></table>
       180: aastore
       181: invokestatic  #187                // Method ext/mods/commons/lang/StringUtil.append:(Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
       184: goto          47
       187: new           #192                // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
       190: dup
       191: iconst_0
       192: invokespecial #194                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
       195: astore_3
       196: aload_3
       197: invokestatic  #197                // Method ext/mods/gameserver/data/HTMLData.getInstance:()Lext/mods/gameserver/data/HTMLData;
       200: aload_1
       201: invokevirtual #203                // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
       204: ldc           #207                // String html/admin/announce_list.htm
       206: invokevirtual #209                // Method ext/mods/gameserver/data/HTMLData.getHtm:(Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;
       209: invokevirtual #213                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setHtml:(Ljava/lang/String;)V
       212: aload_3
       213: ldc           #216                // String %announces%
       215: aload_2
       216: invokevirtual #218                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
       219: invokevirtual #221                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       222: aload_1
       223: aload_3
       224: invokevirtual #119                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       227: return
      LineNumberTable:
        line 143: 0
        line 144: 10
        line 145: 22
        line 148: 32
        line 150: 67
        line 151: 82
        line 153: 94
        line 154: 184
        line 157: 187
        line 158: 196
        line 159: 212
        line 160: 222
        line 161: 227
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           82     102     5 index   I
           94      90     6 announce   Lext/mods/gameserver/model/Announcement;
           67     117     4 entry   Ljava/util/Map$Entry;
            0     228     0  this   Lext/mods/gameserver/data/xml/AnnouncementData;
            0     228     1 player   Lext/mods/gameserver/model/actor/Player;
           10     218     2    sb   Ljava/lang/StringBuilder;
          196      32     3  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
           67     117     4 entry   Ljava/util/Map$Entry<Ljava/lang/Integer;Lext/mods/gameserver/model/Announcement;>;
      StackMapTable: number_of_entries = 3
        frame_type = 252 /* append */
          offset_delta = 32
          locals = [ class java/lang/StringBuilder ]
        frame_type = 252 /* append */
          offset_delta = 14
          locals = [ class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 139

  public boolean addAnnouncement(java.lang.String, boolean, boolean, int, int, int);
    descriptor: (Ljava/lang/String;ZZIII)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=10, locals=7, args_size=7
         0: aload_1
         1: ifnull        11
         4: aload_1
         5: invokevirtual #225                // Method java/lang/String.isEmpty:()Z
         8: ifeq          13
        11: iconst_0
        12: ireturn
        13: iload_3
        14: ifeq          58
        17: aload_0
        18: getfield      #10                 // Field _announcements:Ljava/util/Map;
        21: aload_0
        22: getfield      #10                 // Field _announcements:Ljava/util/Map;
        25: invokeinterface #31,  1           // InterfaceMethod java/util/Map.size:()I
        30: invokestatic  #37                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        33: new           #79                 // class ext/mods/gameserver/model/Announcement
        36: dup
        37: aload_1
        38: iload_2
        39: iload_3
        40: iload         4
        42: iload         5
        44: iload         6
        46: invokespecial #226                // Method ext/mods/gameserver/model/Announcement."<init>":(Ljava/lang/String;ZZIII)V
        49: invokeinterface #229,  3          // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        54: pop
        55: goto          89
        58: aload_0
        59: getfield      #10                 // Field _announcements:Ljava/util/Map;
        62: aload_0
        63: getfield      #10                 // Field _announcements:Ljava/util/Map;
        66: invokeinterface #31,  1           // InterfaceMethod java/util/Map.size:()I
        71: invokestatic  #37                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        74: new           #79                 // class ext/mods/gameserver/model/Announcement
        77: dup
        78: aload_1
        79: iload_2
        80: invokespecial #233                // Method ext/mods/gameserver/model/Announcement."<init>":(Ljava/lang/String;Z)V
        83: invokeinterface #229,  3          // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        88: pop
        89: aload_0
        90: invokevirtual #235                // Method regenerateXML:()V
        93: iconst_1
        94: ireturn
      LineNumberTable:
        line 175: 0
        line 176: 11
        line 178: 13
        line 179: 17
        line 181: 58
        line 183: 89
        line 184: 93
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      95     0  this   Lext/mods/gameserver/data/xml/AnnouncementData;
            0      95     1 message   Ljava/lang/String;
            0      95     2 critical   Z
            0      95     3  auto   Z
            0      95     4 initialDelay   I
            0      95     5 delay   I
            0      95     6 limit   I
      StackMapTable: number_of_entries = 4
        frame_type = 11 /* same */
        frame_type = 1 /* same */
        frame_type = 44 /* same */
        frame_type = 30 /* same */

  public void delAnnouncement(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #10                 // Field _announcements:Ljava/util/Map;
         4: iload_1
         5: invokestatic  #37                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
         8: invokeinterface #238,  2          // InterfaceMethod java/util/Map.remove:(Ljava/lang/Object;)Ljava/lang/Object;
        13: checkcast     #79                 // class ext/mods/gameserver/model/Announcement
        16: invokevirtual #81                 // Method ext/mods/gameserver/model/Announcement.stopTask:()V
        19: aload_0
        20: invokevirtual #235                // Method regenerateXML:()V
        23: return
      LineNumberTable:
        line 193: 0
        line 195: 19
        line 196: 23
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      24     0  this   Lext/mods/gameserver/data/xml/AnnouncementData;
            0      24     1 index   I

  public static ext.mods.gameserver.data.xml.AnnouncementData getInstance();
    descriptor: ()Lext/mods/gameserver/data/xml/AnnouncementData;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #301                // Field ext/mods/gameserver/data/xml/AnnouncementData$SingletonHolder.INSTANCE:Lext/mods/gameserver/data/xml/AnnouncementData;
         3: areturn
      LineNumberTable:
        line 224: 0
}
SourceFile: "AnnouncementData.java"
NestMembers:
  ext/mods/gameserver/data/xml/AnnouncementData$SingletonHolder
BootstrapMethods:
  0: #429 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #421 (Ljava/lang/Object;)V
      #422 REF_invokeVirtual ext/mods/gameserver/data/xml/AnnouncementData.lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
      #425 (Lorg/w3c/dom/Node;)V
  1: #429 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #421 (Ljava/lang/Object;)V
      #426 REF_invokeVirtual ext/mods/gameserver/data/xml/AnnouncementData.lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
      #425 (Lorg/w3c/dom/Node;)V
InnerClasses:
  public static #437= #159 of #32;        // Entry=class java/util/Map$Entry of class java/util/Map
  public static final #443= #439 of #441; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
