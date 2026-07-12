// Bytecode for: ext.mods.gameserver.geoengine.pathfinding.warmup.L2BRWarmUpService$WarmUpResult
// File: ext\mods\gameserver\geoengine\pathfinding\warmup\L2BRWarmUpService$WarmUpResult.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpResult.class
  Last modified 9 de jul de 2026; size 5004 bytes
  MD5 checksum 757da6e1e8b03e858067340284664b12
  Compiled from "L2BRWarmUpService.kt"
public final class ext.mods.gameserver.geoengine.pathfinding.warmup.L2BRWarmUpService$WarmUpResult
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #2                          // ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpResult
  super_class: #4                         // java/lang/Object
  interfaces: 0, fields: 8, methods: 22, attributes: 4
Constant pool:
    #1 = Utf8               ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpResult
    #2 = Class              #1            // ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpResult
    #3 = Utf8               java/lang/Object
    #4 = Class              #3            // java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               (JJJJDDDZ)V
    #7 = Utf8               ()V
    #8 = NameAndType        #5:#7         // "<init>":()V
    #9 = Methodref          #4.#8         // java/lang/Object."<init>":()V
   #10 = Utf8               totalTimeMs
   #11 = Utf8               J
   #12 = NameAndType        #10:#11       // totalTimeMs:J
   #13 = Fieldref           #2.#12        // ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpResult.totalTimeMs:J
   #14 = Utf8               memoryPhaseMs
   #15 = NameAndType        #14:#11       // memoryPhaseMs:J
   #16 = Fieldref           #2.#15        // ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpResult.memoryPhaseMs:J
   #17 = Utf8               jitPhaseMs
   #18 = NameAndType        #17:#11       // jitPhaseMs:J
   #19 = Fieldref           #2.#18        // ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpResult.jitPhaseMs:J
   #20 = Utf8               validationPhaseMs
   #21 = NameAndType        #20:#11       // validationPhaseMs:J
   #22 = Fieldref           #2.#21        // ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpResult.validationPhaseMs:J
   #23 = Utf8               finalLatencyP50
   #24 = Utf8               D
   #25 = NameAndType        #23:#24       // finalLatencyP50:D
   #26 = Fieldref           #2.#25        // ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpResult.finalLatencyP50:D
   #27 = Utf8               finalLatencyP99
   #28 = NameAndType        #27:#24       // finalLatencyP99:D
   #29 = Fieldref           #2.#28        // ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpResult.finalLatencyP99:D
   #30 = Utf8               finalLatencyP999
   #31 = NameAndType        #30:#24       // finalLatencyP999:D
   #32 = Fieldref           #2.#31        // ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpResult.finalLatencyP999:D
   #33 = Utf8               success
   #34 = Utf8               Z
   #35 = NameAndType        #33:#34       // success:Z
   #36 = Fieldref           #2.#35        // ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpResult.success:Z
   #37 = Utf8               this
   #38 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpResult;
   #39 = Utf8               getTotalTimeMs
   #40 = Utf8               ()J
   #41 = Utf8               getMemoryPhaseMs
   #42 = Utf8               getJitPhaseMs
   #43 = Utf8               getValidationPhaseMs
   #44 = Utf8               getFinalLatencyP50
   #45 = Utf8               ()D
   #46 = Utf8               getFinalLatencyP99
   #47 = Utf8               getFinalLatencyP999
   #48 = Utf8               getSuccess
   #49 = Utf8               ()Z
   #50 = Utf8               component1
   #51 = Utf8               component2
   #52 = Utf8               component3
   #53 = Utf8               component4
   #54 = Utf8               component5
   #55 = Utf8               component6
   #56 = Utf8               component7
   #57 = Utf8               component8
   #58 = Utf8               copy
   #59 = Utf8               (JJJJDDDZ)Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpResult;
   #60 = Utf8               Lorg/jetbrains/annotations/NotNull;
   #61 = NameAndType        #5:#6         // "<init>":(JJJJDDDZ)V
   #62 = Methodref          #2.#61        // ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpResult."<init>":(JJJJDDDZ)V
   #63 = Utf8               copy$default
   #64 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpResult;JJJJDDDZILjava/lang/Object;)Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpResult;
   #65 = NameAndType        #58:#59       // copy:(JJJJDDDZ)Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpResult;
   #66 = Methodref          #2.#65        // ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpResult.copy:(JJJJDDDZ)Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpResult;
   #67 = Utf8               toString
   #68 = Utf8               ()Ljava/lang/String;
   #69 = Utf8               WarmUpResult(totalTimeMs=\u0001, memoryPhaseMs=\u0001, jitPhaseMs=\u0001, validationPhaseMs=\u0001, finalLatencyP50=\u0001, finalLatencyP99=\u0001, finalLatencyP999=\u0001, success=\u0001)
   #70 = String             #69           // WarmUpResult(totalTimeMs=\u0001, memoryPhaseMs=\u0001, jitPhaseMs=\u0001, validationPhaseMs=\u0001, finalLatencyP50=\u0001, finalLatencyP99=\u0001, finalLatencyP999=\u0001, success=\u0001)
   #71 = Utf8               java/lang/invoke/StringConcatFactory
   #72 = Class              #71           // java/lang/invoke/StringConcatFactory
   #73 = Utf8               makeConcatWithConstants
   #74 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #75 = NameAndType        #73:#74       // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #76 = Methodref          #72.#75       // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #77 = MethodHandle       6:#76         // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #78 = Utf8               (JJJJDDDZ)Ljava/lang/String;
   #79 = NameAndType        #73:#78       // makeConcatWithConstants:(JJJJDDDZ)Ljava/lang/String;
   #80 = InvokeDynamic      #0:#79        // #0:makeConcatWithConstants:(JJJJDDDZ)Ljava/lang/String;
   #81 = Utf8               hashCode
   #82 = Utf8               ()I
   #83 = Utf8               java/lang/Long
   #84 = Class              #83           // java/lang/Long
   #85 = Utf8               (J)I
   #86 = NameAndType        #81:#85       // hashCode:(J)I
   #87 = Methodref          #84.#86       // java/lang/Long.hashCode:(J)I
   #88 = Utf8               java/lang/Double
   #89 = Class              #88           // java/lang/Double
   #90 = Utf8               (D)I
   #91 = NameAndType        #81:#90       // hashCode:(D)I
   #92 = Methodref          #89.#91       // java/lang/Double.hashCode:(D)I
   #93 = Utf8               java/lang/Boolean
   #94 = Class              #93           // java/lang/Boolean
   #95 = Utf8               (Z)I
   #96 = NameAndType        #81:#95       // hashCode:(Z)I
   #97 = Methodref          #94.#96       // java/lang/Boolean.hashCode:(Z)I
   #98 = Utf8               result
   #99 = Utf8               I
  #100 = Utf8               equals
  #101 = Utf8               (Ljava/lang/Object;)Z
  #102 = Utf8               Lorg/jetbrains/annotations/Nullable;
  #103 = Utf8               compare
  #104 = Utf8               (DD)I
  #105 = NameAndType        #103:#104     // compare:(DD)I
  #106 = Methodref          #89.#105      // java/lang/Double.compare:(DD)I
  #107 = Utf8               other
  #108 = Utf8               Ljava/lang/Object;
  #109 = Utf8               Lkotlin/Metadata;
  #110 = Utf8               mv
  #111 = Integer            2
  #112 = Integer            3
  #113 = Integer            0
  #114 = Utf8               k
  #115 = Integer            1
  #116 = Utf8               xi
  #117 = Integer            48
  #118 = Utf8               d1
  #119 = Utf8               \u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\bHÆ\u0003J\t\u0010\u001f\u001a\u00020\bHÆ\u0003J\t\u0010 \u001a\u00020\bHÆ\u0003J\t\u0010!\u001a\u00020\fHÆ\u0003JY\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0014\u0010#\u001a\u00020\f2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010%\u001a\u00020&HÖ\u0081\u0004J\n\u0010\'\u001a\u00020(HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006)
  #120 = Utf8               d2
  #121 = Utf8
  #122 = Utf8               Brproject
  #123 = Utf8               ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService
  #124 = Class              #123          // ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService
  #125 = Utf8               WarmUpResult
  #126 = Utf8               L2BRWarmUpService.kt
  #127 = Utf8               Code
  #128 = Utf8               LineNumberTable
  #129 = Utf8               LocalVariableTable
  #130 = Utf8               RuntimeInvisibleAnnotations
  #131 = Utf8               StackMapTable
  #132 = Utf8               RuntimeInvisibleParameterAnnotations
  #133 = Utf8               InnerClasses
  #134 = Utf8               SourceFile
  #135 = Utf8               RuntimeVisibleAnnotations
  #136 = Utf8               BootstrapMethods
{
  public ext.mods.gameserver.geoengine.pathfinding.warmup.L2BRWarmUpService$WarmUpResult(long, long, long, long, double, double, double, boolean);
    descriptor: (JJJJDDDZ)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=16, args_size=9
         0: aload_0
         1: invokespecial #9                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: lload_1
         6: putfield      #13                 // Field totalTimeMs:J
         9: aload_0
        10: lload_3
        11: putfield      #16                 // Field memoryPhaseMs:J
        14: aload_0
        15: lload         5
        17: putfield      #19                 // Field jitPhaseMs:J
        20: aload_0
        21: lload         7
        23: putfield      #22                 // Field validationPhaseMs:J
        26: aload_0
        27: dload         9
        29: putfield      #26                 // Field finalLatencyP50:D
        32: aload_0
        33: dload         11
        35: putfield      #29                 // Field finalLatencyP99:D
        38: aload_0
        39: dload         13
        41: putfield      #32                 // Field finalLatencyP999:D
        44: aload_0
        45: iload         15
        47: putfield      #36                 // Field success:Z
        50: return
      LineNumberTable:
        line 53: 0
        line 54: 4
        line 55: 9
        line 56: 14
        line 57: 20
        line 58: 26
        line 59: 32
        line 60: 38
        line 61: 44
        line 53: 50
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      51     0  this   Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpResult;
            0      51     1 totalTimeMs   J
            0      51     3 memoryPhaseMs   J
            0      51     5 jitPhaseMs   J
            0      51     7 validationPhaseMs   J
            0      51     9 finalLatencyP50   D
            0      51    11 finalLatencyP99   D
            0      51    13 finalLatencyP999   D
            0      51    15 success   Z

  public final long getTotalTimeMs();
    descriptor: ()J
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field totalTimeMs:J
         4: lreturn
      LineNumberTable:
        line 54: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpResult;

  public final long getMemoryPhaseMs();
    descriptor: ()J
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #16                 // Field memoryPhaseMs:J
         4: lreturn
      LineNumberTable:
        line 55: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpResult;

  public final long getJitPhaseMs();
    descriptor: ()J
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #19                 // Field jitPhaseMs:J
         4: lreturn
      LineNumberTable:
        line 56: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpResult;

  public final long getValidationPhaseMs();
    descriptor: ()J
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #22                 // Field validationPhaseMs:J
         4: lreturn
      LineNumberTable:
        line 57: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpResult;

  public final double getFinalLatencyP50();
    descriptor: ()D
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #26                 // Field finalLatencyP50:D
         4: dreturn
      LineNumberTable:
        line 58: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpResult;

  public final double getFinalLatencyP99();
    descriptor: ()D
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #29                 // Field finalLatencyP99:D
         4: dreturn
      LineNumberTable:
        line 59: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpResult;

  public final double getFinalLatencyP999();
    descriptor: ()D
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #32                 // Field finalLatencyP999:D
         4: dreturn
      LineNumberTable:
        line 60: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpResult;

  public final boolean getSuccess();
    descriptor: ()Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #36                 // Field success:Z
         4: ireturn
      LineNumberTable:
        line 61: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpResult;

  public final long component1();
    descriptor: ()J
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field totalTimeMs:J
         4: lreturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpResult;

  public final long component2();
    descriptor: ()J
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #16                 // Field memoryPhaseMs:J
         4: lreturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpResult;

  public final long component3();
    descriptor: ()J
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #19                 // Field jitPhaseMs:J
         4: lreturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpResult;

  public final long component4();
    descriptor: ()J
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #22                 // Field validationPhaseMs:J
         4: lreturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpResult;

  public final double component5();
    descriptor: ()D
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #26                 // Field finalLatencyP50:D
         4: dreturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpResult;

  public final double component6();
    descriptor: ()D
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #29                 // Field finalLatencyP99:D
         4: dreturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpResult;

  public final double component7();
    descriptor: ()D
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #32                 // Field finalLatencyP999:D
         4: dreturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpResult;

  public final boolean component8();
    descriptor: ()Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #36                 // Field success:Z
         4: ireturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpResult;

  public final ext.mods.gameserver.geoengine.pathfinding.warmup.L2BRWarmUpService$WarmUpResult copy(long, long, long, long, double, double, double, boolean);
    descriptor: (JJJJDDDZ)Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpResult;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=17, locals=16, args_size=9
         0: new           #2                  // class ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpResult
         3: dup
         4: lload_1
         5: lload_3
         6: lload         5
         8: lload         7
        10: dload         9
        12: dload         11
        14: dload         13
        16: iload         15
        18: invokespecial #62                 // Method "<init>":(JJJJDDDZ)V
        21: areturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      22     0  this   Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpResult;
            0      22     1 totalTimeMs   J
            0      22     3 memoryPhaseMs   J
            0      22     5 jitPhaseMs   J
            0      22     7 validationPhaseMs   J
            0      22     9 finalLatencyP50   D
            0      22    11 finalLatencyP99   D
            0      22    13 finalLatencyP999   D
            0      22    15 success   Z
    RuntimeInvisibleAnnotations:
      0: #60()
        org.jetbrains.annotations.NotNull

  public static ext.mods.gameserver.geoengine.pathfinding.warmup.L2BRWarmUpService$WarmUpResult copy$default(ext.mods.gameserver.geoengine.pathfinding.warmup.L2BRWarmUpService$WarmUpResult, long, long, long, long, double, double, double, boolean, int, java.lang.Object);
    descriptor: (Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpResult;JJJJDDDZILjava/lang/Object;)Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpResult;
    flags: (0x1009) ACC_PUBLIC, ACC_STATIC, ACC_SYNTHETIC
    Code:
      stack=16, locals=18, args_size=11
         0: iload         16
         2: iconst_1
         3: iand
         4: ifeq          12
         7: aload_0
         8: getfield      #13                 // Field totalTimeMs:J
        11: lstore_1
        12: iload         16
        14: iconst_2
        15: iand
        16: ifeq          24
        19: aload_0
        20: getfield      #16                 // Field memoryPhaseMs:J
        23: lstore_3
        24: iload         16
        26: iconst_4
        27: iand
        28: ifeq          37
        31: aload_0
        32: getfield      #19                 // Field jitPhaseMs:J
        35: lstore        5
        37: iload         16
        39: bipush        8
        41: iand
        42: ifeq          51
        45: aload_0
        46: getfield      #22                 // Field validationPhaseMs:J
        49: lstore        7
        51: iload         16
        53: bipush        16
        55: iand
        56: ifeq          65
        59: aload_0
        60: getfield      #26                 // Field finalLatencyP50:D
        63: dstore        9
        65: iload         16
        67: bipush        32
        69: iand
        70: ifeq          79
        73: aload_0
        74: getfield      #29                 // Field finalLatencyP99:D
        77: dstore        11
        79: iload         16
        81: bipush        64
        83: iand
        84: ifeq          93
        87: aload_0
        88: getfield      #32                 // Field finalLatencyP999:D
        91: dstore        13
        93: iload         16
        95: sipush        128
        98: iand
        99: ifeq          108
       102: aload_0
       103: getfield      #36                 // Field success:Z
       106: istore        15
       108: aload_0
       109: lload_1
       110: lload_3
       111: lload         5
       113: lload         7
       115: dload         9
       117: dload         11
       119: dload         13
       121: iload         15
       123: invokevirtual #66                 // Method copy:(JJJJDDDZ)Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpResult;
       126: areturn
      StackMapTable: number_of_entries = 8
        frame_type = 12 /* same */
        frame_type = 11 /* same */
        frame_type = 12 /* same */
        frame_type = 13 /* same */
        frame_type = 13 /* same */
        frame_type = 13 /* same */
        frame_type = 13 /* same */
        frame_type = 14 /* same */

  public java.lang.String toString();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=15, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field totalTimeMs:J
         4: aload_0
         5: getfield      #16                 // Field memoryPhaseMs:J
         8: aload_0
         9: getfield      #19                 // Field jitPhaseMs:J
        12: aload_0
        13: getfield      #22                 // Field validationPhaseMs:J
        16: aload_0
        17: getfield      #26                 // Field finalLatencyP50:D
        20: aload_0
        21: getfield      #29                 // Field finalLatencyP99:D
        24: aload_0
        25: getfield      #32                 // Field finalLatencyP999:D
        28: aload_0
        29: getfield      #36                 // Field success:Z
        32: invokedynamic #80,  0             // InvokeDynamic #0:makeConcatWithConstants:(JJJJDDDZ)Ljava/lang/String;
        37: areturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      38     0  this   Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpResult;
    RuntimeInvisibleAnnotations:
      0: #60()
        org.jetbrains.annotations.NotNull

  public int hashCode();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=1
         0: aload_0
         1: getfield      #13                 // Field totalTimeMs:J
         4: invokestatic  #87                 // Method java/lang/Long.hashCode:(J)I
         7: istore_1
         8: iload_1
         9: bipush        31
        11: imul
        12: aload_0
        13: getfield      #16                 // Field memoryPhaseMs:J
        16: invokestatic  #87                 // Method java/lang/Long.hashCode:(J)I
        19: iadd
        20: istore_1
        21: iload_1
        22: bipush        31
        24: imul
        25: aload_0
        26: getfield      #19                 // Field jitPhaseMs:J
        29: invokestatic  #87                 // Method java/lang/Long.hashCode:(J)I
        32: iadd
        33: istore_1
        34: iload_1
        35: bipush        31
        37: imul
        38: aload_0
        39: getfield      #22                 // Field validationPhaseMs:J
        42: invokestatic  #87                 // Method java/lang/Long.hashCode:(J)I
        45: iadd
        46: istore_1
        47: iload_1
        48: bipush        31
        50: imul
        51: aload_0
        52: getfield      #26                 // Field finalLatencyP50:D
        55: invokestatic  #92                 // Method java/lang/Double.hashCode:(D)I
        58: iadd
        59: istore_1
        60: iload_1
        61: bipush        31
        63: imul
        64: aload_0
        65: getfield      #29                 // Field finalLatencyP99:D
        68: invokestatic  #92                 // Method java/lang/Double.hashCode:(D)I
        71: iadd
        72: istore_1
        73: iload_1
        74: bipush        31
        76: imul
        77: aload_0
        78: getfield      #32                 // Field finalLatencyP999:D
        81: invokestatic  #92                 // Method java/lang/Double.hashCode:(D)I
        84: iadd
        85: istore_1
        86: iload_1
        87: bipush        31
        89: imul
        90: aload_0
        91: getfield      #36                 // Field success:Z
        94: invokestatic  #97                 // Method java/lang/Boolean.hashCode:(Z)I
        97: iadd
        98: istore_1
        99: iload_1
       100: ireturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            8      93     1 result   I
            0     101     0  this   Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpResult;

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
         8: instanceof    #2                  // class ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpResult
        11: ifne          16
        14: iconst_0
        15: ireturn
        16: aload_1
        17: checkcast     #2                  // class ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpResult
        20: astore_2
        21: aload_0
        22: getfield      #13                 // Field totalTimeMs:J
        25: aload_2
        26: getfield      #13                 // Field totalTimeMs:J
        29: lcmp
        30: ifeq          35
        33: iconst_0
        34: ireturn
        35: aload_0
        36: getfield      #16                 // Field memoryPhaseMs:J
        39: aload_2
        40: getfield      #16                 // Field memoryPhaseMs:J
        43: lcmp
        44: ifeq          49
        47: iconst_0
        48: ireturn
        49: aload_0
        50: getfield      #19                 // Field jitPhaseMs:J
        53: aload_2
        54: getfield      #19                 // Field jitPhaseMs:J
        57: lcmp
        58: ifeq          63
        61: iconst_0
        62: ireturn
        63: aload_0
        64: getfield      #22                 // Field validationPhaseMs:J
        67: aload_2
        68: getfield      #22                 // Field validationPhaseMs:J
        71: lcmp
        72: ifeq          77
        75: iconst_0
        76: ireturn
        77: aload_0
        78: getfield      #26                 // Field finalLatencyP50:D
        81: aload_2
        82: getfield      #26                 // Field finalLatencyP50:D
        85: invokestatic  #106                // Method java/lang/Double.compare:(DD)I
        88: ifeq          93
        91: iconst_0
        92: ireturn
        93: aload_0
        94: getfield      #29                 // Field finalLatencyP99:D
        97: aload_2
        98: getfield      #29                 // Field finalLatencyP99:D
       101: invokestatic  #106                // Method java/lang/Double.compare:(DD)I
       104: ifeq          109
       107: iconst_0
       108: ireturn
       109: aload_0
       110: getfield      #32                 // Field finalLatencyP999:D
       113: aload_2
       114: getfield      #32                 // Field finalLatencyP999:D
       117: invokestatic  #106                // Method java/lang/Double.compare:(DD)I
       120: ifeq          125
       123: iconst_0
       124: ireturn
       125: aload_0
       126: getfield      #36                 // Field success:Z
       129: aload_2
       130: getfield      #36                 // Field success:Z
       133: if_icmpeq     138
       136: iconst_0
       137: ireturn
       138: iconst_1
       139: ireturn
      StackMapTable: number_of_entries = 10
        frame_type = 7 /* same */
        frame_type = 8 /* same */
        frame_type = 252 /* append */
          offset_delta = 18
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpResult ]
        frame_type = 13 /* same */
        frame_type = 13 /* same */
        frame_type = 13 /* same */
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 12 /* same */
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     140     0  this   Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpResult;
            0     140     1 other   Ljava/lang/Object;
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #102()
          org.jetbrains.annotations.Nullable
}
InnerClasses:
  public static final #125= #2 of #124;   // WarmUpResult=class ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpResult of class ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService
