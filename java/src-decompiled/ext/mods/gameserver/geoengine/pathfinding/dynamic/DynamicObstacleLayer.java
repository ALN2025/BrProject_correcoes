// Bytecode for: ext.mods.gameserver.geoengine.pathfinding.dynamic.DynamicObstacleLayer
// File: ext\mods\gameserver\geoengine\pathfinding\dynamic\DynamicObstacleLayer.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer.class
  Last modified 9 de jul de 2026; size 10298 bytes
  MD5 checksum ca1b204e0931a00d06ec957433353017
  Compiled from "DynamicObstacleLayer.kt"
public final class ext.mods.gameserver.geoengine.pathfinding.dynamic.DynamicObstacleLayer
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #2                          // ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer
  super_class: #4                         // java/lang/Object
  interfaces: 0, fields: 5, methods: 14, attributes: 6
Constant pool:
    #1 = Utf8               ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer
    #2 = Class              #1            // ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer
    #3 = Utf8               java/lang/Object
    #4 = Class              #3            // java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               (II)V
    #7 = Utf8               ()V
    #8 = NameAndType        #5:#7         // "<init>":()V
    #9 = Methodref          #4.#8         // java/lang/Object."<init>":()V
   #10 = Utf8               totalNodes
   #11 = Utf8               I
   #12 = NameAndType        #10:#11       // totalNodes:I
   #13 = Fieldref           #2.#12        // ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer.totalNodes:I
   #14 = Utf8               chunkSize
   #15 = NameAndType        #14:#11       // chunkSize:I
   #16 = Fieldref           #2.#15        // ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer.chunkSize:I
   #17 = Utf8               java/util/concurrent/atomic/AtomicLongArray
   #18 = Class              #17           // java/util/concurrent/atomic/AtomicLongArray
   #19 = Utf8               (I)V
   #20 = NameAndType        #5:#19        // "<init>":(I)V
   #21 = Methodref          #18.#20       // java/util/concurrent/atomic/AtomicLongArray."<init>":(I)V
   #22 = Utf8               blockedBits
   #23 = Utf8               Ljava/util/concurrent/atomic/AtomicLongArray;
   #24 = NameAndType        #22:#23       // blockedBits:Ljava/util/concurrent/atomic/AtomicLongArray;
   #25 = Fieldref           #2.#24        // ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer.blockedBits:Ljava/util/concurrent/atomic/AtomicLongArray;
   #26 = Utf8               java/util/concurrent/ConcurrentHashMap
   #27 = Class              #26           // java/util/concurrent/ConcurrentHashMap
   #28 = Methodref          #27.#8        // java/util/concurrent/ConcurrentHashMap."<init>":()V
   #29 = Utf8               activeObjects
   #30 = Utf8               Ljava/util/concurrent/ConcurrentHashMap;
   #31 = NameAndType        #29:#30       // activeObjects:Ljava/util/concurrent/ConcurrentHashMap;
   #32 = Fieldref           #2.#31        // ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer.activeObjects:Ljava/util/concurrent/ConcurrentHashMap;
   #33 = Utf8               java/util/concurrent/locks/StampedLock
   #34 = Class              #33           // java/util/concurrent/locks/StampedLock
   #35 = Methodref          #34.#8        // java/util/concurrent/locks/StampedLock."<init>":()V
   #36 = Utf8               coordLock
   #37 = Utf8               Ljava/util/concurrent/locks/StampedLock;
   #38 = NameAndType        #36:#37       // coordLock:Ljava/util/concurrent/locks/StampedLock;
   #39 = Fieldref           #2.#38        // ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer.coordLock:Ljava/util/concurrent/locks/StampedLock;
   #40 = Utf8               this
   #41 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer;
   #42 = Utf8               (IIILkotlin/jvm/internal/DefaultConstructorMarker;)V
   #43 = NameAndType        #5:#6         // "<init>":(II)V
   #44 = Methodref          #2.#43        // ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer."<init>":(II)V
   #45 = Utf8               isBlocked
   #46 = Utf8               (I)Z
   #47 = Utf8               get
   #48 = Utf8               (I)J
   #49 = NameAndType        #47:#48       // get:(I)J
   #50 = Methodref          #18.#49       // java/util/concurrent/atomic/AtomicLongArray.get:(I)J
   #51 = Utf8               chunkIdx
   #52 = Utf8               bitIdx
   #53 = Utf8               nodeId
   #54 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/model/GeoLocation;I)Z
   #55 = Utf8               Lorg/jetbrains/annotations/NotNull;
   #56 = NameAndType        #45:#46       // isBlocked:(I)Z
   #57 = Methodref          #2.#56        // ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer.isBlocked:(I)Z
   #58 = Utf8               geo
   #59 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/model/GeoLocation;
   #60 = Utf8               nodeIdInRegion
   #61 = Utf8               blockNode
   #62 = Utf8               NodeId fora de bounds: \u0001
   #63 = String             #62           // NodeId fora de bounds: \u0001
   #64 = Utf8               java/lang/invoke/StringConcatFactory
   #65 = Class              #64           // java/lang/invoke/StringConcatFactory
   #66 = Utf8               makeConcatWithConstants
   #67 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #68 = NameAndType        #66:#67       // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #69 = Methodref          #65.#68       // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #70 = MethodHandle       6:#69         // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #71 = Utf8               (I)Ljava/lang/String;
   #72 = NameAndType        #66:#71       // makeConcatWithConstants:(I)Ljava/lang/String;
   #73 = InvokeDynamic      #0:#72        // #0:makeConcatWithConstants:(I)Ljava/lang/String;
   #74 = Utf8               java/lang/IllegalArgumentException
   #75 = Class              #74           // java/lang/IllegalArgumentException
   #76 = Utf8               toString
   #77 = Utf8               ()Ljava/lang/String;
   #78 = NameAndType        #76:#77       // toString:()Ljava/lang/String;
   #79 = Methodref          #4.#78        // java/lang/Object.toString:()Ljava/lang/String;
   #80 = Utf8               (Ljava/lang/String;)V
   #81 = NameAndType        #5:#80        // "<init>":(Ljava/lang/String;)V
   #82 = Methodref          #75.#81       // java/lang/IllegalArgumentException."<init>":(Ljava/lang/String;)V
   #83 = Utf8               compareAndSet
   #84 = Utf8               (IJJ)Z
   #85 = NameAndType        #83:#84       // compareAndSet:(IJJ)Z
   #86 = Methodref          #18.#85       // java/util/concurrent/atomic/AtomicLongArray.compareAndSet:(IJJ)Z
   #87 = Utf8               $i$a$-require-DynamicObstacleLayer$blockNode$1
   #88 = Utf8               mask
   #89 = Utf8               J
   #90 = Utf8               current
   #91 = Utf8               unblockNode
   #92 = Utf8               Failed requirement.
   #93 = String             #92           // Failed requirement.
   #94 = Long               -1l
   #96 = Utf8               isPathClear
   #97 = Utf8               ([I)Z
   #98 = Utf8               nodeIds
   #99 = Utf8               [I
  #100 = Utf8               registerObject
  #101 = Utf8               (Ljava/lang/String;[ILext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$ObjectType;)V
  #102 = Utf8               writeLock
  #103 = Utf8               ()J
  #104 = NameAndType        #102:#103     // writeLock:()J
  #105 = Methodref          #34.#104      // java/util/concurrent/locks/StampedLock.writeLock:()J
  #106 = NameAndType        #61:#46       // blockNode:(I)Z
  #107 = Methodref          #2.#106       // ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer.blockNode:(I)Z
  #108 = Utf8               java/util/Map
  #109 = Class              #108          // java/util/Map
  #110 = Utf8               ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$DynamicObject
  #111 = Class              #110          // ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$DynamicObject
  #112 = Utf8               (Ljava/lang/String;[ILext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$ObjectType;Z)V
  #113 = NameAndType        #5:#112       // "<init>":(Ljava/lang/String;[ILext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$ObjectType;Z)V
  #114 = Methodref          #111.#113     // ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$DynamicObject."<init>":(Ljava/lang/String;[ILext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$ObjectType;Z)V
  #115 = Utf8               put
  #116 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #117 = NameAndType        #115:#116     // put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #118 = InterfaceMethodref #109.#117     // java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #119 = Utf8               unlockWrite
  #120 = Utf8               (J)V
  #121 = NameAndType        #119:#120     // unlockWrite:(J)V
  #122 = Methodref          #34.#121      // java/util/concurrent/locks/StampedLock.unlockWrite:(J)V
  #123 = Utf8               $i$a$-forEach-DynamicObstacleLayer$registerObject$1
  #124 = Utf8               it
  #125 = Utf8               element$iv
  #126 = Utf8               $i$f$forEach
  #127 = Utf8               $this$forEach$iv
  #128 = Utf8               stamp
  #129 = Utf8               objectId
  #130 = Utf8               Ljava/lang/String;
  #131 = Utf8               objectType
  #132 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$ObjectType;
  #133 = Utf8               java/lang/String
  #134 = Class              #133          // java/lang/String
  #135 = Class              #99           // "[I"
  #136 = Utf8               ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$ObjectType
  #137 = Class              #136          // ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$ObjectType
  #138 = Utf8               java/lang/Throwable
  #139 = Class              #138          // java/lang/Throwable
  #140 = Utf8               registerObject$default
  #141 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer;Ljava/lang/String;[ILext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$ObjectType;ILjava/lang/Object;)V
  #142 = Utf8               DOOR
  #143 = NameAndType        #142:#132     // DOOR:Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$ObjectType;
  #144 = Fieldref           #137.#143     // ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$ObjectType.DOOR:Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$ObjectType;
  #145 = NameAndType        #100:#101     // registerObject:(Ljava/lang/String;[ILext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$ObjectType;)V
  #146 = Methodref          #2.#145       // ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer.registerObject:(Ljava/lang/String;[ILext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$ObjectType;)V
  #147 = Utf8               unregisterObject
  #148 = Utf8               remove
  #149 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
  #150 = NameAndType        #148:#149     // remove:(Ljava/lang/Object;)Ljava/lang/Object;
  #151 = Methodref          #27.#150      // java/util/concurrent/ConcurrentHashMap.remove:(Ljava/lang/Object;)Ljava/lang/Object;
  #152 = Utf8               getNodeIds
  #153 = Utf8               ()[I
  #154 = NameAndType        #152:#153     // getNodeIds:()[I
  #155 = Methodref          #111.#154     // ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$DynamicObject.getNodeIds:()[I
  #156 = NameAndType        #91:#46       // unblockNode:(I)Z
  #157 = Methodref          #2.#156       // ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer.unblockNode:(I)Z
  #158 = Utf8               $i$a$-forEach-DynamicObstacleLayer$unregisterObject$1
  #159 = Utf8               obj
  #160 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$DynamicObject;
  #161 = Utf8               toggleObject
  #162 = Utf8               (Ljava/lang/String;)Z
  #163 = NameAndType        #47:#149      // get:(Ljava/lang/Object;)Ljava/lang/Object;
  #164 = Methodref          #27.#163      // java/util/concurrent/ConcurrentHashMap.get:(Ljava/lang/Object;)Ljava/lang/Object;
  #165 = Utf8               getBlocked
  #166 = Utf8               ()Z
  #167 = NameAndType        #165:#166     // getBlocked:()Z
  #168 = Methodref          #111.#167     // ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$DynamicObject.getBlocked:()Z
  #169 = Utf8               copy$default
  #170 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$DynamicObject;Ljava/lang/String;[ILext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$ObjectType;ZILjava/lang/Object;)Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$DynamicObject;
  #171 = NameAndType        #169:#170     // copy$default:(Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$DynamicObject;Ljava/lang/String;[ILext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$ObjectType;ZILjava/lang/Object;)Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$DynamicObject;
  #172 = Methodref          #111.#171     // ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$DynamicObject.copy$default:(Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$DynamicObject;Ljava/lang/String;[ILext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$ObjectType;ZILjava/lang/Object;)Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$DynamicObject;
  #173 = Utf8               $i$a$-forEach-DynamicObstacleLayer$toggleObject$1
  #174 = Utf8               $i$a$-forEach-DynamicObstacleLayer$toggleObject$2
  #175 = Utf8               getObjectStates
  #176 = Utf8               ()Ljava/util/Map;
  #177 = Utf8               ()Ljava/util/Map<Ljava/lang/String;Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$DynamicObject;>;
  #178 = Utf8               tryOptimisticRead
  #179 = NameAndType        #178:#103     // tryOptimisticRead:()J
  #180 = Methodref          #34.#179      // java/util/concurrent/locks/StampedLock.tryOptimisticRead:()J
  #181 = Utf8               kotlin/collections/MapsKt
  #182 = Class              #181          // kotlin/collections/MapsKt
  #183 = Utf8               toMap
  #184 = Utf8               (Ljava/util/Map;)Ljava/util/Map;
  #185 = NameAndType        #183:#184     // toMap:(Ljava/util/Map;)Ljava/util/Map;
  #186 = Methodref          #182.#185     // kotlin/collections/MapsKt.toMap:(Ljava/util/Map;)Ljava/util/Map;
  #187 = Utf8               validate
  #188 = Utf8               (J)Z
  #189 = NameAndType        #187:#188     // validate:(J)Z
  #190 = Methodref          #34.#189      // java/util/concurrent/locks/StampedLock.validate:(J)Z
  #191 = Utf8               readLock
  #192 = NameAndType        #191:#103     // readLock:()J
  #193 = Methodref          #34.#192      // java/util/concurrent/locks/StampedLock.readLock:()J
  #194 = Utf8               unlockRead
  #195 = NameAndType        #194:#120     // unlockRead:(J)V
  #196 = Methodref          #34.#195      // java/util/concurrent/locks/StampedLock.unlockRead:(J)V
  #197 = Utf8               newStamp
  #198 = Utf8               copy
  #199 = Utf8               Ljava/util/Map;
  #200 = Utf8               clearAll
  #201 = Utf8               length
  #202 = Utf8               ()I
  #203 = NameAndType        #201:#202     // length:()I
  #204 = Methodref          #18.#203      // java/util/concurrent/atomic/AtomicLongArray.length:()I
  #205 = Utf8               set
  #206 = Utf8               (IJ)V
  #207 = NameAndType        #205:#206     // set:(IJ)V
  #208 = Methodref          #18.#207      // java/util/concurrent/atomic/AtomicLongArray.set:(IJ)V
  #209 = Utf8               clear
  #210 = NameAndType        #209:#7       // clear:()V
  #211 = Methodref          #27.#210      // java/util/concurrent/ConcurrentHashMap.clear:()V
  #212 = Utf8               i
  #213 = Utf8               getStats
  #214 = Utf8               ()Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$LayerStats;
  #215 = Utf8               java/lang/Long
  #216 = Class              #215          // java/lang/Long
  #217 = Utf8               bitCount
  #218 = Utf8               (J)I
  #219 = NameAndType        #217:#218     // bitCount:(J)I
  #220 = Methodref          #216.#219     // java/lang/Long.bitCount:(J)I
  #221 = Utf8               ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$LayerStats
  #222 = Class              #221          // ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$LayerStats
  #223 = Utf8               size
  #224 = NameAndType        #223:#202     // size:()I
  #225 = Methodref          #27.#224      // java/util/concurrent/ConcurrentHashMap.size:()I
  #226 = Long               8l
  #228 = Long               64l
  #230 = Utf8               (IIIJ)V
  #231 = NameAndType        #5:#230       // "<init>":(IIIJ)V
  #232 = Methodref          #222.#231     // ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$LayerStats."<init>":(IIIJ)V
  #233 = Utf8               blockedCount
  #234 = Utf8               Ljava/util/concurrent/ConcurrentHashMap<Ljava/lang/String;Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$DynamicObject;>;
  #235 = Utf8               Lkotlin/Metadata;
  #236 = Utf8               mv
  #237 = Integer            2
  #238 = Integer            3
  #239 = Integer            0
  #240 = Utf8               k
  #241 = Integer            1
  #242 = Utf8               xi
  #243 = Integer            48
  #244 = Utf8               d1
  #245 = Utf8               \u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0003&\'(B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0003J\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0003J\u000e\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0003J\u000e\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0003J\u000e\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0019J \u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001d\u001a\u00020\u001eJ\u000e\u0010\u001f\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u000bJ\u000e\u0010 \u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u000bJ\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\"J\u0006\u0010#\u001a\u00020\u001bJ\u0006\u0010$\u001a\u00020%R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006)
  #246 = Utf8               d2
  #247 = Utf8
  #248 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$LayerStats;
  #249 = Utf8               DynamicObject
  #250 = Utf8               ObjectType
  #251 = Utf8               LayerStats
  #252 = Utf8               Brproject
  #253 = Utf8               DynamicObstacleLayer.kt
  #254 = Utf8               Lkotlin/jvm/internal/SourceDebugExtension;
  #255 = Utf8               value
  #256 = Utf8               SMAP\nDynamicObstacleLayer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DynamicObstacleLayer.kt\next/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,238:1\n1#2:239\n14081#3,2:240\n14081#3,2:242\n14081#3,2:244\n14081#3,2:246\n*S KotlinDebug\n*F\n+ 1 DynamicObstacleLayer.kt\next/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer\n*L\n86#1:240,2\n103#1:242,2\n115#1:244,2\n118#1:246,2\n*E\n
  #257 = Utf8               RuntimeInvisibleAnnotations
  #258 = Utf8               Signature
  #259 = Utf8               Code
  #260 = Utf8               LineNumberTable
  #261 = Utf8               LocalVariableTable
  #262 = Utf8               StackMapTable
  #263 = Utf8               RuntimeInvisibleParameterAnnotations
  #264 = Utf8               InnerClasses
  #265 = Utf8               SourceFile
  #266 = Utf8               SourceDebugExtension
  #267 = Utf8               RuntimeVisibleAnnotations
  #268 = Utf8               BootstrapMethods
{
  public ext.mods.gameserver.geoengine.pathfinding.dynamic.DynamicObstacleLayer(int, int);
    descriptor: (II)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=3, args_size=3
         0: aload_0
         1: invokespecial #9                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: iload_1
         6: putfield      #13                 // Field totalNodes:I
         9: aload_0
        10: iload_2
        11: putfield      #16                 // Field chunkSize:I
        14: aload_0
        15: new           #18                 // class java/util/concurrent/atomic/AtomicLongArray
        18: dup
        19: aload_0
        20: getfield      #13                 // Field totalNodes:I
        23: aload_0
        24: getfield      #16                 // Field chunkSize:I
        27: iadd
        28: iconst_1
        29: isub
        30: aload_0
        31: getfield      #16                 // Field chunkSize:I
        34: idiv
        35: invokespecial #21                 // Method java/util/concurrent/atomic/AtomicLongArray."<init>":(I)V
        38: putfield      #25                 // Field blockedBits:Ljava/util/concurrent/atomic/AtomicLongArray;
        41: aload_0
        42: new           #27                 // class java/util/concurrent/ConcurrentHashMap
        45: dup
        46: invokespecial #28                 // Method java/util/concurrent/ConcurrentHashMap."<init>":()V
        49: putfield      #32                 // Field activeObjects:Ljava/util/concurrent/ConcurrentHashMap;
        52: aload_0
        53: new           #34                 // class java/util/concurrent/locks/StampedLock
        56: dup
        57: invokespecial #35                 // Method java/util/concurrent/locks/StampedLock."<init>":()V
        60: putfield      #39                 // Field coordLock:Ljava/util/concurrent/locks/StampedLock;
        63: return
      LineNumberTable:
        line 29: 0
        line 30: 4
        line 31: 9
        line 33: 14
        line 35: 41
        line 37: 52
        line 29: 63
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      64     0  this   Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer;
            0      64     1 totalNodes   I
            0      64     2 chunkSize   I

  public ext.mods.gameserver.geoengine.pathfinding.dynamic.DynamicObstacleLayer(int, int, int, kotlin.jvm.internal.DefaultConstructorMarker);
    descriptor: (IIILkotlin/jvm/internal/DefaultConstructorMarker;)V
    flags: (0x1001) ACC_PUBLIC, ACC_SYNTHETIC
    Code:
      stack=3, locals=5, args_size=5
         0: iload_3
         1: iconst_2
         2: iand
         3: ifeq          9
         6: bipush        64
         8: istore_2
         9: aload_0
        10: iload_1
        11: iload_2
        12: invokespecial #44                 // Method "<init>":(II)V
        15: return
      StackMapTable: number_of_entries = 1
        frame_type = 9 /* same */
      LineNumberTable:
        line 29: 0
        line 31: 6
        line 29: 9
        line 32: 15

  public final boolean isBlocked(int);
    descriptor: (I)Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=4, locals=4, args_size=2
         0: iload_1
         1: iflt          12
         4: iload_1
         5: aload_0
         6: getfield      #13                 // Field totalNodes:I
         9: if_icmplt     14
        12: iconst_1
        13: ireturn
        14: iload_1
        15: bipush        6
        17: iushr
        18: istore_2
        19: iload_1
        20: bipush        63
        22: iand
        23: istore_3
        24: aload_0
        25: getfield      #25                 // Field blockedBits:Ljava/util/concurrent/atomic/AtomicLongArray;
        28: iload_2
        29: invokevirtual #50                 // Method java/util/concurrent/atomic/AtomicLongArray.get:(I)J
        32: iload_3
        33: lushr
        34: lconst_1
        35: land
        36: lconst_0
        37: lcmp
        38: ifeq          45
        41: iconst_1
        42: goto          46
        45: iconst_0
        46: ireturn
      StackMapTable: number_of_entries = 4
        frame_type = 12 /* same */
        frame_type = 1 /* same */
        frame_type = 253 /* append */
          offset_delta = 30
          locals = [ int, int ]
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
      LineNumberTable:
        line 40: 0
        line 41: 14
        line 42: 19
        line 43: 24
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           19      28     2 chunkIdx   I
           24      23     3 bitIdx   I
            0      47     0  this   Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer;
            0      47     1 nodeId   I

  public final boolean isBlocked(ext.mods.gameserver.geoengine.pathfinding.model.GeoLocation, int);
    descriptor: (Lext/mods/gameserver/geoengine/pathfinding/model/GeoLocation;I)Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=3, args_size=3
         0: aload_0
         1: iload_2
         2: invokevirtual #57                 // Method isBlocked:(I)Z
         5: ireturn
      LineNumberTable:
        line 47: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer;
            0       6     1   geo   Lext/mods/gameserver/geoengine/pathfinding/model/GeoLocation;
            0       6     2 nodeIdInRegion   I
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #55()
          org.jetbrains.annotations.NotNull
      parameter 1:

  public final boolean blockNode(int);
    descriptor: (I)Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=8, locals=8, args_size=2
         0: iconst_0
         1: iload_1
         2: if_icmpgt     21
         5: iload_1
         6: aload_0
         7: getfield      #13                 // Field totalNodes:I
        10: if_icmpge     17
        13: iconst_1
        14: goto          22
        17: iconst_0
        18: goto          22
        21: iconst_0
        22: ifne          46
        25: iconst_0
        26: istore_3
        27: iload_1
        28: invokedynamic #73,  0             // InvokeDynamic #0:makeConcatWithConstants:(I)Ljava/lang/String;
        33: astore_3
        34: new           #75                 // class java/lang/IllegalArgumentException
        37: dup
        38: aload_3
        39: invokevirtual #79                 // Method java/lang/Object.toString:()Ljava/lang/String;
        42: invokespecial #82                 // Method java/lang/IllegalArgumentException."<init>":(Ljava/lang/String;)V
        45: athrow
        46: iload_1
        47: bipush        6
        49: iushr
        50: istore_2
        51: iload_1
        52: bipush        63
        54: iand
        55: istore_3
        56: lconst_1
        57: iload_3
        58: lshl
        59: lstore        4
        61: lconst_0
        62: lstore        6
        64: aload_0
        65: getfield      #25                 // Field blockedBits:Ljava/util/concurrent/atomic/AtomicLongArray;
        68: iload_2
        69: invokevirtual #50                 // Method java/util/concurrent/atomic/AtomicLongArray.get:(I)J
        72: lstore        6
        74: lload         6
        76: lload         4
        78: land
        79: lconst_0
        80: lcmp
        81: ifeq          86
        84: iconst_0
        85: ireturn
        86: aload_0
        87: getfield      #25                 // Field blockedBits:Ljava/util/concurrent/atomic/AtomicLongArray;
        90: iload_2
        91: lload         6
        93: lload         6
        95: lload         4
        97: lor
        98: invokevirtual #86                 // Method java/util/concurrent/atomic/AtomicLongArray.compareAndSet:(IJJ)Z
       101: ifeq          64
       104: iconst_1
       105: ireturn
      StackMapTable: number_of_entries = 6
        frame_type = 17 /* same */
        frame_type = 3 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 23 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 17
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer, int, int, int, long, long ]
          stack = []
        frame_type = 21 /* same */
      LineNumberTable:
        line 51: 0
        line 239: 25
        line 51: 27
        line 51: 33
        line 52: 46
        line 53: 51
        line 54: 56
        line 55: 61
        line 57: 64
        line 58: 74
        line 59: 86
        line 60: 104
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           27       6     3 $i$a$-require-DynamicObstacleLayer$blockNode$1   I
           51      55     2 chunkIdx   I
           56      50     3 bitIdx   I
           61      45     4  mask   J
           64      42     6 current   J
            0     106     0  this   Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer;
            0     106     1 nodeId   I

  public final boolean unblockNode(int);
    descriptor: (I)Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=10, locals=8, args_size=2
         0: iconst_0
         1: iload_1
         2: if_icmpgt     21
         5: iload_1
         6: aload_0
         7: getfield      #13                 // Field totalNodes:I
        10: if_icmpge     17
        13: iconst_1
        14: goto          22
        17: iconst_0
        18: goto          22
        21: iconst_0
        22: ifne          40
        25: ldc           #93                 // String Failed requirement.
        27: astore_3
        28: new           #75                 // class java/lang/IllegalArgumentException
        31: dup
        32: aload_3
        33: invokevirtual #79                 // Method java/lang/Object.toString:()Ljava/lang/String;
        36: invokespecial #82                 // Method java/lang/IllegalArgumentException."<init>":(Ljava/lang/String;)V
        39: athrow
        40: iload_1
        41: bipush        6
        43: iushr
        44: istore_2
        45: iload_1
        46: bipush        63
        48: iand
        49: istore_3
        50: lconst_1
        51: iload_3
        52: lshl
        53: lstore        4
        55: lconst_0
        56: lstore        6
        58: aload_0
        59: getfield      #25                 // Field blockedBits:Ljava/util/concurrent/atomic/AtomicLongArray;
        62: iload_2
        63: invokevirtual #50                 // Method java/util/concurrent/atomic/AtomicLongArray.get:(I)J
        66: lstore        6
        68: lload         6
        70: lload         4
        72: land
        73: lconst_0
        74: lcmp
        75: ifne          80
        78: iconst_0
        79: ireturn
        80: aload_0
        81: getfield      #25                 // Field blockedBits:Ljava/util/concurrent/atomic/AtomicLongArray;
        84: iload_2
        85: lload         6
        87: lload         6
        89: lload         4
        91: ldc2_w        #94                 // long -1l
        94: lxor
        95: land
        96: invokevirtual #86                 // Method java/util/concurrent/atomic/AtomicLongArray.compareAndSet:(IJJ)Z
        99: ifeq          58
       102: iconst_1
       103: ireturn
      StackMapTable: number_of_entries = 6
        frame_type = 17 /* same */
        frame_type = 3 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 17 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 17
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer, int, int, int, long, long ]
          stack = []
        frame_type = 21 /* same */
      LineNumberTable:
        line 64: 0
        line 65: 40
        line 66: 45
        line 67: 50
        line 68: 55
        line 70: 58
        line 71: 68
        line 72: 80
        line 73: 102
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           45      59     2 chunkIdx   I
           50      54     3 bitIdx   I
           55      49     4  mask   J
           58      46     6 current   J
            0     104     0  this   Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer;
            0     104     1 nodeId   I

  public final boolean isPathClear(int[]);
    descriptor: ([I)Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=5, args_size=2
         0: iconst_0
         1: istore_2
         2: aload_1
         3: arraylength
         4: istore_3
         5: iload_2
         6: iload_3
         7: if_icmpge     32
        10: aload_1
        11: iload_2
        12: iaload
        13: istore        4
        15: aload_0
        16: iload         4
        18: invokevirtual #57                 // Method isBlocked:(I)Z
        21: ifeq          26
        24: iconst_0
        25: ireturn
        26: iinc          2, 1
        29: goto          5
        32: iconst_1
        33: ireturn
      StackMapTable: number_of_entries = 3
        frame_type = 253 /* append */
          offset_delta = 5
          locals = [ int, int ]
        frame_type = 252 /* append */
          offset_delta = 20
          locals = [ int ]
        frame_type = 250 /* chop */
          offset_delta = 5
      LineNumberTable:
        line 77: 0
        line 78: 15
        line 77: 26
        line 80: 32
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           15      11     4 nodeId   I
            0      34     0  this   Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer;
            0      34     1 nodeIds   [I
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #55()
          org.jetbrains.annotations.NotNull

  public final void registerObject(java.lang.String, int[], ext.mods.gameserver.geoengine.pathfinding.dynamic.DynamicObstacleLayer$ObjectType);
    descriptor: (Ljava/lang/String;[ILext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$ObjectType;)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=8, locals=13, args_size=4
         0: aload_0
         1: getfield      #39                 // Field coordLock:Ljava/util/concurrent/locks/StampedLock;
         4: invokevirtual #105                // Method java/util/concurrent/locks/StampedLock.writeLock:()J
         7: lstore        4
         9: nop
        10: aload_2
        11: astore        6
        13: iconst_0
        14: istore        7
        16: iconst_0
        17: istore        8
        19: aload         6
        21: arraylength
        22: istore        9
        24: iload         8
        26: iload         9
        28: if_icmpge     59
        31: aload         6
        33: iload         8
        35: iaload
        36: istore        10
        38: iload         10
        40: istore        11
        42: iconst_0
        43: istore        12
        45: aload_0
        46: iload         11
        48: invokevirtual #107                // Method blockNode:(I)Z
        51: pop
        52: nop
        53: iinc          8, 1
        56: goto          24
        59: nop
        60: aload_0
        61: getfield      #32                 // Field activeObjects:Ljava/util/concurrent/ConcurrentHashMap;
        64: checkcast     #109                // class java/util/Map
        67: aload_1
        68: new           #111                // class ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$DynamicObject
        71: dup
        72: aload_1
        73: aload_2
        74: aload_3
        75: iconst_1
        76: invokespecial #114                // Method ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$DynamicObject."<init>":(Ljava/lang/String;[ILext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$ObjectType;Z)V
        79: invokeinterface #118,  3          // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        84: pop
        85: aload_0
        86: getfield      #39                 // Field coordLock:Ljava/util/concurrent/locks/StampedLock;
        89: lload         4
        91: invokevirtual #122                // Method java/util/concurrent/locks/StampedLock.unlockWrite:(J)V
        94: goto          111
        97: astore        6
        99: aload_0
       100: getfield      #39                 // Field coordLock:Ljava/util/concurrent/locks/StampedLock;
       103: lload         4
       105: invokevirtual #122                // Method java/util/concurrent/locks/StampedLock.unlockWrite:(J)V
       108: aload         6
       110: athrow
       111: return
      Exception table:
         from    to  target type
             9    85    97   any
            97    99    97   any
      StackMapTable: number_of_entries = 4
        frame_type = 255 /* full_frame */
          offset_delta = 24
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer, class java/lang/String, class "[I", class ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$ObjectType, long, class "[I", int, int, int ]
          stack = []
        frame_type = 34 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 37
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer, class java/lang/String, class "[I", class ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$ObjectType, long ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer, class java/lang/String, class "[I", class ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$ObjectType, long, class "[I", int, int, int ]
          stack = []
      LineNumberTable:
        line 84: 0
        line 85: 9
        line 86: 10
        line 240: 16
        line 86: 45
        line 240: 52
        line 241: 59
        line 88: 60
        line 89: 72
        line 90: 73
        line 91: 74
        line 92: 75
        line 88: 76
        line 95: 85
        line 96: 94
        line 95: 97
        line 97: 111
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           45       7    12 $i$a$-forEach-DynamicObstacleLayer$registerObject$1   I
           42      10    11    it   I
           38      15    10 element$iv   I
           16      44     7 $i$f$forEach   I
           13      47     6 $this$forEach$iv   [I
            9     103     4 stamp   J
            0     112     0  this   Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer;
            0     112     1 objectId   Ljava/lang/String;
            0     112     2 nodeIds   [I
            0     112     3 objectType   Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$ObjectType;
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #55()
          org.jetbrains.annotations.NotNull
      parameter 1:
        0: #55()
          org.jetbrains.annotations.NotNull
      parameter 2:
        0: #55()
          org.jetbrains.annotations.NotNull

  public static void registerObject$default(ext.mods.gameserver.geoengine.pathfinding.dynamic.DynamicObstacleLayer, java.lang.String, int[], ext.mods.gameserver.geoengine.pathfinding.dynamic.DynamicObstacleLayer$ObjectType, int, java.lang.Object);
    descriptor: (Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer;Ljava/lang/String;[ILext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$ObjectType;ILjava/lang/Object;)V
    flags: (0x1009) ACC_PUBLIC, ACC_STATIC, ACC_SYNTHETIC
    Code:
      stack=4, locals=6, args_size=6
         0: iload         4
         2: iconst_4
         3: iand
         4: ifeq          11
         7: getstatic     #144                // Field ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$ObjectType.DOOR:Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$ObjectType;
        10: astore_3
        11: aload_0
        12: aload_1
        13: aload_2
        14: aload_3
        15: invokevirtual #146                // Method registerObject:(Ljava/lang/String;[ILext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$ObjectType;)V
        18: return
      StackMapTable: number_of_entries = 1
        frame_type = 11 /* same */
      LineNumberTable:
        line 83: 0

  public final void unregisterObject(java.lang.String);
    descriptor: (Ljava/lang/String;)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=3, locals=12, args_size=2
         0: aload_0
         1: getfield      #39                 // Field coordLock:Ljava/util/concurrent/locks/StampedLock;
         4: invokevirtual #105                // Method java/util/concurrent/locks/StampedLock.writeLock:()J
         7: lstore_2
         8: nop
         9: aload_0
        10: getfield      #32                 // Field activeObjects:Ljava/util/concurrent/ConcurrentHashMap;
        13: aload_1
        14: invokevirtual #151                // Method java/util/concurrent/ConcurrentHashMap.remove:(Ljava/lang/Object;)Ljava/lang/Object;
        17: checkcast     #111                // class ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$DynamicObject
        20: dup
        21: ifnonnull     34
        24: pop
        25: aload_0
        26: getfield      #39                 // Field coordLock:Ljava/util/concurrent/locks/StampedLock;
        29: lload_2
        30: invokevirtual #122                // Method java/util/concurrent/locks/StampedLock.unlockWrite:(J)V
        33: return
        34: astore        4
        36: aload         4
        38: invokevirtual #155                // Method ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$DynamicObject.getNodeIds:()[I
        41: astore        5
        43: iconst_0
        44: istore        6
        46: iconst_0
        47: istore        7
        49: aload         5
        51: arraylength
        52: istore        8
        54: iload         7
        56: iload         8
        58: if_icmpge     89
        61: aload         5
        63: iload         7
        65: iaload
        66: istore        9
        68: iload         9
        70: istore        10
        72: iconst_0
        73: istore        11
        75: aload_0
        76: iload         10
        78: invokevirtual #157                // Method unblockNode:(I)Z
        81: pop
        82: nop
        83: iinc          7, 1
        86: goto          54
        89: nop
        90: aload_0
        91: getfield      #39                 // Field coordLock:Ljava/util/concurrent/locks/StampedLock;
        94: lload_2
        95: invokevirtual #122                // Method java/util/concurrent/locks/StampedLock.unlockWrite:(J)V
        98: goto          114
       101: astore        4
       103: aload_0
       104: getfield      #39                 // Field coordLock:Ljava/util/concurrent/locks/StampedLock;
       107: lload_2
       108: invokevirtual #122                // Method java/util/concurrent/locks/StampedLock.unlockWrite:(J)V
       111: aload         4
       113: athrow
       114: return
      Exception table:
         from    to  target type
             8    25   101   any
            34    90   101   any
           101   103   101   any
      StackMapTable: number_of_entries = 5
        frame_type = 255 /* full_frame */
          offset_delta = 34
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer, class java/lang/String, long ]
          stack = [ class ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$DynamicObject ]
        frame_type = 255 /* full_frame */
          offset_delta = 19
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer, class java/lang/String, long, class ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$DynamicObject, class "[I", int, int, int ]
          stack = []
        frame_type = 34 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 11
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer, class java/lang/String, long ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 12
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer, class java/lang/String, long, class ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$DynamicObject, class "[I", int, int, int ]
          stack = []
      LineNumberTable:
        line 100: 0
        line 101: 8
        line 102: 9
        line 105: 25
        line 102: 33
        line 103: 36
        line 242: 46
        line 103: 75
        line 242: 82
        line 243: 89
        line 105: 90
        line 106: 98
        line 105: 101
        line 107: 114
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           75       7    11 $i$a$-forEach-DynamicObstacleLayer$unregisterObject$1   I
           72      10    10    it   I
           68      15     9 element$iv   I
           46      44     6 $i$f$forEach   I
           43      47     5 $this$forEach$iv   [I
           36      54     4   obj   Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$DynamicObject;
            8     107     2 stamp   J
            0     115     0  this   Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer;
            0     115     1 objectId   Ljava/lang/String;
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #55()
          org.jetbrains.annotations.NotNull

  public final boolean toggleObject(java.lang.String);
    descriptor: (Ljava/lang/String;)Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=9, locals=12, args_size=2
         0: aload_0
         1: getfield      #39                 // Field coordLock:Ljava/util/concurrent/locks/StampedLock;
         4: invokevirtual #105                // Method java/util/concurrent/locks/StampedLock.writeLock:()J
         7: lstore_2
         8: nop
         9: aload_0
        10: getfield      #32                 // Field activeObjects:Ljava/util/concurrent/ConcurrentHashMap;
        13: aload_1
        14: invokevirtual #164                // Method java/util/concurrent/ConcurrentHashMap.get:(Ljava/lang/Object;)Ljava/lang/Object;
        17: checkcast     #111                // class ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$DynamicObject
        20: dup
        21: ifnonnull     39
        24: pop
        25: iconst_0
        26: istore        6
        28: aload_0
        29: getfield      #39                 // Field coordLock:Ljava/util/concurrent/locks/StampedLock;
        32: lload_2
        33: invokevirtual #122                // Method java/util/concurrent/locks/StampedLock.unlockWrite:(J)V
        36: iload         6
        38: ireturn
        39: astore        4
        41: aload         4
        43: invokevirtual #168                // Method ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$DynamicObject.getBlocked:()Z
        46: ifeq          132
        49: aload         4
        51: invokevirtual #155                // Method ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$DynamicObject.getNodeIds:()[I
        54: astore        5
        56: iconst_0
        57: istore        6
        59: iconst_0
        60: istore        7
        62: aload         5
        64: arraylength
        65: istore        8
        67: iload         7
        69: iload         8
        71: if_icmpge     102
        74: aload         5
        76: iload         7
        78: iaload
        79: istore        9
        81: iload         9
        83: istore        10
        85: iconst_0
        86: istore        11
        88: aload_0
        89: iload         10
        91: invokevirtual #157                // Method unblockNode:(I)Z
        94: pop
        95: nop
        96: iinc          7, 1
        99: goto          67
       102: nop
       103: aload_0
       104: getfield      #32                 // Field activeObjects:Ljava/util/concurrent/ConcurrentHashMap;
       107: checkcast     #109                // class java/util/Map
       110: aload_1
       111: aload         4
       113: aconst_null
       114: aconst_null
       115: aconst_null
       116: iconst_0
       117: bipush        7
       119: aconst_null
       120: invokestatic  #172                // Method ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$DynamicObject.copy$default:(Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$DynamicObject;Ljava/lang/String;[ILext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$ObjectType;ZILjava/lang/Object;)Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$DynamicObject;
       123: invokeinterface #118,  3          // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
       128: pop
       129: goto          212
       132: aload         4
       134: invokevirtual #155                // Method ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$DynamicObject.getNodeIds:()[I
       137: astore        5
       139: iconst_0
       140: istore        6
       142: iconst_0
       143: istore        7
       145: aload         5
       147: arraylength
       148: istore        8
       150: iload         7
       152: iload         8
       154: if_icmpge     185
       157: aload         5
       159: iload         7
       161: iaload
       162: istore        9
       164: iload         9
       166: istore        10
       168: iconst_0
       169: istore        11
       171: aload_0
       172: iload         10
       174: invokevirtual #107                // Method blockNode:(I)Z
       177: pop
       178: nop
       179: iinc          7, 1
       182: goto          150
       185: nop
       186: aload_0
       187: getfield      #32                 // Field activeObjects:Ljava/util/concurrent/ConcurrentHashMap;
       190: checkcast     #109                // class java/util/Map
       193: aload_1
       194: aload         4
       196: aconst_null
       197: aconst_null
       198: aconst_null
       199: iconst_1
       200: bipush        7
       202: aconst_null
       203: invokestatic  #172                // Method ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$DynamicObject.copy$default:(Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$DynamicObject;Ljava/lang/String;[ILext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$ObjectType;ZILjava/lang/Object;)Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$DynamicObject;
       206: invokeinterface #118,  3          // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
       211: pop
       212: iconst_1
       213: istore        5
       215: aload_0
       216: getfield      #39                 // Field coordLock:Ljava/util/concurrent/locks/StampedLock;
       219: lload_2
       220: invokevirtual #122                // Method java/util/concurrent/locks/StampedLock.unlockWrite:(J)V
       223: iload         5
       225: ireturn
       226: astore        5
       228: aload_0
       229: getfield      #39                 // Field coordLock:Ljava/util/concurrent/locks/StampedLock;
       232: lload_2
       233: invokevirtual #122                // Method java/util/concurrent/locks/StampedLock.unlockWrite:(J)V
       236: aload         5
       238: athrow
      Exception table:
         from    to  target type
             8    28   226   any
            39   215   226   any
           226   228   226   any
      StackMapTable: number_of_entries = 8
        frame_type = 255 /* full_frame */
          offset_delta = 39
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer, class java/lang/String, long ]
          stack = [ class ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$DynamicObject ]
        frame_type = 255 /* full_frame */
          offset_delta = 27
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer, class java/lang/String, long, class ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$DynamicObject, class "[I", int, int, int ]
          stack = []
        frame_type = 34 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 29
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer, class java/lang/String, long, class ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$DynamicObject ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 17
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer, class java/lang/String, long, class ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$DynamicObject, class "[I", int, int, int ]
          stack = []
        frame_type = 34 /* same */
        frame_type = 26 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer, class java/lang/String, long ]
          stack = [ class java/lang/Throwable ]
      LineNumberTable:
        line 110: 0
        line 111: 8
        line 112: 9
        line 124: 28
        line 112: 38
        line 114: 41
        line 115: 49
        line 244: 59
        line 115: 88
        line 244: 95
        line 245: 102
        line 116: 103
        line 118: 132
        line 246: 142
        line 118: 171
        line 246: 178
        line 247: 185
        line 119: 186
        line 122: 212
        line 124: 215
        line 122: 225
        line 124: 226
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           88       7    11 $i$a$-forEach-DynamicObstacleLayer$toggleObject$1   I
           85      10    10    it   I
           81      15     9 element$iv   I
           59      44     6 $i$f$forEach   I
           56      47     5 $this$forEach$iv   [I
          171       7    11 $i$a$-forEach-DynamicObstacleLayer$toggleObject$2   I
          168      10    10    it   I
          164      15     9 element$iv   I
          142      44     6 $i$f$forEach   I
          139      47     5 $this$forEach$iv   [I
           41     174     4   obj   Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$DynamicObject;
          223       3     4   obj   Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$DynamicObject;
            8     231     2 stamp   J
            0     239     0  this   Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer;
            0     239     1 objectId   Ljava/lang/String;
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #55()
          org.jetbrains.annotations.NotNull

  public final java.util.Map<java.lang.String, ext.mods.gameserver.geoengine.pathfinding.dynamic.DynamicObstacleLayer$DynamicObject> getObjectStates();
    descriptor: ()Ljava/util/Map;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=3, locals=8, args_size=1
         0: aload_0
         1: getfield      #39                 // Field coordLock:Ljava/util/concurrent/locks/StampedLock;
         4: invokevirtual #180                // Method java/util/concurrent/locks/StampedLock.tryOptimisticRead:()J
         7: lstore_1
         8: aload_0
         9: getfield      #32                 // Field activeObjects:Ljava/util/concurrent/ConcurrentHashMap;
        12: checkcast     #109                // class java/util/Map
        15: invokestatic  #186                // Method kotlin/collections/MapsKt.toMap:(Ljava/util/Map;)Ljava/util/Map;
        18: astore_3
        19: aload_0
        20: getfield      #39                 // Field coordLock:Ljava/util/concurrent/locks/StampedLock;
        23: lload_1
        24: invokevirtual #190                // Method java/util/concurrent/locks/StampedLock.validate:(J)Z
        27: ifne          78
        30: aload_0
        31: getfield      #39                 // Field coordLock:Ljava/util/concurrent/locks/StampedLock;
        34: invokevirtual #193                // Method java/util/concurrent/locks/StampedLock.readLock:()J
        37: lstore        4
        39: nop
        40: aload_0
        41: getfield      #32                 // Field activeObjects:Ljava/util/concurrent/ConcurrentHashMap;
        44: checkcast     #109                // class java/util/Map
        47: invokestatic  #186                // Method kotlin/collections/MapsKt.toMap:(Ljava/util/Map;)Ljava/util/Map;
        50: astore        6
        52: aload_0
        53: getfield      #39                 // Field coordLock:Ljava/util/concurrent/locks/StampedLock;
        56: lload         4
        58: invokevirtual #196                // Method java/util/concurrent/locks/StampedLock.unlockRead:(J)V
        61: aload         6
        63: areturn
        64: astore        7
        66: aload_0
        67: getfield      #39                 // Field coordLock:Ljava/util/concurrent/locks/StampedLock;
        70: lload         4
        72: invokevirtual #196                // Method java/util/concurrent/locks/StampedLock.unlockRead:(J)V
        75: aload         7
        77: athrow
        78: aload_3
        79: areturn
      Exception table:
         from    to  target type
            39    52    64   any
            64    66    64   any
      StackMapTable: number_of_entries = 2
        frame_type = 255 /* full_frame */
          offset_delta = 64
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer, long, class java/util/Map, long ]
          stack = [ class java/lang/Throwable ]
        frame_type = 250 /* chop */
          offset_delta = 13
      LineNumberTable:
        line 129: 0
        line 130: 8
        line 131: 19
        line 132: 30
        line 133: 39
        line 134: 40
        line 136: 52
        line 134: 63
        line 136: 64
        line 139: 78
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           39      39     4 newStamp   J
            8      72     1 stamp   J
           19      61     3  copy   Ljava/util/Map;
            0      80     0  this   Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer;
    Signature: #177                         // ()Ljava/util/Map<Ljava/lang/String;Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$DynamicObject;>;
    RuntimeInvisibleAnnotations:
      0: #55()
        org.jetbrains.annotations.NotNull

  public final void clearAll();
    descriptor: ()V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=4, locals=5, args_size=1
         0: aload_0
         1: getfield      #39                 // Field coordLock:Ljava/util/concurrent/locks/StampedLock;
         4: invokevirtual #105                // Method java/util/concurrent/locks/StampedLock.writeLock:()J
         7: lstore_1
         8: nop
         9: iconst_0
        10: istore_3
        11: aload_0
        12: getfield      #25                 // Field blockedBits:Ljava/util/concurrent/atomic/AtomicLongArray;
        15: invokevirtual #204                // Method java/util/concurrent/atomic/AtomicLongArray.length:()I
        18: istore        4
        20: iload_3
        21: iload         4
        23: if_icmpge     41
        26: aload_0
        27: getfield      #25                 // Field blockedBits:Ljava/util/concurrent/atomic/AtomicLongArray;
        30: iload_3
        31: lconst_0
        32: invokevirtual #208                // Method java/util/concurrent/atomic/AtomicLongArray.set:(IJ)V
        35: iinc          3, 1
        38: goto          20
        41: aload_0
        42: getfield      #32                 // Field activeObjects:Ljava/util/concurrent/ConcurrentHashMap;
        45: invokevirtual #211                // Method java/util/concurrent/ConcurrentHashMap.clear:()V
        48: aload_0
        49: getfield      #39                 // Field coordLock:Ljava/util/concurrent/locks/StampedLock;
        52: lload_1
        53: invokevirtual #122                // Method java/util/concurrent/locks/StampedLock.unlockWrite:(J)V
        56: goto          70
        59: astore_3
        60: aload_0
        61: getfield      #39                 // Field coordLock:Ljava/util/concurrent/locks/StampedLock;
        64: lload_1
        65: invokevirtual #122                // Method java/util/concurrent/locks/StampedLock.unlockWrite:(J)V
        68: aload_3
        69: athrow
        70: return
      Exception table:
         from    to  target type
             8    48    59   any
            59    60    59   any
      StackMapTable: number_of_entries = 4
        frame_type = 254 /* append */
          offset_delta = 20
          locals = [ long, int, int ]
        frame_type = 20 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 17
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer, long ]
          stack = [ class java/lang/Throwable ]
        frame_type = 253 /* append */
          offset_delta = 10
          locals = [ int, int ]
      LineNumberTable:
        line 143: 0
        line 144: 8
        line 145: 9
        line 146: 26
        line 145: 35
        line 148: 41
        line 150: 48
        line 151: 56
        line 150: 59
        line 152: 70
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           11      30     3     i   I
            8      63     1 stamp   J
            0      71     0  this   Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer;

  public final ext.mods.gameserver.geoengine.pathfinding.dynamic.DynamicObstacleLayer$LayerStats getStats();
    descriptor: ()Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$LayerStats;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=11, locals=4, args_size=1
         0: iconst_0
         1: istore_1
         2: iconst_0
         3: istore_2
         4: aload_0
         5: getfield      #25                 // Field blockedBits:Ljava/util/concurrent/atomic/AtomicLongArray;
         8: invokevirtual #204                // Method java/util/concurrent/atomic/AtomicLongArray.length:()I
        11: istore_3
        12: iload_2
        13: iload_3
        14: if_icmpge     37
        17: iload_1
        18: aload_0
        19: getfield      #25                 // Field blockedBits:Ljava/util/concurrent/atomic/AtomicLongArray;
        22: iload_2
        23: invokevirtual #50                 // Method java/util/concurrent/atomic/AtomicLongArray.get:(I)J
        26: invokestatic  #220                // Method java/lang/Long.bitCount:(J)I
        29: iadd
        30: istore_1
        31: iinc          2, 1
        34: goto          12
        37: new           #222                // class ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$LayerStats
        40: dup
        41: aload_0
        42: getfield      #13                 // Field totalNodes:I
        45: iload_1
        46: aload_0
        47: getfield      #32                 // Field activeObjects:Ljava/util/concurrent/ConcurrentHashMap;
        50: invokevirtual #225                // Method java/util/concurrent/ConcurrentHashMap.size:()I
        53: aload_0
        54: getfield      #25                 // Field blockedBits:Ljava/util/concurrent/atomic/AtomicLongArray;
        57: invokevirtual #204                // Method java/util/concurrent/atomic/AtomicLongArray.length:()I
        60: i2l
        61: ldc2_w        #226                // long 8l
        64: lmul
        65: aload_0
        66: getfield      #32                 // Field activeObjects:Ljava/util/concurrent/ConcurrentHashMap;
        69: invokevirtual #225                // Method java/util/concurrent/ConcurrentHashMap.size:()I
        72: i2l
        73: ldc2_w        #228                // long 64l
        76: lmul
        77: ladd
        78: invokespecial #232                // Method ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$LayerStats."<init>":(IIIJ)V
        81: areturn
      StackMapTable: number_of_entries = 2
        frame_type = 254 /* append */
          offset_delta = 12
          locals = [ int, int, int ]
        frame_type = 24 /* same */
      LineNumberTable:
        line 155: 0
        line 156: 2
        line 157: 17
        line 157: 29
        line 156: 31
        line 160: 37
        line 161: 41
        line 162: 45
        line 163: 46
        line 164: 53
        line 160: 78
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            4      33     2     i   I
            2      80     1 blockedCount   I
            0      82     0  this   Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer;
    RuntimeInvisibleAnnotations:
      0: #55()
        org.jetbrains.annotations.NotNull
}
InnerClasses:
  public static final #249= #111 of #2;   // DynamicObject=class ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$DynamicObject of class ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer
  public static final #251= #222 of #2;   // LayerStats=class ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$LayerStats of class ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer
  public static final #250= #137 of #2;   // ObjectType=class ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$ObjectType of class ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer
