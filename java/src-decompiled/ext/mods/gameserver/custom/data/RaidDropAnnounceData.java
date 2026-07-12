// Bytecode for: ext.mods.gameserver.custom.data.RaidDropAnnounceData
// File: ext\mods\gameserver\custom\data\RaidDropAnnounceData.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/custom/data/RaidDropAnnounceData.class
  Last modified 9 de jul de 2026; size 7172 bytes
  MD5 checksum a49e1c9032c27ec0ca9a6f82bf0fdc92
  Compiled from "RaidDropAnnounceData.java"
public class ext.mods.gameserver.custom.data.RaidDropAnnounceData implements ext.mods.commons.data.xml.IXmlReader
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/custom/data/RaidDropAnnounceData
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 3, methods: 10, attributes: 4
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Fieldref           #8.#9         // ext/mods/gameserver/custom/data/RaidDropAnnounceData.enabled:Z
    #8 = Class              #10           // ext/mods/gameserver/custom/data/RaidDropAnnounceData
    #9 = NameAndType        #11:#12       // enabled:Z
   #10 = Utf8               ext/mods/gameserver/custom/data/RaidDropAnnounceData
   #11 = Utf8               enabled
   #12 = Utf8               Z
   #13 = Class              #14           // java/util/EnumMap
   #14 = Utf8               java/util/EnumMap
   #15 = Class              #16           // ext/mods/gameserver/enums/items/CrystalType
   #16 = Utf8               ext/mods/gameserver/enums/items/CrystalType
   #17 = Methodref          #13.#18       // java/util/EnumMap."<init>":(Ljava/lang/Class;)V
   #18 = NameAndType        #5:#19        // "<init>":(Ljava/lang/Class;)V
   #19 = Utf8               (Ljava/lang/Class;)V
   #20 = Fieldref           #8.#21        // ext/mods/gameserver/custom/data/RaidDropAnnounceData.gradeMap:Ljava/util/Map;
   #21 = NameAndType        #22:#23       // gradeMap:Ljava/util/Map;
   #22 = Utf8               gradeMap
   #23 = Utf8               Ljava/util/Map;
   #24 = Fieldref           #8.#25        // ext/mods/gameserver/custom/data/RaidDropAnnounceData.gradeItemIdMap:Ljava/util/Map;
   #25 = NameAndType        #26:#23       // gradeItemIdMap:Ljava/util/Map;
   #26 = Utf8               gradeItemIdMap
   #27 = Methodref          #8.#28        // ext/mods/gameserver/custom/data/RaidDropAnnounceData.load:()V
   #28 = NameAndType        #29:#6        // load:()V
   #29 = Utf8               load
   #30 = String             #31           // custom/mods/raid_drop_announce.xml
   #31 = Utf8               custom/mods/raid_drop_announce.xml
   #32 = Methodref          #8.#33        // ext/mods/gameserver/custom/data/RaidDropAnnounceData.parseDataFile:(Ljava/lang/String;)V
   #33 = NameAndType        #34:#35       // parseDataFile:(Ljava/lang/String;)V
   #34 = Utf8               parseDataFile
   #35 = Utf8               (Ljava/lang/String;)V
   #36 = Fieldref           #8.#37        // ext/mods/gameserver/custom/data/RaidDropAnnounceData.LOGGER:Lext/mods/commons/logging/CLogger;
   #37 = NameAndType        #38:#39       // LOGGER:Lext/mods/commons/logging/CLogger;
   #38 = Utf8               LOGGER
   #39 = Utf8               Lext/mods/commons/logging/CLogger;
   #40 = Methodref          #2.#41        // java/lang/Object.getClass:()Ljava/lang/Class;
   #41 = NameAndType        #42:#43       // getClass:()Ljava/lang/Class;
   #42 = Utf8               getClass
   #43 = Utf8               ()Ljava/lang/Class;
   #44 = Methodref          #45.#46       // java/lang/Class.getSimpleName:()Ljava/lang/String;
   #45 = Class              #47           // java/lang/Class
   #46 = NameAndType        #48:#49       // getSimpleName:()Ljava/lang/String;
   #47 = Utf8               java/lang/Class
   #48 = Utf8               getSimpleName
   #49 = Utf8               ()Ljava/lang/String;
   #50 = InvokeDynamic      #0:#51        // #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #51 = NameAndType        #52:#53       // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #52 = Utf8               makeConcatWithConstants
   #53 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
   #54 = Methodref          #55.#56       // ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;)V
   #55 = Class              #57           // ext/mods/commons/logging/CLogger
   #56 = NameAndType        #58:#59       // info:(Ljava/lang/Object;)V
   #57 = Utf8               ext/mods/commons/logging/CLogger
   #58 = Utf8               info
   #59 = Utf8               (Ljava/lang/Object;)V
   #60 = String             #61           // list
   #61 = Utf8               list
   #62 = InvokeDynamic      #1:#63        // #1:accept:(Lext/mods/gameserver/custom/data/RaidDropAnnounceData;Ljava/nio/file/Path;)Ljava/util/function/Consumer;
   #63 = NameAndType        #64:#65       // accept:(Lext/mods/gameserver/custom/data/RaidDropAnnounceData;Ljava/nio/file/Path;)Ljava/util/function/Consumer;
   #64 = Utf8               accept
   #65 = Utf8               (Lext/mods/gameserver/custom/data/RaidDropAnnounceData;Ljava/nio/file/Path;)Ljava/util/function/Consumer;
   #66 = Methodref          #8.#67        // ext/mods/gameserver/custom/data/RaidDropAnnounceData.forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
   #67 = NameAndType        #68:#69       // forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
   #68 = Utf8               forEach
   #69 = Utf8               (Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
   #70 = Methodref          #71.#72       // ext/mods/gameserver/model/item/kind/Item.getCrystalType:()Lext/mods/gameserver/enums/items/CrystalType;
   #71 = Class              #73           // ext/mods/gameserver/model/item/kind/Item
   #72 = NameAndType        #74:#75       // getCrystalType:()Lext/mods/gameserver/enums/items/CrystalType;
   #73 = Utf8               ext/mods/gameserver/model/item/kind/Item
   #74 = Utf8               getCrystalType
   #75 = Utf8               ()Lext/mods/gameserver/enums/items/CrystalType;
   #76 = InterfaceMethodref #77.#78       // java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
   #77 = Class              #79           // java/util/Map
   #78 = NameAndType        #80:#81       // get:(Ljava/lang/Object;)Ljava/lang/Object;
   #79 = Utf8               java/util/Map
   #80 = Utf8               get
   #81 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
   #82 = Class              #83           // ext/mods/commons/data/StatSet
   #83 = Utf8               ext/mods/commons/data/StatSet
   #84 = String             #85           // announce
   #85 = Utf8               announce
   #86 = Methodref          #82.#87       // ext/mods/commons/data/StatSet.getBool:(Ljava/lang/String;Z)Z
   #87 = NameAndType        #88:#89       // getBool:(Ljava/lang/String;Z)Z
   #88 = Utf8               getBool
   #89 = Utf8               (Ljava/lang/String;Z)Z
   #90 = Class              #91           // java/util/Set
   #91 = Utf8               java/util/Set
   #92 = InterfaceMethodref #90.#93       // java/util/Set.isEmpty:()Z
   #93 = NameAndType        #94:#95       // isEmpty:()Z
   #94 = Utf8               isEmpty
   #95 = Utf8               ()Z
   #96 = Methodref          #71.#97       // ext/mods/gameserver/model/item/kind/Item.getItemId:()I
   #97 = NameAndType        #98:#99       // getItemId:()I
   #98 = Utf8               getItemId
   #99 = Utf8               ()I
  #100 = Methodref          #101.#102     // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
  #101 = Class              #103          // java/lang/Integer
  #102 = NameAndType        #104:#105     // valueOf:(I)Ljava/lang/Integer;
  #103 = Utf8               java/lang/Integer
  #104 = Utf8               valueOf
  #105 = Utf8               (I)Ljava/lang/Integer;
  #106 = InterfaceMethodref #90.#107      // java/util/Set.contains:(Ljava/lang/Object;)Z
  #107 = NameAndType        #108:#109     // contains:(Ljava/lang/Object;)Z
  #108 = Utf8               contains
  #109 = Utf8               (Ljava/lang/Object;)Z
  #110 = String             #111          //
  #111 = Utf8
  #112 = String             #113          // message
  #113 = Utf8               message
  #114 = Methodref          #82.#115      // ext/mods/commons/data/StatSet.getString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #115 = NameAndType        #116:#117     // getString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #116 = Utf8               getString
  #117 = Utf8               (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #118 = Fieldref           #119.#120     // ext/mods/gameserver/custom/data/RaidDropAnnounceData$SingletonHolder.INSTANCE:Lext/mods/gameserver/custom/data/RaidDropAnnounceData;
  #119 = Class              #121          // ext/mods/gameserver/custom/data/RaidDropAnnounceData$SingletonHolder
  #120 = NameAndType        #122:#123     // INSTANCE:Lext/mods/gameserver/custom/data/RaidDropAnnounceData;
  #121 = Utf8               ext/mods/gameserver/custom/data/RaidDropAnnounceData$SingletonHolder
  #122 = Utf8               INSTANCE
  #123 = Utf8               Lext/mods/gameserver/custom/data/RaidDropAnnounceData;
  #124 = InterfaceMethodref #125.#126     // org/w3c/dom/Node.getAttributes:()Lorg/w3c/dom/NamedNodeMap;
  #125 = Class              #127          // org/w3c/dom/Node
  #126 = NameAndType        #128:#129     // getAttributes:()Lorg/w3c/dom/NamedNodeMap;
  #127 = Utf8               org/w3c/dom/Node
  #128 = Utf8               getAttributes
  #129 = Utf8               ()Lorg/w3c/dom/NamedNodeMap;
  #130 = String             #11           // enabled
  #131 = InterfaceMethodref #132.#133     // org/w3c/dom/NamedNodeMap.getNamedItem:(Ljava/lang/String;)Lorg/w3c/dom/Node;
  #132 = Class              #134          // org/w3c/dom/NamedNodeMap
  #133 = NameAndType        #135:#136     // getNamedItem:(Ljava/lang/String;)Lorg/w3c/dom/Node;
  #134 = Utf8               org/w3c/dom/NamedNodeMap
  #135 = Utf8               getNamedItem
  #136 = Utf8               (Ljava/lang/String;)Lorg/w3c/dom/Node;
  #137 = InterfaceMethodref #125.#138     // org/w3c/dom/Node.getNodeValue:()Ljava/lang/String;
  #138 = NameAndType        #139:#49      // getNodeValue:()Ljava/lang/String;
  #139 = Utf8               getNodeValue
  #140 = Methodref          #141.#142     // java/lang/Boolean.parseBoolean:(Ljava/lang/String;)Z
  #141 = Class              #143          // java/lang/Boolean
  #142 = NameAndType        #144:#145     // parseBoolean:(Ljava/lang/String;)Z
  #143 = Utf8               java/lang/Boolean
  #144 = Utf8               parseBoolean
  #145 = Utf8               (Ljava/lang/String;)Z
  #146 = String             #147          // grade
  #147 = Utf8               grade
  #148 = InvokeDynamic      #2:#63        // #2:accept:(Lext/mods/gameserver/custom/data/RaidDropAnnounceData;Ljava/nio/file/Path;)Ljava/util/function/Consumer;
  #149 = Methodref          #8.#150       // ext/mods/gameserver/custom/data/RaidDropAnnounceData.parseAttributes:(Lorg/w3c/dom/Node;)Lext/mods/commons/data/StatSet;
  #150 = NameAndType        #151:#152     // parseAttributes:(Lorg/w3c/dom/Node;)Lext/mods/commons/data/StatSet;
  #151 = Utf8               parseAttributes
  #152 = Utf8               (Lorg/w3c/dom/Node;)Lext/mods/commons/data/StatSet;
  #153 = Methodref          #82.#154      // ext/mods/commons/data/StatSet."<init>":(Lext/mods/commons/data/StatSet;)V
  #154 = NameAndType        #5:#155       // "<init>":(Lext/mods/commons/data/StatSet;)V
  #155 = Utf8               (Lext/mods/commons/data/StatSet;)V
  #156 = String             #157          // name
  #157 = Utf8               name
  #158 = Methodref          #82.#159      // ext/mods/commons/data/StatSet.getString:(Ljava/lang/String;)Ljava/lang/String;
  #159 = NameAndType        #116:#53      // getString:(Ljava/lang/String;)Ljava/lang/String;
  #160 = Methodref          #15.#161      // ext/mods/gameserver/enums/items/CrystalType.valueOf:(Ljava/lang/String;)Lext/mods/gameserver/enums/items/CrystalType;
  #161 = NameAndType        #104:#162     // valueOf:(Ljava/lang/String;)Lext/mods/gameserver/enums/items/CrystalType;
  #162 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/enums/items/CrystalType;
  #163 = InterfaceMethodref #77.#164      // java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #164 = NameAndType        #165:#166     // put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #165 = Utf8               put
  #166 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #167 = Class              #168          // java/lang/IllegalArgumentException
  #168 = Utf8               java/lang/IllegalArgumentException
  #169 = InterfaceMethodref #170.#171     // java/nio/file/Path.getFileName:()Ljava/nio/file/Path;
  #170 = Class              #172          // java/nio/file/Path
  #171 = NameAndType        #173:#174     // getFileName:()Ljava/nio/file/Path;
  #172 = Utf8               java/nio/file/Path
  #173 = Utf8               getFileName
  #174 = Utf8               ()Ljava/nio/file/Path;
  #175 = Methodref          #176.#177     // java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
  #176 = Class              #178          // java/lang/String
  #177 = NameAndType        #104:#179     // valueOf:(Ljava/lang/Object;)Ljava/lang/String;
  #178 = Utf8               java/lang/String
  #179 = Utf8               (Ljava/lang/Object;)Ljava/lang/String;
  #180 = InvokeDynamic      #3:#181       // #3:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #181 = NameAndType        #52:#182      // makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #182 = Utf8               (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #183 = Methodref          #55.#184      // ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;)V
  #184 = NameAndType        #185:#59      // warn:(Ljava/lang/Object;)V
  #185 = Utf8               warn
  #186 = String             #187          // itemIds
  #187 = Utf8               itemIds
  #188 = Methodref          #176.#93      // java/lang/String.isEmpty:()Z
  #189 = Class              #190          // java/util/HashSet
  #190 = Utf8               java/util/HashSet
  #191 = Methodref          #189.#3       // java/util/HashSet."<init>":()V
  #192 = String             #193          // ,
  #193 = Utf8               ,
  #194 = Methodref          #176.#195     // java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
  #195 = NameAndType        #196:#197     // split:(Ljava/lang/String;)[Ljava/lang/String;
  #196 = Utf8               split
  #197 = Utf8               (Ljava/lang/String;)[Ljava/lang/String;
  #198 = Methodref          #199.#200     // java/util/Arrays.stream:([Ljava/lang/Object;)Ljava/util/stream/Stream;
  #199 = Class              #201          // java/util/Arrays
  #200 = NameAndType        #202:#203     // stream:([Ljava/lang/Object;)Ljava/util/stream/Stream;
  #201 = Utf8               java/util/Arrays
  #202 = Utf8               stream
  #203 = Utf8               ([Ljava/lang/Object;)Ljava/util/stream/Stream;
  #204 = InvokeDynamic      #4:#205       // #4:apply:()Ljava/util/function/Function;
  #205 = NameAndType        #206:#207     // apply:()Ljava/util/function/Function;
  #206 = Utf8               apply
  #207 = Utf8               ()Ljava/util/function/Function;
  #208 = InterfaceMethodref #209.#210     // java/util/stream/Stream.map:(Ljava/util/function/Function;)Ljava/util/stream/Stream;
  #209 = Class              #211          // java/util/stream/Stream
  #210 = NameAndType        #212:#213     // map:(Ljava/util/function/Function;)Ljava/util/stream/Stream;
  #211 = Utf8               java/util/stream/Stream
  #212 = Utf8               map
  #213 = Utf8               (Ljava/util/function/Function;)Ljava/util/stream/Stream;
  #214 = InvokeDynamic      #5:#215       // #5:test:()Ljava/util/function/Predicate;
  #215 = NameAndType        #216:#217     // test:()Ljava/util/function/Predicate;
  #216 = Utf8               test
  #217 = Utf8               ()Ljava/util/function/Predicate;
  #218 = InterfaceMethodref #209.#219     // java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
  #219 = NameAndType        #220:#221     // filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
  #220 = Utf8               filter
  #221 = Utf8               (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
  #222 = InvokeDynamic      #6:#223       // #6:applyAsInt:()Ljava/util/function/ToIntFunction;
  #223 = NameAndType        #224:#225     // applyAsInt:()Ljava/util/function/ToIntFunction;
  #224 = Utf8               applyAsInt
  #225 = Utf8               ()Ljava/util/function/ToIntFunction;
  #226 = InterfaceMethodref #209.#227     // java/util/stream/Stream.mapToInt:(Ljava/util/function/ToIntFunction;)Ljava/util/stream/IntStream;
  #227 = NameAndType        #228:#229     // mapToInt:(Ljava/util/function/ToIntFunction;)Ljava/util/stream/IntStream;
  #228 = Utf8               mapToInt
  #229 = Utf8               (Ljava/util/function/ToIntFunction;)Ljava/util/stream/IntStream;
  #230 = Methodref          #231.#232     // java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
  #231 = Class              #233          // java/util/Objects
  #232 = NameAndType        #234:#81      // requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
  #233 = Utf8               java/util/Objects
  #234 = Utf8               requireNonNull
  #235 = InvokeDynamic      #7:#236       // #7:accept:(Ljava/util/Set;)Ljava/util/function/IntConsumer;
  #236 = NameAndType        #64:#237      // accept:(Ljava/util/Set;)Ljava/util/function/IntConsumer;
  #237 = Utf8               (Ljava/util/Set;)Ljava/util/function/IntConsumer;
  #238 = InterfaceMethodref #239.#240     // java/util/stream/IntStream.forEach:(Ljava/util/function/IntConsumer;)V
  #239 = Class              #241          // java/util/stream/IntStream
  #240 = NameAndType        #68:#242      // forEach:(Ljava/util/function/IntConsumer;)V
  #241 = Utf8               java/util/stream/IntStream
  #242 = Utf8               (Ljava/util/function/IntConsumer;)V
  #243 = Class              #244          // ext/mods/commons/data/xml/IXmlReader
  #244 = Utf8               ext/mods/commons/data/xml/IXmlReader
  #245 = Utf8               Signature
  #246 = Utf8               Ljava/util/Map<Lext/mods/gameserver/enums/items/CrystalType;Lext/mods/commons/data/StatSet;>;
  #247 = Utf8               Ljava/util/Map<Lext/mods/gameserver/enums/items/CrystalType;Ljava/util/Set<Ljava/lang/Integer;>;>;
  #248 = Utf8               Code
  #249 = Utf8               LineNumberTable
  #250 = Utf8               LocalVariableTable
  #251 = Utf8               this
  #252 = Utf8               parseDocument
  #253 = Utf8               (Lorg/w3c/dom/Document;Ljava/nio/file/Path;)V
  #254 = Utf8               doc
  #255 = Utf8               Lorg/w3c/dom/Document;
  #256 = Utf8               path
  #257 = Utf8               Ljava/nio/file/Path;
  #258 = Utf8               isEnabled
  #259 = Utf8               shouldAnnounce
  #260 = Utf8               (Lext/mods/gameserver/model/item/kind/Item;)Z
  #261 = Utf8               item
  #262 = Utf8               Lext/mods/gameserver/model/item/kind/Item;
  #263 = Utf8               Lext/mods/gameserver/enums/items/CrystalType;
  #264 = Utf8               set
  #265 = Utf8               Lext/mods/commons/data/StatSet;
  #266 = Utf8               Ljava/util/Set;
  #267 = Utf8               LocalVariableTypeTable
  #268 = Utf8               Ljava/util/Set<Ljava/lang/Integer;>;
  #269 = Utf8               StackMapTable
  #270 = Utf8               getMessageTemplate
  #271 = Utf8               (Lext/mods/gameserver/model/item/kind/Item;)Ljava/lang/String;
  #272 = Utf8               getInstance
  #273 = Utf8               ()Lext/mods/gameserver/custom/data/RaidDropAnnounceData;
  #274 = Utf8               lambda$parseDocument$0
  #275 = Utf8               (Ljava/nio/file/Path;Lorg/w3c/dom/Node;)V
  #276 = Utf8               listNode
  #277 = Utf8               Lorg/w3c/dom/Node;
  #278 = Utf8               lambda$parseDocument$1
  #279 = Utf8               e
  #280 = Utf8               Ljava/lang/IllegalArgumentException;
  #281 = Utf8               node
  #282 = Utf8               itemIdsStr
  #283 = Utf8               Ljava/lang/String;
  #284 = Utf8               lambda$parseDocument$2
  #285 = Utf8               s
  #286 = Utf8               SourceFile
  #287 = Utf8               RaidDropAnnounceData.java
  #288 = Utf8               NestMembers
  #289 = Utf8               BootstrapMethods
  #290 = String             #291          // \u0001: Loaded raid drop announce configuration.
  #291 = Utf8               \u0001: Loaded raid drop announce configuration.
  #292 = MethodType         #59           //  (Ljava/lang/Object;)V
  #293 = MethodHandle       5:#294        // REF_invokeVirtual ext/mods/gameserver/custom/data/RaidDropAnnounceData.lambda$parseDocument$0:(Ljava/nio/file/Path;Lorg/w3c/dom/Node;)V
  #294 = Methodref          #8.#295       // ext/mods/gameserver/custom/data/RaidDropAnnounceData.lambda$parseDocument$0:(Ljava/nio/file/Path;Lorg/w3c/dom/Node;)V
  #295 = NameAndType        #274:#275     // lambda$parseDocument$0:(Ljava/nio/file/Path;Lorg/w3c/dom/Node;)V
  #296 = MethodType         #297          //  (Lorg/w3c/dom/Node;)V
  #297 = Utf8               (Lorg/w3c/dom/Node;)V
  #298 = MethodHandle       5:#299        // REF_invokeVirtual ext/mods/gameserver/custom/data/RaidDropAnnounceData.lambda$parseDocument$1:(Ljava/nio/file/Path;Lorg/w3c/dom/Node;)V
  #299 = Methodref          #8.#300       // ext/mods/gameserver/custom/data/RaidDropAnnounceData.lambda$parseDocument$1:(Ljava/nio/file/Path;Lorg/w3c/dom/Node;)V
  #300 = NameAndType        #278:#275     // lambda$parseDocument$1:(Ljava/nio/file/Path;Lorg/w3c/dom/Node;)V
  #301 = String             #302          // \u0001: Invalid crystal grade \'\u0001\' in \u0001
  #302 = Utf8               \u0001: Invalid crystal grade \'\u0001\' in \u0001
  #303 = MethodType         #81           //  (Ljava/lang/Object;)Ljava/lang/Object;
  #304 = MethodHandle       5:#305        // REF_invokeVirtual java/lang/String.trim:()Ljava/lang/String;
  #305 = Methodref          #176.#306     // java/lang/String.trim:()Ljava/lang/String;
  #306 = NameAndType        #307:#49      // trim:()Ljava/lang/String;
  #307 = Utf8               trim
  #308 = MethodType         #53           //  (Ljava/lang/String;)Ljava/lang/String;
  #309 = MethodType         #109          //  (Ljava/lang/Object;)Z
  #310 = MethodHandle       6:#311        // REF_invokeStatic ext/mods/gameserver/custom/data/RaidDropAnnounceData.lambda$parseDocument$2:(Ljava/lang/String;)Z
  #311 = Methodref          #8.#312       // ext/mods/gameserver/custom/data/RaidDropAnnounceData.lambda$parseDocument$2:(Ljava/lang/String;)Z
  #312 = NameAndType        #284:#145     // lambda$parseDocument$2:(Ljava/lang/String;)Z
  #313 = MethodType         #145          //  (Ljava/lang/String;)Z
  #314 = MethodType         #315          //  (Ljava/lang/Object;)I
  #315 = Utf8               (Ljava/lang/Object;)I
  #316 = MethodHandle       6:#317        // REF_invokeStatic java/lang/Integer.parseInt:(Ljava/lang/String;)I
  #317 = Methodref          #101.#318     // java/lang/Integer.parseInt:(Ljava/lang/String;)I
  #318 = NameAndType        #319:#320     // parseInt:(Ljava/lang/String;)I
  #319 = Utf8               parseInt
  #320 = Utf8               (Ljava/lang/String;)I
  #321 = MethodType         #320          //  (Ljava/lang/String;)I
  #322 = MethodType         #323          //  (I)V
  #323 = Utf8               (I)V
  #324 = MethodHandle       9:#325        // REF_invokeInterface java/util/Set.add:(Ljava/lang/Object;)Z
  #325 = InterfaceMethodref #90.#326      // java/util/Set.add:(Ljava/lang/Object;)Z
  #326 = NameAndType        #327:#109     // add:(Ljava/lang/Object;)Z
  #327 = Utf8               add
  #328 = MethodHandle       6:#329        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #329 = Methodref          #330.#331     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #330 = Class              #332          // java/lang/invoke/StringConcatFactory
  #331 = NameAndType        #52:#333      // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #332 = Utf8               java/lang/invoke/StringConcatFactory
  #333 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #334 = MethodHandle       6:#335        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #335 = Methodref          #336.#337     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #336 = Class              #338          // java/lang/invoke/LambdaMetafactory
  #337 = NameAndType        #339:#340     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #338 = Utf8               java/lang/invoke/LambdaMetafactory
  #339 = Utf8               metafactory
  #340 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #341 = Utf8               InnerClasses
  #342 = Utf8               SingletonHolder
  #343 = Class              #344          // java/lang/invoke/MethodHandles$Lookup
  #344 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #345 = Class              #346          // java/lang/invoke/MethodHandles
  #346 = Utf8               java/lang/invoke/MethodHandles
  #347 = Utf8               Lookup
{
  protected ext.mods.gameserver.custom.data.RaidDropAnnounceData();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=4, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: iconst_0
         6: putfield      #7                  // Field enabled:Z
         9: aload_0
        10: new           #13                 // class java/util/EnumMap
        13: dup
        14: ldc           #15                 // class ext/mods/gameserver/enums/items/CrystalType
        16: invokespecial #17                 // Method java/util/EnumMap."<init>":(Ljava/lang/Class;)V
        19: putfield      #20                 // Field gradeMap:Ljava/util/Map;
        22: aload_0
        23: new           #13                 // class java/util/EnumMap
        26: dup
        27: ldc           #15                 // class ext/mods/gameserver/enums/items/CrystalType
        29: invokespecial #17                 // Method java/util/EnumMap."<init>":(Ljava/lang/Class;)V
        32: putfield      #24                 // Field gradeItemIdMap:Ljava/util/Map;
        35: aload_0
        36: invokevirtual #27                 // Method load:()V
        39: return
      LineNumberTable:
        line 42: 0
        line 37: 4
        line 38: 9
        line 39: 22
        line 43: 35
        line 44: 39
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      40     0  this   Lext/mods/gameserver/custom/data/RaidDropAnnounceData;

  public void load();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: ldc           #30                 // String custom/mods/raid_drop_announce.xml
         3: invokevirtual #32                 // Method parseDataFile:(Ljava/lang/String;)V
         6: getstatic     #36                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
         9: aload_0
        10: invokevirtual #40                 // Method java/lang/Object.getClass:()Ljava/lang/Class;
        13: invokevirtual #44                 // Method java/lang/Class.getSimpleName:()Ljava/lang/String;
        16: invokedynamic #50,  0             // InvokeDynamic #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
        21: invokevirtual #54                 // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;)V
        24: return
      LineNumberTable:
        line 49: 0
        line 50: 6
        line 51: 24
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      25     0  this   Lext/mods/gameserver/custom/data/RaidDropAnnounceData;

  public void parseDocument(org.w3c.dom.Document, java.nio.file.Path);
    descriptor: (Lorg/w3c/dom/Document;Ljava/nio/file/Path;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: ldc           #60                 // String list
         4: aload_0
         5: aload_2
         6: invokedynamic #62,  0             // InvokeDynamic #1:accept:(Lext/mods/gameserver/custom/data/RaidDropAnnounceData;Ljava/nio/file/Path;)Ljava/util/function/Consumer;
        11: invokevirtual #66                 // Method forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
        14: return
      LineNumberTable:
        line 56: 0
        line 84: 14
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      15     0  this   Lext/mods/gameserver/custom/data/RaidDropAnnounceData;
            0      15     1   doc   Lorg/w3c/dom/Document;
            0      15     2  path   Ljava/nio/file/Path;

  public boolean isEnabled();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #7                  // Field enabled:Z
         4: ireturn
      LineNumberTable:
        line 88: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/custom/data/RaidDropAnnounceData;

  public boolean shouldAnnounce(ext.mods.gameserver.model.item.kind.Item);
    descriptor: (Lext/mods/gameserver/model/item/kind/Item;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=5, args_size=2
         0: aload_1
         1: ifnonnull     6
         4: iconst_0
         5: ireturn
         6: aload_1
         7: invokevirtual #70                 // Method ext/mods/gameserver/model/item/kind/Item.getCrystalType:()Lext/mods/gameserver/enums/items/CrystalType;
        10: astore_2
        11: aload_0
        12: getfield      #20                 // Field gradeMap:Ljava/util/Map;
        15: aload_2
        16: invokeinterface #76,  2           // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        21: checkcast     #82                 // class ext/mods/commons/data/StatSet
        24: astore_3
        25: aload_3
        26: ifnull        39
        29: aload_3
        30: ldc           #84                 // String announce
        32: iconst_0
        33: invokevirtual #86                 // Method ext/mods/commons/data/StatSet.getBool:(Ljava/lang/String;Z)Z
        36: ifne          41
        39: iconst_0
        40: ireturn
        41: aload_0
        42: getfield      #24                 // Field gradeItemIdMap:Ljava/util/Map;
        45: aload_2
        46: invokeinterface #76,  2           // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        51: checkcast     #90                 // class java/util/Set
        54: astore        4
        56: aload         4
        58: ifnull        71
        61: aload         4
        63: invokeinterface #92,  1           // InterfaceMethod java/util/Set.isEmpty:()Z
        68: ifeq          73
        71: iconst_1
        72: ireturn
        73: aload         4
        75: aload_1
        76: invokevirtual #96                 // Method ext/mods/gameserver/model/item/kind/Item.getItemId:()I
        79: invokestatic  #100                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        82: invokeinterface #106,  2          // InterfaceMethod java/util/Set.contains:(Ljava/lang/Object;)Z
        87: ireturn
      LineNumberTable:
        line 93: 0
        line 94: 4
        line 96: 6
        line 97: 11
        line 98: 25
        line 99: 39
        line 101: 41
        line 102: 56
        line 103: 71
        line 105: 73
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      88     0  this   Lext/mods/gameserver/custom/data/RaidDropAnnounceData;
            0      88     1  item   Lext/mods/gameserver/model/item/kind/Item;
           11      77     2 grade   Lext/mods/gameserver/enums/items/CrystalType;
           25      63     3   set   Lext/mods/commons/data/StatSet;
           56      32     4 itemIds   Ljava/util/Set;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
           56      32     4 itemIds   Ljava/util/Set<Ljava/lang/Integer;>;
      StackMapTable: number_of_entries = 5
        frame_type = 6 /* same */
        frame_type = 253 /* append */
          offset_delta = 32
          locals = [ class ext/mods/gameserver/enums/items/CrystalType, class ext/mods/commons/data/StatSet ]
        frame_type = 1 /* same */
        frame_type = 252 /* append */
          offset_delta = 29
          locals = [ class java/util/Set ]
        frame_type = 1 /* same */

  public java.lang.String getMessageTemplate(ext.mods.gameserver.model.item.kind.Item);
    descriptor: (Lext/mods/gameserver/model/item/kind/Item;)Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=4, args_size=2
         0: aload_1
         1: ifnonnull     7
         4: ldc           #110                // String
         6: areturn
         7: aload_1
         8: invokevirtual #70                 // Method ext/mods/gameserver/model/item/kind/Item.getCrystalType:()Lext/mods/gameserver/enums/items/CrystalType;
        11: astore_2
        12: aload_0
        13: getfield      #20                 // Field gradeMap:Ljava/util/Map;
        16: aload_2
        17: invokeinterface #76,  2           // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        22: checkcast     #82                 // class ext/mods/commons/data/StatSet
        25: astore_3
        26: aload_3
        27: ifnull        41
        30: aload_3
        31: ldc           #112                // String message
        33: ldc           #110                // String
        35: invokevirtual #114                // Method ext/mods/commons/data/StatSet.getString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        38: goto          43
        41: ldc           #110                // String
        43: areturn
      LineNumberTable:
        line 110: 0
        line 111: 4
        line 113: 7
        line 114: 12
        line 115: 26
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      44     0  this   Lext/mods/gameserver/custom/data/RaidDropAnnounceData;
            0      44     1  item   Lext/mods/gameserver/model/item/kind/Item;
           12      32     2 grade   Lext/mods/gameserver/enums/items/CrystalType;
           26      18     3   set   Lext/mods/commons/data/StatSet;
      StackMapTable: number_of_entries = 3
        frame_type = 7 /* same */
        frame_type = 253 /* append */
          offset_delta = 33
          locals = [ class ext/mods/gameserver/enums/items/CrystalType, class ext/mods/commons/data/StatSet ]
        frame_type = 65 /* same_locals_1_stack_item */
          stack = [ class java/lang/String ]

  public static ext.mods.gameserver.custom.data.RaidDropAnnounceData getInstance();
    descriptor: ()Lext/mods/gameserver/custom/data/RaidDropAnnounceData;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #118                // Field ext/mods/gameserver/custom/data/RaidDropAnnounceData$SingletonHolder.INSTANCE:Lext/mods/gameserver/custom/data/RaidDropAnnounceData;
         3: areturn
      LineNumberTable:
        line 121: 0
}
SourceFile: "RaidDropAnnounceData.java"
NestMembers:
  ext/mods/gameserver/custom/data/RaidDropAnnounceData$SingletonHolder
BootstrapMethods:
  0: #328 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #290 \u0001: Loaded raid drop announce configuration.
  1: #334 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #292 (Ljava/lang/Object;)V
      #293 REF_invokeVirtual ext/mods/gameserver/custom/data/RaidDropAnnounceData.lambda$parseDocument$0:(Ljava/nio/file/Path;Lorg/w3c/dom/Node;)V
      #296 (Lorg/w3c/dom/Node;)V
  2: #334 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #292 (Ljava/lang/Object;)V
      #298 REF_invokeVirtual ext/mods/gameserver/custom/data/RaidDropAnnounceData.lambda$parseDocument$1:(Ljava/nio/file/Path;Lorg/w3c/dom/Node;)V
      #296 (Lorg/w3c/dom/Node;)V
  3: #328 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #301 \u0001: Invalid crystal grade \'\u0001\' in \u0001
  4: #334 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #303 (Ljava/lang/Object;)Ljava/lang/Object;
      #304 REF_invokeVirtual java/lang/String.trim:()Ljava/lang/String;
      #308 (Ljava/lang/String;)Ljava/lang/String;
  5: #334 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #309 (Ljava/lang/Object;)Z
      #310 REF_invokeStatic ext/mods/gameserver/custom/data/RaidDropAnnounceData.lambda$parseDocument$2:(Ljava/lang/String;)Z
      #313 (Ljava/lang/String;)Z
  6: #334 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #314 (Ljava/lang/Object;)I
      #316 REF_invokeStatic java/lang/Integer.parseInt:(Ljava/lang/String;)I
      #321 (Ljava/lang/String;)I
  7: #334 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #322 (I)V
      #324 REF_invokeInterface java/util/Set.add:(Ljava/lang/Object;)Z
      #322 (I)V
InnerClasses:
  public static final #347= #343 of #345; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
