// Bytecode for: ext.mods.gameserver.data.xml.BoatData
// File: ext\mods\gameserver\data\xml\BoatData.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/data/xml/BoatData.class
  Last modified 9 de jul de 2026; size 7732 bytes
  MD5 checksum 7f730722eeb4417087f4ed178d4f9880
  Compiled from "BoatData.java"
public class ext.mods.gameserver.data.xml.BoatData implements ext.mods.commons.data.xml.IXmlReader
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #11                         // ext/mods/gameserver/data/xml/BoatData
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 3, methods: 13, attributes: 4
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
   #10 = Fieldref           #11.#12       // ext/mods/gameserver/data/xml/BoatData._itineraries:Ljava/util/List;
   #11 = Class              #13           // ext/mods/gameserver/data/xml/BoatData
   #12 = NameAndType        #14:#15       // _itineraries:Ljava/util/List;
   #13 = Utf8               ext/mods/gameserver/data/xml/BoatData
   #14 = Utf8               _itineraries
   #15 = Utf8               Ljava/util/List;
   #16 = Class              #17           // java/util/HashMap
   #17 = Utf8               java/util/HashMap
   #18 = Methodref          #16.#3        // java/util/HashMap."<init>":()V
   #19 = Fieldref           #11.#20       // ext/mods/gameserver/data/xml/BoatData._boats:Ljava/util/Map;
   #20 = NameAndType        #21:#22       // _boats:Ljava/util/Map;
   #21 = Utf8               _boats
   #22 = Utf8               Ljava/util/Map;
   #23 = Class              #24           // ext/mods/commons/data/StatSet
   #24 = Utf8               ext/mods/commons/data/StatSet
   #25 = Methodref          #23.#3        // ext/mods/commons/data/StatSet."<init>":()V
   #26 = String             #27           // str
   #27 = Utf8               str
   #28 = Methodref          #23.#29       // ext/mods/commons/data/StatSet.set:(Ljava/lang/String;I)V
   #29 = NameAndType        #30:#31       // set:(Ljava/lang/String;I)V
   #30 = Utf8               set
   #31 = Utf8               (Ljava/lang/String;I)V
   #32 = String             #33           // con
   #33 = Utf8               con
   #34 = String             #35           // dex
   #35 = Utf8               dex
   #36 = String             #37           // int
   #37 = Utf8               int
   #38 = String             #39           // wit
   #39 = Utf8               wit
   #40 = String             #41           // men
   #41 = Utf8               men
   #42 = String             #43           // hp
   #43 = Utf8               hp
   #44 = Integer            50000
   #45 = String             #46           // hpRegen
   #46 = Utf8               hpRegen
   #47 = Double             0.003000000026077032d
   #49 = Methodref          #23.#50       // ext/mods/commons/data/StatSet.set:(Ljava/lang/String;D)V
   #50 = NameAndType        #30:#51       // set:(Ljava/lang/String;D)V
   #51 = Utf8               (Ljava/lang/String;D)V
   #52 = String             #53           // mpRegen
   #53 = Utf8               mpRegen
   #54 = String             #55           // radius
   #55 = Utf8               radius
   #56 = String             #57           // height
   #57 = Utf8               height
   #58 = String             #59           // pAtk
   #59 = Utf8               pAtk
   #60 = String             #61           // mAtk
   #61 = Utf8               mAtk
   #62 = String             #63           // pDef
   #63 = Utf8               pDef
   #64 = String             #65           // mDef
   #65 = Utf8               mDef
   #66 = String             #67           // runSpd
   #67 = Utf8               runSpd
   #68 = Class              #69           // ext/mods/gameserver/model/actor/template/CreatureTemplate
   #69 = Utf8               ext/mods/gameserver/model/actor/template/CreatureTemplate
   #70 = Methodref          #68.#71       // ext/mods/gameserver/model/actor/template/CreatureTemplate."<init>":(Lext/mods/commons/data/StatSet;)V
   #71 = NameAndType        #5:#72        // "<init>":(Lext/mods/commons/data/StatSet;)V
   #72 = Utf8               (Lext/mods/commons/data/StatSet;)V
   #73 = Fieldref           #11.#74       // ext/mods/gameserver/data/xml/BoatData._template:Lext/mods/gameserver/model/actor/template/CreatureTemplate;
   #74 = NameAndType        #75:#76       // _template:Lext/mods/gameserver/model/actor/template/CreatureTemplate;
   #75 = Utf8               _template
   #76 = Utf8               Lext/mods/gameserver/model/actor/template/CreatureTemplate;
   #77 = String             #78           // list
   #78 = Utf8               list
   #79 = InvokeDynamic      #0:#80        // #0:accept:(Lext/mods/gameserver/data/xml/BoatData;)Ljava/util/function/Consumer;
   #80 = NameAndType        #81:#82       // accept:(Lext/mods/gameserver/data/xml/BoatData;)Ljava/util/function/Consumer;
   #81 = Utf8               accept
   #82 = Utf8               (Lext/mods/gameserver/data/xml/BoatData;)Ljava/util/function/Consumer;
   #83 = Methodref          #11.#84       // ext/mods/gameserver/data/xml/BoatData.forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
   #84 = NameAndType        #85:#86       // forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
   #85 = Utf8               forEach
   #86 = Utf8               (Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
   #87 = InterfaceMethodref #88.#89       // java/util/List.clear:()V
   #88 = Class              #90           // java/util/List
   #89 = NameAndType        #91:#6        // clear:()V
   #90 = Utf8               java/util/List
   #91 = Utf8               clear
   #92 = InterfaceMethodref #93.#94       // java/util/Map.values:()Ljava/util/Collection;
   #93 = Class              #95           // java/util/Map
   #94 = NameAndType        #96:#97       // values:()Ljava/util/Collection;
   #95 = Utf8               java/util/Map
   #96 = Utf8               values
   #97 = Utf8               ()Ljava/util/Collection;
   #98 = InvokeDynamic      #1:#99        // #1:accept:()Ljava/util/function/Consumer;
   #99 = NameAndType        #81:#100      // accept:()Ljava/util/function/Consumer;
  #100 = Utf8               ()Ljava/util/function/Consumer;
  #101 = InterfaceMethodref #102.#103     // java/util/Collection.forEach:(Ljava/util/function/Consumer;)V
  #102 = Class              #104          // java/util/Collection
  #103 = NameAndType        #85:#105      // forEach:(Ljava/util/function/Consumer;)V
  #104 = Utf8               java/util/Collection
  #105 = Utf8               (Ljava/util/function/Consumer;)V
  #106 = InterfaceMethodref #93.#89       // java/util/Map.clear:()V
  #107 = Fieldref           #108.#109     // ext/mods/gameserver/enums/boats/BoatDock.VALUES:[Lext/mods/gameserver/enums/boats/BoatDock;
  #108 = Class              #110          // ext/mods/gameserver/enums/boats/BoatDock
  #109 = NameAndType        #111:#112     // VALUES:[Lext/mods/gameserver/enums/boats/BoatDock;
  #110 = Utf8               ext/mods/gameserver/enums/boats/BoatDock
  #111 = Utf8               VALUES
  #112 = Utf8               [Lext/mods/gameserver/enums/boats/BoatDock;
  #113 = Methodref          #108.#114     // ext/mods/gameserver/enums/boats/BoatDock.setBusy:(Z)V
  #114 = NameAndType        #115:#116     // setBusy:(Z)V
  #115 = Utf8               setBusy
  #116 = Utf8               (Z)V
  #117 = Methodref          #118.#119     // ext/mods/gameserver/taskmanager/BoatTaskManager.getInstance:()Lext/mods/gameserver/taskmanager/BoatTaskManager;
  #118 = Class              #120          // ext/mods/gameserver/taskmanager/BoatTaskManager
  #119 = NameAndType        #121:#122     // getInstance:()Lext/mods/gameserver/taskmanager/BoatTaskManager;
  #120 = Utf8               ext/mods/gameserver/taskmanager/BoatTaskManager
  #121 = Utf8               getInstance
  #122 = Utf8               ()Lext/mods/gameserver/taskmanager/BoatTaskManager;
  #123 = Methodref          #118.#89      // ext/mods/gameserver/taskmanager/BoatTaskManager.clear:()V
  #124 = Methodref          #11.#125      // ext/mods/gameserver/data/xml/BoatData.load:()V
  #125 = NameAndType        #126:#6       // load:()V
  #126 = Utf8               load
  #127 = String             #128          // xml/boatRoutes.xml
  #128 = Utf8               xml/boatRoutes.xml
  #129 = Methodref          #11.#130      // ext/mods/gameserver/data/xml/BoatData.parseDataFile:(Ljava/lang/String;)V
  #130 = NameAndType        #131:#132     // parseDataFile:(Ljava/lang/String;)V
  #131 = Utf8               parseDataFile
  #132 = Utf8               (Ljava/lang/String;)V
  #133 = Fieldref           #11.#134      // ext/mods/gameserver/data/xml/BoatData.LOGGER:Lext/mods/commons/logging/CLogger;
  #134 = NameAndType        #135:#136     // LOGGER:Lext/mods/commons/logging/CLogger;
  #135 = Utf8               LOGGER
  #136 = Utf8               Lext/mods/commons/logging/CLogger;
  #137 = String             #138          // Loaded {} boat itineraries.
  #138 = Utf8               Loaded {} boat itineraries.
  #139 = InterfaceMethodref #88.#140      // java/util/List.size:()I
  #140 = NameAndType        #141:#142     // size:()I
  #141 = Utf8               size
  #142 = Utf8               ()I
  #143 = Methodref          #144.#145     // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
  #144 = Class              #146          // java/lang/Integer
  #145 = NameAndType        #147:#148     // valueOf:(I)Ljava/lang/Integer;
  #146 = Utf8               java/lang/Integer
  #147 = Utf8               valueOf
  #148 = Utf8               (I)Ljava/lang/Integer;
  #149 = Methodref          #150.#151     // ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
  #150 = Class              #152          // ext/mods/commons/logging/CLogger
  #151 = NameAndType        #153:#154     // info:(Ljava/lang/Object;[Ljava/lang/Object;)V
  #152 = Utf8               ext/mods/commons/logging/CLogger
  #153 = Utf8               info
  #154 = Utf8               (Ljava/lang/Object;[Ljava/lang/Object;)V
  #155 = InvokeDynamic      #2:#99        // #2:accept:()Ljava/util/function/Consumer;
  #156 = InterfaceMethodref #88.#103      // java/util/List.forEach:(Ljava/util/function/Consumer;)V
  #157 = InterfaceMethodref #93.#158      // java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
  #158 = NameAndType        #159:#160     // get:(Ljava/lang/Object;)Ljava/lang/Object;
  #159 = Utf8               get
  #160 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
  #161 = Class              #162          // ext/mods/gameserver/model/actor/Boat
  #162 = Utf8               ext/mods/gameserver/model/actor/Boat
  #163 = Methodref          #164.#165     // ext/mods/gameserver/idfactory/IdFactory.getInstance:()Lext/mods/gameserver/idfactory/IdFactory;
  #164 = Class              #166          // ext/mods/gameserver/idfactory/IdFactory
  #165 = NameAndType        #121:#167     // getInstance:()Lext/mods/gameserver/idfactory/IdFactory;
  #166 = Utf8               ext/mods/gameserver/idfactory/IdFactory
  #167 = Utf8               ()Lext/mods/gameserver/idfactory/IdFactory;
  #168 = Methodref          #164.#169     // ext/mods/gameserver/idfactory/IdFactory.getNextId:()I
  #169 = NameAndType        #170:#142     // getNextId:()I
  #170 = Utf8               getNextId
  #171 = Methodref          #161.#172     // ext/mods/gameserver/model/actor/Boat."<init>":(ILext/mods/gameserver/model/actor/template/CreatureTemplate;)V
  #172 = NameAndType        #5:#173       // "<init>":(ILext/mods/gameserver/model/actor/template/CreatureTemplate;)V
  #173 = Utf8               (ILext/mods/gameserver/model/actor/template/CreatureTemplate;)V
  #174 = Methodref          #161.#175     // ext/mods/gameserver/model/actor/Boat.spawnMe:(Lext/mods/gameserver/model/boat/BoatItinerary;)V
  #175 = NameAndType        #176:#177     // spawnMe:(Lext/mods/gameserver/model/boat/BoatItinerary;)V
  #176 = Utf8               spawnMe
  #177 = Utf8               (Lext/mods/gameserver/model/boat/BoatItinerary;)V
  #178 = Methodref          #161.#179     // ext/mods/gameserver/model/actor/Boat.getObjectId:()I
  #179 = NameAndType        #180:#142     // getObjectId:()I
  #180 = Utf8               getObjectId
  #181 = InterfaceMethodref #93.#182      // java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #182 = NameAndType        #183:#184     // put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #183 = Utf8               put
  #184 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #185 = Fieldref           #186.#187     // ext/mods/gameserver/data/xml/BoatData$SingletonHolder.INSTANCE:Lext/mods/gameserver/data/xml/BoatData;
  #186 = Class              #188          // ext/mods/gameserver/data/xml/BoatData$SingletonHolder
  #187 = NameAndType        #189:#190     // INSTANCE:Lext/mods/gameserver/data/xml/BoatData;
  #188 = Utf8               ext/mods/gameserver/data/xml/BoatData$SingletonHolder
  #189 = Utf8               INSTANCE
  #190 = Utf8               Lext/mods/gameserver/data/xml/BoatData;
  #191 = Class              #192          // ext/mods/gameserver/model/boat/BoatEngine
  #192 = Utf8               ext/mods/gameserver/model/boat/BoatEngine
  #193 = Methodref          #191.#194     // ext/mods/gameserver/model/boat/BoatEngine."<init>":(Lext/mods/gameserver/model/boat/BoatItinerary;)V
  #194 = NameAndType        #5:#177       // "<init>":(Lext/mods/gameserver/model/boat/BoatItinerary;)V
  #195 = Methodref          #118.#196     // ext/mods/gameserver/taskmanager/BoatTaskManager.add:(Lext/mods/gameserver/model/boat/BoatEngine;)V
  #196 = NameAndType        #197:#198     // add:(Lext/mods/gameserver/model/boat/BoatEngine;)V
  #197 = Utf8               add
  #198 = Utf8               (Lext/mods/gameserver/model/boat/BoatEngine;)V
  #199 = String             #200          // itinerary
  #200 = Utf8               itinerary
  #201 = InvokeDynamic      #3:#80        // #3:accept:(Lext/mods/gameserver/data/xml/BoatData;)Ljava/util/function/Consumer;
  #202 = InterfaceMethodref #203.#204     // org/w3c/dom/Node.getAttributes:()Lorg/w3c/dom/NamedNodeMap;
  #203 = Class              #205          // org/w3c/dom/Node
  #204 = NameAndType        #206:#207     // getAttributes:()Lorg/w3c/dom/NamedNodeMap;
  #205 = Utf8               org/w3c/dom/Node
  #206 = Utf8               getAttributes
  #207 = Utf8               ()Lorg/w3c/dom/NamedNodeMap;
  #208 = String             #209          // dock1
  #209 = Utf8               dock1
  #210 = Methodref          #11.#211      // ext/mods/gameserver/data/xml/BoatData.parseEnum:(Lorg/w3c/dom/NamedNodeMap;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
  #211 = NameAndType        #212:#213     // parseEnum:(Lorg/w3c/dom/NamedNodeMap;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
  #212 = Utf8               parseEnum
  #213 = Utf8               (Lorg/w3c/dom/NamedNodeMap;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
  #214 = String             #215          // dock2
  #215 = Utf8               dock2
  #216 = Methodref          #11.#217      // ext/mods/gameserver/data/xml/BoatData.parseEnum:(Lorg/w3c/dom/NamedNodeMap;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Enum;)Ljava/lang/Enum;
  #217 = NameAndType        #212:#218     // parseEnum:(Lorg/w3c/dom/NamedNodeMap;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Enum;)Ljava/lang/Enum;
  #218 = Utf8               (Lorg/w3c/dom/NamedNodeMap;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Enum;)Ljava/lang/Enum;
  #219 = String             #220          // item1
  #220 = Utf8               item1
  #221 = Methodref          #11.#222      // ext/mods/gameserver/data/xml/BoatData.parseInteger:(Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;Ljava/lang/Integer;)Ljava/lang/Integer;
  #222 = NameAndType        #223:#224     // parseInteger:(Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;Ljava/lang/Integer;)Ljava/lang/Integer;
  #223 = Utf8               parseInteger
  #224 = Utf8               (Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;Ljava/lang/Integer;)Ljava/lang/Integer;
  #225 = Methodref          #144.#226     // java/lang/Integer.intValue:()I
  #226 = NameAndType        #227:#142     // intValue:()I
  #227 = Utf8               intValue
  #228 = String             #229          // item2
  #229 = Utf8               item2
  #230 = String             #231          // heading
  #231 = Utf8               heading
  #232 = Methodref          #11.#233      // ext/mods/gameserver/data/xml/BoatData.parseInteger:(Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)Ljava/lang/Integer;
  #233 = NameAndType        #223:#234     // parseInteger:(Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)Ljava/lang/Integer;
  #234 = Utf8               (Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)Ljava/lang/Integer;
  #235 = String             #236          // route
  #236 = Utf8               route
  #237 = InvokeDynamic      #4:#238       // #4:accept:(Lext/mods/gameserver/data/xml/BoatData;Ljava/util/List;)Ljava/util/function/Consumer;
  #238 = NameAndType        #81:#239      // accept:(Lext/mods/gameserver/data/xml/BoatData;Ljava/util/List;)Ljava/util/function/Consumer;
  #239 = Utf8               (Lext/mods/gameserver/data/xml/BoatData;Ljava/util/List;)Ljava/util/function/Consumer;
  #240 = Class              #241          // ext/mods/gameserver/model/boat/BoatItinerary
  #241 = Utf8               ext/mods/gameserver/model/boat/BoatItinerary
  #242 = Class              #243          // "[Lext/mods/gameserver/model/location/BoatLocation;"
  #243 = Utf8               [Lext/mods/gameserver/model/location/BoatLocation;
  #244 = InterfaceMethodref #88.#245      // java/util/List.toArray:([Ljava/lang/Object;)[Ljava/lang/Object;
  #245 = NameAndType        #246:#247     // toArray:([Ljava/lang/Object;)[Ljava/lang/Object;
  #246 = Utf8               toArray
  #247 = Utf8               ([Ljava/lang/Object;)[Ljava/lang/Object;
  #248 = Class              #249          // "[[Lext/mods/gameserver/model/location/BoatLocation;"
  #249 = Utf8               [[Lext/mods/gameserver/model/location/BoatLocation;
  #250 = Methodref          #240.#251     // ext/mods/gameserver/model/boat/BoatItinerary."<init>":(Lext/mods/gameserver/enums/boats/BoatDock;Lext/mods/gameserver/enums/boats/BoatDock;III[[Lext/mods/gameserver/model/location/BoatLocation;)V
  #251 = NameAndType        #5:#252       // "<init>":(Lext/mods/gameserver/enums/boats/BoatDock;Lext/mods/gameserver/enums/boats/BoatDock;III[[Lext/mods/gameserver/model/location/BoatLocation;)V
  #252 = Utf8               (Lext/mods/gameserver/enums/boats/BoatDock;Lext/mods/gameserver/enums/boats/BoatDock;III[[Lext/mods/gameserver/model/location/BoatLocation;)V
  #253 = InterfaceMethodref #88.#254      // java/util/List.add:(Ljava/lang/Object;)Z
  #254 = NameAndType        #197:#255     // add:(Ljava/lang/Object;)Z
  #255 = Utf8               (Ljava/lang/Object;)Z
  #256 = String             #257          // node
  #257 = Utf8               node
  #258 = InvokeDynamic      #5:#238       // #5:accept:(Lext/mods/gameserver/data/xml/BoatData;Ljava/util/List;)Ljava/util/function/Consumer;
  #259 = Class              #260          // ext/mods/gameserver/model/location/BoatLocation
  #260 = Utf8               ext/mods/gameserver/model/location/BoatLocation
  #261 = Methodref          #11.#262      // ext/mods/gameserver/data/xml/BoatData.parseAttributes:(Lorg/w3c/dom/Node;)Lext/mods/commons/data/StatSet;
  #262 = NameAndType        #263:#264     // parseAttributes:(Lorg/w3c/dom/Node;)Lext/mods/commons/data/StatSet;
  #263 = Utf8               parseAttributes
  #264 = Utf8               (Lorg/w3c/dom/Node;)Lext/mods/commons/data/StatSet;
  #265 = Methodref          #259.#71      // ext/mods/gameserver/model/location/BoatLocation."<init>":(Lext/mods/commons/data/StatSet;)V
  #266 = Class              #267          // ext/mods/commons/data/xml/IXmlReader
  #267 = Utf8               ext/mods/commons/data/xml/IXmlReader
  #268 = Utf8               Signature
  #269 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/boat/BoatItinerary;>;
  #270 = Utf8               Ljava/util/Map<Ljava/lang/Integer;Lext/mods/gameserver/model/actor/Boat;>;
  #271 = Utf8               Code
  #272 = Utf8               LineNumberTable
  #273 = Utf8               LocalVariableTable
  #274 = Utf8               this
  #275 = Utf8               Lext/mods/commons/data/StatSet;
  #276 = Utf8               parseDocument
  #277 = Utf8               (Lorg/w3c/dom/Document;Ljava/nio/file/Path;)V
  #278 = Utf8               doc
  #279 = Utf8               Lorg/w3c/dom/Document;
  #280 = Utf8               path
  #281 = Utf8               Ljava/nio/file/Path;
  #282 = Utf8               reload
  #283 = Utf8               dock
  #284 = Utf8               Lext/mods/gameserver/enums/boats/BoatDock;
  #285 = Utf8               StackMapTable
  #286 = Class              #112          // "[Lext/mods/gameserver/enums/boats/BoatDock;"
  #287 = Utf8               getItineraries
  #288 = Utf8               ()Ljava/util/List;
  #289 = Utf8               ()Ljava/util/List<Lext/mods/gameserver/model/boat/BoatItinerary;>;
  #290 = Utf8               getBoat
  #291 = Utf8               (I)Lext/mods/gameserver/model/actor/Boat;
  #292 = Utf8               boatId
  #293 = Utf8               I
  #294 = Utf8               getNewBoat
  #295 = Utf8               (Lext/mods/gameserver/model/boat/BoatItinerary;)Lext/mods/gameserver/model/actor/Boat;
  #296 = Utf8               Lext/mods/gameserver/model/boat/BoatItinerary;
  #297 = Utf8               boat
  #298 = Utf8               Lext/mods/gameserver/model/actor/Boat;
  #299 = Utf8               ()Lext/mods/gameserver/data/xml/BoatData;
  #300 = Utf8               lambda$load$0
  #301 = Utf8               lambda$parseDocument$0
  #302 = Utf8               (Lorg/w3c/dom/Node;)V
  #303 = Utf8               listNode
  #304 = Utf8               Lorg/w3c/dom/Node;
  #305 = Utf8               lambda$parseDocument$1
  #306 = Utf8               itineraryNode
  #307 = Utf8               attrs
  #308 = Utf8               Lorg/w3c/dom/NamedNodeMap;
  #309 = Utf8               routes
  #310 = Utf8               LocalVariableTypeTable
  #311 = Utf8               Ljava/util/List<[Lext/mods/gameserver/model/location/BoatLocation;>;
  #312 = Utf8               lambda$parseDocument$2
  #313 = Utf8               (Ljava/util/List;Lorg/w3c/dom/Node;)V
  #314 = Utf8               routeNode
  #315 = Utf8               nodes
  #316 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/location/BoatLocation;>;
  #317 = Utf8               lambda$parseDocument$3
  #318 = Utf8               nodeNode
  #319 = Utf8               SourceFile
  #320 = Utf8               BoatData.java
  #321 = Utf8               NestMembers
  #322 = Utf8               BootstrapMethods
  #323 = MethodType         #324          //  (Ljava/lang/Object;)V
  #324 = Utf8               (Ljava/lang/Object;)V
  #325 = MethodHandle       5:#326        // REF_invokeVirtual ext/mods/gameserver/data/xml/BoatData.lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
  #326 = Methodref          #11.#327      // ext/mods/gameserver/data/xml/BoatData.lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
  #327 = NameAndType        #301:#302     // lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
  #328 = MethodType         #302          //  (Lorg/w3c/dom/Node;)V
  #329 = MethodHandle       5:#330        // REF_invokeVirtual ext/mods/gameserver/model/actor/Boat.deleteMe:()V
  #330 = Methodref          #161.#331     // ext/mods/gameserver/model/actor/Boat.deleteMe:()V
  #331 = NameAndType        #332:#6       // deleteMe:()V
  #332 = Utf8               deleteMe
  #333 = MethodType         #334          //  (Lext/mods/gameserver/model/actor/Boat;)V
  #334 = Utf8               (Lext/mods/gameserver/model/actor/Boat;)V
  #335 = MethodHandle       6:#336        // REF_invokeStatic ext/mods/gameserver/data/xml/BoatData.lambda$load$0:(Lext/mods/gameserver/model/boat/BoatItinerary;)V
  #336 = Methodref          #11.#337      // ext/mods/gameserver/data/xml/BoatData.lambda$load$0:(Lext/mods/gameserver/model/boat/BoatItinerary;)V
  #337 = NameAndType        #300:#177     // lambda$load$0:(Lext/mods/gameserver/model/boat/BoatItinerary;)V
  #338 = MethodType         #177          //  (Lext/mods/gameserver/model/boat/BoatItinerary;)V
  #339 = MethodHandle       5:#340        // REF_invokeVirtual ext/mods/gameserver/data/xml/BoatData.lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
  #340 = Methodref          #11.#341      // ext/mods/gameserver/data/xml/BoatData.lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
  #341 = NameAndType        #305:#302     // lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
  #342 = MethodHandle       5:#343        // REF_invokeVirtual ext/mods/gameserver/data/xml/BoatData.lambda$parseDocument$2:(Ljava/util/List;Lorg/w3c/dom/Node;)V
  #343 = Methodref          #11.#344      // ext/mods/gameserver/data/xml/BoatData.lambda$parseDocument$2:(Ljava/util/List;Lorg/w3c/dom/Node;)V
  #344 = NameAndType        #312:#313     // lambda$parseDocument$2:(Ljava/util/List;Lorg/w3c/dom/Node;)V
  #345 = MethodHandle       5:#346        // REF_invokeVirtual ext/mods/gameserver/data/xml/BoatData.lambda$parseDocument$3:(Ljava/util/List;Lorg/w3c/dom/Node;)V
  #346 = Methodref          #11.#347      // ext/mods/gameserver/data/xml/BoatData.lambda$parseDocument$3:(Ljava/util/List;Lorg/w3c/dom/Node;)V
  #347 = NameAndType        #317:#313     // lambda$parseDocument$3:(Ljava/util/List;Lorg/w3c/dom/Node;)V
  #348 = MethodHandle       6:#349        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #349 = Methodref          #350.#351     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #350 = Class              #352          // java/lang/invoke/LambdaMetafactory
  #351 = NameAndType        #353:#354     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #352 = Utf8               java/lang/invoke/LambdaMetafactory
  #353 = Utf8               metafactory
  #354 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #355 = Utf8               InnerClasses
  #356 = Utf8               SingletonHolder
  #357 = Class              #358          // java/lang/invoke/MethodHandles$Lookup
  #358 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #359 = Class              #360          // java/lang/invoke/MethodHandles
  #360 = Utf8               java/lang/invoke/MethodHandles
  #361 = Utf8               Lookup
{
  protected ext.mods.gameserver.data.xml.BoatData();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=4, locals=2, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: new           #7                  // class java/util/ArrayList
         8: dup
         9: invokespecial #9                  // Method java/util/ArrayList."<init>":()V
        12: putfield      #10                 // Field _itineraries:Ljava/util/List;
        15: aload_0
        16: new           #16                 // class java/util/HashMap
        19: dup
        20: invokespecial #18                 // Method java/util/HashMap."<init>":()V
        23: putfield      #19                 // Field _boats:Ljava/util/Map;
        26: new           #23                 // class ext/mods/commons/data/StatSet
        29: dup
        30: invokespecial #25                 // Method ext/mods/commons/data/StatSet."<init>":()V
        33: astore_1
        34: aload_1
        35: ldc           #26                 // String str
        37: iconst_0
        38: invokevirtual #28                 // Method ext/mods/commons/data/StatSet.set:(Ljava/lang/String;I)V
        41: aload_1
        42: ldc           #32                 // String con
        44: iconst_0
        45: invokevirtual #28                 // Method ext/mods/commons/data/StatSet.set:(Ljava/lang/String;I)V
        48: aload_1
        49: ldc           #34                 // String dex
        51: iconst_0
        52: invokevirtual #28                 // Method ext/mods/commons/data/StatSet.set:(Ljava/lang/String;I)V
        55: aload_1
        56: ldc           #36                 // String int
        58: iconst_0
        59: invokevirtual #28                 // Method ext/mods/commons/data/StatSet.set:(Ljava/lang/String;I)V
        62: aload_1
        63: ldc           #38                 // String wit
        65: iconst_0
        66: invokevirtual #28                 // Method ext/mods/commons/data/StatSet.set:(Ljava/lang/String;I)V
        69: aload_1
        70: ldc           #40                 // String men
        72: iconst_0
        73: invokevirtual #28                 // Method ext/mods/commons/data/StatSet.set:(Ljava/lang/String;I)V
        76: aload_1
        77: ldc           #42                 // String hp
        79: ldc           #44                 // int 50000
        81: invokevirtual #28                 // Method ext/mods/commons/data/StatSet.set:(Ljava/lang/String;I)V
        84: aload_1
        85: ldc           #45                 // String hpRegen
        87: ldc2_w        #47                 // double 0.003000000026077032d
        90: invokevirtual #49                 // Method ext/mods/commons/data/StatSet.set:(Ljava/lang/String;D)V
        93: aload_1
        94: ldc           #52                 // String mpRegen
        96: ldc2_w        #47                 // double 0.003000000026077032d
        99: invokevirtual #49                 // Method ext/mods/commons/data/StatSet.set:(Ljava/lang/String;D)V
       102: aload_1
       103: ldc           #54                 // String radius
       105: iconst_0
       106: invokevirtual #28                 // Method ext/mods/commons/data/StatSet.set:(Ljava/lang/String;I)V
       109: aload_1
       110: ldc           #56                 // String height
       112: iconst_0
       113: invokevirtual #28                 // Method ext/mods/commons/data/StatSet.set:(Ljava/lang/String;I)V
       116: aload_1
       117: ldc           #58                 // String pAtk
       119: iconst_0
       120: invokevirtual #28                 // Method ext/mods/commons/data/StatSet.set:(Ljava/lang/String;I)V
       123: aload_1
       124: ldc           #60                 // String mAtk
       126: iconst_0
       127: invokevirtual #28                 // Method ext/mods/commons/data/StatSet.set:(Ljava/lang/String;I)V
       130: aload_1
       131: ldc           #62                 // String pDef
       133: bipush        100
       135: invokevirtual #28                 // Method ext/mods/commons/data/StatSet.set:(Ljava/lang/String;I)V
       138: aload_1
       139: ldc           #64                 // String mDef
       141: bipush        100
       143: invokevirtual #28                 // Method ext/mods/commons/data/StatSet.set:(Ljava/lang/String;I)V
       146: aload_1
       147: ldc           #66                 // String runSpd
       149: iconst_0
       150: invokevirtual #28                 // Method ext/mods/commons/data/StatSet.set:(Ljava/lang/String;I)V
       153: aload_0
       154: new           #68                 // class ext/mods/gameserver/model/actor/template/CreatureTemplate
       157: dup
       158: aload_1
       159: invokespecial #70                 // Method ext/mods/gameserver/model/actor/template/CreatureTemplate."<init>":(Lext/mods/commons/data/StatSet;)V
       162: putfield      #73                 // Field _template:Lext/mods/gameserver/model/actor/template/CreatureTemplate;
       165: return
      LineNumberTable:
        line 49: 0
        line 43: 4
        line 44: 15
        line 50: 26
        line 52: 34
        line 53: 41
        line 54: 48
        line 55: 55
        line 56: 62
        line 57: 69
        line 59: 76
        line 61: 84
        line 62: 93
        line 64: 102
        line 65: 109
        line 67: 116
        line 68: 123
        line 69: 130
        line 70: 138
        line 72: 146
        line 74: 153
        line 75: 165
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     166     0  this   Lext/mods/gameserver/data/xml/BoatData;
           34     132     1   set   Lext/mods/commons/data/StatSet;

  public void parseDocument(org.w3c.dom.Document, java.nio.file.Path);
    descriptor: (Lorg/w3c/dom/Document;Ljava/nio/file/Path;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: ldc           #77                 // String list
         4: aload_0
         5: invokedynamic #79,  0             // InvokeDynamic #0:accept:(Lext/mods/gameserver/data/xml/BoatData;)Ljava/util/function/Consumer;
        10: invokevirtual #83                 // Method forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
        13: return
      LineNumberTable:
        line 80: 0
        line 105: 13
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0  this   Lext/mods/gameserver/data/xml/BoatData;
            0      14     1   doc   Lorg/w3c/dom/Document;
            0      14     2  path   Ljava/nio/file/Path;

  public void reload();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=5, args_size=1
         0: aload_0
         1: getfield      #10                 // Field _itineraries:Ljava/util/List;
         4: invokeinterface #87,  1           // InterfaceMethod java/util/List.clear:()V
         9: aload_0
        10: getfield      #19                 // Field _boats:Ljava/util/Map;
        13: invokeinterface #92,  1           // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
        18: invokedynamic #98,  0             // InvokeDynamic #1:accept:()Ljava/util/function/Consumer;
        23: invokeinterface #101,  2          // InterfaceMethod java/util/Collection.forEach:(Ljava/util/function/Consumer;)V
        28: aload_0
        29: getfield      #19                 // Field _boats:Ljava/util/Map;
        32: invokeinterface #106,  1          // InterfaceMethod java/util/Map.clear:()V
        37: getstatic     #107                // Field ext/mods/gameserver/enums/boats/BoatDock.VALUES:[Lext/mods/gameserver/enums/boats/BoatDock;
        40: astore_1
        41: aload_1
        42: arraylength
        43: istore_2
        44: iconst_0
        45: istore_3
        46: iload_3
        47: iload_2
        48: if_icmpge     68
        51: aload_1
        52: iload_3
        53: aaload
        54: astore        4
        56: aload         4
        58: iconst_0
        59: invokevirtual #113                // Method ext/mods/gameserver/enums/boats/BoatDock.setBusy:(Z)V
        62: iinc          3, 1
        65: goto          46
        68: invokestatic  #117                // Method ext/mods/gameserver/taskmanager/BoatTaskManager.getInstance:()Lext/mods/gameserver/taskmanager/BoatTaskManager;
        71: invokevirtual #123                // Method ext/mods/gameserver/taskmanager/BoatTaskManager.clear:()V
        74: aload_0
        75: invokevirtual #124                // Method load:()V
        78: return
      LineNumberTable:
        line 109: 0
        line 111: 9
        line 112: 28
        line 114: 37
        line 115: 56
        line 114: 62
        line 117: 68
        line 119: 74
        line 120: 78
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           56       6     4  dock   Lext/mods/gameserver/enums/boats/BoatDock;
            0      79     0  this   Lext/mods/gameserver/data/xml/BoatData;
      StackMapTable: number_of_entries = 2
        frame_type = 254 /* append */
          offset_delta = 46
          locals = [ class "[Lext/mods/gameserver/enums/boats/BoatDock;", int, int ]
        frame_type = 248 /* chop */
          offset_delta = 21

  public void load();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=1, args_size=1
         0: aload_0
         1: ldc           #127                // String xml/boatRoutes.xml
         3: invokevirtual #129                // Method parseDataFile:(Ljava/lang/String;)V
         6: getstatic     #133                // Field LOGGER:Lext/mods/commons/logging/CLogger;
         9: ldc           #137                // String Loaded {} boat itineraries.
        11: iconst_1
        12: anewarray     #2                  // class java/lang/Object
        15: dup
        16: iconst_0
        17: aload_0
        18: getfield      #10                 // Field _itineraries:Ljava/util/List;
        21: invokeinterface #139,  1          // InterfaceMethod java/util/List.size:()I
        26: invokestatic  #143                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        29: aastore
        30: invokevirtual #149                // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
        33: aload_0
        34: getfield      #10                 // Field _itineraries:Ljava/util/List;
        37: invokedynamic #155,  0            // InvokeDynamic #2:accept:()Ljava/util/function/Consumer;
        42: invokeinterface #156,  2          // InterfaceMethod java/util/List.forEach:(Ljava/util/function/Consumer;)V
        47: return
      LineNumberTable:
        line 125: 0
        line 126: 6
        line 128: 33
        line 129: 47
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      48     0  this   Lext/mods/gameserver/data/xml/BoatData;

  public java.util.List<ext.mods.gameserver.model.boat.BoatItinerary> getItineraries();
    descriptor: ()Ljava/util/List;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #10                 // Field _itineraries:Ljava/util/List;
         4: areturn
      LineNumberTable:
        line 133: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/data/xml/BoatData;
    Signature: #289                         // ()Ljava/util/List<Lext/mods/gameserver/model/boat/BoatItinerary;>;

  public ext.mods.gameserver.model.actor.Boat getBoat(int);
    descriptor: (I)Lext/mods/gameserver/model/actor/Boat;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #19                 // Field _boats:Ljava/util/Map;
         4: iload_1
         5: invokestatic  #143                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
         8: invokeinterface #157,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        13: checkcast     #161                // class ext/mods/gameserver/model/actor/Boat
        16: areturn
      LineNumberTable:
        line 138: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      17     0  this   Lext/mods/gameserver/data/xml/BoatData;
            0      17     1 boatId   I

  public ext.mods.gameserver.model.actor.Boat getNewBoat(ext.mods.gameserver.model.boat.BoatItinerary);
    descriptor: (Lext/mods/gameserver/model/boat/BoatItinerary;)Lext/mods/gameserver/model/actor/Boat;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=3, args_size=2
         0: new           #161                // class ext/mods/gameserver/model/actor/Boat
         3: dup
         4: invokestatic  #163                // Method ext/mods/gameserver/idfactory/IdFactory.getInstance:()Lext/mods/gameserver/idfactory/IdFactory;
         7: invokevirtual #168                // Method ext/mods/gameserver/idfactory/IdFactory.getNextId:()I
        10: aload_0
        11: getfield      #73                 // Field _template:Lext/mods/gameserver/model/actor/template/CreatureTemplate;
        14: invokespecial #171                // Method ext/mods/gameserver/model/actor/Boat."<init>":(ILext/mods/gameserver/model/actor/template/CreatureTemplate;)V
        17: astore_2
        18: aload_2
        19: aload_1
        20: invokevirtual #174                // Method ext/mods/gameserver/model/actor/Boat.spawnMe:(Lext/mods/gameserver/model/boat/BoatItinerary;)V
        23: aload_0
        24: getfield      #19                 // Field _boats:Ljava/util/Map;
        27: aload_2
        28: invokevirtual #178                // Method ext/mods/gameserver/model/actor/Boat.getObjectId:()I
        31: invokestatic  #143                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        34: aload_2
        35: invokeinterface #181,  3          // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        40: pop
        41: aload_2
        42: areturn
      LineNumberTable:
        line 143: 0
        line 144: 18
        line 146: 23
        line 148: 41
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      43     0  this   Lext/mods/gameserver/data/xml/BoatData;
            0      43     1 itinerary   Lext/mods/gameserver/model/boat/BoatItinerary;
           18      25     2  boat   Lext/mods/gameserver/model/actor/Boat;

  public static final ext.mods.gameserver.data.xml.BoatData getInstance();
    descriptor: ()Lext/mods/gameserver/data/xml/BoatData;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #185                // Field ext/mods/gameserver/data/xml/BoatData$SingletonHolder.INSTANCE:Lext/mods/gameserver/data/xml/BoatData;
         3: areturn
      LineNumberTable:
        line 153: 0
}
SourceFile: "BoatData.java"
NestMembers:
  ext/mods/gameserver/data/xml/BoatData$SingletonHolder
BootstrapMethods:
  0: #348 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #323 (Ljava/lang/Object;)V
      #325 REF_invokeVirtual ext/mods/gameserver/data/xml/BoatData.lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
      #328 (Lorg/w3c/dom/Node;)V
  1: #348 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #323 (Ljava/lang/Object;)V
      #329 REF_invokeVirtual ext/mods/gameserver/model/actor/Boat.deleteMe:()V
      #333 (Lext/mods/gameserver/model/actor/Boat;)V
  2: #348 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #323 (Ljava/lang/Object;)V
      #335 REF_invokeStatic ext/mods/gameserver/data/xml/BoatData.lambda$load$0:(Lext/mods/gameserver/model/boat/BoatItinerary;)V
      #338 (Lext/mods/gameserver/model/boat/BoatItinerary;)V
  3: #348 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #323 (Ljava/lang/Object;)V
      #339 REF_invokeVirtual ext/mods/gameserver/data/xml/BoatData.lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
      #328 (Lorg/w3c/dom/Node;)V
  4: #348 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #323 (Ljava/lang/Object;)V
      #342 REF_invokeVirtual ext/mods/gameserver/data/xml/BoatData.lambda$parseDocument$2:(Ljava/util/List;Lorg/w3c/dom/Node;)V
      #328 (Lorg/w3c/dom/Node;)V
  5: #348 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #323 (Ljava/lang/Object;)V
      #345 REF_invokeVirtual ext/mods/gameserver/data/xml/BoatData.lambda$parseDocument$3:(Ljava/util/List;Lorg/w3c/dom/Node;)V
      #328 (Lorg/w3c/dom/Node;)V
InnerClasses:
  public static final #361= #357 of #359; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
