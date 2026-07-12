// Bytecode for: ext.mods.gameserver.LoadMetricsService
// File: ext\mods\gameserver\LoadMetricsService.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/LoadMetricsService.class
  Last modified 9 de jul de 2026; size 4737 bytes
  MD5 checksum 9a4ac5d4ff38a2216a0c7b431bf5c618
  Compiled from "GameServer.kt"
final class ext.mods.gameserver.LoadMetricsService
  minor version: 0
  major version: 69
  flags: (0x0030) ACC_FINAL, ACC_SUPER
  this_class: #2                          // ext/mods/gameserver/LoadMetricsService
  super_class: #4                         // java/lang/Object
  interfaces: 0, fields: 2, methods: 6, attributes: 6
Constant pool:
    #1 = Utf8               ext/mods/gameserver/LoadMetricsService
    #2 = Class              #1            // ext/mods/gameserver/LoadMetricsService
    #3 = Utf8               java/lang/Object
    #4 = Class              #3            // java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = NameAndType        #5:#6         // "<init>":()V
    #8 = Methodref          #4.#7         // java/lang/Object."<init>":()V
    #9 = Utf8               this
   #10 = Utf8               Lext/mods/gameserver/LoadMetricsService;
   #11 = Utf8               record
   #12 = Utf8               (Ljava/lang/String;J)V
   #13 = Utf8               Lorg/jetbrains/annotations/NotNull;
   #14 = Utf8               metrics
   #15 = Utf8               Ljava/util/Map;
   #16 = NameAndType        #14:#15       // metrics:Ljava/util/Map;
   #17 = Fieldref           #2.#16        // ext/mods/gameserver/LoadMetricsService.metrics:Ljava/util/Map;
   #18 = Utf8               java/lang/Long
   #19 = Class              #18           // java/lang/Long
   #20 = Utf8               valueOf
   #21 = Utf8               (J)Ljava/lang/Long;
   #22 = NameAndType        #20:#21       // valueOf:(J)Ljava/lang/Long;
   #23 = Methodref          #19.#22       // java/lang/Long.valueOf:(J)Ljava/lang/Long;
   #24 = Utf8               java/util/Map
   #25 = Class              #24           // java/util/Map
   #26 = Utf8               put
   #27 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #28 = NameAndType        #26:#27       // put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #29 = InterfaceMethodref #25.#28       // java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #30 = Utf8               moduleName
   #31 = Utf8               Ljava/lang/String;
   #32 = Utf8               durationMs
   #33 = Utf8               J
   #34 = Utf8               getReportSortedBySlowest
   #35 = Utf8               ()Ljava/lang/String;
   #36 = Utf8               entrySet
   #37 = Utf8               ()Ljava/util/Set;
   #38 = NameAndType        #36:#37       // entrySet:()Ljava/util/Set;
   #39 = InterfaceMethodref #25.#38       // java/util/Map.entrySet:()Ljava/util/Set;
   #40 = Utf8               java/lang/Iterable
   #41 = Class              #40           // java/lang/Iterable
   #42 = Utf8               ext/mods/gameserver/LoadMetricsService$getReportSortedBySlowest$$inlined$sortedByDescending$1
   #43 = Class              #42           // ext/mods/gameserver/LoadMetricsService$getReportSortedBySlowest$$inlined$sortedByDescending$1
   #44 = Methodref          #43.#7        // ext/mods/gameserver/LoadMetricsService$getReportSortedBySlowest$$inlined$sortedByDescending$1."<init>":()V
   #45 = Utf8               java/util/Comparator
   #46 = Class              #45           // java/util/Comparator
   #47 = Utf8               kotlin/collections/CollectionsKt
   #48 = Class              #47           // kotlin/collections/CollectionsKt
   #49 = Utf8               sortedWith
   #50 = Utf8               (Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;
   #51 = NameAndType        #49:#50       // sortedWith:(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;
   #52 = Methodref          #48.#51       // kotlin/collections/CollectionsKt.sortedWith:(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;
   #53 = Utf8               \n
   #54 = String             #53           // \n
   #55 = Utf8               java/lang/CharSequence
   #56 = Class              #55           // java/lang/CharSequence
   #57 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
   #58 = MethodType         #57           //  (Ljava/lang/Object;)Ljava/lang/Object;
   #59 = Utf8               getReportSortedBySlowest$lambda$1
   #60 = Utf8               (Ljava/util/Map$Entry;)Ljava/lang/CharSequence;
   #61 = NameAndType        #59:#60       // getReportSortedBySlowest$lambda$1:(Ljava/util/Map$Entry;)Ljava/lang/CharSequence;
   #62 = Methodref          #2.#61        // ext/mods/gameserver/LoadMetricsService.getReportSortedBySlowest$lambda$1:(Ljava/util/Map$Entry;)Ljava/lang/CharSequence;
   #63 = MethodHandle       6:#62         // REF_invokeStatic ext/mods/gameserver/LoadMetricsService.getReportSortedBySlowest$lambda$1:(Ljava/util/Map$Entry;)Ljava/lang/CharSequence;
   #64 = MethodType         #60           //  (Ljava/util/Map$Entry;)Ljava/lang/CharSequence;
   #65 = Utf8               java/lang/invoke/LambdaMetafactory
   #66 = Class              #65           // java/lang/invoke/LambdaMetafactory
   #67 = Utf8               metafactory
   #68 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
   #69 = NameAndType        #67:#68       // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
   #70 = Methodref          #66.#69       // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
   #71 = MethodHandle       6:#70         // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
   #72 = Utf8               invoke
   #73 = Utf8               ()Lkotlin/jvm/functions/Function1;
   #74 = NameAndType        #72:#73       // invoke:()Lkotlin/jvm/functions/Function1;
   #75 = InvokeDynamic      #0:#74        // #0:invoke:()Lkotlin/jvm/functions/Function1;
   #76 = Utf8               joinToString$default
   #77 = Utf8               (Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;
   #78 = NameAndType        #76:#77       // joinToString$default:(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;
   #79 = Methodref          #48.#78       // kotlin/collections/CollectionsKt.joinToString$default:(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;
   #80 = Utf8               $i$f$sortedByDescending
   #81 = Utf8               I
   #82 = Utf8               $this$sortedByDescending$iv
   #83 = Utf8               Ljava/lang/Iterable;
   #84 = Utf8               clear
   #85 = NameAndType        #84:#6        // clear:()V
   #86 = InterfaceMethodref #25.#85       // java/util/Map.clear:()V
   #87 = Utf8               java/util/Map$Entry
   #88 = Class              #87           // java/util/Map$Entry
   #89 = Utf8               getKey
   #90 = Utf8               ()Ljava/lang/Object;
   #91 = NameAndType        #89:#90       // getKey:()Ljava/lang/Object;
   #92 = InterfaceMethodref #88.#91       // java/util/Map$Entry.getKey:()Ljava/lang/Object;
   #93 = Utf8               java/lang/String
   #94 = Class              #93           // java/lang/String
   #95 = Utf8               getValue
   #96 = NameAndType        #95:#90       // getValue:()Ljava/lang/Object;
   #97 = InterfaceMethodref #88.#96       // java/util/Map$Entry.getValue:()Ljava/lang/Object;
   #98 = Utf8                 %.2fs - \u0001
   #99 = String             #98           //   %.2fs - \u0001
  #100 = Utf8               java/lang/invoke/StringConcatFactory
  #101 = Class              #100          // java/lang/invoke/StringConcatFactory
  #102 = Utf8               makeConcatWithConstants
  #103 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #104 = NameAndType        #102:#103     // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #105 = Methodref          #101.#104     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #106 = MethodHandle       6:#105        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #107 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
  #108 = NameAndType        #102:#107     // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #109 = InvokeDynamic      #1:#108       // #1:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #110 = Utf8               longValue
  #111 = Utf8               ()J
  #112 = NameAndType        #110:#111     // longValue:()J
  #113 = Methodref          #19.#112      // java/lang/Long.longValue:()J
  #114 = Double             1000.0d
  #116 = Utf8               java/lang/Double
  #117 = Class              #116          // java/lang/Double
  #118 = Utf8               (D)Ljava/lang/Double;
  #119 = NameAndType        #20:#118      // valueOf:(D)Ljava/lang/Double;
  #120 = Methodref          #117.#119     // java/lang/Double.valueOf:(D)Ljava/lang/Double;
  #121 = Utf8               java/util/Arrays
  #122 = Class              #121          // java/util/Arrays
  #123 = Utf8               copyOf
  #124 = Utf8               ([Ljava/lang/Object;I)[Ljava/lang/Object;
  #125 = NameAndType        #123:#124     // copyOf:([Ljava/lang/Object;I)[Ljava/lang/Object;
  #126 = Methodref          #122.#125     // java/util/Arrays.copyOf:([Ljava/lang/Object;I)[Ljava/lang/Object;
  #127 = Utf8               format
  #128 = Utf8               (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
  #129 = NameAndType        #127:#128     // format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
  #130 = Methodref          #94.#129      // java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
  #131 = Utf8               format(...)
  #132 = String             #131          // format(...)
  #133 = Utf8               kotlin/jvm/internal/Intrinsics
  #134 = Class              #133          // kotlin/jvm/internal/Intrinsics
  #135 = Utf8               checkNotNullExpressionValue
  #136 = Utf8               (Ljava/lang/Object;Ljava/lang/String;)V
  #137 = NameAndType        #135:#136     // checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
  #138 = Methodref          #134.#137     // kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
  #139 = Utf8               name
  #140 = Utf8               ms
  #141 = Utf8               Ljava/lang/Long;
  #142 = Utf8               <clinit>
  #143 = Methodref          #2.#7         // ext/mods/gameserver/LoadMetricsService."<init>":()V
  #144 = Utf8               INSTANCE
  #145 = NameAndType        #144:#10      // INSTANCE:Lext/mods/gameserver/LoadMetricsService;
  #146 = Fieldref           #2.#145       // ext/mods/gameserver/LoadMetricsService.INSTANCE:Lext/mods/gameserver/LoadMetricsService;
  #147 = Utf8               java/util/LinkedHashMap
  #148 = Class              #147          // java/util/LinkedHashMap
  #149 = Methodref          #148.#7       // java/util/LinkedHashMap."<init>":()V
  #150 = Utf8               java/util/Collections
  #151 = Class              #150          // java/util/Collections
  #152 = Utf8               synchronizedMap
  #153 = Utf8               (Ljava/util/Map;)Ljava/util/Map;
  #154 = NameAndType        #152:#153     // synchronizedMap:(Ljava/util/Map;)Ljava/util/Map;
  #155 = Methodref          #151.#154     // java/util/Collections.synchronizedMap:(Ljava/util/Map;)Ljava/util/Map;
  #156 = Utf8               Ljava/util/Map<Ljava/lang/String;Ljava/lang/Long;>;
  #157 = Utf8               Lkotlin/Metadata;
  #158 = Utf8               mv
  #159 = Integer            2
  #160 = Integer            3
  #161 = Integer            0
  #162 = Utf8               k
  #163 = Integer            1
  #164 = Utf8               xi
  #165 = Integer            48
  #166 = Utf8               d1
  #167 = Utf8               \u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\bJ\u0006\u0010\u000e\u001a\u00020\u0006J\u0006\u0010\u000f\u001a\u00020\u000bRN\u0010\u0004\u001aB\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\b0\b \u0007* \u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\b0\b\u0018\u00010\t0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010
  #168 = Utf8               d2
  #169 = Utf8
  #170 = Utf8               kotlin.jvm.PlatformType
  #171 = Utf8               Brproject
  #172 = Utf8               Entry
  #173 = Utf8               GameServer.kt
  #174 = Utf8               Lkotlin/jvm/internal/SourceDebugExtension;
  #175 = Utf8               value
  #176 = Utf8               SMAP\nGameServer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GameServer.kt\next/mods/gameserver/LoadMetricsService\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,703:1\n1080#2:704\n*S KotlinDebug\n*F\n+ 1 GameServer.kt\next/mods/gameserver/LoadMetricsService\n*L\n198#1:704\n*E\n
  #177 = Utf8               RuntimeInvisibleAnnotations
  #178 = Utf8               Signature
  #179 = Utf8               Code
  #180 = Utf8               LineNumberTable
  #181 = Utf8               LocalVariableTable
  #182 = Utf8               RuntimeInvisibleParameterAnnotations
  #183 = Utf8               InnerClasses
  #184 = Utf8               SourceFile
  #185 = Utf8               SourceDebugExtension
  #186 = Utf8               RuntimeVisibleAnnotations
  #187 = Utf8               BootstrapMethods
{
  public static final ext.mods.gameserver.LoadMetricsService INSTANCE;
    descriptor: Lext/mods/gameserver/LoadMetricsService;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    RuntimeInvisibleAnnotations:
      0: #13()
        org.jetbrains.annotations.NotNull

  public final void record(java.lang.String, long);
    descriptor: (Ljava/lang/String;J)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=4, locals=4, args_size=3
         0: getstatic     #17                 // Field metrics:Ljava/util/Map;
         3: aload_1
         4: lload_2
         5: invokestatic  #23                 // Method java/lang/Long.valueOf:(J)Ljava/lang/Long;
         8: invokeinterface #29,  3           // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        13: pop
        14: return
      LineNumberTable:
        line 194: 0
        line 195: 14
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      15     0  this   Lext/mods/gameserver/LoadMetricsService;
            0      15     1 moduleName   Ljava/lang/String;
            0      15     2 durationMs   J
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #13()
          org.jetbrains.annotations.NotNull
      parameter 1:

  public final java.lang.String getReportSortedBySlowest();
    descriptor: ()Ljava/lang/String;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=9, locals=3, args_size=1
         0: getstatic     #17                 // Field metrics:Ljava/util/Map;
         3: invokeinterface #39,  1           // InterfaceMethod java/util/Map.entrySet:()Ljava/util/Set;
         8: checkcast     #41                 // class java/lang/Iterable
        11: astore_1
        12: nop
        13: iconst_0
        14: istore_2
        15: aload_1
        16: new           #43                 // class ext/mods/gameserver/LoadMetricsService$getReportSortedBySlowest$$inlined$sortedByDescending$1
        19: dup
        20: invokespecial #44                 // Method ext/mods/gameserver/LoadMetricsService$getReportSortedBySlowest$$inlined$sortedByDescending$1."<init>":()V
        23: checkcast     #46                 // class java/util/Comparator
        26: invokestatic  #52                 // Method kotlin/collections/CollectionsKt.sortedWith:(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;
        29: checkcast     #41                 // class java/lang/Iterable
        32: ldc           #54                 // String \n
        34: checkcast     #56                 // class java/lang/CharSequence
        37: aconst_null
        38: aconst_null
        39: iconst_0
        40: aconst_null
        41: invokedynamic #75,  0             // InvokeDynamic #0:invoke:()Lkotlin/jvm/functions/Function1;
        46: bipush        30
        48: aconst_null
        49: invokestatic  #79                 // Method kotlin/collections/CollectionsKt.joinToString$default:(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;
        52: areturn
      LineNumberTable:
        line 197: 0
        line 198: 12
        line 704: 15
        line 704: 26
        line 199: 32
        line 197: 52
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           15      14     2 $i$f$sortedByDescending   I
           13      16     1 $this$sortedByDescending$iv   Ljava/lang/Iterable;
            0      53     0  this   Lext/mods/gameserver/LoadMetricsService;
    RuntimeInvisibleAnnotations:
      0: #13()
        org.jetbrains.annotations.NotNull

  public final void clear();
    descriptor: ()V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #17                 // Field metrics:Ljava/util/Map;
         3: invokeinterface #86,  1           // InterfaceMethod java/util/Map.clear:()V
         8: return
      LineNumberTable:
        line 203: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       9     0  this   Lext/mods/gameserver/LoadMetricsService;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=2, locals=0, args_size=0
         0: new           #2                  // class ext/mods/gameserver/LoadMetricsService
         3: dup
         4: invokespecial #143                // Method "<init>":()V
         7: putstatic     #146                // Field INSTANCE:Lext/mods/gameserver/LoadMetricsService;
        10: new           #148                // class java/util/LinkedHashMap
        13: dup
        14: invokespecial #149                // Method java/util/LinkedHashMap."<init>":()V
        17: checkcast     #25                 // class java/util/Map
        20: invokestatic  #155                // Method java/util/Collections.synchronizedMap:(Ljava/util/Map;)Ljava/util/Map;
        23: putstatic     #17                 // Field metrics:Ljava/util/Map;
        26: return
      LineNumberTable:
        line 192: 10
        line 192: 20
}
InnerClasses:
  public static #172= #88 of #25;         // Entry=class java/util/Map$Entry of class java/util/Map
