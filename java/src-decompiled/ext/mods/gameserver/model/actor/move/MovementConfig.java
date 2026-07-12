// Bytecode for: ext.mods.gameserver.model.actor.move.MovementConfig
// File: ext\mods\gameserver\model\actor\move\MovementConfig.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/actor/move/MovementConfig.class
  Last modified 9 de jul de 2026; size 2951 bytes
  MD5 checksum f58d5b425191e1ede954841dc59d5c23
  Compiled from "MovementConfig.java"
public class ext.mods.gameserver.model.actor.move.MovementConfig
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/actor/move/MovementConfig
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 20, methods: 4, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Fieldref           #8.#9         // ext/mods/gameserver/model/actor/move/MovementConfig.DEBUG_ENABLED:Z
    #8 = Class              #10           // ext/mods/gameserver/model/actor/move/MovementConfig
    #9 = NameAndType        #11:#12       // DEBUG_ENABLED:Z
   #10 = Utf8               ext/mods/gameserver/model/actor/move/MovementConfig
   #11 = Utf8               DEBUG_ENABLED
   #12 = Utf8               Z
   #13 = Methodref          #14.#15       // java/lang/System.currentTimeMillis:()J
   #14 = Class              #16           // java/lang/System
   #15 = NameAndType        #17:#18       // currentTimeMillis:()J
   #16 = Utf8               java/lang/System
   #17 = Utf8               currentTimeMillis
   #18 = Utf8               ()J
   #19 = Fieldref           #8.#20        // ext/mods/gameserver/model/actor/move/MovementConfig.logQueue:Ljava/util/concurrent/ConcurrentLinkedQueue;
   #20 = NameAndType        #21:#22       // logQueue:Ljava/util/concurrent/ConcurrentLinkedQueue;
   #21 = Utf8               logQueue
   #22 = Utf8               Ljava/util/concurrent/ConcurrentLinkedQueue;
   #23 = Methodref          #24.#25       // java/util/concurrent/ConcurrentLinkedQueue.size:()I
   #24 = Class              #26           // java/util/concurrent/ConcurrentLinkedQueue
   #25 = NameAndType        #27:#28       // size:()I
   #26 = Utf8               java/util/concurrent/ConcurrentLinkedQueue
   #27 = Utf8               size
   #28 = Utf8               ()I
   #29 = Fieldref           #8.#30        // ext/mods/gameserver/model/actor/move/MovementConfig.lastPollTime:Ljava/util/concurrent/atomic/AtomicLong;
   #30 = NameAndType        #31:#32       // lastPollTime:Ljava/util/concurrent/atomic/AtomicLong;
   #31 = Utf8               lastPollTime
   #32 = Utf8               Ljava/util/concurrent/atomic/AtomicLong;
   #33 = Methodref          #34.#35       // java/util/concurrent/atomic/AtomicLong.get:()J
   #34 = Class              #36           // java/util/concurrent/atomic/AtomicLong
   #35 = NameAndType        #37:#18       // get:()J
   #36 = Utf8               java/util/concurrent/atomic/AtomicLong
   #37 = Utf8               get
   #38 = Long               10000l
   #40 = Methodref          #24.#41       // java/util/concurrent/ConcurrentLinkedQueue.clear:()V
   #41 = NameAndType        #42:#6        // clear:()V
   #42 = Utf8               clear
   #43 = Fieldref           #14.#44       // java/lang/System.out:Ljava/io/PrintStream;
   #44 = NameAndType        #45:#46       // out:Ljava/io/PrintStream;
   #45 = Utf8               out
   #46 = Utf8               Ljava/io/PrintStream;
   #47 = String             #48           // [MovementConfig] Telemetry auto-disabled.
   #48 = Utf8               [MovementConfig] Telemetry auto-disabled.
   #49 = Methodref          #50.#51       // java/io/PrintStream.println:(Ljava/lang/String;)V
   #50 = Class              #52           // java/io/PrintStream
   #51 = NameAndType        #53:#54       // println:(Ljava/lang/String;)V
   #52 = Utf8               java/io/PrintStream
   #53 = Utf8               println
   #54 = Utf8               (Ljava/lang/String;)V
   #55 = Long               100000l
   #57 = InvokeDynamic      #0:#58        // #0:makeConcatWithConstants:(JLjava/lang/String;)Ljava/lang/String;
   #58 = NameAndType        #59:#60       // makeConcatWithConstants:(JLjava/lang/String;)Ljava/lang/String;
   #59 = Utf8               makeConcatWithConstants
   #60 = Utf8               (JLjava/lang/String;)Ljava/lang/String;
   #61 = Methodref          #24.#62       // java/util/concurrent/ConcurrentLinkedQueue.offer:(Ljava/lang/Object;)Z
   #62 = NameAndType        #63:#64       // offer:(Ljava/lang/Object;)Z
   #63 = Utf8               offer
   #64 = Utf8               (Ljava/lang/Object;)Z
   #65 = Methodref          #34.#66       // java/util/concurrent/atomic/AtomicLong.set:(J)V
   #66 = NameAndType        #67:#68       // set:(J)V
   #67 = Utf8               set
   #68 = Utf8               (J)V
   #69 = Methodref          #24.#70       // java/util/concurrent/ConcurrentLinkedQueue.poll:()Ljava/lang/Object;
   #70 = NameAndType        #71:#72       // poll:()Ljava/lang/Object;
   #71 = Utf8               poll
   #72 = Utf8               ()Ljava/lang/Object;
   #73 = Class              #74           // java/lang/String
   #74 = Utf8               java/lang/String
   #75 = Long               250l
   #77 = Fieldref           #8.#78        // ext/mods/gameserver/model/actor/move/MovementConfig.ATTACK_FOLLOW_INTERVAL:J
   #78 = NameAndType        #79:#80       // ATTACK_FOLLOW_INTERVAL:J
   #79 = Utf8               ATTACK_FOLLOW_INTERVAL
   #80 = Utf8               J
   #81 = Fieldref           #8.#82        // ext/mods/gameserver/model/actor/move/MovementConfig.ZIGZAG_LAYER_OFFSET:I
   #82 = NameAndType        #83:#84       // ZIGZAG_LAYER_OFFSET:I
   #83 = Utf8               ZIGZAG_LAYER_OFFSET
   #84 = Utf8               I
   #85 = Double             0.1d
   #87 = Fieldref           #8.#88        // ext/mods/gameserver/model/actor/move/MovementConfig.RANDOM_SPEED_VARIATION:D
   #88 = NameAndType        #89:#90       // RANDOM_SPEED_VARIATION:D
   #89 = Utf8               RANDOM_SPEED_VARIATION
   #90 = Utf8               D
   #91 = Double             8.0d
   #93 = Fieldref           #8.#94        // ext/mods/gameserver/model/actor/move/MovementConfig.SEPARATION_WEIGHT:D
   #94 = NameAndType        #95:#90       // SEPARATION_WEIGHT:D
   #95 = Utf8               SEPARATION_WEIGHT
   #96 = Double             2.0d
   #98 = Fieldref           #8.#99        // ext/mods/gameserver/model/actor/move/MovementConfig.SEPARATION_RADIUS_MULTIPLIER:D
   #99 = NameAndType        #100:#90      // SEPARATION_RADIUS_MULTIPLIER:D
  #100 = Utf8               SEPARATION_RADIUS_MULTIPLIER
  #101 = Double             0.7d
  #103 = Fieldref           #8.#104       // ext/mods/gameserver/model/actor/move/MovementConfig.COLLISION_PUSH_FACTOR:D
  #104 = NameAndType        #105:#90      // COLLISION_PUSH_FACTOR:D
  #105 = Utf8               COLLISION_PUSH_FACTOR
  #106 = Double             30.0d
  #108 = Fieldref           #8.#109       // ext/mods/gameserver/model/actor/move/MovementConfig.MIN_DISTANCE_BETWEEN_MOBS:D
  #109 = NameAndType        #110:#90      // MIN_DISTANCE_BETWEEN_MOBS:D
  #110 = Utf8               MIN_DISTANCE_BETWEEN_MOBS
  #111 = Double             50.0d
  #113 = Fieldref           #8.#114       // ext/mods/gameserver/model/actor/move/MovementConfig.HYSTERESIS_BUFFER:D
  #114 = NameAndType        #115:#90      // HYSTERESIS_BUFFER:D
  #115 = Utf8               HYSTERESIS_BUFFER
  #116 = Methodref          #24.#3        // java/util/concurrent/ConcurrentLinkedQueue."<init>":()V
  #117 = Methodref          #34.#118      // java/util/concurrent/atomic/AtomicLong."<init>":(J)V
  #118 = NameAndType        #5:#68        // "<init>":(J)V
  #119 = Utf8               DEFAULT_ATTACK_FOLLOW_INTERVAL
  #120 = Utf8               ConstantValue
  #121 = Utf8               DEFAULT_ZIGZAG_LAYER_OFFSET
  #122 = Integer            50
  #123 = Utf8               DEFAULT_RANDOM_SPEED_VARIATION
  #124 = Utf8               DEFAULT_SEPARATION_WEIGHT
  #125 = Utf8               DEFAULT_SEPARATION_RADIUS_MULTIPLIER
  #126 = Utf8               DEFAULT_COLLISION_PUSH_FACTOR
  #127 = Utf8               DEFAULT_MIN_DISTANCE_BETWEEN_MOBS
  #128 = Utf8               DEFAULT_HYSTERESIS_BUFFER
  #129 = Utf8               Signature
  #130 = Utf8               Ljava/util/concurrent/ConcurrentLinkedQueue<Ljava/lang/String;>;
  #131 = Utf8               MAX_LOG_SIZE
  #132 = Integer            100
  #133 = Utf8               Code
  #134 = Utf8               LineNumberTable
  #135 = Utf8               LocalVariableTable
  #136 = Utf8               this
  #137 = Utf8               Lext/mods/gameserver/model/actor/move/MovementConfig;
  #138 = Utf8               log
  #139 = Utf8               msg
  #140 = Utf8               Ljava/lang/String;
  #141 = Utf8               now
  #142 = Utf8               StackMapTable
  #143 = Utf8               pollLog
  #144 = Utf8               ()Ljava/lang/String;
  #145 = Utf8               <clinit>
  #146 = Utf8               SourceFile
  #147 = Utf8               MovementConfig.java
  #148 = Utf8               BootstrapMethods
  #149 = String             #150          // [\u0001] \u0001
  #150 = Utf8               [\u0001] \u0001
  #151 = MethodHandle       6:#152        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #152 = Methodref          #153.#154     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #153 = Class              #155          // java/lang/invoke/StringConcatFactory
  #154 = NameAndType        #59:#156      // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #155 = Utf8               java/lang/invoke/StringConcatFactory
  #156 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #157 = Utf8               InnerClasses
  #158 = Class              #159          // java/lang/invoke/MethodHandles$Lookup
  #159 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #160 = Class              #161          // java/lang/invoke/MethodHandles
  #161 = Utf8               java/lang/invoke/MethodHandles
  #162 = Utf8               Lookup
{
  public static volatile boolean DEBUG_ENABLED;
    descriptor: Z
    flags: (0x0049) ACC_PUBLIC, ACC_STATIC, ACC_VOLATILE

  public static volatile long ATTACK_FOLLOW_INTERVAL;
    descriptor: J
    flags: (0x0049) ACC_PUBLIC, ACC_STATIC, ACC_VOLATILE

  public static final long DEFAULT_ATTACK_FOLLOW_INTERVAL;
    descriptor: J
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: long 250l

  public static volatile int ZIGZAG_LAYER_OFFSET;
    descriptor: I
    flags: (0x0049) ACC_PUBLIC, ACC_STATIC, ACC_VOLATILE

  public static final int DEFAULT_ZIGZAG_LAYER_OFFSET;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 50

  public static volatile double RANDOM_SPEED_VARIATION;
    descriptor: D
    flags: (0x0049) ACC_PUBLIC, ACC_STATIC, ACC_VOLATILE

  public static final double DEFAULT_RANDOM_SPEED_VARIATION;
    descriptor: D
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: double 0.1d

  public static volatile double SEPARATION_WEIGHT;
    descriptor: D
    flags: (0x0049) ACC_PUBLIC, ACC_STATIC, ACC_VOLATILE

  public static final double DEFAULT_SEPARATION_WEIGHT;
    descriptor: D
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: double 8.0d

  public static volatile double SEPARATION_RADIUS_MULTIPLIER;
    descriptor: D
    flags: (0x0049) ACC_PUBLIC, ACC_STATIC, ACC_VOLATILE

  public static final double DEFAULT_SEPARATION_RADIUS_MULTIPLIER;
    descriptor: D
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: double 2.0d

  public static volatile double COLLISION_PUSH_FACTOR;
    descriptor: D
    flags: (0x0049) ACC_PUBLIC, ACC_STATIC, ACC_VOLATILE

  public static final double DEFAULT_COLLISION_PUSH_FACTOR;
    descriptor: D
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: double 0.7d

  public static volatile double MIN_DISTANCE_BETWEEN_MOBS;
    descriptor: D
    flags: (0x0049) ACC_PUBLIC, ACC_STATIC, ACC_VOLATILE

  public static final double DEFAULT_MIN_DISTANCE_BETWEEN_MOBS;
    descriptor: D
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: double 30.0d

  public static volatile double HYSTERESIS_BUFFER;
    descriptor: D
    flags: (0x0049) ACC_PUBLIC, ACC_STATIC, ACC_VOLATILE

  public static final double DEFAULT_HYSTERESIS_BUFFER;
    descriptor: D
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: double 50.0d

  public ext.mods.gameserver.model.actor.move.MovementConfig();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 27: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/move/MovementConfig;

  public static void log(java.lang.String);
    descriptor: (Ljava/lang/String;)V
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=5, locals=3, args_size=1
         0: getstatic     #7                  // Field DEBUG_ENABLED:Z
         3: ifne          7
         6: return
         7: invokestatic  #13                 // Method java/lang/System.currentTimeMillis:()J
        10: lstore_1
        11: getstatic     #19                 // Field logQueue:Ljava/util/concurrent/ConcurrentLinkedQueue;
        14: invokevirtual #23                 // Method java/util/concurrent/ConcurrentLinkedQueue.size:()I
        17: bipush        100
        19: if_icmpge     37
        22: lload_1
        23: getstatic     #29                 // Field lastPollTime:Ljava/util/concurrent/atomic/AtomicLong;
        26: invokevirtual #33                 // Method java/util/concurrent/atomic/AtomicLong.get:()J
        29: lsub
        30: ldc2_w        #38                 // long 10000l
        33: lcmp
        34: ifle          56
        37: iconst_0
        38: putstatic     #7                  // Field DEBUG_ENABLED:Z
        41: getstatic     #19                 // Field logQueue:Ljava/util/concurrent/ConcurrentLinkedQueue;
        44: invokevirtual #40                 // Method java/util/concurrent/ConcurrentLinkedQueue.clear:()V
        47: getstatic     #43                 // Field java/lang/System.out:Ljava/io/PrintStream;
        50: ldc           #47                 // String [MovementConfig] Telemetry auto-disabled.
        52: invokevirtual #49                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
        55: return
        56: getstatic     #19                 // Field logQueue:Ljava/util/concurrent/ConcurrentLinkedQueue;
        59: lload_1
        60: ldc2_w        #55                 // long 100000l
        63: lrem
        64: aload_0
        65: invokedynamic #57,  0             // InvokeDynamic #0:makeConcatWithConstants:(JLjava/lang/String;)Ljava/lang/String;
        70: invokevirtual #61                 // Method java/util/concurrent/ConcurrentLinkedQueue.offer:(Ljava/lang/Object;)Z
        73: pop
        74: return
      LineNumberTable:
        line 61: 0
        line 63: 7
        line 64: 11
        line 65: 37
        line 66: 41
        line 67: 47
        line 68: 55
        line 70: 56
        line 71: 74
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      75     0   msg   Ljava/lang/String;
           11      64     1   now   J
      StackMapTable: number_of_entries = 3
        frame_type = 7 /* same */
        frame_type = 252 /* append */
          offset_delta = 29
          locals = [ long ]
        frame_type = 18 /* same */

  public static java.lang.String pollLog();
    descriptor: ()Ljava/lang/String;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=3, locals=0, args_size=0
         0: getstatic     #29                 // Field lastPollTime:Ljava/util/concurrent/atomic/AtomicLong;
         3: invokestatic  #13                 // Method java/lang/System.currentTimeMillis:()J
         6: invokevirtual #65                 // Method java/util/concurrent/atomic/AtomicLong.set:(J)V
         9: getstatic     #19                 // Field logQueue:Ljava/util/concurrent/ConcurrentLinkedQueue;
        12: invokevirtual #69                 // Method java/util/concurrent/ConcurrentLinkedQueue.poll:()Ljava/lang/Object;
        15: checkcast     #73                 // class java/lang/String
        18: areturn
      LineNumberTable:
        line 74: 0
        line 75: 9

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: iconst_0
         1: putstatic     #7                  // Field DEBUG_ENABLED:Z
         4: ldc2_w        #75                 // long 250l
         7: putstatic     #77                 // Field ATTACK_FOLLOW_INTERVAL:J
        10: bipush        50
        12: putstatic     #81                 // Field ZIGZAG_LAYER_OFFSET:I
        15: ldc2_w        #85                 // double 0.1d
        18: putstatic     #87                 // Field RANDOM_SPEED_VARIATION:D
        21: ldc2_w        #91                 // double 8.0d
        24: putstatic     #93                 // Field SEPARATION_WEIGHT:D
        27: ldc2_w        #96                 // double 2.0d
        30: putstatic     #98                 // Field SEPARATION_RADIUS_MULTIPLIER:D
        33: ldc2_w        #101                // double 0.7d
        36: putstatic     #103                // Field COLLISION_PUSH_FACTOR:D
        39: ldc2_w        #106                // double 30.0d
        42: putstatic     #108                // Field MIN_DISTANCE_BETWEEN_MOBS:D
        45: ldc2_w        #111                // double 50.0d
        48: putstatic     #113                // Field HYSTERESIS_BUFFER:D
        51: new           #24                 // class java/util/concurrent/ConcurrentLinkedQueue
        54: dup
        55: invokespecial #116                // Method java/util/concurrent/ConcurrentLinkedQueue."<init>":()V
        58: putstatic     #19                 // Field logQueue:Ljava/util/concurrent/ConcurrentLinkedQueue;
        61: new           #34                 // class java/util/concurrent/atomic/AtomicLong
        64: dup
        65: invokestatic  #13                 // Method java/lang/System.currentTimeMillis:()J
        68: invokespecial #117                // Method java/util/concurrent/atomic/AtomicLong."<init>":(J)V
        71: putstatic     #29                 // Field lastPollTime:Ljava/util/concurrent/atomic/AtomicLong;
        74: return
      LineNumberTable:
        line 29: 0
        line 31: 4
        line 34: 10
        line 37: 15
        line 41: 21
        line 44: 27
        line 47: 33
        line 50: 39
        line 53: 45
        line 56: 51
        line 58: 61
}
SourceFile: "MovementConfig.java"
BootstrapMethods:
  0: #151 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #149 [\u0001] \u0001
InnerClasses:
  public static final #162= #158 of #160; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
