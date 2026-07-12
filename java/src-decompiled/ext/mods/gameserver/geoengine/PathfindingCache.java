// Bytecode for: ext.mods.gameserver.geoengine.PathfindingCache
// File: ext\mods\gameserver\geoengine\PathfindingCache.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/geoengine/PathfindingCache.class
  Last modified 9 de jul de 2026; size 4766 bytes
  MD5 checksum fe97c42510fb2660059fa80b43fbc0ef
  Compiled from "PathfindingCache.java"
public class ext.mods.gameserver.geoengine.PathfindingCache
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/geoengine/PathfindingCache
  super_class: #125                       // java/lang/Object
  interfaces: 0, fields: 3, methods: 10, attributes: 4
Constant pool:
    #1 = Fieldref           #2.#3         // ext/mods/Config.ENABLE_PATHFINDING_CACHE:Z
    #2 = Class              #4            // ext/mods/Config
    #3 = NameAndType        #5:#6         // ENABLE_PATHFINDING_CACHE:Z
    #4 = Utf8               ext/mods/Config
    #5 = Utf8               ENABLE_PATHFINDING_CACHE
    #6 = Utf8               Z
    #7 = Methodref          #8.#9         // ext/mods/gameserver/geoengine/PathfindingCache.roundCoord:(I)I
    #8 = Class              #10           // ext/mods/gameserver/geoengine/PathfindingCache
    #9 = NameAndType        #11:#12       // roundCoord:(I)I
   #10 = Utf8               ext/mods/gameserver/geoengine/PathfindingCache
   #11 = Utf8               roundCoord
   #12 = Utf8               (I)I
   #13 = Methodref          #8.#14        // ext/mods/gameserver/geoengine/PathfindingCache.createKey:(IIIIII)Ljava/lang/String;
   #14 = NameAndType        #15:#16       // createKey:(IIIIII)Ljava/lang/String;
   #15 = Utf8               createKey
   #16 = Utf8               (IIIIII)Ljava/lang/String;
   #17 = Fieldref           #8.#18        // ext/mods/gameserver/geoengine/PathfindingCache._cache:Ljava/util/concurrent/ConcurrentHashMap;
   #18 = NameAndType        #19:#20       // _cache:Ljava/util/concurrent/ConcurrentHashMap;
   #19 = Utf8               _cache
   #20 = Utf8               Ljava/util/concurrent/ConcurrentHashMap;
   #21 = Methodref          #22.#23       // java/util/concurrent/ConcurrentHashMap.get:(Ljava/lang/Object;)Ljava/lang/Object;
   #22 = Class              #24           // java/util/concurrent/ConcurrentHashMap
   #23 = NameAndType        #25:#26       // get:(Ljava/lang/Object;)Ljava/lang/Object;
   #24 = Utf8               java/util/concurrent/ConcurrentHashMap
   #25 = Utf8               get
   #26 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
   #27 = Class              #28           // ext/mods/gameserver/geoengine/PathfindingCache$CachedPath
   #28 = Utf8               ext/mods/gameserver/geoengine/PathfindingCache$CachedPath
   #29 = Fieldref           #8.#30        // ext/mods/gameserver/geoengine/PathfindingCache._misses:Ljava/util/concurrent/atomic/AtomicInteger;
   #30 = NameAndType        #31:#32       // _misses:Ljava/util/concurrent/atomic/AtomicInteger;
   #31 = Utf8               _misses
   #32 = Utf8               Ljava/util/concurrent/atomic/AtomicInteger;
   #33 = Methodref          #34.#35       // java/util/concurrent/atomic/AtomicInteger.incrementAndGet:()I
   #34 = Class              #36           // java/util/concurrent/atomic/AtomicInteger
   #35 = NameAndType        #37:#38       // incrementAndGet:()I
   #36 = Utf8               java/util/concurrent/atomic/AtomicInteger
   #37 = Utf8               incrementAndGet
   #38 = Utf8               ()I
   #39 = Methodref          #40.#41       // java/lang/System.currentTimeMillis:()J
   #40 = Class              #42           // java/lang/System
   #41 = NameAndType        #43:#44       // currentTimeMillis:()J
   #42 = Utf8               java/lang/System
   #43 = Utf8               currentTimeMillis
   #44 = Utf8               ()J
   #45 = Fieldref           #27.#46       // ext/mods/gameserver/geoengine/PathfindingCache$CachedPath.timestamp:J
   #46 = NameAndType        #47:#48       // timestamp:J
   #47 = Utf8               timestamp
   #48 = Utf8               J
   #49 = Fieldref           #2.#50        // ext/mods/Config.PATHFINDING_CACHE_EXPIRATION:I
   #50 = NameAndType        #51:#52       // PATHFINDING_CACHE_EXPIRATION:I
   #51 = Utf8               PATHFINDING_CACHE_EXPIRATION
   #52 = Utf8               I
   #53 = Methodref          #22.#54       // java/util/concurrent/ConcurrentHashMap.remove:(Ljava/lang/Object;)Ljava/lang/Object;
   #54 = NameAndType        #55:#26       // remove:(Ljava/lang/Object;)Ljava/lang/Object;
   #55 = Utf8               remove
   #56 = Fieldref           #8.#57        // ext/mods/gameserver/geoengine/PathfindingCache._hits:Ljava/util/concurrent/atomic/AtomicInteger;
   #57 = NameAndType        #58:#32       // _hits:Ljava/util/concurrent/atomic/AtomicInteger;
   #58 = Utf8               _hits
   #59 = Fieldref           #27.#60       // ext/mods/gameserver/geoengine/PathfindingCache$CachedPath.path:Ljava/util/List;
   #60 = NameAndType        #61:#62       // path:Ljava/util/List;
   #61 = Utf8               path
   #62 = Utf8               Ljava/util/List;
   #63 = InterfaceMethodref #64.#65       // java/util/List.isEmpty:()Z
   #64 = Class              #66           // java/util/List
   #65 = NameAndType        #67:#68       // isEmpty:()Z
   #66 = Utf8               java/util/List
   #67 = Utf8               isEmpty
   #68 = Utf8               ()Z
   #69 = Methodref          #22.#70       // java/util/concurrent/ConcurrentHashMap.size:()I
   #70 = NameAndType        #71:#38       // size:()I
   #71 = Utf8               size
   #72 = Fieldref           #2.#73        // ext/mods/Config.PATHFINDING_CACHE_SIZE:I
   #73 = NameAndType        #74:#52       // PATHFINDING_CACHE_SIZE:I
   #74 = Utf8               PATHFINDING_CACHE_SIZE
   #75 = Methodref          #8.#76        // ext/mods/gameserver/geoengine/PathfindingCache.clearOldEntries:()V
   #76 = NameAndType        #77:#78       // clearOldEntries:()V
   #77 = Utf8               clearOldEntries
   #78 = Utf8               ()V
   #79 = Methodref          #27.#80       // ext/mods/gameserver/geoengine/PathfindingCache$CachedPath."<init>":(Ljava/util/List;J)V
   #80 = NameAndType        #81:#82       // "<init>":(Ljava/util/List;J)V
   #81 = Utf8               <init>
   #82 = Utf8               (Ljava/util/List;J)V
   #83 = Methodref          #22.#84       // java/util/concurrent/ConcurrentHashMap.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #84 = NameAndType        #85:#86       // put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #85 = Utf8               put
   #86 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #87 = Methodref          #22.#88       // java/util/concurrent/ConcurrentHashMap.entrySet:()Ljava/util/Set;
   #88 = NameAndType        #89:#90       // entrySet:()Ljava/util/Set;
   #89 = Utf8               entrySet
   #90 = Utf8               ()Ljava/util/Set;
   #91 = InterfaceMethodref #92.#93       // java/util/Set.iterator:()Ljava/util/Iterator;
   #92 = Class              #94           // java/util/Set
   #93 = NameAndType        #95:#96       // iterator:()Ljava/util/Iterator;
   #94 = Utf8               java/util/Set
   #95 = Utf8               iterator
   #96 = Utf8               ()Ljava/util/Iterator;
   #97 = InterfaceMethodref #98.#99       // java/util/Iterator.hasNext:()Z
   #98 = Class              #100          // java/util/Iterator
   #99 = NameAndType        #101:#68      // hasNext:()Z
  #100 = Utf8               java/util/Iterator
  #101 = Utf8               hasNext
  #102 = InterfaceMethodref #98.#103      // java/util/Iterator.next:()Ljava/lang/Object;
  #103 = NameAndType        #104:#105     // next:()Ljava/lang/Object;
  #104 = Utf8               next
  #105 = Utf8               ()Ljava/lang/Object;
  #106 = Class              #107          // java/util/Map$Entry
  #107 = Utf8               java/util/Map$Entry
  #108 = InterfaceMethodref #106.#109     // java/util/Map$Entry.getValue:()Ljava/lang/Object;
  #109 = NameAndType        #110:#105     // getValue:()Ljava/lang/Object;
  #110 = Utf8               getValue
  #111 = InterfaceMethodref #106.#112     // java/util/Map$Entry.getKey:()Ljava/lang/Object;
  #112 = NameAndType        #113:#105     // getKey:()Ljava/lang/Object;
  #113 = Utf8               getKey
  #114 = Methodref          #22.#115      // java/util/concurrent/ConcurrentHashMap.clear:()V
  #115 = NameAndType        #116:#78      // clear:()V
  #116 = Utf8               clear
  #117 = Methodref          #34.#118      // java/util/concurrent/atomic/AtomicInteger.set:(I)V
  #118 = NameAndType        #119:#120     // set:(I)V
  #119 = Utf8               set
  #120 = Utf8               (I)V
  #121 = Methodref          #34.#122      // java/util/concurrent/atomic/AtomicInteger.get:()I
  #122 = NameAndType        #25:#38       // get:()I
  #123 = String             #124          // PathfindingCache: %d entries, %.2f%% hit rate (%d hits, %d misses)
  #124 = Utf8               PathfindingCache: %d entries, %.2f%% hit rate (%d hits, %d misses)
  #125 = Class              #126          // java/lang/Object
  #126 = Utf8               java/lang/Object
  #127 = Methodref          #128.#129     // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
  #128 = Class              #130          // java/lang/Integer
  #129 = NameAndType        #131:#132     // valueOf:(I)Ljava/lang/Integer;
  #130 = Utf8               java/lang/Integer
  #131 = Utf8               valueOf
  #132 = Utf8               (I)Ljava/lang/Integer;
  #133 = Methodref          #8.#134       // ext/mods/gameserver/geoengine/PathfindingCache.getHitRate:()D
  #134 = NameAndType        #135:#136     // getHitRate:()D
  #135 = Utf8               getHitRate
  #136 = Utf8               ()D
  #137 = Double             100.0d
  #139 = Methodref          #140.#141     // java/lang/Double.valueOf:(D)Ljava/lang/Double;
  #140 = Class              #142          // java/lang/Double
  #141 = NameAndType        #131:#143     // valueOf:(D)Ljava/lang/Double;
  #142 = Utf8               java/lang/Double
  #143 = Utf8               (D)Ljava/lang/Double;
  #144 = Methodref          #145.#146     // java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
  #145 = Class              #147          // java/lang/String
  #146 = NameAndType        #148:#149     // format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
  #147 = Utf8               java/lang/String
  #148 = Utf8               format
  #149 = Utf8               (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
  #150 = InvokeDynamic      #0:#151       // #0:makeConcatWithConstants:(IIIIII)Ljava/lang/String;
  #151 = NameAndType        #152:#16      // makeConcatWithConstants:(IIIIII)Ljava/lang/String;
  #152 = Utf8               makeConcatWithConstants
  #153 = Methodref          #125.#154     // java/lang/Object."<init>":()V
  #154 = NameAndType        #81:#78       // "<init>":()V
  #155 = Methodref          #22.#154      // java/util/concurrent/ConcurrentHashMap."<init>":()V
  #156 = Methodref          #34.#157      // java/util/concurrent/atomic/AtomicInteger."<init>":(I)V
  #157 = NameAndType        #81:#120      // "<init>":(I)V
  #158 = Utf8               Signature
  #159 = Utf8               Ljava/util/concurrent/ConcurrentHashMap<Ljava/lang/String;Lext/mods/gameserver/geoengine/PathfindingCache$CachedPath;>;
  #160 = Utf8               getPath
  #161 = Utf8               (IIIIII)Ljava/util/List;
  #162 = Utf8               Code
  #163 = Utf8               LineNumberTable
  #164 = Utf8               LocalVariableTable
  #165 = Utf8               ox
  #166 = Utf8               oy
  #167 = Utf8               oz
  #168 = Utf8               tx
  #169 = Utf8               ty
  #170 = Utf8               tz
  #171 = Utf8               key
  #172 = Utf8               Ljava/lang/String;
  #173 = Utf8               cached
  #174 = Utf8               Lext/mods/gameserver/geoengine/PathfindingCache$CachedPath;
  #175 = Utf8               StackMapTable
  #176 = Utf8               (IIIIII)Ljava/util/List<Lext/mods/gameserver/model/location/Location;>;
  #177 = Utf8               cachePath
  #178 = Utf8               (IIIIIILjava/util/List;)V
  #179 = Utf8               LocalVariableTypeTable
  #180 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/location/Location;>;
  #181 = Utf8               (IIIIIILjava/util/List<Lext/mods/gameserver/model/location/Location;>;)V
  #182 = Utf8               entry
  #183 = Utf8               Ljava/util/Map$Entry;
  #184 = Utf8               now
  #185 = Utf8               toRemove
  #186 = Utf8               removed
  #187 = Utf8               Ljava/util/Map$Entry<Ljava/lang/String;Lext/mods/gameserver/geoengine/PathfindingCache$CachedPath;>;
  #188 = Utf8               clearCache
  #189 = Utf8               total
  #190 = Utf8               getStats
  #191 = Utf8               ()Ljava/lang/String;
  #192 = Utf8               coord
  #193 = Utf8               this
  #194 = Utf8               Lext/mods/gameserver/geoengine/PathfindingCache;
  #195 = Utf8               <clinit>
  #196 = Utf8               SourceFile
  #197 = Utf8               PathfindingCache.java
  #198 = Utf8               NestMembers
  #199 = Utf8               BootstrapMethods
  #200 = String             #201          // \u0001,\u0001,\u0001>\u0001,\u0001,\u0001
  #201 = Utf8               \u0001,\u0001,\u0001>\u0001,\u0001,\u0001
  #202 = MethodHandle       6:#203        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #203 = Methodref          #204.#205     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #204 = Class              #206          // java/lang/invoke/StringConcatFactory
  #205 = NameAndType        #152:#207     // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #206 = Utf8               java/lang/invoke/StringConcatFactory
  #207 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #208 = Utf8               InnerClasses
  #209 = Utf8               CachedPath
  #210 = Class              #211          // java/util/Map
  #211 = Utf8               java/util/Map
  #212 = Utf8               Entry
  #213 = Class              #214          // java/lang/invoke/MethodHandles$Lookup
  #214 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #215 = Class              #216          // java/lang/invoke/MethodHandles
  #216 = Utf8               java/lang/invoke/MethodHandles
  #217 = Utf8               Lookup
{
  public static java.util.List<ext.mods.gameserver.model.location.Location> getPath(int, int, int, int, int, int);
    descriptor: (IIIIII)Ljava/util/List;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=6, locals=8, args_size=6
         0: getstatic     #1                  // Field ext/mods/Config.ENABLE_PATHFINDING_CACHE:Z
         3: ifne          8
         6: aconst_null
         7: areturn
         8: iload_0
         9: invokestatic  #7                  // Method roundCoord:(I)I
        12: iload_1
        13: invokestatic  #7                  // Method roundCoord:(I)I
        16: iload_2
        17: invokestatic  #7                  // Method roundCoord:(I)I
        20: iload_3
        21: invokestatic  #7                  // Method roundCoord:(I)I
        24: iload         4
        26: invokestatic  #7                  // Method roundCoord:(I)I
        29: iload         5
        31: invokestatic  #7                  // Method roundCoord:(I)I
        34: invokestatic  #13                 // Method createKey:(IIIIII)Ljava/lang/String;
        37: astore        6
        39: getstatic     #17                 // Field _cache:Ljava/util/concurrent/ConcurrentHashMap;
        42: aload         6
        44: invokevirtual #21                 // Method java/util/concurrent/ConcurrentHashMap.get:(Ljava/lang/Object;)Ljava/lang/Object;
        47: checkcast     #27                 // class ext/mods/gameserver/geoengine/PathfindingCache$CachedPath
        50: astore        7
        52: aload         7
        54: ifnonnull     66
        57: getstatic     #29                 // Field _misses:Ljava/util/concurrent/atomic/AtomicInteger;
        60: invokevirtual #33                 // Method java/util/concurrent/atomic/AtomicInteger.incrementAndGet:()I
        63: pop
        64: aconst_null
        65: areturn
        66: invokestatic  #39                 // Method java/lang/System.currentTimeMillis:()J
        69: aload         7
        71: getfield      #45                 // Field ext/mods/gameserver/geoengine/PathfindingCache$CachedPath.timestamp:J
        74: lsub
        75: getstatic     #49                 // Field ext/mods/Config.PATHFINDING_CACHE_EXPIRATION:I
        78: i2l
        79: lcmp
        80: ifle          101
        83: getstatic     #17                 // Field _cache:Ljava/util/concurrent/ConcurrentHashMap;
        86: aload         6
        88: invokevirtual #53                 // Method java/util/concurrent/ConcurrentHashMap.remove:(Ljava/lang/Object;)Ljava/lang/Object;
        91: pop
        92: getstatic     #29                 // Field _misses:Ljava/util/concurrent/atomic/AtomicInteger;
        95: invokevirtual #33                 // Method java/util/concurrent/atomic/AtomicInteger.incrementAndGet:()I
        98: pop
        99: aconst_null
       100: areturn
       101: getstatic     #56                 // Field _hits:Ljava/util/concurrent/atomic/AtomicInteger;
       104: invokevirtual #33                 // Method java/util/concurrent/atomic/AtomicInteger.incrementAndGet:()I
       107: pop
       108: aload         7
       110: getfield      #59                 // Field ext/mods/gameserver/geoengine/PathfindingCache$CachedPath.path:Ljava/util/List;
       113: areturn
      LineNumberTable:
        line 65: 0
        line 66: 6
        line 68: 8
        line 69: 9
        line 70: 21
        line 68: 34
        line 73: 39
        line 75: 52
        line 77: 57
        line 78: 64
        line 81: 66
        line 83: 83
        line 84: 92
        line 85: 99
        line 88: 101
        line 89: 108
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     114     0    ox   I
            0     114     1    oy   I
            0     114     2    oz   I
            0     114     3    tx   I
            0     114     4    ty   I
            0     114     5    tz   I
           39      75     6   key   Ljava/lang/String;
           52      62     7 cached   Lext/mods/gameserver/geoengine/PathfindingCache$CachedPath;
      StackMapTable: number_of_entries = 3
        frame_type = 8 /* same */
        frame_type = 253 /* append */
          offset_delta = 57
          locals = [ class java/lang/String, class ext/mods/gameserver/geoengine/PathfindingCache$CachedPath ]
        frame_type = 34 /* same */
    Signature: #176                         // (IIIIII)Ljava/util/List<Lext/mods/gameserver/model/location/Location;>;

  public static void cachePath(int, int, int, int, int, int, java.util.List<ext.mods.gameserver.model.location.Location>);
    descriptor: (IIIIIILjava/util/List;)V
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=7, locals=8, args_size=7
         0: getstatic     #1                  // Field ext/mods/Config.ENABLE_PATHFINDING_CACHE:Z
         3: ifne          7
         6: return
         7: aload         6
         9: ifnull        22
        12: aload         6
        14: invokeinterface #63,  1           // InterfaceMethod java/util/List.isEmpty:()Z
        19: ifeq          23
        22: return
        23: getstatic     #17                 // Field _cache:Ljava/util/concurrent/ConcurrentHashMap;
        26: invokevirtual #69                 // Method java/util/concurrent/ConcurrentHashMap.size:()I
        29: getstatic     #72                 // Field ext/mods/Config.PATHFINDING_CACHE_SIZE:I
        32: if_icmplt     38
        35: invokestatic  #75                 // Method clearOldEntries:()V
        38: iload_0
        39: invokestatic  #7                  // Method roundCoord:(I)I
        42: iload_1
        43: invokestatic  #7                  // Method roundCoord:(I)I
        46: iload_2
        47: invokestatic  #7                  // Method roundCoord:(I)I
        50: iload_3
        51: invokestatic  #7                  // Method roundCoord:(I)I
        54: iload         4
        56: invokestatic  #7                  // Method roundCoord:(I)I
        59: iload         5
        61: invokestatic  #7                  // Method roundCoord:(I)I
        64: invokestatic  #13                 // Method createKey:(IIIIII)Ljava/lang/String;
        67: astore        7
        69: getstatic     #17                 // Field _cache:Ljava/util/concurrent/ConcurrentHashMap;
        72: aload         7
        74: new           #27                 // class ext/mods/gameserver/geoengine/PathfindingCache$CachedPath
        77: dup
        78: aload         6
        80: invokestatic  #39                 // Method java/lang/System.currentTimeMillis:()J
        83: invokespecial #79                 // Method ext/mods/gameserver/geoengine/PathfindingCache$CachedPath."<init>":(Ljava/util/List;J)V
        86: invokevirtual #83                 // Method java/util/concurrent/ConcurrentHashMap.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        89: pop
        90: return
      LineNumberTable:
        line 104: 0
        line 105: 6
        line 107: 7
        line 108: 22
        line 110: 23
        line 112: 35
        line 115: 38
        line 116: 39
        line 117: 51
        line 115: 64
        line 120: 69
        line 121: 90
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      91     0    ox   I
            0      91     1    oy   I
            0      91     2    oz   I
            0      91     3    tx   I
            0      91     4    ty   I
            0      91     5    tz   I
            0      91     6  path   Ljava/util/List;
           69      22     7   key   Ljava/lang/String;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      91     6  path   Ljava/util/List<Lext/mods/gameserver/model/location/Location;>;
      StackMapTable: number_of_entries = 4
        frame_type = 7 /* same */
        frame_type = 14 /* same */
        frame_type = 0 /* same */
        frame_type = 14 /* same */
    Signature: #181                         // (IIIIIILjava/util/List<Lext/mods/gameserver/model/location/Location;>;)V

  public static void clearCache();
    descriptor: ()V
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=0, args_size=0
         0: getstatic     #17                 // Field _cache:Ljava/util/concurrent/ConcurrentHashMap;
         3: invokevirtual #114                // Method java/util/concurrent/ConcurrentHashMap.clear:()V
         6: getstatic     #56                 // Field _hits:Ljava/util/concurrent/atomic/AtomicInteger;
         9: iconst_0
        10: invokevirtual #117                // Method java/util/concurrent/atomic/AtomicInteger.set:(I)V
        13: getstatic     #29                 // Field _misses:Ljava/util/concurrent/atomic/AtomicInteger;
        16: iconst_0
        17: invokevirtual #117                // Method java/util/concurrent/atomic/AtomicInteger.set:(I)V
        20: return
      LineNumberTable:
        line 150: 0
        line 151: 6
        line 152: 13
        line 153: 20

  public static double getHitRate();
    descriptor: ()D
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=4, locals=1, args_size=0
         0: getstatic     #56                 // Field _hits:Ljava/util/concurrent/atomic/AtomicInteger;
         3: invokevirtual #121                // Method java/util/concurrent/atomic/AtomicInteger.get:()I
         6: getstatic     #29                 // Field _misses:Ljava/util/concurrent/atomic/AtomicInteger;
         9: invokevirtual #121                // Method java/util/concurrent/atomic/AtomicInteger.get:()I
        12: iadd
        13: istore_0
        14: iload_0
        15: ifne          22
        18: dconst_0
        19: goto          32
        22: getstatic     #56                 // Field _hits:Ljava/util/concurrent/atomic/AtomicInteger;
        25: invokevirtual #121                // Method java/util/concurrent/atomic/AtomicInteger.get:()I
        28: i2d
        29: iload_0
        30: i2d
        31: ddiv
        32: dreturn
      LineNumberTable:
        line 160: 0
        line 161: 14
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           14      19     0 total   I
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 22
          locals = [ int ]
        frame_type = 73 /* same_locals_1_stack_item */
          stack = [ double ]

  public static java.lang.String getStats();
    descriptor: ()Ljava/lang/String;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=8, locals=0, args_size=0
         0: ldc           #123                // String PathfindingCache: %d entries, %.2f%% hit rate (%d hits, %d misses)
         2: iconst_4
         3: anewarray     #125                // class java/lang/Object
         6: dup
         7: iconst_0
         8: getstatic     #17                 // Field _cache:Ljava/util/concurrent/ConcurrentHashMap;
        11: invokevirtual #69                 // Method java/util/concurrent/ConcurrentHashMap.size:()I
        14: invokestatic  #127                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        17: aastore
        18: dup
        19: iconst_1
        20: invokestatic  #133                // Method getHitRate:()D
        23: ldc2_w        #137                // double 100.0d
        26: dmul
        27: invokestatic  #139                // Method java/lang/Double.valueOf:(D)Ljava/lang/Double;
        30: aastore
        31: dup
        32: iconst_2
        33: getstatic     #56                 // Field _hits:Ljava/util/concurrent/atomic/AtomicInteger;
        36: invokevirtual #121                // Method java/util/concurrent/atomic/AtomicInteger.get:()I
        39: invokestatic  #127                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        42: aastore
        43: dup
        44: iconst_3
        45: getstatic     #29                 // Field _misses:Ljava/util/concurrent/atomic/AtomicInteger;
        48: invokevirtual #121                // Method java/util/concurrent/atomic/AtomicInteger.get:()I
        51: invokestatic  #127                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        54: aastore
        55: invokestatic  #144                // Method java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        58: areturn
      LineNumberTable:
        line 169: 0
        line 170: 11
        line 171: 20
        line 172: 36
        line 173: 48
        line 169: 55

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=3, locals=0, args_size=0
         0: new           #22                 // class java/util/concurrent/ConcurrentHashMap
         3: dup
         4: invokespecial #155                // Method java/util/concurrent/ConcurrentHashMap."<init>":()V
         7: putstatic     #17                 // Field _cache:Ljava/util/concurrent/ConcurrentHashMap;
        10: new           #34                 // class java/util/concurrent/atomic/AtomicInteger
        13: dup
        14: iconst_0
        15: invokespecial #156                // Method java/util/concurrent/atomic/AtomicInteger."<init>":(I)V
        18: putstatic     #56                 // Field _hits:Ljava/util/concurrent/atomic/AtomicInteger;
        21: new           #34                 // class java/util/concurrent/atomic/AtomicInteger
        24: dup
        25: iconst_0
        26: invokespecial #156                // Method java/util/concurrent/atomic/AtomicInteger."<init>":(I)V
        29: putstatic     #29                 // Field _misses:Ljava/util/concurrent/atomic/AtomicInteger;
        32: return
      LineNumberTable:
        line 48: 0
        line 50: 10
        line 51: 21
}
SourceFile: "PathfindingCache.java"
NestMembers:
  ext/mods/gameserver/geoengine/PathfindingCache$CachedPath
BootstrapMethods:
  0: #202 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #200 \u0001,\u0001,\u0001>\u0001,\u0001,\u0001
InnerClasses:
  public static #212= #106 of #210;       // Entry=class java/util/Map$Entry of class java/util/Map
  public static final #217= #213 of #215; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