SourceFile: "L2BRWarmUpService.kt"
RuntimeVisibleAnnotations:
  0: #109(#110=[I#111,I#112,I#113],#114=I#115,#116=I#117,#118=[s#119],#120=[s#38,s#121,s#10,s#121,s#14,s#17,s#20,s#23,s#121,s#27,s#30,s#33,s#121,s#5,s#6,s#39,s#40,s#41,s#42,s#43,s#44,s#45,s#46,s#47,s#48,s#49,s#50,s#51,s#52,s#53,s#54,s#55,s#56,s#57,s#58,s#100,s#107,s#81,s#121,s#67,s#121,s#122])
    kotlin.Metadata(
      mv=[2,3,0]
      k=1
      xi=48
      d1=["\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\bHÆ\u0003J\t\u0010\u001f\u001a\u00020\bHÆ\u0003J\t\u0010 \u001a\u00020\bHÆ\u0003J\t\u0010!\u001a\u00020\fHÆ\u0003JY\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0014\u0010#\u001a\u00020\f2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010%\u001a\u00020&HÖ\u0081\u0004J\n\u0010\'\u001a\u00020(HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006)"]
      d2=["Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpResult;","","totalTimeMs","","memoryPhaseMs","jitPhaseMs","validationPhaseMs","finalLatencyP50","","finalLatencyP99","finalLatencyP999","success","","<init>","(JJJJDDDZ)V","getTotalTimeMs","()J","getMemoryPhaseMs","getJitPhaseMs","getValidationPhaseMs","getFinalLatencyP50","()D","getFinalLatencyP99","getFinalLatencyP999","getSuccess","()Z","component1","component2","component3","component4","component5","component6","component7","component8","copy","equals","other","hashCode","","toString","","Brproject"]
    )
BootstrapMethods:
  0: #77 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #70 WarmUpResult(totalTimeMs=\u0001, memoryPhaseMs=\u0001, jitPhaseMs=\u0001, validationPhaseMs=\u0001, finalLatencyP50=\u0001, finalLatencyP99=\u0001, finalLatencyP999=\u0001, success=\u0001)