SourceFile: "DynamicObstacleLayer.kt"
SourceDebugExtension:
  SMAP
  DynamicObstacleLayer.kt
  Kotlin
  *S Kotlin
  *F
  + 1 DynamicObstacleLayer.kt
  ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer
  + 2 fake.kt
  kotlin/jvm/internal/FakeKt
  + 3 _Arrays.kt
  kotlin/collections/ArraysKt___ArraysKt
  *L
  1#1,238:1
  1#2:239
  14081#3,2:240
  14081#3,2:242
  14081#3,2:244
  14081#3,2:246
  *S KotlinDebug
  *F
  + 1 DynamicObstacleLayer.kt
  ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer
  *L
  86#1:240,2
  103#1:242,2
  115#1:244,2
  118#1:246,2
  *E
RuntimeVisibleAnnotations:
  0: #235(#236=[I#237,I#238,I#239],#240=I#241,#242=I#243,#244=[s#245],#246=[s#41,s#247,s#10,s#247,s#14,s#5,s#6,s#22,s#23,s#29,s#30,s#247,s#160,s#36,s#37,s#45,s#247,s#53,s#58,s#59,s#60,s#61,s#91,s#96,s#98,s#247,s#100,s#247,s#129,s#131,s#132,s#147,s#161,s#175,s#247,s#200,s#213,s#248,s#249,s#250,s#251,s#252])
    kotlin.Metadata(
      mv=[2,3,0]
      k=1
      xi=48
      d1=["\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0003&\'(B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0003J\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0003J\u000e\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0003J\u000e\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0003J\u000e\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0019J \u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001d\u001a\u00020\u001eJ\u000e\u0010\u001f\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u000bJ\u000e\u0010 \u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u000bJ\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\"J\u0006\u0010#\u001a\u00020\u001bJ\u0006\u0010$\u001a\u00020%R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006)"]
      d2=["Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer;","","totalNodes","","chunkSize","<init>","(II)V","blockedBits","Ljava/util/concurrent/atomic/AtomicLongArray;","activeObjects","Ljava/util/concurrent/ConcurrentHashMap;","","Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$DynamicObject;","coordLock","Ljava/util/concurrent/locks/StampedLock;","isBlocked","","nodeId","geo","Lext/mods/gameserver/geoengine/pathfinding/model/GeoLocation;","nodeIdInRegion","blockNode","unblockNode","isPathClear","nodeIds","","registerObject","","objectId","objectType","Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$ObjectType;","unregisterObject","toggleObject","getObjectStates","","clearAll","getStats","Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$LayerStats;","DynamicObject","ObjectType","LayerStats","Brproject"]
    )
RuntimeInvisibleAnnotations:
  0: #254(#255=[s#256])
    kotlin.jvm.internal.SourceDebugExtension(
      value=["SMAP\nDynamicObstacleLayer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DynamicObstacleLayer.kt\next/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,238:1\n1#2:239\n14081#3,2:240\n14081#3,2:242\n14081#3,2:244\n14081#3,2:246\n*S KotlinDebug\n*F\n+ 1 DynamicObstacleLayer.kt\next/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer\n*L\n86#1:240,2\n103#1:242,2\n115#1:244,2\n118#1:246,2\n*E\n"]
    )
BootstrapMethods:
  0: #70 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #63 NodeId fora de bounds: \u0001
