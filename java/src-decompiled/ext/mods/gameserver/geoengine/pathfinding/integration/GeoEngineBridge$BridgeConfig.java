// Bytecode for: ext.mods.gameserver.geoengine.pathfinding.integration.GeoEngineBridge$BridgeConfig
// File: ext\mods\gameserver\geoengine\pathfinding\integration\GeoEngineBridge$BridgeConfig.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$BridgeConfig.class
  Last modified 9 de jul de 2026; size 4599 bytes
  MD5 checksum 269c8b19e397b7a462e0b53ecaab62de
  Compiled from "GeoEngineBridge.kt"
public final class ext.mods.gameserver.geoengine.pathfinding.integration.GeoEngineBridge$BridgeConfig
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #2                          // ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$BridgeConfig
  super_class: #4                         // java/lang/Object
  interfaces: 0, fields: 6, methods: 20, attributes: 4
Constant pool:
    #1 = Utf8               ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$BridgeConfig
    #2 = Class              #1            // ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$BridgeConfig
    #3 = Utf8               java/lang/Object
    #4 = Class              #3            // java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               (ZZZZZJ)V
    #7 = Utf8               ()V
    #8 = NameAndType        #5:#7         // "<init>":()V
    #9 = Methodref          #4.#8         // java/lang/Object."<init>":()V
   #10 = Utf8               globalEnabled
   #11 = Utf8               Z
   #12 = NameAndType        #10:#11       // globalEnabled:Z
   #13 = Fieldref           #2.#12        // ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$BridgeConfig.globalEnabled:Z
   #14 = Utf8               fallbackToLegacy
   #15 = NameAndType        #14:#11       // fallbackToLegacy:Z
   #16 = Fieldref           #2.#15        // ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$BridgeConfig.fallbackToLegacy:Z
   #17 = Utf8               metricsEnabled
   #18 = NameAndType        #17:#11       // metricsEnabled:Z
   #19 = Fieldref           #2.#18        // ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$BridgeConfig.metricsEnabled:Z
   #20 = Utf8               autoReload
   #21 = NameAndType        #20:#11       // autoReload:Z
   #22 = Fieldref           #2.#21        // ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$BridgeConfig.autoReload:Z
   #23 = Utf8               warmupOnLoad
   #24 = NameAndType        #23:#11       // warmupOnLoad:Z
   #25 = Fieldref           #2.#24        // ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$BridgeConfig.warmupOnLoad:Z
   #26 = Utf8               maxPathfindingTimeMicros
   #27 = Utf8               J
   #28 = NameAndType        #26:#27       // maxPathfindingTimeMicros:J
   #29 = Fieldref           #2.#28        // ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$BridgeConfig.maxPathfindingTimeMicros:J
   #30 = Utf8               this
   #31 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$BridgeConfig;
   #32 = Utf8               (ZZZZZJILkotlin/jvm/internal/DefaultConstructorMarker;)V
   #33 = Long               100l
   #35 = NameAndType        #5:#6         // "<init>":(ZZZZZJ)V
   #36 = Methodref          #2.#35        // ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$BridgeConfig."<init>":(ZZZZZJ)V
   #37 = Utf8               getGlobalEnabled
   #38 = Utf8               ()Z
   #39 = Utf8               getFallbackToLegacy
   #40 = Utf8               getMetricsEnabled
   #41 = Utf8               getAutoReload
   #42 = Utf8               getWarmupOnLoad
   #43 = Utf8               getMaxPathfindingTimeMicros
   #44 = Utf8               ()J
   #45 = Utf8               component1
   #46 = Utf8               component2
   #47 = Utf8               component3
   #48 = Utf8               component4
   #49 = Utf8               component5
   #50 = Utf8               component6
   #51 = Utf8               copy
   #52 = Utf8               (ZZZZZJ)Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$BridgeConfig;
   #53 = Utf8               Lorg/jetbrains/annotations/NotNull;
   #54 = Utf8               copy$default
   #55 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$BridgeConfig;ZZZZZJILjava/lang/Object;)Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$BridgeConfig;
   #56 = NameAndType        #51:#52       // copy:(ZZZZZJ)Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$BridgeConfig;
   #57 = Methodref          #2.#56        // ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$BridgeConfig.copy:(ZZZZZJ)Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$BridgeConfig;
   #58 = Utf8               toString
   #59 = Utf8               ()Ljava/lang/String;
   #60 = Utf8               BridgeConfig(globalEnabled=\u0001, fallbackToLegacy=\u0001, metricsEnabled=\u0001, autoReload=\u0001, warmupOnLoad=\u0001, maxPathfindingTimeMicros=\u0001)
   #61 = String             #60           // BridgeConfig(globalEnabled=\u0001, fallbackToLegacy=\u0001, metricsEnabled=\u0001, autoReload=\u0001, warmupOnLoad=\u0001, maxPathfindingTimeMicros=\u0001)
   #62 = Utf8               java/lang/invoke/StringConcatFactory
   #63 = Class              #62           // java/lang/invoke/StringConcatFactory
   #64 = Utf8               makeConcatWithConstants
   #65 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #66 = NameAndType        #64:#65       // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #67 = Methodref          #63.#66       // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #68 = MethodHandle       6:#67         // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #69 = Utf8               (ZZZZZJ)Ljava/lang/String;
   #70 = NameAndType        #64:#69       // makeConcatWithConstants:(ZZZZZJ)Ljava/lang/String;
   #71 = InvokeDynamic      #0:#70        // #0:makeConcatWithConstants:(ZZZZZJ)Ljava/lang/String;
   #72 = Utf8               hashCode
   #73 = Utf8               ()I
   #74 = Utf8               java/lang/Boolean
   #75 = Class              #74           // java/lang/Boolean
   #76 = Utf8               (Z)I
   #77 = NameAndType        #72:#76       // hashCode:(Z)I
   #78 = Methodref          #75.#77       // java/lang/Boolean.hashCode:(Z)I
   #79 = Utf8               java/lang/Long
   #80 = Class              #79           // java/lang/Long
   #81 = Utf8               (J)I
   #82 = NameAndType        #72:#81       // hashCode:(J)I
   #83 = Methodref          #80.#82       // java/lang/Long.hashCode:(J)I
   #84 = Utf8               result
   #85 = Utf8               I
   #86 = Utf8               equals
   #87 = Utf8               (Ljava/lang/Object;)Z
   #88 = Utf8               Lorg/jetbrains/annotations/Nullable;
   #89 = Utf8               other
   #90 = Utf8               Ljava/lang/Object;
   #91 = NameAndType        #5:#32        // "<init>":(ZZZZZJILkotlin/jvm/internal/DefaultConstructorMarker;)V
   #92 = Methodref          #2.#91        // ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$BridgeConfig."<init>":(ZZZZZJILkotlin/jvm/internal/DefaultConstructorMarker;)V
   #93 = Utf8               Lkotlin/Metadata;
   #94 = Utf8               mv
   #95 = Integer            2
   #96 = Integer            3
   #97 = Integer            0
   #98 = Utf8               k
   #99 = Integer            1
  #100 = Utf8               xi
  #101 = Integer            48
  #102 = Utf8               d1
  #103 = Utf8               \u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\tHÆ\u0003JE\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0014\u0010\u001b\u001a\u00020\u00032\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001d\u001a\u00020\u001eHÖ\u0081\u0004J\n\u0010\u001f\u001a\u00020 HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006!
  #104 = Utf8               d2
  #105 = Utf8
  #106 = Utf8               Brproject
  #107 = Utf8               ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge
  #108 = Class              #107          // ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge
  #109 = Utf8               BridgeConfig
  #110 = Utf8               GeoEngineBridge.kt
  #111 = Utf8               Code
  #112 = Utf8               LineNumberTable
  #113 = Utf8               LocalVariableTable
  #114 = Utf8               StackMapTable
  #115 = Utf8               RuntimeInvisibleAnnotations
  #116 = Utf8               RuntimeInvisibleParameterAnnotations
  #117 = Utf8               InnerClasses
  #118 = Utf8               SourceFile
  #119 = Utf8               RuntimeVisibleAnnotations
  #120 = Utf8               BootstrapMethods
{
  public ext.mods.gameserver.geoengine.pathfinding.integration.GeoEngineBridge$BridgeConfig(boolean, boolean, boolean, boolean, boolean, long);
    descriptor: (ZZZZZJ)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=8, args_size=7
         0: aload_0
         1: invokespecial #9                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: iload_1
         6: putfield      #13                 // Field globalEnabled:Z
         9: aload_0
        10: iload_2
        11: putfield      #16                 // Field fallbackToLegacy:Z
        14: aload_0
        15: iload_3
        16: putfield      #19                 // Field metricsEnabled:Z
        19: aload_0
        20: iload         4
        22: putfield      #22                 // Field autoReload:Z
        25: aload_0
        26: iload         5
        28: putfield      #25                 // Field warmupOnLoad:Z
        31: aload_0
        32: lload         6
        34: putfield      #29                 // Field maxPathfindingTimeMicros:J
        37: return
      LineNumberTable:
        line 51: 0
        line 52: 4
        line 53: 9
        line 54: 14
        line 55: 19
        line 56: 25
        line 57: 31
        line 51: 37
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      38     0  this   Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$BridgeConfig;
            0      38     1 globalEnabled   Z
            0      38     2 fallbackToLegacy   Z
            0      38     3 metricsEnabled   Z
            0      38     4 autoReload   Z
            0      38     5 warmupOnLoad   Z
            0      38     6 maxPathfindingTimeMicros   J

  public ext.mods.gameserver.geoengine.pathfinding.integration.GeoEngineBridge$BridgeConfig(boolean, boolean, boolean, boolean, boolean, long, int, kotlin.jvm.internal.DefaultConstructorMarker);
    descriptor: (ZZZZZJILkotlin/jvm/internal/DefaultConstructorMarker;)V
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
        13: ifeq          18
        16: iconst_1
        17: istore_2
        18: iload         8
        20: iconst_4
        21: iand
        22: ifeq          27
        25: iconst_1
        26: istore_3
        27: iload         8
        29: bipush        8
        31: iand
        32: ifeq          38
        35: iconst_0
        36: istore        4
        38: iload         8
        40: bipush        16
        42: iand
        43: ifeq          49
        46: iconst_0
        47: istore        5
        49: iload         8
        51: bipush        32
        53: iand
        54: ifeq          62
        57: ldc2_w        #33                 // long 100l
        60: lstore        6
        62: aload_0
        63: iload_1
        64: iload_2
        65: iload_3
        66: iload         4
        68: iload         5
        70: lload         6
        72: invokespecial #36                 // Method "<init>":(ZZZZZJ)V
        75: return
      StackMapTable: number_of_entries = 6
        frame_type = 9 /* same */
        frame_type = 8 /* same */
        frame_type = 8 /* same */
        frame_type = 10 /* same */
        frame_type = 10 /* same */
        frame_type = 12 /* same */
      LineNumberTable:
        line 51: 0
        line 52: 7
        line 51: 9
        line 53: 16
        line 51: 18
        line 54: 25
        line 51: 27
        line 55: 35
        line 51: 38
        line 56: 46
        line 51: 49
        line 57: 57
        line 51: 62
        line 58: 75

  public final boolean getGlobalEnabled();
    descriptor: ()Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field globalEnabled:Z
         4: ireturn
      LineNumberTable:
        line 52: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$BridgeConfig;

  public final boolean getFallbackToLegacy();
    descriptor: ()Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #16                 // Field fallbackToLegacy:Z
         4: ireturn
      LineNumberTable:
        line 53: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$BridgeConfig;

  public final boolean getMetricsEnabled();
    descriptor: ()Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #19                 // Field metricsEnabled:Z
         4: ireturn
      LineNumberTable:
        line 54: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$BridgeConfig;

  public final boolean getAutoReload();
    descriptor: ()Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #22                 // Field autoReload:Z
         4: ireturn
      LineNumberTable:
        line 55: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$BridgeConfig;

  public final boolean getWarmupOnLoad();
    descriptor: ()Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #25                 // Field warmupOnLoad:Z
         4: ireturn
      LineNumberTable:
        line 56: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$BridgeConfig;

  public final long getMaxPathfindingTimeMicros();
    descriptor: ()J
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #29                 // Field maxPathfindingTimeMicros:J
         4: lreturn
      LineNumberTable:
        line 57: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$BridgeConfig;

  public final boolean component1();
    descriptor: ()Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field globalEnabled:Z
         4: ireturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$BridgeConfig;

  public final boolean component2();
    descriptor: ()Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #16                 // Field fallbackToLegacy:Z
         4: ireturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$BridgeConfig;

  public final boolean component3();
    descriptor: ()Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #19                 // Field metricsEnabled:Z
         4: ireturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$BridgeConfig;

  public final boolean component4();
    descriptor: ()Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #22                 // Field autoReload:Z
         4: ireturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$BridgeConfig;

  public final boolean component5();
    descriptor: ()Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #25                 // Field warmupOnLoad:Z
         4: ireturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$BridgeConfig;

  public final long component6();
    descriptor: ()J
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #29                 // Field maxPathfindingTimeMicros:J
         4: lreturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$BridgeConfig;

  public final ext.mods.gameserver.geoengine.pathfinding.integration.GeoEngineBridge$BridgeConfig copy(boolean, boolean, boolean, boolean, boolean, long);
    descriptor: (ZZZZZJ)Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$BridgeConfig;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=9, locals=8, args_size=7
         0: new           #2                  // class ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$BridgeConfig
         3: dup
         4: iload_1
         5: iload_2
         6: iload_3
         7: iload         4
         9: iload         5
        11: lload         6
        13: invokespecial #36                 // Method "<init>":(ZZZZZJ)V
        16: areturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      17     0  this   Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$BridgeConfig;
            0      17     1 globalEnabled   Z
            0      17     2 fallbackToLegacy   Z
            0      17     3 metricsEnabled   Z
            0      17     4 autoReload   Z
            0      17     5 warmupOnLoad   Z
            0      17     6 maxPathfindingTimeMicros   J
    RuntimeInvisibleAnnotations:
      0: #53()
        org.jetbrains.annotations.NotNull

  public static ext.mods.gameserver.geoengine.pathfinding.integration.GeoEngineBridge$BridgeConfig copy$default(ext.mods.gameserver.geoengine.pathfinding.integration.GeoEngineBridge$BridgeConfig, boolean, boolean, boolean, boolean, boolean, long, int, java.lang.Object);
    descriptor: (Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$BridgeConfig;ZZZZZJILjava/lang/Object;)Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$BridgeConfig;
    flags: (0x1009) ACC_PUBLIC, ACC_STATIC, ACC_SYNTHETIC
    Code:
      stack=8, locals=10, args_size=9
         0: iload         8
         2: iconst_1
         3: iand
         4: ifeq          12
         7: aload_0
         8: getfield      #13                 // Field globalEnabled:Z
        11: istore_1
        12: iload         8
        14: iconst_2
        15: iand
        16: ifeq          24
        19: aload_0
        20: getfield      #16                 // Field fallbackToLegacy:Z
        23: istore_2
        24: iload         8
        26: iconst_4
        27: iand
        28: ifeq          36
        31: aload_0
        32: getfield      #19                 // Field metricsEnabled:Z
        35: istore_3
        36: iload         8
        38: bipush        8
        40: iand
        41: ifeq          50
        44: aload_0
        45: getfield      #22                 // Field autoReload:Z
        48: istore        4
        50: iload         8
        52: bipush        16
        54: iand
        55: ifeq          64
        58: aload_0
        59: getfield      #25                 // Field warmupOnLoad:Z
        62: istore        5
        64: iload         8
        66: bipush        32
        68: iand
        69: ifeq          78
        72: aload_0
        73: getfield      #29                 // Field maxPathfindingTimeMicros:J
        76: lstore        6
        78: aload_0
        79: iload_1
        80: iload_2
        81: iload_3
        82: iload         4
        84: iload         5
        86: lload         6
        88: invokevirtual #57                 // Method copy:(ZZZZZJ)Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$BridgeConfig;
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
         1: getfield      #13                 // Field globalEnabled:Z
         4: aload_0
         5: getfield      #16                 // Field fallbackToLegacy:Z
         8: aload_0
         9: getfield      #19                 // Field metricsEnabled:Z
        12: aload_0
        13: getfield      #22                 // Field autoReload:Z
        16: aload_0
        17: getfield      #25                 // Field warmupOnLoad:Z
        20: aload_0
        21: getfield      #29                 // Field maxPathfindingTimeMicros:J
        24: invokedynamic #71,  0             // InvokeDynamic #0:makeConcatWithConstants:(ZZZZZJ)Ljava/lang/String;
        29: areturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      30     0  this   Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$BridgeConfig;
    RuntimeInvisibleAnnotations:
      0: #53()
        org.jetbrains.annotations.NotNull

  public int hashCode();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=1
         0: aload_0
         1: getfield      #13                 // Field globalEnabled:Z
         4: invokestatic  #78                 // Method java/lang/Boolean.hashCode:(Z)I
         7: istore_1
         8: iload_1
         9: bipush        31
        11: imul
        12: aload_0
        13: getfield      #16                 // Field fallbackToLegacy:Z
        16: invokestatic  #78                 // Method java/lang/Boolean.hashCode:(Z)I
        19: iadd
        20: istore_1
        21: iload_1
        22: bipush        31
        24: imul
        25: aload_0
        26: getfield      #19                 // Field metricsEnabled:Z
        29: invokestatic  #78                 // Method java/lang/Boolean.hashCode:(Z)I
        32: iadd
        33: istore_1
        34: iload_1
        35: bipush        31
        37: imul
        38: aload_0
        39: getfield      #22                 // Field autoReload:Z
        42: invokestatic  #78                 // Method java/lang/Boolean.hashCode:(Z)I
        45: iadd
        46: istore_1
        47: iload_1
        48: bipush        31
        50: imul
        51: aload_0
        52: getfield      #25                 // Field warmupOnLoad:Z
        55: invokestatic  #78                 // Method java/lang/Boolean.hashCode:(Z)I
        58: iadd
        59: istore_1
        60: iload_1
        61: bipush        31
        63: imul
        64: aload_0
        65: getfield      #29                 // Field maxPathfindingTimeMicros:J
        68: invokestatic  #83                 // Method java/lang/Long.hashCode:(J)I
        71: iadd
        72: istore_1
        73: iload_1
        74: ireturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            8      67     1 result   I
            0      75     0  this   Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$BridgeConfig;

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
         8: instanceof    #2                  // class ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$BridgeConfig
        11: ifne          16
        14: iconst_0
        15: ireturn
        16: aload_1
        17: checkcast     #2                  // class ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$BridgeConfig
        20: astore_2
        21: aload_0
        22: getfield      #13                 // Field globalEnabled:Z
        25: aload_2
        26: getfield      #13                 // Field globalEnabled:Z
        29: if_icmpeq     34
        32: iconst_0
        33: ireturn
        34: aload_0
        35: getfield      #16                 // Field fallbackToLegacy:Z
        38: aload_2
        39: getfield      #16                 // Field fallbackToLegacy:Z
        42: if_icmpeq     47
        45: iconst_0
        46: ireturn
        47: aload_0
        48: getfield      #19                 // Field metricsEnabled:Z
        51: aload_2
        52: getfield      #19                 // Field metricsEnabled:Z
        55: if_icmpeq     60
        58: iconst_0
        59: ireturn
        60: aload_0
        61: getfield      #22                 // Field autoReload:Z
        64: aload_2
        65: getfield      #22                 // Field autoReload:Z
        68: if_icmpeq     73
        71: iconst_0
        72: ireturn
        73: aload_0
        74: getfield      #25                 // Field warmupOnLoad:Z
        77: aload_2
        78: getfield      #25                 // Field warmupOnLoad:Z
        81: if_icmpeq     86
        84: iconst_0
        85: ireturn
        86: aload_0
        87: getfield      #29                 // Field maxPathfindingTimeMicros:J
        90: aload_2
        91: getfield      #29                 // Field maxPathfindingTimeMicros:J
        94: lcmp
        95: ifeq          100
        98: iconst_0
        99: ireturn
       100: iconst_1
       101: ireturn
      StackMapTable: number_of_entries = 8
        frame_type = 7 /* same */
        frame_type = 8 /* same */
        frame_type = 252 /* append */
          offset_delta = 17
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$BridgeConfig ]
        frame_type = 12 /* same */
        frame_type = 12 /* same */
        frame_type = 12 /* same */
        frame_type = 12 /* same */
        frame_type = 13 /* same */
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     102     0  this   Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$BridgeConfig;
            0     102     1 other   Ljava/lang/Object;
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #88()
          org.jetbrains.annotations.Nullable

  public ext.mods.gameserver.geoengine.pathfinding.integration.GeoEngineBridge$BridgeConfig();
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
         6: lconst_0
         7: bipush        63
         9: aconst_null
        10: invokespecial #92                 // Method "<init>":(ZZZZZJILkotlin/jvm/internal/DefaultConstructorMarker;)V
        13: return
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0  this   Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$BridgeConfig;
}
InnerClasses:
  public static final #109= #2 of #108;   // BridgeConfig=class ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$BridgeConfig of class ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge
