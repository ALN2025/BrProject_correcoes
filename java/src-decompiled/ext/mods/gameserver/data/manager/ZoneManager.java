// Bytecode for: ext.mods.gameserver.data.manager.ZoneManager
// File: ext\mods\gameserver\data\manager\ZoneManager.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/data/manager/ZoneManager.class
  Last modified 9 de jul de 2026; size 17024 bytes
  MD5 checksum 97aad82e1c450349764e3bf5766ee9f8
  Compiled from "ZoneManager.java"
public class ext.mods.gameserver.data.manager.ZoneManager implements ext.mods.commons.data.xml.IXmlReader
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #11                         // ext/mods/gameserver/data/manager/ZoneManager
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 4, methods: 19, attributes: 4
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
   #10 = Fieldref           #11.#12       // ext/mods/gameserver/data/manager/ZoneManager._zones:Ljava/util/Map;
   #11 = Class              #13           // ext/mods/gameserver/data/manager/ZoneManager
   #12 = NameAndType        #14:#15       // _zones:Ljava/util/Map;
   #13 = Utf8               ext/mods/gameserver/data/manager/ZoneManager
   #14 = Utf8               _zones
   #15 = Utf8               Ljava/util/Map;
   #16 = Fieldref           #11.#17       // ext/mods/gameserver/data/manager/ZoneManager._lastDynamicId:I
   #17 = NameAndType        #18:#19       // _lastDynamicId:I
   #18 = Utf8               _lastDynamicId
   #19 = Utf8               I
   #20 = Methodref          #11.#21       // ext/mods/gameserver/data/manager/ZoneManager.load:()V
   #21 = NameAndType        #22:#6        // load:()V
   #22 = Utf8               load
   #23 = String             #24           // xml/zones
   #24 = Utf8               xml/zones
   #25 = Methodref          #11.#26       // ext/mods/gameserver/data/manager/ZoneManager.parseDataFile:(Ljava/lang/String;)V
   #26 = NameAndType        #27:#28       // parseDataFile:(Ljava/lang/String;)V
   #27 = Utf8               parseDataFile
   #28 = Utf8               (Ljava/lang/String;)V
   #29 = Fieldref           #11.#30       // ext/mods/gameserver/data/manager/ZoneManager.LOGGER:Lext/mods/commons/logging/CLogger;
   #30 = NameAndType        #31:#32       // LOGGER:Lext/mods/commons/logging/CLogger;
   #31 = Utf8               LOGGER
   #32 = Utf8               Lext/mods/commons/logging/CLogger;
   #33 = String             #34           // Loaded {} zones classes and total {} zones.
   #34 = Utf8               Loaded {} zones classes and total {} zones.
   #35 = InterfaceMethodref #36.#37       // java/util/Map.size:()I
   #36 = Class              #38           // java/util/Map
   #37 = NameAndType        #39:#40       // size:()I
   #38 = Utf8               java/util/Map
   #39 = Utf8               size
   #40 = Utf8               ()I
   #41 = Methodref          #42.#43       // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
   #42 = Class              #44           // java/lang/Integer
   #43 = NameAndType        #45:#46       // valueOf:(I)Ljava/lang/Integer;
   #44 = Utf8               java/lang/Integer
   #45 = Utf8               valueOf
   #46 = Utf8               (I)Ljava/lang/Integer;
   #47 = InterfaceMethodref #36.#48       // java/util/Map.values:()Ljava/util/Collection;
   #48 = NameAndType        #49:#50       // values:()Ljava/util/Collection;
   #49 = Utf8               values
   #50 = Utf8               ()Ljava/util/Collection;
   #51 = InterfaceMethodref #52.#53       // java/util/Collection.stream:()Ljava/util/stream/Stream;
   #52 = Class              #54           // java/util/Collection
   #53 = NameAndType        #55:#56       // stream:()Ljava/util/stream/Stream;
   #54 = Utf8               java/util/Collection
   #55 = Utf8               stream
   #56 = Utf8               ()Ljava/util/stream/Stream;
   #57 = InvokeDynamic      #0:#58        // #0:applyAsInt:()Ljava/util/function/ToIntFunction;
   #58 = NameAndType        #59:#60       // applyAsInt:()Ljava/util/function/ToIntFunction;
   #59 = Utf8               applyAsInt
   #60 = Utf8               ()Ljava/util/function/ToIntFunction;
   #61 = InterfaceMethodref #62.#63       // java/util/stream/Stream.mapToInt:(Ljava/util/function/ToIntFunction;)Ljava/util/stream/IntStream;
   #62 = Class              #64           // java/util/stream/Stream
   #63 = NameAndType        #65:#66       // mapToInt:(Ljava/util/function/ToIntFunction;)Ljava/util/stream/IntStream;
   #64 = Utf8               java/util/stream/Stream
   #65 = Utf8               mapToInt
   #66 = Utf8               (Ljava/util/function/ToIntFunction;)Ljava/util/stream/IntStream;
   #67 = InterfaceMethodref #68.#69       // java/util/stream/IntStream.sum:()I
   #68 = Class              #70           // java/util/stream/IntStream
   #69 = NameAndType        #71:#40       // sum:()I
   #70 = Utf8               java/util/stream/IntStream
   #71 = Utf8               sum
   #72 = Methodref          #73.#74       // ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
   #73 = Class              #75           // ext/mods/commons/logging/CLogger
   #74 = NameAndType        #76:#77       // info:(Ljava/lang/Object;[Ljava/lang/Object;)V
   #75 = Utf8               ext/mods/commons/logging/CLogger
   #76 = Utf8               info
   #77 = Utf8               (Ljava/lang/Object;[Ljava/lang/Object;)V
   #78 = InterfaceMethodref #79.#80       // java/nio/file/Path.toFile:()Ljava/io/File;
   #79 = Class              #81           // java/nio/file/Path
   #80 = NameAndType        #82:#83       // toFile:()Ljava/io/File;
   #81 = Utf8               java/nio/file/Path
   #82 = Utf8               toFile
   #83 = Utf8               ()Ljava/io/File;
   #84 = Methodref          #85.#86       // java/io/File.getName:()Ljava/lang/String;
   #85 = Class              #87           // java/io/File
   #86 = NameAndType        #88:#89       // getName:()Ljava/lang/String;
   #87 = Utf8               java/io/File
   #88 = Utf8               getName
   #89 = Utf8               ()Ljava/lang/String;
   #90 = Methodref          #91.#92       // ext/mods/commons/lang/StringUtil.getNameWithoutExtension:(Ljava/lang/String;)Ljava/lang/String;
   #91 = Class              #93           // ext/mods/commons/lang/StringUtil
   #92 = NameAndType        #94:#95       // getNameWithoutExtension:(Ljava/lang/String;)Ljava/lang/String;
   #93 = Utf8               ext/mods/commons/lang/StringUtil
   #94 = Utf8               getNameWithoutExtension
   #95 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
   #96 = InvokeDynamic      #1:#97        // #1:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #97 = NameAndType        #98:#95       // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #98 = Utf8               makeConcatWithConstants
   #99 = Methodref          #100.#101     // java/lang/Class.forName:(Ljava/lang/String;)Ljava/lang/Class;
  #100 = Class              #102          // java/lang/Class
  #101 = NameAndType        #103:#104     // forName:(Ljava/lang/String;)Ljava/lang/Class;
  #102 = Utf8               java/lang/Class
  #103 = Utf8               forName
  #104 = Utf8               (Ljava/lang/String;)Ljava/lang/Class;
  #105 = Fieldref           #42.#106      // java/lang/Integer.TYPE:Ljava/lang/Class;
  #106 = NameAndType        #107:#108     // TYPE:Ljava/lang/Class;
  #107 = Utf8               TYPE
  #108 = Utf8               Ljava/lang/Class;
  #109 = Methodref          #100.#110     // java/lang/Class.getConstructor:([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
  #110 = NameAndType        #111:#112     // getConstructor:([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
  #111 = Utf8               getConstructor
  #112 = Utf8               ([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
  #113 = Class              #114          // java/lang/Exception
  #114 = Utf8               java/lang/Exception
  #115 = String             #116          // The zone type {} doesn\'t exist. Abort zones loading for {}.
  #116 = Utf8               The zone type {} doesn\'t exist. Abort zones loading for {}.
  #117 = Methodref          #73.#118      // ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
  #118 = NameAndType        #119:#120     // error:(Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
  #119 = Utf8               error
  #120 = Utf8               (Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
  #121 = String             #122          // list
  #122 = Utf8               list
  #123 = InvokeDynamic      #2:#124       // #2:accept:(Lext/mods/gameserver/data/manager/ZoneManager;Ljava/lang/reflect/Constructor;Ljava/lang/String;)Ljava/util/function/Consumer;
  #124 = NameAndType        #125:#126     // accept:(Lext/mods/gameserver/data/manager/ZoneManager;Ljava/lang/reflect/Constructor;Ljava/lang/String;)Ljava/util/function/Consumer;
  #125 = Utf8               accept
  #126 = Utf8               (Lext/mods/gameserver/data/manager/ZoneManager;Ljava/lang/reflect/Constructor;Ljava/lang/String;)Ljava/util/function/Consumer;
  #127 = Methodref          #11.#128      // ext/mods/gameserver/data/manager/ZoneManager.forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
  #128 = NameAndType        #129:#130     // forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
  #129 = Utf8               forEach
  #130 = Utf8               (Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
  #131 = Methodref          #11.#132      // ext/mods/gameserver/data/manager/ZoneManager.save:()V
  #132 = NameAndType        #133:#6       // save:()V
  #133 = Utf8               save
  #134 = Methodref          #135.#136     // ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
  #135 = Class              #137          // ext/mods/gameserver/model/World
  #136 = NameAndType        #138:#139     // getInstance:()Lext/mods/gameserver/model/World;
  #137 = Utf8               ext/mods/gameserver/model/World
  #138 = Utf8               getInstance
  #139 = Utf8               ()Lext/mods/gameserver/model/World;
  #140 = Methodref          #135.#141     // ext/mods/gameserver/model/World.getWorldRegions:()[[Lext/mods/gameserver/model/WorldRegion;
  #141 = NameAndType        #142:#143     // getWorldRegions:()[[Lext/mods/gameserver/model/WorldRegion;
  #142 = Utf8               getWorldRegions
  #143 = Utf8               ()[[Lext/mods/gameserver/model/WorldRegion;
  #144 = Methodref          #145.#146     // ext/mods/gameserver/model/WorldRegion.getZones:()Ljava/util/List;
  #145 = Class              #147          // ext/mods/gameserver/model/WorldRegion
  #146 = NameAndType        #148:#149     // getZones:()Ljava/util/List;
  #147 = Utf8               ext/mods/gameserver/model/WorldRegion
  #148 = Utf8               getZones
  #149 = Utf8               ()Ljava/util/List;
  #150 = InterfaceMethodref #151.#152     // java/util/List.clear:()V
  #151 = Class              #153          // java/util/List
  #152 = NameAndType        #154:#6       // clear:()V
  #153 = Utf8               java/util/List
  #154 = Utf8               clear
  #155 = InterfaceMethodref #36.#152      // java/util/Map.clear:()V
  #156 = Methodref          #135.#157     // ext/mods/gameserver/model/World.getObjects:()Ljava/util/Collection;
  #157 = NameAndType        #158:#50      // getObjects:()Ljava/util/Collection;
  #158 = Utf8               getObjects
  #159 = InterfaceMethodref #52.#160      // java/util/Collection.iterator:()Ljava/util/Iterator;
  #160 = NameAndType        #161:#162     // iterator:()Ljava/util/Iterator;
  #161 = Utf8               iterator
  #162 = Utf8               ()Ljava/util/Iterator;
  #163 = InterfaceMethodref #164.#165     // java/util/Iterator.hasNext:()Z
  #164 = Class              #166          // java/util/Iterator
  #165 = NameAndType        #167:#168     // hasNext:()Z
  #166 = Utf8               java/util/Iterator
  #167 = Utf8               hasNext
  #168 = Utf8               ()Z
  #169 = InterfaceMethodref #164.#170     // java/util/Iterator.next:()Ljava/lang/Object;
  #170 = NameAndType        #171:#172     // next:()Ljava/lang/Object;
  #171 = Utf8               next
  #172 = Utf8               ()Ljava/lang/Object;
  #173 = Class              #174          // ext/mods/gameserver/model/WorldObject
  #174 = Utf8               ext/mods/gameserver/model/WorldObject
  #175 = Class              #176          // ext/mods/gameserver/model/actor/Creature
  #176 = Utf8               ext/mods/gameserver/model/actor/Creature
  #177 = Methodref          #175.#178     // ext/mods/gameserver/model/actor/Creature.revalidateZone:(Z)V
  #178 = NameAndType        #179:#180     // revalidateZone:(Z)V
  #179 = Utf8               revalidateZone
  #180 = Utf8               (Z)V
  #181 = Methodref          #182.#183     // ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
  #182 = Class              #184          // ext/mods/commons/pool/ConnectionPool
  #183 = NameAndType        #185:#186     // getConnection:()Ljava/sql/Connection;
  #184 = Utf8               ext/mods/commons/pool/ConnectionPool
  #185 = Utf8               getConnection
  #186 = Utf8               ()Ljava/sql/Connection;
  #187 = String             #188          // TRUNCATE grandboss_list
  #188 = Utf8               TRUNCATE grandboss_list
  #189 = InterfaceMethodref #190.#191     // java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
  #190 = Class              #192          // java/sql/Connection
  #191 = NameAndType        #193:#194     // prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
  #192 = Utf8               java/sql/Connection
  #193 = Utf8               prepareStatement
  #194 = Utf8               (Ljava/lang/String;)Ljava/sql/PreparedStatement;
  #195 = InterfaceMethodref #196.#197     // java/sql/PreparedStatement.executeUpdate:()I
  #196 = Class              #198          // java/sql/PreparedStatement
  #197 = NameAndType        #199:#40      // executeUpdate:()I
  #198 = Utf8               java/sql/PreparedStatement
  #199 = Utf8               executeUpdate
  #200 = InterfaceMethodref #196.#201     // java/sql/PreparedStatement.close:()V
  #201 = NameAndType        #202:#6       // close:()V
  #202 = Utf8               close
  #203 = Class              #204          // java/lang/Throwable
  #204 = Utf8               java/lang/Throwable
  #205 = Methodref          #203.#206     // java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
  #206 = NameAndType        #207:#208     // addSuppressed:(Ljava/lang/Throwable;)V
  #207 = Utf8               addSuppressed
  #208 = Utf8               (Ljava/lang/Throwable;)V
  #209 = String             #210          // INSERT INTO grandboss_list (player_id,zone) VALUES (?,?)
  #210 = Utf8               INSERT INTO grandboss_list (player_id,zone) VALUES (?,?)
  #211 = Class              #212          // ext/mods/gameserver/model/zone/type/BossZone
  #212 = Utf8               ext/mods/gameserver/model/zone/type/BossZone
  #213 = InterfaceMethodref #36.#214      // java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
  #214 = NameAndType        #215:#216     // get:(Ljava/lang/Object;)Ljava/lang/Object;
  #215 = Utf8               get
  #216 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
  #217 = Class              #218          // ext/mods/gameserver/model/zone/type/subtype/ZoneType
  #218 = Utf8               ext/mods/gameserver/model/zone/type/subtype/ZoneType
  #219 = Methodref          #211.#220     // ext/mods/gameserver/model/zone/type/BossZone.getAllowedPlayers:()Ljava/util/Set;
  #220 = NameAndType        #221:#222     // getAllowedPlayers:()Ljava/util/Set;
  #221 = Utf8               getAllowedPlayers
  #222 = Utf8               ()Ljava/util/Set;
  #223 = InterfaceMethodref #224.#160     // java/util/Set.iterator:()Ljava/util/Iterator;
  #224 = Class              #225          // java/util/Set
  #225 = Utf8               java/util/Set
  #226 = Methodref          #42.#227      // java/lang/Integer.intValue:()I
  #227 = NameAndType        #228:#40      // intValue:()I
  #228 = Utf8               intValue
  #229 = InterfaceMethodref #196.#230     // java/sql/PreparedStatement.setInt:(II)V
  #230 = NameAndType        #231:#232     // setInt:(II)V
  #231 = Utf8               setInt
  #232 = Utf8               (II)V
  #233 = Methodref          #217.#234     // ext/mods/gameserver/model/zone/type/subtype/ZoneType.getId:()I
  #234 = NameAndType        #235:#40      // getId:()I
  #235 = Utf8               getId
  #236 = InterfaceMethodref #196.#237     // java/sql/PreparedStatement.addBatch:()V
  #237 = NameAndType        #238:#6       // addBatch:()V
  #238 = Utf8               addBatch
  #239 = InterfaceMethodref #196.#240     // java/sql/PreparedStatement.executeBatch:()[I
  #240 = NameAndType        #241:#242     // executeBatch:()[I
  #241 = Utf8               executeBatch
  #242 = Utf8               ()[I
  #243 = InterfaceMethodref #190.#201     // java/sql/Connection.close:()V
  #244 = String             #245          // Error storing boss zones.
  #245 = Utf8               Error storing boss zones.
  #246 = Methodref          #73.#247      // ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
  #247 = NameAndType        #119:#248     // error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
  #248 = Utf8               (Ljava/lang/Object;Ljava/lang/Throwable;)V
  #249 = String             #250          // Saved boss zones data.
  #250 = Utf8               Saved boss zones data.
  #251 = Methodref          #73.#252      // ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;)V
  #252 = NameAndType        #76:#253      // info:(Ljava/lang/Object;)V
  #253 = Utf8               (Ljava/lang/Object;)V
  #254 = Methodref          #2.#255       // java/lang/Object.getClass:()Ljava/lang/Class;
  #255 = NameAndType        #256:#257     // getClass:()Ljava/lang/Class;
  #256 = Utf8               getClass
  #257 = Utf8               ()Ljava/lang/Class;
  #258 = InterfaceMethodref #36.#259      // java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #259 = NameAndType        #260:#261     // put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #260 = Utf8               put
  #261 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #262 = InterfaceMethodref #36.#263      // java/util/Map.containsKey:(Ljava/lang/Object;)Z
  #263 = NameAndType        #264:#265     // containsKey:(Ljava/lang/Object;)Z
  #264 = Utf8               containsKey
  #265 = Utf8               (Ljava/lang/Object;)Z
  #266 = Methodref          #173.#267     // ext/mods/gameserver/model/WorldObject.getX:()I
  #267 = NameAndType        #268:#40      // getX:()I
  #268 = Utf8               getX
  #269 = Methodref          #173.#270     // ext/mods/gameserver/model/WorldObject.getY:()I
  #270 = NameAndType        #271:#40      // getY:()I
  #271 = Utf8               getY
  #272 = Methodref          #173.#273     // ext/mods/gameserver/model/WorldObject.getZ:()I
  #273 = NameAndType        #274:#40      // getZ:()I
  #274 = Utf8               getZ
  #275 = Methodref          #11.#276      // ext/mods/gameserver/data/manager/ZoneManager.getZone:(IIILjava/lang/Class;)Lext/mods/gameserver/model/zone/type/subtype/ZoneType;
  #276 = NameAndType        #277:#278     // getZone:(IIILjava/lang/Class;)Lext/mods/gameserver/model/zone/type/subtype/ZoneType;
  #277 = Utf8               getZone
  #278 = Utf8               (IIILjava/lang/Class;)Lext/mods/gameserver/model/zone/type/subtype/ZoneType;
  #279 = Methodref          #135.#280     // ext/mods/gameserver/model/World.getRegion:(II)Lext/mods/gameserver/model/WorldRegion;
  #280 = NameAndType        #281:#282     // getRegion:(II)Lext/mods/gameserver/model/WorldRegion;
  #281 = Utf8               getRegion
  #282 = Utf8               (II)Lext/mods/gameserver/model/WorldRegion;
  #283 = InterfaceMethodref #151.#160     // java/util/List.iterator:()Ljava/util/Iterator;
  #284 = Methodref          #100.#285     // java/lang/Class.isInstance:(Ljava/lang/Object;)Z
  #285 = NameAndType        #286:#265     // isInstance:(Ljava/lang/Object;)Z
  #286 = Utf8               isInstance
  #287 = Methodref          #217.#288     // ext/mods/gameserver/model/zone/type/subtype/ZoneType.isInsideZone:(II)Z
  #288 = NameAndType        #289:#290     // isInsideZone:(II)Z
  #289 = Utf8               isInsideZone
  #290 = Utf8               (II)Z
  #291 = Methodref          #217.#292     // ext/mods/gameserver/model/zone/type/subtype/ZoneType.isInsideZone:(III)Z
  #292 = NameAndType        #289:#293     // isInsideZone:(III)Z
  #293 = Utf8               (III)Z
  #294 = Methodref          #11.#295      // ext/mods/gameserver/data/manager/ZoneManager.getInstance:()Lext/mods/gameserver/data/manager/ZoneManager;
  #295 = NameAndType        #138:#296     // getInstance:()Lext/mods/gameserver/data/manager/ZoneManager;
  #296 = Utf8               ()Lext/mods/gameserver/data/manager/ZoneManager;
  #297 = Methodref          #11.#298      // ext/mods/gameserver/data/manager/ZoneManager.getAllZones:(Ljava/lang/Class;)Ljava/util/Collection;
  #298 = NameAndType        #299:#300     // getAllZones:(Ljava/lang/Class;)Ljava/util/Collection;
  #299 = Utf8               getAllZones
  #300 = Utf8               (Ljava/lang/Class;)Ljava/util/Collection;
  #301 = Class              #302          // ext/mods/gameserver/model/actor/Player
  #302 = Utf8               ext/mods/gameserver/model/actor/Player
  #303 = Methodref          #217.#304     // ext/mods/gameserver/model/zone/type/subtype/ZoneType.getKnownTypeInside:(Ljava/lang/Class;)Ljava/util/List;
  #304 = NameAndType        #305:#306     // getKnownTypeInside:(Ljava/lang/Class;)Ljava/util/List;
  #305 = Utf8               getKnownTypeInside
  #306 = Utf8               (Ljava/lang/Class;)Ljava/util/List;
  #307 = Methodref          #301.#308     // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #308 = NameAndType        #309:#310     // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #309 = Utf8               sendPacket
  #310 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #311 = Fieldref           #312.#313     // ext/mods/gameserver/data/manager/ZoneManager$SingletonHolder.INSTANCE:Lext/mods/gameserver/data/manager/ZoneManager;
  #312 = Class              #314          // ext/mods/gameserver/data/manager/ZoneManager$SingletonHolder
  #313 = NameAndType        #315:#316     // INSTANCE:Lext/mods/gameserver/data/manager/ZoneManager;
  #314 = Utf8               ext/mods/gameserver/data/manager/ZoneManager$SingletonHolder
  #315 = Utf8               INSTANCE
  #316 = Utf8               Lext/mods/gameserver/data/manager/ZoneManager;
  #317 = String             #318          // zone
  #318 = Utf8               zone
  #319 = InvokeDynamic      #3:#124       // #3:accept:(Lext/mods/gameserver/data/manager/ZoneManager;Ljava/lang/reflect/Constructor;Ljava/lang/String;)Ljava/util/function/Consumer;
  #320 = InterfaceMethodref #321.#322     // org/w3c/dom/Node.getAttributes:()Lorg/w3c/dom/NamedNodeMap;
  #321 = Class              #323          // org/w3c/dom/Node
  #322 = NameAndType        #324:#325     // getAttributes:()Lorg/w3c/dom/NamedNodeMap;
  #323 = Utf8               org/w3c/dom/Node
  #324 = Utf8               getAttributes
  #325 = Utf8               ()Lorg/w3c/dom/NamedNodeMap;
  #326 = String             #327          // id
  #327 = Utf8               id
  #328 = InterfaceMethodref #329.#330     // org/w3c/dom/NamedNodeMap.getNamedItem:(Ljava/lang/String;)Lorg/w3c/dom/Node;
  #329 = Class              #331          // org/w3c/dom/NamedNodeMap
  #330 = NameAndType        #332:#333     // getNamedItem:(Ljava/lang/String;)Lorg/w3c/dom/Node;
  #331 = Utf8               org/w3c/dom/NamedNodeMap
  #332 = Utf8               getNamedItem
  #333 = Utf8               (Ljava/lang/String;)Lorg/w3c/dom/Node;
  #334 = InterfaceMethodref #321.#335     // org/w3c/dom/Node.getNodeValue:()Ljava/lang/String;
  #335 = NameAndType        #336:#89      // getNodeValue:()Ljava/lang/String;
  #336 = Utf8               getNodeValue
  #337 = Methodref          #42.#338      // java/lang/Integer.parseInt:(Ljava/lang/String;)I
  #338 = NameAndType        #339:#340     // parseInt:(Ljava/lang/String;)I
  #339 = Utf8               parseInt
  #340 = Utf8               (Ljava/lang/String;)I
  #341 = Methodref          #342.#343     // java/lang/reflect/Constructor.newInstance:([Ljava/lang/Object;)Ljava/lang/Object;
  #342 = Class              #344          // java/lang/reflect/Constructor
  #343 = NameAndType        #345:#346     // newInstance:([Ljava/lang/Object;)Ljava/lang/Object;
  #344 = Utf8               java/lang/reflect/Constructor
  #345 = Utf8               newInstance
  #346 = Utf8               ([Ljava/lang/Object;)Ljava/lang/Object;
  #347 = String             #348          // The zone id {} couldn\'t be instantiated.
  #348 = Utf8               The zone id {} couldn\'t be instantiated.
  #349 = String             #350          // shape
  #350 = Utf8               shape
  #351 = Methodref          #11.#352      // ext/mods/gameserver/data/manager/ZoneManager.parseString:(Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)Ljava/lang/String;
  #352 = NameAndType        #353:#354     // parseString:(Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)Ljava/lang/String;
  #353 = Utf8               parseString
  #354 = Utf8               (Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)Ljava/lang/String;
  #355 = String             #356          // minZ
  #356 = Utf8               minZ
  #357 = Methodref          #11.#358      // ext/mods/gameserver/data/manager/ZoneManager.parseInteger:(Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)Ljava/lang/Integer;
  #358 = NameAndType        #359:#360     // parseInteger:(Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)Ljava/lang/Integer;
  #359 = Utf8               parseInteger
  #360 = Utf8               (Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)Ljava/lang/Integer;
  #361 = String             #362          // maxZ
  #362 = Utf8               maxZ
  #363 = Class              #364          // java/util/ArrayList
  #364 = Utf8               java/util/ArrayList
  #365 = Methodref          #363.#3       // java/util/ArrayList."<init>":()V
  #366 = String             #367          // node
  #367 = Utf8               node
  #368 = InvokeDynamic      #4:#369       // #4:accept:(Lext/mods/gameserver/data/manager/ZoneManager;Ljava/util/List;)Ljava/util/function/Consumer;
  #369 = NameAndType        #125:#370     // accept:(Lext/mods/gameserver/data/manager/ZoneManager;Ljava/util/List;)Ljava/util/function/Consumer;
  #370 = Utf8               (Lext/mods/gameserver/data/manager/ZoneManager;Ljava/util/List;)Ljava/util/function/Consumer;
  #371 = InterfaceMethodref #151.#372     // java/util/List.isEmpty:()Z
  #372 = NameAndType        #373:#168     // isEmpty:()Z
  #373 = Utf8               isEmpty
  #374 = String             #375          // Missing nodes for zone {} in file {}.
  #375 = Utf8               Missing nodes for zone {} in file {}.
  #376 = Methodref          #73.#377      // ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;[Ljava/lang/Object;)V
  #377 = NameAndType        #378:#77      // warn:(Ljava/lang/Object;[Ljava/lang/Object;)V
  #378 = Utf8               warn
  #379 = String             #380          // stat
  #380 = Utf8               stat
  #381 = InvokeDynamic      #5:#382       // #5:accept:(Lext/mods/gameserver/data/manager/ZoneManager;Lext/mods/gameserver/model/zone/type/subtype/ZoneType;)Ljava/util/function/Consumer;
  #382 = NameAndType        #125:#383     // accept:(Lext/mods/gameserver/data/manager/ZoneManager;Lext/mods/gameserver/model/zone/type/subtype/ZoneType;)Ljava/util/function/Consumer;
  #383 = Utf8               (Lext/mods/gameserver/data/manager/ZoneManager;Lext/mods/gameserver/model/zone/type/subtype/ZoneType;)Ljava/util/function/Consumer;
  #384 = Class              #385          // ext/mods/gameserver/model/zone/type/subtype/SpawnZoneType
  #385 = Utf8               ext/mods/gameserver/model/zone/type/subtype/SpawnZoneType
  #386 = String             #387          // spawn
  #387 = Utf8               spawn
  #388 = InvokeDynamic      #6:#389       // #6:accept:(Lext/mods/gameserver/data/manager/ZoneManager;Lext/mods/gameserver/model/zone/type/subtype/SpawnZoneType;)Ljava/util/function/Consumer;
  #389 = NameAndType        #125:#390     // accept:(Lext/mods/gameserver/data/manager/ZoneManager;Lext/mods/gameserver/model/zone/type/subtype/SpawnZoneType;)Ljava/util/function/Consumer;
  #390 = Utf8               (Lext/mods/gameserver/data/manager/ZoneManager;Lext/mods/gameserver/model/zone/type/subtype/SpawnZoneType;)Ljava/util/function/Consumer;
  #391 = InterfaceMethodref #151.#37      // java/util/List.size:()I
  #392 = Class              #393          // ext/mods/gameserver/model/holder/IntIntHolder
  #393 = Utf8               ext/mods/gameserver/model/holder/IntIntHolder
  #394 = InterfaceMethodref #151.#395     // java/util/List.toArray:([Ljava/lang/Object;)[Ljava/lang/Object;
  #395 = NameAndType        #396:#397     // toArray:([Ljava/lang/Object;)[Ljava/lang/Object;
  #396 = Utf8               toArray
  #397 = Utf8               ([Ljava/lang/Object;)[Ljava/lang/Object;
  #398 = Class              #399          // "[Lext/mods/gameserver/model/holder/IntIntHolder;"
  #399 = Utf8               [Lext/mods/gameserver/model/holder/IntIntHolder;
  #400 = Methodref          #401.#402     // java/lang/String.hashCode:()I
  #401 = Class              #403          // java/lang/String
  #402 = NameAndType        #404:#40      // hashCode:()I
  #403 = Utf8               java/lang/String
  #404 = Utf8               hashCode
  #405 = String             #406          // Cuboid
  #406 = Utf8               Cuboid
  #407 = Methodref          #401.#408     // java/lang/String.equals:(Ljava/lang/Object;)Z
  #408 = NameAndType        #409:#265     // equals:(Ljava/lang/Object;)Z
  #409 = Utf8               equals
  #410 = String             #411          // NPoly
  #411 = Utf8               NPoly
  #412 = String             #413          // Cylinder
  #413 = Utf8               Cylinder
  #414 = Class              #415          // ext/mods/gameserver/model/zone/form/ZoneCuboid
  #415 = Utf8               ext/mods/gameserver/model/zone/form/ZoneCuboid
  #416 = Methodref          #392.#234     // ext/mods/gameserver/model/holder/IntIntHolder.getId:()I
  #417 = Methodref          #392.#418     // ext/mods/gameserver/model/holder/IntIntHolder.getValue:()I
  #418 = NameAndType        #419:#40      // getValue:()I
  #419 = Utf8               getValue
  #420 = Methodref          #414.#421     // ext/mods/gameserver/model/zone/form/ZoneCuboid."<init>":(IIIIII)V
  #421 = NameAndType        #5:#422       // "<init>":(IIIIII)V
  #422 = Utf8               (IIIIII)V
  #423 = Methodref          #217.#424     // ext/mods/gameserver/model/zone/type/subtype/ZoneType.setZone:(Lext/mods/gameserver/model/zone/ZoneForm;)V
  #424 = NameAndType        #425:#426     // setZone:(Lext/mods/gameserver/model/zone/ZoneForm;)V
  #425 = Utf8               setZone
  #426 = Utf8               (Lext/mods/gameserver/model/zone/ZoneForm;)V
  #427 = String             #428          // Missing cuboid nodes for zone {} in file {}.
  #428 = Utf8               Missing cuboid nodes for zone {} in file {}.
  #429 = Class              #430          // ext/mods/gameserver/model/zone/form/ZoneNPoly
  #430 = Utf8               ext/mods/gameserver/model/zone/form/ZoneNPoly
  #431 = Methodref          #429.#432     // ext/mods/gameserver/model/zone/form/ZoneNPoly."<init>":([I[III)V
  #432 = NameAndType        #5:#433       // "<init>":([I[III)V
  #433 = Utf8               ([I[III)V
  #434 = String             #435          // Missing NPoly nodes for zone {} in file {}.
  #435 = Utf8               Missing NPoly nodes for zone {} in file {}.
  #436 = String             #437          // rad
  #437 = Utf8               rad
  #438 = Class              #439          // ext/mods/gameserver/model/zone/form/ZoneCylinder
  #439 = Utf8               ext/mods/gameserver/model/zone/form/ZoneCylinder
  #440 = Methodref          #438.#441     // ext/mods/gameserver/model/zone/form/ZoneCylinder."<init>":(IIIII)V
  #441 = NameAndType        #5:#442       // "<init>":(IIIII)V
  #442 = Utf8               (IIIII)V
  #443 = String             #444          // Missing Cylinder nodes for zone {} in file {}.
  #444 = Utf8               Missing Cylinder nodes for zone {} in file {}.
  #445 = String             #446          // Unknown {} shape in file {}.
  #446 = Utf8               Unknown {} shape in file {}.
  #447 = Methodref          #11.#448      // ext/mods/gameserver/data/manager/ZoneManager.addZone:(Ljava/lang/Integer;Lext/mods/gameserver/model/zone/type/subtype/ZoneType;)V
  #448 = NameAndType        #449:#450     // addZone:(Ljava/lang/Integer;Lext/mods/gameserver/model/zone/type/subtype/ZoneType;)V
  #449 = Utf8               addZone
  #450 = Utf8               (Ljava/lang/Integer;Lext/mods/gameserver/model/zone/type/subtype/ZoneType;)V
  #451 = Methodref          #135.#452     // ext/mods/gameserver/model/World.getRegionX:(I)I
  #452 = NameAndType        #453:#454     // getRegionX:(I)I
  #453 = Utf8               getRegionX
  #454 = Utf8               (I)I
  #455 = Methodref          #217.#456     // ext/mods/gameserver/model/zone/type/subtype/ZoneType.getZone:()Lext/mods/gameserver/model/zone/ZoneForm;
  #456 = NameAndType        #277:#457     // getZone:()Lext/mods/gameserver/model/zone/ZoneForm;
  #457 = Utf8               ()Lext/mods/gameserver/model/zone/ZoneForm;
  #458 = Methodref          #135.#459     // ext/mods/gameserver/model/World.getRegionY:(I)I
  #459 = NameAndType        #460:#454     // getRegionY:(I)I
  #460 = Utf8               getRegionY
  #461 = Methodref          #462.#463     // ext/mods/gameserver/model/zone/ZoneForm.intersectsRectangle:(IIII)Z
  #462 = Class              #464          // ext/mods/gameserver/model/zone/ZoneForm
  #463 = NameAndType        #465:#466     // intersectsRectangle:(IIII)Z
  #464 = Utf8               ext/mods/gameserver/model/zone/ZoneForm
  #465 = Utf8               intersectsRectangle
  #466 = Utf8               (IIII)Z
  #467 = Methodref          #145.#468     // ext/mods/gameserver/model/WorldRegion.addZone:(Lext/mods/gameserver/model/zone/type/subtype/ZoneType;)V
  #468 = NameAndType        #449:#469     // addZone:(Lext/mods/gameserver/model/zone/type/subtype/ZoneType;)V
  #469 = Utf8               (Lext/mods/gameserver/model/zone/type/subtype/ZoneType;)V
  #470 = Class              #471          // ext/mods/gameserver/enums/SpawnType
  #471 = Utf8               ext/mods/gameserver/enums/SpawnType
  #472 = String             #473          // type
  #473 = Utf8               type
  #474 = Methodref          #11.#475      // ext/mods/gameserver/data/manager/ZoneManager.parseEnum:(Lorg/w3c/dom/NamedNodeMap;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
  #475 = NameAndType        #476:#477     // parseEnum:(Lorg/w3c/dom/NamedNodeMap;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
  #476 = Utf8               parseEnum
  #477 = Utf8               (Lorg/w3c/dom/NamedNodeMap;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
  #478 = Methodref          #11.#479      // ext/mods/gameserver/data/manager/ZoneManager.parseLocation:(Lorg/w3c/dom/Node;)Lext/mods/gameserver/model/location/Location;
  #479 = NameAndType        #480:#481     // parseLocation:(Lorg/w3c/dom/Node;)Lext/mods/gameserver/model/location/Location;
  #480 = Utf8               parseLocation
  #481 = Utf8               (Lorg/w3c/dom/Node;)Lext/mods/gameserver/model/location/Location;
  #482 = Methodref          #384.#483     // ext/mods/gameserver/model/zone/type/subtype/SpawnZoneType.addSpawn:(Lext/mods/gameserver/enums/SpawnType;Lext/mods/gameserver/model/location/Location;)V
  #483 = NameAndType        #484:#485     // addSpawn:(Lext/mods/gameserver/enums/SpawnType;Lext/mods/gameserver/model/location/Location;)V
  #484 = Utf8               addSpawn
  #485 = Utf8               (Lext/mods/gameserver/enums/SpawnType;Lext/mods/gameserver/model/location/Location;)V
  #486 = String             #487          // name
  #487 = Utf8               name
  #488 = String             #489          // val
  #489 = Utf8               val
  #490 = Methodref          #217.#491     // ext/mods/gameserver/model/zone/type/subtype/ZoneType.setParameter:(Ljava/lang/String;Ljava/lang/String;)V
  #491 = NameAndType        #492:#493     // setParameter:(Ljava/lang/String;Ljava/lang/String;)V
  #492 = Utf8               setParameter
  #493 = Utf8               (Ljava/lang/String;Ljava/lang/String;)V
  #494 = String             #495          // x
  #495 = Utf8               x
  #496 = String             #497          // y
  #497 = Utf8               y
  #498 = Methodref          #392.#499     // ext/mods/gameserver/model/holder/IntIntHolder."<init>":(II)V
  #499 = NameAndType        #5:#232       // "<init>":(II)V
  #500 = InterfaceMethodref #151.#501     // java/util/List.add:(Ljava/lang/Object;)Z
  #501 = NameAndType        #502:#265     // add:(Ljava/lang/Object;)Z
  #502 = Utf8               add
  #503 = Class              #504          // ext/mods/commons/data/xml/IXmlReader
  #504 = Utf8               ext/mods/commons/data/xml/IXmlReader
  #505 = Utf8               TRUNCATE_GRAND_BOSS_LIST
  #506 = Utf8               Ljava/lang/String;
  #507 = Utf8               ConstantValue
  #508 = Utf8               INSERT_GRAND_BOSS_LIST
  #509 = Utf8               Signature
  #510 = Utf8               Ljava/util/Map<Ljava/lang/Class<+Lext/mods/gameserver/model/zone/type/subtype/ZoneType;>;Ljava/util/Map<Ljava/lang/Integer;+Lext/mods/gameserver/model/zone/type/subtype/ZoneType;>;>;
  #511 = Utf8               Code
  #512 = Utf8               LineNumberTable
  #513 = Utf8               LocalVariableTable
  #514 = Utf8               this
  #515 = Utf8               parseDocument
  #516 = Utf8               (Lorg/w3c/dom/Document;Ljava/nio/file/Path;)V
  #517 = Utf8               zoneConstructor
  #518 = Utf8               Ljava/lang/reflect/Constructor;
  #519 = Utf8               e
  #520 = Utf8               Ljava/lang/Exception;
  #521 = Utf8               doc
  #522 = Utf8               Lorg/w3c/dom/Document;
  #523 = Utf8               path
  #524 = Utf8               Ljava/nio/file/Path;
  #525 = Utf8               zoneType
  #526 = Utf8               LocalVariableTypeTable
  #527 = Utf8               Ljava/lang/reflect/Constructor<*>;
  #528 = Utf8               StackMapTable
  #529 = Class              #530          // org/w3c/dom/Document
  #530 = Utf8               org/w3c/dom/Document
  #531 = Utf8               reload
  #532 = Utf8               region
  #533 = Utf8               Lext/mods/gameserver/model/WorldRegion;
  #534 = Utf8               regions
  #535 = Utf8               [Lext/mods/gameserver/model/WorldRegion;
  #536 = Utf8               creature
  #537 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #538 = Utf8               object
  #539 = Utf8               Lext/mods/gameserver/model/WorldObject;
  #540 = Class              #541          // "[[Lext/mods/gameserver/model/WorldRegion;"
  #541 = Utf8               [[Lext/mods/gameserver/model/WorldRegion;
  #542 = Class              #535          // "[Lext/mods/gameserver/model/WorldRegion;"
  #543 = Utf8               ps
  #544 = Utf8               Ljava/sql/PreparedStatement;
  #545 = Utf8               player
  #546 = Utf8               Lext/mods/gameserver/model/zone/type/subtype/ZoneType;
  #547 = Utf8               con
  #548 = Utf8               Ljava/sql/Connection;
  #549 = Utf8               Ljava/lang/Integer;
  #550 = Utf8               map
  #551 = Utf8               TT;
  #552 = Utf8               Ljava/util/Map<Ljava/lang/Integer;TT;>;
  #553 = Utf8               <T:Lext/mods/gameserver/model/zone/type/subtype/ZoneType;>(Ljava/lang/Integer;TT;)V
  #554 = Utf8               Ljava/lang/Class<TT;>;
  #555 = Utf8               <T:Lext/mods/gameserver/model/zone/type/subtype/ZoneType;>(Ljava/lang/Class<TT;>;)Ljava/util/Collection<TT;>;
  #556 = Utf8               getZoneById
  #557 = Utf8               (I)Lext/mods/gameserver/model/zone/type/subtype/ZoneType;
  #558 = Utf8               Ljava/util/Map<Ljava/lang/Integer;+Lext/mods/gameserver/model/zone/type/subtype/ZoneType;>;
  #559 = Utf8               (ILjava/lang/Class;)Lext/mods/gameserver/model/zone/type/subtype/ZoneType;
  #560 = Utf8               <T:Lext/mods/gameserver/model/zone/type/subtype/ZoneType;>(ILjava/lang/Class<TT;>;)TT;
  #561 = Utf8               (Lext/mods/gameserver/model/WorldObject;Ljava/lang/Class;)Lext/mods/gameserver/model/zone/type/subtype/ZoneType;
  #562 = Utf8               <T:Lext/mods/gameserver/model/zone/type/subtype/ZoneType;>(Lext/mods/gameserver/model/WorldObject;Ljava/lang/Class<TT;>;)TT;
  #563 = Utf8               (IILjava/lang/Class;)Lext/mods/gameserver/model/zone/type/subtype/ZoneType;
  #564 = Utf8               <T:Lext/mods/gameserver/model/zone/type/subtype/ZoneType;>(IILjava/lang/Class<TT;>;)TT;
  #565 = Utf8               z
  #566 = Utf8               <T:Lext/mods/gameserver/model/zone/type/subtype/ZoneType;>(IIILjava/lang/Class<TT;>;)TT;
  #567 = Utf8               toAllPlayersInZoneType
  #568 = Utf8               (Ljava/lang/Class;[Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #569 = Utf8               packet
  #570 = Utf8               Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;
  #571 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #572 = Utf8               packets
  #573 = Utf8               [Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;
  #574 = Class              #573          // "[Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;"
  #575 = Utf8               <T:Lext/mods/gameserver/model/zone/type/subtype/ZoneType;>(Ljava/lang/Class<TT;>;[Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #576 = Utf8               lambda$parseDocument$0
  #577 = Utf8               (Ljava/lang/reflect/Constructor;Ljava/lang/String;Lorg/w3c/dom/Node;)V
  #578 = Utf8               listNode
  #579 = Utf8               Lorg/w3c/dom/Node;
  #580 = Utf8               lambda$parseDocument$1
  #581 = Utf8               temp
  #582 = Utf8               szt
  #583 = Utf8               Lext/mods/gameserver/model/zone/type/subtype/SpawnZoneType;
  #584 = Utf8               i
  #585 = Utf8               aX
  #586 = Utf8               [I
  #587 = Utf8               aY
  #588 = Utf8               zoneRad
  #589 = Utf8               s0$
  #590 = Utf8               tmp1$
  #591 = Utf8               xLoc
  #592 = Utf8               xLoc2
  #593 = Utf8               zoneNode
  #594 = Utf8               attrs
  #595 = Utf8               Lorg/w3c/dom/NamedNodeMap;
  #596 = Utf8               attribute
  #597 = Utf8               zoneId
  #598 = Utf8               zoneShape
  #599 = Utf8               nodes
  #600 = Utf8               Ljava/util/List;
  #601 = Utf8               coords
  #602 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/holder/IntIntHolder;>;
  #603 = Class              #586          // "[I"
  #604 = Utf8               lambda$parseDocument$4
  #605 = Utf8               (Lext/mods/gameserver/model/zone/type/subtype/SpawnZoneType;Lorg/w3c/dom/Node;)V
  #606 = Utf8               spawnNode
  #607 = Utf8               spawnAttrs
  #608 = Utf8               lambda$parseDocument$3
  #609 = Utf8               (Lext/mods/gameserver/model/zone/type/subtype/ZoneType;Lorg/w3c/dom/Node;)V
  #610 = Utf8               statNode
  #611 = Utf8               statAttrs
  #612 = Utf8               lambda$parseDocument$2
  #613 = Utf8               (Ljava/util/List;Lorg/w3c/dom/Node;)V
  #614 = Utf8               nodeNode
  #615 = Utf8               nodeAttrs
  #616 = Utf8               SourceFile
  #617 = Utf8               ZoneManager.java
  #618 = Utf8               NestMembers
  #619 = Utf8               BootstrapMethods
  #620 = MethodType         #621          //  (Ljava/lang/Object;)I
  #621 = Utf8               (Ljava/lang/Object;)I
  #622 = MethodHandle       9:#35         // REF_invokeInterface java/util/Map.size:()I
  #623 = MethodType         #624          //  (Ljava/util/Map;)I
  #624 = Utf8               (Ljava/util/Map;)I
  #625 = String             #626          // ext.mods.gameserver.model.zone.type.\u0001
  #626 = Utf8               ext.mods.gameserver.model.zone.type.\u0001
  #627 = MethodType         #253          //  (Ljava/lang/Object;)V
  #628 = MethodHandle       5:#629        // REF_invokeVirtual ext/mods/gameserver/data/manager/ZoneManager.lambda$parseDocument$0:(Ljava/lang/reflect/Constructor;Ljava/lang/String;Lorg/w3c/dom/Node;)V
  #629 = Methodref          #11.#630      // ext/mods/gameserver/data/manager/ZoneManager.lambda$parseDocument$0:(Ljava/lang/reflect/Constructor;Ljava/lang/String;Lorg/w3c/dom/Node;)V
  #630 = NameAndType        #576:#577     // lambda$parseDocument$0:(Ljava/lang/reflect/Constructor;Ljava/lang/String;Lorg/w3c/dom/Node;)V
  #631 = MethodType         #632          //  (Lorg/w3c/dom/Node;)V
  #632 = Utf8               (Lorg/w3c/dom/Node;)V
  #633 = MethodHandle       5:#634        // REF_invokeVirtual ext/mods/gameserver/data/manager/ZoneManager.lambda$parseDocument$1:(Ljava/lang/reflect/Constructor;Ljava/lang/String;Lorg/w3c/dom/Node;)V
  #634 = Methodref          #11.#635      // ext/mods/gameserver/data/manager/ZoneManager.lambda$parseDocument$1:(Ljava/lang/reflect/Constructor;Ljava/lang/String;Lorg/w3c/dom/Node;)V
  #635 = NameAndType        #580:#577     // lambda$parseDocument$1:(Ljava/lang/reflect/Constructor;Ljava/lang/String;Lorg/w3c/dom/Node;)V
  #636 = MethodHandle       5:#637        // REF_invokeVirtual ext/mods/gameserver/data/manager/ZoneManager.lambda$parseDocument$2:(Ljava/util/List;Lorg/w3c/dom/Node;)V
  #637 = Methodref          #11.#638      // ext/mods/gameserver/data/manager/ZoneManager.lambda$parseDocument$2:(Ljava/util/List;Lorg/w3c/dom/Node;)V
  #638 = NameAndType        #612:#613     // lambda$parseDocument$2:(Ljava/util/List;Lorg/w3c/dom/Node;)V
  #639 = MethodHandle       5:#640        // REF_invokeVirtual ext/mods/gameserver/data/manager/ZoneManager.lambda$parseDocument$3:(Lext/mods/gameserver/model/zone/type/subtype/ZoneType;Lorg/w3c/dom/Node;)V
  #640 = Methodref          #11.#641      // ext/mods/gameserver/data/manager/ZoneManager.lambda$parseDocument$3:(Lext/mods/gameserver/model/zone/type/subtype/ZoneType;Lorg/w3c/dom/Node;)V
  #641 = NameAndType        #608:#609     // lambda$parseDocument$3:(Lext/mods/gameserver/model/zone/type/subtype/ZoneType;Lorg/w3c/dom/Node;)V
  #642 = MethodHandle       5:#643        // REF_invokeVirtual ext/mods/gameserver/data/manager/ZoneManager.lambda$parseDocument$4:(Lext/mods/gameserver/model/zone/type/subtype/SpawnZoneType;Lorg/w3c/dom/Node;)V
  #643 = Methodref          #11.#644      // ext/mods/gameserver/data/manager/ZoneManager.lambda$parseDocument$4:(Lext/mods/gameserver/model/zone/type/subtype/SpawnZoneType;Lorg/w3c/dom/Node;)V
  #644 = NameAndType        #604:#605     // lambda$parseDocument$4:(Lext/mods/gameserver/model/zone/type/subtype/SpawnZoneType;Lorg/w3c/dom/Node;)V
  #645 = MethodHandle       6:#646        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #646 = Methodref          #647.#648     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #647 = Class              #649          // java/lang/invoke/LambdaMetafactory
  #648 = NameAndType        #650:#651     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #649 = Utf8               java/lang/invoke/LambdaMetafactory
  #650 = Utf8               metafactory
  #651 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #652 = MethodHandle       6:#653        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #653 = Methodref          #654.#655     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #654 = Class              #656          // java/lang/invoke/StringConcatFactory
  #655 = NameAndType        #98:#657      // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #656 = Utf8               java/lang/invoke/StringConcatFactory
  #657 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #658 = Utf8               InnerClasses
  #659 = Utf8               SingletonHolder
  #660 = Class              #661          // java/lang/invoke/MethodHandles$Lookup
  #661 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #662 = Class              #663          // java/lang/invoke/MethodHandles
  #663 = Utf8               java/lang/invoke/MethodHandles
  #664 = Utf8               Lookup
{
  protected ext.mods.gameserver.data.manager.ZoneManager();
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
        12: putfield      #10                 // Field _zones:Ljava/util/Map;
        15: aload_0
        16: iconst_0
        17: putfield      #16                 // Field _lastDynamicId:I
        20: aload_0
        21: invokevirtual #20                 // Method load:()V
        24: return
      LineNumberTable:
        line 66: 0
        line 61: 4
        line 63: 15
        line 67: 20
        line 68: 24
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      25     0  this   Lext/mods/gameserver/data/manager/ZoneManager;

  public void load();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=7, locals=1, args_size=1
         0: aload_0
         1: ldc           #23                 // String xml/zones
         3: invokevirtual #25                 // Method parseDataFile:(Ljava/lang/String;)V
         6: getstatic     #29                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
         9: ldc           #33                 // String Loaded {} zones classes and total {} zones.
        11: iconst_2
        12: anewarray     #2                  // class java/lang/Object
        15: dup
        16: iconst_0
        17: aload_0
        18: getfield      #10                 // Field _zones:Ljava/util/Map;
        21: invokeinterface #35,  1           // InterfaceMethod java/util/Map.size:()I
        26: invokestatic  #41                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        29: aastore
        30: dup
        31: iconst_1
        32: aload_0
        33: getfield      #10                 // Field _zones:Ljava/util/Map;
        36: invokeinterface #47,  1           // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
        41: invokeinterface #51,  1           // InterfaceMethod java/util/Collection.stream:()Ljava/util/stream/Stream;
        46: invokedynamic #57,  0             // InvokeDynamic #0:applyAsInt:()Ljava/util/function/ToIntFunction;
        51: invokeinterface #61,  2           // InterfaceMethod java/util/stream/Stream.mapToInt:(Ljava/util/function/ToIntFunction;)Ljava/util/stream/IntStream;
        56: invokeinterface #67,  1           // InterfaceMethod java/util/stream/IntStream.sum:()I
        61: invokestatic  #41                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        64: aastore
        65: invokevirtual #72                 // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
        68: return
      LineNumberTable:
        line 73: 0
        line 74: 6
        line 75: 68
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      69     0  this   Lext/mods/gameserver/data/manager/ZoneManager;

  public void parseDocument(org.w3c.dom.Document, java.nio.file.Path);
    descriptor: (Lorg/w3c/dom/Document;Ljava/nio/file/Path;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=7, locals=6, args_size=3
         0: aload_0
         1: aload_0
         2: getfield      #16                 // Field _lastDynamicId:I
         5: sipush        1000
         8: idiv
         9: sipush        1000
        12: imul
        13: sipush        1000
        16: iadd
        17: putfield      #16                 // Field _lastDynamicId:I
        20: aload_2
        21: invokeinterface #78,  1           // InterfaceMethod java/nio/file/Path.toFile:()Ljava/io/File;
        26: invokevirtual #84                 // Method java/io/File.getName:()Ljava/lang/String;
        29: invokestatic  #90                 // Method ext/mods/commons/lang/StringUtil.getNameWithoutExtension:(Ljava/lang/String;)Ljava/lang/String;
        32: astore_3
        33: aload_3
        34: invokedynamic #96,  0             // InvokeDynamic #1:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
        39: invokestatic  #99                 // Method java/lang/Class.forName:(Ljava/lang/String;)Ljava/lang/Class;
        42: iconst_1
        43: anewarray     #100                // class java/lang/Class
        46: dup
        47: iconst_0
        48: getstatic     #105                // Field java/lang/Integer.TYPE:Ljava/lang/Class;
        51: aastore
        52: invokevirtual #109                // Method java/lang/Class.getConstructor:([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
        55: astore        4
        57: goto          93
        60: astore        5
        62: getstatic     #29                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
        65: ldc           #115                // String The zone type {} doesn\'t exist. Abort zones loading for {}.
        67: aload         5
        69: iconst_2
        70: anewarray     #2                  // class java/lang/Object
        73: dup
        74: iconst_0
        75: aload_3
        76: aastore
        77: dup
        78: iconst_1
        79: aload_2
        80: invokeinterface #78,  1           // InterfaceMethod java/nio/file/Path.toFile:()Ljava/io/File;
        85: invokevirtual #84                 // Method java/io/File.getName:()Ljava/lang/String;
        88: aastore
        89: invokevirtual #117                // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
        92: return
        93: aload_0
        94: aload_1
        95: ldc           #121                // String list
        97: aload_0
        98: aload         4
       100: aload_3
       101: invokedynamic #123,  0            // InvokeDynamic #2:accept:(Lext/mods/gameserver/data/manager/ZoneManager;Ljava/lang/reflect/Constructor;Ljava/lang/String;)Ljava/util/function/Consumer;
       106: invokevirtual #127                // Method forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
       109: return
      Exception table:
         from    to  target type
            33    57    60   Class java/lang/Exception
      LineNumberTable:
        line 80: 0
        line 82: 20
        line 87: 33
        line 93: 57
        line 89: 60
        line 91: 62
        line 92: 92
        line 95: 93
        line 199: 109
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           57       3     4 zoneConstructor   Ljava/lang/reflect/Constructor;
           62      31     5     e   Ljava/lang/Exception;
            0     110     0  this   Lext/mods/gameserver/data/manager/ZoneManager;
            0     110     1   doc   Lorg/w3c/dom/Document;
            0     110     2  path   Ljava/nio/file/Path;
           33      77     3 zoneType   Ljava/lang/String;
           93      17     4 zoneConstructor   Ljava/lang/reflect/Constructor;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
           57       3     4 zoneConstructor   Ljava/lang/reflect/Constructor<*>;
           93      17     4 zoneConstructor   Ljava/lang/reflect/Constructor<*>;
      StackMapTable: number_of_entries = 2
        frame_type = 255 /* full_frame */
          offset_delta = 60
          locals = [ class ext/mods/gameserver/data/manager/ZoneManager, class org/w3c/dom/Document, class java/nio/file/Path, class java/lang/String ]
          stack = [ class java/lang/Exception ]
        frame_type = 252 /* append */
          offset_delta = 32
          locals = [ class java/lang/reflect/Constructor ]

  public void reload();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=9, args_size=1
         0: aload_0
         1: invokevirtual #131                // Method save:()V
         4: invokestatic  #134                // Method ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
         7: invokevirtual #140                // Method ext/mods/gameserver/model/World.getWorldRegions:()[[Lext/mods/gameserver/model/WorldRegion;
        10: astore_1
        11: aload_1
        12: arraylength
        13: istore_2
        14: iconst_0
        15: istore_3
        16: iload_3
        17: iload_2
        18: if_icmpge     74
        21: aload_1
        22: iload_3
        23: aaload
        24: astore        4
        26: aload         4
        28: astore        5
        30: aload         5
        32: arraylength
        33: istore        6
        35: iconst_0
        36: istore        7
        38: iload         7
        40: iload         6
        42: if_icmpge     68
        45: aload         5
        47: iload         7
        49: aaload
        50: astore        8
        52: aload         8
        54: invokevirtual #144                // Method ext/mods/gameserver/model/WorldRegion.getZones:()Ljava/util/List;
        57: invokeinterface #150,  1          // InterfaceMethod java/util/List.clear:()V
        62: iinc          7, 1
        65: goto          38
        68: iinc          3, 1
        71: goto          16
        74: aload_0
        75: getfield      #10                 // Field _zones:Ljava/util/Map;
        78: invokeinterface #155,  1          // InterfaceMethod java/util/Map.clear:()V
        83: aload_0
        84: iconst_0
        85: putfield      #16                 // Field _lastDynamicId:I
        88: aload_0
        89: invokevirtual #20                 // Method load:()V
        92: invokestatic  #134                // Method ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
        95: invokevirtual #156                // Method ext/mods/gameserver/model/World.getObjects:()Ljava/util/Collection;
        98: invokeinterface #159,  1          // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
       103: astore_1
       104: aload_1
       105: invokeinterface #163,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       110: ifeq          143
       113: aload_1
       114: invokeinterface #169,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       119: checkcast     #173                // class ext/mods/gameserver/model/WorldObject
       122: astore_2
       123: aload_2
       124: instanceof    #175                // class ext/mods/gameserver/model/actor/Creature
       127: ifeq          140
       130: aload_2
       131: checkcast     #175                // class ext/mods/gameserver/model/actor/Creature
       134: astore_3
       135: aload_3
       136: iconst_1
       137: invokevirtual #177                // Method ext/mods/gameserver/model/actor/Creature.revalidateZone:(Z)V
       140: goto          104
       143: return
      LineNumberTable:
        line 213: 0
        line 215: 4
        line 217: 26
        line 218: 52
        line 217: 62
        line 215: 68
        line 221: 74
        line 223: 83
        line 225: 88
        line 227: 92
        line 229: 123
        line 230: 135
        line 231: 140
        line 232: 143
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           52      10     8 region   Lext/mods/gameserver/model/WorldRegion;
           26      42     4 regions   [Lext/mods/gameserver/model/WorldRegion;
          135       5     3 creature   Lext/mods/gameserver/model/actor/Creature;
          123      17     2 object   Lext/mods/gameserver/model/WorldObject;
            0     144     0  this   Lext/mods/gameserver/data/manager/ZoneManager;
      StackMapTable: number_of_entries = 7
        frame_type = 254 /* append */
          offset_delta = 16
          locals = [ class "[[Lext/mods/gameserver/model/WorldRegion;", int, int ]
        frame_type = 255 /* full_frame */
          offset_delta = 21
          locals = [ class ext/mods/gameserver/data/manager/ZoneManager, class "[[Lext/mods/gameserver/model/WorldRegion;", int, int, class "[Lext/mods/gameserver/model/WorldRegion;", class "[Lext/mods/gameserver/model/WorldRegion;", int, int ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 29
          locals = [ class ext/mods/gameserver/data/manager/ZoneManager, class "[[Lext/mods/gameserver/model/WorldRegion;", int, int ]
          stack = []
        frame_type = 248 /* chop */
          offset_delta = 5
        frame_type = 252 /* append */
          offset_delta = 29
          locals = [ class java/util/Iterator ]
        frame_type = 35 /* same */
        frame_type = 250 /* chop */
          offset_delta = 2

  public final void save();
    descriptor: ()V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=3, locals=7, args_size=1
         0: invokestatic  #181                // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
         3: astore_1
         4: aload_1
         5: ldc           #187                // String TRUNCATE grandboss_list
         7: invokeinterface #189,  2          // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        12: astore_2
        13: aload_2
        14: invokeinterface #195,  1          // InterfaceMethod java/sql/PreparedStatement.executeUpdate:()I
        19: pop
        20: aload_2
        21: ifnull        57
        24: aload_2
        25: invokeinterface #200,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
        30: goto          57
        33: astore_3
        34: aload_2
        35: ifnull        55
        38: aload_2
        39: invokeinterface #200,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
        44: goto          55
        47: astore        4
        49: aload_3
        50: aload         4
        52: invokevirtual #205                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        55: aload_3
        56: athrow
        57: aload_1
        58: ldc           #209                // String INSERT INTO grandboss_list (player_id,zone) VALUES (?,?)
        60: invokeinterface #189,  2          // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        65: astore_2
        66: aload_0
        67: getfield      #10                 // Field _zones:Ljava/util/Map;
        70: ldc           #211                // class ext/mods/gameserver/model/zone/type/BossZone
        72: invokeinterface #213,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        77: checkcast     #36                 // class java/util/Map
        80: invokeinterface #47,  1           // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
        85: invokeinterface #159,  1          // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
        90: astore_3
        91: aload_3
        92: invokeinterface #163,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        97: ifeq          184
       100: aload_3
       101: invokeinterface #169,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       106: checkcast     #217                // class ext/mods/gameserver/model/zone/type/subtype/ZoneType
       109: astore        4
       111: aload         4
       113: checkcast     #211                // class ext/mods/gameserver/model/zone/type/BossZone
       116: invokevirtual #219                // Method ext/mods/gameserver/model/zone/type/BossZone.getAllowedPlayers:()Ljava/util/Set;
       119: invokeinterface #223,  1          // InterfaceMethod java/util/Set.iterator:()Ljava/util/Iterator;
       124: astore        5
       126: aload         5
       128: invokeinterface #163,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       133: ifeq          181
       136: aload         5
       138: invokeinterface #169,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       143: checkcast     #42                 // class java/lang/Integer
       146: invokevirtual #226                // Method java/lang/Integer.intValue:()I
       149: istore        6
       151: aload_2
       152: iconst_1
       153: iload         6
       155: invokeinterface #229,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       160: aload_2
       161: iconst_2
       162: aload         4
       164: invokevirtual #233                // Method ext/mods/gameserver/model/zone/type/subtype/ZoneType.getId:()I
       167: invokeinterface #229,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       172: aload_2
       173: invokeinterface #236,  1          // InterfaceMethod java/sql/PreparedStatement.addBatch:()V
       178: goto          126
       181: goto          91
       184: aload_2
       185: invokeinterface #239,  1          // InterfaceMethod java/sql/PreparedStatement.executeBatch:()[I
       190: pop
       191: aload_2
       192: ifnull        228
       195: aload_2
       196: invokeinterface #200,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       201: goto          228
       204: astore_3
       205: aload_2
       206: ifnull        226
       209: aload_2
       210: invokeinterface #200,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       215: goto          226
       218: astore        4
       220: aload_3
       221: aload         4
       223: invokevirtual #205                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       226: aload_3
       227: athrow
       228: aload_1
       229: ifnull        263
       232: aload_1
       233: invokeinterface #243,  1          // InterfaceMethod java/sql/Connection.close:()V
       238: goto          263
       241: astore_2
       242: aload_1
       243: ifnull        261
       246: aload_1
       247: invokeinterface #243,  1          // InterfaceMethod java/sql/Connection.close:()V
       252: goto          261
       255: astore_3
       256: aload_2
       257: aload_3
       258: invokevirtual #205                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       261: aload_2
       262: athrow
       263: goto          276
       266: astore_1
       267: getstatic     #29                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
       270: ldc           #244                // String Error storing boss zones.
       272: aload_1
       273: invokevirtual #246                // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
       276: getstatic     #29                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
       279: ldc           #249                // String Saved boss zones data.
       281: invokevirtual #251                // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;)V
       284: return
      Exception table:
         from    to  target type
            13    20    33   Class java/lang/Throwable
            38    44    47   Class java/lang/Throwable
            66   191   204   Class java/lang/Throwable
           209   215   218   Class java/lang/Throwable
             4   228   241   Class java/lang/Throwable
           246   252   255   Class java/lang/Throwable
             0   263   266   Class java/lang/Exception
      LineNumberTable:
        line 241: 0
        line 243: 4
        line 245: 13
        line 246: 20
        line 243: 33
        line 248: 57
        line 250: 66
        line 252: 111
        line 254: 151
        line 255: 160
        line 256: 172
        line 257: 178
        line 258: 181
        line 259: 184
        line 260: 191
        line 248: 204
        line 261: 228
        line 241: 241
        line 265: 263
        line 262: 266
        line 264: 267
        line 266: 276
        line 267: 284
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           13      44     2    ps   Ljava/sql/PreparedStatement;
          151      27     6 player   I
          111      70     4  zone   Lext/mods/gameserver/model/zone/type/subtype/ZoneType;
           66     162     2    ps   Ljava/sql/PreparedStatement;
            4     259     1   con   Ljava/sql/Connection;
          267       9     1     e   Ljava/lang/Exception;
            0     285     0  this   Lext/mods/gameserver/data/manager/ZoneManager;
      StackMapTable: number_of_entries = 18
        frame_type = 255 /* full_frame */
          offset_delta = 33
          locals = [ class ext/mods/gameserver/data/manager/ZoneManager, class java/sql/Connection, class java/sql/PreparedStatement ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/data/manager/ZoneManager, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 7 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 253 /* append */
          offset_delta = 33
          locals = [ class java/sql/PreparedStatement, class java/util/Iterator ]
        frame_type = 253 /* append */
          offset_delta = 34
          locals = [ class ext/mods/gameserver/model/zone/type/subtype/ZoneType, class java/util/Iterator ]
        frame_type = 249 /* chop */
          offset_delta = 54
        frame_type = 250 /* chop */
          offset_delta = 2
        frame_type = 83 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/data/manager/ZoneManager, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 7 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/data/manager/ZoneManager, class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 5 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 9 /* same */

  public <T extends ext.mods.gameserver.model.zone.type.subtype.ZoneType> void addZone(java.lang.Integer, T);
    descriptor: (Ljava/lang/Integer;Lext/mods/gameserver/model/zone/type/subtype/ZoneType;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=4, args_size=3
         0: aload_0
         1: getfield      #10                 // Field _zones:Ljava/util/Map;
         4: aload_2
         5: invokevirtual #254                // Method java/lang/Object.getClass:()Ljava/lang/Class;
         8: invokeinterface #213,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        13: checkcast     #36                 // class java/util/Map
        16: astore_3
        17: aload_3
        18: ifnonnull     56
        21: new           #7                  // class java/util/HashMap
        24: dup
        25: invokespecial #9                  // Method java/util/HashMap."<init>":()V
        28: astore_3
        29: aload_3
        30: aload_1
        31: aload_2
        32: invokeinterface #258,  3          // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        37: pop
        38: aload_0
        39: getfield      #10                 // Field _zones:Ljava/util/Map;
        42: aload_2
        43: invokevirtual #254                // Method java/lang/Object.getClass:()Ljava/lang/Class;
        46: aload_3
        47: invokeinterface #258,  3          // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        52: pop
        53: goto          65
        56: aload_3
        57: aload_1
        58: aload_2
        59: invokeinterface #258,  3          // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        64: pop
        65: return
      LineNumberTable:
        line 278: 0
        line 279: 17
        line 281: 21
        line 282: 29
        line 283: 38
        line 286: 56
        line 287: 65
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      66     0  this   Lext/mods/gameserver/data/manager/ZoneManager;
            0      66     1    id   Ljava/lang/Integer;
            0      66     2  zone   Lext/mods/gameserver/model/zone/type/subtype/ZoneType;
           17      49     3   map   Ljava/util/Map;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      66     2  zone   TT;
           17      49     3   map   Ljava/util/Map<Ljava/lang/Integer;TT;>;
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 56
          locals = [ class java/util/Map ]
        frame_type = 8 /* same */
    Signature: #553                         // <T:Lext/mods/gameserver/model/zone/type/subtype/ZoneType;>(Ljava/lang/Integer;TT;)V

  public <T extends ext.mods.gameserver.model.zone.type.subtype.ZoneType> java.util.Collection<T> getAllZones(java.lang.Class<T>);
    descriptor: (Ljava/lang/Class;)Ljava/util/Collection;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #10                 // Field _zones:Ljava/util/Map;
         4: aload_1
         5: invokeinterface #213,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        10: checkcast     #36                 // class java/util/Map
        13: invokeinterface #47,  1           // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
        18: areturn
      LineNumberTable:
        line 297: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      19     0  this   Lext/mods/gameserver/data/manager/ZoneManager;
            0      19     1  type   Ljava/lang/Class;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      19     1  type   Ljava/lang/Class<TT;>;
    Signature: #555                         // <T:Lext/mods/gameserver/model/zone/type/subtype/ZoneType;>(Ljava/lang/Class<TT;>;)Ljava/util/Collection<TT;>;

  public ext.mods.gameserver.model.zone.type.subtype.ZoneType getZoneById(int);
    descriptor: (I)Lext/mods/gameserver/model/zone/type/subtype/ZoneType;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=4, args_size=2
         0: aload_0
         1: getfield      #10                 // Field _zones:Ljava/util/Map;
         4: invokeinterface #47,  1           // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
         9: invokeinterface #159,  1          // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
        14: astore_2
        15: aload_2
        16: invokeinterface #163,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        21: ifeq          64
        24: aload_2
        25: invokeinterface #169,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        30: checkcast     #36                 // class java/util/Map
        33: astore_3
        34: aload_3
        35: iload_1
        36: invokestatic  #41                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        39: invokeinterface #262,  2          // InterfaceMethod java/util/Map.containsKey:(Ljava/lang/Object;)Z
        44: ifeq          61
        47: aload_3
        48: iload_1
        49: invokestatic  #41                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        52: invokeinterface #213,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        57: checkcast     #217                // class ext/mods/gameserver/model/zone/type/subtype/ZoneType
        60: areturn
        61: goto          15
        64: aconst_null
        65: areturn
      LineNumberTable:
        line 306: 0
        line 308: 34
        line 309: 47
        line 310: 61
        line 311: 64
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           34      27     3   map   Ljava/util/Map;
            0      66     0  this   Lext/mods/gameserver/data/manager/ZoneManager;
            0      66     1    id   I
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
           34      27     3   map   Ljava/util/Map<Ljava/lang/Integer;+Lext/mods/gameserver/model/zone/type/subtype/ZoneType;>;
      StackMapTable: number_of_entries = 3
        frame_type = 252 /* append */
          offset_delta = 15
          locals = [ class java/util/Iterator ]
        frame_type = 45 /* same */
        frame_type = 250 /* chop */
          offset_delta = 2

  public <T extends ext.mods.gameserver.model.zone.type.subtype.ZoneType> T getZoneById(int, java.lang.Class<T>);
    descriptor: (ILjava/lang/Class;)Lext/mods/gameserver/model/zone/type/subtype/ZoneType;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=3, args_size=3
         0: aload_0
         1: getfield      #10                 // Field _zones:Ljava/util/Map;
         4: aload_2
         5: invokeinterface #213,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        10: checkcast     #36                 // class java/util/Map
        13: iload_1
        14: invokestatic  #41                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        17: invokeinterface #213,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        22: checkcast     #217                // class ext/mods/gameserver/model/zone/type/subtype/ZoneType
        25: areturn
      LineNumberTable:
        line 323: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      26     0  this   Lext/mods/gameserver/data/manager/ZoneManager;
            0      26     1    id   I
            0      26     2  type   Ljava/lang/Class;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      26     2  type   Ljava/lang/Class<TT;>;
    Signature: #560                         // <T:Lext/mods/gameserver/model/zone/type/subtype/ZoneType;>(ILjava/lang/Class<TT;>;)TT;

  public <T extends ext.mods.gameserver.model.zone.type.subtype.ZoneType> T getZone(ext.mods.gameserver.model.WorldObject, java.lang.Class<T>);
    descriptor: (Lext/mods/gameserver/model/WorldObject;Ljava/lang/Class;)Lext/mods/gameserver/model/zone/type/subtype/ZoneType;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=3, args_size=3
         0: aload_1
         1: ifnonnull     6
         4: aconst_null
         5: areturn
         6: aload_0
         7: aload_1
         8: invokevirtual #266                // Method ext/mods/gameserver/model/WorldObject.getX:()I
        11: aload_1
        12: invokevirtual #269                // Method ext/mods/gameserver/model/WorldObject.getY:()I
        15: aload_1
        16: invokevirtual #272                // Method ext/mods/gameserver/model/WorldObject.getZ:()I
        19: aload_2
        20: invokevirtual #275                // Method getZone:(IIILjava/lang/Class;)Lext/mods/gameserver/model/zone/type/subtype/ZoneType;
        23: areturn
      LineNumberTable:
        line 334: 0
        line 335: 4
        line 337: 6
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      24     0  this   Lext/mods/gameserver/data/manager/ZoneManager;
            0      24     1 object   Lext/mods/gameserver/model/WorldObject;
            0      24     2  type   Ljava/lang/Class;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      24     2  type   Ljava/lang/Class<TT;>;
      StackMapTable: number_of_entries = 1
        frame_type = 6 /* same */
    Signature: #562                         // <T:Lext/mods/gameserver/model/zone/type/subtype/ZoneType;>(Lext/mods/gameserver/model/WorldObject;Ljava/lang/Class<TT;>;)TT;

  public <T extends ext.mods.gameserver.model.zone.type.subtype.ZoneType> T getZone(int, int, java.lang.Class<T>);
    descriptor: (IILjava/lang/Class;)Lext/mods/gameserver/model/zone/type/subtype/ZoneType;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=6, args_size=4
         0: invokestatic  #134                // Method ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
         3: iload_1
         4: iload_2
         5: invokevirtual #279                // Method ext/mods/gameserver/model/World.getRegion:(II)Lext/mods/gameserver/model/WorldRegion;
         8: invokevirtual #144                // Method ext/mods/gameserver/model/WorldRegion.getZones:()Ljava/util/List;
        11: invokeinterface #283,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
        16: astore        4
        18: aload         4
        20: invokeinterface #163,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        25: ifeq          65
        28: aload         4
        30: invokeinterface #169,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        35: checkcast     #217                // class ext/mods/gameserver/model/zone/type/subtype/ZoneType
        38: astore        5
        40: aload_3
        41: aload         5
        43: invokevirtual #284                // Method java/lang/Class.isInstance:(Ljava/lang/Object;)Z
        46: ifeq          62
        49: aload         5
        51: iload_1
        52: iload_2
        53: invokevirtual #287                // Method ext/mods/gameserver/model/zone/type/subtype/ZoneType.isInsideZone:(II)Z
        56: ifeq          62
        59: aload         5
        61: areturn
        62: goto          18
        65: aconst_null
        66: areturn
      LineNumberTable:
        line 350: 0
        line 352: 40
        line 353: 59
        line 354: 62
        line 355: 65
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           40      22     5  zone   Lext/mods/gameserver/model/zone/type/subtype/ZoneType;
            0      67     0  this   Lext/mods/gameserver/data/manager/ZoneManager;
            0      67     1     x   I
            0      67     2     y   I
            0      67     3  type   Ljava/lang/Class;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      67     3  type   Ljava/lang/Class<TT;>;
      StackMapTable: number_of_entries = 3
        frame_type = 252 /* append */
          offset_delta = 18
          locals = [ class java/util/Iterator ]
        frame_type = 43 /* same */
        frame_type = 250 /* chop */
          offset_delta = 2
    Signature: #564                         // <T:Lext/mods/gameserver/model/zone/type/subtype/ZoneType;>(IILjava/lang/Class<TT;>;)TT;

  public <T extends ext.mods.gameserver.model.zone.type.subtype.ZoneType> T getZone(int, int, int, java.lang.Class<T>);
    descriptor: (IIILjava/lang/Class;)Lext/mods/gameserver/model/zone/type/subtype/ZoneType;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=7, args_size=5
         0: invokestatic  #134                // Method ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
         3: iload_1
         4: iload_2
         5: invokevirtual #279                // Method ext/mods/gameserver/model/World.getRegion:(II)Lext/mods/gameserver/model/WorldRegion;
         8: invokevirtual #144                // Method ext/mods/gameserver/model/WorldRegion.getZones:()Ljava/util/List;
        11: invokeinterface #283,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
        16: astore        5
        18: aload         5
        20: invokeinterface #163,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        25: ifeq          67
        28: aload         5
        30: invokeinterface #169,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        35: checkcast     #217                // class ext/mods/gameserver/model/zone/type/subtype/ZoneType
        38: astore        6
        40: aload         4
        42: aload         6
        44: invokevirtual #284                // Method java/lang/Class.isInstance:(Ljava/lang/Object;)Z
        47: ifeq          64
        50: aload         6
        52: iload_1
        53: iload_2
        54: iload_3
        55: invokevirtual #291                // Method ext/mods/gameserver/model/zone/type/subtype/ZoneType.isInsideZone:(III)Z
        58: ifeq          64
        61: aload         6
        63: areturn
        64: goto          18
        67: aconst_null
        68: areturn
      LineNumberTable:
        line 369: 0
        line 371: 40
        line 372: 61
        line 373: 64
        line 374: 67
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           40      24     6  zone   Lext/mods/gameserver/model/zone/type/subtype/ZoneType;
            0      69     0  this   Lext/mods/gameserver/data/manager/ZoneManager;
            0      69     1     x   I
            0      69     2     y   I
            0      69     3     z   I
            0      69     4  type   Ljava/lang/Class;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      69     4  type   Ljava/lang/Class<TT;>;
      StackMapTable: number_of_entries = 3
        frame_type = 252 /* append */
          offset_delta = 18
          locals = [ class java/util/Iterator ]
        frame_type = 45 /* same */
        frame_type = 250 /* chop */
          offset_delta = 2
    Signature: #566                         // <T:Lext/mods/gameserver/model/zone/type/subtype/ZoneType;>(IIILjava/lang/Class<TT;>;)TT;

  public static <T extends ext.mods.gameserver.model.zone.type.subtype.ZoneType> void toAllPlayersInZoneType(java.lang.Class<T>, ext.mods.gameserver.network.serverpackets.L2GameServerPacket...);
    descriptor: (Ljava/lang/Class;[Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
    flags: (0x0089) ACC_PUBLIC, ACC_STATIC, ACC_VARARGS
    Code:
      stack=2, locals=10, args_size=2
         0: invokestatic  #294                // Method getInstance:()Lext/mods/gameserver/data/manager/ZoneManager;
         3: aload_0
         4: invokevirtual #297                // Method getAllZones:(Ljava/lang/Class;)Ljava/util/Collection;
         7: invokeinterface #159,  1          // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
        12: astore_2
        13: aload_2
        14: invokeinterface #163,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        19: ifeq          112
        22: aload_2
        23: invokeinterface #169,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        28: checkcast     #217                // class ext/mods/gameserver/model/zone/type/subtype/ZoneType
        31: astore_3
        32: aload_3
        33: ldc_w         #301                // class ext/mods/gameserver/model/actor/Player
        36: invokevirtual #303                // Method ext/mods/gameserver/model/zone/type/subtype/ZoneType.getKnownTypeInside:(Ljava/lang/Class;)Ljava/util/List;
        39: invokeinterface #283,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
        44: astore        4
        46: aload         4
        48: invokeinterface #163,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        53: ifeq          109
        56: aload         4
        58: invokeinterface #169,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        63: checkcast     #301                // class ext/mods/gameserver/model/actor/Player
        66: astore        5
        68: aload_1
        69: astore        6
        71: aload         6
        73: arraylength
        74: istore        7
        76: iconst_0
        77: istore        8
        79: iload         8
        81: iload         7
        83: if_icmpge     106
        86: aload         6
        88: iload         8
        90: aaload
        91: astore        9
        93: aload         5
        95: aload         9
        97: invokevirtual #307                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       100: iinc          8, 1
       103: goto          79
       106: goto          46
       109: goto          13
       112: return
      LineNumberTable:
        line 385: 0
        line 387: 32
        line 389: 68
        line 390: 93
        line 389: 100
        line 391: 106
        line 392: 109
        line 393: 112
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           93       7     9 packet   Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;
           68      38     5 player   Lext/mods/gameserver/model/actor/Player;
           32      77     3  zone   Lext/mods/gameserver/model/zone/type/subtype/ZoneType;
            0     113     0 zoneType   Ljava/lang/Class;
            0     113     1 packets   [Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0     113     0 zoneType   Ljava/lang/Class<TT;>;
      StackMapTable: number_of_entries = 6
        frame_type = 252 /* append */
          offset_delta = 13
          locals = [ class java/util/Iterator ]
        frame_type = 253 /* append */
          offset_delta = 32
          locals = [ class ext/mods/gameserver/model/zone/type/subtype/ZoneType, class java/util/Iterator ]
        frame_type = 255 /* full_frame */
          offset_delta = 32
          locals = [ class java/lang/Class, class "[Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;", class java/util/Iterator, class ext/mods/gameserver/model/zone/type/subtype/ZoneType, class java/util/Iterator, class ext/mods/gameserver/model/actor/Player, class "[Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;", int, int ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 26
          locals = [ class java/lang/Class, class "[Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;", class java/util/Iterator, class ext/mods/gameserver/model/zone/type/subtype/ZoneType, class java/util/Iterator ]
          stack = []
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 250 /* chop */
          offset_delta = 2
    Signature: #575                         // <T:Lext/mods/gameserver/model/zone/type/subtype/ZoneType;>(Ljava/lang/Class<TT;>;[Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V

  public static final ext.mods.gameserver.data.manager.ZoneManager getInstance();
    descriptor: ()Lext/mods/gameserver/data/manager/ZoneManager;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #311                // Field ext/mods/gameserver/data/manager/ZoneManager$SingletonHolder.INSTANCE:Lext/mods/gameserver/data/manager/ZoneManager;
         3: areturn
      LineNumberTable:
        line 397: 0
}
SourceFile: "ZoneManager.java"
NestMembers:
  ext/mods/gameserver/data/manager/ZoneManager$SingletonHolder
BootstrapMethods:
  0: #645 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #620 (Ljava/lang/Object;)I
      #622 REF_invokeInterface java/util/Map.size:()I
      #623 (Ljava/util/Map;)I
  1: #652 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #625 ext.mods.gameserver.model.zone.type.\u0001
  2: #645 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #627 (Ljava/lang/Object;)V
      #628 REF_invokeVirtual ext/mods/gameserver/data/manager/ZoneManager.lambda$parseDocument$0:(Ljava/lang/reflect/Constructor;Ljava/lang/String;Lorg/w3c/dom/Node;)V
      #631 (Lorg/w3c/dom/Node;)V
  3: #645 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #627 (Ljava/lang/Object;)V
      #633 REF_invokeVirtual ext/mods/gameserver/data/manager/ZoneManager.lambda$parseDocument$1:(Ljava/lang/reflect/Constructor;Ljava/lang/String;Lorg/w3c/dom/Node;)V
      #631 (Lorg/w3c/dom/Node;)V
  4: #645 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #627 (Ljava/lang/Object;)V
      #636 REF_invokeVirtual ext/mods/gameserver/data/manager/ZoneManager.lambda$parseDocument$2:(Ljava/util/List;Lorg/w3c/dom/Node;)V
      #631 (Lorg/w3c/dom/Node;)V
  5: #645 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #627 (Ljava/lang/Object;)V
      #639 REF_invokeVirtual ext/mods/gameserver/data/manager/ZoneManager.lambda$parseDocument$3:(Lext/mods/gameserver/model/zone/type/subtype/ZoneType;Lorg/w3c/dom/Node;)V
      #631 (Lorg/w3c/dom/Node;)V
  6: #645 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #627 (Ljava/lang/Object;)V
      #642 REF_invokeVirtual ext/mods/gameserver/data/manager/ZoneManager.lambda$parseDocument$4:(Lext/mods/gameserver/model/zone/type/subtype/SpawnZoneType;Lorg/w3c/dom/Node;)V
      #631 (Lorg/w3c/dom/Node;)V
InnerClasses:
  public static final #664= #660 of #662; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