SourceFile: "GameServer.kt"
SourceDebugExtension:
  SMAP
  GameServer.kt
  Kotlin
  *S Kotlin
  *F
  + 1 GameServer.kt
  ext/mods/gameserver/LoadMetricsService
  + 2 _Collections.kt
  kotlin/collections/CollectionsKt___CollectionsKt
  *L
  1#1,703:1
  1080#2:704
  *S KotlinDebug
  *F
  + 1 GameServer.kt
  ext/mods/gameserver/LoadMetricsService
  *L
  198#1:704
  *E
RuntimeVisibleAnnotations:
  0: #157(#158=[I#159,I#160,I#161],#162=I#163,#164=I#165,#166=[s#167],#168=[s#10,s#169,s#5,s#6,s#14,s#169,s#169,s#170,s#169,s#169,s#11,s#169,s#30,s#32,s#34,s#84,s#171])
    kotlin.Metadata(
      mv=[2,3,0]
      k=1
      xi=48
      d1=["\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\bJ\u0006\u0010\u000e\u001a\u00020\u0006J\u0006\u0010\u000f\u001a\u00020\u000bRN\u0010\u0004\u001aB\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\b0\b \u0007* \u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\b0\b\u0018\u00010\t0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"]
      d2=["Lext/mods/gameserver/LoadMetricsService;","","<init>","()V","metrics","","","kotlin.jvm.PlatformType","","","record","","moduleName","durationMs","getReportSortedBySlowest","clear","Brproject"]
    )
RuntimeInvisibleAnnotations:
  0: #174(#175=[s#176])
    kotlin.jvm.internal.SourceDebugExtension(
      value=["SMAP\nGameServer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GameServer.kt\next/mods/gameserver/LoadMetricsService\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,703:1\n1080#2:704\n*S KotlinDebug\n*F\n+ 1 GameServer.kt\next/mods/gameserver/LoadMetricsService\n*L\n198#1:704\n*E\n"]
    )
BootstrapMethods:
  0: #71 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #58 (Ljava/lang/Object;)Ljava/lang/Object;
      #63 REF_invokeStatic ext/mods/gameserver/LoadMetricsService.getReportSortedBySlowest$lambda$1:(Ljava/util/Map$Entry;)Ljava/lang/CharSequence;
      #64 (Ljava/util/Map$Entry;)Ljava/lang/CharSequence;
  1: #106 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #99   %.2fs - \u0001
