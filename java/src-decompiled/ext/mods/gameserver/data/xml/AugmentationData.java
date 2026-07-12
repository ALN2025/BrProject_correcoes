// Bytecode for: ext.mods.gameserver.data.xml.AugmentationData
// File: ext\mods\gameserver\data\xml\AugmentationData.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/data/xml/AugmentationData.class
  Last modified 9 de jul de 2026; size 12186 bytes
  MD5 checksum 6d4e19c448391b43eb5b90d6e8dacc19
  Compiled from "AugmentationData.java"
public class ext.mods.gameserver.data.xml.AugmentationData implements ext.mods.commons.data.xml.IXmlReader
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #13                         // ext/mods/gameserver/data/xml/AugmentationData
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 18, methods: 13, attributes: 4
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Class              #8            // java/util/ArrayList
    #8 = Utf8               java/util/ArrayList
    #9 = Methodref          #7.#10        // java/util/ArrayList."<init>":(I)V
   #10 = NameAndType        #5:#11        // "<init>":(I)V
   #11 = Utf8               (I)V
   #12 = Fieldref           #13.#14       // ext/mods/gameserver/data/xml/AugmentationData._augStats:Ljava/util/List;
   #13 = Class              #15           // ext/mods/gameserver/data/xml/AugmentationData
   #14 = NameAndType        #16:#17       // _augStats:Ljava/util/List;
   #15 = Utf8               ext/mods/gameserver/data/xml/AugmentationData
   #16 = Utf8               _augStats
   #17 = Utf8               Ljava/util/List;
   #18 = Fieldref           #13.#19       // ext/mods/gameserver/data/xml/AugmentationData._blueSkills:Ljava/util/List;
   #19 = NameAndType        #20:#17       // _blueSkills:Ljava/util/List;
   #20 = Utf8               _blueSkills
   #21 = Fieldref           #13.#22       // ext/mods/gameserver/data/xml/AugmentationData._purpleSkills:Ljava/util/List;
   #22 = NameAndType        #23:#17       // _purpleSkills:Ljava/util/List;
   #23 = Utf8               _purpleSkills
   #24 = Fieldref           #13.#25       // ext/mods/gameserver/data/xml/AugmentationData._redSkills:Ljava/util/List;
   #25 = NameAndType        #26:#17       // _redSkills:Ljava/util/List;
   #26 = Utf8               _redSkills
   #27 = Class              #28           // java/util/HashMap
   #28 = Utf8               java/util/HashMap
   #29 = Methodref          #27.#3        // java/util/HashMap."<init>":()V
   #30 = Fieldref           #13.#31       // ext/mods/gameserver/data/xml/AugmentationData._allSkills:Ljava/util/Map;
   #31 = NameAndType        #32:#33       // _allSkills:Ljava/util/Map;
   #32 = Utf8               _allSkills
   #33 = Utf8               Ljava/util/Map;
   #34 = Fieldref           #13.#35       // ext/mods/gameserver/data/xml/AugmentationData.STATS1_MAP:[B
   #35 = NameAndType        #36:#37       // STATS1_MAP:[B
   #36 = Utf8               STATS1_MAP
   #37 = Utf8               [B
   #38 = Fieldref           #13.#39       // ext/mods/gameserver/data/xml/AugmentationData.STATS2_MAP:[B
   #39 = NameAndType        #40:#37       // STATS2_MAP:[B
   #40 = Utf8               STATS2_MAP
   #41 = Methodref          #7.#3         // java/util/ArrayList."<init>":()V
   #42 = InterfaceMethodref #43.#44       // java/util/List.add:(Ljava/lang/Object;)Z
   #43 = Class              #45           // java/util/List
   #44 = NameAndType        #46:#47       // add:(Ljava/lang/Object;)Z
   #45 = Utf8               java/util/List
   #46 = Utf8               add
   #47 = Utf8               (Ljava/lang/Object;)Z
   #48 = Methodref          #13.#49       // ext/mods/gameserver/data/xml/AugmentationData.load:()V
   #49 = NameAndType        #50:#6        // load:()V
   #50 = Utf8               load
   #51 = String             #52           // xml/augmentation
   #52 = Utf8               xml/augmentation
   #53 = Methodref          #13.#54       // ext/mods/gameserver/data/xml/AugmentationData.parseDataFile:(Ljava/lang/String;)V
   #54 = NameAndType        #55:#56       // parseDataFile:(Ljava/lang/String;)V
   #55 = Utf8               parseDataFile
   #56 = Utf8               (Ljava/lang/String;)V
   #57 = Fieldref           #13.#58       // ext/mods/gameserver/data/xml/AugmentationData.LOGGER:Lext/mods/commons/logging/CLogger;
   #58 = NameAndType        #59:#60       // LOGGER:Lext/mods/commons/logging/CLogger;
   #59 = Utf8               LOGGER
   #60 = Utf8               Lext/mods/commons/logging/CLogger;
   #61 = String             #62           // Loaded {} sets of augmentation stats.
   #62 = Utf8               Loaded {} sets of augmentation stats.
   #63 = InterfaceMethodref #43.#64       // java/util/List.size:()I
   #64 = NameAndType        #65:#66       // size:()I
   #65 = Utf8               size
   #66 = Utf8               ()I
   #67 = Methodref          #68.#69       // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
   #68 = Class              #70           // java/lang/Integer
   #69 = NameAndType        #71:#72       // valueOf:(I)Ljava/lang/Integer;
   #70 = Utf8               java/lang/Integer
   #71 = Utf8               valueOf
   #72 = Utf8               (I)Ljava/lang/Integer;
   #73 = Methodref          #74.#75       // ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
   #74 = Class              #76           // ext/mods/commons/logging/CLogger
   #75 = NameAndType        #77:#78       // info:(Ljava/lang/Object;[Ljava/lang/Object;)V
   #76 = Utf8               ext/mods/commons/logging/CLogger
   #77 = Utf8               info
   #78 = Utf8               (Ljava/lang/Object;[Ljava/lang/Object;)V
   #79 = InterfaceMethodref #43.#80       // java/util/List.stream:()Ljava/util/stream/Stream;
   #80 = NameAndType        #81:#82       // stream:()Ljava/util/stream/Stream;
   #81 = Utf8               stream
   #82 = Utf8               ()Ljava/util/stream/Stream;
   #83 = InvokeDynamic      #0:#84        // #0:applyAsInt:()Ljava/util/function/ToIntFunction;
   #84 = NameAndType        #85:#86       // applyAsInt:()Ljava/util/function/ToIntFunction;
   #85 = Utf8               applyAsInt
   #86 = Utf8               ()Ljava/util/function/ToIntFunction;
   #87 = InterfaceMethodref #88.#89       // java/util/stream/Stream.mapToInt:(Ljava/util/function/ToIntFunction;)Ljava/util/stream/IntStream;
   #88 = Class              #90           // java/util/stream/Stream
   #89 = NameAndType        #91:#92       // mapToInt:(Ljava/util/function/ToIntFunction;)Ljava/util/stream/IntStream;
   #90 = Utf8               java/util/stream/Stream
   #91 = Utf8               mapToInt
   #92 = Utf8               (Ljava/util/function/ToIntFunction;)Ljava/util/stream/IntStream;
   #93 = InterfaceMethodref #94.#95       // java/util/stream/IntStream.sum:()I
   #94 = Class              #96           // java/util/stream/IntStream
   #95 = NameAndType        #97:#66       // sum:()I
   #96 = Utf8               java/util/stream/IntStream
   #97 = Utf8               sum
   #98 = String             #99           // Loaded {} blue, {} purple and {} red Life-Stone skills.
   #99 = Utf8               Loaded {} blue, {} purple and {} red Life-Stone skills.
  #100 = String             #101          // list
  #101 = Utf8               list
  #102 = InvokeDynamic      #1:#103       // #1:accept:(Lext/mods/gameserver/data/xml/AugmentationData;)Ljava/util/function/Consumer;
  #103 = NameAndType        #104:#105     // accept:(Lext/mods/gameserver/data/xml/AugmentationData;)Ljava/util/function/Consumer;
  #104 = Utf8               accept
  #105 = Utf8               (Lext/mods/gameserver/data/xml/AugmentationData;)Ljava/util/function/Consumer;
  #106 = Methodref          #13.#107      // ext/mods/gameserver/data/xml/AugmentationData.forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
  #107 = NameAndType        #108:#109     // forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
  #108 = Utf8               forEach
  #109 = Utf8               (Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
  #110 = Methodref          #111.#112     // java/lang/Math.min:(II)I
  #111 = Class              #113          // java/lang/Math
  #112 = NameAndType        #114:#115     // min:(II)I
  #113 = Utf8               java/lang/Math
  #114 = Utf8               min
  #115 = Utf8               (II)I
  #116 = Methodref          #117.#118     // ext/mods/commons/random/Rnd.get:(II)I
  #117 = Class              #119          // ext/mods/commons/random/Rnd
  #118 = NameAndType        #120:#115     // get:(II)I
  #119 = Utf8               ext/mods/commons/random/Rnd
  #120 = Utf8               get
  #121 = Fieldref           #122.#123     // ext/mods/Config.AUGMENTATION_NG_SKILL_CHANCE:I
  #122 = Class              #124          // ext/mods/Config
  #123 = NameAndType        #125:#126     // AUGMENTATION_NG_SKILL_CHANCE:I
  #124 = Utf8               ext/mods/Config
  #125 = Utf8               AUGMENTATION_NG_SKILL_CHANCE
  #126 = Utf8               I
  #127 = Fieldref           #122.#128     // ext/mods/Config.AUGMENTATION_NG_GLOW_CHANCE:I
  #128 = NameAndType        #129:#126     // AUGMENTATION_NG_GLOW_CHANCE:I
  #129 = Utf8               AUGMENTATION_NG_GLOW_CHANCE
  #130 = Fieldref           #122.#131     // ext/mods/Config.AUGMENTATION_MID_SKILL_CHANCE:I
  #131 = NameAndType        #132:#126     // AUGMENTATION_MID_SKILL_CHANCE:I
  #132 = Utf8               AUGMENTATION_MID_SKILL_CHANCE
  #133 = Fieldref           #122.#134     // ext/mods/Config.AUGMENTATION_MID_GLOW_CHANCE:I
  #134 = NameAndType        #135:#126     // AUGMENTATION_MID_GLOW_CHANCE:I
  #135 = Utf8               AUGMENTATION_MID_GLOW_CHANCE
  #136 = Fieldref           #122.#137     // ext/mods/Config.AUGMENTATION_HIGH_SKILL_CHANCE:I
  #137 = NameAndType        #138:#126     // AUGMENTATION_HIGH_SKILL_CHANCE:I
  #138 = Utf8               AUGMENTATION_HIGH_SKILL_CHANCE
  #139 = Fieldref           #122.#140     // ext/mods/Config.AUGMENTATION_HIGH_GLOW_CHANCE:I
  #140 = NameAndType        #141:#126     // AUGMENTATION_HIGH_GLOW_CHANCE:I
  #141 = Utf8               AUGMENTATION_HIGH_GLOW_CHANCE
  #142 = Fieldref           #122.#143     // ext/mods/Config.AUGMENTATION_TOP_SKILL_CHANCE:I
  #143 = NameAndType        #144:#126     // AUGMENTATION_TOP_SKILL_CHANCE:I
  #144 = Utf8               AUGMENTATION_TOP_SKILL_CHANCE
  #145 = Fieldref           #122.#146     // ext/mods/Config.AUGMENTATION_TOP_GLOW_CHANCE:I
  #146 = NameAndType        #147:#126     // AUGMENTATION_TOP_GLOW_CHANCE:I
  #147 = Utf8               AUGMENTATION_TOP_GLOW_CHANCE
  #148 = Fieldref           #122.#149     // ext/mods/Config.AUGMENTATION_BASESTAT_CHANCE:I
  #149 = NameAndType        #150:#126     // AUGMENTATION_BASESTAT_CHANCE:I
  #150 = Utf8               AUGMENTATION_BASESTAT_CHANCE
  #151 = InterfaceMethodref #43.#152      // java/util/List.get:(I)Ljava/lang/Object;
  #152 = NameAndType        #120:#153     // get:(I)Ljava/lang/Object;
  #153 = Utf8               (I)Ljava/lang/Object;
  #154 = Methodref          #68.#155      // java/lang/Integer.intValue:()I
  #155 = NameAndType        #156:#66      // intValue:()I
  #156 = Utf8               intValue
  #157 = InterfaceMethodref #158.#159     // java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
  #158 = Class              #160          // java/util/Map
  #159 = NameAndType        #120:#161     // get:(Ljava/lang/Object;)Ljava/lang/Object;
  #160 = Utf8               java/util/Map
  #161 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
  #162 = Class              #163          // ext/mods/gameserver/model/holder/IntIntHolder
  #163 = Utf8               ext/mods/gameserver/model/holder/IntIntHolder
  #164 = Methodref          #162.#165     // ext/mods/gameserver/model/holder/IntIntHolder.getSkill:()Lext/mods/gameserver/skills/L2Skill;
  #165 = NameAndType        #166:#167     // getSkill:()Lext/mods/gameserver/skills/L2Skill;
  #166 = Utf8               getSkill
  #167 = Utf8               ()Lext/mods/gameserver/skills/L2Skill;
  #168 = Class              #169          // ext/mods/gameserver/model/Augmentation
  #169 = Utf8               ext/mods/gameserver/model/Augmentation
  #170 = Methodref          #168.#171     // ext/mods/gameserver/model/Augmentation."<init>":(ILext/mods/gameserver/skills/L2Skill;)V
  #171 = NameAndType        #5:#172       // "<init>":(ILext/mods/gameserver/skills/L2Skill;)V
  #172 = Utf8               (ILext/mods/gameserver/skills/L2Skill;)V
  #173 = Integer            65535
  #174 = Class              #175          // ext/mods/gameserver/data/xml/AugmentationData$AugmentationStat
  #175 = Utf8               ext/mods/gameserver/data/xml/AugmentationData$AugmentationStat
  #176 = Class              #177          // ext/mods/gameserver/data/xml/AugmentationData$AugStat
  #177 = Utf8               ext/mods/gameserver/data/xml/AugmentationData$AugStat
  #178 = Methodref          #174.#179     // ext/mods/gameserver/data/xml/AugmentationData$AugmentationStat.getStat:()Lext/mods/gameserver/enums/skills/Stats;
  #179 = NameAndType        #180:#181     // getStat:()Lext/mods/gameserver/enums/skills/Stats;
  #180 = Utf8               getStat
  #181 = Utf8               ()Lext/mods/gameserver/enums/skills/Stats;
  #182 = Methodref          #174.#183     // ext/mods/gameserver/data/xml/AugmentationData$AugmentationStat.getSingleStatValue:(I)F
  #183 = NameAndType        #184:#185     // getSingleStatValue:(I)F
  #184 = Utf8               getSingleStatValue
  #185 = Utf8               (I)F
  #186 = Methodref          #176.#187     // ext/mods/gameserver/data/xml/AugmentationData$AugStat."<init>":(Lext/mods/gameserver/enums/skills/Stats;F)V
  #187 = NameAndType        #5:#188       // "<init>":(Lext/mods/gameserver/enums/skills/Stats;F)V
  #188 = Utf8               (Lext/mods/gameserver/enums/skills/Stats;F)V
  #189 = Methodref          #174.#190     // ext/mods/gameserver/data/xml/AugmentationData$AugmentationStat.getCombinedStatValue:(I)F
  #190 = NameAndType        #191:#185     // getCombinedStatValue:(I)F
  #191 = Utf8               getCombinedStatValue
  #192 = Fieldref           #193.#194     // ext/mods/gameserver/enums/skills/Stats.STAT_STR:Lext/mods/gameserver/enums/skills/Stats;
  #193 = Class              #195          // ext/mods/gameserver/enums/skills/Stats
  #194 = NameAndType        #196:#197     // STAT_STR:Lext/mods/gameserver/enums/skills/Stats;
  #195 = Utf8               ext/mods/gameserver/enums/skills/Stats
  #196 = Utf8               STAT_STR
  #197 = Utf8               Lext/mods/gameserver/enums/skills/Stats;
  #198 = Fieldref           #193.#199     // ext/mods/gameserver/enums/skills/Stats.STAT_CON:Lext/mods/gameserver/enums/skills/Stats;
  #199 = NameAndType        #200:#197     // STAT_CON:Lext/mods/gameserver/enums/skills/Stats;
  #200 = Utf8               STAT_CON
  #201 = Fieldref           #193.#202     // ext/mods/gameserver/enums/skills/Stats.STAT_INT:Lext/mods/gameserver/enums/skills/Stats;
  #202 = NameAndType        #203:#197     // STAT_INT:Lext/mods/gameserver/enums/skills/Stats;
  #203 = Utf8               STAT_INT
  #204 = Fieldref           #193.#205     // ext/mods/gameserver/enums/skills/Stats.STAT_MEN:Lext/mods/gameserver/enums/skills/Stats;
  #205 = NameAndType        #206:#197     // STAT_MEN:Lext/mods/gameserver/enums/skills/Stats;
  #206 = Utf8               STAT_MEN
  #207 = Fieldref           #208.#209     // ext/mods/gameserver/data/xml/AugmentationData$SingletonHolder.INSTANCE:Lext/mods/gameserver/data/xml/AugmentationData;
  #208 = Class              #210          // ext/mods/gameserver/data/xml/AugmentationData$SingletonHolder
  #209 = NameAndType        #211:#212     // INSTANCE:Lext/mods/gameserver/data/xml/AugmentationData;
  #210 = Utf8               ext/mods/gameserver/data/xml/AugmentationData$SingletonHolder
  #211 = Utf8               INSTANCE
  #212 = Utf8               Lext/mods/gameserver/data/xml/AugmentationData;
  #213 = String             #214          // augmentation
  #214 = Utf8               augmentation
  #215 = InvokeDynamic      #2:#103       // #2:accept:(Lext/mods/gameserver/data/xml/AugmentationData;)Ljava/util/function/Consumer;
  #216 = String             #217          // set
  #217 = Utf8               set
  #218 = InvokeDynamic      #3:#103       // #3:accept:(Lext/mods/gameserver/data/xml/AugmentationData;)Ljava/util/function/Consumer;
  #219 = InterfaceMethodref #220.#221     // org/w3c/dom/Node.getAttributes:()Lorg/w3c/dom/NamedNodeMap;
  #220 = Class              #222          // org/w3c/dom/Node
  #221 = NameAndType        #223:#224     // getAttributes:()Lorg/w3c/dom/NamedNodeMap;
  #222 = Utf8               org/w3c/dom/Node
  #223 = Utf8               getAttributes
  #224 = Utf8               ()Lorg/w3c/dom/NamedNodeMap;
  #225 = String             #226          // order
  #226 = Utf8               order
  #227 = Methodref          #13.#228      // ext/mods/gameserver/data/xml/AugmentationData.parseInteger:(Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)Ljava/lang/Integer;
  #228 = NameAndType        #229:#230     // parseInteger:(Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)Ljava/lang/Integer;
  #229 = Utf8               parseInteger
  #230 = Utf8               (Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)Ljava/lang/Integer;
  #231 = String             #232          // stat
  #232 = Utf8               stat
  #233 = InvokeDynamic      #4:#234       // #4:accept:(Lext/mods/gameserver/data/xml/AugmentationData;Ljava/util/List;)Ljava/util/function/Consumer;
  #234 = NameAndType        #104:#235     // accept:(Lext/mods/gameserver/data/xml/AugmentationData;Ljava/util/List;)Ljava/util/function/Consumer;
  #235 = Utf8               (Lext/mods/gameserver/data/xml/AugmentationData;Ljava/util/List;)Ljava/util/function/Consumer;
  #236 = String             #237          // name
  #237 = Utf8               name
  #238 = Methodref          #13.#239      // ext/mods/gameserver/data/xml/AugmentationData.parseString:(Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)Ljava/lang/String;
  #239 = NameAndType        #240:#241     // parseString:(Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)Ljava/lang/String;
  #240 = Utf8               parseString
  #241 = Utf8               (Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)Ljava/lang/String;
  #242 = String             #243          // table
  #243 = Utf8               table
  #244 = InvokeDynamic      #5:#245       // #5:accept:(Lext/mods/gameserver/data/xml/AugmentationData;Ljava/util/List;Ljava/util/List;)Ljava/util/function/Consumer;
  #245 = NameAndType        #104:#246     // accept:(Lext/mods/gameserver/data/xml/AugmentationData;Ljava/util/List;Ljava/util/List;)Ljava/util/function/Consumer;
  #246 = Utf8               (Lext/mods/gameserver/data/xml/AugmentationData;Ljava/util/List;Ljava/util/List;)Ljava/util/function/Consumer;
  #247 = Class              #248          // java/lang/Float
  #248 = Utf8               java/lang/Float
  #249 = Methodref          #247.#250     // java/lang/Float.floatValue:()F
  #250 = NameAndType        #251:#252     // floatValue:()F
  #251 = Utf8               floatValue
  #252 = Utf8               ()F
  #253 = Methodref          #193.#254     // ext/mods/gameserver/enums/skills/Stats.valueOfXml:(Ljava/lang/String;)Lext/mods/gameserver/enums/skills/Stats;
  #254 = NameAndType        #255:#256     // valueOfXml:(Ljava/lang/String;)Lext/mods/gameserver/enums/skills/Stats;
  #255 = Utf8               valueOfXml
  #256 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/enums/skills/Stats;
  #257 = Methodref          #174.#258     // ext/mods/gameserver/data/xml/AugmentationData$AugmentationStat."<init>":(Lext/mods/gameserver/enums/skills/Stats;[F[F)V
  #258 = NameAndType        #5:#259       // "<init>":(Lext/mods/gameserver/enums/skills/Stats;[F[F)V
  #259 = Utf8               (Lext/mods/gameserver/enums/skills/Stats;[F[F)V
  #260 = Class              #261          // java/util/StringTokenizer
  #261 = Utf8               java/util/StringTokenizer
  #262 = InterfaceMethodref #220.#263     // org/w3c/dom/Node.getFirstChild:()Lorg/w3c/dom/Node;
  #263 = NameAndType        #264:#265     // getFirstChild:()Lorg/w3c/dom/Node;
  #264 = Utf8               getFirstChild
  #265 = Utf8               ()Lorg/w3c/dom/Node;
  #266 = InterfaceMethodref #220.#267     // org/w3c/dom/Node.getNodeValue:()Ljava/lang/String;
  #267 = NameAndType        #268:#269     // getNodeValue:()Ljava/lang/String;
  #268 = Utf8               getNodeValue
  #269 = Utf8               ()Ljava/lang/String;
  #270 = Methodref          #260.#271     // java/util/StringTokenizer."<init>":(Ljava/lang/String;)V
  #271 = NameAndType        #5:#56        // "<init>":(Ljava/lang/String;)V
  #272 = String             #273          // #soloValues
  #273 = Utf8               #soloValues
  #274 = Methodref          #275.#276     // java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
  #275 = Class              #277          // java/lang/String
  #276 = NameAndType        #278:#279     // equalsIgnoreCase:(Ljava/lang/String;)Z
  #277 = Utf8               java/lang/String
  #278 = Utf8               equalsIgnoreCase
  #279 = Utf8               (Ljava/lang/String;)Z
  #280 = Methodref          #260.#281     // java/util/StringTokenizer.hasMoreTokens:()Z
  #281 = NameAndType        #282:#283     // hasMoreTokens:()Z
  #282 = Utf8               hasMoreTokens
  #283 = Utf8               ()Z
  #284 = Methodref          #260.#285     // java/util/StringTokenizer.nextToken:()Ljava/lang/String;
  #285 = NameAndType        #286:#269     // nextToken:()Ljava/lang/String;
  #286 = Utf8               nextToken
  #287 = Methodref          #247.#288     // java/lang/Float.parseFloat:(Ljava/lang/String;)F
  #288 = NameAndType        #289:#290     // parseFloat:(Ljava/lang/String;)F
  #289 = Utf8               parseFloat
  #290 = Utf8               (Ljava/lang/String;)F
  #291 = Methodref          #247.#292     // java/lang/Float.valueOf:(F)Ljava/lang/Float;
  #292 = NameAndType        #71:#293      // valueOf:(F)Ljava/lang/Float;
  #293 = Utf8               (F)Ljava/lang/Float;
  #294 = Methodref          #13.#295      // ext/mods/gameserver/data/xml/AugmentationData.parseAttributes:(Lorg/w3c/dom/Node;)Lext/mods/commons/data/StatSet;
  #295 = NameAndType        #296:#297     // parseAttributes:(Lorg/w3c/dom/Node;)Lext/mods/commons/data/StatSet;
  #296 = Utf8               parseAttributes
  #297 = Utf8               (Lorg/w3c/dom/Node;)Lext/mods/commons/data/StatSet;
  #298 = String             #299          // id
  #299 = Utf8               id
  #300 = Methodref          #301.#302     // ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
  #301 = Class              #303          // ext/mods/commons/data/StatSet
  #302 = NameAndType        #304:#305     // getInteger:(Ljava/lang/String;)I
  #303 = Utf8               ext/mods/commons/data/StatSet
  #304 = Utf8               getInteger
  #305 = Utf8               (Ljava/lang/String;)I
  #306 = String             #307          // type
  #307 = Utf8               type
  #308 = Methodref          #301.#309     // ext/mods/commons/data/StatSet.getString:(Ljava/lang/String;)Ljava/lang/String;
  #309 = NameAndType        #310:#311     // getString:(Ljava/lang/String;)Ljava/lang/String;
  #310 = Utf8               getString
  #311 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
  #312 = Methodref          #275.#313     // java/lang/String.hashCode:()I
  #313 = NameAndType        #314:#66      // hashCode:()I
  #314 = Utf8               hashCode
  #315 = String             #316          // blue
  #316 = Utf8               blue
  #317 = Methodref          #275.#318     // java/lang/String.equals:(Ljava/lang/Object;)Z
  #318 = NameAndType        #319:#47      // equals:(Ljava/lang/Object;)Z
  #319 = Utf8               equals
  #320 = String             #321          // purple
  #321 = Utf8               purple
  #322 = String             #323          // red
  #323 = Utf8               red
  #324 = String             #325          // skillId
  #325 = Utf8               skillId
  #326 = String             #327          // skillLevel
  #327 = Utf8               skillLevel
  #328 = Methodref          #162.#329     // ext/mods/gameserver/model/holder/IntIntHolder."<init>":(II)V
  #329 = NameAndType        #5:#330       // "<init>":(II)V
  #330 = Utf8               (II)V
  #331 = InterfaceMethodref #158.#332     // java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #332 = NameAndType        #333:#334     // put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #333 = Utf8               put
  #334 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #335 = Class              #336          // ext/mods/commons/data/xml/IXmlReader
  #336 = Utf8               ext/mods/commons/data/xml/IXmlReader
  #337 = Utf8               STAT_START
  #338 = Utf8               ConstantValue
  #339 = Integer            1
  #340 = Utf8               STAT_END
  #341 = Integer            14560
  #342 = Utf8               STAT_BLOCKSIZE
  #343 = Integer            3640
  #344 = Utf8               STAT_SUBBLOCKSIZE
  #345 = Integer            91
  #346 = Utf8               STAT_NUM
  #347 = Integer            13
  #348 = Utf8               BLUE_START
  #349 = Integer            14561
  #350 = Utf8               SKILLS_BLOCKSIZE
  #351 = Integer            178
  #352 = Utf8               BASESTAT_STR
  #353 = Integer            16341
  #354 = Utf8               BASESTAT_CON
  #355 = Integer            16342
  #356 = Utf8               BASESTAT_INT
  #357 = Integer            16343
  #358 = Utf8               BASESTAT_MEN
  #359 = Integer            16344
  #360 = Utf8               Signature
  #361 = Utf8               Ljava/util/List<Ljava/util/List<Lext/mods/gameserver/data/xml/AugmentationData$AugmentationStat;>;>;
  #362 = Utf8               Ljava/util/List<Ljava/util/List<Ljava/lang/Integer;>;>;
  #363 = Utf8               Ljava/util/Map<Ljava/lang/Integer;Lext/mods/gameserver/model/holder/IntIntHolder;>;
  #364 = Utf8               Code
  #365 = Utf8               LineNumberTable
  #366 = Utf8               LocalVariableTable
  #367 = Utf8               j
  #368 = Utf8               i
  #369 = Utf8               this
  #370 = Utf8               idx
  #371 = Utf8               B
  #372 = Utf8               StackMapTable
  #373 = Utf8               parseDocument
  #374 = Utf8               (Lorg/w3c/dom/Document;Ljava/nio/file/Path;)V
  #375 = Utf8               doc
  #376 = Utf8               Lorg/w3c/dom/Document;
  #377 = Utf8               path
  #378 = Utf8               Ljava/nio/file/Path;
  #379 = Utf8               generateRandomAugmentation
  #380 = Utf8               (II)Lext/mods/gameserver/model/Augmentation;
  #381 = Utf8               temp
  #382 = Utf8               colorOffset
  #383 = Utf8               offset
  #384 = Utf8               lifeStoneLevel
  #385 = Utf8               lifeStoneGrade
  #386 = Utf8               stat12
  #387 = Utf8               stat34
  #388 = Utf8               generateSkill
  #389 = Utf8               Z
  #390 = Utf8               generateGlow
  #391 = Utf8               resultColor
  #392 = Utf8               skill
  #393 = Utf8               Lext/mods/gameserver/skills/L2Skill;
  #394 = Class              #395          // ext/mods/gameserver/skills/L2Skill
  #395 = Utf8               ext/mods/gameserver/skills/L2Skill
  #396 = Utf8               getAugStatsById
  #397 = Utf8               (I)Ljava/util/List;
  #398 = Utf8               as
  #399 = Utf8               Lext/mods/gameserver/data/xml/AugmentationData$AugmentationStat;
  #400 = Utf8               base
  #401 = Utf8               color
  #402 = Utf8               subblock
  #403 = Utf8               level
  #404 = Utf8               stat1
  #405 = Utf8               stat2
  #406 = Utf8               augmentationId
  #407 = Utf8               stats
  #408 = Utf8               [I
  #409 = Utf8               LocalVariableTypeTable
  #410 = Utf8               Ljava/util/List<Lext/mods/gameserver/data/xml/AugmentationData$AugStat;>;
  #411 = Class              #408          // "[I"
  #412 = Utf8               (I)Ljava/util/List<Lext/mods/gameserver/data/xml/AugmentationData$AugStat;>;
  #413 = Utf8               getAllSkills
  #414 = Utf8               ()Ljava/util/Map;
  #415 = Utf8               ()Ljava/util/Map<Ljava/lang/Integer;Lext/mods/gameserver/model/holder/IntIntHolder;>;
  #416 = Utf8               getInstance
  #417 = Utf8               ()Lext/mods/gameserver/data/xml/AugmentationData;
  #418 = Utf8               lambda$parseDocument$0
  #419 = Utf8               (Lorg/w3c/dom/Node;)V
  #420 = Utf8               listNode
  #421 = Utf8               Lorg/w3c/dom/Node;
  #422 = Utf8               lambda$parseDocument$2
  #423 = Utf8               setNode
  #424 = Utf8               statList
  #425 = Utf8               Ljava/util/List<Lext/mods/gameserver/data/xml/AugmentationData$AugmentationStat;>;
  #426 = Utf8               lambda$parseDocument$3
  #427 = Utf8               (Ljava/util/List;Lorg/w3c/dom/Node;)V
  #428 = Utf8               statNode
  #429 = Utf8               statName
  #430 = Utf8               Ljava/lang/String;
  #431 = Utf8               soloValues
  #432 = Utf8               combinedValues
  #433 = Utf8               soloValuesArr
  #434 = Utf8               [F
  #435 = Utf8               combinedValuesArr
  #436 = Utf8               Ljava/util/List<Ljava/lang/Float;>;
  #437 = Class              #434          // "[F"
  #438 = Utf8               lambda$parseDocument$4
  #439 = Utf8               (Ljava/util/List;Ljava/util/List;Lorg/w3c/dom/Node;)V
  #440 = Utf8               tableNode
  #441 = Utf8               tableName
  #442 = Utf8               data
  #443 = Utf8               Ljava/util/StringTokenizer;
  #444 = Utf8               lambda$parseDocument$1
  #445 = Utf8               s0$
  #446 = Utf8               tmp1$
  #447 = Utf8               augmentationNode
  #448 = Utf8               Lext/mods/commons/data/StatSet;
  #449 = Utf8               k
  #450 = Utf8               <clinit>
  #451 = Utf8               SourceFile
  #452 = Utf8               AugmentationData.java
  #453 = Utf8               NestMembers
  #454 = Utf8               BootstrapMethods
  #455 = MethodType         #456          //  (Ljava/lang/Object;)I
  #456 = Utf8               (Ljava/lang/Object;)I
  #457 = MethodHandle       9:#63         // REF_invokeInterface java/util/List.size:()I
  #458 = MethodType         #459          //  (Ljava/util/List;)I
  #459 = Utf8               (Ljava/util/List;)I
  #460 = MethodType         #461          //  (Ljava/lang/Object;)V
  #461 = Utf8               (Ljava/lang/Object;)V
  #462 = MethodHandle       5:#463        // REF_invokeVirtual ext/mods/gameserver/data/xml/AugmentationData.lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
  #463 = Methodref          #13.#464      // ext/mods/gameserver/data/xml/AugmentationData.lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
  #464 = NameAndType        #418:#419     // lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
  #465 = MethodType         #419          //  (Lorg/w3c/dom/Node;)V
  #466 = MethodHandle       5:#467        // REF_invokeVirtual ext/mods/gameserver/data/xml/AugmentationData.lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
  #467 = Methodref          #13.#468      // ext/mods/gameserver/data/xml/AugmentationData.lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
  #468 = NameAndType        #444:#419     // lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
  #469 = MethodHandle       5:#470        // REF_invokeVirtual ext/mods/gameserver/data/xml/AugmentationData.lambda$parseDocument$2:(Lorg/w3c/dom/Node;)V
  #470 = Methodref          #13.#471      // ext/mods/gameserver/data/xml/AugmentationData.lambda$parseDocument$2:(Lorg/w3c/dom/Node;)V
  #471 = NameAndType        #422:#419     // lambda$parseDocument$2:(Lorg/w3c/dom/Node;)V
  #472 = MethodHandle       5:#473        // REF_invokeVirtual ext/mods/gameserver/data/xml/AugmentationData.lambda$parseDocument$3:(Ljava/util/List;Lorg/w3c/dom/Node;)V
  #473 = Methodref          #13.#474      // ext/mods/gameserver/data/xml/AugmentationData.lambda$parseDocument$3:(Ljava/util/List;Lorg/w3c/dom/Node;)V
  #474 = NameAndType        #426:#427     // lambda$parseDocument$3:(Ljava/util/List;Lorg/w3c/dom/Node;)V
  #475 = MethodHandle       5:#476        // REF_invokeVirtual ext/mods/gameserver/data/xml/AugmentationData.lambda$parseDocument$4:(Ljava/util/List;Ljava/util/List;Lorg/w3c/dom/Node;)V
  #476 = Methodref          #13.#477      // ext/mods/gameserver/data/xml/AugmentationData.lambda$parseDocument$4:(Ljava/util/List;Ljava/util/List;Lorg/w3c/dom/Node;)V
  #477 = NameAndType        #438:#439     // lambda$parseDocument$4:(Ljava/util/List;Ljava/util/List;Lorg/w3c/dom/Node;)V
  #478 = MethodHandle       6:#479        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #479 = Methodref          #480.#481     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #480 = Class              #482          // java/lang/invoke/LambdaMetafactory
  #481 = NameAndType        #483:#484     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #482 = Utf8               java/lang/invoke/LambdaMetafactory
  #483 = Utf8               metafactory
  #484 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #485 = Utf8               InnerClasses
  #486 = Utf8               AugmentationStat
  #487 = Utf8               AugStat
  #488 = Utf8               SingletonHolder
  #489 = Class              #490          // java/lang/invoke/MethodHandles$Lookup
  #490 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #491 = Class              #492          // java/lang/invoke/MethodHandles
  #492 = Utf8               java/lang/invoke/MethodHandles
  #493 = Utf8               Lookup
{
  protected ext.mods.gameserver.data.xml.AugmentationData();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=4, locals=4, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: new           #7                  // class java/util/ArrayList
         8: dup
         9: iconst_4
        10: invokespecial #9                  // Method java/util/ArrayList."<init>":(I)V
        13: putfield      #12                 // Field _augStats:Ljava/util/List;
        16: aload_0
        17: new           #7                  // class java/util/ArrayList
        20: dup
        21: bipush        10
        23: invokespecial #9                  // Method java/util/ArrayList."<init>":(I)V
        26: putfield      #18                 // Field _blueSkills:Ljava/util/List;
        29: aload_0
        30: new           #7                  // class java/util/ArrayList
        33: dup
        34: bipush        10
        36: invokespecial #9                  // Method java/util/ArrayList."<init>":(I)V
        39: putfield      #21                 // Field _purpleSkills:Ljava/util/List;
        42: aload_0
        43: new           #7                  // class java/util/ArrayList
        46: dup
        47: bipush        10
        49: invokespecial #9                  // Method java/util/ArrayList."<init>":(I)V
        52: putfield      #24                 // Field _redSkills:Ljava/util/List;
        55: aload_0
        56: new           #27                 // class java/util/HashMap
        59: dup
        60: invokespecial #29                 // Method java/util/HashMap."<init>":()V
        63: putfield      #30                 // Field _allSkills:Ljava/util/Map;
        66: iconst_0
        67: istore_1
        68: iload_1
        69: bipush        13
        71: if_icmpge     94
        74: getstatic     #34                 // Field STATS1_MAP:[B
        77: iload_1
        78: iload_1
        79: bastore
        80: getstatic     #38                 // Field STATS2_MAP:[B
        83: iload_1
        84: iload_1
        85: bastore
        86: iload_1
        87: iconst_1
        88: iadd
        89: i2b
        90: istore_1
        91: goto          68
        94: iconst_0
        95: istore_2
        96: iload_2
        97: bipush        13
        99: if_icmpge     143
       102: iload_2
       103: iconst_1
       104: iadd
       105: istore_3
       106: iload_3
       107: bipush        13
       109: if_icmpge     137
       112: getstatic     #34                 // Field STATS1_MAP:[B
       115: iload_1
       116: iload_2
       117: i2b
       118: bastore
       119: getstatic     #38                 // Field STATS2_MAP:[B
       122: iload_1
       123: iload_3
       124: i2b
       125: bastore
       126: iload_1
       127: iconst_1
       128: iadd
       129: i2b
       130: istore_1
       131: iinc          3, 1
       134: goto          106
       137: iinc          2, 1
       140: goto          96
       143: iconst_0
       144: istore_2
       145: iload_2
       146: iconst_4
       147: if_icmpge     173
       150: aload_0
       151: getfield      #12                 // Field _augStats:Ljava/util/List;
       154: new           #7                  // class java/util/ArrayList
       157: dup
       158: invokespecial #41                 // Method java/util/ArrayList."<init>":()V
       161: invokeinterface #42,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       166: pop
       167: iinc          2, 1
       170: goto          145
       173: iconst_0
       174: istore_2
       175: iload_2
       176: bipush        10
       178: if_icmpge     238
       181: aload_0
       182: getfield      #18                 // Field _blueSkills:Ljava/util/List;
       185: new           #7                  // class java/util/ArrayList
       188: dup
       189: invokespecial #41                 // Method java/util/ArrayList."<init>":()V
       192: invokeinterface #42,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       197: pop
       198: aload_0
       199: getfield      #21                 // Field _purpleSkills:Ljava/util/List;
       202: new           #7                  // class java/util/ArrayList
       205: dup
       206: invokespecial #41                 // Method java/util/ArrayList."<init>":()V
       209: invokeinterface #42,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       214: pop
       215: aload_0
       216: getfield      #24                 // Field _redSkills:Ljava/util/List;
       219: new           #7                  // class java/util/ArrayList
       222: dup
       223: invokespecial #41                 // Method java/util/ArrayList."<init>":()V
       226: invokeinterface #42,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       231: pop
       232: iinc          2, 1
       235: goto          175
       238: aload_0
       239: invokevirtual #48                 // Method load:()V
       242: return
      LineNumberTable:
        line 76: 0
        line 67: 4
        line 69: 16
        line 70: 29
        line 71: 42
        line 73: 55
        line 79: 66
        line 81: 74
        line 82: 80
        line 79: 86
        line 85: 94
        line 87: 102
        line 89: 112
        line 90: 119
        line 87: 126
        line 85: 137
        line 94: 143
        line 95: 150
        line 94: 167
        line 97: 173
        line 99: 181
        line 100: 198
        line 101: 215
        line 97: 232
        line 104: 238
        line 105: 242
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          106      31     3     j   I
           96      47     2     i   I
          145      28     2     i   I
          175      63     2     i   I
            0     243     0  this   Lext/mods/gameserver/data/xml/AugmentationData;
           68     175     1   idx   B
      StackMapTable: number_of_entries = 10
        frame_type = 255 /* full_frame */
          offset_delta = 68
          locals = [ class ext/mods/gameserver/data/xml/AugmentationData, int ]
          stack = []
        frame_type = 25 /* same */
        frame_type = 252 /* append */
          offset_delta = 1
          locals = [ int ]
        frame_type = 252 /* append */
          offset_delta = 9
          locals = [ int ]
        frame_type = 250 /* chop */
          offset_delta = 30
        frame_type = 250 /* chop */
          offset_delta = 5
        frame_type = 252 /* append */
          offset_delta = 1
          locals = [ int ]
        frame_type = 250 /* chop */
          offset_delta = 27
        frame_type = 252 /* append */
          offset_delta = 1
          locals = [ int ]
        frame_type = 250 /* chop */
          offset_delta = 62

  public void load();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=4, args_size=1
         0: aload_0
         1: ldc           #51                 // String xml/augmentation
         3: invokevirtual #53                 // Method parseDataFile:(Ljava/lang/String;)V
         6: getstatic     #57                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
         9: ldc           #61                 // String Loaded {} sets of augmentation stats.
        11: iconst_1
        12: anewarray     #2                  // class java/lang/Object
        15: dup
        16: iconst_0
        17: aload_0
        18: getfield      #12                 // Field _augStats:Ljava/util/List;
        21: invokeinterface #63,  1           // InterfaceMethod java/util/List.size:()I
        26: invokestatic  #67                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        29: aastore
        30: invokevirtual #73                 // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
        33: aload_0
        34: getfield      #18                 // Field _blueSkills:Ljava/util/List;
        37: invokeinterface #79,  1           // InterfaceMethod java/util/List.stream:()Ljava/util/stream/Stream;
        42: invokedynamic #83,  0             // InvokeDynamic #0:applyAsInt:()Ljava/util/function/ToIntFunction;
        47: invokeinterface #87,  2           // InterfaceMethod java/util/stream/Stream.mapToInt:(Ljava/util/function/ToIntFunction;)Ljava/util/stream/IntStream;
        52: invokeinterface #93,  1           // InterfaceMethod java/util/stream/IntStream.sum:()I
        57: istore_1
        58: aload_0
        59: getfield      #21                 // Field _purpleSkills:Ljava/util/List;
        62: invokeinterface #79,  1           // InterfaceMethod java/util/List.stream:()Ljava/util/stream/Stream;
        67: invokedynamic #83,  0             // InvokeDynamic #0:applyAsInt:()Ljava/util/function/ToIntFunction;
        72: invokeinterface #87,  2           // InterfaceMethod java/util/stream/Stream.mapToInt:(Ljava/util/function/ToIntFunction;)Ljava/util/stream/IntStream;
        77: invokeinterface #93,  1           // InterfaceMethod java/util/stream/IntStream.sum:()I
        82: istore_2
        83: aload_0
        84: getfield      #24                 // Field _redSkills:Ljava/util/List;
        87: invokeinterface #79,  1           // InterfaceMethod java/util/List.stream:()Ljava/util/stream/Stream;
        92: invokedynamic #83,  0             // InvokeDynamic #0:applyAsInt:()Ljava/util/function/ToIntFunction;
        97: invokeinterface #87,  2           // InterfaceMethod java/util/stream/Stream.mapToInt:(Ljava/util/function/ToIntFunction;)Ljava/util/stream/IntStream;
       102: invokeinterface #93,  1           // InterfaceMethod java/util/stream/IntStream.sum:()I
       107: istore_3
       108: getstatic     #57                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
       111: ldc           #98                 // String Loaded {} blue, {} purple and {} red Life-Stone skills.
       113: iconst_3
       114: anewarray     #2                  // class java/lang/Object
       117: dup
       118: iconst_0
       119: iload_1
       120: invokestatic  #67                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       123: aastore
       124: dup
       125: iconst_1
       126: iload_2
       127: invokestatic  #67                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       130: aastore
       131: dup
       132: iconst_2
       133: iload_3
       134: invokestatic  #67                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       137: aastore
       138: invokevirtual #73                 // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
       141: return
      LineNumberTable:
        line 110: 0
        line 111: 6
        line 113: 33
        line 114: 58
        line 115: 83
        line 116: 108
        line 117: 141
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     142     0  this   Lext/mods/gameserver/data/xml/AugmentationData;
           58      84     1  blue   I
           83      59     2 purple   I
          108      34     3   red   I

  public void parseDocument(org.w3c.dom.Document, java.nio.file.Path);
    descriptor: (Lorg/w3c/dom/Document;Ljava/nio/file/Path;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: ldc           #100                // String list
         4: aload_0
         5: invokedynamic #102,  0            // InvokeDynamic #1:accept:(Lext/mods/gameserver/data/xml/AugmentationData;)Ljava/util/function/Consumer;
        10: invokevirtual #106                // Method forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
        13: return
      LineNumberTable:
        line 122: 0
        line 171: 13
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0  this   Lext/mods/gameserver/data/xml/AugmentationData;
            0      14     1   doc   Lorg/w3c/dom/Document;
            0      14     2  path   Ljava/nio/file/Path;

  public ext.mods.gameserver.model.Augmentation generateRandomAugmentation(int, int);
    descriptor: (II)Lext/mods/gameserver/model/Augmentation;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=12, args_size=3
         0: iconst_0
         1: istore_3
         2: iconst_0
         3: istore        4
         5: iconst_0
         6: istore        5
         8: iconst_0
         9: istore        6
        11: iload_1
        12: bipush        9
        14: invokestatic  #110                // Method java/lang/Math.min:(II)I
        17: istore_1
        18: iload_2
        19: tableswitch   { // 0 to 3

                       0: 48

                       1: 81

                       2: 114

                       3: 147
                 default: 177
            }
        48: iconst_1
        49: bipush        100
        51: invokestatic  #116                // Method ext/mods/commons/random/Rnd.get:(II)I
        54: getstatic     #121                // Field ext/mods/Config.AUGMENTATION_NG_SKILL_CHANCE:I
        57: if_icmpgt     63
        60: iconst_1
        61: istore        5
        63: iconst_1
        64: bipush        100
        66: invokestatic  #116                // Method ext/mods/commons/random/Rnd.get:(II)I
        69: getstatic     #127                // Field ext/mods/Config.AUGMENTATION_NG_GLOW_CHANCE:I
        72: if_icmpgt     177
        75: iconst_1
        76: istore        6
        78: goto          177
        81: iconst_1
        82: bipush        100
        84: invokestatic  #116                // Method ext/mods/commons/random/Rnd.get:(II)I
        87: getstatic     #130                // Field ext/mods/Config.AUGMENTATION_MID_SKILL_CHANCE:I
        90: if_icmpgt     96
        93: iconst_1
        94: istore        5
        96: iconst_1
        97: bipush        100
        99: invokestatic  #116                // Method ext/mods/commons/random/Rnd.get:(II)I
       102: getstatic     #133                // Field ext/mods/Config.AUGMENTATION_MID_GLOW_CHANCE:I
       105: if_icmpgt     177
       108: iconst_1
       109: istore        6
       111: goto          177
       114: iconst_1
       115: bipush        100
       117: invokestatic  #116                // Method ext/mods/commons/random/Rnd.get:(II)I
       120: getstatic     #136                // Field ext/mods/Config.AUGMENTATION_HIGH_SKILL_CHANCE:I
       123: if_icmpgt     129
       126: iconst_1
       127: istore        5
       129: iconst_1
       130: bipush        100
       132: invokestatic  #116                // Method ext/mods/commons/random/Rnd.get:(II)I
       135: getstatic     #139                // Field ext/mods/Config.AUGMENTATION_HIGH_GLOW_CHANCE:I
       138: if_icmpgt     177
       141: iconst_1
       142: istore        6
       144: goto          177
       147: iconst_1
       148: bipush        100
       150: invokestatic  #116                // Method ext/mods/commons/random/Rnd.get:(II)I
       153: getstatic     #142                // Field ext/mods/Config.AUGMENTATION_TOP_SKILL_CHANCE:I
       156: if_icmpgt     162
       159: iconst_1
       160: istore        5
       162: iconst_1
       163: bipush        100
       165: invokestatic  #116                // Method ext/mods/commons/random/Rnd.get:(II)I
       168: getstatic     #145                // Field ext/mods/Config.AUGMENTATION_TOP_GLOW_CHANCE:I
       171: if_icmpgt     177
       174: iconst_1
       175: istore        6
       177: iload         5
       179: ifne          205
       182: iconst_1
       183: bipush        100
       185: invokestatic  #116                // Method ext/mods/commons/random/Rnd.get:(II)I
       188: getstatic     #148                // Field ext/mods/Config.AUGMENTATION_BASESTAT_CHANCE:I
       191: if_icmpgt     205
       194: sipush        16341
       197: sipush        16344
       200: invokestatic  #116                // Method ext/mods/commons/random/Rnd.get:(II)I
       203: istore        4
       205: iconst_0
       206: bipush        100
       208: invokestatic  #116                // Method ext/mods/commons/random/Rnd.get:(II)I
       211: istore        7
       213: iload         4
       215: ifne          247
       218: iload         5
       220: ifne          247
       223: iload         7
       225: bipush        15
       227: iload_2
       228: imul
       229: bipush        40
       231: iadd
       232: if_icmpgt     241
       235: iconst_1
       236: istore        7
       238: goto          290
       241: iconst_0
       242: istore        7
       244: goto          290
       247: iload         7
       249: bipush        10
       251: iload_2
       252: imul
       253: iconst_5
       254: iadd
       255: if_icmple     263
       258: iload         4
       260: ifeq          269
       263: iconst_3
       264: istore        7
       266: goto          290
       269: iload         7
       271: bipush        10
       273: iload_2
       274: imul
       275: bipush        10
       277: iadd
       278: if_icmpgt     287
       281: iconst_1
       282: istore        7
       284: goto          290
       287: iconst_2
       288: istore        7
       290: aconst_null
       291: astore        8
       293: iload         5
       295: ifeq          507
       298: iload         7
       300: tableswitch   { // 1 to 3

                       1: 328

                       2: 379

                       3: 430
                 default: 481
            }
       328: aload_0
       329: getfield      #18                 // Field _blueSkills:Ljava/util/List;
       332: iload_1
       333: invokeinterface #151,  2          // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
       338: checkcast     #43                 // class java/util/List
       341: iconst_0
       342: aload_0
       343: getfield      #18                 // Field _blueSkills:Ljava/util/List;
       346: iload_1
       347: invokeinterface #151,  2          // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
       352: checkcast     #43                 // class java/util/List
       355: invokeinterface #63,  1           // InterfaceMethod java/util/List.size:()I
       360: iconst_1
       361: isub
       362: invokestatic  #116                // Method ext/mods/commons/random/Rnd.get:(II)I
       365: invokeinterface #151,  2          // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
       370: checkcast     #68                 // class java/lang/Integer
       373: invokevirtual #154                // Method java/lang/Integer.intValue:()I
       376: goto          483
       379: aload_0
       380: getfield      #21                 // Field _purpleSkills:Ljava/util/List;
       383: iload_1
       384: invokeinterface #151,  2          // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
       389: checkcast     #43                 // class java/util/List
       392: iconst_0
       393: aload_0
       394: getfield      #21                 // Field _purpleSkills:Ljava/util/List;
       397: iload_1
       398: invokeinterface #151,  2          // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
       403: checkcast     #43                 // class java/util/List
       406: invokeinterface #63,  1           // InterfaceMethod java/util/List.size:()I
       411: iconst_1
       412: isub
       413: invokestatic  #116                // Method ext/mods/commons/random/Rnd.get:(II)I
       416: invokeinterface #151,  2          // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
       421: checkcast     #68                 // class java/lang/Integer
       424: invokevirtual #154                // Method java/lang/Integer.intValue:()I
       427: goto          483
       430: aload_0
       431: getfield      #24                 // Field _redSkills:Ljava/util/List;
       434: iload_1
       435: invokeinterface #151,  2          // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
       440: checkcast     #43                 // class java/util/List
       443: iconst_0
       444: aload_0
       445: getfield      #24                 // Field _redSkills:Ljava/util/List;
       448: iload_1
       449: invokeinterface #151,  2          // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
       454: checkcast     #43                 // class java/util/List
       457: invokeinterface #63,  1           // InterfaceMethod java/util/List.size:()I
       462: iconst_1
       463: isub
       464: invokestatic  #116                // Method ext/mods/commons/random/Rnd.get:(II)I
       467: invokeinterface #151,  2          // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
       472: checkcast     #68                 // class java/lang/Integer
       475: invokevirtual #154                // Method java/lang/Integer.intValue:()I
       478: goto          483
       481: iload         4
       483: istore        4
       485: aload_0
       486: getfield      #30                 // Field _allSkills:Ljava/util/Map;
       489: iload         4
       491: invokestatic  #67                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       494: invokeinterface #157,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
       499: checkcast     #162                // class ext/mods/gameserver/model/holder/IntIntHolder
       502: invokevirtual #164                // Method ext/mods/gameserver/model/holder/IntIntHolder.getSkill:()Lext/mods/gameserver/skills/L2Skill;
       505: astore        8
       507: iload         4
       509: ifne          625
       512: iconst_2
       513: iconst_3
       514: invokestatic  #116                // Method ext/mods/commons/random/Rnd.get:(II)I
       517: istore        10
       519: iload         7
       521: sipush        910
       524: imul
       525: iload         10
       527: sipush        3640
       530: imul
       531: iadd
       532: iconst_1
       533: iadd
       534: istore        11
       536: iload_1
       537: bipush        91
       539: imul
       540: iload         11
       542: iadd
       543: istore        9
       545: iload         9
       547: iload         9
       549: bipush        91
       551: iadd
       552: iconst_1
       553: isub
       554: invokestatic  #116                // Method ext/mods/commons/random/Rnd.get:(II)I
       557: istore        4
       559: iload         6
       561: ifeq          595
       564: iload_2
       565: iconst_2
       566: if_icmplt     595
       569: iload_1
       570: bipush        91
       572: imul
       573: iload         10
       575: iconst_2
       576: isub
       577: sipush        3640
       580: imul
       581: iadd
       582: iload_2
       583: sipush        910
       586: imul
       587: iadd
       588: iconst_1
       589: iadd
       590: istore        9
       592: goto          622
       595: iload_1
       596: bipush        91
       598: imul
       599: iload         10
       601: iconst_2
       602: isub
       603: sipush        3640
       606: imul
       607: iadd
       608: iconst_0
       609: iconst_1
       610: invokestatic  #116                // Method ext/mods/commons/random/Rnd.get:(II)I
       613: sipush        910
       616: imul
       617: iadd
       618: iconst_1
       619: iadd
       620: istore        9
       622: goto          680
       625: iload         6
       627: ifne          651
       630: iload_1
       631: bipush        91
       633: imul
       634: iconst_0
       635: iconst_1
       636: invokestatic  #116                // Method ext/mods/commons/random/Rnd.get:(II)I
       639: sipush        3640
       642: imul
       643: iadd
       644: iconst_1
       645: iadd
       646: istore        9
       648: goto          680
       651: iload_1
       652: bipush        91
       654: imul
       655: iconst_0
       656: iconst_1
       657: invokestatic  #116                // Method ext/mods/commons/random/Rnd.get:(II)I
       660: sipush        3640
       663: imul
       664: iadd
       665: iload_2
       666: iload         7
       668: iadd
       669: iconst_2
       670: idiv
       671: sipush        910
       674: imul
       675: iadd
       676: iconst_1
       677: iadd
       678: istore        9
       680: iload         9
       682: iload         9
       684: bipush        91
       686: iadd
       687: iconst_1
       688: isub
       689: invokestatic  #116                // Method ext/mods/commons/random/Rnd.get:(II)I
       692: istore_3
       693: new           #168                // class ext/mods/gameserver/model/Augmentation
       696: dup
       697: iload         4
       699: bipush        16
       701: ishl
       702: iload_3
       703: iadd
       704: aload         8
       706: invokespecial #170                // Method ext/mods/gameserver/model/Augmentation."<init>":(ILext/mods/gameserver/skills/L2Skill;)V
       709: areturn
      LineNumberTable:
        line 176: 0
        line 177: 2
        line 178: 5
        line 179: 8
        line 181: 11
        line 183: 18
        line 186: 48
        line 187: 60
        line 188: 63
        line 189: 75
        line 193: 81
        line 194: 93
        line 195: 96
        line 196: 108
        line 200: 114
        line 201: 126
        line 202: 129
        line 203: 141
        line 207: 147
        line 208: 159
        line 209: 162
        line 210: 174
        line 214: 177
        line 215: 194
        line 217: 205
        line 218: 213
        line 220: 223
        line 221: 235
        line 223: 241
        line 227: 247
        line 228: 263
        line 229: 269
        line 230: 281
        line 232: 287
        line 235: 290
        line 236: 293
        line 238: 298
        line 240: 328
        line 241: 379
        line 242: 430
        line 243: 481
        line 244: 483
        line 246: 485
        line 251: 507
        line 253: 512
        line 254: 519
        line 255: 536
        line 257: 545
        line 258: 559
        line 259: 569
        line 261: 595
        line 262: 622
        line 265: 625
        line 266: 630
        line 268: 651
        line 270: 680
        line 272: 693
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          519     103    10  temp   I
          536      86    11 colorOffset   I
          545      80     9 offset   I
          648       3     9 offset   I
            0     710     0  this   Lext/mods/gameserver/data/xml/AugmentationData;
            0     710     1 lifeStoneLevel   I
            0     710     2 lifeStoneGrade   I
            2     708     3 stat12   I
            5     705     4 stat34   I
            8     702     5 generateSkill   Z
           11     699     6 generateGlow   Z
          213     497     7 resultColor   I
          293     417     8 skill   Lext/mods/gameserver/skills/L2Skill;
          680      30     9 offset   I
      StackMapTable: number_of_entries = 27
        frame_type = 255 /* full_frame */
          offset_delta = 48
          locals = [ class ext/mods/gameserver/data/xml/AugmentationData, int, int, int, int, int, int ]
          stack = []
        frame_type = 14 /* same */
        frame_type = 17 /* same */
        frame_type = 14 /* same */
        frame_type = 17 /* same */
        frame_type = 14 /* same */
        frame_type = 17 /* same */
        frame_type = 14 /* same */
        frame_type = 14 /* same */
        frame_type = 27 /* same */
        frame_type = 252 /* append */
          offset_delta = 35
          locals = [ int ]
        frame_type = 5 /* same */
        frame_type = 15 /* same */
        frame_type = 5 /* same */
        frame_type = 17 /* same */
        frame_type = 2 /* same */
        frame_type = 252 /* append */
          offset_delta = 37
          locals = [ class ext/mods/gameserver/skills/L2Skill ]
        frame_type = 50 /* same */
        frame_type = 50 /* same */
        frame_type = 50 /* same */
        frame_type = 65 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 23 /* same */
        frame_type = 254 /* append */
          offset_delta = 87
          locals = [ int, int, int ]
        frame_type = 249 /* chop */
          offset_delta = 26
        frame_type = 250 /* chop */
          offset_delta = 2
        frame_type = 25 /* same */
        frame_type = 252 /* append */
          offset_delta = 28
          locals = [ int ]

  public java.util.List<ext.mods.gameserver.data.xml.AugmentationData$AugStat> getAugStatsById(int);
    descriptor: (I)Ljava/util/List;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=13, args_size=2
         0: new           #7                  // class java/util/ArrayList
         3: dup
         4: invokespecial #41                 // Method java/util/ArrayList."<init>":()V
         7: astore_2
         8: iconst_2
         9: newarray       int
        11: astore_3
        12: aload_3
        13: iconst_0
        14: ldc           #173                // int 65535
        16: iload_1
        17: iand
        18: iastore
        19: aload_3
        20: iconst_1
        21: iload_1
        22: bipush        16
        24: ishr
        25: iastore
        26: iconst_0
        27: istore        4
        29: iload         4
        31: iconst_2
        32: if_icmpge     419
        35: aload_3
        36: iload         4
        38: iaload
        39: iconst_1
        40: if_icmplt     276
        43: aload_3
        44: iload         4
        46: iaload
        47: sipush        14560
        50: if_icmpgt     276
        53: aload_3
        54: iload         4
        56: iaload
        57: iconst_1
        58: isub
        59: istore        5
        61: iload         5
        63: sipush        3640
        66: idiv
        67: istore        6
        69: iload         5
        71: sipush        3640
        74: irem
        75: istore        7
        77: iload         7
        79: bipush        91
        81: idiv
        82: istore        8
        84: iload         7
        86: bipush        91
        88: irem
        89: istore        9
        91: getstatic     #34                 // Field STATS1_MAP:[B
        94: iload         9
        96: baload
        97: istore        10
        99: getstatic     #38                 // Field STATS2_MAP:[B
       102: iload         9
       104: baload
       105: istore        11
       107: iload         10
       109: iload         11
       111: if_icmpne     169
       114: aload_0
       115: getfield      #12                 // Field _augStats:Ljava/util/List;
       118: iload         6
       120: invokeinterface #151,  2          // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
       125: checkcast     #43                 // class java/util/List
       128: iload         10
       130: invokeinterface #151,  2          // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
       135: checkcast     #174                // class ext/mods/gameserver/data/xml/AugmentationData$AugmentationStat
       138: astore        12
       140: aload_2
       141: new           #176                // class ext/mods/gameserver/data/xml/AugmentationData$AugStat
       144: dup
       145: aload         12
       147: invokevirtual #178                // Method ext/mods/gameserver/data/xml/AugmentationData$AugmentationStat.getStat:()Lext/mods/gameserver/enums/skills/Stats;
       150: aload         12
       152: iload         8
       154: invokevirtual #182                // Method ext/mods/gameserver/data/xml/AugmentationData$AugmentationStat.getSingleStatValue:(I)F
       157: invokespecial #186                // Method ext/mods/gameserver/data/xml/AugmentationData$AugStat."<init>":(Lext/mods/gameserver/enums/skills/Stats;F)V
       160: invokeinterface #42,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       165: pop
       166: goto          273
       169: aload_0
       170: getfield      #12                 // Field _augStats:Ljava/util/List;
       173: iload         6
       175: invokeinterface #151,  2          // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
       180: checkcast     #43                 // class java/util/List
       183: iload         10
       185: invokeinterface #151,  2          // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
       190: checkcast     #174                // class ext/mods/gameserver/data/xml/AugmentationData$AugmentationStat
       193: astore        12
       195: aload_2
       196: new           #176                // class ext/mods/gameserver/data/xml/AugmentationData$AugStat
       199: dup
       200: aload         12
       202: invokevirtual #178                // Method ext/mods/gameserver/data/xml/AugmentationData$AugmentationStat.getStat:()Lext/mods/gameserver/enums/skills/Stats;
       205: aload         12
       207: iload         8
       209: invokevirtual #189                // Method ext/mods/gameserver/data/xml/AugmentationData$AugmentationStat.getCombinedStatValue:(I)F
       212: invokespecial #186                // Method ext/mods/gameserver/data/xml/AugmentationData$AugStat."<init>":(Lext/mods/gameserver/enums/skills/Stats;F)V
       215: invokeinterface #42,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       220: pop
       221: aload_0
       222: getfield      #12                 // Field _augStats:Ljava/util/List;
       225: iload         6
       227: invokeinterface #151,  2          // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
       232: checkcast     #43                 // class java/util/List
       235: iload         11
       237: invokeinterface #151,  2          // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
       242: checkcast     #174                // class ext/mods/gameserver/data/xml/AugmentationData$AugmentationStat
       245: astore        12
       247: aload_2
       248: new           #176                // class ext/mods/gameserver/data/xml/AugmentationData$AugStat
       251: dup
       252: aload         12
       254: invokevirtual #178                // Method ext/mods/gameserver/data/xml/AugmentationData$AugmentationStat.getStat:()Lext/mods/gameserver/enums/skills/Stats;
       257: aload         12
       259: iload         8
       261: invokevirtual #189                // Method ext/mods/gameserver/data/xml/AugmentationData$AugmentationStat.getCombinedStatValue:(I)F
       264: invokespecial #186                // Method ext/mods/gameserver/data/xml/AugmentationData$AugStat."<init>":(Lext/mods/gameserver/enums/skills/Stats;F)V
       267: invokeinterface #42,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       272: pop
       273: goto          413
       276: aload_3
       277: iload         4
       279: iaload
       280: sipush        16341
       283: if_icmplt     413
       286: aload_3
       287: iload         4
       289: iaload
       290: sipush        16344
       293: if_icmpgt     413
       296: aload_3
       297: iload         4
       299: iaload
       300: tableswitch   { // 16341 to 16344

                   16341: 332

                   16342: 353

                   16343: 374

                   16344: 395
                 default: 413
            }
       332: aload_2
       333: new           #176                // class ext/mods/gameserver/data/xml/AugmentationData$AugStat
       336: dup
       337: getstatic     #192                // Field ext/mods/gameserver/enums/skills/Stats.STAT_STR:Lext/mods/gameserver/enums/skills/Stats;
       340: fconst_1
       341: invokespecial #186                // Method ext/mods/gameserver/data/xml/AugmentationData$AugStat."<init>":(Lext/mods/gameserver/enums/skills/Stats;F)V
       344: invokeinterface #42,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       349: pop
       350: goto          413
       353: aload_2
       354: new           #176                // class ext/mods/gameserver/data/xml/AugmentationData$AugStat
       357: dup
       358: getstatic     #198                // Field ext/mods/gameserver/enums/skills/Stats.STAT_CON:Lext/mods/gameserver/enums/skills/Stats;
       361: fconst_1
       362: invokespecial #186                // Method ext/mods/gameserver/data/xml/AugmentationData$AugStat."<init>":(Lext/mods/gameserver/enums/skills/Stats;F)V
       365: invokeinterface #42,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       370: pop
       371: goto          413
       374: aload_2
       375: new           #176                // class ext/mods/gameserver/data/xml/AugmentationData$AugStat
       378: dup
       379: getstatic     #201                // Field ext/mods/gameserver/enums/skills/Stats.STAT_INT:Lext/mods/gameserver/enums/skills/Stats;
       382: fconst_1
       383: invokespecial #186                // Method ext/mods/gameserver/data/xml/AugmentationData$AugStat."<init>":(Lext/mods/gameserver/enums/skills/Stats;F)V
       386: invokeinterface #42,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       391: pop
       392: goto          413
       395: aload_2
       396: new           #176                // class ext/mods/gameserver/data/xml/AugmentationData$AugStat
       399: dup
       400: getstatic     #204                // Field ext/mods/gameserver/enums/skills/Stats.STAT_MEN:Lext/mods/gameserver/enums/skills/Stats;
       403: fconst_1
       404: invokespecial #186                // Method ext/mods/gameserver/data/xml/AugmentationData$AugStat."<init>":(Lext/mods/gameserver/enums/skills/Stats;F)V
       407: invokeinterface #42,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       412: pop
       413: iinc          4, 1
       416: goto          29
       419: aload_2
       420: areturn
      LineNumberTable:
        line 282: 0
        line 283: 8
        line 284: 12
        line 285: 19
        line 287: 26
        line 289: 35
        line 291: 53
        line 292: 61
        line 293: 69
        line 294: 77
        line 295: 84
        line 297: 91
        line 298: 99
        line 300: 107
        line 302: 114
        line 303: 140
        line 304: 166
        line 307: 169
        line 308: 195
        line 310: 221
        line 311: 247
        line 313: 273
        line 314: 276
        line 316: 296
        line 318: 332
        line 319: 353
        line 320: 374
        line 321: 395
        line 287: 413
        line 325: 419
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          140      26    12    as   Lext/mods/gameserver/data/xml/AugmentationData$AugmentationStat;
          195      78    12    as   Lext/mods/gameserver/data/xml/AugmentationData$AugmentationStat;
           61     212     5  base   I
           69     204     6 color   I
           77     196     7 subblock   I
           84     189     8 level   I
           91     182     9  stat   I
           99     174    10 stat1   B
          107     166    11 stat2   B
           29     390     4     i   I
            0     421     0  this   Lext/mods/gameserver/data/xml/AugmentationData;
            0     421     1 augmentationId   I
            8     413     2  temp   Ljava/util/List;
           12     409     3 stats   [I
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            8     413     2  temp   Ljava/util/List<Lext/mods/gameserver/data/xml/AugmentationData$AugStat;>;
      StackMapTable: number_of_entries = 10
        frame_type = 254 /* append */
          offset_delta = 29
          locals = [ class java/util/List, class "[I", int ]
        frame_type = 255 /* full_frame */
          offset_delta = 139
          locals = [ class ext/mods/gameserver/data/xml/AugmentationData, int, class java/util/List, class "[I", int, int, int, int, int, int, int, int ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 103
          locals = [ class ext/mods/gameserver/data/xml/AugmentationData, int, class java/util/List, class "[I", int ]
          stack = []
        frame_type = 2 /* same */
        frame_type = 55 /* same */
        frame_type = 20 /* same */
        frame_type = 20 /* same */
        frame_type = 20 /* same */
        frame_type = 17 /* same */
        frame_type = 250 /* chop */
          offset_delta = 5
    Signature: #412                         // (I)Ljava/util/List<Lext/mods/gameserver/data/xml/AugmentationData$AugStat;>;

  public java.util.Map<java.lang.Integer, ext.mods.gameserver.model.holder.IntIntHolder> getAllSkills();
    descriptor: ()Ljava/util/Map;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #30                 // Field _allSkills:Ljava/util/Map;
         4: areturn
      LineNumberTable:
        line 401: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/data/xml/AugmentationData;
    Signature: #415                         // ()Ljava/util/Map<Ljava/lang/Integer;Lext/mods/gameserver/model/holder/IntIntHolder;>;

  public static final ext.mods.gameserver.data.xml.AugmentationData getInstance();
    descriptor: ()Lext/mods/gameserver/data/xml/AugmentationData;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #207                // Field ext/mods/gameserver/data/xml/AugmentationData$SingletonHolder.INSTANCE:Lext/mods/gameserver/data/xml/AugmentationData;
         3: areturn
      LineNumberTable:
        line 406: 0

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: bipush        91
         2: newarray       byte
         4: putstatic     #34                 // Field STATS1_MAP:[B
         7: bipush        91
         9: newarray       byte
        11: putstatic     #38                 // Field STATS2_MAP:[B
        14: return
      LineNumberTable:
        line 56: 0
        line 57: 7
}
SourceFile: "AugmentationData.java"
NestMembers:
  ext/mods/gameserver/data/xml/AugmentationData$SingletonHolder
  ext/mods/gameserver/data/xml/AugmentationData$AugmentationStat
  ext/mods/gameserver/data/xml/AugmentationData$AugStat
BootstrapMethods:
  0: #478 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #455 (Ljava/lang/Object;)I
      #457 REF_invokeInterface java/util/List.size:()I
      #458 (Ljava/util/List;)I
  1: #478 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #460 (Ljava/lang/Object;)V
      #462 REF_invokeVirtual ext/mods/gameserver/data/xml/AugmentationData.lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
      #465 (Lorg/w3c/dom/Node;)V
  2: #478 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #460 (Ljava/lang/Object;)V
      #466 REF_invokeVirtual ext/mods/gameserver/data/xml/AugmentationData.lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
      #465 (Lorg/w3c/dom/Node;)V
  3: #478 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #460 (Ljava/lang/Object;)V
      #469 REF_invokeVirtual ext/mods/gameserver/data/xml/AugmentationData.lambda$parseDocument$2:(Lorg/w3c/dom/Node;)V
      #465 (Lorg/w3c/dom/Node;)V
  4: #478 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #460 (Ljava/lang/Object;)V
      #472 REF_invokeVirtual ext/mods/gameserver/data/xml/AugmentationData.lambda$parseDocument$3:(Ljava/util/List;Lorg/w3c/dom/Node;)V
      #465 (Lorg/w3c/dom/Node;)V
  5: #478 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #460 (Ljava/lang/Object;)V
      #475 REF_invokeVirtual ext/mods/gameserver/data/xml/AugmentationData.lambda$parseDocument$4:(Ljava/util/List;Ljava/util/List;Lorg/w3c/dom/Node;)V
      #465 (Lorg/w3c/dom/Node;)V
InnerClasses:
  public static #486= #174 of #13;        // AugmentationStat=class ext/mods/gameserver/data/xml/AugmentationData$AugmentationStat of class ext/mods/gameserver/data/xml/AugmentationData
  public static #487= #176 of #13;        // AugStat=class ext/mods/gameserver/data/xml/AugmentationData$AugStat of class ext/mods/gameserver/data/xml/AugmentationData
  public static final #493= #489 of #491; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
