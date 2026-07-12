// Bytecode for: ext.mods.gameserver.geoengine.pathfinding.generation.GeoIndexer$indexRegion$3$collectorDeferred$1
// File: ext\mods\gameserver\geoengine\pathfinding\generation\GeoIndexer$indexRegion$3$collectorDeferred$1.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3$collectorDeferred$1.class
  Last modified 9 de jul de 2026; size 4474 bytes
  MD5 checksum 999a9161df9381c0b75ca1e637567409
  Compiled from "GeoIndexer.kt"
final class ext.mods.gameserver.geoengine.pathfinding.generation.GeoIndexer$indexRegion$3$collectorDeferred$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super java.util.List<ext.mods.gameserver.geoengine.pathfinding.model.IndexedNode>>, java.lang.Object>
  minor version: 0
  major version: 69
  flags: (0x0030) ACC_FINAL, ACC_SUPER
  this_class: #2                          // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3$collectorDeferred$1
  super_class: #5                         // kotlin/coroutines/jvm/internal/SuspendLambda
  interfaces: 1, fields: 4, methods: 5, attributes: 5
Constant pool:
    #1 = Utf8               ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3$collectorDeferred$1
    #2 = Class              #1            // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3$collectorDeferred$1
    #3 = Utf8               Lkotlin/coroutines/jvm/internal/SuspendLambda;Lkotlin/jvm/functions/Function2<Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation<-Ljava/util/List<Lext/mods/gameserver/geoengine/pathfinding/model/IndexedNode;>;>;Ljava/lang/Object;>;
    #4 = Utf8               kotlin/coroutines/jvm/internal/SuspendLambda
    #5 = Class              #4            // kotlin/coroutines/jvm/internal/SuspendLambda
    #6 = Utf8               kotlin/jvm/functions/Function2
    #7 = Class              #6            // kotlin/jvm/functions/Function2
    #8 = Utf8               <init>
    #9 = Utf8               (Lkotlinx/coroutines/channels/Channel;Lkotlin/coroutines/Continuation;)V
   #10 = Utf8               (Lkotlinx/coroutines/channels/Channel<Lext/mods/gameserver/geoengine/pathfinding/model/IndexedNode;>;Lkotlin/coroutines/Continuation<-Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3$collectorDeferred$1;>;)V
   #11 = Utf8               $nodeChannel
   #12 = Utf8               Lkotlinx/coroutines/channels/Channel;
   #13 = NameAndType        #11:#12       // $nodeChannel:Lkotlinx/coroutines/channels/Channel;
   #14 = Fieldref           #2.#13        // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3$collectorDeferred$1.$nodeChannel:Lkotlinx/coroutines/channels/Channel;
   #15 = Utf8               (ILkotlin/coroutines/Continuation;)V
   #16 = NameAndType        #8:#15        // "<init>":(ILkotlin/coroutines/Continuation;)V
   #17 = Methodref          #5.#16        // kotlin/coroutines/jvm/internal/SuspendLambda."<init>":(ILkotlin/coroutines/Continuation;)V
   #18 = Utf8               this
   #19 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3$collectorDeferred$1;
   #20 = Utf8               $completion
   #21 = Utf8               Lkotlin/coroutines/Continuation;
   #22 = Utf8               invokeSuspend
   #23 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
   #24 = Utf8               L$0
   #25 = Utf8               Ljava/lang/Object;
   #26 = Utf8               L$1
   #27 = Utf8               Lkotlin/coroutines/jvm/internal/DebugMetadata;
   #28 = Utf8               f
   #29 = Utf8               GeoIndexer.kt
   #30 = Utf8               l
   #31 = Integer            299
   #32 = Utf8               nl
   #33 = Integer            300
   #34 = Utf8               i
   #35 = Integer            0
   #36 = Utf8               s
   #37 = Utf8               n
   #38 = Utf8               allNodes
   #39 = Utf8               m
   #40 = Utf8               c
   #41 = Utf8               ext.mods.gameserver.geoengine.pathfinding.generation.GeoIndexer$indexRegion$3$collectorDeferred$1
   #42 = Utf8               v
   #43 = Integer            2
   #44 = Utf8               kotlin/coroutines/intrinsics/IntrinsicsKt
   #45 = Class              #44           // kotlin/coroutines/intrinsics/IntrinsicsKt
   #46 = Utf8               getCOROUTINE_SUSPENDED
   #47 = Utf8               ()Ljava/lang/Object;
   #48 = NameAndType        #46:#47       // getCOROUTINE_SUSPENDED:()Ljava/lang/Object;
   #49 = Methodref          #45.#48       // kotlin/coroutines/intrinsics/IntrinsicsKt.getCOROUTINE_SUSPENDED:()Ljava/lang/Object;
   #50 = Utf8               label
   #51 = Utf8               I
   #52 = NameAndType        #50:#51       // label:I
   #53 = Fieldref           #2.#52        // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3$collectorDeferred$1.label:I
   #54 = Utf8               kotlin/ResultKt
   #55 = Class              #54           // kotlin/ResultKt
   #56 = Utf8               throwOnFailure
   #57 = Utf8               (Ljava/lang/Object;)V
   #58 = NameAndType        #56:#57       // throwOnFailure:(Ljava/lang/Object;)V
   #59 = Methodref          #55.#58       // kotlin/ResultKt.throwOnFailure:(Ljava/lang/Object;)V
   #60 = Utf8               java/util/ArrayList
   #61 = Class              #60           // java/util/ArrayList
   #62 = Utf8               ()V
   #63 = NameAndType        #8:#62        // "<init>":()V
   #64 = Methodref          #61.#63       // java/util/ArrayList."<init>":()V
   #65 = Utf8               java/util/List
   #66 = Class              #65           // java/util/List
   #67 = Utf8               kotlinx/coroutines/channels/Channel
   #68 = Class              #67           // kotlinx/coroutines/channels/Channel
   #69 = Utf8               iterator
   #70 = Utf8               ()Lkotlinx/coroutines/channels/ChannelIterator;
   #71 = NameAndType        #69:#70       // iterator:()Lkotlinx/coroutines/channels/ChannelIterator;
   #72 = InterfaceMethodref #68.#71       // kotlinx/coroutines/channels/Channel.iterator:()Lkotlinx/coroutines/channels/ChannelIterator;
   #73 = Utf8               kotlin/coroutines/Continuation
   #74 = Class              #73           // kotlin/coroutines/Continuation
   #75 = NameAndType        #24:#25       // L$0:Ljava/lang/Object;
   #76 = Fieldref           #2.#75        // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3$collectorDeferred$1.L$0:Ljava/lang/Object;
   #77 = NameAndType        #26:#25       // L$1:Ljava/lang/Object;
   #78 = Fieldref           #2.#77        // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3$collectorDeferred$1.L$1:Ljava/lang/Object;
   #79 = Utf8               kotlinx/coroutines/channels/ChannelIterator
   #80 = Class              #79           // kotlinx/coroutines/channels/ChannelIterator
   #81 = Utf8               hasNext
   #82 = Utf8               (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
   #83 = NameAndType        #81:#82       // hasNext:(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
   #84 = InterfaceMethodref #80.#83       // kotlinx/coroutines/channels/ChannelIterator.hasNext:(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
   #85 = Utf8               java/lang/Boolean
   #86 = Class              #85           // java/lang/Boolean
   #87 = Utf8               booleanValue
   #88 = Utf8               ()Z
   #89 = NameAndType        #87:#88       // booleanValue:()Z
   #90 = Methodref          #86.#89       // java/lang/Boolean.booleanValue:()Z
   #91 = Utf8               next
   #92 = NameAndType        #91:#47       // next:()Ljava/lang/Object;
   #93 = InterfaceMethodref #80.#92       // kotlinx/coroutines/channels/ChannelIterator.next:()Ljava/lang/Object;
   #94 = Utf8               ext/mods/gameserver/geoengine/pathfinding/model/IndexedNode
   #95 = Class              #94           // ext/mods/gameserver/geoengine/pathfinding/model/IndexedNode
   #96 = Utf8               add
   #97 = Utf8               (Ljava/lang/Object;)Z
   #98 = NameAndType        #96:#97       // add:(Ljava/lang/Object;)Z
   #99 = InterfaceMethodref #66.#98       // java/util/List.add:(Ljava/lang/Object;)Z
  #100 = Utf8               java/lang/IllegalStateException
  #101 = Class              #100          // java/lang/IllegalStateException
  #102 = Utf8               call to \'resume\' before \'invoke\' with coroutine
  #103 = String             #102          // call to \'resume\' before \'invoke\' with coroutine
  #104 = Utf8               (Ljava/lang/String;)V
  #105 = NameAndType        #8:#104       // "<init>":(Ljava/lang/String;)V
  #106 = Methodref          #101.#105     // java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
  #107 = Utf8               node
  #108 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/model/IndexedNode;
  #109 = Utf8               Ljava/util/List;
  #110 = Utf8               $result
  #111 = Utf8               java/lang/Object
  #112 = Class              #111          // java/lang/Object
  #113 = Utf8               create
  #114 = Utf8               (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
  #115 = Utf8               (Ljava/lang/Object;Lkotlin/coroutines/Continuation<*>;)Lkotlin/coroutines/Continuation<Lkotlin/Unit;>;
  #116 = NameAndType        #8:#9         // "<init>":(Lkotlinx/coroutines/channels/Channel;Lkotlin/coroutines/Continuation;)V
  #117 = Methodref          #2.#116       // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3$collectorDeferred$1."<init>":(Lkotlinx/coroutines/channels/Channel;Lkotlin/coroutines/Continuation;)V
  #118 = Utf8               value
  #119 = Utf8               invoke
  #120 = Utf8               (Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
  #121 = Utf8               (Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation<-Ljava/util/List<Lext/mods/gameserver/geoengine/pathfinding/model/IndexedNode;>;>;)Ljava/lang/Object;
  #122 = NameAndType        #113:#114     // create:(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
  #123 = Methodref          #2.#122       // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3$collectorDeferred$1.create:(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
  #124 = Utf8               kotlin/Unit
  #125 = Class              #124          // kotlin/Unit
  #126 = Utf8               INSTANCE
  #127 = Utf8               Lkotlin/Unit;
  #128 = NameAndType        #126:#127     // INSTANCE:Lkotlin/Unit;
  #129 = Fieldref           #125.#128     // kotlin/Unit.INSTANCE:Lkotlin/Unit;
  #130 = NameAndType        #22:#23       // invokeSuspend:(Ljava/lang/Object;)Ljava/lang/Object;
  #131 = Methodref          #2.#130       // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3$collectorDeferred$1.invokeSuspend:(Ljava/lang/Object;)Ljava/lang/Object;
  #132 = Utf8               p1
  #133 = Utf8               Lkotlinx/coroutines/CoroutineScope;
  #134 = Utf8               p2
  #135 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #136 = Utf8               kotlinx/coroutines/CoroutineScope
  #137 = Class              #136          // kotlinx/coroutines/CoroutineScope
  #138 = NameAndType        #119:#120     // invoke:(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
  #139 = Methodref          #2.#138       // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3$collectorDeferred$1.invoke:(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
  #140 = Utf8               Lkotlinx/coroutines/channels/Channel<Lext/mods/gameserver/geoengine/pathfinding/model/IndexedNode;>;
  #141 = Utf8               Lkotlin/Metadata;
  #142 = Utf8               mv
  #143 = Integer            3
  #144 = Utf8               k
  #145 = Utf8               xi
  #146 = Integer            48
  #147 = Utf8               d1
  #148 = Utf8               \u0000\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n
  #149 = Utf8               d2
  #150 = Utf8               <anonymous>
  #151 = Utf8
  #152 = Utf8               ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3
  #153 = Class              #152          // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3
  #154 = Utf8               Signature
  #155 = Utf8               Code
  #156 = Utf8               LocalVariableTable
  #157 = Utf8               StackMapTable
  #158 = Utf8               LineNumberTable
  #159 = Utf8               InnerClasses
  #160 = Utf8               EnclosingMethod
  #161 = Utf8               SourceFile
  #162 = Utf8               RuntimeVisibleAnnotations
{
  java.lang.Object L$0;
    descriptor: Ljava/lang/Object;
    flags: (0x0000)

  java.lang.Object L$1;
    descriptor: Ljava/lang/Object;
    flags: (0x0000)

  int label;
    descriptor: I
    flags: (0x0000)

  final kotlinx.coroutines.channels.Channel<ext.mods.gameserver.geoengine.pathfinding.model.IndexedNode> $nodeChannel;
    descriptor: Lkotlinx/coroutines/channels/Channel;
    flags: (0x1010) ACC_FINAL, ACC_SYNTHETIC
    Signature: #140                         // Lkotlinx/coroutines/channels/Channel<Lext/mods/gameserver/geoengine/pathfinding/model/IndexedNode;>;

  ext.mods.gameserver.geoengine.pathfinding.generation.GeoIndexer$indexRegion$3$collectorDeferred$1(kotlinx.coroutines.channels.Channel<ext.mods.gameserver.geoengine.pathfinding.model.IndexedNode>, kotlin.coroutines.Continuation<? super ext.mods.gameserver.geoengine.pathfinding.generation.GeoIndexer$indexRegion$3$collectorDeferred$1>);
    descriptor: (Lkotlinx/coroutines/channels/Channel;Lkotlin/coroutines/Continuation;)V
    flags: (0x0000)
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: putfield      #14                 // Field $nodeChannel:Lkotlinx/coroutines/channels/Channel;
         5: aload_0
         6: iconst_2
         7: aload_2
         8: invokespecial #17                 // Method kotlin/coroutines/jvm/internal/SuspendLambda."<init>":(ILkotlin/coroutines/Continuation;)V
        11: return
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3$collectorDeferred$1;
            0      12     1 $nodeChannel   Lkotlinx/coroutines/channels/Channel;
            0      12     2 $completion   Lkotlin/coroutines/Continuation;
    Signature: #10                          // (Lkotlinx/coroutines/channels/Channel<Lext/mods/gameserver/geoengine/pathfinding/model/IndexedNode;>;Lkotlin/coroutines/Continuation<-Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3$collectorDeferred$1;>;)V

  public final java.lang.Object invokeSuspend(java.lang.Object);
    descriptor: (Ljava/lang/Object;)Ljava/lang/Object;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=4, locals=6, args_size=2
         0: invokestatic  #49                 // Method kotlin/coroutines/intrinsics/IntrinsicsKt.getCOROUTINE_SUSPENDED:()Ljava/lang/Object;
         3: astore        5
         5: aload_0
         6: getfield      #53                 // Field label:I
         9: tableswitch   { // 0 to 1

                       0: 32

                       1: 91
                 default: 146
            }
        32: aload_1
        33: invokestatic  #59                 // Method kotlin/ResultKt.throwOnFailure:(Ljava/lang/Object;)V
        36: new           #61                 // class java/util/ArrayList
        39: dup
        40: invokespecial #64                 // Method java/util/ArrayList."<init>":()V
        43: checkcast     #66                 // class java/util/List
        46: astore_2
        47: aload_0
        48: getfield      #14                 // Field $nodeChannel:Lkotlinx/coroutines/channels/Channel;
        51: invokeinterface #72,  1           // InterfaceMethod kotlinx/coroutines/channels/Channel.iterator:()Lkotlinx/coroutines/channels/ChannelIterator;
        56: astore_3
        57: aload_3
        58: aload_0
        59: checkcast     #74                 // class kotlin/coroutines/Continuation
        62: aload_0
        63: aload_2
        64: putfield      #76                 // Field L$0:Ljava/lang/Object;
        67: aload_0
        68: aload_3
        69: putfield      #78                 // Field L$1:Ljava/lang/Object;
        72: aload_0
        73: iconst_1
        74: putfield      #53                 // Field label:I
        77: invokeinterface #84,  2           // InterfaceMethod kotlinx/coroutines/channels/ChannelIterator.hasNext:(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
        82: dup
        83: aload         5
        85: if_acmpne     112
        88: aload         5
        90: areturn
        91: aload_0
        92: getfield      #78                 // Field L$1:Ljava/lang/Object;
        95: checkcast     #80                 // class kotlinx/coroutines/channels/ChannelIterator
        98: astore_3
        99: aload_0
       100: getfield      #76                 // Field L$0:Ljava/lang/Object;
       103: checkcast     #66                 // class java/util/List
       106: astore_2
       107: aload_1
       108: invokestatic  #59                 // Method kotlin/ResultKt.throwOnFailure:(Ljava/lang/Object;)V
       111: aload_1
       112: checkcast     #86                 // class java/lang/Boolean
       115: invokevirtual #90                 // Method java/lang/Boolean.booleanValue:()Z
       118: ifeq          144
       121: aload_3
       122: invokeinterface #93,  1           // InterfaceMethod kotlinx/coroutines/channels/ChannelIterator.next:()Ljava/lang/Object;
       127: checkcast     #95                 // class ext/mods/gameserver/geoengine/pathfinding/model/IndexedNode
       130: astore        4
       132: aload_2
       133: aload         4
       135: invokeinterface #99,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       140: pop
       141: goto          57
       144: aload_2
       145: areturn
       146: new           #101                // class java/lang/IllegalStateException
       149: dup
       150: ldc           #103                // String call to \'resume\' before \'invoke\' with coroutine
       152: invokespecial #106                // Method java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
       155: athrow
      StackMapTable: number_of_entries = 6
        frame_type = 255 /* full_frame */
          offset_delta = 32
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3$collectorDeferred$1, class java/lang/Object, top, top, top, class java/lang/Object ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 24
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3$collectorDeferred$1, class java/lang/Object, class java/util/List, class kotlinx/coroutines/channels/ChannelIterator, top, class java/lang/Object ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 33
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3$collectorDeferred$1, class java/lang/Object, top, top, top, class java/lang/Object ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 20
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3$collectorDeferred$1, class java/lang/Object, class java/util/List, class kotlinx/coroutines/channels/ChannelIterator, top, class java/lang/Object ]
          stack = [ class java/lang/Object ]
        frame_type = 31 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 1
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3$collectorDeferred$1, class java/lang/Object, top, top, top, class java/lang/Object ]
          stack = []
      LineNumberTable:
        line 297: 3
        line 298: 36
        line 298: 46
        line 299: 47
        line 297: 88
        line 299: 112
        line 300: 132
        line 302: 144
        line 297: 146
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          132       9     4  node   Lext/mods/gameserver/geoengine/pathfinding/model/IndexedNode;
           47      44     2 allNodes   Ljava/util/List;
            0     156     0  this   Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3$collectorDeferred$1;
            0     156     1 $result   Ljava/lang/Object;
          107      39     2 allNodes   Ljava/util/List;

  public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object, kotlin.coroutines.Continuation<?>);
    descriptor: (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=4, locals=3, args_size=3
         0: new           #2                  // class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3$collectorDeferred$1
         3: dup
         4: aload_0
         5: getfield      #14                 // Field $nodeChannel:Lkotlinx/coroutines/channels/Channel;
         8: aload_2
         9: invokespecial #117                // Method "<init>":(Lkotlinx/coroutines/channels/Channel;Lkotlin/coroutines/Continuation;)V
        12: checkcast     #74                 // class kotlin/coroutines/Continuation
        15: areturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      16     0  this   Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3$collectorDeferred$1;
            0      16     1 value   Ljava/lang/Object;
            0      16     2 $completion   Lkotlin/coroutines/Continuation;
    Signature: #115                         // (Ljava/lang/Object;Lkotlin/coroutines/Continuation<*>;)Lkotlin/coroutines/Continuation<Lkotlin/Unit;>;

  public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super java.util.List<ext.mods.gameserver.geoengine.pathfinding.model.IndexedNode>>);
    descriptor: (Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: aload_2
         3: invokevirtual #123                // Method create:(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
         6: checkcast     #2                  // class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3$collectorDeferred$1
         9: getstatic     #129                // Field kotlin/Unit.INSTANCE:Lkotlin/Unit;
        12: invokevirtual #131                // Method invokeSuspend:(Ljava/lang/Object;)Ljava/lang/Object;
        15: areturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      16     0  this   Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3$collectorDeferred$1;
            0      16     1    p1   Lkotlinx/coroutines/CoroutineScope;
            0      16     2    p2   Lkotlin/coroutines/Continuation;
    Signature: #121                         // (Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation<-Ljava/util/List<Lext/mods/gameserver/geoengine/pathfinding/model/IndexedNode;>;>;)Ljava/lang/Object;

  public java.lang.Object invoke(java.lang.Object, java.lang.Object);
    descriptor: (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    flags: (0x1041) ACC_PUBLIC, ACC_BRIDGE, ACC_SYNTHETIC
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: checkcast     #137                // class kotlinx/coroutines/CoroutineScope
         5: aload_2
         6: checkcast     #74                 // class kotlin/coroutines/Continuation
         9: invokevirtual #139                // Method invoke:(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
        12: areturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      13     0  this   Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3$collectorDeferred$1;
            0      13     1    p1   Ljava/lang/Object;
            0      13     2    p2   Ljava/lang/Object;
}
InnerClasses:
  static final #153;                      // class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3
  static final #2;                        // class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3$collectorDeferred$1
EnclosingMethod: #153.#130              // ext.mods.gameserver.geoengine.pathfinding.generation.GeoIndexer$indexRegion$3.invokeSuspend
Signature: #3                           // Lkotlin/coroutines/jvm/internal/SuspendLambda;Lkotlin/jvm/functions/Function2<Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation<-Ljava/util/List<Lext/mods/gameserver/geoengine/pathfinding/model/IndexedNode;>;>;Ljava/lang/Object;>;
SourceFile: "GeoIndexer.kt"
RuntimeVisibleAnnotations:
  0: #27(#28=s#29,#30=[I#31],#32=[I#33],#34=[I#35],#36=[s#24],#37=[s#38],#39=s#22,#40=s#41,#42=I#43)
    kotlin.coroutines.jvm.internal.DebugMetadata(
      f="GeoIndexer.kt"
      l=[299]
      nl=[300]
      i=[0]
      s=["L$0"]
      n=["allNodes"]
      m="invokeSuspend"
      c="ext.mods.gameserver.geoengine.pathfinding.generation.GeoIndexer$indexRegion$3$collectorDeferred$1"
      v=2
    )
  1: #141(#142=[I#43,I#143,I#35],#144=I#143,#145=I#146,#147=[s#148],#149=[s#150,s#151,s#108,s#133])
    kotlin.Metadata(
      mv=[2,3,0]
      k=3
      xi=48
      d1=["\u0000\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"]
      d2=["<anonymous>","","Lext/mods/gameserver/geoengine/pathfinding/model/IndexedNode;","Lkotlinx/coroutines/CoroutineScope;"]
    )
