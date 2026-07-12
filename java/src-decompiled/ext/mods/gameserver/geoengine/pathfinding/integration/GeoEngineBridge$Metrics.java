// Bytecode for: ext.mods.gameserver.geoengine.pathfinding.integration.GeoEngineBridge$Metrics
// File: ext\mods\gameserver\geoengine\pathfinding\integration\GeoEngineBridge$Metrics.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$Metrics.class
  Last modified 9 de jul de 2026; size 5593 bytes
  MD5 checksum 2f86195680736f0d6e608286c6a86caa
  Compiled from "GeoEngineBridge.kt"
public final class ext.mods.gameserver.geoengine.pathfinding.integration.GeoEngineBridge$Metrics
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #2                          // ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$Metrics
  super_class: #4                         // java/lang/Object
  interfaces: 0, fields: 5, methods: 18, attributes: 4
Constant pool:
    #1 = Utf8               ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$Metrics
    #2 = Class              #1            // ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$Metrics
    #3 = Utf8               java/lang/Object
    #4 = Class              #3            // java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               (Ljava/util/concurrent/atomic/AtomicLong;Ljava/util/concurrent/atomic/AtomicLong;Ljava/util/concurrent/atomic/AtomicLong;Ljava/util/concurrent/atomic/AtomicLong;Ljava/util/concurrent/atomic/AtomicLong;)V
    #7 = Utf8               Lorg/jetbrains/annotations/NotNull;
    #8 = Utf8               ()V
    #9 = NameAndType        #5:#8         // "<init>":()V
   #10 = Methodref          #4.#9         // java/lang/Object."<init>":()V
   #11 = Utf8               l2brCalls
   #12 = Utf8               Ljava/util/concurrent/atomic/AtomicLong;
   #13 = NameAndType        #11:#12       // l2brCalls:Ljava/util/concurrent/atomic/AtomicLong;
   #14 = Fieldref           #2.#13        // ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$Metrics.l2brCalls:Ljava/util/concurrent/atomic/AtomicLong;
   #15 = Utf8               legacyCalls
   #16 = NameAndType        #15:#12       // legacyCalls:Ljava/util/concurrent/atomic/AtomicLong;
   #17 = Fieldref           #2.#16        // ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$Metrics.legacyCalls:Ljava/util/concurrent/atomic/AtomicLong;
   #18 = Utf8               l2brTotalTimeNs
   #19 = NameAndType        #18:#12       // l2brTotalTimeNs:Ljava/util/concurrent/atomic/AtomicLong;
   #20 = Fieldref           #2.#19        // ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$Metrics.l2brTotalTimeNs:Ljava/util/concurrent/atomic/AtomicLong;
   #21 = Utf8               legacyTotalTimeNs
   #22 = NameAndType        #21:#12       // legacyTotalTimeNs:Ljava/util/concurrent/atomic/AtomicLong;
   #23 = Fieldref           #2.#22        // ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$Metrics.legacyTotalTimeNs:Ljava/util/concurrent/atomic/AtomicLong;
   #24 = Utf8               fallbackCalls
   #25 = NameAndType        #24:#12       // fallbackCalls:Ljava/util/concurrent/atomic/AtomicLong;
   #26 = Fieldref           #2.#25        // ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$Metrics.fallbackCalls:Ljava/util/concurrent/atomic/AtomicLong;
   #27 = Utf8               this
   #28 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$Metrics;
   #29 = Utf8               (Ljava/util/concurrent/atomic/AtomicLong;Ljava/util/concurrent/atomic/AtomicLong;Ljava/util/concurrent/atomic/AtomicLong;Ljava/util/concurrent/atomic/AtomicLong;Ljava/util/concurrent/atomic/AtomicLong;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
   #30 = Utf8               java/util/concurrent/atomic/AtomicLong
   #31 = Class              #30           // java/util/concurrent/atomic/AtomicLong
   #32 = Utf8               (J)V
   #33 = NameAndType        #5:#32        // "<init>":(J)V
   #34 = Methodref          #31.#33       // java/util/concurrent/atomic/AtomicLong."<init>":(J)V
   #35 = NameAndType        #5:#6         // "<init>":(Ljava/util/concurrent/atomic/AtomicLong;Ljava/util/concurrent/atomic/AtomicLong;Ljava/util/concurrent/atomic/AtomicLong;Ljava/util/concurrent/atomic/AtomicLong;Ljava/util/concurrent/atomic/AtomicLong;)V
   #36 = Methodref          #2.#35        // ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$Metrics."<init>":(Ljava/util/concurrent/atomic/AtomicLong;Ljava/util/concurrent/atomic/AtomicLong;Ljava/util/concurrent/atomic/AtomicLong;Ljava/util/concurrent/atomic/AtomicLong;Ljava/util/concurrent/atomic/AtomicLong;)V
   #37 = Utf8               getL2brCalls
   #38 = Utf8               ()Ljava/util/concurrent/atomic/AtomicLong;
   #39 = Utf8               getLegacyCalls
   #40 = Utf8               getL2brTotalTimeNs
   #41 = Utf8               getLegacyTotalTimeNs
   #42 = Utf8               getFallbackCalls
   #43 = Utf8               component1
   #44 = Utf8               component2
   #45 = Utf8               component3
   #46 = Utf8               component4
   #47 = Utf8               component5
   #48 = Utf8               copy
   #49 = Utf8               (Ljava/util/concurrent/atomic/AtomicLong;Ljava/util/concurrent/atomic/AtomicLong;Ljava/util/concurrent/atomic/AtomicLong;Ljava/util/concurrent/atomic/AtomicLong;Ljava/util/concurrent/atomic/AtomicLong;)Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$Metrics;
   #50 = Utf8               copy$default
   #51 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$Metrics;Ljava/util/concurrent/atomic/AtomicLong;Ljava/util/concurrent/atomic/AtomicLong;Ljava/util/concurrent/atomic/AtomicLong;Ljava/util/concurrent/atomic/AtomicLong;Ljava/util/concurrent/atomic/AtomicLong;ILjava/lang/Object;)Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$Metrics;
   #52 = NameAndType        #48:#49       // copy:(Ljava/util/concurrent/atomic/AtomicLong;Ljava/util/concurrent/atomic/AtomicLong;Ljava/util/concurrent/atomic/AtomicLong;Ljava/util/concurrent/atomic/AtomicLong;Ljava/util/concurrent/atomic/AtomicLong;)Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$Metrics;
   #53 = Methodref          #2.#52        // ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$Metrics.copy:(Ljava/util/concurrent/atomic/AtomicLong;Ljava/util/concurrent/atomic/AtomicLong;Ljava/util/concurrent/atomic/AtomicLong;Ljava/util/concurrent/atomic/AtomicLong;Ljava/util/concurrent/atomic/AtomicLong;)Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$Metrics;
   #54 = Utf8               toString
   #55 = Utf8               ()Ljava/lang/String;
   #56 = Utf8               Metrics(l2brCalls=\u0001, legacyCalls=\u0001, l2brTotalTimeNs=\u0001, legacyTotalTimeNs=\u0001, fallbackCalls=\u0001)
   #57 = String             #56           // Metrics(l2brCalls=\u0001, legacyCalls=\u0001, l2brTotalTimeNs=\u0001, legacyTotalTimeNs=\u0001, fallbackCalls=\u0001)
   #58 = Utf8               java/lang/invoke/StringConcatFactory
   #59 = Class              #58           // java/lang/invoke/StringConcatFactory
   #60 = Utf8               makeConcatWithConstants
   #61 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #62 = NameAndType        #60:#61       // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #63 = Methodref          #59.#62       // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #64 = MethodHandle       6:#63         // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #65 = Utf8               (Ljava/util/concurrent/atomic/AtomicLong;Ljava/util/concurrent/atomic/AtomicLong;Ljava/util/concurrent/atomic/AtomicLong;Ljava/util/concurrent/atomic/AtomicLong;Ljava/util/concurrent/atomic/AtomicLong;)Ljava/lang/String;
   #66 = NameAndType        #60:#65       // makeConcatWithConstants:(Ljava/util/concurrent/atomic/AtomicLong;Ljava/util/concurrent/atomic/AtomicLong;Ljava/util/concurrent/atomic/AtomicLong;Ljava/util/concurrent/atomic/AtomicLong;Ljava/util/concurrent/atomic/AtomicLong;)Ljava/lang/String;
   #67 = InvokeDynamic      #0:#66        // #0:makeConcatWithConstants:(Ljava/util/concurrent/atomic/AtomicLong;Ljava/util/concurrent/atomic/AtomicLong;Ljava/util/concurrent/atomic/AtomicLong;Ljava/util/concurrent/atomic/AtomicLong;Ljava/util/concurrent/atomic/AtomicLong;)Ljava/lang/String;
   #68 = Utf8               hashCode
   #69 = Utf8               ()I
   #70 = NameAndType        #68:#69       // hashCode:()I
   #71 = Methodref          #31.#70       // java/util/concurrent/atomic/AtomicLong.hashCode:()I
   #72 = Utf8               result
   #73 = Utf8               I
   #74 = Utf8               equals
   #75 = Utf8               (Ljava/lang/Object;)Z
   #76 = Utf8               Lorg/jetbrains/annotations/Nullable;
   #77 = Utf8               kotlin/jvm/internal/Intrinsics
   #78 = Class              #77           // kotlin/jvm/internal/Intrinsics
   #79 = Utf8               areEqual
   #80 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Z
   #81 = NameAndType        #79:#80       // areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
   #82 = Methodref          #78.#81       // kotlin/jvm/internal/Intrinsics.areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
   #83 = Utf8               other
   #84 = Utf8               Ljava/lang/Object;
   #85 = NameAndType        #5:#29        // "<init>":(Ljava/util/concurrent/atomic/AtomicLong;Ljava/util/concurrent/atomic/AtomicLong;Ljava/util/concurrent/atomic/AtomicLong;Ljava/util/concurrent/atomic/AtomicLong;Ljava/util/concurrent/atomic/AtomicLong;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
   #86 = Methodref          #2.#85        // ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$Metrics."<init>":(Ljava/util/concurrent/atomic/AtomicLong;Ljava/util/concurrent/atomic/AtomicLong;Ljava/util/concurrent/atomic/AtomicLong;Ljava/util/concurrent/atomic/AtomicLong;Ljava/util/concurrent/atomic/AtomicLong;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
   #87 = Utf8               Lkotlin/Metadata;
   #88 = Utf8               mv
   #89 = Integer            2
   #90 = Integer            3
   #91 = Integer            0
   #92 = Utf8               k
   #93 = Integer            1
   #94 = Utf8               xi
   #95 = Integer            48
   #96 = Utf8               d1
   #97 = Utf8               \u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J;\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0019\u001a\u00020\u001aHÖ\u0081\u0004J\n\u0010\u001b\u001a\u00020\u001cHÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001d
   #98 = Utf8               d2
   #99 = Utf8
  #100 = Utf8               Brproject
  #101 = Utf8               ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge
  #102 = Class              #101          // ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge
  #103 = Utf8               Metrics
  #104 = Utf8               GeoEngineBridge.kt
  #105 = Utf8               RuntimeInvisibleAnnotations
  #106 = Utf8               Code
  #107 = Utf8               LineNumberTable
  #108 = Utf8               LocalVariableTable
  #109 = Utf8               RuntimeInvisibleParameterAnnotations
  #110 = Utf8               StackMapTable
  #111 = Utf8               InnerClasses
  #112 = Utf8               SourceFile
  #113 = Utf8               RuntimeVisibleAnnotations
  #114 = Utf8               BootstrapMethods
{
  public ext.mods.gameserver.geoengine.pathfinding.integration.GeoEngineBridge$Metrics(java.util.concurrent.atomic.AtomicLong, java.util.concurrent.atomic.AtomicLong, java.util.concurrent.atomic.AtomicLong, java.util.concurrent.atomic.AtomicLong, java.util.concurrent.atomic.AtomicLong);
    descriptor: (Ljava/util/concurrent/atomic/AtomicLong;Ljava/util/concurrent/atomic/AtomicLong;Ljava/util/concurrent/atomic/AtomicLong;Ljava/util/concurrent/atomic/AtomicLong;Ljava/util/concurrent/atomic/AtomicLong;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=6, args_size=6
         0: aload_0
         1: invokespecial #10                 // Method java/lang/Object."<init>":()V
         4: aload_0
         5: aload_1
         6: putfield      #14                 // Field l2brCalls:Ljava/util/concurrent/atomic/AtomicLong;
         9: aload_0
        10: aload_2
        11: putfield      #17                 // Field legacyCalls:Ljava/util/concurrent/atomic/AtomicLong;
        14: aload_0
        15: aload_3
        16: putfield      #20                 // Field l2brTotalTimeNs:Ljava/util/concurrent/atomic/AtomicLong;
        19: aload_0
        20: aload         4
        22: putfield      #23                 // Field legacyTotalTimeNs:Ljava/util/concurrent/atomic/AtomicLong;
        25: aload_0
        26: aload         5
        28: putfield      #26                 // Field fallbackCalls:Ljava/util/concurrent/atomic/AtomicLong;
        31: return
      LineNumberTable:
        line 63: 0
        line 64: 4
        line 65: 9
        line 66: 14
        line 67: 19
        line 68: 25
        line 63: 31
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      32     0  this   Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$Metrics;
            0      32     1 l2brCalls   Ljava/util/concurrent/atomic/AtomicLong;
            0      32     2 legacyCalls   Ljava/util/concurrent/atomic/AtomicLong;
            0      32     3 l2brTotalTimeNs   Ljava/util/concurrent/atomic/AtomicLong;
            0      32     4 legacyTotalTimeNs   Ljava/util/concurrent/atomic/AtomicLong;
            0      32     5 fallbackCalls   Ljava/util/concurrent/atomic/AtomicLong;
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #7()
          org.jetbrains.annotations.NotNull
      parameter 1:
        0: #7()
          org.jetbrains.annotations.NotNull
      parameter 2:
        0: #7()
          org.jetbrains.annotations.NotNull
      parameter 3:
        0: #7()
          org.jetbrains.annotations.NotNull
      parameter 4:
        0: #7()
          org.jetbrains.annotations.NotNull

  public ext.mods.gameserver.geoengine.pathfinding.integration.GeoEngineBridge$Metrics(java.util.concurrent.atomic.AtomicLong, java.util.concurrent.atomic.AtomicLong, java.util.concurrent.atomic.AtomicLong, java.util.concurrent.atomic.AtomicLong, java.util.concurrent.atomic.AtomicLong, int, kotlin.jvm.internal.DefaultConstructorMarker);
    descriptor: (Ljava/util/concurrent/atomic/AtomicLong;Ljava/util/concurrent/atomic/AtomicLong;Ljava/util/concurrent/atomic/AtomicLong;Ljava/util/concurrent/atomic/AtomicLong;Ljava/util/concurrent/atomic/AtomicLong;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    flags: (0x1001) ACC_PUBLIC, ACC_SYNTHETIC
    Code:
      stack=6, locals=8, args_size=8
         0: iload         6
         2: iconst_1
         3: iand
         4: ifeq          16
         7: new           #31                 // class java/util/concurrent/atomic/AtomicLong
        10: dup
        11: lconst_0
        12: invokespecial #34                 // Method java/util/concurrent/atomic/AtomicLong."<init>":(J)V
        15: astore_1
        16: iload         6
        18: iconst_2
        19: iand
        20: ifeq          32
        23: new           #31                 // class java/util/concurrent/atomic/AtomicLong
        26: dup
        27: lconst_0
        28: invokespecial #34                 // Method java/util/concurrent/atomic/AtomicLong."<init>":(J)V
        31: astore_2
        32: iload         6
        34: iconst_4
        35: iand
        36: ifeq          48
        39: new           #31                 // class java/util/concurrent/atomic/AtomicLong
        42: dup
        43: lconst_0
        44: invokespecial #34                 // Method java/util/concurrent/atomic/AtomicLong."<init>":(J)V
        47: astore_3
        48: iload         6
        50: bipush        8
        52: iand
        53: ifeq          66
        56: new           #31                 // class java/util/concurrent/atomic/AtomicLong
        59: dup
        60: lconst_0
        61: invokespecial #34                 // Method java/util/concurrent/atomic/AtomicLong."<init>":(J)V
        64: astore        4
        66: iload         6
        68: bipush        16
        70: iand
        71: ifeq          84
        74: new           #31                 // class java/util/concurrent/atomic/AtomicLong
        77: dup
        78: lconst_0
        79: invokespecial #34                 // Method java/util/concurrent/atomic/AtomicLong."<init>":(J)V
        82: astore        5
        84: aload_0
        85: aload_1
        86: aload_2
        87: aload_3
        88: aload         4
        90: aload         5
        92: invokespecial #36                 // Method "<init>":(Ljava/util/concurrent/atomic/AtomicLong;Ljava/util/concurrent/atomic/AtomicLong;Ljava/util/concurrent/atomic/AtomicLong;Ljava/util/concurrent/atomic/AtomicLong;Ljava/util/concurrent/atomic/AtomicLong;)V
        95: return
      StackMapTable: number_of_entries = 5
        frame_type = 16 /* same */
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 17 /* same */
        frame_type = 17 /* same */
      LineNumberTable:
        line 63: 0
        line 64: 7
        line 63: 16
        line 65: 23
        line 63: 32
        line 66: 39
        line 63: 48
        line 67: 56
        line 63: 66
        line 68: 74
        line 63: 84
        line 69: 95

  public final java.util.concurrent.atomic.AtomicLong getL2brCalls();
    descriptor: ()Ljava/util/concurrent/atomic/AtomicLong;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #14                 // Field l2brCalls:Ljava/util/concurrent/atomic/AtomicLong;
         4: areturn
      LineNumberTable:
        line 64: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$Metrics;
    RuntimeInvisibleAnnotations:
      0: #7()
        org.jetbrains.annotations.NotNull

  public final java.util.concurrent.atomic.AtomicLong getLegacyCalls();
    descriptor: ()Ljava/util/concurrent/atomic/AtomicLong;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #17                 // Field legacyCalls:Ljava/util/concurrent/atomic/AtomicLong;
         4: areturn
      LineNumberTable:
        line 65: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$Metrics;
    RuntimeInvisibleAnnotations:
      0: #7()
        org.jetbrains.annotations.NotNull

  public final java.util.concurrent.atomic.AtomicLong getL2brTotalTimeNs();
    descriptor: ()Ljava/util/concurrent/atomic/AtomicLong;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #20                 // Field l2brTotalTimeNs:Ljava/util/concurrent/atomic/AtomicLong;
         4: areturn
      LineNumberTable:
        line 66: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$Metrics;
    RuntimeInvisibleAnnotations:
      0: #7()
        org.jetbrains.annotations.NotNull

  public final java.util.concurrent.atomic.AtomicLong getLegacyTotalTimeNs();
    descriptor: ()Ljava/util/concurrent/atomic/AtomicLong;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #23                 // Field legacyTotalTimeNs:Ljava/util/concurrent/atomic/AtomicLong;
         4: areturn
      LineNumberTable:
        line 67: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$Metrics;
    RuntimeInvisibleAnnotations:
      0: #7()
        org.jetbrains.annotations.NotNull

  public final java.util.concurrent.atomic.AtomicLong getFallbackCalls();
    descriptor: ()Ljava/util/concurrent/atomic/AtomicLong;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #26                 // Field fallbackCalls:Ljava/util/concurrent/atomic/AtomicLong;
         4: areturn
      LineNumberTable:
        line 68: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$Metrics;
    RuntimeInvisibleAnnotations:
      0: #7()
        org.jetbrains.annotations.NotNull

  public final java.util.concurrent.atomic.AtomicLong component1();
    descriptor: ()Ljava/util/concurrent/atomic/AtomicLong;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #14                 // Field l2brCalls:Ljava/util/concurrent/atomic/AtomicLong;
         4: areturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$Metrics;
    RuntimeInvisibleAnnotations:
      0: #7()
        org.jetbrains.annotations.NotNull

  public final java.util.concurrent.atomic.AtomicLong component2();
    descriptor: ()Ljava/util/concurrent/atomic/AtomicLong;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #17                 // Field legacyCalls:Ljava/util/concurrent/atomic/AtomicLong;
         4: areturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$Metrics;
    RuntimeInvisibleAnnotations:
      0: #7()
        org.jetbrains.annotations.NotNull

  public final java.util.concurrent.atomic.AtomicLong component3();
    descriptor: ()Ljava/util/concurrent/atomic/AtomicLong;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #20                 // Field l2brTotalTimeNs:Ljava/util/concurrent/atomic/AtomicLong;
         4: areturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$Metrics;
    RuntimeInvisibleAnnotations:
      0: #7()
        org.jetbrains.annotations.NotNull

  public final java.util.concurrent.atomic.AtomicLong component4();
    descriptor: ()Ljava/util/concurrent/atomic/AtomicLong;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #23                 // Field legacyTotalTimeNs:Ljava/util/concurrent/atomic/AtomicLong;
         4: areturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$Metrics;
    RuntimeInvisibleAnnotations:
      0: #7()
        org.jetbrains.annotations.NotNull

  public final java.util.concurrent.atomic.AtomicLong component5();
    descriptor: ()Ljava/util/concurrent/atomic/AtomicLong;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #26                 // Field fallbackCalls:Ljava/util/concurrent/atomic/AtomicLong;
         4: areturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$Metrics;
    RuntimeInvisibleAnnotations:
      0: #7()
        org.jetbrains.annotations.NotNull

  public final ext.mods.gameserver.geoengine.pathfinding.integration.GeoEngineBridge$Metrics copy(java.util.concurrent.atomic.AtomicLong, java.util.concurrent.atomic.AtomicLong, java.util.concurrent.atomic.AtomicLong, java.util.concurrent.atomic.AtomicLong, java.util.concurrent.atomic.AtomicLong);
    descriptor: (Ljava/util/concurrent/atomic/AtomicLong;Ljava/util/concurrent/atomic/AtomicLong;Ljava/util/concurrent/atomic/AtomicLong;Ljava/util/concurrent/atomic/AtomicLong;Ljava/util/concurrent/atomic/AtomicLong;)Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$Metrics;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=7, locals=6, args_size=6
         0: new           #2                  // class ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$Metrics
         3: dup
         4: aload_1
         5: aload_2
         6: aload_3
         7: aload         4
         9: aload         5
        11: invokespecial #36                 // Method "<init>":(Ljava/util/concurrent/atomic/AtomicLong;Ljava/util/concurrent/atomic/AtomicLong;Ljava/util/concurrent/atomic/AtomicLong;Ljava/util/concurrent/atomic/AtomicLong;Ljava/util/concurrent/atomic/AtomicLong;)V
        14: areturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      15     0  this   Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$Metrics;
            0      15     1 l2brCalls   Ljava/util/concurrent/atomic/AtomicLong;
            0      15     2 legacyCalls   Ljava/util/concurrent/atomic/AtomicLong;
            0      15     3 l2brTotalTimeNs   Ljava/util/concurrent/atomic/AtomicLong;
            0      15     4 legacyTotalTimeNs   Ljava/util/concurrent/atomic/AtomicLong;
            0      15     5 fallbackCalls   Ljava/util/concurrent/atomic/AtomicLong;
    RuntimeInvisibleAnnotations:
      0: #7()
        org.jetbrains.annotations.NotNull
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #7()
          org.jetbrains.annotations.NotNull
      parameter 1:
        0: #7()
          org.jetbrains.annotations.NotNull
      parameter 2:
        0: #7()
          org.jetbrains.annotations.NotNull
      parameter 3:
        0: #7()
          org.jetbrains.annotations.NotNull
      parameter 4:
        0: #7()
          org.jetbrains.annotations.NotNull

  public static ext.mods.gameserver.geoengine.pathfinding.integration.GeoEngineBridge$Metrics copy$default(ext.mods.gameserver.geoengine.pathfinding.integration.GeoEngineBridge$Metrics, java.util.concurrent.atomic.AtomicLong, java.util.concurrent.atomic.AtomicLong, java.util.concurrent.atomic.AtomicLong, java.util.concurrent.atomic.AtomicLong, java.util.concurrent.atomic.AtomicLong, int, java.lang.Object);
    descriptor: (Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$Metrics;Ljava/util/concurrent/atomic/AtomicLong;Ljava/util/concurrent/atomic/AtomicLong;Ljava/util/concurrent/atomic/AtomicLong;Ljava/util/concurrent/atomic/AtomicLong;Ljava/util/concurrent/atomic/AtomicLong;ILjava/lang/Object;)Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$Metrics;
    flags: (0x1009) ACC_PUBLIC, ACC_STATIC, ACC_SYNTHETIC
    Code:
      stack=6, locals=8, args_size=8
         0: iload         6
         2: iconst_1
         3: iand
         4: ifeq          12
         7: aload_0
         8: getfield      #14                 // Field l2brCalls:Ljava/util/concurrent/atomic/AtomicLong;
        11: astore_1
        12: iload         6
        14: iconst_2
        15: iand
        16: ifeq          24
        19: aload_0
        20: getfield      #17                 // Field legacyCalls:Ljava/util/concurrent/atomic/AtomicLong;
        23: astore_2
        24: iload         6
        26: iconst_4
        27: iand
        28: ifeq          36
        31: aload_0
        32: getfield      #20                 // Field l2brTotalTimeNs:Ljava/util/concurrent/atomic/AtomicLong;
        35: astore_3
        36: iload         6
        38: bipush        8
        40: iand
        41: ifeq          50
        44: aload_0
        45: getfield      #23                 // Field legacyTotalTimeNs:Ljava/util/concurrent/atomic/AtomicLong;
        48: astore        4
        50: iload         6
        52: bipush        16
        54: iand
        55: ifeq          64
        58: aload_0
        59: getfield      #26                 // Field fallbackCalls:Ljava/util/concurrent/atomic/AtomicLong;
        62: astore        5
        64: aload_0
        65: aload_1
        66: aload_2
        67: aload_3
        68: aload         4
        70: aload         5
        72: invokevirtual #53                 // Method copy:(Ljava/util/concurrent/atomic/AtomicLong;Ljava/util/concurrent/atomic/AtomicLong;Ljava/util/concurrent/atomic/AtomicLong;Ljava/util/concurrent/atomic/AtomicLong;Ljava/util/concurrent/atomic/AtomicLong;)Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$Metrics;
        75: areturn
      StackMapTable: number_of_entries = 5
        frame_type = 12 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 13 /* same */
        frame_type = 13 /* same */

  public java.lang.String toString();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=1, args_size=1
         0: aload_0
         1: getfield      #14                 // Field l2brCalls:Ljava/util/concurrent/atomic/AtomicLong;
         4: aload_0
         5: getfield      #17                 // Field legacyCalls:Ljava/util/concurrent/atomic/AtomicLong;
         8: aload_0
         9: getfield      #20                 // Field l2brTotalTimeNs:Ljava/util/concurrent/atomic/AtomicLong;
        12: aload_0
        13: getfield      #23                 // Field legacyTotalTimeNs:Ljava/util/concurrent/atomic/AtomicLong;
        16: aload_0
        17: getfield      #26                 // Field fallbackCalls:Ljava/util/concurrent/atomic/AtomicLong;
        20: invokedynamic #67,  0             // InvokeDynamic #0:makeConcatWithConstants:(Ljava/util/concurrent/atomic/AtomicLong;Ljava/util/concurrent/atomic/AtomicLong;Ljava/util/concurrent/atomic/AtomicLong;Ljava/util/concurrent/atomic/AtomicLong;Ljava/util/concurrent/atomic/AtomicLong;)Ljava/lang/String;
        25: areturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      26     0  this   Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$Metrics;
    RuntimeInvisibleAnnotations:
      0: #7()
        org.jetbrains.annotations.NotNull

  public int hashCode();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=1
         0: aload_0
         1: getfield      #14                 // Field l2brCalls:Ljava/util/concurrent/atomic/AtomicLong;
         4: invokevirtual #71                 // Method java/util/concurrent/atomic/AtomicLong.hashCode:()I
         7: istore_1
         8: iload_1
         9: bipush        31
        11: imul
        12: aload_0
        13: getfield      #17                 // Field legacyCalls:Ljava/util/concurrent/atomic/AtomicLong;
        16: invokevirtual #71                 // Method java/util/concurrent/atomic/AtomicLong.hashCode:()I
        19: iadd
        20: istore_1
        21: iload_1
        22: bipush        31
        24: imul
        25: aload_0
        26: getfield      #20                 // Field l2brTotalTimeNs:Ljava/util/concurrent/atomic/AtomicLong;
        29: invokevirtual #71                 // Method java/util/concurrent/atomic/AtomicLong.hashCode:()I
        32: iadd
        33: istore_1
        34: iload_1
        35: bipush        31
        37: imul
        38: aload_0
        39: getfield      #23                 // Field legacyTotalTimeNs:Ljava/util/concurrent/atomic/AtomicLong;
        42: invokevirtual #71                 // Method java/util/concurrent/atomic/AtomicLong.hashCode:()I
        45: iadd
        46: istore_1
        47: iload_1
        48: bipush        31
        50: imul
        51: aload_0
        52: getfield      #26                 // Field fallbackCalls:Ljava/util/concurrent/atomic/AtomicLong;
        55: invokevirtual #71                 // Method java/util/concurrent/atomic/AtomicLong.hashCode:()I
        58: iadd
        59: istore_1
        60: iload_1
        61: ireturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            8      54     1 result   I
            0      62     0  this   Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$Metrics;

  public boolean equals(java.lang.Object);
    descriptor: (Ljava/lang/Object;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=3, args_size=2
         0: aload_0
         1: aload_1
         2: if_acmpne     7
         5: iconst_1
         6: ireturn
         7: aload_1
         8: instanceof    #2                  // class ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$Metrics
        11: ifne          16
        14: iconst_0
        15: ireturn
        16: aload_1
        17: checkcast     #2                  // class ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$Metrics
        20: astore_2
        21: aload_0
        22: getfield      #14                 // Field l2brCalls:Ljava/util/concurrent/atomic/AtomicLong;
        25: aload_2
        26: getfield      #14                 // Field l2brCalls:Ljava/util/concurrent/atomic/AtomicLong;
        29: invokestatic  #82                 // Method kotlin/jvm/internal/Intrinsics.areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
        32: ifne          37
        35: iconst_0
        36: ireturn
        37: aload_0
        38: getfield      #17                 // Field legacyCalls:Ljava/util/concurrent/atomic/AtomicLong;
        41: aload_2
        42: getfield      #17                 // Field legacyCalls:Ljava/util/concurrent/atomic/AtomicLong;
        45: invokestatic  #82                 // Method kotlin/jvm/internal/Intrinsics.areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
        48: ifne          53
        51: iconst_0
        52: ireturn
        53: aload_0
        54: getfield      #20                 // Field l2brTotalTimeNs:Ljava/util/concurrent/atomic/AtomicLong;
        57: aload_2
        58: getfield      #20                 // Field l2brTotalTimeNs:Ljava/util/concurrent/atomic/AtomicLong;
        61: invokestatic  #82                 // Method kotlin/jvm/internal/Intrinsics.areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
        64: ifne          69
        67: iconst_0
        68: ireturn
        69: aload_0
        70: getfield      #23                 // Field legacyTotalTimeNs:Ljava/util/concurrent/atomic/AtomicLong;
        73: aload_2
        74: getfield      #23                 // Field legacyTotalTimeNs:Ljava/util/concurrent/atomic/AtomicLong;
        77: invokestatic  #82                 // Method kotlin/jvm/internal/Intrinsics.areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
        80: ifne          85
        83: iconst_0
        84: ireturn
        85: aload_0
        86: getfield      #26                 // Field fallbackCalls:Ljava/util/concurrent/atomic/AtomicLong;
        89: aload_2
        90: getfield      #26                 // Field fallbackCalls:Ljava/util/concurrent/atomic/AtomicLong;
        93: invokestatic  #82                 // Method kotlin/jvm/internal/Intrinsics.areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
        96: ifne          101
        99: iconst_0
       100: ireturn
       101: iconst_1
       102: ireturn
      StackMapTable: number_of_entries = 7
        frame_type = 7 /* same */
        frame_type = 8 /* same */
        frame_type = 252 /* append */
          offset_delta = 20
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$Metrics ]
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 15 /* same */
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     103     0  this   Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$Metrics;
            0     103     1 other   Ljava/lang/Object;
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #76()
          org.jetbrains.annotations.Nullable

  public ext.mods.gameserver.geoengine.pathfinding.integration.GeoEngineBridge$Metrics();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=8, locals=1, args_size=1
         0: aload_0
         1: aconst_null
         2: aconst_null
         3: aconst_null
         4: aconst_null
         5: aconst_null
         6: bipush        31
         8: aconst_null
         9: invokespecial #86                 // Method "<init>":(Ljava/util/concurrent/atomic/AtomicLong;Ljava/util/concurrent/atomic/AtomicLong;Ljava/util/concurrent/atomic/AtomicLong;Ljava/util/concurrent/atomic/AtomicLong;Ljava/util/concurrent/atomic/AtomicLong;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
        12: return
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      13     0  this   Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$Metrics;
}
InnerClasses:
  public static final #103= #2 of #102;   // Metrics=class ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$Metrics of class ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge
SourceFile: "GeoEngineBridge.kt"
RuntimeVisibleAnnotations:
  0: #87(#88=[I#89,I#90,I#91],#92=I#93,#94=I#95,#96=[s#97],#98=[s#28,s#99,s#11,s#12,s#15,s#18,s#21,s#24,s#5,s#6,s#37,s#38,s#39,s#40,s#41,s#42,s#43,s#44,s#45,s#46,s#47,s#48,s#74,s#99,s#83,s#68,s#99,s#54,s#99,s#100])
    kotlin.Metadata(
      mv=[2,3,0]
      k=1
      xi=48
      d1=["\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J;\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0019\u001a\u00020\u001aHÖ\u0081\u0004J\n\u0010\u001b\u001a\u00020\u001cHÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001d"]
      d2=["Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$Metrics;","","l2brCalls","Ljava/util/concurrent/atomic/AtomicLong;","legacyCalls","l2brTotalTimeNs","legacyTotalTimeNs","fallbackCalls","<init>","(Ljava/util/concurrent/atomic/AtomicLong;Ljava/util/concurrent/atomic/AtomicLong;Ljava/util/concurrent/atomic/AtomicLong;Ljava/util/concurrent/atomic/AtomicLong;Ljava/util/concurrent/atomic/AtomicLong;)V","getL2brCalls","()Ljava/util/concurrent/atomic/AtomicLong;","getLegacyCalls","getL2brTotalTimeNs","getLegacyTotalTimeNs","getFallbackCalls","component1","component2","component3","component4","component5","copy","equals","","other","hashCode","","toString","","Brproject"]
    )
BootstrapMethods:
  0: #64 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #57 Metrics(l2brCalls=\u0001, legacyCalls=\u0001, l2brTotalTimeNs=\u0001, legacyTotalTimeNs=\u0001, fallbackCalls=\u0001)
