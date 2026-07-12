// Bytecode for: ext.mods.gameserver.geoengine.pathfinding.SmoothObstacleAvoidance
// File: ext\mods\gameserver\geoengine\pathfinding\SmoothObstacleAvoidance.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/geoengine/pathfinding/SmoothObstacleAvoidance.class
  Last modified 9 de jul de 2026; size 18338 bytes
  MD5 checksum 0a4f6422a74c58d7d9a7021960bdf58e
  Compiled from "SmoothObstacleAvoidance.kt"
public final class ext.mods.gameserver.geoengine.pathfinding.SmoothObstacleAvoidance
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #2                          // ext/mods/gameserver/geoengine/pathfinding/SmoothObstacleAvoidance
  super_class: #4                         // java/lang/Object
  interfaces: 0, fields: 17, methods: 19, attributes: 6
Constant pool:
    #1 = Utf8               ext/mods/gameserver/geoengine/pathfinding/SmoothObstacleAvoidance
    #2 = Class              #1            // ext/mods/gameserver/geoengine/pathfinding/SmoothObstacleAvoidance
    #3 = Utf8               java/lang/Object
    #4 = Class              #3            // java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = NameAndType        #5:#6         // "<init>":()V
    #8 = Methodref          #4.#7         // java/lang/Object."<init>":()V
    #9 = Utf8               this
   #10 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/SmoothObstacleAvoidance;
   #11 = Utf8               getInstance
   #12 = Utf8               ()Lext/mods/gameserver/geoengine/pathfinding/SmoothObstacleAvoidance;
   #13 = Utf8               Lkotlin/jvm/JvmStatic;
   #14 = Utf8               Lorg/jetbrains/annotations/NotNull;
   #15 = Utf8               INSTANCE
   #16 = NameAndType        #15:#10       // INSTANCE:Lext/mods/gameserver/geoengine/pathfinding/SmoothObstacleAvoidance;
   #17 = Fieldref           #2.#16        // ext/mods/gameserver/geoengine/pathfinding/SmoothObstacleAvoidance.INSTANCE:Lext/mods/gameserver/geoengine/pathfinding/SmoothObstacleAvoidance;
   #18 = Utf8               createSmoothPath
   #19 = Utf8               (Ljava/util/List;Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Ljava/util/List;
   #20 = Utf8               (Ljava/util/List<+Lext/mods/gameserver/model/location/Location;>;Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Ljava/util/List<Lext/mods/gameserver/model/location/Location;>;
   #21 = Utf8               Lorg/jetbrains/annotations/Nullable;
   #22 = Utf8               ext/mods/Config
   #23 = Class              #22           // ext/mods/Config
   #24 = Utf8               ENABLE_SMOOTH_OBSTACLE_AVOIDANCE
   #25 = Utf8               Z
   #26 = NameAndType        #24:#25       // ENABLE_SMOOTH_OBSTACLE_AVOIDANCE:Z
   #27 = Fieldref           #23.#26       // ext/mods/Config.ENABLE_SMOOTH_OBSTACLE_AVOIDANCE:Z
   #28 = Utf8               java/util/List
   #29 = Class              #28           // java/util/List
   #30 = Utf8               isEmpty
   #31 = Utf8               ()Z
   #32 = NameAndType        #30:#31       // isEmpty:()Z
   #33 = InterfaceMethodref #29.#32       // java/util/List.isEmpty:()Z
   #34 = Utf8               size
   #35 = Utf8               ()I
   #36 = NameAndType        #34:#35       // size:()I
   #37 = InterfaceMethodref #29.#36       // java/util/List.size:()I
   #38 = Utf8               java/util/ArrayList
   #39 = Class              #38           // java/util/ArrayList
   #40 = Utf8               (I)V
   #41 = NameAndType        #5:#40        // "<init>":(I)V
   #42 = Methodref          #39.#41       // java/util/ArrayList."<init>":(I)V
   #43 = Utf8               get
   #44 = Utf8               (I)Ljava/lang/Object;
   #45 = NameAndType        #43:#44       // get:(I)Ljava/lang/Object;
   #46 = InterfaceMethodref #29.#45       // java/util/List.get:(I)Ljava/lang/Object;
   #47 = Utf8               add
   #48 = Utf8               (Ljava/lang/Object;)Z
   #49 = NameAndType        #47:#48       // add:(Ljava/lang/Object;)Z
   #50 = Methodref          #39.#49       // java/util/ArrayList.add:(Ljava/lang/Object;)Z
   #51 = Utf8               java/util/HashSet
   #52 = Class              #51           // java/util/HashSet
   #53 = Methodref          #52.#41       // java/util/HashSet."<init>":(I)V
   #54 = Utf8               kotlin/ranges/RangesKt
   #55 = Class              #54           // kotlin/ranges/RangesKt
   #56 = Utf8               until
   #57 = Utf8               (II)Lkotlin/ranges/IntRange;
   #58 = NameAndType        #56:#57       // until:(II)Lkotlin/ranges/IntRange;
   #59 = Methodref          #55.#58       // kotlin/ranges/RangesKt.until:(II)Lkotlin/ranges/IntRange;
   #60 = Utf8               java/lang/Iterable
   #61 = Class              #60           // java/lang/Iterable
   #62 = Utf8               iterator
   #63 = Utf8               ()Ljava/util/Iterator;
   #64 = NameAndType        #62:#63       // iterator:()Ljava/util/Iterator;
   #65 = InterfaceMethodref #61.#64       // java/lang/Iterable.iterator:()Ljava/util/Iterator;
   #66 = Utf8               java/util/Iterator
   #67 = Class              #66           // java/util/Iterator
   #68 = Utf8               hasNext
   #69 = NameAndType        #68:#31       // hasNext:()Z
   #70 = InterfaceMethodref #67.#69       // java/util/Iterator.hasNext:()Z
   #71 = Utf8               kotlin/collections/IntIterator
   #72 = Class              #71           // kotlin/collections/IntIterator
   #73 = Utf8               nextInt
   #74 = NameAndType        #73:#35       // nextInt:()I
   #75 = Methodref          #72.#74       // kotlin/collections/IntIterator.nextInt:()I
   #76 = Utf8               ext/mods/gameserver/model/location/Location
   #77 = Class              #76           // ext/mods/gameserver/model/location/Location
   #78 = Utf8               distance3D
   #79 = Utf8               (Lext/mods/gameserver/model/location/Location;)D
   #80 = NameAndType        #78:#79       // distance3D:(Lext/mods/gameserver/model/location/Location;)D
   #81 = Methodref          #77.#80       // ext/mods/gameserver/model/location/Location.distance3D:(Lext/mods/gameserver/model/location/Location;)D
   #82 = Double             32.0d
   #84 = Methodref          #52.#49       // java/util/HashSet.add:(Ljava/lang/Object;)Z
   #85 = Utf8               smoothPathSegment
   #86 = Utf8               (Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Ljava/util/List;
   #87 = NameAndType        #85:#86       // smoothPathSegment:(Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Ljava/util/List;
   #88 = Methodref          #2.#87        // ext/mods/gameserver/geoengine/pathfinding/SmoothObstacleAvoidance.smoothPathSegment:(Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Ljava/util/List;
   #89 = Utf8               java/util/Collection
   #90 = Class              #89           // java/util/Collection
   #91 = InterfaceMethodref #90.#32       // java/util/Collection.isEmpty:()Z
   #92 = Utf8               next
   #93 = Utf8               ()Ljava/lang/Object;
   #94 = NameAndType        #92:#93       // next:()Ljava/lang/Object;
   #95 = InterfaceMethodref #67.#94       // java/util/Iterator.next:()Ljava/lang/Object;
   #96 = Utf8               contains
   #97 = NameAndType        #96:#48       // contains:(Ljava/lang/Object;)Z
   #98 = Methodref          #52.#97       // java/util/HashSet.contains:(Ljava/lang/Object;)Z
   #99 = Utf8               addAll
  #100 = Utf8               (Ljava/util/Collection;)Z
  #101 = NameAndType        #99:#100      // addAll:(Ljava/util/Collection;)Z
  #102 = Methodref          #39.#101      // java/util/ArrayList.addAll:(Ljava/util/Collection;)Z
  #103 = Methodref          #52.#101      // java/util/HashSet.addAll:(Ljava/util/Collection;)Z
  #104 = Utf8               kotlin/collections/CollectionsKt
  #105 = Class              #104          // kotlin/collections/CollectionsKt
  #106 = Utf8               last
  #107 = Utf8               (Ljava/util/List;)Ljava/lang/Object;
  #108 = NameAndType        #106:#107     // last:(Ljava/util/List;)Ljava/lang/Object;
  #109 = Methodref          #105.#108     // kotlin/collections/CollectionsKt.last:(Ljava/util/List;)Ljava/lang/Object;
  #110 = Utf8               DEVELOPER
  #111 = NameAndType        #110:#25      // DEVELOPER:Z
  #112 = Fieldref           #23.#111      // ext/mods/Config.DEVELOPER:Z
  #113 = Utf8               LOGGER
  #114 = Utf8               Lext/mods/commons/logging/CLogger;
  #115 = NameAndType        #113:#114     // LOGGER:Lext/mods/commons/logging/CLogger;
  #116 = Fieldref           #2.#115       // ext/mods/gameserver/geoengine/pathfinding/SmoothObstacleAvoidance.LOGGER:Lext/mods/commons/logging/CLogger;
  #117 = Utf8               SmoothObstacleAvoidance: Path smoothed from {} to {} points
  #118 = String             #117          // SmoothObstacleAvoidance: Path smoothed from {} to {} points
  #119 = Utf8               java/lang/Integer
  #120 = Class              #119          // java/lang/Integer
  #121 = Utf8               valueOf
  #122 = Utf8               (I)Ljava/lang/Integer;
  #123 = NameAndType        #121:#122     // valueOf:(I)Ljava/lang/Integer;
  #124 = Methodref          #120.#123     // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
  #125 = Methodref          #39.#36       // java/util/ArrayList.size:()I
  #126 = Utf8               ext/mods/commons/logging/CLogger
  #127 = Class              #126          // ext/mods/commons/logging/CLogger
  #128 = Utf8               debug
  #129 = Utf8               (Ljava/lang/Object;[Ljava/lang/Object;)V
  #130 = NameAndType        #128:#129     // debug:(Ljava/lang/Object;[Ljava/lang/Object;)V
  #131 = Methodref          #127.#130     // ext/mods/commons/logging/CLogger.debug:(Ljava/lang/Object;[Ljava/lang/Object;)V
  #132 = Utf8               $i$a$-any-SmoothObstacleAvoidance$createSmoothPath$1$1
  #133 = Utf8               I
  #134 = Utf8               it
  #135 = Utf8               Lext/mods/gameserver/model/location/Location;
  #136 = Utf8               element$iv
  #137 = Utf8               Ljava/lang/Object;
  #138 = Utf8               $i$f$any
  #139 = Utf8               $this$any$iv
  #140 = Utf8               Ljava/lang/Iterable;
  #141 = Utf8               smoothSegment
  #142 = Utf8               Ljava/util/List;
  #143 = Utf8               $i$a$-forEach-SmoothObstacleAvoidance$createSmoothPath$1
  #144 = Utf8               current
  #145 = Utf8               i
  #146 = Utf8               $i$f$forEach
  #147 = Utf8               $this$forEach$iv
  #148 = Utf8               smoothPath
  #149 = Utf8               Ljava/util/ArrayList;
  #150 = Utf8               pathSet
  #151 = Utf8               Ljava/util/HashSet;
  #152 = Utf8               originalPath
  #153 = Utf8               Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;
  #154 = Utf8               ext/mods/gameserver/network/serverpackets/ExServerPrimitive
  #155 = Class              #154          // ext/mods/gameserver/network/serverpackets/ExServerPrimitive
  #156 = Utf8               (Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Ljava/util/List<Lext/mods/gameserver/model/location/Location;>;
  #157 = Utf8               OBSTACLE_SMOOTHING_DISTANCE
  #158 = NameAndType        #157:#133     // OBSTACLE_SMOOTHING_DISTANCE:I
  #159 = Fieldref           #23.#158      // ext/mods/Config.OBSTACLE_SMOOTHING_DISTANCE:I
  #160 = Utf8               java/lang/Math
  #161 = Class              #160          // java/lang/Math
  #162 = Utf8               max
  #163 = Utf8               (II)I
  #164 = NameAndType        #162:#163     // max:(II)I
  #165 = Methodref          #161.#164     // java/lang/Math.max:(II)I
  #166 = Utf8               interpolateLocation
  #167 = Utf8               (Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;D)Lext/mods/gameserver/model/location/Location;
  #168 = NameAndType        #166:#167     // interpolateLocation:(Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;D)Lext/mods/gameserver/model/location/Location;
  #169 = Methodref          #2.#168       // ext/mods/gameserver/geoengine/pathfinding/SmoothObstacleAvoidance.interpolateLocation:(Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;D)Lext/mods/gameserver/model/location/Location;
  #170 = Utf8               applyObstacleAvoidance
  #171 = Utf8               (Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Lext/mods/gameserver/model/location/Location;
  #172 = NameAndType        #170:#171     // applyObstacleAvoidance:(Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Lext/mods/gameserver/model/location/Location;
  #173 = Methodref          #2.#172       // ext/mods/gameserver/geoengine/pathfinding/SmoothObstacleAvoidance.applyObstacleAvoidance:(Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Lext/mods/gameserver/model/location/Location;
  #174 = Utf8               ratio
  #175 = Utf8               D
  #176 = Utf8               interpolated
  #177 = Utf8               smoothedPoint
  #178 = Utf8               distance
  #179 = Utf8               steps
  #180 = Utf8               smoothed
  #181 = Utf8               stepInverse
  #182 = Utf8               start
  #183 = Utf8               end
  #184 = Utf8               isPointClear
  #185 = Utf8               (Lext/mods/gameserver/model/location/Location;)Z
  #186 = NameAndType        #184:#185     // isPointClear:(Lext/mods/gameserver/model/location/Location;)Z
  #187 = Methodref          #2.#186       // ext/mods/gameserver/geoengine/pathfinding/SmoothObstacleAvoidance.isPointClear:(Lext/mods/gameserver/model/location/Location;)Z
  #188 = Utf8               clone
  #189 = Utf8               ()Lext/mods/gameserver/model/location/Location;
  #190 = NameAndType        #188:#189     // clone:()Lext/mods/gameserver/model/location/Location;
  #191 = Methodref          #77.#190      // ext/mods/gameserver/model/location/Location.clone:()Lext/mods/gameserver/model/location/Location;
  #192 = Utf8               findBestAvoidancePoint
  #193 = Utf8               (Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;)Lext/mods/gameserver/model/location/Location;
  #194 = NameAndType        #192:#193     // findBestAvoidancePoint:(Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;)Lext/mods/gameserver/model/location/Location;
  #195 = Methodref          #2.#194       // ext/mods/gameserver/geoengine/pathfinding/SmoothObstacleAvoidance.findBestAvoidancePoint:(Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;)Lext/mods/gameserver/model/location/Location;
  #196 = Utf8               set
  #197 = Utf8               (Lext/mods/gameserver/model/location/Location;)V
  #198 = NameAndType        #196:#197     // set:(Lext/mods/gameserver/model/location/Location;)V
  #199 = Methodref          #77.#198      // ext/mods/gameserver/model/location/Location.set:(Lext/mods/gameserver/model/location/Location;)V
  #200 = Utf8               applySmoothingLevel
  #201 = NameAndType        #200:#193     // applySmoothingLevel:(Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;)Lext/mods/gameserver/model/location/Location;
  #202 = Methodref          #2.#201       // ext/mods/gameserver/geoengine/pathfinding/SmoothObstacleAvoidance.applySmoothingLevel:(Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;)Lext/mods/gameserver/model/location/Location;
  #203 = Utf8               java/awt/Color
  #204 = Class              #203          // java/awt/Color
  #205 = Utf8               GREEN
  #206 = Utf8               Ljava/awt/Color;
  #207 = NameAndType        #205:#206     // GREEN:Ljava/awt/Color;
  #208 = Fieldref           #204.#207     // java/awt/Color.GREEN:Ljava/awt/Color;
  #209 = Utf8               getX
  #210 = NameAndType        #209:#35      // getX:()I
  #211 = Methodref          #77.#210      // ext/mods/gameserver/model/location/Location.getX:()I
  #212 = Utf8               getY
  #213 = NameAndType        #212:#35      // getY:()I
  #214 = Methodref          #77.#213      // ext/mods/gameserver/model/location/Location.getY:()I
  #215 = Utf8               getZ
  #216 = NameAndType        #215:#35      // getZ:()I
  #217 = Methodref          #77.#216      // ext/mods/gameserver/model/location/Location.getZ:()I
  #218 = Utf8               addPoint
  #219 = Utf8               (Ljava/awt/Color;III)V
  #220 = NameAndType        #218:#219     // addPoint:(Ljava/awt/Color;III)V
  #221 = Methodref          #155.#220     // ext/mods/gameserver/network/serverpackets/ExServerPrimitive.addPoint:(Ljava/awt/Color;III)V
  #222 = Utf8               $i$a$-let-SmoothObstacleAvoidance$applyObstacleAvoidance$bestPoint$1
  #223 = Utf8               bestPointClone
  #224 = Utf8               bestPoint
  #225 = Utf8               finalPoint
  #226 = Utf8               point
  #227 = Utf8               calculateDirectionAngle
  #228 = Utf8               (Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;)D
  #229 = NameAndType        #227:#228     // calculateDirectionAngle:(Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;)D
  #230 = Methodref          #2.#229       // ext/mods/gameserver/geoengine/pathfinding/SmoothObstacleAvoidance.calculateDirectionAngle:(Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;)D
  #231 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
  #232 = MethodType         #231          //  (Ljava/lang/Object;)Ljava/lang/Object;
  #233 = Utf8               findBestAvoidancePoint$lambda$0
  #234 = NameAndType        #233:#122     // findBestAvoidancePoint$lambda$0:(I)Ljava/lang/Integer;
  #235 = Methodref          #2.#234       // ext/mods/gameserver/geoengine/pathfinding/SmoothObstacleAvoidance.findBestAvoidancePoint$lambda$0:(I)Ljava/lang/Integer;
  #236 = MethodHandle       6:#235        // REF_invokeStatic ext/mods/gameserver/geoengine/pathfinding/SmoothObstacleAvoidance.findBestAvoidancePoint$lambda$0:(I)Ljava/lang/Integer;
  #237 = Utf8               (Ljava/lang/Integer;)Ljava/lang/Integer;
  #238 = MethodType         #237          //  (Ljava/lang/Integer;)Ljava/lang/Integer;
  #239 = Utf8               java/lang/invoke/LambdaMetafactory
  #240 = Class              #239          // java/lang/invoke/LambdaMetafactory
  #241 = Utf8               metafactory
  #242 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #243 = NameAndType        #241:#242     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #244 = Methodref          #240.#243     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #245 = MethodHandle       6:#244        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #246 = Utf8               invoke
  #247 = Utf8               ()Lkotlin/jvm/functions/Function1;
  #248 = NameAndType        #246:#247     // invoke:()Lkotlin/jvm/functions/Function1;
  #249 = InvokeDynamic      #0:#248       // #0:invoke:()Lkotlin/jvm/functions/Function1;
  #250 = Utf8               kotlin/sequences/SequencesKt
  #251 = Class              #250          // kotlin/sequences/SequencesKt
  #252 = Utf8               generateSequence
  #253 = Utf8               (Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Lkotlin/sequences/Sequence;
  #254 = NameAndType        #252:#253     // generateSequence:(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Lkotlin/sequences/Sequence;
  #255 = Methodref          #251.#254     // kotlin/sequences/SequencesKt.generateSequence:(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Lkotlin/sequences/Sequence;
  #256 = Utf8               findBestAvoidancePoint$lambda$1
  #257 = Utf8               (II)Z
  #258 = NameAndType        #256:#257     // findBestAvoidancePoint$lambda$1:(II)Z
  #259 = Methodref          #2.#258       // ext/mods/gameserver/geoengine/pathfinding/SmoothObstacleAvoidance.findBestAvoidancePoint$lambda$1:(II)Z
  #260 = MethodHandle       6:#259        // REF_invokeStatic ext/mods/gameserver/geoengine/pathfinding/SmoothObstacleAvoidance.findBestAvoidancePoint$lambda$1:(II)Z
  #261 = Utf8               (Ljava/lang/Integer;)Ljava/lang/Boolean;
  #262 = MethodType         #261          //  (Ljava/lang/Integer;)Ljava/lang/Boolean;
  #263 = Utf8               (I)Lkotlin/jvm/functions/Function1;
  #264 = NameAndType        #246:#263     // invoke:(I)Lkotlin/jvm/functions/Function1;
  #265 = InvokeDynamic      #1:#264       // #1:invoke:(I)Lkotlin/jvm/functions/Function1;
  #266 = Utf8               takeWhile
  #267 = Utf8               (Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)Lkotlin/sequences/Sequence;
  #268 = NameAndType        #266:#267     // takeWhile:(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)Lkotlin/sequences/Sequence;
  #269 = Methodref          #251.#268     // kotlin/sequences/SequencesKt.takeWhile:(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)Lkotlin/sequences/Sequence;
  #270 = Utf8               findBestAvoidancePoint$lambda$2
  #271 = Utf8               (DLext/mods/gameserver/model/location/Location;I)Lkotlin/sequences/Sequence;
  #272 = NameAndType        #270:#271     // findBestAvoidancePoint$lambda$2:(DLext/mods/gameserver/model/location/Location;I)Lkotlin/sequences/Sequence;
  #273 = Methodref          #2.#272       // ext/mods/gameserver/geoengine/pathfinding/SmoothObstacleAvoidance.findBestAvoidancePoint$lambda$2:(DLext/mods/gameserver/model/location/Location;I)Lkotlin/sequences/Sequence;
  #274 = MethodHandle       6:#273        // REF_invokeStatic ext/mods/gameserver/geoengine/pathfinding/SmoothObstacleAvoidance.findBestAvoidancePoint$lambda$2:(DLext/mods/gameserver/model/location/Location;I)Lkotlin/sequences/Sequence;
  #275 = Utf8               (Ljava/lang/Integer;)Lkotlin/sequences/Sequence;
  #276 = MethodType         #275          //  (Ljava/lang/Integer;)Lkotlin/sequences/Sequence;
  #277 = Utf8               (DLext/mods/gameserver/model/location/Location;)Lkotlin/jvm/functions/Function1;
  #278 = NameAndType        #246:#277     // invoke:(DLext/mods/gameserver/model/location/Location;)Lkotlin/jvm/functions/Function1;
  #279 = InvokeDynamic      #2:#278       // #2:invoke:(DLext/mods/gameserver/model/location/Location;)Lkotlin/jvm/functions/Function1;
  #280 = Utf8               flatMap
  #281 = NameAndType        #280:#267     // flatMap:(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)Lkotlin/sequences/Sequence;
  #282 = Methodref          #251.#281     // kotlin/sequences/SequencesKt.flatMap:(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)Lkotlin/sequences/Sequence;
  #283 = Utf8               kotlin/sequences/Sequence
  #284 = Class              #283          // kotlin/sequences/Sequence
  #285 = InterfaceMethodref #284.#64      // kotlin/sequences/Sequence.iterator:()Ljava/util/Iterator;
  #286 = Utf8               isPointReachable
  #287 = Utf8               (Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;)Z
  #288 = NameAndType        #286:#287     // isPointReachable:(Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;)Z
  #289 = Methodref          #2.#288       // ext/mods/gameserver/geoengine/pathfinding/SmoothObstacleAvoidance.isPointReachable:(Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;)Z
  #290 = Utf8               $i$a$-firstOrNull-SmoothObstacleAvoidance$findBestAvoidancePoint$4
  #291 = Utf8               testPoint
  #292 = Utf8               $i$f$firstOrNull
  #293 = Utf8               $this$firstOrNull$iv
  #294 = Utf8               Lkotlin/sequences/Sequence;
  #295 = Utf8               smoothingDistance
  #296 = Utf8               angle
  #297 = Utf8               blockedPoint
  #298 = Utf8               PATHFINDING_SMOOTHING_LEVEL
  #299 = NameAndType        #298:#133     // PATHFINDING_SMOOTHING_LEVEL:I
  #300 = Fieldref           #23.#299      // ext/mods/Config.PATHFINDING_SMOOTHING_LEVEL:I
  #301 = Double             10.0d
  #303 = Utf8               (III)V
  #304 = NameAndType        #5:#303       // "<init>":(III)V
  #305 = Methodref          #77.#304      // ext/mods/gameserver/model/location/Location."<init>":(III)V
  #306 = Utf8               smoothingFactor
  #307 = Utf8               directRatio
  #308 = Utf8               directX
  #309 = Utf8               directY
  #310 = Utf8               directZ
  #311 = Utf8               smoothedX
  #312 = Utf8               smoothedY
  #313 = Utf8               smoothedZ
  #314 = Utf8               smoothingLevel
  #315 = Utf8               geoEngine
  #316 = Utf8               Lext/mods/gameserver/geoengine/GeoEngine;
  #317 = NameAndType        #315:#316     // geoEngine:Lext/mods/gameserver/geoengine/GeoEngine;
  #318 = Fieldref           #2.#317       // ext/mods/gameserver/geoengine/pathfinding/SmoothObstacleAvoidance.geoEngine:Lext/mods/gameserver/geoengine/GeoEngine;
  #319 = Utf8               ext/mods/gameserver/geoengine/GeoEngine
  #320 = Class              #319          // ext/mods/gameserver/geoengine/GeoEngine
  #321 = Utf8               getNswe
  #322 = Utf8               (III)B
  #323 = NameAndType        #321:#322     // getNswe:(III)B
  #324 = Methodref          #320.#323     // ext/mods/gameserver/geoengine/GeoEngine.getNswe:(III)B
  #325 = Utf8               FLAG_ALL
  #326 = NameAndType        #325:#133     // FLAG_ALL:I
  #327 = Fieldref           #2.#326       // ext/mods/gameserver/geoengine/pathfinding/SmoothObstacleAvoidance.FLAG_ALL:I
  #328 = Utf8               java/lang/Boolean
  #329 = Class              #328          // java/lang/Boolean
  #330 = Utf8               FLAG_N
  #331 = NameAndType        #330:#133     // FLAG_N:I
  #332 = Fieldref           #2.#331       // ext/mods/gameserver/geoengine/pathfinding/SmoothObstacleAvoidance.FLAG_N:I
  #333 = Utf8               (Z)Ljava/lang/Boolean;
  #334 = NameAndType        #121:#333     // valueOf:(Z)Ljava/lang/Boolean;
  #335 = Methodref          #329.#334     // java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
  #336 = Utf8               FLAG_S
  #337 = NameAndType        #336:#133     // FLAG_S:I
  #338 = Fieldref           #2.#337       // ext/mods/gameserver/geoengine/pathfinding/SmoothObstacleAvoidance.FLAG_S:I
  #339 = Utf8               FLAG_E
  #340 = NameAndType        #339:#133     // FLAG_E:I
  #341 = Fieldref           #2.#340       // ext/mods/gameserver/geoengine/pathfinding/SmoothObstacleAvoidance.FLAG_E:I
  #342 = Utf8               FLAG_W
  #343 = NameAndType        #342:#133     // FLAG_W:I
  #344 = Fieldref           #2.#343       // ext/mods/gameserver/geoengine/pathfinding/SmoothObstacleAvoidance.FLAG_W:I
  #345 = Utf8               listOf
  #346 = Utf8               ([Ljava/lang/Object;)Ljava/util/List;
  #347 = NameAndType        #345:#346     // listOf:([Ljava/lang/Object;)Ljava/util/List;
  #348 = Methodref          #105.#347     // kotlin/collections/CollectionsKt.listOf:([Ljava/lang/Object;)Ljava/util/List;
  #349 = Utf8               booleanValue
  #350 = NameAndType        #349:#31      // booleanValue:()Z
  #351 = Methodref          #329.#350     // java/lang/Boolean.booleanValue:()Z
  #352 = Utf8               throwCountOverflow
  #353 = NameAndType        #352:#6       // throwCountOverflow:()V
  #354 = Methodref          #105.#353     // kotlin/collections/CollectionsKt.throwCountOverflow:()V
  #355 = Utf8               $i$a$-count-SmoothObstacleAvoidance$isPointClear$freeDirs$1
  #356 = Utf8               $i$f$count
  #357 = Utf8               count$iv
  #358 = Utf8               $this$count$iv
  #359 = Utf8               freeDirs
  #360 = Utf8               nswe
  #361 = Utf8               B
  #362 = Utf8               nsweInt
  #363 = Utf8               [Ljava/lang/Boolean;
  #364 = Class              #363          // "[Ljava/lang/Boolean;"
  #365 = Utf8               canMoveToTarget
  #366 = Utf8               (IIIIII)Z
  #367 = NameAndType        #365:#366     // canMoveToTarget:(IIIIII)Z
  #368 = Methodref          #320.#367     // ext/mods/gameserver/geoengine/GeoEngine.canMoveToTarget:(IIIIII)Z
  #369 = Utf8               x
  #370 = Utf8               y
  #371 = Utf8               z
  #372 = Utf8               atan2
  #373 = Utf8               (DD)D
  #374 = NameAndType        #372:#373     // atan2:(DD)D
  #375 = Methodref          #161.#374     // java/lang/Math.atan2:(DD)D
  #376 = Utf8               dx
  #377 = Utf8               dy
  #378 = Utf8               calculateOffsetPoint
  #379 = Utf8               (Lext/mods/gameserver/model/location/Location;DI)Lext/mods/gameserver/model/location/Location;
  #380 = Utf8               cos
  #381 = Utf8               (D)D
  #382 = NameAndType        #380:#381     // cos:(D)D
  #383 = Methodref          #161.#382     // java/lang/Math.cos:(D)D
  #384 = Utf8               sin
  #385 = NameAndType        #384:#381     // sin:(D)D
  #386 = Methodref          #161.#385     // java/lang/Math.sin:(D)D
  #387 = Utf8               getHeight
  #388 = Utf8               (III)S
  #389 = NameAndType        #387:#388     // getHeight:(III)S
  #390 = Methodref          #320.#389     // ext/mods/gameserver/geoengine/GeoEngine.getHeight:(III)S
  #391 = Utf8               offsetX
  #392 = Utf8               offsetY
  #393 = Utf8               newX
  #394 = Utf8               newY
  #395 = Utf8               newZ
  #396 = Utf8               center
  #397 = Utf8               shouldAvoidObstacle
  #398 = Utf8               (Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;)Z
  #399 = Utf8               ENABLE_REAL_TIME_OBSTACLE_AVOIDANCE
  #400 = NameAndType        #399:#25      // ENABLE_REAL_TIME_OBSTACLE_AVOIDANCE:Z
  #401 = Fieldref           #23.#400      // ext/mods/Config.ENABLE_REAL_TIME_OBSTACLE_AVOIDANCE:Z
  #402 = Utf8               abs
  #403 = Utf8               (I)I
  #404 = NameAndType        #402:#403     // abs:(I)I
  #405 = Methodref          #161.#404     // java/lang/Math.abs:(I)I
  #406 = Utf8               OBSTACLE_DETECTION_DISTANCE
  #407 = NameAndType        #406:#133     // OBSTACLE_DETECTION_DISTANCE:I
  #408 = Fieldref           #23.#407      // ext/mods/Config.OBSTACLE_DETECTION_DISTANCE:I
  #409 = Utf8               kotlin/ranges/IntRange
  #410 = Class              #409          // kotlin/ranges/IntRange
  #411 = Utf8               (II)V
  #412 = NameAndType        #5:#411       // "<init>":(II)V
  #413 = Methodref          #410.#412     // kotlin/ranges/IntRange."<init>":(II)V
  #414 = Utf8               $i$a$-count-SmoothObstacleAvoidance$shouldAvoidObstacle$blockedCount$1
  #415 = Utf8               blockedCount
  #416 = Utf8               heightDiff
  #417 = Utf8               target
  #418 = Utf8               calculateAvoidanceDirection
  #419 = Utf8               (Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;)Lext/mods/gameserver/model/location/Location;
  #420 = Double             1.5707963267948966d
  #422 = NameAndType        #378:#379     // calculateOffsetPoint:(Lext/mods/gameserver/model/location/Location;DI)Lext/mods/gameserver/model/location/Location;
  #423 = Methodref          #2.#422       // ext/mods/gameserver/geoengine/pathfinding/SmoothObstacleAvoidance.calculateOffsetPoint:(Lext/mods/gameserver/model/location/Location;DI)Lext/mods/gameserver/model/location/Location;
  #424 = Utf8               perpendicularAngle1
  #425 = Utf8               perpendicularAngle2
  #426 = Utf8               option1
  #427 = Utf8               option2
  #428 = Utf8               findBestAvoidancePoint$lambda$2$0
  #429 = Utf8               (DLext/mods/gameserver/model/location/Location;ID)Lext/mods/gameserver/model/location/Location;
  #430 = Utf8               testAngle
  #431 = Utf8               $angle
  #432 = Utf8               $blockedPoint
  #433 = Utf8               $radius
  #434 = Utf8               angleOffsetRad
  #435 = Utf8               $smoothingDistance
  #436 = Utf8               ANGLE_OFFSETS
  #437 = NameAndType        #436:#142     // ANGLE_OFFSETS:Ljava/util/List;
  #438 = Fieldref           #2.#437       // ext/mods/gameserver/geoengine/pathfinding/SmoothObstacleAvoidance.ANGLE_OFFSETS:Ljava/util/List;
  #439 = Utf8               asSequence
  #440 = Utf8               (Ljava/lang/Iterable;)Lkotlin/sequences/Sequence;
  #441 = NameAndType        #439:#440     // asSequence:(Ljava/lang/Iterable;)Lkotlin/sequences/Sequence;
  #442 = Methodref          #105.#441     // kotlin/collections/CollectionsKt.asSequence:(Ljava/lang/Iterable;)Lkotlin/sequences/Sequence;
  #443 = NameAndType        #428:#429     // findBestAvoidancePoint$lambda$2$0:(DLext/mods/gameserver/model/location/Location;ID)Lext/mods/gameserver/model/location/Location;
  #444 = Methodref          #2.#443       // ext/mods/gameserver/geoengine/pathfinding/SmoothObstacleAvoidance.findBestAvoidancePoint$lambda$2$0:(DLext/mods/gameserver/model/location/Location;ID)Lext/mods/gameserver/model/location/Location;
  #445 = MethodHandle       6:#444        // REF_invokeStatic ext/mods/gameserver/geoengine/pathfinding/SmoothObstacleAvoidance.findBestAvoidancePoint$lambda$2$0:(DLext/mods/gameserver/model/location/Location;ID)Lext/mods/gameserver/model/location/Location;
  #446 = Utf8               (Ljava/lang/Double;)Lext/mods/gameserver/model/location/Location;
  #447 = MethodType         #446          //  (Ljava/lang/Double;)Lext/mods/gameserver/model/location/Location;
  #448 = Utf8               (DLext/mods/gameserver/model/location/Location;I)Lkotlin/jvm/functions/Function1;
  #449 = NameAndType        #246:#448     // invoke:(DLext/mods/gameserver/model/location/Location;I)Lkotlin/jvm/functions/Function1;
  #450 = InvokeDynamic      #3:#449       // #3:invoke:(DLext/mods/gameserver/model/location/Location;I)Lkotlin/jvm/functions/Function1;
  #451 = Utf8               map
  #452 = NameAndType        #451:#267     // map:(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)Lkotlin/sequences/Sequence;
  #453 = Methodref          #251.#452     // kotlin/sequences/SequencesKt.map:(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)Lkotlin/sequences/Sequence;
  #454 = Utf8               radius
  #455 = Utf8               <clinit>
  #456 = Methodref          #2.#7         // ext/mods/gameserver/geoengine/pathfinding/SmoothObstacleAvoidance."<init>":()V
  #457 = Utf8               java/lang/Class
  #458 = Class              #457          // java/lang/Class
  #459 = Utf8               getName
  #460 = Utf8               ()Ljava/lang/String;
  #461 = NameAndType        #459:#460     // getName:()Ljava/lang/String;
  #462 = Methodref          #458.#461     // java/lang/Class.getName:()Ljava/lang/String;
  #463 = Utf8               (Ljava/lang/String;)V
  #464 = NameAndType        #5:#463       // "<init>":(Ljava/lang/String;)V
  #465 = Methodref          #127.#464     // ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
  #466 = Utf8               Companion
  #467 = Utf8               Lext/mods/gameserver/geoengine/GeoEngine$Companion;
  #468 = NameAndType        #466:#467     // Companion:Lext/mods/gameserver/geoengine/GeoEngine$Companion;
  #469 = Fieldref           #320.#468     // ext/mods/gameserver/geoengine/GeoEngine.Companion:Lext/mods/gameserver/geoengine/GeoEngine$Companion;
  #470 = Utf8               ext/mods/gameserver/geoengine/GeoEngine$Companion
  #471 = Class              #470          // ext/mods/gameserver/geoengine/GeoEngine$Companion
  #472 = Utf8               ()Lext/mods/gameserver/geoengine/GeoEngine;
  #473 = NameAndType        #11:#472      // getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
  #474 = Methodref          #471.#473     // ext/mods/gameserver/geoengine/GeoEngine$Companion.getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
  #475 = Utf8               kotlin/ranges/IntProgression
  #476 = Class              #475          // kotlin/ranges/IntProgression
  #477 = Utf8               step
  #478 = Utf8               (Lkotlin/ranges/IntProgression;I)Lkotlin/ranges/IntProgression;
  #479 = NameAndType        #477:#478     // step:(Lkotlin/ranges/IntProgression;I)Lkotlin/ranges/IntProgression;
  #480 = Methodref          #55.#479      // kotlin/ranges/RangesKt.step:(Lkotlin/ranges/IntProgression;I)Lkotlin/ranges/IntProgression;
  #481 = Utf8               collectionSizeOrDefault
  #482 = Utf8               (Ljava/lang/Iterable;I)I
  #483 = NameAndType        #481:#482     // collectionSizeOrDefault:(Ljava/lang/Iterable;I)I
  #484 = Methodref          #105.#483     // kotlin/collections/CollectionsKt.collectionSizeOrDefault:(Ljava/lang/Iterable;I)I
  #485 = Utf8               toRadians
  #486 = NameAndType        #485:#381     // toRadians:(D)D
  #487 = Methodref          #161.#486     // java/lang/Math.toRadians:(D)D
  #488 = Utf8               java/lang/Double
  #489 = Class              #488          // java/lang/Double
  #490 = Utf8               (D)Ljava/lang/Double;
  #491 = NameAndType        #121:#490     // valueOf:(D)Ljava/lang/Double;
  #492 = Methodref          #489.#491     // java/lang/Double.valueOf:(D)Ljava/lang/Double;
  #493 = InterfaceMethodref #90.#49       // java/util/Collection.add:(Ljava/lang/Object;)Z
  #494 = Utf8               $i$a$-map-SmoothObstacleAvoidance$ANGLE_OFFSETS$1
  #495 = Utf8               item$iv$iv
  #496 = Utf8               $i$f$mapTo
  #497 = Utf8               $this$mapTo$iv$iv
  #498 = Utf8               destination$iv$iv
  #499 = Utf8               Ljava/util/Collection;
  #500 = Utf8               $i$f$map
  #501 = Utf8               $this$map$iv
  #502 = Utf8               MIN_PATH_SIZE
  #503 = Integer            3
  #504 = Utf8               MIN_SEGMENT_DISTANCE
  #505 = Utf8               MIN_STEPS
  #506 = Integer            2
  #507 = Utf8               STEP_SIZE
  #508 = Integer            16
  #509 = Utf8               ANGLE_STEP
  #510 = Integer            45
  #511 = Utf8               MAX_ANGLE
  #512 = Integer            360
  #513 = Utf8               MAX_HEIGHT_DIFF
  #514 = Integer            100
  #515 = Utf8               DISTANCE_CHECK_STEP
  #516 = Utf8               Ljava/util/List<Ljava/lang/Double;>;
  #517 = Utf8               Lkotlin/Metadata;
  #518 = Utf8               mv
  #519 = Integer            0
  #520 = Utf8               k
  #521 = Integer            1
  #522 = Utf8               xi
  #523 = Integer            48
  #524 = Utf8               d1
  #525 = Utf8               \u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\f\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\r\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0019\u001a\u00020\u0000H\u0007J$\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00182\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00182\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eJ(\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00182\u0006\u0010 \u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\u001b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0002J*\u0010\"\u001a\u00020\u001b2\u0006\u0010#\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\u001b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0002J\"\u0010$\u001a\u0004\u0018\u00010\u001b2\u0006\u0010%\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\u001bH\u0002J \u0010&\u001a\u00020\u001b2\u0006\u0010#\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\u001bH\u0002J\u0010\u0010\'\u001a\u00020(2\u0006\u0010#\u001a\u00020\u001bH\u0002J \u0010)\u001a\u00020(2\u0006\u0010#\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\u001bH\u0002J \u0010*\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\u001b2\u0006\u0010+\u001a\u00020\u000bH\u0002J\u0018\u0010,\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\u001bH\u0002J \u0010-\u001a\u00020\u001b2\u0006\u0010.\u001a\u00020\u001b2\u0006\u0010/\u001a\u00020\u000b2\u0006\u00100\u001a\u00020\tH\u0002J\u0016\u00101\u001a\u00020(2\u0006\u00102\u001a\u00020\u001b2\u0006\u00103\u001a\u00020\u001bJ\u0016\u00104\u001a\u00020\u001b2\u0006\u00102\u001a\u00020\u001b2\u0006\u00103\u001a\u00020\u001bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\tX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\tX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\tX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\tX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\tX\u0082D¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0018X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00065
  #526 = Utf8               d2
  #527 = Utf8
  #528 = Utf8               Brproject
  #529 = Utf8               SmoothObstacleAvoidance.kt
  #530 = Utf8               Lkotlin/jvm/internal/SourceDebugExtension;
  #531 = Utf8               value
  #532 = Utf8               SMAP\nSmoothObstacleAvoidance.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SmoothObstacleAvoidance.kt\next/mods/gameserver/geoengine/pathfinding/SmoothObstacleAvoidance\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,253:1\n1915#2:254\n1807#2,3:255\n1916#2:258\n1834#2,4:262\n1834#2,4:266\n1586#2:270\n1661#2,3:271\n1#3:259\n184#4,2:260\n*S KotlinDebug\n*F\n+ 1 SmoothObstacleAvoidance.kt\next/mods/gameserver/geoengine/pathfinding/SmoothObstacleAvoidance\n*L\n68#1:254\n81#1:255,3\n68#1:258\n181#1:262,4\n228#1:266,4\n54#1:270\n54#1:271,3\n144#1:260,2\n*E\n
  #533 = Utf8               RuntimeInvisibleAnnotations
  #534 = Utf8               ConstantValue
  #535 = Utf8               Signature
  #536 = Utf8               Code
  #537 = Utf8               LineNumberTable
  #538 = Utf8               LocalVariableTable
  #539 = Utf8               RuntimeVisibleAnnotations
  #540 = Utf8               StackMapTable
  #541 = Utf8               RuntimeInvisibleParameterAnnotations
  #542 = Utf8               InnerClasses
  #543 = Utf8               SourceFile
  #544 = Utf8               SourceDebugExtension
  #545 = Utf8               BootstrapMethods
{
  public static final ext.mods.gameserver.geoengine.pathfinding.SmoothObstacleAvoidance INSTANCE;
    descriptor: Lext/mods/gameserver/geoengine/pathfinding/SmoothObstacleAvoidance;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    RuntimeInvisibleAnnotations:
      0: #14()
        org.jetbrains.annotations.NotNull

  public static final ext.mods.gameserver.geoengine.pathfinding.SmoothObstacleAvoidance getInstance();
    descriptor: ()Lext/mods/gameserver/geoengine/pathfinding/SmoothObstacleAvoidance;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #17                 // Field INSTANCE:Lext/mods/gameserver/geoengine/pathfinding/SmoothObstacleAvoidance;
         3: areturn
      LineNumberTable:
        line 57: 0
    RuntimeVisibleAnnotations:
      0: #13()
        kotlin.jvm.JvmStatic
    RuntimeInvisibleAnnotations:
      0: #14()
        org.jetbrains.annotations.NotNull

  public final java.util.List<ext.mods.gameserver.model.location.Location> createSmoothPath(java.util.List<? extends ext.mods.gameserver.model.location.Location>, ext.mods.gameserver.network.serverpackets.ExServerPrimitive);
    descriptor: (Ljava/util/List;Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Ljava/util/List;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=5, locals=20, args_size=3
         0: nop
         1: getstatic     #27                 // Field ext/mods/Config.ENABLE_SMOOTH_OBSTACLE_AVOIDANCE:Z
         4: ifeq          16
         7: aload_1
         8: invokeinterface #33,  1           // InterfaceMethod java/util/List.isEmpty:()Z
        13: ifeq          20
        16: aload_1
        17: goto          411
        20: aload_1
        21: invokeinterface #37,  1           // InterfaceMethod java/util/List.size:()I
        26: iconst_3
        27: if_icmpge     34
        30: aload_1
        31: goto          411
        34: new           #39                 // class java/util/ArrayList
        37: dup
        38: aload_1
        39: invokeinterface #37,  1           // InterfaceMethod java/util/List.size:()I
        44: invokespecial #42                 // Method java/util/ArrayList."<init>":(I)V
        47: astore_3
        48: aload_3
        49: aload_1
        50: iconst_0
        51: invokeinterface #46,  2           // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
        56: invokevirtual #50                 // Method java/util/ArrayList.add:(Ljava/lang/Object;)Z
        59: pop
        60: new           #52                 // class java/util/HashSet
        63: dup
        64: aload_1
        65: invokeinterface #37,  1           // InterfaceMethod java/util/List.size:()I
        70: invokespecial #53                 // Method java/util/HashSet."<init>":(I)V
        73: astore        4
        75: iconst_1
        76: aload_1
        77: invokeinterface #37,  1           // InterfaceMethod java/util/List.size:()I
        82: iconst_1
        83: isub
        84: invokestatic  #59                 // Method kotlin/ranges/RangesKt.until:(II)Lkotlin/ranges/IntRange;
        87: checkcast     #61                 // class java/lang/Iterable
        90: astore        5
        92: iconst_0
        93: istore        6
        95: aload         5
        97: invokeinterface #65,  1           // InterfaceMethod java/lang/Iterable.iterator:()Ljava/util/Iterator;
       102: astore        7
       104: aload         7
       106: invokeinterface #70,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
       111: ifeq          351
       114: aload         7
       116: checkcast     #72                 // class kotlin/collections/IntIterator
       119: invokevirtual #75                 // Method kotlin/collections/IntIterator.nextInt:()I
       122: istore        8
       124: iload         8
       126: istore        9
       128: iconst_0
       129: istore        10
       131: aload_1
       132: iload         9
       134: invokeinterface #46,  2           // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
       139: checkcast     #77                 // class ext/mods/gameserver/model/location/Location
       142: astore        11
       144: aload_1
       145: iload         9
       147: iconst_1
       148: iadd
       149: invokeinterface #46,  2           // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
       154: checkcast     #77                 // class ext/mods/gameserver/model/location/Location
       157: astore        12
       159: nop
       160: aload         11
       162: aload         12
       164: invokevirtual #81                 // Method ext/mods/gameserver/model/location/Location.distance3D:(Lext/mods/gameserver/model/location/Location;)D
       167: ldc2_w        #82                 // double 32.0d
       170: dcmpg
       171: ifge          192
       174: aload_3
       175: aload         12
       177: invokevirtual #50                 // Method java/util/ArrayList.add:(Ljava/lang/Object;)Z
       180: pop
       181: aload         4
       183: aload         12
       185: invokevirtual #84                 // Method java/util/HashSet.add:(Ljava/lang/Object;)Z
       188: pop
       189: goto          346
       192: getstatic     #17                 // Field INSTANCE:Lext/mods/gameserver/geoengine/pathfinding/SmoothObstacleAvoidance;
       195: aload         11
       197: aload         12
       199: aload_2
       200: invokespecial #88                 // Method smoothPathSegment:(Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Ljava/util/List;
       203: astore        13
       205: nop
       206: aload         13
       208: invokeinterface #33,  1           // InterfaceMethod java/util/List.isEmpty:()Z
       213: ifne          346
       216: aload         13
       218: checkcast     #61                 // class java/lang/Iterable
       221: astore        14
       223: iconst_0
       224: istore        15
       226: aload         14
       228: instanceof    #90                 // class java/util/Collection
       231: ifeq          251
       234: aload         14
       236: checkcast     #90                 // class java/util/Collection
       239: invokeinterface #91,  1           // InterfaceMethod java/util/Collection.isEmpty:()Z
       244: ifeq          251
       247: iconst_0
       248: goto          304
       251: aload         14
       253: invokeinterface #65,  1           // InterfaceMethod java/lang/Iterable.iterator:()Ljava/util/Iterator;
       258: astore        16
       260: aload         16
       262: invokeinterface #70,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
       267: ifeq          303
       270: aload         16
       272: invokeinterface #95,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       277: astore        17
       279: aload         17
       281: checkcast     #77                 // class ext/mods/gameserver/model/location/Location
       284: astore        18
       286: iconst_0
       287: istore        19
       289: aload         4
       291: aload         18
       293: invokevirtual #98                 // Method java/util/HashSet.contains:(Ljava/lang/Object;)Z
       296: ifeq          260
       299: iconst_1
       300: goto          304
       303: iconst_0
       304: ifeq          325
       307: aload_3
       308: aload         12
       310: invokevirtual #50                 // Method java/util/ArrayList.add:(Ljava/lang/Object;)Z
       313: pop
       314: aload         4
       316: aload         12
       318: invokevirtual #84                 // Method java/util/HashSet.add:(Ljava/lang/Object;)Z
       321: pop
       322: goto          346
       325: aload_3
       326: aload         13
       328: checkcast     #90                 // class java/util/Collection
       331: invokevirtual #102                // Method java/util/ArrayList.addAll:(Ljava/util/Collection;)Z
       334: pop
       335: aload         4
       337: aload         13
       339: checkcast     #90                 // class java/util/Collection
       342: invokevirtual #103                // Method java/util/HashSet.addAll:(Ljava/util/Collection;)Z
       345: pop
       346: nop
       347: nop
       348: goto          104
       351: nop
       352: aload_3
       353: aload_1
       354: invokestatic  #109                // Method kotlin/collections/CollectionsKt.last:(Ljava/util/List;)Ljava/lang/Object;
       357: invokevirtual #50                 // Method java/util/ArrayList.add:(Ljava/lang/Object;)Z
       360: pop
       361: getstatic     #112                // Field ext/mods/Config.DEVELOPER:Z
       364: ifeq          407
       367: getstatic     #116                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       370: ldc           #118                // String SmoothObstacleAvoidance: Path smoothed from {} to {} points
       372: iconst_2
       373: anewarray     #4                  // class java/lang/Object
       376: astore        5
       378: aload         5
       380: iconst_0
       381: aload_1
       382: invokeinterface #37,  1           // InterfaceMethod java/util/List.size:()I
       387: invokestatic  #124                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       390: aastore
       391: aload         5
       393: iconst_1
       394: aload_3
       395: invokevirtual #125                // Method java/util/ArrayList.size:()I
       398: invokestatic  #124                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       401: aastore
       402: aload         5
       404: invokevirtual #131                // Method ext/mods/commons/logging/CLogger.debug:(Ljava/lang/Object;[Ljava/lang/Object;)V
       407: aload_3
       408: checkcast     #29                 // class java/util/List
       411: areturn
      StackMapTable: number_of_entries = 14
        frame_type = 16 /* same */
        frame_type = 3 /* same */
        frame_type = 13 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 69
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/SmoothObstacleAvoidance, class java/util/List, class ext/mods/gameserver/network/serverpackets/ExServerPrimitive, class java/util/ArrayList, class java/util/HashSet, class java/lang/Iterable, int, class java/util/Iterator ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 87
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/SmoothObstacleAvoidance, class java/util/List, class ext/mods/gameserver/network/serverpackets/ExServerPrimitive, class java/util/ArrayList, class java/util/HashSet, class java/lang/Iterable, int, class java/util/Iterator, int, int, int, class ext/mods/gameserver/model/location/Location, class ext/mods/gameserver/model/location/Location ]
          stack = []
        frame_type = 254 /* append */
          offset_delta = 58
          locals = [ class java/util/List, class java/lang/Iterable, int ]
        frame_type = 252 /* append */
          offset_delta = 8
          locals = [ class java/util/Iterator ]
        frame_type = 42 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/SmoothObstacleAvoidance, class java/util/List, class ext/mods/gameserver/network/serverpackets/ExServerPrimitive, class java/util/ArrayList, class java/util/HashSet, class java/lang/Iterable, int, class java/util/Iterator, int, int, int, class ext/mods/gameserver/model/location/Location, class ext/mods/gameserver/model/location/Location, class java/util/List, class java/lang/Iterable, int ]
          stack = [ int ]
        frame_type = 20 /* same */
        frame_type = 248 /* chop */
          offset_delta = 20
        frame_type = 255 /* full_frame */
          offset_delta = 4
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/SmoothObstacleAvoidance, class java/util/List, class ext/mods/gameserver/network/serverpackets/ExServerPrimitive, class java/util/ArrayList, class java/util/HashSet, class java/lang/Iterable, int, class java/util/Iterator ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 55
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/SmoothObstacleAvoidance, class java/util/List, class ext/mods/gameserver/network/serverpackets/ExServerPrimitive, class java/util/ArrayList, class java/util/HashSet, class java/lang/Object, int, class java/util/Iterator ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 3
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/SmoothObstacleAvoidance, class java/util/List, class ext/mods/gameserver/network/serverpackets/ExServerPrimitive ]
          stack = [ class java/util/List ]
      LineNumberTable:
        line 60: 0
        line 61: 1
        line 62: 20
        line 64: 34
        line 65: 48
        line 67: 60
        line 68: 75
        line 254: 95
        line 69: 131
        line 70: 144
        line 71: 159
        line 72: 160
        line 73: 174
        line 74: 181
        line 77: 192
        line 79: 205
        line 80: 206
        line 81: 216
        line 255: 226
        line 256: 251
        line 81: 289
        line 256: 296
        line 257: 303
        line 81: 304
        line 82: 307
        line 83: 314
        line 86: 325
        line 87: 335
        line 92: 346
        line 254: 347
        line 258: 351
        line 93: 352
        line 94: 361
        line 95: 367
        line 96: 372
        line 95: 404
        line 98: 407
        line 60: 411
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          289       7    19 $i$a$-any-SmoothObstacleAvoidance$createSmoothPath$1$1   I
          286      10    18    it   Lext/mods/gameserver/model/location/Location;
          279      24    17 element$iv   Ljava/lang/Object;
          226      78    15 $i$f$any   I
          223      81    14 $this$any$iv   Ljava/lang/Iterable;
          205     141    13 smoothSegment   Ljava/util/List;
          131     216    10 $i$a$-forEach-SmoothObstacleAvoidance$createSmoothPath$1   I
          144     203    11 current   Lext/mods/gameserver/model/location/Location;
          159     188    12  next   Lext/mods/gameserver/model/location/Location;
          128     219     9     i   I
          124     224     8 element$iv   I
           95     257     6 $i$f$forEach   I
           92     260     5 $this$forEach$iv   Ljava/lang/Iterable;
           48     360     3 smoothPath   Ljava/util/ArrayList;
           75     333     4 pathSet   Ljava/util/HashSet;
            0     412     0  this   Lext/mods/gameserver/geoengine/pathfinding/SmoothObstacleAvoidance;
            0     412     1 originalPath   Ljava/util/List;
            0     412     2 debug   Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;
    Signature: #20                          // (Ljava/util/List<+Lext/mods/gameserver/model/location/Location;>;Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Ljava/util/List<Lext/mods/gameserver/model/location/Location;>;
    RuntimeInvisibleAnnotations:
      0: #14()
        org.jetbrains.annotations.NotNull
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #14()
          org.jetbrains.annotations.NotNull
      parameter 1:
        0: #21()
          org.jetbrains.annotations.Nullable

  public final boolean shouldAvoidObstacle(ext.mods.gameserver.model.location.Location, ext.mods.gameserver.model.location.Location);
    descriptor: (Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;)Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=5, locals=20, args_size=3
         0: nop
         1: getstatic     #401                // Field ext/mods/Config.ENABLE_REAL_TIME_OBSTACLE_AVOIDANCE:Z
         4: ifne          11
         7: iconst_0
         8: goto          228
        11: aload_1
        12: aload_2
        13: invokevirtual #81                 // Method ext/mods/gameserver/model/location/Location.distance3D:(Lext/mods/gameserver/model/location/Location;)D
        16: dstore_3
        17: aload_2
        18: invokevirtual #217                // Method ext/mods/gameserver/model/location/Location.getZ:()I
        21: aload_1
        22: invokevirtual #217                // Method ext/mods/gameserver/model/location/Location.getZ:()I
        25: isub
        26: invokestatic  #405                // Method java/lang/Math.abs:(I)I
        29: istore        5
        31: nop
        32: dload_3
        33: getstatic     #408                // Field ext/mods/Config.OBSTACLE_DETECTION_DISTANCE:I
        36: i2d
        37: dcmpl
        38: ifle          45
        41: iconst_0
        42: goto          228
        45: iload         5
        47: bipush        100
        49: if_icmple     56
        52: iconst_0
        53: goto          228
        56: iconst_2
        57: dload_3
        58: bipush        16
        60: i2d
        61: ddiv
        62: d2i
        63: invokestatic  #165                // Method java/lang/Math.max:(II)I
        66: istore        6
        68: dconst_1
        69: iload         6
        71: i2d
        72: ddiv
        73: dstore        7
        75: new           #410                // class kotlin/ranges/IntRange
        78: dup
        79: iconst_0
        80: iload         6
        82: invokespecial #413                // Method kotlin/ranges/IntRange."<init>":(II)V
        85: checkcast     #61                 // class java/lang/Iterable
        88: astore        10
        90: iconst_0
        91: istore        11
        93: aload         10
        95: instanceof    #90                 // class java/util/Collection
        98: ifeq          118
       101: aload         10
       103: checkcast     #90                 // class java/util/Collection
       106: invokeinterface #91,  1           // InterfaceMethod java/util/Collection.isEmpty:()Z
       111: ifeq          118
       114: iconst_0
       115: goto          212
       118: iconst_0
       119: istore        12
       121: aload         10
       123: invokeinterface #65,  1           // InterfaceMethod java/lang/Iterable.iterator:()Ljava/util/Iterator;
       128: astore        13
       130: aload         13
       132: invokeinterface #70,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
       137: ifeq          210
       140: aload         13
       142: checkcast     #72                 // class kotlin/collections/IntIterator
       145: invokevirtual #75                 // Method kotlin/collections/IntIterator.nextInt:()I
       148: istore        14
       150: iload         14
       152: istore        15
       154: iconst_0
       155: istore        16
       157: iload         15
       159: i2d
       160: dload         7
       162: dmul
       163: dstore        17
       165: getstatic     #17                 // Field INSTANCE:Lext/mods/gameserver/geoengine/pathfinding/SmoothObstacleAvoidance;
       168: aload_1
       169: aload_2
       170: dload         17
       172: invokespecial #169                // Method interpolateLocation:(Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;D)Lext/mods/gameserver/model/location/Location;
       175: astore        19
       177: getstatic     #17                 // Field INSTANCE:Lext/mods/gameserver/geoengine/pathfinding/SmoothObstacleAvoidance;
       180: aload         19
       182: invokespecial #187                // Method isPointClear:(Lext/mods/gameserver/model/location/Location;)Z
       185: ifne          192
       188: iconst_1
       189: goto          193
       192: iconst_0
       193: ifeq          130
       196: iinc          12, 1
       199: iload         12
       201: ifge          130
       204: invokestatic  #354                // Method kotlin/collections/CollectionsKt.throwCountOverflow:()V
       207: goto          130
       210: iload         12
       212: istore        9
       214: iload         9
       216: iload         6
       218: iconst_2
       219: idiv
       220: if_icmple     227
       223: iconst_1
       224: goto          228
       227: iconst_0
       228: ireturn
      StackMapTable: number_of_entries = 11
        frame_type = 11 /* same */
        frame_type = 253 /* append */
          offset_delta = 33
          locals = [ double, int ]
        frame_type = 10 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 61
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/SmoothObstacleAvoidance, class ext/mods/gameserver/model/location/Location, class ext/mods/gameserver/model/location/Location, double, int, int, double, top, class java/lang/Iterable, int ]
          stack = []
        frame_type = 253 /* append */
          offset_delta = 11
          locals = [ int, class java/util/Iterator ]
        frame_type = 255 /* full_frame */
          offset_delta = 61
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/SmoothObstacleAvoidance, class ext/mods/gameserver/model/location/Location, class ext/mods/gameserver/model/location/Location, double, int, int, double, top, class java/lang/Iterable, int, int, class java/util/Iterator, int, int, int, double, class ext/mods/gameserver/model/location/Location ]
          stack = []
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/SmoothObstacleAvoidance, class ext/mods/gameserver/model/location/Location, class ext/mods/gameserver/model/location/Location, double, int, int, double, top, class java/lang/Iterable, int, int, class java/util/Iterator ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 1
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/SmoothObstacleAvoidance, class ext/mods/gameserver/model/location/Location, class ext/mods/gameserver/model/location/Location, double, int, int, double, top, class java/lang/Iterable, int ]
          stack = [ int ]
        frame_type = 255 /* full_frame */
          offset_delta = 14
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/SmoothObstacleAvoidance, class ext/mods/gameserver/model/location/Location, class ext/mods/gameserver/model/location/Location, double, int, int, double, int, class java/lang/Iterable, int ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/SmoothObstacleAvoidance, class ext/mods/gameserver/model/location/Location, class ext/mods/gameserver/model/location/Location ]
          stack = [ int ]
      LineNumberTable:
        line 216: 0
        line 217: 1
        line 219: 11
        line 220: 17
        line 220: 29
        line 222: 31
        line 223: 32
        line 224: 45
        line 226: 56
        line 226: 66
        line 227: 68
        line 228: 75
        line 266: 93
        line 267: 118
        line 268: 121
        line 229: 157
        line 230: 165
        line 231: 177
        line 268: 193
        line 269: 210
        line 228: 212
        line 233: 214
        line 216: 228
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          157      36    16 $i$a$-count-SmoothObstacleAvoidance$shouldAvoidObstacle$blockedCount$1   I
          165      28    17 ratio   D
          177      16    19 testPoint   Lext/mods/gameserver/model/location/Location;
          154      39    15     i   I
          150      57    14 element$iv   I
           93     119    11 $i$f$count   I
          121      91    12 count$iv   I
           90     122    10 $this$count$iv   Ljava/lang/Iterable;
           68     160     6 steps   I
           75     153     7 stepInverse   D
          214      14     9 blockedCount   I
           17     211     3 distance   D
           31     197     5 heightDiff   I
            0     229     0  this   Lext/mods/gameserver/geoengine/pathfinding/SmoothObstacleAvoidance;
            0     229     1 current   Lext/mods/gameserver/model/location/Location;
            0     229     2 target   Lext/mods/gameserver/model/location/Location;
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #14()
          org.jetbrains.annotations.NotNull
      parameter 1:
        0: #14()
          org.jetbrains.annotations.NotNull

  public final ext.mods.gameserver.model.location.Location calculateAvoidanceDirection(ext.mods.gameserver.model.location.Location, ext.mods.gameserver.model.location.Location);
    descriptor: (Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;)Lext/mods/gameserver/model/location/Location;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=5, locals=12, args_size=3
         0: getstatic     #159                // Field ext/mods/Config.OBSTACLE_SMOOTHING_DISTANCE:I
         3: istore_3
         4: aload_0
         5: aload_1
         6: aload_2
         7: invokespecial #230                // Method calculateDirectionAngle:(Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;)D
        10: dstore        4
        12: dload         4
        14: ldc2_w        #420                // double 1.5707963267948966d
        17: dadd
        18: dstore        6
        20: dload         4
        22: ldc2_w        #420                // double 1.5707963267948966d
        25: dsub
        26: dstore        8
        28: aload_0
        29: aload_1
        30: dload         6
        32: iload_3
        33: invokespecial #423                // Method calculateOffsetPoint:(Lext/mods/gameserver/model/location/Location;DI)Lext/mods/gameserver/model/location/Location;
        36: astore        10
        38: aload_0
        39: aload_1
        40: dload         8
        42: iload_3
        43: invokespecial #423                // Method calculateOffsetPoint:(Lext/mods/gameserver/model/location/Location;DI)Lext/mods/gameserver/model/location/Location;
        46: astore        11
        48: nop
        49: aload_0
        50: aload         10
        52: invokespecial #187                // Method isPointClear:(Lext/mods/gameserver/model/location/Location;)Z
        55: ifeq          63
        58: aload         10
        60: goto          78
        63: aload_0
        64: aload         11
        66: invokespecial #187                // Method isPointClear:(Lext/mods/gameserver/model/location/Location;)Z
        69: ifeq          77
        72: aload         11
        74: goto          78
        77: aload_2
        78: areturn
      StackMapTable: number_of_entries = 3
        frame_type = 255 /* full_frame */
          offset_delta = 63
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/SmoothObstacleAvoidance, class ext/mods/gameserver/model/location/Location, class ext/mods/gameserver/model/location/Location, int, double, double, double, class ext/mods/gameserver/model/location/Location, class ext/mods/gameserver/model/location/Location ]
          stack = []
        frame_type = 13 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/model/location/Location ]
      LineNumberTable:
        line 241: 0
        line 242: 4
        line 243: 12
        line 244: 20
        line 245: 28
        line 246: 38
        line 247: 48
        line 248: 49
        line 249: 63
        line 250: 77
        line 247: 78
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            4      75     3 smoothingDistance   I
           12      67     4 angle   D
           20      59     6 perpendicularAngle1   D
           28      51     8 perpendicularAngle2   D
           38      41    10 option1   Lext/mods/gameserver/model/location/Location;
           48      31    11 option2   Lext/mods/gameserver/model/location/Location;
            0      79     0  this   Lext/mods/gameserver/geoengine/pathfinding/SmoothObstacleAvoidance;
            0      79     1 current   Lext/mods/gameserver/model/location/Location;
            0      79     2 target   Lext/mods/gameserver/model/location/Location;
    RuntimeInvisibleAnnotations:
      0: #14()
        org.jetbrains.annotations.NotNull
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #14()
          org.jetbrains.annotations.NotNull
      parameter 1:
        0: #14()
          org.jetbrains.annotations.NotNull

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=10, args_size=0
         0: new           #2                  // class ext/mods/gameserver/geoengine/pathfinding/SmoothObstacleAvoidance
         3: dup
         4: invokespecial #456                // Method "<init>":()V
         7: putstatic     #17                 // Field INSTANCE:Lext/mods/gameserver/geoengine/pathfinding/SmoothObstacleAvoidance;
        10: new           #127                // class ext/mods/commons/logging/CLogger
        13: dup
        14: ldc           #2                  // class ext/mods/gameserver/geoengine/pathfinding/SmoothObstacleAvoidance
        16: invokevirtual #462                // Method java/lang/Class.getName:()Ljava/lang/String;
        19: invokespecial #465                // Method ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
        22: putstatic     #116                // Field LOGGER:Lext/mods/commons/logging/CLogger;
        25: getstatic     #469                // Field ext/mods/gameserver/geoengine/GeoEngine.Companion:Lext/mods/gameserver/geoengine/GeoEngine$Companion;
        28: invokevirtual #474                // Method ext/mods/gameserver/geoengine/GeoEngine$Companion.getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
        31: putstatic     #318                // Field geoEngine:Lext/mods/gameserver/geoengine/GeoEngine;
        34: bipush        8
        36: putstatic     #332                // Field FLAG_N:I
        39: iconst_4
        40: putstatic     #338                // Field FLAG_S:I
        43: iconst_1
        44: putstatic     #341                // Field FLAG_E:I
        47: iconst_2
        48: putstatic     #344                // Field FLAG_W:I
        51: bipush        15
        53: putstatic     #327                // Field FLAG_ALL:I
        56: iconst_0
        57: sipush        360
        60: invokestatic  #59                 // Method kotlin/ranges/RangesKt.until:(II)Lkotlin/ranges/IntRange;
        63: checkcast     #476                // class kotlin/ranges/IntProgression
        66: bipush        45
        68: invokestatic  #480                // Method kotlin/ranges/RangesKt.step:(Lkotlin/ranges/IntProgression;I)Lkotlin/ranges/IntProgression;
        71: checkcast     #61                 // class java/lang/Iterable
        74: astore_0
        75: iconst_0
        76: istore_1
        77: aload_0
        78: astore_2
        79: new           #39                 // class java/util/ArrayList
        82: dup
        83: aload_0
        84: bipush        10
        86: invokestatic  #484                // Method kotlin/collections/CollectionsKt.collectionSizeOrDefault:(Ljava/lang/Iterable;I)I
        89: invokespecial #42                 // Method java/util/ArrayList."<init>":(I)V
        92: checkcast     #90                 // class java/util/Collection
        95: astore_3
        96: iconst_0
        97: istore        4
        99: aload_2
       100: invokeinterface #65,  1           // InterfaceMethod java/lang/Iterable.iterator:()Ljava/util/Iterator;
       105: astore        5
       107: aload         5
       109: invokeinterface #70,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
       114: ifeq          158
       117: aload         5
       119: checkcast     #72                 // class kotlin/collections/IntIterator
       122: invokevirtual #75                 // Method kotlin/collections/IntIterator.nextInt:()I
       125: istore        6
       127: aload_3
       128: iload         6
       130: istore        7
       132: astore        9
       134: iconst_0
       135: istore        8
       137: iload         7
       139: i2d
       140: invokestatic  #487                // Method java/lang/Math.toRadians:(D)D
       143: invokestatic  #492                // Method java/lang/Double.valueOf:(D)Ljava/lang/Double;
       146: aload         9
       148: swap
       149: invokeinterface #493,  2          // InterfaceMethod java/util/Collection.add:(Ljava/lang/Object;)Z
       154: pop
       155: goto          107
       158: aload_3
       159: checkcast     #29                 // class java/util/List
       162: nop
       163: putstatic     #438                // Field ANGLE_OFFSETS:Ljava/util/List;
       166: return
      StackMapTable: number_of_entries = 2
        frame_type = 255 /* full_frame */
          offset_delta = 107
          locals = [ class java/lang/Iterable, int, class java/lang/Iterable, class java/util/Collection, int, class java/util/Iterator ]
          stack = []
        frame_type = 50 /* same */
      LineNumberTable:
        line 35: 10
        line 37: 25
        line 48: 34
        line 49: 39
        line 50: 43
        line 51: 47
        line 52: 51
        line 54: 56
        line 270: 77
        line 271: 99
        line 272: 127
        line 54: 137
        line 272: 149
        line 273: 158
        line 270: 162
        line 54: 163
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          137       6     8 $i$a$-map-SmoothObstacleAvoidance$ANGLE_OFFSETS$1   I
          134       9     7    it   I
          127      28     6 item$iv$iv   I
           99      60     4 $i$f$mapTo   I
           96      63     2 $this$mapTo$iv$iv   Ljava/lang/Iterable;
           96      63     3 destination$iv$iv   Ljava/util/Collection;
           77      86     1 $i$f$map   I
           75      88     0 $this$map$iv   Ljava/lang/Iterable;
}
InnerClasses:
  public static final #466= #471 of #320; // Companion=class ext/mods/gameserver/geoengine/GeoEngine$Companion of class ext/mods/gameserver/geoengine/GeoEngine
