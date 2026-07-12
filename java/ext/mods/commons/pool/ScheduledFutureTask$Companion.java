// Bytecode for: ext.mods.commons.pool.ScheduledFutureTask$Companion
// File: ext\mods\commons\pool\ScheduledFutureTask$Companion.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/commons/pool/ScheduledFutureTask$Companion.class
  Last modified 9 de jul de 2026; size 1427 bytes
  MD5 checksum 5a4c3fe5bb1073d7a20d0bf6d414863c
  Compiled from "ScheduledFutureTask.kt"
public final class ext.mods.commons.pool.ScheduledFutureTask$Companion
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #2                          // ext/mods/commons/pool/ScheduledFutureTask$Companion
  super_class: #4                         // java/lang/Object
  interfaces: 0, fields: 0, methods: 3, attributes: 3
Constant pool:
   #1 = Utf8               ext/mods/commons/pool/ScheduledFutureTask$Companion
   #2 = Class              #1             // ext/mods/commons/pool/ScheduledFutureTask$Companion
   #3 = Utf8               java/lang/Object
   #4 = Class              #3             // java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = NameAndType        #5:#6          // "<init>":()V
   #8 = Methodref          #4.#7          // java/lang/Object."<init>":()V
   #9 = Utf8               this
  #10 = Utf8               Lext/mods/commons/pool/ScheduledFutureTask$Companion;
  #11 = Utf8               cancelled
  #12 = Utf8               ()Ljava/util/concurrent/ScheduledFuture;
  #13 = Utf8               ()Ljava/util/concurrent/ScheduledFuture<*>;
  #14 = Utf8               Lkotlin/jvm/JvmStatic;
  #15 = Utf8               Lorg/jetbrains/annotations/NotNull;
  #16 = Utf8               ext/mods/commons/pool/ScheduledFutureTask
  #17 = Class              #16            // ext/mods/commons/pool/ScheduledFutureTask
  #18 = Utf8               access$getCANCELLED$cp
  #19 = Utf8               ()Lext/mods/commons/pool/ScheduledFutureTask;
  #20 = NameAndType        #18:#19        // access$getCANCELLED$cp:()Lext/mods/commons/pool/ScheduledFutureTask;
  #21 = Methodref          #17.#20        // ext/mods/commons/pool/ScheduledFutureTask.access$getCANCELLED$cp:()Lext/mods/commons/pool/ScheduledFutureTask;
  #22 = Utf8               java/util/concurrent/ScheduledFuture
  #23 = Class              #22            // java/util/concurrent/ScheduledFuture
  #24 = Utf8               (Lkotlin/jvm/internal/DefaultConstructorMarker;)V
  #25 = Methodref          #2.#7          // ext/mods/commons/pool/ScheduledFutureTask$Companion."<init>":()V
  #26 = Utf8               $constructor_marker
  #27 = Utf8               Lkotlin/jvm/internal/DefaultConstructorMarker;
  #28 = Utf8               Lkotlin/Metadata;
  #29 = Utf8               mv
  #30 = Integer            2
  #31 = Integer            3
  #32 = Integer            0
  #33 = Utf8               k
  #34 = Integer            1
  #35 = Utf8               xi
  #36 = Integer            48
  #37 = Utf8               d1
  #38 = Utf8               \u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0007H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b
  #39 = Utf8               d2
  #40 = Utf8
  #41 = Utf8               CANCELLED
  #42 = Utf8               Lext/mods/commons/pool/ScheduledFutureTask;
  #43 = Utf8               Ljava/util/concurrent/ScheduledFuture;
  #44 = Utf8               Brproject
  #45 = Utf8               Companion
  #46 = Utf8               ScheduledFutureTask.kt
  #47 = Utf8               Code
  #48 = Utf8               LineNumberTable
  #49 = Utf8               LocalVariableTable
  #50 = Utf8               Signature
  #51 = Utf8               RuntimeVisibleAnnotations
  #52 = Utf8               RuntimeInvisibleAnnotations
  #53 = Utf8               InnerClasses
  #54 = Utf8               SourceFile
{
  public final java.util.concurrent.ScheduledFuture<?> cancelled();
    descriptor: ()Ljava/util/concurrent/ScheduledFuture;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: invokestatic  #21                 // Method ext/mods/commons/pool/ScheduledFutureTask.access$getCANCELLED$cp:()Lext/mods/commons/pool/ScheduledFutureTask;
         3: checkcast     #23                 // class java/util/concurrent/ScheduledFuture
         6: areturn
      LineNumberTable:
        line 40: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/commons/pool/ScheduledFutureTask$Companion;
    Signature: #13                          // ()Ljava/util/concurrent/ScheduledFuture<*>;
    RuntimeVisibleAnnotations:
      0: #14()
        kotlin.jvm.JvmStatic
    RuntimeInvisibleAnnotations:
      0: #15()
        org.jetbrains.annotations.NotNull

  public ext.mods.commons.pool.ScheduledFutureTask$Companion(kotlin.jvm.internal.DefaultConstructorMarker);
    descriptor: (Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    flags: (0x1001) ACC_PUBLIC, ACC_SYNTHETIC
    Code:
      stack=1, locals=2, args_size=2
         0: aload_0
         1: invokespecial #25                 // Method "<init>":()V
         4: return
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/commons/pool/ScheduledFutureTask$Companion;
            0       5     1 $constructor_marker   Lkotlin/jvm/internal/DefaultConstructorMarker;
}
InnerClasses:
  public static final #45= #2 of #17;     // Companion=class ext/mods/commons/pool/ScheduledFutureTask$Companion of class ext/mods/commons/pool/ScheduledFutureTask
SourceFile: "ScheduledFutureTask.kt"
RuntimeVisibleAnnotations:
  0: #28(#29=[I#30,I#31,I#32],#33=I#34,#35=I#36,#37=[s#38],#39=[s#10,s#40,s#5,s#6,s#41,s#42,s#11,s#43,s#44])
    kotlin.Metadata(
      mv=[2,3,0]
      k=1
      xi=48
      d1=["\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0007H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"]
      d2=["Lext/mods/commons/pool/ScheduledFutureTask$Companion;","","<init>","()V","CANCELLED","Lext/mods/commons/pool/ScheduledFutureTask;","cancelled","Ljava/util/concurrent/ScheduledFuture;","Brproject"]
    )
