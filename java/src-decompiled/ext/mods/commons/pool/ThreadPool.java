// Bytecode for: ext.mods.commons.pool.ThreadPool
// File: ext\mods\commons\pool\ThreadPool.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/commons/pool/ThreadPool.class
  Last modified 9 de jul de 2026; size 2490 bytes
  MD5 checksum 23bcda98f3fc5176b7c26ec2fe33203e
  Compiled from "ThreadPool.java"
public final class ext.mods.commons.pool.ThreadPool
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #50                         // ext/mods/commons/pool/ThreadPool
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 0, methods: 13, attributes: 3
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Methodref          #8.#9          // ext/mods/commons/pool/CoroutinePool.init:()V
   #8 = Class              #10            // ext/mods/commons/pool/CoroutinePool
   #9 = NameAndType        #11:#6         // init:()V
  #10 = Utf8               ext/mods/commons/pool/CoroutinePool
  #11 = Utf8               init
  #12 = Methodref          #8.#13         // ext/mods/commons/pool/CoroutinePool.execute:(Ljava/lang/Runnable;)V
  #13 = NameAndType        #14:#15        // execute:(Ljava/lang/Runnable;)V
  #14 = Utf8               execute
  #15 = Utf8               (Ljava/lang/Runnable;)V
  #16 = Methodref          #8.#17         // ext/mods/commons/pool/CoroutinePool.schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
  #17 = NameAndType        #18:#19        // schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
  #18 = Utf8               schedule
  #19 = Utf8               (Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
  #20 = Class              #21            // java/lang/Exception
  #21 = Utf8               java/lang/Exception
  #22 = Methodref          #8.#23         // ext/mods/commons/pool/CoroutinePool.executeIO:(Ljava/lang/Runnable;)V
  #23 = NameAndType        #24:#15        // executeIO:(Ljava/lang/Runnable;)V
  #24 = Utf8               executeIO
  #25 = InvokeDynamic      #0:#26         // #0:run:(Ljava/lang/Runnable;)Ljava/lang/Runnable;
  #26 = NameAndType        #27:#28        // run:(Ljava/lang/Runnable;)Ljava/lang/Runnable;
  #27 = Utf8               run
  #28 = Utf8               (Ljava/lang/Runnable;)Ljava/lang/Runnable;
  #29 = Methodref          #8.#30         // ext/mods/commons/pool/CoroutinePool.scheduleAtFixedRate:(Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
  #30 = NameAndType        #31:#32        // scheduleAtFixedRate:(Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
  #31 = Utf8               scheduleAtFixedRate
  #32 = Utf8               (Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
  #33 = Methodref          #8.#34         // ext/mods/commons/pool/CoroutinePool.executePathfinding:(Ljava/lang/Runnable;)V
  #34 = NameAndType        #35:#15        // executePathfinding:(Ljava/lang/Runnable;)V
  #35 = Utf8               executePathfinding
  #36 = Methodref          #8.#37         // ext/mods/commons/pool/CoroutinePool.executeParallelBlocking:(Ljava/lang/Runnable;)V
  #37 = NameAndType        #38:#15        // executeParallelBlocking:(Ljava/lang/Runnable;)V
  #38 = Utf8               executeParallelBlocking
  #39 = Methodref          #8.#40         // ext/mods/commons/pool/CoroutinePool.getPathfindingQueueSize:()I
  #40 = NameAndType        #41:#42        // getPathfindingQueueSize:()I
  #41 = Utf8               getPathfindingQueueSize
  #42 = Utf8               ()I
  #43 = Methodref          #8.#44         // ext/mods/commons/pool/CoroutinePool.getPathfindingActiveCount:()I
  #44 = NameAndType        #45:#42        // getPathfindingActiveCount:()I
  #45 = Utf8               getPathfindingActiveCount
  #46 = Methodref          #8.#47         // ext/mods/commons/pool/CoroutinePool.shutdown:()V
  #47 = NameAndType        #48:#6         // shutdown:()V
  #48 = Utf8               shutdown
  #49 = Methodref          #50.#23        // ext/mods/commons/pool/ThreadPool.executeIO:(Ljava/lang/Runnable;)V
  #50 = Class              #51            // ext/mods/commons/pool/ThreadPool
  #51 = Utf8               ext/mods/commons/pool/ThreadPool
  #52 = Utf8               Code
  #53 = Utf8               LineNumberTable
  #54 = Utf8               LocalVariableTable
  #55 = Utf8               this
  #56 = Utf8               Lext/mods/commons/pool/ThreadPool;
  #57 = Utf8               r
  #58 = Utf8               Ljava/lang/Runnable;
  #59 = Utf8               e
  #60 = Utf8               Ljava/lang/Exception;
  #61 = Utf8               delay
  #62 = Utf8               J
  #63 = Utf8               StackMapTable
  #64 = Utf8               Signature
  #65 = Utf8               (Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture<*>;
  #66 = Utf8               scheduleIO
  #67 = Utf8               period
  #68 = Utf8               (Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture<*>;
  #69 = Utf8               task
  #70 = Utf8               executeParallel
  #71 = Utf8               lambda$scheduleIO$0
  #72 = Utf8               SourceFile
  #73 = Utf8               ThreadPool.java
  #74 = Utf8               BootstrapMethods
  #75 = MethodType         #6             //  ()V
  #76 = MethodHandle       6:#77          // REF_invokeStatic ext/mods/commons/pool/ThreadPool.lambda$scheduleIO$0:(Ljava/lang/Runnable;)V
  #77 = Methodref          #50.#78        // ext/mods/commons/pool/ThreadPool.lambda$scheduleIO$0:(Ljava/lang/Runnable;)V
  #78 = NameAndType        #71:#15        // lambda$scheduleIO$0:(Ljava/lang/Runnable;)V
  #79 = MethodHandle       6:#80          // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #80 = Methodref          #81.#82        // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #81 = Class              #83            // java/lang/invoke/LambdaMetafactory
  #82 = NameAndType        #84:#85        // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #83 = Utf8               java/lang/invoke/LambdaMetafactory
  #84 = Utf8               metafactory
  #85 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #86 = Utf8               InnerClasses
  #87 = Class              #88            // java/lang/invoke/MethodHandles$Lookup
  #88 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #89 = Class              #90            // java/lang/invoke/MethodHandles
  #90 = Utf8               java/lang/invoke/MethodHandles
  #91 = Utf8               Lookup
{
  public ext.mods.commons.pool.ThreadPool();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 46: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/commons/pool/ThreadPool;

  public static void init();
    descriptor: ()V
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=0, locals=0, args_size=0
         0: invokestatic  #7                  // Method ext/mods/commons/pool/CoroutinePool.init:()V
         3: return
      LineNumberTable:
        line 53: 0
        line 54: 3

  public static void execute(java.lang.Runnable);
    descriptor: (Ljava/lang/Runnable;)V
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokestatic  #12                 // Method ext/mods/commons/pool/CoroutinePool.execute:(Ljava/lang/Runnable;)V
         4: return
      LineNumberTable:
        line 62: 0
        line 63: 4
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0     r   Ljava/lang/Runnable;

  public static java.util.concurrent.ScheduledFuture<?> schedule(java.lang.Runnable, long);
    descriptor: (Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=3, locals=4, args_size=2
         0: aload_0
         1: lload_1
         2: invokestatic  #16                 // Method ext/mods/commons/pool/CoroutinePool.schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
         5: areturn
         6: astore_3
         7: aconst_null
         8: areturn
      Exception table:
         from    to  target type
             0     5     6   Class java/lang/Exception
      LineNumberTable:
        line 75: 0
        line 77: 6
        line 79: 7
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            7       2     3     e   Ljava/lang/Exception;
            0       9     0     r   Ljava/lang/Runnable;
            0       9     1 delay   J
      StackMapTable: number_of_entries = 1
        frame_type = 70 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
    Signature: #65                          // (Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture<*>;

  public static void executeIO(java.lang.Runnable);
    descriptor: (Ljava/lang/Runnable;)V
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokestatic  #22                 // Method ext/mods/commons/pool/CoroutinePool.executeIO:(Ljava/lang/Runnable;)V
         4: return
      LineNumberTable:
        line 92: 0
        line 93: 4
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0     r   Ljava/lang/Runnable;

  public static java.util.concurrent.ScheduledFuture<?> scheduleIO(java.lang.Runnable, long);
    descriptor: (Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=3, locals=4, args_size=2
         0: aload_0
         1: invokedynamic #25,  0             // InvokeDynamic #0:run:(Ljava/lang/Runnable;)Ljava/lang/Runnable;
         6: lload_1
         7: invokestatic  #16                 // Method ext/mods/commons/pool/CoroutinePool.schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
        10: areturn
        11: astore_3
        12: aconst_null
        13: areturn
      Exception table:
         from    to  target type
             0    10    11   Class java/lang/Exception
      LineNumberTable:
        line 108: 0
        line 110: 11
        line 112: 12
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           12       2     3     e   Ljava/lang/Exception;
            0      14     0     r   Ljava/lang/Runnable;
            0      14     1 delay   J
      StackMapTable: number_of_entries = 1
        frame_type = 75 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
    Signature: #65                          // (Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture<*>;

  public static java.util.concurrent.ScheduledFuture<?> scheduleAtFixedRate(java.lang.Runnable, long, long);
    descriptor: (Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=5, locals=6, args_size=3
         0: aload_0
         1: lload_1
         2: lload_3
         3: invokestatic  #29                 // Method ext/mods/commons/pool/CoroutinePool.scheduleAtFixedRate:(Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
         6: areturn
         7: astore        5
         9: aconst_null
        10: areturn
      Exception table:
         from    to  target type
             0     6     7   Class java/lang/Exception
      LineNumberTable:
        line 127: 0
        line 129: 7
        line 131: 9
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            9       2     5     e   Ljava/lang/Exception;
            0      11     0     r   Ljava/lang/Runnable;
            0      11     1 delay   J
            0      11     3 period   J
      StackMapTable: number_of_entries = 1
        frame_type = 71 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
    Signature: #68                          // (Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture<*>;

  public static void executePathfinding(java.lang.Runnable);
    descriptor: (Ljava/lang/Runnable;)V
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokestatic  #33                 // Method ext/mods/commons/pool/CoroutinePool.executePathfinding:(Ljava/lang/Runnable;)V
         4: return
      LineNumberTable:
        line 141: 0
        line 142: 4
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  task   Ljava/lang/Runnable;

  public static void executeParallel(java.lang.Runnable);
    descriptor: (Ljava/lang/Runnable;)V
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokestatic  #36                 // Method ext/mods/commons/pool/CoroutinePool.executeParallelBlocking:(Ljava/lang/Runnable;)V
         4: return
      LineNumberTable:
        line 150: 0
        line 151: 4
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  task   Ljava/lang/Runnable;

  public static int getPathfindingQueueSize();
    descriptor: ()I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: invokestatic  #39                 // Method ext/mods/commons/pool/CoroutinePool.getPathfindingQueueSize:()I
         3: ireturn
      LineNumberTable:
        line 159: 0

  public static int getPathfindingActiveCount();
    descriptor: ()I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: invokestatic  #43                 // Method ext/mods/commons/pool/CoroutinePool.getPathfindingActiveCount:()I
         3: ireturn
      LineNumberTable:
        line 168: 0

  public static void shutdown();
    descriptor: ()V
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=0, locals=0, args_size=0
         0: invokestatic  #46                 // Method ext/mods/commons/pool/CoroutinePool.shutdown:()V
         3: return
      LineNumberTable:
        line 176: 0
        line 177: 3
}
SourceFile: "ThreadPool.java"
BootstrapMethods:
  0: #79 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #75 ()V
      #76 REF_invokeStatic ext/mods/commons/pool/ThreadPool.lambda$scheduleIO$0:(Ljava/lang/Runnable;)V
      #75 ()V
InnerClasses:
  public static final #91= #87 of #89;    // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
