// Bytecode for: ext.mods.gameserver.data.xml.NpcData
// File: ext\mods\gameserver\data\xml\NpcData.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/data/xml/NpcData.class
  Last modified 9 de jul de 2026; size 14798 bytes
  MD5 checksum 903db79510289f5ed8655ab5301ba7ab
  Compiled from "NpcData.java"
public class ext.mods.gameserver.data.xml.NpcData implements ext.mods.commons.data.xml.IXmlReader
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #11                         // ext/mods/gameserver/data/xml/NpcData
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 1, methods: 25, attributes: 4
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
   #10 = Fieldref           #11.#12       // ext/mods/gameserver/data/xml/NpcData._npcs:Ljava/util/Map;
   #11 = Class              #13           // ext/mods/gameserver/data/xml/NpcData
   #12 = NameAndType        #14:#15       // _npcs:Ljava/util/Map;
   #13 = Utf8               ext/mods/gameserver/data/xml/NpcData
   #14 = Utf8               _npcs
   #15 = Utf8               Ljava/util/Map;
   #16 = Methodref          #11.#17       // ext/mods/gameserver/data/xml/NpcData.load:()V
   #17 = NameAndType        #18:#6        // load:()V
   #18 = Utf8               load
   #19 = String             #20           // xml/npcs
   #20 = Utf8               xml/npcs
   #21 = Methodref          #11.#22       // ext/mods/gameserver/data/xml/NpcData.parseDataFile:(Ljava/lang/String;)V
   #22 = NameAndType        #23:#24       // parseDataFile:(Ljava/lang/String;)V
   #23 = Utf8               parseDataFile
   #24 = Utf8               (Ljava/lang/String;)V
   #25 = Fieldref           #11.#26       // ext/mods/gameserver/data/xml/NpcData.LOGGER:Lext/mods/commons/logging/CLogger;
   #26 = NameAndType        #27:#28       // LOGGER:Lext/mods/commons/logging/CLogger;
   #27 = Utf8               LOGGER
   #28 = Utf8               Lext/mods/commons/logging/CLogger;
   #29 = String             #30           // Loaded {} NPC templates.
   #30 = Utf8               Loaded {} NPC templates.
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
   #51 = InvokeDynamic      #0:#52        // #0:accept:(Lext/mods/gameserver/data/xml/NpcData;)Ljava/util/function/Consumer;
   #52 = NameAndType        #53:#54       // accept:(Lext/mods/gameserver/data/xml/NpcData;)Ljava/util/function/Consumer;
   #53 = Utf8               accept
   #54 = Utf8               (Lext/mods/gameserver/data/xml/NpcData;)Ljava/util/function/Consumer;
   #55 = Methodref          #11.#56       // ext/mods/gameserver/data/xml/NpcData.forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
   #56 = NameAndType        #57:#58       // forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
   #57 = Utf8               forEach
   #58 = Utf8               (Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
   #59 = InterfaceMethodref #32.#60       // java/util/Map.clear:()V
   #60 = NameAndType        #61:#6        // clear:()V
   #61 = Utf8               clear
   #62 = InterfaceMethodref #32.#63       // java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
   #63 = NameAndType        #64:#65       // get:(Ljava/lang/Object;)Ljava/lang/Object;
   #64 = Utf8               get
   #65 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
   #66 = Class              #67           // ext/mods/gameserver/model/actor/template/NpcTemplate
   #67 = Utf8               ext/mods/gameserver/model/actor/template/NpcTemplate
   #68 = InterfaceMethodref #32.#69       // java/util/Map.values:()Ljava/util/Collection;
   #69 = NameAndType        #70:#71       // values:()Ljava/util/Collection;
   #70 = Utf8               values
   #71 = Utf8               ()Ljava/util/Collection;
   #72 = InterfaceMethodref #73.#74       // java/util/Collection.stream:()Ljava/util/stream/Stream;
   #73 = Class              #75           // java/util/Collection
   #74 = NameAndType        #76:#77       // stream:()Ljava/util/stream/Stream;
   #75 = Utf8               java/util/Collection
   #76 = Utf8               stream
   #77 = Utf8               ()Ljava/util/stream/Stream;
   #78 = InvokeDynamic      #1:#79        // #1:test:(Ljava/lang/String;)Ljava/util/function/Predicate;
   #79 = NameAndType        #80:#81       // test:(Ljava/lang/String;)Ljava/util/function/Predicate;
   #80 = Utf8               test
   #81 = Utf8               (Ljava/lang/String;)Ljava/util/function/Predicate;
   #82 = InterfaceMethodref #83.#84       // java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
   #83 = Class              #85           // java/util/stream/Stream
   #84 = NameAndType        #86:#87       // filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
   #85 = Utf8               java/util/stream/Stream
   #86 = Utf8               filter
   #87 = Utf8               (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
   #88 = InterfaceMethodref #83.#89       // java/util/stream/Stream.findFirst:()Ljava/util/Optional;
   #89 = NameAndType        #90:#91       // findFirst:()Ljava/util/Optional;
   #90 = Utf8               findFirst
   #91 = Utf8               ()Ljava/util/Optional;
   #92 = Methodref          #93.#94       // java/util/Optional.orElse:(Ljava/lang/Object;)Ljava/lang/Object;
   #93 = Class              #95           // java/util/Optional
   #94 = NameAndType        #96:#65       // orElse:(Ljava/lang/Object;)Ljava/lang/Object;
   #95 = Utf8               java/util/Optional
   #96 = Utf8               orElse
   #97 = InterfaceMethodref #83.#98       // java/util/stream/Stream.toList:()Ljava/util/List;
   #98 = NameAndType        #99:#100      // toList:()Ljava/util/List;
   #99 = Utf8               toList
  #100 = Utf8               ()Ljava/util/List;
  #101 = Fieldref           #102.#103     // ext/mods/gameserver/data/xml/NpcData$SingletonHolder.INSTANCE:Lext/mods/gameserver/data/xml/NpcData;
  #102 = Class              #104          // ext/mods/gameserver/data/xml/NpcData$SingletonHolder
  #103 = NameAndType        #105:#106     // INSTANCE:Lext/mods/gameserver/data/xml/NpcData;
  #104 = Utf8               ext/mods/gameserver/data/xml/NpcData$SingletonHolder
  #105 = Utf8               INSTANCE
  #106 = Utf8               Lext/mods/gameserver/data/xml/NpcData;
  #107 = Methodref          #66.#108      // ext/mods/gameserver/model/actor/template/NpcTemplate.getName:()Ljava/lang/String;
  #108 = NameAndType        #109:#110     // getName:()Ljava/lang/String;
  #109 = Utf8               getName
  #110 = Utf8               ()Ljava/lang/String;
  #111 = Methodref          #112.#113     // java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
  #112 = Class              #114          // java/lang/String
  #113 = NameAndType        #115:#116     // equalsIgnoreCase:(Ljava/lang/String;)Z
  #114 = Utf8               java/lang/String
  #115 = Utf8               equalsIgnoreCase
  #116 = Utf8               (Ljava/lang/String;)Z
  #117 = String             #118          // npc
  #118 = Utf8               npc
  #119 = InvokeDynamic      #2:#52        // #2:accept:(Lext/mods/gameserver/data/xml/NpcData;)Ljava/util/function/Consumer;
  #120 = InterfaceMethodref #121.#122     // org/w3c/dom/Node.getAttributes:()Lorg/w3c/dom/NamedNodeMap;
  #121 = Class              #123          // org/w3c/dom/Node
  #122 = NameAndType        #124:#125     // getAttributes:()Lorg/w3c/dom/NamedNodeMap;
  #123 = Utf8               org/w3c/dom/Node
  #124 = Utf8               getAttributes
  #125 = Utf8               ()Lorg/w3c/dom/NamedNodeMap;
  #126 = String             #127          // id
  #127 = Utf8               id
  #128 = Methodref          #11.#129      // ext/mods/gameserver/data/xml/NpcData.parseInteger:(Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)Ljava/lang/Integer;
  #129 = NameAndType        #130:#131     // parseInteger:(Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)Ljava/lang/Integer;
  #130 = Utf8               parseInteger
  #131 = Utf8               (Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)Ljava/lang/Integer;
  #132 = Methodref          #38.#133      // java/lang/Integer.intValue:()I
  #133 = NameAndType        #134:#36      // intValue:()I
  #134 = Utf8               intValue
  #135 = String             #136          // idTemplate
  #136 = Utf8               idTemplate
  #137 = InterfaceMethodref #138.#139     // org/w3c/dom/NamedNodeMap.getNamedItem:(Ljava/lang/String;)Lorg/w3c/dom/Node;
  #138 = Class              #140          // org/w3c/dom/NamedNodeMap
  #139 = NameAndType        #141:#142     // getNamedItem:(Ljava/lang/String;)Lorg/w3c/dom/Node;
  #140 = Utf8               org/w3c/dom/NamedNodeMap
  #141 = Utf8               getNamedItem
  #142 = Utf8               (Ljava/lang/String;)Lorg/w3c/dom/Node;
  #143 = Class              #144          // ext/mods/commons/data/StatSet
  #144 = Utf8               ext/mods/commons/data/StatSet
  #145 = Methodref          #143.#3       // ext/mods/commons/data/StatSet."<init>":()V
  #146 = Methodref          #143.#147     // ext/mods/commons/data/StatSet.set:(Ljava/lang/String;I)V
  #147 = NameAndType        #148:#149     // set:(Ljava/lang/String;I)V
  #148 = Utf8               set
  #149 = Utf8               (Ljava/lang/String;I)V
  #150 = String             #151          // name
  #151 = Utf8               name
  #152 = Methodref          #11.#153      // ext/mods/gameserver/data/xml/NpcData.parseString:(Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)Ljava/lang/String;
  #153 = NameAndType        #154:#155     // parseString:(Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)Ljava/lang/String;
  #154 = Utf8               parseString
  #155 = Utf8               (Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)Ljava/lang/String;
  #156 = Methodref          #143.#157     // ext/mods/commons/data/StatSet.set:(Ljava/lang/String;Ljava/lang/String;)V
  #157 = NameAndType        #148:#158     // set:(Ljava/lang/String;Ljava/lang/String;)V
  #158 = Utf8               (Ljava/lang/String;Ljava/lang/String;)V
  #159 = String             #160          // title
  #160 = Utf8               title
  #161 = String             #162          // alias
  #162 = Utf8               alias
  #163 = String             #148          // set
  #164 = InvokeDynamic      #3:#165       // #3:accept:(Lext/mods/gameserver/data/xml/NpcData;Lext/mods/commons/data/StatSet;)Ljava/util/function/Consumer;
  #165 = NameAndType        #53:#166      // accept:(Lext/mods/gameserver/data/xml/NpcData;Lext/mods/commons/data/StatSet;)Ljava/util/function/Consumer;
  #166 = Utf8               (Lext/mods/gameserver/data/xml/NpcData;Lext/mods/commons/data/StatSet;)Ljava/util/function/Consumer;
  #167 = String             #168          // ai
  #168 = Utf8               ai
  #169 = InvokeDynamic      #4:#165       // #4:accept:(Lext/mods/gameserver/data/xml/NpcData;Lext/mods/commons/data/StatSet;)Ljava/util/function/Consumer;
  #170 = String             #171          // drops
  #171 = Utf8               drops
  #172 = InvokeDynamic      #5:#165       // #5:accept:(Lext/mods/gameserver/data/xml/NpcData;Lext/mods/commons/data/StatSet;)Ljava/util/function/Consumer;
  #173 = String             #174          // privates
  #174 = Utf8               privates
  #175 = InvokeDynamic      #6:#165       // #6:accept:(Lext/mods/gameserver/data/xml/NpcData;Lext/mods/commons/data/StatSet;)Ljava/util/function/Consumer;
  #176 = String             #177          // petdata
  #177 = Utf8               petdata
  #178 = InvokeDynamic      #7:#165       // #7:accept:(Lext/mods/gameserver/data/xml/NpcData;Lext/mods/commons/data/StatSet;)Ljava/util/function/Consumer;
  #179 = String             #180          // skills
  #180 = Utf8               skills
  #181 = InvokeDynamic      #8:#182       // #8:accept:(Lext/mods/gameserver/data/xml/NpcData;Lext/mods/commons/data/StatSet;I)Ljava/util/function/Consumer;
  #182 = NameAndType        #53:#183      // accept:(Lext/mods/gameserver/data/xml/NpcData;Lext/mods/commons/data/StatSet;I)Ljava/util/function/Consumer;
  #183 = Utf8               (Lext/mods/gameserver/data/xml/NpcData;Lext/mods/commons/data/StatSet;I)Ljava/util/function/Consumer;
  #184 = String             #185          // teachTo
  #185 = Utf8               teachTo
  #186 = InvokeDynamic      #9:#165       // #9:accept:(Lext/mods/gameserver/data/xml/NpcData;Lext/mods/commons/data/StatSet;)Ljava/util/function/Consumer;
  #187 = String             #188          // mustUsePetTemplate
  #188 = Utf8               mustUsePetTemplate
  #189 = Methodref          #143.#190     // ext/mods/commons/data/StatSet.getBool:(Ljava/lang/String;Z)Z
  #190 = NameAndType        #191:#192     // getBool:(Ljava/lang/String;Z)Z
  #191 = Utf8               getBool
  #192 = Utf8               (Ljava/lang/String;Z)Z
  #193 = Class              #194          // ext/mods/gameserver/model/actor/template/PetTemplate
  #194 = Utf8               ext/mods/gameserver/model/actor/template/PetTemplate
  #195 = Methodref          #193.#196     // ext/mods/gameserver/model/actor/template/PetTemplate."<init>":(Lext/mods/commons/data/StatSet;)V
  #196 = NameAndType        #5:#197       // "<init>":(Lext/mods/commons/data/StatSet;)V
  #197 = Utf8               (Lext/mods/commons/data/StatSet;)V
  #198 = Methodref          #66.#196      // ext/mods/gameserver/model/actor/template/NpcTemplate."<init>":(Lext/mods/commons/data/StatSet;)V
  #199 = InterfaceMethodref #32.#200      // java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #200 = NameAndType        #201:#202     // put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #201 = Utf8               put
  #202 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #203 = String             #204          // classes
  #204 = Utf8               classes
  #205 = Class              #206          // java/util/ArrayList
  #206 = Utf8               java/util/ArrayList
  #207 = Methodref          #205.#3       // java/util/ArrayList."<init>":()V
  #208 = Class              #209          // java/util/EnumMap
  #209 = Utf8               java/util/EnumMap
  #210 = Class              #211          // ext/mods/gameserver/enums/actors/NpcSkillType
  #211 = Utf8               ext/mods/gameserver/enums/actors/NpcSkillType
  #212 = Methodref          #208.#213     // java/util/EnumMap."<init>":(Ljava/lang/Class;)V
  #213 = NameAndType        #5:#214       // "<init>":(Ljava/lang/Class;)V
  #214 = Utf8               (Ljava/lang/Class;)V
  #215 = String             #216          // skill
  #216 = Utf8               skill
  #217 = InvokeDynamic      #10:#218      // #10:accept:(Lext/mods/gameserver/data/xml/NpcData;Lext/mods/commons/data/StatSet;ILjava/util/List;Ljava/util/Map;)Ljava/util/function/Consumer;
  #218 = NameAndType        #53:#219      // accept:(Lext/mods/gameserver/data/xml/NpcData;Lext/mods/commons/data/StatSet;ILjava/util/List;Ljava/util/Map;)Ljava/util/function/Consumer;
  #219 = Utf8               (Lext/mods/gameserver/data/xml/NpcData;Lext/mods/commons/data/StatSet;ILjava/util/List;Ljava/util/Map;)Ljava/util/function/Consumer;
  #220 = String             #221          // passives
  #221 = Utf8               passives
  #222 = Methodref          #143.#223     // ext/mods/commons/data/StatSet.set:(Ljava/lang/String;Ljava/lang/Object;)V
  #223 = NameAndType        #148:#224     // set:(Ljava/lang/String;Ljava/lang/Object;)V
  #224 = Utf8               (Ljava/lang/String;Ljava/lang/Object;)V
  #225 = String             #226          // level
  #226 = Utf8               level
  #227 = Methodref          #228.#229     // ext/mods/gameserver/enums/actors/NpcRace.retrieveBySecondarySkillId:(I)Lext/mods/gameserver/enums/actors/NpcRace;
  #228 = Class              #230          // ext/mods/gameserver/enums/actors/NpcRace
  #229 = NameAndType        #231:#232     // retrieveBySecondarySkillId:(I)Lext/mods/gameserver/enums/actors/NpcRace;
  #230 = Utf8               ext/mods/gameserver/enums/actors/NpcRace
  #231 = Utf8               retrieveBySecondarySkillId
  #232 = Utf8               (I)Lext/mods/gameserver/enums/actors/NpcRace;
  #233 = Fieldref           #228.#234     // ext/mods/gameserver/enums/actors/NpcRace.DUMMY:Lext/mods/gameserver/enums/actors/NpcRace;
  #234 = NameAndType        #235:#236     // DUMMY:Lext/mods/gameserver/enums/actors/NpcRace;
  #235 = Utf8               DUMMY
  #236 = Utf8               Lext/mods/gameserver/enums/actors/NpcRace;
  #237 = String             #238          // race
  #238 = Utf8               race
  #239 = Methodref          #143.#240     // ext/mods/commons/data/StatSet.set:(Ljava/lang/String;Ljava/lang/Enum;)V
  #240 = NameAndType        #148:#241     // set:(Ljava/lang/String;Ljava/lang/Enum;)V
  #241 = Utf8               (Ljava/lang/String;Ljava/lang/Enum;)V
  #242 = Class              #243          // ext/mods/gameserver/skills/L2Skill
  #243 = Utf8               ext/mods/gameserver/skills/L2Skill
  #244 = Methodref          #143.#245     // ext/mods/commons/data/StatSet.containsKey:(Ljava/lang/Object;)Z
  #245 = NameAndType        #246:#247     // containsKey:(Ljava/lang/Object;)Z
  #246 = Utf8               containsKey
  #247 = Utf8               (Ljava/lang/Object;)Z
  #248 = Fieldref           #228.#249     // ext/mods/gameserver/enums/actors/NpcRace.VALUES:[Lext/mods/gameserver/enums/actors/NpcRace;
  #249 = NameAndType        #250:#251     // VALUES:[Lext/mods/gameserver/enums/actors/NpcRace;
  #250 = Utf8               VALUES
  #251 = Utf8               [Lext/mods/gameserver/enums/actors/NpcRace;
  #252 = String             #253          // type
  #253 = Utf8               type
  #254 = String             #255          // ;
  #255 = Utf8               ;
  #256 = Methodref          #112.#257     // java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
  #257 = NameAndType        #258:#259     // split:(Ljava/lang/String;)[Ljava/lang/String;
  #258 = Utf8               split
  #259 = Utf8               (Ljava/lang/String;)[Ljava/lang/String;
  #260 = Methodref          #261.#262     // ext/mods/gameserver/data/SkillTable.getInstance:()Lext/mods/gameserver/data/SkillTable;
  #261 = Class              #263          // ext/mods/gameserver/data/SkillTable
  #262 = NameAndType        #264:#265     // getInstance:()Lext/mods/gameserver/data/SkillTable;
  #263 = Utf8               ext/mods/gameserver/data/SkillTable
  #264 = Utf8               getInstance
  #265 = Utf8               ()Lext/mods/gameserver/data/SkillTable;
  #266 = Methodref          #261.#267     // ext/mods/gameserver/data/SkillTable.getInfo:(II)Lext/mods/gameserver/skills/L2Skill;
  #267 = NameAndType        #268:#269     // getInfo:(II)Lext/mods/gameserver/skills/L2Skill;
  #268 = Utf8               getInfo
  #269 = Utf8               (II)Lext/mods/gameserver/skills/L2Skill;
  #270 = String             #271          // Invalid skill data {}-{} for : {}.
  #271 = Utf8               Invalid skill data {}-{} for : {}.
  #272 = Methodref          #44.#273      // ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;[Ljava/lang/Object;)V
  #273 = NameAndType        #274:#48      // warn:(Ljava/lang/Object;[Ljava/lang/Object;)V
  #274 = Utf8               warn
  #275 = Methodref          #276.#277     // java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
  #276 = Class              #278          // java/lang/Enum
  #277 = NameAndType        #41:#279      // valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
  #278 = Utf8               java/lang/Enum
  #279 = Utf8               (Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
  #280 = Fieldref           #210.#281     // ext/mods/gameserver/enums/actors/NpcSkillType.PASSIVE:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #281 = NameAndType        #282:#283     // PASSIVE:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #282 = Utf8               PASSIVE
  #283 = Utf8               Lext/mods/gameserver/enums/actors/NpcSkillType;
  #284 = InterfaceMethodref #285.#286     // java/util/List.add:(Ljava/lang/Object;)Z
  #285 = Class              #287          // java/util/List
  #286 = NameAndType        #288:#247     // add:(Ljava/lang/Object;)Z
  #287 = Utf8               java/util/List
  #288 = Utf8               add
  #289 = Methodref          #143.#290     // ext/mods/commons/data/StatSet.set:(Ljava/lang/String;Z)V
  #290 = NameAndType        #148:#291     // set:(Ljava/lang/String;Z)V
  #291 = Utf8               (Ljava/lang/String;Z)V
  #292 = String             #293          // food1
  #293 = Utf8               food1
  #294 = String             #295          // food2
  #295 = Utf8               food2
  #296 = String             #297          // autoFeedLimit
  #297 = Utf8               autoFeedLimit
  #298 = Methodref          #11.#299      // ext/mods/gameserver/data/xml/NpcData.parseDouble:(Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)Ljava/lang/Double;
  #299 = NameAndType        #300:#301     // parseDouble:(Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)Ljava/lang/Double;
  #300 = Utf8               parseDouble
  #301 = Utf8               (Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)Ljava/lang/Double;
  #302 = String             #303          // hungryLimit
  #303 = Utf8               hungryLimit
  #304 = String             #305          // unsummonLimit
  #305 = Utf8               unsummonLimit
  #306 = String             #307          // stat
  #307 = Utf8               stat
  #308 = InvokeDynamic      #11:#309      // #11:accept:(Lext/mods/gameserver/data/xml/NpcData;Ljava/util/Map;)Ljava/util/function/Consumer;
  #309 = NameAndType        #53:#310      // accept:(Lext/mods/gameserver/data/xml/NpcData;Ljava/util/Map;)Ljava/util/function/Consumer;
  #310 = Utf8               (Lext/mods/gameserver/data/xml/NpcData;Ljava/util/Map;)Ljava/util/function/Consumer;
  #311 = String             #312          // petData
  #312 = Utf8               petData
  #313 = Methodref          #11.#314      // ext/mods/gameserver/data/xml/NpcData.parseAttributes:(Lorg/w3c/dom/Node;)Lext/mods/commons/data/StatSet;
  #314 = NameAndType        #315:#316     // parseAttributes:(Lorg/w3c/dom/Node;)Lext/mods/commons/data/StatSet;
  #315 = Utf8               parseAttributes
  #316 = Utf8               (Lorg/w3c/dom/Node;)Lext/mods/commons/data/StatSet;
  #317 = String             #318          // speedOnRide
  #318 = Utf8               speedOnRide
  #319 = Methodref          #143.#320     // ext/mods/commons/data/StatSet.getString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #320 = NameAndType        #321:#322     // getString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #321 = Utf8               getString
  #322 = Utf8               (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #323 = Methodref          #38.#324      // java/lang/Integer.parseInt:(Ljava/lang/String;)I
  #324 = NameAndType        #325:#326     // parseInt:(Ljava/lang/String;)I
  #325 = Utf8               parseInt
  #326 = Utf8               (Ljava/lang/String;)I
  #327 = String             #328          // mountBaseSpeed
  #328 = Utf8               mountBaseSpeed
  #329 = String             #330          // mountWaterSpeed
  #330 = Utf8               mountWaterSpeed
  #331 = String             #332          // mountFlySpeed
  #332 = Utf8               mountFlySpeed
  #333 = Methodref          #143.#334     // ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
  #334 = NameAndType        #335:#326     // getInteger:(Ljava/lang/String;)I
  #335 = Utf8               getInteger
  #336 = Class              #337          // ext/mods/gameserver/model/records/PetDataEntry
  #337 = Utf8               ext/mods/gameserver/model/records/PetDataEntry
  #338 = Methodref          #336.#196     // ext/mods/gameserver/model/records/PetDataEntry."<init>":(Lext/mods/commons/data/StatSet;)V
  #339 = String             #340          // private
  #340 = Utf8               private
  #341 = InvokeDynamic      #12:#342      // #12:accept:(Lext/mods/gameserver/data/xml/NpcData;Ljava/util/List;)Ljava/util/function/Consumer;
  #342 = NameAndType        #53:#343      // accept:(Lext/mods/gameserver/data/xml/NpcData;Ljava/util/List;)Ljava/util/function/Consumer;
  #343 = Utf8               (Lext/mods/gameserver/data/xml/NpcData;Ljava/util/List;)Ljava/util/function/Consumer;
  #344 = Class              #345          // ext/mods/gameserver/model/records/PrivateData
  #345 = Utf8               ext/mods/gameserver/model/records/PrivateData
  #346 = Methodref          #344.#196     // ext/mods/gameserver/model/records/PrivateData."<init>":(Lext/mods/commons/data/StatSet;)V
  #347 = String             #348          // category
  #348 = Utf8               category
  #349 = InvokeDynamic      #13:#342      // #13:accept:(Lext/mods/gameserver/data/xml/NpcData;Ljava/util/List;)Ljava/util/function/Consumer;
  #350 = Class              #351          // ext/mods/gameserver/enums/DropType
  #351 = Utf8               ext/mods/gameserver/enums/DropType
  #352 = Methodref          #11.#353      // ext/mods/gameserver/data/xml/NpcData.parseEnum:(Lorg/w3c/dom/NamedNodeMap;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
  #353 = NameAndType        #354:#355     // parseEnum:(Lorg/w3c/dom/NamedNodeMap;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
  #354 = Utf8               parseEnum
  #355 = Utf8               (Lorg/w3c/dom/NamedNodeMap;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
  #356 = Fieldref           #357.#358     // ext/mods/Config.SKIP_CATEGORY:[Ljava/lang/String;
  #357 = Class              #359          // ext/mods/Config
  #358 = NameAndType        #360:#361     // SKIP_CATEGORY:[Ljava/lang/String;
  #359 = Utf8               ext/mods/Config
  #360 = Utf8               SKIP_CATEGORY
  #361 = Utf8               [Ljava/lang/String;
  #362 = Methodref          #112.#363     // java/lang/String.trim:()Ljava/lang/String;
  #363 = NameAndType        #364:#110     // trim:()Ljava/lang/String;
  #364 = Utf8               trim
  #365 = Methodref          #350.#366     // ext/mods/gameserver/enums/DropType.name:()Ljava/lang/String;
  #366 = NameAndType        #151:#110     // name:()Ljava/lang/String;
  #367 = Class              #368          // ext/mods/gameserver/model/item/DropCategory
  #368 = Utf8               ext/mods/gameserver/model/item/DropCategory
  #369 = String             #370          // chance
  #370 = Utf8               chance
  #371 = Double             100.0d
  #373 = Methodref          #374.#375     // java/lang/Double.valueOf:(D)Ljava/lang/Double;
  #374 = Class              #376          // java/lang/Double
  #375 = NameAndType        #41:#377      // valueOf:(D)Ljava/lang/Double;
  #376 = Utf8               java/lang/Double
  #377 = Utf8               (D)Ljava/lang/Double;
  #378 = Methodref          #11.#379      // ext/mods/gameserver/data/xml/NpcData.parseDouble:(Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;Ljava/lang/Double;)Ljava/lang/Double;
  #379 = NameAndType        #300:#380     // parseDouble:(Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;Ljava/lang/Double;)Ljava/lang/Double;
  #380 = Utf8               (Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;Ljava/lang/Double;)Ljava/lang/Double;
  #381 = Methodref          #374.#382     // java/lang/Double.doubleValue:()D
  #382 = NameAndType        #383:#384     // doubleValue:()D
  #383 = Utf8               doubleValue
  #384 = Utf8               ()D
  #385 = Methodref          #367.#386     // ext/mods/gameserver/model/item/DropCategory."<init>":(Lext/mods/gameserver/enums/DropType;D)V
  #386 = NameAndType        #5:#387       // "<init>":(Lext/mods/gameserver/enums/DropType;D)V
  #387 = Utf8               (Lext/mods/gameserver/enums/DropType;D)V
  #388 = String             #389          // drop
  #389 = Utf8               drop
  #390 = InvokeDynamic      #14:#391      // #14:accept:(Lext/mods/gameserver/data/xml/NpcData;Lext/mods/gameserver/model/item/DropCategory;)Ljava/util/function/Consumer;
  #391 = NameAndType        #53:#392      // accept:(Lext/mods/gameserver/data/xml/NpcData;Lext/mods/gameserver/model/item/DropCategory;)Ljava/util/function/Consumer;
  #392 = Utf8               (Lext/mods/gameserver/data/xml/NpcData;Lext/mods/gameserver/model/item/DropCategory;)Ljava/util/function/Consumer;
  #393 = Class              #394          // ext/mods/gameserver/model/item/DropData
  #394 = Utf8               ext/mods/gameserver/model/item/DropData
  #395 = String             #396          // itemid
  #396 = Utf8               itemid
  #397 = String             #398          // min
  #398 = Utf8               min
  #399 = String             #400          // max
  #400 = Utf8               max
  #401 = Methodref          #393.#402     // ext/mods/gameserver/model/item/DropData."<init>":(IIID)V
  #402 = NameAndType        #5:#403       // "<init>":(IIID)V
  #403 = Utf8               (IIID)V
  #404 = Methodref          #405.#406     // ext/mods/gameserver/data/xml/ItemData.getInstance:()Lext/mods/gameserver/data/xml/ItemData;
  #405 = Class              #407          // ext/mods/gameserver/data/xml/ItemData
  #406 = NameAndType        #264:#408     // getInstance:()Lext/mods/gameserver/data/xml/ItemData;
  #407 = Utf8               ext/mods/gameserver/data/xml/ItemData
  #408 = Utf8               ()Lext/mods/gameserver/data/xml/ItemData;
  #409 = Methodref          #393.#410     // ext/mods/gameserver/model/item/DropData.getItemId:()I
  #410 = NameAndType        #411:#36      // getItemId:()I
  #411 = Utf8               getItemId
  #412 = Methodref          #405.#413     // ext/mods/gameserver/data/xml/ItemData.getTemplate:(I)Lext/mods/gameserver/model/item/kind/Item;
  #413 = NameAndType        #414:#415     // getTemplate:(I)Lext/mods/gameserver/model/item/kind/Item;
  #414 = Utf8               getTemplate
  #415 = Utf8               (I)Lext/mods/gameserver/model/item/kind/Item;
  #416 = String             #417          // Droplist data for undefined itemId: {}.
  #417 = Utf8               Droplist data for undefined itemId: {}.
  #418 = Methodref          #419.#420     // ext/mods/gameserver/data/xml/SkipData.getInstance:()Lext/mods/gameserver/data/xml/SkipData;
  #419 = Class              #421          // ext/mods/gameserver/data/xml/SkipData
  #420 = NameAndType        #264:#422     // getInstance:()Lext/mods/gameserver/data/xml/SkipData;
  #421 = Utf8               ext/mods/gameserver/data/xml/SkipData
  #422 = Utf8               ()Lext/mods/gameserver/data/xml/SkipData;
  #423 = Methodref          #419.#424     // ext/mods/gameserver/data/xml/SkipData.isSkipped:(I)Z
  #424 = NameAndType        #425:#426     // isSkipped:(I)Z
  #425 = Utf8               isSkipped
  #426 = Utf8               (I)Z
  #427 = Methodref          #367.#428     // ext/mods/gameserver/model/item/DropCategory.addDropData:(Lext/mods/gameserver/model/item/DropData;)V
  #428 = NameAndType        #429:#430     // addDropData:(Lext/mods/gameserver/model/item/DropData;)V
  #429 = Utf8               addDropData
  #430 = Utf8               (Lext/mods/gameserver/model/item/DropData;)V
  #431 = Class              #432          // ext/mods/gameserver/model/memo/NpcMemo
  #432 = Utf8               ext/mods/gameserver/model/memo/NpcMemo
  #433 = Methodref          #431.#3       // ext/mods/gameserver/model/memo/NpcMemo."<init>":()V
  #434 = InvokeDynamic      #15:#435      // #15:accept:(Lext/mods/gameserver/data/xml/NpcData;Lext/mods/gameserver/model/memo/NpcMemo;)Ljava/util/function/Consumer;
  #435 = NameAndType        #53:#436      // accept:(Lext/mods/gameserver/data/xml/NpcData;Lext/mods/gameserver/model/memo/NpcMemo;)Ljava/util/function/Consumer;
  #436 = Utf8               (Lext/mods/gameserver/data/xml/NpcData;Lext/mods/gameserver/model/memo/NpcMemo;)Ljava/util/function/Consumer;
  #437 = String             #438          // aiParams
  #438 = Utf8               aiParams
  #439 = String             #440          // val
  #440 = Utf8               val
  #441 = Methodref          #431.#157     // ext/mods/gameserver/model/memo/NpcMemo.set:(Ljava/lang/String;Ljava/lang/String;)V
  #442 = Class              #443          // ext/mods/commons/data/xml/IXmlReader
  #443 = Utf8               ext/mods/commons/data/xml/IXmlReader
  #444 = Utf8               Signature
  #445 = Utf8               Ljava/util/Map<Ljava/lang/Integer;Lext/mods/gameserver/model/actor/template/NpcTemplate;>;
  #446 = Utf8               Code
  #447 = Utf8               LineNumberTable
  #448 = Utf8               LocalVariableTable
  #449 = Utf8               this
  #450 = Utf8               parseDocument
  #451 = Utf8               (Lorg/w3c/dom/Document;Ljava/nio/file/Path;)V
  #452 = Utf8               doc
  #453 = Utf8               Lorg/w3c/dom/Document;
  #454 = Utf8               path
  #455 = Utf8               Ljava/nio/file/Path;
  #456 = Utf8               reload
  #457 = Utf8               (I)Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #458 = Utf8               I
  #459 = Utf8               getTemplateByName
  #460 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #461 = Utf8               Ljava/lang/String;
  #462 = Utf8               getTemplates
  #463 = Utf8               (Ljava/util/function/Predicate;)Ljava/util/List;
  #464 = Utf8               Ljava/util/function/Predicate;
  #465 = Utf8               LocalVariableTypeTable
  #466 = Utf8               Ljava/util/function/Predicate<Lext/mods/gameserver/model/actor/template/NpcTemplate;>;
  #467 = Utf8               (Ljava/util/function/Predicate<Lext/mods/gameserver/model/actor/template/NpcTemplate;>;)Ljava/util/List<Lext/mods/gameserver/model/actor/template/NpcTemplate;>;
  #468 = Utf8               ()Ljava/util/Collection<Lext/mods/gameserver/model/actor/template/NpcTemplate;>;
  #469 = Utf8               ()Lext/mods/gameserver/data/xml/NpcData;
  #470 = Utf8               lambda$getTemplateByName$0
  #471 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/actor/template/NpcTemplate;)Z
  #472 = Utf8               t
  #473 = Utf8               Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #474 = Utf8               lambda$parseDocument$0
  #475 = Utf8               (Lorg/w3c/dom/Node;)V
  #476 = Utf8               listNode
  #477 = Utf8               Lorg/w3c/dom/Node;
  #478 = Utf8               lambda$parseDocument$1
  #479 = Utf8               npcNode
  #480 = Utf8               attrs
  #481 = Utf8               Lorg/w3c/dom/NamedNodeMap;
  #482 = Utf8               npcId
  #483 = Utf8               templateId
  #484 = Utf8               Lext/mods/commons/data/StatSet;
  #485 = Utf8               StackMapTable
  #486 = Utf8               lambda$parseDocument$14
  #487 = Utf8               (Lext/mods/commons/data/StatSet;Lorg/w3c/dom/Node;)V
  #488 = Utf8               teachToNode
  #489 = Utf8               lambda$parseDocument$12
  #490 = Utf8               (Lext/mods/commons/data/StatSet;ILorg/w3c/dom/Node;)V
  #491 = Utf8               skillsNode
  #492 = Utf8               Ljava/util/List;
  #493 = Utf8               Ljava/util/List<Lext/mods/gameserver/skills/L2Skill;>;
  #494 = Utf8               Ljava/util/Map<Lext/mods/gameserver/enums/actors/NpcSkillType;Lext/mods/gameserver/skills/L2Skill;>;
  #495 = Utf8               lambda$parseDocument$13
  #496 = Utf8               (Lext/mods/commons/data/StatSet;ILjava/util/List;Ljava/util/Map;Lorg/w3c/dom/Node;)V
  #497 = Utf8               Lext/mods/gameserver/skills/L2Skill;
  #498 = Utf8               nst
  #499 = Utf8               nstString
  #500 = Utf8               arr$
  #501 = Utf8               len$
  #502 = Utf8               i$
  #503 = Utf8               skillNode
  #504 = Utf8               skillAttrs
  #505 = Utf8               skillId
  #506 = Utf8               nr
  #507 = Class              #361          // "[Ljava/lang/String;"
  #508 = Utf8               lambda$parseDocument$10
  #509 = Utf8               petdataNode
  #510 = Utf8               petdataAttrs
  #511 = Utf8               entries
  #512 = Utf8               Ljava/util/Map<Ljava/lang/Integer;Lext/mods/gameserver/model/records/PetDataEntry;>;
  #513 = Utf8               lambda$parseDocument$11
  #514 = Utf8               (Ljava/util/Map;Lorg/w3c/dom/Node;)V
  #515 = Utf8               speeds
  #516 = Utf8               statNode
  #517 = Utf8               petSet
  #518 = Utf8               speed
  #519 = Utf8               lambda$parseDocument$8
  #520 = Utf8               privatesNode
  #521 = Utf8               privateData
  #522 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/records/PrivateData;>;
  #523 = Utf8               lambda$parseDocument$9
  #524 = Utf8               (Ljava/util/List;Lorg/w3c/dom/Node;)V
  #525 = Utf8               privateNode
  #526 = Utf8               lambda$parseDocument$5
  #527 = Utf8               dropsNode
  #528 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/item/DropCategory;>;
  #529 = Utf8               lambda$parseDocument$6
  #530 = Utf8               skipType
  #531 = Utf8               categoryNode
  #532 = Utf8               categoryAttrs
  #533 = Utf8               dropType
  #534 = Utf8               Lext/mods/gameserver/enums/DropType;
  #535 = Utf8               Lext/mods/gameserver/model/item/DropCategory;
  #536 = Utf8               lambda$parseDocument$7
  #537 = Utf8               (Lext/mods/gameserver/model/item/DropCategory;Lorg/w3c/dom/Node;)V
  #538 = Utf8               dropNode
  #539 = Utf8               dropAttrs
  #540 = Utf8               data
  #541 = Utf8               Lext/mods/gameserver/model/item/DropData;
  #542 = Utf8               lambda$parseDocument$3
  #543 = Utf8               aiNode
  #544 = Utf8               Lext/mods/gameserver/model/memo/NpcMemo;
  #545 = Utf8               lambda$parseDocument$4
  #546 = Utf8               (Lext/mods/gameserver/model/memo/NpcMemo;Lorg/w3c/dom/Node;)V
  #547 = Utf8               setNode
  #548 = Utf8               setAttrs
  #549 = Utf8               lambda$parseDocument$2
  #550 = Utf8               SourceFile
  #551 = Utf8               NpcData.java
  #552 = Utf8               NestMembers
  #553 = Utf8               BootstrapMethods
  #554 = MethodType         #555          //  (Ljava/lang/Object;)V
  #555 = Utf8               (Ljava/lang/Object;)V
  #556 = MethodHandle       5:#557        // REF_invokeVirtual ext/mods/gameserver/data/xml/NpcData.lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
  #557 = Methodref          #11.#558      // ext/mods/gameserver/data/xml/NpcData.lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
  #558 = NameAndType        #474:#475     // lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
  #559 = MethodType         #475          //  (Lorg/w3c/dom/Node;)V
  #560 = MethodType         #247          //  (Ljava/lang/Object;)Z
  #561 = MethodHandle       6:#562        // REF_invokeStatic ext/mods/gameserver/data/xml/NpcData.lambda$getTemplateByName$0:(Ljava/lang/String;Lext/mods/gameserver/model/actor/template/NpcTemplate;)Z
  #562 = Methodref          #11.#563      // ext/mods/gameserver/data/xml/NpcData.lambda$getTemplateByName$0:(Ljava/lang/String;Lext/mods/gameserver/model/actor/template/NpcTemplate;)Z
  #563 = NameAndType        #470:#471     // lambda$getTemplateByName$0:(Ljava/lang/String;Lext/mods/gameserver/model/actor/template/NpcTemplate;)Z
  #564 = MethodType         #565          //  (Lext/mods/gameserver/model/actor/template/NpcTemplate;)Z
  #565 = Utf8               (Lext/mods/gameserver/model/actor/template/NpcTemplate;)Z
  #566 = MethodHandle       5:#567        // REF_invokeVirtual ext/mods/gameserver/data/xml/NpcData.lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
  #567 = Methodref          #11.#568      // ext/mods/gameserver/data/xml/NpcData.lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
  #568 = NameAndType        #478:#475     // lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
  #569 = MethodHandle       5:#570        // REF_invokeVirtual ext/mods/gameserver/data/xml/NpcData.lambda$parseDocument$2:(Lext/mods/commons/data/StatSet;Lorg/w3c/dom/Node;)V
  #570 = Methodref          #11.#571      // ext/mods/gameserver/data/xml/NpcData.lambda$parseDocument$2:(Lext/mods/commons/data/StatSet;Lorg/w3c/dom/Node;)V
  #571 = NameAndType        #549:#487     // lambda$parseDocument$2:(Lext/mods/commons/data/StatSet;Lorg/w3c/dom/Node;)V
  #572 = MethodHandle       5:#573        // REF_invokeVirtual ext/mods/gameserver/data/xml/NpcData.lambda$parseDocument$3:(Lext/mods/commons/data/StatSet;Lorg/w3c/dom/Node;)V
  #573 = Methodref          #11.#574      // ext/mods/gameserver/data/xml/NpcData.lambda$parseDocument$3:(Lext/mods/commons/data/StatSet;Lorg/w3c/dom/Node;)V
  #574 = NameAndType        #542:#487     // lambda$parseDocument$3:(Lext/mods/commons/data/StatSet;Lorg/w3c/dom/Node;)V
  #575 = MethodHandle       5:#576        // REF_invokeVirtual ext/mods/gameserver/data/xml/NpcData.lambda$parseDocument$5:(Lext/mods/commons/data/StatSet;Lorg/w3c/dom/Node;)V
  #576 = Methodref          #11.#577      // ext/mods/gameserver/data/xml/NpcData.lambda$parseDocument$5:(Lext/mods/commons/data/StatSet;Lorg/w3c/dom/Node;)V
  #577 = NameAndType        #526:#487     // lambda$parseDocument$5:(Lext/mods/commons/data/StatSet;Lorg/w3c/dom/Node;)V
  #578 = MethodHandle       5:#579        // REF_invokeVirtual ext/mods/gameserver/data/xml/NpcData.lambda$parseDocument$8:(Lext/mods/commons/data/StatSet;Lorg/w3c/dom/Node;)V
  #579 = Methodref          #11.#580      // ext/mods/gameserver/data/xml/NpcData.lambda$parseDocument$8:(Lext/mods/commons/data/StatSet;Lorg/w3c/dom/Node;)V
  #580 = NameAndType        #519:#487     // lambda$parseDocument$8:(Lext/mods/commons/data/StatSet;Lorg/w3c/dom/Node;)V
  #581 = MethodHandle       5:#582        // REF_invokeVirtual ext/mods/gameserver/data/xml/NpcData.lambda$parseDocument$10:(Lext/mods/commons/data/StatSet;Lorg/w3c/dom/Node;)V
  #582 = Methodref          #11.#583      // ext/mods/gameserver/data/xml/NpcData.lambda$parseDocument$10:(Lext/mods/commons/data/StatSet;Lorg/w3c/dom/Node;)V
  #583 = NameAndType        #508:#487     // lambda$parseDocument$10:(Lext/mods/commons/data/StatSet;Lorg/w3c/dom/Node;)V
  #584 = MethodHandle       5:#585        // REF_invokeVirtual ext/mods/gameserver/data/xml/NpcData.lambda$parseDocument$12:(Lext/mods/commons/data/StatSet;ILorg/w3c/dom/Node;)V
  #585 = Methodref          #11.#586      // ext/mods/gameserver/data/xml/NpcData.lambda$parseDocument$12:(Lext/mods/commons/data/StatSet;ILorg/w3c/dom/Node;)V
  #586 = NameAndType        #489:#490     // lambda$parseDocument$12:(Lext/mods/commons/data/StatSet;ILorg/w3c/dom/Node;)V
  #587 = MethodHandle       5:#588        // REF_invokeVirtual ext/mods/gameserver/data/xml/NpcData.lambda$parseDocument$14:(Lext/mods/commons/data/StatSet;Lorg/w3c/dom/Node;)V
  #588 = Methodref          #11.#589      // ext/mods/gameserver/data/xml/NpcData.lambda$parseDocument$14:(Lext/mods/commons/data/StatSet;Lorg/w3c/dom/Node;)V
  #589 = NameAndType        #486:#487     // lambda$parseDocument$14:(Lext/mods/commons/data/StatSet;Lorg/w3c/dom/Node;)V
  #590 = MethodHandle       5:#591        // REF_invokeVirtual ext/mods/gameserver/data/xml/NpcData.lambda$parseDocument$13:(Lext/mods/commons/data/StatSet;ILjava/util/List;Ljava/util/Map;Lorg/w3c/dom/Node;)V
  #591 = Methodref          #11.#592      // ext/mods/gameserver/data/xml/NpcData.lambda$parseDocument$13:(Lext/mods/commons/data/StatSet;ILjava/util/List;Ljava/util/Map;Lorg/w3c/dom/Node;)V
  #592 = NameAndType        #495:#496     // lambda$parseDocument$13:(Lext/mods/commons/data/StatSet;ILjava/util/List;Ljava/util/Map;Lorg/w3c/dom/Node;)V
  #593 = MethodHandle       5:#594        // REF_invokeVirtual ext/mods/gameserver/data/xml/NpcData.lambda$parseDocument$11:(Ljava/util/Map;Lorg/w3c/dom/Node;)V
  #594 = Methodref          #11.#595      // ext/mods/gameserver/data/xml/NpcData.lambda$parseDocument$11:(Ljava/util/Map;Lorg/w3c/dom/Node;)V
  #595 = NameAndType        #513:#514     // lambda$parseDocument$11:(Ljava/util/Map;Lorg/w3c/dom/Node;)V
  #596 = MethodHandle       5:#597        // REF_invokeVirtual ext/mods/gameserver/data/xml/NpcData.lambda$parseDocument$9:(Ljava/util/List;Lorg/w3c/dom/Node;)V
  #597 = Methodref          #11.#598      // ext/mods/gameserver/data/xml/NpcData.lambda$parseDocument$9:(Ljava/util/List;Lorg/w3c/dom/Node;)V
  #598 = NameAndType        #523:#524     // lambda$parseDocument$9:(Ljava/util/List;Lorg/w3c/dom/Node;)V
  #599 = MethodHandle       5:#600        // REF_invokeVirtual ext/mods/gameserver/data/xml/NpcData.lambda$parseDocument$6:(Ljava/util/List;Lorg/w3c/dom/Node;)V
  #600 = Methodref          #11.#601      // ext/mods/gameserver/data/xml/NpcData.lambda$parseDocument$6:(Ljava/util/List;Lorg/w3c/dom/Node;)V
  #601 = NameAndType        #529:#524     // lambda$parseDocument$6:(Ljava/util/List;Lorg/w3c/dom/Node;)V
  #602 = MethodHandle       5:#603        // REF_invokeVirtual ext/mods/gameserver/data/xml/NpcData.lambda$parseDocument$7:(Lext/mods/gameserver/model/item/DropCategory;Lorg/w3c/dom/Node;)V
  #603 = Methodref          #11.#604      // ext/mods/gameserver/data/xml/NpcData.lambda$parseDocument$7:(Lext/mods/gameserver/model/item/DropCategory;Lorg/w3c/dom/Node;)V
  #604 = NameAndType        #536:#537     // lambda$parseDocument$7:(Lext/mods/gameserver/model/item/DropCategory;Lorg/w3c/dom/Node;)V
  #605 = MethodHandle       5:#606        // REF_invokeVirtual ext/mods/gameserver/data/xml/NpcData.lambda$parseDocument$4:(Lext/mods/gameserver/model/memo/NpcMemo;Lorg/w3c/dom/Node;)V
  #606 = Methodref          #11.#607      // ext/mods/gameserver/data/xml/NpcData.lambda$parseDocument$4:(Lext/mods/gameserver/model/memo/NpcMemo;Lorg/w3c/dom/Node;)V
  #607 = NameAndType        #545:#546     // lambda$parseDocument$4:(Lext/mods/gameserver/model/memo/NpcMemo;Lorg/w3c/dom/Node;)V
  #608 = MethodHandle       6:#609        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #609 = Methodref          #610.#611     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #610 = Class              #612          // java/lang/invoke/LambdaMetafactory
  #611 = NameAndType        #613:#614     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #612 = Utf8               java/lang/invoke/LambdaMetafactory
  #613 = Utf8               metafactory
  #614 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #615 = Utf8               InnerClasses
  #616 = Utf8               SingletonHolder
  #617 = Class              #618          // java/lang/invoke/MethodHandles$Lookup
  #618 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #619 = Class              #620          // java/lang/invoke/MethodHandles
  #620 = Utf8               java/lang/invoke/MethodHandles
  #621 = Utf8               Lookup
{
  protected ext.mods.gameserver.data.xml.NpcData();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=3, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: new           #7                  // class java/util/HashMap
         8: dup
         9: invokespecial #9                  // Method java/util/HashMap."<init>":()V
        12: putfield      #10                 // Field _npcs:Ljava/util/Map;
        15: aload_0
        16: invokevirtual #16                 // Method load:()V
        19: return
      LineNumberTable:
        line 57: 0
        line 54: 4
        line 58: 15
        line 59: 19
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      20     0  this   Lext/mods/gameserver/data/xml/NpcData;

  public void load();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=1, args_size=1
         0: aload_0
         1: ldc           #19                 // String xml/npcs
         3: invokevirtual #21                 // Method parseDataFile:(Ljava/lang/String;)V
         6: getstatic     #25                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
         9: ldc           #29                 // String Loaded {} NPC templates.
        11: iconst_1
        12: anewarray     #2                  // class java/lang/Object
        15: dup
        16: iconst_0
        17: aload_0
        18: getfield      #10                 // Field _npcs:Ljava/util/Map;
        21: invokeinterface #31,  1           // InterfaceMethod java/util/Map.size:()I
        26: invokestatic  #37                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        29: aastore
        30: invokevirtual #43                 // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
        33: return
      LineNumberTable:
        line 64: 0
        line 65: 6
        line 66: 33
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      34     0  this   Lext/mods/gameserver/data/xml/NpcData;

  public void parseDocument(org.w3c.dom.Document, java.nio.file.Path);
    descriptor: (Lorg/w3c/dom/Document;Ljava/nio/file/Path;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: ldc           #49                 // String list
         4: aload_0
         5: invokedynamic #51,  0             // InvokeDynamic #0:accept:(Lext/mods/gameserver/data/xml/NpcData;)Ljava/util/function/Consumer;
        10: invokevirtual #55                 // Method forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
        13: return
      LineNumberTable:
        line 71: 0
        line 227: 13
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0  this   Lext/mods/gameserver/data/xml/NpcData;
            0      14     1   doc   Lorg/w3c/dom/Document;
            0      14     2  path   Ljava/nio/file/Path;

  public void reload();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #10                 // Field _npcs:Ljava/util/Map;
         4: invokeinterface #59,  1           // InterfaceMethod java/util/Map.clear:()V
         9: aload_0
        10: invokevirtual #16                 // Method load:()V
        13: return
      LineNumberTable:
        line 231: 0
        line 233: 9
        line 234: 13
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0  this   Lext/mods/gameserver/data/xml/NpcData;

  public ext.mods.gameserver.model.actor.template.NpcTemplate getTemplate(int);
    descriptor: (I)Lext/mods/gameserver/model/actor/template/NpcTemplate;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #10                 // Field _npcs:Ljava/util/Map;
         4: iload_1
         5: invokestatic  #37                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
         8: invokeinterface #62,  2           // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        13: checkcast     #66                 // class ext/mods/gameserver/model/actor/template/NpcTemplate
        16: areturn
      LineNumberTable:
        line 238: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      17     0  this   Lext/mods/gameserver/data/xml/NpcData;
            0      17     1    id   I

  public ext.mods.gameserver.model.actor.template.NpcTemplate getTemplateByName(java.lang.String);
    descriptor: (Ljava/lang/String;)Lext/mods/gameserver/model/actor/template/NpcTemplate;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #10                 // Field _npcs:Ljava/util/Map;
         4: invokeinterface #68,  1           // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
         9: invokeinterface #72,  1           // InterfaceMethod java/util/Collection.stream:()Ljava/util/stream/Stream;
        14: aload_1
        15: invokedynamic #78,  0             // InvokeDynamic #1:test:(Ljava/lang/String;)Ljava/util/function/Predicate;
        20: invokeinterface #82,  2           // InterfaceMethod java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
        25: invokeinterface #88,  1           // InterfaceMethod java/util/stream/Stream.findFirst:()Ljava/util/Optional;
        30: aconst_null
        31: invokevirtual #92                 // Method java/util/Optional.orElse:(Ljava/lang/Object;)Ljava/lang/Object;
        34: checkcast     #66                 // class ext/mods/gameserver/model/actor/template/NpcTemplate
        37: areturn
      LineNumberTable:
        line 247: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      38     0  this   Lext/mods/gameserver/data/xml/NpcData;
            0      38     1  name   Ljava/lang/String;

  public java.util.List<ext.mods.gameserver.model.actor.template.NpcTemplate> getTemplates(java.util.function.Predicate<ext.mods.gameserver.model.actor.template.NpcTemplate>);
    descriptor: (Ljava/util/function/Predicate;)Ljava/util/List;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #10                 // Field _npcs:Ljava/util/Map;
         4: invokeinterface #68,  1           // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
         9: invokeinterface #72,  1           // InterfaceMethod java/util/Collection.stream:()Ljava/util/stream/Stream;
        14: aload_1
        15: invokeinterface #82,  2           // InterfaceMethod java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
        20: invokeinterface #97,  1           // InterfaceMethod java/util/stream/Stream.toList:()Ljava/util/List;
        25: areturn
      LineNumberTable:
        line 257: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      26     0  this   Lext/mods/gameserver/data/xml/NpcData;
            0      26     1 filter   Ljava/util/function/Predicate;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      26     1 filter   Ljava/util/function/Predicate<Lext/mods/gameserver/model/actor/template/NpcTemplate;>;
    Signature: #467                         // (Ljava/util/function/Predicate<Lext/mods/gameserver/model/actor/template/NpcTemplate;>;)Ljava/util/List<Lext/mods/gameserver/model/actor/template/NpcTemplate;>;

  public java.util.Collection<ext.mods.gameserver.model.actor.template.NpcTemplate> getTemplates();
    descriptor: ()Ljava/util/Collection;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #10                 // Field _npcs:Ljava/util/Map;
         4: invokeinterface #68,  1           // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
         9: areturn
      LineNumberTable:
        line 262: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/gameserver/data/xml/NpcData;
    Signature: #468                         // ()Ljava/util/Collection<Lext/mods/gameserver/model/actor/template/NpcTemplate;>;

  public static ext.mods.gameserver.data.xml.NpcData getInstance();
    descriptor: ()Lext/mods/gameserver/data/xml/NpcData;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #101                // Field ext/mods/gameserver/data/xml/NpcData$SingletonHolder.INSTANCE:Lext/mods/gameserver/data/xml/NpcData;
         3: areturn
      LineNumberTable:
        line 267: 0
}
SourceFile: "NpcData.java"
NestMembers:
  ext/mods/gameserver/data/xml/NpcData$SingletonHolder
BootstrapMethods:
  0: #608 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #554 (Ljava/lang/Object;)V
      #556 REF_invokeVirtual ext/mods/gameserver/data/xml/NpcData.lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
      #559 (Lorg/w3c/dom/Node;)V
  1: #608 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #560 (Ljava/lang/Object;)Z
      #561 REF_invokeStatic ext/mods/gameserver/data/xml/NpcData.lambda$getTemplateByName$0:(Ljava/lang/String;Lext/mods/gameserver/model/actor/template/NpcTemplate;)Z
      #564 (Lext/mods/gameserver/model/actor/template/NpcTemplate;)Z
  2: #608 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #554 (Ljava/lang/Object;)V
      #566 REF_invokeVirtual ext/mods/gameserver/data/xml/NpcData.lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
      #559 (Lorg/w3c/dom/Node;)V
  3: #608 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #554 (Ljava/lang/Object;)V
      #569 REF_invokeVirtual ext/mods/gameserver/data/xml/NpcData.lambda$parseDocument$2:(Lext/mods/commons/data/StatSet;Lorg/w3c/dom/Node;)V
      #559 (Lorg/w3c/dom/Node;)V
  4: #608 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #554 (Ljava/lang/Object;)V
      #572 REF_invokeVirtual ext/mods/gameserver/data/xml/NpcData.lambda$parseDocument$3:(Lext/mods/commons/data/StatSet;Lorg/w3c/dom/Node;)V
      #559 (Lorg/w3c/dom/Node;)V
  5: #608 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #554 (Ljava/lang/Object;)V
      #575 REF_invokeVirtual ext/mods/gameserver/data/xml/NpcData.lambda$parseDocument$5:(Lext/mods/commons/data/StatSet;Lorg/w3c/dom/Node;)V
      #559 (Lorg/w3c/dom/Node;)V
  6: #608 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #554 (Ljava/lang/Object;)V
      #578 REF_invokeVirtual ext/mods/gameserver/data/xml/NpcData.lambda$parseDocument$8:(Lext/mods/commons/data/StatSet;Lorg/w3c/dom/Node;)V
      #559 (Lorg/w3c/dom/Node;)V
  7: #608 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #554 (Ljava/lang/Object;)V
      #581 REF_invokeVirtual ext/mods/gameserver/data/xml/NpcData.lambda$parseDocument$10:(Lext/mods/commons/data/StatSet;Lorg/w3c/dom/Node;)V
      #559 (Lorg/w3c/dom/Node;)V
  8: #608 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #554 (Ljava/lang/Object;)V
      #584 REF_invokeVirtual ext/mods/gameserver/data/xml/NpcData.lambda$parseDocument$12:(Lext/mods/commons/data/StatSet;ILorg/w3c/dom/Node;)V
      #559 (Lorg/w3c/dom/Node;)V
  9: #608 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #554 (Ljava/lang/Object;)V
      #587 REF_invokeVirtual ext/mods/gameserver/data/xml/NpcData.lambda$parseDocument$14:(Lext/mods/commons/data/StatSet;Lorg/w3c/dom/Node;)V
      #559 (Lorg/w3c/dom/Node;)V
  10: #608 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #554 (Ljava/lang/Object;)V
      #590 REF_invokeVirtual ext/mods/gameserver/data/xml/NpcData.lambda$parseDocument$13:(Lext/mods/commons/data/StatSet;ILjava/util/List;Ljava/util/Map;Lorg/w3c/dom/Node;)V
      #559 (Lorg/w3c/dom/Node;)V
  11: #608 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #554 (Ljava/lang/Object;)V
      #593 REF_invokeVirtual ext/mods/gameserver/data/xml/NpcData.lambda$parseDocument$11:(Ljava/util/Map;Lorg/w3c/dom/Node;)V
      #559 (Lorg/w3c/dom/Node;)V
  12: #608 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #554 (Ljava/lang/Object;)V
      #596 REF_invokeVirtual ext/mods/gameserver/data/xml/NpcData.lambda$parseDocument$9:(Ljava/util/List;Lorg/w3c/dom/Node;)V
      #559 (Lorg/w3c/dom/Node;)V
  13: #608 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #554 (Ljava/lang/Object;)V
      #599 REF_invokeVirtual ext/mods/gameserver/data/xml/NpcData.lambda$parseDocument$6:(Ljava/util/List;Lorg/w3c/dom/Node;)V
      #559 (Lorg/w3c/dom/Node;)V
  14: #608 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #554 (Ljava/lang/Object;)V
      #602 REF_invokeVirtual ext/mods/gameserver/data/xml/NpcData.lambda$parseDocument$7:(Lext/mods/gameserver/model/item/DropCategory;Lorg/w3c/dom/Node;)V
      #559 (Lorg/w3c/dom/Node;)V
  15: #608 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #554 (Ljava/lang/Object;)V
      #605 REF_invokeVirtual ext/mods/gameserver/data/xml/NpcData.lambda$parseDocument$4:(Lext/mods/gameserver/model/memo/NpcMemo;Lorg/w3c/dom/Node;)V
      #559 (Lorg/w3c/dom/Node;)V
InnerClasses:
  public static final #621= #617 of #619; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
