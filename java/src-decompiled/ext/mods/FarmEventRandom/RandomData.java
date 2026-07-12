// Bytecode for: ext.mods.FarmEventRandom.RandomData
// File: ext\mods\FarmEventRandom\RandomData.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/FarmEventRandom/RandomData.class
  Last modified 9 de jul de 2026; size 8580 bytes
  MD5 checksum 60baf789376cd895817946340a11ff6c
  Compiled from "RandomData.java"
public class ext.mods.FarmEventRandom.RandomData implements ext.mods.commons.data.xml.IXmlReader
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #11                         // ext/mods/FarmEventRandom/RandomData
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 4, methods: 18, attributes: 4
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
   #10 = Fieldref           #11.#12       // ext/mods/FarmEventRandom/RandomData._configs:Ljava/util/List;
   #11 = Class              #13           // ext/mods/FarmEventRandom/RandomData
   #12 = NameAndType        #14:#15       // _configs:Ljava/util/List;
   #13 = Utf8               ext/mods/FarmEventRandom/RandomData
   #14 = Utf8               _configs
   #15 = Utf8               Ljava/util/List;
   #16 = Class              #17           // java/util/HashMap
   #17 = Utf8               java/util/HashMap
   #18 = Methodref          #16.#3        // java/util/HashMap."<init>":()V
   #19 = Fieldref           #11.#20       // ext/mods/FarmEventRandom/RandomData._zoneDataMap:Ljava/util/Map;
   #20 = NameAndType        #21:#22       // _zoneDataMap:Ljava/util/Map;
   #21 = Utf8               _zoneDataMap
   #22 = Utf8               Ljava/util/Map;
   #23 = Fieldref           #11.#24       // ext/mods/FarmEventRandom/RandomData._messages:Ljava/util/Map;
   #24 = NameAndType        #25:#22       // _messages:Ljava/util/Map;
   #25 = Utf8               _messages
   #26 = Methodref          #11.#27       // ext/mods/FarmEventRandom/RandomData.load:()V
   #27 = NameAndType        #28:#6        // load:()V
   #28 = Utf8               load
   #29 = InterfaceMethodref #30.#31       // java/util/List.clear:()V
   #30 = Class              #32           // java/util/List
   #31 = NameAndType        #33:#6        // clear:()V
   #32 = Utf8               java/util/List
   #33 = Utf8               clear
   #34 = InterfaceMethodref #35.#31       // java/util/Map.clear:()V
   #35 = Class              #36           // java/util/Map
   #36 = Utf8               java/util/Map
   #37 = String             #38           // custom/mods/random_event.xml
   #38 = Utf8               custom/mods/random_event.xml
   #39 = Methodref          #11.#40       // ext/mods/FarmEventRandom/RandomData.parseDataFile:(Ljava/lang/String;)V
   #40 = NameAndType        #41:#42       // parseDataFile:(Ljava/lang/String;)V
   #41 = Utf8               parseDataFile
   #42 = Utf8               (Ljava/lang/String;)V
   #43 = Fieldref           #11.#44       // ext/mods/FarmEventRandom/RandomData.LOGGER:Lext/mods/commons/logging/CLogger;
   #44 = NameAndType        #45:#46       // LOGGER:Lext/mods/commons/logging/CLogger;
   #45 = Utf8               LOGGER
   #46 = Utf8               Lext/mods/commons/logging/CLogger;
   #47 = InterfaceMethodref #30.#48       // java/util/List.size:()I
   #48 = NameAndType        #49:#50       // size:()I
   #49 = Utf8               size
   #50 = Utf8               ()I
   #51 = InvokeDynamic      #0:#52        // #0:makeConcatWithConstants:(I)Ljava/lang/String;
   #52 = NameAndType        #53:#54       // makeConcatWithConstants:(I)Ljava/lang/String;
   #53 = Utf8               makeConcatWithConstants
   #54 = Utf8               (I)Ljava/lang/String;
   #55 = Methodref          #56.#57       // ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;)V
   #56 = Class              #58           // ext/mods/commons/logging/CLogger
   #57 = NameAndType        #59:#60       // info:(Ljava/lang/Object;)V
   #58 = Utf8               ext/mods/commons/logging/CLogger
   #59 = Utf8               info
   #60 = Utf8               (Ljava/lang/Object;)V
   #61 = String             #62           // ramdoms
   #62 = Utf8               ramdoms
   #63 = InvokeDynamic      #1:#64        // #1:accept:(Lext/mods/FarmEventRandom/RandomData;)Ljava/util/function/Consumer;
   #64 = NameAndType        #65:#66       // accept:(Lext/mods/FarmEventRandom/RandomData;)Ljava/util/function/Consumer;
   #65 = Utf8               accept
   #66 = Utf8               (Lext/mods/FarmEventRandom/RandomData;)Ljava/util/function/Consumer;
   #67 = Methodref          #11.#68       // ext/mods/FarmEventRandom/RandomData.forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
   #68 = NameAndType        #69:#70       // forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
   #69 = Utf8               forEach
   #70 = Utf8               (Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
   #71 = InterfaceMethodref #30.#72       // java/util/List.isEmpty:()Z
   #72 = NameAndType        #73:#74       // isEmpty:()Z
   #73 = Utf8               isEmpty
   #74 = Utf8               ()Z
   #75 = String             #76           // RandomData: No event configs loaded.
   #76 = Utf8               RandomData: No event configs loaded.
   #77 = Methodref          #56.#78       // ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;)V
   #78 = NameAndType        #79:#60       // warn:(Ljava/lang/Object;)V
   #79 = Utf8               warn
   #80 = InterfaceMethodref #30.#81       // java/util/List.get:(I)Ljava/lang/Object;
   #81 = NameAndType        #82:#83       // get:(I)Ljava/lang/Object;
   #82 = Utf8               get
   #83 = Utf8               (I)Ljava/lang/Object;
   #84 = Class              #85           // ext/mods/FarmEventRandom/holder/RamdomConfig
   #85 = Utf8               ext/mods/FarmEventRandom/holder/RamdomConfig
   #86 = InterfaceMethodref #35.#87       // java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
   #87 = NameAndType        #82:#88       // get:(Ljava/lang/Object;)Ljava/lang/Object;
   #88 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
   #89 = Methodref          #90.#91       // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
   #90 = Class              #92           // java/lang/Integer
   #91 = NameAndType        #93:#94       // valueOf:(I)Ljava/lang/Integer;
   #92 = Utf8               java/lang/Integer
   #93 = Utf8               valueOf
   #94 = Utf8               (I)Ljava/lang/Integer;
   #95 = Class              #96           // ext/mods/FarmEventRandom/holder/RandomZoneData
   #96 = Utf8               ext/mods/FarmEventRandom/holder/RandomZoneData
   #97 = Methodref          #98.#99       // java/util/Collections.emptyList:()Ljava/util/List;
   #98 = Class              #100          // java/util/Collections
   #99 = NameAndType        #101:#102     // emptyList:()Ljava/util/List;
  #100 = Utf8               java/util/Collections
  #101 = Utf8               emptyList
  #102 = Utf8               ()Ljava/util/List;
  #103 = InterfaceMethodref #35.#104      // java/util/Map.values:()Ljava/util/Collection;
  #104 = NameAndType        #105:#106     // values:()Ljava/util/Collection;
  #105 = Utf8               values
  #106 = Utf8               ()Ljava/util/Collection;
  #107 = Class              #108          // ext/mods/FarmEventRandom/holder/MessagesHolder
  #108 = Utf8               ext/mods/FarmEventRandom/holder/MessagesHolder
  #109 = Fieldref           #110.#111     // ext/mods/FarmEventRandom/RandomData$SingletonHolder._instance:Lext/mods/FarmEventRandom/RandomData;
  #110 = Class              #112          // ext/mods/FarmEventRandom/RandomData$SingletonHolder
  #111 = NameAndType        #113:#114     // _instance:Lext/mods/FarmEventRandom/RandomData;
  #112 = Utf8               ext/mods/FarmEventRandom/RandomData$SingletonHolder
  #113 = Utf8               _instance
  #114 = Utf8               Lext/mods/FarmEventRandom/RandomData;
  #115 = String             #116          // event
  #116 = Utf8               event
  #117 = InvokeDynamic      #2:#64        // #2:accept:(Lext/mods/FarmEventRandom/RandomData;)Ljava/util/function/Consumer;
  #118 = String             #119          // configs
  #119 = Utf8               configs
  #120 = InvokeDynamic      #3:#121       // #3:accept:(Lext/mods/FarmEventRandom/RandomData;[Lext/mods/FarmEventRandom/holder/RamdomConfig;)Ljava/util/function/Consumer;
  #121 = NameAndType        #65:#122      // accept:(Lext/mods/FarmEventRandom/RandomData;[Lext/mods/FarmEventRandom/holder/RamdomConfig;)Ljava/util/function/Consumer;
  #122 = Utf8               (Lext/mods/FarmEventRandom/RandomData;[Lext/mods/FarmEventRandom/holder/RamdomConfig;)Ljava/util/function/Consumer;
  #123 = String             #124          // RandomData: Found <event> tag with no <configs>. Skipping.
  #124 = Utf8               RandomData: Found <event> tag with no <configs>. Skipping.
  #125 = Methodref          #84.#126      // ext/mods/FarmEventRandom/holder/RamdomConfig.getName:()Ljava/lang/String;
  #126 = NameAndType        #127:#128     // getName:()Ljava/lang/String;
  #127 = Utf8               getName
  #128 = Utf8               ()Ljava/lang/String;
  #129 = String             #130          // messages
  #130 = Utf8               messages
  #131 = InvokeDynamic      #4:#132       // #4:accept:(Lext/mods/FarmEventRandom/RandomData;Ljava/lang/String;)Ljava/util/function/Consumer;
  #132 = NameAndType        #65:#133      // accept:(Lext/mods/FarmEventRandom/RandomData;Ljava/lang/String;)Ljava/util/function/Consumer;
  #133 = Utf8               (Lext/mods/FarmEventRandom/RandomData;Ljava/lang/String;)Ljava/util/function/Consumer;
  #134 = String             #135          // spawns
  #135 = Utf8               spawns
  #136 = InvokeDynamic      #5:#137       // #5:accept:(Lext/mods/FarmEventRandom/RandomData;Ljava/util/Map;)Ljava/util/function/Consumer;
  #137 = NameAndType        #65:#138      // accept:(Lext/mods/FarmEventRandom/RandomData;Ljava/util/Map;)Ljava/util/function/Consumer;
  #138 = Utf8               (Lext/mods/FarmEventRandom/RandomData;Ljava/util/Map;)Ljava/util/function/Consumer;
  #139 = InterfaceMethodref #35.#140      // java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #140 = NameAndType        #141:#142     // put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #141 = Utf8               put
  #142 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #143 = Methodref          #11.#144      // ext/mods/FarmEventRandom/RandomData.parseAttributes:(Lorg/w3c/dom/Node;)Lext/mods/commons/data/StatSet;
  #144 = NameAndType        #145:#146     // parseAttributes:(Lorg/w3c/dom/Node;)Lext/mods/commons/data/StatSet;
  #145 = Utf8               parseAttributes
  #146 = Utf8               (Lorg/w3c/dom/Node;)Lext/mods/commons/data/StatSet;
  #147 = String             #148          // zoneId
  #148 = Utf8               zoneId
  #149 = Methodref          #150.#151     // ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
  #150 = Class              #152          // ext/mods/commons/data/StatSet
  #151 = NameAndType        #153:#154     // getInteger:(Ljava/lang/String;)I
  #152 = Utf8               ext/mods/commons/data/StatSet
  #153 = Utf8               getInteger
  #154 = Utf8               (Ljava/lang/String;)I
  #155 = Methodref          #95.#156      // ext/mods/FarmEventRandom/holder/RandomZoneData."<init>":(Lext/mods/commons/data/StatSet;)V
  #156 = NameAndType        #5:#157       // "<init>":(Lext/mods/commons/data/StatSet;)V
  #157 = Utf8               (Lext/mods/commons/data/StatSet;)V
  #158 = String             #159          // spawn
  #159 = Utf8               spawn
  #160 = InvokeDynamic      #6:#161       // #6:accept:(Lext/mods/FarmEventRandom/RandomData;Lext/mods/FarmEventRandom/holder/RandomZoneData;)Ljava/util/function/Consumer;
  #161 = NameAndType        #65:#162      // accept:(Lext/mods/FarmEventRandom/RandomData;Lext/mods/FarmEventRandom/holder/RandomZoneData;)Ljava/util/function/Consumer;
  #162 = Utf8               (Lext/mods/FarmEventRandom/RandomData;Lext/mods/FarmEventRandom/holder/RandomZoneData;)Ljava/util/function/Consumer;
  #163 = Class              #164          // ext/mods/FarmEventRandom/holder/RandomSpawnHolder
  #164 = Utf8               ext/mods/FarmEventRandom/holder/RandomSpawnHolder
  #165 = Methodref          #163.#156     // ext/mods/FarmEventRandom/holder/RandomSpawnHolder."<init>":(Lext/mods/commons/data/StatSet;)V
  #166 = Methodref          #95.#167      // ext/mods/FarmEventRandom/holder/RandomZoneData.addCustomSpawn:(Lext/mods/FarmEventRandom/holder/RandomSpawnHolder;)V
  #167 = NameAndType        #168:#169     // addCustomSpawn:(Lext/mods/FarmEventRandom/holder/RandomSpawnHolder;)V
  #168 = Utf8               addCustomSpawn
  #169 = Utf8               (Lext/mods/FarmEventRandom/holder/RandomSpawnHolder;)V
  #170 = Methodref          #107.#3       // ext/mods/FarmEventRandom/holder/MessagesHolder."<init>":()V
  #171 = String             #172          // message
  #172 = Utf8               message
  #173 = InvokeDynamic      #7:#174       // #7:accept:(Lext/mods/FarmEventRandom/RandomData;Lext/mods/FarmEventRandom/holder/MessagesHolder;)Ljava/util/function/Consumer;
  #174 = NameAndType        #65:#175      // accept:(Lext/mods/FarmEventRandom/RandomData;Lext/mods/FarmEventRandom/holder/MessagesHolder;)Ljava/util/function/Consumer;
  #175 = Utf8               (Lext/mods/FarmEventRandom/RandomData;Lext/mods/FarmEventRandom/holder/MessagesHolder;)Ljava/util/function/Consumer;
  #176 = String             #177          // onPrepare
  #177 = Utf8               onPrepare
  #178 = String             #179          //
  #179 = Utf8
  #180 = Methodref          #150.#181     // ext/mods/commons/data/StatSet.getString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #181 = NameAndType        #182:#183     // getString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #182 = Utf8               getString
  #183 = Utf8               (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #184 = Methodref          #107.#185     // ext/mods/FarmEventRandom/holder/MessagesHolder.addOnPrepare:(Ljava/lang/String;)V
  #185 = NameAndType        #186:#42      // addOnPrepare:(Ljava/lang/String;)V
  #186 = Utf8               addOnPrepare
  #187 = String             #188          // onStart
  #188 = Utf8               onStart
  #189 = Methodref          #107.#190     // ext/mods/FarmEventRandom/holder/MessagesHolder.addOnStart:(Ljava/lang/String;)V
  #190 = NameAndType        #191:#42      // addOnStart:(Ljava/lang/String;)V
  #191 = Utf8               addOnStart
  #192 = String             #193          // onZone
  #193 = Utf8               onZone
  #194 = Methodref          #107.#195     // ext/mods/FarmEventRandom/holder/MessagesHolder.addOnZone:(Ljava/lang/String;)V
  #195 = NameAndType        #196:#42      // addOnZone:(Ljava/lang/String;)V
  #196 = Utf8               addOnZone
  #197 = String             #198          // onEnd
  #198 = Utf8               onEnd
  #199 = Methodref          #107.#200     // ext/mods/FarmEventRandom/holder/MessagesHolder.addOnEnd:(Ljava/lang/String;)V
  #200 = NameAndType        #201:#42      // addOnEnd:(Ljava/lang/String;)V
  #201 = Utf8               addOnEnd
  #202 = String             #203          // onAuto
  #203 = Utf8               onAuto
  #204 = Methodref          #107.#205     // ext/mods/FarmEventRandom/holder/MessagesHolder.addOnAuto:(Ljava/lang/String;)V
  #205 = NameAndType        #206:#42      // addOnAuto:(Ljava/lang/String;)V
  #206 = Utf8               addOnAuto
  #207 = String             #208          // config
  #208 = Utf8               config
  #209 = InvokeDynamic      #8:#121       // #8:accept:(Lext/mods/FarmEventRandom/RandomData;[Lext/mods/FarmEventRandom/holder/RamdomConfig;)Ljava/util/function/Consumer;
  #210 = Methodref          #84.#156      // ext/mods/FarmEventRandom/holder/RamdomConfig."<init>":(Lext/mods/commons/data/StatSet;)V
  #211 = InterfaceMethodref #30.#212      // java/util/List.add:(Ljava/lang/Object;)Z
  #212 = NameAndType        #213:#214     // add:(Ljava/lang/Object;)Z
  #213 = Utf8               add
  #214 = Utf8               (Ljava/lang/Object;)Z
  #215 = Class              #216          // ext/mods/commons/data/xml/IXmlReader
  #216 = Utf8               ext/mods/commons/data/xml/IXmlReader
  #217 = Utf8               DEBUG
  #218 = Utf8               Z
  #219 = Utf8               ConstantValue
  #220 = Integer            0
  #221 = Utf8               Signature
  #222 = Utf8               Ljava/util/List<Lext/mods/FarmEventRandom/holder/RamdomConfig;>;
  #223 = Utf8               Ljava/util/Map<Ljava/lang/String;Ljava/util/Map<Ljava/lang/Integer;Lext/mods/FarmEventRandom/holder/RandomZoneData;>;>;
  #224 = Utf8               Ljava/util/Map<Ljava/lang/String;Lext/mods/FarmEventRandom/holder/MessagesHolder;>;
  #225 = Utf8               Code
  #226 = Utf8               LineNumberTable
  #227 = Utf8               LocalVariableTable
  #228 = Utf8               this
  #229 = Utf8               reload
  #230 = Utf8               parseDocument
  #231 = Utf8               (Lorg/w3c/dom/Document;Ljava/nio/file/Path;)V
  #232 = Utf8               doc
  #233 = Utf8               Lorg/w3c/dom/Document;
  #234 = Utf8               path
  #235 = Utf8               Ljava/nio/file/Path;
  #236 = Utf8               getFirstConfig
  #237 = Utf8               ()Lext/mods/FarmEventRandom/holder/RamdomConfig;
  #238 = Utf8               StackMapTable
  #239 = Utf8               getConfigs
  #240 = Utf8               ()Ljava/util/List<Lext/mods/FarmEventRandom/holder/RamdomConfig;>;
  #241 = Utf8               getZoneData
  #242 = Utf8               (Ljava/lang/String;I)Lext/mods/FarmEventRandom/holder/RandomZoneData;
  #243 = Utf8               eventName
  #244 = Utf8               Ljava/lang/String;
  #245 = Utf8               I
  #246 = Utf8               zones
  #247 = Utf8               LocalVariableTypeTable
  #248 = Utf8               Ljava/util/Map<Ljava/lang/Integer;Lext/mods/FarmEventRandom/holder/RandomZoneData;>;
  #249 = Utf8               getAllZoneData
  #250 = Utf8               (Ljava/lang/String;)Ljava/util/Collection;
  #251 = Utf8               (Ljava/lang/String;)Ljava/util/Collection<Lext/mods/FarmEventRandom/holder/RandomZoneData;>;
  #252 = Utf8               getMessages
  #253 = Utf8               (Ljava/lang/String;)Lext/mods/FarmEventRandom/holder/MessagesHolder;
  #254 = Utf8               getInstance
  #255 = Utf8               ()Lext/mods/FarmEventRandom/RandomData;
  #256 = Utf8               lambda$parseDocument$0
  #257 = Utf8               (Lorg/w3c/dom/Node;)V
  #258 = Utf8               eventsNode
  #259 = Utf8               Lorg/w3c/dom/Node;
  #260 = Utf8               lambda$parseDocument$1
  #261 = Utf8               eventNode
  #262 = Utf8               configHolder
  #263 = Utf8               [Lext/mods/FarmEventRandom/holder/RamdomConfig;
  #264 = Utf8               currentConfig
  #265 = Utf8               Lext/mods/FarmEventRandom/holder/RamdomConfig;
  #266 = Utf8               zoneData
  #267 = Class              #263          // "[Lext/mods/FarmEventRandom/holder/RamdomConfig;"
  #268 = Utf8               lambda$parseDocument$6
  #269 = Utf8               (Ljava/util/Map;Lorg/w3c/dom/Node;)V
  #270 = Utf8               spawnsNode
  #271 = Utf8               spawnAttrs
  #272 = Utf8               Lext/mods/commons/data/StatSet;
  #273 = Utf8               zData
  #274 = Utf8               Lext/mods/FarmEventRandom/holder/RandomZoneData;
  #275 = Utf8               lambda$parseDocument$7
  #276 = Utf8               (Lext/mods/FarmEventRandom/holder/RandomZoneData;Lorg/w3c/dom/Node;)V
  #277 = Utf8               spawnNode
  #278 = Utf8               sets
  #279 = Utf8               customSpawn
  #280 = Utf8               Lext/mods/FarmEventRandom/holder/RandomSpawnHolder;
  #281 = Utf8               lambda$parseDocument$4
  #282 = Utf8               (Ljava/lang/String;Lorg/w3c/dom/Node;)V
  #283 = Utf8               msgsNode
  #284 = Utf8               holder
  #285 = Utf8               Lext/mods/FarmEventRandom/holder/MessagesHolder;
  #286 = Utf8               lambda$parseDocument$5
  #287 = Utf8               (Lext/mods/FarmEventRandom/holder/MessagesHolder;Lorg/w3c/dom/Node;)V
  #288 = Utf8               msgNode
  #289 = Utf8               set2
  #290 = Utf8               lambda$parseDocument$2
  #291 = Utf8               ([Lext/mods/FarmEventRandom/holder/RamdomConfig;Lorg/w3c/dom/Node;)V
  #292 = Utf8               confisNode
  #293 = Utf8               lambda$parseDocument$3
  #294 = Utf8               configNode
  #295 = Utf8               set
  #296 = Utf8               SourceFile
  #297 = Utf8               RandomData.java
  #298 = Utf8               NestMembers
  #299 = Utf8               BootstrapMethods
  #300 = String             #301          // Loaded \u0001 random events.
  #301 = Utf8               Loaded \u0001 random events.
  #302 = MethodType         #60           //  (Ljava/lang/Object;)V
  #303 = MethodHandle       5:#304        // REF_invokeVirtual ext/mods/FarmEventRandom/RandomData.lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
  #304 = Methodref          #11.#305      // ext/mods/FarmEventRandom/RandomData.lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
  #305 = NameAndType        #256:#257     // lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
  #306 = MethodType         #257          //  (Lorg/w3c/dom/Node;)V
  #307 = MethodHandle       5:#308        // REF_invokeVirtual ext/mods/FarmEventRandom/RandomData.lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
  #308 = Methodref          #11.#309      // ext/mods/FarmEventRandom/RandomData.lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
  #309 = NameAndType        #260:#257     // lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
  #310 = MethodHandle       5:#311        // REF_invokeVirtual ext/mods/FarmEventRandom/RandomData.lambda$parseDocument$2:([Lext/mods/FarmEventRandom/holder/RamdomConfig;Lorg/w3c/dom/Node;)V
  #311 = Methodref          #11.#312      // ext/mods/FarmEventRandom/RandomData.lambda$parseDocument$2:([Lext/mods/FarmEventRandom/holder/RamdomConfig;Lorg/w3c/dom/Node;)V
  #312 = NameAndType        #290:#291     // lambda$parseDocument$2:([Lext/mods/FarmEventRandom/holder/RamdomConfig;Lorg/w3c/dom/Node;)V
  #313 = MethodHandle       5:#314        // REF_invokeVirtual ext/mods/FarmEventRandom/RandomData.lambda$parseDocument$4:(Ljava/lang/String;Lorg/w3c/dom/Node;)V
  #314 = Methodref          #11.#315      // ext/mods/FarmEventRandom/RandomData.lambda$parseDocument$4:(Ljava/lang/String;Lorg/w3c/dom/Node;)V
  #315 = NameAndType        #281:#282     // lambda$parseDocument$4:(Ljava/lang/String;Lorg/w3c/dom/Node;)V
  #316 = MethodHandle       5:#317        // REF_invokeVirtual ext/mods/FarmEventRandom/RandomData.lambda$parseDocument$6:(Ljava/util/Map;Lorg/w3c/dom/Node;)V
  #317 = Methodref          #11.#318      // ext/mods/FarmEventRandom/RandomData.lambda$parseDocument$6:(Ljava/util/Map;Lorg/w3c/dom/Node;)V
  #318 = NameAndType        #268:#269     // lambda$parseDocument$6:(Ljava/util/Map;Lorg/w3c/dom/Node;)V
  #319 = MethodHandle       5:#320        // REF_invokeVirtual ext/mods/FarmEventRandom/RandomData.lambda$parseDocument$7:(Lext/mods/FarmEventRandom/holder/RandomZoneData;Lorg/w3c/dom/Node;)V
  #320 = Methodref          #11.#321      // ext/mods/FarmEventRandom/RandomData.lambda$parseDocument$7:(Lext/mods/FarmEventRandom/holder/RandomZoneData;Lorg/w3c/dom/Node;)V
  #321 = NameAndType        #275:#276     // lambda$parseDocument$7:(Lext/mods/FarmEventRandom/holder/RandomZoneData;Lorg/w3c/dom/Node;)V
  #322 = MethodHandle       5:#323        // REF_invokeVirtual ext/mods/FarmEventRandom/RandomData.lambda$parseDocument$5:(Lext/mods/FarmEventRandom/holder/MessagesHolder;Lorg/w3c/dom/Node;)V
  #323 = Methodref          #11.#324      // ext/mods/FarmEventRandom/RandomData.lambda$parseDocument$5:(Lext/mods/FarmEventRandom/holder/MessagesHolder;Lorg/w3c/dom/Node;)V
  #324 = NameAndType        #286:#287     // lambda$parseDocument$5:(Lext/mods/FarmEventRandom/holder/MessagesHolder;Lorg/w3c/dom/Node;)V
  #325 = MethodHandle       5:#326        // REF_invokeVirtual ext/mods/FarmEventRandom/RandomData.lambda$parseDocument$3:([Lext/mods/FarmEventRandom/holder/RamdomConfig;Lorg/w3c/dom/Node;)V
  #326 = Methodref          #11.#327      // ext/mods/FarmEventRandom/RandomData.lambda$parseDocument$3:([Lext/mods/FarmEventRandom/holder/RamdomConfig;Lorg/w3c/dom/Node;)V
  #327 = NameAndType        #293:#291     // lambda$parseDocument$3:([Lext/mods/FarmEventRandom/holder/RamdomConfig;Lorg/w3c/dom/Node;)V
  #328 = MethodHandle       6:#329        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #329 = Methodref          #330.#331     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #330 = Class              #332          // java/lang/invoke/StringConcatFactory
  #331 = NameAndType        #53:#333      // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
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
  public ext.mods.FarmEventRandom.RandomData();
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
        12: putfield      #10                 // Field _configs:Ljava/util/List;
        15: aload_0
        16: new           #16                 // class java/util/HashMap
        19: dup
        20: invokespecial #18                 // Method java/util/HashMap."<init>":()V
        23: putfield      #19                 // Field _zoneDataMap:Ljava/util/Map;
        26: aload_0
        27: new           #16                 // class java/util/HashMap
        30: dup
        31: invokespecial #18                 // Method java/util/HashMap."<init>":()V
        34: putfield      #23                 // Field _messages:Ljava/util/Map;
        37: aload_0
        38: invokevirtual #26                 // Method load:()V
        41: return
      LineNumberTable:
        line 48: 0
        line 43: 4
        line 44: 15
        line 45: 26
        line 49: 37
        line 50: 41
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      42     0  this   Lext/mods/FarmEventRandom/RandomData;

  public void reload();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #10                 // Field _configs:Ljava/util/List;
         4: invokeinterface #29,  1           // InterfaceMethod java/util/List.clear:()V
         9: aload_0
        10: getfield      #19                 // Field _zoneDataMap:Ljava/util/Map;
        13: invokeinterface #34,  1           // InterfaceMethod java/util/Map.clear:()V
        18: aload_0
        19: getfield      #23                 // Field _messages:Ljava/util/Map;
        22: invokeinterface #34,  1           // InterfaceMethod java/util/Map.clear:()V
        27: aload_0
        28: invokevirtual #26                 // Method load:()V
        31: return
      LineNumberTable:
        line 54: 0
        line 55: 9
        line 56: 18
        line 57: 27
        line 58: 31
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      32     0  this   Lext/mods/FarmEventRandom/RandomData;

  public void load();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: ldc           #37                 // String custom/mods/random_event.xml
         3: invokevirtual #39                 // Method parseDataFile:(Ljava/lang/String;)V
         6: getstatic     #43                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
         9: aload_0
        10: getfield      #10                 // Field _configs:Ljava/util/List;
        13: invokeinterface #47,  1           // InterfaceMethod java/util/List.size:()I
        18: invokedynamic #51,  0             // InvokeDynamic #0:makeConcatWithConstants:(I)Ljava/lang/String;
        23: invokevirtual #55                 // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;)V
        26: return
      LineNumberTable:
        line 63: 0
        line 64: 6
        line 65: 26
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      27     0  this   Lext/mods/FarmEventRandom/RandomData;

  public void parseDocument(org.w3c.dom.Document, java.nio.file.Path);
    descriptor: (Lorg/w3c/dom/Document;Ljava/nio/file/Path;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: ldc           #61                 // String ramdoms
         4: aload_0
         5: invokedynamic #63,  0             // InvokeDynamic #1:accept:(Lext/mods/FarmEventRandom/RandomData;)Ljava/util/function/Consumer;
        10: invokevirtual #67                 // Method forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
        13: return
      LineNumberTable:
        line 70: 0
        line 133: 13
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0  this   Lext/mods/FarmEventRandom/RandomData;
            0      14     1   doc   Lorg/w3c/dom/Document;
            0      14     2  path   Ljava/nio/file/Path;

  public ext.mods.FarmEventRandom.holder.RamdomConfig getFirstConfig();
    descriptor: ()Lext/mods/FarmEventRandom/holder/RamdomConfig;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #10                 // Field _configs:Ljava/util/List;
         4: invokeinterface #71,  1           // InterfaceMethod java/util/List.isEmpty:()Z
         9: ifeq          22
        12: getstatic     #43                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
        15: ldc           #75                 // String RandomData: No event configs loaded.
        17: invokevirtual #77                 // Method ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;)V
        20: aconst_null
        21: areturn
        22: aload_0
        23: getfield      #10                 // Field _configs:Ljava/util/List;
        26: iconst_0
        27: invokeinterface #80,  2           // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
        32: checkcast     #84                 // class ext/mods/FarmEventRandom/holder/RamdomConfig
        35: areturn
      LineNumberTable:
        line 137: 0
        line 139: 12
        line 140: 20
        line 142: 22
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      36     0  this   Lext/mods/FarmEventRandom/RandomData;
      StackMapTable: number_of_entries = 1
        frame_type = 22 /* same */

  public java.util.List<ext.mods.FarmEventRandom.holder.RamdomConfig> getConfigs();
    descriptor: ()Ljava/util/List;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #10                 // Field _configs:Ljava/util/List;
         4: areturn
      LineNumberTable:
        line 147: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/FarmEventRandom/RandomData;
    Signature: #240                         // ()Ljava/util/List<Lext/mods/FarmEventRandom/holder/RamdomConfig;>;

  public ext.mods.FarmEventRandom.holder.RandomZoneData getZoneData(java.lang.String, int);
    descriptor: (Ljava/lang/String;I)Lext/mods/FarmEventRandom/holder/RandomZoneData;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=4, args_size=3
         0: aload_0
         1: getfield      #19                 // Field _zoneDataMap:Ljava/util/Map;
         4: aload_1
         5: invokeinterface #86,  2           // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        10: checkcast     #35                 // class java/util/Map
        13: astore_3
        14: aload_3
        15: ifnonnull     20
        18: aconst_null
        19: areturn
        20: aload_3
        21: iload_2
        22: invokestatic  #89                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        25: invokeinterface #86,  2           // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        30: checkcast     #95                 // class ext/mods/FarmEventRandom/holder/RandomZoneData
        33: areturn
      LineNumberTable:
        line 152: 0
        line 153: 14
        line 154: 18
        line 156: 20
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      34     0  this   Lext/mods/FarmEventRandom/RandomData;
            0      34     1 eventName   Ljava/lang/String;
            0      34     2 zoneId   I
           14      20     3 zones   Ljava/util/Map;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
           14      20     3 zones   Ljava/util/Map<Ljava/lang/Integer;Lext/mods/FarmEventRandom/holder/RandomZoneData;>;
      StackMapTable: number_of_entries = 1
        frame_type = 252 /* append */
          offset_delta = 20
          locals = [ class java/util/Map ]

  public java.util.Collection<ext.mods.FarmEventRandom.holder.RandomZoneData> getAllZoneData(java.lang.String);
    descriptor: (Ljava/lang/String;)Ljava/util/Collection;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=3, args_size=2
         0: aload_0
         1: getfield      #19                 // Field _zoneDataMap:Ljava/util/Map;
         4: aload_1
         5: invokeinterface #86,  2           // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        10: checkcast     #35                 // class java/util/Map
        13: astore_2
        14: aload_2
        15: ifnonnull     22
        18: invokestatic  #97                 // Method java/util/Collections.emptyList:()Ljava/util/List;
        21: areturn
        22: aload_2
        23: invokeinterface #103,  1          // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
        28: areturn
      LineNumberTable:
        line 167: 0
        line 168: 14
        line 170: 18
        line 172: 22
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      29     0  this   Lext/mods/FarmEventRandom/RandomData;
            0      29     1 eventName   Ljava/lang/String;
           14      15     2 zones   Ljava/util/Map;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
           14      15     2 zones   Ljava/util/Map<Ljava/lang/Integer;Lext/mods/FarmEventRandom/holder/RandomZoneData;>;
      StackMapTable: number_of_entries = 1
        frame_type = 252 /* append */
          offset_delta = 22
          locals = [ class java/util/Map ]
    Signature: #251                         // (Ljava/lang/String;)Ljava/util/Collection<Lext/mods/FarmEventRandom/holder/RandomZoneData;>;

  public ext.mods.FarmEventRandom.holder.MessagesHolder getMessages(java.lang.String);
    descriptor: (Ljava/lang/String;)Lext/mods/FarmEventRandom/holder/MessagesHolder;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #23                 // Field _messages:Ljava/util/Map;
         4: aload_1
         5: invokeinterface #86,  2           // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        10: checkcast     #107                // class ext/mods/FarmEventRandom/holder/MessagesHolder
        13: areturn
      LineNumberTable:
        line 178: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0  this   Lext/mods/FarmEventRandom/RandomData;
            0      14     1 eventName   Ljava/lang/String;

  public static ext.mods.FarmEventRandom.RandomData getInstance();
    descriptor: ()Lext/mods/FarmEventRandom/RandomData;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #109                // Field ext/mods/FarmEventRandom/RandomData$SingletonHolder._instance:Lext/mods/FarmEventRandom/RandomData;
         3: areturn
      LineNumberTable:
        line 183: 0
}
SourceFile: "RandomData.java"
NestMembers:
  ext/mods/FarmEventRandom/RandomData$SingletonHolder
