// Bytecode for: ext.mods.gameserver.network.ClientStats
// File: ext\mods\gameserver\network\ClientStats.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/network/ClientStats.class
  Last modified 9 de jul de 2026; size 3831 bytes
  MD5 checksum 2059a506202a0508dadfe3ea933ecbfc
  Compiled from "ClientStats.java"
public class ext.mods.gameserver.network.ClientStats
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/network/ClientStats
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 26, methods: 10, attributes: 1
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Fieldref           #8.#9         // ext/mods/gameserver/network/ClientStats.processedPackets:I
    #8 = Class              #10           // ext/mods/gameserver/network/ClientStats
    #9 = NameAndType        #11:#12       // processedPackets:I
   #10 = Utf8               ext/mods/gameserver/network/ClientStats
   #11 = Utf8               processedPackets
   #12 = Utf8               I
   #13 = Fieldref           #8.#14        // ext/mods/gameserver/network/ClientStats.droppedPackets:I
   #14 = NameAndType        #15:#12       // droppedPackets:I
   #15 = Utf8               droppedPackets
   #16 = Fieldref           #8.#17        // ext/mods/gameserver/network/ClientStats.unknownPackets:I
   #17 = NameAndType        #18:#12       // unknownPackets:I
   #18 = Utf8               unknownPackets
   #19 = Fieldref           #8.#20        // ext/mods/gameserver/network/ClientStats.totalQueueSize:I
   #20 = NameAndType        #21:#12       // totalQueueSize:I
   #21 = Utf8               totalQueueSize
   #22 = Fieldref           #8.#23        // ext/mods/gameserver/network/ClientStats.maxQueueSize:I
   #23 = NameAndType        #24:#12       // maxQueueSize:I
   #24 = Utf8               maxQueueSize
   #25 = Fieldref           #8.#26        // ext/mods/gameserver/network/ClientStats.totalBursts:I
   #26 = NameAndType        #27:#12       // totalBursts:I
   #27 = Utf8               totalBursts
   #28 = Fieldref           #8.#29        // ext/mods/gameserver/network/ClientStats.maxBurstSize:I
   #29 = NameAndType        #30:#12       // maxBurstSize:I
   #30 = Utf8               maxBurstSize
   #31 = Fieldref           #8.#32        // ext/mods/gameserver/network/ClientStats.shortFloods:I
   #32 = NameAndType        #33:#12       // shortFloods:I
   #33 = Utf8               shortFloods
   #34 = Fieldref           #8.#35        // ext/mods/gameserver/network/ClientStats.longFloods:I
   #35 = NameAndType        #36:#12       // longFloods:I
   #36 = Utf8               longFloods
   #37 = Fieldref           #8.#38        // ext/mods/gameserver/network/ClientStats.totalQueueOverflows:I
   #38 = NameAndType        #39:#12       // totalQueueOverflows:I
   #39 = Utf8               totalQueueOverflows
   #40 = Fieldref           #8.#41        // ext/mods/gameserver/network/ClientStats.totalUnderflowExceptions:I
   #41 = NameAndType        #42:#12       // totalUnderflowExceptions:I
   #42 = Utf8               totalUnderflowExceptions
   #43 = Fieldref           #8.#44        // ext/mods/gameserver/network/ClientStats._packetCountStartTick:J
   #44 = NameAndType        #45:#46       // _packetCountStartTick:J
   #45 = Utf8               _packetCountStartTick
   #46 = Utf8               J
   #47 = Fieldref           #8.#48        // ext/mods/gameserver/network/ClientStats._totalCount:I
   #48 = NameAndType        #49:#12       // _totalCount:I
   #49 = Utf8               _totalCount
   #50 = Fieldref           #8.#51        // ext/mods/gameserver/network/ClientStats._floodsInMin:I
   #51 = NameAndType        #52:#12       // _floodsInMin:I
   #52 = Utf8               _floodsInMin
   #53 = Fieldref           #8.#54        // ext/mods/gameserver/network/ClientStats._floodStartTick:J
   #54 = NameAndType        #55:#46       // _floodStartTick:J
   #55 = Utf8               _floodStartTick
   #56 = Fieldref           #8.#57        // ext/mods/gameserver/network/ClientStats._unknownPacketsInMin:I
   #57 = NameAndType        #58:#12       // _unknownPacketsInMin:I
   #58 = Utf8               _unknownPacketsInMin
   #59 = Fieldref           #8.#60        // ext/mods/gameserver/network/ClientStats._unknownPacketStartTick:J
   #60 = NameAndType        #61:#46       // _unknownPacketStartTick:J
   #61 = Utf8               _unknownPacketStartTick
   #62 = Fieldref           #8.#63        // ext/mods/gameserver/network/ClientStats._overflowsInMin:I
   #63 = NameAndType        #64:#12       // _overflowsInMin:I
   #64 = Utf8               _overflowsInMin
   #65 = Fieldref           #8.#66        // ext/mods/gameserver/network/ClientStats._overflowStartTick:J
   #66 = NameAndType        #67:#46       // _overflowStartTick:J
   #67 = Utf8               _overflowStartTick
   #68 = Fieldref           #8.#69        // ext/mods/gameserver/network/ClientStats._underflowReadsInMin:I
   #69 = NameAndType        #70:#12       // _underflowReadsInMin:I
   #70 = Utf8               _underflowReadsInMin
   #71 = Fieldref           #8.#72        // ext/mods/gameserver/network/ClientStats._underflowReadStartTick:J
   #72 = NameAndType        #73:#46       // _underflowReadStartTick:J
   #73 = Utf8               _underflowReadStartTick
   #74 = Fieldref           #8.#75        // ext/mods/gameserver/network/ClientStats._floodDetected:Z
   #75 = NameAndType        #76:#77       // _floodDetected:Z
   #76 = Utf8               _floodDetected
   #77 = Utf8               Z
   #78 = Fieldref           #8.#79        // ext/mods/gameserver/network/ClientStats._queueOverflowDetected:Z
   #79 = NameAndType        #80:#77       // _queueOverflowDetected:Z
   #80 = Utf8               _queueOverflowDetected
   #81 = Fieldref           #82.#83       // ext/mods/Config.CLIENT_PACKET_QUEUE_MEASURE_INTERVAL:I
   #82 = Class              #84           // ext/mods/Config
   #83 = NameAndType        #85:#12       // CLIENT_PACKET_QUEUE_MEASURE_INTERVAL:I
   #84 = Utf8               ext/mods/Config
   #85 = Utf8               CLIENT_PACKET_QUEUE_MEASURE_INTERVAL
   #86 = Fieldref           #8.#87        // ext/mods/gameserver/network/ClientStats.BUFFER_SIZE:I
   #87 = NameAndType        #88:#12       // BUFFER_SIZE:I
   #88 = Utf8               BUFFER_SIZE
   #89 = Fieldref           #8.#90        // ext/mods/gameserver/network/ClientStats._packetsInSecond:[I
   #90 = NameAndType        #91:#92       // _packetsInSecond:[I
   #91 = Utf8               _packetsInSecond
   #92 = Utf8               [I
   #93 = Fieldref           #8.#94        // ext/mods/gameserver/network/ClientStats._head:I
   #94 = NameAndType        #95:#12       // _head:I
   #95 = Utf8               _head
   #96 = Methodref          #8.#97        // ext/mods/gameserver/network/ClientStats.countPacket:()Z
   #97 = NameAndType        #98:#99       // countPacket:()Z
   #98 = Utf8               countPacket
   #99 = Utf8               ()Z
  #100 = Methodref          #101.#102     // java/lang/System.currentTimeMillis:()J
  #101 = Class              #103          // java/lang/System
  #102 = NameAndType        #104:#105     // currentTimeMillis:()J
  #103 = Utf8               java/lang/System
  #104 = Utf8               currentTimeMillis
  #105 = Utf8               ()J
  #106 = Long               60000l
  #108 = Fieldref           #82.#109      // ext/mods/Config.CLIENT_PACKET_QUEUE_MAX_UNKNOWN_PER_MIN:I
  #109 = NameAndType        #110:#12      // CLIENT_PACKET_QUEUE_MAX_UNKNOWN_PER_MIN:I
  #110 = Utf8               CLIENT_PACKET_QUEUE_MAX_UNKNOWN_PER_MIN
  #111 = Fieldref           #82.#112      // ext/mods/Config.CLIENT_PACKET_QUEUE_MAX_BURST_SIZE:I
  #112 = NameAndType        #113:#12      // CLIENT_PACKET_QUEUE_MAX_BURST_SIZE:I
  #113 = Utf8               CLIENT_PACKET_QUEUE_MAX_BURST_SIZE
  #114 = Fieldref           #82.#115      // ext/mods/Config.CLIENT_PACKET_QUEUE_MAX_OVERFLOWS_PER_MIN:I
  #115 = NameAndType        #116:#12      // CLIENT_PACKET_QUEUE_MAX_OVERFLOWS_PER_MIN:I
  #116 = Utf8               CLIENT_PACKET_QUEUE_MAX_OVERFLOWS_PER_MIN
  #117 = Fieldref           #82.#118      // ext/mods/Config.CLIENT_PACKET_QUEUE_MAX_UNDERFLOWS_PER_MIN:I
  #118 = NameAndType        #119:#12      // CLIENT_PACKET_QUEUE_MAX_UNDERFLOWS_PER_MIN:I
  #119 = Utf8               CLIENT_PACKET_QUEUE_MAX_UNDERFLOWS_PER_MIN
  #120 = Fieldref           #82.#121      // ext/mods/Config.CLIENT_PACKET_QUEUE_MAX_FLOODS_PER_MIN:I
  #121 = NameAndType        #122:#12      // CLIENT_PACKET_QUEUE_MAX_FLOODS_PER_MIN:I
  #122 = Utf8               CLIENT_PACKET_QUEUE_MAX_FLOODS_PER_MIN
  #123 = Fieldref           #82.#124      // ext/mods/Config.CLIENT_PACKET_QUEUE_MAX_AVERAGE_PACKETS_PER_SECOND:I
  #124 = NameAndType        #125:#12      // CLIENT_PACKET_QUEUE_MAX_AVERAGE_PACKETS_PER_SECOND:I
  #125 = Utf8               CLIENT_PACKET_QUEUE_MAX_AVERAGE_PACKETS_PER_SECOND
  #126 = Long               1000l
  #128 = Methodref          #8.#129       // ext/mods/gameserver/network/ClientStats.longFloodDetected:()Z
  #129 = NameAndType        #130:#99      // longFloodDetected:()Z
  #130 = Utf8               longFloodDetected
  #131 = Fieldref           #82.#132      // ext/mods/Config.CLIENT_PACKET_QUEUE_MAX_PACKETS_PER_SECOND:I
  #132 = NameAndType        #133:#12      // CLIENT_PACKET_QUEUE_MAX_PACKETS_PER_SECOND:I
  #133 = Utf8               CLIENT_PACKET_QUEUE_MAX_PACKETS_PER_SECOND
  #134 = Utf8               Code
  #135 = Utf8               LineNumberTable
  #136 = Utf8               LocalVariableTable
  #137 = Utf8               this
  #138 = Utf8               Lext/mods/gameserver/network/ClientStats;
  #139 = Utf8               dropPacket
  #140 = Utf8               result
  #141 = Utf8               StackMapTable
  #142 = Utf8               (I)Z
  #143 = Utf8               queueSize
  #144 = Utf8               countUnknownPacket
  #145 = Utf8               tick
  #146 = Utf8               countBurst
  #147 = Utf8               count
  #148 = Utf8               countQueueOverflow
  #149 = Utf8               countUnderflowException
  #150 = Utf8               countFloods
  #151 = Utf8               SourceFile
  #152 = Utf8               ClientStats.java
{
  public int processedPackets;
    descriptor: I
    flags: (0x0001) ACC_PUBLIC

  public int droppedPackets;
    descriptor: I
    flags: (0x0001) ACC_PUBLIC

  public int unknownPackets;
    descriptor: I
    flags: (0x0001) ACC_PUBLIC

  public int totalQueueSize;
    descriptor: I
    flags: (0x0001) ACC_PUBLIC

  public int maxQueueSize;
    descriptor: I
    flags: (0x0001) ACC_PUBLIC

  public int totalBursts;
    descriptor: I
    flags: (0x0001) ACC_PUBLIC

  public int maxBurstSize;
    descriptor: I
    flags: (0x0001) ACC_PUBLIC

  public int shortFloods;
    descriptor: I
    flags: (0x0001) ACC_PUBLIC

  public int longFloods;
    descriptor: I
    flags: (0x0001) ACC_PUBLIC

  public int totalQueueOverflows;
    descriptor: I
    flags: (0x0001) ACC_PUBLIC

  public int totalUnderflowExceptions;
    descriptor: I
    flags: (0x0001) ACC_PUBLIC

  public ext.mods.gameserver.network.ClientStats();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: iconst_0
         6: putfield      #7                  // Field processedPackets:I
         9: aload_0
        10: iconst_0
        11: putfield      #13                 // Field droppedPackets:I
        14: aload_0
        15: iconst_0
        16: putfield      #16                 // Field unknownPackets:I
        19: aload_0
        20: iconst_0
        21: putfield      #19                 // Field totalQueueSize:I
        24: aload_0
        25: iconst_0
        26: putfield      #22                 // Field maxQueueSize:I
        29: aload_0
        30: iconst_0
        31: putfield      #25                 // Field totalBursts:I
        34: aload_0
        35: iconst_0
        36: putfield      #28                 // Field maxBurstSize:I
        39: aload_0
        40: iconst_0
        41: putfield      #31                 // Field shortFloods:I
        44: aload_0
        45: iconst_0
        46: putfield      #34                 // Field longFloods:I
        49: aload_0
        50: iconst_0
        51: putfield      #37                 // Field totalQueueOverflows:I
        54: aload_0
        55: iconst_0
        56: putfield      #40                 // Field totalUnderflowExceptions:I
        59: aload_0
        60: lconst_0
        61: putfield      #43                 // Field _packetCountStartTick:J
        64: aload_0
        65: iconst_0
        66: putfield      #47                 // Field _totalCount:I
        69: aload_0
        70: iconst_0
        71: putfield      #50                 // Field _floodsInMin:I
        74: aload_0
        75: lconst_0
        76: putfield      #53                 // Field _floodStartTick:J
        79: aload_0
        80: iconst_0
        81: putfield      #56                 // Field _unknownPacketsInMin:I
        84: aload_0
        85: lconst_0
        86: putfield      #59                 // Field _unknownPacketStartTick:J
        89: aload_0
        90: iconst_0
        91: putfield      #62                 // Field _overflowsInMin:I
        94: aload_0
        95: lconst_0
        96: putfield      #65                 // Field _overflowStartTick:J
        99: aload_0
       100: iconst_0
       101: putfield      #68                 // Field _underflowReadsInMin:I
       104: aload_0
       105: lconst_0
       106: putfield      #71                 // Field _underflowReadStartTick:J
       109: aload_0
       110: iconst_0
       111: putfield      #74                 // Field _floodDetected:Z
       114: aload_0
       115: iconst_0
       116: putfield      #78                 // Field _queueOverflowDetected:Z
       119: aload_0
       120: getstatic     #81                 // Field ext/mods/Config.CLIENT_PACKET_QUEUE_MEASURE_INTERVAL:I
       123: putfield      #86                 // Field BUFFER_SIZE:I
       126: aload_0
       127: aload_0
       128: getfield      #86                 // Field BUFFER_SIZE:I
       131: newarray       int
       133: putfield      #89                 // Field _packetsInSecond:[I
       136: aload_0
       137: aload_0
       138: getfield      #86                 // Field BUFFER_SIZE:I
       141: iconst_1
       142: isub
       143: putfield      #93                 // Field _head:I
       146: return
      LineNumberTable:
        line 56: 0
        line 24: 4
        line 25: 9
        line 26: 14
        line 27: 19
        line 28: 24
        line 29: 29
        line 30: 34
        line 31: 39
        line 32: 44
        line 33: 49
        line 34: 54
        line 37: 59
        line 39: 64
        line 41: 69
        line 42: 74
        line 43: 79
        line 44: 84
        line 45: 89
        line 46: 94
        line 47: 99
        line 48: 104
        line 50: 109
        line 51: 114
        line 57: 119
        line 58: 126
        line 59: 136
        line 60: 146
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     147     0  this   Lext/mods/gameserver/network/ClientStats;

  protected final boolean dropPacket();
    descriptor: ()Z
    flags: (0x0014) ACC_PROTECTED, ACC_FINAL
    Code:
      stack=3, locals=2, args_size=1
         0: aload_0
         1: getfield      #74                 // Field _floodDetected:Z
         4: ifne          14
         7: aload_0
         8: getfield      #78                 // Field _queueOverflowDetected:Z
        11: ifeq          18
        14: iconst_1
        15: goto          19
        18: iconst_0
        19: istore_1
        20: iload_1
        21: ifeq          34
        24: aload_0
        25: dup
        26: getfield      #13                 // Field droppedPackets:I
        29: iconst_1
        30: iadd
        31: putfield      #13                 // Field droppedPackets:I
        34: iload_1
        35: ireturn
      LineNumberTable:
        line 67: 0
        line 68: 20
        line 69: 24
        line 70: 34
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      36     0  this   Lext/mods/gameserver/network/ClientStats;
           20      16     1 result   Z
      StackMapTable: number_of_entries = 4
        frame_type = 14 /* same */
        frame_type = 3 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 252 /* append */
          offset_delta = 14
          locals = [ int ]

  protected final boolean countPacket(int);
    descriptor: (I)Z
    flags: (0x0014) ACC_PROTECTED, ACC_FINAL
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: dup
         2: getfield      #7                  // Field processedPackets:I
         5: iconst_1
         6: iadd
         7: putfield      #7                  // Field processedPackets:I
        10: aload_0
        11: dup
        12: getfield      #19                 // Field totalQueueSize:I
        15: iload_1
        16: iadd
        17: putfield      #19                 // Field totalQueueSize:I
        20: aload_0
        21: getfield      #22                 // Field maxQueueSize:I
        24: iload_1
        25: if_icmpge     33
        28: aload_0
        29: iload_1
        30: putfield      #22                 // Field maxQueueSize:I
        33: aload_0
        34: getfield      #78                 // Field _queueOverflowDetected:Z
        37: ifeq          50
        40: iload_1
        41: iconst_2
        42: if_icmpge     50
        45: aload_0
        46: iconst_0
        47: putfield      #78                 // Field _queueOverflowDetected:Z
        50: aload_0
        51: invokevirtual #96                 // Method countPacket:()Z
        54: ireturn
      LineNumberTable:
        line 79: 0
        line 80: 10
        line 81: 20
        line 82: 28
        line 83: 33
        line 84: 45
        line 86: 50
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      55     0  this   Lext/mods/gameserver/network/ClientStats;
            0      55     1 queueSize   I
      StackMapTable: number_of_entries = 2
        frame_type = 33 /* same */
        frame_type = 16 /* same */

  protected final boolean countUnknownPacket();
    descriptor: ()Z
    flags: (0x0014) ACC_PROTECTED, ACC_FINAL
    Code:
      stack=4, locals=3, args_size=1
         0: aload_0
         1: dup
         2: getfield      #16                 // Field unknownPackets:I
         5: iconst_1
         6: iadd
         7: putfield      #16                 // Field unknownPackets:I
        10: invokestatic  #100                // Method java/lang/System.currentTimeMillis:()J
        13: lstore_1
        14: lload_1
        15: aload_0
        16: getfield      #59                 // Field _unknownPacketStartTick:J
        19: lsub
        20: ldc2_w        #106                // long 60000l
        23: lcmp
        24: ifle          39
        27: aload_0
        28: lload_1
        29: putfield      #59                 // Field _unknownPacketStartTick:J
        32: aload_0
        33: iconst_1
        34: putfield      #56                 // Field _unknownPacketsInMin:I
        37: iconst_0
        38: ireturn
        39: aload_0
        40: dup
        41: getfield      #56                 // Field _unknownPacketsInMin:I
        44: iconst_1
        45: iadd
        46: putfield      #56                 // Field _unknownPacketsInMin:I
        49: aload_0
        50: getfield      #56                 // Field _unknownPacketsInMin:I
        53: getstatic     #108                // Field ext/mods/Config.CLIENT_PACKET_QUEUE_MAX_UNKNOWN_PER_MIN:I
        56: if_icmple     63
        59: iconst_1
        60: goto          64
        63: iconst_0
        64: ireturn
      LineNumberTable:
        line 95: 0
        line 97: 10
        line 98: 14
        line 100: 27
        line 101: 32
        line 102: 37
        line 105: 39
        line 106: 49
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      65     0  this   Lext/mods/gameserver/network/ClientStats;
           14      51     1  tick   J
      StackMapTable: number_of_entries = 3
        frame_type = 252 /* append */
          offset_delta = 39
          locals = [ long ]
        frame_type = 23 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  protected final boolean countBurst(int);
    descriptor: (I)Z
    flags: (0x0014) ACC_PROTECTED, ACC_FINAL
    Code:
      stack=3, locals=2, args_size=2
         0: iload_1
         1: aload_0
         2: getfield      #28                 // Field maxBurstSize:I
         5: if_icmple     13
         8: aload_0
         9: iload_1
        10: putfield      #28                 // Field maxBurstSize:I
        13: iload_1
        14: getstatic     #111                // Field ext/mods/Config.CLIENT_PACKET_QUEUE_MAX_BURST_SIZE:I
        17: if_icmpge     22
        20: iconst_0
        21: ireturn
        22: aload_0
        23: dup
        24: getfield      #25                 // Field totalBursts:I
        27: iconst_1
        28: iadd
        29: putfield      #25                 // Field totalBursts:I
        32: iconst_1
        33: ireturn
      LineNumberTable:
        line 116: 0
        line 117: 8
        line 119: 13
        line 120: 20
        line 122: 22
        line 123: 32
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      34     0  this   Lext/mods/gameserver/network/ClientStats;
            0      34     1 count   I
      StackMapTable: number_of_entries = 2
        frame_type = 13 /* same */
        frame_type = 8 /* same */

  protected final boolean countQueueOverflow();
    descriptor: ()Z
    flags: (0x0014) ACC_PROTECTED, ACC_FINAL
    Code:
      stack=4, locals=3, args_size=1
         0: aload_0
         1: iconst_1
         2: putfield      #78                 // Field _queueOverflowDetected:Z
         5: aload_0
         6: dup
         7: getfield      #37                 // Field totalQueueOverflows:I
        10: iconst_1
        11: iadd
        12: putfield      #37                 // Field totalQueueOverflows:I
        15: invokestatic  #100                // Method java/lang/System.currentTimeMillis:()J
        18: lstore_1
        19: lload_1
        20: aload_0
        21: getfield      #65                 // Field _overflowStartTick:J
        24: lsub
        25: ldc2_w        #106                // long 60000l
        28: lcmp
        29: ifle          44
        32: aload_0
        33: lload_1
        34: putfield      #65                 // Field _overflowStartTick:J
        37: aload_0
        38: iconst_1
        39: putfield      #62                 // Field _overflowsInMin:I
        42: iconst_0
        43: ireturn
        44: aload_0
        45: dup
        46: getfield      #62                 // Field _overflowsInMin:I
        49: iconst_1
        50: iadd
        51: putfield      #62                 // Field _overflowsInMin:I
        54: aload_0
        55: getfield      #62                 // Field _overflowsInMin:I
        58: getstatic     #114                // Field ext/mods/Config.CLIENT_PACKET_QUEUE_MAX_OVERFLOWS_PER_MIN:I
        61: if_icmple     68
        64: iconst_1
        65: goto          69
        68: iconst_0
        69: ireturn
      LineNumberTable:
        line 132: 0
        line 133: 5
        line 135: 15
        line 136: 19
        line 138: 32
        line 139: 37
        line 140: 42
        line 143: 44
        line 144: 54
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      70     0  this   Lext/mods/gameserver/network/ClientStats;
           19      51     1  tick   J
      StackMapTable: number_of_entries = 3
        frame_type = 252 /* append */
          offset_delta = 44
          locals = [ long ]
        frame_type = 23 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  protected final boolean countUnderflowException();
    descriptor: ()Z
    flags: (0x0014) ACC_PROTECTED, ACC_FINAL
    Code:
      stack=4, locals=3, args_size=1
         0: aload_0
         1: dup
         2: getfield      #40                 // Field totalUnderflowExceptions:I
         5: iconst_1
         6: iadd
         7: putfield      #40                 // Field totalUnderflowExceptions:I
        10: invokestatic  #100                // Method java/lang/System.currentTimeMillis:()J
        13: lstore_1
        14: lload_1
        15: aload_0
        16: getfield      #71                 // Field _underflowReadStartTick:J
        19: lsub
        20: ldc2_w        #106                // long 60000l
        23: lcmp
        24: ifle          39
        27: aload_0
        28: lload_1
        29: putfield      #71                 // Field _underflowReadStartTick:J
        32: aload_0
        33: iconst_1
        34: putfield      #68                 // Field _underflowReadsInMin:I
        37: iconst_0
        38: ireturn
        39: aload_0
        40: dup
        41: getfield      #68                 // Field _underflowReadsInMin:I
        44: iconst_1
        45: iadd
        46: putfield      #68                 // Field _underflowReadsInMin:I
        49: aload_0
        50: getfield      #68                 // Field _underflowReadsInMin:I
        53: getstatic     #117                // Field ext/mods/Config.CLIENT_PACKET_QUEUE_MAX_UNDERFLOWS_PER_MIN:I
        56: if_icmple     63
        59: iconst_1
        60: goto          64
        63: iconst_0
        64: ireturn
      LineNumberTable:
        line 153: 0
        line 155: 10
        line 156: 14
        line 158: 27
        line 159: 32
        line 160: 37
        line 163: 39
        line 164: 49
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      65     0  this   Lext/mods/gameserver/network/ClientStats;
           14      51     1  tick   J
      StackMapTable: number_of_entries = 3
        frame_type = 252 /* append */
          offset_delta = 39
          locals = [ long ]
        frame_type = 23 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  protected final boolean countFloods();
    descriptor: ()Z
    flags: (0x0014) ACC_PROTECTED, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #50                 // Field _floodsInMin:I
         4: getstatic     #120                // Field ext/mods/Config.CLIENT_PACKET_QUEUE_MAX_FLOODS_PER_MIN:I
         7: if_icmple     14
        10: iconst_1
        11: goto          15
        14: iconst_0
        15: ireturn
      LineNumberTable:
        line 172: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      16     0  this   Lext/mods/gameserver/network/ClientStats;
      StackMapTable: number_of_entries = 2
        frame_type = 14 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
}
SourceFile: "ClientStats.java"
