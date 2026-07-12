// Bytecode for: ext.mods.commons.pool.ThreadProvider
// File: ext\mods\commons\pool\ThreadProvider.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/commons/pool/ThreadProvider.class
  Last modified 9 de jul de 2026; size 2700 bytes
  MD5 checksum 1f535c3aabdc06234562a691cdaf4b59
  Compiled from "ThreadProvider.kt"
public final class ext.mods.commons.pool.ThreadProvider implements java.util.concurrent.ThreadFactory
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #2                          // ext/mods/commons/pool/ThreadProvider
  super_class: #4                         // java/lang/Object
  interfaces: 1, fields: 5, methods: 5, attributes: 3
Constant pool:
    #1 = Utf8               ext/mods/commons/pool/ThreadProvider
    #2 = Class              #1            // ext/mods/commons/pool/ThreadProvider
    #3 = Utf8               java/lang/Object
    #4 = Class              #3            // java/lang/Object
    #5 = Utf8               java/util/concurrent/ThreadFactory
    #6 = Class              #5            // java/util/concurrent/ThreadFactory
    #7 = Utf8               <init>
    #8 = Utf8               (Ljava/lang/String;IZ)V
    #9 = Utf8               Lkotlin/jvm/JvmOverloads;
   #10 = Utf8               Lorg/jetbrains/annotations/NotNull;
   #11 = Utf8               ()V
   #12 = NameAndType        #7:#11        // "<init>":()V
   #13 = Methodref          #4.#12        // java/lang/Object."<init>":()V
   #14 = Utf8               prefix
   #15 = Utf8               Ljava/lang/String;
   #16 = NameAndType        #14:#15       // prefix:Ljava/lang/String;
   #17 = Fieldref           #2.#16        // ext/mods/commons/pool/ThreadProvider.prefix:Ljava/lang/String;
   #18 = Utf8               priority
   #19 = Utf8               I
   #20 = NameAndType        #18:#19       // priority:I
   #21 = Fieldref           #2.#20        // ext/mods/commons/pool/ThreadProvider.priority:I
   #22 = Utf8               isDaemon
   #23 = Utf8               Z
   #24 = NameAndType        #22:#23       // isDaemon:Z
   #25 = Fieldref           #2.#24        // ext/mods/commons/pool/ThreadProvider.isDaemon:Z
   #26 = Utf8               java/util/concurrent/atomic/AtomicInteger
   #27 = Class              #26           // java/util/concurrent/atomic/AtomicInteger
   #28 = Methodref          #27.#12       // java/util/concurrent/atomic/AtomicInteger."<init>":()V
   #29 = Utf8               id
   #30 = Utf8               Ljava/util/concurrent/atomic/AtomicInteger;
   #31 = NameAndType        #29:#30       // id:Ljava/util/concurrent/atomic/AtomicInteger;
   #32 = Fieldref           #2.#31        // ext/mods/commons/pool/ThreadProvider.id:Ljava/util/concurrent/atomic/AtomicInteger;
   #33 = Utf8               \u0001
   #34 = String             #33           // \u0001
   #35 = Utf8               java/lang/invoke/StringConcatFactory
   #36 = Class              #35           // java/lang/invoke/StringConcatFactory
   #37 = Utf8               makeConcatWithConstants
   #38 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #39 = NameAndType        #37:#38       // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #40 = Methodref          #36.#39       // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #41 = MethodHandle       6:#40         // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #42 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
   #43 = NameAndType        #37:#42       // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #44 = InvokeDynamic      #0:#43        // #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #45 = Utf8               threadPrefix
   #46 = NameAndType        #45:#15       // threadPrefix:Ljava/lang/String;
   #47 = Fieldref           #2.#46        // ext/mods/commons/pool/ThreadProvider.threadPrefix:Ljava/lang/String;
   #48 = Utf8               this
   #49 = Utf8               Lext/mods/commons/pool/ThreadProvider;
   #50 = Utf8               (Ljava/lang/String;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V
   #51 = NameAndType        #7:#8         // "<init>":(Ljava/lang/String;IZ)V
   #52 = Methodref          #2.#51        // ext/mods/commons/pool/ThreadProvider."<init>":(Ljava/lang/String;IZ)V
   #53 = Utf8               newThread
   #54 = Utf8               (Ljava/lang/Runnable;)Ljava/lang/Thread;
   #55 = Utf8               java/lang/Thread
   #56 = Class              #55           // java/lang/Thread
   #57 = Utf8               incrementAndGet
   #58 = Utf8               ()I
   #59 = NameAndType        #57:#58       // incrementAndGet:()I
   #60 = Methodref          #27.#59       // java/util/concurrent/atomic/AtomicInteger.incrementAndGet:()I
   #61 = Utf8               \u0001\u0001
   #62 = String             #61           // \u0001\u0001
   #63 = Utf8               (Ljava/lang/String;I)Ljava/lang/String;
   #64 = NameAndType        #37:#63       // makeConcatWithConstants:(Ljava/lang/String;I)Ljava/lang/String;
   #65 = InvokeDynamic      #1:#64        // #1:makeConcatWithConstants:(Ljava/lang/String;I)Ljava/lang/String;
   #66 = Utf8               (Ljava/lang/Runnable;Ljava/lang/String;)V
   #67 = NameAndType        #7:#66        // "<init>":(Ljava/lang/Runnable;Ljava/lang/String;)V
   #68 = Methodref          #56.#67       // java/lang/Thread."<init>":(Ljava/lang/Runnable;Ljava/lang/String;)V
   #69 = Utf8               setPriority
   #70 = Utf8               (I)V
   #71 = NameAndType        #69:#70       // setPriority:(I)V
   #72 = Methodref          #56.#71       // java/lang/Thread.setPriority:(I)V
   #73 = Utf8               setDaemon
   #74 = Utf8               (Z)V
   #75 = NameAndType        #73:#74       // setDaemon:(Z)V
   #76 = Methodref          #56.#75       // java/lang/Thread.setDaemon:(Z)V
   #77 = Utf8               thread
   #78 = Utf8               Ljava/lang/Thread;
   #79 = Utf8               runnable
   #80 = Utf8               Ljava/lang/Runnable;
   #81 = Utf8               (Ljava/lang/String;I)V
   #82 = NameAndType        #7:#50        // "<init>":(Ljava/lang/String;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V
   #83 = Methodref          #2.#82        // ext/mods/commons/pool/ThreadProvider."<init>":(Ljava/lang/String;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V
   #84 = Utf8               (Ljava/lang/String;)V
   #85 = Utf8               Lkotlin/Metadata;
   #86 = Utf8               mv
   #87 = Integer            2
   #88 = Integer            3
   #89 = Integer            0
   #90 = Utf8               k
   #91 = Integer            1
   #92 = Utf8               xi
   #93 = Integer            48
   #94 = Utf8               d1
   #95 = Utf8               \u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011
   #96 = Utf8               d2
   #97 = Utf8               Ljava/util/concurrent/ThreadFactory;
   #98 = Utf8
   #99 = Utf8               Brproject
  #100 = Utf8               ThreadProvider.kt
  #101 = Utf8               RuntimeInvisibleAnnotations
  #102 = Utf8               Code
  #103 = Utf8               LineNumberTable
  #104 = Utf8               LocalVariableTable
  #105 = Utf8               RuntimeInvisibleParameterAnnotations
  #106 = Utf8               StackMapTable
  #107 = Utf8               SourceFile
  #108 = Utf8               RuntimeVisibleAnnotations
  #109 = Utf8               BootstrapMethods
{
  public ext.mods.commons.pool.ThreadProvider(java.lang.String, int, boolean);
    descriptor: (Ljava/lang/String;IZ)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=4, args_size=4
         0: aload_0
         1: invokespecial #13                 // Method java/lang/Object."<init>":()V
         4: aload_0
         5: aload_1
         6: putfield      #17                 // Field prefix:Ljava/lang/String;
         9: aload_0
        10: iload_2
        11: putfield      #21                 // Field priority:I
        14: aload_0
        15: iload_3
        16: putfield      #25                 // Field isDaemon:Z
        19: aload_0
        20: new           #27                 // class java/util/concurrent/atomic/AtomicInteger
        23: dup
        24: invokespecial #28                 // Method java/util/concurrent/atomic/AtomicInteger."<init>":()V
        27: putfield      #32                 // Field id:Ljava/util/concurrent/atomic/AtomicInteger;
        30: aload_0
        31: aload_0
        32: getfield      #17                 // Field prefix:Ljava/lang/String;
        35: invokedynamic #44,  0             // InvokeDynamic #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
        40: putfield      #47                 // Field threadPrefix:Ljava/lang/String;
        43: return
      LineNumberTable:
        line 27: 0
        line 28: 4
        line 29: 9
        line 30: 14
        line 33: 19
        line 34: 30
        line 27: 43
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      44     0  this   Lext/mods/commons/pool/ThreadProvider;
            0      44     1 prefix   Ljava/lang/String;
            0      44     2 priority   I
            0      44     3 isDaemon   Z
    RuntimeInvisibleAnnotations:
      0: #9()
        kotlin.jvm.JvmOverloads
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #10()
          org.jetbrains.annotations.NotNull
      parameter 1:
      parameter 2:

  public ext.mods.commons.pool.ThreadProvider(java.lang.String, int, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker);
    descriptor: (Ljava/lang/String;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    flags: (0x1001) ACC_PUBLIC, ACC_SYNTHETIC
    Code:
      stack=4, locals=6, args_size=6
         0: iload         4
         2: iconst_2
         3: iand
         4: ifeq          9
         7: iconst_5
         8: istore_2
         9: iload         4
        11: iconst_4
        12: iand
        13: ifeq          18
        16: iconst_0
        17: istore_3
        18: aload_0
        19: aload_1
        20: iload_2
        21: iload_3
        22: invokespecial #52                 // Method "<init>":(Ljava/lang/String;IZ)V
        25: return
      StackMapTable: number_of_entries = 2
        frame_type = 9 /* same */
        frame_type = 8 /* same */
      LineNumberTable:
        line 27: 0
        line 29: 7
        line 27: 9
        line 30: 16
        line 27: 18
        line 31: 25

  public java.lang.Thread newThread(java.lang.Runnable);
    descriptor: (Ljava/lang/Runnable;)Ljava/lang/Thread;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=3, args_size=2
         0: new           #56                 // class java/lang/Thread
         3: dup
         4: aload_1
         5: aload_0
         6: getfield      #47                 // Field threadPrefix:Ljava/lang/String;
         9: aload_0
        10: getfield      #32                 // Field id:Ljava/util/concurrent/atomic/AtomicInteger;
        13: invokevirtual #60                 // Method java/util/concurrent/atomic/AtomicInteger.incrementAndGet:()I
        16: invokedynamic #65,  0             // InvokeDynamic #1:makeConcatWithConstants:(Ljava/lang/String;I)Ljava/lang/String;
        21: invokespecial #68                 // Method java/lang/Thread."<init>":(Ljava/lang/Runnable;Ljava/lang/String;)V
        24: astore_2
        25: aload_2
        26: aload_0
        27: getfield      #21                 // Field priority:I
        30: invokevirtual #72                 // Method java/lang/Thread.setPriority:(I)V
        33: aload_2
        34: aload_0
        35: getfield      #25                 // Field isDaemon:Z
        38: invokevirtual #76                 // Method java/lang/Thread.setDaemon:(Z)V
        41: aload_2
        42: areturn
      LineNumberTable:
        line 37: 0
        line 38: 25
        line 39: 33
        line 40: 41
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           25      18     2 thread   Ljava/lang/Thread;
            0      43     0  this   Lext/mods/commons/pool/ThreadProvider;
            0      43     1 runnable   Ljava/lang/Runnable;
    RuntimeInvisibleAnnotations:
      0: #10()
        org.jetbrains.annotations.NotNull
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #10()
          org.jetbrains.annotations.NotNull

  public ext.mods.commons.pool.ThreadProvider(java.lang.String, int);
    descriptor: (Ljava/lang/String;I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: iload_2
         3: iconst_0
         4: iconst_4
         5: aconst_null
         6: invokespecial #83                 // Method "<init>":(Ljava/lang/String;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V
         9: return
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/commons/pool/ThreadProvider;
            0      10     1 prefix   Ljava/lang/String;
            0      10     2 priority   I
    RuntimeInvisibleAnnotations:
      0: #9()
        kotlin.jvm.JvmOverloads
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #10()
          org.jetbrains.annotations.NotNull
      parameter 1:

  public ext.mods.commons.pool.ThreadProvider(java.lang.String);
    descriptor: (Ljava/lang/String;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: iconst_0
         3: iconst_0
         4: bipush        6
         6: aconst_null
         7: invokespecial #83                 // Method "<init>":(Ljava/lang/String;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        10: return
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      11     0  this   Lext/mods/commons/pool/ThreadProvider;
            0      11     1 prefix   Ljava/lang/String;
    RuntimeInvisibleAnnotations:
      0: #9()
        kotlin.jvm.JvmOverloads
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #10()
          org.jetbrains.annotations.NotNull
}
SourceFile: "ThreadProvider.kt"
RuntimeVisibleAnnotations:
  0: #85(#86=[I#87,I#88,I#89],#90=I#91,#92=I#93,#94=[s#95],#96=[s#49,s#97,s#14,s#98,s#18,s#98,s#22,s#98,s#7,s#8,s#29,s#30,s#45,s#53,s#78,s#79,s#80,s#99])
    kotlin.Metadata(
      mv=[2,3,0]
      k=1
      xi=48
      d1=["\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"]
      d2=["Lext/mods/commons/pool/ThreadProvider;","Ljava/util/concurrent/ThreadFactory;","prefix","","priority","","isDaemon","","<init>","(Ljava/lang/String;IZ)V","id","Ljava/util/concurrent/atomic/AtomicInteger;","threadPrefix","newThread","Ljava/lang/Thread;","runnable","Ljava/lang/Runnable;","Brproject"]
    )
BootstrapMethods:
  0: #41 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #34 \u0001
  1: #41 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #62 \u0001\u0001
