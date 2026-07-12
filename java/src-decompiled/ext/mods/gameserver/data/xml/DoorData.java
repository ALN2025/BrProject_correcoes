// Bytecode for: ext.mods.gameserver.data.xml.DoorData
// File: ext\mods\gameserver\data\xml\DoorData.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/data/xml/DoorData.class
  Last modified 9 de jul de 2026; size 10874 bytes
  MD5 checksum 885cf346e16b22528021ac0d0910332d
  Compiled from "DoorData.java"
public class ext.mods.gameserver.data.xml.DoorData implements ext.mods.commons.data.xml.IXmlReader
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #11                         // ext/mods/gameserver/data/xml/DoorData
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 1, methods: 17, attributes: 4
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
   #10 = Fieldref           #11.#12       // ext/mods/gameserver/data/xml/DoorData._doors:Ljava/util/Map;
   #11 = Class              #13           // ext/mods/gameserver/data/xml/DoorData
   #12 = NameAndType        #14:#15       // _doors:Ljava/util/Map;
   #13 = Utf8               ext/mods/gameserver/data/xml/DoorData
   #14 = Utf8               _doors
   #15 = Utf8               Ljava/util/Map;
   #16 = Methodref          #11.#17       // ext/mods/gameserver/data/xml/DoorData.load:()V
   #17 = NameAndType        #18:#6        // load:()V
   #18 = Utf8               load
   #19 = String             #20           // xml/doors.xml
   #20 = Utf8               xml/doors.xml
   #21 = Methodref          #11.#22       // ext/mods/gameserver/data/xml/DoorData.parseDataFile:(Ljava/lang/String;)V
   #22 = NameAndType        #23:#24       // parseDataFile:(Ljava/lang/String;)V
   #23 = Utf8               parseDataFile
   #24 = Utf8               (Ljava/lang/String;)V
   #25 = Fieldref           #11.#26       // ext/mods/gameserver/data/xml/DoorData.LOGGER:Lext/mods/commons/logging/CLogger;
   #26 = NameAndType        #27:#28       // LOGGER:Lext/mods/commons/logging/CLogger;
   #27 = Utf8               LOGGER
   #28 = Utf8               Lext/mods/commons/logging/CLogger;
   #29 = String             #30           // Loaded {} doors templates.
   #30 = Utf8               Loaded {} doors templates.
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
   #49 = Class              #50           // java/util/ArrayList
   #50 = Utf8               java/util/ArrayList
   #51 = Methodref          #49.#3        // java/util/ArrayList."<init>":()V
   #52 = String             #53           // list
   #53 = Utf8               list
   #54 = InvokeDynamic      #0:#55        // #0:accept:(Lext/mods/gameserver/data/xml/DoorData;Ljava/util/List;)Ljava/util/function/Consumer;
   #55 = NameAndType        #56:#57       // accept:(Lext/mods/gameserver/data/xml/DoorData;Ljava/util/List;)Ljava/util/function/Consumer;
   #56 = Utf8               accept
   #57 = Utf8               (Lext/mods/gameserver/data/xml/DoorData;Ljava/util/List;)Ljava/util/function/Consumer;
   #58 = Methodref          #11.#59       // ext/mods/gameserver/data/xml/DoorData.forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
   #59 = NameAndType        #60:#61       // forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
   #60 = Utf8               forEach
   #61 = Utf8               (Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
   #62 = InterfaceMethodref #32.#63       // java/util/Map.values:()Ljava/util/Collection;
   #63 = NameAndType        #64:#65       // values:()Ljava/util/Collection;
   #64 = Utf8               values
   #65 = Utf8               ()Ljava/util/Collection;
   #66 = InterfaceMethodref #67.#68       // java/util/Collection.iterator:()Ljava/util/Iterator;
   #67 = Class              #69           // java/util/Collection
   #68 = NameAndType        #70:#71       // iterator:()Ljava/util/Iterator;
   #69 = Utf8               java/util/Collection
   #70 = Utf8               iterator
   #71 = Utf8               ()Ljava/util/Iterator;
   #72 = InterfaceMethodref #73.#74       // java/util/Iterator.hasNext:()Z
   #73 = Class              #75           // java/util/Iterator
   #74 = NameAndType        #76:#77       // hasNext:()Z
   #75 = Utf8               java/util/Iterator
   #76 = Utf8               hasNext
   #77 = Utf8               ()Z
   #78 = InterfaceMethodref #73.#79       // java/util/Iterator.next:()Ljava/lang/Object;
   #79 = NameAndType        #80:#81       // next:()Ljava/lang/Object;
   #80 = Utf8               next
   #81 = Utf8               ()Ljava/lang/Object;
   #82 = Class              #83           // ext/mods/gameserver/model/actor/instance/Door
   #83 = Utf8               ext/mods/gameserver/model/actor/instance/Door
   #84 = Methodref          #82.#85       // ext/mods/gameserver/model/actor/instance/Door.openMe:()V
   #85 = NameAndType        #86:#6        // openMe:()V
   #86 = Utf8               openMe
   #87 = InterfaceMethodref #32.#88       // java/util/Map.clear:()V
   #88 = NameAndType        #89:#6        // clear:()V
   #89 = Utf8               clear
   #90 = Methodref          #11.#91       // ext/mods/gameserver/data/xml/DoorData.spawn:()V
   #91 = NameAndType        #92:#6        // spawn:()V
   #92 = Utf8               spawn
   #93 = InvokeDynamic      #1:#94        // #1:accept:()Ljava/util/function/Consumer;
   #94 = NameAndType        #56:#95       // accept:()Ljava/util/function/Consumer;
   #95 = Utf8               ()Ljava/util/function/Consumer;
   #96 = InterfaceMethodref #67.#97       // java/util/Collection.forEach:(Ljava/util/function/Consumer;)V
   #97 = NameAndType        #60:#98       // forEach:(Ljava/util/function/Consumer;)V
   #98 = Utf8               (Ljava/util/function/Consumer;)V
   #99 = InterfaceMethodref #32.#100      // java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
  #100 = NameAndType        #101:#102     // get:(Ljava/lang/Object;)Ljava/lang/Object;
  #101 = Utf8               get
  #102 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
  #103 = InterfaceMethodref #67.#104      // java/util/Collection.stream:()Ljava/util/stream/Stream;
  #104 = NameAndType        #105:#106     // stream:()Ljava/util/stream/Stream;
  #105 = Utf8               stream
  #106 = Utf8               ()Ljava/util/stream/Stream;
  #107 = InvokeDynamic      #2:#108       // #2:test:(Ljava/lang/String;)Ljava/util/function/Predicate;
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
  #123 = NameAndType        #125:#102     // orElse:(Ljava/lang/Object;)Ljava/lang/Object;
  #124 = Utf8               java/util/Optional
  #125 = Utf8               orElse
  #126 = Fieldref           #127.#128     // ext/mods/gameserver/data/xml/DoorData$SingletonHolder.INSTANCE:Lext/mods/gameserver/data/xml/DoorData;
  #127 = Class              #129          // ext/mods/gameserver/data/xml/DoorData$SingletonHolder
  #128 = NameAndType        #130:#131     // INSTANCE:Lext/mods/gameserver/data/xml/DoorData;
  #129 = Utf8               ext/mods/gameserver/data/xml/DoorData$SingletonHolder
  #130 = Utf8               INSTANCE
  #131 = Utf8               Lext/mods/gameserver/data/xml/DoorData;
  #132 = Methodref          #82.#133      // ext/mods/gameserver/model/actor/instance/Door.getName:()Ljava/lang/String;
  #133 = NameAndType        #134:#135     // getName:()Ljava/lang/String;
  #134 = Utf8               getName
  #135 = Utf8               ()Ljava/lang/String;
  #136 = Methodref          #137.#138     // java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
  #137 = Class              #139          // java/lang/String
  #138 = NameAndType        #140:#141     // equalsIgnoreCase:(Ljava/lang/String;)Z
  #139 = Utf8               java/lang/String
  #140 = Utf8               equalsIgnoreCase
  #141 = Utf8               (Ljava/lang/String;)Z
  #142 = String             #143          // door
  #143 = Utf8               door
  #144 = InvokeDynamic      #3:#55        // #3:accept:(Lext/mods/gameserver/data/xml/DoorData;Ljava/util/List;)Ljava/util/function/Consumer;
  #145 = Methodref          #11.#146      // ext/mods/gameserver/data/xml/DoorData.parseAttributes:(Lorg/w3c/dom/Node;)Lext/mods/commons/data/StatSet;
  #146 = NameAndType        #147:#148     // parseAttributes:(Lorg/w3c/dom/Node;)Lext/mods/commons/data/StatSet;
  #147 = Utf8               parseAttributes
  #148 = Utf8               (Lorg/w3c/dom/Node;)Lext/mods/commons/data/StatSet;
  #149 = String             #150          // id
  #150 = Utf8               id
  #151 = Methodref          #152.#153     // ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
  #152 = Class              #154          // ext/mods/commons/data/StatSet
  #153 = NameAndType        #155:#156     // getInteger:(Ljava/lang/String;)I
  #154 = Utf8               ext/mods/commons/data/StatSet
  #155 = Utf8               getInteger
  #156 = Utf8               (Ljava/lang/String;)I
  #157 = String             #158          // position
  #158 = Utf8               position
  #159 = InvokeDynamic      #4:#160       // #4:accept:(Lext/mods/gameserver/data/xml/DoorData;Lext/mods/commons/data/StatSet;)Ljava/util/function/Consumer;
  #160 = NameAndType        #56:#161      // accept:(Lext/mods/gameserver/data/xml/DoorData;Lext/mods/commons/data/StatSet;)Ljava/util/function/Consumer;
  #161 = Utf8               (Lext/mods/gameserver/data/xml/DoorData;Lext/mods/commons/data/StatSet;)Ljava/util/function/Consumer;
  #162 = String             #163          // coordinates
  #163 = Utf8               coordinates
  #164 = InvokeDynamic      #5:#55        // #5:accept:(Lext/mods/gameserver/data/xml/DoorData;Ljava/util/List;)Ljava/util/function/Consumer;
  #165 = String             #166          // coords
  #166 = Utf8               coords
  #167 = InvokeDynamic      #6:#168       // #6:apply:()Ljava/util/function/IntFunction;
  #168 = NameAndType        #169:#170     // apply:()Ljava/util/function/IntFunction;
  #169 = Utf8               apply
  #170 = Utf8               ()Ljava/util/function/IntFunction;
  #171 = InterfaceMethodref #172.#173     // java/util/List.toArray:(Ljava/util/function/IntFunction;)[Ljava/lang/Object;
  #172 = Class              #174          // java/util/List
  #173 = NameAndType        #175:#176     // toArray:(Ljava/util/function/IntFunction;)[Ljava/lang/Object;
  #174 = Utf8               java/util/List
  #175 = Utf8               toArray
  #176 = Utf8               (Ljava/util/function/IntFunction;)[Ljava/lang/Object;
  #177 = Methodref          #152.#178     // ext/mods/commons/data/StatSet.set:(Ljava/lang/String;Ljava/lang/Object;)V
  #178 = NameAndType        #179:#180     // set:(Ljava/lang/String;Ljava/lang/Object;)V
  #179 = Utf8               set
  #180 = Utf8               (Ljava/lang/String;Ljava/lang/Object;)V
  #181 = Integer            2147483647
  #182 = Integer            -2147483648
  #183 = InterfaceMethodref #172.#68      // java/util/List.iterator:()Ljava/util/Iterator;
  #184 = Class              #185          // ext/mods/gameserver/model/location/Point2D
  #185 = Utf8               ext/mods/gameserver/model/location/Point2D
  #186 = Methodref          #184.#187     // ext/mods/gameserver/model/location/Point2D.getX:()I
  #187 = NameAndType        #188:#36      // getX:()I
  #188 = Utf8               getX
  #189 = Methodref          #190.#191     // java/lang/Math.min:(II)I
  #190 = Class              #192          // java/lang/Math
  #191 = NameAndType        #193:#194     // min:(II)I
  #192 = Utf8               java/lang/Math
  #193 = Utf8               min
  #194 = Utf8               (II)I
  #195 = Methodref          #190.#196     // java/lang/Math.max:(II)I
  #196 = NameAndType        #197:#194     // max:(II)I
  #197 = Utf8               max
  #198 = Methodref          #184.#199     // ext/mods/gameserver/model/location/Point2D.getY:()I
  #199 = NameAndType        #200:#36      // getY:()I
  #200 = Utf8               getY
  #201 = Methodref          #202.#203     // ext/mods/gameserver/model/World.isOutOfWorld:(IIII)Z
  #202 = Class              #204          // ext/mods/gameserver/model/World
  #203 = NameAndType        #205:#206     // isOutOfWorld:(IIII)Z
  #204 = Utf8               ext/mods/gameserver/model/World
  #205 = Utf8               isOutOfWorld
  #206 = Utf8               (IIII)Z
  #207 = String             #208          // Door id {} coords are outside of world.
  #208 = Utf8               Door id {} coords are outside of world.
  #209 = Methodref          #44.#210      // ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;[Ljava/lang/Object;)V
  #210 = NameAndType        #211:#48      // error:(Ljava/lang/Object;[Ljava/lang/Object;)V
  #211 = Utf8               error
  #212 = String             #213          // stats|function
  #213 = Utf8               stats|function
  #214 = InvokeDynamic      #7:#160       // #7:accept:(Lext/mods/gameserver/data/xml/DoorData;Lext/mods/commons/data/StatSet;)Ljava/util/function/Consumer;
  #215 = String             #216          // posX
  #216 = Utf8               posX
  #217 = String             #218          // posY
  #218 = Utf8               posY
  #219 = String             #220          // posZ
  #220 = Utf8               posZ
  #221 = Methodref          #222.#223     // ext/mods/gameserver/geoengine/GeoEngine.getGeoX:(I)I
  #222 = Class              #224          // ext/mods/gameserver/geoengine/GeoEngine
  #223 = NameAndType        #225:#226     // getGeoX:(I)I
  #224 = Utf8               ext/mods/gameserver/geoengine/GeoEngine
  #225 = Utf8               getGeoX
  #226 = Utf8               (I)I
  #227 = Methodref          #222.#228     // ext/mods/gameserver/geoengine/GeoEngine.getGeoY:(I)I
  #228 = NameAndType        #229:#226     // getGeoY:(I)I
  #229 = Utf8               getGeoY
  #230 = Methodref          #222.#231     // ext/mods/gameserver/geoengine/GeoEngine.getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
  #231 = NameAndType        #232:#233     // getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
  #232 = Utf8               getInstance
  #233 = Utf8               ()Lext/mods/gameserver/geoengine/GeoEngine;
  #234 = Methodref          #222.#235     // ext/mods/gameserver/geoengine/GeoEngine.getHeightNearest:(III)S
  #235 = NameAndType        #236:#237     // getHeightNearest:(III)S
  #236 = Utf8               getHeightNearest
  #237 = Utf8               (III)S
  #238 = Methodref          #222.#239     // ext/mods/gameserver/geoengine/GeoEngine.getBlock:(II)Lext/mods/gameserver/geoengine/geodata/ABlock;
  #239 = NameAndType        #240:#241     // getBlock:(II)Lext/mods/gameserver/geoengine/geodata/ABlock;
  #240 = Utf8               getBlock
  #241 = Utf8               (II)Lext/mods/gameserver/geoengine/geodata/ABlock;
  #242 = Methodref          #243.#244     // ext/mods/gameserver/geoengine/geodata/ABlock.getIndexAbove:(IIILext/mods/gameserver/geoengine/geodata/IGeoObject;)I
  #243 = Class              #245          // ext/mods/gameserver/geoengine/geodata/ABlock
  #244 = NameAndType        #246:#247     // getIndexAbove:(IIILext/mods/gameserver/geoengine/geodata/IGeoObject;)I
  #245 = Utf8               ext/mods/gameserver/geoengine/geodata/ABlock
  #246 = Utf8               getIndexAbove
  #247 = Utf8               (IIILext/mods/gameserver/geoengine/geodata/IGeoObject;)I
  #248 = Methodref          #243.#249     // ext/mods/gameserver/geoengine/geodata/ABlock.getHeight:(ILext/mods/gameserver/geoengine/geodata/IGeoObject;)S
  #249 = NameAndType        #250:#251     // getHeight:(ILext/mods/gameserver/geoengine/geodata/IGeoObject;)S
  #250 = Utf8               getHeight
  #251 = Utf8               (ILext/mods/gameserver/geoengine/geodata/IGeoObject;)S
  #252 = String             #253          // height
  #253 = Utf8               height
  #254 = Class              #255          // ext/mods/gameserver/geoengine/geodata/GeoStructure
  #255 = Utf8               ext/mods/gameserver/geoengine/geodata/GeoStructure
  #256 = Methodref          #152.#257     // ext/mods/commons/data/StatSet.set:(Ljava/lang/String;I)V
  #257 = NameAndType        #179:#258     // set:(Ljava/lang/String;I)V
  #258 = Utf8               (Ljava/lang/String;I)V
  #259 = String             #260          // type
  #260 = Utf8               type
  #261 = Class              #262          // ext/mods/gameserver/enums/DoorType
  #262 = Utf8               ext/mods/gameserver/enums/DoorType
  #263 = Methodref          #152.#264     // ext/mods/commons/data/StatSet.getEnum:(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Enum;
  #264 = NameAndType        #265:#266     // getEnum:(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Enum;
  #265 = Utf8               getEnum
  #266 = Utf8               (Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Enum;
  #267 = Fieldref           #261.#268     // ext/mods/gameserver/enums/DoorType.WALL:Lext/mods/gameserver/enums/DoorType;
  #268 = NameAndType        #269:#270     // WALL:Lext/mods/gameserver/enums/DoorType;
  #269 = Utf8               WALL
  #270 = Utf8               Lext/mods/gameserver/enums/DoorType;
  #271 = Class              #272          // "[[Z"
  #272 = Utf8               [[Z
  #273 = Class              #274          // ext/mods/commons/geometry/Polygon
  #274 = Utf8               ext/mods/commons/geometry/Polygon
  #275 = Methodref          #273.#276     // ext/mods/commons/geometry/Polygon."<init>":(Ljava/util/List;)V
  #276 = NameAndType        #5:#277       // "<init>":(Ljava/util/List;)V
  #277 = Utf8               (Ljava/util/List;)V
  #278 = InterfaceMethodref #172.#88      // java/util/List.clear:()V
  #279 = Class              #280          // java/lang/Exception
  #280 = Utf8               java/lang/Exception
  #281 = String             #282          // Cannot load door id {}
  #282 = Utf8               Cannot load door id {}
  #283 = Methodref          #44.#284      // ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;[Ljava/lang/Object;)V
  #284 = NameAndType        #285:#48      // warn:(Ljava/lang/Object;[Ljava/lang/Object;)V
  #285 = Utf8               warn
  #286 = Methodref          #190.#287     // java/lang/Math.abs:(I)I
  #287 = NameAndType        #288:#226     // abs:(I)I
  #288 = Utf8               abs
  #289 = Methodref          #222.#290     // ext/mods/gameserver/geoengine/GeoEngine.getWorldX:(I)I
  #290 = NameAndType        #291:#226     // getWorldX:(I)I
  #291 = Utf8               getWorldX
  #292 = Methodref          #222.#293     // ext/mods/gameserver/geoengine/GeoEngine.getWorldY:(I)I
  #293 = NameAndType        #294:#226     // getWorldY:(I)I
  #294 = Utf8               getWorldY
  #295 = Methodref          #273.#296     // ext/mods/commons/geometry/Polygon.isInside:(II)Z
  #296 = NameAndType        #297:#298     // isInside:(II)Z
  #297 = Utf8               isInside
  #298 = Utf8               (II)Z
  #299 = String             #300          // geoX
  #300 = Utf8               geoX
  #301 = String             #302          // geoY
  #302 = Utf8               geoY
  #303 = String             #304          // geoZ
  #304 = Utf8               geoZ
  #305 = String             #306          // geoData
  #306 = Utf8               geoData
  #307 = Methodref          #222.#308     // ext/mods/gameserver/geoengine/GeoEngine.calculateGeoObject:([[Z)[[B
  #308 = NameAndType        #309:#310     // calculateGeoObject:([[Z)[[B
  #309 = Utf8               calculateGeoObject
  #310 = Utf8               ([[Z)[[B
  #311 = String             #312          // pAtk
  #312 = Utf8               pAtk
  #313 = String             #314          // mAtk
  #314 = Utf8               mAtk
  #315 = String             #316          // runSpd
  #316 = Utf8               runSpd
  #317 = String             #318          // radius
  #318 = Utf8               radius
  #319 = Methodref          #320.#321     // ext/mods/gameserver/idfactory/IdFactory.getInstance:()Lext/mods/gameserver/idfactory/IdFactory;
  #320 = Class              #322          // ext/mods/gameserver/idfactory/IdFactory
  #321 = NameAndType        #232:#323     // getInstance:()Lext/mods/gameserver/idfactory/IdFactory;
  #322 = Utf8               ext/mods/gameserver/idfactory/IdFactory
  #323 = Utf8               ()Lext/mods/gameserver/idfactory/IdFactory;
  #324 = Methodref          #320.#325     // ext/mods/gameserver/idfactory/IdFactory.getNextId:()I
  #325 = NameAndType        #326:#36      // getNextId:()I
  #326 = Utf8               getNextId
  #327 = Class              #328          // ext/mods/gameserver/model/actor/template/DoorTemplate
  #328 = Utf8               ext/mods/gameserver/model/actor/template/DoorTemplate
  #329 = Methodref          #327.#330     // ext/mods/gameserver/model/actor/template/DoorTemplate."<init>":(Lext/mods/commons/data/StatSet;)V
  #330 = NameAndType        #5:#331       // "<init>":(Lext/mods/commons/data/StatSet;)V
  #331 = Utf8               (Lext/mods/commons/data/StatSet;)V
  #332 = Methodref          #82.#333      // ext/mods/gameserver/model/actor/instance/Door."<init>":(ILext/mods/gameserver/model/actor/template/DoorTemplate;)V
  #333 = NameAndType        #5:#334       // "<init>":(ILext/mods/gameserver/model/actor/template/DoorTemplate;)V
  #334 = Utf8               (ILext/mods/gameserver/model/actor/template/DoorTemplate;)V
  #335 = Methodref          #82.#336      // ext/mods/gameserver/model/actor/instance/Door.getStatus:()Lext/mods/gameserver/model/actor/status/DoorStatus;
  #336 = NameAndType        #337:#338     // getStatus:()Lext/mods/gameserver/model/actor/status/DoorStatus;
  #337 = Utf8               getStatus
  #338 = Utf8               ()Lext/mods/gameserver/model/actor/status/DoorStatus;
  #339 = Methodref          #340.#341     // ext/mods/gameserver/model/actor/status/DoorStatus.setMaxHpMp:()V
  #340 = Class              #342          // ext/mods/gameserver/model/actor/status/DoorStatus
  #341 = NameAndType        #343:#6       // setMaxHpMp:()V
  #342 = Utf8               ext/mods/gameserver/model/actor/status/DoorStatus
  #343 = Utf8               setMaxHpMp
  #344 = Methodref          #82.#345      // ext/mods/gameserver/model/actor/instance/Door.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
  #345 = NameAndType        #346:#347     // getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
  #346 = Utf8               getPosition
  #347 = Utf8               ()Lext/mods/gameserver/model/location/SpawnLocation;
  #348 = Methodref          #349.#350     // ext/mods/gameserver/model/location/SpawnLocation.set:(III)V
  #349 = Class              #351          // ext/mods/gameserver/model/location/SpawnLocation
  #350 = NameAndType        #179:#352     // set:(III)V
  #351 = Utf8               ext/mods/gameserver/model/location/SpawnLocation
  #352 = Utf8               (III)V
  #353 = Methodref          #82.#354      // ext/mods/gameserver/model/actor/instance/Door.getDoorId:()I
  #354 = NameAndType        #355:#36      // getDoorId:()I
  #355 = Utf8               getDoorId
  #356 = InterfaceMethodref #32.#357      // java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #357 = NameAndType        #358:#359     // put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #358 = Utf8               put
  #359 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #360 = Methodref          #152.#361     // ext/mods/commons/data/StatSet.putAll:(Ljava/util/Map;)V
  #361 = NameAndType        #362:#363     // putAll:(Ljava/util/Map;)V
  #362 = Utf8               putAll
  #363 = Utf8               (Ljava/util/Map;)V
  #364 = String             #365          // loc
  #365 = Utf8               loc
  #366 = InvokeDynamic      #8:#55        // #8:accept:(Lext/mods/gameserver/data/xml/DoorData;Ljava/util/List;)Ljava/util/function/Consumer;
  #367 = InterfaceMethodref #368.#369     // org/w3c/dom/Node.getAttributes:()Lorg/w3c/dom/NamedNodeMap;
  #368 = Class              #370          // org/w3c/dom/Node
  #369 = NameAndType        #371:#372     // getAttributes:()Lorg/w3c/dom/NamedNodeMap;
  #370 = Utf8               org/w3c/dom/Node
  #371 = Utf8               getAttributes
  #372 = Utf8               ()Lorg/w3c/dom/NamedNodeMap;
  #373 = String             #374          // x
  #374 = Utf8               x
  #375 = Methodref          #11.#376      // ext/mods/gameserver/data/xml/DoorData.parseInteger:(Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)Ljava/lang/Integer;
  #376 = NameAndType        #377:#378     // parseInteger:(Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)Ljava/lang/Integer;
  #377 = Utf8               parseInteger
  #378 = Utf8               (Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)Ljava/lang/Integer;
  #379 = Methodref          #38.#380      // java/lang/Integer.intValue:()I
  #380 = NameAndType        #381:#36      // intValue:()I
  #381 = Utf8               intValue
  #382 = String             #383          // y
  #383 = Utf8               y
  #384 = Methodref          #184.#385     // ext/mods/gameserver/model/location/Point2D."<init>":(II)V
  #385 = NameAndType        #5:#386       // "<init>":(II)V
  #386 = Utf8               (II)V
  #387 = InterfaceMethodref #172.#388     // java/util/List.add:(Ljava/lang/Object;)Z
  #388 = NameAndType        #389:#390     // add:(Ljava/lang/Object;)Z
  #389 = Utf8               add
  #390 = Utf8               (Ljava/lang/Object;)Z
  #391 = String             #392          // z
  #392 = Utf8               z
  #393 = Class              #394          // ext/mods/commons/data/xml/IXmlReader
  #394 = Utf8               ext/mods/commons/data/xml/IXmlReader
  #395 = Utf8               Signature
  #396 = Utf8               Ljava/util/Map<Ljava/lang/Integer;Lext/mods/gameserver/model/actor/instance/Door;>;
  #397 = Utf8               Code
  #398 = Utf8               LineNumberTable
  #399 = Utf8               LocalVariableTable
  #400 = Utf8               this
  #401 = Utf8               parseDocument
  #402 = Utf8               (Lorg/w3c/dom/Document;Ljava/nio/file/Path;)V
  #403 = Utf8               doc
  #404 = Utf8               Lorg/w3c/dom/Document;
  #405 = Utf8               path
  #406 = Utf8               Ljava/nio/file/Path;
  #407 = Utf8               Ljava/util/List;
  #408 = Utf8               LocalVariableTypeTable
  #409 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/location/Point2D;>;
  #410 = Utf8               reload
  #411 = Utf8               Lext/mods/gameserver/model/actor/instance/Door;
  #412 = Utf8               StackMapTable
  #413 = Utf8               getDoor
  #414 = Utf8               (I)Lext/mods/gameserver/model/actor/instance/Door;
  #415 = Utf8               I
  #416 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/model/actor/instance/Door;
  #417 = Utf8               name
  #418 = Utf8               Ljava/lang/String;
  #419 = Utf8               getDoors
  #420 = Utf8               ()Ljava/util/Collection<Lext/mods/gameserver/model/actor/instance/Door;>;
  #421 = Utf8               ()Lext/mods/gameserver/data/xml/DoorData;
  #422 = Utf8               lambda$getDoor$0
  #423 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/actor/instance/Door;)Z
  #424 = Utf8               d
  #425 = Utf8               lambda$parseDocument$0
  #426 = Utf8               (Ljava/util/List;Lorg/w3c/dom/Node;)V
  #427 = Utf8               listNode
  #428 = Utf8               Lorg/w3c/dom/Node;
  #429 = Utf8               lambda$parseDocument$1
  #430 = Utf8               coord
  #431 = Utf8               Lext/mods/gameserver/model/location/Point2D;
  #432 = Utf8               i$
  #433 = Utf8               Ljava/util/Iterator;
  #434 = Utf8               layerDiff
  #435 = Utf8               e
  #436 = Utf8               Ljava/lang/Exception;
  #437 = Utf8               wiy
  #438 = Utf8               wix
  #439 = Utf8               gx
  #440 = Utf8               gy
  #441 = Utf8               worldX
  #442 = Utf8               worldY
  #443 = Utf8               iy
  #444 = Utf8               ix
  #445 = Utf8               doorNode
  #446 = Utf8               Lext/mods/commons/data/StatSet;
  #447 = Utf8               minX
  #448 = Utf8               maxX
  #449 = Utf8               minY
  #450 = Utf8               maxY
  #451 = Utf8               sizeX
  #452 = Utf8               sizeY
  #453 = Utf8               block
  #454 = Utf8               Lext/mods/gameserver/geoengine/geodata/ABlock;
  #455 = Utf8               i
  #456 = Utf8               limit
  #457 = Utf8               inside
  #458 = Utf8               polygon
  #459 = Utf8               Lext/mods/commons/geometry/Polygon;
  #460 = Utf8               lambda$parseDocument$6
  #461 = Utf8               (Lext/mods/commons/data/StatSet;Lorg/w3c/dom/Node;)V
  #462 = Utf8               node
  #463 = Utf8               lambda$parseDocument$5
  #464 = Utf8               (I)[Lext/mods/gameserver/model/location/Point2D;
  #465 = Utf8               x$0
  #466 = Utf8               lambda$parseDocument$3
  #467 = Utf8               coordinatesNode
  #468 = Utf8               lambda$parseDocument$4
  #469 = Utf8               locNode
  #470 = Utf8               attrs
  #471 = Utf8               Lorg/w3c/dom/NamedNodeMap;
  #472 = Utf8               lambda$parseDocument$2
  #473 = Utf8               positionNode
  #474 = Utf8               SourceFile
  #475 = Utf8               DoorData.java
  #476 = Utf8               NestMembers
  #477 = Utf8               BootstrapMethods
  #478 = MethodType         #479          //  (Ljava/lang/Object;)V
  #479 = Utf8               (Ljava/lang/Object;)V
  #480 = MethodHandle       5:#481        // REF_invokeVirtual ext/mods/gameserver/data/xml/DoorData.lambda$parseDocument$0:(Ljava/util/List;Lorg/w3c/dom/Node;)V
  #481 = Methodref          #11.#482      // ext/mods/gameserver/data/xml/DoorData.lambda$parseDocument$0:(Ljava/util/List;Lorg/w3c/dom/Node;)V
  #482 = NameAndType        #425:#426     // lambda$parseDocument$0:(Ljava/util/List;Lorg/w3c/dom/Node;)V
  #483 = MethodType         #484          //  (Lorg/w3c/dom/Node;)V
  #484 = Utf8               (Lorg/w3c/dom/Node;)V
  #485 = MethodHandle       5:#486        // REF_invokeVirtual ext/mods/gameserver/model/WorldObject.spawnMe:()V
  #486 = Methodref          #487.#488     // ext/mods/gameserver/model/WorldObject.spawnMe:()V
  #487 = Class              #489          // ext/mods/gameserver/model/WorldObject
  #488 = NameAndType        #490:#6       // spawnMe:()V
  #489 = Utf8               ext/mods/gameserver/model/WorldObject
  #490 = Utf8               spawnMe
  #491 = MethodType         #492          //  (Lext/mods/gameserver/model/actor/instance/Door;)V
  #492 = Utf8               (Lext/mods/gameserver/model/actor/instance/Door;)V
  #493 = MethodType         #390          //  (Ljava/lang/Object;)Z
  #494 = MethodHandle       6:#495        // REF_invokeStatic ext/mods/gameserver/data/xml/DoorData.lambda$getDoor$0:(Ljava/lang/String;Lext/mods/gameserver/model/actor/instance/Door;)Z
  #495 = Methodref          #11.#496      // ext/mods/gameserver/data/xml/DoorData.lambda$getDoor$0:(Ljava/lang/String;Lext/mods/gameserver/model/actor/instance/Door;)Z
  #496 = NameAndType        #422:#423     // lambda$getDoor$0:(Ljava/lang/String;Lext/mods/gameserver/model/actor/instance/Door;)Z
  #497 = MethodType         #498          //  (Lext/mods/gameserver/model/actor/instance/Door;)Z
  #498 = Utf8               (Lext/mods/gameserver/model/actor/instance/Door;)Z
  #499 = MethodHandle       5:#500        // REF_invokeVirtual ext/mods/gameserver/data/xml/DoorData.lambda$parseDocument$1:(Ljava/util/List;Lorg/w3c/dom/Node;)V
  #500 = Methodref          #11.#501      // ext/mods/gameserver/data/xml/DoorData.lambda$parseDocument$1:(Ljava/util/List;Lorg/w3c/dom/Node;)V
  #501 = NameAndType        #429:#426     // lambda$parseDocument$1:(Ljava/util/List;Lorg/w3c/dom/Node;)V
  #502 = MethodHandle       5:#503        // REF_invokeVirtual ext/mods/gameserver/data/xml/DoorData.lambda$parseDocument$2:(Lext/mods/commons/data/StatSet;Lorg/w3c/dom/Node;)V
  #503 = Methodref          #11.#504      // ext/mods/gameserver/data/xml/DoorData.lambda$parseDocument$2:(Lext/mods/commons/data/StatSet;Lorg/w3c/dom/Node;)V
  #504 = NameAndType        #472:#461     // lambda$parseDocument$2:(Lext/mods/commons/data/StatSet;Lorg/w3c/dom/Node;)V
  #505 = MethodHandle       5:#506        // REF_invokeVirtual ext/mods/gameserver/data/xml/DoorData.lambda$parseDocument$3:(Ljava/util/List;Lorg/w3c/dom/Node;)V
  #506 = Methodref          #11.#507      // ext/mods/gameserver/data/xml/DoorData.lambda$parseDocument$3:(Ljava/util/List;Lorg/w3c/dom/Node;)V
  #507 = NameAndType        #466:#426     // lambda$parseDocument$3:(Ljava/util/List;Lorg/w3c/dom/Node;)V
  #508 = MethodType         #509          //  (I)Ljava/lang/Object;
  #509 = Utf8               (I)Ljava/lang/Object;
  #510 = MethodHandle       6:#511        // REF_invokeStatic ext/mods/gameserver/data/xml/DoorData.lambda$parseDocument$5:(I)[Lext/mods/gameserver/model/location/Point2D;
  #511 = Methodref          #11.#512      // ext/mods/gameserver/data/xml/DoorData.lambda$parseDocument$5:(I)[Lext/mods/gameserver/model/location/Point2D;
  #512 = NameAndType        #463:#464     // lambda$parseDocument$5:(I)[Lext/mods/gameserver/model/location/Point2D;
  #513 = MethodType         #464          //  (I)[Lext/mods/gameserver/model/location/Point2D;
  #514 = MethodHandle       5:#515        // REF_invokeVirtual ext/mods/gameserver/data/xml/DoorData.lambda$parseDocument$6:(Lext/mods/commons/data/StatSet;Lorg/w3c/dom/Node;)V
  #515 = Methodref          #11.#516      // ext/mods/gameserver/data/xml/DoorData.lambda$parseDocument$6:(Lext/mods/commons/data/StatSet;Lorg/w3c/dom/Node;)V
  #516 = NameAndType        #460:#461     // lambda$parseDocument$6:(Lext/mods/commons/data/StatSet;Lorg/w3c/dom/Node;)V
  #517 = MethodHandle       5:#518        // REF_invokeVirtual ext/mods/gameserver/data/xml/DoorData.lambda$parseDocument$4:(Ljava/util/List;Lorg/w3c/dom/Node;)V
  #518 = Methodref          #11.#519      // ext/mods/gameserver/data/xml/DoorData.lambda$parseDocument$4:(Ljava/util/List;Lorg/w3c/dom/Node;)V
  #519 = NameAndType        #468:#426     // lambda$parseDocument$4:(Ljava/util/List;Lorg/w3c/dom/Node;)V
  #520 = MethodHandle       6:#521        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #521 = Methodref          #522.#523     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #522 = Class              #524          // java/lang/invoke/LambdaMetafactory
  #523 = NameAndType        #525:#526     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #524 = Utf8               java/lang/invoke/LambdaMetafactory
  #525 = Utf8               metafactory
  #526 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #527 = Utf8               InnerClasses
  #528 = Utf8               SingletonHolder
  #529 = Class              #530          // java/lang/invoke/MethodHandles$Lookup
  #530 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #531 = Class              #532          // java/lang/invoke/MethodHandles
  #532 = Utf8               java/lang/invoke/MethodHandles
  #533 = Utf8               Lookup
{
  protected ext.mods.gameserver.data.xml.DoorData();
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
        12: putfield      #10                 // Field _doors:Ljava/util/Map;
        15: aload_0
        16: invokevirtual #16                 // Method load:()V
        19: return
      LineNumberTable:
        line 54: 0
        line 51: 4
        line 55: 15
        line 56: 19
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      20     0  this   Lext/mods/gameserver/data/xml/DoorData;

  public void load();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=1, args_size=1
         0: aload_0
         1: ldc           #19                 // String xml/doors.xml
         3: invokevirtual #21                 // Method parseDataFile:(Ljava/lang/String;)V
         6: getstatic     #25                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
         9: ldc           #29                 // String Loaded {} doors templates.
        11: iconst_1
        12: anewarray     #2                  // class java/lang/Object
        15: dup
        16: iconst_0
        17: aload_0
        18: getfield      #10                 // Field _doors:Ljava/util/Map;
        21: invokeinterface #31,  1           // InterfaceMethod java/util/Map.size:()I
        26: invokestatic  #37                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        29: aastore
        30: invokevirtual #43                 // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
        33: return
      LineNumberTable:
        line 61: 0
        line 62: 6
        line 63: 33
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      34     0  this   Lext/mods/gameserver/data/xml/DoorData;

  public void parseDocument(org.w3c.dom.Document, java.nio.file.Path);
    descriptor: (Lorg/w3c/dom/Document;Ljava/nio/file/Path;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=4, args_size=3
         0: new           #49                 // class java/util/ArrayList
         3: dup
         4: invokespecial #51                 // Method java/util/ArrayList."<init>":()V
         7: astore_3
         8: aload_0
         9: aload_1
        10: ldc           #52                 // String list
        12: aload_0
        13: aload_3
        14: invokedynamic #54,  0             // InvokeDynamic #0:accept:(Lext/mods/gameserver/data/xml/DoorData;Ljava/util/List;)Ljava/util/function/Consumer;
        19: invokevirtual #58                 // Method forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
        22: return
      LineNumberTable:
        line 68: 0
        line 70: 8
        line 184: 22
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      23     0  this   Lext/mods/gameserver/data/xml/DoorData;
            0      23     1   doc   Lorg/w3c/dom/Document;
            0      23     2  path   Ljava/nio/file/Path;
            8      15     3 coords   Ljava/util/List;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            8      15     3 coords   Ljava/util/List<Lext/mods/gameserver/model/location/Point2D;>;

  public final void reload();
    descriptor: ()V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=3, args_size=1
         0: aload_0
         1: getfield      #10                 // Field _doors:Ljava/util/Map;
         4: invokeinterface #62,  1           // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
         9: invokeinterface #66,  1           // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
        14: astore_1
        15: aload_1
        16: invokeinterface #72,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        21: ifeq          41
        24: aload_1
        25: invokeinterface #78,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        30: checkcast     #82                 // class ext/mods/gameserver/model/actor/instance/Door
        33: astore_2
        34: aload_2
        35: invokevirtual #84                 // Method ext/mods/gameserver/model/actor/instance/Door.openMe:()V
        38: goto          15
        41: aload_0
        42: getfield      #10                 // Field _doors:Ljava/util/Map;
        45: invokeinterface #87,  1           // InterfaceMethod java/util/Map.clear:()V
        50: aload_0
        51: invokevirtual #16                 // Method load:()V
        54: aload_0
        55: invokevirtual #90                 // Method spawn:()V
        58: return
      LineNumberTable:
        line 188: 0
        line 189: 34
        line 191: 41
        line 193: 50
        line 194: 54
        line 195: 58
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           34       4     2  door   Lext/mods/gameserver/model/actor/instance/Door;
            0      59     0  this   Lext/mods/gameserver/data/xml/DoorData;
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 15
          locals = [ class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 25

  public final void spawn();
    descriptor: ()V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #10                 // Field _doors:Ljava/util/Map;
         4: invokeinterface #62,  1           // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
         9: invokedynamic #93,  0             // InvokeDynamic #1:accept:()Ljava/util/function/Consumer;
        14: invokeinterface #96,  2           // InterfaceMethod java/util/Collection.forEach:(Ljava/util/function/Consumer;)V
        19: return
      LineNumberTable:
        line 204: 0
        line 205: 19
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      20     0  this   Lext/mods/gameserver/data/xml/DoorData;

  public ext.mods.gameserver.model.actor.instance.Door getDoor(int);
    descriptor: (I)Lext/mods/gameserver/model/actor/instance/Door;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #10                 // Field _doors:Ljava/util/Map;
         4: iload_1
         5: invokestatic  #37                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
         8: invokeinterface #99,  2           // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        13: checkcast     #82                 // class ext/mods/gameserver/model/actor/instance/Door
        16: areturn
      LineNumberTable:
        line 209: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      17     0  this   Lext/mods/gameserver/data/xml/DoorData;
            0      17     1    id   I

  public ext.mods.gameserver.model.actor.instance.Door getDoor(java.lang.String);
    descriptor: (Ljava/lang/String;)Lext/mods/gameserver/model/actor/instance/Door;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #10                 // Field _doors:Ljava/util/Map;
         4: invokeinterface #62,  1           // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
         9: invokeinterface #103,  1          // InterfaceMethod java/util/Collection.stream:()Ljava/util/stream/Stream;
        14: aload_1
        15: invokedynamic #107,  0            // InvokeDynamic #2:test:(Ljava/lang/String;)Ljava/util/function/Predicate;
        20: invokeinterface #111,  2          // InterfaceMethod java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
        25: invokeinterface #117,  1          // InterfaceMethod java/util/stream/Stream.findFirst:()Ljava/util/Optional;
        30: aconst_null
        31: invokevirtual #121                // Method java/util/Optional.orElse:(Ljava/lang/Object;)Ljava/lang/Object;
        34: checkcast     #82                 // class ext/mods/gameserver/model/actor/instance/Door
        37: areturn
      LineNumberTable:
        line 214: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      38     0  this   Lext/mods/gameserver/data/xml/DoorData;
            0      38     1  name   Ljava/lang/String;

  public java.util.Collection<ext.mods.gameserver.model.actor.instance.Door> getDoors();
    descriptor: ()Ljava/util/Collection;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #10                 // Field _doors:Ljava/util/Map;
         4: invokeinterface #62,  1           // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
         9: areturn
      LineNumberTable:
        line 219: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/gameserver/data/xml/DoorData;
    Signature: #420                         // ()Ljava/util/Collection<Lext/mods/gameserver/model/actor/instance/Door;>;

  public static ext.mods.gameserver.data.xml.DoorData getInstance();
    descriptor: ()Lext/mods/gameserver/data/xml/DoorData;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #126                // Field ext/mods/gameserver/data/xml/DoorData$SingletonHolder.INSTANCE:Lext/mods/gameserver/data/xml/DoorData;
         3: areturn
      LineNumberTable:
        line 224: 0
}
SourceFile: "DoorData.java"
NestMembers:
  ext/mods/gameserver/data/xml/DoorData$SingletonHolder
BootstrapMethods:
  0: #520 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #478 (Ljava/lang/Object;)V
      #480 REF_invokeVirtual ext/mods/gameserver/data/xml/DoorData.lambda$parseDocument$0:(Ljava/util/List;Lorg/w3c/dom/Node;)V
      #483 (Lorg/w3c/dom/Node;)V
  1: #520 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #478 (Ljava/lang/Object;)V
      #485 REF_invokeVirtual ext/mods/gameserver/model/WorldObject.spawnMe:()V
      #491 (Lext/mods/gameserver/model/actor/instance/Door;)V
  2: #520 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #493 (Ljava/lang/Object;)Z
      #494 REF_invokeStatic ext/mods/gameserver/data/xml/DoorData.lambda$getDoor$0:(Ljava/lang/String;Lext/mods/gameserver/model/actor/instance/Door;)Z
      #497 (Lext/mods/gameserver/model/actor/instance/Door;)Z
  3: #520 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #478 (Ljava/lang/Object;)V
      #499 REF_invokeVirtual ext/mods/gameserver/data/xml/DoorData.lambda$parseDocument$1:(Ljava/util/List;Lorg/w3c/dom/Node;)V
      #483 (Lorg/w3c/dom/Node;)V
  4: #520 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #478 (Ljava/lang/Object;)V
      #502 REF_invokeVirtual ext/mods/gameserver/data/xml/DoorData.lambda$parseDocument$2:(Lext/mods/commons/data/StatSet;Lorg/w3c/dom/Node;)V
      #483 (Lorg/w3c/dom/Node;)V
  5: #520 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #478 (Ljava/lang/Object;)V
      #505 REF_invokeVirtual ext/mods/gameserver/data/xml/DoorData.lambda$parseDocument$3:(Ljava/util/List;Lorg/w3c/dom/Node;)V
      #483 (Lorg/w3c/dom/Node;)V
  6: #520 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #508 (I)Ljava/lang/Object;
      #510 REF_invokeStatic ext/mods/gameserver/data/xml/DoorData.lambda$parseDocument$5:(I)[Lext/mods/gameserver/model/location/Point2D;
      #513 (I)[Lext/mods/gameserver/model/location/Point2D;
  7: #520 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #478 (Ljava/lang/Object;)V
      #514 REF_invokeVirtual ext/mods/gameserver/data/xml/DoorData.lambda$parseDocument$6:(Lext/mods/commons/data/StatSet;Lorg/w3c/dom/Node;)V
      #483 (Lorg/w3c/dom/Node;)V
  8: #520 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #478 (Ljava/lang/Object;)V
      #517 REF_invokeVirtual ext/mods/gameserver/data/xml/DoorData.lambda$parseDocument$4:(Ljava/util/List;Lorg/w3c/dom/Node;)V
      #483 (Lorg/w3c/dom/Node;)V
InnerClasses:
  public static final #533= #529 of #531; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