BootstrapMethods:
  0: #328 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #300 Loaded \u0001 random events.
  1: #334 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #302 (Ljava/lang/Object;)V
      #303 REF_invokeVirtual ext/mods/FarmEventRandom/RandomData.lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
      #306 (Lorg/w3c/dom/Node;)V
  2: #334 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #302 (Ljava/lang/Object;)V
      #307 REF_invokeVirtual ext/mods/FarmEventRandom/RandomData.lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
      #306 (Lorg/w3c/dom/Node;)V
  3: #334 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #302 (Ljava/lang/Object;)V
      #310 REF_invokeVirtual ext/mods/FarmEventRandom/RandomData.lambda$parseDocument$2:([Lext/mods/FarmEventRandom/holder/RamdomConfig;Lorg/w3c/dom/Node;)V
      #306 (Lorg/w3c/dom/Node;)V
  4: #334 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #302 (Ljava/lang/Object;)V
      #313 REF_invokeVirtual ext/mods/FarmEventRandom/RandomData.lambda$parseDocument$4:(Ljava/lang/String;Lorg/w3c/dom/Node;)V
      #306 (Lorg/w3c/dom/Node;)V
  5: #334 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #302 (Ljava/lang/Object;)V
      #316 REF_invokeVirtual ext/mods/FarmEventRandom/RandomData.lambda$parseDocument$6:(Ljava/util/Map;Lorg/w3c/dom/Node;)V
      #306 (Lorg/w3c/dom/Node;)V
  6: #334 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #302 (Ljava/lang/Object;)V
      #319 REF_invokeVirtual ext/mods/FarmEventRandom/RandomData.lambda$parseDocument$7:(Lext/mods/FarmEventRandom/holder/RandomZoneData;Lorg/w3c/dom/Node;)V
      #306 (Lorg/w3c/dom/Node;)V
  7: #334 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #302 (Ljava/lang/Object;)V
      #322 REF_invokeVirtual ext/mods/FarmEventRandom/RandomData.lambda$parseDocument$5:(Lext/mods/FarmEventRandom/holder/MessagesHolder;Lorg/w3c/dom/Node;)V
      #306 (Lorg/w3c/dom/Node;)V
  8: #334 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #302 (Ljava/lang/Object;)V
      #325 REF_invokeVirtual ext/mods/FarmEventRandom/RandomData.lambda$parseDocument$3:([Lext/mods/FarmEventRandom/holder/RamdomConfig;Lorg/w3c/dom/Node;)V
      #306 (Lorg/w3c/dom/Node;)V
InnerClasses:
  public static final #347= #343 of #345; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
