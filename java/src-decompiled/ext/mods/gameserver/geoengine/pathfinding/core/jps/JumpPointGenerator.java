// Bytecode for: ext.mods.gameserver.geoengine.pathfinding.core.jps.JumpPointGenerator
// File: ext\mods\gameserver\geoengine\pathfinding\core\jps\JumpPointGenerator.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/geoengine/pathfinding/core/jps/JumpPointGenerator.class
  Last modified 9 de jul de 2026; size 6121 bytes
  MD5 checksum bccac9d1a58f7043120b781dcb90f201
  Compiled from "JPSPlusCalculator.kt"
public final class ext.mods.gameserver.geoengine.pathfinding.core.jps.JumpPointGenerator
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #2                          // ext/mods/gameserver/geoengine/pathfinding/core/jps/JumpPointGenerator
  super_class: #4                         // java/lang/Object
  interfaces: 0, fields: 4, methods: 6, attributes: 5
Constant pool:
    #1 = Utf8               ext/mods/gameserver/geoengine/pathfinding/core/jps/JumpPointGenerator
    #2 = Class              #1            // ext/mods/gameserver/geoengine/pathfinding/core/jps/JumpPointGenerator
    #3 = Utf8               java/lang/Object
    #4 = Class              #3            // java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               (Ljava/util/List;II)V
    #7 = Utf8               (Ljava/util/List<Lext/mods/gameserver/geoengine/pathfinding/model/IndexedNode;>;II)V
    #8 = Utf8               Lorg/jetbrains/annotations/NotNull;
    #9 = Utf8               ()V
   #10 = NameAndType        #5:#9         // "<init>":()V
   #11 = Methodref          #4.#10        // java/lang/Object."<init>":()V
   #12 = Utf8               nodes
   #13 = Utf8               Ljava/util/List;
   #14 = NameAndType        #12:#13       // nodes:Ljava/util/List;
   #15 = Fieldref           #2.#14        // ext/mods/gameserver/geoengine/pathfinding/core/jps/JumpPointGenerator.nodes:Ljava/util/List;
   #16 = Utf8               regionWidth
   #17 = Utf8               I
   #18 = NameAndType        #16:#17       // regionWidth:I
   #19 = Fieldref           #2.#18        // ext/mods/gameserver/geoengine/pathfinding/core/jps/JumpPointGenerator.regionWidth:I
   #20 = Utf8               regionHeight
   #21 = NameAndType        #20:#17       // regionHeight:I
   #22 = Fieldref           #2.#21        // ext/mods/gameserver/geoengine/pathfinding/core/jps/JumpPointGenerator.regionHeight:I
   #23 = Utf8               [I
   #24 = Class              #23           // "[I"
   #25 = Utf8               nodeMap
   #26 = Utf8               [[I
   #27 = NameAndType        #25:#26       // nodeMap:[[I
   #28 = Fieldref           #2.#27        // ext/mods/gameserver/geoengine/pathfinding/core/jps/JumpPointGenerator.nodeMap:[[I
   #29 = Utf8               java/lang/Iterable
   #30 = Class              #29           // java/lang/Iterable
   #31 = Utf8               iterator
   #32 = Utf8               ()Ljava/util/Iterator;
   #33 = NameAndType        #31:#32       // iterator:()Ljava/util/Iterator;
   #34 = InterfaceMethodref #30.#33       // java/lang/Iterable.iterator:()Ljava/util/Iterator;
   #35 = Utf8               java/util/Iterator
   #36 = Class              #35           // java/util/Iterator
   #37 = Utf8               hasNext
   #38 = Utf8               ()Z
   #39 = NameAndType        #37:#38       // hasNext:()Z
   #40 = InterfaceMethodref #36.#39       // java/util/Iterator.hasNext:()Z
   #41 = Utf8               next
   #42 = Utf8               ()Ljava/lang/Object;
   #43 = NameAndType        #41:#42       // next:()Ljava/lang/Object;
   #44 = InterfaceMethodref #36.#43       // java/util/Iterator.next:()Ljava/lang/Object;
   #45 = Utf8               ext/mods/gameserver/geoengine/pathfinding/model/IndexedNode
   #46 = Class              #45           // ext/mods/gameserver/geoengine/pathfinding/model/IndexedNode
   #47 = Utf8               getGeoX
   #48 = Utf8               ()I
   #49 = NameAndType        #47:#48       // getGeoX:()I
   #50 = Methodref          #46.#49       // ext/mods/gameserver/geoengine/pathfinding/model/IndexedNode.getGeoX:()I
   #51 = Utf8               getGeoY
   #52 = NameAndType        #51:#48       // getGeoY:()I
   #53 = Methodref          #46.#52       // ext/mods/gameserver/geoengine/pathfinding/model/IndexedNode.getGeoY:()I
   #54 = Utf8               getId
   #55 = NameAndType        #54:#48       // getId:()I
   #56 = Methodref          #46.#55       // ext/mods/gameserver/geoengine/pathfinding/model/IndexedNode.getId:()I
   #57 = Utf8               $i$a$-forEach-JumpPointGenerator$1
   #58 = Utf8               localX
   #59 = Utf8               localY
   #60 = Utf8               node
   #61 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/model/IndexedNode;
   #62 = Utf8               element$iv
   #63 = Utf8               Ljava/lang/Object;
   #64 = Utf8               $i$f$forEach
   #65 = Utf8               $this$forEach$iv
   #66 = Utf8               Ljava/lang/Iterable;
   #67 = Utf8               this
   #68 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/core/jps/JumpPointGenerator;
   #69 = Utf8               java/util/List
   #70 = Class              #69           // java/util/List
   #71 = Class              #26           // "[[I"
   #72 = Utf8               (Ljava/util/List;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V
   #73 = NameAndType        #5:#6         // "<init>":(Ljava/util/List;II)V
   #74 = Methodref          #2.#73        // ext/mods/gameserver/geoengine/pathfinding/core/jps/JumpPointGenerator."<init>":(Ljava/util/List;II)V
   #75 = Utf8               calculateJpsDistances
   #76 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/model/IndexedNode;)I
   #77 = Utf8               ext/mods/gameserver/geoengine/pathfinding/model/Direction
   #78 = Class              #77           // ext/mods/gameserver/geoengine/pathfinding/model/Direction
   #79 = Utf8               getEntries
   #80 = Utf8               ()Lkotlin/enums/EnumEntries;
   #81 = NameAndType        #79:#80       // getEntries:()Lkotlin/enums/EnumEntries;
   #82 = Methodref          #78.#81       // ext/mods/gameserver/geoengine/pathfinding/model/Direction.getEntries:()Lkotlin/enums/EnumEntries;
   #83 = Utf8               kotlin/collections/CollectionsKt
   #84 = Class              #83           // kotlin/collections/CollectionsKt
   #85 = Utf8               throwIndexOverflow
   #86 = NameAndType        #85:#9        // throwIndexOverflow:()V
   #87 = Methodref          #84.#86       // kotlin/collections/CollectionsKt.throwIndexOverflow:()V
   #88 = Utf8               calculateJumpDistance
   #89 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/model/IndexedNode;Lext/mods/gameserver/geoengine/pathfinding/model/Direction;)I
   #90 = NameAndType        #88:#89       // calculateJumpDistance:(Lext/mods/gameserver/geoengine/pathfinding/model/IndexedNode;Lext/mods/gameserver/geoengine/pathfinding/model/Direction;)I
   #91 = Methodref          #2.#90        // ext/mods/gameserver/geoengine/pathfinding/core/jps/JumpPointGenerator.calculateJumpDistance:(Lext/mods/gameserver/geoengine/pathfinding/model/IndexedNode;Lext/mods/gameserver/geoengine/pathfinding/model/Direction;)I
   #92 = Utf8               $i$a$-forEachIndexed-JumpPointGenerator$calculateJpsDistances$1
   #93 = Utf8               distance
   #94 = Utf8               index
   #95 = Utf8               dir
   #96 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/model/Direction;
   #97 = Utf8               item$iv
   #98 = Utf8               $i$f$forEachIndexed
   #99 = Utf8               index$iv
  #100 = Utf8               $this$forEachIndexed$iv
  #101 = Utf8               packed
  #102 = Utf8               getDx
  #103 = NameAndType        #102:#48      // getDx:()I
  #104 = Methodref          #78.#103      // ext/mods/gameserver/geoengine/pathfinding/model/Direction.getDx:()I
  #105 = Utf8               getDy
  #106 = NameAndType        #105:#48      // getDy:()I
  #107 = Methodref          #78.#106      // ext/mods/gameserver/geoengine/pathfinding/model/Direction.getDy:()I
  #108 = Utf8               get
  #109 = Utf8               (I)Ljava/lang/Object;
  #110 = NameAndType        #108:#109     // get:(I)Ljava/lang/Object;
  #111 = InterfaceMethodref #70.#110      // java/util/List.get:(I)Ljava/lang/Object;
  #112 = Utf8               isWalkable
  #113 = NameAndType        #112:#38      // isWalkable:()Z
  #114 = Methodref          #46.#113      // ext/mods/gameserver/geoengine/pathfinding/model/IndexedNode.isWalkable:()Z
  #115 = Utf8               hasForcedNeighbor
  #116 = Utf8               (IILext/mods/gameserver/geoengine/pathfinding/model/Direction;)Z
  #117 = NameAndType        #115:#116     // hasForcedNeighbor:(IILext/mods/gameserver/geoengine/pathfinding/model/Direction;)Z
  #118 = Methodref          #2.#117       // ext/mods/gameserver/geoengine/pathfinding/core/jps/JumpPointGenerator.hasForcedNeighbor:(IILext/mods/gameserver/geoengine/pathfinding/model/Direction;)Z
  #119 = Utf8               kotlin/ranges/RangesKt
  #120 = Class              #119          // kotlin/ranges/RangesKt
  #121 = Utf8               coerceAtMost
  #122 = Utf8               (II)I
  #123 = NameAndType        #121:#122     // coerceAtMost:(II)I
  #124 = Methodref          #120.#123     // kotlin/ranges/RangesKt.coerceAtMost:(II)I
  #125 = Utf8               nodeId
  #126 = Utf8               startX
  #127 = Utf8               startY
  #128 = Utf8               x
  #129 = Utf8               y
  #130 = Utf8               direction
  #131 = Utf8               isBlocked
  #132 = Utf8               (II)Z
  #133 = NameAndType        #131:#132     // isBlocked:(II)Z
  #134 = Methodref          #2.#133       // ext/mods/gameserver/geoengine/pathfinding/core/jps/JumpPointGenerator.isBlocked:(II)Z
  #135 = Utf8               check1
  #136 = Utf8               Z
  #137 = Utf8               check2
  #138 = Utf8               diag1
  #139 = Utf8               Ljava/util/List<Lext/mods/gameserver/geoengine/pathfinding/model/IndexedNode;>;
  #140 = Utf8               Lkotlin/Metadata;
  #141 = Utf8               mv
  #142 = Integer            2
  #143 = Integer            3
  #144 = Integer            0
  #145 = Utf8               k
  #146 = Integer            1
  #147 = Utf8               xi
  #148 = Integer            48
  #149 = Utf8               d1
  #150 = Utf8               \u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B)\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0004J\u0018\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J \u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0018\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0006H\u0002R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\r¨\u0006\u0018
  #151 = Utf8               d2
  #152 = Utf8
  #153 = Utf8               Brproject
  #154 = Utf8               kotlin/jvm/internal/Ref$IntRef
  #155 = Class              #154          // kotlin/jvm/internal/Ref$IntRef
  #156 = Utf8               kotlin/jvm/internal/Ref
  #157 = Class              #156          // kotlin/jvm/internal/Ref
  #158 = Utf8               IntRef
  #159 = Utf8               JPSPlusCalculator.kt
  #160 = Utf8               Lkotlin/jvm/internal/SourceDebugExtension;
  #161 = Utf8               value
  #162 = Utf8               SMAP\nJPSPlusCalculator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JPSPlusCalculator.kt\next/mods/gameserver/geoengine/pathfinding/core/jps/JumpPointGenerator\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,292:1\n1915#2,2:293\n1924#2,3:295\n*S KotlinDebug\n*F\n+ 1 JPSPlusCalculator.kt\next/mods/gameserver/geoengine/pathfinding/core/jps/JumpPointGenerator\n*L\n225#1:293,2\n237#1:295,3\n*E\n
  #163 = Utf8               Signature
  #164 = Utf8               RuntimeInvisibleAnnotations
  #165 = Utf8               Code
  #166 = Utf8               StackMapTable
  #167 = Utf8               LineNumberTable
  #168 = Utf8               LocalVariableTable
  #169 = Utf8               RuntimeInvisibleParameterAnnotations
  #170 = Utf8               InnerClasses
  #171 = Utf8               SourceFile
  #172 = Utf8               SourceDebugExtension
  #173 = Utf8               RuntimeVisibleAnnotations
{
  public ext.mods.gameserver.geoengine.pathfinding.core.jps.JumpPointGenerator(java.util.List<ext.mods.gameserver.geoengine.pathfinding.model.IndexedNode>, int, int);
    descriptor: (Ljava/util/List;II)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=15, args_size=4
         0: aload_0
         1: invokespecial #11                 // Method java/lang/Object."<init>":()V
         4: aload_0
         5: aload_1
         6: putfield      #15                 // Field nodes:Ljava/util/List;
         9: aload_0
        10: iload_2
        11: putfield      #19                 // Field regionWidth:I
        14: aload_0
        15: iload_3
        16: putfield      #22                 // Field regionHeight:I
        19: aload_0
        20: iconst_0
        21: istore        4
        23: aload_0
        24: getfield      #22                 // Field regionHeight:I
        27: istore        5
        29: iload         5
        31: anewarray     #24                 // class "[I"
        34: astore        6
        36: astore        12
        38: iload         4
        40: iload         5
        42: if_icmpge     108
        45: iload         4
        47: istore        7
        49: aload         6
        51: iload         7
        53: iconst_0
        54: istore        8
        56: aload_0
        57: getfield      #19                 // Field regionWidth:I
        60: istore        9
        62: iload         9
        64: newarray       int
        66: astore        10
        68: istore        14
        70: astore        13
        72: iload         8
        74: iload         9
        76: if_icmpge     95
        79: iload         8
        81: istore        11
        83: aload         10
        85: iload         11
        87: iconst_m1
        88: iastore
        89: iinc          8, 1
        92: goto          72
        95: aload         13
        97: iload         14
        99: aload         10
       101: aastore
       102: iinc          4, 1
       105: goto          38
       108: aload         12
       110: aload         6
       112: putfield      #28                 // Field nodeMap:[[I
       115: nop
       116: aload_0
       117: getfield      #15                 // Field nodes:Ljava/util/List;
       120: checkcast     #30                 // class java/lang/Iterable
       123: astore        4
       125: iconst_0
       126: istore        5
       128: aload         4
       130: invokeinterface #34,  1           // InterfaceMethod java/lang/Iterable.iterator:()Ljava/util/Iterator;
       135: astore        6
       137: aload         6
       139: invokeinterface #40,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
       144: ifeq          264
       147: aload         6
       149: invokeinterface #44,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       154: astore        7
       156: aload         7
       158: checkcast     #46                 // class ext/mods/gameserver/geoengine/pathfinding/model/IndexedNode
       161: astore        8
       163: iconst_0
       164: istore        9
       166: aload         8
       168: invokevirtual #50                 // Method ext/mods/gameserver/geoengine/pathfinding/model/IndexedNode.getGeoX:()I
       171: aload_0
       172: getfield      #19                 // Field regionWidth:I
       175: irem
       176: istore        10
       178: aload         8
       180: invokevirtual #53                 // Method ext/mods/gameserver/geoengine/pathfinding/model/IndexedNode.getGeoY:()I
       183: aload_0
       184: getfield      #22                 // Field regionHeight:I
       187: irem
       188: istore        11
       190: iconst_0
       191: iload         11
       193: if_icmpgt     213
       196: iload         11
       198: aload_0
       199: getfield      #22                 // Field regionHeight:I
       202: if_icmpge     209
       205: iconst_1
       206: goto          214
       209: iconst_0
       210: goto          214
       213: iconst_0
       214: ifeq          259
       217: iconst_0
       218: iload         10
       220: if_icmpgt     240
       223: iload         10
       225: aload_0
       226: getfield      #19                 // Field regionWidth:I
       229: if_icmpge     236
       232: iconst_1
       233: goto          241
       236: iconst_0
       237: goto          241
       240: iconst_0
       241: ifeq          259
       244: aload_0
       245: getfield      #28                 // Field nodeMap:[[I
       248: iload         11
       250: aaload
       251: iload         10
       253: aload         8
       255: invokevirtual #56                 // Method ext/mods/gameserver/geoengine/pathfinding/model/IndexedNode.getId:()I
       258: iastore
       259: nop
       260: nop
       261: goto          137
       264: nop
       265: nop
       266: return
      StackMapTable: number_of_entries = 13
        frame_type = 255 /* full_frame */
          offset_delta = 38
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/core/jps/JumpPointGenerator, class java/util/List, int, int, int, int, class "[[I", top, top, top, top, top, class ext/mods/gameserver/geoengine/pathfinding/core/jps/JumpPointGenerator ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 33
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/core/jps/JumpPointGenerator, class java/util/List, int, int, int, int, class "[[I", int, int, int, class "[I", top, class ext/mods/gameserver/geoengine/pathfinding/core/jps/JumpPointGenerator, class "[[I", int ]
          stack = []
        frame_type = 22 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 12
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/core/jps/JumpPointGenerator, class java/util/List, int, int, int, int, class "[[I", top, top, top, top, top, class ext/mods/gameserver/geoengine/pathfinding/core/jps/JumpPointGenerator ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 28
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/core/jps/JumpPointGenerator, class java/util/List, int, int, class java/lang/Iterable, int, class java/util/Iterator, top, top, top, top, top, class ext/mods/gameserver/geoengine/pathfinding/core/jps/JumpPointGenerator ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 71
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/core/jps/JumpPointGenerator, class java/util/List, int, int, class java/lang/Iterable, int, class java/util/Iterator, class java/lang/Object, class ext/mods/gameserver/geoengine/pathfinding/model/IndexedNode, int, int, int, class ext/mods/gameserver/geoengine/pathfinding/core/jps/JumpPointGenerator ]
          stack = []
        frame_type = 3 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 21 /* same */
        frame_type = 3 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 17 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 4
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/core/jps/JumpPointGenerator, class java/util/List, int, int, class java/lang/Iterable, int, class java/util/Iterator, top, top, top, top, top, class ext/mods/gameserver/geoengine/pathfinding/core/jps/JumpPointGenerator ]
          stack = []
      LineNumberTable:
        line 217: 0
        line 218: 4
        line 219: 9
        line 220: 14
        line 222: 19
        line 224: 115
        line 225: 116
        line 293: 128
        line 226: 166
        line 227: 178
        line 228: 190
        line 229: 244
        line 231: 259
        line 293: 260
        line 294: 264
        line 232: 265
        line 217: 266
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          166      94     9 $i$a$-forEach-JumpPointGenerator$1   I
          178      82    10 localX   I
          190      70    11 localY   I
          163      97     8  node   Lext/mods/gameserver/geoengine/pathfinding/model/IndexedNode;
          156     105     7 element$iv   Ljava/lang/Object;
          128     137     5 $i$f$forEach   I
          125     140     4 $this$forEach$iv   Ljava/lang/Iterable;
            0     267     0  this   Lext/mods/gameserver/geoengine/pathfinding/core/jps/JumpPointGenerator;
            0     267     1 nodes   Ljava/util/List;
            0     267     2 regionWidth   I
            0     267     3 regionHeight   I
    Signature: #7                           // (Ljava/util/List<Lext/mods/gameserver/geoengine/pathfinding/model/IndexedNode;>;II)V
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #8()
          org.jetbrains.annotations.NotNull
      parameter 1:
      parameter 2:

  public ext.mods.gameserver.geoengine.pathfinding.core.jps.JumpPointGenerator(java.util.List, int, int, int, kotlin.jvm.internal.DefaultConstructorMarker);
    descriptor: (Ljava/util/List;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V
    flags: (0x1001) ACC_PUBLIC, ACC_SYNTHETIC
    Code:
      stack=4, locals=6, args_size=6
         0: iload         4
         2: iconst_2
         3: iand
         4: ifeq          11
         7: sipush        256
        10: istore_2
        11: iload         4
        13: iconst_4
        14: iand
        15: ifeq          22
        18: sipush        256
        21: istore_3
        22: aload_0
        23: aload_1
        24: iload_2
        25: iload_3
        26: invokespecial #74                 // Method "<init>":(Ljava/util/List;II)V
        29: return
      StackMapTable: number_of_entries = 2
        frame_type = 11 /* same */
        frame_type = 10 /* same */
      LineNumberTable:
        line 217: 0
        line 219: 7
        line 217: 11
        line 220: 18
        line 217: 22
        line 221: 29

  public final int calculateJpsDistances(ext.mods.gameserver.geoengine.pathfinding.model.IndexedNode);
    descriptor: (Lext/mods/gameserver/geoengine/pathfinding/model/IndexedNode;)I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=4, locals=13, args_size=2
         0: iconst_0
         1: istore_2
         2: invokestatic  #82                 // Method ext/mods/gameserver/geoengine/pathfinding/model/Direction.getEntries:()Lkotlin/enums/EnumEntries;
         5: checkcast     #30                 // class java/lang/Iterable
         8: astore_3
         9: iconst_0
        10: istore        4
        12: iconst_0
        13: istore        5
        15: aload_3
        16: invokeinterface #34,  1           // InterfaceMethod java/lang/Iterable.iterator:()Ljava/util/Iterator;
        21: astore        6
        23: aload         6
        25: invokeinterface #40,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        30: ifeq          98
        33: aload         6
        35: invokeinterface #44,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        40: astore        7
        42: iload         5
        44: iinc          5, 1
        47: istore        8
        49: iload         8
        51: ifge          57
        54: invokestatic  #87                 // Method kotlin/collections/CollectionsKt.throwIndexOverflow:()V
        57: iload         8
        59: aload         7
        61: checkcast     #78                 // class ext/mods/gameserver/geoengine/pathfinding/model/Direction
        64: astore        9
        66: istore        10
        68: iconst_0
        69: istore        11
        71: aload_0
        72: aload_1
        73: aload         9
        75: invokespecial #91                 // Method calculateJumpDistance:(Lext/mods/gameserver/geoengine/pathfinding/model/IndexedNode;Lext/mods/gameserver/geoengine/pathfinding/model/Direction;)I
        78: istore        12
        80: iload_2
        81: iload         12
        83: bipush        15
        85: iand
        86: iload         10
        88: iconst_4
        89: imul
        90: ishl
        91: ior
        92: istore_2
        93: nop
        94: nop
        95: goto          23
        98: nop
        99: iload_2
       100: ireturn
      StackMapTable: number_of_entries = 3
        frame_type = 255 /* full_frame */
          offset_delta = 23
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/core/jps/JumpPointGenerator, class ext/mods/gameserver/geoengine/pathfinding/model/IndexedNode, int, class java/lang/Iterable, int, int, class java/util/Iterator ]
          stack = []
        frame_type = 253 /* append */
          offset_delta = 33
          locals = [ class java/lang/Object, int ]
        frame_type = 249 /* chop */
          offset_delta = 40
      LineNumberTable:
        line 235: 0
        line 237: 2
        line 295: 12
        line 296: 15
        line 296: 59
        line 238: 71
        line 239: 80
        line 240: 93
        line 296: 94
        line 297: 98
        line 242: 99
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           71      23    11 $i$a$-forEachIndexed-JumpPointGenerator$calculateJpsDistances$1   I
           80      14    12 distance   I
           68      26    10 index   I
           68      26     9   dir   Lext/mods/gameserver/geoengine/pathfinding/model/Direction;
           42      53     7 item$iv   Ljava/lang/Object;
           12      87     4 $i$f$forEachIndexed   I
           15      84     5 index$iv   I
            9      90     3 $this$forEachIndexed$iv   Ljava/lang/Iterable;
            2      99     2 packed   I
            0     101     0  this   Lext/mods/gameserver/geoengine/pathfinding/core/jps/JumpPointGenerator;
            0     101     1  node   Lext/mods/gameserver/geoengine/pathfinding/model/IndexedNode;
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #8()
          org.jetbrains.annotations.NotNull
}
InnerClasses:
  public static final #158= #155 of #157; // IntRef=class kotlin/jvm/internal/Ref$IntRef of class kotlin/jvm/internal/Ref