SourceFile: "GeoEngineBridge.kt"
RuntimeVisibleAnnotations:
  0: #93(#94=[I#95,I#96,I#97],#98=I#99,#100=I#101,#102=[s#103],#104=[s#31,s#105,s#10,s#105,s#14,s#17,s#20,s#23,s#26,s#105,s#5,s#6,s#37,s#38,s#39,s#40,s#41,s#42,s#43,s#44,s#45,s#46,s#47,s#48,s#49,s#50,s#51,s#86,s#89,s#72,s#105,s#58,s#105,s#106])
    kotlin.Metadata(
      mv=[2,3,0]
      k=1
      xi=48
      d1=["\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\tHÆ\u0003JE\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0014\u0010\u001b\u001a\u00020\u00032\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001d\u001a\u00020\u001eHÖ\u0081\u0004J\n\u0010\u001f\u001a\u00020 HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006!"]
      d2=["Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$BridgeConfig;","","globalEnabled","","fallbackToLegacy","metricsEnabled","autoReload","warmupOnLoad","maxPathfindingTimeMicros","","<init>","(ZZZZZJ)V","getGlobalEnabled","()Z","getFallbackToLegacy","getMetricsEnabled","getAutoReload","getWarmupOnLoad","getMaxPathfindingTimeMicros","()J","component1","component2","component3","component4","component5","component6","copy","equals","other","hashCode","","toString","","Brproject"]
    )
BootstrapMethods:
  0: #68 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #61 BridgeConfig(globalEnabled=\u0001, fallbackToLegacy=\u0001, metricsEnabled=\u0001, autoReload=\u0001, warmupOnLoad=\u0001, maxPathfindingTimeMicros=\u0001)
