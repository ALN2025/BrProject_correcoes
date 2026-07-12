// Bytecode for: ext.mods.gameserver.model.WorldRegion
// File: ext\mods\gameserver\model\WorldRegion.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/WorldRegion.class
  Last modified 9 de jul de 2026; size 10246 bytes
  MD5 checksum 7e11f5d738aa7c303834415675624967
  Compiled from "WorldRegion.java"
public final class ext.mods.gameserver.model.WorldRegion
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #11                         // ext/mods/gameserver/model/WorldRegion
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 7, methods: 24, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Class              #8            // java/util/concurrent/ConcurrentHashMap
    #8 = Utf8               java/util/concurrent/ConcurrentHashMap
    #9 = Methodref          #7.#3         // java/util/concurrent/ConcurrentHashMap."<init>":()V
   #10 = Fieldref           #11.#12       // ext/mods/gameserver/model/WorldRegion._objects:Ljava/util/Map;
   #11 = Class              #13           // ext/mods/gameserver/model/WorldRegion
   #12 = NameAndType        #14:#15       // _objects:Ljava/util/Map;
   #13 = Utf8               ext/mods/gameserver/model/WorldRegion
   #14 = Utf8               _objects
   #15 = Utf8               Ljava/util/Map;
   #16 = Class              #17           // java/util/ArrayList
   #17 = Utf8               java/util/ArrayList
   #18 = Methodref          #16.#3        // java/util/ArrayList."<init>":()V
   #19 = Fieldref           #11.#20       // ext/mods/gameserver/model/WorldRegion._zones:Ljava/util/List;
   #20 = NameAndType        #21:#22       // _zones:Ljava/util/List;
   #21 = Utf8               _zones
   #22 = Utf8               Ljava/util/List;
   #23 = Class              #24           // java/util/concurrent/atomic/AtomicBoolean
   #24 = Utf8               java/util/concurrent/atomic/AtomicBoolean
   #25 = Methodref          #23.#3        // java/util/concurrent/atomic/AtomicBoolean."<init>":()V
   #26 = Fieldref           #11.#27       // ext/mods/gameserver/model/WorldRegion._isActive:Ljava/util/concurrent/atomic/AtomicBoolean;
   #27 = NameAndType        #28:#29       // _isActive:Ljava/util/concurrent/atomic/AtomicBoolean;
   #28 = Utf8               _isActive
   #29 = Utf8               Ljava/util/concurrent/atomic/AtomicBoolean;
   #30 = Class              #31           // java/util/concurrent/atomic/AtomicInteger
   #31 = Utf8               java/util/concurrent/atomic/AtomicInteger
   #32 = Methodref          #30.#3        // java/util/concurrent/atomic/AtomicInteger."<init>":()V
   #33 = Fieldref           #11.#34       // ext/mods/gameserver/model/WorldRegion._playersCount:Ljava/util/concurrent/atomic/AtomicInteger;
   #34 = NameAndType        #35:#36       // _playersCount:Ljava/util/concurrent/atomic/AtomicInteger;
   #35 = Utf8               _playersCount
   #36 = Utf8               Ljava/util/concurrent/atomic/AtomicInteger;
   #37 = Methodref          #38.#39       // ext/mods/InstanceMap/InstanceManager.getInstance:()Lext/mods/InstanceMap/InstanceManager;
   #38 = Class              #40           // ext/mods/InstanceMap/InstanceManager
   #39 = NameAndType        #41:#42       // getInstance:()Lext/mods/InstanceMap/InstanceManager;
   #40 = Utf8               ext/mods/InstanceMap/InstanceManager
   #41 = Utf8               getInstance
   #42 = Utf8               ()Lext/mods/InstanceMap/InstanceManager;
   #43 = Methodref          #38.#44       // ext/mods/InstanceMap/InstanceManager.getInstance:(I)Lext/mods/InstanceMap/MapInstance;
   #44 = NameAndType        #41:#45       // getInstance:(I)Lext/mods/InstanceMap/MapInstance;
   #45 = Utf8               (I)Lext/mods/InstanceMap/MapInstance;
   #46 = Fieldref           #11.#47       // ext/mods/gameserver/model/WorldRegion._instance:Lext/mods/InstanceMap/MapInstance;
   #47 = NameAndType        #48:#49       // _instance:Lext/mods/InstanceMap/MapInstance;
   #48 = Utf8               _instance
   #49 = Utf8               Lext/mods/InstanceMap/MapInstance;
   #50 = Fieldref           #11.#51       // ext/mods/gameserver/model/WorldRegion._tileX:I
   #51 = NameAndType        #52:#53       // _tileX:I
   #52 = Utf8               _tileX
   #53 = Utf8               I
   #54 = Fieldref           #11.#55       // ext/mods/gameserver/model/WorldRegion._tileY:I
   #55 = NameAndType        #56:#53       // _tileY:I
   #56 = Utf8               _tileY
   #57 = Methodref          #23.#58       // java/util/concurrent/atomic/AtomicBoolean.get:()Z
   #58 = NameAndType        #59:#60       // get:()Z
   #59 = Utf8               get
   #60 = Utf8               ()Z
   #61 = Methodref          #30.#62       // java/util/concurrent/atomic/AtomicInteger.get:()I
   #62 = NameAndType        #59:#63       // get:()I
   #63 = Utf8               ()I
   #64 = InvokeDynamic      #0:#65        // #0:makeConcatWithConstants:(IIZI)Ljava/lang/String;
   #65 = NameAndType        #66:#67       // makeConcatWithConstants:(IIZI)Ljava/lang/String;
   #66 = Utf8               makeConcatWithConstants
   #67 = Utf8               (IIZI)Ljava/lang/String;
   #68 = InterfaceMethodref #69.#70       // java/util/Map.values:()Ljava/util/Collection;
   #69 = Class              #71           // java/util/Map
   #70 = NameAndType        #72:#73       // values:()Ljava/util/Collection;
   #71 = Utf8               java/util/Map
   #72 = Utf8               values
   #73 = Utf8               ()Ljava/util/Collection;
   #74 = Methodref          #11.#75       // ext/mods/gameserver/model/WorldRegion.getObjects:()Ljava/util/Collection;
   #75 = NameAndType        #76:#73       // getObjects:()Ljava/util/Collection;
   #76 = Utf8               getObjects
   #77 = InterfaceMethodref #78.#79       // java/util/Collection.iterator:()Ljava/util/Iterator;
   #78 = Class              #80           // java/util/Collection
   #79 = NameAndType        #81:#82       // iterator:()Ljava/util/Iterator;
   #80 = Utf8               java/util/Collection
   #81 = Utf8               iterator
   #82 = Utf8               ()Ljava/util/Iterator;
   #83 = InterfaceMethodref #84.#85       // java/util/Iterator.hasNext:()Z
   #84 = Class              #86           // java/util/Iterator
   #85 = NameAndType        #87:#60       // hasNext:()Z
   #86 = Utf8               java/util/Iterator
   #87 = Utf8               hasNext
   #88 = InterfaceMethodref #84.#89       // java/util/Iterator.next:()Ljava/lang/Object;
   #89 = NameAndType        #90:#91       // next:()Ljava/lang/Object;
   #90 = Utf8               next
   #91 = Utf8               ()Ljava/lang/Object;
   #92 = Class              #93           // ext/mods/gameserver/model/WorldObject
   #93 = Utf8               ext/mods/gameserver/model/WorldObject
   #94 = Methodref          #2.#95        // java/lang/Object.getClass:()Ljava/lang/Class;
   #95 = NameAndType        #96:#97       // getClass:()Ljava/lang/Class;
   #96 = Utf8               getClass
   #97 = Utf8               ()Ljava/lang/Class;
   #98 = Methodref          #99.#100      // java/lang/Class.isAssignableFrom:(Ljava/lang/Class;)Z
   #99 = Class              #101          // java/lang/Class
  #100 = NameAndType        #102:#103     // isAssignableFrom:(Ljava/lang/Class;)Z
  #101 = Utf8               java/lang/Class
  #102 = Utf8               isAssignableFrom
  #103 = Utf8               (Ljava/lang/Class;)Z
  #104 = Methodref          #92.#105      // ext/mods/gameserver/model/WorldObject.isSameInstanceMap:(Lext/mods/gameserver/model/WorldObject;)Z
  #105 = NameAndType        #106:#107     // isSameInstanceMap:(Lext/mods/gameserver/model/WorldObject;)Z
  #106 = Utf8               isSameInstanceMap
  #107 = Utf8               (Lext/mods/gameserver/model/WorldObject;)Z
  #108 = Methodref          #99.#109      // java/lang/Class.cast:(Ljava/lang/Object;)Ljava/lang/Object;
  #109 = NameAndType        #110:#111     // cast:(Ljava/lang/Object;)Ljava/lang/Object;
  #110 = Utf8               cast
  #111 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
  #112 = InterfaceMethodref #113.#114     // java/util/function/Consumer.accept:(Ljava/lang/Object;)V
  #113 = Class              #115          // java/util/function/Consumer
  #114 = NameAndType        #116:#117     // accept:(Ljava/lang/Object;)V
  #115 = Utf8               java/util/function/Consumer
  #116 = Utf8               accept
  #117 = Utf8               (Ljava/lang/Object;)V
  #118 = InterfaceMethodref #119.#120     // java/util/function/Predicate.test:(Ljava/lang/Object;)Z
  #119 = Class              #121          // java/util/function/Predicate
  #120 = NameAndType        #122:#123     // test:(Ljava/lang/Object;)Z
  #121 = Utf8               java/util/function/Predicate
  #122 = Utf8               test
  #123 = Utf8               (Ljava/lang/Object;)Z
  #124 = Class              #125          // ext/mods/gameserver/model/World
  #125 = Utf8               ext/mods/gameserver/model/World
  #126 = Methodref          #124.#127     // ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
  #127 = NameAndType        #41:#128      // getInstance:()Lext/mods/gameserver/model/World;
  #128 = Utf8               ()Lext/mods/gameserver/model/World;
  #129 = Methodref          #124.#130     // ext/mods/gameserver/model/World.getWorldRegions:()[[Lext/mods/gameserver/model/WorldRegion;
  #130 = NameAndType        #131:#132     // getWorldRegions:()[[Lext/mods/gameserver/model/WorldRegion;
  #131 = Utf8               getWorldRegions
  #132 = Utf8               ()[[Lext/mods/gameserver/model/WorldRegion;
  #133 = InterfaceMethodref #134.#135     // java/util/List.add:(Ljava/lang/Object;)Z
  #134 = Class              #136          // java/util/List
  #135 = NameAndType        #137:#123     // add:(Ljava/lang/Object;)Z
  #136 = Utf8               java/util/List
  #137 = Utf8               add
  #138 = Methodref          #11.#139      // ext/mods/gameserver/model/WorldRegion.forEachRegion:(ILjava/util/function/Consumer;)V
  #139 = NameAndType        #140:#141     // forEachRegion:(ILjava/util/function/Consumer;)V
  #140 = Utf8               forEachRegion
  #141 = Utf8               (ILjava/util/function/Consumer;)V
  #142 = InterfaceMethodref #134.#143     // java/util/List.remove:(Ljava/lang/Object;)Z
  #143 = NameAndType        #144:#123     // remove:(Ljava/lang/Object;)Z
  #144 = Utf8               remove
  #145 = Methodref          #146.#147     // ext/mods/gameserver/model/actor/Creature.isTeleporting:()Z
  #146 = Class              #148          // ext/mods/gameserver/model/actor/Creature
  #147 = NameAndType        #149:#60      // isTeleporting:()Z
  #148 = Utf8               ext/mods/gameserver/model/actor/Creature
  #149 = Utf8               isTeleporting
  #150 = InvokeDynamic      #1:#151       // #1:accept:(Lext/mods/gameserver/model/actor/Creature;)Ljava/util/function/Consumer;
  #151 = NameAndType        #116:#152     // accept:(Lext/mods/gameserver/model/actor/Creature;)Ljava/util/function/Consumer;
  #152 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)Ljava/util/function/Consumer;
  #153 = InterfaceMethodref #134.#154     // java/util/List.forEach:(Ljava/util/function/Consumer;)V
  #154 = NameAndType        #155:#156     // forEach:(Ljava/util/function/Consumer;)V
  #155 = Utf8               forEach
  #156 = Utf8               (Ljava/util/function/Consumer;)V
  #157 = InvokeDynamic      #2:#151       // #2:accept:(Lext/mods/gameserver/model/actor/Creature;)Ljava/util/function/Consumer;
  #158 = InterfaceMethodref #134.#79      // java/util/List.iterator:()Ljava/util/Iterator;
  #159 = Class              #160          // ext/mods/gameserver/model/zone/type/subtype/ZoneType
  #160 = Utf8               ext/mods/gameserver/model/zone/type/subtype/ZoneType
  #161 = Methodref          #159.#162     // ext/mods/gameserver/model/zone/type/subtype/ZoneType.getId:()I
  #162 = NameAndType        #163:#63      // getId:()I
  #163 = Utf8               getId
  #164 = Methodref          #165.#166     // ext/mods/gameserver/skills/L2Skill.getEffectRange:()I
  #165 = Class              #167          // ext/mods/gameserver/skills/L2Skill
  #166 = NameAndType        #168:#63      // getEffectRange:()I
  #167 = Utf8               ext/mods/gameserver/skills/L2Skill
  #168 = Utf8               getEffectRange
  #169 = Methodref          #170.#171     // ext/mods/gameserver/model/location/Location.getY:()I
  #170 = Class              #172          // ext/mods/gameserver/model/location/Location
  #171 = NameAndType        #173:#63      // getY:()I
  #172 = Utf8               ext/mods/gameserver/model/location/Location
  #173 = Utf8               getY
  #174 = Methodref          #170.#175     // ext/mods/gameserver/model/location/Location.getX:()I
  #175 = NameAndType        #176:#63      // getX:()I
  #176 = Utf8               getX
  #177 = Class              #178          // ext/mods/gameserver/model/zone/type/DerbyTrackZone
  #178 = Utf8               ext/mods/gameserver/model/zone/type/DerbyTrackZone
  #179 = Class              #180          // ext/mods/gameserver/model/zone/type/PeaceZone
  #180 = Utf8               ext/mods/gameserver/model/zone/type/PeaceZone
  #181 = Methodref          #170.#182     // ext/mods/gameserver/model/location/Location.getZ:()I
  #182 = NameAndType        #183:#63      // getZ:()I
  #183 = Utf8               getZ
  #184 = Methodref          #159.#185     // ext/mods/gameserver/model/zone/type/subtype/ZoneType.isInsideZone:(III)Z
  #185 = NameAndType        #186:#187     // isInsideZone:(III)Z
  #186 = Utf8               isInsideZone
  #187 = Utf8               (III)Z
  #188 = Methodref          #11.#189      // ext/mods/gameserver/model/WorldRegion.getPlayersCount:()I
  #189 = NameAndType        #190:#63      // getPlayersCount:()I
  #190 = Utf8               getPlayersCount
  #191 = Methodref          #23.#192      // java/util/concurrent/atomic/AtomicBoolean.compareAndSet:(ZZ)Z
  #192 = NameAndType        #193:#194     // compareAndSet:(ZZ)Z
  #193 = Utf8               compareAndSet
  #194 = Utf8               (ZZ)Z
  #195 = Methodref          #92.#196      // ext/mods/gameserver/model/WorldObject.onActiveRegion:()V
  #196 = NameAndType        #197:#6       // onActiveRegion:()V
  #197 = Utf8               onActiveRegion
  #198 = Methodref          #92.#199      // ext/mods/gameserver/model/WorldObject.onInactiveRegion:()V
  #199 = NameAndType        #200:#6       // onInactiveRegion:()V
  #200 = Utf8               onInactiveRegion
  #201 = Methodref          #92.#202      // ext/mods/gameserver/model/WorldObject.getObjectId:()I
  #202 = NameAndType        #203:#63      // getObjectId:()I
  #203 = Utf8               getObjectId
  #204 = Methodref          #205.#206     // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
  #205 = Class              #207          // java/lang/Integer
  #206 = NameAndType        #208:#209     // valueOf:(I)Ljava/lang/Integer;
  #207 = Utf8               java/lang/Integer
  #208 = Utf8               valueOf
  #209 = Utf8               (I)Ljava/lang/Integer;
  #210 = InterfaceMethodref #69.#211      // java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #211 = NameAndType        #212:#213     // put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #212 = Utf8               put
  #213 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #214 = Class              #215          // ext/mods/gameserver/model/actor/Player
  #215 = Utf8               ext/mods/gameserver/model/actor/Player
  #216 = Methodref          #30.#217      // java/util/concurrent/atomic/AtomicInteger.incrementAndGet:()I
  #217 = NameAndType        #218:#63      // incrementAndGet:()I
  #218 = Utf8               incrementAndGet
  #219 = InterfaceMethodref #69.#220      // java/util/Map.remove:(Ljava/lang/Object;)Ljava/lang/Object;
  #220 = NameAndType        #144:#111     // remove:(Ljava/lang/Object;)Ljava/lang/Object;
  #221 = Methodref          #30.#222      // java/util/concurrent/atomic/AtomicInteger.decrementAndGet:()I
  #222 = NameAndType        #223:#63      // decrementAndGet:()I
  #223 = Utf8               decrementAndGet
  #224 = Methodref          #159.#225     // ext/mods/gameserver/model/zone/type/subtype/ZoneType.removeCreature:(Lext/mods/gameserver/model/actor/Creature;)V
  #225 = NameAndType        #226:#227     // removeCreature:(Lext/mods/gameserver/model/actor/Creature;)V
  #226 = Utf8               removeCreature
  #227 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)V
  #228 = Methodref          #159.#229     // ext/mods/gameserver/model/zone/type/subtype/ZoneType.revalidateInZone:(Lext/mods/gameserver/model/actor/Creature;)V
  #229 = NameAndType        #230:#227     // revalidateInZone:(Lext/mods/gameserver/model/actor/Creature;)V
  #230 = Utf8               revalidateInZone
  #231 = Utf8               Signature
  #232 = Utf8               Ljava/util/Map<Ljava/lang/Integer;Lext/mods/gameserver/model/WorldObject;>;
  #233 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/zone/type/subtype/ZoneType;>;
  #234 = Utf8               (II)V
  #235 = Utf8               Code
  #236 = Utf8               LineNumberTable
  #237 = Utf8               LocalVariableTable
  #238 = Utf8               this
  #239 = Utf8               Lext/mods/gameserver/model/WorldRegion;
  #240 = Utf8               x
  #241 = Utf8               y
  #242 = Utf8               toString
  #243 = Utf8               ()Ljava/lang/String;
  #244 = Utf8               ()Ljava/util/Collection<Lext/mods/gameserver/model/WorldObject;>;
  #245 = Utf8               forEachType
  #246 = Utf8               (Ljava/lang/Class;Lext/mods/gameserver/model/WorldObject;Ljava/util/function/Consumer;)V
  #247 = Utf8               obj
  #248 = Utf8               Lext/mods/gameserver/model/WorldObject;
  #249 = Utf8               type
  #250 = Utf8               Ljava/lang/Class;
  #251 = Utf8               observer
  #252 = Utf8               action
  #253 = Utf8               Ljava/util/function/Consumer;
  #254 = Utf8               LocalVariableTypeTable
  #255 = Utf8               Ljava/lang/Class<TA;>;
  #256 = Utf8               Ljava/util/function/Consumer<TA;>;
  #257 = Utf8               StackMapTable
  #258 = Utf8               <A:Lext/mods/gameserver/model/WorldObject;>(Ljava/lang/Class<TA;>;Lext/mods/gameserver/model/WorldObject;Ljava/util/function/Consumer<TA;>;)V
  #259 = Utf8               (Ljava/lang/Class;Lext/mods/gameserver/model/WorldObject;Ljava/util/function/Predicate;Ljava/util/function/Consumer;)V
  #260 = Utf8               actor
  #261 = Utf8               filter
  #262 = Utf8               Ljava/util/function/Predicate;
  #263 = Utf8               TA;
  #264 = Utf8               Ljava/util/function/Predicate<TA;>;
  #265 = Utf8               <A:Lext/mods/gameserver/model/WorldObject;>(Ljava/lang/Class<TA;>;Lext/mods/gameserver/model/WorldObject;Ljava/util/function/Predicate<TA;>;Ljava/util/function/Consumer<TA;>;)V
  #266 = Utf8               getSurroundingRegions
  #267 = Utf8               ()Ljava/util/List;
  #268 = Utf8               iy
  #269 = Utf8               ix
  #270 = Utf8               list
  #271 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/WorldRegion;>;
  #272 = Utf8               ()Ljava/util/List<Lext/mods/gameserver/model/WorldRegion;>;
  #273 = Utf8               forEachSurroundingRegion
  #274 = Utf8               Ljava/util/function/Consumer<Lext/mods/gameserver/model/WorldRegion;>;
  #275 = Utf8               (Ljava/util/function/Consumer<Lext/mods/gameserver/model/WorldRegion;>;)V
  #276 = Utf8               depth
  #277 = Utf8               (ILjava/util/function/Consumer<Lext/mods/gameserver/model/WorldRegion;>;)V
  #278 = Utf8               getZones
  #279 = Utf8               ()Ljava/util/List<Lext/mods/gameserver/model/zone/type/subtype/ZoneType;>;
  #280 = Utf8               addZone
  #281 = Utf8               (Lext/mods/gameserver/model/zone/type/subtype/ZoneType;)V
  #282 = Utf8               zone
  #283 = Utf8               Lext/mods/gameserver/model/zone/type/subtype/ZoneType;
  #284 = Utf8               removeZone
  #285 = Utf8               revalidateZones
  #286 = Utf8               character
  #287 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #288 = Utf8               removeFromZones
  #289 = Utf8               containsZone
  #290 = Utf8               (I)Z
  #291 = Utf8               z
  #292 = Utf8               zoneId
  #293 = Utf8               checkEffectRangeInsidePeaceZone
  #294 = Utf8               (Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/location/Location;)Z
  #295 = Utf8               e
  #296 = Utf8               skill
  #297 = Utf8               Lext/mods/gameserver/skills/L2Skill;
  #298 = Utf8               loc
  #299 = Utf8               Lext/mods/gameserver/model/location/Location;
  #300 = Utf8               range
  #301 = Utf8               up
  #302 = Utf8               down
  #303 = Utf8               left
  #304 = Utf8               right
  #305 = Utf8               isActive
  #306 = Utf8               isEmptyNeighborhood
  #307 = Utf8               neighbor
  #308 = Utf8               setActive
  #309 = Utf8               (Z)V
  #310 = Utf8               object
  #311 = Utf8               value
  #312 = Utf8               Z
  #313 = Utf8               addVisibleObject
  #314 = Utf8               (Lext/mods/gameserver/model/WorldObject;)V
  #315 = Utf8               removeVisibleObject
  #316 = Utf8               getInstanceMap
  #317 = Utf8               ()Lext/mods/InstanceMap/MapInstance;
  #318 = Utf8               lambda$removeFromZones$0
  #319 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/zone/type/subtype/ZoneType;)V
  #320 = Utf8               lambda$revalidateZones$0
  #321 = Utf8               SourceFile
  #322 = Utf8               WorldRegion.java
  #323 = Utf8               BootstrapMethods
  #324 = String             #325          // WorldRegion \u0001_\u0001, _active=\u0001, _playersCount=\u0001]
  #325 = Utf8               WorldRegion \u0001_\u0001, _active=\u0001, _playersCount=\u0001]
  #326 = MethodType         #117          //  (Ljava/lang/Object;)V
  #327 = MethodHandle       6:#328        // REF_invokeStatic ext/mods/gameserver/model/WorldRegion.lambda$revalidateZones$0:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/zone/type/subtype/ZoneType;)V
  #328 = Methodref          #11.#329      // ext/mods/gameserver/model/WorldRegion.lambda$revalidateZones$0:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/zone/type/subtype/ZoneType;)V
  #329 = NameAndType        #320:#319     // lambda$revalidateZones$0:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/zone/type/subtype/ZoneType;)V
  #330 = MethodType         #281          //  (Lext/mods/gameserver/model/zone/type/subtype/ZoneType;)V
  #331 = MethodHandle       6:#332        // REF_invokeStatic ext/mods/gameserver/model/WorldRegion.lambda$removeFromZones$0:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/zone/type/subtype/ZoneType;)V
  #332 = Methodref          #11.#333      // ext/mods/gameserver/model/WorldRegion.lambda$removeFromZones$0:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/zone/type/subtype/ZoneType;)V
  #333 = NameAndType        #318:#319     // lambda$removeFromZones$0:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/zone/type/subtype/ZoneType;)V
  #334 = MethodHandle       6:#335        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #335 = Methodref          #336.#337     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #336 = Class              #338          // java/lang/invoke/StringConcatFactory
  #337 = NameAndType        #66:#339      // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #338 = Utf8               java/lang/invoke/StringConcatFactory
  #339 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #340 = MethodHandle       6:#341        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #341 = Methodref          #342.#343     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #342 = Class              #344          // java/lang/invoke/LambdaMetafactory
  #343 = NameAndType        #345:#346     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #344 = Utf8               java/lang/invoke/LambdaMetafactory
  #345 = Utf8               metafactory
  #346 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #347 = Utf8               InnerClasses
  #348 = Class              #349          // java/lang/invoke/MethodHandles$Lookup
  #349 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #350 = Class              #351          // java/lang/invoke/MethodHandles
  #351 = Utf8               java/lang/invoke/MethodHandles
  #352 = Utf8               Lookup
{
  public ext.mods.gameserver.model.WorldRegion(int, int);
    descriptor: (II)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: new           #7                  // class java/util/concurrent/ConcurrentHashMap
         8: dup
         9: invokespecial #9                  // Method java/util/concurrent/ConcurrentHashMap."<init>":()V
        12: putfield      #10                 // Field _objects:Ljava/util/Map;
        15: aload_0
        16: new           #16                 // class java/util/ArrayList
        19: dup
        20: invokespecial #18                 // Method java/util/ArrayList."<init>":()V
        23: putfield      #19                 // Field _zones:Ljava/util/List;
        26: aload_0
        27: new           #23                 // class java/util/concurrent/atomic/AtomicBoolean
        30: dup
        31: invokespecial #25                 // Method java/util/concurrent/atomic/AtomicBoolean."<init>":()V
        34: putfield      #26                 // Field _isActive:Ljava/util/concurrent/atomic/AtomicBoolean;
        37: aload_0
        38: new           #30                 // class java/util/concurrent/atomic/AtomicInteger
        41: dup
        42: invokespecial #32                 // Method java/util/concurrent/atomic/AtomicInteger."<init>":()V
        45: putfield      #33                 // Field _playersCount:Ljava/util/concurrent/atomic/AtomicInteger;
        48: aload_0
        49: invokestatic  #37                 // Method ext/mods/InstanceMap/InstanceManager.getInstance:()Lext/mods/InstanceMap/InstanceManager;
        52: iconst_0
        53: invokevirtual #43                 // Method ext/mods/InstanceMap/InstanceManager.getInstance:(I)Lext/mods/InstanceMap/MapInstance;
        56: putfield      #46                 // Field _instance:Lext/mods/InstanceMap/MapInstance;
        59: aload_0
        60: iload_1
        61: putfield      #50                 // Field _tileX:I
        64: aload_0
        65: iload_2
        66: putfield      #54                 // Field _tileY:I
        69: return
      LineNumberTable:
        line 54: 0
        line 43: 4
        line 45: 15
        line 50: 26
        line 51: 37
        line 303: 48
        line 55: 59
        line 56: 64
        line 57: 69
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      70     0  this   Lext/mods/gameserver/model/WorldRegion;
            0      70     1     x   I
            0      70     2     y   I

  public java.lang.String toString();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=1, args_size=1
         0: aload_0
         1: getfield      #50                 // Field _tileX:I
         4: aload_0
         5: getfield      #54                 // Field _tileY:I
         8: aload_0
         9: getfield      #26                 // Field _isActive:Ljava/util/concurrent/atomic/AtomicBoolean;
        12: invokevirtual #57                 // Method java/util/concurrent/atomic/AtomicBoolean.get:()Z
        15: aload_0
        16: getfield      #33                 // Field _playersCount:Ljava/util/concurrent/atomic/AtomicInteger;
        19: invokevirtual #61                 // Method java/util/concurrent/atomic/AtomicInteger.get:()I
        22: invokedynamic #64,  0             // InvokeDynamic #0:makeConcatWithConstants:(IIZI)Ljava/lang/String;
        27: areturn
      LineNumberTable:
        line 62: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      28     0  this   Lext/mods/gameserver/model/WorldRegion;

  public java.util.Collection<ext.mods.gameserver.model.WorldObject> getObjects();
    descriptor: ()Ljava/util/Collection;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #10                 // Field _objects:Ljava/util/Map;
         4: invokeinterface #68,  1           // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
         9: areturn
      LineNumberTable:
        line 67: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/gameserver/model/WorldRegion;
    Signature: #244                         // ()Ljava/util/Collection<Lext/mods/gameserver/model/WorldObject;>;

  public <A extends ext.mods.gameserver.model.WorldObject> void forEachType(java.lang.Class<A>, ext.mods.gameserver.model.WorldObject, java.util.function.Consumer<A>);
    descriptor: (Ljava/lang/Class;Lext/mods/gameserver/model/WorldObject;Ljava/util/function/Consumer;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=6, args_size=4
         0: aload_0
         1: invokevirtual #74                 // Method getObjects:()Ljava/util/Collection;
         4: invokeinterface #77,  1           // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
         9: astore        4
        11: aload         4
        13: invokeinterface #83,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        18: ifeq          78
        21: aload         4
        23: invokeinterface #88,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        28: checkcast     #92                 // class ext/mods/gameserver/model/WorldObject
        31: astore        5
        33: aload_1
        34: aload         5
        36: invokevirtual #94                 // Method java/lang/Object.getClass:()Ljava/lang/Class;
        39: invokevirtual #98                 // Method java/lang/Class.isAssignableFrom:(Ljava/lang/Class;)Z
        42: ifne          48
        45: goto          11
        48: aload_2
        49: aload         5
        51: invokevirtual #104                // Method ext/mods/gameserver/model/WorldObject.isSameInstanceMap:(Lext/mods/gameserver/model/WorldObject;)Z
        54: ifne          60
        57: goto          11
        60: aload_3
        61: aload_1
        62: aload         5
        64: invokevirtual #108                // Method java/lang/Class.cast:(Ljava/lang/Object;)Ljava/lang/Object;
        67: checkcast     #92                 // class ext/mods/gameserver/model/WorldObject
        70: invokeinterface #112,  2          // InterfaceMethod java/util/function/Consumer.accept:(Ljava/lang/Object;)V
        75: goto          11
        78: return
      LineNumberTable:
        line 72: 0
        line 74: 33
        line 75: 45
        line 77: 48
        line 78: 57
        line 80: 60
        line 81: 75
        line 82: 78
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           33      42     5   obj   Lext/mods/gameserver/model/WorldObject;
            0      79     0  this   Lext/mods/gameserver/model/WorldRegion;
            0      79     1  type   Ljava/lang/Class;
            0      79     2 observer   Lext/mods/gameserver/model/WorldObject;
            0      79     3 action   Ljava/util/function/Consumer;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      79     1  type   Ljava/lang/Class<TA;>;
            0      79     3 action   Ljava/util/function/Consumer<TA;>;
      StackMapTable: number_of_entries = 4
        frame_type = 252 /* append */
          offset_delta = 11
          locals = [ class java/util/Iterator ]
        frame_type = 252 /* append */
          offset_delta = 36
          locals = [ class ext/mods/gameserver/model/WorldObject ]
        frame_type = 11 /* same */
        frame_type = 249 /* chop */
          offset_delta = 17
    Signature: #258                         // <A:Lext/mods/gameserver/model/WorldObject;>(Ljava/lang/Class<TA;>;Lext/mods/gameserver/model/WorldObject;Ljava/util/function/Consumer<TA;>;)V

  public <A extends ext.mods.gameserver.model.WorldObject> void forEachType(java.lang.Class<A>, ext.mods.gameserver.model.WorldObject, java.util.function.Predicate<A>, java.util.function.Consumer<A>);
    descriptor: (Ljava/lang/Class;Lext/mods/gameserver/model/WorldObject;Ljava/util/function/Predicate;Ljava/util/function/Consumer;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=8, args_size=5
         0: aload_0
         1: invokevirtual #74                 // Method getObjects:()Ljava/util/Collection;
         4: invokeinterface #77,  1           // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
         9: astore        5
        11: aload         5
        13: invokeinterface #83,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        18: ifeq          97
        21: aload         5
        23: invokeinterface #88,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        28: checkcast     #92                 // class ext/mods/gameserver/model/WorldObject
        31: astore        6
        33: aload_1
        34: aload         6
        36: invokevirtual #94                 // Method java/lang/Object.getClass:()Ljava/lang/Class;
        39: invokevirtual #98                 // Method java/lang/Class.isAssignableFrom:(Ljava/lang/Class;)Z
        42: ifne          48
        45: goto          11
        48: aload_2
        49: aload         6
        51: invokevirtual #104                // Method ext/mods/gameserver/model/WorldObject.isSameInstanceMap:(Lext/mods/gameserver/model/WorldObject;)Z
        54: ifne          60
        57: goto          11
        60: aload_1
        61: aload         6
        63: invokevirtual #108                // Method java/lang/Class.cast:(Ljava/lang/Object;)Ljava/lang/Object;
        66: checkcast     #92                 // class ext/mods/gameserver/model/WorldObject
        69: astore        7
        71: aload_3
        72: aload         7
        74: invokeinterface #118,  2          // InterfaceMethod java/util/function/Predicate.test:(Ljava/lang/Object;)Z
        79: ifne          85
        82: goto          11
        85: aload         4
        87: aload         7
        89: invokeinterface #112,  2          // InterfaceMethod java/util/function/Consumer.accept:(Ljava/lang/Object;)V
        94: goto          11
        97: return
      LineNumberTable:
        line 87: 0
        line 89: 33
        line 90: 45
        line 92: 48
        line 93: 57
        line 95: 60
        line 97: 71
        line 98: 82
        line 100: 85
        line 101: 94
        line 102: 97
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           71      23     7 actor   Lext/mods/gameserver/model/WorldObject;
           33      61     6   obj   Lext/mods/gameserver/model/WorldObject;
            0      98     0  this   Lext/mods/gameserver/model/WorldRegion;
            0      98     1  type   Ljava/lang/Class;
            0      98     2 observer   Lext/mods/gameserver/model/WorldObject;
            0      98     3 filter   Ljava/util/function/Predicate;
            0      98     4 action   Ljava/util/function/Consumer;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
           71      23     7 actor   TA;
            0      98     1  type   Ljava/lang/Class<TA;>;
            0      98     3 filter   Ljava/util/function/Predicate<TA;>;
            0      98     4 action   Ljava/util/function/Consumer<TA;>;
      StackMapTable: number_of_entries = 5
        frame_type = 252 /* append */
          offset_delta = 11
          locals = [ class java/util/Iterator ]
        frame_type = 252 /* append */
          offset_delta = 36
          locals = [ class ext/mods/gameserver/model/WorldObject ]
        frame_type = 11 /* same */
        frame_type = 252 /* append */
          offset_delta = 24
          locals = [ class ext/mods/gameserver/model/WorldObject ]
        frame_type = 248 /* chop */
          offset_delta = 11
    Signature: #265                         // <A:Lext/mods/gameserver/model/WorldObject;>(Ljava/lang/Class<TA;>;Lext/mods/gameserver/model/WorldObject;Ljava/util/function/Predicate<TA;>;Ljava/util/function/Consumer<TA;>;)V

  public java.util.List<ext.mods.gameserver.model.WorldRegion> getSurroundingRegions();
    descriptor: ()Ljava/util/List;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=6, args_size=1
         0: new           #16                 // class java/util/ArrayList
         3: dup
         4: invokespecial #18                 // Method java/util/ArrayList."<init>":()V
         7: astore_1
         8: iconst_m1
         9: istore_2
        10: iload_2
        11: iconst_1
        12: if_icmpgt     95
        15: iconst_m1
        16: istore_3
        17: iload_3
        18: iconst_1
        19: if_icmpgt     89
        22: aload_0
        23: getfield      #50                 // Field _tileX:I
        26: iload_2
        27: iadd
        28: istore        4
        30: aload_0
        31: getfield      #54                 // Field _tileY:I
        34: iload_3
        35: iadd
        36: istore        5
        38: iload         4
        40: iflt          83
        43: iload         4
        45: sipush        176
        48: if_icmpge     83
        51: iload         5
        53: iflt          83
        56: iload         5
        58: sipush        256
        61: if_icmpge     83
        64: aload_1
        65: invokestatic  #126                // Method ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
        68: invokevirtual #129                // Method ext/mods/gameserver/model/World.getWorldRegions:()[[Lext/mods/gameserver/model/WorldRegion;
        71: iload         4
        73: aaload
        74: iload         5
        76: aaload
        77: invokeinterface #133,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        82: pop
        83: iinc          3, 1
        86: goto          17
        89: iinc          2, 1
        92: goto          10
        95: aload_1
        96: areturn
      LineNumberTable:
        line 107: 0
        line 109: 8
        line 111: 15
        line 113: 22
        line 114: 30
        line 116: 38
        line 117: 64
        line 111: 83
        line 109: 89
        line 120: 95
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           30      53     4     x   I
           38      45     5     y   I
           17      72     3    iy   I
           10      85     2    ix   I
            0      97     0  this   Lext/mods/gameserver/model/WorldRegion;
            8      89     1  list   Ljava/util/List;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            8      89     1  list   Ljava/util/List<Lext/mods/gameserver/model/WorldRegion;>;
      StackMapTable: number_of_entries = 5
        frame_type = 253 /* append */
          offset_delta = 10
          locals = [ class java/util/List, int ]
        frame_type = 252 /* append */
          offset_delta = 6
          locals = [ int ]
        frame_type = 251 /* same_frame_extended */
          offset_delta = 65
        frame_type = 250 /* chop */
          offset_delta = 5
        frame_type = 250 /* chop */
          offset_delta = 5
    Signature: #272                         // ()Ljava/util/List<Lext/mods/gameserver/model/WorldRegion;>;

  public void forEachSurroundingRegion(java.util.function.Consumer<ext.mods.gameserver.model.WorldRegion>);
    descriptor: (Ljava/util/function/Consumer;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: iconst_1
         2: aload_1
         3: invokevirtual #138                // Method forEachRegion:(ILjava/util/function/Consumer;)V
         6: return
      LineNumberTable:
        line 129: 0
        line 130: 6
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/model/WorldRegion;
            0       7     1 action   Ljava/util/function/Consumer;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0       7     1 action   Ljava/util/function/Consumer<Lext/mods/gameserver/model/WorldRegion;>;
    Signature: #275                         // (Ljava/util/function/Consumer<Lext/mods/gameserver/model/WorldRegion;>;)V

  public void forEachRegion(int, java.util.function.Consumer<ext.mods.gameserver.model.WorldRegion>);
    descriptor: (ILjava/util/function/Consumer;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=7, args_size=3
         0: iload_1
         1: ineg
         2: istore_3
         3: iload_3
         4: iload_1
         5: if_icmpgt     91
         8: iload_1
         9: ineg
        10: istore        4
        12: iload         4
        14: iload_1
        15: if_icmpgt     85
        18: aload_0
        19: getfield      #50                 // Field _tileX:I
        22: iload_3
        23: iadd
        24: istore        5
        26: aload_0
        27: getfield      #54                 // Field _tileY:I
        30: iload         4
        32: iadd
        33: istore        6
        35: iload         5
        37: iflt          79
        40: iload         5
        42: sipush        176
        45: if_icmpge     79
        48: iload         6
        50: iflt          79
        53: iload         6
        55: sipush        256
        58: if_icmpge     79
        61: aload_2
        62: invokestatic  #126                // Method ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
        65: invokevirtual #129                // Method ext/mods/gameserver/model/World.getWorldRegions:()[[Lext/mods/gameserver/model/WorldRegion;
        68: iload         5
        70: aaload
        71: iload         6
        73: aaload
        74: invokeinterface #112,  2          // InterfaceMethod java/util/function/Consumer.accept:(Ljava/lang/Object;)V
        79: iinc          4, 1
        82: goto          12
        85: iinc          3, 1
        88: goto          3
        91: return
      LineNumberTable:
        line 139: 0
        line 141: 8
        line 143: 18
        line 144: 26
        line 146: 35
        line 147: 61
        line 141: 79
        line 139: 85
        line 150: 91
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           26      53     5     x   I
           35      44     6     y   I
           12      73     4    iy   I
            3      88     3    ix   I
            0      92     0  this   Lext/mods/gameserver/model/WorldRegion;
            0      92     1 depth   I
            0      92     2 action   Ljava/util/function/Consumer;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      92     2 action   Ljava/util/function/Consumer<Lext/mods/gameserver/model/WorldRegion;>;
      StackMapTable: number_of_entries = 5
        frame_type = 252 /* append */
          offset_delta = 3
          locals = [ int ]
        frame_type = 252 /* append */
          offset_delta = 8
          locals = [ int ]
        frame_type = 251 /* same_frame_extended */
          offset_delta = 66
        frame_type = 250 /* chop */
          offset_delta = 5
        frame_type = 250 /* chop */
          offset_delta = 5
    Signature: #277                         // (ILjava/util/function/Consumer<Lext/mods/gameserver/model/WorldRegion;>;)V

  public java.util.List<ext.mods.gameserver.model.zone.type.subtype.ZoneType> getZones();
    descriptor: ()Ljava/util/List;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #19                 // Field _zones:Ljava/util/List;
         4: areturn
      LineNumberTable:
        line 154: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/WorldRegion;
    Signature: #279                         // ()Ljava/util/List<Lext/mods/gameserver/model/zone/type/subtype/ZoneType;>;

  public void addZone(ext.mods.gameserver.model.zone.type.subtype.ZoneType);
    descriptor: (Lext/mods/gameserver/model/zone/type/subtype/ZoneType;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #19                 // Field _zones:Ljava/util/List;
         4: aload_1
         5: invokeinterface #133,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        10: pop
        11: return
      LineNumberTable:
        line 159: 0
        line 160: 11
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/gameserver/model/WorldRegion;
            0      12     1  zone   Lext/mods/gameserver/model/zone/type/subtype/ZoneType;

  public void removeZone(ext.mods.gameserver.model.zone.type.subtype.ZoneType);
    descriptor: (Lext/mods/gameserver/model/zone/type/subtype/ZoneType;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #19                 // Field _zones:Ljava/util/List;
         4: aload_1
         5: invokeinterface #142,  2          // InterfaceMethod java/util/List.remove:(Ljava/lang/Object;)Z
        10: pop
        11: return
      LineNumberTable:
        line 164: 0
        line 165: 11
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/gameserver/model/WorldRegion;
            0      12     1  zone   Lext/mods/gameserver/model/zone/type/subtype/ZoneType;

  public void revalidateZones(ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_1
         1: invokevirtual #145                // Method ext/mods/gameserver/model/actor/Creature.isTeleporting:()Z
         4: ifeq          8
         7: return
         8: aload_0
         9: getfield      #19                 // Field _zones:Ljava/util/List;
        12: aload_1
        13: invokedynamic #150,  0            // InvokeDynamic #1:accept:(Lext/mods/gameserver/model/actor/Creature;)Ljava/util/function/Consumer;
        18: invokeinterface #153,  2          // InterfaceMethod java/util/List.forEach:(Ljava/util/function/Consumer;)V
        23: return
      LineNumberTable:
        line 169: 0
        line 170: 7
        line 172: 8
        line 173: 23
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      24     0  this   Lext/mods/gameserver/model/WorldRegion;
            0      24     1 character   Lext/mods/gameserver/model/actor/Creature;
      StackMapTable: number_of_entries = 1
        frame_type = 8 /* same */

  public void removeFromZones(ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #19                 // Field _zones:Ljava/util/List;
         4: aload_1
         5: invokedynamic #157,  0            // InvokeDynamic #2:accept:(Lext/mods/gameserver/model/actor/Creature;)Ljava/util/function/Consumer;
        10: invokeinterface #153,  2          // InterfaceMethod java/util/List.forEach:(Ljava/util/function/Consumer;)V
        15: return
      LineNumberTable:
        line 177: 0
        line 178: 15
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      16     0  this   Lext/mods/gameserver/model/WorldRegion;
            0      16     1 character   Lext/mods/gameserver/model/actor/Creature;

  public boolean containsZone(int);
    descriptor: (I)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=4, args_size=2
         0: aload_0
         1: getfield      #19                 // Field _zones:Ljava/util/List;
         4: invokeinterface #158,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
         9: astore_2
        10: aload_2
        11: invokeinterface #83,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        16: ifeq          42
        19: aload_2
        20: invokeinterface #88,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        25: checkcast     #159                // class ext/mods/gameserver/model/zone/type/subtype/ZoneType
        28: astore_3
        29: aload_3
        30: invokevirtual #161                // Method ext/mods/gameserver/model/zone/type/subtype/ZoneType.getId:()I
        33: iload_1
        34: if_icmpne     39
        37: iconst_1
        38: ireturn
        39: goto          10
        42: iconst_0
        43: ireturn
      LineNumberTable:
        line 182: 0
        line 184: 29
        line 185: 37
        line 186: 39
        line 187: 42
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           29      10     3     z   Lext/mods/gameserver/model/zone/type/subtype/ZoneType;
            0      44     0  this   Lext/mods/gameserver/model/WorldRegion;
            0      44     1 zoneId   I
      StackMapTable: number_of_entries = 3
        frame_type = 252 /* append */
          offset_delta = 10
          locals = [ class java/util/Iterator ]
        frame_type = 28 /* same */
        frame_type = 250 /* chop */
          offset_delta = 2

  public boolean checkEffectRangeInsidePeaceZone(ext.mods.gameserver.skills.L2Skill, ext.mods.gameserver.model.location.Location);
    descriptor: (Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/location/Location;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=10, args_size=3
         0: aload_1
         1: invokevirtual #164                // Method ext/mods/gameserver/skills/L2Skill.getEffectRange:()I
         4: istore_3
         5: aload_2
         6: invokevirtual #169                // Method ext/mods/gameserver/model/location/Location.getY:()I
         9: iload_3
        10: iadd
        11: istore        4
        13: aload_2
        14: invokevirtual #169                // Method ext/mods/gameserver/model/location/Location.getY:()I
        17: iload_3
        18: isub
        19: istore        5
        21: aload_2
        22: invokevirtual #174                // Method ext/mods/gameserver/model/location/Location.getX:()I
        25: iload_3
        26: iadd
        27: istore        6
        29: aload_2
        30: invokevirtual #174                // Method ext/mods/gameserver/model/location/Location.getX:()I
        33: iload_3
        34: isub
        35: istore        7
        37: aload_0
        38: getfield      #19                 // Field _zones:Ljava/util/List;
        41: invokeinterface #158,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
        46: astore        8
        48: aload         8
        50: invokeinterface #83,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        55: ifeq          191
        58: aload         8
        60: invokeinterface #88,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        65: checkcast     #159                // class ext/mods/gameserver/model/zone/type/subtype/ZoneType
        68: astore        9
        70: aload         9
        72: instanceof    #177                // class ext/mods/gameserver/model/zone/type/DerbyTrackZone
        75: ifne          86
        78: aload         9
        80: instanceof    #179                // class ext/mods/gameserver/model/zone/type/PeaceZone
        83: ifeq          188
        86: aload         9
        88: aload_2
        89: invokevirtual #174                // Method ext/mods/gameserver/model/location/Location.getX:()I
        92: iload         4
        94: aload_2
        95: invokevirtual #181                // Method ext/mods/gameserver/model/location/Location.getZ:()I
        98: invokevirtual #184                // Method ext/mods/gameserver/model/zone/type/subtype/ZoneType.isInsideZone:(III)Z
       101: ifeq          106
       104: iconst_0
       105: ireturn
       106: aload         9
       108: aload_2
       109: invokevirtual #174                // Method ext/mods/gameserver/model/location/Location.getX:()I
       112: iload         5
       114: aload_2
       115: invokevirtual #181                // Method ext/mods/gameserver/model/location/Location.getZ:()I
       118: invokevirtual #184                // Method ext/mods/gameserver/model/zone/type/subtype/ZoneType.isInsideZone:(III)Z
       121: ifeq          126
       124: iconst_0
       125: ireturn
       126: aload         9
       128: iload         6
       130: aload_2
       131: invokevirtual #169                // Method ext/mods/gameserver/model/location/Location.getY:()I
       134: aload_2
       135: invokevirtual #181                // Method ext/mods/gameserver/model/location/Location.getZ:()I
       138: invokevirtual #184                // Method ext/mods/gameserver/model/zone/type/subtype/ZoneType.isInsideZone:(III)Z
       141: ifeq          146
       144: iconst_0
       145: ireturn
       146: aload         9
       148: iload         7
       150: aload_2
       151: invokevirtual #169                // Method ext/mods/gameserver/model/location/Location.getY:()I
       154: aload_2
       155: invokevirtual #181                // Method ext/mods/gameserver/model/location/Location.getZ:()I
       158: invokevirtual #184                // Method ext/mods/gameserver/model/zone/type/subtype/ZoneType.isInsideZone:(III)Z
       161: ifeq          166
       164: iconst_0
       165: ireturn
       166: aload         9
       168: aload_2
       169: invokevirtual #174                // Method ext/mods/gameserver/model/location/Location.getX:()I
       172: aload_2
       173: invokevirtual #169                // Method ext/mods/gameserver/model/location/Location.getY:()I
       176: aload_2
       177: invokevirtual #181                // Method ext/mods/gameserver/model/location/Location.getZ:()I
       180: invokevirtual #184                // Method ext/mods/gameserver/model/zone/type/subtype/ZoneType.isInsideZone:(III)Z
       183: ifeq          188
       186: iconst_0
       187: ireturn
       188: goto          48
       191: iconst_1
       192: ireturn
      LineNumberTable:
        line 192: 0
        line 193: 5
        line 194: 13
        line 195: 21
        line 196: 29
        line 198: 37
        line 200: 70
        line 202: 86
        line 203: 104
        line 205: 106
        line 206: 124
        line 208: 126
        line 209: 144
        line 211: 146
        line 212: 164
        line 214: 166
        line 215: 186
        line 217: 188
        line 218: 191
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           70     118     9     e   Lext/mods/gameserver/model/zone/type/subtype/ZoneType;
            0     193     0  this   Lext/mods/gameserver/model/WorldRegion;
            0     193     1 skill   Lext/mods/gameserver/skills/L2Skill;
            0     193     2   loc   Lext/mods/gameserver/model/location/Location;
            5     188     3 range   I
           13     180     4    up   I
           21     172     5  down   I
           29     164     6  left   I
           37     156     7 right   I
      StackMapTable: number_of_entries = 8
        frame_type = 255 /* full_frame */
          offset_delta = 48
          locals = [ class ext/mods/gameserver/model/WorldRegion, class ext/mods/gameserver/skills/L2Skill, class ext/mods/gameserver/model/location/Location, int, int, int, int, int, class java/util/Iterator ]
          stack = []
        frame_type = 252 /* append */
          offset_delta = 37
          locals = [ class ext/mods/gameserver/model/zone/type/subtype/ZoneType ]
        frame_type = 19 /* same */
        frame_type = 19 /* same */
        frame_type = 19 /* same */
        frame_type = 19 /* same */
        frame_type = 250 /* chop */
          offset_delta = 21
        frame_type = 250 /* chop */
          offset_delta = 2

  public boolean isActive();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #26                 // Field _isActive:Ljava/util/concurrent/atomic/AtomicBoolean;
         4: invokevirtual #57                 // Method java/util/concurrent/atomic/AtomicBoolean.get:()Z
         7: ireturn
      LineNumberTable:
        line 223: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/WorldRegion;

  public int getPlayersCount();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #33                 // Field _playersCount:Ljava/util/concurrent/atomic/AtomicInteger;
         4: invokevirtual #61                 // Method java/util/concurrent/atomic/AtomicInteger.get:()I
         7: ireturn
      LineNumberTable:
        line 228: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/WorldRegion;

  public boolean isEmptyNeighborhood();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=6, args_size=1
         0: iconst_m1
         1: istore_1
         2: iload_1
         3: iconst_1
         4: if_icmpgt     88
         7: iconst_m1
         8: istore_2
         9: iload_2
        10: iconst_1
        11: if_icmpgt     82
        14: aload_0
        15: getfield      #50                 // Field _tileX:I
        18: iload_1
        19: iadd
        20: istore_3
        21: aload_0
        22: getfield      #54                 // Field _tileY:I
        25: iload_2
        26: iadd
        27: istore        4
        29: iload_3
        30: iflt          76
        33: iload_3
        34: sipush        176
        37: if_icmpge     76
        40: iload         4
        42: iflt          76
        45: iload         4
        47: sipush        256
        50: if_icmpge     76
        53: invokestatic  #126                // Method ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
        56: invokevirtual #129                // Method ext/mods/gameserver/model/World.getWorldRegions:()[[Lext/mods/gameserver/model/WorldRegion;
        59: iload_3
        60: aaload
        61: iload         4
        63: aaload
        64: astore        5
        66: aload         5
        68: invokevirtual #188                // Method getPlayersCount:()I
        71: ifeq          76
        74: iconst_0
        75: ireturn
        76: iinc          2, 1
        79: goto          9
        82: iinc          1, 1
        85: goto          2
        88: iconst_1
        89: ireturn
      LineNumberTable:
        line 237: 0
        line 239: 7
        line 241: 14
        line 242: 21
        line 244: 29
        line 246: 53
        line 247: 66
        line 248: 74
        line 239: 76
        line 237: 82
        line 252: 88
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           66      10     5 neighbor   Lext/mods/gameserver/model/WorldRegion;
           21      55     3     x   I
           29      47     4     y   I
            9      73     2    iy   I
            2      86     1    ix   I
            0      90     0  this   Lext/mods/gameserver/model/WorldRegion;
      StackMapTable: number_of_entries = 5
        frame_type = 252 /* append */
          offset_delta = 2
          locals = [ int ]
        frame_type = 252 /* append */
          offset_delta = 6
          locals = [ int ]
        frame_type = 251 /* same_frame_extended */
          offset_delta = 66
        frame_type = 250 /* chop */
          offset_delta = 5
        frame_type = 250 /* chop */
          offset_delta = 5

  public void setActive(boolean);
    descriptor: (Z)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=4, args_size=2
         0: aload_0
         1: getfield      #26                 // Field _isActive:Ljava/util/concurrent/atomic/AtomicBoolean;
         4: iload_1
         5: ifne          12
         8: iconst_1
         9: goto          13
        12: iconst_0
        13: iload_1
        14: invokevirtual #191                // Method java/util/concurrent/atomic/AtomicBoolean.compareAndSet:(ZZ)Z
        17: ifne          21
        20: return
        21: aload_0
        22: getfield      #10                 // Field _objects:Ljava/util/Map;
        25: invokeinterface #68,  1           // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
        30: invokeinterface #77,  1           // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
        35: astore_2
        36: aload_2
        37: invokeinterface #83,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        42: ifeq          73
        45: aload_2
        46: invokeinterface #88,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        51: checkcast     #92                 // class ext/mods/gameserver/model/WorldObject
        54: astore_3
        55: iload_1
        56: ifeq          66
        59: aload_3
        60: invokevirtual #195                // Method ext/mods/gameserver/model/WorldObject.onActiveRegion:()V
        63: goto          70
        66: aload_3
        67: invokevirtual #198                // Method ext/mods/gameserver/model/WorldObject.onInactiveRegion:()V
        70: goto          36
        73: return
      LineNumberTable:
        line 261: 0
        line 262: 20
        line 264: 21
        line 266: 55
        line 267: 59
        line 269: 66
        line 270: 70
        line 271: 73
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           55      15     3 object   Lext/mods/gameserver/model/WorldObject;
            0      74     0  this   Lext/mods/gameserver/model/WorldRegion;
            0      74     1 value   Z
      StackMapTable: number_of_entries = 7
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/util/concurrent/atomic/AtomicBoolean ]
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/model/WorldRegion, int ]
          stack = [ class java/util/concurrent/atomic/AtomicBoolean, int ]
        frame_type = 7 /* same */
        frame_type = 252 /* append */
          offset_delta = 14
          locals = [ class java/util/Iterator ]
        frame_type = 252 /* append */
          offset_delta = 29
          locals = [ class ext/mods/gameserver/model/WorldObject ]
        frame_type = 250 /* chop */
          offset_delta = 3
        frame_type = 250 /* chop */
          offset_delta = 2

  public void addVisibleObject(ext.mods.gameserver.model.WorldObject);
    descriptor: (Lext/mods/gameserver/model/WorldObject;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: aload_1
         1: ifnonnull     5
         4: return
         5: aload_0
         6: getfield      #10                 // Field _objects:Ljava/util/Map;
         9: aload_1
        10: invokevirtual #201                // Method ext/mods/gameserver/model/WorldObject.getObjectId:()I
        13: invokestatic  #204                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        16: aload_1
        17: invokeinterface #210,  3          // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        22: pop
        23: aload_1
        24: instanceof    #214                // class ext/mods/gameserver/model/actor/Player
        27: ifeq          38
        30: aload_0
        31: getfield      #33                 // Field _playersCount:Ljava/util/concurrent/atomic/AtomicInteger;
        34: invokevirtual #216                // Method java/util/concurrent/atomic/AtomicInteger.incrementAndGet:()I
        37: pop
        38: return
      LineNumberTable:
        line 279: 0
        line 280: 4
        line 282: 5
        line 284: 23
        line 285: 30
        line 286: 38
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      39     0  this   Lext/mods/gameserver/model/WorldRegion;
            0      39     1 object   Lext/mods/gameserver/model/WorldObject;
      StackMapTable: number_of_entries = 2
        frame_type = 5 /* same */
        frame_type = 32 /* same */

  public void removeVisibleObject(ext.mods.gameserver.model.WorldObject);
    descriptor: (Lext/mods/gameserver/model/WorldObject;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_1
         1: ifnonnull     5
         4: return
         5: aload_0
         6: getfield      #10                 // Field _objects:Ljava/util/Map;
         9: aload_1
        10: invokevirtual #201                // Method ext/mods/gameserver/model/WorldObject.getObjectId:()I
        13: invokestatic  #204                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        16: invokeinterface #219,  2          // InterfaceMethod java/util/Map.remove:(Ljava/lang/Object;)Ljava/lang/Object;
        21: pop
        22: aload_1
        23: instanceof    #214                // class ext/mods/gameserver/model/actor/Player
        26: ifeq          37
        29: aload_0
        30: getfield      #33                 // Field _playersCount:Ljava/util/concurrent/atomic/AtomicInteger;
        33: invokevirtual #221                // Method java/util/concurrent/atomic/AtomicInteger.decrementAndGet:()I
        36: pop
        37: return
      LineNumberTable:
        line 294: 0
        line 295: 4
        line 297: 5
        line 299: 22
        line 300: 29
        line 301: 37
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      38     0  this   Lext/mods/gameserver/model/WorldRegion;
            0      38     1 object   Lext/mods/gameserver/model/WorldObject;
      StackMapTable: number_of_entries = 2
        frame_type = 5 /* same */
        frame_type = 31 /* same */

  public ext.mods.InstanceMap.MapInstance getInstanceMap();
    descriptor: ()Lext/mods/InstanceMap/MapInstance;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #46                 // Field _instance:Lext/mods/InstanceMap/MapInstance;
         4: areturn
      LineNumberTable:
        line 307: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/WorldRegion;
}
SourceFile: "WorldRegion.java"
BootstrapMethods:
  0: #334 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #324 WorldRegion \u0001_\u0001, _active=\u0001, _playersCount=\u0001]
  1: #340 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #326 (Ljava/lang/Object;)V
      #327 REF_invokeStatic ext/mods/gameserver/model/WorldRegion.lambda$revalidateZones$0:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/zone/type/subtype/ZoneType;)V
      #330 (Lext/mods/gameserver/model/zone/type/subtype/ZoneType;)V
  2: #340 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #326 (Ljava/lang/Object;)V
      #331 REF_invokeStatic ext/mods/gameserver/model/WorldRegion.lambda$removeFromZones$0:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/zone/type/subtype/ZoneType;)V
      #330 (Lext/mods/gameserver/model/zone/type/subtype/ZoneType;)V
InnerClasses:
  public static final #352= #348 of #350; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
