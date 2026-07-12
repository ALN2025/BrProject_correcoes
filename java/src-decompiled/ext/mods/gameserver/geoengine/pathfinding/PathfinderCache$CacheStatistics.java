// Bytecode for: ext.mods.gameserver.geoengine.pathfinding.PathfinderCache$CacheStatistics
// File: ext\mods\gameserver\geoengine\pathfinding\PathfinderCache$CacheStatistics.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/geoengine/pathfinding/PathfinderCache$CacheStatistics.class
  Last modified 9 de jul de 2026; size 1598 bytes
  MD5 checksum 77754bd3ec264563b4b87402483a74cf
  Compiled from "PathfinderCache.java"
public class ext.mods.gameserver.geoengine.pathfinding.PathfinderCache$CacheStatistics
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/geoengine/pathfinding/PathfinderCache$CacheStatistics
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 6, methods: 3, attributes: 3
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Fieldref           #8.#9          // ext/mods/gameserver/geoengine/pathfinding/PathfinderCache$CacheStatistics.cacheHits:J
   #8 = Class              #10            // ext/mods/gameserver/geoengine/pathfinding/PathfinderCache$CacheStatistics
   #9 = NameAndType        #11:#12        // cacheHits:J
  #10 = Utf8               ext/mods/gameserver/geoengine/pathfinding/PathfinderCache$CacheStatistics
  #11 = Utf8               cacheHits
  #12 = Utf8               J
  #13 = Fieldref           #8.#14         // ext/mods/gameserver/geoengine/pathfinding/PathfinderCache$CacheStatistics.cacheMisses:J
  #14 = NameAndType        #15:#12        // cacheMisses:J
  #15 = Utf8               cacheMisses
  #16 = Fieldref           #8.#17         // ext/mods/gameserver/geoengine/pathfinding/PathfinderCache$CacheStatistics.pathsGenerated:J
  #17 = NameAndType        #18:#12        // pathsGenerated:J
  #18 = Utf8               pathsGenerated
  #19 = Fieldref           #8.#20         // ext/mods/gameserver/geoengine/pathfinding/PathfinderCache$CacheStatistics.pathsLoaded:J
  #20 = NameAndType        #21:#12        // pathsLoaded:J
  #21 = Utf8               pathsLoaded
  #22 = Fieldref           #8.#23         // ext/mods/gameserver/geoengine/pathfinding/PathfinderCache$CacheStatistics.currentCacheSize:I
  #23 = NameAndType        #24:#25        // currentCacheSize:I
  #24 = Utf8               currentCacheSize
  #25 = Utf8               I
  #26 = Fieldref           #8.#27         // ext/mods/gameserver/geoengine/pathfinding/PathfinderCache$CacheStatistics.maxCacheSize:I
  #27 = NameAndType        #28:#25        // maxCacheSize:I
  #28 = Utf8               maxCacheSize
  #29 = String             #30            // Cache Stats - Hits: %d, Misses: %d, Hit Ratio: %.2f%%, Generated: %d, Loaded: %d, Size: %d/%d
  #30 = Utf8               Cache Stats - Hits: %d, Misses: %d, Hit Ratio: %.2f%%, Generated: %d, Loaded: %d, Size: %d/%d
  #31 = Methodref          #32.#33        // java/lang/Long.valueOf:(J)Ljava/lang/Long;
  #32 = Class              #34            // java/lang/Long
  #33 = NameAndType        #35:#36        // valueOf:(J)Ljava/lang/Long;
  #34 = Utf8               java/lang/Long
  #35 = Utf8               valueOf
  #36 = Utf8               (J)Ljava/lang/Long;
  #37 = Methodref          #8.#38         // ext/mods/gameserver/geoengine/pathfinding/PathfinderCache$CacheStatistics.getHitRatio:()D
  #38 = NameAndType        #39:#40        // getHitRatio:()D
  #39 = Utf8               getHitRatio
  #40 = Utf8               ()D
  #41 = Double             100.0d
  #43 = Methodref          #44.#45        // java/lang/Double.valueOf:(D)Ljava/lang/Double;
  #44 = Class              #46            // java/lang/Double
  #45 = NameAndType        #35:#47        // valueOf:(D)Ljava/lang/Double;
  #46 = Utf8               java/lang/Double
  #47 = Utf8               (D)Ljava/lang/Double;
  #48 = Methodref          #49.#50        // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
  #49 = Class              #51            // java/lang/Integer
  #50 = NameAndType        #35:#52        // valueOf:(I)Ljava/lang/Integer;
  #51 = Utf8               java/lang/Integer
  #52 = Utf8               (I)Ljava/lang/Integer;
  #53 = Methodref          #54.#55        // java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
  #54 = Class              #56            // java/lang/String
  #55 = NameAndType        #57:#58        // format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
  #56 = Utf8               java/lang/String
  #57 = Utf8               format
  #58 = Utf8               (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
  #59 = Utf8               (JJJJII)V
  #60 = Utf8               Code
  #61 = Utf8               LineNumberTable
  #62 = Utf8               LocalVariableTable
  #63 = Utf8               this
  #64 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/PathfinderCache$CacheStatistics;
  #65 = Utf8               total
  #66 = Utf8               StackMapTable
  #67 = Utf8               toString
  #68 = Utf8               ()Ljava/lang/String;
  #69 = Utf8               SourceFile
  #70 = Utf8               PathfinderCache.java
  #71 = Utf8               NestHost
  #72 = Class              #73            // ext/mods/gameserver/geoengine/pathfinding/PathfinderCache
  #73 = Utf8               ext/mods/gameserver/geoengine/pathfinding/PathfinderCache
  #74 = Utf8               InnerClasses
  #75 = Utf8               CacheStatistics
{
  public final long cacheHits;
    descriptor: J
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL

  public final long cacheMisses;
    descriptor: J
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL

  public final long pathsGenerated;
    descriptor: J
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL

  public final long pathsLoaded;
    descriptor: J
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL

  public final int currentCacheSize;
    descriptor: I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL

  public final int maxCacheSize;
    descriptor: I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL

  public ext.mods.gameserver.geoengine.pathfinding.PathfinderCache$CacheStatistics(long, long, long, long, int, int);
    descriptor: (JJJJII)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=11, args_size=7
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: lload_1
         6: putfield      #7                  // Field cacheHits:J
         9: aload_0
        10: lload_3
        11: putfield      #13                 // Field cacheMisses:J
        14: aload_0
        15: lload         5
        17: putfield      #16                 // Field pathsGenerated:J
        20: aload_0
        21: lload         7
        23: putfield      #19                 // Field pathsLoaded:J
        26: aload_0
        27: iload         9
        29: putfield      #22                 // Field currentCacheSize:I
        32: aload_0
        33: iload         10
        35: putfield      #26                 // Field maxCacheSize:I
        38: return
      LineNumberTable:
        line 420: 0
        line 421: 4
        line 422: 9
        line 423: 14
        line 424: 20
        line 425: 26
        line 426: 32
        line 427: 38
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      39     0  this   Lext/mods/gameserver/geoengine/pathfinding/PathfinderCache$CacheStatistics;
            0      39     1 cacheHits   J
            0      39     3 cacheMisses   J
            0      39     5 pathsGenerated   J
            0      39     7 pathsLoaded   J
            0      39     9 currentCacheSize   I
            0      39    10 maxCacheSize   I

  public double getHitRatio();
    descriptor: ()D
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=3, args_size=1
         0: aload_0
         1: getfield      #7                  // Field cacheHits:J
         4: aload_0
         5: getfield      #13                 // Field cacheMisses:J
         8: ladd
         9: lstore_1
        10: lload_1
        11: lconst_0
        12: lcmp
        13: ifle          27
        16: aload_0
        17: getfield      #7                  // Field cacheHits:J
        20: l2d
        21: lload_1
        22: l2d
        23: ddiv
        24: goto          28
        27: dconst_0
        28: dreturn
      LineNumberTable:
        line 430: 0
        line 431: 10
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      29     0  this   Lext/mods/gameserver/geoengine/pathfinding/PathfinderCache$CacheStatistics;
           10      19     1 total   J
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 27
          locals = [ long ]
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ double ]

  public java.lang.String toString();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=8, locals=1, args_size=1
         0: ldc           #29                 // String Cache Stats - Hits: %d, Misses: %d, Hit Ratio: %.2f%%, Generated: %d, Loaded: %d, Size: %d/%d
         2: bipush        7
         4: anewarray     #2                  // class java/lang/Object
         7: dup
         8: iconst_0
         9: aload_0
        10: getfield      #7                  // Field cacheHits:J
        13: invokestatic  #31                 // Method java/lang/Long.valueOf:(J)Ljava/lang/Long;
        16: aastore
        17: dup
        18: iconst_1
        19: aload_0
        20: getfield      #13                 // Field cacheMisses:J
        23: invokestatic  #31                 // Method java/lang/Long.valueOf:(J)Ljava/lang/Long;
        26: aastore
        27: dup
        28: iconst_2
        29: aload_0
        30: invokevirtual #37                 // Method getHitRatio:()D
        33: ldc2_w        #41                 // double 100.0d
        36: dmul
        37: invokestatic  #43                 // Method java/lang/Double.valueOf:(D)Ljava/lang/Double;
        40: aastore
        41: dup
        42: iconst_3
        43: aload_0
        44: getfield      #16                 // Field pathsGenerated:J
        47: invokestatic  #31                 // Method java/lang/Long.valueOf:(J)Ljava/lang/Long;
        50: aastore
        51: dup
        52: iconst_4
        53: aload_0
        54: getfield      #19                 // Field pathsLoaded:J
        57: invokestatic  #31                 // Method java/lang/Long.valueOf:(J)Ljava/lang/Long;
        60: aastore
        61: dup
        62: iconst_5
        63: aload_0
        64: getfield      #22                 // Field currentCacheSize:I
        67: invokestatic  #48                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        70: aastore
        71: dup
        72: bipush        6
        74: aload_0
        75: getfield      #26                 // Field maxCacheSize:I
        78: invokestatic  #48                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        81: aastore
        82: invokestatic  #53                 // Method java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        85: areturn
      LineNumberTable:
        line 436: 0
        line 439: 13
        line 440: 47
        line 436: 82
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      86     0  this   Lext/mods/gameserver/geoengine/pathfinding/PathfinderCache$CacheStatistics;
}
SourceFile: "PathfinderCache.java"
NestHost: class ext/mods/gameserver/geoengine/pathfinding/PathfinderCache
InnerClasses:
  public static #75= #8 of #72;           // CacheStatistics=class ext/mods/gameserver/geoengine/pathfinding/PathfinderCache$CacheStatistics of class ext/mods/gameserver/geoengine/pathfinding/PathfinderCache
