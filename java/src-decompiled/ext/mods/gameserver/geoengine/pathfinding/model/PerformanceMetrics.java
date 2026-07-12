// Bytecode for: ext.mods.gameserver.geoengine.pathfinding.model.PerformanceMetrics
// File: ext\mods\gameserver\geoengine\pathfinding\model\PerformanceMetrics.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/geoengine/pathfinding/model/PerformanceMetrics.class
  Last modified 9 de jul de 2026; size 2230 bytes
  MD5 checksum bb59d0ab9b4cd29eb052f56bd1f9472d
  Compiled from "Location.kt"
public final class ext.mods.gameserver.geoengine.pathfinding.model.PerformanceMetrics
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #2                          // ext/mods/gameserver/geoengine/pathfinding/model/PerformanceMetrics
  super_class: #4                         // java/lang/Object
  interfaces: 0, fields: 1, methods: 6, attributes: 2
Constant pool:
    #1 = Utf8               ext/mods/gameserver/geoengine/pathfinding/model/PerformanceMetrics
    #2 = Class              #1            // ext/mods/gameserver/geoengine/pathfinding/model/PerformanceMetrics
    #3 = Utf8               java/lang/Object
    #4 = Class              #3            // java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = NameAndType        #5:#6         // "<init>":()V
    #8 = Methodref          #4.#7         // java/lang/Object."<init>":()V
    #9 = Utf8               java/util/ArrayList
   #10 = Class              #9            // java/util/ArrayList
   #11 = Methodref          #10.#7        // java/util/ArrayList."<init>":()V
   #12 = Utf8               java/util/List
   #13 = Class              #12           // java/util/List
   #14 = Utf8               times
   #15 = Utf8               Ljava/util/List;
   #16 = NameAndType        #14:#15       // times:Ljava/util/List;
   #17 = Fieldref           #2.#16        // ext/mods/gameserver/geoengine/pathfinding/model/PerformanceMetrics.times:Ljava/util/List;
   #18 = Utf8               this
   #19 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/model/PerformanceMetrics;
   #20 = Utf8               record
   #21 = Utf8               (J)V
   #22 = Utf8               java/lang/Long
   #23 = Class              #22           // java/lang/Long
   #24 = Utf8               valueOf
   #25 = Utf8               (J)Ljava/lang/Long;
   #26 = NameAndType        #24:#25       // valueOf:(J)Ljava/lang/Long;
   #27 = Methodref          #23.#26       // java/lang/Long.valueOf:(J)Ljava/lang/Long;
   #28 = Utf8               add
   #29 = Utf8               (Ljava/lang/Object;)Z
   #30 = NameAndType        #28:#29       // add:(Ljava/lang/Object;)Z
   #31 = InterfaceMethodref #13.#30       // java/util/List.add:(Ljava/lang/Object;)Z
   #32 = Utf8               nanos
   #33 = Utf8               J
   #34 = Utf8               getPercentile
   #35 = Utf8               (D)D
   #36 = Utf8               isEmpty
   #37 = Utf8               ()Z
   #38 = NameAndType        #36:#37       // isEmpty:()Z
   #39 = InterfaceMethodref #13.#38       // java/util/List.isEmpty:()Z
   #40 = Utf8               java/lang/Iterable
   #41 = Class              #40           // java/lang/Iterable
   #42 = Utf8               kotlin/collections/CollectionsKt
   #43 = Class              #42           // kotlin/collections/CollectionsKt
   #44 = Utf8               sorted
   #45 = Utf8               (Ljava/lang/Iterable;)Ljava/util/List;
   #46 = NameAndType        #44:#45       // sorted:(Ljava/lang/Iterable;)Ljava/util/List;
   #47 = Methodref          #43.#46       // kotlin/collections/CollectionsKt.sorted:(Ljava/lang/Iterable;)Ljava/util/List;
   #48 = Double             100.0d
   #50 = Utf8               size
   #51 = Utf8               ()I
   #52 = NameAndType        #50:#51       // size:()I
   #53 = InterfaceMethodref #13.#52       // java/util/List.size:()I
   #54 = Utf8               kotlin/ranges/RangesKt
   #55 = Class              #54           // kotlin/ranges/RangesKt
   #56 = Utf8               coerceIn
   #57 = Utf8               (III)I
   #58 = NameAndType        #56:#57       // coerceIn:(III)I
   #59 = Methodref          #55.#58       // kotlin/ranges/RangesKt.coerceIn:(III)I
   #60 = Utf8               get
   #61 = Utf8               (I)Ljava/lang/Object;
   #62 = NameAndType        #60:#61       // get:(I)Ljava/lang/Object;
   #63 = InterfaceMethodref #13.#62       // java/util/List.get:(I)Ljava/lang/Object;
   #64 = Utf8               java/lang/Number
   #65 = Class              #64           // java/lang/Number
   #66 = Utf8               longValue
   #67 = Utf8               ()J
   #68 = NameAndType        #66:#67       // longValue:()J
   #69 = Methodref          #65.#68       // java/lang/Number.longValue:()J
   #70 = Utf8               index
   #71 = Utf8               I
   #72 = Utf8               p
   #73 = Utf8               D
   #74 = Utf8               getAverage
   #75 = Utf8               ()D
   #76 = Utf8               averageOfLong
   #77 = Utf8               (Ljava/lang/Iterable;)D
   #78 = NameAndType        #76:#77       // averageOfLong:(Ljava/lang/Iterable;)D
   #79 = Methodref          #43.#78       // kotlin/collections/CollectionsKt.averageOfLong:(Ljava/lang/Iterable;)D
   #80 = Utf8               getMin
   #81 = Utf8               minOrNull
   #82 = Utf8               (Ljava/lang/Iterable;)Ljava/lang/Comparable;
   #83 = NameAndType        #81:#82       // minOrNull:(Ljava/lang/Iterable;)Ljava/lang/Comparable;
   #84 = Methodref          #43.#83       // kotlin/collections/CollectionsKt.minOrNull:(Ljava/lang/Iterable;)Ljava/lang/Comparable;
   #85 = Methodref          #23.#68       // java/lang/Long.longValue:()J
   #86 = Utf8               getMax
   #87 = Utf8               maxOrNull
   #88 = NameAndType        #87:#82       // maxOrNull:(Ljava/lang/Iterable;)Ljava/lang/Comparable;
   #89 = Methodref          #43.#88       // kotlin/collections/CollectionsKt.maxOrNull:(Ljava/lang/Iterable;)Ljava/lang/Comparable;
   #90 = Utf8               Ljava/util/List<Ljava/lang/Long;>;
   #91 = Utf8               Lorg/jetbrains/annotations/NotNull;
   #92 = Utf8               Lkotlin/Metadata;
   #93 = Utf8               mv
   #94 = Integer            2
   #95 = Integer            3
   #96 = Integer            0
   #97 = Utf8               k
   #98 = Integer            1
   #99 = Utf8               xi
  #100 = Integer            48
  #101 = Utf8               d1
  #102 = Utf8               \u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bJ\u0006\u0010\r\u001a\u00020\u000bJ\u0006\u0010\u000e\u001a\u00020\u0006J\u0006\u0010\u000f\u001a\u00020\u0006R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010
  #103 = Utf8               d2
  #104 = Utf8
  #105 = Utf8               Brproject
  #106 = Utf8               Location.kt
  #107 = Utf8               Signature
  #108 = Utf8               RuntimeInvisibleAnnotations
  #109 = Utf8               Code
  #110 = Utf8               LineNumberTable
  #111 = Utf8               LocalVariableTable
  #112 = Utf8               StackMapTable
  #113 = Utf8               SourceFile
  #114 = Utf8               RuntimeVisibleAnnotations
{
  public ext.mods.gameserver.geoengine.pathfinding.model.PerformanceMetrics();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=1, args_size=1
         0: aload_0
         1: invokespecial #8                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: new           #10                 // class java/util/ArrayList
         8: dup
         9: invokespecial #11                 // Method java/util/ArrayList."<init>":()V
        12: checkcast     #13                 // class java/util/List
        15: putfield      #17                 // Field times:Ljava/util/List;
        18: return
      LineNumberTable:
        line 162: 0
        line 163: 4
        line 163: 15
        line 162: 18
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      19     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/PerformanceMetrics;

  public final void record(long);
    descriptor: (J)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=3, locals=3, args_size=2
         0: aload_0
         1: getfield      #17                 // Field times:Ljava/util/List;
         4: lload_1
         5: invokestatic  #27                 // Method java/lang/Long.valueOf:(J)Ljava/lang/Long;
         8: invokeinterface #31,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        13: pop
        14: return
      LineNumberTable:
        line 166: 0
        line 167: 14
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      15     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/PerformanceMetrics;
            0      15     1 nanos   J

  public final double getPercentile(double);
    descriptor: (D)D
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=4, locals=5, args_size=2
         0: aload_0
         1: getfield      #17                 // Field times:Ljava/util/List;
         4: invokeinterface #39,  1           // InterfaceMethod java/util/List.isEmpty:()Z
         9: ifeq          14
        12: dconst_0
        13: dreturn
        14: aload_0
        15: getfield      #17                 // Field times:Ljava/util/List;
        18: checkcast     #41                 // class java/lang/Iterable
        21: invokestatic  #47                 // Method kotlin/collections/CollectionsKt.sorted:(Ljava/lang/Iterable;)Ljava/util/List;
        24: astore_3
        25: dload_1
        26: ldc2_w        #48                 // double 100.0d
        29: ddiv
        30: aload_3
        31: invokeinterface #53,  1           // InterfaceMethod java/util/List.size:()I
        36: i2d
        37: dmul
        38: d2i
        39: iconst_0
        40: aload_3
        41: invokeinterface #53,  1           // InterfaceMethod java/util/List.size:()I
        46: iconst_1
        47: isub
        48: invokestatic  #59                 // Method kotlin/ranges/RangesKt.coerceIn:(III)I
        51: istore        4
        53: aload_3
        54: iload         4
        56: invokeinterface #63,  2           // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
        61: checkcast     #65                 // class java/lang/Number
        64: invokevirtual #69                 // Method java/lang/Number.longValue:()J
        67: l2d
        68: dreturn
      StackMapTable: number_of_entries = 1
        frame_type = 14 /* same */
      LineNumberTable:
        line 170: 0
        line 171: 14
        line 172: 25
        line 173: 53
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           25      44     3 sorted   Ljava/util/List;
           53      16     4 index   I
            0      69     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/PerformanceMetrics;
            0      69     1     p   D

  public final double getAverage();
    descriptor: ()D
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #17                 // Field times:Ljava/util/List;
         4: invokeinterface #39,  1           // InterfaceMethod java/util/List.isEmpty:()Z
         9: ifeq          14
        12: dconst_0
        13: dreturn
        14: aload_0
        15: getfield      #17                 // Field times:Ljava/util/List;
        18: checkcast     #41                 // class java/lang/Iterable
        21: invokestatic  #79                 // Method kotlin/collections/CollectionsKt.averageOfLong:(Ljava/lang/Iterable;)D
        24: dreturn
      StackMapTable: number_of_entries = 1
        frame_type = 14 /* same */
      LineNumberTable:
        line 177: 0
        line 178: 14
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      25     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/PerformanceMetrics;

  public final long getMin();
    descriptor: ()J
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #17                 // Field times:Ljava/util/List;
         4: checkcast     #41                 // class java/lang/Iterable
         7: invokestatic  #84                 // Method kotlin/collections/CollectionsKt.minOrNull:(Ljava/lang/Iterable;)Ljava/lang/Comparable;
        10: checkcast     #23                 // class java/lang/Long
        13: dup
        14: ifnull        23
        17: invokevirtual #85                 // Method java/lang/Long.longValue:()J
        20: goto          25
        23: pop
        24: lconst_0
        25: lreturn
      StackMapTable: number_of_entries = 2
        frame_type = 87 /* same_locals_1_stack_item */
          stack = [ class java/lang/Long ]
        frame_type = 65 /* same_locals_1_stack_item */
          stack = [ long ]
      LineNumberTable:
        line 181: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      26     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/PerformanceMetrics;

  public final long getMax();
    descriptor: ()J
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #17                 // Field times:Ljava/util/List;
         4: checkcast     #41                 // class java/lang/Iterable
         7: invokestatic  #89                 // Method kotlin/collections/CollectionsKt.maxOrNull:(Ljava/lang/Iterable;)Ljava/lang/Comparable;
        10: checkcast     #23                 // class java/lang/Long
        13: dup
        14: ifnull        23
        17: invokevirtual #85                 // Method java/lang/Long.longValue:()J
        20: goto          25
        23: pop
        24: lconst_0
        25: lreturn
      StackMapTable: number_of_entries = 2
        frame_type = 87 /* same_locals_1_stack_item */
          stack = [ class java/lang/Long ]
        frame_type = 65 /* same_locals_1_stack_item */
          stack = [ long ]
      LineNumberTable:
        line 182: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      26     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/PerformanceMetrics;
}
SourceFile: "Location.kt"
RuntimeVisibleAnnotations:
  0: #92(#93=[I#94,I#95,I#96],#97=I#98,#99=I#100,#101=[s#102],#103=[s#19,s#104,s#5,s#6,s#14,s#104,s#104,s#20,s#104,s#32,s#34,s#104,s#72,s#74,s#80,s#86,s#105])
    kotlin.Metadata(
      mv=[2,3,0]
      k=1
      xi=48
      d1=["\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bJ\u0006\u0010\r\u001a\u00020\u000bJ\u0006\u0010\u000e\u001a\u00020\u0006J\u0006\u0010\u000f\u001a\u00020\u0006R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"]
      d2=["Lext/mods/gameserver/geoengine/pathfinding/model/PerformanceMetrics;","","<init>","()V","times","","","record","","nanos","getPercentile","","p","getAverage","getMin","getMax","Brproject"]
    )