SourceFile: "SmoothObstacleAvoidance.kt"
SourceDebugExtension:
  SMAP
  SmoothObstacleAvoidance.kt
  Kotlin
  *S Kotlin
  *F
  + 1 SmoothObstacleAvoidance.kt
  ext/mods/gameserver/geoengine/pathfinding/SmoothObstacleAvoidance
  + 2 _Collections.kt
  kotlin/collections/CollectionsKt___CollectionsKt
  + 3 fake.kt
  kotlin/jvm/internal/FakeKt
  + 4 _Sequences.kt
  kotlin/sequences/SequencesKt___SequencesKt
  *L
  1#1,253:1
  1915#2:254
  1807#2,3:255
  1916#2:258
  1834#2,4:262
  1834#2,4:266
  1586#2:270
  1661#2,3:271
  1#3:259
  184#4,2:260
  *S KotlinDebug
  *F
  + 1 SmoothObstacleAvoidance.kt
  ext/mods/gameserver/geoengine/pathfinding/SmoothObstacleAvoidance
  *L
  68#1:254
  81#1:255,3
  68#1:258
  181#1:262,4
  228#1:266,4
  54#1:270
  54#1:271,3
  144#1:260,2
  *E
RuntimeVisibleAnnotations:
  0: #517(#518=[I#506,I#503,I#519],#520=I#521,#522=I#523,#524=[s#525],#526=[s#10,s#527,s#5,s#6,s#113,s#114,s#315,s#316,s#502,s#527,s#504,s#527,s#505,s#507,s#509,s#511,s#513,s#515,s#330,s#336,s#339,s#342,s#325,s#436,s#527,s#11,s#18,s#135,s#152,s#128,s#153,s#85,s#182,s#183,s#170,s#226,s#192,s#297,s#200,s#184,s#527,s#286,s#166,s#174,s#227,s#378,s#396,s#296,s#178,s#397,s#144,s#417,s#418,s#528])
    kotlin.Metadata(
      mv=[2,3,0]
      k=1
      xi=48
      d1=["\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\f\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\r\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0019\u001a\u00020\u0000H\u0007J$\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00182\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00182\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eJ(\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00182\u0006\u0010 \u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\u001b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0002J*\u0010\"\u001a\u00020\u001b2\u0006\u0010#\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\u001b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0002J\"\u0010$\u001a\u0004\u0018\u00010\u001b2\u0006\u0010%\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\u001bH\u0002J \u0010&\u001a\u00020\u001b2\u0006\u0010#\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\u001bH\u0002J\u0010\u0010\'\u001a\u00020(2\u0006\u0010#\u001a\u00020\u001bH\u0002J \u0010)\u001a\u00020(2\u0006\u0010#\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\u001bH\u0002J \u0010*\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\u001b2\u0006\u0010+\u001a\u00020\u000bH\u0002J\u0018\u0010,\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\u001bH\u0002J \u0010-\u001a\u00020\u001b2\u0006\u0010.\u001a\u00020\u001b2\u0006\u0010/\u001a\u00020\u000b2\u0006\u00100\u001a\u00020\tH\u0002J\u0016\u00101\u001a\u00020(2\u0006\u00102\u001a\u00020\u001b2\u0006\u00103\u001a\u00020\u001bJ\u0016\u00104\u001a\u00020\u001b2\u0006\u00102\u001a\u00020\u001b2\u0006\u00103\u001a\u00020\u001bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\tX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\tX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\tX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\tX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\tX\u0082D¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0018X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00065"]
      d2=["Lext/mods/gameserver/geoengine/pathfinding/SmoothObstacleAvoidance;","","<init>","()V","LOGGER","Lext/mods/commons/logging/CLogger;","geoEngine","Lext/mods/gameserver/geoengine/GeoEngine;","MIN_PATH_SIZE","","MIN_SEGMENT_DISTANCE","","MIN_STEPS","STEP_SIZE","ANGLE_STEP","MAX_ANGLE","MAX_HEIGHT_DIFF","DISTANCE_CHECK_STEP","FLAG_N","FLAG_S","FLAG_E","FLAG_W","FLAG_ALL","ANGLE_OFFSETS","","getInstance","createSmoothPath","Lext/mods/gameserver/model/location/Location;","originalPath","debug","Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;","smoothPathSegment","start","end","applyObstacleAvoidance","point","findBestAvoidancePoint","blockedPoint","applySmoothingLevel","isPointClear","","isPointReachable","interpolateLocation","ratio","calculateDirectionAngle","calculateOffsetPoint","center","angle","distance","shouldAvoidObstacle","current","target","calculateAvoidanceDirection","Brproject"]
    )
