// Bytecode for: ext.mods.gameserver.geoengine.pathfinding.warmup.L2BRWarmUpService$WarmUpConfig
// File: ext\mods\gameserver\geoengine\pathfinding\warmup\L2BRWarmUpService$WarmUpConfig.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpConfig.class
  Last modified 9 de jul de 2026; size 5438 bytes
  MD5 checksum dfe7001320b2dd71c062a4fa6dd8e6a6
  Compiled from "L2BRWarmUpService.kt"
public final class ext.mods.gameserver.geoengine.pathfinding.warmup.L2BRWarmUpService$WarmUpConfig
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #2                          // ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpConfig
  super_class: #4                         // java/lang/Object
  interfaces: 0, fields: 8, methods: 22, attributes: 4
Constant pool:
    #1 = Utf8               ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpConfig
    #2 = Class              #1            // ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpConfig
    #3 = Utf8               java/lang/Object
    #4 = Class              #3            // java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               (ZIIIID)V
    #7 = Utf8               ()V
    #8 = NameAndType        #5:#7         // "<init>":()V
    #9 = Methodref          #4.#8         // java/lang/Object."<init>":()V
   #10 = Utf8               memoryPrefetchEnabled
   #11 = Utf8               Z
   #12 = NameAndType        #10:#11       // memoryPrefetchEnabled:Z
   #13 = Fieldref           #2.#12        // ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpConfig.memoryPrefetchEnabled:Z
   #14 = Utf8               jitIterations
   #15 = Utf8               I
   #16 = NameAndType        #14:#15       // jitIterations:I
   #17 = Fieldref           #2.#16        // ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpConfig.jitIterations:I
   #18 = Utf8               branchTrainingIterations
   #19 = NameAndType        #18:#15       // branchTrainingIterations:I
   #20 = Fieldref           #2.#19        // ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpConfig.branchTrainingIterations:I
   #21 = Utf8               validationIterations
   #22 = NameAndType        #21:#15       // validationIterations:I
   #23 = Fieldref           #2.#22        // ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpConfig.validationIterations:I
   #24 = Utf8               parallelWorkers
   #25 = NameAndType        #24:#15       // parallelWorkers:I
   #26 = Fieldref           #2.#25        // ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpConfig.parallelWorkers:I
   #27 = Utf8               targetLatencyP99Micros
   #28 = Utf8               D
   #29 = NameAndType        #27:#28       // targetLatencyP99Micros:D
   #30 = Fieldref           #2.#29        // ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpConfig.targetLatencyP99Micros:D
   #31 = Utf8               this
   #32 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpConfig;
   #33 = Utf8               (ZIIIIDILkotlin/jvm/internal/DefaultConstructorMarker;)V
   #34 = Integer            100000
   #35 = Integer            50000
   #36 = Utf8               java/lang/Runtime
   #37 = Class              #36           // java/lang/Runtime
   #38 = Utf8               getRuntime
   #39 = Utf8               ()Ljava/lang/Runtime;
   #40 = NameAndType        #38:#39       // getRuntime:()Ljava/lang/Runtime;
   #41 = Methodref          #37.#40       // java/lang/Runtime.getRuntime:()Ljava/lang/Runtime;
   #42 = Utf8               availableProcessors
   #43 = Utf8               ()I
   #44 = NameAndType        #42:#43       // availableProcessors:()I
   #45 = Methodref          #37.#44       // java/lang/Runtime.availableProcessors:()I
   #46 = Double             5.0d
   #48 = NameAndType        #5:#6         // "<init>":(ZIIIID)V
   #49 = Methodref          #2.#48        // ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpConfig."<init>":(ZIIIID)V
   #50 = Utf8               getMemoryPrefetchEnabled
   #51 = Utf8               ()Z
   #52 = Utf8               getJitIterations
   #53 = Utf8               getBranchTrainingIterations
   #54 = Utf8               getValidationIterations
   #55 = Utf8               getParallelWorkers
   #56 = Utf8               getTargetLatencyP99Micros
   #57 = Utf8               ()D
   #58 = Utf8               component1
   #59 = Utf8               component2
   #60 = Utf8               component3
   #61 = Utf8               component4
   #62 = Utf8               component5
   #63 = Utf8               component6
   #64 = Utf8               copy
   #65 = Utf8               (ZIIIID)Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpConfig;
   #66 = Utf8               Lorg/jetbrains/annotations/NotNull;
   #67 = Utf8               copy$default
   #68 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpConfig;ZIIIIDILjava/lang/Object;)Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpConfig;
   #69 = NameAndType        #64:#65       // copy:(ZIIIID)Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpConfig;
   #70 = Methodref          #2.#69        // ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpConfig.copy:(ZIIIID)Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpConfig;
   #71 = Utf8               toString
   #72 = Utf8               ()Ljava/lang/String;
   #73 = Utf8               WarmUpConfig(memoryPrefetchEnabled=\u0001, jitIterations=\u0001, branchTrainingIterations=\u0001, validationIterations=\u0001, parallelWorkers=\u0001, targetLatencyP99Micros=\u0001)
   #74 = String             #73           // WarmUpConfig(memoryPrefetchEnabled=\u0001, jitIterations=\u0001, branchTrainingIterations=\u0001, validationIterations=\u0001, parallelWorkers=\u0001, targetLatencyP99Micros=\u0001)
   #75 = Utf8               java/lang/invoke/StringConcatFactory
   #76 = Class              #75           // java/lang/invoke/StringConcatFactory
   #77 = Utf8               makeConcatWithConstants
   #78 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #79 = NameAndType        #77:#78       // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #80 = Methodref          #76.#79       // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #81 = MethodHandle       6:#80         // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #82 = Utf8               (ZIIIID)Ljava/lang/String;
   #83 = NameAndType        #77:#82       // makeConcatWithConstants:(ZIIIID)Ljava/lang/String;
   #84 = InvokeDynamic      #0:#83        // #0:makeConcatWithConstants:(ZIIIID)Ljava/lang/String;
   #85 = Utf8               hashCode
   #86 = Utf8               java/lang/Boolean
   #87 = Class              #86           // java/lang/Boolean
   #88 = Utf8               (Z)I
   #89 = NameAndType        #85:#88       // hashCode:(Z)I
   #90 = Methodref          #87.#89       // java/lang/Boolean.hashCode:(Z)I
   #91 = Utf8               java/lang/Integer
   #92 = Class              #91           // java/lang/Integer
   #93 = Utf8               (I)I
   #94 = NameAndType        #85:#93       // hashCode:(I)I
   #95 = Methodref          #92.#94       // java/lang/Integer.hashCode:(I)I
   #96 = Utf8               java/lang/Double
   #97 = Class              #96           // java/lang/Double
   #98 = Utf8               (D)I
   #99 = NameAndType        #85:#98       // hashCode:(D)I
  #100 = Methodref          #97.#99       // java/lang/Double.hashCode:(D)I
  #101 = Utf8               result
  #102 = Utf8               equals
  #103 = Utf8               (Ljava/lang/Object;)Z
  #104 = Utf8               Lorg/jetbrains/annotations/Nullable;
  #105 = Utf8               compare
  #106 = Utf8               (DD)I
  #107 = NameAndType        #105:#106     // compare:(DD)I
  #108 = Methodref          #97.#107      // java/lang/Double.compare:(DD)I
  #109 = Utf8               other
  #110 = Utf8               Ljava/lang/Object;
  #111 = NameAndType        #5:#33        // "<init>":(ZIIIIDILkotlin/jvm/internal/DefaultConstructorMarker;)V
  #112 = Methodref          #2.#111       // ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpConfig."<init>":(ZIIIIDILkotlin/jvm/internal/DefaultConstructorMarker;)V
  #113 = Utf8               access$getDEFAULT$cp
  #114 = Utf8               ()Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpConfig;
  #115 = Utf8               DEFAULT
  #116 = NameAndType        #115:#32      // DEFAULT:Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpConfig;
  #117 = Fieldref           #2.#116       // ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpConfig.DEFAULT:Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpConfig;
  #118 = Utf8               <clinit>
  #119 = Utf8               ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpConfig$Companion
  #120 = Class              #119          // ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpConfig$Companion
  #121 = Utf8               (Lkotlin/jvm/internal/DefaultConstructorMarker;)V
  #122 = NameAndType        #5:#121       // "<init>":(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
  #123 = Methodref          #120.#122     // ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpConfig$Companion."<init>":(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
  #124 = Utf8               Companion
  #125 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpConfig$Companion;
  #126 = NameAndType        #124:#125     // Companion:Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpConfig$Companion;
  #127 = Fieldref           #2.#126       // ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpConfig.Companion:Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpConfig$Companion;
  #128 = Utf8               Lkotlin/Metadata;
  #129 = Utf8               mv
  #130 = Integer            2
  #131 = Integer            3
  #132 = Integer            0
  #133 = Utf8               k
  #134 = Integer            1
  #135 = Utf8               xi
  #136 = Integer            48
  #137 = Utf8               d1
  #138 = Utf8               \u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0016\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \"2\u00020\u0001:\u0001\"BC\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\nHÆ\u0003JE\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0014\u0010\u001d\u001a\u00020\u00032\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001f\u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010 \u001a\u00020!HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006#
  #139 = Utf8               d2
  #140 = Utf8
  #141 = Utf8               Brproject
  #142 = Utf8               ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService
  #143 = Class              #142          // ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService
  #144 = Utf8               WarmUpConfig
  #145 = Utf8               L2BRWarmUpService.kt
  #146 = Utf8               RuntimeInvisibleAnnotations
  #147 = Utf8               Code
  #148 = Utf8               LineNumberTable
  #149 = Utf8               LocalVariableTable
  #150 = Utf8               StackMapTable
  #151 = Utf8               RuntimeInvisibleParameterAnnotations
  #152 = Utf8               InnerClasses
  #153 = Utf8               SourceFile
  #154 = Utf8               RuntimeVisibleAnnotations
  #155 = Utf8               BootstrapMethods
{
  public static final ext.mods.gameserver.geoengine.pathfinding.warmup.L2BRWarmUpService$WarmUpConfig$Companion Companion;
    descriptor: Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpConfig$Companion;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    RuntimeInvisibleAnnotations:
      0: #66()
        org.jetbrains.annotations.NotNull

  public ext.mods.gameserver.geoengine.pathfinding.warmup.L2BRWarmUpService$WarmUpConfig(boolean, int, int, int, int, double);
    descriptor: (ZIIIID)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=8, args_size=7
         0: aload_0
         1: invokespecial #9                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: iload_1
         6: putfield      #13                 // Field memoryPrefetchEnabled:Z
         9: aload_0
        10: iload_2
        11: putfield      #17                 // Field jitIterations:I
        14: aload_0
        15: iload_3
        16: putfield      #20                 // Field branchTrainingIterations:I
        19: aload_0
        20: iload         4
        22: putfield      #23                 // Field validationIterations:I
        25: aload_0
        26: iload         5
        28: putfield      #26                 // Field parallelWorkers:I
        31: aload_0
        32: dload         6
        34: putfield      #30                 // Field targetLatencyP99Micros:D
        37: return
      LineNumberTable:
        line 40: 0
        line 41: 4
        line 42: 9
        line 43: 14
        line 44: 19
        line 45: 25
        line 46: 31
        line 40: 37
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      38     0  this   Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpConfig;
            0      38     1 memoryPrefetchEnabled   Z
            0      38     2 jitIterations   I
            0      38     3 branchTrainingIterations   I
            0      38     4 validationIterations   I
            0      38     5 parallelWorkers   I
            0      38     6 targetLatencyP99Micros   D

  public ext.mods.gameserver.geoengine.pathfinding.warmup.L2BRWarmUpService$WarmUpConfig(boolean, int, int, int, int, double, int, kotlin.jvm.internal.DefaultConstructorMarker);
    descriptor: (ZIIIIDILkotlin/jvm/internal/DefaultConstructorMarker;)V
    flags: (0x1001) ACC_PUBLIC, ACC_SYNTHETIC
    Code:
      stack=8, locals=10, args_size=9
         0: iload         8
         2: iconst_1
         3: iand
         4: ifeq          9
         7: iconst_1
         8: istore_1
         9: iload         8
        11: iconst_2
        12: iand
        13: ifeq          19
        16: ldc           #34                 // int 100000
        18: istore_2
        19: iload         8
        21: iconst_4
        22: iand
        23: ifeq          29
        26: ldc           #35                 // int 50000
        28: istore_3
        29: iload         8
        31: bipush        8
        33: iand
        34: ifeq          42
        37: sipush        10000
        40: istore        4
        42: iload         8
        44: bipush        16
        46: iand
        47: ifeq          58
        50: invokestatic  #41                 // Method java/lang/Runtime.getRuntime:()Ljava/lang/Runtime;
        53: invokevirtual #45                 // Method java/lang/Runtime.availableProcessors:()I
        56: istore        5
        58: iload         8
        60: bipush        32
        62: iand
        63: ifeq          71
        66: ldc2_w        #46                 // double 5.0d
        69: dstore        6
        71: aload_0
        72: iload_1
        73: iload_2
        74: iload_3
        75: iload         4
        77: iload         5
        79: dload         6
        81: invokespecial #49                 // Method "<init>":(ZIIIID)V
        84: return
      StackMapTable: number_of_entries = 6
        frame_type = 9 /* same */
        frame_type = 9 /* same */
        frame_type = 9 /* same */
        frame_type = 12 /* same */
        frame_type = 15 /* same */
        frame_type = 12 /* same */
      LineNumberTable:
        line 40: 0
        line 41: 7
        line 40: 9
        line 42: 16
        line 40: 19
        line 43: 26
        line 40: 29
        line 44: 37
        line 40: 42
        line 45: 50
        line 40: 58
        line 46: 66
        line 40: 71
        line 47: 84

  public final boolean getMemoryPrefetchEnabled();
    descriptor: ()Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field memoryPrefetchEnabled:Z
         4: ireturn
      LineNumberTable:
        line 41: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpConfig;

  public final int getJitIterations();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #17                 // Field jitIterations:I
         4: ireturn
      LineNumberTable:
        line 42: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpConfig;

  public final int getBranchTrainingIterations();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #20                 // Field branchTrainingIterations:I
         4: ireturn
      LineNumberTable:
        line 43: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpConfig;

  public final int getValidationIterations();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #23                 // Field validationIterations:I
         4: ireturn
      LineNumberTable:
        line 44: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpConfig;

  public final int getParallelWorkers();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #26                 // Field parallelWorkers:I
         4: ireturn
      LineNumberTable:
        line 45: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpConfig;

  public final double getTargetLatencyP99Micros();
    descriptor: ()D
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #30                 // Field targetLatencyP99Micros:D
         4: dreturn
      LineNumberTable:
        line 46: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpConfig;

  public final boolean component1();
    descriptor: ()Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field memoryPrefetchEnabled:Z
         4: ireturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpConfig;

  public final int component2();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #17                 // Field jitIterations:I
         4: ireturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpConfig;

  public final int component3();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #20                 // Field branchTrainingIterations:I
         4: ireturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpConfig;

  public final int component4();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #23                 // Field validationIterations:I
         4: ireturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpConfig;

  public final int component5();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #26                 // Field parallelWorkers:I
         4: ireturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpConfig;

  public final double component6();
    descriptor: ()D
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #30                 // Field targetLatencyP99Micros:D
         4: dreturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpConfig;

  public final ext.mods.gameserver.geoengine.pathfinding.warmup.L2BRWarmUpService$WarmUpConfig copy(boolean, int, int, int, int, double);
    descriptor: (ZIIIID)Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpConfig;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=9, locals=8, args_size=7
         0: new           #2                  // class ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpConfig
         3: dup
         4: iload_1
         5: iload_2
         6: iload_3
         7: iload         4
         9: iload         5
        11: dload         6
        13: invokespecial #49                 // Method "<init>":(ZIIIID)V
        16: areturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      17     0  this   Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpConfig;
            0      17     1 memoryPrefetchEnabled   Z
            0      17     2 jitIterations   I
            0      17     3 branchTrainingIterations   I
            0      17     4 validationIterations   I
            0      17     5 parallelWorkers   I
            0      17     6 targetLatencyP99Micros   D
    RuntimeInvisibleAnnotations:
      0: #66()
        org.jetbrains.annotations.NotNull

  public static ext.mods.gameserver.geoengine.pathfinding.warmup.L2BRWarmUpService$WarmUpConfig copy$default(ext.mods.gameserver.geoengine.pathfinding.warmup.L2BRWarmUpService$WarmUpConfig, boolean, int, int, int, int, double, int, java.lang.Object);
    descriptor: (Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpConfig;ZIIIIDILjava/lang/Object;)Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpConfig;
    flags: (0x1009) ACC_PUBLIC, ACC_STATIC, ACC_SYNTHETIC
    Code:
      stack=8, locals=10, args_size=9
         0: iload         8
         2: iconst_1
         3: iand
         4: ifeq          12
         7: aload_0
         8: getfield      #13                 // Field memoryPrefetchEnabled:Z
        11: istore_1
        12: iload         8
        14: iconst_2
        15: iand
        16: ifeq          24
        19: aload_0
        20: getfield      #17                 // Field jitIterations:I
        23: istore_2
        24: iload         8
        26: iconst_4
        27: iand
        28: ifeq          36
        31: aload_0
        32: getfield      #20                 // Field branchTrainingIterations:I
        35: istore_3
        36: iload         8
        38: bipush        8
        40: iand
        41: ifeq          50
        44: aload_0
        45: getfield      #23                 // Field validationIterations:I
        48: istore        4
        50: iload         8
        52: bipush        16
        54: iand
        55: ifeq          64
        58: aload_0
        59: getfield      #26                 // Field parallelWorkers:I
        62: istore        5
        64: iload         8
        66: bipush        32
        68: iand
        69: ifeq          78
        72: aload_0
        73: getfield      #30                 // Field targetLatencyP99Micros:D
        76: dstore        6
        78: aload_0
        79: iload_1
        80: iload_2
        81: iload_3
        82: iload         4
        84: iload         5
        86: dload         6
        88: invokevirtual #70                 // Method copy:(ZIIIID)Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpConfig;
        91: areturn
      StackMapTable: number_of_entries = 6
        frame_type = 12 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 13 /* same */
        frame_type = 13 /* same */
        frame_type = 13 /* same */

  public java.lang.String toString();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=7, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field memoryPrefetchEnabled:Z
         4: aload_0
         5: getfield      #17                 // Field jitIterations:I
         8: aload_0
         9: getfield      #20                 // Field branchTrainingIterations:I
        12: aload_0
        13: getfield      #23                 // Field validationIterations:I
        16: aload_0
        17: getfield      #26                 // Field parallelWorkers:I
        20: aload_0
        21: getfield      #30                 // Field targetLatencyP99Micros:D
        24: invokedynamic #84,  0             // InvokeDynamic #0:makeConcatWithConstants:(ZIIIID)Ljava/lang/String;
        29: areturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      30     0  this   Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpConfig;
    RuntimeInvisibleAnnotations:
      0: #66()
        org.jetbrains.annotations.NotNull

  public int hashCode();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=1
         0: aload_0
         1: getfield      #13                 // Field memoryPrefetchEnabled:Z
         4: invokestatic  #90                 // Method java/lang/Boolean.hashCode:(Z)I
         7: istore_1
         8: iload_1
         9: bipush        31
        11: imul
        12: aload_0
        13: getfield      #17                 // Field jitIterations:I
        16: invokestatic  #95                 // Method java/lang/Integer.hashCode:(I)I
        19: iadd
        20: istore_1
        21: iload_1
        22: bipush        31
        24: imul
        25: aload_0
        26: getfield      #20                 // Field branchTrainingIterations:I
        29: invokestatic  #95                 // Method java/lang/Integer.hashCode:(I)I
        32: iadd
        33: istore_1
        34: iload_1
        35: bipush        31
        37: imul
        38: aload_0
        39: getfield      #23                 // Field validationIterations:I
        42: invokestatic  #95                 // Method java/lang/Integer.hashCode:(I)I
        45: iadd
        46: istore_1
        47: iload_1
        48: bipush        31
        50: imul
        51: aload_0
        52: getfield      #26                 // Field parallelWorkers:I
        55: invokestatic  #95                 // Method java/lang/Integer.hashCode:(I)I
        58: iadd
        59: istore_1
        60: iload_1
        61: bipush        31
        63: imul
        64: aload_0
        65: getfield      #30                 // Field targetLatencyP99Micros:D
        68: invokestatic  #100                // Method java/lang/Double.hashCode:(D)I
        71: iadd
        72: istore_1
        73: iload_1
        74: ireturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            8      67     1 result   I
            0      75     0  this   Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpConfig;

  public boolean equals(java.lang.Object);
    descriptor: (Ljava/lang/Object;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=3, args_size=2
         0: aload_0
         1: aload_1
         2: if_acmpne     7
         5: iconst_1
         6: ireturn
         7: aload_1
         8: instanceof    #2                  // class ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpConfig
        11: ifne          16
        14: iconst_0
        15: ireturn
        16: aload_1
        17: checkcast     #2                  // class ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpConfig
        20: astore_2
        21: aload_0
        22: getfield      #13                 // Field memoryPrefetchEnabled:Z
        25: aload_2
        26: getfield      #13                 // Field memoryPrefetchEnabled:Z
        29: if_icmpeq     34
        32: iconst_0
        33: ireturn
        34: aload_0
        35: getfield      #17                 // Field jitIterations:I
        38: aload_2
        39: getfield      #17                 // Field jitIterations:I
        42: if_icmpeq     47
        45: iconst_0
        46: ireturn
        47: aload_0
        48: getfield      #20                 // Field branchTrainingIterations:I
        51: aload_2
        52: getfield      #20                 // Field branchTrainingIterations:I
        55: if_icmpeq     60
        58: iconst_0
        59: ireturn
        60: aload_0
        61: getfield      #23                 // Field validationIterations:I
        64: aload_2
        65: getfield      #23                 // Field validationIterations:I
        68: if_icmpeq     73
        71: iconst_0
        72: ireturn
        73: aload_0
        74: getfield      #26                 // Field parallelWorkers:I
        77: aload_2
        78: getfield      #26                 // Field parallelWorkers:I
        81: if_icmpeq     86
        84: iconst_0
        85: ireturn
        86: aload_0
        87: getfield      #30                 // Field targetLatencyP99Micros:D
        90: aload_2
        91: getfield      #30                 // Field targetLatencyP99Micros:D
        94: invokestatic  #108                // Method java/lang/Double.compare:(DD)I
        97: ifeq          102
       100: iconst_0
       101: ireturn
       102: iconst_1
       103: ireturn
      StackMapTable: number_of_entries = 8
        frame_type = 7 /* same */
        frame_type = 8 /* same */
        frame_type = 252 /* append */
          offset_delta = 17
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpConfig ]
        frame_type = 12 /* same */
        frame_type = 12 /* same */
        frame_type = 12 /* same */
        frame_type = 12 /* same */
        frame_type = 15 /* same */
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     104     0  this   Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpConfig;
            0     104     1 other   Ljava/lang/Object;
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #104()
          org.jetbrains.annotations.Nullable

  public ext.mods.gameserver.geoengine.pathfinding.warmup.L2BRWarmUpService$WarmUpConfig();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=10, locals=1, args_size=1
         0: aload_0
         1: iconst_0
         2: iconst_0
         3: iconst_0
         4: iconst_0
         5: iconst_0
         6: dconst_0
         7: bipush        63
         9: aconst_null
        10: invokespecial #112                // Method "<init>":(ZIIIIDILkotlin/jvm/internal/DefaultConstructorMarker;)V
        13: return
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0  this   Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpConfig;

  public static final ext.mods.gameserver.geoengine.pathfinding.warmup.L2BRWarmUpService$WarmUpConfig access$getDEFAULT$cp();
    descriptor: ()Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpConfig;
    flags: (0x1019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_SYNTHETIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #117                // Field DEFAULT:Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpConfig;
         3: areturn
      LineNumberTable:
        line 40: 0

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=11, locals=0, args_size=0
         0: new           #120                // class ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpConfig$Companion
         3: dup
         4: aconst_null
         5: invokespecial #123                // Method ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpConfig$Companion."<init>":(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
         8: putstatic     #127                // Field Companion:Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpConfig$Companion;
        11: new           #2                  // class ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpConfig
        14: dup
        15: iconst_0
        16: iconst_0
        17: iconst_0
        18: iconst_0
        19: iconst_0
        20: dconst_0
        21: bipush        63
        23: aconst_null
        24: invokespecial #112                // Method "<init>":(ZIIIIDILkotlin/jvm/internal/DefaultConstructorMarker;)V
        27: putstatic     #117                // Field DEFAULT:Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpConfig;
        30: return
      LineNumberTable:
        line 49: 11
}
InnerClasses:
  public static final #144= #2 of #143;   // WarmUpConfig=class ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpConfig of class ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService
  public static final #124= #120 of #2;   // Companion=class ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpConfig$Companion of class ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpConfig
SourceFile: "L2BRWarmUpService.kt"
RuntimeVisibleAnnotations:
  0: #128(#129=[I#130,I#131,I#132],#133=I#134,#135=I#136,#137=[s#138],#139=[s#32,s#140,s#10,s#140,s#14,s#140,s#18,s#21,s#24,s#27,s#140,s#5,s#6,s#50,s#51,s#52,s#43,s#53,s#54,s#55,s#56,s#57,s#58,s#59,s#60,s#61,s#62,s#63,s#64,s#102,s#109,s#85,s#71,s#140,s#124,s#141])
    kotlin.Metadata(
      mv=[2,3,0]
      k=1
      xi=48
      d1=["\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0016\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \"2\u00020\u0001:\u0001\"BC\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\nHÆ\u0003JE\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0014\u0010\u001d\u001a\u00020\u00032\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001f\u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010 \u001a\u00020!HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006#"]
      d2=["Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpConfig;","","memoryPrefetchEnabled","","jitIterations","","branchTrainingIterations","validationIterations","parallelWorkers","targetLatencyP99Micros","","<init>","(ZIIIID)V","getMemoryPrefetchEnabled","()Z","getJitIterations","()I","getBranchTrainingIterations","getValidationIterations","getParallelWorkers","getTargetLatencyP99Micros","()D","component1","component2","component3","component4","component5","component6","copy","equals","other","hashCode","toString","","Companion","Brproject"]
    )
BootstrapMethods:
  0: #81 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #74 WarmUpConfig(memoryPrefetchEnabled=\u0001, jitIterations=\u0001, branchTrainingIterations=\u0001, validationIterations=\u0001, parallelWorkers=\u0001, targetLatencyP99Micros=\u0001)