SourceFile: "JPSPlusCalculator.kt"
SourceDebugExtension:
  SMAP
  JPSPlusCalculator.kt
  Kotlin
  *S Kotlin
  *F
  + 1 JPSPlusCalculator.kt
  ext/mods/gameserver/geoengine/pathfinding/core/jps/JumpPointGenerator
  + 2 _Collections.kt
  kotlin/collections/CollectionsKt___CollectionsKt
  *L
  1#1,292:1
  1915#2,2:293
  1924#2,3:295
  *S KotlinDebug
  *F
  + 1 JPSPlusCalculator.kt
  ext/mods/gameserver/geoengine/pathfinding/core/jps/JumpPointGenerator
  *L
  225#1:293,2
  237#1:295,3
  *E
RuntimeVisibleAnnotations:
  0: #140(#141=[I#142,I#143,I#144],#145=I#146,#147=I#148,#149=[s#150],#151=[s#68,s#152,s#12,s#152,s#61,s#16,s#152,s#20,s#5,s#6,s#25,s#152,s#152,s#26,s#75,s#60,s#88,s#130,s#96,s#115,s#152,s#128,s#129,s#131,s#153])
    kotlin.Metadata(
      mv=[2,3,0]
      k=1
      xi=48
      d1=["\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B)\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0004J\u0018\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J \u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0018\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0006H\u0002R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\r¨\u0006\u0018"]
      d2=["Lext/mods/gameserver/geoengine/pathfinding/core/jps/JumpPointGenerator;","","nodes","","Lext/mods/gameserver/geoengine/pathfinding/model/IndexedNode;","regionWidth","","regionHeight","<init>","(Ljava/util/List;II)V","nodeMap","","","[[I","calculateJpsDistances","node","calculateJumpDistance","direction","Lext/mods/gameserver/geoengine/pathfinding/model/Direction;","hasForcedNeighbor","","x","y","isBlocked","Brproject"]
    )
RuntimeInvisibleAnnotations:
  0: #160(#161=[s#162])
    kotlin.jvm.internal.SourceDebugExtension(
      value=["SMAP\nJPSPlusCalculator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JPSPlusCalculator.kt\next/mods/gameserver/geoengine/pathfinding/core/jps/JumpPointGenerator\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,292:1\n1915#2,2:293\n1924#2,3:295\n*S KotlinDebug\n*F\n+ 1 JPSPlusCalculator.kt\next/mods/gameserver/geoengine/pathfinding/core/jps/JumpPointGenerator\n*L\n225#1:293,2\n237#1:295,3\n*E\n"]
    )
