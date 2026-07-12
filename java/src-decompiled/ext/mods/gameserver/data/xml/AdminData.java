// Bytecode for: ext.mods.gameserver.data.xml.AdminData
// File: ext\mods\gameserver\data\xml\AdminData.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/data/xml/AdminData.class
  Last modified 9 de jul de 2026; size 10288 bytes
  MD5 checksum 1441e270d5250e3e7607fd49e9cd2a59
  Compiled from "AdminData.java"
public final class ext.mods.gameserver.data.xml.AdminData implements ext.mods.commons.data.xml.IXmlReader
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #11                         // ext/mods/gameserver/data/xml/AdminData
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 3, methods: 25, attributes: 4
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Class              #8            // java/util/TreeMap
    #8 = Utf8               java/util/TreeMap
    #9 = Methodref          #7.#3         // java/util/TreeMap."<init>":()V
   #10 = Fieldref           #11.#12       // ext/mods/gameserver/data/xml/AdminData._accessLevels:Ljava/util/TreeMap;
   #11 = Class              #13           // ext/mods/gameserver/data/xml/AdminData
   #12 = NameAndType        #14:#15       // _accessLevels:Ljava/util/TreeMap;
   #13 = Utf8               ext/mods/gameserver/data/xml/AdminData
   #14 = Utf8               _accessLevels
   #15 = Utf8               Ljava/util/TreeMap;
   #16 = Class              #17           // java/util/ArrayList
   #17 = Utf8               java/util/ArrayList
   #18 = Methodref          #16.#3        // java/util/ArrayList."<init>":()V
   #19 = Fieldref           #11.#20       // ext/mods/gameserver/data/xml/AdminData._adminCommands:Ljava/util/List;
   #20 = NameAndType        #21:#22       // _adminCommands:Ljava/util/List;
   #21 = Utf8               _adminCommands
   #22 = Utf8               Ljava/util/List;
   #23 = Class              #24           // java/util/concurrent/ConcurrentHashMap
   #24 = Utf8               java/util/concurrent/ConcurrentHashMap
   #25 = Methodref          #23.#3        // java/util/concurrent/ConcurrentHashMap."<init>":()V
   #26 = Fieldref           #11.#27       // ext/mods/gameserver/data/xml/AdminData._gmList:Ljava/util/Map;
   #27 = NameAndType        #28:#29       // _gmList:Ljava/util/Map;
   #28 = Utf8               _gmList
   #29 = Utf8               Ljava/util/Map;
   #30 = Methodref          #11.#31       // ext/mods/gameserver/data/xml/AdminData.load:()V
   #31 = NameAndType        #32:#6        // load:()V
   #32 = Utf8               load
   #33 = String             #34           // xml/accessLevels.xml
   #34 = Utf8               xml/accessLevels.xml
   #35 = Methodref          #11.#36       // ext/mods/gameserver/data/xml/AdminData.parseDataFile:(Ljava/lang/String;)V
   #36 = NameAndType        #37:#38       // parseDataFile:(Ljava/lang/String;)V
   #37 = Utf8               parseDataFile
   #38 = Utf8               (Ljava/lang/String;)V
   #39 = Fieldref           #11.#40       // ext/mods/gameserver/data/xml/AdminData.LOGGER:Lext/mods/commons/logging/CLogger;
   #40 = NameAndType        #41:#42       // LOGGER:Lext/mods/commons/logging/CLogger;
   #41 = Utf8               LOGGER
   #42 = Utf8               Lext/mods/commons/logging/CLogger;
   #43 = String             #44           // Loaded {} access levels.
   #44 = Utf8               Loaded {} access levels.
   #45 = Methodref          #7.#46        // java/util/TreeMap.size:()I
   #46 = NameAndType        #47:#48       // size:()I
   #47 = Utf8               size
   #48 = Utf8               ()I
   #49 = Methodref          #50.#51       // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
   #50 = Class              #52           // java/lang/Integer
   #51 = NameAndType        #53:#54       // valueOf:(I)Ljava/lang/Integer;
   #52 = Utf8               java/lang/Integer
   #53 = Utf8               valueOf
   #54 = Utf8               (I)Ljava/lang/Integer;
   #55 = Methodref          #56.#57       // ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
   #56 = Class              #58           // ext/mods/commons/logging/CLogger
   #57 = NameAndType        #59:#60       // info:(Ljava/lang/Object;[Ljava/lang/Object;)V
   #58 = Utf8               ext/mods/commons/logging/CLogger
   #59 = Utf8               info
   #60 = Utf8               (Ljava/lang/Object;[Ljava/lang/Object;)V
   #61 = String             #62           // xml/adminCommands.xml
   #62 = Utf8               xml/adminCommands.xml
   #63 = String             #64           // Loaded {} admin command rights.
   #64 = Utf8               Loaded {} admin command rights.
   #65 = InterfaceMethodref #66.#46       // java/util/List.size:()I
   #66 = Class              #67           // java/util/List
   #67 = Utf8               java/util/List
   #68 = String             #69           // list
   #69 = Utf8               list
   #70 = InvokeDynamic      #0:#71        // #0:accept:(Lext/mods/gameserver/data/xml/AdminData;)Ljava/util/function/Consumer;
   #71 = NameAndType        #72:#73       // accept:(Lext/mods/gameserver/data/xml/AdminData;)Ljava/util/function/Consumer;
   #72 = Utf8               accept
   #73 = Utf8               (Lext/mods/gameserver/data/xml/AdminData;)Ljava/util/function/Consumer;
   #74 = Methodref          #11.#75       // ext/mods/gameserver/data/xml/AdminData.forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
   #75 = NameAndType        #76:#77       // forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
   #76 = Utf8               forEach
   #77 = Utf8               (Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
   #78 = Methodref          #7.#79        // java/util/TreeMap.clear:()V
   #79 = NameAndType        #80:#6        // clear:()V
   #80 = Utf8               clear
   #81 = InterfaceMethodref #66.#79       // java/util/List.clear:()V
   #82 = Methodref          #7.#83        // java/util/TreeMap.get:(Ljava/lang/Object;)Ljava/lang/Object;
   #83 = NameAndType        #84:#85       // get:(Ljava/lang/Object;)Ljava/lang/Object;
   #84 = Utf8               get
   #85 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
   #86 = Class              #87           // ext/mods/gameserver/model/AccessLevel
   #87 = Utf8               ext/mods/gameserver/model/AccessLevel
   #88 = Methodref          #7.#89        // java/util/TreeMap.isEmpty:()Z
   #89 = NameAndType        #90:#91       // isEmpty:()Z
   #90 = Utf8               isEmpty
   #91 = Utf8               ()Z
   #92 = Methodref          #7.#93        // java/util/TreeMap.lastKey:()Ljava/lang/Object;
   #93 = NameAndType        #94:#95       // lastKey:()Ljava/lang/Object;
   #94 = Utf8               lastKey
   #95 = Utf8               ()Ljava/lang/Object;
   #96 = Methodref          #50.#97       // java/lang/Integer.intValue:()I
   #97 = NameAndType        #98:#48       // intValue:()I
   #98 = Utf8               intValue
   #99 = Methodref          #7.#100       // java/util/TreeMap.containsKey:(Ljava/lang/Object;)Z
  #100 = NameAndType        #101:#102     // containsKey:(Ljava/lang/Object;)Z
  #101 = Utf8               containsKey
  #102 = Utf8               (Ljava/lang/Object;)Z
  #103 = InterfaceMethodref #66.#104      // java/util/List.stream:()Ljava/util/stream/Stream;
  #104 = NameAndType        #105:#106     // stream:()Ljava/util/stream/Stream;
  #105 = Utf8               stream
  #106 = Utf8               ()Ljava/util/stream/Stream;
  #107 = InvokeDynamic      #1:#108       // #1:test:(Ljava/lang/String;)Ljava/util/function/Predicate;
  #108 = NameAndType        #109:#110     // test:(Ljava/lang/String;)Ljava/util/function/Predicate;
  #109 = Utf8               test
  #110 = Utf8               (Ljava/lang/String;)Ljava/util/function/Predicate;
  #111 = InterfaceMethodref #112.#113     // java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
  #112 = Class              #114          // java/util/stream/Stream
  #113 = NameAndType        #115:#116     // filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
  #114 = Utf8               java/util/stream/Stream
  #115 = Utf8               filter
  #116 = Utf8               (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
  #117 = InterfaceMethodref #112.#118     // java/util/stream/Stream.findFirst:()Ljava/util/Optional;
  #118 = NameAndType        #119:#120     // findFirst:()Ljava/util/Optional;
  #119 = Utf8               findFirst
  #120 = Utf8               ()Ljava/util/Optional;
  #121 = Methodref          #122.#123     // java/util/Optional.orElse:(Ljava/lang/Object;)Ljava/lang/Object;
  #122 = Class              #124          // java/util/Optional
  #123 = NameAndType        #125:#85      // orElse:(Ljava/lang/Object;)Ljava/lang/Object;
  #124 = Utf8               java/util/Optional
  #125 = Utf8               orElse
  #126 = Class              #127          // ext/mods/gameserver/model/records/AdminCommand
  #127 = Utf8               ext/mods/gameserver/model/records/AdminCommand
  #128 = String             #129          // No rights defined for admin command \'{}\'.
  #129 = Utf8               No rights defined for admin command \'{}\'.
  #130 = Methodref          #56.#131      // ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;[Ljava/lang/Object;)V
  #131 = NameAndType        #132:#60      // warn:(Ljava/lang/Object;[Ljava/lang/Object;)V
  #132 = Utf8               warn
  #133 = Methodref          #126.#134     // ext/mods/gameserver/model/records/AdminCommand.accessLevel:()I
  #134 = NameAndType        #135:#48      // accessLevel:()I
  #135 = Utf8               accessLevel
  #136 = Methodref          #11.#137      // ext/mods/gameserver/data/xml/AdminData.getAccessLevel:(I)Lext/mods/gameserver/model/AccessLevel;
  #137 = NameAndType        #138:#139     // getAccessLevel:(I)Lext/mods/gameserver/model/AccessLevel;
  #138 = Utf8               getAccessLevel
  #139 = Utf8               (I)Lext/mods/gameserver/model/AccessLevel;
  #140 = Methodref          #86.#141      // ext/mods/gameserver/model/AccessLevel.getLevel:()I
  #141 = NameAndType        #142:#48      // getLevel:()I
  #142 = Utf8               getLevel
  #143 = Methodref          #86.#144      // ext/mods/gameserver/model/AccessLevel.hasChildAccess:(Lext/mods/gameserver/model/AccessLevel;)Z
  #144 = NameAndType        #145:#146     // hasChildAccess:(Lext/mods/gameserver/model/AccessLevel;)Z
  #145 = Utf8               hasChildAccess
  #146 = Utf8               (Lext/mods/gameserver/model/AccessLevel;)Z
  #147 = InterfaceMethodref #148.#149     // java/util/Map.entrySet:()Ljava/util/Set;
  #148 = Class              #150          // java/util/Map
  #149 = NameAndType        #151:#152     // entrySet:()Ljava/util/Set;
  #150 = Utf8               java/util/Map
  #151 = Utf8               entrySet
  #152 = Utf8               ()Ljava/util/Set;
  #153 = InterfaceMethodref #154.#155     // java/util/Set.iterator:()Ljava/util/Iterator;
  #154 = Class              #156          // java/util/Set
  #155 = NameAndType        #157:#158     // iterator:()Ljava/util/Iterator;
  #156 = Utf8               java/util/Set
  #157 = Utf8               iterator
  #158 = Utf8               ()Ljava/util/Iterator;
  #159 = InterfaceMethodref #160.#161     // java/util/Iterator.hasNext:()Z
  #160 = Class              #162          // java/util/Iterator
  #161 = NameAndType        #163:#91      // hasNext:()Z
  #162 = Utf8               java/util/Iterator
  #163 = Utf8               hasNext
  #164 = InterfaceMethodref #160.#165     // java/util/Iterator.next:()Ljava/lang/Object;
  #165 = NameAndType        #166:#95      // next:()Ljava/lang/Object;
  #166 = Utf8               next
  #167 = Class              #168          // java/util/Map$Entry
  #168 = Utf8               java/util/Map$Entry
  #169 = InterfaceMethodref #167.#170     // java/util/Map$Entry.getValue:()Ljava/lang/Object;
  #170 = NameAndType        #171:#95      // getValue:()Ljava/lang/Object;
  #171 = Utf8               getValue
  #172 = Fieldref           #173.#174     // java/lang/Boolean.FALSE:Ljava/lang/Boolean;
  #173 = Class              #175          // java/lang/Boolean
  #174 = NameAndType        #176:#177     // FALSE:Ljava/lang/Boolean;
  #175 = Utf8               java/lang/Boolean
  #176 = Utf8               FALSE
  #177 = Utf8               Ljava/lang/Boolean;
  #178 = InterfaceMethodref #167.#179     // java/util/Map$Entry.getKey:()Ljava/lang/Object;
  #179 = NameAndType        #180:#95      // getKey:()Ljava/lang/Object;
  #180 = Utf8               getKey
  #181 = Class              #182          // ext/mods/gameserver/model/actor/Player
  #182 = Utf8               ext/mods/gameserver/model/actor/Player
  #183 = InterfaceMethodref #66.#184      // java/util/List.add:(Ljava/lang/Object;)Z
  #184 = NameAndType        #185:#102     // add:(Ljava/lang/Object;)Z
  #185 = Utf8               add
  #186 = Methodref          #181.#187     // ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
  #187 = NameAndType        #188:#189     // getName:()Ljava/lang/String;
  #188 = Utf8               getName
  #189 = Utf8               ()Ljava/lang/String;
  #190 = InvokeDynamic      #2:#191       // #2:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #191 = NameAndType        #192:#193     // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #192 = Utf8               makeConcatWithConstants
  #193 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
  #194 = Methodref          #173.#195     // java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
  #195 = NameAndType        #53:#196      // valueOf:(Z)Ljava/lang/Boolean;
  #196 = Utf8               (Z)Ljava/lang/Boolean;
  #197 = InterfaceMethodref #148.#198     // java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #198 = NameAndType        #199:#200     // put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #199 = Utf8               put
  #200 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #201 = InterfaceMethodref #148.#202     // java/util/Map.remove:(Ljava/lang/Object;)Ljava/lang/Object;
  #202 = NameAndType        #203:#85      // remove:(Ljava/lang/Object;)Ljava/lang/Object;
  #203 = Utf8               remove
  #204 = InvokeDynamic      #3:#205       // #3:apply:()Ljava/util/function/BiFunction;
  #205 = NameAndType        #206:#207     // apply:()Ljava/util/function/BiFunction;
  #206 = Utf8               apply
  #207 = Utf8               ()Ljava/util/function/BiFunction;
  #208 = InterfaceMethodref #148.#209     // java/util/Map.computeIfPresent:(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;
  #209 = NameAndType        #210:#211     // computeIfPresent:(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;
  #210 = Utf8               computeIfPresent
  #211 = Utf8               (Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;
  #212 = Methodref          #173.#213     // java/lang/Boolean.booleanValue:()Z
  #213 = NameAndType        #214:#91      // booleanValue:()Z
  #214 = Utf8               booleanValue
  #215 = InterfaceMethodref #148.#100     // java/util/Map.containsKey:(Ljava/lang/Object;)Z
  #216 = Methodref          #181.#217     // ext/mods/gameserver/model/actor/Player.isGM:()Z
  #217 = NameAndType        #218:#91      // isGM:()Z
  #218 = Utf8               isGM
  #219 = Methodref          #11.#220      // ext/mods/gameserver/data/xml/AdminData.isGmOnline:(Z)Z
  #220 = NameAndType        #221:#222     // isGmOnline:(Z)Z
  #221 = Utf8               isGmOnline
  #222 = Utf8               (Z)Z
  #223 = Fieldref           #224.#225     // ext/mods/gameserver/network/SystemMessageId.GM_LIST:Lext/mods/gameserver/network/SystemMessageId;
  #224 = Class              #226          // ext/mods/gameserver/network/SystemMessageId
  #225 = NameAndType        #227:#228     // GM_LIST:Lext/mods/gameserver/network/SystemMessageId;
  #226 = Utf8               ext/mods/gameserver/network/SystemMessageId
  #227 = Utf8               GM_LIST
  #228 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
  #229 = Methodref          #181.#230     // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
  #230 = NameAndType        #231:#232     // sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
  #231 = Utf8               sendPacket
  #232 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
  #233 = Methodref          #11.#234      // ext/mods/gameserver/data/xml/AdminData.getAllGmNames:(Z)Ljava/util/List;
  #234 = NameAndType        #235:#236     // getAllGmNames:(Z)Ljava/util/List;
  #235 = Utf8               getAllGmNames
  #236 = Utf8               (Z)Ljava/util/List;
  #237 = InterfaceMethodref #66.#155      // java/util/List.iterator:()Ljava/util/Iterator;
  #238 = Class              #239          // java/lang/String
  #239 = Utf8               java/lang/String
  #240 = Fieldref           #224.#241     // ext/mods/gameserver/network/SystemMessageId.GM_S1:Lext/mods/gameserver/network/SystemMessageId;
  #241 = NameAndType        #242:#228     // GM_S1:Lext/mods/gameserver/network/SystemMessageId;
  #242 = Utf8               GM_S1
  #243 = Methodref          #244.#245     // ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #244 = Class              #246          // ext/mods/gameserver/network/serverpackets/SystemMessage
  #245 = NameAndType        #247:#248     // getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #246 = Utf8               ext/mods/gameserver/network/serverpackets/SystemMessage
  #247 = Utf8               getSystemMessage
  #248 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #249 = Methodref          #244.#250     // ext/mods/gameserver/network/serverpackets/SystemMessage.addString:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #250 = NameAndType        #251:#252     // addString:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #251 = Utf8               addString
  #252 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #253 = Methodref          #181.#254     // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #254 = NameAndType        #231:#255     // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #255 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #256 = Fieldref           #224.#257     // ext/mods/gameserver/network/SystemMessageId.NO_GM_PROVIDING_SERVICE_NOW:Lext/mods/gameserver/network/SystemMessageId;
  #257 = NameAndType        #258:#228     // NO_GM_PROVIDING_SERVICE_NOW:Lext/mods/gameserver/network/SystemMessageId;
  #258 = Utf8               NO_GM_PROVIDING_SERVICE_NOW
  #259 = Class              #260          // ext/mods/gameserver/network/serverpackets/PlaySound
  #260 = Utf8               ext/mods/gameserver/network/serverpackets/PlaySound
  #261 = String             #262          // systemmsg_e.702
  #262 = Utf8               systemmsg_e.702
  #263 = Methodref          #259.#264     // ext/mods/gameserver/network/serverpackets/PlaySound."<init>":(Ljava/lang/String;)V
  #264 = NameAndType        #5:#38        // "<init>":(Ljava/lang/String;)V
  #265 = Methodref          #11.#266      // ext/mods/gameserver/data/xml/AdminData.getAllGms:(Z)Ljava/util/List;
  #266 = NameAndType        #267:#236     // getAllGms:(Z)Ljava/util/List;
  #267 = Utf8               getAllGms
  #268 = Methodref          #181.#269     // ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
  #269 = NameAndType        #270:#38      // sendMessage:(Ljava/lang/String;)V
  #270 = Utf8               sendMessage
  #271 = Fieldref           #272.#273     // ext/mods/gameserver/data/xml/AdminData$SingletonHolder.INSTANCE:Lext/mods/gameserver/data/xml/AdminData;
  #272 = Class              #274          // ext/mods/gameserver/data/xml/AdminData$SingletonHolder
  #273 = NameAndType        #275:#276     // INSTANCE:Lext/mods/gameserver/data/xml/AdminData;
  #274 = Utf8               ext/mods/gameserver/data/xml/AdminData$SingletonHolder
  #275 = Utf8               INSTANCE
  #276 = Utf8               Lext/mods/gameserver/data/xml/AdminData;
  #277 = Methodref          #126.#278     // ext/mods/gameserver/model/records/AdminCommand.name:()Ljava/lang/String;
  #278 = NameAndType        #279:#189     // name:()Ljava/lang/String;
  #279 = Utf8               name
  #280 = Methodref          #238.#281     // java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
  #281 = NameAndType        #282:#283     // equalsIgnoreCase:(Ljava/lang/String;)Z
  #282 = Utf8               equalsIgnoreCase
  #283 = Utf8               (Ljava/lang/String;)Z
  #284 = String             #285          // access
  #285 = Utf8               access
  #286 = InvokeDynamic      #4:#71        // #4:accept:(Lext/mods/gameserver/data/xml/AdminData;)Ljava/util/function/Consumer;
  #287 = String             #288          // aCar
  #288 = Utf8               aCar
  #289 = InvokeDynamic      #5:#71        // #5:accept:(Lext/mods/gameserver/data/xml/AdminData;)Ljava/util/function/Consumer;
  #290 = Methodref          #11.#291      // ext/mods/gameserver/data/xml/AdminData.parseAttributes:(Lorg/w3c/dom/Node;)Lext/mods/commons/data/StatSet;
  #291 = NameAndType        #292:#293     // parseAttributes:(Lorg/w3c/dom/Node;)Lext/mods/commons/data/StatSet;
  #292 = Utf8               parseAttributes
  #293 = Utf8               (Lorg/w3c/dom/Node;)Lext/mods/commons/data/StatSet;
  #294 = Methodref          #126.#295     // ext/mods/gameserver/model/records/AdminCommand."<init>":(Lext/mods/commons/data/StatSet;)V
  #295 = NameAndType        #5:#296       // "<init>":(Lext/mods/commons/data/StatSet;)V
  #296 = Utf8               (Lext/mods/commons/data/StatSet;)V
  #297 = String             #298          // level
  #298 = Utf8               level
  #299 = Methodref          #300.#301     // ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
  #300 = Class              #302          // ext/mods/commons/data/StatSet
  #301 = NameAndType        #303:#304     // getInteger:(Ljava/lang/String;)I
  #302 = Utf8               ext/mods/commons/data/StatSet
  #303 = Utf8               getInteger
  #304 = Utf8               (Ljava/lang/String;)I
  #305 = Methodref          #86.#295      // ext/mods/gameserver/model/AccessLevel."<init>":(Lext/mods/commons/data/StatSet;)V
  #306 = Methodref          #7.#198       // java/util/TreeMap.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #307 = Class              #308          // ext/mods/commons/data/xml/IXmlReader
  #308 = Utf8               ext/mods/commons/data/xml/IXmlReader
  #309 = Utf8               Signature
  #310 = Utf8               Ljava/util/TreeMap<Ljava/lang/Integer;Lext/mods/gameserver/model/AccessLevel;>;
  #311 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/records/AdminCommand;>;
  #312 = Utf8               Ljava/util/Map<Lext/mods/gameserver/model/actor/Player;Ljava/lang/Boolean;>;
  #313 = Utf8               Code
  #314 = Utf8               LineNumberTable
  #315 = Utf8               LocalVariableTable
  #316 = Utf8               this
  #317 = Utf8               parseDocument
  #318 = Utf8               (Lorg/w3c/dom/Document;Ljava/nio/file/Path;)V
  #319 = Utf8               doc
  #320 = Utf8               Lorg/w3c/dom/Document;
  #321 = Utf8               path
  #322 = Utf8               Ljava/nio/file/Path;
  #323 = Utf8               reload
  #324 = Utf8               getAdminCommands
  #325 = Utf8               ()Ljava/util/List;
  #326 = Utf8               ()Ljava/util/List<Lext/mods/gameserver/model/records/AdminCommand;>;
  #327 = Utf8               I
  #328 = Utf8               StackMapTable
  #329 = Utf8               getMasterAccessLevel
  #330 = Utf8               hasAccessLevel
  #331 = Utf8               (I)Z
  #332 = Utf8               hasAccess
  #333 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/AccessLevel;)Z
  #334 = Utf8               command
  #335 = Utf8               Ljava/lang/String;
  #336 = Utf8               accessToCheck
  #337 = Utf8               Lext/mods/gameserver/model/AccessLevel;
  #338 = Utf8               ac
  #339 = Utf8               Lext/mods/gameserver/model/records/AdminCommand;
  #340 = Utf8               entry
  #341 = Utf8               Ljava/util/Map$Entry;
  #342 = Utf8               includeHidden
  #343 = Utf8               Z
  #344 = Utf8               LocalVariableTypeTable
  #345 = Utf8               Ljava/util/Map$Entry<Lext/mods/gameserver/model/actor/Player;Ljava/lang/Boolean;>;
  #346 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/actor/Player;>;
  #347 = Utf8               (Z)Ljava/util/List<Lext/mods/gameserver/model/actor/Player;>;
  #348 = Utf8               Ljava/util/List<Ljava/lang/String;>;
  #349 = Utf8               (Z)Ljava/util/List<Ljava/lang/String;>;
  #350 = Utf8               addGm
  #351 = Utf8               (Lext/mods/gameserver/model/actor/Player;Z)V
  #352 = Utf8               player
  #353 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #354 = Utf8               hidden
  #355 = Utf8               deleteGm
  #356 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
  #357 = Utf8               showOrHideGm
  #358 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Z
  #359 = Utf8               isRegisteredAsGM
  #360 = Utf8               sendListToPlayer
  #361 = Utf8               broadcastToGMs
  #362 = Utf8               gm
  #363 = Utf8               packet
  #364 = Utf8               Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;
  #365 = Utf8               broadcastMessageToGMs
  #366 = Utf8               message
  #367 = Utf8               getInstance
  #368 = Utf8               ()Lext/mods/gameserver/data/xml/AdminData;
  #369 = Utf8               lambda$showOrHideGm$0
  #370 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/lang/Boolean;)Ljava/lang/Boolean;
  #371 = Utf8               k
  #372 = Utf8               v
  #373 = Utf8               lambda$hasAccess$0
  #374 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/records/AdminCommand;)Z
  #375 = Utf8               c
  #376 = Utf8               lambda$parseDocument$0
  #377 = Utf8               (Lorg/w3c/dom/Node;)V
  #378 = Utf8               listNode
  #379 = Utf8               Lorg/w3c/dom/Node;
  #380 = Utf8               lambda$parseDocument$2
  #381 = Utf8               aCarNode
  #382 = Utf8               lambda$parseDocument$1
  #383 = Utf8               accessNode
  #384 = Utf8               set
  #385 = Utf8               Lext/mods/commons/data/StatSet;
  #386 = Utf8               SourceFile
  #387 = Utf8               AdminData.java
  #388 = Utf8               NestMembers
  #389 = Utf8               BootstrapMethods
  #390 = MethodType         #391          //  (Ljava/lang/Object;)V
  #391 = Utf8               (Ljava/lang/Object;)V
  #392 = MethodHandle       5:#393        // REF_invokeVirtual ext/mods/gameserver/data/xml/AdminData.lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
  #393 = Methodref          #11.#394      // ext/mods/gameserver/data/xml/AdminData.lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
  #394 = NameAndType        #376:#377     // lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
  #395 = MethodType         #377          //  (Lorg/w3c/dom/Node;)V
  #396 = MethodType         #102          //  (Ljava/lang/Object;)Z
  #397 = MethodHandle       6:#398        // REF_invokeStatic ext/mods/gameserver/data/xml/AdminData.lambda$hasAccess$0:(Ljava/lang/String;Lext/mods/gameserver/model/records/AdminCommand;)Z
  #398 = Methodref          #11.#399      // ext/mods/gameserver/data/xml/AdminData.lambda$hasAccess$0:(Ljava/lang/String;Lext/mods/gameserver/model/records/AdminCommand;)Z
  #399 = NameAndType        #373:#374     // lambda$hasAccess$0:(Ljava/lang/String;Lext/mods/gameserver/model/records/AdminCommand;)Z
  #400 = MethodType         #401          //  (Lext/mods/gameserver/model/records/AdminCommand;)Z
  #401 = Utf8               (Lext/mods/gameserver/model/records/AdminCommand;)Z
  #402 = String             #403          // \u0001 (invis)
  #403 = Utf8               \u0001 (invis)
  #404 = MethodType         #200          //  (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #405 = MethodHandle       6:#406        // REF_invokeStatic ext/mods/gameserver/data/xml/AdminData.lambda$showOrHideGm$0:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/Boolean;)Ljava/lang/Boolean;
  #406 = Methodref          #11.#407      // ext/mods/gameserver/data/xml/AdminData.lambda$showOrHideGm$0:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/Boolean;)Ljava/lang/Boolean;
  #407 = NameAndType        #369:#370     // lambda$showOrHideGm$0:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/Boolean;)Ljava/lang/Boolean;
  #408 = MethodType         #370          //  (Lext/mods/gameserver/model/actor/Player;Ljava/lang/Boolean;)Ljava/lang/Boolean;
  #409 = MethodHandle       5:#410        // REF_invokeVirtual ext/mods/gameserver/data/xml/AdminData.lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
  #410 = Methodref          #11.#411      // ext/mods/gameserver/data/xml/AdminData.lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
  #411 = NameAndType        #382:#377     // lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
  #412 = MethodHandle       5:#413        // REF_invokeVirtual ext/mods/gameserver/data/xml/AdminData.lambda$parseDocument$2:(Lorg/w3c/dom/Node;)V
  #413 = Methodref          #11.#414      // ext/mods/gameserver/data/xml/AdminData.lambda$parseDocument$2:(Lorg/w3c/dom/Node;)V
  #414 = NameAndType        #380:#377     // lambda$parseDocument$2:(Lorg/w3c/dom/Node;)V
  #415 = MethodHandle       6:#416        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #416 = Methodref          #417.#418     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #417 = Class              #419          // java/lang/invoke/LambdaMetafactory
  #418 = NameAndType        #420:#421     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #419 = Utf8               java/lang/invoke/LambdaMetafactory
  #420 = Utf8               metafactory
  #421 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #422 = MethodHandle       6:#423        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #423 = Methodref          #424.#425     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #424 = Class              #426          // java/lang/invoke/StringConcatFactory
  #425 = NameAndType        #192:#427     // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #426 = Utf8               java/lang/invoke/StringConcatFactory
  #427 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #428 = Utf8               InnerClasses
  #429 = Utf8               Entry
  #430 = Utf8               SingletonHolder
  #431 = Class              #432          // java/lang/invoke/MethodHandles$Lookup
  #432 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #433 = Class              #434          // java/lang/invoke/MethodHandles
  #434 = Utf8               java/lang/invoke/MethodHandles
  #435 = Utf8               Lookup
{
  protected ext.mods.gameserver.data.xml.AdminData();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=3, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: new           #7                  // class java/util/TreeMap
         8: dup
         9: invokespecial #9                  // Method java/util/TreeMap."<init>":()V
        12: putfield      #10                 // Field _accessLevels:Ljava/util/TreeMap;
        15: aload_0
        16: new           #16                 // class java/util/ArrayList
        19: dup
        20: invokespecial #18                 // Method java/util/ArrayList."<init>":()V
        23: putfield      #19                 // Field _adminCommands:Ljava/util/List;
        26: aload_0
        27: new           #23                 // class java/util/concurrent/ConcurrentHashMap
        30: dup
        31: invokespecial #25                 // Method java/util/concurrent/ConcurrentHashMap."<init>":()V
        34: putfield      #26                 // Field _gmList:Ljava/util/Map;
        37: aload_0
        38: invokevirtual #30                 // Method load:()V
        41: return
      LineNumberTable:
        line 56: 0
        line 51: 4
        line 52: 15
        line 53: 26
        line 57: 37
        line 58: 41
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      42     0  this   Lext/mods/gameserver/data/xml/AdminData;

  public void load();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=1, args_size=1
         0: aload_0
         1: ldc           #33                 // String xml/accessLevels.xml
         3: invokevirtual #35                 // Method parseDataFile:(Ljava/lang/String;)V
         6: getstatic     #39                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
         9: ldc           #43                 // String Loaded {} access levels.
        11: iconst_1
        12: anewarray     #2                  // class java/lang/Object
        15: dup
        16: iconst_0
        17: aload_0
        18: getfield      #10                 // Field _accessLevels:Ljava/util/TreeMap;
        21: invokevirtual #45                 // Method java/util/TreeMap.size:()I
        24: invokestatic  #49                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        27: aastore
        28: invokevirtual #55                 // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
        31: aload_0
        32: ldc           #61                 // String xml/adminCommands.xml
        34: invokevirtual #35                 // Method parseDataFile:(Ljava/lang/String;)V
        37: getstatic     #39                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
        40: ldc           #63                 // String Loaded {} admin command rights.
        42: iconst_1
        43: anewarray     #2                  // class java/lang/Object
        46: dup
        47: iconst_0
        48: aload_0
        49: getfield      #19                 // Field _adminCommands:Ljava/util/List;
        52: invokeinterface #65,  1           // InterfaceMethod java/util/List.size:()I
        57: invokestatic  #49                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        60: aastore
        61: invokevirtual #55                 // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
        64: return
      LineNumberTable:
        line 63: 0
        line 64: 6
        line 66: 31
        line 67: 37
        line 68: 64
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      65     0  this   Lext/mods/gameserver/data/xml/AdminData;

  public void parseDocument(org.w3c.dom.Document, java.nio.file.Path);
    descriptor: (Lorg/w3c/dom/Document;Ljava/nio/file/Path;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: ldc           #68                 // String list
         4: aload_0
         5: invokedynamic #70,  0             // InvokeDynamic #0:accept:(Lext/mods/gameserver/data/xml/AdminData;)Ljava/util/function/Consumer;
        10: invokevirtual #74                 // Method forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
        13: return
      LineNumberTable:
        line 73: 0
        line 83: 13
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0  this   Lext/mods/gameserver/data/xml/AdminData;
            0      14     1   doc   Lorg/w3c/dom/Document;
            0      14     2  path   Ljava/nio/file/Path;

  public void reload();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #10                 // Field _accessLevels:Ljava/util/TreeMap;
         4: invokevirtual #78                 // Method java/util/TreeMap.clear:()V
         7: aload_0
         8: getfield      #19                 // Field _adminCommands:Ljava/util/List;
        11: invokeinterface #81,  1           // InterfaceMethod java/util/List.clear:()V
        16: aload_0
        17: invokevirtual #30                 // Method load:()V
        20: return
      LineNumberTable:
        line 87: 0
        line 88: 7
        line 90: 16
        line 91: 20
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      21     0  this   Lext/mods/gameserver/data/xml/AdminData;

  public java.util.List<ext.mods.gameserver.model.records.AdminCommand> getAdminCommands();
    descriptor: ()Ljava/util/List;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #19                 // Field _adminCommands:Ljava/util/List;
         4: areturn
      LineNumberTable:
        line 95: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/data/xml/AdminData;
    Signature: #326                         // ()Ljava/util/List<Lext/mods/gameserver/model/records/AdminCommand;>;

  public ext.mods.gameserver.model.AccessLevel getAccessLevel(int);
    descriptor: (I)Lext/mods/gameserver/model/AccessLevel;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #10                 // Field _accessLevels:Ljava/util/TreeMap;
         4: iload_1
         5: ifge          12
         8: iconst_m1
         9: goto          13
        12: iload_1
        13: invokestatic  #49                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        16: invokevirtual #82                 // Method java/util/TreeMap.get:(Ljava/lang/Object;)Ljava/lang/Object;
        19: checkcast     #86                 // class ext/mods/gameserver/model/AccessLevel
        22: areturn
      LineNumberTable:
        line 104: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      23     0  this   Lext/mods/gameserver/data/xml/AdminData;
            0      23     1 level   I
      StackMapTable: number_of_entries = 2
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/util/TreeMap ]
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/data/xml/AdminData, int ]
          stack = [ class java/util/TreeMap, int ]

  public int getMasterAccessLevel();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #10                 // Field _accessLevels:Ljava/util/TreeMap;
         4: invokevirtual #88                 // Method java/util/TreeMap.isEmpty:()Z
         7: ifeq          14
        10: iconst_0
        11: goto          27
        14: aload_0
        15: getfield      #10                 // Field _accessLevels:Ljava/util/TreeMap;
        18: invokevirtual #92                 // Method java/util/TreeMap.lastKey:()Ljava/lang/Object;
        21: checkcast     #50                 // class java/lang/Integer
        24: invokevirtual #96                 // Method java/lang/Integer.intValue:()I
        27: ireturn
      LineNumberTable:
        line 112: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      28     0  this   Lext/mods/gameserver/data/xml/AdminData;
      StackMapTable: number_of_entries = 2
        frame_type = 14 /* same */
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ int ]

  public boolean hasAccessLevel(int);
    descriptor: (I)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #10                 // Field _accessLevels:Ljava/util/TreeMap;
         4: iload_1
         5: invokestatic  #49                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
         8: invokevirtual #99                 // Method java/util/TreeMap.containsKey:(Ljava/lang/Object;)Z
        11: ireturn
      LineNumberTable:
        line 121: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/gameserver/data/xml/AdminData;
            0      12     1 level   I

  public boolean hasAccess(java.lang.String, ext.mods.gameserver.model.AccessLevel);
    descriptor: (Ljava/lang/String;Lext/mods/gameserver/model/AccessLevel;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=5, args_size=3
         0: aload_0
         1: getfield      #19                 // Field _adminCommands:Ljava/util/List;
         4: invokeinterface #103,  1          // InterfaceMethod java/util/List.stream:()Ljava/util/stream/Stream;
         9: aload_1
        10: invokedynamic #107,  0            // InvokeDynamic #1:test:(Ljava/lang/String;)Ljava/util/function/Predicate;
        15: invokeinterface #111,  2          // InterfaceMethod java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
        20: invokeinterface #117,  1          // InterfaceMethod java/util/stream/Stream.findFirst:()Ljava/util/Optional;
        25: aconst_null
        26: invokevirtual #121                // Method java/util/Optional.orElse:(Ljava/lang/Object;)Ljava/lang/Object;
        29: checkcast     #126                // class ext/mods/gameserver/model/records/AdminCommand
        32: astore_3
        33: aload_3
        34: ifnonnull     55
        37: getstatic     #39                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
        40: ldc           #128                // String No rights defined for admin command \'{}\'.
        42: iconst_1
        43: anewarray     #2                  // class java/lang/Object
        46: dup
        47: iconst_0
        48: aload_1
        49: aastore
        50: invokevirtual #130                // Method ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;[Ljava/lang/Object;)V
        53: iconst_0
        54: ireturn
        55: aload_0
        56: aload_3
        57: invokevirtual #133                // Method ext/mods/gameserver/model/records/AdminCommand.accessLevel:()I
        60: invokevirtual #136                // Method getAccessLevel:(I)Lext/mods/gameserver/model/AccessLevel;
        63: astore        4
        65: aload         4
        67: ifnull        95
        70: aload         4
        72: invokevirtual #140                // Method ext/mods/gameserver/model/AccessLevel.getLevel:()I
        75: aload_2
        76: invokevirtual #140                // Method ext/mods/gameserver/model/AccessLevel.getLevel:()I
        79: if_icmpeq     91
        82: aload_2
        83: aload         4
        85: invokevirtual #143                // Method ext/mods/gameserver/model/AccessLevel.hasChildAccess:(Lext/mods/gameserver/model/AccessLevel;)Z
        88: ifeq          95
        91: iconst_1
        92: goto          96
        95: iconst_0
        96: ireturn
      LineNumberTable:
        line 131: 0
        line 132: 33
        line 134: 37
        line 135: 53
        line 138: 55
        line 139: 65
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      97     0  this   Lext/mods/gameserver/data/xml/AdminData;
            0      97     1 command   Ljava/lang/String;
            0      97     2 accessToCheck   Lext/mods/gameserver/model/AccessLevel;
           33      64     3    ac   Lext/mods/gameserver/model/records/AdminCommand;
           65      32     4 access   Lext/mods/gameserver/model/AccessLevel;
      StackMapTable: number_of_entries = 4
        frame_type = 252 /* append */
          offset_delta = 55
          locals = [ class ext/mods/gameserver/model/records/AdminCommand ]
        frame_type = 252 /* append */
          offset_delta = 35
          locals = [ class ext/mods/gameserver/model/AccessLevel ]
        frame_type = 3 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public java.util.List<ext.mods.gameserver.model.actor.Player> getAllGms(boolean);
    descriptor: (Z)Ljava/util/List;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=5, args_size=2
         0: new           #16                 // class java/util/ArrayList
         3: dup
         4: invokespecial #18                 // Method java/util/ArrayList."<init>":()V
         7: astore_2
         8: aload_0
         9: getfield      #26                 // Field _gmList:Ljava/util/Map;
        12: invokeinterface #147,  1          // InterfaceMethod java/util/Map.entrySet:()Ljava/util/Set;
        17: invokeinterface #153,  1          // InterfaceMethod java/util/Set.iterator:()Ljava/util/Iterator;
        22: astore_3
        23: aload_3
        24: invokeinterface #159,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        29: ifeq          80
        32: aload_3
        33: invokeinterface #164,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        38: checkcast     #167                // class java/util/Map$Entry
        41: astore        4
        43: iload_1
        44: ifne          60
        47: aload         4
        49: invokeinterface #169,  1          // InterfaceMethod java/util/Map$Entry.getValue:()Ljava/lang/Object;
        54: getstatic     #172                // Field java/lang/Boolean.FALSE:Ljava/lang/Boolean;
        57: if_acmpne     77
        60: aload_2
        61: aload         4
        63: invokeinterface #178,  1          // InterfaceMethod java/util/Map$Entry.getKey:()Ljava/lang/Object;
        68: checkcast     #181                // class ext/mods/gameserver/model/actor/Player
        71: invokeinterface #183,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        76: pop
        77: goto          23
        80: aload_2
        81: areturn
      LineNumberTable:
        line 148: 0
        line 149: 8
        line 151: 43
        line 152: 60
        line 153: 77
        line 154: 80
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           43      34     4 entry   Ljava/util/Map$Entry;
            0      82     0  this   Lext/mods/gameserver/data/xml/AdminData;
            0      82     1 includeHidden   Z
            8      74     2  list   Ljava/util/List;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
           43      34     4 entry   Ljava/util/Map$Entry<Lext/mods/gameserver/model/actor/Player;Ljava/lang/Boolean;>;
            8      74     2  list   Ljava/util/List<Lext/mods/gameserver/model/actor/Player;>;
      StackMapTable: number_of_entries = 4
        frame_type = 253 /* append */
          offset_delta = 23
          locals = [ class java/util/List, class java/util/Iterator ]
        frame_type = 252 /* append */
          offset_delta = 36
          locals = [ class java/util/Map$Entry ]
        frame_type = 250 /* chop */
          offset_delta = 16
        frame_type = 250 /* chop */
          offset_delta = 2
    Signature: #347                         // (Z)Ljava/util/List<Lext/mods/gameserver/model/actor/Player;>;

  public java.util.List<java.lang.String> getAllGmNames(boolean);
    descriptor: (Z)Ljava/util/List;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=5, args_size=2
         0: new           #16                 // class java/util/ArrayList
         3: dup
         4: invokespecial #18                 // Method java/util/ArrayList."<init>":()V
         7: astore_2
         8: aload_0
         9: getfield      #26                 // Field _gmList:Ljava/util/Map;
        12: invokeinterface #147,  1          // InterfaceMethod java/util/Map.entrySet:()Ljava/util/Set;
        17: invokeinterface #153,  1          // InterfaceMethod java/util/Set.iterator:()Ljava/util/Iterator;
        22: astore_3
        23: aload_3
        24: invokeinterface #159,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        29: ifeq          111
        32: aload_3
        33: invokeinterface #164,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        38: checkcast     #167                // class java/util/Map$Entry
        41: astore        4
        43: aload         4
        45: invokeinterface #169,  1          // InterfaceMethod java/util/Map$Entry.getValue:()Ljava/lang/Object;
        50: getstatic     #172                // Field java/lang/Boolean.FALSE:Ljava/lang/Boolean;
        53: if_acmpne     79
        56: aload_2
        57: aload         4
        59: invokeinterface #178,  1          // InterfaceMethod java/util/Map$Entry.getKey:()Ljava/lang/Object;
        64: checkcast     #181                // class ext/mods/gameserver/model/actor/Player
        67: invokevirtual #186                // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
        70: invokeinterface #183,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        75: pop
        76: goto          108
        79: iload_1
        80: ifeq          108
        83: aload_2
        84: aload         4
        86: invokeinterface #178,  1          // InterfaceMethod java/util/Map$Entry.getKey:()Ljava/lang/Object;
        91: checkcast     #181                // class ext/mods/gameserver/model/actor/Player
        94: invokevirtual #186                // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
        97: invokedynamic #190,  0            // InvokeDynamic #2:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       102: invokeinterface #183,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       107: pop
       108: goto          23
       111: aload_2
       112: areturn
      LineNumberTable:
        line 163: 0
        line 164: 8
        line 166: 43
        line 167: 56
        line 168: 79
        line 169: 83
        line 170: 108
        line 171: 111
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           43      65     4 entry   Ljava/util/Map$Entry;
            0     113     0  this   Lext/mods/gameserver/data/xml/AdminData;
            0     113     1 includeHidden   Z
            8     105     2  list   Ljava/util/List;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
           43      65     4 entry   Ljava/util/Map$Entry<Lext/mods/gameserver/model/actor/Player;Ljava/lang/Boolean;>;
            8     105     2  list   Ljava/util/List<Ljava/lang/String;>;
      StackMapTable: number_of_entries = 4
        frame_type = 253 /* append */
          offset_delta = 23
          locals = [ class java/util/List, class java/util/Iterator ]
        frame_type = 252 /* append */
          offset_delta = 55
          locals = [ class java/util/Map$Entry ]
        frame_type = 250 /* chop */
          offset_delta = 28
        frame_type = 250 /* chop */
          offset_delta = 2
    Signature: #349                         // (Z)Ljava/util/List<Ljava/lang/String;>;

  public void addGm(ext.mods.gameserver.model.actor.Player, boolean);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Z)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: getfield      #26                 // Field _gmList:Ljava/util/Map;
         4: aload_1
         5: iload_2
         6: invokestatic  #194                // Method java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
         9: invokeinterface #197,  3          // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        14: pop
        15: return
      LineNumberTable:
        line 181: 0
        line 182: 15
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      16     0  this   Lext/mods/gameserver/data/xml/AdminData;
            0      16     1 player   Lext/mods/gameserver/model/actor/Player;
            0      16     2 hidden   Z

  public void deleteGm(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #26                 // Field _gmList:Ljava/util/Map;
         4: aload_1
         5: invokeinterface #201,  2          // InterfaceMethod java/util/Map.remove:(Ljava/lang/Object;)Ljava/lang/Object;
        10: pop
        11: return
      LineNumberTable:
        line 190: 0
        line 191: 11
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/gameserver/data/xml/AdminData;
            0      12     1 player   Lext/mods/gameserver/model/actor/Player;

  public boolean showOrHideGm(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: getfield      #26                 // Field _gmList:Ljava/util/Map;
         4: aload_1
         5: invokedynamic #204,  0            // InvokeDynamic #3:apply:()Ljava/util/function/BiFunction;
        10: invokeinterface #208,  3          // InterfaceMethod java/util/Map.computeIfPresent:(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;
        15: checkcast     #173                // class java/lang/Boolean
        18: invokevirtual #212                // Method java/lang/Boolean.booleanValue:()Z
        21: ireturn
      LineNumberTable:
        line 200: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      22     0  this   Lext/mods/gameserver/data/xml/AdminData;
            0      22     1 player   Lext/mods/gameserver/model/actor/Player;

  public boolean isGmOnline(boolean);
    descriptor: (Z)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=4, args_size=2
         0: aload_0
         1: getfield      #26                 // Field _gmList:Ljava/util/Map;
         4: invokeinterface #147,  1          // InterfaceMethod java/util/Map.entrySet:()Ljava/util/Set;
         9: invokeinterface #153,  1          // InterfaceMethod java/util/Set.iterator:()Ljava/util/Iterator;
        14: astore_2
        15: aload_2
        16: invokeinterface #159,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        21: ifeq          55
        24: aload_2
        25: invokeinterface #164,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        30: checkcast     #167                // class java/util/Map$Entry
        33: astore_3
        34: iload_1
        35: ifne          50
        38: aload_3
        39: invokeinterface #169,  1          // InterfaceMethod java/util/Map$Entry.getValue:()Ljava/lang/Object;
        44: getstatic     #172                // Field java/lang/Boolean.FALSE:Ljava/lang/Boolean;
        47: if_acmpne     52
        50: iconst_1
        51: ireturn
        52: goto          15
        55: iconst_0
        56: ireturn
      LineNumberTable:
        line 209: 0
        line 211: 34
        line 212: 50
        line 213: 52
        line 214: 55
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           34      18     3 entry   Ljava/util/Map$Entry;
            0      57     0  this   Lext/mods/gameserver/data/xml/AdminData;
            0      57     1 includeHidden   Z
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
           34      18     3 entry   Ljava/util/Map$Entry<Lext/mods/gameserver/model/actor/Player;Ljava/lang/Boolean;>;
      StackMapTable: number_of_entries = 4
        frame_type = 252 /* append */
          offset_delta = 15
          locals = [ class java/util/Iterator ]
        frame_type = 252 /* append */
          offset_delta = 34
          locals = [ class java/util/Map$Entry ]
        frame_type = 250 /* chop */
          offset_delta = 1
        frame_type = 250 /* chop */
          offset_delta = 2

  public boolean isRegisteredAsGM(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #26                 // Field _gmList:Ljava/util/Map;
         4: aload_1
         5: invokeinterface #215,  2          // InterfaceMethod java/util/Map.containsKey:(Ljava/lang/Object;)Z
        10: ireturn
      LineNumberTable:
        line 223: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      11     0  this   Lext/mods/gameserver/data/xml/AdminData;
            0      11     1 player   Lext/mods/gameserver/model/actor/Player;

  public void sendListToPlayer(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=4, args_size=2
         0: aload_0
         1: aload_1
         2: invokevirtual #216                // Method ext/mods/gameserver/model/actor/Player.isGM:()Z
         5: invokevirtual #219                // Method isGmOnline:(Z)Z
         8: ifeq          71
        11: aload_1
        12: getstatic     #223                // Field ext/mods/gameserver/network/SystemMessageId.GM_LIST:Lext/mods/gameserver/network/SystemMessageId;
        15: invokevirtual #229                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        18: aload_0
        19: aload_1
        20: invokevirtual #216                // Method ext/mods/gameserver/model/actor/Player.isGM:()Z
        23: invokevirtual #233                // Method getAllGmNames:(Z)Ljava/util/List;
        26: invokeinterface #237,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
        31: astore_2
        32: aload_2
        33: invokeinterface #159,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        38: ifeq          68
        41: aload_2
        42: invokeinterface #164,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        47: checkcast     #238                // class java/lang/String
        50: astore_3
        51: aload_1
        52: getstatic     #240                // Field ext/mods/gameserver/network/SystemMessageId.GM_S1:Lext/mods/gameserver/network/SystemMessageId;
        55: invokestatic  #243                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        58: aload_3
        59: invokevirtual #249                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addString:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        62: invokevirtual #253                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        65: goto          32
        68: goto          92
        71: aload_1
        72: getstatic     #256                // Field ext/mods/gameserver/network/SystemMessageId.NO_GM_PROVIDING_SERVICE_NOW:Lext/mods/gameserver/network/SystemMessageId;
        75: invokevirtual #229                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        78: aload_1
        79: new           #259                // class ext/mods/gameserver/network/serverpackets/PlaySound
        82: dup
        83: ldc_w         #261                // String systemmsg_e.702
        86: invokespecial #263                // Method ext/mods/gameserver/network/serverpackets/PlaySound."<init>":(Ljava/lang/String;)V
        89: invokevirtual #253                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        92: return
      LineNumberTable:
        line 232: 0
        line 234: 11
        line 236: 18
        line 237: 51
        line 241: 71
        line 242: 78
        line 244: 92
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           51      14     3  name   Ljava/lang/String;
            0      93     0  this   Lext/mods/gameserver/data/xml/AdminData;
            0      93     1 player   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 4
        frame_type = 252 /* append */
          offset_delta = 32
          locals = [ class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 35
        frame_type = 2 /* same */
        frame_type = 20 /* same */

  public void broadcastToGMs(ext.mods.gameserver.network.serverpackets.L2GameServerPacket);
    descriptor: (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=4, args_size=2
         0: aload_0
         1: iconst_1
         2: invokevirtual #265                // Method getAllGms:(Z)Ljava/util/List;
         5: invokeinterface #237,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
        10: astore_2
        11: aload_2
        12: invokeinterface #159,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        17: ifeq          38
        20: aload_2
        21: invokeinterface #164,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        26: checkcast     #181                // class ext/mods/gameserver/model/actor/Player
        29: astore_3
        30: aload_3
        31: aload_1
        32: invokevirtual #253                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        35: goto          11
        38: return
      LineNumberTable:
        line 252: 0
        line 253: 30
        line 254: 38
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           30       5     3    gm   Lext/mods/gameserver/model/actor/Player;
            0      39     0  this   Lext/mods/gameserver/data/xml/AdminData;
            0      39     1 packet   Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 11
          locals = [ class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 26

  public void broadcastMessageToGMs(java.lang.String);
    descriptor: (Ljava/lang/String;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=4, args_size=2
         0: aload_0
         1: iconst_1
         2: invokevirtual #265                // Method getAllGms:(Z)Ljava/util/List;
         5: invokeinterface #237,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
        10: astore_2
        11: aload_2
        12: invokeinterface #159,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        17: ifeq          38
        20: aload_2
        21: invokeinterface #164,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        26: checkcast     #181                // class ext/mods/gameserver/model/actor/Player
        29: astore_3
        30: aload_3
        31: aload_1
        32: invokevirtual #268                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
        35: goto          11
        38: return
      LineNumberTable:
        line 262: 0
        line 263: 30
        line 264: 38
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           30       5     3    gm   Lext/mods/gameserver/model/actor/Player;
            0      39     0  this   Lext/mods/gameserver/data/xml/AdminData;
            0      39     1 message   Ljava/lang/String;
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 11
          locals = [ class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 26

  public static ext.mods.gameserver.data.xml.AdminData getInstance();
    descriptor: ()Lext/mods/gameserver/data/xml/AdminData;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #271                // Field ext/mods/gameserver/data/xml/AdminData$SingletonHolder.INSTANCE:Lext/mods/gameserver/data/xml/AdminData;
         3: areturn
      LineNumberTable:
        line 268: 0
}
SourceFile: "AdminData.java"
NestMembers:
  ext/mods/gameserver/data/xml/AdminData$SingletonHolder
BootstrapMethods:
  0: #415 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #390 (Ljava/lang/Object;)V
      #392 REF_invokeVirtual ext/mods/gameserver/data/xml/AdminData.lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
      #395 (Lorg/w3c/dom/Node;)V
  1: #415 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #396 (Ljava/lang/Object;)Z
      #397 REF_invokeStatic ext/mods/gameserver/data/xml/AdminData.lambda$hasAccess$0:(Ljava/lang/String;Lext/mods/gameserver/model/records/AdminCommand;)Z
      #400 (Lext/mods/gameserver/model/records/AdminCommand;)Z
  2: #422 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #402 \u0001 (invis)
  3: #415 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #404 (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      #405 REF_invokeStatic ext/mods/gameserver/data/xml/AdminData.lambda$showOrHideGm$0:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/Boolean;)Ljava/lang/Boolean;
      #408 (Lext/mods/gameserver/model/actor/Player;Ljava/lang/Boolean;)Ljava/lang/Boolean;
  4: #415 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #390 (Ljava/lang/Object;)V
      #409 REF_invokeVirtual ext/mods/gameserver/data/xml/AdminData.lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
      #395 (Lorg/w3c/dom/Node;)V
  5: #415 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #390 (Ljava/lang/Object;)V
      #412 REF_invokeVirtual ext/mods/gameserver/data/xml/AdminData.lambda$parseDocument$2:(Lorg/w3c/dom/Node;)V
      #395 (Lorg/w3c/dom/Node;)V
InnerClasses:
  public static #429= #167 of #148;       // Entry=class java/util/Map$Entry of class java/util/Map
  public static final #435= #431 of #433; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
