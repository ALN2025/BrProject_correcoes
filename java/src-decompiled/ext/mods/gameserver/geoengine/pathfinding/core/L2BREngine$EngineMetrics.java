// Bytecode for: ext.mods.gameserver.geoengine.pathfinding.core.L2BREngine$EngineMetrics
// File: ext\mods\gameserver\geoengine\pathfinding\core\L2BREngine$EngineMetrics.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine$EngineMetrics.class
  Last modified 9 de jul de 2026; size 2962 bytes
  MD5 checksum ca1624e906dd36e4ccbf87ba8a091d6b
  Compiled from "L2BREngine.kt"
final class ext.mods.gameserver.geoengine.pathfinding.core.L2BREngine$EngineMetrics
  minor version: 0
  major version: 69
  flags: (0x0030) ACC_FINAL, ACC_SUPER
  this_class: #2                          // ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine$EngineMetrics
  super_class: #4                         // java/lang/Object
  interfaces: 0, fields: 5, methods: 4, attributes: 3
Constant pool:
    #1 = Utf8               ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine$EngineMetrics
    #2 = Class              #1            // ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine$EngineMetrics
    #3 = Utf8               java/lang/Object
    #4 = Class              #3            // java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = NameAndType        #5:#6         // "<init>":()V
    #8 = Methodref          #4.#7         // java/lang/Object."<init>":()V
    #9 = Utf8               java/util/concurrent/atomic/AtomicLong
   #10 = Class              #9            // java/util/concurrent/atomic/AtomicLong
   #11 = Utf8               (J)V
   #12 = NameAndType        #5:#11        // "<init>":(J)V
   #13 = Methodref          #10.#12       // java/util/concurrent/atomic/AtomicLong."<init>":(J)V
   #14 = Utf8               totalCalls
   #15 = Utf8               Ljava/util/concurrent/atomic/AtomicLong;
   #16 = NameAndType        #14:#15       // totalCalls:Ljava/util/concurrent/atomic/AtomicLong;
   #17 = Fieldref           #2.#16        // ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine$EngineMetrics.totalCalls:Ljava/util/concurrent/atomic/AtomicLong;
   #18 = Utf8               successfulCalls
   #19 = NameAndType        #18:#15       // successfulCalls:Ljava/util/concurrent/atomic/AtomicLong;
   #20 = Fieldref           #2.#19        // ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine$EngineMetrics.successfulCalls:Ljava/util/concurrent/atomic/AtomicLong;
   #21 = Utf8               failedCalls
   #22 = NameAndType        #21:#15       // failedCalls:Ljava/util/concurrent/atomic/AtomicLong;
   #23 = Fieldref           #2.#22        // ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine$EngineMetrics.failedCalls:Ljava/util/concurrent/atomic/AtomicLong;
   #24 = Utf8               totalTimeNanos
   #25 = NameAndType        #24:#15       // totalTimeNanos:Ljava/util/concurrent/atomic/AtomicLong;
   #26 = Fieldref           #2.#25        // ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine$EngineMetrics.totalTimeNanos:Ljava/util/concurrent/atomic/AtomicLong;
   #27 = Utf8               timeHistogram
   #28 = Utf8               [J
   #29 = NameAndType        #27:#28       // timeHistogram:[J
   #30 = Fieldref           #2.#29        // ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine$EngineMetrics.timeHistogram:[J
   #31 = Utf8               this
   #32 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine$EngineMetrics;
   #33 = Class              #28           // "[J"
   #34 = Utf8               recordSuccess
   #35 = Utf8               incrementAndGet
   #36 = Utf8               ()J
   #37 = NameAndType        #35:#36       // incrementAndGet:()J
   #38 = Methodref          #10.#37       // java/util/concurrent/atomic/AtomicLong.incrementAndGet:()J
   #39 = Utf8               addAndGet
   #40 = Utf8               (J)J
   #41 = NameAndType        #39:#40       // addAndGet:(J)J
   #42 = Methodref          #10.#41       // java/util/concurrent/atomic/AtomicLong.addAndGet:(J)J
   #43 = Long               5l
   #45 = Long               10l
   #47 = Long               50l
   #49 = Long               100l
   #51 = Long               500l
   #53 = Long               1000l
   #55 = Long               5000l
   #57 = Long               10000l
   #59 = Utf8               micros
   #60 = Utf8               J
   #61 = Utf8               bin
   #62 = Utf8               I
   #63 = Utf8               durationNanos
   #64 = Utf8               recordFailure
   #65 = Utf8               snapshot
   #66 = Utf8               ()Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine$EngineMetricsSnapshot;
   #67 = Utf8               Lorg/jetbrains/annotations/NotNull;
   #68 = Utf8               get
   #69 = NameAndType        #68:#36       // get:()J
   #70 = Methodref          #10.#69       // java/util/concurrent/atomic/AtomicLong.get:()J
   #71 = Utf8               ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine$EngineMetricsSnapshot
   #72 = Class              #71           // ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine$EngineMetricsSnapshot
   #73 = Double             1000.0d
   #75 = Double             100.0d
   #77 = Utf8               java/util/Arrays
   #78 = Class              #77           // java/util/Arrays
   #79 = Utf8               copyOf
   #80 = Utf8               ([JI)[J
   #81 = NameAndType        #79:#80       // copyOf:([JI)[J
   #82 = Methodref          #78.#81       // java/util/Arrays.copyOf:([JI)[J
   #83 = Utf8               copyOf(...)
   #84 = String             #83           // copyOf(...)
   #85 = Utf8               kotlin/jvm/internal/Intrinsics
   #86 = Class              #85           // kotlin/jvm/internal/Intrinsics
   #87 = Utf8               checkNotNullExpressionValue
   #88 = Utf8               (Ljava/lang/Object;Ljava/lang/String;)V
   #89 = NameAndType        #87:#88       // checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
   #90 = Methodref          #86.#89       // kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
   #91 = Utf8               (JJJDD[J)V
   #92 = NameAndType        #5:#91        // "<init>":(JJJDD[J)V
   #93 = Methodref          #72.#92       // ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine$EngineMetricsSnapshot."<init>":(JJJDD[J)V
   #94 = Utf8               total
   #95 = Utf8               success
   #96 = Utf8               avgTime
   #97 = Utf8               Lkotlin/Metadata;
   #98 = Utf8               mv
   #99 = Integer            2
  #100 = Integer            3
  #101 = Integer            0
  #102 = Utf8               k
  #103 = Integer            1
  #104 = Utf8               xi
  #105 = Integer            48
  #106 = Utf8               d1
  #107 = Utf8               \u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0006\u0010\u000f\u001a\u00020\fJ\u0006\u0010\u0010\u001a\u00020\u0011R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012
  #108 = Utf8               d2
  #109 = Utf8
  #110 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine$EngineMetricsSnapshot;
  #111 = Utf8               Brproject
  #112 = Utf8               ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine
  #113 = Class              #112          // ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine
  #114 = Utf8               EngineMetrics
  #115 = Utf8               EngineMetricsSnapshot
  #116 = Utf8               L2BREngine.kt
  #117 = Utf8               RuntimeInvisibleAnnotations
  #118 = Utf8               Code
  #119 = Utf8               StackMapTable
  #120 = Utf8               LineNumberTable
  #121 = Utf8               LocalVariableTable
  #122 = Utf8               InnerClasses
  #123 = Utf8               SourceFile
  #124 = Utf8               RuntimeVisibleAnnotations
{
  public ext.mods.gameserver.geoengine.pathfinding.core.L2BREngine$EngineMetrics();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=5, args_size=1
         0: aload_0
         1: invokespecial #8                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: new           #10                 // class java/util/concurrent/atomic/AtomicLong
         8: dup
         9: lconst_0
        10: invokespecial #13                 // Method java/util/concurrent/atomic/AtomicLong."<init>":(J)V
        13: putfield      #17                 // Field totalCalls:Ljava/util/concurrent/atomic/AtomicLong;
        16: aload_0
        17: new           #10                 // class java/util/concurrent/atomic/AtomicLong
        20: dup
        21: lconst_0
        22: invokespecial #13                 // Method java/util/concurrent/atomic/AtomicLong."<init>":(J)V
        25: putfield      #20                 // Field successfulCalls:Ljava/util/concurrent/atomic/AtomicLong;
        28: aload_0
        29: new           #10                 // class java/util/concurrent/atomic/AtomicLong
        32: dup
        33: lconst_0
        34: invokespecial #13                 // Method java/util/concurrent/atomic/AtomicLong."<init>":(J)V
        37: putfield      #23                 // Field failedCalls:Ljava/util/concurrent/atomic/AtomicLong;
        40: aload_0
        41: new           #10                 // class java/util/concurrent/atomic/AtomicLong
        44: dup
        45: lconst_0
        46: invokespecial #13                 // Method java/util/concurrent/atomic/AtomicLong."<init>":(J)V
        49: putfield      #26                 // Field totalTimeNanos:Ljava/util/concurrent/atomic/AtomicLong;
        52: aload_0
        53: iconst_0
        54: istore_1
        55: bipush        10
        57: newarray       long
        59: astore_2
        60: astore        4
        62: iload_1
        63: bipush        10
        65: if_icmpge     80
        68: iload_1
        69: istore_3
        70: aload_2
        71: iload_3
        72: lconst_0
        73: lastore
        74: iinc          1, 1
        77: goto          62
        80: aload         4
        82: aload_2
        83: putfield      #30                 // Field timeHistogram:[J
        86: return
      StackMapTable: number_of_entries = 2
        frame_type = 255 /* full_frame */
          offset_delta = 62
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine$EngineMetrics, int, class "[J", top, class ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine$EngineMetrics ]
          stack = []
        frame_type = 17 /* same */
      LineNumberTable:
        line 261: 0
        line 262: 4
        line 263: 16
        line 264: 28
        line 265: 40
        line 266: 52
        line 261: 86
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      87     0  this   Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine$EngineMetrics;

  public final void recordSuccess(long);
    descriptor: (J)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=6, locals=9, args_size=2
         0: aload_0
         1: getfield      #17                 // Field totalCalls:Ljava/util/concurrent/atomic/AtomicLong;
         4: invokevirtual #38                 // Method java/util/concurrent/atomic/AtomicLong.incrementAndGet:()J
         7: pop2
         8: aload_0
         9: getfield      #20                 // Field successfulCalls:Ljava/util/concurrent/atomic/AtomicLong;
        12: invokevirtual #38                 // Method java/util/concurrent/atomic/AtomicLong.incrementAndGet:()J
        15: pop2
        16: aload_0
        17: getfield      #26                 // Field totalTimeNanos:Ljava/util/concurrent/atomic/AtomicLong;
        20: lload_1
        21: invokevirtual #42                 // Method java/util/concurrent/atomic/AtomicLong.addAndGet:(J)J
        24: pop2
        25: lload_1
        26: sipush        1000
        29: i2l
        30: ldiv
        31: lstore_3
        32: nop
        33: lload_3
        34: lconst_1
        35: lcmp
        36: ifge          43
        39: iconst_0
        40: goto          144
        43: lload_3
        44: ldc2_w        #43                 // long 5l
        47: lcmp
        48: ifge          55
        51: iconst_1
        52: goto          144
        55: lload_3
        56: ldc2_w        #45                 // long 10l
        59: lcmp
        60: ifge          67
        63: iconst_2
        64: goto          144
        67: lload_3
        68: ldc2_w        #47                 // long 50l
        71: lcmp
        72: ifge          79
        75: iconst_3
        76: goto          144
        79: lload_3
        80: ldc2_w        #49                 // long 100l
        83: lcmp
        84: ifge          91
        87: iconst_4
        88: goto          144
        91: lload_3
        92: ldc2_w        #51                 // long 500l
        95: lcmp
        96: ifge          103
        99: iconst_5
       100: goto          144
       103: lload_3
       104: ldc2_w        #53                 // long 1000l
       107: lcmp
       108: ifge          116
       111: bipush        6
       113: goto          144
       116: lload_3
       117: ldc2_w        #55                 // long 5000l
       120: lcmp
       121: ifge          129
       124: bipush        7
       126: goto          144
       129: lload_3
       130: ldc2_w        #57                 // long 10000l
       133: lcmp
       134: ifge          142
       137: bipush        8
       139: goto          144
       142: bipush        9
       144: istore        5
       146: aload_0
       147: getfield      #30                 // Field timeHistogram:[J
       150: astore        6
       152: aload         6
       154: iload         5
       156: laload
       157: lstore        7
       159: aload         6
       161: iload         5
       163: lload         7
       165: lconst_1
       166: ladd
       167: lastore
       168: return
      StackMapTable: number_of_entries = 10
        frame_type = 252 /* append */
          offset_delta = 43
          locals = [ long ]
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 12 /* same */
        frame_type = 12 /* same */
        frame_type = 12 /* same */
        frame_type = 65 /* same_locals_1_stack_item */
          stack = [ int ]
      LineNumberTable:
        line 269: 0
        line 270: 8
        line 271: 16
        line 273: 25
        line 274: 32
        line 275: 33
        line 276: 43
        line 277: 55
        line 278: 67
        line 279: 79
        line 280: 91
        line 281: 103
        line 282: 116
        line 283: 129
        line 284: 142
        line 274: 144
        line 286: 146
        line 287: 168
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           32     137     3 micros   J
          146      23     5   bin   I
            0     169     0  this   Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine$EngineMetrics;
            0     169     1 durationNanos   J

  public final void recordFailure();
    descriptor: ()V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #17                 // Field totalCalls:Ljava/util/concurrent/atomic/AtomicLong;
         4: invokevirtual #38                 // Method java/util/concurrent/atomic/AtomicLong.incrementAndGet:()J
         7: pop2
         8: aload_0
         9: getfield      #23                 // Field failedCalls:Ljava/util/concurrent/atomic/AtomicLong;
        12: invokevirtual #38                 // Method java/util/concurrent/atomic/AtomicLong.incrementAndGet:()J
        15: pop2
        16: return
      LineNumberTable:
        line 290: 0
        line 291: 8
        line 292: 16
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      17     0  this   Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine$EngineMetrics;

  public final ext.mods.gameserver.geoengine.pathfinding.core.L2BREngine$EngineMetricsSnapshot snapshot();
    descriptor: ()Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine$EngineMetricsSnapshot;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=15, locals=7, args_size=1
         0: aload_0
         1: getfield      #17                 // Field totalCalls:Ljava/util/concurrent/atomic/AtomicLong;
         4: invokevirtual #70                 // Method java/util/concurrent/atomic/AtomicLong.get:()J
         7: lstore_1
         8: aload_0
         9: getfield      #20                 // Field successfulCalls:Ljava/util/concurrent/atomic/AtomicLong;
        12: invokevirtual #70                 // Method java/util/concurrent/atomic/AtomicLong.get:()J
        15: lstore_3
        16: lload_3
        17: lconst_0
        18: lcmp
        19: ifle          34
        22: aload_0
        23: getfield      #26                 // Field totalTimeNanos:Ljava/util/concurrent/atomic/AtomicLong;
        26: invokevirtual #70                 // Method java/util/concurrent/atomic/AtomicLong.get:()J
        29: lload_3
        30: ldiv
        31: goto          35
        34: lconst_0
        35: lstore        5
        37: new           #72                 // class ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine$EngineMetricsSnapshot
        40: dup
        41: lload_1
        42: lload_3
        43: aload_0
        44: getfield      #23                 // Field failedCalls:Ljava/util/concurrent/atomic/AtomicLong;
        47: invokevirtual #70                 // Method java/util/concurrent/atomic/AtomicLong.get:()J
        50: lload         5
        52: l2d
        53: ldc2_w        #73                 // double 1000.0d
        56: ddiv
        57: lload_1
        58: lconst_0
        59: lcmp
        60: ifle          75
        63: lload_3
        64: l2d
        65: ldc2_w        #75                 // double 100.0d
        68: dmul
        69: lload_1
        70: l2d
        71: ddiv
        72: goto          76
        75: dconst_0
        76: aload_0
        77: getfield      #30                 // Field timeHistogram:[J
        80: dup
        81: arraylength
        82: invokestatic  #82                 // Method java/util/Arrays.copyOf:([JI)[J
        85: dup
        86: ldc           #84                 // String copyOf(...)
        88: invokestatic  #90                 // Method kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        91: invokespecial #93                 // Method ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine$EngineMetricsSnapshot."<init>":(JJJDD[J)V
        94: areturn
      StackMapTable: number_of_entries = 4
        frame_type = 253 /* append */
          offset_delta = 34
          locals = [ long, long ]
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ long ]
        frame_type = 255 /* full_frame */
          offset_delta = 39
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine$EngineMetrics, long, long, long ]
          stack = [ uninitialized 37, uninitialized 37, long, long, long, double ]
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine$EngineMetrics, long, long, long ]
          stack = [ uninitialized 37, uninitialized 37, long, long, long, double, double ]
      LineNumberTable:
        line 295: 0
        line 296: 8
        line 297: 16
        line 299: 37
        line 300: 41
        line 301: 42
        line 302: 43
        line 303: 50
        line 304: 57
        line 305: 76
        line 299: 91
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            8      87     1 total   J
           16      79     3 success   J
           37      58     5 avgTime   J
            0      95     0  this   Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine$EngineMetrics;
    RuntimeInvisibleAnnotations:
      0: #67()
        org.jetbrains.annotations.NotNull
}
InnerClasses:
  public static final #115= #72 of #113;  // EngineMetricsSnapshot=class ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine$EngineMetricsSnapshot of class ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine
SourceFile: "L2BREngine.kt"
RuntimeVisibleAnnotations:
  0: #97(#98=[I#99,I#100,I#101],#102=I#103,#104=I#105,#106=[s#107],#108=[s#32,s#109,s#5,s#6,s#14,s#15,s#18,s#21,s#24,s#27,s#109,s#34,s#109,s#63,s#109,s#64,s#65,s#110,s#111])
    kotlin.Metadata(
      mv=[2,3,0]
      k=1
      xi=48
      d1=["\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0006\u0010\u000f\u001a\u00020\fJ\u0006\u0010\u0010\u001a\u00020\u0011R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"]
      d2=["Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine$EngineMetrics;","","<init>","()V","totalCalls","Ljava/util/concurrent/atomic/AtomicLong;","successfulCalls","failedCalls","totalTimeNanos","timeHistogram","","recordSuccess","","durationNanos","","recordFailure","snapshot","Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine$EngineMetricsSnapshot;","Brproject"]
    )
