// Bytecode for: ext.mods.commons.pool.RejectedExecutionHandlerOptimized
// File: ext\mods\commons\pool\RejectedExecutionHandlerOptimized.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/commons/pool/RejectedExecutionHandlerOptimized.class
  Last modified 9 de jul de 2026; size 3803 bytes
  MD5 checksum 20114eac82e049832ff4f6bab73c1612
  Compiled from "RejectedExecutionHandler.kt"
public final class ext.mods.commons.pool.RejectedExecutionHandlerOptimized implements java.util.concurrent.RejectedExecutionHandler
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #2                          // ext/mods/commons/pool/RejectedExecutionHandlerOptimized
  super_class: #4                         // java/lang/Object
  interfaces: 1, fields: 1, methods: 3, attributes: 4
Constant pool:
    #1 = Utf8               ext/mods/commons/pool/RejectedExecutionHandlerOptimized
    #2 = Class              #1            // ext/mods/commons/pool/RejectedExecutionHandlerOptimized
    #3 = Utf8               java/lang/Object
    #4 = Class              #3            // java/lang/Object
    #5 = Utf8               java/util/concurrent/RejectedExecutionHandler
    #6 = Class              #5            // java/util/concurrent/RejectedExecutionHandler
    #7 = Utf8               <init>
    #8 = Utf8               ()V
    #9 = NameAndType        #7:#8         // "<init>":()V
   #10 = Methodref          #4.#9         // java/lang/Object."<init>":()V
   #11 = Utf8               java/lang/Class
   #12 = Class              #11           // java/lang/Class
   #13 = Utf8               getName
   #14 = Utf8               ()Ljava/lang/String;
   #15 = NameAndType        #13:#14       // getName:()Ljava/lang/String;
   #16 = Methodref          #12.#15       // java/lang/Class.getName:()Ljava/lang/String;
   #17 = Utf8               java/util/logging/Logger
   #18 = Class              #17           // java/util/logging/Logger
   #19 = Utf8               getLogger
   #20 = Utf8               (Ljava/lang/String;)Ljava/util/logging/Logger;
   #21 = NameAndType        #19:#20       // getLogger:(Ljava/lang/String;)Ljava/util/logging/Logger;
   #22 = Methodref          #18.#21       // java/util/logging/Logger.getLogger:(Ljava/lang/String;)Ljava/util/logging/Logger;
   #23 = Utf8               LOGGER
   #24 = Utf8               Ljava/util/logging/Logger;
   #25 = NameAndType        #23:#24       // LOGGER:Ljava/util/logging/Logger;
   #26 = Fieldref           #2.#25        // ext/mods/commons/pool/RejectedExecutionHandlerOptimized.LOGGER:Ljava/util/logging/Logger;
   #27 = Utf8               this
   #28 = Utf8               Lext/mods/commons/pool/RejectedExecutionHandlerOptimized;
   #29 = Utf8               rejectedExecution
   #30 = Utf8               (Ljava/lang/Runnable;Ljava/util/concurrent/ThreadPoolExecutor;)V
   #31 = Utf8               Lorg/jetbrains/annotations/NotNull;
   #32 = Utf8               java/lang/Exception
   #33 = Class              #32           // java/lang/Exception
   #34 = Utf8               java/util/concurrent/ThreadPoolExecutor
   #35 = Class              #34           // java/util/concurrent/ThreadPoolExecutor
   #36 = Utf8               isShutdown
   #37 = Utf8               ()Z
   #38 = NameAndType        #36:#37       // isShutdown:()Z
   #39 = Methodref          #35.#38       // java/util/concurrent/ThreadPoolExecutor.isShutdown:()Z
   #40 = Utf8               java/lang/Thread
   #41 = Class              #40           // java/lang/Thread
   #42 = Utf8               currentThread
   #43 = Utf8               ()Ljava/lang/Thread;
   #44 = NameAndType        #42:#43       // currentThread:()Ljava/lang/Thread;
   #45 = Methodref          #41.#44       // java/lang/Thread.currentThread:()Ljava/lang/Thread;
   #46 = Utf8               getPriority
   #47 = Utf8               ()I
   #48 = NameAndType        #46:#47       // getPriority:()I
   #49 = Methodref          #41.#48       // java/lang/Thread.getPriority:()I
   #50 = Utf8               java/lang/System
   #51 = Class              #50           // java/lang/System
   #52 = Utf8               nanoTime
   #53 = Utf8               ()J
   #54 = NameAndType        #52:#53       // nanoTime:()J
   #55 = Methodref          #51.#54       // java/lang/System.nanoTime:()J
   #56 = Utf8               Rejected-Task-\u0001
   #57 = String             #56           // Rejected-Task-\u0001
   #58 = Utf8               java/lang/invoke/StringConcatFactory
   #59 = Class              #58           // java/lang/invoke/StringConcatFactory
   #60 = Utf8               makeConcatWithConstants
   #61 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #62 = NameAndType        #60:#61       // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #63 = Methodref          #59.#62       // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #64 = MethodHandle       6:#63         // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #65 = Utf8               (J)Ljava/lang/String;
   #66 = NameAndType        #60:#65       // makeConcatWithConstants:(J)Ljava/lang/String;
   #67 = InvokeDynamic      #0:#66        // #0:makeConcatWithConstants:(J)Ljava/lang/String;
   #68 = Utf8               (Ljava/lang/Runnable;Ljava/lang/String;)V
   #69 = NameAndType        #7:#68        // "<init>":(Ljava/lang/Runnable;Ljava/lang/String;)V
   #70 = Methodref          #41.#69       // java/lang/Thread."<init>":(Ljava/lang/Runnable;Ljava/lang/String;)V
   #71 = Utf8               setDaemon
   #72 = Utf8               (Z)V
   #73 = NameAndType        #71:#72       // setDaemon:(Z)V
   #74 = Methodref          #41.#73       // java/lang/Thread.setDaemon:(Z)V
   #75 = Utf8               setPriority
   #76 = Utf8               (I)V
   #77 = NameAndType        #75:#76       // setPriority:(I)V
   #78 = Methodref          #41.#77       // java/lang/Thread.setPriority:(I)V
   #79 = Utf8               start
   #80 = NameAndType        #79:#8        // start:()V
   #81 = Methodref          #41.#80       // java/lang/Thread.start:()V
   #82 = Utf8               Tarefa rejeitada executada em nova thread (thread crítica: prioridade \u0001)
   #83 = String             #82           // Tarefa rejeitada executada em nova thread (thread crítica: prioridade \u0001)
   #84 = Utf8               (I)Ljava/lang/String;
   #85 = NameAndType        #60:#84       // makeConcatWithConstants:(I)Ljava/lang/String;
   #86 = InvokeDynamic      #1:#85        // #1:makeConcatWithConstants:(I)Ljava/lang/String;
   #87 = Utf8               fine
   #88 = Utf8               (Ljava/lang/String;)V
   #89 = NameAndType        #87:#88       // fine:(Ljava/lang/String;)V
   #90 = Methodref          #18.#89       // java/util/logging/Logger.fine:(Ljava/lang/String;)V
   #91 = Utf8               isVirtualThreadsAvailable
   #92 = NameAndType        #91:#37       // isVirtualThreadsAvailable:()Z
   #93 = Methodref          #2.#92        // ext/mods/commons/pool/RejectedExecutionHandlerOptimized.isVirtualThreadsAvailable:()Z
   #94 = Utf8               ofVirtual
   #95 = Utf8               ()Ljava/lang/Thread$Builder$OfVirtual;
   #96 = NameAndType        #94:#95       // ofVirtual:()Ljava/lang/Thread$Builder$OfVirtual;
   #97 = Methodref          #41.#96       // java/lang/Thread.ofVirtual:()Ljava/lang/Thread$Builder$OfVirtual;
   #98 = Utf8               Rejected-Virtual-\u0001
   #99 = String             #98           // Rejected-Virtual-\u0001
  #100 = InvokeDynamic      #2:#66        // #2:makeConcatWithConstants:(J)Ljava/lang/String;
  #101 = Utf8               java/lang/Thread$Builder$OfVirtual
  #102 = Class              #101          // java/lang/Thread$Builder$OfVirtual
  #103 = Utf8               name
  #104 = Utf8               (Ljava/lang/String;)Ljava/lang/Thread$Builder$OfVirtual;
  #105 = NameAndType        #103:#104     // name:(Ljava/lang/String;)Ljava/lang/Thread$Builder$OfVirtual;
  #106 = InterfaceMethodref #102.#105     // java/lang/Thread$Builder$OfVirtual.name:(Ljava/lang/String;)Ljava/lang/Thread$Builder$OfVirtual;
  #107 = Utf8               (Ljava/lang/Runnable;)Ljava/lang/Thread;
  #108 = NameAndType        #79:#107      // start:(Ljava/lang/Runnable;)Ljava/lang/Thread;
  #109 = InterfaceMethodref #102.#108     // java/lang/Thread$Builder$OfVirtual.start:(Ljava/lang/Runnable;)Ljava/lang/Thread;
  #110 = Utf8               Tarefa rejeitada executada em Virtual Thread (Java 21)
  #111 = String             #110          // Tarefa rejeitada executada em Virtual Thread (Java 21)
  #112 = Utf8               java/lang/Runnable
  #113 = Class              #112          // java/lang/Runnable
  #114 = Utf8               run
  #115 = NameAndType        #114:#8       // run:()V
  #116 = InterfaceMethodref #113.#115     // java/lang/Runnable.run:()V
  #117 = Utf8               Tarefa rejeitada executada na thread atual (Virtual Threads não disponíveis)
  #118 = String             #117          // Tarefa rejeitada executada na thread atual (Virtual Threads não disponíveis)
  #119 = Utf8               Fallback final: tarefa executada diretamente
  #120 = String             #119          // Fallback final: tarefa executada diretamente
  #121 = Utf8               Tarefa rejeitada executada diretamente (thread de baixa prioridade: \u0001)
  #122 = String             #121          // Tarefa rejeitada executada diretamente (thread de baixa prioridade: \u0001)
  #123 = InvokeDynamic      #3:#85        // #3:makeConcatWithConstants:(I)Ljava/lang/String;
  #124 = Utf8               $i$a$-apply-RejectedExecutionHandlerOptimized$rejectedExecution$1
  #125 = Utf8               I
  #126 = Utf8               $this$rejectedExecution_u24lambda_u240
  #127 = Utf8               Ljava/lang/Thread;
  #128 = Utf8               e
  #129 = Utf8               Ljava/lang/Exception;
  #130 = Utf8               threadPriority
  #131 = Utf8               runnable
  #132 = Utf8               Ljava/lang/Runnable;
  #133 = Utf8               executor
  #134 = Utf8               Ljava/util/concurrent/ThreadPoolExecutor;
  #135 = String             #94           // ofVirtual
  #136 = Utf8               getMethod
  #137 = Utf8               (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
  #138 = NameAndType        #136:#137     // getMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
  #139 = Methodref          #12.#138      // java/lang/Class.getMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
  #140 = Utf8               Lkotlin/Metadata;
  #141 = Utf8               mv
  #142 = Integer            2
  #143 = Integer            3
  #144 = Integer            0
  #145 = Utf8               k
  #146 = Integer            1
  #147 = Utf8               xi
  #148 = Integer            48
  #149 = Utf8               d1
  #150 = Utf8               \u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\rH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e
  #151 = Utf8               d2
  #152 = Utf8               Ljava/util/concurrent/RejectedExecutionHandler;
  #153 = Utf8
  #154 = Utf8               Brproject
  #155 = Utf8               java/lang/Thread$Builder
  #156 = Class              #155          // java/lang/Thread$Builder
  #157 = Utf8               Builder
  #158 = Utf8               OfVirtual
  #159 = Utf8               RejectedExecutionHandler.kt
  #160 = Utf8               RuntimeInvisibleAnnotations
  #161 = Utf8               Code
  #162 = Utf8               LineNumberTable
  #163 = Utf8               LocalVariableTable
  #164 = Utf8               StackMapTable
  #165 = Utf8               RuntimeInvisibleParameterAnnotations
  #166 = Utf8               InnerClasses
  #167 = Utf8               SourceFile
  #168 = Utf8               RuntimeVisibleAnnotations
  #169 = Utf8               BootstrapMethods
{
  public ext.mods.commons.pool.RejectedExecutionHandlerOptimized();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: invokespecial #10                 // Method java/lang/Object."<init>":()V
         4: aload_0
         5: ldc           #2                  // class ext/mods/commons/pool/RejectedExecutionHandlerOptimized
         7: invokevirtual #16                 // Method java/lang/Class.getName:()Ljava/lang/String;
        10: invokestatic  #22                 // Method java/util/logging/Logger.getLogger:(Ljava/lang/String;)Ljava/util/logging/Logger;
        13: putfield      #26                 // Field LOGGER:Ljava/util/logging/Logger;
        16: return
      LineNumberTable:
        line 29: 0
        line 31: 4
        line 29: 16
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      17     0  this   Lext/mods/commons/pool/RejectedExecutionHandlerOptimized;

  public void rejectedExecution(java.lang.Runnable, java.util.concurrent.ThreadPoolExecutor);
    descriptor: (Ljava/lang/Runnable;Ljava/util/concurrent/ThreadPoolExecutor;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=8, args_size=3
         0: aload_2
         1: invokevirtual #39                 // Method java/util/concurrent/ThreadPoolExecutor.isShutdown:()Z
         4: ifeq          8
         7: return
         8: invokestatic  #45                 // Method java/lang/Thread.currentThread:()Ljava/lang/Thread;
        11: astore_3
        12: aload_3
        13: invokevirtual #49                 // Method java/lang/Thread.getPriority:()I
        16: istore        4
        18: nop
        19: iload         4
        21: iconst_5
        22: if_icmple     85
        25: new           #41                 // class java/lang/Thread
        28: dup
        29: aload_1
        30: invokestatic  #55                 // Method java/lang/System.nanoTime:()J
        33: invokedynamic #67,  0             // InvokeDynamic #0:makeConcatWithConstants:(J)Ljava/lang/String;
        38: invokespecial #70                 // Method java/lang/Thread."<init>":(Ljava/lang/Runnable;Ljava/lang/String;)V
        41: astore        5
        43: aload         5
        45: astore        6
        47: iconst_0
        48: istore        7
        50: aload         6
        52: iconst_1
        53: invokevirtual #74                 // Method java/lang/Thread.setDaemon:(Z)V
        56: aload         6
        58: iconst_5
        59: invokevirtual #78                 // Method java/lang/Thread.setPriority:(I)V
        62: nop
        63: aload         5
        65: invokevirtual #81                 // Method java/lang/Thread.start:()V
        68: aload_0
        69: getfield      #26                 // Field LOGGER:Ljava/util/logging/Logger;
        72: iload         4
        74: invokedynamic #86,  0             // InvokeDynamic #1:makeConcatWithConstants:(I)Ljava/lang/String;
        79: invokevirtual #90                 // Method java/util/logging/Logger.fine:(Ljava/lang/String;)V
        82: goto          192
        85: iload         4
        87: iconst_5
        88: if_icmpne     172
        91: nop
        92: aload_0
        93: invokespecial #93                 // Method isVirtualThreadsAvailable:()Z
        96: ifeq          134
        99: invokestatic  #97                 // Method java/lang/Thread.ofVirtual:()Ljava/lang/Thread$Builder$OfVirtual;
       102: invokestatic  #55                 // Method java/lang/System.nanoTime:()J
       105: invokedynamic #100,  0            // InvokeDynamic #2:makeConcatWithConstants:(J)Ljava/lang/String;
       110: invokeinterface #106,  2          // InterfaceMethod java/lang/Thread$Builder$OfVirtual.name:(Ljava/lang/String;)Ljava/lang/Thread$Builder$OfVirtual;
       115: aload_1
       116: invokeinterface #109,  2          // InterfaceMethod java/lang/Thread$Builder$OfVirtual.start:(Ljava/lang/Runnable;)Ljava/lang/Thread;
       121: pop
       122: aload_0
       123: getfield      #26                 // Field LOGGER:Ljava/util/logging/Logger;
       126: ldc           #111                // String Tarefa rejeitada executada em Virtual Thread (Java 21)
       128: invokevirtual #90                 // Method java/util/logging/Logger.fine:(Ljava/lang/String;)V
       131: goto          192
       134: aload_1
       135: invokeinterface #116,  1          // InterfaceMethod java/lang/Runnable.run:()V
       140: aload_0
       141: getfield      #26                 // Field LOGGER:Ljava/util/logging/Logger;
       144: ldc           #118                // String Tarefa rejeitada executada na thread atual (Virtual Threads não disponíveis)
       146: invokevirtual #90                 // Method java/util/logging/Logger.fine:(Ljava/lang/String;)V
       149: goto          192
       152: astore        5
       154: aload_1
       155: invokeinterface #116,  1          // InterfaceMethod java/lang/Runnable.run:()V
       160: aload_0
       161: getfield      #26                 // Field LOGGER:Ljava/util/logging/Logger;
       164: ldc           #120                // String Fallback final: tarefa executada diretamente
       166: invokevirtual #90                 // Method java/util/logging/Logger.fine:(Ljava/lang/String;)V
       169: goto          192
       172: aload_1
       173: invokeinterface #116,  1          // InterfaceMethod java/lang/Runnable.run:()V
       178: aload_0
       179: getfield      #26                 // Field LOGGER:Ljava/util/logging/Logger;
       182: iload         4
       184: invokedynamic #123,  0            // InvokeDynamic #3:makeConcatWithConstants:(I)Ljava/lang/String;
       189: invokevirtual #90                 // Method java/util/logging/Logger.fine:(Ljava/lang/String;)V
       192: return
      Exception table:
         from    to  target type
            91   149   152   Class java/lang/Exception
      StackMapTable: number_of_entries = 6
        frame_type = 8 /* same */
        frame_type = 253 /* append */
          offset_delta = 76
          locals = [ class java/lang/Thread, int ]
        frame_type = 48 /* same */
        frame_type = 81 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 19 /* same */
        frame_type = 19 /* same */
      LineNumberTable:
        line 34: 0
        line 35: 7
        line 38: 8
        line 39: 12
        line 41: 18
        line 42: 19
        line 43: 25
        line 44: 50
        line 45: 56
        line 46: 62
        line 43: 63
        line 46: 65
        line 48: 68
        line 51: 85
        line 52: 91
        line 53: 92
        line 54: 99
        line 55: 122
        line 57: 134
        line 58: 140
        line 60: 152
        line 61: 154
        line 62: 160
        line 67: 172
        line 68: 178
        line 71: 192
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           50      13     7 $i$a$-apply-RejectedExecutionHandlerOptimized$rejectedExecution$1   I
           47      16     6 $this$rejectedExecution_u24lambda_u240   Ljava/lang/Thread;
          154      15     5     e   Ljava/lang/Exception;
           12     181     3 currentThread   Ljava/lang/Thread;
           18     175     4 threadPriority   I
            0     193     0  this   Lext/mods/commons/pool/RejectedExecutionHandlerOptimized;
            0     193     1 runnable   Ljava/lang/Runnable;
            0     193     2 executor   Ljava/util/concurrent/ThreadPoolExecutor;
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #31()
          org.jetbrains.annotations.NotNull
      parameter 1:
        0: #31()
          org.jetbrains.annotations.NotNull
}
InnerClasses:
  public static #157= #156 of #41;        // Builder=class java/lang/Thread$Builder of class java/lang/Thread
  public static #158= #102 of #156;       // OfVirtual=class java/lang/Thread$Builder$OfVirtual of class java/lang/Thread$Builder
SourceFile: "RejectedExecutionHandler.kt"
RuntimeVisibleAnnotations:
  0: #140(#141=[I#142,I#143,I#144],#145=I#146,#147=I#148,#149=[s#150],#151=[s#28,s#152,s#7,s#8,s#23,s#24,s#29,s#153,s#131,s#132,s#133,s#134,s#91,s#153,s#154])
    kotlin.Metadata(
      mv=[2,3,0]
      k=1
      xi=48
      d1=["\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\rH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"]
      d2=["Lext/mods/commons/pool/RejectedExecutionHandlerOptimized;","Ljava/util/concurrent/RejectedExecutionHandler;","<init>","()V","LOGGER","Ljava/util/logging/Logger;","rejectedExecution","","runnable","Ljava/lang/Runnable;","executor","Ljava/util/concurrent/ThreadPoolExecutor;","isVirtualThreadsAvailable","","Brproject"]
    )
BootstrapMethods:
  0: #64 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #57 Rejected-Task-\u0001
  1: #64 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #83 Tarefa rejeitada executada em nova thread (thread crítica: prioridade \u0001)
  2: #64 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #99 Rejected-Virtual-\u0001
  3: #64 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #122 Tarefa rejeitada executada diretamente (thread de baixa prioridade: \u0001)
