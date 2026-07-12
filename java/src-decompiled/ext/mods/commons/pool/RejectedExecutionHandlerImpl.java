// Bytecode for: ext.mods.commons.pool.RejectedExecutionHandlerImpl
// File: ext\mods\commons\pool\RejectedExecutionHandlerImpl.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/commons/pool/RejectedExecutionHandlerImpl.class
  Last modified 9 de jul de 2026; size 2102 bytes
  MD5 checksum 6433206fce836d1bcdbb8bc45d143dba
  Compiled from "RejectedExecutionHandlerImpl.java"
public class ext.mods.commons.pool.RejectedExecutionHandlerImpl implements java.util.concurrent.RejectedExecutionHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #14                         // ext/mods/commons/pool/RejectedExecutionHandlerImpl
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 1, methods: 3, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Methodref          #8.#9         // java/util/concurrent/ThreadPoolExecutor.isShutdown:()Z
    #8 = Class              #10           // java/util/concurrent/ThreadPoolExecutor
    #9 = NameAndType        #11:#12       // isShutdown:()Z
   #10 = Utf8               java/util/concurrent/ThreadPoolExecutor
   #11 = Utf8               isShutdown
   #12 = Utf8               ()Z
   #13 = Fieldref           #14.#15       // ext/mods/commons/pool/RejectedExecutionHandlerImpl.LOGGER:Ljava/util/logging/Logger;
   #14 = Class              #16           // ext/mods/commons/pool/RejectedExecutionHandlerImpl
   #15 = NameAndType        #17:#18       // LOGGER:Ljava/util/logging/Logger;
   #16 = Utf8               ext/mods/commons/pool/RejectedExecutionHandlerImpl
   #17 = Utf8               LOGGER
   #18 = Utf8               Ljava/util/logging/Logger;
   #19 = InterfaceMethodref #20.#21       // java/lang/Runnable.getClass:()Ljava/lang/Class;
   #20 = Class              #22           // java/lang/Runnable
   #21 = NameAndType        #23:#24       // getClass:()Ljava/lang/Class;
   #22 = Utf8               java/lang/Runnable
   #23 = Utf8               getClass
   #24 = Utf8               ()Ljava/lang/Class;
   #25 = Methodref          #26.#27       // java/lang/Class.getSimpleName:()Ljava/lang/String;
   #26 = Class              #28           // java/lang/Class
   #27 = NameAndType        #29:#30       // getSimpleName:()Ljava/lang/String;
   #28 = Utf8               java/lang/Class
   #29 = Utf8               getSimpleName
   #30 = Utf8               ()Ljava/lang/String;
   #31 = Methodref          #32.#33       // java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
   #32 = Class              #34           // java/lang/String
   #33 = NameAndType        #35:#36       // valueOf:(Ljava/lang/Object;)Ljava/lang/String;
   #34 = Utf8               java/lang/String
   #35 = Utf8               valueOf
   #36 = Utf8               (Ljava/lang/Object;)Ljava/lang/String;
   #37 = Class              #38           // java/util/concurrent/RejectedExecutionException
   #38 = Utf8               java/util/concurrent/RejectedExecutionException
   #39 = Methodref          #37.#3        // java/util/concurrent/RejectedExecutionException."<init>":()V
   #40 = InvokeDynamic      #0:#41        // #0:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #41 = NameAndType        #42:#43       // makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #42 = Utf8               makeConcatWithConstants
   #43 = Utf8               (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #44 = Methodref          #45.#46       // java/util/logging/Logger.warning:(Ljava/lang/String;)V
   #45 = Class              #47           // java/util/logging/Logger
   #46 = NameAndType        #48:#49       // warning:(Ljava/lang/String;)V
   #47 = Utf8               java/util/logging/Logger
   #48 = Utf8               warning
   #49 = Utf8               (Ljava/lang/String;)V
   #50 = Methodref          #51.#52       // java/lang/Thread.currentThread:()Ljava/lang/Thread;
   #51 = Class              #53           // java/lang/Thread
   #52 = NameAndType        #54:#55       // currentThread:()Ljava/lang/Thread;
   #53 = Utf8               java/lang/Thread
   #54 = Utf8               currentThread
   #55 = Utf8               ()Ljava/lang/Thread;
   #56 = Methodref          #51.#57       // java/lang/Thread.getPriority:()I
   #57 = NameAndType        #58:#59       // getPriority:()I
   #58 = Utf8               getPriority
   #59 = Utf8               ()I
   #60 = Methodref          #51.#61       // java/lang/Thread."<init>":(Ljava/lang/Runnable;)V
   #61 = NameAndType        #5:#62        // "<init>":(Ljava/lang/Runnable;)V
   #62 = Utf8               (Ljava/lang/Runnable;)V
   #63 = Methodref          #51.#64       // java/lang/Thread.start:()V
   #64 = NameAndType        #65:#6        // start:()V
   #65 = Utf8               start
   #66 = InterfaceMethodref #20.#67       // java/lang/Runnable.run:()V
   #67 = NameAndType        #68:#6        // run:()V
   #68 = Utf8               run
   #69 = Methodref          #26.#70       // java/lang/Class.getName:()Ljava/lang/String;
   #70 = NameAndType        #71:#30       // getName:()Ljava/lang/String;
   #71 = Utf8               getName
   #72 = Methodref          #45.#73       // java/util/logging/Logger.getLogger:(Ljava/lang/String;)Ljava/util/logging/Logger;
   #73 = NameAndType        #74:#75       // getLogger:(Ljava/lang/String;)Ljava/util/logging/Logger;
   #74 = Utf8               getLogger
   #75 = Utf8               (Ljava/lang/String;)Ljava/util/logging/Logger;
   #76 = Class              #77           // java/util/concurrent/RejectedExecutionHandler
   #77 = Utf8               java/util/concurrent/RejectedExecutionHandler
   #78 = Utf8               Code
   #79 = Utf8               LineNumberTable
   #80 = Utf8               LocalVariableTable
   #81 = Utf8               this
   #82 = Utf8               Lext/mods/commons/pool/RejectedExecutionHandlerImpl;
   #83 = Utf8               rejectedExecution
   #84 = Utf8               (Ljava/lang/Runnable;Ljava/util/concurrent/ThreadPoolExecutor;)V
   #85 = Utf8               runnable
   #86 = Utf8               Ljava/lang/Runnable;
   #87 = Utf8               executor
   #88 = Utf8               Ljava/util/concurrent/ThreadPoolExecutor;
   #89 = Utf8               StackMapTable
   #90 = Utf8               <clinit>
   #91 = Utf8               SourceFile
   #92 = Utf8               RejectedExecutionHandlerImpl.java
   #93 = Utf8               BootstrapMethods
   #94 = String             #95           // \u0001\u0001 from \u0001 \u0001
   #95 = Utf8               \u0001\u0001 from \u0001 \u0001
   #96 = MethodHandle       6:#97         // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #97 = Methodref          #98.#99       // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #98 = Class              #100          // java/lang/invoke/StringConcatFactory
   #99 = NameAndType        #42:#101      // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #100 = Utf8               java/lang/invoke/StringConcatFactory
  #101 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #102 = Utf8               InnerClasses
  #103 = Class              #104          // java/lang/invoke/MethodHandles$Lookup
  #104 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #105 = Class              #106          // java/lang/invoke/MethodHandles
  #106 = Utf8               java/lang/invoke/MethodHandles
  #107 = Utf8               Lookup
{
  public ext.mods.commons.pool.RejectedExecutionHandlerImpl();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 25: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/commons/pool/RejectedExecutionHandlerImpl;

  public void rejectedExecution(java.lang.Runnable, java.util.concurrent.ThreadPoolExecutor);
    descriptor: (Ljava/lang/Runnable;Ljava/util/concurrent/ThreadPoolExecutor;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=3, args_size=3
         0: aload_2
         1: invokevirtual #7                  // Method java/util/concurrent/ThreadPoolExecutor.isShutdown:()Z
         4: ifeq          8
         7: return
         8: getstatic     #13                 // Field LOGGER:Ljava/util/logging/Logger;
        11: aload_1
        12: invokeinterface #19,  1           // InterfaceMethod java/lang/Runnable.getClass:()Ljava/lang/Class;
        17: invokevirtual #25                 // Method java/lang/Class.getSimpleName:()Ljava/lang/String;
        20: aload_1
        21: invokestatic  #31                 // Method java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        24: aload_2
        25: invokestatic  #31                 // Method java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        28: new           #37                 // class java/util/concurrent/RejectedExecutionException
        31: dup
        32: invokespecial #39                 // Method java/util/concurrent/RejectedExecutionException."<init>":()V
        35: invokestatic  #31                 // Method java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        38: invokedynamic #40,  0             // InvokeDynamic #0:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        43: invokevirtual #44                 // Method java/util/logging/Logger.warning:(Ljava/lang/String;)V
        46: invokestatic  #50                 // Method java/lang/Thread.currentThread:()Ljava/lang/Thread;
        49: invokevirtual #56                 // Method java/lang/Thread.getPriority:()I
        52: iconst_5
        53: if_icmple     70
        56: new           #51                 // class java/lang/Thread
        59: dup
        60: aload_1
        61: invokespecial #60                 // Method java/lang/Thread."<init>":(Ljava/lang/Runnable;)V
        64: invokevirtual #63                 // Method java/lang/Thread.start:()V
        67: goto          76
        70: aload_1
        71: invokeinterface #66,  1           // InterfaceMethod java/lang/Runnable.run:()V
        76: return
      LineNumberTable:
        line 32: 0
        line 34: 7
        line 37: 8
        line 39: 46
        line 40: 56
        line 42: 70
        line 43: 76
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      77     0  this   Lext/mods/commons/pool/RejectedExecutionHandlerImpl;
            0      77     1 runnable   Ljava/lang/Runnable;
            0      77     2 executor   Ljava/util/concurrent/ThreadPoolExecutor;
      StackMapTable: number_of_entries = 3
        frame_type = 8 /* same */
        frame_type = 61 /* same */
        frame_type = 5 /* same */

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: ldc           #14                 // class ext/mods/commons/pool/RejectedExecutionHandlerImpl
         2: invokevirtual #69                 // Method java/lang/Class.getName:()Ljava/lang/String;
         5: invokestatic  #72                 // Method java/util/logging/Logger.getLogger:(Ljava/lang/String;)Ljava/util/logging/Logger;
         8: putstatic     #13                 // Field LOGGER:Ljava/util/logging/Logger;
        11: return
      LineNumberTable:
        line 27: 0
}
SourceFile: "RejectedExecutionHandlerImpl.java"
BootstrapMethods:
  0: #96 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #94 \u0001\u0001 from \u0001 \u0001
InnerClasses:
  public static final #107= #103 of #105; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