RuntimeInvisibleAnnotations:
  0: #530(#531=[s#532])
    kotlin.jvm.internal.SourceDebugExtension(
      value=["SMAP\nSmoothObstacleAvoidance.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SmoothObstacleAvoidance.kt\next/mods/gameserver/geoengine/pathfinding/SmoothObstacleAvoidance\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,253:1\n1915#2:254\n1807#2,3:255\n1916#2:258\n1834#2,4:262\n1834#2,4:266\n1586#2:270\n1661#2,3:271\n1#3:259\n184#4,2:260\n*S KotlinDebug\n*F\n+ 1 SmoothObstacleAvoidance.kt\next/mods/gameserver/geoengine/pathfinding/SmoothObstacleAvoidance\n*L\n68#1:254\n81#1:255,3\n68#1:258\n181#1:262,4\n228#1:266,4\n54#1:270\n54#1:271,3\n144#1:260,2\n*E\n"]
    )
BootstrapMethods:
  0: #245 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #232 (Ljava/lang/Object;)Ljava/lang/Object;
      #236 REF_invokeStatic ext/mods/gameserver/geoengine/pathfinding/SmoothObstacleAvoidance.findBestAvoidancePoint$lambda$0:(I)Ljava/lang/Integer;
      #238 (Ljava/lang/Integer;)Ljava/lang/Integer;
  1: #245 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #232 (Ljava/lang/Object;)Ljava/lang/Object;
      #260 REF_invokeStatic ext/mods/gameserver/geoengine/pathfinding/SmoothObstacleAvoidance.findBestAvoidancePoint$lambda$1:(II)Z
      #262 (Ljava/lang/Integer;)Ljava/lang/Boolean;
  2: #245 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #232 (Ljava/lang/Object;)Ljava/lang/Object;
      #274 REF_invokeStatic ext/mods/gameserver/geoengine/pathfinding/SmoothObstacleAvoidance.findBestAvoidancePoint$lambda$2:(DLext/mods/gameserver/model/location/Location;I)Lkotlin/sequences/Sequence;
      #276 (Ljava/lang/Integer;)Lkotlin/sequences/Sequence;
  3: #245 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #232 (Ljava/lang/Object;)Ljava/lang/Object;
      #445 REF_invokeStatic ext/mods/gameserver/geoengine/pathfinding/SmoothObstacleAvoidance.findBestAvoidancePoint$lambda$2$0:(DLext/mods/gameserver/model/location/Location;ID)Lext/mods/gameserver/model/location/Location;
      #447 (Ljava/lang/Double;)Lext/mods/gameserver/model/location/Location;
