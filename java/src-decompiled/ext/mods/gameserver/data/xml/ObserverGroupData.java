// Bytecode for: ext.mods.gameserver.data.xml.ObserverGroupData
// File: ext\mods\gameserver\data\xml\ObserverGroupData.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/data/xml/ObserverGroupData.class
  Last modified 9 de jul de 2026; size 8632 bytes
  MD5 checksum 84bc5b3ff742f529c7d206f0fcc3aecf
  Compiled from "ObserverGroupData.java"
public class ext.mods.gameserver.data.xml.ObserverGroupData implements ext.mods.commons.data.xml.IXmlReader
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #11                         // ext/mods/gameserver/data/xml/ObserverGroupData
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 2, methods: 15, attributes: 4
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
   #10 = Fieldref           #11.#12       // ext/mods/gameserver/data/xml/ObserverGroupData._groups:Ljava/util/Map;
   #11 = Class              #13           // ext/mods/gameserver/data/xml/ObserverGroupData
   #12 = NameAndType        #14:#15       // _groups:Ljava/util/Map;
   #13 = Utf8               ext/mods/gameserver/data/xml/ObserverGroupData
   #14 = Utf8               _groups
   #15 = Utf8               Ljava/util/Map;
   #16 = Class              #17           // java/util/ArrayList
   #17 = Utf8               java/util/ArrayList
   #18 = Methodref          #16.#3        // java/util/ArrayList."<init>":()V
   #19 = Fieldref           #11.#20       // ext/mods/gameserver/data/xml/ObserverGroupData._spawns:Ljava/util/List;
   #20 = NameAndType        #21:#22       // _spawns:Ljava/util/List;
   #21 = Utf8               _spawns
   #22 = Utf8               Ljava/util/List;
   #23 = Methodref          #11.#24       // ext/mods/gameserver/data/xml/ObserverGroupData.load:()V
   #24 = NameAndType        #25:#6        // load:()V
   #25 = Utf8               load
   #26 = String             #27           // xml/observerGroups.xml
   #27 = Utf8               xml/observerGroups.xml
   #28 = Methodref          #11.#29       // ext/mods/gameserver/data/xml/ObserverGroupData.parseDataFile:(Ljava/lang/String;)V
   #29 = NameAndType        #30:#31       // parseDataFile:(Ljava/lang/String;)V
   #30 = Utf8               parseDataFile
   #31 = Utf8               (Ljava/lang/String;)V
   #32 = Fieldref           #11.#33       // ext/mods/gameserver/data/xml/ObserverGroupData.LOGGER:Lext/mods/commons/logging/CLogger;
   #33 = NameAndType        #34:#35       // LOGGER:Lext/mods/commons/logging/CLogger;
   #34 = Utf8               LOGGER
   #35 = Utf8               Lext/mods/commons/logging/CLogger;
   #36 = String             #37           // Loaded {} observer groups and {} spawns.
   #37 = Utf8               Loaded {} observer groups and {} spawns.
   #38 = InterfaceMethodref #39.#40       // java/util/Map.size:()I
   #39 = Class              #41           // java/util/Map
   #40 = NameAndType        #42:#43       // size:()I
   #41 = Utf8               java/util/Map
   #42 = Utf8               size
   #43 = Utf8               ()I
   #44 = Methodref          #45.#46       // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
   #45 = Class              #47           // java/lang/Integer
   #46 = NameAndType        #48:#49       // valueOf:(I)Ljava/lang/Integer;
   #47 = Utf8               java/lang/Integer
   #48 = Utf8               valueOf
   #49 = Utf8               (I)Ljava/lang/Integer;
   #50 = InterfaceMethodref #51.#40       // java/util/List.size:()I
   #51 = Class              #52           // java/util/List
   #52 = Utf8               java/util/List
   #53 = Methodref          #54.#55       // ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
   #54 = Class              #56           // ext/mods/commons/logging/CLogger
   #55 = NameAndType        #57:#58       // info:(Ljava/lang/Object;[Ljava/lang/Object;)V
   #56 = Utf8               ext/mods/commons/logging/CLogger
   #57 = Utf8               info
   #58 = Utf8               (Ljava/lang/Object;[Ljava/lang/Object;)V
   #59 = String             #60           // list
   #60 = Utf8               list
   #61 = InvokeDynamic      #0:#62        // #0:accept:(Lext/mods/gameserver/data/xml/ObserverGroupData;)Ljava/util/function/Consumer;
   #62 = NameAndType        #63:#64       // accept:(Lext/mods/gameserver/data/xml/ObserverGroupData;)Ljava/util/function/Consumer;
   #63 = Utf8               accept
   #64 = Utf8               (Lext/mods/gameserver/data/xml/ObserverGroupData;)Ljava/util/function/Consumer;
   #65 = Methodref          #11.#66       // ext/mods/gameserver/data/xml/ObserverGroupData.forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
   #66 = NameAndType        #67:#68       // forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
   #67 = Utf8               forEach
   #68 = Utf8               (Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
   #69 = InterfaceMethodref #39.#70       // java/util/Map.clear:()V
   #70 = NameAndType        #71:#6        // clear:()V
   #71 = Utf8               clear
   #72 = InterfaceMethodref #51.#73       // java/util/List.iterator:()Ljava/util/Iterator;
   #73 = NameAndType        #74:#75       // iterator:()Ljava/util/Iterator;
   #74 = Utf8               iterator
   #75 = Utf8               ()Ljava/util/Iterator;
   #76 = InterfaceMethodref #77.#78       // java/util/Iterator.hasNext:()Z
   #77 = Class              #79           // java/util/Iterator
   #78 = NameAndType        #80:#81       // hasNext:()Z
   #79 = Utf8               java/util/Iterator
   #80 = Utf8               hasNext
   #81 = Utf8               ()Z
   #82 = InterfaceMethodref #77.#83       // java/util/Iterator.next:()Ljava/lang/Object;
   #83 = NameAndType        #84:#85       // next:()Ljava/lang/Object;
   #84 = Utf8               next
   #85 = Utf8               ()Ljava/lang/Object;
   #86 = Class              #87           // ext/mods/gameserver/model/spawn/Spawn
   #87 = Utf8               ext/mods/gameserver/model/spawn/Spawn
   #88 = Methodref          #86.#89       // ext/mods/gameserver/model/spawn/Spawn.doDelete:()V
   #89 = NameAndType        #90:#6        // doDelete:()V
   #90 = Utf8               doDelete
   #91 = Methodref          #92.#93       // ext/mods/gameserver/data/manager/SpawnManager.getInstance:()Lext/mods/gameserver/data/manager/SpawnManager;
   #92 = Class              #94           // ext/mods/gameserver/data/manager/SpawnManager
   #93 = NameAndType        #95:#96       // getInstance:()Lext/mods/gameserver/data/manager/SpawnManager;
   #94 = Utf8               ext/mods/gameserver/data/manager/SpawnManager
   #95 = Utf8               getInstance
   #96 = Utf8               ()Lext/mods/gameserver/data/manager/SpawnManager;
   #97 = Methodref          #92.#98       // ext/mods/gameserver/data/manager/SpawnManager.deleteSpawn:(Lext/mods/gameserver/model/spawn/Spawn;)V
   #98 = NameAndType        #99:#100      // deleteSpawn:(Lext/mods/gameserver/model/spawn/Spawn;)V
   #99 = Utf8               deleteSpawn
  #100 = Utf8               (Lext/mods/gameserver/model/spawn/Spawn;)V
  #101 = InterfaceMethodref #51.#70       // java/util/List.clear:()V
  #102 = InterfaceMethodref #39.#103      // java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
  #103 = NameAndType        #104:#105     // get:(Ljava/lang/Object;)Ljava/lang/Object;
  #104 = Utf8               get
  #105 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
  #106 = InterfaceMethodref #39.#107      // java/util/Map.values:()Ljava/util/Collection;
  #107 = NameAndType        #108:#109     // values:()Ljava/util/Collection;
  #108 = Utf8               values
  #109 = Utf8               ()Ljava/util/Collection;
  #110 = InterfaceMethodref #111.#112     // java/util/Collection.stream:()Ljava/util/stream/Stream;
  #111 = Class              #113          // java/util/Collection
  #112 = NameAndType        #114:#115     // stream:()Ljava/util/stream/Stream;
  #113 = Utf8               java/util/Collection
  #114 = Utf8               stream
  #115 = Utf8               ()Ljava/util/stream/Stream;
  #116 = InvokeDynamic      #1:#117       // #1:apply:()Ljava/util/function/Function;
  #117 = NameAndType        #118:#119     // apply:()Ljava/util/function/Function;
  #118 = Utf8               apply
  #119 = Utf8               ()Ljava/util/function/Function;
  #120 = InterfaceMethodref #121.#122     // java/util/stream/Stream.flatMap:(Ljava/util/function/Function;)Ljava/util/stream/Stream;
  #121 = Class              #123          // java/util/stream/Stream
  #122 = NameAndType        #124:#125     // flatMap:(Ljava/util/function/Function;)Ljava/util/stream/Stream;
  #123 = Utf8               java/util/stream/Stream
  #124 = Utf8               flatMap
  #125 = Utf8               (Ljava/util/function/Function;)Ljava/util/stream/Stream;
  #126 = InvokeDynamic      #2:#127       // #2:test:(I)Ljava/util/function/Predicate;
  #127 = NameAndType        #128:#129     // test:(I)Ljava/util/function/Predicate;
  #128 = Utf8               test
  #129 = Utf8               (I)Ljava/util/function/Predicate;
  #130 = InterfaceMethodref #121.#131     // java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
  #131 = NameAndType        #132:#133     // filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
  #132 = Utf8               filter
  #133 = Utf8               (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
  #134 = InterfaceMethodref #121.#135     // java/util/stream/Stream.findFirst:()Ljava/util/Optional;
  #135 = NameAndType        #136:#137     // findFirst:()Ljava/util/Optional;
  #136 = Utf8               findFirst
  #137 = Utf8               ()Ljava/util/Optional;
  #138 = Methodref          #139.#140     // java/util/Optional.orElse:(Ljava/lang/Object;)Ljava/lang/Object;
  #139 = Class              #141          // java/util/Optional
  #140 = NameAndType        #142:#105     // orElse:(Ljava/lang/Object;)Ljava/lang/Object;
  #141 = Utf8               java/util/Optional
  #142 = Utf8               orElse
  #143 = Class              #144          // ext/mods/gameserver/model/location/ObserverLocation
  #144 = Utf8               ext/mods/gameserver/model/location/ObserverLocation
  #145 = Fieldref           #146.#147     // ext/mods/gameserver/data/xml/ObserverGroupData$SingletonHolder.INSTANCE:Lext/mods/gameserver/data/xml/ObserverGroupData;
  #146 = Class              #148          // ext/mods/gameserver/data/xml/ObserverGroupData$SingletonHolder
  #147 = NameAndType        #149:#150     // INSTANCE:Lext/mods/gameserver/data/xml/ObserverGroupData;
  #148 = Utf8               ext/mods/gameserver/data/xml/ObserverGroupData$SingletonHolder
  #149 = Utf8               INSTANCE
  #150 = Utf8               Lext/mods/gameserver/data/xml/ObserverGroupData;
  #151 = Methodref          #143.#152     // ext/mods/gameserver/model/location/ObserverLocation.getLocId:()I
  #152 = NameAndType        #153:#43      // getLocId:()I
  #153 = Utf8               getLocId
  #154 = String             #155          // groups
  #155 = Utf8               groups
  #156 = InvokeDynamic      #3:#62        // #3:accept:(Lext/mods/gameserver/data/xml/ObserverGroupData;)Ljava/util/function/Consumer;
  #157 = String             #158          // spawns
  #158 = Utf8               spawns
  #159 = InvokeDynamic      #4:#62        // #4:accept:(Lext/mods/gameserver/data/xml/ObserverGroupData;)Ljava/util/function/Consumer;
  #160 = String             #161          // spawn
  #161 = Utf8               spawn
  #162 = InvokeDynamic      #5:#62        // #5:accept:(Lext/mods/gameserver/data/xml/ObserverGroupData;)Ljava/util/function/Consumer;
  #163 = InterfaceMethodref #164.#165     // org/w3c/dom/Node.getAttributes:()Lorg/w3c/dom/NamedNodeMap;
  #164 = Class              #166          // org/w3c/dom/Node
  #165 = NameAndType        #167:#168     // getAttributes:()Lorg/w3c/dom/NamedNodeMap;
  #166 = Utf8               org/w3c/dom/Node
  #167 = Utf8               getAttributes
  #168 = Utf8               ()Lorg/w3c/dom/NamedNodeMap;
  #169 = String             #170          // id
  #170 = Utf8               id
  #171 = Methodref          #11.#172      // ext/mods/gameserver/data/xml/ObserverGroupData.parseInteger:(Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)Ljava/lang/Integer;
  #172 = NameAndType        #173:#174     // parseInteger:(Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)Ljava/lang/Integer;
  #173 = Utf8               parseInteger
  #174 = Utf8               (Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)Ljava/lang/Integer;
  #175 = Methodref          #45.#176      // java/lang/Integer.intValue:()I
  #176 = NameAndType        #177:#43      // intValue:()I
  #177 = Utf8               intValue
  #178 = Methodref          #179.#180     // ext/mods/gameserver/data/xml/NpcData.getInstance:()Lext/mods/gameserver/data/xml/NpcData;
  #179 = Class              #181          // ext/mods/gameserver/data/xml/NpcData
  #180 = NameAndType        #95:#182      // getInstance:()Lext/mods/gameserver/data/xml/NpcData;
  #181 = Utf8               ext/mods/gameserver/data/xml/NpcData
  #182 = Utf8               ()Lext/mods/gameserver/data/xml/NpcData;
  #183 = Methodref          #179.#184     // ext/mods/gameserver/data/xml/NpcData.getTemplate:(I)Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #184 = NameAndType        #185:#186     // getTemplate:(I)Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #185 = Utf8               getTemplate
  #186 = Utf8               (I)Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #187 = String             #188          // Template {} couldn\'t be found.
  #188 = Utf8               Template {} couldn\'t be found.
  #189 = Methodref          #54.#190      // ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;[Ljava/lang/Object;)V
  #190 = NameAndType        #191:#58      // warn:(Ljava/lang/Object;[Ljava/lang/Object;)V
  #191 = Utf8               warn
  #192 = String             #193          // x
  #193 = Utf8               x
  #194 = String             #195          // y
  #195 = Utf8               y
  #196 = String             #197          // z
  #197 = Utf8               z
  #198 = Class              #199          // java/util/LinkedList
  #199 = Utf8               java/util/LinkedList
  #200 = Methodref          #198.#3       // java/util/LinkedList."<init>":()V
  #201 = Methodref          #11.#202      // ext/mods/gameserver/data/xml/ObserverGroupData.parseString:(Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)Ljava/lang/String;
  #202 = NameAndType        #203:#204     // parseString:(Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)Ljava/lang/String;
  #203 = Utf8               parseString
  #204 = Utf8               (Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)Ljava/lang/String;
  #205 = String             #206          // ;
  #206 = Utf8               ;
  #207 = Methodref          #208.#209     // java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
  #208 = Class              #210          // java/lang/String
  #209 = NameAndType        #211:#212     // split:(Ljava/lang/String;)[Ljava/lang/String;
  #210 = Utf8               java/lang/String
  #211 = Utf8               split
  #212 = Utf8               (Ljava/lang/String;)[Ljava/lang/String;
  #213 = Methodref          #45.#214      // java/lang/Integer.parseInt:(Ljava/lang/String;)I
  #214 = NameAndType        #215:#216     // parseInt:(Ljava/lang/String;)I
  #215 = Utf8               parseInt
  #216 = Utf8               (Ljava/lang/String;)I
  #217 = InterfaceMethodref #51.#218      // java/util/List.add:(Ljava/lang/Object;)Z
  #218 = NameAndType        #219:#220     // add:(Ljava/lang/Object;)Z
  #219 = Utf8               add
  #220 = Utf8               (Ljava/lang/Object;)Z
  #221 = Methodref          #86.#222      // ext/mods/gameserver/model/spawn/Spawn."<init>":(Lext/mods/gameserver/model/actor/template/NpcTemplate;)V
  #222 = NameAndType        #5:#223       // "<init>":(Lext/mods/gameserver/model/actor/template/NpcTemplate;)V
  #223 = Utf8               (Lext/mods/gameserver/model/actor/template/NpcTemplate;)V
  #224 = Methodref          #86.#225      // ext/mods/gameserver/model/spawn/Spawn.setLoc:(IIII)V
  #225 = NameAndType        #226:#227     // setLoc:(IIII)V
  #226 = Utf8               setLoc
  #227 = Utf8               (IIII)V
  #228 = Methodref          #86.#229      // ext/mods/gameserver/model/spawn/Spawn.setRespawnDelay:(I)V
  #229 = NameAndType        #230:#231     // setRespawnDelay:(I)V
  #230 = Utf8               setRespawnDelay
  #231 = Utf8               (I)V
  #232 = Methodref          #92.#233      // ext/mods/gameserver/data/manager/SpawnManager.addSpawn:(Lext/mods/gameserver/model/spawn/Spawn;)V
  #233 = NameAndType        #234:#100     // addSpawn:(Lext/mods/gameserver/model/spawn/Spawn;)V
  #234 = Utf8               addSpawn
  #235 = Methodref          #86.#236      // ext/mods/gameserver/model/spawn/Spawn.doSpawn:(Z)Lext/mods/gameserver/model/actor/Npc;
  #236 = NameAndType        #237:#238     // doSpawn:(Z)Lext/mods/gameserver/model/actor/Npc;
  #237 = Utf8               doSpawn
  #238 = Utf8               (Z)Lext/mods/gameserver/model/actor/Npc;
  #239 = Methodref          #240.#241     // ext/mods/gameserver/model/actor/Npc.setObserverGroups:(Ljava/util/List;)V
  #240 = Class              #242          // ext/mods/gameserver/model/actor/Npc
  #241 = NameAndType        #243:#244     // setObserverGroups:(Ljava/util/List;)V
  #242 = Utf8               ext/mods/gameserver/model/actor/Npc
  #243 = Utf8               setObserverGroups
  #244 = Utf8               (Ljava/util/List;)V
  #245 = Class              #246          // java/lang/Exception
  #246 = Utf8               java/lang/Exception
  #247 = String             #248          // Failed to initialize a spawn.
  #248 = Utf8               Failed to initialize a spawn.
  #249 = Methodref          #54.#250      // ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
  #250 = NameAndType        #251:#252     // error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
  #251 = Utf8               error
  #252 = Utf8               (Ljava/lang/Object;Ljava/lang/Throwable;)V
  #253 = String             #254          // group
  #254 = Utf8               group
  #255 = InvokeDynamic      #6:#62        // #6:accept:(Lext/mods/gameserver/data/xml/ObserverGroupData;)Ljava/util/function/Consumer;
  #256 = InterfaceMethodref #257.#258     // org/w3c/dom/NamedNodeMap.getNamedItem:(Ljava/lang/String;)Lorg/w3c/dom/Node;
  #257 = Class              #259          // org/w3c/dom/NamedNodeMap
  #258 = NameAndType        #260:#261     // getNamedItem:(Ljava/lang/String;)Lorg/w3c/dom/Node;
  #259 = Utf8               org/w3c/dom/NamedNodeMap
  #260 = Utf8               getNamedItem
  #261 = Utf8               (Ljava/lang/String;)Lorg/w3c/dom/Node;
  #262 = InterfaceMethodref #164.#263     // org/w3c/dom/Node.getNodeValue:()Ljava/lang/String;
  #263 = NameAndType        #264:#265     // getNodeValue:()Ljava/lang/String;
  #264 = Utf8               getNodeValue
  #265 = Utf8               ()Ljava/lang/String;
  #266 = InvokeDynamic      #7:#117       // #7:apply:()Ljava/util/function/Function;
  #267 = InterfaceMethodref #39.#268      // java/util/Map.computeIfAbsent:(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;
  #268 = NameAndType        #269:#270     // computeIfAbsent:(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;
  #269 = Utf8               computeIfAbsent
  #270 = Utf8               (Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;
  #271 = String             #272          // entry
  #272 = Utf8               entry
  #273 = InvokeDynamic      #8:#274       // #8:accept:(Lext/mods/gameserver/data/xml/ObserverGroupData;Ljava/util/List;)Ljava/util/function/Consumer;
  #274 = NameAndType        #63:#275      // accept:(Lext/mods/gameserver/data/xml/ObserverGroupData;Ljava/util/List;)Ljava/util/function/Consumer;
  #275 = Utf8               (Lext/mods/gameserver/data/xml/ObserverGroupData;Ljava/util/List;)Ljava/util/function/Consumer;
  #276 = Methodref          #11.#277      // ext/mods/gameserver/data/xml/ObserverGroupData.parseAttributes:(Lorg/w3c/dom/Node;)Lext/mods/commons/data/StatSet;
  #277 = NameAndType        #278:#279     // parseAttributes:(Lorg/w3c/dom/Node;)Lext/mods/commons/data/StatSet;
  #278 = Utf8               parseAttributes
  #279 = Utf8               (Lorg/w3c/dom/Node;)Lext/mods/commons/data/StatSet;
  #280 = Methodref          #143.#281     // ext/mods/gameserver/model/location/ObserverLocation."<init>":(Lext/mods/commons/data/StatSet;)V
  #281 = NameAndType        #5:#282       // "<init>":(Lext/mods/commons/data/StatSet;)V
  #282 = Utf8               (Lext/mods/commons/data/StatSet;)V
  #283 = Class              #284          // ext/mods/commons/data/xml/IXmlReader
  #284 = Utf8               ext/mods/commons/data/xml/IXmlReader
  #285 = Utf8               Signature
  #286 = Utf8               Ljava/util/Map<Ljava/lang/Integer;Ljava/util/List<Lext/mods/gameserver/model/location/ObserverLocation;>;>;
  #287 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/spawn/Spawn;>;
  #288 = Utf8               Code
  #289 = Utf8               LineNumberTable
  #290 = Utf8               LocalVariableTable
  #291 = Utf8               this
  #292 = Utf8               parseDocument
  #293 = Utf8               (Lorg/w3c/dom/Document;Ljava/nio/file/Path;)V
  #294 = Utf8               doc
  #295 = Utf8               Lorg/w3c/dom/Document;
  #296 = Utf8               path
  #297 = Utf8               Ljava/nio/file/Path;
  #298 = Utf8               reload
  #299 = Utf8               Lext/mods/gameserver/model/spawn/Spawn;
  #300 = Utf8               StackMapTable
  #301 = Utf8               getObserverLocations
  #302 = Utf8               (I)Ljava/util/List;
  #303 = Utf8               groupId
  #304 = Utf8               I
  #305 = Utf8               (I)Ljava/util/List<Lext/mods/gameserver/model/location/ObserverLocation;>;
  #306 = Utf8               getObserverLocation
  #307 = Utf8               (I)Lext/mods/gameserver/model/location/ObserverLocation;
  #308 = Utf8               ()Lext/mods/gameserver/data/xml/ObserverGroupData;
  #309 = Utf8               lambda$getObserverLocation$0
  #310 = Utf8               (ILext/mods/gameserver/model/location/ObserverLocation;)Z
  #311 = Utf8               ol
  #312 = Utf8               Lext/mods/gameserver/model/location/ObserverLocation;
  #313 = Utf8               lambda$parseDocument$0
  #314 = Utf8               (Lorg/w3c/dom/Node;)V
  #315 = Utf8               listNode
  #316 = Utf8               Lorg/w3c/dom/Node;
  #317 = Utf8               lambda$parseDocument$5
  #318 = Utf8               spawnsNode
  #319 = Utf8               lambda$parseDocument$6
  #320 = Utf8               splittedString
  #321 = Utf8               Ljava/lang/String;
  #322 = Utf8               arr$
  #323 = Utf8               [Ljava/lang/String;
  #324 = Utf8               len$
  #325 = Utf8               i$
  #326 = Utf8               npc
  #327 = Utf8               Lext/mods/gameserver/model/actor/Npc;
  #328 = Utf8               e
  #329 = Utf8               Ljava/lang/Exception;
  #330 = Utf8               spawnNode
  #331 = Utf8               spawnAttrs
  #332 = Utf8               Lorg/w3c/dom/NamedNodeMap;
  #333 = Utf8               npcId
  #334 = Utf8               template
  #335 = Utf8               Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #336 = Utf8               LocalVariableTypeTable
  #337 = Utf8               Ljava/util/List<Ljava/lang/Integer;>;
  #338 = Class              #339          // ext/mods/gameserver/model/actor/template/NpcTemplate
  #339 = Utf8               ext/mods/gameserver/model/actor/template/NpcTemplate
  #340 = Class              #323          // "[Ljava/lang/String;"
  #341 = Utf8               lambda$parseDocument$1
  #342 = Utf8               groupsNode
  #343 = Utf8               lambda$parseDocument$2
  #344 = Utf8               groupNode
  #345 = Utf8               groupAttrs
  #346 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/location/ObserverLocation;>;
  #347 = Utf8               lambda$parseDocument$4
  #348 = Utf8               (Ljava/util/List;Lorg/w3c/dom/Node;)V
  #349 = Utf8               entryNode
  #350 = Utf8               set
  #351 = Utf8               Lext/mods/commons/data/StatSet;
  #352 = Utf8               lambda$parseDocument$3
  #353 = Utf8               (Ljava/lang/Integer;)Ljava/util/List;
  #354 = Utf8               k
  #355 = Utf8               Ljava/lang/Integer;
  #356 = Utf8               SourceFile
  #357 = Utf8               ObserverGroupData.java
  #358 = Utf8               NestMembers
  #359 = Utf8               BootstrapMethods
  #360 = MethodType         #361          //  (Ljava/lang/Object;)V
  #361 = Utf8               (Ljava/lang/Object;)V
  #362 = MethodHandle       5:#363        // REF_invokeVirtual ext/mods/gameserver/data/xml/ObserverGroupData.lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
  #363 = Methodref          #11.#364      // ext/mods/gameserver/data/xml/ObserverGroupData.lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
  #364 = NameAndType        #313:#314     // lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
  #365 = MethodType         #314          //  (Lorg/w3c/dom/Node;)V
  #366 = MethodType         #105          //  (Ljava/lang/Object;)Ljava/lang/Object;
  #367 = MethodHandle       9:#110        // REF_invokeInterface java/util/Collection.stream:()Ljava/util/stream/Stream;
  #368 = MethodType         #369          //  (Ljava/util/List;)Ljava/util/stream/Stream;
  #369 = Utf8               (Ljava/util/List;)Ljava/util/stream/Stream;
  #370 = MethodType         #220          //  (Ljava/lang/Object;)Z
  #371 = MethodHandle       6:#372        // REF_invokeStatic ext/mods/gameserver/data/xml/ObserverGroupData.lambda$getObserverLocation$0:(ILext/mods/gameserver/model/location/ObserverLocation;)Z
  #372 = Methodref          #11.#373      // ext/mods/gameserver/data/xml/ObserverGroupData.lambda$getObserverLocation$0:(ILext/mods/gameserver/model/location/ObserverLocation;)Z
  #373 = NameAndType        #309:#310     // lambda$getObserverLocation$0:(ILext/mods/gameserver/model/location/ObserverLocation;)Z
  #374 = MethodType         #375          //  (Lext/mods/gameserver/model/location/ObserverLocation;)Z
  #375 = Utf8               (Lext/mods/gameserver/model/location/ObserverLocation;)Z
  #376 = MethodHandle       5:#377        // REF_invokeVirtual ext/mods/gameserver/data/xml/ObserverGroupData.lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
  #377 = Methodref          #11.#378      // ext/mods/gameserver/data/xml/ObserverGroupData.lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
  #378 = NameAndType        #341:#314     // lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
  #379 = MethodHandle       5:#380        // REF_invokeVirtual ext/mods/gameserver/data/xml/ObserverGroupData.lambda$parseDocument$5:(Lorg/w3c/dom/Node;)V
  #380 = Methodref          #11.#381      // ext/mods/gameserver/data/xml/ObserverGroupData.lambda$parseDocument$5:(Lorg/w3c/dom/Node;)V
  #381 = NameAndType        #317:#314     // lambda$parseDocument$5:(Lorg/w3c/dom/Node;)V
  #382 = MethodHandle       5:#383        // REF_invokeVirtual ext/mods/gameserver/data/xml/ObserverGroupData.lambda$parseDocument$6:(Lorg/w3c/dom/Node;)V
  #383 = Methodref          #11.#384      // ext/mods/gameserver/data/xml/ObserverGroupData.lambda$parseDocument$6:(Lorg/w3c/dom/Node;)V
  #384 = NameAndType        #319:#314     // lambda$parseDocument$6:(Lorg/w3c/dom/Node;)V
  #385 = MethodHandle       5:#386        // REF_invokeVirtual ext/mods/gameserver/data/xml/ObserverGroupData.lambda$parseDocument$2:(Lorg/w3c/dom/Node;)V
  #386 = Methodref          #11.#387      // ext/mods/gameserver/data/xml/ObserverGroupData.lambda$parseDocument$2:(Lorg/w3c/dom/Node;)V
  #387 = NameAndType        #343:#314     // lambda$parseDocument$2:(Lorg/w3c/dom/Node;)V
  #388 = MethodHandle       6:#389        // REF_invokeStatic ext/mods/gameserver/data/xml/ObserverGroupData.lambda$parseDocument$3:(Ljava/lang/Integer;)Ljava/util/List;
  #389 = Methodref          #11.#390      // ext/mods/gameserver/data/xml/ObserverGroupData.lambda$parseDocument$3:(Ljava/lang/Integer;)Ljava/util/List;
  #390 = NameAndType        #352:#353     // lambda$parseDocument$3:(Ljava/lang/Integer;)Ljava/util/List;
  #391 = MethodType         #353          //  (Ljava/lang/Integer;)Ljava/util/List;
  #392 = MethodHandle       5:#393        // REF_invokeVirtual ext/mods/gameserver/data/xml/ObserverGroupData.lambda$parseDocument$4:(Ljava/util/List;Lorg/w3c/dom/Node;)V
  #393 = Methodref          #11.#394      // ext/mods/gameserver/data/xml/ObserverGroupData.lambda$parseDocument$4:(Ljava/util/List;Lorg/w3c/dom/Node;)V
  #394 = NameAndType        #347:#348     // lambda$parseDocument$4:(Ljava/util/List;Lorg/w3c/dom/Node;)V
  #395 = MethodHandle       6:#396        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #396 = Methodref          #397.#398     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #397 = Class              #399          // java/lang/invoke/LambdaMetafactory
  #398 = NameAndType        #400:#401     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #399 = Utf8               java/lang/invoke/LambdaMetafactory
  #400 = Utf8               metafactory
  #401 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #402 = Utf8               InnerClasses
  #403 = Utf8               SingletonHolder
  #404 = Class              #405          // java/lang/invoke/MethodHandles$Lookup
  #405 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #406 = Class              #407          // java/lang/invoke/MethodHandles
  #407 = Utf8               java/lang/invoke/MethodHandles
  #408 = Utf8               Lookup
{
  protected ext.mods.gameserver.data.xml.ObserverGroupData();
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
        12: putfield      #10                 // Field _groups:Ljava/util/Map;
        15: aload_0
        16: new           #16                 // class java/util/ArrayList
        19: dup
        20: invokespecial #18                 // Method java/util/ArrayList."<init>":()V
        23: putfield      #19                 // Field _spawns:Ljava/util/List;
        26: aload_0
        27: invokevirtual #23                 // Method load:()V
        30: return
      LineNumberTable:
        line 48: 0
        line 44: 4
        line 45: 15
        line 49: 26
        line 50: 30
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      31     0  this   Lext/mods/gameserver/data/xml/ObserverGroupData;

  public void load();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=1, args_size=1
         0: aload_0
         1: ldc           #26                 // String xml/observerGroups.xml
         3: invokevirtual #28                 // Method parseDataFile:(Ljava/lang/String;)V
         6: getstatic     #32                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
         9: ldc           #36                 // String Loaded {} observer groups and {} spawns.
        11: iconst_2
        12: anewarray     #2                  // class java/lang/Object
        15: dup
        16: iconst_0
        17: aload_0
        18: getfield      #10                 // Field _groups:Ljava/util/Map;
        21: invokeinterface #38,  1           // InterfaceMethod java/util/Map.size:()I
        26: invokestatic  #44                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        29: aastore
        30: dup
        31: iconst_1
        32: aload_0
        33: getfield      #19                 // Field _spawns:Ljava/util/List;
        36: invokeinterface #50,  1           // InterfaceMethod java/util/List.size:()I
        41: invokestatic  #44                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        44: aastore
        45: invokevirtual #53                 // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
        48: return
      LineNumberTable:
        line 55: 0
        line 56: 6
        line 57: 48
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      49     0  this   Lext/mods/gameserver/data/xml/ObserverGroupData;

  public void parseDocument(org.w3c.dom.Document, java.nio.file.Path);
    descriptor: (Lorg/w3c/dom/Document;Ljava/nio/file/Path;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: ldc           #59                 // String list
         4: aload_0
         5: invokedynamic #61,  0             // InvokeDynamic #0:accept:(Lext/mods/gameserver/data/xml/ObserverGroupData;)Ljava/util/function/Consumer;
        10: invokevirtual #65                 // Method forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
        13: return
      LineNumberTable:
        line 62: 0
        line 120: 13
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0  this   Lext/mods/gameserver/data/xml/ObserverGroupData;
            0      14     1   doc   Lorg/w3c/dom/Document;
            0      14     2  path   Ljava/nio/file/Path;

  public void reload();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=3, args_size=1
         0: aload_0
         1: getfield      #10                 // Field _groups:Ljava/util/Map;
         4: invokeinterface #69,  1           // InterfaceMethod java/util/Map.clear:()V
         9: aload_0
        10: getfield      #19                 // Field _spawns:Ljava/util/List;
        13: invokeinterface #72,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
        18: astore_1
        19: aload_1
        20: invokeinterface #76,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        25: ifeq          52
        28: aload_1
        29: invokeinterface #82,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        34: checkcast     #86                 // class ext/mods/gameserver/model/spawn/Spawn
        37: astore_2
        38: aload_2
        39: invokevirtual #88                 // Method ext/mods/gameserver/model/spawn/Spawn.doDelete:()V
        42: invokestatic  #91                 // Method ext/mods/gameserver/data/manager/SpawnManager.getInstance:()Lext/mods/gameserver/data/manager/SpawnManager;
        45: aload_2
        46: invokevirtual #97                 // Method ext/mods/gameserver/data/manager/SpawnManager.deleteSpawn:(Lext/mods/gameserver/model/spawn/Spawn;)V
        49: goto          19
        52: aload_0
        53: getfield      #19                 // Field _spawns:Ljava/util/List;
        56: invokeinterface #101,  1          // InterfaceMethod java/util/List.clear:()V
        61: aload_0
        62: invokevirtual #23                 // Method load:()V
        65: return
      LineNumberTable:
        line 124: 0
        line 126: 9
        line 128: 38
        line 130: 42
        line 131: 49
        line 132: 52
        line 134: 61
        line 135: 65
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           38      11     2 spawn   Lext/mods/gameserver/model/spawn/Spawn;
            0      66     0  this   Lext/mods/gameserver/data/xml/ObserverGroupData;
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 19
          locals = [ class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 32

  public final java.util.List<ext.mods.gameserver.model.location.ObserverLocation> getObserverLocations(int);
    descriptor: (I)Ljava/util/List;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #10                 // Field _groups:Ljava/util/Map;
         4: iload_1
         5: invokestatic  #44                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
         8: invokeinterface #102,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        13: checkcast     #51                 // class java/util/List
        16: areturn
      LineNumberTable:
        line 139: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      17     0  this   Lext/mods/gameserver/data/xml/ObserverGroupData;
            0      17     1 groupId   I
    Signature: #305                         // (I)Ljava/util/List<Lext/mods/gameserver/model/location/ObserverLocation;>;

  public final ext.mods.gameserver.model.location.ObserverLocation getObserverLocation(int);
    descriptor: (I)Lext/mods/gameserver/model/location/ObserverLocation;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #10                 // Field _groups:Ljava/util/Map;
         4: invokeinterface #106,  1          // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
         9: invokeinterface #110,  1          // InterfaceMethod java/util/Collection.stream:()Ljava/util/stream/Stream;
        14: invokedynamic #116,  0            // InvokeDynamic #1:apply:()Ljava/util/function/Function;
        19: invokeinterface #120,  2          // InterfaceMethod java/util/stream/Stream.flatMap:(Ljava/util/function/Function;)Ljava/util/stream/Stream;
        24: iload_1
        25: invokedynamic #126,  0            // InvokeDynamic #2:test:(I)Ljava/util/function/Predicate;
        30: invokeinterface #130,  2          // InterfaceMethod java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
        35: invokeinterface #134,  1          // InterfaceMethod java/util/stream/Stream.findFirst:()Ljava/util/Optional;
        40: aconst_null
        41: invokevirtual #138                // Method java/util/Optional.orElse:(Ljava/lang/Object;)Ljava/lang/Object;
        44: checkcast     #143                // class ext/mods/gameserver/model/location/ObserverLocation
        47: areturn
      LineNumberTable:
        line 144: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      48     0  this   Lext/mods/gameserver/data/xml/ObserverGroupData;
            0      48     1    id   I

  public static ext.mods.gameserver.data.xml.ObserverGroupData getInstance();
    descriptor: ()Lext/mods/gameserver/data/xml/ObserverGroupData;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #145                // Field ext/mods/gameserver/data/xml/ObserverGroupData$SingletonHolder.INSTANCE:Lext/mods/gameserver/data/xml/ObserverGroupData;
         3: areturn
      LineNumberTable:
        line 149: 0
}
SourceFile: "ObserverGroupData.java"
NestMembers:
  ext/mods/gameserver/data/xml/ObserverGroupData$SingletonHolder
BootstrapMethods:
  0: #395 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #360 (Ljava/lang/Object;)V
      #362 REF_invokeVirtual ext/mods/gameserver/data/xml/ObserverGroupData.lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
      #365 (Lorg/w3c/dom/Node;)V
  1: #395 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #366 (Ljava/lang/Object;)Ljava/lang/Object;
      #367 REF_invokeInterface java/util/Collection.stream:()Ljava/util/stream/Stream;
      #368 (Ljava/util/List;)Ljava/util/stream/Stream;
  2: #395 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #370 (Ljava/lang/Object;)Z
      #371 REF_invokeStatic ext/mods/gameserver/data/xml/ObserverGroupData.lambda$getObserverLocation$0:(ILext/mods/gameserver/model/location/ObserverLocation;)Z
      #374 (Lext/mods/gameserver/model/location/ObserverLocation;)Z
  3: #395 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #360 (Ljava/lang/Object;)V
      #376 REF_invokeVirtual ext/mods/gameserver/data/xml/ObserverGroupData.lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
      #365 (Lorg/w3c/dom/Node;)V
  4: #395 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #360 (Ljava/lang/Object;)V
      #379 REF_invokeVirtual ext/mods/gameserver/data/xml/ObserverGroupData.lambda$parseDocument$5:(Lorg/w3c/dom/Node;)V
      #365 (Lorg/w3c/dom/Node;)V
  5: #395 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #360 (Ljava/lang/Object;)V
      #382 REF_invokeVirtual ext/mods/gameserver/data/xml/ObserverGroupData.lambda$parseDocument$6:(Lorg/w3c/dom/Node;)V
      #365 (Lorg/w3c/dom/Node;)V
  6: #395 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #360 (Ljava/lang/Object;)V
      #385 REF_invokeVirtual ext/mods/gameserver/data/xml/ObserverGroupData.lambda$parseDocument$2:(Lorg/w3c/dom/Node;)V
      #365 (Lorg/w3c/dom/Node;)V
  7: #395 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #366 (Ljava/lang/Object;)Ljava/lang/Object;
      #388 REF_invokeStatic ext/mods/gameserver/data/xml/ObserverGroupData.lambda$parseDocument$3:(Ljava/lang/Integer;)Ljava/util/List;
      #391 (Ljava/lang/Integer;)Ljava/util/List;
  8: #395 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #360 (Ljava/lang/Object;)V
      #392 REF_invokeVirtual ext/mods/gameserver/data/xml/ObserverGroupData.lambda$parseDocument$4:(Ljava/util/List;Lorg/w3c/dom/Node;)V
      #365 (Lorg/w3c/dom/Node;)V
InnerClasses:
  public static final #408= #404 of #406; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
