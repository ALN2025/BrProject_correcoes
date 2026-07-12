// Bytecode for: ext.mods.commons.pool.ScheduledFutureTask
// File: ext\mods\commons\pool\ScheduledFutureTask.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/commons/pool/ScheduledFutureTask.class
  Last modified 9 de jul de 2026; size 3088 bytes
  MD5 checksum e451300288b829d40c1144eb19673ea6
  Compiled from "ScheduledFutureTask.kt"
public final class ext.mods.commons.pool.ScheduledFutureTask extends java.lang.Object implements java.util.concurrent.ScheduledFuture<java.lang.Void>
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #2                          // ext/mods/commons/pool/ScheduledFutureTask
  super_class: #5                         // java/lang/Object
  interfaces: 1, fields: 2, methods: 14, attributes: 4
Constant pool:
   #1 = Utf8               ext/mods/commons/pool/ScheduledFutureTask
   #2 = Class              #1             // ext/mods/commons/pool/ScheduledFutureTask
   #3 = Utf8               Ljava/lang/Object;Ljava/util/concurrent/ScheduledFuture<Ljava/lang/Void;>;
   #4 = Utf8               java/lang/Object
   #5 = Class              #4             // java/lang/Object
   #6 = Utf8               java/util/concurrent/ScheduledFuture
   #7 = Class              #6             // java/util/concurrent/ScheduledFuture
   #8 = Utf8               <init>
   #9 = Utf8               ()V
  #10 = NameAndType        #8:#9          // "<init>":()V
  #11 = Methodref          #5.#10         // java/lang/Object."<init>":()V
  #12 = Utf8               this
  #13 = Utf8               Lext/mods/commons/pool/ScheduledFutureTask;
  #14 = Utf8               getDelay
  #15 = Utf8               (Ljava/util/concurrent/TimeUnit;)J
  #16 = Utf8               Lorg/jetbrains/annotations/NotNull;
  #17 = Utf8               unit
  #18 = Utf8               Ljava/util/concurrent/TimeUnit;
  #19 = Utf8               compareTo
  #20 = Utf8               (Ljava/util/concurrent/Delayed;)I
  #21 = Utf8               Lorg/jetbrains/annotations/Nullable;
  #22 = Utf8               other
  #23 = Utf8               Ljava/util/concurrent/Delayed;
  #24 = Utf8               cancel
  #25 = Utf8               (Z)Z
  #26 = Utf8               mayInterruptIfRunning
  #27 = Utf8               Z
  #28 = Utf8               isCancelled
  #29 = Utf8               ()Z
  #30 = Utf8               isDone
  #31 = Utf8               get
  #32 = Utf8               ()Ljava/lang/Void;
  #33 = Utf8               (JLjava/util/concurrent/TimeUnit;)Ljava/lang/Void;
  #34 = Utf8               timeout
  #35 = Utf8               J
  #36 = Utf8               cancelled
  #37 = Utf8               ()Ljava/util/concurrent/ScheduledFuture;
  #38 = Utf8               ()Ljava/util/concurrent/ScheduledFuture<*>;
  #39 = Utf8               Lkotlin/jvm/JvmStatic;
  #40 = Utf8               Companion
  #41 = Utf8               Lext/mods/commons/pool/ScheduledFutureTask$Companion;
  #42 = NameAndType        #40:#41        // Companion:Lext/mods/commons/pool/ScheduledFutureTask$Companion;
  #43 = Fieldref           #2.#42         // ext/mods/commons/pool/ScheduledFutureTask.Companion:Lext/mods/commons/pool/ScheduledFutureTask$Companion;
  #44 = Utf8               ext/mods/commons/pool/ScheduledFutureTask$Companion
  #45 = Class              #44            // ext/mods/commons/pool/ScheduledFutureTask$Companion
  #46 = NameAndType        #36:#37        // cancelled:()Ljava/util/concurrent/ScheduledFuture;
  #47 = Methodref          #45.#46        // ext/mods/commons/pool/ScheduledFutureTask$Companion.cancelled:()Ljava/util/concurrent/ScheduledFuture;
  #48 = Utf8               (Ljava/lang/Object;)I
  #49 = Utf8               java/util/concurrent/Delayed
  #50 = Class              #49            // java/util/concurrent/Delayed
  #51 = NameAndType        #19:#20        // compareTo:(Ljava/util/concurrent/Delayed;)I
  #52 = Methodref          #2.#51         // ext/mods/commons/pool/ScheduledFutureTask.compareTo:(Ljava/util/concurrent/Delayed;)I
  #53 = Utf8               Ljava/lang/Object;
  #54 = Utf8               ()Ljava/lang/Object;
  #55 = NameAndType        #31:#32        // get:()Ljava/lang/Void;
  #56 = Methodref          #2.#55         // ext/mods/commons/pool/ScheduledFutureTask.get:()Ljava/lang/Void;
  #57 = Utf8               (JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;
  #58 = NameAndType        #31:#33        // get:(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Void;
  #59 = Methodref          #2.#58         // ext/mods/commons/pool/ScheduledFutureTask.get:(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Void;
  #60 = Utf8               p0
  #61 = Utf8               p1
  #62 = Utf8               access$getCANCELLED$cp
  #63 = Utf8               ()Lext/mods/commons/pool/ScheduledFutureTask;
  #64 = Utf8               CANCELLED
  #65 = NameAndType        #64:#13        // CANCELLED:Lext/mods/commons/pool/ScheduledFutureTask;
  #66 = Fieldref           #2.#65         // ext/mods/commons/pool/ScheduledFutureTask.CANCELLED:Lext/mods/commons/pool/ScheduledFutureTask;
  #67 = Utf8               <clinit>
  #68 = Utf8               (Lkotlin/jvm/internal/DefaultConstructorMarker;)V
  #69 = NameAndType        #8:#68         // "<init>":(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
  #70 = Methodref          #45.#69        // ext/mods/commons/pool/ScheduledFutureTask$Companion."<init>":(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
  #71 = Methodref          #2.#10         // ext/mods/commons/pool/ScheduledFutureTask."<init>":()V
  #72 = Utf8               Lkotlin/Metadata;
  #73 = Utf8               mv
  #74 = Integer            2
  #75 = Integer            3
  #76 = Integer            0
  #77 = Utf8               k
  #78 = Integer            1
  #79 = Utf8               xi
  #80 = Integer            48
  #81 = Utf8               d1
  #82 = Utf8               \u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0014\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0096\u0082\u0004J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\b\u0010\u0010\u001a\u00020\u000eH\u0016J\b\u0010\u0011\u001a\u00020\u000eH\u0016J\n\u0010\u0012\u001a\u0004\u0018\u00010\u0002H\u0016J\u001b\u0010\u0012\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0096\u0002¨\u0006\u0015
  #83 = Utf8               d2
  #84 = Utf8               Ljava/util/concurrent/ScheduledFuture;
  #85 = Utf8               Ljava/lang/Void;
  #86 = Utf8
  #87 = Utf8               Brproject
  #88 = Utf8               ScheduledFutureTask.kt
  #89 = Utf8               RuntimeInvisibleAnnotations
  #90 = Utf8               Code
  #91 = Utf8               LineNumberTable
  #92 = Utf8               LocalVariableTable
  #93 = Utf8               RuntimeInvisibleParameterAnnotations
  #94 = Utf8               Signature
  #95 = Utf8               RuntimeVisibleAnnotations
  #96 = Utf8               InnerClasses
  #97 = Utf8               SourceFile
{
  public static final ext.mods.commons.pool.ScheduledFutureTask$Companion Companion;
    descriptor: Lext/mods/commons/pool/ScheduledFutureTask$Companion;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    RuntimeInvisibleAnnotations:
      0: #16()
        org.jetbrains.annotations.NotNull

  public long getDelay(java.util.concurrent.TimeUnit);
    descriptor: (Ljava/util/concurrent/TimeUnit;)J
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: lconst_0
         1: lreturn
      LineNumberTable:
        line 28: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/commons/pool/ScheduledFutureTask;
            0       2     1  unit   Ljava/util/concurrent/TimeUnit;
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #16()
          org.jetbrains.annotations.NotNull

  public int compareTo(java.util.concurrent.Delayed);
    descriptor: (Ljava/util/concurrent/Delayed;)I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=2, args_size=2
         0: iconst_0
         1: ireturn
      LineNumberTable:
        line 30: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/commons/pool/ScheduledFutureTask;
            0       2     1 other   Ljava/util/concurrent/Delayed;
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #21()
          org.jetbrains.annotations.Nullable

  public boolean cancel(boolean);
    descriptor: (Z)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=2, args_size=2
         0: iconst_1
         1: ireturn
      LineNumberTable:
        line 31: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/commons/pool/ScheduledFutureTask;
            0       2     1 mayInterruptIfRunning   Z

  public boolean isCancelled();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: iconst_1
         1: ireturn
      LineNumberTable:
        line 32: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/commons/pool/ScheduledFutureTask;

  public boolean isDone();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: iconst_1
         1: ireturn
      LineNumberTable:
        line 33: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/commons/pool/ScheduledFutureTask;

  public java.lang.Void get();
    descriptor: ()Ljava/lang/Void;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aconst_null
         1: areturn
      LineNumberTable:
        line 34: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/commons/pool/ScheduledFutureTask;
    RuntimeInvisibleAnnotations:
      0: #21()
        org.jetbrains.annotations.Nullable

  public java.lang.Void get(long, java.util.concurrent.TimeUnit);
    descriptor: (JLjava/util/concurrent/TimeUnit;)Ljava/lang/Void;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=4, args_size=3
         0: aconst_null
         1: areturn
      LineNumberTable:
        line 35: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/commons/pool/ScheduledFutureTask;
            0       2     1 timeout   J
            0       2     3  unit   Ljava/util/concurrent/TimeUnit;
    RuntimeInvisibleAnnotations:
      0: #21()
        org.jetbrains.annotations.Nullable
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
      parameter 1:
        0: #16()
          org.jetbrains.annotations.NotNull

  public static final java.util.concurrent.ScheduledFuture<?> cancelled();
    descriptor: ()Ljava/util/concurrent/ScheduledFuture;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #43                 // Field Companion:Lext/mods/commons/pool/ScheduledFutureTask$Companion;
         3: invokevirtual #47                 // Method ext/mods/commons/pool/ScheduledFutureTask$Companion.cancelled:()Ljava/util/concurrent/ScheduledFuture;
         6: areturn
      LineNumberTable:
        line 40: 6
    Signature: #38                          // ()Ljava/util/concurrent/ScheduledFuture<*>;
    RuntimeVisibleAnnotations:
      0: #39()
        kotlin.jvm.JvmStatic
    RuntimeInvisibleAnnotations:
      0: #16()
        org.jetbrains.annotations.NotNull

  public int compareTo(java.lang.Object);
    descriptor: (Ljava/lang/Object;)I
    flags: (0x1041) ACC_PUBLIC, ACC_BRIDGE, ACC_SYNTHETIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: checkcast     #50                 // class java/util/concurrent/Delayed
         5: invokevirtual #52                 // Method compareTo:(Ljava/util/concurrent/Delayed;)I
         8: ireturn
      LineNumberTable:
        line 26: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       9     0  this   Lext/mods/commons/pool/ScheduledFutureTask;
            0       9     1 other   Ljava/lang/Object;

  public java.lang.Object get();
    descriptor: ()Ljava/lang/Object;
    flags: (0x1041) ACC_PUBLIC, ACC_BRIDGE, ACC_SYNTHETIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #56                 // Method get:()Ljava/lang/Void;
         4: areturn
      LineNumberTable:
        line 26: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/commons/pool/ScheduledFutureTask;

  public java.lang.Object get(long, java.util.concurrent.TimeUnit);
    descriptor: (JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;
    flags: (0x1041) ACC_PUBLIC, ACC_BRIDGE, ACC_SYNTHETIC
    Code:
      stack=4, locals=4, args_size=3
         0: aload_0
         1: lload_1
         2: aload_3
         3: invokevirtual #59                 // Method get:(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Void;
         6: areturn
      LineNumberTable:
        line 26: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/commons/pool/ScheduledFutureTask;
            0       7     1    p0   J
            0       7     3    p1   Ljava/util/concurrent/TimeUnit;

  public static final ext.mods.commons.pool.ScheduledFutureTask access$getCANCELLED$cp();
    descriptor: ()Lext/mods/commons/pool/ScheduledFutureTask;
    flags: (0x1019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_SYNTHETIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #66                 // Field CANCELLED:Lext/mods/commons/pool/ScheduledFutureTask;
         3: areturn
      LineNumberTable:
        line 26: 0

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=3, locals=0, args_size=0
         0: new           #45                 // class ext/mods/commons/pool/ScheduledFutureTask$Companion
         3: dup
         4: aconst_null
         5: invokespecial #70                 // Method ext/mods/commons/pool/ScheduledFutureTask$Companion."<init>":(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
         8: putstatic     #43                 // Field Companion:Lext/mods/commons/pool/ScheduledFutureTask$Companion;
        11: new           #2                  // class ext/mods/commons/pool/ScheduledFutureTask
        14: dup
        15: invokespecial #71                 // Method "<init>":()V
        18: putstatic     #66                 // Field CANCELLED:Lext/mods/commons/pool/ScheduledFutureTask;
        21: return
      LineNumberTable:
        line 37: 11
}
InnerClasses:
  public static final #40= #45 of #2;     // Companion=class ext/mods/commons/pool/ScheduledFutureTask$Companion of class ext/mods/commons/pool/ScheduledFutureTask
Signature: #3                           // Ljava/lang/Object;Ljava/util/concurrent/ScheduledFuture<Ljava/lang/Void;>;
SourceFile: "ScheduledFutureTask.kt"
RuntimeVisibleAnnotations:
  0: #72(#73=[I#74,I#75,I#76],#77=I#78,#79=I#80,#81=[s#82],#83=[s#13,s#84,s#85,s#8,s#9,s#14,s#86,s#17,s#18,s#19,s#86,s#22,s#23,s#24,s#86,s#26,s#28,s#30,s#31,s#34,s#40,s#87])
    kotlin.Metadata(
      mv=[2,3,0]
      k=1
      xi=48
      d1=["\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0014\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0096\u0082\u0004J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\b\u0010\u0010\u001a\u00020\u000eH\u0016J\b\u0010\u0011\u001a\u00020\u000eH\u0016J\n\u0010\u0012\u001a\u0004\u0018\u00010\u0002H\u0016J\u001b\u0010\u0012\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0096\u0002¨\u0006\u0015"]
      d2=["Lext/mods/commons/pool/ScheduledFutureTask;","Ljava/util/concurrent/ScheduledFuture;","Ljava/lang/Void;","<init>","()V","getDelay","","unit","Ljava/util/concurrent/TimeUnit;","compareTo","","other","Ljava/util/concurrent/Delayed;","cancel","","mayInterruptIfRunning","isCancelled","isDone","get","timeout","Companion","Brproject"]
    )
