// Bytecode for: ext.mods.dungeon.data.DungeonData
// File: ext\mods\dungeon\data\DungeonData.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/dungeon/data/DungeonData.class
  Last modified 9 de jul de 2026; size 7237 bytes
  MD5 checksum d2783e6f5d9e49215fd026468a4b27e3
  Compiled from "DungeonData.java"
public class ext.mods.dungeon.data.DungeonData implements ext.mods.commons.data.xml.IXmlReader
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #11                         // ext/mods/dungeon/data/DungeonData
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 2, methods: 9, attributes: 4
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Class              #8            // java/util/HashMap
    #8 = Utf8               java/util/HashMap
    #9 = Methodref          #7.#3         // java/util/HashMap."<init>":()V
   #10 = Fieldref           #11.#12       // ext/mods/dungeon/data/DungeonData._dungeons:Ljava/util/Map;
   #11 = Class              #13           // ext/mods/dungeon/data/DungeonData
   #12 = NameAndType        #14:#15       // _dungeons:Ljava/util/Map;
   #13 = Utf8               ext/mods/dungeon/data/DungeonData
   #14 = Utf8               _dungeons
   #15 = Utf8               Ljava/util/Map;
   #16 = Class              #17           // java/util/concurrent/atomic/AtomicLong
   #17 = Utf8               java/util/concurrent/atomic/AtomicLong
   #18 = Methodref          #16.#19       // java/util/concurrent/atomic/AtomicLong."<init>":(J)V
   #19 = NameAndType        #5:#20        // "<init>":(J)V
   #20 = Utf8               (J)V
   #21 = Fieldref           #11.#22       // ext/mods/dungeon/data/DungeonData.cooldownMs:Ljava/util/concurrent/atomic/AtomicLong;
   #22 = NameAndType        #23:#24       // cooldownMs:Ljava/util/concurrent/atomic/AtomicLong;
   #23 = Utf8               cooldownMs
   #24 = Utf8               Ljava/util/concurrent/atomic/AtomicLong;
   #25 = Methodref          #11.#26       // ext/mods/dungeon/data/DungeonData.load:()V
   #26 = NameAndType        #27:#6        // load:()V
   #27 = Utf8               load
   #28 = String             #29           // custom/mods/dungeon_event.xml
   #29 = Utf8               custom/mods/dungeon_event.xml
   #30 = Methodref          #11.#31       // ext/mods/dungeon/data/DungeonData.parseDataFile:(Ljava/lang/String;)V
   #31 = NameAndType        #32:#33       // parseDataFile:(Ljava/lang/String;)V
   #32 = Utf8               parseDataFile
   #33 = Utf8               (Ljava/lang/String;)V
   #34 = Fieldref           #11.#35       // ext/mods/dungeon/data/DungeonData.LOGGER:Lext/mods/commons/logging/CLogger;
   #35 = NameAndType        #36:#37       // LOGGER:Lext/mods/commons/logging/CLogger;
   #36 = Utf8               LOGGER
   #37 = Utf8               Lext/mods/commons/logging/CLogger;
   #38 = String             #39           // Loaded {} dungeons.
   #39 = Utf8               Loaded {} dungeons.
   #40 = InterfaceMethodref #41.#42       // java/util/Map.size:()I
   #41 = Class              #43           // java/util/Map
   #42 = NameAndType        #44:#45       // size:()I
   #43 = Utf8               java/util/Map
   #44 = Utf8               size
   #45 = Utf8               ()I
   #46 = Methodref          #47.#48       // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
   #47 = Class              #49           // java/lang/Integer
   #48 = NameAndType        #50:#51       // valueOf:(I)Ljava/lang/Integer;
   #49 = Utf8               java/lang/Integer
   #50 = Utf8               valueOf
   #51 = Utf8               (I)Ljava/lang/Integer;
   #52 = Methodref          #53.#54       // ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
   #53 = Class              #55           // ext/mods/commons/logging/CLogger
   #54 = NameAndType        #56:#57       // info:(Ljava/lang/Object;[Ljava/lang/Object;)V
   #55 = Utf8               ext/mods/commons/logging/CLogger
   #56 = Utf8               info
   #57 = Utf8               (Ljava/lang/Object;[Ljava/lang/Object;)V
   #58 = String             #59           // list
   #59 = Utf8               list
   #60 = InvokeDynamic      #0:#61        // #0:accept:(Lext/mods/dungeon/data/DungeonData;)Ljava/util/function/Consumer;
   #61 = NameAndType        #62:#63       // accept:(Lext/mods/dungeon/data/DungeonData;)Ljava/util/function/Consumer;
   #62 = Utf8               accept
   #63 = Utf8               (Lext/mods/dungeon/data/DungeonData;)Ljava/util/function/Consumer;
   #64 = Methodref          #11.#65       // ext/mods/dungeon/data/DungeonData.forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
   #65 = NameAndType        #66:#67       // forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
   #66 = Utf8               forEach
   #67 = Utf8               (Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
   #68 = InterfaceMethodref #69.#70       // org/w3c/dom/Node.getAttributes:()Lorg/w3c/dom/NamedNodeMap;
   #69 = Class              #71           // org/w3c/dom/Node
   #70 = NameAndType        #72:#73       // getAttributes:()Lorg/w3c/dom/NamedNodeMap;
   #71 = Utf8               org/w3c/dom/Node
   #72 = Utf8               getAttributes
   #73 = Utf8               ()Lorg/w3c/dom/NamedNodeMap;
   #74 = String             #75           // id
   #75 = Utf8               id
   #76 = Methodref          #11.#77       // ext/mods/dungeon/data/DungeonData.parseInteger:(Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;Ljava/lang/Integer;)Ljava/lang/Integer;
   #77 = NameAndType        #78:#79       // parseInteger:(Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;Ljava/lang/Integer;)Ljava/lang/Integer;
   #78 = Utf8               parseInteger
   #79 = Utf8               (Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;Ljava/lang/Integer;)Ljava/lang/Integer;
   #80 = Methodref          #47.#81       // java/lang/Integer.intValue:()I
   #81 = NameAndType        #82:#45       // intValue:()I
   #82 = Utf8               intValue
   #83 = String             #84           // name
   #84 = Utf8               name
   #85 = Methodref          #11.#86       // ext/mods/dungeon/data/DungeonData.parseString:(Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #86 = NameAndType        #87:#88       // parseString:(Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #87 = Utf8               parseString
   #88 = Utf8               (Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #89 = String             #90           // type
   #90 = Utf8               type
   #91 = String             #92           // solo
   #92 = Utf8               solo
   #93 = Methodref          #94.#95       // java/lang/String.toUpperCase:()Ljava/lang/String;
   #94 = Class              #96           // java/lang/String
   #95 = NameAndType        #97:#98       // toUpperCase:()Ljava/lang/String;
   #96 = Utf8               java/lang/String
   #97 = Utf8               toUpperCase
   #98 = Utf8               ()Ljava/lang/String;
   #99 = Methodref          #100.#101     // ext/mods/dungeon/enums/DungeonType.valueOf:(Ljava/lang/String;)Lext/mods/dungeon/enums/DungeonType;
  #100 = Class              #102          // ext/mods/dungeon/enums/DungeonType
  #101 = NameAndType        #50:#103      // valueOf:(Ljava/lang/String;)Lext/mods/dungeon/enums/DungeonType;
  #102 = Utf8               ext/mods/dungeon/enums/DungeonType
  #103 = Utf8               (Ljava/lang/String;)Lext/mods/dungeon/enums/DungeonType;
  #104 = String             #105          // sharedInstance
  #105 = Utf8               sharedInstance
  #106 = Methodref          #107.#108     // java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
  #107 = Class              #109          // java/lang/Boolean
  #108 = NameAndType        #50:#110      // valueOf:(Z)Ljava/lang/Boolean;
  #109 = Utf8               java/lang/Boolean
  #110 = Utf8               (Z)Ljava/lang/Boolean;
  #111 = Methodref          #11.#112      // ext/mods/dungeon/data/DungeonData.parseBoolean:(Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;Ljava/lang/Boolean;)Ljava/lang/Boolean;
  #112 = NameAndType        #113:#114     // parseBoolean:(Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;Ljava/lang/Boolean;)Ljava/lang/Boolean;
  #113 = Utf8               parseBoolean
  #114 = Utf8               (Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;Ljava/lang/Boolean;)Ljava/lang/Boolean;
  #115 = Methodref          #107.#116     // java/lang/Boolean.booleanValue:()Z
  #116 = NameAndType        #117:#118     // booleanValue:()Z
  #117 = Utf8               booleanValue
  #118 = Utf8               ()Z
  #119 = Class              #120          // java/util/ArrayList
  #120 = Utf8               java/util/ArrayList
  #121 = Methodref          #119.#3       // java/util/ArrayList."<init>":()V
  #122 = InvokeDynamic      #1:#123       // #1:accept:(Lext/mods/dungeon/data/DungeonData;Ljava/util/List;Ljava/util/Map;)Ljava/util/function/Consumer;
  #123 = NameAndType        #62:#124      // accept:(Lext/mods/dungeon/data/DungeonData;Ljava/util/List;Ljava/util/Map;)Ljava/util/function/Consumer;
  #124 = Utf8               (Lext/mods/dungeon/data/DungeonData;Ljava/util/List;Ljava/util/Map;)Ljava/util/function/Consumer;
  #125 = Methodref          #11.#126      // ext/mods/dungeon/data/DungeonData.forEach:(Lorg/w3c/dom/Node;Ljava/util/function/Consumer;)V
  #126 = NameAndType        #66:#127      // forEach:(Lorg/w3c/dom/Node;Ljava/util/function/Consumer;)V
  #127 = Utf8               (Lorg/w3c/dom/Node;Ljava/util/function/Consumer;)V
  #128 = Class              #129          // ext/mods/dungeon/DungeonTemplate
  #129 = Utf8               ext/mods/dungeon/DungeonTemplate
  #130 = Methodref          #16.#131      // java/util/concurrent/atomic/AtomicLong.get:()J
  #131 = NameAndType        #132:#133     // get:()J
  #132 = Utf8               get
  #133 = Utf8               ()J
  #134 = Methodref          #128.#135     // ext/mods/dungeon/DungeonTemplate."<init>":(ILjava/lang/String;Lext/mods/dungeon/enums/DungeonType;ZJLjava/util/List;Ljava/util/Map;)V
  #135 = NameAndType        #5:#136       // "<init>":(ILjava/lang/String;Lext/mods/dungeon/enums/DungeonType;ZJLjava/util/List;Ljava/util/Map;)V
  #136 = Utf8               (ILjava/lang/String;Lext/mods/dungeon/enums/DungeonType;ZJLjava/util/List;Ljava/util/Map;)V
  #137 = InterfaceMethodref #41.#138      // java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #138 = NameAndType        #139:#140     // put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #139 = Utf8               put
  #140 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #141 = InterfaceMethodref #41.#142      // java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
  #142 = NameAndType        #132:#143     // get:(Ljava/lang/Object;)Ljava/lang/Object;
  #143 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
  #144 = Fieldref           #145.#146     // ext/mods/dungeon/data/DungeonData$SingletonHolder._instance:Lext/mods/dungeon/data/DungeonData;
  #145 = Class              #147          // ext/mods/dungeon/data/DungeonData$SingletonHolder
  #146 = NameAndType        #148:#149     // _instance:Lext/mods/dungeon/data/DungeonData;
  #147 = Utf8               ext/mods/dungeon/data/DungeonData$SingletonHolder
  #148 = Utf8               _instance
  #149 = Utf8               Lext/mods/dungeon/data/DungeonData;
  #150 = InterfaceMethodref #69.#151      // org/w3c/dom/Node.getNodeName:()Ljava/lang/String;
  #151 = NameAndType        #152:#98      // getNodeName:()Ljava/lang/String;
  #152 = Utf8               getNodeName
  #153 = Methodref          #94.#154      // java/lang/String.hashCode:()I
  #154 = NameAndType        #155:#45      // hashCode:()I
  #155 = Utf8               hashCode
  #156 = String             #157          // cooldown
  #157 = Utf8               cooldown
  #158 = Methodref          #94.#159      // java/lang/String.equals:(Ljava/lang/Object;)Z
  #159 = NameAndType        #160:#161     // equals:(Ljava/lang/Object;)Z
  #160 = Utf8               equals
  #161 = Utf8               (Ljava/lang/Object;)Z
  #162 = String             #163          // stage
  #163 = Utf8               stage
  #164 = String             #165          // spawns
  #165 = Utf8               spawns
  #166 = String             #167          // minutes
  #167 = Utf8               minutes
  #168 = String             #169          // hours
  #169 = Utf8               hours
  #170 = String             #171          // days
  #171 = Utf8               days
  #172 = Fieldref           #173.#174     // java/util/concurrent/TimeUnit.MINUTES:Ljava/util/concurrent/TimeUnit;
  #173 = Class              #175          // java/util/concurrent/TimeUnit
  #174 = NameAndType        #176:#177     // MINUTES:Ljava/util/concurrent/TimeUnit;
  #175 = Utf8               java/util/concurrent/TimeUnit
  #176 = Utf8               MINUTES
  #177 = Utf8               Ljava/util/concurrent/TimeUnit;
  #178 = Methodref          #173.#179     // java/util/concurrent/TimeUnit.toMillis:(J)J
  #179 = NameAndType        #180:#181     // toMillis:(J)J
  #180 = Utf8               toMillis
  #181 = Utf8               (J)J
  #182 = Methodref          #16.#183      // java/util/concurrent/atomic/AtomicLong.set:(J)V
  #183 = NameAndType        #184:#20      // set:(J)V
  #184 = Utf8               set
  #185 = Fieldref           #173.#186     // java/util/concurrent/TimeUnit.HOURS:Ljava/util/concurrent/TimeUnit;
  #186 = NameAndType        #187:#177     // HOURS:Ljava/util/concurrent/TimeUnit;
  #187 = Utf8               HOURS
  #188 = Fieldref           #173.#189     // java/util/concurrent/TimeUnit.DAYS:Ljava/util/concurrent/TimeUnit;
  #189 = NameAndType        #190:#177     // DAYS:Ljava/util/concurrent/TimeUnit;
  #190 = Utf8               DAYS
  #191 = String             #192          // order
  #192 = Utf8               order
  #193 = String             #194          // loc
  #194 = Utf8               loc
  #195 = String             #196          // 0,0,0
  #196 = Utf8               0,0,0
  #197 = String             #198          // ,
  #198 = Utf8               ,
  #199 = Methodref          #94.#200      // java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
  #200 = NameAndType        #201:#202     // split:(Ljava/lang/String;)[Ljava/lang/String;
  #201 = Utf8               split
  #202 = Utf8               (Ljava/lang/String;)[Ljava/lang/String;
  #203 = Methodref          #47.#204      // java/lang/Integer.parseInt:(Ljava/lang/String;)I
  #204 = NameAndType        #205:#206     // parseInt:(Ljava/lang/String;)I
  #205 = Utf8               parseInt
  #206 = Utf8               (Ljava/lang/String;)I
  #207 = String             #208          // teleport
  #208 = Utf8               teleport
  #209 = Class              #210          // ext/mods/dungeon/holder/StageTemplate
  #210 = Utf8               ext/mods/dungeon/holder/StageTemplate
  #211 = Methodref          #209.#212     // ext/mods/dungeon/holder/StageTemplate."<init>":(IIIIZI)V
  #212 = NameAndType        #5:#213       // "<init>":(IIIIZI)V
  #213 = Utf8               (IIIIZI)V
  #214 = InterfaceMethodref #215.#216     // java/util/List.add:(Ljava/lang/Object;)Z
  #215 = Class              #217          // java/util/List
  #216 = NameAndType        #218:#161     // add:(Ljava/lang/Object;)Z
  #217 = Utf8               java/util/List
  #218 = Utf8               add
  #219 = Methodref          #11.#220      // ext/mods/dungeon/data/DungeonData.parseInteger:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/lang/Integer;)Ljava/lang/Integer;
  #220 = NameAndType        #78:#221      // parseInteger:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/lang/Integer;)Ljava/lang/Integer;
  #221 = Utf8               (Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/lang/Integer;)Ljava/lang/Integer;
  #222 = String             #223          // spawn
  #223 = Utf8               spawn
  #224 = InvokeDynamic      #2:#225       // #2:accept:(Lext/mods/dungeon/data/DungeonData;Ljava/util/List;)Ljava/util/function/Consumer;
  #225 = NameAndType        #62:#226      // accept:(Lext/mods/dungeon/data/DungeonData;Ljava/util/List;)Ljava/util/function/Consumer;
  #226 = Utf8               (Lext/mods/dungeon/data/DungeonData;Ljava/util/List;)Ljava/util/function/Consumer;
  #227 = String             #228          // npcId
  #228 = Utf8               npcId
  #229 = String             #230          // title
  #230 = Utf8               title
  #231 = String             #232          //
  #232 = Utf8
  #233 = String             #234          // count
  #234 = Utf8               count
  #235 = String             #236          // range
  #236 = Utf8               range
  #237 = String             #238          // drops
  #238 = Utf8               drops
  #239 = Class              #240          // ext/mods/dungeon/holder/SpawnTemplate
  #240 = Utf8               ext/mods/dungeon/holder/SpawnTemplate
  #241 = Methodref          #239.#242     // ext/mods/dungeon/holder/SpawnTemplate."<init>":(ILjava/lang/String;IIIIILjava/lang/String;)V
  #242 = NameAndType        #5:#243       // "<init>":(ILjava/lang/String;IIIIILjava/lang/String;)V
  #243 = Utf8               (ILjava/lang/String;IIIIILjava/lang/String;)V
  #244 = String             #245          // dungeon
  #245 = Utf8               dungeon
  #246 = InvokeDynamic      #3:#61        // #3:accept:(Lext/mods/dungeon/data/DungeonData;)Ljava/util/function/Consumer;
  #247 = Class              #248          // ext/mods/commons/data/xml/IXmlReader
  #248 = Utf8               ext/mods/commons/data/xml/IXmlReader
  #249 = Utf8               Signature
  #250 = Utf8               Ljava/util/Map<Ljava/lang/Integer;Lext/mods/dungeon/DungeonTemplate;>;
  #251 = Utf8               Code
  #252 = Utf8               LineNumberTable
  #253 = Utf8               LocalVariableTable
  #254 = Utf8               this
  #255 = Utf8               parseDocument
  #256 = Utf8               (Lorg/w3c/dom/Document;Ljava/nio/file/Path;)V
  #257 = Utf8               doc
  #258 = Utf8               Lorg/w3c/dom/Document;
  #259 = Utf8               path
  #260 = Utf8               Ljava/nio/file/Path;
  #261 = Utf8               parseDungeon
  #262 = Utf8               (Lorg/w3c/dom/Node;)V
  #263 = Utf8               dungeonNode
  #264 = Utf8               Lorg/w3c/dom/Node;
  #265 = Utf8               attrs
  #266 = Utf8               Lorg/w3c/dom/NamedNodeMap;
  #267 = Utf8               I
  #268 = Utf8               Ljava/lang/String;
  #269 = Utf8               typeAttr
  #270 = Utf8               Lext/mods/dungeon/enums/DungeonType;
  #271 = Utf8               shared
  #272 = Utf8               Z
  #273 = Utf8               stages
  #274 = Utf8               Ljava/util/List;
  #275 = Utf8               stageSpawns
  #276 = Utf8               LocalVariableTypeTable
  #277 = Utf8               Ljava/util/List<Lext/mods/dungeon/holder/StageTemplate;>;
  #278 = Utf8               Ljava/util/Map<Ljava/lang/Integer;Ljava/util/List<Lext/mods/dungeon/holder/SpawnTemplate;>;>;
  #279 = Utf8               getDungeon
  #280 = Utf8               (I)Lext/mods/dungeon/DungeonTemplate;
  #281 = Utf8               getInstance
  #282 = Utf8               ()Lext/mods/dungeon/data/DungeonData;
  #283 = Utf8               lambda$parseDungeon$0
  #284 = Utf8               (Ljava/util/List;Ljava/util/Map;Lorg/w3c/dom/Node;)V
  #285 = Utf8               cooldownAttrs
  #286 = Utf8               stageAttrs
  #287 = Utf8               [Ljava/lang/String;
  #288 = Utf8               x
  #289 = Utf8               y
  #290 = Utf8               z
  #291 = Utf8               time
  #292 = Utf8               stageId
  #293 = Utf8               s0$
  #294 = Utf8               tmp1$
  #295 = Utf8               node
  #296 = Utf8               Ljava/util/List<Lext/mods/dungeon/holder/SpawnTemplate;>;
  #297 = Utf8               StackMapTable
  #298 = Class              #299          // org/w3c/dom/NamedNodeMap
  #299 = Utf8               org/w3c/dom/NamedNodeMap
  #300 = Utf8               lambda$parseDungeon$1
  #301 = Utf8               (Ljava/util/List;Lorg/w3c/dom/Node;)V
  #302 = Utf8               spawnNode
  #303 = Utf8               spawnAttrs
  #304 = Utf8               lambda$parseDocument$0
  #305 = Utf8               listNode
  #306 = Utf8               SourceFile
  #307 = Utf8               DungeonData.java
  #308 = Utf8               NestMembers
  #309 = Utf8               BootstrapMethods
  #310 = MethodType         #311          //  (Ljava/lang/Object;)V
  #311 = Utf8               (Ljava/lang/Object;)V
  #312 = MethodHandle       5:#313        // REF_invokeVirtual ext/mods/dungeon/data/DungeonData.lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
  #313 = Methodref          #11.#314      // ext/mods/dungeon/data/DungeonData.lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
  #314 = NameAndType        #304:#262     // lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
  #315 = MethodType         #262          //  (Lorg/w3c/dom/Node;)V
  #316 = MethodHandle       5:#317        // REF_invokeVirtual ext/mods/dungeon/data/DungeonData.lambda$parseDungeon$0:(Ljava/util/List;Ljava/util/Map;Lorg/w3c/dom/Node;)V
  #317 = Methodref          #11.#318      // ext/mods/dungeon/data/DungeonData.lambda$parseDungeon$0:(Ljava/util/List;Ljava/util/Map;Lorg/w3c/dom/Node;)V
  #318 = NameAndType        #283:#284     // lambda$parseDungeon$0:(Ljava/util/List;Ljava/util/Map;Lorg/w3c/dom/Node;)V
  #319 = MethodHandle       5:#320        // REF_invokeVirtual ext/mods/dungeon/data/DungeonData.lambda$parseDungeon$1:(Ljava/util/List;Lorg/w3c/dom/Node;)V
  #320 = Methodref          #11.#321      // ext/mods/dungeon/data/DungeonData.lambda$parseDungeon$1:(Ljava/util/List;Lorg/w3c/dom/Node;)V
  #321 = NameAndType        #300:#301     // lambda$parseDungeon$1:(Ljava/util/List;Lorg/w3c/dom/Node;)V
  #322 = MethodHandle       5:#323        // REF_invokeVirtual ext/mods/dungeon/data/DungeonData.parseDungeon:(Lorg/w3c/dom/Node;)V
  #323 = Methodref          #11.#324      // ext/mods/dungeon/data/DungeonData.parseDungeon:(Lorg/w3c/dom/Node;)V
  #324 = NameAndType        #261:#262     // parseDungeon:(Lorg/w3c/dom/Node;)V
  #325 = MethodHandle       6:#326        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #326 = Methodref          #327.#328     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #327 = Class              #329          // java/lang/invoke/LambdaMetafactory
  #328 = NameAndType        #330:#331     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #329 = Utf8               java/lang/invoke/LambdaMetafactory
  #330 = Utf8               metafactory
  #331 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #332 = Utf8               InnerClasses
  #333 = Utf8               SingletonHolder
  #334 = Class              #335          // java/lang/invoke/MethodHandles$Lookup
  #335 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #336 = Class              #337          // java/lang/invoke/MethodHandles
  #337 = Utf8               java/lang/invoke/MethodHandles
  #338 = Utf8               Lookup
{
  final java.util.concurrent.atomic.AtomicLong cooldownMs;
    descriptor: Ljava/util/concurrent/atomic/AtomicLong;
    flags: (0x0010) ACC_FINAL

  public ext.mods.dungeon.data.DungeonData();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: new           #7                  // class java/util/HashMap
         8: dup
         9: invokespecial #9                  // Method java/util/HashMap."<init>":()V
        12: putfield      #10                 // Field _dungeons:Ljava/util/Map;
        15: aload_0
        16: new           #16                 // class java/util/concurrent/atomic/AtomicLong
        19: dup
        20: lconst_0
        21: invokespecial #18                 // Method java/util/concurrent/atomic/AtomicLong."<init>":(J)V
        24: putfield      #21                 // Field cooldownMs:Ljava/util/concurrent/atomic/AtomicLong;
        27: aload_0
        28: invokevirtual #25                 // Method load:()V
        31: return
      LineNumberTable:
        line 45: 0
        line 41: 4
        line 42: 15
        line 46: 27
        line 47: 31
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      32     0  this   Lext/mods/dungeon/data/DungeonData;

  public void load();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=1, args_size=1
         0: aload_0
         1: ldc           #28                 // String custom/mods/dungeon_event.xml
         3: invokevirtual #30                 // Method parseDataFile:(Ljava/lang/String;)V
         6: getstatic     #34                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
         9: ldc           #38                 // String Loaded {} dungeons.
        11: iconst_1
        12: anewarray     #2                  // class java/lang/Object
        15: dup
        16: iconst_0
        17: aload_0
        18: getfield      #10                 // Field _dungeons:Ljava/util/Map;
        21: invokeinterface #40,  1           // InterfaceMethod java/util/Map.size:()I
        26: invokestatic  #46                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        29: aastore
        30: invokevirtual #52                 // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
        33: return
      LineNumberTable:
        line 52: 0
        line 53: 6
        line 54: 33
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      34     0  this   Lext/mods/dungeon/data/DungeonData;

  public void parseDocument(org.w3c.dom.Document, java.nio.file.Path);
    descriptor: (Lorg/w3c/dom/Document;Ljava/nio/file/Path;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: ldc           #58                 // String list
         4: aload_0
         5: invokedynamic #60,  0             // InvokeDynamic #0:accept:(Lext/mods/dungeon/data/DungeonData;)Ljava/util/function/Consumer;
        10: invokevirtual #64                 // Method forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
        13: return
      LineNumberTable:
        line 59: 0
        line 60: 13
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0  this   Lext/mods/dungeon/data/DungeonData;
            0      14     1   doc   Lorg/w3c/dom/Document;
            0      14     2  path   Ljava/nio/file/Path;

  public ext.mods.dungeon.DungeonTemplate getDungeon(int);
    descriptor: (I)Lext/mods/dungeon/DungeonTemplate;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #10                 // Field _dungeons:Ljava/util/Map;
         4: iload_1
         5: invokestatic  #46                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
         8: invokeinterface #141,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        13: checkcast     #128                // class ext/mods/dungeon/DungeonTemplate
        16: areturn
      LineNumberTable:
        line 146: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      17     0  this   Lext/mods/dungeon/data/DungeonData;
            0      17     1    id   I

  public static ext.mods.dungeon.data.DungeonData getInstance();
    descriptor: ()Lext/mods/dungeon/data/DungeonData;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #144                // Field ext/mods/dungeon/data/DungeonData$SingletonHolder._instance:Lext/mods/dungeon/data/DungeonData;
         3: areturn
      LineNumberTable:
        line 151: 0
}
SourceFile: "DungeonData.java"
NestMembers:
  ext/mods/dungeon/data/DungeonData$SingletonHolder
BootstrapMethods:
  0: #325 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #310 (Ljava/lang/Object;)V
      #312 REF_invokeVirtual ext/mods/dungeon/data/DungeonData.lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
      #315 (Lorg/w3c/dom/Node;)V
  1: #325 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #310 (Ljava/lang/Object;)V
      #316 REF_invokeVirtual ext/mods/dungeon/data/DungeonData.lambda$parseDungeon$0:(Ljava/util/List;Ljava/util/Map;Lorg/w3c/dom/Node;)V
      #315 (Lorg/w3c/dom/Node;)V
  2: #325 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #310 (Ljava/lang/Object;)V
      #319 REF_invokeVirtual ext/mods/dungeon/data/DungeonData.lambda$parseDungeon$1:(Ljava/util/List;Lorg/w3c/dom/Node;)V
      #315 (Lorg/w3c/dom/Node;)V
  3: #325 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #310 (Ljava/lang/Object;)V
      #322 REF_invokeVirtual ext/mods/dungeon/data/DungeonData.parseDungeon:(Lorg/w3c/dom/Node;)V
      #315 (Lorg/w3c/dom/Node;)V
InnerClasses:
  public static final #338= #334 of #336; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
