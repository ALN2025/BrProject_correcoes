// Bytecode for: ext.mods.gameserver.data.xml.PlayerData
// File: ext\mods\gameserver\data\xml\PlayerData.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/data/xml/PlayerData.class
  Last modified 9 de jul de 2026; size 8936 bytes
  MD5 checksum 88f17d2d581bad5bb15ac501fd5941ff
  Compiled from "PlayerData.java"
public class ext.mods.gameserver.data.xml.PlayerData implements ext.mods.commons.data.xml.IXmlReader
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #11                         // ext/mods/gameserver/data/xml/PlayerData
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 2, methods: 21, attributes: 4
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
   #10 = Fieldref           #11.#12       // ext/mods/gameserver/data/xml/PlayerData._templates:Ljava/util/Map;
   #11 = Class              #13           // ext/mods/gameserver/data/xml/PlayerData
   #12 = NameAndType        #14:#15       // _templates:Ljava/util/Map;
   #13 = Utf8               ext/mods/gameserver/data/xml/PlayerData
   #14 = Utf8               _templates
   #15 = Utf8               Ljava/util/Map;
   #16 = Fieldref           #11.#17       // ext/mods/gameserver/data/xml/PlayerData._skills:Ljava/util/Map;
   #17 = NameAndType        #18:#15       // _skills:Ljava/util/Map;
   #18 = Utf8               _skills
   #19 = Methodref          #11.#20       // ext/mods/gameserver/data/xml/PlayerData.load:()V
   #20 = NameAndType        #21:#6        // load:()V
   #21 = Utf8               load
   #22 = String             #23           // xml/classes
   #23 = Utf8               xml/classes
   #24 = Methodref          #11.#25       // ext/mods/gameserver/data/xml/PlayerData.parseDataFile:(Ljava/lang/String;)V
   #25 = NameAndType        #26:#27       // parseDataFile:(Ljava/lang/String;)V
   #26 = Utf8               parseDataFile
   #27 = Utf8               (Ljava/lang/String;)V
   #28 = Fieldref           #11.#29       // ext/mods/gameserver/data/xml/PlayerData.LOGGER:Lext/mods/commons/logging/CLogger;
   #29 = NameAndType        #30:#31       // LOGGER:Lext/mods/commons/logging/CLogger;
   #30 = Utf8               LOGGER
   #31 = Utf8               Lext/mods/commons/logging/CLogger;
   #32 = String             #33           // Loaded {} player classes templates.
   #33 = Utf8               Loaded {} player classes templates.
   #34 = InterfaceMethodref #35.#36       // java/util/Map.size:()I
   #35 = Class              #37           // java/util/Map
   #36 = NameAndType        #38:#39       // size:()I
   #37 = Utf8               java/util/Map
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
   #52 = InterfaceMethodref #35.#53       // java/util/Map.values:()Ljava/util/Collection;
   #53 = NameAndType        #54:#55       // values:()Ljava/util/Collection;
   #54 = Utf8               values
   #55 = Utf8               ()Ljava/util/Collection;
   #56 = InterfaceMethodref #57.#58       // java/util/Collection.iterator:()Ljava/util/Iterator;
   #57 = Class              #59           // java/util/Collection
   #58 = NameAndType        #60:#61       // iterator:()Ljava/util/Iterator;
   #59 = Utf8               java/util/Collection
   #60 = Utf8               iterator
   #61 = Utf8               ()Ljava/util/Iterator;
   #62 = InterfaceMethodref #63.#64       // java/util/Iterator.hasNext:()Z
   #63 = Class              #65           // java/util/Iterator
   #64 = NameAndType        #66:#67       // hasNext:()Z
   #65 = Utf8               java/util/Iterator
   #66 = Utf8               hasNext
   #67 = Utf8               ()Z
   #68 = InterfaceMethodref #63.#69       // java/util/Iterator.next:()Ljava/lang/Object;
   #69 = NameAndType        #70:#71       // next:()Ljava/lang/Object;
   #70 = Utf8               next
   #71 = Utf8               ()Ljava/lang/Object;
   #72 = Class              #73           // ext/mods/gameserver/model/actor/template/PlayerTemplate
   #73 = Utf8               ext/mods/gameserver/model/actor/template/PlayerTemplate
   #74 = Methodref          #72.#75       // ext/mods/gameserver/model/actor/template/PlayerTemplate.getClassId:()Lext/mods/gameserver/enums/actors/ClassId;
   #75 = NameAndType        #76:#77       // getClassId:()Lext/mods/gameserver/enums/actors/ClassId;
   #76 = Utf8               getClassId
   #77 = Utf8               ()Lext/mods/gameserver/enums/actors/ClassId;
   #78 = Methodref          #79.#80       // ext/mods/gameserver/enums/actors/ClassId.getId:()I
   #79 = Class              #81           // ext/mods/gameserver/enums/actors/ClassId
   #80 = NameAndType        #82:#39       // getId:()I
   #81 = Utf8               ext/mods/gameserver/enums/actors/ClassId
   #82 = Utf8               getId
   #83 = Methodref          #72.#84       // ext/mods/gameserver/model/actor/template/PlayerTemplate.getSkills:()Ljava/util/List;
   #84 = NameAndType        #85:#86       // getSkills:()Ljava/util/List;
   #85 = Utf8               getSkills
   #86 = Utf8               ()Ljava/util/List;
   #87 = InterfaceMethodref #88.#89       // java/util/List.copyOf:(Ljava/util/Collection;)Ljava/util/List;
   #88 = Class              #90           // java/util/List
   #89 = NameAndType        #91:#92       // copyOf:(Ljava/util/Collection;)Ljava/util/List;
   #90 = Utf8               java/util/List
   #91 = Utf8               copyOf
   #92 = Utf8               (Ljava/util/Collection;)Ljava/util/List;
   #93 = InterfaceMethodref #35.#94       // java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #94 = NameAndType        #95:#96       // put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #95 = Utf8               put
   #96 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #97 = Methodref          #79.#98       // ext/mods/gameserver/enums/actors/ClassId.getParent:()Lext/mods/gameserver/enums/actors/ClassId;
   #98 = NameAndType        #99:#77       // getParent:()Lext/mods/gameserver/enums/actors/ClassId;
   #99 = Utf8               getParent
  #100 = InterfaceMethodref #35.#101      // java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
  #101 = NameAndType        #102:#103     // get:(Ljava/lang/Object;)Ljava/lang/Object;
  #102 = Utf8               get
  #103 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
  #104 = InterfaceMethodref #88.#105      // java/util/List.addAll:(Ljava/util/Collection;)Z
  #105 = NameAndType        #106:#107     // addAll:(Ljava/util/Collection;)Z
  #106 = Utf8               addAll
  #107 = Utf8               (Ljava/util/Collection;)Z
  #108 = String             #109          // list
  #109 = Utf8               list
  #110 = InvokeDynamic      #0:#111       // #0:accept:(Lext/mods/gameserver/data/xml/PlayerData;)Ljava/util/function/Consumer;
  #111 = NameAndType        #112:#113     // accept:(Lext/mods/gameserver/data/xml/PlayerData;)Ljava/util/function/Consumer;
  #112 = Utf8               accept
  #113 = Utf8               (Lext/mods/gameserver/data/xml/PlayerData;)Ljava/util/function/Consumer;
  #114 = Methodref          #11.#115      // ext/mods/gameserver/data/xml/PlayerData.forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
  #115 = NameAndType        #116:#117     // forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
  #116 = Utf8               forEach
  #117 = Utf8               (Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
  #118 = Methodref          #72.#119      // ext/mods/gameserver/model/actor/template/PlayerTemplate.getClassName:()Ljava/lang/String;
  #119 = NameAndType        #120:#121     // getClassName:()Ljava/lang/String;
  #120 = Utf8               getClassName
  #121 = Utf8               ()Ljava/lang/String;
  #122 = String             #123          // Invalid class
  #123 = Utf8               Invalid class
  #124 = InterfaceMethodref #88.#125      // java/util/List.of:()Ljava/util/List;
  #125 = NameAndType        #126:#86      // of:()Ljava/util/List;
  #126 = Utf8               of
  #127 = InterfaceMethodref #88.#128      // java/util/List.stream:()Ljava/util/stream/Stream;
  #128 = NameAndType        #129:#130     // stream:()Ljava/util/stream/Stream;
  #129 = Utf8               stream
  #130 = Utf8               ()Ljava/util/stream/Stream;
  #131 = InvokeDynamic      #1:#132       // #1:apply:()Ljava/util/function/Function;
  #132 = NameAndType        #133:#134     // apply:()Ljava/util/function/Function;
  #133 = Utf8               apply
  #134 = Utf8               ()Ljava/util/function/Function;
  #135 = InterfaceMethodref #136.#137     // java/util/stream/Stream.map:(Ljava/util/function/Function;)Ljava/util/stream/Stream;
  #136 = Class              #138          // java/util/stream/Stream
  #137 = NameAndType        #139:#140     // map:(Ljava/util/function/Function;)Ljava/util/stream/Stream;
  #138 = Utf8               java/util/stream/Stream
  #139 = Utf8               map
  #140 = Utf8               (Ljava/util/function/Function;)Ljava/util/stream/Stream;
  #141 = InvokeDynamic      #2:#142       // #2:test:()Ljava/util/function/Predicate;
  #142 = NameAndType        #143:#144     // test:()Ljava/util/function/Predicate;
  #143 = Utf8               test
  #144 = Utf8               ()Ljava/util/function/Predicate;
  #145 = InterfaceMethodref #136.#146     // java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
  #146 = NameAndType        #147:#148     // filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
  #147 = Utf8               filter
  #148 = Utf8               (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
  #149 = InterfaceMethodref #136.#150     // java/util/stream/Stream.toList:()Ljava/util/List;
  #150 = NameAndType        #151:#86      // toList:()Ljava/util/List;
  #151 = Utf8               toList
  #152 = Fieldref           #153.#154     // ext/mods/gameserver/data/xml/PlayerData$SingletonHolder.INSTANCE:Lext/mods/gameserver/data/xml/PlayerData;
  #153 = Class              #155          // ext/mods/gameserver/data/xml/PlayerData$SingletonHolder
  #154 = NameAndType        #156:#157     // INSTANCE:Lext/mods/gameserver/data/xml/PlayerData;
  #155 = Utf8               ext/mods/gameserver/data/xml/PlayerData$SingletonHolder
  #156 = Utf8               INSTANCE
  #157 = Utf8               Lext/mods/gameserver/data/xml/PlayerData;
  #158 = Methodref          #159.#160     // ext/mods/gameserver/data/SkillTable.getInstance:()Lext/mods/gameserver/data/SkillTable;
  #159 = Class              #161          // ext/mods/gameserver/data/SkillTable
  #160 = NameAndType        #162:#163     // getInstance:()Lext/mods/gameserver/data/SkillTable;
  #161 = Utf8               ext/mods/gameserver/data/SkillTable
  #162 = Utf8               getInstance
  #163 = Utf8               ()Lext/mods/gameserver/data/SkillTable;
  #164 = Methodref          #165.#80      // ext/mods/gameserver/model/holder/skillnode/GeneralSkillNode.getId:()I
  #165 = Class              #166          // ext/mods/gameserver/model/holder/skillnode/GeneralSkillNode
  #166 = Utf8               ext/mods/gameserver/model/holder/skillnode/GeneralSkillNode
  #167 = Methodref          #165.#168     // ext/mods/gameserver/model/holder/skillnode/GeneralSkillNode.getValue:()I
  #168 = NameAndType        #169:#39      // getValue:()I
  #169 = Utf8               getValue
  #170 = Methodref          #159.#171     // ext/mods/gameserver/data/SkillTable.getInfo:(II)Lext/mods/gameserver/skills/L2Skill;
  #171 = NameAndType        #172:#173     // getInfo:(II)Lext/mods/gameserver/skills/L2Skill;
  #172 = Utf8               getInfo
  #173 = Utf8               (II)Lext/mods/gameserver/skills/L2Skill;
  #174 = String             #175          // class
  #175 = Utf8               class
  #176 = InvokeDynamic      #3:#111       // #3:accept:(Lext/mods/gameserver/data/xml/PlayerData;)Ljava/util/function/Consumer;
  #177 = Class              #178          // ext/mods/commons/data/StatSet
  #178 = Utf8               ext/mods/commons/data/StatSet
  #179 = Methodref          #177.#3       // ext/mods/commons/data/StatSet."<init>":()V
  #180 = String             #181          // set
  #181 = Utf8               set
  #182 = InvokeDynamic      #4:#183       // #4:accept:(Lext/mods/gameserver/data/xml/PlayerData;Lext/mods/commons/data/StatSet;)Ljava/util/function/Consumer;
  #183 = NameAndType        #112:#184     // accept:(Lext/mods/gameserver/data/xml/PlayerData;Lext/mods/commons/data/StatSet;)Ljava/util/function/Consumer;
  #184 = Utf8               (Lext/mods/gameserver/data/xml/PlayerData;Lext/mods/commons/data/StatSet;)Ljava/util/function/Consumer;
  #185 = String             #186          // macros
  #186 = Utf8               macros
  #187 = InvokeDynamic      #5:#183       // #5:accept:(Lext/mods/gameserver/data/xml/PlayerData;Lext/mods/commons/data/StatSet;)Ljava/util/function/Consumer;
  #188 = String             #189          // items
  #189 = Utf8               items
  #190 = InvokeDynamic      #6:#183       // #6:accept:(Lext/mods/gameserver/data/xml/PlayerData;Lext/mods/commons/data/StatSet;)Ljava/util/function/Consumer;
  #191 = String             #192          // skills
  #192 = Utf8               skills
  #193 = InvokeDynamic      #7:#183       // #7:accept:(Lext/mods/gameserver/data/xml/PlayerData;Lext/mods/commons/data/StatSet;)Ljava/util/function/Consumer;
  #194 = String             #195          // spawns
  #195 = Utf8               spawns
  #196 = InvokeDynamic      #8:#183       // #8:accept:(Lext/mods/gameserver/data/xml/PlayerData;Lext/mods/commons/data/StatSet;)Ljava/util/function/Consumer;
  #197 = String             #198          // id
  #198 = Utf8               id
  #199 = Methodref          #177.#200     // ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
  #200 = NameAndType        #201:#202     // getInteger:(Ljava/lang/String;)I
  #201 = Utf8               getInteger
  #202 = Utf8               (Ljava/lang/String;)I
  #203 = Methodref          #72.#204      // ext/mods/gameserver/model/actor/template/PlayerTemplate."<init>":(Lext/mods/commons/data/StatSet;)V
  #204 = NameAndType        #5:#205       // "<init>":(Lext/mods/commons/data/StatSet;)V
  #205 = Utf8               (Lext/mods/commons/data/StatSet;)V
  #206 = Class              #207          // java/util/ArrayList
  #207 = Utf8               java/util/ArrayList
  #208 = Methodref          #206.#3       // java/util/ArrayList."<init>":()V
  #209 = String             #210          // spawn
  #210 = Utf8               spawn
  #211 = InvokeDynamic      #9:#212       // #9:accept:(Lext/mods/gameserver/data/xml/PlayerData;Ljava/util/List;)Ljava/util/function/Consumer;
  #212 = NameAndType        #112:#213     // accept:(Lext/mods/gameserver/data/xml/PlayerData;Ljava/util/List;)Ljava/util/function/Consumer;
  #213 = Utf8               (Lext/mods/gameserver/data/xml/PlayerData;Ljava/util/List;)Ljava/util/function/Consumer;
  #214 = String             #215          // spawnLocations
  #215 = Utf8               spawnLocations
  #216 = Methodref          #177.#217     // ext/mods/commons/data/StatSet.set:(Ljava/lang/String;Ljava/lang/Object;)V
  #217 = NameAndType        #181:#218     // set:(Ljava/lang/String;Ljava/lang/Object;)V
  #218 = Utf8               (Ljava/lang/String;Ljava/lang/Object;)V
  #219 = Class              #220          // ext/mods/gameserver/model/location/Location
  #220 = Utf8               ext/mods/gameserver/model/location/Location
  #221 = Methodref          #11.#222      // ext/mods/gameserver/data/xml/PlayerData.parseAttributes:(Lorg/w3c/dom/Node;)Lext/mods/commons/data/StatSet;
  #222 = NameAndType        #223:#224     // parseAttributes:(Lorg/w3c/dom/Node;)Lext/mods/commons/data/StatSet;
  #223 = Utf8               parseAttributes
  #224 = Utf8               (Lorg/w3c/dom/Node;)Lext/mods/commons/data/StatSet;
  #225 = Methodref          #219.#204     // ext/mods/gameserver/model/location/Location."<init>":(Lext/mods/commons/data/StatSet;)V
  #226 = InterfaceMethodref #88.#227      // java/util/List.add:(Ljava/lang/Object;)Z
  #227 = NameAndType        #228:#229     // add:(Ljava/lang/Object;)Z
  #228 = Utf8               add
  #229 = Utf8               (Ljava/lang/Object;)Z
  #230 = String             #231          // skill
  #231 = Utf8               skill
  #232 = InvokeDynamic      #10:#212      // #10:accept:(Lext/mods/gameserver/data/xml/PlayerData;Ljava/util/List;)Ljava/util/function/Consumer;
  #233 = Methodref          #165.#204     // ext/mods/gameserver/model/holder/skillnode/GeneralSkillNode."<init>":(Lext/mods/commons/data/StatSet;)V
  #234 = String             #235          // item
  #235 = Utf8               item
  #236 = InvokeDynamic      #11:#212      // #11:accept:(Lext/mods/gameserver/data/xml/PlayerData;Ljava/util/List;)Ljava/util/function/Consumer;
  #237 = Class              #238          // ext/mods/gameserver/model/records/NewbieItem
  #238 = Utf8               ext/mods/gameserver/model/records/NewbieItem
  #239 = Methodref          #237.#204     // ext/mods/gameserver/model/records/NewbieItem."<init>":(Lext/mods/commons/data/StatSet;)V
  #240 = String             #241          // macro
  #241 = Utf8               macro
  #242 = InvokeDynamic      #12:#212      // #12:accept:(Lext/mods/gameserver/data/xml/PlayerData;Ljava/util/List;)Ljava/util/function/Consumer;
  #243 = Class              #244          // ext/mods/gameserver/model/records/custom/Macros
  #244 = Utf8               ext/mods/gameserver/model/records/custom/Macros
  #245 = Methodref          #243.#204     // ext/mods/gameserver/model/records/custom/Macros."<init>":(Lext/mods/commons/data/StatSet;)V
  #246 = Methodref          #177.#247     // ext/mods/commons/data/StatSet.putAll:(Ljava/util/Map;)V
  #247 = NameAndType        #248:#249     // putAll:(Ljava/util/Map;)V
  #248 = Utf8               putAll
  #249 = Utf8               (Ljava/util/Map;)V
  #250 = Class              #251          // ext/mods/commons/data/xml/IXmlReader
  #251 = Utf8               ext/mods/commons/data/xml/IXmlReader
  #252 = Utf8               Signature
  #253 = Utf8               Ljava/util/Map<Ljava/lang/Integer;Lext/mods/gameserver/model/actor/template/PlayerTemplate;>;
  #254 = Utf8               Ljava/util/Map<Ljava/lang/Integer;Ljava/util/List<Lext/mods/gameserver/model/holder/skillnode/GeneralSkillNode;>;>;
  #255 = Utf8               Code
  #256 = Utf8               LineNumberTable
  #257 = Utf8               LocalVariableTable
  #258 = Utf8               this
  #259 = Utf8               template
  #260 = Utf8               Lext/mods/gameserver/model/actor/template/PlayerTemplate;
  #261 = Utf8               parentClassId
  #262 = Utf8               Lext/mods/gameserver/enums/actors/ClassId;
  #263 = Utf8               StackMapTable
  #264 = Utf8               parseDocument
  #265 = Utf8               (Lorg/w3c/dom/Document;Ljava/nio/file/Path;)V
  #266 = Utf8               doc
  #267 = Utf8               Lorg/w3c/dom/Document;
  #268 = Utf8               path
  #269 = Utf8               Ljava/nio/file/Path;
  #270 = Utf8               getTemplate
  #271 = Utf8               (Lext/mods/gameserver/enums/actors/ClassId;)Lext/mods/gameserver/model/actor/template/PlayerTemplate;
  #272 = Utf8               classId
  #273 = Utf8               (I)Lext/mods/gameserver/model/actor/template/PlayerTemplate;
  #274 = Utf8               I
  #275 = Utf8               getClassNameById
  #276 = Utf8               (I)Ljava/lang/String;
  #277 = Class              #278          // java/lang/String
  #278 = Utf8               java/lang/String
  #279 = Utf8               getSkillsByClassId
  #280 = Utf8               (I)Ljava/util/List;
  #281 = Utf8               Ljava/util/List;
  #282 = Utf8               LocalVariableTypeTable
  #283 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/holder/skillnode/GeneralSkillNode;>;
  #284 = Utf8               (I)Ljava/util/List<Lext/mods/gameserver/skills/L2Skill;>;
  #285 = Utf8               ()Lext/mods/gameserver/data/xml/PlayerData;
  #286 = Utf8               lambda$getSkillsByClassId$1
  #287 = Utf8               (Lext/mods/gameserver/skills/L2Skill;)Z
  #288 = Utf8               Lext/mods/gameserver/skills/L2Skill;
  #289 = Utf8               lambda$getSkillsByClassId$0
  #290 = Utf8               (Lext/mods/gameserver/model/holder/skillnode/GeneralSkillNode;)Lext/mods/gameserver/skills/L2Skill;
  #291 = Utf8               node
  #292 = Utf8               Lext/mods/gameserver/model/holder/skillnode/GeneralSkillNode;
  #293 = Utf8               lambda$parseDocument$0
  #294 = Utf8               (Lorg/w3c/dom/Node;)V
  #295 = Utf8               listNode
  #296 = Utf8               Lorg/w3c/dom/Node;
  #297 = Utf8               lambda$parseDocument$1
  #298 = Utf8               classNode
  #299 = Utf8               Lext/mods/commons/data/StatSet;
  #300 = Utf8               lambda$parseDocument$9
  #301 = Utf8               (Lext/mods/commons/data/StatSet;Lorg/w3c/dom/Node;)V
  #302 = Utf8               spawnsNode
  #303 = Utf8               locs
  #304 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/location/Location;>;
  #305 = Utf8               lambda$parseDocument$10
  #306 = Utf8               (Ljava/util/List;Lorg/w3c/dom/Node;)V
  #307 = Utf8               spawnNode
  #308 = Utf8               lambda$parseDocument$7
  #309 = Utf8               skillsNode
  #310 = Utf8               lambda$parseDocument$8
  #311 = Utf8               skillNode
  #312 = Utf8               lambda$parseDocument$5
  #313 = Utf8               itemsNode
  #314 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/records/NewbieItem;>;
  #315 = Utf8               lambda$parseDocument$6
  #316 = Utf8               itemNode
  #317 = Utf8               lambda$parseDocument$3
  #318 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/records/custom/Macros;>;
  #319 = Utf8               lambda$parseDocument$4
  #320 = Utf8               lambda$parseDocument$2
  #321 = Utf8               setNode
  #322 = Utf8               SourceFile
  #323 = Utf8               PlayerData.java
  #324 = Utf8               NestMembers
  #325 = Utf8               BootstrapMethods
  #326 = MethodType         #327          //  (Ljava/lang/Object;)V
  #327 = Utf8               (Ljava/lang/Object;)V
  #328 = MethodHandle       5:#329        // REF_invokeVirtual ext/mods/gameserver/data/xml/PlayerData.lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
  #329 = Methodref          #11.#330      // ext/mods/gameserver/data/xml/PlayerData.lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
  #330 = NameAndType        #293:#294     // lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
  #331 = MethodType         #294          //  (Lorg/w3c/dom/Node;)V
  #332 = MethodType         #103          //  (Ljava/lang/Object;)Ljava/lang/Object;
  #333 = MethodHandle       6:#334        // REF_invokeStatic ext/mods/gameserver/data/xml/PlayerData.lambda$getSkillsByClassId$0:(Lext/mods/gameserver/model/holder/skillnode/GeneralSkillNode;)Lext/mods/gameserver/skills/L2Skill;
  #334 = Methodref          #11.#335      // ext/mods/gameserver/data/xml/PlayerData.lambda$getSkillsByClassId$0:(Lext/mods/gameserver/model/holder/skillnode/GeneralSkillNode;)Lext/mods/gameserver/skills/L2Skill;
  #335 = NameAndType        #289:#290     // lambda$getSkillsByClassId$0:(Lext/mods/gameserver/model/holder/skillnode/GeneralSkillNode;)Lext/mods/gameserver/skills/L2Skill;
  #336 = MethodType         #290          //  (Lext/mods/gameserver/model/holder/skillnode/GeneralSkillNode;)Lext/mods/gameserver/skills/L2Skill;
  #337 = MethodType         #229          //  (Ljava/lang/Object;)Z
  #338 = MethodHandle       6:#339        // REF_invokeStatic ext/mods/gameserver/data/xml/PlayerData.lambda$getSkillsByClassId$1:(Lext/mods/gameserver/skills/L2Skill;)Z
  #339 = Methodref          #11.#340      // ext/mods/gameserver/data/xml/PlayerData.lambda$getSkillsByClassId$1:(Lext/mods/gameserver/skills/L2Skill;)Z
  #340 = NameAndType        #286:#287     // lambda$getSkillsByClassId$1:(Lext/mods/gameserver/skills/L2Skill;)Z
  #341 = MethodType         #287          //  (Lext/mods/gameserver/skills/L2Skill;)Z
  #342 = MethodHandle       5:#343        // REF_invokeVirtual ext/mods/gameserver/data/xml/PlayerData.lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
  #343 = Methodref          #11.#344      // ext/mods/gameserver/data/xml/PlayerData.lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
  #344 = NameAndType        #297:#294     // lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
  #345 = MethodHandle       5:#346        // REF_invokeVirtual ext/mods/gameserver/data/xml/PlayerData.lambda$parseDocument$2:(Lext/mods/commons/data/StatSet;Lorg/w3c/dom/Node;)V
  #346 = Methodref          #11.#347      // ext/mods/gameserver/data/xml/PlayerData.lambda$parseDocument$2:(Lext/mods/commons/data/StatSet;Lorg/w3c/dom/Node;)V
  #347 = NameAndType        #320:#301     // lambda$parseDocument$2:(Lext/mods/commons/data/StatSet;Lorg/w3c/dom/Node;)V
  #348 = MethodHandle       5:#349        // REF_invokeVirtual ext/mods/gameserver/data/xml/PlayerData.lambda$parseDocument$3:(Lext/mods/commons/data/StatSet;Lorg/w3c/dom/Node;)V
  #349 = Methodref          #11.#350      // ext/mods/gameserver/data/xml/PlayerData.lambda$parseDocument$3:(Lext/mods/commons/data/StatSet;Lorg/w3c/dom/Node;)V
  #350 = NameAndType        #317:#301     // lambda$parseDocument$3:(Lext/mods/commons/data/StatSet;Lorg/w3c/dom/Node;)V
  #351 = MethodHandle       5:#352        // REF_invokeVirtual ext/mods/gameserver/data/xml/PlayerData.lambda$parseDocument$5:(Lext/mods/commons/data/StatSet;Lorg/w3c/dom/Node;)V
  #352 = Methodref          #11.#353      // ext/mods/gameserver/data/xml/PlayerData.lambda$parseDocument$5:(Lext/mods/commons/data/StatSet;Lorg/w3c/dom/Node;)V
  #353 = NameAndType        #312:#301     // lambda$parseDocument$5:(Lext/mods/commons/data/StatSet;Lorg/w3c/dom/Node;)V
  #354 = MethodHandle       5:#355        // REF_invokeVirtual ext/mods/gameserver/data/xml/PlayerData.lambda$parseDocument$7:(Lext/mods/commons/data/StatSet;Lorg/w3c/dom/Node;)V
  #355 = Methodref          #11.#356      // ext/mods/gameserver/data/xml/PlayerData.lambda$parseDocument$7:(Lext/mods/commons/data/StatSet;Lorg/w3c/dom/Node;)V
  #356 = NameAndType        #308:#301     // lambda$parseDocument$7:(Lext/mods/commons/data/StatSet;Lorg/w3c/dom/Node;)V
  #357 = MethodHandle       5:#358        // REF_invokeVirtual ext/mods/gameserver/data/xml/PlayerData.lambda$parseDocument$9:(Lext/mods/commons/data/StatSet;Lorg/w3c/dom/Node;)V
  #358 = Methodref          #11.#359      // ext/mods/gameserver/data/xml/PlayerData.lambda$parseDocument$9:(Lext/mods/commons/data/StatSet;Lorg/w3c/dom/Node;)V
  #359 = NameAndType        #300:#301     // lambda$parseDocument$9:(Lext/mods/commons/data/StatSet;Lorg/w3c/dom/Node;)V
  #360 = MethodHandle       5:#361        // REF_invokeVirtual ext/mods/gameserver/data/xml/PlayerData.lambda$parseDocument$10:(Ljava/util/List;Lorg/w3c/dom/Node;)V
  #361 = Methodref          #11.#362      // ext/mods/gameserver/data/xml/PlayerData.lambda$parseDocument$10:(Ljava/util/List;Lorg/w3c/dom/Node;)V
  #362 = NameAndType        #305:#306     // lambda$parseDocument$10:(Ljava/util/List;Lorg/w3c/dom/Node;)V
  #363 = MethodHandle       5:#364        // REF_invokeVirtual ext/mods/gameserver/data/xml/PlayerData.lambda$parseDocument$8:(Ljava/util/List;Lorg/w3c/dom/Node;)V
  #364 = Methodref          #11.#365      // ext/mods/gameserver/data/xml/PlayerData.lambda$parseDocument$8:(Ljava/util/List;Lorg/w3c/dom/Node;)V
  #365 = NameAndType        #310:#306     // lambda$parseDocument$8:(Ljava/util/List;Lorg/w3c/dom/Node;)V
  #366 = MethodHandle       5:#367        // REF_invokeVirtual ext/mods/gameserver/data/xml/PlayerData.lambda$parseDocument$6:(Ljava/util/List;Lorg/w3c/dom/Node;)V
  #367 = Methodref          #11.#368      // ext/mods/gameserver/data/xml/PlayerData.lambda$parseDocument$6:(Ljava/util/List;Lorg/w3c/dom/Node;)V
  #368 = NameAndType        #315:#306     // lambda$parseDocument$6:(Ljava/util/List;Lorg/w3c/dom/Node;)V
  #369 = MethodHandle       5:#370        // REF_invokeVirtual ext/mods/gameserver/data/xml/PlayerData.lambda$parseDocument$4:(Ljava/util/List;Lorg/w3c/dom/Node;)V
  #370 = Methodref          #11.#371      // ext/mods/gameserver/data/xml/PlayerData.lambda$parseDocument$4:(Ljava/util/List;Lorg/w3c/dom/Node;)V
  #371 = NameAndType        #319:#306     // lambda$parseDocument$4:(Ljava/util/List;Lorg/w3c/dom/Node;)V
  #372 = MethodHandle       6:#373        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #373 = Methodref          #374.#375     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #374 = Class              #376          // java/lang/invoke/LambdaMetafactory
  #375 = NameAndType        #377:#378     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #376 = Utf8               java/lang/invoke/LambdaMetafactory
  #377 = Utf8               metafactory
  #378 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #379 = Utf8               InnerClasses
  #380 = Utf8               SingletonHolder
  #381 = Class              #382          // java/lang/invoke/MethodHandles$Lookup
  #382 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #383 = Class              #384          // java/lang/invoke/MethodHandles
  #384 = Utf8               java/lang/invoke/MethodHandles
  #385 = Utf8               Lookup
{
  protected ext.mods.gameserver.data.xml.PlayerData();
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
        12: putfield      #10                 // Field _templates:Ljava/util/Map;
        15: aload_0
        16: new           #7                  // class java/util/HashMap
        19: dup
        20: invokespecial #9                  // Method java/util/HashMap."<init>":()V
        23: putfield      #16                 // Field _skills:Ljava/util/Map;
        26: aload_0
        27: invokevirtual #19                 // Method load:()V
        30: return
      LineNumberTable:
        line 50: 0
        line 45: 4
        line 47: 15
        line 51: 26
        line 52: 30
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      31     0  this   Lext/mods/gameserver/data/xml/PlayerData;

  public void load();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=4, args_size=1
         0: aload_0
         1: ldc           #22                 // String xml/classes
         3: invokevirtual #24                 // Method parseDataFile:(Ljava/lang/String;)V
         6: getstatic     #28                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
         9: ldc           #32                 // String Loaded {} player classes templates.
        11: iconst_1
        12: anewarray     #2                  // class java/lang/Object
        15: dup
        16: iconst_0
        17: aload_0
        18: getfield      #10                 // Field _templates:Ljava/util/Map;
        21: invokeinterface #34,  1           // InterfaceMethod java/util/Map.size:()I
        26: invokestatic  #40                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        29: aastore
        30: invokevirtual #46                 // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
        33: aload_0
        34: getfield      #10                 // Field _templates:Ljava/util/Map;
        37: invokeinterface #52,  1           // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
        42: invokeinterface #56,  1           // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
        47: astore_1
        48: aload_1
        49: invokeinterface #62,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        54: ifeq          97
        57: aload_1
        58: invokeinterface #68,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        63: checkcast     #72                 // class ext/mods/gameserver/model/actor/template/PlayerTemplate
        66: astore_2
        67: aload_0
        68: getfield      #16                 // Field _skills:Ljava/util/Map;
        71: aload_2
        72: invokevirtual #74                 // Method ext/mods/gameserver/model/actor/template/PlayerTemplate.getClassId:()Lext/mods/gameserver/enums/actors/ClassId;
        75: invokevirtual #78                 // Method ext/mods/gameserver/enums/actors/ClassId.getId:()I
        78: invokestatic  #40                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        81: aload_2
        82: invokevirtual #83                 // Method ext/mods/gameserver/model/actor/template/PlayerTemplate.getSkills:()Ljava/util/List;
        85: invokestatic  #87                 // InterfaceMethod java/util/List.copyOf:(Ljava/util/Collection;)Ljava/util/List;
        88: invokeinterface #93,  3           // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        93: pop
        94: goto          48
        97: aload_0
        98: getfield      #10                 // Field _templates:Ljava/util/Map;
       101: invokeinterface #52,  1           // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
       106: invokeinterface #56,  1           // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
       111: astore_1
       112: aload_1
       113: invokeinterface #62,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
       118: ifeq          178
       121: aload_1
       122: invokeinterface #68,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       127: checkcast     #72                 // class ext/mods/gameserver/model/actor/template/PlayerTemplate
       130: astore_2
       131: aload_2
       132: invokevirtual #74                 // Method ext/mods/gameserver/model/actor/template/PlayerTemplate.getClassId:()Lext/mods/gameserver/enums/actors/ClassId;
       135: invokevirtual #97                 // Method ext/mods/gameserver/enums/actors/ClassId.getParent:()Lext/mods/gameserver/enums/actors/ClassId;
       138: astore_3
       139: aload_3
       140: ifnull        175
       143: aload_2
       144: invokevirtual #83                 // Method ext/mods/gameserver/model/actor/template/PlayerTemplate.getSkills:()Ljava/util/List;
       147: aload_0
       148: getfield      #10                 // Field _templates:Ljava/util/Map;
       151: aload_3
       152: invokevirtual #78                 // Method ext/mods/gameserver/enums/actors/ClassId.getId:()I
       155: invokestatic  #40                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       158: invokeinterface #100,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
       163: checkcast     #72                 // class ext/mods/gameserver/model/actor/template/PlayerTemplate
       166: invokevirtual #83                 // Method ext/mods/gameserver/model/actor/template/PlayerTemplate.getSkills:()Ljava/util/List;
       169: invokeinterface #104,  2          // InterfaceMethod java/util/List.addAll:(Ljava/util/Collection;)Z
       174: pop
       175: goto          112
       178: return
      LineNumberTable:
        line 57: 0
        line 58: 6
        line 60: 33
        line 61: 67
        line 63: 97
        line 65: 131
        line 66: 139
        line 67: 143
        line 68: 175
        line 69: 178
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           67      27     2 template   Lext/mods/gameserver/model/actor/template/PlayerTemplate;
          139      36     3 parentClassId   Lext/mods/gameserver/enums/actors/ClassId;
          131      44     2 template   Lext/mods/gameserver/model/actor/template/PlayerTemplate;
            0     179     0  this   Lext/mods/gameserver/data/xml/PlayerData;
      StackMapTable: number_of_entries = 5
        frame_type = 252 /* append */
          offset_delta = 48
          locals = [ class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 48
        frame_type = 252 /* append */
          offset_delta = 14
          locals = [ class java/util/Iterator ]
        frame_type = 62 /* same */
        frame_type = 250 /* chop */
          offset_delta = 2

  public void parseDocument(org.w3c.dom.Document, java.nio.file.Path);
    descriptor: (Lorg/w3c/dom/Document;Ljava/nio/file/Path;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: ldc           #108                // String list
         4: aload_0
         5: invokedynamic #110,  0            // InvokeDynamic #0:accept:(Lext/mods/gameserver/data/xml/PlayerData;)Ljava/util/function/Consumer;
        10: invokevirtual #114                // Method forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
        13: return
      LineNumberTable:
        line 74: 0
        line 104: 13
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0  this   Lext/mods/gameserver/data/xml/PlayerData;
            0      14     1   doc   Lorg/w3c/dom/Document;
            0      14     2  path   Ljava/nio/file/Path;

  public ext.mods.gameserver.model.actor.template.PlayerTemplate getTemplate(ext.mods.gameserver.enums.actors.ClassId);
    descriptor: (Lext/mods/gameserver/enums/actors/ClassId;)Lext/mods/gameserver/model/actor/template/PlayerTemplate;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #10                 // Field _templates:Ljava/util/Map;
         4: aload_1
         5: invokevirtual #78                 // Method ext/mods/gameserver/enums/actors/ClassId.getId:()I
         8: invokestatic  #40                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        11: invokeinterface #100,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        16: checkcast     #72                 // class ext/mods/gameserver/model/actor/template/PlayerTemplate
        19: areturn
      LineNumberTable:
        line 108: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      20     0  this   Lext/mods/gameserver/data/xml/PlayerData;
            0      20     1 classId   Lext/mods/gameserver/enums/actors/ClassId;

  public ext.mods.gameserver.model.actor.template.PlayerTemplate getTemplate(int);
    descriptor: (I)Lext/mods/gameserver/model/actor/template/PlayerTemplate;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #10                 // Field _templates:Ljava/util/Map;
         4: iload_1
         5: invokestatic  #40                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
         8: invokeinterface #100,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        13: checkcast     #72                 // class ext/mods/gameserver/model/actor/template/PlayerTemplate
        16: areturn
      LineNumberTable:
        line 113: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      17     0  this   Lext/mods/gameserver/data/xml/PlayerData;
            0      17     1 classId   I

  public final java.lang.String getClassNameById(int);
    descriptor: (I)Ljava/lang/String;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=3, args_size=2
         0: aload_0
         1: getfield      #10                 // Field _templates:Ljava/util/Map;
         4: iload_1
         5: invokestatic  #40                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
         8: invokeinterface #100,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        13: checkcast     #72                 // class ext/mods/gameserver/model/actor/template/PlayerTemplate
        16: astore_2
        17: aload_2
        18: ifnull        28
        21: aload_2
        22: invokevirtual #118                // Method ext/mods/gameserver/model/actor/template/PlayerTemplate.getClassName:()Ljava/lang/String;
        25: goto          30
        28: ldc           #122                // String Invalid class
        30: areturn
      LineNumberTable:
        line 118: 0
        line 119: 17
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      31     0  this   Lext/mods/gameserver/data/xml/PlayerData;
            0      31     1 classId   I
           17      14     2 template   Lext/mods/gameserver/model/actor/template/PlayerTemplate;
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 28
          locals = [ class ext/mods/gameserver/model/actor/template/PlayerTemplate ]
        frame_type = 65 /* same_locals_1_stack_item */
          stack = [ class java/lang/String ]

  public java.util.List<ext.mods.gameserver.skills.L2Skill> getSkillsByClassId(int);
    descriptor: (I)Ljava/util/List;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=3, args_size=2
         0: aload_0
         1: getfield      #16                 // Field _skills:Ljava/util/Map;
         4: iload_1
         5: invokestatic  #40                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
         8: invokeinterface #100,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        13: checkcast     #88                 // class java/util/List
        16: astore_2
        17: aload_2
        18: ifnonnull     25
        21: invokestatic  #124                // InterfaceMethod java/util/List.of:()Ljava/util/List;
        24: areturn
        25: aload_2
        26: invokeinterface #127,  1          // InterfaceMethod java/util/List.stream:()Ljava/util/stream/Stream;
        31: invokedynamic #131,  0            // InvokeDynamic #1:apply:()Ljava/util/function/Function;
        36: invokeinterface #135,  2          // InterfaceMethod java/util/stream/Stream.map:(Ljava/util/function/Function;)Ljava/util/stream/Stream;
        41: invokedynamic #141,  0            // InvokeDynamic #2:test:()Ljava/util/function/Predicate;
        46: invokeinterface #145,  2          // InterfaceMethod java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
        51: invokeinterface #149,  1          // InterfaceMethod java/util/stream/Stream.toList:()Ljava/util/List;
        56: areturn
      LineNumberTable:
        line 124: 0
        line 125: 17
        line 126: 21
        line 128: 25
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      57     0  this   Lext/mods/gameserver/data/xml/PlayerData;
            0      57     1    id   I
           17      40     2 template   Ljava/util/List;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
           17      40     2 template   Ljava/util/List<Lext/mods/gameserver/model/holder/skillnode/GeneralSkillNode;>;
      StackMapTable: number_of_entries = 1
        frame_type = 252 /* append */
          offset_delta = 25
          locals = [ class java/util/List ]
    Signature: #284                         // (I)Ljava/util/List<Lext/mods/gameserver/skills/L2Skill;>;

  public static ext.mods.gameserver.data.xml.PlayerData getInstance();
    descriptor: ()Lext/mods/gameserver/data/xml/PlayerData;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #152                // Field ext/mods/gameserver/data/xml/PlayerData$SingletonHolder.INSTANCE:Lext/mods/gameserver/data/xml/PlayerData;
         3: areturn
      LineNumberTable:
        line 133: 0
}
SourceFile: "PlayerData.java"
NestMembers:
  ext/mods/gameserver/data/xml/PlayerData$SingletonHolder
BootstrapMethods:
  0: #372 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #326 (Ljava/lang/Object;)V
      #328 REF_invokeVirtual ext/mods/gameserver/data/xml/PlayerData.lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
      #331 (Lorg/w3c/dom/Node;)V
  1: #372 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #332 (Ljava/lang/Object;)Ljava/lang/Object;
      #333 REF_invokeStatic ext/mods/gameserver/data/xml/PlayerData.lambda$getSkillsByClassId$0:(Lext/mods/gameserver/model/holder/skillnode/GeneralSkillNode;)Lext/mods/gameserver/skills/L2Skill;
      #336 (Lext/mods/gameserver/model/holder/skillnode/GeneralSkillNode;)Lext/mods/gameserver/skills/L2Skill;
  2: #372 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #337 (Ljava/lang/Object;)Z
      #338 REF_invokeStatic ext/mods/gameserver/data/xml/PlayerData.lambda$getSkillsByClassId$1:(Lext/mods/gameserver/skills/L2Skill;)Z
      #341 (Lext/mods/gameserver/skills/L2Skill;)Z
  3: #372 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #326 (Ljava/lang/Object;)V
      #342 REF_invokeVirtual ext/mods/gameserver/data/xml/PlayerData.lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
      #331 (Lorg/w3c/dom/Node;)V
  4: #372 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #326 (Ljava/lang/Object;)V
      #345 REF_invokeVirtual ext/mods/gameserver/data/xml/PlayerData.lambda$parseDocument$2:(Lext/mods/commons/data/StatSet;Lorg/w3c/dom/Node;)V
      #331 (Lorg/w3c/dom/Node;)V
  5: #372 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #326 (Ljava/lang/Object;)V
      #348 REF_invokeVirtual ext/mods/gameserver/data/xml/PlayerData.lambda$parseDocument$3:(Lext/mods/commons/data/StatSet;Lorg/w3c/dom/Node;)V
      #331 (Lorg/w3c/dom/Node;)V
  6: #372 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #326 (Ljava/lang/Object;)V
      #351 REF_invokeVirtual ext/mods/gameserver/data/xml/PlayerData.lambda$parseDocument$5:(Lext/mods/commons/data/StatSet;Lorg/w3c/dom/Node;)V
      #331 (Lorg/w3c/dom/Node;)V
  7: #372 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #326 (Ljava/lang/Object;)V
      #354 REF_invokeVirtual ext/mods/gameserver/data/xml/PlayerData.lambda$parseDocument$7:(Lext/mods/commons/data/StatSet;Lorg/w3c/dom/Node;)V
      #331 (Lorg/w3c/dom/Node;)V
  8: #372 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #326 (Ljava/lang/Object;)V
      #357 REF_invokeVirtual ext/mods/gameserver/data/xml/PlayerData.lambda$parseDocument$9:(Lext/mods/commons/data/StatSet;Lorg/w3c/dom/Node;)V
      #331 (Lorg/w3c/dom/Node;)V
  9: #372 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #326 (Ljava/lang/Object;)V
      #360 REF_invokeVirtual ext/mods/gameserver/data/xml/PlayerData.lambda$parseDocument$10:(Ljava/util/List;Lorg/w3c/dom/Node;)V
      #331 (Lorg/w3c/dom/Node;)V
  10: #372 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #326 (Ljava/lang/Object;)V
      #363 REF_invokeVirtual ext/mods/gameserver/data/xml/PlayerData.lambda$parseDocument$8:(Ljava/util/List;Lorg/w3c/dom/Node;)V
      #331 (Lorg/w3c/dom/Node;)V
  11: #372 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #326 (Ljava/lang/Object;)V
      #366 REF_invokeVirtual ext/mods/gameserver/data/xml/PlayerData.lambda$parseDocument$6:(Ljava/util/List;Lorg/w3c/dom/Node;)V
      #331 (Lorg/w3c/dom/Node;)V
  12: #372 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #326 (Ljava/lang/Object;)V
      #369 REF_invokeVirtual ext/mods/gameserver/data/xml/PlayerData.lambda$parseDocument$4:(Ljava/util/List;Lorg/w3c/dom/Node;)V
      #331 (Lorg/w3c/dom/Node;)V
InnerClasses:
  public static final #385= #381 of #383; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
